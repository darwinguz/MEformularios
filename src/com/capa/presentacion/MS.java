package com.capa.presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class MS extends JFrame {

	private JPanel contentPane;
	private JTextField txtCantidadHumo1;
	private JTextField txtCantidadHumo2;
	private JTextField txtCantidadKit2;
	private JTextField txtCantidadKit1;
	private JTextField txtCantidadInterruptor1;
	private JTextField txtCantidadInterruptor2;
	private JTextField txtCantidadToma2;
	private JTextField txtCantidadToma1;
	private JTextField txtCantidadlumi1;
	private JTextField txtCantidadlumi2;
	private JTextField txtRefLumi;
	private JTextField txtRefToma;
	private JTextField txtRefInterruptor;
	private JTextField txtRefKit;
	private JTextField txtRefHumo;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_4;
	private JTextField txtCantidadCanal1;
	private JTextField txtCantidadCanal2;
	private JTextField txtRefCanal;
	private JLabel label_5;
	private JLabel label_8;
	private JTextField txtCantidadAcce1;
	private JTextField txtCantidadAcce2;
	private JTextField txtRefAcce;
	private JLabel label_9;
	private JTextField txtCantidadTub1;
	private JTextField txtCantidadTub2;
	private JTextField txtRefTub;
	private JLabel lblTuberaDePvc;
	private JTextField txtCantidadPVC1;
	private JTextField txtCantidadPVC2;
	private JTextField txtRefPVC;
	private JLabel label_11;
	private JTextField txtCantidadConex1;
	private JTextField txtCantidadConex2;
	private JTextField txtRefConex;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_10;
	private JLabel label_12;
	private JLabel lblventanaCorrederaCompuesta;
	private JLabel lblPerfilSfTipo;
	private JTextField txtCantidadPerfil1;
	private JTextField txtCantidadVentana1;
	private JTextField txtCantidadSF1;
	private JTextField txtCantidadBisagras1;
	private JTextField txtCantidadPuerta1;
	private JLabel label_15;
	private JTextField txtCantidadPuerta2;
	private JTextField txtCantidadBisagras2;
	private JTextField txtCantidadSF2;
	private JTextField txtCantidadVentana2;
	private JTextField txtCantidadPerfil2;
	private JTextField txtRefPerfil;
	private JTextField txtRefVentana;
	private JTextField textField_12;
	private JTextField txtRefBisagras;
	private JTextField txtRefPuerta;
	private JLabel label_16;
	private JLabel label_13;
	private JLabel lblPerfilSfTipo_1;
	private JLabel lblPanelesTcbx;
	private JLabel lblPanelesVynilPiso;
	private JTextField txtCantidadVynil1;
	private JTextField txtCantidadTCB1;
	private JTextField txtCantidadMS1;
	private JLabel label_19;
	private JTextField txtCantidadMS2;
	private JTextField txtCantidadTCB2;
	private JTextField txtCantidadVynil2;
	private JTextField txtRefVynil;
	private JTextField txtRefTCB;
	private JTextField txtRefMS;
	private JLabel label_20;
	private JLabel lblPanelesEpsPara;
	private JTextField txtCantidadEPS1;
	private JTextField txtCantidadEPS2;
	private JTextField txtRefEPS;
	private JLabel label_14;
	private JLabel label_17;
	private JLabel label_18;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel label_23;
	private JLabel label_24;
	private JLabel label_25;
	private JLabel label_26;
	private JLabel label_27;
	private JLabel label_28;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel label_29;
	private JLabel label_30;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JLabel label_31;
	private JLabel label_32;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JLabel label_33;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JLabel label_34;
	private JLabel label_35;
	private JLabel label_36;
	private JLabel label_37;
	private JLabel label_38;
	private JLabel label_39;
	private JLabel label_40;
	private JLabel label_41;
	private JLabel label_42;
	private JLabel label_43;
	private JLabel label_44;
	private JLabel label_45;
	private JLabel label_46;
	private JLabel label_47;
	private JLabel label_48;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JLabel label_49;
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
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JLabel lblCercha;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MS frame = new MS();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MS() {
		setTitle("MS_1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1550, 827);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());
		contentPane.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new TitledBorder(null, "1- MS Sal\u00F3n de Uso M\u00FAltiple-1", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel1.setBounds(10, 127, 1491, 650);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JLabel lblKitElctrico = new JLabel("KIT EL\u00C9CTRICO");
		lblKitElctrico.setHorizontalAlignment(SwingConstants.CENTER);
		lblKitElctrico.setFont(new Font("Arial", Font.BOLD, 11));
		lblKitElctrico.setBounds(10, 31, 203, 14);
		panel1.add(lblKitElctrico);
		
		JLabel lblLuminariasLed = new JLabel("Luminarias LED 60 w - 5000 lum");
		lblLuminariasLed.setHorizontalAlignment(SwingConstants.LEFT);
		lblLuminariasLed.setFont(new Font("Arial", Font.PLAIN, 11));
		lblLuminariasLed.setBounds(10, 56, 203, 14);
		panel1.add(lblLuminariasLed);
		
		JLabel lblTomacorrientes = new JLabel("Tomacorrientes");
		lblTomacorrientes.setHorizontalAlignment(SwingConstants.LEFT);
		lblTomacorrientes.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTomacorrientes.setBounds(10, 78, 203, 14);
		panel1.add(lblTomacorrientes);
		
		JLabel lblInterruptor = new JLabel("Interruptor");
		lblInterruptor.setHorizontalAlignment(SwingConstants.LEFT);
		lblInterruptor.setFont(new Font("Arial", Font.PLAIN, 11));
		lblInterruptor.setBounds(10, 100, 203, 14);
		panel1.add(lblInterruptor);
		
		JLabel lblKitCableElctrico = new JLabel("Kit cable el\u00E9ctrico MA");
		lblKitCableElctrico.setHorizontalAlignment(SwingConstants.LEFT);
		lblKitCableElctrico.setFont(new Font("Arial", Font.PLAIN, 11));
		lblKitCableElctrico.setBounds(10, 122, 203, 14);
		panel1.add(lblKitCableElctrico);
		
		JLabel lblDetectorDeHumo = new JLabel("Detector de humo");
		lblDetectorDeHumo.setHorizontalAlignment(SwingConstants.LEFT);
		lblDetectorDeHumo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDetectorDeHumo.setBounds(10, 144, 203, 14);
		panel1.add(lblDetectorDeHumo);
		
		txtCantidadHumo1 = new JTextField();
		txtCantidadHumo1.setColumns(10);
		txtCantidadHumo1.setBounds(223, 141, 35, 20);
		panel1.add(txtCantidadHumo1);
		
		txtCantidadHumo2 = new JTextField();
		txtCantidadHumo2.setColumns(10);
		txtCantidadHumo2.setBounds(260, 141, 35, 20);
		panel1.add(txtCantidadHumo2);
		
		txtCantidadKit2 = new JTextField();
		txtCantidadKit2.setColumns(10);
		txtCantidadKit2.setBounds(260, 119, 35, 20);
		panel1.add(txtCantidadKit2);
		
		txtCantidadKit1 = new JTextField();
		txtCantidadKit1.setColumns(10);
		txtCantidadKit1.setBounds(223, 119, 35, 20);
		panel1.add(txtCantidadKit1);
		
		txtCantidadInterruptor1 = new JTextField();
		txtCantidadInterruptor1.setColumns(10);
		txtCantidadInterruptor1.setBounds(223, 97, 35, 20);
		panel1.add(txtCantidadInterruptor1);
		
		txtCantidadInterruptor2 = new JTextField();
		txtCantidadInterruptor2.setColumns(10);
		txtCantidadInterruptor2.setBounds(260, 97, 35, 20);
		panel1.add(txtCantidadInterruptor2);
		
		txtCantidadToma2 = new JTextField();
		txtCantidadToma2.setColumns(10);
		txtCantidadToma2.setBounds(260, 75, 35, 20);
		panel1.add(txtCantidadToma2);
		
		txtCantidadToma1 = new JTextField();
		txtCantidadToma1.setColumns(10);
		txtCantidadToma1.setBounds(223, 75, 35, 20);
		panel1.add(txtCantidadToma1);
		
		txtCantidadlumi1 = new JTextField();
		txtCantidadlumi1.setColumns(10);
		txtCantidadlumi1.setBounds(223, 53, 35, 20);
		panel1.add(txtCantidadlumi1);
		
		txtCantidadlumi2 = new JTextField();
		txtCantidadlumi2.setColumns(10);
		txtCantidadlumi2.setBounds(260, 53, 35, 20);
		panel1.add(txtCantidadlumi2);
		
		JLabel label_6 = new JLabel("Cantidad");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Arial", Font.BOLD, 11));
		label_6.setBounds(226, 31, 63, 14);
		panel1.add(label_6);
		
		JLabel label_7 = new JLabel("Observaci\u00F3n/Referencia");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Arial", Font.BOLD, 11));
		label_7.setBounds(312, 31, 153, 14);
		panel1.add(label_7);
		
		txtRefLumi = new JTextField();
		txtRefLumi.setColumns(10);
		txtRefLumi.setBounds(305, 53, 167, 20);
		panel1.add(txtRefLumi);
		
		txtRefToma = new JTextField();
		txtRefToma.setColumns(10);
		txtRefToma.setBounds(305, 75, 167, 20);
		panel1.add(txtRefToma);
		
		txtRefInterruptor = new JTextField();
		txtRefInterruptor.setColumns(10);
		txtRefInterruptor.setBounds(305, 97, 167, 20);
		panel1.add(txtRefInterruptor);
		
		txtRefKit = new JTextField();
		txtRefKit.setColumns(10);
		txtRefKit.setBounds(305, 119, 167, 20);
		panel1.add(txtRefKit);
		
		txtRefHumo = new JTextField();
		txtRefHumo.setColumns(10);
		txtRefHumo.setBounds(305, 141, 167, 20);
		panel1.add(txtRefHumo);
		
		label = new JLabel("KIT AGUA LLUVIA");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 11));
		label.setBounds(39, 182, 139, 14);
		panel1.add(label);
		
		label_1 = new JLabel("Canal pl\u00E1stico PVC de L=3m");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("Arial", Font.PLAIN, 11));
		label_1.setBounds(10, 207, 183, 14);
		panel1.add(label_1);
		
		label_4 = new JLabel("Cantidad");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Arial", Font.BOLD, 11));
		label_4.setBounds(226, 182, 63, 14);
		panel1.add(label_4);
		
		txtCantidadCanal1 = new JTextField();
		txtCantidadCanal1.setColumns(10);
		txtCantidadCanal1.setBounds(223, 204, 35, 20);
		panel1.add(txtCantidadCanal1);
		
		txtCantidadCanal2 = new JTextField();
		txtCantidadCanal2.setColumns(10);
		txtCantidadCanal2.setBounds(260, 204, 35, 20);
		panel1.add(txtCantidadCanal2);
		
		txtRefCanal = new JTextField();
		txtRefCanal.setColumns(10);
		txtRefCanal.setBounds(305, 204, 167, 20);
		panel1.add(txtRefCanal);
		
		label_5 = new JLabel("Observaci\u00F3n/Referencia");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Arial", Font.BOLD, 11));
		label_5.setBounds(312, 182, 153, 14);
		panel1.add(label_5);
		
		label_8 = new JLabel("<html><body>Kit de Accesorios de Conexi\u00F3n Agua de<br>Lluvia (2 rejilla, 4 codos 90\u00B0,1/4 gl<br>polipega, tornillos, abrazaderas</body></html>)");
		label_8.setHorizontalAlignment(SwingConstants.LEFT);
		label_8.setFont(new Font("Arial", Font.PLAIN, 11));
		label_8.setBounds(10, 226, 203, 56);
		panel1.add(label_8);
		
		txtCantidadAcce1 = new JTextField();
		txtCantidadAcce1.setColumns(10);
		txtCantidadAcce1.setBounds(223, 247, 35, 20);
		panel1.add(txtCantidadAcce1);
		
		txtCantidadAcce2 = new JTextField();
		txtCantidadAcce2.setColumns(10);
		txtCantidadAcce2.setBounds(260, 247, 35, 20);
		panel1.add(txtCantidadAcce2);
		
		txtRefAcce = new JTextField();
		txtRefAcce.setColumns(10);
		txtRefAcce.setBounds(305, 247, 167, 20);
		panel1.add(txtRefAcce);
		
		label_9 = new JLabel("Tuber\u00EDa de PVC 75 mm L=3m");
		label_9.setHorizontalAlignment(SwingConstants.LEFT);
		label_9.setFont(new Font("Arial", Font.PLAIN, 11));
		label_9.setBounds(10, 284, 183, 14);
		panel1.add(label_9);
		
		txtCantidadTub1 = new JTextField();
		txtCantidadTub1.setColumns(10);
		txtCantidadTub1.setBounds(223, 278, 35, 20);
		panel1.add(txtCantidadTub1);
		
		txtCantidadTub2 = new JTextField();
		txtCantidadTub2.setColumns(10);
		txtCantidadTub2.setBounds(260, 278, 35, 20);
		panel1.add(txtCantidadTub2);
		
		txtRefTub = new JTextField();
		txtRefTub.setColumns(10);
		txtRefTub.setBounds(305, 278, 167, 20);
		panel1.add(txtRefTub);
		
		lblTuberaDePvc = new JLabel("Tuber\u00EDa de PVC 75 mm L=0.6m");
		lblTuberaDePvc.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberaDePvc.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberaDePvc.setBounds(10, 306, 183, 14);
		panel1.add(lblTuberaDePvc);
		
		txtCantidadPVC1 = new JTextField();
		txtCantidadPVC1.setColumns(10);
		txtCantidadPVC1.setBounds(223, 300, 35, 20);
		panel1.add(txtCantidadPVC1);
		
		txtCantidadPVC2 = new JTextField();
		txtCantidadPVC2.setColumns(10);
		txtCantidadPVC2.setBounds(260, 300, 35, 20);
		panel1.add(txtCantidadPVC2);
		
		txtRefPVC = new JTextField();
		txtRefPVC.setColumns(10);
		txtRefPVC.setBounds(305, 300, 167, 20);
		panel1.add(txtRefPVC);
		
		label_11 = new JLabel("<html><body>Kit para conexi\u00F3n de tuber\u00EDa 75 mm. (lija<br>pliego, polipega 1/4gal,1 codo 90\u00B0)</body></html>");
		label_11.setHorizontalAlignment(SwingConstants.LEFT);
		label_11.setFont(new Font("Arial", Font.PLAIN, 11));
		label_11.setBounds(10, 328, 203, 39);
		panel1.add(label_11);
		
		txtCantidadConex1 = new JTextField();
		txtCantidadConex1.setColumns(10);
		txtCantidadConex1.setBounds(223, 336, 35, 20);
		panel1.add(txtCantidadConex1);
		
		txtCantidadConex2 = new JTextField();
		txtCantidadConex2.setColumns(10);
		txtCantidadConex2.setBounds(260, 336, 35, 20);
		panel1.add(txtCantidadConex2);
		
		txtRefConex = new JTextField();
		txtRefConex.setColumns(10);
		txtRefConex.setBounds(305, 336, 167, 20);
		panel1.add(txtRefConex);
		
		label_2 = new JLabel("COMPONENTE ARQUITECT\u00D3NICO");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Arial", Font.BOLD, 11));
		label_2.setBounds(10, 378, 193, 14);
		panel1.add(label_2);
		
		label_3 = new JLabel("Puerta");
		label_3.setVerticalAlignment(SwingConstants.TOP);
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("Arial", Font.PLAIN, 11));
		label_3.setBounds(10, 403, 183, 14);
		panel1.add(label_3);
		
		label_10 = new JLabel("Bisagras");
		label_10.setVerticalAlignment(SwingConstants.TOP);
		label_10.setHorizontalAlignment(SwingConstants.LEFT);
		label_10.setFont(new Font("Arial", Font.PLAIN, 11));
		label_10.setBounds(10, 425, 183, 14);
		panel1.add(label_10);
		
		label_12 = new JLabel("Perfil SF Tipo 12 MA-SF-12 para puerta");
		label_12.setVerticalAlignment(SwingConstants.TOP);
		label_12.setHorizontalAlignment(SwingConstants.LEFT);
		label_12.setFont(new Font("Arial", Font.PLAIN, 11));
		label_12.setBounds(10, 447, 203, 14);
		panel1.add(label_12);
		
		lblventanaCorrederaCompuesta = new JLabel("<html><body>Ventana corredera, compuesta por tres<br>hojas y dos carriles. UPVC con vidrio<br>flotado de 3 mm de 3x1,10</body></html>");
		lblventanaCorrederaCompuesta.setVerticalAlignment(SwingConstants.TOP);
		lblventanaCorrederaCompuesta.setHorizontalAlignment(SwingConstants.LEFT);
		lblventanaCorrederaCompuesta.setFont(new Font("Arial", Font.PLAIN, 11));
		lblventanaCorrederaCompuesta.setBounds(10, 469, 203, 50);
		panel1.add(lblventanaCorrederaCompuesta);
		
		lblPerfilSfTipo = new JLabel("Perfil SF Tipo 12 MA-SF-12 para ventana");
		lblPerfilSfTipo.setVerticalAlignment(SwingConstants.TOP);
		lblPerfilSfTipo.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo.setBounds(10, 522, 203, 14);
		panel1.add(lblPerfilSfTipo);
		
		txtCantidadPerfil1 = new JTextField();
		txtCantidadPerfil1.setColumns(10);
		txtCantidadPerfil1.setBounds(223, 519, 35, 20);
		panel1.add(txtCantidadPerfil1);
		
		txtCantidadVentana1 = new JTextField();
		txtCantidadVentana1.setColumns(10);
		txtCantidadVentana1.setBounds(223, 480, 35, 20);
		panel1.add(txtCantidadVentana1);
		
		txtCantidadSF1 = new JTextField();
		txtCantidadSF1.setColumns(10);
		txtCantidadSF1.setBounds(223, 444, 35, 20);
		panel1.add(txtCantidadSF1);
		
		txtCantidadBisagras1 = new JTextField();
		txtCantidadBisagras1.setColumns(10);
		txtCantidadBisagras1.setBounds(223, 422, 35, 20);
		panel1.add(txtCantidadBisagras1);
		
		txtCantidadPuerta1 = new JTextField();
		txtCantidadPuerta1.setColumns(10);
		txtCantidadPuerta1.setBounds(223, 400, 35, 20);
		panel1.add(txtCantidadPuerta1);
		
		label_15 = new JLabel("Cantidad");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("Arial", Font.BOLD, 11));
		label_15.setBounds(226, 378, 63, 14);
		panel1.add(label_15);
		
		txtCantidadPuerta2 = new JTextField();
		txtCantidadPuerta2.setColumns(10);
		txtCantidadPuerta2.setBounds(260, 400, 35, 20);
		panel1.add(txtCantidadPuerta2);
		
		txtCantidadBisagras2 = new JTextField();
		txtCantidadBisagras2.setColumns(10);
		txtCantidadBisagras2.setBounds(260, 422, 35, 20);
		panel1.add(txtCantidadBisagras2);
		
		txtCantidadSF2 = new JTextField();
		txtCantidadSF2.setColumns(10);
		txtCantidadSF2.setBounds(260, 444, 35, 20);
		panel1.add(txtCantidadSF2);
		
		txtCantidadVentana2 = new JTextField();
		txtCantidadVentana2.setColumns(10);
		txtCantidadVentana2.setBounds(260, 480, 35, 20);
		panel1.add(txtCantidadVentana2);
		
		txtCantidadPerfil2 = new JTextField();
		txtCantidadPerfil2.setColumns(10);
		txtCantidadPerfil2.setBounds(260, 519, 35, 20);
		panel1.add(txtCantidadPerfil2);
		
		txtRefPerfil = new JTextField();
		txtRefPerfil.setColumns(10);
		txtRefPerfil.setBounds(305, 519, 167, 20);
		panel1.add(txtRefPerfil);
		
		txtRefVentana = new JTextField();
		txtRefVentana.setColumns(10);
		txtRefVentana.setBounds(305, 480, 167, 20);
		panel1.add(txtRefVentana);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(305, 444, 167, 20);
		panel1.add(textField_12);
		
		txtRefBisagras = new JTextField();
		txtRefBisagras.setColumns(10);
		txtRefBisagras.setBounds(305, 422, 167, 20);
		panel1.add(txtRefBisagras);
		
		txtRefPuerta = new JTextField();
		txtRefPuerta.setColumns(10);
		txtRefPuerta.setBounds(305, 400, 167, 20);
		panel1.add(txtRefPuerta);
		
		label_16 = new JLabel("Observaci\u00F3n/Referencia");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("Arial", Font.BOLD, 11));
		label_16.setBounds(312, 378, 153, 14);
		panel1.add(label_16);
		
		label_13 = new JLabel("COMPONENTE ARQUITECT\u00D3NICO");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Arial", Font.BOLD, 11));
		label_13.setBounds(497, 31, 193, 14);
		panel1.add(label_13);
		
		lblPerfilSfTipo_1 = new JLabel("Perfil SF Tipo 12 MS-SF-12  para paneles");
		lblPerfilSfTipo_1.setVerticalAlignment(SwingConstants.TOP);
		lblPerfilSfTipo_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_1.setBounds(497, 56, 203, 14);
		panel1.add(lblPerfilSfTipo_1);
		
		lblPanelesTcbx = new JLabel("Paneles TCB (8.8x5.8 m)");
		lblPanelesTcbx.setVerticalAlignment(SwingConstants.TOP);
		lblPanelesTcbx.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesTcbx.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesTcbx.setBounds(497, 78, 183, 14);
		panel1.add(lblPanelesTcbx);
		
		lblPanelesVynilPiso = new JLabel("Paneles vynil piso (0,15x1,93 m)");
		lblPanelesVynilPiso.setVerticalAlignment(SwingConstants.TOP);
		lblPanelesVynilPiso.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesVynilPiso.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesVynilPiso.setBounds(497, 100, 203, 14);
		panel1.add(lblPanelesVynilPiso);
		
		txtCantidadVynil1 = new JTextField();
		txtCantidadVynil1.setColumns(10);
		txtCantidadVynil1.setBounds(710, 97, 35, 20);
		panel1.add(txtCantidadVynil1);
		
		txtCantidadTCB1 = new JTextField();
		txtCantidadTCB1.setColumns(10);
		txtCantidadTCB1.setBounds(710, 75, 35, 20);
		panel1.add(txtCantidadTCB1);
		
		txtCantidadMS1 = new JTextField();
		txtCantidadMS1.setColumns(10);
		txtCantidadMS1.setBounds(710, 53, 35, 20);
		panel1.add(txtCantidadMS1);
		
		label_19 = new JLabel("Cantidad");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("Arial", Font.BOLD, 11));
		label_19.setBounds(713, 31, 63, 14);
		panel1.add(label_19);
		
		txtCantidadMS2 = new JTextField();
		txtCantidadMS2.setColumns(10);
		txtCantidadMS2.setBounds(747, 53, 35, 20);
		panel1.add(txtCantidadMS2);
		
		txtCantidadTCB2 = new JTextField();
		txtCantidadTCB2.setColumns(10);
		txtCantidadTCB2.setBounds(747, 75, 35, 20);
		panel1.add(txtCantidadTCB2);
		
		txtCantidadVynil2 = new JTextField();
		txtCantidadVynil2.setColumns(10);
		txtCantidadVynil2.setBounds(747, 97, 35, 20);
		panel1.add(txtCantidadVynil2);
		
		txtRefVynil = new JTextField();
		txtRefVynil.setColumns(10);
		txtRefVynil.setBounds(792, 97, 167, 20);
		panel1.add(txtRefVynil);
		
		txtRefTCB = new JTextField();
		txtRefTCB.setColumns(10);
		txtRefTCB.setBounds(792, 75, 167, 20);
		panel1.add(txtRefTCB);
		
		txtRefMS = new JTextField();
		txtRefMS.setColumns(10);
		txtRefMS.setBounds(792, 53, 167, 20);
		panel1.add(txtRefMS);
		
		label_20 = new JLabel("Observaci\u00F3n/Referencia");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setFont(new Font("Arial", Font.BOLD, 11));
		label_20.setBounds(799, 31, 153, 14);
		panel1.add(label_20);
		
		lblPanelesEpsPara = new JLabel("Paneles EPS para cubierta I=7, a= 1 m");
		lblPanelesEpsPara.setVerticalAlignment(SwingConstants.TOP);
		lblPanelesEpsPara.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPara.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPara.setBounds(497, 122, 203, 14);
		panel1.add(lblPanelesEpsPara);
		
		txtCantidadEPS1 = new JTextField();
		txtCantidadEPS1.setColumns(10);
		txtCantidadEPS1.setBounds(710, 119, 35, 20);
		panel1.add(txtCantidadEPS1);
		
		txtCantidadEPS2 = new JTextField();
		txtCantidadEPS2.setColumns(10);
		txtCantidadEPS2.setBounds(747, 119, 35, 20);
		panel1.add(txtCantidadEPS2);
		
		txtRefEPS = new JTextField();
		txtRefEPS.setColumns(10);
		txtRefEPS.setBounds(792, 119, 167, 20);
		panel1.add(txtRefEPS);
		
		label_14 = new JLabel("FACHADA FRONTAL");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Arial", Font.BOLD, 11));
		label_14.setBounds(520, 164, 129, 14);
		panel1.add(label_14);
		
		label_17 = new JLabel("Paneles EPS pared -   ( 1x3x0,09x0,09 m)");
		label_17.setHorizontalAlignment(SwingConstants.LEFT);
		label_17.setFont(new Font("Arial", Font.PLAIN, 11));
		label_17.setBounds(497, 189, 203, 14);
		panel1.add(label_17);
		
		label_18 = new JLabel("Paneles EPS pared -   ( 1x0,90x0,90 m)");
		label_18.setHorizontalAlignment(SwingConstants.LEFT);
		label_18.setFont(new Font("Arial", Font.PLAIN, 11));
		label_18.setBounds(497, 211, 203, 14);
		panel1.add(label_18);
		
		label_21 = new JLabel("Paneles EPS pared -   ( 1x1,10x0,09 m)");
		label_21.setHorizontalAlignment(SwingConstants.LEFT);
		label_21.setFont(new Font("Arial", Font.PLAIN, 11));
		label_21.setBounds(497, 233, 203, 14);
		panel1.add(label_21);
		
		label_22 = new JLabel("Paneles EPS pared -   ( 1x0,80x0,09 m)");
		label_22.setHorizontalAlignment(SwingConstants.LEFT);
		label_22.setFont(new Font("Arial", Font.PLAIN, 11));
		label_22.setBounds(497, 255, 203, 14);
		panel1.add(label_22);
		
		label_23 = new JLabel("FACHADA POSTERIOR");
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setFont(new Font("Arial", Font.BOLD, 11));
		label_23.setBounds(520, 293, 129, 14);
		panel1.add(label_23);
		
		label_24 = new JLabel("Paneles EPS pared -   ( 1x2,70 x0,90  m)");
		label_24.setHorizontalAlignment(SwingConstants.LEFT);
		label_24.setFont(new Font("Arial", Font.PLAIN, 11));
		label_24.setBounds(497, 318, 203, 14);
		panel1.add(label_24);
		
		label_25 = new JLabel("Paneles EPS pared -   ( 1x1,10 x0,90  m)");
		label_25.setHorizontalAlignment(SwingConstants.LEFT);
		label_25.setFont(new Font("Arial", Font.PLAIN, 11));
		label_25.setBounds(497, 340, 203, 14);
		panel1.add(label_25);
		
		label_26 = new JLabel("Paneles EPS pared -   ( 1x0,50 x0,90  m)");
		label_26.setHorizontalAlignment(SwingConstants.LEFT);
		label_26.setFont(new Font("Arial", Font.PLAIN, 11));
		label_26.setBounds(497, 362, 203, 14);
		panel1.add(label_26);
		
		label_27 = new JLabel("FACHADA LATERAL");
		label_27.setHorizontalAlignment(SwingConstants.CENTER);
		label_27.setFont(new Font("Arial", Font.BOLD, 11));
		label_27.setBounds(520, 397, 129, 14);
		panel1.add(label_27);
		
		label_28 = new JLabel("Panel Hvar- pared laterales izq (libre)");
		label_28.setHorizontalAlignment(SwingConstants.LEFT);
		label_28.setFont(new Font("Arial", Font.PLAIN, 11));
		label_28.setBounds(497, 422, 203, 14);
		panel1.add(label_28);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(710, 419, 35, 20);
		panel1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(747, 419, 35, 20);
		panel1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(792, 419, 167, 20);
		panel1.add(textField_2);
		
		label_29 = new JLabel("Observaci\u00F3n/Referencia");
		label_29.setHorizontalAlignment(SwingConstants.CENTER);
		label_29.setFont(new Font("Arial", Font.BOLD, 11));
		label_29.setBounds(799, 397, 153, 14);
		panel1.add(label_29);
		
		label_30 = new JLabel("Cantidad");
		label_30.setHorizontalAlignment(SwingConstants.CENTER);
		label_30.setFont(new Font("Arial", Font.BOLD, 11));
		label_30.setBounds(713, 397, 63, 14);
		panel1.add(label_30);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(710, 359, 35, 20);
		panel1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(747, 359, 35, 20);
		panel1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(747, 337, 35, 20);
		panel1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(710, 337, 35, 20);
		panel1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(710, 315, 35, 20);
		panel1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(747, 315, 35, 20);
		panel1.add(textField_8);
		
		label_31 = new JLabel("Cantidad");
		label_31.setHorizontalAlignment(SwingConstants.CENTER);
		label_31.setFont(new Font("Arial", Font.BOLD, 11));
		label_31.setBounds(713, 293, 63, 14);
		panel1.add(label_31);
		
		label_32 = new JLabel("Observaci\u00F3n/Referencia");
		label_32.setHorizontalAlignment(SwingConstants.CENTER);
		label_32.setFont(new Font("Arial", Font.BOLD, 11));
		label_32.setBounds(799, 293, 153, 14);
		panel1.add(label_32);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(792, 315, 167, 20);
		panel1.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(792, 337, 167, 20);
		panel1.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(792, 359, 167, 20);
		panel1.add(textField_11);
		
		label_33 = new JLabel("Cantidad");
		label_33.setHorizontalAlignment(SwingConstants.CENTER);
		label_33.setFont(new Font("Arial", Font.BOLD, 11));
		label_33.setBounds(713, 164, 63, 14);
		panel1.add(label_33);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(710, 186, 35, 20);
		panel1.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(747, 186, 35, 20);
		panel1.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(747, 208, 35, 20);
		panel1.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(710, 208, 35, 20);
		panel1.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(710, 230, 35, 20);
		panel1.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(747, 230, 35, 20);
		panel1.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(747, 252, 35, 20);
		panel1.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(710, 252, 35, 20);
		panel1.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(792, 252, 167, 20);
		panel1.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(792, 230, 167, 20);
		panel1.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(792, 208, 167, 20);
		panel1.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(792, 186, 167, 20);
		panel1.add(textField_24);
		
		label_34 = new JLabel("Observaci\u00F3n/Referencia");
		label_34.setHorizontalAlignment(SwingConstants.CENTER);
		label_34.setFont(new Font("Arial", Font.BOLD, 11));
		label_34.setBounds(799, 164, 153, 14);
		panel1.add(label_34);
		
		label_35 = new JLabel("COMPONENTE ESTRUCTURAL");
		label_35.setHorizontalAlignment(SwingConstants.CENTER);
		label_35.setFont(new Font("Arial", Font.BOLD, 11));
		label_35.setBounds(994, 31, 203, 14);
		panel1.add(label_35);
		
		label_36 = new JLabel("Dados cimentaci\u00F3n");
		label_36.setHorizontalAlignment(SwingConstants.LEFT);
		label_36.setFont(new Font("Arial", Font.PLAIN, 11));
		label_36.setBounds(994, 56, 203, 14);
		panel1.add(label_36);
		
		label_37 = new JLabel("Perfil SF Tipo 1");
		label_37.setHorizontalAlignment(SwingConstants.LEFT);
		label_37.setFont(new Font("Arial", Font.PLAIN, 11));
		label_37.setBounds(994, 78, 203, 14);
		panel1.add(label_37);
		
		label_38 = new JLabel("Perfil SF Tipo 2");
		label_38.setHorizontalAlignment(SwingConstants.LEFT);
		label_38.setFont(new Font("Arial", Font.PLAIN, 11));
		label_38.setBounds(994, 100, 203, 14);
		panel1.add(label_38);
		
		label_39 = new JLabel("Perfil SF Tipo 3");
		label_39.setHorizontalAlignment(SwingConstants.LEFT);
		label_39.setFont(new Font("Arial", Font.PLAIN, 11));
		label_39.setBounds(994, 122, 203, 14);
		panel1.add(label_39);
		
		label_40 = new JLabel("Perfil SF Tipo 4");
		label_40.setHorizontalAlignment(SwingConstants.LEFT);
		label_40.setFont(new Font("Arial", Font.PLAIN, 11));
		label_40.setBounds(994, 144, 203, 14);
		panel1.add(label_40);
		
		label_41 = new JLabel("Perfil SF Tipo 5");
		label_41.setHorizontalAlignment(SwingConstants.LEFT);
		label_41.setFont(new Font("Arial", Font.PLAIN, 11));
		label_41.setBounds(994, 166, 203, 14);
		panel1.add(label_41);
		
		label_42 = new JLabel("Perfil SF Tipo 6");
		label_42.setHorizontalAlignment(SwingConstants.LEFT);
		label_42.setFont(new Font("Arial", Font.PLAIN, 11));
		label_42.setBounds(994, 188, 203, 14);
		panel1.add(label_42);
		
		label_43 = new JLabel("Perfil SF Tipo 7");
		label_43.setHorizontalAlignment(SwingConstants.LEFT);
		label_43.setFont(new Font("Arial", Font.PLAIN, 11));
		label_43.setBounds(994, 210, 203, 14);
		panel1.add(label_43);
		
		label_44 = new JLabel("Perfil SF Tipo 8");
		label_44.setHorizontalAlignment(SwingConstants.LEFT);
		label_44.setFont(new Font("Arial", Font.PLAIN, 11));
		label_44.setBounds(994, 232, 203, 14);
		panel1.add(label_44);
		
		label_45 = new JLabel("Perfil SF Tipo 9");
		label_45.setHorizontalAlignment(SwingConstants.LEFT);
		label_45.setFont(new Font("Arial", Font.PLAIN, 11));
		label_45.setBounds(994, 254, 203, 14);
		panel1.add(label_45);
		
		label_46 = new JLabel("Perfil SF Tipo 10");
		label_46.setHorizontalAlignment(SwingConstants.LEFT);
		label_46.setFont(new Font("Arial", Font.PLAIN, 11));
		label_46.setBounds(994, 276, 203, 14);
		panel1.add(label_46);
		
		label_47 = new JLabel("Perfil SF Tipo 11");
		label_47.setHorizontalAlignment(SwingConstants.LEFT);
		label_47.setFont(new Font("Arial", Font.PLAIN, 11));
		label_47.setBounds(994, 298, 203, 14);
		panel1.add(label_47);
		
		label_48 = new JLabel("Cantidad");
		label_48.setHorizontalAlignment(SwingConstants.CENTER);
		label_48.setFont(new Font("Arial", Font.BOLD, 11));
		label_48.setBounds(1222, 31, 63, 14);
		panel1.add(label_48);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(1219, 53, 35, 20);
		panel1.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(1256, 53, 35, 20);
		panel1.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(1301, 53, 167, 20);
		panel1.add(textField_27);
		
		label_49 = new JLabel("Observaci\u00F3n/Referencia");
		label_49.setHorizontalAlignment(SwingConstants.CENTER);
		label_49.setFont(new Font("Arial", Font.BOLD, 11));
		label_49.setBounds(1308, 31, 153, 14);
		panel1.add(label_49);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(1301, 75, 167, 20);
		panel1.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(1256, 75, 35, 20);
		panel1.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(1219, 75, 35, 20);
		panel1.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(1219, 97, 35, 20);
		panel1.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(1256, 97, 35, 20);
		panel1.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(1301, 97, 167, 20);
		panel1.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(1301, 119, 167, 20);
		panel1.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(1256, 119, 35, 20);
		panel1.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(1219, 119, 35, 20);
		panel1.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(1219, 141, 35, 20);
		panel1.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(1256, 141, 35, 20);
		panel1.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(1301, 141, 167, 20);
		panel1.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(1301, 163, 167, 20);
		panel1.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(1256, 163, 35, 20);
		panel1.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(1219, 163, 35, 20);
		panel1.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(1219, 185, 35, 20);
		panel1.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(1256, 185, 35, 20);
		panel1.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(1301, 185, 167, 20);
		panel1.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(1301, 207, 167, 20);
		panel1.add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(1256, 207, 35, 20);
		panel1.add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(1219, 207, 35, 20);
		panel1.add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(1219, 229, 35, 20);
		panel1.add(textField_49);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(1256, 229, 35, 20);
		panel1.add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(1301, 229, 167, 20);
		panel1.add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setColumns(10);
		textField_52.setBounds(1301, 251, 167, 20);
		panel1.add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setColumns(10);
		textField_53.setBounds(1256, 251, 35, 20);
		panel1.add(textField_53);
		
		textField_54 = new JTextField();
		textField_54.setColumns(10);
		textField_54.setBounds(1219, 251, 35, 20);
		panel1.add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setColumns(10);
		textField_55.setBounds(1219, 273, 35, 20);
		panel1.add(textField_55);
		
		textField_56 = new JTextField();
		textField_56.setColumns(10);
		textField_56.setBounds(1256, 273, 35, 20);
		panel1.add(textField_56);
		
		textField_57 = new JTextField();
		textField_57.setColumns(10);
		textField_57.setBounds(1301, 273, 167, 20);
		panel1.add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBounds(1301, 295, 167, 20);
		panel1.add(textField_58);
		
		textField_59 = new JTextField();
		textField_59.setColumns(10);
		textField_59.setBounds(1256, 295, 35, 20);
		panel1.add(textField_59);
		
		textField_60 = new JTextField();
		textField_60.setColumns(10);
		textField_60.setBounds(1219, 295, 35, 20);
		panel1.add(textField_60);
		
		lblCercha = new JLabel("Cercha");
		lblCercha.setHorizontalAlignment(SwingConstants.LEFT);
		lblCercha.setFont(new Font("Arial", Font.PLAIN, 11));
		lblCercha.setBounds(994, 320, 203, 14);
		panel1.add(lblCercha);
		
		textField_61 = new JTextField();
		textField_61.setColumns(10);
		textField_61.setBounds(1219, 317, 35, 20);
		panel1.add(textField_61);
		
		textField_62 = new JTextField();
		textField_62.setColumns(10);
		textField_62.setBounds(1256, 317, 35, 20);
		panel1.add(textField_62);
		
		textField_63 = new JTextField();
		textField_63.setColumns(10);
		textField_63.setBounds(1301, 317, 167, 20);
		panel1.add(textField_63);
	}

}
