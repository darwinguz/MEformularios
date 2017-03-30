package com.capa.presentacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class InformacionObligatoriaV {

	private JPanel pnlInformacionObl;

	private JTextField txtObsGenDer;
	private JTextField txtResponsableContratista;
	private JTextField txtCargoDer;
	private JTextField txtFecha;
	private JTextField txtObsGenIzq;
	private JTextField txtResponsableMineduc;
	private JTextField txtCargoIzq;

	private JButton btnInsertarFoto;

	public InformacionObligatoriaV(int x, int y) {
		pnlInformacionObl = new JPanel();
		pnlInformacionObl
				.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n Obligatoria",
						TitledBorder.LEADING, TitledBorder.TOP, new Font("Arial", Font.BOLD, 12), Color.RED));
		pnlInformacionObl.setBounds(x, y, 414, 210);
		pnlInformacionObl.setLayout(null);

		JPanel pnlIOEtiquetas1 = new JPanel();
		pnlIOEtiquetas1.setBounds(10, 20, 157, 60);
		pnlInformacionObl.add(pnlIOEtiquetas1);
		pnlIOEtiquetas1.setLayout(new GridLayout(3, 0, 0, 0));
		JPanel pnlIOTexts1 = new JPanel();
		pnlIOTexts1.setBounds(166, 20, 238, 60);
		pnlInformacionObl.add(pnlIOTexts1);
		pnlIOTexts1.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel lblResponsableMineduc = new JLabel("  Responsable MinEduc:");
		lblResponsableMineduc.setFont(new Font("Arial", Font.PLAIN, 11));
		lblResponsableMineduc.setOpaque(true);
		lblResponsableMineduc.setBackground(new Color(176, 196, 222));
		pnlIOEtiquetas1.add(lblResponsableMineduc);
		JLabel lblCargoIzq = new JLabel("  Cargo:");
		lblCargoIzq.setFont(new Font("Arial", Font.PLAIN, 11));
		lblCargoIzq.setOpaque(true);
		lblCargoIzq.setBackground(new Color(211, 211, 211));
		pnlIOEtiquetas1.add(lblCargoIzq);
		JLabel lblObsGenIzq = new JLabel("  Observaciones Generales:");
		lblObsGenIzq.setFont(new Font("Arial", Font.PLAIN, 11));
		lblObsGenIzq.setOpaque(true);
		lblObsGenIzq.setBackground(new Color(176, 196, 222));
		pnlIOEtiquetas1.add(lblObsGenIzq);
		txtResponsableMineduc = new JTextField();
		txtResponsableMineduc.setColumns(10);
		pnlIOTexts1.add(txtResponsableMineduc);
		txtCargoIzq = new JTextField();
		txtCargoIzq.setColumns(10);
		pnlIOTexts1.add(txtCargoIzq);
		txtObsGenIzq = new JTextField();
		txtObsGenIzq.setColumns(10);
		pnlIOTexts1.add(txtObsGenIzq);

		JPanel pnlIOEtiquetas2 = new JPanel();
		pnlIOEtiquetas2.setBounds(10, 85, 157, 60);
		pnlInformacionObl.add(pnlIOEtiquetas2);
		pnlIOEtiquetas2.setLayout(new GridLayout(3, 0, 0, 0));
		JPanel pnlIOTexts2 = new JPanel();
		pnlIOTexts2.setBounds(166, 85, 238, 60);
		pnlInformacionObl.add(pnlIOTexts2);
		pnlIOTexts2.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel lblResponsableContratista = new JLabel("  Responsable Contratista:");
		lblResponsableContratista.setFont(new Font("Arial", Font.PLAIN, 11));
		lblResponsableContratista.setOpaque(true);
		lblResponsableContratista.setBackground(new Color(176, 196, 222));
		pnlIOEtiquetas2.add(lblResponsableContratista);
		JLabel lblCargoDer = new JLabel("  Cargo:");
		lblCargoDer.setFont(new Font("Arial", Font.PLAIN, 11));
		lblCargoDer.setOpaque(true);
		lblCargoDer.setBackground(new Color(211, 211, 211));
		pnlIOEtiquetas2.add(lblCargoDer);
		JLabel lblObsGenDer = new JLabel("  Observaciones Generales:");
		lblObsGenDer.setFont(new Font("Arial", Font.PLAIN, 11));
		lblObsGenDer.setOpaque(true);
		lblObsGenDer.setBackground(new Color(176, 196, 222));
		pnlIOEtiquetas2.add(lblObsGenDer);

		txtResponsableContratista = new JTextField();
		txtResponsableContratista.setColumns(10);
		pnlIOTexts2.add(txtResponsableContratista);
		txtCargoDer = new JTextField();
		txtCargoDer.setColumns(10);
		pnlIOTexts2.add(txtCargoDer);
		txtObsGenDer = new JTextField();
		txtObsGenDer.setColumns(10);
		pnlIOTexts2.add(txtObsGenDer);

		JPanel pnlIOfechaLBL = new JPanel();
		pnlIOfechaLBL.setBounds(10, 150, 157, 20);
		pnlInformacionObl.add(pnlIOfechaLBL);
		pnlIOfechaLBL.setLayout(new GridLayout(1, 0, 0, 0));
		JPanel pnlIOfechaTXT = new JPanel();
		pnlIOfechaTXT.setBounds(166, 150, 238, 20);
		pnlInformacionObl.add(pnlIOfechaTXT);
		pnlIOfechaTXT.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblFecha = new JLabel("  Fecha:");
		lblFecha.setFont(new Font("Arial", Font.PLAIN, 11));
		lblFecha.setOpaque(true);
		lblFecha.setBackground(new Color(211, 211, 211));
		pnlIOfechaLBL.add(lblFecha);
		txtFecha = new JTextField();
		txtFecha.setColumns(10);
		pnlIOfechaTXT.add(txtFecha);

		btnInsertarFoto = new JButton("Insertar FOTO");
		btnInsertarFoto.setBounds(166, 175, 120, 23);
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
