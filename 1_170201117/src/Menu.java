import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Menu {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JButton btnNewButton_10;
		
	JLabel nokta_0 = new JLabel();                
	JLabel nokta_1 = new JLabel();
	JLabel nokta_2 = new JLabel();
	JLabel nokta_3 = new JLabel();
	JLabel nokta_4 = new JLabel();
	JLabel nokta_5 = new JLabel();
	JLabel nokta_6 = new JLabel();
	JLabel nokta_7 = new JLabel();
	JLabel nokta_8 = new JLabel();
	JLabel nokta_9 = new JLabel();
	JLabel nokta_10 = new JLabel();
	JLabel nokta_11 = new JLabel();
	JLabel nokta_12 = new JLabel();
	JLabel nokta_13 = new JLabel();
	JLabel nokta_14 = new JLabel();
	JLabel nokta_15 = new JLabel();
	JLabel nokta_16 = new JLabel();
	JLabel nokta_17 = new JLabel();
	JLabel nokta_18 = new JLabel();
	JLabel nokta_19 = new JLabel();
	JLabel nokta_20 = new JLabel();
	JLabel nokta_21 = new JLabel();
	JLabel nokta_22 = new JLabel();
	JLabel nokta_23 = new JLabel();
	JLabel nokta_24 = new JLabel();
	JLabel nokta_25 = new JLabel();
	JLabel nokta_26 = new JLabel();
	JLabel nokta_27 = new JLabel();
	JLabel nokta_28 = new JLabel();
	JLabel nokta_29 = new JLabel();
	JLabel nokta_30 = new JLabel();
	JLabel nokta_31 = new JLabel();
	JLabel nokta_32 = new JLabel();
	JLabel nokta_33 = new JLabel();
	JLabel nokta_34 = new JLabel();
	JLabel nokta_35 = new JLabel();
	JLabel nokta_36 = new JLabel();
	JLabel nokta_37 = new JLabel();
	JLabel nokta_38 = new JLabel();
	JLabel nokta_39 = new JLabel();
	JLabel nokta_40 = new JLabel();
	JLabel nokta_41 = new JLabel();
	JLabel nokta_42 = new JLabel();
	JLabel nokta_43 = new JLabel();
	JLabel nokta_44 = new JLabel();
	JLabel nokta_45 = new JLabel();
	JLabel nokta_46 = new JLabel();
	JLabel nokta_47 = new JLabel();
	JLabel nokta_48 = new JLabel();
	JLabel nokta_49 = new JLabel();
	JLabel nokta_50 = new JLabel();
	JLabel nokta_51 = new JLabel();
	JLabel nokta_52 = new JLabel();
	JLabel nokta_53 = new JLabel();
	JLabel nokta_54 = new JLabel();
	JLabel nokta_55 = new JLabel();
	JLabel nokta_56 = new JLabel();
	JLabel nokta_57 = new JLabel();
	JLabel nokta_58 = new JLabel();
	JLabel nokta_59 = new JLabel();
	JLabel nokta_60 = new JLabel();
	JLabel nokta_61 = new JLabel();
	JLabel nokta_62 = new JLabel();
	JLabel nokta_63 = new JLabel();
	JLabel nokta_64 = new JLabel();
	JLabel nokta_65 = new JLabel();
	JLabel nokta_66 = new JLabel();
	JLabel nokta_67 = new JLabel();
	JLabel nokta_68 = new JLabel();
	JLabel nokta_69 = new JLabel();
	JLabel nokta_70 = new JLabel();
	JLabel nokta_71 = new JLabel();
	JLabel nokta_72 = new JLabel();
	JLabel nokta_73 = new JLabel();
	JLabel nokta_74 = new JLabel();
	JLabel nokta_75 = new JLabel();
	JLabel nokta_76 = new JLabel();
	JLabel nokta_77 = new JLabel();
	JLabel nokta_78 = new JLabel();
	JLabel nokta_79 = new JLabel();
	JLabel nokta_80 = new JLabel();
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public Menu() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		
		ArrayList<JLabel> noktalar = new ArrayList<JLabel>();
		noktalar.add(nokta_0);
		noktalar.add(nokta_1);
		noktalar.add(nokta_2);
		noktalar.add(nokta_3);
		noktalar.add(nokta_4);
		noktalar.add(nokta_5);
		noktalar.add(nokta_6);
		noktalar.add(nokta_7);
		noktalar.add(nokta_8);
		noktalar.add(nokta_9);
		noktalar.add(nokta_10);
		noktalar.add(nokta_11);
		noktalar.add(nokta_12);
		noktalar.add(nokta_13);
		noktalar.add(nokta_14);
		noktalar.add(nokta_15);
		noktalar.add(nokta_16);
		noktalar.add(nokta_17);
		noktalar.add(nokta_18);
		noktalar.add(nokta_19);
		noktalar.add(nokta_20);
		noktalar.add(nokta_21);
		noktalar.add(nokta_22);
		noktalar.add(nokta_23);
		noktalar.add(nokta_24);
		noktalar.add(nokta_25);
		noktalar.add(nokta_26);
		noktalar.add(nokta_27);
		noktalar.add(nokta_28);
		noktalar.add(nokta_29);
		noktalar.add(nokta_30);
		noktalar.add(nokta_31);
		noktalar.add(nokta_32);
		noktalar.add(nokta_33);
		noktalar.add(nokta_34);
		noktalar.add(nokta_35);
		noktalar.add(nokta_36);
		noktalar.add(nokta_37);
		noktalar.add(nokta_38);
		noktalar.add(nokta_39);
		noktalar.add(nokta_40);
		noktalar.add(nokta_41);
		noktalar.add(nokta_42);
		noktalar.add(nokta_43);
		noktalar.add(nokta_44);
		noktalar.add(nokta_45);
		noktalar.add(nokta_46);
		noktalar.add(nokta_47);
		noktalar.add(nokta_48);
		noktalar.add(nokta_49);
		noktalar.add(nokta_50);
		noktalar.add(nokta_51);
		noktalar.add(nokta_52);
		noktalar.add(nokta_53);
		noktalar.add(nokta_54);
		noktalar.add(nokta_55);
		noktalar.add(nokta_56);
		noktalar.add(nokta_57);
		noktalar.add(nokta_58);
		noktalar.add(nokta_59);
		noktalar.add(nokta_60);
		noktalar.add(nokta_61);
		noktalar.add(nokta_62);
		noktalar.add(nokta_63);
		noktalar.add(nokta_64);
		noktalar.add(nokta_65);
		noktalar.add(nokta_66);
		noktalar.add(nokta_67);
		noktalar.add(nokta_68);
		noktalar.add(nokta_69);
		noktalar.add(nokta_70);
		noktalar.add(nokta_71);
		noktalar.add(nokta_72);
		noktalar.add(nokta_73);
		noktalar.add(nokta_74);
		noktalar.add(nokta_75);
		noktalar.add(nokta_76);
		noktalar.add(nokta_77);
		noktalar.add(nokta_78);
		noktalar.add(nokta_79);
		noktalar.add(nokta_80);
		
		BufferedReader okuyucu = null;
		
		try {
			okuyucu = new BufferedReader(new FileReader("mesafe.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int graf[][] = new int[81][81];
		
		for(int i = 0; i< 81; i++) {
			String[] satir = okuyucu.readLine().trim().split("[, ?.@	]+");
			for(int j = 0; j< 81; j++) {
				graf[i][j] = Integer.parseInt(satir[j]);
			}
		}
					
		PrintWriter yazici = new PrintWriter(new FileOutputStream(new File("cikti.txt"),true));
		yazici.append("Plaka		   Yol			Duraklar\n");
		yazici.close();
		
		Image kirmizi_nokta = new ImageIcon(this.getClass().getResource("circle-16.png")).getImage();
		
		nokta_0.setBounds(560, 400, 16, 16);		
		nokta_0.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_1.setBounds(685, 345, 16, 16);		
		nokta_1.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_2.setBounds(280, 270, 16, 16);		
		nokta_2.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_3.setBounds(970, 170, 16, 16);		
		nokta_3.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_4.setBounds(560, 135, 16, 16);		
		nokta_4.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_5.setBounds(390, 220, 16, 16);		
		nokta_5.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_6.setBounds(240, 420, 16, 16);		
		nokta_6.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_7.setBounds(920, 75, 16, 16);		
		nokta_7.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_8.setBounds(85, 333, 16, 16);		
		nokta_8.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_9.setBounds(85, 197, 16, 16);		
		nokta_9.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_10.setBounds(234, 183, 16, 16);		
		nokta_10.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_11.setBounds(860, 250, 16, 16);		
		nokta_11.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_12.setBounds(925, 270, 16, 16);		
		nokta_12.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_13.setBounds(330, 140, 16, 16);		
		nokta_13.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_14.setBounds(250, 365, 16, 16);		
		nokta_14.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_15.setBounds(190, 180, 16, 16);		
		nokta_15.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_16.setBounds(70, 145, 16, 16);		
		nokta_16.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_17.setBounds(460, 145, 16, 16);		
		nokta_17.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_18.setBounds(490, 155, 16, 16);		
		nokta_18.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_19.setBounds(205, 335, 16, 16);		
		nokta_19.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_20.setBounds(830, 325, 16, 16);		
		nokta_20.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_21.setBounds(50, 90, 16, 16);		
		nokta_21.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_22.setBounds(810, 260, 16, 16);		
		nokta_22.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_23.setBounds(810, 180, 16, 16);		
		nokta_23.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_24.setBounds(870, 180, 16, 16);		
		nokta_24.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_25.setBounds(280, 180, 16, 16);		
		nokta_25.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_26.setBounds(665, 393, 16, 16);		
		nokta_26.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_27.setBounds(720, 100, 16, 16);		
		nokta_27.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_28.setBounds(770, 130, 16, 16);		
		nokta_28.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_29.setBounds(1080, 345, 16, 16);		
		nokta_29.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_30.setBounds(595, 465, 16, 16);		
		nokta_30.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_31.setBounds(300, 355, 16, 16);		
		nokta_31.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_32.setBounds(440, 440, 16, 16);		
		nokta_32.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_33.setBounds(190, 97, 16, 16);		
		nokta_33.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_34.setBounds(80, 300, 16, 16);		
		nokta_34.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_35.setBounds(990, 130, 16, 16);		
		nokta_35.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_36.setBounds(460, 80, 16, 16);		
		nokta_36.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_37.setBounds(560, 300, 16, 16);		
		nokta_37.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_38.setBounds(100, 58, 16, 16);		
		nokta_38.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_39.setBounds(480, 245, 16, 16);		
		nokta_39.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_40.setBounds(245, 115, 16, 16);		
		nokta_40.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_41.setBounds(380, 340, 16, 16);		
		nokta_41.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_42.setBounds(210, 240, 16, 16);		
		nokta_42.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_43.setBounds(700, 300, 16, 16);		
		nokta_43.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_44.setBounds(110, 270, 16, 16);		
		nokta_44.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_45.setBounds(640, 355, 16, 16);		
		nokta_45.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_46.setBounds(870, 367, 16, 16);		
		nokta_46.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_47.setBounds(135, 375, 16, 16);		
		nokta_47.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_48.setBounds(900, 257, 16, 16);		
		nokta_48.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_49.setBounds(510, 285, 16, 16);		
		nokta_49.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_50.setBounds(510, 330, 16, 16);		
		nokta_50.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_51.setBounds(680, 95, 16, 16);		
		nokta_51.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_52.setBounds(835, 85, 16, 16);		
		nokta_52.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_53.setBounds(265, 135, 16, 16);		
		nokta_53.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_54.setBounds(600, 75, 16, 16);		
		nokta_54.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_55.setBounds(932, 320, 16, 16);		
		nokta_55.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_56.setBounds(510, 70, 16, 16);		
		nokta_56.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_57.setBounds(650, 220, 16, 16);		
		nokta_57.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_58.setBounds(110, 95, 16, 16);		
		nokta_58.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_59.setBounds(640, 145, 16, 16);		
		nokta_59.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_60.setBounds(793, 90, 16, 16);		
		nokta_60.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_61.setBounds(793, 235, 16, 16);		
		nokta_61.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_62.setBounds(793, 390, 16, 16);		
		nokta_62.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_63.setBounds(200, 265, 16, 16);		
		nokta_63.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_64.setBounds(1050, 265, 16, 16);		
		nokta_64.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_65.setBounds(545, 185, 16, 16);		
		nokta_65.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_66.setBounds(352, 68, 16, 16);		
		nokta_66.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_67.setBounds(435, 310, 16, 16);		
		nokta_67.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_68.setBounds(820, 150, 16, 16);		
		nokta_68.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_69.setBounds(440, 390, 16, 16);		
		nokta_69.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_70.setBounds(440, 210, 16, 16);		
		nokta_70.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_71.setBounds(900, 315, 16, 16);		
		nokta_71.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_72.setBounds(940, 350, 16, 16);		
		nokta_72.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_73.setBounds(382, 68, 16, 16);		
		nokta_73.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_74.setBounds(953, 68, 16, 16);		
		nokta_74.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_75.setBounds(1040, 150, 16, 16);		
		nokta_75.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_76.setBounds(200, 120, 16, 16);		
		nokta_76.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_77.setBounds(387, 108, 16, 16);		
		nokta_77.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_78.setBounds(647, 417, 16, 16);		
		nokta_78.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_79.setBounds(605, 395, 16, 16);		
		nokta_79.setIcon(new ImageIcon(kirmizi_nokta));
		
		nokta_80.setBounds(313, 118, 16, 16);		
		nokta_80.setIcon(new ImageIcon(kirmizi_nokta));
		
		for(int i = 0; i < noktalar.size(); i++) {
			noktalar.get(i).setVisible(false);
		}
					
		System.out.print("Plaka		 Yol		Duraklar");
	    			
		ArrayList<Integer> dizi = new ArrayList<Integer>();
		dizi.add(40);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1500, 660);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
						
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		Image img = new ImageIcon(this.getClass().getResource("harita2.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(10, 11, 1133, 579);
		for(int i = 0; i < noktalar.size(); i++) {
			lblNewLabel.add(noktalar.get(i));
		}
		frame.getContentPane().add(lblNewLabel);
								
		textField = new JTextField();
		textField.setBounds(1177, 11, 104, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(1177, 51, 104, 29);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(1177, 91, 104, 29);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(1177, 131, 104, 29);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(1177, 171, 104, 29);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(1177, 211, 104, 29);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(1177, 251, 104, 29);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(1177, 291, 104, 29);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(1177, 331, 104, 29);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(1177, 371, 104, 29);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		boolean[] kullanildiMi = new boolean[10]; 
		
		JButton btnNewButton = new JButton("EKLE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int plaka;
				
				try {
					
					plaka = Integer.parseInt(textField.getText());
					if(plaka > 0 && plaka <82 && kullanildiMi[0] == false) {
						dizi.add(plaka-1);
						JOptionPane.showMessageDialog(null, "Ekleme islemi basarili.");
						kullanildiMi[0] = true;
					}else if (plaka <= 0 || plaka >= 82){
						JOptionPane.showMessageDialog(null, "Lutfen gecerli bir plaka giriniz.");
					}else {
						JOptionPane.showMessageDialog(null, "Bu alan daha önce kullanildi lütfen baska bir alani kullanin.");
					}
					
				}catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Lutfen gecerli bir plaka giriniz.");
				}
			}
		});
		btnNewButton.setBounds(1301, 11, 89, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("EKLE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int plaka;
				
				try {
					
					plaka = Integer.parseInt(textField_1.getText());
					if(plaka > 0 && plaka <82 && kullanildiMi[1] == false) {
						dizi.add(plaka-1);
						JOptionPane.showMessageDialog(null, "Ekleme islemi basarili.");
						kullanildiMi[1] = true;
					}else if (plaka <= 0 || plaka >= 82){
						JOptionPane.showMessageDialog(null, "Lutfen gecerli bir plaka giriniz.");
					}else {
						JOptionPane.showMessageDialog(null, "Bu alan daha önce kullanildi lütfen baska bir alani kullanin.");
					}
					
				}catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Lutfen gecerli bir plaka giriniz.");
				}
				
			}
			
		});
		btnNewButton_1.setBounds(1301, 51, 89, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("EKLE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int plaka;
				
				try {
					
					plaka = Integer.parseInt(textField_2.getText());
					if(plaka > 0 && plaka <82 && kullanildiMi[2] == false) {
						dizi.add(plaka-1);
						JOptionPane.showMessageDialog(null, "Ekleme islemi basarili.");
						kullanildiMi[2] = true;
					}else if (plaka <= 0 || plaka >= 82){
						JOptionPane.showMessageDialog(null, "Lutfen gecerli bir plaka giriniz.");
					}else {
						JOptionPane.showMessageDialog(null, "Bu alan daha önce kullanildi lütfen baska bir alani kullanin.");
					}
					
				}catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Lutfen gecerli bir plaka giriniz.");
				}
				
			}
		});
		btnNewButton_2.setBounds(1301, 91, 89, 32);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("EKLE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int plaka;
				
				try {
					
					plaka = Integer.parseInt(textField_3.getText());
					if(plaka > 0 && plaka <82 && kullanildiMi[3] == false) {
						dizi.add(plaka-1);
						JOptionPane.showMessageDialog(null, "Ekleme islemi basarili.");
						kullanildiMi[3] = true;
					}else if (plaka <= 0 || plaka >= 82){
						JOptionPane.showMessageDialog(null, "Lutfen gecerli bir plaka giriniz.");
					}else {
						JOptionPane.showMessageDialog(null, "Bu alan daha önce kullanildi lütfen baska bir alani kullanin.");
					}
					
				}catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Lutfen gecerli bir plaka giriniz.");
				}
			}
		});
		btnNewButton_3.setBounds(1301, 131, 89, 32);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("EKLE");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int plaka;
				
				try {
					
					plaka = Integer.parseInt(textField_4.getText());
					if(plaka > 0 && plaka <82 && kullanildiMi[4] == false) {
						dizi.add(plaka-1);
						JOptionPane.showMessageDialog(null, "Ekleme islemi basarili.");
						kullanildiMi[4] = true;
					}else if (plaka <= 0 || plaka >= 82){
						JOptionPane.showMessageDialog(null, "Lutfen gecerli bir plaka giriniz.");
					}else {
						JOptionPane.showMessageDialog(null, "Bu alan daha önce kullanildi lütfen baska bir alani kullanin.");
					}
					
				}catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Lutfen gecerli bir plaka giriniz.");
				}
			}
		});
		btnNewButton_4.setBounds(1301, 171, 89, 32);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("EKLE");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int plaka;
				
				try {
					
					plaka = Integer.parseInt(textField_5.getText());
					if(plaka > 0 && plaka <82 && kullanildiMi[5] == false) {
						dizi.add(plaka-1);
						JOptionPane.showMessageDialog(null, "Ekleme islemi basarili.");
						kullanildiMi[5] = true;
					}else if (plaka <= 0 || plaka >= 82){
						JOptionPane.showMessageDialog(null, "Lutfen gecerli bir plaka giriniz.");
					}else {
						JOptionPane.showMessageDialog(null, "Bu alan daha önce kullanildi lütfen baska bir alani kullanin.");
					}
					
				}catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Lutfen gecerli bir plaka giriniz.");
				}
			}
		});
		btnNewButton_5.setBounds(1301, 211, 89, 29);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("EKLE");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int plaka;
				
				try {
					
					plaka = Integer.parseInt(textField_6.getText());
					if(plaka > 0 && plaka <82 && kullanildiMi[6] == false) {
						dizi.add(plaka-1);
						JOptionPane.showMessageDialog(null, "Ekleme islemi basarili.");
						kullanildiMi[6] = true;
					}else if (plaka <= 0 || plaka >= 82){
						JOptionPane.showMessageDialog(null, "Lutfen gecerli bir plaka giriniz.");
					}else {
						JOptionPane.showMessageDialog(null, "Bu alan daha önce kullanildi lütfen baska bir alani kullanin.");
					}
					
				}catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Lutfen gecerli bir plaka giriniz.");
				}
			}
		});
		btnNewButton_6.setBounds(1301, 251, 89, 29);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("EKLE");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int plaka;
				
				try {
					
					plaka = Integer.parseInt(textField_7.getText());
					if(plaka > 0 && plaka <82 && kullanildiMi[7] == false) {
						dizi.add(plaka-1);
						JOptionPane.showMessageDialog(null, "Ekleme islemi basarili.");
						kullanildiMi[7] = true;
					}else if (plaka <= 0 || plaka >= 82){
						JOptionPane.showMessageDialog(null, "Lutfen gecerli bir plaka giriniz.");
					}else {
						JOptionPane.showMessageDialog(null, "Bu alan daha önce kullanildi lütfen baska bir alani kullanin.");
					}
					
				}catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Lutfen gecerli bir plaka giriniz.");
				}
			}
		});
		btnNewButton_7.setBounds(1301, 291, 89, 32);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("EKLE");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int plaka;
				
				try {
					
					plaka = Integer.parseInt(textField_8.getText());
					if(plaka > 0 && plaka <82 && kullanildiMi[8] == false) {
						dizi.add(plaka-1);
						JOptionPane.showMessageDialog(null, "Ekleme islemi basarili.");	
						kullanildiMi[8] = true;
					}else if (plaka <= 0 || plaka >= 82){
						JOptionPane.showMessageDialog(null, "Lutfen gecerli bir plaka giriniz.");
					}else {
						JOptionPane.showMessageDialog(null, "Bu alan daha önce kullanildi lütfen baska bir alani kullanin.");
					}
					
				}catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Lutfen gecerli bir plaka giriniz.");
				}
			}
		});
		btnNewButton_8.setBounds(1301, 331, 89, 29);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("EKLE");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int plaka;
				
				try {
					
					plaka = Integer.parseInt(textField_9.getText());
					if(plaka > 0 && plaka <82 && kullanildiMi[9] == false) {
						dizi.add(plaka-1);
						JOptionPane.showMessageDialog(null, "Ekleme islemi basarili.");
						kullanildiMi[9] = true;
					}else if (plaka <= 0 || plaka >= 82){
						JOptionPane.showMessageDialog(null, "Lutfen gecerli bir plaka giriniz.");
					}else {
						JOptionPane.showMessageDialog(null, "Bu alan daha önce kullanildi lütfen baska bir alani kullanin.");
					}
					
				}catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Lutfen gecerli bir plaka giriniz.");
				}
			}
		});
		btnNewButton_9.setBounds(1301, 371, 89, 29);
		frame.getContentPane().add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("YAZDIR");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 0; i < dizi.size(); i++ ) {
					
					if(i < dizi.size()-1) {
						Dijkstra.dijkstra(graf, dizi.get(i), dizi.get(i+1));
					}else if(i == dizi.size()-1) {
						Dijkstra.dijkstra(graf, dizi.get(i), 40);
					}
				}
				for(int i = 0; i < Dijkstra.ugrananSehirler.size(); i++) {
					noktalar.get(Dijkstra.ugrananSehirler.get(i)).setVisible(true);
				}
				
				PrintWriter yazici_1;
				try {
					yazici_1 = new PrintWriter(new FileOutputStream(("cikti.txt"),true));
					String str = "\nToplam yol: " + Dijkstra.toplamYol;
					yazici_1.append(str);
					yazici_1.append("\n\n");
					yazici_1.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				JOptionPane.showMessageDialog(null, "Yazdirma islemi tamamlandi. Tekrar islem yapmak icin temizle butonunu kullaniniz.");
			}
		});
		btnNewButton_10.setBounds(1177, 436, 213, 29);
		frame.getContentPane().add(btnNewButton_10);			
		
		JButton btnNewButton_11 = new JButton("TEMIZLE");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 0; i < noktalar.size(); i++) {
					noktalar.get(i).setVisible(false);
				}
				
				for(int i = 0; i < kullanildiMi.length; i++) {
					kullanildiMi[i] = false;
				}
				
				Dijkstra.toplamYol = 0;
				Dijkstra.ugrananSehirler.clear();
				dizi.clear();
				dizi.add(40);
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				
				JOptionPane.showMessageDialog(null, "Temizleme islemi tamamlandi, program tekrar kullanima hazir.");
			}

		});
		btnNewButton_11.setBounds(1177, 476, 213, 23);
		frame.getContentPane().add(btnNewButton_11);
		
	}	
}
