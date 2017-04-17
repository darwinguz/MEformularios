package com.capa.presentacion;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import com.capa.util.Utilitarios;

public class JPcabecera {

	private JPanel pnlSuperior;
	private JButton btnRegistrar;

	private JTextField txtProyecto;
	private JTextField txtAmie;
	private JTextField txtDistrito;
	private JTextField txtCircuito;
	private JTextField txtFechaEntrega;
	private JTextField txtFechaInicioTrabajo;
	private JTextField txtZona;
	private JTextField txtProvincia;
	private JTextField txtCanton;
	private JTextField txtParroquia;
	private JTextField txtSector;

	public JPanel getCabecera() {
		pnlSuperior = new JPanel();
		pnlSuperior.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlSuperior.setBounds(10, 10, 1270, 103);
		pnlSuperior.setLayout(null);

		JLabel lblLogoMinEdu = new JLabel("");
		lblLogoMinEdu.setIcon(Utilitarios.getImagenIcon("logoMinEdu.png", 160, 80, 100));
		lblLogoMinEdu.setBounds(0, 11, 160, 81);
		pnlSuperior.add(lblLogoMinEdu);

		JLabel lblProyecto = new JLabel(" Proyecto");
		lblProyecto.setBounds(170, 11, 57, 14);
		lblProyecto.setFont(new Font("Arial", Font.PLAIN, 11));
		pnlSuperior.add(lblProyecto);

		txtProyecto = new JTextField();
		txtProyecto.setBounds(170, 28, 310, 20);
		txtProyecto.setEditable(false);
		pnlSuperior.add(txtProyecto);
		txtProyecto.setColumns(10);

		JLabel lblZona = new JLabel(" Zona");
		lblZona.setBounds(170, 55, 40, 14);
		lblZona.setFont(new Font("Arial", Font.PLAIN, 11));
		pnlSuperior.add(lblZona);

		txtZona = new JTextField();
		txtZona.setHorizontalAlignment(SwingConstants.CENTER);
		txtZona.setBounds(170, 72, 30, 20);
		txtZona.setEditable(false);
		pnlSuperior.add(txtZona);

		JLabel lblProvincia = new JLabel(" Provincia");
		lblProvincia.setBounds(220, 55, 57, 14);
		lblProvincia.setFont(new Font("Arial", Font.PLAIN, 11));
		pnlSuperior.add(lblProvincia);

		txtProvincia = new JTextField();
		txtProvincia.setBounds(220, 72, 206, 20);
		txtProvincia.setEditable(false);
		pnlSuperior.add(txtProvincia);

		JLabel lblCanton = new JLabel(" Cant\u00F3n");
		lblCanton.setBounds(440, 59, 40, 14);
		lblCanton.setFont(new Font("Arial", Font.PLAIN, 11));
		pnlSuperior.add(lblCanton);

		txtCanton = new JTextField();
		txtCanton.setBounds(440, 72, 144, 20);
		txtCanton.setEditable(false);
		pnlSuperior.add(txtCanton);

		JLabel lblParroquia = new JLabel(" Parroquia");
		lblParroquia.setBounds(594, 55, 57, 14);
		lblParroquia.setFont(new Font("Arial", Font.PLAIN, 11));
		pnlSuperior.add(lblParroquia);

		txtParroquia = new JTextField();
		txtParroquia.setColumns(10);
		txtParroquia.setBounds(594, 72, 192, 20);
		txtParroquia.setEditable(false);
		pnlSuperior.add(txtParroquia);

		JLabel lblSector = new JLabel(" Sector");
		lblSector.setBounds(796, 55, 57, 14);
		lblSector.setFont(new Font("Arial", Font.PLAIN, 11));
		pnlSuperior.add(lblSector);

		txtSector = new JTextField();
		txtSector.setColumns(10);
		txtSector.setBounds(796, 72, 345, 20);
		txtSector.setEditable(false);
		pnlSuperior.add(txtSector);

		JLabel lblAmie = new JLabel(" AMIE");
		lblAmie.setBounds(500, 11, 40, 14);
		lblAmie.setFont(new Font("Arial", Font.PLAIN, 11));
		pnlSuperior.add(lblAmie);

		txtAmie = new JTextField();
		txtAmie.setBounds(500, 28, 92, 20);
		txtAmie.setEditable(false);
		pnlSuperior.add(txtAmie);
		txtAmie.setColumns(10);

		JLabel lblDistrito = new JLabel(" Distrito");
		lblDistrito.setBounds(610, 11, 64, 14);
		lblDistrito.setFont(new Font("Arial", Font.PLAIN, 11));
		pnlSuperior.add(lblDistrito);

		txtDistrito = new JTextField();
		txtDistrito.setBounds(610, 28, 192, 20);
		txtDistrito.setEditable(false);
		pnlSuperior.add(txtDistrito);

		JLabel lblCircuito = new JLabel(" Circuito");
		lblCircuito.setHorizontalAlignment(SwingConstants.LEFT);
		lblCircuito.setBounds(817, 11, 100, 14);
		lblCircuito.setFont(new Font("Arial", Font.PLAIN, 11));
		pnlSuperior.add(lblCircuito);

		txtCircuito = new JTextField();
		txtCircuito.setBounds(817, 28, 106, 20);
		txtCircuito.setEditable(false);
		pnlSuperior.add(txtCircuito);
		txtCircuito.setColumns(10);

		JLabel lblFechaEntrega = new JLabel(" Fecha Entrega");
		lblFechaEntrega.setHorizontalAlignment(SwingConstants.LEFT);
		lblFechaEntrega.setBounds(933, 11, 100, 14);
		lblFechaEntrega.setFont(new Font("Arial", Font.PLAIN, 11));
		pnlSuperior.add(lblFechaEntrega);

		txtFechaEntrega = new JTextField();
		txtFechaEntrega.setColumns(10);
		txtFechaEntrega.setBounds(933, 28, 100, 20);
		txtFechaEntrega.setEditable(false);
		pnlSuperior.add(txtFechaEntrega);

		JLabel lblFechaInicioTrabajo = new JLabel(" Fecha Inicio Trabajo");
		lblFechaInicioTrabajo.setHorizontalAlignment(SwingConstants.LEFT);
		lblFechaInicioTrabajo.setBounds(1043, 11, 114, 14);
		lblFechaInicioTrabajo.setFont(new Font("Arial", Font.PLAIN, 11));
		pnlSuperior.add(lblFechaInicioTrabajo);

		txtFechaInicioTrabajo = new JTextField();
		txtFechaInicioTrabajo.setColumns(10);
		txtFechaInicioTrabajo.setBounds(1043, 28, 100, 20);
		txtFechaInicioTrabajo.setEditable(false);
		pnlSuperior.add(txtFechaInicioTrabajo);

		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(1162, 11, 98, 81);
		pnlSuperior.add(btnRegistrar);
		return pnlSuperior;
	}

