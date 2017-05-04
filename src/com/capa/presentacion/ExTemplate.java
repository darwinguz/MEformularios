package com.capa.presentacion;

import static com.capa.negocios.Calculos.calcularPorcentajeAvance;
import static com.capa.util.Constantes.ITEM_EX_0;
import static com.capa.util.Constantes.ITEM_EX_1;
import static com.capa.util.Constantes.ITEM_EX_10;
import static com.capa.util.Constantes.ITEM_EX_11;
import static com.capa.util.Constantes.ITEM_EX_12;
import static com.capa.util.Constantes.ITEM_EX_13;
import static com.capa.util.Constantes.ITEM_EX_14;
import static com.capa.util.Constantes.ITEM_EX_2;
import static com.capa.util.Constantes.ITEM_EX_22;
import static com.capa.util.Constantes.ITEM_EX_23;
import static com.capa.util.Constantes.ITEM_EX_24;
import static com.capa.util.Constantes.ITEM_EX_25;
import static com.capa.util.Constantes.ITEM_EX_26;
import static com.capa.util.Constantes.ITEM_EX_27;
import static com.capa.util.Constantes.ITEM_EX_28;
import static com.capa.util.Constantes.ITEM_EX_29;
import static com.capa.util.Constantes.ITEM_EX_3;
import static com.capa.util.Constantes.ITEM_EX_30;
import static com.capa.util.Constantes.ITEM_EX_4;
import static com.capa.util.Constantes.ITEM_EX_5;
import static com.capa.util.Constantes.ITEM_EX_6;
import static com.capa.util.Constantes.ITEM_EX_7;
import static com.capa.util.Constantes.ITEM_EX_8;
import static com.capa.util.Constantes.ITEM_EX_9;
import static com.capa.util.Constantes.LBL_EX_0;
import static com.capa.util.Constantes.LBL_EX_1;
import static com.capa.util.Constantes.LBL_EX_10;
import static com.capa.util.Constantes.LBL_EX_11;
import static com.capa.util.Constantes.LBL_EX_12;
import static com.capa.util.Constantes.LBL_EX_13;
import static com.capa.util.Constantes.LBL_EX_14;
import static com.capa.util.Constantes.LBL_EX_2;
import static com.capa.util.Constantes.LBL_EX_22;
import static com.capa.util.Constantes.LBL_EX_23;
import static com.capa.util.Constantes.LBL_EX_24;
import static com.capa.util.Constantes.LBL_EX_25;
import static com.capa.util.Constantes.LBL_EX_26;
import static com.capa.util.Constantes.LBL_EX_27;
import static com.capa.util.Constantes.LBL_EX_28;
import static com.capa.util.Constantes.LBL_EX_29;
import static com.capa.util.Constantes.LBL_EX_3;
import static com.capa.util.Constantes.LBL_EX_30;
import static com.capa.util.Constantes.LBL_EX_4;
import static com.capa.util.Constantes.LBL_EX_5;
import static com.capa.util.Constantes.LBL_EX_6;
import static com.capa.util.Constantes.LBL_EX_7;
import static com.capa.util.Constantes.LBL_EX_8;
import static com.capa.util.Constantes.LBL_EX_9;
import static com.capa.util.Utilitarios.cargarInfoObligatoria;
import static com.capa.util.Utilitarios.getPathImagen;
import static com.capa.util.Utilitarios.gettCabecera;
import static com.capa.util.Utilitarios.llenarCabecera;
import static com.capa.util.Utilitarios.quitarEtiquetasHTML;
import static com.capa.util.Validaciones.validarDigitos;
import static com.capa.util.Validaciones.validarInfo;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.InputStream;
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
import javax.swing.border.TitledBorder;

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

public class ExTemplate extends JFrame {

