package gojbguide;

import javax.mail.*;
import javax.swing.JOptionPane;

public class TaEmotMail implements Runnable{

	public static void main(String[] args) {
		new Thread(new TaEmotMail()).start();
	}
	@Override
	public void run(){
		Session session = Session.getDefaultInstance(System.getProperties());
		System.out.println("Funkar");
		try {
			Store store = session.getStore("imap");
			store.connect("mx1.hostinger.se", "gojb@gojb.bl.ee", "uggen0684");

			System.out.println("Funkar");

			Folder folder = store.getFolder("Inbox");
			folder.open(Folder.READ_WRITE);
			Message[] msgs = folder.getMessages();

			for (int j = msgs.length-1; j > 0; j--) {
		
				Message msg = msgs[j];
//				System.out.println("---" + msg.getContent());;
				
				System.err.println("lerj");
				if(msg.isSet(Flags.Flag.SEEN)){
				System.out.println("SEEN");	
				}
				else {
				if(msg.getSubject().toString().contains(GoJb1.prop.getProperty("ID","sepå"))){
					msg.setFlag(Flags.Flag.SEEN, true);
					System.err.println(msg.getMessageNumber());
					System.out.println(msg.getSubject());
					System.err.println(msg.getContent());
					System.out.println();
					JOptionPane.showMessageDialog(GoJb1.frameHuvud, msg.getContent());
				}
				else{
					System.out.println("Nada");
				}
				}
			}

		}catch(Exception e)    {
			e.printStackTrace();
		}
	}
}
