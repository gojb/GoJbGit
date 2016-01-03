package gojbguide;


import java.util.*;

import javax.mail.*;
import javax.mail.internet.*;


class Mail {

	public static void main(String[] args) throws Exception {
		new Mail();
	}

	public static void Skicka(String Till, String Ämne, String Meddelande) throws AddressException, MessagingException{


		Properties props = new Properties();
		props.put("mail.smtp.host", "mail.gojb.tk");
		props.put("mail.smtp.port", "25");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.debug", "true");

		Session mailSession = Session.getInstance(props, new Authenticator() {

			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("gojb@gojb.tk", "uggen0684");
			}
		});


		mailSession.setDebug(true); // Enable the debug mode

		Message msg = new MimeMessage( mailSession );


		msg.setFrom( new InternetAddress(GoJbGuide.prop.getProperty("ID") + "<GoJb>" ) );
		msg.setRecipients(Message.RecipientType.TO,InternetAddress.parse("gojb@gojb.tk"));	
		msg.setSubject("dasds");
		msg.setText("asdadssd");
		
		Transport.send( msg );
		
		System.err.println("--SKICKAT--");

	}

}

