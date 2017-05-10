package com.capa.presentacion;

import static com.capa.negocios.Calculos.calcularPorcentajeAvance;
import static com.capa.util.Constantes.*;
import static com.capa.util.Utilitarios.cargarInfoObligatoria;
import static com.capa.util.Utilitarios.gettCabecera;
import static com.capa.util.Utilitarios.isFichaC1;
import static com.capa.util.Utilitarios.quitarEtiquetasHTML;
import static com.capa.util.Validaciones.validarInfo;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.InputStream;
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
import javax.swing.border.TitledBorder;

import com.capa.datos.TCabecera;
import com.capa.datos.TFicha;
import com.capa.datos.TGrupo;
import com.capa.datos.TInformacionObligatoria;
import com.capa.datos.TdetalleFicha;
import com.capa.negocios.ComponenteCabecera;
import com.capa.negocios.ComponenteFicha;
import com.capa.negocios.ComponenteInfoObligatoria;
import com.capa.negocios.Query;
import com.capa.negocios.Reporte;
import com.capa.negocios.ServicioCabecera;
import com.capa.negocios.ServicioFicha;
import com.capa.negocios.ServicioInfoObligatoria;
import com.capa.presentacion.JPcabecera;
import com.capa.presentacion.JPinformacionObligatoria;
import com.capa.util.Utilitarios;
import com.capa.util.Validaciones;

public class B3Template extends JFrame {

	private static final long serialVersionUID = -7414804174774225013L;
	private JPanel pnlPrincipal;
	private JPcabecera jpCabecera;

	public ServicioFicha srvFicha = new ComponenteFicha();
	public ServicioInfoObligatoria srvInfoObl = new ComponenteInfoObligatoria();
	public ServicioCabecera srvTempCabecera = new ComponenteCabecera();
	public ServicioCabecera srvCabecera = new ComponenteCabecera();

