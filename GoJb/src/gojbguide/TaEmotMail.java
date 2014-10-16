package gojbguide;

import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;

public class TaEmotMail{

public static void main(String[] args) {
	try {
		new TaEmotMail();
	} catch (Exception e) {
		System.err.println("What?");
	}
}

	public TaEmotMail() throws Exception{
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
				System.err.println("lerj");
				if(msg.getSubject().contains(GoJb1.prop.getProperty("ID"))){

				
					System.err.println(msg.getMessageNumber());
					System.out.println(msg.getSubject());
					System.err.println(msg.getContent());
					System.out.println();
				}
			}

		}catch(MessagingException e)    {
			System.out.println(e);
		}
	}
}
