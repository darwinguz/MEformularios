package com.capa.presentacion;

import static com.capa.util.Utilitarios.cargarInfoObligatoria;
import static com.capa.util.Utilitarios.gettCabecera;
import static com.capa.util.Utilitarios.llenarCabecera;
import static com.capa.util.Validaciones.validarInfo;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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

import com.capa.datos.TCabecera;
import com.capa.datos.TFicha;
import com.capa.datos.TGrupo;
import com.capa.datos.TInformacionObligatoria;
import com.capa.datos.TdetalleFicha;
import com.capa.negocios.ComponenteFicha;
import com.capa.negocios.ComponenteInfoObligatoria;
import com.capa.negocios.ServicioFicha;
import com.capa.negocios.ServicioInfoObligatoria;
import com.capa.util.Validaciones;

public class MaTemplate extends JFrame {

	private static final long serialVersionUID = 8480152059626754031L;

	protected JPanel contentPane;

	protected JTextField txtCantidad01;
	protected JTextField txtCantidad11;
	protected JTextField txtCantidad21;
	protected JTextField txtCantidad31;
	protected JTextField txtObs1;
	protected JTextField txtObs0;
	protected JTextField txtObs2;
	protected JTextField txtObs3;
	protected JTextField txtCantidad51;
	protected JTextField txtObs5;
	protected JTextField txtCantidad150;
	protected JTextField txtCantidad151;
	protected JTextField txtCantidad160;
	protected JTextField txtCantidad161;
	protected JTextField txtCantidad170;
	protected JTextField txtCantidad171;
	protected JTextField txtCantidad180;
	protected JTextField txtCantidad181;
	protected JTextField txtObs15;
	protected JTextField txtObs16;
	protected JTextField txtObs17;
	protected JTextField txtObs18;
	protected JTextField txtCantidad270;
	protected JTextField txtCantidad280;
	protected JTextField txtCantidad290;
	protected JTextField txtCantidad300;
	protected JTextField txtCantidad310;
	protected JTextField txtCantidad320;
	protected JTextField txtCantidad330;
	protected JTextField txtCantidad340;
	protected JTextField txtCantidad350;
	protected JTextField txtCantidad360;
	protected JTextField txtObs27;
	protected JTextField txtObs28;
	protected JTextField txtObs29;
	protected JTextField txtObs30;
	protected JTextField txtObs35;
	protected JTextField txtCantidad100;
	protected JTextField txtCantidad101;
	protected JTextField txtCantidad110;
	protected JTextField txtCantidad111;
	protected JTextField txtObs10;
	protected JTextField txtObs11;
	protected JTextField txtCantidad190;
	protected JTextField txtCantidad191;
	protected JTextField txtCantidad200;
	protected JTextField txtCantidad201;
	protected JTextField txtCantidad210;
	protected JTextField txtCantidad211;
	protected JTextField txtObs19;
	protected JTextField txtObs20;
	protected JTextField txtObs21;
	protected JTextField txtCantidad261;
	protected JTextField txtObs26;
	protected JTextField txtCantidad390;
	protected JTextField txtCantidad370;
	protected JTextField txtObs31;
	protected JTextField txtObs32;
	protected JTextField txtObs33;
	protected JTextField txtObs34;
	protected JTextField txtObs36;
	protected JTextField txtObs37;
	protected JTextField txtObs39;
	protected JTextField txtCantidad260;
	protected JTextField txtCantidad40;
	protected JTextField txtCantidad41;
	protected JTextField txtObs4;
	protected JTextField txtCantidad220;
	protected JTextField txtCantidad221;
	protected JTextField txtCantidad230;
	protected JTextField txtCantidad231;
	protected JTextField txtObs22;
	protected JTextField txtObs23;
	protected JTextField txtCantidad240;
	protected JTextField txtCantidad241;
	protected JTextField txtCantidad250;
	protected JTextField txtCantidad251;
	protected JTextField txtObs24;
	protected JTextField txtObs25;
	protected JTextField txtCantidad380;
	protected JTextField txtObs38;
	protected JTextField txtCantidad90;
	protected JTextField txtCantidad91;
	protected JTextField txtObs9;
	protected JTextField txtCantidad60;
	protected JTextField txtCantidad61;
	protected JTextField txtObs6;
	protected JTextField txtCantidad70;
	protected JTextField txtCantidad71;
	protected JTextField txtCantidad80;
	protected JTextField txtCantidad81;
	protected JTextField txtObs7;
	protected JTextField txtObs8;
	protected JTextField txtCantidad120;
	protected JTextField txtCantidad121;
	protected JTextField txtCantidad130;
	protected JTextField txtCantidad131;
	protected JTextField txtCantidad140;
	protected JTextField txtCantidad141;
	protected JTextField txtObs12;
	protected JTextField txtObs13;
	protected JTextField txtObs14;
	protected JTextField txtCantidad00;
	protected JTextField txtCantidad10;
	protected JTextField txtCantidad20;
	protected JTextField txtCantidad30;
	protected JTextField txtCantidad50;
	private JTextField txtCantidad271;
	private JTextField txtCantidad281;
	private JTextField txtCantidad291;
	private JTextField txtCantidad301;
	private JTextField txtCantidad311;
	private JTextField txtCantidad321;
	private JTextField txtCantidad331;
	private JTextField txtCantidad341;
	private JTextField txtCantidad351;
	private JTextField txtCantidad361;
	private JTextField txtCantidad371;
	private JTextField txtCantidad381;
	private JTextField txtCantidad391;

	LinkedList<JTextField[]> textFields;
	TFicha ficha;

	public MaTemplate(TFicha ficha) {

		this.ficha = ficha;
		textFields = new LinkedList<JTextField[]>();

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1320, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setTitle(ficha.getFiNombre());
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 125, 1284, 560);
		contentPane.add(tabbedPane);

