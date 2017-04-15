package com.capa.presentacion;

import static com.capa.negocios.Calculos.calcularPorcentajeAvance;
import static com.capa.util.Utilitarios.cargarInfoObligatoria;
import static com.capa.util.Utilitarios.gettCabecera;
import static com.capa.util.Utilitarios.llenarCabecera;
import static com.capa.util.Validaciones.validarInfo;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.math.BigDecimal;
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
import javax.swing.border.TitledBorder;

import com.capa.datos.TCabecera;
import com.capa.datos.TFicha;
import com.capa.datos.TGrupo;
import com.capa.datos.TInformacionObligatoria;
import com.capa.datos.TdetalleFicha;
import com.capa.negocios.ComponenteFicha;
import com.capa.negocios.ComponenteInfoObligatoria;
import com.capa.negocios.ServicioFicha;
import com.capa.negocios.ServicioInfoObligatoria;
import com.capa.presentacion.InformacionObligatoriaV;

public class MmTemplate extends JFrame {
	// public MMTemplate() {
	// }

	private static final long serialVersionUID = -3891089127852241756L;
	private JPanel contentPane;
	private JTextField txtCantidad00;
	private JTextField txtCantidad01;
	private JTextField txtCantidad10;
	private JTextField txtCantidad11;
	private JTextField txtCantidad20;
	private JTextField txtCantidad21;
	private JTextField txtCantidad30;
	private JTextField txtCantidad31;
	private JTextField txtObs0;
	private JTextField txtObs1;
	private JTextField txtObs2;
	private JTextField txtObs3;
	private JTextField txtObs4;
	private JTextField txtCantidad40;
	private JTextField txtCantidad41;
	private JTextField txtCantidad50;
	private JTextField txtCantidad51;
	private JTextField txtObs5;

	private JTextField txtCantidad60;
	private JTextField txtCantidad61;

	private JTextField txtObs6;

	private JTextField txtCantidad70;
	private JTextField txtCantidad71;
	private JTextField txtCantidad80;
	private JTextField txtCantidad81;

	private JTextField txtObs7;
	private JTextField txtObs8;

	private JLabel lblKitParaConexin;

	private JTextField txtCantidad90;
	private JTextField txtCantidad91;
	private JTextField txtObs9;
	private JTextField txtCantidad100;
	private JTextField txtCantidad101;
	private JTextField txtObs10;
	private JTextField txtCantidad110;
	private JTextField txtCantidad111;
	private JTextField txtCantidad120;
	private JTextField txtCantidad121;
	private JTextField txtObs11;
	private JTextField txtObs12;
	private JTextField txtCantidad150;
	private JTextField txtCantidad151;
	private JTextField txtObs15;
	private JTextField txtCantidad160;
	private JTextField txtCantidad161;
	private JPanel panel_45;
	private JTextField txtObs16;
	private JTextField txtCantidad170;
	private JTextField txtCantidad171;
	private JTextField txtObs17;
	private JTextField txtCantidad180;
	private JTextField txtCantidad181;
	private JTextField txtCantidad190;
	private JTextField txtCantidad191;
	private JTextField txtObs18;
	private JTextField txtObs19;
	private JTextField txtCantidad200;
	private JTextField txtCantidad201;
	private JTextField txtObs20;
	private JTextField txtCantidad210;
	private JTextField txtCantidad211;
	private JTextField txtObs21;
	private JTextField txtCantidad260;
	private JTextField txtCantidad261;
	private JTextField txtCantidad270;
	private JTextField txtCantidad271;
	private JTextField txtCantidad280;
	private JTextField txtCantidad281;
	private JTextField txtCantidad290;
	private JTextField txtCantidad291;
	private JTextField txtObs26;
	private JTextField txtObs27;
	private JTextField txtObs28;
	private JTextField txtObs30;
	private JTextField txtCantidad300;
	private JTextField txtCantidad301;
	private JTextField txtObs29;
	private JTextField txtCantidad390;
	private JTextField txtCantidad391;
	private JTextField txtCantidad400;
	private JTextField txtCantidad401;
	private JTextField txtCantidad410;
	private JTextField txtCantidad411;
	private JTextField txtCantidad420;
	private JTextField txtCantidad421;
	private JTextField txtObs39;
	private JTextField txtObs40;
	private JTextField txtObs41;
	private JTextField txtObs50;
	private JTextField txtCantidad430;
	private JTextField txtCantidad431;
	private JTextField txtCantidad440;
	private JTextField txtCantidad441;
	private JTextField txtCantidad450;
	private JTextField txtCantidad451;
	private JTextField txtCantidad460;
	private JTextField txtCantidad461;
	private JTextField txtCantidad470;
	private JTextField txtCantidad471;
	private JTextField txtCantidad480;
	private JTextField txtCantidad481;
	private JTextField txtCantidad490;
	private JTextField txtCantidad491;
	private JTextField txtCantidad501;
	private JTextField txtCantidad500;
	private JTextField txtObs42;
	private JTextField txtObs43;
	private JTextField txtObs44;
	private JTextField txtObs45;
	private JTextField txtObs46;
	private JTextField txtObs47;
	private JTextField txtObs48;
	private JTextField txtObs49;
	private JTextField txtCantidad130;
	private JTextField txtCantidad131;
	private JTextField txtObs13;
	private JTextField txtCantidad140;
	private JTextField txtCantidad141;
	private JTextField txtObs14;
	private JTextField txtCantidad220;
	private JTextField txtCantidad221;
	private JTextField txtCantidad230;
	private JTextField txtCantidad231;
	private JTextField txtCantidad240;
	private JTextField txtCantidad241;
	private JTextField txtObs22;
	private JTextField txtObs23;
	private JTextField txtObs24;
	private JTextField txtCantidad250;
	private JTextField txtCantidad251;
	private JTextField txtObs25;
	private JTextField txtCantidad310;
	private JTextField txtCantidad311;
	private JTextField txtCantidad320;
	private JTextField txtCantidad321;
	private JTextField txtCantidad330;
	private JTextField txtCantidad331;
	private JTextField txtCantidad340;
	private JTextField txtCantidad341;
	private JTextField txtObs31;
	private JTextField txtObs32;
	private JTextField txtObs33;
	private JTextField txtObs34;
	private JTextField txtCantidad350;
	private JTextField txtCantidad351;
	private JTextField txtCantidad360;
	private JTextField txtCantidad361;
	private JTextField txtCantidad370;
	private JTextField txtCantidad371;
	private JTextField txtObs35;
	private JTextField txtObs36;
	private JTextField txtObs37;
	private JTextField txtCantidad380;
	private JTextField txtCantidad381;
	private JTextField txtObs38;
	private TFicha ficha;
	ServicioFicha srvFicha;

