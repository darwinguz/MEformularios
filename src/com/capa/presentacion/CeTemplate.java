package com.capa.presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;

import static com.capa.util.Utilitarios.*;
import static com.capa.util.Validaciones.*;

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
	public CeTemplate() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1320, 730);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		setContentPane(panelPrincipal);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setTitle("CE");

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
		txtCECantidad00.setEditable(false);
		txtCECantidad00.setColumns(10);
		panel_2.add(txtCECantidad00);

		txtCECantidad01 = new JTextField();
		txtCECantidad01.setColumns(10);
		panel_2.add(txtCECantidad01);

		txtCECantidad10 = new JTextField();
		txtCECantidad10.setEditable(false);
		txtCECantidad10.setColumns(10);
		panel_2.add(txtCECantidad10);

		txtCECantidad11 = new JTextField();
		txtCECantidad11.setColumns(10);
		panel_2.add(txtCECantidad11);

		txtCECantidad20 = new JTextField();
		txtCECantidad20.setEditable(false);
		txtCECantidad20.setColumns(10);
		panel_2.add(txtCECantidad20);

		txtCECantidad21 = new JTextField();
		txtCECantidad21.setColumns(10);
		panel_2.add(txtCECantidad21);

		txtCECantidad30 = new JTextField();
		txtCECantidad30.setEditable(false);
		txtCECantidad30.setColumns(10);
		panel_2.add(txtCECantidad30);

		txtCECantidad31 = new JTextField();
		txtCECantidad31.setColumns(10);
		panel_2.add(txtCECantidad31);

		txtCECantidad40 = new JTextField();
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

}
