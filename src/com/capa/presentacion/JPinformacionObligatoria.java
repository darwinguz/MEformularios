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

	private JTextField jtxtResponsableMin;
	private JTextField jtxtCargoMin;
	private JTextField jtxtObsGenMin;

	private JTextField jtxtResponsableCont;
	private JTextField jtxtCargoCont;
	private JTextField jtxtObsGenCont;

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
		jtxtResponsableMin = new JTextField();
		jtxtResponsableMin.setColumns(10);
		pnlIOTexts1.add(jtxtResponsableMin);
		jtxtCargoMin = new JTextField();
		jtxtCargoMin.setColumns(10);
		pnlIOTexts1.add(jtxtCargoMin);
		jtxtObsGenMin = new JTextField();
		jtxtObsGenMin.setColumns(10);
		pnlIOTexts1.add(jtxtObsGenMin);

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

		jtxtResponsableCont = new JTextField();
		jtxtResponsableCont.setColumns(10);
		pnlIOTexts2.add(jtxtResponsableCont);
		jtxtCargoCont = new JTextField();
		jtxtCargoCont.setColumns(10);
		pnlIOTexts2.add(jtxtCargoCont);
		jtxtObsGenCont = new JTextField();
		jtxtObsGenCont.setColumns(10);
		pnlIOTexts2.add(jtxtObsGenCont);

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

	public JTextField getJtxtResponsableMin() {
		return jtxtResponsableMin;
	}

	public void setJtxtResponsableMin(JTextField jtxtResponsableMin) {
		this.jtxtResponsableMin = jtxtResponsableMin;
	}

	public JTextField getJtxtCargoMin() {
		return jtxtCargoMin;
	}

	public void setJtxtCargoMin(JTextField jtxtCargoMin) {
		this.jtxtCargoMin = jtxtCargoMin;
	}

	public JTextField getJtxtObsGenMin() {
		return jtxtObsGenMin;
	}

	public void setJtxtObsGenMin(JTextField jtxtObsGenMin) {
		this.jtxtObsGenMin = jtxtObsGenMin;
	}

	public JTextField getJtxtResponsableCont() {
		return jtxtResponsableCont;
	}

	public void setJtxtResponsableCont(JTextField jtxtResponsableCont) {
		this.jtxtResponsableCont = jtxtResponsableCont;
	}

	public JTextField getJtxtCargoCont() {
		return jtxtCargoCont;
	}

	public void setJtxtCargoCont(JTextField jtxtCargoCont) {
		this.jtxtCargoCont = jtxtCargoCont;
	}

	public JTextField getJtxtObsGenCont() {
		return jtxtObsGenCont;
	}

	public void setJtxtObsGenCont(JTextField jtxtObsGenCont) {
		this.jtxtObsGenCont = jtxtObsGenCont;
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
		return "JPinformacionObligatoria [jtxtResponsableMin=" + jtxtResponsableMin + ", jtxtCargoMin=" + jtxtCargoMin
				+ ", jtxtObsGenMin=" + jtxtObsGenMin + ", jtxtResponsableCont=" + jtxtResponsableCont
				+ ", jtxtCargoCont=" + jtxtCargoCont + ", jtxtObsGenCont=" + jtxtObsGenCont + "]";
	}

}
