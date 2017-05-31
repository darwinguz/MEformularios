package com.capa.presentacion;

import static com.capa.negocios.Calculos.calcularPorcentajeAvance;
import static com.capa.util.Constantes.ITEM_EX_15;
import static com.capa.util.Constantes.ITEM_EX_16;
import static com.capa.util.Constantes.ITEM_EX_17;
import static com.capa.util.Constantes.ITEM_EX_18;
import static com.capa.util.Constantes.ITEM_EX_19;
import static com.capa.util.Constantes.ITEM_EX_20;
import static com.capa.util.Constantes.ITEM_EX_21;
import static com.capa.util.Constantes.LBL_EX_15;
import static com.capa.util.Constantes.LBL_EX_16;
import static com.capa.util.Constantes.LBL_EX_17;
import static com.capa.util.Constantes.LBL_EX_18;
import static com.capa.util.Constantes.LBL_EX_19;
import static com.capa.util.Constantes.LBL_EX_20;
import static com.capa.util.Constantes.LBL_EX_21;
import static com.capa.util.Utilitarios.*;
import static com.capa.util.Validaciones.validarDigitos;
import static com.capa.util.Validaciones.validarInfo;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
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
import com.capa.util.Validaciones;

public class AeTemplate extends JFrame {

	private static final long serialVersionUID = 2991536081432510517L;
	private JPanel contentPane;
	private JPanel pnlAE;
	private JPanel pnlAEEtiquetas;
	private JLabel lblDadosCimentacionAXA;
	private JLabel lblLuminariasLed;
	private JLabel lblPostesSimples;
	private JLabel lblPostesDobles;
	private JLabel lblAECajasConexion;
	private JLabel lblAEKitCableadoElectrico;
	private JLabel lblAETuberaPvc;
	private JLabel lblAEKitAlumbradoExterior;
	private JPanel pnlAECantidad;
	private JTextField txtCantidad150;
	private JTextField txtCantidad151;
	private JTextField txtCantidad160;
	private JTextField txtCantidad161;
	private JTextField txtCantidad170;
	private JTextField txtCantidad171;
	private JTextField txtCantidad180;
	private JTextField txtCantidad181;
	private JTextField txtCantidad190;
	private JTextField txtCantidad191;
	private JTextField txtCantidad200;
	private JTextField txtCantidad201;
	private JTextField txtCantidad210;
	private JTextField txtCantidad211;
	private JPanel pnlAEObsRef;
	private JTextField txtObs15;
	private JTextField txtObs16;
	private JTextField txtObs17;
	private JTextField txtObs18;
	private JTextField txtObs19;
	private JTextField txtObs20;
	private JTextField txtObs21;
	private JLabel lblAECantidad;
	private JLabel lblAEObsRef;

	private TInformacionObligatoria infor;
	private TFicha ficha;
	private ServicioFicha servFicha;

	private String fotoInfoObl;

