package com.capa.presentacion;

import static com.capa.negocios.Calculos.calcularPorcentajeAvance;
import static com.capa.util.Constantes.*;
import static com.capa.util.Utilitarios.*;
import static com.capa.util.Validaciones.*;

import java.awt.EventQueue;
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
import com.capa.util.Utilitarios;
import com.capa.util.Validaciones;

public class MtTemplate extends JFrame {

	private static final long serialVersionUID = 2991536081432510517L;
	private JPanel contentPane;
	public ServicioFicha srvFicha = new ComponenteFicha();
	public ServicioInfoObligatoria srvInfoObl = new ComponenteInfoObligatoria();
	public ServicioCabecera srvTempCabecera = new ComponenteCabecera();
	public ServicioCabecera srvCabecera = new ComponenteCabecera();

	private JTextField txtCantidad00;
	private JTextField txtCantidad01;
	private JTextField txtCantidad10;
	private JTextField txtCantidad11;
	private JTextField txtCantidad20;
	private JTextField txtCantidad21;
	private JTextField txtCantidad30;
	private JTextField txtCantidad31;
	private JTextField txtObs1;
	private JTextField txtObs0;
	private JTextField txtObs2;
	private JTextField txtObs3;
	private JTextField txtObs4;
	private JTextField txtCantidad180;
	private JTextField txtCantidad181;
	private JTextField txtCantidad190;
	private JTextField txtCantidad191;
	private JTextField txtCantidad200;
	private JTextField txtCantidad201;
	private JTextField txtCantidad210;
	private JTextField txtCantidad211;
	private JTextField txtObs18;
	private JTextField txtObs19;
	private JTextField txtObs20;
	private JTextField txtObs21;
	private JTextField txtCantidad261;
	private JTextField txtCantidad270;
	private JTextField txtCantidad271;
	private JTextField txtCantidad280;
	private JTextField txtCantidad281;
	private JTextField txtCantidad290;
	private JTextField txtCantidad291;
	private JTextField txtCantidad300;
	private JTextField txtCantidad301;
	private JTextField txtCantidad310;
	private JTextField txtObs26;
	private JTextField txtObs27;
	private JTextField txtObs28;
	private JTextField txtObs29;
	private JTextField txtObs34;
	private JTextField txtCantidad150;
	private JTextField txtCantidad151;
	private JTextField txtCantidad160;
	private JTextField txtCantidad161;
	private JTextField txtCantidad170;
	private JTextField txtCantidad171;
	private JTextField txtObs15;
	private JTextField txtObs16;
	private JTextField txtObs17;
	private JTextField txtCantidad90;
	private JTextField txtCantidad91;
	private JTextField txtCantidad100;
	private JTextField txtCantidad101;
	private JTextField txtCantidad110;
	private JTextField txtCantidad111;
	private JTextField txtObs9;
	private JTextField txtObs10;
	private JTextField txtObs11;
	private JTextField txtCantidad220;
	private JTextField txtCantidad221;
	private JTextField txtCantidad230;
	private JTextField txtCantidad231;
	private JTextField txtCantidad240;
	private JTextField txtCantidad241;
	private JTextField txtObs22;
	private JTextField txtObs23;
	private JTextField txtObs24;
	private JTextField txtCantidad251;
	private JTextField txtObs25;
	private JTextField txtCantidad321;
	private JTextField txtCantidad311;
	private JTextField txtObs30;
	private JTextField txtObs31;
	private JTextField txtObs32;
	private JTextField txtObs33;
	private JTextField txtObs35;
	private JTextField txtObs36;
	private JTextField txtObs37;
	private JTextField txtCantidad250;
	private JTextField txtCantidad260;
	private JTextField txtCantidad331;
	private JTextField txtCantidad320;
	private JTextField txtCantidad341;
	private JTextField txtCantidad330;
	private JTextField txtCantidad351;
	private JTextField txtCantidad340;
	private JTextField txtCantidad361;
	private JTextField txtCantidad350;
	private JTextField txtCantidad370;
	private JTextField txtCantidad360;
	private JTextField txtCantidad371;

	private TFicha ficha;
	private String fotoInfoObl;

	private JTextField txtCantidad60;
	private JTextField txtCantidad61;
	private JTextField txtCantidad70;
	private JTextField txtCantidad71;
	private JTextField txtObs6;
	private JTextField txtObs7;
	private JTextField txtObs5;
	private JTextField txtCantidad50;
	private JTextField txtCantidad51;
	private JTextField txtCantidad40;
	private JTextField txtCantidad41;
	private JTextField txtCantidad80;
	private JTextField txtCantidad81;
	private JTextField txtObs8;
	private JTextField txtCantidad130;
	private JTextField txtCantidad131;
	private JTextField txtCantidad140;
	private JTextField txtCantidad141;
	private JTextField txtObs13;
	private JTextField txtObs14;
	private JTextField txtCantidad120;
	private JTextField txtCantidad121;
	private JTextField txtObs12;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				ServicioFicha srvFicha = new ComponenteFicha();
				try {
					MtTemplate frame = new MtTemplate(srvFicha.buscarFormulario("MT-1"));
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MtTemplate(TFicha ficha) {

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1320, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setTitle(Utilitarios.getNombreFicha() + ficha.getFiNombre());

		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.ficha = ficha;

		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());
		Utilitarios.llenarCabecera(cabecera);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 125, 1286, 560);
		contentPane.add(tabbedPane);

		JPanel pnlPestaña1 = new JPanel();
		tabbedPane.addTab(ficha.getFiDescripcion(), null, pnlPestaña1, null);
		pnlPestaña1.setLayout(null);

