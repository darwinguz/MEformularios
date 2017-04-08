package com.capa.presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.capa.datos.TAula;
import com.capa.datos.TCabecera;
import com.capa.datos.TFichaMa;
import com.capa.datos.TGrupo;
import com.capa.datos.TInformacionObligatoria;
import com.capa.negocios.ComponenteCabecera;
import com.capa.negocios.ComponenteFichaMA;
import com.capa.negocios.ComponenteInfoObligatoria;
import com.capa.negocios.ServicioCabecera;
import com.capa.negocios.ServicioFichaMA;
import com.capa.negocios.ServicioInfoObligatoria;
import static com.capa.util.Utilitarios.*;
import static com.capa.util.Validaciones.validarInfo;

import com.capa.util.Utilitarios;
import com.capa.util.Validaciones;

public class MaTemplate extends JFrame {

	private static final long serialVersionUID = 8480152059626754031L;

	protected JPanel contentPane;

	protected JTextField txtKECantidad01;
	protected JTextField txtKECantidad11;
	protected JTextField txtKECantidad21;
	protected JTextField txtKECantidad31;
	protected JTextField txtKEObsRef1;
	protected JTextField txtKEObsRef0;
	protected JTextField txtKEObsRef2;
	protected JTextField txtKEObsRef3;
	protected JTextField txtKALCantidad01;
	protected JTextField txtKALObsRef0;
	protected JTextField txtFFCantidad00;
	protected JTextField txtFFCantidad01;
	protected JTextField txtFFCantidad10;
	protected JTextField txtFFCantidad11;
	protected JTextField txtFFCantidad20;
	protected JTextField txtFFCantidad21;
	protected JTextField txtFFCantidad30;
	protected JTextField txtFFCantidad31;
	protected JTextField txtFFObsRef0;
	protected JTextField txtFFObsRef1;
	protected JTextField txtFFObsRef2;
	protected JTextField txtFFObsRef3;
	protected JTextField txtCECantidad00;
	protected JTextField txtCECantidad10;
	protected JTextField txtCECantidad20;
	protected JTextField txtCECantidad30;
	protected JTextField txtCECantidad40;
	protected JTextField txtCECantidad50;
	protected JTextField txtCECantidad60;
	protected JTextField txtCECantidad70;
	protected JTextField txtCECantidad80;
	protected JTextField txtCECantidad90;
	protected JTextField txtCEObsRef0;
	protected JTextField txtCEObsRef1;
	protected JTextField txtCEObsRef2;
	protected JTextField txtCEObsRef3;
	protected JTextField txtCEObsRef8;
	protected JTextField txtCACantidad00;
	protected JTextField txtCACantidad01;
	protected JTextField txtCACantidad10;
	protected JTextField txtCACantidad11;
	protected JTextField txtCAObsRef0;
	protected JTextField txtCAObsRef1;
	protected JTextField txtFPCantidad00;
	protected JTextField txtFPCantidad01;
	protected JTextField txtFPCantidad10;
	protected JTextField txtFPCantidad11;
	protected JTextField txtFPCantidad20;
	protected JTextField txtFPCantidad21;
	protected JTextField txtFPObsRef0;
	protected JTextField txtFPObsRef1;
	protected JTextField txtFPObsRef2;
	protected JTextField txtCCantidad01;
	protected JTextField txtCObsRef0;
	protected JTextField txtCECantidad120;
	protected JTextField txtCECantidad100;
	protected JTextField txtCEObsRef4;
	protected JTextField txtCEObsRef5;
	protected JTextField txtCEObsRef6;
	protected JTextField txtCEObsRef7;
	protected JTextField txtCEObsRef9;
	protected JTextField txtCEObsRef10;
	protected JTextField txtCEObsRef12;
	protected JTextField txtCCantidad00;
	protected JTextField txtKECantidad40;
	protected JTextField txtKECantidad41;
	protected JTextField txtKEObsRef4;
	protected JTextField txtFLCantidad00;
	protected JTextField txtFLCantidad01;
	protected JTextField txtFLCantidad10;
	protected JTextField txtFLCantidad11;
	protected JTextField txtFLObsRef0;
	protected JTextField txtFLObsRef1;
	protected JTextField txtICantidad00;
	protected JTextField txtICantidad01;
	protected JTextField txtICantidad10;
	protected JTextField txtICantidad11;
	protected JTextField txtIObsRef0;
	protected JTextField txtIObsRef1;
	protected JTextField txtCECantidad110;
	protected JTextField txtCEObsRef11;
	protected JTextField txtKALCantidad40;
	protected JTextField txtKALCantidad41;
	protected JTextField txtKALObsRef4;
	protected JTextField txtKALCantidad10;
	protected JTextField txtKALCantidad11;
	protected JTextField txtKALObsRef1;
	protected JTextField txtKALCantidad20;
	protected JTextField txtKALCantidad21;
	protected JTextField txtKALCantidad30;
	protected JTextField txtKALCantidad31;
	protected JTextField txtKALObsRef2;
	protected JTextField txtKALObsRef3;
	protected JTextField txtCACantidad20;
	protected JTextField txtCACantidad21;
	protected JTextField txtCACantidad30;
	protected JTextField txtCACantidad31;
	protected JTextField txtCACantidad40;
	protected JTextField txtCACantidad41;
	protected JTextField txtCAObsRef2;
	protected JTextField txtCAObsRef3;
	protected JTextField txtCAObsRef4;
	protected JTextField txtKECantidad00;
	protected JTextField txtKECantidad10;
	protected JTextField txtKECantidad20;
	protected JTextField txtKECantidad30;
	protected JTextField txtKALCantidad00;
	protected String nombreAula;
	private JTextField txtCECantidad01;
	private JTextField txtCECantidad11;
	private JTextField txtCECantidad21;
	private JTextField txtCECantidad31;
	private JTextField txtCECantidad41;
	private JTextField txtCECantidad51;
	private JTextField txtCECantidad61;
	private JTextField txtCECantidad71;
	private JTextField txtCECantidad81;
	private JTextField txtCECantidad91;
	private JTextField txtCECantidad101;
	private JTextField txtCECantidad111;
	private JTextField txtCECantidad121;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaTemplate frame = new MaTemplate("Ma-Template");
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
	public MaTemplate(String nombreAula) {
		this.nombreAula = nombreAula;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1320, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setTitle(nombreAula);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 125, 1284, 560);
		contentPane.add(tabbedPane);

		JPanel pnlPestaña1 = new JPanel();
		tabbedPane.addTab(nombreAula, null, pnlPestaña1, null);
		pnlPestaña1.setLayout(null);

		JPanel pnlKitElectrico = new JPanel();
		pnlKitElectrico.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlKitElectrico.setBounds(10, 10, 414, 120);
		pnlPestaña1.add(pnlKitElectrico);
		pnlKitElectrico.setLayout(null);

		JLabel lbl_kit_electrico = new JLabel("KIT ELÉCTRICO");
		lbl_kit_electrico.setFont(new Font("Arial", Font.BOLD, 11));
		lbl_kit_electrico.setBounds(3, 1, 176, 14);
		pnlKitElectrico.add(lbl_kit_electrico);

		JLabel lblTECantidad = new JLabel("Cantidad");
		lblTECantidad.setBounds(210, 1, 55, 14);
		pnlKitElectrico.add(lblTECantidad);

		JLabel lblTEObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblTEObsRef.setBounds(267, 1, 143, 14);
		pnlKitElectrico.add(lblTEObsRef);

		JPanel pnlTEEtiquetas = new JPanel();
		pnlTEEtiquetas.setBounds(3, 17, 199, 100);
		pnlKitElectrico.add(pnlTEEtiquetas);
		pnlTEEtiquetas.setLayout(new GridLayout(5, 0, 0, 0));

		JLabel lblTableroElectricoA = new JLabel("Luminarias LED  60w-5000 lum  ");
		lblTableroElectricoA.setFont(new Font("Arial", Font.PLAIN, 10));
		lblTableroElectricoA.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEEtiquetas.add(lblTableroElectricoA);

		JLabel lblTableroElectricoB = new JLabel("Tomacorrientes  ");
		lblTableroElectricoB.setFont(new Font("Arial", Font.PLAIN, 10));
		lblTableroElectricoB.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEEtiquetas.add(lblTableroElectricoB);

		JLabel lblTableroElectricoC = new JLabel("Interruptor  ");
		lblTableroElectricoC.setFont(new Font("Arial", Font.PLAIN, 10));
		lblTableroElectricoC.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEEtiquetas.add(lblTableroElectricoC);

		JLabel lblTableroElectricoD = new JLabel("Kit cable el\u00E9ctrico  ");
		lblTableroElectricoD.setFont(new Font("Arial", Font.PLAIN, 10));
		lblTableroElectricoD.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEEtiquetas.add(lblTableroElectricoD);

		JLabel lblDetectorDeHumo = new JLabel("Detector de Humo  ");
		lblDetectorDeHumo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDetectorDeHumo.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlTEEtiquetas.add(lblDetectorDeHumo);

