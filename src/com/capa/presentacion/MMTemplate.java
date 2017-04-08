package com.capa.presentacion;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.capa.presentacion.InformacionObligatoriaV;
import com.capa.presentacion.JPcabecera;

public class MMTemplate extends JFrame {

	private static final long serialVersionUID = -3891089127852241756L;
	private JPanel contentPane;
	private JTextField txtKECant00;
	private JTextField txtKECant01;
	private JTextField txtKECant10;
	private JTextField txtKECant11;
	private JTextField txtKECant20;
	private JTextField txtKECant21;
	private JTextField txtKECant30;
	private JTextField txtKECant31;
	private JTextField txtKEor0;
	private JTextField txtKEor1;
	private JTextField txtKEor2;
	private JTextField txtKEor3;
	private JTextField textField_68;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;

	private JTextField textField_65;
	private JTextField textField_66;

	private JTextField textField_67;

	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;

	private JTextField textField_73;
	private JTextField textField_74;

	private JLabel lblKitParaConexin;

	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextField textField_79;
	private JTextField textField_80;
	private JTextField textField_81;
	private JTextField textField_82;
	private JTextField textField_83;
	private JTextField textField_84;
	private JTextField textField_85;
	private JTextField textField_86;
	private JTextField textField_87;
	private JTextField textField_88;
	private JTextField textField_89;
	private JLabel lblkitParaConexin;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_90;
	private JTextField textField_91;
	private JTextField textField_92;
	private JTextField textField_105;
	private JTextField textField_106;
	private JPanel panel_45;
	private JTextField textField_107;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_93;
	private JTextField textField_94;
	private JTextField textField_95;
	private JTextField textField_96;
	private JTextField textField_97;
	private JTextField textField_98;
	private JTextField textField_99;
	private JTextField textField_100;
	private JTextField textField_101;
	private JTextField textField_102;
	private JTextField textField_103;
	private JTextField textField_104;
	private JTextField textField_110;
	private JTextField textField_111;
	private JTextField textField_112;
	private JTextField textField_108;
	private JTextField textField_109;
	private JTextField textField_113;
	private JTextField textField_114;
	private JTextField textField_115;
	private JTextField textField_116;
	private JTextField textField_117;
	private JTextField textField_118;
	private JTextField textField_119;
	private JTextField textField_120;
	private JTextField textField_121;
	private JTextField textField_122;
	private JTextField textField_123;
	private JTextField textField_124;
	private JTextField textField_125;
	private JTextField textField_126;
	private JTextField textField_127;
	private JTextField textField_128;
	private JTextField textField_129;
	private JTextField textField_130;
	private JTextField textField_131;
	private JTextField textField_132;
	private JTextField textField_133;
	private JTextField textField_134;
	private JTextField textField_135;
	private JTextField textField_136;
	private JTextField textField_137;
	private JTextField textField_138;
	private JTextField textField_139;
	private JTextField textField_140;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_143;
	private JTextField textField_144;
	private JTextField textField_145;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_24;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_141;
	private JTextField textField_142;
	private JTextField textField_146;
	private JTextField textField_147;
	private JTextField textField_148;
	private JTextField textField_149;
	private JTextField textField_150;
	private JTextField textField_151;
	private JTextField textField_152;
	private JTextField textField_153;
	private JTextField textField_154;
	private JTextField textField_155;
	private JTextField textField_156;
	private JTextField textField_157;
	private JTextField textField_158;
	private JTextField textField_159;
	private JTextField textField_160;
	private JTextField textField_161;
	private JTextField textField_162;
	private JTextField textField_163;
	private JTextField textField_164;
	private JTextField textField_165;
	private JTextField textField_166;
	private JTextField textField_167;
	private JTextField textField_168;
	private JTextField textField_169;
	private JTextField textField_170;
	private JTextField textField_171;
	private JTextField textField_172;
	private JTextField textField_173;
	private JTextField textField_174;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MMTemplate frame = new MMTemplate("Template");
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MMTemplate(String laboratorio) {
		setTitle("MM-" + laboratorio);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1311, 706);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 125, 1284, 540);
		contentPane.add(tabbedPane);

		String texto = "<html><body>Kit de Accesorios de Conexi\u00F3n Agua de<br>"
				+ "Lluvia (2 rejilla, 4 codos 90\u00B0,1/4 gl<br>polipega, tornillos, abrazaderas</body></html>)";

		String textoConexion = "<html><body>Kit para conexi\u00F3n de tuber\u00EDa 75 mm. (lija<br>"
				+ "pliego, polipega 1/4gal,1 codo 90\u00B0)</body></html>";

		String textoAccAP = "<html><body>Kit de Accesorios de Conexi\u00F3n Agua<br>Potable (fregaderos)(2  te reducciones<br>3/4-1/2, "
				+ "2 neplos,4 uniones de 1/2,4<br>"
				+ "codos de 90\u00B0,2 mangueras de abasto,2<br>llave de paso, tefl\u00F3n, pasta selladora)";

		String textoConTub = "<html><body>Kit para conexi\u00F3n de tuber\u00EDa 1/2\". (lija<br>pliego, polipega 1/4gal,3 uniones)</body></html>";

		String textoConeTub = "<html><body>Kit para conexi\u00F3n de tuber\u00EDa 3/4\". (lija<br>pliego, polipega 1/4gal,3 uniones)</body></html>";

		String textoConeAR = "<html><body>Kit de Accesorios de Conexi\u00F3n Agua<br>Residual (CP)(2 codo 90\u00B0,2 rejilla,2 ye<br>"
				+ "75-110,1/4gl polipega)</body></html>";

		String textoFrega = "<html><body>Kit de Accesorios de Conexi\u00F3n Agua<br>Residual (Fregaderos)( 4codo 90\u00B0,1/4 gl<br>"
				+ "polipega ,4 yee 50-110)</body></html>";

		String textoDescTub = "<html><body>Kit para conexi\u00F3n de tuber\u00EDa 50 mm. (lija<br>un pliego, polipega 1/4 gal, 1/4 gl suelda<br>"
				+ "l\u00EDquida, 2 uniones,2codo 90\u00B0, 2 codo45\u00B0)";

		String textoLabel = "<html><body>Kit para conexi\u00F3n de tuber\u00EDa 75 mm. (lija<br>pliego, polipega 1/2gal,1/4 gl suelda<br>"
				+ "l�quida, 2 uniones,2codo 90\u00B0,2codo45\u00B0)</body></html>";

		String textoVentana = "<html><body>Ventana corredera, compuesta por tres<br>hojas y dos carriles. UPVC con vidrio<br>"
				+ "flotado de 3 mm de 3x1,10</body></html>";

		JPanel panelLab1 = new JPanel();
		tabbedPane.addTab("1.- MM laboratorio-1", null, panelLab1, null);
		panelLab1.setLayout(null);

		JLabel label_13 = new JLabel("Observaci\u00F3n/Referencia");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Arial", Font.BOLD, 11));
		label_13.setBounds(1281, 11, 153, 14);
		panelLab1.add(label_13);

		JButton btnSiguiente = new JButton("Siguiente p\u00E1gina");
		btnSiguiente.setBounds(1132, 471, 139, 34);
		panelLab1.add(btnSiguiente);

		JPanel pnlKitElectrico = new JPanel();
		pnlKitElectrico.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlKitElectrico.setBounds(10, 11, 414, 96);
		panelLab1.add(pnlKitElectrico);
		pnlKitElectrico.setLayout(null);

		JPanel pnlEtiquetas00 = new JPanel();
		pnlEtiquetas00.setBounds(2, 14, 191, 80);
		pnlKitElectrico.add(pnlEtiquetas00);
		pnlEtiquetas00.setLayout(new GridLayout(4, 1, 0, 0));

		JLabel lblKitCableElctrico = new JLabel("Kit cable eléctrico  ");
		lblKitCableElctrico.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKitCableElctrico.setFont(new Font("Arial", Font.PLAIN, 11));
		pnlEtiquetas00.add(lblKitCableElctrico);

		JLabel lblInterruptor = new JLabel("Interruptor  ");
		lblInterruptor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblInterruptor.setFont(new Font("Arial", Font.PLAIN, 11));
		pnlEtiquetas00.add(lblInterruptor);

		JLabel lblTomacorrientes = new JLabel("Tomacorrientes  ");
		lblTomacorrientes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTomacorrientes.setFont(new Font("Arial", Font.PLAIN, 11));
		pnlEtiquetas00.add(lblTomacorrientes);

		JLabel lblLuminariasLed = new JLabel("Luminarias LED 60 w - 5000 lum  ");
		lblLuminariasLed.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLuminariasLed.setFont(new Font("Arial", Font.PLAIN, 11));
		pnlEtiquetas00.add(lblLuminariasLed);

		JPanel pnlCantidad00 = new JPanel();
		pnlCantidad00.setBounds(195, 14, 50, 80);
		pnlKitElectrico.add(pnlCantidad00);
		pnlCantidad00.setLayout(new GridLayout(4, 2, 0, 0));

		txtKECant00 = new JTextField();
		txtKECant00.setEditable(false);
		txtKECant00.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECant00.setColumns(10);
		pnlCantidad00.add(txtKECant00);

		txtKECant01 = new JTextField();
		txtKECant01.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECant01.setColumns(10);
		pnlCantidad00.add(txtKECant01);

		txtKECant10 = new JTextField();
		txtKECant10.setEditable(false);
		txtKECant10.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECant10.setColumns(10);
		pnlCantidad00.add(txtKECant10);

		txtKECant11 = new JTextField();
		txtKECant11.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECant11.setColumns(10);
		pnlCantidad00.add(txtKECant11);

		txtKECant20 = new JTextField();
		txtKECant20.setEditable(false);
		txtKECant20.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECant20.setColumns(10);
		pnlCantidad00.add(txtKECant20);

		txtKECant21 = new JTextField();
		txtKECant21.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECant21.setColumns(10);
		pnlCantidad00.add(txtKECant21);

		txtKECant30 = new JTextField();
		txtKECant30.setEditable(false);
		txtKECant30.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECant30.setColumns(10);
		pnlCantidad00.add(txtKECant30);

		txtKECant31 = new JTextField();
		txtKECant31.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECant31.setColumns(10);
		pnlCantidad00.add(txtKECant31);

		JPanel pnlObsRef00 = new JPanel();
		pnlObsRef00.setBounds(248, 14, 162, 80);
		pnlKitElectrico.add(pnlObsRef00);
		pnlObsRef00.setLayout(new GridLayout(4, 1, 0, 0));

		txtKEor0 = new JTextField();
		txtKEor0.setColumns(10);
		pnlObsRef00.add(txtKEor0);

		txtKEor1 = new JTextField();
		txtKEor1.setColumns(10);
		pnlObsRef00.add(txtKEor1);

		txtKEor2 = new JTextField();
		txtKEor2.setColumns(10);
		pnlObsRef00.add(txtKEor2);

		txtKEor3 = new JTextField();
		txtKEor3.setColumns(10);
		pnlObsRef00.add(txtKEor3);

		JLabel lblKitElctrico = new JLabel("  KIT ELÉCTRICO");
		lblKitElctrico.setHorizontalAlignment(SwingConstants.LEFT);
		lblKitElctrico.setFont(new Font("Arial", Font.BOLD, 11));
		lblKitElctrico.setBounds(0, 0, 191, 14);
		pnlKitElectrico.add(lblKitElctrico);

		JLabel label_24 = new JLabel("Cantidad");
		label_24.setHorizontalAlignment(SwingConstants.LEFT);
		label_24.setFont(new Font("Arial", Font.BOLD, 11));
		label_24.setBounds(195, 0, 60, 14);
		pnlKitElectrico.add(label_24);

		JLabel label_25 = new JLabel("Observación/Referencia");
		label_25.setHorizontalAlignment(SwingConstants.LEFT);
		label_25.setFont(new Font("Arial", Font.BOLD, 11));
		label_25.setBounds(258, 0, 190, 14);
		pnlKitElectrico.add(label_25);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 207, 414, 36);
		panelLab1.add(panel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(2, 14, 191, 20);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblFregadero = new JLabel("Fregadero  ");
		lblFregadero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFregadero.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_1.add(lblFregadero);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(195, 14, 50, 20);
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 2, 0, 0));

		textField_60 = new JTextField();
		textField_60.setEditable(false);
		textField_60.setColumns(10);
		panel_2.add(textField_60);

		textField_61 = new JTextField();
		textField_61.setColumns(10);
		panel_2.add(textField_61);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(248, 14, 162, 20);
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 1, 0, 0));

		textField_68 = new JTextField();
		textField_68.setColumns(10);
		panel_3.add(textField_68);

		JLabel label_8 = new JLabel("Cantidad");
		label_8.setHorizontalAlignment(SwingConstants.LEFT);
		label_8.setFont(new Font("Arial", Font.BOLD, 11));
		label_8.setBounds(195, 0, 60, 14);
		panel.add(label_8);

		JLabel label_17 = new JLabel("Observación/Referencia");
		label_17.setHorizontalAlignment(SwingConstants.LEFT);
		label_17.setFont(new Font("Arial", Font.BOLD, 11));
		label_17.setBounds(258, 0, 190, 14);
		panel.add(label_17);

		JLabel lblKitHidrosanitario = new JLabel("  KIT HIDROSANITARIO");
		lblKitHidrosanitario.setHorizontalAlignment(SwingConstants.LEFT);
		lblKitHidrosanitario.setFont(new Font("Arial", Font.BOLD, 11));
		lblKitHidrosanitario.setBounds(2, 0, 191, 14);
		panel.add(lblKitHidrosanitario);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(10, 328, 414, 177);
		panelLab1.add(panel_4);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(2, 14, 191, 20);
		panel_4.add(panel_5);
		panel_5.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel label = new JLabel("Canal plástico PVC de L=3m");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_5.add(label);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(195, 14, 50, 20);
		panel_4.add(panel_6);
		panel_6.setLayout(new GridLayout(1, 2, 0, 0));

		textField_62 = new JTextField();
		textField_62.setEditable(false);
		textField_62.setColumns(10);
		panel_6.add(textField_62);

		textField_63 = new JTextField();
		textField_63.setColumns(10);
		panel_6.add(textField_63);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(248, 14, 162, 20);
		panel_4.add(panel_7);
		panel_7.setLayout(new GridLayout(1, 1, 0, 0));

		textField_64 = new JTextField();
		textField_64.setColumns(10);
		panel_7.add(textField_64);

		JLabel label_1 = new JLabel("Cantidad");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("Arial", Font.BOLD, 11));
		label_1.setBounds(195, 0, 60, 14);
		panel_4.add(label_1);

		JLabel label_2 = new JLabel("Observación/Referencia");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setFont(new Font("Arial", Font.BOLD, 11));
		label_2.setBounds(258, 0, 190, 14);
		panel_4.add(label_2);

		JLabel label_3 = new JLabel("  KIT AGUA LLUVIA");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("Arial", Font.BOLD, 11));
		label_3.setBounds(2, 0, 191, 14);
		panel_4.add(label_3);

		JPanel panel_9 = new JPanel();
		panel_9.setBounds(2, 34, 191, 60);
		panel_4.add(panel_9);
		panel_9.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblkitDeAccesorios = new JLabel(
				"<html><body><p align=\"right\">Kit de Accesorios de Conexión Agua de Lluvia (2 rejilla, 4 codos 90°,1/4 gl polipega, tornillos, abrazaderas</body></html>)");
		lblkitDeAccesorios.setHorizontalAlignment(SwingConstants.RIGHT);
		lblkitDeAccesorios.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_9.add(lblkitDeAccesorios);

		JPanel panel_10 = new JPanel();
		panel_10.setBounds(195, 50, 50, 20);
		panel_4.add(panel_10);
		panel_10.setLayout(new GridLayout(1, 2, 0, 0));

		textField_65 = new JTextField();
		textField_65.setEditable(false);
		textField_65.setColumns(10);
		panel_10.add(textField_65);

		textField_66 = new JTextField();
		textField_66.setColumns(10);
		panel_10.add(textField_66);

		JPanel panel_11 = new JPanel();
		panel_11.setBounds(248, 50, 162, 20);
		panel_4.add(panel_11);
		panel_11.setLayout(new GridLayout(1, 1, 0, 0));

		textField_67 = new JTextField();
		textField_67.setColumns(10);
		panel_11.add(textField_67);

		JPanel panel_8 = new JPanel();
		panel_8.setBounds(2, 94, 191, 40);
		panel_4.add(panel_8);
		panel_8.setLayout(new GridLayout(2, 1, 0, 0));

		JLabel label_22 = new JLabel("Tubería de PVC 75 mm L=3m");
		label_22.setHorizontalAlignment(SwingConstants.RIGHT);
		label_22.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_8.add(label_22);

		JLabel label_23 = new JLabel("Tubería de PVC 75 mm L=0.6m");
		label_23.setHorizontalAlignment(SwingConstants.RIGHT);
		label_23.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_8.add(label_23);

		JPanel panel_12 = new JPanel();
		panel_12.setBounds(195, 94, 50, 40);
		panel_4.add(panel_12);
		panel_12.setLayout(new GridLayout(2, 2, 0, 0));

		textField_69 = new JTextField();
		textField_69.setEditable(false);
		textField_69.setColumns(10);
		panel_12.add(textField_69);

		textField_70 = new JTextField();
		textField_70.setColumns(10);
		panel_12.add(textField_70);

		textField_71 = new JTextField();
		textField_71.setEditable(false);
		textField_71.setColumns(10);
		panel_12.add(textField_71);

		textField_72 = new JTextField();
		textField_72.setColumns(10);
		panel_12.add(textField_72);

		JPanel panel_13 = new JPanel();
		panel_13.setBounds(248, 94, 162, 40);
		panel_4.add(panel_13);
		panel_13.setLayout(new GridLayout(2, 1, 0, 0));

		textField_73 = new JTextField();
		textField_73.setColumns(10);
		panel_13.add(textField_73);

		textField_74 = new JTextField();
		textField_74.setColumns(10);
		panel_13.add(textField_74);

		JPanel panel_14 = new JPanel();
		panel_14.setBounds(2, 134, 191, 40);
		panel_4.add(panel_14);
		panel_14.setLayout(new GridLayout(1, 1, 0, 0));

		lblKitParaConexin = new JLabel(
				"<html><body><p align=\"right\"> Kit para conexión de tubería 75 mm. (lija pliego, polipega 1/4gal,1 codo 90°)</body></html>");
		lblKitParaConexin.setHorizontalAlignment(SwingConstants.LEFT);
		lblKitParaConexin.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_14.add(lblKitParaConexin);

		JPanel panel_15 = new JPanel();
		panel_15.setBounds(195, 144, 50, 20);
		panel_4.add(panel_15);
		panel_15.setLayout(new GridLayout(1, 2, 0, 0));

		textField_75 = new JTextField();
		textField_75.setEditable(false);
		textField_75.setColumns(10);
		panel_15.add(textField_75);

		textField_76 = new JTextField();
		textField_76.setColumns(10);
		panel_15.add(textField_76);

		JPanel panel_16 = new JPanel();
		panel_16.setBounds(248, 144, 162, 20);
		panel_4.add(panel_16);
		panel_16.setLayout(new GridLayout(1, 1, 0, 0));

		textField_77 = new JTextField();
		textField_77.setColumns(10);
		panel_16.add(textField_77);

		JPanel panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_17.setBounds(433, 9, 414, 225);
		panelLab1.add(panel_17);

		JPanel panel_18 = new JPanel();
		panel_18.setBounds(2, 14, 191, 85);
		panel_17.add(panel_18);
		panel_18.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblkitDeAccesorios_1 = new JLabel(
				"<html><body><p align=\"right\">Kit de Accesorios de Conexión Agua Potable (fregaderos)(2  te reducciones 3/4-1/2, 2 neplos,4 uniones de 1/2,4 codos de 90°,2 mangueras de abasto,2 llave de paso, teflón, pasta selladora)</body></html>");
		lblkitDeAccesorios_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblkitDeAccesorios_1.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_18.add(lblkitDeAccesorios_1);

		JPanel panel_19 = new JPanel();
		panel_19.setBounds(195, 47, 50, 20);
		panel_17.add(panel_19);
		panel_19.setLayout(new GridLayout(1, 2, 0, 0));

		textField_78 = new JTextField();
		textField_78.setEditable(false);
		textField_78.setColumns(10);
		panel_19.add(textField_78);

		textField_79 = new JTextField();
		textField_79.setColumns(10);
		panel_19.add(textField_79);

		JPanel panel_20 = new JPanel();
		panel_20.setBounds(248, 47, 162, 20);
		panel_17.add(panel_20);
		panel_20.setLayout(new GridLayout(1, 1, 0, 0));

		textField_80 = new JTextField();
		textField_80.setColumns(10);
		panel_20.add(textField_80);

		JLabel label_26 = new JLabel("Cantidad");
		label_26.setHorizontalAlignment(SwingConstants.LEFT);
		label_26.setFont(new Font("Arial", Font.BOLD, 11));
		label_26.setBounds(195, 0, 60, 14);
		panel_17.add(label_26);

		JLabel label_27 = new JLabel("Observación/Referencia");
		label_27.setHorizontalAlignment(SwingConstants.LEFT);
		label_27.setFont(new Font("Arial", Font.BOLD, 11));
		label_27.setBounds(258, 0, 190, 14);
		panel_17.add(label_27);

		JLabel lblKitAguaPotable = new JLabel("  KIT AGUA POTABLE");
		lblKitAguaPotable.setHorizontalAlignment(SwingConstants.LEFT);
		lblKitAguaPotable.setFont(new Font("Arial", Font.BOLD, 11));
		lblKitAguaPotable.setBounds(2, 0, 191, 14);
		panel_17.add(lblKitAguaPotable);

		JPanel panel_21 = new JPanel();
		panel_21.setBounds(2, 98, 191, 40);
		panel_17.add(panel_21);
		panel_21.setLayout(new GridLayout(2, 1, 0, 0));

		JLabel label_4 = new JLabel("Tubería de PVC  1/2\" y L=1.5m");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_21.add(label_4);

		JLabel label_29 = new JLabel("Tubería de PVC  3/4\" y L=3m");
		label_29.setHorizontalAlignment(SwingConstants.RIGHT);
		label_29.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_21.add(label_29);

		JPanel panel_22 = new JPanel();
		panel_22.setBounds(195, 98, 50, 40);
		panel_17.add(panel_22);
		panel_22.setLayout(new GridLayout(2, 2, 0, 0));

		textField_81 = new JTextField();
		textField_81.setEditable(false);
		textField_81.setColumns(10);
		panel_22.add(textField_81);

		textField_82 = new JTextField();
		textField_82.setColumns(10);
		panel_22.add(textField_82);

		textField_83 = new JTextField();
		textField_83.setEditable(false);
		textField_83.setColumns(10);
		panel_22.add(textField_83);

		textField_84 = new JTextField();
		textField_84.setColumns(10);
		panel_22.add(textField_84);

		JPanel panel_23 = new JPanel();
		panel_23.setBounds(248, 98, 162, 40);
		panel_17.add(panel_23);
		panel_23.setLayout(new GridLayout(2, 1, 0, 0));

		textField_85 = new JTextField();
		textField_85.setColumns(10);
		panel_23.add(textField_85);

		textField_86 = new JTextField();
		textField_86.setColumns(10);
		panel_23.add(textField_86);

		JPanel panel_24 = new JPanel();
		panel_24.setBounds(2, 137, 191, 40);
		panel_17.add(panel_24);
		panel_24.setLayout(new GridLayout(1, 1, 0, 0));

		lblkitParaConexin = new JLabel(
				"<html><body><p align=\"right\">Kit para conexión de tubería 1/2\". (lija, pliego, polipega 1/4gal,3 uniones)</body></html>");
		lblkitParaConexin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblkitParaConexin.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_24.add(lblkitParaConexin);

		JPanel panel_25 = new JPanel();
		panel_25.setBounds(195, 144, 50, 20);
		panel_17.add(panel_25);
		panel_25.setLayout(new GridLayout(1, 2, 0, 0));

		textField_87 = new JTextField();
		textField_87.setEditable(false);
		textField_87.setColumns(10);
		panel_25.add(textField_87);

		textField_88 = new JTextField();
		textField_88.setColumns(10);
		panel_25.add(textField_88);

		JPanel panel_26 = new JPanel();
		panel_26.setBounds(248, 144, 162, 20);
		panel_17.add(panel_26);
		panel_26.setLayout(new GridLayout(1, 1, 0, 0));

		textField_89 = new JTextField();
		textField_89.setColumns(10);
		panel_26.add(textField_89);

		JPanel panel_27 = new JPanel();
		panel_27.setBounds(2, 177, 191, 40);
		panel_17.add(panel_27);
		panel_27.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblKitParaConexin_1 = new JLabel(
				"<html><body><p align=\"right\"> Kit para conexión de tubería 3/4\". (lija, pliego, polipega 1/4gal,3 uniones)</body></html>");
		lblKitParaConexin_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblKitParaConexin_1.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_27.add(lblKitParaConexin_1);

		JPanel panel_28 = new JPanel();
		panel_28.setBounds(195, 185, 50, 20);
		panel_17.add(panel_28);
		panel_28.setLayout(new GridLayout(1, 2, 0, 0));

		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		panel_28.add(textField);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel_28.add(textField_1);

		JPanel panel_29 = new JPanel();
		panel_29.setBounds(248, 185, 162, 20);
		panel_17.add(panel_29);
		panel_29.setLayout(new GridLayout(1, 1, 0, 0));

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_29.add(textField_2);

		JPanel panel_30 = new JPanel();
		panel_30.setLayout(null);
		panel_30.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_30.setBounds(433, 243, 414, 262);
		panelLab1.add(panel_30);

		JPanel panel_31 = new JPanel();
		panel_31.setBounds(2, 14, 191, 47);
		panel_30.add(panel_31);
		panel_31.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblkitDeAccesorios_2 = new JLabel(
				"<html><body><p align=\"right\">Kit de Accesorios de Conexión Agua Residual (CP)(2 codo 90°,2 rejilla,2 ye 75-110,1/4gl polipega)</body></html>");
		lblkitDeAccesorios_2.setVerticalAlignment(SwingConstants.TOP);
		lblkitDeAccesorios_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblkitDeAccesorios_2.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_31.add(lblkitDeAccesorios_2);

		JPanel panel_32 = new JPanel();
		panel_32.setBounds(195, 25, 50, 20);
		panel_30.add(panel_32);
		panel_32.setLayout(new GridLayout(1, 2, 0, 0));

		textField_90 = new JTextField();
		textField_90.setEditable(false);
		textField_90.setColumns(10);
		panel_32.add(textField_90);

		textField_91 = new JTextField();
		textField_91.setColumns(10);
		panel_32.add(textField_91);

		JPanel panel_33 = new JPanel();
		panel_33.setBounds(248, 25, 162, 20);
		panel_30.add(panel_33);
		panel_33.setLayout(new GridLayout(1, 1, 0, 0));

		textField_92 = new JTextField();
		textField_92.setColumns(10);
		panel_33.add(textField_92);

		JLabel label_7 = new JLabel("Cantidad");
		label_7.setHorizontalAlignment(SwingConstants.LEFT);
		label_7.setFont(new Font("Arial", Font.BOLD, 11));
		label_7.setBounds(195, 0, 60, 14);
		panel_30.add(label_7);

		JLabel label_30 = new JLabel("Observación/Referencia");
		label_30.setHorizontalAlignment(SwingConstants.LEFT);
		label_30.setFont(new Font("Arial", Font.BOLD, 11));
		label_30.setBounds(258, 0, 190, 14);
		panel_30.add(label_30);

		JLabel lblKitAguaResidual = new JLabel("  KIT AGUA RESIDUAL");
		lblKitAguaResidual.setHorizontalAlignment(SwingConstants.LEFT);
		lblKitAguaResidual.setFont(new Font("Arial", Font.BOLD, 11));
		lblKitAguaResidual.setBounds(2, 0, 191, 14);
		panel_30.add(lblKitAguaResidual);

		JPanel panel_43 = new JPanel();
		panel_43.setBounds(2, 67, 191, 20);
		panel_30.add(panel_43);
		panel_43.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel label_36 = new JLabel("Tubería de 50mm PVC y L=2m");
		label_36.setHorizontalAlignment(SwingConstants.RIGHT);
		label_36.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_43.add(label_36);

		JPanel panel_44 = new JPanel();
		panel_44.setBounds(195, 67, 50, 20);
		panel_30.add(panel_44);
		panel_44.setLayout(new GridLayout(1, 2, 0, 0));

		textField_105 = new JTextField();
		textField_105.setEditable(false);
		textField_105.setColumns(10);
		panel_44.add(textField_105);

		textField_106 = new JTextField();
		textField_106.setColumns(10);
		panel_44.add(textField_106);

		panel_45 = new JPanel();
		panel_45.setBounds(248, 67, 162, 20);
		panel_30.add(panel_45);
		panel_45.setLayout(new GridLayout(1, 1, 0, 0));

		textField_107 = new JTextField();
		textField_107.setColumns(10);
		panel_45.add(textField_107);

		JPanel panel_34 = new JPanel();
		panel_34.setBounds(2, 89, 191, 40);
		panel_30.add(panel_34);
		panel_34.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblkitDeAccesorios_3 = new JLabel(
				"<html><body><p align=\"right\">Kit de Accesorios de Conexión Agua Residual (Fregaderos)( 4codo 90°,1/4 gl polipega ,4 yee 50-110)</body></html>");
		lblkitDeAccesorios_3.setVerticalAlignment(SwingConstants.TOP);
		lblkitDeAccesorios_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblkitDeAccesorios_3.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_34.add(lblkitDeAccesorios_3);

		JPanel panel_35 = new JPanel();
		panel_35.setBounds(195, 96, 50, 20);
		panel_30.add(panel_35);
		panel_35.setLayout(new GridLayout(1, 2, 0, 0));

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		panel_35.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		panel_35.add(textField_4);

		JPanel panel_36 = new JPanel();
		panel_36.setBounds(248, 96, 162, 20);
		panel_30.add(panel_36);
		panel_36.setLayout(new GridLayout(1, 1, 0, 0));

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		panel_36.add(textField_5);

		JPanel panel_37 = new JPanel();
		panel_37.setBounds(2, 127, 191, 40);
		panel_30.add(panel_37);
		panel_37.setLayout(new GridLayout(2, 1, 0, 0));

		JLabel label_9 = new JLabel("Tubería de 75mm PVC y L=3m");
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		label_9.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_37.add(label_9);

		JLabel label_10 = new JLabel("Tubería de 75mm PVC y L=2m");
		label_10.setHorizontalAlignment(SwingConstants.RIGHT);
		label_10.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_37.add(label_10);

		JPanel panel_38 = new JPanel();
		panel_38.setBounds(195, 127, 50, 40);
		panel_30.add(panel_38);
		panel_38.setLayout(new GridLayout(2, 2, 0, 0));

		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		panel_38.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		panel_38.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		panel_38.add(textField_8);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		panel_38.add(textField_9);

		JPanel panel_39 = new JPanel();
		panel_39.setBounds(248, 127, 162, 40);
		panel_30.add(panel_39);
		panel_39.setLayout(new GridLayout(2, 1, 0, 0));

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		panel_39.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		panel_39.add(textField_11);

		JPanel panel_40 = new JPanel();
		panel_40.setBounds(2, 169, 191, 40);
		panel_30.add(panel_40);
		panel_40.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblkitParaConexin_1 = new JLabel(
				"<html><body><p align=\"right\">Kit para conexión de tubería 50 mm. (lija, un pliego, polipega 1/4 gal, 1/4 gl suelda líquida, 2 uniones,2codo 90°, 2 codo45°)");
		lblkitParaConexin_1.setVerticalAlignment(SwingConstants.TOP);
		lblkitParaConexin_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblkitParaConexin_1.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_40.add(lblkitParaConexin_1);

		JPanel panel_41 = new JPanel();
		panel_41.setBounds(195, 176, 50, 20);
		panel_30.add(panel_41);
		panel_41.setLayout(new GridLayout(1, 2, 0, 0));

		textField_93 = new JTextField();
		textField_93.setEditable(false);
		textField_93.setColumns(10);
		panel_41.add(textField_93);

		textField_94 = new JTextField();
		textField_94.setColumns(10);
		panel_41.add(textField_94);

		JPanel panel_42 = new JPanel();
		panel_42.setBounds(248, 176, 162, 20);
		panel_30.add(panel_42);
		panel_42.setLayout(new GridLayout(1, 1, 0, 0));

		textField_95 = new JTextField();
		textField_95.setColumns(10);
		panel_42.add(textField_95);

		JPanel panel_46 = new JPanel();
		panel_46.setBounds(2, 212, 191, 40);
		panel_30.add(panel_46);
		panel_46.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblkitParaConexin_2 = new JLabel(
				"<html><body><p align=\"right\">Kit para conexión de tubería 75 mm. (lija, pliego, polipega 1/2gal,1/4 gl suelda líquida, 2 uniones,2codo 90°,2codo45°)</body></html>");
		lblkitParaConexin_2.setVerticalAlignment(SwingConstants.TOP);
		lblkitParaConexin_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblkitParaConexin_2.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_46.add(lblkitParaConexin_2);

		JPanel panel_47 = new JPanel();
		panel_47.setBounds(195, 220, 50, 20);
		panel_30.add(panel_47);
		panel_47.setLayout(new GridLayout(1, 2, 0, 0));

		textField_96 = new JTextField();
		textField_96.setEditable(false);
		textField_96.setColumns(10);
		panel_47.add(textField_96);

		textField_97 = new JTextField();
		textField_97.setColumns(10);
		panel_47.add(textField_97);

		JPanel panel_48 = new JPanel();
		panel_48.setBounds(248, 220, 162, 20);
		panel_30.add(panel_48);
		panel_48.setLayout(new GridLayout(1, 1, 0, 0));

		textField_98 = new JTextField();
		textField_98.setColumns(10);
		panel_48.add(textField_98);

		JPanel panel_49 = new JPanel();
		panel_49.setLayout(null);
		panel_49.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_49.setBounds(857, 11, 414, 232);
		panelLab1.add(panel_49);

		JPanel panel_50 = new JPanel();
		panel_50.setBounds(2, 14, 191, 60);
		panel_49.add(panel_50);
		panel_50.setLayout(new GridLayout(3, 1, 0, 0));

		JLabel label_5 = new JLabel("Puerta");
		label_5.setVerticalAlignment(SwingConstants.TOP);
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_50.add(label_5);

		JLabel label_6 = new JLabel("Bisagras");
		label_6.setVerticalAlignment(SwingConstants.TOP);
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_50.add(label_6);

		JLabel label_32 = new JLabel("Perfil SF Tipo 12 MA-SF-12 para puerta");
		label_32.setVerticalAlignment(SwingConstants.TOP);
		label_32.setHorizontalAlignment(SwingConstants.RIGHT);
		label_32.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_50.add(label_32);

		JPanel panel_51 = new JPanel();
		panel_51.setBounds(195, 14, 50, 60);
		panel_49.add(panel_51);
		panel_51.setLayout(new GridLayout(3, 2, 0, 0));

		textField_99 = new JTextField();
		textField_99.setHorizontalAlignment(SwingConstants.CENTER);
		textField_99.setEditable(false);
		textField_99.setColumns(10);
		panel_51.add(textField_99);

		textField_100 = new JTextField();
		textField_100.setHorizontalAlignment(SwingConstants.CENTER);
		textField_100.setColumns(10);
		panel_51.add(textField_100);

		textField_101 = new JTextField();
		textField_101.setHorizontalAlignment(SwingConstants.CENTER);
		textField_101.setEditable(false);
		textField_101.setColumns(10);
		panel_51.add(textField_101);

		textField_102 = new JTextField();
		textField_102.setHorizontalAlignment(SwingConstants.CENTER);
		textField_102.setColumns(10);
		panel_51.add(textField_102);

		textField_103 = new JTextField();
		textField_103.setHorizontalAlignment(SwingConstants.CENTER);
		textField_103.setEditable(false);
		textField_103.setColumns(10);
		panel_51.add(textField_103);

		textField_104 = new JTextField();
		textField_104.setHorizontalAlignment(SwingConstants.CENTER);
		textField_104.setColumns(10);
		panel_51.add(textField_104);

		JPanel panel_52 = new JPanel();
		panel_52.setBounds(248, 14, 162, 60);
		panel_49.add(panel_52);
		panel_52.setLayout(new GridLayout(3, 1, 0, 0));

		textField_110 = new JTextField();
		textField_110.setColumns(10);
		panel_52.add(textField_110);

		textField_111 = new JTextField();
		textField_111.setColumns(10);
		panel_52.add(textField_111);

		textField_112 = new JTextField();
		textField_112.setColumns(10);
		panel_52.add(textField_112);

		JLabel label_35 = new JLabel("Cantidad");
		label_35.setHorizontalAlignment(SwingConstants.LEFT);
		label_35.setFont(new Font("Arial", Font.BOLD, 11));
		label_35.setBounds(195, 0, 60, 14);
		panel_49.add(label_35);

		JLabel label_37 = new JLabel("Observación/Referencia");
		label_37.setHorizontalAlignment(SwingConstants.LEFT);
		label_37.setFont(new Font("Arial", Font.BOLD, 11));
		label_37.setBounds(258, 0, 190, 14);
		panel_49.add(label_37);

		JPanel panel_53 = new JPanel();
		panel_53.setBounds(2, 75, 191, 47);
		panel_49.add(panel_53);
		panel_53.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblventanaCorrederaCompuesta = new JLabel(
				"<html><body><p align=\"right\">Ventana corredera, compuesta por tres hojas y dos carriles. UPVC con vidrio flotado de 3 mm de 3x1,10</body></html>");
		lblventanaCorrederaCompuesta.setVerticalAlignment(SwingConstants.TOP);
		lblventanaCorrederaCompuesta.setHorizontalAlignment(SwingConstants.LEFT);
		lblventanaCorrederaCompuesta.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_53.add(lblventanaCorrederaCompuesta);

		JPanel panel_54 = new JPanel();
		panel_54.setBounds(195, 86, 50, 20);
		panel_49.add(panel_54);
		panel_54.setLayout(new GridLayout(1, 2, 0, 0));

		textField_108 = new JTextField();
		textField_108.setEditable(false);
		textField_108.setColumns(10);
		panel_54.add(textField_108);

		textField_109 = new JTextField();
		textField_109.setColumns(10);
		panel_54.add(textField_109);

		JPanel panel_55 = new JPanel();
		panel_55.setBounds(248, 86, 162, 20);
		panel_49.add(panel_55);
		panel_55.setLayout(new GridLayout(1, 1, 0, 0));

		textField_113 = new JTextField();
		textField_113.setColumns(10);
		panel_55.add(textField_113);

		JLabel lblComponenteArquitectnico = new JLabel("  COMPONENTE ARQUITECTÓNICO");
		lblComponenteArquitectnico.setHorizontalAlignment(SwingConstants.LEFT);
		lblComponenteArquitectnico.setFont(new Font("Arial", Font.BOLD, 11));
		lblComponenteArquitectnico.setBounds(2, 0, 193, 14);
		panel_49.add(lblComponenteArquitectnico);

		JPanel panel_56 = new JPanel();
		panel_56.setBounds(2, 124, 191, 100);
		panel_49.add(panel_56);
		panel_56.setLayout(new GridLayout(5, 1, 0, 0));

		JLabel label_12 = new JLabel("Perfil SF-12 para ventana");
		label_12.setVerticalAlignment(SwingConstants.TOP);
		label_12.setHorizontalAlignment(SwingConstants.RIGHT);
		label_12.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_56.add(label_12);

		JLabel label_33 = new JLabel("Perfil SF Tipo 12 MM-SF-12  para paneles");
		label_33.setVerticalAlignment(SwingConstants.TOP);
		label_33.setHorizontalAlignment(SwingConstants.RIGHT);
		label_33.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_56.add(label_33);

		JLabel label_34 = new JLabel("Paneles TCB (8.8x5.8 m)");
		label_34.setVerticalAlignment(SwingConstants.TOP);
		label_34.setHorizontalAlignment(SwingConstants.RIGHT);
		label_34.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_56.add(label_34);

		JLabel label_38 = new JLabel("Paneles vynil piso (0,15x1,93 m)");
		label_38.setVerticalAlignment(SwingConstants.TOP);
		label_38.setHorizontalAlignment(SwingConstants.RIGHT);
		label_38.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_56.add(label_38);

		JLabel label_39 = new JLabel("Paneles EPS para cubierta l=7, a= 1m");
		label_39.setVerticalAlignment(SwingConstants.TOP);
		label_39.setHorizontalAlignment(SwingConstants.RIGHT);
		label_39.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_56.add(label_39);

		JPanel panel_57 = new JPanel();
		panel_57.setBounds(195, 124, 50, 100);
		panel_49.add(panel_57);
		panel_57.setLayout(new GridLayout(5, 2, 0, 0));

		textField_114 = new JTextField();
		textField_114.setHorizontalAlignment(SwingConstants.CENTER);
		textField_114.setEditable(false);
		textField_114.setColumns(10);
		panel_57.add(textField_114);

		textField_115 = new JTextField();
		textField_115.setHorizontalAlignment(SwingConstants.CENTER);
		textField_115.setColumns(10);
		panel_57.add(textField_115);

		textField_116 = new JTextField();
		textField_116.setHorizontalAlignment(SwingConstants.CENTER);
		textField_116.setEditable(false);
		textField_116.setColumns(10);
		panel_57.add(textField_116);

		textField_117 = new JTextField();
		textField_117.setHorizontalAlignment(SwingConstants.CENTER);
		textField_117.setColumns(10);
		panel_57.add(textField_117);

		textField_118 = new JTextField();
		textField_118.setHorizontalAlignment(SwingConstants.CENTER);
		textField_118.setEditable(false);
		textField_118.setColumns(10);
		panel_57.add(textField_118);

		textField_119 = new JTextField();
		textField_119.setHorizontalAlignment(SwingConstants.CENTER);
		textField_119.setColumns(10);
		panel_57.add(textField_119);

		textField_120 = new JTextField();
		textField_120.setHorizontalAlignment(SwingConstants.CENTER);
		textField_120.setEditable(false);
		textField_120.setColumns(10);
		panel_57.add(textField_120);

		textField_121 = new JTextField();
		textField_121.setHorizontalAlignment(SwingConstants.CENTER);
		textField_121.setColumns(10);
		panel_57.add(textField_121);

		textField_126 = new JTextField();
		textField_126.setHorizontalAlignment(SwingConstants.CENTER);
		textField_126.setEditable(false);
		textField_126.setColumns(10);
		panel_57.add(textField_126);

		textField_127 = new JTextField();
		textField_127.setHorizontalAlignment(SwingConstants.CENTER);
		textField_127.setColumns(10);
		panel_57.add(textField_127);

		JPanel panel_58 = new JPanel();
		panel_58.setBounds(248, 124, 162, 100);
		panel_49.add(panel_58);
		panel_58.setLayout(new GridLayout(5, 1, 0, 0));

		textField_122 = new JTextField();
		textField_122.setColumns(10);
		panel_58.add(textField_122);

		textField_123 = new JTextField();
		textField_123.setColumns(10);
		panel_58.add(textField_123);

		textField_124 = new JTextField();
		textField_124.setColumns(10);
		panel_58.add(textField_124);

		textField_128 = new JTextField();
		textField_128.setColumns(10);
		panel_58.add(textField_128);

		textField_125 = new JTextField();
		textField_125.setColumns(10);
		panel_58.add(textField_125);

		JPanel panelLab2 = new JPanel();
		tabbedPane.addTab("2.-  MM laboratorio-1", null, panelLab2, null);
		panelLab2.setLayout(null);

		JPanel panel_59 = new JPanel();
		panel_59.setLayout(null);
		panel_59.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_59.setBounds(10, 11, 490, 96);
		panelLab2.add(panel_59);

		JPanel panel_60 = new JPanel();
		panel_60.setBounds(2, 14, 252, 80);
		panel_59.add(panel_60);
		panel_60.setLayout(new GridLayout(4, 1, 0, 0));

		JLabel label_40 = new JLabel("Paneles EPS pared -   ( 1x3x0,09x0,09 m)");
		label_40.setHorizontalAlignment(SwingConstants.RIGHT);
		label_40.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_60.add(label_40);

		JLabel label_41 = new JLabel("Paneles EPS pared -   ( 1x0,90x0,90 m)");
		label_41.setHorizontalAlignment(SwingConstants.RIGHT);
		label_41.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_60.add(label_41);

		JLabel label_42 = new JLabel("Paneles EPS pared -   ( 1x1,10x0,09 m)");
		label_42.setHorizontalAlignment(SwingConstants.RIGHT);
		label_42.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_60.add(label_42);

		JLabel label_43 = new JLabel("Paneles EPS pared -   ( 1x0,80x0,09 m)");
		label_43.setHorizontalAlignment(SwingConstants.RIGHT);
		label_43.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_60.add(label_43);

		JPanel panel_61 = new JPanel();
		panel_61.setBounds(260, 14, 50, 80);
		panel_59.add(panel_61);
		panel_61.setLayout(new GridLayout(4, 2, 0, 0));

		textField_129 = new JTextField();
		textField_129.setHorizontalAlignment(SwingConstants.CENTER);
		textField_129.setEditable(false);
		textField_129.setColumns(10);
		panel_61.add(textField_129);

		textField_130 = new JTextField();
		textField_130.setHorizontalAlignment(SwingConstants.CENTER);
		textField_130.setColumns(10);
		panel_61.add(textField_130);

		textField_131 = new JTextField();
		textField_131.setHorizontalAlignment(SwingConstants.CENTER);
		textField_131.setEditable(false);
		textField_131.setColumns(10);
		panel_61.add(textField_131);

		textField_132 = new JTextField();
		textField_132.setHorizontalAlignment(SwingConstants.CENTER);
		textField_132.setColumns(10);
		panel_61.add(textField_132);

		textField_133 = new JTextField();
		textField_133.setHorizontalAlignment(SwingConstants.CENTER);
		textField_133.setEditable(false);
		textField_133.setColumns(10);
		panel_61.add(textField_133);

		textField_134 = new JTextField();
		textField_134.setHorizontalAlignment(SwingConstants.CENTER);
		textField_134.setColumns(10);
		panel_61.add(textField_134);

		textField_135 = new JTextField();
		textField_135.setHorizontalAlignment(SwingConstants.CENTER);
		textField_135.setEditable(false);
		textField_135.setColumns(10);
		panel_61.add(textField_135);

		textField_136 = new JTextField();
		textField_136.setHorizontalAlignment(SwingConstants.CENTER);
		textField_136.setColumns(10);
		panel_61.add(textField_136);

		JPanel panel_62 = new JPanel();
		panel_62.setBounds(315, 14, 170, 80);
		panel_59.add(panel_62);
		panel_62.setLayout(new GridLayout(4, 1, 0, 0));

		textField_137 = new JTextField();
		textField_137.setColumns(10);
		panel_62.add(textField_137);

		textField_138 = new JTextField();
		textField_138.setColumns(10);
		panel_62.add(textField_138);

		textField_139 = new JTextField();
		textField_139.setColumns(10);
		panel_62.add(textField_139);

		textField_140 = new JTextField();
		textField_140.setColumns(10);
		panel_62.add(textField_140);

		JLabel label_45 = new JLabel("Cantidad");
		label_45.setHorizontalAlignment(SwingConstants.LEFT);
		label_45.setFont(new Font("Arial", Font.BOLD, 11));
		label_45.setBounds(263, 0, 50, 14);
		panel_59.add(label_45);

		JLabel label_46 = new JLabel("Observación/Referencia");
		label_46.setHorizontalAlignment(SwingConstants.LEFT);
		label_46.setFont(new Font("Arial", Font.BOLD, 11));
		label_46.setBounds(315, 0, 159, 14);
		panel_59.add(label_46);

		JLabel label_44 = new JLabel("FACHADA FRONTAL");
		label_44.setHorizontalAlignment(SwingConstants.CENTER);
		label_44.setFont(new Font("Arial", Font.BOLD, 11));
		label_44.setBounds(2, 0, 129, 14);
		panel_59.add(label_44);

		JPanel panel_63 = new JPanel();
		panel_63.setLayout(null);
		panel_63.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_63.setBounds(10, 113, 490, 80);
		panelLab2.add(panel_63);

		JPanel panel_64 = new JPanel();
		panel_64.setBounds(2, 14, 253, 60);
		panel_63.add(panel_64);
		panel_64.setLayout(new GridLayout(3, 1, 0, 0));

		JLabel label_14 = new JLabel("Paneles EPS pared -   ( 1x2,70 x0,90  m)");
		label_14.setHorizontalAlignment(SwingConstants.RIGHT);
		label_14.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_64.add(label_14);

		JLabel label_15 = new JLabel("Paneles EPS pared -   ( 1x1,10 x0,90  m)");
		label_15.setHorizontalAlignment(SwingConstants.RIGHT);
		label_15.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_64.add(label_15);

		JLabel label_47 = new JLabel("Paneles EPS pared -   ( 1x0,50 x0,90  m)");
		label_47.setHorizontalAlignment(SwingConstants.RIGHT);
		label_47.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_64.add(label_47);

		JPanel panel_65 = new JPanel();
		panel_65.setBounds(260, 14, 50, 60);
		panel_63.add(panel_65);
		panel_65.setLayout(new GridLayout(3, 2, 0, 0));

		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		panel_65.add(textField_12);

		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setColumns(10);
		panel_65.add(textField_13);

		textField_14 = new JTextField();
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		panel_65.add(textField_14);

		textField_15 = new JTextField();
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setColumns(10);
		panel_65.add(textField_15);

		textField_16 = new JTextField();
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		panel_65.add(textField_16);

		textField_17 = new JTextField();
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setColumns(10);
		panel_65.add(textField_17);

		JPanel panel_66 = new JPanel();
		panel_66.setBounds(315, 14, 170, 60);
		panel_63.add(panel_66);
		panel_66.setLayout(new GridLayout(3, 1, 0, 0));

		textField_143 = new JTextField();
		textField_143.setColumns(10);
		panel_66.add(textField_143);

		textField_144 = new JTextField();
		textField_144.setColumns(10);
		panel_66.add(textField_144);

		textField_145 = new JTextField();
		textField_145.setColumns(10);
		panel_66.add(textField_145);

		JLabel label_49 = new JLabel("Cantidad");
		label_49.setHorizontalAlignment(SwingConstants.LEFT);
		label_49.setFont(new Font("Arial", Font.BOLD, 11));
		label_49.setBounds(260, 0, 60, 14);
		panel_63.add(label_49);

		JLabel label_50 = new JLabel("Observación/Referencia");
		label_50.setHorizontalAlignment(SwingConstants.LEFT);
		label_50.setFont(new Font("Arial", Font.BOLD, 11));
		label_50.setBounds(315, 0, 190, 14);
		panel_63.add(label_50);

		JLabel label_51 = new JLabel("FACHADA POSTERIOR");
		label_51.setHorizontalAlignment(SwingConstants.CENTER);
		label_51.setFont(new Font("Arial", Font.BOLD, 11));
		label_51.setBounds(2, 0, 129, 14);
		panel_63.add(label_51);

		JPanel panel_67 = new JPanel();
		panel_67.setLayout(null);
		panel_67.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_67.setBounds(10, 198, 490, 36);
		panelLab2.add(panel_67);

		JPanel panel_68 = new JPanel();
		panel_68.setBounds(2, 14, 250, 20);
		panel_67.add(panel_68);
		panel_68.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel label_11 = new JLabel("Panel Hvar- pared laterales izq (libre)");
		label_11.setHorizontalAlignment(SwingConstants.RIGHT);
		label_11.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_68.add(label_11);

		JPanel panel_69 = new JPanel();
		panel_69.setBounds(258, 14, 50, 20);
		panel_67.add(panel_69);
		panel_69.setLayout(new GridLayout(1, 2, 0, 0));

		textField_18 = new JTextField();
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		panel_69.add(textField_18);

		textField_19 = new JTextField();
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setColumns(10);
		panel_69.add(textField_19);

		JPanel panel_70 = new JPanel();
		panel_70.setBounds(315, 14, 170, 20);
		panel_67.add(panel_70);
		panel_70.setLayout(new GridLayout(1, 1, 0, 0));

		textField_20 = new JTextField();
		textField_20.setColumns(10);
		panel_70.add(textField_20);

		JLabel label_20 = new JLabel("Cantidad");
		label_20.setHorizontalAlignment(SwingConstants.LEFT);
		label_20.setFont(new Font("Arial", Font.BOLD, 11));
		label_20.setBounds(258, 0, 60, 14);
		panel_67.add(label_20);

		JLabel label_48 = new JLabel("Observación/Referencia");
		label_48.setHorizontalAlignment(SwingConstants.LEFT);
		label_48.setFont(new Font("Arial", Font.BOLD, 11));
		label_48.setBounds(314, 0, 190, 14);
		panel_67.add(label_48);

		JLabel label_52 = new JLabel("FACHADA LATERAL");
		label_52.setHorizontalAlignment(SwingConstants.CENTER);
		label_52.setFont(new Font("Arial", Font.BOLD, 11));
		label_52.setBounds(2, 0, 129, 14);
		panel_67.add(label_52);

		textField_24 = new JTextField();
		textField_24.setBounds(318, 14, 170, 20);
		panel_67.add(textField_24);
		textField_24.setColumns(10);

		JPanel panel_71 = new JPanel();
		panel_71.setLayout(null);
		panel_71.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_71.setBounds(10, 239, 490, 96);
		panelLab2.add(panel_71);

		JPanel panel_72 = new JPanel();
		panel_72.setBounds(2, 14, 252, 80);
		panel_71.add(panel_72);
		panel_72.setLayout(new GridLayout(4, 1, 0, 0));

		JLabel label_16 = new JLabel("Paneles EPS pared -   ( 1x3x0,09x0,09 m)");
		label_16.setHorizontalAlignment(SwingConstants.RIGHT);
		label_16.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_72.add(label_16);

		JLabel label_19 = new JLabel("Paneles EPS pared -   ( 1x0,90x0,90 m)");
		label_19.setHorizontalAlignment(SwingConstants.RIGHT);
		label_19.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_72.add(label_19);

		JLabel label_53 = new JLabel("Paneles EPS pared -   ( 1x1,10x0,09 m)");
		label_53.setHorizontalAlignment(SwingConstants.RIGHT);
		label_53.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_72.add(label_53);

		JLabel label_54 = new JLabel("Paneles EPS pared -   ( 1x0,80x0,09 m)");
		label_54.setHorizontalAlignment(SwingConstants.RIGHT);
		label_54.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_72.add(label_54);

		JPanel panel_73 = new JPanel();
		panel_73.setBounds(260, 14, 50, 80);
		panel_71.add(panel_73);
		panel_73.setLayout(new GridLayout(4, 2, 0, 0));

		textField_21 = new JTextField();
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		panel_73.add(textField_21);

		textField_22 = new JTextField();
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setColumns(10);
		panel_73.add(textField_22);

		textField_23 = new JTextField();
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		panel_73.add(textField_23);

		textField_25 = new JTextField();
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setColumns(10);
		panel_73.add(textField_25);

		textField_26 = new JTextField();
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26.setEditable(false);
		textField_26.setColumns(10);
		panel_73.add(textField_26);

		textField_141 = new JTextField();
		textField_141.setHorizontalAlignment(SwingConstants.CENTER);
		textField_141.setColumns(10);
		panel_73.add(textField_141);

		textField_142 = new JTextField();
		textField_142.setHorizontalAlignment(SwingConstants.CENTER);
		textField_142.setEditable(false);
		textField_142.setColumns(10);
		panel_73.add(textField_142);

		textField_146 = new JTextField();
		textField_146.setHorizontalAlignment(SwingConstants.CENTER);
		textField_146.setColumns(10);
		panel_73.add(textField_146);

		JPanel panel_74 = new JPanel();
		panel_74.setBounds(315, 14, 170, 80);
		panel_71.add(panel_74);
		panel_74.setLayout(new GridLayout(4, 1, 0, 0));

		textField_147 = new JTextField();
		textField_147.setColumns(10);
		panel_74.add(textField_147);

		textField_148 = new JTextField();
		textField_148.setColumns(10);
		panel_74.add(textField_148);

		textField_149 = new JTextField();
		textField_149.setColumns(10);
		panel_74.add(textField_149);

		textField_150 = new JTextField();
		textField_150.setColumns(10);
		panel_74.add(textField_150);

		JLabel label_55 = new JLabel("Cantidad");
		label_55.setHorizontalAlignment(SwingConstants.LEFT);
		label_55.setFont(new Font("Arial", Font.BOLD, 11));
		label_55.setBounds(260, 0, 60, 14);
		panel_71.add(label_55);

		JLabel label_56 = new JLabel("Observación/Referencia");
		label_56.setHorizontalAlignment(SwingConstants.LEFT);
		label_56.setFont(new Font("Arial", Font.BOLD, 11));
		label_56.setBounds(315, 0, 190, 14);
		panel_71.add(label_56);

		JLabel label_57 = new JLabel("FACHADA FRONTAL");
		label_57.setHorizontalAlignment(SwingConstants.CENTER);
		label_57.setFont(new Font("Arial", Font.BOLD, 11));
		label_57.setBounds(2, 0, 129, 14);
		panel_71.add(label_57);

		JPanel panel_75 = new JPanel();
		panel_75.setLayout(null);
		panel_75.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_75.setBounds(520, 11, 749, 259);
		panelLab2.add(panel_75);

		JPanel panel_76 = new JPanel();
		panel_76.setBounds(2, 14, 335, 240);
		panel_75.add(panel_76);
		panel_76.setLayout(new GridLayout(12, 1, 0, 0));

		JLabel label_58 = new JLabel("Dados cimentación");
		label_58.setHorizontalAlignment(SwingConstants.RIGHT);
		label_58.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_76.add(label_58);

		JLabel label_59 = new JLabel("Perfil SF Tipo 1");
		label_59.setHorizontalAlignment(SwingConstants.RIGHT);
		label_59.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_76.add(label_59);

		JLabel label_60 = new JLabel("Perfil SF Tipo 2");
		label_60.setHorizontalAlignment(SwingConstants.RIGHT);
		label_60.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_76.add(label_60);

		JLabel label_61 = new JLabel("Perfil SF Tipo 5");
		label_61.setHorizontalAlignment(SwingConstants.RIGHT);
		label_61.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_76.add(label_61);

		JLabel label_64 = new JLabel("Perfil SF Tipo 3");
		label_64.setHorizontalAlignment(SwingConstants.RIGHT);
		label_64.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_76.add(label_64);

		JLabel label_65 = new JLabel("Perfil SF Tipo 4");
		label_65.setHorizontalAlignment(SwingConstants.RIGHT);
		label_65.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_76.add(label_65);

		JLabel label_66 = new JLabel("Perfil SF Tipo 6");
		label_66.setHorizontalAlignment(SwingConstants.RIGHT);
		label_66.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_76.add(label_66);

		JLabel label_67 = new JLabel("Perfil SF Tipo 7");
		label_67.setHorizontalAlignment(SwingConstants.RIGHT);
		label_67.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_76.add(label_67);

		JLabel label_68 = new JLabel("Perfil SF Tipo 8");
		label_68.setHorizontalAlignment(SwingConstants.RIGHT);
		label_68.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_76.add(label_68);

		JLabel label_69 = new JLabel("Perfil SF Tipo 9");
		label_69.setHorizontalAlignment(SwingConstants.RIGHT);
		label_69.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_76.add(label_69);

		JLabel label_70 = new JLabel("Perfil SF Tipo 10");
		label_70.setHorizontalAlignment(SwingConstants.RIGHT);
		label_70.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_76.add(label_70);

		JLabel label_71 = new JLabel("Perfil SF Tipo 11");
		label_71.setHorizontalAlignment(SwingConstants.RIGHT);
		label_71.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_76.add(label_71);

		JPanel panel_77 = new JPanel();
		panel_77.setBounds(365, 14, 50, 240);
		panel_75.add(panel_77);
		panel_77.setLayout(new GridLayout(12, 2, 0, 0));

		textField_151 = new JTextField();
		textField_151.setHorizontalAlignment(SwingConstants.CENTER);
		textField_151.setEditable(false);
		textField_151.setColumns(10);
		panel_77.add(textField_151);

		textField_152 = new JTextField();
		textField_152.setHorizontalAlignment(SwingConstants.CENTER);
		textField_152.setColumns(10);
		panel_77.add(textField_152);

		textField_153 = new JTextField();
		textField_153.setHorizontalAlignment(SwingConstants.CENTER);
		textField_153.setEditable(false);
		textField_153.setColumns(10);
		panel_77.add(textField_153);

		textField_154 = new JTextField();
		textField_154.setHorizontalAlignment(SwingConstants.CENTER);
		textField_154.setColumns(10);
		panel_77.add(textField_154);

		textField_155 = new JTextField();
		textField_155.setHorizontalAlignment(SwingConstants.CENTER);
		textField_155.setEditable(false);
		textField_155.setColumns(10);
		panel_77.add(textField_155);

		textField_156 = new JTextField();
		textField_156.setHorizontalAlignment(SwingConstants.CENTER);
		textField_156.setColumns(10);
		panel_77.add(textField_156);

		textField_157 = new JTextField();
		textField_157.setHorizontalAlignment(SwingConstants.CENTER);
		textField_157.setEditable(false);
		textField_157.setColumns(10);
		panel_77.add(textField_157);

		textField_158 = new JTextField();
		textField_158.setHorizontalAlignment(SwingConstants.CENTER);
		textField_158.setColumns(10);
		panel_77.add(textField_158);

		textField_163 = new JTextField();
		textField_163.setHorizontalAlignment(SwingConstants.CENTER);
		textField_163.setEditable(false);
		textField_163.setColumns(10);
		panel_77.add(textField_163);

		textField_164 = new JTextField();
		textField_164.setHorizontalAlignment(SwingConstants.CENTER);
		textField_164.setColumns(10);
		panel_77.add(textField_164);

		textField_165 = new JTextField();
		textField_165.setHorizontalAlignment(SwingConstants.CENTER);
		textField_165.setEditable(false);
		textField_165.setColumns(10);
		panel_77.add(textField_165);

		textField_166 = new JTextField();
		textField_166.setHorizontalAlignment(SwingConstants.CENTER);
		textField_166.setColumns(10);
		panel_77.add(textField_166);

		textField_167 = new JTextField();
		textField_167.setHorizontalAlignment(SwingConstants.CENTER);
		textField_167.setEditable(false);
		textField_167.setColumns(10);
		panel_77.add(textField_167);

		textField_168 = new JTextField();
		textField_168.setHorizontalAlignment(SwingConstants.CENTER);
		textField_168.setColumns(10);
		panel_77.add(textField_168);

		textField_169 = new JTextField();
		textField_169.setHorizontalAlignment(SwingConstants.CENTER);
		textField_169.setEditable(false);
		textField_169.setColumns(10);
		panel_77.add(textField_169);

		textField_170 = new JTextField();
		textField_170.setHorizontalAlignment(SwingConstants.CENTER);
		textField_170.setColumns(10);
		panel_77.add(textField_170);

		textField_171 = new JTextField();
		textField_171.setHorizontalAlignment(SwingConstants.CENTER);
		textField_171.setEditable(false);
		textField_171.setColumns(10);
		panel_77.add(textField_171);

		textField_172 = new JTextField();
		textField_172.setHorizontalAlignment(SwingConstants.CENTER);
		textField_172.setColumns(10);
		panel_77.add(textField_172);

		textField_173 = new JTextField();
		textField_173.setHorizontalAlignment(SwingConstants.CENTER);
		textField_173.setEditable(false);
		textField_173.setColumns(10);
		panel_77.add(textField_173);

		textField_174 = new JTextField();
		textField_174.setHorizontalAlignment(SwingConstants.CENTER);
		textField_174.setColumns(10);
		panel_77.add(textField_174);

		textField_27 = new JTextField();
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27.setEditable(false);
		textField_27.setColumns(10);
		panel_77.add(textField_27);

		textField_28 = new JTextField();
		textField_28.setHorizontalAlignment(SwingConstants.CENTER);
		textField_28.setColumns(10);
		panel_77.add(textField_28);

		textField_30 = new JTextField();
		textField_30.setHorizontalAlignment(SwingConstants.CENTER);
		textField_30.setEditable(false);
		textField_30.setColumns(10);
		panel_77.add(textField_30);

		textField_29 = new JTextField();
		textField_29.setHorizontalAlignment(SwingConstants.CENTER);
		textField_29.setColumns(10);
		panel_77.add(textField_29);

		JPanel panel_78 = new JPanel();
		panel_78.setBounds(439, 14, 300, 240);
		panel_75.add(panel_78);
		panel_78.setLayout(new GridLayout(12, 1, 0, 0));

		textField_159 = new JTextField();
		textField_159.setColumns(10);
		panel_78.add(textField_159);

		textField_160 = new JTextField();
		textField_160.setColumns(10);
		panel_78.add(textField_160);

		textField_161 = new JTextField();
		textField_161.setColumns(10);
		panel_78.add(textField_161);

		textField_31 = new JTextField();
		textField_31.setColumns(10);
		panel_78.add(textField_31);

		textField_32 = new JTextField();
		textField_32.setColumns(10);
		panel_78.add(textField_32);

		textField_33 = new JTextField();
		textField_33.setColumns(10);
		panel_78.add(textField_33);

		textField_34 = new JTextField();
		textField_34.setColumns(10);
		panel_78.add(textField_34);

		textField_35 = new JTextField();
		textField_35.setColumns(10);
		panel_78.add(textField_35);

		textField_36 = new JTextField();
		textField_36.setColumns(10);
		panel_78.add(textField_36);

		textField_37 = new JTextField();
		textField_37.setColumns(10);
		panel_78.add(textField_37);

		textField_38 = new JTextField();
		textField_38.setColumns(10);
		panel_78.add(textField_38);

		textField_162 = new JTextField();
		textField_162.setColumns(10);
		panel_78.add(textField_162);

		JLabel label_62 = new JLabel("Cantidad");
		label_62.setHorizontalAlignment(SwingConstants.LEFT);
		label_62.setFont(new Font("Arial", Font.BOLD, 11));
		label_62.setBounds(365, 0, 60, 14);
		panel_75.add(label_62);

		JLabel label_63 = new JLabel("Observación/Referencia");
		label_63.setHorizontalAlignment(SwingConstants.LEFT);
		label_63.setFont(new Font("Arial", Font.BOLD, 11));
		label_63.setBounds(439, 0, 300, 14);
		panel_75.add(label_63);

		JLabel lblComponenteEstructural_1 = new JLabel("   COMPONENTE ESTRUCTURAL");
		lblComponenteEstructural_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblComponenteEstructural_1.setFont(new Font("Arial", Font.BOLD, 11));
		lblComponenteEstructural_1.setBounds(2, 0, 203, 14);

		panel_75.add(lblComponenteEstructural_1);

		InformacionObligatoriaV infoObligatoria = new InformacionObligatoriaV(860, 300);
		panelLab2.add(infoObligatoria.getPnlInformacionObl());
	}
}
