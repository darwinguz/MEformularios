package com.capa.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.sql.Blob;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.capa.datos.TCabecera;
import com.capa.datos.TInformacionObligatoria;
import com.capa.datos.TLugarGeografico;
import com.capa.negocios.ComponenteLGeografico;
import com.capa.negocios.ServicioLGeografico;
import com.capa.presentacion.InformacionObligatoriaV;
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

	public static Image getRedimensionarImagen(Image imagen, int base, int altura, int resolucion) {
		ImageIcon icono = new ImageIcon(imagen);
		return icono.getImage().getScaledInstance(base, altura, resolucion);
	}

	public static Image loadImagen(byte[] imagen) {
		BufferedImage img = null;
		try {
			img = ImageIO.read(new ByteArrayInputStream(imagen));
		} catch (IOException ex) {
			ex.getMessage();
		}
		return img;
	}

	public static Image parseImagen(Blob foto) throws SQLException {
		Image imagen = null;
		try {
			imagen = ImageIO.read(foto.getBinaryStream());
		} catch (IOException ex) {
			ex.getMessage();
		}
		return imagen;
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
		ServicioLGeografico geo = new ComponenteLGeografico();
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
		jCabecera.getTxtFechaEntrega().setText("" + getFechaString(Utilitarios.gettCabecera().getCFechaEntrega()));
		jCabecera.getTxtFechaInicioTrabajo().setText("" + getFechaString(Utilitarios.gettCabecera().getCFechaInicio()));
		jCabecera.getTxtZona().setText(Utilitarios.gettCabecera().getCZona());
		jCabecera.getTxtSector().setText(Utilitarios.gettCabecera().getSector());
	}

	public static TInformacionObligatoria cargarInfoObligatoria(InformacionObligatoriaV infor) {
		TInformacionObligatoria tInfor;
		String responsableMinEduc, cargoIzq, obsGenIz;
		String responsableContrat, cargoDer, obsGenDer;
		Date fecha;
		responsableMinEduc = infor.getTxtResponsableMineduc().getText();
		cargoIzq = infor.getTxtCargoIzq().getText();
		obsGenIz = infor.getTxtObsGenIzq().getText();
		responsableContrat = infor.getTxtResponsableContratista().getText();
		cargoDer = infor.getTxtCargoDer().getText();
		obsGenDer = infor.getTxtObsGenDer().getText();
		fecha = infor.getDateFechaIO().getDate();
		tInfor = new TInformacionObligatoria(obsGenIz, responsableMinEduc, cargoIzq, obsGenDer, responsableContrat,
				cargoDer, fecha, tCabecera);
		return tInfor;
	}

	public static JTextField txtCantidad(int i, int constante, int cantidadEjecutada) {
		String concatenar = i + "" + constante;
		JTextField txtCantidad = new JTextField(Integer.valueOf(concatenar));
		txtCantidad.setText(String.valueOf(cantidadEjecutada));
		return txtCantidad;
	}

	public static JTextField txtObs(int i) {
		return new JTextField(Integer.valueOf(i));
	}
	

}
