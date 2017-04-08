package com.capa.util;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;

import com.capa.datos.TInformacionObligatoria;

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
		boolean valida = true;
		if (inf.getIoCargoCont().equals("") && inf.getIoCargoMin().equals("") && inf.getIoObsGenCont().equals("")
				&& inf.getIoObsGeneral().equals("") && inf.getIoResponsableCont().equals("")
				&& inf.getIoResponsableMin().equals("")) {
			valida = false;
		}
		return valida;
	}

}