		JPanel pnlTECantidad = new JPanel();
		pnlTECantidad.setBounds(210, 17, 55, 100);
		pnlKitElectrico.add(pnlTECantidad);
		pnlTECantidad.setLayout(new GridLayout(5, 2, 0, 0));

		txtKECantidad00 = new JTextField();
		txtKECantidad00.setEditable(false);
		txtKECantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECantidad00.setText("9");
		pnlTECantidad.add(txtKECantidad00);
		txtKECantidad00.setColumns(10);
		Validaciones.validarDigitos(txtKECantidad00);

		txtKECantidad01 = new JTextField();
		txtKECantidad01.setColumns(10);
		pnlTECantidad.add(txtKECantidad01);
		Validaciones.validarDigitos(txtKECantidad01);

		txtKECantidad10 = new JTextField();
		txtKECantidad10.setEditable(false);
		txtKECantidad10.setText("2");
		txtKECantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECantidad10.setColumns(10);
		pnlTECantidad.add(txtKECantidad10);
		Validaciones.validarDigitos(txtKECantidad10);

		txtKECantidad11 = new JTextField();
		txtKECantidad11.setColumns(10);
		pnlTECantidad.add(txtKECantidad11);
		Validaciones.validarDigitos(txtKECantidad11);

		txtKECantidad20 = new JTextField();
		txtKECantidad20.setEditable(false);
		txtKECantidad20.setText("1");
		txtKECantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECantidad20.setColumns(10);
		pnlTECantidad.add(txtKECantidad20);
		Validaciones.validarDigitos(txtKECantidad20);

		txtKECantidad21 = new JTextField();
		txtKECantidad21.setColumns(10);
		pnlTECantidad.add(txtKECantidad21);
		Validaciones.validarDigitos(txtKECantidad21);

		txtKECantidad30 = new JTextField();
		txtKECantidad30.setEditable(false);
		txtKECantidad30.setText("1");
		txtKECantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECantidad30.setColumns(10);
		pnlTECantidad.add(txtKECantidad30);
		Validaciones.validarDigitos(txtKECantidad30);

		txtKECantidad31 = new JTextField();
		txtKECantidad31.setColumns(10);
		pnlTECantidad.add(txtKECantidad31);
		Validaciones.validarDigitos(txtKECantidad01);

		txtKECantidad40 = new JTextField();
		txtKECantidad40.setEditable(false);
		txtKECantidad40.setText("1");
		txtKECantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECantidad40.setColumns(10);
		pnlTECantidad.add(txtKECantidad40);
		Validaciones.validarDigitos(txtKECantidad40);

		txtKECantidad41 = new JTextField();
		txtKECantidad41.setColumns(10);
		pnlTECantidad.add(txtKECantidad41);
		Validaciones.validarDigitos(txtKECantidad41);

		JPanel pnlTEObsRef = new JPanel();
		pnlTEObsRef.setBounds(267, 17, 143, 100);
		pnlKitElectrico.add(pnlTEObsRef);
		pnlTEObsRef.setLayout(new GridLayout(5, 0, 0, 0));

		txtKEObsRef0 = new JTextField();
		pnlTEObsRef.add(txtKEObsRef0);
		txtKEObsRef0.setColumns(10);

		txtKEObsRef1 = new JTextField();
		pnlTEObsRef.add(txtKEObsRef1);
		txtKEObsRef1.setColumns(10);

		txtKEObsRef2 = new JTextField();
		txtKEObsRef2.setColumns(10);
		pnlTEObsRef.add(txtKEObsRef2);

		txtKEObsRef3 = new JTextField();
		txtKEObsRef3.setColumns(10);
		pnlTEObsRef.add(txtKEObsRef3);

		txtKEObsRef4 = new JTextField();
		txtKEObsRef4.setColumns(10);
		pnlTEObsRef.add(txtKEObsRef4);

		JPanel pnlKitAguaLluvia = new JPanel();
		pnlKitAguaLluvia.setLayout(null);
		pnlKitAguaLluvia.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlKitAguaLluvia.setBounds(10, 150, 414, 174);
		pnlPestaña1.add(pnlKitAguaLluvia);

		JLabel lbl_agua_lluvia = new JLabel("KIT AGUA LLUVIA");
		lbl_agua_lluvia.setFont(new Font("Arial", Font.BOLD, 10));
		lbl_agua_lluvia.setBounds(3, 1, 211, 14);
		pnlKitAguaLluvia.add(lbl_agua_lluvia);

		JLabel lblEDCantidad = new JLabel("Cantidad");
		lblEDCantidad.setBounds(210, 1, 55, 14);
		pnlKitAguaLluvia.add(lblEDCantidad);

		JLabel lblEDObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblEDObsRef.setBounds(267, 1, 143, 14);
		pnlKitAguaLluvia.add(lblEDObsRef);

		JPanel pnlEDEtiquetas1 = new JPanel();
		pnlEDEtiquetas1.setBounds(3, 17, 199, 20);
		pnlKitAguaLluvia.add(pnlEDEtiquetas1);
		pnlEDEtiquetas1.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblDadosCimentacionBXB = new JLabel("Canal pl\u00E1stico PVC de L=3m  ");
		lblDadosCimentacionBXB.setFont(new Font("Arial", Font.PLAIN, 10));
		lblDadosCimentacionBXB.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlEDEtiquetas1.add(lblDadosCimentacionBXB);

		JPanel pnlEDCantidad1 = new JPanel();
		pnlEDCantidad1.setBounds(210, 17, 55, 20);
		pnlKitAguaLluvia.add(pnlEDCantidad1);
		pnlEDCantidad1.setLayout(new GridLayout(1, 2, 0, 0));

		txtKALCantidad00 = new JTextField();
		txtKALCantidad00.setEditable(false);
		txtKALCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtKALCantidad00.setText("3");
		txtKALCantidad00.setColumns(10);
		pnlEDCantidad1.add(txtKALCantidad00);
		Validaciones.validarDigitos(txtKALCantidad00);

		txtKALCantidad01 = new JTextField();
		txtKALCantidad01.setColumns(10);
		pnlEDCantidad1.add(txtKALCantidad01);
		Validaciones.validarDigitos(txtKALCantidad01);

		JPanel pnlEDObsRef1 = new JPanel();
		pnlEDObsRef1.setBounds(267, 17, 143, 20);
		pnlKitAguaLluvia.add(pnlEDObsRef1);
		pnlEDObsRef1.setLayout(new GridLayout(1, 0, 0, 0));

		txtKALObsRef0 = new JTextField();
		txtKALObsRef0.setColumns(10);
		pnlEDObsRef1.add(txtKALObsRef0);

		JPanel pnlEDEtiquetas2 = new JPanel();
		pnlEDEtiquetas2.setBounds(3, 42, 199, 40);
		pnlKitAguaLluvia.add(pnlEDEtiquetas2);
		pnlEDEtiquetas2.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblkitDeAccesorios = new JLabel(
				"<html><body><p align=\"right\">Kit de accesorios de conexión Agua de Lluvia (2 rejila, 4 codos 90°, 1/4 gl polipega, tornillos, abrazaderas)</p></html></body>");
		lblkitDeAccesorios.setVerticalAlignment(SwingConstants.TOP);
		lblkitDeAccesorios.setHorizontalAlignment(SwingConstants.RIGHT);
		lblkitDeAccesorios.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlEDEtiquetas2.add(lblkitDeAccesorios);

		JPanel pnlEDCantidad2 = new JPanel();
		pnlEDCantidad2.setBounds(210, 50, 55, 20);
		pnlKitAguaLluvia.add(pnlEDCantidad2);
		pnlEDCantidad2.setLayout(new GridLayout(1, 2, 0, 0));

		txtKALCantidad10 = new JTextField();
		txtKALCantidad10.setEditable(false);
		txtKALCantidad10.setText("2");
		txtKALCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtKALCantidad10.setColumns(10);
		pnlEDCantidad2.add(txtKALCantidad10);
		Validaciones.validarDigitos(txtKALCantidad10);

		txtKALCantidad11 = new JTextField();
		txtKALCantidad11.setColumns(10);
		pnlEDCantidad2.add(txtKALCantidad11);
		Validaciones.validarDigitos(txtKALCantidad11);

		JPanel pnlEDObsRef2 = new JPanel();
		pnlEDObsRef2.setBounds(267, 50, 143, 20);
		pnlKitAguaLluvia.add(pnlEDObsRef2);
		pnlEDObsRef2.setLayout(new GridLayout(1, 0, 0, 0));

		txtKALObsRef1 = new JTextField();
		txtKALObsRef1.setColumns(10);
		pnlEDObsRef2.add(txtKALObsRef1);

		JPanel pnlEDEtiquetas3 = new JPanel();
		pnlEDEtiquetas3.setBounds(3, 86, 199, 40);
		pnlKitAguaLluvia.add(pnlEDEtiquetas3);
		pnlEDEtiquetas3.setLayout(new GridLayout(2, 0, 0, 0));

