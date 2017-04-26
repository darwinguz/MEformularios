package com.capa.presentacion;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.capa.util.Utilitarios;

public class EmailCliente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1297314666612703970L;
	private JPanel contentPane;
	private JTextField txtUser;
	private JTextField txtPara;
	private JTextField txtAsunto;
	private JPasswordField pwdUser;
	private JTextField txtPathPDF;
	private JButton btnEnviar;
	private JButton btnAddArchivo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmailCliente frame = new EmailCliente();
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
	public EmailCliente() {
		setTitle("Cliente de Mensajería");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 297);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Usuario: ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(10, 11, 51, 14);
		contentPane.add(lblNewLabel);

		JLabel lblPara = new JLabel("Para: ");
		lblPara.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPara.setBounds(10, 36, 51, 14);
		contentPane.add(lblPara);

		JLabel lblContrasea = new JLabel("Clave: ");
		lblContrasea.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContrasea.setBounds(236, 11, 63, 14);
		contentPane.add(lblContrasea);

		txtUser = new JTextField();
		txtUser.setBounds(60, 8, 166, 20);
		contentPane.add(txtUser);
		txtUser.setColumns(10);

		txtPara = new JTextField();
		txtPara.setColumns(10);
		txtPara.setBounds(60, 33, 166, 20);
		contentPane.add(txtPara);

		txtAsunto = new JTextField();
		txtAsunto.setColumns(10);
		txtAsunto.setBounds(60, 58, 301, 20);
		contentPane.add(txtAsunto);

		JLabel label = new JLabel("Asunto: ");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(10, 61, 51, 14);
		contentPane.add(label);

		pwdUser = new JPasswordField();
		pwdUser.setBounds(307, 8, 153, 20);
		contentPane.add(pwdUser);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 86, 450, 162);
		contentPane.add(textArea);

		JLabel lblAdjunto = new JLabel("Adjunto: ");
		lblAdjunto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAdjunto.setBounds(236, 36, 63, 14);
		contentPane.add(lblAdjunto);

		txtPathPDF = new JTextField();
		txtPathPDF.setEditable(false);
		txtPathPDF.setBounds(307, 33, 122, 20);
		contentPane.add(txtPathPDF);
		txtPathPDF.setColumns(10);

		btnAddArchivo = new JButton("");
		btnAddArchivo.setBounds(433, 32, 27, 23);
		btnAddArchivo.setIcon(new ImageIcon(Utilitarios.getImagen("pdf_adjuntar.png", 20, 20, 100)));
		contentPane.add(btnAddArchivo);

		btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(371, 57, 89, 23);
		contentPane.add(btnEnviar);
	}
}
