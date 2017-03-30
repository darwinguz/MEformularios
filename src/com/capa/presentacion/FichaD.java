package com.capa.presentacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.capa.util.Utilitarios;

public class FichaD extends JFrame {

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1165, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		JPcabecera cabecera = new JPcabecera();

		contentPane.add(cabecera.getCabecera());
		contentPane.setLayout(null);

		JPInformacionObligatoria infor = new JPInformacionObligatoria(1, 1);
		cabecera.getBtnRegistrar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (Utilitarios.validarInfo(infor.getTxtObsGenIzq().getText(),
						infor.getTxtResponsableMineduc().getText(), infor.getTxtCargoIzq().getText(),
						infor.getTxtObsGenDer().getText(), infor.getTxtResponsableContratista().getText(),
						infor.getTxtCargoDer().getText(), infor.getTxtFecha().getText())) {
					JOptionPane.showMessageDialog(null, "Datos correctos");
				} else {
					JOptionPane.showMessageDialog(null, "Datos obligatorios");
				}
			}
		});

		infor.getBtnInsertarFoto().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, Utilitarios.getPathImagen());
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
		lblDescripcion1.setBounds(119, 36, 93, 18);
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
				JOptionPane.showMessageDialog(null, Utilitarios.getPathImagen());
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
		lblDescripcion2.setBounds(119, 67, 93, 18);
		panel_1.add(lblDescripcion2);

		txtDescripcion2 = new JTextField();
		txtDescripcion2.setColumns(10);
		txtDescripcion2.setBounds(222, 67, 228, 20);
		panel_1.add(txtDescripcion2);

		JButton btnInsertarFoto2 = new JButton("Insertar FOTO");
		btnInsertarFoto2.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto2.setBounds(460, 65, 125, 23);
		panel_1.add(btnInsertarFoto2);

		JLabel lblDescripcion3 = new JLabel("Descripci\u00F3n 3");
		lblDescripcion3.setOpaque(true);
		lblDescripcion3.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion3.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion3.setBackground(new Color(176, 196, 222));
		lblDescripcion3.setBounds(119, 98, 93, 18);
		panel_1.add(lblDescripcion3);

		txtDescripcion3 = new JTextField();
		txtDescripcion3.setColumns(10);
		txtDescripcion3.setBounds(222, 98, 228, 20);
		panel_1.add(txtDescripcion3);

		JButton btnInsertarFoto3 = new JButton("Insertar FOTO");
		btnInsertarFoto3.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto3.setBounds(460, 96, 125, 23);
		panel_1.add(btnInsertarFoto3);

		JLabel lblDescripcion4 = new JLabel("Descripci\u00F3n 4");
		lblDescripcion4.setOpaque(true);
		lblDescripcion4.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion4.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion4.setBackground(new Color(211, 211, 211));
		lblDescripcion4.setBounds(119, 129, 93, 18);
		panel_1.add(lblDescripcion4);

		txtDescripcion4 = new JTextField();
		txtDescripcion4.setColumns(10);
		txtDescripcion4.setBounds(222, 129, 228, 20);
		panel_1.add(txtDescripcion4);

		JButton btnInsertarFoto4 = new JButton("Insertar FOTO");
		btnInsertarFoto4.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto4.setBounds(460, 127, 125, 23);
		panel_1.add(btnInsertarFoto4);

		JLabel lblDescripcion5 = new JLabel("Descripci\u00F3n 5");
		lblDescripcion5.setOpaque(true);
		lblDescripcion5.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion5.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion5.setBackground(new Color(176, 196, 222));
		lblDescripcion5.setBounds(119, 160, 93, 18);
		panel_1.add(lblDescripcion5);

		txtDescripcion5 = new JTextField();
		txtDescripcion5.setColumns(10);
		txtDescripcion5.setBounds(222, 160, 228, 20);
		panel_1.add(txtDescripcion5);

		JButton btnInsertarFoto5 = new JButton("Insertar FOTO");
		btnInsertarFoto5.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto5.setBounds(460, 158, 125, 23);
		panel_1.add(btnInsertarFoto5);

		JLabel lblDescripcion6 = new JLabel("Descripci\u00F3n 6");
		lblDescripcion6.setOpaque(true);
		lblDescripcion6.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion6.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion6.setBackground(new Color(211, 211, 211));
		lblDescripcion6.setBounds(119, 191, 93, 18);
		panel_1.add(lblDescripcion6);

		txtDescripcion6 = new JTextField();
		txtDescripcion6.setColumns(10);
		txtDescripcion6.setBounds(222, 191, 228, 20);
		panel_1.add(txtDescripcion6);

		JButton btnInsertarFoto6 = new JButton("Insertar FOTO");
		btnInsertarFoto6.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto6.setBounds(460, 189, 125, 23);
		panel_1.add(btnInsertarFoto6);

		JLabel lblDescripcion7 = new JLabel("Descripci\u00F3n 7");
		lblDescripcion7.setOpaque(true);
		lblDescripcion7.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion7.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion7.setBackground(new Color(176, 196, 222));
		lblDescripcion7.setBounds(119, 222, 93, 18);
		panel_1.add(lblDescripcion7);

		txtDescripcion7 = new JTextField();
		txtDescripcion7.setColumns(10);
		txtDescripcion7.setBounds(222, 222, 228, 20);
		panel_1.add(txtDescripcion7);

		JButton btnInsertarFoto7 = new JButton("Insertar FOTO");
		btnInsertarFoto7.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto7.setBounds(460, 220, 125, 23);
		panel_1.add(btnInsertarFoto7);

		JLabel lblDescripcion8 = new JLabel("Descripci\u00F3n 8");
		lblDescripcion8.setOpaque(true);
		lblDescripcion8.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion8.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion8.setBackground(new Color(211, 211, 211));
		lblDescripcion8.setBounds(119, 253, 93, 18);
		panel_1.add(lblDescripcion8);

		txtDescripcion8 = new JTextField();
		txtDescripcion8.setColumns(10);
		txtDescripcion8.setBounds(222, 253, 228, 20);
		panel_1.add(txtDescripcion8);

		JButton btnInsertarFoto8 = new JButton("Insertar FOTO");
		btnInsertarFoto8.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto8.setBounds(460, 251, 125, 23);
		panel_1.add(btnInsertarFoto8);

		JLabel lblDescripcion9 = new JLabel("Descripci\u00F3n 9");
		lblDescripcion9.setOpaque(true);
		lblDescripcion9.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion9.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion9.setBackground(new Color(176, 196, 222));
		lblDescripcion9.setBounds(119, 284, 93, 18);
		panel_1.add(lblDescripcion9);

		txtDescripcion9 = new JTextField();
		txtDescripcion9.setColumns(10);
		txtDescripcion9.setBounds(222, 284, 228, 20);
		panel_1.add(txtDescripcion9);

		JButton btnInsertarFoto9 = new JButton("Insertar FOTO");
		btnInsertarFoto9.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto9.setBounds(460, 282, 125, 23);
		panel_1.add(btnInsertarFoto9);

		JLabel lblDescripcion10 = new JLabel("Descripci\u00F3n 10");
		lblDescripcion10.setOpaque(true);
		lblDescripcion10.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion10.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion10.setBackground(new Color(211, 211, 211));
		lblDescripcion10.setBounds(119, 315, 93, 18);
		panel_1.add(lblDescripcion10);

		txtDescripcion10 = new JTextField();
		txtDescripcion10.setColumns(10);
		txtDescripcion10.setBounds(222, 315, 228, 20);
		panel_1.add(txtDescripcion10);

		JButton btnInsertarFoto10 = new JButton("Insertar FOTO");
		btnInsertarFoto10.setFont(new Font("Arial", Font.BOLD, 12));
		btnInsertarFoto10.setBounds(460, 313, 125, 23);
		panel_1.add(btnInsertarFoto10);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		// panel_2.setBorder(new TitledBorder(null, "Informaci\u00F3n
		// Obligatoria", TitledBorder.LEADING, TitledBorder.TOP,
		// null, Color.RED));
		panel_2.setBounds(703, 186, 406, 269);
		contentPane.add(panel_2);

		panel_2.add(infor.getPnlInformacionObl());

		// JLabel label_12 = new JLabel("Observaciones Generales:");
		// label_12.setHorizontalAlignment(SwingConstants.RIGHT);
		// label_12.setFont(new Font("Arial", Font.PLAIN, 11));
		// label_12.setBounds(10, 26, 139, 14);
		// panel_2.add(label_12);
		//
		// txtObsGenD = new JTextField();
		// txtObsGenD.setColumns(10);
		// txtObsGenD.setBounds(159, 23, 228, 20);
		// panel_2.add(txtObsGenD);
		//
		// JLabel label_13 = new JLabel("Responsable MinEduc:");
		// label_13.setHorizontalAlignment(SwingConstants.RIGHT);
		// label_13.setFont(new Font("Arial", Font.PLAIN, 11));
		// label_13.setBounds(10, 52, 139, 14);
		// panel_2.add(label_13);
		//
		// txtResponsableD = new JTextField();
		// txtResponsableD.setColumns(10);
		// txtResponsableD.setBounds(159, 49, 228, 20);
		// panel_2.add(txtResponsableD);
		//
		// JLabel label_14 = new JLabel("Cargo:");
		// label_14.setHorizontalAlignment(SwingConstants.RIGHT);
		// label_14.setFont(new Font("Arial", Font.PLAIN, 11));
		// label_14.setBounds(10, 78, 139, 14);
		// panel_2.add(label_14);
		//
		// txtCargoD = new JTextField();
		// txtCargoD.setColumns(10);
		// txtCargoD.setBounds(159, 75, 228, 20);
		// panel_2.add(txtCargoD);
		//
		// JLabel label_15 = new JLabel("Observaciones Generales:");
		// label_15.setHorizontalAlignment(SwingConstants.RIGHT);
		// label_15.setFont(new Font("Arial", Font.PLAIN, 11));
		// label_15.setBounds(10, 120, 139, 14);
		// panel_2.add(label_15);
		//
		// txtObsGen2D = new JTextField();
		// txtObsGen2D.setColumns(10);
		// txtObsGen2D.setBounds(159, 117, 228, 20);
		// panel_2.add(txtObsGen2D);
		//
		// JLabel label_16 = new JLabel("Responsable Contratista");
		// label_16.setHorizontalAlignment(SwingConstants.RIGHT);
		// label_16.setFont(new Font("Arial", Font.PLAIN, 11));
		// label_16.setBounds(10, 146, 139, 14);
		// panel_2.add(label_16);
		//
		// txtResponsableContraD = new JTextField();
		// txtResponsableContraD.setColumns(10);
		// txtResponsableContraD.setBounds(159, 143, 228, 20);
		// panel_2.add(txtResponsableContraD);
		//
		// JLabel label_17 = new JLabel("Cargo:");
		// label_17.setHorizontalAlignment(SwingConstants.RIGHT);
		// label_17.setFont(new Font("Arial", Font.PLAIN, 11));
		// label_17.setBounds(10, 172, 139, 14);
		// panel_2.add(label_17);
		//
		// txtCargo2D = new JTextField();
		// txtCargo2D.setColumns(10);
		// txtCargo2D.setBounds(159, 169, 228, 20);
		// panel_2.add(txtCargo2D);
		//
		// JLabel label_18 = new JLabel("Fecha:");
		// label_18.setHorizontalAlignment(SwingConstants.RIGHT);
		// label_18.setFont(new Font("Arial", Font.PLAIN, 11));
		// label_18.setBounds(10, 198, 139, 14);
		// panel_2.add(label_18);
		//
		// txtFechaD = new JTextField();
		// txtFechaD.setColumns(10);
		// txtFechaD.setBounds(159, 195, 228, 20);
		// panel_2.add(txtFechaD);
		//
		// JButton btnFotoD = new JButton("Insertar Foto General");
		// btnFotoD.setFont(new Font("Arial", Font.BOLD, 14));
		// btnFotoD.setBounds(157, 226, 214, 23);
		// panel_2.add(btnFotoD);
	}

	private void obtenerDatos() {
		String desc1, desc2, desc3, desc4, desc5, desc6, desc7, desc8, desc9, desc10;
		desc1 = txtDesc1.getText();
	}
}