		JLabel label_32 = new JLabel("Tubería de PVC 75mm L=3m  ");
		label_32.setHorizontalAlignment(SwingConstants.RIGHT);
		label_32.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlEDEtiquetas3.add(label_32);

		JLabel label_33 = new JLabel("Tubería de PVC 75mm L=0.6m  ");
		label_33.setHorizontalAlignment(SwingConstants.RIGHT);
		label_33.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlEDEtiquetas3.add(label_33);

		JPanel pnlEDCantidad3 = new JPanel();
		pnlEDCantidad3.setBounds(210, 86, 55, 40);
		pnlKitAguaLluvia.add(pnlEDCantidad3);
		pnlEDCantidad3.setLayout(new GridLayout(2, 2, 0, 0));

		txtKALCantidad20 = new JTextField();
		txtKALCantidad20.setEditable(false);
		txtKALCantidad20.setText("2");
		txtKALCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtKALCantidad20.setColumns(10);
		pnlEDCantidad3.add(txtKALCantidad20);
		Validaciones.validarDigitos(txtKALCantidad20);

		txtKALCantidad21 = new JTextField();
		txtKALCantidad21.setColumns(10);
		pnlEDCantidad3.add(txtKALCantidad21);
		Validaciones.validarDigitos(txtKALCantidad21);

		txtKALCantidad30 = new JTextField();
		txtKALCantidad30.setEditable(false);
		txtKALCantidad30.setText("1");
		txtKALCantidad30.setColumns(10);
		txtKALCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		pnlEDCantidad3.add(txtKALCantidad30);
		Validaciones.validarDigitos(txtKALCantidad30);

		txtKALCantidad31 = new JTextField();
		txtKALCantidad31.setColumns(10);
		pnlEDCantidad3.add(txtKALCantidad31);
		Validaciones.validarDigitos(txtKALCantidad31);

		JPanel pnlEDObsRef3 = new JPanel();
		pnlEDObsRef3.setBounds(267, 86, 143, 40);
		pnlKitAguaLluvia.add(pnlEDObsRef3);
		pnlEDObsRef3.setLayout(new GridLayout(2, 0, 0, 0));

		txtKALObsRef2 = new JTextField();
		txtKALObsRef2.setColumns(10);
		pnlEDObsRef3.add(txtKALObsRef2);

		txtKALObsRef3 = new JTextField();
		txtKALObsRef3.setColumns(10);
		pnlEDObsRef3.add(txtKALObsRef3);

		JPanel pnlEDEtiquetas4 = new JPanel();
		pnlEDEtiquetas4.setBounds(3, 130, 199, 40);
		pnlKitAguaLluvia.add(pnlEDEtiquetas4);
		pnlEDEtiquetas4.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel label_25 = new JLabel(
				"<html><body><p align=\"justify\">Kit para conexión de tubería 75 mm. (lija pliego, polipega 1/4 gal, 1 codo 90°) </p></body></html>");
		label_25.setHorizontalAlignment(SwingConstants.RIGHT);
		label_25.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlEDEtiquetas4.add(label_25);

		JPanel pnlEDCantidad4 = new JPanel();
		pnlEDCantidad4.setBounds(210, 137, 55, 20);
		pnlKitAguaLluvia.add(pnlEDCantidad4);
		pnlEDCantidad4.setLayout(new GridLayout(1, 2, 0, 0));

		txtKALCantidad40 = new JTextField();
		txtKALCantidad40.setEditable(false);
		txtKALCantidad40.setText("1");
		txtKALCantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtKALCantidad40.setColumns(10);
		pnlEDCantidad4.add(txtKALCantidad40);
		Validaciones.validarDigitos(txtKALCantidad40);

		txtKALCantidad41 = new JTextField();
		txtKALCantidad41.setColumns(10);
		pnlEDCantidad4.add(txtKALCantidad41);
		Validaciones.validarDigitos(txtKALCantidad41);

		JPanel pnlEDObsRef4 = new JPanel();
		pnlEDObsRef4.setBounds(267, 137, 143, 20);
		pnlKitAguaLluvia.add(pnlEDObsRef4);
		pnlEDObsRef4.setLayout(new GridLayout(1, 0, 0, 0));

		txtKALObsRef4 = new JTextField();
		txtKALObsRef4.setColumns(10);
		pnlEDObsRef4.add(txtKALObsRef4);

		JPanel pnlCompArquitect = new JPanel();
		pnlCompArquitect.setLayout(null);
		pnlCompArquitect.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlCompArquitect.setBounds(10, 345, 414, 174);
		pnlPestaña1.add(pnlCompArquitect);

		JLabel lblComponenteArquitectnico = new JLabel("COMPONENTE ARQUITECT\u00D3NICO");
		lblComponenteArquitectnico.setFont(new Font("Arial", Font.BOLD, 11));
		lblComponenteArquitectnico.setBounds(3, 1, 211, 14);
		pnlCompArquitect.add(lblComponenteArquitectnico);

		JLabel label_6 = new JLabel("Cantidad");
		label_6.setBounds(210, 1, 55, 14);
		pnlCompArquitect.add(label_6);

		JLabel label_7 = new JLabel("Observaci\u00F3n/Referencia");
		label_7.setBounds(267, 1, 143, 14);
		pnlCompArquitect.add(label_7);

		JPanel pnlEtiquetasCompArq0 = new JPanel();
		pnlEtiquetasCompArq0.setBounds(3, 17, 199, 40);
		pnlCompArquitect.add(pnlEtiquetasCompArq0);
		pnlEtiquetasCompArq0.setLayout(new GridLayout(2, 0, 0, 0));

		JLabel lblPuertas = new JLabel("Puertas  ");
		lblPuertas.setFont(new Font("Arial", Font.PLAIN, 10));
		lblPuertas.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlEtiquetasCompArq0.add(lblPuertas);

		JLabel lblBisagras = new JLabel("Bisagras  ");
		lblBisagras.setFont(new Font("Arial", Font.PLAIN, 10));
		lblBisagras.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlEtiquetasCompArq0.add(lblBisagras);

		JPanel pnlEtiquetasCompArq1 = new JPanel();
		pnlEtiquetasCompArq1.setBounds(3, 60, 199, 40);
		pnlCompArquitect.add(pnlEtiquetasCompArq1);
		pnlEtiquetasCompArq1.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel label_27 = new JLabel(
				"<html><body><p align=\"right\">Perfil SF Tipo 12 MA-SF-12 para puerta y Tipo 12 MS-SF 12 paredes</p></body></html>");
		label_27.setHorizontalAlignment(SwingConstants.RIGHT);
		label_27.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlEtiquetasCompArq1.add(label_27);

		JPanel pnlEtiquetasCompArq2 = new JPanel();
		pnlEtiquetasCompArq2.setBounds(3, 104, 199, 40);
		pnlCompArquitect.add(pnlEtiquetasCompArq2);
		pnlEtiquetasCompArq2.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblventanaCorrederaCompuesta = new JLabel(
				"<html><body><p align=\"right\">Ventana corredera, compuesta por tres hojas y dos carriles. UPVC con vidrio flotado de 3 mm de 3x1,10 </p></body></html>");
		lblventanaCorrederaCompuesta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblventanaCorrederaCompuesta.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlEtiquetasCompArq2.add(lblventanaCorrederaCompuesta);

		JPanel pnlEtiquetasCompArq3 = new JPanel();
		pnlEtiquetasCompArq3.setBounds(3, 148, 199, 20);
		pnlCompArquitect.add(pnlEtiquetasCompArq3);
		pnlEtiquetasCompArq3.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel label_22 = new JLabel("Perfil SF Tipo 12 MA-SF-12 para ventana  ");
		label_22.setHorizontalAlignment(SwingConstants.RIGHT);
		label_22.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlEtiquetasCompArq3.add(label_22);

		JPanel pnlCantidad0 = new JPanel();
		pnlCantidad0.setBounds(210, 17, 55, 40);
		pnlCompArquitect.add(pnlCantidad0);
		pnlCantidad0.setLayout(new GridLayout(2, 2, 0, 0));

		txtCACantidad00 = new JTextField();
		txtCACantidad00.setEditable(false);
		txtCACantidad00.setText("1");
		txtCACantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad00.setColumns(10);
		pnlCantidad0.add(txtCACantidad00);
		Validaciones.validarDigitos(txtCACantidad00);

		txtCACantidad01 = new JTextField();
		txtCACantidad01.setColumns(10);
		pnlCantidad0.add(txtCACantidad01);
		Validaciones.validarDigitos(txtCACantidad01);

		txtCACantidad10 = new JTextField();
		txtCACantidad10.setEditable(false);
		txtCACantidad10.setText("3");
		txtCACantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad10.setColumns(10);
		pnlCantidad0.add(txtCACantidad10);
		Validaciones.validarDigitos(txtCACantidad10);

		txtCACantidad11 = new JTextField();
		txtCACantidad11.setColumns(10);
		pnlCantidad0.add(txtCACantidad11);
		Validaciones.validarDigitos(txtCACantidad11);

