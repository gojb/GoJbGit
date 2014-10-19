package gojbguide;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;

import javax.mail.*;
import javax.swing.*;
import javax.swing.Timer;
import javax.swing.event.*;

import static java.awt.Color.*;
import static javax.swing.JOptionPane.*;


/**
 * @author GoJb
 *
 *
 */

public class GoJb1 implements ActionListener, CaretListener, MouseInputListener{
	private JFrame[] frames = new JFrame[115];

	static JFrame frameHuvud = new JFrame("GoJbGuide");

	private JFrame spr�k = new JFrame("Language");

	private JFrame ideasFrame = new JFrame("Ideas");
	private static JFrame frame2;

	static Properties prop = new Properties();

	private JButton svenska = new JButton("Svenska",new ImageIcon(getClass().getResource("/images/Swedish.jpg"))),
			engelska = new JButton("English",new ImageIcon(getClass().getResource("/images/Brittish.jpg"))),
			skicka = new JButton("Send");

	private JButton[] buttons = new JButton[frames.length];
	private JButton[][] frameButtons = new JButton[frames.length][10];

	private JMenuBar bar = new JMenuBar();

	private ArrayList<JButton> list = new ArrayList<JButton>();

	private JTextField text = new JTextField();

	private JTextArea area = new JTextArea();
	
	String Hello;
	
	JLabel label = new JLabel();

	private Timer mailTimer = new Timer(1000, this);

	private JMenu spr�kMeny = new JMenu(),
			hj�lpMenu = new JMenu("Hj�lp");

	private JMenuItem 	v�ljSpr�k = new JMenuItem(),
			helpItem = new JMenuItem("Hj�lp"),
			ideasItem = new JMenuItem("Ideas/bugs");

	private ImageIcon kullersten = new ImageIcon(getClass().getResource("/images/1.png")),
			r�dsten = new ImageIcon(getClass().getResource("/images/2.png")),
			plankor = new ImageIcon(getClass().getResource("/images/3.png")),
			pilb�ge = new ImageIcon(getClass().getResource("/images/68.gif")),
			tra = new ImageIcon(getClass().getResource("/images/200.png")),
			sand = new ImageIcon(getClass().getResource("/images/4.png")),
			ull = new ImageIcon(getClass().getResource("/images/1026.gif")),
			guld = new ImageIcon(getClass().getResource("/images/5.png")),
			pinne = new ImageIcon(getClass().getResource("/images/71.png")),
			tryckplatta = new ImageIcon(getClass().getResource("/images/30.png")),
			kolv = new ImageIcon(getClass().getResource("/images/14.gif")),
			slime = new ImageIcon(getClass().getResource("/images/1000.png")),
			tr�d = new ImageIcon(getClass().getResource("/images/1001.png")),
			tegel = new ImageIcon(getClass().getResource("/images/1006.png")),
			krut = new ImageIcon(getClass().getResource("/images/1005.png")),
			j�rn = new ImageIcon(getClass().getResource("/images/6.png")),
			diamant = new ImageIcon(getClass().getResource("/images/1013.png")),
			sn�boll = new ImageIcon(getClass().getResource("/images/1012.png")),
			obsidian = new ImageIcon(getClass().getResource("/images/1018.png")),
			ender�ga = new ImageIcon(getClass().getResource("/images/103.png")),
			bok = new ImageIcon(getClass().getResource("/images/84.png")),
			papper = new ImageIcon(getClass().getResource("/images/83.png")),
			l�der = new ImageIcon(getClass().getResource("/images/1032.png")),
			gruvvagn = new ImageIcon(getClass().getResource("/images/81.png")),
			hopper = new ImageIcon(getClass().getResource("/images/58.png")),
			kista = new ImageIcon(getClass().getResource("/images/22.gif")),
			ugn = new ImageIcon(getClass().getResource("/images/24.png")),
			f�rger = new ImageIcon(getClass().getResource("/images/90.gif")),
			raketstj�rna = new ImageIcon(getClass().getResource("/images/111.png")),
			dynamit = new ImageIcon(getClass().getResource("/images/18.png")),
			block = new ImageIcon(getClass().getResource("/images/1008.gif")),
			socker = new ImageIcon(getClass().getResource("/images/91.png")),
			�gg = new ImageIcon(getClass().getResource("/images/1035.png")),
			pumpa = new ImageIcon(getClass().getResource("/images/1015.png")),
			kol = new ImageIcon(getClass().getResource("/images/1007.png")),
			morot = new ImageIcon(getClass().getResource("/images/1042.png")),
			fiskesp� = new ImageIcon(getClass().getResource("/images/88.png")),
			guldklimp = new ImageIcon(getClass().getResource("/images/98.png")),
			j�rntr� = new ImageIcon(getClass().getResource("/images/1009.gif")),
			fj�der = new ImageIcon(getClass().getResource("/images/1030.png")),
			bl�ck = new ImageIcon(getClass().getResource("/images/1041.png")),
			tryck = new ImageIcon(getClass().getResource("/images/1011.gif")),
			melon = new ImageIcon(getClass().getResource("/images/1017.png")),
			blazepulver = new ImageIcon(getClass().getResource("/images/101.png")),
			blaze = new ImageIcon(getClass().getResource("/images/1019.png")),
			enderp�rla = new ImageIcon(getClass().getResource("/images/1040.png")),
			svamp = new ImageIcon(getClass().getResource("/images/1039.png")),
			spindel�ga = new ImageIcon(getClass().getResource("/images/1038.png")),
			gl�dstenspulver = new ImageIcon(getClass().getResource("/images/1014.png")),
			fackla = new ImageIcon(getClass().getResource("/images/20.png")),
			glas = new ImageIcon(getClass().getResource("/images/1016.png")),
			vete = new ImageIcon(getClass().getResource("/images/1028.png")),
			kakao = new ImageIcon(getClass().getResource("/images/1037.png")),
			kompass = new ImageIcon(getClass().getResource("/images/87.png")),
			sten = new ImageIcon(getClass().getResource("/images/1002.png")),
			r�dstensfackla = new ImageIcon(getClass().getResource("/images/31.png")),
			mj�lk = new ImageIcon(getClass().getResource("/images/1036.png")),
			f�rgglas = new ImageIcon(getClass().getResource("/images/1012.gif")),
			sockerr�r = new ImageIcon(getClass().getResource("/images/1034.png")),
			gl�dstenslampa = new ImageIcon(getClass().getResource("/images/36.png")),
			�pple = new ImageIcon(getClass().getResource("/images/1033.png")),
			flinta = new ImageIcon(getClass().getResource("/images/1031.png")),
			j�rnStenTr� = new ImageIcon(getClass().getResource("/images/1029.gif")),
			nederstj�rna = new ImageIcon(getClass().getResource("/images/1020.png")),
			j�rnblock = new ImageIcon(getClass().getResource("/images/1021.png")),
			tr�halvblock = new ImageIcon(getClass().getResource("/images/1023.png")),
			nederkvarts = new ImageIcon(getClass().getResource("/images/1022.png")),
			material = new ImageIcon(getClass().getResource("/images/1027.gif")),
			snubbeltr�dskrok = new ImageIcon(getClass().getResource("/images/49.gif"));

