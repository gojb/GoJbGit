package fortest;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;

import javax.mail.MessagingException;
import javax.swing.*;
import javax.swing.Timer;
import javax.swing.event.*;

import gojbguide.*;
import static java.awt.Color.*;
import static javax.swing.JOptionPane.*;


/**
 * @author GoJb
 *
 *
 */

public class Start implements ActionListener, CaretListener{

	private static Properties prop = new Properties();

	private JButton svenska = new JButton("Svenska",new ImageIcon(getClass().getResource("/images/Swedish.jpg"))),
			engelska = new JButton("English",new ImageIcon(getClass().getResource("/images/Brittish.jpg")));

	private JMenuBar bar = new JMenuBar();

	private ArrayList<JButton> list = new ArrayList<JButton>();

	private JTextField text = new JTextField();

	private JTextArea area = new JTextArea(),
			label = new JTextArea();

	private Timer mailTimer = new Timer(1000, this);

	private JMenu språkMeny = new JMenu(),
			hjälpMenu = new JMenu("Hjälp");

	private JMenuItem 	väljSpråk = new JMenuItem(),
			helpItem = new JMenuItem("Hjälp"),
			ideasItem = new JMenuItem("Ideas/bugs");

	private JFrame[] frames = new JFrame[115];
	private JFrame frameHuvud = new JFrame("GoJbGuide"),
			språk = new JFrame("Language"),
			ideasFrame = new JFrame("Ideas");
	
	private URL[] iconStrings = {null,null,null,
	
          getClass().getResource("/images/3.png")
          ,null
          ,null
          ,null
			 ,getClass().getResource("/images/7.png")
			 ,getClass().getResource("/images/8.gif")
			 ,getClass().getResource("/images/9.png")
			,getClass().getResource("/images/10.png")
			,getClass().getResource("/images/11.gif")
			,getClass().getResource("/images/12.gif")
			,getClass().getResource("/images/13.gif")
			,getClass().getResource("/images/14.gif")
			,getClass().getResource("/images/15.png")
			,getClass().getResource("/images/16.png")
			,getClass().getResource("/images/17.png")
			,getClass().getResource("/images/18.png")
			,getClass().getResource("/images/19.png")
			,getClass().getResource("/images/20.png")
			,getClass().getResource("/images/21.png")
			,getClass().getResource("/images/22.gif")
			,getClass().getResource("/images/23.png")
			,getClass().getResource("/images/24.png")
			,getClass().getResource("/images/25.png")
			,getClass().getResource("/images/1010.gif")
			,getClass().getResource("/images/27.png")
			,getClass().getResource("/images/28.png")
			,getClass().getResource("/images/29.gif")
			,getClass().getResource("/images/30.png")
			,getClass().getResource("/images/31.png")
			,getClass().getResource("/images/32.png")
			,getClass().getResource("/images/33.png")
			,getClass().getResource("/images/34.png")
			,getClass().getResource("/images/35.png")
			,getClass().getResource("/images/36.png")
			,getClass().getResource("/images/37.png")
			,getClass().getResource("/images/38.png")
			,getClass().getResource("/images/39.png")
			,getClass().getResource("/images/40.png")
			,getClass().getResource("/images/41.png")
			,getClass().getResource("/images/42.png")
			,getClass().getResource("/images/43.gif")
			,getClass().getResource("/images/44.png")
			,getClass().getResource("/images/45.png")
			,getClass().getResource("/images/46.png")
			,getClass().getResource("/images/47.png")
			,getClass().getResource("/images/48.gif")
			,getClass().getResource("/images/49.gif")
			,getClass().getResource("/images/50.png")
			,getClass().getResource("/images/51.png")
			,getClass().getResource("/images/52.png")
			,getClass().getResource("/images/53.png")
			,getClass().getResource("/images/54.png")
			,getClass().getResource("/images/55.gif")
			,getClass().getResource("/images/56.png")
			,getClass().getResource("/images/57.png")
			,getClass().getResource("/images/58.png")
			,getClass().getResource("/images/59.png")
			,getClass().getResource("/images/60.gif")
			,getClass().getResource("/images/61.png")
			,getClass().getResource("/images/62.png")
			,getClass().getResource("/images/63.gif")
			,getClass().getResource("/images/64.gif")
			,getClass().getResource("/images/65.gif")
			,getClass().getResource("/images/66.gif")
			,getClass().getResource("/images/67.gif")
			,getClass().getResource("/images/68.gif")
			,getClass().getResource("/images/69.png")
			,getClass().getResource("/images/70.png")
			,getClass().getResource("/images/71.png")
			,getClass().getResource("/images/72.png")
			,getClass().getResource("/images/73.png")
			,getClass().getResource("/images/74.png")
			,getClass().getResource("/images/75.png")
			,getClass().getResource("/images/76.png")
			,getClass().getResource("/images/77.png")
			,getClass().getResource("/images/78.png")
			,getClass().getResource("/images/79.png")
			,getClass().getResource("/images/80.png")
			,getClass().getResource("/images/81.png")
			,getClass().getResource("/images/82.png")
			,getClass().getResource("/images/83.png")
			,getClass().getResource("/images/84.png")
			,getClass().getResource("/images/85.png")
			,getClass().getResource("/images/86.png")
			,getClass().getResource("/images/87.png")
			,getClass().getResource("/images/88.png")
			,getClass().getResource("/images/89.png")
			,null
			,getClass().getResource("/images/91.png")
			,getClass().getResource("/images/92.png")
			,getClass().getResource("/images/93.gif")
			,getClass().getResource("/images/94.png")
			,getClass().getResource("/images/95.png")
			,getClass().getResource("/images/96.png")
			,getClass().getResource("/images/97.png")
			,getClass().getResource("/images/98.png")
			,getClass().getResource("/images/99.png")
			,getClass().getResource("/images/100.png")
			,getClass().getResource("/images/101.png")
			,getClass().getResource("/images/102.png")
			,getClass().getResource("/images/103.png")
			,getClass().getResource("/images/104.png")
			,getClass().getResource("/images/105.png")
			,getClass().getResource("/images/106.png")
			,getClass().getResource("/images/107.png")
			,getClass().getResource("/images/108.png")
			,getClass().getResource("/images/109.png")
			,getClass().getResource("/images/110.png")
			,getClass().getResource("/images/111.png")
			,getClass().getResource("/images/112.png")
			,getClass().getResource("/images/113.png")
			,getClass().getResource("/images/114.png")};

	private JButton[] buttons = new JButton[frames.length];
	private JButton[][] frameButtons = new JButton[frames.length][10];
	
	private JButton
			skicka = new JButton("Send");

	private ImageIcon 	kullersten = new ImageIcon(getClass().getResource("/images/1.png")),
			rödsten = new ImageIcon(getClass().getResource("/images/2.png")),
			plankor = new ImageIcon(getClass().getResource("/images/3.png")),
			pilbåge = new ImageIcon(getClass().getResource("/images/68.gif")),
			tra = new ImageIcon(getClass().getResource("/images/200.png")),
			sand = new ImageIcon(getClass().getResource("/images/4.png")),
			ull = new ImageIcon(getClass().getResource("/images/1026.gif")),
			guld = new ImageIcon(getClass().getResource("/images/5.png")),
			pinne = new ImageIcon(getClass().getResource("/images/71.png")),
			tryckplatta = new ImageIcon(getClass().getResource("/images/30.png")),
			kolv = new ImageIcon(getClass().getResource("/images/14.gif")),
			slime = new ImageIcon(getClass().getResource("/images/1000.png")),
			tråd = new ImageIcon(getClass().getResource("/images/1001.png")),
			tegel = new ImageIcon(getClass().getResource("/images/1006.png")),
			krut = new ImageIcon(getClass().getResource("/images/1005.png")),
			järn = new ImageIcon(getClass().getResource("/images/6.png")),
			diamant = new ImageIcon(getClass().getResource("/images/1013.png")),
			snöboll = new ImageIcon(getClass().getResource("/images/1012.png")),
			obsidian = new ImageIcon(getClass().getResource("/images/1018.png")),
			enderöga = new ImageIcon(getClass().getResource("/images/103.png")),
			bok = new ImageIcon(getClass().getResource("/images/84.png")),
			papper = new ImageIcon(getClass().getResource("/images/83.png")),
			läder = new ImageIcon(getClass().getResource("/images/1032.png")),
			gruvvagn = new ImageIcon(getClass().getResource("/images/81.png")),
			hopper = new ImageIcon(getClass().getResource("/images/58.png")),
			kista = new ImageIcon(getClass().getResource("/images/22.gif")),
			ugn = new ImageIcon(getClass().getResource("/images/24.png")),
			färger = new ImageIcon(getClass().getResource("/images/90.gif")),
			raketstjärna = new ImageIcon(getClass().getResource("/images/111.png")),
			dynamit = new ImageIcon(getClass().getResource("/images/18.png")),
			block = new ImageIcon(getClass().getResource("/images/1008.gif")),
			socker = new ImageIcon(getClass().getResource("/images/91.png")),
			ägg = new ImageIcon(getClass().getResource("/images/1035.png")),
			pumpa = new ImageIcon(getClass().getResource("/images/1015.png")),
			kol = new ImageIcon(getClass().getResource("/images/1007.png")),
			morot = new ImageIcon(getClass().getResource("/images/1042.png")),
			fiskespö = new ImageIcon(getClass().getResource("/images/88.png")),
			guldklimp = new ImageIcon(getClass().getResource("/images/98.png")),
			järnträ = new ImageIcon(getClass().getResource("/images/1009.gif")),
			fjäder = new ImageIcon(getClass().getResource("/images/1030.png")),
			bläck = new ImageIcon(getClass().getResource("/images/1041.png")),
			tryck = new ImageIcon(getClass().getResource("/images/1011.gif")),
			melon = new ImageIcon(getClass().getResource("/images/1017.png")),
			blazepulver = new ImageIcon(getClass().getResource("/images/101.png")),
			blaze = new ImageIcon(getClass().getResource("/images/1019.png")),
			enderpärla = new ImageIcon(getClass().getResource("/images/1040.png")),
			svamp = new ImageIcon(getClass().getResource("/images/1039.png")),
			spindelöga = new ImageIcon(getClass().getResource("/images/1038.png")),
			glödstenspulver = new ImageIcon(getClass().getResource("/images/1014.png")),
			fackla = new ImageIcon(getClass().getResource("/images/20.png")),
			glas = new ImageIcon(getClass().getResource("/images/1016.png")),
			vete = new ImageIcon(getClass().getResource("/images/1028.png")),
			kakao = new ImageIcon(getClass().getResource("/images/1037.png")),
			kompass = new ImageIcon(getClass().getResource("/images/87.png")),
			sten = new ImageIcon(getClass().getResource("/images/1002.png")),
			rödstensfackla = new ImageIcon(getClass().getResource("/images/31.png")),
			mjölk = new ImageIcon(getClass().getResource("/images/1036.png")),
			färgglas = new ImageIcon(getClass().getResource("/images/1012.gif")),
			sockerrör = new ImageIcon(getClass().getResource("/images/1034.png")),
			glödstenslampa = new ImageIcon(getClass().getResource("/images/36.png")),
			äpple = new ImageIcon(getClass().getResource("/images/1033.png")),
			flinta = new ImageIcon(getClass().getResource("/images/1031.png")),
			järnStenTrä = new ImageIcon(getClass().getResource("/images/1029.gif")),
			nederstjärna = new ImageIcon(getClass().getResource("/images/1020.png")),
			järnblock = new ImageIcon(getClass().getResource("/images/1021.png")),
			trähalvblock = new ImageIcon(getClass().getResource("/images/1023.png")),
			nederkvarts = new ImageIcon(getClass().getResource("/images/1022.png")),
			material = new ImageIcon(getClass().getResource("/images/1027.gif")),
			snubbeltrådskrok = new ImageIcon(getClass().getResource("/images/49.gif"));