		JPanel pnlCantidad1 = new JPanel();
		pnlCantidad1.setBounds(210, 68, 55, 20);
		pnlCompArquitect.add(pnlCantidad1);
		pnlCantidad1.setLayout(new GridLayout(1, 2, 0, 0));

		txtCACantidad20 = new JTextField();
		txtCACantidad20.setEditable(false);
		txtCACantidad20.setText("11");
		txtCACantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad20.setColumns(10);
		pnlCantidad1.add(txtCACantidad20);
		Validaciones.validarDigitos(txtCACantidad20);

		txtCACantidad21 = new JTextField();
		txtCACantidad21.setColumns(10);
		pnlCantidad1.add(txtCACantidad21);
		Validaciones.validarDigitos(txtCACantidad21);

		JPanel pnlCantidad2 = new JPanel();
		pnlCantidad2.setBounds(210, 113, 55, 20);
		pnlCompArquitect.add(pnlCantidad2);
		pnlCantidad2.setLayout(new GridLayout(1, 2, 0, 0));

		txtCACantidad30 = new JTextField();
		txtCACantidad30.setEditable(false);
		txtCACantidad30.setText("3");
		txtCACantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad30.setColumns(10);
		pnlCantidad2.add(txtCACantidad30);
		Validaciones.validarDigitos(txtCACantidad30);

		txtCACantidad31 = new JTextField();
		txtCACantidad31.setColumns(10);
		pnlCantidad2.add(txtCACantidad31);
		Validaciones.validarDigitos(txtCACantidad31);

		JPanel pnlCantidad3 = new JPanel();
		pnlCantidad3.setBounds(210, 148, 55, 20);
		pnlCompArquitect.add(pnlCantidad3);
		pnlCantidad3.setLayout(new GridLayout(1, 2, 0, 0));

		txtCACantidad40 = new JTextField();
		txtCACantidad40.setEditable(false);
		txtCACantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad40.setText("3");
		txtCACantidad40.setColumns(10);
		pnlCantidad3.add(txtCACantidad40);
		Validaciones.validarDigitos(txtCACantidad40);

		txtCACantidad41 = new JTextField();
		txtCACantidad41.setColumns(10);
		pnlCantidad3.add(txtCACantidad41);
		Validaciones.validarDigitos(txtCACantidad41);

		JPanel pnlOR0 = new JPanel();
		pnlOR0.setBounds(267, 17, 143, 40);
		pnlCompArquitect.add(pnlOR0);
		pnlOR0.setLayout(new GridLayout(2, 0, 0, 0));

		txtCAObsRef0 = new JTextField();
		txtCAObsRef0.setColumns(10);
		pnlOR0.add(txtCAObsRef0);

		txtCAObsRef1 = new JTextField();
		txtCAObsRef1.setColumns(10);
		pnlOR0.add(txtCAObsRef1);

		JPanel pnlOR1 = new JPanel();
		pnlOR1.setBounds(267, 68, 143, 20);
		pnlCompArquitect.add(pnlOR1);
		pnlOR1.setLayout(new GridLayout(1, 0, 0, 0));

		txtCAObsRef2 = new JTextField();
		txtCAObsRef2.setColumns(10);
		pnlOR1.add(txtCAObsRef2);

		JPanel pnlOR2 = new JPanel();
		pnlOR2.setBounds(267, 113, 143, 20);
		pnlCompArquitect.add(pnlOR2);
		pnlOR2.setLayout(new GridLayout(1, 0, 0, 0));

		txtCAObsRef3 = new JTextField();
		txtCAObsRef3.setColumns(10);
		pnlOR2.add(txtCAObsRef3);

		JPanel pnlOR3 = new JPanel();
		pnlOR3.setBounds(267, 148, 143, 20);
		pnlCompArquitect.add(pnlOR3);
		pnlOR3.setLayout(new GridLayout(1, 0, 0, 0));

		txtCAObsRef4 = new JTextField();
		txtCAObsRef4.setColumns(10);
		pnlOR3.add(txtCAObsRef4);

		JPanel pnlFachadaFrontal = new JPanel();
		pnlFachadaFrontal.setLayout(null);
		pnlFachadaFrontal.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlFachadaFrontal.setBounds(434, 10, 417, 101);
		pnlPestaña1.add(pnlFachadaFrontal);

		JLabel lblAEKitAlumbradoExterior = new JLabel("FACHADA FRONTAL");
		lblAEKitAlumbradoExterior.setFont(new Font("Arial", Font.BOLD, 11));
		lblAEKitAlumbradoExterior.setBounds(3, 1, 176, 14);
		pnlFachadaFrontal.add(lblAEKitAlumbradoExterior);

		JLabel lblAECantidad = new JLabel("Cantidad");
		lblAECantidad.setBounds(210, 1, 55, 14);
		pnlFachadaFrontal.add(lblAECantidad);

		JLabel lblAEObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblAEObsRef.setBounds(267, 1, 143, 14);
		pnlFachadaFrontal.add(lblAEObsRef);

		JPanel pnlAEEtiquetas = new JPanel();
		pnlAEEtiquetas.setBounds(3, 17, 199, 80);
		pnlFachadaFrontal.add(pnlAEEtiquetas);
		pnlAEEtiquetas.setLayout(new GridLayout(4, 0, 0, 0));

		JLabel lblDadosCimentacionAXA = new JLabel("Dados de cimentaci\u00F3n de postes AXAcm");
		lblDadosCimentacionAXA.setFont(new Font("Arial", Font.PLAIN, 10));
		lblDadosCimentacionAXA.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlAEEtiquetas.add(lblDadosCimentacionAXA);

		JLabel lblLuminariasLed = new JLabel("Luminarias LED 120 W - 12000 lum");
		lblLuminariasLed.setFont(new Font("Arial", Font.PLAIN, 10));
		lblLuminariasLed.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlAEEtiquetas.add(lblLuminariasLed);

		JLabel lblPostesSimples = new JLabel("Postes de 6 mts simples");
		lblPostesSimples.setFont(new Font("Arial", Font.PLAIN, 10));
		lblPostesSimples.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlAEEtiquetas.add(lblPostesSimples);

		JLabel lblAEKitCableadoElectrico = new JLabel("Kit cableado el\u00E9ctrico AE");
		lblAEKitCableadoElectrico.setFont(new Font("Arial", Font.PLAIN, 10));
		lblAEKitCableadoElectrico.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlAEEtiquetas.add(lblAEKitCableadoElectrico);

		JPanel pnlAECantidad = new JPanel();
		pnlAECantidad.setBounds(210, 17, 55, 80);
		pnlFachadaFrontal.add(pnlAECantidad);
		pnlAECantidad.setLayout(new GridLayout(4, 2, 0, 0));

		txtFFCantidad00 = new JTextField();
		txtFFCantidad00.setEditable(false);
		txtFFCantidad00.setText("5");
		txtFFCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtFFCantidad00.setColumns(10);
		pnlAECantidad.add(txtFFCantidad00);
		Validaciones.validarDigitos(txtFFCantidad00);

		txtFFCantidad01 = new JTextField();
		txtFFCantidad01.setColumns(10);
		pnlAECantidad.add(txtFFCantidad01);
		Validaciones.validarDigitos(txtFFCantidad01);

		txtFFCantidad10 = new JTextField();
		txtFFCantidad10.setEditable(false);
		txtFFCantidad10.setText("1");
		txtFFCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtFFCantidad10.setColumns(10);
		pnlAECantidad.add(txtFFCantidad10);
		Validaciones.validarDigitos(txtFFCantidad10);

		txtFFCantidad11 = new JTextField();
		txtFFCantidad11.setColumns(10);
		pnlAECantidad.add(txtFFCantidad11);
		Validaciones.validarDigitos(txtFFCantidad11);

		txtFFCantidad20 = new JTextField();
		txtFFCantidad20.setEditable(false);
		txtFFCantidad20.setText("1");
		txtFFCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtFFCantidad20.setColumns(10);
		pnlAECantidad.add(txtFFCantidad20);
		Validaciones.validarDigitos(txtFFCantidad20);

		txtFFCantidad21 = new JTextField();
		txtFFCantidad21.setColumns(10);
		pnlAECantidad.add(txtFFCantidad21);
		Validaciones.validarDigitos(txtFFCantidad21);

		txtFFCantidad30 = new JTextField();
		txtFFCantidad30.setEditable(false);
		txtFFCantidad30.setText("3");
		txtFFCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtFFCantidad30.setColumns(10);
		pnlAECantidad.add(txtFFCantidad30);
		Validaciones.validarDigitos(txtFFCantidad30);

		txtFFCantidad31 = new JTextField();
		txtFFCantidad31.setColumns(10);
		pnlAECantidad.add(txtFFCantidad31);
		Validaciones.validarDigitos(txtFFCantidad31);

		JPanel pnlAEObsRef = new JPanel();
		pnlAEObsRef.setBounds(267, 17, 143, 80);
		pnlFachadaFrontal.add(pnlAEObsRef);
		pnlAEObsRef.setLayout(new GridLayout(4, 0, 0, 0));

