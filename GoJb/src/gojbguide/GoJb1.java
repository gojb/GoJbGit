package gojbguide;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import java.util.*;

import javax.swing.*;
import javax.swing.Timer;

import static gojbguide.GoJb1.*;
import static java.awt.Color.*;
import static javax.swing.JOptionPane.*;


/**
 * @author GoJb
 *
 *
 */

public class GoJb1 implements ActionListener, KeyListener{

	static int eng�ngs�ppning = 1;
	public static Properties prop = new Properties();
	
	static String help;
	static String namn,yString;
	
	JButton svenska = new JButton("Svenska"),
			engelska = new JButton("English");
	
	JMenuBar bar = new JMenuBar();
	
	ArrayList<JButton> list = new ArrayList<JButton>();
	
	JTextField text = new JTextField();
	
	Timer mailTimer = new Timer(1000, this);
	
	JMenu spr�kMeny = new JMenu(),
			hj�lpMenu = new JMenu("Hj�lp");
	
	JMenuItem 	v�ljSpr�k = new JMenuItem(),
				helpItem = new JMenuItem("Hj�lp");
	
	JButton[] 	buttons3 = new JButton[10],
				buttons7 = new JButton[10],
				buttons8 = new JButton[10],
				buttons9 = new JButton[10],
				buttons10 = new JButton[10],
				buttons11 = new JButton[10],
				buttons12 = new JButton[10],
				buttons13 = new JButton[10],
				buttons14 = new JButton[10],
				buttons15 = new JButton[10],
				buttons16 = new JButton[10],
				buttons17 = new JButton[10],
				buttons18 = new JButton[10],
				buttons19 = new JButton[10],
				buttons20 = new JButton[10],
				buttons21 = new JButton[10],
				buttons22 = new JButton[10],
				buttons23 = new JButton[10],
				buttons24 = new JButton[10],
				buttons25 = new JButton[10],
				buttons26 = new JButton[10],
				buttons27 = new JButton[10],
				buttons28 = new JButton[10],
				buttons29 = new JButton[10],
				buttons30 = new JButton[10],
				buttons31 = new JButton[10],
				buttons32 = new JButton[10],
				buttons33 = new JButton[10],
				buttons34 = new JButton[10],
				buttons35 = new JButton[10],
				buttons36 = new JButton[10],
				buttons37 = new JButton[10],
				buttons38 = new JButton[10],
				buttons39 = new JButton[10],
				buttons40 = new JButton[10],
				buttons41 = new JButton[10],
				buttons42 = new JButton[10],
				buttons43 = new JButton[10],
				buttons44 = new JButton[10],
				buttons45 = new JButton[10],
				buttons46 = new JButton[10],
				buttons47 = new JButton[10],
				buttons48 = new JButton[10],
				buttons49 = new JButton[10],
				buttons50 = new JButton[10],
				buttons51 = new JButton[10],
				buttons52 = new JButton[10],
				buttons53 = new JButton[10],
				buttons54 = new JButton[10],
				buttons55 = new JButton[10],
				buttons56 = new JButton[10],
				buttons57 = new JButton[10],
				buttons58 = new JButton[10],
				buttons59 = new JButton[10],
				buttons60 = new JButton[10],
				buttons61 = new JButton[10],
				buttons62 = new JButton[10],
				buttons63 = new JButton[10],
				buttons64 = new JButton[10],
				buttons65 = new JButton[10],
				buttons66 = new JButton[10],
				buttons67 = new JButton[10],
				buttons68 = new JButton[10],
				buttons69 = new JButton[10],
				buttons70 = new JButton[10],
				buttons71 = new JButton[10],
				buttons72 = new JButton[10],
				buttons73 = new JButton[10],
				buttons74 = new JButton[10],
				buttons75 = new JButton[10],
				buttons76 = new JButton[10],
				buttons77 = new JButton[10],
				buttons78 = new JButton[10],
				buttons79 = new JButton[10],
				buttons80 = new JButton[10],
				buttons81 = new JButton[10],
				buttons82 = new JButton[10],
				buttons83 = new JButton[10],
				buttons84 = new JButton[10],
				buttons85 = new JButton[10],
				buttons86 = new JButton[10],
				buttons87 = new JButton[10],
				buttons88 = new JButton[10],
				buttons89 = new JButton[10],
				buttons91 = new JButton[10],
				buttons92 = new JButton[10],
				buttons93 = new JButton[10],
				buttons94 = new JButton[10],
				buttons95 = new JButton[10],
				buttons96 = new JButton[10],
				buttons97 = new JButton[10],
				buttons98 = new JButton[10],
				buttons99 = new JButton[10],
				buttons100 = new JButton[10],
				buttons101 = new JButton[10],
				buttons102 = new JButton[10],
				buttons103 = new JButton[10],
				buttons104 = new JButton[10],
				buttons105 = new JButton[10],
				buttons106 = new JButton[10],
				buttons107 = new JButton[10],
				buttons108 = new JButton[10],
				buttons109 = new JButton[10],
				buttons110 = new JButton[10],
				buttons111 = new JButton[10],
				buttons112 = new JButton[10],
				buttons113 = new JButton[10],
				buttons114 = new JButton[10];


	JFrame 		frame3 = new JFrame(),
				frame7 = new JFrame(),
				frame8 = new JFrame(),
				frame9 = new JFrame(),
				frame10 = new JFrame(),
				frame11 = new JFrame(),
				frame12 = new JFrame(),
				frame13 = new JFrame(),
				frame14 = new JFrame(),
				frame15 = new JFrame(),
				frame16 = new JFrame(),
				frame17 = new JFrame(),
				frame18 = new JFrame(),
				frame19 = new JFrame(),
				frame20 = new JFrame(),
				frame21 = new JFrame(),
				frame22 = new JFrame(),
				frame23 = new JFrame(),
				frame24 = new JFrame(),
				frame25 = new JFrame(),
				frame26 = new JFrame(),
				frame27 = new JFrame(),
				frame28 = new JFrame(),
				frame29 = new JFrame(),
				frame30 = new JFrame(),
				frame31 = new JFrame(),
				frame32 = new JFrame(),
				frame33 = new JFrame(),
				frame34 = new JFrame(),
				frame35 = new JFrame(),
				frame36 = new JFrame(),
				frame37 = new JFrame(),
				frame38 = new JFrame(),
				frame39 = new JFrame(),
				frame40 = new JFrame(),
				frame41 = new JFrame(),
				frame42 = new JFrame(),
				frame43 = new JFrame(),
				frame44 = new JFrame(),
				frame45 = new JFrame(),
				frame46 = new JFrame(),
				frame47 = new JFrame(),
				frame48 = new JFrame(),
				frame49 = new JFrame(),
				frame50 = new JFrame(),
				frame51 = new JFrame(),
				frame52 = new JFrame(),
				frame53 = new JFrame(),
				frame54 = new JFrame(),
				frame55 = new JFrame(),
				frame56 = new JFrame(),
				frame57 = new JFrame(),
				frame58 = new JFrame(),
				frame59 = new JFrame(),
				frame60 = new JFrame(),
				frame61 = new JFrame(),
				frame62 = new JFrame(),
				frame63 = new JFrame(),
				frame64 = new JFrame(),
				frame65 = new JFrame(),
				frame66 = new JFrame(),
				frame67 = new JFrame(),
				frame68 = new JFrame(),
				frame69 = new JFrame(),
				frame70 = new JFrame(),
				frame71 = new JFrame(),
				frame72 = new JFrame(),
				frame73 = new JFrame(),
				frame74 = new JFrame(),
				frame75 = new JFrame(),
				frame76 = new JFrame(),
				frame77 = new JFrame(),
				frame78 = new JFrame(),
				frame79 = new JFrame(),
				frame80 = new JFrame(),
				frame81 = new JFrame(),
				frame82 = new JFrame(),
				frame83 = new JFrame(),
				frame84 = new JFrame(),
				frame85 = new JFrame(),
				frame86 = new JFrame(),
				frame87 = new JFrame(),
				frame88 = new JFrame(),
				frame89 = new JFrame(),
				frame91 = new JFrame(),
				frame92 = new JFrame(),
				frame93 = new JFrame(),
				frame94 = new JFrame(),
				frame95 = new JFrame(),
				frame96 = new JFrame(),
				frame97 = new JFrame(),
				frame98 = new JFrame(),
				frame99 = new JFrame(),
				frame100 = new JFrame(),
				frame101 = new JFrame(),
				frame102 = new JFrame(),
				frame103 = new JFrame(),
				frame104 = new JFrame(),
				frame105 = new JFrame(),
				frame106 = new JFrame(),
				frame107 = new JFrame(),
				frame108 = new JFrame(),
				frame109 = new JFrame(),
				frame110 = new JFrame(),
				frame111 = new JFrame(),
				frame112 = new JFrame(),
				frame113 = new JFrame(),
				frame114 = new JFrame(),
				frameHuvud = new JFrame("GoJbGuide"),
				spr�k = new JFrame("Language");
	
	ImageIcon 	i3 = new ImageIcon(getClass().getResource("/images/3.png")),
				i7= new ImageIcon(getClass().getResource("/images/7.png")),
				i8= new ImageIcon(getClass().getResource("/images/8.gif")),
				i9= new ImageIcon(getClass().getResource("/images/9.png")),
				i10= new ImageIcon(getClass().getResource("/images/10.png")),
				i11= new ImageIcon(getClass().getResource("/images/11.gif")),
				i12= new ImageIcon(getClass().getResource("/images/12.gif")),
				i13= new ImageIcon(getClass().getResource("/images/13.gif")),
				i14= new ImageIcon(getClass().getResource("/images/14.gif")),
				i15= new ImageIcon(getClass().getResource("/images/15.png")),
				i16= new ImageIcon(getClass().getResource("/images/16.png")),
				i17= new ImageIcon(getClass().getResource("/images/17.png")),
				i18= new ImageIcon(getClass().getResource("/images/18.png")),
				i19= new ImageIcon(getClass().getResource("/images/19.png")),
				i20= new ImageIcon(getClass().getResource("/images/20.png")),
				i21= new ImageIcon(getClass().getResource("/images/21.png")),
				i22= new ImageIcon(getClass().getResource("/images/22.gif")),
				i23= new ImageIcon(getClass().getResource("/images/23.png")),
				i24= new ImageIcon(getClass().getResource("/images/24.png")),
				i25= new ImageIcon(getClass().getResource("/images/25.png")),
				i26= new ImageIcon(getClass().getResource("/images/26.png")),
				i27= new ImageIcon(getClass().getResource("/images/27.png")),
				i28= new ImageIcon(getClass().getResource("/images/28.png")),
				i29= new ImageIcon(getClass().getResource("/images/29.gif")),
				i30= new ImageIcon(getClass().getResource("/images/30.png")),
				i31= new ImageIcon(getClass().getResource("/images/31.png")),
				i32= new ImageIcon(getClass().getResource("/images/32.png")),
				i33= new ImageIcon(getClass().getResource("/images/33.png")),
				i34= new ImageIcon(getClass().getResource("/images/34.png")),
				i35= new ImageIcon(getClass().getResource("/images/35.png")),
				i36= new ImageIcon(getClass().getResource("/images/36.png")),
				i37= new ImageIcon(getClass().getResource("/images/37.png")),
				i38= new ImageIcon(getClass().getResource("/images/38.png")),
				i39= new ImageIcon(getClass().getResource("/images/39.png")),
				i40= new ImageIcon(getClass().getResource("/images/40.png")),
				i41= new ImageIcon(getClass().getResource("/images/41.png")),
				i42= new ImageIcon(getClass().getResource("/images/42.png")),
				i43= new ImageIcon(getClass().getResource("/images/43.gif")),
				i44= new ImageIcon(getClass().getResource("/images/44.png")),
				i45= new ImageIcon(getClass().getResource("/images/45.png")),
				i46= new ImageIcon(getClass().getResource("/images/46.png")),
				i47= new ImageIcon(getClass().getResource("/images/47.png")),
				i48= new ImageIcon(getClass().getResource("/images/48.gif")),
				i49= new ImageIcon(getClass().getResource("/images/49.gif")),
				i50= new ImageIcon(getClass().getResource("/images/50.png")),
				i51= new ImageIcon(getClass().getResource("/images/51.png")),
				i52= new ImageIcon(getClass().getResource("/images/52.png")),
				i53= new ImageIcon(getClass().getResource("/images/53.png")),
				i54= new ImageIcon(getClass().getResource("/images/54.png")),
				i55= new ImageIcon(getClass().getResource("/images/55.gif")),
				i56= new ImageIcon(getClass().getResource("/images/56.png")),
				i57= new ImageIcon(getClass().getResource("/images/57.png")),
				i58= new ImageIcon(getClass().getResource("/images/58.png")),
				i59= new ImageIcon(getClass().getResource("/images/59.png")),
				i60= new ImageIcon(getClass().getResource("/images/60.gif")),
				i61= new ImageIcon(getClass().getResource("/images/61.png")),
				i62= new ImageIcon(getClass().getResource("/images/62.png")),
				i63= new ImageIcon(getClass().getResource("/images/63.gif")),
				i64= new ImageIcon(getClass().getResource("/images/64.gif")),
				i65= new ImageIcon(getClass().getResource("/images/1010.gif")),
				i66= new ImageIcon(getClass().getResource("/images/66.gif")),
				i67= new ImageIcon(getClass().getResource("/images/67.gif")),
				i68= new ImageIcon(getClass().getResource("/images/68.gif")),
				i69= new ImageIcon(getClass().getResource("/images/69.png")),
				i70= new ImageIcon(getClass().getResource("/images/70.png")),
				i71= new ImageIcon(getClass().getResource("/images/71.png")),
				i72= new ImageIcon(getClass().getResource("/images/72.png")),
				i73= new ImageIcon(getClass().getResource("/images/73.png")),
				i74= new ImageIcon(getClass().getResource("/images/74.png")),
				i75= new ImageIcon(getClass().getResource("/images/75.png")),
				i76= new ImageIcon(getClass().getResource("/images/76.png")),
				i77= new ImageIcon(getClass().getResource("/images/77.png")),
				i78= new ImageIcon(getClass().getResource("/images/78.png")),
				i79= new ImageIcon(getClass().getResource("/images/79.png")),
				i80= new ImageIcon(getClass().getResource("/images/80.png")),
				i81= new ImageIcon(getClass().getResource("/images/81.png")),
				i82= new ImageIcon(getClass().getResource("/images/82.png")),
				i83= new ImageIcon(getClass().getResource("/images/83.png")),
				i84= new ImageIcon(getClass().getResource("/images/84.png")),
				i85= new ImageIcon(getClass().getResource("/images/85.png")),
				i86= new ImageIcon(getClass().getResource("/images/86.png")),
				i87= new ImageIcon(getClass().getResource("/images/87.png")),
				i88= new ImageIcon(getClass().getResource("/images/88.png")),
				i89= new ImageIcon(getClass().getResource("/images/89.png")),
				i91= new ImageIcon(getClass().getResource("/images/91.png")),
				i92= new ImageIcon(getClass().getResource("/images/92.png")),
				i93= new ImageIcon(getClass().getResource("/images/93.gif")),
				i94= new ImageIcon(getClass().getResource("/images/94.png")),
				i95= new ImageIcon(getClass().getResource("/images/95.png")),
				i96= new ImageIcon(getClass().getResource("/images/96.png")),
				i97= new ImageIcon(getClass().getResource("/images/97.png")),
				i98= new ImageIcon(getClass().getResource("/images/98.png")),
				i99= new ImageIcon(getClass().getResource("/images/99.png")),
				i100= new ImageIcon(getClass().getResource("/images/100.png")),
				i101= new ImageIcon(getClass().getResource("/images/101.png")),
				i102= new ImageIcon(getClass().getResource("/images/102.png")),
				i103= new ImageIcon(getClass().getResource("/images/103.png")),
				i104= new ImageIcon(getClass().getResource("/images/104.png")),
				i105= new ImageIcon(getClass().getResource("/images/105.png")),
				i106= new ImageIcon(getClass().getResource("/images/106.png")),
				i107= new ImageIcon(getClass().getResource("/images/107.png")),
				i108= new ImageIcon(getClass().getResource("/images/108.png")),
				i109= new ImageIcon(getClass().getResource("/images/109.png")),
				i110= new ImageIcon(getClass().getResource("/images/110.png")),
				i111= new ImageIcon(getClass().getResource("/images/111.png")),
				i112= new ImageIcon(getClass().getResource("/images/112.png")),
				i113= new ImageIcon(getClass().getResource("/images/113.png")),
				i114= new ImageIcon(getClass().getResource("/images/114.png"));

	JButton 	button3 = new JButton(i3),
				button7 = new JButton(i7),
				button8 = new JButton(i8),
				button9 = new JButton(i9),
				button10 = new JButton(i10),
				button11 = new JButton(i11),
				button12 = new JButton(i12),
				button13 = new JButton(i13),
				button14 = new JButton(i14),
				button15 = new JButton(i15),
				button16 = new JButton(i16),
				button17 = new JButton(i17),
				button18 = new JButton(i18),
				button19 = new JButton(i19),
				button20 = new JButton(i20),
				button21 = new JButton(i21),
				button22 = new JButton(i22),
				button23 = new JButton(i23),
				button24 = new JButton(i24),
				button25 = new JButton(i25),
				button26 = new JButton(i26),
				button27 = new JButton(i27),
				button28 = new JButton(i28),
				button29 = new JButton(i29),
				button30 = new JButton(i30),
				button31 = new JButton(i31),
				button32 = new JButton(i32),
				button33 = new JButton(i33),
				button34 = new JButton(i34),
				button35 = new JButton(i35),
				button36 = new JButton(i36),
				button37 = new JButton(i37),
				button38 = new JButton(i38),
				button39 = new JButton(i39),
				button40 = new JButton(i40),
				button41 = new JButton(i41),
				button42 = new JButton(i42),
				button43 = new JButton(i43),
				button44 = new JButton(i44),
				button45 = new JButton(i45),
				button46 = new JButton(i46),
				button47 = new JButton(i47),
				button48 = new JButton(i48),
				button49 = new JButton(i49),
				button50 = new JButton(i50),
				button51 = new JButton(i51),
				button52 = new JButton(i52),
				button53 = new JButton(i53),
				button54 = new JButton(i54),
				button55 = new JButton(i55),
				button56 = new JButton(i56),
				button57 = new JButton(i57),
				button58 = new JButton(i58),
				button59 = new JButton(i59),
				button60 = new JButton(i60),
				button61 = new JButton(i61),
				button62 = new JButton(i62),
				button63 = new JButton(i63),
				button64 = new JButton(i64),
				button65 = new JButton(i65),
				button66 = new JButton(i66),
				button67 = new JButton(i67),
				button68 = new JButton(i68),
				button69 = new JButton(i69),
				button70 = new JButton(i70),
				button71 = new JButton(i71),
				button72 = new JButton(i72),
				button73 = new JButton(i73),
				button74 = new JButton(i74),
				button75 = new JButton(i75),
				button76 = new JButton(i76),
				button77 = new JButton(i77),
				button78 = new JButton(i78),
				button79 = new JButton(i79),
				button80 = new JButton(i80),
				button81 = new JButton(i81),
				button82 = new JButton(i82),
				button83 = new JButton(i83),
				button84 = new JButton(i84),
				button85 = new JButton(i85),
				button86 = new JButton(i86),
				button87 = new JButton(i87),
				button88 = new JButton(i88),
				button89 = new JButton(i89),
				button91 = new JButton(i91),
				button92 = new JButton(i92),
				button93 = new JButton(i93),
				button94 = new JButton(i94),
				button95 = new JButton(i95),
				button96 = new JButton(i96),
				button97 = new JButton(i97),
				button98 = new JButton(i98),
				button99 = new JButton(i99),
				button100 = new JButton(i100),
				button101 = new JButton(i101),
				button102 = new JButton(i102),
				button103 = new JButton(i103),
				button104 = new JButton(i104),
				button105 = new JButton(i105),
				button106 = new JButton(i106),
				button107 = new JButton(i107),
				button108 = new JButton(i108),
				button109 = new JButton(i109),
				button110 = new JButton(i110),
				button111 = new JButton(i111),
				button112 = new JButton(i112),
				button113 = new JButton(i113),
				button114 = new JButton(i114),
				st�ng = new JButton();
	
	ImageIcon 	kullersten = new ImageIcon(getClass().getResource("/images/1.png")),
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
	
	String traString = "",kullerString = "",r�dString = "",sandString = "",guldString = "",
			slimesString = "",tr�dsString = "",tegelString = "",krutString = "",j�rnString = "",
			diamantString = "",sn�bollString = "",obsidianString = "",l�dersString = "",f�rgerString = "",
			pumpaString = "",�ggString = "",kolString = "",morotString = "",j�rnelrtr�dString = "",
			fj�derString = "",bl�ckString = "",tr�j�rnstenString = "",melonString = "",blazeString = "",
			spindel�gaString = "",glasString = "",svampString = "",gl�dstenspulverString = "",
			veteString = "",kakaoString = "",stenString = "",sockerr�rString = "",mj�lkString = "",
			�ppleString = "",flintaString = "",j�rnstentr�String = "",nederstj�rnaString = "",
			nederkvartString = "",materialString = "";
	
	JPanel frame = new JPanel();

