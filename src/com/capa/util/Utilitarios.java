package com.capa.util;

import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
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

	public static String getPathImagen() {
		String pathImagen = null;
		final JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
		chooser.setFileFilter(filter);
		int returnVal = chooser.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			pathImagen = chooser.getSelectedFile().getAbsolutePath();
		}
		return pathImagen;
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

	public static String getFechaString(Date date) {
		String fecha = "";
		try {
			SimpleDateFormat formateador = new SimpleDateFormat("yyyy/MM/dd", new Locale("es", "EC"));
			fecha = formateador.format(date);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al obtener fecha", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		return fecha;
	}

	public static Date getFecha(String cadenaFecha) {
		SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
		Date fecha = null;
		try {
			fecha = formatoFecha.parse(cadenaFecha);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "Error al obtener fecha", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		return fecha;
	}

}
