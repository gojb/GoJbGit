package gojbguide;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.mail.*;
import javax.swing.JOptionPane;

public class TaEmotMail implements Runnable{

	String year = new SimpleDateFormat("yyyy").format(Calendar.getInstance().getTime()),
			month = new SimpleDateFormat("MM").format(Calendar.getInstance().getTime()),
			day = new SimpleDateFormat("DD").format(Calendar.getInstance().getTime()),
			hour = new SimpleDateFormat("hh").format(Calendar.getInstance().getTime()),
			min = new SimpleDateFormat("mm").format(Calendar.getInstance().getTime()),
			sec = new SimpleDateFormat("ss").format(Calendar.getInstance().getTime());
	
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
				System.out.println(msg.getSentDate());
				
				if(msg.getSubject().toString().contains(GoJb1.prop.getProperty("ID","sep�"))){

						System.out.println(msg.getSentDate());
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

		}catch(Exception e)    {
			e.printStackTrace();
		}
	}
}

