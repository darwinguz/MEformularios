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
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.capa.datos.TCabecera;
import com.capa.datos.TInformacionObligatoria;
import com.capa.datos.TLugarGeografico;
import com.capa.negocios.ComponenteFichaD;
import com.capa.negocios.ComponenteLGeografico;
import com.capa.negocios.ServicioFichaD;
import com.capa.negocios.ServicioLGeografico;
import com.capa.presentacion.JPcabecera;
import com.capa.presentacion.JPinformacionObligatoria;

public class Utilitarios {

	private static TCabecera tCabecera;
	private static String nombreFicha;

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
		TLugarGeografico parroquia = geo.buscarLGeo(tCabecera.getTLugarGeografico().getLgCodigo());
		TLugarGeografico canton = geo.buscarPadre(tCabecera.getTLugarGeografico().getLgCodigo());
		TLugarGeografico provincia = geo.buscarPadre(canton.getLgCodigo());

		jCabecera.getTxtProyecto().setText(tCabecera.getCNombreProyecto());
		jCabecera.getTxtAmie().setText(tCabecera.getCAmie());
		jCabecera.getTxtDistrito().setText(tCabecera.getDistrito());
		jCabecera.getTxtCircuito().setText(tCabecera.getCircuito());
		jCabecera.getTxtFechaEntrega().setText("" + getFechaString(tCabecera.getCFechaEntrega()));
		jCabecera.getTxtFechaInicioTrabajo().setText("" + getFechaString(tCabecera.getCFechaInicio()));
		jCabecera.getTxtZona().setText(tCabecera.getCZona());
		jCabecera.getTxtParroquia().setText(parroquia.getLgNombre());
		jCabecera.getTxtCanton().setText(canton.getLgNombre());
		jCabecera.getTxtProvincia().setText(provincia.getLgNombre());
		jCabecera.getTxtSector().setText(tCabecera.getSector());
	}

	public static double redondearDecimales(double valorInicial, int numeroDecimales) {
		double parteEntera, resultado;
		resultado = valorInicial;
		parteEntera = Math.floor(resultado);
		resultado = (resultado - parteEntera) * Math.pow(10, numeroDecimales);
		resultado = Math.round(resultado);
		resultado = (resultado / Math.pow(10, numeroDecimales)) + parteEntera;
		return resultado;
	}

	public static TInformacionObligatoria cargarInfoObligatoria(JPinformacionObligatoria jpInfo) {
		return new TInformacionObligatoria(jpInfo.getJtxtObsGenMin().getText(),
				jpInfo.getJtxtResponsableMin().getText(), jpInfo.getJtxtCargoMin().getText(),
				jpInfo.getJtxtObsGenCont().getText(), jpInfo.getJtxtResponsableCont().getText(),
				jpInfo.getJtxtCargoCont().getText(), jpInfo.getDateFechaIO().getDate(), jpInfo.getPathFotoIO());
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

	
	public static String getNombreFicha() {
		return nombreFicha;
	}

	public static void setNombreFicha(String nombreFicha) {
		Utilitarios.nombreFicha = nombreFicha;
	}

	public static Integer buscarNumeroUpdateFicha() {
		ServicioFichaD srvFicha = new ComponenteFichaD();
		Integer updateFicha = srvFicha.actualizacionFichaN(gettCabecera());

		if (updateFicha == -1) {
			updateFicha = 1;
		} else {
			updateFicha++;
		}
		return updateFicha;
	}

	public static Map<String, String> mapDistritos() {
		Map<String, String> distrito = new HashMap<>();
		distrito.put("04D01", "SAN PEDRO DE HUACA - TULCAN ");
		distrito.put("04D02", "MONTUFAR - BOLOVAR ");
		distrito.put("04D03", "ESPEJO - MIRA ");
		distrito.put("08D01", "ESMERALDAS ");
		distrito.put("08D02", "ELOY ALFARO ");
		distrito.put("08D03", "MUISNE - ATACAMES ");
		distrito.put("08D04", "QUININDE ");
		distrito.put("08D05", "SAN LORENZO ");
		distrito.put("08D06", "RIO VERDE ");
		distrito.put("10D02", "ANTONIO ANTE -OTAVALO ");
		distrito.put("10D03", "COTACACHI ");
		distrito.put("21D01", "COSCALES - GONZALO PIZARRO - SUCUMBOOS ");
		distrito.put("21D02", "LAGO AGRIO ");
		distrito.put("21D03", "CUYABENO - PUTUMAYO ");
		distrito.put("21D04", "SHUSHUFINDI ");
		distrito.put("15D01", "ARCHIDONA - CARLOS JULIO AROSEMENA TOLA - TENA ");
		distrito.put("15D02", "EL CHACO QUIJOS ");
		distrito.put("17D10", "CAYAMBE - PEDRO MONCAYO ");
		distrito.put("17D11", "MEJIA - RUMINAHUI ");
		distrito.put("17D12", "PEDRO VICENTE MALDONADO - PUERTO QUITO - SAN MIGUEL DE LOS BANCOS ");
		distrito.put("22D01", "LA JOYA DE LOS SACHAS ");
		distrito.put("22D02", "LORETO - ORELLANA ");
		distrito.put("22D03", "AGUARICO ");
		distrito.put("05D01", "LATACUNGA ");
		distrito.put("05D02", "LA MANA ");
		distrito.put("05D03", "PANGUA ");
		distrito.put("05D04", "PUJILI-SAQUISILI ");
		distrito.put("05D05", "SIGCHOS ");
		distrito.put("05D06", "SALCEDO ");
		distrito.put("06D01", "CHAMBO RIOBAMBA ");
		distrito.put("06D02", "ALAUSI - CHUNCHI ");
		distrito.put("06D03", "CUMANDA - PALLATANGA ");
		distrito.put("06D04", "COLTA - GUAMOTE ");
		distrito.put("06D05", "GUANO - PENIPE ");
		distrito.put("16D01", "PASTAZA - MERA - SANTA CLARA ");
		distrito.put("16D02", "ARAJUNO ");
		distrito.put("18D01", "MARTONEZ - CONSTATINO FERNANDEZ -CUNCHIBAMBA IZAMBA ");
		distrito.put("18D02", "HUACHI GRANDE ");
		distrito.put("18D03", "BAOOS DE AGUA SANTA ");
		distrito.put("18D04", "PATATE - SAN PEDRO DE PELILEO ");
		distrito.put("18D05", "SANTIAGO DE PILLARO ");
		distrito.put("18D06", "CEVALLOS - MOCHA - QUERO TISALEO ");
		distrito.put("13D01", "PORTOVIEJO ");
		distrito.put("13D02", "JARAMIJO - MANTA - MONTECRISTI ");
		distrito.put("13D03", "JIPIJAPA - PUERTO LOPEZ ");
		distrito.put("13D04", "24 DE MAYO - SANTA ANA - OLMEDO ");
		distrito.put("13D05", "EL CARMEN ");
		distrito.put("13D06", "JUNIN BOLOVAR ");
		distrito.put("13D07", "CHONE - FLAVIO ALFARO ");
		distrito.put("13D08", "PICHINCHA ");
		distrito.put("13D09", "PAJAN ");
		distrito.put("13D10", "JAMA - PEDERNALES ");
		distrito.put("13D11", "SAN VICENTE - SUCRE ");
		distrito.put("13D12", "ROCAFUERTE - TOSAGUA ");
		distrito.put("23D01", "RIO VERDE - SANTO DOMINGO - ZARACAY - ROO TOACHI  ");
		distrito.put("23D02", "ABRAHAM CALAZACON - BOMBOLI ");
		distrito.put("23D03", "LA CONCORDIA ");
		distrito.put("02D01", "GUARANDA ");
		distrito.put("02D02", "CHILLANES ");
		distrito.put("02D03", "CHIMBO - SAN MIGUEL ");
		distrito.put("02D04", "CALUMA - ECHEANDIA - LAS NAVES ");
		distrito.put("09D11", "ALFREDO BAQUERIZO MORENO - SIMON BOLOVAR ");
		distrito.put("09D12", "BALAO - NARANJAL ");
		distrito.put("09D13", "BALZAR - COLIMES - PALESTINA ");
		distrito.put("09D14", "ISIDRO AYORA - LOMAS DE SARGENTILLO - PEDRO CARBO ");
		distrito.put("09D15", "EMPALME ");
		distrito.put("09D16", "EL TRIUNFO - GNRAL. ANTONIO ELIZALDE ");
		distrito.put("09D17", "MILAGRO ");
		distrito.put("09D18", "CRNEL. MARCELINO MARIDUENA - NARANJITO ");
		distrito.put("09D19", "DAULE - NOBOL - SANTA LUCIA ");
		distrito.put("09D20", "SALITRE ");
		distrito.put("09D21", "SAN JACINTO DE YAGUACHI ");
		distrito.put("09D22", "PLAYAS ");
		distrito.put("12D01", "BABA - BABAHOYO - MONTALVO ");
		distrito.put("12D02", "PUEBLO VIEJO - URDANETA ");
		distrito.put("12D03", "MOCACHE- QUEVEDO ");
		distrito.put("12D04", "QUINSALOMA - VENTANAS ");
		distrito.put("12D05", "PALENQUE - VINCES ");
		distrito.put("12D06", "BUENA FE - VALENCIA ");
		distrito.put("20D01", "SAN CRISTOBAL - SANTA CRUZ - ISABELA ");
		distrito.put("24D01", "SANTA ELENA ");
		distrito.put("24D02", "LA LIBERTAD - SALINAS ");
		distrito.put("01D01", "MACHANGARA - HMNO MIGUEL - EL VECINO - TOTORACOCHA");
		distrito.put("01D02", "SAN SEBASTIAN- EL BATAN - YANUNCAY - SUCRE - HUAYNA CAPAC - MONAY ");
		distrito.put("01D03", "GIRON - PUCARO - SAN FERNANDO - SANTA ISABEL ");
		distrito.put("01D04", "CHORDELEG - GUALACEO ");
		distrito.put("01D05", "NABON-ONA ");
		distrito.put("01D06", "EL PAN - GUACHAPALA - PAUTE - SEVILLA DE ORO ");
		distrito.put("01D07", "CAMILO PONCE ENRIQUEZ ");
		distrito.put("01D08", "SIGSIG ");
		distrito.put("03D01", "AZOGUES - BIBLIAN - DELEG ");
		distrito.put("03D02", "CAOAR - EL TAMBO - SUSCAL ");
		distrito.put("03D03", "LA TRONCAL ");
		distrito.put("14D01", "MORONA ");
		distrito.put("14D02", "HUAMBOYA - PABLO SEXTO - PALORA ");
		distrito.put("14D03", "LOGROOO - SUCUA ");
		distrito.put("14D04", "GUALAQUIZA - SAN JUAN BOSCO ");
		distrito.put("14D05", "TAISHA ");
		distrito.put("14D06", "LIMON INDANZA - SANTIAGO - TIWINTZA ");
		distrito.put("07D01", "CHILLA - EL GUABO - PASAJE ");
		distrito.put("07D02", "MOCHALA ");
		distrito.put("07D03", "ATAHUALPA - PORTO VELO - ZARUMA ");
		distrito.put("07D04", "BALSAS - MARCABELI - PINAS ");
		distrito.put("07D05", "ARENILLAS - HUAQUILLAS - LAS LAJAS ");
		distrito.put("07D06", "SANTA ROSA ");
		distrito.put("11D01", "LOJA ");
		distrito.put("11D02", "CATAMAYO - CHAGUARPAMBA - OLMEDO ");
		distrito.put("11D03", "PALTAS ");
		distrito.put("11D04", "COLICA - P1NDAL - PUYANGO ");
		distrito.put("11DO5", "ESPINDOLA ");
		distrito.put("11D06", "CALVAS - GONZANAMA - QUILANGA ");
		distrito.put("11D07", "MACARA - SOZORANGA ");
		distrito.put("11D08", "SARAGURO ");
		distrito.put("11D09", "ZAPOTILLO ");
		distrito.put("19D01", "YACUAMBI - ZAMORA ");
		distrito.put("19D02", "CENTINELA DEL CONDOR - NANGARITZA -PAQUISHA ");
		distrito.put("19D03", "CHINCHIPE - PALANDA ");
		distrito.put("19D04", "EL PANGUI - YANTZAZA ");
		distrito.put("09D01", "XIMENA ");
		distrito.put("09D02", "XIMENA 2 ");
		distrito.put("09D03", "GARCOA MORENO - LETAMENDI AYACUCHO ");
		distrito.put("09D04", "FEBRES CORDERO ");
		distrito.put("09D05", "JARQUI - 1,TENGUEL ");
		distrito.put("09D06", "TARQUI - 2 ");
		distrito.put("09D07", "PASCUALES - 1 ");
		distrito.put("09D08", "PASCUALES - 2 ");
		distrito.put("09D09", "TARQUI - 3 ");
		distrito.put("09D10", "PROGRESO - EL MORRO- POSORJA ");
		distrito.put("09D23", "SAMBORONDON ");
		distrito.put("09D24", "DURAN ");
		distrito.put("17D01", "NANEGAL - PACTO -GUALEA - NANEGALITO ");
		distrito.put("17D02", "CALDERON - LLANO CHICO - GUAYLLABAMBA ");
		distrito.put("17D03", "EL CONDADO - PONCEANO - COTOCOLLAO - COMITO DEL PUEBLO- CARCELON ");
		distrito.put("17D04", "PUENGASI - CENTRO HISTORICO - SAN JUAN - LA LIBERTAD - ITCHIMBOA ");
		distrito.put("17D05",
				"LA CONCEPCION MARISCAL SUCRE - BELISARIO QUEVEDO - SAN ISIDRO DEL INCA - RUMIPAMBA - KENNEDY");
		distrito.put("17D06",
				"CHILIBULO - SAN BARTOLO - CHIMBACALLE - LA ARGELIA -SOLANDA - LA MENA - LA MAGDALENA - LA FERROVIARIA ");
		distrito.put("17D07", "CHILLOGALLO GUAMANO- QUITUMBE - TURUBAMBA - LA ECUATORIANA ");
		distrito.put("17D08", "CONOCOTO - PINTAG AMAGUAOA ALANGASO - GUANGOPOLO - LA MERCED ");
		distrito.put("17D09", "TUMBACO CUMBAYO - PIFO - YARUQUO - EL QUINCHE - PUEMBO CHECA - TABABELA ");
		return distrito;
	}
}
