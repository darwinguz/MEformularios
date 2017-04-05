package com.capa.presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.capa.util.Utilitarios;

public class Ma1 extends JFrame {

	private static final long serialVersionUID = 8480152059626754031L;
	private JPanel contentPane;
	private JTextField txtTECantidad00;
	private JTextField txtTECantidad01;
	private JTextField txtTECantidad10;
	private JTextField txtTECantidad11;
	private JTextField txtTECantidad20;
	private JTextField txtTECantidad21;
	private JTextField txtTECantidad30;
	private JTextField txtTECantidad31;
	private JTextField txtTEObsRef1;
	private JTextField txtTEObsRef0;
	private JTextField txtTEObsRef2;
	private JTextField txtTEObsRef3;
	private JLabel lblTECantidad;
	private JLabel lblTEObsRef;
	private JPanel pnlKitAguaLluvia;
	private JPanel pnlEDEtiquetas;
	private JLabel lblDadosCimentacionBXB;
	private JLabel lblReflectoresLed;
	private JLabel lblPostes6mts;
	private JLabel lblEDCajasConexion;
	private JLabel lblEDKitCableadoElectrico;
	private JLabel lbl_agua_lluvia;
	private JPanel pnlEDCantidad;
	private JTextField txtEDCantidad00;
	private JTextField txtEDCantidad01;
	private JTextField txtEDCantidad10;
	private JTextField txtEDCantidad11;
	private JTextField txtEDCantidad20;
	private JTextField txtEDCantidad21;
	private JTextField txtEDCantidad30;
	private JTextField txtEDCantidad31;
	private JTextField txtEDCantidad40;
	private JTextField txtEDCantidad41;
	private JPanel pnlEDObsRef;
	private JTextField txtEDObsRef0;
	private JTextField txtEDObsRef1;
	private JTextField txtEDObsRef2;
	private JTextField txtEDObsRef3;
	private JTextField txtEDObsRef4;
	private JLabel lblEDCantidad;
	private JLabel lblEDObsRef;
	private JPanel pnlFachadaFrontal;
	private JPanel pnlAEEtiquetas;
	private JLabel lblDadosCimentacionAXA;
	private JLabel lblLuminariasLed;
	private JLabel lblPostesSimples;
	private JLabel lblAEKitCableadoElectrico;
	private JLabel lblAEKitAlumbradoExterior;
	private JPanel pnlAECantidad;
	private JTextField txtAECantidad00;
	private JTextField txtAECantidad01;
	private JTextField txtAECantidad10;
	private JTextField txtAECantidad11;
	private JTextField txtAECantidad20;
	private JTextField txtAECantidad21;
	private JTextField txtAECantidad30;
	private JTextField txtAECantidad31;
	private JPanel pnlAEObsRef;
	private JTextField txtAEObsRef0;
	private JTextField txtAEObsRef1;
	private JTextField txtAEObsRef2;
	private JTextField txtAEObsRef3;
	private JLabel lblAECantidad;
	private JLabel lblAEObsRef;
	private JPanel pnlComponenteEst;
	private JPanel pnlTEtiquetas;
	private JLabel lblTKitCableadoTR;
	private JLabel lbl_pst_datos_cim;
	private JLabel lbl_pst2;
	private JLabel lbl_pst3;
	private JLabel lbl_pst11;
	private JLabel lblTKitTransformador;
	private JPanel pnlTCantidad;
	private JTextField txtTCantidad00;
	private JTextField txtTCantidad01;
	private JTextField txtTCantidad10;
	private JTextField txtTCantidad11;
	private JTextField txtTCantidad20;
	private JTextField txtTCantidad21;
	private JTextField txtTCantidad30;
	private JTextField txtTCantidad31;
	private JTextField txtTCantidad40;
	private JTextField txtTCantidad41;
	private JPanel pnlTObsRef;
	private JTextField txtTObsRef0;
	private JTextField txtTObsRef1;
	private JTextField txtTObsRef2;
	private JTextField txtTObsRef3;
	private JTextField txtTObsRef4;
	private JLabel lblTCantidad;
	private JLabel lblTObsRef;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_15;
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
	private JPanel pnlCubierta;
	private JPanel panel_9;
	private JLabel label_9;
	private JLabel lblFachadaLateral;
	private JPanel panel_10;
	private JTextField textField_27;
	private JPanel panel_11;
	private JTextField textField_33;
	private JLabel label_13;
	private JLabel label_14;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JLabel lbl_pst4;
	private JLabel lbl_pst5;
	private JLabel lbl_pst6;
	private JLabel lbl_pst7;
	private JLabel lbl_pst8;
	private JLabel lbl_pst9;
	private JLabel lbl_pst10;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JLabel lblDetectorDeHumo;
	private JPanel pnlFachadaLateral;
	private JPanel panel_4;
	private JLabel label;
	private JLabel label_4;
	private JLabel lblFachadaLateral_1;
	private JLabel label_12;
	private JLabel label_15;
	private JPanel panel_8;
	private JTextField textField_9;
	private JTextField textField_14;
	private JTextField textField_16;
	private JTextField textField_42;
	private JPanel panel_12;
	private JTextField textField_45;
	private JTextField textField_46;
	private JPanel pnlInterior;
	private JPanel panel_14;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel lblInterior;
	private JLabel label_17;
	private JLabel label_18;
	private JPanel panel_15;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_47;
	private JTextField textField_48;
	private JPanel panel_16;
	private JTextField textField_49;
	private JTextField textField_50;
	private JLabel lbl_pst12;
	private JTextField textField_51;
	private JTextField textField_52;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ma1 frame = new Ma1();
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
	public Ma1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1320, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());

		Utilitarios.llenarCabecera(cabecera);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 125, 1286, 560);
		contentPane.add(tabbedPane);

		JPanel pnlPestaña1 = new JPanel();
		tabbedPane.addTab("1-MA Aulas-1", null, pnlPestaña1, null);
		pnlPestaña1.setLayout(null);

		JPanel pnlKitElectrico = new JPanel();
		pnlKitElectrico.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlKitElectrico.setBounds(10, 10, 414, 118);
		pnlPestaña1.add(pnlKitElectrico);
		pnlKitElectrico.setLayout(null);

		JPanel pnlTEEtiquetas = new JPanel();
		pnlTEEtiquetas.setBounds(3, 17, 199, 97);
		pnlKitElectrico.add(pnlTEEtiquetas);
		pnlTEEtiquetas.setLayout(new GridLayout(5, 0, 0, 0));

		JLabel lblTableroElectricoA = new JLabel("Luminarias LED  60w-5000 lum  ");
		lblTableroElectricoA.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblTableroElectricoA.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEEtiquetas.add(lblTableroElectricoA);

		JLabel lblTableroElectricoB = new JLabel("Tomacorrientes  ");
		lblTableroElectricoB.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblTableroElectricoB.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEEtiquetas.add(lblTableroElectricoB);

		JLabel lblTableroElectricoC = new JLabel("Interruptor  ");
		lblTableroElectricoC.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblTableroElectricoC.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEEtiquetas.add(lblTableroElectricoC);

		JLabel lblTableroElectricoD = new JLabel("Kit cable el\u00E9ctrico  ");
		lblTableroElectricoD.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblTableroElectricoD.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEEtiquetas.add(lblTableroElectricoD);

		lblDetectorDeHumo = new JLabel("Detector de Humo  ");
		lblDetectorDeHumo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDetectorDeHumo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		pnlTEEtiquetas.add(lblDetectorDeHumo);

		JLabel lbl_kit_electrico = new JLabel("KIT ELECTRICO");
		lbl_kit_electrico.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_kit_electrico.setBounds(3, 1, 176, 14);
		pnlKitElectrico.add(lbl_kit_electrico);

		JPanel pnlTECantidad = new JPanel();
		pnlTECantidad.setBounds(210, 17, 55, 97);
		pnlKitElectrico.add(pnlTECantidad);
		pnlTECantidad.setLayout(new GridLayout(5, 2, 0, 0));

		txtTECantidad00 = new JTextField();
		pnlTECantidad.add(txtTECantidad00);
		txtTECantidad00.setColumns(10);
		Utilitarios.validarDigitos(txtTECantidad00);

		txtTECantidad01 = new JTextField();
		txtTECantidad01.setColumns(10);
		pnlTECantidad.add(txtTECantidad01);
		Utilitarios.validarDigitos(txtTECantidad01);

		txtTECantidad10 = new JTextField();
		txtTECantidad10.setColumns(10);
		pnlTECantidad.add(txtTECantidad10);

		txtTECantidad11 = new JTextField();
		txtTECantidad11.setColumns(10);
		pnlTECantidad.add(txtTECantidad11);
		Utilitarios.validarDigitos(txtTECantidad11);

		txtTECantidad20 = new JTextField();
		txtTECantidad20.setColumns(10);
		pnlTECantidad.add(txtTECantidad20);
		Utilitarios.validarDigitos(txtTECantidad20);

		txtTECantidad21 = new JTextField();
		txtTECantidad21.setColumns(10);
		pnlTECantidad.add(txtTECantidad21);
		Utilitarios.validarDigitos(txtTECantidad21);

		txtTECantidad30 = new JTextField();
		txtTECantidad30.setColumns(10);
		pnlTECantidad.add(txtTECantidad30);
		Utilitarios.validarDigitos(txtTECantidad30);

		txtTECantidad31 = new JTextField();
		txtTECantidad31.setColumns(10);
		pnlTECantidad.add(txtTECantidad31);
		Utilitarios.validarDigitos(txtTECantidad31);

		textField_39 = new JTextField();
		textField_39.setColumns(10);
		pnlTECantidad.add(textField_39);
		Utilitarios.validarDigitos(textField_39);

		textField_40 = new JTextField();
		textField_40.setColumns(10);
		pnlTECantidad.add(textField_40);
		Utilitarios.validarDigitos(textField_40);

		JPanel pnlTEObsRef = new JPanel();
		pnlTEObsRef.setBounds(267, 17, 143, 97);
		pnlKitElectrico.add(pnlTEObsRef);
		pnlTEObsRef.setLayout(new GridLayout(5, 0, 0, 0));

		txtTEObsRef0 = new JTextField();
		pnlTEObsRef.add(txtTEObsRef0);
		txtTEObsRef0.setColumns(10);

		txtTEObsRef1 = new JTextField();
		pnlTEObsRef.add(txtTEObsRef1);
		txtTEObsRef1.setColumns(10);

		txtTEObsRef2 = new JTextField();
		txtTEObsRef2.setColumns(10);
		pnlTEObsRef.add(txtTEObsRef2);

		txtTEObsRef3 = new JTextField();
		txtTEObsRef3.setColumns(10);
		pnlTEObsRef.add(txtTEObsRef3);

		textField_41 = new JTextField();// txt observacion
		textField_41.setColumns(10);
		pnlTEObsRef.add(textField_41);

		lblTECantidad = new JLabel("Cantidad");
		lblTECantidad.setBounds(210, 1, 55, 14);
		pnlKitElectrico.add(lblTECantidad);

		lblTEObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblTEObsRef.setBounds(267, 1, 143, 14);
		pnlKitElectrico.add(lblTEObsRef);

		pnlKitAguaLluvia = new JPanel();
		pnlKitAguaLluvia.setLayout(null);
		pnlKitAguaLluvia.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlKitAguaLluvia.setBounds(10, 139, 414, 192);
		pnlPestaña1.add(pnlKitAguaLluvia);

		pnlEDEtiquetas = new JPanel();
		pnlEDEtiquetas.setBounds(3, 17, 199, 164);
		pnlKitAguaLluvia.add(pnlEDEtiquetas);
		pnlEDEtiquetas.setLayout(new GridLayout(5, 0, 0, 0));

		lblDadosCimentacionBXB = new JLabel("Canal pl\u00E1stico PVC de L=3m  ");
		lblDadosCimentacionBXB.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblDadosCimentacionBXB.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlEDEtiquetas.add(lblDadosCimentacionBXB);

		lblReflectoresLed = new JLabel(
				"<html><body><p align=\"right\">Kit de accesorios de conexi\u00F3n Agua de Lluvia (2 rejila, 4 codos 90\u00B0, 1/4 gl polipega, tornillos, abrazaderas))</p></html></body>");
		lblReflectoresLed.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblReflectoresLed.setVerticalAlignment(SwingConstants.TOP);
		lblReflectoresLed.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlEDEtiquetas.add(lblReflectoresLed);

		lblPostes6mts = new JLabel("Tuber\u00EDa de PVC 75mm L=3m  ");
		lblPostes6mts.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPostes6mts.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlEDEtiquetas.add(lblPostes6mts);

		lblEDCajasConexion = new JLabel("Tuber\u00EDa de PVC 75mm L=0.6m  ");
		lblEDCajasConexion.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblEDCajasConexion.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlEDEtiquetas.add(lblEDCajasConexion);

		lblEDKitCableadoElectrico = new JLabel(
				"<html><body><p align=\"justify\">Kit para conexi\u00F3n de tuber\u00EDa 75 mm. (lija pliego, polipega 1/4 gal, 1 codo 90\u00B0) </p></body></html>");
		lblEDKitCableadoElectrico.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblEDKitCableadoElectrico.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlEDEtiquetas.add(lblEDKitCableadoElectrico);

		lbl_agua_lluvia = new JLabel("KIT AGUA LLUVIA");
		lbl_agua_lluvia.setFont(new Font("Tahoma", Font.BOLD, 10));
		lbl_agua_lluvia.setBounds(3, 1, 211, 14);
		pnlKitAguaLluvia.add(lbl_agua_lluvia);

		pnlEDCantidad = new JPanel();
		pnlEDCantidad.setBounds(210, 17, 55, 164);
		pnlKitAguaLluvia.add(pnlEDCantidad);
		pnlEDCantidad.setLayout(new GridLayout(5, 2, 0, 0));

		txtEDCantidad00 = new JTextField();
		txtEDCantidad00.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad00);
		Utilitarios.validarDigitos(txtEDCantidad00);

		txtEDCantidad01 = new JTextField();
		txtEDCantidad01.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad01);
		Utilitarios.validarDigitos(txtEDCantidad01);

		txtEDCantidad10 = new JTextField();
		txtEDCantidad10.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad10);
		Utilitarios.validarDigitos(txtEDCantidad10);

		txtEDCantidad11 = new JTextField();
		txtEDCantidad11.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad11);
		Utilitarios.validarDigitos(txtEDCantidad11);

		txtEDCantidad20 = new JTextField();
		txtEDCantidad20.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad20);
		Utilitarios.validarDigitos(txtEDCantidad20);

		txtEDCantidad21 = new JTextField();
		txtEDCantidad21.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad21);
		Utilitarios.validarDigitos(txtEDCantidad21);

		txtEDCantidad30 = new JTextField();
		txtEDCantidad30.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad30);
		Utilitarios.validarDigitos(txtEDCantidad30);

		txtEDCantidad31 = new JTextField();
		txtEDCantidad31.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad31);
		Utilitarios.validarDigitos(txtEDCantidad31);

		txtEDCantidad40 = new JTextField();
		txtEDCantidad40.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad40);
		Utilitarios.validarDigitos(txtEDCantidad40);

		txtEDCantidad41 = new JTextField();
		txtEDCantidad41.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad41);
		Utilitarios.validarDigitos(txtEDCantidad41);

		pnlEDObsRef = new JPanel();
		pnlEDObsRef.setBounds(267, 17, 143, 164);
		pnlKitAguaLluvia.add(pnlEDObsRef);
		pnlEDObsRef.setLayout(new GridLayout(5, 0, 0, 0));

		txtEDObsRef0 = new JTextField();
		txtEDObsRef0.setColumns(10);
		pnlEDObsRef.add(txtEDObsRef0);

		txtEDObsRef1 = new JTextField();
		txtEDObsRef1.setColumns(10);
		pnlEDObsRef.add(txtEDObsRef1);

		txtEDObsRef2 = new JTextField();
		txtEDObsRef2.setColumns(10);
		pnlEDObsRef.add(txtEDObsRef2);

		txtEDObsRef3 = new JTextField();
		txtEDObsRef3.setColumns(10);
		pnlEDObsRef.add(txtEDObsRef3);

		txtEDObsRef4 = new JTextField();
		txtEDObsRef4.setColumns(10);
		pnlEDObsRef.add(txtEDObsRef4);

		lblEDCantidad = new JLabel("Cantidad");
		lblEDCantidad.setBounds(210, 1, 55, 14);
		pnlKitAguaLluvia.add(lblEDCantidad);

		lblEDObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblEDObsRef.setBounds(267, 1, 143, 14);
		pnlKitAguaLluvia.add(lblEDObsRef);

		JPanel pnlCompArquitect = new JPanel();
		pnlCompArquitect.setLayout(null);
		pnlCompArquitect.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlCompArquitect.setBounds(10, 342, 414, 174);
		pnlPestaña1.add(pnlCompArquitect);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(3, 17, 199, 157);
		pnlCompArquitect.add(panel_1);
		panel_1.setLayout(new GridLayout(5, 0, 0, 0));

		JLabel lblPuertas = new JLabel("Puertas  ");
		lblPuertas.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPuertas.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblPuertas);

		JLabel lblBisagras = new JLabel("Bisagras  ");
		lblBisagras.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblBisagras.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblBisagras);

		JLabel lblPerfilSfTipo = new JLabel(
				"<html><body><p align=\"right\">Perfil SF Tipo 12 MA-SF-12 para puerta y Tipo 12 MS-SF 12 paredes</p></body></html>");
		lblPerfilSfTipo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPerfilSfTipo.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblPerfilSfTipo);

		JLabel lblVentanaCorrederaCompuesta = new JLabel(
				"<html><body><p align=\"right\">Ventana corredera, compuesta por tres hojas y dos carriles. UPVC con vidrio flotado de 3 mm de 3x1,10 </p></body></html>");
		lblVentanaCorrederaCompuesta.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblVentanaCorrederaCompuesta.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblVentanaCorrederaCompuesta);

		JLabel lblPerfilSfTipo_2 = new JLabel("Perfil SF Tipo 12 MA-SF-12 para ventana  ");
		lblPerfilSfTipo_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPerfilSfTipo_2.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblPerfilSfTipo_2);

		JLabel lblComponenteArquitectnico = new JLabel("COMPONENTE ARQUITECT\u00D3NICO");
		lblComponenteArquitectnico.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComponenteArquitectnico.setBounds(3, 1, 211, 14);
		pnlCompArquitect.add(lblComponenteArquitectnico);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(210, 17, 55, 157);
		pnlCompArquitect.add(panel_2);
		panel_2.setLayout(new GridLayout(5, 2, 0, 0));

		textField = new JTextField();
		textField.setColumns(10);
		panel_2.add(textField);
		Utilitarios.validarDigitos(textField);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel_2.add(textField_1);
		Utilitarios.validarDigitos(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_2.add(textField_2);
		Utilitarios.validarDigitos(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_2.add(textField_3);
		Utilitarios.validarDigitos(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		panel_2.add(textField_4);
		Utilitarios.validarDigitos(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		panel_2.add(textField_5);
		Utilitarios.validarDigitos(textField_5);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		panel_2.add(textField_6);
		Utilitarios.validarDigitos(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		panel_2.add(textField_7);
		Utilitarios.validarDigitos(textField_7);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		panel_2.add(textField_8);
		Utilitarios.validarDigitos(textField_8);

		textField_15 = new JTextField();
		textField_15.setColumns(10);
		panel_2.add(textField_15);
		Utilitarios.validarDigitos(textField_15);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(267, 17, 143, 157);
		pnlCompArquitect.add(panel_3);
		panel_3.setLayout(new GridLayout(5, 0, 0, 0));

		textField_10 = new JTextField(); // txt Observacion
		textField_10.setColumns(10);
		panel_3.add(textField_10);

		textField_11 = new JTextField();// txt Observacion
		textField_11.setColumns(10);
		panel_3.add(textField_11);

		textField_12 = new JTextField();// txt Observacion
		textField_12.setColumns(10);
		panel_3.add(textField_12);

		textField_13 = new JTextField();// txt Observacion
		textField_13.setColumns(10);
		panel_3.add(textField_13);

		textField_17 = new JTextField();// txt Observacion
		textField_17.setColumns(10);
		panel_3.add(textField_17);

		JLabel label_6 = new JLabel("Cantidad");
		label_6.setBounds(210, 1, 55, 14);
		pnlCompArquitect.add(label_6);

		JLabel label_7 = new JLabel("Observaci\u00F3n/Referencia");
		label_7.setBounds(267, 1, 143, 14);
		pnlCompArquitect.add(label_7);

		pnlFachadaFrontal = new JPanel();
		pnlFachadaFrontal.setLayout(null);
		pnlFachadaFrontal.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlFachadaFrontal.setBounds(434, 10, 414, 101);
		pnlPestaña1.add(pnlFachadaFrontal);

		pnlAEEtiquetas = new JPanel();
		pnlAEEtiquetas.setBounds(3, 17, 199, 80);
		pnlFachadaFrontal.add(pnlAEEtiquetas);
		pnlAEEtiquetas.setLayout(new GridLayout(4, 0, 0, 0));

		lblDadosCimentacionAXA = new JLabel("Dados de cimentaci\u00F3n de postes AXAcm");
		lblDadosCimentacionAXA.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblDadosCimentacionAXA.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlAEEtiquetas.add(lblDadosCimentacionAXA);

		lblLuminariasLed = new JLabel("Luminarias LED 120 W - 12000 lum");
		lblLuminariasLed.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblLuminariasLed.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlAEEtiquetas.add(lblLuminariasLed);

		lblPostesSimples = new JLabel("Postes de 6 mts simples");
		lblPostesSimples.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPostesSimples.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlAEEtiquetas.add(lblPostesSimples);

		lblAEKitCableadoElectrico = new JLabel("Kit cableado el\u00E9ctrico AE");
		lblAEKitCableadoElectrico.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblAEKitCableadoElectrico.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlAEEtiquetas.add(lblAEKitCableadoElectrico);

		lblAEKitAlumbradoExterior = new JLabel("FACHADA FRONTAL");
		lblAEKitAlumbradoExterior.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAEKitAlumbradoExterior.setBounds(3, 1, 176, 14);
		pnlFachadaFrontal.add(lblAEKitAlumbradoExterior);

		pnlAECantidad = new JPanel();
		pnlAECantidad.setBounds(210, 17, 55, 80);
		pnlFachadaFrontal.add(pnlAECantidad);
		pnlAECantidad.setLayout(new GridLayout(4, 2, 0, 0));

		txtAECantidad00 = new JTextField();
		txtAECantidad00.setColumns(10);
		pnlAECantidad.add(txtAECantidad00);
		Utilitarios.validarDigitos(txtAECantidad00);

		txtAECantidad01 = new JTextField();
		txtAECantidad01.setColumns(10);
		pnlAECantidad.add(txtAECantidad01);
		Utilitarios.validarDigitos(txtAECantidad01);

		txtAECantidad10 = new JTextField();
		txtAECantidad10.setColumns(10);
		pnlAECantidad.add(txtAECantidad10);
		Utilitarios.validarDigitos(txtAECantidad10);

		txtAECantidad11 = new JTextField();
		txtAECantidad11.setColumns(10);
		pnlAECantidad.add(txtAECantidad11);
		Utilitarios.validarDigitos(txtAECantidad11);

		txtAECantidad20 = new JTextField();
		txtAECantidad20.setColumns(10);
		pnlAECantidad.add(txtAECantidad20);
		Utilitarios.validarDigitos(txtAECantidad20);

		txtAECantidad21 = new JTextField();
		txtAECantidad21.setColumns(10);
		pnlAECantidad.add(txtAECantidad21);
		Utilitarios.validarDigitos(txtAECantidad21);

		txtAECantidad30 = new JTextField();
		txtAECantidad30.setColumns(10);
		pnlAECantidad.add(txtAECantidad30);
		Utilitarios.validarDigitos(txtAECantidad30);

		txtAECantidad31 = new JTextField();
		txtAECantidad31.setColumns(10);
		pnlAECantidad.add(txtAECantidad31);
		Utilitarios.validarDigitos(txtAECantidad31);

		pnlAEObsRef = new JPanel();
		pnlAEObsRef.setBounds(267, 17, 143, 80);
		pnlFachadaFrontal.add(pnlAEObsRef);
		pnlAEObsRef.setLayout(new GridLayout(4, 0, 0, 0));

		txtAEObsRef0 = new JTextField();
		txtAEObsRef0.setColumns(10);
		pnlAEObsRef.add(txtAEObsRef0);

		txtAEObsRef1 = new JTextField();
		txtAEObsRef1.setColumns(10);
		pnlAEObsRef.add(txtAEObsRef1);

		txtAEObsRef2 = new JTextField();
		txtAEObsRef2.setColumns(10);
		pnlAEObsRef.add(txtAEObsRef2);

		txtAEObsRef3 = new JTextField();
		txtAEObsRef3.setColumns(10);
		pnlAEObsRef.add(txtAEObsRef3);

		lblAECantidad = new JLabel("Cantidad");
		lblAECantidad.setBounds(210, 1, 55, 14);
		pnlFachadaFrontal.add(lblAECantidad);

		lblAEObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblAEObsRef.setBounds(267, 1, 143, 14);
		pnlFachadaFrontal.add(lblAEObsRef);

		JPanel pnlFachadaPosterior = new JPanel();
		pnlFachadaPosterior.setLayout(null);
		pnlFachadaPosterior.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlFachadaPosterior.setBounds(434, 115, 414, 80);
		pnlPestaña1.add(pnlFachadaPosterior);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(3, 17, 199, 60);
		pnlFachadaPosterior.add(panel_5);
		panel_5.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_1 = new JLabel("Kit de cableado el\u00E9ctrico BA");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_5.add(label_1);

		JLabel label_2 = new JLabel("Tuber\u00EDa PVC 2\u00B4para cableado l=6m");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_5.add(label_2);

		JLabel label_3 = new JLabel("Cajas de Conexi\u00F3n  0,60x0,60 mt");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_5.add(label_3);

		JLabel lblFachadaPosterior = new JLabel("FACHADA POSTERIOR");
		lblFachadaPosterior.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFachadaPosterior.setBounds(3, 1, 176, 14);
		pnlFachadaPosterior.add(lblFachadaPosterior);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(210, 17, 55, 60);
		pnlFachadaPosterior.add(panel_6);
		panel_6.setLayout(new GridLayout(3, 2, 0, 0));

		textField_18 = new JTextField();
		textField_18.setColumns(10);
		panel_6.add(textField_18);
		Utilitarios.validarDigitos(textField_18);

		textField_19 = new JTextField();
		textField_19.setColumns(10);
		panel_6.add(textField_19);
		Utilitarios.validarDigitos(textField_19);

		textField_20 = new JTextField();
		textField_20.setColumns(10);
		panel_6.add(textField_20);
		Utilitarios.validarDigitos(textField_20);

		textField_21 = new JTextField();
		textField_21.setColumns(10);
		panel_6.add(textField_21);
		Utilitarios.validarDigitos(textField_21);

		textField_22 = new JTextField();
		textField_22.setColumns(10);
		panel_6.add(textField_22);
		Utilitarios.validarDigitos(textField_22);

		textField_23 = new JTextField();
		textField_23.setColumns(10);
		panel_6.add(textField_23);
		Utilitarios.validarDigitos(textField_23);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(267, 17, 143, 60);
		pnlFachadaPosterior.add(panel_7);
		panel_7.setLayout(new GridLayout(3, 0, 0, 0));

		textField_24 = new JTextField();// txt Observacion
		textField_24.setColumns(10);
		panel_7.add(textField_24);

		textField_25 = new JTextField();// txt Observacion
		textField_25.setColumns(10);
		panel_7.add(textField_25);

		textField_26 = new JTextField();// txt Observacion
		textField_26.setColumns(10);
		panel_7.add(textField_26);

		JLabel label_5 = new JLabel("Cantidad");
		label_5.setBounds(210, 1, 55, 14);
		pnlFachadaPosterior.add(label_5);

		JLabel label_8 = new JLabel("Observaci\u00F3n/Referencia");
		label_8.setBounds(267, 1, 143, 14);
		pnlFachadaPosterior.add(label_8);

		pnlFachadaLateral = new JPanel();
		pnlFachadaLateral.setLayout(null);
		pnlFachadaLateral.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlFachadaLateral.setBounds(434, 200, 414, 61);
		pnlPestaña1.add(pnlFachadaLateral);

		panel_4 = new JPanel();
		panel_4.setBounds(3, 17, 199, 40);
		pnlFachadaLateral.add(panel_4);
		panel_4.setLayout(new GridLayout(2, 0, 0, 0));

		label = new JLabel("Paneles vynil piso (0,15x1,93 m)  ");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel_4.add(label);

		label_4 = new JLabel("Paneles EPS para cubierta I=7, a= 1 m  ");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel_4.add(label_4);

		lblFachadaLateral_1 = new JLabel("FACHADA LATERAL");
		lblFachadaLateral_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFachadaLateral_1.setBounds(3, 1, 176, 14);
		pnlFachadaLateral.add(lblFachadaLateral_1);

		label_12 = new JLabel("Cantidad");
		label_12.setBounds(210, 1, 55, 14);
		pnlFachadaLateral.add(label_12);

		label_15 = new JLabel("Observaci\u00F3n/Referencia");
		label_15.setBounds(267, 1, 143, 14);
		pnlFachadaLateral.add(label_15);

		panel_8 = new JPanel();
		panel_8.setBounds(210, 17, 55, 40);
		pnlFachadaLateral.add(panel_8);
		panel_8.setLayout(new GridLayout(2, 2, 0, 0));

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		panel_8.add(textField_9);
		Utilitarios.validarDigitos(textField_9);

		textField_14 = new JTextField();
		textField_14.setColumns(10);
		panel_8.add(textField_14);
		Utilitarios.validarDigitos(textField_14);

		textField_16 = new JTextField();
		textField_16.setColumns(10);
		panel_8.add(textField_16);
		Utilitarios.validarDigitos(textField_16);

		textField_42 = new JTextField();
		textField_42.setColumns(10);
		panel_8.add(textField_42);
		Utilitarios.validarDigitos(textField_42);

		panel_12 = new JPanel();
		panel_12.setBounds(267, 17, 143, 40);
		pnlFachadaLateral.add(panel_12);
		panel_12.setLayout(new GridLayout(2, 0, 0, 0));

		textField_45 = new JTextField();// txt Observacion
		textField_45.setColumns(10);
		panel_12.add(textField_45);

		textField_46 = new JTextField();// txt Observacion
		textField_46.setColumns(10);
		panel_12.add(textField_46);

		pnlInterior = new JPanel();
		pnlInterior.setLayout(null);
		pnlInterior.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlInterior.setBounds(434, 266, 414, 61);
		pnlPestaña1.add(pnlInterior);

		panel_14 = new JPanel();
		panel_14.setBounds(3, 17, 199, 40);
		pnlInterior.add(panel_14);
		panel_14.setLayout(new GridLayout(2, 0, 0, 0));

		label_10 = new JLabel("Paneles vynil piso (0,15x1,93 m)  ");
		label_10.setHorizontalAlignment(SwingConstants.RIGHT);
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel_14.add(label_10);

		label_11 = new JLabel("Paneles EPS para cubierta I=7, a= 1 m  ");
		label_11.setHorizontalAlignment(SwingConstants.RIGHT);
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel_14.add(label_11);

		lblInterior = new JLabel("INTERIOR");
		lblInterior.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblInterior.setBounds(3, 1, 176, 14);
		pnlInterior.add(lblInterior);

		label_17 = new JLabel("Cantidad");
		label_17.setBounds(210, 1, 55, 14);
		pnlInterior.add(label_17);

		label_18 = new JLabel("Observaci\u00F3n/Referencia");
		label_18.setBounds(267, 1, 143, 14);
		pnlInterior.add(label_18);

		panel_15 = new JPanel();
		panel_15.setBounds(210, 17, 55, 40);
		pnlInterior.add(panel_15);
		panel_15.setLayout(new GridLayout(2, 2, 0, 0));

		textField_43 = new JTextField();
		textField_43.setColumns(10);
		panel_15.add(textField_43);
		Utilitarios.validarDigitos(textField_43);

		textField_44 = new JTextField();
		textField_44.setColumns(10);
		panel_15.add(textField_44);
		Utilitarios.validarDigitos(textField_44);

		textField_47 = new JTextField();
		textField_47.setColumns(10);
		panel_15.add(textField_47);
		Utilitarios.validarDigitos(textField_47);

		textField_48 = new JTextField();
		textField_48.setColumns(10);
		panel_15.add(textField_48);
		Utilitarios.validarDigitos(textField_48);

		panel_16 = new JPanel();
		panel_16.setBounds(267, 17, 143, 40);
		pnlInterior.add(panel_16);
		panel_16.setLayout(new GridLayout(2, 0, 0, 0));

		textField_49 = new JTextField();// txt Observacion
		textField_49.setColumns(10);
		panel_16.add(textField_49);

		textField_50 = new JTextField();// txt Observacion
		textField_50.setColumns(10);
		panel_16.add(textField_50);

		pnlCubierta = new JPanel();
		pnlCubierta.setLayout(null);
		pnlCubierta.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlCubierta.setBounds(434, 330, 414, 49);
		pnlPestaña1.add(pnlCubierta);

		panel_9 = new JPanel();
		panel_9.setBounds(3, 17, 199, 29);
		pnlCubierta.add(panel_9);
		panel_9.setLayout(new GridLayout(1, 0, 0, 0));

		label_9 = new JLabel("Kit de cableado el\u00E9ctrico BA");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_9.add(label_9);

		lblFachadaLateral = new JLabel("CUBIERTA");
		lblFachadaLateral.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFachadaLateral.setBounds(3, 1, 176, 14);
		pnlCubierta.add(lblFachadaLateral);

		panel_10 = new JPanel();
		panel_10.setBounds(210, 17, 55, 29);
		pnlCubierta.add(panel_10);
		panel_10.setLayout(new GridLayout(1, 2, 0, 0));

		textField_38 = new JTextField();
		textField_38.setColumns(10);
		panel_10.add(textField_38);
		Utilitarios.validarDigitos(textField_38);

		textField_27 = new JTextField();
		textField_27.setColumns(10);
		panel_10.add(textField_27);
		Utilitarios.validarDigitos(textField_27);

		panel_11 = new JPanel();
		panel_11.setBounds(267, 17, 143, 29);
		pnlCubierta.add(panel_11);
		panel_11.setLayout(new GridLayout(1, 0, 0, 0));

		textField_33 = new JTextField();// txt Observacion
		textField_33.setColumns(10);
		panel_11.add(textField_33);

		label_13 = new JLabel("Cantidad");
		label_13.setBounds(210, 1, 55, 14);
		pnlCubierta.add(label_13);

		label_14 = new JLabel("Observaci\u00F3n/Referencia");
		label_14.setBounds(267, 1, 143, 14);
		pnlCubierta.add(label_14);

		pnlComponenteEst = new JPanel();
		pnlComponenteEst.setLayout(null);
		pnlComponenteEst.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlComponenteEst.setBounds(858, 11, 414, 365);
		pnlPestaña1.add(pnlComponenteEst);

		lblTKitTransformador = new JLabel("COMPONENTE ESTRUCTURAL");
		lblTKitTransformador.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTKitTransformador.setBounds(3, 1, 176, 14);
		pnlComponenteEst.add(lblTKitTransformador);

		lblTCantidad = new JLabel("Cantidad");
		lblTCantidad.setBounds(210, 1, 55, 14);
		pnlComponenteEst.add(lblTCantidad);

		lblTObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblTObsRef.setBounds(267, 1, 143, 14);
		pnlComponenteEst.add(lblTObsRef);

		pnlTEtiquetas = new JPanel();
		pnlTEtiquetas.setBounds(3, 17, 199, 348);
		pnlComponenteEst.add(pnlTEtiquetas);
		pnlTEtiquetas.setLayout(new GridLayout(13, 0, 0, 0));

		lblTKitCableadoTR = new JLabel("Dados cimentaci\u00F3n  ");
		lblTKitCableadoTR.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEtiquetas.add(lblTKitCableadoTR);

		lbl_pst_datos_cim = new JLabel("Perfil SF Tipo 1  ");
		lbl_pst_datos_cim.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEtiquetas.add(lbl_pst_datos_cim);

		lbl_pst2 = new JLabel("Perfil SF Tipo 2  ");
		lbl_pst2.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEtiquetas.add(lbl_pst2);

		lbl_pst3 = new JLabel("Perfil SF Tipo 3  ");
		lbl_pst3.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEtiquetas.add(lbl_pst3);

		lbl_pst4 = new JLabel("Perfil SF Tipo 4  ");
		lbl_pst4.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEtiquetas.add(lbl_pst4);

		lbl_pst5 = new JLabel("Perfil SF Tipo 5  ");
		lbl_pst5.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEtiquetas.add(lbl_pst5);

		lbl_pst6 = new JLabel("Perfil SF Tipo 6  ");
		lbl_pst6.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEtiquetas.add(lbl_pst6);

		lbl_pst7 = new JLabel("Perfil SF Tipo 7  ");
		lbl_pst7.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEtiquetas.add(lbl_pst7);

		lbl_pst8 = new JLabel("Perfil SF Tipo 8  ");
		lbl_pst8.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEtiquetas.add(lbl_pst8);

		lbl_pst9 = new JLabel("Perfil SF Tipo 9  ");
		lbl_pst9.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEtiquetas.add(lbl_pst9);

		lbl_pst10 = new JLabel("Perfil SF Tipo 10  ");
		lbl_pst10.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEtiquetas.add(lbl_pst10);

		lbl_pst11 = new JLabel("Perfil SF Tipo 11  ");
		lbl_pst11.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEtiquetas.add(lbl_pst11);

		lbl_pst12 = new JLabel("Perfil SF Tipo 12  ");
		lbl_pst12.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEtiquetas.add(lbl_pst12);

		pnlTCantidad = new JPanel();
		pnlTCantidad.setBounds(210, 17, 55, 348);
		pnlComponenteEst.add(pnlTCantidad);
		pnlTCantidad.setLayout(new GridLayout(13, 2, 0, 0));

		txtTCantidad00 = new JTextField();
		txtTCantidad00.setColumns(10);
		pnlTCantidad.add(txtTCantidad00);
		Utilitarios.validarDigitos(txtTCantidad00);

		txtTCantidad01 = new JTextField();
		txtTCantidad01.setColumns(10);
		pnlTCantidad.add(txtTCantidad01);
		Utilitarios.validarDigitos(txtTCantidad01);

		txtTCantidad10 = new JTextField();
		txtTCantidad10.setColumns(10);
		pnlTCantidad.add(txtTCantidad10);
		Utilitarios.validarDigitos(txtTCantidad10);

		txtTCantidad11 = new JTextField();
		txtTCantidad11.setColumns(10);
		pnlTCantidad.add(txtTCantidad11);
		Utilitarios.validarDigitos(txtTCantidad11);

		txtTCantidad20 = new JTextField();
		txtTCantidad20.setColumns(10);
		pnlTCantidad.add(txtTCantidad20);
		Utilitarios.validarDigitos(txtTCantidad20);

		txtTCantidad21 = new JTextField();
		txtTCantidad21.setColumns(10);
		pnlTCantidad.add(txtTCantidad21);
		Utilitarios.validarDigitos(txtTCantidad21);

		txtTCantidad30 = new JTextField();
		txtTCantidad30.setColumns(10);
		pnlTCantidad.add(txtTCantidad30);
		Utilitarios.validarDigitos(txtTCantidad30);

		txtTCantidad31 = new JTextField();
		txtTCantidad31.setColumns(10);
		pnlTCantidad.add(txtTCantidad31);
		Utilitarios.validarDigitos(txtTCantidad31);

		txtTCantidad40 = new JTextField();
		txtTCantidad40.setColumns(10);
		pnlTCantidad.add(txtTCantidad40);
		Utilitarios.validarDigitos(txtTCantidad40);

		txtTCantidad41 = new JTextField();
		txtTCantidad41.setColumns(10);
		pnlTCantidad.add(txtTCantidad41);
		Utilitarios.validarDigitos(txtTCantidad41);

		textField_29 = new JTextField();
		textField_29.setColumns(10);
		pnlTCantidad.add(textField_29);
		Utilitarios.validarDigitos(textField_29);

		textField_51 = new JTextField();
		textField_51.setColumns(10);
		pnlTCantidad.add(textField_51);
		Utilitarios.validarDigitos(textField_51);

		textField_28 = new JTextField();
		textField_28.setColumns(10);
		pnlTCantidad.add(textField_28);
		Utilitarios.validarDigitos(textField_28);

		pnlTObsRef = new JPanel();
		pnlTObsRef.setBounds(267, 17, 143, 348);
		pnlComponenteEst.add(pnlTObsRef);
		pnlTObsRef.setLayout(new GridLayout(13, 0, 0, 0));

		txtTObsRef0 = new JTextField();
		txtTObsRef0.setColumns(10);
		pnlTObsRef.add(txtTObsRef0);

		txtTObsRef1 = new JTextField();
		txtTObsRef1.setColumns(10);
		pnlTObsRef.add(txtTObsRef1);

		txtTObsRef2 = new JTextField();
		txtTObsRef2.setColumns(10);
		pnlTObsRef.add(txtTObsRef2);

		txtTObsRef3 = new JTextField();
		txtTObsRef3.setColumns(10);
		pnlTObsRef.add(txtTObsRef3);

		textField_30 = new JTextField();// txt observacion
		textField_30.setColumns(10);
		pnlTObsRef.add(textField_30);

		textField_31 = new JTextField();// txt observacion
		textField_31.setColumns(10);
		pnlTObsRef.add(textField_31);

		textField_32 = new JTextField();// txt observacion
		textField_32.setColumns(10);
		pnlTObsRef.add(textField_32);

		textField_34 = new JTextField();// txt observacion
		textField_34.setColumns(10);
		pnlTObsRef.add(textField_34);

		txtTObsRef4 = new JTextField();
		txtTObsRef4.setColumns(10);
		pnlTObsRef.add(txtTObsRef4);

		textField_35 = new JTextField();// txt observacion
		textField_35.setColumns(10);
		pnlTObsRef.add(textField_35);

		textField_36 = new JTextField();// txt observacion
		textField_36.setColumns(10);
		pnlTObsRef.add(textField_36);

		textField_52 = new JTextField();// txt observacion
		textField_52.setColumns(10);
		pnlTObsRef.add(textField_52);

		textField_37 = new JTextField();// txt observacion
		textField_37.setColumns(10);
		pnlTObsRef.add(textField_37);

		InformacionObligatoriaH infoObligatoria = new InformacionObligatoriaH();
		pnlPestaña1.add(infoObligatoria.getInformacionObligatoria());
	}

}
