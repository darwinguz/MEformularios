package com.capa.presentacion;

import static com.capa.negocios.Calculos.calcularPorcentajeAvance;
import static com.capa.util.Utilitarios.cargarInfoObligatoria;
import static com.capa.util.Utilitarios.getPathImagen;
import static com.capa.util.Utilitarios.gettCabecera;
import static com.capa.util.Utilitarios.llenarCabecera;
import static com.capa.util.Validaciones.*;
import static com.capa.util.Constantes.*;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.math.BigDecimal;
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

public class CeTemplate extends JFrame {

	private static final long serialVersionUID = 4781774484295539711L;
	private JPanel panelPrincipal;
	private JTextField txtCantidad10;
	private JTextField txtCantidad11;
	private JTextField txtCantidad20;
	private JTextField txtCantidad21;
	private JTextField txtCantidad30;
	private JTextField txtCantidad31;
	private JTextField txtCantidad40;
	private JTextField txtCantidad41;
	private JTextField txtCantidad50;
	private JTextField txtCantidad51;
	private JTextField txtObs1;
	private JTextField txtObs2;
	private JTextField txtObs3;
	private JTextField txtObs4;
	private JTextField txtObs5;
	private JTextField txtCantidad01;
	private JTextField txtObs0;
	private JTextField txtCantidad00;

	TInformacionObligatoria infor;
	TFicha ficha;
	ServicioFicha servFicha;

