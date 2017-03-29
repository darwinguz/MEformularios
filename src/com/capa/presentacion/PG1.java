package com.capa.presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PG1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtCantidadHumo1;
	private JTextField txtCantidadHumo2;
	private JTextField txtCantidadKit2;
	private JTextField txtCantidadKit1;
	private JTextField txtCantidadInter1;
	private JTextField txtCantidadInter2;
	private JTextField txtCantidadToma2;
	private JTextField txtCantidadToma1;
	private JTextField txtCantidadLumi1;
	private JTextField txtCantidadLumi2;
	private JTextField txtRefLumi;
	private JTextField txtRefToma;
	private JTextField txtRefInterr;
	private JTextField txtRefKit;
	private JTextField txtRefHumo;
	private JTextField txtCantidadCone1;
	private JTextField txtCantidadCone2;
	private JTextField txtRefCone;
	private JTextField txtRefPVC;
	private JTextField txtCantidadPVC2;
	private JTextField txtCantidadPVC1;
	private JTextField txtCantidadTub1;
	private JTextField txtCantidadTub2;
	private JTextField txtCantidadAcce2;
	private JTextField txtCantidadAcce1;
	private JTextField txtCantidadCanal1;
	private JTextField txtCantidadCanal2;
	private JTextField txtRefCanal;
	private JTextField txtRefAcce;
	private JTextField txtRefTub;
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
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
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
	private JTextField textField_25;
	private JTextField textField_26;
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
	private JLabel lblFachadaLateralIzquierda_1;
	private JLabel lblPanelEpsPared;
	private JLabel lblPanelEpsPared_1;
	private JTextField textField_39;
	private JTextField textField_40;
	private JLabel label_33;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JLabel label_34;
	private JLabel label_17;
	private JLabel lblLuminariasLed;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel lblKitCableElctrico;
	private JLabel label_26;
	private JTextField txtCantHumo1;
	private JTextField txtCantKit1;
	private JTextField txtCantInt1;
	private JTextField txtCantToma1;
	private JTextField txtCantLumi1;
	private JLabel label_27;
	private JTextField txtCantLumi2;
	private JTextField txtCantToma2;
	private JTextField txtCantInt2;
	private JTextField txtCantKit2;
	private JTextField txtCantHumo2;
	private JTextField txtReferHumo;
	private JTextField txtReferKit;
	private JTextField txtRefInt;
	private JTextField txtRefTomacorr;
	private JTextField txtRefLuminarias;
	private JLabel label_28;
	private JLabel lblKitHidrosanitario;
	private JLabel lblInodoros;
	private JLabel lblLava;
	private JTextField txtCantLava1;
	private JTextField txtCantInodoros1;
	private JLabel label_32;
	private JTextField txtCantInodoros2;
	private JTextField txtCantLava2;
	private JTextField txtRefLava;
	private JTextField txtRefInodoros;
	private JLabel label_35;
	private JLabel lblKitAguaPotable;
	private JLabel label_25;
	private JLabel label_31;
	private JTextField txtCantidadAcceAP1;
	private JTextField txtCantidadAcceAP2;
	private JTextField txtRefAcceAP;
	private JLabel label_36;
	private JLabel label_18;
	private JTextField txtCantidadPotable1;
	private JTextField txtCantidadPotable2;
	private JTextField txtRefPotable;
	private JLabel lblTuberaDePvc;
	private JTextField txtCantPVCAP1;
	private JTextField txtCantPVCAP2;
	private JTextField txtRefPVCAP;
	private JLabel lblTuberaDePvc_1;
	private JTextField txtCantTubAP1;
	private JTextField txtCantTubAP2;
	private JTextField txtRefTubAP;
	private JLabel lblkitParaConexin;
	private JTextField txtCantConeTub1;
	private JTextField txtCantConeTub2;
	private JTextField txtRefConeTub;
	private JButton btnSiguiente;
	private JLabel label_37;
	private JLabel lblkitDeAccesorios;
	private JLabel lblTuberaDemm;
	private JLabel lblkitDeAccesorios_1;
	private JLabel label_41;
	private JLabel lblTuberaDePvc_2;
	private JLabel lblkitParaConexin_1;
	private JLabel lblkitParaConexin_2;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField txtCantidadConex1;
	private JTextField txtCantidadConex2;
	private JTextField txtCantidTubAR2;
	private JTextField txtCantidTubAR1;
	private JTextField txtCantiTubAR1;
	private JTextField txtCantiTubAR2;
	private JTextField txtCantAcceInod2;
	private JTextField txtCantAcceInod1;
	private JTextField txtCantTubAR1;
	private JTextField txtCantConeAR1;
	private JTextField txtCantConeAR2;
	private JTextField txtCantTubAR2;
	private JLabel label_45;
	private JLabel label_46;
	private JTextField txtRefConeAR;
	private JTextField txtRefTubAR;
	private JTextField txtRefAcceInod;
	private JTextField txtRefTubARes;
	private JTextField txtRef;
	private JTextField txtRefConex;
	private JTextField textField_65;
	private JLabel label_38;
	private JLabel label_39;
	private JLabel label_40;
	private JLabel lblDadosDeCimentacin;
	private JLabel label_43;
	private JLabel label_44;
	private JLabel label_47;
	private JLabel label_48;
	private JLabel lblPerfilSfTipo;
	private JLabel lblPerfilSfTipo_1;
	private JLabel lblPerfilSfTipo_2;
	private JLabel lblPerfilSfTipo_3;
	private JLabel lblPerfilSfTipo_4;
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
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JLabel lblPortn;
	private JLabel lblLuminariasDePared;
	private JTextField txtCantidadLumP1;
	private JLabel label_50;
	private JTextField txtCantidadLumP2;
	private JTextField txtRefLumP;
	private JLabel label_51;
	private JLabel lblElementoPortn;
	private JTextField txtCantidadPorton1;
	private JTextField txtCantidadPorton2;
	private JTextField txtRefPorton;
	private JLabel lblComponenteArquitectnico;
	private JLabel lblPanelesEpsPared_5;
	private JLabel lblPanelesEpsPared_6;
	private JLabel lblPanelesEpsPared_7;
	private JLabel lblPanelesEpsPared_8;
	private JLabel lblPanelesEpsPared_9;
	private JLabel lblPanelesEpsPared_10;
	private JLabel lblPanelesEpsPared_11;
	private JLabel lblPanelesEpsPared_12;
	private JLabel lblPanelesEpsPared_13;
	private JLabel lblPanelesEpsPared_14;
	private JLabel lblPanelesEpsPared_15;
	private JLabel lblPanelesEpsPared_16;
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
	private JLabel label_63;
	private JTextField textField_90;
	private JTextField textField_91;
	private JTextField textField_92;
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
	private JTextField textField_105;
	private JTextField textField_106;
	private JTextField textField_107;
	private JTextField textField_108;
	private JTextField textField_109;
	private JTextField textField_110;
	private JTextField textField_111;
	private JTextField textField_112;
	private JTextField textField_113;
	private JLabel label_64;
	private JLabel lblPanelesEpsPared_17;
	private JTextField textField_114;
	private JTextField textField_115;
	private JTextField textField_116;
	private JLabel lblPanelesEpsPared_18;
	private JTextField textField_117;
	private JTextField textField_118;
	private JTextField textField_119;
	private JLabel lblComponenteEstructural;
	private JLabel lblDadoCimentacinPortn;
	private JLabel lblPerfilSfTipo_5;
	private JTextField txtCantidadCim1;
	private JLabel label_53;
	private JTextField txtCantidadCim2;
	private JTextField txtCantPerfilPared2;
	private JTextField txtCantPerfilPared1;
	private JTextField txtRefPerfilPared;
	private JTextField txtRefCim;
	private JLabel label_54;
	private JLabel lblPerfilSfTipo_6;
	private JTextField txtCantPerfilPuerta1;
	private JTextField txtCantPerfilPuerta2;
	private JTextField txtRefPerfilPuerta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PG1 frame = new PG1();
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
	public PG1() {
		setTitle("PG_1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1320, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 133, 1468, 619);
		contentPane.add(tabbedPane);

		JPanel panel1 = new JPanel();
		tabbedPane.addTab("1.- PG porton y garita-1", null, panel1, null);
		panel1.setLayout(null);

		JLabel label = new JLabel("KIT EL\u00C9CTRICO");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 11));
		label.setBounds(10, 21, 203, 14);
		panel1.add(label);

		JLabel label_1 = new JLabel("Luminarias LED 60 w - 5000 lum");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("Arial", Font.PLAIN, 11));
		label_1.setBounds(10, 46, 203, 14);
		panel1.add(label_1);

		JLabel label_2 = new JLabel("Tomacorrientes");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setFont(new Font("Arial", Font.PLAIN, 11));
		label_2.setBounds(10, 68, 203, 14);
		panel1.add(label_2);

		JLabel label_3 = new JLabel("Interruptor");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("Arial", Font.PLAIN, 11));
		label_3.setBounds(10, 90, 203, 14);
		panel1.add(label_3);

		JLabel label_4 = new JLabel("Kit cable el\u00E9ctrico MA");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setFont(new Font("Arial", Font.PLAIN, 11));
		label_4.setBounds(10, 112, 203, 14);
		panel1.add(label_4);

		JLabel label_5 = new JLabel("Detector de humo");
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setFont(new Font("Arial", Font.PLAIN, 11));
		label_5.setBounds(10, 134, 203, 14);
		panel1.add(label_5);

		txtCantidadHumo1 = new JTextField();
		txtCantidadHumo1.setColumns(10);
		txtCantidadHumo1.setBounds(223, 131, 35, 20);
		panel1.add(txtCantidadHumo1);

		txtCantidadHumo2 = new JTextField();
		txtCantidadHumo2.setColumns(10);
		txtCantidadHumo2.setBounds(260, 131, 35, 20);
		panel1.add(txtCantidadHumo2);

		txtCantidadKit2 = new JTextField();
		txtCantidadKit2.setColumns(10);
		txtCantidadKit2.setBounds(260, 109, 35, 20);
		panel1.add(txtCantidadKit2);

		txtCantidadKit1 = new JTextField();
		txtCantidadKit1.setColumns(10);
		txtCantidadKit1.setBounds(223, 109, 35, 20);
		panel1.add(txtCantidadKit1);

		txtCantidadInter1 = new JTextField();
		txtCantidadInter1.setColumns(10);
		txtCantidadInter1.setBounds(223, 87, 35, 20);
		panel1.add(txtCantidadInter1);

		txtCantidadInter2 = new JTextField();
		txtCantidadInter2.setColumns(10);
		txtCantidadInter2.setBounds(260, 87, 35, 20);
		panel1.add(txtCantidadInter2);

		txtCantidadToma2 = new JTextField();
		txtCantidadToma2.setColumns(10);
		txtCantidadToma2.setBounds(260, 65, 35, 20);
		panel1.add(txtCantidadToma2);

		txtCantidadToma1 = new JTextField();
		txtCantidadToma1.setColumns(10);
		txtCantidadToma1.setBounds(223, 65, 35, 20);
		panel1.add(txtCantidadToma1);

		txtCantidadLumi1 = new JTextField();
		txtCantidadLumi1.setColumns(10);
		txtCantidadLumi1.setBounds(223, 43, 35, 20);
		panel1.add(txtCantidadLumi1);

		txtCantidadLumi2 = new JTextField();
		txtCantidadLumi2.setColumns(10);
		txtCantidadLumi2.setBounds(260, 43, 35, 20);
		panel1.add(txtCantidadLumi2);

		JLabel label_6 = new JLabel("Cantidad");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Arial", Font.BOLD, 11));
		label_6.setBounds(226, 21, 63, 14);
		panel1.add(label_6);

		JLabel label_7 = new JLabel("Observaci\u00F3n/Referencia");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Arial", Font.BOLD, 11));
		label_7.setBounds(312, 21, 153, 14);
		panel1.add(label_7);

		txtRefLumi = new JTextField();
		txtRefLumi.setColumns(10);
		txtRefLumi.setBounds(305, 43, 167, 20);
		panel1.add(txtRefLumi);

		txtRefToma = new JTextField();
		txtRefToma.setColumns(10);
		txtRefToma.setBounds(305, 65, 167, 20);
		panel1.add(txtRefToma);

		txtRefInterr = new JTextField();
		txtRefInterr.setColumns(10);
		txtRefInterr.setBounds(305, 87, 167, 20);
		panel1.add(txtRefInterr);

		txtRefKit = new JTextField();
		txtRefKit.setColumns(10);
		txtRefKit.setBounds(305, 109, 167, 20);
		panel1.add(txtRefKit);

		txtRefHumo = new JTextField();
		txtRefHumo.setColumns(10);
		txtRefHumo.setBounds(305, 131, 167, 20);
		panel1.add(txtRefHumo);

		JLabel label_8 = new JLabel("KIT AGUA LLUVIA");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Arial", Font.BOLD, 11));
		label_8.setBounds(39, 168, 139, 14);
		panel1.add(label_8);

		JLabel label_9 = new JLabel("Canal pl\u00E1stico PVC de L=3m");
		label_9.setHorizontalAlignment(SwingConstants.LEFT);
		label_9.setFont(new Font("Arial", Font.PLAIN, 11));
		label_9.setBounds(10, 193, 183, 14);
		panel1.add(label_9);

		JLabel label_10 = new JLabel(
				"<html><body>Kit de Accesorios de Conexi\u00F3n Agua de<br>Lluvia (2 rejilla, 4 codos 90\u00B0,1/4 gl<br>polipega, tornillos, abrazaderas</body></html>)");
		label_10.setHorizontalAlignment(SwingConstants.LEFT);
		label_10.setFont(new Font("Arial", Font.PLAIN, 11));
		label_10.setBounds(10, 212, 203, 56);
		panel1.add(label_10);

		JLabel label_11 = new JLabel("Tuber\u00EDa de PVC 75 mm L=3m");
		label_11.setHorizontalAlignment(SwingConstants.LEFT);
		label_11.setFont(new Font("Arial", Font.PLAIN, 11));
		label_11.setBounds(10, 270, 183, 14);
		panel1.add(label_11);

		JLabel label_12 = new JLabel("Tuber\u00EDa de PVC 75 mm L=0.6m");
		label_12.setHorizontalAlignment(SwingConstants.LEFT);
		label_12.setFont(new Font("Arial", Font.PLAIN, 11));
		label_12.setBounds(10, 292, 183, 14);
		panel1.add(label_12);

		JLabel label_13 = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 75 mm. (lija<br>pliego, polipega 1/4gal,1 codo 90\u00B0)</body></html>");
		label_13.setHorizontalAlignment(SwingConstants.LEFT);
		label_13.setFont(new Font("Arial", Font.PLAIN, 11));
		label_13.setBounds(10, 314, 203, 39);
		panel1.add(label_13);

		txtCantidadCone1 = new JTextField();
		txtCantidadCone1.setColumns(10);
		txtCantidadCone1.setBounds(223, 322, 35, 20);
		panel1.add(txtCantidadCone1);

		txtCantidadCone2 = new JTextField();
		txtCantidadCone2.setColumns(10);
		txtCantidadCone2.setBounds(260, 322, 35, 20);
		panel1.add(txtCantidadCone2);

		txtRefCone = new JTextField();
		txtRefCone.setColumns(10);
		txtRefCone.setBounds(305, 322, 167, 20);
		panel1.add(txtRefCone);

		txtRefPVC = new JTextField();
		txtRefPVC.setColumns(10);
		txtRefPVC.setBounds(305, 286, 167, 20);
		panel1.add(txtRefPVC);

		txtCantidadPVC2 = new JTextField();
		txtCantidadPVC2.setColumns(10);
		txtCantidadPVC2.setBounds(260, 286, 35, 20);
		panel1.add(txtCantidadPVC2);

		txtCantidadPVC1 = new JTextField();
		txtCantidadPVC1.setColumns(10);
		txtCantidadPVC1.setBounds(223, 286, 35, 20);
		panel1.add(txtCantidadPVC1);

		txtCantidadTub1 = new JTextField();
		txtCantidadTub1.setColumns(10);
		txtCantidadTub1.setBounds(223, 264, 35, 20);
		panel1.add(txtCantidadTub1);

		txtCantidadTub2 = new JTextField();
		txtCantidadTub2.setColumns(10);
		txtCantidadTub2.setBounds(260, 264, 35, 20);
		panel1.add(txtCantidadTub2);

		txtCantidadAcce2 = new JTextField();
		txtCantidadAcce2.setColumns(10);
		txtCantidadAcce2.setBounds(260, 233, 35, 20);
		panel1.add(txtCantidadAcce2);

		txtCantidadAcce1 = new JTextField();
		txtCantidadAcce1.setColumns(10);
		txtCantidadAcce1.setBounds(223, 233, 35, 20);
		panel1.add(txtCantidadAcce1);

		txtCantidadCanal1 = new JTextField();
		txtCantidadCanal1.setColumns(10);
		txtCantidadCanal1.setBounds(223, 190, 35, 20);
		panel1.add(txtCantidadCanal1);

		txtCantidadCanal2 = new JTextField();
		txtCantidadCanal2.setColumns(10);
		txtCantidadCanal2.setBounds(260, 190, 35, 20);
		panel1.add(txtCantidadCanal2);

		JLabel label_14 = new JLabel("Cantidad");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Arial", Font.BOLD, 11));
		label_14.setBounds(226, 168, 63, 14);
		panel1.add(label_14);

		JLabel label_15 = new JLabel("Observaci\u00F3n/Referencia");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("Arial", Font.BOLD, 11));
		label_15.setBounds(312, 168, 153, 14);
		panel1.add(label_15);

		txtRefCanal = new JTextField();
		txtRefCanal.setColumns(10);
		txtRefCanal.setBounds(305, 190, 167, 20);
		panel1.add(txtRefCanal);

		txtRefAcce = new JTextField();
		txtRefAcce.setColumns(10);
		txtRefAcce.setBounds(305, 233, 167, 20);
		panel1.add(txtRefAcce);

		txtRefTub = new JTextField();
		txtRefTub.setColumns(10);
		txtRefTub.setBounds(305, 264, 167, 20);
		panel1.add(txtRefTub);

		JLabel label_16 = new JLabel("FACHADA FRONTAL");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("Arial", Font.BOLD, 11));
		label_16.setBounds(512, 21, 129, 14);
		panel1.add(label_16);

		JLabel lblPanelesEpsPared = new JLabel("Paneles EPS pared -   ( 1,50x1,10 mt)");
		lblPanelesEpsPared.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared.setBounds(489, 46, 203, 14);
		panel1.add(lblPanelesEpsPared);

		JLabel lblPanelesEpsPared_1 = new JLabel("Paneles EPS pared -   (0,80x1,50 mt)");
		lblPanelesEpsPared_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_1.setBounds(489, 68, 203, 14);
		panel1.add(lblPanelesEpsPared_1);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(702, 65, 35, 20);
		panel1.add(textField);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(702, 43, 35, 20);
		panel1.add(textField_1);

		JLabel label_19 = new JLabel("Cantidad");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("Arial", Font.BOLD, 11));
		label_19.setBounds(705, 21, 63, 14);
		panel1.add(label_19);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(739, 43, 35, 20);
		panel1.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(739, 65, 35, 20);
		panel1.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(784, 65, 167, 20);
		panel1.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(784, 43, 167, 20);
		panel1.add(textField_5);

		JLabel label_20 = new JLabel("Observaci\u00F3n/Referencia");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setFont(new Font("Arial", Font.BOLD, 11));
		label_20.setBounds(791, 21, 153, 14);
		panel1.add(label_20);

		JLabel lblPanelesEpsPared_2 = new JLabel("Paneles EPS pared -   (1,50x2,40 mt)");
		lblPanelesEpsPared_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_2.setBounds(489, 90, 203, 14);
		panel1.add(lblPanelesEpsPared_2);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(702, 87, 35, 20);
		panel1.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(739, 87, 35, 20);
		panel1.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(784, 87, 167, 20);
		panel1.add(textField_8);

		JLabel lblFachadaPosterior = new JLabel("FACHADA POSTERIOR");
		lblFachadaPosterior.setHorizontalAlignment(SwingConstants.CENTER);
		lblFachadaPosterior.setFont(new Font("Arial", Font.BOLD, 11));
		lblFachadaPosterior.setBounds(512, 131, 129, 14);
		panel1.add(lblFachadaPosterior);

		JLabel lblSetPanelesEps = new JLabel("Set Paneles EPS pared -   ( 1,30x1,80 mt)");
		lblSetPanelesEps.setHorizontalAlignment(SwingConstants.LEFT);
		lblSetPanelesEps.setFont(new Font("Arial", Font.PLAIN, 11));
		lblSetPanelesEps.setBounds(489, 156, 203, 14);
		panel1.add(lblSetPanelesEps);

		JLabel lblSetPanelesEps_1 = new JLabel("Set Paneles EPS pared -   ( 0,40x0,45 mt)");
		lblSetPanelesEps_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSetPanelesEps_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblSetPanelesEps_1.setBounds(489, 178, 203, 14);
		panel1.add(lblSetPanelesEps_1);

		JLabel lblPanelAlturaVariable = new JLabel("Panel altura variable \u2013 (ver detalle)");
		lblPanelAlturaVariable.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelAlturaVariable.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelAlturaVariable.setBounds(489, 200, 203, 14);
		panel1.add(lblPanelAlturaVariable);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(702, 197, 35, 20);
		panel1.add(textField_9);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(702, 175, 35, 20);
		panel1.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(702, 153, 35, 20);
		panel1.add(textField_11);

		JLabel label_23 = new JLabel("Cantidad");
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setFont(new Font("Arial", Font.BOLD, 11));
		label_23.setBounds(705, 131, 63, 14);
		panel1.add(label_23);

		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(739, 153, 35, 20);
		panel1.add(textField_12);

		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(739, 175, 35, 20);
		panel1.add(textField_13);

		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(739, 197, 35, 20);
		panel1.add(textField_14);

		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(784, 197, 167, 20);
		panel1.add(textField_15);

		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(784, 175, 167, 20);
		panel1.add(textField_16);

		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(784, 153, 167, 20);
		panel1.add(textField_17);

		JLabel label_24 = new JLabel("Observaci\u00F3n/Referencia");
		label_24.setHorizontalAlignment(SwingConstants.CENTER);
		label_24.setFont(new Font("Arial", Font.BOLD, 11));
		label_24.setBounds(791, 131, 153, 14);
		panel1.add(label_24);

		JLabel lblFachadaLateralIzquierda = new JLabel("FACHADA LATERAL DERECHA");
		lblFachadaLateralIzquierda.setHorizontalAlignment(SwingConstants.CENTER);
		lblFachadaLateralIzquierda.setFont(new Font("Arial", Font.BOLD, 11));
		lblFachadaLateralIzquierda.setBounds(489, 322, 203, 14);
		panel1.add(lblFachadaLateralIzquierda);

		JLabel lblPanelesEpsPared_3 = new JLabel("Paneles EPS pared -   ( 0,70x2,40 mt)");
		lblPanelesEpsPared_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_3.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_3.setBounds(489, 347, 203, 14);
		panel1.add(lblPanelesEpsPared_3);

		JLabel lblPanelEpsPared_2 = new JLabel("Panel EPS- pared ( 0,70x1,10 mt)");
		lblPanelEpsPared_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelEpsPared_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelEpsPared_2.setBounds(489, 369, 203, 14);
		panel1.add(lblPanelEpsPared_2);

		JLabel lblPanelEpsPared_3 = new JLabel("Panel EPS- pared ( 2,30x5 mt)");
		lblPanelEpsPared_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelEpsPared_3.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelEpsPared_3.setBounds(489, 391, 203, 14);
		panel1.add(lblPanelEpsPared_3);

		JLabel lblPanelesTcb = new JLabel("Paneles TCB   ( 2,70x1,30 mt)");
		lblPanelesTcb.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesTcb.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesTcb.setBounds(489, 413, 203, 14);
		panel1.add(lblPanelesTcb);

		JLabel lblPanelesVynilPiso = new JLabel("Paneles vynil piso (0,15x0.65mts)");
		lblPanelesVynilPiso.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesVynilPiso.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesVynilPiso.setBounds(489, 435, 203, 14);
		panel1.add(lblPanelesVynilPiso);

		JLabel lblPanelesEpsPara = new JLabel("Paneles EPS para cubierta L2.5");
		lblPanelesEpsPara.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPara.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPara.setBounds(489, 457, 203, 14);
		panel1.add(lblPanelesEpsPara);

		JLabel lblPanelesEpsPared_4 = new JLabel("Paneles EPS pared -   ( 0,70x2,40 mt)");
		lblPanelesEpsPared_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_4.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_4.setBounds(489, 479, 203, 14);
		panel1.add(lblPanelesEpsPared_4);

		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(702, 476, 35, 20);
		panel1.add(textField_18);

		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(739, 476, 35, 20);
		panel1.add(textField_19);

		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(739, 454, 35, 20);
		panel1.add(textField_20);

		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(702, 454, 35, 20);
		panel1.add(textField_21);

		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(702, 432, 35, 20);
		panel1.add(textField_22);

		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(739, 432, 35, 20);
		panel1.add(textField_23);

		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(739, 410, 35, 20);
		panel1.add(textField_24);

		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(702, 410, 35, 20);
		panel1.add(textField_25);

		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(702, 388, 35, 20);
		panel1.add(textField_26);

		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(702, 366, 35, 20);
		panel1.add(textField_27);

		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(702, 344, 35, 20);
		panel1.add(textField_28);

		JLabel label_29 = new JLabel("Cantidad");
		label_29.setHorizontalAlignment(SwingConstants.CENTER);
		label_29.setFont(new Font("Arial", Font.BOLD, 11));
		label_29.setBounds(705, 322, 63, 14);
		panel1.add(label_29);

		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(739, 344, 35, 20);
		panel1.add(textField_29);

		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(739, 366, 35, 20);
		panel1.add(textField_30);

		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(739, 388, 35, 20);
		panel1.add(textField_31);

		JLabel label_30 = new JLabel("Observaci\u00F3n/Referencia");
		label_30.setHorizontalAlignment(SwingConstants.CENTER);
		label_30.setFont(new Font("Arial", Font.BOLD, 11));
		label_30.setBounds(791, 322, 153, 14);
		panel1.add(label_30);

		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(784, 344, 167, 20);
		panel1.add(textField_32);

		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(784, 366, 167, 20);
		panel1.add(textField_33);

		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(784, 388, 167, 20);
		panel1.add(textField_34);

		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(784, 410, 167, 20);
		panel1.add(textField_35);

		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(784, 432, 167, 20);
		panel1.add(textField_36);

		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(784, 454, 167, 20);
		panel1.add(textField_37);

		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(784, 476, 167, 20);
		panel1.add(textField_38);

		lblFachadaLateralIzquierda_1 = new JLabel("FACHADA LATERAL IZQUIERDA");
		lblFachadaLateralIzquierda_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFachadaLateralIzquierda_1.setFont(new Font("Arial", Font.BOLD, 11));
		lblFachadaLateralIzquierda_1.setBounds(489, 242, 180, 14);
		panel1.add(lblFachadaLateralIzquierda_1);

		lblPanelEpsPared = new JLabel("Panel EPS- pared ( 0,70x0,60 mt)");
		lblPanelEpsPared.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelEpsPared.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelEpsPared.setBounds(489, 267, 203, 14);
		panel1.add(lblPanelEpsPared);

		lblPanelEpsPared_1 = new JLabel("Panel EPS- pared ( 2,20x2,70 mt)");
		lblPanelEpsPared_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelEpsPared_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelEpsPared_1.setBounds(489, 289, 203, 14);
		panel1.add(lblPanelEpsPared_1);

		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(702, 286, 35, 20);
		panel1.add(textField_39);

		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(702, 264, 35, 20);
		panel1.add(textField_40);

		label_33 = new JLabel("Cantidad");
		label_33.setHorizontalAlignment(SwingConstants.CENTER);
		label_33.setFont(new Font("Arial", Font.BOLD, 11));
		label_33.setBounds(705, 242, 63, 14);
		panel1.add(label_33);

		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(739, 264, 35, 20);
		panel1.add(textField_41);

		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(739, 286, 35, 20);
		panel1.add(textField_42);

		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(784, 286, 167, 20);
		panel1.add(textField_43);

		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(784, 264, 167, 20);
		panel1.add(textField_44);

		label_34 = new JLabel("Observaci\u00F3n/Referencia");
		label_34.setHorizontalAlignment(SwingConstants.CENTER);
		label_34.setFont(new Font("Arial", Font.BOLD, 11));
		label_34.setBounds(791, 242, 153, 14);
		panel1.add(label_34);

		label_17 = new JLabel("KIT EL\u00C9CTRICO");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("Arial", Font.BOLD, 11));
		label_17.setBounds(974, 21, 203, 14);
		panel1.add(label_17);

		lblLuminariasLed = new JLabel("Luminarias LED 40 w - 2250 lum");
		lblLuminariasLed.setHorizontalAlignment(SwingConstants.LEFT);
		lblLuminariasLed.setFont(new Font("Arial", Font.PLAIN, 11));
		lblLuminariasLed.setBounds(974, 46, 203, 14);
		panel1.add(lblLuminariasLed);

		label_21 = new JLabel("Tomacorrientes");
		label_21.setHorizontalAlignment(SwingConstants.LEFT);
		label_21.setFont(new Font("Arial", Font.PLAIN, 11));
		label_21.setBounds(974, 68, 203, 14);
		panel1.add(label_21);

		label_22 = new JLabel("Interruptor");
		label_22.setHorizontalAlignment(SwingConstants.LEFT);
		label_22.setFont(new Font("Arial", Font.PLAIN, 11));
		label_22.setBounds(974, 90, 203, 14);
		panel1.add(label_22);

		lblKitCableElctrico = new JLabel("Kit cable el\u00E9ctrico");
		lblKitCableElctrico.setHorizontalAlignment(SwingConstants.LEFT);
		lblKitCableElctrico.setFont(new Font("Arial", Font.PLAIN, 11));
		lblKitCableElctrico.setBounds(974, 112, 203, 14);
		panel1.add(lblKitCableElctrico);

		label_26 = new JLabel("Detector de humo");
		label_26.setHorizontalAlignment(SwingConstants.LEFT);
		label_26.setFont(new Font("Arial", Font.PLAIN, 11));
		label_26.setBounds(974, 134, 203, 14);
		panel1.add(label_26);

		txtCantHumo1 = new JTextField();
		txtCantHumo1.setColumns(10);
		txtCantHumo1.setBounds(1187, 131, 35, 20);
		panel1.add(txtCantHumo1);

		txtCantKit1 = new JTextField();
		txtCantKit1.setColumns(10);
		txtCantKit1.setBounds(1187, 109, 35, 20);
		panel1.add(txtCantKit1);

		txtCantInt1 = new JTextField();
		txtCantInt1.setColumns(10);
		txtCantInt1.setBounds(1187, 87, 35, 20);
		panel1.add(txtCantInt1);

		txtCantToma1 = new JTextField();
		txtCantToma1.setColumns(10);
		txtCantToma1.setBounds(1187, 65, 35, 20);
		panel1.add(txtCantToma1);

		txtCantLumi1 = new JTextField();
		txtCantLumi1.setColumns(10);
		txtCantLumi1.setBounds(1187, 43, 35, 20);
		panel1.add(txtCantLumi1);

		label_27 = new JLabel("Cantidad");
		label_27.setHorizontalAlignment(SwingConstants.CENTER);
		label_27.setFont(new Font("Arial", Font.BOLD, 11));
		label_27.setBounds(1190, 21, 63, 14);
		panel1.add(label_27);

		txtCantLumi2 = new JTextField();
		txtCantLumi2.setColumns(10);
		txtCantLumi2.setBounds(1224, 43, 35, 20);
		panel1.add(txtCantLumi2);

		txtCantToma2 = new JTextField();
		txtCantToma2.setColumns(10);
		txtCantToma2.setBounds(1224, 65, 35, 20);
		panel1.add(txtCantToma2);

		txtCantInt2 = new JTextField();
		txtCantInt2.setColumns(10);
		txtCantInt2.setBounds(1224, 87, 35, 20);
		panel1.add(txtCantInt2);

		txtCantKit2 = new JTextField();
		txtCantKit2.setColumns(10);
		txtCantKit2.setBounds(1224, 109, 35, 20);
		panel1.add(txtCantKit2);

		txtCantHumo2 = new JTextField();
		txtCantHumo2.setColumns(10);
		txtCantHumo2.setBounds(1224, 131, 35, 20);
		panel1.add(txtCantHumo2);

		txtReferHumo = new JTextField();
		txtReferHumo.setColumns(10);
		txtReferHumo.setBounds(1269, 131, 167, 20);
		panel1.add(txtReferHumo);

		txtReferKit = new JTextField();
		txtReferKit.setColumns(10);
		txtReferKit.setBounds(1269, 109, 167, 20);
		panel1.add(txtReferKit);

		txtRefInt = new JTextField();
		txtRefInt.setColumns(10);
		txtRefInt.setBounds(1269, 87, 167, 20);
		panel1.add(txtRefInt);

		txtRefTomacorr = new JTextField();
		txtRefTomacorr.setColumns(10);
		txtRefTomacorr.setBounds(1269, 65, 167, 20);
		panel1.add(txtRefTomacorr);

		txtRefLuminarias = new JTextField();
		txtRefLuminarias.setColumns(10);
		txtRefLuminarias.setBounds(1269, 43, 167, 20);
		panel1.add(txtRefLuminarias);

		label_28 = new JLabel("Observaci\u00F3n/Referencia");
		label_28.setHorizontalAlignment(SwingConstants.CENTER);
		label_28.setFont(new Font("Arial", Font.BOLD, 11));
		label_28.setBounds(1276, 21, 153, 14);
		panel1.add(label_28);

		lblKitHidrosanitario = new JLabel("KIT HIDROSANITARIO");
		lblKitHidrosanitario.setHorizontalAlignment(SwingConstants.CENTER);
		lblKitHidrosanitario.setFont(new Font("Arial", Font.BOLD, 11));
		lblKitHidrosanitario.setBounds(974, 168, 203, 14);
		panel1.add(lblKitHidrosanitario);

		lblInodoros = new JLabel("Inodoros");
		lblInodoros.setHorizontalAlignment(SwingConstants.LEFT);
		lblInodoros.setFont(new Font("Arial", Font.PLAIN, 11));
		lblInodoros.setBounds(974, 193, 203, 14);
		panel1.add(lblInodoros);

		lblLava = new JLabel("Lavabos");
		lblLava.setHorizontalAlignment(SwingConstants.LEFT);
		lblLava.setFont(new Font("Arial", Font.PLAIN, 11));
		lblLava.setBounds(974, 215, 203, 14);
		panel1.add(lblLava);

		txtCantLava1 = new JTextField();
		txtCantLava1.setColumns(10);
		txtCantLava1.setBounds(1187, 212, 35, 20);
		panel1.add(txtCantLava1);

		txtCantInodoros1 = new JTextField();
		txtCantInodoros1.setColumns(10);
		txtCantInodoros1.setBounds(1187, 190, 35, 20);
		panel1.add(txtCantInodoros1);

		label_32 = new JLabel("Cantidad");
		label_32.setHorizontalAlignment(SwingConstants.CENTER);
		label_32.setFont(new Font("Arial", Font.BOLD, 11));
		label_32.setBounds(1190, 168, 63, 14);
		panel1.add(label_32);

		txtCantInodoros2 = new JTextField();
		txtCantInodoros2.setColumns(10);
		txtCantInodoros2.setBounds(1224, 190, 35, 20);
		panel1.add(txtCantInodoros2);

		txtCantLava2 = new JTextField();
		txtCantLava2.setColumns(10);
		txtCantLava2.setBounds(1224, 212, 35, 20);
		panel1.add(txtCantLava2);

		txtRefLava = new JTextField();
		txtRefLava.setColumns(10);
		txtRefLava.setBounds(1269, 212, 167, 20);
		panel1.add(txtRefLava);

		txtRefInodoros = new JTextField();
		txtRefInodoros.setColumns(10);
		txtRefInodoros.setBounds(1269, 190, 167, 20);
		panel1.add(txtRefInodoros);

		label_35 = new JLabel("Observaci\u00F3n/Referencia");
		label_35.setHorizontalAlignment(SwingConstants.CENTER);
		label_35.setFont(new Font("Arial", Font.BOLD, 11));
		label_35.setBounds(1276, 168, 153, 14);
		panel1.add(label_35);

		lblKitAguaPotable = new JLabel("KIT AGUA POTABLE");
		lblKitAguaPotable.setHorizontalAlignment(SwingConstants.CENTER);
		lblKitAguaPotable.setFont(new Font("Arial", Font.BOLD, 11));
		lblKitAguaPotable.setBounds(974, 264, 203, 14);
		panel1.add(lblKitAguaPotable);

		label_25 = new JLabel("Cantidad");
		label_25.setHorizontalAlignment(SwingConstants.CENTER);
		label_25.setFont(new Font("Arial", Font.BOLD, 11));
		label_25.setBounds(1190, 264, 63, 14);
		panel1.add(label_25);

		String textoLabel31 = "<html><body>Kit de Accesorios de Conexi\u00F3n Agua<br>Potable (Inodoros)(1 te reducciones 1-1/2,<br>1 neplos,1 uniones de 1/2,1 codos de<br>"
				+ "90\u00B0,1 mangueras de abasto,1 llave de<br>paso , 1 rollo tefl\u00F3n, 1/2 tubos de pasta<br>selladora)</body></html>";
		label_31 = new JLabel(textoLabel31);
		label_31.setVerticalAlignment(SwingConstants.TOP);
		label_31.setHorizontalAlignment(SwingConstants.LEFT);
		label_31.setFont(new Font("Arial", Font.PLAIN, 11));
		label_31.setBounds(974, 289, 214, 94);
		panel1.add(label_31);

		txtCantidadAcceAP1 = new JTextField();
		txtCantidadAcceAP1.setColumns(10);
		txtCantidadAcceAP1.setBounds(1187, 322, 35, 20);
		panel1.add(txtCantidadAcceAP1);

		txtCantidadAcceAP2 = new JTextField();
		txtCantidadAcceAP2.setColumns(10);
		txtCantidadAcceAP2.setBounds(1224, 322, 35, 20);
		panel1.add(txtCantidadAcceAP2);

		txtRefAcceAP = new JTextField();
		txtRefAcceAP.setColumns(10);
		txtRefAcceAP.setBounds(1269, 322, 167, 20);
		panel1.add(txtRefAcceAP);

		label_36 = new JLabel("Observaci\u00F3n/Referencia");
		label_36.setHorizontalAlignment(SwingConstants.CENTER);
		label_36.setFont(new Font("Arial", Font.BOLD, 11));
		label_36.setBounds(1276, 264, 153, 14);
		panel1.add(label_36);

		String textoLabel18 = "<html><body>Potable (Lavabos)(1  te 1/2\"  ,  1 neplos,1<br>unión de 1/2,1 codo de 90\u00B0,1 manguera de<br>abasto,1 llave de paso, teflón, pasta<br>"
				+ "selladora)</body></html>";
		label_18 = new JLabel(textoLabel18);
		label_18.setVerticalAlignment(SwingConstants.TOP);
		label_18.setHorizontalAlignment(SwingConstants.LEFT);
		label_18.setFont(new Font("Arial", Font.PLAIN, 11));
		label_18.setBounds(974, 391, 214, 70);
		panel1.add(label_18);

		txtCantidadPotable1 = new JTextField();
		txtCantidadPotable1.setColumns(10);
		txtCantidadPotable1.setBounds(1187, 407, 35, 20);
		panel1.add(txtCantidadPotable1);

		txtCantidadPotable2 = new JTextField();
		txtCantidadPotable2.setColumns(10);
		txtCantidadPotable2.setBounds(1224, 407, 35, 20);
		panel1.add(txtCantidadPotable2);

		txtRefPotable = new JTextField();
		txtRefPotable.setColumns(10);
		txtRefPotable.setBounds(1269, 407, 167, 20);
		panel1.add(txtRefPotable);

		lblTuberaDePvc = new JLabel("Tuber\u00EDa de PVC 1/2\" y L=3m");
		lblTuberaDePvc.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberaDePvc.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberaDePvc.setBounds(974, 460, 183, 14);
		panel1.add(lblTuberaDePvc);

		txtCantPVCAP1 = new JTextField();
		txtCantPVCAP1.setColumns(10);
		txtCantPVCAP1.setBounds(1187, 457, 35, 20);
		panel1.add(txtCantPVCAP1);

		txtCantPVCAP2 = new JTextField();
		txtCantPVCAP2.setColumns(10);
		txtCantPVCAP2.setBounds(1224, 457, 35, 20);
		panel1.add(txtCantPVCAP2);

		txtRefPVCAP = new JTextField();
		txtRefPVCAP.setColumns(10);
		txtRefPVCAP.setBounds(1269, 457, 167, 20);
		panel1.add(txtRefPVCAP);

		lblTuberaDePvc_1 = new JLabel("Tuber\u00EDa de PVC 3/4\" y L=3m");
		lblTuberaDePvc_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberaDePvc_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberaDePvc_1.setBounds(974, 482, 183, 14);
		panel1.add(lblTuberaDePvc_1);

		txtCantTubAP1 = new JTextField();
		txtCantTubAP1.setColumns(10);
		txtCantTubAP1.setBounds(1187, 479, 35, 20);
		panel1.add(txtCantTubAP1);

		txtCantTubAP2 = new JTextField();
		txtCantTubAP2.setColumns(10);
		txtCantTubAP2.setBounds(1224, 479, 35, 20);
		panel1.add(txtCantTubAP2);

		txtRefTubAP = new JTextField();
		txtRefTubAP.setColumns(10);
		txtRefTubAP.setBounds(1269, 479, 167, 20);
		panel1.add(txtRefTubAP);

		lblkitParaConexin = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 1/2\". (lija<br>pliego, polipega 1/4gal,1 uni\u00F3n)</body></html>");
		lblkitParaConexin.setHorizontalAlignment(SwingConstants.LEFT);
		lblkitParaConexin.setFont(new Font("Arial", Font.PLAIN, 11));
		lblkitParaConexin.setBounds(974, 507, 203, 39);
		panel1.add(lblkitParaConexin);

		txtCantConeTub1 = new JTextField();
		txtCantConeTub1.setColumns(10);
		txtCantConeTub1.setBounds(1187, 515, 35, 20);
		panel1.add(txtCantConeTub1);

		txtCantConeTub2 = new JTextField();
		txtCantConeTub2.setColumns(10);
		txtCantConeTub2.setBounds(1224, 515, 35, 20);
		panel1.add(txtCantConeTub2);

		txtRefConeTub = new JTextField();
		txtRefConeTub.setColumns(10);
		txtRefConeTub.setBounds(1269, 515, 167, 20);
		panel1.add(txtRefConeTub);

		btnSiguiente = new JButton("Siguiente p\u00E1gina");
		btnSiguiente.setBounds(1224, 557, 122, 23);
		panel1.add(btnSiguiente);

		JPanel panel2 = new JPanel();
		tabbedPane.addTab("2.-PG porton y garita-1", null, panel2, null);
		panel2.setLayout(null);

		label_37 = new JLabel("KIT AGUA RESIDUAL");
		label_37.setHorizontalAlignment(SwingConstants.CENTER);
		label_37.setFont(new Font("Arial", Font.BOLD, 11));
		label_37.setBounds(24, 23, 139, 14);
		panel2.add(label_37);

		lblkitDeAccesorios = new JLabel(
				"<html><body>Kit de Accesorios de Conexi\u00F3n Agua<br>Residual (Lavabos)(4 codo 90\u00B0,1/4 gl<br>polipega ,4 yee 50-110)</body></html>");
		lblkitDeAccesorios.setVerticalAlignment(SwingConstants.TOP);
		lblkitDeAccesorios.setHorizontalAlignment(SwingConstants.LEFT);
		lblkitDeAccesorios.setFont(new Font("Arial", Font.PLAIN, 11));
		lblkitDeAccesorios.setBounds(10, 48, 203, 50);
		panel2.add(lblkitDeAccesorios);

		lblTuberaDemm = new JLabel("Tuber\u00EDa de 50mm PVC y L=3m");
		lblTuberaDemm.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberaDemm.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberaDemm.setBounds(10, 101, 183, 14);
		panel2.add(lblTuberaDemm);

		lblkitDeAccesorios_1 = new JLabel(
				"<html><body>Kit de Accesorios de Conexi\u00F3n Agua<br>Residual (Inodoros)(1/4 gl polipega ,4 yee<br>110)</body></html>");
		lblkitDeAccesorios_1.setVerticalAlignment(SwingConstants.TOP);
		lblkitDeAccesorios_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblkitDeAccesorios_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblkitDeAccesorios_1.setBounds(10, 124, 203, 50);
		panel2.add(lblkitDeAccesorios_1);

		label_41 = new JLabel("Tuber\u00EDa de 75mm PVC y L=3m");
		label_41.setHorizontalAlignment(SwingConstants.LEFT);
		label_41.setFont(new Font("Arial", Font.PLAIN, 11));
		label_41.setBounds(10, 177, 183, 14);
		panel2.add(label_41);

		lblTuberaDePvc_2 = new JLabel("Tuber\u00EDa de PVC 110mm PVC y L=3m");
		lblTuberaDePvc_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberaDePvc_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberaDePvc_2.setBounds(10, 199, 183, 14);
		panel2.add(lblTuberaDePvc_2);

		lblkitParaConexin_1 = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 50 mm. (lija<br>un pliego, polipega 1/4 gal, 1/4 gl suelda<br>l\u00EDquida, 1 uni\u00F3n,1codo 90\u00B0,1codo 45\u00B0)");
		lblkitParaConexin_1.setVerticalAlignment(SwingConstants.TOP);
		lblkitParaConexin_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblkitParaConexin_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblkitParaConexin_1.setBounds(10, 224, 203, 50);
		panel2.add(lblkitParaConexin_1);

		lblkitParaConexin_2 = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 110 mm. (lija<br>pliego, polipega 1/2gal, 1/4 gl suelda<br>l\u00EDquida , 1 union,1codo 90\u00B0,1codo 45\u00B0)</body></html>");
		lblkitParaConexin_2.setVerticalAlignment(SwingConstants.TOP);
		lblkitParaConexin_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblkitParaConexin_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblkitParaConexin_2.setBounds(10, 278, 203, 50);
		panel2.add(lblkitParaConexin_2);

		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(223, 289, 35, 20);
		panel2.add(textField_45);

		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(260, 289, 35, 20);
		panel2.add(textField_46);

		txtCantidadConex1 = new JTextField();
		txtCantidadConex1.setColumns(10);
		txtCantidadConex1.setBounds(223, 235, 35, 20);
		panel2.add(txtCantidadConex1);

		txtCantidadConex2 = new JTextField();
		txtCantidadConex2.setColumns(10);
		txtCantidadConex2.setBounds(260, 235, 35, 20);
		panel2.add(txtCantidadConex2);

		txtCantidTubAR2 = new JTextField();
		txtCantidTubAR2.setColumns(10);
		txtCantidTubAR2.setBounds(260, 196, 35, 20);
		panel2.add(txtCantidTubAR2);

		txtCantidTubAR1 = new JTextField();
		txtCantidTubAR1.setColumns(10);
		txtCantidTubAR1.setBounds(223, 196, 35, 20);
		panel2.add(txtCantidTubAR1);

		txtCantiTubAR1 = new JTextField();
		txtCantiTubAR1.setColumns(10);
		txtCantiTubAR1.setBounds(223, 174, 35, 20);
		panel2.add(txtCantiTubAR1);

		txtCantiTubAR2 = new JTextField();
		txtCantiTubAR2.setColumns(10);
		txtCantiTubAR2.setBounds(260, 174, 35, 20);
		panel2.add(txtCantiTubAR2);

		txtCantAcceInod2 = new JTextField();
		txtCantAcceInod2.setColumns(10);
		txtCantAcceInod2.setBounds(260, 135, 35, 20);
		panel2.add(txtCantAcceInod2);

		txtCantAcceInod1 = new JTextField();
		txtCantAcceInod1.setColumns(10);
		txtCantAcceInod1.setBounds(223, 135, 35, 20);
		panel2.add(txtCantAcceInod1);

		txtCantTubAR1 = new JTextField();
		txtCantTubAR1.setColumns(10);
		txtCantTubAR1.setBounds(223, 98, 35, 20);
		panel2.add(txtCantTubAR1);

		txtCantConeAR1 = new JTextField();
		txtCantConeAR1.setColumns(10);
		txtCantConeAR1.setBounds(223, 59, 35, 20);
		panel2.add(txtCantConeAR1);

		txtCantConeAR2 = new JTextField();
		txtCantConeAR2.setColumns(10);
		txtCantConeAR2.setBounds(260, 59, 35, 20);
		panel2.add(txtCantConeAR2);

		txtCantTubAR2 = new JTextField();
		txtCantTubAR2.setColumns(10);
		txtCantTubAR2.setBounds(260, 98, 35, 20);
		panel2.add(txtCantTubAR2);

		label_45 = new JLabel("Cantidad");
		label_45.setHorizontalAlignment(SwingConstants.CENTER);
		label_45.setFont(new Font("Arial", Font.BOLD, 11));
		label_45.setBounds(227, 23, 63, 14);
		panel2.add(label_45);

		label_46 = new JLabel("Observaci\u00F3n/Referencia");
		label_46.setHorizontalAlignment(SwingConstants.CENTER);
		label_46.setFont(new Font("Arial", Font.BOLD, 11));
		label_46.setBounds(313, 23, 153, 14);
		panel2.add(label_46);

		txtRefConeAR = new JTextField();
		txtRefConeAR.setColumns(10);
		txtRefConeAR.setBounds(305, 59, 167, 20);
		panel2.add(txtRefConeAR);

		txtRefTubAR = new JTextField();
		txtRefTubAR.setColumns(10);
		txtRefTubAR.setBounds(305, 98, 167, 20);
		panel2.add(txtRefTubAR);

		txtRefAcceInod = new JTextField();
		txtRefAcceInod.setColumns(10);
		txtRefAcceInod.setBounds(305, 135, 167, 20);
		panel2.add(txtRefAcceInod);

		txtRefTubARes = new JTextField();
		txtRefTubARes.setColumns(10);
		txtRefTubARes.setBounds(305, 174, 167, 20);
		panel2.add(txtRefTubARes);

		txtRef = new JTextField();
		txtRef.setColumns(10);
		txtRef.setBounds(305, 196, 167, 20);
		panel2.add(txtRef);

		txtRefConex = new JTextField();
		txtRefConex.setColumns(10);
		txtRefConex.setBounds(305, 235, 167, 20);
		panel2.add(txtRefConex);

		textField_65 = new JTextField();
		textField_65.setColumns(10);
		textField_65.setBounds(305, 289, 167, 20);
		panel2.add(textField_65);

		label_38 = new JLabel("COMPONENTE ESTRUCTURAL");
		label_38.setHorizontalAlignment(SwingConstants.CENTER);
		label_38.setFont(new Font("Arial", Font.BOLD, 11));
		label_38.setBounds(10, 340, 203, 14);
		panel2.add(label_38);

		label_39 = new JLabel("Cantidad");
		label_39.setHorizontalAlignment(SwingConstants.CENTER);
		label_39.setFont(new Font("Arial", Font.BOLD, 11));
		label_39.setBounds(227, 340, 63, 14);
		panel2.add(label_39);

		label_40 = new JLabel("Observaci\u00F3n/Referencia");
		label_40.setHorizontalAlignment(SwingConstants.CENTER);
		label_40.setFont(new Font("Arial", Font.BOLD, 11));
		label_40.setBounds(313, 340, 153, 14);
		panel2.add(label_40);

		lblDadosDeCimentacin = new JLabel("Dados de cimentaci\u00F3n garita");
		lblDadosDeCimentacin.setHorizontalAlignment(SwingConstants.LEFT);
		lblDadosDeCimentacin.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDadosDeCimentacin.setBounds(10, 365, 203, 14);
		panel2.add(lblDadosDeCimentacin);

		label_43 = new JLabel("Perfil SF Tipo 1");
		label_43.setHorizontalAlignment(SwingConstants.LEFT);
		label_43.setFont(new Font("Arial", Font.PLAIN, 11));
		label_43.setBounds(10, 387, 203, 14);
		panel2.add(label_43);

		label_44 = new JLabel("Perfil SF Tipo 2");
		label_44.setHorizontalAlignment(SwingConstants.LEFT);
		label_44.setFont(new Font("Arial", Font.PLAIN, 11));
		label_44.setBounds(10, 409, 203, 14);
		panel2.add(label_44);

		label_47 = new JLabel("Perfil SF Tipo 3");
		label_47.setHorizontalAlignment(SwingConstants.LEFT);
		label_47.setFont(new Font("Arial", Font.PLAIN, 11));
		label_47.setBounds(10, 431, 203, 14);
		panel2.add(label_47);

		label_48 = new JLabel("Perfil SF Tipo 4");
		label_48.setHorizontalAlignment(SwingConstants.LEFT);
		label_48.setFont(new Font("Arial", Font.PLAIN, 11));
		label_48.setBounds(10, 453, 203, 14);
		panel2.add(label_48);

		lblPerfilSfTipo = new JLabel("Perfil SF Tipo 6");
		lblPerfilSfTipo.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo.setBounds(10, 475, 203, 14);
		panel2.add(lblPerfilSfTipo);

		lblPerfilSfTipo_1 = new JLabel("Perfil SF Tipo 7");
		lblPerfilSfTipo_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_1.setBounds(10, 497, 203, 14);
		panel2.add(lblPerfilSfTipo_1);

		lblPerfilSfTipo_2 = new JLabel("Perfil SF Tipo 8");
		lblPerfilSfTipo_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_2.setBounds(10, 519, 203, 14);
		panel2.add(lblPerfilSfTipo_2);

		lblPerfilSfTipo_3 = new JLabel("Perfil SF Tipo 9");
		lblPerfilSfTipo_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_3.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_3.setBounds(10, 541, 203, 14);
		panel2.add(lblPerfilSfTipo_3);

		lblPerfilSfTipo_4 = new JLabel("Perfil SF Tipo 11");
		lblPerfilSfTipo_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_4.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_4.setBounds(10, 563, 203, 14);
		panel2.add(lblPerfilSfTipo_4);

		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(223, 560, 35, 20);
		panel2.add(textField_47);

		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(223, 538, 35, 20);
		panel2.add(textField_48);

		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(223, 516, 35, 20);
		panel2.add(textField_49);

		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(223, 494, 35, 20);
		panel2.add(textField_50);

		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(223, 472, 35, 20);
		panel2.add(textField_51);

		textField_52 = new JTextField();
		textField_52.setColumns(10);
		textField_52.setBounds(223, 450, 35, 20);
		panel2.add(textField_52);

		textField_53 = new JTextField();
		textField_53.setColumns(10);
		textField_53.setBounds(223, 428, 35, 20);
		panel2.add(textField_53);

		textField_54 = new JTextField();
		textField_54.setColumns(10);
		textField_54.setBounds(223, 406, 35, 20);
		panel2.add(textField_54);

		textField_55 = new JTextField();
		textField_55.setColumns(10);
		textField_55.setBounds(223, 384, 35, 20);
		panel2.add(textField_55);

		textField_56 = new JTextField();
		textField_56.setColumns(10);
		textField_56.setBounds(223, 362, 35, 20);
		panel2.add(textField_56);

		textField_57 = new JTextField();
		textField_57.setColumns(10);
		textField_57.setBounds(260, 362, 35, 20);
		panel2.add(textField_57);

		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBounds(260, 384, 35, 20);
		panel2.add(textField_58);

		textField_59 = new JTextField();
		textField_59.setColumns(10);
		textField_59.setBounds(260, 406, 35, 20);
		panel2.add(textField_59);

		textField_60 = new JTextField();
		textField_60.setColumns(10);
		textField_60.setBounds(260, 428, 35, 20);
		panel2.add(textField_60);

		textField_61 = new JTextField();
		textField_61.setColumns(10);
		textField_61.setBounds(260, 450, 35, 20);
		panel2.add(textField_61);

		textField_62 = new JTextField();
		textField_62.setColumns(10);
		textField_62.setBounds(260, 472, 35, 20);
		panel2.add(textField_62);

		textField_63 = new JTextField();
		textField_63.setColumns(10);
		textField_63.setBounds(260, 494, 35, 20);
		panel2.add(textField_63);

		textField_64 = new JTextField();
		textField_64.setColumns(10);
		textField_64.setBounds(260, 516, 35, 20);
		panel2.add(textField_64);

		textField_66 = new JTextField();
		textField_66.setColumns(10);
		textField_66.setBounds(260, 538, 35, 20);
		panel2.add(textField_66);

		textField_67 = new JTextField();
		textField_67.setColumns(10);
		textField_67.setBounds(260, 560, 35, 20);
		panel2.add(textField_67);

		textField_68 = new JTextField();
		textField_68.setColumns(10);
		textField_68.setBounds(305, 560, 167, 20);
		panel2.add(textField_68);

		textField_69 = new JTextField();
		textField_69.setColumns(10);
		textField_69.setBounds(305, 538, 167, 20);
		panel2.add(textField_69);

		textField_70 = new JTextField();
		textField_70.setColumns(10);
		textField_70.setBounds(305, 516, 167, 20);
		panel2.add(textField_70);

		textField_71 = new JTextField();
		textField_71.setColumns(10);
		textField_71.setBounds(305, 494, 167, 20);
		panel2.add(textField_71);

		textField_72 = new JTextField();
		textField_72.setColumns(10);
		textField_72.setBounds(305, 472, 167, 20);
		panel2.add(textField_72);

		textField_73 = new JTextField();
		textField_73.setColumns(10);
		textField_73.setBounds(305, 450, 167, 20);
		panel2.add(textField_73);

		textField_74 = new JTextField();
		textField_74.setColumns(10);
		textField_74.setBounds(305, 428, 167, 20);
		panel2.add(textField_74);

		textField_75 = new JTextField();
		textField_75.setColumns(10);
		textField_75.setBounds(305, 406, 167, 20);
		panel2.add(textField_75);

		textField_76 = new JTextField();
		textField_76.setColumns(10);
		textField_76.setBounds(305, 384, 167, 20);
		panel2.add(textField_76);

		textField_77 = new JTextField();
		textField_77.setColumns(10);
		textField_77.setBounds(305, 362, 167, 20);
		panel2.add(textField_77);

		lblPortn = new JLabel("PORT\u00D3N");
		lblPortn.setHorizontalAlignment(SwingConstants.CENTER);
		lblPortn.setFont(new Font("Arial", Font.BOLD, 11));
		lblPortn.setBounds(495, 23, 203, 14);
		panel2.add(lblPortn);

		lblLuminariasDePared = new JLabel("Luminarias de pared LED 40 w - 2250 lum");
		lblLuminariasDePared.setHorizontalAlignment(SwingConstants.LEFT);
		lblLuminariasDePared.setFont(new Font("Arial", Font.PLAIN, 11));
		lblLuminariasDePared.setBounds(495, 48, 203, 14);
		panel2.add(lblLuminariasDePared);

		txtCantidadLumP1 = new JTextField();
		txtCantidadLumP1.setColumns(10);
		txtCantidadLumP1.setBounds(708, 45, 35, 20);
		panel2.add(txtCantidadLumP1);

		label_50 = new JLabel("Cantidad");
		label_50.setHorizontalAlignment(SwingConstants.CENTER);
		label_50.setFont(new Font("Arial", Font.BOLD, 11));
		label_50.setBounds(711, 23, 63, 14);
		panel2.add(label_50);

		txtCantidadLumP2 = new JTextField();
		txtCantidadLumP2.setColumns(10);
		txtCantidadLumP2.setBounds(745, 45, 35, 20);
		panel2.add(txtCantidadLumP2);

		txtRefLumP = new JTextField();
		txtRefLumP.setColumns(10);
		txtRefLumP.setBounds(790, 45, 167, 20);
		panel2.add(txtRefLumP);

		label_51 = new JLabel("Observaci\u00F3n/Referencia");
		label_51.setHorizontalAlignment(SwingConstants.CENTER);
		label_51.setFont(new Font("Arial", Font.BOLD, 11));
		label_51.setBounds(797, 23, 153, 14);
		panel2.add(label_51);

		lblElementoPortn = new JLabel("Elemento Port\u00F3n - (2,55x2,15 mts)");
		lblElementoPortn.setHorizontalAlignment(SwingConstants.LEFT);
		lblElementoPortn.setFont(new Font("Arial", Font.PLAIN, 11));
		lblElementoPortn.setBounds(495, 70, 203, 14);
		panel2.add(lblElementoPortn);

		txtCantidadPorton1 = new JTextField();
		txtCantidadPorton1.setColumns(10);
		txtCantidadPorton1.setBounds(708, 67, 35, 20);
		panel2.add(txtCantidadPorton1);

		txtCantidadPorton2 = new JTextField();
		txtCantidadPorton2.setColumns(10);
		txtCantidadPorton2.setBounds(745, 67, 35, 20);
		panel2.add(txtCantidadPorton2);

		txtRefPorton = new JTextField();
		txtRefPorton.setColumns(10);
		txtRefPorton.setBounds(790, 67, 167, 20);
		panel2.add(txtRefPorton);

		lblComponenteArquitectnico = new JLabel("COMPONENTE ARQUITECT\u00D3NICO");
		lblComponenteArquitectnico.setHorizontalAlignment(SwingConstants.CENTER);
		lblComponenteArquitectnico.setFont(new Font("Arial", Font.BOLD, 11));
		lblComponenteArquitectnico.setBounds(495, 101, 203, 14);
		panel2.add(lblComponenteArquitectnico);

		lblPanelesEpsPared_5 = new JLabel("Paneles EPS pared port\u00F3n- (2,50x1,52 mt)");
		lblPanelesEpsPared_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_5.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_5.setBounds(495, 126, 203, 14);
		panel2.add(lblPanelesEpsPared_5);

		lblPanelesEpsPared_6 = new JLabel("Paneles EPS pared port\u00F3n- (2,50x0,.65)");
		lblPanelesEpsPared_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_6.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_6.setBounds(495, 148, 203, 14);
		panel2.add(lblPanelesEpsPared_6);

		lblPanelesEpsPared_7 = new JLabel("Paneles EPS pared port\u00F3n- (1,0x0,35 mt)");
		lblPanelesEpsPared_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_7.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_7.setBounds(495, 170, 203, 14);
		panel2.add(lblPanelesEpsPared_7);

		lblPanelesEpsPared_8 = new JLabel("Paneles EPS pared port\u00F3n- (1,20x4,0 mt)");
		lblPanelesEpsPared_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_8.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_8.setBounds(495, 192, 203, 14);
		panel2.add(lblPanelesEpsPared_8);

		lblPanelesEpsPared_9 = new JLabel("Paneles EPS pared port\u00F3n- (1,0x1,0 mt)");
		lblPanelesEpsPared_9.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_9.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_9.setBounds(495, 214, 203, 14);
		panel2.add(lblPanelesEpsPared_9);

		lblPanelesEpsPared_10 = new JLabel("Paneles EPS pared port\u00F3n- (1,0x0,85 mt)");
		lblPanelesEpsPared_10.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_10.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_10.setBounds(495, 236, 203, 14);
		panel2.add(lblPanelesEpsPared_10);

		lblPanelesEpsPared_11 = new JLabel("Paneles EPS pared port\u00F3n- (0,42x3,0 mt)");
		lblPanelesEpsPared_11.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_11.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_11.setBounds(495, 258, 203, 14);
		panel2.add(lblPanelesEpsPared_11);

		lblPanelesEpsPared_12 = new JLabel("Paneles EPS pared port\u00F3n- (0,55x0,85 mt)");
		lblPanelesEpsPared_12.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_12.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_12.setBounds(495, 280, 203, 14);
		panel2.add(lblPanelesEpsPared_12);

		lblPanelesEpsPared_13 = new JLabel("Paneles EPS pared port\u00F3n- (0,30x3,0 mt)");
		lblPanelesEpsPared_13.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_13.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_13.setBounds(495, 302, 203, 14);
		panel2.add(lblPanelesEpsPared_13);

		lblPanelesEpsPared_14 = new JLabel("Paneles EPS pared port\u00F3n- (0,6x2,5 mt)");
		lblPanelesEpsPared_14.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_14.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_14.setBounds(495, 324, 203, 14);
		panel2.add(lblPanelesEpsPared_14);

		lblPanelesEpsPared_15 = new JLabel("Paneles EPS pared port\u00F3n- (1,50x2,50 mt)");
		lblPanelesEpsPared_15.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_15.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_15.setBounds(495, 346, 203, 14);
		panel2.add(lblPanelesEpsPared_15);

		lblPanelesEpsPared_16 = new JLabel("Paneles EPS pared port\u00F3n- (2,50x1,52 mt)");
		lblPanelesEpsPared_16.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_16.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_16.setBounds(495, 368, 203, 14);
		panel2.add(lblPanelesEpsPared_16);

		textField_78 = new JTextField();
		textField_78.setColumns(10);
		textField_78.setBounds(708, 365, 35, 20);
		panel2.add(textField_78);

		textField_79 = new JTextField();
		textField_79.setColumns(10);
		textField_79.setBounds(708, 343, 35, 20);
		panel2.add(textField_79);

		textField_80 = new JTextField();
		textField_80.setColumns(10);
		textField_80.setBounds(708, 321, 35, 20);
		panel2.add(textField_80);

		textField_81 = new JTextField();
		textField_81.setColumns(10);
		textField_81.setBounds(708, 299, 35, 20);
		panel2.add(textField_81);

		textField_82 = new JTextField();
		textField_82.setColumns(10);
		textField_82.setBounds(708, 277, 35, 20);
		panel2.add(textField_82);

		textField_83 = new JTextField();
		textField_83.setColumns(10);
		textField_83.setBounds(708, 255, 35, 20);
		panel2.add(textField_83);

		textField_84 = new JTextField();
		textField_84.setColumns(10);
		textField_84.setBounds(708, 233, 35, 20);
		panel2.add(textField_84);

		textField_85 = new JTextField();
		textField_85.setColumns(10);
		textField_85.setBounds(708, 211, 35, 20);
		panel2.add(textField_85);

		textField_86 = new JTextField();
		textField_86.setColumns(10);
		textField_86.setBounds(708, 189, 35, 20);
		panel2.add(textField_86);

		textField_87 = new JTextField();
		textField_87.setColumns(10);
		textField_87.setBounds(708, 167, 35, 20);
		panel2.add(textField_87);

		textField_88 = new JTextField();
		textField_88.setColumns(10);
		textField_88.setBounds(708, 145, 35, 20);
		panel2.add(textField_88);

		textField_89 = new JTextField();
		textField_89.setColumns(10);
		textField_89.setBounds(708, 123, 35, 20);
		panel2.add(textField_89);

		label_63 = new JLabel("Cantidad");
		label_63.setHorizontalAlignment(SwingConstants.CENTER);
		label_63.setFont(new Font("Arial", Font.BOLD, 11));
		label_63.setBounds(711, 101, 63, 14);
		panel2.add(label_63);

		textField_90 = new JTextField();
		textField_90.setColumns(10);
		textField_90.setBounds(745, 123, 35, 20);
		panel2.add(textField_90);

		textField_91 = new JTextField();
		textField_91.setColumns(10);
		textField_91.setBounds(745, 145, 35, 20);
		panel2.add(textField_91);

		textField_92 = new JTextField();
		textField_92.setColumns(10);
		textField_92.setBounds(745, 167, 35, 20);
		panel2.add(textField_92);

		textField_93 = new JTextField();
		textField_93.setColumns(10);
		textField_93.setBounds(745, 189, 35, 20);
		panel2.add(textField_93);

		textField_94 = new JTextField();
		textField_94.setColumns(10);
		textField_94.setBounds(745, 211, 35, 20);
		panel2.add(textField_94);

		textField_95 = new JTextField();
		textField_95.setColumns(10);
		textField_95.setBounds(745, 233, 35, 20);
		panel2.add(textField_95);

		textField_96 = new JTextField();
		textField_96.setColumns(10);
		textField_96.setBounds(745, 255, 35, 20);
		panel2.add(textField_96);

		textField_97 = new JTextField();
		textField_97.setColumns(10);
		textField_97.setBounds(745, 277, 35, 20);
		panel2.add(textField_97);

		textField_98 = new JTextField();
		textField_98.setColumns(10);
		textField_98.setBounds(745, 299, 35, 20);
		panel2.add(textField_98);

		textField_99 = new JTextField();
		textField_99.setColumns(10);
		textField_99.setBounds(745, 321, 35, 20);
		panel2.add(textField_99);

		textField_100 = new JTextField();
		textField_100.setColumns(10);
		textField_100.setBounds(745, 343, 35, 20);
		panel2.add(textField_100);

		textField_101 = new JTextField();
		textField_101.setColumns(10);
		textField_101.setBounds(745, 365, 35, 20);
		panel2.add(textField_101);

		textField_102 = new JTextField();
		textField_102.setColumns(10);
		textField_102.setBounds(790, 365, 167, 20);
		panel2.add(textField_102);

		textField_103 = new JTextField();
		textField_103.setColumns(10);
		textField_103.setBounds(790, 343, 167, 20);
		panel2.add(textField_103);

		textField_104 = new JTextField();
		textField_104.setColumns(10);
		textField_104.setBounds(790, 321, 167, 20);
		panel2.add(textField_104);

		textField_105 = new JTextField();
		textField_105.setColumns(10);
		textField_105.setBounds(790, 299, 167, 20);
		panel2.add(textField_105);

		textField_106 = new JTextField();
		textField_106.setColumns(10);
		textField_106.setBounds(790, 277, 167, 20);
		panel2.add(textField_106);

		textField_107 = new JTextField();
		textField_107.setColumns(10);
		textField_107.setBounds(790, 255, 167, 20);
		panel2.add(textField_107);

		textField_108 = new JTextField();
		textField_108.setColumns(10);
		textField_108.setBounds(790, 233, 167, 20);
		panel2.add(textField_108);

		textField_109 = new JTextField();
		textField_109.setColumns(10);
		textField_109.setBounds(790, 211, 167, 20);
		panel2.add(textField_109);

		textField_110 = new JTextField();
		textField_110.setColumns(10);
		textField_110.setBounds(790, 189, 167, 20);
		panel2.add(textField_110);

		textField_111 = new JTextField();
		textField_111.setColumns(10);
		textField_111.setBounds(790, 167, 167, 20);
		panel2.add(textField_111);

		textField_112 = new JTextField();
		textField_112.setColumns(10);
		textField_112.setBounds(790, 145, 167, 20);
		panel2.add(textField_112);

		textField_113 = new JTextField();
		textField_113.setColumns(10);
		textField_113.setBounds(790, 123, 167, 20);
		panel2.add(textField_113);

		label_64 = new JLabel("Observaci\u00F3n/Referencia");
		label_64.setHorizontalAlignment(SwingConstants.CENTER);
		label_64.setFont(new Font("Arial", Font.BOLD, 11));
		label_64.setBounds(797, 101, 153, 14);
		panel2.add(label_64);

		lblPanelesEpsPared_17 = new JLabel("Paneles EPS pared port\u00F3n- (2,50x0,65 mt)");
		lblPanelesEpsPared_17.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_17.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_17.setBounds(495, 390, 203, 14);
		panel2.add(lblPanelesEpsPared_17);

		textField_114 = new JTextField();
		textField_114.setColumns(10);
		textField_114.setBounds(708, 387, 35, 20);
		panel2.add(textField_114);

		textField_115 = new JTextField();
		textField_115.setColumns(10);
		textField_115.setBounds(745, 387, 35, 20);
		panel2.add(textField_115);

		textField_116 = new JTextField();
		textField_116.setColumns(10);
		textField_116.setBounds(790, 387, 167, 20);
		panel2.add(textField_116);

		lblPanelesEpsPared_18 = new JLabel("Paneles EPS pared port\u00F3n- (1,0x0,35 mt)");
		lblPanelesEpsPared_18.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_18.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_18.setBounds(495, 412, 203, 14);
		panel2.add(lblPanelesEpsPared_18);

		textField_117 = new JTextField();
		textField_117.setColumns(10);
		textField_117.setBounds(708, 409, 35, 20);
		panel2.add(textField_117);

		textField_118 = new JTextField();
		textField_118.setColumns(10);
		textField_118.setBounds(745, 409, 35, 20);
		panel2.add(textField_118);

		textField_119 = new JTextField();
		textField_119.setColumns(10);
		textField_119.setBounds(790, 409, 167, 20);
		panel2.add(textField_119);

		lblComponenteEstructural = new JLabel("COMPONENTE ESTRUCTURAL");
		lblComponenteEstructural.setHorizontalAlignment(SwingConstants.CENTER);
		lblComponenteEstructural.setFont(new Font("Arial", Font.BOLD, 11));
		lblComponenteEstructural.setBounds(979, 23, 203, 14);
		panel2.add(lblComponenteEstructural);

		lblDadoCimentacinPortn = new JLabel("Dado cimentaci\u00F3n port\u00F3n");
		lblDadoCimentacinPortn.setHorizontalAlignment(SwingConstants.LEFT);
		lblDadoCimentacinPortn.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDadoCimentacinPortn.setBounds(979, 48, 203, 14);
		panel2.add(lblDadoCimentacinPortn);

		lblPerfilSfTipo_5 = new JLabel("Perfil SF Tipo 12 MA-SF-12 para paredes");
		lblPerfilSfTipo_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_5.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_5.setBounds(979, 70, 203, 14);
		panel2.add(lblPerfilSfTipo_5);

		txtCantidadCim1 = new JTextField();
		txtCantidadCim1.setColumns(10);
		txtCantidadCim1.setBounds(1192, 45, 35, 20);
		panel2.add(txtCantidadCim1);

		label_53 = new JLabel("Cantidad");
		label_53.setHorizontalAlignment(SwingConstants.CENTER);
		label_53.setFont(new Font("Arial", Font.BOLD, 11));
		label_53.setBounds(1195, 23, 63, 14);
		panel2.add(label_53);

		txtCantidadCim2 = new JTextField();
		txtCantidadCim2.setColumns(10);
		txtCantidadCim2.setBounds(1229, 45, 35, 20);
		panel2.add(txtCantidadCim2);

		txtCantPerfilPared2 = new JTextField();
		txtCantPerfilPared2.setColumns(10);
		txtCantPerfilPared2.setBounds(1229, 67, 35, 20);
		panel2.add(txtCantPerfilPared2);

		txtCantPerfilPared1 = new JTextField();
		txtCantPerfilPared1.setColumns(10);
		txtCantPerfilPared1.setBounds(1192, 67, 35, 20);
		panel2.add(txtCantPerfilPared1);

		txtRefPerfilPared = new JTextField();
		txtRefPerfilPared.setColumns(10);
		txtRefPerfilPared.setBounds(1274, 67, 167, 20);
		panel2.add(txtRefPerfilPared);

		txtRefCim = new JTextField();
		txtRefCim.setColumns(10);
		txtRefCim.setBounds(1274, 45, 167, 20);
		panel2.add(txtRefCim);

		label_54 = new JLabel("Observaci\u00F3n/Referencia");
		label_54.setHorizontalAlignment(SwingConstants.CENTER);
		label_54.setFont(new Font("Arial", Font.BOLD, 11));
		label_54.setBounds(1281, 23, 153, 14);
		panel2.add(label_54);

		lblPerfilSfTipo_6 = new JLabel("Perfil SF Tipo 12 MA-SF-12 para puerta");
		lblPerfilSfTipo_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_6.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_6.setBounds(979, 92, 203, 14);
		panel2.add(lblPerfilSfTipo_6);

		txtCantPerfilPuerta1 = new JTextField();
		txtCantPerfilPuerta1.setColumns(10);
		txtCantPerfilPuerta1.setBounds(1192, 89, 35, 20);
		panel2.add(txtCantPerfilPuerta1);

		txtCantPerfilPuerta2 = new JTextField();
		txtCantPerfilPuerta2.setColumns(10);
		txtCantPerfilPuerta2.setBounds(1229, 89, 35, 20);
		panel2.add(txtCantPerfilPuerta2);

		txtRefPerfilPuerta = new JTextField();
		txtRefPerfilPuerta.setColumns(10);
		txtRefPerfilPuerta.setBounds(1274, 89, 167, 20);
		panel2.add(txtRefPerfilPuerta);
	}

}
