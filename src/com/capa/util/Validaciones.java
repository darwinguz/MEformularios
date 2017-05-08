package com.capa.util;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.capa.datos.TInformacionObligatoria;
import com.capa.datos.TdetalleFicha;
import com.capa.presentacion.EmailCliente;

public class Validaciones {

	public static void validarDigitos(JTextField textField) {
		textField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
				// Verificar si la tecla pulsada no es un digito
				if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) {
					e.consume(); // ignorar el evento de teclado
				}
			}
		});
	}

	public static boolean validarInfo(TInformacionObligatoria inf) {
		if (inf.getIoObsGeneralMin().equals("") || inf.getIoResponsableMin().equals("")
				|| inf.getIoCargoMin().equals("") || inf.getIoObsGenCont().equals("")
				|| inf.getIoResponsableCont().equals("") || inf.getIoCargoCont().equals("")
				|| inf.getIoFotoPath() == null) {
			return false;
		}
		return true;
	}

	public static boolean isEstructuraEmail(EmailCliente emailCliente) {
		if (emailCliente.getTxtUser().getText().equals("") || emailCliente.getPwdUser().equals("")
				|| emailCliente.getTxtPara().getText().equals("") || emailCliente.getTxtAsunto().getText().equals("")
				|| emailCliente.getTxtContenidoSMS().getText().equals("")
				|| emailCliente.getTxtPathPDF().getText().equals("")) {
			return false;
		}
		return true;
	}

	public static boolean isCorrectEmail(String email) {
		System.out.println(email);
		boolean valido = false;
		Pattern patronEmail = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

		Matcher mEmail = patronEmail.matcher(email.toLowerCase());
		if (mEmail.matches()) {
			valido = true;
		}
		return valido;
	}

	public static boolean registrosValidados(List<TdetalleFicha> detallesFicha) {
		for (int i = 0; i < detallesFicha.size(); i++) {
			if (detallesFicha.get(i).getDetCantidadEjecutada() > detallesFicha.get(i).getDetCantidadLimite()
					|| detallesFicha.get(i).getDetCantidadEjecutada() < 0) {
				JOptionPane.showMessageDialog(null,
						"ERROR: Verificar que las Cantidades Ingresadas sean menores o iguales a las Cantidades Limite!\n"
								+ "ETIQUETA: " + detallesFicha.get(i).getDetEtiqueta() + "",
						"Mensaje de Error", JOptionPane.ERROR_MESSAGE);
				return false;
			}
		}

		return true;
	}
}