	private String traString = "",kullerString = "",rödString = "",sandString = "",guldString = "",
			slimesString = "",trådsString = "",tegelString = "",krutString = "",järnString = "",
			diamantString = "",snöbollString = "",obsidianString = "",lädersString = "",färgerString = "",
			pumpaString = "",äggString = "",kolString = "",morotString = "",järnelrträdString = "",
			fjäderString = "",bläckString = "",träjärnstenString = "",melonString = "",blazeString = "",
			spindelögaString = "",glasString = "",svampString = "",glödstenspulverString = "",
			veteString = "",kakaoString = "",stenString = "",sockerrörString = "",mjölkString = "",
			äppleString = "",flintaString = "",järnstenträString = "",nederstjärnaString = "",
			nederkvartString = "",materialString = "", enderString;

	private JPanel frame = new JPanel();

	private JScrollPane scrollBar=new JScrollPane(frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

	private static int namnInt;

	static String laddaString, cancelString, string, finishedString;
	private static String help, yString, namn = "", välkommen;

	private static Boolean mailSkickat,start = false;

	private static JProgressBar progressBar;

	private JFrame frame2 = new JFrame();
	private JLayeredPane layeredPane = new JLayeredPane();
	private JLabel background=new JLabel(new ImageIcon(getClass().getResource("/images/Mine.jpg")));
	private JLabel background1=new JLabel(),
			background2 = new JLabel();
	/**
9778436klbgflf=lhdohf7984
#Engelska
#lhdohf7984
#Svenska
#86325yhrel
	 */

	public void Språkfråga() {
		ActionListener dActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollBar.getVerticalScrollBar().setValue(0);
				if (e.getSource()==svenska) {
					prop.setProperty("9778436klbgflf", "86325yhrel");
					prop.setProperty("x", "1");
					SpråkVoid();
				}
				else if (e.getSource()==engelska) {
					prop.setProperty("9778436klbgflf", "lhdohf7984");
					SpråkVoid();
				}
				sparaProp();
				språk.dispose();
				Språk();
				frameHuvud.setVisible(true);
			}
		};

		språk.setLayout(new FlowLayout());
		språk.add(svenska);
		språk.add(engelska);
		språk.setAlwaysOnTop(true);
		språk.setIconImage(new ImageIcon(getClass().getResource("/images/Java-icon.png")).getImage());
		språk.pack();
		språk.setLocationRelativeTo(null);
		språk.setVisible(true);
		språk.setDefaultCloseOperation(3);