		JPanel pnlPestaña1 = new JPanel();
		tabbedPane.addTab(ficha.getFiDescripcion(), null, pnlPestaña1, null);
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

		txtCantidad00 = new JTextField();
		txtCantidad00.setEditable(false);
		txtCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad00.setText("9");
		pnlTECantidad.add(txtCantidad00);
		txtCantidad00.setColumns(10);
		Validaciones.validarDigitos(txtCantidad00);

		txtCantidad01 = new JTextField();
		txtCantidad01.setColumns(10);
		pnlTECantidad.add(txtCantidad01);
		Validaciones.validarDigitos(txtCantidad01);

		txtCantidad10 = new JTextField();
		txtCantidad10.setEditable(false);
		txtCantidad10.setText("2");
		txtCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad10.setColumns(10);
		pnlTECantidad.add(txtCantidad10);
		Validaciones.validarDigitos(txtCantidad10);

		txtCantidad11 = new JTextField();
		txtCantidad11.setColumns(10);
		pnlTECantidad.add(txtCantidad11);
		Validaciones.validarDigitos(txtCantidad11);

		txtCantidad20 = new JTextField();
		txtCantidad20.setEditable(false);
		txtCantidad20.setText("1");
		txtCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad20.setColumns(10);
		pnlTECantidad.add(txtCantidad20);
		Validaciones.validarDigitos(txtCantidad20);

		txtCantidad21 = new JTextField();
		txtCantidad21.setColumns(10);
		pnlTECantidad.add(txtCantidad21);
		Validaciones.validarDigitos(txtCantidad21);

		txtCantidad30 = new JTextField();
		txtCantidad30.setEditable(false);
		txtCantidad30.setText("1");
		txtCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad30.setColumns(10);
		pnlTECantidad.add(txtCantidad30);
		Validaciones.validarDigitos(txtCantidad30);

		txtCantidad31 = new JTextField();
		txtCantidad31.setColumns(10);
		pnlTECantidad.add(txtCantidad31);
		Validaciones.validarDigitos(txtCantidad01);

		txtCantidad40 = new JTextField();
		txtCantidad40.setEditable(false);
		txtCantidad40.setText("1");
		txtCantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad40.setColumns(10);
		pnlTECantidad.add(txtCantidad40);
		Validaciones.validarDigitos(txtCantidad40);

		txtCantidad41 = new JTextField();
		txtCantidad41.setColumns(10);
		pnlTECantidad.add(txtCantidad41);
		Validaciones.validarDigitos(txtCantidad41);

		JPanel pnlTEObsRef = new JPanel();
		pnlTEObsRef.setBounds(267, 17, 143, 100);
		pnlKitElectrico.add(pnlTEObsRef);
		pnlTEObsRef.setLayout(new GridLayout(5, 0, 0, 0));

		txtObs0 = new JTextField();
		pnlTEObsRef.add(txtObs0);
		txtObs0.setColumns(10);

		txtObs1 = new JTextField();
		pnlTEObsRef.add(txtObs1);
		txtObs1.setColumns(10);

		txtObs2 = new JTextField();
		txtObs2.setColumns(10);
		pnlTEObsRef.add(txtObs2);

		txtObs3 = new JTextField();
		txtObs3.setColumns(10);
		pnlTEObsRef.add(txtObs3);

		txtObs4 = new JTextField();
		txtObs4.setColumns(10);
		pnlTEObsRef.add(txtObs4);

		textFields.add(new JTextField[] { txtCantidad01, txtObs0 });
		textFields.add(new JTextField[] { txtCantidad11, txtObs1 });
		textFields.add(new JTextField[] { txtCantidad21, txtObs2 });
		textFields.add(new JTextField[] { txtCantidad31, txtObs3 });
		textFields.add(new JTextField[] { txtCantidad41, txtObs4 });

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

		txtCantidad50 = new JTextField();
		txtCantidad50.setEditable(false);
		txtCantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad50.setText("3");
		txtCantidad50.setColumns(10);
		pnlEDCantidad1.add(txtCantidad50);
		Validaciones.validarDigitos(txtCantidad50);

		txtCantidad51 = new JTextField();
		txtCantidad51.setColumns(10);
		pnlEDCantidad1.add(txtCantidad51);
		Validaciones.validarDigitos(txtCantidad51);

		JPanel pnlEDObsRef1 = new JPanel();
		pnlEDObsRef1.setBounds(267, 17, 143, 20);
		pnlKitAguaLluvia.add(pnlEDObsRef1);
		pnlEDObsRef1.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs5 = new JTextField();
		txtObs5.setColumns(10);
		pnlEDObsRef1.add(txtObs5);

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

		txtCantidad60 = new JTextField();
		txtCantidad60.setEditable(false);
		txtCantidad60.setText("2");
		txtCantidad60.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad60.setColumns(10);
		pnlEDCantidad2.add(txtCantidad60);
		Validaciones.validarDigitos(txtCantidad60);

		txtCantidad61 = new JTextField();
		txtCantidad61.setColumns(10);
		pnlEDCantidad2.add(txtCantidad61);
		Validaciones.validarDigitos(txtCantidad61);

		JPanel pnlEDObsRef2 = new JPanel();
		pnlEDObsRef2.setBounds(267, 50, 143, 20);
		pnlKitAguaLluvia.add(pnlEDObsRef2);
		pnlEDObsRef2.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs6 = new JTextField();
		txtObs6.setColumns(10);
		pnlEDObsRef2.add(txtObs6);

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

