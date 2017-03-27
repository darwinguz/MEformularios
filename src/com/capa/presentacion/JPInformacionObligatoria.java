
package com.capa.presentacion;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class JPInformacionObligatoria {

	private JPanel panel;
	private JPanel pnlIOEtiquetas1;
	private JPanel pnlIOTexts1;

	private JTextField txtObsGenIzq;
	private JTextField txtResponsableMineduc;
	private JTextField txtCargoIzq;
	private JPanel pnlIOEtiquetas2;
	private JPanel pnlIOTexts2;
	private JTextField txtObsGenDer;
	private JTextField txtResponsableContratista;
	private JTextField txtCargoDer;
	private JTextField txtFecha;

	public JPanel getInformacionObligatoria() {
		panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n Obligatoria",
				TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		panel.setBounds(434, 377, 838, 139);
		panel.setLayout(null);

		pnlIOEtiquetas1 = new JPanel();
		pnlIOEtiquetas1.setBounds(10, 28, 141, 97);
		panel.add(pnlIOEtiquetas1);
		pnlIOEtiquetas1.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel lblObsGenIzq = new JLabel("Observaciones Generales:  ");
		lblObsGenIzq.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlIOEtiquetas1.add(lblObsGenIzq);

		JLabel lblResponsableMineduc = new JLabel("Responsable MinEduc:  ");
		lblResponsableMineduc.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlIOEtiquetas1.add(lblResponsableMineduc);

		JLabel lblCargoIzq = new JLabel("Cargo:  ");
		lblCargoIzq.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlIOEtiquetas1.add(lblCargoIzq);

		pnlIOTexts1 = new JPanel();
		pnlIOTexts1.setBounds(161, 28, 196, 97);
		panel.add(pnlIOTexts1);
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
		pnlIOEtiquetas2.setBounds(481, 28, 141, 97);
		panel.add(pnlIOEtiquetas2);
		pnlIOEtiquetas2.setLayout(new GridLayout(4, 0, 0, 0));

		JLabel lblObsGenDer = new JLabel("Observaciones Generales:  ");
		lblObsGenDer.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlIOEtiquetas2.add(lblObsGenDer);

		JLabel lblResponsableContratista = new JLabel("Responsable Contratista:  ");
		lblResponsableContratista.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlIOEtiquetas2.add(lblResponsableContratista);

		JLabel lblCargoDer = new JLabel("Cargo:  ");
		lblCargoDer.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlIOEtiquetas2.add(lblCargoDer);

		JLabel lblFecha = new JLabel("Fecha:  ");
		lblFecha.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlIOEtiquetas2.add(lblFecha);

		pnlIOTexts2 = new JPanel();
		pnlIOTexts2.setBounds(632, 28, 196, 97);
		panel.add(pnlIOTexts2);
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

		JButton btnInsertarFoto = new JButton("Fotograf\u00EDa");
		btnInsertarFoto.setBounds(367, 28, 104, 97);
		panel.add(btnInsertarFoto);

		return panel;
	}

}
