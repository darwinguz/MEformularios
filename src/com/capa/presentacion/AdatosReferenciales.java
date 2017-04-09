package com.capa.presentacion;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.capa.datos.TCabecera;
import com.capa.datos.TLugarGeografico;
import com.capa.negocios.ComponenteCabecera;
import com.capa.negocios.ComponenteLugarGeo;
import com.capa.negocios.ServicioCabecera;
import com.capa.util.Utilitarios;
import com.toedter.calendar.JDateChooser;

public class AdatosReferenciales extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8285324221431924056L;

	private JPanel panelPrincipal;

	private JTextField txtProyecto;
	private JTextField txtAmei;
	private JTextField txtCircuito;
	private JTextField txtSector;
	private JDateChooser dateEntregaPredioFecha;
	private JDateChooser dateInicioTrabajoFecha;
	private JDateChooser dateElabInformeFecha;

	private JComboBox<TLugarGeografico> cbxProvincia;
	private JComboBox<TLugarGeografico> cbxCanton;
	private JComboBox<TLugarGeografico> cbxParroquia;
	private JComboBox<String> cbxDistrito;
	private Map<String, String> distrito;

	private String pathFotoGeneral;
	private String pathFotoCroquis;

	private AlInicio alInicio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdatosReferenciales frame = new AdatosReferenciales(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdatosReferenciales(AlInicio alInicio) {
		this.alInicio = alInicio;
		if (alInicio != null) {
			alInicio.setVisible(false);
		}
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 750, 400);
		setLocationRelativeTo(null);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		JLabel lbl_logo_msp = new JLabel(Utilitarios.getImagenIcon("logoMinEdu.png", 150, 60, 100));
		lbl_logo_msp.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_logo_msp.setBounds(37, 11, 153, 61);
		panelPrincipal.add(lbl_logo_msp);

		JLabel lbl_proyecto = new JLabel("Proyecto");
		lbl_proyecto.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_proyecto.setBounds(221, 34, 230, 14);
		panelPrincipal.add(lbl_proyecto);

		JLabel lbl_amie = new JLabel("AMIE");
		lbl_amie.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_amie.setBounds(473, 34, 90, 14);
		panelPrincipal.add(lbl_amie);

		JLabel lbl_zona = new JLabel("Zona");
		lbl_zona.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_zona.setBounds(598, 34, 86, 14);
		panelPrincipal.add(lbl_zona);

		JLabel lbl_provincia = new JLabel("Provincia");
		lbl_provincia.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_provincia.setBounds(27, 121, 180, 14);
		panelPrincipal.add(lbl_provincia);

		JLabel lbl_distrito = new JLabel("Distrito");
		lbl_distrito.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_distrito.setBounds(27, 191, 200, 14);
		panelPrincipal.add(lbl_distrito);

		JLabel lbl_circuito = new JLabel("Circuito");
		lbl_circuito.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_circuito.setBounds(261, 191, 200, 14);
		panelPrincipal.add(lbl_circuito);

		JLabel lbl_canton = new JLabel("Cant\u00F3n");
		lbl_canton.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_canton.setBounds(261, 120, 200, 14);
		panelPrincipal.add(lbl_canton);

		JLabel lbl_parroquia = new JLabel("Parroquia");
		lbl_parroquia.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_parroquia.setBounds(496, 121, 200, 14);
		panelPrincipal.add(lbl_parroquia);

		JLabel lbl_sector = new JLabel("Sector");
		lbl_sector.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_sector.setBounds(496, 190, 200, 14);
		panelPrincipal.add(lbl_sector);

		JLabel lbl_entrega_pedido = new JLabel("Fecha de entrega del Predio");
		lbl_entrega_pedido.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_entrega_pedido.setBounds(27, 260, 200, 14);
		panelPrincipal.add(lbl_entrega_pedido);

		JLabel lbl_inicio_trabajo = new JLabel("Fecha de Inicio de Trabajo");
		lbl_inicio_trabajo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_inicio_trabajo.setBounds(261, 260, 200, 14);
		panelPrincipal.add(lbl_inicio_trabajo);

		JLabel lbl_elab_informe = new JLabel("Fecha de Elaboraci\u00F3n de Informe");
		lbl_elab_informe.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_elab_informe.setBounds(496, 260, 200, 14);
		panelPrincipal.add(lbl_elab_informe);

		txtProyecto = new JTextField();
		txtProyecto.setBounds(221, 52, 230, 20);
		panelPrincipal.add(txtProyecto);
		txtProyecto.setColumns(10);

		txtAmei = new JTextField();
		txtAmei.setBounds(473, 52, 90, 20);
		panelPrincipal.add(txtAmei);
		txtAmei.setColumns(10);

		txtCircuito = new JTextField();
		txtCircuito.setBounds(271, 210, 180, 20);
		panelPrincipal.add(txtCircuito);
		txtCircuito.setColumns(10);

		txtSector = new JTextField();
		txtSector.setBounds(506, 210, 180, 20);
		panelPrincipal.add(txtSector);
		txtSector.setColumns(10);

		dateEntregaPredioFecha = new JDateChooser();
		dateEntregaPredioFecha.setBounds(37, 280, 180, 20);
		dateEntregaPredioFecha.setDateFormatString("yyyy-MM-dd");
		dateEntregaPredioFecha.setDate(new Date());
		panelPrincipal.add(dateEntregaPredioFecha);

		dateInicioTrabajoFecha = new JDateChooser();
		dateInicioTrabajoFecha.setBounds(271, 280, 180, 20);
		dateInicioTrabajoFecha.setDateFormatString("yyyy-MM-dd");
		dateInicioTrabajoFecha.setDate(new Date());
		panelPrincipal.add(dateInicioTrabajoFecha);

		dateElabInformeFecha = new JDateChooser();
		dateElabInformeFecha.setBounds(506, 280, 180, 20);
		dateElabInformeFecha.setDateFormatString("yyyy-MM-dd");
		dateElabInformeFecha.setDate(new Date());
		panelPrincipal.add(dateElabInformeFecha);

		cbxProvincia = new JComboBox<>();
		cbxProvincia.setBounds(37, 140, 180, 20);
		cbxProvincia.addItem(new TLugarGeografico("", "Seleccionar", "Seleccionar"));
		panelPrincipal.add(cbxProvincia);

		for (TLugarGeografico lugar : provincias()) {
			cbxProvincia.addItem(lugar);
		}

		cbxProvincia.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					TLugarGeografico lugarG = (TLugarGeografico) cbxProvincia.getSelectedItem();
					rellenarComboCanton(lugarG.getLgCodigo());
				}
			}
		});

		cbxCanton = new JComboBox<>();
		cbxCanton.setBounds(271, 140, 180, 20);
		cbxCanton.addItem(new TLugarGeografico("", "Seleccionar", "Seleccionar"));
		panelPrincipal.add(cbxCanton);

		cbxCanton.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					TLugarGeografico lugarG = (TLugarGeografico) cbxCanton.getSelectedItem();
					rellenarComboParroquia(lugarG.getLgCodigo());
				}
			}
		});

		cbxParroquia = new JComboBox<>();
		cbxParroquia.setBounds(506, 140, 180, 20);
		cbxParroquia.addItem(new TLugarGeografico("", "Seleccionar", "Seleccionar"));
		panelPrincipal.add(cbxParroquia);

		cbxDistrito = new JComboBox<>();
		cbxDistrito.setBounds(37, 210, 180, 20);
		cbxDistrito.addItem(new String("Seleccionar"));
		panelPrincipal.add(cbxDistrito);

		rrellenarComboDistrito();

		Iterator<String> it = distrito.keySet().iterator();

		String clave;
		while (it.hasNext()) {
			clave = it.next();
			cbxDistrito.addItem(distrito.get(clave));
		}

		// cbxDistrito.addItemListener(new ItemListener() {
		// @Override
		// public void itemStateChanged(ItemEvent e) {
		// // rrellenarComboDistrito();
		// }
		// });

		JComboBox<String> cbxZona = new JComboBox<>();
		cbxZona.setBounds(598, 52, 90, 20);
		panelPrincipal.add(cbxZona);
		for (int i = 1; i < 10; i++) {
			cbxZona.addItem(String.valueOf(i));
		}

		JButton btnFotoGeneral = new JButton("Foto General");
		btnFotoGeneral.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pathFotoGeneral = Utilitarios.getPathImagen();
			}
		});
		btnFotoGeneral.setBounds(65, 327, 125, 23);
		panelPrincipal.add(btnFotoGeneral);

		JButton btnCroquis = new JButton("Foto Croquis");
		btnCroquis.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pathFotoCroquis = Utilitarios.getPathImagen();
			}
		});
		btnCroquis.setBounds(301, 327, 125, 23);
		panelPrincipal.add(btnCroquis);
		JFrame temp = this;

		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String validar = "";

				if (pathFotoCroquis == null) {
					validar = "ERROR: Foto del Croquis no ingresada!\n";
				}
				if (pathFotoGeneral == null) {
					validar += "ERROR: Foto General no ingresada!\n";
				}
				if (!validar.equals("")) {
					JOptionPane.showMessageDialog(null, "Resolver los siguientes errores:\n" + validar,
							"Mensaje de Error", JOptionPane.ERROR_MESSAGE);
					return;
				}

				ServicioCabecera proyecto = new ComponenteCabecera();

				String proy = txtProyecto.getText();
				String amie = txtAmei.getText();
				String zona = (String) cbxZona.getSelectedItem();
				TLugarGeografico parroquia = (TLugarGeografico) cbxParroquia.getSelectedItem();
				String distrito = String.valueOf(cbxDistrito.getSelectedItem());
				String circuito = txtCircuito.getText();
				String sector = txtSector.getText();
				Date fechaEntrega = dateEntregaPredioFecha.getDate();
				Date fechaInicio = dateInicioTrabajoFecha.getDate();
				Date fechaFin = dateElabInformeFecha.getDate();

				TCabecera cabecera = new TCabecera(proy, amie, zona, parroquia, distrito, circuito, sector,
						fechaEntrega, fechaInicio, fechaFin, pathFotoGeneral, pathFotoCroquis, "D");
				System.out.println(cabecera);
				proyecto.crear(cabecera);
				alInicio.settCabecera(cabecera);
				Utilitarios.settCabecera(cabecera);
				JOptionPane.showMessageDialog(null, "Proyecto registrado con Oxito!", "Mensaje de ConfirmaciOn",
						JOptionPane.INFORMATION_MESSAGE);
				alInicio.setVisible(true);
				temp.dispose();
			}
		});
		btnRegistrar.setBounds(538, 327, 125, 23);
		panelPrincipal.add(btnRegistrar);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				new AlInicio().setVisible(true);
				dispose();
			}
		});
	}

	public void rellenarComboCanton(String busca) {
		List<TLugarGeografico> listaLugares;
		listaLugares = new ComponenteLugarGeo().buscarPorId(busca);
		cbxCanton.removeAllItems();
		for (TLugarGeografico l : listaLugares) {
			cbxCanton.addItem(l);
		}
	}

	public void rellenarComboParroquia(String busca) {
		List<TLugarGeografico> listaLugares;
		listaLugares = new ComponenteLugarGeo().buscarPorId(busca);
		cbxParroquia.removeAllItems();
		for (TLugarGeografico l : listaLugares) {
			cbxParroquia.addItem(l);
		}
	}

	public List<TLugarGeografico> provincias() {
		return new ComponenteLugarGeo().buscarProvincia();
	}

	public void rrellenarComboDistrito() {
		distrito = new HashMap<>();
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

	}
}
