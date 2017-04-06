package com.capa.util;

import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.capa.datos.TCabecera;
import com.capa.datos.TLugarGeografico;
import com.capa.negocios.ComponenteLugarGeo;
import com.capa.negocios.ServicioLugarGeo;
import com.capa.presentacion.JPcabecera;

public class Utilitarios {

	private static TCabecera tCabecera;

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

	public static TCabecera gettCabecera() {
		return tCabecera;
	}

	public static void settCabecera(TCabecera tCabecera) {
		Utilitarios.tCabecera = tCabecera;
	}

	public static void llenarCabecera(JPcabecera jCabecera) {
		ServicioLugarGeo geo = new ComponenteLugarGeo();
		TLugarGeografico lugar;
		jCabecera.getTxtProyecto().setText(gettCabecera().getCNombreProyecto());
		lugar = geo.buscarProvincia(gettCabecera().getTLugarGeografico().getLgCodigo());
		jCabecera.getTxtProvincia().setText(lugar.getLgNombre());
		lugar = geo.buscarCanton(gettCabecera().getTLugarGeografico().getLgCodigo());
		jCabecera.getTxtCanton().setText(lugar.getLgNombre());
		lugar = geo.buscarParroquia(gettCabecera().getTLugarGeografico().getLgCodigo());
		jCabecera.getTxtParroquia().setText(lugar.getLgNombre());
		jCabecera.getTxtProyecto().setText(Utilitarios.gettCabecera().getCNombreProyecto());
		jCabecera.getTxtAmie().setText(Utilitarios.gettCabecera().getCAmie());
		jCabecera.getTxtDistrito().setText(Utilitarios.gettCabecera().getDistrito());
		jCabecera.getTxtCircuito().setText(Utilitarios.gettCabecera().getCircuito());
		jCabecera.getTxtFechaEntrega().setText("" + Utilitarios.gettCabecera().getCFechaEntrega());
		jCabecera.getTxtFechaInicioTrabajo().setText("" + Utilitarios.gettCabecera().getCFechaInicio());
		jCabecera.getTxtZona().setText(Utilitarios.gettCabecera().getCZona());
		jCabecera.getTxtSector().setText(Utilitarios.gettCabecera().getSector());
	}

}
