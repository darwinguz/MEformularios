package com.capa.presentacion;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FichaB extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6881692801126802167L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FichaB frame = new FichaB();
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
	public FichaB() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 206, 241);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JPanel pnlBotones = new JPanel();
		pnlBotones.setBounds(10, 11, 171, 145);
		contentPane.add(pnlBotones);
		pnlBotones.setLayout(new GridLayout(4, 1, 0, 2));

		JButton btnAcometidas = new JButton("Acometidas");
		pnlBotones.add(btnAcometidas);
		btnAcometidas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new FichaBAcom().setVisible(true);
				dispose();
			}
		});

		JButton btnBateriasSan = new JButton("Baterias Sanitarias");
		pnlBotones.add(btnBateriasSan);
		btnBateriasSan.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new FichaBbateriasSanitarias().setVisible(true);
				dispose();
			}
		});

		JButton btnRevisionBloques = new JButton("Revision Bloques");
		pnlBotones.add(btnRevisionBloques);
		btnRevisionBloques.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new FichaBRevisionBloques().setVisible(true);
				dispose();
			}
		});

		JButton btnRecreacionExt = new JButton("Recreacion y Exteriores");
		pnlBotones.add(btnRecreacionExt);
		btnRecreacionExt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new FichaBrecreacionExteriores().setVisible(true);
				dispose();
			}
		});

		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(109, 163, 72, 32);
		contentPane.add(btnSalir);
		btnSalir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();

			}
		});

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				new AlInicio().setVisible(true);
				dispose();
			}
		});

	}
}
