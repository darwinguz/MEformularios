package com.capa.presentacion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.capa.util.Utilitarios;

import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OpcionFichaA extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9121904977530588307L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			OpcionFichaA dialog = new OpcionFichaA();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public OpcionFichaA() {
		setBounds(100, 100, 238, 163);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		this.setTitle("Opciones Ficha A");
		this.setLocationRelativeTo(null);
		this.setResizable(false);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 202, 73);
		contentPanel.add(panel);
		panel.setLayout(null);

		ButtonGroup grupoRadios = new ButtonGroup();

		JRadioButton rdbtnModuloC = new JRadioButton("Ficha C");
		rdbtnModuloC.setBounds(33, 7, 132, 23);
		panel.add(rdbtnModuloC);

		JRadioButton rdbtnModuloC_1 = new JRadioButton("Ficha C1");
		rdbtnModuloC_1.setBounds(33, 33, 132, 23);
		grupoRadios.add(rdbtnModuloC);
		grupoRadios.add(rdbtnModuloC_1);
		panel.add(rdbtnModuloC_1);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if (rdbtnModuloC.isSelected()) {
							Utilitarios.setFichaC1(false);
						} else {
							Utilitarios.setFichaC1(true);
						}
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}
