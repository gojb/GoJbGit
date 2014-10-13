package gojbguide;


import java.util.*;

import javax.mail.*;
import javax.mail.internet.*;


class Mail {
	
	public static void main(String[] args) throws Exception {
		new Mail2();
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


		msg.setFrom( new InternetAddress( "GoJb<gojb@gojb.bl.ee>" ) );
		msg.setRecipients(Message.RecipientType.TO,InternetAddress.parse(Till));	
		msg.setSubject(Ämne);
		msg.setText(Meddelande);


		Transport.send( msg );

	}

}
	
class Mail2{



	public Mail2() throws Exception{
		Properties props = System.getProperties();
		props.setProperty("mail.store.protocol", "imaps");
		Session session = Session.getDefaultInstance(props, null);
	    System.out.println("Funkar");
		try {
		    Store store = session.getStore("imap");
		    store.connect("mx1.hostinger.se", "gojb@gojb.bl.ee", "uggen0684");

		    System.out.println("Funkar");
		    
		    Folder folder = store.getFolder("Inbox");
		    folder.open(Folder.READ_WRITE);
		    Message[] msgs = folder.getMessages();

		    for (Message msg : msgs) {
		    	if(msg.getSubject().contains("Användande")){
		    		
		    	msg.setFlag(Flags.Flag.DELETED, true);
		    		System.err.println(msg.getMessageNumber());
		        System.out.println(msg.getSubject());
		    }}
		    
		}catch(MessagingException e)    {
		    System.out.println(e);
		}
	}
}
