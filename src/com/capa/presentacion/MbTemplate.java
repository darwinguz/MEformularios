package com.capa.presentacion;

import static com.capa.negocios.Calculos.calcularPorcentajeAvance;
import static com.capa.util.Utilitarios.*;
import static com.capa.util.Validaciones.*;
import static com.capa.util.Constantes.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
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

import javax.swing.JLabel;
import javax.swing.JOptionPane;

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

import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MbTemplate extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4766220032119752524L;
	private JPanel contentPane;
	private JTextField txtCantidad70;
	private JTextField txtCantidad71;
	private JTextField txtCantidad80;
	private JTextField txtCantidad81;
	private JTextField txtCantidad90;
	private JTextField txtCantidad91;
	private JTextField txtCantidad50;
	private JTextField txtCantidad51;
	private JTextField txtCantidad60;
	private JTextField txtCantidad61;
	private JTextField txtObs7;
	private JTextField txtObs8;
	private JTextField txtObs9;
	private JTextField txtObs5;
	private JTextField txtObs6;
	private JTextField txtCantidad230;
	private JTextField txtCantidad231;
	private JTextField txtCantida240;
	private JTextField txtCantidad241;
	private JTextField txtCantidad250;
	private JTextField txtCantidad251;
	private JTextField txtObs23;
	private JTextField txtObs24;
	private JTextField txtObs25;
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
	private JTextField txtObs0;
	private JTextField txtObs1;
	private JTextField txtObs2;
	private JTextField txtObs3;
	private JTextField txtObs4;
	private JTextField txtCantidad140;
	private JTextField txtCantidad141;
	private JTextField txtObs10;
	private JTextField txtObs11;
	private JTextField txtObs12;
	private JTextField txtObs13;
	private JPanel panel_48;
	private JTextField txtCantidad100;
	private JTextField txtCantidad101;
	private JTextField txtCantidad110;
	private JTextField txtCantidad111;
	private JTextField txtCantidad120;
	private JTextField txtCantidad121;
	private JTextField txtCantidad130;
	private JTextField txtCantidad131;
	private JTextField txtObs14;
	private JPanel panel_15;
	private JPanel panel_16;
	private JLabel lblPanelesTcbxmts;
	private JLabel lblPanelesVinilPiso;
	private JLabel lblPanelesEpsPara;
	private JLabel lblComponenteArquitectnico_1;
	private JPanel panel_17;
	private JTextField txtCantidad150;
	private JTextField txtCantidad151;
	private JTextField txtCantidad160;
	private JTextField txtCantidad161;
	private JTextField txtCantidad170;
	private JTextField txtCantidad180;
	private JPanel panel_18;
	private JTextField txtObs15;
	private JTextField txtObs16;
	private JTextField txtObs18;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel lblPerfilSfTipo_2;
	private JTextField txtCantidad171;
	private JTextField txtCantidad181;
	private JTextField txtObs17;
	private JPanel panel_19;
	private JPanel panel_20;
	private JLabel lblPanelesEpsPared;
	private JLabel lblPanelesEpsPared_1;
	private JLabel lblPanelesEpsPared_2;
	private JLabel lblPanelesEpsPared_3;
	private JLabel lblComponenteArquitectnico_2;
	private JPanel panel_21;
	private JTextField txtCantidad190;
	private JTextField txtCantidad191;
	private JTextField txtCantidad200;
	private JTextField txtCantidad201;
	private JTextField txtCantidad210;
	private JTextField txtCantidad211;
	private JTextField txtCantidad220;
	private JTextField txtCantidad221;
	private JPanel panel_22;
	private JTextField txtObs19;
	private JTextField txtObs20;
	private JTextField txtObs21;
	private JTextField txtObs22;
	private JLabel label_24;
	private JLabel label_25;
	private JPanel panel_23;
	private JPanel panel_24;
	private JLabel lblDadosCimentacin;
	private JLabel lblPerfilSfTipo_3;
	private JLabel lblPerfilSfTipo_4;
	private JLabel lblPerfilSfTipo_5;
	private JLabel lblPerfilSfTipo_6;
	private JLabel lblPerfilSfTipo_7;
	private JLabel lblPerfilSfTipo_8;
	private JLabel lblPerfilSfTipo_9;
	private JLabel lblPerfilSfTipo_10;
	private JLabel lblComponenteEstructural;
	private JPanel panel_29;
	private JTextField txtCantidad270;
	private JTextField txtCantidad271;
	private JTextField txtCantidad280;
	private JTextField txtCantidad281;
	private JTextField txtCantidad290;
	private JTextField txtCantidad291;
	private JTextField txtCantidad300;
	private JTextField txtCantidad301;
	private JTextField txtCantidad310;
	private JTextField txtCantidad311;
	private JTextField txtCantidad320;
	private JTextField txtCantidad321;
	private JTextField txtCantidad330;
	private JTextField txtCantidad331;
	private JTextField txtCantidad340;
	private JTextField txtCantidad341;
	private JTextField txtCantidad350;
	private JTextField txtCantidad351;
	private JPanel panel_30;
	private JTextField txtObs27;
	private JTextField txtObs28;
	private JTextField txtObs29;
	private JTextField txtObs30;
	private JTextField txtObs31;
	private JTextField txtObs32;
	private JTextField txtObs33;
	private JTextField txtObs34;
	private JTextField txtObs35;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel lblPerfilSfTipo_11;
	private JLabel lblPerfilSfTipo_12;
	private JLabel lblPerfilSfTipo_13;
	private JTextField txtCantidad360;
	private JTextField txtCantidad361;
	private JTextField txtCantidad370;
	private JTextField txtCantidad371;
	private JTextField txtCantidad380;
	private JTextField txtCantidad381;
	private JTextField txtObs37;
	private JTextField txtObs36;
	private JTextField txtObs38;
	private JTextField txtCantidad260;
	private JTextField txtCantidad261;
	private JTextField txtObs26;

	TInformacionObligatoria infor;
	TFicha ficha;
	ServicioFicha servFicha;

	private String fotoInfoObl;

	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// MbTemplate frame = new MbTemplate();
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
	public MbTemplate(TFicha ficha) {
		this.ficha = ficha;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1320, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		servFicha = new ComponenteFicha();

		JPcabecera pnlCabecera = new JPcabecera();
		contentPane.add(pnlCabecera.getCabecera());
		setContentPane(contentPane);
		contentPane.setLayout(null);

		llenarCabecera(pnlCabecera);

		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setTitle(Utilitarios.getNombreFicha() + ficha.getFiNombre());

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 126, 1286, 586);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		tabbedPane.addTab("1.-MB Biblioteca", null, panel, null);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 161, 414, 178);
		panel.add(panel_1);

		JLabel lblKitAguaLluvia = new JLabel("KIT AGUA LLUVIA");
		lblKitAguaLluvia.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKitAguaLluvia.setBounds(3, 1, 176, 14);
		panel_1.add(lblKitAguaLluvia);

		JLabel label_1 = new JLabel("Cantidad");
		label_1.setBounds(210, 1, 55, 14);
		panel_1.add(label_1);

		JLabel label_2 = new JLabel("Observaci\u00F3n/Referencia");
		label_2.setBounds(267, 1, 143, 14);
		panel_1.add(label_2);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(210, 17, 56, 156);
		panel_1.add(panel_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 82, 55, 74);
		panel_2.add(panel_3);
		panel_3.setLayout(new GridLayout(3, 2, 0, 0));

		txtCantidad70 = new JTextField();
		txtCantidad70.setText("2");
		txtCantidad70.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad70.setEditable(false);
		txtCantidad70.setColumns(10);
		panel_3.add(txtCantidad70);

		txtCantidad71 = new JTextField();
		txtCantidad71.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad71.setColumns(10);
		panel_3.add(txtCantidad71);
		validarDigitos(txtCantidad71);

		txtCantidad80 = new JTextField();
		txtCantidad80.setText("1");
		txtCantidad80.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad80.setEditable(false);
		txtCantidad80.setColumns(10);
		panel_3.add(txtCantidad80);

		txtCantidad81 = new JTextField();
		txtCantidad81.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad81.setColumns(10);
		panel_3.add(txtCantidad81);
		validarDigitos(txtCantidad81);

		txtCantidad90 = new JTextField();
		txtCantidad90.setText("1");
		txtCantidad90.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad90.setEditable(false);
		txtCantidad90.setColumns(10);
		panel_3.add(txtCantidad90);

		txtCantidad91 = new JTextField();
		txtCantidad91.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad91.setColumns(10);
		panel_3.add(txtCantidad91);
		validarDigitos(txtCantidad91);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 11, 55, 62);
		panel_2.add(panel_4);
		panel_4.setLayout(new GridLayout(2, 2, 0, 12));

		txtCantidad50 = new JTextField();
		txtCantidad50.setText("3");
		txtCantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad50.setEditable(false);
		txtCantidad50.setColumns(10);
		panel_4.add(txtCantidad50);

		txtCantidad51 = new JTextField();
		txtCantidad51.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad51.setColumns(10);
		panel_4.add(txtCantidad51);
		validarDigitos(txtCantidad51);

		txtCantidad60 = new JTextField();
		txtCantidad60.setText("2");
		txtCantidad60.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad60.setEditable(false);
		txtCantidad60.setColumns(10);
		panel_4.add(txtCantidad60);

		txtCantidad61 = new JTextField();
		txtCantidad61.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad61.setColumns(10);
		panel_4.add(txtCantidad61);
		validarDigitos(txtCantidad61);

		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(267, 17, 143, 156);
		panel_1.add(panel_5);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 82, 143, 74);
		panel_5.add(panel_6);
		panel_6.setLayout(new GridLayout(3, 0, 0, 0));

		txtObs7 = new JTextField();
		txtObs7.setColumns(10);
		panel_6.add(txtObs7);

		txtObs8 = new JTextField();
		txtObs8.setColumns(10);
		panel_6.add(txtObs8);

		txtObs9 = new JTextField();
		txtObs9.setColumns(10);
		panel_6.add(txtObs9);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(0, 11, 143, 62);
		panel_5.add(panel_7);
		panel_7.setLayout(new GridLayout(2, 0, 0, 12));

		txtObs5 = new JTextField();
		txtObs5.setColumns(10);
		panel_7.add(txtObs5);

		txtObs6 = new JTextField();
		txtObs6.setColumns(10);
		panel_7.add(txtObs6);

		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBounds(3, 17, 199, 156);
		panel_1.add(panel_8);

		JPanel panel_9 = new JPanel();
		panel_9.setBounds(0, 78, 199, 78);
		panel_8.add(panel_9);

		JLabel lblTuberaDePvc = new JLabel("Tuber\u00EDa de PVC 75 mm L=3m");
		lblTuberaDePvc.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JLabel lblTuberaDePvc_1 = new JLabel("Tuber\u00EDa de PVC 75 mm L=0.6m");
		lblTuberaDePvc_1.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JLabel lblKitParaConexin = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 75 mm. (lija pliego, polipega 1/4gal,1codo 90\u00B0)</body></html>");
		lblKitParaConexin.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_9.setLayout(new GridLayout(0, 1, 0, 0));
		panel_9.add(lblTuberaDePvc);
		panel_9.add(lblTuberaDePvc_1);
		panel_9.add(lblKitParaConexin);

		JPanel panel_10 = new JPanel();
		panel_10.setBounds(0, 0, 199, 80);
		panel_8.add(panel_10);
		panel_10.setLayout(new GridLayout(2, 1, 0, 0));

		JLabel lblCanalPlsticoPvc = new JLabel("Canal Pl\u00E1stico PVC de L=3m");
		lblCanalPlsticoPvc.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_10.add(lblCanalPlsticoPvc);

		JLabel lblKitDeAccesorios = new JLabel(
				"<html><body>Kit de Accesorios de Conexi\u00F3n Agua de Lluvia (2 rejilla,2 codos 90\u00B0,1/4 gl polipega, tornillos, abrazaderas)</body></html>");
		lblKitDeAccesorios.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_10.add(lblKitDeAccesorios);

		JPanel panel_25 = new JPanel();
		panel_25.setLayout(null);
		panel_25.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_25.setBounds(10, 4, 414, 134);
		panel.add(panel_25);

		JPanel panel_26 = new JPanel();
		panel_26.setBounds(3, 17, 199, 113);
		panel_25.add(panel_26);
		panel_26.setLayout(new GridLayout(5, 0, 0, 0));

		JLabel lblLuminariasLed = new JLabel("Luminarias LED 60 w - 5000 lum");
		lblLuminariasLed.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_26.add(lblLuminariasLed);

		JLabel lblTomacorrientes = new JLabel("Tomacorrientes");
		lblTomacorrientes.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_26.add(lblTomacorrientes);

		JLabel lblInterruptor = new JLabel("Interruptor");
		lblInterruptor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_26.add(lblInterruptor);

		JLabel lblKitCableElctrico = new JLabel("Kit cable el\u00E9ctrico MA");
		lblKitCableElctrico.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_26.add(lblKitCableElctrico);

		JLabel lblDetectorDeHumo = new JLabel("Detector de humo");
		lblDetectorDeHumo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_26.add(lblDetectorDeHumo);

		JLabel lblKitElctrico = new JLabel("KIT EL\u00C9CTRICO");
		lblKitElctrico.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKitElctrico.setBounds(3, 1, 176, 14);
		panel_25.add(lblKitElctrico);

		JPanel panel_27 = new JPanel();
		panel_27.setBounds(210, 17, 55, 113);
		panel_25.add(panel_27);
		panel_27.setLayout(new GridLayout(5, 2, 0, 0));

		txtCantidad00 = new JTextField();
		txtCantidad00.setText("9");
		txtCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad00.setEditable(false);
		txtCantidad00.setColumns(10);
		panel_27.add(txtCantidad00);

		txtCantidad01 = new JTextField();
		txtCantidad01.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad01.setColumns(10);
		panel_27.add(txtCantidad01);
		validarDigitos(txtCantidad01);

		txtCantidad10 = new JTextField();
		txtCantidad10.setText("2");
		txtCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad10.setEditable(false);
		txtCantidad10.setColumns(10);
		panel_27.add(txtCantidad10);

		txtCantidad11 = new JTextField();
		txtCantidad11.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad11.setColumns(10);
		panel_27.add(txtCantidad11);
		validarDigitos(txtCantidad11);

		txtCantidad20 = new JTextField();
		txtCantidad20.setText("1");
		txtCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad20.setEditable(false);
		txtCantidad20.setColumns(10);
		panel_27.add(txtCantidad20);

		txtCantidad21 = new JTextField();
		txtCantidad21.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad21.setColumns(10);
		panel_27.add(txtCantidad21);
		validarDigitos(txtCantidad21);

		txtCantidad30 = new JTextField();
		txtCantidad30.setText("1");
		txtCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad30.setEditable(false);
		txtCantidad30.setColumns(10);
		panel_27.add(txtCantidad30);

		txtCantidad31 = new JTextField();
		txtCantidad31.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad31.setColumns(10);
		panel_27.add(txtCantidad31);
		validarDigitos(txtCantidad31);

		txtCantidad40 = new JTextField();
		txtCantidad40.setText("1");
		txtCantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad40.setEditable(false);
		txtCantidad40.setColumns(10);
		panel_27.add(txtCantidad40);

		txtCantidad41 = new JTextField();
		txtCantidad41.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad41.setColumns(10);
		panel_27.add(txtCantidad41);
		validarDigitos(txtCantidad41);

		JPanel panel_28 = new JPanel();
		panel_28.setBounds(267, 17, 143, 113);
		panel_25.add(panel_28);
		panel_28.setLayout(new GridLayout(5, 0, 0, 0));

		txtObs0 = new JTextField();
		txtObs0.setColumns(10);
		panel_28.add(txtObs0);

		txtObs1 = new JTextField();
		txtObs1.setColumns(10);
		panel_28.add(txtObs1);

		txtObs2 = new JTextField();
		txtObs2.setColumns(10);
		panel_28.add(txtObs2);

		txtObs3 = new JTextField();
		txtObs3.setColumns(10);
		panel_28.add(txtObs3);

		txtObs4 = new JTextField();
		txtObs4.setColumns(10);
		panel_28.add(txtObs4);

		JLabel label_43 = new JLabel("Cantidad");
		label_43.setBounds(210, 1, 55, 14);
		panel_25.add(label_43);

		JLabel label_44 = new JLabel("Observaci\u00F3n/Referencia");
		label_44.setBounds(267, 1, 143, 14);
		panel_25.add(label_44);

		JPanel panel_46 = new JPanel();
		panel_46.setLayout(null);
		panel_46.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_46.setBounds(10, 364, 414, 183);
		panel.add(panel_46);

		JLabel lblComponenteArquitectnico = new JLabel("COMPONENTE ARQUITECT\u00D3NICO");
		lblComponenteArquitectnico.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComponenteArquitectnico.setBounds(3, 1, 176, 14);
		panel_46.add(lblComponenteArquitectnico);

		JLabel label_4 = new JLabel("Cantidad");
		label_4.setBounds(210, 1, 55, 14);
		panel_46.add(label_4);

		JLabel label_5 = new JLabel("Observaci\u00F3n/Referencia");
		label_5.setBounds(267, 1, 143, 14);
		panel_46.add(label_5);

		JPanel panel_47 = new JPanel();
		panel_47.setLayout(null);
		panel_47.setBounds(210, 17, 55, 159);
		panel_46.add(panel_47);

		JPanel panel_49 = new JPanel();
		panel_49.setBounds(0, 132, 55, 27);
		panel_47.add(panel_49);
		panel_49.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad140 = new JTextField();
		txtCantidad140.setText("12");
		txtCantidad140.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad140.setEditable(false);
		txtCantidad140.setColumns(10);
		panel_49.add(txtCantidad140);

		txtCantidad141 = new JTextField();
		txtCantidad141.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad141.setColumns(10);
		panel_49.add(txtCantidad141);
		validarDigitos(txtCantidad141);

		panel_48 = new JPanel();
		panel_48.setBounds(0, 0, 55, 81);
		panel_47.add(panel_48);
		panel_48.setLayout(new GridLayout(3, 2, 0, 1));

		txtCantidad100 = new JTextField();
		txtCantidad100.setText("1");
		txtCantidad100.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad100.setEditable(false);
		txtCantidad100.setColumns(10);
		panel_48.add(txtCantidad100);

		txtCantidad101 = new JTextField();
		txtCantidad101.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad101.setColumns(10);
		panel_48.add(txtCantidad101);
		validarDigitos(txtCantidad101);

		txtCantidad110 = new JTextField();
		txtCantidad110.setText("3");
		txtCantidad110.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad110.setEditable(false);
		txtCantidad110.setColumns(10);
		panel_48.add(txtCantidad110);

		txtCantidad111 = new JTextField();
		txtCantidad111.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad111.setColumns(10);
		panel_48.add(txtCantidad111);
		validarDigitos(txtCantidad111);

		txtCantidad120 = new JTextField();
		txtCantidad120.setText("3");
		txtCantidad120.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad120.setEditable(false);
		txtCantidad120.setColumns(10);
		panel_48.add(txtCantidad120);

		txtCantidad121 = new JTextField();
		txtCantidad121.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad121.setColumns(10);
		panel_48.add(txtCantidad121);
		validarDigitos(txtCantidad121);

		JPanel panel_54 = new JPanel();
		panel_54.setBounds(0, 92, 55, 27);
		panel_47.add(panel_54);
		panel_54.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad130 = new JTextField();
		txtCantidad130.setText("3");
		txtCantidad130.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad130.setEditable(false);
		txtCantidad130.setColumns(10);
		panel_54.add(txtCantidad130);

		txtCantidad131 = new JTextField();
		txtCantidad131.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad131.setColumns(10);
		panel_54.add(txtCantidad131);
		validarDigitos(txtCantidad131);

		JPanel panel_50 = new JPanel();
		panel_50.setLayout(null);
		panel_50.setBounds(267, 17, 143, 159);
		panel_46.add(panel_50);

		JPanel panel_51 = new JPanel();
		panel_51.setBounds(0, 0, 143, 79);
		panel_50.add(panel_51);
		panel_51.setLayout(new GridLayout(3, 0, 0, 1));

		txtObs10 = new JTextField();
		txtObs10.setColumns(10);
		panel_51.add(txtObs10);

		txtObs11 = new JTextField();
		txtObs11.setColumns(10);
		panel_51.add(txtObs11);

		txtObs12 = new JTextField();
		txtObs12.setColumns(10);
		panel_51.add(txtObs12);

		txtObs13 = new JTextField();
		txtObs13.setColumns(10);
		txtObs13.setBounds(0, 92, 143, 27);
		panel_50.add(txtObs13);

		txtObs14 = new JTextField();
		txtObs14.setColumns(10);
		txtObs14.setBounds(0, 132, 143, 27);
		panel_50.add(txtObs14);

		JPanel panel_52 = new JPanel();
		panel_52.setLayout(null);
		panel_52.setBounds(3, 17, 205, 159);
		panel_46.add(panel_52);

		JLabel lblPerfilSfTipo_1 = new JLabel("Perfil SF Tipo 12 para ventana");
		lblPerfilSfTipo_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPerfilSfTipo_1.setBounds(0, 129, 205, 33);
		panel_52.add(lblPerfilSfTipo_1);

		JPanel panel_53 = new JPanel();
		panel_53.setBounds(0, 0, 205, 81);
		panel_52.add(panel_53);
		panel_53.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel lblPuerta = new JLabel("Puerta");
		lblPuerta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_53.add(lblPuerta);

		JLabel lblBisagras = new JLabel("Bisagras");
		lblBisagras.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_53.add(lblBisagras);

		JLabel lblPerfilSfTipo = new JLabel("Perfil SF Tipo 12 MA-SF-12 para puerta");
		lblPerfilSfTipo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_53.add(lblPerfilSfTipo);

		JLabel label_6 = new JLabel(
				"<html><body>Ventana corredera, compuesta por tres hojas y dos carriles. UPVC con vidrio flotado de 3 mm de 3x1,10</body></html>");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_6.setBounds(0, 79, 205, 50);
		panel_52.add(label_6);

		JPanel panel_11 = new JPanel();
		panel_11.setBounds(434, 256, 414, 85);
		panel.add(panel_11);
		panel_11.setLayout(null);
		panel_11.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		JPanel panel_12 = new JPanel();
		panel_12.setBounds(3, 17, 199, 67);
		panel_11.add(panel_12);
		panel_12.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel lblPanelesEpsPared_4 = new JLabel("Paneles EPS pared -   ( 1x2,70 x0,90  m)");
		lblPanelesEpsPared_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_12.add(lblPanelesEpsPared_4);

		JLabel lblPanelesEpsPared_5 = new JLabel("Paneles EPS pared -   ( 1x1,10 x0,90  m)");
		lblPanelesEpsPared_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_12.add(lblPanelesEpsPared_5);

		JLabel lblPanelesEpsPared_6 = new JLabel("Paneles EPS pared -   ( 1x0,50 x0,90  m)");
		lblPanelesEpsPared_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_12.add(lblPanelesEpsPared_6);

		JLabel lblComponenteArquitectnico_3 = new JLabel("FACHADA POSTERIOR");
		lblComponenteArquitectnico_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComponenteArquitectnico_3.setBounds(3, 1, 211, 14);
		panel_11.add(lblComponenteArquitectnico_3);

		JPanel panel_13 = new JPanel();
		panel_13.setBounds(210, 17, 55, 67);
		panel_11.add(panel_13);
		panel_13.setLayout(new GridLayout(3, 2, 0, 0));

		txtCantidad230 = new JTextField();
		txtCantidad230.setText("3");
		txtCantidad230.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad230.setEditable(false);
		txtCantidad230.setColumns(10);
		panel_13.add(txtCantidad230);

		txtCantidad231 = new JTextField();
		txtCantidad231.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad231.setColumns(10);
		panel_13.add(txtCantidad231);
		validarDigitos(txtCantidad231);

		txtCantida240 = new JTextField();
		txtCantida240.setText("6");
		txtCantida240.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantida240.setEditable(false);
		txtCantida240.setColumns(10);
		panel_13.add(txtCantida240);

		txtCantidad241 = new JTextField();
		txtCantidad241.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad241.setColumns(10);
		panel_13.add(txtCantidad241);
		validarDigitos(txtCantidad241);

		txtCantidad250 = new JTextField();
		txtCantidad250.setText("6");
		txtCantidad250.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad250.setEditable(false);
		txtCantidad250.setColumns(10);
		panel_13.add(txtCantidad250);

		txtCantidad251 = new JTextField();
		txtCantidad251.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad251.setColumns(10);
		panel_13.add(txtCantidad251);
		validarDigitos(txtCantidad251);

		JPanel panel_14 = new JPanel();
		panel_14.setBounds(267, 17, 143, 67);
		panel_11.add(panel_14);
		panel_14.setLayout(new GridLayout(3, 0, 0, 0));

		txtObs23 = new JTextField();
		txtObs23.setColumns(10);
		panel_14.add(txtObs23);

		txtObs24 = new JTextField();
		txtObs24.setColumns(10);
		panel_14.add(txtObs24);

		txtObs25 = new JTextField();
		txtObs25.setColumns(10);
		panel_14.add(txtObs25);

		JLabel label_21 = new JLabel("Cantidad");
		label_21.setBounds(210, 1, 55, 14);
		panel_11.add(label_21);

		JLabel label_22 = new JLabel("Observaci\u00F3n/Referencia");
		label_22.setBounds(267, 1, 143, 14);
		panel_11.add(label_22);

		panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_15.setBounds(434, 4, 414, 115);
		panel.add(panel_15);

		panel_16 = new JPanel();
		panel_16.setBounds(3, 17, 199, 95);
		panel_15.add(panel_16);
		panel_16.setLayout(new GridLayout(4, 0, 0, 0));

		lblPanelesTcbxmts = new JLabel("Paneles TCB (8.8x5.8)mts");
		lblPanelesTcbxmts.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_16.add(lblPanelesTcbxmts);

		lblPanelesVinilPiso = new JLabel("Paneles vinil piso (0,15x1,93mts)");
		lblPanelesVinilPiso.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_16.add(lblPanelesVinilPiso);

		lblPanelesEpsPara = new JLabel("Paneles EPS para cubierta l=7, a= 1mt");
		lblPanelesEpsPara.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_16.add(lblPanelesEpsPara);

		lblPerfilSfTipo_2 = new JLabel("Perfil SF Tipo 12 MB-SF-12  para paneles");
		lblPerfilSfTipo_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_16.add(lblPerfilSfTipo_2);

		lblComponenteArquitectnico_1 = new JLabel("COMPONENTE ARQUITECT\u00D3NICO");
		lblComponenteArquitectnico_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComponenteArquitectnico_1.setBounds(3, 1, 211, 14);
		panel_15.add(lblComponenteArquitectnico_1);

		panel_17 = new JPanel();
		panel_17.setBounds(210, 17, 55, 95);
		panel_15.add(panel_17);
		panel_17.setLayout(new GridLayout(4, 2, 0, 0));

		txtCantidad150 = new JTextField();
		txtCantidad150.setText("1");
		txtCantidad150.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad150.setEditable(false);
		txtCantidad150.setColumns(10);
		panel_17.add(txtCantidad150);

		txtCantidad151 = new JTextField();
		txtCantidad151.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad151.setColumns(10);
		panel_17.add(txtCantidad151);
		validarDigitos(txtCantidad151);

		txtCantidad160 = new JTextField();
		txtCantidad160.setText("177");
		txtCantidad160.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad160.setEditable(false);
		txtCantidad160.setColumns(10);
		panel_17.add(txtCantidad160);

		txtCantidad161 = new JTextField();
		txtCantidad161.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad161.setColumns(10);
		panel_17.add(txtCantidad161);
		validarDigitos(txtCantidad161);

		txtCantidad170 = new JTextField();
		txtCantidad170.setText("9");
		txtCantidad170.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad170.setEditable(false);
		txtCantidad170.setColumns(10);
		panel_17.add(txtCantidad170);

		txtCantidad171 = new JTextField();
		txtCantidad171.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad171.setColumns(10);
		panel_17.add(txtCantidad171);
		validarDigitos(txtCantidad171);

		txtCantidad180 = new JTextField();
		txtCantidad180.setText("8");
		txtCantidad180.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad180.setEditable(false);
		txtCantidad180.setColumns(10);
		panel_17.add(txtCantidad180);

		txtCantidad181 = new JTextField();
		txtCantidad181.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad181.setColumns(10);
		panel_17.add(txtCantidad181);
		validarDigitos(txtCantidad181);

		panel_18 = new JPanel();
		panel_18.setBounds(267, 17, 143, 95);
		panel_15.add(panel_18);
		panel_18.setLayout(new GridLayout(4, 0, 0, 0));

		txtObs15 = new JTextField();
		txtObs15.setColumns(10);
		panel_18.add(txtObs15);

		txtObs16 = new JTextField();
		txtObs16.setColumns(10);
		panel_18.add(txtObs16);

		txtObs17 = new JTextField();
		txtObs17.setColumns(10);
		panel_18.add(txtObs17);

		txtObs18 = new JTextField();
		txtObs18.setColumns(10);
		panel_18.add(txtObs18);

		label_10 = new JLabel("Cantidad");
		label_10.setBounds(210, 1, 55, 14);
		panel_15.add(label_10);

		label_11 = new JLabel("Observaci\u00F3n/Referencia");
		label_11.setBounds(267, 1, 143, 14);
		panel_15.add(label_11);

		panel_19 = new JPanel();
		panel_19.setLayout(null);
		panel_19.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_19.setBounds(434, 130, 414, 115);
		panel.add(panel_19);

		panel_20 = new JPanel();
		panel_20.setBounds(3, 17, 203, 95);
		panel_19.add(panel_20);
		panel_20.setLayout(new GridLayout(4, 0, 0, 0));

		lblPanelesEpsPared = new JLabel("Paneles EPS pared -   ( 1x3x0,09x0,09 m)");
		lblPanelesEpsPared.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_20.add(lblPanelesEpsPared);

		lblPanelesEpsPared_1 = new JLabel("Paneles EPS pared -   ( 1x0,90x0,90 m)");
		lblPanelesEpsPared_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_20.add(lblPanelesEpsPared_1);

		lblPanelesEpsPared_2 = new JLabel("Paneles EPS pared -   ( 1x1,10x0,09 m)");
		lblPanelesEpsPared_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_20.add(lblPanelesEpsPared_2);

		lblPanelesEpsPared_3 = new JLabel("Paneles EPS pared -   ( 1x0,80x0,09 m)");
		lblPanelesEpsPared_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_20.add(lblPanelesEpsPared_3);

		lblComponenteArquitectnico_2 = new JLabel("FACHADA FRONTAL");
		lblComponenteArquitectnico_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComponenteArquitectnico_2.setBounds(3, 1, 211, 14);
		panel_19.add(lblComponenteArquitectnico_2);

		panel_21 = new JPanel();
		panel_21.setBounds(210, 17, 55, 95);
		panel_19.add(panel_21);
		panel_21.setLayout(new GridLayout(4, 2, 0, 0));

		txtCantidad190 = new JTextField();
		txtCantidad190.setText("5");
		txtCantidad190.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad190.setEditable(false);
		txtCantidad190.setColumns(10);
		panel_21.add(txtCantidad190);

		txtCantidad191 = new JTextField();
		txtCantidad191.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad191.setColumns(10);
		panel_21.add(txtCantidad191);
		validarDigitos(txtCantidad191);

		txtCantidad200 = new JTextField();
		txtCantidad200.setText("1");
		txtCantidad200.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad200.setEditable(false);
		txtCantidad200.setColumns(10);
		panel_21.add(txtCantidad200);

		txtCantidad201 = new JTextField();
		txtCantidad201.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad201.setColumns(10);
		panel_21.add(txtCantidad201);
		validarDigitos(txtCantidad201);

		txtCantidad210 = new JTextField();
		txtCantidad210.setText("1");
		txtCantidad210.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad210.setEditable(false);
		txtCantidad210.setColumns(10);
		panel_21.add(txtCantidad210);

		txtCantidad211 = new JTextField();
		txtCantidad211.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad211.setColumns(10);
		panel_21.add(txtCantidad211);
		validarDigitos(txtCantidad211);

		txtCantidad220 = new JTextField();
		txtCantidad220.setText("3");
		txtCantidad220.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad220.setEditable(false);
		txtCantidad220.setColumns(10);
		panel_21.add(txtCantidad220);

		txtCantidad221 = new JTextField();
		txtCantidad221.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad221.setColumns(10);
		panel_21.add(txtCantidad221);
		validarDigitos(txtCantidad221);

		panel_22 = new JPanel();
		panel_22.setBounds(267, 17, 143, 95);
		panel_19.add(panel_22);
		panel_22.setLayout(new GridLayout(4, 0, 0, 0));

		txtObs19 = new JTextField();
		txtObs19.setColumns(10);
		panel_22.add(txtObs19);

		txtObs20 = new JTextField();
		txtObs20.setColumns(10);
		panel_22.add(txtObs20);

		txtObs21 = new JTextField();
		txtObs21.setColumns(10);
		panel_22.add(txtObs21);

		txtObs22 = new JTextField();
		txtObs22.setColumns(10);
		panel_22.add(txtObs22);

		label_24 = new JLabel("Cantidad");
		label_24.setBounds(210, 1, 55, 14);
		panel_19.add(label_24);

		label_25 = new JLabel("Observaci\u00F3n/Referencia");
		label_25.setBounds(267, 1, 143, 14);
		panel_19.add(label_25);

		panel_23 = new JPanel();
		panel_23.setLayout(null);
		panel_23.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_23.setBounds(858, 68, 414, 273);
		panel.add(panel_23);

		panel_24 = new JPanel();
		panel_24.setBounds(3, 17, 199, 250);
		panel_23.add(panel_24);
		panel_24.setLayout(new GridLayout(12, 0, 0, 0));

		lblDadosCimentacin = new JLabel("Dados cimentaci\u00F3n");
		panel_24.add(lblDadosCimentacin);

		lblPerfilSfTipo_3 = new JLabel("Perfil SF Tipo 1");
		panel_24.add(lblPerfilSfTipo_3);

		lblPerfilSfTipo_4 = new JLabel("Perfil SF Tipo 2");
		panel_24.add(lblPerfilSfTipo_4);

		lblPerfilSfTipo_5 = new JLabel("Perfil SF Tipo 3");
		panel_24.add(lblPerfilSfTipo_5);

		lblPerfilSfTipo_6 = new JLabel("Perfil SF Tipo 4");
		panel_24.add(lblPerfilSfTipo_6);

		lblPerfilSfTipo_7 = new JLabel("Perfil SF Tipo 5");
		panel_24.add(lblPerfilSfTipo_7);

		lblPerfilSfTipo_8 = new JLabel("Perfil SF Tipo 6");
		panel_24.add(lblPerfilSfTipo_8);

		lblPerfilSfTipo_9 = new JLabel("Perfil SF Tipo 7");
		panel_24.add(lblPerfilSfTipo_9);

		lblPerfilSfTipo_10 = new JLabel("Perfil SF Tipo 8");
		panel_24.add(lblPerfilSfTipo_10);

		lblPerfilSfTipo_11 = new JLabel("Perfil SF Tipo 9");
		panel_24.add(lblPerfilSfTipo_11);

		lblPerfilSfTipo_12 = new JLabel("Perfil SF Tipo 10");
		panel_24.add(lblPerfilSfTipo_12);

		lblPerfilSfTipo_13 = new JLabel("Perfil SF Tipo 11");
		panel_24.add(lblPerfilSfTipo_13);

		lblComponenteEstructural = new JLabel("COMPONENTE ESTRUCTURAL");
		lblComponenteEstructural.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComponenteEstructural.setBounds(3, 1, 176, 14);
		panel_23.add(lblComponenteEstructural);

		panel_29 = new JPanel();
		panel_29.setBounds(210, 17, 55, 250);
		panel_23.add(panel_29);
		panel_29.setLayout(new GridLayout(12, 2, 0, 0));

		txtCantidad270 = new JTextField();
		txtCantidad270.setText("20");
		txtCantidad270.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad270.setEditable(false);
		txtCantidad270.setColumns(10);
		panel_29.add(txtCantidad270);

		txtCantidad271 = new JTextField();
		txtCantidad271.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad271.setColumns(10);
		panel_29.add(txtCantidad271);
		validarDigitos(txtCantidad271);

		txtCantidad280 = new JTextField();
		txtCantidad280.setText("2");
		txtCantidad280.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad280.setEditable(false);
		txtCantidad280.setColumns(10);
		panel_29.add(txtCantidad280);

		txtCantidad281 = new JTextField();
		txtCantidad281.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad281.setColumns(10);
		panel_29.add(txtCantidad281);
		validarDigitos(txtCantidad281);

		txtCantidad290 = new JTextField();
		txtCantidad290.setText("2");
		txtCantidad290.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad290.setEditable(false);
		txtCantidad290.setColumns(10);
		panel_29.add(txtCantidad290);

		txtCantidad291 = new JTextField();
		txtCantidad291.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad291.setColumns(10);
		panel_29.add(txtCantidad291);
		validarDigitos(txtCantidad291);

		txtCantidad300 = new JTextField();
		txtCantidad300.setText("20");
		txtCantidad300.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad300.setEditable(false);
		txtCantidad300.setColumns(10);
		panel_29.add(txtCantidad300);

		txtCantidad301 = new JTextField();
		txtCantidad301.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad301.setColumns(10);
		panel_29.add(txtCantidad301);
		validarDigitos(txtCantidad301);

		txtCantidad310 = new JTextField();
		txtCantidad310.setText("6");
		txtCantidad310.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad310.setEditable(false);
		txtCantidad310.setColumns(10);
		panel_29.add(txtCantidad310);

		txtCantidad311 = new JTextField();
		txtCantidad311.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad311.setColumns(10);
		panel_29.add(txtCantidad311);
		validarDigitos(txtCantidad311);

		txtCantidad320 = new JTextField();
		txtCantidad320.setText("40");
		txtCantidad320.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad320.setEditable(false);
		txtCantidad320.setColumns(10);
		panel_29.add(txtCantidad320);

		txtCantidad321 = new JTextField();
		txtCantidad321.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad321.setColumns(10);
		panel_29.add(txtCantidad321);
		validarDigitos(txtCantidad321);

		txtCantidad330 = new JTextField();
		txtCantidad330.setText("40");
		txtCantidad330.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad330.setEditable(false);
		txtCantidad330.setColumns(10);
		panel_29.add(txtCantidad330);

		txtCantidad331 = new JTextField();
		txtCantidad331.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad331.setColumns(10);
		panel_29.add(txtCantidad331);
		validarDigitos(txtCantidad331);

		txtCantidad340 = new JTextField();
		txtCantidad340.setText("2");
		txtCantidad340.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad340.setEditable(false);
		txtCantidad340.setColumns(10);
		panel_29.add(txtCantidad340);

		txtCantidad341 = new JTextField();
		txtCantidad341.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad341.setColumns(10);
		panel_29.add(txtCantidad341);
		validarDigitos(txtCantidad341);

		txtCantidad350 = new JTextField();
		txtCantidad350.setText("2");
		txtCantidad350.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad350.setEditable(false);
		txtCantidad350.setColumns(10);
		panel_29.add(txtCantidad350);

		txtCantidad351 = new JTextField();
		txtCantidad351.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad351.setColumns(10);
		panel_29.add(txtCantidad351);
		validarDigitos(txtCantidad351);

		txtCantidad360 = new JTextField();
		txtCantidad360.setText("20");
		txtCantidad360.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad360.setEditable(false);
		txtCantidad360.setColumns(10);
		panel_29.add(txtCantidad360);

		txtCantidad361 = new JTextField();
		txtCantidad361.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad361.setColumns(10);
		panel_29.add(txtCantidad361);
		validarDigitos(txtCantidad361);

		txtCantidad370 = new JTextField();
		txtCantidad370.setText("6");
		txtCantidad370.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad370.setEditable(false);
		txtCantidad370.setColumns(10);
		panel_29.add(txtCantidad370);

		txtCantidad371 = new JTextField();
		txtCantidad371.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad371.setColumns(10);
		panel_29.add(txtCantidad371);
		validarDigitos(txtCantidad371);

		txtCantidad380 = new JTextField();
		txtCantidad380.setText("40");
		txtCantidad380.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad380.setEditable(false);
		txtCantidad380.setColumns(10);
		panel_29.add(txtCantidad380);

		txtCantidad381 = new JTextField();
		txtCantidad381.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad381.setColumns(10);
		panel_29.add(txtCantidad381);
		validarDigitos(txtCantidad381);

		panel_30 = new JPanel();
		panel_30.setBounds(267, 17, 143, 250);
		panel_23.add(panel_30);
		panel_30.setLayout(new GridLayout(12, 0, 0, 0));

		txtObs27 = new JTextField();
		txtObs27.setColumns(10);
		panel_30.add(txtObs27);

		txtObs28 = new JTextField();
		txtObs28.setColumns(10);
		panel_30.add(txtObs28);

		txtObs29 = new JTextField();
		txtObs29.setColumns(10);
		panel_30.add(txtObs29);

		txtObs30 = new JTextField();
		txtObs30.setColumns(10);
		panel_30.add(txtObs30);

		txtObs31 = new JTextField();
		txtObs31.setColumns(10);
		panel_30.add(txtObs31);

		txtObs32 = new JTextField();
		txtObs32.setColumns(10);
		panel_30.add(txtObs32);

		txtObs33 = new JTextField();
		txtObs33.setColumns(10);
		panel_30.add(txtObs33);

		txtObs34 = new JTextField();
		txtObs34.setColumns(10);
		panel_30.add(txtObs34);

		txtObs35 = new JTextField();
		txtObs35.setColumns(10);
		panel_30.add(txtObs35);

		txtObs36 = new JTextField();
		txtObs36.setColumns(10);
		panel_30.add(txtObs36);

		txtObs37 = new JTextField();
		txtObs37.setColumns(10);
		panel_30.add(txtObs37);

		txtObs38 = new JTextField();
		txtObs38.setColumns(10);
		panel_30.add(txtObs38);

		label_18 = new JLabel("Cantidad");
		label_18.setBounds(210, 1, 55, 14);
		panel_23.add(label_18);

		label_19 = new JLabel("Observaci\u00F3n/Referencia");
		label_19.setBounds(267, 1, 143, 14);
		panel_23.add(label_19);

		JPanel panel_31 = new JPanel();
		panel_31.setLayout(null);
		panel_31.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_31.setBounds(858, 4, 414, 53);
		panel.add(panel_31);

		JPanel panel_32 = new JPanel();
		panel_32.setBounds(3, 17, 199, 25);
		panel_31.add(panel_32);
		panel_32.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblPanelEpsHvar = new JLabel("Panel EPS Hvar- pared lateral izq (libre)");
		panel_32.add(lblPanelEpsHvar);

		JLabel lblFachadaLateral = new JLabel("FACHADA LATERAL");
		lblFachadaLateral.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFachadaLateral.setBounds(3, 1, 176, 14);
		panel_31.add(lblFachadaLateral);

		JPanel panel_33 = new JPanel();
		panel_33.setBounds(210, 17, 55, 25);
		panel_31.add(panel_33);
		panel_33.setLayout(new GridLayout(1, 1, 0, 0));

		txtCantidad260 = new JTextField();
		txtCantidad260.setText("6");
		txtCantidad260.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad260.setEditable(false);
		txtCantidad260.setColumns(10);
		panel_33.add(txtCantidad260);

		txtCantidad261 = new JTextField();
		txtCantidad261.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad261.setColumns(10);
		panel_33.add(txtCantidad261);
		validarDigitos(txtCantidad261);

		JPanel panel_34 = new JPanel();
		panel_34.setBounds(267, 17, 143, 25);
		panel_31.add(panel_34);
		panel_34.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs26 = new JTextField();
		txtObs26.setColumns(10);
		panel_34.add(txtObs26);

		JLabel label_8 = new JLabel("Cantidad");
		label_8.setBounds(210, 1, 55, 14);
		panel_31.add(label_8);

		JLabel label_9 = new JLabel("Observaci\u00F3n/Referencia");
		label_9.setBounds(267, 1, 143, 14);
		panel_31.add(label_9);

		JPinformacionObligatoria pnlInformacionOblig = new JPinformacionObligatoria(865, 325);
		pnlInformacionOblig.getBtnInsertarFoto().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				fotoInfoObl = getPathImagen();
			}
		});
		panel.add(pnlInformacionOblig.getPnlInformacionObl());

		llenarFicha();
		pnlCabecera.getBtnRegistrar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				ServicioInfoObligatoria srvInfoOblig = new ComponenteInfoObligatoria();
				infor = cargarInfoObligatoria(pnlInformacionOblig);
				infor.setIoFotoPath(fotoInfoObl);

				if (validarInfo(infor)) {
					List<TdetalleFicha> detallesFicha = cargarListas();
					if (detallesFicha == null) {
						JOptionPane.showMessageDialog(null,
								"ERROR: Verificar que los registros no se encuentren VACÍOS", "Mensaje de Error",
								JOptionPane.ERROR_MESSAGE);
						return;
					}
					if (registrosValidados(detallesFicha)) {
						srvInfoOblig.crear(infor);
						servFicha.guardarFormulario(detallesFicha);
						HashMap<String, Object> parametros = new HashMap<String, Object>();
						parametros.put("serial_cabecera", Utilitarios.gettCabecera().getCSerial());
						parametros.put("serial_ficha", ficha.getFiSerial());

						Reporte reporte = new Reporte("Reporte MB", 280, 10, 850, 750);
						InputStream path = AlInicio.class.getResourceAsStream("/com/capa/templates/MA.jasper");
						reporte.cargarReporte(path, parametros, Query.getMysql().getConexion());
						reporte.setVisible(true);
						new Menu().setVisible(true);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "ERROR: Verificar valores ejecutados!", "Mensaje de Error",
								JOptionPane.ERROR_MESSAGE);
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

		ServicioInfoObligatoria srvInfoObl = new ComponenteInfoObligatoria();
		infor.setIoSerial(srvInfoObl.serialInfoOblMax());

		BigDecimal porcentajeAvance;
		TGrupo grupoTmp = servFicha.buscarGrupo("Kit eléctrico");
		Integer updateFicha = servFicha.nActualizacionFicha(gettCabecera(), ficha);
		if (updateFicha == -1) {
			updateFicha = 0;
		} else {
			updateFicha++;
		}
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad00.getText()),
				Integer.parseInt(txtCantidad01.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_0),
				Integer.parseInt(txtCantidad00.getText()), Integer.parseInt(txtCantidad01.getText()), txtObs0.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad10.getText()),
				Integer.parseInt(txtCantidad11.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_1),
				Integer.parseInt(txtCantidad10.getText()), Integer.parseInt(txtCantidad11.getText()), txtObs1.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad20.getText()),
				Integer.parseInt(txtCantidad21.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_2),
				Integer.parseInt(txtCantidad20.getText()), Integer.parseInt(txtCantidad21.getText()), txtObs2.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad30.getText()),
				Integer.parseInt(txtCantidad31.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_3),
				Integer.parseInt(txtCantidad30.getText()), Integer.parseInt(txtCantidad31.getText()), txtObs3.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad40.getText()),
				Integer.parseInt(txtCantidad41.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_4),
				Integer.parseInt(txtCantidad40.getText()), Integer.parseInt(txtCantidad41.getText()), txtObs4.getText(),
				updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Kit agua lluvia");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad50.getText()),
				Integer.parseInt(txtCantidad51.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_5),
				Integer.parseInt(txtCantidad50.getText()), Integer.parseInt(txtCantidad51.getText()), txtObs5.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad60.getText()),
				Integer.parseInt(txtCantidad61.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_6),
				Integer.parseInt(txtCantidad60.getText()), Integer.parseInt(txtCantidad61.getText()), txtObs6.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad70.getText()),
				Integer.parseInt(txtCantidad71.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_7),
				Integer.parseInt(txtCantidad70.getText()), Integer.parseInt(txtCantidad71.getText()), txtObs7.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad80.getText()),
				Integer.parseInt(txtCantidad81.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_8),
				Integer.parseInt(txtCantidad80.getText()), Integer.parseInt(txtCantidad81.getText()), txtObs8.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad90.getText()),
				Integer.parseInt(txtCantidad91.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_9),
				Integer.parseInt(txtCantidad90.getText()), Integer.parseInt(txtCantidad91.getText()), txtObs9.getText(),
				updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Componente arquitectónico");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad100.getText()),
				Integer.parseInt(txtCantidad101.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_10),
				Integer.parseInt(txtCantidad100.getText()), Integer.parseInt(txtCantidad101.getText()),
				txtObs10.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad110.getText()),
				Integer.parseInt(txtCantidad111.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_11),
				Integer.parseInt(txtCantidad110.getText()), Integer.parseInt(txtCantidad111.getText()),
				txtObs11.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad120.getText()),
				Integer.parseInt(txtCantidad121.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_12),
				Integer.parseInt(txtCantidad120.getText()), Integer.parseInt(txtCantidad121.getText()),
				txtObs12.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad130.getText()),
				Integer.parseInt(txtCantidad131.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_13),
				Integer.parseInt(txtCantidad130.getText()), Integer.parseInt(txtCantidad131.getText()),
				txtObs13.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad140.getText()),
				Integer.parseInt(txtCantidad141.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_14),
				Integer.parseInt(txtCantidad140.getText()), Integer.parseInt(txtCantidad141.getText()),
				txtObs14.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad150.getText()),
				Integer.parseInt(txtCantidad151.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_15),
				Integer.parseInt(txtCantidad150.getText()), Integer.parseInt(txtCantidad151.getText()),
				txtObs15.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad160.getText()),
				Integer.parseInt(txtCantidad161.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_16),
				Integer.parseInt(txtCantidad160.getText()), Integer.parseInt(txtCantidad161.getText()),
				txtObs16.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad170.getText()),
				Integer.parseInt(txtCantidad171.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_17),
				Integer.parseInt(txtCantidad170.getText()), Integer.parseInt(txtCantidad171.getText()),
				txtObs17.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad180.getText()),
				Integer.parseInt(txtCantidad181.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_18),
				Integer.parseInt(txtCantidad180.getText()), Integer.parseInt(txtCantidad181.getText()),
				txtObs18.getText(), updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Fachada frontal");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad190.getText()),
				Integer.parseInt(txtCantidad191.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_19),
				Integer.parseInt(txtCantidad190.getText()), Integer.parseInt(txtCantidad191.getText()),
				txtObs19.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad200.getText()),
				Integer.parseInt(txtCantidad201.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_20),
				Integer.parseInt(txtCantidad200.getText()), Integer.parseInt(txtCantidad201.getText()),
				txtObs20.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad210.getText()),
				Integer.parseInt(txtCantidad211.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_21),
				Integer.parseInt(txtCantidad210.getText()), Integer.parseInt(txtCantidad211.getText()),
				txtObs21.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad220.getText()),
				Integer.parseInt(txtCantidad221.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_22),
				Integer.parseInt(txtCantidad220.getText()), Integer.parseInt(txtCantidad221.getText()),
				txtObs22.getText(), updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Fachada posterior");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad230.getText()),
				Integer.parseInt(txtCantidad231.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_23),
				Integer.parseInt(txtCantidad230.getText()), Integer.parseInt(txtCantidad231.getText()),
				txtObs23.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantida240.getText()),
				Integer.parseInt(txtCantidad241.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_24),
				Integer.parseInt(txtCantida240.getText()), Integer.parseInt(txtCantidad241.getText()),
				txtObs24.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad250.getText()),
				Integer.parseInt(txtCantidad251.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_25),
				Integer.parseInt(txtCantidad250.getText()), Integer.parseInt(txtCantidad251.getText()),
				txtObs25.getText(), updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Fachada lateral");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad260.getText()),
				Integer.parseInt(txtCantidad261.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_26),
				Integer.parseInt(txtCantidad260.getText()), Integer.parseInt(txtCantidad261.getText()),
				txtObs26.getText(), updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Componente estructural");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad270.getText()),
				Integer.parseInt(txtCantidad271.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_27),
				Integer.parseInt(txtCantidad270.getText()), Integer.parseInt(txtCantidad271.getText()),
				txtObs27.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad280.getText()),
				Integer.parseInt(txtCantidad281.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_28),
				Integer.parseInt(txtCantidad280.getText()), Integer.parseInt(txtCantidad281.getText()),
				txtObs28.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad290.getText()),
				Integer.parseInt(txtCantidad291.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_29),
				Integer.parseInt(txtCantidad290.getText()), Integer.parseInt(txtCantidad291.getText()),
				txtObs29.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad300.getText()),
				Integer.parseInt(txtCantidad301.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_30),
				Integer.parseInt(txtCantidad300.getText()), Integer.parseInt(txtCantidad301.getText()),
				txtObs30.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad310.getText()),
				Integer.parseInt(txtCantidad311.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_31),
				Integer.parseInt(txtCantidad310.getText()), Integer.parseInt(txtCantidad311.getText()),
				txtObs31.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad320.getText()),
				Integer.parseInt(txtCantidad321.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_32),
				Integer.parseInt(txtCantidad320.getText()), Integer.parseInt(txtCantidad321.getText()),
				txtObs32.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad330.getText()),
				Integer.parseInt(txtCantidad331.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_33),
				Integer.parseInt(txtCantidad330.getText()), Integer.parseInt(txtCantidad331.getText()),
				txtObs33.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad340.getText()),
				Integer.parseInt(txtCantidad341.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_34),
				Integer.parseInt(txtCantidad340.getText()), Integer.parseInt(txtCantidad341.getText()),
				txtObs34.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad350.getText()),
				Integer.parseInt(txtCantidad351.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_35),
				Integer.parseInt(txtCantidad350.getText()), Integer.parseInt(txtCantidad351.getText()),
				txtObs35.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad360.getText()),
				Integer.parseInt(txtCantidad361.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_36),
				Integer.parseInt(txtCantidad360.getText()), Integer.parseInt(txtCantidad361.getText()),
				txtObs36.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad370.getText()),
				Integer.parseInt(txtCantidad371.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_37),
				Integer.parseInt(txtCantidad370.getText()), Integer.parseInt(txtCantidad371.getText()),
				txtObs37.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad380.getText()),
				Integer.parseInt(txtCantidad381.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MB_38),
				Integer.parseInt(txtCantidad380.getText()), Integer.parseInt(txtCantidad381.getText()),
				txtObs38.getText(), updateFicha, porcentajeAvance));

		return listaDetalles;
	}

	public void llenarFicha() {
		List<TdetalleFicha> listaDetalles = servFicha.detallesFicha(gettCabecera(), ficha);
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
		}
	}
}
