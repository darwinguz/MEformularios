package com.capa.presentacion;

import static com.capa.util.Utilitarios.*;
import static com.capa.util.Validaciones.validarInfo;
import static com.capa.util.Constantes.*;

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
import javax.swing.SwingConstants;

public class FichaBrecreacionExteriores extends JFrame {

	private static final long serialVersionUID = -5853152116433473591L;
	private JPanel panelPrincipal;
	private JTextField txtObs1;
	private JTextField txtObs0;
	private JTextField txtObs2;

	private TFicha ficha;
	private String fotoInfoObl;
	private TInformacionObligatoria infor;
	private ServicioFicha servFicha;

	private JRadioButton rdBtn00;
	private JRadioButton rdBtn01;
	private JRadioButton rdBtn10;
	private JRadioButton rdBtn11;
	private JRadioButton rdBtn20;
	private JRadioButton rdBtn21;

	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// FichaBrecreacionExteriores frame = new FichaBrecreacionExteriores();
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
	public FichaBrecreacionExteriores(TFicha tFicha) {
		this.ficha = tFicha;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1320, 730);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		setContentPane(panelPrincipal);
		setLocationRelativeTo(null);
		this.setTitle(ficha.getFiNombre());
		this.setResizable(false);

		servFicha = new ComponenteFicha();

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 125, 1286, 560);
		panelPrincipal.add(tabbedPane);

		JPanel pnlPestaña1 = new JPanel();
		tabbedPane.addTab("1.- Ficha Recreaci�n-Exteriores", null, pnlPestaña1, null);
		pnlPestaña1.setLayout(null);

		JPcabecera cabecera = new JPcabecera();
		panelPrincipal.add(cabecera.getCabecera());
		Utilitarios.llenarCabecera(cabecera);

		JPinformacionObligatoria infoObligatoria = new JPinformacionObligatoria(860, 320);
		infoObligatoria.getBtnInsertarFoto().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				fotoInfoObl = getPathImagen();
			}
		});
		pnlPestaña1.add(infoObligatoria.getPnlInformacionObl());

		JPanel panel_0 = new JPanel();
		panel_0.setLayout(null);
		panel_0.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Superficie",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_0.setBounds(10, 11, 249, 360);
		pnlPestaña1.add(panel_0);

		JLabel lbl_1 = new JLabel(
				"<html>\r\n<body>\r\n<p align=\"justify\">\r\nEl material aplicado en la superficie de las canchas es de tipo EPDM TERPOL\u00CDMERO ETILENO PROPILENO (DIENO),  una combicaci\u00F3n de gr\u00E1nulos y una capa de acolchonamiento de caucho reciclado utilizando un pol\u00EDmero espolvoreado en sitio que provee una superficie que brinde una alta protecci\u00F3n contra ca\u00EDdas cr\u00EDticas en sitios de juegos infantiles.\r\n<br>Dimensiones m\u00EDnimas e instalaci\u00F3n:<br>La superficie granular para juegos en canchas deportivas:\r\n<br>Es colococada sobre un contrapiso de al menos 7 cm.\r\n<br>El asfalto sint\u00E9tico termo fundido se aplica con una capa m\u00EDnima de SBR de 8 mm en la base y sobre esta la capa de EPDM con el color de la superficie de al menos de 5 mm de espesor.\r\n<br>Es resistente al calor, libre de materiales t\u00F3xicos, resistente a los rayos UV, no cristalizarse y con un durabilidad garantizada de al menos 10 a\u00F1os.\r\n</p>\r\n</body>\r\n</html>");
		lbl_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_1.setBounds(10, 13, 235, 336);
		panel_0.add(lbl_1);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(284, 18, 139, 104);
		pnlPestaña1.add(panel_1);

		JLabel label_1 = new JLabel("Observaci\u00F3n/Referencia");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_1.setBounds(8, 57, 123, 14);
		panel_1.add(label_1);

		rdBtn00 = new JRadioButton("");
		rdBtn00.setBounds(44, 27, 21, 23);
		panel_1.add(rdBtn00);

		rdBtn01 = new JRadioButton("");
		rdBtn01.setBounds(65, 27, 21, 23);
		panel_1.add(rdBtn01);

		ButtonGroup grupoBoton0 = new ButtonGroup();
		grupoBoton0.add(rdBtn00);
		grupoBoton0.add(rdBtn01);

		JLabel label_2 = new JLabel("SI");
		label_2.setBounds(48, 11, 21, 14);
		panel_1.add(label_2);

		JLabel label_3 = new JLabel("NO");
		label_3.setBounds(67, 11, 21, 14);
		panel_1.add(label_3);

		txtObs0 = new JTextField();
		txtObs0.setColumns(10);
		txtObs0.setBounds(8, 71, 123, 20);
		panel_1.add(txtObs0);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cerramiento perimetral",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(433, 11, 249, 360);
		pnlPestaña1.add(panel_2);

		JLabel lbl_2 = new JLabel(
				"<html>\r\n<body>\r\n<p align=\"justify\">\r\n\"Materiales: \r\n<br>Paneles prefabricados a a base de fibras pl\u00E1sticas conformadas por tablones WPC (madera y pl\u00E1stico) , resistentes a rayos ultravioletas y asegurar una durabilidad m\u00EDnima de 15 a\u00F1os.\r\n<br>El material utilizado no contiene productos qu\u00EDmicos da\u00F1inos.\r\n<br>Dimensiones m\u00EDnimas e instalaci\u00F3n:\r\n<br>El cerramiento perimetral tiene una longitud m\u00EDnima de 360 m, y est\u00E1 conformado por paneles prefabricados a base de fibras pl\u00E1sticas conformadas por tablones WPC (madera y pl\u00E1stico) de 0,15 X 0,01 X 2,91 mts.\r\n<br>Las dimensiones m\u00EDnimas de los paneles son: 3,08 X 2,50 metros.\r\n<br>Se considera una altura de 2,50 m.\r\n<br>La instalaci\u00F3n se realiza por medio de perfiles de anclaje laterales a modo de columnas verticales.\r\n<br>El espaciamiento entre apoyos es distribuido de tal manera que se asegura rigidez lateral, seguridad y estabilidad.\"\r\n</p>\r\n</body>\r\n</html>");
		lbl_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_2.setBounds(10, 13, 235, 336);
		panel_2.add(lbl_2);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(703, 18, 139, 104);
		pnlPestaña1.add(panel_3);

		JLabel label_5 = new JLabel("Observaci\u00F3n/Referencia");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_5.setBounds(8, 57, 123, 14);
		panel_3.add(label_5);

		rdBtn10 = new JRadioButton("");
		rdBtn10.setBounds(44, 27, 21, 23);
		panel_3.add(rdBtn10);

		rdBtn11 = new JRadioButton("");
		rdBtn11.setBounds(65, 27, 21, 23);
		panel_3.add(rdBtn11);

		ButtonGroup grupoBoton1 = new ButtonGroup();
		grupoBoton1.add(rdBtn10);
		grupoBoton1.add(rdBtn11);

		JLabel label_6 = new JLabel("SI");
		label_6.setBounds(48, 11, 21, 14);
		panel_3.add(label_6);

		JLabel label_7 = new JLabel("NO");
		label_7.setBounds(67, 11, 21, 14);
		panel_3.add(label_7);

		txtObs1 = new JTextField();
		txtObs1.setColumns(10);
		txtObs1.setBounds(8, 71, 123, 20);
		panel_3.add(txtObs1);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Caminer\u00EDas Exteriores",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(862, 11, 249, 301);
		pnlPestaña1.add(panel_4);

		JLabel lbl_3 = new JLabel(
				"<html>\r\n<body>\r\n<p align=\"justify\">\r\nMateriales: \r\n<br>Paneles prefabricados  WPC (compuesto de pl\u00E1stico y madera) a base de fibras pl\u00E1sticas, resistentes a rayos ultravioletas y asegurar una durabilidad m\u00EDnima de 15 a\u00F1os.\r\n<br>El material utilizado no contiene productos qu\u00EDmicos da\u00F1inos.\r\n<br>Dimensiones m\u00EDnimas e instalaci\u00F3n:\r\n<br>La caminer\u00EDa se conforma con paneles prefabricados WPC (compuesto de pl\u00E1stico y madera) a base de fibras pl\u00E1sticas y utilizadas como piso exterior.\r\n<br>La instalaci\u00F3n es ejecutada por medio de perfiles de anclaje pl\u00E1sticos.\r\n<br>El perfil compuesto del panel es hueco fabricado por extrusi\u00F3n.\r\n<br>El panel tiene tiene dimensiones m\u00EDnimas de 150mm de ancho X 28 mm de espesor.\r\n<br>El perfil de anclaje tiene dimensiones m\u00EDnimas de 40 mm X 60mm (vigueta de pl\u00E1stico).\r\n</p>\r\n</body>\r\n</html>");
		lbl_3.setVerticalAlignment(SwingConstants.TOP);
		lbl_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_3.setBounds(10, 13, 235, 289);
		panel_4.add(lbl_3);

		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(1132, 18, 139, 104);
		pnlPestaña1.add(panel_5);

		JLabel label_4 = new JLabel("Observaci\u00F3n/Referencia");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_4.setBounds(8, 57, 123, 14);
		panel_5.add(label_4);

		rdBtn20 = new JRadioButton("");
		rdBtn20.setBounds(44, 27, 21, 23);
		panel_5.add(rdBtn20);

		rdBtn21 = new JRadioButton("");
		rdBtn21.setBounds(65, 27, 21, 23);
		panel_5.add(rdBtn21);

		ButtonGroup grupoBoton2 = new ButtonGroup();
		grupoBoton2.add(rdBtn20);
		grupoBoton2.add(rdBtn21);

		JLabel label_8 = new JLabel("SI");
		label_8.setBounds(48, 11, 21, 14);
		panel_5.add(label_8);

		JLabel label_9 = new JLabel("NO");
		label_9.setBounds(67, 11, 21, 14);
		panel_5.add(label_9);

		txtObs2 = new JTextField();
		txtObs2.setColumns(10);
		txtObs2.setBounds(8, 71, 123, 20);
		panel_5.add(txtObs2);

		cabecera.getBtnRegistrar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				ServicioInfoObligatoria srvInfoOblig = new ComponenteInfoObligatoria();

				infor = cargarInfoObligatoria(infoObligatoria);
				infor.setIoFotoPath(fotoInfoObl);

				if (validarInfo(infor)) {
					srvInfoOblig.crear(infor);
					infor.setIoSerial(srvInfoOblig.serialInfoOblMax());
					servFicha.guardarFichaB(cargarFicha());
					HashMap<String, Object> parametros = new HashMap<String, Object>();
					parametros.put("serial_cabecera", Utilitarios.gettCabecera().getCSerial());
					parametros.put("serial_ficha", ficha.getFiSerial());

					Reporte reporte = new Reporte("Reporte Recreación Exterior", 280, 10, 850, 750);
					InputStream path = AlInicio.class
							.getResourceAsStream("/com/capa/templates/BateriasSanitarias.jasper");
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
		TGrupo grupoTmp = servFicha.buscarGrupo("Superficie");
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
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, updateFicha, observacion, desicion,
				quitarEtiquetasHTML(LBL_BRE_0)));

		grupoTmp = servFicha.buscarGrupo("Cerramiento perimetral");
		observacion = txtObs1.getText();
		if (rdBtn10.isSelected()) {
			desicion = "SI";
		} else if (rdBtn11.isSelected()) {
			desicion = "NO";
		}
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, updateFicha, observacion, desicion,
				quitarEtiquetasHTML(LBL_BRE_1)));

		grupoTmp = servFicha.buscarGrupo("Caminerías exteriores");
		observacion = txtObs2.getText();
		if (rdBtn20.isSelected()) {
			desicion = "SI";
		} else if (rdBtn21.isSelected()) {
			desicion = "NO";
		}
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, updateFicha, observacion, desicion,
				quitarEtiquetasHTML(LBL_BRE_2)));

		return listaDetalles;
	}

}
