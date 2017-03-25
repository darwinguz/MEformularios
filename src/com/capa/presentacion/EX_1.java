package com.capa.presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.capa.util.Utilitarios;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class EX_1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EX_1 frame = new EX_1();
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
	public EX_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1061, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 996, 103);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblLogoMinEdu = new JLabel("");
		lblLogoMinEdu.setIcon(Utilitarios.getImagenIcon("logoMinEdu.png", 160, 80, 100));
		lblLogoMinEdu.setBounds(10, 11, 160, 81);
		panel.add(lblLogoMinEdu);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(196, 24, 198, 20);
		panel.add(textPane);
		
		textField = new JTextField();
		textField.setBounds(425, 24, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(535, 24, 160, 20);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(196, 72, 50, 20);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(271, 72, 125, 20);
		panel.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(425, 72, 125, 20);
		panel.add(comboBox_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(705, 24, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(801, 24, 86, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(900, 24, 86, 20);
		panel.add(textField_3);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(593, 72, 125, 20);
		panel.add(textPane_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(746, 72, 208, 20);
		panel.add(textField_4);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 133, 913, 272);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
	}
}
