package com.capa.presentacion;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MM1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtCantidadLum1;
	private JTextField txtCantidadLum2;
	private JTextField txtRefLum;
	private JTextField txtCantidadToma1;
	private JTextField txtCantidadToma2;
	private JTextField txtRefeToma;
	private JTextField txtCantidadInterr1;
	private JTextField txtCantidadInterr2;
	private JTextField txtRefInterr;
	private JTextField txtCantidadCable1;
	private JTextField txtCantidadCable2;
	private JTextField txtRefCable;
	private JTextField txtCantidadFrega1;
	private JTextField txtCantidadFrega2;
	private JTextField txtRefFrega;
	private JTextField txtCantidadCanal1;
	private JTextField txtCantidadCanal2;
	private JTextField txtRefCanal;
	private JLabel lblAccesorios;
	private JTextField txtCantidadAcce1;
	private JTextField txtCantidadAcce2;
	private JTextField txtRefAcce;
	private JLabel lblTuberiaPvc;
	private JTextField txtCantidadTub1;
	private JTextField txtCantidadTub2;
	private JTextField txtRefTub;
	private JLabel lblTuberaDePvc_2;
	private JTextField txtCantidadPVC1;
	private JTextField txtCantidadPVC2;
	private JTextField txtRefPVC;
	private JLabel lblKitConexion;
	private JTextField txtCantidadConTub1;
	private JTextField txtCantidadConTub2;
	private JTextField txtRefConTub;
	private JLabel lblKitAP;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel lblAccAP;
	private JTextField txtCantidadConAP1;
	private JTextField txtCantidadConAP2;
	private JTextField txtRefConAP;
	private JLabel lblTuberaDePvc;
	private JTextField txtCantTub1;
	private JTextField txtCantTub2;
	private JTextField txtRefTubPVC;
	private JLabel lblTuberaDePvc_1;
	private JTextField txtCantPVC1;
	private JTextField txtCantPVC2;
	private JTextField txtRefTubePVC;
	private JLabel lblConTub;
	private JTextField txtCantidadConeTub1;
	private JTextField txtCantidadConeTub2;
	private JTextField txtRefConeTub;
	private JLabel lblConeTub;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblKitAguaResidual;
	private JLabel lblConeAR;
	private JLabel label_9;
	private JTextField txtCantidadCP1;
	private JTextField txtCantidadCP2;
	private JTextField txtRefCP;
	private JLabel label_10;
	private JLabel lblTuberaDemm;
	private JTextField txtCantidadTubL1;
	private JTextField txtCantidadTubL2;
	private JTextField txtRefTubL;
	private JLabel lblFrega;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JLabel lblTuberaDemm_1;
	private JTextField txtCantidad1;
	private JTextField txtCantidad2;
	private JTextField txtRefTuberia;
	private JLabel lblTuberaDemm_2;
	private JTextField txtCant1;
	private JTextField txtCant2;
	private JTextField txtRefTub2;
	private JLabel lblDescTub;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel label_5;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JLabel lblComponenteArquitectnico;
	private JLabel lblPuerta;
	private JTextField txtCantidadPuerta1;
	private JTextField txtCantidadPuerta2;
	private JLabel label_12;
	private JTextField txtRefPuerta;
	private JLabel label_13;
	private JLabel lblBisagras;
	private JTextField txtCantidadBisagras1;
	private JTextField txtCantidadBisagras2;
	private JTextField txtRefBisagras;
	private JLabel lblPerfilSfTipo;
	private JTextField txtCantidadPerfil1;
	private JTextField txtCantidadPerfil2;
	private JTextField txtRefPerfil;
	private JLabel lblVentana;
	private JTextField txtCantidadVentana1;
	private JTextField txtCantidadVentana2;
	private JTextField txtRefVentana;
	private JLabel lblPerfilSfPara;
	private JTextField txtCantPerfilVent1;
	private JTextField txtCantPerfilVent2;
	private JTextField txtRefPerfilVent;
	private JLabel lblPerfilSfTipo_1;
	private JTextField txtCantidadPanel1;
	private JTextField txtCantidadPanel2;
	private JTextField txtRefPanel;
	private JLabel lblPanelesTcbx;
	private JTextField txtCantidadTCB1;
	private JTextField txtCantidadTCB2;
	private JTextField txtRefTCB;
	private JLabel lblPanelesVynilPiso;
	private JTextField txtCantidaVinyl1;
	private JTextField txtCantidaVinyl2;
	private JTextField txtRefVynil;
	private JLabel lblPanelesEpsPara;
	private JTextField txtCantidadEPS1;
	private JTextField txtCantidadEPS2;
	private JTextField txtRefEPS;
	private JPanel panelLab2;
	private JLabel lblFachadaFrontal;
	private JLabel lblPanelesEpsPared;
	private JTextField txtCantidadPared1;
	private JLabel label_14;
	private JTextField txtCantidadPared2;
	private JTextField txtRefPared;
	private JLabel label_15;
	private JLabel lblPanelesEpsPared_1;
	private JTextField txtCantidadEP1;
	private JTextField txtCantidadEP2;
	private JTextField txtRefEP;
	private JLabel lblPanelesEpsPared_2;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JLabel lblPanelesEpsPared_3;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JLabel lblFachadaPosterior;
	private JLabel label_11;
	private JLabel label_16;
	private JLabel lblPanelesEpsPared_4;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JLabel lblPanelesEpsPared_5;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JLabel lblPanelesEpsPared_6;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JLabel lblFachadaLateral;
	private JLabel lblPanelHvarPared;
	private JTextField txtCantidadHvar1;
	private JLabel label_19;
	private JTextField txtCantidadHvar2;
	private JTextField txtRefHvar;
	private JLabel label_20;
	private JLabel lblComponenteEstructural;
	private JLabel lblDadosCimentacin;
	private JTextField txtCantidadDados1;
	private JTextField txtCantidadDados2;
	private JLabel label_18;
	private JLabel label_21;
	private JTextField txtRefDados;
	private JLabel lblPerfilSfTipo_2;
	private JLabel lblPerfilSfTipo_3;
	private JLabel lblPerfilSfTipo_4;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JLabel lblPerfilSfTipo_5;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JLabel lblPerfilSfTipo_6;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JLabel lblPerfilSfTipo_7;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JLabel lblPerfilSfTipo_8;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JLabel lblPerfilSfTipo_9;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JLabel lblPerfilSfTipo_10;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JLabel lblPerfilSfTipo_11;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JLabel lblPerfilSfTipo_12;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MM1 frame = new MM1();
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
	public MM1() {
		setTitle("MM_1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1528, 771);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(21, 121, 1475, 596);
		contentPane.add(tabbedPane);

		JPanel panelLab1 = new JPanel();
		tabbedPane.addTab("1.- MM laboratorio-1", null, panelLab1, null);
		panelLab1.setLayout(null);

		JLabel lblKitElectrico = new JLabel("KIT EL\u00C9CTRICO");
		lblKitElectrico.setHorizontalAlignment(SwingConstants.CENTER);
		lblKitElectrico.setFont(new Font("Arial", Font.BOLD, 11));
		lblKitElectrico.setBounds(52, 11, 100, 14);
		panelLab1.add(lblKitElectrico);

		JLabel lblLuminariasLed = new JLabel("Luminarias LED 60 w - 5000 lum");
		lblLuminariasLed.setHorizontalAlignment(SwingConstants.LEFT);
		lblLuminariasLed.setFont(new Font("Arial", Font.PLAIN, 11));
		lblLuminariasLed.setBounds(10, 36, 183, 14);
		panelLab1.add(lblLuminariasLed);

		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidad.setFont(new Font("Arial", Font.BOLD, 11));
		lblCantidad.setBounds(226, 11, 63, 14);
		panelLab1.add(lblCantidad);

		txtCantidadLum1 = new JTextField();
		txtCantidadLum1.setBounds(223, 33, 35, 20);
		panelLab1.add(txtCantidadLum1);
		txtCantidadLum1.setColumns(10);

		txtCantidadLum2 = new JTextField();
		txtCantidadLum2.setColumns(10);
		txtCantidadLum2.setBounds(260, 33, 35, 20);
		panelLab1.add(txtCantidadLum2);

		JLabel lblObservacinreferencia = new JLabel("Observaci\u00F3n/Referencia");
		lblObservacinreferencia.setHorizontalAlignment(SwingConstants.CENTER);
		lblObservacinreferencia.setFont(new Font("Arial", Font.BOLD, 11));
		lblObservacinreferencia.setBounds(312, 11, 153, 14);
		panelLab1.add(lblObservacinreferencia);

		txtRefLum = new JTextField();
		txtRefLum.setBounds(305, 33, 167, 20);
		panelLab1.add(txtRefLum);
		txtRefLum.setColumns(10);

		JLabel lblTomacorrientes = new JLabel("Tomacorrientes");
		lblTomacorrientes.setHorizontalAlignment(SwingConstants.LEFT);
		lblTomacorrientes.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTomacorrientes.setBounds(10, 58, 183, 14);
		panelLab1.add(lblTomacorrientes);

		txtCantidadToma1 = new JTextField();
		txtCantidadToma1.setColumns(10);
		txtCantidadToma1.setBounds(223, 55, 35, 20);
		panelLab1.add(txtCantidadToma1);

		txtCantidadToma2 = new JTextField();
		txtCantidadToma2.setColumns(10);
		txtCantidadToma2.setBounds(260, 55, 35, 20);
		panelLab1.add(txtCantidadToma2);

		txtRefeToma = new JTextField();
		txtRefeToma.setColumns(10);
		txtRefeToma.setBounds(305, 55, 167, 20);
		panelLab1.add(txtRefeToma);

		JLabel lblInterruptor = new JLabel("Interruptor");
		lblInterruptor.setHorizontalAlignment(SwingConstants.LEFT);
		lblInterruptor.setFont(new Font("Arial", Font.PLAIN, 11));
		lblInterruptor.setBounds(10, 80, 183, 14);
		panelLab1.add(lblInterruptor);

		txtCantidadInterr1 = new JTextField();
		txtCantidadInterr1.setColumns(10);
		txtCantidadInterr1.setBounds(223, 77, 35, 20);
		panelLab1.add(txtCantidadInterr1);

		txtCantidadInterr2 = new JTextField();
		txtCantidadInterr2.setColumns(10);
		txtCantidadInterr2.setBounds(260, 77, 35, 20);
		panelLab1.add(txtCantidadInterr2);

		txtRefInterr = new JTextField();
		txtRefInterr.setColumns(10);
		txtRefInterr.setBounds(305, 77, 167, 20);
		panelLab1.add(txtRefInterr);

		JLabel lblKitCableElctrico = new JLabel("Kit cable el\u00E9ctrico");
		lblKitCableElctrico.setHorizontalAlignment(SwingConstants.LEFT);
		lblKitCableElctrico.setFont(new Font("Arial", Font.PLAIN, 11));
		lblKitCableElctrico.setBounds(10, 102, 183, 14);
		panelLab1.add(lblKitCableElctrico);

		txtCantidadCable1 = new JTextField();
		txtCantidadCable1.setColumns(10);
		txtCantidadCable1.setBounds(223, 99, 35, 20);
		panelLab1.add(txtCantidadCable1);

		txtCantidadCable2 = new JTextField();
		txtCantidadCable2.setColumns(10);
		txtCantidadCable2.setBounds(260, 99, 35, 20);
		panelLab1.add(txtCantidadCable2);

		txtRefCable = new JTextField();
		txtRefCable.setColumns(10);
		txtRefCable.setBounds(305, 99, 167, 20);
		panelLab1.add(txtRefCable);

		JLabel lblKitHidrosanitario = new JLabel("KIT HIDROSANITARIO");
		lblKitHidrosanitario.setHorizontalAlignment(SwingConstants.CENTER);
		lblKitHidrosanitario.setFont(new Font("Arial", Font.BOLD, 11));
		lblKitHidrosanitario.setBounds(27, 137, 139, 14);
		panelLab1.add(lblKitHidrosanitario);

		JLabel label_1 = new JLabel("Cantidad");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Arial", Font.BOLD, 11));
		label_1.setBounds(226, 137, 63, 14);
		panelLab1.add(label_1);

		JLabel label_2 = new JLabel("Observaci\u00F3n/Referencia");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Arial", Font.BOLD, 11));
		label_2.setBounds(312, 137, 153, 14);
		panelLab1.add(label_2);

		JLabel lblFregadero = new JLabel("Fregadero");
		lblFregadero.setHorizontalAlignment(SwingConstants.LEFT);
		lblFregadero.setFont(new Font("Arial", Font.PLAIN, 11));
		lblFregadero.setBounds(10, 162, 183, 14);
		panelLab1.add(lblFregadero);

		txtCantidadFrega1 = new JTextField();
		txtCantidadFrega1.setColumns(10);
		txtCantidadFrega1.setBounds(223, 159, 35, 20);
		panelLab1.add(txtCantidadFrega1);

		txtCantidadFrega2 = new JTextField();
		txtCantidadFrega2.setColumns(10);
		txtCantidadFrega2.setBounds(260, 159, 35, 20);
		panelLab1.add(txtCantidadFrega2);

		txtRefFrega = new JTextField();
		txtRefFrega.setColumns(10);
		txtRefFrega.setBounds(305, 159, 167, 20);
		panelLab1.add(txtRefFrega);

		JLabel lblKitAguaLluvia = new JLabel("KIT AGUA LLUVIA");
		lblKitAguaLluvia.setHorizontalAlignment(SwingConstants.CENTER);
		lblKitAguaLluvia.setFont(new Font("Arial", Font.BOLD, 11));
		lblKitAguaLluvia.setBounds(27, 201, 139, 14);
		panelLab1.add(lblKitAguaLluvia);

		JLabel label_3 = new JLabel("Cantidad");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Arial", Font.BOLD, 11));
		label_3.setBounds(226, 201, 63, 14);
		panelLab1.add(label_3);

		JLabel label_4 = new JLabel("Observaci\u00F3n/Referencia");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Arial", Font.BOLD, 11));
		label_4.setBounds(312, 201, 153, 14);
		panelLab1.add(label_4);

		JLabel lblCanalPlstico = new JLabel("Canal pl\u00E1stico PVC de L=3m");
		lblCanalPlstico.setHorizontalAlignment(SwingConstants.LEFT);
		lblCanalPlstico.setFont(new Font("Arial", Font.PLAIN, 11));
		lblCanalPlstico.setBounds(10, 226, 183, 14);
		panelLab1.add(lblCanalPlstico);

		txtCantidadCanal1 = new JTextField();
		txtCantidadCanal1.setColumns(10);
		txtCantidadCanal1.setBounds(226, 223, 35, 20);
		panelLab1.add(txtCantidadCanal1);

		txtCantidadCanal2 = new JTextField();
		txtCantidadCanal2.setColumns(10);
		txtCantidadCanal2.setBounds(263, 223, 35, 20);
		panelLab1.add(txtCantidadCanal2);

		txtRefCanal = new JTextField();
		txtRefCanal.setColumns(10);
		txtRefCanal.setBounds(308, 223, 167, 20);
		panelLab1.add(txtRefCanal);

		String texto = "<html><body>Kit de Accesorios de Conexi\u00F3n Agua de<br>"
				+ "Lluvia (2 rejilla, 4 codos 90\u00B0,1/4 gl<br>polipega, tornillos, abrazaderas</body></html>)";
		lblAccesorios = new JLabel(texto);
		lblAccesorios.setHorizontalAlignment(SwingConstants.LEFT);
		lblAccesorios.setFont(new Font("Arial", Font.PLAIN, 11));
		lblAccesorios.setBounds(10, 245, 203, 56);
		panelLab1.add(lblAccesorios);

		txtCantidadAcce1 = new JTextField();
		txtCantidadAcce1.setColumns(10);
		txtCantidadAcce1.setBounds(226, 266, 35, 20);
		panelLab1.add(txtCantidadAcce1);

		txtCantidadAcce2 = new JTextField();
		txtCantidadAcce2.setColumns(10);
		txtCantidadAcce2.setBounds(263, 266, 35, 20);
		panelLab1.add(txtCantidadAcce2);

		txtRefAcce = new JTextField();
		txtRefAcce.setColumns(10);
		txtRefAcce.setBounds(308, 266, 167, 20);
		panelLab1.add(txtRefAcce);

		lblTuberiaPvc = new JLabel("Tuber\u00EDa de PVC 75 mm L=3m");
		lblTuberiaPvc.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberiaPvc.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberiaPvc.setBounds(10, 303, 183, 14);
		panelLab1.add(lblTuberiaPvc);

		txtCantidadTub1 = new JTextField();
		txtCantidadTub1.setColumns(10);
		txtCantidadTub1.setBounds(226, 297, 35, 20);
		panelLab1.add(txtCantidadTub1);

		txtCantidadTub2 = new JTextField();
		txtCantidadTub2.setColumns(10);
		txtCantidadTub2.setBounds(263, 297, 35, 20);
		panelLab1.add(txtCantidadTub2);

		txtRefTub = new JTextField();
		txtRefTub.setColumns(10);
		txtRefTub.setBounds(308, 297, 167, 20);
		panelLab1.add(txtRefTub);

		lblTuberaDePvc_2 = new JLabel("Tuber\u00EDa de PVC 75 mm L=0.6m");
		lblTuberaDePvc_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberaDePvc_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberaDePvc_2.setBounds(10, 325, 183, 14);
		panelLab1.add(lblTuberaDePvc_2);

		txtCantidadPVC1 = new JTextField();
		txtCantidadPVC1.setColumns(10);
		txtCantidadPVC1.setBounds(226, 319, 35, 20);
		panelLab1.add(txtCantidadPVC1);

		txtCantidadPVC2 = new JTextField();
		txtCantidadPVC2.setColumns(10);
		txtCantidadPVC2.setBounds(263, 319, 35, 20);
		panelLab1.add(txtCantidadPVC2);

		txtRefPVC = new JTextField();
		txtRefPVC.setColumns(10);
		txtRefPVC.setBounds(308, 319, 167, 20);
		panelLab1.add(txtRefPVC);

		String textoConexion = "<html><body>Kit para conexi\u00F3n de tuber\u00EDa 75 mm. (lija<br>"
				+ "pliego, polipega 1/4gal,1 codo 90\u00B0)</body></html>";
		lblKitConexion = new JLabel(textoConexion);
		lblKitConexion.setHorizontalAlignment(SwingConstants.LEFT);
		lblKitConexion.setFont(new Font("Arial", Font.PLAIN, 11));
		lblKitConexion.setBounds(10, 347, 203, 39);
		panelLab1.add(lblKitConexion);

		txtCantidadConTub1 = new JTextField();
		txtCantidadConTub1.setColumns(10);
		txtCantidadConTub1.setBounds(226, 355, 35, 20);
		panelLab1.add(txtCantidadConTub1);

		txtCantidadConTub2 = new JTextField();
		txtCantidadConTub2.setColumns(10);
		txtCantidadConTub2.setBounds(263, 355, 35, 20);
		panelLab1.add(txtCantidadConTub2);

		txtRefConTub = new JTextField();
		txtRefConTub.setColumns(10);
		txtRefConTub.setBounds(308, 355, 167, 20);
		panelLab1.add(txtRefConTub);

		lblKitAP = new JLabel("KIT AGUA POTABLE");
		lblKitAP.setHorizontalAlignment(SwingConstants.CENTER);
		lblKitAP.setFont(new Font("Arial", Font.BOLD, 11));
		lblKitAP.setBounds(509, 11, 139, 14);
		panelLab1.add(lblKitAP);

		label_6 = new JLabel("Cantidad");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Arial", Font.BOLD, 11));
		label_6.setBounds(712, 11, 63, 14);
		panelLab1.add(label_6);

		label_7 = new JLabel("Observaci\u00F3n/Referencia");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Arial", Font.BOLD, 11));
		label_7.setBounds(798, 11, 153, 14);
		panelLab1.add(label_7);

		String textoAccAP = "<html><body>Kit de Accesorios de Conexi\u00F3n Agua<br>Potable (fregaderos)(2  te reducciones<br>3/4-1/2, "
				+ "2 neplos,4 uniones de 1/2,4<br>"
				+ "codos de 90\u00B0,2 mangueras de abasto,2<br>llave de paso, tefl\u00F3n, pasta selladora)";
		lblAccAP = new JLabel(textoAccAP);
		lblAccAP.setHorizontalAlignment(SwingConstants.LEFT);
		lblAccAP.setFont(new Font("Arial", Font.PLAIN, 11));
		lblAccAP.setBounds(495, 25, 203, 86);
		panelLab1.add(lblAccAP);

		txtCantidadConAP1 = new JTextField();
		txtCantidadConAP1.setColumns(10);
		txtCantidadConAP1.setBounds(708, 47, 35, 20);
		panelLab1.add(txtCantidadConAP1);

		txtCantidadConAP2 = new JTextField();
		txtCantidadConAP2.setColumns(10);
		txtCantidadConAP2.setBounds(745, 47, 35, 20);
		panelLab1.add(txtCantidadConAP2);

		txtRefConAP = new JTextField();
		txtRefConAP.setColumns(10);
		txtRefConAP.setBounds(790, 47, 167, 20);
		panelLab1.add(txtRefConAP);

		lblTuberaDePvc = new JLabel("Tuber\u00EDa de PVC  1/2\" y L=1.5m");
		lblTuberaDePvc.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberaDePvc.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberaDePvc.setBounds(495, 117, 183, 14);
		panelLab1.add(lblTuberaDePvc);

		txtCantTub1 = new JTextField();
		txtCantTub1.setColumns(10);
		txtCantTub1.setBounds(708, 114, 35, 20);
		panelLab1.add(txtCantTub1);

		txtCantTub2 = new JTextField();
		txtCantTub2.setColumns(10);
		txtCantTub2.setBounds(745, 114, 35, 20);
		panelLab1.add(txtCantTub2);

		txtRefTubPVC = new JTextField();
		txtRefTubPVC.setColumns(10);
		txtRefTubPVC.setBounds(790, 114, 167, 20);
		panelLab1.add(txtRefTubPVC);

		lblTuberaDePvc_1 = new JLabel("Tuber\u00EDa de PVC  3/4\" y L=3m");
		lblTuberaDePvc_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberaDePvc_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberaDePvc_1.setBounds(495, 139, 183, 14);
		panelLab1.add(lblTuberaDePvc_1);

		txtCantPVC1 = new JTextField();
		txtCantPVC1.setColumns(10);
		txtCantPVC1.setBounds(708, 136, 35, 20);
		panelLab1.add(txtCantPVC1);

		txtCantPVC2 = new JTextField();
		txtCantPVC2.setColumns(10);
		txtCantPVC2.setBounds(745, 136, 35, 20);
		panelLab1.add(txtCantPVC2);

		txtRefTubePVC = new JTextField();
		txtRefTubePVC.setColumns(10);
		txtRefTubePVC.setBounds(790, 136, 167, 20);
		panelLab1.add(txtRefTubePVC);

		String textoConTub = "<html><body>Kit para conexi\u00F3n de tuber\u00EDa 1/2\". (lija<br>pliego, polipega 1/4gal,3 uniones)</body></html>";
		lblConTub = new JLabel(textoConTub);
		lblConTub.setHorizontalAlignment(SwingConstants.LEFT);
		lblConTub.setFont(new Font("Arial", Font.PLAIN, 11));
		lblConTub.setBounds(495, 161, 203, 39);
		panelLab1.add(lblConTub);

		txtCantidadConeTub1 = new JTextField();
		txtCantidadConeTub1.setColumns(10);
		txtCantidadConeTub1.setBounds(708, 169, 35, 20);
		panelLab1.add(txtCantidadConeTub1);

		txtCantidadConeTub2 = new JTextField();
		txtCantidadConeTub2.setColumns(10);
		txtCantidadConeTub2.setBounds(745, 169, 35, 20);
		panelLab1.add(txtCantidadConeTub2);

		txtRefConeTub = new JTextField();
		txtRefConeTub.setColumns(10);
		txtRefConeTub.setBounds(790, 169, 167, 20);
		panelLab1.add(txtRefConeTub);

		String textoConeTub = "<html><body>Kit para conexi\u00F3n de tuber\u00EDa 3/4\". (lija<br>pliego, polipega 1/4gal,3 uniones)</body></html>";
		lblConeTub = new JLabel(textoConeTub);
		lblConeTub.setHorizontalAlignment(SwingConstants.LEFT);
		lblConeTub.setFont(new Font("Arial", Font.PLAIN, 11));
		lblConeTub.setBounds(495, 201, 203, 39);
		panelLab1.add(lblConeTub);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(708, 209, 35, 20);
		panelLab1.add(textField);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(745, 209, 35, 20);
		panelLab1.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(790, 209, 167, 20);
		panelLab1.add(textField_2);

		lblKitAguaResidual = new JLabel("KIT AGUA RESIDUAL");
		lblKitAguaResidual.setHorizontalAlignment(SwingConstants.CENTER);
		lblKitAguaResidual.setFont(new Font("Arial", Font.BOLD, 11));
		lblKitAguaResidual.setBounds(509, 254, 139, 14);
		panelLab1.add(lblKitAguaResidual);

		String textoConeAR = "<html><body>Kit de Accesorios de Conexi\u00F3n Agua<br>Residual (CP)(2 codo 90\u00B0,2 rejilla,2 ye<br>"
				+ "75-110,1/4gl polipega)</body></html>";
		lblConeAR = new JLabel(textoConeAR);
		lblConeAR.setVerticalAlignment(SwingConstants.TOP);
		lblConeAR.setHorizontalAlignment(SwingConstants.LEFT);
		lblConeAR.setFont(new Font("Arial", Font.PLAIN, 11));
		lblConeAR.setBounds(495, 279, 203, 50);
		panelLab1.add(lblConeAR);

		label_9 = new JLabel("Cantidad");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Arial", Font.BOLD, 11));
		label_9.setBounds(712, 254, 63, 14);
		panelLab1.add(label_9);

		txtCantidadCP1 = new JTextField();
		txtCantidadCP1.setColumns(10);
		txtCantidadCP1.setBounds(708, 290, 35, 20);
		panelLab1.add(txtCantidadCP1);

		txtCantidadCP2 = new JTextField();
		txtCantidadCP2.setColumns(10);
		txtCantidadCP2.setBounds(745, 290, 35, 20);
		panelLab1.add(txtCantidadCP2);

		txtRefCP = new JTextField();
		txtRefCP.setColumns(10);
		txtRefCP.setBounds(790, 290, 167, 20);
		panelLab1.add(txtRefCP);

		label_10 = new JLabel("Observaci\u00F3n/Referencia");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Arial", Font.BOLD, 11));
		label_10.setBounds(798, 254, 153, 14);
		panelLab1.add(label_10);

		lblTuberaDemm = new JLabel("Tuber\u00EDa de 50mm PVC y L=2m");
		lblTuberaDemm.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberaDemm.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberaDemm.setBounds(495, 332, 183, 14);
		panelLab1.add(lblTuberaDemm);

		txtCantidadTubL1 = new JTextField();
		txtCantidadTubL1.setColumns(10);
		txtCantidadTubL1.setBounds(708, 329, 35, 20);
		panelLab1.add(txtCantidadTubL1);

		txtCantidadTubL2 = new JTextField();
		txtCantidadTubL2.setColumns(10);
		txtCantidadTubL2.setBounds(745, 329, 35, 20);
		panelLab1.add(txtCantidadTubL2);

		txtRefTubL = new JTextField();
		txtRefTubL.setColumns(10);
		txtRefTubL.setBounds(790, 329, 167, 20);
		panelLab1.add(txtRefTubL);

		String textoFrega = "<html><body>Kit de Accesorios de Conexi\u00F3n Agua<br>Residual (Fregaderos)( 4codo 90\u00B0,1/4 gl<br>"
				+ "polipega ,4 yee 50-110)</body></html>";
		lblFrega = new JLabel(textoFrega);
		lblFrega.setVerticalAlignment(SwingConstants.TOP);
		lblFrega.setHorizontalAlignment(SwingConstants.LEFT);
		lblFrega.setFont(new Font("Arial", Font.PLAIN, 11));
		lblFrega.setBounds(495, 355, 203, 50);
		panelLab1.add(lblFrega);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(708, 366, 35, 20);
		panelLab1.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(745, 366, 35, 20);
		panelLab1.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(790, 366, 167, 20);
		panelLab1.add(textField_8);

		lblTuberaDemm_1 = new JLabel("Tuber\u00EDa de 75mm PVC y L=3m");
		lblTuberaDemm_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberaDemm_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberaDemm_1.setBounds(495, 408, 183, 14);
		panelLab1.add(lblTuberaDemm_1);

		txtCantidad1 = new JTextField();
		txtCantidad1.setColumns(10);
		txtCantidad1.setBounds(708, 405, 35, 20);
		panelLab1.add(txtCantidad1);

		txtCantidad2 = new JTextField();
		txtCantidad2.setColumns(10);
		txtCantidad2.setBounds(745, 405, 35, 20);
		panelLab1.add(txtCantidad2);

		txtRefTuberia = new JTextField();
		txtRefTuberia.setColumns(10);
		txtRefTuberia.setBounds(790, 405, 167, 20);
		panelLab1.add(txtRefTuberia);

		lblTuberaDemm_2 = new JLabel("Tuber\u00EDa de 75mm PVC y L=2m");
		lblTuberaDemm_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberaDemm_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberaDemm_2.setBounds(495, 430, 183, 14);
		panelLab1.add(lblTuberaDemm_2);

		txtCant1 = new JTextField();
		txtCant1.setColumns(10);
		txtCant1.setBounds(708, 427, 35, 20);
		panelLab1.add(txtCant1);

		txtCant2 = new JTextField();
		txtCant2.setColumns(10);
		txtCant2.setBounds(745, 427, 35, 20);
		panelLab1.add(txtCant2);

		txtRefTub2 = new JTextField();
		txtRefTub2.setColumns(10);
		txtRefTub2.setBounds(790, 427, 167, 20);
		panelLab1.add(txtRefTub2);

		String textoDescTub = "<html><body>Kit para conexi\u00F3n de tuber\u00EDa 50 mm. (lija<br>un pliego, polipega 1/4 gal, 1/4 gl suelda<br>"
				+ "l\u00EDquida, 2 uniones,2codo 90\u00B0, 2 codo45\u00B0)";
		lblDescTub = new JLabel(textoDescTub);
		lblDescTub.setVerticalAlignment(SwingConstants.TOP);
		lblDescTub.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescTub.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescTub.setBounds(495, 455, 203, 50);
		panelLab1.add(lblDescTub);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(708, 466, 35, 20);
		panelLab1.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(745, 466, 35, 20);
		panelLab1.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(790, 466, 167, 20);
		panelLab1.add(textField_5);

		String textoLabel = "<html><body>Kit para conexi\u00F3n de tuber\u00EDa 75 mm. (lija<br>pliego, polipega 1/2gal,1/4 gl suelda<br>"
				+ "líquida, 2 uniones,2codo 90\u00B0,2codo45\u00B0)</body></html>";
		label_5 = new JLabel(textoLabel);
		label_5.setVerticalAlignment(SwingConstants.TOP);
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setFont(new Font("Arial", Font.PLAIN, 11));
		label_5.setBounds(495, 509, 203, 50);
		panelLab1.add(label_5);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(708, 520, 35, 20);
		panelLab1.add(textField_9);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(745, 520, 35, 20);
		panelLab1.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(790, 520, 167, 20);
		panelLab1.add(textField_11);

		lblComponenteArquitectnico = new JLabel("COMPONENTE ARQUITECT\u00D3NICO");
		lblComponenteArquitectnico.setHorizontalAlignment(SwingConstants.CENTER);
		lblComponenteArquitectnico.setFont(new Font("Arial", Font.BOLD, 11));
		lblComponenteArquitectnico.setBounds(979, 11, 193, 14);
		panelLab1.add(lblComponenteArquitectnico);

		lblPuerta = new JLabel("Puerta");
		lblPuerta.setVerticalAlignment(SwingConstants.TOP);
		lblPuerta.setHorizontalAlignment(SwingConstants.LEFT);
		lblPuerta.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPuerta.setBounds(979, 36, 183, 14);
		panelLab1.add(lblPuerta);

		txtCantidadPuerta1 = new JTextField();
		txtCantidadPuerta1.setColumns(10);
		txtCantidadPuerta1.setBounds(1192, 33, 35, 20);
		panelLab1.add(txtCantidadPuerta1);

		txtCantidadPuerta2 = new JTextField();
		txtCantidadPuerta2.setColumns(10);
		txtCantidadPuerta2.setBounds(1229, 33, 35, 20);
		panelLab1.add(txtCantidadPuerta2);

		label_12 = new JLabel("Cantidad");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Arial", Font.BOLD, 11));
		label_12.setBounds(1195, 11, 63, 14);
		panelLab1.add(label_12);

		txtRefPuerta = new JTextField();
		txtRefPuerta.setColumns(10);
		txtRefPuerta.setBounds(1274, 33, 167, 20);
		panelLab1.add(txtRefPuerta);

		label_13 = new JLabel("Observaci\u00F3n/Referencia");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Arial", Font.BOLD, 11));
		label_13.setBounds(1281, 11, 153, 14);
		panelLab1.add(label_13);

		lblBisagras = new JLabel("Bisagras");
		lblBisagras.setVerticalAlignment(SwingConstants.TOP);
		lblBisagras.setHorizontalAlignment(SwingConstants.LEFT);
		lblBisagras.setFont(new Font("Arial", Font.PLAIN, 11));
		lblBisagras.setBounds(979, 58, 183, 14);
		panelLab1.add(lblBisagras);

		txtCantidadBisagras1 = new JTextField();
		txtCantidadBisagras1.setColumns(10);
		txtCantidadBisagras1.setBounds(1192, 55, 35, 20);
		panelLab1.add(txtCantidadBisagras1);

		txtCantidadBisagras2 = new JTextField();
		txtCantidadBisagras2.setColumns(10);
		txtCantidadBisagras2.setBounds(1229, 55, 35, 20);
		panelLab1.add(txtCantidadBisagras2);

		txtRefBisagras = new JTextField();
		txtRefBisagras.setColumns(10);
		txtRefBisagras.setBounds(1274, 55, 167, 20);
		panelLab1.add(txtRefBisagras);

		lblPerfilSfTipo = new JLabel("Perfil SF Tipo 12 MA-SF-12 para puerta");
		lblPerfilSfTipo.setVerticalAlignment(SwingConstants.TOP);
		lblPerfilSfTipo.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo.setBounds(979, 80, 203, 14);
		panelLab1.add(lblPerfilSfTipo);

		txtCantidadPerfil1 = new JTextField();
		txtCantidadPerfil1.setColumns(10);
		txtCantidadPerfil1.setBounds(1192, 77, 35, 20);
		panelLab1.add(txtCantidadPerfil1);

		txtCantidadPerfil2 = new JTextField();
		txtCantidadPerfil2.setColumns(10);
		txtCantidadPerfil2.setBounds(1229, 77, 35, 20);
		panelLab1.add(txtCantidadPerfil2);

		txtRefPerfil = new JTextField();
		txtRefPerfil.setColumns(10);
		txtRefPerfil.setBounds(1274, 77, 167, 20);
		panelLab1.add(txtRefPerfil);

		String textoVentana = "<html><body>Ventana corredera, compuesta por tres<br>hojas y dos carriles. UPVC con vidrio<br>"
				+ "flotado de 3 mm de 3x1,10</body></html>";
		lblVentana = new JLabel(textoVentana);
		lblVentana.setVerticalAlignment(SwingConstants.TOP);
		lblVentana.setHorizontalAlignment(SwingConstants.LEFT);
		lblVentana.setFont(new Font("Arial", Font.PLAIN, 11));
		lblVentana.setBounds(979, 102, 203, 50);
		panelLab1.add(lblVentana);

		txtCantidadVentana1 = new JTextField();
		txtCantidadVentana1.setColumns(10);
		txtCantidadVentana1.setBounds(1192, 113, 35, 20);
		panelLab1.add(txtCantidadVentana1);

		txtCantidadVentana2 = new JTextField();
		txtCantidadVentana2.setColumns(10);
		txtCantidadVentana2.setBounds(1229, 113, 35, 20);
		panelLab1.add(txtCantidadVentana2);

		txtRefVentana = new JTextField();
		txtRefVentana.setColumns(10);
		txtRefVentana.setBounds(1274, 113, 167, 20);
		panelLab1.add(txtRefVentana);

		lblPerfilSfPara = new JLabel("Perfil SF-12 para ventana");
		lblPerfilSfPara.setVerticalAlignment(SwingConstants.TOP);
		lblPerfilSfPara.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfPara.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfPara.setBounds(979, 155, 203, 14);
		panelLab1.add(lblPerfilSfPara);

		txtCantPerfilVent1 = new JTextField();
		txtCantPerfilVent1.setColumns(10);
		txtCantPerfilVent1.setBounds(1192, 152, 35, 20);
		panelLab1.add(txtCantPerfilVent1);

		txtCantPerfilVent2 = new JTextField();
		txtCantPerfilVent2.setColumns(10);
		txtCantPerfilVent2.setBounds(1229, 152, 35, 20);
		panelLab1.add(txtCantPerfilVent2);

		txtRefPerfilVent = new JTextField();
		txtRefPerfilVent.setColumns(10);
		txtRefPerfilVent.setBounds(1274, 152, 167, 20);
		panelLab1.add(txtRefPerfilVent);

		lblPerfilSfTipo_1 = new JLabel("Perfil SF Tipo 12 MM-SF-12  para paneles");
		lblPerfilSfTipo_1.setVerticalAlignment(SwingConstants.TOP);
		lblPerfilSfTipo_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_1.setBounds(979, 177, 203, 14);
		panelLab1.add(lblPerfilSfTipo_1);

		txtCantidadPanel1 = new JTextField();
		txtCantidadPanel1.setColumns(10);
		txtCantidadPanel1.setBounds(1192, 174, 35, 20);
		panelLab1.add(txtCantidadPanel1);

		txtCantidadPanel2 = new JTextField();
		txtCantidadPanel2.setColumns(10);
		txtCantidadPanel2.setBounds(1229, 174, 35, 20);
		panelLab1.add(txtCantidadPanel2);

		txtRefPanel = new JTextField();
		txtRefPanel.setColumns(10);
		txtRefPanel.setBounds(1274, 174, 167, 20);
		panelLab1.add(txtRefPanel);

		lblPanelesTcbx = new JLabel("Paneles TCB (8.8x5.8 m)");
		lblPanelesTcbx.setVerticalAlignment(SwingConstants.TOP);
		lblPanelesTcbx.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesTcbx.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesTcbx.setBounds(979, 199, 203, 14);
		panelLab1.add(lblPanelesTcbx);

		txtCantidadTCB1 = new JTextField();
		txtCantidadTCB1.setColumns(10);
		txtCantidadTCB1.setBounds(1192, 196, 35, 20);
		panelLab1.add(txtCantidadTCB1);

		txtCantidadTCB2 = new JTextField();
		txtCantidadTCB2.setColumns(10);
		txtCantidadTCB2.setBounds(1229, 196, 35, 20);
		panelLab1.add(txtCantidadTCB2);

		txtRefTCB = new JTextField();
		txtRefTCB.setColumns(10);
		txtRefTCB.setBounds(1274, 196, 167, 20);
		panelLab1.add(txtRefTCB);

		lblPanelesVynilPiso = new JLabel("Paneles vynil piso (0,15x1,93 m)");
		lblPanelesVynilPiso.setVerticalAlignment(SwingConstants.TOP);
		lblPanelesVynilPiso.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesVynilPiso.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesVynilPiso.setBounds(979, 221, 203, 14);
		panelLab1.add(lblPanelesVynilPiso);

		txtCantidaVinyl1 = new JTextField();
		txtCantidaVinyl1.setColumns(10);
		txtCantidaVinyl1.setBounds(1192, 218, 35, 20);
		panelLab1.add(txtCantidaVinyl1);

		txtCantidaVinyl2 = new JTextField();
		txtCantidaVinyl2.setColumns(10);
		txtCantidaVinyl2.setBounds(1229, 218, 35, 20);
		panelLab1.add(txtCantidaVinyl2);

		txtRefVynil = new JTextField();
		txtRefVynil.setColumns(10);
		txtRefVynil.setBounds(1274, 218, 167, 20);
		panelLab1.add(txtRefVynil);

		lblPanelesEpsPara = new JLabel("Paneles EPS para cubierta l=7, a= 1m");
		lblPanelesEpsPara.setVerticalAlignment(SwingConstants.TOP);
		lblPanelesEpsPara.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPara.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPara.setBounds(979, 243, 203, 14);
		panelLab1.add(lblPanelesEpsPara);

		txtCantidadEPS1 = new JTextField();
		txtCantidadEPS1.setColumns(10);
		txtCantidadEPS1.setBounds(1192, 240, 35, 20);
		panelLab1.add(txtCantidadEPS1);

		txtCantidadEPS2 = new JTextField();
		txtCantidadEPS2.setColumns(10);
		txtCantidadEPS2.setBounds(1229, 240, 35, 20);
		panelLab1.add(txtCantidadEPS2);

		txtRefEPS = new JTextField();
		txtRefEPS.setColumns(10);
		txtRefEPS.setBounds(1274, 240, 167, 20);
		panelLab1.add(txtRefEPS);

		JButton btnSiguiente = new JButton("Siguiente p\u00E1gina");
		btnSiguiente.setBounds(1152, 348, 139, 34);
		panelLab1.add(btnSiguiente);

		panelLab2 = new JPanel();
		tabbedPane.addTab("2.-  MM laboratorio-1", null, panelLab2, null);
		panelLab2.setLayout(null);

		lblFachadaFrontal = new JLabel("FACHADA FRONTAL");
		lblFachadaFrontal.setHorizontalAlignment(SwingConstants.CENTER);
		lblFachadaFrontal.setFont(new Font("Arial", Font.BOLD, 11));
		lblFachadaFrontal.setBounds(33, 82, 129, 14);
		panelLab2.add(lblFachadaFrontal);

		lblPanelesEpsPared = new JLabel("Paneles EPS pared -   ( 1x3x0,09x0,09 m)");
		lblPanelesEpsPared.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared.setBounds(10, 107, 203, 14);
		panelLab2.add(lblPanelesEpsPared);

		txtCantidadPared1 = new JTextField();
		txtCantidadPared1.setColumns(10);
		txtCantidadPared1.setBounds(235, 104, 35, 20);
		panelLab2.add(txtCantidadPared1);

		label_14 = new JLabel("Cantidad");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Arial", Font.BOLD, 11));
		label_14.setBounds(238, 82, 63, 14);
		panelLab2.add(label_14);

		txtCantidadPared2 = new JTextField();
		txtCantidadPared2.setColumns(10);
		txtCantidadPared2.setBounds(272, 104, 35, 20);
		panelLab2.add(txtCantidadPared2);

		txtRefPared = new JTextField();
		txtRefPared.setColumns(10);
		txtRefPared.setBounds(317, 104, 167, 20);
		panelLab2.add(txtRefPared);

		label_15 = new JLabel("Observaci\u00F3n/Referencia");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("Arial", Font.BOLD, 11));
		label_15.setBounds(324, 82, 153, 14);
		panelLab2.add(label_15);

		lblPanelesEpsPared_1 = new JLabel("Paneles EPS pared -   ( 1x0,90x0,90 m)");
		lblPanelesEpsPared_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_1.setBounds(10, 129, 203, 14);
		panelLab2.add(lblPanelesEpsPared_1);

		txtCantidadEP1 = new JTextField();
		txtCantidadEP1.setColumns(10);
		txtCantidadEP1.setBounds(235, 126, 35, 20);
		panelLab2.add(txtCantidadEP1);

		txtCantidadEP2 = new JTextField();
		txtCantidadEP2.setColumns(10);
		txtCantidadEP2.setBounds(272, 126, 35, 20);
		panelLab2.add(txtCantidadEP2);

		txtRefEP = new JTextField();
		txtRefEP.setColumns(10);
		txtRefEP.setBounds(317, 126, 167, 20);
		panelLab2.add(txtRefEP);

		lblPanelesEpsPared_2 = new JLabel("Paneles EPS pared -   ( 1x1,10x0,09 m)");
		lblPanelesEpsPared_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_2.setBounds(10, 151, 203, 14);
		panelLab2.add(lblPanelesEpsPared_2);

		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(235, 148, 35, 20);
		panelLab2.add(textField_12);

		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(272, 148, 35, 20);
		panelLab2.add(textField_13);

		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(317, 148, 167, 20);
		panelLab2.add(textField_14);

		lblPanelesEpsPared_3 = new JLabel("Paneles EPS pared -   ( 1x0,80x0,09 m)");
		lblPanelesEpsPared_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_3.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_3.setBounds(10, 173, 203, 14);
		panelLab2.add(lblPanelesEpsPared_3);

		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(235, 170, 35, 20);
		panelLab2.add(textField_15);

		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(272, 170, 35, 20);
		panelLab2.add(textField_16);

		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(317, 170, 167, 20);
		panelLab2.add(textField_17);

		lblFachadaPosterior = new JLabel("FACHADA POSTERIOR");
		lblFachadaPosterior.setHorizontalAlignment(SwingConstants.CENTER);
		lblFachadaPosterior.setFont(new Font("Arial", Font.BOLD, 11));
		lblFachadaPosterior.setBounds(33, 211, 129, 14);
		panelLab2.add(lblFachadaPosterior);

		label_11 = new JLabel("Cantidad");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Arial", Font.BOLD, 11));
		label_11.setBounds(238, 211, 63, 14);
		panelLab2.add(label_11);

		label_16 = new JLabel("Observaci\u00F3n/Referencia");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("Arial", Font.BOLD, 11));
		label_16.setBounds(324, 211, 153, 14);
		panelLab2.add(label_16);

		lblPanelesEpsPared_4 = new JLabel("Paneles EPS pared -   ( 1x2,70 x0,90  m)");
		lblPanelesEpsPared_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_4.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_4.setBounds(10, 236, 203, 14);
		panelLab2.add(lblPanelesEpsPared_4);

		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(235, 233, 35, 20);
		panelLab2.add(textField_18);

		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(272, 233, 35, 20);
		panelLab2.add(textField_19);

		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(317, 233, 167, 20);
		panelLab2.add(textField_20);

		lblPanelesEpsPared_5 = new JLabel("Paneles EPS pared -   ( 1x1,10 x0,90  m)");
		lblPanelesEpsPared_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_5.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_5.setBounds(10, 258, 203, 14);
		panelLab2.add(lblPanelesEpsPared_5);

		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(235, 255, 35, 20);
		panelLab2.add(textField_21);

		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(272, 255, 35, 20);
		panelLab2.add(textField_22);

		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(317, 255, 167, 20);
		panelLab2.add(textField_23);

		lblPanelesEpsPared_6 = new JLabel("Paneles EPS pared -   ( 1x0,50 x0,90  m)");
		lblPanelesEpsPared_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_6.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_6.setBounds(10, 280, 203, 14);
		panelLab2.add(lblPanelesEpsPared_6);

		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(235, 277, 35, 20);
		panelLab2.add(textField_24);

		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(272, 277, 35, 20);
		panelLab2.add(textField_25);

		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(317, 277, 167, 20);
		panelLab2.add(textField_26);

		lblFachadaLateral = new JLabel("FACHADA LATERAL");
		lblFachadaLateral.setHorizontalAlignment(SwingConstants.CENTER);
		lblFachadaLateral.setFont(new Font("Arial", Font.BOLD, 11));
		lblFachadaLateral.setBounds(33, 315, 129, 14);
		panelLab2.add(lblFachadaLateral);

		lblPanelHvarPared = new JLabel("Panel Hvar- pared laterales izq (libre)");
		lblPanelHvarPared.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelHvarPared.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelHvarPared.setBounds(10, 340, 203, 14);
		panelLab2.add(lblPanelHvarPared);

		txtCantidadHvar1 = new JTextField();
		txtCantidadHvar1.setColumns(10);
		txtCantidadHvar1.setBounds(235, 337, 35, 20);
		panelLab2.add(txtCantidadHvar1);

		label_19 = new JLabel("Cantidad");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("Arial", Font.BOLD, 11));
		label_19.setBounds(238, 315, 63, 14);
		panelLab2.add(label_19);

		txtCantidadHvar2 = new JTextField();
		txtCantidadHvar2.setColumns(10);
		txtCantidadHvar2.setBounds(272, 337, 35, 20);
		panelLab2.add(txtCantidadHvar2);

		txtRefHvar = new JTextField();
		txtRefHvar.setColumns(10);
		txtRefHvar.setBounds(317, 337, 167, 20);
		panelLab2.add(txtRefHvar);

		label_20 = new JLabel("Observaci\u00F3n/Referencia");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setFont(new Font("Arial", Font.BOLD, 11));
		label_20.setBounds(324, 315, 153, 14);
		panelLab2.add(label_20);

		lblComponenteEstructural = new JLabel("COMPONENTE ESTRUCTURAL");
		lblComponenteEstructural.setHorizontalAlignment(SwingConstants.CENTER);
		lblComponenteEstructural.setFont(new Font("Arial", Font.BOLD, 11));
		lblComponenteEstructural.setBounds(527, 82, 203, 14);
		panelLab2.add(lblComponenteEstructural);

		lblDadosCimentacin = new JLabel("Dados cimentaci\u00F3n");
		lblDadosCimentacin.setHorizontalAlignment(SwingConstants.LEFT);
		lblDadosCimentacin.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDadosCimentacin.setBounds(527, 107, 203, 14);
		panelLab2.add(lblDadosCimentacin);

		txtCantidadDados1 = new JTextField();
		txtCantidadDados1.setColumns(10);
		txtCantidadDados1.setBounds(752, 104, 35, 20);
		panelLab2.add(txtCantidadDados1);

		txtCantidadDados2 = new JTextField();
		txtCantidadDados2.setColumns(10);
		txtCantidadDados2.setBounds(789, 104, 35, 20);
		panelLab2.add(txtCantidadDados2);

		label_18 = new JLabel("Cantidad");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("Arial", Font.BOLD, 11));
		label_18.setBounds(755, 82, 63, 14);
		panelLab2.add(label_18);

		label_21 = new JLabel("Observaci\u00F3n/Referencia");
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setFont(new Font("Arial", Font.BOLD, 11));
		label_21.setBounds(841, 82, 153, 14);
		panelLab2.add(label_21);

		txtRefDados = new JTextField();
		txtRefDados.setColumns(10);
		txtRefDados.setBounds(834, 104, 167, 20);
		panelLab2.add(txtRefDados);

		lblPerfilSfTipo_2 = new JLabel("Perfil SF Tipo 1");
		lblPerfilSfTipo_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_2.setBounds(527, 129, 203, 14);
		panelLab2.add(lblPerfilSfTipo_2);

		lblPerfilSfTipo_3 = new JLabel("Perfil SF Tipo 2");
		lblPerfilSfTipo_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_3.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_3.setBounds(527, 151, 203, 14);
		panelLab2.add(lblPerfilSfTipo_3);

		lblPerfilSfTipo_4 = new JLabel("Perfil SF Tipo 3");
		lblPerfilSfTipo_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_4.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_4.setBounds(527, 173, 203, 14);
		panelLab2.add(lblPerfilSfTipo_4);

		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(752, 126, 35, 20);
		panelLab2.add(textField_30);

		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(789, 126, 35, 20);
		panelLab2.add(textField_31);

		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(834, 126, 167, 20);
		panelLab2.add(textField_32);

		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(752, 148, 35, 20);
		panelLab2.add(textField_33);

		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(789, 148, 35, 20);
		panelLab2.add(textField_34);

		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(834, 148, 167, 20);
		panelLab2.add(textField_35);

		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(752, 170, 35, 20);
		panelLab2.add(textField_36);

		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(789, 170, 35, 20);
		panelLab2.add(textField_37);

		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(834, 170, 167, 20);
		panelLab2.add(textField_38);

		lblPerfilSfTipo_5 = new JLabel("Perfil SF Tipo 4");
		lblPerfilSfTipo_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_5.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_5.setBounds(527, 195, 203, 14);
		panelLab2.add(lblPerfilSfTipo_5);

		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(752, 192, 35, 20);
		panelLab2.add(textField_27);

		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(789, 192, 35, 20);
		panelLab2.add(textField_28);

		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(834, 192, 167, 20);
		panelLab2.add(textField_29);

		lblPerfilSfTipo_6 = new JLabel("Perfil SF Tipo 5");
		lblPerfilSfTipo_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_6.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_6.setBounds(527, 217, 203, 14);
		panelLab2.add(lblPerfilSfTipo_6);

		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(752, 214, 35, 20);
		panelLab2.add(textField_39);

		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(789, 214, 35, 20);
		panelLab2.add(textField_40);

		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(834, 214, 167, 20);
		panelLab2.add(textField_41);

		lblPerfilSfTipo_7 = new JLabel("Perfil SF Tipo 6");
		lblPerfilSfTipo_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_7.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_7.setBounds(527, 239, 203, 14);
		panelLab2.add(lblPerfilSfTipo_7);

		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(752, 236, 35, 20);
		panelLab2.add(textField_42);

		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(789, 236, 35, 20);
		panelLab2.add(textField_43);

		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(834, 236, 167, 20);
		panelLab2.add(textField_44);

		lblPerfilSfTipo_8 = new JLabel("Perfil SF Tipo 7");
		lblPerfilSfTipo_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_8.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_8.setBounds(527, 261, 203, 14);
		panelLab2.add(lblPerfilSfTipo_8);

		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(752, 258, 35, 20);
		panelLab2.add(textField_45);

		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(789, 258, 35, 20);
		panelLab2.add(textField_46);

		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(834, 258, 167, 20);
		panelLab2.add(textField_47);

		lblPerfilSfTipo_9 = new JLabel("Perfil SF Tipo 8");
		lblPerfilSfTipo_9.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_9.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_9.setBounds(527, 283, 203, 14);
		panelLab2.add(lblPerfilSfTipo_9);

		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(752, 280, 35, 20);
		panelLab2.add(textField_48);

		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(789, 280, 35, 20);
		panelLab2.add(textField_49);

		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(834, 280, 167, 20);
		panelLab2.add(textField_50);

		lblPerfilSfTipo_10 = new JLabel("Perfil SF Tipo 9");
		lblPerfilSfTipo_10.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_10.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_10.setBounds(527, 305, 203, 14);
		panelLab2.add(lblPerfilSfTipo_10);

		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(752, 302, 35, 20);
		panelLab2.add(textField_51);

		textField_52 = new JTextField();
		textField_52.setColumns(10);
		textField_52.setBounds(789, 302, 35, 20);
		panelLab2.add(textField_52);

		textField_53 = new JTextField();
		textField_53.setColumns(10);
		textField_53.setBounds(834, 302, 167, 20);
		panelLab2.add(textField_53);

		lblPerfilSfTipo_11 = new JLabel("Perfil SF Tipo 10");
		lblPerfilSfTipo_11.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_11.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_11.setBounds(527, 327, 203, 14);
		panelLab2.add(lblPerfilSfTipo_11);

		textField_54 = new JTextField();
		textField_54.setColumns(10);
		textField_54.setBounds(752, 324, 35, 20);
		panelLab2.add(textField_54);

		textField_55 = new JTextField();
		textField_55.setColumns(10);
		textField_55.setBounds(789, 324, 35, 20);
		panelLab2.add(textField_55);

		textField_56 = new JTextField();
		textField_56.setColumns(10);
		textField_56.setBounds(834, 324, 167, 20);
		panelLab2.add(textField_56);

		lblPerfilSfTipo_12 = new JLabel("Perfil SF Tipo 11");
		lblPerfilSfTipo_12.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_12.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_12.setBounds(527, 349, 203, 14);
		panelLab2.add(lblPerfilSfTipo_12);

		textField_57 = new JTextField();
		textField_57.setColumns(10);
		textField_57.setBounds(752, 346, 35, 20);
		panelLab2.add(textField_57);

		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBounds(789, 346, 35, 20);
		panelLab2.add(textField_58);

		textField_59 = new JTextField();
		textField_59.setColumns(10);
		textField_59.setBounds(834, 346, 167, 20);
		panelLab2.add(textField_59);
	}
}
