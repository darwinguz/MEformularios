package com.capa.presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class AdatosReferenciales extends JFrame {

	private JPanel panelPrincipal;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdatosReferenciales frame = new AdatosReferenciales();
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
	public AdatosReferenciales() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 400);
		setLocationRelativeTo(null);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JLabel lbl_logo_msp = new JLabel("icono MSP");
		lbl_logo_msp.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_logo_msp.setBounds(37, 11, 153, 61);
		panelPrincipal.add(lbl_logo_msp);
		
		JLabel lbl_proyecto = new JLabel("Proyecto");
		lbl_proyecto.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_proyecto.setBounds(221, 34, 230, 14);
		panelPrincipal.add(lbl_proyecto);
		
		JLabel lbl_amie = new JLabel("AMIE");
		lbl_amie.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_amie.setBounds(473, 34, 90, 14);
		panelPrincipal.add(lbl_amie);
		
		JLabel lbl_zona = new JLabel("Zona");
		lbl_zona.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_zona.setBounds(598, 34, 86, 14);
		panelPrincipal.add(lbl_zona);
		
		textField = new JTextField();
		textField.setBounds(221, 52, 230, 20);
		panelPrincipal.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(473, 52, 90, 20);
		panelPrincipal.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lbl_provincia = new JLabel("Provincia");
		lbl_provincia.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_provincia.setBounds(27, 121, 180, 14);
		panelPrincipal.add(lbl_provincia);
		
		JLabel lbl_distrito = new JLabel("Distrito");
		lbl_distrito.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_distrito.setBounds(261, 121, 200, 14);
		panelPrincipal.add(lbl_distrito);
		
		JLabel lbl_circuito = new JLabel("Circuito");
		lbl_circuito.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_circuito.setBounds(496, 121, 200, 14);
		panelPrincipal.add(lbl_circuito);
		
		textField_2 = new JTextField();
		textField_2.setBounds(506, 140, 180, 20);
		panelPrincipal.add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(37, 140, 180, 20);
		panelPrincipal.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(271, 140, 180, 20);
		panelPrincipal.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(598, 52, 90, 20);
		panelPrincipal.add(comboBox_2);
		
		JLabel lbl_canton = new JLabel("Cant\u00F3n");
		lbl_canton.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_canton.setBounds(27, 190, 200, 14);
		panelPrincipal.add(lbl_canton);
		
		JLabel lbl_parroquia = new JLabel("Parroquia");
		lbl_parroquia.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_parroquia.setBounds(261, 190, 200, 14);
		panelPrincipal.add(lbl_parroquia);
		
		JLabel lbl_sector = new JLabel("Sector");
		lbl_sector.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_sector.setBounds(496, 190, 200, 14);
		panelPrincipal.add(lbl_sector);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(37, 210, 180, 20);
		panelPrincipal.add(comboBox_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(271, 210, 180, 20);
		panelPrincipal.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(506, 210, 180, 20);
		panelPrincipal.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(37, 280, 180, 20);
		panelPrincipal.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(271, 280, 180, 20);
		panelPrincipal.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(506, 280, 180, 20);
		panelPrincipal.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lbl_entrega_pedido = new JLabel("Fecha de entrega del Predio");
		lbl_entrega_pedido.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_entrega_pedido.setBounds(27, 260, 200, 14);
		panelPrincipal.add(lbl_entrega_pedido);
		
		JLabel lbl_inicio_trabajo = new JLabel("Fecha de Inicio de Trabajo");
		lbl_inicio_trabajo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_inicio_trabajo.setBounds(261, 260, 200, 14);
		panelPrincipal.add(lbl_inicio_trabajo);
		
		JLabel lbl_elab_informe = new JLabel("Fecha de Elaboraci\u00F3n de Informe");
		lbl_elab_informe.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_elab_informe.setBounds(496, 260, 200, 14);
		panelPrincipal.add(lbl_elab_informe);
		
		JButton btn_foto_general = new JButton("Foto General");
		btn_foto_general.setBounds(65, 327, 125, 23);
		panelPrincipal.add(btn_foto_general);
		
		JButton btn_croquis = new JButton("Croquis");
		btn_croquis.setBounds(301, 327, 125, 23);
		panelPrincipal.add(btn_croquis);
		
		JButton btn_registrar = new JButton("Registrar");
		btn_registrar.setBounds(538, 327, 125, 23);
		panelPrincipal.add(btn_registrar);
	}
}
