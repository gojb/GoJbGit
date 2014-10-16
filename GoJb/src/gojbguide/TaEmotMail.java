package gojbguide;

import java.util.Properties;

import javax.mail.*;

public class TaEmotMail implements Runnable{

	public static void main(String[] args) {
		new Thread(new TaEmotMail()).start();
	}
	@Override
	public void run(){
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

				if(msg.getSubject().toString().contains(GoJb1.prop.getProperty("ID","sepå"))){
					System.err.println(msg.getMessageNumber());
					System.out.println(msg.getSubject());
					System.err.println(msg.getContent());
					System.out.println();
				}
			}

		}catch(Exception e)    {
			e.printStackTrace();
		}
	}
}
