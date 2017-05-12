package com.capa.presentacion;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.MessagingException;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.capa.negocios.EmailServer;
import com.capa.util.Utilitarios;
import com.capa.util.Validaciones;

public class EmailCliente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1297314666612703970L;
	private JTextField txtUser;
	private JTextField txtPara;
	private JTextField txtAsunto;
	private JPasswordField pwdUser;
	private JTextField txtPathPDF;
	private String txtPathNamePDF;
	private JButton btnEnviar;
	private JButton btnAddArchivo;
	private JTextArea txtContenidoSMS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				if (JOptionPane.showConfirmDialog(null, "Desea enviar el formulario por correro electrónico?", "Email",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {

					EmailServer emailServer = new EmailServer();
					EmailCliente emailCliente = new EmailCliente();
					emailCliente.addWindowListener(new WindowListener() {
						public void windowOpened(WindowEvent e) {
							System.out.println("OPEN>>>");
						}

						public void windowActivated(WindowEvent e) {
						}

						public void windowDeactivated(WindowEvent e) {
						}

						public void windowIconified(WindowEvent e) {
						}

						public void windowDeiconified(WindowEvent e) {
						}

						public void windowClosed(WindowEvent e) {
						}

						public void windowClosing(WindowEvent e) {
							System.out.println("CLOSE>>>");
							e.getWindow().dispose();
						}
					});

					emailCliente.getBtnAddArchivo().addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							JFileChooser path = Utilitarios.getPathPDF();
							emailCliente.getTxtPathPDF().setText(path.getSelectedFile().getAbsolutePath());
							emailCliente.setTxtPathNamePDF(path.getSelectedFile().getName());
						}
					});

					emailCliente.getBtnEnviar().addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {

							BodyPart partBodyContenido = new MimeBodyPart();
							BodyPart partBodyAdjunto = new MimeBodyPart();
							MimeMultipart multiParte = new MimeMultipart();

							String de = emailCliente.getTxtUser().getText();
							char aux[] = emailCliente.getPwdUser().getPassword();
							String clave = new String(aux);
							String para = emailCliente.getTxtPara().getText();
							String asunto = emailCliente.getTxtAsunto().getText();
							String contenidoSMS = emailCliente.getTxtContenidoSMS().getText();

							try {
								partBodyContenido.setText(contenidoSMS);
								partBodyAdjunto.setDataHandler(
										new DataHandler(new FileDataSource(emailCliente.getTxtPathPDF().getText())));
								partBodyAdjunto.setFileName(emailCliente.getTxtPathNamePDF());
								multiParte.addBodyPart(partBodyContenido);
								multiParte.addBodyPart(partBodyAdjunto);

								if (Validaciones.isEstructuraEmail(emailCliente)) {
									if (Validaciones.isCorrectEmail(de) && Validaciones.isCorrectEmail(para)) {
										boolean resultado = emailServer.enviarCorreo(de, clave, para, multiParte,
												asunto);
										if (resultado) {
											JOptionPane.showMessageDialog(null, "Enviado exitosamente ", "CONFIRMACIÓN",
													JOptionPane.INFORMATION_MESSAGE);
											emailCliente.dispose();
										}
									} else {
										JOptionPane.showMessageDialog(null, "Verificar EMAIL", "ERROR",
												JOptionPane.ERROR_MESSAGE);
									}

								} else {
									JOptionPane.showMessageDialog(null, "Agregar datos requeridos! ", "ADVERTENCIA",
											JOptionPane.INFORMATION_MESSAGE);
								}

							} catch (MessagingException ex) {
								JOptionPane.showMessageDialog(null, "Error al enviar el EMAIL " + ex.getMessage(),
										"ERROR", JOptionPane.ERROR_MESSAGE);
							}

						}
					});

				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EmailCliente() {
		setTitle("Cliente de Mensajería");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 483, 297);

		JPanel pnlPrincipal = new JPanel();
		pnlPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		pnlPrincipal.setLayout(null);

		JLabel lblUser = new JLabel("Usuario: ");
		lblUser.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUser.setBounds(10, 11, 51, 14);

		JLabel lblPara = new JLabel("Para: ");
		lblPara.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPara.setBounds(10, 36, 51, 14);

		JLabel lblContrasea = new JLabel("Clave: ");
		lblContrasea.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContrasea.setBounds(236, 11, 63, 14);

		txtUser = new JTextField();
		txtUser.setBounds(60, 8, 166, 20);

		txtUser.setColumns(10);

		txtPara = new JTextField();
		txtPara.setColumns(10);
		txtPara.setBounds(60, 33, 166, 20);

		txtAsunto = new JTextField();
		txtAsunto.setColumns(10);
		txtAsunto.setBounds(60, 58, 301, 20);

		JLabel lblAsunto = new JLabel("Asunto: ");
		lblAsunto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAsunto.setBounds(10, 61, 51, 14);

		pwdUser = new JPasswordField();
		pwdUser.setBounds(307, 8, 153, 20);

		txtContenidoSMS = new JTextArea();
		txtContenidoSMS.setBounds(10, 86, 450, 162);

		JLabel lblAdjunto = new JLabel("Adjunto: ");
		lblAdjunto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAdjunto.setBounds(236, 36, 63, 14);

		txtPathPDF = new JTextField();
		txtPathPDF.setEditable(false);
		txtPathPDF.setBounds(307, 33, 122, 20);
		txtPathPDF.setColumns(10);

		btnAddArchivo = new JButton();
		btnAddArchivo.setBounds(433, 32, 27, 23);
		btnAddArchivo.setIcon(new ImageIcon(Utilitarios.getImagen("pdf_adjuntar.png", 20, 20, 100)));

		btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(371, 57, 89, 23);

		setContentPane(pnlPrincipal);

		pnlPrincipal.add(lblAsunto);
		pnlPrincipal.add(lblUser);
		pnlPrincipal.add(lblPara);
		pnlPrincipal.add(lblContrasea);
		pnlPrincipal.add(lblAdjunto);
		pnlPrincipal.add(txtUser);
		pnlPrincipal.add(txtPara);
		pnlPrincipal.add(pwdUser);
		pnlPrincipal.add(txtAsunto);
		pnlPrincipal.add(txtContenidoSMS);
		pnlPrincipal.add(txtPathPDF);
		pnlPrincipal.add(btnAddArchivo);
		pnlPrincipal.add(btnEnviar);

		setVisible(true);
		setLocationRelativeTo(null);
	}

	public JTextField getTxtUser() {
		return txtUser;
	}

	public void setTxtUser(JTextField txtUser) {
		this.txtUser = txtUser;
	}

	public JTextField getTxtPara() {
		return txtPara;
	}

	public void setTxtPara(JTextField txtPara) {
		this.txtPara = txtPara;
	}

	public JTextField getTxtAsunto() {
		return txtAsunto;
	}

	public void setTxtAsunto(JTextField txtAsunto) {
		this.txtAsunto = txtAsunto;
	}

	public JPasswordField getPwdUser() {
		return pwdUser;
	}

	public void setPwdUser(JPasswordField pwdUser) {
		this.pwdUser = pwdUser;
	}

	public JTextField getTxtPathPDF() {
		return txtPathPDF;
	}

	public void setTxtPathPDF(JTextField txtPathPDF) {
		this.txtPathPDF = txtPathPDF;
	}

	public JButton getBtnEnviar() {
		return btnEnviar;
	}

	public void setBtnEnviar(JButton btnEnviar) {
		this.btnEnviar = btnEnviar;
	}

	public JButton getBtnAddArchivo() {
		return btnAddArchivo;
	}

	public void setBtnAddArchivo(JButton btnAddArchivo) {
		this.btnAddArchivo = btnAddArchivo;
	}

	public JTextArea getTxtContenidoSMS() {
		return txtContenidoSMS;
	}

	public void setTxtContenidoSMS(JTextArea txtContenidoSMS) {
		this.txtContenidoSMS = txtContenidoSMS;
	}

	public String getTxtPathNamePDF() {
		return txtPathNamePDF;
	}

	public void setTxtPathNamePDF(String txtPathNamePDF) {
		this.txtPathNamePDF = txtPathNamePDF;
	}

}
