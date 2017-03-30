package com.capa.presentacion;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.capa.datos.TLugarGeografico;
import com.capa.negocios.ComponenteLugarGeo;
import com.capa.negocios.ComponenteProyecto;
import com.capa.util.Utilitarios;

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
	private JTextField txtEntregaPredioFecha;
	private JTextField txtInicioTrabajoFecha;
	private JTextField txtElabInformeFecha;

	private JComboBox<TLugarGeografico> cbxProvincia;
	private JComboBox<TLugarGeografico> cbxCanton;
	private JComboBox<TLugarGeografico> cbxParroquia;

	private Map<String, String> distritos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdatosReferenciales frame = new AdatosReferenciales();
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
	public AdatosReferenciales() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 400);
		setLocationRelativeTo(null);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);

		List<TLugarGeografico> listaLugares = new ComponenteLugarGeo().lugares();

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

		txtEntregaPredioFecha = new JTextField();
		txtEntregaPredioFecha.setBounds(37, 280, 180, 20);
		panelPrincipal.add(txtEntregaPredioFecha);
		txtEntregaPredioFecha.setColumns(10);

		txtInicioTrabajoFecha = new JTextField();
		txtInicioTrabajoFecha.setBounds(271, 280, 180, 20);
		panelPrincipal.add(txtInicioTrabajoFecha);
		txtInicioTrabajoFecha.setColumns(10);

		txtElabInformeFecha = new JTextField();
		txtElabInformeFecha.setBounds(506, 280, 180, 20);
		panelPrincipal.add(txtElabInformeFecha);
		txtElabInformeFecha.setColumns(10);

		cbxProvincia = new JComboBox<>();
		cbxProvincia.setBounds(37, 140, 180, 20);
		panelPrincipal.add(cbxProvincia);

		for (TLugarGeografico lugar : listaLugares) {
			cbxProvincia.addItem(lugar);
		}
		// cbxProvincia.addActionListener(new ActionListener() {
		//
		// public void actionPerformed(ActionEvent arg0) {
		// rellenaCombo2((String) combo1.getSelectedItem());
		// }
		//
		// });

		cbxCanton = new JComboBox<>();
		cbxCanton.setBounds(271, 140, 180, 20);
		panelPrincipal.add(cbxCanton);

		cbxParroquia = new JComboBox<>();
		cbxParroquia.setBounds(506, 140, 180, 20);
		panelPrincipal.add(cbxParroquia);

		JComboBox<String> cbxDistrito = new JComboBox<>();
		cbxDistrito.setBounds(37, 210, 180, 20);

		Iterator it = distritos.keySet().iterator();
		while (it.hasNext()) {
//			String key = it.hasNext();
//			System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
		}

		panelPrincipal.add(cbxDistrito);

		JComboBox<String> cbxZona = new JComboBox<>();
		cbxZona.setBounds(598, 52, 90, 20);
		panelPrincipal.add(cbxZona);

		for (int i = 1; i < 10; i++) {
			cbxZona.addItem(String.valueOf(i));
		}

		JButton btnFotoGeneral = new JButton("Foto General");
		btnFotoGeneral.setBounds(65, 327, 125, 23);
		panelPrincipal.add(btnFotoGeneral);

		JButton btnCroquis = new JButton("Croquis");
		btnCroquis.setBounds(301, 327, 125, 23);
		panelPrincipal.add(btnCroquis);

		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ComponenteProyecto proyecto = new ComponenteProyecto();
				// TCabecera cab = new TCabecera();
				String Proyecto = txtProyecto.getText();
				String amie = txtAmei.getText();
				String zona = (String) cbxZona.getSelectedItem();
				// String provincia = (String) cbxProvincia.getSelectedItem();
				String distrito = (String) cbxDistrito.getSelectedItem();
				String cicuito = txtCircuito.getText();
				String canton = (String) cbxCanton.getSelectedItem();
				TLugarGeografico cab = (TLugarGeografico) cbxProvincia.getSelectedItem();
				String sector = txtSector.getText();

				System.out.println(cab.getLgNombre());
				System.out.println(cab.getLgCodigo());

				// Date fechaEntrega =
				// Utilitarios.getFecha(txtEntregaPredioFecha.getText());
				// Date fechaInicio =
				// Utilitarios.getFecha(txtInicioTrabajoFecha.getText());
				// Date fechaFin =
				// Utilitarios.getFecha(txtElabInformeFecha.getText());

			}
		});
		btnRegistrar.setBounds(538, 327, 125, 23);
		panelPrincipal.add(btnRegistrar);
	}

	public void rellenarComboCanton(String busca) {
		List<TLugarGeografico> listaLugares;
		listaLugares = new ComponenteLugarGeo().buscarPorId(busca);
		cbxCanton.removeAllItems();
		for (TLugarGeografico l : listaLugares) {
			cbxCanton.addItem(l);
		}
	}

	public Map<String, String> getDistritos() {
		if (distritos == null) {
			distritos = new HashMap<>();
			distritos.put("04D01", "SAN PEDRO DE HUACA - TULCAN");
			distritos.put("04D02", "MONTUFAR - BOLÍVAR");
			distritos.put("04D03", "ESPEJO - MIRA");
			distritos.put("08D01", "ESMERALDAS");
			distritos.put("08D02", "ELOY ALFARO");
			distritos.put("08D03", "MUISNE - ATACAMES");
			distritos.put("08D04", "QUININDE");
			distritos.put("08D05", "SAN LORENZO");
			distritos.put("08D06", "RIO VERDE");
			distritos.put("10D02", "ANTONIO ANTE - OTAVALO");
			distritos.put("10D03", "COTACACHI");
			distritos.put("21D01", "CÁSCALES - GONZALO PIZARRO - SUCUMBÍOS");
			distritos.put("21D02", "LAGO AGRIO");
			distritos.put("21D03", "CUYABENO - PUTUMAYO");
			distritos.put("21D04", "SHUSHUFINDI");
			distritos.put("15D01", "ARCHIDONA - CARLOS JULIO AROSEMENA TOLA - TENA");
			distritos.put("15D02", "EL CHACO QUIJOS");
			distritos.put("17D10", "CAYAMBE - PEDRO MONCAYO");
			distritos.put("17D11", "MEJIA - RUMINAHUI");
			distritos.put("17D12", "PEDRO VICENTE MALDONADO - PUERTO QUITO - SAN MIGUEL DE LOS BANCOS");
			distritos.put("22D01", "LA JOYA DE LOS SACHAS");
			distritos.put("22D02", "LORETO - ORELLANA");
			distritos.put("22D03", "AGUARICO");
			distritos.put("05D01", "LATACUNGA");
			distritos.put("05D02", "LA MANA");
			distritos.put("05D03", "PANGUA");
			distritos.put("05D04", "PUJILI-SAQUISILI");
			distritos.put("05D05", "SIGCHOS");
			distritos.put("05D06", "SALCEDO");
			distritos.put("06D01", "CHAMBO RIOBAMBA");
			distritos.put("06D02", "ALAUSI - CHUNCHI");
			distritos.put("06D03", "CUMANDA - PALLATANGA");
			distritos.put("06D04", "COLTA - GUAMÓTE");
			distritos.put("06D05", "GUANO - PENIPE");
			distritos.put("16D01", "PASTAZA - MERA - SANTA CLARA");
			distritos.put("16D02", "ARAJUNO");
			distritos.put("18D01", "MARTÍNEZ - CONSTATINO FERNANDEZ -CUNCHIBAMBA IZAMBA");
			distritos.put("18D02", "HUACHI GRANDE");
			distritos.put("18D03", "BAÑOS DE AGUA SANTA");
			distritos.put("18D04", "PATATE - SAN PEDRO DE PELILEO");
			distritos.put("18D05", "SANTIAGO DE PILLARO");
			distritos.put("18D06", "CEVALLOS - MOCHA - QUERO TISALEO");
			distritos.put("13D01", "PORTOVIEJO");
			distritos.put("13D02", "JARAMIJO - MANTA - MONTECRISTI");
			distritos.put("13D03", "JIPIJAPA - PUERTO LÓPEZ");
			distritos.put("13D04", "24 DE MAYO - SANTA ANA - OLMEDO");
			distritos.put("13D05", "EL CARMEN");
			distritos.put("13D06", "JUNIN BOLÍVAR");
			distritos.put("13D07", "CHONE - FLAVIO ALFARO");
			distritos.put("13D08", "PICHINCHA");
			distritos.put("13D09", "PAJAN");
			distritos.put("13D10", "JAMA - PEDERNALES");
			distritos.put("13D11", "SAN VICENTE - SUCRE");
			distritos.put("13D12", "ROCAFUERTE - TOSAGUA");
			distritos.put("23D01", "RIO VERDE - SANTO DOMINGO - ZARACAY - RÍO TOACHI ");
			distritos.put("23D02", "ABRAHAM CALAZACÓN - BOMBOLI");
			distritos.put("23D03", "LA CONCORDIA");
			distritos.put("02D01", "GUARANDA");
			distritos.put("02D02", "CHILLANES");
			distritos.put("02D03", "CHIMBO - SAN MIGUEL");
			distritos.put("02D04", "CALUMA - ECHEANDIA - LAS NAVES");
			distritos.put("09D11", "ALFREDO BAQUERIZO MORENO - SIMÓN BOLÍVAR");
			distritos.put("09D12", "BALAO - NARANJAL");
			distritos.put("09D13", "BALZAR - COLIMES - PALESTINA");
			distritos.put("09D14", "ISIDRO AYORA - LOMAS DE SARGENTILLO -PEDRO CARBO");
			distritos.put("09D15", "EMPALME");
			distritos.put("09D16", "EL TRIUNFO- GNRAL. ANTONIO ELIZALDE");
			distritos.put("09D17", "MILAGRO");
			distritos.put("09D18", "CRNEL. MARCELINO MARIDUENA - NARANJITO");
			distritos.put("09D19", "DAULE - NOBOL - SANTA LUCIA");
			distritos.put("09D20", "SALITRE");
			distritos.put("09D21", "SAN JACINTO DE YAGUACHI");
			distritos.put("09D22", "PLAYAS");
			distritos.put("12D01", "BABA - BABAHOYO - MONTALVO");
			distritos.put("12D02", "PUEBLO VIEJO - URDANETA");
			distritos.put("12D03", "MOCACHE - QUEVEDO");
			distritos.put("12D04", "QUINSALOMA - VENTANAS");
			distritos.put("12D05", "PALENQUE - VINCES");
			distritos.put("12D06", "BUENA FE-VALENCIA");
			distritos.put("20D01", "SAN CRISTÓBAL - SANTA CRUZ - ISABELA");
			distritos.put("24D01", "SANTA ELENA");
			distritos.put("24D02", "LA LIBERTAD - SALINAS");
			distritos.put("01D01", "MACHANGARA -HMNO MIGUEL - EL VECINO - TOTORACOCHA");
			distritos.put("01D02", "SAN SEBASTIAN- EL BATAN - YANUNCAY - SUCRE - HUAYNA CAPAC - MONAY");
			distritos.put("01D03", "GIRÓN - PUCARÁ - SAN FERNANDO - SANTA ISABEL");
			distritos.put("01D04", "CHORDELEG -GUALACEO");
			distritos.put("01D05", "NABON-ONA");
			distritos.put("01D06", "EL PAN - GUACHAPALA - PAUTE - SEVILLA DE ORO");
			distritos.put("01D07", "CAMILO PONCE ENRIQUEZ");
			distritos.put("01D08", "SIGSIG");
			distritos.put("03D01", "AZOGUES - BIBLIAN - DELEG");
			distritos.put("03D02", "CAÑAR - EL TAMBO - SUSCAL");
			distritos.put("03D03", "LA TRONCAL");
			distritos.put("14D01", "MORONA");
			distritos.put("14D02", "HUAMBOYA - PABLO SEXTO - PALORA");
			distritos.put("14D03", "LOGROÑO - SUCUA");
			distritos.put("14D04", "GUALAQUIZA - SAN JUAN BOSCO");
			distritos.put("14D05", "TAISHA");
			distritos.put("14D06", "LIMÓN INDANZA - SANTIAGO - TIWINTZA");
			distritos.put("07D01", "CHILLA - EL GUABO - PASAJE");
			distritos.put("07D02", "MÁCHALA");
			distritos.put("07D03", "ATAHUALPA - PORTO VELO - ZARUMA");
			distritos.put("07D04", "BALSAS - MARCABELI - PINAS");
			distritos.put("07D05", "ARENILLAS - HUAQUILLAS - LAS LAJAS");
			distritos.put("07D06", "SANTA ROSA");
			distritos.put("11D01", "LOJA");
			distritos.put("11D02", "CATAMAYO - CHAGUARPAMBA - OLMEDO");
			distritos.put("11D03", "PALTAS");
			distritos.put("11D04", "CÉLICA - P1NDAL - PUYANGO");
			distritos.put("11DO5", "ESPINDOLA");
			distritos.put("11D06", "CALVAS - GONZANAMA - QUILANGA");
			distritos.put("11D07", "MACARA -SOZORANGA");
			distritos.put("11D08", "SARAGURO");
			distritos.put("11D09", "ZAPOTILLO");
			distritos.put("19D01", "YACUAMBI - ZAMORA");
			distritos.put("19D02", "CENTINELA DEL CÓNDOR - NANGARITZA - PAQUISHA");
			distritos.put("19D03", "CHINCHIPE - PALANDA");
			distritos.put("19D04", "EL PANGUI - YANTZAZA");
			distritos.put("09D01", "XIMENA");
			distritos.put("09D02", "XIMENA 2");
			distritos.put("09D03", "GARCÍA MORENO - LETAMENDI AYACUCHO");
			distritos.put("09D04", "FEBRES CORDERO");
			distritos.put("09D05", "JARQUI - 1, TENGUEL");
			distritos.put("09D06", "TARQUI - 2");
			distritos.put("09D07", "PASCUALES - 1");
			distritos.put("09D08", "PASCUALES - 2");
			distritos.put("09D09", "TARQUI-3");
			distritos.put("09D10", "PROGRESO - EL MORRO- POSORJA");
			distritos.put("09D23", "SAMBORONDON");
			distritos.put("09D24", "DURAN");
			distritos.put("17D01", "NANEGAL - PACTO - GUALEA - NANEGALITO");
			distritos.put("17D02", "CALDERÓN - LLANO CHICO - GUAYLLABAMBA");
			distritos.put("17D03", "EL CONDADO - PONCEANO - COTOCOLLAO - COMITÉ DEL PUEBLO - CARCELÉN");
			distritos.put("17D04", "PUENGASI - CENTRO HISTÓRICO - SAN JUAN - LA LIBERTAD - ITCHIMBÍA");
			distritos.put("17D05",
					"LA CONCEPCIÓN MARISCAL SUCRE - BELISARIO QUEVEDO - SAN ISIDRO DEL INCA - RUMIPAMBA - KENNEDY");
			distritos.put("17D06",
					"CHILIBULO - SAN BARTOLO - CHIMBACALLE - LA ARGELIA -SOLANDA - LA MENA - LA MAGDALENA - LA FERROVIARIA");
			distritos.put("17D07", "CHILLOGALLO GUAMANÍ- QUITUMBE - TURUBAMBA - LA ECUATORIANA");
			distritos.put("17D08", "CONOCOTO - PINTAG AMAGUAÑA ALANGASÍ - GUANGOPOLO - LA MERCED");
			distritos.put("17D09", "TUMBACO CUMBAYÁ - PIFO - YARUQUÍ - EL QUINCHE - PUEMBO CHECA - TABABELA");

		}
		return distritos;
	}

	public void setDistritos(Map<String, String> distritos) {
		this.distritos = distritos;
	}

}
