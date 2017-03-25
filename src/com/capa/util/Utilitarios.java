package com.capa.util;

import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public class Utilitarios {

	public static ImageIcon getImagenIcon(String path, int base, int altura, int resolucion) {
		URL url = Utilitarios.class.getResource("/com/capa/imagenes/" + path);
		ImageIcon icono = new ImageIcon(url);
		return new ImageIcon(icono.getImage().getScaledInstance(base, altura, resolucion));
	}

	public static Image getImagen(String path, int base, int altura, int resolucion) {
		URL url = Utilitarios.class.getResource("/com/capa/imagenes/" + path);
		ImageIcon icono = new ImageIcon(url);
		return icono.getImage().getScaledInstance(base, altura, resolucion);
	}

}