		txtCantidad70 = new JTextField();
		txtCantidad70.setEditable(false);
		txtCantidad70.setText("2");
		txtCantidad70.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad70.setColumns(10);
		pnlEDCantidad3.add(txtCantidad70);
		Validaciones.validarDigitos(txtCantidad70);

		txtCantidad71 = new JTextField();
		txtCantidad71.setColumns(10);
		pnlEDCantidad3.add(txtCantidad71);
		Validaciones.validarDigitos(txtCantidad71);

		txtCantidad80 = new JTextField();
		txtCantidad80.setEditable(false);
		txtCantidad80.setText("1");
		txtCantidad80.setColumns(10);
		txtCantidad80.setHorizontalAlignment(SwingConstants.CENTER);
		pnlEDCantidad3.add(txtCantidad80);
		Validaciones.validarDigitos(txtCantidad80);

		txtCantidad81 = new JTextField();
		txtCantidad81.setColumns(10);
		pnlEDCantidad3.add(txtCantidad81);
		Validaciones.validarDigitos(txtCantidad81);

		JPanel pnlEDObsRef3 = new JPanel();
		pnlEDObsRef3.setBounds(267, 86, 143, 40);
		pnlKitAguaLluvia.add(pnlEDObsRef3);
		pnlEDObsRef3.setLayout(new GridLayout(2, 0, 0, 0));

		txtObs7 = new JTextField();
		txtObs7.setColumns(10);
		pnlEDObsRef3.add(txtObs7);

		txtObs8 = new JTextField();
		txtObs8.setColumns(10);
		pnlEDObsRef3.add(txtObs8);

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

		txtCantidad90 = new JTextField();
		txtCantidad90.setEditable(false);
		txtCantidad90.setText("1");
		txtCantidad90.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad90.setColumns(10);
		pnlEDCantidad4.add(txtCantidad90);
		Validaciones.validarDigitos(txtCantidad90);

		txtCantidad91 = new JTextField();
		txtCantidad91.setColumns(10);
		pnlEDCantidad4.add(txtCantidad91);
		Validaciones.validarDigitos(txtCantidad91);

		JPanel pnlEDObsRef4 = new JPanel();
		pnlEDObsRef4.setBounds(267, 137, 143, 20);
		pnlKitAguaLluvia.add(pnlEDObsRef4);
		pnlEDObsRef4.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs9 = new JTextField();
		txtObs9.setColumns(10);
		pnlEDObsRef4.add(txtObs9);

		textFields.add(new JTextField[] { txtCantidad51, txtObs5 });
		textFields.add(new JTextField[] { txtCantidad61, txtObs6 });
		textFields.add(new JTextField[] { txtCantidad71, txtObs7 });
		textFields.add(new JTextField[] { txtCantidad81, txtObs8 });
		textFields.add(new JTextField[] { txtCantidad91, txtObs9 });

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

		txtCantidad100 = new JTextField();
		txtCantidad100.setEditable(false);
		txtCantidad100.setText("1");
		txtCantidad100.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad100.setColumns(10);
		pnlCantidad0.add(txtCantidad100);
		Validaciones.validarDigitos(txtCantidad100);

		txtCantidad101 = new JTextField();
		txtCantidad101.setColumns(10);
		pnlCantidad0.add(txtCantidad101);
		Validaciones.validarDigitos(txtCantidad101);

		txtCantidad110 = new JTextField();
		txtCantidad110.setEditable(false);
		txtCantidad110.setText("3");
		txtCantidad110.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad110.setColumns(10);
		pnlCantidad0.add(txtCantidad110);
		Validaciones.validarDigitos(txtCantidad110);

		txtCantidad111 = new JTextField();
		txtCantidad111.setColumns(10);
		pnlCantidad0.add(txtCantidad111);
		Validaciones.validarDigitos(txtCantidad111);

		JPanel pnlCantidad1 = new JPanel();
		pnlCantidad1.setBounds(210, 68, 55, 20);
		pnlCompArquitect.add(pnlCantidad1);
		pnlCantidad1.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad120 = new JTextField();
		txtCantidad120.setEditable(false);
		txtCantidad120.setText("11");
		txtCantidad120.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad120.setColumns(10);
		pnlCantidad1.add(txtCantidad120);
		Validaciones.validarDigitos(txtCantidad120);

		txtCantidad121 = new JTextField();
		txtCantidad121.setColumns(10);
		pnlCantidad1.add(txtCantidad121);
		Validaciones.validarDigitos(txtCantidad121);

		JPanel pnlCantidad2 = new JPanel();
		pnlCantidad2.setBounds(210, 113, 55, 20);
		pnlCompArquitect.add(pnlCantidad2);
		pnlCantidad2.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad130 = new JTextField();
		txtCantidad130.setEditable(false);
		txtCantidad130.setText("3");
		txtCantidad130.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad130.setColumns(10);
		pnlCantidad2.add(txtCantidad130);
		Validaciones.validarDigitos(txtCantidad130);

		txtCantidad131 = new JTextField();
		txtCantidad131.setColumns(10);
		pnlCantidad2.add(txtCantidad131);
		Validaciones.validarDigitos(txtCantidad131);

		JPanel pnlCantidad3 = new JPanel();
		pnlCantidad3.setBounds(210, 148, 55, 20);
		pnlCompArquitect.add(pnlCantidad3);
		pnlCantidad3.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad140 = new JTextField();
		txtCantidad140.setEditable(false);
		txtCantidad140.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad140.setText("3");
		txtCantidad140.setColumns(10);
		pnlCantidad3.add(txtCantidad140);
		Validaciones.validarDigitos(txtCantidad140);

		txtCantidad141 = new JTextField();
		txtCantidad141.setColumns(10);
		pnlCantidad3.add(txtCantidad141);
		Validaciones.validarDigitos(txtCantidad141);

