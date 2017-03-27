package com.capa.presentacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.capa.util.Utilitarios;
import javax.swing.SwingConstants;

public class Mt1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2991536081432510517L;
	private JPanel contentPane;
	private JTextField txtAmie;
	private JTextField txtCircuito;
	private JTextField txtFechaEntrega;
	private JTextField txtFechaInicioTrabajo;
	private JTextField txtSector;
	private JTextField txtProyecto;
	private JTextField txtParroquia;
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
	private JPanel pnlCompArquitect1_2;
	private JPanel pnlBAEtiquetas;
	private JLabel lblKitCableadoBA;
	private JLabel lblBATuberaPvc;
	private JLabel lblBACajasConexion;
	private JLabel lblKitBombaA;
	private JPanel pnlBACantidad;
	private JTextField txtBACantidad00;
	private JTextField txtBACantidad01;
	private JTextField txtBACantidad10;
	private JTextField txtBACantidad11;
	private JTextField txtBACantidad20;
	private JTextField txtBACantidad21;
	private JPanel pnlBAObsRef;
	private JTextField txtBAObsRef0;
	private JTextField txtBAObsRef1;
	private JTextField txtBAObsRef2;
	private JLabel lblBACantidad;
	private JLabel lblBAObsRef;
	private JPanel pnlInfObligatoria;
	private JPanel pnlIOTexts2;
	private JTextField txtObsGenDer;
	private JTextField txtResponsableContratista;
	private JTextField txtCargoDer;
	private JTextField txtFecha;
	private JPanel pnlIOTexts1;
	private JTextField txtObsGenIzq;
	private JTextField txtResponsableMineduc;
	private JTextField txtCargoIzq;
	private JPanel pnlIOEtiquetas1;
	private JLabel lblObsGenIzq;
	private JLabel lblResponsableMineduc;
	private JLabel lblCargoIzq;
	private JPanel pnlIOEtiquetas2;
	private JLabel lblObsGenDer;
	private JLabel lblResponsableContratista;
	private JLabel lblCargoDer;
	private JLabel lblFecha;
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
	private JPanel pnlFachadaLateral;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mt1 frame = new Mt1();
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
	public Mt1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1320, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);

		contentPane.setLayout(null);

		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 125, 1286, 560);
		contentPane.add(tabbedPane);

		JPanel pnlPestaña1 = new JPanel();
		tabbedPane.addTab("1-MT Lab. Tecnológico-1", null, pnlPestaña1, null);
		pnlPestaña1.setLayout(null);

		JPanel pnlKitElectrico = new JPanel();
		pnlKitElectrico.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlKitElectrico.setBounds(10, 10, 414, 118);
		pnlPestaña1.add(pnlKitElectrico);
		pnlKitElectrico.setLayout(null);

		JPanel pnlTEEtiquetas = new JPanel();
		pnlTEEtiquetas.setBounds(3, 17, 199, 97);
		pnlKitElectrico.add(pnlTEEtiquetas);
		pnlTEEtiquetas.setLayout(new GridLayout(4, 0, 0, 0));

		JLabel lblTableroElectricoA = new JLabel("Luminarias LED  60w-5000 lum  ");
		lblTableroElectricoA.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEEtiquetas.add(lblTableroElectricoA);

		JLabel lblTableroElectricoB = new JLabel("Tomacorrientes  ");
		lblTableroElectricoB.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEEtiquetas.add(lblTableroElectricoB);

		JLabel lblTableroElectricoC = new JLabel("Interruptor  ");
		lblTableroElectricoC.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEEtiquetas.add(lblTableroElectricoC);

		JLabel lblTableroElectricoD = new JLabel("Kit cable el\u00E9ctrico  ");
		lblTableroElectricoD.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEEtiquetas.add(lblTableroElectricoD);

		JLabel lbl_kit_electrico = new JLabel("KIT ELECTRICO");
		lbl_kit_electrico.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_kit_electrico.setBounds(3, 1, 176, 14);
		pnlKitElectrico.add(lbl_kit_electrico);

		JPanel pnlTECantidad = new JPanel();
		pnlTECantidad.setBounds(210, 17, 55, 97);
		pnlKitElectrico.add(pnlTECantidad);
		pnlTECantidad.setLayout(new GridLayout(4, 2, 0, 0));

		txtTECantidad00 = new JTextField();
		pnlTECantidad.add(txtTECantidad00);
		txtTECantidad00.setColumns(10);

		txtTECantidad01 = new JTextField();
		txtTECantidad01.setColumns(10);
		pnlTECantidad.add(txtTECantidad01);

		txtTECantidad10 = new JTextField();
		txtTECantidad10.setColumns(10);
		pnlTECantidad.add(txtTECantidad10);

		txtTECantidad11 = new JTextField();
		txtTECantidad11.setColumns(10);
		pnlTECantidad.add(txtTECantidad11);

		txtTECantidad20 = new JTextField();
		txtTECantidad20.setColumns(10);
		pnlTECantidad.add(txtTECantidad20);

		txtTECantidad21 = new JTextField();
		txtTECantidad21.setColumns(10);
		pnlTECantidad.add(txtTECantidad21);

		txtTECantidad30 = new JTextField();
		txtTECantidad30.setColumns(10);
		pnlTECantidad.add(txtTECantidad30);

		txtTECantidad31 = new JTextField();
		txtTECantidad31.setColumns(10);
		pnlTECantidad.add(txtTECantidad31);

		JPanel pnlTEObsRef = new JPanel();
		pnlTEObsRef.setBounds(267, 17, 143, 97);
		pnlKitElectrico.add(pnlTEObsRef);
		pnlTEObsRef.setLayout(new GridLayout(4, 0, 0, 0));

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

		lblTECantidad = new JLabel("Cantidad");
		lblTECantidad.setBounds(210, 1, 55, 14);
		pnlKitElectrico.add(lblTECantidad);

		lblTEObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblTEObsRef.setBounds(267, 1, 143, 14);
		pnlKitElectrico.add(lblTEObsRef);

		pnlKitAguaLluvia = new JPanel();
		pnlKitAguaLluvia.setLayout(null);
		pnlKitAguaLluvia.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlKitAguaLluvia.setBounds(10, 150, 414, 163);
		pnlPestaña1.add(pnlKitAguaLluvia);

		pnlEDEtiquetas = new JPanel();
		pnlEDEtiquetas.setBounds(3, 17, 199, 144);
		pnlKitAguaLluvia.add(pnlEDEtiquetas);
		pnlEDEtiquetas.setLayout(new GridLayout(5, 0, 0, 0));

		lblDadosCimentacionBXB = new JLabel("Canal pl\u00E1stico PVC de L=3m  ");
		lblDadosCimentacionBXB.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlEDEtiquetas.add(lblDadosCimentacionBXB);

		lblReflectoresLed = new JLabel(
				"Kit de accesorios de conexi\u00F3n Agua de Lluvia (2 rejila, 4 codos 90\u00B0, 1/4 gl polipega, tornillos, abrazaderas))  ");
		lblReflectoresLed.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlEDEtiquetas.add(lblReflectoresLed);

		lblPostes6mts = new JLabel("Tuber\u00EDa de PVC 75mm L=3m  ");
		lblPostes6mts.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlEDEtiquetas.add(lblPostes6mts);

		lblEDCajasConexion = new JLabel("Tuber\u00EDa de PVC 75mm L=0.6m  ");
		lblEDCajasConexion.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlEDEtiquetas.add(lblEDCajasConexion);

		lblEDKitCableadoElectrico = new JLabel(
				"Kit para conexi\u00F3n de tuber\u00EDa 75 mm. (lija pliego, polipega 1/4 gal, 1 codo 90\u00B0)  ");
		lblEDKitCableadoElectrico.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlEDEtiquetas.add(lblEDKitCableadoElectrico);

		lbl_agua_lluvia = new JLabel("KIT AGUA LLUVIA");
		lbl_agua_lluvia.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_agua_lluvia.setBounds(3, 1, 211, 14);
		pnlKitAguaLluvia.add(lbl_agua_lluvia);

		pnlEDCantidad = new JPanel();
		pnlEDCantidad.setBounds(210, 17, 55, 144);
		pnlKitAguaLluvia.add(pnlEDCantidad);
		pnlEDCantidad.setLayout(new GridLayout(5, 2, 0, 0));

		txtEDCantidad00 = new JTextField();
		txtEDCantidad00.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad00);

		txtEDCantidad01 = new JTextField();
		txtEDCantidad01.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad01);

		txtEDCantidad10 = new JTextField();
		txtEDCantidad10.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad10);

		txtEDCantidad11 = new JTextField();
		txtEDCantidad11.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad11);

		txtEDCantidad20 = new JTextField();
		txtEDCantidad20.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad20);

		txtEDCantidad21 = new JTextField();
		txtEDCantidad21.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad21);

		txtEDCantidad30 = new JTextField();
		txtEDCantidad30.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad30);

		txtEDCantidad31 = new JTextField();
		txtEDCantidad31.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad31);

		txtEDCantidad40 = new JTextField();
		txtEDCantidad40.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad40);

		txtEDCantidad41 = new JTextField();
		txtEDCantidad41.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad41);

		pnlEDObsRef = new JPanel();
		pnlEDObsRef.setBounds(267, 17, 143, 144);
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

		JPanel pnlCompArquitect1_1 = new JPanel();
		pnlCompArquitect1_1.setLayout(null);
		pnlCompArquitect1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlCompArquitect1_1.setBounds(10, 353, 414, 163);
		pnlPestaña1.add(pnlCompArquitect1_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(3, 17, 199, 144);
		pnlCompArquitect1_1.add(panel_1);
		panel_1.setLayout(new GridLayout(6, 0, 0, 0));

		JLabel lblPuertas = new JLabel("Puertas  ");
		lblPuertas.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblPuertas);

		JLabel lblBisagras = new JLabel("Bisagras  ");
		lblBisagras.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblBisagras);

		JLabel lblPerfilSfTipo = new JLabel("Perfil SF Tipo 12 MA-SF-12 para puerta  ");
		lblPerfilSfTipo.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblPerfilSfTipo);

		JLabel lblVentanaCorrederaCompuesta = new JLabel(
				"Ventana corredera, compuesta por tres hojas y dos carriles. UPVC con vidrio flotado de 3 mm de 3x1,10  ");
		lblVentanaCorrederaCompuesta.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblVentanaCorrederaCompuesta);

		JLabel lblPerfilSfTipo_2 = new JLabel("Perfil SF Tipo 12 MA-SF-12 para ventana  ");
		lblPerfilSfTipo_2.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblPerfilSfTipo_2);

		JLabel lblPerfilSfTipo_1 = new JLabel("Paneles TCB (8.8x5.8 m)  ");
		lblPerfilSfTipo_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblPerfilSfTipo_1);

		JLabel lblComponenteArquitectnico = new JLabel("COMPONENTE ARQUITECT\u00D3NICO");
		lblComponenteArquitectnico.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComponenteArquitectnico.setBounds(3, 1, 211, 14);
		pnlCompArquitect1_1.add(lblComponenteArquitectnico);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(210, 17, 55, 144);
		pnlCompArquitect1_1.add(panel_2);
		panel_2.setLayout(new GridLayout(6, 2, 0, 0));

		textField = new JTextField();
		textField.setColumns(10);
		panel_2.add(textField);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel_2.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_2.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_2.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		panel_2.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		panel_2.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		panel_2.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		panel_2.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		panel_2.add(textField_8);

		textField_15 = new JTextField();
		textField_15.setColumns(10);
		panel_2.add(textField_15);

		textField_16 = new JTextField();
		textField_16.setColumns(10);
		panel_2.add(textField_16);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		panel_2.add(textField_9);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(267, 17, 143, 144);
		pnlCompArquitect1_1.add(panel_3);
		panel_3.setLayout(new GridLayout(6, 0, 0, 0));

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		panel_3.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		panel_3.add(textField_11);

		textField_12 = new JTextField();
		textField_12.setColumns(10);
		panel_3.add(textField_12);

		textField_13 = new JTextField();
		textField_13.setColumns(10);
		panel_3.add(textField_13);

		textField_17 = new JTextField();
		textField_17.setColumns(10);
		panel_3.add(textField_17);

		textField_14 = new JTextField();
		textField_14.setColumns(10);
		panel_3.add(textField_14);

		JLabel label_6 = new JLabel("Cantidad");
		label_6.setBounds(210, 1, 55, 14);
		pnlCompArquitect1_1.add(label_6);

		JLabel label_7 = new JLabel("Observaci\u00F3n/Referencia");
		label_7.setBounds(267, 1, 143, 14);
		pnlCompArquitect1_1.add(label_7);

		pnlCompArquitect1_2 = new JPanel();
		pnlCompArquitect1_2.setLayout(null);
		pnlCompArquitect1_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlCompArquitect1_2.setBounds(434, 10, 414, 86);
		pnlPestaña1.add(pnlCompArquitect1_2);

		pnlBAEtiquetas = new JPanel();
		pnlBAEtiquetas.setBounds(3, 17, 199, 65);
		pnlCompArquitect1_2.add(pnlBAEtiquetas);
		pnlBAEtiquetas.setLayout(new GridLayout(3, 0, 0, 0));

		lblKitCableadoBA = new JLabel("Paneles vynil piso (0,15x1,93 m)  ");
		lblKitCableadoBA.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlBAEtiquetas.add(lblKitCableadoBA);

		lblBATuberaPvc = new JLabel("Paneles EPS para cubierta I=7, a= 1 m  ");
		lblBATuberaPvc.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlBAEtiquetas.add(lblBATuberaPvc);

		lblBACajasConexion = new JLabel("Perfil SF Tipo 12 m-SF-12 para paredes  ");
		lblBACajasConexion.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlBAEtiquetas.add(lblBACajasConexion);

		lblKitBombaA = new JLabel("COMPONENTE ARQUITECT\u00D3NICO");
		lblKitBombaA.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKitBombaA.setBounds(3, 1, 176, 14);
		pnlCompArquitect1_2.add(lblKitBombaA);

		lblBACantidad = new JLabel("Cantidad");
		lblBACantidad.setBounds(210, 1, 55, 14);
		pnlCompArquitect1_2.add(lblBACantidad);

		lblBAObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblBAObsRef.setBounds(267, 1, 143, 14);
		pnlCompArquitect1_2.add(lblBAObsRef);

		pnlBACantidad = new JPanel();
		pnlBACantidad.setBounds(210, 17, 55, 65);
		pnlCompArquitect1_2.add(pnlBACantidad);
		pnlBACantidad.setLayout(new GridLayout(3, 2, 0, 0));

		txtBACantidad00 = new JTextField();
		txtBACantidad00.setColumns(10);
		pnlBACantidad.add(txtBACantidad00);

		txtBACantidad01 = new JTextField();
		txtBACantidad01.setColumns(10);
		pnlBACantidad.add(txtBACantidad01);

		txtBACantidad10 = new JTextField();
		txtBACantidad10.setColumns(10);
		pnlBACantidad.add(txtBACantidad10);

		txtBACantidad11 = new JTextField();
		txtBACantidad11.setColumns(10);
		pnlBACantidad.add(txtBACantidad11);

		txtBACantidad20 = new JTextField();
		txtBACantidad20.setColumns(10);
		pnlBACantidad.add(txtBACantidad20);

		txtBACantidad21 = new JTextField();
		txtBACantidad21.setColumns(10);
		pnlBACantidad.add(txtBACantidad21);

		pnlBAObsRef = new JPanel();
		pnlBAObsRef.setBounds(267, 17, 143, 65);
		pnlCompArquitect1_2.add(pnlBAObsRef);
		pnlBAObsRef.setLayout(new GridLayout(3, 0, 0, 0));

		txtBAObsRef0 = new JTextField();
		txtBAObsRef0.setColumns(10);
		pnlBAObsRef.add(txtBAObsRef0);

		txtBAObsRef1 = new JTextField();
		txtBAObsRef1.setColumns(10);
		pnlBAObsRef.add(txtBAObsRef1);

		txtBAObsRef2 = new JTextField();
		txtBAObsRef2.setColumns(10);
		pnlBAObsRef.add(txtBAObsRef2);

		pnlFachadaFrontal = new JPanel();
		pnlFachadaFrontal.setLayout(null);
		pnlFachadaFrontal.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlFachadaFrontal.setBounds(434, 99, 414, 118);
		pnlPestaña1.add(pnlFachadaFrontal);

		pnlAEEtiquetas = new JPanel();
		pnlAEEtiquetas.setBounds(3, 17, 199, 98);
		pnlFachadaFrontal.add(pnlAEEtiquetas);
		pnlAEEtiquetas.setLayout(new GridLayout(4, 0, 0, 0));

		lblDadosCimentacionAXA = new JLabel("Dados de cimentaci\u00F3n de postes AXAcm");
		pnlAEEtiquetas.add(lblDadosCimentacionAXA);

		lblLuminariasLed = new JLabel("Luminarias LED 120 W - 12000 lum");
		pnlAEEtiquetas.add(lblLuminariasLed);

		lblPostesSimples = new JLabel("Postes de 6 mts simples");
		pnlAEEtiquetas.add(lblPostesSimples);

		lblAEKitCableadoElectrico = new JLabel("Kit cableado el\u00E9ctrico AE");
		pnlAEEtiquetas.add(lblAEKitCableadoElectrico);

		lblAEKitAlumbradoExterior = new JLabel("FACHADA FRONTAL");
		lblAEKitAlumbradoExterior.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAEKitAlumbradoExterior.setBounds(3, 1, 176, 14);
		pnlFachadaFrontal.add(lblAEKitAlumbradoExterior);

		pnlAECantidad = new JPanel();
		pnlAECantidad.setBounds(210, 17, 55, 98);
		pnlFachadaFrontal.add(pnlAECantidad);
		pnlAECantidad.setLayout(new GridLayout(4, 2, 0, 0));

		txtAECantidad00 = new JTextField();
		txtAECantidad00.setColumns(10);
		pnlAECantidad.add(txtAECantidad00);

		txtAECantidad01 = new JTextField();
		txtAECantidad01.setColumns(10);
		pnlAECantidad.add(txtAECantidad01);

		txtAECantidad10 = new JTextField();
		txtAECantidad10.setColumns(10);
		pnlAECantidad.add(txtAECantidad10);

		txtAECantidad11 = new JTextField();
		txtAECantidad11.setColumns(10);
		pnlAECantidad.add(txtAECantidad11);

		txtAECantidad20 = new JTextField();
		txtAECantidad20.setColumns(10);
		pnlAECantidad.add(txtAECantidad20);

		txtAECantidad21 = new JTextField();
		txtAECantidad21.setColumns(10);
		pnlAECantidad.add(txtAECantidad21);

		txtAECantidad30 = new JTextField();
		txtAECantidad30.setColumns(10);
		pnlAECantidad.add(txtAECantidad30);

		txtAECantidad31 = new JTextField();
		txtAECantidad31.setColumns(10);
		pnlAECantidad.add(txtAECantidad31);

		pnlAEObsRef = new JPanel();
		pnlAEObsRef.setBounds(267, 17, 143, 98);
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
		pnlFachadaPosterior.setBounds(434, 220, 414, 95);
		pnlPestaña1.add(pnlFachadaPosterior);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(3, 17, 199, 73);
		pnlFachadaPosterior.add(panel_5);
		panel_5.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_1 = new JLabel("Kit de cableado el\u00E9ctrico BA");
		panel_5.add(label_1);

		JLabel label_2 = new JLabel("Tuber\u00EDa PVC 2\u00B4para cableado l=6m");
		panel_5.add(label_2);

		JLabel label_3 = new JLabel("Cajas de Conexi\u00F3n  0,60x0,60 mt");
		panel_5.add(label_3);

		JLabel lblFachadaPosterior = new JLabel("FACHADA POSTERIOR");
		lblFachadaPosterior.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFachadaPosterior.setBounds(3, 1, 176, 14);
		pnlFachadaPosterior.add(lblFachadaPosterior);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(210, 17, 55, 73);
		pnlFachadaPosterior.add(panel_6);
		panel_6.setLayout(new GridLayout(3, 2, 0, 0));

		textField_18 = new JTextField();
		textField_18.setColumns(10);
		panel_6.add(textField_18);

		textField_19 = new JTextField();
		textField_19.setColumns(10);
		panel_6.add(textField_19);

		textField_20 = new JTextField();
		textField_20.setColumns(10);
		panel_6.add(textField_20);

		textField_21 = new JTextField();
		textField_21.setColumns(10);
		panel_6.add(textField_21);

		textField_22 = new JTextField();
		textField_22.setColumns(10);
		panel_6.add(textField_22);

		textField_23 = new JTextField();
		textField_23.setColumns(10);
		panel_6.add(textField_23);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(267, 17, 143, 73);
		pnlFachadaPosterior.add(panel_7);
		panel_7.setLayout(new GridLayout(3, 0, 0, 0));

		textField_24 = new JTextField();
		textField_24.setColumns(10);
		panel_7.add(textField_24);

		textField_25 = new JTextField();
		textField_25.setColumns(10);
		panel_7.add(textField_25);

		textField_26 = new JTextField();
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
		pnlFachadaLateral.setBounds(434, 317, 414, 49);
		pnlPestaña1.add(pnlFachadaLateral);

		panel_9 = new JPanel();
		panel_9.setBounds(3, 17, 199, 29);
		pnlFachadaLateral.add(panel_9);
		panel_9.setLayout(new GridLayout(1, 0, 0, 0));

		label_9 = new JLabel("Kit de cableado el\u00E9ctrico BA");
		panel_9.add(label_9);

		lblFachadaLateral = new JLabel("FACHADA LATERAL");
		lblFachadaLateral.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFachadaLateral.setBounds(3, 1, 176, 14);
		pnlFachadaLateral.add(lblFachadaLateral);

		panel_10 = new JPanel();
		panel_10.setBounds(210, 17, 55, 29);
		pnlFachadaLateral.add(panel_10);
		panel_10.setLayout(new GridLayout(1, 2, 0, 0));
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		panel_10.add(textField_38);

		textField_27 = new JTextField();
		textField_27.setColumns(10);
		panel_10.add(textField_27);

		panel_11 = new JPanel();
		panel_11.setBounds(267, 17, 143, 29);
		pnlFachadaLateral.add(panel_11);
		panel_11.setLayout(new GridLayout(1, 0, 0, 0));

		textField_33 = new JTextField();
		textField_33.setColumns(10);
		panel_11.add(textField_33);

		label_13 = new JLabel("Cantidad");
		label_13.setBounds(210, 1, 55, 14);
		pnlFachadaLateral.add(label_13);

		label_14 = new JLabel("Observaci\u00F3n/Referencia");
		label_14.setBounds(267, 1, 143, 14);
		pnlFachadaLateral.add(label_14);

		pnlComponenteEst = new JPanel();
		pnlComponenteEst.setLayout(null);
		pnlComponenteEst.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlComponenteEst.setBounds(858, 11, 414, 357);
		pnlPestaña1.add(pnlComponenteEst);

		pnlTEtiquetas = new JPanel();
		pnlTEtiquetas.setBounds(3, 17, 199, 334);
		pnlComponenteEst.add(pnlTEtiquetas);
		pnlTEtiquetas.setLayout(new GridLayout(12, 0, 0, 0));

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

		lblTKitTransformador = new JLabel("COMPONENTE ESTRUCTURAL");
		lblTKitTransformador.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTKitTransformador.setBounds(3, 1, 176, 14);
		pnlComponenteEst.add(lblTKitTransformador);

		pnlTCantidad = new JPanel();
		pnlTCantidad.setBounds(210, 17, 55, 334);
		pnlComponenteEst.add(pnlTCantidad);
		pnlTCantidad.setLayout(new GridLayout(12, 2, 0, 0));

		txtTCantidad00 = new JTextField();
		txtTCantidad00.setColumns(10);
		pnlTCantidad.add(txtTCantidad00);

		txtTCantidad01 = new JTextField();
		txtTCantidad01.setColumns(10);
		pnlTCantidad.add(txtTCantidad01);

		txtTCantidad10 = new JTextField();
		txtTCantidad10.setColumns(10);
		pnlTCantidad.add(txtTCantidad10);

		txtTCantidad11 = new JTextField();
		txtTCantidad11.setColumns(10);
		pnlTCantidad.add(txtTCantidad11);

		txtTCantidad20 = new JTextField();
		txtTCantidad20.setColumns(10);
		pnlTCantidad.add(txtTCantidad20);

		txtTCantidad21 = new JTextField();
		txtTCantidad21.setColumns(10);
		pnlTCantidad.add(txtTCantidad21);

		txtTCantidad30 = new JTextField();
		txtTCantidad30.setColumns(10);
		pnlTCantidad.add(txtTCantidad30);

		txtTCantidad31 = new JTextField();
		txtTCantidad31.setColumns(10);
		pnlTCantidad.add(txtTCantidad31);

		txtTCantidad40 = new JTextField();
		txtTCantidad40.setColumns(10);
		pnlTCantidad.add(txtTCantidad40);

		txtTCantidad41 = new JTextField();
		txtTCantidad41.setColumns(10);
		pnlTCantidad.add(txtTCantidad41);

		textField_29 = new JTextField();
		textField_29.setColumns(10);
		pnlTCantidad.add(textField_29);

		textField_28 = new JTextField();
		textField_28.setColumns(10);
		pnlTCantidad.add(textField_28);

		pnlTObsRef = new JPanel();
		pnlTObsRef.setBounds(267, 17, 143, 334);
		pnlComponenteEst.add(pnlTObsRef);
		pnlTObsRef.setLayout(new GridLayout(12, 0, 0, 0));

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

		textField_30 = new JTextField();
		textField_30.setColumns(10);
		pnlTObsRef.add(textField_30);

		textField_31 = new JTextField();
		textField_31.setColumns(10);
		pnlTObsRef.add(textField_31);

		textField_32 = new JTextField();
		textField_32.setColumns(10);
		pnlTObsRef.add(textField_32);

		textField_34 = new JTextField();
		textField_34.setColumns(10);
		pnlTObsRef.add(textField_34);

		txtTObsRef4 = new JTextField();
		txtTObsRef4.setColumns(10);
		pnlTObsRef.add(txtTObsRef4);

		textField_35 = new JTextField();
		textField_35.setColumns(10);
		pnlTObsRef.add(textField_35);

		textField_36 = new JTextField();
		textField_36.setColumns(10);
		pnlTObsRef.add(textField_36);

		textField_37 = new JTextField();
		textField_37.setColumns(10);
		pnlTObsRef.add(textField_37);

		lblTCantidad = new JLabel("Cantidad");
		lblTCantidad.setBounds(210, 1, 55, 14);
		pnlComponenteEst.add(lblTCantidad);

		lblTObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblTObsRef.setBounds(267, 1, 143, 14);
		pnlComponenteEst.add(lblTObsRef);

		JPInformacionObligatoria infoObligatoria = new JPInformacionObligatoria();
		pnlPestaña1.add(infoObligatoria.getInformacionObligatoria());
	}
}