		JPinformacionObligatoria infoObligatoria = new JPinformacionObligatoria(860, 312);
		infoObligatoria.getBtnInsertarFoto().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				fotoInfoObl = getPathImagen();
				System.out.println(fotoInfoObl);
			}
		});
		pnlPestaña1.add(infoObligatoria.getPnlInformacionObl());

		JPanel pnlKitElectrico = new JPanel();
		pnlKitElectrico.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlKitElectrico.setBounds(10, 10, 414, 120);
		pnlPestaña1.add(pnlKitElectrico);
		pnlKitElectrico.setLayout(null);

		JPanel pnlTEEtiquetas = new JPanel();
		pnlTEEtiquetas.setBounds(3, 17, 199, 100);
		pnlKitElectrico.add(pnlTEEtiquetas);
		pnlTEEtiquetas.setLayout(new GridLayout(4, 0, 0, 0));

		JLabel lblTableroElectricoA = new JLabel(LBL_MT_0);
		lblTableroElectricoA.setFont(new Font("Arial", Font.PLAIN, 10));
		lblTableroElectricoA.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEEtiquetas.add(lblTableroElectricoA);

		JLabel lblTableroElectricoB = new JLabel(LBL_MT_1);
		lblTableroElectricoB.setFont(new Font("Arial", Font.PLAIN, 10));
		lblTableroElectricoB.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEEtiquetas.add(lblTableroElectricoB);

		JLabel lblTableroElectricoC = new JLabel(LBL_MT_2);
		lblTableroElectricoC.setFont(new Font("Arial", Font.PLAIN, 10));
		lblTableroElectricoC.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEEtiquetas.add(lblTableroElectricoC);

		JLabel lblTableroElectricoD = new JLabel(LBL_MT_3);
		lblTableroElectricoD.setFont(new Font("Arial", Font.PLAIN, 10));
		lblTableroElectricoD.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEEtiquetas.add(lblTableroElectricoD);

		JLabel lbl_kit_electrico = new JLabel("KIT ELECTRICO");
		lbl_kit_electrico.setFont(new Font("Arial", Font.BOLD, 11));
		lbl_kit_electrico.setBounds(3, 1, 176, 14);
		pnlKitElectrico.add(lbl_kit_electrico);

		JPanel pnlTECantidad = new JPanel();
		pnlTECantidad.setBounds(210, 17, 55, 100);
		pnlKitElectrico.add(pnlTECantidad);
		pnlTECantidad.setLayout(new GridLayout(4, 2, 0, 0));

		txtCantidad00 = new JTextField();
		txtCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad00.setText(TXT_MT_0);
		txtCantidad00.setEditable(false);
		pnlTECantidad.add(txtCantidad00);
		txtCantidad00.setColumns(10);

		txtCantidad01 = new JTextField();
		txtCantidad01.setColumns(10);
		pnlTECantidad.add(txtCantidad01);
		validarDigitos(txtCantidad01);

		txtCantidad10 = new JTextField();
		txtCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad10.setText(TXT_MT_1);
		txtCantidad10.setEditable(false);
		txtCantidad10.setColumns(10);
		pnlTECantidad.add(txtCantidad10);

		txtCantidad11 = new JTextField();
		txtCantidad11.setColumns(10);
		pnlTECantidad.add(txtCantidad11);
		validarDigitos(txtCantidad11);

		txtCantidad20 = new JTextField();
		txtCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad20.setText(TXT_MT_2);
		txtCantidad20.setEditable(false);
		txtCantidad20.setColumns(10);
		pnlTECantidad.add(txtCantidad20);

		txtCantidad21 = new JTextField();
		txtCantidad21.setColumns(10);
		pnlTECantidad.add(txtCantidad21);
		validarDigitos(txtCantidad21);

		txtCantidad30 = new JTextField();
		txtCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad30.setText(TXT_MT_3);
		txtCantidad30.setEditable(false);
		txtCantidad30.setColumns(10);
		pnlTECantidad.add(txtCantidad30);

		txtCantidad31 = new JTextField();
		txtCantidad31.setColumns(10);
		pnlTECantidad.add(txtCantidad31);
		validarDigitos(txtCantidad31);

		JPanel pnlTEObsRef = new JPanel();
		pnlTEObsRef.setBounds(267, 17, 143, 100);
		pnlKitElectrico.add(pnlTEObsRef);
		pnlTEObsRef.setLayout(new GridLayout(4, 0, 0, 0));

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

		JLabel lblTECantidad = new JLabel("Cantidad");
		lblTECantidad.setBounds(210, 1, 55, 14);
		lblTECantidad.setFont(new Font("Arial", Font.BOLD, 11));
		pnlKitElectrico.add(lblTECantidad);

		JLabel lblTEObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblTEObsRef.setBounds(267, 1, 143, 14);
		lblTEObsRef.setFont(new Font("Arial", Font.BOLD, 11));
		pnlKitElectrico.add(lblTEObsRef);

		JPanel pnlKitAguaLluvia = new JPanel();
		pnlKitAguaLluvia.setLayout(null);
		pnlKitAguaLluvia.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlKitAguaLluvia.setBounds(10, 132, 414, 197);
		pnlPestaña1.add(pnlKitAguaLluvia);

		JPanel pnlEDEtiquetas = new JPanel();
		pnlEDEtiquetas.setBounds(3, 17, 199, 25);
		pnlKitAguaLluvia.add(pnlEDEtiquetas);
		pnlEDEtiquetas.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblDadosCimentacionBXB = new JLabel(LBL_MT_4);
		lblDadosCimentacionBXB.setFont(new Font("Arial", Font.PLAIN, 10));
		lblDadosCimentacionBXB.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlEDEtiquetas.add(lblDadosCimentacionBXB);

		JLabel lbl_agua_lluvia = new JLabel("KIT AGUA LLUVIA");
		lbl_agua_lluvia.setFont(new Font("Arial", Font.BOLD, 11));
		lbl_agua_lluvia.setBounds(3, 1, 211, 14);
		pnlKitAguaLluvia.add(lbl_agua_lluvia);

		JPanel pnlEDCantidad = new JPanel();
		pnlEDCantidad.setBounds(210, 17, 55, 25);
		pnlKitAguaLluvia.add(pnlEDCantidad);
		pnlEDCantidad.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad40 = new JTextField();
		txtCantidad40.setText("3");
		txtCantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad40.setEditable(false);
		txtCantidad40.setColumns(10);
		pnlEDCantidad.add(txtCantidad40);

		txtCantidad41 = new JTextField();
		txtCantidad41.setColumns(10);
		pnlEDCantidad.add(txtCantidad41);
		validarDigitos(txtCantidad41);

		JPanel pnlEDObsRef = new JPanel();
		pnlEDObsRef.setBounds(267, 17, 143, 25);
		pnlKitAguaLluvia.add(pnlEDObsRef);
		pnlEDObsRef.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs4 = new JTextField();
		txtObs4.setColumns(10);
		pnlEDObsRef.add(txtObs4);

		JLabel lblEDCantidad = new JLabel("Cantidad");
		lblEDCantidad.setBounds(210, 1, 55, 14);
		lblEDCantidad.setFont(new Font("Arial", Font.BOLD, 11));
		pnlKitAguaLluvia.add(lblEDCantidad);

		JLabel lblEDObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblEDObsRef.setBounds(267, 1, 143, 14);
		lblEDObsRef.setFont(new Font("Arial", Font.BOLD, 11));
		pnlKitAguaLluvia.add(lblEDObsRef);

		JPanel panel_13 = new JPanel();
		panel_13.setBounds(3, 43, 199, 50);
		pnlKitAguaLluvia.add(panel_13);
		panel_13.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel label_15 = new JLabel(
				"<html><body><p align='right'>Kit de Accesorios de Conexión Agua de Lluvia (2 rejilla,4 codos 90°,1/4 gl polipega, tornillos, abrazaderas)</p></body></html>");
		label_15.setHorizontalAlignment(SwingConstants.RIGHT);
		label_15.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_13.add(label_15);

		JPanel panel_14 = new JPanel();
		panel_14.setBounds(3, 93, 199, 50);
		pnlKitAguaLluvia.add(panel_14);
		panel_14.setLayout(new GridLayout(2, 0, 0, 0));

		JLabel label_17 = new JLabel("<html><body><p align='right'>Tubería de PVC 75 mm L=3m</p></body></html>");
		label_17.setFont(new Font("Arial", Font.PLAIN, 10));
		label_17.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_14.add(label_17);

		JLabel label_18 = new JLabel("<html><body><p align='right'>Tubería de PVC 75 mm L=0.6m</p></body></html>");
		label_18.setFont(new Font("Arial", Font.PLAIN, 10));
		label_18.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_14.add(label_18);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(3, 142, 199, 50);
		pnlKitAguaLluvia.add(panel_4);
		panel_4.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel label_4 = new JLabel(
				"<html><body><p align='right'>Kit para conexión de tubería 75 mm. (lija pliego, polipega 1/4gal,1codo 90°)</p></body></html>");
		label_4.setFont(new Font("Arial", Font.PLAIN, 10));
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_4.add(label_4);

		JPanel panel_16 = new JPanel();
		panel_16.setBounds(210, 53, 55, 25);
		pnlKitAguaLluvia.add(panel_16);
		panel_16.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad50 = new JTextField();
		txtCantidad50.setText("2");
		txtCantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad50.setEditable(false);
		txtCantidad50.setColumns(10);
		panel_16.add(txtCantidad50);

		txtCantidad51 = new JTextField();
		txtCantidad51.setColumns(10);
		panel_16.add(txtCantidad51);
		validarDigitos(txtCantidad51);

		JPanel panel_17 = new JPanel();
		panel_17.setBounds(267, 53, 143, 25);
		pnlKitAguaLluvia.add(panel_17);
		panel_17.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs5 = new JTextField();
		txtObs5.setColumns(10);
		panel_17.add(txtObs5);

		JPanel panel_18 = new JPanel();
		panel_18.setBounds(210, 154, 55, 25);
		pnlKitAguaLluvia.add(panel_18);
		panel_18.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad80 = new JTextField();
		txtCantidad80.setText("1");
		txtCantidad80.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad80.setEditable(false);
		txtCantidad80.setColumns(10);
		panel_18.add(txtCantidad80);

		txtCantidad81 = new JTextField();
		txtCantidad81.setColumns(10);
		panel_18.add(txtCantidad81);
		validarDigitos(txtCantidad81);

		JPanel panel_19 = new JPanel();
		panel_19.setBounds(267, 154, 143, 25);
		pnlKitAguaLluvia.add(panel_19);
		panel_19.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs8 = new JTextField();
		txtObs8.setColumns(10);
		panel_19.add(txtObs8);

		JPanel panel_8 = new JPanel();
		panel_8.setBounds(210, 93, 55, 50);
		pnlKitAguaLluvia.add(panel_8);
		panel_8.setLayout(new GridLayout(2, 2, 0, 0));

		txtCantidad60 = new JTextField();
		txtCantidad60.setText("2");
		txtCantidad60.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad60.setEditable(false);
		txtCantidad60.setColumns(10);
		panel_8.add(txtCantidad60);

		txtCantidad61 = new JTextField();
		txtCantidad61.setColumns(10);
		panel_8.add(txtCantidad61);
		validarDigitos(txtCantidad61);

		txtCantidad70 = new JTextField();
		txtCantidad70.setText("1");
		txtCantidad70.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad70.setEditable(false);
		txtCantidad70.setColumns(10);
		panel_8.add(txtCantidad70);

		txtCantidad71 = new JTextField();
		txtCantidad71.setColumns(10);
		panel_8.add(txtCantidad71);
		validarDigitos(txtCantidad71);

		JPanel panel_12 = new JPanel();
		panel_12.setBounds(267, 93, 143, 50);
		pnlKitAguaLluvia.add(panel_12);
		panel_12.setLayout(new GridLayout(2, 0, 0, 0));

		txtObs6 = new JTextField();
		txtObs6.setColumns(10);
		panel_12.add(txtObs6);

		txtObs7 = new JTextField();
		txtObs7.setColumns(10);
		panel_12.add(txtObs7);

		JPanel pnlCompArquitect1_1 = new JPanel();
		pnlCompArquitect1_1.setLayout(null);
		pnlCompArquitect1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlCompArquitect1_1.setBounds(10, 332, 414, 198);
		pnlPestaña1.add(pnlCompArquitect1_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(3, 17, 199, 75);
		pnlCompArquitect1_1.add(panel_1);
		panel_1.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel lblPuertas = new JLabel(LBL_MT_9);
		lblPuertas.setFont(new Font("Arial", Font.PLAIN, 10));
		lblPuertas.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblPuertas);

		JLabel lblBisagras = new JLabel(LBL_MT_10);
		lblBisagras.setFont(new Font("Arial", Font.PLAIN, 10));
		lblBisagras.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblBisagras);

		JLabel lblPerfilSfTipo = new JLabel(LBL_MT_11);
		lblPerfilSfTipo.setFont(new Font("Arial", Font.PLAIN, 10));
		lblPerfilSfTipo.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblPerfilSfTipo);

		JLabel lblComponenteArquitectnico = new JLabel("COMPONENTE ARQUITECT\u00D3NICO");
		lblComponenteArquitectnico.setFont(new Font("Arial", Font.BOLD, 11));
		lblComponenteArquitectnico.setBounds(3, 1, 211, 14);
		pnlCompArquitect1_1.add(lblComponenteArquitectnico);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(210, 17, 55, 75);
		pnlCompArquitect1_1.add(panel_2);
		panel_2.setLayout(new GridLayout(3, 2, 0, 0));

		txtCantidad90 = new JTextField();
		txtCantidad90.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad90.setText(TXT_MT_9);
		txtCantidad90.setEditable(false);
		txtCantidad90.setColumns(10);
		panel_2.add(txtCantidad90);

		txtCantidad91 = new JTextField();
		txtCantidad91.setColumns(10);
		panel_2.add(txtCantidad91);
		validarDigitos(txtCantidad91);

		txtCantidad100 = new JTextField();
		txtCantidad100.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad100.setText(TXT_MT_10);
		txtCantidad100.setEditable(false);
		txtCantidad100.setColumns(10);
		panel_2.add(txtCantidad100);

		txtCantidad101 = new JTextField();
		txtCantidad101.setColumns(10);
		panel_2.add(txtCantidad101);
		validarDigitos(txtCantidad101);

		txtCantidad110 = new JTextField();
		txtCantidad110.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad110.setText(TXT_MT_11);
		txtCantidad110.setEditable(false);
		txtCantidad110.setColumns(10);
		panel_2.add(txtCantidad110);

		txtCantidad111 = new JTextField();
		txtCantidad111.setColumns(10);
		panel_2.add(txtCantidad111);
		validarDigitos(txtCantidad111);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(267, 17, 143, 75);
		pnlCompArquitect1_1.add(panel_3);
		panel_3.setLayout(new GridLayout(3, 0, 0, 0));

		txtObs9 = new JTextField();
		txtObs9.setColumns(10);
		panel_3.add(txtObs9);

		txtObs10 = new JTextField();
		txtObs10.setColumns(10);
		panel_3.add(txtObs10);

		txtObs11 = new JTextField();
		txtObs11.setColumns(10);
		panel_3.add(txtObs11);

		JLabel label_6 = new JLabel("Cantidad");
		label_6.setBounds(210, 1, 55, 14);
		label_6.setFont(new Font("Arial", Font.BOLD, 11));
		pnlCompArquitect1_1.add(label_6);

		JLabel label_7 = new JLabel("Observaci\u00F3n/Referencia");
		label_7.setBounds(267, 1, 143, 14);
		label_7.setFont(new Font("Arial", Font.BOLD, 11));
		pnlCompArquitect1_1.add(label_7);

		JPanel panel_15 = new JPanel();
		panel_15.setBounds(3, -49, 199, 50);
		pnlCompArquitect1_1.add(panel_15);
		panel_15.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel label_21 = new JLabel(
				"<html><body><p align='right'>Kit para conexión de tubería 75 mm. (lija pliego, polipega 1/4gal,1codo 90°)</p></body></html>");
		label_21.setHorizontalAlignment(SwingConstants.RIGHT);
		label_21.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_15.add(label_21);

		JPanel panel_20 = new JPanel();
		panel_20.setBounds(3, 95, 199, 50);
		pnlCompArquitect1_1.add(panel_20);
		panel_20.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel label = new JLabel(
				"<html><body><p align='right'>Ventana corredera, compuesta por tres hojas y dos carriles. UPVC con vidrio flotado de 3 mm de 3x1,10</p></body></html>");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_20.add(label);

		JPanel panel = new JPanel();
		panel.setBounds(3, 145, 199, 50);
		pnlCompArquitect1_1.add(panel);
		panel.setLayout(new GridLayout(2, 0, 0, 0));

		JLabel label_9 = new JLabel(
				"<html><body><p align='right'>Perfil SF Tipo 12 MA-SF-12 para ventana</p></body></html>");
		label_9.setFont(new Font("Arial", Font.PLAIN, 10));
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(label_9);

		JLabel label_10 = new JLabel("<html><body><p align='right'>Paneles TCB (8.8x5.8 m)</p></body></html>");
		label_10.setHorizontalAlignment(SwingConstants.RIGHT);
		label_10.setFont(new Font("Arial", Font.PLAIN, 10));
		panel.add(label_10);

		JPanel panel_23 = new JPanel();
		panel_23.setBounds(210, 103, 55, 29);
		pnlCompArquitect1_1.add(panel_23);
		panel_23.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad120 = new JTextField();
		txtCantidad120.setText("6");
		txtCantidad120.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad120.setEditable(false);
		txtCantidad120.setColumns(10);
		panel_23.add(txtCantidad120);

		txtCantidad121 = new JTextField();
		txtCantidad121.setColumns(10);
		panel_23.add(txtCantidad121);
		validarDigitos(txtCantidad121);

		JPanel panel_24 = new JPanel();
		panel_24.setBounds(267, 103, 143, 29);
		pnlCompArquitect1_1.add(panel_24);
		panel_24.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs12 = new JTextField();
		txtObs12.setColumns(10);
		panel_24.add(txtObs12);

		JPanel panel_21 = new JPanel();
		panel_21.setBounds(210, 145, 55, 50);
		pnlCompArquitect1_1.add(panel_21);
		panel_21.setLayout(new GridLayout(2, 2, 0, 0));

		txtCantidad130 = new JTextField();
		txtCantidad130.setText("12");
		txtCantidad130.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad130.setEditable(false);
		txtCantidad130.setColumns(10);
		panel_21.add(txtCantidad130);

		txtCantidad131 = new JTextField();
		txtCantidad131.setColumns(10);
		panel_21.add(txtCantidad131);
		validarDigitos(txtCantidad131);

		txtCantidad140 = new JTextField();
		txtCantidad140.setText("1");
		txtCantidad140.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad140.setEditable(false);
		txtCantidad140.setColumns(10);
		panel_21.add(txtCantidad140);

		txtCantidad141 = new JTextField();
		txtCantidad141.setColumns(10);
		panel_21.add(txtCantidad141);
		validarDigitos(txtCantidad141);

		JPanel panel_22 = new JPanel();
		panel_22.setBounds(267, 145, 143, 50);
		pnlCompArquitect1_1.add(panel_22);
		panel_22.setLayout(new GridLayout(2, 0, 0, 0));

		txtObs13 = new JTextField();
		txtObs13.setColumns(10);
		panel_22.add(txtObs13);

		txtObs14 = new JTextField();
		txtObs14.setColumns(10);
		panel_22.add(txtObs14);

		JPanel pnlCompArquitect1_2 = new JPanel();
		pnlCompArquitect1_2.setLayout(null);
		pnlCompArquitect1_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlCompArquitect1_2.setBounds(434, 10, 414, 114);
		pnlPestaña1.add(pnlCompArquitect1_2);

		JPanel pnlBAEtiquetas = new JPanel();
		pnlBAEtiquetas.setBounds(3, 25, 199, 75);
		pnlCompArquitect1_2.add(pnlBAEtiquetas);
		pnlBAEtiquetas.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel lblKitCableadoBA = new JLabel(LBL_MT_15);
		lblKitCableadoBA.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKitCableadoBA.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlBAEtiquetas.add(lblKitCableadoBA);

		JLabel lblBATuberaPvc = new JLabel(LBL_MT_16);
		lblBATuberaPvc.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBATuberaPvc.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlBAEtiquetas.add(lblBATuberaPvc);

		JLabel lblBACajasConexion = new JLabel(LBL_MT_17);
		lblBACajasConexion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBACajasConexion.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlBAEtiquetas.add(lblBACajasConexion);

		JLabel lblKitBombaA = new JLabel("COMPONENTE ARQUITECT\u00D3NICO");
		lblKitBombaA.setFont(new Font("Arial", Font.BOLD, 11));
		lblKitBombaA.setBounds(3, 1, 176, 14);
		pnlCompArquitect1_2.add(lblKitBombaA);

		JLabel lblBACantidad = new JLabel("Cantidad");
		lblBACantidad.setBounds(210, 1, 55, 14);
		lblBACantidad.setFont(new Font("Arial", Font.BOLD, 11));
		pnlCompArquitect1_2.add(lblBACantidad);

		JLabel lblBAObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblBAObsRef.setBounds(267, 1, 143, 14);
		lblBAObsRef.setFont(new Font("Arial", Font.BOLD, 11));
		pnlCompArquitect1_2.add(lblBAObsRef);

		JPanel pnlBACantidad = new JPanel();
		pnlBACantidad.setBounds(210, 25, 55, 75);
		pnlCompArquitect1_2.add(pnlBACantidad);
		pnlBACantidad.setLayout(new GridLayout(3, 2, 0, 0));

		txtCantidad150 = new JTextField();
		txtCantidad150.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad150.setText(TXT_MT_15);
		txtCantidad150.setEditable(false);
		txtCantidad150.setColumns(10);
		pnlBACantidad.add(txtCantidad150);

		txtCantidad151 = new JTextField();
		txtCantidad151.setColumns(10);
		pnlBACantidad.add(txtCantidad151);
		validarDigitos(txtCantidad151);

		txtCantidad160 = new JTextField();
		txtCantidad160.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad160.setText(TXT_MT_16);
		txtCantidad160.setEditable(false);
		txtCantidad160.setColumns(10);
		pnlBACantidad.add(txtCantidad160);

		txtCantidad161 = new JTextField();
		txtCantidad161.setColumns(10);
		pnlBACantidad.add(txtCantidad161);
		validarDigitos(txtCantidad161);

		txtCantidad170 = new JTextField();
		txtCantidad170.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad170.setText(TXT_MT_17);
		txtCantidad170.setEditable(false);
		txtCantidad170.setColumns(10);
		pnlBACantidad.add(txtCantidad170);

		txtCantidad171 = new JTextField();
		txtCantidad171.setColumns(10);
		pnlBACantidad.add(txtCantidad171);
		validarDigitos(txtCantidad171);

		JPanel pnlBAObsRef = new JPanel();
		pnlBAObsRef.setBounds(267, 25, 143, 75);
		pnlCompArquitect1_2.add(pnlBAObsRef);
		pnlBAObsRef.setLayout(new GridLayout(3, 0, 0, 0));

		txtObs15 = new JTextField();
		txtObs15.setColumns(10);
		pnlBAObsRef.add(txtObs15);

		txtObs16 = new JTextField();
		txtObs16.setColumns(10);
		pnlBAObsRef.add(txtObs16);

		txtObs17 = new JTextField();
		txtObs17.setColumns(10);
		pnlBAObsRef.add(txtObs17);

		JPanel pnlFachadaFrontal = new JPanel();
		pnlFachadaFrontal.setLayout(null);
		pnlFachadaFrontal.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlFachadaFrontal.setBounds(434, 153, 414, 138);
		pnlPestaña1.add(pnlFachadaFrontal);

		JPanel pnlAEEtiquetas = new JPanel();
		pnlAEEtiquetas.setBounds(3, 25, 199, 100);
		pnlFachadaFrontal.add(pnlAEEtiquetas);
		pnlAEEtiquetas.setLayout(new GridLayout(4, 0, 0, 0));

		JLabel lblDadosCimentacionAXA = new JLabel(LBL_MT_18);
		lblDadosCimentacionAXA.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlAEEtiquetas.add(lblDadosCimentacionAXA);

		JLabel lblLuminariasLed = new JLabel(LBL_MT_19);
		lblLuminariasLed.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlAEEtiquetas.add(lblLuminariasLed);

		JLabel lblPostesSimples = new JLabel(LBL_MT_20);
		lblPostesSimples.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlAEEtiquetas.add(lblPostesSimples);

		JLabel lblAEKitCableadoElectrico = new JLabel(LBL_MT_21);
		lblAEKitCableadoElectrico.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlAEEtiquetas.add(lblAEKitCableadoElectrico);

		JLabel lblAEKitAlumbradoExterior = new JLabel("FACHADA FRONTAL");
		lblAEKitAlumbradoExterior.setFont(new Font("Arial", Font.BOLD, 11));
		lblAEKitAlumbradoExterior.setBounds(3, 1, 176, 14);
		pnlFachadaFrontal.add(lblAEKitAlumbradoExterior);

		JPanel pnlAECantidad = new JPanel();
		pnlAECantidad.setBounds(210, 25, 55, 100);
		pnlFachadaFrontal.add(pnlAECantidad);
		pnlAECantidad.setLayout(new GridLayout(4, 2, 0, 0));

		txtCantidad180 = new JTextField();
		txtCantidad180.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad180.setText(TXT_MT_18);
		txtCantidad180.setEditable(false);
		txtCantidad180.setColumns(10);
		pnlAECantidad.add(txtCantidad180);

		txtCantidad181 = new JTextField();
		txtCantidad181.setColumns(10);
		pnlAECantidad.add(txtCantidad181);
		validarDigitos(txtCantidad181);

		txtCantidad190 = new JTextField();
		txtCantidad190.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad190.setText(TXT_MT_19);
		txtCantidad190.setEditable(false);
		txtCantidad190.setColumns(10);
		pnlAECantidad.add(txtCantidad190);

		txtCantidad191 = new JTextField();
		txtCantidad191.setColumns(10);
		pnlAECantidad.add(txtCantidad191);
		validarDigitos(txtCantidad191);

		txtCantidad200 = new JTextField();
		txtCantidad200.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad200.setText(TXT_MT_20);
		txtCantidad200.setEditable(false);
		txtCantidad200.setColumns(10);
		pnlAECantidad.add(txtCantidad200);

		txtCantidad201 = new JTextField();
		txtCantidad201.setColumns(10);
		pnlAECantidad.add(txtCantidad201);
		validarDigitos(txtCantidad201);

		txtCantidad210 = new JTextField();
		txtCantidad210.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad210.setText(TXT_MT_21);
		txtCantidad210.setEditable(false);
		txtCantidad210.setColumns(10);
		pnlAECantidad.add(txtCantidad210);

		txtCantidad211 = new JTextField();
		txtCantidad211.setColumns(10);
		pnlAECantidad.add(txtCantidad211);
		validarDigitos(txtCantidad211);

		JPanel pnlAEObsRef = new JPanel();
		pnlAEObsRef.setBounds(267, 25, 143, 100);
		pnlFachadaFrontal.add(pnlAEObsRef);
		pnlAEObsRef.setLayout(new GridLayout(4, 0, 0, 0));

		txtObs18 = new JTextField();
		txtObs18.setColumns(10);
		pnlAEObsRef.add(txtObs18);

		txtObs19 = new JTextField();
		txtObs19.setColumns(10);
		pnlAEObsRef.add(txtObs19);

		txtObs20 = new JTextField();
		txtObs20.setColumns(10);
		pnlAEObsRef.add(txtObs20);

		txtObs21 = new JTextField();
		txtObs21.setColumns(10);
		pnlAEObsRef.add(txtObs21);

		JLabel lblAECantidad = new JLabel("Cantidad");
		lblAECantidad.setBounds(210, 1, 55, 14);
		lblAECantidad.setFont(new Font("Arial", Font.BOLD, 11));
		pnlFachadaFrontal.add(lblAECantidad);

		JLabel lblAEObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblAEObsRef.setBounds(267, 1, 143, 14);
		lblAEObsRef.setFont(new Font("Arial", Font.BOLD, 11));
		pnlFachadaFrontal.add(lblAEObsRef);

		JPanel pnlFachadaPosterior = new JPanel();
		pnlFachadaPosterior.setLayout(null);
		pnlFachadaPosterior.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlFachadaPosterior.setBounds(434, 332, 414, 109);
		pnlPestaña1.add(pnlFachadaPosterior);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(3, 23, 199, 75);
		pnlFachadaPosterior.add(panel_5);
		panel_5.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel lblLblmt = new JLabel(LBL_MT_22);
		lblLblmt.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_5.add(lblLblmt);

		JLabel lblLblmt_1 = new JLabel(LBL_MT_23);
		lblLblmt_1.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_5.add(lblLblmt_1);

		JLabel lblLblmt_2 = new JLabel(LBL_MT_24);
		lblLblmt_2.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_5.add(lblLblmt_2);

		JLabel lblFachadaPosterior = new JLabel("FACHADA POSTERIOR");
		lblFachadaPosterior.setFont(new Font("Arial", Font.BOLD, 11));
		lblFachadaPosterior.setBounds(3, 1, 176, 14);
		pnlFachadaPosterior.add(lblFachadaPosterior);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(210, 23, 55, 75);
		pnlFachadaPosterior.add(panel_6);
		panel_6.setLayout(new GridLayout(3, 2, 0, 0));

		txtCantidad220 = new JTextField();
		txtCantidad220.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad220.setText(TXT_MT_22);
		txtCantidad220.setEditable(false);
		txtCantidad220.setColumns(10);
		panel_6.add(txtCantidad220);

		txtCantidad221 = new JTextField();
		txtCantidad221.setColumns(10);
		panel_6.add(txtCantidad221);
		validarDigitos(txtCantidad221);

		txtCantidad230 = new JTextField();
		txtCantidad230.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad230.setText(TXT_MT_23);
		txtCantidad230.setEditable(false);
		txtCantidad230.setColumns(10);
		panel_6.add(txtCantidad230);

		txtCantidad231 = new JTextField();
		txtCantidad231.setColumns(10);
		panel_6.add(txtCantidad231);
		validarDigitos(txtCantidad231);

		txtCantidad240 = new JTextField();
		txtCantidad240.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad240.setText(TXT_MT_24);
		txtCantidad240.setEditable(false);
		txtCantidad240.setColumns(10);
		panel_6.add(txtCantidad240);

		txtCantidad241 = new JTextField();
		txtCantidad241.setColumns(10);
		panel_6.add(txtCantidad241);
		validarDigitos(txtCantidad241);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(267, 23, 143, 75);
		pnlFachadaPosterior.add(panel_7);
		panel_7.setLayout(new GridLayout(3, 0, 0, 0));

		txtObs22 = new JTextField();
		txtObs22.setColumns(10);
		panel_7.add(txtObs22);

		txtObs23 = new JTextField();
		txtObs23.setColumns(10);
		panel_7.add(txtObs23);

		txtObs24 = new JTextField();
		txtObs24.setColumns(10);
		panel_7.add(txtObs24);

		JLabel label_5 = new JLabel("Cantidad");
		label_5.setBounds(210, 1, 55, 14);
		label_5.setFont(new Font("Arial", Font.BOLD, 11));
		pnlFachadaPosterior.add(label_5);

		JLabel label_8 = new JLabel("Observaci\u00F3n/Referencia");
		label_8.setBounds(267, 1, 143, 14);
		label_8.setFont(new Font("Arial", Font.BOLD, 11));
		pnlFachadaPosterior.add(label_8);

		JPanel pnlFachadaLateral = new JPanel();
		pnlFachadaLateral.setLayout(null);
		pnlFachadaLateral.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlFachadaLateral.setBounds(434, 471, 414, 59);
		pnlPestaña1.add(pnlFachadaLateral);

		JPanel panel_9 = new JPanel();
		panel_9.setBounds(3, 17, 199, 30);
		pnlFachadaLateral.add(panel_9);
		panel_9.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblLblmt_3 = new JLabel(LBL_MT_25);
		lblLblmt_3.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_9.add(lblLblmt_3);

		JLabel lblFachadaLateral = new JLabel("FACHADA LATERAL");
		lblFachadaLateral.setFont(new Font("Arial", Font.BOLD, 11));
		lblFachadaLateral.setBounds(3, 1, 176, 14);
		pnlFachadaLateral.add(lblFachadaLateral);

		JPanel panel_10 = new JPanel();
		panel_10.setBounds(206, 22, 55, 25);
		pnlFachadaLateral.add(panel_10);
		panel_10.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad250 = new JTextField();
		txtCantidad250.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad250.setText(TXT_MT_25);
		txtCantidad250.setEditable(false);
		txtCantidad250.setColumns(10);
		panel_10.add(txtCantidad250);

		txtCantidad251 = new JTextField();
		txtCantidad251.setColumns(10);
		panel_10.add(txtCantidad251);
		validarDigitos(txtCantidad251);

		JPanel panel_11 = new JPanel();
		panel_11.setBounds(271, 22, 143, 25);
		pnlFachadaLateral.add(panel_11);
		panel_11.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs25 = new JTextField();
		txtObs25.setColumns(10);
		panel_11.add(txtObs25);

		JLabel label_13 = new JLabel("Cantidad");
		label_13.setBounds(210, 1, 55, 14);
		label_13.setFont(new Font("Arial", Font.BOLD, 11));
		pnlFachadaLateral.add(label_13);

		JLabel label_14 = new JLabel("Observaci\u00F3n/Referencia");
		label_14.setBounds(267, 1, 143, 14);
		label_14.setFont(new Font("Arial", Font.BOLD, 11));
		pnlFachadaLateral.add(label_14);

		JPanel pnlComponenteEst = new JPanel();
		pnlComponenteEst.setLayout(null);
		pnlComponenteEst.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlComponenteEst.setBounds(858, 11, 414, 297);
		pnlPestaña1.add(pnlComponenteEst);

		JPanel pnlTEtiquetas = new JPanel();
		pnlTEtiquetas.setBounds(3, 17, 199, 269);
		pnlComponenteEst.add(pnlTEtiquetas);
		pnlTEtiquetas.setLayout(new GridLayout(12, 0, 0, 0));

		JLabel lblTKitCableadoTR = new JLabel(LBL_MT_26);
		lblTKitCableadoTR.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTKitCableadoTR.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlTEtiquetas.add(lblTKitCableadoTR);

		JLabel lbl_pst_datos_cim = new JLabel(LBL_MT_27);
		lbl_pst_datos_cim.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pst_datos_cim.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlTEtiquetas.add(lbl_pst_datos_cim);

		JLabel lbl_pst2 = new JLabel(LBL_MT_28);
		lbl_pst2.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pst2.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlTEtiquetas.add(lbl_pst2);

		JLabel lbl_pst3 = new JLabel(LBL_MT_29);
		lbl_pst3.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pst3.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlTEtiquetas.add(lbl_pst3);

		JLabel lbl_pst4 = new JLabel(LBL_MT_30);
		lbl_pst4.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pst4.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlTEtiquetas.add(lbl_pst4);

		JLabel lbl_pst5 = new JLabel(LBL_MT_31);
		lbl_pst5.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pst5.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlTEtiquetas.add(lbl_pst5);

		JLabel lbl_pst6 = new JLabel(LBL_MT_32);
		lbl_pst6.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pst6.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlTEtiquetas.add(lbl_pst6);

		JLabel lbl_pst7 = new JLabel(LBL_MT_33);
		lbl_pst7.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pst7.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlTEtiquetas.add(lbl_pst7);

		JLabel lbl_pst8 = new JLabel(LBL_MT_34);
		lbl_pst8.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pst8.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlTEtiquetas.add(lbl_pst8);

		JLabel lbl_pst9 = new JLabel(LBL_MT_35);
		lbl_pst9.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pst9.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlTEtiquetas.add(lbl_pst9);

		JLabel lbl_pst10 = new JLabel(LBL_MT_36);
		lbl_pst10.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pst10.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlTEtiquetas.add(lbl_pst10);

		JLabel lbl_pst11 = new JLabel(LBL_MT_37);
		lbl_pst11.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pst11.setFont(new Font("Arial", Font.PLAIN, 10));
		pnlTEtiquetas.add(lbl_pst11);

		JLabel lblTKitTransformador = new JLabel("COMPONENTE ESTRUCTURAL");
		lblTKitTransformador.setFont(new Font("Arial", Font.BOLD, 11));
		lblTKitTransformador.setBounds(3, 1, 176, 14);
		pnlComponenteEst.add(lblTKitTransformador);

		JPanel pnlTCantidad = new JPanel();
		pnlTCantidad.setBounds(210, 17, 55, 269);
		pnlComponenteEst.add(pnlTCantidad);
		pnlTCantidad.setLayout(new GridLayout(12, 2, 0, 0));

		txtCantidad260 = new JTextField();
		txtCantidad260.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad260.setText(TXT_MT_26);
		txtCantidad260.setEditable(false);
		txtCantidad260.setColumns(10);
		pnlTCantidad.add(txtCantidad260);

		txtCantidad261 = new JTextField();
		txtCantidad261.setColumns(10);
		pnlTCantidad.add(txtCantidad261);
		validarDigitos(txtCantidad261);

		txtCantidad270 = new JTextField();
		txtCantidad270.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad270.setText(TXT_MT_27);
		txtCantidad270.setEditable(false);
		txtCantidad270.setColumns(10);
		pnlTCantidad.add(txtCantidad270);

		txtCantidad271 = new JTextField();
		txtCantidad271.setColumns(10);
		pnlTCantidad.add(txtCantidad271);
		validarDigitos(txtCantidad271);

		txtCantidad280 = new JTextField();
		txtCantidad280.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad280.setText(TXT_MT_28);
		txtCantidad280.setEditable(false);
		txtCantidad280.setColumns(10);
		pnlTCantidad.add(txtCantidad280);

		txtCantidad281 = new JTextField();
		txtCantidad281.setColumns(10);
		pnlTCantidad.add(txtCantidad281);
		validarDigitos(txtCantidad281);

		txtCantidad290 = new JTextField();
		txtCantidad290.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad290.setText(TXT_MT_29);
		txtCantidad290.setEditable(false);
		txtCantidad290.setColumns(10);
		pnlTCantidad.add(txtCantidad290);

		txtCantidad291 = new JTextField();
		txtCantidad291.setColumns(10);
		pnlTCantidad.add(txtCantidad291);
		validarDigitos(txtCantidad291);

		txtCantidad300 = new JTextField();
		txtCantidad300.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad300.setText(TXT_MT_30);
		txtCantidad300.setEditable(false);
		txtCantidad300.setColumns(10);
		pnlTCantidad.add(txtCantidad300);

		txtCantidad301 = new JTextField();
		txtCantidad301.setColumns(10);
		pnlTCantidad.add(txtCantidad301);
		validarDigitos(txtCantidad301);

		txtCantidad310 = new JTextField();
		txtCantidad310.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad310.setText(TXT_MT_31);
		txtCantidad310.setEditable(false);
		txtCantidad310.setColumns(10);
		pnlTCantidad.add(txtCantidad310);

		txtCantidad311 = new JTextField();
		txtCantidad311.setColumns(10);
		pnlTCantidad.add(txtCantidad311);
		validarDigitos(txtCantidad311);

		txtCantidad320 = new JTextField();
		txtCantidad320.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad320.setText(TXT_MT_32);
		txtCantidad320.setEditable(false);
		txtCantidad320.setColumns(10);
		pnlTCantidad.add(txtCantidad320);

		txtCantidad321 = new JTextField();
		txtCantidad321.setColumns(10);
		pnlTCantidad.add(txtCantidad321);
		validarDigitos(txtCantidad321);

		txtCantidad330 = new JTextField();
		txtCantidad330.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad330.setText(TXT_MT_33);
		txtCantidad330.setEditable(false);
		txtCantidad330.setColumns(10);
		pnlTCantidad.add(txtCantidad330);

		txtCantidad331 = new JTextField();
		txtCantidad331.setColumns(10);
		pnlTCantidad.add(txtCantidad331);
		validarDigitos(txtCantidad331);

		txtCantidad340 = new JTextField();
		txtCantidad340.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad340.setText(TXT_MT_34);
		txtCantidad340.setEditable(false);
		txtCantidad340.setColumns(10);
		pnlTCantidad.add(txtCantidad340);

		txtCantidad341 = new JTextField();
		txtCantidad341.setColumns(10);
		pnlTCantidad.add(txtCantidad341);
		validarDigitos(txtCantidad341);

		txtCantidad350 = new JTextField();
		txtCantidad350.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad350.setText(TXT_MT_35);
		txtCantidad350.setEditable(false);
		txtCantidad350.setColumns(10);
		pnlTCantidad.add(txtCantidad350);

		txtCantidad351 = new JTextField();
		txtCantidad351.setColumns(10);
		pnlTCantidad.add(txtCantidad351);
		validarDigitos(txtCantidad351);

		txtCantidad360 = new JTextField();
		txtCantidad360.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad360.setText(TXT_MT_36);
		txtCantidad360.setEditable(false);
		txtCantidad360.setColumns(10);
		pnlTCantidad.add(txtCantidad360);

		txtCantidad361 = new JTextField();
		txtCantidad361.setColumns(10);
		pnlTCantidad.add(txtCantidad361);
		validarDigitos(txtCantidad361);

		txtCantidad370 = new JTextField();
		txtCantidad370.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad370.setText(TXT_MT_37);
		txtCantidad370.setEditable(false);
		txtCantidad370.setColumns(10);
		pnlTCantidad.add(txtCantidad370);

		txtCantidad371 = new JTextField();
		txtCantidad371.setColumns(10);
		pnlTCantidad.add(txtCantidad371);
		validarDigitos(txtCantidad371);

		JPanel pnlTObsRef = new JPanel();
		pnlTObsRef.setBounds(267, 17, 143, 269);
		pnlComponenteEst.add(pnlTObsRef);
		pnlTObsRef.setLayout(new GridLayout(12, 0, 0, 0));

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

		txtObs30 = new JTextField();
		txtObs30.setColumns(10);
		pnlTObsRef.add(txtObs30);

		txtObs31 = new JTextField();
		txtObs31.setColumns(10);
		pnlTObsRef.add(txtObs31);

		txtObs32 = new JTextField();
		txtObs32.setColumns(10);
		pnlTObsRef.add(txtObs32);

		txtObs33 = new JTextField();
		txtObs33.setColumns(10);
		pnlTObsRef.add(txtObs33);

		txtObs34 = new JTextField();
		txtObs34.setColumns(10);
		pnlTObsRef.add(txtObs34);

		txtObs35 = new JTextField();
		txtObs35.setColumns(10);
		pnlTObsRef.add(txtObs35);

		txtObs36 = new JTextField();
		txtObs36.setColumns(10);
		pnlTObsRef.add(txtObs36);

		txtObs37 = new JTextField();
		txtObs37.setColumns(10);
		pnlTObsRef.add(txtObs37);

		JLabel lblTCantidad = new JLabel("Cantidad");
		lblTCantidad.setBounds(210, 1, 55, 14);
		lblTCantidad.setFont(new Font("Arial", Font.BOLD, 11));
		pnlComponenteEst.add(lblTCantidad);

		JLabel lblTObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblTObsRef.setBounds(267, 1, 143, 14);
		lblTObsRef.setFont(new Font("Arial", Font.BOLD, 11));
		pnlComponenteEst.add(lblTObsRef);

		setFichaNuevaUpdate();

		cabecera.getBtnRegistrar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TInformacionObligatoria infoObl = cargarInfoObligatoria(infoObligatoria);
				infoObl.setIoFotoPath(fotoInfoObl);
				if (validarInfo(infoObl)) {
					infoObl.setIoSerial(srvInfoObl.serialInfoOblMax());

					List<TdetalleFicha> detallesFicha = getRegistrosDetalle(infoObl);

					if (detallesFicha == null) {
						JOptionPane.showMessageDialog(null,
								"ERROR: Verificar que los registros no se encuentren VACÍOS", "Mensaje de Error",
								JOptionPane.ERROR_MESSAGE);
						return;
					}

					if (Validaciones.registrosValidados(detallesFicha)) {
						srvInfoObl.crear(infoObl);
						infoObl.setIoSerial(srvInfoObl.serialInfoOblMax());

						srvFicha.guardarFormulario(getRegistrosDetalle(infoObl));
						HashMap<String, Object> parametros = new HashMap<String, Object>();
						parametros.put("serial_cabecera", Utilitarios.gettCabecera().getCSerial());
						parametros.put("serial_ficha", ficha.getFiSerial());
						Reporte reporte = new Reporte("Reporte MT", 280, 10, 850, 750);
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

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				new Menu().setVisible(true);
				dispose();
			}
		});
	}

	private List<TdetalleFicha> getRegistrosDetalle(TInformacionObligatoria infoObligatoria) {

		ServicioCabecera srvCabecera = new ComponenteCabecera();

		TCabecera cabecera = srvCabecera.buscarProyecto(gettCabecera().getCNombreProyecto());
		Integer updateFicha = srvFicha.nActualizacionFicha(gettCabecera(), ficha);

		BigDecimal porcentajeAvance;

		if (updateFicha == -1) {
			updateFicha = 0;
		} else {
			updateFicha++;
		}

		List<TdetalleFicha> detallesFicha = new LinkedList<>();

		TGrupo grupo1 = srvFicha.buscarGrupo("Kit eléctrico");
		TGrupo grupo2 = srvFicha.buscarGrupo("Kit agua lluvia");
		TGrupo grupo3 = srvFicha.buscarGrupo("Componente arquitectónico");
		TGrupo grupo4 = srvFicha.buscarGrupo("Fachada frontal");
		TGrupo grupo5 = srvFicha.buscarGrupo("Fachada posterior");
		TGrupo grupo6 = srvFicha.buscarGrupo("Fachada lateral");
		TGrupo grupo7 = srvFicha.buscarGrupo("Componente estructural");

		try {
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad00.getText()),
					Integer.parseInt(txtCantidad01.getText()));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, quitarEtiquetasHTML(LBL_MT_0),
					Integer.parseInt(txtCantidad00.getText()), Integer.parseInt(txtCantidad01.getText()),
					txtObs0.getText(), updateFicha, porcentajeAvance, ITEM_MT_0, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad10.getText()),
					Integer.parseInt(txtCantidad11.getText()));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, quitarEtiquetasHTML(LBL_MT_1),
					Integer.parseInt(txtCantidad10.getText()), Integer.parseInt(txtCantidad11.getText()),
					txtObs1.getText(), updateFicha, porcentajeAvance, ITEM_MT_1, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad20.getText()),
					Integer.parseInt(txtCantidad21.getText()));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, quitarEtiquetasHTML(LBL_MT_2),
					Integer.parseInt(txtCantidad20.getText()), Integer.parseInt(txtCantidad21.getText()),
					txtObs2.getText(), updateFicha, porcentajeAvance, ITEM_MT_2, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad30.getText()),
					Integer.parseInt(txtCantidad31.getText()));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, quitarEtiquetasHTML(LBL_MT_3),
					Integer.parseInt(txtCantidad30.getText()), Integer.parseInt(txtCantidad31.getText()),
					txtObs3.getText(), updateFicha, porcentajeAvance, ITEM_MT_3, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad40.getText()),
					Integer.parseInt(txtCantidad41.getText()));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, quitarEtiquetasHTML(LBL_MT_4),
					Integer.parseInt(txtCantidad40.getText()), Integer.parseInt(txtCantidad41.getText()),
					txtObs4.getText(), updateFicha, porcentajeAvance, ITEM_MT_4, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad50.getText()),
					Integer.parseInt(txtCantidad51.getText()));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, quitarEtiquetasHTML(LBL_MT_5),
					Integer.parseInt(txtCantidad50.getText()), Integer.parseInt(txtCantidad51.getText()),
					txtObs5.getText(), updateFicha, porcentajeAvance, ITEM_MT_5, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad60.getText()),
					Integer.parseInt(txtCantidad61.getText()));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, quitarEtiquetasHTML(LBL_MT_6),
					Integer.parseInt(txtCantidad60.getText()), Integer.parseInt(txtCantidad61.getText()),
					txtObs6.getText(), updateFicha, porcentajeAvance, ITEM_MT_6, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad70.getText()),
					Integer.parseInt(txtCantidad71.getText()));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, quitarEtiquetasHTML(LBL_MT_7),
					Integer.parseInt(txtCantidad70.getText()), Integer.parseInt(txtCantidad71.getText()),
					txtObs7.getText(), updateFicha, porcentajeAvance, ITEM_MT_7, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad80.getText()),
					Integer.parseInt(txtCantidad81.getText()));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, quitarEtiquetasHTML(LBL_MT_8),
					Integer.parseInt(txtCantidad80.getText()), Integer.parseInt(txtCantidad81.getText()),
					txtObs8.getText(), updateFicha, porcentajeAvance, ITEM_MT_8, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad90.getText()),
					Integer.parseInt(txtCantidad91.getText()));
			detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo3, ficha, quitarEtiquetasHTML(LBL_MT_9),
					Integer.parseInt(txtCantidad90.getText()), Integer.parseInt(txtCantidad91.getText()),
					txtObs9.getText(), updateFicha, porcentajeAvance, ITEM_MT_9, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad100.getText()),
					Integer.parseInt(txtCantidad101.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo3, ficha, quitarEtiquetasHTML(LBL_MT_10),
							Integer.parseInt(txtCantidad100.getText()), Integer.parseInt(txtCantidad101.getText()),
							txtObs10.getText(), updateFicha, porcentajeAvance, ITEM_MT_10, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad110.getText()),
					Integer.parseInt(txtCantidad111.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo3, ficha, quitarEtiquetasHTML(LBL_MT_11),
							Integer.parseInt(txtCantidad110.getText()), Integer.parseInt(txtCantidad111.getText()),
							txtObs11.getText(), updateFicha, porcentajeAvance, ITEM_MT_11, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad120.getText()),
					Integer.parseInt(txtCantidad121.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo3, ficha, quitarEtiquetasHTML(LBL_MT_12),
							Integer.parseInt(txtCantidad120.getText()), Integer.parseInt(txtCantidad121.getText()),
							txtObs12.getText(), updateFicha, porcentajeAvance, ITEM_MT_12, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad130.getText()),
					Integer.parseInt(txtCantidad131.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo3, ficha, quitarEtiquetasHTML(LBL_MT_13),
							Integer.parseInt(txtCantidad130.getText()), Integer.parseInt(txtCantidad131.getText()),
							txtObs13.getText(), updateFicha, porcentajeAvance, ITEM_MT_13, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad140.getText()),
					Integer.parseInt(txtCantidad141.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo3, ficha, quitarEtiquetasHTML(LBL_MT_14),
							Integer.parseInt(txtCantidad140.getText()), Integer.parseInt(txtCantidad141.getText()),
							txtObs14.getText(), updateFicha, porcentajeAvance, ITEM_MT_14, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad150.getText()),
					Integer.parseInt(txtCantidad151.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo3, ficha, quitarEtiquetasHTML(LBL_MT_15),
							Integer.parseInt(txtCantidad150.getText()), Integer.parseInt(txtCantidad151.getText()),
							txtObs15.getText(), updateFicha, porcentajeAvance, ITEM_MT_15, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad160.getText()),
					Integer.parseInt(txtCantidad161.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo3, ficha, quitarEtiquetasHTML(LBL_MT_16),
							Integer.parseInt(txtCantidad160.getText()), Integer.parseInt(txtCantidad161.getText()),
							txtObs16.getText(), updateFicha, porcentajeAvance, ITEM_MT_16, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad170.getText()),
					Integer.parseInt(txtCantidad171.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo3, ficha, quitarEtiquetasHTML(LBL_MT_17),
							Integer.parseInt(txtCantidad170.getText()), Integer.parseInt(txtCantidad171.getText()),
							txtObs17.getText(), updateFicha, porcentajeAvance, ITEM_MT_17, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad180.getText()),
					Integer.parseInt(txtCantidad181.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo4, ficha, quitarEtiquetasHTML(LBL_MT_18),
							Integer.parseInt(txtCantidad180.getText()), Integer.parseInt(txtCantidad181.getText()),
							txtObs18.getText(), updateFicha, porcentajeAvance, ITEM_MT_18, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad190.getText()),
					Integer.parseInt(txtCantidad191.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo4, ficha, quitarEtiquetasHTML(LBL_MT_19),
							Integer.parseInt(txtCantidad190.getText()), Integer.parseInt(txtCantidad191.getText()),
							txtObs19.getText(), updateFicha, porcentajeAvance, ITEM_MT_19, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad200.getText()),
					Integer.parseInt(txtCantidad201.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo4, ficha, quitarEtiquetasHTML(LBL_MT_20),
							Integer.parseInt(txtCantidad200.getText()), Integer.parseInt(txtCantidad201.getText()),
							txtObs20.getText(), updateFicha, porcentajeAvance, ITEM_MT_20, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad210.getText()),
					Integer.parseInt(txtCantidad211.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo4, ficha, quitarEtiquetasHTML(LBL_MT_21),
							Integer.parseInt(txtCantidad210.getText()), Integer.parseInt(txtCantidad211.getText()),
							txtObs21.getText(), updateFicha, porcentajeAvance, ITEM_MT_21, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad220.getText()),
					Integer.parseInt(txtCantidad221.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo5, ficha, quitarEtiquetasHTML(LBL_MT_22),
							Integer.parseInt(txtCantidad220.getText()), Integer.parseInt(txtCantidad221.getText()),
							txtObs22.getText(), updateFicha, porcentajeAvance, ITEM_MT_22, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad230.getText()),
					Integer.parseInt(txtCantidad231.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo5, ficha, quitarEtiquetasHTML(LBL_MT_23),
							Integer.parseInt(txtCantidad230.getText()), Integer.parseInt(txtCantidad231.getText()),
							txtObs23.getText(), updateFicha, porcentajeAvance, ITEM_MT_23, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad240.getText()),
					Integer.parseInt(txtCantidad241.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo5, ficha, quitarEtiquetasHTML(LBL_MT_24),
							Integer.parseInt(txtCantidad240.getText()), Integer.parseInt(txtCantidad241.getText()),
							txtObs24.getText(), updateFicha, porcentajeAvance, ITEM_MT_24, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad250.getText()),
					Integer.parseInt(txtCantidad251.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo6, ficha, quitarEtiquetasHTML(LBL_MT_25),
							Integer.parseInt(txtCantidad250.getText()), Integer.parseInt(txtCantidad251.getText()),
							txtObs25.getText(), updateFicha, porcentajeAvance, ITEM_MT_25, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad260.getText()),
					Integer.parseInt(txtCantidad261.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo7, ficha, quitarEtiquetasHTML(LBL_MT_26),
							Integer.parseInt(txtCantidad260.getText()), Integer.parseInt(txtCantidad261.getText()),
							txtObs26.getText(), updateFicha, porcentajeAvance, ITEM_MT_26, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad270.getText()),
					Integer.parseInt(txtCantidad271.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo7, ficha, quitarEtiquetasHTML(LBL_MT_27),
							Integer.parseInt(txtCantidad270.getText()), Integer.parseInt(txtCantidad271.getText()),
							txtObs27.getText(), updateFicha, porcentajeAvance, ITEM_MT_27, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad280.getText()),
					Integer.parseInt(txtCantidad281.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo7, ficha, quitarEtiquetasHTML(LBL_MT_28),
							Integer.parseInt(txtCantidad280.getText()), Integer.parseInt(txtCantidad281.getText()),
							txtObs28.getText(), updateFicha, porcentajeAvance, ITEM_MT_28, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad290.getText()),
					Integer.parseInt(txtCantidad291.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo7, ficha, quitarEtiquetasHTML(LBL_MT_29),
							Integer.parseInt(txtCantidad290.getText()), Integer.parseInt(txtCantidad291.getText()),
							txtObs29.getText(), updateFicha, porcentajeAvance, ITEM_MT_29, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad300.getText()),
					Integer.parseInt(txtCantidad301.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo7, ficha, quitarEtiquetasHTML(LBL_MT_30),
							Integer.parseInt(txtCantidad300.getText()), Integer.parseInt(txtCantidad301.getText()),
							txtObs30.getText(), updateFicha, porcentajeAvance, ITEM_MT_30, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad310.getText()),
					Integer.parseInt(txtCantidad311.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo7, ficha, quitarEtiquetasHTML(LBL_MT_31),
							Integer.parseInt(txtCantidad310.getText()), Integer.parseInt(txtCantidad311.getText()),
							txtObs31.getText(), updateFicha, porcentajeAvance, ITEM_MT_31, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad320.getText()),
					Integer.parseInt(txtCantidad321.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo7, ficha, quitarEtiquetasHTML(LBL_MT_32),
							Integer.parseInt(txtCantidad320.getText()), Integer.parseInt(txtCantidad321.getText()),
							txtObs32.getText(), updateFicha, porcentajeAvance, ITEM_MT_32, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad330.getText()),
					Integer.parseInt(txtCantidad331.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo7, ficha, quitarEtiquetasHTML(LBL_MT_33),
							Integer.parseInt(txtCantidad330.getText()), Integer.parseInt(txtCantidad331.getText()),
							txtObs33.getText(), updateFicha, porcentajeAvance, ITEM_MT_33, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad340.getText()),
					Integer.parseInt(txtCantidad341.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo7, ficha, quitarEtiquetasHTML(LBL_MT_34),
							Integer.parseInt(txtCantidad340.getText()), Integer.parseInt(txtCantidad341.getText()),
							txtObs34.getText(), updateFicha, porcentajeAvance, ITEM_MT_34, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad350.getText()),
					Integer.parseInt(txtCantidad351.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo7, ficha, quitarEtiquetasHTML(LBL_MT_35),
							Integer.parseInt(txtCantidad350.getText()), Integer.parseInt(txtCantidad351.getText()),
							txtObs35.getText(), updateFicha, porcentajeAvance, ITEM_MT_35, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad360.getText()),
					Integer.parseInt(txtCantidad361.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo7, ficha, quitarEtiquetasHTML(LBL_MT_36),
							Integer.parseInt(txtCantidad360.getText()), Integer.parseInt(txtCantidad361.getText()),
							txtObs36.getText(), updateFicha, porcentajeAvance, ITEM_MT_36, "UNIDAD"));
			porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad370.getText()),
					Integer.parseInt(txtCantidad371.getText()));
			detallesFicha
					.add(new TdetalleFicha(cabecera, infoObligatoria, grupo7, ficha, quitarEtiquetasHTML(LBL_MT_37),
							Integer.parseInt(txtCantidad370.getText()), Integer.parseInt(txtCantidad371.getText()),
							txtObs37.getText(), updateFicha, porcentajeAvance, ITEM_MT_37, "UNIDAD"));
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
		return detallesFicha;
	}

	public void setFichaNuevaUpdate() {

		List<TdetalleFicha> listaDetalles = srvFicha.detallesFicha(gettCabecera(), ficha);
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

		} catch (IndexOutOfBoundsException e) {
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

		}
	}
}