		txtFFObsRef0 = new JTextField();
		txtFFObsRef0.setColumns(10);
		pnlAEObsRef.add(txtFFObsRef0);

		txtFFObsRef1 = new JTextField();
		txtFFObsRef1.setColumns(10);
		pnlAEObsRef.add(txtFFObsRef1);

		txtFFObsRef2 = new JTextField();
		txtFFObsRef2.setColumns(10);
		pnlAEObsRef.add(txtFFObsRef2);

		txtFFObsRef3 = new JTextField();
		txtFFObsRef3.setColumns(10);
		pnlAEObsRef.add(txtFFObsRef3);

		JPanel pnlFachadaPosterior = new JPanel();
		pnlFachadaPosterior.setLayout(null);
		pnlFachadaPosterior.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlFachadaPosterior.setBounds(434, 150, 417, 80);
		pnlPestaña1.add(pnlFachadaPosterior);

		JLabel lblFachadaPosterior = new JLabel("FACHADA POSTERIOR");
		lblFachadaPosterior.setFont(new Font("Arial", Font.BOLD, 11));
		lblFachadaPosterior.setBounds(3, 1, 176, 14);
		pnlFachadaPosterior.add(lblFachadaPosterior);

		JLabel label_5 = new JLabel("Cantidad");
		label_5.setBounds(210, 1, 55, 14);
		pnlFachadaPosterior.add(label_5);

		JLabel label_8 = new JLabel("Observaci\u00F3n/Referencia");
		label_8.setBounds(267, 1, 143, 14);
		pnlFachadaPosterior.add(label_8);

		JPanel pnlEtiquetasFP = new JPanel();
		pnlEtiquetasFP.setBounds(3, 17, 199, 60);
		pnlFachadaPosterior.add(pnlEtiquetasFP);
		pnlEtiquetasFP.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_1 = new JLabel("Kit de cableado el\u00E9ctrico BA");
		label_1.setFont(new Font("Arial", Font.PLAIN, 10));
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlEtiquetasFP.add(label_1);

		JLabel label_2 = new JLabel("Tuber\u00EDa PVC 2\u00B4para cableado l=6m");
		label_2.setFont(new Font("Arial", Font.PLAIN, 10));
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlEtiquetasFP.add(label_2);

		JLabel label_3 = new JLabel("Cajas de Conexi\u00F3n  0,60x0,60 mt");
		label_3.setFont(new Font("Arial", Font.PLAIN, 10));
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlEtiquetasFP.add(label_3);

		JPanel pnlCantidadFP = new JPanel();
		pnlCantidadFP.setBounds(210, 17, 55, 60);
		pnlFachadaPosterior.add(pnlCantidadFP);
		pnlCantidadFP.setLayout(new GridLayout(3, 2, 0, 0));

		txtFPCantidad00 = new JTextField();
		txtFPCantidad00.setEditable(false);
		txtFPCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtFPCantidad00.setText("3");

		txtFPCantidad00.setColumns(10);
		pnlCantidadFP.add(txtFPCantidad00);
		Validaciones.validarDigitos(txtFPCantidad00);

		txtFPCantidad01 = new JTextField();
		txtFPCantidad01.setColumns(10);
		pnlCantidadFP.add(txtFPCantidad01);
		Validaciones.validarDigitos(txtFPCantidad01);

		txtFPCantidad10 = new JTextField();
		txtFPCantidad10.setEditable(false);
		txtFPCantidad10.setText("6");
		txtFPCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtFPCantidad10.setColumns(10);
		pnlCantidadFP.add(txtFPCantidad10);
		Validaciones.validarDigitos(txtFPCantidad10);

		txtFPCantidad11 = new JTextField();
		txtFPCantidad11.setColumns(10);
		pnlCantidadFP.add(txtFPCantidad11);
		Validaciones.validarDigitos(txtFPCantidad11);

		txtFPCantidad20 = new JTextField();
		txtFPCantidad20.setEditable(false);
		txtFPCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtFPCantidad20.setText("6");
		txtFPCantidad20.setColumns(10);
		pnlCantidadFP.add(txtFPCantidad20);
		Validaciones.validarDigitos(txtFPCantidad01);

		txtFPCantidad21 = new JTextField();
		txtFPCantidad21.setColumns(10);
		pnlCantidadFP.add(txtFPCantidad21);
		Validaciones.validarDigitos(txtFPCantidad21);

		JPanel pnlObsRefFP = new JPanel();
		pnlObsRefFP.setBounds(267, 17, 143, 60);
		pnlFachadaPosterior.add(pnlObsRefFP);
		pnlObsRefFP.setLayout(new GridLayout(3, 0, 0, 0));

		txtFPObsRef0 = new JTextField();
		txtFPObsRef0.setColumns(10);
		pnlObsRefFP.add(txtFPObsRef0);

		txtFPObsRef1 = new JTextField();
		txtFPObsRef1.setColumns(10);
		pnlObsRefFP.add(txtFPObsRef1);

		txtFPObsRef2 = new JTextField();
		txtFPObsRef2.setColumns(10);
		pnlObsRefFP.add(txtFPObsRef2);

		JPanel pnlFachadaLateral = new JPanel();
		pnlFachadaLateral.setLayout(null);
		pnlFachadaLateral.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlFachadaLateral.setBounds(434, 265, 417, 61);
		pnlPestaña1.add(pnlFachadaLateral);

		JLabel lblFachadaLateral_1 = new JLabel("FACHADA LATERAL");
		lblFachadaLateral_1.setFont(new Font("Arial", Font.BOLD, 11));
		lblFachadaLateral_1.setBounds(3, 1, 176, 14);
		pnlFachadaLateral.add(lblFachadaLateral_1);

		JLabel label_12 = new JLabel("Cantidad");
		label_12.setBounds(210, 1, 55, 14);
		pnlFachadaLateral.add(label_12);

		JLabel label_15 = new JLabel("Observaci\u00F3n/Referencia");
		label_15.setBounds(267, 1, 143, 14);
		pnlFachadaLateral.add(label_15);

		JPanel pnlEtiquetasFL = new JPanel();
		pnlEtiquetasFL.setBounds(3, 17, 199, 40);
		pnlFachadaLateral.add(pnlEtiquetasFL);
		pnlEtiquetasFL.setLayout(new GridLayout(2, 0, 0, 0));

		JLabel label = new JLabel("Paneles vynil piso (0,15x1,93 m)  ");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlEtiquetasFL.add(label);

		JLabel label_4 = new JLabel("Paneles EPS para cubierta I=7, a= 1 m  ");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlEtiquetasFL.add(label_4);

		JPanel pnlCantidadFL = new JPanel();
		pnlCantidadFL.setBounds(210, 17, 55, 40);
		pnlFachadaLateral.add(pnlCantidadFL);
		pnlCantidadFL.setLayout(new GridLayout(2, 2, 0, 0));

		txtFLCantidad00 = new JTextField();
		txtFLCantidad00.setEditable(false);
		txtFLCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtFLCantidad00.setText("6");
		txtFLCantidad00.setColumns(10);
		pnlCantidadFL.add(txtFLCantidad00);
		Validaciones.validarDigitos(txtFLCantidad00);

		txtFLCantidad01 = new JTextField();
		txtFLCantidad01.setColumns(10);
		pnlCantidadFL.add(txtFLCantidad01);
		Validaciones.validarDigitos(txtFLCantidad01);

		txtFLCantidad10 = new JTextField();
		txtFLCantidad10.setEditable(false);
		txtFLCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtFLCantidad10.setText("6");
		txtFLCantidad10.setColumns(10);
		pnlCantidadFL.add(txtFLCantidad10);
		Validaciones.validarDigitos(txtFLCantidad10);

		txtFLCantidad11 = new JTextField();
		txtFLCantidad11.setColumns(10);
		pnlCantidadFL.add(txtFLCantidad11);
		Validaciones.validarDigitos(txtFLCantidad11);

		JPanel pnlObsRefFL = new JPanel();
		pnlObsRefFL.setBounds(267, 17, 143, 40);
		pnlFachadaLateral.add(pnlObsRefFL);
		pnlObsRefFL.setLayout(new GridLayout(2, 0, 0, 0));

		txtFLObsRef0 = new JTextField();
		txtFLObsRef0.setColumns(10);
		pnlObsRefFL.add(txtFLObsRef0);

		txtFLObsRef1 = new JTextField();
		txtFLObsRef1.setColumns(10);
		pnlObsRefFL.add(txtFLObsRef1);

		JPanel pnlInterior = new JPanel();
		pnlInterior.setLayout(null);
		pnlInterior.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlInterior.setBounds(434, 370, 417, 61);
		pnlPestaña1.add(pnlInterior);

		JLabel lblInterior = new JLabel("INTERIOR");
		lblInterior.setFont(new Font("Arial", Font.BOLD, 11));
		lblInterior.setBounds(3, 1, 176, 14);
		pnlInterior.add(lblInterior);

		JLabel label_17 = new JLabel("Cantidad");
		label_17.setBounds(210, 1, 55, 14);
		pnlInterior.add(label_17);