	private TFicha ficha;
	private JTextField txtCantidad00;
	private JTextField txtCantidad01;
	private JTextField txtCantidad10;
	private JTextField txtCantidad11;
	private JTextField txtCantidad20;
	private JTextField txtCantidad41;
	private JTextField txtCantidad21;
	private JTextField txtCantidad30;
	private JTextField txtCantidad31;
	private JTextField txtCantidad40;
	private JTextField txtObs0;
	private JTextField txtObs1;
	private JTextField txtObs2;
	private JTextField txtObs3;
	private JTextField txtObs4;
	private JTextField txtCantidad50;
	private JTextField txtCantidad51;
	private JTextField txtCantidad60;
	private JTextField txtCantidad61;
	private JTextField txtCantidad70;
	private JTextField txtCantidad71;
	private JTextField txtObs5;
	private JTextField txtObs6;
	private JTextField txtObs7;
	private JTextField txtCantidad80;
	private JTextField txtCantidad81;
	private JTextField txtCantidad90;
	private JTextField txtCantidad91;
	private JTextField txtObs8;
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
	private JTextField txtCantidad130;
	private JTextField txtCantidad131;
	private JTextField txtObs13;
	private JTextField txtCantidad140;
	private JTextField txtCantidad141;
	private JTextField txtObs14;
	private JTextField txtCantidad150;
	private JTextField txtCantidad151;
	private JTextField txtObs15;
	private JTextField txtCantidad160;
	private JTextField txtCantidad161;
	private JTextField txtCantidad170;
	private JTextField txtCantidad171;
	private JTextField txtObs16;
	private JTextField txtObs17;
	private JTextField txtCantidad180;
	private JTextField txtCantidad181;
	private JTextField txtObs18;
	private JTextField txtCantidad190;
	private JTextField txtCantidad191;
	private JTextField txtObs19;
	private JTextField txtCantidad210;
	private JTextField txtCantidad211;
	private JTextField txtObs21;
	private JTextField txtCantidad200;
	private JTextField txtCantidad201;
	private JTextField txtObs20;
	private JTextField txtCantidad220;
	private JTextField txtCantidad221;
	private JTextField txtObs22;
	private JTextField txtCantidad230;
	private JTextField txtCantidad231;
	private JTextField txtObs23;
	private JTextField txtCantidad260;
	private JTextField txtCantidad261;
	private JTextField txtObs26;
	private JTextField txtCantidad240;
	private JTextField txtCantidad241;
	private JTextField txtCantidad250;
	private JTextField txtCantidad251;
	private JTextField txtObs24;
	private JTextField txtObs25;
	private JTextField txtCantidad290;
	private JTextField txtCantidad291;
	private JTextField txtObs29;
	private JTextField txtCantidad270;
	private JTextField txtCantidad271;
	private JTextField txtCantidad280;
	private JTextField txtCantidad281;
	private JTextField txtObs27;
	private JTextField txtObs28;
	private JTextField txtCantidad320;
	private JTextField txtCantidad321;
	private JTextField txtObs32;
	private JTextField txtCantidad300;
	private JTextField txtCantidad301;
	private JTextField txtCantidad310;
	private JTextField txtCantidad311;
	private JTextField txtObs30;
	private JTextField txtObs31;
	private JTextField txtCantidad330;
	private JTextField txtCantidad331;
	private JTextField txtObs33;
	private JTextField txtCantidad340;
	private JTextField txtCantidad341;
	private JTextField txtObs34;
	private JTextField txtCantidad360;
	private JTextField txtCantidad361;
	private JTextField txtCantidad370;
	private JTextField txtCantidad371;
	private JTextField txtCantidad380;
	private JTextField txtCantidad381;
	private JTextField txtObs36;
	private JTextField txtObs37;
	private JTextField txtObs38;
	private JTextField txtCantidad390;
	private JTextField txtCantidad391;
	private JTextField txtObs39;
	private JTextField txtCantidad400;
	private JTextField txtCantidad401;
	private JTextField txtCantidad410;
	private JTextField txtCantidad411;
	private JTextField txtObs40;
	private JTextField txtObs41;
	private JTextField txtCantidad430;
	private JTextField txtCantidad431;
	private JTextField txtCantidad440;
	private JTextField txtCantidad441;
	private JTextField txtCantidad450;
	private JTextField txtCantidad451;
	private JTextField txtObs43;
	private JTextField txtObs44;
	private JTextField txtObs45;
	private JTextField txtCantidad460;
	private JTextField txtCantidad461;
	private JTextField txtCantidad470;
	private JTextField txtCantidad471;
	private JTextField txtObs48;
	private JTextField txtObs49;
	private JTextField txtCantidad480;
	private JTextField txtCantidad481;
	private JTextField txtCantidad490;
	private JTextField txtCantidad491;
	private JTextField txtObs46;
	private JTextField txtObs47;
	private JTextField txtCantidad590;
	private JTextField txtCantidad591;
	private JTextField txtCantidad600;
	private JTextField txtCantidad601;
	private JTextField txtCantidad610;
	private JTextField txtCantidad611;
	private JTextField txtCantidad620;
	private JTextField txtCantidad621;
	private JTextField txtObs59;
	private JTextField txtObs60;
	private JTextField txtObs61;
	private JTextField txtObs62;
	private JTextField txtCantidad630;
	private JTextField txtCantidad631;
	private JTextField txtCantidad640;
	private JTextField txtCantidad641;
	private JTextField txtCantidad650;
	private JTextField txtCantidad651;
	private JTextField txtCantidad660;
	private JTextField txtCantidad661;
	private JTextField txtCantidad670;
	private JTextField txtCantidad671;
	private JTextField txtCantidad680;
	private JTextField txtCantidad681;
	private JTextField txtCantidad690;
	private JTextField txtCantidad691;
	private JTextField txtCantidad700;
	private JTextField txtCantidad701;
	private JTextField txtObs63;
	private JTextField txtObs64;
	private JTextField txtObs65;
	private JTextField txtObs66;
	private JTextField txtObs67;
	private JTextField txtObs68;
	private JTextField txtObs69;
	private JTextField txtObs70;
	private JTextField txtCantidad500;
	private JTextField txtCantidad501;
	private JTextField txtCantidad510;
	private JTextField txtCantidad511;
	private JTextField txtCantidad520;
	private JTextField txtCantidad521;
	private JTextField txtCantidad530;
	private JTextField txtCantidad531;
	private JTextField txtCantidad540;
	private JTextField txtCantidad541;
	private JTextField txtCantidad550;
	private JTextField txtCantidad551;
	private JTextField txtCantidad560;
	private JTextField txtCantidad561;
	private JTextField txtCantidad570;
	private JTextField txtCantidad571;
	private JTextField txtCantidad580;
	private JTextField txtCantidad581;
	private JTextField txtObs50;
	private JTextField txtObs51;
	private JTextField txtObs52;
	private JTextField txtObs53;
	private JTextField txtObs54;
	private JTextField txtObs55;
	private JTextField txtObs56;
	private JTextField txtObs57;
	private JTextField txtObs58;
	private JTextField txtCantidad420;
	private JTextField txtCantidad421;
	private JTextField txtObs42;
	private JPinformacionObligatoria jpIOblig;
	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// B3Template frame = new B3Template();
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
	public B3Template(TFicha ficha) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 1318, 740);
		pnlPrincipal = new JPanel();
		pnlPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pnlPrincipal);
		pnlPrincipal.setLayout(null);
		this.setTitle(Utilitarios.getNombreFicha() + ficha.getFiNombre());
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.ficha = ficha;

		cargarCabecera();
		cargarInformacionObligatoria(new JPinformacionObligatoria(859, 348));
		setFichaNuevaUpdate();
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				new Menu().setVisible(true);
				dispose();
			}
		});
	}

	private void cargarInformacionObligatoria(JPinformacionObligatoria jpIObligatoria) {
		this.jpIOblig = jpIObligatoria;
		jpIObligatoria.getBtnInsertarFoto().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jpIObligatoria.setPathFotoIO(Utilitarios.getPathImagen());
			}
		});

		cargarTabbedPanel(jpIObligatoria);
	}

	public void cargarTabbedPanel(JPinformacionObligatoria jpIObligatoria) {

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 115, 1286, 594);
		pnlPrincipal.add(tabbedPane);

		JPanel pnlPestaña1 = new JPanel();
		pnlPestaña1.setLayout(null);
		tabbedPane.addTab("1.- " + ficha.getFiDescripcion(), null, pnlPestaña1, null);

		cargarPanelPestaña1(pnlPestaña1);

		JPanel pnlPestaña2 = new JPanel();
		pnlPestaña2.setLayout(null);
		pnlPestaña2.add(jpIObligatoria.getPnlInformacionObl());
		tabbedPane.addTab("2.- " + ficha.getFiDescripcion(), null, pnlPestaña2, null);

		cargarPanelPestaña2(pnlPestaña2);

	}

	public void cargarPanelPestaña2(JPanel pnlPestaña2) {
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(10, 11, 410, 237);
		pnlPestaña2.add(panel_5);
		panel_5.setLayout(null);

		JLabel lblComponenteArquitectnico = new JLabel("COMPONENTE ARQUITECTÓNICO");
		lblComponenteArquitectnico.setHorizontalAlignment(SwingConstants.CENTER);
		lblComponenteArquitectnico.setFont(new Font("Arial", Font.BOLD, 10));
		lblComponenteArquitectnico.setBounds(10, 11, 167, 14);
		panel_5.add(lblComponenteArquitectnico);

		JLabel label_13 = new JLabel("Cantidad");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Arial", Font.BOLD, 10));
		label_13.setBounds(183, 11, 58, 14);
		panel_5.add(label_13);

		JLabel label_14 = new JLabel("Observación/Referencia");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Arial", Font.BOLD, 10));
		label_14.setBounds(238, 11, 167, 14);
		panel_5.add(label_14);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 24, 167, 75);
		panel_5.add(panel_2);
		panel_2.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel lblLblbs_33 = new JLabel(LBL_BST3_35);
		lblLblbs_33.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_33.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_2.add(lblLblbs_33);

		JLabel lblLblbs_34 = new JLabel(LBL_BST3_36);
		lblLblbs_34.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_34.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_2.add(lblLblbs_34);

		JLabel lblLblbs_35 = new JLabel(LBL_BST3_37);
		lblLblbs_35.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_35.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_2.add(lblLblbs_35);

		JPanel panel = new JPanel();
		panel.setBounds(188, 24, 50, 75);
		panel_5.add(panel);
		panel.setLayout(new GridLayout(3, 2, 0, 0));

		txtCantidad360 = new JTextField();
		txtCantidad360.setText("2");
		txtCantidad360.setEditable(false);
		txtCantidad360.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad360.setColumns(10);
		panel.add(txtCantidad360);

		txtCantidad361 = new JTextField();
		txtCantidad361.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad361.setColumns(10);
		panel.add(txtCantidad361);

		txtCantidad370 = new JTextField();
		txtCantidad370.setText("21");
		txtCantidad370.setEditable(false);
		txtCantidad370.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad370.setColumns(10);
		panel.add(txtCantidad370);

		txtCantidad371 = new JTextField();
		txtCantidad371.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad371.setColumns(10);
		panel.add(txtCantidad371);

		txtCantidad380 = new JTextField();
		txtCantidad380.setText("6");
		txtCantidad380.setEditable(false);
		txtCantidad380.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad380.setColumns(10);
		panel.add(txtCantidad380);

		txtCantidad381 = new JTextField();
		txtCantidad381.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad381.setColumns(10);
		panel.add(txtCantidad381);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(248, 24, 152, 75);
		panel_5.add(panel_1);
		panel_1.setLayout(new GridLayout(3, 0, 0, 0));

		txtObs36 = new JTextField();
		txtObs36.setColumns(10);
		panel_1.add(txtObs36);

		txtObs37 = new JTextField();
		txtObs37.setColumns(10);
		panel_1.add(txtObs37);

		txtObs38 = new JTextField();
		txtObs38.setColumns(10);
		panel_1.add(txtObs38);

		JPanel panel_12 = new JPanel();
		panel_12.setBounds(10, 100, 167, 50);
		panel_5.add(panel_12);
		panel_12.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblLblbs_36 = new JLabel(LBL_BST3_38);
		lblLblbs_36.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_36.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_12.add(lblLblbs_36);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(188, 112, 50, 25);
		panel_5.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad390 = new JTextField();
		txtCantidad390.setText("2");
		txtCantidad390.setEditable(false);
		txtCantidad390.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad390.setColumns(10);
		panel_3.add(txtCantidad390);

		txtCantidad391 = new JTextField();
		txtCantidad391.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad391.setColumns(10);
		panel_3.add(txtCantidad391);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(248, 112, 152, 25);
		panel_5.add(panel_4);
		panel_4.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs39 = new JTextField();
		txtObs39.setColumns(10);
		panel_4.add(txtObs39);

		JPanel panel_13 = new JPanel();
		panel_13.setBounds(10, 152, 167, 74);
		panel_5.add(panel_13);
		panel_13.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel lblLblbs_37 = new JLabel(
				"<html><body><p align=right>Ventanas UPVC con vidrio flotado de 3 mm de 0.45x2 mt (  lateral)</p></body></html>");
		lblLblbs_37.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_37.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_13.add(lblLblbs_37);

		JLabel lblLblbs_38 = new JLabel(LBL_BST3_40);
		lblLblbs_38.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_38.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_13.add(lblLblbs_38);

		JLabel lblperfilSfTipo = new JLabel(
				"<html><body><p align=right>Perfil SF Tipo 12 MA-SF-12 para paneles</p></body></html>");
		panel_13.add(lblperfilSfTipo);
		lblperfilSfTipo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblperfilSfTipo.setFont(new Font("Arial", Font.PLAIN, 10));

		JPanel panel_10 = new JPanel();
		panel_10.setBounds(188, 152, 50, 74);
		panel_5.add(panel_10);
		panel_10.setLayout(new GridLayout(3, 2, 0, 0));

		txtCantidad400 = new JTextField();
		txtCantidad400.setText("2");
		txtCantidad400.setEditable(false);
		txtCantidad400.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad400.setColumns(10);
		panel_10.add(txtCantidad400);

		txtCantidad401 = new JTextField();
		txtCantidad401.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad401.setColumns(10);
		panel_10.add(txtCantidad401);

		txtCantidad410 = new JTextField();
		txtCantidad410.setText("16");
		txtCantidad410.setEditable(false);
		txtCantidad410.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad410.setColumns(10);
		panel_10.add(txtCantidad410);

		txtCantidad411 = new JTextField();
		txtCantidad411.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad411.setColumns(10);
		panel_10.add(txtCantidad411);

		txtCantidad420 = new JTextField();
		panel_10.add(txtCantidad420);
		txtCantidad420.setText("8");
		txtCantidad420.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad420.setEditable(false);
		txtCantidad420.setColumns(10);

		txtCantidad421 = new JTextField();
		panel_10.add(txtCantidad421);
		txtCantidad421.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad421.setColumns(10);

		JPanel panel_11 = new JPanel();
		panel_11.setBounds(248, 152, 152, 74);
		panel_5.add(panel_11);
		panel_11.setLayout(new GridLayout(3, 0, 0, 0));

		txtObs40 = new JTextField();
		txtObs40.setColumns(10);
		panel_11.add(txtObs40);

		txtObs41 = new JTextField();
		txtObs41.setColumns(10);
		panel_11.add(txtObs41);

		txtObs42 = new JTextField();
		panel_11.add(txtObs42);
		txtObs42.setColumns(10);

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6.setBounds(10, 254, 410, 105);
		pnlPestaña2.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblFachadaFrontal = new JLabel("FACHADA FRONTAL");
		lblFachadaFrontal.setHorizontalAlignment(SwingConstants.CENTER);
		lblFachadaFrontal.setFont(new Font("Arial", Font.BOLD, 10));
		lblFachadaFrontal.setBounds(10, 11, 167, 14);
		panel_6.add(lblFachadaFrontal);

		JLabel label_1 = new JLabel("Cantidad");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Arial", Font.BOLD, 10));
		label_1.setBounds(183, 11, 58, 14);
		panel_6.add(label_1);

		JLabel label_2 = new JLabel("Observación/Referencia");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Arial", Font.BOLD, 10));
		label_2.setBounds(238, 11, 167, 14);
		panel_6.add(label_2);

		JPanel panel_14 = new JPanel();
		panel_14.setBounds(10, 25, 167, 75);
		panel_6.add(panel_14);
		panel_14.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel lblLblbs_39 = new JLabel(
				"<html><body><p align=right>Paneles EPS pared -   ( 1x3x0,09 m)</p></body></html>");
		lblLblbs_39.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_39.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_14.add(lblLblbs_39);

		JLabel lblLblbs_40 = new JLabel(
				"<html><body><p align=right>Paneles EPS pared -   ( 1x0,90x0,90 m)</p></body></html>");
		lblLblbs_40.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_40.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_14.add(lblLblbs_40);

		JLabel lblLblbs_41 = new JLabel(
				"<html><body><p align=right>Paneles EPS pared -   ( 1x0,60x0,09 m)</p></body></html>");
		lblLblbs_41.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_41.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_14.add(lblLblbs_41);

		JPanel panel_15 = new JPanel();
		panel_15.setBounds(188, 25, 50, 75);
		panel_6.add(panel_15);
		panel_15.setLayout(new GridLayout(3, 2, 0, 0));

		txtCantidad430 = new JTextField();
		txtCantidad430.setText("2");
		txtCantidad430.setEditable(false);
		txtCantidad430.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad430.setColumns(10);
		panel_15.add(txtCantidad430);

		txtCantidad431 = new JTextField();
		txtCantidad431.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad431.setColumns(10);
		panel_15.add(txtCantidad431);

		txtCantidad440 = new JTextField();
		txtCantidad440.setText("2");
		txtCantidad440.setEditable(false);
		txtCantidad440.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad440.setColumns(10);
		panel_15.add(txtCantidad440);

		txtCantidad441 = new JTextField();
		txtCantidad441.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad441.setColumns(10);
		panel_15.add(txtCantidad441);

		txtCantidad450 = new JTextField();
		txtCantidad450.setText("3");
		txtCantidad450.setEditable(false);
		txtCantidad450.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad450.setColumns(10);
		panel_15.add(txtCantidad450);

		txtCantidad451 = new JTextField();
		txtCantidad451.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad451.setColumns(10);
		panel_15.add(txtCantidad451);

		JPanel panel_16 = new JPanel();
		panel_16.setBounds(248, 25, 152, 75);
		panel_6.add(panel_16);
		panel_16.setLayout(new GridLayout(3, 0, 0, 0));

		txtObs43 = new JTextField();
		txtObs43.setColumns(10);
		panel_16.add(txtObs43);

		txtObs44 = new JTextField();
		txtObs44.setColumns(10);
		panel_16.add(txtObs44);

		txtObs45 = new JTextField();
		txtObs45.setColumns(10);
		panel_16.add(txtObs45);

		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_7.setBounds(10, 363, 410, 169);
		pnlPestaña2.add(panel_7);
		panel_7.setLayout(null);

		JLabel lblFachadaPosterior = new JLabel("FACHADA POSTERIOR");
		lblFachadaPosterior.setHorizontalAlignment(SwingConstants.CENTER);
		lblFachadaPosterior.setFont(new Font("Arial", Font.BOLD, 10));
		lblFachadaPosterior.setBounds(10, 11, 167, 14);
		panel_7.add(lblFachadaPosterior);

		JLabel label_4 = new JLabel("Cantidad");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Arial", Font.BOLD, 10));
		label_4.setBounds(183, 11, 58, 14);
		panel_7.add(label_4);

		JLabel label_5 = new JLabel("Observación/Referencia");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Arial", Font.BOLD, 10));
		label_5.setBounds(238, 11, 167, 14);
		panel_7.add(label_5);

		JPanel panel_17 = new JPanel();
		panel_17.setBounds(10, 46, 167, 100);
		panel_7.add(panel_17);
		panel_17.setLayout(new GridLayout(4, 0, 0, 0));

		JLabel lblLblbs_42 = new JLabel(
				"<html><body><p align=right>Paneles EPS pared - ( 1x2,70 x0,90  m)</p></body></html>");
		lblLblbs_42.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_42.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_17.add(lblLblbs_42);

		JLabel lblLblbs_43 = new JLabel(
				"<html><body><p align=right>Paneles EPS pared - ( 0,60x2,70 x0,90  m)</p></body></html>");
		lblLblbs_43.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_43.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_17.add(lblLblbs_43);

		JLabel lblLblbs_44 = new JLabel(
				"<html><body><p align=right>Paneles EPS pared - ( 1,0x1,80 x0,90  m)</p></body></html>");
		lblLblbs_44.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_44.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_17.add(lblLblbs_44);

		JLabel lblLblbs_45 = new JLabel(
				"<html><body><p align=right>Paneles EPS pared - ( 1x0,45 x0,90  m)</p></body></html>");
		lblLblbs_45.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_45.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_17.add(lblLblbs_45);

		JPanel panel_18 = new JPanel();
		panel_18.setBounds(188, 46, 50, 100);
		panel_7.add(panel_18);
		panel_18.setLayout(new GridLayout(4, 2, 0, 0));

		txtCantidad460 = new JTextField();
		txtCantidad460.setText("2");
		txtCantidad460.setEditable(false);
		txtCantidad460.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad460.setColumns(10);
		panel_18.add(txtCantidad460);

		txtCantidad461 = new JTextField();
		txtCantidad461.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad461.setColumns(10);
		panel_18.add(txtCantidad461);

		txtCantidad470 = new JTextField();
		txtCantidad470.setText("1");
		txtCantidad470.setEditable(false);
		txtCantidad470.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad470.setColumns(10);
		panel_18.add(txtCantidad470);

		txtCantidad471 = new JTextField();
		txtCantidad471.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad471.setColumns(10);
		panel_18.add(txtCantidad471);

		txtCantidad480 = new JTextField();
		txtCantidad480.setText("2");
		txtCantidad480.setEditable(false);
		panel_18.add(txtCantidad480);
		txtCantidad480.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad480.setColumns(10);

		txtCantidad481 = new JTextField();
		panel_18.add(txtCantidad481);
		txtCantidad481.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad481.setColumns(10);

		txtCantidad490 = new JTextField();
		txtCantidad490.setText("2");
		txtCantidad490.setEditable(false);
		panel_18.add(txtCantidad490);
		txtCantidad490.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad490.setColumns(10);

		txtCantidad491 = new JTextField();
		panel_18.add(txtCantidad491);
		txtCantidad491.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad491.setColumns(10);

		JPanel panel_19 = new JPanel();
		panel_19.setBounds(248, 46, 152, 100);
		panel_7.add(panel_19);
		panel_19.setLayout(new GridLayout(4, 0, 0, 0));

		txtObs46 = new JTextField();
		txtObs46.setColumns(10);
		panel_19.add(txtObs46);

		txtObs47 = new JTextField();
		txtObs47.setColumns(10);
		panel_19.add(txtObs47);

		txtObs48 = new JTextField();
		txtObs48.setColumns(10);
		panel_19.add(txtObs48);

		txtObs49 = new JTextField();
		txtObs49.setColumns(10);
		panel_19.add(txtObs49);

		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_8.setBounds(430, 11, 410, 334);
		pnlPestaña2.add(panel_8);
		panel_8.setLayout(null);

		JLabel lblFachadaLateral = new JLabel("FACHADA LATERAL");
		lblFachadaLateral.setHorizontalAlignment(SwingConstants.CENTER);
		lblFachadaLateral.setFont(new Font("Arial", Font.BOLD, 10));
		lblFachadaLateral.setBounds(10, 11, 167, 14);
		panel_8.add(lblFachadaLateral);

		JLabel label_7 = new JLabel("Cantidad");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Arial", Font.BOLD, 10));
		label_7.setBounds(183, 11, 58, 14);
		panel_8.add(label_7);

		JLabel label_8 = new JLabel("Observación/Referencia");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Arial", Font.BOLD, 10));
		label_8.setBounds(238, 11, 167, 14);
		panel_8.add(label_8);

		JPanel panel_20 = new JPanel();
		panel_20.setBounds(10, 25, 167, 300);
		panel_8.add(panel_20);
		panel_20.setLayout(new GridLayout(9, 0, 0, 0));

		JLabel lblLblbs_46 = new JLabel("<html><body><p align=right>Panel Hvar- fachada lateral izq</p></body></html>");
		lblLblbs_46.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_46.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_20.add(lblLblbs_46);

		JLabel lblLblbs_47 = new JLabel(
				"<html><body><p align=right>Panel Hvar- fachada lateral derecha</p></body></html>");
		lblLblbs_47.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_47.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_20.add(lblLblbs_47);

		JLabel lblLblbs_48 = new JLabel("<html><body><p align=right>Paneles TCB piso (4.30x5.70)</p></body></html>");
		lblLblbs_48.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_48.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_20.add(lblLblbs_48);

		JLabel lblLblbs_49 = new JLabel(
				"<html><body><p align=right>Paneles EPS para cubierta l=7, a= 1mt</p></body></html>");
		lblLblbs_49.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_49.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_20.add(lblLblbs_49);

		JLabel lblLblbs_50 = new JLabel(
				"<html><body><p align=right>Paneles EPS para cubierta l=0.60, a= 1mt</p></body></html>");
		lblLblbs_50.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_50.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_20.add(lblLblbs_50);

		JLabel lblLblbs_51 = new JLabel(
				"<html><body><p align=right>Paneles divisores bat. Sanitarias</p></body></html>");
		lblLblbs_51.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_51.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_20.add(lblLblbs_51);

		JLabel lblLblbs_52 = new JLabel("<html><body><p align=right>Paneles divisores urinario</p></body></html>");
		lblLblbs_52.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_52.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_20.add(lblLblbs_52);

		JLabel lblLblbs_53 = new JLabel(
				"<html><body><p align=right>Set puertas interiores baterías sanitarias</p></body></html>");
		lblLblbs_53.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_53.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_20.add(lblLblbs_53);

		JLabel lblLblbs_54 = new JLabel(
				"<html><body><p align=right>Set mesón para lavamanos (hombre y mujer)</p></body></html>");
		lblLblbs_54.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_54.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_20.add(lblLblbs_54);

		JPanel panel_21 = new JPanel();
		panel_21.setBounds(188, 25, 50, 300);
		panel_8.add(panel_21);
		panel_21.setLayout(new GridLayout(9, 2, 0, 0));

		txtCantidad500 = new JTextField();
		txtCantidad500.setText("6");
		txtCantidad500.setEditable(false);
		txtCantidad500.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad500.setColumns(10);
		panel_21.add(txtCantidad500);

		txtCantidad501 = new JTextField();
		txtCantidad501.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad501.setColumns(10);
		panel_21.add(txtCantidad501);

		txtCantidad510 = new JTextField();
		txtCantidad510.setText("6");
		txtCantidad510.setEditable(false);
		txtCantidad510.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad510.setColumns(10);
		panel_21.add(txtCantidad510);

		txtCantidad511 = new JTextField();
		txtCantidad511.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad511.setColumns(10);
		panel_21.add(txtCantidad511);

		txtCantidad520 = new JTextField();
		txtCantidad520.setText("1");
		txtCantidad520.setEditable(false);
		txtCantidad520.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad520.setColumns(10);
		panel_21.add(txtCantidad520);

		txtCantidad521 = new JTextField();
		txtCantidad521.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad521.setColumns(10);
		panel_21.add(txtCantidad521);

		txtCantidad530 = new JTextField();
		txtCantidad530.setText("4");
		txtCantidad530.setEditable(false);
		txtCantidad530.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad530.setColumns(10);
		panel_21.add(txtCantidad530);

		txtCantidad531 = new JTextField();
		txtCantidad531.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad531.setColumns(10);
		panel_21.add(txtCantidad531);

		txtCantidad540 = new JTextField();
		txtCantidad540.setText("1");
		txtCantidad540.setEditable(false);
		txtCantidad540.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad540.setColumns(10);
		panel_21.add(txtCantidad540);

		txtCantidad541 = new JTextField();
		txtCantidad541.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad541.setColumns(10);
		panel_21.add(txtCantidad541);

		txtCantidad550 = new JTextField();
		txtCantidad550.setText("5");
		txtCantidad550.setEditable(false);
		txtCantidad550.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad550.setColumns(10);
		panel_21.add(txtCantidad550);

		txtCantidad551 = new JTextField();
		txtCantidad551.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad551.setColumns(10);
		panel_21.add(txtCantidad551);

		txtCantidad560 = new JTextField();
		txtCantidad560.setText("3");
		txtCantidad560.setEditable(false);
		txtCantidad560.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad560.setColumns(10);
		panel_21.add(txtCantidad560);

		txtCantidad561 = new JTextField();
		txtCantidad561.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad561.setColumns(10);
		panel_21.add(txtCantidad561);

		txtCantidad570 = new JTextField();
		txtCantidad570.setText("5");
		txtCantidad570.setEditable(false);
		txtCantidad570.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad570.setColumns(10);
		panel_21.add(txtCantidad570);

		txtCantidad571 = new JTextField();
		txtCantidad571.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad571.setColumns(10);
		panel_21.add(txtCantidad571);

		txtCantidad580 = new JTextField();
		txtCantidad580.setText("2");
		txtCantidad580.setEditable(false);
		txtCantidad580.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad580.setColumns(10);
		panel_21.add(txtCantidad580);

		txtCantidad581 = new JTextField();
		txtCantidad581.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad581.setColumns(10);
		panel_21.add(txtCantidad581);

		JPanel panel_22 = new JPanel();
		panel_22.setBounds(248, 25, 152, 300);
		panel_8.add(panel_22);
		panel_22.setLayout(new GridLayout(9, 0, 0, 0));

		txtObs50 = new JTextField();
		txtObs50.setColumns(10);
		panel_22.add(txtObs50);

		txtObs51 = new JTextField();
		txtObs51.setColumns(10);
		panel_22.add(txtObs51);

		txtObs52 = new JTextField();
		txtObs52.setColumns(10);
		panel_22.add(txtObs52);

		txtObs53 = new JTextField();
		txtObs53.setColumns(10);
		panel_22.add(txtObs53);

		txtObs54 = new JTextField();
		txtObs54.setColumns(10);
		panel_22.add(txtObs54);

		txtObs55 = new JTextField();
		txtObs55.setColumns(10);
		panel_22.add(txtObs55);

		txtObs56 = new JTextField();
		txtObs56.setColumns(10);
		panel_22.add(txtObs56);

		txtObs57 = new JTextField();
		txtObs57.setColumns(10);
		panel_22.add(txtObs57);

		txtObs58 = new JTextField();
		txtObs58.setColumns(10);
		panel_22.add(txtObs58);

		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_9.setBounds(856, 11, 410, 334);
		pnlPestaña2.add(panel_9);
		panel_9.setLayout(null);

		JLabel lblComponenteEstructural = new JLabel("COMPONENTE ESTRUCTURAL");
		lblComponenteEstructural.setHorizontalAlignment(SwingConstants.CENTER);
		lblComponenteEstructural.setFont(new Font("Arial", Font.BOLD, 10));
		lblComponenteEstructural.setBounds(10, 11, 167, 14);
		panel_9.add(lblComponenteEstructural);

		JLabel label_10 = new JLabel("Cantidad");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Arial", Font.BOLD, 10));
		label_10.setBounds(183, 11, 58, 14);
		panel_9.add(label_10);

		JLabel label_11 = new JLabel("Observación/Referencia");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Arial", Font.BOLD, 10));
		label_11.setBounds(238, 11, 167, 14);
		panel_9.add(label_11);

		JPanel panel_23 = new JPanel();
		panel_23.setBounds(10, 25, 167, 300);
		panel_9.add(panel_23);
		panel_23.setLayout(new GridLayout(12, 0, 0, 0));

		JLabel lblLblbs_56 = new JLabel(LBL_BST3_58);
		lblLblbs_56.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_56.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_23.add(lblLblbs_56);

		JLabel lblLblbs_57 = new JLabel(LBL_BST3_59);
		lblLblbs_57.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_57.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_23.add(lblLblbs_57);

		JLabel lblLblbs_58 = new JLabel(LBL_BST3_60);
		lblLblbs_58.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_58.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_23.add(lblLblbs_58);

		JLabel lblLblbs_59 = new JLabel(LBL_BST3_61);
		lblLblbs_59.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_59.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_23.add(lblLblbs_59);

		JLabel lblLblbs_60 = new JLabel(LBL_BST3_62);
		panel_23.add(lblLblbs_60);
		lblLblbs_60.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_60.setFont(new Font("Arial", Font.PLAIN, 10));

		JLabel lblLblbs_61 = new JLabel(LBL_BST3_63);
		panel_23.add(lblLblbs_61);
		lblLblbs_61.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_61.setFont(new Font("Arial", Font.PLAIN, 10));

		JLabel lblLblbs_65 = new JLabel("<html><body><p align=right>Perfil SF Tipo 9 MA-SF-6</p></body></html>");
		lblLblbs_65.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_65.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_23.add(lblLblbs_65);

		JLabel lblLblbs_62 = new JLabel("<html><body><p align=right>Perfil SF Tipo 6 MA-SF-7</p></body></html>");
		panel_23.add(lblLblbs_62);
		lblLblbs_62.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_62.setFont(new Font("Arial", Font.PLAIN, 10));

		JLabel lblLblbs_63 = new JLabel("<html><body><p align=right>Perfil SF Tipo 7 MA-SF-8</p></body></html>");
		panel_23.add(lblLblbs_63);
		lblLblbs_63.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_63.setFont(new Font("Arial", Font.PLAIN, 10));

		JLabel lblLblbs_64 = new JLabel("<html><body><p align=right>Perfil SF Tipo 8 MA-SF-9</p></body></html>");
		lblLblbs_64.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_64.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_23.add(lblLblbs_64);

		JLabel lblLblbs_66 = new JLabel(LBL_BST3_68);
		lblLblbs_66.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_66.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_23.add(lblLblbs_66);

		JLabel lblLblbs_67 = new JLabel(LBL_BST3_69);
		lblLblbs_67.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_67.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_23.add(lblLblbs_67);

		JPanel panel_24 = new JPanel();
		panel_24.setBounds(188, 25, 50, 300);
		panel_9.add(panel_24);
		panel_24.setLayout(new GridLayout(12, 2, 0, 0));

		txtCantidad590 = new JTextField();
		txtCantidad590.setText("12");
		txtCantidad590.setEditable(false);
		txtCantidad590.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad590.setColumns(10);
		panel_24.add(txtCantidad590);

		txtCantidad591 = new JTextField();
		txtCantidad591.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad591.setColumns(10);
		panel_24.add(txtCantidad591);

		txtCantidad600 = new JTextField();
		txtCantidad600.setText("2");
		txtCantidad600.setEditable(false);
		txtCantidad600.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad600.setColumns(10);
		panel_24.add(txtCantidad600);

		txtCantidad601 = new JTextField();
		txtCantidad601.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad601.setColumns(10);
		panel_24.add(txtCantidad601);

		txtCantidad610 = new JTextField();
		txtCantidad610.setText("2");
		txtCantidad610.setEditable(false);
		txtCantidad610.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad610.setColumns(10);
		panel_24.add(txtCantidad610);

		txtCantidad611 = new JTextField();
		txtCantidad611.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad611.setColumns(10);
		panel_24.add(txtCantidad611);

		txtCantidad620 = new JTextField();
		txtCantidad620.setText("12");
		txtCantidad620.setEditable(false);
		txtCantidad620.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad620.setColumns(10);
		panel_24.add(txtCantidad620);

		txtCantidad621 = new JTextField();
		txtCantidad621.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad621.setColumns(10);
		panel_24.add(txtCantidad621);

		txtCantidad630 = new JTextField();
		txtCantidad630.setText("4");
		txtCantidad630.setEditable(false);
		txtCantidad630.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad630.setColumns(10);
		panel_24.add(txtCantidad630);

		txtCantidad631 = new JTextField();
		txtCantidad631.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad631.setColumns(10);
		panel_24.add(txtCantidad631);

		txtCantidad640 = new JTextField();
		txtCantidad640.setText("30");
		txtCantidad640.setEditable(false);
		txtCantidad640.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad640.setColumns(10);
		panel_24.add(txtCantidad640);

		txtCantidad641 = new JTextField();
		txtCantidad641.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad641.setColumns(10);
		panel_24.add(txtCantidad641);

		txtCantidad650 = new JTextField();
		txtCantidad650.setText("30");
		txtCantidad650.setEditable(false);
		txtCantidad650.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad650.setColumns(10);
		panel_24.add(txtCantidad650);

		txtCantidad651 = new JTextField();
		txtCantidad651.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad651.setColumns(10);
		panel_24.add(txtCantidad651);

		txtCantidad660 = new JTextField();
		txtCantidad660.setText("2");
		txtCantidad660.setEditable(false);
		txtCantidad660.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad660.setColumns(10);
		panel_24.add(txtCantidad660);

		txtCantidad661 = new JTextField();
		txtCantidad661.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad661.setColumns(10);
		panel_24.add(txtCantidad661);

		txtCantidad670 = new JTextField();
		txtCantidad670.setText("2");
		txtCantidad670.setEditable(false);
		txtCantidad670.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad670.setColumns(10);
		panel_24.add(txtCantidad670);

		txtCantidad671 = new JTextField();
		txtCantidad671.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad671.setColumns(10);
		panel_24.add(txtCantidad671);

		txtCantidad680 = new JTextField();
		txtCantidad680.setText("12");
		txtCantidad680.setEditable(false);
		txtCantidad680.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad680.setColumns(10);
		panel_24.add(txtCantidad680);

		txtCantidad681 = new JTextField();
		txtCantidad681.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad681.setColumns(10);
		panel_24.add(txtCantidad681);

		txtCantidad690 = new JTextField();
		txtCantidad690.setText("6");
		txtCantidad690.setEditable(false);
		txtCantidad690.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad690.setColumns(10);
		panel_24.add(txtCantidad690);

		txtCantidad691 = new JTextField();
		txtCantidad691.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad691.setColumns(10);
		panel_24.add(txtCantidad691);

		txtCantidad700 = new JTextField();
		txtCantidad700.setText("30");
		txtCantidad700.setEditable(false);
		txtCantidad700.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad700.setColumns(10);
		panel_24.add(txtCantidad700);

		txtCantidad701 = new JTextField();
		txtCantidad701.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad701.setColumns(10);
		panel_24.add(txtCantidad701);

		JPanel panel_25 = new JPanel();
		panel_25.setBounds(248, 25, 152, 300);
		panel_9.add(panel_25);
		panel_25.setLayout(new GridLayout(12, 0, 0, 0));

		txtObs59 = new JTextField();
		txtObs59.setColumns(10);
		panel_25.add(txtObs59);

		txtObs60 = new JTextField();
		txtObs60.setColumns(10);
		panel_25.add(txtObs60);

		txtObs61 = new JTextField();
		txtObs61.setColumns(10);
		panel_25.add(txtObs61);

		txtObs62 = new JTextField();
		txtObs62.setColumns(10);
		panel_25.add(txtObs62);

		txtObs63 = new JTextField();
		txtObs63.setColumns(10);
		panel_25.add(txtObs63);

		txtObs64 = new JTextField();
		txtObs64.setColumns(10);
		panel_25.add(txtObs64);

		txtObs65 = new JTextField();
		txtObs65.setColumns(10);
		panel_25.add(txtObs65);

		txtObs66 = new JTextField();
		txtObs66.setColumns(10);
		panel_25.add(txtObs66);

		txtObs67 = new JTextField();
		txtObs67.setColumns(10);
		panel_25.add(txtObs67);

		txtObs68 = new JTextField();
		txtObs68.setColumns(10);
		panel_25.add(txtObs68);

		txtObs69 = new JTextField();
		txtObs69.setColumns(10);
		panel_25.add(txtObs69);

		txtObs70 = new JTextField();
		txtObs70.setColumns(10);
		panel_25.add(txtObs70);

	}

	public void cargarPanelPestaña1(JPanel pnlPestaña1) {
		JPanel panel_0 = new JPanel();
		panel_0.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_0.setBounds(10, 11, 410, 165);
		pnlPestaña1.add(panel_0);
		panel_0.setLayout(null);

		JLabel label = new JLabel("KIT ELÉCTRICO");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 10));
		label.setBounds(10, 11, 167, 14);
		panel_0.add(label);

		JLabel label_1 = new JLabel("Cantidad");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Arial", Font.BOLD, 10));
		label_1.setBounds(183, 11, 58, 14);
		panel_0.add(label_1);

		JLabel label_2 = new JLabel("Observación/Referencia");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Arial", Font.BOLD, 10));
		label_2.setBounds(238, 11, 167, 14);
		panel_0.add(label_2);

		JPanel pnlCantidad0 = new JPanel();
		pnlCantidad0.setBounds(188, 30, 50, 125);
		panel_0.add(pnlCantidad0);
		pnlCantidad0.setLayout(new GridLayout(5, 2, 0, 0));

		txtCantidad00 = new JTextField();
		txtCantidad00.setText("4");
		txtCantidad00.setEditable(false);
		txtCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		pnlCantidad0.add(txtCantidad00);
		txtCantidad00.setColumns(10);

		txtCantidad01 = new JTextField();
		txtCantidad01.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad01.setColumns(10);
		pnlCantidad0.add(txtCantidad01);

		txtCantidad10 = new JTextField();
		txtCantidad10.setText("2");
		txtCantidad10.setEditable(false);
		txtCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		pnlCantidad0.add(txtCantidad10);
		txtCantidad10.setColumns(10);

		txtCantidad11 = new JTextField();
		txtCantidad11.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad11.setColumns(10);
		pnlCantidad0.add(txtCantidad11);

		txtCantidad20 = new JTextField();
		txtCantidad20.setText("2");
		txtCantidad20.setEditable(false);
		txtCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad20.setColumns(10);
		pnlCantidad0.add(txtCantidad20);

		txtCantidad21 = new JTextField();
		txtCantidad21.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad21.setColumns(10);
		pnlCantidad0.add(txtCantidad21);

		txtCantidad30 = new JTextField();
		txtCantidad30.setText("1");
		txtCantidad30.setEditable(false);
		txtCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad30.setColumns(10);
		pnlCantidad0.add(txtCantidad30);

		txtCantidad31 = new JTextField();
		txtCantidad31.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad31.setColumns(10);
		pnlCantidad0.add(txtCantidad31);

		txtCantidad40 = new JTextField();
		txtCantidad40.setText("2");
		txtCantidad40.setEditable(false);
		txtCantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad40.setColumns(10);
		pnlCantidad0.add(txtCantidad40);

		txtCantidad41 = new JTextField();
		txtCantidad41.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad41.setColumns(10);
		pnlCantidad0.add(txtCantidad41);

		JPanel pnlObservacion0 = new JPanel();
		pnlObservacion0.setBounds(248, 30, 152, 125);
		panel_0.add(pnlObservacion0);
		pnlObservacion0.setLayout(new GridLayout(5, 0, 0, 0));

		txtObs0 = new JTextField();
		pnlObservacion0.add(txtObs0);
		txtObs0.setColumns(10);

		txtObs1 = new JTextField();
		txtObs1.setColumns(10);
		pnlObservacion0.add(txtObs1);

		txtObs2 = new JTextField();
		txtObs2.setColumns(10);
		pnlObservacion0.add(txtObs2);

		txtObs3 = new JTextField();
		txtObs3.setColumns(10);
		pnlObservacion0.add(txtObs3);

		txtObs4 = new JTextField();
		txtObs4.setColumns(10);
		pnlObservacion0.add(txtObs4);

		JPanel panel = new JPanel();
		panel.setBounds(10, 30, 167, 125);
		panel_0.add(panel);
		panel.setLayout(new GridLayout(5, 0, 0, 0));

		JLabel lblNewLabel = new JLabel(LBL_BST3_0);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 10));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblNewLabel);

		JLabel lblLblbs = new JLabel(LBL_BST3_1);
		lblLblbs.setFont(new Font("Arial", Font.PLAIN, 10));
		lblLblbs.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblLblbs);

		JLabel lblLblbs_1 = new JLabel(LBL_BST3_2);
		lblLblbs_1.setFont(new Font("Arial", Font.PLAIN, 10));
		lblLblbs_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblLblbs_1);

		JLabel lblLblbs_2 = new JLabel(LBL_BST3_3);
		lblLblbs_2.setFont(new Font("Arial", Font.PLAIN, 10));
		lblLblbs_2.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblLblbs_2);

		JLabel lblLblbs_3 = new JLabel(LBL_BST3_4);
		lblLblbs_3.setFont(new Font("Arial", Font.PLAIN, 10));
		lblLblbs_3.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblLblbs_3);

		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.BLUE);
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel_1.setBounds(10, 193, 410, 110);
		pnlPestaña1.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblKithidrosanitario = new JLabel("KITHIDROSANITARIO");
		lblKithidrosanitario.setHorizontalAlignment(SwingConstants.CENTER);
		lblKithidrosanitario.setFont(new Font("Arial", Font.BOLD, 10));
		lblKithidrosanitario.setBounds(10, 11, 167, 14);
		panel_1.add(lblKithidrosanitario);

		JLabel label_4 = new JLabel("Cantidad");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Arial", Font.BOLD, 10));
		label_4.setBounds(183, 11, 58, 14);
		panel_1.add(label_4);

		JLabel label_5 = new JLabel("Observación/Referencia");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Arial", Font.BOLD, 10));
		label_5.setBounds(238, 11, 167, 14);
		panel_1.add(label_5);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(188, 27, 50, 75);
		panel_1.add(panel_5);
		panel_5.setLayout(new GridLayout(3, 2, 0, 0));

		txtCantidad50 = new JTextField();
		txtCantidad50.setText("5");
		txtCantidad50.setEditable(false);
		txtCantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad50.setColumns(10);
		panel_5.add(txtCantidad50);

		txtCantidad51 = new JTextField();
		txtCantidad51.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad51.setColumns(10);
		panel_5.add(txtCantidad51);

		txtCantidad60 = new JTextField();
		txtCantidad60.setText("2");
		txtCantidad60.setEditable(false);
		txtCantidad60.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad60.setColumns(10);
		panel_5.add(txtCantidad60);

		txtCantidad61 = new JTextField();
		txtCantidad61.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad61.setColumns(10);
		panel_5.add(txtCantidad61);

		txtCantidad70 = new JTextField();
		txtCantidad70.setText("4");
		txtCantidad70.setEditable(false);
		txtCantidad70.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad70.setColumns(10);
		panel_5.add(txtCantidad70);

		txtCantidad71 = new JTextField();
		txtCantidad71.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad71.setColumns(10);
		panel_5.add(txtCantidad71);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(248, 27, 152, 75);
		panel_1.add(panel_6);
		panel_6.setLayout(new GridLayout(3, 0, 0, 0));

		txtObs5 = new JTextField();
		txtObs5.setColumns(10);
		panel_6.add(txtObs5);

		txtObs6 = new JTextField();
		txtObs6.setColumns(10);
		panel_6.add(txtObs6);

		txtObs7 = new JTextField();
		txtObs7.setColumns(10);
		panel_6.add(txtObs7);

		JPanel panel_15 = new JPanel();
		panel_15.setBounds(10, 27, 167, 75);
		panel_1.add(panel_15);
		panel_15.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel lblLblbs_4 = new JLabel(LBL_BST3_5);
		lblLblbs_4.setFont(new Font("Arial", Font.PLAIN, 10));
		lblLblbs_4.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_15.add(lblLblbs_4);

		JLabel lblLblbs_5 = new JLabel(LBL_BST3_6);
		lblLblbs_5.setFont(new Font("Arial", Font.PLAIN, 10));
		lblLblbs_5.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_15.add(lblLblbs_5);

		JLabel lblLblbs_6 = new JLabel(LBL_BST3_7);
		lblLblbs_6.setFont(new Font("Arial", Font.PLAIN, 10));
		lblLblbs_6.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_15.add(lblLblbs_6);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 314, 410, 241);
		pnlPestaña1.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblKitAgua = new JLabel("KIT AGUA");
		lblKitAgua.setHorizontalAlignment(SwingConstants.CENTER);
		lblKitAgua.setFont(new Font("Arial", Font.BOLD, 10));
		lblKitAgua.setBounds(10, 11, 167, 14);
		panel_2.add(lblKitAgua);

		JLabel label_7 = new JLabel("Cantidad");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Arial", Font.BOLD, 10));
		label_7.setBounds(183, 11, 58, 14);
		panel_2.add(label_7);

		JLabel label_8 = new JLabel("Observación/Referencia");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Arial", Font.BOLD, 10));
		label_8.setBounds(238, 11, 167, 14);
		panel_2.add(label_8);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(188, 28, 50, 50);
		panel_2.add(panel_7);
		panel_7.setLayout(new GridLayout(2, 2, 0, 0));

		txtCantidad80 = new JTextField();
		txtCantidad80.setText("1");
		txtCantidad80.setEditable(false);
		txtCantidad80.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad80.setColumns(10);
		panel_7.add(txtCantidad80);

		txtCantidad81 = new JTextField();
		txtCantidad81.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad81.setColumns(10);
		panel_7.add(txtCantidad81);

		txtCantidad90 = new JTextField();
		txtCantidad90.setText("1");
		txtCantidad90.setEditable(false);
		txtCantidad90.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad90.setColumns(10);
		panel_7.add(txtCantidad90);

		txtCantidad91 = new JTextField();
		txtCantidad91.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad91.setColumns(10);
		panel_7.add(txtCantidad91);

		JPanel panel_8 = new JPanel();
		panel_8.setBounds(248, 28, 152, 50);
		panel_2.add(panel_8);
		panel_8.setLayout(new GridLayout(2, 0, 0, 0));

		txtObs8 = new JTextField();
		txtObs8.setColumns(10);
		panel_8.add(txtObs8);

		txtObs9 = new JTextField();
		txtObs9.setColumns(10);
		panel_8.add(txtObs9);

		JPanel panel_9 = new JPanel();
		panel_9.setBounds(188, 95, 50, 25);
		panel_2.add(panel_9);
		panel_9.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad100 = new JTextField();
		txtCantidad100.setText("2");
		txtCantidad100.setEditable(false);
		txtCantidad100.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad100.setColumns(10);
		panel_9.add(txtCantidad100);

		txtCantidad101 = new JTextField();
		txtCantidad101.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad101.setColumns(10);
		panel_9.add(txtCantidad101);

		JPanel panel_10 = new JPanel();
		panel_10.setBounds(248, 95, 152, 25);
		panel_2.add(panel_10);
		panel_10.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs10 = new JTextField();
		txtObs10.setColumns(10);
		panel_10.add(txtObs10);

		JPanel panel_11 = new JPanel();
		panel_11.setBounds(188, 133, 50, 50);
		panel_2.add(panel_11);
		panel_11.setLayout(new GridLayout(2, 2, 0, 0));

		txtCantidad110 = new JTextField();
		txtCantidad110.setText("1");
		txtCantidad110.setEditable(false);
		txtCantidad110.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad110.setColumns(10);
		panel_11.add(txtCantidad110);

		txtCantidad111 = new JTextField();
		txtCantidad111.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad111.setColumns(10);
		panel_11.add(txtCantidad111);

		txtCantidad120 = new JTextField();
		txtCantidad120.setText("1");
		txtCantidad120.setEditable(false);
		txtCantidad120.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad120.setColumns(10);
		panel_11.add(txtCantidad120);

		txtCantidad121 = new JTextField();
		txtCantidad121.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad121.setColumns(10);
		panel_11.add(txtCantidad121);

		JPanel panel_12 = new JPanel();
		panel_12.setBounds(248, 133, 152, 50);
		panel_2.add(panel_12);
		panel_12.setLayout(new GridLayout(2, 0, 0, 0));

		txtObs11 = new JTextField();
		txtObs11.setColumns(10);
		panel_12.add(txtObs11);

		txtObs12 = new JTextField();
		txtObs12.setColumns(10);
		panel_12.add(txtObs12);

		JPanel panel_13 = new JPanel();
		panel_13.setBounds(188, 202, 50, 25);
		panel_2.add(panel_13);
		panel_13.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad130 = new JTextField();
		txtCantidad130.setText("1");
		txtCantidad130.setEditable(false);
		txtCantidad130.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad130.setColumns(10);
		panel_13.add(txtCantidad130);

		txtCantidad131 = new JTextField();
		txtCantidad131.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad131.setColumns(10);
		panel_13.add(txtCantidad131);

		JPanel panel_14 = new JPanel();
		panel_14.setBounds(248, 202, 152, 25);
		panel_2.add(panel_14);
		panel_14.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs13 = new JTextField();
		txtObs13.setColumns(10);
		panel_14.add(txtObs13);

		JPanel panel_16 = new JPanel();
		panel_16.setBounds(10, 28, 167, 50);
		panel_2.add(panel_16);
		panel_16.setLayout(new GridLayout(2, 0, 0, 0));

		JLabel lblLblbs_7 = new JLabel(LBL_BST3_8);
		lblLblbs_7.setFont(new Font("Arial", Font.PLAIN, 10));
		lblLblbs_7.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_16.add(lblLblbs_7);

		JLabel lblLblbs_8 = new JLabel(LBL_BST3_9);
		lblLblbs_8.setFont(new Font("Arial", Font.PLAIN, 10));
		lblLblbs_8.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_16.add(lblLblbs_8);

		JPanel panel_17 = new JPanel();
		panel_17.setBounds(10, 80, 167, 50);
		panel_2.add(panel_17);
		panel_17.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblLblbs_9 = new JLabel(LBL_BST3_10);
		lblLblbs_9.setFont(new Font("Arial", Font.PLAIN, 10));
		lblLblbs_9.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_17.add(lblLblbs_9);

		JPanel panel_18 = new JPanel();
		panel_18.setBounds(10, 133, 167, 50);
		panel_2.add(panel_18);
		panel_18.setLayout(new GridLayout(2, 0, 0, 0));

		JLabel lblLblbs_10 = new JLabel(LBL_BST3_11);
		lblLblbs_10.setFont(new Font("Arial", Font.PLAIN, 10));
		lblLblbs_10.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_18.add(lblLblbs_10);

		JLabel lblLblbs_11 = new JLabel(LBL_BST3_12);
		lblLblbs_11.setFont(new Font("Arial", Font.PLAIN, 10));
		lblLblbs_11.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_18.add(lblLblbs_11);

		JPanel panel_19 = new JPanel();
		panel_19.setBounds(10, 188, 167, 50);
		panel_2.add(panel_19);
		panel_19.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblLblbs_12 = new JLabel(LBL_BST3_13);
		lblLblbs_12.setFont(new Font("Arial", Font.PLAIN, 10));
		lblLblbs_12.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_19.add(lblLblbs_12);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(435, 11, 410, 544);
		pnlPestaña1.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblKitAguaPotable = new JLabel("KIT AGUA POTABLE");
		lblKitAguaPotable.setHorizontalAlignment(SwingConstants.CENTER);
		lblKitAguaPotable.setFont(new Font("Arial", Font.BOLD, 10));
		lblKitAguaPotable.setBounds(10, 11, 167, 14);
		panel_3.add(lblKitAguaPotable);

		JLabel label_10 = new JLabel("Cantidad");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Arial", Font.BOLD, 10));
		label_10.setBounds(183, 11, 58, 14);
		panel_3.add(label_10);

		JLabel label_11 = new JLabel("Observación/Referencia");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Arial", Font.BOLD, 10));
		label_11.setBounds(238, 11, 167, 14);
		panel_3.add(label_11);

		JPanel panel_20 = new JPanel();
		panel_20.setBounds(187, 73, 50, 25);
		panel_3.add(panel_20);
		panel_20.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad140 = new JTextField();
		txtCantidad140.setText("5");
		txtCantidad140.setEditable(false);
		txtCantidad140.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad140.setColumns(10);
		panel_20.add(txtCantidad140);

		txtCantidad141 = new JTextField();
		txtCantidad141.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad141.setColumns(10);
		panel_20.add(txtCantidad141);

		JPanel panel_21 = new JPanel();
		panel_21.setBounds(247, 73, 152, 25);
		panel_3.add(panel_21);
		panel_21.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs14 = new JTextField();
		txtObs14.setColumns(10);
		panel_21.add(txtObs14);

		JPanel panel_22 = new JPanel();
		panel_22.setBounds(10, 37, 167, 100);
		panel_3.add(panel_22);
		panel_22.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblLblbs_13 = new JLabel(LBL_BST3_14);
		lblLblbs_13.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_13.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_22.add(lblLblbs_13);

		JPanel panel_23 = new JPanel();
		panel_23.setBounds(188, 163, 50, 25);
		panel_3.add(panel_23);
		panel_23.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad150 = new JTextField();
		txtCantidad150.setText("4");
		txtCantidad150.setEditable(false);
		txtCantidad150.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad150.setColumns(10);
		panel_23.add(txtCantidad150);

		txtCantidad151 = new JTextField();
		txtCantidad151.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad151.setColumns(10);
		panel_23.add(txtCantidad151);

		JPanel panel_24 = new JPanel();
		panel_24.setBounds(248, 163, 152, 25);
		panel_3.add(panel_24);
		panel_24.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs15 = new JTextField();
		txtObs15.setColumns(10);
		panel_24.add(txtObs15);

		JPanel panel_25 = new JPanel();
		panel_25.setBounds(10, 138, 167, 90);
		panel_3.add(panel_25);
		panel_25.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblLblbs_14 = new JLabel(LBL_BST3_15);
		lblLblbs_14.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_14.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_25.add(lblLblbs_14);

		JPanel panel_26 = new JPanel();
		panel_26.setBounds(188, 230, 50, 50);
		panel_3.add(panel_26);
		panel_26.setLayout(new GridLayout(2, 2, 0, 0));

		txtCantidad160 = new JTextField();
		txtCantidad160.setText("1");
		txtCantidad160.setEditable(false);
		txtCantidad160.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad160.setColumns(10);
		panel_26.add(txtCantidad160);

		txtCantidad161 = new JTextField();
		txtCantidad161.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad161.setColumns(10);
		panel_26.add(txtCantidad161);

		txtCantidad170 = new JTextField();
		txtCantidad170.setText("1");
		txtCantidad170.setEditable(false);
		txtCantidad170.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad170.setColumns(10);
		panel_26.add(txtCantidad170);

		txtCantidad171 = new JTextField();
		txtCantidad171.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad171.setColumns(10);
		panel_26.add(txtCantidad171);

		JPanel panel_27 = new JPanel();
		panel_27.setBounds(248, 230, 152, 50);
		panel_3.add(panel_27);
		panel_27.setLayout(new GridLayout(2, 0, 0, 0));

		txtObs16 = new JTextField();
		txtObs16.setColumns(10);
		panel_27.add(txtObs16);

		txtObs17 = new JTextField();
		txtObs17.setColumns(10);
		panel_27.add(txtObs17);

		JPanel panel_28 = new JPanel();
		panel_28.setBounds(10, 230, 167, 50);
		panel_3.add(panel_28);
		panel_28.setLayout(new GridLayout(2, 0, 0, 0));

		JLabel lblLblbs_15 = new JLabel("<html><body><p align=right>Tubería de PVC 1/2\"  y L=3 m</p></body></html>");
		lblLblbs_15.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_15.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_28.add(lblLblbs_15);

		JLabel lblLblbs_16 = new JLabel(
				"<html><body><p align=right>Tubería de PVC 1/2\"  y L=2.65 m</p></body></html>");
		lblLblbs_16.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_16.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_28.add(lblLblbs_16);

		JPanel panel_29 = new JPanel();
		panel_29.setBounds(188, 308, 50, 25);
		panel_3.add(panel_29);
		panel_29.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad180 = new JTextField();
		txtCantidad180.setText("2");
		txtCantidad180.setEditable(false);
		txtCantidad180.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad180.setColumns(10);
		panel_29.add(txtCantidad180);

		txtCantidad181 = new JTextField();
		txtCantidad181.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad181.setColumns(10);
		panel_29.add(txtCantidad181);

		JPanel panel_30 = new JPanel();
		panel_30.setBounds(248, 308, 152, 25);
		panel_3.add(panel_30);
		panel_30.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs18 = new JTextField();
		txtObs18.setColumns(10);
		panel_30.add(txtObs18);

		JPanel panel_31 = new JPanel();
		panel_31.setBounds(10, 283, 167, 90);
		panel_3.add(panel_31);
		panel_31.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblLblbs_17 = new JLabel(LBL_BST3_18);
		lblLblbs_17.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_17.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_31.add(lblLblbs_17);

		JPanel panel_32 = new JPanel();
		panel_32.setBounds(188, 375, 50, 25);
		panel_3.add(panel_32);
		panel_32.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad190 = new JTextField();
		txtCantidad190.setText("2");
		txtCantidad190.setEditable(false);
		txtCantidad190.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad190.setColumns(10);
		panel_32.add(txtCantidad190);

		txtCantidad191 = new JTextField();
		txtCantidad191.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad191.setColumns(10);
		panel_32.add(txtCantidad191);

		JPanel panel_33 = new JPanel();
		panel_33.setBounds(248, 375, 152, 25);
		panel_3.add(panel_33);
		panel_33.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs19 = new JTextField();
		txtObs19.setColumns(10);
		panel_33.add(txtObs19);

		JPanel panel_34 = new JPanel();
		panel_34.setBounds(10, 375, 167, 25);
		panel_3.add(panel_34);
		panel_34.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblLblbs_18 = new JLabel("<html><body><p align=right>Tubería de PVC 1\" y L=3 m</p></body></html>");
		lblLblbs_18.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_18.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_34.add(lblLblbs_18);

		JPanel panel_37 = new JPanel();
		panel_37.setBounds(10, 463, 167, 50);
		panel_3.add(panel_37);
		panel_37.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblLblbs_20 = new JLabel(
				"<html><body><p align=right>Kit para conexión de tubería 1\".(lija pliego,polipega 1/4 gal,2 uniones)</p></body></html>");
		lblLblbs_20.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_20.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_37.add(lblLblbs_20);

		JPanel panel_40 = new JPanel();
		panel_40.setBounds(10, 405, 167, 50);
		panel_3.add(panel_40);
		panel_40.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblLblbst = new JLabel(
				"<html><body><p align=right>Kit para conexión de tubería 1/2\".(lija pliego,polipega 1/4 gal,2 uniones)</p></body></html>");
		lblLblbst.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbst.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_40.add(lblLblbst);

		JPanel panel_35 = new JPanel();
		panel_35.setBounds(187, 473, 50, 25);
		panel_3.add(panel_35);
		panel_35.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad210 = new JTextField();
		txtCantidad210.setText("1");
		txtCantidad210.setEditable(false);
		txtCantidad210.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad210.setColumns(10);
		panel_35.add(txtCantidad210);

		txtCantidad211 = new JTextField();
		txtCantidad211.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad211.setColumns(10);
		panel_35.add(txtCantidad211);

		JPanel panel_36 = new JPanel();
		panel_36.setBounds(247, 473, 152, 25);
		panel_3.add(panel_36);
		panel_36.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs21 = new JTextField();
		txtObs21.setColumns(10);
		panel_36.add(txtObs21);

		JPanel panel_38 = new JPanel();
		panel_38.setBounds(187, 418, 50, 25);
		panel_3.add(panel_38);
		panel_38.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad200 = new JTextField();
		txtCantidad200.setText("1");
		txtCantidad200.setEditable(false);
		txtCantidad200.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad200.setColumns(10);
		panel_38.add(txtCantidad200);

		txtCantidad201 = new JTextField();
		txtCantidad201.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad201.setColumns(10);
		panel_38.add(txtCantidad201);

		JPanel panel_39 = new JPanel();
		panel_39.setBounds(247, 418, 152, 25);
		panel_3.add(panel_39);
		panel_39.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs20 = new JTextField();
		txtObs20.setColumns(10);
		panel_39.add(txtObs20);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(861, 11, 410, 541);
		pnlPestaña1.add(panel_4);
		panel_4.setLayout(null);

		JLabel lblKitAguaResidual = new JLabel("KIT AGUA RESIDUAL");
		lblKitAguaResidual.setHorizontalAlignment(SwingConstants.CENTER);
		lblKitAguaResidual.setFont(new Font("Arial", Font.BOLD, 10));
		lblKitAguaResidual.setBounds(10, 11, 167, 14);
		panel_4.add(lblKitAguaResidual);

		JLabel label_13 = new JLabel("Cantidad");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Arial", Font.BOLD, 10));
		label_13.setBounds(183, 11, 58, 14);
		panel_4.add(label_13);

		JLabel label_14 = new JLabel("Observación/Referencia");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Arial", Font.BOLD, 10));
		label_14.setBounds(238, 11, 167, 14);
		panel_4.add(label_14);

		JPanel panel_41 = new JPanel();
		panel_41.setBounds(10, 32, 167, 50);
		panel_4.add(panel_41);
		panel_41.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblLblbs_19 = new JLabel(LBL_BST3_22);
		lblLblbs_19.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_19.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_41.add(lblLblbs_19);

		JPanel panel_42 = new JPanel();
		panel_42.setBounds(187, 45, 50, 25);
		panel_4.add(panel_42);
		panel_42.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad220 = new JTextField();
		txtCantidad220.setText("2");
		txtCantidad220.setEditable(false);
		txtCantidad220.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad220.setColumns(10);
		panel_42.add(txtCantidad220);

		txtCantidad221 = new JTextField();
		txtCantidad221.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad221.setColumns(10);
		panel_42.add(txtCantidad221);

		JPanel panel_43 = new JPanel();
		panel_43.setBounds(247, 45, 152, 25);
		panel_4.add(panel_43);
		panel_43.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs22 = new JTextField();
		txtObs22.setColumns(10);
		panel_43.add(txtObs22);

		JPanel panel_44 = new JPanel();
		panel_44.setBounds(10, 82, 167, 50);
		panel_4.add(panel_44);
		panel_44.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblLblbs_21 = new JLabel(LBL_BST3_23);
		lblLblbs_21.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_21.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_44.add(lblLblbs_21);

		JPanel panel_45 = new JPanel();
		panel_45.setBounds(187, 95, 50, 25);
		panel_4.add(panel_45);
		panel_45.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad230 = new JTextField();
		txtCantidad230.setText("4");
		txtCantidad230.setEditable(false);
		txtCantidad230.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad230.setColumns(10);
		panel_45.add(txtCantidad230);

		txtCantidad231 = new JTextField();
		txtCantidad231.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad231.setColumns(10);
		panel_45.add(txtCantidad231);

		JPanel panel_46 = new JPanel();
		panel_46.setBounds(247, 95, 152, 25);
		panel_4.add(panel_46);
		panel_46.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs23 = new JTextField();
		txtObs23.setColumns(10);
		panel_46.add(txtObs23);

		JPanel panel_47 = new JPanel();
		panel_47.setBounds(10, 182, 167, 50);
		panel_4.add(panel_47);
		panel_47.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblLblbs_24 = new JLabel(LBL_BST3_26);
		lblLblbs_24.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_24.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_47.add(lblLblbs_24);

		JPanel panel_48 = new JPanel();
		panel_48.setBounds(187, 195, 50, 25);
		panel_4.add(panel_48);
		panel_48.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad260 = new JTextField();
		txtCantidad260.setText("2");
		txtCantidad260.setEditable(false);
		txtCantidad260.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad260.setColumns(10);
		panel_48.add(txtCantidad260);

		txtCantidad261 = new JTextField();
		txtCantidad261.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad261.setColumns(10);
		panel_48.add(txtCantidad261);

		JPanel panel_49 = new JPanel();
		panel_49.setBounds(247, 195, 152, 25);
		panel_4.add(panel_49);
		panel_49.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs26 = new JTextField();
		txtObs26.setColumns(10);
		panel_49.add(txtObs26);

		JPanel panel_50 = new JPanel();
		panel_50.setBounds(188, 132, 50, 50);
		panel_4.add(panel_50);
		panel_50.setLayout(new GridLayout(2, 2, 0, 0));

		txtCantidad240 = new JTextField();
		txtCantidad240.setText("4");
		txtCantidad240.setEditable(false);
		txtCantidad240.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad240.setColumns(10);
		panel_50.add(txtCantidad240);

		txtCantidad241 = new JTextField();
		txtCantidad241.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad241.setColumns(10);
		panel_50.add(txtCantidad241);

		txtCantidad250 = new JTextField();
		txtCantidad250.setText("1");
		txtCantidad250.setEditable(false);
		txtCantidad250.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad250.setColumns(10);
		panel_50.add(txtCantidad250);

		txtCantidad251 = new JTextField();
		txtCantidad251.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad251.setColumns(10);
		panel_50.add(txtCantidad251);

		JPanel panel_51 = new JPanel();
		panel_51.setBounds(248, 132, 152, 50);
		panel_4.add(panel_51);
		panel_51.setLayout(new GridLayout(2, 0, 0, 0));

		txtObs24 = new JTextField();
		txtObs24.setColumns(10);
		panel_51.add(txtObs24);

		txtObs25 = new JTextField();
		txtObs25.setColumns(10);
		panel_51.add(txtObs25);

		JPanel panel_52 = new JPanel();
		panel_52.setBounds(10, 132, 167, 50);
		panel_4.add(panel_52);
		panel_52.setLayout(new GridLayout(2, 0, 0, 0));

		JLabel lblLblbs_22 = new JLabel(LBL_BST3_24);
		lblLblbs_22.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_22.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_52.add(lblLblbs_22);

		JLabel lblLblbs_23 = new JLabel(LBL_BST3_25);
		lblLblbs_23.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_23.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_52.add(lblLblbs_23);

		JPanel panel_53 = new JPanel();
		panel_53.setBounds(9, 282, 167, 50);
		panel_4.add(panel_53);
		panel_53.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblLblbs_27 = new JLabel(LBL_BST3_29);
		lblLblbs_27.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_27.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_53.add(lblLblbs_27);

		JPanel panel_54 = new JPanel();
		panel_54.setBounds(186, 295, 50, 25);
		panel_4.add(panel_54);
		panel_54.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad290 = new JTextField();
		txtCantidad290.setText("5");
		txtCantidad290.setEditable(false);
		txtCantidad290.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad290.setColumns(10);
		panel_54.add(txtCantidad290);

		txtCantidad291 = new JTextField();
		txtCantidad291.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad291.setColumns(10);
		panel_54.add(txtCantidad291);

		JPanel panel_55 = new JPanel();
		panel_55.setBounds(246, 295, 152, 25);
		panel_4.add(panel_55);
		panel_55.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs29 = new JTextField();
		txtObs29.setColumns(10);
		panel_55.add(txtObs29);

		JPanel panel_56 = new JPanel();
		panel_56.setBounds(187, 232, 50, 50);
		panel_4.add(panel_56);
		panel_56.setLayout(new GridLayout(2, 2, 0, 0));

		txtCantidad270 = new JTextField();
		txtCantidad270.setText("2");
		txtCantidad270.setEditable(false);
		txtCantidad270.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad270.setColumns(10);
		panel_56.add(txtCantidad270);

		txtCantidad271 = new JTextField();
		txtCantidad271.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad271.setColumns(10);
		panel_56.add(txtCantidad271);

		txtCantidad280 = new JTextField();
		txtCantidad280.setText("1");
		txtCantidad280.setEditable(false);
		txtCantidad280.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad280.setColumns(10);
		panel_56.add(txtCantidad280);

		txtCantidad281 = new JTextField();
		txtCantidad281.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad281.setColumns(10);
		panel_56.add(txtCantidad281);

		JPanel panel_57 = new JPanel();
		panel_57.setBounds(247, 232, 152, 50);
		panel_4.add(panel_57);
		panel_57.setLayout(new GridLayout(2, 0, 0, 0));

		txtObs27 = new JTextField();
		txtObs27.setColumns(10);
		panel_57.add(txtObs27);

		txtObs28 = new JTextField();
		txtObs28.setColumns(10);
		panel_57.add(txtObs28);

		JPanel panel_58 = new JPanel();
		panel_58.setBounds(9, 232, 167, 50);
		panel_4.add(panel_58);
		panel_58.setLayout(new GridLayout(2, 0, 0, 0));

		JLabel lblLblbs_25 = new JLabel(LBL_BST3_27);
		lblLblbs_25.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_25.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_58.add(lblLblbs_25);

		JLabel lblLblbs_26 = new JLabel(LBL_BST3_28);
		lblLblbs_26.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_26.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_58.add(lblLblbs_26);

		JPanel panel_59 = new JPanel();
		panel_59.setBounds(10, 382, 167, 50);
		panel_4.add(panel_59);
		panel_59.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblLblbs_30 = new JLabel(LBL_BST3_32);
		lblLblbs_30.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_30.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_59.add(lblLblbs_30);

		JPanel panel_60 = new JPanel();
		panel_60.setBounds(187, 395, 50, 25);
		panel_4.add(panel_60);
		panel_60.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad320 = new JTextField();
		txtCantidad320.setText("1");
		txtCantidad320.setEditable(false);
		txtCantidad320.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad320.setColumns(10);
		panel_60.add(txtCantidad320);

		txtCantidad321 = new JTextField();
		txtCantidad321.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad321.setColumns(10);
		panel_60.add(txtCantidad321);

		JPanel panel_61 = new JPanel();
		panel_61.setBounds(247, 395, 152, 25);
		panel_4.add(panel_61);
		panel_61.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs32 = new JTextField();
		txtObs32.setColumns(10);
		panel_61.add(txtObs32);

		JPanel panel_62 = new JPanel();
		panel_62.setBounds(188, 332, 50, 50);
		panel_4.add(panel_62);
		panel_62.setLayout(new GridLayout(2, 2, 0, 0));

		txtCantidad300 = new JTextField();
		txtCantidad300.setText("7");
		txtCantidad300.setEditable(false);
		txtCantidad300.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad300.setColumns(10);
		panel_62.add(txtCantidad300);

		txtCantidad301 = new JTextField();
		txtCantidad301.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad301.setColumns(10);
		panel_62.add(txtCantidad301);

		txtCantidad310 = new JTextField();
		txtCantidad310.setText("1");
		txtCantidad310.setEditable(false);
		txtCantidad310.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad310.setColumns(10);
		panel_62.add(txtCantidad310);

		txtCantidad311 = new JTextField();
		txtCantidad311.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad311.setColumns(10);
		panel_62.add(txtCantidad311);

		JPanel panel_63 = new JPanel();
		panel_63.setBounds(248, 332, 152, 50);
		panel_4.add(panel_63);
		panel_63.setLayout(new GridLayout(2, 0, 0, 0));

		txtObs30 = new JTextField();
		txtObs30.setColumns(10);
		panel_63.add(txtObs30);

		txtObs31 = new JTextField();
		txtObs31.setColumns(10);
		panel_63.add(txtObs31);

		JPanel panel_64 = new JPanel();
		panel_64.setBounds(10, 332, 167, 50);
		panel_4.add(panel_64);
		panel_64.setLayout(new GridLayout(2, 0, 0, 0));

		JLabel lblLblbs_28 = new JLabel(LBL_BST3_30);
		lblLblbs_28.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_28.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_64.add(lblLblbs_28);

		JLabel lblLblbs_29 = new JLabel(LBL_BST3_31);
		lblLblbs_29.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_29.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_64.add(lblLblbs_29);

		JPanel panel_65 = new JPanel();
		panel_65.setBounds(10, 434, 167, 50);
		panel_4.add(panel_65);
		panel_65.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblLblbs_31 = new JLabel(LBL_BST3_33);
		lblLblbs_31.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_31.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_65.add(lblLblbs_31);

		JPanel panel_66 = new JPanel();
		panel_66.setBounds(187, 445, 50, 25);
		panel_4.add(panel_66);
		panel_66.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad330 = new JTextField();
		txtCantidad330.setText("1");
		txtCantidad330.setEditable(false);
		txtCantidad330.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad330.setColumns(10);
		panel_66.add(txtCantidad330);

		txtCantidad331 = new JTextField();
		txtCantidad331.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad331.setColumns(10);
		panel_66.add(txtCantidad331);

		JPanel panel_67 = new JPanel();
		panel_67.setBounds(247, 445, 152, 25);
		panel_4.add(panel_67);
		panel_67.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs33 = new JTextField();
		txtObs33.setColumns(10);
		panel_67.add(txtObs33);

		JPanel panel_68 = new JPanel();
		panel_68.setBounds(10, 486, 167, 50);
		panel_4.add(panel_68);
		panel_68.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblLblbs_32 = new JLabel(LBL_BST3_34);
		lblLblbs_32.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_32.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_68.add(lblLblbs_32);

		JPanel panel_69 = new JPanel();
		panel_69.setBounds(187, 500, 50, 25);
		panel_4.add(panel_69);
		panel_69.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad340 = new JTextField();
		txtCantidad340.setText("1");
		txtCantidad340.setEditable(false);
		txtCantidad340.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad340.setColumns(10);
		panel_69.add(txtCantidad340);

		txtCantidad341 = new JTextField();
		txtCantidad341.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad341.setColumns(10);
		panel_69.add(txtCantidad341);

		JPanel panel_70 = new JPanel();
		panel_70.setBounds(247, 500, 152, 25);
		panel_4.add(panel_70);
		panel_70.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs34 = new JTextField();
		txtObs34.setColumns(10);
		panel_70.add(txtObs34);

	}

	public void cargarCabecera() {

		jpCabecera = new JPcabecera();
		pnlPrincipal.add(jpCabecera.getCabecera());
		Utilitarios.llenarCabecera(jpCabecera);
		jpCabecera.getBtnRegistrar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				TInformacionObligatoria infoObl = cargarInfoObligatoria(jpIOblig);

				if (validarInfo(infoObl)) {
					infoObl.setIoSerial(srvInfoObl.serialInfoOblMax());

					List<TdetalleFicha> detallesFicha = getRegistrosFicha(infoObl);

					if (detallesFicha == null) {
						JOptionPane.showMessageDialog(null,
								"ERROR: Verificar que los registros no se encuentren VACÍOS", "Mensaje de Error",
								JOptionPane.ERROR_MESSAGE);
						return;
					}

					if (Validaciones.registrosValidados(detallesFicha)) {
						srvInfoObl.crear(infoObl);
						infoObl.setIoSerial(srvInfoObl.serialInfoOblMax());

						srvFicha.guardarFormulario(getRegistrosFicha(infoObl));
						HashMap<String, Object> parametros = new HashMap<String, Object>();
						parametros.put("serial_cabecera", Utilitarios.gettCabecera().getCSerial());
						parametros.put("serial_ficha", ficha.getFiSerial());
						Reporte reporte = new Reporte("Reporte Bs", 280, 10, 850, 750);
						InputStream path = AlInicio.class.getResourceAsStream("/com/capa/templates/MA.jasper");
						reporte.cargarReporte(path, parametros, Query.getMysql().getConexion());
						reporte.setVisible(true);
						new Menu().setVisible(true);
						dispose();
					}

				} else {
					JOptionPane.showMessageDialog(null, "Ingresar Información Obligatoria");
				}
			}
		});
	}

	private List<TdetalleFicha> getRegistrosFicha(TInformacionObligatoria infoObligatoria) {
		TCabecera cabecera = srvCabecera.buscarProyecto(gettCabecera().getCNombreProyecto());

		Integer updateFicha = srvFicha.nActualizacionFicha(gettCabecera(), ficha);
		// if (updateFicha == -1) {
		// updateFicha = 0;
		// } else {
		// updateFicha++;
		// }

		if (isFichaC1()) {
			updateFicha++;
		} else {
			updateFicha = -1;
		}

		List<TdetalleFicha> detallesFicha = new LinkedList<>();

		TGrupo grupo1 = srvFicha.buscarGrupo("Kit eléctrico");
		TGrupo grupo2 = srvFicha.buscarGrupo("Kit hidrosanitario");
		TGrupo grupo3 = srvFicha.buscarGrupo("Kit agua");
		TGrupo grupo4 = srvFicha.buscarGrupo("Kit agua potable");
		TGrupo grupo5 = srvFicha.buscarGrupo("Kit agua residual");
		TGrupo grupo6 = srvFicha.buscarGrupo("Componente arquitectónico");
		TGrupo grupo7 = srvFicha.buscarGrupo("Fachada frontal");
		TGrupo grupo8 = srvFicha.buscarGrupo("Fachada posterior");
		TGrupo grupo9 = srvFicha.buscarGrupo("Fachada lateral");
		TGrupo grupo10 = srvFicha.buscarGrupo("Componente estructural");

		try {
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha,
					quitarEtiquetasHTML(LBL_BS1_0), Integer.parseInt(txtCantidad00.getText()),
					Integer.parseInt(txtCantidad01.getText()), txtObs0.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad00.getText()),
							Integer.parseInt(txtCantidad01.getText())),
					ITEM_BS2_0, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha,
					quitarEtiquetasHTML(LBL_BS1_1), Integer.parseInt(txtCantidad10.getText()),
					Integer.parseInt(txtCantidad11.getText()), txtObs1.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad10.getText()),
							Integer.parseInt(txtCantidad11.getText())),
					ITEM_BS2_1, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha,
					quitarEtiquetasHTML(LBL_BS1_2), Integer.parseInt(txtCantidad20.getText()),
					Integer.parseInt(txtCantidad21.getText()), txtObs2.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad20.getText()),
							Integer.parseInt(txtCantidad21.getText())),
					ITEM_BS2_2, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha,
					quitarEtiquetasHTML(LBL_BS2_3), Integer.parseInt(txtCantidad30.getText()),
					Integer.parseInt(txtCantidad31.getText()), txtObs3.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad30.getText()),
							Integer.parseInt(txtCantidad31.getText())),
					ITEM_BS2_3, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha,
					quitarEtiquetasHTML(LBL_BS2_4), Integer.parseInt(txtCantidad40.getText()),
					Integer.parseInt(txtCantidad41.getText()), txtObs4.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad40.getText()),
							Integer.parseInt(txtCantidad41.getText())),
					ITEM_BS2_4, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha,
					quitarEtiquetasHTML(LBL_BS2_5), Integer.parseInt(txtCantidad50.getText()),
					Integer.parseInt(txtCantidad51.getText()), txtObs5.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad50.getText()),
							Integer.parseInt(txtCantidad51.getText())),
					ITEM_BS2_5, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha,
					quitarEtiquetasHTML(LBL_BS2_6), Integer.parseInt(txtCantidad60.getText()),
					Integer.parseInt(txtCantidad61.getText()), txtObs6.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad60.getText()),
							Integer.parseInt(txtCantidad61.getText())),
					ITEM_BS2_6, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha,
					quitarEtiquetasHTML(LBL_BS2_7), Integer.parseInt(txtCantidad70.getText()),
					Integer.parseInt(txtCantidad71.getText()), txtObs7.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad70.getText()),
							Integer.parseInt(txtCantidad71.getText())),
					ITEM_BS2_7, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo3, ficha,
					quitarEtiquetasHTML(LBL_BS2_8), Integer.parseInt(txtCantidad80.getText()),
					Integer.parseInt(txtCantidad81.getText()), txtObs8.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad80.getText()),
							Integer.parseInt(txtCantidad81.getText())),
					ITEM_BS2_8, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo3, ficha,
					quitarEtiquetasHTML(LBL_BS2_9), Integer.parseInt(txtCantidad90.getText()),
					Integer.parseInt(txtCantidad91.getText()), txtObs9.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad90.getText()),
							Integer.parseInt(txtCantidad91.getText())),
					ITEM_BS2_9, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo3, ficha,
					quitarEtiquetasHTML(LBL_BS2_10), Integer.parseInt(txtCantidad100.getText()),
					Integer.parseInt(txtCantidad101.getText()), txtObs10.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad100.getText()),
							Integer.parseInt(txtCantidad101.getText())),
					ITEM_BS2_10, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo3, ficha,
					quitarEtiquetasHTML(LBL_BS2_11), Integer.parseInt(txtCantidad110.getText()),
					Integer.parseInt(txtCantidad111.getText()), txtObs11.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad110.getText()),
							Integer.parseInt(txtCantidad111.getText())),
					ITEM_BS2_11, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo3, ficha,
					quitarEtiquetasHTML(LBL_BS2_12), Integer.parseInt(txtCantidad120.getText()),
					Integer.parseInt(txtCantidad121.getText()), txtObs12.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad120.getText()),
							Integer.parseInt(txtCantidad121.getText())),
					ITEM_BS2_12, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo3, ficha,
					quitarEtiquetasHTML(LBL_BS2_13), Integer.parseInt(txtCantidad130.getText()),
					Integer.parseInt(txtCantidad131.getText()), txtObs13.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad130.getText()),
							Integer.parseInt(txtCantidad131.getText())),
					ITEM_BS2_13, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo4, ficha,
					quitarEtiquetasHTML(LBL_BS2_14), Integer.parseInt(txtCantidad140.getText()),
					Integer.parseInt(txtCantidad141.getText()), txtObs14.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad140.getText()),
							Integer.parseInt(txtCantidad141.getText())),
					ITEM_BS2_14, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo4, ficha,
					quitarEtiquetasHTML(LBL_BS2_15), Integer.parseInt(txtCantidad150.getText()),
					Integer.parseInt(txtCantidad151.getText()), txtObs15.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad150.getText()),
							Integer.parseInt(txtCantidad151.getText())),
					ITEM_BS2_15, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo4, ficha,
					quitarEtiquetasHTML(LBL_BS2_16), Integer.parseInt(txtCantidad160.getText()),
					Integer.parseInt(txtCantidad161.getText()), txtObs16.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad160.getText()),
							Integer.parseInt(txtCantidad161.getText())),
					ITEM_BS2_16, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo4, ficha,
					quitarEtiquetasHTML(LBL_BS2_17), Integer.parseInt(txtCantidad170.getText()),
					Integer.parseInt(txtCantidad171.getText()), txtObs17.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad170.getText()),
							Integer.parseInt(txtCantidad171.getText())),
					ITEM_BS2_17, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo4, ficha,
					quitarEtiquetasHTML(LBL_BS2_18), Integer.parseInt(txtCantidad180.getText()),
					Integer.parseInt(txtCantidad181.getText()), txtObs18.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad180.getText()),
							Integer.parseInt(txtCantidad181.getText())),
					ITEM_BS2_18, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo4, ficha,
					quitarEtiquetasHTML(LBL_BS2_19), Integer.parseInt(txtCantidad190.getText()),
					Integer.parseInt(txtCantidad191.getText()), txtObs19.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad190.getText()),
							Integer.parseInt(txtCantidad191.getText())),
					ITEM_BS2_19, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo4, ficha,
					quitarEtiquetasHTML(LBL_BS2_20), Integer.parseInt(txtCantidad200.getText()),
					Integer.parseInt(txtCantidad201.getText()), txtObs20.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad200.getText()),
							Integer.parseInt(txtCantidad201.getText())),
					ITEM_BS2_20, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo4, ficha,
					quitarEtiquetasHTML(LBL_BS2_21), Integer.parseInt(txtCantidad210.getText()),
					Integer.parseInt(txtCantidad211.getText()), txtObs21.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad210.getText()),
							Integer.parseInt(txtCantidad211.getText())),
					ITEM_BS2_21, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo5, ficha,
					quitarEtiquetasHTML(LBL_BS2_22), Integer.parseInt(txtCantidad220.getText()),
					Integer.parseInt(txtCantidad221.getText()), txtObs22.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad220.getText()),
							Integer.parseInt(txtCantidad221.getText())),
					ITEM_BS2_22, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo5, ficha,
					quitarEtiquetasHTML(LBL_BS2_23), Integer.parseInt(txtCantidad230.getText()),
					Integer.parseInt(txtCantidad231.getText()), txtObs23.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad230.getText()),
							Integer.parseInt(txtCantidad231.getText())),
					ITEM_BS2_23, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo5, ficha,
					quitarEtiquetasHTML(LBL_BS2_24), Integer.parseInt(txtCantidad240.getText()),
					Integer.parseInt(txtCantidad241.getText()), txtObs24.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad240.getText()),
							Integer.parseInt(txtCantidad241.getText())),
					ITEM_BS2_24, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo5, ficha,
					quitarEtiquetasHTML(LBL_BS2_25), Integer.parseInt(txtCantidad250.getText()),
					Integer.parseInt(txtCantidad251.getText()), txtObs25.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad250.getText()),
							Integer.parseInt(txtCantidad251.getText())),
					ITEM_BS2_25, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo5, ficha,
					quitarEtiquetasHTML(LBL_BS2_26), Integer.parseInt(txtCantidad260.getText()),
					Integer.parseInt(txtCantidad261.getText()), txtObs26.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad260.getText()),
							Integer.parseInt(txtCantidad261.getText())),
					ITEM_BS2_26, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo5, ficha,
					quitarEtiquetasHTML(LBL_BS2_27), Integer.parseInt(txtCantidad270.getText()),
					Integer.parseInt(txtCantidad271.getText()), txtObs27.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad270.getText()),
							Integer.parseInt(txtCantidad271.getText())),
					ITEM_BS2_27, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo5, ficha,
					quitarEtiquetasHTML(LBL_BS2_28), Integer.parseInt(txtCantidad280.getText()),
					Integer.parseInt(txtCantidad281.getText()), txtObs28.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad280.getText()),
							Integer.parseInt(txtCantidad281.getText())),
					ITEM_BS2_28, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo5, ficha,
					quitarEtiquetasHTML(LBL_BS2_29), Integer.parseInt(txtCantidad290.getText()),
					Integer.parseInt(txtCantidad291.getText()), txtObs29.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad290.getText()),
							Integer.parseInt(txtCantidad291.getText())),
					ITEM_BS2_29, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo5, ficha,
					quitarEtiquetasHTML(LBL_BS2_30), Integer.parseInt(txtCantidad300.getText()),
					Integer.parseInt(txtCantidad301.getText()), txtObs30.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad300.getText()),
							Integer.parseInt(txtCantidad301.getText())),
					ITEM_BS2_30, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo5, ficha,
					quitarEtiquetasHTML(LBL_BS2_31), Integer.parseInt(txtCantidad310.getText()),
					Integer.parseInt(txtCantidad311.getText()), txtObs31.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad310.getText()),
							Integer.parseInt(txtCantidad311.getText())),
					ITEM_BS2_31, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo5, ficha,
					quitarEtiquetasHTML(LBL_BS2_32), Integer.parseInt(txtCantidad320.getText()),
					Integer.parseInt(txtCantidad321.getText()), txtObs32.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad320.getText()),
							Integer.parseInt(txtCantidad321.getText())),
					ITEM_BS2_32, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo5, ficha,
					quitarEtiquetasHTML(LBL_BS2_33), Integer.parseInt(txtCantidad330.getText()),
					Integer.parseInt(txtCantidad331.getText()), txtObs33.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad330.getText()),
							Integer.parseInt(txtCantidad331.getText())),
					ITEM_BS2_33, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo5, ficha,
					quitarEtiquetasHTML(LBL_BS2_34), Integer.parseInt(txtCantidad340.getText()),
					Integer.parseInt(txtCantidad341.getText()), txtObs34.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad340.getText()),
							Integer.parseInt(txtCantidad341.getText())),
					ITEM_BS2_34, "UNIDAD"));
			// detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria,
			// grupo6, ficha,
			// quitarEtiquetasHTML(LBL_BS2_35),
			// Integer.parseInt(txtCantidad35.getText()),
			// Integer.parseInt(txtCantidad351.getText()), txtObs35.getText(),
			// updateFicha,
			// calcularPorcentajeAvance(Integer.parseInt(txtCantidad350.getText()),
			// Integer.parseInt(txtCantidad351.getText())),
			// ITEM_BS2_35, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo6, ficha,
					quitarEtiquetasHTML(LBL_BS2_36), Integer.parseInt(txtCantidad360.getText()),
					Integer.parseInt(txtCantidad361.getText()), txtObs36.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad360.getText()),
							Integer.parseInt(txtCantidad361.getText())),
					ITEM_BS2_36, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo6, ficha,
					quitarEtiquetasHTML(LBL_BS2_37), Integer.parseInt(txtCantidad370.getText()),
					Integer.parseInt(txtCantidad371.getText()), txtObs37.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad370.getText()),
							Integer.parseInt(txtCantidad371.getText())),
					ITEM_BS2_37, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo6, ficha,
					quitarEtiquetasHTML(LBL_BS2_38), Integer.parseInt(txtCantidad380.getText()),
					Integer.parseInt(txtCantidad381.getText()), txtObs38.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad380.getText()),
							Integer.parseInt(txtCantidad381.getText())),
					ITEM_BS2_38, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo6, ficha,
					quitarEtiquetasHTML(LBL_BS2_39), Integer.parseInt(txtCantidad390.getText()),
					Integer.parseInt(txtCantidad391.getText()), txtObs39.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad390.getText()),
							Integer.parseInt(txtCantidad391.getText())),
					ITEM_BS2_39, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo6, ficha,
					quitarEtiquetasHTML(LBL_BS2_40), Integer.parseInt(txtCantidad400.getText()),
					Integer.parseInt(txtCantidad401.getText()), txtObs40.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad400.getText()),
							Integer.parseInt(txtCantidad401.getText())),
					ITEM_BS2_40, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo6, ficha,
					quitarEtiquetasHTML(LBL_BS2_41), Integer.parseInt(txtCantidad410.getText()),
					Integer.parseInt(txtCantidad411.getText()), txtObs41.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad410.getText()),
							Integer.parseInt(txtCantidad411.getText())),
					ITEM_BS2_41, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo7, ficha,
					quitarEtiquetasHTML(LBL_BS2_42), Integer.parseInt(txtCantidad420.getText()),
					Integer.parseInt(txtCantidad421.getText()), txtObs42.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad420.getText()),
							Integer.parseInt(txtCantidad421.getText())),
					ITEM_BS2_42, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo7, ficha,
					quitarEtiquetasHTML(LBL_BS2_43), Integer.parseInt(txtCantidad430.getText()),
					Integer.parseInt(txtCantidad431.getText()), txtObs43.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad430.getText()),
							Integer.parseInt(txtCantidad431.getText())),
					ITEM_BS2_43, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo7, ficha,
					quitarEtiquetasHTML(LBL_BS2_44), Integer.parseInt(txtCantidad440.getText()),
					Integer.parseInt(txtCantidad441.getText()), txtObs44.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad440.getText()),
							Integer.parseInt(txtCantidad441.getText())),
					ITEM_BS2_44, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo8, ficha,
					quitarEtiquetasHTML(LBL_BS2_45), Integer.parseInt(txtCantidad450.getText()),
					Integer.parseInt(txtCantidad451.getText()), txtObs45.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad450.getText()),
							Integer.parseInt(txtCantidad451.getText())),
					ITEM_BS2_45, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo8, ficha,
					quitarEtiquetasHTML(LBL_BS2_46), Integer.parseInt(txtCantidad460.getText()),
					Integer.parseInt(txtCantidad461.getText()), txtObs46.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad460.getText()),
							Integer.parseInt(txtCantidad461.getText())),
					ITEM_BS2_46, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo8, ficha,
					quitarEtiquetasHTML(LBL_BS2_47), Integer.parseInt(txtCantidad470.getText()),
					Integer.parseInt(txtCantidad471.getText()), txtObs47.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad470.getText()),
							Integer.parseInt(txtCantidad471.getText())),
					ITEM_BS2_47, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo8, ficha,
					quitarEtiquetasHTML(LBL_BS2_48), Integer.parseInt(txtCantidad480.getText()),
					Integer.parseInt(txtCantidad481.getText()), txtObs48.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad480.getText()),
							Integer.parseInt(txtCantidad481.getText())),
					ITEM_BS2_48, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo9, ficha,
					quitarEtiquetasHTML(LBL_BS2_49), Integer.parseInt(txtCantidad490.getText()),
					Integer.parseInt(txtCantidad491.getText()), txtObs49.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad490.getText()),
							Integer.parseInt(txtCantidad491.getText())),
					ITEM_BS2_49, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo9, ficha,
					quitarEtiquetasHTML(LBL_BS2_50), Integer.parseInt(txtCantidad500.getText()),
					Integer.parseInt(txtCantidad501.getText()), txtObs50.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad500.getText()),
							Integer.parseInt(txtCantidad501.getText())),
					ITEM_BS2_50, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo9, ficha,
					quitarEtiquetasHTML(LBL_BS2_51), Integer.parseInt(txtCantidad510.getText()),
					Integer.parseInt(txtCantidad511.getText()), txtObs51.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad510.getText()),
							Integer.parseInt(txtCantidad511.getText())),
					ITEM_BS2_51, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo9, ficha,
					quitarEtiquetasHTML(LBL_BS2_52), Integer.parseInt(txtCantidad520.getText()),
					Integer.parseInt(txtCantidad521.getText()), txtObs52.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad520.getText()),
							Integer.parseInt(txtCantidad521.getText())),
					ITEM_BS2_52, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo9, ficha,
					quitarEtiquetasHTML(LBL_BS2_53), Integer.parseInt(txtCantidad530.getText()),
					Integer.parseInt(txtCantidad531.getText()), txtObs53.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad530.getText()),
							Integer.parseInt(txtCantidad531.getText())),
					ITEM_BS2_53, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo9, ficha,
					quitarEtiquetasHTML(LBL_BS2_54), Integer.parseInt(txtCantidad540.getText()),
					Integer.parseInt(txtCantidad541.getText()), txtObs54.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad540.getText()),
							Integer.parseInt(txtCantidad541.getText())),
					ITEM_BS2_54, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo9, ficha,
					quitarEtiquetasHTML(LBL_BS2_55), Integer.parseInt(txtCantidad550.getText()),
					Integer.parseInt(txtCantidad551.getText()), txtObs55.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad550.getText()),
							Integer.parseInt(txtCantidad551.getText())),
					ITEM_BS2_55, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo9, ficha,
					quitarEtiquetasHTML(LBL_BS2_56), Integer.parseInt(txtCantidad560.getText()),
					Integer.parseInt(txtCantidad561.getText()), txtObs56.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad560.getText()),
							Integer.parseInt(txtCantidad561.getText())),
					ITEM_BS2_56, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo9, ficha,
					quitarEtiquetasHTML(LBL_BS2_57), Integer.parseInt(txtCantidad570.getText()),
					Integer.parseInt(txtCantidad571.getText()), txtObs57.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad570.getText()),
							Integer.parseInt(txtCantidad571.getText())),
					ITEM_BS2_57, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo10, ficha,
					quitarEtiquetasHTML(LBL_BS2_58), Integer.parseInt(txtCantidad580.getText()),
					Integer.parseInt(txtCantidad581.getText()), txtObs58.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad580.getText()),
							Integer.parseInt(txtCantidad581.getText())),
					ITEM_BS2_58, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo10, ficha,
					quitarEtiquetasHTML(LBL_BS2_59), Integer.parseInt(txtCantidad590.getText()),
					Integer.parseInt(txtCantidad591.getText()), txtObs59.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad590.getText()),
							Integer.parseInt(txtCantidad591.getText())),
					ITEM_BS2_59, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo10, ficha,
					quitarEtiquetasHTML(LBL_BS2_60), Integer.parseInt(txtCantidad600.getText()),
					Integer.parseInt(txtCantidad601.getText()), txtObs60.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad600.getText()),
							Integer.parseInt(txtCantidad601.getText())),
					ITEM_BS2_60, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo10, ficha,
					quitarEtiquetasHTML(LBL_BS2_61), Integer.parseInt(txtCantidad610.getText()),
					Integer.parseInt(txtCantidad611.getText()), txtObs61.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad610.getText()),
							Integer.parseInt(txtCantidad611.getText())),
					ITEM_BS2_61, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo10, ficha,
					quitarEtiquetasHTML(LBL_BS2_62), Integer.parseInt(txtCantidad620.getText()),
					Integer.parseInt(txtCantidad621.getText()), txtObs62.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad620.getText()),
							Integer.parseInt(txtCantidad621.getText())),
					ITEM_BS2_62, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo10, ficha,
					quitarEtiquetasHTML(LBL_BS2_63), Integer.parseInt(txtCantidad630.getText()),
					Integer.parseInt(txtCantidad631.getText()), txtObs63.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad630.getText()),
							Integer.parseInt(txtCantidad631.getText())),
					ITEM_BS2_63, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo10, ficha,
					quitarEtiquetasHTML(LBL_BS2_64), Integer.parseInt(txtCantidad640.getText()),
					Integer.parseInt(txtCantidad641.getText()), txtObs64.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad640.getText()),
							Integer.parseInt(txtCantidad641.getText())),
					ITEM_BS2_64, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo10, ficha,
					quitarEtiquetasHTML(LBL_BS2_65), Integer.parseInt(txtCantidad650.getText()),
					Integer.parseInt(txtCantidad651.getText()), txtObs65.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad650.getText()),
							Integer.parseInt(txtCantidad651.getText())),
					ITEM_BS2_65, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo10, ficha,
					quitarEtiquetasHTML(LBL_BS2_66), Integer.parseInt(txtCantidad660.getText()),
					Integer.parseInt(txtCantidad661.getText()), txtObs66.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad660.getText()),
							Integer.parseInt(txtCantidad661.getText())),
					ITEM_BS2_66, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo10, ficha,
					quitarEtiquetasHTML(LBL_BS2_67), Integer.parseInt(txtCantidad670.getText()),
					Integer.parseInt(txtCantidad671.getText()), txtObs67.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad670.getText()),
							Integer.parseInt(txtCantidad671.getText())),
					ITEM_BS2_67, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo10, ficha,
					quitarEtiquetasHTML(LBL_BS2_68), Integer.parseInt(txtCantidad680.getText()),
					Integer.parseInt(txtCantidad681.getText()), txtObs68.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad680.getText()),
							Integer.parseInt(txtCantidad681.getText())),
					ITEM_BS2_68, "UNIDAD"));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo10, ficha,
					quitarEtiquetasHTML(LBL_BS2_69), Integer.parseInt(txtCantidad690.getText()),
					Integer.parseInt(txtCantidad691.getText()), txtObs69.getText(), updateFicha,
					calcularPorcentajeAvance(Integer.parseInt(txtCantidad690.getText()),
							Integer.parseInt(txtCantidad691.getText())),
					ITEM_BS2_69, "UNIDAD"));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return detallesFicha;
	}

	public void setFichaNuevaUpdate() {
		List<TdetalleFicha> listaDetalles = srvFicha.detallesFicha(gettCabecera(), ficha);
		if (isFichaC1()) {
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
				// txtCantidad351.setText(String.valueOf(listaDetalles.get(35).getDetCantidadEjecutada()));
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
				// txtObs35.setText(listaDetalles.get(35).getDetObsRef());
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

			} catch (IndexOutOfBoundsException e) {
				llenarVacios();
			}
		} else {
			llenarVacios();
		}
	}

	public void llenarVacios() {
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
		// txtCantidad351.setText(String.valueOf(0));
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
		// txtObs35.setText("");
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
	}
}
