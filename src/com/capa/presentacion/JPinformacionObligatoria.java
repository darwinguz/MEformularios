package com.capa.presentacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;

public class JPinformacionObligatoria {

	private JPanel pnlInformacionObl;

	private JTextField txtObsGenMin;
	private JTextField txtObsGenCont;
	private JTextField txtRespMinisterio;
	private JTextField txtRespContratista;
	private JTextField txtCargoMin;
	private JTextField txtCargoCont;
	private String pathFotoIO;

	private JDateChooser dateFechaIO;

	private JButton btnInsertarFoto;

	public JPinformacionObligatoria(int x, int y) {
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
		txtRespMinisterio = new JTextField();
		txtRespMinisterio.setColumns(10);
		pnlIOTexts1.add(txtRespMinisterio);
		txtCargoCont = new JTextField();
		txtCargoCont.setColumns(10);
		pnlIOTexts1.add(txtCargoCont);
		txtObsGenCont = new JTextField();
		txtObsGenCont.setColumns(10);
		pnlIOTexts1.add(txtObsGenCont);

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

		txtRespContratista = new JTextField();
		txtRespContratista.setColumns(10);
		pnlIOTexts2.add(txtRespContratista);
		txtCargoMin = new JTextField();
		txtCargoMin.setColumns(10);
		pnlIOTexts2.add(txtCargoMin);
		txtObsGenMin = new JTextField();
		txtObsGenMin.setColumns(10);
		pnlIOTexts2.add(txtObsGenMin);

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
		dateFechaIO = new JDateChooser();
		dateFechaIO.setDateFormatString("yyyy-MM-dd");
		dateFechaIO.setDate(new Date());

		pnlIOfechaTXT.add(dateFechaIO);

		btnInsertarFoto = new JButton("Insertar FOTO");
		btnInsertarFoto.setBounds(166, 175, 120, 23);
		pnlInformacionObl.add(btnInsertarFoto);
	}

	public JPanel getPnlInformacionObl() {
		return pnlInformacionObl;
	}

	public void setPnlInformacionObl(JPanel pnlInformacionObl) {
		this.pnlInformacionObl = pnlInformacionObl;
	}

	public JTextField getTxtObsGenMin() {
		return txtObsGenMin;
	}

	public void setTxtObsGenMin(JTextField txtObsGenMin) {
		this.txtObsGenMin = txtObsGenMin;
	}

	public JTextField getTxtObsGenCont() {
		return txtObsGenCont;
	}

	public void setTxtObsGenCont(JTextField txtObsGenCont) {
		this.txtObsGenCont = txtObsGenCont;
	}

	public JTextField getTxtRespMinisterio() {
		return txtRespMinisterio;
	}

	public void setTxtRespMinisterio(JTextField txtRespMinisterio) {
		this.txtRespMinisterio = txtRespMinisterio;
	}

	public JTextField getTxtRespContratista() {
		return txtRespContratista;
	}

	public void setTxtRespContratista(JTextField txtRespContratista) {
		this.txtRespContratista = txtRespContratista;
	}

	public JTextField getTxtCargoMin() {
		return txtCargoMin;
	}

	public void setTxtCargoMin(JTextField txtCargoMin) {
		this.txtCargoMin = txtCargoMin;
	}

	public JTextField getTxtCargoCont() {
		return txtCargoCont;
	}

	public void setTxtCargoCont(JTextField txtCargoCont) {
		this.txtCargoCont = txtCargoCont;
	}

	public String getPathFotoIO() {
		return pathFotoIO;
	}

	public void setPathFotoIO(String pathFotoIO) {
		this.pathFotoIO = pathFotoIO;
	}

	public JDateChooser getDateFechaIO() {
		return dateFechaIO;
	}

	public void setDateFechaIO(JDateChooser dateFechaIO) {
		this.dateFechaIO = dateFechaIO;
	}

	public JButton getBtnInsertarFoto() {
		return btnInsertarFoto;
	}

	public void setBtnInsertarFoto(JButton btnInsertarFoto) {
		this.btnInsertarFoto = btnInsertarFoto;
	}

	@Override
	public String toString() {
		try {
			return "InformacionObligatoriaV [txtObsGenMin=" + txtObsGenMin.getText() + ", txtObsGenCont="
					+ txtObsGenCont.getText() + ", txtRespMinisterio=" + txtRespMinisterio.getText()
					+ ", txtRespContratista=" + txtRespContratista.getText() + ", txtCargoMin=" + txtCargoMin.getText()
					+ ", txtCargoCont=" + txtCargoCont.getText() + ", pathFotoIO=" + pathFotoIO + ", dateFechaIO="
					+ dateFechaIO.getDate() + "]";
		} catch (Exception e) {
			return "error";
		}
	}

}
