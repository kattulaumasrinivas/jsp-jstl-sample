package com.uma.jsp.utils;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtilImpl implements IEmailUtil {

	@Autowired
	private JavaMailSender mailSender;
	@Override
	public void sendEmail(String toAddress, String subject, String body) {
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
		try {
			mimeMessageHelper.setTo(toAddress);
			mimeMessageHelper.setSubject(subject);
			mimeMessageHelper.setText(body);
			mailSender.send(mimeMessage);
			 
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		

	}

}
