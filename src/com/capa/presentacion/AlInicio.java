package com.capa.presentacion;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.capa.datos.TCabecera;
import com.capa.negocios.ClaseCabecera;
import com.capa.negocios.ComponenteProyecto;

public class AlInicio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2063817460198744409L;
	private JPanel contentPane;
	private JTextField textField;
	private TCabecera tCabecera;

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
		setTitle("DIRECCI�N NACIONAL DE INFRAESTRUCTURA F�SICA");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		ComponenteProyecto comProyecto = new ComponenteProyecto();

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
		btnReporteInsp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				FichaD fichaD = new FichaD();
				fichaD.setVisible(true);
			}
		});
		pnlBotones.add(btnReporteInsp);

		JLabel lblBuscarProyecto = new JLabel("Buscar Proyecto");
		lblBuscarProyecto.setBounds(86, 30, 102, 14);
		contentPane.add(lblBuscarProyecto);

		textField = new JTextField();
		textField.setBounds(187, 27, 187, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.addKeyListener(new KeyAdapter() {
			public void keyPressed(final KeyEvent e) {
				int key = e.getKeyCode();
				if (key == KeyEvent.VK_ENTER) {
					try {
						tCabecera = comProyecto.buscarPorNombre(textField.getText());
						ClaseCabecera clC = ClaseCabecera.getInstanciaCab(tCabecera);
						System.out.println(tCabecera.getTLugarGeografico().getLgCodigo());
						System.out.println(tCabecera.getCircuito());
						System.out.println("Clase singleton " + clC.getCabecSingleton().getCircuito());
						textField.setEnabled(false);
					} catch (NullPointerException np) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null, "No existe el proyecto ");
						textField.setEnabled(true);
					}
				}
			}
		});
	}
}
