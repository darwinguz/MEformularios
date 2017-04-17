package com.capa.presentacion;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

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
import com.capa.negocios.ComponenteLGeografico;
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

	private String pathFotoGeneral;
	private String pathFotoCroquis;

	AlInicio alInicio;

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

		// rrellenarComboDistrito();

		Iterator<String> it = Utilitarios.mapDistritos().keySet().iterator();

		String clave;
		while (it.hasNext()) {
			clave = it.next();
			cbxDistrito.addItem(Utilitarios.mapDistritos().get(clave));
		}

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
					validar = "ERROR: Foto Croquis NO ingresada!\n";
				}
				if (pathFotoGeneral == null) {
					validar += "ERROR: Foto General NO ingresada!\n";
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

				proyecto.crear(cabecera);
				alInicio.settCabecera(cabecera);
				Utilitarios.settCabecera(cabecera);

				JOptionPane.showMessageDialog(null, "Proyecto registrado con Éxito!", "Mensaje de Confirmación",
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
		listaLugares = new ComponenteLGeografico().buscarPorId(busca);
		cbxCanton.removeAllItems();
		for (TLugarGeografico l : listaLugares) {
			cbxCanton.addItem(l);
		}
	}

	public void rellenarComboParroquia(String busca) {
		List<TLugarGeografico> listaLugares;
		listaLugares = new ComponenteLGeografico().buscarPorId(busca);
		cbxParroquia.removeAllItems();
		for (TLugarGeografico l : listaLugares) {
			cbxParroquia.addItem(l);
		}
	}

	public List<TLugarGeografico> provincias() {
		return new ComponenteLGeografico().buscarProvincia();
	}

}
