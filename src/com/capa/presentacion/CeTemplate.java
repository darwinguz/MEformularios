package com.capa.presentacion;

import static com.capa.negocios.Calculos.calcularPorcentajeAvance;
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
import java.math.BigDecimal;
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

import com.capa.datos.TFicha;
import com.capa.datos.TGrupo;
import com.capa.datos.TInformacionObligatoria;
import com.capa.datos.TdetalleFicha;
import com.capa.negocios.ComponenteFicha;
import com.capa.negocios.ComponenteInfoObligatoria;
import com.capa.negocios.ServicioFicha;
import com.capa.negocios.ServicioInfoObligatoria;

public class CeTemplate extends JFrame {

	private static final long serialVersionUID = 4781774484295539711L;
	private JPanel panelPrincipal;
	private JTextField txtCECantidad00;
	private JTextField txtCECantidad01;
	private JTextField txtCECantidad10;
	private JTextField txtCECantidad11;
	private JTextField txtCECantidad20;
	private JTextField txtCECantidad21;
	private JTextField txtCECantidad30;
	private JTextField txtCECantidad31;
	private JTextField txtCECantidad40;
	private JTextField txtCECantidad41;
	private JTextField txtCEObs0;
	private JTextField txtCEObs01;
	private JTextField txtCEObs2;
	private JTextField txtCEObs3;
	private JTextField txtCEObs4;
	private JTextField txtWPCantidad01;
	private JTextField txtWPObs0;
	private JTextField txtWPCantidad00;

