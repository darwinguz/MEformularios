package com.capa.negocios;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class Email {

	public boolean enviarCorreo(String de, String clave, String para, Multipart mensaje, String asunto) {
		boolean enviado = false;

		String host = "smtp.gmail.com";
		Properties prop = System.getProperties();

		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.host", host);
		prop.put("mail.smtp.user", de);
		prop.put("mail.smtp.password", clave);
		prop.put("mail.smtp.port", 587);
		prop.put("mail.smtp.auth", "true");

		Session sesion = Session.getDefaultInstance(prop, null);

		MimeMessage message = new MimeMessage(sesion);

		try {
			message.setFrom(new InternetAddress(de));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(para));
			message.setSubject(asunto);
			message.setContent(mensaje);

			Transport transport;
			transport = sesion.getTransport("smtp");
			transport.connect(host, de, clave);
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();

			enviado = true;
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return enviado;
	}
}
