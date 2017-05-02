package com.capa.presentacion;

import static com.capa.util.Utilitarios.cargarInfoObligatoria;
import static com.capa.util.Utilitarios.getPathImagen;
import static com.capa.util.Utilitarios.gettCabecera;
import static com.capa.util.Utilitarios.llenarCabecera;
import static com.capa.util.Validaciones.validarInfo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.capa.datos.TFichaD;
import com.capa.datos.TInformacionObligatoria;
import com.capa.negocios.ComponenteFichaD;
import com.capa.negocios.ComponenteInfoObligatoria;
import com.capa.negocios.Query;
import com.capa.negocios.Reporte;
import com.capa.negocios.ServicioFichaD;
import com.capa.negocios.ServicioInfoObligatoria;
import com.capa.util.Utilitarios;

public class FichaD extends JFrame {

	private static final long serialVersionUID = -2522828583385937960L;
	private JPanel contentPane;

	private JTextField txtDescripcion1;
	private JTextField txtDescripcion2;
	private JTextField txtDescripcion3;
	private JTextField txtDescripcion4;
	private JTextField txtDescripcion5;
	private JTextField txtDescripcion6;
	private JTextField txtDescripcion7;
	private JTextField txtDescripcion8;
	private JTextField txtDescripcion9;
	private JTextField txtDescripcion10;

	private TInformacionObligatoria infoObl;
	private List<TFichaD> listasD = new ArrayList<TFichaD>();

	ServicioFichaD srvFicha = new ComponenteFichaD();
	ServicioInfoObligatoria srvIObligatoria = new ComponenteInfoObligatoria();

