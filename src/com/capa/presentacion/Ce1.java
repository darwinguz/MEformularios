package com.capa.presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;

public class Ce1 extends JFrame {

	private JPanel panelPrincipal;
	private JTextField textField00;
	private JTextField textField01;
	private JTextField textField10;
	private JTextField textField11;
	private JTextField textField20;
	private JTextField textField21;
	private JTextField textField30;
	private JTextField textField31;
	private JTextField textField40;
	private JTextField textField41;
	private JTextField textField0;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ce1 frame = new Ce1();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ce1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1320, 730);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		setContentPane(panelPrincipal);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 125, 1286, 560);
		panelPrincipal.add(tabbedPane);

		JPanel pnlPestaña1 = new JPanel();
		tabbedPane.addTab("1.- CE-cerramiento", null, pnlPestaña1, null);
		pnlPestaña1.setLayout(null);

		JPcabecera cabecera = new JPcabecera();
		panelPrincipal.add(cabecera.getCabecera());

		JPInformacionObligatoria infoObligatoria = new JPInformacionObligatoria(434, 377);
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

		textField_17 = new JTextField();
		textField_17.setColumns(10);
		panel_6.add(textField_17);

		textField_15 = new JTextField();
		textField_15.setColumns(10);
		panel_6.add(textField_15);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(267, 17, 143, 29);
		pnlModuloWPC.add(panel_7);
		panel_7.setLayout(new GridLayout(1, 0, 0, 0));

		textField_16 = new JTextField();
		textField_16.setColumns(10);
		panel_7.add(textField_16);

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

		textField00 = new JTextField();
		textField00.setColumns(10);
		panel_2.add(textField00);

		textField01 = new JTextField();
		textField01.setColumns(10);
		panel_2.add(textField01);

		textField10 = new JTextField();
		textField10.setColumns(10);
		panel_2.add(textField10);

		textField11 = new JTextField();
		textField11.setColumns(10);
		panel_2.add(textField11);

		textField20 = new JTextField();
		textField20.setColumns(10);
		panel_2.add(textField20);

		textField21 = new JTextField();
		textField21.setColumns(10);
		panel_2.add(textField21);

		textField30 = new JTextField();
		textField30.setColumns(10);
		panel_2.add(textField30);

		textField31 = new JTextField();
		textField31.setColumns(10);
		panel_2.add(textField31);

		textField40 = new JTextField();
		textField40.setColumns(10);
		panel_2.add(textField40);

		textField41 = new JTextField();
		textField41.setColumns(10);
		panel_2.add(textField41);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(267, 17, 143, 144);
		pnlCompEstructural.add(panel_3);
		panel_3.setLayout(new GridLayout(5, 0, 0, 0));

		textField0 = new JTextField();
		textField0.setColumns(10);
		panel_3.add(textField0);

		textField1 = new JTextField();
		textField1.setColumns(10);
		panel_3.add(textField1);

		textField2 = new JTextField();
		textField2.setColumns(10);
		panel_3.add(textField2);

		textField3 = new JTextField();
		textField3.setColumns(10);
		panel_3.add(textField3);

		textField4 = new JTextField();
		textField4.setColumns(10);
		panel_3.add(textField4);

	}

}
