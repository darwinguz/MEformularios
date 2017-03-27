package com.capa.presentacion;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import com.capa.util.Utilitarios;

public class JPcabecera {

	private JTextField txtAmie;
	private JTextField txtCircuito;
	private JTextField txtFechaEntrega;
	private JTextField txtSector;
	private JTextField txtFechaInicioTrabajo;
	private JTextField txtProyecto;
	private JTextField txtParroquia;
private JPanel pnlSuperior;

	public JPanel getCabecera() {
		pnlSuperior = new JPanel();
		pnlSuperior.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlSuperior.setBounds(10, 10, 1270, 103);
		pnlSuperior.setLayout(null);

		JLabel lblLogoMinEdu = new JLabel("");
		lblLogoMinEdu.setIcon(Utilitarios.getImagenIcon("logoMinEdu.png", 160, 80, 100));
		lblLogoMinEdu.setBounds(0, 11, 160, 81);
		pnlSuperior.add(lblLogoMinEdu);

		txtAmie = new JTextField();
		txtAmie.setBounds(506, 28, 86, 20);
		pnlSuperior.add(txtAmie);
		txtAmie.setColumns(10);

		JComboBox cmbDistrito = new JComboBox();
		cmbDistrito.setBounds(626, 28, 160, 20);
		pnlSuperior.add(cmbDistrito);

		JComboBox cmbZona = new JComboBox();
		cmbZona.setBounds(170, 72, 86, 20);
		pnlSuperior.add(cmbZona);

		JComboBox cmbProvincia = new JComboBox();
		cmbProvincia.setBounds(289, 72, 160, 20);
		pnlSuperior.add(cmbProvincia);

		JComboBox cmbCanton = new JComboBox();
		cmbCanton.setBounds(472, 72, 160, 20);
		pnlSuperior.add(cmbCanton);

		txtCircuito = new JTextField();
		txtCircuito.setBounds(823, 28, 100, 20);
		pnlSuperior.add(txtCircuito);
		txtCircuito.setColumns(10);

		txtFechaEntrega = new JTextField();
		txtFechaEntrega.setColumns(10);
		txtFechaEntrega.setBounds(933, 28, 100, 20);
		pnlSuperior.add(txtFechaEntrega);

		txtFechaInicioTrabajo = new JTextField();
		txtFechaInicioTrabajo.setColumns(10);
		txtFechaInicioTrabajo.setBounds(1043, 28, 100, 20);
		pnlSuperior.add(txtFechaInicioTrabajo);

		txtSector = new JTextField();
		txtSector.setColumns(10);
		txtSector.setBounds(823, 72, 318, 20);
		pnlSuperior.add(txtSector);

		JLabel lblProyecto = new JLabel("Proyecto");
		lblProyecto.setBounds(170, 11, 57, 14);
		pnlSuperior.add(lblProyecto);

		JLabel lblZona = new JLabel("Zona");
		lblZona.setBounds(170, 55, 40, 14);
		pnlSuperior.add(lblZona);

		JLabel lblProvincia = new JLabel("Provincia");
		lblProvincia.setBounds(289, 55, 57, 14);
		pnlSuperior.add(lblProvincia);

		JLabel lblCanton = new JLabel("Cant\u00F3n");
		lblCanton.setBounds(472, 55, 40, 14);
		pnlSuperior.add(lblCanton);

		JLabel lblParroquia = new JLabel("Parroquia");
		lblParroquia.setBounds(661, 55, 57, 14);
		pnlSuperior.add(lblParroquia);

		JLabel lblSector = new JLabel("Sector");
		lblSector.setBounds(823, 55, 57, 14);
		pnlSuperior.add(lblSector);

		JLabel lblAmie = new JLabel("AMIE");
		lblAmie.setBounds(506, 11, 40, 14);
		pnlSuperior.add(lblAmie);

		JLabel lblDistrito = new JLabel("Distrito");
		lblDistrito.setBounds(626, 11, 64, 14);
		pnlSuperior.add(lblDistrito);

		JLabel lblCircuito = new JLabel("Circuito");
		lblCircuito.setHorizontalAlignment(SwingConstants.LEFT);
		lblCircuito.setBounds(823, 11, 100, 14);
		pnlSuperior.add(lblCircuito);

		JLabel lblFechaEntrega = new JLabel("Fecha Entrega");
		lblFechaEntrega.setHorizontalAlignment(SwingConstants.LEFT);
		lblFechaEntrega.setBounds(933, 11, 100, 14);
		pnlSuperior.add(lblFechaEntrega);

		JLabel lblFechaInicioTrabajo = new JLabel("Fecha Inicio Trabajo");
		lblFechaInicioTrabajo.setHorizontalAlignment(SwingConstants.LEFT);
		lblFechaInicioTrabajo.setBounds(1043, 11, 114, 14);
		pnlSuperior.add(lblFechaInicioTrabajo);

		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(1162, 11, 98, 81);
		pnlSuperior.add(btnRegistrar);

		txtProyecto = new JTextField();
		txtProyecto.setBounds(170, 28, 296, 20);
		pnlSuperior.add(txtProyecto);
		txtProyecto.setColumns(10);

		txtParroquia = new JTextField();
		txtParroquia.setColumns(10);
		txtParroquia.setBounds(661, 72, 125, 20);
		pnlSuperior.add(txtParroquia);
		return pnlSuperior;
	}
}