	private String traString = "",kullerString = "",r�dString = "",sandString = "",guldString = "",
			slimesString = "",tr�dsString = "",tegelString = "",krutString = "",j�rnString = "",
			diamantString = "",sn�bollString = "",obsidianString = "",l�dersString = "",f�rgerString = "",
			pumpaString = "",�ggString = "",kolString = "",morotString = "",j�rnelrtr�dString = "",
			fj�derString = "",bl�ckString = "",tr�j�rnstenString = "",melonString = "",blazeString = "",
			spindel�gaString = "",glasString = "",svampString = "",gl�dstenspulverString = "",
			veteString = "",kakaoString = "",stenString = "",sockerr�rString = "",mj�lkString = "",
			�ppleString = "",flintaString = "",j�rnstentr�String = "",nederstj�rnaString = "",
			nederkvartString = "",materialString = "", enderString;

	private JPanel frame = new JPanel();

	private JScrollPane scrollBar=new JScrollPane(frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

	private static int namnInt;

	static String laddaString, cancelString, string, finishedString;

	private static String help, yString, namn = "", v�lkommen;

	private static Boolean mailSkickat;

	private static JProgressBar progressBar;

	private JLayeredPane layeredPane = new JLayeredPane();

	private JLabel background=new JLabel(new ImageIcon(getClass().getResource("/images/Mine.jpg"))),
			background1=new JLabel(),
			background2 = new JLabel();
	/**
9778436klbgflf=lhdohf7984
#Engelska
#lhdohf7984
#Svenska
#86325yhrel
	 */

	public void Spr�kfr�ga() {
		ActionListener dActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (e.getSource()==svenska) {
					prop.setProperty("9778436klbgflf", "86325yhrel");
					Spr�kVoid();
				}
				else if (e.getSource()==engelska) {
					prop.setProperty("9778436klbgflf", "lhdohf7984");
					Spr�kVoid();
				}
				sparaProp();
				spr�k.dispose();
				Spr�k();
				scrollBar.getVerticalScrollBar().setValue(0);
				frameHuvud.setVisible(true);
			}
		};

		spr�k.setLayout(new FlowLayout());
		spr�k.add(svenska);
		spr�k.add(engelska);
		spr�k.setAlwaysOnTop(true);
		spr�k.setIconImage(new ImageIcon(getClass().getResource("/images/Java-icon.png")).getImage());
		spr�k.pack();
		spr�k.setLocationRelativeTo(null);
		spr�k.setVisible(true);
		spr�k.setDefaultCloseOperation(3);

