package com.capa.presentacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.capa.util.Utilitarios;

public class Hs1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2991536081432510517L;
	private JPanel contentPane;
	private JTextField txtAmie;
	private JTextField txtCircuito;
	private JTextField txtFechaEntrega;
	private JTextField txtFechaInicioTrabajo;
	private JTextField txtSector;
	private JTextField txtProyecto;
	private JTextField txtParroquia;
	private JTextField txtCACantidad00;
	private JTextField txtCACantidad01;
	private JTextField txtCACantidad10;
	private JTextField txtCACantidad11;
	private JTextField txtCACantidad20;
	private JTextField txtCACantidad21;
	private JTextField txtCACantidad30;
	private JTextField txtCACantidad31;
	private JTextField txtCACantidad40;
	private JTextField txtCACantidad41;
	private JTextField txtCACantidad50;
	private JTextField txtCACantidad51;
	private JTextField txtCACantidad60;
	private JTextField txtCACantidad61;
	private JTextField txtCACantidad70;
	private JTextField txtCACantidad71;
	private JTextField txtCACantidad80;
	private JTextField txtCACantidad81;
	private JTextField txtCAObsRef1;
	private JTextField txtCAObsRef0;
	private JTextField txtCAObsRef2;
	private JTextField txtCAObsRef3;
	private JTextField txtCAObsRef4;
	private JTextField txtCAObsRef5;
	private JTextField txtCAObsRef6;
	private JTextField txtCAObsRef7;
	private JTextField txtCAObsRef8;
	private JLabel lblCACantidad;
	private JLabel lblCAObsRef;
	private JPanel pnlKAR1;
	private JPanel pnlEDEtiquetas;
	private JLabel lblKAR1TuberiaPVC75_3;
	private JLabel lblKAR1TuberiaPVC75_2;
	private JLabel lblKAR1TuberiaPVC110_3;
	private JLabel lblKitAguaRes1;
	private JPanel pnlEDCantidad;
	private JTextField txtKAR1Cantidad00;
	private JTextField txtKAR1Cantidad01;
	private JTextField txtKAR1Cantidad10;
	private JTextField txtKAR1Cantidad11;
	private JTextField txtKAR1Cantidad20;
	private JTextField txtKAR1Cantidad21;
	private JPanel pnlEDObsRef;
	private JTextField txtKAR1ObsRef0;
	private JTextField txtKAR1ObsRef1;
	private JTextField txtKAR1ObsRef2;
	private JLabel lblKAR1Cantidad;
	private JLabel lblKAR1ObsRef;
	private JPanel pnlKAP2;
	private JPanel pnlTEtiquetas;
	private JLabel lblKAP2TomaRiego;
	private JLabel lblKAP2KitConexion05;
	private JLabel lblKAP2KitConexion1;
	private JLabel lblKAP2KitConexion34;
	private JLabel lblKitAguaPot2;
	private JPanel pnlTCantidad;
	private JTextField txtKAP2Cantidad10;
	private JTextField txtKAP2Cantidad11;
	private JTextField txtKAP2Cantidad20;
	private JTextField txtKAP2Cantidad21;
	private JTextField txtKAP2Cantidad30;
	private JTextField txtKAP2Cantidad31;
	private JTextField txtKAP2Cantidad40;
	private JTextField txtKAP2Cantidad41;
	private JTextField txtKAP2Cantidad50;
	private JTextField txtKAP2Cantidad51;
	private JPanel pnlTObsRef;
	private JTextField txtKAP2ObsRef1;
	private JTextField txtKAP2ObsRef2;
	private JTextField txtKAP2ObsRef3;
	private JTextField txtKAP2ObsRef4;
	private JTextField txtKAP2ObsRef5;
	private JLabel lblKAP2Cantidad;
	private JLabel lblKAP2ObsRef;
	private JPanel pnlKH;
	private JPanel pnlBAEtiquetas;
	private JLabel lblKHBomba3hp;
	private JLabel lblKHSetAccesorios;
	private JLabel lblKHTanque55gl;
	private JLabel lblKitHidroneumatico;
	private JPanel pnlBACantidad;
	private JTextField txtKHCantidad00;
	private JTextField txtKHCantidad01;
	private JTextField txtKHCantidad10;
	private JTextField txtKHCantidad11;
	private JTextField txtKHCantidad20;
	private JTextField txtKHCantidad21;
	private JPanel pnlBAObsRef;
	private JTextField txtKHObsRef0;
	private JTextField txtKHObsRef1;
	private JTextField txtKHObsRef2;
	private JLabel lblKHCantidad;
	private JLabel lblKAHObsRef;
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
	private JTextField txtCAObsRef9;
	private JTextField txtCACantidad90;
	private JTextField txtCACantidad91;
	private JLabel lblElementosRevision90x90;
	private JPanel panel;
	private JLabel lblCAKitConexionTuberia200;
	private JLabel lblCAKitConexionTuberia74;
	private JLabel lblCAKitConexionTuberia110;
	private JLabel lblCAKitConexionTuberia400;
	private JTextField txtCAObsRef10;
	private JTextField txtCAObsRef11;
	private JTextField txtCAObsRef12;
	private JTextField txtCAObsRef13;
	private JPanel panel_2;
	private JTextField txtCACantidad100;
	private JTextField txtCACantidad101;
	private JTextField txtCACantidad110;
	private JTextField txtCACantidad111;
	private JTextField txtCACantidad120;
	private JTextField txtCACantidad121;
	private JTextField txtCACantidad130;
	private JTextField txtCACantidad131;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel pnlKAP1;
	private JPanel panel_7;
	private JLabel lblKAP1TuberiaPVC05_3;
	private JLabel lblKAP1TuberiaPVC34_3;
	private JLabel lblKAP1TuberiaPVC1_3;
	private JLabel lblKAP1TuberiaPVC1_05_3;
	private JLabel lblKAP1CajasConexion60x60;
	private JLabel lblKitAguaPot1;
	private JPanel panel_8;
	private JTextField txtKAP1Cantidad00;
	private JTextField txtKAP1Cantidad01;
	private JTextField txtKAP1Cantidad10;
	private JTextField txtKAP1Cantidad11;
	private JTextField txtKAP1Cantidad20;
	private JTextField txtKAP1Cantidad21;
	private JTextField txtKAP1Cantidad30;
	private JTextField txtKAP1Cantidad31;
	private JTextField txtKAP1Cantidad40;
	private JTextField txtKAP1Cantidad41;
	private JPanel panel_9;
	private JTextField txtKAP1ObsRef0;
	private JTextField txtKAP1ObsRef1;
	private JTextField txtKAP1ObsRef2;
	private JTextField txtKAP1ObsRef3;
	private JTextField txtKAP1ObsRef4;
	private JLabel lblKAP1Cantidad;
	private JLabel lblKAP1ObsRef;
	private JPanel pnlKAR2;
	private JLabel lblKitAguaRes2;
	private JLabel lblKAR2Cantidad;
	private JLabel lblKAR2ObsRef;
	private JPanel panel_11;
	private JPanel panel_12;
	private JTextField txtKAR2Cantidad00;
	private JTextField txtKAR2Cantidad01;
	private JTextField txtKAR2Cantidad10;
	private JTextField txtKAR2Cantidad11;
	private JTextField txtKAR2Cantidad20;
	private JTextField txtKAR2Cantidad21;
	private JTextField txtKAR2Cantidad30;
	private JTextField txtKAR2Cantidad31;
	private JTextField txtKAR2Cantidad40;
	private JTextField txtKAR2Cantidad41;
	private JTextField txtKAR2Cantidad50;
	private JTextField txtKAR2Cantidad51;
	private JTextField txtKAR2Cantidad60;
	private JTextField txtKAR2Cantidad61;
	private JPanel panel_13;
	private JTextField txtKAR2Cantidad70;
	private JTextField txtKAR2Cantidad71;
	private JTextField txtKAR2Cantidad80;
	private JTextField txtKAR2Cantidad81;
	private JTextField txtKAR2Cantidad90;
	private JTextField txtKAR2Cantidad91;
	private JTextField txtKAR2Cantidad100;
	private JTextField txtKAR2Cantidad101;
	private JPanel panel_14;
	private JPanel panel_15;
	private JTextField txtKAR2ObsRef0;
	private JTextField txtKAR2ObsRef1;
	private JTextField txtKAR2ObsRef2;
	private JTextField txtKAR2ObsRef3;
	private JTextField txtKAR2ObsRef4;
	private JTextField txtKAR2ObsRef5;
	private JTextField txtKAR2ObsRef6;
	private JPanel panel_16;
	private JTextField txtKAR2ObsRef7;
	private JTextField txtKAR2ObsRef8;
	private JTextField txtKAR2ObsRef9;
	private JTextField txtKAR2ObsRef10;
	private JPanel panel_17;
	private JPanel panel_18;
	private JLabel lblKAR2TuberiaPVC110_2;
	private JLabel lblKAR2TuberiaPVC160_3;
	private JLabel lblKAR2TuberiaPVC160_2;
	private JLabel lblKAR2TuberiaPVC200_3;
	private JLabel lblKAR2TuberiaPVC200_2;
	private JLabel lblCajaConexion60x60;
	private JLabel lblPozoInspeccion;
	private JPanel panel_19;
	private JLabel lblKAR2KitConexion200;
	private JLabel lblKAR2KitConexion75;
	private JLabel lblKAR2KitConexion110;
	private JLabel lblKAR2KitConexion160;
	private JLabel lblKAP2KitConexion1_05;
	private JPanel panel_20;
	private JPanel panel_21;
	private JPanel panel_22;
	private JPanel panel_23;
	private JTextField txtKAP2Cantidad00;
	private JTextField txtKAP2Cantidad01;
	private JTextField txtKAP2ObsRef0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hs1 frame = new Hs1();
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
	public Hs1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1318, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel pnlSuperior = new JPanel();
		pnlSuperior.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlSuperior.setBounds(127, 4, 1052, 103);
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
		tabbedPane.setBounds(10, 110, 1286, 586);
		contentPane.add(tabbedPane);

		JPanel pnlPestaña1 = new JPanel();
		tabbedPane.addTab("1.-HS-KIT HIDROSANITARIO", null, pnlPestaña1, null);
		pnlPestaña1.setLayout(null);

		JPanel pnlCA = new JPanel();
		pnlCA.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlCA.setBounds(10, 4, 414, 461);
		pnlPestaña1.add(pnlCA);
		pnlCA.setLayout(null);

		JLabel lblComponenteArq = new JLabel("COMPONENTE ARQUITECT\u00D3NICO");
		lblComponenteArq.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComponenteArq.setBounds(3, 1, 176, 14);
		pnlCA.add(lblComponenteArq);

		lblCACantidad = new JLabel("Cantidad");
		lblCACantidad.setBounds(210, 1, 55, 14);
		pnlCA.add(lblCACantidad);

		lblCAObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblCAObsRef.setBounds(267, 1, 143, 14);
		pnlCA.add(lblCAObsRef);

		panel_3 = new JPanel();
		panel_3.setBounds(210, 17, 56, 442);
		pnlCA.add(panel_3);
		panel_3.setLayout(null);

		JPanel pnlTECantidad = new JPanel();
		pnlTECantidad.setBounds(0, 0, 55, 206);
		panel_3.add(pnlTECantidad);
		pnlTECantidad.setLayout(new GridLayout(10, 2, 0, 0));

		txtCACantidad00 = new JTextField();
		pnlTECantidad.add(txtCACantidad00);
		txtCACantidad00.setColumns(10);

		txtCACantidad01 = new JTextField();
		txtCACantidad01.setColumns(10);
		pnlTECantidad.add(txtCACantidad01);

		txtCACantidad10 = new JTextField();
		txtCACantidad10.setColumns(10);
		pnlTECantidad.add(txtCACantidad10);

		txtCACantidad11 = new JTextField();
		txtCACantidad11.setColumns(10);
		pnlTECantidad.add(txtCACantidad11);

		txtCACantidad20 = new JTextField();
		txtCACantidad20.setColumns(10);
		pnlTECantidad.add(txtCACantidad20);

		txtCACantidad21 = new JTextField();
		txtCACantidad21.setColumns(10);
		pnlTECantidad.add(txtCACantidad21);

		txtCACantidad30 = new JTextField();
		txtCACantidad30.setColumns(10);
		pnlTECantidad.add(txtCACantidad30);

		txtCACantidad31 = new JTextField();
		txtCACantidad31.setColumns(10);
		pnlTECantidad.add(txtCACantidad31);

		txtCACantidad40 = new JTextField();
		txtCACantidad40.setColumns(10);
		pnlTECantidad.add(txtCACantidad40);

		txtCACantidad41 = new JTextField();
		txtCACantidad41.setColumns(10);
		pnlTECantidad.add(txtCACantidad41);

		txtCACantidad50 = new JTextField();
		txtCACantidad50.setColumns(10);
		pnlTECantidad.add(txtCACantidad50);

		txtCACantidad51 = new JTextField();
		txtCACantidad51.setColumns(10);
		pnlTECantidad.add(txtCACantidad51);

		txtCACantidad60 = new JTextField();
		txtCACantidad60.setColumns(10);
		pnlTECantidad.add(txtCACantidad60);

		txtCACantidad61 = new JTextField();
		txtCACantidad61.setColumns(10);
		pnlTECantidad.add(txtCACantidad61);

		txtCACantidad70 = new JTextField();
		txtCACantidad70.setColumns(10);
		pnlTECantidad.add(txtCACantidad70);

		txtCACantidad71 = new JTextField();
		txtCACantidad71.setColumns(10);
		pnlTECantidad.add(txtCACantidad71);

		txtCACantidad80 = new JTextField();
		txtCACantidad80.setColumns(10);
		pnlTECantidad.add(txtCACantidad80);

		txtCACantidad81 = new JTextField();
		txtCACantidad81.setColumns(10);
		pnlTECantidad.add(txtCACantidad81);

		txtCACantidad90 = new JTextField();
		txtCACantidad90.setColumns(10);
		pnlTECantidad.add(txtCACantidad90);

		txtCACantidad91 = new JTextField();
		txtCACantidad91.setColumns(10);
		pnlTECantidad.add(txtCACantidad91);

		panel_2 = new JPanel();
		panel_2.setBounds(0, 217, 55, 205);
		panel_3.add(panel_2);
		panel_2.setLayout(new GridLayout(4, 2, 0, 41));

		txtCACantidad100 = new JTextField();
		txtCACantidad100.setColumns(10);
		panel_2.add(txtCACantidad100);

		txtCACantidad101 = new JTextField();
		txtCACantidad101.setColumns(10);
		panel_2.add(txtCACantidad101);

		txtCACantidad110 = new JTextField();
		txtCACantidad110.setColumns(10);
		panel_2.add(txtCACantidad110);

		txtCACantidad111 = new JTextField();
		txtCACantidad111.setColumns(10);
		panel_2.add(txtCACantidad111);

		txtCACantidad120 = new JTextField();
		txtCACantidad120.setColumns(10);
		panel_2.add(txtCACantidad120);

		txtCACantidad121 = new JTextField();
		txtCACantidad121.setColumns(10);
		panel_2.add(txtCACantidad121);

		txtCACantidad130 = new JTextField();
		txtCACantidad130.setColumns(10);
		panel_2.add(txtCACantidad130);

		txtCACantidad131 = new JTextField();
		txtCACantidad131.setColumns(10);
		panel_2.add(txtCACantidad131);

		panel_4 = new JPanel();
		panel_4.setBounds(267, 17, 143, 442);
		pnlCA.add(panel_4);
		panel_4.setLayout(null);

		JPanel pnlTEObsRef = new JPanel();
		pnlTEObsRef.setBounds(0, 0, 143, 206);
		panel_4.add(pnlTEObsRef);
		pnlTEObsRef.setLayout(new GridLayout(10, 0, 0, 0));

		txtCAObsRef0 = new JTextField();
		pnlTEObsRef.add(txtCAObsRef0);
		txtCAObsRef0.setColumns(10);

		txtCAObsRef1 = new JTextField();
		pnlTEObsRef.add(txtCAObsRef1);
		txtCAObsRef1.setColumns(10);

		txtCAObsRef2 = new JTextField();
		txtCAObsRef2.setColumns(10);
		pnlTEObsRef.add(txtCAObsRef2);

		txtCAObsRef3 = new JTextField();
		txtCAObsRef3.setColumns(10);
		pnlTEObsRef.add(txtCAObsRef3);

		txtCAObsRef4 = new JTextField();
		txtCAObsRef4.setColumns(10);
		pnlTEObsRef.add(txtCAObsRef4);

		txtCAObsRef5 = new JTextField();
		txtCAObsRef5.setColumns(10);
		pnlTEObsRef.add(txtCAObsRef5);

		txtCAObsRef6 = new JTextField();
		txtCAObsRef6.setColumns(10);
		pnlTEObsRef.add(txtCAObsRef6);

		txtCAObsRef7 = new JTextField();
		txtCAObsRef7.setColumns(10);
		pnlTEObsRef.add(txtCAObsRef7);

		txtCAObsRef8 = new JTextField();
		txtCAObsRef8.setColumns(10);
		pnlTEObsRef.add(txtCAObsRef8);

		txtCAObsRef9 = new JTextField();
		txtCAObsRef9.setColumns(10);
		pnlTEObsRef.add(txtCAObsRef9);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 217, 143, 205);
		panel_4.add(panel_1);
		panel_1.setLayout(new GridLayout(4, 0, 0, 41));

		txtCAObsRef10 = new JTextField();
		txtCAObsRef10.setColumns(10);
		panel_1.add(txtCAObsRef10);

		txtCAObsRef11 = new JTextField();
		txtCAObsRef11.setColumns(10);
		panel_1.add(txtCAObsRef11);

		txtCAObsRef12 = new JTextField();
		txtCAObsRef12.setColumns(10);
		panel_1.add(txtCAObsRef12);

		txtCAObsRef13 = new JTextField();
		txtCAObsRef13.setColumns(10);
		panel_1.add(txtCAObsRef13);

		panel_5 = new JPanel();
		panel_5.setBounds(3, 17, 199, 442);
		pnlCA.add(panel_5);
		panel_5.setLayout(null);

		JPanel pnlTEEtiquetas = new JPanel();
		pnlTEEtiquetas.setBounds(0, 0, 199, 206);
		panel_5.add(pnlTEEtiquetas);
		pnlTEEtiquetas.setLayout(new GridLayout(10, 0, 0, 0));

		JLabel lblCanalAguasLH = new JLabel("Canal de Aguas de Lluvia de Hormig\u00F3n ");
		lblCanalAguasLH.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlTEEtiquetas.add(lblCanalAguasLH);

		JLabel lblCATuberiaPVC75_3 = new JLabel("Tuber\u00EDa de PVC  75mm y L=3m");
		lblCATuberiaPVC75_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlTEEtiquetas.add(lblCATuberiaPVC75_3);

		JLabel lblCATuberiaPVC110_3 = new JLabel("Tuber\u00EDa de PVC  110mm y L=3m");
		lblCATuberiaPVC110_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlTEEtiquetas.add(lblCATuberiaPVC110_3);

		JLabel lblCATuberiaPVC110_2_1 = new JLabel("Tuber\u00EDa de PVC  110mm y L=2.1m");
		lblCATuberiaPVC110_2_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlTEEtiquetas.add(lblCATuberiaPVC110_2_1);

		JLabel lblCATuberiaPVC200_3 = new JLabel("Tuber\u00EDa de PVC  200mm y L=3m");
		lblCATuberiaPVC200_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlTEEtiquetas.add(lblCATuberiaPVC200_3);

		JLabel lblCATuberiaPVC400_3 = new JLabel("Tuber\u00EDa de PVC  400mm y L=3m");
		lblCATuberiaPVC400_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlTEEtiquetas.add(lblCATuberiaPVC400_3);

		JLabel lblCATuberiaPVC400_1 = new JLabel("Tuber\u00EDa de PVC  400mm y L=1m");
		lblCATuberiaPVC400_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlTEEtiquetas.add(lblCATuberiaPVC400_1);

		JLabel lblCATrampasArenas = new JLabel("Trampas de Arenas");
		lblCATrampasArenas.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlTEEtiquetas.add(lblCATrampasArenas);

		JLabel lblElementosRevision60x60 = new JLabel("Elementos de revisi\u00F3n 60x60");
		lblElementosRevision60x60.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlTEEtiquetas.add(lblElementosRevision60x60);

		lblElementosRevision90x90 = new JLabel("Elementos de revisi\u00F3n 90x90");
		lblElementosRevision90x90.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlTEEtiquetas.add(lblElementosRevision90x90);

		panel = new JPanel();
		panel.setBounds(0, 205, 199, 235);
		panel_5.add(panel);
		panel.setLayout(new GridLayout(4, 1, 0, 0));

		lblCAKitConexionTuberia200 = new JLabel("<html><body>Kit para conexión de tubería 200 mm. "
				+ "(lija  un pliego, polipega 1/4 gal, 1/4 gl suelda líquida, 2 "
				+ "uniones, cama de arena, anclajes)</body></html>");
		lblCAKitConexionTuberia200.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel.add(lblCAKitConexionTuberia200);

		lblCAKitConexionTuberia74 = new JLabel("<html><body>Kit para conexión de tubería 75 mm. (lija "
				+ "pliego, polipega 1/2gal,1/2 gl suelda líquida, 20 uniones,18codo 90°,8codo45°)</body></html>");
		lblCAKitConexionTuberia74.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel.add(lblCAKitConexionTuberia74);

		lblCAKitConexionTuberia110 = new JLabel("<html><body>Kit para conexi\u00F3n de tuber\u00EDa 110 mm. "
				+ "(lija pliego, polipega 1/2gal, 1/4 gl suelda l\u00EDquida , 2 uniones,2codo 90\u00B0,2codo 45\u00B0)</body></html>");
		lblCAKitConexionTuberia110.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel.add(lblCAKitConexionTuberia110);

		lblCAKitConexionTuberia400 = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 400 mm. (lija pliego, "
						+ "polipega 1/2gal, 1/4 gl suelda l\u00EDquida, cama de arena, anclajes )</body></html>");
		lblCAKitConexionTuberia400.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel.add(lblCAKitConexionTuberia400);

		pnlKAR1 = new JPanel();
		pnlKAR1.setLayout(null);
		pnlKAR1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlKAR1.setBounds(10, 469, 414, 85);
		pnlPestaña1.add(pnlKAR1);

		pnlEDEtiquetas = new JPanel();
		pnlEDEtiquetas.setBounds(3, 17, 199, 67);
		pnlKAR1.add(pnlEDEtiquetas);
		pnlEDEtiquetas.setLayout(new GridLayout(3, 0, 0, 0));

		lblKAR1TuberiaPVC75_3 = new JLabel("Tuber\u00EDa de PVC  75mm PVC y L=3m");
		lblKAR1TuberiaPVC75_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlEDEtiquetas.add(lblKAR1TuberiaPVC75_3);

		lblKAR1TuberiaPVC75_2 = new JLabel("Tuber\u00EDa de PVC  75mm PVC y L=2m");
		lblKAR1TuberiaPVC75_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlEDEtiquetas.add(lblKAR1TuberiaPVC75_2);

		lblKAR1TuberiaPVC110_3 = new JLabel("Tuber\u00EDa de PVC  110mm PVC y L=3m");
		lblKAR1TuberiaPVC110_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlEDEtiquetas.add(lblKAR1TuberiaPVC110_3);

		lblKitAguaRes1 = new JLabel("KIT AGUA RESIDUAL");
		lblKitAguaRes1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKitAguaRes1.setBounds(3, 1, 211, 14);
		pnlKAR1.add(lblKitAguaRes1);

		pnlEDCantidad = new JPanel();
		pnlEDCantidad.setBounds(210, 17, 55, 67);
		pnlKAR1.add(pnlEDCantidad);
		pnlEDCantidad.setLayout(new GridLayout(3, 2, 0, 0));

		txtKAR1Cantidad00 = new JTextField();
		txtKAR1Cantidad00.setColumns(10);
		pnlEDCantidad.add(txtKAR1Cantidad00);

		txtKAR1Cantidad01 = new JTextField();
		txtKAR1Cantidad01.setColumns(10);
		pnlEDCantidad.add(txtKAR1Cantidad01);

		txtKAR1Cantidad10 = new JTextField();
		txtKAR1Cantidad10.setColumns(10);
		pnlEDCantidad.add(txtKAR1Cantidad10);

		txtKAR1Cantidad11 = new JTextField();
		txtKAR1Cantidad11.setColumns(10);
		pnlEDCantidad.add(txtKAR1Cantidad11);

		txtKAR1Cantidad20 = new JTextField();
		txtKAR1Cantidad20.setColumns(10);
		pnlEDCantidad.add(txtKAR1Cantidad20);

		txtKAR1Cantidad21 = new JTextField();
		txtKAR1Cantidad21.setColumns(10);
		pnlEDCantidad.add(txtKAR1Cantidad21);

		pnlEDObsRef = new JPanel();
		pnlEDObsRef.setBounds(267, 17, 143, 67);
		pnlKAR1.add(pnlEDObsRef);
		pnlEDObsRef.setLayout(new GridLayout(3, 0, 0, 0));

		txtKAR1ObsRef0 = new JTextField();
		txtKAR1ObsRef0.setColumns(10);
		pnlEDObsRef.add(txtKAR1ObsRef0);

		txtKAR1ObsRef1 = new JTextField();
		txtKAR1ObsRef1.setColumns(10);
		pnlEDObsRef.add(txtKAR1ObsRef1);

		txtKAR1ObsRef2 = new JTextField();
		txtKAR1ObsRef2.setColumns(10);
		pnlEDObsRef.add(txtKAR1ObsRef2);

		lblKAR1Cantidad = new JLabel("Cantidad");
		lblKAR1Cantidad.setBounds(210, 1, 55, 14);
		pnlKAR1.add(lblKAR1Cantidad);

		lblKAR1ObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblKAR1ObsRef.setBounds(267, 1, 143, 14);
		pnlKAR1.add(lblKAR1ObsRef);

		pnlKAR2 = new JPanel();
		pnlKAR2.setLayout(null);
		pnlKAR2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlKAR2.setBounds(434, 4, 414, 413);
		pnlPestaña1.add(pnlKAR2);

		lblKitAguaRes2 = new JLabel("KIT AGUA RESIDUAL");
		lblKitAguaRes2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKitAguaRes2.setBounds(3, 1, 176, 14);
		pnlKAR2.add(lblKitAguaRes2);

		lblKAR2Cantidad = new JLabel("Cantidad");
		lblKAR2Cantidad.setBounds(210, 1, 55, 14);
		pnlKAR2.add(lblKAR2Cantidad);

		lblKAR2ObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblKAR2ObsRef.setBounds(267, 1, 143, 14);
		pnlKAR2.add(lblKAR2ObsRef);

		panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBounds(210, 17, 56, 395);
		pnlKAR2.add(panel_11);

		panel_12 = new JPanel();
		panel_12.setBounds(0, 0, 55, 176);
		panel_11.add(panel_12);
		panel_12.setLayout(new GridLayout(7, 2, 0, 2));

		txtKAR2Cantidad00 = new JTextField();
		txtKAR2Cantidad00.setColumns(10);
		panel_12.add(txtKAR2Cantidad00);

		txtKAR2Cantidad01 = new JTextField();
		txtKAR2Cantidad01.setColumns(10);
		panel_12.add(txtKAR2Cantidad01);

		txtKAR2Cantidad10 = new JTextField();
		txtKAR2Cantidad10.setColumns(10);
		panel_12.add(txtKAR2Cantidad10);

		txtKAR2Cantidad11 = new JTextField();
		txtKAR2Cantidad11.setColumns(10);
		panel_12.add(txtKAR2Cantidad11);

		txtKAR2Cantidad20 = new JTextField();
		txtKAR2Cantidad20.setColumns(10);
		panel_12.add(txtKAR2Cantidad20);

		txtKAR2Cantidad21 = new JTextField();
		txtKAR2Cantidad21.setColumns(10);
		panel_12.add(txtKAR2Cantidad21);

		txtKAR2Cantidad30 = new JTextField();
		txtKAR2Cantidad30.setColumns(10);
		panel_12.add(txtKAR2Cantidad30);

		txtKAR2Cantidad31 = new JTextField();
		txtKAR2Cantidad31.setColumns(10);
		panel_12.add(txtKAR2Cantidad31);

		txtKAR2Cantidad40 = new JTextField();
		txtKAR2Cantidad40.setColumns(10);
		panel_12.add(txtKAR2Cantidad40);

		txtKAR2Cantidad41 = new JTextField();
		txtKAR2Cantidad41.setColumns(10);
		panel_12.add(txtKAR2Cantidad41);

		txtKAR2Cantidad50 = new JTextField();
		txtKAR2Cantidad50.setColumns(10);
		panel_12.add(txtKAR2Cantidad50);

		txtKAR2Cantidad51 = new JTextField();
		txtKAR2Cantidad51.setColumns(10);
		panel_12.add(txtKAR2Cantidad51);

		txtKAR2Cantidad60 = new JTextField();
		txtKAR2Cantidad60.setColumns(10);
		panel_12.add(txtKAR2Cantidad60);

		txtKAR2Cantidad61 = new JTextField();
		txtKAR2Cantidad61.setColumns(10);
		panel_12.add(txtKAR2Cantidad61);

		panel_13 = new JPanel();
		panel_13.setBounds(0, 184, 55, 191);
		panel_11.add(panel_13);
		panel_13.setLayout(new GridLayout(4, 2, 0, 32));

		txtKAR2Cantidad70 = new JTextField();
		txtKAR2Cantidad70.setColumns(10);
		panel_13.add(txtKAR2Cantidad70);

		txtKAR2Cantidad71 = new JTextField();
		txtKAR2Cantidad71.setColumns(10);
		panel_13.add(txtKAR2Cantidad71);

		txtKAR2Cantidad80 = new JTextField();
		txtKAR2Cantidad80.setColumns(10);
		panel_13.add(txtKAR2Cantidad80);

		txtKAR2Cantidad81 = new JTextField();
		txtKAR2Cantidad81.setColumns(10);
		panel_13.add(txtKAR2Cantidad81);

		txtKAR2Cantidad90 = new JTextField();
		txtKAR2Cantidad90.setColumns(10);
		panel_13.add(txtKAR2Cantidad90);

		txtKAR2Cantidad91 = new JTextField();
		txtKAR2Cantidad91.setColumns(10);
		panel_13.add(txtKAR2Cantidad91);

		txtKAR2Cantidad100 = new JTextField();
		txtKAR2Cantidad100.setColumns(10);
		panel_13.add(txtKAR2Cantidad100);

		txtKAR2Cantidad101 = new JTextField();
		txtKAR2Cantidad101.setColumns(10);
		panel_13.add(txtKAR2Cantidad101);

		panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBounds(267, 17, 143, 395);
		pnlKAR2.add(panel_14);

		panel_15 = new JPanel();
		panel_15.setBounds(0, 0, 143, 176);
		panel_14.add(panel_15);
		panel_15.setLayout(new GridLayout(7, 0, 0, 2));

		txtKAR2ObsRef0 = new JTextField();
		txtKAR2ObsRef0.setColumns(10);
		panel_15.add(txtKAR2ObsRef0);

		txtKAR2ObsRef1 = new JTextField();
		txtKAR2ObsRef1.setColumns(10);
		panel_15.add(txtKAR2ObsRef1);

		txtKAR2ObsRef2 = new JTextField();
		txtKAR2ObsRef2.setColumns(10);
		panel_15.add(txtKAR2ObsRef2);

		txtKAR2ObsRef3 = new JTextField();
		txtKAR2ObsRef3.setColumns(10);
		panel_15.add(txtKAR2ObsRef3);

		txtKAR2ObsRef4 = new JTextField();
		txtKAR2ObsRef4.setColumns(10);
		panel_15.add(txtKAR2ObsRef4);

		txtKAR2ObsRef5 = new JTextField();
		txtKAR2ObsRef5.setColumns(10);
		panel_15.add(txtKAR2ObsRef5);

		txtKAR2ObsRef6 = new JTextField();
		txtKAR2ObsRef6.setColumns(10);
		panel_15.add(txtKAR2ObsRef6);

		panel_16 = new JPanel();
		panel_16.setBounds(0, 184, 143, 191);
		panel_14.add(panel_16);
		panel_16.setLayout(new GridLayout(4, 0, 0, 32));

		txtKAR2ObsRef7 = new JTextField();
		txtKAR2ObsRef7.setColumns(10);
		panel_16.add(txtKAR2ObsRef7);

		txtKAR2ObsRef8 = new JTextField();
		txtKAR2ObsRef8.setColumns(10);
		panel_16.add(txtKAR2ObsRef8);

		txtKAR2ObsRef9 = new JTextField();
		txtKAR2ObsRef9.setColumns(10);
		panel_16.add(txtKAR2ObsRef9);

		txtKAR2ObsRef10 = new JTextField();
		txtKAR2ObsRef10.setColumns(10);
		panel_16.add(txtKAR2ObsRef10);

		panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setBounds(3, 17, 204, 395);
		pnlKAR2.add(panel_17);

		panel_18 = new JPanel();
		panel_18.setBounds(0, 0, 204, 180);
		panel_17.add(panel_18);
		panel_18.setLayout(new GridLayout(7, 0, 0, 0));

		lblKAR2TuberiaPVC110_2 = new JLabel("Tuber\u00EDa de PVC  110mm PVC y L=2m");
		lblKAR2TuberiaPVC110_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_18.add(lblKAR2TuberiaPVC110_2);

		lblKAR2TuberiaPVC160_3 = new JLabel("Tuber\u00EDa de PVC  160mm PVC y L=3m");
		lblKAR2TuberiaPVC160_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_18.add(lblKAR2TuberiaPVC160_3);

		lblKAR2TuberiaPVC160_2 = new JLabel("Tuber\u00EDa de PVC  160mm PVC y L=2m");
		lblKAR2TuberiaPVC160_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_18.add(lblKAR2TuberiaPVC160_2);

		lblKAR2TuberiaPVC200_3 = new JLabel("Tuber\u00EDa de PVC  200mm PVC y L=3m");
		lblKAR2TuberiaPVC200_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_18.add(lblKAR2TuberiaPVC200_3);

		lblKAR2TuberiaPVC200_2 = new JLabel("Tuber\u00EDa de PVC  200mm PVC y L=2m");
		lblKAR2TuberiaPVC200_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_18.add(lblKAR2TuberiaPVC200_2);

		lblCajaConexion60x60 = new JLabel(
				"<html><body>Caja de Conexi\u00F3n 60x60( tapas con cerco met\u00E1lico)</body></html>");
		lblCajaConexion60x60.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_18.add(lblCajaConexion60x60);

		lblPozoInspeccion = new JLabel("<html><body>Pozo de Inspecci\u00F3n (tapas de hierro fundido)</body></html>");
		lblPozoInspeccion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_18.add(lblPozoInspeccion);

		panel_19 = new JPanel();
		panel_19.setBounds(0, 179, 204, 215);
		panel_17.add(panel_19);
		panel_19.setLayout(new GridLayout(4, 1, 0, 0));

		lblKAR2KitConexion200 = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 200 mm. (lija  un pliego, polipega 2 gal, 2 gl suelda l\u00EDquida, 15 uniones, cama de arena, anclajes)</body></html>");
		lblKAR2KitConexion200.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_19.add(lblKAR2KitConexion200);

		lblKAR2KitConexion75 = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 75 mm. (lija pliego, polipega 1gal,1gl suelda l\u00EDquida, 6 uniones,4codo 90\u00B0,3codo45\u00B0,cama de arena, anclajes)</body></html>");
		lblKAR2KitConexion75.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_19.add(lblKAR2KitConexion75);

		lblKAR2KitConexion110 = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 110 mm. (lija pliego, polipega 1gal, 1 gl suelda l\u00EDquida , 18 uniones,6codo 90\u00B0,5codo 45\u00B0,cama de arena, anclajes)</body></html>");
		lblKAR2KitConexion110.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_19.add(lblKAR2KitConexion110);

		lblKAR2KitConexion160 = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 160 mm. (lija pliego, polipega 1/2gal, 1/4 gl suelda l\u00EDquida, cama de arena, anclajes )</body></html>");
		lblKAR2KitConexion160.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_19.add(lblKAR2KitConexion160);

		pnlKAP1 = new JPanel();
		pnlKAP1.setLayout(null);
		pnlKAP1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlKAP1.setBounds(434, 420, 414, 134);
		pnlPestaña1.add(pnlKAP1);

		panel_7 = new JPanel();
		panel_7.setBounds(3, 17, 199, 113);
		pnlKAP1.add(panel_7);
		panel_7.setLayout(new GridLayout(5, 0, 0, 0));

		lblKAP1TuberiaPVC05_3 = new JLabel("Tuber\u00EDa de PVC  1/2\" y L=3m");
		lblKAP1TuberiaPVC05_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_7.add(lblKAP1TuberiaPVC05_3);

		lblKAP1TuberiaPVC34_3 = new JLabel("Tuber\u00EDa de PVC  3/4\" y L=3m");
		lblKAP1TuberiaPVC34_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_7.add(lblKAP1TuberiaPVC34_3);

		lblKAP1TuberiaPVC1_3 = new JLabel("Tuber\u00EDa de PVC  1\" y L=3m");
		lblKAP1TuberiaPVC1_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_7.add(lblKAP1TuberiaPVC1_3);

		lblKAP1TuberiaPVC1_05_3 = new JLabel("Tuber\u00EDa de PVC  1-1/2\" y L=3m");
		lblKAP1TuberiaPVC1_05_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_7.add(lblKAP1TuberiaPVC1_05_3);

		lblKAP1CajasConexion60x60 = new JLabel(
				"<html><body>Cajas de conexi\u00F3n 60x60(tapas cerco met\u00E1lico)</body></html>");
		lblKAP1CajasConexion60x60.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_7.add(lblKAP1CajasConexion60x60);

		lblKitAguaPot1 = new JLabel("KIT AGUA POTABLE");
		lblKitAguaPot1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKitAguaPot1.setBounds(3, 1, 176, 14);
		pnlKAP1.add(lblKitAguaPot1);

		panel_8 = new JPanel();
		panel_8.setBounds(210, 17, 55, 113);
		pnlKAP1.add(panel_8);
		panel_8.setLayout(new GridLayout(5, 2, 0, 0));

		txtKAP1Cantidad00 = new JTextField();
		txtKAP1Cantidad00.setColumns(10);
		panel_8.add(txtKAP1Cantidad00);

		txtKAP1Cantidad01 = new JTextField();
		txtKAP1Cantidad01.setColumns(10);
		panel_8.add(txtKAP1Cantidad01);

		txtKAP1Cantidad10 = new JTextField();
		txtKAP1Cantidad10.setColumns(10);
		panel_8.add(txtKAP1Cantidad10);

		txtKAP1Cantidad11 = new JTextField();
		txtKAP1Cantidad11.setColumns(10);
		panel_8.add(txtKAP1Cantidad11);

		txtKAP1Cantidad20 = new JTextField();
		txtKAP1Cantidad20.setColumns(10);
		panel_8.add(txtKAP1Cantidad20);

		txtKAP1Cantidad21 = new JTextField();
		txtKAP1Cantidad21.setColumns(10);
		panel_8.add(txtKAP1Cantidad21);

		txtKAP1Cantidad30 = new JTextField();
		txtKAP1Cantidad30.setColumns(10);
		panel_8.add(txtKAP1Cantidad30);

		txtKAP1Cantidad31 = new JTextField();
		txtKAP1Cantidad31.setColumns(10);
		panel_8.add(txtKAP1Cantidad31);

		txtKAP1Cantidad40 = new JTextField();
		txtKAP1Cantidad40.setColumns(10);
		panel_8.add(txtKAP1Cantidad40);

		txtKAP1Cantidad41 = new JTextField();
		txtKAP1Cantidad41.setColumns(10);
		panel_8.add(txtKAP1Cantidad41);

		panel_9 = new JPanel();
		panel_9.setBounds(267, 17, 143, 113);
		pnlKAP1.add(panel_9);
		panel_9.setLayout(new GridLayout(5, 0, 0, 0));

		txtKAP1ObsRef0 = new JTextField();
		txtKAP1ObsRef0.setColumns(10);
		panel_9.add(txtKAP1ObsRef0);

		txtKAP1ObsRef1 = new JTextField();
		txtKAP1ObsRef1.setColumns(10);
		panel_9.add(txtKAP1ObsRef1);

		txtKAP1ObsRef2 = new JTextField();
		txtKAP1ObsRef2.setColumns(10);
		panel_9.add(txtKAP1ObsRef2);

		txtKAP1ObsRef3 = new JTextField();
		txtKAP1ObsRef3.setColumns(10);
		panel_9.add(txtKAP1ObsRef3);

		txtKAP1ObsRef4 = new JTextField();
		txtKAP1ObsRef4.setColumns(10);
		panel_9.add(txtKAP1ObsRef4);

		lblKAP1Cantidad = new JLabel("Cantidad");
		lblKAP1Cantidad.setBounds(210, 1, 55, 14);
		pnlKAP1.add(lblKAP1Cantidad);

		lblKAP1ObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblKAP1ObsRef.setBounds(267, 1, 143, 14);
		pnlKAP1.add(lblKAP1ObsRef);

		pnlKAP2 = new JPanel();
		pnlKAP2.setLayout(null);
		pnlKAP2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlKAP2.setBounds(858, 4, 414, 215);
		pnlPestaña1.add(pnlKAP2);

		lblKitAguaPot2 = new JLabel("KIT AGUA POTABLE");
		lblKitAguaPot2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKitAguaPot2.setBounds(3, 1, 176, 14);
		pnlKAP2.add(lblKitAguaPot2);

		lblKAP2Cantidad = new JLabel("Cantidad");
		lblKAP2Cantidad.setBounds(210, 1, 55, 14);
		pnlKAP2.add(lblKAP2Cantidad);

		lblKAP2ObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblKAP2ObsRef.setBounds(267, 1, 143, 14);
		pnlKAP2.add(lblKAP2ObsRef);

		panel_20 = new JPanel();
		panel_20.setBounds(210, 17, 55, 194);
		pnlKAP2.add(panel_20);
		panel_20.setLayout(null);

		pnlTCantidad = new JPanel();
		pnlTCantidad.setBounds(0, 44, 55, 150);
		panel_20.add(pnlTCantidad);
		pnlTCantidad.setLayout(new GridLayout(5, 2, 0, 1));

		txtKAP2Cantidad10 = new JTextField();
		txtKAP2Cantidad10.setColumns(10);
		pnlTCantidad.add(txtKAP2Cantidad10);

		txtKAP2Cantidad11 = new JTextField();
		txtKAP2Cantidad11.setColumns(10);
		pnlTCantidad.add(txtKAP2Cantidad11);

		txtKAP2Cantidad20 = new JTextField();
		txtKAP2Cantidad20.setColumns(10);
		pnlTCantidad.add(txtKAP2Cantidad20);

		txtKAP2Cantidad21 = new JTextField();
		txtKAP2Cantidad21.setColumns(10);
		pnlTCantidad.add(txtKAP2Cantidad21);

		txtKAP2Cantidad30 = new JTextField();
		txtKAP2Cantidad30.setColumns(10);
		pnlTCantidad.add(txtKAP2Cantidad30);

		txtKAP2Cantidad31 = new JTextField();
		txtKAP2Cantidad31.setColumns(10);
		pnlTCantidad.add(txtKAP2Cantidad31);

		txtKAP2Cantidad40 = new JTextField();
		txtKAP2Cantidad40.setColumns(10);
		pnlTCantidad.add(txtKAP2Cantidad40);

		txtKAP2Cantidad41 = new JTextField();
		txtKAP2Cantidad41.setColumns(10);
		pnlTCantidad.add(txtKAP2Cantidad41);

		txtKAP2Cantidad50 = new JTextField();
		txtKAP2Cantidad50.setColumns(10);
		pnlTCantidad.add(txtKAP2Cantidad50);

		txtKAP2Cantidad51 = new JTextField();
		txtKAP2Cantidad51.setColumns(10);
		pnlTCantidad.add(txtKAP2Cantidad51);

		panel_23 = new JPanel();
		panel_23.setBounds(0, 8, 55, 29);
		panel_20.add(panel_23);
		panel_23.setLayout(new GridLayout(1, 2, 0, 0));

		txtKAP2Cantidad00 = new JTextField();
		txtKAP2Cantidad00.setColumns(10);
		panel_23.add(txtKAP2Cantidad00);

		txtKAP2Cantidad01 = new JTextField();
		txtKAP2Cantidad01.setColumns(10);
		panel_23.add(txtKAP2Cantidad01);

		panel_21 = new JPanel();
		panel_21.setBounds(267, 17, 143, 194);
		pnlKAP2.add(panel_21);
		panel_21.setLayout(null);

		pnlTObsRef = new JPanel();
		pnlTObsRef.setBounds(0, 44, 143, 150);
		panel_21.add(pnlTObsRef);
		pnlTObsRef.setLayout(new GridLayout(5, 0, 0, 1));

		txtKAP2ObsRef1 = new JTextField();
		txtKAP2ObsRef1.setColumns(10);
		pnlTObsRef.add(txtKAP2ObsRef1);

		txtKAP2ObsRef2 = new JTextField();
		txtKAP2ObsRef2.setColumns(10);
		pnlTObsRef.add(txtKAP2ObsRef2);

		txtKAP2ObsRef3 = new JTextField();
		txtKAP2ObsRef3.setColumns(10);
		pnlTObsRef.add(txtKAP2ObsRef3);

		txtKAP2ObsRef4 = new JTextField();
		txtKAP2ObsRef4.setColumns(10);
		pnlTObsRef.add(txtKAP2ObsRef4);

		txtKAP2ObsRef5 = new JTextField();
		txtKAP2ObsRef5.setColumns(10);
		pnlTObsRef.add(txtKAP2ObsRef5);

		txtKAP2ObsRef0 = new JTextField();
		txtKAP2ObsRef0.setBounds(0, 8, 143, 29);
		panel_21.add(txtKAP2ObsRef0);
		txtKAP2ObsRef0.setColumns(10);

		panel_22 = new JPanel();
		panel_22.setBounds(3, 17, 205, 194);
		pnlKAP2.add(panel_22);
		panel_22.setLayout(null);

		JLabel lblKAP2Bebederos = new JLabel(
				"<html><body>Bebederos(8 llaves,1 llave de paso,8 te 1/2\",1 uni\u00F3n Universal, tefl\u00F3n 2 rollos, pasta sellante)</body></html>");
		lblKAP2Bebederos.setBounds(0, 0, 205, 44);
		panel_22.add(lblKAP2Bebederos);
		lblKAP2Bebederos.setFont(new Font("Tahoma", Font.PLAIN, 11));

		pnlTEtiquetas = new JPanel();
		pnlTEtiquetas.setBounds(0, 44, 205, 150);
		panel_22.add(pnlTEtiquetas);
		pnlTEtiquetas.setLayout(new GridLayout(5, 0, 0, 0));

		lblKAP2TomaRiego = new JLabel(
				"<html><body>Toma de Riego (5llave de paso,5uniones, 1 rollo de tefl\u00F3n, pasta selladora)</body></html>");
		lblKAP2TomaRiego.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlTEtiquetas.add(lblKAP2TomaRiego);

		lblKAP2KitConexion05 = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 1/2\". (lija pliego, polipega 1/4gal,6 uniones)</body></html>");
		lblKAP2KitConexion05.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlTEtiquetas.add(lblKAP2KitConexion05);

		lblKAP2KitConexion1 = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 1\". (lija pliego, polipega 1/4gal,14 uniones)</body></html>");
		lblKAP2KitConexion1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlTEtiquetas.add(lblKAP2KitConexion1);

		lblKAP2KitConexion34 = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 3/4\". (lija pliego, polipega 1/4gal,10 uniones)</body></html>");
		lblKAP2KitConexion34.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlTEtiquetas.add(lblKAP2KitConexion34);

		lblKAP2KitConexion1_05 = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 1- 1/2\". (lija pliego, polipega 1/4gal,8 uniones)</body></html>");
		lblKAP2KitConexion1_05.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlTEtiquetas.add(lblKAP2KitConexion1_05);

		pnlKH = new JPanel();
		pnlKH.setLayout(null);
		pnlKH.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlKH.setBounds(858, 225, 414, 84);
		pnlPestaña1.add(pnlKH);

		pnlBAEtiquetas = new JPanel();
		pnlBAEtiquetas.setBounds(3, 17, 199, 64);
		pnlKH.add(pnlBAEtiquetas);
		pnlBAEtiquetas.setLayout(new GridLayout(3, 0, 0, 0));

		lblKHBomba3hp = new JLabel("Bomba de 3 hp instalada");
		lblKHBomba3hp.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlBAEtiquetas.add(lblKHBomba3hp);

		lblKHSetAccesorios = new JLabel("1 set accesorios");
		lblKHSetAccesorios.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlBAEtiquetas.add(lblKHSetAccesorios);

		lblKHTanque55gl = new JLabel("Tanque de 55 gl y Cisterna 30 m3");
		lblKHTanque55gl.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlBAEtiquetas.add(lblKHTanque55gl);

		lblKitHidroneumatico = new JLabel("KIT HIDRONEUM\u00C1TICO");
		lblKitHidroneumatico.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKitHidroneumatico.setBounds(3, 1, 176, 14);
		pnlKH.add(lblKitHidroneumatico);

		pnlBACantidad = new JPanel();
		pnlBACantidad.setBounds(210, 17, 55, 64);
		pnlKH.add(pnlBACantidad);
		pnlBACantidad.setLayout(new GridLayout(3, 2, 0, 0));

		txtKHCantidad00 = new JTextField();
		txtKHCantidad00.setColumns(10);
		pnlBACantidad.add(txtKHCantidad00);

		txtKHCantidad01 = new JTextField();
		txtKHCantidad01.setColumns(10);
		pnlBACantidad.add(txtKHCantidad01);

		txtKHCantidad10 = new JTextField();
		txtKHCantidad10.setColumns(10);
		pnlBACantidad.add(txtKHCantidad10);

		txtKHCantidad11 = new JTextField();
		txtKHCantidad11.setColumns(10);
		pnlBACantidad.add(txtKHCantidad11);

		txtKHCantidad20 = new JTextField();
		txtKHCantidad20.setColumns(10);
		pnlBACantidad.add(txtKHCantidad20);

		txtKHCantidad21 = new JTextField();
		txtKHCantidad21.setColumns(10);
		pnlBACantidad.add(txtKHCantidad21);

		pnlBAObsRef = new JPanel();
		pnlBAObsRef.setBounds(267, 17, 143, 64);
		pnlKH.add(pnlBAObsRef);
		pnlBAObsRef.setLayout(new GridLayout(3, 0, 0, 0));

		txtKHObsRef0 = new JTextField();
		txtKHObsRef0.setColumns(10);
		pnlBAObsRef.add(txtKHObsRef0);

		txtKHObsRef1 = new JTextField();
		txtKHObsRef1.setColumns(10);
		pnlBAObsRef.add(txtKHObsRef1);

		txtKHObsRef2 = new JTextField();
		txtKHObsRef2.setColumns(10);
		pnlBAObsRef.add(txtKHObsRef2);

		lblKHCantidad = new JLabel("Cantidad");
		lblKHCantidad.setBounds(210, 1, 55, 14);
		pnlKH.add(lblKHCantidad);

		lblKAHObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblKAHObsRef.setBounds(267, 1, 143, 14);
		pnlKH.add(lblKAHObsRef);

		pnlInformacionObl = new JPanel();
		pnlInformacionObl.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"Informaci\u00F3n Obligatoria", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		pnlInformacionObl.setBounds(858, 310, 414, 244);
		pnlPestaña1.add(pnlInformacionObl);
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

		JButton btnInsertarFoto = new JButton("Insertar FOTO");
		btnInsertarFoto.setBounds(166, 201, 120, 35);
		pnlInformacionObl.add(btnInsertarFoto);
	}
}
