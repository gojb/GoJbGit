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
		props.put("mail.smtp.host", "mx1.hostinger.se");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "2525");

		Session mailSession = Session.getInstance(props, new Authenticator() {

			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("gojb@gojb.bl.ee", "uggen0684");
			}
		});


		mailSession.setDebug(false); // Enable the debug mode

		Message msg = new MimeMessage( mailSession );


		msg.setFrom( new InternetAddress(GoJb1.prop.getProperty("ID") + "<gojb@gojb.bl.ee>" ) );
		msg.setRecipients(Message.RecipientType.TO,InternetAddress.parse(Till));	
		msg.setSubject(Ämne);
		msg.setText(Meddelande);

		System.err.println("--SKICKAT--");
		
		Transport.send( msg );

	}

}

