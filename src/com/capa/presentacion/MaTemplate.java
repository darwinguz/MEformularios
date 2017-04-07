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
import com.capa.negocios.ComponenteFichaMA;
import com.capa.negocios.ServicioFichaMA;
import com.capa.util.Utilitarios;
import com.capa.util.Validaciones;

public class MaTemplate extends JFrame {

	private static final long serialVersionUID = 8480152059626754031L;

	protected JPanel contentPane;

	protected JTextField txtTECantidad01;
	protected JTextField txtTECantidad11;
	protected JTextField txtTECantidad21;
	protected JTextField txtTECantidad31;
	protected JTextField txtTEObsRef1;
	protected JTextField txtTEObsRef0;
	protected JTextField txtTEObsRef2;
	protected JTextField txtTEObsRef3;
	protected JTextField txtEDCantidad01;
	protected JTextField txtEDObsRef0;
	protected JTextField txtAECantidad00;
	protected JTextField txtAECantidad01;
	protected JTextField txtAECantidad10;
	protected JTextField txtAECantidad11;
	protected JTextField txtAECantidad20;
	protected JTextField txtAECantidad21;
	protected JTextField txtAECantidad30;
	protected JTextField txtAECantidad31;
	protected JTextField txtAEObsRef0;
	protected JTextField txtAEObsRef1;
	protected JTextField txtAEObsRef2;
	protected JTextField txtAEObsRef3;
	protected JTextField txtTCantidad00;
	protected JTextField txtTCantidad01;
	protected JTextField txtTCantidad10;
	protected JTextField txtTCantidad11;
	protected JTextField txtTCantidad20;
	protected JTextField txtTCantidad21;
	protected JTextField txtTCantidad30;
	protected JTextField txtTCantidad31;
	protected JTextField txtTCantidad40;
	protected JTextField txtTCantidad41;
	protected JTextField txtTObsRef0;
	protected JTextField txtTObsRef1;
	protected JTextField txtTObsRef2;
	protected JTextField txtTObsRef3;
	protected JTextField txtTObsRef4;
	protected JTextField txtCant00;
	protected JTextField txtCant01;
	protected JTextField txtCant10;
	protected JTextField txtCant11;
	protected JTextField txtOR0;
	protected JTextField txtOR1;
	protected JTextField txtCanFP00;
	protected JTextField txtCanFP01;
	protected JTextField txtCanFP10;
	protected JTextField txtCanFP11;
	protected JTextField txtCanFP20;
	protected JTextField txtCanFP21;
	protected JTextField textField_24;
	protected JTextField textField_25;
	protected JTextField textField_26;
	protected JTextField txtCanC01;
	protected JTextField textField_33;
	protected JTextField textField_28;
	protected JTextField textField_29;
	protected JTextField textField_30;
	protected JTextField textField_31;
	protected JTextField textField_32;
	protected JTextField textField_34;
	protected JTextField textField_35;
	protected JTextField textField_36;
	protected JTextField textField_37;
	protected JTextField txtCanC00;
	protected JTextField txtTECantidad40;
	protected JTextField txtTECantidad41;
	protected JTextField txtTEObsRef4;
	protected JTextField txtCanFL00;
	protected JTextField txtCanFL01;
	protected JTextField txtCanFL10;
	protected JTextField txtCanFL11;
	protected JTextField textField_45;
	protected JTextField textField_46;
	protected JTextField txtCantI00;
	protected JTextField txtCantI01;
	protected JTextField txtCantI10;
	protected JTextField txtCantI11;
	protected JTextField txtObsRefI0;
	protected JTextField txtObsRefI1;
	protected JTextField textField_51;
	protected JTextField textField_52;
	protected JTextField txtEDCantidad50;
	protected JTextField txtEDCantidad51;
	protected JTextField txtEDObsRef5;
	protected JTextField txtEDCantidad10;
	protected JTextField txtEDCantidad11;
	protected JTextField txtEDObsRef1;
	protected JTextField txtEDCantidad30;
	protected JTextField txtEDCantidad31;
	protected JTextField txtEDCantidad40;
	protected JTextField txtEDCantidad41;
	protected JTextField txtEDObsRef2;
	protected JTextField txtEDObsRef4;
	protected JTextField txtCant20;
	protected JTextField txtCant21;
	protected JTextField txtCant30;
	protected JTextField txtCant31;
	protected JTextField txtCant40;
	protected JTextField txtCant41;
	protected JTextField txtOR2;
	protected JTextField txtOR3;
	protected JTextField txtOR4;
	protected JTextField txtTECantidad00;
	protected JTextField txtTECantidad10;
	protected JTextField txtTECantidad20;
	protected JTextField txtTECantidad30;
	protected JTextField txtEDCantidad00;
	protected String nombreAula;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1320, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setTitle(nombreAula);

		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());

		cabecera.getBtnRegistrar().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cargarListas();
			}
		});

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 125, 1284, 560);
		contentPane.add(tabbedPane);

		JPanel pnlPestaña1 = new JPanel();
		tabbedPane.addTab("MA-" + nombreAula, null, pnlPestaña1, null);
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

		txtTECantidad00 = new JTextField();
		txtTECantidad00.setEditable(false);
		txtTECantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtTECantidad00.setText("9");
		pnlTECantidad.add(txtTECantidad00);
		txtTECantidad00.setColumns(10);
		Validaciones.validarDigitos(txtTECantidad00);

		txtTECantidad01 = new JTextField();
		txtTECantidad01.setColumns(10);
		pnlTECantidad.add(txtTECantidad01);
		Validaciones.validarDigitos(txtTECantidad01);

		txtTECantidad10 = new JTextField();
		txtTECantidad10.setEditable(false);
		txtTECantidad10.setText("2");
		txtTECantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtTECantidad10.setColumns(10);
		pnlTECantidad.add(txtTECantidad10);
		Validaciones.validarDigitos(txtTECantidad10);

		txtTECantidad11 = new JTextField();
		txtTECantidad11.setColumns(10);
		pnlTECantidad.add(txtTECantidad11);
		Validaciones.validarDigitos(txtTECantidad11);

		txtTECantidad20 = new JTextField();
		txtTECantidad20.setEditable(false);
		txtTECantidad20.setText("1");
		txtTECantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtTECantidad20.setColumns(10);
		pnlTECantidad.add(txtTECantidad20);
		Validaciones.validarDigitos(txtTECantidad20);

		txtTECantidad21 = new JTextField();
		txtTECantidad21.setColumns(10);
		pnlTECantidad.add(txtTECantidad21);
		Validaciones.validarDigitos(txtTECantidad21);

		txtTECantidad30 = new JTextField();
		txtTECantidad30.setEditable(false);
		txtTECantidad30.setText("1");
		txtTECantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtTECantidad30.setColumns(10);
		pnlTECantidad.add(txtTECantidad30);
		Validaciones.validarDigitos(txtTECantidad30);

		txtTECantidad31 = new JTextField();
		txtTECantidad31.setColumns(10);
		pnlTECantidad.add(txtTECantidad31);
		Validaciones.validarDigitos(txtTECantidad01);

		txtTECantidad40 = new JTextField();
		txtTECantidad40.setEditable(false);
		txtTECantidad40.setText("1");
		txtTECantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtTECantidad40.setColumns(10);
		pnlTECantidad.add(txtTECantidad40);
		Validaciones.validarDigitos(txtTECantidad40);

		txtTECantidad41 = new JTextField();
		txtTECantidad41.setColumns(10);
		pnlTECantidad.add(txtTECantidad41);
		Validaciones.validarDigitos(txtTECantidad41);

		JPanel pnlTEObsRef = new JPanel();
		pnlTEObsRef.setBounds(267, 17, 143, 100);
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

		txtTEObsRef4 = new JTextField();
		txtTEObsRef4.setColumns(10);
		pnlTEObsRef.add(txtTEObsRef4);

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

		txtEDCantidad00 = new JTextField();
		txtEDCantidad00.setEditable(false);
		txtEDCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtEDCantidad00.setText("3");
		txtEDCantidad00.setColumns(10);
		pnlEDCantidad1.add(txtEDCantidad00);
		Validaciones.validarDigitos(txtEDCantidad00);

		txtEDCantidad01 = new JTextField();
		txtEDCantidad01.setColumns(10);
		pnlEDCantidad1.add(txtEDCantidad01);
		Validaciones.validarDigitos(txtEDCantidad01);

		JPanel pnlEDObsRef1 = new JPanel();
		pnlEDObsRef1.setBounds(267, 17, 143, 20);
		pnlKitAguaLluvia.add(pnlEDObsRef1);
		pnlEDObsRef1.setLayout(new GridLayout(1, 0, 0, 0));

		txtEDObsRef0 = new JTextField();
		txtEDObsRef0.setColumns(10);
		pnlEDObsRef1.add(txtEDObsRef0);

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

		txtEDCantidad10 = new JTextField();
		txtEDCantidad10.setEditable(false);
		txtEDCantidad10.setText("2");
		txtEDCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtEDCantidad10.setColumns(10);
		pnlEDCantidad2.add(txtEDCantidad10);
		Validaciones.validarDigitos(txtEDCantidad10);

		txtEDCantidad11 = new JTextField();
		txtEDCantidad11.setColumns(10);
		pnlEDCantidad2.add(txtEDCantidad11);
		Validaciones.validarDigitos(txtEDCantidad11);

		JPanel pnlEDObsRef2 = new JPanel();
		pnlEDObsRef2.setBounds(267, 50, 143, 20);
		pnlKitAguaLluvia.add(pnlEDObsRef2);
		pnlEDObsRef2.setLayout(new GridLayout(1, 0, 0, 0));

		txtEDObsRef1 = new JTextField();
		txtEDObsRef1.setColumns(10);
		pnlEDObsRef2.add(txtEDObsRef1);

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

		txtEDCantidad30 = new JTextField();
		txtEDCantidad30.setEditable(false);
		txtEDCantidad30.setText("2");
		txtEDCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtEDCantidad30.setColumns(10);
		pnlEDCantidad3.add(txtEDCantidad30);
		Validaciones.validarDigitos(txtEDCantidad30);

		txtEDCantidad31 = new JTextField();
		txtEDCantidad31.setColumns(10);
		pnlEDCantidad3.add(txtEDCantidad31);
		Validaciones.validarDigitos(txtEDCantidad31);

		txtEDCantidad40 = new JTextField();
		txtEDCantidad40.setEditable(false);
		txtEDCantidad40.setText("1");
		txtEDCantidad40.setColumns(10);
		txtEDCantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		pnlEDCantidad3.add(txtEDCantidad40);
		Validaciones.validarDigitos(txtEDCantidad40);

		txtEDCantidad41 = new JTextField();
		txtEDCantidad41.setColumns(10);
		pnlEDCantidad3.add(txtEDCantidad41);
		Validaciones.validarDigitos(txtEDCantidad41);

		JPanel pnlEDObsRef3 = new JPanel();
		pnlEDObsRef3.setBounds(267, 86, 143, 40);
		pnlKitAguaLluvia.add(pnlEDObsRef3);
		pnlEDObsRef3.setLayout(new GridLayout(2, 0, 0, 0));

		txtEDObsRef2 = new JTextField();
		txtEDObsRef2.setColumns(10);
		pnlEDObsRef3.add(txtEDObsRef2);

		txtEDObsRef4 = new JTextField();
		txtEDObsRef4.setColumns(10);
		pnlEDObsRef3.add(txtEDObsRef4);

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

		txtEDCantidad50 = new JTextField();
		txtEDCantidad50.setEditable(false);
		txtEDCantidad50.setText("1");
		txtEDCantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtEDCantidad50.setColumns(10);
		pnlEDCantidad4.add(txtEDCantidad50);
		Validaciones.validarDigitos(txtEDCantidad50);

		txtEDCantidad51 = new JTextField();
		txtEDCantidad51.setColumns(10);
		pnlEDCantidad4.add(txtEDCantidad51);
		Validaciones.validarDigitos(txtEDCantidad51);

		JPanel pnlEDObsRef4 = new JPanel();
		pnlEDObsRef4.setBounds(267, 137, 143, 20);
		pnlKitAguaLluvia.add(pnlEDObsRef4);
		pnlEDObsRef4.setLayout(new GridLayout(1, 0, 0, 0));

		txtEDObsRef5 = new JTextField();
		txtEDObsRef5.setColumns(10);
		pnlEDObsRef4.add(txtEDObsRef5);

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

		txtCant00 = new JTextField();
		txtCant00.setEditable(false);
		txtCant00.setText("1");
		txtCant00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCant00.setColumns(10);
		pnlCantidad0.add(txtCant00);
		Validaciones.validarDigitos(txtCant00);

		txtCant01 = new JTextField();
		txtCant01.setColumns(10);
		pnlCantidad0.add(txtCant01);
		Validaciones.validarDigitos(txtCant01);

		txtCant10 = new JTextField();
		txtCant10.setEditable(false);
		txtCant10.setText("3");
		txtCant10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCant10.setColumns(10);
		pnlCantidad0.add(txtCant10);
		Validaciones.validarDigitos(txtCant10);

		txtCant11 = new JTextField();
		txtCant11.setColumns(10);
		pnlCantidad0.add(txtCant11);
		Validaciones.validarDigitos(txtCant11);

		JPanel pnlCantidad1 = new JPanel();
		pnlCantidad1.setBounds(210, 68, 55, 20);
		pnlCompArquitect.add(pnlCantidad1);
		pnlCantidad1.setLayout(new GridLayout(1, 2, 0, 0));

		txtCant20 = new JTextField();
		txtCant20.setEditable(false);
		txtCant20.setText("11");
		txtCant20.setHorizontalAlignment(SwingConstants.CENTER);
		txtCant20.setColumns(10);
		pnlCantidad1.add(txtCant20);
		Validaciones.validarDigitos(txtCant20);

		txtCant21 = new JTextField();
		txtCant21.setColumns(10);
		pnlCantidad1.add(txtCant21);
		Validaciones.validarDigitos(txtCant21);

		JPanel pnlCantidad2 = new JPanel();
		pnlCantidad2.setBounds(210, 113, 55, 20);
		pnlCompArquitect.add(pnlCantidad2);
		pnlCantidad2.setLayout(new GridLayout(1, 2, 0, 0));

		txtCant30 = new JTextField();
		txtCant30.setEditable(false);
		txtCant30.setText("3");
		txtCant30.setHorizontalAlignment(SwingConstants.CENTER);
		txtCant30.setColumns(10);
		pnlCantidad2.add(txtCant30);
		Validaciones.validarDigitos(txtCant30);

		txtCant31 = new JTextField();
		txtCant31.setColumns(10);
		pnlCantidad2.add(txtCant31);
		Validaciones.validarDigitos(txtCant31);

		JPanel pnlCantidad3 = new JPanel();
		pnlCantidad3.setBounds(210, 148, 55, 20);
		pnlCompArquitect.add(pnlCantidad3);
		pnlCantidad3.setLayout(new GridLayout(1, 2, 0, 0));

		txtCant40 = new JTextField();
		txtCant40.setEditable(false);
		txtCant40.setHorizontalAlignment(SwingConstants.CENTER);
		txtCant40.setText("3");
		txtCant40.setColumns(10);
		pnlCantidad3.add(txtCant40);
		Validaciones.validarDigitos(txtCant40);

		txtCant41 = new JTextField();
		txtCant41.setColumns(10);
		pnlCantidad3.add(txtCant41);
		Validaciones.validarDigitos(txtCant41);

		JPanel pnlOR0 = new JPanel();
		pnlOR0.setBounds(267, 17, 143, 40);
		pnlCompArquitect.add(pnlOR0);
		pnlOR0.setLayout(new GridLayout(2, 0, 0, 0));

		txtOR0 = new JTextField();
		txtOR0.setColumns(10);
		pnlOR0.add(txtOR0);

		txtOR1 = new JTextField();
		txtOR1.setColumns(10);
		pnlOR0.add(txtOR1);

		JPanel pnlOR1 = new JPanel();
		pnlOR1.setBounds(267, 68, 143, 20);
		pnlCompArquitect.add(pnlOR1);
		pnlOR1.setLayout(new GridLayout(1, 0, 0, 0));

		txtOR2 = new JTextField();
		txtOR2.setColumns(10);
		pnlOR1.add(txtOR2);

		JPanel pnlOR2 = new JPanel();
		pnlOR2.setBounds(267, 113, 143, 20);
		pnlCompArquitect.add(pnlOR2);
		pnlOR2.setLayout(new GridLayout(1, 0, 0, 0));

		txtOR3 = new JTextField();
		txtOR3.setColumns(10);
		pnlOR2.add(txtOR3);

		JPanel pnlOR3 = new JPanel();
		pnlOR3.setBounds(267, 148, 143, 20);
		pnlCompArquitect.add(pnlOR3);
		pnlOR3.setLayout(new GridLayout(1, 0, 0, 0));

		txtOR4 = new JTextField();
		txtOR4.setColumns(10);
		pnlOR3.add(txtOR4);

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

		txtAECantidad00 = new JTextField();
		txtAECantidad00.setEditable(false);
		txtAECantidad00.setText("5");
		txtAECantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtAECantidad00.setColumns(10);
		pnlAECantidad.add(txtAECantidad00);
		Validaciones.validarDigitos(txtAECantidad00);

		txtAECantidad01 = new JTextField();
		txtAECantidad01.setColumns(10);
		pnlAECantidad.add(txtAECantidad01);
		Validaciones.validarDigitos(txtAECantidad01);

		txtAECantidad10 = new JTextField();
		txtAECantidad10.setEditable(false);
		txtAECantidad10.setText("1");
		txtAECantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtAECantidad10.setColumns(10);
		pnlAECantidad.add(txtAECantidad10);
		Validaciones.validarDigitos(txtAECantidad10);

		txtAECantidad11 = new JTextField();
		txtAECantidad11.setColumns(10);
		pnlAECantidad.add(txtAECantidad11);
		Validaciones.validarDigitos(txtAECantidad11);

		txtAECantidad20 = new JTextField();
		txtAECantidad20.setEditable(false);
		txtAECantidad20.setText("1");
		txtAECantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtAECantidad20.setColumns(10);
		pnlAECantidad.add(txtAECantidad20);
		Validaciones.validarDigitos(txtAECantidad20);

		txtAECantidad21 = new JTextField();
		txtAECantidad21.setColumns(10);
		pnlAECantidad.add(txtAECantidad21);
		Validaciones.validarDigitos(txtAECantidad21);

		txtAECantidad30 = new JTextField();
		txtAECantidad30.setEditable(false);
		txtAECantidad30.setText("3");
		txtAECantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtAECantidad30.setColumns(10);
		pnlAECantidad.add(txtAECantidad30);
		Validaciones.validarDigitos(txtAECantidad30);

		txtAECantidad31 = new JTextField();
		txtAECantidad31.setColumns(10);
		pnlAECantidad.add(txtAECantidad31);
		Validaciones.validarDigitos(txtAECantidad31);

		JPanel pnlAEObsRef = new JPanel();
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

		txtCanFP00 = new JTextField();
		txtCanFP00.setEditable(false);
		txtCanFP00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCanFP00.setText("3");

		txtCanFP00.setColumns(10);
		pnlCantidadFP.add(txtCanFP00);
		Validaciones.validarDigitos(txtCanFP00);

		txtCanFP01 = new JTextField();
		txtCanFP01.setColumns(10);
		pnlCantidadFP.add(txtCanFP01);
		Validaciones.validarDigitos(txtCanFP01);

		txtCanFP10 = new JTextField();
		txtCanFP10.setEditable(false);
		txtCanFP10.setText("6");
		txtCanFP10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCanFP10.setColumns(10);
		pnlCantidadFP.add(txtCanFP10);
		Validaciones.validarDigitos(txtCanFP10);

		txtCanFP11 = new JTextField();
		txtCanFP11.setColumns(10);
		pnlCantidadFP.add(txtCanFP11);
		Validaciones.validarDigitos(txtCanFP11);

		txtCanFP20 = new JTextField();
		txtCanFP20.setEditable(false);
		txtCanFP20.setHorizontalAlignment(SwingConstants.CENTER);
		txtCanFP20.setText("6");
		txtCanFP20.setColumns(10);
		pnlCantidadFP.add(txtCanFP20);
		Validaciones.validarDigitos(txtCanFP01);

		txtCanFP21 = new JTextField();
		txtCanFP21.setColumns(10);
		pnlCantidadFP.add(txtCanFP21);
		Validaciones.validarDigitos(txtCanFP21);

		JPanel pnlObsRefFP = new JPanel();
		pnlObsRefFP.setBounds(267, 17, 143, 60);
		pnlFachadaPosterior.add(pnlObsRefFP);
		pnlObsRefFP.setLayout(new GridLayout(3, 0, 0, 0));

		textField_24 = new JTextField();
		textField_24.setColumns(10);
		pnlObsRefFP.add(textField_24);

		textField_25 = new JTextField();
		textField_25.setColumns(10);
		pnlObsRefFP.add(textField_25);

		textField_26 = new JTextField();
		textField_26.setColumns(10);
		pnlObsRefFP.add(textField_26);

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

		txtCanFL00 = new JTextField();
		txtCanFL00.setEditable(false);
		txtCanFL00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCanFL00.setText("6");
		txtCanFL00.setColumns(10);
		pnlCantidadFL.add(txtCanFL00);
		Validaciones.validarDigitos(txtCanFL00);

		txtCanFL01 = new JTextField();
		txtCanFL01.setColumns(10);
		pnlCantidadFL.add(txtCanFL01);
		Validaciones.validarDigitos(txtCanFL01);

		txtCanFL10 = new JTextField();
		txtCanFL10.setEditable(false);
		txtCanFL10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCanFL10.setText("6");
		txtCanFL10.setColumns(10);
		pnlCantidadFL.add(txtCanFL10);
		Validaciones.validarDigitos(txtCanFL10);

		txtCanFL11 = new JTextField();
		txtCanFL11.setColumns(10);
		pnlCantidadFL.add(txtCanFL11);
		Validaciones.validarDigitos(txtCanFL11);

		JPanel pnlObsRefFL = new JPanel();
		pnlObsRefFL.setBounds(267, 17, 143, 40);
		pnlFachadaLateral.add(pnlObsRefFL);
		pnlObsRefFL.setLayout(new GridLayout(2, 0, 0, 0));

		textField_45 = new JTextField();
		textField_45.setColumns(10);
		pnlObsRefFL.add(textField_45);

		textField_46 = new JTextField();
		textField_46.setColumns(10);
		pnlObsRefFL.add(textField_46);

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

		txtCantI00 = new JTextField();
		txtCantI00.setEditable(false);
		txtCantI00.setText("1");
		txtCantI00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantI00.setColumns(10);
		pnlCantidadI.add(txtCantI00);
		Validaciones.validarDigitos(txtCantI00);

		txtCantI01 = new JTextField();
		txtCantI01.setColumns(10);
		pnlCantidadI.add(txtCantI01);
		Validaciones.validarDigitos(txtCantI01);

		txtCantI10 = new JTextField();
		txtCantI10.setEditable(false);
		txtCantI10.setText("177");
		txtCantI10.setColumns(10);
		pnlCantidadI.add(txtCantI10);
		Validaciones.validarDigitos(txtCantI10);

		txtCantI11 = new JTextField();
		txtCantI11.setColumns(10);
		pnlCantidadI.add(txtCantI11);
		Validaciones.validarDigitos(txtCantI11);

		JPanel pnlObsRefI = new JPanel();
		pnlObsRefI.setBounds(267, 17, 143, 40);
		pnlInterior.add(pnlObsRefI);
		pnlObsRefI.setLayout(new GridLayout(2, 0, 0, 0));

		txtObsRefI0 = new JTextField();
		txtObsRefI0.setColumns(10);
		pnlObsRefI.add(txtObsRefI0);

		txtObsRefI1 = new JTextField();
		txtObsRefI1.setColumns(10);
		pnlObsRefI.add(txtObsRefI1);

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

		txtCanC00 = new JTextField();
		txtCanC00.setEditable(false);
		txtCanC00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCanC00.setText("9");
		txtCanC00.setColumns(10);
		pnlCantidadC.add(txtCanC00);
		Validaciones.validarDigitos(txtCanC00);

		txtCanC01 = new JTextField();
		txtCanC01.setColumns(10);
		pnlCantidadC.add(txtCanC01);
		Validaciones.validarDigitos(txtCanC01);

		JPanel pnlObsRefC = new JPanel();
		pnlObsRefC.setBounds(267, 17, 143, 20);
		pnlCubierta.add(pnlObsRefC);
		pnlObsRefC.setLayout(new GridLayout(1, 0, 0, 0));

		textField_33 = new JTextField();
		textField_33.setColumns(10);
		pnlObsRefC.add(textField_33);

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
		pnlTCantidad.setBounds(210, 20, 55, 260);
		pnlComponenteEst.add(pnlTCantidad);
		pnlTCantidad.setLayout(new GridLayout(13, 2, 0, 0));

		txtTCantidad00 = new JTextField();
		txtTCantidad00.setEditable(false);
		txtTCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtTCantidad00.setText("15");
		txtTCantidad00.setColumns(10);
		pnlTCantidad.add(txtTCantidad00);
		Validaciones.validarDigitos(txtTCantidad00);

		txtTCantidad01 = new JTextField();
		txtTCantidad01.setEditable(false);
		txtTCantidad01.setHorizontalAlignment(SwingConstants.CENTER);
		txtTCantidad01.setText("2");
		txtTCantidad01.setColumns(10);
		pnlTCantidad.add(txtTCantidad01);
		Validaciones.validarDigitos(txtTCantidad01);

		txtTCantidad10 = new JTextField();
		txtTCantidad10.setEditable(false);
		txtTCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtTCantidad10.setText("2");
		txtTCantidad10.setColumns(10);
		pnlTCantidad.add(txtTCantidad10);
		Validaciones.validarDigitos(txtTCantidad10);

		txtTCantidad11 = new JTextField();
		txtTCantidad11.setEditable(false);
		txtTCantidad11.setHorizontalAlignment(SwingConstants.CENTER);
		txtTCantidad11.setText("20");
		txtTCantidad11.setColumns(10);
		pnlTCantidad.add(txtTCantidad11);
		Validaciones.validarDigitos(txtTCantidad11);

		txtTCantidad20 = new JTextField();
		txtTCantidad20.setEditable(false);
		txtTCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtTCantidad20.setText("6");
		txtTCantidad20.setColumns(10);
		pnlTCantidad.add(txtTCantidad20);
		Validaciones.validarDigitos(txtTCantidad20);

		txtTCantidad21 = new JTextField();
		txtTCantidad21.setEditable(false);
		txtTCantidad21.setHorizontalAlignment(SwingConstants.CENTER);
		txtTCantidad21.setText("40");
		txtTCantidad21.setColumns(10);
		pnlTCantidad.add(txtTCantidad21);
		Validaciones.validarDigitos(txtTCantidad21);

		txtTCantidad30 = new JTextField();
		txtTCantidad30.setEditable(false);
		txtTCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtTCantidad30.setText("40");
		txtTCantidad30.setColumns(10);
		pnlTCantidad.add(txtTCantidad30);
		Validaciones.validarDigitos(txtTCantidad30);

		txtTCantidad31 = new JTextField();
		txtTCantidad31.setEditable(false);
		txtTCantidad31.setHorizontalAlignment(SwingConstants.CENTER);
		txtTCantidad31.setText("2");
		txtTCantidad31.setColumns(10);
		pnlTCantidad.add(txtTCantidad31);
		Validaciones.validarDigitos(txtTCantidad31);

		txtTCantidad40 = new JTextField();
		txtTCantidad40.setEditable(false);
		txtTCantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtTCantidad40.setText("2");
		txtTCantidad40.setColumns(10);
		pnlTCantidad.add(txtTCantidad40);
		Validaciones.validarDigitos(txtTCantidad40);

		txtTCantidad41 = new JTextField();
		txtTCantidad41.setEditable(false);
		txtTCantidad41.setHorizontalAlignment(SwingConstants.CENTER);
		txtTCantidad41.setText("20");
		txtTCantidad41.setColumns(10);
		pnlTCantidad.add(txtTCantidad41);
		Validaciones.validarDigitos(txtTCantidad41);

		textField_29 = new JTextField();
		textField_29.setEditable(false);
		textField_29.setHorizontalAlignment(SwingConstants.CENTER);
		textField_29.setText("6");
		textField_29.setColumns(10);
		pnlTCantidad.add(textField_29);
		Validaciones.validarDigitos(textField_29);

		textField_51 = new JTextField();
		textField_51.setEditable(false);
		textField_51.setHorizontalAlignment(SwingConstants.CENTER);
		textField_51.setText("40");
		textField_51.setColumns(10);
		pnlTCantidad.add(textField_51);
		Validaciones.validarDigitos(textField_51);

		textField_28 = new JTextField();
		textField_28.setEditable(false);
		textField_28.setHorizontalAlignment(SwingConstants.CENTER);
		textField_28.setText("32");
		textField_28.setColumns(10);
		pnlTCantidad.add(textField_28);
		Validaciones.validarDigitos(textField_28);

		JPanel pnlTObsRef = new JPanel();
		pnlTObsRef.setBounds(267, 20, 136, 260);
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

		textField_52 = new JTextField();
		textField_52.setColumns(10);
		pnlTObsRef.add(textField_52);

		textField_37 = new JTextField();
		textField_37.setColumns(10);
		pnlTObsRef.add(textField_37);

		InformacionObligatoriaV infoObligatoria = new InformacionObligatoriaV(860, 312);
		pnlPestaña1.add(infoObligatoria.getPnlInformacionObl());
	}

	private void cargarListas() {

		LinkedList<TFichaMa> listaKE = new LinkedList<TFichaMa>();
		TCabecera cabecera = Utilitarios.gettCabecera();

		ServicioFichaMA servicioFichaMA = new ComponenteFichaMA();

		listaKE.add(new TFichaMa(servicioFichaMA.buscarAula(nombreAula), Utilitarios.gettCabecera(), servicioFichaMA.buscarGrupo("Kit eléctrico"),
				fmaEtiqueta, fmaCantidadLimite, fmaCantidadEjecutada, fmaActualizacionN, FDetalleMa, FCantidadLimite,
				FCantidadIngresada, FObservacionReferencia));
	}
}