		JPanel pnlOR0 = new JPanel();
		pnlOR0.setBounds(267, 17, 143, 40);
		pnlCompArquitect.add(pnlOR0);
		pnlOR0.setLayout(new GridLayout(2, 0, 0, 0));

		txtObs10 = new JTextField();
		txtObs10.setColumns(10);
		pnlOR0.add(txtObs10);

		txtObs11 = new JTextField();
		txtObs11.setColumns(10);
		pnlOR0.add(txtObs11);

		JPanel pnlOR1 = new JPanel();
		pnlOR1.setBounds(267, 68, 143, 20);
		pnlCompArquitect.add(pnlOR1);
		pnlOR1.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs12 = new JTextField();
		txtObs12.setColumns(10);
		pnlOR1.add(txtObs12);

		JPanel pnlOR2 = new JPanel();
		pnlOR2.setBounds(267, 113, 143, 20);
		pnlCompArquitect.add(pnlOR2);
		pnlOR2.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs13 = new JTextField();
		txtObs13.setColumns(10);
		pnlOR2.add(txtObs13);

		JPanel pnlOR3 = new JPanel();
		pnlOR3.setBounds(267, 148, 143, 20);
		pnlCompArquitect.add(pnlOR3);
		pnlOR3.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs14 = new JTextField();
		txtObs14.setColumns(10);
		pnlOR3.add(txtObs14);

		textFields.add(new JTextField[] { txtCantidad101, txtObs10 });
		textFields.add(new JTextField[] { txtCantidad111, txtObs11 });
		textFields.add(new JTextField[] { txtCantidad121, txtObs12 });
		textFields.add(new JTextField[] { txtCantidad131, txtObs13 });
		textFields.add(new JTextField[] { txtCantidad141, txtObs14 });

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

		txtCantidad150 = new JTextField();
		txtCantidad150.setEditable(false);
		txtCantidad150.setText("5");
		txtCantidad150.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad150.setColumns(10);
		pnlAECantidad.add(txtCantidad150);
		Validaciones.validarDigitos(txtCantidad150);

		txtCantidad151 = new JTextField();
		txtCantidad151.setColumns(10);
		pnlAECantidad.add(txtCantidad151);
		Validaciones.validarDigitos(txtCantidad151);

		txtCantidad160 = new JTextField();
		txtCantidad160.setEditable(false);
		txtCantidad160.setText("1");
		txtCantidad160.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad160.setColumns(10);
		pnlAECantidad.add(txtCantidad160);
		Validaciones.validarDigitos(txtCantidad160);

		txtCantidad161 = new JTextField();
		txtCantidad161.setColumns(10);
		pnlAECantidad.add(txtCantidad161);
		Validaciones.validarDigitos(txtCantidad161);

		txtCantidad170 = new JTextField();
		txtCantidad170.setEditable(false);
		txtCantidad170.setText("1");
		txtCantidad170.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad170.setColumns(10);
		pnlAECantidad.add(txtCantidad170);
		Validaciones.validarDigitos(txtCantidad170);

		txtCantidad171 = new JTextField();
		txtCantidad171.setColumns(10);
		pnlAECantidad.add(txtCantidad171);
		Validaciones.validarDigitos(txtCantidad171);

		txtCantidad180 = new JTextField();
		txtCantidad180.setEditable(false);
		txtCantidad180.setText("3");
		txtCantidad180.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad180.setColumns(10);
		pnlAECantidad.add(txtCantidad180);
		Validaciones.validarDigitos(txtCantidad180);

		txtCantidad181 = new JTextField();
		txtCantidad181.setColumns(10);
		pnlAECantidad.add(txtCantidad181);
		Validaciones.validarDigitos(txtCantidad181);

		JPanel pnlAEObsRef = new JPanel();
		pnlAEObsRef.setBounds(267, 17, 143, 80);
		pnlFachadaFrontal.add(pnlAEObsRef);
		pnlAEObsRef.setLayout(new GridLayout(4, 0, 0, 0));

		txtObs15 = new JTextField();
		txtObs15.setColumns(10);
		pnlAEObsRef.add(txtObs15);

		txtObs16 = new JTextField();
		txtObs16.setColumns(10);
		pnlAEObsRef.add(txtObs16);

		txtObs17 = new JTextField();
		txtObs17.setColumns(10);
		pnlAEObsRef.add(txtObs17);

		txtObs18 = new JTextField();
		txtObs18.setColumns(10);
		pnlAEObsRef.add(txtObs18);

		textFields.add(new JTextField[] { txtCantidad151, txtObs15 });
		textFields.add(new JTextField[] { txtCantidad161, txtObs16 });
		textFields.add(new JTextField[] { txtCantidad171, txtObs17 });
		textFields.add(new JTextField[] { txtCantidad181, txtObs18 });

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

		txtCantidad190 = new JTextField();
		txtCantidad190.setEditable(false);
		txtCantidad190.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad190.setText("3");

		txtCantidad190.setColumns(10);
		pnlCantidadFP.add(txtCantidad190);
		Validaciones.validarDigitos(txtCantidad190);

		txtCantidad191 = new JTextField();
		txtCantidad191.setColumns(10);
		pnlCantidadFP.add(txtCantidad191);
		Validaciones.validarDigitos(txtCantidad191);

		txtCantidad200 = new JTextField();
		txtCantidad200.setEditable(false);
		txtCantidad200.setText("6");
		txtCantidad200.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad200.setColumns(10);
		pnlCantidadFP.add(txtCantidad200);
		Validaciones.validarDigitos(txtCantidad200);

		txtCantidad201 = new JTextField();
		txtCantidad201.setColumns(10);
		pnlCantidadFP.add(txtCantidad201);
		Validaciones.validarDigitos(txtCantidad201);

