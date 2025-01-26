/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.*;
import Controller.AllocateController;
import Service.AllocateService;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.util.Properties;
import java.util.Properties;  
import javax.mail.*;  
import javax.mail.internet.*;  

/**
 *
 * @author 94770
 */
public class AllocateController {
    private allocate alo1;
    private AllocateService all_Service;
    public AllocateController()
    {
        all_Service=new AllocateService();
    }
    
    
    public allocate addAllo(String orderId, String emo_id , String status)
    {
        alo1=new allocate(orderId,emo_id,status);
        return alo1;
    }
    public boolean addOrderToDB()
    {
        return all_Service.addOrder(alo1);
    }
    public void refreshTable(DefaultTableModel dftm,String query)
    {
        all_Service.RefreshTable(dftm,query);
    }
    public void email(String emo_id )
    {
        String receiver = all_Service.email(emo_id);
        String host="mail.javatpoint.com";  
        final String user="OOP@gmail.com";
        final String password="12345678";

        String to=receiver; 
  
         Properties props = new Properties();  
         props.put("mail.smtp.host",host);  
         props.put("mail.smtp.auth", "true");  

         Session session = Session.getDefaultInstance(props,  
          new javax.mail.Authenticator() {  
            protected PasswordAuthentication getPasswordAuthentication() {  
          return new PasswordAuthentication(user,password);  
            }  
          });  

          try {  
           MimeMessage message = new MimeMessage(session);  
           message.setFrom(new InternetAddress(user));  
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
           message.setSubject("Allocate Order");  
           message.setText("New order allocate for you");    
           Transport.send(message);  
 

           } catch (MessagingException e) {e.printStackTrace();} 
    }
}
