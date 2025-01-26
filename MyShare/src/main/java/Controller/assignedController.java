/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.*;
import Controller.assignedController;
import Service.assignedService;
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
public class assignedController {
     private assigned ass1;
    private assignedService ass_Service;
    public assignedController()
    {
        ass_Service=new assignedService();
    }
    
    
    public assigned addAllo(String orderId, String cus_id , String status)
    {
        ass1=new assigned(orderId,cus_id,status);
        return ass1;
    }
    public boolean addOrderToDB()
    {
        return ass_Service.addOrder(ass1);
    }
    public void refreshTable(DefaultTableModel dftm,String query)
    {
        ass_Service.RefreshTable(dftm,query);
    }
    public void email(String emo_id )
    {
        String receiver = ass_Service.email(emo_id);
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
           message.setSubject(" Order");  
           message.setText("Your order is complete");    
           Transport.send(message);  
 

           } catch (MessagingException e) {e.printStackTrace();} 
    }
    
}