		txtCantidad210 = new JTextField();
		txtCantidad210.setEditable(false);
		txtCantidad210.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad210.setText("6");
		txtCantidad210.setColumns(10);
		pnlCantidadFP.add(txtCantidad210);
		Validaciones.validarDigitos(txtCantidad191);

		txtCantidad211 = new JTextField();
		txtCantidad211.setColumns(10);
		pnlCantidadFP.add(txtCantidad211);
		Validaciones.validarDigitos(txtCantidad211);

		JPanel pnlObsRefFP = new JPanel();
		pnlObsRefFP.setBounds(267, 17, 143, 60);
		pnlFachadaPosterior.add(pnlObsRefFP);
		pnlObsRefFP.setLayout(new GridLayout(3, 0, 0, 0));

		txtObs19 = new JTextField();
		txtObs19.setColumns(10);
		pnlObsRefFP.add(txtObs19);

		txtObs20 = new JTextField();
		txtObs20.setColumns(10);
		pnlObsRefFP.add(txtObs20);

		txtObs21 = new JTextField();
		txtObs21.setColumns(10);
		pnlObsRefFP.add(txtObs21);

		textFields.add(new JTextField[] { txtCantidad191, txtObs19 });
		textFields.add(new JTextField[] { txtCantidad201, txtObs20 });
		textFields.add(new JTextField[] { txtCantidad211, txtObs21 });

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

		txtCantidad220 = new JTextField();
		txtCantidad220.setEditable(false);
		txtCantidad220.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad220.setText("6");
		txtCantidad220.setColumns(10);
		pnlCantidadFL.add(txtCantidad220);
		Validaciones.validarDigitos(txtCantidad220);

		txtCantidad221 = new JTextField();
		txtCantidad221.setColumns(10);
		pnlCantidadFL.add(txtCantidad221);
		Validaciones.validarDigitos(txtCantidad221);

		txtCantidad230 = new JTextField();
		txtCantidad230.setEditable(false);
		txtCantidad230.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad230.setText("6");
		txtCantidad230.setColumns(10);
		pnlCantidadFL.add(txtCantidad230);
		Validaciones.validarDigitos(txtCantidad230);

		txtCantidad231 = new JTextField();
		txtCantidad231.setColumns(10);
		pnlCantidadFL.add(txtCantidad231);
		Validaciones.validarDigitos(txtCantidad231);

		JPanel pnlObsRefFL = new JPanel();
		pnlObsRefFL.setBounds(267, 17, 143, 40);
		pnlFachadaLateral.add(pnlObsRefFL);
		pnlObsRefFL.setLayout(new GridLayout(2, 0, 0, 0));

		txtObs22 = new JTextField();
		txtObs22.setColumns(10);
		pnlObsRefFL.add(txtObs22);

		txtObs23 = new JTextField();
		txtObs23.setColumns(10);
		pnlObsRefFL.add(txtObs23);

		textFields.add(new JTextField[] { txtCantidad221, txtObs22 });
		textFields.add(new JTextField[] { txtCantidad231, txtObs23 });

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

		txtCantidad240 = new JTextField();
		txtCantidad240.setEditable(false);
		txtCantidad240.setText("1");
		txtCantidad240.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad240.setColumns(10);
		pnlCantidadI.add(txtCantidad240);
		Validaciones.validarDigitos(txtCantidad240);

		txtCantidad241 = new JTextField();
		txtCantidad241.setColumns(10);
		pnlCantidadI.add(txtCantidad241);
		Validaciones.validarDigitos(txtCantidad241);

		txtCantidad250 = new JTextField();
		txtCantidad250.setEditable(false);
		txtCantidad250.setText("177");
		txtCantidad250.setColumns(10);
		pnlCantidadI.add(txtCantidad250);
		Validaciones.validarDigitos(txtCantidad250);

		txtCantidad251 = new JTextField();
		txtCantidad251.setColumns(10);
		pnlCantidadI.add(txtCantidad251);
		Validaciones.validarDigitos(txtCantidad251);

		JPanel pnlObsRefI = new JPanel();
		pnlObsRefI.setBounds(267, 17, 143, 40);
		pnlInterior.add(pnlObsRefI);
		pnlObsRefI.setLayout(new GridLayout(2, 0, 0, 0));

		txtObs24 = new JTextField();
		txtObs24.setColumns(10);
		pnlObsRefI.add(txtObs24);

		txtObs25 = new JTextField();
		txtObs25.setColumns(10);
		pnlObsRefI.add(txtObs25);

		textFields.add(new JTextField[] { txtCantidad241, txtObs24 });
		textFields.add(new JTextField[] { txtCantidad251, txtObs25 });

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

		txtCantidad260 = new JTextField();
		txtCantidad260.setEditable(false);
		txtCantidad260.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad260.setText("9");
		txtCantidad260.setColumns(10);
		pnlCantidadC.add(txtCantidad260);
		Validaciones.validarDigitos(txtCantidad260);

		txtCantidad261 = new JTextField();
		txtCantidad261.setColumns(10);
		pnlCantidadC.add(txtCantidad261);
		Validaciones.validarDigitos(txtCantidad261);

		JPanel pnlObsRefC = new JPanel();
		pnlObsRefC.setBounds(267, 17, 143, 20);
		pnlCubierta.add(pnlObsRefC);
		pnlObsRefC.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs26 = new JTextField();
		txtObs26.setColumns(10);
		pnlObsRefC.add(txtObs26);

		textFields.add(new JTextField[] { txtCantidad261, txtObs26 });

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

		txtCantidad270 = new JTextField();
		txtCantidad270.setEditable(false);
		txtCantidad270.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad270.setText("15");
		txtCantidad270.setColumns(10);
		pnlTCantidad.add(txtCantidad270);
		Validaciones.validarDigitos(txtCantidad270);