	private static final long serialVersionUID = 2991536081432510517L;
	private JPanel contentPane;
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
	private JTextField txtObs1;
	private JTextField txtObs0;
	private JTextField txtObs2;
	private JTextField txtObs3;
	private JTextField txtObs4;
	private JTextField txtObs5;
	private JTextField txtObs6;
	private JTextField txtObs7;
	private JTextField txtObs8;
	private JLabel lblTECantidad;
	private JLabel lblTEObsRef;
	private JPanel pnlED;
	private JPanel pnlEDEtiquetas;
	private JLabel lblDadosCimentacionBXB;
	private JLabel lblReflectoresLed;
	private JLabel lblPostes6mts;
	private JLabel lblEDCajasConexion;
	private JLabel lblEDKitCableadoElectrico;
	private JLabel lblEDTuberaPvc;
	private JLabel lblEDKitEsparcimD;
	private JPanel pnlEDCantidad;
	private JTextField txtCantidad90;
	private JTextField txtCantidad91;
	private JTextField txtCantidad100;
	private JTextField txtCantidad101;
	private JTextField txtCantidad110;
	private JTextField txtCantidad111;
	private JTextField txtCantidad120;
	private JTextField txtCantidad121;
	private JTextField txtCantidad130;
	private JTextField txtCantidad131;
	private JTextField txtCantidad140;
	private JTextField txtCantidad141;
	private JPanel pnlEDObsRef;
	private JTextField txtObs9;
	private JTextField txtObs10;
	private JTextField txtObs11;
	private JTextField txtObs12;
	private JTextField txtObs13;
	private JTextField txtObs14;
	private JLabel lblEDCantidad;
	private JLabel lblEDObsRef;
	private JPanel pnlT;
	private JPanel pnlTEtiquetas;
	private JLabel lblTKitCableadoTR;
	private JLabel lblTuberiaPvc;
	private JLabel lblTransformadorKva;
	private JLabel lblCimentacinTransf;
	private JLabel lblCajasDeConexion;
	private JLabel lblTKitTransformador;
	private JPanel pnlTCantidad;
	private JTextField txtCantidad250;
	private JTextField txtCantidad251;
	private JTextField txtCantidad260;
	private JTextField txtCantidad261;
	private JTextField txtCantidad270;
	private JTextField txtCantidad271;
	private JTextField txtCantidad280;
	private JTextField txtCantidad281;
	private JTextField txtCantidad290;
	private JTextField txtCantidad291;
	private JPanel pnlTObsRef;
	private JTextField txtObs25;
	private JTextField txtObs26;
	private JTextField txtObs27;
	private JTextField txtObs28;
	private JTextField txtObs29;
	private JLabel lblTCantidad;
	private JLabel lblTObsRef;
	private JPanel pnlBA;
	private JPanel pnlBAEtiquetas;
	private JLabel lblKitCableadoBA;
	private JLabel lblBATuberaPvc;
	private JLabel lblBACajasConexion;
	private JLabel lblKitBombaA;
	private JPanel pnlBACantidad;
	private JTextField txtCantidad220;
	private JTextField txtCantidad221;
	private JTextField txtCantidad230;
	private JTextField txtCantidad231;
	private JTextField txtCantidad240;
	private JTextField txtCantidad241;
	private JPanel pnlBAObsRef;
	private JTextField txtObs22;
	private JTextField txtObs23;
	private JTextField txtObs24;
	private JLabel lblBACantidad;
	private JLabel lblBAObsRef;
	private JPanel pnlSMT;
	private JPanel pnlSMTEtiquetas;
	private JLabel lblKitCableadoMT;
	private JLabel lblSistemaMallaT;
	private JPanel pnlSMTCantidad;
	private JTextField txtCantidad300;
	private JTextField txtCantidad301;
	private JPanel pnlSMTObsRef;
	private JTextField txtObs30;
	private JLabel lblSMTCantidad;
	private JLabel lblSMTObsRef;

	private TInformacionObligatoria infor;
	private TFicha ficha;
	private ServicioFicha servFicha;

	private String fotoInfoObl;