	JScrollPane scrollBar=new JScrollPane(frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	
	public static void main(String[] args) {
		new Ladda();
	}
	
	public GoJb1(){
		new Thread(new Update()).start();

		try {
			prop.load(new FileInputStream(System.getProperty ("user.home") + "\\AppData\\Roaming\\GoJb\\settings.gojb"));
			Spr�k();
			if (eng�ngs�ppning==1) {
				G�rF�nster();
			}
			eng�ngs�ppning++;

		} catch (Exception e) {
			Spr�kfr�ga();
		}
		
		
	/**
9778436klbgflf=lhdohf7984
#Engelska
#lhdohf7984
#Svenska
#86325yhrel
	 */
		
	}
	public void Spr�kfr�ga() {
		ActionListener dActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==svenska) {
					prop.setProperty("9778436klbgflf", "86325yhrel");
					prop.setProperty("x", "1");
					try {
						prop.store(new FileWriter(new File(System.getProperty("user.home") + "\\AppData\\Roaming\\GoJb\\settings.gojb")),"Inst�llningar f�r GoJbGuide");
					} catch (Exception ee) {
						System.out.println("lyckades inte skriva");
					}
				}
				else if (e.getSource()==engelska) {
					prop.setProperty("9778436klbgflf", "lhdohf7984");
				}
				try {
					prop.store(new FileWriter(new File(System.getProperty("user.home") + "\\AppData\\Roaming\\GoJb\\settings.gojb")),"Inst�llningar f�r GoJbGuide");
				} catch (Exception e1) {
					System.err.println("Mappen finns inte! Skapar...");
					new File((System.getProperty("user.home") + "\\AppData\\Roaming\\GoJb\\")).mkdir();

					try {
						prop.store(new FileWriter(new File(System.getProperty("user.home") + "\\AppData\\Roaming\\GoJb\\settings.gojb")),"Inst�llningar f�r GoJbGuide");
					} catch (IOException e2) {
						e2.printStackTrace();
					}
				}
				spr�k.setVisible(false);
				try {
					Spr�k();
				} catch (Exception e1) {

					e1.printStackTrace();
				}
				if (eng�ngs�ppning==1) {
					G�rF�nster();
					eng�ngs�ppning++;
				}
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



	public void Spr�k() throws Exception{
		frame.removeAll();
		if (prop.getProperty("9778436klbgflf").equals("86325yhrel")){

			//Svenska
			
			prop.setProperty("z", "86325yhrel");
			
			if (prop.getProperty("y","2").equals("10")) {

				yString = " Du �r verifierad, tack f�r att\n du anv�nder det h�r programmet! :)";
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
			
			button3.setText("Tr�plankor");
			button7.setText("Automat");
			button8.setText("Sandsten");
			button9.setText("Notblock");
			button10.setText("S�ng");
			button11.setText("Driven r�ls");
			button12.setText("Sensorr�ls");
			button13.setText("Klibbig kolv");
			button14.setText("Kolv");
			button15.setText("Ull");
			button16.setText("Halvblock");
			button17.setText("Tegelstensblock");
			button18.setText("Dynamit");
			button19.setText("Bokhylla");
			button20.setText("Fackla");
			button21.setText("Trappa");
			button22.setText("Kista");
			button23.setText("Arbetsb�nk");
			button24.setText("Ugn");
			button25.setText("Skylt");
			button26.setText("D�rr");
			button27.setText("Stege");
			button28.setText("R�ls");
			button29.setText("Spak");
			button30.setText("Tryckplatta");
			button31.setText("R�dstensfackla");
			button32.setText("Knapp");
			button33.setText("Sn�block");
			button34.setText("Jukebox");
			button35.setText("Staket");
			button36.setText("Gl�dstenslampa");
			button37.setText("Pumpalykta");
			button38.setText("F�rgat glas");
			button39.setText("Fallucka");
			button40.setText("J�rngaller");
			button41.setText("F�nster");
			button42.setText("Melonblock");
			button43.setText("Grind");
			button44.setText("Trollerib�nk");
			button45.setText("Bryggeri");
			button46.setText("Kittel");
			button47.setText("R�dstenslampa");
			button48.setText("Enderkista");
			button49.setText("Slubbeltr�dskrok");
			button50.setText("Fyr");
			button51.setText("Mur");
			button52.setText("Kruka");
			button53.setText("St�d");
			button54.setText("F�llkista");
			button55.setText("R�dstensj�mf�rare");
			button56.setText("Dagsljussensor");
			button57.setText("Block");
			button58.setText("Hopper");
			button59.setText("Matta");
			button60.setText("Aktiveringsr�ls");
			button61.setText("Droppare");
			button62.setText("H�bal");
			button63.setText("Spade");
			button64.setText("Yxa");
			button65.setText("Hacka");
			button66.setText("Sv�rd");
			button67.setText("Flohacka");
			button68.setText("Pilb�ge");
			button69.setText("Pil");
			button70.setText("Flintst�l");
			button71.setText("Pinne");
			button72.setText("Sk�l");
			button73.setText("Br�d");
			button74.setText("Hj�lm");
			button75.setText("Br�stplatta");
			button76.setText("Byxor");
			button77.setText("Skor");
			button78.setText("M�lning");
			button79.setText("Gyllene �pple");
			button80.setText("Hink");
			button81.setText("Gruvvagn");
			button82.setText("B�t");
			button83.setText("Papper");
			button84.setText("Bok");
			button85.setText("Gruvvagn med kista");
			button86.setText("Gruvvagnslok");
			button87.setText("Kompass");
			button88.setText("Fiskesp�");
			button89.setText("Klocka");
			button91.setText("Socker");
			button92.setText("T�rta");
			button93.setText("R�dstensrepeterare");
			button94.setText("Kaka");
			button95.setText("Karta");
			button96.setText("Sax");
			button97.setText("Melonfr�n");
			button98.setText("Guldklimp");
			button99.setText("Glasflaska");
			button100.setText("J�st Spindel�ga");
			button101.setText("Blaze pulver");
			button102.setText("Magma crem�");
			button103.setText("Ender�ga");
			button104.setText("Guldmelon");
			button105.setText("Bok ock fj�derpenna");
			button106.setText("F�rem�lsram");
			button107.setText("Guldmorot");
			button108.setText("Morot p� pinne");
			button109.setText("Pumpapaj");
			button110.setText("Raket");
			button111.setText("Raketst�rna");
			button112.setText("Gruvvagn med dynamit");
			button113.setText("Gruvvagn med hopper");
			button114.setText("Koppel");

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
			
		}
		else if (prop.getProperty("9778436klbgflf").equals("lhdohf7984")){
			//Eng
			
			prop.setProperty("z", "lhdohf7984");
						
			if (prop.getProperty("y","2").equals("10")) {
				
				yString = " You are Verified, thanks for\n using this application! :)";
				
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
			
			
			
			button3.setText("Planks");
			button7.setText("Dispenser");
			button8.setText("Sandstone");
			button9.setText("Note Block");
			button10.setText("Bed");
			button11.setText("Powered Rail");
			button12.setText("Detector Rail");
			button13.setText("Sticky Piston");
			button14.setText("Piston");
			button15.setText("Wool");
			button16.setText("Slab");
			button17.setText("Bricks");
			button18.setText("TNT");
			button19.setText("Bookshelf");
			button20.setText("Torch");
			button21.setText("Stairs");
			button22.setText("Chest");
			button23.setText("Crafting Table");
			button24.setText("Furnace");
			button25.setText("Sign");
			button26.setText("Door");
			button27.setText("Ladder");
			button28.setText("Rail");
			button29.setText("Lever");
			button30.setText("Pressure Plate");
			button31.setText("Redstone Torch");
			button32.setText("Button");
			button33.setText("Snow Block");
			button34.setText("Jukebox");
			button35.setText("Fence");
			button36.setText("Glowstone");
			button37.setText("Jack-O-Lantern");
			button38.setText("Stained Glass");
			button39.setText("Trap Door");
			button40.setText("Iron Bars");
			button41.setText("Glass Pane");
			button42.setText("Melon Block");
			button43.setText("Fence Gate");
			button44.setText("Enchantment Table");
			button45.setText("Brewing Stand");
			button46.setText("Cauldron");
			button47.setText("Redstone Lamp");
			button48.setText("Ender Chest");
			button49.setText("Tripwire Hook");
			button50.setText("Becon");
			button51.setText("Cobblestone Wall");
			button52.setText("Flower Pot");
			button53.setText("Anvil");
			button54.setText("Trapped Chest");
			button55.setText("Redstone Comparator");
			button56.setText("Daylight Sensor");
			button57.setText("Block");
			button58.setText("Hopper");
			button59.setText("Carpet");
			button60.setText("Activator Rail");
			button61.setText("Dropper");
			button62.setText("Hay Bales");
			button63.setText("Shovel");
			button64.setText("Axe");
			button65.setText("Pickaxe");
			button66.setText("Sword");
			button67.setText("Hoe");
			button68.setText("Bow");
			button69.setText("Arrow");
			button70.setText("Flint & Steel");
			button71.setText("Stick");
			button72.setText("Bowl");
			button73.setText("Bread");
			button74.setText("Helmet");
			button75.setText("Chestplate");
			button76.setText("Leggings");
			button77.setText("Boots");
			button78.setText("Painting");
			button79.setText("Golden Apple");
			button80.setText("Bucket");
			button81.setText("Minecart");
			button82.setText("Boat");
			button83.setText("Paper");
			button84.setText("Book");
			button85.setText("Minecart with Chest");
			button86.setText("Minecart with Furnace");
			button87.setText("Compass");
			button88.setText("Fishing Rod");
			button89.setText("Clock");
			button91.setText("Sugar");
			button92.setText("Cake");
			button93.setText("Redstone Repeter");
			button94.setText("Cookie");
			button95.setText("Map");
			button96.setText("Shears");
			button97.setText("Melon Seeds");
			button98.setText("Gold nugget");
			button99.setText("Glass Bottle");
			button100.setText("Fermented Spider Eye");
			button101.setText("Blaze Powder");
			button102.setText("Magma Cream");
			button103.setText("Eye Of Ender");
			button104.setText("Glistering Melon");
			button105.setText("Book & Quil");
			button106.setText("Item Frame");
			button107.setText("Golden Carrot");
			button108.setText("Carrot On A Stick");
			button109.setText("Pumpkin Pie");
			button110.setText("Firework Rocket");
			button111.setText("Firework Star");
			button112.setText("Minecart With TNT");
			button113.setText("Minecart With Hopper");
			button114.setText("Lead");

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
			
		}
		else {
			throw new Exception();
		}

		frame3.setTitle(button3.getText());
		frame7.setTitle(button7.getText());
		frame8.setTitle(button8.getText());
		frame9.setTitle(button9.getText());
		frame10.setTitle(button10.getText());
		frame11.setTitle(button11.getText());
		frame12.setTitle(button12.getText());
		frame13.setTitle(button13.getText());
		frame14.setTitle(button14.getText());
		frame15.setTitle(button15.getText());
		frame16.setTitle(button16.getText());
		frame17.setTitle(button17.getText());
		frame18.setTitle(button18.getText());
		frame19.setTitle(button19.getText());
		frame20.setTitle(button20.getText());
		frame21.setTitle(button21.getText());
		frame22.setTitle(button22.getText());
		frame23.setTitle(button23.getText());
		frame24.setTitle(button24.getText());
		frame25.setTitle(button25.getText());
		frame26.setTitle(button26.getText());
		frame27.setTitle(button27.getText());
		frame28.setTitle(button28.getText());
		frame29.setTitle(button29.getText());
		frame30.setTitle(button30.getText());
		frame31.setTitle(button31.getText());
		frame32.setTitle(button32.getText());
		frame33.setTitle(button33.getText());
		frame34.setTitle(button34.getText());
		frame35.setTitle(button35.getText());
		frame36.setTitle(button36.getText());
		frame37.setTitle(button37.getText());
		frame38.setTitle(button38.getText());
		frame39.setTitle(button39.getText());
		frame40.setTitle(button40.getText());
		frame41.setTitle(button41.getText());
		frame42.setTitle(button42.getText());
		frame43.setTitle(button43.getText());
		frame44.setTitle(button44.getText());
		frame45.setTitle(button45.getText());
		frame46.setTitle(button46.getText());
		frame47.setTitle(button47.getText());
		frame48.setTitle(button48.getText());
		frame49.setTitle(button49.getText());
		frame50.setTitle(button50.getText());
		frame51.setTitle(button51.getText());
		frame52.setTitle(button52.getText());
		frame53.setTitle(button53.getText());
		frame54.setTitle(button54.getText());
		frame55.setTitle(button55.getText());
		frame56.setTitle(button56.getText());
		frame57.setTitle(button57.getText());
		frame58.setTitle(button58.getText());
		frame59.setTitle(button59.getText());
		frame60.setTitle(button60.getText());
		frame61.setTitle(button61.getText());
		frame62.setTitle(button62.getText());
		frame63.setTitle(button63.getText());
		frame64.setTitle(button64.getText());
		frame65.setTitle(button65.getText());
		frame66.setTitle(button66.getText());
		frame67.setTitle(button67.getText());
		frame68.setTitle(button68.getText());
		frame69.setTitle(button69.getText());
		frame70.setTitle(button70.getText());
		frame71.setTitle(button71.getText());
		frame72.setTitle(button72.getText());
		frame73.setTitle(button73.getText());
		frame74.setTitle(button74.getText());
		frame75.setTitle(button75.getText());
		frame76.setTitle(button76.getText());
		frame77.setTitle(button77.getText());
		frame78.setTitle(button78.getText());
		frame79.setTitle(button79.getText());
		frame80.setTitle(button80.getText());
		frame81.setTitle(button81.getText());
		frame82.setTitle(button82.getText());
		frame83.setTitle(button83.getText());
		frame84.setTitle(button84.getText());
		frame85.setTitle(button85.getText());
		frame86.setTitle(button86.getText());
		frame87.setTitle(button87.getText());
		frame88.setTitle(button88.getText());
		frame89.setTitle(button89.getText());
		frame91.setTitle(button91.getText());
		frame92.setTitle(button92.getText());
		frame93.setTitle(button93.getText());
		frame94.setTitle(button94.getText());
		frame95.setTitle(button95.getText());
		frame96.setTitle(button96.getText());
		frame97.setTitle(button97.getText());
		frame98.setTitle(button98.getText());
		frame99.setTitle(button99.getText());
		frame100.setTitle(button100.getText());
		frame101.setTitle(button101.getText());
		frame102.setTitle(button102.getText());
		frame103.setTitle(button103.getText());
		frame104.setTitle(button104.getText());
		frame105.setTitle(button105.getText());
		frame106.setTitle(button106.getText());
		frame107.setTitle(button107.getText());
		frame108.setTitle(button108.getText());
		frame109.setTitle(button109.getText());
		frame110.setTitle(button110.getText());
		frame111.setTitle(button111.getText());
		frame112.setTitle(button112.getText());
		frame113.setTitle(button113.getText());
		frame114.setTitle(button114.getText());

		frameHuvud.repaint();
		frameHuvud.revalidate();
		frameHuvud.setSize(800,700);
		frameHuvud.setLocationRelativeTo(null);
		
		
	}
	public void G�rF�nster() {

		scrollBar.getVerticalScrollBar().setUnitIncrement(20);
		frameHuvud.setIconImage(new ImageIcon(getClass().getResource("/images/Java-icon.png")).getImage());

		frame3.setSize(500,500);
		frame7.setSize(500,500);
		frame8.setSize(500,500);
		frame9.setSize(500,500);
		frame10.setSize(500,500);
		frame11.setSize(500,500);
		frame12.setSize(500,500);
		frame13.setSize(500,500);
		frame14.setSize(500,500);
		frame15.setSize(500,500);
		frame16.setSize(500,500);
		frame17.setSize(500,500);
		frame18.setSize(500,500);
		frame19.setSize(500,500);
		frame20.setSize(500,500);
		frame21.setSize(500,500);
		frame22.setSize(500,500);
		frame23.setSize(500,500);
		frame24.setSize(500,500);
		frame25.setSize(500,500);
		frame26.setSize(500,500);
		frame27.setSize(500,500);
		frame28.setSize(500,500);
		frame29.setSize(500,500);
		frame30.setSize(500,500);
		frame31.setSize(500,500);
		frame32.setSize(500,500);
		frame33.setSize(500,500);
		frame34.setSize(500,500);
		frame35.setSize(500,500);
		frame36.setSize(500,500);
		frame37.setSize(500,500);
		frame38.setSize(500,500);
		frame39.setSize(500,500);
		frame40.setSize(500,500);
		frame41.setSize(500,500);
		frame42.setSize(500,500);
		frame43.setSize(500,500);
		frame44.setSize(500,500);
		frame45.setSize(500,500);
		frame46.setSize(500,500);
		frame47.setSize(500,500);
		frame48.setSize(500,500);
		frame49.setSize(500,500);
		frame50.setSize(500,500);
		frame51.setSize(500,500);
		frame52.setSize(500,500);
		frame53.setSize(500,500);
		frame54.setSize(500,500);
		frame55.setSize(500,500);
		frame56.setSize(500,500);
		frame57.setSize(500,500);
		frame58.setSize(500,500);
		frame59.setSize(500,500);
		frame60.setSize(500,500);
		frame61.setSize(500,500);
		frame62.setSize(500,500);
		frame63.setSize(500,500);
		frame64.setSize(500,500);
		frame65.setSize(500,500);
		frame66.setSize(500,500);
		frame67.setSize(500,500);
		frame68.setSize(500,500);
		frame69.setSize(500,500);
		frame70.setSize(500,500);
		frame71.setSize(500,500);
		frame72.setSize(500,500);
		frame73.setSize(500,500);
		frame74.setSize(500,500);
		frame75.setSize(500,500);
		frame76.setSize(500,500);
		frame77.setSize(500,500);
		frame78.setSize(500,500);
		frame79.setSize(500,500);
		frame80.setSize(500,500);
		frame81.setSize(500,500);
		frame82.setSize(500,500);
		frame83.setSize(500,500);
		frame84.setSize(500,500);
		frame85.setSize(500,500);
		frame86.setSize(500,500);
		frame87.setSize(500,500);
		frame88.setSize(500,500);
		frame89.setSize(500,500);
		frame91.setSize(500,500);
		frame92.setSize(500,500);
		frame93.setSize(500,500);
		frame94.setSize(500,500);
		frame95.setSize(500,500);
		frame96.setSize(500,500);
		frame97.setSize(500,500);
		frame98.setSize(500,500);
		frame99.setSize(500,500);
		frame100.setSize(500,500);
		frame101.setSize(500,500);
		frame102.setSize(500,500);
		frame103.setSize(500,500);
		frame104.setSize(500,500);
		frame105.setSize(500,500);
		frame106.setSize(500,500);
		frame107.setSize(500,500);
		frame108.setSize(500,500);
		frame109.setSize(500,500);
		frame110.setSize(500,500);
		frame111.setSize(500,500);
		frame112.setSize(500,500);
		frame113.setSize(500,500);
		frame114.setSize(500,500);


		button3.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button10.addActionListener(this);
		button11.addActionListener(this);
		button12.addActionListener(this);
		button13.addActionListener(this);
		button14.addActionListener(this);
		button15.addActionListener(this);
		button16.addActionListener(this);
		button17.addActionListener(this);
		button18.addActionListener(this);
		button19.addActionListener(this);
		button20.addActionListener(this);
		button21.addActionListener(this);
		button22.addActionListener(this);
		button23.addActionListener(this);
		button24.addActionListener(this);
		button25.addActionListener(this);
		button26.addActionListener(this);
		button27.addActionListener(this);
		button28.addActionListener(this);
		button29.addActionListener(this);
		button30.addActionListener(this);
		button31.addActionListener(this);
		button32.addActionListener(this);
		button33.addActionListener(this);
		button34.addActionListener(this);
		button35.addActionListener(this);
		button36.addActionListener(this);
		button37.addActionListener(this);
		button38.addActionListener(this);
		button39.addActionListener(this);
		button40.addActionListener(this);
		button41.addActionListener(this);
		button42.addActionListener(this);
		button43.addActionListener(this);
		button44.addActionListener(this);
		button45.addActionListener(this);
		button46.addActionListener(this);
		button47.addActionListener(this);
		button48.addActionListener(this);
		button49.addActionListener(this);
		button50.addActionListener(this);
		button51.addActionListener(this);
		button52.addActionListener(this);
		button53.addActionListener(this);
		button54.addActionListener(this);
		button55.addActionListener(this);
		button56.addActionListener(this);
		button57.addActionListener(this);
		button58.addActionListener(this);
		button59.addActionListener(this);
		button60.addActionListener(this);
		button61.addActionListener(this);
		button62.addActionListener(this);
		button63.addActionListener(this);
		button64.addActionListener(this);
		button65.addActionListener(this);
		button66.addActionListener(this);
		button67.addActionListener(this);
		button68.addActionListener(this);
		button69.addActionListener(this);
		button70.addActionListener(this);
		button71.addActionListener(this);
		button72.addActionListener(this);
		button73.addActionListener(this);
		button74.addActionListener(this);
		button75.addActionListener(this);
		button76.addActionListener(this);
		button77.addActionListener(this);
		button78.addActionListener(this);
		button79.addActionListener(this);
		button80.addActionListener(this);
		button81.addActionListener(this);
		button82.addActionListener(this);
		button83.addActionListener(this);
		button84.addActionListener(this);
		button85.addActionListener(this);
		button86.addActionListener(this);
		button87.addActionListener(this);
		button88.addActionListener(this);
		button89.addActionListener(this);
		button91.addActionListener(this);
		button92.addActionListener(this);
		button93.addActionListener(this);
		button94.addActionListener(this);
		button95.addActionListener(this);
		button96.addActionListener(this);
		button97.addActionListener(this);
		button98.addActionListener(this);
		button99.addActionListener(this);
		button100.addActionListener(this);
		button101.addActionListener(this);
		button102.addActionListener(this);
		button103.addActionListener(this);
		button104.addActionListener(this);
		button105.addActionListener(this);
		button106.addActionListener(this);
		button107.addActionListener(this);
		button108.addActionListener(this);
		button109.addActionListener(this);
		button110.addActionListener(this);
		button111.addActionListener(this);
		button112.addActionListener(this);
		button113.addActionListener(this);
		button114.addActionListener(this);

		frame3.setLayout(new GridLayout(3,3));
		frame7.setLayout(new GridLayout(3,3));
		frame8.setLayout(new GridLayout(3,3));
		frame9.setLayout(new GridLayout(3,3));
		frame10.setLayout(new GridLayout(3,3));
		frame11.setLayout(new GridLayout(3,3));
		frame12.setLayout(new GridLayout(3,3));
		frame13.setLayout(new GridLayout(3,3));
		frame14.setLayout(new GridLayout(3,3));
		frame15.setLayout(new GridLayout(3,3));
		frame16.setLayout(new GridLayout(3,3));
		frame17.setLayout(new GridLayout(3,3));
		frame18.setLayout(new GridLayout(3,3));
		frame19.setLayout(new GridLayout(3,3));
		frame20.setLayout(new GridLayout(3,3));
		frame21.setLayout(new GridLayout(3,3));
		frame22.setLayout(new GridLayout(3,3));
		frame23.setLayout(new GridLayout(3,3));
		frame24.setLayout(new GridLayout(3,3));
		frame25.setLayout(new GridLayout(3,3));
		frame26.setLayout(new GridLayout(3,3));
		frame27.setLayout(new GridLayout(3,3));
		frame28.setLayout(new GridLayout(3,3));
		frame29.setLayout(new GridLayout(3,3));
		frame30.setLayout(new GridLayout(3,3));
		frame31.setLayout(new GridLayout(3,3));
		frame32.setLayout(new GridLayout(3,3));
		frame33.setLayout(new GridLayout(3,3));
		frame34.setLayout(new GridLayout(3,3));
		frame35.setLayout(new GridLayout(3,3));
		frame36.setLayout(new GridLayout(3,3));
		frame37.setLayout(new GridLayout(3,3));
		frame38.setLayout(new GridLayout(3,3));
		frame39.setLayout(new GridLayout(3,3));
		frame40.setLayout(new GridLayout(3,3));
		frame41.setLayout(new GridLayout(3,3));
		frame42.setLayout(new GridLayout(3,3));
		frame43.setLayout(new GridLayout(3,3));
		frame44.setLayout(new GridLayout(3,3));
		frame45.setLayout(new GridLayout(3,3));
		frame46.setLayout(new GridLayout(3,3));
		frame47.setLayout(new GridLayout(3,3));
		frame48.setLayout(new GridLayout(3,3));
		frame49.setLayout(new GridLayout(3,3));
		frame50.setLayout(new GridLayout(3,3));
		frame51.setLayout(new GridLayout(3,3));
		frame52.setLayout(new GridLayout(3,3));
		frame53.setLayout(new GridLayout(3,3));
		frame54.setLayout(new GridLayout(3,3));
		frame55.setLayout(new GridLayout(3,3));
		frame56.setLayout(new GridLayout(3,3));
		frame57.setLayout(new GridLayout(3,3));
		frame58.setLayout(new GridLayout(3,3));
		frame59.setLayout(new GridLayout(3,3));
		frame60.setLayout(new GridLayout(3,3));
		frame61.setLayout(new GridLayout(3,3));
		frame62.setLayout(new GridLayout(3,3));
		frame63.setLayout(new GridLayout(3,3));
		frame64.setLayout(new GridLayout(3,3));
		frame65.setLayout(new GridLayout(3,3));
		frame66.setLayout(new GridLayout(3,3));
		frame67.setLayout(new GridLayout(3,3));
		frame68.setLayout(new GridLayout(3,3));
		frame69.setLayout(new GridLayout(3,3));
		frame70.setLayout(new GridLayout(3,3));
		frame71.setLayout(new GridLayout(3,3));
		frame72.setLayout(new GridLayout(3,3));
		frame73.setLayout(new GridLayout(3,3));
		frame74.setLayout(new GridLayout(3,3));
		frame75.setLayout(new GridLayout(3,3));
		frame76.setLayout(new GridLayout(3,3));
		frame77.setLayout(new GridLayout(3,3));
		frame78.setLayout(new GridLayout(3,3));
		frame79.setLayout(new GridLayout(3,3));
		frame80.setLayout(new GridLayout(3,3));
		frame81.setLayout(new GridLayout(3,3));
		frame82.setLayout(new GridLayout(3,3));
		frame83.setLayout(new GridLayout(3,3));
		frame84.setLayout(new GridLayout(3,3));
		frame85.setLayout(new GridLayout(3,3));
		frame86.setLayout(new GridLayout(3,3));
		frame87.setLayout(new GridLayout(3,3));
		frame88.setLayout(new GridLayout(3,3));
		frame89.setLayout(new GridLayout(3,3));
		frame91.setLayout(new GridLayout(3,3));
		frame92.setLayout(new GridLayout(3,3));
		frame93.setLayout(new GridLayout(3,3));
		frame94.setLayout(new GridLayout(3,3));
		frame95.setLayout(new GridLayout(3,3));
		frame96.setLayout(new GridLayout(3,3));
		frame97.setLayout(new GridLayout(3,3));
		frame98.setLayout(new GridLayout(3,3));
		frame99.setLayout(new GridLayout(3,3));
		frame100.setLayout(new GridLayout(3,3));
		frame101.setLayout(new GridLayout(3,3));
		frame102.setLayout(new GridLayout(3,3));
		frame103.setLayout(new GridLayout(3,3));
		frame104.setLayout(new GridLayout(3,3));
		frame105.setLayout(new GridLayout(3,3));
		frame106.setLayout(new GridLayout(3,3));
		frame107.setLayout(new GridLayout(3,3));
		frame108.setLayout(new GridLayout(3,3));
		frame109.setLayout(new GridLayout(3,3));
		frame110.setLayout(new GridLayout(3,3));
		frame111.setLayout(new GridLayout(3,3));
		frame112.setLayout(new GridLayout(3,3));
		frame113.setLayout(new GridLayout(3,3));
		frame114.setLayout(new GridLayout(3,3));

		for (int j = 1; j < buttons3.length; j++) {
			buttons3[j] = new JButton();
			frame3.add(buttons3[j]);
		}
		for (int j = 1; j < buttons7.length; j++) {
			buttons7[j] = new JButton();
			frame7.add(buttons7[j]);
		}
		for (int j = 1; j < buttons8.length; j++) {
			buttons8[j] = new JButton();
			frame8.add(buttons8[j]);
		}
		for (int j = 1; j < buttons9.length; j++) {
			buttons9[j] = new JButton();
			frame9.add(buttons9[j]);
		}
		for (int j = 1; j < buttons10.length; j++) {
			buttons10[j] = new JButton();
			frame10.add(buttons10[j]);
		}
		for (int j = 1; j < buttons11.length; j++) {
			buttons11[j] = new JButton();
			frame11.add(buttons11[j]);
		}
		for (int j = 1; j < buttons12.length; j++) {
			buttons12[j] = new JButton();
			frame12.add(buttons12[j]);
		}
		for (int j = 1; j < buttons13.length; j++) {
			buttons13[j] = new JButton();
			frame13.add(buttons13[j]);
		}
		for (int j = 1; j < buttons14.length; j++) {
			buttons14[j] = new JButton();
			frame14.add(buttons14[j]);
		}
		for (int j = 1; j < buttons15.length; j++) {
			buttons15[j] = new JButton();
			frame15.add(buttons15[j]);
		}
		for (int j = 1; j < buttons16.length; j++) {
			buttons16[j] = new JButton();
			frame16.add(buttons16[j]);
		}
		for (int j = 1; j < buttons17.length; j++) {
			buttons17[j] = new JButton();
			frame17.add(buttons17[j]);
		}
		for (int j = 1; j < buttons18.length; j++) {
			buttons18[j] = new JButton();
			frame18.add(buttons18[j]);
		}
		for (int j = 1; j < buttons19.length; j++) {
			buttons19[j] = new JButton();
			frame19.add(buttons19[j]);
		}
		for (int j = 1; j < buttons20.length; j++) {
			buttons20[j] = new JButton();
			frame20.add(buttons20[j]);
		}
		for (int j = 1; j < buttons21.length; j++) {
			buttons21[j] = new JButton();
			frame21.add(buttons21[j]);
		}
		for (int j = 1; j < buttons22.length; j++) {
			buttons22[j] = new JButton();
			frame22.add(buttons22[j]);
		}
		for (int j = 1; j < buttons23.length; j++) {
			buttons23[j] = new JButton();
			frame23.add(buttons23[j]);
		}
		for (int j = 1; j < buttons24.length; j++) {
			buttons24[j] = new JButton();
			frame24.add(buttons24[j]);
		}
		for (int j = 1; j < buttons25.length; j++) {
			buttons25[j] = new JButton();
			frame25.add(buttons25[j]);
		}
		for (int j = 1; j < buttons26.length; j++) {
			buttons26[j] = new JButton();
			frame26.add(buttons26[j]);
		}
		for (int j = 1; j < buttons27.length; j++) {
			buttons27[j] = new JButton();
			frame27.add(buttons27[j]);
		}
		for (int j = 1; j < buttons28.length; j++) {
			buttons28[j] = new JButton();
			frame28.add(buttons28[j]);
		}
		for (int j = 1; j < buttons29.length; j++) {
			buttons29[j] = new JButton();
			frame29.add(buttons29[j]);
		}
		for (int j = 1; j < buttons30.length; j++) {
			buttons30[j] = new JButton();
			frame30.add(buttons30[j]);
		}
		for (int j = 1; j < buttons31.length; j++) {
			buttons31[j] = new JButton();
			frame31.add(buttons31[j]);
		}
		for (int j = 1; j < buttons32.length; j++) {
			buttons32[j] = new JButton();
			frame32.add(buttons32[j]);
		}
		for (int j = 1; j < buttons33.length; j++) {
			buttons33[j] = new JButton();
			frame33.add(buttons33[j]);
		}
		for (int j = 1; j < buttons34.length; j++) {
			buttons34[j] = new JButton();
			frame34.add(buttons34[j]);
		}
		for (int j = 1; j < buttons35.length; j++) {
			buttons35[j] = new JButton();
			frame35.add(buttons35[j]);
		}
		for (int j = 1; j < buttons36.length; j++) {
			buttons36[j] = new JButton();
			frame36.add(buttons36[j]);
		}
		for (int j = 1; j < buttons37.length; j++) {
			buttons37[j] = new JButton();
			frame37.add(buttons37[j]);
		}
		for (int j = 1; j < buttons38.length; j++) {
			buttons38[j] = new JButton();
			frame38.add(buttons38[j]);
		}
		for (int j = 1; j < buttons39.length; j++) {
			buttons39[j] = new JButton();
			frame39.add(buttons39[j]);
		}
		for (int j = 1; j < buttons40.length; j++) {
			buttons40[j] = new JButton();
			frame40.add(buttons40[j]);
		}
		for (int j = 1; j < buttons41.length; j++) {
			buttons41[j] = new JButton();
			frame41.add(buttons41[j]);
		}
		for (int j = 1; j < buttons42.length; j++) {
			buttons42[j] = new JButton();
			frame42.add(buttons42[j]);
		}
		for (int j = 1; j < buttons43.length; j++) {
			buttons43[j] = new JButton();
			frame43.add(buttons43[j]);
		}
		for (int j = 1; j < buttons44.length; j++) {
			buttons44[j] = new JButton();
			frame44.add(buttons44[j]);
		}
		for (int j = 1; j < buttons45.length; j++) {
			buttons45[j] = new JButton();
			frame45.add(buttons45[j]);
		}
		for (int j = 1; j < buttons46.length; j++) {
			buttons46[j] = new JButton();
			frame46.add(buttons46[j]);
		}
		for (int j = 1; j < buttons47.length; j++) {
			buttons47[j] = new JButton();
			frame47.add(buttons47[j]);
		}
		for (int j = 1; j < buttons48.length; j++) {
			buttons48[j] = new JButton();
			frame48.add(buttons48[j]);
		}
		for (int j = 1; j < buttons49.length; j++) {
			buttons49[j] = new JButton();
			frame49.add(buttons49[j]);
		}
		for (int j = 1; j < buttons50.length; j++) {
			buttons50[j] = new JButton();
			frame50.add(buttons50[j]);
		}
		for (int j = 1; j < buttons51.length; j++) {
			buttons51[j] = new JButton();
			frame51.add(buttons51[j]);
		}
		for (int j = 1; j < buttons52.length; j++) {
			buttons52[j] = new JButton();
			frame52.add(buttons52[j]);
		}
		for (int j = 1; j < buttons53.length; j++) {
			buttons53[j] = new JButton();
			frame53.add(buttons53[j]);
		}
		for (int j = 1; j < buttons54.length; j++) {
			buttons54[j] = new JButton();
			frame54.add(buttons54[j]);
		}
		for (int j = 1; j < buttons55.length; j++) {
			buttons55[j] = new JButton();
			frame55.add(buttons55[j]);
		}
		for (int j = 1; j < buttons56.length; j++) {
			buttons56[j] = new JButton();
			frame56.add(buttons56[j]);
		}
		for (int j = 1; j < buttons57.length; j++) {
			buttons57[j] = new JButton();
			frame57.add(buttons57[j]);
		}
		for (int j = 1; j < buttons58.length; j++) {
			buttons58[j] = new JButton();
			frame58.add(buttons58[j]);
		}
		for (int j = 1; j < buttons59.length; j++) {
			buttons59[j] = new JButton();
			frame59.add(buttons59[j]);
		}
		for (int j = 1; j < buttons60.length; j++) {
			buttons60[j] = new JButton();
			frame60.add(buttons60[j]);
		}
		for (int j = 1; j < buttons61.length; j++) {
			buttons61[j] = new JButton();
			frame61.add(buttons61[j]);
		}
		for (int j = 1; j < buttons62.length; j++) {
			buttons62[j] = new JButton();
			frame62.add(buttons62[j]);
		}
		for (int j = 1; j < buttons63.length; j++) {
			buttons63[j] = new JButton();
			frame63.add(buttons63[j]);
		}
		for (int j = 1; j < buttons64.length; j++) {
			buttons64[j] = new JButton();
			frame64.add(buttons64[j]);
		}
		for (int j = 1; j < buttons65.length; j++) {
			buttons65[j] = new JButton();
			frame65.add(buttons65[j]);
		}
		for (int j = 1; j < buttons66.length; j++) {
			buttons66[j] = new JButton();
			frame66.add(buttons66[j]);
		}
		for (int j = 1; j < buttons67.length; j++) {
			buttons67[j] = new JButton();
			frame67.add(buttons67[j]);
		}
		for (int j = 1; j < buttons68.length; j++) {
			buttons68[j] = new JButton();
			frame68.add(buttons68[j]);
		}
		for (int j = 1; j < buttons69.length; j++) {
			buttons69[j] = new JButton();
			frame69.add(buttons69[j]);
		}
		for (int j = 1; j < buttons70.length; j++) {
			buttons70[j] = new JButton();
			frame70.add(buttons70[j]);
		}
		for (int j = 1; j < buttons71.length; j++) {
			buttons71[j] = new JButton();
			frame71.add(buttons71[j]);
		}
		for (int j = 1; j < buttons72.length; j++) {
			buttons72[j] = new JButton();
			frame72.add(buttons72[j]);
		}
		for (int j = 1; j < buttons73.length; j++) {
			buttons73[j] = new JButton();
			frame73.add(buttons73[j]);
		}
		for (int j = 1; j < buttons74.length; j++) {
			buttons74[j] = new JButton();
			frame74.add(buttons74[j]);
		}
		for (int j = 1; j < buttons75.length; j++) {
			buttons75[j] = new JButton();
			frame75.add(buttons75[j]);
		}
		for (int j = 1; j < buttons76.length; j++) {
			buttons76[j] = new JButton();
			frame76.add(buttons76[j]);
		}
		for (int j = 1; j < buttons77.length; j++) {
			buttons77[j] = new JButton();
			frame77.add(buttons77[j]);
		}
		for (int j = 1; j < buttons78.length; j++) {
			buttons78[j] = new JButton();
			frame78.add(buttons78[j]);
		}
		for (int j = 1; j < buttons79.length; j++) {
			buttons79[j] = new JButton();
			frame79.add(buttons79[j]);
		}
		for (int j = 1; j < buttons80.length; j++) {
			buttons80[j] = new JButton();
			frame80.add(buttons80[j]);
		}
		for (int j = 1; j < buttons81.length; j++) {
			buttons81[j] = new JButton();
			frame81.add(buttons81[j]);
		}
		for (int j = 1; j < buttons82.length; j++) {
			buttons82[j] = new JButton();
			frame82.add(buttons82[j]);
		}
		for (int j = 1; j < buttons83.length; j++) {
			buttons83[j] = new JButton();
			frame83.add(buttons83[j]);
		}
		for (int j = 1; j < buttons84.length; j++) {
			buttons84[j] = new JButton();
			frame84.add(buttons84[j]);
		}
		for (int j = 1; j < buttons85.length; j++) {
			buttons85[j] = new JButton();
			frame85.add(buttons85[j]);
		}
		for (int j = 1; j < buttons86.length; j++) {
			buttons86[j] = new JButton();
			frame86.add(buttons86[j]);
		}
		for (int j = 1; j < buttons87.length; j++) {
			buttons87[j] = new JButton();
			frame87.add(buttons87[j]);
		}
		for (int j = 1; j < buttons88.length; j++) {
			buttons88[j] = new JButton();
			frame88.add(buttons88[j]);
		}
		for (int j = 1; j < buttons89.length; j++) {
			buttons89[j] = new JButton();
			frame89.add(buttons89[j]);
		}
		for (int j = 1; j < buttons91.length; j++) {
			buttons91[j] = new JButton();
			frame91.add(buttons91[j]);
		}
		for (int j = 1; j < buttons92.length; j++) {
			buttons92[j] = new JButton();
			frame92.add(buttons92[j]);
		}
		for (int j = 1; j < buttons93.length; j++) {
			buttons93[j] = new JButton();
			frame93.add(buttons93[j]);
		}
		for (int j = 1; j < buttons94.length; j++) {
			buttons94[j] = new JButton();
			frame94.add(buttons94[j]);
		}
		for (int j = 1; j < buttons95.length; j++) {
			buttons95[j] = new JButton();
			frame95.add(buttons95[j]);
		}
		for (int j = 1; j < buttons96.length; j++) {
			buttons96[j] = new JButton();
			frame96.add(buttons96[j]);
		}
		for (int j = 1; j < buttons97.length; j++) {
			buttons97[j] = new JButton();
			frame97.add(buttons97[j]);
		}
		for (int j = 1; j < buttons98.length; j++) {
			buttons98[j] = new JButton();
			frame98.add(buttons98[j]);
		}
		for (int j = 1; j < buttons99.length; j++) {
			buttons99[j] = new JButton();
			frame99.add(buttons99[j]);
		}
		for (int j = 1; j < buttons100.length; j++) {
			buttons100[j] = new JButton();
			frame100.add(buttons100[j]);
		}
		for (int j = 1; j < buttons101.length; j++) {
			buttons101[j] = new JButton();
			frame101.add(buttons101[j]);
		}
		for (int j = 1; j < buttons102.length; j++) {
			buttons102[j] = new JButton();
			frame102.add(buttons102[j]);
		}
		for (int j = 1; j < buttons103.length; j++) {
			buttons103[j] = new JButton();
			frame103.add(buttons103[j]);
		}
		for (int j = 1; j < buttons104.length; j++) {
			buttons104[j] = new JButton();
			frame104.add(buttons104[j]);
		}
		for (int j = 1; j < buttons105.length; j++) {
			buttons105[j] = new JButton();
			frame105.add(buttons105[j]);
		}
		for (int j = 1; j < buttons106.length; j++) {
			buttons106[j] = new JButton();
			frame106.add(buttons106[j]);
		}
		for (int j = 1; j < buttons107.length; j++) {
			buttons107[j] = new JButton();
			frame107.add(buttons107[j]);
		}
		for (int j = 1; j < buttons108.length; j++) {
			buttons108[j] = new JButton();
			frame108.add(buttons108[j]);
		}
		for (int j = 1; j < buttons109.length; j++) {
			buttons109[j] = new JButton();
			frame109.add(buttons109[j]);
		}
		for (int j = 1; j < buttons110.length; j++) {
			buttons110[j] = new JButton();
			frame110.add(buttons110[j]);
		}
		for (int j = 1; j < buttons111.length; j++) {
			buttons111[j] = new JButton();
			frame111.add(buttons111[j]);
		}
		for (int j = 1; j < buttons112.length; j++) {
			buttons112[j] = new JButton();
			frame112.add(buttons112[j]);
		}
		for (int j = 1; j < buttons113.length; j++) {
			buttons113[j] = new JButton();
			frame113.add(buttons113[j]);
		}
		for (int j = 1; j < buttons114.length; j++) {
			buttons114[j] = new JButton();
			frame114.add(buttons114[j]);
		}

		buttons3[1].setIcon(null);
		buttons3[2].setIcon(null);
		buttons3[3].setIcon(null);
		buttons3[4].setIcon(null);
		buttons3[5].setIcon(tra);
		buttons3[6].setIcon(null);
		buttons3[7].setIcon(null);
		buttons3[8].setIcon(null);
		buttons3[9].setIcon(null);

		buttons7[1].setIcon(kullersten);
		buttons7[2].setIcon(kullersten);
		buttons7[3].setIcon(kullersten);
		buttons7[4].setIcon(kullersten);
		buttons7[5].setIcon(pilb�ge);
		buttons7[6].setIcon(kullersten);
		buttons7[7].setIcon(kullersten);
		buttons7[8].setIcon(r�dsten);
		buttons7[9].setIcon(kullersten);

		buttons8[1].setIcon(sand);
		buttons8[2].setIcon(sand);
		buttons8[3].setIcon(null);
		buttons8[4].setIcon(sand);
		buttons8[5].setIcon(sand);
		buttons8[6].setIcon(null);
		buttons8[7].setIcon(null);
		buttons8[8].setIcon(null);
		buttons8[9].setIcon(null);

		buttons9[1].setIcon(plankor);
		buttons9[2].setIcon(plankor);
		buttons9[3].setIcon(plankor);
		buttons9[4].setIcon(plankor);
		buttons9[5].setIcon(r�dsten);
		buttons9[6].setIcon(plankor);
		buttons9[7].setIcon(plankor);
		buttons9[8].setIcon(plankor);
		buttons9[9].setIcon(plankor);

		buttons10[1].setIcon(null);
		buttons10[2].setIcon(null);
		buttons10[3].setIcon(null);
		buttons10[4].setIcon(ull);
		buttons10[5].setIcon(ull);
		buttons10[6].setIcon(ull);
		buttons10[7].setIcon(plankor);
		buttons10[8].setIcon(plankor);
		buttons10[9].setIcon(plankor);

		buttons11[1].setIcon(guld);
		buttons11[2].setIcon(null);
		buttons11[3].setIcon(guld);
		buttons11[4].setIcon(guld);
		buttons11[5].setIcon(pinne);
		buttons11[6].setIcon(guld);
		buttons11[7].setIcon(guld);
		buttons11[8].setIcon(r�dsten);
		buttons11[9].setIcon(guld);

		buttons12[1].setIcon(pinne);
		buttons12[2].setIcon(null);
		buttons12[3].setIcon(pinne);
		buttons12[4].setIcon(pinne);
		buttons12[5].setIcon(tryckplatta);
		buttons12[6].setIcon(pinne);
		buttons12[7].setIcon(pinne);
		buttons12[8].setIcon(r�dsten);
		buttons12[9].setIcon(pinne);

		buttons13[1].setIcon(null);
		buttons13[2].setIcon(null);
		buttons13[3].setIcon(null);
		buttons13[4].setIcon(null);
		buttons13[5].setIcon(slime);
		buttons13[6].setIcon(null);
		buttons13[7].setIcon(null);
		buttons13[8].setIcon(kolv);
		buttons13[9].setIcon(null);

		buttons14[1].setIcon(plankor);
		buttons14[2].setIcon(plankor);
		buttons14[3].setIcon(plankor);
		buttons14[4].setIcon(kullersten);
		buttons14[5].setIcon(j�rn);
		buttons14[6].setIcon(kullersten);
		buttons14[7].setIcon(kullersten);
		buttons14[8].setIcon(r�dsten);
		buttons14[9].setIcon(kullersten);

		buttons15[1].setIcon(null);
		buttons15[2].setIcon(null);
		buttons15[3].setIcon(null);
		buttons15[4].setIcon(tr�d);
		buttons15[5].setIcon(tr�d);
		buttons15[6].setIcon(null);
		buttons15[7].setIcon(tr�d);
		buttons15[8].setIcon(tr�d);
		buttons15[9].setIcon(null);

		buttons16[1].setIcon(null);
		buttons16[2].setIcon(null);
		buttons16[3].setIcon(null);
		buttons16[4].setIcon(null);
		buttons16[5].setIcon(null);
		buttons16[6].setIcon(null);
		buttons16[7].setIcon(block);
		buttons16[8].setIcon(block);
		buttons16[9].setIcon(block);

		buttons17[1].setIcon(null);
		buttons17[2].setIcon(null);
		buttons17[3].setIcon(null);
		buttons17[4].setIcon(tegel);
		buttons17[5].setIcon(tegel);
		buttons17[6].setIcon(null);
		buttons17[7].setIcon(tegel);
		buttons17[8].setIcon(tegel);
		buttons17[9].setIcon(null);

		buttons18[1].setIcon(krut);
		buttons18[2].setIcon(sand);
		buttons18[3].setIcon(krut);
		buttons18[4].setIcon(sand);
		buttons18[5].setIcon(krut);
		buttons18[6].setIcon(sand);
		buttons18[7].setIcon(krut);
		buttons18[8].setIcon(sand);
		buttons18[9].setIcon(krut);

		buttons19[1].setIcon(plankor);
		buttons19[2].setIcon(plankor);
		buttons19[3].setIcon(plankor);
		buttons19[4].setIcon(bok);
		buttons19[5].setIcon(bok);
		buttons19[6].setIcon(bok);
		buttons19[7].setIcon(plankor);
		buttons19[8].setIcon(plankor);
		buttons19[9].setIcon(plankor);

		buttons20[1].setIcon(null);
		buttons20[2].setIcon(null);
		buttons20[3].setIcon(null);
		buttons20[4].setIcon(null);
		buttons20[5].setIcon(pinne);
		buttons20[6].setIcon(null);
		buttons20[7].setIcon(null);
		buttons20[8].setIcon(kol);
		buttons20[9].setIcon(null);

		buttons21[1].setIcon(null);
		buttons21[2].setIcon(null);
		buttons21[3].setIcon(block);
		buttons21[4].setIcon(null);
		buttons21[5].setIcon(block);
		buttons21[6].setIcon(block);
		buttons21[7].setIcon(block);
		buttons21[8].setIcon(block);
		buttons21[9].setIcon(block);

		buttons22[1].setIcon(plankor);
		buttons22[2].setIcon(plankor);
		buttons22[3].setIcon(plankor);
		buttons22[4].setIcon(plankor);
		buttons22[5].setIcon(null);
		buttons22[6].setIcon(plankor);
		buttons22[7].setIcon(plankor);
		buttons22[8].setIcon(plankor);
		buttons22[9].setIcon(plankor);

		buttons23[1].setIcon(plankor);
		buttons23[2].setIcon(plankor);
		buttons23[3].setIcon(null);
		buttons23[4].setIcon(plankor);
		buttons23[5].setIcon(plankor);
		buttons23[6].setIcon(null);
		buttons23[7].setIcon(null);
		buttons23[8].setIcon(null);
		buttons23[9].setIcon(null);

		buttons24[1].setIcon(kullersten);
		buttons24[2].setIcon(kullersten);
		buttons24[3].setIcon(kullersten);
		buttons24[4].setIcon(kullersten);
		buttons24[5].setIcon(kullersten);
		buttons24[6].setIcon(kullersten);
		buttons24[7].setIcon(kullersten);
		buttons24[8].setIcon(kullersten);
		buttons24[9].setIcon(kullersten);

		buttons25[1].setIcon(plankor);
		buttons25[2].setIcon(plankor);
		buttons25[3].setIcon(plankor);
		buttons25[4].setIcon(plankor);
		buttons25[5].setIcon(plankor);
		buttons25[6].setIcon(plankor);
		buttons25[7].setIcon(null);
		buttons25[8].setIcon(pinne);
		buttons25[9].setIcon(null);

		buttons26[1].setIcon(j�rntr�);
		buttons26[2].setIcon(j�rntr�);
		buttons26[3].setIcon(null);
		buttons26[4].setIcon(j�rntr�);
		buttons26[5].setIcon(j�rntr�);
		buttons26[6].setIcon(null);
		buttons26[7].setIcon(j�rntr�);
		buttons26[8].setIcon(j�rntr�);
		buttons26[9].setIcon(null);

		buttons27[1].setIcon(pinne);
		buttons27[2].setIcon(null);
		buttons27[3].setIcon(pinne);
		buttons27[4].setIcon(pinne);
		buttons27[5].setIcon(pinne);
		buttons27[6].setIcon(pinne);
		buttons27[7].setIcon(pinne);
		buttons27[8].setIcon(null);
		buttons27[9].setIcon(pinne);

		buttons28[1].setIcon(pinne);
		buttons28[2].setIcon(null);
		buttons28[3].setIcon(pinne);
		buttons28[4].setIcon(pinne);
		buttons28[5].setIcon(j�rn);
		buttons28[6].setIcon(pinne);
		buttons28[7].setIcon(pinne);
		buttons28[8].setIcon(null);
		buttons28[9].setIcon(pinne);

		buttons29[1].setIcon(null);
		buttons29[2].setIcon(pinne);
		buttons29[3].setIcon(null);
		buttons29[4].setIcon(null);
		buttons29[5].setIcon(kullersten);
		buttons29[6].setIcon(null);
		buttons29[7].setIcon(null);
		buttons29[8].setIcon(null);
		buttons29[9].setIcon(null);

		buttons30[1].setIcon(null);
		buttons30[2].setIcon(null);
		buttons30[3].setIcon(null);
		buttons30[4].setIcon(null);
		buttons30[5].setIcon(null);
		buttons30[6].setIcon(null);
		buttons30[7].setIcon(null);
		buttons30[8].setIcon(tryck);
		buttons30[9].setIcon(tryck);

		buttons31[1].setIcon(null);
		buttons31[2].setIcon(r�dsten);
		buttons31[3].setIcon(null);
		buttons31[4].setIcon(null);
		buttons31[5].setIcon(pinne);
		buttons31[6].setIcon(null);
		buttons31[7].setIcon(null);
		buttons31[8].setIcon(null);
		buttons31[9].setIcon(null);

		buttons32[1].setIcon(null);
		buttons32[2].setIcon(null);
		buttons32[3].setIcon(null);
		buttons32[4].setIcon(null);
		buttons32[5].setIcon(plankor);
		buttons32[6].setIcon(null);
		buttons32[7].setIcon(null);
		buttons32[8].setIcon(null);
		buttons32[9].setIcon(null);

		buttons33[1].setIcon(sn�boll);
		buttons33[2].setIcon(sn�boll);
		buttons33[3].setIcon(null);
		buttons33[4].setIcon(sn�boll);
		buttons33[5].setIcon(sn�boll);
		buttons33[6].setIcon(null);
		buttons33[7].setIcon(null);
		buttons33[8].setIcon(null);
		buttons33[9].setIcon(null);

		buttons34[1].setIcon(plankor);
		buttons34[2].setIcon(plankor);
		buttons34[3].setIcon(plankor);
		buttons34[4].setIcon(plankor);
		buttons34[5].setIcon(diamant);
		buttons34[6].setIcon(plankor);
		buttons34[7].setIcon(plankor);
		buttons34[8].setIcon(plankor);
		buttons34[9].setIcon(plankor);

		buttons35[1].setIcon(null);
		buttons35[2].setIcon(null);
		buttons35[3].setIcon(null);
		buttons35[4].setIcon(pinne);
		buttons35[5].setIcon(pinne);
		buttons35[6].setIcon(pinne);
		buttons35[7].setIcon(pinne);
		buttons35[8].setIcon(pinne);
		buttons35[9].setIcon(pinne);

		buttons36[1].setIcon(null);
		buttons36[2].setIcon(null);
		buttons36[3].setIcon(null);
		buttons36[4].setIcon(gl�dstenspulver);
		buttons36[5].setIcon(gl�dstenspulver);
		buttons36[6].setIcon(null);
		buttons36[7].setIcon(gl�dstenspulver);
		buttons36[8].setIcon(gl�dstenspulver);
		buttons36[9].setIcon(null);

		buttons37[1].setIcon(null);
		buttons37[2].setIcon(null);
		buttons37[3].setIcon(null);
		buttons37[4].setIcon(null);
		buttons37[5].setIcon(pumpa);
		buttons37[6].setIcon(null);
		buttons37[7].setIcon(null);
		buttons37[8].setIcon(fackla);
		buttons37[9].setIcon(null);

		buttons38[1].setIcon(glas);
		buttons38[2].setIcon(glas);
		buttons38[3].setIcon(glas);
		buttons38[4].setIcon(glas);
		buttons38[5].setIcon(f�rger);
		buttons38[6].setIcon(glas);
		buttons38[7].setIcon(glas);
		buttons38[8].setIcon(glas);
		buttons38[9].setIcon(glas);

		buttons39[1].setIcon(null);
		buttons39[2].setIcon(null);
		buttons39[3].setIcon(null);
		buttons39[4].setIcon(plankor);
		buttons39[5].setIcon(plankor);
		buttons39[6].setIcon(plankor);
		buttons39[7].setIcon(plankor);
		buttons39[8].setIcon(plankor);
		buttons39[9].setIcon(plankor);

		buttons40[1].setIcon(null);
		buttons40[2].setIcon(null);
		buttons40[3].setIcon(null);
		buttons40[4].setIcon(j�rn);
		buttons40[5].setIcon(j�rn);
		buttons40[6].setIcon(j�rn);
		buttons40[7].setIcon(j�rn);
		buttons40[8].setIcon(j�rn);
		buttons40[9].setIcon(j�rn);

		buttons41[1].setIcon(null);
		buttons41[2].setIcon(null);
		buttons41[3].setIcon(null);
		buttons41[4].setIcon(f�rgglas);
		buttons41[5].setIcon(f�rgglas);
		buttons41[6].setIcon(f�rgglas);
		buttons41[7].setIcon(f�rgglas);
		buttons41[8].setIcon(f�rgglas);
		buttons41[9].setIcon(f�rgglas);

		buttons42[1].setIcon(melon);
		buttons42[2].setIcon(melon);
		buttons42[3].setIcon(melon);
		buttons42[4].setIcon(melon);
		buttons42[5].setIcon(melon);
		buttons42[6].setIcon(melon);
		buttons42[7].setIcon(melon);
		buttons42[8].setIcon(melon);
		buttons42[9].setIcon(melon);

		buttons43[1].setIcon(null);
		buttons43[2].setIcon(null);
		buttons43[3].setIcon(null);
		buttons43[4].setIcon(pinne);
		buttons43[5].setIcon(plankor);
		buttons43[6].setIcon(pinne);
		buttons43[7].setIcon(pinne);
		buttons43[8].setIcon(plankor);
		buttons43[9].setIcon(pinne);

		buttons44[1].setIcon(null);
		buttons44[2].setIcon(bok);
		buttons44[3].setIcon(null);
		buttons44[4].setIcon(diamant);
		buttons44[5].setIcon(obsidian);
		buttons44[6].setIcon(diamant);
		buttons44[7].setIcon(obsidian);
		buttons44[8].setIcon(obsidian);
		buttons44[9].setIcon(obsidian);

		buttons45[1].setIcon(null);
		buttons45[2].setIcon(null);
		buttons45[3].setIcon(null);
		buttons45[4].setIcon(null);
		buttons45[5].setIcon(blaze);
		buttons45[6].setIcon(kullersten);
		buttons45[7].setIcon(kullersten);
		buttons45[8].setIcon(kullersten);
		buttons45[9].setIcon(kullersten);

		buttons46[1].setIcon(j�rn);
		buttons46[2].setIcon(null);
		buttons46[3].setIcon(j�rn);
		buttons46[4].setIcon(j�rn);
		buttons46[5].setIcon(null);
		buttons46[6].setIcon(j�rn);
		buttons46[7].setIcon(j�rn);
		buttons46[8].setIcon(j�rn);
		buttons46[9].setIcon(j�rn);

		buttons47[1].setIcon(null);
		buttons47[2].setIcon(r�dsten);
		buttons47[3].setIcon(null);
		buttons47[4].setIcon(r�dsten);
		buttons47[5].setIcon(gl�dstenslampa);
		buttons47[6].setIcon(r�dsten);
		buttons47[7].setIcon(null);
		buttons47[8].setIcon(r�dsten);
		buttons47[9].setIcon(null);

		buttons48[1].setIcon(obsidian);
		buttons48[2].setIcon(obsidian);
		buttons48[3].setIcon(obsidian);
		buttons48[4].setIcon(obsidian);
		buttons48[5].setIcon(ender�ga);
		buttons48[6].setIcon(obsidian);
		buttons48[7].setIcon(obsidian);
		buttons48[8].setIcon(obsidian);
		buttons48[9].setIcon(obsidian);

		buttons49[1].setIcon(null);
		buttons49[2].setIcon(j�rn);
		buttons49[3].setIcon(null);
		buttons49[4].setIcon(null);
		buttons49[5].setIcon(pinne);
		buttons49[6].setIcon(null);
		buttons49[7].setIcon(null);
		buttons49[8].setIcon(plankor);
		buttons49[9].setIcon(null);

		buttons50[1].setIcon(glas);
		buttons50[2].setIcon(glas);
		buttons50[3].setIcon(glas);
		buttons50[4].setIcon(glas);
		buttons50[5].setIcon(nederstj�rna);
		buttons50[6].setIcon(glas);
		buttons50[7].setIcon(obsidian);
		buttons50[8].setIcon(obsidian);
		buttons50[9].setIcon(obsidian);

		buttons51[1].setIcon(null);
		buttons51[2].setIcon(null);
		buttons51[3].setIcon(null);
		buttons51[4].setIcon(kullersten);
		buttons51[5].setIcon(kullersten);
		buttons51[6].setIcon(kullersten);
		buttons51[7].setIcon(kullersten);
		buttons51[8].setIcon(kullersten);
		buttons51[9].setIcon(kullersten);

		buttons52[1].setIcon(null);
		buttons52[2].setIcon(null);
		buttons52[3].setIcon(null);
		buttons52[4].setIcon(tegel);
		buttons52[5].setIcon(null);
		buttons52[6].setIcon(tegel);
		buttons52[7].setIcon(null);
		buttons52[8].setIcon(tegel);
		buttons52[9].setIcon(null);

		buttons53[1].setIcon(j�rnblock);
		buttons53[2].setIcon(j�rnblock);
		buttons53[3].setIcon(j�rnblock);
		buttons53[4].setIcon(null);
		buttons53[5].setIcon(j�rn);
		buttons53[6].setIcon(null);
		buttons53[7].setIcon(j�rn);
		buttons53[8].setIcon(j�rn);
		buttons53[9].setIcon(j�rn);

		buttons54[1].setIcon(null);
		buttons54[2].setIcon(null);
		buttons54[3].setIcon(null);
		buttons54[4].setIcon(snubbeltr�dskrok);
		buttons54[5].setIcon(kista);
		buttons54[6].setIcon(null);
		buttons54[7].setIcon(null);
		buttons54[8].setIcon(null);
		buttons54[9].setIcon(null);

		buttons55[1].setIcon(null);
		buttons55[2].setIcon(r�dsten);
		buttons55[3].setIcon(null);
		buttons55[4].setIcon(r�dsten);
		buttons55[5].setIcon(nederkvarts);
		buttons55[6].setIcon(r�dsten);
		buttons55[7].setIcon(sten);
		buttons55[8].setIcon(sten);
		buttons55[9].setIcon(sten);

		buttons56[1].setIcon(glas);
		buttons56[2].setIcon(glas);
		buttons56[3].setIcon(glas);
		buttons56[4].setIcon(nederkvarts);
		buttons56[5].setIcon(nederkvarts);
		buttons56[6].setIcon(nederkvarts);
		buttons56[7].setIcon(tr�halvblock);
		buttons56[8].setIcon(tr�halvblock);
		buttons56[9].setIcon(tr�halvblock);

		buttons57[1].setIcon(material);
		buttons57[2].setIcon(material);
		buttons57[3].setIcon(material);
		buttons57[4].setIcon(material);
		buttons57[5].setIcon(material);
		buttons57[6].setIcon(material);
		buttons57[7].setIcon(material);
		buttons57[8].setIcon(material);
		buttons57[9].setIcon(material);

		buttons58[1].setIcon(j�rn);
		buttons58[2].setIcon(null);
		buttons58[3].setIcon(j�rn);
		buttons58[4].setIcon(j�rn);
		buttons58[5].setIcon(kista);
		buttons58[6].setIcon(j�rn);
		buttons58[7].setIcon(null);
		buttons58[8].setIcon(j�rn);
		buttons58[9].setIcon(null);

		buttons59[1].setIcon(null);
		buttons59[2].setIcon(ull);
		buttons59[3].setIcon(null);
		buttons59[4].setIcon(null);
		buttons59[5].setIcon(null);
		buttons59[6].setIcon(null);
		buttons59[7].setIcon(null);
		buttons59[8].setIcon(null);
		buttons59[9].setIcon(null);

		buttons60[1].setIcon(j�rn);
		buttons60[2].setIcon(pinne);
		buttons60[3].setIcon(j�rn);
		buttons60[4].setIcon(j�rn);
		buttons60[5].setIcon(r�dstensfackla);
		buttons60[6].setIcon(j�rn);
		buttons60[7].setIcon(j�rn);
		buttons60[8].setIcon(pinne);
		buttons60[9].setIcon(j�rn);

		buttons61[1].setIcon(kullersten);
		buttons61[2].setIcon(kullersten);
		buttons61[3].setIcon(kullersten);
		buttons61[4].setIcon(kullersten);
		buttons61[5].setIcon(null);
		buttons61[6].setIcon(kullersten);
		buttons61[7].setIcon(kullersten);
		buttons61[8].setIcon(r�dsten);
		buttons61[9].setIcon(kullersten);

		buttons62[1].setIcon(vete);
		buttons62[2].setIcon(vete);
		buttons62[3].setIcon(vete);
		buttons62[4].setIcon(vete);
		buttons62[5].setIcon(vete);
		buttons62[6].setIcon(vete);
		buttons62[7].setIcon(vete);
		buttons62[8].setIcon(vete);
		buttons62[9].setIcon(vete);

		buttons63[1].setIcon(null);
		buttons63[2].setIcon(j�rnStenTr�);
		buttons63[3].setIcon(null);
		buttons63[4].setIcon(null);
		buttons63[5].setIcon(pinne);
		buttons63[6].setIcon(null);
		buttons63[7].setIcon(null);
		buttons63[8].setIcon(pinne);
		buttons63[9].setIcon(null);

		buttons64[1].setIcon(j�rnStenTr�);
		buttons64[2].setIcon(j�rnStenTr�);
		buttons64[3].setIcon(null);
		buttons64[4].setIcon(j�rnStenTr�);
		buttons64[5].setIcon(pinne);
		buttons64[6].setIcon(null);
		buttons64[7].setIcon(null);
		buttons64[8].setIcon(pinne);
		buttons64[9].setIcon(null);

		buttons65[1].setIcon(j�rnStenTr�);
		buttons65[2].setIcon(j�rnStenTr�);
		buttons65[3].setIcon(j�rnStenTr�);
		buttons65[4].setIcon(null);
		buttons65[5].setIcon(pinne);
		buttons65[6].setIcon(null);
		buttons65[7].setIcon(null);
		buttons65[8].setIcon(pinne);
		buttons65[9].setIcon(null);

		buttons66[1].setIcon(null);
		buttons66[2].setIcon(j�rnStenTr�);
		buttons66[3].setIcon(null);
		buttons66[4].setIcon(null);
		buttons66[5].setIcon(j�rnStenTr�);
		buttons66[6].setIcon(null);
		buttons66[7].setIcon(null);
		buttons66[8].setIcon(pinne);
		buttons66[9].setIcon(null);

		buttons67[1].setIcon(j�rnStenTr�);
		buttons67[2].setIcon(j�rnStenTr�);
		buttons67[3].setIcon(null);
		buttons67[4].setIcon(null);
		buttons67[5].setIcon(pinne);
		buttons67[6].setIcon(null);
		buttons67[7].setIcon(null);
		buttons67[8].setIcon(pinne);
		buttons67[9].setIcon(null);

		buttons68[1].setIcon(null);
		buttons68[2].setIcon(pinne);
		buttons68[3].setIcon(tr�d);
		buttons68[4].setIcon(pinne);
		buttons68[5].setIcon(null);
		buttons68[6].setIcon(tr�d);
		buttons68[7].setIcon(null);
		buttons68[8].setIcon(pinne);
		buttons68[9].setIcon(tr�d);

		buttons69[1].setIcon(null);
		buttons69[2].setIcon(flinta);
		buttons69[3].setIcon(null);
		buttons69[4].setIcon(null);
		buttons69[5].setIcon(fj�der);
		buttons69[6].setIcon(null);
		buttons69[7].setIcon(null);
		buttons69[8].setIcon(pinne);
		buttons69[9].setIcon(null);

		buttons70[1].setIcon(null);
		buttons70[2].setIcon(null);
		buttons70[3].setIcon(null);
		buttons70[4].setIcon(j�rn);
		buttons70[5].setIcon(flinta);
		buttons70[6].setIcon(null);
		buttons70[7].setIcon(null);
		buttons70[8].setIcon(null);
		buttons70[9].setIcon(null);

		buttons71[1].setIcon(null);
		buttons71[2].setIcon(plankor);
		buttons71[3].setIcon(null);
		buttons71[4].setIcon(null);
		buttons71[5].setIcon(plankor);
		buttons71[6].setIcon(null);
		buttons71[7].setIcon(null);
		buttons71[8].setIcon(null);
		buttons71[9].setIcon(null);

		buttons72[1].setIcon(null);
		buttons72[2].setIcon(null);
		buttons72[3].setIcon(null);
		buttons72[4].setIcon(plankor);
		buttons72[5].setIcon(null);
		buttons72[6].setIcon(plankor);
		buttons72[7].setIcon(null);
		buttons72[8].setIcon(plankor);
		buttons72[9].setIcon(null);

		buttons73[1].setIcon(null);
		buttons73[2].setIcon(null);
		buttons73[3].setIcon(null);
		buttons73[4].setIcon(null);
		buttons73[5].setIcon(null);
		buttons73[6].setIcon(null);
		buttons73[7].setIcon(vete);
		buttons73[8].setIcon(vete);
		buttons73[9].setIcon(vete);

		buttons74[1].setIcon(null);
		buttons74[2].setIcon(null);
		buttons74[3].setIcon(null);
		buttons74[4].setIcon(l�der);
		buttons74[5].setIcon(l�der);
		buttons74[6].setIcon(l�der);
		buttons74[7].setIcon(l�der);
		buttons74[8].setIcon(null);
		buttons74[9].setIcon(l�der);

		buttons75[1].setIcon(l�der);
		buttons75[2].setIcon(null);
		buttons75[3].setIcon(l�der);
		buttons75[4].setIcon(l�der);
		buttons75[5].setIcon(l�der);
		buttons75[6].setIcon(l�der);
		buttons75[7].setIcon(l�der);
		buttons75[8].setIcon(l�der);
		buttons75[9].setIcon(l�der);

		buttons76[1].setIcon(l�der);
		buttons76[2].setIcon(l�der);
		buttons76[3].setIcon(l�der);
		buttons76[4].setIcon(l�der);
		buttons76[5].setIcon(null);
		buttons76[6].setIcon(l�der);
		buttons76[7].setIcon(l�der);
		buttons76[8].setIcon(null);
		buttons76[9].setIcon(l�der);

		buttons77[1].setIcon(null);
		buttons77[2].setIcon(null);
		buttons77[3].setIcon(null);
		buttons77[4].setIcon(l�der);
		buttons77[5].setIcon(null);
		buttons77[6].setIcon(l�der);
		buttons77[7].setIcon(l�der);
		buttons77[8].setIcon(null);
		buttons77[9].setIcon(l�der);

		buttons78[1].setIcon(pinne);
		buttons78[2].setIcon(pinne);
		buttons78[3].setIcon(pinne);
		buttons78[4].setIcon(pinne);
		buttons78[5].setIcon(ull);
		buttons78[6].setIcon(pinne);
		buttons78[7].setIcon(pinne);
		buttons78[8].setIcon(pinne);
		buttons78[9].setIcon(pinne);

		buttons79[1].setIcon(guldklimp);
		buttons79[2].setIcon(guldklimp);
		buttons79[3].setIcon(guldklimp);
		buttons79[4].setIcon(guldklimp);
		buttons79[5].setIcon(�pple);
		buttons79[6].setIcon(guldklimp);
		buttons79[7].setIcon(guldklimp);
		buttons79[8].setIcon(guldklimp);
		buttons79[9].setIcon(guldklimp);

		buttons80[1].setIcon(null);
		buttons80[2].setIcon(null);
		buttons80[3].setIcon(null);
		buttons80[4].setIcon(j�rn);
		buttons80[5].setIcon(null);
		buttons80[6].setIcon(j�rn);
		buttons80[7].setIcon(null);
		buttons80[8].setIcon(j�rn);
		buttons80[9].setIcon(null);

		buttons81[1].setIcon(null);
		buttons81[2].setIcon(null);
		buttons81[3].setIcon(null);
		buttons81[4].setIcon(j�rn);
		buttons81[5].setIcon(null);
		buttons81[6].setIcon(j�rn);
		buttons81[7].setIcon(j�rn);
		buttons81[8].setIcon(j�rn);
		buttons81[9].setIcon(j�rn);

		buttons82[1].setIcon(null);
		buttons82[2].setIcon(null);
		buttons82[3].setIcon(null);
		buttons82[4].setIcon(plankor);
		buttons82[5].setIcon(null);
		buttons82[6].setIcon(plankor);
		buttons82[7].setIcon(plankor);
		buttons82[8].setIcon(plankor);
		buttons82[9].setIcon(plankor);

		buttons83[1].setIcon(null);
		buttons83[2].setIcon(null);
		buttons83[3].setIcon(null);
		buttons83[4].setIcon(null);
		buttons83[5].setIcon(null);
		buttons83[6].setIcon(null);
		buttons83[7].setIcon(sockerr�r);
		buttons83[8].setIcon(sockerr�r);
		buttons83[9].setIcon(sockerr�r);

		buttons84[1].setIcon(null);
		buttons84[2].setIcon(papper);
		buttons84[3].setIcon(null);
		buttons84[4].setIcon(null);
		buttons84[5].setIcon(papper);
		buttons84[6].setIcon(null);
		buttons84[7].setIcon(null);
		buttons84[8].setIcon(papper);
		buttons84[9].setIcon(l�der);

		buttons85[1].setIcon(null);
		buttons85[2].setIcon(null);
		buttons85[3].setIcon(null);
		buttons85[4].setIcon(null);
		buttons85[5].setIcon(kista);
		buttons85[6].setIcon(null);
		buttons85[7].setIcon(null);
		buttons85[8].setIcon(gruvvagn);
		buttons85[9].setIcon(null);

		buttons86[1].setIcon(null);
		buttons86[2].setIcon(null);
		buttons86[3].setIcon(null);
		buttons86[4].setIcon(null);
		buttons86[5].setIcon(ugn);
		buttons86[6].setIcon(null);
		buttons86[7].setIcon(null);
		buttons86[8].setIcon(gruvvagn);
		buttons86[9].setIcon(null);

		buttons87[1].setIcon(null);
		buttons87[2].setIcon(j�rn);
		buttons87[3].setIcon(null);
		buttons87[4].setIcon(j�rn);
		buttons87[5].setIcon(r�dsten);
		buttons87[6].setIcon(j�rn);
		buttons87[7].setIcon(null);
		buttons87[8].setIcon(j�rn);
		buttons87[9].setIcon(null);

		buttons88[1].setIcon(null);
		buttons88[2].setIcon(null);
		buttons88[3].setIcon(pinne);
		buttons88[4].setIcon(null);
		buttons88[5].setIcon(pinne);
		buttons88[6].setIcon(tr�d);
		buttons88[7].setIcon(pinne);
		buttons88[8].setIcon(null);
		buttons88[9].setIcon(tr�d);

		buttons89[1].setIcon(null);
		buttons89[2].setIcon(guld);
		buttons89[3].setIcon(null);
		buttons89[4].setIcon(guld);
		buttons89[5].setIcon(r�dsten);
		buttons89[6].setIcon(guld);
		buttons89[7].setIcon(null);
		buttons89[8].setIcon(guld);
		buttons89[9].setIcon(null);

		buttons91[1].setIcon(null);
		buttons91[2].setIcon(null);
		buttons91[3].setIcon(null);
		buttons91[4].setIcon(null);
		buttons91[5].setIcon(sockerr�r);
		buttons91[6].setIcon(null);
		buttons91[7].setIcon(null);
		buttons91[8].setIcon(null);
		buttons91[9].setIcon(null);

		buttons92[1].setIcon(mj�lk);
		buttons92[2].setIcon(mj�lk);
		buttons92[3].setIcon(mj�lk);
		buttons92[4].setIcon(socker);
		buttons92[5].setIcon(�gg);
		buttons92[6].setIcon(socker);
		buttons92[7].setIcon(vete);
		buttons92[8].setIcon(vete);
		buttons92[9].setIcon(vete);

		buttons93[1].setIcon(null);
		buttons93[2].setIcon(null);
		buttons93[3].setIcon(null);
		buttons93[4].setIcon(r�dstensfackla);
		buttons93[5].setIcon(r�dsten);
		buttons93[6].setIcon(r�dstensfackla);
		buttons93[7].setIcon(sten);
		buttons93[8].setIcon(sten);
		buttons93[9].setIcon(sten);

		buttons94[1].setIcon(null);
		buttons94[2].setIcon(null);
		buttons94[3].setIcon(null);
		buttons94[4].setIcon(null);
		buttons94[5].setIcon(null);
		buttons94[6].setIcon(null);
		buttons94[7].setIcon(vete);
		buttons94[8].setIcon(kakao);
		buttons94[9].setIcon(vete);

		buttons95[1].setIcon(papper);
		buttons95[2].setIcon(papper);
		buttons95[3].setIcon(papper);
		buttons95[4].setIcon(papper);
		buttons95[5].setIcon(kompass);
		buttons95[6].setIcon(papper);
		buttons95[7].setIcon(papper);
		buttons95[8].setIcon(papper);
		buttons95[9].setIcon(papper);

		buttons96[1].setIcon(null);
		buttons96[2].setIcon(null);
		buttons96[3].setIcon(null);
		buttons96[4].setIcon(null);
		buttons96[5].setIcon(j�rn);
		buttons96[6].setIcon(null);
		buttons96[7].setIcon(j�rn);
		buttons96[8].setIcon(null);
		buttons96[9].setIcon(null);

		buttons97[1].setIcon(null);
		buttons97[2].setIcon(null);
		buttons97[3].setIcon(null);
		buttons97[4].setIcon(null);
		buttons97[5].setIcon(melon);
		buttons97[6].setIcon(null);
		buttons97[7].setIcon(null);
		buttons97[8].setIcon(null);
		buttons97[9].setIcon(null);

		buttons98[1].setIcon(null);
		buttons98[2].setIcon(null);
		buttons98[3].setIcon(null);
		buttons98[4].setIcon(null);
		buttons98[5].setIcon(guld);
		buttons98[6].setIcon(null);
		buttons98[7].setIcon(null);
		buttons98[8].setIcon(null);
		buttons98[9].setIcon(null);

		buttons99[1].setIcon(null);
		buttons99[2].setIcon(null);
		buttons99[3].setIcon(null);
		buttons99[4].setIcon(glas);
		buttons99[5].setIcon(null);
		buttons99[6].setIcon(glas);
		buttons99[7].setIcon(null);
		buttons99[8].setIcon(glas);
		buttons99[9].setIcon(null);

		buttons100[1].setIcon(null);
		buttons100[2].setIcon(null);
		buttons100[3].setIcon(null);
		buttons100[4].setIcon(svamp);
		buttons100[5].setIcon(socker);
		buttons100[6].setIcon(null);
		buttons100[7].setIcon(null);
		buttons100[8].setIcon(spindel�ga);
		buttons100[9].setIcon(null);

		buttons101[1].setIcon(null);
		buttons101[2].setIcon(null);
		buttons101[3].setIcon(null);
		buttons101[4].setIcon(null);
		buttons101[5].setIcon(blaze);
		buttons101[6].setIcon(null);
		buttons101[7].setIcon(null);
		buttons101[8].setIcon(null);
		buttons101[9].setIcon(null);

		buttons102[1].setIcon(null);
		buttons102[2].setIcon(null);
		buttons102[3].setIcon(null);
		buttons102[4].setIcon(null);
		buttons102[5].setIcon(slime);
		buttons102[6].setIcon(null);
		buttons102[7].setIcon(null);
		buttons102[8].setIcon(blazepulver);
		buttons102[9].setIcon(null);

		buttons103[1].setIcon(null);
		buttons103[2].setIcon(null);
		buttons103[3].setIcon(null);
		buttons103[4].setIcon(null);
		buttons103[5].setIcon(enderp�rla);
		buttons103[6].setIcon(null);
		buttons103[7].setIcon(null);
		buttons103[8].setIcon(blazepulver);
		buttons103[9].setIcon(null);

		buttons104[1].setIcon(guldklimp);
		buttons104[2].setIcon(guldklimp);
		buttons104[3].setIcon(guldklimp);
		buttons104[4].setIcon(guldklimp);
		buttons104[5].setIcon(melon);
		buttons104[6].setIcon(guldklimp);
		buttons104[7].setIcon(guldklimp);
		buttons104[8].setIcon(guldklimp);
		buttons104[9].setIcon(guldklimp);

		buttons105[1].setIcon(null);
		buttons105[2].setIcon(null);
		buttons105[3].setIcon(null);
		buttons105[4].setIcon(fj�der);
		buttons105[5].setIcon(null);
		buttons105[6].setIcon(null);
		buttons105[7].setIcon(bl�ck);
		buttons105[8].setIcon(bok);
		buttons105[9].setIcon(null);

		buttons106[1].setIcon(pinne);
		buttons106[2].setIcon(pinne);
		buttons106[3].setIcon(pinne);
		buttons106[4].setIcon(pinne);
		buttons106[5].setIcon(l�der);
		buttons106[6].setIcon(pinne);
		buttons106[7].setIcon(pinne);
		buttons106[8].setIcon(pinne);
		buttons106[9].setIcon(pinne);

		buttons107[1].setIcon(guldklimp);
		buttons107[2].setIcon(guldklimp);
		buttons107[3].setIcon(guldklimp);
		buttons107[4].setIcon(guldklimp);
		buttons107[5].setIcon(morot);
		buttons107[6].setIcon(guldklimp);
		buttons107[7].setIcon(guldklimp);
		buttons107[8].setIcon(guldklimp);
		buttons107[9].setIcon(guldklimp);

		buttons108[1].setIcon(null);
		buttons108[2].setIcon(null);
		buttons108[3].setIcon(null);
		buttons108[4].setIcon(fiskesp�);
		buttons108[5].setIcon(null);
		buttons108[6].setIcon(null);
		buttons108[7].setIcon(null);
		buttons108[8].setIcon(morot);
		buttons108[9].setIcon(null);

		buttons109[1].setIcon(null);
		buttons109[2].setIcon(null);
		buttons109[3].setIcon(null);
		buttons109[4].setIcon(pumpa);
		buttons109[5].setIcon(socker);
		buttons109[6].setIcon(null);
		buttons109[7].setIcon(null);
		buttons109[8].setIcon(�gg);
		buttons109[9].setIcon(null);

		buttons110[1].setIcon(null);
		buttons110[2].setIcon(null);
		buttons110[3].setIcon(null);
		buttons110[4].setIcon(raketstj�rna);
		buttons110[5].setIcon(papper);
		buttons110[6].setIcon(krut);
		buttons110[7].setIcon(null);
		buttons110[8].setIcon(null);
		buttons110[9].setIcon(null);

		buttons111[1].setIcon(null);
		buttons111[2].setIcon(null);
		buttons111[3].setIcon(null);
		buttons111[4].setIcon(krut);
		buttons111[5].setIcon(f�rger);
		buttons111[6].setIcon(null);
		buttons111[7].setIcon(null);
		buttons111[8].setIcon(null);
		buttons111[9].setIcon(null);

		buttons112[1].setIcon(null);
		buttons112[2].setIcon(null);
		buttons112[3].setIcon(null);
		buttons112[4].setIcon(null);
		buttons112[5].setIcon(dynamit);
		buttons112[6].setIcon(null);
		buttons112[7].setIcon(null);
		buttons112[8].setIcon(gruvvagn);
		buttons112[9].setIcon(null);

		buttons113[1].setIcon(null);
		buttons113[2].setIcon(null);
		buttons113[3].setIcon(null);
		buttons113[4].setIcon(null);
		buttons113[5].setIcon(hopper);
		buttons113[6].setIcon(null);
		buttons113[7].setIcon(null);
		buttons113[8].setIcon(gruvvagn);
		buttons113[9].setIcon(null);

		buttons114[1].setIcon(tr�d);
		buttons114[2].setIcon(tr�d);
		buttons114[3].setIcon(null);
		buttons114[4].setIcon(tr�d);
		buttons114[5].setIcon(slime);
		buttons114[6].setIcon(null);
		buttons114[7].setIcon(null);
		buttons114[8].setIcon(null);
		buttons114[9].setIcon(tr�d);

		for (int j = 1; j < buttons3.length; j++) {
			if(buttons3[j].getIcon() != null){
				buttons3[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons7.length; j++) {
			if(buttons7[j].getIcon() != null){
				buttons7[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons8.length; j++) {
			if(buttons8[j].getIcon() != null){
				buttons8[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons9.length; j++) {
			if(buttons9[j].getIcon() != null){
				buttons9[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons10.length; j++) {
			if(buttons10[j].getIcon() != null){
				buttons10[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons11.length; j++) {
			if(buttons11[j].getIcon() != null){
				buttons11[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons12.length; j++) {
			if(buttons12[j].getIcon() != null){
				buttons12[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons13.length; j++) {
			if(buttons13[j].getIcon() != null){
				buttons13[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons14.length; j++) {
			if(buttons14[j].getIcon() != null){
				buttons14[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons15.length; j++) {
			if(buttons15[j].getIcon() != null){
				buttons15[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons16.length; j++) {
			if(buttons16[j].getIcon() != null){
				buttons16[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons17.length; j++) {
			if(buttons17[j].getIcon() != null){
				buttons17[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons18.length; j++) {
			if(buttons18[j].getIcon() != null){
				buttons18[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons19.length; j++) {
			if(buttons19[j].getIcon() != null){
				buttons19[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons20.length; j++) {
			if(buttons20[j].getIcon() != null){
				buttons20[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons21.length; j++) {
			if(buttons21[j].getIcon() != null){
				buttons21[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons22.length; j++) {
			if(buttons22[j].getIcon() != null){
				buttons22[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons23.length; j++) {
			if(buttons23[j].getIcon() != null){
				buttons23[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons24.length; j++) {
			if(buttons24[j].getIcon() != null){
				buttons24[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons25.length; j++) {
			if(buttons25[j].getIcon() != null){
				buttons25[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons26.length; j++) {
			if(buttons26[j].getIcon() != null){
				buttons26[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons27.length; j++) {
			if(buttons27[j].getIcon() != null){
				buttons27[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons28.length; j++) {
			if(buttons28[j].getIcon() != null){
				buttons28[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons29.length; j++) {
			if(buttons29[j].getIcon() != null){
				buttons29[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons30.length; j++) {
			if(buttons30[j].getIcon() != null){
				buttons30[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons31.length; j++) {
			if(buttons31[j].getIcon() != null){
				buttons31[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons32.length; j++) {
			if(buttons32[j].getIcon() != null){
				buttons32[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons33.length; j++) {
			if(buttons33[j].getIcon() != null){
				buttons33[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons34.length; j++) {
			if(buttons34[j].getIcon() != null){
				buttons34[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons35.length; j++) {
			if(buttons35[j].getIcon() != null){
				buttons35[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons36.length; j++) {
			if(buttons36[j].getIcon() != null){
				buttons36[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons37.length; j++) {
			if(buttons37[j].getIcon() != null){
				buttons37[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons38.length; j++) {
			if(buttons38[j].getIcon() != null){
				buttons38[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons39.length; j++) {
			if(buttons39[j].getIcon() != null){
				buttons39[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons40.length; j++) {
			if(buttons40[j].getIcon() != null){
				buttons40[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons41.length; j++) {
			if(buttons41[j].getIcon() != null){
				buttons41[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons42.length; j++) {
			if(buttons42[j].getIcon() != null){
				buttons42[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons43.length; j++) {
			if(buttons43[j].getIcon() != null){
				buttons43[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons44.length; j++) {
			if(buttons44[j].getIcon() != null){
				buttons44[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons45.length; j++) {
			if(buttons45[j].getIcon() != null){
				buttons45[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons46.length; j++) {
			if(buttons46[j].getIcon() != null){
				buttons46[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons47.length; j++) {
			if(buttons47[j].getIcon() != null){
				buttons47[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons48.length; j++) {
			if(buttons48[j].getIcon() != null){
				buttons48[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons49.length; j++) {
			if(buttons49[j].getIcon() != null){
				buttons49[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons50.length; j++) {
			if(buttons50[j].getIcon() != null){
				buttons50[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons51.length; j++) {
			if(buttons51[j].getIcon() != null){
				buttons51[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons52.length; j++) {
			if(buttons52[j].getIcon() != null){
				buttons52[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons53.length; j++) {
			if(buttons53[j].getIcon() != null){
				buttons53[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons54.length; j++) {
			if(buttons54[j].getIcon() != null){
				buttons54[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons55.length; j++) {
			if(buttons55[j].getIcon() != null){
				buttons55[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons56.length; j++) {
			if(buttons56[j].getIcon() != null){
				buttons56[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons57.length; j++) {
			if(buttons57[j].getIcon() != null){
				buttons57[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons58.length; j++) {
			if(buttons58[j].getIcon() != null){
				buttons58[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons59.length; j++) {
			if(buttons59[j].getIcon() != null){
				buttons59[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons60.length; j++) {
			if(buttons60[j].getIcon() != null){
				buttons60[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons61.length; j++) {
			if(buttons61[j].getIcon() != null){
				buttons61[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons62.length; j++) {
			if(buttons62[j].getIcon() != null){
				buttons62[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons63.length; j++) {
			if(buttons63[j].getIcon() != null){
				buttons63[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons64.length; j++) {
			if(buttons64[j].getIcon() != null){
				buttons64[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons65.length; j++) {
			if(buttons65[j].getIcon() != null){
				buttons65[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons66.length; j++) {
			if(buttons66[j].getIcon() != null){
				buttons66[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons67.length; j++) {
			if(buttons67[j].getIcon() != null){
				buttons67[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons68.length; j++) {
			if(buttons68[j].getIcon() != null){
				buttons68[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons69.length; j++) {
			if(buttons69[j].getIcon() != null){
				buttons69[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons70.length; j++) {
			if(buttons70[j].getIcon() != null){
				buttons70[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons71.length; j++) {
			if(buttons71[j].getIcon() != null){
				buttons71[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons72.length; j++) {
			if(buttons72[j].getIcon() != null){
				buttons72[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons73.length; j++) {
			if(buttons73[j].getIcon() != null){
				buttons73[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons74.length; j++) {
			if(buttons74[j].getIcon() != null){
				buttons74[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons75.length; j++) {
			if(buttons75[j].getIcon() != null){
				buttons75[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons76.length; j++) {
			if(buttons76[j].getIcon() != null){
				buttons76[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons77.length; j++) {
			if(buttons77[j].getIcon() != null){
				buttons77[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons78.length; j++) {
			if(buttons78[j].getIcon() != null){
				buttons78[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons79.length; j++) {
			if(buttons79[j].getIcon() != null){
				buttons79[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons80.length; j++) {
			if(buttons80[j].getIcon() != null){
				buttons80[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons81.length; j++) {
			if(buttons81[j].getIcon() != null){
				buttons81[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons82.length; j++) {
			if(buttons82[j].getIcon() != null){
				buttons82[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons83.length; j++) {
			if(buttons83[j].getIcon() != null){
				buttons83[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons84.length; j++) {
			if(buttons84[j].getIcon() != null){
				buttons84[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons85.length; j++) {
			if(buttons85[j].getIcon() != null){
				buttons85[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons86.length; j++) {
			if(buttons86[j].getIcon() != null){
				buttons86[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons87.length; j++) {
			if(buttons87[j].getIcon() != null){
				buttons87[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons88.length; j++) {
			if(buttons88[j].getIcon() != null){
				buttons88[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons89.length; j++) {
			if(buttons89[j].getIcon() != null){
				buttons89[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons91.length; j++) {
			if(buttons91[j].getIcon() != null){
				buttons91[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons92.length; j++) {
			if(buttons92[j].getIcon() != null){
				buttons92[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons93.length; j++) {
			if(buttons93[j].getIcon() != null){
				buttons93[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons94.length; j++) {
			if(buttons94[j].getIcon() != null){
				buttons94[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons95.length; j++) {
			if(buttons95[j].getIcon() != null){
				buttons95[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons96.length; j++) {
			if(buttons96[j].getIcon() != null){
				buttons96[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons97.length; j++) {
			if(buttons97[j].getIcon() != null){
				buttons97[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons98.length; j++) {
			if(buttons98[j].getIcon() != null){
				buttons98[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons99.length; j++) {
			if(buttons99[j].getIcon() != null){
				buttons99[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons100.length; j++) {
			if(buttons100[j].getIcon() != null){
				buttons100[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons101.length; j++) {
			if(buttons101[j].getIcon() != null){
				buttons101[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons102.length; j++) {
			if(buttons102[j].getIcon() != null){
				buttons102[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons103.length; j++) {
			if(buttons103[j].getIcon() != null){
				buttons103[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons104.length; j++) {
			if(buttons104[j].getIcon() != null){
				buttons104[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons105.length; j++) {
			if(buttons105[j].getIcon() != null){
				buttons105[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons106.length; j++) {
			if(buttons106[j].getIcon() != null){
				buttons106[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons107.length; j++) {
			if(buttons107[j].getIcon() != null){
				buttons107[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons108.length; j++) {
			if(buttons108[j].getIcon() != null){
				buttons108[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons109.length; j++) {
			if(buttons109[j].getIcon() != null){
				buttons109[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons110.length; j++) {
			if(buttons110[j].getIcon() != null){
				buttons110[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons111.length; j++) {
			if(buttons111[j].getIcon() != null){
				buttons111[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons112.length; j++) {
			if(buttons112[j].getIcon() != null){
				buttons112[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons113.length; j++) {
			if(buttons113[j].getIcon() != null){
				buttons113[j].addActionListener(this);
			}
		}

		for (int j = 1; j < buttons114.length; j++) {
			if(buttons114[j].getIcon() != null){
				buttons114[j].addActionListener(this);
			}
		}

		frame3.setIconImage(frameHuvud.getIconImage());
		frame7.setIconImage(frameHuvud.getIconImage());
		frame8.setIconImage(frameHuvud.getIconImage());
		frame9.setIconImage(frameHuvud.getIconImage());
		frame10.setIconImage(frameHuvud.getIconImage());
		frame11.setIconImage(frameHuvud.getIconImage());
		frame12.setIconImage(frameHuvud.getIconImage());
		frame13.setIconImage(frameHuvud.getIconImage());
		frame14.setIconImage(frameHuvud.getIconImage());
		frame15.setIconImage(frameHuvud.getIconImage());
		frame16.setIconImage(frameHuvud.getIconImage());
		frame17.setIconImage(frameHuvud.getIconImage());
		frame18.setIconImage(frameHuvud.getIconImage());
		frame19.setIconImage(frameHuvud.getIconImage());
		frame20.setIconImage(frameHuvud.getIconImage());
		frame21.setIconImage(frameHuvud.getIconImage());
		frame22.setIconImage(frameHuvud.getIconImage());
		frame23.setIconImage(frameHuvud.getIconImage());
		frame24.setIconImage(frameHuvud.getIconImage());
		frame25.setIconImage(frameHuvud.getIconImage());
		frame26.setIconImage(frameHuvud.getIconImage());
		frame27.setIconImage(frameHuvud.getIconImage());
		frame28.setIconImage(frameHuvud.getIconImage());
		frame29.setIconImage(frameHuvud.getIconImage());
		frame30.setIconImage(frameHuvud.getIconImage());
		frame31.setIconImage(frameHuvud.getIconImage());
		frame32.setIconImage(frameHuvud.getIconImage());
		frame33.setIconImage(frameHuvud.getIconImage());
		frame34.setIconImage(frameHuvud.getIconImage());
		frame35.setIconImage(frameHuvud.getIconImage());
		frame36.setIconImage(frameHuvud.getIconImage());
		frame37.setIconImage(frameHuvud.getIconImage());
		frame38.setIconImage(frameHuvud.getIconImage());
		frame39.setIconImage(frameHuvud.getIconImage());
		frame40.setIconImage(frameHuvud.getIconImage());
		frame41.setIconImage(frameHuvud.getIconImage());
		frame42.setIconImage(frameHuvud.getIconImage());
		frame43.setIconImage(frameHuvud.getIconImage());
		frame44.setIconImage(frameHuvud.getIconImage());
		frame45.setIconImage(frameHuvud.getIconImage());
		frame46.setIconImage(frameHuvud.getIconImage());
		frame47.setIconImage(frameHuvud.getIconImage());
		frame48.setIconImage(frameHuvud.getIconImage());
		frame49.setIconImage(frameHuvud.getIconImage());
		frame50.setIconImage(frameHuvud.getIconImage());
		frame51.setIconImage(frameHuvud.getIconImage());
		frame52.setIconImage(frameHuvud.getIconImage());
		frame53.setIconImage(frameHuvud.getIconImage());
		frame54.setIconImage(frameHuvud.getIconImage());
		frame55.setIconImage(frameHuvud.getIconImage());
		frame56.setIconImage(frameHuvud.getIconImage());
		frame57.setIconImage(frameHuvud.getIconImage());
		frame58.setIconImage(frameHuvud.getIconImage());
		frame59.setIconImage(frameHuvud.getIconImage());
		frame60.setIconImage(frameHuvud.getIconImage());
		frame61.setIconImage(frameHuvud.getIconImage());
		frame62.setIconImage(frameHuvud.getIconImage());
		frame63.setIconImage(frameHuvud.getIconImage());
		frame64.setIconImage(frameHuvud.getIconImage());
		frame65.setIconImage(frameHuvud.getIconImage());
		frame66.setIconImage(frameHuvud.getIconImage());
		frame67.setIconImage(frameHuvud.getIconImage());
		frame68.setIconImage(frameHuvud.getIconImage());
		frame69.setIconImage(frameHuvud.getIconImage());
		frame70.setIconImage(frameHuvud.getIconImage());
		frame71.setIconImage(frameHuvud.getIconImage());
		frame72.setIconImage(frameHuvud.getIconImage());
		frame73.setIconImage(frameHuvud.getIconImage());
		frame74.setIconImage(frameHuvud.getIconImage());
		frame75.setIconImage(frameHuvud.getIconImage());
		frame76.setIconImage(frameHuvud.getIconImage());
		frame77.setIconImage(frameHuvud.getIconImage());
		frame78.setIconImage(frameHuvud.getIconImage());
		frame79.setIconImage(frameHuvud.getIconImage());
		frame80.setIconImage(frameHuvud.getIconImage());
		frame81.setIconImage(frameHuvud.getIconImage());
		frame82.setIconImage(frameHuvud.getIconImage());
		frame83.setIconImage(frameHuvud.getIconImage());
		frame84.setIconImage(frameHuvud.getIconImage());
		frame85.setIconImage(frameHuvud.getIconImage());
		frame86.setIconImage(frameHuvud.getIconImage());
		frame87.setIconImage(frameHuvud.getIconImage());
		frame88.setIconImage(frameHuvud.getIconImage());
		frame89.setIconImage(frameHuvud.getIconImage());
		frame91.setIconImage(frameHuvud.getIconImage());
		frame92.setIconImage(frameHuvud.getIconImage());
		frame93.setIconImage(frameHuvud.getIconImage());
		frame94.setIconImage(frameHuvud.getIconImage());
		frame95.setIconImage(frameHuvud.getIconImage());
		frame96.setIconImage(frameHuvud.getIconImage());
		frame97.setIconImage(frameHuvud.getIconImage());
		frame98.setIconImage(frameHuvud.getIconImage());
		frame99.setIconImage(frameHuvud.getIconImage());
		frame100.setIconImage(frameHuvud.getIconImage());
		frame101.setIconImage(frameHuvud.getIconImage());
		frame102.setIconImage(frameHuvud.getIconImage());
		frame103.setIconImage(frameHuvud.getIconImage());
		frame104.setIconImage(frameHuvud.getIconImage());
		frame105.setIconImage(frameHuvud.getIconImage());
		frame106.setIconImage(frameHuvud.getIconImage());
		frame107.setIconImage(frameHuvud.getIconImage());
		frame108.setIconImage(frameHuvud.getIconImage());
		frame109.setIconImage(frameHuvud.getIconImage());
		frame110.setIconImage(frameHuvud.getIconImage());
		frame111.setIconImage(frameHuvud.getIconImage());
		frame112.setIconImage(frameHuvud.getIconImage());
		frame113.setIconImage(frameHuvud.getIconImage());
		frame114.setIconImage(frameHuvud.getIconImage());
		
		button3.setVerticalTextPosition(JButton.BOTTOM);
		button7.setVerticalTextPosition(JButton.BOTTOM);
		button8.setVerticalTextPosition(JButton.BOTTOM);
		button9.setVerticalTextPosition(JButton.BOTTOM);
		button10.setVerticalTextPosition(JButton.BOTTOM);
		button11.setVerticalTextPosition(JButton.BOTTOM);
		button12.setVerticalTextPosition(JButton.BOTTOM);
		button13.setVerticalTextPosition(JButton.BOTTOM);
		button14.setVerticalTextPosition(JButton.BOTTOM);
		button15.setVerticalTextPosition(JButton.BOTTOM);
		button16.setVerticalTextPosition(JButton.BOTTOM);
		button17.setVerticalTextPosition(JButton.BOTTOM);
		button18.setVerticalTextPosition(JButton.BOTTOM);
		button19.setVerticalTextPosition(JButton.BOTTOM);
		button20.setVerticalTextPosition(JButton.BOTTOM);
		button21.setVerticalTextPosition(JButton.BOTTOM);
		button22.setVerticalTextPosition(JButton.BOTTOM);
		button23.setVerticalTextPosition(JButton.BOTTOM);
		button24.setVerticalTextPosition(JButton.BOTTOM);
		button25.setVerticalTextPosition(JButton.BOTTOM);
		button26.setVerticalTextPosition(JButton.BOTTOM);
		button27.setVerticalTextPosition(JButton.BOTTOM);
		button28.setVerticalTextPosition(JButton.BOTTOM);
		button29.setVerticalTextPosition(JButton.BOTTOM);
		button30.setVerticalTextPosition(JButton.BOTTOM);
		button31.setVerticalTextPosition(JButton.BOTTOM);
		button32.setVerticalTextPosition(JButton.BOTTOM);
		button33.setVerticalTextPosition(JButton.BOTTOM);
		button34.setVerticalTextPosition(JButton.BOTTOM);
		button35.setVerticalTextPosition(JButton.BOTTOM);
		button36.setVerticalTextPosition(JButton.BOTTOM);
		button37.setVerticalTextPosition(JButton.BOTTOM);
		button38.setVerticalTextPosition(JButton.BOTTOM);
		button39.setVerticalTextPosition(JButton.BOTTOM);
		button40.setVerticalTextPosition(JButton.BOTTOM);
		button41.setVerticalTextPosition(JButton.BOTTOM);
		button42.setVerticalTextPosition(JButton.BOTTOM);
		button43.setVerticalTextPosition(JButton.BOTTOM);
		button44.setVerticalTextPosition(JButton.BOTTOM);
		button45.setVerticalTextPosition(JButton.BOTTOM);
		button46.setVerticalTextPosition(JButton.BOTTOM);
		button47.setVerticalTextPosition(JButton.BOTTOM);
		button48.setVerticalTextPosition(JButton.BOTTOM);
		button49.setVerticalTextPosition(JButton.BOTTOM);
		button50.setVerticalTextPosition(JButton.BOTTOM);
		button51.setVerticalTextPosition(JButton.BOTTOM);
		button52.setVerticalTextPosition(JButton.BOTTOM);
		button53.setVerticalTextPosition(JButton.BOTTOM);
		button54.setVerticalTextPosition(JButton.BOTTOM);
		button55.setVerticalTextPosition(JButton.BOTTOM);
		button56.setVerticalTextPosition(JButton.BOTTOM);
		button57.setVerticalTextPosition(JButton.BOTTOM);
		button58.setVerticalTextPosition(JButton.BOTTOM);
		button59.setVerticalTextPosition(JButton.BOTTOM);
		button60.setVerticalTextPosition(JButton.BOTTOM);
		button61.setVerticalTextPosition(JButton.BOTTOM);
		button62.setVerticalTextPosition(JButton.BOTTOM);
		button63.setVerticalTextPosition(JButton.BOTTOM);
		button64.setVerticalTextPosition(JButton.BOTTOM);
		button65.setVerticalTextPosition(JButton.BOTTOM);
		button66.setVerticalTextPosition(JButton.BOTTOM);
		button67.setVerticalTextPosition(JButton.BOTTOM);
		button68.setVerticalTextPosition(JButton.BOTTOM);
		button69.setVerticalTextPosition(JButton.BOTTOM);
		button70.setVerticalTextPosition(JButton.BOTTOM);
		button71.setVerticalTextPosition(JButton.BOTTOM);
		button72.setVerticalTextPosition(JButton.BOTTOM);
		button73.setVerticalTextPosition(JButton.BOTTOM);
		button74.setVerticalTextPosition(JButton.BOTTOM);
		button75.setVerticalTextPosition(JButton.BOTTOM);
		button76.setVerticalTextPosition(JButton.BOTTOM);
		button77.setVerticalTextPosition(JButton.BOTTOM);
		button78.setVerticalTextPosition(JButton.BOTTOM);
		button79.setVerticalTextPosition(JButton.BOTTOM);
		button80.setVerticalTextPosition(JButton.BOTTOM);
		button81.setVerticalTextPosition(JButton.BOTTOM);
		button82.setVerticalTextPosition(JButton.BOTTOM);
		button83.setVerticalTextPosition(JButton.BOTTOM);
		button84.setVerticalTextPosition(JButton.BOTTOM);
		button85.setVerticalTextPosition(JButton.BOTTOM);
		button86.setVerticalTextPosition(JButton.BOTTOM);
		button87.setVerticalTextPosition(JButton.BOTTOM);
		button88.setVerticalTextPosition(JButton.BOTTOM);
		button89.setVerticalTextPosition(JButton.BOTTOM);
		button91.setVerticalTextPosition(JButton.BOTTOM);
		button92.setVerticalTextPosition(JButton.BOTTOM);
		button93.setVerticalTextPosition(JButton.BOTTOM);
		button94.setVerticalTextPosition(JButton.BOTTOM);
		button95.setVerticalTextPosition(JButton.BOTTOM);
		button96.setVerticalTextPosition(JButton.BOTTOM);
		button97.setVerticalTextPosition(JButton.BOTTOM);
		button98.setVerticalTextPosition(JButton.BOTTOM);
		button99.setVerticalTextPosition(JButton.BOTTOM);
		button100.setVerticalTextPosition(JButton.BOTTOM);
		button101.setVerticalTextPosition(JButton.BOTTOM);
		button102.setVerticalTextPosition(JButton.BOTTOM);
		button103.setVerticalTextPosition(JButton.BOTTOM);
		button104.setVerticalTextPosition(JButton.BOTTOM);
		button105.setVerticalTextPosition(JButton.BOTTOM);
		button106.setVerticalTextPosition(JButton.BOTTOM);
		button107.setVerticalTextPosition(JButton.BOTTOM);
		button108.setVerticalTextPosition(JButton.BOTTOM);
		button109.setVerticalTextPosition(JButton.BOTTOM);
		button110.setVerticalTextPosition(JButton.BOTTOM);
		button111.setVerticalTextPosition(JButton.BOTTOM);
		button112.setVerticalTextPosition(JButton.BOTTOM);
		button113.setVerticalTextPosition(JButton.BOTTOM);
		button114.setVerticalTextPosition(JButton.BOTTOM);
	
		button3.setHorizontalTextPosition(JButton.CENTER);
		button7.setHorizontalTextPosition(JButton.CENTER);
		button8.setHorizontalTextPosition(JButton.CENTER);
		button9.setHorizontalTextPosition(JButton.CENTER);
		button10.setHorizontalTextPosition(JButton.CENTER);
		button11.setHorizontalTextPosition(JButton.CENTER);
		button12.setHorizontalTextPosition(JButton.CENTER);
		button13.setHorizontalTextPosition(JButton.CENTER);
		button14.setHorizontalTextPosition(JButton.CENTER);
		button15.setHorizontalTextPosition(JButton.CENTER);
		button16.setHorizontalTextPosition(JButton.CENTER);
		button17.setHorizontalTextPosition(JButton.CENTER);
		button18.setHorizontalTextPosition(JButton.CENTER);
		button19.setHorizontalTextPosition(JButton.CENTER);
		button20.setHorizontalTextPosition(JButton.CENTER);
		button21.setHorizontalTextPosition(JButton.CENTER);
		button22.setHorizontalTextPosition(JButton.CENTER);
		button23.setHorizontalTextPosition(JButton.CENTER);
		button24.setHorizontalTextPosition(JButton.CENTER);
		button25.setHorizontalTextPosition(JButton.CENTER);
		button26.setHorizontalTextPosition(JButton.CENTER);
		button27.setHorizontalTextPosition(JButton.CENTER);
		button28.setHorizontalTextPosition(JButton.CENTER);
		button29.setHorizontalTextPosition(JButton.CENTER);
		button30.setHorizontalTextPosition(JButton.CENTER);
		button31.setHorizontalTextPosition(JButton.CENTER);
		button32.setHorizontalTextPosition(JButton.CENTER);
		button33.setHorizontalTextPosition(JButton.CENTER);
		button34.setHorizontalTextPosition(JButton.CENTER);
		button35.setHorizontalTextPosition(JButton.CENTER);
		button36.setHorizontalTextPosition(JButton.CENTER);
		button37.setHorizontalTextPosition(JButton.CENTER);
		button38.setHorizontalTextPosition(JButton.CENTER);
		button39.setHorizontalTextPosition(JButton.CENTER);
		button40.setHorizontalTextPosition(JButton.CENTER);
		button41.setHorizontalTextPosition(JButton.CENTER);
		button42.setHorizontalTextPosition(JButton.CENTER);
		button43.setHorizontalTextPosition(JButton.CENTER);
		button44.setHorizontalTextPosition(JButton.CENTER);
		button45.setHorizontalTextPosition(JButton.CENTER);
		button46.setHorizontalTextPosition(JButton.CENTER);
		button47.setHorizontalTextPosition(JButton.CENTER);
		button48.setHorizontalTextPosition(JButton.CENTER);
		button49.setHorizontalTextPosition(JButton.CENTER);
		button50.setHorizontalTextPosition(JButton.CENTER);
		button51.setHorizontalTextPosition(JButton.CENTER);
		button52.setHorizontalTextPosition(JButton.CENTER);
		button53.setHorizontalTextPosition(JButton.CENTER);
		button54.setHorizontalTextPosition(JButton.CENTER);
		button55.setHorizontalTextPosition(JButton.CENTER);
		button56.setHorizontalTextPosition(JButton.CENTER);
		button57.setHorizontalTextPosition(JButton.CENTER);
		button58.setHorizontalTextPosition(JButton.CENTER);
		button59.setHorizontalTextPosition(JButton.CENTER);
		button60.setHorizontalTextPosition(JButton.CENTER);
		button61.setHorizontalTextPosition(JButton.CENTER);
		button62.setHorizontalTextPosition(JButton.CENTER);
		button63.setHorizontalTextPosition(JButton.CENTER);
		button64.setHorizontalTextPosition(JButton.CENTER);
		button65.setHorizontalTextPosition(JButton.CENTER);
		button66.setHorizontalTextPosition(JButton.CENTER);
		button67.setHorizontalTextPosition(JButton.CENTER);
		button68.setHorizontalTextPosition(JButton.CENTER);
		button69.setHorizontalTextPosition(JButton.CENTER);
		button70.setHorizontalTextPosition(JButton.CENTER);
		button71.setHorizontalTextPosition(JButton.CENTER);
		button72.setHorizontalTextPosition(JButton.CENTER);
		button73.setHorizontalTextPosition(JButton.CENTER);
		button74.setHorizontalTextPosition(JButton.CENTER);
		button75.setHorizontalTextPosition(JButton.CENTER);
		button76.setHorizontalTextPosition(JButton.CENTER);
		button77.setHorizontalTextPosition(JButton.CENTER);
		button78.setHorizontalTextPosition(JButton.CENTER);
		button79.setHorizontalTextPosition(JButton.CENTER);
		button80.setHorizontalTextPosition(JButton.CENTER);
		button81.setHorizontalTextPosition(JButton.CENTER);
		button82.setHorizontalTextPosition(JButton.CENTER);
		button83.setHorizontalTextPosition(JButton.CENTER);
		button84.setHorizontalTextPosition(JButton.CENTER);
		button85.setHorizontalTextPosition(JButton.CENTER);
		button86.setHorizontalTextPosition(JButton.CENTER);
		button87.setHorizontalTextPosition(JButton.CENTER);
		button88.setHorizontalTextPosition(JButton.CENTER);
		button89.setHorizontalTextPosition(JButton.CENTER);
		button91.setHorizontalTextPosition(JButton.CENTER);
		button92.setHorizontalTextPosition(JButton.CENTER);
		button93.setHorizontalTextPosition(JButton.CENTER);
		button94.setHorizontalTextPosition(JButton.CENTER);
		button95.setHorizontalTextPosition(JButton.CENTER);
		button96.setHorizontalTextPosition(JButton.CENTER);
		button97.setHorizontalTextPosition(JButton.CENTER);
		button98.setHorizontalTextPosition(JButton.CENTER);
		button99.setHorizontalTextPosition(JButton.CENTER);
		button100.setHorizontalTextPosition(JButton.CENTER);
		button101.setHorizontalTextPosition(JButton.CENTER);
		button102.setHorizontalTextPosition(JButton.CENTER);
		button103.setHorizontalTextPosition(JButton.CENTER);
		button104.setHorizontalTextPosition(JButton.CENTER);
		button105.setHorizontalTextPosition(JButton.CENTER);
		button106.setHorizontalTextPosition(JButton.CENTER);
		button107.setHorizontalTextPosition(JButton.CENTER);
		button108.setHorizontalTextPosition(JButton.CENTER);
		button109.setHorizontalTextPosition(JButton.CENTER);
		button110.setHorizontalTextPosition(JButton.CENTER);
		button111.setHorizontalTextPosition(JButton.CENTER);
		button112.setHorizontalTextPosition(JButton.CENTER);
		button113.setHorizontalTextPosition(JButton.CENTER);
		button114.setHorizontalTextPosition(JButton.CENTER);
		
		frame.setLayout(new GridLayout(0, 3));

		frameHuvud.setJMenuBar(bar);
		
		bar.add(spr�kMeny);
		bar.add(hj�lpMenu);
		
		text.addKeyListener(this);
		
		bar.add(text);
		
		helpItem.addActionListener(this);

		mailTimer.start();
		
		spr�kMeny.add(v�ljSpr�k);
		hj�lpMenu.add(helpItem);
		v�ljSpr�k.addActionListener(this);

		frameHuvud.add(scrollBar);
		frameHuvud.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameHuvud.setLocationRelativeTo(null);
		frameHuvud.setVisible(true);
		

	}

	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==mailTimer){
		
		if(Ladda.mailSkickat==false){
			//Mail
			
			try {
				System.out.println("jndsnl");
				Mail.Skicka("gojb@gojb.bl.ee", "Anv�ndande av GoJbGuide", "Namn:  " + prop.getProperty("Namn") + ", Spr�k:  " + prop.getProperty("9778436klbgflf") + "\n //lhdohf7984 = Engelska \n //86325yhrel = Svenska");
				prop.setProperty("y", "10");
				System.out.println("Skickat!");
				mailTimer.stop();
				try {
					prop.store(new FileWriter(new File(System.getProperty("user.home") + "\\AppData\\Roaming\\GoJb\\settings.gojb")),"Inst�llningar f�r GoJbGuide");
					System.out.println("Lyckades skriva i prop");
				} catch (Exception e1) {
					System.out.println("lijashf�livbfspxkl");
					e1.printStackTrace();
				}
			} catch (Exception e1) {
				System.err.println("Mejl misslyckadess att skickas");
				e1.printStackTrace();
			}

		}
		if(Ladda.mailSkickat==true){
			mailTimer.stop();
		}
		}
		if (e.getSource()==helpItem){
		
		JOptionPane.showMessageDialog(null, help);
		}
		
		System.out.println("N�gon knapp nedtryckt!");	
		
		frame3.setVisible(false);
		frame7.setVisible(false);
		frame8.setVisible(false);
		frame9.setVisible(false);
		frame10.setVisible(false);
		frame11.setVisible(false);
		frame12.setVisible(false);
		frame13.setVisible(false);
		frame14.setVisible(false);
		frame15.setVisible(false);
		frame16.setVisible(false);
		frame17.setVisible(false);
		frame18.setVisible(false);
		frame19.setVisible(false);
		frame20.setVisible(false);
		frame21.setVisible(false);
		frame22.setVisible(false);
		frame23.setVisible(false);
		frame24.setVisible(false);
		frame25.setVisible(false);
		frame26.setVisible(false);
		frame27.setVisible(false);
		frame28.setVisible(false);
		frame29.setVisible(false);
		frame30.setVisible(false);
		frame31.setVisible(false);
		frame32.setVisible(false);
		frame33.setVisible(false);
		frame34.setVisible(false);
		frame35.setVisible(false);
		frame36.setVisible(false);
		frame37.setVisible(false);
		frame38.setVisible(false);
		frame39.setVisible(false);
		frame40.setVisible(false);
		frame41.setVisible(false);
		frame42.setVisible(false);
		frame43.setVisible(false);
		frame44.setVisible(false);
		frame45.setVisible(false);
		frame46.setVisible(false);
		frame47.setVisible(false);
		frame48.setVisible(false);
		frame49.setVisible(false);
		frame50.setVisible(false);
		frame51.setVisible(false);
		frame52.setVisible(false);
		frame53.setVisible(false);
		frame54.setVisible(false);
		frame55.setVisible(false);
		frame56.setVisible(false);
		frame57.setVisible(false);
		frame58.setVisible(false);
		frame59.setVisible(false);
		frame60.setVisible(false);
		frame61.setVisible(false);
		frame62.setVisible(false);
		frame63.setVisible(false);
		frame64.setVisible(false);
		frame65.setVisible(false);
		frame66.setVisible(false);
		frame67.setVisible(false);
		frame68.setVisible(false);
		frame69.setVisible(false);
		frame70.setVisible(false);
		frame71.setVisible(false);
		frame72.setVisible(false);
		frame73.setVisible(false);
		frame74.setVisible(false);
		frame75.setVisible(false);
		frame76.setVisible(false);
		frame77.setVisible(false);
		frame78.setVisible(false);
		frame79.setVisible(false);
		frame80.setVisible(false);
		frame81.setVisible(false);
		frame82.setVisible(false);
		frame83.setVisible(false);
		frame84.setVisible(false);
		frame85.setVisible(false);
		frame86.setVisible(false);
		frame87.setVisible(false);
		frame88.setVisible(false);
		frame89.setVisible(false);
		frame91.setVisible(false);
		frame92.setVisible(false);
		frame93.setVisible(false);
		frame94.setVisible(false);
		frame95.setVisible(false);
		frame96.setVisible(false);
		frame97.setVisible(false);
		frame98.setVisible(false);
		frame99.setVisible(false);
		frame100.setVisible(false);
		frame101.setVisible(false);
		frame102.setVisible(false);
		frame103.setVisible(false);
		frame104.setVisible(false);
		frame105.setVisible(false);
		frame106.setVisible(false);
		frame107.setVisible(false);
		frame108.setVisible(false);
		frame109.setVisible(false);
		frame110.setVisible(false);
		frame111.setVisible(false);
		frame112.setVisible(false);
		frame113.setVisible(false);
		frame114.setVisible(false);

		
		frame3.setLocationRelativeTo(frameHuvud);
		frame7.setLocationRelativeTo(frameHuvud);
		frame8.setLocationRelativeTo(frameHuvud);
		frame9.setLocationRelativeTo(frameHuvud);
		frame10.setLocationRelativeTo(frameHuvud);
		frame11.setLocationRelativeTo(frameHuvud);
		frame12.setLocationRelativeTo(frameHuvud);
		frame13.setLocationRelativeTo(frameHuvud);
		frame14.setLocationRelativeTo(frameHuvud);
		frame15.setLocationRelativeTo(frameHuvud);
		frame16.setLocationRelativeTo(frameHuvud);
		frame17.setLocationRelativeTo(frameHuvud);
		frame18.setLocationRelativeTo(frameHuvud);
		frame19.setLocationRelativeTo(frameHuvud);
		frame20.setLocationRelativeTo(frameHuvud);
		frame21.setLocationRelativeTo(frameHuvud);
		frame22.setLocationRelativeTo(frameHuvud);
		frame23.setLocationRelativeTo(frameHuvud);
		frame24.setLocationRelativeTo(frameHuvud);
		frame25.setLocationRelativeTo(frameHuvud);
		frame26.setLocationRelativeTo(frameHuvud);
		frame27.setLocationRelativeTo(frameHuvud);
		frame28.setLocationRelativeTo(frameHuvud);
		frame29.setLocationRelativeTo(frameHuvud);
		frame30.setLocationRelativeTo(frameHuvud);
		frame31.setLocationRelativeTo(frameHuvud);
		frame32.setLocationRelativeTo(frameHuvud);
		frame33.setLocationRelativeTo(frameHuvud);
		frame34.setLocationRelativeTo(frameHuvud);
		frame35.setLocationRelativeTo(frameHuvud);
		frame36.setLocationRelativeTo(frameHuvud);
		frame37.setLocationRelativeTo(frameHuvud);
		frame38.setLocationRelativeTo(frameHuvud);
		frame39.setLocationRelativeTo(frameHuvud);
		frame40.setLocationRelativeTo(frameHuvud);
		frame41.setLocationRelativeTo(frameHuvud);
		frame42.setLocationRelativeTo(frameHuvud);
		frame43.setLocationRelativeTo(frameHuvud);
		frame44.setLocationRelativeTo(frameHuvud);
		frame45.setLocationRelativeTo(frameHuvud);
		frame46.setLocationRelativeTo(frameHuvud);
		frame47.setLocationRelativeTo(frameHuvud);
		frame48.setLocationRelativeTo(frameHuvud);
		frame49.setLocationRelativeTo(frameHuvud);
		frame50.setLocationRelativeTo(frameHuvud);
		frame51.setLocationRelativeTo(frameHuvud);
		frame52.setLocationRelativeTo(frameHuvud);
		frame53.setLocationRelativeTo(frameHuvud);
		frame54.setLocationRelativeTo(frameHuvud);
		frame55.setLocationRelativeTo(frameHuvud);
		frame56.setLocationRelativeTo(frameHuvud);
		frame57.setLocationRelativeTo(frameHuvud);
		frame58.setLocationRelativeTo(frameHuvud);
		frame59.setLocationRelativeTo(frameHuvud);
		frame60.setLocationRelativeTo(frameHuvud);
		frame61.setLocationRelativeTo(frameHuvud);
		frame62.setLocationRelativeTo(frameHuvud);
		frame63.setLocationRelativeTo(frameHuvud);
		frame64.setLocationRelativeTo(frameHuvud);
		frame65.setLocationRelativeTo(frameHuvud);
		frame66.setLocationRelativeTo(frameHuvud);
		frame67.setLocationRelativeTo(frameHuvud);
		frame68.setLocationRelativeTo(frameHuvud);
		frame69.setLocationRelativeTo(frameHuvud);
		frame70.setLocationRelativeTo(frameHuvud);
		frame71.setLocationRelativeTo(frameHuvud);
		frame72.setLocationRelativeTo(frameHuvud);
		frame73.setLocationRelativeTo(frameHuvud);
		frame74.setLocationRelativeTo(frameHuvud);
		frame75.setLocationRelativeTo(frameHuvud);
		frame76.setLocationRelativeTo(frameHuvud);
		frame77.setLocationRelativeTo(frameHuvud);
		frame78.setLocationRelativeTo(frameHuvud);
		frame79.setLocationRelativeTo(frameHuvud);
		frame80.setLocationRelativeTo(frameHuvud);
		frame81.setLocationRelativeTo(frameHuvud);
		frame82.setLocationRelativeTo(frameHuvud);
		frame83.setLocationRelativeTo(frameHuvud);
		frame84.setLocationRelativeTo(frameHuvud);
		frame85.setLocationRelativeTo(frameHuvud);
		frame86.setLocationRelativeTo(frameHuvud);
		frame87.setLocationRelativeTo(frameHuvud);
		frame88.setLocationRelativeTo(frameHuvud);
		frame89.setLocationRelativeTo(frameHuvud);
		frame91.setLocationRelativeTo(frameHuvud);
		frame92.setLocationRelativeTo(frameHuvud);
		frame93.setLocationRelativeTo(frameHuvud);
		frame94.setLocationRelativeTo(frameHuvud);
		frame95.setLocationRelativeTo(frameHuvud);
		frame96.setLocationRelativeTo(frameHuvud);
		frame97.setLocationRelativeTo(frameHuvud);
		frame98.setLocationRelativeTo(frameHuvud);
		frame99.setLocationRelativeTo(frameHuvud);
		frame100.setLocationRelativeTo(frameHuvud);
		frame101.setLocationRelativeTo(frameHuvud);
		frame102.setLocationRelativeTo(frameHuvud);
		frame103.setLocationRelativeTo(frameHuvud);
		frame104.setLocationRelativeTo(frameHuvud);
		frame105.setLocationRelativeTo(frameHuvud);
		frame106.setLocationRelativeTo(frameHuvud);
		frame107.setLocationRelativeTo(frameHuvud);
		frame108.setLocationRelativeTo(frameHuvud);
		frame109.setLocationRelativeTo(frameHuvud);
		frame110.setLocationRelativeTo(frameHuvud);
		frame111.setLocationRelativeTo(frameHuvud);
		frame112.setLocationRelativeTo(frameHuvud);
		frame113.setLocationRelativeTo(frameHuvud);
		frame114.setLocationRelativeTo(frameHuvud);

		if (e.getSource() == button3){
			frame3.setVisible(true); 
		}
		if (e.getSource() == button7){
			frame7.setVisible(true); 
		}
		if (e.getSource() == button8){
			frame8.setVisible(true); 
		}
		if (e.getSource() == button9){
			frame9.setVisible(true); 
		}
		if (e.getSource() == button10){
			frame10.setVisible(true); 
		}
		if (e.getSource() == button11){
			frame11.setVisible(true); 
		}
		if (e.getSource() == button12){
			frame12.setVisible(true); 
		}
		if (e.getSource() == button13){
			frame13.setVisible(true); 
		}
		if (e.getSource() == button14){
			frame14.setVisible(true); 
		}
		if (e.getSource() == button15){
			frame15.setVisible(true); 
		}
		if (e.getSource() == button16){
			frame16.setVisible(true); 
		}
		if (e.getSource() == button17){
			frame17.setVisible(true); 
		}
		if (e.getSource() == button18){
			frame18.setVisible(true); 
		}
		if (e.getSource() == button19){
			frame19.setVisible(true); 
		}
		if (e.getSource() == button20){
			frame20.setVisible(true); 
		}
		if (e.getSource() == button21){
			frame21.setVisible(true); 
		}
		if (e.getSource() == button22){
			frame22.setVisible(true); 
		}
		if (e.getSource() == button23){
			frame23.setVisible(true); 
		}
		if (e.getSource() == button24){
			frame24.setVisible(true); 
		}
		if (e.getSource() == button25){
			frame25.setVisible(true); 
		}
		if (e.getSource() == button26){
			frame26.setVisible(true); 
		}
		if (e.getSource() == button27){
			frame27.setVisible(true); 
		}
		if (e.getSource() == button28){
			frame28.setVisible(true); 
		}
		if (e.getSource() == button29){
			frame29.setVisible(true); 
		}
		if (e.getSource() == button30){
			frame30.setVisible(true); 
		}
		if (e.getSource() == button31){
			frame31.setVisible(true); 
		}
		if (e.getSource() == button32){
			frame32.setVisible(true); 
		}
		if (e.getSource() == button33){
			frame33.setVisible(true); 
		}
		if (e.getSource() == button34){
			frame34.setVisible(true); 
		}
		if (e.getSource() == button35){
			frame35.setVisible(true); 
		}
		if (e.getSource() == button36){
			frame36.setVisible(true); 
		}
		if (e.getSource() == button37){
			frame37.setVisible(true); 
		}
		if (e.getSource() == button38){
			frame38.setVisible(true); 
		}
		if (e.getSource() == button39){
			frame39.setVisible(true); 
		}
		if (e.getSource() == button40){
			frame40.setVisible(true); 
		}
		if (e.getSource() == button41){
			frame41.setVisible(true); 
		}
		if (e.getSource() == button42){
			frame42.setVisible(true); 
		}
		if (e.getSource() == button43){
			frame43.setVisible(true); 
		}
		if (e.getSource() == button44){
			frame44.setVisible(true); 
		}
		if (e.getSource() == button45){
			frame45.setVisible(true); 
		}
		if (e.getSource() == button46){
			frame46.setVisible(true); 
		}
		if (e.getSource() == button47){
			frame47.setVisible(true); 
		}
		if (e.getSource() == button48){
			frame48.setVisible(true); 
		}
		if (e.getSource() == button49){
			frame49.setVisible(true); 
		}
		if (e.getSource() == button50){
			frame50.setVisible(true); 
		}
		if (e.getSource() == button51){
			frame51.setVisible(true); 
		}
		if (e.getSource() == button52){
			frame52.setVisible(true); 
		}
		if (e.getSource() == button53){
			frame53.setVisible(true); 
		}
		if (e.getSource() == button54){
			frame54.setVisible(true); 
		}
		if (e.getSource() == button55){
			frame55.setVisible(true); 
		}
		if (e.getSource() == button56){
			frame56.setVisible(true); 
		}
		if (e.getSource() == button57){
			frame57.setVisible(true); 
		}
		if (e.getSource() == button58){
			frame58.setVisible(true); 
		}
		if (e.getSource() == button59){
			frame59.setVisible(true); 
		}
		if (e.getSource() == button60){
			frame60.setVisible(true); 
		}
		if (e.getSource() == button61){
			frame61.setVisible(true); 
		}
		if (e.getSource() == button62){
			frame62.setVisible(true); 
		}
		if (e.getSource() == button63){
			frame63.setVisible(true); 
		}
		if (e.getSource() == button64){
			frame64.setVisible(true); 
		}
		if (e.getSource() == button65){
			frame65.setVisible(true); 
		}
		if (e.getSource() == button66){
			frame66.setVisible(true); 
		}
		if (e.getSource() == button67){
			frame67.setVisible(true); 
		}
		if (e.getSource() == button68){
			frame68.setVisible(true); 
		}
		if (e.getSource() == button69){
			frame69.setVisible(true); 
		}
		if (e.getSource() == button70){
			frame70.setVisible(true); 
		}
		if (e.getSource() == button71){
			frame71.setVisible(true); 
		}
		if (e.getSource() == button72){
			frame72.setVisible(true); 
		}
		if (e.getSource() == button73){
			frame73.setVisible(true); 
		}
		if (e.getSource() == button74){
			frame74.setVisible(true); 
		}
		if (e.getSource() == button75){
			frame75.setVisible(true); 
		}
		if (e.getSource() == button76){
			frame76.setVisible(true); 
		}
		if (e.getSource() == button77){
			frame77.setVisible(true); 
		}
		if (e.getSource() == button78){
			frame78.setVisible(true); 
		}
		if (e.getSource() == button79){
			frame79.setVisible(true); 
		}
		if (e.getSource() == button80){
			frame80.setVisible(true); 
		}
		if (e.getSource() == button81){
			frame81.setVisible(true); 
		}
		if (e.getSource() == button82){
			frame82.setVisible(true); 
		}
		if (e.getSource() == button83){
			frame83.setVisible(true); 
		}
		if (e.getSource() == button84){
			frame84.setVisible(true); 
		}
		if (e.getSource() == button85){
			frame85.setVisible(true); 
		}
		if (e.getSource() == button86){
			frame86.setVisible(true); 
		}
		if (e.getSource() == button87){
			frame87.setVisible(true); 
		}
		if (e.getSource() == button88){
			frame88.setVisible(true); 
		}
		if (e.getSource() == button89){
			frame89.setVisible(true); 
		}
		if (e.getSource() == button91){
			frame91.setVisible(true); 
		}
		if (e.getSource() == button92){
			frame92.setVisible(true); 
		}
		if (e.getSource() == button93){
			frame93.setVisible(true); 
		}
		if (e.getSource() == button94){
			frame94.setVisible(true); 
		}
		if (e.getSource() == button95){
			frame95.setVisible(true); 
		}
		if (e.getSource() == button96){
			frame96.setVisible(true); 
		}
		if (e.getSource() == button97){
			frame97.setVisible(true); 
		}
		if (e.getSource() == button98){
			frame98.setVisible(true); 
		}
		if (e.getSource() == button99){
			frame99.setVisible(true); 
		}
		if (e.getSource() == button100){
			frame100.setVisible(true); 
		}
		if (e.getSource() == button101){
			frame101.setVisible(true); 
		}
		if (e.getSource() == button102){
			frame102.setVisible(true); 
		}
		if (e.getSource() == button103){
			frame103.setVisible(true); 
		}
		if (e.getSource() == button104){
			frame104.setVisible(true); 
		}
		if (e.getSource() == button105){
			frame105.setVisible(true); 
		}
		if (e.getSource() == button106){
			frame106.setVisible(true); 
		}
		if (e.getSource() == button107){
			frame107.setVisible(true); 
		}
		if (e.getSource() == button108){
			frame108.setVisible(true); 
		}
		if (e.getSource() == button109){
			frame109.setVisible(true); 
		}
		if (e.getSource() == button110){
			frame110.setVisible(true); 
		}
		if (e.getSource() == button111){
			frame111.setVisible(true); 
		}
		if (e.getSource() == button112){
			frame112.setVisible(true); 
		}
		if (e.getSource() == button113){
			frame113.setVisible(true); 
		}
		if (e.getSource() == button114){
			frame114.setVisible(true); 
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
		if (abc==r�dsten) {
			JOptionPane.showMessageDialog(null, r�dString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==plankor) {
			frame3.setVisible(true);
		}
		if (abc==pilb�ge) {
			frame68.setVisible(true);
		}
		if (abc==sand) {
			JOptionPane.showMessageDialog(null, sandString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==ull) {
			frame15.setVisible(true);
		}
		if (abc==guld) {
			JOptionPane.showMessageDialog(null, guldString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==pinne) {
			frame71.setVisible(true);
		}
		if (abc==tryckplatta) {
			frame30.setVisible(true);
		}
		if (abc==kolv) {
			frame14.setVisible(true);
		}
		if (abc==slime) {
			JOptionPane.showMessageDialog(null, slimesString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==tr�d) {
			JOptionPane.showMessageDialog(null, tr�dsString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==tegel) {
			JOptionPane.showMessageDialog(null, tegelString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==krut) {
			JOptionPane.showMessageDialog(null, krutString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==j�rn) {
			JOptionPane.showMessageDialog(null, j�rnString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==diamant) {
			JOptionPane.showMessageDialog(null, diamantString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==sn�boll) {
			JOptionPane.showMessageDialog(null, sn�bollString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==obsidian) {
			JOptionPane.showMessageDialog(null, obsidianString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==ender�ga) {
			frame103.setVisible(true);
		}
		if (abc==bok) {
			frame84.setVisible(true);
		}
		if (abc==papper) {
			frame83.setVisible(true);
		}
		if (abc==l�der) {
			JOptionPane.showMessageDialog(null, l�dersString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==gruvvagn) {
			frame81.setVisible(true);
		}
		if (abc==hopper) {
			frame58.setVisible(true);
		}
		if (abc==kista) {
			frame22.setVisible(true);
		}
		if (abc==ugn) {
			frame24.setVisible(true);
		}
		if (abc==f�rger) {
			JOptionPane.showMessageDialog(null, f�rgerString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==raketstj�rna) {
			frame111.setVisible(true);
		}
		if (abc==dynamit) {
			frame18.setVisible(true);
		}
		if (abc==block) {
			frame57.setVisible(true);
		}
		if (abc==socker) {
			frame91.setVisible(true);
		}
		if (abc==pumpa) {
			JOptionPane.showMessageDialog(null, pumpaString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==�gg) {
			JOptionPane.showMessageDialog(null, �ggString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==kol) {
			JOptionPane.showMessageDialog(null, kolString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==morot) {
			JOptionPane.showMessageDialog(null, morotString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==fiskesp�) {
			frame88.setVisible(true);
		}
		if (abc==guldklimp) {
			frame98.setVisible(true);
		}
		if (abc==j�rntr�) {
			JOptionPane.showMessageDialog(null, j�rnelrtr�dString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==fj�der) {
			JOptionPane.showMessageDialog(null, fj�derString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==bl�ck) {
			JOptionPane.showMessageDialog(null, bl�ckString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==tryck) {
			JOptionPane.showMessageDialog(null, tr�j�rnstenString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==melon) {
			JOptionPane.showMessageDialog(null, melonString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==blazepulver) {
			frame101.setVisible(true);
		}
		if (abc==blaze) {
			JOptionPane.showMessageDialog(null, blazeString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==svamp) {
			JOptionPane.showMessageDialog(null, svampString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==spindel�ga) {
			JOptionPane.showMessageDialog(null, spindel�gaString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==gl�dstenspulver) {
			JOptionPane.showMessageDialog(null, gl�dstenspulverString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==fackla) {
			frame20.setVisible(true);
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
			frame87.setVisible(true);
		}
		if (abc==sten) {
			JOptionPane.showMessageDialog(null, stenString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==r�dstensfackla) {
			frame31.setVisible(true);
		}
		if (abc==mj�lk) {
			JOptionPane.showMessageDialog(null, mj�lkString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==f�rgglas) {
			frame38.setVisible(true);
		}
		if (abc==sockerr�r) {
			JOptionPane.showMessageDialog(null, sockerr�rString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==gl�dstenslampa) {
			frame36.setVisible(true);
		}
		if (abc==�pple) {
			JOptionPane.showMessageDialog(null, �ppleString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==flinta) {
			JOptionPane.showMessageDialog(null, flintaString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==j�rnStenTr�) {
			JOptionPane.showMessageDialog(null, j�rnstentr�String,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==nederstj�rna) {
			JOptionPane.showMessageDialog(null, nederstj�rnaString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==j�rnblock) {
			frame57.setVisible(true);
		}
		if (abc==tr�halvblock) {
			frame16.setVisible(true);
		}
		if (abc==nederkvarts) {
			JOptionPane.showMessageDialog(null, nederkvartString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==material) {
			JOptionPane.showMessageDialog(null, materialString,frameHuvud.getTitle(), JOptionPane.INFORMATION_MESSAGE, abc);
		}
		if (abc==snubbeltr�dskrok) {
			frame49.setVisible(true);
		}
		if (e.getSource()==v�ljSpr�k){
			Spr�kfr�ga();

		}
		
	}


	@Override
	public void keyPressed(KeyEvent arg0) {

		
	}


	@Override
	public void keyReleased(KeyEvent arg0) {
		l�ggtill();
		
		if(!button3.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button3);
		}
		if(!button7.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button7);
		}
		if(!button8.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button8);
		}
		if(!button9.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button9);
		}
		if(!button10.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button10);
		}
		if(!button11.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button11);
		}
		if(!button12.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button12);
		}
		if(!button13.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button13);
		}
		if(!button14.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button14);
		}
		if(!button15.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button15);
		}
		if(!button16.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button16);
		}
		if(!button17.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button17);
		}
		if(!button18.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button18);
		}
		if(!button19.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button19);
		}
		if(!button20.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button20);
		}
		if(!button21.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button21);
		}
		if(!button22.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button22);
		}
		if(!button23.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button23);
		}
		if(!button24.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button24);
		}
		if(!button25.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button25);
		}
		if(!button26.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button26);
		}
		if(!button27.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button27);
		}
		if(!button28.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button28);
		}
		if(!button29.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button29);
		}
		if(!button30.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button30);
		}
		if(!button31.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button31);
		}
		if(!button32.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button32);
		}
		if(!button33.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button33);
		}
		if(!button34.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button34);
		}
		if(!button35.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button35);
		}
		if(!button36.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button36);
		}
		if(!button37.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button37);
		}
		if(!button38.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button38);
		}
		if(!button39.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button39);
		}
		if(!button40.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button40);
		}
		if(!button41.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button41);
		}
		if(!button42.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button42);
		}
		if(!button43.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button43);
		}
		if(!button44.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button44);
		}
		if(!button45.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button45);
		}
		if(!button46.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button46);
		}
		if(!button47.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button47);
		}
		if(!button48.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button48);
		}
		if(!button49.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button49);
		}
		if(!button50.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button50);
		}
		if(!button51.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button51);
		}
		if(!button52.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button52);
		}
		if(!button53.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button53);
		}
		if(!button54.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button54);
		}
		if(!button55.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button55);
		}
		if(!button56.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button56);
		}
		if(!button57.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button57);
		}
		if(!button58.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button58);
		}
		if(!button59.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button59);
		}
		if(!button60.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button60);
		}
		if(!button61.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button61);
		}
		if(!button62.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button62);
		}
		if(!button63.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button63);
		}
		if(!button64.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button64);
		}
		if(!button65.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button65);
		}
		if(!button66.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button66);
		}
		if(!button67.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button67);
		}
		if(!button68.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button68);
		}
		if(!button69.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button69);
		}
		if(!button70.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button70);
		}
		if(!button71.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button71);
		}
		if(!button72.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button72);
		}
		if(!button73.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button73);
		}
		if(!button74.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button74);
		}
		if(!button75.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button75);
		}
		if(!button76.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button76);
		}
		if(!button77.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button77);
		}
		if(!button78.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button78);
		}
		if(!button79.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button79);
		}
		if(!button80.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button80);
		}
		if(!button81.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button81);
		}
		if(!button82.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button82);
		}
		if(!button83.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button83);
		}
		if(!button84.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button84);
		}
		if(!button85.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button85);
		}
		if(!button86.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button86);
		}
		if(!button87.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button87);
		}
		if(!button88.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button88);
		}
		if(!button89.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button89);
		}
		if(!button91.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button91);
		}
		if(!button92.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button92);
		}
		if(!button93.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button93);
		}
		if(!button94.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button94);
		}
		if(!button95.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button95);
		}
		if(!button96.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button96);
		}
		if(!button97.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button97);
		}
		if(!button98.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button98);
		}
		if(!button99.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button99);
		}
		if(!button100.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button100);
		}
		if(!button101.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button101);
		}
		if(!button102.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button102);
		}
		if(!button103.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button103);
		}
		if(!button104.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button104);
		}
		if(!button105.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button105);
		}
		if(!button106.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button106);
		}
		if(!button107.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button107);
		}
		if(!button108.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button108);
		}
		if(!button109.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button109);
		}
		if(!button110.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button110);
		}
		if(!button111.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button111);
		}
		if(!button112.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button112);
		}
		if(!button113.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button113);
		}
		if(!button114.getText().toLowerCase().contains(text.getText().toLowerCase())){
			frame.remove(button114);
		}
		while (frame.getComponents().length<9) {
			frame.add(Box.createGlue());
		}
		frame.repaint();
		frame.revalidate();
		frameHuvud.revalidate();
		frameHuvud.repaint();

	}


	@Override
	public void keyTyped(KeyEvent arg0) {

		
	}
	void sortera(){
		this.list.removeAll(this.list);
		ArrayList<String> list = new ArrayList<String>();
		list.add(button3.getText());
		list.add(button7.getText());
		list.add(button8.getText());
		list.add(button9.getText());
		list.add(button10.getText());
		list.add(button11.getText());
		list.add(button12.getText());
		list.add(button13.getText());
		list.add(button14.getText());
		list.add(button15.getText());
		list.add(button16.getText());
		list.add(button17.getText());
		list.add(button18.getText());
		list.add(button19.getText());
		list.add(button20.getText());
		list.add(button21.getText());
		list.add(button22.getText());
		list.add(button23.getText());
		list.add(button24.getText());
		list.add(button25.getText());
		list.add(button26.getText());
		list.add(button27.getText());
		list.add(button28.getText());
		list.add(button29.getText());
		list.add(button30.getText());
		list.add(button31.getText());
		list.add(button32.getText());
		list.add(button33.getText());
		list.add(button34.getText());
		list.add(button35.getText());
		list.add(button36.getText());
		list.add(button37.getText());
		list.add(button38.getText());
		list.add(button39.getText());
		list.add(button40.getText());
		list.add(button41.getText());
		list.add(button42.getText());
		list.add(button43.getText());
		list.add(button44.getText());
		list.add(button45.getText());
		list.add(button46.getText());
		list.add(button47.getText());
		list.add(button48.getText());
		list.add(button49.getText());
		list.add(button50.getText());
		list.add(button51.getText());
		list.add(button52.getText());
		list.add(button53.getText());
		list.add(button54.getText());
		list.add(button55.getText());
		list.add(button56.getText());
		list.add(button57.getText());
		list.add(button58.getText());
		list.add(button59.getText());
		list.add(button60.getText());
		list.add(button61.getText());
		list.add(button62.getText());
		list.add(button63.getText());
		list.add(button64.getText());
		list.add(button65.getText());
		list.add(button66.getText());
		list.add(button67.getText());
		list.add(button68.getText());
		list.add(button69.getText());
		list.add(button70.getText());
		list.add(button71.getText());
		list.add(button72.getText());
		list.add(button73.getText());
		list.add(button74.getText());
		list.add(button75.getText());
		list.add(button76.getText());
		list.add(button77.getText());
		list.add(button78.getText());
		list.add(button79.getText());
		list.add(button80.getText());
		list.add(button81.getText());
		list.add(button82.getText());
		list.add(button83.getText());
		list.add(button84.getText());
		list.add(button85.getText());
		list.add(button86.getText());
		list.add(button87.getText());
		list.add(button88.getText());
		list.add(button89.getText());
		list.add(button91.getText());
		list.add(button92.getText());
		list.add(button93.getText());
		list.add(button94.getText());
		list.add(button95.getText());
		list.add(button96.getText());
		list.add(button97.getText());
		list.add(button98.getText());
		list.add(button99.getText());
		list.add(button100.getText());
		list.add(button101.getText());
		list.add(button102.getText());
		list.add(button103.getText());
		list.add(button104.getText());
		list.add(button105.getText());
		list.add(button106.getText());
		list.add(button107.getText());
		list.add(button108.getText());
		list.add(button109.getText());
		list.add(button110.getText());
		list.add(button111.getText());
		list.add(button112.getText());
		list.add(button113.getText());
		list.add(button114.getText());
		Collections.sort(list);
		while (!list.isEmpty()) {
			if (list.get(0)==button3.getText()) this.list.add(button3);
			if (list.get(0)==button7.getText()) this.list.add(button7);
			if (list.get(0)==button8.getText()) this.list.add(button8);
			if (list.get(0)==button9.getText()) this.list.add(button9);
			if (list.get(0)==button10.getText()) this.list.add(button10);
			if (list.get(0)==button11.getText()) this.list.add(button11);
			if (list.get(0)==button12.getText()) this.list.add(button12);
			if (list.get(0)==button13.getText()) this.list.add(button13);
			if (list.get(0)==button14.getText()) this.list.add(button14);
			if (list.get(0)==button15.getText()) this.list.add(button15);
			if (list.get(0)==button16.getText()) this.list.add(button16);
			if (list.get(0)==button17.getText()) this.list.add(button17);
			if (list.get(0)==button18.getText()) this.list.add(button18);
			if (list.get(0)==button19.getText()) this.list.add(button19);
			if (list.get(0)==button20.getText()) this.list.add(button20);
			if (list.get(0)==button21.getText()) this.list.add(button21);
			if (list.get(0)==button22.getText()) this.list.add(button22);
			if (list.get(0)==button23.getText()) this.list.add(button23);
			if (list.get(0)==button24.getText()) this.list.add(button24);
			if (list.get(0)==button25.getText()) this.list.add(button25);
			if (list.get(0)==button26.getText()) this.list.add(button26);
			if (list.get(0)==button27.getText()) this.list.add(button27);
			if (list.get(0)==button28.getText()) this.list.add(button28);
			if (list.get(0)==button29.getText()) this.list.add(button29);
			if (list.get(0)==button30.getText()) this.list.add(button30);
			if (list.get(0)==button31.getText()) this.list.add(button31);
			if (list.get(0)==button32.getText()) this.list.add(button32);
			if (list.get(0)==button33.getText()) this.list.add(button33);
			if (list.get(0)==button34.getText()) this.list.add(button34);
			if (list.get(0)==button35.getText()) this.list.add(button35);
			if (list.get(0)==button36.getText()) this.list.add(button36);
			if (list.get(0)==button37.getText()) this.list.add(button37);
			if (list.get(0)==button38.getText()) this.list.add(button38);
			if (list.get(0)==button39.getText()) this.list.add(button39);
			if (list.get(0)==button40.getText()) this.list.add(button40);
			if (list.get(0)==button41.getText()) this.list.add(button41);
			if (list.get(0)==button42.getText()) this.list.add(button42);
			if (list.get(0)==button43.getText()) this.list.add(button43);
			if (list.get(0)==button44.getText()) this.list.add(button44);
			if (list.get(0)==button45.getText()) this.list.add(button45);
			if (list.get(0)==button46.getText()) this.list.add(button46);
			if (list.get(0)==button47.getText()) this.list.add(button47);
			if (list.get(0)==button48.getText()) this.list.add(button48);
			if (list.get(0)==button49.getText()) this.list.add(button49);
			if (list.get(0)==button50.getText()) this.list.add(button50);
			if (list.get(0)==button51.getText()) this.list.add(button51);
			if (list.get(0)==button52.getText()) this.list.add(button52);
			if (list.get(0)==button53.getText()) this.list.add(button53);
			if (list.get(0)==button54.getText()) this.list.add(button54);
			if (list.get(0)==button55.getText()) this.list.add(button55);
			if (list.get(0)==button56.getText()) this.list.add(button56);
			if (list.get(0)==button57.getText()) this.list.add(button57);
			if (list.get(0)==button58.getText()) this.list.add(button58);
			if (list.get(0)==button59.getText()) this.list.add(button59);
			if (list.get(0)==button60.getText()) this.list.add(button60);
			if (list.get(0)==button61.getText()) this.list.add(button61);
			if (list.get(0)==button62.getText()) this.list.add(button62);
			if (list.get(0)==button63.getText()) this.list.add(button63);
			if (list.get(0)==button64.getText()) this.list.add(button64);
			if (list.get(0)==button65.getText()) this.list.add(button65);
			if (list.get(0)==button66.getText()) this.list.add(button66);
			if (list.get(0)==button67.getText()) this.list.add(button67);
			if (list.get(0)==button68.getText()) this.list.add(button68);
			if (list.get(0)==button69.getText()) this.list.add(button69);
			if (list.get(0)==button70.getText()) this.list.add(button70);
			if (list.get(0)==button71.getText()) this.list.add(button71);
			if (list.get(0)==button72.getText()) this.list.add(button72);
			if (list.get(0)==button73.getText()) this.list.add(button73);
			if (list.get(0)==button74.getText()) this.list.add(button74);
			if (list.get(0)==button75.getText()) this.list.add(button75);
			if (list.get(0)==button76.getText()) this.list.add(button76);
			if (list.get(0)==button77.getText()) this.list.add(button77);
			if (list.get(0)==button78.getText()) this.list.add(button78);
			if (list.get(0)==button79.getText()) this.list.add(button79);
			if (list.get(0)==button80.getText()) this.list.add(button80);
			if (list.get(0)==button81.getText()) this.list.add(button81);
			if (list.get(0)==button82.getText()) this.list.add(button82);
			if (list.get(0)==button83.getText()) this.list.add(button83);
			if (list.get(0)==button84.getText()) this.list.add(button84);
			if (list.get(0)==button85.getText()) this.list.add(button85);
			if (list.get(0)==button86.getText()) this.list.add(button86);
			if (list.get(0)==button87.getText()) this.list.add(button87);
			if (list.get(0)==button88.getText()) this.list.add(button88);
			if (list.get(0)==button89.getText()) this.list.add(button89);
			if (list.get(0)==button91.getText()) this.list.add(button91);
			if (list.get(0)==button92.getText()) this.list.add(button92);
			if (list.get(0)==button93.getText()) this.list.add(button93);
			if (list.get(0)==button94.getText()) this.list.add(button94);
			if (list.get(0)==button95.getText()) this.list.add(button95);
			if (list.get(0)==button96.getText()) this.list.add(button96);
			if (list.get(0)==button97.getText()) this.list.add(button97);
			if (list.get(0)==button98.getText()) this.list.add(button98);
			if (list.get(0)==button99.getText()) this.list.add(button99);
			if (list.get(0)==button100.getText()) this.list.add(button100);
			if (list.get(0)==button101.getText()) this.list.add(button101);
			if (list.get(0)==button102.getText()) this.list.add(button102);
			if (list.get(0)==button103.getText()) this.list.add(button103);
			if (list.get(0)==button104.getText()) this.list.add(button104);
			if (list.get(0)==button105.getText()) this.list.add(button105);
			if (list.get(0)==button106.getText()) this.list.add(button106);
			if (list.get(0)==button107.getText()) this.list.add(button107);
			if (list.get(0)==button108.getText()) this.list.add(button108);
			if (list.get(0)==button109.getText()) this.list.add(button109);
			if (list.get(0)==button110.getText()) this.list.add(button110);
			if (list.get(0)==button111.getText()) this.list.add(button111);
			if (list.get(0)==button112.getText()) this.list.add(button112);
			if (list.get(0)==button113.getText()) this.list.add(button113);
			if (list.get(0)==button114.getText()) this.list.add(button114);
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
}

class Ladda extends JPanel implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JProgressBar progressBar = new JProgressBar(0,100);
	
	JFrame frame = new JFrame();
	JLayeredPane layeredPane = new JLayeredPane();
	JLabel background=new JLabel(new ImageIcon(getClass().getResource("/images/Mine.jpg")));
	JLabel background1=new JLabel(),
			background2 = new JLabel();

	Timer timer = new Timer(30, this);

	int a;
	
	static int x = 1,z,namnInt;
	 
	static String namn, v�lkommen;
	
	static Boolean mailSkickat,start = false, spr�kValt;
	
	public Ladda(){
		
		try {
			prop.load(new FileInputStream(System.getProperty ("user.home") + "\\AppData\\Roaming\\GoJb\\settings.gojb"));
		} catch (IOException e) {
		
			System.err.println("sdo�vhjxcblizxg,vbs");
		}

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			((Runnable) Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.hand")).run();
			JOptionPane.showMessageDialog(null, "Bad LookAndFeel!","Error",JOptionPane.ERROR_MESSAGE);
		}
		
		frame.setLayeredPane(layeredPane);

		frame.setBackground(white);

		layeredPane.add(background);
		layeredPane.add(background1);
		layeredPane.add(background2);
		layeredPane.add(progressBar);
		setSize(frame.getSize());
		frame.setLayout(new BorderLayout());
		frame.setSize(300,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(3);
		frame.setUndecorated(true);
		frame.setVisible(true);

		background.setOpaque(true);
		background.setBackground(blue);
		background.setSize(300,200);
		background.setLocation(0,0);

		background1.setForeground(Color.white);
		background1.setOpaque(false);
		background1.setBackground(Color.black);
		background1.setSize(300,54);
		background1.setLocation(40,30);
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
		
		layeredPane.setLayer(background, 25);
		layeredPane.setLayer(background1, 90);
		layeredPane.setLayer(background2, 90);
		layeredPane.setLayer(progressBar, 100);

		repaint();
		revalidate();
		frame.repaint();
		frame.revalidate();
		layeredPane.revalidate();
		layeredPane.repaint();
		
		timer.start();
		
		if(prop.getProperty("y","1").equals("10")){
			mailSkickat=true;
			System.out.println("Mail = true");
			
		}
		else if (!prop.getProperty("y","1").equals("10")){
			mailSkickat=false;
			System.out.println("Mail = false");
		}
		
		if (prop.getProperty("9778436klbgflf","kjg").equals("86325yhrel")){
			v�lkommen = "V�lkommen " + prop.getProperty("Namn");
			frame.revalidate();
			frame.repaint();
			repaint();
			revalidate();
			namnInt = 1;
			
		}
		else if (prop.getProperty("9778436klbgflf","kjg").equals("lhdohf7984")){
			v�lkommen = "Welcome " + prop.getProperty("Namn");
			frame.revalidate();
			frame.repaint();
			repaint();
			revalidate();
			namnInt = 1;
			
		}
		else if (!prop.getProperty("9778436klbgflf","kjg").equals("lhdohf7984")&&
				!prop.getProperty("9778436klbgflf","kjg").equals("86325yhrel")){
			System.err.println(prop.getProperty("9778436klbgflf"));
			
			System.err.println("Spr�k ej valt");
			
			namnInt = 2;
			
			prop.setProperty("Namn", "");
			
			
			if (progressBar.getValue() < 50){
				v�lkommen = "Welcome! Loading...";
				
				frame.revalidate();
				frame.repaint();
				repaint();
				revalidate();
			}
			else if (progressBar.getValue() >= 50){
				v�lkommen = "V�lkommen! Laddar...";
				frame.revalidate();
				frame.repaint();
				repaint();
				revalidate();
			}
			try {
				prop.store(new FileWriter(new File(System.getProperty("user.home") + "\\AppData\\Roaming\\GoJb\\settings.gojb")),"Inst�llningar f�r GoJbGuide");
			} catch (Exception e) {
				System.out.println("lyckades inte skriva");
				e.printStackTrace();
				Namn();
			}
		}
	
	}

	public void actionPerformed(ActionEvent arg0) {

		if (timer == arg0.getSource()){

			if(namn == null){
				namn = "";
			}
			
			background1.setText(v�lkommen + " " + namn);			
			progressBar.setValue(progressBar.getValue()+1);
			background2.setText(Integer.toString(progressBar.getValue())+"%");
			frame.repaint();
			frame.revalidate();
			repaint();
			revalidate();
			layeredPane.revalidate();
			layeredPane.repaint();
			progressBar.repaint();
			progressBar.revalidate();
			revalidate();
			repaint();

			System.err.println(progressBar.getBackground());
			System.out.println(progressBar.getForeground());
			System.err.println(v�lkommen + "     ");
			
			frame.revalidate();

		}
		a++;
		
		if (z == 0){
			x++;
		}
		if (progressBar.getValue() == 50 && namnInt == 1){
			start=true;
			prop.setProperty("y", "9");
		}
		if(progressBar.getValue()==100&&start==true){
			timer.stop();
			new GoJb1();
			frame.dispose();
		}
		if (progressBar.getValue() == 100 && namnInt == 2){

			timer.stop();

			namn = JOptionPane.showInputDialog("Enter name/Skriv ditt namn");
			
			if(namn.equals("")||namn.equals(null)){

				System.exit(3);
				frame.dispose();
			}
			
			else {
				
			new GoJb1();
			frame.dispose();
			timer.stop();
			
			}
			prop.setProperty("Namn", namn);
			try {
				prop.store(new FileWriter(new File(System.getProperty("user.home") + "\\AppData\\Roaming\\GoJb\\settings.gojb")),"Inst�llningar f�r GoJbGuide");
			} catch (Exception e) {
				System.out.println("lyckades inte skriva");
				e.printStackTrace();
				Namn();
				}
		}
	}
			


	public static void Namn() {
		
		try {
			prop.load(new FileInputStream(System.getProperty("user.home") + "\\AppData\\Roaming\\GoJb\\settings.gojb"));
		}catch (IOException e) {

			System.err.println("Kan inte ladda");

		}

		if(prop.getProperty("y","2").equals("10")){
			new GoJb1();

		}
		
	}
}
class Update implements Runnable{
	public synchronized void run(){
		try {
			wait(10000);
		} catch (InterruptedException e2) {
			System.err.println("e2");
		}
		if (getClass().getResource("/" + getClass().getName().replace('.','/') + ".class").toString().startsWith("jar:")) {
			try {
				URL u = new URL("http://gojb.bl.ee/GoJbGuide.jar");
				System.out.println("Online: " + u.openConnection().getLastModified());
				URL loc = getClass().getProtectionDomain().getCodeSource().getLocation();
				try {
					System.out.println("Lokal:  "+ new File(loc.toURI()).lastModified());
				} catch (Exception e1) {}
				if (new File(loc.toURI()).lastModified() + 60000 < u.openConnection().getLastModified()) {
					if (showConfirmDialog(null, "En nyare version av programmet �r tillg�ngligt.\nVill du uppdatera nu?","Uppdatering",YES_NO_OPTION,WARNING_MESSAGE)==YES_OPTION) {
						InputStream in = new BufferedInputStream(u.openStream());
						ByteArrayOutputStream out = new ByteArrayOutputStream();
						byte[] buf = new byte[1024];
						int n = 0;
						JProgressBar bar = new JProgressBar(0, in.available()/2);
						JFrame frame = new JFrame("Laddar ner...");
						frame.add(bar);
						frame.setIconImage(new ImageIcon(getClass().getResource("/images/Java-icon.png")).getImage());
						frame.setLocationRelativeTo(null);
						frame.setVisible(true);
						frame.setAlwaysOnTop(true);
						frame.setSize(500,200);
						while (-1!=(n=in.read(buf))){
							out.write(buf, 0, n);
							bar.setValue(bar.getValue()+1);
						}
						out.close();
						in.close();
						FileOutputStream fos = new FileOutputStream(new File(loc.toURI()));
						fos.write(out.toByteArray());
						fos.close();
						System.out.println("Finished");
						frame.dispose();
						showMessageDialog(null, "Uppdateringen slutf�rdes! Programmet startas om...", "Slutf�rt", INFORMATION_MESSAGE);
						try {
							Runtime.getRuntime().exec("java -jar " + loc.getFile().toString().substring(1));
							System.err.println("java -jar " + loc.getFile().toString().substring(1));
						} catch (Exception e) {
							e.printStackTrace(); 
						}
						System.exit(0);
					}
				}
			} catch(Exception e){
				System.err.println("Ingen uppdatering hittades");
			}
		}
	}
}