		txtCantidad280 = new JTextField();
		txtCantidad280.setEditable(false);
		txtCantidad280.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad280.setText("2");
		txtCantidad280.setColumns(10);
		pnlTCantidad.add(txtCantidad280);
		Validaciones.validarDigitos(txtCantidad280);

		txtCantidad290 = new JTextField();
		txtCantidad290.setEditable(false);
		txtCantidad290.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad290.setText("2");
		txtCantidad290.setColumns(10);
		pnlTCantidad.add(txtCantidad290);
		Validaciones.validarDigitos(txtCantidad290);

		txtCantidad300 = new JTextField();
		txtCantidad300.setEditable(false);
		txtCantidad300.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad300.setText("20");
		txtCantidad300.setColumns(10);
		pnlTCantidad.add(txtCantidad300);
		Validaciones.validarDigitos(txtCantidad300);

		txtCantidad310 = new JTextField();
		txtCantidad310.setEditable(false);
		txtCantidad310.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad310.setText("6");
		txtCantidad310.setColumns(10);
		pnlTCantidad.add(txtCantidad310);
		Validaciones.validarDigitos(txtCantidad310);

		txtCantidad320 = new JTextField();
		txtCantidad320.setEditable(false);
		txtCantidad320.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad320.setText("40");
		txtCantidad320.setColumns(10);
		pnlTCantidad.add(txtCantidad320);
		Validaciones.validarDigitos(txtCantidad320);

		txtCantidad330 = new JTextField();
		txtCantidad330.setEditable(false);
		txtCantidad330.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad330.setText("40");
		txtCantidad330.setColumns(10);
		pnlTCantidad.add(txtCantidad330);
		Validaciones.validarDigitos(txtCantidad330);

		txtCantidad340 = new JTextField();
		txtCantidad340.setEditable(false);
		txtCantidad340.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad340.setText("2");
		txtCantidad340.setColumns(10);
		pnlTCantidad.add(txtCantidad340);
		Validaciones.validarDigitos(txtCantidad340);

		txtCantidad350 = new JTextField();
		txtCantidad350.setEditable(false);
		txtCantidad350.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad350.setText("2");
		txtCantidad350.setColumns(10);
		pnlTCantidad.add(txtCantidad350);
		Validaciones.validarDigitos(txtCantidad350);

		txtCantidad360 = new JTextField();
		txtCantidad360.setEditable(false);
		txtCantidad360.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad360.setText("20");
		txtCantidad360.setColumns(10);
		pnlTCantidad.add(txtCantidad360);
		Validaciones.validarDigitos(txtCantidad360);

		txtCantidad370 = new JTextField();
		txtCantidad370.setEditable(false);
		txtCantidad370.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad370.setText("6");
		txtCantidad370.setColumns(10);
		pnlTCantidad.add(txtCantidad370);
		Validaciones.validarDigitos(txtCantidad370);

		txtCantidad380 = new JTextField();
		txtCantidad380.setEditable(false);
		txtCantidad380.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad380.setText("40");
		txtCantidad380.setColumns(10);
		pnlTCantidad.add(txtCantidad380);
		Validaciones.validarDigitos(txtCantidad380);

		txtCantidad390 = new JTextField();
		txtCantidad390.setEditable(false);
		txtCantidad390.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad390.setText("32");
		txtCantidad390.setColumns(10);
		pnlTCantidad.add(txtCantidad390);
		Validaciones.validarDigitos(txtCantidad390);

		JPanel pnlTObsRef = new JPanel();
		pnlTObsRef.setBounds(270, 20, 136, 260);
		pnlComponenteEst.add(pnlTObsRef);
		pnlTObsRef.setLayout(new GridLayout(13, 0, 0, 0));

		txtObs27 = new JTextField();
		txtObs27.setColumns(10);
		pnlTObsRef.add(txtObs27);

		txtObs28 = new JTextField();
		txtObs28.setColumns(10);
		pnlTObsRef.add(txtObs28);

		txtObs29 = new JTextField();
		txtObs29.setColumns(10);
		pnlTObsRef.add(txtObs29);

		txtObs30 = new JTextField();
		txtObs30.setColumns(10);
		pnlTObsRef.add(txtObs30);

		txtObs31 = new JTextField();
		txtObs31.setColumns(10);
		pnlTObsRef.add(txtObs31);

		txtObs32 = new JTextField();
		txtObs32.setColumns(10);
		pnlTObsRef.add(txtObs32);

		txtObs33 = new JTextField();
		txtObs33.setColumns(10);
		pnlTObsRef.add(txtObs33);

		txtObs34 = new JTextField();
		txtObs34.setColumns(10);
		pnlTObsRef.add(txtObs34);

		txtObs35 = new JTextField();
		txtObs35.setColumns(10);
		pnlTObsRef.add(txtObs35);

		txtObs36 = new JTextField();
		txtObs36.setColumns(10);
		pnlTObsRef.add(txtObs36);

		txtObs37 = new JTextField();
		txtObs37.setColumns(10);
		pnlTObsRef.add(txtObs37);

		txtObs38 = new JTextField();
		txtObs38.setColumns(10);
		pnlTObsRef.add(txtObs38);

		txtObs39 = new JTextField();
		txtObs39.setColumns(10);
		pnlTObsRef.add(txtObs39);

		JPanel panel = new JPanel();
		panel.setBounds(236, 20, 31, 260);
		pnlComponenteEst.add(panel);
		panel.setLayout(new GridLayout(13, 2, 0, 0));

		txtCantidad271 = new JTextField();
		txtCantidad271.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad271.setColumns(10);
		panel.add(txtCantidad271);

