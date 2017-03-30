package com.capa.presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FichaBrecreacionExteriores extends JFrame {

	private JPanel panelPrincipal;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FichaBrecreacionExteriores frame = new FichaBrecreacionExteriores();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FichaBrecreacionExteriores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1320, 730);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		setContentPane(panelPrincipal);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 125, 1286, 560);
		panelPrincipal.add(tabbedPane);

		JPanel pnlPestaña1 = new JPanel();
		tabbedPane.addTab("1.- Ficha Recreación-Exteriores", null, pnlPestaña1, null);
		pnlPestaña1.setLayout(null);

		JPcabecera cabecera = new JPcabecera();
		panelPrincipal.add(cabecera.getCabecera());

		JPInformacionObligatoria infoObligatoria = new JPInformacionObligatoria(1,1);
		pnlPestaña1.add(infoObligatoria.getPnlInformacionObl());

		JPanel panel_0 = new JPanel();
		panel_0.setLayout(null);
		panel_0.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Superficie", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_0.setBounds(10, 11, 249, 360);
		pnlPestaña1.add(panel_0);

		JLabel lbl_1 = new JLabel("<html>\r\n<body>\r\n<p align=\"justify\">\r\nEl material aplicado en la superficie de las canchas es de tipo EPDM TERPOL\u00CDMERO ETILENO PROPILENO (DIENO),  una combicaci\u00F3n de gr\u00E1nulos y una capa de acolchonamiento de caucho reciclado utilizando un pol\u00EDmero espolvoreado en sitio que provee una superficie que brinde una alta protecci\u00F3n contra ca\u00EDdas cr\u00EDticas en sitios de juegos infantiles.\r\n<br>Dimensiones m\u00EDnimas e instalaci\u00F3n:<br>La superficie granular para juegos en canchas deportivas:\r\n<br>Es colococada sobre un contrapiso de al menos 7 cm.\r\n<br>El asfalto sint\u00E9tico termo fundido se aplica con una capa m\u00EDnima de SBR de 8 mm en la base y sobre esta la capa de EPDM con el color de la superficie de al menos de 5 mm de espesor.\r\n<br>Es resistente al calor, libre de materiales t\u00F3xicos, resistente a los rayos UV, no cristalizarse y con un durabilidad garantizada de al menos 10 a\u00F1os.\r\n</p>\r\n</body>\r\n</html>");
		lbl_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_1.setBounds(10, 13, 235, 336);
		panel_0.add(lbl_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(284, 18, 139, 104);
		pnlPestaña1.add(panel_1);
		
		JLabel label_1 = new JLabel("Observaci\u00F3n/Referencia");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_1.setBounds(8, 57, 123, 14);
		panel_1.add(label_1);
		
		JRadioButton radioButton = new JRadioButton("");
		radioButton.setBounds(44, 27, 21, 23);
		panel_1.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setBounds(65, 27, 21, 23);
		panel_1.add(radioButton_1);
		
		JLabel label_2 = new JLabel("SI");
		label_2.setBounds(48, 11, 21, 14);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("NO");
		label_3.setBounds(67, 11, 21, 14);
		panel_1.add(label_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(8, 71, 123, 20);
		panel_1.add(textField);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cerramiento perimetral", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(433, 11, 249, 360);
		pnlPestaña1.add(panel_2);

		JLabel lbl_2 = new JLabel(
				"<html>\r\n<body>\r\n<p align=\"justify\">\r\n\"Materiales: \r\n<br>Paneles prefabricados a a base de fibras pl\u00E1sticas conformadas por tablones WPC (madera y pl\u00E1stico) , resistentes a rayos ultravioletas y asegurar una durabilidad m\u00EDnima de 15 a\u00F1os.\r\n<br>El material utilizado no contiene productos qu\u00EDmicos da\u00F1inos.\r\n<br>Dimensiones m\u00EDnimas e instalaci\u00F3n:\r\n<br>El cerramiento perimetral tiene una longitud m\u00EDnima de 360 m, y est\u00E1 conformado por paneles prefabricados a base de fibras pl\u00E1sticas conformadas por tablones WPC (madera y pl\u00E1stico) de 0,15 X 0,01 X 2,91 mts.\r\n<br>Las dimensiones m\u00EDnimas de los paneles son: 3,08 X 2,50 metros.\r\n<br>Se considera una altura de 2,50 m.\r\n<br>La instalaci\u00F3n se realiza por medio de perfiles de anclaje laterales a modo de columnas verticales.\r\n<br>El espaciamiento entre apoyos es distribuido de tal manera que se asegura rigidez lateral, seguridad y estabilidad.\"\r\n</p>\r\n</body>\r\n</html>");
		lbl_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_2.setBounds(10, 13, 235, 336);
		panel_2.add(lbl_2);
		
				JPanel panel_3 = new JPanel();
				panel_3.setLayout(null);
				panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panel_3.setBounds(703, 18, 139, 104);
				pnlPestaña1.add(panel_3);
				
						JLabel label_5 = new JLabel("Observaci\u00F3n/Referencia");
						label_5.setFont(new Font("Tahoma", Font.BOLD, 10));
						label_5.setBounds(8, 57, 123, 14);
						panel_3.add(label_5);
						
								JRadioButton radioButton_2 = new JRadioButton("");
								radioButton_2.setBounds(44, 27, 21, 23);
								panel_3.add(radioButton_2);
								
										JRadioButton radioButton_3 = new JRadioButton("");
										radioButton_3.setBounds(65, 27, 21, 23);
										panel_3.add(radioButton_3);
										
												JLabel label_6 = new JLabel("SI");
												label_6.setBounds(48, 11, 21, 14);
												panel_3.add(label_6);
												
														JLabel label_7 = new JLabel("NO");
														label_7.setBounds(67, 11, 21, 14);
														panel_3.add(label_7);
														
																textField_1 = new JTextField();
																textField_1.setColumns(10);
																textField_1.setBounds(8, 71, 123, 20);
																panel_3.add(textField_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Caminer\u00EDas Exteriores", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(862, 11, 249, 360);
		pnlPestaña1.add(panel_4);
		
		JLabel lbl_3 = new JLabel("<html>\r\n<body>\r\n<p align=\"justify\">\r\nMateriales: \r\n<br>Paneles prefabricados  WPC (compuesto de pl\u00E1stico y madera) a base de fibras pl\u00E1sticas, resistentes a rayos ultravioletas y asegurar una durabilidad m\u00EDnima de 15 a\u00F1os.\r\n<br>El material utilizado no contiene productos qu\u00EDmicos da\u00F1inos.\r\n<br>Dimensiones m\u00EDnimas e instalaci\u00F3n:\r\n<br>La caminer\u00EDa se conforma con paneles prefabricados WPC (compuesto de pl\u00E1stico y madera) a base de fibras pl\u00E1sticas y utilizadas como piso exterior.\r\n<br>La instalaci\u00F3n es ejecutada por medio de perfiles de anclaje pl\u00E1sticos.\r\n<br>El perfil compuesto del panel es hueco fabricado por extrusi\u00F3n.\r\n<br>El panel tiene tiene dimensiones m\u00EDnimas de 150mm de ancho X 28 mm de espesor.\r\n<br>El perfil de anclaje tiene dimensiones m\u00EDnimas de 40 mm X 60mm (vigueta de pl\u00E1stico).\r\n</p>\r\n</body>\r\n</html>");
		lbl_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_3.setBounds(10, 13, 235, 336);
		panel_4.add(lbl_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(1132, 18, 139, 104);
		pnlPestaña1.add(panel_5);
		
		JLabel label_4 = new JLabel("Observaci\u00F3n/Referencia");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_4.setBounds(8, 57, 123, 14);
		panel_5.add(label_4);
		
		JRadioButton radioButton_4 = new JRadioButton("");
		radioButton_4.setBounds(44, 27, 21, 23);
		panel_5.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("");
		radioButton_5.setBounds(65, 27, 21, 23);
		panel_5.add(radioButton_5);
		
		JLabel label_8 = new JLabel("SI");
		label_8.setBounds(48, 11, 21, 14);
		panel_5.add(label_8);
		
		JLabel label_9 = new JLabel("NO");
		label_9.setBounds(67, 11, 21, 14);
		panel_5.add(label_9);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(8, 71, 123, 20);
		panel_5.add(textField_2);

	}

}
