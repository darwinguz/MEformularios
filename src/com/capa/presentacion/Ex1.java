package com.capa.presentacion;

import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import com.capa.util.Utilitarios;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;

public class Ex1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtAmie;
	private JTextField txtCircuito;
	private JTextField txtFechaEntrega;
	private JTextField txtFechaInicioTrabajo;
	private JTextField txtSector;
	private JTextField txtProyecto;
	private JTextField txtParroquia;
	private JTextField txtCantidad00;
	private JTextField txtCantidad01;
	private JTextField txtCantidad10;
	private JTextField txtCantidad11;
	private JTextField txtCantidad20;
	private JTextField txtCantidad21;
	private JTextField txtCantidad30;
	private JTextField txtCantidad31;
	private JTextField txtCantidad40;
	private JTextField txtCantidad41;
	private JTextField txtCantidad50;
	private JTextField txtCantidad51;
	private JTextField txtCantidad60;
	private JTextField txtCantidad61;
	private JTextField txtCantidad70;
	private JTextField txtCantidad71;
	private JTextField txtCantidad80;
	private JTextField txtCantidad81;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JLabel lblNewLabel;
	private JLabel lblObservacin;
	private JPanel panel;
	private JPanel panel_2;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_9;
	private JPanel panel_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JPanel panel_4;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JLabel label_10;
	private JLabel label_11;
	private JPanel panel_5;
	private JPanel panel_6;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_18;
	private JPanel panel_7;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JPanel panel_8;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JLabel label_19;
	private JLabel label_20;
	private JPanel panel_9;
	private JPanel panel_10;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel label_23;
	private JLabel label_24;
	private JLabel label_25;
	private JLabel label_27;
	private JPanel panel_11;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JPanel panel_12;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JLabel label_28;
	private JLabel label_29;
	private JPanel panel_13;
	private JPanel panel_14;
	private JLabel label_16;
	private JLabel label_17;
	private JLabel label_26;
	private JLabel label_32;
	private JPanel panel_15;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_52;
	private JTextField textField_53;
	private JPanel panel_16;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JLabel label_33;
	private JLabel label_34;
	private JPanel panel_17;
	private JPanel panel_18;
	private JLabel label_30;
	private JLabel label_36;
	private JPanel panel_19;
	private JTextField textField_64;
	private JTextField textField_65;
	private JPanel panel_20;
	private JTextField textField_78;
	private JLabel label_37;
	private JLabel label_38;
	private JPanel panel_21;
	private JPanel panel_23;
	private JTextField textField_77;
	private JTextField textField_79;
	private JTextField textField_80;
	private JTextField textField_82;
	private JPanel panel_22;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_76;
	private JPanel panel_24;
	private JLabel label_31;
	private JLabel label_35;
	private JLabel label_39;
	private JPanel panel_25;
	private JLabel label_40;
	private JLabel label_41;
	private JLabel label_42;
	private JLabel label_43;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex1 frame = new Ex1();
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
	public Ex1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1318, 659);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel pnlSuperior = new JPanel();
		pnlSuperior.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlSuperior.setBounds(127, 11, 1052, 103);
		contentPane.add(pnlSuperior);
		pnlSuperior.setLayout(null);

		JLabel lblLogoMinEdu = new JLabel("");
		lblLogoMinEdu.setIcon(Utilitarios.getImagenIcon("logoMinEdu.png", 160, 80, 100));
		lblLogoMinEdu.setBounds(0, 11, 160, 81);
		pnlSuperior.add(lblLogoMinEdu);
		
		txtAmie = new JTextField();
		txtAmie.setBounds(391, 24, 86, 20);
		pnlSuperior.add(txtAmie);
		txtAmie.setColumns(10);
		
		JComboBox cmbDistrito = new JComboBox();
		cmbDistrito.setBounds(512, 24, 160, 20);
		pnlSuperior.add(cmbDistrito);
		
		JComboBox cmbZona = new JComboBox();
		cmbZona.setBounds(160, 72, 50, 20);
		pnlSuperior.add(cmbZona);
		
		JComboBox cmbProvincia = new JComboBox();
		cmbProvincia.setBounds(234, 72, 125, 20);
		pnlSuperior.add(cmbProvincia);
		
		JComboBox cmbCanton = new JComboBox();
		cmbCanton.setBounds(391, 72, 125, 20);
		pnlSuperior.add(cmbCanton);
		
		txtCircuito = new JTextField();
		txtCircuito.setBounds(717, 24, 86, 20);
		pnlSuperior.add(txtCircuito);
		txtCircuito.setColumns(10);
		
		txtFechaEntrega = new JTextField();
		txtFechaEntrega.setColumns(10);
		txtFechaEntrega.setBounds(813, 24, 86, 20);
		pnlSuperior.add(txtFechaEntrega);
		
		txtFechaInicioTrabajo = new JTextField();
		txtFechaInicioTrabajo.setColumns(10);
		txtFechaInicioTrabajo.setBounds(912, 24, 86, 20);
		pnlSuperior.add(txtFechaInicioTrabajo);
		
		txtSector = new JTextField();
		txtSector.setColumns(10);
		txtSector.setBounds(705, 72, 208, 20);
		pnlSuperior.add(txtSector);
		
		JLabel lblProyecto = new JLabel("Proyecto");
		lblProyecto.setBounds(164, 11, 57, 14);
		pnlSuperior.add(lblProyecto);
		
		JLabel lblZona = new JLabel("Zona");
		lblZona.setBounds(160, 55, 40, 14);
		pnlSuperior.add(lblZona);
		
		JLabel lblProvincia = new JLabel("Provincia");
		lblProvincia.setBounds(234, 55, 57, 14);
		pnlSuperior.add(lblProvincia);
		
		JLabel lblCanton = new JLabel("Cant\u00F3n");
		lblCanton.setBounds(391, 55, 40, 14);
		pnlSuperior.add(lblCanton);
		
		JLabel lblParroquia = new JLabel("Parroquia");
		lblParroquia.setBounds(545, 55, 57, 14);
		pnlSuperior.add(lblParroquia);
		
		JLabel lblSector = new JLabel("Sector");
		lblSector.setBounds(705, 55, 57, 14);
		pnlSuperior.add(lblSector);
		
		JLabel lblAmie = new JLabel("AMIE");
		lblAmie.setBounds(391, 11, 40, 14);
		pnlSuperior.add(lblAmie);
		
		JLabel lblDistrito = new JLabel("Distrito");
		lblDistrito.setBounds(512, 11, 64, 14);
		pnlSuperior.add(lblDistrito);
		
		JLabel lblCircuito = new JLabel("Circuito");
		lblCircuito.setBounds(717, 11, 57, 14);
		pnlSuperior.add(lblCircuito);
		
		JLabel lblFechaEntrega = new JLabel("Fecha Entrega");
		lblFechaEntrega.setBounds(813, 11, 84, 14);
		pnlSuperior.add(lblFechaEntrega);
		
		JLabel lblFechaInicioTrabajo = new JLabel("Fecha Inicio Trabajo");
		lblFechaInicioTrabajo.setBounds(911, 11, 114, 14);
		pnlSuperior.add(lblFechaInicioTrabajo);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(938, 60, 98, 32);
		pnlSuperior.add(btnRegistrar);
		
		txtProyecto = new JTextField();
		txtProyecto.setBounds(160, 24, 199, 20);
		pnlSuperior.add(txtProyecto);
		txtProyecto.setColumns(10);
		
		txtParroquia = new JTextField();
		txtParroquia.setColumns(10);
		txtParroquia.setBounds(545, 72, 114, 20);
		pnlSuperior.add(txtParroquia);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 125, 1286, 484);
		contentPane.add(tabbedPane);
		
		JPanel pnlPestaña1 = new JPanel();
		tabbedPane.addTab("1.-EX-KIT ELÉCTRICA EXTERNA", null, pnlPestaña1, null);
		pnlPestaña1.setLayout(null);
		
		JPanel pnlKitTableros = new JPanel();
		pnlKitTableros.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlKitTableros.setBounds(10, 11, 414, 237);
		pnlPestaña1.add(pnlKitTableros);
		pnlKitTableros.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(3, 17, 199, 217);
		pnlKitTableros.add(panel_1);
		panel_1.setLayout(new GridLayout(9, 0, 0, 0));
		
		JLabel lblTableroElectricoA = new JLabel("Tablero El\u00E9ctrico Tipo A");
		panel_1.add(lblTableroElectricoA);
		
		JLabel lblTableroElectricoB = new JLabel("Tablero El\u00E9ctrico Tipo B");
		panel_1.add(lblTableroElectricoB);
		
		JLabel lblTableroElectricoC = new JLabel("Tablero El\u00E9ctrico Tipo C");
		panel_1.add(lblTableroElectricoC);
		
		JLabel lblTableroElectricoD = new JLabel("Tablero El\u00E9ctrico Tipo D");
		panel_1.add(lblTableroElectricoD);
		
		JLabel lblTableroElectricoE = new JLabel("Tablero El\u00E9ctrico Tipo E");
		panel_1.add(lblTableroElectricoE);
		
		JLabel lblTableroElectricoF = new JLabel("Tablero El\u00E9ctrico Tipo F");
		panel_1.add(lblTableroElectricoF);
		
		JLabel lblKitCableadoElctrico = new JLabel("Kit Cableado El\u00E9ctrico TE");
		panel_1.add(lblKitCableadoElctrico);
		
		JLabel lblTuberia = new JLabel("Tuber\u00EDa PVC 2\u00B4para cableado l=6m");
		panel_1.add(lblTuberia);
		
		JLabel lblCajas = new JLabel("Cajas de Conexi\u00F3n  .60x.60 mt");
		panel_1.add(lblCajas);
		
		JLabel lblKitTablerosElectr = new JLabel("KIT DE TABLEROS EL\u00C9CTRICOS");
		lblKitTablerosElectr.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKitTablerosElectr.setBounds(3, 1, 176, 14);
		pnlKitTableros.add(lblKitTablerosElectr);
		
		JPanel pnlCantidad = new JPanel();
		pnlCantidad.setBounds(210, 17, 55, 217);
		pnlKitTableros.add(pnlCantidad);
		pnlCantidad.setLayout(new GridLayout(9, 2, 0, 0));
		
		txtCantidad00 = new JTextField();
		pnlCantidad.add(txtCantidad00);
		txtCantidad00.setColumns(10);
		
		txtCantidad01 = new JTextField();
		txtCantidad01.setColumns(10);
		pnlCantidad.add(txtCantidad01);
		
		txtCantidad10 = new JTextField();
		txtCantidad10.setColumns(10);
		pnlCantidad.add(txtCantidad10);
		
		txtCantidad11 = new JTextField();
		txtCantidad11.setColumns(10);
		pnlCantidad.add(txtCantidad11);
		
		txtCantidad20 = new JTextField();
		txtCantidad20.setColumns(10);
		pnlCantidad.add(txtCantidad20);
		
		txtCantidad21 = new JTextField();
		txtCantidad21.setColumns(10);
		pnlCantidad.add(txtCantidad21);
		
		txtCantidad30 = new JTextField();
		txtCantidad30.setColumns(10);
		pnlCantidad.add(txtCantidad30);
		
		txtCantidad31 = new JTextField();
		txtCantidad31.setColumns(10);
		pnlCantidad.add(txtCantidad31);
		
		txtCantidad40 = new JTextField();
		txtCantidad40.setColumns(10);
		pnlCantidad.add(txtCantidad40);
		
		txtCantidad41 = new JTextField();
		txtCantidad41.setColumns(10);
		pnlCantidad.add(txtCantidad41);
		
		txtCantidad50 = new JTextField();
		txtCantidad50.setColumns(10);
		pnlCantidad.add(txtCantidad50);
		
		txtCantidad51 = new JTextField();
		txtCantidad51.setColumns(10);
		pnlCantidad.add(txtCantidad51);
		
		txtCantidad60 = new JTextField();
		txtCantidad60.setColumns(10);
		pnlCantidad.add(txtCantidad60);
		
		txtCantidad61 = new JTextField();
		txtCantidad61.setColumns(10);
		pnlCantidad.add(txtCantidad61);
		
		txtCantidad70 = new JTextField();
		txtCantidad70.setColumns(10);
		pnlCantidad.add(txtCantidad70);
		
		txtCantidad71 = new JTextField();
		txtCantidad71.setColumns(10);
		pnlCantidad.add(txtCantidad71);
		
		txtCantidad80 = new JTextField();
		txtCantidad80.setColumns(10);
		pnlCantidad.add(txtCantidad80);
		
		txtCantidad81 = new JTextField();
		txtCantidad81.setColumns(10);
		pnlCantidad.add(txtCantidad81);
		
		JPanel pnlObsRef = new JPanel();
		pnlObsRef.setBounds(267, 17, 143, 217);
		pnlKitTableros.add(pnlObsRef);
		pnlObsRef.setLayout(new GridLayout(9, 0, 0, 0));
		
		textField_19 = new JTextField();
		pnlObsRef.add(textField_19);
		textField_19.setColumns(10);
		
		textField_18 = new JTextField();
		pnlObsRef.add(textField_18);
		textField_18.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		pnlObsRef.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		pnlObsRef.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		pnlObsRef.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		pnlObsRef.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		pnlObsRef.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		pnlObsRef.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		pnlObsRef.add(textField_26);
		
		lblNewLabel = new JLabel("Cantidad");
		lblNewLabel.setBounds(210, 1, 55, 14);
		pnlKitTableros.add(lblNewLabel);
		
		lblObservacin = new JLabel("Observaci\u00F3n/Referencia");
		lblObservacin.setBounds(267, 1, 143, 14);
		pnlKitTableros.add(lblObservacin);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 282, 414, 163);
		pnlPestaña1.add(panel);
		
		panel_2 = new JPanel();
		panel_2.setBounds(3, 17, 199, 144);
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(6, 0, 0, 0));
		
		label = new JLabel("Tablero El\u00E9ctrico Tipo A");
		panel_2.add(label);
		
		label_1 = new JLabel("Tablero El\u00E9ctrico Tipo B");
		panel_2.add(label_1);
		
		label_2 = new JLabel("Tablero El\u00E9ctrico Tipo C");
		panel_2.add(label_2);
		
		label_3 = new JLabel("Tablero El\u00E9ctrico Tipo D");
		panel_2.add(label_3);
		
		label_4 = new JLabel("Tablero El\u00E9ctrico Tipo E");
		panel_2.add(label_4);
		
		label_5 = new JLabel("Tablero El\u00E9ctrico Tipo F");
		panel_2.add(label_5);
		
		label_9 = new JLabel("KIT DE TABLEROS EL\u00C9CTRICOS");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_9.setBounds(3, 1, 176, 14);
		panel.add(label_9);
		
		panel_3 = new JPanel();
		panel_3.setBounds(210, 17, 55, 144);
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(6, 2, 0, 0));
		
		textField = new JTextField();
		textField.setColumns(10);
		panel_3.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel_3.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_3.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_3.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		panel_3.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		panel_3.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		panel_3.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		panel_3.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		panel_3.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		panel_3.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		panel_3.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		panel_3.add(textField_11);
		
		panel_4 = new JPanel();
		panel_4.setBounds(267, 17, 143, 144);
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(6, 0, 0, 0));
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		panel_4.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		panel_4.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		panel_4.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		panel_4.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		panel_4.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		panel_4.add(textField_32);
		
		label_10 = new JLabel("Cantidad");
		label_10.setBounds(210, 1, 55, 14);
		panel.add(label_10);
		
		label_11 = new JLabel("Observaci\u00F3n/Referencia");
		label_11.setBounds(267, 1, 143, 14);
		panel.add(label_11);
		
		panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(434, 11, 414, 190);
		pnlPestaña1.add(panel_5);
		
		panel_6 = new JPanel();
		panel_6.setBounds(3, 17, 199, 169);
		panel_5.add(panel_6);
		panel_6.setLayout(new GridLayout(7, 0, 0, 0));
		
		label_6 = new JLabel("Tablero El\u00E9ctrico Tipo A");
		panel_6.add(label_6);
		
		label_7 = new JLabel("Tablero El\u00E9ctrico Tipo B");
		panel_6.add(label_7);
		
		label_8 = new JLabel("Tablero El\u00E9ctrico Tipo C");
		panel_6.add(label_8);
		
		label_12 = new JLabel("Tablero El\u00E9ctrico Tipo D");
		panel_6.add(label_12);
		
		label_13 = new JLabel("Tablero El\u00E9ctrico Tipo E");
		panel_6.add(label_13);
		
		label_14 = new JLabel("Tablero El\u00E9ctrico Tipo F");
		panel_6.add(label_14);
		
		label_15 = new JLabel("Kit Cableado El\u00E9ctrico TE");
		panel_6.add(label_15);
		
		label_18 = new JLabel("KIT DE TABLEROS EL\u00C9CTRICOS");
		label_18.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_18.setBounds(3, 1, 176, 14);
		panel_5.add(label_18);
		
		panel_7 = new JPanel();
		panel_7.setBounds(210, 17, 55, 169);
		panel_5.add(panel_7);
		panel_7.setLayout(new GridLayout(7, 2, 0, 0));
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		panel_7.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		panel_7.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		panel_7.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		panel_7.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		panel_7.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		panel_7.add(textField_17);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		panel_7.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		panel_7.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		panel_7.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		panel_7.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		panel_7.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		panel_7.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		panel_7.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		panel_7.add(textField_40);
		
		panel_8 = new JPanel();
		panel_8.setBounds(267, 17, 143, 169);
		panel_5.add(panel_8);
		panel_8.setLayout(new GridLayout(7, 0, 0, 0));
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		panel_8.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		panel_8.add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		panel_8.add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		panel_8.add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		panel_8.add(textField_49);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		panel_8.add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		panel_8.add(textField_51);
		
		label_19 = new JLabel("Cantidad");
		label_19.setBounds(210, 1, 55, 14);
		panel_5.add(label_19);
		
		label_20 = new JLabel("Observaci\u00F3n/Referencia");
		label_20.setBounds(267, 1, 143, 14);
		panel_5.add(label_20);
		
		panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_9.setBounds(858, 11, 414, 141);
		pnlPestaña1.add(panel_9);
		
		panel_10 = new JPanel();
		panel_10.setBounds(3, 17, 199, 120);
		panel_9.add(panel_10);
		panel_10.setLayout(new GridLayout(5, 0, 0, 0));
		
		label_21 = new JLabel("Tablero El\u00E9ctrico Tipo A");
		panel_10.add(label_21);
		
		label_22 = new JLabel("Tablero El\u00E9ctrico Tipo B");
		panel_10.add(label_22);
		
		label_23 = new JLabel("Tablero El\u00E9ctrico Tipo C");
		panel_10.add(label_23);
		
		label_24 = new JLabel("Tablero El\u00E9ctrico Tipo D");
		panel_10.add(label_24);
		
		label_25 = new JLabel("Tablero El\u00E9ctrico Tipo E");
		panel_10.add(label_25);
		
		label_27 = new JLabel("KIT DE TABLEROS EL\u00C9CTRICOS");
		label_27.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_27.setBounds(3, 1, 176, 14);
		panel_9.add(label_27);
		
		panel_11 = new JPanel();
		panel_11.setBounds(210, 17, 55, 120);
		panel_9.add(panel_11);
		panel_11.setLayout(new GridLayout(5, 2, 0, 0));
		
		textField_54 = new JTextField();
		textField_54.setColumns(10);
		panel_11.add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setColumns(10);
		panel_11.add(textField_55);
		
		textField_56 = new JTextField();
		textField_56.setColumns(10);
		panel_11.add(textField_56);
		
		textField_57 = new JTextField();
		textField_57.setColumns(10);
		panel_11.add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setColumns(10);
		panel_11.add(textField_58);
		
		textField_59 = new JTextField();
		textField_59.setColumns(10);
		panel_11.add(textField_59);
		
		textField_60 = new JTextField();
		textField_60.setColumns(10);
		panel_11.add(textField_60);
		
		textField_61 = new JTextField();
		textField_61.setColumns(10);
		panel_11.add(textField_61);
		
		textField_62 = new JTextField();
		textField_62.setColumns(10);
		panel_11.add(textField_62);
		
		textField_63 = new JTextField();
		textField_63.setColumns(10);
		panel_11.add(textField_63);
		
		panel_12 = new JPanel();
		panel_12.setBounds(267, 17, 143, 120);
		panel_9.add(panel_12);
		panel_12.setLayout(new GridLayout(5, 0, 0, 0));
		
		textField_66 = new JTextField();
		textField_66.setColumns(10);
		panel_12.add(textField_66);
		
		textField_67 = new JTextField();
		textField_67.setColumns(10);
		panel_12.add(textField_67);
		
		textField_68 = new JTextField();
		textField_68.setColumns(10);
		panel_12.add(textField_68);
		
		textField_69 = new JTextField();
		textField_69.setColumns(10);
		panel_12.add(textField_69);
		
		textField_70 = new JTextField();
		textField_70.setColumns(10);
		panel_12.add(textField_70);
		
		label_28 = new JLabel("Cantidad");
		label_28.setBounds(210, 1, 55, 14);
		panel_9.add(label_28);
		
		label_29 = new JLabel("Observaci\u00F3n/Referencia");
		label_29.setBounds(267, 1, 143, 14);
		panel_9.add(label_29);
		
		panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_13.setBounds(434, 212, 414, 95);
		pnlPestaña1.add(panel_13);
		
		panel_14 = new JPanel();
		panel_14.setBounds(3, 17, 199, 73);
		panel_13.add(panel_14);
		panel_14.setLayout(new GridLayout(3, 0, 0, 0));
		
		label_16 = new JLabel("Tablero El\u00E9ctrico Tipo A");
		panel_14.add(label_16);
		
		label_17 = new JLabel("Tablero El\u00E9ctrico Tipo B");
		panel_14.add(label_17);
		
		label_26 = new JLabel("Tablero El\u00E9ctrico Tipo C");
		panel_14.add(label_26);
		
		label_32 = new JLabel("KIT DE TABLEROS EL\u00C9CTRICOS");
		label_32.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_32.setBounds(3, 1, 176, 14);
		panel_13.add(label_32);
		
		panel_15 = new JPanel();
		panel_15.setBounds(210, 17, 55, 73);
		panel_13.add(panel_15);
		panel_15.setLayout(new GridLayout(3, 2, 0, 0));
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		panel_15.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		panel_15.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		panel_15.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		panel_15.add(textField_44);
		
		textField_52 = new JTextField();
		textField_52.setColumns(10);
		panel_15.add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setColumns(10);
		panel_15.add(textField_53);
		
		panel_16 = new JPanel();
		panel_16.setBounds(267, 17, 143, 73);
		panel_13.add(panel_16);
		panel_16.setLayout(new GridLayout(3, 0, 0, 0));
		
		textField_73 = new JTextField();
		textField_73.setColumns(10);
		panel_16.add(textField_73);
		
		textField_74 = new JTextField();
		textField_74.setColumns(10);
		panel_16.add(textField_74);
		
		textField_75 = new JTextField();
		textField_75.setColumns(10);
		panel_16.add(textField_75);
		
		label_33 = new JLabel("Cantidad");
		label_33.setBounds(210, 1, 55, 14);
		panel_13.add(label_33);
		
		label_34 = new JLabel("Observaci\u00F3n/Referencia");
		label_34.setBounds(267, 1, 143, 14);
		panel_13.add(label_34);
		
		panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_17.setBounds(858, 154, 414, 47);
		pnlPestaña1.add(panel_17);
		
		panel_18 = new JPanel();
		panel_18.setBounds(3, 17, 199, 25);
		panel_17.add(panel_18);
		panel_18.setLayout(new GridLayout(1, 0, 0, 0));
		
		label_30 = new JLabel("Tablero El\u00E9ctrico Tipo A");
		panel_18.add(label_30);
		
		label_36 = new JLabel("KIT DE TABLEROS EL\u00C9CTRICOS");
		label_36.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_36.setBounds(3, 1, 176, 14);
		panel_17.add(label_36);
		
		panel_19 = new JPanel();
		panel_19.setBounds(210, 17, 55, 25);
		panel_17.add(panel_19);
		panel_19.setLayout(new GridLayout(1, 1, 0, 0));
		
		textField_64 = new JTextField();
		textField_64.setColumns(10);
		panel_19.add(textField_64);
		
		textField_65 = new JTextField();
		textField_65.setColumns(10);
		panel_19.add(textField_65);
		
		panel_20 = new JPanel();
		panel_20.setBounds(267, 17, 143, 25);
		panel_17.add(panel_20);
		panel_20.setLayout(new GridLayout(1, 0, 0, 0));
		
		textField_78 = new JTextField();
		textField_78.setColumns(10);
		panel_20.add(textField_78);
		
		label_37 = new JLabel("Cantidad");
		label_37.setBounds(210, 1, 55, 14);
		panel_17.add(label_37);
		
		label_38 = new JLabel("Observaci\u00F3n/Referencia");
		label_38.setBounds(267, 1, 143, 14);
		panel_17.add(label_38);
		
		panel_21 = new JPanel();
		panel_21.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n Obligatoria", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		panel_21.setBounds(458, 313, 791, 141);
		pnlPestaña1.add(panel_21);
		panel_21.setLayout(null);
		
		panel_23 = new JPanel();
		panel_23.setBounds(561, 11, 220, 97);
		panel_21.add(panel_23);
		panel_23.setLayout(new GridLayout(4, 0, 0, 0));
		
		textField_77 = new JTextField();
		textField_77.setColumns(10);
		panel_23.add(textField_77);
		
		textField_79 = new JTextField();
		textField_79.setColumns(10);
		panel_23.add(textField_79);
		
		textField_80 = new JTextField();
		textField_80.setColumns(10);
		panel_23.add(textField_80);
		
		textField_82 = new JTextField();
		textField_82.setColumns(10);
		panel_23.add(textField_82);
		
		panel_22 = new JPanel();
		panel_22.setBounds(145, 22, 220, 73);
		panel_21.add(panel_22);
		panel_22.setLayout(new GridLayout(3, 0, 0, 0));
		
		textField_71 = new JTextField();
		textField_71.setColumns(10);
		panel_22.add(textField_71);
		
		textField_72 = new JTextField();
		textField_72.setColumns(10);
		panel_22.add(textField_72);
		
		textField_76 = new JTextField();
		textField_76.setColumns(10);
		panel_22.add(textField_76);
		
		panel_24 = new JPanel();
		panel_24.setBounds(10, 22, 132, 73);
		panel_21.add(panel_24);
		panel_24.setLayout(new GridLayout(3, 0, 0, 0));
		
		label_31 = new JLabel("Tablero El\u00E9ctrico Tipo A");
		panel_24.add(label_31);
		
		label_35 = new JLabel("Tablero El\u00E9ctrico Tipo B");
		panel_24.add(label_35);
		
		label_39 = new JLabel("Tablero El\u00E9ctrico Tipo C");
		panel_24.add(label_39);
		
		panel_25 = new JPanel();
		panel_25.setBounds(425, 11, 132, 97);
		panel_21.add(panel_25);
		panel_25.setLayout(new GridLayout(4, 0, 0, 0));
		
		label_40 = new JLabel("Tablero El\u00E9ctrico Tipo A");
		panel_25.add(label_40);
		
		label_41 = new JLabel("Tablero El\u00E9ctrico Tipo B");
		panel_25.add(label_41);
		
		label_42 = new JLabel("Tablero El\u00E9ctrico Tipo C");
		panel_25.add(label_42);
		
		label_43 = new JLabel("Tablero El\u00E9ctrico Tipo D");
		panel_25.add(label_43);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(276, 106, 89, 23);
		panel_21.add(btnNewButton);
	}
}