	TInformacionObligatoria infor;
	TFicha ficha;
	ServicioFicha servFicha;

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

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 125, 1286, 560);
		panelPrincipal.add(tabbedPane);

		JPanel pnlPestaña1 = new JPanel();
		tabbedPane.addTab("1.- CE-cerramiento", null, pnlPestaña1, null);
		pnlPestaña1.setLayout(null);

		JPcabecera cabecera = new JPcabecera();
		panelPrincipal.add(cabecera.getCabecera());
		llenarCabecera(cabecera);

		InformacionObligatoriaV infoObligatoria = new InformacionObligatoriaV(533, 50);
		pnlPestaña1.add(infoObligatoria.getPnlInformacionObl());

		cabecera.getBtnRegistrar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				ServicioInfoObligatoria srvInfoOblig = new ComponenteInfoObligatoria();
				servFicha = new ComponenteFicha();
				infor = cargarInfoObligatoria(infoObligatoria);
				// System.out.println(infor.gettCabe().getCNombreProyecto());

				if (validarInfo(infor)) {
					srvInfoOblig.crear(infor);
					servFicha.insertarFormulario(cargarListas());
				} else {
					JOptionPane.showMessageDialog(null, "Ingresar datos en Información Obligatoria ");
				}
			}
		});

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

		txtWPCantidad00 = new JTextField();
		txtWPCantidad00.setFont(new Font("Arial", Font.PLAIN, 9));
		txtWPCantidad00.setText("1800");
		txtWPCantidad00.setEditable(false);
		txtWPCantidad00.setColumns(10);
		panel_6.add(txtWPCantidad00);

		txtWPCantidad01 = new JTextField();
		txtWPCantidad01.setColumns(10);
		panel_6.add(txtWPCantidad01);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(267, 17, 143, 29);
		pnlModuloWPC.add(panel_7);
		panel_7.setLayout(new GridLayout(1, 0, 0, 0));

		txtWPObs0 = new JTextField();
		txtWPObs0.setColumns(10);
		panel_7.add(txtWPObs0);

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

		txtCECantidad00 = new JTextField();
		txtCECantidad00.setText("120");
		txtCECantidad00.setEditable(false);
		txtCECantidad00.setColumns(10);
		panel_2.add(txtCECantidad00);

		txtCECantidad01 = new JTextField();
		txtCECantidad01.setColumns(10);
		panel_2.add(txtCECantidad01);

		txtCECantidad10 = new JTextField();
		txtCECantidad10.setText("120");
		txtCECantidad10.setEditable(false);
		txtCECantidad10.setColumns(10);
		panel_2.add(txtCECantidad10);

		txtCECantidad11 = new JTextField();
		txtCECantidad11.setColumns(10);
		panel_2.add(txtCECantidad11);

		txtCECantidad20 = new JTextField();
		txtCECantidad20.setText("480");
		txtCECantidad20.setEditable(false);
		txtCECantidad20.setColumns(10);
		panel_2.add(txtCECantidad20);

		txtCECantidad21 = new JTextField();
		txtCECantidad21.setColumns(10);
		panel_2.add(txtCECantidad21);

		txtCECantidad30 = new JTextField();
		txtCECantidad30.setText("120");
		txtCECantidad30.setEditable(false);
		txtCECantidad30.setColumns(10);
		panel_2.add(txtCECantidad30);

		txtCECantidad31 = new JTextField();
		txtCECantidad31.setColumns(10);
		panel_2.add(txtCECantidad31);

		txtCECantidad40 = new JTextField();
		txtCECantidad40.setText("120");
		txtCECantidad40.setEditable(false);
		txtCECantidad40.setColumns(10);
		panel_2.add(txtCECantidad40);

		txtCECantidad41 = new JTextField();
		txtCECantidad41.setColumns(10);
		panel_2.add(txtCECantidad41);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(267, 17, 143, 144);
		pnlCompEstructural.add(panel_3);
		panel_3.setLayout(new GridLayout(5, 0, 0, 0));

		txtCEObs0 = new JTextField();
		txtCEObs0.setColumns(10);
		panel_3.add(txtCEObs0);

		txtCEObs01 = new JTextField();
		txtCEObs01.setColumns(10);
		panel_3.add(txtCEObs01);

		txtCEObs2 = new JTextField();
		txtCEObs2.setColumns(10);
		panel_3.add(txtCEObs2);

		txtCEObs3 = new JTextField();
		txtCEObs3.setColumns(10);
		panel_3.add(txtCEObs3);

		txtCEObs4 = new JTextField();
		txtCEObs4.setColumns(10);
		panel_3.add(txtCEObs4);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				new Menu().setVisible(true);
				dispose();
			}
		});
	}

	public LinkedList<LinkedList<TdetalleFicha>> cargarListas() {
		LinkedList<TdetalleFicha> listaModulo = new LinkedList<>();
		LinkedList<TdetalleFicha> listaEstructural = new LinkedList<>();

		ServicioInfoObligatoria srvInfoObl = new ComponenteInfoObligatoria();
		infor.setIoSerial(srvInfoObl.serialInfoOblMax());

		BigDecimal porcentajeAvance;

		Integer updateFicha = servFicha.nActualizacionFicha(gettCabecera(), ficha);

		TGrupo grupoTmp = servFicha.buscarGrupo("Módulo WPC tipo A - 180x105");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtWPCantidad00.getText()),
				Integer.parseInt(txtWPCantidad01.getText()));
		listaModulo.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtWPCantidad00.getText()), Integer.parseInt(txtWPCantidad01.getText()),
				txtWPObs0.getText(), updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Componente estructural");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCECantidad00.getText()),
				Integer.parseInt(txtCECantidad01.getText()));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad00.getText()), Integer.parseInt(txtCECantidad01.getText()),
				txtCEObs0.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCECantidad10.getText()),
				Integer.parseInt(txtCECantidad11.getText()));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad10.getText()), Integer.parseInt(txtCECantidad11.getText()),
				txtCEObs01.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCECantidad20.getText()),
				Integer.parseInt(txtCECantidad21.getText()));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad20.getText()), Integer.parseInt(txtCECantidad21.getText()),
				txtCEObs2.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCECantidad30.getText()),
				Integer.parseInt(txtCECantidad31.getText()));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad30.getText()), Integer.parseInt(txtCECantidad31.getText()),
				txtCEObs3.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCECantidad40.getText()),
				Integer.parseInt(txtCECantidad41.getText()));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad40.getText()), Integer.parseInt(txtCECantidad41.getText()),
				txtCEObs4.getText(), updateFicha, porcentajeAvance));

		LinkedList<LinkedList<TdetalleFicha>> listaFormulario = new LinkedList<LinkedList<TdetalleFicha>>();
		listaFormulario.add(listaModulo);
		listaFormulario.add(listaEstructural);
		listaFormulario.add(listaEstructural);
		return listaFormulario;
	}

}
