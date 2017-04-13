package com.capa.presentacion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.capa.datos.TFicha;
import com.capa.datos.TGrupo;
import com.capa.datos.TInformacionObligatoria;
import com.capa.datos.TdetalleFicha;
import com.capa.negocios.ComponenteFicha;
import com.capa.negocios.ComponenteInfoObligatoria;
import com.capa.negocios.ServicioFicha;
import com.capa.negocios.ServicioInfoObligatoria;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import static com.capa.util.Utilitarios.*;
import static com.capa.util.Validaciones.*;

public class PGTemplate extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCantidad40;
	private JTextField txtCantidad41;
	private JTextField txtCantidad31;
	private JTextField txtCantidad30;
	private JTextField txtCantidad20;
	private JTextField txtCantidad21;
	private JTextField txtCantidad11;
	private JTextField txtCantidad10;
	private JTextField txtCantidad00;
	private JTextField txtCantidad01;
	private JTextField txtObs0;
	private JTextField txtObs1;
	private JTextField txtObs3;
	private JTextField txtObs4;
	private JTextField txtCantidad90;
	private JTextField txtCantidad91;
	private JTextField txtObs9;
	private JTextField txtObs8;
	private JTextField txtCantidad81;
	private JTextField txtCantidad80;
	private JTextField txtCantidad70;
	private JTextField txtCantidad71;
	private JTextField txtCantidad61;
	private JTextField txtCantidad60;
	private JTextField txtCantidad50;
	private JTextField txtCantidad51;
	private JTextField txtObs5;
	private JTextField txtObs6;
	private JTextField txtObs7;
	private JTextField txtCantidad110;
	private JTextField txtCantidad100;
	private JTextField txtCantidad101;
	private JTextField txtCantidad111;
	private JTextField txtObs11;
	private JTextField txtObs10;
	private JTextField txtCantidad120;
	private JTextField txtCantidad121;
	private JTextField txtObs12;
	private JTextField txtCantidad150;
	private JTextField txtCantidad140;
	private JTextField txtCantidad130;
	private JTextField txtCantidad131;
	private JTextField txtCantidad141;
	private JTextField txtCantidad151;
	private JTextField txtObs15;
	private JTextField txtObs14;
	private JTextField txtObs13;
	private JTextField txtCantidad250;
	private JTextField txtCantidad251;
	private JTextField txtCantidad241;
	private JTextField txtCantidad240;
	private JTextField txtCantidad230;
	private JTextField txtCantidad231;
	private JTextField txtCantidad221;
	private JTextField txtCantidad220;
	private JTextField txtCantidad210;
	private JTextField txtCantidad200;
	private JTextField txtCantidad190;
	private JTextField txtCantidad191;
	private JTextField txtCantidad201;
	private JTextField txtCantidad211;
	private JTextField txtObs19;
	private JTextField txtObs20;
	private JTextField txtObs21;
	private JTextField txtObs22;
	private JTextField txtObs23;
	private JTextField txtObs24;
	private JTextField txtObs25;
	private JLabel lblFachadaLateralIzquierda_1;
	private JLabel lblPanelEpsPared;
	private JLabel lblPanelEpsPared_1;
	private JTextField txtCantidad180;
	private JTextField txtCantidad160;
	private JLabel label_33;
	private JTextField txtCantidad171;
	private JTextField txtCantidad181;
	private JTextField txtObs18;
	private JTextField txtObs17;
	private JLabel label_34;
	private JLabel label_17;
	private JLabel lblLuminariasLed;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel lblKitCableElctrico;
	private JLabel label_26;
	private JTextField txtCantidad300;
	private JTextField txtCantidad290;
	private JTextField txtCantidad280;
	private JTextField txtCantidad270;
	private JTextField txtCantidad260;
	private JLabel label_27;
	private JTextField txtCantidad261;
	private JTextField txtCantidad271;
	private JTextField txtCantidad281;
	private JTextField txtCantidad291;
	private JTextField txtCantidad301;
	private JTextField txtObs30;
	private JTextField txtObs29;
	private JTextField txtObs28;
	private JTextField txtObs27;
	private JTextField txtObs26;
	private JLabel label_28;
	private JLabel lblKitHidrosanitario;
	private JLabel lblInodoros;
	private JLabel lblLava;
	private JTextField txtCantidad320;
	private JTextField txtCantidad310;
	private JLabel label_32;
	private JTextField txtCantidad311;
	private JTextField txtCantidad321;
	private JTextField txtObs32;
	private JTextField txtObs31;
	private JLabel label_35;
	private JLabel lblKitAguaPotable;
	private JLabel label_25;
	private JLabel label_31;
	private JTextField txtCantidad330;
	private JTextField txtCantidad331;
	private JTextField txtObs33;
	private JLabel label_36;
	private JLabel label_18;
	private JTextField txtCantidad340;
	private JTextField txtCantidad341;
	private JTextField txtObs34;
	private JLabel lblTuberaDePvc;
	private JTextField txtCantidad350;
	private JTextField txtCantidad351;
	private JTextField txtObs35;
	private JLabel lblTuberaDePvc_1;
	private JTextField txtCantidad360;
	private JTextField txtCantidad361;
	private JTextField txtObs36;
	private JLabel lblkitParaConexin;
	private JTextField txtCantidad370;
	private JTextField txtCantidad371;
	private JTextField txtObs37;
	private JButton btnSiguiente;
	private JLabel label_37;
	private JLabel lblkitDeAccesorios;
	private JLabel lblTuberaDemm;
	private JLabel lblkitDeAccesorios_1;
	private JLabel label_41;
	private JLabel lblTuberaDePvc_2;
	private JLabel lblkitParaConexin_1;
	private JLabel lblkitParaConexin_2;
	private JTextField txtCantidad440;
	private JTextField txtCantidad441;
	private JTextField txtCantidad430;
	private JTextField txtCantidad431;
	private JTextField txtCantidad421;
	private JTextField txtCantidad420;
	private JTextField txtCantidad410;
	private JTextField txtCantidad411;
	private JTextField txtCantidad401;
	private JTextField txtCantidad400;
	private JTextField txtCantidad390;
	private JTextField txtCantidad380;
	private JTextField txtCantidad381;
	private JTextField txtCantidad391;
	private JLabel label_45;
	private JLabel label_46;
	private JTextField txtObs38;
	private JTextField txtObs39;
	private JTextField txtObs40;
	private JTextField txtObs41;
	private JTextField txtObs42;
	private JTextField txtObs43;
	private JTextField txtObs44;
	private JLabel label_38;
	private JLabel label_39;
	private JLabel label_40;
	private JLabel lblDadosDeCimentacin;
	private JLabel label_43;
	private JLabel label_44;
	private JLabel label_47;
	private JLabel label_48;
	private JLabel lblPerfilSfTipo;
	private JLabel lblPerfilSfTipo_1;
	private JLabel lblPerfilSfTipo_2;
	private JLabel lblPerfilSfTipo_3;
	private JLabel lblPerfilSfTipo_4;
	private JTextField txtCantidad540;
	private JTextField txtCantidad530;
	private JTextField txtCantidad520;
	private JTextField txtCantidad510;
	private JTextField txtCantidad500;
	private JTextField txtCantidad490;
	private JTextField txtCantidad480;
	private JTextField txtCantidad470;
	private JTextField txtCantidad460;
	private JTextField txtCantidad450;
	private JTextField txtCantidad451;
	private JTextField txtCantidad461;
	private JTextField txtCantidad471;
	private JTextField txtCantidad481;
	private JTextField txtCantidad491;
	private JTextField txtCantidad501;
	private JTextField txtCantidad511;
	private JTextField txtCantidad521;
	private JTextField txtCantidad531;
	private JTextField txtCantidad541;
	private JTextField txtObs54;
	private JTextField txtObs53;
	private JTextField txtObs52;
	private JTextField txtObs51;
	private JTextField txtObs50;
	private JTextField txtObs49;
	private JTextField txtObs48;
	private JTextField txtObs47;
	private JTextField txtObs46;
	private JTextField txtObs45;
	private JLabel lblPortn;
	private JLabel lblLuminariasDePared;
	private JTextField txtCantidad550;
	private JLabel label_50;
	private JTextField txtCantidad551;
	private JTextField txtObs55;
	private JLabel label_51;
	private JLabel lblElementoPortn;
	private JTextField txtCantidad560;
	private JTextField txtCantidad56;
	private JTextField txtObs56;
	private JLabel lblComponenteArquitectnico;
	private JLabel lblPanelesEpsPared_5;
	private JLabel lblPanelesEpsPared_6;
	private JLabel lblPanelesEpsPared_7;
	private JLabel lblPanelesEpsPared_8;
	private JLabel lblPanelesEpsPared_9;
	private JLabel lblPanelesEpsPared_10;
	private JLabel lblPanelesEpsPared_11;
	private JLabel lblPanelesEpsPared_12;
	private JLabel lblPanelesEpsPared_13;
	private JLabel lblPanelesEpsPared_14;
	private JLabel lblPanelesEpsPared_15;
	private JLabel lblPanelesEpsPared_16;
	private JTextField txtCACantidad110;
	private JTextField txtCACantidad100;
	private JTextField txtCACantidad90;
	private JTextField txtCACantidad80;
	private JTextField txtCACantidad70;
	private JTextField txtCACantidad60;
	private JTextField txtCACantidad50;
	private JTextField txtCACantidad40;
	private JTextField txtCACantidad30;
	private JTextField txtCACantidad20;
	private JTextField txtCantidad580;
	private JTextField txtCantidad570;
	private JLabel label_63;
	private JTextField txtCantidad571;
	private JTextField txtCantidad581;
	private JTextField txtCACantidad21;
	private JTextField txtCACantidad31;
	private JTextField txtCACantidad41;
	private JTextField txtCACantidad51;
	private JTextField txtCACantidad61;
	private JTextField txtCACantidad71;
	private JTextField txtCACantidad81;
	private JTextField txtCACantidad91;
	private JTextField txtCACantidad101;
	private JTextField txtCACantidad111;
	private JTextField txtCAObs11;
	private JTextField txtCAObs10;
	private JTextField txtCAObs9;
	private JTextField txtCAObs8;
	private JTextField txtCAObs7;
	private JTextField txtCAObs6;
	private JTextField txtCAObs5;
	private JTextField txtCAObs4;
	private JTextField txtCAObs3;
	private JTextField txtCAObs2;
	private JTextField txtObs58;
	private JTextField txtObs57;
	private JLabel label_64;
	private JLabel lblPanelesEpsPared_17;
	private JTextField txtCACantidad120;
	private JTextField txtCACantidad121;
	private JTextField txtCAObs12;
	private JLabel lblPanelesEpsPared_18;
	private JTextField txtCACantidad130;
	private JTextField txtCACantidad131;
	private JTextField txtCAObs13;
	private JLabel lblComponenteEstructural;
	private JLabel lblDadoCimentacinPortn;
	private JLabel lblPerfilSfTipo_5;
	private JTextField txtCE2Cantidad00;
	private JLabel label_53;
	private JTextField txtCE2Cantidad01;
	private JTextField txtCE2Cantidad11;
	private JTextField txtCE2Cantidad10;
	private JTextField txtCE2Obs1;
	private JTextField txtCE2Obs0;
	private JLabel label_54;
	private JLabel lblPerfilSfTipo_6;
	private JTextField txtCE2Cantidad20;
	private JTextField txtCE2Cantidad21;
	private JTextField txtCE2Obs2;
	private JTextField txtObs2;

	TInformacionObligatoria infor;
	TFicha ficha;
	ServicioFicha servFicha;

	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// PGTemplate frame = new PGTemplate();
	// frame.setVisible(true);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	// });
	// }

	/**
	 * Create the frame.
	 */
	public PGTemplate(TFicha ficha) {
		this.ficha = ficha;
		setTitle(ficha.getFiNombre());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1320, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		this.setTitle(ficha.getFiNombre());

		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());
		setContentPane(contentPane);
		contentPane.setLayout(null);

		llenarCabecera(cabecera);

		this.setResizable(false);
		this.setLocationRelativeTo(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 122, 1294, 569);
		contentPane.add(tabbedPane);

		String textoLabel31 = "<html><body>Kit de Accesorios de Conexi\u00F3n Agua<br>Potable (Inodoros)(1 te reducciones 1-1/2,<br>1 neplos,1 uniones de 1/2,1 codos de<br>"
				+ "90\u00B0,1 mangueras de abasto,1 llave de<br>paso , 1 rollo tefl\u00F3n, 1/2 tubos de pasta<br>selladora)</body></html>";

		String textoLabel18 = "<html><body>Potable (Lavabos)(1  te 1/2\"  ,  1 neplos,1<br>uni�n de 1/2,1 codo de 90\u00B0,1 manguera de<br>abasto,1 llave de paso, tefl�n, pasta<br>"
				+ "selladora)</body></html>";

		JPanel panel1 = new JPanel();
		tabbedPane.addTab("1.- PG porton y garita-1", null, panel1, null);
		panel1.setLayout(null);

		JLabel label = new JLabel("KIT EL\u00C9CTRICO");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 11));
		label.setBounds(10, 21, 203, 14);
		panel1.add(label);

		JLabel label_1 = new JLabel("Luminarias LED 60 w - 5000 lum");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("Arial", Font.PLAIN, 11));
		label_1.setBounds(10, 46, 203, 14);
		panel1.add(label_1);

		JLabel label_2 = new JLabel("Tomacorrientes");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setFont(new Font("Arial", Font.PLAIN, 11));
		label_2.setBounds(10, 68, 203, 14);
		panel1.add(label_2);

		JLabel label_3 = new JLabel("Interruptor");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("Arial", Font.PLAIN, 11));
		label_3.setBounds(10, 90, 203, 14);
		panel1.add(label_3);

		JLabel label_4 = new JLabel("Kit cable el\u00E9ctrico MA");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setFont(new Font("Arial", Font.PLAIN, 11));
		label_4.setBounds(10, 112, 203, 14);
		panel1.add(label_4);

		JLabel label_5 = new JLabel("Detector de humo");
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setFont(new Font("Arial", Font.PLAIN, 11));
		label_5.setBounds(10, 134, 203, 14);
		panel1.add(label_5);

		txtCantidad40 = new JTextField();
		txtCantidad40.setEditable(false);
		txtCantidad40.setColumns(10);
		txtCantidad40.setBounds(203, 131, 35, 20);
		panel1.add(txtCantidad40);

		txtCantidad41 = new JTextField();
		txtCantidad41.setColumns(10);
		txtCantidad41.setBounds(240, 131, 35, 20);
		panel1.add(txtCantidad41);

		txtCantidad31 = new JTextField();
		txtCantidad31.setColumns(10);
		txtCantidad31.setBounds(240, 109, 35, 20);
		panel1.add(txtCantidad31);

		txtCantidad30 = new JTextField();
		txtCantidad30.setEditable(false);
		txtCantidad30.setColumns(10);
		txtCantidad30.setBounds(203, 109, 35, 20);
		panel1.add(txtCantidad30);

		txtCantidad20 = new JTextField();
		txtCantidad20.setEditable(false);
		txtCantidad20.setColumns(10);
		txtCantidad20.setBounds(203, 87, 35, 20);
		panel1.add(txtCantidad20);

		txtCantidad21 = new JTextField();
		txtCantidad21.setColumns(10);
		txtCantidad21.setBounds(240, 87, 35, 20);
		panel1.add(txtCantidad21);

		txtCantidad11 = new JTextField();
		txtCantidad11.setColumns(10);
		txtCantidad11.setBounds(240, 65, 35, 20);
		panel1.add(txtCantidad11);

		txtCantidad10 = new JTextField();
		txtCantidad10.setEditable(false);
		txtCantidad10.setColumns(10);
		txtCantidad10.setBounds(203, 65, 35, 20);
		panel1.add(txtCantidad10);

		txtCantidad00 = new JTextField();
		txtCantidad00.setEditable(false);
		txtCantidad00.setColumns(10);
		txtCantidad00.setBounds(203, 43, 35, 20);
		panel1.add(txtCantidad00);

		txtCantidad01 = new JTextField();
		txtCantidad01.setColumns(10);
		txtCantidad01.setBounds(240, 43, 35, 20);
		panel1.add(txtCantidad01);

		JLabel label_6 = new JLabel("Cantidad");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Arial", Font.BOLD, 11));
		label_6.setBounds(206, 21, 63, 14);
		panel1.add(label_6);

		JLabel label_7 = new JLabel("Observaci\u00F3n/Referencia");
		label_7.setHorizontalAlignment(SwingConstants.LEFT);
		label_7.setFont(new Font("Arial", Font.BOLD, 11));
		label_7.setBounds(700, 18, 139, 14);
		panel1.add(label_7);

		txtObs0 = new JTextField();
		txtObs0.setColumns(10);
		txtObs0.setBounds(278, 43, 133, 20);
		panel1.add(txtObs0);

		txtObs1 = new JTextField();
		txtObs1.setColumns(10);
		txtObs1.setBounds(278, 65, 133, 20);
		panel1.add(txtObs1);

		txtObs2 = new JTextField();
		txtObs2.setColumns(10);
		txtObs2.setBounds(278, 87, 133, 20);
		panel1.add(txtObs2);

		txtObs3 = new JTextField();
		txtObs3.setColumns(10);
		txtObs3.setBounds(278, 109, 133, 20);
		panel1.add(txtObs3);

		txtObs4 = new JTextField();
		txtObs4.setColumns(10);
		txtObs4.setBounds(278, 131, 133, 20);
		panel1.add(txtObs4);

		JLabel label_8 = new JLabel("KIT AGUA LLUVIA");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Arial", Font.BOLD, 11));
		label_8.setBounds(39, 168, 139, 14);
		panel1.add(label_8);

		JLabel label_9 = new JLabel("Canal pl\u00E1stico PVC de L=3m");
		label_9.setHorizontalAlignment(SwingConstants.LEFT);
		label_9.setFont(new Font("Arial", Font.PLAIN, 11));
		label_9.setBounds(10, 193, 183, 14);
		panel1.add(label_9);

		JLabel label_10 = new JLabel(
				"<html><body>Kit de Accesorios de Conexi\u00F3n Agua de<br>Lluvia (2 rejilla, 4 codos 90\u00B0,1/4 gl<br>polipega, tornillos, abrazaderas</body></html>)");
		label_10.setHorizontalAlignment(SwingConstants.LEFT);
		label_10.setFont(new Font("Arial", Font.PLAIN, 11));
		label_10.setBounds(10, 212, 203, 56);
		panel1.add(label_10);

		JLabel label_11 = new JLabel("Tuber\u00EDa de PVC 75 mm L=3m");
		label_11.setHorizontalAlignment(SwingConstants.LEFT);
		label_11.setFont(new Font("Arial", Font.PLAIN, 11));
		label_11.setBounds(10, 270, 183, 14);
		panel1.add(label_11);

		JLabel label_12 = new JLabel("Tuber\u00EDa de PVC 75 mm L=0.6m");
		label_12.setHorizontalAlignment(SwingConstants.LEFT);
		label_12.setFont(new Font("Arial", Font.PLAIN, 11));
		label_12.setBounds(10, 292, 183, 14);
		panel1.add(label_12);

		JLabel label_13 = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 75 mm. (lija<br>pliego, polipega 1/4gal,1 codo 90\u00B0)</body></html>");
		label_13.setHorizontalAlignment(SwingConstants.LEFT);
		label_13.setFont(new Font("Arial", Font.PLAIN, 11));
		label_13.setBounds(10, 314, 203, 39);
		panel1.add(label_13);

		txtCantidad90 = new JTextField();
		txtCantidad90.setEditable(false);
		txtCantidad90.setColumns(10);
		txtCantidad90.setBounds(203, 322, 35, 20);
		panel1.add(txtCantidad90);

		txtCantidad91 = new JTextField();
		txtCantidad91.setColumns(10);
		txtCantidad91.setBounds(240, 322, 35, 20);
		panel1.add(txtCantidad91);

		txtObs9 = new JTextField();
		txtObs9.setColumns(10);
		txtObs9.setBounds(278, 322, 133, 20);
		panel1.add(txtObs9);

		txtObs8 = new JTextField();
		txtObs8.setColumns(10);
		txtObs8.setBounds(278, 286, 133, 20);
		panel1.add(txtObs8);

		txtCantidad81 = new JTextField();
		txtCantidad81.setColumns(10);
		txtCantidad81.setBounds(240, 286, 35, 20);
		panel1.add(txtCantidad81);

		txtCantidad80 = new JTextField();
		txtCantidad80.setEditable(false);
		txtCantidad80.setColumns(10);
		txtCantidad80.setBounds(203, 286, 35, 20);
		panel1.add(txtCantidad80);

		txtCantidad70 = new JTextField();
		txtCantidad70.setEditable(false);
		txtCantidad70.setColumns(10);
		txtCantidad70.setBounds(203, 264, 35, 20);
		panel1.add(txtCantidad70);

		txtCantidad71 = new JTextField();
		txtCantidad71.setColumns(10);
		txtCantidad71.setBounds(240, 264, 35, 20);
		panel1.add(txtCantidad71);

		txtCantidad61 = new JTextField();
		txtCantidad61.setColumns(10);
		txtCantidad61.setBounds(240, 233, 35, 20);
		panel1.add(txtCantidad61);

		txtCantidad60 = new JTextField();
		txtCantidad60.setEditable(false);
		txtCantidad60.setColumns(10);
		txtCantidad60.setBounds(203, 233, 35, 20);
		panel1.add(txtCantidad60);

		txtCantidad50 = new JTextField();
		txtCantidad50.setEditable(false);
		txtCantidad50.setColumns(10);
		txtCantidad50.setBounds(203, 190, 35, 20);
		panel1.add(txtCantidad50);

		txtCantidad51 = new JTextField();
		txtCantidad51.setColumns(10);
		txtCantidad51.setBounds(240, 190, 35, 20);
		panel1.add(txtCantidad51);

		JLabel label_14 = new JLabel("Cantidad");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Arial", Font.BOLD, 11));
		label_14.setBounds(206, 168, 63, 14);
		panel1.add(label_14);

		JLabel label_15 = new JLabel("Observaci\u00F3n/Referencia");
		label_15.setHorizontalAlignment(SwingConstants.LEFT);
		label_15.setFont(new Font("Arial", Font.BOLD, 11));
		label_15.setBounds(279, 168, 139, 14);
		panel1.add(label_15);

		txtObs5 = new JTextField();
		txtObs5.setColumns(10);
		txtObs5.setBounds(278, 190, 133, 20);
		panel1.add(txtObs5);

		txtObs6 = new JTextField();
		txtObs6.setColumns(10);
		txtObs6.setBounds(278, 233, 133, 20);
		panel1.add(txtObs6);

		txtObs7 = new JTextField();
		txtObs7.setColumns(10);
		txtObs7.setBounds(278, 264, 133, 20);
		panel1.add(txtObs7);

		JLabel label_16 = new JLabel("FACHADA FRONTAL");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("Arial", Font.BOLD, 11));
		label_16.setBounds(444, 21, 129, 14);
		panel1.add(label_16);

		JLabel lblPanelesEpsPared = new JLabel("Paneles EPS pared -   ( 1,50x1,10 mt)");
		lblPanelesEpsPared.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared.setBounds(421, 46, 203, 14);
		panel1.add(lblPanelesEpsPared);

		JLabel lblPanelesEpsPared_1 = new JLabel("Paneles EPS pared -   (0,80x1,50 mt)");
		lblPanelesEpsPared_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_1.setBounds(421, 68, 203, 14);
		panel1.add(lblPanelesEpsPared_1);

		txtCantidad110 = new JTextField();
		txtCantidad110.setEditable(false);
		txtCantidad110.setColumns(10);
		txtCantidad110.setBounds(624, 62, 35, 20);
		panel1.add(txtCantidad110);

		txtCantidad100 = new JTextField();
		txtCantidad100.setEditable(false);
		txtCantidad100.setColumns(10);
		txtCantidad100.setBounds(624, 40, 35, 20);
		panel1.add(txtCantidad100);

		JLabel label_19 = new JLabel("Cantidad");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("Arial", Font.BOLD, 11));
		label_19.setBounds(627, 18, 63, 14);
		panel1.add(label_19);

		txtCantidad101 = new JTextField();
		txtCantidad101.setColumns(10);
		txtCantidad101.setBounds(661, 40, 35, 20);
		panel1.add(txtCantidad101);

		txtCantidad111 = new JTextField();
		txtCantidad111.setColumns(10);
		txtCantidad111.setBounds(661, 62, 35, 20);
		panel1.add(txtCantidad111);

		txtObs11 = new JTextField();
		txtObs11.setColumns(10);
		txtObs11.setBounds(700, 62, 133, 20);
		panel1.add(txtObs11);

		txtObs10 = new JTextField();
		txtObs10.setColumns(10);
		txtObs10.setBounds(700, 40, 133, 20);
		panel1.add(txtObs10);

		JLabel label_20 = new JLabel("Observaci\u00F3n/Referencia");
		label_20.setHorizontalAlignment(SwingConstants.LEFT);
		label_20.setFont(new Font("Arial", Font.BOLD, 11));
		label_20.setBounds(279, 21, 139, 14);
		panel1.add(label_20);

		JLabel lblPanelesEpsPared_2 = new JLabel("Paneles EPS pared -   (1,50x2,40 mt)");
		lblPanelesEpsPared_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_2.setBounds(421, 90, 203, 14);
		panel1.add(lblPanelesEpsPared_2);

		txtCantidad120 = new JTextField();
		txtCantidad120.setEditable(false);
		txtCantidad120.setColumns(10);
		txtCantidad120.setBounds(624, 84, 35, 20);
		panel1.add(txtCantidad120);

		txtCantidad121 = new JTextField();
		txtCantidad121.setColumns(10);
		txtCantidad121.setBounds(661, 84, 35, 20);
		panel1.add(txtCantidad121);

		txtObs12 = new JTextField();
		txtObs12.setColumns(10);
		txtObs12.setBounds(700, 84, 133, 20);
		panel1.add(txtObs12);

		JLabel lblFachadaPosterior = new JLabel("FACHADA POSTERIOR");
		lblFachadaPosterior.setHorizontalAlignment(SwingConstants.CENTER);
		lblFachadaPosterior.setFont(new Font("Arial", Font.BOLD, 11));
		lblFachadaPosterior.setBounds(444, 131, 129, 14);
		panel1.add(lblFachadaPosterior);

		JLabel lblSetPanelesEps = new JLabel("Set Paneles EPS pared -   ( 1,30x1,80 mt)");
		lblSetPanelesEps.setHorizontalAlignment(SwingConstants.LEFT);
		lblSetPanelesEps.setFont(new Font("Arial", Font.PLAIN, 11));
		lblSetPanelesEps.setBounds(421, 156, 203, 14);
		panel1.add(lblSetPanelesEps);

		JLabel lblSetPanelesEps_1 = new JLabel("Set Paneles EPS pared -   ( 0,40x0,45 mt)");
		lblSetPanelesEps_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSetPanelesEps_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblSetPanelesEps_1.setBounds(421, 178, 203, 14);
		panel1.add(lblSetPanelesEps_1);

		JLabel lblPanelAlturaVariable = new JLabel("Panel altura variable \u2013 (ver detalle)");
		lblPanelAlturaVariable.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelAlturaVariable.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelAlturaVariable.setBounds(421, 200, 203, 14);
		panel1.add(lblPanelAlturaVariable);

		txtCantidad150 = new JTextField();
		txtCantidad150.setEditable(false);
		txtCantidad150.setColumns(10);
		txtCantidad150.setBounds(624, 194, 35, 20);
		panel1.add(txtCantidad150);

		txtCantidad140 = new JTextField();
		txtCantidad140.setEditable(false);
		txtCantidad140.setColumns(10);
		txtCantidad140.setBounds(624, 172, 35, 20);
		panel1.add(txtCantidad140);

		txtCantidad130 = new JTextField();
		txtCantidad130.setEditable(false);
		txtCantidad130.setColumns(10);
		txtCantidad130.setBounds(624, 150, 35, 20);
		panel1.add(txtCantidad130);

		JLabel label_23 = new JLabel("Cantidad");
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setFont(new Font("Arial", Font.BOLD, 11));
		label_23.setBounds(627, 128, 63, 14);
		panel1.add(label_23);

		txtCantidad131 = new JTextField();
		txtCantidad131.setColumns(10);
		txtCantidad131.setBounds(661, 150, 35, 20);
		panel1.add(txtCantidad131);

		txtCantidad141 = new JTextField();
		txtCantidad141.setColumns(10);
		txtCantidad141.setBounds(661, 172, 35, 20);
		panel1.add(txtCantidad141);

		txtCantidad151 = new JTextField();
		txtCantidad151.setColumns(10);
		txtCantidad151.setBounds(661, 194, 35, 20);
		panel1.add(txtCantidad151);

		txtObs15 = new JTextField();
		txtObs15.setColumns(10);
		txtObs15.setBounds(700, 194, 133, 20);
		panel1.add(txtObs15);

		txtObs14 = new JTextField();
		txtObs14.setColumns(10);
		txtObs14.setBounds(700, 172, 133, 20);
		panel1.add(txtObs14);

		txtObs13 = new JTextField();
		txtObs13.setColumns(10);
		txtObs13.setBounds(700, 150, 133, 20);
		panel1.add(txtObs13);

		JLabel label_24 = new JLabel("Observaci\u00F3n/Referencia");
		label_24.setHorizontalAlignment(SwingConstants.LEFT);
		label_24.setFont(new Font("Arial", Font.BOLD, 11));
		label_24.setBounds(700, 128, 139, 14);
		panel1.add(label_24);

		JLabel lblFachadaLateralIzquierda = new JLabel("FACHADA LATERAL DERECHA");
		lblFachadaLateralIzquierda.setHorizontalAlignment(SwingConstants.CENTER);
		lblFachadaLateralIzquierda.setFont(new Font("Arial", Font.BOLD, 11));
		lblFachadaLateralIzquierda.setBounds(421, 322, 203, 14);
		panel1.add(lblFachadaLateralIzquierda);

		JLabel lblPanelesEpsPared_3 = new JLabel("Paneles EPS pared -   ( 0,70x2,40 mt)");
		lblPanelesEpsPared_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_3.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_3.setBounds(421, 347, 203, 14);
		panel1.add(lblPanelesEpsPared_3);

		JLabel lblPanelEpsPared_2 = new JLabel("Panel EPS- pared ( 0,70x1,10 mt)");
		lblPanelEpsPared_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelEpsPared_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelEpsPared_2.setBounds(421, 369, 203, 14);
		panel1.add(lblPanelEpsPared_2);

		JLabel lblPanelEpsPared_3 = new JLabel("Panel EPS- pared ( 2,30x5 mt)");
		lblPanelEpsPared_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelEpsPared_3.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelEpsPared_3.setBounds(421, 391, 203, 14);
		panel1.add(lblPanelEpsPared_3);

		JLabel lblPanelesTcb = new JLabel("Paneles TCB   ( 2,70x1,30 mt)");
		lblPanelesTcb.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesTcb.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesTcb.setBounds(421, 413, 203, 14);
		panel1.add(lblPanelesTcb);

		JLabel lblPanelesVynilPiso = new JLabel("Paneles vynil piso (0,15x0.65mts)");
		lblPanelesVynilPiso.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesVynilPiso.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesVynilPiso.setBounds(421, 435, 203, 14);
		panel1.add(lblPanelesVynilPiso);

		JLabel lblPanelesEpsPara = new JLabel("Paneles EPS para cubierta L2.5");
		lblPanelesEpsPara.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPara.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPara.setBounds(421, 457, 203, 14);
		panel1.add(lblPanelesEpsPara);

		JLabel lblPanelesEpsPared_4 = new JLabel("Paneles EPS pared -   ( 0,70x2,40 mt)");
		lblPanelesEpsPared_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_4.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_4.setBounds(421, 479, 203, 14);
		panel1.add(lblPanelesEpsPared_4);

		txtCantidad250 = new JTextField();
		txtCantidad250.setEditable(false);
		txtCantidad250.setColumns(10);
		txtCantidad250.setBounds(624, 473, 35, 20);
		panel1.add(txtCantidad250);

		txtCantidad251 = new JTextField();
		txtCantidad251.setColumns(10);
		txtCantidad251.setBounds(661, 473, 35, 20);
		panel1.add(txtCantidad251);

		txtCantidad241 = new JTextField();
		txtCantidad241.setColumns(10);
		txtCantidad241.setBounds(661, 451, 35, 20);
		panel1.add(txtCantidad241);

		txtCantidad240 = new JTextField();
		txtCantidad240.setEditable(false);
		txtCantidad240.setColumns(10);
		txtCantidad240.setBounds(624, 451, 35, 20);
		panel1.add(txtCantidad240);

		txtCantidad230 = new JTextField();
		txtCantidad230.setEditable(false);
		txtCantidad230.setColumns(10);
		txtCantidad230.setBounds(624, 429, 35, 20);
		panel1.add(txtCantidad230);

		txtCantidad231 = new JTextField();
		txtCantidad231.setColumns(10);
		txtCantidad231.setBounds(661, 429, 35, 20);
		panel1.add(txtCantidad231);

		txtCantidad221 = new JTextField();
		txtCantidad221.setColumns(10);
		txtCantidad221.setBounds(661, 407, 35, 20);
		panel1.add(txtCantidad221);

		txtCantidad220 = new JTextField();
		txtCantidad220.setEditable(false);
		txtCantidad220.setColumns(10);
		txtCantidad220.setBounds(624, 407, 35, 20);
		panel1.add(txtCantidad220);

		txtCantidad210 = new JTextField();
		txtCantidad210.setEditable(false);
		txtCantidad210.setColumns(10);
		txtCantidad210.setBounds(624, 385, 35, 20);
		panel1.add(txtCantidad210);

		txtCantidad200 = new JTextField();
		txtCantidad200.setEditable(false);
		txtCantidad200.setColumns(10);
		txtCantidad200.setBounds(624, 363, 35, 20);
		panel1.add(txtCantidad200);

		txtCantidad190 = new JTextField();
		txtCantidad190.setEditable(false);
		txtCantidad190.setColumns(10);
		txtCantidad190.setBounds(624, 341, 35, 20);
		panel1.add(txtCantidad190);

		JLabel label_29 = new JLabel("Cantidad");
		label_29.setHorizontalAlignment(SwingConstants.CENTER);
		label_29.setFont(new Font("Arial", Font.BOLD, 11));
		label_29.setBounds(634, 319, 63, 14);
		panel1.add(label_29);

		txtCantidad191 = new JTextField();
		txtCantidad191.setColumns(10);
		txtCantidad191.setBounds(661, 341, 35, 20);
		panel1.add(txtCantidad191);

		txtCantidad201 = new JTextField();
		txtCantidad201.setColumns(10);
		txtCantidad201.setBounds(661, 363, 35, 20);
		panel1.add(txtCantidad201);

		txtCantidad211 = new JTextField();
		txtCantidad211.setColumns(10);
		txtCantidad211.setBounds(661, 385, 35, 20);
		panel1.add(txtCantidad211);

		JLabel label_30 = new JLabel("Observaci\u00F3n/Referencia");
		label_30.setHorizontalAlignment(SwingConstants.LEFT);
		label_30.setFont(new Font("Arial", Font.BOLD, 11));
		label_30.setBounds(700, 319, 139, 14);
		panel1.add(label_30);

		txtObs19 = new JTextField();
		txtObs19.setColumns(10);
		txtObs19.setBounds(700, 341, 133, 20);
		panel1.add(txtObs19);

		txtObs20 = new JTextField();
		txtObs20.setColumns(10);
		txtObs20.setBounds(700, 363, 133, 20);
		panel1.add(txtObs20);

		txtObs21 = new JTextField();
		txtObs21.setColumns(10);
		txtObs21.setBounds(700, 385, 133, 20);
		panel1.add(txtObs21);

		txtObs22 = new JTextField();
		txtObs22.setColumns(10);
		txtObs22.setBounds(700, 407, 133, 20);
		panel1.add(txtObs22);

		txtObs23 = new JTextField();
		txtObs23.setColumns(10);
		txtObs23.setBounds(700, 429, 133, 20);
		panel1.add(txtObs23);

		txtObs24 = new JTextField();
		txtObs24.setColumns(10);
		txtObs24.setBounds(700, 451, 133, 20);
		panel1.add(txtObs24);

		txtObs25 = new JTextField();
		txtObs25.setColumns(10);
		txtObs25.setBounds(700, 473, 133, 20);
		panel1.add(txtObs25);

		lblFachadaLateralIzquierda_1 = new JLabel("FACHADA LATERAL IZQUIERDA");
		lblFachadaLateralIzquierda_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFachadaLateralIzquierda_1.setFont(new Font("Arial", Font.BOLD, 11));
		lblFachadaLateralIzquierda_1.setBounds(421, 242, 180, 14);
		panel1.add(lblFachadaLateralIzquierda_1);

		lblPanelEpsPared = new JLabel("Panel EPS- pared ( 0,70x0,60 mt)");
		lblPanelEpsPared.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelEpsPared.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelEpsPared.setBounds(421, 267, 203, 14);
		panel1.add(lblPanelEpsPared);

		lblPanelEpsPared_1 = new JLabel("Panel EPS- pared ( 2,20x2,70 mt)");
		lblPanelEpsPared_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelEpsPared_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelEpsPared_1.setBounds(421, 289, 203, 14);
		panel1.add(lblPanelEpsPared_1);

		txtCantidad180 = new JTextField();
		txtCantidad180.setEditable(false);
		txtCantidad180.setColumns(10);
		txtCantidad180.setBounds(624, 283, 35, 20);
		panel1.add(txtCantidad180);

		txtCantidad160 = new JTextField();
		txtCantidad160.setEditable(false);
		txtCantidad160.setColumns(10);
		txtCantidad160.setBounds(624, 261, 35, 20);
		panel1.add(txtCantidad160);

		label_33 = new JLabel("Cantidad");
		label_33.setHorizontalAlignment(SwingConstants.CENTER);
		label_33.setFont(new Font("Arial", Font.BOLD, 11));
		label_33.setBounds(627, 239, 63, 14);
		panel1.add(label_33);

		txtCantidad171 = new JTextField();
		txtCantidad171.setColumns(10);
		txtCantidad171.setBounds(661, 261, 35, 20);
		panel1.add(txtCantidad171);

		txtCantidad181 = new JTextField();
		txtCantidad181.setColumns(10);
		txtCantidad181.setBounds(661, 283, 35, 20);
		panel1.add(txtCantidad181);

		txtObs18 = new JTextField();
		txtObs18.setColumns(10);
		txtObs18.setBounds(700, 283, 133, 20);
		panel1.add(txtObs18);

		txtObs17 = new JTextField();
		txtObs17.setColumns(10);
		txtObs17.setBounds(700, 261, 133, 20);
		panel1.add(txtObs17);

		label_34 = new JLabel("Observaci\u00F3n/Referencia");
		label_34.setHorizontalAlignment(SwingConstants.LEFT);
		label_34.setFont(new Font("Arial", Font.BOLD, 11));
		label_34.setBounds(700, 239, 139, 14);
		panel1.add(label_34);

		label_17 = new JLabel("KIT EL\u00C9CTRICO");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("Arial", Font.BOLD, 11));
		label_17.setBounds(849, 21, 203, 14);
		panel1.add(label_17);

		lblLuminariasLed = new JLabel("Luminarias LED 40 w - 2250 lum");
		lblLuminariasLed.setHorizontalAlignment(SwingConstants.LEFT);
		lblLuminariasLed.setFont(new Font("Arial", Font.PLAIN, 11));
		lblLuminariasLed.setBounds(849, 46, 203, 14);
		panel1.add(lblLuminariasLed);

		label_21 = new JLabel("Tomacorrientes");
		label_21.setHorizontalAlignment(SwingConstants.LEFT);
		label_21.setFont(new Font("Arial", Font.PLAIN, 11));
		label_21.setBounds(849, 68, 203, 14);
		panel1.add(label_21);

		label_22 = new JLabel("Interruptor");
		label_22.setHorizontalAlignment(SwingConstants.LEFT);
		label_22.setFont(new Font("Arial", Font.PLAIN, 11));
		label_22.setBounds(849, 90, 203, 14);
		panel1.add(label_22);

		lblKitCableElctrico = new JLabel("Kit cable el\u00E9ctrico");
		lblKitCableElctrico.setHorizontalAlignment(SwingConstants.LEFT);
		lblKitCableElctrico.setFont(new Font("Arial", Font.PLAIN, 11));
		lblKitCableElctrico.setBounds(849, 112, 203, 14);
		panel1.add(lblKitCableElctrico);

		label_26 = new JLabel("Detector de humo");
		label_26.setHorizontalAlignment(SwingConstants.LEFT);
		label_26.setFont(new Font("Arial", Font.PLAIN, 11));
		label_26.setBounds(849, 134, 203, 14);
		panel1.add(label_26);

		txtCantidad300 = new JTextField();
		txtCantidad300.setEditable(false);
		txtCantidad300.setColumns(10);
		txtCantidad300.setBounds(1062, 131, 35, 20);
		panel1.add(txtCantidad300);

		txtCantidad290 = new JTextField();
		txtCantidad290.setEditable(false);
		txtCantidad290.setColumns(10);
		txtCantidad290.setBounds(1062, 109, 35, 20);
		panel1.add(txtCantidad290);

		txtCantidad280 = new JTextField();
		txtCantidad280.setEditable(false);
		txtCantidad280.setColumns(10);
		txtCantidad280.setBounds(1062, 87, 35, 20);
		panel1.add(txtCantidad280);

		txtCantidad270 = new JTextField();
		txtCantidad270.setEditable(false);
		txtCantidad270.setColumns(10);
		txtCantidad270.setBounds(1062, 65, 35, 20);
		panel1.add(txtCantidad270);

		txtCantidad260 = new JTextField();
		txtCantidad260.setEditable(false);
		txtCantidad260.setColumns(10);
		txtCantidad260.setBounds(1062, 43, 35, 20);
		panel1.add(txtCantidad260);

		label_27 = new JLabel("Cantidad");
		label_27.setHorizontalAlignment(SwingConstants.CENTER);
		label_27.setFont(new Font("Arial", Font.BOLD, 11));
		label_27.setBounds(1065, 21, 63, 14);
		panel1.add(label_27);

		txtCantidad261 = new JTextField();
		txtCantidad261.setColumns(10);
		txtCantidad261.setBounds(1099, 43, 35, 20);
		panel1.add(txtCantidad261);

		txtCantidad271 = new JTextField();
		txtCantidad271.setColumns(10);
		txtCantidad271.setBounds(1099, 65, 35, 20);
		panel1.add(txtCantidad271);

		txtCantidad281 = new JTextField();
		txtCantidad281.setColumns(10);
		txtCantidad281.setBounds(1099, 87, 35, 20);
		panel1.add(txtCantidad281);

		txtCantidad291 = new JTextField();
		txtCantidad291.setColumns(10);
		txtCantidad291.setBounds(1099, 109, 35, 20);
		panel1.add(txtCantidad291);

		txtCantidad301 = new JTextField();
		txtCantidad301.setColumns(10);
		txtCantidad301.setBounds(1099, 131, 35, 20);
		panel1.add(txtCantidad301);

		txtObs30 = new JTextField();
		txtObs30.setColumns(10);
		txtObs30.setBounds(1138, 131, 133, 20);
		panel1.add(txtObs30);

		txtObs29 = new JTextField();
		txtObs29.setColumns(10);
		txtObs29.setBounds(1138, 109, 133, 20);
		panel1.add(txtObs29);

		txtObs28 = new JTextField();
		txtObs28.setColumns(10);
		txtObs28.setBounds(1138, 87, 133, 20);
		panel1.add(txtObs28);

		txtObs27 = new JTextField();
		txtObs27.setColumns(10);
		txtObs27.setBounds(1138, 65, 133, 20);
		panel1.add(txtObs27);

		txtObs26 = new JTextField();
		txtObs26.setColumns(10);
		txtObs26.setBounds(1138, 43, 133, 20);
		panel1.add(txtObs26);

		label_28 = new JLabel("Observaci\u00F3n/Referencia");
		label_28.setHorizontalAlignment(SwingConstants.LEFT);
		label_28.setFont(new Font("Arial", Font.BOLD, 11));
		label_28.setBounds(1133, 21, 139, 14);
		panel1.add(label_28);

		lblKitHidrosanitario = new JLabel("KIT HIDROSANITARIO");
		lblKitHidrosanitario.setHorizontalAlignment(SwingConstants.CENTER);
		lblKitHidrosanitario.setFont(new Font("Arial", Font.BOLD, 11));
		lblKitHidrosanitario.setBounds(849, 156, 203, 14);
		panel1.add(lblKitHidrosanitario);

		lblInodoros = new JLabel("Inodoros");
		lblInodoros.setHorizontalAlignment(SwingConstants.LEFT);
		lblInodoros.setFont(new Font("Arial", Font.PLAIN, 11));
		lblInodoros.setBounds(849, 181, 203, 14);
		panel1.add(lblInodoros);

		lblLava = new JLabel("Lavabos");
		lblLava.setHorizontalAlignment(SwingConstants.LEFT);
		lblLava.setFont(new Font("Arial", Font.PLAIN, 11));
		lblLava.setBounds(849, 203, 203, 14);
		panel1.add(lblLava);

		txtCantidad320 = new JTextField();
		txtCantidad320.setEditable(false);
		txtCantidad320.setColumns(10);
		txtCantidad320.setBounds(1062, 200, 35, 20);
		panel1.add(txtCantidad320);

		txtCantidad310 = new JTextField();
		txtCantidad310.setEditable(false);
		txtCantidad310.setColumns(10);
		txtCantidad310.setBounds(1062, 178, 35, 20);
		panel1.add(txtCantidad310);

		label_32 = new JLabel("Cantidad");
		label_32.setHorizontalAlignment(SwingConstants.CENTER);
		label_32.setFont(new Font("Arial", Font.BOLD, 11));
		label_32.setBounds(1065, 156, 63, 14);
		panel1.add(label_32);

		txtCantidad311 = new JTextField();
		txtCantidad311.setColumns(10);
		txtCantidad311.setBounds(1099, 178, 35, 20);
		panel1.add(txtCantidad311);

		txtCantidad321 = new JTextField();
		txtCantidad321.setColumns(10);
		txtCantidad321.setBounds(1099, 200, 35, 20);
		panel1.add(txtCantidad321);

		txtObs32 = new JTextField();
		txtObs32.setColumns(10);
		txtObs32.setBounds(1138, 200, 133, 20);
		panel1.add(txtObs32);

		txtObs31 = new JTextField();
		txtObs31.setColumns(10);
		txtObs31.setBounds(1138, 178, 133, 20);
		panel1.add(txtObs31);

		label_35 = new JLabel("Observaci\u00F3n/Referencia");
		label_35.setHorizontalAlignment(SwingConstants.LEFT);
		label_35.setFont(new Font("Arial", Font.BOLD, 11));
		label_35.setBounds(1133, 156, 139, 14);
		panel1.add(label_35);

		lblKitAguaPotable = new JLabel("KIT AGUA POTABLE");
		lblKitAguaPotable.setHorizontalAlignment(SwingConstants.CENTER);
		lblKitAguaPotable.setFont(new Font("Arial", Font.BOLD, 11));
		lblKitAguaPotable.setBounds(848, 233, 203, 14);
		panel1.add(lblKitAguaPotable);

		label_25 = new JLabel("Cantidad");
		label_25.setHorizontalAlignment(SwingConstants.CENTER);
		label_25.setFont(new Font("Arial", Font.BOLD, 11));
		label_25.setBounds(1064, 233, 63, 14);
		panel1.add(label_25);
		label_31 = new JLabel(textoLabel31);
		label_31.setVerticalAlignment(SwingConstants.TOP);
		label_31.setHorizontalAlignment(SwingConstants.LEFT);
		label_31.setFont(new Font("Arial", Font.PLAIN, 11));
		label_31.setBounds(848, 258, 214, 94);
		panel1.add(label_31);

		txtCantidad330 = new JTextField();
		txtCantidad330.setEditable(false);
		txtCantidad330.setColumns(10);
		txtCantidad330.setBounds(1061, 291, 35, 20);
		panel1.add(txtCantidad330);

		txtCantidad331 = new JTextField();
		txtCantidad331.setColumns(10);
		txtCantidad331.setBounds(1098, 291, 35, 20);
		panel1.add(txtCantidad331);

		txtObs33 = new JTextField();
		txtObs33.setColumns(10);
		txtObs33.setBounds(1137, 291, 133, 20);
		panel1.add(txtObs33);

		label_36 = new JLabel("Observaci\u00F3n/Referencia");
		label_36.setHorizontalAlignment(SwingConstants.LEFT);
		label_36.setFont(new Font("Arial", Font.BOLD, 11));
		label_36.setBounds(1132, 233, 139, 14);
		panel1.add(label_36);
		label_18 = new JLabel(textoLabel18);
		label_18.setVerticalAlignment(SwingConstants.TOP);
		label_18.setHorizontalAlignment(SwingConstants.LEFT);
		label_18.setFont(new Font("Arial", Font.PLAIN, 11));
		label_18.setBounds(849, 347, 214, 70);
		panel1.add(label_18);

		txtCantidad340 = new JTextField();
		txtCantidad340.setEditable(false);
		txtCantidad340.setColumns(10);
		txtCantidad340.setBounds(1062, 363, 35, 20);
		panel1.add(txtCantidad340);

		txtCantidad341 = new JTextField();
		txtCantidad341.setColumns(10);
		txtCantidad341.setBounds(1099, 363, 35, 20);
		panel1.add(txtCantidad341);

		txtObs34 = new JTextField();
		txtObs34.setColumns(10);
		txtObs34.setBounds(1138, 363, 133, 20);
		panel1.add(txtObs34);

		lblTuberaDePvc = new JLabel("Tuber\u00EDa de PVC 1/2\" y L=3m");
		lblTuberaDePvc.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberaDePvc.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberaDePvc.setBounds(849, 416, 183, 14);
		panel1.add(lblTuberaDePvc);

		txtCantidad350 = new JTextField();
		txtCantidad350.setEditable(false);
		txtCantidad350.setColumns(10);
		txtCantidad350.setBounds(1062, 413, 35, 20);
		panel1.add(txtCantidad350);

		txtCantidad351 = new JTextField();
		txtCantidad351.setColumns(10);
		txtCantidad351.setBounds(1099, 413, 35, 20);
		panel1.add(txtCantidad351);

		txtObs35 = new JTextField();
		txtObs35.setColumns(10);
		txtObs35.setBounds(1138, 413, 133, 20);
		panel1.add(txtObs35);

		lblTuberaDePvc_1 = new JLabel("Tuber\u00EDa de PVC 3/4\" y L=3m");
		lblTuberaDePvc_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberaDePvc_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberaDePvc_1.setBounds(849, 438, 183, 14);
		panel1.add(lblTuberaDePvc_1);

		txtCantidad360 = new JTextField();
		txtCantidad360.setEditable(false);
		txtCantidad360.setColumns(10);
		txtCantidad360.setBounds(1062, 435, 35, 20);
		panel1.add(txtCantidad360);

		txtCantidad361 = new JTextField();
		txtCantidad361.setColumns(10);
		txtCantidad361.setBounds(1099, 435, 35, 20);
		panel1.add(txtCantidad361);

		txtObs36 = new JTextField();
		txtObs36.setColumns(10);
		txtObs36.setBounds(1138, 435, 133, 20);
		panel1.add(txtObs36);

		lblkitParaConexin = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 1/2\". (lija<br>pliego, polipega 1/4gal,1 uni\u00F3n)</body></html>");
		lblkitParaConexin.setHorizontalAlignment(SwingConstants.LEFT);
		lblkitParaConexin.setFont(new Font("Arial", Font.PLAIN, 11));
		lblkitParaConexin.setBounds(849, 463, 203, 39);
		panel1.add(lblkitParaConexin);

		txtCantidad370 = new JTextField();
		txtCantidad370.setEditable(false);
		txtCantidad370.setColumns(10);
		txtCantidad370.setBounds(1062, 471, 35, 20);
		panel1.add(txtCantidad370);

		txtCantidad371 = new JTextField();
		txtCantidad371.setColumns(10);
		txtCantidad371.setBounds(1099, 471, 35, 20);
		panel1.add(txtCantidad371);

		txtObs37 = new JTextField();
		txtObs37.setColumns(10);
		txtObs37.setBounds(1138, 471, 133, 20);
		panel1.add(txtObs37);

		btnSiguiente = new JButton("Siguiente p\u00E1gina");
		btnSiguiente.setBounds(1072, 502, 188, 23);
		panel1.add(btnSiguiente);

		JPanel panel2 = new JPanel();
		tabbedPane.addTab("2.-PG porton y garita-1", null, panel2, null);
		panel2.setLayout(null);

		label_37 = new JLabel("KIT AGUA RESIDUAL");
		label_37.setHorizontalAlignment(SwingConstants.CENTER);
		label_37.setFont(new Font("Arial", Font.BOLD, 11));
		label_37.setBounds(24, 11, 139, 14);
		panel2.add(label_37);

		lblkitDeAccesorios = new JLabel(
				"<html><body>Kit de Accesorios de Conexi\u00F3n Agua<br>Residual (Lavabos)(4 codo 90\u00B0,1/4 gl<br>polipega ,4 yee 50-110)</body></html>");
		lblkitDeAccesorios.setVerticalAlignment(SwingConstants.TOP);
		lblkitDeAccesorios.setHorizontalAlignment(SwingConstants.LEFT);
		lblkitDeAccesorios.setFont(new Font("Arial", Font.PLAIN, 11));
		lblkitDeAccesorios.setBounds(10, 33, 203, 50);
		panel2.add(lblkitDeAccesorios);

		lblTuberaDemm = new JLabel("Tuber\u00EDa de 50mm PVC y L=3m");
		lblTuberaDemm.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberaDemm.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberaDemm.setBounds(10, 78, 183, 14);
		panel2.add(lblTuberaDemm);

		lblkitDeAccesorios_1 = new JLabel(
				"<html><body>Kit de Accesorios de Conexi\u00F3n Agua<br>Residual (Inodoros)(1/4 gl polipega ,4 yee<br>110)</body></html>");
		lblkitDeAccesorios_1.setVerticalAlignment(SwingConstants.TOP);
		lblkitDeAccesorios_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblkitDeAccesorios_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblkitDeAccesorios_1.setBounds(10, 101, 203, 50);
		panel2.add(lblkitDeAccesorios_1);

		label_41 = new JLabel("Tuber\u00EDa de 75mm PVC y L=3m");
		label_41.setHorizontalAlignment(SwingConstants.LEFT);
		label_41.setFont(new Font("Arial", Font.PLAIN, 11));
		label_41.setBounds(10, 154, 183, 14);
		panel2.add(label_41);

		lblTuberaDePvc_2 = new JLabel("Tuber\u00EDa de PVC 110mm PVC y L=3m");
		lblTuberaDePvc_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberaDePvc_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberaDePvc_2.setBounds(10, 176, 183, 14);
		panel2.add(lblTuberaDePvc_2);

		lblkitParaConexin_1 = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 50 mm. (lija<br>un pliego, polipega 1/4 gal, 1/4 gl suelda<br>l\u00EDquida, 1 uni\u00F3n,1codo 90\u00B0,1codo 45\u00B0)");
		lblkitParaConexin_1.setVerticalAlignment(SwingConstants.TOP);
		lblkitParaConexin_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblkitParaConexin_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblkitParaConexin_1.setBounds(10, 201, 203, 42);
		panel2.add(lblkitParaConexin_1);

		lblkitParaConexin_2 = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 110 mm. (lija<br>pliego, polipega 1/2gal, 1/4 gl suelda<br>l\u00EDquida , 1 union,1codo 90\u00B0,1codo 45\u00B0)</body></html>");
		lblkitParaConexin_2.setVerticalAlignment(SwingConstants.TOP);
		lblkitParaConexin_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblkitParaConexin_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblkitParaConexin_2.setBounds(10, 250, 203, 42);
		panel2.add(lblkitParaConexin_2);

		txtCantidad440 = new JTextField();
		txtCantidad440.setEditable(false);
		txtCantidad440.setColumns(10);
		txtCantidad440.setBounds(223, 261, 35, 20);
		panel2.add(txtCantidad440);

		txtCantidad441 = new JTextField();
		txtCantidad441.setColumns(10);
		txtCantidad441.setBounds(260, 261, 35, 20);
		panel2.add(txtCantidad441);

		txtCantidad430 = new JTextField();
		txtCantidad430.setEditable(false);
		txtCantidad430.setColumns(10);
		txtCantidad430.setBounds(223, 212, 35, 20);
		panel2.add(txtCantidad430);

		txtCantidad431 = new JTextField();
		txtCantidad431.setColumns(10);
		txtCantidad431.setBounds(260, 212, 35, 20);
		panel2.add(txtCantidad431);

		txtCantidad421 = new JTextField();
		txtCantidad421.setColumns(10);
		txtCantidad421.setBounds(260, 173, 35, 20);
		panel2.add(txtCantidad421);

		txtCantidad420 = new JTextField();
		txtCantidad420.setEditable(false);
		txtCantidad420.setColumns(10);
		txtCantidad420.setBounds(223, 173, 35, 20);
		panel2.add(txtCantidad420);

		txtCantidad410 = new JTextField();
		txtCantidad410.setEditable(false);
		txtCantidad410.setColumns(10);
		txtCantidad410.setBounds(223, 151, 35, 20);
		panel2.add(txtCantidad410);

		txtCantidad411 = new JTextField();
		txtCantidad411.setColumns(10);
		txtCantidad411.setBounds(260, 151, 35, 20);
		panel2.add(txtCantidad411);

		txtCantidad401 = new JTextField();
		txtCantidad401.setColumns(10);
		txtCantidad401.setBounds(260, 112, 35, 20);
		panel2.add(txtCantidad401);

		txtCantidad400 = new JTextField();
		txtCantidad400.setEditable(false);
		txtCantidad400.setColumns(10);
		txtCantidad400.setBounds(223, 112, 35, 20);
		panel2.add(txtCantidad400);

		txtCantidad390 = new JTextField();
		txtCantidad390.setEditable(false);
		txtCantidad390.setColumns(10);
		txtCantidad390.setBounds(223, 75, 35, 20);
		panel2.add(txtCantidad390);

		txtCantidad380 = new JTextField();
		txtCantidad380.setEditable(false);
		txtCantidad380.setColumns(10);
		txtCantidad380.setBounds(223, 44, 35, 20);
		panel2.add(txtCantidad380);

		txtCantidad381 = new JTextField();
		txtCantidad381.setColumns(10);
		txtCantidad381.setBounds(260, 44, 35, 20);
		panel2.add(txtCantidad381);

		txtCantidad391 = new JTextField();
		txtCantidad391.setColumns(10);
		txtCantidad391.setBounds(260, 75, 35, 20);
		panel2.add(txtCantidad391);

		label_45 = new JLabel("Cantidad");
		label_45.setHorizontalAlignment(SwingConstants.CENTER);
		label_45.setFont(new Font("Arial", Font.BOLD, 11));
		label_45.setBounds(227, 11, 63, 14);
		panel2.add(label_45);

		label_46 = new JLabel("Observaci\u00F3n/Referencia");
		label_46.setHorizontalAlignment(SwingConstants.LEFT);
		label_46.setFont(new Font("Arial", Font.BOLD, 11));
		label_46.setBounds(299, 11, 139, 14);
		panel2.add(label_46);

		txtObs38 = new JTextField();
		txtObs38.setColumns(10);
		txtObs38.setBounds(299, 44, 133, 20);
		panel2.add(txtObs38);

		txtObs39 = new JTextField();
		txtObs39.setColumns(10);
		txtObs39.setBounds(299, 75, 133, 20);
		panel2.add(txtObs39);

		txtObs40 = new JTextField();
		txtObs40.setColumns(10);
		txtObs40.setBounds(299, 112, 133, 20);
		panel2.add(txtObs40);

		txtObs41 = new JTextField();
		txtObs41.setColumns(10);
		txtObs41.setBounds(299, 151, 133, 20);
		panel2.add(txtObs41);

		txtObs42 = new JTextField();
		txtObs42.setColumns(10);
		txtObs42.setBounds(299, 173, 133, 20);
		panel2.add(txtObs42);

		txtObs43 = new JTextField();
		txtObs43.setColumns(10);
		txtObs43.setBounds(299, 212, 133, 20);
		panel2.add(txtObs43);

		txtObs44 = new JTextField();
		txtObs44.setColumns(10);
		txtObs44.setBounds(299, 261, 133, 20);
		panel2.add(txtObs44);

		label_38 = new JLabel("COMPONENTE ESTRUCTURAL");
		label_38.setHorizontalAlignment(SwingConstants.CENTER);
		label_38.setFont(new Font("Arial", Font.BOLD, 11));
		label_38.setBounds(10, 292, 203, 14);
		panel2.add(label_38);

		label_39 = new JLabel("Cantidad");
		label_39.setHorizontalAlignment(SwingConstants.CENTER);
		label_39.setFont(new Font("Arial", Font.BOLD, 11));
		label_39.setBounds(227, 292, 63, 14);
		panel2.add(label_39);

		label_40 = new JLabel("Observaci\u00F3n/Referencia");
		label_40.setHorizontalAlignment(SwingConstants.LEFT);
		label_40.setFont(new Font("Arial", Font.BOLD, 11));
		label_40.setBounds(299, 292, 139, 14);
		panel2.add(label_40);

		lblDadosDeCimentacin = new JLabel("Dados de cimentaci\u00F3n garita");
		lblDadosDeCimentacin.setHorizontalAlignment(SwingConstants.LEFT);
		lblDadosDeCimentacin.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDadosDeCimentacin.setBounds(10, 317, 203, 14);
		panel2.add(lblDadosDeCimentacin);

		label_43 = new JLabel("Perfil SF Tipo 1");
		label_43.setHorizontalAlignment(SwingConstants.LEFT);
		label_43.setFont(new Font("Arial", Font.PLAIN, 11));
		label_43.setBounds(10, 339, 203, 14);
		panel2.add(label_43);

		label_44 = new JLabel("Perfil SF Tipo 2");
		label_44.setHorizontalAlignment(SwingConstants.LEFT);
		label_44.setFont(new Font("Arial", Font.PLAIN, 11));
		label_44.setBounds(10, 361, 203, 14);
		panel2.add(label_44);

		label_47 = new JLabel("Perfil SF Tipo 3");
		label_47.setHorizontalAlignment(SwingConstants.LEFT);
		label_47.setFont(new Font("Arial", Font.PLAIN, 11));
		label_47.setBounds(10, 383, 203, 14);
		panel2.add(label_47);

		label_48 = new JLabel("Perfil SF Tipo 4");
		label_48.setHorizontalAlignment(SwingConstants.LEFT);
		label_48.setFont(new Font("Arial", Font.PLAIN, 11));
		label_48.setBounds(10, 405, 203, 14);
		panel2.add(label_48);

		lblPerfilSfTipo = new JLabel("Perfil SF Tipo 6");
		lblPerfilSfTipo.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo.setBounds(10, 427, 203, 14);
		panel2.add(lblPerfilSfTipo);

		lblPerfilSfTipo_1 = new JLabel("Perfil SF Tipo 7");
		lblPerfilSfTipo_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_1.setBounds(10, 449, 203, 14);
		panel2.add(lblPerfilSfTipo_1);

		lblPerfilSfTipo_2 = new JLabel("Perfil SF Tipo 8");
		lblPerfilSfTipo_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_2.setBounds(10, 471, 203, 14);
		panel2.add(lblPerfilSfTipo_2);

		lblPerfilSfTipo_3 = new JLabel("Perfil SF Tipo 9");
		lblPerfilSfTipo_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_3.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_3.setBounds(10, 493, 203, 14);
		panel2.add(lblPerfilSfTipo_3);

		lblPerfilSfTipo_4 = new JLabel("Perfil SF Tipo 11");
		lblPerfilSfTipo_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_4.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_4.setBounds(10, 515, 203, 14);
		panel2.add(lblPerfilSfTipo_4);

		txtCantidad540 = new JTextField();
		txtCantidad540.setEditable(false);
		txtCantidad540.setColumns(10);
		txtCantidad540.setBounds(223, 512, 35, 20);
		panel2.add(txtCantidad540);

		txtCantidad530 = new JTextField();
		txtCantidad530.setEditable(false);
		txtCantidad530.setColumns(10);
		txtCantidad530.setBounds(223, 490, 35, 20);
		panel2.add(txtCantidad530);

		txtCantidad520 = new JTextField();
		txtCantidad520.setEditable(false);
		txtCantidad520.setColumns(10);
		txtCantidad520.setBounds(223, 468, 35, 20);
		panel2.add(txtCantidad520);

		txtCantidad510 = new JTextField();
		txtCantidad510.setEditable(false);
		txtCantidad510.setColumns(10);
		txtCantidad510.setBounds(223, 446, 35, 20);
		panel2.add(txtCantidad510);

		txtCantidad500 = new JTextField();
		txtCantidad500.setEditable(false);
		txtCantidad500.setColumns(10);
		txtCantidad500.setBounds(223, 424, 35, 20);
		panel2.add(txtCantidad500);

		txtCantidad490 = new JTextField();
		txtCantidad490.setEditable(false);
		txtCantidad490.setColumns(10);
		txtCantidad490.setBounds(223, 402, 35, 20);
		panel2.add(txtCantidad490);

		txtCantidad480 = new JTextField();
		txtCantidad480.setEditable(false);
		txtCantidad480.setColumns(10);
		txtCantidad480.setBounds(223, 380, 35, 20);
		panel2.add(txtCantidad480);

		txtCantidad470 = new JTextField();
		txtCantidad470.setEditable(false);
		txtCantidad470.setColumns(10);
		txtCantidad470.setBounds(223, 358, 35, 20);
		panel2.add(txtCantidad470);

		txtCantidad460 = new JTextField();
		txtCantidad460.setEditable(false);
		txtCantidad460.setColumns(10);
		txtCantidad460.setBounds(223, 336, 35, 20);
		panel2.add(txtCantidad460);

		txtCantidad450 = new JTextField();
		txtCantidad450.setEditable(false);
		txtCantidad450.setColumns(10);
		txtCantidad450.setBounds(223, 314, 35, 20);
		panel2.add(txtCantidad450);

		txtCantidad451 = new JTextField();
		txtCantidad451.setColumns(10);
		txtCantidad451.setBounds(260, 314, 35, 20);
		panel2.add(txtCantidad451);

		txtCantidad461 = new JTextField();
		txtCantidad461.setColumns(10);
		txtCantidad461.setBounds(260, 336, 35, 20);
		panel2.add(txtCantidad461);

		txtCantidad471 = new JTextField();
		txtCantidad471.setColumns(10);
		txtCantidad471.setBounds(260, 358, 35, 20);
		panel2.add(txtCantidad471);

		txtCantidad481 = new JTextField();
		txtCantidad481.setColumns(10);
		txtCantidad481.setBounds(260, 380, 35, 20);
		panel2.add(txtCantidad481);

		txtCantidad491 = new JTextField();
		txtCantidad491.setColumns(10);
		txtCantidad491.setBounds(260, 402, 35, 20);
		panel2.add(txtCantidad491);

		txtCantidad501 = new JTextField();
		txtCantidad501.setColumns(10);
		txtCantidad501.setBounds(260, 424, 35, 20);
		panel2.add(txtCantidad501);

		txtCantidad511 = new JTextField();
		txtCantidad511.setColumns(10);
		txtCantidad511.setBounds(260, 446, 35, 20);
		panel2.add(txtCantidad511);

		txtCantidad521 = new JTextField();
		txtCantidad521.setColumns(10);
		txtCantidad521.setBounds(260, 468, 35, 20);
		panel2.add(txtCantidad521);

		txtCantidad531 = new JTextField();
		txtCantidad531.setColumns(10);
		txtCantidad531.setBounds(260, 490, 35, 20);
		panel2.add(txtCantidad531);

		txtCantidad541 = new JTextField();
		txtCantidad541.setColumns(10);
		txtCantidad541.setBounds(260, 512, 35, 20);
		panel2.add(txtCantidad541);

		txtObs54 = new JTextField();
		txtObs54.setColumns(10);
		txtObs54.setBounds(299, 512, 133, 20);
		panel2.add(txtObs54);

		txtObs53 = new JTextField();
		txtObs53.setColumns(10);
		txtObs53.setBounds(299, 490, 133, 20);
		panel2.add(txtObs53);

		txtObs52 = new JTextField();
		txtObs52.setColumns(10);
		txtObs52.setBounds(299, 468, 133, 20);
		panel2.add(txtObs52);

		txtObs51 = new JTextField();
		txtObs51.setColumns(10);
		txtObs51.setBounds(299, 446, 133, 20);
		panel2.add(txtObs51);

		txtObs50 = new JTextField();
		txtObs50.setColumns(10);
		txtObs50.setBounds(299, 424, 133, 20);
		panel2.add(txtObs50);

		txtObs49 = new JTextField();
		txtObs49.setColumns(10);
		txtObs49.setBounds(299, 402, 133, 20);
		panel2.add(txtObs49);

		txtObs48 = new JTextField();
		txtObs48.setColumns(10);
		txtObs48.setBounds(299, 380, 133, 20);
		panel2.add(txtObs48);

		txtObs47 = new JTextField();
		txtObs47.setColumns(10);
		txtObs47.setBounds(299, 358, 133, 20);
		panel2.add(txtObs47);

		txtObs46 = new JTextField();
		txtObs46.setColumns(10);
		txtObs46.setBounds(299, 336, 133, 20);
		panel2.add(txtObs46);

		txtObs45 = new JTextField();
		txtObs45.setColumns(10);
		txtObs45.setBounds(299, 314, 133, 20);
		panel2.add(txtObs45);

		lblPortn = new JLabel("PORT\u00D3N");
		lblPortn.setHorizontalAlignment(SwingConstants.CENTER);
		lblPortn.setFont(new Font("Arial", Font.BOLD, 11));
		lblPortn.setBounds(442, 11, 203, 14);
		panel2.add(lblPortn);

		lblLuminariasDePared = new JLabel("Luminarias de pared LED 40 w - 2250 lum");
		lblLuminariasDePared.setHorizontalAlignment(SwingConstants.LEFT);
		lblLuminariasDePared.setFont(new Font("Arial", Font.PLAIN, 11));
		lblLuminariasDePared.setBounds(442, 36, 203, 14);
		panel2.add(lblLuminariasDePared);

		txtCantidad550 = new JTextField();
		txtCantidad550.setEditable(false);
		txtCantidad550.setColumns(10);
		txtCantidad550.setBounds(649, 33, 35, 20);
		panel2.add(txtCantidad550);

		label_50 = new JLabel("Cantidad");
		label_50.setHorizontalAlignment(SwingConstants.CENTER);
		label_50.setFont(new Font("Arial", Font.BOLD, 11));
		label_50.setBounds(652, 11, 63, 14);
		panel2.add(label_50);

		txtCantidad551 = new JTextField();
		txtCantidad551.setColumns(10);
		txtCantidad551.setBounds(686, 33, 35, 20);
		panel2.add(txtCantidad551);

		txtObs55 = new JTextField();
		txtObs55.setColumns(10);
		txtObs55.setBounds(725, 33, 133, 20);
		panel2.add(txtObs55);

		label_51 = new JLabel("Observaci\u00F3n/Referencia");
		label_51.setHorizontalAlignment(SwingConstants.LEFT);
		label_51.setFont(new Font("Arial", Font.BOLD, 11));
		label_51.setBounds(725, 11, 139, 14);
		panel2.add(label_51);

		lblElementoPortn = new JLabel("Elemento Port\u00F3n - (2,55x2,15 mts)");
		lblElementoPortn.setHorizontalAlignment(SwingConstants.LEFT);
		lblElementoPortn.setFont(new Font("Arial", Font.PLAIN, 11));
		lblElementoPortn.setBounds(442, 58, 203, 14);
		panel2.add(lblElementoPortn);

		txtCantidad560 = new JTextField();
		txtCantidad560.setEditable(false);
		txtCantidad560.setColumns(10);
		txtCantidad560.setBounds(649, 55, 35, 20);
		panel2.add(txtCantidad560);

		txtCantidad56 = new JTextField();
		txtCantidad56.setColumns(10);
		txtCantidad56.setBounds(686, 55, 35, 20);
		panel2.add(txtCantidad56);

		txtObs56 = new JTextField();
		txtObs56.setColumns(10);
		txtObs56.setBounds(725, 55, 133, 20);
		panel2.add(txtObs56);

		lblComponenteArquitectnico = new JLabel("COMPONENTE ARQUITECT\u00D3NICO");
		lblComponenteArquitectnico.setHorizontalAlignment(SwingConstants.CENTER);
		lblComponenteArquitectnico.setFont(new Font("Arial", Font.BOLD, 11));
		lblComponenteArquitectnico.setBounds(442, 94, 203, 14);
		panel2.add(lblComponenteArquitectnico);

		lblPanelesEpsPared_5 = new JLabel("Paneles EPS pared port\u00F3n- (2,50x1,52 mt)");
		lblPanelesEpsPared_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_5.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_5.setBounds(442, 119, 203, 14);
		panel2.add(lblPanelesEpsPared_5);

		lblPanelesEpsPared_6 = new JLabel("Paneles EPS pared port\u00F3n- (2,50x0,.65)");
		lblPanelesEpsPared_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_6.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_6.setBounds(442, 141, 203, 14);
		panel2.add(lblPanelesEpsPared_6);

		lblPanelesEpsPared_7 = new JLabel("Paneles EPS pared port\u00F3n- (1,0x0,35 mt)");
		lblPanelesEpsPared_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_7.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_7.setBounds(442, 163, 203, 14);
		panel2.add(lblPanelesEpsPared_7);

		lblPanelesEpsPared_8 = new JLabel("Paneles EPS pared port\u00F3n- (1,20x4,0 mt)");
		lblPanelesEpsPared_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_8.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_8.setBounds(442, 185, 203, 14);
		panel2.add(lblPanelesEpsPared_8);

		lblPanelesEpsPared_9 = new JLabel("Paneles EPS pared port\u00F3n- (1,0x1,0 mt)");
		lblPanelesEpsPared_9.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_9.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_9.setBounds(442, 207, 203, 14);
		panel2.add(lblPanelesEpsPared_9);

		lblPanelesEpsPared_10 = new JLabel("Paneles EPS pared port\u00F3n- (1,0x0,85 mt)");
		lblPanelesEpsPared_10.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_10.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_10.setBounds(442, 229, 203, 14);
		panel2.add(lblPanelesEpsPared_10);

		lblPanelesEpsPared_11 = new JLabel("Paneles EPS pared port\u00F3n- (0,42x3,0 mt)");
		lblPanelesEpsPared_11.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_11.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_11.setBounds(442, 251, 203, 14);
		panel2.add(lblPanelesEpsPared_11);

		lblPanelesEpsPared_12 = new JLabel("Paneles EPS pared port\u00F3n- (0,55x0,85 mt)");
		lblPanelesEpsPared_12.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_12.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_12.setBounds(442, 273, 203, 14);
		panel2.add(lblPanelesEpsPared_12);

		lblPanelesEpsPared_13 = new JLabel("Paneles EPS pared port\u00F3n- (0,30x3,0 mt)");
		lblPanelesEpsPared_13.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_13.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_13.setBounds(442, 295, 203, 14);
		panel2.add(lblPanelesEpsPared_13);

		lblPanelesEpsPared_14 = new JLabel("Paneles EPS pared port\u00F3n- (0,6x2,5 mt)");
		lblPanelesEpsPared_14.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_14.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_14.setBounds(442, 317, 203, 14);
		panel2.add(lblPanelesEpsPared_14);

		lblPanelesEpsPared_15 = new JLabel("Paneles EPS pared port\u00F3n- (1,50x2,50 mt)");
		lblPanelesEpsPared_15.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_15.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_15.setBounds(442, 339, 203, 14);
		panel2.add(lblPanelesEpsPared_15);

		lblPanelesEpsPared_16 = new JLabel("Paneles EPS pared port\u00F3n- (2,50x1,52 mt)");
		lblPanelesEpsPared_16.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_16.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_16.setBounds(442, 361, 203, 14);
		panel2.add(lblPanelesEpsPared_16);

		txtCACantidad110 = new JTextField();
		txtCACantidad110.setEditable(false);
		txtCACantidad110.setColumns(10);
		txtCACantidad110.setBounds(649, 355, 35, 20);
		panel2.add(txtCACantidad110);

		txtCACantidad100 = new JTextField();
		txtCACantidad100.setEditable(false);
		txtCACantidad100.setColumns(10);
		txtCACantidad100.setBounds(649, 333, 35, 20);
		panel2.add(txtCACantidad100);

		txtCACantidad90 = new JTextField();
		txtCACantidad90.setEditable(false);
		txtCACantidad90.setColumns(10);
		txtCACantidad90.setBounds(649, 311, 35, 20);
		panel2.add(txtCACantidad90);

		txtCACantidad80 = new JTextField();
		txtCACantidad80.setEditable(false);
		txtCACantidad80.setColumns(10);
		txtCACantidad80.setBounds(649, 289, 35, 20);
		panel2.add(txtCACantidad80);

		txtCACantidad70 = new JTextField();
		txtCACantidad70.setEditable(false);
		txtCACantidad70.setColumns(10);
		txtCACantidad70.setBounds(649, 267, 35, 20);
		panel2.add(txtCACantidad70);

		txtCACantidad60 = new JTextField();
		txtCACantidad60.setEditable(false);
		txtCACantidad60.setColumns(10);
		txtCACantidad60.setBounds(649, 245, 35, 20);
		panel2.add(txtCACantidad60);

		txtCACantidad50 = new JTextField();
		txtCACantidad50.setEditable(false);
		txtCACantidad50.setColumns(10);
		txtCACantidad50.setBounds(649, 223, 35, 20);
		panel2.add(txtCACantidad50);

		txtCACantidad40 = new JTextField();
		txtCACantidad40.setEditable(false);
		txtCACantidad40.setColumns(10);
		txtCACantidad40.setBounds(649, 201, 35, 20);
		panel2.add(txtCACantidad40);

		txtCACantidad30 = new JTextField();
		txtCACantidad30.setEditable(false);
		txtCACantidad30.setColumns(10);
		txtCACantidad30.setBounds(649, 179, 35, 20);
		panel2.add(txtCACantidad30);

		txtCACantidad20 = new JTextField();
		txtCACantidad20.setEditable(false);
		txtCACantidad20.setColumns(10);
		txtCACantidad20.setBounds(649, 157, 35, 20);
		panel2.add(txtCACantidad20);

		txtCantidad580 = new JTextField();
		txtCantidad580.setEditable(false);
		txtCantidad580.setColumns(10);
		txtCantidad580.setBounds(649, 135, 35, 20);
		panel2.add(txtCantidad580);

		txtCantidad570 = new JTextField();
		txtCantidad570.setEditable(false);
		txtCantidad570.setColumns(10);
		txtCantidad570.setBounds(649, 113, 35, 20);
		panel2.add(txtCantidad570);

		label_63 = new JLabel("Cantidad");
		label_63.setHorizontalAlignment(SwingConstants.CENTER);
		label_63.setFont(new Font("Arial", Font.BOLD, 11));
		label_63.setBounds(652, 91, 63, 14);
		panel2.add(label_63);

		txtCantidad571 = new JTextField();
		txtCantidad571.setColumns(10);
		txtCantidad571.setBounds(686, 113, 35, 20);
		panel2.add(txtCantidad571);

		txtCantidad581 = new JTextField();
		txtCantidad581.setColumns(10);
		txtCantidad581.setBounds(686, 135, 35, 20);
		panel2.add(txtCantidad581);

		txtCACantidad21 = new JTextField();
		txtCACantidad21.setColumns(10);
		txtCACantidad21.setBounds(686, 157, 35, 20);
		panel2.add(txtCACantidad21);

		txtCACantidad31 = new JTextField();
		txtCACantidad31.setColumns(10);
		txtCACantidad31.setBounds(686, 179, 35, 20);
		panel2.add(txtCACantidad31);

		txtCACantidad41 = new JTextField();
		txtCACantidad41.setColumns(10);
		txtCACantidad41.setBounds(686, 201, 35, 20);
		panel2.add(txtCACantidad41);

		txtCACantidad51 = new JTextField();
		txtCACantidad51.setColumns(10);
		txtCACantidad51.setBounds(686, 223, 35, 20);
		panel2.add(txtCACantidad51);

		txtCACantidad61 = new JTextField();
		txtCACantidad61.setColumns(10);
		txtCACantidad61.setBounds(686, 245, 35, 20);
		panel2.add(txtCACantidad61);

		txtCACantidad71 = new JTextField();
		txtCACantidad71.setColumns(10);
		txtCACantidad71.setBounds(686, 267, 35, 20);
		panel2.add(txtCACantidad71);

		txtCACantidad81 = new JTextField();
		txtCACantidad81.setColumns(10);
		txtCACantidad81.setBounds(686, 289, 35, 20);
		panel2.add(txtCACantidad81);

		txtCACantidad91 = new JTextField();
		txtCACantidad91.setColumns(10);
		txtCACantidad91.setBounds(686, 311, 35, 20);
		panel2.add(txtCACantidad91);

		txtCACantidad101 = new JTextField();
		txtCACantidad101.setColumns(10);
		txtCACantidad101.setBounds(686, 333, 35, 20);
		panel2.add(txtCACantidad101);

		txtCACantidad111 = new JTextField();
		txtCACantidad111.setColumns(10);
		txtCACantidad111.setBounds(686, 355, 35, 20);
		panel2.add(txtCACantidad111);

		txtCAObs11 = new JTextField();
		txtCAObs11.setColumns(10);
		txtCAObs11.setBounds(725, 355, 133, 20);
		panel2.add(txtCAObs11);

		txtCAObs10 = new JTextField();
		txtCAObs10.setColumns(10);
		txtCAObs10.setBounds(725, 333, 133, 20);
		panel2.add(txtCAObs10);

		txtCAObs9 = new JTextField();
		txtCAObs9.setColumns(10);
		txtCAObs9.setBounds(725, 311, 133, 20);
		panel2.add(txtCAObs9);

		txtCAObs8 = new JTextField();
		txtCAObs8.setColumns(10);
		txtCAObs8.setBounds(725, 289, 133, 20);
		panel2.add(txtCAObs8);

		txtCAObs7 = new JTextField();
		txtCAObs7.setColumns(10);
		txtCAObs7.setBounds(725, 267, 133, 20);
		panel2.add(txtCAObs7);

		txtCAObs6 = new JTextField();
		txtCAObs6.setColumns(10);
		txtCAObs6.setBounds(725, 245, 133, 20);
		panel2.add(txtCAObs6);

		txtCAObs5 = new JTextField();
		txtCAObs5.setColumns(10);
		txtCAObs5.setBounds(725, 223, 133, 20);
		panel2.add(txtCAObs5);

		txtCAObs4 = new JTextField();
		txtCAObs4.setColumns(10);
		txtCAObs4.setBounds(725, 201, 133, 20);
		panel2.add(txtCAObs4);

		txtCAObs3 = new JTextField();
		txtCAObs3.setColumns(10);
		txtCAObs3.setBounds(725, 179, 133, 20);
		panel2.add(txtCAObs3);

		txtCAObs2 = new JTextField();
		txtCAObs2.setColumns(10);
		txtCAObs2.setBounds(725, 157, 133, 20);
		panel2.add(txtCAObs2);

		txtObs58 = new JTextField();
		txtObs58.setColumns(10);
		txtObs58.setBounds(725, 135, 133, 20);
		panel2.add(txtObs58);

		txtObs57 = new JTextField();
		txtObs57.setColumns(10);
		txtObs57.setBounds(725, 113, 133, 20);
		panel2.add(txtObs57);

		label_64 = new JLabel("Observaci\u00F3n/Referencia");
		label_64.setHorizontalAlignment(SwingConstants.LEFT);
		label_64.setFont(new Font("Arial", Font.BOLD, 11));
		label_64.setBounds(725, 91, 139, 14);
		panel2.add(label_64);

		lblPanelesEpsPared_17 = new JLabel("Paneles EPS pared port\u00F3n- (2,50x0,65 mt)");
		lblPanelesEpsPared_17.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_17.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_17.setBounds(442, 383, 203, 14);
		panel2.add(lblPanelesEpsPared_17);

		txtCACantidad120 = new JTextField();
		txtCACantidad120.setEditable(false);
		txtCACantidad120.setColumns(10);
		txtCACantidad120.setBounds(649, 377, 35, 20);
		panel2.add(txtCACantidad120);

		txtCACantidad121 = new JTextField();
		txtCACantidad121.setColumns(10);
		txtCACantidad121.setBounds(686, 377, 35, 20);
		panel2.add(txtCACantidad121);

		txtCAObs12 = new JTextField();
		txtCAObs12.setColumns(10);
		txtCAObs12.setBounds(725, 377, 133, 20);
		panel2.add(txtCAObs12);

		lblPanelesEpsPared_18 = new JLabel("Paneles EPS pared port\u00F3n- (1,0x0,35 mt)");
		lblPanelesEpsPared_18.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_18.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_18.setBounds(442, 405, 203, 14);
		panel2.add(lblPanelesEpsPared_18);

		txtCACantidad130 = new JTextField();
		txtCACantidad130.setEditable(false);
		txtCACantidad130.setColumns(10);
		txtCACantidad130.setBounds(649, 399, 35, 20);
		panel2.add(txtCACantidad130);

		txtCACantidad131 = new JTextField();
		txtCACantidad131.setColumns(10);
		txtCACantidad131.setBounds(686, 399, 35, 20);
		panel2.add(txtCACantidad131);

		txtCAObs13 = new JTextField();
		txtCAObs13.setColumns(10);
		txtCAObs13.setBounds(725, 399, 133, 20);
		panel2.add(txtCAObs13);

		lblComponenteEstructural = new JLabel("COMPONENTE ESTRUCTURAL");
		lblComponenteEstructural.setHorizontalAlignment(SwingConstants.CENTER);
		lblComponenteEstructural.setFont(new Font("Arial", Font.BOLD, 11));
		lblComponenteEstructural.setBounds(868, 11, 203, 14);
		panel2.add(lblComponenteEstructural);

		lblDadoCimentacinPortn = new JLabel("Dado cimentaci\u00F3n port\u00F3n");
		lblDadoCimentacinPortn.setHorizontalAlignment(SwingConstants.LEFT);
		lblDadoCimentacinPortn.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDadoCimentacinPortn.setBounds(868, 36, 203, 14);
		panel2.add(lblDadoCimentacinPortn);

		lblPerfilSfTipo_5 = new JLabel("Perfil SF Tipo 12 MA-SF-12 para paredes");
		lblPerfilSfTipo_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_5.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_5.setBounds(868, 58, 203, 14);
		panel2.add(lblPerfilSfTipo_5);

		txtCE2Cantidad00 = new JTextField();
		txtCE2Cantidad00.setEditable(false);
		txtCE2Cantidad00.setColumns(10);
		txtCE2Cantidad00.setBounds(1070, 33, 35, 20);
		panel2.add(txtCE2Cantidad00);

		label_53 = new JLabel("Cantidad");
		label_53.setHorizontalAlignment(SwingConstants.CENTER);
		label_53.setFont(new Font("Arial", Font.BOLD, 11));
		label_53.setBounds(1073, 11, 63, 14);
		panel2.add(label_53);

		txtCE2Cantidad01 = new JTextField();
		txtCE2Cantidad01.setColumns(10);
		txtCE2Cantidad01.setBounds(1107, 33, 35, 20);
		panel2.add(txtCE2Cantidad01);

		txtCE2Cantidad11 = new JTextField();
		txtCE2Cantidad11.setColumns(10);
		txtCE2Cantidad11.setBounds(1107, 55, 35, 20);
		panel2.add(txtCE2Cantidad11);

		txtCE2Cantidad10 = new JTextField();
		txtCE2Cantidad10.setEditable(false);
		txtCE2Cantidad10.setColumns(10);
		txtCE2Cantidad10.setBounds(1070, 55, 35, 20);
		panel2.add(txtCE2Cantidad10);

		txtCE2Obs1 = new JTextField();
		txtCE2Obs1.setColumns(10);
		txtCE2Obs1.setBounds(1146, 55, 133, 20);
		panel2.add(txtCE2Obs1);

		txtCE2Obs0 = new JTextField();
		txtCE2Obs0.setColumns(10);
		txtCE2Obs0.setBounds(1146, 33, 133, 20);
		panel2.add(txtCE2Obs0);

		label_54 = new JLabel("Observaci\u00F3n/Referencia");
		label_54.setHorizontalAlignment(SwingConstants.LEFT);
		label_54.setFont(new Font("Arial", Font.BOLD, 11));
		label_54.setBounds(1140, 11, 139, 14);
		panel2.add(label_54);

		lblPerfilSfTipo_6 = new JLabel("Perfil SF Tipo 12 MA-SF-12 para puerta");
		lblPerfilSfTipo_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_6.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_6.setBounds(868, 80, 203, 14);
		panel2.add(lblPerfilSfTipo_6);

		txtCE2Cantidad20 = new JTextField();
		txtCE2Cantidad20.setEditable(false);
		txtCE2Cantidad20.setColumns(10);
		txtCE2Cantidad20.setBounds(1070, 77, 35, 20);
		panel2.add(txtCE2Cantidad20);

		txtCE2Cantidad21 = new JTextField();
		txtCE2Cantidad21.setColumns(10);
		txtCE2Cantidad21.setBounds(1107, 77, 35, 20);
		panel2.add(txtCE2Cantidad21);

		txtCE2Obs2 = new JTextField();
		txtCE2Obs2.setColumns(10);
		txtCE2Obs2.setBounds(1146, 77, 133, 20);
		panel2.add(txtCE2Obs2);

		InformacionObligatoriaV informacionObligatoriaV = new InformacionObligatoriaV(865, 325);
		panel2.add(informacionObligatoriaV.getPnlInformacionObl());

		cabecera.getBtnRegistrar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				ServicioInfoObligatoria srvInfoOblig = new ComponenteInfoObligatoria();
				servFicha = new ComponenteFicha();
				infor = cargarInfoObligatoria(informacionObligatoriaV);
				// System.out.println(infor.gettCabe().getCNombreProyecto());

				if (validarInfo(infor)) {
					srvInfoOblig.crear(infor);
					servFicha.insertarFormulario(cargarListas());
				} else {
					JOptionPane.showMessageDialog(null, "Ingresar datos en Información Obligatoria ");
				}
			}
		});

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				new Menu().setVisible(true);
				dispose();
			}
		});
	}

	public LinkedList<LinkedList<TdetalleFicha>> cargarListas() {
		LinkedList<TdetalleFicha> listaElectrico = new LinkedList<>();
		LinkedList<TdetalleFicha> listaAL = new LinkedList<>();
		LinkedList<TdetalleFicha> listaFrontal = new LinkedList<>();
		LinkedList<TdetalleFicha> listaPosterior = new LinkedList<>();
		LinkedList<TdetalleFicha> listaLateralIzquierdo = new LinkedList<>();
		LinkedList<TdetalleFicha> listaLateralDerecha = new LinkedList<>();
		LinkedList<TdetalleFicha> listaElectrico2 = new LinkedList<>();
		LinkedList<TdetalleFicha> listaHidro = new LinkedList<>();
		LinkedList<TdetalleFicha> listaAP = new LinkedList<>();
		LinkedList<TdetalleFicha> listaAR = new LinkedList<>();
		LinkedList<TdetalleFicha> listaEstructural = new LinkedList<>();
		LinkedList<TdetalleFicha> listaPorton = new LinkedList<>();
		LinkedList<TdetalleFicha> listaArquitectonico = new LinkedList<>();
		LinkedList<TdetalleFicha> listaEstructural2 = new LinkedList<>();

		ServicioInfoObligatoria srvInfoObl = new ComponenteInfoObligatoria();
		infor.setIoSerial(srvInfoObl.serialInfoOblMax());

		TGrupo grupoTmp = servFicha.buscarGrupo("Kit eléctrico");
		Integer updateFicha = servFicha.nActualizacionFicha(gettCabecera(), ficha);
		listaElectrico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad01.getText()), txtObs0.getText(), updateFicha));
		listaElectrico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad11.getText()), txtObs1.getText(), updateFicha));
		listaElectrico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad21.getText()), txtObs2.getText(), updateFicha));
		listaElectrico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad31.getText()), txtObs3.getText(), updateFicha));
		listaElectrico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad41.getText()), txtObs4.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Kit agua lluvia");
		listaAL.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad51.getText()), txtObs5.getText(), updateFicha));
		listaAL.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad61.getText()), txtObs6.getText(), updateFicha));
		listaAL.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad71.getText()), txtObs7.getText(), updateFicha));
		listaAL.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad81.getText()), txtObs8.getText(), updateFicha));
		listaAL.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad91.getText()), txtObs9.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Fachada frontal");
		listaFrontal.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad101.getText()), txtObs10.getText(), updateFicha));
		listaFrontal.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad111.getText()), txtObs11.getText(), updateFicha));
		listaFrontal.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad121.getText()), txtObs12.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Fachada posterior");
		listaPosterior.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad131.getText()), txtObs13.getText(), updateFicha));
		listaPosterior.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad141.getText()), txtObs14.getText(), updateFicha));
		listaPosterior.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad151.getText()), txtObs15.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Fachada lateral izquierda");
		listaLateralIzquierdo.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad171.getText()), txtObs17.getText(), updateFicha));
		listaLateralIzquierdo.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad181.getText()), txtObs18.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Fachada Lateral derecha");
		listaLateralDerecha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad191.getText()), txtObs19.getText(), updateFicha));
		listaLateralDerecha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad201.getText()), txtObs20.getText(), updateFicha));
		listaLateralDerecha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad211.getText()), txtObs21.getText(), updateFicha));
		listaLateralDerecha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad221.getText()), txtObs22.getText(), updateFicha));
		listaLateralDerecha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad231.getText()), txtObs23.getText(), updateFicha));
		listaLateralDerecha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad241.getText()), txtObs24.getText(), updateFicha));
		listaLateralDerecha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad251.getText()), txtObs25.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Kit eléctrico");
		listaElectrico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad261.getText()), txtObs26.getText(), updateFicha));
		listaElectrico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad271.getText()), txtObs27.getText(), updateFicha));
		listaElectrico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad281.getText()), txtObs28.getText(), updateFicha));
		listaElectrico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad291.getText()), txtObs29.getText(), updateFicha));
		listaElectrico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad301.getText()), txtObs30.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Kit hidrosanitario");
		listaHidro.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad311.getText()), txtObs31.getText(), updateFicha));
		listaHidro.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad321.getText()), txtObs32.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Kit agua potable");
		listaAP.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad331.getText()), txtObs33.getText(), updateFicha));
		listaAP.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad341.getText()), txtObs34.getText(), updateFicha));
		listaAP.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad351.getText()), txtObs35.getText(), updateFicha));
		listaAP.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad361.getText()), txtObs36.getText(), updateFicha));
		listaAP.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad371.getText()), txtObs37.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Kit agua residual");
		listaAR.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad381.getText()), txtObs38.getText(), updateFicha));
		listaAR.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad391.getText()), txtObs39.getText(), updateFicha));
		listaAR.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad401.getText()), txtObs40.getText(), updateFicha));
		listaAR.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad411.getText()), txtObs41.getText(), updateFicha));
		listaAR.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad421.getText()), txtObs42.getText(), updateFicha));
		listaAR.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad431.getText()), txtObs43.getText(), updateFicha));
		listaAR.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad441.getText()), txtObs44.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Componente estructural");
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad451.getText()), txtObs45.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad461.getText()), txtObs46.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad471.getText()), txtObs47.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad481.getText()), txtObs48.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad491.getText()), txtObs49.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad501.getText()), txtObs50.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad511.getText()), txtObs51.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad521.getText()), txtObs52.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad531.getText()), txtObs53.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad541.getText()), txtObs54.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Portón");
		listaPorton.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad551.getText()), txtObs55.getText(), updateFicha));
		listaPorton.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad56.getText()), txtObs56.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Componente arquitectónico");
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad571.getText()), txtObs57.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad581.getText()), txtObs58.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad21.getText()), txtCAObs2.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad31.getText()), txtCAObs3.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad41.getText()), txtCAObs4.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad51.getText()), txtCAObs5.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad61.getText()), txtCAObs6.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad71.getText()), txtCAObs7.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad81.getText()), txtCAObs8.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad91.getText()), txtCAObs9.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad101.getText()), txtCAObs10.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad111.getText()), txtCAObs11.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad121.getText()), txtCAObs12.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad131.getText()), txtCAObs13.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Componente estructural");
		listaEstructural2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCE2Cantidad01.getText()), txtCE2Obs0.getText(), updateFicha));
		listaEstructural2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCE2Cantidad11.getText()), txtCE2Obs1.getText(), updateFicha));
		listaEstructural2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCE2Cantidad21.getText()), txtCE2Obs2.getText(), updateFicha));

		LinkedList<LinkedList<TdetalleFicha>> listaFormulario = new LinkedList<LinkedList<TdetalleFicha>>();
		listaFormulario.add(listaElectrico);
		listaFormulario.add(listaAL);
		listaFormulario.add(listaFrontal);
		listaFormulario.add(listaPosterior);
		listaFormulario.add(listaLateralIzquierdo);
		listaFormulario.add(listaLateralDerecha);
		listaFormulario.add(listaElectrico2);
		listaFormulario.add(listaHidro);
		listaFormulario.add(listaAP);
		listaFormulario.add(listaAR);
		listaFormulario.add(listaEstructural);
		listaFormulario.add(listaPorton);
		listaFormulario.add(listaArquitectonico);
		listaFormulario.add(listaEstructural2);

		return listaFormulario;
	}
}
