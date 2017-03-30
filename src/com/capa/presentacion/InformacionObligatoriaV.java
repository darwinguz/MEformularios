package com.capa.presentacion;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class InformacionObligatoriaV {

	private JPanel pnlInformacionObl;
	private JPanel pnlIOTexts2;
	private JTextField txtObsGenDer;
	private JTextField txtResponsableContratista;
	private JTextField txtCargoDer;
	private JTextField txtFecha;
	private JPanel pnlIOTexts1;
	private JTextField txtObsGenIzq;
	private JTextField txtResponsableMineduc;
	private JTextField txtCargoIzq;
	private JPanel pnlIOEtiquetas1;
	private JLabel lblObsGenIzq;
	private JLabel lblResponsableMineduc;
	private JLabel lblCargoIzq;
	private JPanel pnlIOEtiquetas2;
	private JLabel lblObsGenDer;
	private JLabel lblResponsableContratista;
	private JLabel lblCargoDer;
	private JLabel lblFecha;
	private JButton btnInsertarFoto;

	public InformacionObligatoriaV(int x, int y) {
		pnlInformacionObl = new JPanel();
		pnlInformacionObl.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"Informaci\u00F3n Obligatoria", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		pnlInformacionObl.setBounds(x, y, 414, 244);
		pnlInformacionObl.setLayout(null);

		pnlIOEtiquetas1 = new JPanel();
		pnlIOEtiquetas1.setBounds(10, 22, 157, 73);
		pnlInformacionObl.add(pnlIOEtiquetas1);
		pnlIOEtiquetas1.setLayout(new GridLayout(3, 0, 0, 0));

		lblObsGenIzq = new JLabel("Observaciones Generales:");
		pnlIOEtiquetas1.add(lblObsGenIzq);

		lblResponsableMineduc = new JLabel("Responsable MinEduc:");
		pnlIOEtiquetas1.add(lblResponsableMineduc);

		lblCargoIzq = new JLabel("Cargo:");
		pnlIOEtiquetas1.add(lblCargoIzq);

		pnlIOTexts1 = new JPanel();
		pnlIOTexts1.setBounds(166, 22, 238, 73);
		pnlInformacionObl.add(pnlIOTexts1);
		pnlIOTexts1.setLayout(new GridLayout(3, 0, 0, 0));

		txtObsGenIzq = new JTextField();
		txtObsGenIzq.setColumns(10);
		pnlIOTexts1.add(txtObsGenIzq);

		txtResponsableMineduc = new JTextField();
		txtResponsableMineduc.setColumns(10);
		pnlIOTexts1.add(txtResponsableMineduc);

		txtCargoIzq = new JTextField();
		txtCargoIzq.setColumns(10);
		pnlIOTexts1.add(txtCargoIzq);

		pnlIOEtiquetas2 = new JPanel();
		pnlIOEtiquetas2.setBounds(10, 102, 157, 97);
		pnlInformacionObl.add(pnlIOEtiquetas2);
		pnlIOEtiquetas2.setLayout(new GridLayout(4, 0, 0, 0));

		lblObsGenDer = new JLabel("Observaciones Generales:");
		pnlIOEtiquetas2.add(lblObsGenDer);

		lblResponsableContratista = new JLabel("Responsable Contratista:");
		pnlIOEtiquetas2.add(lblResponsableContratista);

		lblCargoDer = new JLabel("Cargo:");
		pnlIOEtiquetas2.add(lblCargoDer);

		lblFecha = new JLabel("Fecha:");
		pnlIOEtiquetas2.add(lblFecha);

		pnlIOTexts2 = new JPanel();
		pnlIOTexts2.setBounds(166, 102, 238, 97);
		pnlInformacionObl.add(pnlIOTexts2);
		pnlIOTexts2.setLayout(new GridLayout(4, 0, 0, 0));

		txtObsGenDer = new JTextField();
		txtObsGenDer.setColumns(10);
		pnlIOTexts2.add(txtObsGenDer);

		txtResponsableContratista = new JTextField();
		txtResponsableContratista.setColumns(10);
		pnlIOTexts2.add(txtResponsableContratista);

		txtCargoDer = new JTextField();
		txtCargoDer.setColumns(10);
		pnlIOTexts2.add(txtCargoDer);

		txtFecha = new JTextField();
		txtFecha.setColumns(10);
		pnlIOTexts2.add(txtFecha);

		btnInsertarFoto = new JButton("Insertar FOTO");
		btnInsertarFoto.setBounds(166, 201, 120, 35);
		pnlInformacionObl.add(btnInsertarFoto);
	}

	public JTextField getTxtObsGenDer() {
		return txtObsGenDer;
	}

	public void setTxtObsGenDer(JTextField txtObsGenDer) {
		this.txtObsGenDer = txtObsGenDer;
	}

	public JTextField getTxtResponsableContratista() {
		return txtResponsableContratista;
	}

	public void setTxtResponsableContratista(JTextField txtResponsableContratista) {
		this.txtResponsableContratista = txtResponsableContratista;
	}

	public JTextField getTxtCargoDer() {
		return txtCargoDer;
	}

	public void setTxtCargoDer(JTextField txtCargoDer) {
		this.txtCargoDer = txtCargoDer;
	}

	public JTextField getTxtFecha() {
		return txtFecha;
	}

	public void setTxtFecha(JTextField txtFecha) {
		this.txtFecha = txtFecha;
	}

	public JTextField getTxtObsGenIzq() {
		return txtObsGenIzq;
	}

	public void setTxtObsGenIzq(JTextField txtObsGenIzq) {
		this.txtObsGenIzq = txtObsGenIzq;
	}

	public JTextField getTxtResponsableMineduc() {
		return txtResponsableMineduc;
	}

	public void setTxtResponsableMineduc(JTextField txtResponsableMineduc) {
		this.txtResponsableMineduc = txtResponsableMineduc;
	}

	public JTextField getTxtCargoIzq() {
		return txtCargoIzq;
	}

	public void setTxtCargoIzq(JTextField txtCargoIzq) {
		this.txtCargoIzq = txtCargoIzq;
	}

	public JPanel getPnlInformacionObl() {
		return pnlInformacionObl;
	}

	public void setPnlInformacionObl(JPanel pnlInformacionObl) {
		this.pnlInformacionObl = pnlInformacionObl;
	}

	public JButton getBtnInsertarFoto() {
		return btnInsertarFoto;
	}

	public void setBtnInsertarFoto(JButton btnInsertarFoto) {
		this.btnInsertarFoto = btnInsertarFoto;
	}
	
}
