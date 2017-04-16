package com.capa.util;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.capa.datos.TInformacionObligatoria;
import com.capa.datos.TdetalleFicha;

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
		System.out.println(inf);
		if (inf.getIoCargoCont().equals("") || inf.getIoCargoMin().equals("") || inf.getIoObsGenCont().equals("")
				|| inf.getIoObsGeneral().equals("") || inf.getIoResponsableCont().equals("")
				|| inf.getIoResponsableMin().equals("") || inf.getIoFotoPath().equals("")) {
			return false;
		}
		return true;
	}

	public static boolean registrosValidados(List<TdetalleFicha> detallesFicha) {
		for (int i = 0; i < detallesFicha.size(); i++) {
			if (detallesFicha.get(i).getDetCantidadEjecutada() > detallesFicha.get(i).getDetCantidadLimite()
					|| detallesFicha.get(i).getDetCantidadEjecutada() < 0) {
				JOptionPane.showMessageDialog(null,
						"ERROR: Verificar que las Cantidades Ingresadas sean menores o iguales a las Cantidades Limite!\n"
								+ "ETIQUETA:" + detallesFicha.get(i).getDetEtiqueta() + "",
						"Mensaje de Error", JOptionPane.ERROR_MESSAGE);
				return false;
			}
		}

		return true;
	}
}
