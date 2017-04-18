package com.capa.presentacion;

import static com.capa.negocios.Calculos.calcularPorcentajeAvance;
import static com.capa.util.Utilitarios.cargarInfoObligatoria;
import static com.capa.util.Utilitarios.gettCabecera;
import static com.capa.util.Utilitarios.llenarCabecera;
import static com.capa.util.Validaciones.*;
import static com.capa.util.Constantes.*;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.capa.datos.TFicha;
import com.capa.datos.TGrupo;
import com.capa.datos.TInformacionObligatoria;
import com.capa.datos.TdetalleFicha;
import com.capa.negocios.ComponenteFicha;
import com.capa.negocios.ComponenteInfoObligatoria;
import com.capa.negocios.Query;
import com.capa.negocios.Reporte;
import com.capa.negocios.ServicioFicha;
import com.capa.negocios.ServicioInfoObligatoria;
import com.capa.util.Utilitarios;
import com.capa.util.Validaciones;

public class PGTemplate extends JFrame {

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
	private JTextField txtCantidad240;
	private JTextField txtCantidad241;
	private JTextField txtCantidad231;
	private JTextField txtCantidad230;
	private JTextField txtCantidad220;
	private JTextField txtCantidad221;
	private JTextField txtCantidad211;
	private JTextField txtCantidad210;
	private JTextField txtCantidad200;
	private JTextField txtCantidad190;
	private JTextField txtCantidad180;
	private JTextField txtCantidad181;
	private JTextField txtCantidad191;
	private JTextField txtCantidad201;
	private JTextField txtObs18;
	private JTextField txtObs19;
	private JTextField txtObs20;
	private JTextField txtObs21;
	private JTextField txtObs22;
	private JTextField txtObs23;
	private JTextField txtObs24;
	private JLabel lblFachadaLateralIzquierda_1;
	private JLabel lblPanelEpsPared;
	private JLabel lblPanelEpsPared_1;
	private JTextField txtCantidad170;
	private JTextField txtCantidad160;
	private JLabel label_33;
	private JTextField txtCantidad161;
	private JTextField txtCantidad171;
	private JTextField txtObs17;
	private JTextField txtObs16;
	private JLabel label_34;
	private JLabel label_17;
	private JLabel lblLuminariasLed;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel lblKitCableElctrico;
	private JLabel label_26;
	private JTextField txtCantidad290;
	private JTextField txtCantidad280;
	private JTextField txtCantidad270;
	private JTextField txtCantidad260;
	private JTextField txtCantidad250;
	private JLabel label_27;
	private JTextField txtCantidad251;
	private JTextField txtCantidad261;
	private JTextField txtCantidad271;
	private JTextField txtCantidad281;
	private JTextField txtCantidad291;
	private JTextField txtObs29;
	private JTextField txtObs28;
	private JTextField txtObs27;
	private JTextField txtObs26;
	private JTextField txtObs25;
	private JLabel label_28;
	private JLabel lblKitHidrosanitario;
	private JLabel lblInodoros;
	private JLabel lblLava;
	private JTextField txtCantidad310;
	private JTextField txtCantidad300;
	private JLabel label_32;
	private JTextField txtCantidad301;
	private JTextField txtCantidad311;
	private JTextField txtObs31;
	private JTextField txtObs30;
	private JLabel label_35;
	private JLabel lblKitAguaPotable;
	private JLabel label_25;
	private JLabel label_31;
	private JTextField txtCantidad320;
	private JTextField txtCantidad321;
	private JTextField txtObs32;
	private JLabel label_36;
	private JLabel label_18;
	private JTextField txtCantidad330;
	private JTextField txtCantidad331;
	private JTextField txtObs33;
	private JLabel lblTuberaDePvc;
	private JTextField txtCantidad340;
	private JTextField txtCantidad341;
	private JTextField txtObs34;
	private JLabel lblTuberaDePvc_1;
	private JTextField txtCantidad350;
	private JTextField txtCantidad351;
	private JTextField txtObs35;
	private JLabel lblkitParaConexin;
	private JTextField txtCantidad360;
	private JTextField txtCantidad361;
	private JTextField txtObs36;
	private JLabel label_37;
	private JLabel lblkitDeAccesorios;
	private JLabel lblTuberaDemm;
	private JLabel lblkitDeAccesorios_1;
	private JLabel label_41;
	private JLabel lblTuberaDePvc_2;
	private JLabel lblkitParaConexin_1;
	private JLabel lblkitParaConexin_2;
	private JTextField txtCantidad430;
	private JTextField txtCantidad431;
	private JTextField txtCantidad420;
	private JTextField txtCantidad421;
	private JTextField txtCantidad411;
	private JTextField txtCantidad410;
	private JTextField txtCantidad400;
	private JTextField txtCantidad401;
	private JTextField txtCantidad391;
	private JTextField txtCantidad390;
	private JTextField txtCantidad380;
	private JTextField txtCantidad370;
	private JTextField txtCantidad371;
	private JTextField txtCantidad381;
	private JLabel label_45;
	private JLabel label_46;
	private JTextField txtObs37;
	private JTextField txtObs38;
	private JTextField txtObs39;
	private JTextField txtObs40;
	private JTextField txtObs41;
	private JTextField txtObs42;
	private JTextField txtObs43;
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
	private JTextField txtCantidad530;
	private JTextField txtCantidad520;
	private JTextField txtCantidad510;
	private JTextField txtCantidad500;
	private JTextField txtCantidad490;
	private JTextField txtCantidad480;
	private JTextField txtCantidad470;
	private JTextField txtCantidad460;
	private JTextField txtCantidad450;
	private JTextField txtCantidad440;
	private JTextField txtCantidad441;
	private JTextField txtCantidad451;
	private JTextField txtCantidad461;
	private JTextField txtCantidad471;
	private JTextField txtCantidad481;
	private JTextField txtCantidad491;
	private JTextField txtCantidad501;
	private JTextField txtCantidad511;
	private JTextField txtCantidad521;
	private JTextField txtCantidad531;
	private JTextField txtObs53;
	private JTextField txtObs52;
	private JTextField txtObs51;
	private JTextField txtObs50;
	private JTextField txtObs49;
	private JTextField txtObs48;
	private JTextField txtObs47;
	private JTextField txtObs46;
	private JTextField txtObs45;
	private JTextField txtObs44;
	private JLabel lblPortn;
	private JLabel lblLuminariasDePared;
	private JTextField txtCantidad540;
	private JLabel label_50;
	private JTextField txtCantidad541;
	private JTextField txtObs54;
	private JLabel label_51;
	private JLabel lblElementoPortn;
	private JTextField txtCantidad550;
	private JTextField txtCantidad551;
	private JTextField txtObs55;
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
	private JTextField txtCantidad670;
	private JTextField txtCantidad660;
	private JTextField txtCantidad650;
	private JTextField txtCantidad640;
	private JTextField txtCantidad630;
	private JTextField txtCantidad620;
	private JTextField txtCantidad610;
	private JTextField txtCantidad600;
	private JTextField txtCantidad590;
	private JTextField txtCantidad580;
	private JTextField txtCantidad570;
	private JTextField txtCantidad560;
	private JLabel label_63;
	private JTextField txtCantidad561;
	private JTextField txtCantidad571;
	private JTextField txtCantidad581;
	private JTextField txtCantidad591;
	private JTextField txtCantidad601;
	private JTextField txtCantidad611;
	private JTextField txtCantidad621;
	private JTextField txtCantidad631;
	private JTextField txtCantidad641;
	private JTextField txtCantidad651;
	private JTextField txtCantidad661;
	private JTextField txtCantidad671;
	private JTextField txtObs67;
	private JTextField txtObs66;
	private JTextField txtObs65;
	private JTextField txtObs64;
	private JTextField txtObs63;
	private JTextField txtObs62;
	private JTextField txtObs61;
	private JTextField txtObs60;
	private JTextField txtObs59;
	private JTextField txtObs58;
	private JTextField txtObs57;
	private JTextField txtObs56;
	private JLabel label_64;
	private JLabel lblPanelesEpsPared_17;
	private JTextField txtCantidad680;
	private JTextField txtCantidad681;
	private JTextField txtObs68;
	private JLabel lblPanelesEpsPared_18;
	private JTextField txtCantidad690;
	private JTextField txtCantidad691;
	private JTextField txtObs69;
	private JLabel lblComponenteEstructural;
	private JLabel lblDadoCimentacinPortn;
	private JLabel lblPerfilSfTipo_5;
	private JTextField txtCantidad700;
	private JLabel label_53;
	private JTextField txtCantidad701;
	private JTextField txtCantidad711;
	private JTextField txtCantidad710;
	private JTextField txtObs71;
	private JTextField txtObs70;
	private JLabel label_54;
	private JLabel lblPerfilSfTipo_6;
	private JTextField txtCantidad720;
	private JTextField txtCantidad721;
	private JTextField txtObs72;
	private JTextField txtObs2;

	TInformacionObligatoria infor;
	TFicha ficha;
	ServicioFicha servFicha;
	private JTextField txtObs73;
	private JTextField txtCantidad731;
	private JTextField txtCantidad730;
	private JTextField txtCantidad740;
	private JTextField txtCantidad750;
	private JTextField txtCantidad741;
	private JTextField txtCantidad751;
	private JTextField txtObs75;
	private JTextField txtObs74;
	private JLabel lblventanaPvcCon;
	private JTextField txtCantidad760;
	private JTextField txtCantidad761;
	private JTextField txtObs76;
	private JLabel lblPerfilMetlicoSf;
	private JTextField txtCantidad770;
	private JTextField txtCantidad771;
	private JTextField txtObs77;
	private JLabel lblPerfilSfMasf;
	private JTextField txtCantidad780;
	private JTextField txtCantidad781;
	private JTextField txtObs78;
	private ServicioInfoObligatoria srvInfoOblig = new ComponenteInfoObligatoria();
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

	public PGTemplate(TFicha ficha) {

		setTitle(ficha.getFiNombre());
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1320, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.ficha = ficha;
		this.setTitle(ficha.getFiNombre());
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());
		setContentPane(contentPane);
		contentPane.setLayout(null);

		servFicha = new ComponenteFicha();