		JLabel label_18 = new JLabel("Observaci\u00F3n/Referencia");
		label_18.setBounds(267, 1, 143, 14);
		pnlInterior.add(label_18);

		JPanel pnlEtiquetasI = new JPanel();
		pnlEtiquetasI.setBounds(3, 17, 199, 40);
		pnlInterior.add(pnlEtiquetasI);
		pnlEtiquetasI.setLayout(new GridLayout(2, 0, 0, 0));

		JLabel label_10 = new JLabel("Paneles vynil piso (0,15x1,93 m)  ");
		label_10.setHorizontalAlignment(SwingConstants.RIGHT);
		label_10.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlEtiquetasI.add(label_10);

		JLabel label_11 = new JLabel("Paneles EPS para cubierta I=7, a= 1 m  ");
		label_11.setHorizontalAlignment(SwingConstants.RIGHT);
		label_11.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlEtiquetasI.add(label_11);

		JPanel pnlCantidadI = new JPanel();
		pnlCantidadI.setBounds(210, 17, 55, 40);
		pnlInterior.add(pnlCantidadI);
		pnlCantidadI.setLayout(new GridLayout(2, 2, 0, 0));

		txtICantidad00 = new JTextField();
		txtICantidad00.setEditable(false);
		txtICantidad00.setText("1");
		txtICantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtICantidad00.setColumns(10);
		pnlCantidadI.add(txtICantidad00);
		Validaciones.validarDigitos(txtICantidad00);

		txtICantidad01 = new JTextField();
		txtICantidad01.setColumns(10);
		pnlCantidadI.add(txtICantidad01);
		Validaciones.validarDigitos(txtICantidad01);

		txtICantidad10 = new JTextField();
		txtICantidad10.setEditable(false);
		txtICantidad10.setText("177");
		txtICantidad10.setColumns(10);
		pnlCantidadI.add(txtICantidad10);
		Validaciones.validarDigitos(txtICantidad10);

		txtICantidad11 = new JTextField();
		txtICantidad11.setColumns(10);
		pnlCantidadI.add(txtICantidad11);
		Validaciones.validarDigitos(txtICantidad11);

		JPanel pnlObsRefI = new JPanel();
		pnlObsRefI.setBounds(267, 17, 143, 40);
		pnlInterior.add(pnlObsRefI);
		pnlObsRefI.setLayout(new GridLayout(2, 0, 0, 0));

		txtIObsRef0 = new JTextField();
		txtIObsRef0.setColumns(10);
		pnlObsRefI.add(txtIObsRef0);

		txtIObsRef1 = new JTextField();
		txtIObsRef1.setColumns(10);
		pnlObsRefI.add(txtIObsRef1);

		JPanel pnlCubierta = new JPanel();
		pnlCubierta.setLayout(null);
		pnlCubierta.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlCubierta.setBounds(434, 470, 417, 49);
		pnlPestaña1.add(pnlCubierta);

		JLabel lblFachadaLateral = new JLabel("CUBIERTA");
		lblFachadaLateral.setFont(new Font("Arial", Font.BOLD, 11));
		lblFachadaLateral.setBounds(3, 1, 176, 14);
		pnlCubierta.add(lblFachadaLateral);

		JLabel label_13 = new JLabel("Cantidad");
		label_13.setBounds(210, 1, 55, 14);
		pnlCubierta.add(label_13);

		JLabel label_14 = new JLabel("Observaci\u00F3n/Referencia");
		label_14.setBounds(267, 1, 143, 14);
		pnlCubierta.add(label_14);

		JPanel pnlEtiquetasC = new JPanel();
		pnlEtiquetasC.setBounds(3, 17, 199, 20);
		pnlCubierta.add(pnlEtiquetasC);
		pnlEtiquetasC.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel label_9 = new JLabel("Kit de cableado el\u00E9ctrico BA");
		label_9.setFont(new Font("Arial", Font.PLAIN, 10));
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlEtiquetasC.add(label_9);

		JPanel pnlCantidadC = new JPanel();
		pnlCantidadC.setBounds(210, 17, 55, 20);
		pnlCubierta.add(pnlCantidadC);
		pnlCantidadC.setLayout(new GridLayout(1, 2, 0, 0));

		txtCCantidad00 = new JTextField();
		txtCCantidad00.setEditable(false);
		txtCCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCCantidad00.setText("9");
		txtCCantidad00.setColumns(10);
		pnlCantidadC.add(txtCCantidad00);
		Validaciones.validarDigitos(txtCCantidad00);

		txtCCantidad01 = new JTextField();
		txtCCantidad01.setColumns(10);
		pnlCantidadC.add(txtCCantidad01);
		Validaciones.validarDigitos(txtCCantidad01);

		JPanel pnlObsRefC = new JPanel();
		pnlObsRefC.setBounds(267, 17, 143, 20);
		pnlCubierta.add(pnlObsRefC);
		pnlObsRefC.setLayout(new GridLayout(1, 0, 0, 0));

		txtCObsRef0 = new JTextField();
		txtCObsRef0.setColumns(10);
		pnlObsRefC.add(txtCObsRef0);

		JPanel pnlComponenteEst = new JPanel();
		pnlComponenteEst.setLayout(null);
		pnlComponenteEst.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlComponenteEst.setBounds(862, 11, 410, 291);
		pnlPestaña1.add(pnlComponenteEst);

		JLabel lblTKitTransformador = new JLabel("COMPONENTE ESTRUCTURAL");
		lblTKitTransformador.setFont(new Font("Arial", Font.BOLD, 11));
		lblTKitTransformador.setBounds(3, 1, 176, 14);
		pnlComponenteEst.add(lblTKitTransformador);

		JLabel lblTCantidad = new JLabel("Cantidad");
		lblTCantidad.setBounds(210, 1, 55, 14);
		pnlComponenteEst.add(lblTCantidad);

		JLabel lblTObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblTObsRef.setBounds(267, 1, 143, 14);
		pnlComponenteEst.add(lblTObsRef);

		JPanel pnlTEtiquetas = new JPanel();
		pnlTEtiquetas.setBounds(3, 20, 199, 260);
		pnlComponenteEst.add(pnlTEtiquetas);
		pnlTEtiquetas.setLayout(new GridLayout(13, 0, 0, 0));

		JLabel lblTKitCableadoTR = new JLabel("Dados cimentaci\u00F3n  ");
		lblTKitCableadoTR.setFont(new Font("Arial", Font.PLAIN, 10));
		lblTKitCableadoTR.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEtiquetas.add(lblTKitCableadoTR);

		JLabel lbl_pst1 = new JLabel("Perfil SF Tipo 1  ");
		lbl_pst1.setFont(new Font("Arial", Font.PLAIN, 10));
		lbl_pst1.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEtiquetas.add(lbl_pst1);

		JLabel lbl_pst2 = new JLabel("Perfil SF Tipo 2  ");
		lbl_pst2.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pst2.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlTEtiquetas.add(lbl_pst2);

		JLabel lbl_pst3 = new JLabel("Perfil SF Tipo 3  ");
		lbl_pst3.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pst3.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlTEtiquetas.add(lbl_pst3);

		JLabel lbl_pst4 = new JLabel("Perfil SF Tipo 4  ");
		lbl_pst4.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pst4.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlTEtiquetas.add(lbl_pst4);

		JLabel lbl_pst5 = new JLabel("Perfil SF Tipo 5  ");
		lbl_pst5.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pst5.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlTEtiquetas.add(lbl_pst5);

		JLabel lbl_pst6 = new JLabel("Perfil SF Tipo 6  ");
		lbl_pst6.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pst6.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlTEtiquetas.add(lbl_pst6);

		JLabel lbl_pst7 = new JLabel("Perfil SF Tipo 7  ");
		lbl_pst7.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pst7.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlTEtiquetas.add(lbl_pst7);

		JLabel lbl_pst8 = new JLabel("Perfil SF Tipo 8  ");
		lbl_pst8.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pst8.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlTEtiquetas.add(lbl_pst8);

		JLabel lbl_pst9 = new JLabel("Perfil SF Tipo 9  ");
		lbl_pst9.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pst9.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlTEtiquetas.add(lbl_pst9);

		JLabel lbl_pst10 = new JLabel("Perfil SF Tipo 10  ");
		lbl_pst10.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pst10.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlTEtiquetas.add(lbl_pst10);

		JLabel lbl_pst11 = new JLabel("Perfil SF Tipo 11  ");
		lbl_pst11.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pst11.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlTEtiquetas.add(lbl_pst11);

		JLabel lbl_pst12 = new JLabel("Perfil SF Tipo 12  ");
		lbl_pst12.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pst12.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlTEtiquetas.add(lbl_pst12);

		JPanel pnlTCantidad = new JPanel();
		pnlTCantidad.setBounds(207, 20, 31, 260);
		pnlComponenteEst.add(pnlTCantidad);
		pnlTCantidad.setLayout(new GridLayout(13, 2, 0, 0));

