package com.capa.util;

import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

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

	public static String retornarPathImagen() {
		String pathImagen = null;
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
		chooser.setFileFilter(filter);
		int returnVal = chooser.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			pathImagen = chooser.getCurrentDirectory() + chooser.getSelectedFile().getName();
		}
		return pathImagen;
	}

}
