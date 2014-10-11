package gojbguide;


import java.util.*;

import javax.mail.*;
import javax.mail.internet.*;

class Mail {
	static void Skicka(String Till, String Ämne, String Meddelande) throws AddressException, MessagingException{

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



		Folder folder = null;
		Store store = null;
		String subject = null;
		try 
		{
			Properties props = System.getProperties();

			Session session = Session.getDefaultInstance(props, null);

			store = session.getStore("imap");
			store.connect("mx1.hostinger.se","gojb@gojb.bl.ee", "uggen0684");

			folder = store.getFolder("Inbox"); // This doesn't work for other email account
			//folder = (IMAPFolder) store.getFolder("inbox"); This works for both email account


			if(!folder.isOpen())
				folder.open(Folder.READ_WRITE);
			Message[] messages = folder.getMessages();
			System.out.println("No of Messages : " + folder.getMessageCount());
			System.out.println("No of Unread Messages : " + folder.getUnreadMessageCount());
			System.out.println(messages.length);
			for (int i=messages.length; i > -1 ;i--) 
			{

				System.out.println("*****************************************************************************");
				System.out.println("MESSAGE " + (i + 1) + ":");
				Message msg =  messages[i];
				//System.out.println(msg.getMessageNumber());
				//Object String;
				//System.out.println(folder.getUID(msg)

				subject = msg.getSubject();

				System.out.println("Subject: " + subject);
				System.out.println("From: " + msg.getFrom()[0]);
				System.out.println("To: "+msg.getAllRecipients()[0]);
				System.out.println("Date: "+msg.getReceivedDate());
				System.out.println("Size: "+msg.getSize());
				System.out.println(msg.getFlags());
				System.out.println("Body: \n"+ msg.getContent());
				System.out.println(msg.getContentType());

			} 		
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}