		txtCantidad281 = new JTextField();
		txtCantidad281.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad281.setColumns(10);
		panel.add(txtCantidad281);

		txtCantidad291 = new JTextField();
		txtCantidad291.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad291.setColumns(10);
		panel.add(txtCantidad291);

		txtCantidad301 = new JTextField();
		txtCantidad301.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad301.setColumns(10);
		panel.add(txtCantidad301);

		txtCantidad311 = new JTextField();
		txtCantidad311.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad311.setColumns(10);
		panel.add(txtCantidad311);

		txtCantidad321 = new JTextField();
		txtCantidad321.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad321.setColumns(10);
		panel.add(txtCantidad321);

		txtCantidad331 = new JTextField();
		txtCantidad331.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad331.setColumns(10);
		panel.add(txtCantidad331);

		txtCantidad341 = new JTextField();
		txtCantidad341.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad341.setColumns(10);
		panel.add(txtCantidad341);

		txtCantidad351 = new JTextField();
		txtCantidad351.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad351.setColumns(10);
		panel.add(txtCantidad351);

		txtCantidad361 = new JTextField();
		txtCantidad361.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad361.setColumns(10);
		panel.add(txtCantidad361);

		txtCantidad371 = new JTextField();
		txtCantidad371.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad371.setColumns(10);
		panel.add(txtCantidad371);

		txtCantidad381 = new JTextField();
		txtCantidad381.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad381.setColumns(10);
		panel.add(txtCantidad381);

		txtCantidad391 = new JTextField();
		txtCantidad391.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad391.setColumns(10);
		panel.add(txtCantidad391);