	private String fotoInfoObl;

	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// CeTemplate frame = new CeTemplate();
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
	public CeTemplate(TFicha ficha) {
		this.ficha = ficha;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1320, 730);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		setContentPane(panelPrincipal);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setTitle(ficha.getFiNombre());
		servFicha = new ComponenteFicha();

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 125, 1286, 560);
		panelPrincipal.add(tabbedPane);

		JPanel pnlPestaña1 = new JPanel();
		tabbedPane.addTab("1.- CE-cerramiento", null, pnlPestaña1, null);
		pnlPestaña1.setLayout(null);

		JPcabecera cabecera = new JPcabecera();
		panelPrincipal.add(cabecera.getCabecera());
		llenarCabecera(cabecera);

		JPinformacionObligatoria infoObligatoria = new JPinformacionObligatoria(533, 50);
		infoObligatoria.getBtnInsertarFoto().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				fotoInfoObl = getPathImagen();
			}
		});
		pnlPestaña1.add(infoObligatoria.getPnlInformacionObl());

		JPanel pnlModuloWPC = new JPanel();
		pnlModuloWPC.setLayout(null);
		pnlModuloWPC.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlModuloWPC.setBounds(20, 20, 414, 49);
		pnlPestaña1.add(pnlModuloWPC);

		JLabel lblModuloWpcTipo = new JLabel("MODULO WPC TIPO A - 180x105 cm");
		lblModuloWpcTipo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblModuloWpcTipo.setBounds(3, 1, 176, 14);
		pnlModuloWPC.add(lblModuloWpcTipo);

		JLabel label_10 = new JLabel("Cantidad");
		label_10.setBounds(210, 1, 55, 14);
		pnlModuloWPC.add(label_10);

		JLabel label_11 = new JLabel("Observaci\u00F3n/Referencia");
		label_11.setBounds(267, 1, 143, 14);
		pnlModuloWPC.add(label_11);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(3, 17, 199, 29);
		pnlModuloWPC.add(panel_5);
		panel_5.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblComponenteArquitectnico = new JLabel("COMPONENTE ARQUITECT\u00D3NICO");
		lblComponenteArquitectnico.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_5.add(lblComponenteArquitectnico);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(210, 17, 55, 29);
		pnlModuloWPC.add(panel_6);
		panel_6.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad00 = new JTextField();
		txtCantidad00.setFont(new Font("Arial", Font.PLAIN, 9));
		txtCantidad00.setText("1800");
		txtCantidad00.setEditable(false);
		txtCantidad00.setColumns(10);
		panel_6.add(txtCantidad00);

		txtCantidad01 = new JTextField();
		txtCantidad01.setColumns(10);
		panel_6.add(txtCantidad01);
		validarDigitos(txtCantidad01);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(267, 17, 143, 29);
		pnlModuloWPC.add(panel_7);
		panel_7.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs0 = new JTextField();
		txtObs0.setColumns(10);
		panel_7.add(txtObs0);

		JPanel pnlCompEstructural = new JPanel();
		pnlCompEstructural.setLayout(null);
		pnlCompEstructural.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlCompEstructural.setBounds(20, 100, 414, 163);
		pnlPestaña1.add(pnlCompEstructural);

		JLabel lbl_p1 = new JLabel("COMPONENTE ESTRUCTURAL");
		lbl_p1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_p1.setBounds(3, 1, 211, 14);
		pnlCompEstructural.add(lbl_p1);

		JLabel lbl_p2 = new JLabel("Cantidad");
		lbl_p2.setBounds(210, 1, 55, 14);
		pnlCompEstructural.add(lbl_p2);

		JLabel lbl_p3 = new JLabel("Observaci\u00F3n/Referencia");
		lbl_p3.setBounds(267, 1, 143, 14);
		pnlCompEstructural.add(lbl_p3);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(3, 17, 199, 144);
		pnlCompEstructural.add(panel_1);
		panel_1.setLayout(new GridLayout(5, 0, 0, 0));

		JLabel lbl_ce1 = new JLabel("Dados cimentaci\u00F3n 0,30x0,30,0,30 mt");
		lbl_ce1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lbl_ce1);

		JLabel lbl_ce2 = new JLabel("Perfil SF Tipo 1C");
		lbl_ce2.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lbl_ce2);

		JLabel lbl_ce3 = new JLabel("Perfil SF Tipo 2C");
		lbl_ce3.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lbl_ce3);

		JLabel lbl_ce4 = new JLabel("Perfil SF Tipo 3C");
		lbl_ce4.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lbl_ce4);

		JLabel lbl_ce5 = new JLabel("Platina SF 1C");
		panel_1.add(lbl_ce5);
		lbl_ce5.setHorizontalAlignment(SwingConstants.RIGHT);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(210, 17, 55, 144);
		pnlCompEstructural.add(panel_2);
		panel_2.setLayout(new GridLayout(5, 2, 0, 0));

		txtCantidad10 = new JTextField();
		txtCantidad10.setText("120");
		txtCantidad10.setEditable(false);
		txtCantidad10.setColumns(10);
		panel_2.add(txtCantidad10);

		txtCantidad11 = new JTextField();
		txtCantidad11.setColumns(10);
		panel_2.add(txtCantidad11);
		validarDigitos(txtCantidad11);

		txtCantidad20 = new JTextField();
		txtCantidad20.setText("120");
		txtCantidad20.setEditable(false);
		txtCantidad20.setColumns(10);
		panel_2.add(txtCantidad20);

		txtCantidad21 = new JTextField();
		txtCantidad21.setColumns(10);
		panel_2.add(txtCantidad21);
		validarDigitos(txtCantidad21);

		txtCantidad30 = new JTextField();
		txtCantidad30.setText("480");
		txtCantidad30.setEditable(false);
		txtCantidad30.setColumns(10);
		panel_2.add(txtCantidad30);

		txtCantidad31 = new JTextField();
		txtCantidad31.setColumns(10);
		panel_2.add(txtCantidad31);
		validarDigitos(txtCantidad31);

		txtCantidad40 = new JTextField();
		txtCantidad40.setText("120");
		txtCantidad40.setEditable(false);
		txtCantidad40.setColumns(10);
		panel_2.add(txtCantidad40);

		txtCantidad41 = new JTextField();
		txtCantidad41.setColumns(10);
		panel_2.add(txtCantidad41);
		validarDigitos(txtCantidad41);

		txtCantidad50 = new JTextField();
		txtCantidad50.setText("120");
		txtCantidad50.setEditable(false);
		txtCantidad50.setColumns(10);
		panel_2.add(txtCantidad50);

		txtCantidad51 = new JTextField();
		txtCantidad51.setColumns(10);
		panel_2.add(txtCantidad51);
		validarDigitos(txtCantidad51);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(267, 17, 143, 144);
		pnlCompEstructural.add(panel_3);
		panel_3.setLayout(new GridLayout(5, 0, 0, 0));

		txtObs1 = new JTextField();
		txtObs1.setColumns(10);
		panel_3.add(txtObs1);

		txtObs2 = new JTextField();
		txtObs2.setColumns(10);
		panel_3.add(txtObs2);

		txtObs3 = new JTextField();
		txtObs3.setColumns(10);
		panel_3.add(txtObs3);

		txtObs4 = new JTextField();
		txtObs4.setColumns(10);
		panel_3.add(txtObs4);

		txtObs5 = new JTextField();
		txtObs5.setColumns(10);
		panel_3.add(txtObs5);

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
					if (registrosValidados(detallesFicha)) {
						srvInfoOblig.crear(infor);
						servFicha.guardarFormulario(cargarListas());
						// HashMap<String, Object> parametros = new
						// HashMap<String, Object>();
						// parametros.put("serial_cabecera",
						// Utilitarios.gettCabecera().getCSerial());
						// parametros.put("serial_ficha", ficha.getFiSerial());
						//
						// Reporte reporte = new Reporte("Reporte CE", 280, 10,
						// 850, 750);
						// reporte.cargarReporte("src/com/capa/templates/MA.jasper",
						// parametros,
						// Query.getMysql().getConexion());
						// reporte.setVisible(true);
						new Menu().setVisible(true);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "ERROR: Verificar valores ejecutados!", "Mensaje de Error",
								JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Ingresar datos en Información Obligatoria");
				}
			}

			private boolean registrosValidados(List<TdetalleFicha> detallesFicha) {
				for (TdetalleFicha detalle : detallesFicha) {
					if (detalle.getDetCantidadEjecutada() > detalle.getDetCantidadLimite()
							|| detalle.getDetCantidadEjecutada() < 0) {
						return false;
					}
				}
				return true;
			}
		});

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				new Menu().setVisible(true);
				dispose();
			}
		});
	}

	public List<TdetalleFicha> cargarListas() {
		List<TdetalleFicha> listaDetalles = new LinkedList<>();

		ServicioInfoObligatoria srvInfoObl = new ComponenteInfoObligatoria();
		infor.setIoSerial(srvInfoObl.serialInfoOblMax());

		BigDecimal porcentajeAvance;

		Integer updateFicha = servFicha.nActualizacionFicha(gettCabecera(), ficha);

		if (updateFicha == -1) {
			updateFicha = 0;
		} else {
			updateFicha++;
		}

		TGrupo grupoTmp = servFicha.buscarGrupo("Módulo WPC tipo A - 180x105");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad00.getText()),
				Integer.parseInt(txtCantidad01.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_CE_0,
				Integer.parseInt(txtCantidad00.getText()), Integer.parseInt(txtCantidad01.getText()), txtObs0.getText(),
				updateFicha, porcentajeAvance));
		grupoTmp = servFicha.buscarGrupo("Componente estructural");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad10.getText()),
				Integer.parseInt(txtCantidad11.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_CE_1,
				Integer.parseInt(txtCantidad10.getText()), Integer.parseInt(txtCantidad11.getText()), txtObs1.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad20.getText()),
				Integer.parseInt(txtCantidad21.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_CE_2,
				Integer.parseInt(txtCantidad20.getText()), Integer.parseInt(txtCantidad21.getText()), txtObs2.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad30.getText()),
				Integer.parseInt(txtCantidad31.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_CE_3,
				Integer.parseInt(txtCantidad30.getText()), Integer.parseInt(txtCantidad31.getText()), txtObs3.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad40.getText()),
				Integer.parseInt(txtCantidad41.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_CE_4,
				Integer.parseInt(txtCantidad40.getText()), Integer.parseInt(txtCantidad41.getText()), txtObs4.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad50.getText()),
				Integer.parseInt(txtCantidad51.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_CE_5,
				Integer.parseInt(txtCantidad50.getText()), Integer.parseInt(txtCantidad51.getText()), txtObs5.getText(),
				updateFicha, porcentajeAvance));

		return listaDetalles;
	}

	public void llenarFicha() {
		List<TdetalleFicha> listaDetalles = servFicha.detallesFicha(gettCabecera(), ficha);
		try {
			txtCantidad01.setText(String.valueOf(listaDetalles.get(0).getDetCantidadEjecutada()));
			txtCantidad01.setText(String.valueOf(listaDetalles.get(0).getDetCantidadEjecutada()));
			txtCantidad11.setText(String.valueOf(listaDetalles.get(1).getDetCantidadEjecutada()));
			txtCantidad21.setText(String.valueOf(listaDetalles.get(2).getDetCantidadEjecutada()));
			txtCantidad31.setText(String.valueOf(listaDetalles.get(3).getDetCantidadEjecutada()));
			txtCantidad41.setText(String.valueOf(listaDetalles.get(4).getDetCantidadEjecutada()));
			txtCantidad51.setText(String.valueOf(listaDetalles.get(5).getDetCantidadEjecutada()));

			txtObs0.setText(listaDetalles.get(0).getDetObsRef());
			txtObs1.setText(listaDetalles.get(1).getDetObsRef());
			txtObs2.setText(listaDetalles.get(2).getDetObsRef());
			txtObs3.setText(listaDetalles.get(3).getDetObsRef());
			txtObs4.setText(listaDetalles.get(4).getDetObsRef());
			txtObs5.setText(listaDetalles.get(5).getDetObsRef());
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			txtCantidad01.setText(String.valueOf(0));
			txtCantidad01.setText(String.valueOf(0));
			txtCantidad11.setText(String.valueOf(0));
			txtCantidad21.setText(String.valueOf(0));
			txtCantidad31.setText(String.valueOf(0));
			txtCantidad41.setText(String.valueOf(0));
			txtCantidad51.setText(String.valueOf(0));

			txtObs0.setText("");
			txtObs1.setText("");
			txtObs2.setText("");
			txtObs3.setText("");
			txtObs4.setText("");
			txtObs5.setText("");
		}
	}
}
