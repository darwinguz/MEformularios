package com.capa.presentacion;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AlInicio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2063817460198744409L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlInicio frame = new AlInicio();
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
	public AlInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 430);
		setTitle("DIRECCIÓN NACIONAL DE INFRAESTRUCTURA FÍSICA");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel pnlBotones = new JPanel();
		pnlBotones.setBounds(86, 71, 288, 309);
		contentPane.add(pnlBotones);
		pnlBotones.setLayout(new GridLayout(6, 0, 0, 5));

		JButton btnDatosGenerales = new JButton("1.- Datos Generales UEPTM");
		pnlBotones.add(btnDatosGenerales);

		JButton btnAvanceGeneral = new JButton("2.- Avance General (A)");
		pnlBotones.add(btnAvanceGeneral);

		JButton btnRevisionCaract = new JButton("3.- Revisi\u00F3n Caracter\u00EDsticas T\u00E9cnicas (B)");
		pnlBotones.add(btnRevisionCaract);

		JButton btnCuantifComp = new JButton("4.- Cuantificaci\u00F3n Componentes (C)");
		pnlBotones.add(btnCuantifComp);

		JButton btnReporteAct = new JButton("5.- Reporte de Actividades (C.1)");
		pnlBotones.add(btnReporteAct);

		JButton btnReporteInsp = new JButton("6.- Reporte de Inspecci\u00F3n (D)");
		pnlBotones.add(btnReporteInsp);
		
		JLabel lblBuscarProyecto = new JLabel("Buscar Proyecto");
		lblBuscarProyecto.setBounds(86, 30, 102, 14);
		contentPane.add(lblBuscarProyecto);
		
		textField = new JTextField();
		textField.setBounds(187, 27, 187, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