	public ExTemplate(TFicha ficha) {
		this.ficha = ficha;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1318, 659);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setTitle(Utilitarios.getNombreFicha() + ficha.getFiNombre());
		servFicha = new ComponenteFicha();

		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());
		setContentPane(contentPane);
		llenarCabecera(cabecera);

		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 125, 1286, 484);
		contentPane.add(tabbedPane);

		JPanel pnlPestaña1 = new JPanel();
		tabbedPane.addTab("1.- " + ficha.getFiDescripcion(), null, pnlPestaña1, null);
		pnlPestaña1.setLayout(null);

		JPanel pnlTE = new JPanel();
		pnlTE.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlTE.setBounds(10, 11, 414, 237);
		pnlPestaña1.add(pnlTE);
		pnlTE.setLayout(null);

		JPanel pnlTEEtiquetas = new JPanel();
		pnlTEEtiquetas.setBounds(3, 17, 199, 217);
		pnlTE.add(pnlTEEtiquetas);
		pnlTEEtiquetas.setLayout(new GridLayout(9, 0, 0, 0));

		JLabel lblTableroElectricoA = new JLabel(LBL_EX_0);
		pnlTEEtiquetas.add(lblTableroElectricoA);

		JLabel lblTableroElectricoB = new JLabel(LBL_EX_1);
		pnlTEEtiquetas.add(lblTableroElectricoB);

		JLabel lblTableroElectricoC = new JLabel(LBL_EX_2);
		pnlTEEtiquetas.add(lblTableroElectricoC);

		JLabel lblTableroElectricoD = new JLabel(LBL_EX_3);
		pnlTEEtiquetas.add(lblTableroElectricoD);

		JLabel lblTableroElectricoE = new JLabel(LBL_EX_4);
		pnlTEEtiquetas.add(lblTableroElectricoE);

		JLabel lblTableroElectricoF = new JLabel(LBL_EX_5);
		pnlTEEtiquetas.add(lblTableroElectricoF);

		JLabel lblTEKitCableadoElectrico = new JLabel(LBL_EX_6);
		pnlTEEtiquetas.add(lblTEKitCableadoElectrico);

		JLabel lblTuberia = new JLabel(LBL_EX_7);
		pnlTEEtiquetas.add(lblTuberia);

		JLabel lblCajas = new JLabel(LBL_EX_8);
		pnlTEEtiquetas.add(lblCajas);

		JLabel lblTEKitTablerosE = new JLabel("KIT DE TABLEROS EL\u00C9CTRICOS");
		lblTEKitTablerosE.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTEKitTablerosE.setBounds(3, 1, 176, 14);
		pnlTE.add(lblTEKitTablerosE);

		JPanel pnlTECantidad = new JPanel();
		pnlTECantidad.setBounds(210, 17, 55, 217);
		pnlTE.add(pnlTECantidad);
		pnlTECantidad.setLayout(new GridLayout(9, 2, 0, 0));

		txtCantidad00 = new JTextField();
		txtCantidad00.setText("3");
		txtCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad00.setEditable(false);
		pnlTECantidad.add(txtCantidad00);
		txtCantidad00.setColumns(10);

		txtCantidad01 = new JTextField();
		txtCantidad01.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad01.setColumns(10);
		pnlTECantidad.add(txtCantidad01);
		validarDigitos(txtCantidad01);

		txtCantidad10 = new JTextField();
		txtCantidad10.setText("2");
		txtCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad10.setEditable(false);
		txtCantidad10.setColumns(10);
		pnlTECantidad.add(txtCantidad10);

		txtCantidad11 = new JTextField();
		txtCantidad11.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad11.setColumns(10);
		pnlTECantidad.add(txtCantidad11);
		validarDigitos(txtCantidad11);

		txtCantidad20 = new JTextField();
		txtCantidad20.setText("2");
		txtCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad20.setEditable(false);
		txtCantidad20.setColumns(10);
		pnlTECantidad.add(txtCantidad20);

		txtCantidad21 = new JTextField();
		txtCantidad21.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad21.setColumns(10);
		pnlTECantidad.add(txtCantidad21);
		validarDigitos(txtCantidad21);

		txtCantidad30 = new JTextField();
		txtCantidad30.setText("1");
		txtCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad30.setEditable(false);
		txtCantidad30.setColumns(10);
		pnlTECantidad.add(txtCantidad30);

		txtCantidad31 = new JTextField();
		txtCantidad31.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad31.setColumns(10);
		pnlTECantidad.add(txtCantidad31);
		validarDigitos(txtCantidad31);

		txtCantidad40 = new JTextField();
		txtCantidad40.setText("1");
		txtCantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad40.setEditable(false);
		txtCantidad40.setColumns(10);
		pnlTECantidad.add(txtCantidad40);

		txtCantidad41 = new JTextField();
		txtCantidad41.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad41.setColumns(10);
		pnlTECantidad.add(txtCantidad41);
		validarDigitos(txtCantidad41);

		txtCantidad50 = new JTextField();
		txtCantidad50.setText("1");
		txtCantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad50.setEditable(false);
		txtCantidad50.setColumns(10);
		pnlTECantidad.add(txtCantidad50);

		txtCantidad51 = new JTextField();
		txtCantidad51.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad51.setColumns(10);
		pnlTECantidad.add(txtCantidad51);
		validarDigitos(txtCantidad51);

		txtCantidad60 = new JTextField();
		txtCantidad60.setText("9");
		txtCantidad60.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad60.setEditable(false);
		txtCantidad60.setColumns(10);
		pnlTECantidad.add(txtCantidad60);

		txtCantidad61 = new JTextField();
		txtCantidad61.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad61.setColumns(10);
		pnlTECantidad.add(txtCantidad61);
		validarDigitos(txtCantidad61);

		txtCantidad70 = new JTextField();
		txtCantidad70.setText("89");
		txtCantidad70.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad70.setEditable(false);
		txtCantidad70.setColumns(10);
		pnlTECantidad.add(txtCantidad70);

		txtCantidad71 = new JTextField();
		txtCantidad71.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad71.setColumns(10);
		pnlTECantidad.add(txtCantidad71);
		validarDigitos(txtCantidad71);

		txtCantidad80 = new JTextField();
		txtCantidad80.setText("22");
		txtCantidad80.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad80.setEditable(false);
		txtCantidad80.setColumns(10);
		pnlTECantidad.add(txtCantidad80);

		txtCantidad81 = new JTextField();
		txtCantidad81.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad81.setColumns(10);
		pnlTECantidad.add(txtCantidad81);
		validarDigitos(txtCantidad81);

		JPanel pnlTEObsRef = new JPanel();
		pnlTEObsRef.setBounds(267, 17, 143, 217);
		pnlTE.add(pnlTEObsRef);
		pnlTEObsRef.setLayout(new GridLayout(9, 0, 0, 0));

		txtObs0 = new JTextField();
		pnlTEObsRef.add(txtObs0);
		txtObs0.setColumns(10);

		txtObs1 = new JTextField();
		pnlTEObsRef.add(txtObs1);
		txtObs1.setColumns(10);

		txtObs2 = new JTextField();
		txtObs2.setColumns(10);
		pnlTEObsRef.add(txtObs2);

		txtObs3 = new JTextField();
		txtObs3.setColumns(10);
		pnlTEObsRef.add(txtObs3);

		txtObs4 = new JTextField();
		txtObs4.setColumns(10);
		pnlTEObsRef.add(txtObs4);

		txtObs5 = new JTextField();
		txtObs5.setColumns(10);
		pnlTEObsRef.add(txtObs5);

		txtObs6 = new JTextField();
		txtObs6.setColumns(10);
		pnlTEObsRef.add(txtObs6);

		txtObs7 = new JTextField();
		txtObs7.setColumns(10);
		pnlTEObsRef.add(txtObs7);

		txtObs8 = new JTextField();
		txtObs8.setColumns(10);
		pnlTEObsRef.add(txtObs8);

		lblTECantidad = new JLabel("Cantidad");
		lblTECantidad.setBounds(210, 1, 55, 14);
		pnlTE.add(lblTECantidad);

		lblTEObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblTEObsRef.setBounds(267, 1, 143, 14);
		pnlTE.add(lblTEObsRef);

		pnlED = new JPanel();
		pnlED.setLayout(null);
		pnlED.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlED.setBounds(10, 282, 414, 163);
		pnlPestaña1.add(pnlED);

		pnlEDEtiquetas = new JPanel();
		pnlEDEtiquetas.setBounds(3, 17, 199, 144);
		pnlED.add(pnlEDEtiquetas);
		pnlEDEtiquetas.setLayout(new GridLayout(6, 0, 0, 0));

		lblDadosCimentacionBXB = new JLabel(LBL_EX_9);
		pnlEDEtiquetas.add(lblDadosCimentacionBXB);

		lblReflectoresLed = new JLabel(LBL_EX_10);
		pnlEDEtiquetas.add(lblReflectoresLed);

		lblPostes6mts = new JLabel(LBL_EX_11);
		pnlEDEtiquetas.add(lblPostes6mts);

		lblEDCajasConexion = new JLabel(LBL_EX_12);
		pnlEDEtiquetas.add(lblEDCajasConexion);

		lblEDKitCableadoElectrico = new JLabel(LBL_EX_13);
		pnlEDEtiquetas.add(lblEDKitCableadoElectrico);

		lblEDTuberaPvc = new JLabel(LBL_EX_14);
		pnlEDEtiquetas.add(lblEDTuberaPvc);

		lblEDKitEsparcimD = new JLabel("KIT DE ESPARCIMIENTO DEPORTIVO");
		lblEDKitEsparcimD.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEDKitEsparcimD.setBounds(3, 1, 211, 14);
		pnlED.add(lblEDKitEsparcimD);

		pnlEDCantidad = new JPanel();
		pnlEDCantidad.setBounds(210, 17, 55, 144);
		pnlED.add(pnlEDCantidad);
		pnlEDCantidad.setLayout(new GridLayout(6, 2, 0, 0));

		txtCantidad90 = new JTextField();
		txtCantidad90.setText("8");
		txtCantidad90.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad90.setEditable(false);
		txtCantidad90.setColumns(10);
		pnlEDCantidad.add(txtCantidad90);

		txtCantidad91 = new JTextField();
		txtCantidad91.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad91.setColumns(10);
		pnlEDCantidad.add(txtCantidad91);
		validarDigitos(txtCantidad91);

		txtCantidad100 = new JTextField();
		txtCantidad100.setText("8");
		txtCantidad100.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad100.setEditable(false);
		txtCantidad100.setColumns(10);
		pnlEDCantidad.add(txtCantidad100);

		txtCantidad101 = new JTextField();
		txtCantidad101.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad101.setColumns(10);
		pnlEDCantidad.add(txtCantidad101);
		validarDigitos(txtCantidad101);

		txtCantidad110 = new JTextField();
		txtCantidad110.setText("8");
		txtCantidad110.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad110.setEditable(false);
		txtCantidad110.setColumns(10);
		pnlEDCantidad.add(txtCantidad110);

		txtCantidad111 = new JTextField();
		txtCantidad111.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad111.setColumns(10);
		pnlEDCantidad.add(txtCantidad111);
		validarDigitos(txtCantidad111);

		txtCantidad120 = new JTextField();
		txtCantidad120.setText("10");
		txtCantidad120.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad120.setEditable(false);
		txtCantidad120.setColumns(10);
		pnlEDCantidad.add(txtCantidad120);

		txtCantidad121 = new JTextField();
		txtCantidad121.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad121.setColumns(10);
		pnlEDCantidad.add(txtCantidad121);
		validarDigitos(txtCantidad121);

		txtCantidad130 = new JTextField();
		txtCantidad130.setText("1");
		txtCantidad130.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad130.setEditable(false);
		txtCantidad130.setColumns(10);
		pnlEDCantidad.add(txtCantidad130);

		txtCantidad131 = new JTextField();
		txtCantidad131.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad131.setColumns(10);
		pnlEDCantidad.add(txtCantidad131);
		validarDigitos(txtCantidad131);

		txtCantidad140 = new JTextField();
		txtCantidad140.setText("30");
		txtCantidad140.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad140.setEditable(false);
		txtCantidad140.setColumns(10);
		pnlEDCantidad.add(txtCantidad140);

		txtCantidad141 = new JTextField();
		txtCantidad141.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad141.setColumns(10);
		pnlEDCantidad.add(txtCantidad141);
		validarDigitos(txtCantidad141);

		pnlEDObsRef = new JPanel();
		pnlEDObsRef.setBounds(267, 17, 143, 144);
		pnlED.add(pnlEDObsRef);
		pnlEDObsRef.setLayout(new GridLayout(6, 0, 0, 0));

		txtObs9 = new JTextField();
		txtObs9.setColumns(10);
		pnlEDObsRef.add(txtObs9);

		txtObs10 = new JTextField();
		txtObs10.setColumns(10);
		pnlEDObsRef.add(txtObs10);

		txtObs11 = new JTextField();
		txtObs11.setColumns(10);
		pnlEDObsRef.add(txtObs11);

		txtObs12 = new JTextField();
		txtObs12.setColumns(10);
		pnlEDObsRef.add(txtObs12);

		txtObs13 = new JTextField();
		txtObs13.setColumns(10);
		pnlEDObsRef.add(txtObs13);

		txtObs14 = new JTextField();
		txtObs14.setColumns(10);
		pnlEDObsRef.add(txtObs14);

		lblEDCantidad = new JLabel("Cantidad");
		lblEDCantidad.setBounds(210, 1, 55, 14);
		pnlED.add(lblEDCantidad);

		lblEDObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblEDObsRef.setBounds(267, 1, 143, 14);
		pnlED.add(lblEDObsRef);

		pnlBA = new JPanel();
		pnlBA.setLayout(null);
		pnlBA.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlBA.setBounds(434, 11, 414, 95);
		pnlPestaña1.add(pnlBA);

		pnlBAEtiquetas = new JPanel();
		pnlBAEtiquetas.setBounds(3, 17, 199, 73);
		pnlBA.add(pnlBAEtiquetas);
		pnlBAEtiquetas.setLayout(new GridLayout(3, 0, 0, 0));

		lblKitCableadoBA = new JLabel(LBL_EX_22);
		pnlBAEtiquetas.add(lblKitCableadoBA);

		lblBATuberaPvc = new JLabel(LBL_EX_23);
		pnlBAEtiquetas.add(lblBATuberaPvc);

		lblBACajasConexion = new JLabel(LBL_EX_24);
		pnlBAEtiquetas.add(lblBACajasConexion);

		lblKitBombaA = new JLabel("KIT BOMBA DE AGUA");
		lblKitBombaA.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKitBombaA.setBounds(3, 1, 176, 14);
		pnlBA.add(lblKitBombaA);

		pnlBACantidad = new JPanel();
		pnlBACantidad.setBounds(210, 17, 55, 73);
		pnlBA.add(pnlBACantidad);
		pnlBACantidad.setLayout(new GridLayout(3, 2, 0, 0));

		txtCantidad220 = new JTextField();
		txtCantidad220.setText("1");
		txtCantidad220.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad220.setEditable(false);
		txtCantidad220.setColumns(10);
		pnlBACantidad.add(txtCantidad220);

		txtCantidad221 = new JTextField();
		txtCantidad221.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad221.setColumns(10);
		pnlBACantidad.add(txtCantidad221);
		validarDigitos(txtCantidad221);

		txtCantidad230 = new JTextField();
		txtCantidad230.setText("10");
		txtCantidad230.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad230.setEditable(false);
		txtCantidad230.setColumns(10);
		pnlBACantidad.add(txtCantidad230);

		txtCantidad231 = new JTextField();
		txtCantidad231.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad231.setColumns(10);
		pnlBACantidad.add(txtCantidad231);
		validarDigitos(txtCantidad231);

		txtCantidad240 = new JTextField();
		txtCantidad240.setText("1");
		txtCantidad240.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad240.setEditable(false);
		txtCantidad240.setColumns(10);
		pnlBACantidad.add(txtCantidad240);

		txtCantidad241 = new JTextField();
		txtCantidad241.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad241.setColumns(10);
		pnlBACantidad.add(txtCantidad241);
		validarDigitos(txtCantidad241);

		pnlBAObsRef = new JPanel();
		pnlBAObsRef.setBounds(267, 17, 143, 73);
		pnlBA.add(pnlBAObsRef);
		pnlBAObsRef.setLayout(new GridLayout(3, 0, 0, 0));

		txtObs22 = new JTextField();
		txtObs22.setColumns(10);
		pnlBAObsRef.add(txtObs22);

		txtObs23 = new JTextField();
		txtObs23.setColumns(10);
		pnlBAObsRef.add(txtObs23);

		txtObs24 = new JTextField();
		txtObs24.setColumns(10);
		pnlBAObsRef.add(txtObs24);

		lblBACantidad = new JLabel("Cantidad");
		lblBACantidad.setBounds(210, 1, 55, 14);
		pnlBA.add(lblBACantidad);

		lblBAObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblBAObsRef.setBounds(267, 1, 143, 14);
		pnlBA.add(lblBAObsRef);

		pnlT = new JPanel();
		pnlT.setLayout(null);
		pnlT.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlT.setBounds(434, 186, 414, 141);
		pnlPestaña1.add(pnlT);

		pnlTEtiquetas = new JPanel();
		pnlTEtiquetas.setBounds(3, 17, 199, 120);
		pnlT.add(pnlTEtiquetas);
		pnlTEtiquetas.setLayout(new GridLayout(5, 0, 0, 0));

		lblTKitCableadoTR = new JLabel(LBL_EX_25);
		pnlTEtiquetas.add(lblTKitCableadoTR);

		lblTuberiaPvc = new JLabel(LBL_EX_26);
		pnlTEtiquetas.add(lblTuberiaPvc);

		lblTransformadorKva = new JLabel(LBL_EX_27);
		pnlTEtiquetas.add(lblTransformadorKva);

		lblCimentacinTransf = new JLabel(LBL_EX_28);
		pnlTEtiquetas.add(lblCimentacinTransf);

		lblCajasDeConexion = new JLabel(LBL_EX_29);
		pnlTEtiquetas.add(lblCajasDeConexion);

		lblTKitTransformador = new JLabel("KIT TRANSFORMADOR");
		lblTKitTransformador.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTKitTransformador.setBounds(3, 1, 176, 14);
		pnlT.add(lblTKitTransformador);

		pnlTCantidad = new JPanel();
		pnlTCantidad.setBounds(210, 17, 55, 120);
		pnlT.add(pnlTCantidad);
		pnlTCantidad.setLayout(new GridLayout(5, 2, 0, 0));

		txtCantidad250 = new JTextField();
		txtCantidad250.setText("1");
		txtCantidad250.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad250.setEditable(false);
		txtCantidad250.setColumns(10);
		pnlTCantidad.add(txtCantidad250);

		txtCantidad251 = new JTextField();
		txtCantidad251.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad251.setColumns(10);
		pnlTCantidad.add(txtCantidad251);
		validarDigitos(txtCantidad251);

		txtCantidad260 = new JTextField();
		txtCantidad260.setText("1");
		txtCantidad260.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad260.setEditable(false);
		txtCantidad260.setColumns(10);
		pnlTCantidad.add(txtCantidad260);

		txtCantidad261 = new JTextField();
		txtCantidad261.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad261.setColumns(10);
		pnlTCantidad.add(txtCantidad261);
		validarDigitos(txtCantidad261);

		txtCantidad270 = new JTextField();
		txtCantidad270.setText("1");
		txtCantidad270.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad270.setEditable(false);
		txtCantidad270.setColumns(10);
		pnlTCantidad.add(txtCantidad270);

		txtCantidad271 = new JTextField();
		txtCantidad271.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad271.setColumns(10);
		pnlTCantidad.add(txtCantidad271);
		validarDigitos(txtCantidad271);

		txtCantidad280 = new JTextField();
		txtCantidad280.setText("1");
		txtCantidad280.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad280.setEditable(false);
		txtCantidad280.setColumns(10);
		pnlTCantidad.add(txtCantidad280);

		txtCantidad281 = new JTextField();
		txtCantidad281.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad281.setColumns(10);
		pnlTCantidad.add(txtCantidad281);
		validarDigitos(txtCantidad281);

		txtCantidad290 = new JTextField();
		txtCantidad290.setText("1");
		txtCantidad290.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad290.setEditable(false);
		txtCantidad290.setColumns(10);
		pnlTCantidad.add(txtCantidad290);

		txtCantidad291 = new JTextField();
		txtCantidad291.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad291.setColumns(10);
		pnlTCantidad.add(txtCantidad291);
		validarDigitos(txtCantidad291);

		pnlTObsRef = new JPanel();
		pnlTObsRef.setBounds(267, 17, 143, 120);
		pnlT.add(pnlTObsRef);
		pnlTObsRef.setLayout(new GridLayout(5, 0, 0, 0));

		txtObs25 = new JTextField();
		txtObs25.setColumns(10);
		pnlTObsRef.add(txtObs25);

		txtObs26 = new JTextField();
		txtObs26.setColumns(10);
		pnlTObsRef.add(txtObs26);

		txtObs27 = new JTextField();
		txtObs27.setColumns(10);
		pnlTObsRef.add(txtObs27);

		txtObs28 = new JTextField();
		txtObs28.setColumns(10);
		pnlTObsRef.add(txtObs28);

		txtObs29 = new JTextField();
		txtObs29.setColumns(10);
		pnlTObsRef.add(txtObs29);

		lblTCantidad = new JLabel("Cantidad");
		lblTCantidad.setBounds(210, 1, 55, 14);
		pnlT.add(lblTCantidad);

		lblTObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblTObsRef.setBounds(267, 1, 143, 14);
		pnlT.add(lblTObsRef);

		pnlSMT = new JPanel();
		pnlSMT.setLayout(null);
		pnlSMT.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlSMT.setBounds(434, 398, 414, 47);
		pnlPestaña1.add(pnlSMT);

		pnlSMTEtiquetas = new JPanel();
		pnlSMTEtiquetas.setBounds(3, 17, 199, 25);
		pnlSMT.add(pnlSMTEtiquetas);
		pnlSMTEtiquetas.setLayout(new GridLayout(1, 0, 0, 0));

		lblKitCableadoMT = new JLabel(LBL_EX_30);
		pnlSMTEtiquetas.add(lblKitCableadoMT);

		lblSistemaMallaT = new JLabel("SISTEMA MALLA A TIERRA");
		lblSistemaMallaT.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSistemaMallaT.setBounds(3, 1, 176, 14);
		pnlSMT.add(lblSistemaMallaT);

		pnlSMTCantidad = new JPanel();
		pnlSMTCantidad.setBounds(210, 17, 55, 25);
		pnlSMT.add(pnlSMTCantidad);
		pnlSMTCantidad.setLayout(new GridLayout(1, 1, 0, 0));

		txtCantidad300 = new JTextField();
		txtCantidad300.setText("1");
		txtCantidad300.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad300.setEditable(false);
		txtCantidad300.setColumns(10);
		pnlSMTCantidad.add(txtCantidad300);

		txtCantidad301 = new JTextField();
		txtCantidad301.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad301.setColumns(10);
		pnlSMTCantidad.add(txtCantidad301);
		validarDigitos(txtCantidad301);

		pnlSMTObsRef = new JPanel();
		pnlSMTObsRef.setBounds(267, 17, 143, 25);
		pnlSMT.add(pnlSMTObsRef);
		pnlSMTObsRef.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs30 = new JTextField();
		txtObs30.setColumns(10);
		pnlSMTObsRef.add(txtObs30);

		lblSMTCantidad = new JLabel("Cantidad");
		lblSMTCantidad.setBounds(210, 1, 55, 14);
		pnlSMT.add(lblSMTCantidad);

		lblSMTObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblSMTObsRef.setBounds(267, 1, 143, 14);
		pnlSMT.add(lblSMTObsRef);

		JPinformacionObligatoria infoObligatoria = new JPinformacionObligatoria(865, 240);
		infoObligatoria.getBtnInsertarFoto().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				fotoInfoObl = getPathImagen();
			}
		});
		pnlPestaña1.add(infoObligatoria.getPnlInformacionObl());

		llenarFicha();

		cabecera.getBtnRegistrar().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ServicioInfoObligatoria srvInfoOblig = new ComponenteInfoObligatoria();

				infor = cargarInfoObligatoria(infoObligatoria);
				infor.setIoFotoPath(fotoInfoObl);
				infor.setIoSerial(srvInfoOblig.serialInfoOblMax());

				if (validarInfo(infor)) {
					List<TdetalleFicha> detallesFicha = cargarListas();
					if (detallesFicha == null) {
						JOptionPane.showMessageDialog(null,
								"ERROR: Verificar que los registros no se encuentren VACÍOS", "Mensaje de Error",
								JOptionPane.ERROR_MESSAGE);
						return;
					}
					if (Validaciones.registrosValidados(detallesFicha)) {
						srvInfoOblig.crear(infor);
						servFicha.guardarFormulario(detallesFicha);
						HashMap<String, Object> parametros = new HashMap<String, Object>();
						parametros.put("serial_cabecera", Utilitarios.gettCabecera().getCSerial());
						parametros.put("serial_ficha", ficha.getFiSerial());
						Reporte reporte = new Reporte("Reporte Ex", 280, 10, 850, 750);
						InputStream path = AlInicio.class.getResourceAsStream("/com/capa/templates/MA.jasper");
						reporte.cargarReporte(path, parametros, Query.getMysql().getConexion());
						reporte.setVisible(true);
						new Menu().setVisible(true);
						dispose();
					}
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

	public List<TdetalleFicha> cargarListas() {
		List<TdetalleFicha> listaDetalles = new LinkedList<>();

		// ServicioInfoObligatoria srvInfoObl = new ComponenteInfoObligatoria();
		// infor.setIoSerial(srvInfoObl.serialInfoOblMax());

		BigDecimal porcentajeAvance;
		Integer updateFicha = servFicha.nActualizacionFicha(gettCabecera(), ficha);
		if (updateFicha == -1) {
			updateFicha = 0;
		} else {
			updateFicha++;
		}

		TGrupo grupoTmp = servFicha.buscarGrupo("Kit de tableros eléctricos");
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad00.getText()),
				Double.parseDouble(txtCantidad01.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_0),
				Integer.parseInt(txtCantidad00.getText()), Integer.parseInt(txtCantidad01.getText()), txtObs0.getText(),
				updateFicha, porcentajeAvance, ITEM_EX_0, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad10.getText()),
				Double.parseDouble(txtCantidad11.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_1),
				Integer.parseInt(txtCantidad10.getText()), Integer.parseInt(txtCantidad11.getText()), txtObs1.getText(),
				updateFicha, porcentajeAvance, ITEM_EX_1, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad20.getText()),
				Double.parseDouble(txtCantidad21.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_2),
				Integer.parseInt(txtCantidad20.getText()), Integer.parseInt(txtCantidad21.getText()), txtObs2.getText(),
				updateFicha, porcentajeAvance, ITEM_EX_2, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad30.getText()),
				Double.parseDouble(txtCantidad31.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_3),
				Integer.parseInt(txtCantidad30.getText()), Integer.parseInt(txtCantidad31.getText()), txtObs3.getText(),
				updateFicha, porcentajeAvance, ITEM_EX_3, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad40.getText()),
				Double.parseDouble(txtCantidad41.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_4),
				Integer.parseInt(txtCantidad40.getText()), Integer.parseInt(txtCantidad41.getText()), txtObs4.getText(),
				updateFicha, porcentajeAvance, ITEM_EX_4, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad50.getText()),
				Double.parseDouble(txtCantidad51.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_5),
				Integer.parseInt(txtCantidad50.getText()), Integer.parseInt(txtCantidad51.getText()), txtObs5.getText(),
				updateFicha, porcentajeAvance, ITEM_EX_5, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad60.getText()),
				Double.parseDouble(txtCantidad61.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_6),
				Integer.parseInt(txtCantidad60.getText()), Integer.parseInt(txtCantidad61.getText()), txtObs6.getText(),
				updateFicha, porcentajeAvance, ITEM_EX_6, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad70.getText()),
				Double.parseDouble(txtCantidad71.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_7),
				Integer.parseInt(txtCantidad70.getText()), Integer.parseInt(txtCantidad71.getText()), txtObs7.getText(),
				updateFicha, porcentajeAvance, ITEM_EX_7, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad80.getText()),
				Double.parseDouble(txtCantidad81.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_8),
				Integer.parseInt(txtCantidad80.getText()), Integer.parseInt(txtCantidad81.getText()), txtObs8.getText(),
				updateFicha, porcentajeAvance, ITEM_EX_8, "UNIDAD"));

		grupoTmp = servFicha.buscarGrupo("Kit de esparcimiento deportivo");
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad90.getText()),
				Double.parseDouble(txtCantidad91.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_9),
				Integer.parseInt(txtCantidad90.getText()), Integer.parseInt(txtCantidad91.getText()), txtObs9.getText(),
				updateFicha, porcentajeAvance, ITEM_EX_9, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad100.getText()),
				Double.parseDouble(txtCantidad101.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_10),
				Integer.parseInt(txtCantidad100.getText()), Integer.parseInt(txtCantidad101.getText()),
				txtObs10.getText(), updateFicha, porcentajeAvance, ITEM_EX_10, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad110.getText()),
				Double.parseDouble(txtCantidad111.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_11),
				Integer.parseInt(txtCantidad110.getText()), Integer.parseInt(txtCantidad111.getText()),
				txtObs11.getText(), updateFicha, porcentajeAvance, ITEM_EX_11, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad120.getText()),
				Double.parseDouble(txtCantidad121.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_12),
				Integer.parseInt(txtCantidad120.getText()), Integer.parseInt(txtCantidad121.getText()),
				txtObs12.getText(), updateFicha, porcentajeAvance, ITEM_EX_12, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad130.getText()),
				Double.parseDouble(txtCantidad131.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_13),
				Integer.parseInt(txtCantidad130.getText()), Integer.parseInt(txtCantidad131.getText()),
				txtObs13.getText(), updateFicha, porcentajeAvance, ITEM_EX_13, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad140.getText()),
				Double.parseDouble(txtCantidad141.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_14),
				Integer.parseInt(txtCantidad140.getText()), Integer.parseInt(txtCantidad141.getText()),
				txtObs14.getText(), updateFicha, porcentajeAvance, ITEM_EX_14, "UNIDAD"));

		grupoTmp = servFicha.buscarGrupo("Kit alumbrado exterior");

		grupoTmp = servFicha.buscarGrupo("Kit bomba de agua");
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad220.getText()),
				Double.parseDouble(txtCantidad221.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_22),
				Integer.parseInt(txtCantidad220.getText()), Integer.parseInt(txtCantidad221.getText()),
				txtObs22.getText(), updateFicha, porcentajeAvance, ITEM_EX_22, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad230.getText()),
				Double.parseDouble(txtCantidad231.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_23),
				Integer.parseInt(txtCantidad230.getText()), Integer.parseInt(txtCantidad231.getText()),
				txtObs23.getText(), updateFicha, porcentajeAvance, ITEM_EX_23, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad240.getText()),
				Double.parseDouble(txtCantidad241.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_24),
				Integer.parseInt(txtCantidad240.getText()), Integer.parseInt(txtCantidad241.getText()),
				txtObs24.getText(), updateFicha, porcentajeAvance, ITEM_EX_24, "UNIDAD"));

		grupoTmp = servFicha.buscarGrupo("Kit transformador");
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad250.getText()),
				Double.parseDouble(txtCantidad251.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_25),
				Integer.parseInt(txtCantidad250.getText()), Integer.parseInt(txtCantidad251.getText()),
				txtObs25.getText(), updateFicha, porcentajeAvance, ITEM_EX_25, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad260.getText()),
				Double.parseDouble(txtCantidad261.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_26),
				Integer.parseInt(txtCantidad260.getText()), Integer.parseInt(txtCantidad261.getText()),
				txtObs26.getText(), updateFicha, porcentajeAvance, ITEM_EX_26, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad270.getText()),
				Double.parseDouble(txtCantidad271.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_27),
				Integer.parseInt(txtCantidad270.getText()), Integer.parseInt(txtCantidad271.getText()),
				txtObs27.getText(), updateFicha, porcentajeAvance, ITEM_EX_27, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad280.getText()),
				Double.parseDouble(txtCantidad281.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_28),
				Integer.parseInt(txtCantidad280.getText()), Integer.parseInt(txtCantidad281.getText()),
				txtObs28.getText(), updateFicha, porcentajeAvance, ITEM_EX_28, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad290.getText()),
				Double.parseDouble(txtCantidad291.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_29),
				Integer.parseInt(txtCantidad290.getText()), Integer.parseInt(txtCantidad291.getText()),
				txtObs29.getText(), updateFicha, porcentajeAvance, ITEM_EX_29, "UNIDAD"));

		grupoTmp = servFicha.buscarGrupo("Sistema malla a tierra");
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad300.getText()),
				Double.parseDouble(txtCantidad301.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_EX_30),
				Integer.parseInt(txtCantidad300.getText()), Integer.parseInt(txtCantidad301.getText()),
				txtObs30.getText(), updateFicha, porcentajeAvance, ITEM_EX_30, "UNIDAD"));

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
			txtCantidad221.setText(String.valueOf(listaDetalles.get(22).getDetCantidadEjecutada()));
			txtCantidad231.setText(String.valueOf(listaDetalles.get(23).getDetCantidadEjecutada()));
			txtCantidad241.setText(String.valueOf(listaDetalles.get(24).getDetCantidadEjecutada()));
			txtCantidad251.setText(String.valueOf(listaDetalles.get(25).getDetCantidadEjecutada()));
			txtCantidad261.setText(String.valueOf(listaDetalles.get(26).getDetCantidadEjecutada()));
			txtCantidad271.setText(String.valueOf(listaDetalles.get(27).getDetCantidadEjecutada()));
			txtCantidad281.setText(String.valueOf(listaDetalles.get(28).getDetCantidadEjecutada()));
			txtCantidad291.setText(String.valueOf(listaDetalles.get(29).getDetCantidadEjecutada()));
			txtCantidad301.setText(String.valueOf(listaDetalles.get(30).getDetCantidadEjecutada()));

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
			txtObs22.setText(listaDetalles.get(22).getDetObsRef());
			txtObs23.setText(listaDetalles.get(23).getDetObsRef());
			txtObs24.setText(listaDetalles.get(24).getDetObsRef());
			txtObs25.setText(listaDetalles.get(25).getDetObsRef());
			txtObs26.setText(listaDetalles.get(26).getDetObsRef());
			txtObs27.setText(listaDetalles.get(27).getDetObsRef());
			txtObs28.setText(listaDetalles.get(28).getDetObsRef());
			txtObs29.setText(listaDetalles.get(29).getDetObsRef());
			txtObs30.setText(listaDetalles.get(30).getDetObsRef());
		} catch (IndexOutOfBoundsException e) {
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
			txtCantidad221.setText(String.valueOf(0));
			txtCantidad231.setText(String.valueOf(0));
			txtCantidad241.setText(String.valueOf(0));
			txtCantidad251.setText(String.valueOf(0));
			txtCantidad261.setText(String.valueOf(0));
			txtCantidad271.setText(String.valueOf(0));
			txtCantidad281.setText(String.valueOf(0));
			txtCantidad291.setText(String.valueOf(0));
			txtCantidad301.setText(String.valueOf(0));

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
			txtObs22.setText("");
			txtObs23.setText("");
			txtObs24.setText("");
			txtObs25.setText("");
			txtObs26.setText("");
			txtObs27.setText("");
			txtObs28.setText("");
			txtObs29.setText("");
			txtObs30.setText("");
		}
	}
}
