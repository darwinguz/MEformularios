package com.capa.presentacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.capa.util.Utilitarios;

public class FichaBRevisionBloques extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -464231132711014311L;
	private JPanel contentPane;
	private JTextField txtAmie;
	private JTextField txtCircuito;
	private JTextField txtFechaEntrega;
	private JTextField txtFechaInicioTrabajo;
	private JTextField txtSector;
	private JTextField txtProyecto;
	private JTextField txtParroquia;
	private JTextField txtDObsRef;
	private JTextField txtPPAObsRef;
	private JTextField txtPTPObsRef;
	private JTextField txtPCObsRef;
	private JTextField txtV_UPVCObsRef;
	private JTextField textField_4;
	private JTextField txtEMObsRef;
	private JTextField txtIObsRef;
	private JTextField txtSFObsRef;
	private JTextField txtWPCObsRef;
	private JPanel pnlInformacionObl;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FichaBRevisionBloques frame = new FichaBRevisionBloques();
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
	public FichaBRevisionBloques() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1318, 659);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel pnlSuperior = new JPanel();
		pnlSuperior.setLayout(null);
		pnlSuperior.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlSuperior.setBounds(115, 11, 1052, 103);
		contentPane.add(pnlSuperior);

		JLabel lblLogoMinEdu = new JLabel("");
		lblLogoMinEdu.setBounds(0, 11, 160, 81);
		lblLogoMinEdu.setIcon(Utilitarios.getImagenIcon("logoMinEdu.png", 160, 80, 100));
		pnlSuperior.add(lblLogoMinEdu);

		txtAmie = new JTextField();
		txtAmie.setColumns(10);
		txtAmie.setBounds(391, 24, 86, 20);
		pnlSuperior.add(txtAmie);

		JComboBox cmbDistrito = new JComboBox();
		cmbDistrito.setBounds(512, 24, 160, 20);
		pnlSuperior.add(cmbDistrito);

		JComboBox cmbZona = new JComboBox();
		cmbZona.setBounds(160, 72, 50, 20);
		pnlSuperior.add(cmbZona);

		JComboBox cmbProvincia = new JComboBox();
		cmbProvincia.setBounds(234, 72, 125, 20);
		pnlSuperior.add(cmbProvincia);

		JComboBox cmbCanton = new JComboBox();
		cmbCanton.setBounds(391, 72, 125, 20);
		pnlSuperior.add(cmbCanton);

		txtCircuito = new JTextField();
		txtCircuito.setColumns(10);
		txtCircuito.setBounds(717, 24, 86, 20);
		pnlSuperior.add(txtCircuito);

		txtFechaEntrega = new JTextField();
		txtFechaEntrega.setColumns(10);
		txtFechaEntrega.setBounds(813, 24, 86, 20);
		pnlSuperior.add(txtFechaEntrega);

		txtFechaInicioTrabajo = new JTextField();
		txtFechaInicioTrabajo.setColumns(10);
		txtFechaInicioTrabajo.setBounds(912, 24, 86, 20);
		pnlSuperior.add(txtFechaInicioTrabajo);

		txtSector = new JTextField();
		txtSector.setColumns(10);
		txtSector.setBounds(705, 72, 208, 20);
		pnlSuperior.add(txtSector);

		JLabel lblProyecto = new JLabel("Proyecto");
		lblProyecto.setBounds(164, 11, 57, 14);
		pnlSuperior.add(lblProyecto);

		JLabel lblZona = new JLabel("Zona");
		lblZona.setBounds(160, 55, 40, 14);
		pnlSuperior.add(lblZona);

		JLabel lblProvincia = new JLabel("Provincia");
		lblProvincia.setBounds(234, 55, 57, 14);
		pnlSuperior.add(lblProvincia);

		JLabel lblCanton = new JLabel("Cant\u00F3n");
		lblCanton.setBounds(391, 55, 40, 14);
		pnlSuperior.add(lblCanton);

		JLabel lblParroquia = new JLabel("Parroquia");
		lblParroquia.setBounds(545, 55, 57, 14);
		pnlSuperior.add(lblParroquia);

		JLabel lblSector = new JLabel("Sector");
		lblSector.setBounds(705, 55, 57, 14);
		pnlSuperior.add(lblSector);

		JLabel lblAmie = new JLabel("AMIE");
		lblAmie.setBounds(391, 11, 40, 14);
		pnlSuperior.add(lblAmie);

		JLabel lblDistrito = new JLabel("Distrito");
		lblDistrito.setBounds(512, 11, 64, 14);
		pnlSuperior.add(lblDistrito);

		JLabel lblCircuito = new JLabel("Circuito");
		lblCircuito.setBounds(717, 11, 57, 14);
		pnlSuperior.add(lblCircuito);

		JLabel lblFechaEntrega = new JLabel("Fecha Entrega");
		lblFechaEntrega.setBounds(813, 11, 84, 14);
		pnlSuperior.add(lblFechaEntrega);

		JLabel lblFechaInicioTrabajo = new JLabel("Fecha Inicio Trabajo");
		lblFechaInicioTrabajo.setBounds(911, 11, 114, 14);
		pnlSuperior.add(lblFechaInicioTrabajo);

		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(938, 60, 98, 32);
		pnlSuperior.add(btnRegistrar);

		txtProyecto = new JTextField();
		txtProyecto.setColumns(10);
		txtProyecto.setBounds(160, 24, 199, 20);
		pnlSuperior.add(txtProyecto);

		txtParroquia = new JTextField();
		txtParroquia.setColumns(10);
		txtParroquia.setBounds(545, 72, 114, 20);
		pnlSuperior.add(txtParroquia);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 125, 1286, 484);
		contentPane.add(tabbedPane);

		JPanel pnlPestaña1 = new JPanel();
		tabbedPane.addTab("1.- Ficha Revisión Bloques", null, pnlPestaña1, null);
		pnlPestaña1.setLayout(null);

		JPanel pnlDimensiones = new JPanel();
		pnlDimensiones.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Dimensiones",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlDimensiones.setBounds(0, 11, 249, 63);
		pnlPestaña1.add(pnlDimensiones);
		pnlDimensiones.setLayout(null);

		JLabel lblDCaracteristicas = new JLabel(
				"<html><body>Largo del aula: 9,00 m<br>Ancho del aula: 6,00 m<br>Altura del aula: "
						+ "Mínima: 2,70 m, Máxima: 3,00 m</body></html>");
		lblDCaracteristicas.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDCaracteristicas.setBounds(10, 13, 235, 48);
		pnlDimensiones.add(lblDCaracteristicas);

		JPanel pnlDObsRef = new JPanel();
		pnlDObsRef.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlDObsRef.setBounds(249, 19, 177, 47);
		pnlPestaña1.add(pnlDObsRef);
		pnlDObsRef.setLayout(null);

		JLabel lblDObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblDObsRef.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblDObsRef.setBounds(50, 0, 123, 14);
		pnlDObsRef.add(lblDObsRef);

		JRadioButton rdbtnDSi = new JRadioButton("");
		rdbtnDSi.setBounds(2, 16, 21, 23);
		pnlDObsRef.add(rdbtnDSi);

		JRadioButton rdbtnDNo = new JRadioButton("");
		rdbtnDNo.setBounds(23, 16, 21, 23);
		pnlDObsRef.add(rdbtnDNo);

		ButtonGroup grBtnD = new ButtonGroup();
		grBtnD.add(rdbtnDSi);
		grBtnD.add(rdbtnDNo);

		JLabel lblDSi = new JLabel("SI");
		lblDSi.setBounds(6, 0, 21, 14);
		pnlDObsRef.add(lblDSi);

		JLabel lblDNo = new JLabel("NO");
		lblDNo.setBounds(25, 0, 21, 14);
		pnlDObsRef.add(lblDNo);

		txtDObsRef = new JTextField();
		txtDObsRef.setBounds(50, 16, 123, 20);
		pnlDObsRef.add(txtDObsRef);
		txtDObsRef.setColumns(10);

		JPanel pnlBasesPrefabricadas = new JPanel();
		pnlBasesPrefabricadas.setLayout(null);
		pnlBasesPrefabricadas.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"Bases Prefabricadas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlBasesPrefabricadas.setBounds(0, 77, 249, 74);
		pnlPestaña1.add(pnlBasesPrefabricadas);

		JLabel lblBPCaracteristicas = new JLabel(
				"<html><body>Material: Hormigón premezclado con resistencia mínima de 210 kg/cm2<br>Cantidad:   "
						+ "De acuerdo a la referencia en el Plano No. E1</body></html>");
		lblBPCaracteristicas.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblBPCaracteristicas.setBounds(10, 13, 235, 56);
		pnlBasesPrefabricadas.add(lblBPCaracteristicas);

		JPanel pnlBPObsRef = new JPanel();
		pnlBPObsRef.setLayout(null);
		pnlBPObsRef.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlBPObsRef.setBounds(249, 82, 177, 47);
		pnlPestaña1.add(pnlBPObsRef);

		JLabel lblBPObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblBPObsRef.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblBPObsRef.setBounds(50, 0, 123, 14);
		pnlBPObsRef.add(lblBPObsRef);

		JRadioButton rdbtnBPSi = new JRadioButton("");
		rdbtnBPSi.setBounds(2, 16, 21, 23);
		pnlBPObsRef.add(rdbtnBPSi);

		JRadioButton rdbtnBPNo = new JRadioButton("");
		rdbtnBPNo.setBounds(23, 16, 21, 23);
		pnlBPObsRef.add(rdbtnBPNo);
		ButtonGroup grBtnBP = new ButtonGroup();
		grBtnBP.add(rdbtnBPSi);
		grBtnBP.add(rdbtnBPNo);

		JLabel lblBPSi = new JLabel("SI");
		lblBPSi.setBounds(6, 0, 21, 14);
		pnlBPObsRef.add(lblBPSi);

		JLabel lblBPNo = new JLabel("NO");
		lblBPNo.setBounds(25, 0, 21, 14);
		pnlBPObsRef.add(lblBPNo);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(50, 16, 123, 20);
		pnlBPObsRef.add(textField_4);

		JPanel pnlEstrMetalica = new JPanel();
		pnlEstrMetalica.setLayout(null);
		pnlEstrMetalica.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"Estructura Met\u00E1lica \"Steel Framing\"", TitledBorder.LEADING, TitledBorder.TOP, null,
				new Color(0, 0, 0)));
		pnlEstrMetalica.setBounds(0, 156, 249, 299);
		pnlPestaña1.add(pnlEstrMetalica);

		JLabel lblEMCaracteristicas = new JLabel(
				"<html><body>Material: La estructura metálica Steel Framing es el sistema prefabricado de armado para la cubierta "
						+ "y contrapiso, conformado por perfiles metálicos galvanizados, laminados en frío normada por "
						+ "los estándares del Instituto Americano de Hierro y Acero AISI. Composición:  Cada estructura "
						+ "metálica está conformada por perfiles tipo G con dimensiones variables de 100mm a 200mm de alto, "
						+ "40mm de ala y 17 mm de aleta (mínimo) y perfiles tipo U de 100mm a 200mm de altura, 35 mm de alma "
						+ "(mínimo) con espesores de placa entre 0,93 – 1,64 mm, laminados en frio, los cuales deberán ser "
						+ "utilizados en función del elemento a soportar y se ensamblarán entre sí utilizando su respectiva "
						+ "tuerca y perno galvanizado. Normativa: La estructura soporta acciones horizontales y verticales "
						+ "de acuerdo a lo señalado en la Norma Técnica Ecuatoriana (NEC2014). "
						+ "Plano de referencia:  No. E1</body></html>");
		lblEMCaracteristicas.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblEMCaracteristicas.setBounds(10, 17, 235, 274);
		pnlEstrMetalica.add(lblEMCaracteristicas);

		JPanel pnlEMObsRef = new JPanel();
		pnlEMObsRef.setLayout(null);
		pnlEMObsRef.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlEMObsRef.setBounds(249, 162, 177, 47);
		pnlPestaña1.add(pnlEMObsRef);

		JLabel lblEMObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblEMObsRef.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblEMObsRef.setBounds(50, 0, 123, 14);
		pnlEMObsRef.add(lblEMObsRef);

		JRadioButton rdbtnEMSi = new JRadioButton("");
		rdbtnEMSi.setBounds(2, 16, 21, 23);
		pnlEMObsRef.add(rdbtnEMSi);

		JRadioButton rdbtnEMNo = new JRadioButton("");
		rdbtnEMNo.setBounds(23, 16, 21, 23);
		pnlEMObsRef.add(rdbtnEMNo);

		ButtonGroup grBtnEM = new ButtonGroup();
		grBtnEM.add(rdbtnEMSi);
		grBtnEM.add(rdbtnEMNo);

		JLabel lblEMSi = new JLabel("SI");
		lblEMSi.setBounds(6, 0, 21, 14);
		pnlEMObsRef.add(lblEMSi);

		JLabel lblEMNo = new JLabel("NO");
		lblEMNo.setBounds(25, 0, 21, 14);
		pnlEMObsRef.add(lblEMNo);

		txtEMObsRef = new JTextField();
		txtEMObsRef.setColumns(10);
		txtEMObsRef.setBounds(50, 16, 123, 20);
		pnlEMObsRef.add(txtEMObsRef);

		JPanel pnlPPA = new JPanel();
		pnlPPA.setLayout(null);
		pnlPPA.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Paneles de Pared con Alma",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlPPA.setBounds(426, 11, 249, 252);
		pnlPestaña1.add(pnlPPA);

		JLabel lblPPACaracteristicas = new JLabel(
				"<html><body>Materiales:<br>" + "Acero: galvanizado pre pintado de acuerdo a diseño arquitectónico y "
						+ "disponibilidad de colores de acuerdo a producción del material, en 0,5 mm de grosor según norma ASTM.<br>"
						+ "EPS: Poliestireno expandido con retardante al fuego tipo F.<br>"
						+ "Dimensiones mínimas: 1,00 - 1,20 mts de ancho y de espesor de 100 mm, con una densidad entre 18 - 20 kg/m3.<br>"
						+ "Composición:<br>"
						+ "Las paredes están conformadas por un panel sándwich formado por un núcleo aislante térmico de espuma rígida "
						+ "de poliestireno expandido (EPS) con retardante de fuego, además de un recubrimiento en ambas caras de plancha metálica."
						+ "Las paredes son termo acústicos, auto portantes, durables, inoxidables.<br>"
						+ "Normativa: Los paneles tienen la capacidad de resisitrir acciones horizontales y verticales de acuerdo a lo señalado en el NEC2014."
						+ "Plano de referencia:  No. E1</body></html>");
		lblPPACaracteristicas.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblPPACaracteristicas.setBounds(10, 17, 235, 227);
		pnlPPA.add(lblPPACaracteristicas);

		JPanel pnlPPAObsRef = new JPanel();
		pnlPPAObsRef.setLayout(null);
		pnlPPAObsRef.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlPPAObsRef.setBounds(675, 19, 177, 47);
		pnlPestaña1.add(pnlPPAObsRef);

		JLabel lblPPAObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblPPAObsRef.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblPPAObsRef.setBounds(50, 0, 123, 14);
		pnlPPAObsRef.add(lblPPAObsRef);

		JRadioButton rdbtnPPASi = new JRadioButton("");
		rdbtnPPASi.setBounds(2, 16, 21, 23);
		pnlPPAObsRef.add(rdbtnPPASi);

		JRadioButton rdbtnPPANo = new JRadioButton("");
		rdbtnPPANo.setBounds(23, 16, 21, 23);
		pnlPPAObsRef.add(rdbtnPPANo);

		ButtonGroup grBtnPPA = new ButtonGroup();
		grBtnPPA.add(rdbtnPPASi);
		grBtnPPA.add(rdbtnPPANo);

		JLabel lblPPASi = new JLabel("SI");
		lblPPASi.setBounds(6, 0, 21, 14);
		pnlPPAObsRef.add(lblPPASi);

		JLabel lblPPANo = new JLabel("NO");
		lblPPANo.setBounds(25, 0, 21, 14);
		pnlPPAObsRef.add(lblPPANo);

		txtPPAObsRef = new JTextField();
		txtPPAObsRef.setColumns(10);
		txtPPAObsRef.setBounds(50, 16, 123, 20);
		pnlPPAObsRef.add(txtPPAObsRef);

		JPanel pnlVentanasUPVC = new JPanel();
		pnlVentanasUPVC.setLayout(null);
		pnlVentanasUPVC.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ventanas de UPVC",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlVentanasUPVC.setBounds(426, 263, 249, 170);
		pnlPestaña1.add(pnlVentanasUPVC);

		JLabel lblV_UPVCCaracteristicas = new JLabel("<html><body>Materiales:"
				+ "UPVC (Policloruro de vinilo sin plastificar)."
				+ "Dimensiones mínimas: Las ventanas en los módulos de aulas son de 3,0 X 1,10 mts."
				+ "Composición:  La ventanearía de los módulos es corrediza compuesta de tres hojas y dos carriles, "
				+ "perfiles de UPVC, con todos los sistemas de fijación, anclaje y seguridad que se requiere."
				+ "El marco de la ventana es elaborado con canal C metálico galvanizado laminado en frio, Steel "
				+ "Framing bajo los estándares del Instituto americano de Hierro y Acero AISI."
				+ "El anclaje es realizado con tornillos autorroscantes directamente al marco de la ventana en todos sus lados. "
				+ "Normativa: Instituto americano de Hierro y Acero AISI. Plano de referencia:  No. E1</body></html>");
		lblV_UPVCCaracteristicas.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblV_UPVCCaracteristicas.setBounds(10, 17, 235, 150);
		pnlVentanasUPVC.add(lblV_UPVCCaracteristicas);

		JPanel pnlV_UPVCObsRef = new JPanel();
		pnlV_UPVCObsRef.setLayout(null);
		pnlV_UPVCObsRef.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlV_UPVCObsRef.setBounds(675, 268, 177, 47);
		pnlPestaña1.add(pnlV_UPVCObsRef);

		JLabel lblV_UPVCObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblV_UPVCObsRef.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblV_UPVCObsRef.setBounds(50, 0, 123, 14);
		pnlV_UPVCObsRef.add(lblV_UPVCObsRef);

		JRadioButton rdbtnV_UPVCSi = new JRadioButton("");
		rdbtnV_UPVCSi.setBounds(2, 16, 21, 23);
		pnlV_UPVCObsRef.add(rdbtnV_UPVCSi);

		JRadioButton rdbtnV_UPVCNo = new JRadioButton("");
		rdbtnV_UPVCNo.setBounds(23, 16, 21, 23);
		pnlV_UPVCObsRef.add(rdbtnV_UPVCNo);

		ButtonGroup grBtnV_UPVC = new ButtonGroup();
		grBtnV_UPVC.add(rdbtnV_UPVCSi);
		grBtnV_UPVC.add(rdbtnV_UPVCNo);

		JLabel lblV_UPVCSi = new JLabel("SI");
		lblV_UPVCSi.setBounds(6, 0, 21, 14);
		pnlV_UPVCObsRef.add(lblV_UPVCSi);

		JLabel lblV_UPVCNo = new JLabel("NO");
		lblV_UPVCNo.setBounds(25, 0, 21, 14);
		pnlV_UPVCObsRef.add(lblV_UPVCNo);

		txtV_UPVCObsRef = new JTextField();
		txtV_UPVCObsRef.setColumns(10);
		txtV_UPVCObsRef.setBounds(50, 16, 123, 20);
		pnlV_UPVCObsRef.add(txtV_UPVCObsRef);

		JPanel pnlPTP = new JPanel();
		pnlPTP.setLayout(null);
		pnlPTP.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Puerta Tipo Panel EPS",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlPTP.setBounds(852, 11, 249, 230);
		pnlPestaña1.add(pnlPTP);

		JLabel lblPTPCaracteristicas = new JLabel("<html><body>Materiales:<br>"
				+ "EPS (Poliestireno expandido con retardante al fuego), en la que se incluye el marco y tapa marcos respectivo.<br>"
				+ "Dimensiones mínimas: De acuerdo a planos constructivos.<br>Composición:"
				+ "La hoja de la puerta es de panel sánduche 50 mm de espesor, con un marco y un contramarco de canal C "
				+ "metálico galvanizado laminado en frío Steel Framing bajo los estándares del Instituto Americano de Hierro y Acero.<br>"
				+ "Se usan bisagras de 3 y cerradura con llave, tipo industrial instalada en hendidura de puerta o similar con reforzamiento "
				+ "de platina metálica en el donde se instala la cerradura.<br>"
				+ "El anclaje de la puerta se realiza con tres (3) bisagras atornilladas y apernadas al contramarco con al menos 8 tornillos.<br>"
				+ "Normativa: Instituto americano de Hierro y Acero AISI. "
				+ "Plano de referencia:  No. E1</body></html>");
		lblPTPCaracteristicas.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblPTPCaracteristicas.setBounds(10, 12, 235, 212);
		pnlPTP.add(lblPTPCaracteristicas);

		JPanel pnlPTPObsRef = new JPanel();
		pnlPTPObsRef.setLayout(null);
		pnlPTPObsRef.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlPTPObsRef.setBounds(1101, 19, 177, 47);
		pnlPestaña1.add(pnlPTPObsRef);

		JLabel lblPTPObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblPTPObsRef.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblPTPObsRef.setBounds(50, 0, 123, 14);
		pnlPTPObsRef.add(lblPTPObsRef);

		JRadioButton rdbtnPTPSi = new JRadioButton("");
		rdbtnPTPSi.setBounds(2, 16, 21, 23);
		pnlPTPObsRef.add(rdbtnPTPSi);

		JRadioButton rdbtnPTPNo = new JRadioButton("");
		rdbtnPTPNo.setBounds(23, 16, 21, 23);
		pnlPTPObsRef.add(rdbtnPTPNo);

		ButtonGroup grBtnPTP = new ButtonGroup();
		grBtnPTP.add(rdbtnPTPSi);
		grBtnPTP.add(rdbtnPTPNo);

		JLabel lblPTPSi = new JLabel("SI");
		lblPTPSi.setBounds(6, 0, 21, 14);
		pnlPTPObsRef.add(lblPTPSi);

		JLabel lblPTPNo = new JLabel("NO");
		lblPTPNo.setBounds(25, 0, 21, 14);
		pnlPTPObsRef.add(lblPTPNo);

		txtPTPObsRef = new JTextField();
		txtPTPObsRef.setColumns(10);
		txtPTPObsRef.setBounds(50, 16, 123, 20);
		pnlPTPObsRef.add(txtPTPObsRef);

		JPanel pnlPC = new JPanel();
		pnlPC.setLayout(null);
		pnlPC.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Panel de Cubierta con EPS",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlPC.setBounds(852, 245, 249, 208);
		pnlPestaña1.add(pnlPC);

		JLabel lblPCCaracteristicas = new JLabel("<html><body>Materiales:<br>El panel consta de materiales:<br>"
				+ "Acero: Acero galvanizado pre pintado de acuerdo a diseño arquitectónico y disponibilidad de "
				+ "colores de acuerdo, en  0,5 mm de grosor según norma ASTM."
				+ "EPS: Poliestireno expandido con retardante al fuego tipo F.<br>"
				+ "Dimensiones mínimas:  El panel de cubierta EPS (panel prefabricado de poliestireno con "
				+ "retardante al fuego) está compuesto por módulos de 1,00 a 1,20 mts de ancho y de espesor "
				+ "mínimo de 100 mm, con una densidad entre 18-20 kg/m3."
				+ "Composición:  Los paneles son termocústicos, auto portantes, durables, inoxidables."
				+ "	Normativa: Los paneles de cubierta tienen la capacidad de resisitrir acciones "
				+ "horizontales y verticales de acuerdo a lo señalado en el NEC2014. Plano de referencia:  No. E1"
				+ "</body></html>");
		lblPCCaracteristicas.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblPCCaracteristicas.setBounds(10, 13, 235, 188);
		pnlPC.add(lblPCCaracteristicas);

		JPanel pnlPCObsRef = new JPanel();
		pnlPCObsRef.setLayout(null);
		pnlPCObsRef.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlPCObsRef.setBounds(1101, 253, 177, 47);
		pnlPestaña1.add(pnlPCObsRef);

		JLabel lblPCObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblPCObsRef.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblPCObsRef.setBounds(50, 0, 123, 14);
		pnlPCObsRef.add(lblPCObsRef);

		JRadioButton rdbtnPCSi = new JRadioButton("");
		rdbtnPCSi.setBounds(2, 16, 21, 23);
		pnlPCObsRef.add(rdbtnPCSi);

		JRadioButton rdbtnPCNo = new JRadioButton("");
		rdbtnPCNo.setBounds(23, 16, 21, 23);
		pnlPCObsRef.add(rdbtnPCNo);

		ButtonGroup grBtnPC = new ButtonGroup();
		grBtnPC.add(rdbtnPCSi);
		grBtnPC.add(rdbtnPCNo);

		JLabel lblPCSi = new JLabel("SI");
		lblPCSi.setBounds(6, 0, 21, 14);
		pnlPCObsRef.add(lblPCSi);

		JLabel lblPCNo = new JLabel("NO");
		lblPCNo.setBounds(25, 0, 21, 14);
		pnlPCObsRef.add(lblPCNo);

		txtPCObsRef = new JTextField();
		txtPCObsRef.setColumns(10);
		txtPCObsRef.setBounds(50, 16, 123, 20);
		pnlPCObsRef.add(txtPCObsRef);

		JButton btnSiguientePagina = new JButton("Siguiente P\u00E1gina");
		btnSiguientePagina.setBounds(1125, 393, 135, 40);
		pnlPestaña1.add(btnSiguientePagina);

		JPanel pnlPestaña2 = new JPanel();
		tabbedPane.addTab("2.- Ficha Revisión Bloques", null, pnlPestaña2, null);
		pnlPestaña2.setLayout(null);

		JPanel pnlIluminacion = new JPanel();
		pnlIluminacion.setLayout(null);
		pnlIluminacion.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Iluminaci\u00F3n",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlIluminacion.setBounds(10, 11, 371, 156);
		pnlPestaña2.add(pnlIluminacion);

		JLabel lblICaracteristicas = new JLabel(
				"<html><body>Materiales:<br>Luminarias tipo LED.<br>Características:<br>Luminarias tipo "
						+ "LED de al menos 60 W y 5000 lúmenes.<br>Composición:<br>Los conductores de iluminación "
						+ "son de calibre mínimo No. 14AWG THHN flexible, colocados en el interior de manguera "
						+ "flexible anillada metálica, con el espaciamiento de reserva y ventilación acorde a norma.<br>"
						+ "Normativa:<br>La instalación se realiza acorde a los establecido a la norma NEC 384-6 "
						+ "(Código Eléctrico Ecuatoriano).<br>Plano de referencia:  PE-08</body></html>");
		lblICaracteristicas.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblICaracteristicas.setBounds(10, 17, 351, 128);
		pnlIluminacion.add(lblICaracteristicas);

		JPanel pnlIObsRef = new JPanel();
		pnlIObsRef.setLayout(null);
		pnlIObsRef.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlIObsRef.setBounds(382, 17, 177, 47);
		pnlPestaña2.add(pnlIObsRef);

		JLabel lblIObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblIObsRef.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblIObsRef.setBounds(50, 0, 123, 14);
		pnlIObsRef.add(lblIObsRef);

		JRadioButton rdbtnISi = new JRadioButton("");
		rdbtnISi.setBounds(2, 16, 21, 23);
		pnlIObsRef.add(rdbtnISi);

		JRadioButton rdbtnINo = new JRadioButton("");
		rdbtnINo.setBounds(23, 16, 21, 23);
		pnlIObsRef.add(rdbtnINo);

		ButtonGroup grBtnI = new ButtonGroup();
		grBtnI.add(rdbtnISi);
		grBtnI.add(rdbtnINo);

		JLabel lblISi = new JLabel("SI");
		lblISi.setBounds(6, 0, 21, 14);
		pnlIObsRef.add(lblISi);

		JLabel lblINo = new JLabel("NO");
		lblINo.setBounds(25, 0, 21, 14);
		pnlIObsRef.add(lblINo);

		txtIObsRef = new JTextField();
		txtIObsRef.setColumns(10);
		txtIObsRef.setBounds(50, 16, 123, 20);
		pnlIObsRef.add(txtIObsRef);

		JPanel pnlSistFuerza = new JPanel();
		pnlSistFuerza.setLayout(null);
		pnlSistFuerza.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Sistema de Fuerza 110V",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlSistFuerza.setBounds(10, 167, 371, 289);
		pnlPestaña2.add(pnlSistFuerza);

		JLabel lblSFCaracteristicas = new JLabel(
				"<html><body>Materiales:<br>Tomacorrientes tipo doble polarizados, con placas decorativas "
						+ "color blanco del mismo color de la pieza del tomacorriente respectivo. Conductores rígidos "
						+ "revestido de calibres 12 y 14 AWG de tipo THHN. <br>Características:<br>Sistema de fuerza 110V."
						+ "<br>Composición:<br>El sistema de fuerza inicia su cableado en el centro de carga de cada área, "
						+ "el cableado y se lo realiza con conductor rígido revestido de calibre N.- 12 AWG THHN para la fase "
						+ "y el neutro  calibre  N.- 12 AWG THHN, y cable desnudo a tierra #14, mínimo.<br>Los conductores"
						+ " están ubicados dentro de manguera flexible anillada metálica, con el espaciamiento de reserva y "
						+ "ventilación acorde a norma (Código Eléctrico Ecuatoriano, NEC 384-6).<br>Las derivaciones para los "
						+ "demás tomacorrientes, se realizan dentro de cajas de paso dentro del cajetín rectangular profundo "
						+ "que aloja el accesorio del tomacorriente con capacidad de coducción de 15 amperios. Los "
						+ "tomacorrientes tipo doble polarizados, con placas decorativas color blanco del mismo color de la "
						+ "pieza del tomacorriente respectivo.<br>Normativa:<br>La instalación se realiza acorde a los "
						+ "establecido a la norma NEC 384-6 (Código Eléctrico Ecuatoriano).<br>Plano de referencia:PE-05</body></html>");
		lblSFCaracteristicas.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblSFCaracteristicas.setBounds(10, 13, 351, 265);
		pnlSistFuerza.add(lblSFCaracteristicas);

		JPanel pnlSFObsRef = new JPanel();
		pnlSFObsRef.setLayout(null);
		pnlSFObsRef.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlSFObsRef.setBounds(382, 173, 177, 47);
		pnlPestaña2.add(pnlSFObsRef);

		JLabel lblSFObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblSFObsRef.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblSFObsRef.setBounds(50, 0, 123, 14);
		pnlSFObsRef.add(lblSFObsRef);

		JRadioButton rdbtnSFSi = new JRadioButton("");
		rdbtnSFSi.setBounds(2, 16, 21, 23);
		pnlSFObsRef.add(rdbtnSFSi);

		JRadioButton rdbtnSFNo = new JRadioButton("");
		rdbtnSFNo.setBounds(23, 16, 21, 23);
		pnlSFObsRef.add(rdbtnSFNo);

		ButtonGroup grBtnSF = new ButtonGroup();
		grBtnSF.add(rdbtnSFSi);
		grBtnSF.add(rdbtnSFNo);

		JLabel lblSFSi = new JLabel("SI");
		lblSFSi.setBounds(6, 0, 21, 14);
		pnlSFObsRef.add(lblSFSi);

		JLabel lblSFNo = new JLabel("NO");
		lblSFNo.setBounds(25, 0, 21, 14);
		pnlSFObsRef.add(lblSFNo);

		txtSFObsRef = new JTextField();
		txtSFObsRef.setColumns(10);
		txtSFObsRef.setBounds(50, 16, 123, 20);
		pnlSFObsRef.add(txtSFObsRef);

		JPanel pnlWPC = new JPanel();
		pnlWPC.setLayout(null);
		pnlWPC.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"<html><body>Compuesto de madera y pl\u00E1stico (WPC) para piso de m\u00F3dulos</body></html>",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlWPC.setBounds(594, 11, 249, 213);
		pnlPestaña2.add(pnlWPC);

		JLabel lblWPCCaracteristicas = new JLabel(
				"<html><body>Materiales:<br>Módulos conformados por paneles compuestos de madera y plástico (WPC)."
						+ "<br>Características:<br>Soporta las cargas vivas máximas de diseño señaldo en el NEC para su uso. "
						+ "Es impermeable, con una superficie antideslizante, resistente a deformaciones y ralladuras. "
						+ "Es resistente al ataque de insectos y hongos, y ser 100% reciclable. El ensamblado es de tipo "
						+ "machiembrado con click de ancastre.<br>Normativa:<br>Norma NEC 3.<br>"
						+ "Plano de referencia:  PE-08</body></html>");
		lblWPCCaracteristicas.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblWPCCaracteristicas.setBounds(10, 34, 235, 165);
		pnlWPC.add(lblWPCCaracteristicas);

		JPanel pnlWPCObsRef = new JPanel();
		pnlWPCObsRef.setLayout(null);
		pnlWPCObsRef.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlWPCObsRef.setBounds(843, 17, 177, 47);
		pnlPestaña2.add(pnlWPCObsRef);

		JLabel lblWPCObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblWPCObsRef.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblWPCObsRef.setBounds(50, 0, 123, 14);
		pnlWPCObsRef.add(lblWPCObsRef);

		JRadioButton rdbtnWPCSi = new JRadioButton("");
		rdbtnWPCSi.setBounds(2, 16, 21, 23);
		pnlWPCObsRef.add(rdbtnWPCSi);

		JRadioButton rdbtnWPCNo = new JRadioButton("");
		rdbtnWPCNo.setBounds(23, 16, 21, 23);
		pnlWPCObsRef.add(rdbtnWPCNo);

		ButtonGroup grBtnWPC = new ButtonGroup();
		grBtnWPC.add(rdbtnWPCSi);
		grBtnWPC.add(rdbtnWPCNo);

		JLabel lblWPCSi = new JLabel("SI");
		lblWPCSi.setBounds(6, 0, 21, 14);
		pnlWPCObsRef.add(lblWPCSi);

		JLabel lblWPCNo = new JLabel("NO");
		lblWPCNo.setBounds(25, 0, 21, 14);
		pnlWPCObsRef.add(lblWPCNo);

		txtWPCObsRef = new JTextField();
		txtWPCObsRef.setColumns(10);
		txtWPCObsRef.setBounds(50, 16, 123, 20);
		pnlWPCObsRef.add(txtWPCObsRef);

		pnlInformacionObl = new JPanel();
		pnlInformacionObl.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"Informaci\u00F3n Obligatoria", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		pnlInformacionObl.setBounds(875, 201, 396, 244);
		pnlPestaña2.add(pnlInformacionObl);
		pnlInformacionObl.setLayout(null);

		pnlIOEtiquetas1 = new JPanel();
		pnlIOEtiquetas1.setBounds(10, 22, 157, 73);
		pnlInformacionObl.add(pnlIOEtiquetas1);
		pnlIOEtiquetas1.setLayout(new GridLayout(3, 0, 0, 0));

		lblObsGenIzq = new JLabel("Observaciones Generales:");
		pnlIOEtiquetas1.add(lblObsGenIzq);

		lblResponsableMineduc = new JLabel("Responsable MinEduc:");
		pnlIOEtiquetas1.add(lblResponsableMineduc);

		lblCargoIzq = new JLabel("Cargo:");
		pnlIOEtiquetas1.add(lblCargoIzq);

		pnlIOTexts1 = new JPanel();
		pnlIOTexts1.setBounds(166, 22, 220, 73);
		pnlInformacionObl.add(pnlIOTexts1);
		pnlIOTexts1.setLayout(new GridLayout(3, 0, 0, 0));

		txtObsGenIzq = new JTextField();
		txtObsGenIzq.setColumns(10);
		pnlIOTexts1.add(txtObsGenIzq);

		txtResponsableMineduc = new JTextField();
		txtResponsableMineduc.setColumns(10);
		pnlIOTexts1.add(txtResponsableMineduc);

		txtCargoIzq = new JTextField();
		txtCargoIzq.setColumns(10);
		pnlIOTexts1.add(txtCargoIzq);

		pnlIOEtiquetas2 = new JPanel();
		pnlIOEtiquetas2.setBounds(10, 100, 157, 97);
		pnlInformacionObl.add(pnlIOEtiquetas2);
		pnlIOEtiquetas2.setLayout(new GridLayout(4, 0, 0, 0));

		lblObsGenDer = new JLabel("Observaciones Generales:");
		pnlIOEtiquetas2.add(lblObsGenDer);

		lblResponsableContratista = new JLabel("Responsable Contratista:");
		pnlIOEtiquetas2.add(lblResponsableContratista);

		lblCargoDer = new JLabel("Cargo:");
		pnlIOEtiquetas2.add(lblCargoDer);

		lblFecha = new JLabel("Fecha:");
		pnlIOEtiquetas2.add(lblFecha);

		pnlIOTexts2 = new JPanel();
		pnlIOTexts2.setBounds(166, 100, 220, 97);
		pnlInformacionObl.add(pnlIOTexts2);
		pnlIOTexts2.setLayout(new GridLayout(4, 0, 0, 0));

		txtObsGenDer = new JTextField();
		txtObsGenDer.setColumns(10);
		pnlIOTexts2.add(txtObsGenDer);

		txtResponsableContratista = new JTextField();
		txtResponsableContratista.setColumns(10);
		pnlIOTexts2.add(txtResponsableContratista);

		txtCargoDer = new JTextField();
		txtCargoDer.setColumns(10);
		pnlIOTexts2.add(txtCargoDer);

		txtFecha = new JTextField();
		txtFecha.setColumns(10);
		pnlIOTexts2.add(txtFecha);

		JButton btnInsertarFoto = new JButton("Insertar FOTO");
		btnInsertarFoto.setBounds(166, 198, 120, 35);
		pnlInformacionObl.add(btnInsertarFoto);

	}
}