	public AeTemplate(TFicha ficha) {
		this.ficha = ficha;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1318, 659);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setTitle(Utilitarios.getNombreFicha() + ficha.getFiNombre());
		servFicha = new ComponenteFicha();

		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());
		setContentPane(contentPane);
		llenarCabecera(cabecera);

		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 125, 1286, 484);
		contentPane.add(tabbedPane);

		JPanel pnlPestaña1 = new JPanel();
		tabbedPane.addTab("1.- " + ficha.getFiDescripcion(), null, pnlPestaña1, null);
		pnlPestaña1.setLayout(null);

		pnlAE = new JPanel();
		pnlAE.setLayout(null);
		pnlAE.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlAE.setBounds(10, 11, 414, 190);
		pnlPestaña1.add(pnlAE);

		pnlAEEtiquetas = new JPanel();
		pnlAEEtiquetas.setBounds(3, 17, 199, 169);
		pnlAE.add(pnlAEEtiquetas);
		pnlAEEtiquetas.setLayout(new GridLayout(7, 0, 0, 0));

		lblDadosCimentacionAXA = new JLabel(LBL_EX_15);
		pnlAEEtiquetas.add(lblDadosCimentacionAXA);

		lblLuminariasLed = new JLabel(LBL_EX_16);
		pnlAEEtiquetas.add(lblLuminariasLed);

		lblPostesSimples = new JLabel(LBL_EX_17);
		pnlAEEtiquetas.add(lblPostesSimples);

		lblPostesDobles = new JLabel(LBL_EX_18);
		pnlAEEtiquetas.add(lblPostesDobles);

		lblAECajasConexion = new JLabel(LBL_EX_19);
		pnlAEEtiquetas.add(lblAECajasConexion);

		lblAEKitCableadoElectrico = new JLabel(LBL_EX_20);
		pnlAEEtiquetas.add(lblAEKitCableadoElectrico);

		lblAETuberaPvc = new JLabel(LBL_EX_21);
		pnlAEEtiquetas.add(lblAETuberaPvc);

		lblAEKitAlumbradoExterior = new JLabel("KIT ALUMBRADO EXTERIOR");
		lblAEKitAlumbradoExterior.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAEKitAlumbradoExterior.setBounds(3, 1, 176, 14);
		pnlAE.add(lblAEKitAlumbradoExterior);

		pnlAECantidad = new JPanel();
		pnlAECantidad.setBounds(210, 17, 55, 169);
		pnlAE.add(pnlAECantidad);
		pnlAECantidad.setLayout(new GridLayout(7, 2, 0, 0));

		txtCantidad150 = new JTextField();
		txtCantidad150.setText("10");
		txtCantidad150.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad150.setEditable(false);
		txtCantidad150.setColumns(10);
		pnlAECantidad.add(txtCantidad150);

		txtCantidad151 = new JTextField();
		txtCantidad151.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad151.setColumns(10);
		pnlAECantidad.add(txtCantidad151);
		validarDigitos(txtCantidad151);

		txtCantidad160 = new JTextField();
		txtCantidad160.setText("18");
		txtCantidad160.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad160.setEditable(false);
		txtCantidad160.setColumns(10);
		pnlAECantidad.add(txtCantidad160);

		txtCantidad161 = new JTextField();
		txtCantidad161.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad161.setColumns(10);
		pnlAECantidad.add(txtCantidad161);
		validarDigitos(txtCantidad161);

		txtCantidad170 = new JTextField();
		txtCantidad170.setText("2");
		txtCantidad170.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad170.setEditable(false);
		txtCantidad170.setColumns(10);
		pnlAECantidad.add(txtCantidad170);

		txtCantidad171 = new JTextField();
		txtCantidad171.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad171.setColumns(10);
		pnlAECantidad.add(txtCantidad171);
		validarDigitos(txtCantidad171);

		txtCantidad180 = new JTextField();
		txtCantidad180.setText("8");
		txtCantidad180.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad180.setEditable(false);
		txtCantidad180.setColumns(10);
		pnlAECantidad.add(txtCantidad180);

		txtCantidad181 = new JTextField();
		txtCantidad181.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad181.setColumns(10);
		pnlAECantidad.add(txtCantidad181);
		validarDigitos(txtCantidad181);

		txtCantidad190 = new JTextField();
		txtCantidad190.setText("18");
		txtCantidad190.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad190.setEditable(false);
		txtCantidad190.setColumns(10);
		pnlAECantidad.add(txtCantidad190);

		txtCantidad191 = new JTextField();
		txtCantidad191.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad191.setColumns(10);
		pnlAECantidad.add(txtCantidad191);
		validarDigitos(txtCantidad191);

		txtCantidad200 = new JTextField();
		txtCantidad200.setText("1");
		txtCantidad200.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad200.setEditable(false);
		txtCantidad200.setColumns(10);
		pnlAECantidad.add(txtCantidad200);

		txtCantidad201 = new JTextField();
		txtCantidad201.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad201.setColumns(10);
		pnlAECantidad.add(txtCantidad201);
		validarDigitos(txtCantidad201);

		txtCantidad210 = new JTextField();
		txtCantidad210.setText("66");
		txtCantidad210.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad210.setEditable(false);
		txtCantidad210.setColumns(10);
		pnlAECantidad.add(txtCantidad210);

		txtCantidad211 = new JTextField();
		txtCantidad211.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad211.setColumns(10);
		pnlAECantidad.add(txtCantidad211);
		validarDigitos(txtCantidad211);

		pnlAEObsRef = new JPanel();
		pnlAEObsRef.setBounds(267, 17, 143, 169);
		pnlAE.add(pnlAEObsRef);
		pnlAEObsRef.setLayout(new GridLayout(7, 0, 0, 0));

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

		txtObs19 = new JTextField();
		txtObs19.setColumns(10);
		pnlAEObsRef.add(txtObs19);

		txtObs20 = new JTextField();
		txtObs20.setColumns(10);
		pnlAEObsRef.add(txtObs20);

		txtObs21 = new JTextField();
		txtObs21.setColumns(10);
		pnlAEObsRef.add(txtObs21);

		lblAECantidad = new JLabel("Cantidad");
		lblAECantidad.setBounds(210, 1, 55, 14);
		pnlAE.add(lblAECantidad);

		lblAEObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblAEObsRef.setBounds(267, 1, 143, 14);
		pnlAE.add(lblAEObsRef);

		JPinformacionObligatoria infoObligatoria = new JPinformacionObligatoria(865, 240);
		infoObligatoria.getBtnInsertarFoto().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				fotoInfoObl = getPathImagen();
			}
		});
		pnlPestaña1.add(infoObligatoria.getPnlInformacionObl());

		llenarFicha();

		cabecera.getBtnRegistrar().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ServicioInfoObligatoria srvInfoOblig = new ComponenteInfoObligatoria();

				infor = cargarInfoObligatoria(infoObligatoria);
				infor.setIoFotoPath(fotoInfoObl);

				if (validarInfo(infor)) {
					List<TdetalleFicha> detallesFicha = cargarListas();
					if (detallesFicha == null) {
						JOptionPane.showMessageDialog(null,
								"ERROR: Verificar que los registros no se encuentren VACÍOS", "Mensaje de Error",
								JOptionPane.ERROR_MESSAGE);
						return;
					}
					if (Validaciones.registrosValidados(detallesFicha)) {
						srvInfoOblig.crear(infor);
						infor.setIoSerial(srvInfoOblig.serialInfoOblMax());
						servFicha.guardarFormulario(detallesFicha);
						HashMap<String, Object> parametros = new HashMap<String, Object>();
						parametros.put("serial_cabecera", Utilitarios.gettCabecera().getCSerial());
						parametros.put("serial_ficha", ficha.getFiSerial());
						Reporte reporte = new Reporte("Reporte AE", 280, 10, 850, 750);

						InputStream path;

						if (isFichaC1()) {
							path = AlInicio.class.getResourceAsStream("/com/capa/templates/MA.jasper");
						} else {
							path = AlInicio.class.getResourceAsStream("/com/capa/templates/MA-C.jasper");
						}

						reporte.cargarReporte(path, parametros, Query.getMysql().getConexion());
						reporte.setVisible(true);
						new Menu().setVisible(true);
						dispose();
					}
				} else {
					JOptionPane.showMessageDialog(null, "Ingresar datos en Información Obligatoria ");
				}
			}

		});

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				new com.capa.presentacion.Menu().setVisible(true);
				dispose();
			}
		});
	}

	public List<TdetalleFicha> cargarListas() {
		List<TdetalleFicha> listaDetalles = new LinkedList<>();

		// ServicioInfoObligatoria srvInfoObl = new ComponenteInfoObligatoria();
		// infor.setIoSerial(srvInfoObl.serialInfoOblMax());

		BigDecimal porcentajeAvance;
		Integer updateFicha = servFicha.nActualizacionFicha(gettCabecera(), ficha);
		// if (updateFicha == -1) {
		// updateFicha = 0;
		// } else {
		// updateFicha++;
		// }

		if (isFichaC1()) {
			if (updateFicha == -1) {
				updateFicha = 0;
			}
			updateFicha++;
		} else {
			servFicha.eliminarDatos(ficha);
			updateFicha = -1;
		}

		TGrupo grupoTmp = servFicha.buscarGrupo("Kit de tableros eléctricos");

		grupoTmp = servFicha.buscarGrupo("Kit alumbrado exterior");
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad150.getText()),
				Double.parseDouble(txtCantidad151.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_15),
				Integer.parseInt(txtCantidad150.getText()), Integer.parseInt(txtCantidad151.getText()),
				txtObs15.getText(), updateFicha, porcentajeAvance, ITEM_EX_15, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad160.getText()),
				Double.parseDouble(txtCantidad161.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_16),
				Integer.parseInt(txtCantidad160.getText()), Integer.parseInt(txtCantidad161.getText()),
				txtObs16.getText(), updateFicha, porcentajeAvance, ITEM_EX_16, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad170.getText()),
				Double.parseDouble(txtCantidad171.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_17),
				Integer.parseInt(txtCantidad170.getText()), Integer.parseInt(txtCantidad171.getText()),
				txtObs17.getText(), updateFicha, porcentajeAvance, ITEM_EX_17, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad180.getText()),
				Double.parseDouble(txtCantidad181.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_18),
				Integer.parseInt(txtCantidad180.getText()), Integer.parseInt(txtCantidad181.getText()),
				txtObs18.getText(), updateFicha, porcentajeAvance, ITEM_EX_18, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad190.getText()),
				Double.parseDouble(txtCantidad191.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_19),
				Integer.parseInt(txtCantidad190.getText()), Integer.parseInt(txtCantidad191.getText()),
				txtObs19.getText(), updateFicha, porcentajeAvance, ITEM_EX_19, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad200.getText()),
				Double.parseDouble(txtCantidad201.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_20),
				Integer.parseInt(txtCantidad200.getText()), Integer.parseInt(txtCantidad201.getText()),
				txtObs20.getText(), updateFicha, porcentajeAvance, ITEM_EX_20, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad210.getText()),
				Double.parseDouble(txtCantidad211.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_21),
				Integer.parseInt(txtCantidad210.getText()), Integer.parseInt(txtCantidad211.getText()),
				txtObs21.getText(), updateFicha, porcentajeAvance, ITEM_EX_21, "UNIDAD"));

		return listaDetalles;
	}

	public void llenarFicha() {
		List<TdetalleFicha> listaDetalles = servFicha.detallesFicha(gettCabecera(), ficha);

		// if (isFichaC1()) {
		try {
			txtCantidad151.setText(String.valueOf(listaDetalles.get(0).getDetCantidadEjecutada()));
			txtCantidad161.setText(String.valueOf(listaDetalles.get(1).getDetCantidadEjecutada()));
			txtCantidad171.setText(String.valueOf(listaDetalles.get(2).getDetCantidadEjecutada()));
			txtCantidad181.setText(String.valueOf(listaDetalles.get(3).getDetCantidadEjecutada()));
			txtCantidad191.setText(String.valueOf(listaDetalles.get(4).getDetCantidadEjecutada()));
			txtCantidad201.setText(String.valueOf(listaDetalles.get(5).getDetCantidadEjecutada()));
			txtCantidad211.setText(String.valueOf(listaDetalles.get(6).getDetCantidadEjecutada()));
			txtObs15.setText(listaDetalles.get(0).getDetObsRef());
			txtObs16.setText(listaDetalles.get(1).getDetObsRef());
			txtObs17.setText(listaDetalles.get(2).getDetObsRef());
			txtObs18.setText(listaDetalles.get(3).getDetObsRef());
			txtObs19.setText(listaDetalles.get(4).getDetObsRef());
			txtObs20.setText(listaDetalles.get(5).getDetObsRef());
			txtObs21.setText(listaDetalles.get(6).getDetObsRef());
		} catch (IndexOutOfBoundsException e) {
			llenarVacios();
		}
		// } else {
		// llenarVacios();
		// }
	}

	public void llenarVacios() {
		txtCantidad151.setText(String.valueOf(0));
		txtCantidad161.setText(String.valueOf(0));
		txtCantidad171.setText(String.valueOf(0));
		txtCantidad181.setText(String.valueOf(0));
		txtCantidad191.setText(String.valueOf(0));
		txtCantidad201.setText(String.valueOf(0));
		txtCantidad211.setText(String.valueOf(0));
		txtObs15.setText("");
		txtObs16.setText("");
		txtObs17.setText("");
		txtObs18.setText("");
		txtObs19.setText("");
		txtObs20.setText("");
		txtObs21.setText("");
	}
}
