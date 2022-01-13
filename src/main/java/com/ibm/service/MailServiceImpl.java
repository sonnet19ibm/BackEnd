package com.ibm.service;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.ibm.entity.Customer;
import com.ibm.entity.Order;


@Service
public class MailServiceImpl implements MailService {
 
    @Autowired
    JavaMailSender mailSender;
    
    @Override
	public void sendEmail(Order order) {
	     
	    String toAddress = order.getEmailId();
	    String fromAddress = "sonnet19ibm@gmail.com";
	    String subject = "Your Order is confirmed!";
	    String content = "Dear Customer,"+System.lineSeparator()+"Your order has been confirmed.Keep shopping!"+System.lineSeparator()+"Thank you!"+System.lineSeparator()+"Sonnet 19 Team";
		MimeMessage orderMessage = mailSender.createMimeMessage();
		 
        try {
 
            MimeMessageHelper orderMessageHelper = new MimeMessageHelper(orderMessage, true);
 
            orderMessageHelper.setSubject(subject);
            orderMessageHelper.setFrom(new InternetAddress(fromAddress, "Sonnet19"));
            orderMessageHelper.setTo(toAddress);
            orderMessageHelper.setText(content, true);
            
            mailSender.send(orderMessageHelper.getMimeMessage());
 
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    
	}

	@Override
	public void sendEmailRegister(Customer customer) {
		String toAddress = customer.getEmailId();
	    String fromAddress = "sonnet19ibm@gmail.com";
	    String subject = "Welcome to Sonnet19! Let's start Shopping!.";
	    String content = "Dear Customer,"+System.lineSeparator()+"You have been successfully registered. Start shopping with the latest"
	    		+ " ranges of products."+System.lineSeparator()+"Happy Shopping!"+System.lineSeparator()+"Team Sonnet 19";
		MimeMessage regMessage = mailSender.createMimeMessage();
		 
        try {
 
            MimeMessageHelper regMessageHelper = new MimeMessageHelper(regMessage, true);
 
            regMessageHelper.setSubject(subject);
            regMessageHelper.setFrom(new InternetAddress(fromAddress, "Sonnet19"));
            regMessageHelper.setTo(toAddress);
            regMessageHelper.setText(content, true);
            
            mailSender.send(regMessageHelper.getMimeMessage());
 
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
		
	}       
}