	public FichaD() {
		setTitle("EVALUACIÓN D");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1310, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);

		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());

		llenarCabecera(cabecera);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 144, 640, 354);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblReporte = new JLabel("REPORTE DE INSPECCIÓN A LA UEPTM");
		lblReporte.setFont(new Font("Arial", Font.BOLD, 11));
		lblReporte.setBounds(10, 11, 221, 14);
		panel_1.add(lblReporte);

		JLabel lblDescripcion1 = new JLabel("Descripción 1");
		lblDescripcion1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion1.setOpaque(true);
		lblDescripcion1.setBackground(new Color(176, 196, 222));
		lblDescripcion1.setBounds(10, 36, 200, 18);
		panel_1.add(lblDescripcion1);

		JLabel lblReferencia = new JLabel("OBSERVACIÓN/PROBLEMÁTICA/REFERENCIA");
		lblReferencia.setFont(new Font("Arial", Font.PLAIN, 11));
		lblReferencia.setBounds(227, 11, 233, 14);
		panel_1.add(lblReferencia);

		JButton btnInsertarFoto1 = new JButton("Insertar FOTO");
		btnInsertarFoto1.setEnabled(false);
		btnInsertarFoto1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				listasD.add(new TFichaD(gettCabecera(), txtDescripcion1.getText(),
						Utilitarios.buscarNumeroUpdateFicha(), getPathImagen(), infoObl));
			}
		});

		btnInsertarFoto1.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto1.setBounds(460, 34, 125, 23);
		panel_1.add(btnInsertarFoto1);

		JButton btnInsertarFoto2 = new JButton("Insertar FOTO");
		btnInsertarFoto2.setEnabled(false);
		btnInsertarFoto2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listasD.add(new TFichaD(gettCabecera(), txtDescripcion2.getText(),
						Utilitarios.buscarNumeroUpdateFicha(), getPathImagen(), infoObl));
			}
		});

		btnInsertarFoto2.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto2.setBounds(460, 65, 125, 23);
		panel_1.add(btnInsertarFoto2);

		JButton btnInsertarFoto3 = new JButton("Insertar FOTO");
		btnInsertarFoto3.setEnabled(false);
		btnInsertarFoto3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listasD.add(new TFichaD(gettCabecera(), txtDescripcion3.getText(),
						Utilitarios.buscarNumeroUpdateFicha(), getPathImagen(), infoObl));
			}
		});

		btnInsertarFoto3.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto3.setBounds(460, 96, 125, 23);
		panel_1.add(btnInsertarFoto3);

		JButton btnInsertarFoto4 = new JButton("Insertar FOTO");
		btnInsertarFoto4.setEnabled(false);
		btnInsertarFoto4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listasD.add(new TFichaD(gettCabecera(), txtDescripcion4.getText(),
						Utilitarios.buscarNumeroUpdateFicha(), getPathImagen(), infoObl));
			}
		});
		btnInsertarFoto4.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto4.setBounds(460, 127, 125, 23);
		panel_1.add(btnInsertarFoto4);

		JButton btnInsertarFoto5 = new JButton("Insertar FOTO");
		btnInsertarFoto5.setEnabled(false);
		btnInsertarFoto5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listasD.add(new TFichaD(gettCabecera(), txtDescripcion5.getText(),
						Utilitarios.buscarNumeroUpdateFicha(), getPathImagen(), infoObl));
			}
		});
		btnInsertarFoto5.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto5.setBounds(460, 158, 125, 23);
		panel_1.add(btnInsertarFoto5);
		JButton btnInsertarFoto6 = new JButton("Insertar FOTO");
		btnInsertarFoto6.setEnabled(false);
		btnInsertarFoto6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listasD.add(new TFichaD(gettCabecera(), txtDescripcion6.getText(),
						Utilitarios.buscarNumeroUpdateFicha(), getPathImagen(), infoObl));
			}
		});
		btnInsertarFoto6.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto6.setBounds(460, 189, 125, 23);
		panel_1.add(btnInsertarFoto6);
		JButton btnInsertarFoto7 = new JButton("Insertar FOTO");
		btnInsertarFoto7.setEnabled(false);
		btnInsertarFoto7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listasD.add(new TFichaD(gettCabecera(), txtDescripcion7.getText(),
						Utilitarios.buscarNumeroUpdateFicha(), getPathImagen(), infoObl));
			}
		});
		btnInsertarFoto7.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto7.setBounds(460, 220, 125, 23);
		panel_1.add(btnInsertarFoto7);

		JButton btnInsertarFoto8 = new JButton("Insertar FOTO");
		btnInsertarFoto8.setEnabled(false);
		btnInsertarFoto8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listasD.add(new TFichaD(gettCabecera(), txtDescripcion8.getText(),
						Utilitarios.buscarNumeroUpdateFicha(), getPathImagen(), infoObl));
			}
		});
		btnInsertarFoto8.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto8.setBounds(460, 251, 125, 23);
		panel_1.add(btnInsertarFoto8);

		JButton btnInsertarFoto9 = new JButton("Insertar FOTO");
		btnInsertarFoto9.setEnabled(false);
		btnInsertarFoto9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listasD.add(new TFichaD(gettCabecera(), txtDescripcion9.getText(),
						Utilitarios.buscarNumeroUpdateFicha(), getPathImagen(), infoObl));
			}
		});
		btnInsertarFoto9.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto9.setBounds(460, 282, 125, 23);
		panel_1.add(btnInsertarFoto9);

		JButton btnInsertarFoto10 = new JButton("Insertar FOTO");
		btnInsertarFoto10.setEnabled(false);
		btnInsertarFoto10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listasD.add(new TFichaD(gettCabecera(), txtDescripcion10.getText(),
						Utilitarios.buscarNumeroUpdateFicha(), getPathImagen(), infoObl));
			}
		});
		btnInsertarFoto10.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto10.setBounds(460, 313, 125, 23);
		panel_1.add(btnInsertarFoto10);

		JLabel lblDescripcion2 = new JLabel("Descripción 2");
		lblDescripcion2.setOpaque(true);
		lblDescripcion2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion2.setBackground(new Color(211, 211, 211));
		lblDescripcion2.setBounds(10, 67, 200, 18);
		panel_1.add(lblDescripcion2);

		txtDescripcion1 = new JTextField();
		txtDescripcion1.setBounds(222, 36, 228, 20);
		panel_1.add(txtDescripcion1);
		txtDescripcion1.setColumns(10);
		txtDescripcion1.addKeyListener(new KeyAdapter() {
			public void keyPressed(final KeyEvent e) {
				btnInsertarFoto1.setEnabled(true);
			}
		});

		txtDescripcion2 = new JTextField();
		txtDescripcion2.setColumns(10);
		txtDescripcion2.setBounds(222, 67, 228, 20);
		panel_1.add(txtDescripcion2);
		txtDescripcion2.addKeyListener(new KeyAdapter() {
			public void keyPressed(final KeyEvent e) {
				btnInsertarFoto2.setEnabled(true);
			}
		});

		txtDescripcion3 = new JTextField();
		txtDescripcion3.setColumns(10);
		txtDescripcion3.setBounds(222, 98, 228, 20);
		panel_1.add(txtDescripcion3);
		txtDescripcion3.addKeyListener(new KeyAdapter() {
			public void keyPressed(final KeyEvent e) {
				btnInsertarFoto3.setEnabled(true);
			}
		});

		txtDescripcion4 = new JTextField();
		txtDescripcion4.setColumns(10);
		txtDescripcion4.setBounds(222, 129, 228, 20);
		panel_1.add(txtDescripcion4);
		txtDescripcion4.addKeyListener(new KeyAdapter() {
			public void keyPressed(final KeyEvent e) {
				btnInsertarFoto4.setEnabled(true);
			}
		});

		JLabel lblDescripcion3 = new JLabel("Descripción 3");
		lblDescripcion3.setOpaque(true);
		lblDescripcion3.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion3.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion3.setBackground(new Color(176, 196, 222));
		lblDescripcion3.setBounds(10, 98, 200, 18);
		panel_1.add(lblDescripcion3);

		JLabel lblDescripcion4 = new JLabel("Descripción 4");
		lblDescripcion4.setOpaque(true);
		lblDescripcion4.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion4.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion4.setBackground(new Color(211, 211, 211));
		lblDescripcion4.setBounds(10, 129, 200, 18);
		panel_1.add(lblDescripcion4);

		JLabel lblDescripcion5 = new JLabel("Descripción 5");
		lblDescripcion5.setOpaque(true);
		lblDescripcion5.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion5.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion5.setBackground(new Color(176, 196, 222));
		lblDescripcion5.setBounds(10, 160, 200, 18);
		panel_1.add(lblDescripcion5);

		JLabel lblDescripcion6 = new JLabel("Descripción 6");
		lblDescripcion6.setOpaque(true);
		lblDescripcion6.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion6.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion6.setBackground(new Color(211, 211, 211));
		lblDescripcion6.setBounds(10, 191, 200, 18);
		panel_1.add(lblDescripcion6);

		JLabel lblDescripcion7 = new JLabel("Descripción 7");
		lblDescripcion7.setOpaque(true);
		lblDescripcion7.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion7.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion7.setBackground(new Color(176, 196, 222));
		lblDescripcion7.setBounds(10, 222, 200, 18);
		panel_1.add(lblDescripcion7);

		txtDescripcion5 = new JTextField();
		txtDescripcion5.setColumns(10);
		txtDescripcion5.setBounds(222, 160, 228, 20);
		panel_1.add(txtDescripcion5);
		txtDescripcion5.addKeyListener(new KeyAdapter() {
			public void keyPressed(final KeyEvent e) {
				btnInsertarFoto5.setEnabled(true);
			}
		});

		txtDescripcion6 = new JTextField();
		txtDescripcion6.setColumns(10);
		txtDescripcion6.setBounds(222, 191, 228, 20);
		panel_1.add(txtDescripcion6);
		txtDescripcion6.addKeyListener(new KeyAdapter() {
			public void keyPressed(final KeyEvent e) {
				btnInsertarFoto6.setEnabled(true);
			}
		});

		txtDescripcion7 = new JTextField();
		txtDescripcion7.setColumns(10);
		txtDescripcion7.setBounds(222, 222, 228, 20);
		panel_1.add(txtDescripcion7);
		txtDescripcion7.addKeyListener(new KeyAdapter() {
			public void keyPressed(final KeyEvent e) {
				btnInsertarFoto7.setEnabled(true);
			}
		});

		txtDescripcion8 = new JTextField();
		txtDescripcion8.setColumns(10);
		txtDescripcion8.setBounds(222, 253, 228, 20);
		panel_1.add(txtDescripcion8);
		txtDescripcion8.addKeyListener(new KeyAdapter() {
			public void keyPressed(final KeyEvent e) {
				btnInsertarFoto8.setEnabled(true);
			}
		});

		txtDescripcion9 = new JTextField();
		txtDescripcion9.setColumns(10);
		txtDescripcion9.setBounds(222, 284, 228, 20);
		panel_1.add(txtDescripcion9);
		txtDescripcion9.addKeyListener(new KeyAdapter() {
			public void keyPressed(final KeyEvent e) {
				btnInsertarFoto9.setEnabled(true);
			}
		});
		txtDescripcion10 = new JTextField();
		txtDescripcion10.setColumns(10);
		txtDescripcion10.setBounds(222, 315, 228, 20);
		panel_1.add(txtDescripcion10);
		txtDescripcion10.addKeyListener(new KeyAdapter() {
			public void keyPressed(final KeyEvent e) {
				btnInsertarFoto10.setEnabled(true);
			}
		});

		JLabel lblDescripcion8 = new JLabel("Descripción 8");
		lblDescripcion8.setOpaque(true);
		lblDescripcion8.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion8.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion8.setBackground(new Color(211, 211, 211));
		lblDescripcion8.setBounds(10, 253, 200, 18);
		panel_1.add(lblDescripcion8);

		JLabel lblDescripcion9 = new JLabel("Descripción 9");
		lblDescripcion9.setOpaque(true);
		lblDescripcion9.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion9.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion9.setBackground(new Color(176, 196, 222));
		lblDescripcion9.setBounds(10, 284, 200, 18);
		panel_1.add(lblDescripcion9);

		JLabel lblDescripcion10 = new JLabel("Descripción 10");
		lblDescripcion10.setOpaque(true);
		lblDescripcion10.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion10.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion10.setBackground(new Color(211, 211, 211));
		lblDescripcion10.setBounds(10, 315, 200, 18);
		panel_1.add(lblDescripcion10);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(703, 186, 582, 489);
		contentPane.add(panel_2);

		JPinformacionObligatoria jpIObligatoria = new JPinformacionObligatoria(165, 280);
		jpIObligatoria.getBtnInsertarFoto().setText("Insertar foto bloque");
		jpIObligatoria.getBtnInsertarFoto().setBounds(166, 175, 157, 23);
		jpIObligatoria.getBtnInsertarFoto().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jpIObligatoria.setPathFotoIO(Utilitarios.getPathImagen());
				// infoObl = cargarInfoObligatoria(jpIObligatoria);
			}
		});
		panel_2.add(jpIObligatoria.getPnlInformacionObl());

		cabecera.getBtnRegistrar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				infoObl = cargarInfoObligatoria(jpIObligatoria);
				// srvIObligatoria.crear(infoObl);
				infoObl.setIoSerial(srvIObligatoria.serialInfoOblMax());

				if (validarInfo(infoObl)) {

					srvIObligatoria.crear(infoObl);
					for (TFichaD it1 : getListasD()) {
						it1.settInformacionObl(infoObl);
					}

					srvFicha.crearFichaD(getListasD());

					// for (TFichaD it2 : getListasD()) {
					// srvFicha.crear(it2);
					// }

					HashMap<String, Object> parametros = new HashMap<String, Object>();
					parametros.put("serial_cabecera", Utilitarios.gettCabecera().getCSerial());

					Reporte reporte = new Reporte("Reporte Evaluación D", 280, 10, 850, 750);
					InputStream path = AlInicio.class.getResourceAsStream("/com/capa/templates/EvaluacionD.jasper");
					reporte.cargarReporte(path, parametros, Query.getMysql().getConexion());
					reporte.setVisible(true);

					new AlInicio().setVisible(true);
					dispose();

				} else {
					JOptionPane.showMessageDialog(null, "Ingresar Información Obligatoria");
				}
			}

		});

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				new AlInicio().setVisible(true);
				dispose();
			}
		});

	}

	public List<TFichaD> getListasD() {
		return listasD;
	}

	public void setListasD(List<TFichaD> listasD) {
		this.listasD = listasD;
	}

	public void insertarFichaD() {

	}

	// public List<TFichaD> getListaFichaD(TInformacionObligatoria iObligatoria)
	// {
	// Integer updateFicha = srvFicha.actualizacionFichaN(gettCabecera());
	//
	// if (updateFicha == -1) {
	// updateFicha = 1;
	// } else {
	// updateFicha++;
	// }
	//
	// listasD.add(new TFichaD(gettCabecera(), txtDescripcion1.getText(),
	// updateFicha, pathFoto1, iObligatoria));
	// listasD.add(new TFichaD(gettCabecera(), txtDescripcion2.getText(),
	// updateFicha, pathFoto2, iObligatoria));
	// listasD.add(new TFichaD(gettCabecera(), txtDescripcion3.getText(),
	// updateFicha, pathFoto3, iObligatoria));
	// listasD.add(new TFichaD(gettCabecera(), txtDescripcion4.getText(),
	// updateFicha, pathFoto4, iObligatoria));
	// listasD.add(new TFichaD(gettCabecera(), txtDescripcion5.getText(),
	// updateFicha, pathFoto5, iObligatoria));
	// listasD.add(new TFichaD(gettCabecera(), txtDescripcion6.getText(),
	// updateFicha, pathFoto6, iObligatoria));
	// listasD.add(new TFichaD(gettCabecera(), txtDescripcion7.getText(),
	// updateFicha, pathFoto7, iObligatoria));
	// listasD.add(new TFichaD(gettCabecera(), txtDescripcion8.getText(),
	// updateFicha, pathFoto8, iObligatoria));
	// listasD.add(new TFichaD(gettCabecera(), txtDescripcion9.getText(),
	// updateFicha, pathFoto9, iObligatoria));
	// listasD.add(new TFichaD(gettCabecera(), txtDescripcion10.getText(),
	// updateFicha, pathFoto10, iObligatoria));
	// return listasD;
	// }

}