		textFields.add(new JTextField[] { txtCantidad271, txtObs27 });
		textFields.add(new JTextField[] { txtCantidad281, txtObs28 });
		textFields.add(new JTextField[] { txtCantidad291, txtObs29 });
		textFields.add(new JTextField[] { txtCantidad301, txtObs30 });
		textFields.add(new JTextField[] { txtCantidad311, txtObs31 });
		textFields.add(new JTextField[] { txtCantidad321, txtObs32 });
		textFields.add(new JTextField[] { txtCantidad331, txtObs33 });
		textFields.add(new JTextField[] { txtCantidad341, txtObs34 });
		textFields.add(new JTextField[] { txtCantidad351, txtObs35 });
		textFields.add(new JTextField[] { txtCantidad361, txtObs36 });
		textFields.add(new JTextField[] { txtCantidad371, txtObs37 });
		textFields.add(new JTextField[] { txtCantidad381, txtObs38 });
		textFields.add(new JTextField[] { txtCantidad391, txtObs39 });

		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());
		llenarCabecera(cabecera);

		InformacionObligatoriaV infoObligatoria = new InformacionObligatoriaV(860, 312);
		infoObligatoria.getBtnInsertarFoto().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("INSERTAR FOTO");
			}
		});
		pnlPestaña1.add(infoObligatoria.getPnlInformacionObl());

		cabecera.getBtnRegistrar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TInformacionObligatoria infoObl = cargarInfoObligatoria(infoObligatoria);
				if (validarInfo(infoObl)) {
					ServicioFicha srvFicha = new ComponenteFicha();
					ServicioInfoObligatoria srvInfoObl = new ComponenteInfoObligatoria();

					infoObl.settCabe(gettCabecera());
					srvInfoObl.crear(infoObl);
					infoObl.setIoSerial(srvInfoObl.serialInfoOblMax());

					srvFicha.insertarFormulario(cargarFicha(infoObl));
				} else {
					JOptionPane.showMessageDialog(null, "Datos obligatorios");
				}
			}
		});

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				new Menu().setVisible(true);
				dispose();
			}
		});
	}

	private LinkedList<LinkedList<TdetalleFicha>> cargarFicha(TInformacionObligatoria infoObligatoria) {
		ServicioFicha srvFicha = new ComponenteFicha();

		TCabecera cabecera = gettCabecera();
		Integer updateFicha = srvFicha.nActualizacionFicha(gettCabecera(), ficha);

		LinkedList<TdetalleFicha> listaKE = new LinkedList<>();
		TGrupo grupoTmp = srvFicha.buscarGrupo("Kit eléctrico");
		listaKE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad00.getText()), Integer.parseInt(txtCantidad01.getText()), txtObs0.getText(),
				updateFicha));
		listaKE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad10.getText()), Integer.parseInt(txtCantidad11.getText()), txtObs1.getText(),
				updateFicha));
		listaKE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad20.getText()), Integer.parseInt(txtCantidad21.getText()), txtObs2.getText(),
				updateFicha));
		listaKE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad30.getText()), Integer.parseInt(txtCantidad31.getText()), txtObs3.getText(),
				updateFicha));
		listaKE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad40.getText()), Integer.parseInt(txtCantidad41.getText()), txtObs4.getText(),
				updateFicha));

		LinkedList<TdetalleFicha> listaKAL = new LinkedList<TdetalleFicha>();
		grupoTmp = srvFicha.buscarGrupo("Kit agua lluvia");
		listaKAL.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad50.getText()), Integer.parseInt(txtCantidad51.getText()), txtObs5.getText(),
				updateFicha));
		listaKAL.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad60.getText()), Integer.parseInt(txtCantidad61.getText()), txtObs6.getText(),
				updateFicha));
		listaKAL.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad70.getText()), Integer.parseInt(txtCantidad71.getText()), txtObs7.getText(),
				updateFicha));
		listaKAL.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad80.getText()), Integer.parseInt(txtCantidad81.getText()), txtObs8.getText(),
				updateFicha));
		listaKAL.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad90.getText()), Integer.parseInt(txtCantidad91.getText()), txtObs9.getText(),
				updateFicha));

		LinkedList<TdetalleFicha> listaCA = new LinkedList<TdetalleFicha>();
		grupoTmp = srvFicha.buscarGrupo("Componente arquitectónico");
		listaCA.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad100.getText()), Integer.parseInt(txtCantidad101.getText()),
				txtObs10.getText(), updateFicha));
		listaCA.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad110.getText()), Integer.parseInt(txtCantidad111.getText()),
				txtObs11.getText(), updateFicha));
		listaCA.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad120.getText()), Integer.parseInt(txtCantidad121.getText()),
				txtObs12.getText(), updateFicha));
		listaCA.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad130.getText()), Integer.parseInt(txtCantidad131.getText()),
				txtObs13.getText(), updateFicha));
		listaCA.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad140.getText()), Integer.parseInt(txtCantidad141.getText()),
				txtObs14.getText(), updateFicha));

		LinkedList<TdetalleFicha> listaFF = new LinkedList<TdetalleFicha>();
		grupoTmp = srvFicha.buscarGrupo("Fachada frontal");
		listaFF.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad150.getText()), Integer.parseInt(txtCantidad151.getText()),
				txtObs15.getText(), updateFicha));
		listaFF.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad160.getText()), Integer.parseInt(txtCantidad161.getText()),
				txtObs16.getText(), updateFicha));
		listaFF.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad170.getText()), Integer.parseInt(txtCantidad171.getText()),
				txtObs17.getText(), updateFicha));
		listaFF.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad180.getText()), Integer.parseInt(txtCantidad181.getText()),
				txtObs18.getText(), updateFicha));

		LinkedList<TdetalleFicha> listaFP = new LinkedList<TdetalleFicha>();
		grupoTmp = srvFicha.buscarGrupo("Fachada posterior");
		listaFP.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad190.getText()), Integer.parseInt(txtCantidad191.getText()),
				txtObs19.getText(), updateFicha));
		listaFP.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad200.getText()), Integer.parseInt(txtCantidad201.getText()),
				txtObs20.getText(), updateFicha));
		listaFP.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad210.getText()), Integer.parseInt(txtCantidad211.getText()),
				txtObs21.getText(), updateFicha));

		LinkedList<TdetalleFicha> listaFL = new LinkedList<TdetalleFicha>();
		grupoTmp = srvFicha.buscarGrupo("Fachada lateral");
		listaFL.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad220.getText()), Integer.parseInt(txtCantidad221.getText()),
				txtObs22.getText(), updateFicha));
		listaFL.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad230.getText()), Integer.parseInt(txtCantidad231.getText()),
				txtObs23.getText(), updateFicha));

		LinkedList<TdetalleFicha> listaI = new LinkedList<TdetalleFicha>();
		grupoTmp = srvFicha.buscarGrupo("Interior");
		listaI.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad240.getText()), Integer.parseInt(txtCantidad241.getText()),
				txtObs24.getText(), updateFicha));
		listaI.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad250.getText()), Integer.parseInt(txtCantidad251.getText()),
				txtObs25.getText(), updateFicha));

		LinkedList<TdetalleFicha> listaC = new LinkedList<TdetalleFicha>();
		grupoTmp = srvFicha.buscarGrupo("Cubierta");
		listaC.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad260.getText()), Integer.parseInt(txtCantidad261.getText()),
				txtObs26.getText(), updateFicha));

		LinkedList<TdetalleFicha> listaCE = new LinkedList<TdetalleFicha>();
		grupoTmp = srvFicha.buscarGrupo("Componente estructural");
		listaCE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad270.getText()), Integer.parseInt(txtCantidad271.getText()),
				txtObs27.getText(), updateFicha));
		listaCE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad280.getText()), Integer.parseInt(txtCantidad281.getText()),
				txtObs28.getText(), updateFicha));
		listaCE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad290.getText()), Integer.parseInt(txtCantidad291.getText()),
				txtObs29.getText(), updateFicha));
		listaCE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad300.getText()), Integer.parseInt(txtCantidad301.getText()),
				txtObs30.getText(), updateFicha));
		listaCE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad310.getText()), Integer.parseInt(txtCantidad311.getText()),
				txtObs31.getText(), updateFicha));
		listaCE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad320.getText()), Integer.parseInt(txtCantidad321.getText()),
				txtObs32.getText(), updateFicha));
		listaCE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad330.getText()), Integer.parseInt(txtCantidad331.getText()),
				txtObs33.getText(), updateFicha));
		listaCE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad340.getText()), Integer.parseInt(txtCantidad341.getText()),
				txtObs34.getText(), updateFicha));
		listaCE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad350.getText()), Integer.parseInt(txtCantidad351.getText()),
				txtObs35.getText(), updateFicha));
		listaCE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad360.getText()), Integer.parseInt(txtCantidad361.getText()),
				txtObs36.getText(), updateFicha));
		listaCE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad370.getText()), Integer.parseInt(txtCantidad371.getText()),
				txtObs37.getText(), updateFicha));
		listaCE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad380.getText()), Integer.parseInt(txtCantidad381.getText()),
				txtObs38.getText(), updateFicha));
		listaCE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCantidad390.getText()), Integer.parseInt(txtCantidad391.getText()),
				txtObs39.getText(), updateFicha));

		LinkedList<LinkedList<TdetalleFicha>> listaFormulario = new LinkedList<LinkedList<TdetalleFicha>>();
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

	public LinkedList<JTextField[]> getTextFields() {
		return textFields;
	}

	public void setTextFields(LinkedList<JTextField[]> textFields) {
		this.textFields = textFields;
	}

}