	public JButton getBtnRegistrar() {
		return btnRegistrar;
	}

	public void setBtnRegistrar(JButton btnRegistrar) {
		this.btnRegistrar = btnRegistrar;
	}

	public JTextField getTxtAmie() {
		return txtAmie;
	}

	public void setTxtAmie(JTextField txtAmie) {
		this.txtAmie = txtAmie;
	}

	public JTextField getTxtCircuito() {
		return txtCircuito;
	}

	public void setTxtCircuito(JTextField txtCircuito) {
		this.txtCircuito = txtCircuito;
	}

	public JTextField getTxtFechaEntrega() {
		return txtFechaEntrega;
	}

	public void setTxtFechaEntrega(JTextField txtFechaEntrega) {
		this.txtFechaEntrega = txtFechaEntrega;
	}

	public JTextField getTxtSector() {
		return txtSector;
	}

	public void setTxtSector(JTextField txtSector) {
		this.txtSector = txtSector;
	}

	public JTextField getTxtFechaInicioTrabajo() {
		return txtFechaInicioTrabajo;
	}

	public void setTxtFechaInicioTrabajo(JTextField txtFechaInicioTrabajo) {
		this.txtFechaInicioTrabajo = txtFechaInicioTrabajo;
	}

	public JTextField getTxtProyecto() {
		return txtProyecto;
	}

	public void setTxtProyecto(JTextField txtProyecto) {
		this.txtProyecto = txtProyecto;
	}

	public JTextField getTxtParroquia() {
		return txtParroquia;
	}

	public void setTxtParroquia(JTextField txtParroquia) {
		this.txtParroquia = txtParroquia;
	}

	public JTextField getTxtDistrito() {
		return txtDistrito;
	}

	public void setTxtDistrito(JTextField txtDistrito) {
		this.txtDistrito = txtDistrito;
	}

	public JTextField getTxtZona() {
		return txtZona;
	}

	public void setTxtZona(JTextField txtZona) {
		this.txtZona = txtZona;
	}

	public JTextField getTxtProvincia() {
		return txtProvincia;
	}

	public void setTxtProvincia(JTextField txtProvincia) {
		this.txtProvincia = txtProvincia;
	}

	public JTextField getTxtCanton() {
		return txtCanton;
	}

	public void setTxtCanton(JTextField txtCanton) {
		this.txtCanton = txtCanton;
	}

}