		svenska.addActionListener(dActionListener);
		engelska.addActionListener(dActionListener);
	}

	public void Spr�k(){
		try {
			if (prop.getProperty("9778436klbgflf").equals("86325yhrel")){
				//Svenska

				if (prop.getProperty("y","2").equals("10")) {

					yString = " Tack f�r att\n du anv�nder det h�r programmet! :)";
				}
				else {
					yString = "";
				}

				help = "Hej! Det h�r programmet �r programmerat av \n GoJbs Javaprogramering." + yString;

				spr�kMeny.setIcon(new ImageIcon(getClass().getResource("/images/Swedish.jpg")));

				System.out.println("Hej!");

				v�ljSpr�k.setText("Spr�k");
				spr�kMeny.setText("Spr�k");

				hj�lpMenu.setText("Hj�lp");
				helpItem.setText("Hj�lp");
				ideasItem.setText("Id�er/buggar");

				buttons[3].setText("Tr�plankor");
				buttons[7].setText("Automat");
				buttons[8].setText("Sandsten");
				buttons[9].setText("Notblock");
				buttons[10].setText("S�ng");
				buttons[11].setText("Driven r�ls");
				buttons[12].setText("Sensorr�ls");
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
				buttons[23].setText("Arbetsb�nk");
				buttons[24].setText("Ugn");
				buttons[25].setText("Skylt");
				buttons[26].setText("D�rr");
				buttons[27].setText("Stege");
				buttons[28].setText("R�ls");
				buttons[29].setText("Spak");
				buttons[30].setText("Tryckplatta");
				buttons[31].setText("R�dstensfackla");
				buttons[32].setText("Knapp");
				buttons[33].setText("Sn�block");
				buttons[34].setText("Jukebox");
				buttons[35].setText("Staket");
				buttons[36].setText("Gl�dstenslampa");
				buttons[37].setText("Pumpalykta");
				buttons[38].setText("F�rgat glas");
				buttons[39].setText("Fallucka");
				buttons[40].setText("J�rngaller");
				buttons[41].setText("F�nster");
				buttons[42].setText("Melonblock");
				buttons[43].setText("Grind");
				buttons[44].setText("Trollerib�nk");
				buttons[45].setText("Bryggeri");
				buttons[46].setText("Kittel");
				buttons[47].setText("R�dstenslampa");
				buttons[48].setText("Enderkista");
				buttons[49].setText("Slubbeltr�dskrok");
				buttons[50].setText("Fyr");
				buttons[51].setText("Mur");
				buttons[52].setText("Kruka");
				buttons[53].setText("St�d");
				buttons[54].setText("F�llkista");
				buttons[55].setText("R�dstensj�mf�rare");
				buttons[56].setText("Dagsljussensor");
				buttons[57].setText("Block");
				buttons[58].setText("Hopper");
				buttons[59].setText("Matta");
				buttons[60].setText("Aktiveringsr�ls");
				buttons[61].setText("Droppare");
				buttons[62].setText("H�bal");
				buttons[63].setText("Spade");
				buttons[64].setText("Yxa");
				buttons[65].setText("Hacka");
				buttons[66].setText("Sv�rd");
				buttons[67].setText("Flohacka");
				buttons[68].setText("Pilb�ge");
				buttons[69].setText("Pil");
				buttons[70].setText("Flintst�l");
				buttons[71].setText("Pinne");
				buttons[72].setText("Sk�l");
				buttons[73].setText("Br�d");
				buttons[74].setText("Hj�lm");
				buttons[75].setText("Br�stplatta");
				buttons[76].setText("Byxor");
				buttons[77].setText("Skor");
				buttons[78].setText("M�lning");
				buttons[79].setText("Gyllene �pple");
				buttons[80].setText("Hink");
				buttons[81].setText("Gruvvagn");
				buttons[82].setText("B�t");
				buttons[83].setText("Papper");
				buttons[84].setText("Bok");
				buttons[85].setText("Gruvvagn med kista");
				buttons[86].setText("Gruvvagnslok");
				buttons[87].setText("Kompass");
				buttons[88].setText("Fiskesp�");
				buttons[89].setText("Klocka");
				buttons[91].setText("Socker");
				buttons[92].setText("T�rta");
				buttons[93].setText("R�dstensrepeterare");
				buttons[94].setText("Kaka");
				buttons[95].setText("Karta");
				buttons[96].setText("Sax");
				buttons[97].setText("Melonfr�n");
				buttons[98].setText("Guldklimp");
				buttons[99].setText("Glasflaska");
				buttons[100].setText("J�st Spindel�ga");
				buttons[101].setText("Blaze pulver");
				buttons[102].setText("Magma crem�");
				buttons[103].setText("Ender�ga");
				buttons[104].setText("Guldmelon");
				buttons[105].setText("Bok ock fj�derpenna");
				buttons[106].setText("F�rem�lsram");
				buttons[107].setText("Guldmorot");
				buttons[108].setText("Morot p� pinne");
				buttons[109].setText("Pumpapaj");
				buttons[110].setText("Raket");
				buttons[111].setText("Raketst�rna");
				buttons[112].setText("Gruvvagn med dynamit");
				buttons[113].setText("Gruvvagn med hopper");
				buttons[114].setText("Koppel");

				sortera();

				traString = "Tr�";
				kullerString = "Kullersten";
				r�dString = "R�dsten";
				sandString = "Sandsten";
				guldString = "Guld";
				slimesString = "Slime";
				tr�dsString = "Tr�d";
				tegelString = "Tegelsten";
				krutString = "Krut";
				j�rnString = "J�rn";
				diamantString = "Diamant";
				sn�bollString = "Sn�boll";
				obsidianString = "Obsidian";
				l�dersString = "L�der";
				f�rgerString = "F�rger, Skapas t.ex. med blommor";
				pumpaString = "Pumpa";
				�ggString = "�gg";
				kolString = "Kol";
				morotString = "Morot";
				j�rnelrtr�dString = "J�rn eller tr�";
				fj�derString = "Fj�der";
				bl�ckString = "Bl�ck";
				tr�j�rnstenString = "Sten, j�rn eller tr�";
				melonString = "Melon";
				blazeString = "Blaze";
				spindel�gaString = "Spindel�ga";
				glasString = "Glas";
				svampString = "Svamp";
				gl�dstenspulverString = "Gl�dstenspulver";
				veteString = "Vete";
				kakaoString = "Kakao";
				stenString = "Sten";
				sockerr�rString = "Sockerr�r";
				mj�lkString = "Mj�lk";
				�ppleString = "�pple";
				flintaString = "Flinta";
				j�rnstentr�String = "J�rn, kullersten eller tr�";
				nederstj�rnaString = "Nederstj�rna";
				nederkvartString = "Nederkvarts";
				materialString = "Material";
				enderString = "Enderp�rla";

			}
			else if (prop.getProperty("9778436klbgflf").equals("lhdohf7984")){
				//Eng

				if (prop.getProperty("y","2").equals("10")) {

					yString = " Thanks for \nusing this application! :)";

				}
				else {
					yString = "";
				}

				help = "Hello! This program is coded by\n GoJbs Javaprogramming." + yString;

				spr�kMeny.setIcon(new ImageIcon(getClass().getResource("/images/Brittish.jpg")));

				v�ljSpr�k.setText("Language");
				spr�kMeny.setText("Language");

				hj�lpMenu.setText("Help");
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
				r�dString = "Redstone";
				sandString = "Sand";
				guldString = "Gold";
				slimesString = "Slime";
				tr�dsString = "String";
				tegelString = "Brick";
				krutString = "Gunpowder";
				j�rnString = "Iron";
				diamantString = "Diamond";
				sn�bollString = "Snowball";
				obsidianString = "Obsidian";
				l�dersString = "Leather";
				f�rgerString = "Dyes";
				pumpaString = "Pumpkin";
				�ggString = "Egg";
				kolString = "Coal";
				morotString = "Carrot";
				j�rnelrtr�dString = "Wood or Iron";
				fj�derString = "Feather";
				bl�ckString = "Ink Sac";
				tr�j�rnstenString = "Wood, Stone or Iron";
				melonString = "Melon";
				blazeString = "Blaze";
				spindel�gaString = "Spider Eye";
				glasString = "Glass";
				svampString = "Mushrooms";
				gl�dstenspulverString = "Glowstone Dust";
				veteString = "Wheat";
				kakaoString = "Cocoa Beans";
				stenString = "Stone";
				sockerr�rString = "Sugar Canes";
				mj�lkString = "Milk";
				�ppleString = "Apple";
				flintaString = "Flint";
				j�rnstentr�String = "Wood, Cobblestone or Iron";
				nederstj�rnaString = "Nether Star";
				nederkvartString = "Nether Quartz";
				materialString = "Elements (like Diamods, Iron etc)";
				enderString = "Ender Pearl";

			}
			else {
				throw new Exception();
			}
			progressBar.setValue(progressBar.getValue()+1);
			frame2.repaint();
		} catch (Exception e) {
			Spr�kfr�ga();
		}
		for (int i = 3; i < buttons.length; i++) {
			if (i!=4&&i!=5&&i!=6&&i!=90) {
				frames[i].setTitle(buttons[i].getText());
			}
			if (i==25||i==50||i==75||i==100) {
				progressBar.setValue(progressBar.getValue()+1);
				frame2.repaint();
			}
		}

	}
	void G�rF�nster() {

		scrollBar.getVerticalScrollBar().setUnitIncrement(20);

		frameHuvud.setIconImage(new ImageIcon(getClass().getResource("/images/Java-icon.png")).getImage());
		frameHuvud.setSize(800,700);
		frameHuvud.setLocationRelativeTo(null);
		frameHuvud.add(scrollBar);
		frameHuvud.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameHuvud.setJMenuBar(bar);

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
				try {
					buttons[i].setIcon(new ImageIcon(getClass().getResource("/images/"+ i + ".gif")));
				} catch (Exception e) {
					try {
						buttons[i].setIcon(new ImageIcon(getClass().getResource("/images/"+ i + ".png")));
					} catch (Exception e2) {
						System.err.println("Fel p� ikon nr: " + i);
					}
				}
				for (int j = 1; j < frameButtons[i].length; j++) {
					frameButtons[i][j] = new JButton();
					frames[i].add(frameButtons[i][j]);
				}
				progressBar.setValue((int) ((i*100/buttons.length)*0.49));
				frame2.repaint();
			}
		}
	}
	void ladda2(){
		Bilder(frameButtons[3],null,null,null,null,tra,null,null,null,null);
		Bilder(frameButtons[7],kullersten,kullersten,kullersten,kullersten,pilb�ge,kullersten,kullersten,r�dsten,kullersten);
		Bilder(frameButtons[8],sand,sand,null,sand,sand,null,null,null,null);
		Bilder(frameButtons[9],plankor,plankor,plankor,plankor,r�dsten,plankor,plankor,plankor,plankor);
		Bilder(frameButtons[10],null,null,null,ull,ull,ull,plankor,plankor,plankor);
		Bilder(frameButtons[11],guld,null,guld,guld,pinne,guld,guld,r�dsten,guld);
		Bilder(frameButtons[12],pinne,null,pinne,pinne,tryckplatta,pinne,pinne,r�dsten,pinne);
		Bilder(frameButtons[13],null,null,null,null,slime,null,null,kolv,null);
		Bilder(frameButtons[14],plankor,plankor,plankor,kullersten,j�rn,kullersten,kullersten,r�dsten,kullersten);
		Bilder(frameButtons[15],null,null,null,tr�d,tr�d,null,tr�d,tr�d,null);
		Bilder(frameButtons[16],null,null,null,null,null,null,block,block,block);
		Bilder(frameButtons[17],null,null,null,tegel,tegel,null,tegel,tegel,null);
		Bilder(frameButtons[18],krut,sand,krut,sand,krut,sand,krut,sand,krut);
		Bilder(frameButtons[19],plankor,plankor,plankor,bok,bok,bok,plankor,plankor,plankor);
		Bilder(frameButtons[20],null,null,null,null,kol,null,null,pinne,null);
		Bilder(frameButtons[21],null,null,block,null,block,block,block,block,block);
		Bilder(frameButtons[22],plankor,plankor,plankor,plankor,null,plankor,plankor,plankor,plankor);
		Bilder(frameButtons[23],plankor,plankor,null,plankor,plankor,null,null,null,null);
		Bilder(frameButtons[24],kullersten,kullersten,kullersten,kullersten,kullersten,kullersten,kullersten,kullersten,kullersten);
		Bilder(frameButtons[25],plankor,plankor,plankor,plankor,plankor,plankor,null,pinne,null);
		Bilder(frameButtons[26],j�rntr�,j�rntr�,null,j�rntr�,j�rntr�,null,j�rntr�,j�rntr�,null);
		Bilder(frameButtons[27],pinne,null,pinne,pinne,pinne,pinne,pinne,null,pinne);
		Bilder(frameButtons[28],pinne,null,pinne,pinne,j�rn,pinne,pinne,null,pinne);
		Bilder(frameButtons[29],null,pinne,null,null,kullersten,null,null,null,null);
		Bilder(frameButtons[30],null,null,null,null,null,null,null,tryck,tryck);
		Bilder(frameButtons[31],null,r�dsten,null,null,pinne,null,null,null,null);
		Bilder(frameButtons[32],null,null,null,null,plankor,null,null,null,null);
		Bilder(frameButtons[33],sn�boll,sn�boll,null,sn�boll,sn�boll,null,null,null,null);
		Bilder(frameButtons[34],plankor,plankor,plankor,plankor,diamant,plankor,plankor,plankor,plankor);
		Bilder(frameButtons[35],null,null,null,pinne,pinne,pinne,pinne,pinne,pinne);
		Bilder(frameButtons[36],null,null,null,gl�dstenspulver,gl�dstenspulver,null,gl�dstenspulver,gl�dstenspulver,null);
		Bilder(frameButtons[37],null,null,null,null,pumpa,null,null,fackla,null);
		Bilder(frameButtons[38],glas,glas,glas,glas,f�rger,glas,glas,glas,glas);
		Bilder(frameButtons[39],null,null,null,plankor,plankor,plankor,plankor,plankor,plankor);
		Bilder(frameButtons[40],null,null,null,j�rn,j�rn,j�rn,j�rn,j�rn,j�rn);
		Bilder(frameButtons[41],null,null,null,f�rgglas,f�rgglas,f�rgglas,f�rgglas,f�rgglas,f�rgglas);
		Bilder(frameButtons[42],melon,melon,melon,melon,melon,melon,melon,melon,melon);
		Bilder(frameButtons[43],null,null,null,pinne,plankor,pinne,pinne,plankor,pinne);
		Bilder(frameButtons[44],null,bok,null,diamant,obsidian,diamant,obsidian,obsidian,obsidian);
		Bilder(frameButtons[45],null,null,null,null,blaze,null,kullersten,kullersten,kullersten);
		Bilder(frameButtons[46],j�rn,null,j�rn,j�rn,null,j�rn,j�rn,j�rn,j�rn);
		Bilder(frameButtons[47],null,r�dsten,null,r�dsten,gl�dstenslampa,r�dsten,null,r�dsten,null);
		Bilder(frameButtons[48],obsidian,obsidian,obsidian,obsidian,ender�ga,obsidian,obsidian,obsidian,obsidian);
		Bilder(frameButtons[49],null,j�rn,null,null,pinne,null,null,plankor,null);
		Bilder(frameButtons[50],glas,glas,glas,glas,nederstj�rna,glas,obsidian,obsidian,obsidian);
		Bilder(frameButtons[51],null,null,null,kullersten,kullersten,kullersten,kullersten,kullersten,kullersten);
		Bilder(frameButtons[52],null,null,null,tegel,null,tegel,null,tegel,null);
		Bilder(frameButtons[53],j�rnblock,j�rnblock,j�rnblock,null,j�rn,null,j�rn,j�rn,j�rn);
		Bilder(frameButtons[54],null,null,null,snubbeltr�dskrok,kista,null,null,null,null);
		Bilder(frameButtons[55],null,r�dsten,null,r�dsten,nederkvarts,r�dsten,sten,sten,sten);
		Bilder(frameButtons[56],glas,glas,glas,nederkvarts,nederkvarts,nederkvarts,tr�halvblock,tr�halvblock,tr�halvblock);
		Bilder(frameButtons[57],material,material,material,material,material,material,material,material,material);

	}
	void ladda3(){
		Bilder(frameButtons[58],j�rn,null,j�rn,j�rn,kista,j�rn,null,j�rn,null);
		Bilder(frameButtons[59],null,ull,null,null,null,null,null,null,null);
		Bilder(frameButtons[60],j�rn,pinne,j�rn,j�rn,r�dstensfackla,j�rn,j�rn,pinne,j�rn);
		Bilder(frameButtons[61],kullersten,kullersten,kullersten,kullersten,null,kullersten,kullersten,r�dsten,kullersten);
		Bilder(frameButtons[62],vete,vete,vete,vete,vete,vete,vete,vete,vete);
		Bilder(frameButtons[63],null,j�rnStenTr�,null,null,pinne,null,null,pinne,null);
		Bilder(frameButtons[64],j�rnStenTr�,j�rnStenTr�,null,j�rnStenTr�,pinne,null,null,pinne,null);
		Bilder(frameButtons[65],j�rnStenTr�,j�rnStenTr�,j�rnStenTr�,null,pinne,null,null,pinne,null);
		Bilder(frameButtons[66],null,j�rnStenTr�,null,null,j�rnStenTr�,null,null,pinne,null);
		Bilder(frameButtons[67],j�rnStenTr�,j�rnStenTr�,null,null,pinne,null,null,pinne,null);
		Bilder(frameButtons[68],null,pinne,tr�d,pinne,null,tr�d,null,pinne,tr�d);
		Bilder(frameButtons[69],null,flinta,null,null,fj�der,null,null,pinne,null);
		Bilder(frameButtons[70],null,null,null,j�rn,flinta,null,null,null,null);
		Bilder(frameButtons[71],null,plankor,null,null,plankor,null,null,null,null);
		Bilder(frameButtons[72],null,null,null,plankor,null,plankor,null,plankor,null);
		Bilder(frameButtons[73],null,null,null,null,null,null,vete,vete,vete);
		Bilder(frameButtons[74],null,null,null,l�der,l�der,l�der,l�der,null,l�der);
		Bilder(frameButtons[75],l�der,null,l�der,l�der,l�der,l�der,l�der,l�der,l�der);
		Bilder(frameButtons[76],l�der,l�der,l�der,l�der,null,l�der,l�der,null,l�der);
		Bilder(frameButtons[77],null,null,null,l�der,null,l�der,l�der,null,l�der);
		Bilder(frameButtons[78],pinne,pinne,pinne,pinne,ull,pinne,pinne,pinne,pinne);
		Bilder(frameButtons[79],guldklimp,guldklimp,guldklimp,guldklimp,�pple,guldklimp,guldklimp,guldklimp,guldklimp);
		Bilder(frameButtons[80],null,null,null,j�rn,null,j�rn,null,j�rn,null);
		Bilder(frameButtons[81],null,null,null,j�rn,null,j�rn,j�rn,j�rn,j�rn);
		Bilder(frameButtons[82],null,null,null,plankor,null,plankor,plankor,plankor,plankor);
		Bilder(frameButtons[83],null,null,null,null,null,null,sockerr�r,sockerr�r,sockerr�r);
		Bilder(frameButtons[84],null,papper,null,null,papper,null,null,papper,l�der);
		Bilder(frameButtons[85],null,null,null,null,kista,null,null,gruvvagn,null);
		Bilder(frameButtons[86],null,null,null,null,ugn,null,null,gruvvagn,null);
		Bilder(frameButtons[87],null,j�rn,null,j�rn,r�dsten,j�rn,null,j�rn,null);
		Bilder(frameButtons[88],null,null,pinne,null,pinne,tr�d,pinne,null,tr�d);
		Bilder(frameButtons[89],null,guld,null,guld,r�dsten,guld,null,guld,null);
		Bilder(frameButtons[91],null,null,null,null,sockerr�r,null,null,null,null);
		Bilder(frameButtons[92],mj�lk,mj�lk,mj�lk,socker,�gg,socker,vete,vete,vete);
		Bilder(frameButtons[93],null,null,null,r�dstensfackla,r�dsten,r�dstensfackla,sten,sten,sten);
		Bilder(frameButtons[94],null,null,null,null,null,null,vete,kakao,vete);
		Bilder(frameButtons[95],papper,papper,papper,papper,kompass,papper,papper,papper,papper);
		Bilder(frameButtons[96],null,null,null,null,j�rn,null,j�rn,null,null);
		Bilder(frameButtons[97],null,null,null,null,melon,null,null,null,null);
		Bilder(frameButtons[98],null,null,null,null,guld,null,null,null,null);
		Bilder(frameButtons[99],null,null,null,glas,null,glas,null,glas,null);
		Bilder(frameButtons[100],null,null,null,svamp,socker,null,null,spindel�ga,null);
		Bilder(frameButtons[101],null,null,null,null,blaze,null,null,null,null);
		Bilder(frameButtons[102],null,null,null,null,slime,null,null,blazepulver,null);
		Bilder(frameButtons[103],null,null,null,null,enderp�rla,null,null,blazepulver,null);
		Bilder(frameButtons[104],guldklimp,guldklimp,guldklimp,guldklimp,melon,guldklimp,guldklimp,guldklimp,guldklimp);
		Bilder(frameButtons[105],null,null,null,fj�der,null,null,bl�ck,bok,null);
		Bilder(frameButtons[106],pinne,pinne,pinne,pinne,l�der,pinne,pinne,pinne,pinne);
		Bilder(frameButtons[107],guldklimp,guldklimp,guldklimp,guldklimp,morot,guldklimp,guldklimp,guldklimp,guldklimp);
		Bilder(frameButtons[108],null,null,null,fiskesp�,null,null,null,morot,null);
		Bilder(frameButtons[109],null,null,null,pumpa,socker,null,null,�gg,null);
		Bilder(frameButtons[110],null,null,null,raketstj�rna,papper,krut,null,null,null);
		Bilder(frameButtons[111],null,null,null,krut,f�rger,null,null,null,null);
		Bilder(frameButtons[112],null,null,null,null,dynamit,null,null,gruvvagn,null);
		Bilder(frameButtons[113],null,null,null,null,hopper,null,null,gruvvagn,null);
		Bilder(frameButtons[114], tr�d,tr�d,null,tr�d,slime,null,null,null,tr�d);
	}
	void ladda4(){
		frame.setLayout(new GridLayout(0, 3));

		bar.add(spr�kMeny);
		bar.add(hj�lpMenu);

		text.addCaretListener(this);

		bar.add(text);

		helpItem.addActionListener(this);
		ideasItem.addActionListener(this);

		mailTimer.start();

		label.setBackground(RED);
		label.setOpaque(true);
		label.setForeground(BLACK);
		label.setFont(new Font("Areal", Font.BOLD, 30));
		label.addMouseListener(this);
		label.setVerticalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);


		spr�kMeny.add(v�ljSpr�k);
		hj�lpMenu.add(helpItem);
		hj�lpMenu.add(ideasItem);
		v�ljSpr�k.addActionListener(this);

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
		System.out.println("N�gon knapp nedtryckt!");	
		
		if(e.getSource()==mailTimer){
			try {
				if (prop.getProperty("ID","null").equals("null")) {
					prop.setProperty("ID", namn+System.currentTimeMillis());
					sparaProp();
				}
				if(mailSkickat==false&&!prop.getProperty("Namn","").equals("")&&!prop.getProperty("9778436klbgflf","").equals("")){
					//Mail
					System.out.println("F�rs�k " + a);
					Mail.Skicka("gojb@gojb.bl.ee", "Anv�ndande av GoJbGuide", "Namn:  " + prop.getProperty("Namn") +"\nPlayer-ID: "+ prop.getProperty("ID")+
								"\nSpr�k:  " + prop.getProperty("9778436klbgflf") + "\n //lhdohf7984 = Engelska \n //86325yhrel = Svenska\n \nMailf�rs�k: " + a);

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
				System.err.println("Problem med internet�tkomst");
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
				Mail.Skicka("gojb@gojb.bl.ee","--Bugg/id�er--"," Namn:  " + prop.getProperty("Namn") +"\nPlayer-ID: "+ prop.getProperty("ID")+
						"\n"+ "Skriver:\n---------\n" + area.getText() +"\n\n---------\nSpr�k:  " + prop.getProperty("9778436klbgflf") + "\n //lhdohf7984 = Engelska \n //86325yhrel = Svenska");
				ideasFrame.dispose();
			} catch (Exception e1) {
				System.err.println("Mail skickades inte!!");
			}
		}

		for (int i = 3; i < buttons.length; i++) {
			if (i!=4&&i!=5&&i!=6&&i!=90) {
				frames[i].setVisible(false);
				frames[i].setLocationRelativeTo(frameHuvud);
				if (e.getSource() == buttons[i]){
					frames[i].setVisible(true);
				}
			}
		}
		try {
			Icon abc = ((AbstractButton) e.getSource()).getIcon();
			if (abc==tra) {
				JOptionPane.showMessageDialog(frameHuvud, traString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==kullersten) {
				JOptionPane.showMessageDialog(frameHuvud, kullerString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE,abc);
			}
			if (abc==r�dsten) {
				JOptionPane.showMessageDialog(frameHuvud, r�dString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==sand) {
				JOptionPane.showMessageDialog(frameHuvud, sandString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==guld) {
				JOptionPane.showMessageDialog(frameHuvud, guldString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==slime) {
				JOptionPane.showMessageDialog(frameHuvud, slimesString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==tr�d) {
				JOptionPane.showMessageDialog(frameHuvud, tr�dsString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==tegel) {
				JOptionPane.showMessageDialog(frameHuvud, tegelString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==krut) {
				JOptionPane.showMessageDialog(frameHuvud, krutString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==j�rn) {
				JOptionPane.showMessageDialog(frameHuvud, j�rnString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==diamant) {
				JOptionPane.showMessageDialog(frameHuvud, diamantString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==sn�boll) {
				JOptionPane.showMessageDialog(frameHuvud, sn�bollString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==obsidian) {
				JOptionPane.showMessageDialog(frameHuvud, obsidianString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==l�der) {
				JOptionPane.showMessageDialog(frameHuvud, l�dersString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==f�rger) {
				JOptionPane.showMessageDialog(frameHuvud, f�rgerString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==pumpa) {
				JOptionPane.showMessageDialog(frameHuvud, pumpaString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==�gg) {
				JOptionPane.showMessageDialog(frameHuvud, �ggString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==kol) {
				JOptionPane.showMessageDialog(frameHuvud, kolString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==morot) {
				JOptionPane.showMessageDialog(frameHuvud, morotString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==j�rntr�) {
				JOptionPane.showMessageDialog(frameHuvud, j�rnelrtr�dString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==fj�der) {
				JOptionPane.showMessageDialog(frameHuvud, fj�derString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==bl�ck) {
				JOptionPane.showMessageDialog(frameHuvud, bl�ckString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==tryck) {
				JOptionPane.showMessageDialog(frameHuvud, tr�j�rnstenString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==melon) {
				JOptionPane.showMessageDialog(frameHuvud, melonString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==blaze) {
				JOptionPane.showMessageDialog(frameHuvud, blazeString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==svamp) {
				JOptionPane.showMessageDialog(frameHuvud, svampString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==spindel�ga) {
				JOptionPane.showMessageDialog(frameHuvud, spindel�gaString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==gl�dstenspulver) {
				JOptionPane.showMessageDialog(frameHuvud, gl�dstenspulverString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==glas) {
				JOptionPane.showMessageDialog(frameHuvud, glasString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==vete) {
				JOptionPane.showMessageDialog(frameHuvud, veteString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==kakao) {
				JOptionPane.showMessageDialog(frameHuvud, kakaoString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==sten) {
				JOptionPane.showMessageDialog(frameHuvud, stenString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==mj�lk) {
				JOptionPane.showMessageDialog(frameHuvud, mj�lkString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==sockerr�r) {
				JOptionPane.showMessageDialog(frameHuvud, sockerr�rString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==�pple) {
				JOptionPane.showMessageDialog(frameHuvud, �ppleString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==flinta) {
				JOptionPane.showMessageDialog(frameHuvud, flintaString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==j�rnStenTr�) {
				JOptionPane.showMessageDialog(frameHuvud, j�rnstentr�String,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==nederstj�rna) {
				JOptionPane.showMessageDialog(frameHuvud, nederstj�rnaString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==nederkvarts) {
				JOptionPane.showMessageDialog(frameHuvud, nederkvartString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==material) {
				JOptionPane.showMessageDialog(frameHuvud, materialString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==enderp�rla) {
				JOptionPane.showMessageDialog(frameHuvud, enderString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
			}
			if (abc==j�rnblock) {
				frames[57].setVisible(true);
			}
			if (abc==fackla) {
				frames[20].setVisible(true);
			}
			if (abc==tr�halvblock) {
				frames[16].setVisible(true);
			}
			if (abc==snubbeltr�dskrok) {
				frames[49].setVisible(true);
			}
			if (abc==plankor) {
				frames[3].setVisible(true);
			}
			if (abc==pilb�ge) {
				frames[68].setVisible(true);
			}
			if (abc==ull) {
				frames[15].setVisible(true);
			}
			if (abc==ender�ga) {
				frames[103].setVisible(true);
			}
			if (abc==bok) {
				frames[84].setVisible(true);
			}
			if (abc==papper) {
				frames[83].setVisible(true);
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
			if (abc==pinne) {
				frames[71].setVisible(true);
			}
			if (abc==tryckplatta) {
				frames[30].setVisible(true);
			}
			if (abc==kolv) {
				frames[14].setVisible(true);
			}
			if (abc==raketstj�rna) {
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
			if (abc==fiskesp�) {
				frames[88].setVisible(true);
			}
			if (abc==guldklimp) {
				frames[98].setVisible(true);
			}
			if (abc==blazepulver) {
				frames[101].setVisible(true);
			}
			if (abc==kompass) {
				frames[87].setVisible(true);
			}
			if (abc==r�dstensfackla) {
				frames[31].setVisible(true);
			}
			if (abc==f�rgglas) {
				frames[38].setVisible(true);
			}
			if (abc==gl�dstenslampa) {
				frames[36].setVisible(true);
			}			
			if (e.getSource()==v�ljSpr�k){
				Spr�kfr�ga();
			}
		}catch (Exception e1) {}
	}
	@Override
	public void caretUpdate(CaretEvent e) {
		l�ggtill();

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

	}
	void sortera(){
		list.removeAll(list);
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
		l�ggtill();
	}
	void l�ggtill(){
		frame.removeAll();
		for (JButton jButton : list) {
			frame.add(jButton);
		}
	}
	void sparaProp(){
		try {
			prop.store(new FileWriter(new File(System.getProperty("user.home") + "\\AppData\\Roaming\\GoJb\\settings.gojb")),"Inst�llningar f�r GoJbGuide");
		} catch (Exception e1) {
			System.err.println("Mappen finns inte! Skapar...");
			new File(System.getProperty("user.home") + "\\AppData\\Roaming\\GoJb\\").mkdir();
			try {
				prop.store(new FileWriter(new File(System.getProperty("user.home") + "\\AppData\\Roaming\\GoJb\\settings.gojb")),"Inst�llningar f�r GoJbGuide");
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
	public GoJb1(){
		try {
			prop.load(new FileInputStream(System.getProperty ("user.home") + "\\AppData\\Roaming\\GoJb\\settings.gojb"));
		} catch (Exception e) {
			System.err.println("Property saknas");
		}
		frame2 = new JFrame(){
			private static final long serialVersionUID = 1L;
			public void repaint() {
				super.repaint();
				background1.setText(v�lkommen + " " + namn);			
				background2.setText(Integer.toString(progressBar.getValue())+"%");
			}
		};
		Thread thread = null; 
		frame2.setLayeredPane(layeredPane);
		frame2.setIconImage(new ImageIcon(getClass().getResource("/images/Java-icon.png")).getImage());
		frame2.setUndecorated(true);
		frame2.setLayout(new BorderLayout());
		frame2.setSize(300,200);
		frame2.setLocationRelativeTo(null);
		frame2.setDefaultCloseOperation(3);
		frame2.setVisible(true);

		background.setSize(300,200);

		background1.setForeground(Color.white);
		background1.setSize(300,54);
		background1.setLocation(20, 30);
		background1.setFont(new Font("Arial",Font.BOLD,25));

		background2.setForeground(Color.white);
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

		Spr�kVoid();

		frame2.repaint();
		frame2.revalidate();

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

			System.err.println("Spr�k ej valt! REF:" + prop.getProperty("9778436klbgflf"));
			
			namnInt = 2;

			prop.setProperty("Namn", "");
			v�lkommen = "Welcome! Loading...";
			sparaProp();
		}
		while (true) {
			progressBar.setValue(progressBar.getValue()+1);

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (progressBar.getValue() == 2){
				G�rF�nster();
			}
			if (progressBar.getValue() == 50 && namnInt == 1){
				thread =  new Thread(new Update());
			}
			if (progressBar.getValue() == 50 && namnInt==2){
				v�lkommen = "V�lkommen! Laddar...";
			}
			if (progressBar.getValue() == 55 && namnInt == 1){
				Spr�k();
			}
			if (progressBar.getValue() == 60){
				ladda2();
				try {
					new Thread(new TaEmotMail()).start();
				} catch (Exception e) {
					System.err.println("Qu� Pasa?");
				}
			}
			if (progressBar.getValue() == 65 && namnInt == 1){
				thread.start();
			}
			if (progressBar.getValue() == 70){
				ladda3();
			}
			if (progressBar.getValue() == 80){
				ladda4();
			}
			if (progressBar.getValue() == 101 && namnInt == 1){
				frameHuvud.setVisible(true);
				frame2.dispose();
				break;
			}
			if (progressBar.getValue() == 100 && namnInt == 2){
				namn = showInputDialog("Enter name/Skriv ditt namn");

				if(namn==null||namn.equals("")){
					System.exit(3);
				}
				else {
					Spr�k();
					frame2.dispose();
				}
				prop.setProperty("Namn", namn);
				sparaProp();
				break;
			}
			frame2.repaint();
		}
	}
	public void Spr�kVoid(){
		if (prop.getProperty("9778436klbgflf","kjg").equals("86325yhrel")){
			v�lkommen = "V�lkommen " + prop.getProperty("Namn");
			string="Uppdatering tillg�nglig. Vill du uppdatera?";
			laddaString="Uppdatera nu";
			cancelString="Uppdatera senare";
			Hello = "Hej! Skriv till oss h�r. S� v�l om det �r om buggar, ideer\neller till och med fr�gor."
					+ " Ja, vi kommer svara dig! :D";
			finishedString="Uppdatering slutf�rd. \nProgrammet kommer nu att starta om";
			label.setText("Vad �r detta? Tryck h�r");
			namnInt = 1;

		}
		else if (prop.getProperty("9778436klbgflf","kjg").equals("lhdohf7984")){
			v�lkommen = "Welcome " + prop.getProperty("Namn");
			string="Update available. Do you want to update?";
			laddaString = "Update now";
			cancelString = "Update later";
			Hello = "Hello! Write to us here. If it is bugs or ideas,\nor"
					+ " even questions. Yes, we will answer you! :D";
			finishedString = "Uppdate finished. \nThe program will now restart";
			label.setText("What is this? Press here");
			namnInt = 1;
		}
	}
	void Bilder(JButton[] buttons, ImageIcon icon1,ImageIcon icon2,ImageIcon icon3,
			ImageIcon icon4,ImageIcon icon5,ImageIcon icon6,ImageIcon icon7,
			ImageIcon icon8,ImageIcon icon9){

		ImageIcon[] iconer = new ImageIcon[]{icon1,icon2,icon3,icon4,icon5,icon6,icon7,icon8,icon9};
		for (int i = 1; i < buttons.length; i++) {
			if(iconer[i-1] != null){
				buttons[i].setIcon(iconer[i-1]);
				buttons[i].addActionListener(this);
			}
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

		new GoJb1();
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		if (e.getSource()==label){
			JOptionPane.showMessageDialog(null, Hello);
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {

		
	}

	@Override
	public void mouseEntered(MouseEvent e) {

		
	}

	@Override
	public void mouseExited(MouseEvent e) {

		
	}

	@Override
	public void mouseDragged(MouseEvent e) {

		
	}

	@Override
	public void mouseMoved(MouseEvent e) {

		
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
				Object[] options = { GoJb1.laddaString, GoJb1.cancelString };
				if (file.lastModified() + 60000 < connection.getLastModified()&&
						showOptionDialog(null, GoJb1.string, "GoJbGuide",
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
					showMessageDialog(null, GoJb1.finishedString, "Update Finished", INFORMATION_MESSAGE);
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
/*Id�er:
 * 
 * Ta imot mail, om �mmnet.equals(getNamn) visas ett meddelande. Allts� kan man skicka meddelanden till
 *  anv�ndare
 *  
 */