		llenarCabecera(cabecera);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 122, 1294, 569);
		contentPane.add(tabbedPane);

		String textoLabel31 = "<html><body>Kit de Accesorios de Conexi\u00F3n Agua<br>Potable (Inodoros)(1 te reducciones 1-1/2,<br>1 neplos,1 uniones de 1/2,1 codos de<br>"
				+ "90\u00B0,1 mangueras de abasto,1 llave de<br>paso , 1 rollo tefl\u00F3n, 1/2 tubos de pasta<br>selladora)</body></html>";

		String textoLabel18 = "<html><body>Potable (Lavabos)(1  te 1/2\"  ,  1 neplos,1<br>uni�n de 1/2,1 codo de 90\u00B0,1 manguera de<br>abasto,1 llave de paso, tefl�n, pasta<br>"
				+ "selladora)</body></html>";

		JPanel panel1 = new JPanel();
		tabbedPane.addTab("1.- " + ficha.getFiDescripcion(), null, panel1, null);
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
		txtCantidad40.setText("2");
		txtCantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad40.setEditable(false);
		txtCantidad40.setColumns(10);
		txtCantidad40.setBounds(203, 131, 35, 20);
		panel1.add(txtCantidad40);

		txtCantidad41 = new JTextField();
		txtCantidad41.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad41.setColumns(10);
		txtCantidad41.setBounds(240, 131, 35, 20);
		panel1.add(txtCantidad41);

		txtCantidad31 = new JTextField();
		txtCantidad31.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad31.setColumns(10);
		txtCantidad31.setBounds(240, 109, 35, 20);
		panel1.add(txtCantidad31);

		txtCantidad30 = new JTextField();
		txtCantidad30.setText("2");
		txtCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad30.setEditable(false);
		txtCantidad30.setColumns(10);
		txtCantidad30.setBounds(203, 109, 35, 20);
		panel1.add(txtCantidad30);

		txtCantidad20 = new JTextField();
		txtCantidad20.setText("2");
		txtCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad20.setEditable(false);
		txtCantidad20.setColumns(10);
		txtCantidad20.setBounds(203, 87, 35, 20);
		panel1.add(txtCantidad20);

		txtCantidad21 = new JTextField();
		txtCantidad21.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad21.setColumns(10);
		txtCantidad21.setBounds(240, 87, 35, 20);
		panel1.add(txtCantidad21);

		txtCantidad11 = new JTextField();
		txtCantidad11.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad11.setColumns(10);
		txtCantidad11.setBounds(240, 65, 35, 20);
		panel1.add(txtCantidad11);

		txtCantidad10 = new JTextField();
		txtCantidad10.setText("2");
		txtCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad10.setEditable(false);
		txtCantidad10.setColumns(10);
		txtCantidad10.setBounds(203, 65, 35, 20);
		panel1.add(txtCantidad10);

		txtCantidad00 = new JTextField();
		txtCantidad00.setText("2");
		txtCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad00.setEditable(false);
		txtCantidad00.setColumns(10);
		txtCantidad00.setBounds(203, 43, 35, 20);
		panel1.add(txtCantidad00);

		txtCantidad01 = new JTextField();
		txtCantidad01.setHorizontalAlignment(SwingConstants.CENTER);
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
		label_8.setBounds(36, 159, 139, 14);
		panel1.add(label_8);

		JLabel label_9 = new JLabel("Canal pl\u00E1stico PVC de L=3m");
		label_9.setHorizontalAlignment(SwingConstants.LEFT);
		label_9.setFont(new Font("Arial", Font.PLAIN, 11));
		label_9.setBounds(7, 184, 183, 14);
		panel1.add(label_9);

		JLabel label_10 = new JLabel(
				"<html><body>Kit de Accesorios de Conexi\u00F3n Agua de<br>Lluvia (2 rejilla, 4 codos 90\u00B0,1/4 gl<br>polipega, tornillos, abrazaderas</body></html>)");
		label_10.setHorizontalAlignment(SwingConstants.LEFT);
		label_10.setFont(new Font("Arial", Font.PLAIN, 11));
		label_10.setBounds(7, 203, 203, 56);
		panel1.add(label_10);

		JLabel label_11 = new JLabel("Tuber\u00EDa de PVC 75 mm L=3m");
		label_11.setHorizontalAlignment(SwingConstants.LEFT);
		label_11.setFont(new Font("Arial", Font.PLAIN, 11));
		label_11.setBounds(7, 261, 183, 14);
		panel1.add(label_11);

		JLabel label_12 = new JLabel("Tuber\u00EDa de PVC 75 mm L=0.6m");
		label_12.setHorizontalAlignment(SwingConstants.LEFT);
		label_12.setFont(new Font("Arial", Font.PLAIN, 11));
		label_12.setBounds(7, 283, 183, 14);
		panel1.add(label_12);

		JLabel label_13 = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 75 mm. (lija<br>pliego, polipega 1/4gal,1 codo 90\u00B0)</body></html>");
		label_13.setHorizontalAlignment(SwingConstants.LEFT);
		label_13.setFont(new Font("Arial", Font.PLAIN, 11));
		label_13.setBounds(7, 305, 203, 39);
		panel1.add(label_13);

		txtCantidad90 = new JTextField();
		txtCantidad90.setText("1");
		txtCantidad90.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad90.setEditable(false);
		txtCantidad90.setColumns(10);
		txtCantidad90.setBounds(200, 313, 35, 20);
		panel1.add(txtCantidad90);

		txtCantidad91 = new JTextField();
		txtCantidad91.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad91.setColumns(10);
		txtCantidad91.setBounds(237, 313, 35, 20);
		panel1.add(txtCantidad91);

		txtObs9 = new JTextField();
		txtObs9.setColumns(10);
		txtObs9.setBounds(275, 313, 133, 20);
		panel1.add(txtObs9);

		txtObs8 = new JTextField();
		txtObs8.setColumns(10);
		txtObs8.setBounds(275, 277, 133, 20);
		panel1.add(txtObs8);

		txtCantidad81 = new JTextField();
		txtCantidad81.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad81.setColumns(10);
		txtCantidad81.setBounds(237, 277, 35, 20);
		panel1.add(txtCantidad81);

		txtCantidad80 = new JTextField();
		txtCantidad80.setText("1");
		txtCantidad80.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad80.setEditable(false);
		txtCantidad80.setColumns(10);
		txtCantidad80.setBounds(200, 277, 35, 20);
		panel1.add(txtCantidad80);

		txtCantidad70 = new JTextField();
		txtCantidad70.setText("1");
		txtCantidad70.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad70.setEditable(false);
		txtCantidad70.setColumns(10);
		txtCantidad70.setBounds(200, 255, 35, 20);
		panel1.add(txtCantidad70);

		txtCantidad71 = new JTextField();
		txtCantidad71.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad71.setColumns(10);
		txtCantidad71.setBounds(237, 255, 35, 20);
		panel1.add(txtCantidad71);

		txtCantidad61 = new JTextField();
		txtCantidad61.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad61.setColumns(10);
		txtCantidad61.setBounds(237, 224, 35, 20);
		panel1.add(txtCantidad61);

		txtCantidad60 = new JTextField();
		txtCantidad60.setText("1");
		txtCantidad60.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad60.setEditable(false);
		txtCantidad60.setColumns(10);
		txtCantidad60.setBounds(200, 224, 35, 20);
		panel1.add(txtCantidad60);

		txtCantidad50 = new JTextField();
		txtCantidad50.setText("1");
		txtCantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad50.setEditable(false);
		txtCantidad50.setColumns(10);
		txtCantidad50.setBounds(200, 181, 35, 20);
		panel1.add(txtCantidad50);

		txtCantidad51 = new JTextField();
		txtCantidad51.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad51.setColumns(10);
		txtCantidad51.setBounds(237, 181, 35, 20);
		panel1.add(txtCantidad51);

		JLabel label_14 = new JLabel("Cantidad");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Arial", Font.BOLD, 11));
		label_14.setBounds(203, 159, 63, 14);
		panel1.add(label_14);

		JLabel label_15 = new JLabel("Observaci\u00F3n/Referencia");
		label_15.setHorizontalAlignment(SwingConstants.LEFT);
		label_15.setFont(new Font("Arial", Font.BOLD, 11));
		label_15.setBounds(276, 159, 139, 14);
		panel1.add(label_15);

		txtObs5 = new JTextField();
		txtObs5.setColumns(10);
		txtObs5.setBounds(275, 181, 133, 20);
		panel1.add(txtObs5);

		txtObs6 = new JTextField();
		txtObs6.setColumns(10);
		txtObs6.setBounds(275, 224, 133, 20);
		panel1.add(txtObs6);

		txtObs7 = new JTextField();
		txtObs7.setColumns(10);
		txtObs7.setBounds(275, 255, 133, 20);
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
		txtCantidad110.setText("1");
		txtCantidad110.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad110.setEditable(false);
		txtCantidad110.setColumns(10);
		txtCantidad110.setBounds(624, 62, 35, 20);
		panel1.add(txtCantidad110);

		txtCantidad100 = new JTextField();
		txtCantidad100.setText("1");
		txtCantidad100.setHorizontalAlignment(SwingConstants.CENTER);
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
		txtCantidad101.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad101.setColumns(10);
		txtCantidad101.setBounds(661, 40, 35, 20);
		panel1.add(txtCantidad101);

		txtCantidad111 = new JTextField();
		txtCantidad111.setHorizontalAlignment(SwingConstants.CENTER);
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
		txtCantidad120.setText("1");
		txtCantidad120.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad120.setEditable(false);
		txtCantidad120.setColumns(10);
		txtCantidad120.setBounds(624, 84, 35, 20);
		panel1.add(txtCantidad120);

		txtCantidad121 = new JTextField();
		txtCantidad121.setHorizontalAlignment(SwingConstants.CENTER);
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
		txtCantidad150.setText("1");
		txtCantidad150.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad150.setEditable(false);
		txtCantidad150.setColumns(10);
		txtCantidad150.setBounds(624, 194, 35, 20);
		panel1.add(txtCantidad150);

		txtCantidad140 = new JTextField();
		txtCantidad140.setText("1");
		txtCantidad140.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad140.setEditable(false);
		txtCantidad140.setColumns(10);
		txtCantidad140.setBounds(624, 172, 35, 20);
		panel1.add(txtCantidad140);

		txtCantidad130 = new JTextField();
		txtCantidad130.setText("1");
		txtCantidad130.setHorizontalAlignment(SwingConstants.CENTER);
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
		txtCantidad131.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad131.setColumns(10);
		txtCantidad131.setBounds(661, 150, 35, 20);
		panel1.add(txtCantidad131);

		txtCantidad141 = new JTextField();
		txtCantidad141.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad141.setColumns(10);
		txtCantidad141.setBounds(661, 172, 35, 20);
		panel1.add(txtCantidad141);

		txtCantidad151 = new JTextField();
		txtCantidad151.setHorizontalAlignment(SwingConstants.CENTER);
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

		txtCantidad240 = new JTextField();
		txtCantidad240.setText("1");
		txtCantidad240.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad240.setEditable(false);
		txtCantidad240.setColumns(10);
		txtCantidad240.setBounds(624, 473, 35, 20);
		panel1.add(txtCantidad240);

		txtCantidad241 = new JTextField();
		txtCantidad241.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad241.setColumns(10);
		txtCantidad241.setBounds(661, 473, 35, 20);
		panel1.add(txtCantidad241);

		txtCantidad231 = new JTextField();
		txtCantidad231.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad231.setColumns(10);
		txtCantidad231.setBounds(661, 451, 35, 20);
		panel1.add(txtCantidad231);

		txtCantidad230 = new JTextField();
		txtCantidad230.setText("3");
		txtCantidad230.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad230.setEditable(false);
		txtCantidad230.setColumns(10);
		txtCantidad230.setBounds(624, 451, 35, 20);
		panel1.add(txtCantidad230);

		txtCantidad220 = new JTextField();
		txtCantidad220.setText("39");
		txtCantidad220.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad220.setEditable(false);
		txtCantidad220.setColumns(10);
		txtCantidad220.setBounds(624, 429, 35, 20);
		panel1.add(txtCantidad220);

		txtCantidad221 = new JTextField();
		txtCantidad221.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad221.setColumns(10);
		txtCantidad221.setBounds(661, 429, 35, 20);
		panel1.add(txtCantidad221);

		txtCantidad211 = new JTextField();
		txtCantidad211.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad211.setColumns(10);
		txtCantidad211.setBounds(661, 407, 35, 20);
		panel1.add(txtCantidad211);

		txtCantidad210 = new JTextField();
		txtCantidad210.setText("1");
		txtCantidad210.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad210.setEditable(false);
		txtCantidad210.setColumns(10);
		txtCantidad210.setBounds(624, 407, 35, 20);
		panel1.add(txtCantidad210);

		txtCantidad200 = new JTextField();
		txtCantidad200.setText("1");
		txtCantidad200.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad200.setEditable(false);
		txtCantidad200.setColumns(10);
		txtCantidad200.setBounds(624, 385, 35, 20);
		panel1.add(txtCantidad200);

		txtCantidad190 = new JTextField();
		txtCantidad190.setText("1");
		txtCantidad190.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad190.setEditable(false);
		txtCantidad190.setColumns(10);
		txtCantidad190.setBounds(624, 363, 35, 20);
		panel1.add(txtCantidad190);

		txtCantidad180 = new JTextField();
		txtCantidad180.setText("1");
		txtCantidad180.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad180.setEditable(false);
		txtCantidad180.setColumns(10);
		txtCantidad180.setBounds(624, 341, 35, 20);
		panel1.add(txtCantidad180);

		JLabel label_29 = new JLabel("Cantidad");
		label_29.setHorizontalAlignment(SwingConstants.CENTER);
		label_29.setFont(new Font("Arial", Font.BOLD, 11));
		label_29.setBounds(634, 319, 63, 14);
		panel1.add(label_29);

		txtCantidad181 = new JTextField();
		txtCantidad181.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad181.setColumns(10);
		txtCantidad181.setBounds(661, 341, 35, 20);
		panel1.add(txtCantidad181);

		txtCantidad191 = new JTextField();
		txtCantidad191.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad191.setColumns(10);
		txtCantidad191.setBounds(661, 363, 35, 20);
		panel1.add(txtCantidad191);

		txtCantidad201 = new JTextField();
		txtCantidad201.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad201.setColumns(10);
		txtCantidad201.setBounds(661, 385, 35, 20);
		panel1.add(txtCantidad201);

		JLabel label_30 = new JLabel("Observaci\u00F3n/Referencia");
		label_30.setHorizontalAlignment(SwingConstants.LEFT);
		label_30.setFont(new Font("Arial", Font.BOLD, 11));
		label_30.setBounds(700, 319, 139, 14);
		panel1.add(label_30);

		txtObs18 = new JTextField();
		txtObs18.setColumns(10);
		txtObs18.setBounds(700, 341, 133, 20);
		panel1.add(txtObs18);

		txtObs19 = new JTextField();
		txtObs19.setColumns(10);
		txtObs19.setBounds(700, 363, 133, 20);
		panel1.add(txtObs19);

		txtObs20 = new JTextField();
		txtObs20.setColumns(10);
		txtObs20.setBounds(700, 385, 133, 20);
		panel1.add(txtObs20);

		txtObs21 = new JTextField();
		txtObs21.setColumns(10);
		txtObs21.setBounds(700, 407, 133, 20);
		panel1.add(txtObs21);

		txtObs22 = new JTextField();
		txtObs22.setColumns(10);
		txtObs22.setBounds(700, 429, 133, 20);
		panel1.add(txtObs22);

		txtObs23 = new JTextField();
		txtObs23.setColumns(10);
		txtObs23.setBounds(700, 451, 133, 20);
		panel1.add(txtObs23);

		txtObs24 = new JTextField();
		txtObs24.setColumns(10);
		txtObs24.setBounds(700, 473, 133, 20);
		panel1.add(txtObs24);

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

		txtCantidad170 = new JTextField();
		txtCantidad170.setText("1");
		txtCantidad170.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad170.setEditable(false);
		txtCantidad170.setColumns(10);
		txtCantidad170.setBounds(624, 283, 35, 20);
		panel1.add(txtCantidad170);

		txtCantidad160 = new JTextField();
		txtCantidad160.setText("1");
		txtCantidad160.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad160.setEditable(false);
		txtCantidad160.setColumns(10);
		txtCantidad160.setBounds(624, 261, 35, 20);
		panel1.add(txtCantidad160);

		label_33 = new JLabel("Cantidad");
		label_33.setHorizontalAlignment(SwingConstants.CENTER);
		label_33.setFont(new Font("Arial", Font.BOLD, 11));
		label_33.setBounds(627, 239, 63, 14);
		panel1.add(label_33);

		txtCantidad161 = new JTextField();
		txtCantidad161.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad161.setColumns(10);
		txtCantidad161.setBounds(661, 261, 35, 20);
		panel1.add(txtCantidad161);

		txtCantidad171 = new JTextField();
		txtCantidad171.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad171.setColumns(10);
		txtCantidad171.setBounds(661, 283, 35, 20);
		panel1.add(txtCantidad171);

		txtObs17 = new JTextField();
		txtObs17.setColumns(10);
		txtObs17.setBounds(700, 283, 133, 20);
		panel1.add(txtObs17);

		txtObs16 = new JTextField();
		txtObs16.setColumns(10);
		txtObs16.setBounds(700, 261, 133, 20);
		panel1.add(txtObs16);

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

		txtCantidad290 = new JTextField();
		txtCantidad290.setText("1");
		txtCantidad290.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad290.setEditable(false);
		txtCantidad290.setColumns(10);
		txtCantidad290.setBounds(1062, 131, 35, 20);
		panel1.add(txtCantidad290);

		txtCantidad280 = new JTextField();
		txtCantidad280.setText("1");
		txtCantidad280.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad280.setEditable(false);
		txtCantidad280.setColumns(10);
		txtCantidad280.setBounds(1062, 109, 35, 20);
		panel1.add(txtCantidad280);

		txtCantidad270 = new JTextField();
		txtCantidad270.setText("1");
		txtCantidad270.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad270.setEditable(false);
		txtCantidad270.setColumns(10);
		txtCantidad270.setBounds(1062, 87, 35, 20);
		panel1.add(txtCantidad270);

		txtCantidad260 = new JTextField();
		txtCantidad260.setText("1");
		txtCantidad260.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad260.setEditable(false);
		txtCantidad260.setColumns(10);
		txtCantidad260.setBounds(1062, 65, 35, 20);
		panel1.add(txtCantidad260);

		txtCantidad250 = new JTextField();
		txtCantidad250.setText("1");
		txtCantidad250.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad250.setEditable(false);
		txtCantidad250.setColumns(10);
		txtCantidad250.setBounds(1062, 43, 35, 20);
		panel1.add(txtCantidad250);

		label_27 = new JLabel("Cantidad");
		label_27.setHorizontalAlignment(SwingConstants.CENTER);
		label_27.setFont(new Font("Arial", Font.BOLD, 11));
		label_27.setBounds(1065, 21, 63, 14);
		panel1.add(label_27);

		txtCantidad251 = new JTextField();
		txtCantidad251.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad251.setColumns(10);
		txtCantidad251.setBounds(1099, 43, 35, 20);
		panel1.add(txtCantidad251);

		txtCantidad261 = new JTextField();
		txtCantidad261.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad261.setColumns(10);
		txtCantidad261.setBounds(1099, 65, 35, 20);
		panel1.add(txtCantidad261);

		txtCantidad271 = new JTextField();
		txtCantidad271.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad271.setColumns(10);
		txtCantidad271.setBounds(1099, 87, 35, 20);
		panel1.add(txtCantidad271);

		txtCantidad281 = new JTextField();
		txtCantidad281.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad281.setColumns(10);
		txtCantidad281.setBounds(1099, 109, 35, 20);
		panel1.add(txtCantidad281);

		txtCantidad291 = new JTextField();
		txtCantidad291.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad291.setColumns(10);
		txtCantidad291.setBounds(1099, 131, 35, 20);
		panel1.add(txtCantidad291);

		txtObs29 = new JTextField();
		txtObs29.setColumns(10);
		txtObs29.setBounds(1138, 131, 133, 20);
		panel1.add(txtObs29);

		txtObs28 = new JTextField();
		txtObs28.setColumns(10);
		txtObs28.setBounds(1138, 109, 133, 20);
		panel1.add(txtObs28);

		txtObs27 = new JTextField();
		txtObs27.setColumns(10);
		txtObs27.setBounds(1138, 87, 133, 20);
		panel1.add(txtObs27);

		txtObs26 = new JTextField();
		txtObs26.setColumns(10);
		txtObs26.setBounds(1138, 65, 133, 20);
		panel1.add(txtObs26);

		txtObs25 = new JTextField();
		txtObs25.setColumns(10);
		txtObs25.setBounds(1138, 43, 133, 20);
		panel1.add(txtObs25);

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

		txtCantidad310 = new JTextField();
		txtCantidad310.setText("1");
		txtCantidad310.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad310.setEditable(false);
		txtCantidad310.setColumns(10);
		txtCantidad310.setBounds(1062, 200, 35, 20);
		panel1.add(txtCantidad310);

		txtCantidad300 = new JTextField();
		txtCantidad300.setText("1");
		txtCantidad300.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad300.setEditable(false);
		txtCantidad300.setColumns(10);
		txtCantidad300.setBounds(1062, 178, 35, 20);
		panel1.add(txtCantidad300);

		label_32 = new JLabel("Cantidad");
		label_32.setHorizontalAlignment(SwingConstants.CENTER);
		label_32.setFont(new Font("Arial", Font.BOLD, 11));
		label_32.setBounds(1065, 156, 63, 14);
		panel1.add(label_32);

		txtCantidad301 = new JTextField();
		txtCantidad301.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad301.setColumns(10);
		txtCantidad301.setBounds(1099, 178, 35, 20);
		panel1.add(txtCantidad301);

		txtCantidad311 = new JTextField();
		txtCantidad311.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad311.setColumns(10);
		txtCantidad311.setBounds(1099, 200, 35, 20);
		panel1.add(txtCantidad311);

		txtObs31 = new JTextField();
		txtObs31.setColumns(10);
		txtObs31.setBounds(1138, 200, 133, 20);
		panel1.add(txtObs31);

		txtObs30 = new JTextField();
		txtObs30.setColumns(10);
		txtObs30.setBounds(1138, 178, 133, 20);
		panel1.add(txtObs30);

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

		txtCantidad320 = new JTextField();
		txtCantidad320.setText("1");
		txtCantidad320.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad320.setEditable(false);
		txtCantidad320.setColumns(10);
		txtCantidad320.setBounds(1061, 291, 35, 20);
		panel1.add(txtCantidad320);

		txtCantidad321 = new JTextField();
		txtCantidad321.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad321.setColumns(10);
		txtCantidad321.setBounds(1098, 291, 35, 20);
		panel1.add(txtCantidad321);

		txtObs32 = new JTextField();
		txtObs32.setColumns(10);
		txtObs32.setBounds(1137, 291, 133, 20);
		panel1.add(txtObs32);

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

		txtCantidad330 = new JTextField();
		txtCantidad330.setText("1");
		txtCantidad330.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad330.setEditable(false);
		txtCantidad330.setColumns(10);
		txtCantidad330.setBounds(1062, 363, 35, 20);
		panel1.add(txtCantidad330);

		txtCantidad331 = new JTextField();
		txtCantidad331.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad331.setColumns(10);
		txtCantidad331.setBounds(1099, 363, 35, 20);
		panel1.add(txtCantidad331);

		txtObs33 = new JTextField();
		txtObs33.setColumns(10);
		txtObs33.setBounds(1138, 363, 133, 20);
		panel1.add(txtObs33);

		lblTuberaDePvc = new JLabel("Tuber\u00EDa de PVC 1/2\" y L=3m");
		lblTuberaDePvc.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberaDePvc.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberaDePvc.setBounds(849, 416, 183, 14);
		panel1.add(lblTuberaDePvc);

		txtCantidad340 = new JTextField();
		txtCantidad340.setText("1");
		txtCantidad340.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad340.setEditable(false);
		txtCantidad340.setColumns(10);
		txtCantidad340.setBounds(1062, 413, 35, 20);
		panel1.add(txtCantidad340);

		txtCantidad341 = new JTextField();
		txtCantidad341.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad341.setColumns(10);
		txtCantidad341.setBounds(1099, 413, 35, 20);
		panel1.add(txtCantidad341);

		txtObs34 = new JTextField();
		txtObs34.setColumns(10);
		txtObs34.setBounds(1138, 413, 133, 20);
		panel1.add(txtObs34);

		lblTuberaDePvc_1 = new JLabel("Tuber\u00EDa de PVC 3/4\" y L=3m");
		lblTuberaDePvc_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberaDePvc_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberaDePvc_1.setBounds(849, 438, 183, 14);
		panel1.add(lblTuberaDePvc_1);

		txtCantidad350 = new JTextField();
		txtCantidad350.setText("1");
		txtCantidad350.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad350.setEditable(false);
		txtCantidad350.setColumns(10);
		txtCantidad350.setBounds(1062, 435, 35, 20);
		panel1.add(txtCantidad350);

		txtCantidad351 = new JTextField();
		txtCantidad351.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad351.setColumns(10);
		txtCantidad351.setBounds(1099, 435, 35, 20);
		panel1.add(txtCantidad351);

		txtObs35 = new JTextField();
		txtObs35.setColumns(10);
		txtObs35.setBounds(1138, 435, 133, 20);
		panel1.add(txtObs35);

		lblkitParaConexin = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 1/2\". (lija<br>pliego, polipega 1/4gal,1 uni\u00F3n)</body></html>");
		lblkitParaConexin.setHorizontalAlignment(SwingConstants.LEFT);
		lblkitParaConexin.setFont(new Font("Arial", Font.PLAIN, 11));
		lblkitParaConexin.setBounds(849, 463, 203, 39);
		panel1.add(lblkitParaConexin);

		txtCantidad360 = new JTextField();
		txtCantidad360.setText("1");
		txtCantidad360.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad360.setEditable(false);
		txtCantidad360.setColumns(10);
		txtCantidad360.setBounds(1062, 471, 35, 20);
		panel1.add(txtCantidad360);

		txtCantidad361 = new JTextField();
		txtCantidad361.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad361.setColumns(10);
		txtCantidad361.setBounds(1099, 471, 35, 20);
		panel1.add(txtCantidad361);

		txtObs36 = new JTextField();
		txtObs36.setColumns(10);
		txtObs36.setBounds(1138, 471, 133, 20);
		panel1.add(txtObs36);

		JLabel lblComponenteArquitectnico_1 = new JLabel("COMPONENTE ARQUITECTÓNICO");
		lblComponenteArquitectnico_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblComponenteArquitectnico_1.setFont(new Font("Arial", Font.BOLD, 11));
		lblComponenteArquitectnico_1.setBounds(10, 362, 203, 14);
		panel1.add(lblComponenteArquitectnico_1);

		JLabel label_49 = new JLabel("Cantidad");
		label_49.setHorizontalAlignment(SwingConstants.CENTER);
		label_49.setFont(new Font("Arial", Font.BOLD, 11));
		label_49.setBounds(206, 362, 63, 14);
		panel1.add(label_49);

		JLabel label_52 = new JLabel("Observación/Referencia");
		label_52.setHorizontalAlignment(SwingConstants.LEFT);
		label_52.setFont(new Font("Arial", Font.BOLD, 11));
		label_52.setBounds(279, 362, 139, 14);
		panel1.add(label_52);

		txtObs73 = new JTextField();
		txtObs73.setText((String) null);
		txtObs73.setColumns(10);
		txtObs73.setBounds(278, 384, 133, 20);
		panel1.add(txtObs73);

		txtCantidad731 = new JTextField();
		txtCantidad731.setText((String) null);
		txtCantidad731.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad731.setColumns(10);
		txtCantidad731.setBounds(240, 384, 35, 20);
		panel1.add(txtCantidad731);

		txtCantidad730 = new JTextField();
		txtCantidad730.setText("1");
		txtCantidad730.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad730.setEditable(false);
		txtCantidad730.setColumns(10);
		txtCantidad730.setBounds(203, 384, 35, 20);
		panel1.add(txtCantidad730);

		txtCantidad740 = new JTextField();
		txtCantidad740.setText("6");
		txtCantidad740.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad740.setEditable(false);
		txtCantidad740.setColumns(10);
		txtCantidad740.setBounds(203, 406, 35, 20);
		panel1.add(txtCantidad740);

		JLabel lblPuertaGaritax = new JLabel("Puerta garita 0,90x2,10");
		lblPuertaGaritax.setHorizontalAlignment(SwingConstants.LEFT);
		lblPuertaGaritax.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPuertaGaritax.setBounds(10, 387, 203, 14);
		panel1.add(lblPuertaGaritax);

		JLabel lblSetPerfilMetlico = new JLabel("Set perfil metálico SF-12 para puerta");
		lblSetPerfilMetlico.setHorizontalAlignment(SwingConstants.LEFT);
		lblSetPerfilMetlico.setFont(new Font("Arial", Font.PLAIN, 11));
		lblSetPerfilMetlico.setBounds(10, 409, 203, 14);
		panel1.add(lblSetPerfilMetlico);

		JLabel lblBisagrasPuerta = new JLabel("Bisagras puerta");
		lblBisagrasPuerta.setHorizontalAlignment(SwingConstants.LEFT);
		lblBisagrasPuerta.setFont(new Font("Arial", Font.PLAIN, 11));
		lblBisagrasPuerta.setBounds(10, 431, 203, 14);
		panel1.add(lblBisagrasPuerta);

		txtCantidad750 = new JTextField();
		txtCantidad750.setText("3");
		txtCantidad750.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad750.setEditable(false);
		txtCantidad750.setColumns(10);
		txtCantidad750.setBounds(203, 428, 35, 20);
		panel1.add(txtCantidad750);

		txtCantidad741 = new JTextField();
		txtCantidad741.setText((String) null);
		txtCantidad741.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad741.setColumns(10);
		txtCantidad741.setBounds(240, 406, 35, 20);
		panel1.add(txtCantidad741);

		txtCantidad751 = new JTextField();
		txtCantidad751.setText((String) null);
		txtCantidad751.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad751.setColumns(10);
		txtCantidad751.setBounds(240, 428, 35, 20);
		panel1.add(txtCantidad751);

		txtObs75 = new JTextField();
		txtObs75.setText((String) null);
		txtObs75.setColumns(10);
		txtObs75.setBounds(278, 428, 133, 20);
		panel1.add(txtObs75);

		txtObs74 = new JTextField();
		txtObs74.setText((String) null);
		txtObs74.setColumns(10);
		txtObs74.setBounds(278, 406, 133, 20);
		panel1.add(txtObs74);

		JLabel lblGaritaGuardiana = new JLabel("GARITA GUARDIANÍA");
		lblGaritaGuardiana.setHorizontalAlignment(SwingConstants.CENTER);
		lblGaritaGuardiana.setFont(new Font("Arial", Font.BOLD, 11));
		lblGaritaGuardiana.setBounds(96, 344, 139, 14);
		panel1.add(lblGaritaGuardiana);

		lblventanaPvcCon = new JLabel(
				"<html><body>Ventana PVC con Vidrio flotado 3 mm<br> (0.70x1,50 mt)</body></html>\r\n\r\n");
		lblventanaPvcCon.setHorizontalAlignment(SwingConstants.LEFT);
		lblventanaPvcCon.setFont(new Font("Arial", Font.PLAIN, 11));
		lblventanaPvcCon.setBounds(10, 446, 203, 39);
		panel1.add(lblventanaPvcCon);

		txtCantidad760 = new JTextField();
		txtCantidad760.setText("1");
		txtCantidad760.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad760.setEditable(false);
		txtCantidad760.setColumns(10);
		txtCantidad760.setBounds(203, 454, 35, 20);
		panel1.add(txtCantidad760);

		txtCantidad761 = new JTextField();
		txtCantidad761.setText((String) null);
		txtCantidad761.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad761.setColumns(10);
		txtCantidad761.setBounds(240, 454, 35, 20);
		panel1.add(txtCantidad761);

		txtObs76 = new JTextField();
		txtObs76.setText((String) null);
		txtObs76.setColumns(10);
		txtObs76.setBounds(278, 454, 133, 20);
		panel1.add(txtObs76);

		lblPerfilMetlicoSf = new JLabel("Perfil metálico SF-12 para ventana");
		lblPerfilMetlicoSf.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilMetlicoSf.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilMetlicoSf.setBounds(10, 488, 203, 14);
		panel1.add(lblPerfilMetlicoSf);

		txtCantidad770 = new JTextField();
		txtCantidad770.setText("8");
		txtCantidad770.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad770.setEditable(false);
		txtCantidad770.setColumns(10);
		txtCantidad770.setBounds(203, 485, 35, 20);
		panel1.add(txtCantidad770);

		txtCantidad771 = new JTextField();
		txtCantidad771.setText((String) null);
		txtCantidad771.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad771.setColumns(10);
		txtCantidad771.setBounds(240, 485, 35, 20);
		panel1.add(txtCantidad771);

		txtObs77 = new JTextField();
		txtObs77.setText((String) null);
		txtObs77.setColumns(10);
		txtObs77.setBounds(278, 485, 133, 20);
		panel1.add(txtObs77);

		lblPerfilSfMasf = new JLabel("Perfil SF-12 MA-SF-12 para paredes");
		lblPerfilSfMasf.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfMasf.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfMasf.setBounds(10, 513, 203, 14);
		panel1.add(lblPerfilSfMasf);

		txtCantidad780 = new JTextField();
		txtCantidad780.setText("8");
		txtCantidad780.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad780.setEditable(false);
		txtCantidad780.setColumns(10);
		txtCantidad780.setBounds(203, 510, 35, 20);
		panel1.add(txtCantidad780);

		txtCantidad781 = new JTextField();
		txtCantidad781.setText((String) null);
		txtCantidad781.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad781.setColumns(10);
		txtCantidad781.setBounds(240, 510, 35, 20);
		panel1.add(txtCantidad781);

		txtObs78 = new JTextField();
		txtObs78.setText((String) null);
		txtObs78.setColumns(10);
		txtObs78.setBounds(278, 510, 133, 20);
		panel1.add(txtObs78);

		JPanel panel2 = new JPanel();
		tabbedPane.addTab("2.- " + ficha.getFiDescripcion(), null, panel2, null);
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

		txtCantidad430 = new JTextField();
		txtCantidad430.setText("1");
		txtCantidad430.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad430.setEditable(false);
		txtCantidad430.setColumns(10);
		txtCantidad430.setBounds(223, 261, 35, 20);
		panel2.add(txtCantidad430);

		txtCantidad431 = new JTextField();
		txtCantidad431.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad431.setColumns(10);
		txtCantidad431.setBounds(260, 261, 35, 20);
		panel2.add(txtCantidad431);

		txtCantidad420 = new JTextField();
		txtCantidad420.setText("1");
		txtCantidad420.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad420.setEditable(false);
		txtCantidad420.setColumns(10);
		txtCantidad420.setBounds(223, 212, 35, 20);
		panel2.add(txtCantidad420);

		txtCantidad421 = new JTextField();
		txtCantidad421.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad421.setColumns(10);
		txtCantidad421.setBounds(260, 212, 35, 20);
		panel2.add(txtCantidad421);

		txtCantidad411 = new JTextField();
		txtCantidad411.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad411.setColumns(10);
		txtCantidad411.setBounds(260, 173, 35, 20);
		panel2.add(txtCantidad411);

		txtCantidad410 = new JTextField();
		txtCantidad410.setText("1");
		txtCantidad410.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad410.setEditable(false);
		txtCantidad410.setColumns(10);
		txtCantidad410.setBounds(223, 173, 35, 20);
		panel2.add(txtCantidad410);

		txtCantidad400 = new JTextField();
		txtCantidad400.setText("1");
		txtCantidad400.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad400.setEditable(false);
		txtCantidad400.setColumns(10);
		txtCantidad400.setBounds(223, 151, 35, 20);
		panel2.add(txtCantidad400);

		txtCantidad401 = new JTextField();
		txtCantidad401.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad401.setColumns(10);
		txtCantidad401.setBounds(260, 151, 35, 20);
		panel2.add(txtCantidad401);

		txtCantidad391 = new JTextField();
		txtCantidad391.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad391.setColumns(10);
		txtCantidad391.setBounds(260, 112, 35, 20);
		panel2.add(txtCantidad391);

		txtCantidad390 = new JTextField();
		txtCantidad390.setText("1");
		txtCantidad390.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad390.setEditable(false);
		txtCantidad390.setColumns(10);
		txtCantidad390.setBounds(223, 112, 35, 20);
		panel2.add(txtCantidad390);

		txtCantidad380 = new JTextField();
		txtCantidad380.setText("4");
		txtCantidad380.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad380.setEditable(false);
		txtCantidad380.setColumns(10);
		txtCantidad380.setBounds(223, 75, 35, 20);
		panel2.add(txtCantidad380);

		txtCantidad370 = new JTextField();
		txtCantidad370.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad370.setText("2");
		txtCantidad370.setEditable(false);
		txtCantidad370.setColumns(10);
		txtCantidad370.setBounds(223, 44, 35, 20);
		panel2.add(txtCantidad370);

		txtCantidad371 = new JTextField();
		txtCantidad371.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad371.setColumns(10);
		txtCantidad371.setBounds(260, 44, 35, 20);
		panel2.add(txtCantidad371);

		txtCantidad381 = new JTextField();
		txtCantidad381.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad381.setColumns(10);
		txtCantidad381.setBounds(260, 75, 35, 20);
		panel2.add(txtCantidad381);

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

		txtObs37 = new JTextField();
		txtObs37.setColumns(10);
		txtObs37.setBounds(299, 44, 133, 20);
		panel2.add(txtObs37);

		txtObs38 = new JTextField();
		txtObs38.setColumns(10);
		txtObs38.setBounds(299, 75, 133, 20);
		panel2.add(txtObs38);

		txtObs39 = new JTextField();
		txtObs39.setColumns(10);
		txtObs39.setBounds(299, 112, 133, 20);
		panel2.add(txtObs39);

		txtObs40 = new JTextField();
		txtObs40.setColumns(10);
		txtObs40.setBounds(299, 151, 133, 20);
		panel2.add(txtObs40);

		txtObs41 = new JTextField();
		txtObs41.setColumns(10);
		txtObs41.setBounds(299, 173, 133, 20);
		panel2.add(txtObs41);

		txtObs42 = new JTextField();
		txtObs42.setColumns(10);
		txtObs42.setBounds(299, 212, 133, 20);
		panel2.add(txtObs42);

		txtObs43 = new JTextField();
		txtObs43.setColumns(10);
		txtObs43.setBounds(299, 261, 133, 20);
		panel2.add(txtObs43);

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

		txtCantidad530 = new JTextField();
		txtCantidad530.setText("2");
		txtCantidad530.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad530.setEditable(false);
		txtCantidad530.setColumns(10);
		txtCantidad530.setBounds(223, 512, 35, 20);
		panel2.add(txtCantidad530);

		txtCantidad520 = new JTextField();
		txtCantidad520.setText("1");
		txtCantidad520.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad520.setEditable(false);
		txtCantidad520.setColumns(10);
		txtCantidad520.setBounds(223, 490, 35, 20);
		panel2.add(txtCantidad520);

		txtCantidad510 = new JTextField();
		txtCantidad510.setText("2");
		txtCantidad510.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad510.setEditable(false);
		txtCantidad510.setColumns(10);
		txtCantidad510.setBounds(223, 468, 35, 20);
		panel2.add(txtCantidad510);

		txtCantidad500 = new JTextField();
		txtCantidad500.setText("2");
		txtCantidad500.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad500.setEditable(false);
		txtCantidad500.setColumns(10);
		txtCantidad500.setBounds(223, 446, 35, 20);
		panel2.add(txtCantidad500);

		txtCantidad490 = new JTextField();
		txtCantidad490.setText("2");
		txtCantidad490.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad490.setEditable(false);
		txtCantidad490.setColumns(10);
		txtCantidad490.setBounds(223, 424, 35, 20);
		panel2.add(txtCantidad490);

		txtCantidad480 = new JTextField();
		txtCantidad480.setText("2");
		txtCantidad480.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad480.setEditable(false);
		txtCantidad480.setColumns(10);
		txtCantidad480.setBounds(223, 402, 35, 20);
		panel2.add(txtCantidad480);

		txtCantidad470 = new JTextField();
		txtCantidad470.setText("1");
		txtCantidad470.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad470.setEditable(false);
		txtCantidad470.setColumns(10);
		txtCantidad470.setBounds(223, 380, 35, 20);
		panel2.add(txtCantidad470);

		txtCantidad460 = new JTextField();
		txtCantidad460.setText("2");
		txtCantidad460.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad460.setEditable(false);
		txtCantidad460.setColumns(10);
		txtCantidad460.setBounds(223, 358, 35, 20);
		panel2.add(txtCantidad460);

		txtCantidad450 = new JTextField();
		txtCantidad450.setText("2");
		txtCantidad450.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad450.setEditable(false);
		txtCantidad450.setColumns(10);
		txtCantidad450.setBounds(223, 336, 35, 20);
		panel2.add(txtCantidad450);

		txtCantidad440 = new JTextField();
		txtCantidad440.setText("4");
		txtCantidad440.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad440.setEditable(false);
		txtCantidad440.setColumns(10);
		txtCantidad440.setBounds(223, 314, 35, 20);
		panel2.add(txtCantidad440);

		txtCantidad441 = new JTextField();
		txtCantidad441.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad441.setColumns(10);
		txtCantidad441.setBounds(260, 314, 35, 20);
		panel2.add(txtCantidad441);

		txtCantidad451 = new JTextField();
		txtCantidad451.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad451.setColumns(10);
		txtCantidad451.setBounds(260, 336, 35, 20);
		panel2.add(txtCantidad451);

		txtCantidad461 = new JTextField();
		txtCantidad461.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad461.setColumns(10);
		txtCantidad461.setBounds(260, 358, 35, 20);
		panel2.add(txtCantidad461);

		txtCantidad471 = new JTextField();
		txtCantidad471.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad471.setColumns(10);
		txtCantidad471.setBounds(260, 380, 35, 20);
		panel2.add(txtCantidad471);

		txtCantidad481 = new JTextField();
		txtCantidad481.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad481.setColumns(10);
		txtCantidad481.setBounds(260, 402, 35, 20);
		panel2.add(txtCantidad481);

		txtCantidad491 = new JTextField();
		txtCantidad491.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad491.setColumns(10);
		txtCantidad491.setBounds(260, 424, 35, 20);
		panel2.add(txtCantidad491);

		txtCantidad501 = new JTextField();
		txtCantidad501.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad501.setColumns(10);
		txtCantidad501.setBounds(260, 446, 35, 20);
		panel2.add(txtCantidad501);

		txtCantidad511 = new JTextField();
		txtCantidad511.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad511.setColumns(10);
		txtCantidad511.setBounds(260, 468, 35, 20);
		panel2.add(txtCantidad511);

		txtCantidad521 = new JTextField();
		txtCantidad521.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad521.setColumns(10);
		txtCantidad521.setBounds(260, 490, 35, 20);
		panel2.add(txtCantidad521);

		txtCantidad531 = new JTextField();
		txtCantidad531.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad531.setColumns(10);
		txtCantidad531.setBounds(260, 512, 35, 20);
		panel2.add(txtCantidad531);

		txtObs53 = new JTextField();
		txtObs53.setColumns(10);
		txtObs53.setBounds(299, 512, 133, 20);
		panel2.add(txtObs53);

		txtObs52 = new JTextField();
		txtObs52.setColumns(10);
		txtObs52.setBounds(299, 490, 133, 20);
		panel2.add(txtObs52);

		txtObs51 = new JTextField();
		txtObs51.setColumns(10);
		txtObs51.setBounds(299, 468, 133, 20);
		panel2.add(txtObs51);

		txtObs50 = new JTextField();
		txtObs50.setColumns(10);
		txtObs50.setBounds(299, 446, 133, 20);
		panel2.add(txtObs50);

		txtObs49 = new JTextField();
		txtObs49.setColumns(10);
		txtObs49.setBounds(299, 424, 133, 20);
		panel2.add(txtObs49);

		txtObs48 = new JTextField();
		txtObs48.setColumns(10);
		txtObs48.setBounds(299, 402, 133, 20);
		panel2.add(txtObs48);

		txtObs47 = new JTextField();
		txtObs47.setColumns(10);
		txtObs47.setBounds(299, 380, 133, 20);
		panel2.add(txtObs47);

		txtObs46 = new JTextField();
		txtObs46.setColumns(10);
		txtObs46.setBounds(299, 358, 133, 20);
		panel2.add(txtObs46);

		txtObs45 = new JTextField();
		txtObs45.setColumns(10);
		txtObs45.setBounds(299, 336, 133, 20);
		panel2.add(txtObs45);

		txtObs44 = new JTextField();
		txtObs44.setColumns(10);
		txtObs44.setBounds(299, 314, 133, 20);
		panel2.add(txtObs44);

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

		txtCantidad540 = new JTextField();
		txtCantidad540.setText("2");
		txtCantidad540.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad540.setEditable(false);
		txtCantidad540.setColumns(10);
		txtCantidad540.setBounds(649, 33, 35, 20);
		panel2.add(txtCantidad540);

		label_50 = new JLabel("Cantidad");
		label_50.setHorizontalAlignment(SwingConstants.CENTER);
		label_50.setFont(new Font("Arial", Font.BOLD, 11));
		label_50.setBounds(652, 11, 63, 14);
		panel2.add(label_50);

		txtCantidad541 = new JTextField();
		txtCantidad541.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad541.setColumns(10);
		txtCantidad541.setBounds(686, 33, 35, 20);
		panel2.add(txtCantidad541);

		txtObs54 = new JTextField();
		txtObs54.setColumns(10);
		txtObs54.setBounds(725, 33, 133, 20);
		panel2.add(txtObs54);

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

		txtCantidad550 = new JTextField();
		txtCantidad550.setText("1");
		txtCantidad550.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad550.setEditable(false);
		txtCantidad550.setColumns(10);
		txtCantidad550.setBounds(649, 55, 35, 20);
		panel2.add(txtCantidad550);

		txtCantidad551 = new JTextField();
		txtCantidad551.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad551.setColumns(10);
		txtCantidad551.setBounds(686, 55, 35, 20);
		panel2.add(txtCantidad551);

		txtObs55 = new JTextField();
		txtObs55.setColumns(10);
		txtObs55.setBounds(725, 55, 133, 20);
		panel2.add(txtObs55);

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

		txtCantidad670 = new JTextField();
		txtCantidad670.setText("1");
		txtCantidad670.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad670.setEditable(false);
		txtCantidad670.setColumns(10);
		txtCantidad670.setBounds(649, 355, 35, 20);
		panel2.add(txtCantidad670);

		txtCantidad660 = new JTextField();
		txtCantidad660.setText("1");
		txtCantidad660.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad660.setEditable(false);
		txtCantidad660.setColumns(10);
		txtCantidad660.setBounds(649, 333, 35, 20);
		panel2.add(txtCantidad660);

		txtCantidad650 = new JTextField();
		txtCantidad650.setText("1");
		txtCantidad650.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad650.setEditable(false);
		txtCantidad650.setColumns(10);
		txtCantidad650.setBounds(649, 311, 35, 20);
		panel2.add(txtCantidad650);

		txtCantidad640 = new JTextField();
		txtCantidad640.setText("1");
		txtCantidad640.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad640.setEditable(false);
		txtCantidad640.setColumns(10);
		txtCantidad640.setBounds(649, 289, 35, 20);
		panel2.add(txtCantidad640);

		txtCantidad630 = new JTextField();
		txtCantidad630.setText("1");
		txtCantidad630.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad630.setEditable(false);
		txtCantidad630.setColumns(10);
		txtCantidad630.setBounds(649, 267, 35, 20);
		panel2.add(txtCantidad630);

		txtCantidad620 = new JTextField();
		txtCantidad620.setText("2");
		txtCantidad620.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad620.setEditable(false);
		txtCantidad620.setColumns(10);
		txtCantidad620.setBounds(649, 245, 35, 20);
		panel2.add(txtCantidad620);

		txtCantidad610 = new JTextField();
		txtCantidad610.setText("6");
		txtCantidad610.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad610.setEditable(false);
		txtCantidad610.setColumns(10);
		txtCantidad610.setBounds(649, 223, 35, 20);
		panel2.add(txtCantidad610);

		txtCantidad600 = new JTextField();
		txtCantidad600.setText("8");
		txtCantidad600.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad600.setEditable(false);
		txtCantidad600.setColumns(10);
		txtCantidad600.setBounds(649, 201, 35, 20);
		panel2.add(txtCantidad600);

		txtCantidad590 = new JTextField();
		txtCantidad590.setText("2");
		txtCantidad590.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad590.setEditable(false);
		txtCantidad590.setColumns(10);
		txtCantidad590.setBounds(649, 179, 35, 20);
		panel2.add(txtCantidad590);

		txtCantidad580 = new JTextField();
		txtCantidad580.setText("8");
		txtCantidad580.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad580.setEditable(false);
		txtCantidad580.setColumns(10);
		txtCantidad580.setBounds(649, 157, 35, 20);
		panel2.add(txtCantidad580);

		txtCantidad570 = new JTextField();
		txtCantidad570.setText("1");
		txtCantidad570.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad570.setEditable(false);
		txtCantidad570.setColumns(10);
		txtCantidad570.setBounds(649, 135, 35, 20);
		panel2.add(txtCantidad570);

		txtCantidad560 = new JTextField();
		txtCantidad560.setText("1");
		txtCantidad560.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad560.setEditable(false);
		txtCantidad560.setColumns(10);
		txtCantidad560.setBounds(649, 113, 35, 20);
		panel2.add(txtCantidad560);

		label_63 = new JLabel("Cantidad");
		label_63.setHorizontalAlignment(SwingConstants.CENTER);
		label_63.setFont(new Font("Arial", Font.BOLD, 11));
		label_63.setBounds(652, 91, 63, 14);
		panel2.add(label_63);

		txtCantidad561 = new JTextField();
		txtCantidad561.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad561.setColumns(10);
		txtCantidad561.setBounds(686, 113, 35, 20);
		panel2.add(txtCantidad561);

		txtCantidad571 = new JTextField();
		txtCantidad571.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad571.setColumns(10);
		txtCantidad571.setBounds(686, 135, 35, 20);
		panel2.add(txtCantidad571);

		txtCantidad581 = new JTextField();
		txtCantidad581.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad581.setColumns(10);
		txtCantidad581.setBounds(686, 157, 35, 20);
		panel2.add(txtCantidad581);

		txtCantidad591 = new JTextField();
		txtCantidad591.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad591.setColumns(10);
		txtCantidad591.setBounds(686, 179, 35, 20);
		panel2.add(txtCantidad591);

		txtCantidad601 = new JTextField();
		txtCantidad601.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad601.setColumns(10);
		txtCantidad601.setBounds(686, 201, 35, 20);
		panel2.add(txtCantidad601);

		txtCantidad611 = new JTextField();
		txtCantidad611.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad611.setColumns(10);
		txtCantidad611.setBounds(686, 223, 35, 20);
		panel2.add(txtCantidad611);

		txtCantidad621 = new JTextField();
		txtCantidad621.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad621.setColumns(10);
		txtCantidad621.setBounds(686, 245, 35, 20);
		panel2.add(txtCantidad621);

		txtCantidad631 = new JTextField();
		txtCantidad631.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad631.setColumns(10);
		txtCantidad631.setBounds(686, 267, 35, 20);
		panel2.add(txtCantidad631);

		txtCantidad641 = new JTextField();
		txtCantidad641.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad641.setColumns(10);
		txtCantidad641.setBounds(686, 289, 35, 20);
		panel2.add(txtCantidad641);

		txtCantidad651 = new JTextField();
		txtCantidad651.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad651.setColumns(10);
		txtCantidad651.setBounds(686, 311, 35, 20);
		panel2.add(txtCantidad651);

		txtCantidad661 = new JTextField();
		txtCantidad661.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad661.setColumns(10);
		txtCantidad661.setBounds(686, 333, 35, 20);
		panel2.add(txtCantidad661);

		txtCantidad671 = new JTextField();
		txtCantidad671.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad671.setColumns(10);
		txtCantidad671.setBounds(686, 355, 35, 20);
		panel2.add(txtCantidad671);

		txtObs67 = new JTextField();
		txtObs67.setColumns(10);
		txtObs67.setBounds(725, 355, 133, 20);
		panel2.add(txtObs67);

		txtObs66 = new JTextField();
		txtObs66.setColumns(10);
		txtObs66.setBounds(725, 333, 133, 20);
		panel2.add(txtObs66);

		txtObs65 = new JTextField();
		txtObs65.setColumns(10);
		txtObs65.setBounds(725, 311, 133, 20);
		panel2.add(txtObs65);

		txtObs64 = new JTextField();
		txtObs64.setColumns(10);
		txtObs64.setBounds(725, 289, 133, 20);
		panel2.add(txtObs64);

		txtObs63 = new JTextField();
		txtObs63.setColumns(10);
		txtObs63.setBounds(725, 267, 133, 20);
		panel2.add(txtObs63);

		txtObs62 = new JTextField();
		txtObs62.setColumns(10);
		txtObs62.setBounds(725, 245, 133, 20);
		panel2.add(txtObs62);

		txtObs61 = new JTextField();
		txtObs61.setColumns(10);
		txtObs61.setBounds(725, 223, 133, 20);
		panel2.add(txtObs61);

		txtObs60 = new JTextField();
		txtObs60.setColumns(10);
		txtObs60.setBounds(725, 201, 133, 20);
		panel2.add(txtObs60);

		txtObs59 = new JTextField();
		txtObs59.setColumns(10);
		txtObs59.setBounds(725, 179, 133, 20);
		panel2.add(txtObs59);

		txtObs58 = new JTextField();
		txtObs58.setColumns(10);
		txtObs58.setBounds(725, 157, 133, 20);
		panel2.add(txtObs58);

		txtObs57 = new JTextField();
		txtObs57.setColumns(10);
		txtObs57.setBounds(725, 135, 133, 20);
		panel2.add(txtObs57);

		txtObs56 = new JTextField();
		txtObs56.setColumns(10);
		txtObs56.setBounds(725, 113, 133, 20);
		panel2.add(txtObs56);

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

		txtCantidad680 = new JTextField();
		txtCantidad680.setText("1");
		txtCantidad680.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad680.setEditable(false);
		txtCantidad680.setColumns(10);
		txtCantidad680.setBounds(649, 377, 35, 20);
		panel2.add(txtCantidad680);

		txtCantidad681 = new JTextField();
		txtCantidad681.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad681.setColumns(10);
		txtCantidad681.setBounds(686, 377, 35, 20);
		panel2.add(txtCantidad681);

		txtObs68 = new JTextField();
		txtObs68.setColumns(10);
		txtObs68.setBounds(725, 377, 133, 20);
		panel2.add(txtObs68);

		lblPanelesEpsPared_18 = new JLabel("Paneles EPS pared port\u00F3n- (1,0x0,35 mt)");
		lblPanelesEpsPared_18.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_18.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_18.setBounds(442, 405, 203, 14);
		panel2.add(lblPanelesEpsPared_18);

		txtCantidad690 = new JTextField();
		txtCantidad690.setText("8");
		txtCantidad690.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad690.setEditable(false);
		txtCantidad690.setColumns(10);
		txtCantidad690.setBounds(649, 399, 35, 20);
		panel2.add(txtCantidad690);

		txtCantidad691 = new JTextField();
		txtCantidad691.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad691.setColumns(10);
		txtCantidad691.setBounds(686, 399, 35, 20);
		panel2.add(txtCantidad691);

		txtObs69 = new JTextField();
		txtObs69.setColumns(10);
		txtObs69.setBounds(725, 399, 133, 20);
		panel2.add(txtObs69);

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

		txtCantidad700 = new JTextField();
		txtCantidad700.setText("6");
		txtCantidad700.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad700.setEditable(false);
		txtCantidad700.setColumns(10);
		txtCantidad700.setBounds(1070, 33, 35, 20);
		panel2.add(txtCantidad700);

		label_53 = new JLabel("Cantidad");
		label_53.setHorizontalAlignment(SwingConstants.CENTER);
		label_53.setFont(new Font("Arial", Font.BOLD, 11));
		label_53.setBounds(1073, 11, 63, 14);
		panel2.add(label_53);

		txtCantidad701 = new JTextField();
		txtCantidad701.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad701.setColumns(10);
		txtCantidad701.setBounds(1107, 33, 35, 20);
		panel2.add(txtCantidad701);

		txtCantidad711 = new JTextField();
		txtCantidad711.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad711.setColumns(10);
		txtCantidad711.setBounds(1107, 55, 35, 20);
		panel2.add(txtCantidad711);

		txtCantidad710 = new JTextField();
		txtCantidad710.setText("47");
		txtCantidad710.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad710.setEditable(false);
		txtCantidad710.setColumns(10);
		txtCantidad710.setBounds(1070, 55, 35, 20);
		panel2.add(txtCantidad710);

		txtObs71 = new JTextField();
		txtObs71.setColumns(10);
		txtObs71.setBounds(1146, 55, 133, 20);
		panel2.add(txtObs71);

		txtObs70 = new JTextField();
		txtObs70.setColumns(10);
		txtObs70.setBounds(1146, 33, 133, 20);
		panel2.add(txtObs70);

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

		txtCantidad720 = new JTextField();
		txtCantidad720.setText("5");
		txtCantidad720.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad720.setEditable(false);
		txtCantidad720.setColumns(10);
		txtCantidad720.setBounds(1070, 77, 35, 20);
		panel2.add(txtCantidad720);

		txtCantidad721 = new JTextField();
		txtCantidad721.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad721.setColumns(10);
		txtCantidad721.setBounds(1107, 77, 35, 20);
		panel2.add(txtCantidad721);

		txtObs72 = new JTextField();
		txtObs72.setColumns(10);
		txtObs72.setBounds(1146, 77, 133, 20);
		panel2.add(txtObs72);

		JPinformacionObligatoria infoObligatoria = new JPinformacionObligatoria(865, 325);
		infoObligatoria.getBtnInsertarFoto().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoObligatoria.setPathFotoIO(Utilitarios.getPathImagen());
			}
		});
		panel2.add(infoObligatoria.getPnlInformacionObl());

		validarDigitos(txtCantidad01);
		validarDigitos(txtCantidad11);
		validarDigitos(txtCantidad21);
		validarDigitos(txtCantidad31);
		validarDigitos(txtCantidad41);
		validarDigitos(txtCantidad51);
		validarDigitos(txtCantidad61);
		validarDigitos(txtCantidad71);
		validarDigitos(txtCantidad81);
		validarDigitos(txtCantidad91);
		validarDigitos(txtCantidad101);
		validarDigitos(txtCantidad111);
		validarDigitos(txtCantidad121);
		validarDigitos(txtCantidad131);
		validarDigitos(txtCantidad141);
		validarDigitos(txtCantidad151);
		validarDigitos(txtCantidad161);
		validarDigitos(txtCantidad171);
		validarDigitos(txtCantidad181);
		validarDigitos(txtCantidad191);
		validarDigitos(txtCantidad201);
		validarDigitos(txtCantidad211);
		validarDigitos(txtCantidad221);
		validarDigitos(txtCantidad231);
		validarDigitos(txtCantidad241);
		validarDigitos(txtCantidad251);
		validarDigitos(txtCantidad261);
		validarDigitos(txtCantidad271);
		validarDigitos(txtCantidad281);
		validarDigitos(txtCantidad291);
		validarDigitos(txtCantidad301);
		validarDigitos(txtCantidad311);
		validarDigitos(txtCantidad321);
		validarDigitos(txtCantidad331);
		validarDigitos(txtCantidad341);
		validarDigitos(txtCantidad351);
		validarDigitos(txtCantidad361);
		validarDigitos(txtCantidad371);
		validarDigitos(txtCantidad381);
		validarDigitos(txtCantidad391);
		validarDigitos(txtCantidad401);
		validarDigitos(txtCantidad411);
		validarDigitos(txtCantidad421);
		validarDigitos(txtCantidad431);
		validarDigitos(txtCantidad441);
		validarDigitos(txtCantidad451);
		validarDigitos(txtCantidad461);
		validarDigitos(txtCantidad471);
		validarDigitos(txtCantidad481);
		validarDigitos(txtCantidad491);
		validarDigitos(txtCantidad501);
		validarDigitos(txtCantidad511);
		validarDigitos(txtCantidad521);
		validarDigitos(txtCantidad531);
		validarDigitos(txtCantidad541);
		validarDigitos(txtCantidad551);
		validarDigitos(txtCantidad561);
		validarDigitos(txtCantidad571);
		validarDigitos(txtCantidad581);
		validarDigitos(txtCantidad591);
		validarDigitos(txtCantidad601);
		validarDigitos(txtCantidad611);
		validarDigitos(txtCantidad621);
		validarDigitos(txtCantidad631);
		validarDigitos(txtCantidad641);
		validarDigitos(txtCantidad651);
		validarDigitos(txtCantidad661);
		validarDigitos(txtCantidad671);
		validarDigitos(txtCantidad681);
		validarDigitos(txtCantidad691);
		validarDigitos(txtCantidad701);
		validarDigitos(txtCantidad711);
		validarDigitos(txtCantidad721);
		validarDigitos(txtCantidad731);
		validarDigitos(txtCantidad741);
		validarDigitos(txtCantidad751);
		validarDigitos(txtCantidad761);
		validarDigitos(txtCantidad771);
		validarDigitos(txtCantidad781);

		llenarFicha();

		cabecera.getBtnRegistrar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				infor = cargarInfoObligatoria(infoObligatoria);
				List<TdetalleFicha> detallesFicha = cargarListas();

				if (validarInfo(infor)) {

					if (detallesFicha == null) {
						JOptionPane.showMessageDialog(null,
								"ERROR: Verificar que los registros no se encuentren VACÍOS", "Mensaje de Error",
								JOptionPane.ERROR_MESSAGE);
						return;
					}

					if (Validaciones.registrosValidados(detallesFicha)) {
						srvInfoOblig.crear(infor);
						infor.setIoSerial(srvInfoOblig.serialInfoOblMax());

						servFicha.guardarFormulario(detallesFicha);

						HashMap<String, Object> parametros = new HashMap<String, Object>();
						parametros.put("serial_cabecera", Utilitarios.gettCabecera().getCSerial());
						parametros.put("serial_ficha", ficha.getFiSerial());

						Reporte reporte = new Reporte("Reporte MA", 280, 10, 850, 750);
						reporte.cargarReporte("src/com/capa/templates/MA.jasper", parametros,
								Query.getMysql().getConexion());
						reporte.setVisible(true);

						new Menu().setVisible(true);
						dispose();
					}
				} else {
					JOptionPane.showMessageDialog(null, "Ingresar Información Obligatoria ");
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

	public List<TdetalleFicha> cargarListas() {
		List<TdetalleFicha> listaDetalles = new LinkedList<>();
		BigDecimal porcentajeAvance;

		ServicioInfoObligatoria srvInfoObl = new ComponenteInfoObligatoria();
		infor.setIoSerial(srvInfoObl.serialInfoOblMax());

		TGrupo grupoTmp = servFicha.buscarGrupo("Kit eléctrico");
		Integer updateFicha = servFicha.nActualizacionFicha(gettCabecera(), ficha);
		if (updateFicha == -1) {
			updateFicha = 0;
		} else {
			updateFicha++;
		}

		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad00.getText()),
				Integer.parseInt(txtCantidad01.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_0,
				Integer.parseInt(txtCantidad00.getText()), Integer.parseInt(txtCantidad01.getText()), txtObs0.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad10.getText()),
				Integer.parseInt(txtCantidad11.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_1,
				Integer.parseInt(txtCantidad10.getText()), Integer.parseInt(txtCantidad11.getText()), txtObs1.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad20.getText()),
				Integer.parseInt(txtCantidad21.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_2,
				Integer.parseInt(txtCantidad20.getText()), Integer.parseInt(txtCantidad21.getText()), txtObs2.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad30.getText()),
				Integer.parseInt(txtCantidad31.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_3,
				Integer.parseInt(txtCantidad30.getText()), Integer.parseInt(txtCantidad31.getText()), txtObs3.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad40.getText()),
				Integer.parseInt(txtCantidad41.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_4,
				Integer.parseInt(txtCantidad40.getText()), Integer.parseInt(txtCantidad41.getText()), txtObs4.getText(),
				updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Kit agua lluvia");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad50.getText()),
				Integer.parseInt(txtCantidad51.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_5,
				Integer.parseInt(txtCantidad50.getText()), Integer.parseInt(txtCantidad51.getText()), txtObs5.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad60.getText()),
				Integer.parseInt(txtCantidad61.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_6,
				Integer.parseInt(txtCantidad60.getText()), Integer.parseInt(txtCantidad61.getText()), txtObs6.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad70.getText()),
				Integer.parseInt(txtCantidad71.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_7,
				Integer.parseInt(txtCantidad70.getText()), Integer.parseInt(txtCantidad71.getText()), txtObs7.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad80.getText()),
				Integer.parseInt(txtCantidad81.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_8,
				Integer.parseInt(txtCantidad80.getText()), Integer.parseInt(txtCantidad81.getText()), txtObs8.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad90.getText()),
				Integer.parseInt(txtCantidad91.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_9,
				Integer.parseInt(txtCantidad90.getText()), Integer.parseInt(txtCantidad91.getText()), txtObs9.getText(),
				updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Componente arquitectónico");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad730.getText()),
				Integer.parseInt(txtCantidad731.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_73,
				Integer.parseInt(txtCantidad730.getText()), Integer.parseInt(txtCantidad731.getText()),
				txtObs73.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad740.getText()),
				Integer.parseInt(txtCantidad741.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_74,
				Integer.parseInt(txtCantidad740.getText()), Integer.parseInt(txtCantidad741.getText()),
				txtObs74.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad750.getText()),
				Integer.parseInt(txtCantidad751.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_75,
				Integer.parseInt(txtCantidad750.getText()), Integer.parseInt(txtCantidad751.getText()),
				txtObs75.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad760.getText()),
				Integer.parseInt(txtCantidad761.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_76,
				Integer.parseInt(txtCantidad760.getText()), Integer.parseInt(txtCantidad761.getText()),
				txtObs76.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad770.getText()),
				Integer.parseInt(txtCantidad771.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_77,
				Integer.parseInt(txtCantidad770.getText()), Integer.parseInt(txtCantidad771.getText()),
				txtObs77.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad780.getText()),
				Integer.parseInt(txtCantidad781.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_78,
				Integer.parseInt(txtCantidad780.getText()), Integer.parseInt(txtCantidad781.getText()),
				txtObs78.getText(), updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Fachada frontal");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad100.getText()),
				Integer.parseInt(txtCantidad101.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_10,
				Integer.parseInt(txtCantidad100.getText()), Integer.parseInt(txtCantidad101.getText()),
				txtObs10.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad110.getText()),
				Integer.parseInt(txtCantidad111.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_11,
				Integer.parseInt(txtCantidad110.getText()), Integer.parseInt(txtCantidad111.getText()),
				txtObs11.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad120.getText()),
				Integer.parseInt(txtCantidad121.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_12,
				Integer.parseInt(txtCantidad120.getText()), Integer.parseInt(txtCantidad121.getText()),
				txtObs12.getText(), updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Fachada posterior");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad130.getText()),
				Integer.parseInt(txtCantidad131.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_13,
				Integer.parseInt(txtCantidad130.getText()), Integer.parseInt(txtCantidad131.getText()),
				txtObs13.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad140.getText()),
				Integer.parseInt(txtCantidad141.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_14,
				Integer.parseInt(txtCantidad140.getText()), Integer.parseInt(txtCantidad141.getText()),
				txtObs14.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad150.getText()),
				Integer.parseInt(txtCantidad151.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_15,
				Integer.parseInt(txtCantidad150.getText()), Integer.parseInt(txtCantidad151.getText()),
				txtObs15.getText(), updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Fachada lateral izquierda");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad160.getText()),
				Integer.parseInt(txtCantidad161.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_16,
				Integer.parseInt(txtCantidad160.getText()), Integer.parseInt(txtCantidad161.getText()),
				txtObs16.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad170.getText()),
				Integer.parseInt(txtCantidad171.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_17,
				Integer.parseInt(txtCantidad170.getText()), Integer.parseInt(txtCantidad171.getText()),
				txtObs17.getText(), updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Fachada Lateral derecha");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad180.getText()),
				Integer.parseInt(txtCantidad181.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_18,
				Integer.parseInt(txtCantidad180.getText()), Integer.parseInt(txtCantidad181.getText()),
				txtObs18.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad190.getText()),
				Integer.parseInt(txtCantidad191.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_19,
				Integer.parseInt(txtCantidad190.getText()), Integer.parseInt(txtCantidad191.getText()),
				txtObs19.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad200.getText()),
				Integer.parseInt(txtCantidad201.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_20,
				Integer.parseInt(txtCantidad200.getText()), Integer.parseInt(txtCantidad201.getText()),
				txtObs20.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad210.getText()),
				Integer.parseInt(txtCantidad211.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_21,
				Integer.parseInt(txtCantidad210.getText()), Integer.parseInt(txtCantidad211.getText()),
				txtObs21.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad220.getText()),
				Integer.parseInt(txtCantidad221.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_22,
				Integer.parseInt(txtCantidad220.getText()), Integer.parseInt(txtCantidad221.getText()),
				txtObs22.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad230.getText()),
				Integer.parseInt(txtCantidad231.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_23,
				Integer.parseInt(txtCantidad230.getText()), Integer.parseInt(txtCantidad231.getText()),
				txtObs23.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad240.getText()),
				Integer.parseInt(txtCantidad241.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_24,
				Integer.parseInt(txtCantidad240.getText()), Integer.parseInt(txtCantidad241.getText()),
				txtObs24.getText(), updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Kit eléctrico");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad250.getText()),
				Integer.parseInt(txtCantidad251.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_25,
				Integer.parseInt(txtCantidad250.getText()), Integer.parseInt(txtCantidad251.getText()),
				txtObs25.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad260.getText()),
				Integer.parseInt(txtCantidad261.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_26,
				Integer.parseInt(txtCantidad260.getText()), Integer.parseInt(txtCantidad261.getText()),
				txtObs26.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad270.getText()),
				Integer.parseInt(txtCantidad271.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_27,
				Integer.parseInt(txtCantidad270.getText()), Integer.parseInt(txtCantidad271.getText()),
				txtObs27.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad280.getText()),
				Integer.parseInt(txtCantidad281.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_28,
				Integer.parseInt(txtCantidad280.getText()), Integer.parseInt(txtCantidad281.getText()),
				txtObs28.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad290.getText()),
				Integer.parseInt(txtCantidad291.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_29,
				Integer.parseInt(txtCantidad290.getText()), Integer.parseInt(txtCantidad291.getText()),
				txtObs29.getText(), updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Kit hidrosanitario");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad300.getText()),
				Integer.parseInt(txtCantidad301.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_30,
				Integer.parseInt(txtCantidad300.getText()), Integer.parseInt(txtCantidad301.getText()),
				txtObs30.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad310.getText()),
				Integer.parseInt(txtCantidad311.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_31,
				Integer.parseInt(txtCantidad310.getText()), Integer.parseInt(txtCantidad311.getText()),
				txtObs31.getText(), updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Kit agua potable");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad320.getText()),
				Integer.parseInt(txtCantidad321.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_32,
				Integer.parseInt(txtCantidad320.getText()), Integer.parseInt(txtCantidad321.getText()),
				txtObs32.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad330.getText()),
				Integer.parseInt(txtCantidad331.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_33,
				Integer.parseInt(txtCantidad330.getText()), Integer.parseInt(txtCantidad331.getText()),
				txtObs33.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad340.getText()),
				Integer.parseInt(txtCantidad341.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_34,
				Integer.parseInt(txtCantidad340.getText()), Integer.parseInt(txtCantidad341.getText()),
				txtObs34.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad350.getText()),
				Integer.parseInt(txtCantidad351.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_35,
				Integer.parseInt(txtCantidad350.getText()), Integer.parseInt(txtCantidad351.getText()),
				txtObs35.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad360.getText()),
				Integer.parseInt(txtCantidad361.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_36,
				Integer.parseInt(txtCantidad360.getText()), Integer.parseInt(txtCantidad361.getText()),
				txtObs36.getText(), updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Kit agua residual");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad370.getText()),
				Integer.parseInt(txtCantidad371.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_37,
				Integer.parseInt(txtCantidad370.getText()), Integer.parseInt(txtCantidad371.getText()),
				txtObs37.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad380.getText()),
				Integer.parseInt(txtCantidad381.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_38,
				Integer.parseInt(txtCantidad380.getText()), Integer.parseInt(txtCantidad381.getText()),
				txtObs38.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad390.getText()),
				Integer.parseInt(txtCantidad391.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_39,
				Integer.parseInt(txtCantidad390.getText()), Integer.parseInt(txtCantidad391.getText()),
				txtObs39.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad400.getText()),
				Integer.parseInt(txtCantidad401.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_40,
				Integer.parseInt(txtCantidad400.getText()), Integer.parseInt(txtCantidad401.getText()),
				txtObs40.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad410.getText()),
				Integer.parseInt(txtCantidad411.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_41,
				Integer.parseInt(txtCantidad410.getText()), Integer.parseInt(txtCantidad411.getText()),
				txtObs41.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad420.getText()),
				Integer.parseInt(txtCantidad421.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_42,
				Integer.parseInt(txtCantidad420.getText()), Integer.parseInt(txtCantidad421.getText()),
				txtObs42.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad430.getText()),
				Integer.parseInt(txtCantidad431.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_43,
				Integer.parseInt(txtCantidad430.getText()), Integer.parseInt(txtCantidad431.getText()),
				txtObs43.getText(), updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Componente estructural");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad440.getText()),
				Integer.parseInt(txtCantidad441.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_44,
				Integer.parseInt(txtCantidad440.getText()), Integer.parseInt(txtCantidad441.getText()),
				txtObs44.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad450.getText()),
				Integer.parseInt(txtCantidad451.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_45,
				Integer.parseInt(txtCantidad450.getText()), Integer.parseInt(txtCantidad451.getText()),
				txtObs45.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad460.getText()),
				Integer.parseInt(txtCantidad461.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_46,
				Integer.parseInt(txtCantidad460.getText()), Integer.parseInt(txtCantidad461.getText()),
				txtObs46.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad470.getText()),
				Integer.parseInt(txtCantidad471.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_47,
				Integer.parseInt(txtCantidad470.getText()), Integer.parseInt(txtCantidad471.getText()),
				txtObs47.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad480.getText()),
				Integer.parseInt(txtCantidad481.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_48,
				Integer.parseInt(txtCantidad480.getText()), Integer.parseInt(txtCantidad481.getText()),
				txtObs48.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad490.getText()),
				Integer.parseInt(txtCantidad491.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_49,
				Integer.parseInt(txtCantidad490.getText()), Integer.parseInt(txtCantidad491.getText()),
				txtObs49.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad500.getText()),
				Integer.parseInt(txtCantidad501.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_50,
				Integer.parseInt(txtCantidad500.getText()), Integer.parseInt(txtCantidad501.getText()),
				txtObs50.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad510.getText()),
				Integer.parseInt(txtCantidad511.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_51,
				Integer.parseInt(txtCantidad510.getText()), Integer.parseInt(txtCantidad511.getText()),
				txtObs51.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad520.getText()),
				Integer.parseInt(txtCantidad521.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_52,
				Integer.parseInt(txtCantidad520.getText()), Integer.parseInt(txtCantidad521.getText()),
				txtObs52.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad530.getText()),
				Integer.parseInt(txtCantidad531.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_53,
				Integer.parseInt(txtCantidad530.getText()), Integer.parseInt(txtCantidad531.getText()),
				txtObs53.getText(), updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Portón");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad540.getText()),
				Integer.parseInt(txtCantidad541.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_54,
				Integer.parseInt(txtCantidad540.getText()), Integer.parseInt(txtCantidad541.getText()),
				txtObs54.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad550.getText()),
				Integer.parseInt(txtCantidad551.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_55,
				Integer.parseInt(txtCantidad550.getText()), Integer.parseInt(txtCantidad551.getText()),
				txtObs55.getText(), updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Componente arquitectónico");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad560.getText()),
				Integer.parseInt(txtCantidad561.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_56,
				Integer.parseInt(txtCantidad560.getText()), Integer.parseInt(txtCantidad561.getText()),
				txtObs56.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad570.getText()),
				Integer.parseInt(txtCantidad571.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_57,
				Integer.parseInt(txtCantidad570.getText()), Integer.parseInt(txtCantidad571.getText()),
				txtObs57.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad580.getText()),
				Integer.parseInt(txtCantidad581.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_58,
				Integer.parseInt(txtCantidad580.getText()), Integer.parseInt(txtCantidad581.getText()),
				txtObs58.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad590.getText()),
				Integer.parseInt(txtCantidad591.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_59,
				Integer.parseInt(txtCantidad590.getText()), Integer.parseInt(txtCantidad591.getText()),
				txtObs59.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad600.getText()),
				Integer.parseInt(txtCantidad601.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_60,
				Integer.parseInt(txtCantidad600.getText()), Integer.parseInt(txtCantidad601.getText()),
				txtObs60.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad610.getText()),
				Integer.parseInt(txtCantidad611.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_61,
				Integer.parseInt(txtCantidad610.getText()), Integer.parseInt(txtCantidad611.getText()),
				txtObs61.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad620.getText()),
				Integer.parseInt(txtCantidad621.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_62,
				Integer.parseInt(txtCantidad620.getText()), Integer.parseInt(txtCantidad621.getText()),
				txtObs62.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad630.getText()),
				Integer.parseInt(txtCantidad631.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_63,
				Integer.parseInt(txtCantidad630.getText()), Integer.parseInt(txtCantidad631.getText()),
				txtObs63.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad640.getText()),
				Integer.parseInt(txtCantidad641.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_64,
				Integer.parseInt(txtCantidad640.getText()), Integer.parseInt(txtCantidad641.getText()),
				txtObs64.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad650.getText()),
				Integer.parseInt(txtCantidad651.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_65,
				Integer.parseInt(txtCantidad650.getText()), Integer.parseInt(txtCantidad651.getText()),
				txtObs65.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad660.getText()),
				Integer.parseInt(txtCantidad661.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_66,
				Integer.parseInt(txtCantidad660.getText()), Integer.parseInt(txtCantidad661.getText()),
				txtObs66.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad670.getText()),
				Integer.parseInt(txtCantidad671.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_67,
				Integer.parseInt(txtCantidad670.getText()), Integer.parseInt(txtCantidad671.getText()),
				txtObs67.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad680.getText()),
				Integer.parseInt(txtCantidad681.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_68,
				Integer.parseInt(txtCantidad680.getText()), Integer.parseInt(txtCantidad681.getText()),
				txtObs68.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad690.getText()),
				Integer.parseInt(txtCantidad691.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_69,
				Integer.parseInt(txtCantidad690.getText()), Integer.parseInt(txtCantidad691.getText()),
				txtObs69.getText(), updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Componente estructural");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad700.getText()),
				Integer.parseInt(txtCantidad701.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_70,
				Integer.parseInt(txtCantidad700.getText()), Integer.parseInt(txtCantidad701.getText()),
				txtObs70.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad710.getText()),
				Integer.parseInt(txtCantidad711.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_71,
				Integer.parseInt(txtCantidad710.getText()), Integer.parseInt(txtCantidad711.getText()),
				txtObs71.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad720.getText()),
				Integer.parseInt(txtCantidad721.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_PG_72,
				Integer.parseInt(txtCantidad720.getText()), Integer.parseInt(txtCantidad721.getText()),
				txtObs72.getText(), updateFicha, porcentajeAvance));

		return listaDetalles;
	}

	public void llenarFicha() {
		List<TdetalleFicha> listaDetalles = servFicha.detallesFicha(gettCabecera(), ficha);
		try {
			txtCantidad01.setText(String.valueOf(listaDetalles.get(0).getDetCantidadEjecutada()));
			txtCantidad11.setText(String.valueOf(listaDetalles.get(1).getDetCantidadEjecutada()));
			txtCantidad21.setText(String.valueOf(listaDetalles.get(2).getDetCantidadEjecutada()));
			txtCantidad31.setText(String.valueOf(listaDetalles.get(3).getDetCantidadEjecutada()));
			txtCantidad41.setText(String.valueOf(listaDetalles.get(4).getDetCantidadEjecutada()));
			txtCantidad51.setText(String.valueOf(listaDetalles.get(5).getDetCantidadEjecutada()));
			txtCantidad61.setText(String.valueOf(listaDetalles.get(6).getDetCantidadEjecutada()));
			txtCantidad71.setText(String.valueOf(listaDetalles.get(7).getDetCantidadEjecutada()));
			txtCantidad81.setText(String.valueOf(listaDetalles.get(8).getDetCantidadEjecutada()));
			txtCantidad91.setText(String.valueOf(listaDetalles.get(9).getDetCantidadEjecutada()));
			txtCantidad101.setText(String.valueOf(listaDetalles.get(10).getDetCantidadEjecutada()));
			txtCantidad111.setText(String.valueOf(listaDetalles.get(11).getDetCantidadEjecutada()));
			txtCantidad121.setText(String.valueOf(listaDetalles.get(12).getDetCantidadEjecutada()));
			txtCantidad131.setText(String.valueOf(listaDetalles.get(13).getDetCantidadEjecutada()));
			txtCantidad141.setText(String.valueOf(listaDetalles.get(14).getDetCantidadEjecutada()));
			txtCantidad151.setText(String.valueOf(listaDetalles.get(15).getDetCantidadEjecutada()));
			txtCantidad161.setText(String.valueOf(listaDetalles.get(16).getDetCantidadEjecutada()));
			txtCantidad171.setText(String.valueOf(listaDetalles.get(17).getDetCantidadEjecutada()));
			txtCantidad181.setText(String.valueOf(listaDetalles.get(18).getDetCantidadEjecutada()));
			txtCantidad191.setText(String.valueOf(listaDetalles.get(19).getDetCantidadEjecutada()));
			txtCantidad201.setText(String.valueOf(listaDetalles.get(20).getDetCantidadEjecutada()));
			txtCantidad211.setText(String.valueOf(listaDetalles.get(21).getDetCantidadEjecutada()));
			txtCantidad221.setText(String.valueOf(listaDetalles.get(22).getDetCantidadEjecutada()));
			txtCantidad231.setText(String.valueOf(listaDetalles.get(23).getDetCantidadEjecutada()));
			txtCantidad241.setText(String.valueOf(listaDetalles.get(24).getDetCantidadEjecutada()));
			txtCantidad251.setText(String.valueOf(listaDetalles.get(25).getDetCantidadEjecutada()));
			txtCantidad261.setText(String.valueOf(listaDetalles.get(26).getDetCantidadEjecutada()));
			txtCantidad271.setText(String.valueOf(listaDetalles.get(27).getDetCantidadEjecutada()));
			txtCantidad281.setText(String.valueOf(listaDetalles.get(28).getDetCantidadEjecutada()));
			txtCantidad291.setText(String.valueOf(listaDetalles.get(29).getDetCantidadEjecutada()));
			txtCantidad301.setText(String.valueOf(listaDetalles.get(30).getDetCantidadEjecutada()));
			txtCantidad311.setText(String.valueOf(listaDetalles.get(31).getDetCantidadEjecutada()));
			txtCantidad321.setText(String.valueOf(listaDetalles.get(32).getDetCantidadEjecutada()));
			txtCantidad331.setText(String.valueOf(listaDetalles.get(33).getDetCantidadEjecutada()));
			txtCantidad341.setText(String.valueOf(listaDetalles.get(34).getDetCantidadEjecutada()));
			txtCantidad351.setText(String.valueOf(listaDetalles.get(35).getDetCantidadEjecutada()));
			txtCantidad361.setText(String.valueOf(listaDetalles.get(36).getDetCantidadEjecutada()));
			txtCantidad371.setText(String.valueOf(listaDetalles.get(37).getDetCantidadEjecutada()));
			txtCantidad381.setText(String.valueOf(listaDetalles.get(38).getDetCantidadEjecutada()));
			txtCantidad391.setText(String.valueOf(listaDetalles.get(39).getDetCantidadEjecutada()));
			txtCantidad401.setText(String.valueOf(listaDetalles.get(40).getDetCantidadEjecutada()));
			txtCantidad411.setText(String.valueOf(listaDetalles.get(41).getDetCantidadEjecutada()));
			txtCantidad421.setText(String.valueOf(listaDetalles.get(42).getDetCantidadEjecutada()));
			txtCantidad431.setText(String.valueOf(listaDetalles.get(43).getDetCantidadEjecutada()));
			txtCantidad441.setText(String.valueOf(listaDetalles.get(44).getDetCantidadEjecutada()));
			txtCantidad451.setText(String.valueOf(listaDetalles.get(45).getDetCantidadEjecutada()));
			txtCantidad461.setText(String.valueOf(listaDetalles.get(46).getDetCantidadEjecutada()));
			txtCantidad471.setText(String.valueOf(listaDetalles.get(47).getDetCantidadEjecutada()));
			txtCantidad481.setText(String.valueOf(listaDetalles.get(48).getDetCantidadEjecutada()));
			txtCantidad491.setText(String.valueOf(listaDetalles.get(49).getDetCantidadEjecutada()));
			txtCantidad501.setText(String.valueOf(listaDetalles.get(50).getDetCantidadEjecutada()));
			txtCantidad511.setText(String.valueOf(listaDetalles.get(51).getDetCantidadEjecutada()));
			txtCantidad521.setText(String.valueOf(listaDetalles.get(52).getDetCantidadEjecutada()));
			txtCantidad531.setText(String.valueOf(listaDetalles.get(53).getDetCantidadEjecutada()));
			txtCantidad541.setText(String.valueOf(listaDetalles.get(54).getDetCantidadEjecutada()));
			txtCantidad551.setText(String.valueOf(listaDetalles.get(55).getDetCantidadEjecutada()));
			txtCantidad561.setText(String.valueOf(listaDetalles.get(56).getDetCantidadEjecutada()));
			txtCantidad571.setText(String.valueOf(listaDetalles.get(57).getDetCantidadEjecutada()));
			txtCantidad581.setText(String.valueOf(listaDetalles.get(58).getDetCantidadEjecutada()));
			txtCantidad591.setText(String.valueOf(listaDetalles.get(59).getDetCantidadEjecutada()));
			txtCantidad601.setText(String.valueOf(listaDetalles.get(60).getDetCantidadEjecutada()));
			txtCantidad611.setText(String.valueOf(listaDetalles.get(61).getDetCantidadEjecutada()));
			txtCantidad621.setText(String.valueOf(listaDetalles.get(62).getDetCantidadEjecutada()));
			txtCantidad631.setText(String.valueOf(listaDetalles.get(63).getDetCantidadEjecutada()));
			txtCantidad641.setText(String.valueOf(listaDetalles.get(64).getDetCantidadEjecutada()));
			txtCantidad651.setText(String.valueOf(listaDetalles.get(65).getDetCantidadEjecutada()));
			txtCantidad661.setText(String.valueOf(listaDetalles.get(66).getDetCantidadEjecutada()));
			txtCantidad671.setText(String.valueOf(listaDetalles.get(67).getDetCantidadEjecutada()));
			txtCantidad681.setText(String.valueOf(listaDetalles.get(68).getDetCantidadEjecutada()));
			txtCantidad691.setText(String.valueOf(listaDetalles.get(69).getDetCantidadEjecutada()));
			txtCantidad701.setText(String.valueOf(listaDetalles.get(70).getDetCantidadEjecutada()));
			txtCantidad711.setText(String.valueOf(listaDetalles.get(71).getDetCantidadEjecutada()));
			txtCantidad721.setText(String.valueOf(listaDetalles.get(72).getDetCantidadEjecutada()));
			txtCantidad731.setText(String.valueOf(listaDetalles.get(73).getDetCantidadEjecutada()));
			txtCantidad741.setText(String.valueOf(listaDetalles.get(74).getDetCantidadEjecutada()));
			txtCantidad751.setText(String.valueOf(listaDetalles.get(75).getDetCantidadEjecutada()));
			txtCantidad761.setText(String.valueOf(listaDetalles.get(76).getDetCantidadEjecutada()));
			txtCantidad771.setText(String.valueOf(listaDetalles.get(77).getDetCantidadEjecutada()));
			txtCantidad781.setText(String.valueOf(listaDetalles.get(78).getDetCantidadEjecutada()));

			txtObs0.setText(listaDetalles.get(0).getDetObsRef());
			txtObs1.setText(listaDetalles.get(1).getDetObsRef());
			txtObs2.setText(listaDetalles.get(2).getDetObsRef());
			txtObs3.setText(listaDetalles.get(3).getDetObsRef());
			txtObs4.setText(listaDetalles.get(4).getDetObsRef());
			txtObs5.setText(listaDetalles.get(5).getDetObsRef());
			txtObs6.setText(listaDetalles.get(6).getDetObsRef());
			txtObs7.setText(listaDetalles.get(7).getDetObsRef());
			txtObs8.setText(listaDetalles.get(8).getDetObsRef());
			txtObs9.setText(listaDetalles.get(9).getDetObsRef());
			txtObs10.setText(listaDetalles.get(10).getDetObsRef());
			txtObs11.setText(listaDetalles.get(11).getDetObsRef());
			txtObs12.setText(listaDetalles.get(12).getDetObsRef());
			txtObs13.setText(listaDetalles.get(13).getDetObsRef());
			txtObs14.setText(listaDetalles.get(14).getDetObsRef());
			txtObs15.setText(listaDetalles.get(15).getDetObsRef());
			txtObs16.setText(listaDetalles.get(16).getDetObsRef());
			txtObs17.setText(listaDetalles.get(17).getDetObsRef());
			txtObs18.setText(listaDetalles.get(18).getDetObsRef());
			txtObs19.setText(listaDetalles.get(19).getDetObsRef());
			txtObs20.setText(listaDetalles.get(20).getDetObsRef());
			txtObs21.setText(listaDetalles.get(21).getDetObsRef());
			txtObs22.setText(listaDetalles.get(22).getDetObsRef());
			txtObs23.setText(listaDetalles.get(23).getDetObsRef());
			txtObs24.setText(listaDetalles.get(24).getDetObsRef());
			txtObs25.setText(listaDetalles.get(25).getDetObsRef());
			txtObs26.setText(listaDetalles.get(26).getDetObsRef());
			txtObs27.setText(listaDetalles.get(27).getDetObsRef());
			txtObs28.setText(listaDetalles.get(28).getDetObsRef());
			txtObs29.setText(listaDetalles.get(29).getDetObsRef());
			txtObs30.setText(listaDetalles.get(30).getDetObsRef());
			txtObs31.setText(listaDetalles.get(31).getDetObsRef());
			txtObs32.setText(listaDetalles.get(32).getDetObsRef());
			txtObs33.setText(listaDetalles.get(33).getDetObsRef());
			txtObs34.setText(listaDetalles.get(34).getDetObsRef());
			txtObs35.setText(listaDetalles.get(35).getDetObsRef());
			txtObs36.setText(listaDetalles.get(36).getDetObsRef());
			txtObs37.setText(listaDetalles.get(37).getDetObsRef());
			txtObs38.setText(listaDetalles.get(38).getDetObsRef());
			txtObs39.setText(listaDetalles.get(39).getDetObsRef());
			txtObs40.setText(listaDetalles.get(40).getDetObsRef());
			txtObs41.setText(listaDetalles.get(41).getDetObsRef());
			txtObs42.setText(listaDetalles.get(42).getDetObsRef());
			txtObs43.setText(listaDetalles.get(43).getDetObsRef());
			txtObs44.setText(listaDetalles.get(44).getDetObsRef());
			txtObs45.setText(listaDetalles.get(45).getDetObsRef());
			txtObs46.setText(listaDetalles.get(46).getDetObsRef());
			txtObs47.setText(listaDetalles.get(47).getDetObsRef());
			txtObs48.setText(listaDetalles.get(48).getDetObsRef());
			txtObs49.setText(listaDetalles.get(49).getDetObsRef());
			txtObs50.setText(listaDetalles.get(50).getDetObsRef());
			txtObs51.setText(listaDetalles.get(51).getDetObsRef());
			txtObs52.setText(listaDetalles.get(52).getDetObsRef());
			txtObs53.setText(listaDetalles.get(53).getDetObsRef());
			txtObs54.setText(listaDetalles.get(54).getDetObsRef());
			txtObs55.setText(listaDetalles.get(55).getDetObsRef());
			txtObs56.setText(listaDetalles.get(56).getDetObsRef());
			txtObs57.setText(listaDetalles.get(57).getDetObsRef());
			txtObs58.setText(listaDetalles.get(58).getDetObsRef());
			txtObs59.setText(listaDetalles.get(59).getDetObsRef());
			txtObs60.setText(listaDetalles.get(60).getDetObsRef());
			txtObs61.setText(listaDetalles.get(61).getDetObsRef());
			txtObs62.setText(listaDetalles.get(62).getDetObsRef());
			txtObs63.setText(listaDetalles.get(63).getDetObsRef());
			txtObs64.setText(listaDetalles.get(64).getDetObsRef());
			txtObs65.setText(listaDetalles.get(65).getDetObsRef());
			txtObs66.setText(listaDetalles.get(66).getDetObsRef());
			txtObs67.setText(listaDetalles.get(67).getDetObsRef());
			txtObs68.setText(listaDetalles.get(68).getDetObsRef());
			txtObs69.setText(listaDetalles.get(69).getDetObsRef());
			txtObs70.setText(listaDetalles.get(70).getDetObsRef());
			txtObs71.setText(listaDetalles.get(71).getDetObsRef());
			txtObs72.setText(listaDetalles.get(72).getDetObsRef());
			txtObs73.setText(listaDetalles.get(73).getDetObsRef());
			txtObs74.setText(listaDetalles.get(74).getDetObsRef());
			txtObs75.setText(listaDetalles.get(75).getDetObsRef());
			txtObs76.setText(listaDetalles.get(76).getDetObsRef());
			txtObs77.setText(listaDetalles.get(77).getDetObsRef());
			txtObs78.setText(listaDetalles.get(78).getDetObsRef());
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			txtCantidad01.setText(String.valueOf(0));
			txtCantidad11.setText(String.valueOf(0));
			txtCantidad21.setText(String.valueOf(0));
			txtCantidad31.setText(String.valueOf(0));
			txtCantidad41.setText(String.valueOf(0));
			txtCantidad51.setText(String.valueOf(0));
			txtCantidad61.setText(String.valueOf(0));
			txtCantidad71.setText(String.valueOf(0));
			txtCantidad81.setText(String.valueOf(0));
			txtCantidad91.setText(String.valueOf(0));
			txtCantidad101.setText(String.valueOf(0));
			txtCantidad111.setText(String.valueOf(0));
			txtCantidad121.setText(String.valueOf(0));
			txtCantidad131.setText(String.valueOf(0));
			txtCantidad141.setText(String.valueOf(0));
			txtCantidad151.setText(String.valueOf(0));
			txtCantidad161.setText(String.valueOf(0));
			txtCantidad171.setText(String.valueOf(0));
			txtCantidad181.setText(String.valueOf(0));
			txtCantidad191.setText(String.valueOf(0));
			txtCantidad201.setText(String.valueOf(0));
			txtCantidad211.setText(String.valueOf(0));
			txtCantidad221.setText(String.valueOf(0));
			txtCantidad231.setText(String.valueOf(0));
			txtCantidad241.setText(String.valueOf(0));
			txtCantidad251.setText(String.valueOf(0));
			txtCantidad261.setText(String.valueOf(0));
			txtCantidad271.setText(String.valueOf(0));
			txtCantidad281.setText(String.valueOf(0));
			txtCantidad291.setText(String.valueOf(0));
			txtCantidad301.setText(String.valueOf(0));
			txtCantidad311.setText(String.valueOf(0));
			txtCantidad321.setText(String.valueOf(0));
			txtCantidad331.setText(String.valueOf(0));
			txtCantidad341.setText(String.valueOf(0));
			txtCantidad351.setText(String.valueOf(0));
			txtCantidad361.setText(String.valueOf(0));
			txtCantidad371.setText(String.valueOf(0));
			txtCantidad381.setText(String.valueOf(0));
			txtCantidad391.setText(String.valueOf(0));
			txtCantidad401.setText(String.valueOf(0));
			txtCantidad411.setText(String.valueOf(0));
			txtCantidad421.setText(String.valueOf(0));
			txtCantidad431.setText(String.valueOf(0));
			txtCantidad441.setText(String.valueOf(0));
			txtCantidad451.setText(String.valueOf(0));
			txtCantidad461.setText(String.valueOf(0));
			txtCantidad471.setText(String.valueOf(0));
			txtCantidad481.setText(String.valueOf(0));
			txtCantidad491.setText(String.valueOf(0));
			txtCantidad501.setText(String.valueOf(0));
			txtCantidad511.setText(String.valueOf(0));
			txtCantidad521.setText(String.valueOf(0));
			txtCantidad531.setText(String.valueOf(0));
			txtCantidad541.setText(String.valueOf(0));
			txtCantidad551.setText(String.valueOf(0));
			txtCantidad561.setText(String.valueOf(0));
			txtCantidad571.setText(String.valueOf(0));
			txtCantidad581.setText(String.valueOf(0));
			txtCantidad591.setText(String.valueOf(0));
			txtCantidad601.setText(String.valueOf(0));
			txtCantidad611.setText(String.valueOf(0));
			txtCantidad621.setText(String.valueOf(0));
			txtCantidad631.setText(String.valueOf(0));
			txtCantidad641.setText(String.valueOf(0));
			txtCantidad651.setText(String.valueOf(0));
			txtCantidad661.setText(String.valueOf(0));
			txtCantidad671.setText(String.valueOf(0));
			txtCantidad681.setText(String.valueOf(0));
			txtCantidad691.setText(String.valueOf(0));
			txtCantidad701.setText(String.valueOf(0));
			txtCantidad711.setText(String.valueOf(0));
			txtCantidad721.setText(String.valueOf(0));
			txtCantidad731.setText(String.valueOf(0));
			txtCantidad741.setText(String.valueOf(0));
			txtCantidad751.setText(String.valueOf(0));
			txtCantidad761.setText(String.valueOf(0));
			txtCantidad771.setText(String.valueOf(0));
			txtCantidad781.setText(String.valueOf(0));

			txtObs0.setText("");
			txtObs1.setText("");
			txtObs2.setText("");
			txtObs3.setText("");
			txtObs4.setText("");
			txtObs5.setText("");
			txtObs6.setText("");
			txtObs7.setText("");
			txtObs8.setText("");
			txtObs9.setText("");
			txtObs10.setText("");
			txtObs11.setText("");
			txtObs12.setText("");
			txtObs13.setText("");
			txtObs14.setText("");
			txtObs15.setText("");
			txtObs16.setText("");
			txtObs17.setText("");
			txtObs18.setText("");
			txtObs19.setText("");
			txtObs20.setText("");
			txtObs21.setText("");
			txtObs22.setText("");
			txtObs23.setText("");
			txtObs24.setText("");
			txtObs25.setText("");
			txtObs26.setText("");
			txtObs27.setText("");
			txtObs28.setText("");
			txtObs29.setText("");
			txtObs30.setText("");
			txtObs31.setText("");
			txtObs32.setText("");
			txtObs33.setText("");
			txtObs34.setText("");
			txtObs35.setText("");
			txtObs36.setText("");
			txtObs37.setText("");
			txtObs38.setText("");
			txtObs39.setText("");
			txtObs40.setText("");
			txtObs41.setText("");
			txtObs42.setText("");
			txtObs43.setText("");
			txtObs44.setText("");
			txtObs45.setText("");
			txtObs46.setText("");
			txtObs47.setText("");
			txtObs48.setText("");
			txtObs49.setText("");
			txtObs50.setText("");
			txtObs51.setText("");
			txtObs52.setText("");
			txtObs53.setText("");
			txtObs54.setText("");
			txtObs55.setText("");
			txtObs56.setText("");
			txtObs57.setText("");
			txtObs58.setText("");
			txtObs59.setText("");
			txtObs60.setText("");
			txtObs61.setText("");
			txtObs62.setText("");
			txtObs63.setText("");
			txtObs64.setText("");
			txtObs65.setText("");
			txtObs66.setText("");
			txtObs67.setText("");
			txtObs68.setText("");
			txtObs69.setText("");
			txtObs70.setText("");
			txtObs71.setText("");
			txtObs72.setText("");
			txtObs73.setText("");
			txtObs74.setText("");
			txtObs75.setText("");
			txtObs76.setText("");
			txtObs77.setText("");
			txtObs78.setText("");
		}
	}

	public JTextField txtCantidad(int i, int constante, int cantidadEjecutada) {
		String concatenar = i + "" + constante;
		JTextField txtCantidad = new JTextField(Integer.valueOf(concatenar));
		txtCantidad.setText(String.valueOf(cantidadEjecutada));
		return txtCantidad;
	}

	public JTextField txtObs(int i) {
		return new JTextField(Integer.valueOf(i));
	}
}
