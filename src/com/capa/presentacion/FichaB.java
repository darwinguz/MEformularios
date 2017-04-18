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

import com.capa.negocios.ComponenteFicha;
import com.capa.negocios.ServicioFicha;

public class FichaB extends JFrame {

	private static final long serialVersionUID = -6881692801126802167L;
	private JPanel pnlPrincipal;
	ServicioFicha srvFicha = new ComponenteFicha();

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

	public FichaB() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 206, 220);
		setTitle("Ficha B");
		setLocationRelativeTo(null);
		pnlPrincipal = new JPanel();
		pnlPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		pnlPrincipal.setLayout(null);
		setContentPane(pnlPrincipal);

		JPanel pnlBotones = new JPanel();
		pnlBotones.setBounds(10, 11, 171, 145);
		pnlPrincipal.add(pnlBotones);
		pnlBotones.setLayout(new GridLayout(4, 1, 0, 2));

		JButton btnAcometidas = new JButton("Acometidas");
		pnlBotones.add(btnAcometidas);
		btnAcometidas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new FichaBacometidas(srvFicha.buscarFormulario("FB-A")).setVisible(true);
				dispose();
			}
		});

		JButton btnBateriasSan = new JButton("Baterias Sanitarias");
		pnlBotones.add(btnBateriasSan);
		btnBateriasSan.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new FichaBbateriasSanitarias(srvFicha.buscarFormulario("FB-S")).setVisible(true);
				dispose();
			}
		});

		JButton btnRevisionBloques = new JButton("Revisión Bloques");
		pnlBotones.add(btnRevisionBloques);
		btnRevisionBloques.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				new FichaBRevisionBloques(srvFicha.buscarFormulario("FB-RB")).setVisible(true);
				dispose();
			}
		});

		JButton btnRecreacionExt = new JButton("Recreación y Exteriores");
		pnlBotones.add(btnRecreacionExt);
		btnRecreacionExt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				new FichaBrecreacionExteriores(srvFicha.buscarFormulario("FB-RE")).setVisible(true);
				dispose();
			}
		});

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				new AlInicio().setVisible(true);
				dispose();
			}
		});

	}
}
