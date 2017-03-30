package com.capa.presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.capa.datos.TCabecera;
import com.capa.datos.TLugarGeografico;
import com.capa.negocios.ComponenteLugarGeo;
import com.capa.negocios.ComponenteProyecto;
import com.capa.util.Utilitarios;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;

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

		cbxCanton = new JComboBox<>();
		cbxCanton.setBounds(271, 140, 180, 20);
		panelPrincipal.add(cbxCanton);

		cbxParroquia = new JComboBox<>();
		cbxParroquia.setBounds(506, 140, 180, 20);
		panelPrincipal.add(cbxParroquia);

		JComboBox<String> cbxDistrito = new JComboBox<>();
		cbxDistrito.setBounds(37, 210, 180, 20);

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
}
