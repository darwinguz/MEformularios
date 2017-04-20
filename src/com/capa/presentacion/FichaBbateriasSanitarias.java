package com.capa.presentacion;

import static com.capa.util.Utilitarios.cargarInfoObligatoria;
import static com.capa.util.Utilitarios.getPathImagen;
import static com.capa.util.Utilitarios.gettCabecera;
import static com.capa.util.Validaciones.validarInfo;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.capa.datos.TFicha;
import com.capa.datos.TGrupo;
import com.capa.datos.TInformacionObligatoria;
import com.capa.datos.TdetalleFicha;
import com.capa.negocios.ComponenteFicha;
import com.capa.negocios.ComponenteInfoObligatoria;
import com.capa.negocios.Query;
import com.capa.negocios.Reporte;
import com.capa.negocios.ServicioFicha;
import com.capa.negocios.ServicioInfoObligatoria;
import com.capa.util.Utilitarios;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FichaBbateriasSanitarias extends JFrame {

	private static final long serialVersionUID = 6812081295798595025L;
	private JPanel panelPrincipal;
	private JTextField txtObs0;
	private JTextField txtObs1;
	private JTextField txtObs2;
	private JTextField txtObs3;
	private JTextField txtObs4;
	private JTextField txtObs6;
	private JTextField txtObs5;
	private JTextField txtObs7;
	private JTextField txtObs8;
	private JTextField txtObs9;
	private JTextField txtObs10;

	JRadioButton rdBtn00;
	JRadioButton rdBtn01;
	JRadioButton rdBtn10;
	JRadioButton rdBtn11;

	private TInformacionObligatoria infor;
	private ServicioFicha servFicha;
	private TFicha ficha;

	private String fotoInfoObl;
	private JRadioButton rdBtn20;
	private JRadioButton rdBtn21;
	private JRadioButton rdBtn30;
	private JRadioButton rdBtn31;
	private JRadioButton rdBtn40;
	private JRadioButton rdBtn41;
	private JRadioButton rdBtn60;
	private JRadioButton rdBtn61;
	private JRadioButton rdBtn50;
	private JRadioButton rdBtn51;
	private JRadioButton rdBtn70;
	private JRadioButton rdBtn71;
	private JRadioButton rdBtn80;
	private JRadioButton rdBtn81;
	private JRadioButton rdBtn90;
	private JRadioButton rdBtn91;
	private JRadioButton rdBtn100;
	private JRadioButton rdBtn101;

	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// ServicioFicha sf = new ComponenteFicha();
	// TFicha fi = sf.buscarFormulario("FB-S");
	// FichaBbateriasSanitarias frame = new FichaBbateriasSanitarias(fi);
	// frame.setVisible(true);
	// frame.setLocationRelativeTo(null);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	// });
	// }

	/**
	 * Create the frame.
	 */
	public FichaBbateriasSanitarias(TFicha ficha) {
		this.ficha = ficha;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1320, 730);
		this.setTitle(ficha.getFiNombre());
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		setContentPane(panelPrincipal);
		setLocationRelativeTo(null);
		this.setResizable(false);
		servFicha = new ComponenteFicha();

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 125, 1286, 560);
		panelPrincipal.add(tabbedPane);

		JPanel pnlPestaña1 = new JPanel();
		tabbedPane.addTab("1.- " + ficha.getFiDescripcion(), null, pnlPestaña1, null);
		pnlPestaña1.setLayout(null);

		JPanel panel_0 = new JPanel();
		panel_0.setLayout(null);
		panel_0.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Dimensiones",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_0.setBounds(10, 11, 249, 61);
		pnlPestaña1.add(panel_0);

		JLabel lbllargoDelAula = new JLabel(
				"<html>\r\n<body>\r\n<p align=\"justify\">Largo del aula: 6,00 m\r\n<br>Ancho del aula: 4,60 m\r\n<br>Altura del aula:  M\u00EDnima: 2,70 m, M\u00E1xima: 3,00 m \r\n</p>\r\n</body>\r\n</html>");
		lbllargoDelAula.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lbllargoDelAula.setBounds(10, 13, 235, 45);
		panel_0.add(lbllargoDelAula);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(284, 14, 139, 58);
		pnlPestaña1.add(panel_1);

		JLabel label_1 = new JLabel("Observaci\u00F3n/Referencia");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_1.setBounds(10, 19, 123, 14);
		panel_1.add(label_1);

		rdBtn00 = new JRadioButton("");
		rdBtn00.setBounds(31, 2, 21, 23);
		panel_1.add(rdBtn00);

		rdBtn01 = new JRadioButton("");
		rdBtn01.setBounds(81, 2, 21, 23);
		panel_1.add(rdBtn01);

		ButtonGroup grupoBotonD = new ButtonGroup();
		grupoBotonD.add(rdBtn00);
		grupoBotonD.add(rdBtn01);

		JLabel label_2 = new JLabel("SI");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_2.setBounds(10, 5, 21, 14);
		panel_1.add(label_2);

		JLabel label_3 = new JLabel("NO");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_3.setBounds(108, 5, 21, 14);
		panel_1.add(label_3);

		txtObs0 = new JTextField();
		txtObs0.setColumns(10);
		txtObs0.setBounds(10, 32, 123, 20);
		panel_1.add(txtObs0);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Piezas Sanitarias",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(10, 77, 249, 117);
		pnlPestaña1.add(panel_2);

		JLabel lblBaterasmujeres = new JLabel(
				"<html>\r\n<body>\r\n<p align=\"justify\">6 Bater\u00EDas: \r\n<br>MUJERES: 3 inodoros - 2 lavamanos\r\n<br>HOMBRES: 2 inodoros - 2 urinarios - 2 lavamanos\r\n<br>1 Ba\u00F1o administrativo: \r\n<br>MUJERES: 2 inodoros - 1 lavamanos\r\n<br>HOMBRES: 1 inodoro - 1 urinario - 1 lavamanos\r\n<br>2 Bater\u00EDas Educaci\u00F3n Inicial: \r\n<br>MUJERES: 2 inodoros - 2 lavamanos\r\n<br>HOMBRES: 2 inodoro - 2 lavamanos\r\n</p>\r\n</body>\r\n</html>");
		lblBaterasmujeres.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblBaterasmujeres.setBounds(10, 13, 235, 99);
		panel_2.add(lblBaterasmujeres);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(284, 84, 139, 58);
		pnlPestaña1.add(panel_3);

		JLabel label = new JLabel("Observaci\u00F3n/Referencia");
		label.setFont(new Font("Tahoma", Font.BOLD, 10));
		label.setBounds(10, 19, 123, 14);
		panel_3.add(label);

		rdBtn10 = new JRadioButton("");
		rdBtn10.setBounds(31, 2, 21, 23);
		panel_3.add(rdBtn10);

		rdBtn11 = new JRadioButton("");
		rdBtn11.setBounds(81, 2, 21, 23);
		panel_3.add(rdBtn11);

		ButtonGroup grupoBoton1 = new ButtonGroup();
		grupoBoton1.add(rdBtn10);
		grupoBoton1.add(rdBtn11);

		JLabel label_4 = new JLabel("SI");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_4.setBounds(10, 5, 21, 14);
		panel_3.add(label_4);

		JLabel label_5 = new JLabel("NO");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_5.setBounds(108, 5, 21, 14);
		panel_3.add(label_5);

		txtObs1 = new JTextField();
		txtObs1.setColumns(10);
		txtObs1.setBounds(10, 32, 123, 20);
		panel_3.add(txtObs1);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Bases pre-fabricadas",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(10, 200, 249, 62);
		pnlPestaña1.add(panel_4);

		JLabel lblmateriallosElementos = new JLabel(
				"<html>\r\n<body>\r\n<p align=\"justify\">Material: \r\n<br>Los elementos de base son prefabricados, con hormig\u00F3n premezclado con una resisitencia m\u00EDnima de 210 kg/cm2.\r\n<br>Plano de referencia:  No. E1\r\n</p>\r\n</body>\r\n</html>");
		lblmateriallosElementos.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblmateriallosElementos.setBounds(10, 13, 235, 46);
		panel_4.add(lblmateriallosElementos);

		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(284, 204, 139, 58);
		pnlPestaña1.add(panel_5);

		JLabel label_6 = new JLabel("Observaci\u00F3n/Referencia");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_6.setBounds(10, 19, 123, 14);
		panel_5.add(label_6);

		rdBtn20 = new JRadioButton("");
		rdBtn20.setBounds(31, 2, 21, 23);
		panel_5.add(rdBtn20);

		rdBtn21 = new JRadioButton("");
		rdBtn21.setBounds(81, 2, 21, 23);
		panel_5.add(rdBtn21);

		ButtonGroup grupoBoton2 = new ButtonGroup();
		grupoBoton2.add(rdBtn20);
		grupoBoton2.add(rdBtn21);

		JLabel label_7 = new JLabel("SI");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_7.setBounds(10, 5, 21, 14);
		panel_5.add(label_7);

		JLabel label_8 = new JLabel("NO");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_8.setBounds(108, 5, 21, 14);
		panel_5.add(label_8);

		txtObs2 = new JTextField();
		txtObs2.setColumns(10);
		txtObs2.setBounds(10, 32, 123, 20);
		panel_5.add(txtObs2);

		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Estructura met\u00E1lica Steel",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_6.setBounds(10, 269, 249, 256);
		pnlPestaña1.add(panel_6);

		JLabel lblmaterialesestructuraMetlica = new JLabel(
				"<html>\r\n<body>\r\n<p align=\"justify\">Materiales: Estructura met\u00E1lica Steel Framing (sistema prefabricado de armado para la cubierta y contrapiso), perfiles metalicos galvanizados, laminados en frio normados por los est\u00E1ndares del Instituto Americano de Hierro y Acero AISI (por sus siglas en ingl\u00E9s).\r\n<br>Dimensiones m\u00EDnimas: Cada estructura met\u00E1lica est\u00E1 conformada por perfiles tipo G con dimensiones variables de 100 mm a 200 mm de alto, 40 mm de ala y 17 mm de aleta (m\u00EDnimo) y perfiles tipo U de 100 mm a 200 mm de altura, 35 mm de alma (m\u00EDnimo) con espesores de placa  entre 0,93 - 1,64 mm, laminados en frio, los cuales est\u00E1n utilizados en funci\u00F3n del elemento a soportar y se ensamblan entre s\u00ED utilizando su respectiva tuerca y perno galvanizado.\r\n<br>El proceso de ensamblado es realizado en sitio y es agrupado dependiendo de la funci\u00F3n de la estructura y su acoplamiento. \r\n<br>Normativa: La estructura es capaz de soportar acciones horizontales y verticales de acuerdo a lo se\u00F1alado en la Norma T\u00E9cnica Ecuatoriana (NEC14).\r\n<br>Plano de referencia:  No. E1\r\n</p>\r\n</body>\r\n</html>");
		lblmaterialesestructuraMetlica.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblmaterialesestructuraMetlica.setBounds(10, 13, 235, 232);
		panel_6.add(lblmaterialesestructuraMetlica);

		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_7.setBounds(284, 275, 139, 58);
		pnlPestaña1.add(panel_7);

		JLabel label_9 = new JLabel("Observaci\u00F3n/Referencia");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_9.setBounds(10, 19, 123, 14);
		panel_7.add(label_9);

		rdBtn30 = new JRadioButton("");
		rdBtn30.setBounds(31, 2, 21, 23);
		panel_7.add(rdBtn30);

		rdBtn31 = new JRadioButton("");
		rdBtn31.setBounds(81, 2, 21, 23);
		panel_7.add(rdBtn31);

		ButtonGroup grupoBoton3 = new ButtonGroup();
		grupoBoton3.add(rdBtn30);
		grupoBoton3.add(rdBtn31);

		JLabel label_10 = new JLabel("SI");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_10.setBounds(10, 5, 21, 14);
		panel_7.add(label_10);

		JLabel label_11 = new JLabel("NO");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_11.setBounds(108, 5, 21, 14);
		panel_7.add(label_11);

		txtObs3 = new JTextField();
		txtObs3.setColumns(10);
		txtObs3.setBounds(10, 32, 123, 20);
		panel_7.add(txtObs3);

		JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"Paneles de pared con alma de EPS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_15.setBounds(433, 11, 249, 251);
		pnlPestaña1.add(panel_15);

		JLabel lbllargoDelAula_1 = new JLabel(
				"<html>\r\n<body>\r\n<p align=\"justify\">Largo del aula: 6,00 m\r\n<br>Materiales:  Acero galvanizado pre pintado de acuerdo a dise\u00F1o arquitect\u00F3nico en 0,5 mm de grosor seg\u00FAn norma ASTM.\r\n<br>EPS: Poliestireno expandido con retardante al fuego tipo F.\r\n<br>Las paredes son conformadas por un panel s\u00E1ndwich formado por un n\u00FAcleo aislante t\u00E9rmico de espuma r\u00EDgida de poliestireno expandido (EPS) con retardante de fuego, adem\u00E1s de un recubrimiento en ambas caras de plancha met\u00E1lica.\r\n<br>Dimensiones m\u00EDnimas:  Los paneles de EPS son de medidas m\u00EDnimo de: 1,00 - 1,20 mts de ancho y de espesor de 100 mm, con una densidad entre 18 - 20 kg/m3.\r\n<br>Composici\u00F3n: Los paneles son termo ac\u00FAsticos, auto portantes, durables, inoxidables.\r\n<br>Normativa: Los paneles para paredes tienen la capacidad de resisitrir acciones horizontales y verticales de acuerdo a lo se\u00F1alado en el NEC2014.\r\n<br>Plano de referencia:  No. E1\r\n</p>\r\n</body>\r\n</html>");
		lbllargoDelAula_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lbllargoDelAula_1.setBounds(10, 13, 235, 238);
		panel_15.add(lbllargoDelAula_1);

		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_8.setBounds(707, 18, 139, 58);
		pnlPestaña1.add(panel_8);

		JLabel label_13 = new JLabel("Observaci\u00F3n/Referencia");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_13.setBounds(10, 19, 123, 14);
		panel_8.add(label_13);

		rdBtn40 = new JRadioButton("");
		rdBtn40.setBounds(31, 2, 21, 23);
		panel_8.add(rdBtn40);

		rdBtn41 = new JRadioButton("");
		rdBtn41.setBounds(81, 2, 21, 23);
		panel_8.add(rdBtn41);

		ButtonGroup grupoBoton4 = new ButtonGroup();
		grupoBoton4.add(rdBtn40);
		grupoBoton4.add(rdBtn41);

		JLabel label_14 = new JLabel("SI");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_14.setBounds(10, 5, 21, 14);
		panel_8.add(label_14);

		JLabel label_15 = new JLabel("NO");
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_15.setBounds(108, 5, 21, 14);
		panel_8.add(label_15);

		txtObs4 = new JTextField();
		txtObs4.setColumns(10);
		txtObs4.setBounds(10, 32, 123, 20);
		panel_8.add(txtObs4);

		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Panel de cubierta con EPS",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_9.setBounds(858, 11, 249, 251);
		pnlPestaña1.add(panel_9);

		JLabel lblmaterialeselPanel = new JLabel(
				"<html>\r\n<body>\r\n<p align=\"justify\">Materiales: \r\n<br>El panel consta de materiales:\r\n<br>Acero: Acero galvanizado pre pintado de acuerdo a dise\u00F1o arquitect\u00F3nico y disponibilidad de colores de acuerdo, en  0,5 mm de grosor seg\u00FAn norma ASTM.\r\n<br>EPS: Poliestireno expandido con retardante al fuego tipo F.\r\n<br>Dimensiones m\u00EDnimas:  El panel de cubierta EPS (panel prefabricado de poliestireno con retardante al fuego) est\u00E1 compuesto por m\u00F3dulos de 1,00 a 1,20 mts de ancho y de espesor m\u00EDnimo de 100 mm, con una densidad entre 18-20 kg/m3.\r\n<br>Composici\u00F3n:  Los paneles son termoc\u00FAsticos, auto portantes, durables, inoxidables.\r\n<br>Normativa: Los paneles de cubierta tienen la capacidad de resisitrir acciones horizontales y verticales de acuerdo a lo se\u00F1alado en el NEC2014.\r\n<br>Plano de referencia:  No. E1\t\r\n</p>\r\n</body>\r\n</html>");
		lblmaterialeselPanel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblmaterialeselPanel.setBounds(10, 13, 235, 227);
		panel_9.add(lblmaterialeselPanel);

		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_10.setBounds(1132, 18, 139, 58);
		pnlPestaña1.add(panel_10);

		JLabel label_17 = new JLabel("Observaci\u00F3n/Referencia");
		label_17.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_17.setBounds(10, 19, 123, 14);
		panel_10.add(label_17);

		rdBtn60 = new JRadioButton("");
		rdBtn60.setBounds(31, 2, 21, 23);
		panel_10.add(rdBtn60);

		rdBtn61 = new JRadioButton("");
		rdBtn61.setBounds(81, 2, 21, 23);
		panel_10.add(rdBtn61);

		ButtonGroup grupoBoton6 = new ButtonGroup();
		grupoBoton6.add(rdBtn60);
		grupoBoton6.add(rdBtn61);

		JLabel label_18 = new JLabel("SI");
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_18.setBounds(10, 5, 21, 14);
		panel_10.add(label_18);

		JLabel label_19 = new JLabel("NO");
		label_19.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_19.setBounds(108, 5, 21, 14);
		panel_10.add(label_19);

		txtObs6 = new JTextField();
		txtObs6.setColumns(10);
		txtObs6.setBounds(10, 32, 123, 20);
		panel_10.add(txtObs6);

		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ventanas de UPVC",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_11.setBounds(433, 269, 249, 256);
		pnlPestaña1.add(panel_11);

		JLabel lbllargoDelAula_2 = new JLabel(
				"<html>\r\n<body>\r\n<p align=\"justify\">Largo del aula: 6,00 m\r\n<br>Materiales:  UPVC (Policloruro de vinilo sin plastificar).\r\n<br>Dimensiones m\u00EDnimas: Las ventanas en los m\u00F3dulos de ba\u00F1os son de 0,45 X 2 mts y/o de 0,45 X 1 mt.\r\n<br>Composici\u00F3n:  La ventanear\u00EDa de los m\u00F3dulos es corrediza en perfiles de UPVC, con todos los sistemas de fijaci\u00F3n, anclaje y seguridad que se requiere.\r\n<br>El marco de la ventana es elaborada con canal C met\u00E1lico galvanizado laminado en frio, Steel Framing bajo los est\u00E1ndares del Instituto americano de Hierro y Acero AISI. \r\n<br>El anclaje es realizado con tornillos autorroscantes directamente al panel EPS.\r\n<br>Normativa: Instituto americano de Hierro y Acero AISI.\r\n<br>Plano de referencia:  No. E1\"\t\t\t\t\t\r\n</p>\r\n</body>\r\n</html>");
		lbllargoDelAula_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lbllargoDelAula_2.setBounds(10, 13, 235, 235);
		panel_11.add(lbllargoDelAula_2);

		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_12.setBounds(707, 276, 139, 58);
		pnlPestaña1.add(panel_12);

		JLabel label_21 = new JLabel("Observaci\u00F3n/Referencia");
		label_21.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_21.setBounds(10, 19, 123, 14);
		panel_12.add(label_21);

		rdBtn50 = new JRadioButton("");
		rdBtn50.setBounds(31, 2, 21, 23);
		panel_12.add(rdBtn50);

		rdBtn51 = new JRadioButton("");
		rdBtn51.setBounds(81, 2, 21, 23);
		panel_12.add(rdBtn51);

		ButtonGroup grupoBoton5 = new ButtonGroup();
		grupoBoton5.add(rdBtn50);
		grupoBoton5.add(rdBtn51);

		JLabel label_22 = new JLabel("SI");
		label_22.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_22.setBounds(10, 5, 21, 14);
		panel_12.add(label_22);

		JLabel label_23 = new JLabel("NO");
		label_23.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_23.setBounds(108, 5, 21, 14);
		panel_12.add(label_23);

		txtObs5 = new JTextField();
		txtObs5.setColumns(10);
		txtObs5.setBounds(10, 32, 123, 20);
		panel_12.add(txtObs5);

		JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"<html><body>Compuesto de madera y pl\u00E1stico <br>(WPC) para piso de m\u00F3dulos</body></html>",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_13.setBounds(858, 269, 249, 256);
		pnlPestaña1.add(panel_13);

		JLabel lblmaterialesmdulosConformados = new JLabel(
				"<html>\r\n<body>\r\n<p align=\"justify\">Materiales: \r\n<br>M\u00F3dulos conformados por paneles compuestos de madera y pl\u00E1stico (WPC).\r\n<br>Caracter\u00EDsticas:  \r\n<br>Es impermeable y presenta una superficie antideslizante, resistente a deformaciones y ralladuras.\r\n<br>Es resistente al ataque de insectos y hongos, y es 100% reciclable.\r\n<br>El ensamblado es de tipo machiembrado con click de ancastre.\r\n<br>Normativa: Soporta las cargas vivas m\u00E1ximas de dise\u00F1o se\u00F1alado en el NEC2014 para su uso..\r\n<br>Plano de referencia:  PE-08\"\t\r\n</p>\r\n</body>\r\n</html>");
		lblmaterialesmdulosConformados.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblmaterialesmdulosConformados.setBounds(10, 13, 235, 232);
		panel_13.add(lblmaterialesmdulosConformados);

		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_14.setBounds(1132, 284, 139, 58);
		pnlPestaña1.add(panel_14);

		JLabel label_25 = new JLabel("Observaci\u00F3n/Referencia");
		label_25.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_25.setBounds(10, 19, 123, 14);
		panel_14.add(label_25);

		rdBtn70 = new JRadioButton("");
		rdBtn70.setBounds(31, 2, 21, 23);
		panel_14.add(rdBtn70);

		rdBtn71 = new JRadioButton("");
		rdBtn71.setBounds(81, 2, 21, 23);
		panel_14.add(rdBtn71);

		ButtonGroup grupoBoton7 = new ButtonGroup();
		grupoBoton7.add(rdBtn70);
		grupoBoton7.add(rdBtn71);

		JLabel label_26 = new JLabel("SI");
		label_26.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_26.setBounds(10, 5, 21, 14);
		panel_14.add(label_26);

		JLabel label_27 = new JLabel("NO");
		label_27.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_27.setBounds(108, 5, 21, 14);
		panel_14.add(label_27);

		txtObs7 = new JTextField();
		txtObs7.setColumns(10);
		txtObs7.setBounds(10, 32, 123, 20);
		panel_14.add(txtObs7);

		JPanel pnlPestaña2 = new JPanel();
		tabbedPane.addTab("2.- " + ficha.getFiDescripcion(), null, pnlPestaña2, null);
		pnlPestaña2.setLayout(null);

		JPcabecera cabecera = new JPcabecera();
		panelPrincipal.add(cabecera.getCabecera());
		Utilitarios.llenarCabecera(cabecera);

		JPinformacionObligatoria infoObligatoria = new JPinformacionObligatoria(552, 155);
		infoObligatoria.getBtnInsertarFoto().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				fotoInfoObl = getPathImagen();
			}
		});
		pnlPestaña2.add(infoObligatoria.getPnlInformacionObl());

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Iluminaci\u00F3n",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 249, 181);
		pnlPestaña2.add(panel);

		JLabel lblmaterialesluminariasTipo = new JLabel(
				"<html>\r\n<body>\r\n<p align=\"justify\">Materiales: \r\n<br>Luminarias tipo LED.\r\n<br>Caracter\u00EDsticas:  Luminarias tipo LED de al menos 60 W y 5000 l\u00FAmenes.\r\n<br>Composici\u00F3n:  Los conductores de iluminaci\u00F3n son de calibre m\u00EDnimo No. 14AWG THHN flexible y adicionalmente tienen un cable desnudo a tierra del mismo calibre, colocados en el interior de manguera flexible anillada met\u00E1lica, con el espaciamiento de reserva y ventilaci\u00F3n acorde a norma.\r\n<br>Normativa: La instalaci\u00F3n se realiza acorde a los establecido a la norma NEC 384-6 (C\u00F3digo El\u00E9ctrico Ecuatoriano).\r\n<br>Plano de referencia:  PE-08\r\n</p>\r\n</body>\r\n</html>");
		lblmaterialesluminariasTipo.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblmaterialesluminariasTipo.setBounds(10, 13, 235, 160);
		panel.add(lblmaterialesluminariasTipo);

		JPanel panel_17 = new JPanel();
		panel_17.setBounds(10, 210, 249, 150);
		pnlPestaña2.add(panel_17);
		panel_17.setLayout(null);
		panel_17.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Inodoro", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(0, 0, 0)));

		JLabel lblcaractersticaslosInodoros = new JLabel(
				"<html>\r\n<body>\r\n<p align=\"justify\">Caracter\u00EDsticas: \r\n<br>Los inodoros cumplen con las especificaciones de la norma NTE INEN 1571: Artefectos sanitarios.\r\n<br>La grifer\u00EDa cumpe con las normas NTE INEN: 602, 950, 967, 968, 969 y las establecidas ASTM en las referidas normas.\r\n<br>Normativa:  NTE INEN 1571: Artefactos sanitarios, NTE INEN:602, 950, 967, 968, 969 y las establecidas ASTM en las referidas normas.\r\n<br>Plano de referencia: PE-05\r\n</p>\r\n</body>\r\n</html>");
		lblcaractersticaslosInodoros.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblcaractersticaslosInodoros.setBounds(10, 13, 235, 126);
		panel_17.add(lblcaractersticaslosInodoros);

		JPanel panel_16 = new JPanel();
		panel_16.setLayout(null);
		panel_16.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_16.setBounds(284, 19, 139, 58);
		pnlPestaña2.add(panel_16);

		JLabel label_16 = new JLabel("Observaci\u00F3n/Referencia");
		label_16.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_16.setBounds(10, 19, 123, 14);
		panel_16.add(label_16);

		rdBtn80 = new JRadioButton("");
		rdBtn80.setBounds(31, 2, 21, 23);
		panel_16.add(rdBtn80);

		rdBtn81 = new JRadioButton("");
		rdBtn81.setBounds(81, 2, 21, 23);
		panel_16.add(rdBtn81);

		ButtonGroup grupoBoton8 = new ButtonGroup();
		grupoBoton8.add(rdBtn80);
		grupoBoton8.add(rdBtn81);

		JLabel label_20 = new JLabel("SI");
		label_20.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_20.setBounds(10, 5, 21, 14);
		panel_16.add(label_20);

		JLabel label_24 = new JLabel("NO");
		label_24.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_24.setBounds(108, 5, 21, 14);
		panel_16.add(label_24);

		txtObs8 = new JTextField();
		txtObs8.setColumns(10);
		txtObs8.setBounds(10, 32, 123, 20);
		panel_16.add(txtObs8);

		JPanel panel_18 = new JPanel();
		panel_18.setLayout(null);
		panel_18.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_18.setBounds(284, 215, 139, 58);
		pnlPestaña2.add(panel_18);

		JLabel label_29 = new JLabel("Observaci\u00F3n/Referencia");
		label_29.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_29.setBounds(10, 19, 123, 14);
		panel_18.add(label_29);

		rdBtn90 = new JRadioButton("");
		rdBtn90.setBounds(31, 2, 21, 23);
		panel_18.add(rdBtn90);

		rdBtn91 = new JRadioButton("");
		rdBtn91.setBounds(81, 2, 21, 23);
		panel_18.add(rdBtn91);

		ButtonGroup grupoBoton9 = new ButtonGroup();
		grupoBoton9.add(rdBtn90);
		grupoBoton9.add(rdBtn91);

		JLabel label_30 = new JLabel("SI");
		label_30.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_30.setBounds(10, 5, 21, 14);
		panel_18.add(label_30);

		JLabel label_31 = new JLabel("NO");
		label_31.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_31.setBounds(108, 5, 21, 14);
		panel_18.add(label_31);

		txtObs9 = new JTextField();
		txtObs9.setColumns(10);
		txtObs9.setBounds(10, 32, 123, 20);
		panel_18.add(txtObs9);

		JPanel panel_19 = new JPanel();
		panel_19.setLayout(null);
		panel_19.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Urinarios",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_19.setBounds(10, 371, 249, 150);
		pnlPestaña2.add(panel_19);

		JLabel lblcaractersticaslosUrinarios = new JLabel(
				"<html>\r\n<body>\r\n<p align=\"justify\">Caracter\u00EDsticas: \r\n<br>Los urinarios cumplen con las especificaciones de la norma NTE INEN 1571: Artefectos sanitarios.\r\n<br>La grifer\u00EDa cumpe con las normas NTE INEN: 602, 950, 967, 968, 969 y las establecidas ASTM en las referidas normas.\r\n<br>Normativa:  NTE INEN 1571: Artefactos sanitarios, NTE INEN:602, 950, 967, 968, 969 y las establecidas ASTM en las referidas normas.\r\n<br>Plano de referencia: PE-05\r\n</p>\r\n</body>\r\n</html>");
		lblcaractersticaslosUrinarios.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblcaractersticaslosUrinarios.setBounds(10, 13, 235, 126);
		panel_19.add(lblcaractersticaslosUrinarios);

		JPanel panel_20 = new JPanel();
		panel_20.setLayout(null);
		panel_20.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_20.setBounds(284, 379, 139, 58);
		pnlPestaña2.add(panel_20);

		JLabel label_33 = new JLabel("Observaci\u00F3n/Referencia");
		label_33.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_33.setBounds(10, 19, 123, 14);
		panel_20.add(label_33);

		rdBtn100 = new JRadioButton("");
		rdBtn100.setBounds(31, 2, 21, 23);
		panel_20.add(rdBtn100);

		rdBtn101 = new JRadioButton("");
		rdBtn101.setBounds(81, 2, 21, 23);
		panel_20.add(rdBtn101);

		ButtonGroup grupoBoton11 = new ButtonGroup();
		grupoBoton11.add(rdBtn100);
		grupoBoton11.add(rdBtn101);

		JLabel label_34 = new JLabel("SI");
		label_34.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_34.setBounds(10, 5, 21, 14);
		panel_20.add(label_34);

		JLabel label_35 = new JLabel("NO");
		label_35.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_35.setBounds(108, 5, 21, 14);
		panel_20.add(label_35);

		txtObs10 = new JTextField();
		txtObs10.setColumns(10);
		txtObs10.setBounds(10, 32, 123, 20);
		panel_20.add(txtObs10);

		cabecera.getBtnRegistrar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				ServicioInfoObligatoria srvInfoOblig = new ComponenteInfoObligatoria();

				infor = cargarInfoObligatoria(infoObligatoria);
				infor.setIoFotoPath(fotoInfoObl);
				infor.setIoSerial(srvInfoOblig.serialInfoOblMax());
				if (validarInfo(infor)) {
					srvInfoOblig.crear(infor);
					servFicha.guardarFichaB(cargarFicha());
					HashMap<String, Object> parametros = new HashMap<String, Object>();
					parametros.put("serial_cabecera", Utilitarios.gettCabecera().getCSerial());
					parametros.put("serial_ficha", ficha.getFiSerial());

					Reporte reporte = new Reporte("Reporte Baterías Sanitarias", 280, 10, 850, 750);
					InputStream path = AlInicio.class.getResourceAsStream("/com/capa/templates/MA.jasper");
					reporte.cargarReporte(path, parametros, Query.getMysql().getConexion());
					reporte.setVisible(true);
					new FichaB().setVisible(true);
					dispose();

				} else {
					JOptionPane.showMessageDialog(null, "Ingresar datos en Información Obligatoria");
				}
			}
		});

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				new FichaB().setVisible(true);
				dispose();
			}
		});

	}

	public List<TdetalleFicha> cargarFicha() {
		List<TdetalleFicha> listaDetalles = new LinkedList<>();
		TGrupo grupoTmp = servFicha.buscarGrupo("Dimensiones");
		String observacion, desicion = "";
		Integer updateFicha = servFicha.nActualizacionFicha(gettCabecera(), ficha);
		if (updateFicha == -1) {
			updateFicha = 0;
		} else {
			updateFicha++;
		}
		observacion = txtObs0.getText();
		if (rdBtn00.isSelected()) {
			desicion = "SI";
		} else if (rdBtn01.isSelected()) {
			desicion = "NO";
		}
		listaDetalles
				.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, updateFicha, observacion, desicion));

		grupoTmp = servFicha.buscarGrupo("Piezas sanitarias");
		observacion = txtObs1.getText();
		if (rdBtn10.isSelected()) {
			desicion = "SI";
		} else if (rdBtn11.isSelected()) {
			desicion = "NO";
		}
		listaDetalles
				.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, updateFicha, observacion, desicion));

		grupoTmp = servFicha.buscarGrupo("Bases prefabricadas");
		observacion = txtObs2.getText();
		if (rdBtn20.isSelected()) {
			desicion = "SI";
		} else if (rdBtn21.isSelected()) {
			desicion = "NO";
		}
		listaDetalles
				.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, updateFicha, observacion, desicion));

		grupoTmp = servFicha.buscarGrupo("Estructura metálica Steel");
		observacion = txtObs3.getText();
		if (rdBtn30.isSelected()) {
			desicion = "SI";
		} else if (rdBtn31.isSelected()) {
			desicion = "NO";
		}
		listaDetalles
				.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, updateFicha, observacion, desicion));

		grupoTmp = servFicha.buscarGrupo("Paneles de pared con alma de EPS");
		observacion = txtObs4.getText();
		if (rdBtn40.isSelected()) {
			desicion = "SI";
		} else if (rdBtn41.isSelected()) {
			desicion = "NO";
		}
		listaDetalles
				.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, updateFicha, observacion, desicion));

		grupoTmp = servFicha.buscarGrupo("Ventana de UPVC");
		observacion = txtObs5.getText();
		if (rdBtn50.isSelected()) {
			desicion = "SI";
		} else if (rdBtn51.isSelected()) {
			desicion = "NO";
		}
		listaDetalles
				.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, updateFicha, observacion, desicion));

		grupoTmp = servFicha.buscarGrupo("Panel de cubierta con EPS");
		observacion = txtObs6.getText();
		if (rdBtn60.isSelected()) {
			desicion = "SI";
		} else if (rdBtn61.isSelected()) {
			desicion = "NO";
		}
		listaDetalles
				.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, updateFicha, observacion, desicion));

		grupoTmp = servFicha.buscarGrupo("Compuesto de madera y plástico");
		observacion = txtObs7.getText();
		if (rdBtn70.isSelected()) {
			desicion = "SI";
		} else if (rdBtn71.isSelected()) {
			desicion = "NO";
		}
		listaDetalles
				.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, updateFicha, observacion, desicion));

		grupoTmp = servFicha.buscarGrupo("Iluminación");
		observacion = txtObs8.getText();
		if (rdBtn80.isSelected()) {
			desicion = "SI";
		} else if (rdBtn81.isSelected()) {
			desicion = "NO";
		}
		listaDetalles
				.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, updateFicha, observacion, desicion));

		grupoTmp = servFicha.buscarGrupo("Inodoro");
		observacion = txtObs9.getText();
		if (rdBtn90.isSelected()) {
			desicion = "SI";
		} else if (rdBtn91.isSelected()) {
			desicion = "NO";
		}
		listaDetalles
				.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, updateFicha, observacion, desicion));

		grupoTmp = servFicha.buscarGrupo("Urinarios");
		observacion = txtObs10.getText();
		if (rdBtn100.isSelected()) {
			desicion = "SI";
		} else if (rdBtn101.isSelected()) {
			desicion = "NO";
		}
		listaDetalles
				.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, updateFicha, observacion, desicion));

		return listaDetalles;
	}
}