		svenska.addActionListener(dActionListener);
		engelska.addActionListener(dActionListener);
	}

	public void Språk(){
		try {
			if (prop.getProperty("9778436klbgflf").equals("86325yhrel")){

				//Svenska

				prop.setProperty("z", "86325yhrel");

				if (prop.getProperty("y","2").equals("10")) {

					yString = " Tack för att\n du använder det här programmet! :)";
				}
				else {
					yString = "";
				}

				help = "Hej! Det här programmet är programmerat av \n GoJbs Javaprogramering." + yString;

				språkMeny.setIcon(new ImageIcon(getClass().getResource("/images/Swedish.jpg")));

				System.out.println("Hej!");

				väljSpråk.setText("Språk");
				språkMeny.setText("Språk");

				hjälpMenu.setText("Hjälp");
				helpItem.setText("Hjälp");
				ideasItem.setText("Idéer/buggar");
     
				buttons[3].setText("Träplankor");
				buttons[7].setText("Automat");
				buttons[8].setText("Sandsten");
				buttons[9].setText("Notblock");
				buttons[10].setText("Säng");
				buttons[11].setText("Driven räls");
				buttons[12].setText("Sensorräls");
				buttons[13].setText("Klibbig kolv");
				buttons[14].setText("Kolv");
				buttons[15].setText("Ull");
				buttons[16].setText("Halvblock");
				buttons[17].setText("Tegelstensblock");
				buttons[18].setText("Dynamit");
				buttons[19].setText("Bokhylla");
				buttons[20].setText("Fackla");
				buttons[21].setText("Trappa");
				buttons[22].setText("Kista");
				buttons[23].setText("Arbetsbänk");
				buttons[24].setText("Ugn");
				buttons[25].setText("Skylt");
				buttons[26].setText("Dörr");
				buttons[27].setText("Stege");
				buttons[28].setText("Räls");
				buttons[29].setText("Spak");
				buttons[30].setText("Tryckplatta");
				buttons[31].setText("Rödstensfackla");
				buttons[32].setText("Knapp");
				buttons[33].setText("Snöblock");
				buttons[34].setText("Jukebox");
				buttons[35].setText("Staket");
				buttons[36].setText("Glödstenslampa");
				buttons[37].setText("Pumpalykta");
				buttons[38].setText("Färgat glas");
				buttons[39].setText("Fallucka");
				buttons[40].setText("Järngaller");
				buttons[41].setText("Fönster");
				buttons[42].setText("Melonblock");
				buttons[43].setText("Grind");
				buttons[44].setText("Trolleribänk");
				buttons[45].setText("Bryggeri");
				buttons[46].setText("Kittel");
				buttons[47].setText("Rödstenslampa");
				buttons[48].setText("Enderkista");
				buttons[49].setText("Slubbeltrådskrok");
				buttons[50].setText("Fyr");
				buttons[51].setText("Mur");
				buttons[52].setText("Kruka");
				buttons[53].setText("Städ");
				buttons[54].setText("Fällkista");
				buttons[55].setText("Rödstensjämförare");
				buttons[56].setText("Dagsljussensor");
				buttons[57].setText("Block");
				buttons[58].setText("Hopper");
				buttons[59].setText("Matta");
				buttons[60].setText("Aktiveringsräls");
				buttons[61].setText("Droppare");
				buttons[62].setText("Höbal");
				buttons[63].setText("Spade");
				buttons[64].setText("Yxa");
				buttons[65].setText("Hacka");
				buttons[66].setText("Svärd");
				buttons[67].setText("Flohacka");
				buttons[68].setText("Pilbåge");
				buttons[69].setText("Pil");
				buttons[70].setText("Flintstål");
				buttons[71].setText("Pinne");
				buttons[72].setText("Skål");
				buttons[73].setText("Bröd");
				buttons[74].setText("Hjälm");
				buttons[75].setText("Bröstplatta");
				buttons[76].setText("Byxor");
				buttons[77].setText("Skor");
				buttons[78].setText("Målning");
				buttons[79].setText("Gyllene Äpple");
				buttons[80].setText("Hink");
				buttons[81].setText("Gruvvagn");
				buttons[82].setText("Båt");
				buttons[83].setText("Papper");
				buttons[84].setText("Bok");
				buttons[85].setText("Gruvvagn med kista");
				buttons[86].setText("Gruvvagnslok");
				buttons[87].setText("Kompass");
				buttons[88].setText("Fiskespö");
				buttons[89].setText("Klocka");
				buttons[91].setText("Socker");
				buttons[92].setText("Tårta");
				buttons[93].setText("Rödstensrepeterare");
				buttons[94].setText("Kaka");
				buttons[95].setText("Karta");
				buttons[96].setText("Sax");
				buttons[97].setText("Melonfrön");
				buttons[98].setText("Guldklimp");
				buttons[99].setText("Glasflaska");
				buttons[100].setText("Jäst Spindelöga");
				buttons[101].setText("Blaze pulver");
				buttons[102].setText("Magma cremé");
				buttons[103].setText("Enderöga");
				buttons[104].setText("Guldmelon");
				buttons[105].setText("Bok ock fjäderpenna");
				buttons[106].setText("Föremålsram");
				buttons[107].setText("Guldmorot");
				buttons[108].setText("Morot på pinne");
				buttons[109].setText("Pumpapaj");
				buttons[110].setText("Raket");
				buttons[111].setText("Raketstärna");
				buttons[112].setText("Gruvvagn med dynamit");
				buttons[113].setText("Gruvvagn med hopper");
				buttons[114].setText("Koppel");

				sortera();

				traString = "Trä";
				kullerString = "Kullersten";
				rödString = "Rödsten";
				sandString = "Sandsten";
				guldString = "Guld";
				slimesString = "Slime";
				trådsString = "Tråd";
				tegelString = "Tegelsten";
				krutString = "Krut";
				järnString = "Järn";
				diamantString = "Diamant";
				snöbollString = "Snöboll";
				obsidianString = "Obsidian";
				lädersString = "Läder";
				färgerString = "Färger, Skapas t.ex. med blommor";
				pumpaString = "Pumpa";
				äggString = "Ägg";
				kolString = "Kol";
				morotString = "Morot";
				järnelrträdString = "Järn eller trä";
				fjäderString = "Fjäder";
				bläckString = "Bläck";
				träjärnstenString = "Sten, järn eller trä";
				melonString = "Melon";
				blazeString = "Blaze";
				spindelögaString = "Spindelöga";
				glasString = "Glas";
				svampString = "Svamp";
				glödstenspulverString = "Glödstenspulver";
				veteString = "Vete";
				kakaoString = "Kakao";
				stenString = "Sten";
				sockerrörString = "Sockerrör";
				mjölkString = "Mjölk";
				äppleString = "Äpple";
				flintaString = "Flinta";
				järnstenträString = "Järn, kullersten eller trä";
				nederstjärnaString = "Nederstjärna";
				nederkvartString = "Nederkvarts";
				materialString = "Material";
				enderString = "Enderpärla";

			}
			else if (prop.getProperty("9778436klbgflf").equals("lhdohf7984")){
				//Eng

				prop.setProperty("z", "lhdohf7984");

				if (prop.getProperty("y","2").equals("10")) {

					yString = " Thanks for \nusing this application! :)";

				}
				else {
					yString = "";
				}

				help = "Hello! This program is coded by\n GoJbs Javaprogramming." + yString;

				språkMeny.setIcon(new ImageIcon(getClass().getResource("/images/Brittish.jpg")));

				väljSpråk.setText("Language");
				språkMeny.setText("Language");

				hjälpMenu.setText("Help");
				helpItem.setText("Help");
				ideasItem.setText("Ideas/Bugs");

				buttons[3].setText("Planks");
				buttons[7].setText("Dispenser");
				buttons[8].setText("Sandstone");
				buttons[9].setText("Note Block");
				buttons[10].setText("Bed");
				buttons[11].setText("Powered Rail");
				buttons[12].setText("Detector Rail");
				buttons[13].setText("Sticky Piston");
				buttons[14].setText("Piston");
				buttons[15].setText("Wool");
				buttons[16].setText("Slab");
				buttons[17].setText("Bricks");
				buttons[18].setText("TNT");
				buttons[19].setText("Bookshelf");
				buttons[20].setText("Torch");
				buttons[21].setText("Stairs");
				buttons[22].setText("Chest");
				buttons[23].setText("Crafting Table");
				buttons[24].setText("Furnace");
				buttons[25].setText("Sign");
				buttons[26].setText("Door");
				buttons[27].setText("Ladder");
				buttons[28].setText("Rail");
				buttons[29].setText("Lever");
				buttons[30].setText("Pressure Plate");
				buttons[31].setText("Redstone Torch");
				buttons[32].setText("Button");
				buttons[33].setText("Snow Block");
				buttons[34].setText("Jukebox");
				buttons[35].setText("Fence");
				buttons[36].setText("Glowstone");
				buttons[37].setText("Jack-O-Lantern");
				buttons[38].setText("Stained Glass");
				buttons[39].setText("Trap Door");
				buttons[40].setText("Iron Bars");
				buttons[41].setText("Glass Pane");
				buttons[42].setText("Melon Block");
				buttons[43].setText("Fence Gate");
				buttons[44].setText("Enchantment Table");
				buttons[45].setText("Brewing Stand");
				buttons[46].setText("Cauldron");
				buttons[47].setText("Redstone Lamp");
				buttons[48].setText("Ender Chest");
				buttons[49].setText("Tripwire Hook");
				buttons[50].setText("Becon");
				buttons[51].setText("Cobblestone Wall");
				buttons[52].setText("Flower Pot");
				buttons[53].setText("Anvil");
				buttons[54].setText("Trapped Chest");
				buttons[55].setText("Redstone Comparator");
				buttons[56].setText("Daylight Sensor");
				buttons[57].setText("Block");
				buttons[58].setText("Hopper");
				buttons[59].setText("Carpet");
				buttons[60].setText("Activator Rail");
				buttons[61].setText("Dropper");
				buttons[62].setText("Hay Bales");
				buttons[63].setText("Shovel");
				buttons[64].setText("Axe");
				buttons[65].setText("Pickaxe");
				buttons[66].setText("Sword");
				buttons[67].setText("Hoe");
				buttons[68].setText("Bow");
				buttons[69].setText("Arrow");
				buttons[70].setText("Flint & Steel");
				buttons[71].setText("Stick");
				buttons[72].setText("Bowl");
				buttons[73].setText("Bread");
				buttons[74].setText("Helmet");
				buttons[75].setText("Chestplate");
				buttons[76].setText("Leggings");
				buttons[77].setText("Boots");
				buttons[78].setText("Painting");
				buttons[79].setText("Golden Apple");
				buttons[80].setText("Bucket");
				buttons[81].setText("Minecart");
				buttons[82].setText("Boat");
				buttons[83].setText("Paper");
				buttons[84].setText("Book");
				buttons[85].setText("Minecart with Chest");
				buttons[86].setText("Minecart with Furnace");
				buttons[87].setText("Compass");
				buttons[88].setText("Fishing Rod");
				buttons[89].setText("Clock");
				buttons[91].setText("Sugar");
				buttons[92].setText("Cake");
				buttons[93].setText("Redstone Repeter");
				buttons[94].setText("Cookie");
				buttons[95].setText("Map");
				buttons[96].setText("Shears");
				buttons[97].setText("Melon Seeds");
				buttons[98].setText("Gold nugget");
				buttons[99].setText("Glass Bottle");
				buttons[100].setText("Fermented Spider Eye");
				buttons[101].setText("Blaze Powder");
				buttons[102].setText("Magma Cream");
				buttons[103].setText("Eye Of Ender");
				buttons[104].setText("Glistering Melon");
				buttons[105].setText("Book & Quil");
				buttons[106].setText("Item Frame");
				buttons[107].setText("Golden Carrot");
				buttons[108].setText("Carrot On A Stick");
				buttons[109].setText("Pumpkin Pie");
				buttons[110].setText("Firework Rocket");
				buttons[111].setText("Firework Star");
				buttons[112].setText("Minecart With TNT");
				buttons[113].setText("Minecart With Hopper");
				buttons[114].setText("Lead");

				sortera();

				traString = "Wood";
				kullerString = "Cobblestone";
				rödString = "Redstone";
				sandString = "Sand";
				guldString = "Gold";
				slimesString = "Slime";
				trådsString = "String";
				tegelString = "Brick";
				krutString = "Gunpowder";
				järnString = "Iron";
				diamantString = "Diamond";
				snöbollString = "Snowball";
				obsidianString = "Obsidian";
				lädersString = "Leather";
				färgerString = "Dyes";
				pumpaString = "Pumpkin";
				äggString = "Egg";
				kolString = "Coal";
				morotString = "Carrot";
				järnelrträdString = "Wood or Iron";
				fjäderString = "Feather";
				bläckString = "Ink Sac";
				träjärnstenString = "Wood, Stone or Iron";
				melonString = "Melon";
				blazeString = "Blaze";
				spindelögaString = "Spider Eye";
				glasString = "Glass";
				svampString = "Mushrooms";
				glödstenspulverString = "Glowstone Dust";
				veteString = "Wheat";
				kakaoString = "Cocoa Beans";
				stenString = "Stone";
				sockerrörString = "Sugar Canes";
				mjölkString = "Milk";
				äppleString = "Apple";
				flintaString = "Flint";
				järnstenträString = "Wood, Cobblestone or Iron";
				nederstjärnaString = "Nether Star";
				nederkvartString = "Nether Quartz";
				materialString = "Elements (like Diamods, Iron etc)";
				enderString = "Ender Pearl";

			}
			else {
				throw new Exception();
			}
		} catch (Exception e) {
			Språkfråga();
		}

		for (int i = 3; i < buttons.length; i++) {
			if (i!=4&&i!=5&&i!=6&&i!=90) {
				frames[i].setTitle(buttons[i].getText());
			}
		}
		
	}
	void GörFönster() {

		scrollBar.getVerticalScrollBar().setUnitIncrement(20);
		
		frameHuvud.setIconImage(new ImageIcon(getClass().getResource("/images/Java-icon.png")).getImage());
		frameHuvud.setSize(800,700);
		frameHuvud.setLocationRelativeTo(null);
		frameHuvud.add(scrollBar);
		frameHuvud.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameHuvud.setJMenuBar(bar);
		
//		for (int i = 3; i < buttons.length; i++) {
//			if (i!=4&&i!=5&&i!=6&&i!=90) {
//				System.err.println(i);
//				icons[i]=new ImageIcon(iconStrings[i]);
//			}
//		}
		for (int i = 3; i < buttons.length; i++) {
			if (i!=4&&i!=5&&i!=6&&i!=90) {
				frames[i] = new JFrame();
				frames[i].setSize(500,500);
				frames[i].setLayout(new GridLayout(3,3));
				frames[i].setIconImage(frameHuvud.getIconImage());
				
				buttons[i] = new JButton();
				buttons[i].addActionListener(this);
				buttons[i].setVerticalTextPosition(JButton.BOTTOM);
				buttons[i].setHorizontalTextPosition(JButton.CENTER);
				System.err.println(iconStrings[i]);
				buttons[i].setIcon(new ImageIcon(iconStrings[i]));
				for (int j = 1; j < frameButtons[i].length; j++) {
					frameButtons[i][j] = new JButton();
					frames[i].add(frameButtons[i][j]);
				}
			}
		}
	}
	void ladda2(){
		frameButtons[3][1].setIcon(null);
		frameButtons[3][2].setIcon(null);
		frameButtons[3][3].setIcon(null);
		frameButtons[3][4].setIcon(null);
		frameButtons[3][5].setIcon(tra);
		frameButtons[3][6].setIcon(null);
		frameButtons[3][7].setIcon(null);
		frameButtons[3][8].setIcon(null);
		frameButtons[3][9].setIcon(null);
                     
		frameButtons[7][1].setIcon(kullersten);
		frameButtons[7][2].setIcon(kullersten);
		frameButtons[7][3].setIcon(kullersten);
		frameButtons[7][4].setIcon(kullersten);
		frameButtons[7][5].setIcon(pilbåge);
		frameButtons[7][6].setIcon(kullersten);
		frameButtons[7][7].setIcon(kullersten);
		frameButtons[7][8].setIcon(rödsten);
		frameButtons[7][9].setIcon(kullersten);
                     
		frameButtons[8][1].setIcon(sand);
		frameButtons[8][2].setIcon(sand);
		frameButtons[8][3].setIcon(null);
		frameButtons[8][4].setIcon(sand);
		frameButtons[8][5].setIcon(sand);
		frameButtons[8][6].setIcon(null);
		frameButtons[8][7].setIcon(null);
		frameButtons[8][8].setIcon(null);
		frameButtons[8][9].setIcon(null);
                     
		frameButtons[9][1].setIcon(plankor);
		frameButtons[9][2].setIcon(plankor);
		frameButtons[9][3].setIcon(plankor);
		frameButtons[9][4].setIcon(plankor);
		frameButtons[9][5].setIcon(rödsten);
		frameButtons[9][6].setIcon(plankor);
		frameButtons[9][7].setIcon(plankor);
		frameButtons[9][8].setIcon(plankor);
		frameButtons[9][9].setIcon(plankor);

		frameButtons[10][1].setIcon(null);
		frameButtons[10][2].setIcon(null);
		frameButtons[10][3].setIcon(null);
		frameButtons[10][4].setIcon(ull);
		frameButtons[10][5].setIcon(ull);
		frameButtons[10][6].setIcon(ull);
		frameButtons[10][7].setIcon(plankor);
		frameButtons[10][8].setIcon(plankor);
		frameButtons[10][9].setIcon(plankor);
                      
		frameButtons[11][1].setIcon(guld);
		frameButtons[11][2].setIcon(null);
		frameButtons[11][3].setIcon(guld);
		frameButtons[11][4].setIcon(guld);
		frameButtons[11][5].setIcon(pinne);
		frameButtons[11][6].setIcon(guld);
		frameButtons[11][7].setIcon(guld);
		frameButtons[11][8].setIcon(rödsten);
		frameButtons[11][9].setIcon(guld);
                      
		frameButtons[12][1].setIcon(pinne);
		frameButtons[12][2].setIcon(null);
		frameButtons[12][3].setIcon(pinne);
		frameButtons[12][4].setIcon(pinne);
		frameButtons[12][5].setIcon(tryckplatta);
		frameButtons[12][6].setIcon(pinne);
		frameButtons[12][7].setIcon(pinne);
		frameButtons[12][8].setIcon(rödsten);
		frameButtons[12][9].setIcon(pinne);
                      
		frameButtons[13][1].setIcon(null);
		frameButtons[13][2].setIcon(null);
		frameButtons[13][3].setIcon(null);
		frameButtons[13][4].setIcon(null);
		frameButtons[13][5].setIcon(slime);
		frameButtons[13][6].setIcon(null);
		frameButtons[13][7].setIcon(null);
		frameButtons[13][8].setIcon(kolv);
		frameButtons[13][9].setIcon(null);
                      
		frameButtons[14][1].setIcon(plankor);
		frameButtons[14][2].setIcon(plankor);
		frameButtons[14][3].setIcon(plankor);
		frameButtons[14][4].setIcon(kullersten);
		frameButtons[14][5].setIcon(järn);
		frameButtons[14][6].setIcon(kullersten);
		frameButtons[14][7].setIcon(kullersten);
		frameButtons[14][8].setIcon(rödsten);
		frameButtons[14][9].setIcon(kullersten);
                      
		frameButtons[15][1].setIcon(null);
		frameButtons[15][2].setIcon(null);
		frameButtons[15][3].setIcon(null);
		frameButtons[15][4].setIcon(tråd);
		frameButtons[15][5].setIcon(tråd);
		frameButtons[15][6].setIcon(null);
		frameButtons[15][7].setIcon(tråd);
		frameButtons[15][8].setIcon(tråd);
		frameButtons[15][9].setIcon(null);
                      
		frameButtons[16][1].setIcon(null);
		frameButtons[16][2].setIcon(null);
		frameButtons[16][3].setIcon(null);
		frameButtons[16][4].setIcon(null);
		frameButtons[16][5].setIcon(null);
		frameButtons[16][6].setIcon(null);
		frameButtons[16][7].setIcon(block);
		frameButtons[16][8].setIcon(block);
		frameButtons[16][9].setIcon(block);
                      
		frameButtons[17][1].setIcon(null);
		frameButtons[17][2].setIcon(null);
		frameButtons[17][3].setIcon(null);
		frameButtons[17][4].setIcon(tegel);
		frameButtons[17][5].setIcon(tegel);
		frameButtons[17][6].setIcon(null);
		frameButtons[17][7].setIcon(tegel);
		frameButtons[17][8].setIcon(tegel);
		frameButtons[17][9].setIcon(null);
                      
		frameButtons[18][1].setIcon(krut);
		frameButtons[18][2].setIcon(sand);
		frameButtons[18][3].setIcon(krut);
		frameButtons[18][4].setIcon(sand);
		frameButtons[18][5].setIcon(krut);
		frameButtons[18][6].setIcon(sand);
		frameButtons[18][7].setIcon(krut);
		frameButtons[18][8].setIcon(sand);
		frameButtons[18][9].setIcon(krut);
                      
		frameButtons[19][1].setIcon(plankor);
		frameButtons[19][2].setIcon(plankor);
		frameButtons[19][3].setIcon(plankor);
		frameButtons[19][4].setIcon(bok);
		frameButtons[19][5].setIcon(bok);
		frameButtons[19][6].setIcon(bok);
		frameButtons[19][7].setIcon(plankor);
		frameButtons[19][8].setIcon(plankor);
		frameButtons[19][9].setIcon(plankor);
                      
		frameButtons[20][1].setIcon(null);
		frameButtons[20][2].setIcon(null);
		frameButtons[20][3].setIcon(null);
		frameButtons[20][4].setIcon(null);
		frameButtons[20][5].setIcon(kol);
		frameButtons[20][6].setIcon(null);
		frameButtons[20][7].setIcon(null);
		frameButtons[20][8].setIcon(pinne);
		frameButtons[20][9].setIcon(null);
                      
		frameButtons[21][1].setIcon(null);
		frameButtons[21][2].setIcon(null);
		frameButtons[21][3].setIcon(block);
		frameButtons[21][4].setIcon(null);
		frameButtons[21][5].setIcon(block);
		frameButtons[21][6].setIcon(block);
		frameButtons[21][7].setIcon(block);
		frameButtons[21][8].setIcon(block);
		frameButtons[21][9].setIcon(block);
                      
		frameButtons[22][1].setIcon(plankor);
		frameButtons[22][2].setIcon(plankor);
		frameButtons[22][3].setIcon(plankor);
		frameButtons[22][4].setIcon(plankor);
		frameButtons[22][5].setIcon(null);
		frameButtons[22][6].setIcon(plankor);
		frameButtons[22][7].setIcon(plankor);
		frameButtons[22][8].setIcon(plankor);
		frameButtons[22][9].setIcon(plankor);
                      
		frameButtons[23][1].setIcon(plankor);
		frameButtons[23][2].setIcon(plankor);
		frameButtons[23][3].setIcon(null);
		frameButtons[23][4].setIcon(plankor);
		frameButtons[23][5].setIcon(plankor);
		frameButtons[23][6].setIcon(null);
		frameButtons[23][7].setIcon(null);
		frameButtons[23][8].setIcon(null);
		frameButtons[23][9].setIcon(null);
                      
		frameButtons[24][1].setIcon(kullersten);
		frameButtons[24][2].setIcon(kullersten);
		frameButtons[24][3].setIcon(kullersten);
		frameButtons[24][4].setIcon(kullersten);
		frameButtons[24][5].setIcon(kullersten);
		frameButtons[24][6].setIcon(kullersten);
		frameButtons[24][7].setIcon(kullersten);
		frameButtons[24][8].setIcon(kullersten);
		frameButtons[24][9].setIcon(kullersten);
                      
		frameButtons[25][1].setIcon(plankor);
		frameButtons[25][2].setIcon(plankor);
		frameButtons[25][3].setIcon(plankor);
		frameButtons[25][4].setIcon(plankor);
		frameButtons[25][5].setIcon(plankor);
		frameButtons[25][6].setIcon(plankor);
		frameButtons[25][7].setIcon(null);
		frameButtons[25][8].setIcon(pinne);
		frameButtons[25][9].setIcon(null);
                      
		frameButtons[26][1].setIcon(järnträ);
		frameButtons[26][2].setIcon(järnträ);
		frameButtons[26][3].setIcon(null);
		frameButtons[26][4].setIcon(järnträ);
		frameButtons[26][5].setIcon(järnträ);
		frameButtons[26][6].setIcon(null);
		frameButtons[26][7].setIcon(järnträ);
		frameButtons[26][8].setIcon(järnträ);
		frameButtons[26][9].setIcon(null);
                      
		frameButtons[27][1].setIcon(pinne);
		frameButtons[27][2].setIcon(null);
		frameButtons[27][3].setIcon(pinne);
		frameButtons[27][4].setIcon(pinne);
		frameButtons[27][5].setIcon(pinne);
		frameButtons[27][6].setIcon(pinne);
		frameButtons[27][7].setIcon(pinne);
		frameButtons[27][8].setIcon(null);
		frameButtons[27][9].setIcon(pinne);
                      
		frameButtons[28][1].setIcon(pinne);
		frameButtons[28][2].setIcon(null);
		frameButtons[28][3].setIcon(pinne);
		frameButtons[28][4].setIcon(pinne);
		frameButtons[28][5].setIcon(järn);
		frameButtons[28][6].setIcon(pinne);
		frameButtons[28][7].setIcon(pinne);
		frameButtons[28][8].setIcon(null);
		frameButtons[28][9].setIcon(pinne);
                      
		frameButtons[29][1].setIcon(null);
		frameButtons[29][2].setIcon(pinne);
		frameButtons[29][3].setIcon(null);
		frameButtons[29][4].setIcon(null);
		frameButtons[29][5].setIcon(kullersten);
		frameButtons[29][6].setIcon(null);
		frameButtons[29][7].setIcon(null);
		frameButtons[29][8].setIcon(null);
		frameButtons[29][9].setIcon(null);
                      
		frameButtons[30][1].setIcon(null);
		frameButtons[30][2].setIcon(null);
		frameButtons[30][3].setIcon(null);
		frameButtons[30][4].setIcon(null);
		frameButtons[30][5].setIcon(null);
		frameButtons[30][6].setIcon(null);
		frameButtons[30][7].setIcon(null);
		frameButtons[30][8].setIcon(tryck);
		frameButtons[30][9].setIcon(tryck);
                      
		frameButtons[31][1].setIcon(null);
		frameButtons[31][2].setIcon(rödsten);
		frameButtons[31][3].setIcon(null);
		frameButtons[31][4].setIcon(null);
		frameButtons[31][5].setIcon(pinne);
		frameButtons[31][6].setIcon(null);
		frameButtons[31][7].setIcon(null);
		frameButtons[31][8].setIcon(null);
		frameButtons[31][9].setIcon(null);
                      
		frameButtons[32][1].setIcon(null);
		frameButtons[32][2].setIcon(null);
		frameButtons[32][3].setIcon(null);
		frameButtons[32][4].setIcon(null);
		frameButtons[32][5].setIcon(plankor);
		frameButtons[32][6].setIcon(null);
		frameButtons[32][7].setIcon(null);
		frameButtons[32][8].setIcon(null);
		frameButtons[32][9].setIcon(null);
                      
		frameButtons[33][1].setIcon(snöboll);
		frameButtons[33][2].setIcon(snöboll);
		frameButtons[33][3].setIcon(null);
		frameButtons[33][4].setIcon(snöboll);
		frameButtons[33][5].setIcon(snöboll);
		frameButtons[33][6].setIcon(null);
		frameButtons[33][7].setIcon(null);
		frameButtons[33][8].setIcon(null);
		frameButtons[33][9].setIcon(null);
                      
		frameButtons[34][1].setIcon(plankor);
		frameButtons[34][2].setIcon(plankor);
		frameButtons[34][3].setIcon(plankor);
		frameButtons[34][4].setIcon(plankor);
		frameButtons[34][5].setIcon(diamant);
		frameButtons[34][6].setIcon(plankor);
		frameButtons[34][7].setIcon(plankor);
		frameButtons[34][8].setIcon(plankor);
		frameButtons[34][9].setIcon(plankor);
                      
		frameButtons[35][1].setIcon(null);
		frameButtons[35][2].setIcon(null);
		frameButtons[35][3].setIcon(null);
		frameButtons[35][4].setIcon(pinne);
		frameButtons[35][5].setIcon(pinne);
		frameButtons[35][6].setIcon(pinne);
		frameButtons[35][7].setIcon(pinne);
		frameButtons[35][8].setIcon(pinne);
		frameButtons[35][9].setIcon(pinne);
                      
		frameButtons[36][1].setIcon(null);
		frameButtons[36][2].setIcon(null);
		frameButtons[36][3].setIcon(null);
		frameButtons[36][4].setIcon(glödstenspulver);
		frameButtons[36][5].setIcon(glödstenspulver);
		frameButtons[36][6].setIcon(null);
		frameButtons[36][7].setIcon(glödstenspulver);
		frameButtons[36][8].setIcon(glödstenspulver);
		frameButtons[36][9].setIcon(null);
                      
		frameButtons[37][1].setIcon(null);
		frameButtons[37][2].setIcon(null);
		frameButtons[37][3].setIcon(null);
		frameButtons[37][4].setIcon(null);
		frameButtons[37][5].setIcon(pumpa);
		frameButtons[37][6].setIcon(null);
		frameButtons[37][7].setIcon(null);
		frameButtons[37][8].setIcon(fackla);
		frameButtons[37][9].setIcon(null);
                      
		frameButtons[38][1].setIcon(glas);
		frameButtons[38][2].setIcon(glas);
		frameButtons[38][3].setIcon(glas);
		frameButtons[38][4].setIcon(glas);
		frameButtons[38][5].setIcon(färger);
		frameButtons[38][6].setIcon(glas);
		frameButtons[38][7].setIcon(glas);
		frameButtons[38][8].setIcon(glas);
		frameButtons[38][9].setIcon(glas);
                      
		frameButtons[39][1].setIcon(null);
		frameButtons[39][2].setIcon(null);
		frameButtons[39][3].setIcon(null);
		frameButtons[39][4].setIcon(plankor);
		frameButtons[39][5].setIcon(plankor);
		frameButtons[39][6].setIcon(plankor);
		frameButtons[39][7].setIcon(plankor);
		frameButtons[39][8].setIcon(plankor);
		frameButtons[39][9].setIcon(plankor);
                      
		frameButtons[40][1].setIcon(null);
		frameButtons[40][2].setIcon(null);
		frameButtons[40][3].setIcon(null);
		frameButtons[40][4].setIcon(järn);
		frameButtons[40][5].setIcon(järn);
		frameButtons[40][6].setIcon(järn);
		frameButtons[40][7].setIcon(järn);
		frameButtons[40][8].setIcon(järn);
		frameButtons[40][9].setIcon(järn);
                      
		frameButtons[41][1].setIcon(null);
		frameButtons[41][2].setIcon(null);
		frameButtons[41][3].setIcon(null);
		frameButtons[41][4].setIcon(färgglas);
		frameButtons[41][5].setIcon(färgglas);
		frameButtons[41][6].setIcon(färgglas);
		frameButtons[41][7].setIcon(färgglas);
		frameButtons[41][8].setIcon(färgglas);
		frameButtons[41][9].setIcon(färgglas);
                      
		frameButtons[42][1].setIcon(melon);
		frameButtons[42][2].setIcon(melon);
		frameButtons[42][3].setIcon(melon);
		frameButtons[42][4].setIcon(melon);
		frameButtons[42][5].setIcon(melon);
		frameButtons[42][6].setIcon(melon);
		frameButtons[42][7].setIcon(melon);
		frameButtons[42][8].setIcon(melon);
		frameButtons[42][9].setIcon(melon);
                      
		frameButtons[43][1].setIcon(null);
		frameButtons[43][2].setIcon(null);
		frameButtons[43][3].setIcon(null);
		frameButtons[43][4].setIcon(pinne);
		frameButtons[43][5].setIcon(plankor);
		frameButtons[43][6].setIcon(pinne);
		frameButtons[43][7].setIcon(pinne);
		frameButtons[43][8].setIcon(plankor);
		frameButtons[43][9].setIcon(pinne);
                      
		frameButtons[44][1].setIcon(null);
		frameButtons[44][2].setIcon(bok);
		frameButtons[44][3].setIcon(null);
		frameButtons[44][4].setIcon(diamant);
		frameButtons[44][5].setIcon(obsidian);
		frameButtons[44][6].setIcon(diamant);
		frameButtons[44][7].setIcon(obsidian);
		frameButtons[44][8].setIcon(obsidian);
		frameButtons[44][9].setIcon(obsidian);
                      
		frameButtons[45][1].setIcon(null);
		frameButtons[45][2].setIcon(null);
		frameButtons[45][3].setIcon(null);
		frameButtons[45][4].setIcon(null);
		frameButtons[45][5].setIcon(blaze);
		frameButtons[45][6].setIcon(null);
		frameButtons[45][7].setIcon(kullersten);
		frameButtons[45][8].setIcon(kullersten);
		frameButtons[45][9].setIcon(kullersten);
                      
		frameButtons[46][1].setIcon(järn);
		frameButtons[46][2].setIcon(null);
		frameButtons[46][3].setIcon(järn);
		frameButtons[46][4].setIcon(järn);
		frameButtons[46][5].setIcon(null);
		frameButtons[46][6].setIcon(järn);
		frameButtons[46][7].setIcon(järn);
		frameButtons[46][8].setIcon(järn);
		frameButtons[46][9].setIcon(järn);
                      
		frameButtons[47][1].setIcon(null);
		frameButtons[47][2].setIcon(rödsten);
		frameButtons[47][3].setIcon(null);
		frameButtons[47][4].setIcon(rödsten);
		frameButtons[47][5].setIcon(glödstenslampa);
		frameButtons[47][6].setIcon(rödsten);
		frameButtons[47][7].setIcon(null);
		frameButtons[47][8].setIcon(rödsten);
		frameButtons[47][9].setIcon(null);
                      
		frameButtons[48][1].setIcon(obsidian);
		frameButtons[48][2].setIcon(obsidian);
		frameButtons[48][3].setIcon(obsidian);
		frameButtons[48][4].setIcon(obsidian);
		frameButtons[48][5].setIcon(enderöga);
		frameButtons[48][6].setIcon(obsidian);
		frameButtons[48][7].setIcon(obsidian);
		frameButtons[48][8].setIcon(obsidian);
		frameButtons[48][9].setIcon(obsidian);
                      
		frameButtons[49][1].setIcon(null);
		frameButtons[49][2].setIcon(järn);
		frameButtons[49][3].setIcon(null);
		frameButtons[49][4].setIcon(null);
		frameButtons[49][5].setIcon(pinne);
		frameButtons[49][6].setIcon(null);
		frameButtons[49][7].setIcon(null);
		frameButtons[49][8].setIcon(plankor);
		frameButtons[49][9].setIcon(null);
                      
		frameButtons[50][1].setIcon(glas);
		frameButtons[50][2].setIcon(glas);
		frameButtons[50][3].setIcon(glas);
		frameButtons[50][4].setIcon(glas);
		frameButtons[50][5].setIcon(nederstjärna);
		frameButtons[50][6].setIcon(glas);
		frameButtons[50][7].setIcon(obsidian);
		frameButtons[50][8].setIcon(obsidian);
		frameButtons[50][9].setIcon(obsidian);
                      
		frameButtons[51][1].setIcon(null);
		frameButtons[51][2].setIcon(null);
		frameButtons[51][3].setIcon(null);
		frameButtons[51][4].setIcon(kullersten);
		frameButtons[51][5].setIcon(kullersten);
		frameButtons[51][6].setIcon(kullersten);
		frameButtons[51][7].setIcon(kullersten);
		frameButtons[51][8].setIcon(kullersten);
		frameButtons[51][9].setIcon(kullersten);
                      
		frameButtons[52][1].setIcon(null);
		frameButtons[52][2].setIcon(null);
		frameButtons[52][3].setIcon(null);
		frameButtons[52][4].setIcon(tegel);
		frameButtons[52][5].setIcon(null);
		frameButtons[52][6].setIcon(tegel);
		frameButtons[52][7].setIcon(null);
		frameButtons[52][8].setIcon(tegel);
		frameButtons[52][9].setIcon(null);
                      
		frameButtons[53][1].setIcon(järnblock);
		frameButtons[53][2].setIcon(järnblock);
		frameButtons[53][3].setIcon(järnblock);
		frameButtons[53][4].setIcon(null);
		frameButtons[53][5].setIcon(järn);
		frameButtons[53][6].setIcon(null);
		frameButtons[53][7].setIcon(järn);
		frameButtons[53][8].setIcon(järn);
		frameButtons[53][9].setIcon(järn);
                      
		frameButtons[54][1].setIcon(null);
		frameButtons[54][2].setIcon(null);
		frameButtons[54][3].setIcon(null);
		frameButtons[54][4].setIcon(snubbeltrådskrok);
		frameButtons[54][5].setIcon(kista);
		frameButtons[54][6].setIcon(null);
		frameButtons[54][7].setIcon(null);
		frameButtons[54][8].setIcon(null);
		frameButtons[54][9].setIcon(null);
                      
		frameButtons[55][1].setIcon(null);
		frameButtons[55][2].setIcon(rödsten);
		frameButtons[55][3].setIcon(null);
		frameButtons[55][4].setIcon(rödsten);
		frameButtons[55][5].setIcon(nederkvarts);
		frameButtons[55][6].setIcon(rödsten);
		frameButtons[55][7].setIcon(sten);
		frameButtons[55][8].setIcon(sten);
		frameButtons[55][9].setIcon(sten);
                      
		frameButtons[56][1].setIcon(glas);
		frameButtons[56][2].setIcon(glas);
		frameButtons[56][3].setIcon(glas);
		frameButtons[56][4].setIcon(nederkvarts);
		frameButtons[56][5].setIcon(nederkvarts);
		frameButtons[56][6].setIcon(nederkvarts);
		frameButtons[56][7].setIcon(trähalvblock);
		frameButtons[56][8].setIcon(trähalvblock);
		frameButtons[56][9].setIcon(trähalvblock);
                      
		frameButtons[57][1].setIcon(material);
		frameButtons[57][2].setIcon(material);
		frameButtons[57][3].setIcon(material);
		frameButtons[57][4].setIcon(material);
		frameButtons[57][5].setIcon(material);
		frameButtons[57][6].setIcon(material);
		frameButtons[57][7].setIcon(material);
		frameButtons[57][8].setIcon(material);
		frameButtons[57][9].setIcon(material);
                      
		frameButtons[58][1].setIcon(järn);
		frameButtons[58][2].setIcon(null);
		frameButtons[58][3].setIcon(järn);
		frameButtons[58][4].setIcon(järn);
		frameButtons[58][5].setIcon(kista);
		frameButtons[58][6].setIcon(järn);
		frameButtons[58][7].setIcon(null);
		frameButtons[58][8].setIcon(järn);
		frameButtons[58][9].setIcon(null);
                      
		frameButtons[59][1].setIcon(null);
		frameButtons[59][2].setIcon(ull);
		frameButtons[59][3].setIcon(null);
		frameButtons[59][4].setIcon(null);
		frameButtons[59][5].setIcon(null);
		frameButtons[59][6].setIcon(null);
		frameButtons[59][7].setIcon(null);
		frameButtons[59][8].setIcon(null);
		frameButtons[59][9].setIcon(null);
                      
		frameButtons[60][1].setIcon(järn);
		frameButtons[60][2].setIcon(pinne);
		frameButtons[60][3].setIcon(järn);
		frameButtons[60][4].setIcon(järn);
		frameButtons[60][5].setIcon(rödstensfackla);
		frameButtons[60][6].setIcon(järn);
		frameButtons[60][7].setIcon(järn);
		frameButtons[60][8].setIcon(pinne);
		frameButtons[60][9].setIcon(järn);
                      
		frameButtons[61][1].setIcon(kullersten);
		frameButtons[61][2].setIcon(kullersten);
		frameButtons[61][3].setIcon(kullersten);
		frameButtons[61][4].setIcon(kullersten);
		frameButtons[61][5].setIcon(null);
		frameButtons[61][6].setIcon(kullersten);
		frameButtons[61][7].setIcon(kullersten);
		frameButtons[61][8].setIcon(rödsten);
		frameButtons[61][9].setIcon(kullersten);
                      
		frameButtons[62][1].setIcon(vete);
		frameButtons[62][2].setIcon(vete);
		frameButtons[62][3].setIcon(vete);
		frameButtons[62][4].setIcon(vete);
		frameButtons[62][5].setIcon(vete);
		frameButtons[62][6].setIcon(vete);
		frameButtons[62][7].setIcon(vete);
		frameButtons[62][8].setIcon(vete);
		frameButtons[62][9].setIcon(vete);
                      
		frameButtons[63][1].setIcon(null);
		frameButtons[63][2].setIcon(järnStenTrä);
		frameButtons[63][3].setIcon(null);
		frameButtons[63][4].setIcon(null);
		frameButtons[63][5].setIcon(pinne);
		frameButtons[63][6].setIcon(null);
		frameButtons[63][7].setIcon(null);
		frameButtons[63][8].setIcon(pinne);
		frameButtons[63][9].setIcon(null);
                      
		frameButtons[64][1].setIcon(järnStenTrä);
		frameButtons[64][2].setIcon(järnStenTrä);
		frameButtons[64][3].setIcon(null);
		frameButtons[64][4].setIcon(järnStenTrä);
		frameButtons[64][5].setIcon(pinne);
		frameButtons[64][6].setIcon(null);
		frameButtons[64][7].setIcon(null);
		frameButtons[64][8].setIcon(pinne);
		frameButtons[64][9].setIcon(null);
                      
		frameButtons[65][1].setIcon(järnStenTrä);
		frameButtons[65][2].setIcon(järnStenTrä);
		frameButtons[65][3].setIcon(järnStenTrä);
		frameButtons[65][4].setIcon(null);
		frameButtons[65][5].setIcon(pinne);
		frameButtons[65][6].setIcon(null);
		frameButtons[65][7].setIcon(null);
		frameButtons[65][8].setIcon(pinne);
		frameButtons[65][9].setIcon(null);
                      
		frameButtons[66][1].setIcon(null);
		frameButtons[66][2].setIcon(järnStenTrä);
		frameButtons[66][3].setIcon(null);
		frameButtons[66][4].setIcon(null);
		frameButtons[66][5].setIcon(järnStenTrä);
		frameButtons[66][6].setIcon(null);
		frameButtons[66][7].setIcon(null);
		frameButtons[66][8].setIcon(pinne);
		frameButtons[66][9].setIcon(null);
                      
		frameButtons[67][1].setIcon(järnStenTrä);
		frameButtons[67][2].setIcon(järnStenTrä);
		frameButtons[67][3].setIcon(null);
		frameButtons[67][4].setIcon(null);
		frameButtons[67][5].setIcon(pinne);
		frameButtons[67][6].setIcon(null);
		frameButtons[67][7].setIcon(null);
		frameButtons[67][8].setIcon(pinne);
		frameButtons[67][9].setIcon(null);
                      
		frameButtons[68][1].setIcon(null);
		frameButtons[68][2].setIcon(pinne);
		frameButtons[68][3].setIcon(tråd);
		frameButtons[68][4].setIcon(pinne);
		frameButtons[68][5].setIcon(null);
		frameButtons[68][6].setIcon(tråd);
		frameButtons[68][7].setIcon(null);
		frameButtons[68][8].setIcon(pinne);
		frameButtons[68][9].setIcon(tråd);
                      
		frameButtons[69][1].setIcon(null);
		frameButtons[69][2].setIcon(flinta);
		frameButtons[69][3].setIcon(null);
		frameButtons[69][4].setIcon(null);
		frameButtons[69][5].setIcon(fjäder);
		frameButtons[69][6].setIcon(null);
		frameButtons[69][7].setIcon(null);
		frameButtons[69][8].setIcon(pinne);
		frameButtons[69][9].setIcon(null);
                      
		frameButtons[70][1].setIcon(null);
		frameButtons[70][2].setIcon(null);
		frameButtons[70][3].setIcon(null);
		frameButtons[70][4].setIcon(järn);
		frameButtons[70][5].setIcon(flinta);
		frameButtons[70][6].setIcon(null);
		frameButtons[70][7].setIcon(null);
		frameButtons[70][8].setIcon(null);
		frameButtons[70][9].setIcon(null);
                      
		frameButtons[71][1].setIcon(null);
		frameButtons[71][2].setIcon(plankor);
		frameButtons[71][3].setIcon(null);
		frameButtons[71][4].setIcon(null);
		frameButtons[71][5].setIcon(plankor);
		frameButtons[71][6].setIcon(null);
		frameButtons[71][7].setIcon(null);
		frameButtons[71][8].setIcon(null);
		frameButtons[71][9].setIcon(null);
                      
		frameButtons[72][1].setIcon(null);
		frameButtons[72][2].setIcon(null);
		frameButtons[72][3].setIcon(null);
		frameButtons[72][4].setIcon(plankor);
		frameButtons[72][5].setIcon(null);
		frameButtons[72][6].setIcon(plankor);
		frameButtons[72][7].setIcon(null);
		frameButtons[72][8].setIcon(plankor);
		frameButtons[72][9].setIcon(null);
                      
		frameButtons[73][1].setIcon(null);
		frameButtons[73][2].setIcon(null);
		frameButtons[73][3].setIcon(null);
		frameButtons[73][4].setIcon(null);
		frameButtons[73][5].setIcon(null);
		frameButtons[73][6].setIcon(null);
		frameButtons[73][7].setIcon(vete);
		frameButtons[73][8].setIcon(vete);
		frameButtons[73][9].setIcon(vete);
                      
		frameButtons[74][1].setIcon(null);
		frameButtons[74][2].setIcon(null);
		frameButtons[74][3].setIcon(null);
		frameButtons[74][4].setIcon(läder);
		frameButtons[74][5].setIcon(läder);
		frameButtons[74][6].setIcon(läder);
		frameButtons[74][7].setIcon(läder);
		frameButtons[74][8].setIcon(null);
		frameButtons[74][9].setIcon(läder);
                      
		frameButtons[75][1].setIcon(läder);
		frameButtons[75][2].setIcon(null);
		frameButtons[75][3].setIcon(läder);
		frameButtons[75][4].setIcon(läder);
		frameButtons[75][5].setIcon(läder);
		frameButtons[75][6].setIcon(läder);
		frameButtons[75][7].setIcon(läder);
		frameButtons[75][8].setIcon(läder);
		frameButtons[75][9].setIcon(läder);
                      
		frameButtons[76][1].setIcon(läder);
		frameButtons[76][2].setIcon(läder);
		frameButtons[76][3].setIcon(läder);
		frameButtons[76][4].setIcon(läder);
		frameButtons[76][5].setIcon(null);
		frameButtons[76][6].setIcon(läder);
		frameButtons[76][7].setIcon(läder);
		frameButtons[76][8].setIcon(null);
		frameButtons[76][9].setIcon(läder);
                      
		frameButtons[77][1].setIcon(null);
		frameButtons[77][2].setIcon(null);
		frameButtons[77][3].setIcon(null);
		frameButtons[77][4].setIcon(läder);
		frameButtons[77][5].setIcon(null);
		frameButtons[77][6].setIcon(läder);
		frameButtons[77][7].setIcon(läder);
		frameButtons[77][8].setIcon(null);
		frameButtons[77][9].setIcon(läder);
                      
		frameButtons[78][1].setIcon(pinne);
		frameButtons[78][2].setIcon(pinne);
		frameButtons[78][3].setIcon(pinne);
		frameButtons[78][4].setIcon(pinne);
		frameButtons[78][5].setIcon(ull);
		frameButtons[78][6].setIcon(pinne);
		frameButtons[78][7].setIcon(pinne);
		frameButtons[78][8].setIcon(pinne);
		frameButtons[78][9].setIcon(pinne);
                      
		frameButtons[79][1].setIcon(guldklimp);
		frameButtons[79][2].setIcon(guldklimp);
		frameButtons[79][3].setIcon(guldklimp);
		frameButtons[79][4].setIcon(guldklimp);
		frameButtons[79][5].setIcon(äpple);
		frameButtons[79][6].setIcon(guldklimp);
		frameButtons[79][7].setIcon(guldklimp);
		frameButtons[79][8].setIcon(guldklimp);
		frameButtons[79][9].setIcon(guldklimp);
                      
		frameButtons[80][1].setIcon(null);
		frameButtons[80][2].setIcon(null);
		frameButtons[80][3].setIcon(null);
		frameButtons[80][4].setIcon(järn);
		frameButtons[80][5].setIcon(null);
		frameButtons[80][6].setIcon(järn);
		frameButtons[80][7].setIcon(null);
		frameButtons[80][8].setIcon(järn);
		frameButtons[80][9].setIcon(null);
                      
		frameButtons[81][1].setIcon(null);
		frameButtons[81][2].setIcon(null);
		frameButtons[81][3].setIcon(null);
		frameButtons[81][4].setIcon(järn);
		frameButtons[81][5].setIcon(null);
		frameButtons[81][6].setIcon(järn);
		frameButtons[81][7].setIcon(järn);
		frameButtons[81][8].setIcon(järn);
		frameButtons[81][9].setIcon(järn);
                      
		frameButtons[82][1].setIcon(null);
		frameButtons[82][2].setIcon(null);
		frameButtons[82][3].setIcon(null);
		frameButtons[82][4].setIcon(plankor);
		frameButtons[82][5].setIcon(null);
		frameButtons[82][6].setIcon(plankor);
		frameButtons[82][7].setIcon(plankor);
		frameButtons[82][8].setIcon(plankor);
		frameButtons[82][9].setIcon(plankor);
                      
		frameButtons[83][1].setIcon(null);
		frameButtons[83][2].setIcon(null);
		frameButtons[83][3].setIcon(null);
		frameButtons[83][4].setIcon(null);
		frameButtons[83][5].setIcon(null);
		frameButtons[83][6].setIcon(null);
		frameButtons[83][7].setIcon(sockerrör);
		frameButtons[83][8].setIcon(sockerrör);
		frameButtons[83][9].setIcon(sockerrör);
                      
		frameButtons[84][1].setIcon(null);
		frameButtons[84][2].setIcon(papper);
		frameButtons[84][3].setIcon(null);
		frameButtons[84][4].setIcon(null);
		frameButtons[84][5].setIcon(papper);
		frameButtons[84][6].setIcon(null);
		frameButtons[84][7].setIcon(null);
		frameButtons[84][8].setIcon(papper);
		frameButtons[84][9].setIcon(läder);
                      
		frameButtons[85][1].setIcon(null);
		frameButtons[85][2].setIcon(null);
		frameButtons[85][3].setIcon(null);
		frameButtons[85][4].setIcon(null);
		frameButtons[85][5].setIcon(kista);
		frameButtons[85][6].setIcon(null);
		frameButtons[85][7].setIcon(null);
		frameButtons[85][8].setIcon(gruvvagn);
		frameButtons[85][9].setIcon(null);
                      
		frameButtons[86][1].setIcon(null);
		frameButtons[86][2].setIcon(null);
		frameButtons[86][3].setIcon(null);
		frameButtons[86][4].setIcon(null);
		frameButtons[86][5].setIcon(ugn);
		frameButtons[86][6].setIcon(null);
		frameButtons[86][7].setIcon(null);
		frameButtons[86][8].setIcon(gruvvagn);
		frameButtons[86][9].setIcon(null);
                      
		frameButtons[87][1].setIcon(null);
		frameButtons[87][2].setIcon(järn);
		frameButtons[87][3].setIcon(null);
		frameButtons[87][4].setIcon(järn);
		frameButtons[87][5].setIcon(rödsten);
		frameButtons[87][6].setIcon(järn);
		frameButtons[87][7].setIcon(null);
		frameButtons[87][8].setIcon(järn);
		frameButtons[87][9].setIcon(null);
                      
		frameButtons[88][1].setIcon(null);
		frameButtons[88][2].setIcon(null);
		frameButtons[88][3].setIcon(pinne);
		frameButtons[88][4].setIcon(null);
		frameButtons[88][5].setIcon(pinne);
		frameButtons[88][6].setIcon(tråd);
		frameButtons[88][7].setIcon(pinne);
		frameButtons[88][8].setIcon(null);
		frameButtons[88][9].setIcon(tråd);
                      
		frameButtons[89][1].setIcon(null);
		frameButtons[89][2].setIcon(guld);
		frameButtons[89][3].setIcon(null);
		frameButtons[89][4].setIcon(guld);
		frameButtons[89][5].setIcon(rödsten);
		frameButtons[89][6].setIcon(guld);
		frameButtons[89][7].setIcon(null);
		frameButtons[89][8].setIcon(guld);
		frameButtons[89][9].setIcon(null);
                      
		frameButtons[91][1].setIcon(null);
		frameButtons[91][2].setIcon(null);
		frameButtons[91][3].setIcon(null);
		frameButtons[91][4].setIcon(null);
		frameButtons[91][5].setIcon(sockerrör);
		frameButtons[91][6].setIcon(null);
		frameButtons[91][7].setIcon(null);
		frameButtons[91][8].setIcon(null);
		frameButtons[91][9].setIcon(null);
                      
		frameButtons[92][1].setIcon(mjölk);
		frameButtons[92][2].setIcon(mjölk);
		frameButtons[92][3].setIcon(mjölk);
		frameButtons[92][4].setIcon(socker);
		frameButtons[92][5].setIcon(ägg);
		frameButtons[92][6].setIcon(socker);
		frameButtons[92][7].setIcon(vete);
		frameButtons[92][8].setIcon(vete);
		frameButtons[92][9].setIcon(vete);
                      
		frameButtons[93][1].setIcon(null);
		frameButtons[93][2].setIcon(null);
		frameButtons[93][3].setIcon(null);
		frameButtons[93][4].setIcon(rödstensfackla);
		frameButtons[93][5].setIcon(rödsten);
		frameButtons[93][6].setIcon(rödstensfackla);
		frameButtons[93][7].setIcon(sten);
		frameButtons[93][8].setIcon(sten);
		frameButtons[93][9].setIcon(sten);
                      
		frameButtons[94][1].setIcon(null);
		frameButtons[94][2].setIcon(null);
		frameButtons[94][3].setIcon(null);
		frameButtons[94][4].setIcon(null);
		frameButtons[94][5].setIcon(null);
		frameButtons[94][6].setIcon(null);
		frameButtons[94][7].setIcon(vete);
		frameButtons[94][8].setIcon(kakao);
		frameButtons[94][9].setIcon(vete);
                      
		frameButtons[95][1].setIcon(papper);
		frameButtons[95][2].setIcon(papper);
		frameButtons[95][3].setIcon(papper);
		frameButtons[95][4].setIcon(papper);
		frameButtons[95][5].setIcon(kompass);
		frameButtons[95][6].setIcon(papper);
		frameButtons[95][7].setIcon(papper);
		frameButtons[95][8].setIcon(papper);
		frameButtons[95][9].setIcon(papper);
                      
		frameButtons[96][1].setIcon(null);
		frameButtons[96][2].setIcon(null);
		frameButtons[96][3].setIcon(null);
		frameButtons[96][4].setIcon(null);
		frameButtons[96][5].setIcon(järn);
		frameButtons[96][6].setIcon(null);
		frameButtons[96][7].setIcon(järn);
		frameButtons[96][8].setIcon(null);
		frameButtons[96][9].setIcon(null);
                      
		frameButtons[97][1].setIcon(null);
		frameButtons[97][2].setIcon(null);
		frameButtons[97][3].setIcon(null);
		frameButtons[97][4].setIcon(null);
		frameButtons[97][5].setIcon(melon);
		frameButtons[97][6].setIcon(null);
		frameButtons[97][7].setIcon(null);
		frameButtons[97][8].setIcon(null);
		frameButtons[97][9].setIcon(null);
                      
		frameButtons[98][1].setIcon(null);
		frameButtons[98][2].setIcon(null);
		frameButtons[98][3].setIcon(null);
		frameButtons[98][4].setIcon(null);
		frameButtons[98][5].setIcon(guld);
		frameButtons[98][6].setIcon(null);
		frameButtons[98][7].setIcon(null);
		frameButtons[98][8].setIcon(null);
		frameButtons[98][9].setIcon(null);
                      
		frameButtons[99][1].setIcon(null);
		frameButtons[99][2].setIcon(null);
		frameButtons[99][3].setIcon(null);
		frameButtons[99][4].setIcon(glas);
		frameButtons[99][5].setIcon(null);
		frameButtons[99][6].setIcon(glas);
		frameButtons[99][7].setIcon(null);
		frameButtons[99][8].setIcon(glas);
		frameButtons[99][9].setIcon(null);

		frameButtons[100][1].setIcon(null);
		frameButtons[100][2].setIcon(null);
		frameButtons[100][3].setIcon(null);
		frameButtons[100][4].setIcon(svamp);
		frameButtons[100][5].setIcon(socker);
		frameButtons[100][6].setIcon(null);
		frameButtons[100][7].setIcon(null);
		frameButtons[100][8].setIcon(spindelöga);
		frameButtons[100][9].setIcon(null);
                       
		frameButtons[101][1].setIcon(null);
		frameButtons[101][2].setIcon(null);
		frameButtons[101][3].setIcon(null);
		frameButtons[101][4].setIcon(null);
		frameButtons[101][5].setIcon(blaze);
		frameButtons[101][6].setIcon(null);
		frameButtons[101][7].setIcon(null);
		frameButtons[101][8].setIcon(null);
		frameButtons[101][9].setIcon(null);
                       
		frameButtons[102][1].setIcon(null);
		frameButtons[102][2].setIcon(null);
		frameButtons[102][3].setIcon(null);
		frameButtons[102][4].setIcon(null);
		frameButtons[102][5].setIcon(slime);
		frameButtons[102][6].setIcon(null);
		frameButtons[102][7].setIcon(null);
		frameButtons[102][8].setIcon(blazepulver);
		frameButtons[102][9].setIcon(null);
                       
		frameButtons[103][1].setIcon(null);
		frameButtons[103][2].setIcon(null);
		frameButtons[103][3].setIcon(null);
		frameButtons[103][4].setIcon(null);
		frameButtons[103][5].setIcon(enderpärla);
		frameButtons[103][6].setIcon(null);
		frameButtons[103][7].setIcon(null);
		frameButtons[103][8].setIcon(blazepulver);
		frameButtons[103][9].setIcon(null);
                       
		frameButtons[104][1].setIcon(guldklimp);
		frameButtons[104][2].setIcon(guldklimp);
		frameButtons[104][3].setIcon(guldklimp);
		frameButtons[104][4].setIcon(guldklimp);
		frameButtons[104][5].setIcon(melon);
		frameButtons[104][6].setIcon(guldklimp);
		frameButtons[104][7].setIcon(guldklimp);
		frameButtons[104][8].setIcon(guldklimp);
		frameButtons[104][9].setIcon(guldklimp);
                       
		frameButtons[105][1].setIcon(null);
		frameButtons[105][2].setIcon(null);
		frameButtons[105][3].setIcon(null);
		frameButtons[105][4].setIcon(fjäder);
		frameButtons[105][5].setIcon(null);
		frameButtons[105][6].setIcon(null);
		frameButtons[105][7].setIcon(bläck);
		frameButtons[105][8].setIcon(bok);
		frameButtons[105][9].setIcon(null);
                       
		frameButtons[106][1].setIcon(pinne);
		frameButtons[106][2].setIcon(pinne);
		frameButtons[106][3].setIcon(pinne);
		frameButtons[106][4].setIcon(pinne);
		frameButtons[106][5].setIcon(läder);
		frameButtons[106][6].setIcon(pinne);
		frameButtons[106][7].setIcon(pinne);
		frameButtons[106][8].setIcon(pinne);
		frameButtons[106][9].setIcon(pinne);
                       
		frameButtons[107][1].setIcon(guldklimp);
		frameButtons[107][2].setIcon(guldklimp);
		frameButtons[107][3].setIcon(guldklimp);
		frameButtons[107][4].setIcon(guldklimp);
		frameButtons[107][5].setIcon(morot);
		frameButtons[107][6].setIcon(guldklimp);
		frameButtons[107][7].setIcon(guldklimp);
		frameButtons[107][8].setIcon(guldklimp);
		frameButtons[107][9].setIcon(guldklimp);
                       
		frameButtons[108][1].setIcon(null);
		frameButtons[108][2].setIcon(null);
		frameButtons[108][3].setIcon(null);
		frameButtons[108][4].setIcon(fiskespö);
		frameButtons[108][5].setIcon(null);
		frameButtons[108][6].setIcon(null);
		frameButtons[108][7].setIcon(null);
		frameButtons[108][8].setIcon(morot);
		frameButtons[108][9].setIcon(null);
                       
		frameButtons[109][1].setIcon(null);
		frameButtons[109][2].setIcon(null);
		frameButtons[109][3].setIcon(null);
		frameButtons[109][4].setIcon(pumpa);
		frameButtons[109][5].setIcon(socker);
		frameButtons[109][6].setIcon(null);
		frameButtons[109][7].setIcon(null);
		frameButtons[109][8].setIcon(ägg);
		frameButtons[109][9].setIcon(null);
                       
		frameButtons[110][1].setIcon(null);
		frameButtons[110][2].setIcon(null);
		frameButtons[110][3].setIcon(null);
		frameButtons[110][4].setIcon(raketstjärna);
		frameButtons[110][5].setIcon(papper);
		frameButtons[110][6].setIcon(krut);
		frameButtons[110][7].setIcon(null);
		frameButtons[110][8].setIcon(null);
		frameButtons[110][9].setIcon(null);
                       
		frameButtons[111][1].setIcon(null);
		frameButtons[111][2].setIcon(null);
		frameButtons[111][3].setIcon(null);
		frameButtons[111][4].setIcon(krut);
		frameButtons[111][5].setIcon(färger);
		frameButtons[111][6].setIcon(null);
		frameButtons[111][7].setIcon(null);
		frameButtons[111][8].setIcon(null);
		frameButtons[111][9].setIcon(null);
                       
		frameButtons[112][1].setIcon(null);
		frameButtons[112][2].setIcon(null);
		frameButtons[112][3].setIcon(null);
		frameButtons[112][4].setIcon(null);
		frameButtons[112][5].setIcon(dynamit);
		frameButtons[112][6].setIcon(null);
		frameButtons[112][7].setIcon(null);
		frameButtons[112][8].setIcon(gruvvagn);
		frameButtons[112][9].setIcon(null);
                       
		frameButtons[113][1].setIcon(null);
		frameButtons[113][2].setIcon(null);
		frameButtons[113][3].setIcon(null);
		frameButtons[113][4].setIcon(null);
		frameButtons[113][5].setIcon(hopper);
		frameButtons[113][6].setIcon(null);
		frameButtons[113][7].setIcon(null);
		frameButtons[113][8].setIcon(gruvvagn);
		frameButtons[113][9].setIcon(null);
                       
		frameButtons[114][1].setIcon(tråd);
		frameButtons[114][2].setIcon(tråd);
		frameButtons[114][3].setIcon(null);
		frameButtons[114][4].setIcon(tråd);
		frameButtons[114][5].setIcon(slime);
		frameButtons[114][6].setIcon(null);
		frameButtons[114][7].setIcon(null);
		frameButtons[114][8].setIcon(null);
		frameButtons[114][9].setIcon(tråd);
	}
	void ladda3(){
		for (int i = 3; i < frameButtons.length; i++) {
			if (i!=4&&i!=5&&i!=6&&i!=90) {
				for (int j = 1; j < frameButtons[i].length; j++) {
					if(frameButtons[i][j].getIcon() != null){
						frameButtons[i][j].addActionListener(this);
					}
				}
			}
		}
	}
	void ladda4(){
		frame.setLayout(new GridLayout(0, 3));

		bar.add(språkMeny);
		bar.add(hjälpMenu);

		text.addCaretListener(this);

		bar.add(text);

		helpItem.addActionListener(this);
		ideasItem.addActionListener(this);

		mailTimer.start();

		label.setEditable(false);
		label.setBackground(BLACK);
		label.setForeground(WHITE);
		label.setFont(new Font("Areal", Font.BOLD, 30));

		språkMeny.add(väljSpråk);
		hjälpMenu.add(helpItem);
		hjälpMenu.add(ideasItem);
		väljSpråk.addActionListener(this);

		ideasFrame.setSize(525,500);
		ideasFrame.setLocationRelativeTo(null);
		ideasFrame.setLayout(new GridLayout(3,1));
		ideasFrame.add(label);
		ideasFrame.add(area);
		ideasFrame.add(skicka);
		
		skicka.addActionListener(this);
	}
	int a = 1;
	public void actionPerformed(ActionEvent e) {
		System.out.println("Någon knapp nedtryckt!");	
		if(e.getSource()==mailTimer){
			try {
				if(mailSkickat==false&&!prop.getProperty("Namn","").equals("")&&!prop.getProperty("9778436klbgflf","").equals("")){
					//Mail
					System.out.println("Försök " + a);
					Mail.Skicka("gojb@gojb.bl.ee", "Användande av GoJbGuide", "Namn:  " + prop.getProperty("Namn") + ", Språk:  " + prop.getProperty("9778436klbgflf") + "\n //lhdohf7984 = Engelska \n //86325yhrel = Svenska");
					prop.setProperty("y", "10");
					System.out.println("Skickat!");
					mailTimer.stop();
					sparaProp();
				} 
			}
			catch (MessagingException e1) {
				a++;
				System.err.println("Mejl misslyckades att skickas");
			}catch (Exception e1) {
				System.err.println("Mejl misslyckades");
			}
			if(mailSkickat==true){
				mailTimer.stop();
			}
			if (a>10) {
				System.err.println("Problem med internetåtkomst");
				mailTimer.stop();
			}
		}
		if (e.getSource()==helpItem){
			JOptionPane.showMessageDialog(null, help);
		}
		if (e.getSource()==ideasItem) {
			ideasFrame.setVisible(true);
		}
		if(skicka==e.getSource()){
			try {
				Mail.Skicka("gojb@gojb.bl.ee","--Bugg/idéer--",prop.getProperty("Namn") 
						+ " skriver: \n" + area.getText());
				ideasFrame.dispose();
			} catch (Exception e1) {
				System.err.println("Mail skickades inte!!");
			}
		}

		for (int i = 3; i < buttons.length; i++) {
			if (i!=4&&i!=5&&i!=6&&i!=90) {
				frames[i].setVisible(false);
				frames[i].setLocationRelativeTo(frameHuvud);
			}
		}

		for (int i = 3; i < buttons.length; i++) {
			if (i!=4&&i!=5&&i!=6&&i!=90) {
				if (e.getSource() == buttons[i]){
					frames[i].setVisible(true);
					break;
				}
			}
		}
		Icon abc = null;
		try {
			abc = ((AbstractButton) e.getSource()).getIcon();
		} catch (Exception e1) {
		}

		if (abc==tra) {

			JOptionPane.showMessageDialog(null, traString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==kullersten) {
			JOptionPane.showMessageDialog(null, kullerString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE,abc);
		}
		if (abc==rödsten) {
			JOptionPane.showMessageDialog(null, rödString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==plankor) {
			frames[3].setVisible(true);
		}
		if (abc==pilbåge) {
			frames[68].setVisible(true);
		}
		if (abc==sand) {
			JOptionPane.showMessageDialog(null, sandString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==ull) {
			frames[15].setVisible(true);
		}
		if (abc==guld) {
			JOptionPane.showMessageDialog(null, guldString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==pinne) {
			frames[71].setVisible(true);
		}
		if (abc==tryckplatta) {
			frames[30].setVisible(true);
		}
		if (abc==kolv) {
			frames[14].setVisible(true);
		}
		if (abc==slime) {
			JOptionPane.showMessageDialog(null, slimesString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==tråd) {
			JOptionPane.showMessageDialog(null, trådsString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==tegel) {
			JOptionPane.showMessageDialog(null, tegelString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==krut) {
			JOptionPane.showMessageDialog(null, krutString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==järn) {
			JOptionPane.showMessageDialog(null, järnString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==diamant) {
			JOptionPane.showMessageDialog(null, diamantString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==snöboll) {
			JOptionPane.showMessageDialog(null, snöbollString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==obsidian) {
			JOptionPane.showMessageDialog(null, obsidianString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==enderöga) {
			frames[103].setVisible(true);
		}
		if (abc==bok) {
			frames[84].setVisible(true);
		}
		if (abc==papper) {
			frames[83].setVisible(true);
		}
		if (abc==läder) {
			JOptionPane.showMessageDialog(null, lädersString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==gruvvagn) {
			frames[81].setVisible(true);
		}
		if (abc==hopper) {
			frames[58].setVisible(true);
		}
		if (abc==kista) {
			frames[22].setVisible(true);
		}
		if (abc==ugn) {
			frames[24].setVisible(true);
		}
		if (abc==färger) {
			JOptionPane.showMessageDialog(null, färgerString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==raketstjärna) {
			frames[111].setVisible(true);
		}
		if (abc==dynamit) {
			frames[18].setVisible(true);
		}
		if (abc==block) {
			frames[57].setVisible(true);
		}
		if (abc==socker) {
			frames[91].setVisible(true);
		}
		if (abc==pumpa) {
			JOptionPane.showMessageDialog(null, pumpaString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==ägg) {
			JOptionPane.showMessageDialog(null, äggString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==kol) {
			JOptionPane.showMessageDialog(null, kolString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==morot) {
			JOptionPane.showMessageDialog(null, morotString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==fiskespö) {
			frames[88].setVisible(true);
		}
		if (abc==guldklimp) {
			frames[98].setVisible(true);
		}
		if (abc==järnträ) {
			JOptionPane.showMessageDialog(null, järnelrträdString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==fjäder) {
			JOptionPane.showMessageDialog(null, fjäderString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==bläck) {
			JOptionPane.showMessageDialog(null, bläckString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==tryck) {
			JOptionPane.showMessageDialog(null, träjärnstenString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==melon) {
			JOptionPane.showMessageDialog(null, melonString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==blazepulver) {
			frames[101].setVisible(true);
		}
		if (abc==blaze) {
			JOptionPane.showMessageDialog(null, blazeString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==svamp) {
			JOptionPane.showMessageDialog(null, svampString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==spindelöga) {
			JOptionPane.showMessageDialog(null, spindelögaString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==glödstenspulver) {
			JOptionPane.showMessageDialog(null, glödstenspulverString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==fackla) {
			frames[20].setVisible(true);
		}
		if (abc==glas) {
			JOptionPane.showMessageDialog(null, glasString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==vete) {
			JOptionPane.showMessageDialog(null, veteString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==kakao) {
			JOptionPane.showMessageDialog(null, kakaoString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==kompass) {
			frames[87].setVisible(true);
		}
		if (abc==sten) {
			JOptionPane.showMessageDialog(null, stenString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==rödstensfackla) {
			frames[31].setVisible(true);
		}
		if (abc==mjölk) {
			JOptionPane.showMessageDialog(null, mjölkString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==färgglas) {
			frames[38].setVisible(true);
		}
		if (abc==sockerrör) {
			JOptionPane.showMessageDialog(null, sockerrörString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==glödstenslampa) {
			frames[36].setVisible(true);
		}
		if (abc==äpple) {
			JOptionPane.showMessageDialog(null, äppleString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==flinta) {
			JOptionPane.showMessageDialog(null, flintaString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==järnStenTrä) {
			JOptionPane.showMessageDialog(null, järnstenträString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==nederstjärna) {
			JOptionPane.showMessageDialog(null, nederstjärnaString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==järnblock) {
			frames[57].setVisible(true);
		}
		if (abc==trähalvblock) {
			frames[16].setVisible(true);
		}
		if (abc==nederkvarts) {
			JOptionPane.showMessageDialog(null, nederkvartString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==material) {
			JOptionPane.showMessageDialog(null, materialString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==snubbeltrådskrok) {
			frames[49].setVisible(true);
		}
		if (e.getSource()==väljSpråk){
			Språkfråga();
		}
		if (abc==enderpärla) {
			JOptionPane.showMessageDialog(null, enderString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}

	}
	@Override
	public void caretUpdate(CaretEvent e) {
		läggtill();

		for (int i = 3; i < buttons.length; i++) {
			if (i!=4&&i!=5&&i!=6&&i!=90) {
				if(!buttons[i].getText().toLowerCase().contains(text.getText().toLowerCase())){
					frame.remove(buttons[i]);
				}
			}
		}
		while (frame.getComponents().length<9) {
			frame.add(Box.createGlue());
		}
		frameHuvud.revalidate();
		frameHuvud.repaint();

	}
	void sortera(){
		this.list.removeAll(this.list);
		ArrayList<String> list = new ArrayList<String>();
		
		for (int i = 3; i < buttons.length; i++) {
			if (i!=4&&i!=5&&i!=6&&i!=90) {
				list.add(buttons[i].getText());
			}
		}
		Collections.sort(list);
		while (!list.isEmpty()) {
			for (int i = 3; i < buttons.length; i++) {
				if (i!=4&&i!=5&&i!=6&&i!=90) {
					if (list.get(0).equals(buttons[i].getText())) this.list.add(buttons[i]);
				}
			}
			list.remove(0);
		}
		läggtill();
	}
	void läggtill(){
		frame.removeAll();
		for (JButton jButton : list) {
			frame.add(jButton);
		}
	}
	void sparaProp(){
		try {
			prop.store(new FileWriter(new File(System.getProperty("user.home") + "\\AppData\\Roaming\\GoJb\\settings.gojb")),"Inställningar för GoJbGuide");
		} catch (Exception e1) {
			System.err.println("Mappen finns inte! Skapar...");
			new File(System.getProperty("user.home") + "\\AppData\\Roaming\\GoJb\\").mkdir();
			try {
				prop.store(new FileWriter(new File(System.getProperty("user.home") + "\\AppData\\Roaming\\GoJb\\settings.gojb")),"Inställningar för GoJbGuide");
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
	ActionListener actionListener2 = new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			background1.setText(välkommen + " " + namn);			
			progressBar.setValue(progressBar.getValue()+1);
			background2.setText(Integer.toString(progressBar.getValue())+"%");
			frame2.repaint();

			if (progressBar.getValue() == 30 && namnInt == 1){
				start=true;
				Språk();
				new Thread(new Update()).start();
				prop.setProperty("y", "9");
			}
			if (progressBar.getValue() == 50 && namnInt==2){
				välkommen = "Välkommen! Laddar...";
			}
			if (progressBar.getValue() == 25){
				GörFönster();
			}
			if (progressBar.getValue() == 50){
				ladda2();
			}
			
			if (progressBar.getValue() == 65){
				ladda3();
			}
			if (progressBar.getValue() == 80){
				ladda4();
			}
			if(progressBar.getValue()==101&&start==true){
				timer.stop();
				frame2.dispose();
			}
			if (progressBar.getValue() == 101 && namnInt == 1){
				frameHuvud.setVisible(true);
			}
			if (progressBar.getValue() == 100 && namnInt == 2){

				timer.stop();
				namn = showInputDialog("Enter name/Skriv ditt namn");

				if(namn==null||namn.equals("")){
					System.exit(3);
				}
				else {
					Språk();
					frame2.dispose();
				}
				prop.setProperty("Namn", namn);
				sparaProp();
			}
		}
	};
	
	Timer timer = new Timer(30, actionListener2);
	public Start(){
		try {
			prop.load(new FileInputStream(System.getProperty ("user.home") + "\\AppData\\Roaming\\GoJb\\settings.gojb"));
		} catch (IOException e) {
			System.err.println("sdoövhjxcblizxg,vbs");
		}
		
		frame2.setLayeredPane(layeredPane);
		frame2.setBackground(white);
		frame2.setIconImage(new ImageIcon(getClass().getResource("/images/Java-icon.png")).getImage());
		frame2.setUndecorated(true);
		frame2.setLayout(new BorderLayout());
		frame2.setSize(300,200);
		frame2.setLocationRelativeTo(null);
		frame2.setDefaultCloseOperation(3);
		frame2.setVisible(true);

		background.setOpaque(true);
		background.setBackground(blue);
		background.setSize(300,200);
		background.setLocation(0,0);

		background1.setForeground(Color.white);
		background1.setOpaque(false);
		background1.setBackground(Color.black);
		background1.setSize(300,54);
		background1.setLocation(20, 30);
		background1.setFont(new Font("Arial",Font.BOLD,25));

		background2.setForeground(Color.white);
		background2.setOpaque(false);
		background2.setBackground(Color.black);
		background2.setSize(200,54);
		background2.setLocation(125,70);
		background2.setFont(new Font("Arial",Font.BOLD,30));

		progressBar.setLocation(50,150);
		progressBar.setSize(200, 30);
		progressBar.setForeground(Color.green);
		progressBar.setBackground(Color.black);
		progressBar.setBorderPainted(false);
		
		layeredPane.add(background);
		layeredPane.add(background1);
		layeredPane.add(background2);
		layeredPane.add(progressBar);
		layeredPane.setLayer(background, 25);
		layeredPane.setLayer(background1, 90);
		layeredPane.setLayer(background2, 90);
		layeredPane.setLayer(progressBar, 100);

		SpråkVoid();

		frame2.repaint();
		frame2.revalidate();
		layeredPane.revalidate();
		layeredPane.repaint();

		timer.start();

		if(prop.getProperty("y","1").equals("10")){
			mailSkickat=true;
			System.out.println("Mail = true");

		}
		else{
			mailSkickat=false;
			System.out.println("Mail = false");
		}

		if (!prop.getProperty("9778436klbgflf","kjg").equals("lhdohf7984")&&
				!prop.getProperty("9778436klbgflf","kjg").equals("86325yhrel")){
			System.err.println(prop.getProperty("9778436klbgflf"));

			System.err.println("Språk ej valt");

			namnInt = 2;

			prop.setProperty("Namn", "");
			välkommen = "Welcome! Loading...";
			sparaProp();
		}
	}
	public void SpråkVoid(){
		if (prop.getProperty("9778436klbgflf","kjg").equals("86325yhrel")){
			välkommen = "Välkommen " + prop.getProperty("Namn");
			string="Uppdatering tillgänglig. Vill du uppdatera?";
			laddaString="Uppdatera nu";
			cancelString="Uppdatera senare";
			finishedString="Uppdatering slutförd. \nProgrammet kommer nu att starta om";
			label.setText("Skriv vad du har på hjärtat här. Det\nspelar ingen roll om det "
					+ "är buggar,\nförslag till programmet, eller förslag \ntill nya program. Skriv "
					+ "det här! :D");
			namnInt = 1;

		}
		else if (prop.getProperty("9778436klbgflf","kjg").equals("lhdohf7984")){
			välkommen = "Welcome " + prop.getProperty("Namn");
			string="Update available. Do you want to update?";
			laddaString = "Update now";
			cancelString = "Update later";
			finishedString = "Uppdate finished. \nThe program will now restart";
			label.setText("Write what's on your mind here. It \ndoesn't matter if it's about buggs or\nideas "
					+ "for this program, or ideas for \na new program. Write it here! :D");
			namnInt = 1;
		}
	}
	public static void main(String[] args) {
		progressBar = new JProgressBar(0,101);
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			((Runnable) Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.hand")).run();
			JOptionPane.showMessageDialog(null, "Bad LookAndFeel!","Error",JOptionPane.ERROR_MESSAGE);
		}

		new Start();
	}
}
class Update implements Runnable{
	public synchronized void run(){
		if (getClass().getResource("/" + getClass().getName().replace('.','/') + ".class").toString().startsWith("jar:")) {
			try {
				URLConnection connection = new URL("http://gojb.bl.ee/GoJbGuide.jar").openConnection();
				File file = new File(getClass().getProtectionDomain().getCodeSource().getLocation().toURI());
				System.out.println("Online: " + connection.getLastModified());
				System.out.println("File: " + file);
				System.out.println("Lokal:  "+ file.lastModified());
				Object[] options = { Start.laddaString, Start.cancelString };
				if (file.lastModified() + 60000 < connection.getLastModified()&&
						showOptionDialog(null, Start.string, "GoJbGuide",
								DEFAULT_OPTION, WARNING_MESSAGE,
								null, options, options[0])==OK_OPTION) {

					JProgressBar bar = new JProgressBar(0, connection.getContentLength());
					JFrame frame = new JFrame("Downloading update...");
					frame.add(bar);
					frame.setIconImage(new ImageIcon(getClass().getResource("/images/Java-icon.png")).getImage());
					frame.setSize(500,100);	
					frame.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width-frame.getWidth(),
							Toolkit.getDefaultToolkit().getScreenSize().height-frame.getHeight()*2);
					frame.setVisible(true);
					frame.toFront();
					InputStream in = connection.getInputStream();
					ByteArrayOutputStream out = new ByteArrayOutputStream();
					int n = 0;
					byte[] buf = new byte[1024];
					while (-1!=(n=in.read(buf))){
						out.write(buf, 0, n);
						bar.setValue(bar.getValue()+n);
					}
					frame.setTitle("Saving...");
					bar.setIndeterminate(true);
					FileOutputStream fos = new FileOutputStream(file);
					fos.write(out.toByteArray());
					fos.close();
					out.close();
					in.close();
					frame.dispose();
					System.out.println("Klart!");
					showMessageDialog(null, Start.finishedString, "Update Finished", INFORMATION_MESSAGE);
					try {
						String string = "java -jar \"" + file.toString()+"\"";
						Runtime.getRuntime().exec(string);
						System.err.println(string);
					} catch (Exception e) {
						e.printStackTrace(); 
					}
					System.exit(0);
				}
			} catch(Exception e){
				System.err.println("Ingen uppdatering hittades");
			}
		}
	}
}
/*Idéer:
 * 
 * Ta imot mail, om ämmnet.equals(getNamn) visas ett meddelande. Alltså kan man skicka meddelanden till
 *  användare
 *  
 */

