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
		try {
			Store store = session.getStore("imap");
			store.connect("mx1.hostinger.se", "gojb@gojb.bl.ee", "uggen0684");

			System.out.println("--Tar emot Mail--");

			Folder folder = store.getFolder("Inbox");
			folder.open(Folder.READ_WRITE);
			Message[] msgs = folder.getMessages();

			for (Message msg:msgs){
				
				if(msg.getAllRecipients()[0].toString().contains(GoJbGuide.prop.getProperty("ID","sepå").toLowerCase())){
						if(!msg.isSet(Flags.Flag.SEEN)){
						msg.setFlag(Flags.Flag.SEEN, true);
						JOptionPane.showMessageDialog(GoJbGuide.frameHuvud, msg.getContent());
						}

				}
				else{
				}
			}

		}catch(Exception e)    {
			e.printStackTrace();
		}
	}
}