	public MmTemplate(TFicha ficha) {

		this.ficha = ficha;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1311, 706);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		this.setResizable(false);
		this.setLocationRelativeTo(null);
		srvFicha = new ComponenteFicha();

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 125, 1284, 540);
		contentPane.add(tabbedPane);

		JPanel panelLab1 = new JPanel();
		tabbedPane.addTab("1.- MM laboratorio-1", null, panelLab1, null);
		panelLab1.setLayout(null);

		JLabel label_13 = new JLabel("Observaci\u00F3n/Referencia");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Arial", Font.BOLD, 11));
		label_13.setBounds(1281, 11, 153, 14);
		panelLab1.add(label_13);

		JPanel pnlKitElectrico = new JPanel();
		pnlKitElectrico.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlKitElectrico.setBounds(10, 11, 414, 96);
		panelLab1.add(pnlKitElectrico);
		pnlKitElectrico.setLayout(null);

		JPanel pnlEtiquetas00 = new JPanel();
		pnlEtiquetas00.setBounds(2, 14, 191, 80);
		pnlKitElectrico.add(pnlEtiquetas00);
		pnlEtiquetas00.setLayout(new GridLayout(4, 1, 0, 0));

		JLabel lblKitCableElctrico = new JLabel("Kit cable eléctrico  ");
		lblKitCableElctrico.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKitCableElctrico.setFont(new Font("Arial", Font.PLAIN, 11));
		pnlEtiquetas00.add(lblKitCableElctrico);

		JLabel lblInterruptor = new JLabel("Interruptor  ");
		lblInterruptor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblInterruptor.setFont(new Font("Arial", Font.PLAIN, 11));
		pnlEtiquetas00.add(lblInterruptor);

		JLabel lblTomacorrientes = new JLabel("Tomacorrientes  ");
		lblTomacorrientes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTomacorrientes.setFont(new Font("Arial", Font.PLAIN, 11));
		pnlEtiquetas00.add(lblTomacorrientes);

		JLabel lblLuminariasLed = new JLabel("Luminarias LED 60 w - 5000 lum  ");
		lblLuminariasLed.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLuminariasLed.setFont(new Font("Arial", Font.PLAIN, 11));
		pnlEtiquetas00.add(lblLuminariasLed);

		JPanel pnlCantidadidad00 = new JPanel();
		pnlCantidadidad00.setBounds(195, 14, 50, 80);
		pnlKitElectrico.add(pnlCantidadidad00);
		pnlCantidadidad00.setLayout(new GridLayout(4, 2, 0, 0));

		txtCantidad00 = new JTextField();
		txtCantidad00.setText("9");
		txtCantidad00.setEditable(false);
		txtCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad00.setColumns(10);
		pnlCantidadidad00.add(txtCantidad00);

		txtCantidad01 = new JTextField();
		txtCantidad01.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad01.setColumns(10);
		pnlCantidadidad00.add(txtCantidad01);

		txtCantidad10 = new JTextField();
		txtCantidad10.setText("8");
		txtCantidad10.setEditable(false);
		txtCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad10.setColumns(10);
		pnlCantidadidad00.add(txtCantidad10);

		txtCantidad11 = new JTextField();
		txtCantidad11.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad11.setColumns(10);
		pnlCantidadidad00.add(txtCantidad11);

		txtCantidad20 = new JTextField();
		txtCantidad20.setText("1");
		txtCantidad20.setEditable(false);
		txtCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad20.setColumns(10);
		pnlCantidadidad00.add(txtCantidad20);

		txtCantidad21 = new JTextField();
		txtCantidad21.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad21.setColumns(10);
		pnlCantidadidad00.add(txtCantidad21);

		txtCantidad30 = new JTextField();
		txtCantidad30.setText("1");
		txtCantidad30.setEditable(false);
		txtCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad30.setColumns(10);
		pnlCantidadidad00.add(txtCantidad30);

		txtCantidad31 = new JTextField();
		txtCantidad31.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad31.setColumns(10);
		pnlCantidadidad00.add(txtCantidad31);

		JPanel pnlObsRef00 = new JPanel();
		pnlObsRef00.setBounds(248, 14, 162, 80);
		pnlKitElectrico.add(pnlObsRef00);
		pnlObsRef00.setLayout(new GridLayout(4, 1, 0, 0));

		txtObs0 = new JTextField();
		txtObs0.setColumns(10);
		pnlObsRef00.add(txtObs0);

		txtObs1 = new JTextField();
		txtObs1.setColumns(10);
		pnlObsRef00.add(txtObs1);

		txtObs2 = new JTextField();
		txtObs2.setColumns(10);
		pnlObsRef00.add(txtObs2);

		txtObs3 = new JTextField();
		txtObs3.setColumns(10);
		pnlObsRef00.add(txtObs3);

		JLabel lblKitElctrico = new JLabel("  KIT ELÉCTRICO");
		lblKitElctrico.setHorizontalAlignment(SwingConstants.LEFT);
		lblKitElctrico.setFont(new Font("Arial", Font.BOLD, 11));
		lblKitElctrico.setBounds(0, 0, 191, 14);
		pnlKitElectrico.add(lblKitElctrico);

		JLabel label_24 = new JLabel("Cantidadidad");
		label_24.setHorizontalAlignment(SwingConstants.LEFT);
		label_24.setFont(new Font("Arial", Font.BOLD, 11));
		label_24.setBounds(195, 0, 60, 14);
		pnlKitElectrico.add(label_24);

		JLabel label_25 = new JLabel("Observación/Referencia");
		label_25.setHorizontalAlignment(SwingConstants.LEFT);
		label_25.setFont(new Font("Arial", Font.BOLD, 11));
		label_25.setBounds(258, 0, 190, 14);
		pnlKitElectrico.add(label_25);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 118, 414, 36);
		panelLab1.add(panel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(2, 14, 191, 20);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblFregadero = new JLabel("Fregadero  ");
		lblFregadero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFregadero.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_1.add(lblFregadero);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(195, 14, 50, 20);
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad40 = new JTextField();
		txtCantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad40.setText("2");
		txtCantidad40.setEditable(false);
		txtCantidad40.setColumns(10);
		panel_2.add(txtCantidad40);

		txtCantidad41 = new JTextField();
		txtCantidad41.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad41.setColumns(10);
		panel_2.add(txtCantidad41);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(248, 14, 162, 20);
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 1, 0, 0));

		txtObs4 = new JTextField();
		txtObs4.setColumns(10);
		panel_3.add(txtObs4);

		JLabel label_8 = new JLabel("Cantidadidad");
		label_8.setHorizontalAlignment(SwingConstants.LEFT);
		label_8.setFont(new Font("Arial", Font.BOLD, 11));
		label_8.setBounds(195, 0, 60, 14);
		panel.add(label_8);

		JLabel label_17 = new JLabel("Observación/Referencia");
		label_17.setHorizontalAlignment(SwingConstants.LEFT);
		label_17.setFont(new Font("Arial", Font.BOLD, 11));
		label_17.setBounds(258, 0, 190, 14);
		panel.add(label_17);

		JLabel lblKitHidrosanitario = new JLabel("  KIT HIDROSANITARIO");
		lblKitHidrosanitario.setHorizontalAlignment(SwingConstants.LEFT);
		lblKitHidrosanitario.setFont(new Font("Arial", Font.BOLD, 11));
		lblKitHidrosanitario.setBounds(2, 0, 191, 14);
		panel.add(lblKitHidrosanitario);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(10, 165, 414, 177);
		panelLab1.add(panel_4);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(2, 14, 191, 20);
		panel_4.add(panel_5);
		panel_5.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel label = new JLabel("Canal plástico PVC de L=3m");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_5.add(label);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(195, 14, 50, 20);
		panel_4.add(panel_6);
		panel_6.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad50 = new JTextField();
		txtCantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad50.setText("3");
		txtCantidad50.setEditable(false);
		txtCantidad50.setColumns(10);
		panel_6.add(txtCantidad50);

		txtCantidad51 = new JTextField();
		txtCantidad51.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad51.setColumns(10);
		panel_6.add(txtCantidad51);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(248, 14, 162, 20);
		panel_4.add(panel_7);
		panel_7.setLayout(new GridLayout(1, 1, 0, 0));

		txtObs5 = new JTextField();
		txtObs5.setColumns(10);
		panel_7.add(txtObs5);

		JLabel label_1 = new JLabel("Cantidadidad");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("Arial", Font.BOLD, 11));
		label_1.setBounds(195, 0, 60, 14);
		panel_4.add(label_1);

		JLabel label_2 = new JLabel("Observación/Referencia");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setFont(new Font("Arial", Font.BOLD, 11));
		label_2.setBounds(258, 0, 190, 14);
		panel_4.add(label_2);

		JLabel label_3 = new JLabel("  KIT AGUA LLUVIA");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("Arial", Font.BOLD, 11));
		label_3.setBounds(2, 0, 191, 14);
		panel_4.add(label_3);

		JPanel panel_9 = new JPanel();
		panel_9.setBounds(2, 34, 191, 60);
		panel_4.add(panel_9);
		panel_9.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblkitDeAccesorios = new JLabel(
				"<html><body><p align=\"right\">Kit de Accesorios de Conexión Agua de Lluvia (2 rejilla, 4 codos 90°,1/4 gl polipega, tornillos, abrazaderas</body></html>)");
		lblkitDeAccesorios.setHorizontalAlignment(SwingConstants.RIGHT);
		lblkitDeAccesorios.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_9.add(lblkitDeAccesorios);

		JPanel panel_10 = new JPanel();
		panel_10.setBounds(195, 50, 50, 20);
		panel_4.add(panel_10);
		panel_10.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad60 = new JTextField();
		txtCantidad60.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad60.setText("2");
		txtCantidad60.setEditable(false);
		txtCantidad60.setColumns(10);
		panel_10.add(txtCantidad60);

		txtCantidad61 = new JTextField();
		txtCantidad61.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad61.setColumns(10);
		panel_10.add(txtCantidad61);

		JPanel panel_11 = new JPanel();
		panel_11.setBounds(248, 50, 162, 20);
		panel_4.add(panel_11);
		panel_11.setLayout(new GridLayout(1, 1, 0, 0));

		txtObs6 = new JTextField();
		txtObs6.setColumns(10);
		panel_11.add(txtObs6);

		JPanel panel_8 = new JPanel();
		panel_8.setBounds(2, 94, 191, 40);
		panel_4.add(panel_8);
		panel_8.setLayout(new GridLayout(2, 1, 0, 0));

		JLabel label_22 = new JLabel("Tubería de PVC 75 mm L=3m");
		label_22.setHorizontalAlignment(SwingConstants.RIGHT);
		label_22.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_8.add(label_22);

		JLabel label_23 = new JLabel("Tubería de PVC 75 mm L=0.6m");
		label_23.setHorizontalAlignment(SwingConstants.RIGHT);
		label_23.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_8.add(label_23);

		JPanel panel_12 = new JPanel();
		panel_12.setBounds(195, 94, 50, 40);
		panel_4.add(panel_12);
		panel_12.setLayout(new GridLayout(2, 2, 0, 0));

		txtCantidad70 = new JTextField();
		txtCantidad70.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad70.setText("2");
		txtCantidad70.setEditable(false);
		txtCantidad70.setColumns(10);
		panel_12.add(txtCantidad70);

		txtCantidad71 = new JTextField();
		txtCantidad71.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad71.setColumns(10);
		panel_12.add(txtCantidad71);

		txtCantidad80 = new JTextField();
		txtCantidad80.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad80.setText("1");
		txtCantidad80.setEditable(false);
		txtCantidad80.setColumns(10);
		panel_12.add(txtCantidad80);

		txtCantidad81 = new JTextField();
		txtCantidad81.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad81.setColumns(10);
		panel_12.add(txtCantidad81);

		JPanel panel_13 = new JPanel();
		panel_13.setBounds(248, 94, 162, 40);
		panel_4.add(panel_13);
		panel_13.setLayout(new GridLayout(2, 1, 0, 0));

		txtObs7 = new JTextField();
		txtObs7.setColumns(10);
		panel_13.add(txtObs7);

		txtObs8 = new JTextField();
		txtObs8.setColumns(10);
		panel_13.add(txtObs8);

		JPanel panel_14 = new JPanel();
		panel_14.setBounds(2, 134, 191, 40);
		panel_4.add(panel_14);
		panel_14.setLayout(new GridLayout(1, 1, 0, 0));

		lblKitParaConexin = new JLabel(
				"<html><body><p align=\"right\"> Kit para conexión de tubería 75 mm. (lija pliego, polipega 1/4gal,1 codo 90°)</body></html>");
		lblKitParaConexin.setHorizontalAlignment(SwingConstants.LEFT);
		lblKitParaConexin.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_14.add(lblKitParaConexin);

		JPanel panel_15 = new JPanel();
		panel_15.setBounds(195, 144, 50, 20);
		panel_4.add(panel_15);
		panel_15.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad90 = new JTextField();
		txtCantidad90.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad90.setText("1");
		txtCantidad90.setEditable(false);
		txtCantidad90.setColumns(10);
		panel_15.add(txtCantidad90);

		txtCantidad91 = new JTextField();
		txtCantidad91.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad91.setColumns(10);
		panel_15.add(txtCantidad91);

		JPanel panel_16 = new JPanel();
		panel_16.setBounds(248, 144, 162, 20);
		panel_4.add(panel_16);
		panel_16.setLayout(new GridLayout(1, 1, 0, 0));

		txtObs9 = new JTextField();
		txtObs9.setColumns(10);
		panel_16.add(txtObs9);

		JPanel panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_17.setBounds(10, 353, 414, 151);
		panelLab1.add(panel_17);

		JPanel panel_18 = new JPanel();
		panel_18.setBounds(2, 14, 191, 85);
		panel_17.add(panel_18);
		panel_18.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblkitDeAccesorios_1 = new JLabel(
				"<html><body><p align=\"right\">Kit de Accesorios de Conexión Agua Potable (fregaderos)(2  te reducciones 3/4-1/2, 2 neplos,4 uniones de 1/2,4 codos de 90°,2 mangueras de abasto,2 llave de paso, teflón, pasta selladora)</body></html>");
		lblkitDeAccesorios_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblkitDeAccesorios_1.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_18.add(lblkitDeAccesorios_1);

		JPanel panel_19 = new JPanel();
		panel_19.setBounds(195, 47, 50, 20);
		panel_17.add(panel_19);
		panel_19.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad100 = new JTextField();
		txtCantidad100.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad100.setText("2");
		txtCantidad100.setEditable(false);
		txtCantidad100.setColumns(10);
		panel_19.add(txtCantidad100);

		txtCantidad101 = new JTextField();
		txtCantidad101.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad101.setColumns(10);
		panel_19.add(txtCantidad101);

		JPanel panel_20 = new JPanel();
		panel_20.setBounds(248, 47, 162, 20);
		panel_17.add(panel_20);
		panel_20.setLayout(new GridLayout(1, 1, 0, 0));

		txtObs10 = new JTextField();
		txtObs10.setColumns(10);
		panel_20.add(txtObs10);

		JLabel label_26 = new JLabel("Cantidadidad");
		label_26.setHorizontalAlignment(SwingConstants.LEFT);
		label_26.setFont(new Font("Arial", Font.BOLD, 11));
		label_26.setBounds(195, 0, 60, 14);
		panel_17.add(label_26);

		JLabel label_27 = new JLabel("Observación/Referencia");
		label_27.setHorizontalAlignment(SwingConstants.LEFT);
		label_27.setFont(new Font("Arial", Font.BOLD, 11));
		label_27.setBounds(258, 0, 190, 14);
		panel_17.add(label_27);

		JLabel lblKitAguaPotable = new JLabel("  KIT AGUA POTABLE");
		lblKitAguaPotable.setHorizontalAlignment(SwingConstants.LEFT);
		lblKitAguaPotable.setFont(new Font("Arial", Font.BOLD, 11));
		lblKitAguaPotable.setBounds(2, 0, 191, 14);
		panel_17.add(lblKitAguaPotable);

		JPanel panel_21 = new JPanel();
		panel_21.setBounds(2, 98, 191, 40);
		panel_17.add(panel_21);
		panel_21.setLayout(new GridLayout(2, 1, 0, 0));

		JLabel label_4 = new JLabel("Tubería de PVC  1/2\" y L=1.5m");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_21.add(label_4);

		JLabel label_29 = new JLabel("Tubería de PVC  3/4\" y L=3m");
		label_29.setHorizontalAlignment(SwingConstants.RIGHT);
		label_29.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_21.add(label_29);

		JPanel panel_22 = new JPanel();
		panel_22.setBounds(195, 98, 50, 40);
		panel_17.add(panel_22);
		panel_22.setLayout(new GridLayout(2, 2, 0, 0));

		txtCantidad110 = new JTextField();
		txtCantidad110.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad110.setText("1");
		txtCantidad110.setEditable(false);
		txtCantidad110.setColumns(10);
		panel_22.add(txtCantidad110);

		txtCantidad111 = new JTextField();
		txtCantidad111.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad111.setColumns(10);
		panel_22.add(txtCantidad111);

		txtCantidad120 = new JTextField();
		txtCantidad120.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad120.setText("3");
		txtCantidad120.setEditable(false);
		txtCantidad120.setColumns(10);
		panel_22.add(txtCantidad120);

		txtCantidad121 = new JTextField();
		txtCantidad121.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad121.setColumns(10);
		panel_22.add(txtCantidad121);

		JPanel panel_23 = new JPanel();
		panel_23.setBounds(248, 98, 162, 40);
		panel_17.add(panel_23);
		panel_23.setLayout(new GridLayout(2, 1, 0, 0));

		txtObs11 = new JTextField();
		txtObs11.setColumns(10);
		panel_23.add(txtObs11);

		txtObs12 = new JTextField();
		txtObs12.setColumns(10);
		panel_23.add(txtObs12);

		JPanel panel_79 = new JPanel();
		panel_79.setLayout(null);
		panel_79.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_79.setBounds(434, 11, 414, 96);
		panelLab1.add(panel_79);

		JLabel label_21 = new JLabel("Cantidadidad");
		label_21.setHorizontalAlignment(SwingConstants.LEFT);
		label_21.setFont(new Font("Arial", Font.BOLD, 11));
		label_21.setBounds(195, 0, 60, 14);
		panel_79.add(label_21);

		JLabel label_28 = new JLabel("Observación/Referencia");
		label_28.setHorizontalAlignment(SwingConstants.LEFT);
		label_28.setFont(new Font("Arial", Font.BOLD, 11));
		label_28.setBounds(258, 0, 190, 14);
		panel_79.add(label_28);

		JLabel lblKitAgua = new JLabel(".. KIT AGUA POTABLE");
		lblKitAgua.setHorizontalAlignment(SwingConstants.LEFT);
		lblKitAgua.setFont(new Font("Arial", Font.BOLD, 11));
		lblKitAgua.setBounds(2, 0, 191, 14);
		panel_79.add(lblKitAgua);

		JPanel panel_86 = new JPanel();
		panel_86.setBounds(2, 11, 191, 40);
		panel_79.add(panel_86);
		panel_86.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel label_74 = new JLabel(
				"<html><body><p align=\"right\">Kit para conexión de tubería 1/2\". (lija, pliego, polipega 1/4gal,3 uniones)</body></html>");
		label_74.setHorizontalAlignment(SwingConstants.RIGHT);
		label_74.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_86.add(label_74);

		JPanel panel_87 = new JPanel();
		panel_87.setBounds(195, 18, 50, 20);
		panel_79.add(panel_87);
		panel_87.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad130 = new JTextField();
		txtCantidad130.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad130.setText("1");
		txtCantidad130.setEditable(false);
		txtCantidad130.setColumns(10);
		panel_87.add(txtCantidad130);

		txtCantidad131 = new JTextField();
		txtCantidad131.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad131.setColumns(10);
		panel_87.add(txtCantidad131);

		JPanel panel_88 = new JPanel();
		panel_88.setBounds(248, 18, 162, 20);
		panel_79.add(panel_88);
		panel_88.setLayout(new GridLayout(1, 1, 0, 0));

		txtObs13 = new JTextField();
		txtObs13.setColumns(10);
		panel_88.add(txtObs13);

		JPanel panel_89 = new JPanel();
		panel_89.setBounds(2, 51, 191, 40);
		panel_79.add(panel_89);
		panel_89.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel label_75 = new JLabel(
				"<html><body><p align=\"right\"> Kit para conexión de tubería 3/4\". (lija, pliego, polipega 1/4gal,3 uniones)</body></html>");
		label_75.setHorizontalAlignment(SwingConstants.LEFT);
		label_75.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_89.add(label_75);

		JPanel panel_90 = new JPanel();
		panel_90.setBounds(195, 59, 50, 20);
		panel_79.add(panel_90);
		panel_90.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad140 = new JTextField();
		txtCantidad140.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad140.setText("1");
		txtCantidad140.setEditable(false);
		txtCantidad140.setColumns(10);
		panel_90.add(txtCantidad140);

		txtCantidad141 = new JTextField();
		txtCantidad141.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad141.setColumns(10);
		panel_90.add(txtCantidad141);

		JPanel panel_91 = new JPanel();
		panel_91.setBounds(248, 59, 162, 20);
		panel_79.add(panel_91);
		panel_91.setLayout(new GridLayout(1, 1, 0, 0));

		txtObs14 = new JTextField();
		txtObs14.setColumns(10);
		panel_91.add(txtObs14);

		JPanel panel_30 = new JPanel();
		panel_30.setLayout(null);
		panel_30.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_30.setBounds(433, 112, 414, 262);
		panelLab1.add(panel_30);

		JPanel panel_31 = new JPanel();
		panel_31.setBounds(2, 14, 191, 47);
		panel_30.add(panel_31);
		panel_31.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblkitDeAccesorios_2 = new JLabel(
				"<html><body><p align=\"right\">Kit de Accesorios de Conexión Agua Residual (CP)(2 codo 90°,2 rejilla,2 ye 75-110,1/4gl polipega)</body></html>");
		lblkitDeAccesorios_2.setVerticalAlignment(SwingConstants.TOP);
		lblkitDeAccesorios_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblkitDeAccesorios_2.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_31.add(lblkitDeAccesorios_2);

		JPanel panel_32 = new JPanel();
		panel_32.setBounds(195, 25, 50, 20);
		panel_30.add(panel_32);
		panel_32.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad150 = new JTextField();
		txtCantidad150.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad150.setText("2");
		txtCantidad150.setEditable(false);
		txtCantidad150.setColumns(10);
		panel_32.add(txtCantidad150);

		txtCantidad151 = new JTextField();
		txtCantidad151.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad151.setColumns(10);
		panel_32.add(txtCantidad151);

		JPanel panel_33 = new JPanel();
		panel_33.setBounds(248, 25, 162, 20);
		panel_30.add(panel_33);
		panel_33.setLayout(new GridLayout(1, 1, 0, 0));

		txtObs15 = new JTextField();
		txtObs15.setColumns(10);
		panel_33.add(txtObs15);

		JLabel label_7 = new JLabel("Cantidadidad");
		label_7.setHorizontalAlignment(SwingConstants.LEFT);
		label_7.setFont(new Font("Arial", Font.BOLD, 11));
		label_7.setBounds(195, 0, 60, 14);
		panel_30.add(label_7);

		JLabel label_30 = new JLabel("Observación/Referencia");
		label_30.setHorizontalAlignment(SwingConstants.LEFT);
		label_30.setFont(new Font("Arial", Font.BOLD, 11));
		label_30.setBounds(258, 0, 190, 14);
		panel_30.add(label_30);

		JLabel lblKitAguaResidual = new JLabel("  KIT AGUA RESIDUAL");
		lblKitAguaResidual.setHorizontalAlignment(SwingConstants.LEFT);
		lblKitAguaResidual.setFont(new Font("Arial", Font.BOLD, 11));
		lblKitAguaResidual.setBounds(2, 0, 191, 14);
		panel_30.add(lblKitAguaResidual);

		JPanel panel_43 = new JPanel();
		panel_43.setBounds(2, 67, 191, 20);
		panel_30.add(panel_43);
		panel_43.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel label_36 = new JLabel("Tubería de 50mm PVC y L=2m");
		label_36.setHorizontalAlignment(SwingConstants.RIGHT);
		label_36.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_43.add(label_36);

		JPanel panel_44 = new JPanel();
		panel_44.setBounds(195, 67, 50, 20);
		panel_30.add(panel_44);
		panel_44.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad160 = new JTextField();
		txtCantidad160.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad160.setText("1");
		txtCantidad160.setEditable(false);
		txtCantidad160.setColumns(10);
		panel_44.add(txtCantidad160);

		txtCantidad161 = new JTextField();
		txtCantidad161.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad161.setColumns(10);
		panel_44.add(txtCantidad161);

		panel_45 = new JPanel();
		panel_45.setBounds(248, 67, 162, 20);
		panel_30.add(panel_45);
		panel_45.setLayout(new GridLayout(1, 1, 0, 0));

		txtObs16 = new JTextField();
		txtObs16.setColumns(10);
		panel_45.add(txtObs16);

		JPanel panel_34 = new JPanel();
		panel_34.setBounds(2, 89, 191, 40);
		panel_30.add(panel_34);
		panel_34.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblkitDeAccesorios_3 = new JLabel(
				"<html><body><p align=\"right\">Kit de Accesorios de Conexión Agua Residual (Fregaderos)( 4codo 90°,1/4 gl polipega ,4 yee 50-110)</body></html>");
		lblkitDeAccesorios_3.setVerticalAlignment(SwingConstants.TOP);
		lblkitDeAccesorios_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblkitDeAccesorios_3.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_34.add(lblkitDeAccesorios_3);

		JPanel panel_35 = new JPanel();
		panel_35.setBounds(195, 96, 50, 20);
		panel_30.add(panel_35);
		panel_35.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad170 = new JTextField();
		txtCantidad170.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad170.setText("2");
		txtCantidad170.setEditable(false);
		txtCantidad170.setColumns(10);
		panel_35.add(txtCantidad170);

		txtCantidad171 = new JTextField();
		txtCantidad171.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad171.setColumns(10);
		panel_35.add(txtCantidad171);

		JPanel panel_36 = new JPanel();
		panel_36.setBounds(248, 96, 162, 20);
		panel_30.add(panel_36);
		panel_36.setLayout(new GridLayout(1, 1, 0, 0));

		txtObs17 = new JTextField();
		txtObs17.setColumns(10);
		panel_36.add(txtObs17);

		JPanel panel_37 = new JPanel();
		panel_37.setBounds(2, 127, 191, 40);
		panel_30.add(panel_37);
		panel_37.setLayout(new GridLayout(2, 1, 0, 0));

		JLabel label_9 = new JLabel("Tubería de 75mm PVC y L=3m");
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		label_9.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_37.add(label_9);

		JLabel label_10 = new JLabel("Tubería de 75mm PVC y L=2m");
		label_10.setHorizontalAlignment(SwingConstants.RIGHT);
		label_10.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_37.add(label_10);

		JPanel panel_38 = new JPanel();
		panel_38.setBounds(195, 127, 50, 40);
		panel_30.add(panel_38);
		panel_38.setLayout(new GridLayout(2, 2, 0, 0));

		txtCantidad180 = new JTextField();
		txtCantidad180.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad180.setText("1");
		txtCantidad180.setEditable(false);
		txtCantidad180.setColumns(10);
		panel_38.add(txtCantidad180);

		txtCantidad181 = new JTextField();
		txtCantidad181.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad181.setColumns(10);
		panel_38.add(txtCantidad181);

		txtCantidad190 = new JTextField();
		txtCantidad190.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad190.setText("1");
		txtCantidad190.setEditable(false);
		txtCantidad190.setColumns(10);
		panel_38.add(txtCantidad190);

		txtCantidad191 = new JTextField();
		txtCantidad191.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad191.setColumns(10);
		panel_38.add(txtCantidad191);

		JPanel panel_39 = new JPanel();
		panel_39.setBounds(248, 127, 162, 40);
		panel_30.add(panel_39);
		panel_39.setLayout(new GridLayout(2, 1, 0, 0));

		txtObs18 = new JTextField();
		txtObs18.setColumns(10);
		panel_39.add(txtObs18);

		txtObs19 = new JTextField();
		txtObs19.setColumns(10);
		panel_39.add(txtObs19);

		JPanel panel_40 = new JPanel();
		panel_40.setBounds(2, 169, 191, 40);
		panel_30.add(panel_40);
		panel_40.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblkitParaConexin_1 = new JLabel(
				"<html><body><p align=\"right\">Kit para conexión de tubería 50 mm. (lija, un pliego, polipega 1/4 gal, 1/4 gl suelda líquida, 2 uniones,2codo 90°, 2 codo45°)");
		lblkitParaConexin_1.setVerticalAlignment(SwingConstants.TOP);
		lblkitParaConexin_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblkitParaConexin_1.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_40.add(lblkitParaConexin_1);

		JPanel panel_41 = new JPanel();
		panel_41.setBounds(195, 176, 50, 20);
		panel_30.add(panel_41);
		panel_41.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad200 = new JTextField();
		txtCantidad200.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad200.setText("1");
		txtCantidad200.setEditable(false);
		txtCantidad200.setColumns(10);
		panel_41.add(txtCantidad200);

		txtCantidad201 = new JTextField();
		txtCantidad201.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad201.setColumns(10);
		panel_41.add(txtCantidad201);

		JPanel panel_42 = new JPanel();
		panel_42.setBounds(248, 176, 162, 20);
		panel_30.add(panel_42);
		panel_42.setLayout(new GridLayout(1, 1, 0, 0));

		txtObs20 = new JTextField();
		txtObs20.setColumns(10);
		panel_42.add(txtObs20);

		JPanel panel_46 = new JPanel();
		panel_46.setBounds(2, 212, 191, 40);
		panel_30.add(panel_46);
		panel_46.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblkitParaConexin_2 = new JLabel(
				"<html><body><p align=\"right\">Kit para conexión de tubería 75 mm. (lija, pliego, polipega 1/2gal,1/4 gl suelda líquida, 2 uniones,2codo 90°,2codo45°)</body></html>");
		lblkitParaConexin_2.setVerticalAlignment(SwingConstants.TOP);
		lblkitParaConexin_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblkitParaConexin_2.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_46.add(lblkitParaConexin_2);

		JPanel panel_47 = new JPanel();
		panel_47.setBounds(195, 220, 50, 20);
		panel_30.add(panel_47);
		panel_47.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad210 = new JTextField();
		txtCantidad210.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad210.setText("1");
		txtCantidad210.setEditable(false);
		txtCantidad210.setColumns(10);
		panel_47.add(txtCantidad210);

		txtCantidad211 = new JTextField();
		txtCantidad211.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad211.setColumns(10);
		panel_47.add(txtCantidad211);

		JPanel panel_48 = new JPanel();
		panel_48.setBounds(248, 220, 162, 20);
		panel_30.add(panel_48);
		panel_48.setLayout(new GridLayout(1, 1, 0, 0));

		txtObs21 = new JTextField();
		txtObs21.setColumns(10);
		panel_48.add(txtObs21);

		JPanel panel_24 = new JPanel();
		panel_24.setLayout(null);
		panel_24.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_24.setBounds(433, 380, 414, 124);
		panelLab1.add(panel_24);

		JPanel panel_25 = new JPanel();
		panel_25.setBounds(2, 14, 191, 60);
		panel_24.add(panel_25);
		panel_25.setLayout(new GridLayout(3, 1, 0, 0));

		JLabel label_18 = new JLabel("Puerta");
		label_18.setVerticalAlignment(SwingConstants.TOP);
		label_18.setHorizontalAlignment(SwingConstants.RIGHT);
		label_18.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_25.add(label_18);

		JLabel label_31 = new JLabel("Bisagras");
		label_31.setVerticalAlignment(SwingConstants.TOP);
		label_31.setHorizontalAlignment(SwingConstants.RIGHT);
		label_31.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_25.add(label_31);

		JLabel label_72 = new JLabel("Perfil SF Tipo 12 MA-SF-12 para puerta");
		label_72.setVerticalAlignment(SwingConstants.TOP);
		label_72.setHorizontalAlignment(SwingConstants.RIGHT);
		label_72.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_25.add(label_72);

		JPanel panel_26 = new JPanel();
		panel_26.setBounds(195, 14, 50, 60);
		panel_24.add(panel_26);
		panel_26.setLayout(new GridLayout(3, 2, 0, 0));

		txtCantidad220 = new JTextField();
		txtCantidad220.setText("1");
		txtCantidad220.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad220.setEditable(false);
		txtCantidad220.setColumns(10);
		panel_26.add(txtCantidad220);

		txtCantidad221 = new JTextField();
		txtCantidad221.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad221.setColumns(10);
		panel_26.add(txtCantidad221);

		txtCantidad230 = new JTextField();
		txtCantidad230.setText("3");
		txtCantidad230.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad230.setEditable(false);
		txtCantidad230.setColumns(10);
		panel_26.add(txtCantidad230);

		txtCantidad231 = new JTextField();
		txtCantidad231.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad231.setColumns(10);
		panel_26.add(txtCantidad231);

		txtCantidad240 = new JTextField();
		txtCantidad240.setText("1");
		txtCantidad240.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad240.setEditable(false);
		txtCantidad240.setColumns(10);
		panel_26.add(txtCantidad240);

		txtCantidad241 = new JTextField();
		txtCantidad241.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad241.setColumns(10);
		panel_26.add(txtCantidad241);

		JPanel panel_27 = new JPanel();
		panel_27.setBounds(248, 14, 162, 60);
		panel_24.add(panel_27);
		panel_27.setLayout(new GridLayout(3, 1, 0, 0));

		txtObs22 = new JTextField();
		txtObs22.setColumns(10);
		panel_27.add(txtObs22);

		txtObs23 = new JTextField();
		txtObs23.setColumns(10);
		panel_27.add(txtObs23);

		txtObs24 = new JTextField();
		txtObs24.setColumns(10);
		panel_27.add(txtObs24);

		JLabel label_73 = new JLabel("Cantidadidad");
		label_73.setHorizontalAlignment(SwingConstants.LEFT);
		label_73.setFont(new Font("Arial", Font.BOLD, 11));
		label_73.setBounds(195, 0, 60, 14);
		panel_24.add(label_73);

		JLabel label_76 = new JLabel("Observación/Referencia");
		label_76.setHorizontalAlignment(SwingConstants.LEFT);
		label_76.setFont(new Font("Arial", Font.BOLD, 11));
		label_76.setBounds(258, 0, 190, 14);
		panel_24.add(label_76);

		JPanel panel_28 = new JPanel();
		panel_28.setBounds(2, 75, 191, 47);
		panel_24.add(panel_28);
		panel_28.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel label_77 = new JLabel(
				"<html><body><p align=\"right\">Ventana corredera, compuesta por tres hojas y dos carriles. UPVC con vidrio flotado de 3 mm de 3x1,10</body></html>");
		label_77.setVerticalAlignment(SwingConstants.TOP);
		label_77.setHorizontalAlignment(SwingConstants.LEFT);
		label_77.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_28.add(label_77);

		JPanel panel_29 = new JPanel();
		panel_29.setBounds(195, 86, 50, 20);
		panel_24.add(panel_29);
		panel_29.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad250 = new JTextField();
		txtCantidad250.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad250.setText("3");
		txtCantidad250.setEditable(false);
		txtCantidad250.setColumns(10);
		panel_29.add(txtCantidad250);

		txtCantidad251 = new JTextField();
		txtCantidad251.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad251.setColumns(10);
		panel_29.add(txtCantidad251);

		JPanel panel_80 = new JPanel();
		panel_80.setBounds(248, 86, 162, 20);
		panel_24.add(panel_80);
		panel_80.setLayout(new GridLayout(1, 1, 0, 0));

		txtObs25 = new JTextField();
		txtObs25.setColumns(10);
		panel_80.add(txtObs25);

		JLabel label_78 = new JLabel("  COMPONENTE ARQUITECTÓNICO");
		label_78.setHorizontalAlignment(SwingConstants.LEFT);
		label_78.setFont(new Font("Arial", Font.BOLD, 11));
		label_78.setBounds(2, 0, 193, 14);
		panel_24.add(label_78);

		JPanel panel_49 = new JPanel();
		panel_49.setLayout(null);
		panel_49.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_49.setBounds(854, 11, 414, 131);
		panelLab1.add(panel_49);

		JLabel label_35 = new JLabel("Cantidadidad");
		label_35.setHorizontalAlignment(SwingConstants.LEFT);
		label_35.setFont(new Font("Arial", Font.BOLD, 11));
		label_35.setBounds(195, 0, 60, 14);
		panel_49.add(label_35);

		JLabel label_37 = new JLabel("Observación/Referencia");
		label_37.setHorizontalAlignment(SwingConstants.LEFT);
		label_37.setFont(new Font("Arial", Font.BOLD, 11));
		label_37.setBounds(258, 0, 190, 14);
		panel_49.add(label_37);

		JLabel lblComponenteArquitectnico = new JLabel(".. COMPONENTE ARQUITECTÓNICO");
		lblComponenteArquitectnico.setHorizontalAlignment(SwingConstants.LEFT);
		lblComponenteArquitectnico.setFont(new Font("Arial", Font.BOLD, 11));
		lblComponenteArquitectnico.setBounds(2, 0, 193, 14);
		panel_49.add(lblComponenteArquitectnico);

		JPanel panel_56 = new JPanel();
		panel_56.setBounds(2, 25, 191, 100);
		panel_49.add(panel_56);
		panel_56.setLayout(new GridLayout(5, 1, 0, 0));

		JLabel label_12 = new JLabel("Perfil SF-12 para ventana");
		label_12.setVerticalAlignment(SwingConstants.TOP);
		label_12.setHorizontalAlignment(SwingConstants.RIGHT);
		label_12.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_56.add(label_12);

		JLabel label_33 = new JLabel("Perfil SF Tipo 12 MM-SF-12  para paneles");
		label_33.setVerticalAlignment(SwingConstants.TOP);
		label_33.setHorizontalAlignment(SwingConstants.RIGHT);
		label_33.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_56.add(label_33);

		JLabel label_34 = new JLabel("Paneles TCB (8.8x5.8 m)");
		label_34.setVerticalAlignment(SwingConstants.TOP);
		label_34.setHorizontalAlignment(SwingConstants.RIGHT);
		label_34.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_56.add(label_34);

		JLabel label_38 = new JLabel("Paneles vynil piso (0,15x1,93 m)");
		label_38.setVerticalAlignment(SwingConstants.TOP);
		label_38.setHorizontalAlignment(SwingConstants.RIGHT);
		label_38.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_56.add(label_38);

		JLabel label_39 = new JLabel("Paneles EPS para cubierta l=7, a= 1m");
		label_39.setVerticalAlignment(SwingConstants.TOP);
		label_39.setHorizontalAlignment(SwingConstants.RIGHT);
		label_39.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_56.add(label_39);

		JPanel panel_57 = new JPanel();
		panel_57.setBounds(195, 25, 50, 100);
		panel_49.add(panel_57);
		panel_57.setLayout(new GridLayout(5, 2, 0, 0));

		txtCantidad260 = new JTextField();
		txtCantidad260.setText("12");
		txtCantidad260.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad260.setEditable(false);
		txtCantidad260.setColumns(10);
		panel_57.add(txtCantidad260);

		txtCantidad261 = new JTextField();
		txtCantidad261.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad261.setColumns(10);
		panel_57.add(txtCantidad261);

		txtCantidad270 = new JTextField();
		txtCantidad270.setText("8");
		txtCantidad270.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad270.setEditable(false);
		txtCantidad270.setColumns(10);
		panel_57.add(txtCantidad270);

		txtCantidad271 = new JTextField();
		txtCantidad271.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad271.setColumns(10);
		panel_57.add(txtCantidad271);

		txtCantidad280 = new JTextField();
		txtCantidad280.setText("1");
		txtCantidad280.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad280.setEditable(false);
		txtCantidad280.setColumns(10);
		panel_57.add(txtCantidad280);

		txtCantidad281 = new JTextField();
		txtCantidad281.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad281.setColumns(10);
		panel_57.add(txtCantidad281);

		txtCantidad290 = new JTextField();
		txtCantidad290.setText("17");
		txtCantidad290.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad290.setEditable(false);
		txtCantidad290.setColumns(10);
		panel_57.add(txtCantidad290);

		txtCantidad291 = new JTextField();
		txtCantidad291.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad291.setColumns(10);
		panel_57.add(txtCantidad291);

		txtCantidad300 = new JTextField();
		txtCantidad300.setText("9");
		txtCantidad300.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad300.setEditable(false);
		txtCantidad300.setColumns(10);
		panel_57.add(txtCantidad300);

		txtCantidad301 = new JTextField();
		txtCantidad301.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad301.setColumns(10);
		panel_57.add(txtCantidad301);

		JPanel panel_58 = new JPanel();
		panel_58.setBounds(248, 25, 162, 100);
		panel_49.add(panel_58);
		panel_58.setLayout(new GridLayout(5, 1, 0, 0));

		txtObs26 = new JTextField();
		txtObs26.setColumns(10);
		panel_58.add(txtObs26);

		txtObs27 = new JTextField();
		txtObs27.setColumns(10);
		panel_58.add(txtObs27);

		txtObs28 = new JTextField();
		txtObs28.setColumns(10);
		panel_58.add(txtObs28);

		txtObs29 = new JTextField();
		txtObs29.setColumns(10);
		panel_58.add(txtObs29);

		txtObs30 = new JTextField();
		txtObs30.setColumns(10);
		panel_58.add(txtObs30);

		JPanel panel_50 = new JPanel();
		panel_50.setLayout(null);
		panel_50.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_50.setBounds(854, 153, 414, 96);
		panelLab1.add(panel_50);

		JPanel panel_51 = new JPanel();
		panel_51.setBounds(2, 14, 191, 80);
		panel_50.add(panel_51);
		panel_51.setLayout(new GridLayout(4, 1, 0, 0));

		JLabel lblPanelesEpsPared = new JLabel("Paneles EPS pared(1x3x0,09x0,09 m)");
		lblPanelesEpsPared.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPanelesEpsPared.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_51.add(lblPanelesEpsPared);

		JLabel lblPanelesEpsPared_1 = new JLabel("Paneles EPS pared( 1x0,90x0,90 m)");
		lblPanelesEpsPared_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPanelesEpsPared_1.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_51.add(lblPanelesEpsPared_1);

		JLabel lblPanelesEpsParedxx = new JLabel("Paneles EPS pared(1x1,10x0,09 m)");
		lblPanelesEpsParedxx.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPanelesEpsParedxx.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_51.add(lblPanelesEpsParedxx);

		JLabel lblPanelesEpsPared_2 = new JLabel("Paneles EPS pared(1x0,80x0,09 m)");
		lblPanelesEpsPared_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPanelesEpsPared_2.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_51.add(lblPanelesEpsPared_2);

		JPanel panel_52 = new JPanel();
		panel_52.setBounds(195, 14, 50, 80);
		panel_50.add(panel_52);
		panel_52.setLayout(new GridLayout(4, 2, 0, 0));

		txtCantidad310 = new JTextField();
		txtCantidad310.setText("5");
		txtCantidad310.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad310.setEditable(false);
		txtCantidad310.setColumns(10);
		panel_52.add(txtCantidad310);

		txtCantidad311 = new JTextField();
		txtCantidad311.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad311.setColumns(10);
		panel_52.add(txtCantidad311);

		txtCantidad320 = new JTextField();
		txtCantidad320.setText("1");
		txtCantidad320.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad320.setEditable(false);
		txtCantidad320.setColumns(10);
		panel_52.add(txtCantidad320);

		txtCantidad321 = new JTextField();
		txtCantidad321.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad321.setColumns(10);
		panel_52.add(txtCantidad321);

		txtCantidad330 = new JTextField();
		txtCantidad330.setText("1");
		txtCantidad330.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad330.setEditable(false);
		txtCantidad330.setColumns(10);
		panel_52.add(txtCantidad330);

		txtCantidad331 = new JTextField();
		txtCantidad331.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad331.setColumns(10);
		panel_52.add(txtCantidad331);

		txtCantidad340 = new JTextField();
		txtCantidad340.setText("3");
		txtCantidad340.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad340.setEditable(false);
		txtCantidad340.setColumns(10);
		panel_52.add(txtCantidad340);

		txtCantidad341 = new JTextField();
		txtCantidad341.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad341.setColumns(10);
		panel_52.add(txtCantidad341);

		JPanel panel_53 = new JPanel();
		panel_53.setBounds(248, 14, 162, 80);
		panel_50.add(panel_53);
		panel_53.setLayout(new GridLayout(4, 1, 0, 0));

		txtObs31 = new JTextField();
		txtObs31.setColumns(10);
		panel_53.add(txtObs31);

		txtObs32 = new JTextField();
		txtObs32.setColumns(10);
		panel_53.add(txtObs32);

		txtObs33 = new JTextField();
		txtObs33.setColumns(10);
		panel_53.add(txtObs33);

		txtObs34 = new JTextField();
		txtObs34.setColumns(10);
		panel_53.add(txtObs34);

		JLabel label_15 = new JLabel("Cantidadidad");
		label_15.setHorizontalAlignment(SwingConstants.LEFT);
		label_15.setFont(new Font("Arial", Font.BOLD, 11));
		label_15.setBounds(195, 0, 50, 14);
		panel_50.add(label_15);

		JLabel label_20 = new JLabel("Observación/Referencia");
		label_20.setHorizontalAlignment(SwingConstants.LEFT);
		label_20.setFont(new Font("Arial", Font.BOLD, 11));
		label_20.setBounds(247, 0, 159, 14);
		panel_50.add(label_20);

		JLabel label_32 = new JLabel("FACHADA FRONTAL");
		label_32.setHorizontalAlignment(SwingConstants.CENTER);
		label_32.setFont(new Font("Arial", Font.BOLD, 11));
		label_32.setBounds(2, 0, 129, 14);
		panel_50.add(label_32);

		JPanel panel_54 = new JPanel();
		panel_54.setLayout(null);
		panel_54.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_54.setBounds(854, 262, 414, 80);
		panelLab1.add(panel_54);

		JPanel panel_55 = new JPanel();
		panel_55.setBounds(2, 14, 191, 60);
		panel_54.add(panel_55);
		panel_55.setLayout(new GridLayout(3, 1, 0, 0));

		JLabel lblPanelesEpsParedx = new JLabel("Paneles EPS pared(1x2,70 x0,90  m)");
		lblPanelesEpsParedx.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPanelesEpsParedx.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_55.add(lblPanelesEpsParedx);

		JLabel lblPanelesEpsParedx_1 = new JLabel("Paneles EPS pared(1x1,10 x0,90  m)");
		lblPanelesEpsParedx_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPanelesEpsParedx_1.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_55.add(lblPanelesEpsParedx_1);

		JLabel lblPanelesEpsParedx_2 = new JLabel("Paneles EPS pared(1x0,50 x0,90  m)");
		lblPanelesEpsParedx_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPanelesEpsParedx_2.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_55.add(lblPanelesEpsParedx_2);

		JPanel panel_59 = new JPanel();
		panel_59.setBounds(195, 14, 50, 60);
		panel_54.add(panel_59);
		panel_59.setLayout(new GridLayout(3, 2, 0, 0));

		txtCantidad350 = new JTextField();
		txtCantidad350.setText("3");
		txtCantidad350.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad350.setEditable(false);
		txtCantidad350.setColumns(10);
		panel_59.add(txtCantidad350);

		txtCantidad351 = new JTextField();
		txtCantidad351.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad351.setColumns(10);
		panel_59.add(txtCantidad351);

		txtCantidad360 = new JTextField();
		txtCantidad360.setText("6");
		txtCantidad360.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad360.setEditable(false);
		txtCantidad360.setColumns(10);
		panel_59.add(txtCantidad360);

		txtCantidad361 = new JTextField();
		txtCantidad361.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad361.setColumns(10);
		panel_59.add(txtCantidad361);

		txtCantidad370 = new JTextField();
		txtCantidad370.setText("6");
		txtCantidad370.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad370.setEditable(false);
		txtCantidad370.setColumns(10);
		panel_59.add(txtCantidad370);

		txtCantidad371 = new JTextField();
		txtCantidad371.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad371.setColumns(10);
		panel_59.add(txtCantidad371);

		JPanel panel_60 = new JPanel();
		panel_60.setBounds(248, 14, 162, 60);
		panel_54.add(panel_60);
		panel_60.setLayout(new GridLayout(3, 1, 0, 0));

		txtObs35 = new JTextField();
		txtObs35.setColumns(10);
		panel_60.add(txtObs35);

		txtObs36 = new JTextField();
		txtObs36.setColumns(10);
		panel_60.add(txtObs36);

		txtObs37 = new JTextField();
		txtObs37.setColumns(10);
		panel_60.add(txtObs37);

		JLabel label_43 = new JLabel("Cantidadidad");
		label_43.setHorizontalAlignment(SwingConstants.LEFT);
		label_43.setFont(new Font("Arial", Font.BOLD, 11));
		label_43.setBounds(195, 0, 60, 14);
		panel_54.add(label_43);

		JLabel label_44 = new JLabel("Observación/Referencia");
		label_44.setHorizontalAlignment(SwingConstants.LEFT);
		label_44.setFont(new Font("Arial", Font.BOLD, 11));
		label_44.setBounds(250, 0, 190, 14);
		panel_54.add(label_44);

		JLabel label_45 = new JLabel("FACHADA POSTERIOR");
		label_45.setHorizontalAlignment(SwingConstants.CENTER);
		label_45.setFont(new Font("Arial", Font.BOLD, 11));
		label_45.setBounds(2, 0, 129, 14);
		panel_54.add(label_45);

		JPanel panel_61 = new JPanel();
		panel_61.setLayout(null);
		panel_61.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_61.setBounds(854, 354, 414, 36);
		panelLab1.add(panel_61);

		JPanel panel_62 = new JPanel();
		panel_62.setBounds(2, 14, 191, 20);
		panel_61.add(panel_62);
		panel_62.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblPanelHvaparedLaterales = new JLabel("Panel Hva-pared laterales izq (libre)");
		lblPanelHvaparedLaterales.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPanelHvaparedLaterales.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_62.add(lblPanelHvaparedLaterales);

		JPanel panel_63 = new JPanel();
		panel_63.setBounds(195, 14, 50, 20);
		panel_61.add(panel_63);
		panel_63.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad380 = new JTextField();
		txtCantidad380.setText("6");
		txtCantidad380.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad380.setEditable(false);
		txtCantidad380.setColumns(10);
		panel_63.add(txtCantidad380);

		txtCantidad381 = new JTextField();
		txtCantidad381.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad381.setColumns(10);
		panel_63.add(txtCantidad381);

		JPanel panel_64 = new JPanel();
		panel_64.setBounds(248, 14, 162, 20);
		panel_61.add(panel_64);
		panel_64.setLayout(new GridLayout(1, 1, 0, 0));

		txtObs38 = new JTextField();
		txtObs38.setColumns(10);
		panel_64.add(txtObs38);

		JLabel label_47 = new JLabel("Cantidadidad");
		label_47.setHorizontalAlignment(SwingConstants.LEFT);
		label_47.setFont(new Font("Arial", Font.BOLD, 11));
		label_47.setBounds(195, 0, 60, 14);
		panel_61.add(label_47);

		JLabel label_48 = new JLabel("Observación/Referencia");
		label_48.setHorizontalAlignment(SwingConstants.LEFT);
		label_48.setFont(new Font("Arial", Font.BOLD, 11));
		label_48.setBounds(251, 0, 190, 14);
		panel_61.add(label_48);

		JLabel label_49 = new JLabel("FACHADA LATERAL");
		label_49.setHorizontalAlignment(SwingConstants.CENTER);
		label_49.setFont(new Font("Arial", Font.BOLD, 11));
		label_49.setBounds(2, 0, 129, 14);
		panel_61.add(label_49);

		JPanel panelLab2 = new JPanel();
		tabbedPane.addTab("2.-  MM laboratorio-1", null, panelLab2, null);
		panelLab2.setLayout(null);

		JPanel panel_75 = new JPanel();
		panel_75.setLayout(null);
		panel_75.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_75.setBounds(10, 11, 749, 259);
		panelLab2.add(panel_75);

		JPanel panel_76 = new JPanel();
		panel_76.setBounds(2, 14, 335, 240);
		panel_75.add(panel_76);
		panel_76.setLayout(new GridLayout(12, 1, 0, 0));

		JLabel label_58 = new JLabel("Dados cimentación");
		label_58.setHorizontalAlignment(SwingConstants.RIGHT);
		label_58.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_76.add(label_58);

		JLabel label_59 = new JLabel("Perfil SF Tipo 1");
		label_59.setHorizontalAlignment(SwingConstants.RIGHT);
		label_59.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_76.add(label_59);

		JLabel label_60 = new JLabel("Perfil SF Tipo 2");
		label_60.setHorizontalAlignment(SwingConstants.RIGHT);
		label_60.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_76.add(label_60);

		JLabel label_61 = new JLabel("Perfil SF Tipo 5");
		label_61.setHorizontalAlignment(SwingConstants.RIGHT);
		label_61.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_76.add(label_61);

		JLabel label_64 = new JLabel("Perfil SF Tipo 3");
		label_64.setHorizontalAlignment(SwingConstants.RIGHT);
		label_64.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_76.add(label_64);

		JLabel label_65 = new JLabel("Perfil SF Tipo 4");
		label_65.setHorizontalAlignment(SwingConstants.RIGHT);
		label_65.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_76.add(label_65);

		JLabel label_66 = new JLabel("Perfil SF Tipo 6");
		label_66.setHorizontalAlignment(SwingConstants.RIGHT);
		label_66.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_76.add(label_66);

		JLabel label_67 = new JLabel("Perfil SF Tipo 7");
		label_67.setHorizontalAlignment(SwingConstants.RIGHT);
		label_67.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_76.add(label_67);

		JLabel label_68 = new JLabel("Perfil SF Tipo 8");
		label_68.setHorizontalAlignment(SwingConstants.RIGHT);
		label_68.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_76.add(label_68);

		JLabel label_69 = new JLabel("Perfil SF Tipo 9");
		label_69.setHorizontalAlignment(SwingConstants.RIGHT);
		label_69.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_76.add(label_69);

		JLabel label_70 = new JLabel("Perfil SF Tipo 10");
		label_70.setHorizontalAlignment(SwingConstants.RIGHT);
		label_70.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_76.add(label_70);

		JLabel label_71 = new JLabel("Perfil SF Tipo 11");
		label_71.setHorizontalAlignment(SwingConstants.RIGHT);
		label_71.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_76.add(label_71);

		JPanel panel_77 = new JPanel();
		panel_77.setBounds(365, 14, 50, 240);
		panel_75.add(panel_77);
		panel_77.setLayout(new GridLayout(12, 2, 0, 0));

		txtCantidad390 = new JTextField();
		txtCantidad390.setText("15");
		txtCantidad390.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad390.setEditable(false);
		txtCantidad390.setColumns(10);
		panel_77.add(txtCantidad390);

		txtCantidad391 = new JTextField();
		txtCantidad391.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad391.setColumns(10);
		panel_77.add(txtCantidad391);

		txtCantidad400 = new JTextField();
		txtCantidad400.setText("2");
		txtCantidad400.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad400.setEditable(false);
		txtCantidad400.setColumns(10);
		panel_77.add(txtCantidad400);

		txtCantidad401 = new JTextField();
		txtCantidad401.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad401.setColumns(10);
		panel_77.add(txtCantidad401);

		txtCantidad410 = new JTextField();
		txtCantidad410.setText("2");
		txtCantidad410.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad410.setEditable(false);
		txtCantidad410.setColumns(10);
		panel_77.add(txtCantidad410);

		txtCantidad411 = new JTextField();
		txtCantidad411.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad411.setColumns(10);
		panel_77.add(txtCantidad411);

		txtCantidad420 = new JTextField();
		txtCantidad420.setText("20");
		txtCantidad420.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad420.setEditable(false);
		txtCantidad420.setColumns(10);
		panel_77.add(txtCantidad420);

		txtCantidad421 = new JTextField();
		txtCantidad421.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad421.setColumns(10);
		panel_77.add(txtCantidad421);

		txtCantidad430 = new JTextField();
		txtCantidad430.setText("6");
		txtCantidad430.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad430.setEditable(false);
		txtCantidad430.setColumns(10);
		panel_77.add(txtCantidad430);

		txtCantidad431 = new JTextField();
		txtCantidad431.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad431.setColumns(10);
		panel_77.add(txtCantidad431);

		txtCantidad440 = new JTextField();
		txtCantidad440.setText("40");
		txtCantidad440.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad440.setEditable(false);
		txtCantidad440.setColumns(10);
		panel_77.add(txtCantidad440);

		txtCantidad441 = new JTextField();
		txtCantidad441.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad441.setColumns(10);
		panel_77.add(txtCantidad441);

		txtCantidad450 = new JTextField();
		txtCantidad450.setText("40");
		txtCantidad450.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad450.setEditable(false);
		txtCantidad450.setColumns(10);
		panel_77.add(txtCantidad450);

		txtCantidad451 = new JTextField();
		txtCantidad451.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad451.setColumns(10);
		panel_77.add(txtCantidad451);

		txtCantidad460 = new JTextField();
		txtCantidad460.setText("2");
		txtCantidad460.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad460.setEditable(false);
		txtCantidad460.setColumns(10);
		panel_77.add(txtCantidad460);

		txtCantidad461 = new JTextField();
		txtCantidad461.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad461.setColumns(10);
		panel_77.add(txtCantidad461);

		txtCantidad470 = new JTextField();
		txtCantidad470.setText("2");
		txtCantidad470.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad470.setEditable(false);
		txtCantidad470.setColumns(10);
		panel_77.add(txtCantidad470);

		txtCantidad471 = new JTextField();
		txtCantidad471.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad471.setColumns(10);
		panel_77.add(txtCantidad471);

		txtCantidad480 = new JTextField();
		txtCantidad480.setText("20");
		txtCantidad480.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad480.setEditable(false);
		txtCantidad480.setColumns(10);
		panel_77.add(txtCantidad480);

		txtCantidad481 = new JTextField();
		txtCantidad481.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad481.setColumns(10);
		panel_77.add(txtCantidad481);

		txtCantidad490 = new JTextField();
		txtCantidad490.setText("6");
		txtCantidad490.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad490.setEditable(false);
		txtCantidad490.setColumns(10);
		panel_77.add(txtCantidad490);

		txtCantidad491 = new JTextField();
		txtCantidad491.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad491.setColumns(10);
		panel_77.add(txtCantidad491);

		txtCantidad500 = new JTextField();
		txtCantidad500.setText("40");
		txtCantidad500.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad500.setEditable(false);
		txtCantidad500.setColumns(10);
		panel_77.add(txtCantidad500);

		txtCantidad501 = new JTextField();
		txtCantidad501.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad501.setColumns(10);
		panel_77.add(txtCantidad501);

		JPanel panel_78 = new JPanel();
		panel_78.setBounds(439, 14, 300, 240);
		panel_75.add(panel_78);
		panel_78.setLayout(new GridLayout(12, 1, 0, 0));

		txtObs39 = new JTextField();
		txtObs39.setColumns(10);
		panel_78.add(txtObs39);

		txtObs40 = new JTextField();
		txtObs40.setColumns(10);
		panel_78.add(txtObs40);

		txtObs41 = new JTextField();
		txtObs41.setColumns(10);
		panel_78.add(txtObs41);

		txtObs42 = new JTextField();
		txtObs42.setColumns(10);
		panel_78.add(txtObs42);

		txtObs43 = new JTextField();
		txtObs43.setColumns(10);
		panel_78.add(txtObs43);

		txtObs44 = new JTextField();
		txtObs44.setColumns(10);
		panel_78.add(txtObs44);

		txtObs45 = new JTextField();
		txtObs45.setColumns(10);
		panel_78.add(txtObs45);

		txtObs46 = new JTextField();
		txtObs46.setColumns(10);
		panel_78.add(txtObs46);

		txtObs47 = new JTextField();
		txtObs47.setColumns(10);
		panel_78.add(txtObs47);

		txtObs48 = new JTextField();
		txtObs48.setColumns(10);
		panel_78.add(txtObs48);

		txtObs49 = new JTextField();
		txtObs49.setColumns(10);
		panel_78.add(txtObs49);

		txtObs50 = new JTextField();
		txtObs50.setColumns(10);
		panel_78.add(txtObs50);

		JLabel label_62 = new JLabel("Cantidad");
		label_62.setHorizontalAlignment(SwingConstants.LEFT);
		label_62.setFont(new Font("Arial", Font.BOLD, 11));
		label_62.setBounds(365, 0, 60, 14);
		panel_75.add(label_62);

		JLabel label_63 = new JLabel("Observación/Referencia");
		label_63.setHorizontalAlignment(SwingConstants.LEFT);
		label_63.setFont(new Font("Arial", Font.BOLD, 11));
		label_63.setBounds(439, 0, 300, 14);
		panel_75.add(label_63);

		JLabel lblComponenteEstructural_1 = new JLabel("   COMPONENTE ESTRUCTURAL");
		lblComponenteEstructural_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblComponenteEstructural_1.setFont(new Font("Arial", Font.BOLD, 11));
		lblComponenteEstructural_1.setBounds(2, 0, 203, 14);

		panel_75.add(lblComponenteEstructural_1);

		InformacionObligatoriaV infoObligatoria = new InformacionObligatoriaV(860, 300);
		panelLab2.add(infoObligatoria.getPnlInformacionObl());

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				new Menu().setVisible(true);
				dispose();
			}
		});

		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());
		contentPane.setLayout(null);
		setTitle("MM-" + ficha.getFiNombre());

		llenarCabecera(cabecera);
		llenarFicha();
		cabecera.getBtnRegistrar().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				TInformacionObligatoria infoObl = cargarInfoObligatoria(infoObligatoria);
				if (validarInfo(infoObl)) {
					List<TdetalleFicha> detallesFicha = getRegistrosFicha(infoObl);
					ServicioInfoObligatoria srvInfoObl = new ComponenteInfoObligatoria();
					infoObl.settCabe(gettCabecera());
					if (registrosValidados(detallesFicha)) {
						srvInfoObl.crear(infoObl);
						infoObl.setIoSerial(srvInfoObl.serialInfoOblMax());
						srvFicha.guardarFormulario(detallesFicha);
						new Menu().setVisible(true);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "ERROR: Verificar valores ejecutados!", "Mensaje de Error",
								JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Datos obligatorios");
				}
			}

			private boolean registrosValidados(List<TdetalleFicha> detallesFicha) {
				for (TdetalleFicha detalle : detallesFicha) {
					if (detalle.getDetCantidadEjecutada() > detalle.getDetCantidadLimite()
							|| detalle.getDetCantidadEjecutada() < 0) {
						return false;
					}
				}
				return true;
			}

		});

	}

	private List<TdetalleFicha> getRegistrosFicha(TInformacionObligatoria infoObligatoria) {

		TCabecera cabecera = gettCabecera();
		Integer updateFicha = srvFicha.nActualizacionFicha(gettCabecera(), ficha);
		if (updateFicha == -1) {
			updateFicha = 0;
		} else {
			updateFicha++;
		}

		BigDecimal porcentajeAvance;

		LinkedList<TdetalleFicha> detallesFicha = new LinkedList<>();
		TGrupo grupoKE = srvFicha.buscarGrupo("Kit eléctrico");

		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad00.getText()),
				Integer.parseInt(txtCantidad01.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoKE, ficha, null,
				Integer.parseInt(txtCantidad00.getText()), Integer.parseInt(txtCantidad01.getText()), txtObs0.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad10.getText()),
				Integer.parseInt(txtCantidad11.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoKE, ficha, null,
				Integer.parseInt(txtCantidad10.getText()), Integer.parseInt(txtCantidad11.getText()), txtObs1.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad20.getText()),
				Integer.parseInt(txtCantidad21.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoKE, ficha, null,
				Integer.parseInt(txtCantidad20.getText()), Integer.parseInt(txtCantidad21.getText()), txtObs2.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad30.getText()),
				Integer.parseInt(txtCantidad31.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoKE, ficha, null,
				Integer.parseInt(txtCantidad30.getText()), Integer.parseInt(txtCantidad31.getText()), txtObs3.getText(),
				updateFicha, porcentajeAvance));

		TGrupo grupoKH = srvFicha.buscarGrupo("Kit hidrosanitario");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad40.getText()),
				Integer.parseInt(txtCantidad41.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoKH, ficha, null,
				Integer.parseInt(txtCantidad40.getText()), Integer.parseInt(txtCantidad41.getText()), txtObs4.getText(),
				updateFicha, porcentajeAvance));

		TGrupo grupoKALL = srvFicha.buscarGrupo("Kit agua lluvia");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad50.getText()),
				Integer.parseInt(txtCantidad51.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoKALL, ficha, null,
				Integer.parseInt(txtCantidad50.getText()), Integer.parseInt(txtCantidad51.getText()), txtObs5.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad60.getText()),
				Integer.parseInt(txtCantidad61.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoKALL, ficha, null,
				Integer.parseInt(txtCantidad60.getText()), Integer.parseInt(txtCantidad61.getText()), txtObs6.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad70.getText()),
				Integer.parseInt(txtCantidad71.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoKALL, ficha, null,
				Integer.parseInt(txtCantidad70.getText()), Integer.parseInt(txtCantidad71.getText()), txtObs7.getText(),
				updateFicha, porcentajeAvance));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoKALL, ficha, null,
				Integer.parseInt(txtCantidad80.getText()), Integer.parseInt(txtCantidad81.getText()), txtObs8.getText(),
				updateFicha));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad90.getText()),
				Integer.parseInt(txtCantidad91.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoKALL, ficha, null,
				Integer.parseInt(txtCantidad90.getText()), Integer.parseInt(txtCantidad91.getText()), txtObs9.getText(),
				updateFicha, porcentajeAvance));

		TGrupo grupoKAP = srvFicha.buscarGrupo("Kit agua potable");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad100.getText()),
				Integer.parseInt(txtCantidad101.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoKAP, ficha, null,
				Integer.parseInt(txtCantidad100.getText()), Integer.parseInt(txtCantidad101.getText()),
				txtObs10.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad110.getText()),
				Integer.parseInt(txtCantidad111.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoKAP, ficha, null,
				Integer.parseInt(txtCantidad110.getText()), Integer.parseInt(txtCantidad111.getText()),
				txtObs11.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad120.getText()),
				Integer.parseInt(txtCantidad121.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoKAP, ficha, null,
				Integer.parseInt(txtCantidad120.getText()), Integer.parseInt(txtCantidad121.getText()),
				txtObs12.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad130.getText()),
				Integer.parseInt(txtCantidad131.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoKAP, ficha, null,
				Integer.parseInt(txtCantidad130.getText()), Integer.parseInt(txtCantidad131.getText()),
				txtObs13.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad140.getText()),
				Integer.parseInt(txtCantidad141.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoKAP, ficha, null,
				Integer.parseInt(txtCantidad140.getText()), Integer.parseInt(txtCantidad141.getText()),
				txtObs14.getText(), updateFicha, porcentajeAvance));

		TGrupo grupoKAR = srvFicha.buscarGrupo("Kit agua residual");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad150.getText()),
				Integer.parseInt(txtCantidad151.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoKAR, ficha, null,
				Integer.parseInt(txtCantidad150.getText()), Integer.parseInt(txtCantidad151.getText()),
				txtObs15.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad160.getText()),
				Integer.parseInt(txtCantidad161.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoKAR, ficha, null,
				Integer.parseInt(txtCantidad160.getText()), Integer.parseInt(txtCantidad161.getText()),
				txtObs16.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad170.getText()),
				Integer.parseInt(txtCantidad171.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoKAR, ficha, null,
				Integer.parseInt(txtCantidad170.getText()), Integer.parseInt(txtCantidad171.getText()),
				txtObs17.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad180.getText()),
				Integer.parseInt(txtCantidad181.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoKAR, ficha, null,
				Integer.parseInt(txtCantidad180.getText()), Integer.parseInt(txtCantidad181.getText()),
				txtObs18.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad190.getText()),
				Integer.parseInt(txtCantidad191.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoKAR, ficha, null,
				Integer.parseInt(txtCantidad190.getText()), Integer.parseInt(txtCantidad191.getText()),
				txtObs19.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad200.getText()),
				Integer.parseInt(txtCantidad201.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoKAR, ficha, null,
				Integer.parseInt(txtCantidad200.getText()), Integer.parseInt(txtCantidad201.getText()),
				txtObs20.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad210.getText()),
				Integer.parseInt(txtCantidad211.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoKAR, ficha, null,
				Integer.parseInt(txtCantidad210.getText()), Integer.parseInt(txtCantidad211.getText()),
				txtObs21.getText(), updateFicha, porcentajeAvance));

		TGrupo grupoCA = srvFicha.buscarGrupo("Componente arquitectónico");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad220.getText()),
				Integer.parseInt(txtCantidad221.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoCA, ficha, null,
				Integer.parseInt(txtCantidad220.getText()), Integer.parseInt(txtCantidad221.getText()),
				txtObs22.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad230.getText()),
				Integer.parseInt(txtCantidad231.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoCA, ficha, null,
				Integer.parseInt(txtCantidad230.getText()), Integer.parseInt(txtCantidad231.getText()),
				txtObs23.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad240.getText()),
				Integer.parseInt(txtCantidad241.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoCA, ficha, null,
				Integer.parseInt(txtCantidad240.getText()), Integer.parseInt(txtCantidad241.getText()),
				txtObs24.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad250.getText()),
				Integer.parseInt(txtCantidad251.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoCA, ficha, null,
				Integer.parseInt(txtCantidad250.getText()), Integer.parseInt(txtCantidad251.getText()),
				txtObs25.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad260.getText()),
				Integer.parseInt(txtCantidad261.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoCA, ficha, null,
				Integer.parseInt(txtCantidad260.getText()), Integer.parseInt(txtCantidad261.getText()),
				txtObs26.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad270.getText()),
				Integer.parseInt(txtCantidad271.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoCA, ficha, null,
				Integer.parseInt(txtCantidad270.getText()), Integer.parseInt(txtCantidad271.getText()),
				txtObs27.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad280.getText()),
				Integer.parseInt(txtCantidad281.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoCA, ficha, null,
				Integer.parseInt(txtCantidad280.getText()), Integer.parseInt(txtCantidad281.getText()),
				txtObs28.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad290.getText()),
				Integer.parseInt(txtCantidad291.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoCA, ficha, null,
				Integer.parseInt(txtCantidad290.getText()), Integer.parseInt(txtCantidad291.getText()),
				txtObs29.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad300.getText()),
				Integer.parseInt(txtCantidad301.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoCA, ficha, null,
				Integer.parseInt(txtCantidad300.getText()), Integer.parseInt(txtCantidad301.getText()),
				txtObs30.getText(), updateFicha, porcentajeAvance));

		TGrupo grupoFF = srvFicha.buscarGrupo("Fachada frontal");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad310.getText()),
				Integer.parseInt(txtCantidad311.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoFF, ficha, null,
				Integer.parseInt(txtCantidad310.getText()), Integer.parseInt(txtCantidad311.getText()),
				txtObs31.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad320.getText()),
				Integer.parseInt(txtCantidad321.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoFF, ficha, null,
				Integer.parseInt(txtCantidad320.getText()), Integer.parseInt(txtCantidad321.getText()),
				txtObs32.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad330.getText()),
				Integer.parseInt(txtCantidad331.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoFF, ficha, null,
				Integer.parseInt(txtCantidad330.getText()), Integer.parseInt(txtCantidad331.getText()),
				txtObs33.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad340.getText()),
				Integer.parseInt(txtCantidad341.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoFF, ficha, null,
				Integer.parseInt(txtCantidad340.getText()), Integer.parseInt(txtCantidad341.getText()),
				txtObs34.getText(), updateFicha, porcentajeAvance));

		TGrupo grupoFP = srvFicha.buscarGrupo("Fachada posterior");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad350.getText()),
				Integer.parseInt(txtCantidad351.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoFP, ficha, null,
				Integer.parseInt(txtCantidad350.getText()), Integer.parseInt(txtCantidad351.getText()),
				txtObs35.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad360.getText()),
				Integer.parseInt(txtCantidad361.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoFP, ficha, null,
				Integer.parseInt(txtCantidad360.getText()), Integer.parseInt(txtCantidad361.getText()),
				txtObs36.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad370.getText()),
				Integer.parseInt(txtCantidad371.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoFP, ficha, null,
				Integer.parseInt(txtCantidad370.getText()), Integer.parseInt(txtCantidad371.getText()),
				txtObs37.getText(), updateFicha, porcentajeAvance));

		TGrupo grupoFL = srvFicha.buscarGrupo("Fachada lateral");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad380.getText()),
				Integer.parseInt(txtCantidad381.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoFL, ficha, null,
				Integer.parseInt(txtCantidad380.getText()), Integer.parseInt(txtCantidad381.getText()),
				txtObs38.getText(), updateFicha, porcentajeAvance));

		TGrupo grupoCE = srvFicha.buscarGrupo("Componente estructural");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad390.getText()),
				Integer.parseInt(txtCantidad391.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoCE, ficha, null,
				Integer.parseInt(txtCantidad390.getText()), Integer.parseInt(txtCantidad391.getText()),
				txtObs39.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad400.getText()),
				Integer.parseInt(txtCantidad401.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoCE, ficha, null,
				Integer.parseInt(txtCantidad400.getText()), Integer.parseInt(txtCantidad401.getText()),
				txtObs40.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad410.getText()),
				Integer.parseInt(txtCantidad411.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoCE, ficha, null,
				Integer.parseInt(txtCantidad410.getText()), Integer.parseInt(txtCantidad411.getText()),
				txtObs41.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad420.getText()),
				Integer.parseInt(txtCantidad421.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoCE, ficha, null,
				Integer.parseInt(txtCantidad420.getText()), Integer.parseInt(txtCantidad421.getText()),
				txtObs42.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad430.getText()),
				Integer.parseInt(txtCantidad431.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoCE, ficha, null,
				Integer.parseInt(txtCantidad430.getText()), Integer.parseInt(txtCantidad431.getText()),
				txtObs43.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad440.getText()),
				Integer.parseInt(txtCantidad441.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoCE, ficha, null,
				Integer.parseInt(txtCantidad440.getText()), Integer.parseInt(txtCantidad441.getText()),
				txtObs44.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad450.getText()),
				Integer.parseInt(txtCantidad451.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoCE, ficha, null,
				Integer.parseInt(txtCantidad450.getText()), Integer.parseInt(txtCantidad451.getText()),
				txtObs45.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad460.getText()),
				Integer.parseInt(txtCantidad461.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoCE, ficha, null,
				Integer.parseInt(txtCantidad460.getText()), Integer.parseInt(txtCantidad461.getText()),
				txtObs46.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad470.getText()),
				Integer.parseInt(txtCantidad471.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoCE, ficha, null,
				Integer.parseInt(txtCantidad470.getText()), Integer.parseInt(txtCantidad471.getText()),
				txtObs47.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad480.getText()),
				Integer.parseInt(txtCantidad481.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoCE, ficha, null,
				Integer.parseInt(txtCantidad480.getText()), Integer.parseInt(txtCantidad481.getText()),
				txtObs48.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad490.getText()),
				Integer.parseInt(txtCantidad491.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoCE, ficha, null,
				Integer.parseInt(txtCantidad490.getText()), Integer.parseInt(txtCantidad491.getText()),
				txtObs49.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad500.getText()),
				Integer.parseInt(txtCantidad501.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupoCE, ficha, null,
				Integer.parseInt(txtCantidad500.getText()), Integer.parseInt(txtCantidad501.getText()),
				txtObs50.getText(), updateFicha, porcentajeAvance));

		return detallesFicha;
	}

	public void llenarFicha() {
		List<TdetalleFicha> listaDetalles = srvFicha.detallesFicha(gettCabecera(), ficha);
		try {
			txtCantidad01.setText(String.valueOf(listaDetalles.get(0).getDetCantidadEjecutada()));
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
			txtObs42.setText(listaDetalles.get(0).getDetObsRef());
			txtObs43.setText(listaDetalles.get(1).getDetObsRef());
			txtObs44.setText(listaDetalles.get(2).getDetObsRef());
			txtObs45.setText(listaDetalles.get(3).getDetObsRef());
			txtObs46.setText(listaDetalles.get(4).getDetObsRef());
			txtObs47.setText(listaDetalles.get(5).getDetObsRef());
			txtObs48.setText(listaDetalles.get(6).getDetObsRef());
			txtObs49.setText(listaDetalles.get(7).getDetObsRef());
			txtObs50.setText(listaDetalles.get(8).getDetObsRef());
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			txtCantidad01.setText(String.valueOf(0));
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
		}
	}
}
