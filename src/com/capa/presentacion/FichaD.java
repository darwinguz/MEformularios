package com.capa.presentacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.capa.presentacion.JPcabecera;
import com.capa.util.Utilitarios;
import com.capa.datos.TInformacionObligatoria;
import com.capa.negocios.ClaseCabecera;
import com.capa.negocios.ComponenteInfoObligatoria;
import com.capa.negocios.ComponenteLugarGeo;
import com.capa.negocios.ServicioInfoObligatoria;
import com.capa.negocios.ServicioLugarGeo;
import com.capa.presentacion.InformacionObligatoriaV;

public class FichaD extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2522828583385937960L;
	private JPanel contentPane;
	private JTextField txtDesc1;
	private JTextField txtDescripcion2;
	private JTextField txtDescripcion3;
	private JTextField txtDescripcion4;
	private JTextField txtDescripcion5;
	private JTextField txtDescripcion6;
	private JTextField txtDescripcion7;
	private JTextField txtDescripcion8;
	private JTextField txtDescripcion9;
	private JTextField txtDescripcion10;
	private JTextField txtObsGenD;
	private JTextField txtResponsableD;
	private JTextField txtCargoD;
	private JTextField txtObsGen2D;
	private JTextField txtResponsableContraD;
	private JTextField txtCargo2D;
	private JTextField txtFechaD;
	private JPcabecera cabecera;
	private String pathFotoInfor, pathFoto;

	ClaseCabecera cabec = ClaseCabecera.getInstanciaCab(null);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FichaD frame = new FichaD();
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
	public FichaD() {
		setTitle("EVALUACI\u00D3N D");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1310, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		JPcabecera cabecera = new JPcabecera();

		contentPane.add(cabecera.getCabecera());
		contentPane.setLayout(null);

		String canton, provincia, parroquia;
		ServicioLugarGeo geo = new ComponenteLugarGeo();
		canton = geo.buscarCanton(cabec.getCabecSingleton().getTLugarGeografico().getLgCodigo());
		provincia = geo.buscarProvincia(cabec.getCabecSingleton().getTLugarGeografico().getLgCodigo());
		parroquia = geo.buscarParroquia(cabec.getCabecSingleton().getTLugarGeografico().getLgCodigo());

		cabecera.getTxtProyecto().setText(cabec.getCabecSingleton().getCNombreProyecto());
		cabecera.getTxtAmie().setText(cabec.getCabecSingleton().getCAmie());
		cabecera.getTxtDistrito().setText(cabec.getCabecSingleton().getDistrito());
		cabecera.getTxtCircuito().setText(cabec.getCabecSingleton().getCircuito());
		cabecera.getTxtFechaEntrega().setText("" + cabec.getCabecSingleton().getCFechaEntrega());
		cabecera.getTxtFechaInicioTrabajo().setText("" + cabec.getCabecSingleton().getCFechaInicio());
		cabecera.getTxtZona().setText(cabec.getCabecSingleton().getCZona());
		// !!!provincia, canton, parroquia
		cabecera.getTxtProvincia().setText(provincia);
		cabecera.getTxtCanton().setText(canton);
		cabecera.getTxtParroquia().setText(parroquia);

		cabecera.getTxtSector().setText(cabec.getCabecSingleton().getSector());

		InformacionObligatoriaV infor = new InformacionObligatoriaV(165, 280);
		cabecera.getBtnRegistrar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ServicioInfoObligatoria infoServicio = new ComponenteInfoObligatoria();
				TInformacionObligatoria informacion;
				String responsableMinEduc, cargoIzq, obsGenIz;
				String responsableContrat, cargoDer, obsGenDer;
				Date fecha;
				String descripcion;
				responsableMinEduc = infor.getTxtResponsableMineduc().getText();
				cargoIzq = infor.getTxtCargoIzq().getText();
				obsGenIz = infor.getTxtObsGenIzq().getText();
				responsableContrat = infor.getTxtResponsableContratista().getText();
				cargoDer = infor.getTxtCargoDer().getText();
				obsGenDer = infor.getTxtObsGenDer().getText();
				fecha = infor.getDateFechaIO().getDate();

				if (Utilitarios.validarInfo(obsGenIz, responsableMinEduc, cargoIzq, obsGenDer, responsableContrat,
						cargoDer)) {
					informacion = new TInformacionObligatoria(obsGenIz, responsableMinEduc, cargoIzq, obsGenDer,
							responsableContrat, cargoDer, fecha, cabec);
					infoServicio.crear(informacion);
				} else {
					JOptionPane.showMessageDialog(null, "Datos obligatorios");
				}
			}
		});

		infor.getBtnInsertarFoto().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pathFotoInfor = Utilitarios.getPathImagen();
			}
		});

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 144, 640, 354);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblReporte = new JLabel("REPORTE DE INSPECCI\u00D3N A LA UEPTM");
		lblReporte.setFont(new Font("Arial", Font.BOLD, 11));
		lblReporte.setBounds(10, 11, 221, 14);
		panel_1.add(lblReporte);

		JLabel lblDescripcion1 = new JLabel("Descripci\u00F3n 1");
		lblDescripcion1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion1.setOpaque(true);
		lblDescripcion1.setBackground(new Color(176, 196, 222));
		lblDescripcion1.setBounds(10, 36, 200, 18);
		panel_1.add(lblDescripcion1);

		txtDesc1 = new JTextField();
		txtDesc1.setBounds(222, 36, 228, 20);
		panel_1.add(txtDesc1);
		txtDesc1.setColumns(10);

		JLabel lblReferencia = new JLabel("OBSERVACI\u00D3N/PROBLEM\u00C1TICA/REFERENCIA");
		lblReferencia.setFont(new Font("Arial", Font.PLAIN, 11));
		lblReferencia.setBounds(227, 11, 233, 14);
		panel_1.add(lblReferencia);

		JButton btnInsertarFoto1 = new JButton("Insertar FOTO");
		btnInsertarFoto1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pathFoto = Utilitarios.getPathImagen();
			}
		});
		btnInsertarFoto1.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto1.setBounds(460, 34, 125, 23);
		panel_1.add(btnInsertarFoto1);

		JLabel lblDescripcion2 = new JLabel("Descripci\u00F3n 2");
		lblDescripcion2.setOpaque(true);
		lblDescripcion2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion2.setBackground(new Color(211, 211, 211));
		lblDescripcion2.setBounds(10, 67, 200, 18);
		panel_1.add(lblDescripcion2);

		txtDescripcion2 = new JTextField();
		txtDescripcion2.setColumns(10);
		txtDescripcion2.setBounds(222, 67, 228, 20);
		panel_1.add(txtDescripcion2);

		JButton btnInsertarFoto2 = new JButton("Insertar FOTO");
		btnInsertarFoto2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pathFoto = Utilitarios.getPathImagen();
			}
		});
		btnInsertarFoto2.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto2.setBounds(460, 65, 125, 23);
		panel_1.add(btnInsertarFoto2);

		JLabel lblDescripcion3 = new JLabel("Descripci\u00F3n 3");
		lblDescripcion3.setOpaque(true);
		lblDescripcion3.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion3.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion3.setBackground(new Color(176, 196, 222));
		lblDescripcion3.setBounds(10, 98, 200, 18);
		panel_1.add(lblDescripcion3);

		txtDescripcion3 = new JTextField();
		txtDescripcion3.setColumns(10);
		txtDescripcion3.setBounds(222, 98, 228, 20);
		panel_1.add(txtDescripcion3);

		JButton btnInsertarFoto3 = new JButton("Insertar FOTO");
		btnInsertarFoto3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pathFoto = Utilitarios.getPathImagen();
			}
		});
		btnInsertarFoto3.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto3.setBounds(460, 96, 125, 23);
		panel_1.add(btnInsertarFoto3);

		JLabel lblDescripcion4 = new JLabel("Descripci\u00F3n 4");
		lblDescripcion4.setOpaque(true);
		lblDescripcion4.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion4.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion4.setBackground(new Color(211, 211, 211));
		lblDescripcion4.setBounds(10, 129, 200, 18);
		panel_1.add(lblDescripcion4);

		txtDescripcion4 = new JTextField();
		txtDescripcion4.setColumns(10);
		txtDescripcion4.setBounds(222, 129, 228, 20);
		panel_1.add(txtDescripcion4);

		JButton btnInsertarFoto4 = new JButton("Insertar FOTO");
		btnInsertarFoto4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pathFoto = Utilitarios.getPathImagen();
			}
		});
		btnInsertarFoto4.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto4.setBounds(460, 127, 125, 23);
		panel_1.add(btnInsertarFoto4);

		JLabel lblDescripcion5 = new JLabel("Descripci\u00F3n 5");
		lblDescripcion5.setOpaque(true);
		lblDescripcion5.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion5.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion5.setBackground(new Color(176, 196, 222));
		lblDescripcion5.setBounds(10, 160, 200, 18);
		panel_1.add(lblDescripcion5);

		txtDescripcion5 = new JTextField();
		txtDescripcion5.setColumns(10);
		txtDescripcion5.setBounds(222, 160, 228, 20);
		panel_1.add(txtDescripcion5);

		JButton btnInsertarFoto5 = new JButton("Insertar FOTO");
		btnInsertarFoto5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pathFoto = Utilitarios.getPathImagen();
			}
		});
		btnInsertarFoto5.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto5.setBounds(460, 158, 125, 23);
		panel_1.add(btnInsertarFoto5);

		JLabel lblDescripcion6 = new JLabel("Descripci\u00F3n 6");
		lblDescripcion6.setOpaque(true);
		lblDescripcion6.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion6.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion6.setBackground(new Color(211, 211, 211));
		lblDescripcion6.setBounds(10, 191, 200, 18);
		panel_1.add(lblDescripcion6);

		txtDescripcion6 = new JTextField();
		txtDescripcion6.setColumns(10);
		txtDescripcion6.setBounds(222, 191, 228, 20);
		panel_1.add(txtDescripcion6);

		JButton btnInsertarFoto6 = new JButton("Insertar FOTO");
		btnInsertarFoto6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pathFoto = Utilitarios.getPathImagen();
			}
		});
		btnInsertarFoto6.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto6.setBounds(460, 189, 125, 23);
		panel_1.add(btnInsertarFoto6);

		JLabel lblDescripcion7 = new JLabel("Descripci\u00F3n 7");
		lblDescripcion7.setOpaque(true);
		lblDescripcion7.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion7.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion7.setBackground(new Color(176, 196, 222));
		lblDescripcion7.setBounds(10, 222, 200, 18);
		panel_1.add(lblDescripcion7);

		txtDescripcion7 = new JTextField();
		txtDescripcion7.setColumns(10);
		txtDescripcion7.setBounds(222, 222, 228, 20);
		panel_1.add(txtDescripcion7);

		JButton btnInsertarFoto7 = new JButton("Insertar FOTO");
		btnInsertarFoto7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pathFoto = Utilitarios.getPathImagen();
			}
		});
		btnInsertarFoto7.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto7.setBounds(460, 220, 125, 23);
		panel_1.add(btnInsertarFoto7);

		JLabel lblDescripcion8 = new JLabel("Descripci\u00F3n 8");
		lblDescripcion8.setOpaque(true);
		lblDescripcion8.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion8.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion8.setBackground(new Color(211, 211, 211));
		lblDescripcion8.setBounds(10, 253, 200, 18);
		panel_1.add(lblDescripcion8);

		txtDescripcion8 = new JTextField();
		txtDescripcion8.setColumns(10);
		txtDescripcion8.setBounds(222, 253, 228, 20);
		panel_1.add(txtDescripcion8);

		JButton btnInsertarFoto8 = new JButton("Insertar FOTO");
		btnInsertarFoto8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pathFoto = Utilitarios.getPathImagen();
			}
		});
		btnInsertarFoto8.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto8.setBounds(460, 251, 125, 23);
		panel_1.add(btnInsertarFoto8);

		JLabel lblDescripcion9 = new JLabel("Descripci\u00F3n 9");
		lblDescripcion9.setOpaque(true);
		lblDescripcion9.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion9.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion9.setBackground(new Color(176, 196, 222));
		lblDescripcion9.setBounds(10, 284, 200, 18);
		panel_1.add(lblDescripcion9);

		txtDescripcion9 = new JTextField();
		txtDescripcion9.setColumns(10);
		txtDescripcion9.setBounds(222, 284, 228, 20);
		panel_1.add(txtDescripcion9);

		JButton btnInsertarFoto9 = new JButton("Insertar FOTO");
		btnInsertarFoto9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pathFoto = Utilitarios.getPathImagen();
			}
		});
		btnInsertarFoto9.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto9.setBounds(460, 282, 125, 23);
		panel_1.add(btnInsertarFoto9);

		JLabel lblDescripcion10 = new JLabel("Descripci\u00F3n 10");
		lblDescripcion10.setOpaque(true);
		lblDescripcion10.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion10.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion10.setBackground(new Color(211, 211, 211));
		lblDescripcion10.setBounds(10, 315, 200, 18);
		panel_1.add(lblDescripcion10);

		txtDescripcion10 = new JTextField();
		txtDescripcion10.setColumns(10);
		txtDescripcion10.setBounds(222, 315, 228, 20);
		panel_1.add(txtDescripcion10);

		JButton btnInsertarFoto10 = new JButton("Insertar FOTO");
		btnInsertarFoto10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pathFoto = Utilitarios.getPathImagen();
			}
		});
		btnInsertarFoto10.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto10.setBounds(460, 313, 125, 23);
		panel_1.add(btnInsertarFoto10);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		// panel_2.setBorder(new TitledBorder(null, "Informaci\u00F3n
		// Obligatoria", TitledBorder.LEADING, TitledBorder.TOP,
		// null, Color.RED));
		panel_2.setBounds(703, 186, 582, 489);
		contentPane.add(panel_2);

		panel_2.add(infor.getPnlInformacionObl());
	}

	public void cargarCanton() {

	}
}
