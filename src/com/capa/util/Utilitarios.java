package com.capa.util;

import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
		chooser.setFileFilter(filter);
		int returnVal = chooser.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			pathImagen = chooser.getCurrentDirectory() + "\\" + chooser.getSelectedFile().getName();
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

	public static Date getFecha(String cadenaFecha) {
		SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
		Date fecha = null;
		try {
			fecha = formatoFecha.parse(cadenaFecha);
		} catch (ParseException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Error al obtener fecha", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		return fecha;
	}

	public static byte[] cargarImagen(String pathImagen) {
		byte imagen[] = null;
		File file = new File(pathImagen);
		FileInputStream in;
		BufferedInputStream reader;
		try {
			in = new FileInputStream(file);
			reader = new BufferedInputStream(in);
			int length = reader.available();
			imagen = new byte[length];
			reader.read(imagen, 0, length);
			reader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return imagen;
	}

}