		txtCECantidad00 = new JTextField();
		txtCECantidad00.setEditable(false);
		txtCECantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad00.setText("15");
		txtCECantidad00.setColumns(10);
		pnlTCantidad.add(txtCECantidad00);
		Validaciones.validarDigitos(txtCECantidad00);

		txtCECantidad10 = new JTextField();
		txtCECantidad10.setEditable(false);
		txtCECantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad10.setText("2");
		txtCECantidad10.setColumns(10);
		pnlTCantidad.add(txtCECantidad10);
		Validaciones.validarDigitos(txtCECantidad10);

		txtCECantidad20 = new JTextField();
		txtCECantidad20.setEditable(false);
		txtCECantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad20.setText("2");
		txtCECantidad20.setColumns(10);
		pnlTCantidad.add(txtCECantidad20);
		Validaciones.validarDigitos(txtCECantidad20);

		txtCECantidad30 = new JTextField();
		txtCECantidad30.setEditable(false);
		txtCECantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad30.setText("20");
		txtCECantidad30.setColumns(10);
		pnlTCantidad.add(txtCECantidad30);
		Validaciones.validarDigitos(txtCECantidad30);

		txtCECantidad40 = new JTextField();
		txtCECantidad40.setEditable(false);
		txtCECantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad40.setText("6");
		txtCECantidad40.setColumns(10);
		pnlTCantidad.add(txtCECantidad40);
		Validaciones.validarDigitos(txtCECantidad40);

		txtCECantidad50 = new JTextField();
		txtCECantidad50.setEditable(false);
		txtCECantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad50.setText("40");
		txtCECantidad50.setColumns(10);
		pnlTCantidad.add(txtCECantidad50);
		Validaciones.validarDigitos(txtCECantidad50);

		txtCECantidad60 = new JTextField();
		txtCECantidad60.setEditable(false);
		txtCECantidad60.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad60.setText("40");
		txtCECantidad60.setColumns(10);
		pnlTCantidad.add(txtCECantidad60);
		Validaciones.validarDigitos(txtCECantidad60);

		txtCECantidad70 = new JTextField();
		txtCECantidad70.setEditable(false);
		txtCECantidad70.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad70.setText("2");
		txtCECantidad70.setColumns(10);
		pnlTCantidad.add(txtCECantidad70);
		Validaciones.validarDigitos(txtCECantidad70);

		txtCECantidad80 = new JTextField();
		txtCECantidad80.setEditable(false);
		txtCECantidad80.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad80.setText("2");
		txtCECantidad80.setColumns(10);
		pnlTCantidad.add(txtCECantidad80);
		Validaciones.validarDigitos(txtCECantidad80);

		txtCECantidad90 = new JTextField();
		txtCECantidad90.setEditable(false);
		txtCECantidad90.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad90.setText("20");
		txtCECantidad90.setColumns(10);
		pnlTCantidad.add(txtCECantidad90);
		Validaciones.validarDigitos(txtCECantidad90);

		txtCECantidad100 = new JTextField();
		txtCECantidad100.setEditable(false);
		txtCECantidad100.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad100.setText("6");
		txtCECantidad100.setColumns(10);
		pnlTCantidad.add(txtCECantidad100);
		Validaciones.validarDigitos(txtCECantidad100);

		txtCECantidad110 = new JTextField();
		txtCECantidad110.setEditable(false);
		txtCECantidad110.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad110.setText("40");
		txtCECantidad110.setColumns(10);
		pnlTCantidad.add(txtCECantidad110);
		Validaciones.validarDigitos(txtCECantidad110);

		txtCECantidad120 = new JTextField();
		txtCECantidad120.setEditable(false);
		txtCECantidad120.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad120.setText("32");
		txtCECantidad120.setColumns(10);
		pnlTCantidad.add(txtCECantidad120);
		Validaciones.validarDigitos(txtCECantidad120);

		JPanel pnlTObsRef = new JPanel();
		pnlTObsRef.setBounds(270, 20, 136, 260);
		pnlComponenteEst.add(pnlTObsRef);
		pnlTObsRef.setLayout(new GridLayout(13, 0, 0, 0));

		txtCEObsRef0 = new JTextField();
		txtCEObsRef0.setColumns(10);
		pnlTObsRef.add(txtCEObsRef0);

		txtCEObsRef1 = new JTextField();
		txtCEObsRef1.setColumns(10);
		pnlTObsRef.add(txtCEObsRef1);

		txtCEObsRef2 = new JTextField();
		txtCEObsRef2.setColumns(10);
		pnlTObsRef.add(txtCEObsRef2);

		txtCEObsRef3 = new JTextField();
		txtCEObsRef3.setColumns(10);
		pnlTObsRef.add(txtCEObsRef3);

		txtCEObsRef4 = new JTextField();
		txtCEObsRef4.setColumns(10);
		pnlTObsRef.add(txtCEObsRef4);

		txtCEObsRef5 = new JTextField();
		txtCEObsRef5.setColumns(10);
		pnlTObsRef.add(txtCEObsRef5);

		txtCEObsRef6 = new JTextField();
		txtCEObsRef6.setColumns(10);
		pnlTObsRef.add(txtCEObsRef6);

		txtCEObsRef7 = new JTextField();
		txtCEObsRef7.setColumns(10);
		pnlTObsRef.add(txtCEObsRef7);

		txtCEObsRef8 = new JTextField();
		txtCEObsRef8.setColumns(10);
		pnlTObsRef.add(txtCEObsRef8);

		txtCEObsRef9 = new JTextField();
		txtCEObsRef9.setColumns(10);
		pnlTObsRef.add(txtCEObsRef9);

		txtCEObsRef10 = new JTextField();
		txtCEObsRef10.setColumns(10);
		pnlTObsRef.add(txtCEObsRef10);

		txtCEObsRef11 = new JTextField();
		txtCEObsRef11.setColumns(10);
		pnlTObsRef.add(txtCEObsRef11);

		txtCEObsRef12 = new JTextField();
		txtCEObsRef12.setColumns(10);
		pnlTObsRef.add(txtCEObsRef12);

		JPanel panel = new JPanel();
		panel.setBounds(236, 20, 31, 260);
		pnlComponenteEst.add(panel);
		panel.setLayout(new GridLayout(13, 2, 0, 0));

		txtCECantidad01 = new JTextField();
		txtCECantidad01.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad01.setColumns(10);
		panel.add(txtCECantidad01);

		txtCECantidad11 = new JTextField();
		txtCECantidad11.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad11.setColumns(10);
		panel.add(txtCECantidad11);

		txtCECantidad21 = new JTextField();
		txtCECantidad21.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad21.setColumns(10);
		panel.add(txtCECantidad21);

		txtCECantidad31 = new JTextField();
		txtCECantidad31.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad31.setColumns(10);
		panel.add(txtCECantidad31);

		txtCECantidad41 = new JTextField();
		txtCECantidad41.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad41.setColumns(10);
		panel.add(txtCECantidad41);

		txtCECantidad51 = new JTextField();
		txtCECantidad51.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad51.setColumns(10);
		panel.add(txtCECantidad51);

		txtCECantidad61 = new JTextField();
		txtCECantidad61.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad61.setColumns(10);
		panel.add(txtCECantidad61);

		txtCECantidad71 = new JTextField();
		txtCECantidad71.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad71.setColumns(10);
		panel.add(txtCECantidad71);

		txtCECantidad81 = new JTextField();
		txtCECantidad81.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad81.setColumns(10);
		panel.add(txtCECantidad81);

		txtCECantidad91 = new JTextField();
		txtCECantidad91.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad91.setColumns(10);
		panel.add(txtCECantidad91);

		txtCECantidad101 = new JTextField();
		txtCECantidad101.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad101.setColumns(10);
		panel.add(txtCECantidad101);

		txtCECantidad111 = new JTextField();
		txtCECantidad111.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad111.setColumns(10);
		panel.add(txtCECantidad111);

