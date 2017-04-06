package com.capa.util;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;

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

	public static boolean validarInfo(String... campos) {
		boolean valida = true;
		for (String texto : campos) {
			if (!texto.equals("")) {
				continue;
			} else {
				valida = false;
				break;
			}
		}
		return valida;
	}

}