		txtCECantidad121 = new JTextField();
		txtCECantidad121.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad121.setColumns(10);
		panel.add(txtCECantidad121);

		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());
		llenarCabecera(cabecera);

		InformacionObligatoriaV infoObligatoria = new InformacionObligatoriaV(860, 312);
		pnlPestaña1.add(infoObligatoria.getPnlInformacionObl());

		cabecera.getBtnRegistrar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TInformacionObligatoria infoObl = cargarInfoObligatoria(infoObligatoria);
				if (validarInfo(infoObl)) {
					ServicioFichaMA srvFichaMA = new ComponenteFichaMA();
					ServicioInfoObligatoria srvInfoObl = new ComponenteInfoObligatoria();
					srvFichaMA.insertarFormulario(cargarListas());
					ServicioCabecera srvTempCabecera = new ComponenteCabecera();
					infoObl.settCabe(srvTempCabecera.buscarProyecto(gettCabecera().getCNombreProyecto()));
					srvInfoObl.crear(infoObl);
				} else {
					JOptionPane.showMessageDialog(null, "Datos obligatorios");
				}
			}
		});

	}

	private LinkedList<LinkedList<TFichaMa>> cargarListas() {

		ServicioFichaMA srvFichaMA = new ComponenteFichaMA();
		ServicioCabecera srvCabecera = new ComponenteCabecera();

		LinkedList<TFichaMa> listaKE = new LinkedList<TFichaMa>();
		settCabecera(new TCabecera(5, "proyecto test"));
		TCabecera cabecera = srvCabecera.buscarProyecto(gettCabecera().getCNombreProyecto());

		nombreAula = "Aula 1";
		TAula aula = srvFichaMA.buscarAula(nombreAula);
		TGrupo grupoTmp = srvFichaMA.buscarGrupo("Kit eléctrico");
		Integer updateFicha = srvFichaMA.buscarUpdateFicha();
		listaKE.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtKECantidad00.getText()),
						Integer.parseInt(txtKECantidad01.getText()), txtKEObsRef0.getText(), updateFicha));
		listaKE.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtKECantidad10.getText()),
						Integer.parseInt(txtKECantidad11.getText()), txtKEObsRef1.getText(), updateFicha));
		listaKE.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtKECantidad20.getText()),
						Integer.parseInt(txtKECantidad21.getText()), txtKEObsRef2.getText(), updateFicha));
		listaKE.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtKECantidad30.getText()),
						Integer.parseInt(txtKECantidad31.getText()), txtKEObsRef3.getText(), updateFicha));
		listaKE.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtKECantidad40.getText()),
						Integer.parseInt(txtKECantidad41.getText()), txtKEObsRef4.getText(), updateFicha));

		LinkedList<TFichaMa> listaKAL = new LinkedList<TFichaMa>();
		grupoTmp = srvFichaMA.buscarGrupo("Kit agua lluvia");
		listaKAL.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtKALCantidad00.getText()),
						Integer.parseInt(txtKALCantidad01.getText()), txtKALObsRef0.getText(), updateFicha));
		listaKAL.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtKALCantidad10.getText()),
						Integer.parseInt(txtKALCantidad11.getText()), txtKALObsRef1.getText(), updateFicha));
		listaKAL.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtKALCantidad20.getText()),
						Integer.parseInt(txtKALCantidad21.getText()), txtKALObsRef2.getText(), updateFicha));
		listaKAL.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtKALCantidad30.getText()),
						Integer.parseInt(txtKALCantidad31.getText()), txtKALObsRef3.getText(), updateFicha));
		listaKAL.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtKALCantidad40.getText()),
						Integer.parseInt(txtKALCantidad41.getText()), txtKALObsRef4.getText(), updateFicha));

		LinkedList<TFichaMa> listaCA = new LinkedList<TFichaMa>();
		grupoTmp = srvFichaMA.buscarGrupo("Componente arquitectónico");
		listaCA.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtCACantidad00.getText()),
						Integer.parseInt(txtCACantidad01.getText()), txtCAObsRef0.getText(), updateFicha));
		listaCA.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtCACantidad10.getText()),
						Integer.parseInt(txtCACantidad11.getText()), txtCAObsRef1.getText(), updateFicha));
		listaCA.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtCACantidad20.getText()),
						Integer.parseInt(txtCACantidad21.getText()), txtCAObsRef2.getText(), updateFicha));
		listaCA.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtCACantidad30.getText()),
						Integer.parseInt(txtCACantidad31.getText()), txtCAObsRef3.getText(), updateFicha));
		listaCA.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtCACantidad40.getText()),
						Integer.parseInt(txtCACantidad41.getText()), txtCAObsRef4.getText(), updateFicha));

		LinkedList<TFichaMa> listaFF = new LinkedList<TFichaMa>();
		grupoTmp = srvFichaMA.buscarGrupo("Fachada frontal");
		listaFF.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtFFCantidad00.getText()),
						Integer.parseInt(txtFFCantidad01.getText()), txtFFObsRef0.getText(), updateFicha));
		listaFF.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtFFCantidad10.getText()),
						Integer.parseInt(txtFFCantidad11.getText()), txtFFObsRef1.getText(), updateFicha));
		listaFF.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtFFCantidad20.getText()),
						Integer.parseInt(txtFFCantidad21.getText()), txtFFObsRef2.getText(), updateFicha));
		listaFF.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtFFCantidad30.getText()),
						Integer.parseInt(txtFFCantidad31.getText()), txtFFObsRef3.getText(), updateFicha));

		LinkedList<TFichaMa> listaFP = new LinkedList<TFichaMa>();
		grupoTmp = srvFichaMA.buscarGrupo("Fachada posterior");
		listaFP.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtFPCantidad00.getText()),
						Integer.parseInt(txtFPCantidad01.getText()), txtFPObsRef0.getText(), updateFicha));
		listaFP.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtFPCantidad10.getText()),
						Integer.parseInt(txtFPCantidad11.getText()), txtFPObsRef1.getText(), updateFicha));
		listaFP.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtFPCantidad20.getText()),
						Integer.parseInt(txtFPCantidad21.getText()), txtFPObsRef2.getText(), updateFicha));

		LinkedList<TFichaMa> listaFL = new LinkedList<TFichaMa>();
		grupoTmp = srvFichaMA.buscarGrupo("Fachada lateral");
		listaFL.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtFLCantidad00.getText()),
						Integer.parseInt(txtFLCantidad01.getText()), txtFLObsRef0.getText(), updateFicha));
		listaFL.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtFLCantidad10.getText()),
						Integer.parseInt(txtFLCantidad11.getText()), txtFLObsRef1.getText(), updateFicha));

		LinkedList<TFichaMa> listaI = new LinkedList<TFichaMa>();
		grupoTmp = srvFichaMA.buscarGrupo("Interior");
		listaI.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtICantidad00.getText()),
						Integer.parseInt(txtICantidad01.getText()), txtIObsRef0.getText(), updateFicha));
		listaI.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtICantidad10.getText()),
						Integer.parseInt(txtICantidad11.getText()), txtIObsRef1.getText(), updateFicha));

		LinkedList<TFichaMa> listaC = new LinkedList<TFichaMa>();
		grupoTmp = srvFichaMA.buscarGrupo("Cubierta");
		listaC.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtCCantidad00.getText()),
						Integer.parseInt(txtCCantidad01.getText()), txtCObsRef0.getText(), updateFicha));

		LinkedList<TFichaMa> listaCE = new LinkedList<TFichaMa>();
		grupoTmp = srvFichaMA.buscarGrupo("Componente estructural");
		listaCE.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtCECantidad00.getText()),
						Integer.parseInt(txtCECantidad01.getText()), txtCEObsRef0.getText(), updateFicha));
		listaCE.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtCECantidad10.getText()),
						Integer.parseInt(txtCECantidad11.getText()), txtCEObsRef1.getText(), updateFicha));
		listaCE.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtCECantidad20.getText()),
						Integer.parseInt(txtCECantidad21.getText()), txtCEObsRef2.getText(), updateFicha));
		listaCE.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtCECantidad30.getText()),
						Integer.parseInt(txtCECantidad31.getText()), txtCEObsRef3.getText(), updateFicha));
		listaCE.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtCECantidad40.getText()),
						Integer.parseInt(txtCECantidad41.getText()), txtCEObsRef4.getText(), updateFicha));
		listaCE.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtCECantidad50.getText()),
						Integer.parseInt(txtCECantidad51.getText()), txtCEObsRef5.getText(), updateFicha));
		listaCE.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtCECantidad60.getText()),
						Integer.parseInt(txtCECantidad61.getText()), txtCEObsRef6.getText(), updateFicha));
		listaCE.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtCECantidad70.getText()),
						Integer.parseInt(txtCECantidad71.getText()), txtCEObsRef7.getText(), updateFicha));
		listaCE.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtCECantidad80.getText()),
						Integer.parseInt(txtCECantidad81.getText()), txtCEObsRef8.getText(), updateFicha));
		listaCE.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtCECantidad90.getText()),
						Integer.parseInt(txtCECantidad91.getText()), txtCEObsRef9.getText(), updateFicha));
		listaCE.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtCECantidad100.getText()),
						Integer.parseInt(txtCECantidad101.getText()), txtCEObsRef10.getText(), updateFicha));
		listaCE.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtCECantidad110.getText()),
						Integer.parseInt(txtCECantidad111.getText()), txtCEObsRef11.getText(), updateFicha));
		listaCE.add(
				new TFichaMa(aula, cabecera, grupoTmp, null/* etiqueta */, Integer.parseInt(txtCECantidad120.getText()),
						Integer.parseInt(txtCECantidad121.getText()), txtCEObsRef12.getText(), updateFicha));

		LinkedList<LinkedList<TFichaMa>> listaFormulario = new LinkedList<LinkedList<TFichaMa>>();
		listaFormulario.add(listaKE);
		listaFormulario.add(listaKAL);
		listaFormulario.add(listaCA);
		listaFormulario.add(listaFF);
		listaFormulario.add(listaFP);
		listaFormulario.add(listaFL);
		listaFormulario.add(listaI);
		listaFormulario.add(listaC);
		listaFormulario.add(listaCE);

		return listaFormulario;
	}
}
