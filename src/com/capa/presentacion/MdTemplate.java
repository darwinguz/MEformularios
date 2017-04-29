package com.capa.presentacion;

import static com.capa.negocios.Calculos.calcularPorcentajeAvance;
import static com.capa.util.Utilitarios.*;
import static com.capa.util.Validaciones.*;
import static com.capa.util.Constantes.*;

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

public class MdTemplate extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7293344096499392660L;
	private JPanel contentPane;
	private JTextField txtCantidad90;
	private JTextField txtCantidad91;
	private JTextField txtCantidad100;
	private JTextField txtCantidad101;
	private JTextField txtCantidad110;
	private JTextField txtCantidad111;
	private JTextField txtCantidad80;
	private JTextField txtCantidad81;
	private JTextField txtObs9;
	private JTextField txtObs10;
	private JTextField txtObs11;
	private JTextField txtObs8;
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
	private JTextField txtCantidad410;
	private JTextField txtCantidad411;
	private JTextField txtCantidad420;
	private JTextField txtCantidad421;
	private JTextField txtCantidad430;
	private JTextField txtCantidad431;
	private JTextField txtObs41;
	private JTextField txtObs42;
	private JTextField txtObs43;
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
	private JTextField txtObs51;
	private JTextField txtObs52;
	private JTextField txtObs53;
	private JTextField txtObs54;
	private JTextField txtObs55;
	private JTextField txtCantidad830;
	private JTextField txtCantidad831;
	private JTextField txtCantidad840;
	private JTextField txtCantidad841;
	private JTextField txtCantidad850;
	private JTextField txtCantidad851;
	private JTextField txtCantidad860;
	private JTextField txtCantidad861;
	private JTextField txtCantidad870;
	private JTextField txtCantidad871;
	private JTextField txtCantidad880;
	private JTextField txtCantidad881;
	private JTextField txtCantidad890;
	private JTextField txtCantidad891;
	private JTextField txtCantidad900;
	private JTextField txtCantidad901;
	private JTextField txtCantidad910;
	private JTextField txtCantidad911;
	private JTextField txtCantidad920;
	private JTextField txtCantidad921;
	private JTextField txtCantidad930;
	private JTextField txtCantidad931;
	private JTextField txtCantidad940;
	private JTextField txtCantidad941;
	private JTextField txtObs83;
	private JTextField txtObs84;
	private JTextField txtObs85;
	private JTextField txtObs86;
	private JTextField txtObs87;
	private JTextField txtObs88;
	private JTextField txtObs89;
	private JTextField txtObs90;
	private JTextField txtObs91;
	private JTextField txtObs92;
	private JTextField txtObs93;
	private JTextField txtObs94;
	private JTextField txtCantidad50;
	private JTextField txtCantidad51;
	private JTextField txtObs5;
	private JPanel panel_89;
	private JTextField txtCantidad60;
	private JTextField txtCantidad61;
	private JTextField txtCantidad70;
	private JTextField txtCantidad71;
	private JPanel panel_90;
	private JTextField txtObs6;
	private JTextField txtObs7;
	private JPanel panel_15;
	private JPanel panel_16;
	private JLabel lblInodoros;
	private JLabel lblUrinarios;
	private JLabel lblLavabos;
	private JLabel lblKitHidrosanitario;
	private JPanel panel_17;
	private JTextField txtCantidad120;
	private JTextField txtCantidad121;
	private JTextField txtCantidad130;
	private JTextField txtCantidad131;
	private JTextField txtCantidad140;
	private JTextField txtCantidad141;
	private JPanel panel_18;
	private JTextField txtObs12;
	private JTextField txtObs13;
	private JTextField txtObs14;
	private JLabel label_17;
	private JLabel label_18;
	private JPanel panel_19;
	private JPanel panel_20;
	private JLabel lblKitDeAccesorios;
	private JLabel label_6;
	private JPanel panel_21;
	private JTextField txtCantidad150;
	private JTextField txtCantidad151;
	private JPanel panel_22;
	private JTextField txtObs15;
	private JLabel label_11;
	private JLabel label_12;
	private JPanel panel_23;
	private JLabel lblKitAguaPotable;
	private JLabel label_16;
	private JLabel label_19;
	private JPanel panel_28;
	private JPanel panel_30;
	private JTextField txtCantidad160;
	private JTextField txtCantidad161;
	private JPanel panel_32;
	private JPanel panel_33;
	private JTextField txtObs16;
	private JPanel panel_34;
	private JLabel lblKitDeAccesorios_1;
	private JPanel panel_35;
	private JLabel lblTuberaDePvc;
	private JLabel lblTuberaDePvc_1;
	private JPanel panel_29;
	private JTextField txtCantidad170;
	private JTextField txtCantidad171;
	private JTextField txtCantidad180;
	private JTextField txtCantidad181;
	private JPanel panel_31;
	private JTextField txtObs17;
	private JTextField txtObs18;
	private JLabel lblKitDeAccesorios_2;
	private JPanel panel_91;
	private JTextField txtCantidad190;
	private JPanel panel_92;
	private JTextField txtObs19;
	private JPanel panel_93;
	private JLabel lblTuberaDePvc_2;
	private JLabel lblTuberaDePvc_3;
	private JLabel lblKitParaConexin;
	private JPanel panel_94;
	private JTextField txtCantidad200;
	private JTextField txtCantidad201;
	private JTextField txtCantidad210;
	private JTextField txtCantidad211;
	private JTextField txtCantidad220;
	private JTextField txtCantidad221;
	private JPanel panel_95;
	private JTextField txtObs20;
	private JTextField txtObs21;
	private JTextField txtObs22;
	private JPanel panel_96;
	private JLabel lblKitParaConexin_1;
	private JPanel panel_97;
	private JTextField txtCantidad230;
	private JTextField txtCantidad231;
	private JPanel panel_98;
	private JTextField txtObs23;
	private JPanel panel_99;
	private JLabel lblKitAguaResidual;
	private JLabel label_20;
	private JLabel label_21;
	private JPanel panel_100;
	private JPanel panel_101;
	private JTextField txtCantidad240;
	private JTextField txtCantidad241;
	private JPanel panel_103;
	private JTextField txtCantidad250;
	private JTextField txtCantidad251;
	private JPanel panel_104;
	private JTextField txtCantidad260;
	private JTextField txtCantidad261;
	private JTextField txtCantidad270;
	private JTextField txtCantidad271;
	private JPanel panel_105;
	private JTextField txtCantidad280;
	private JTextField txtCantidad281;
	private JPanel panel_106;
	private JPanel panel_107;
	private JTextField txtObs24;
	private JPanel panel_109;
	private JTextField txtObs25;
	private JPanel panel_110;
	private JTextField txtObs26;
	private JTextField txtObs27;
	private JPanel panel_111;
	private JTextField txtObs28;
	private JPanel panel_112;
	private JLabel lblKitDeAccesorios_3;
	private JLabel lblKitDeAccesorios_4;
	private JPanel panel_114;
	private JLabel lblTuberaDePvc_4;
	private JLabel lblTuberaDePvc_5;
	private JPanel panel_115;
	private JLabel lblKitDeAccesorios_5;
	private JPanel panel_102;
	private JLabel lblTuberaDePvc_6;
	private JPanel panel_108;
	private JTextField txtCantidad290;
	private JTextField txtCantidad291;
	private JPanel panel_113;
	private JTextField txtObs29;
	private JTextField txtCantidad300;
	private JTextField txtCantidad301;
	private JTextField txtCantidad330;
	private JTextField txtCantidad331;
	private JTextField txtCantidad310;
	private JTextField txtCantidad311;
	private JTextField txtCantidad320;
	private JTextField txtCantidad321;
	private JTextField txtCantidad340;
	private JTextField txtCantidad341;
	private JTextField txtCantidad350;
	private JTextField txtCantidad351;
	private JTextField txtObs30;
	private JTextField txtObs33;
	private JTextField txtObs31;
	private JTextField txtObs32;
	private JTextField txtObs34;
	private JTextField txtObs35;
	private JPanel panel_125;
	private JLabel lblComponente;
	private JLabel label_25;
	private JLabel label_26;
	private JPanel panel_126;
	private JPanel panel_127;
	private JTextField txtCantidad380;
	private JTextField txtCantidad381;
	private JTextField txtCantidad390;
	private JTextField txtCantidad391;
	private JTextField txtCantidad400;
	private JTextField txtCantidad401;
	private JPanel panel_130;
	private JPanel panel_131;
	private JTextField txtObs38;
	private JTextField txtObs39;
	private JTextField txtObs40;
	private JPanel panel_134;
	private JPanel panel_135;
	private JLabel lblPerfilSfTipo_1;
	private JLabel lblPuerta;
	private JLabel lblBisagras;
	private JLabel lblPerfilSfTipo;
	private JLabel label_24;
	private JPanel panel_128;
	private JTextField txtCantidad360;
	private JTextField txtCantidad361;
	private JPanel panel_129;
	private JTextField txtCantidad370;
	private JTextField txtCantidad371;
	private JPanel panel_132;
	private JTextField txtObs36;
	private JPanel panel_133;
	private JTextField txtObs37;
	private JPanel panel_45;
	private JPanel panel_46;
	private JLabel lblPanelesEpsPared_3;
	private JLabel lblPanelesEpsPared_4;
	private JLabel lblPanelesEpsPared_5;
	private JLabel lblPanelesEpsPared_6;
	private JLabel lblPanelesEpsPared_7;
	private JLabel lblPanelesEpsPared_8;
	private JLabel lblPanelesEpsPared_9;
	private JLabel lblFachadaFrontal_1;
	private JPanel panel_47;
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
	private JTextField txtCantidad500;
	private JTextField txtCantidad501;
	private JPanel panel_48;
	private JTextField txtObs44;
	private JTextField txtObs45;
	private JTextField txtObs46;
	private JTextField txtObs47;
	private JTextField txtObs48;
	private JTextField txtObs49;
	private JTextField txtObs50;
	private JLabel label_37;
	private JLabel label_38;
	private JPanel panel_49;
	private JPanel panel_50;
	private JLabel lblPanelHvarPared;
	private JLabel lblPanelHvarPared_1;
	private JLabel lblPanelesTcb;
	private JLabel lblPanelesVinilPiso;
	private JLabel lblPanelesEpsPara;
	private JLabel lblFachadaLateral;
	private JPanel panel_51;
	private JTextField txtCantidad560;
	private JTextField txtCantidad561;
	private JTextField txtCantidad570;
	private JTextField txtCantidad571;
	private JTextField txtCantidad580;
	private JTextField txtCantidad581;
	private JTextField txtCantidad590;
	private JTextField txtCantidad591;
	private JTextField txtCantidad600;
	private JTextField txtCantidad601;
	private JPanel panel_52;
	private JTextField txtObs56;
	private JTextField txtObs57;
	private JTextField txtObs58;
	private JTextField txtObs59;
	private JTextField txtObs60;
	private JLabel label_35;
	private JLabel label_36;
	private JPanel panel_53;
	private JPanel panel_54;
	private JLabel lblVentanasUpvcCon;
	private JLabel lblVentanasUpvcCon_1;
	private JLabel lblPerfilSfTipo_2;
	private JLabel lblComponenteArquitectnico;
	private JPanel panel_59;
	private JTextField txtCantidad610;
	private JTextField txtCantidad611;
	private JTextField txtCantidad620;
	private JTextField txtCantidad621;
	private JTextField txtCantidad630;
	private JTextField txtCantidad631;
	private JPanel panel_60;
	private JTextField txtObs61;
	private JTextField txtObs62;
	private JTextField txtObs63;
	private JLabel label_33;
	private JLabel label_34;
	private JPanel panel_61;
	private JPanel panel_62;
	private JLabel lblPerfilSfTipo_4;
	private JLabel lblPerfilSfTipo_5;
	private JLabel lblPanelesEpsPared_15;
	private JLabel lblPanelesEpsPared_16;
	private JLabel lblPanelesEpsPared_17;
	private JLabel lblPanelesEpsPared_18;
	private JLabel lblPanelesEpsPared_19;
	private JLabel lblPanelesEpsPared_20;
	private JLabel lblPanelesEpsPared_21;
	private JLabel lblPanelesEpsPared_22;
	private JLabel lblPanelesAlturaVariable;
	private JLabel lblPanelesTcbx;
	private JLabel lblComponenteArquitectnico_1;
	private JPanel panel_63;
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
	private JTextField txtCantidad710;
	private JTextField txtCantidad711;
	private JTextField txtCantidad720;
	private JTextField txtCantidad721;
	private JTextField txtCantidad730;
	private JTextField txtCantidad731;
	private JTextField txtCantidad740;
	private JTextField txtCantidad741;
	private JTextField txtCantidad750;
	private JTextField txtCantidad751;
	private JPanel panel_64;
	private JTextField txtObs64;
	private JTextField txtObs65;
	private JTextField txtObs66;
	private JTextField txtObs67;
	private JTextField txtObs68;
	private JTextField txtObs69;
	private JTextField txtObs70;
	private JTextField txtObs71;
	private JTextField txtObs72;
	private JTextField txtObs73;
	private JTextField txtObs74;
	private JTextField txtObs75;
	private JLabel label_48;
	private JLabel label_49;
	private JTextField txtObs76;
	private JTextField txtObs77;
	private JTextField txtObs78;
	private JTextField txtObs79;
	private JTextField txtObs80;
	private JTextField txtObs81;
	private JTextField txtObs82;
	private JTextField txtCantidad760;
	private JTextField txtCantidad761;
	private JTextField txtCantidad770;
	private JTextField txtCantidad771;
	private JTextField txtCantidad780;
	private JTextField txtCantidad781;
	private JTextField txtCantidad790;
	private JTextField txtCantidad791;
	private JTextField txtCantidad800;
	private JTextField txtCantidad801;
	private JTextField txtCantidad810;
	private JTextField txtCantidad811;
	private JTextField txtCantidad820;
	private JTextField txtCantidad821;
	private JLabel lblPanelesVinilPiso_1;
	private JLabel lblPanelesEpsPara_1;
	private JLabel lblPanelDivisorioUrinario;
	private JLabel lblPanelesDivisoresBat;
	private JLabel lblSetPuertasInteriores;
	private JLabel lblPuertasingresoBaos;
	private JLabel lblBisagras_1;
	private JTextField txtCantidad191;

	private TInformacionObligatoria infor;
	private TFicha ficha;
	private ServicioFicha servFicha;
	private String fotoInfoObl;

	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// MdTemplate frame = new MdTemplate();
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
	public MdTemplate(TFicha ficha) {
		this.ficha = ficha;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1320, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPcabecera pnlCabecera = new JPcabecera();
		contentPane.add(pnlCabecera.getCabecera());
		contentPane.setLayout(null);
		llenarCabecera(pnlCabecera);

		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setTitle(Utilitarios.getNombreFicha() + ficha.getFiNombre());
		servFicha = new ComponenteFicha();

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 126, 1286, 575);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		tabbedPane.addTab("1.-MD Administraci\u00F3n-1", null, panel, null);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 160, 414, 190);
		panel.add(panel_1);

		JLabel lblKitAguaLluvia = new JLabel("KIT  AGUA LLUVIA");
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
		panel_2.setBounds(210, 17, 56, 172);
		panel_1.add(panel_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 90, 55, 74);
		panel_2.add(panel_3);
		panel_3.setLayout(new GridLayout(3, 2, 0, 0));

		txtCantidad90 = new JTextField();
		txtCantidad90.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad90.setText("2");
		txtCantidad90.setEditable(false);
		txtCantidad90.setColumns(10);
		panel_3.add(txtCantidad90);

		txtCantidad91 = new JTextField();
		txtCantidad91.setColumns(10);
		panel_3.add(txtCantidad91);

		txtCantidad100 = new JTextField();
		txtCantidad100.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad100.setText("1");
		txtCantidad100.setEditable(false);
		txtCantidad100.setColumns(10);
		panel_3.add(txtCantidad100);

		txtCantidad101 = new JTextField();
		txtCantidad101.setColumns(10);
		panel_3.add(txtCantidad101);

		txtCantidad110 = new JTextField();
		txtCantidad110.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad110.setText("1");
		txtCantidad110.setEditable(false);
		txtCantidad110.setColumns(10);
		panel_3.add(txtCantidad110);

		txtCantidad111 = new JTextField();
		txtCantidad111.setColumns(10);
		panel_3.add(txtCantidad111);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 47, 55, 26);
		panel_2.add(panel_4);
		panel_4.setLayout(new GridLayout(1, 2, 0, 12));

		txtCantidad80 = new JTextField();
		txtCantidad80.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad80.setText("2");
		txtCantidad80.setEditable(false);
		txtCantidad80.setColumns(10);
		panel_4.add(txtCantidad80);

		txtCantidad81 = new JTextField();
		txtCantidad81.setColumns(10);
		panel_4.add(txtCantidad81);

		panel_89 = new JPanel();
		panel_89.setBounds(0, 0, 55, 45);
		panel_2.add(panel_89);
		panel_89.setLayout(new GridLayout(2, 2, 0, 0));

		txtCantidad60 = new JTextField();
		txtCantidad60.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad60.setText("3");
		txtCantidad60.setEditable(false);
		txtCantidad60.setColumns(10);
		panel_89.add(txtCantidad60);

		txtCantidad61 = new JTextField();
		txtCantidad61.setColumns(10);
		panel_89.add(txtCantidad61);

		txtCantidad70 = new JTextField();
		txtCantidad70.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad70.setText("1");
		txtCantidad70.setEditable(false);
		txtCantidad70.setColumns(10);
		panel_89.add(txtCantidad70);

		txtCantidad71 = new JTextField();
		txtCantidad71.setColumns(10);
		panel_89.add(txtCantidad71);

		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(267, 17, 143, 172);
		panel_1.add(panel_5);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 90, 143, 74);
		panel_5.add(panel_6);
		panel_6.setLayout(new GridLayout(3, 0, 0, 0));

		txtObs9 = new JTextField();
		txtObs9.setColumns(10);
		panel_6.add(txtObs9);

		txtObs10 = new JTextField();
		txtObs10.setColumns(10);
		panel_6.add(txtObs10);

		txtObs11 = new JTextField();
		txtObs11.setColumns(10);
		panel_6.add(txtObs11);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(0, 47, 143, 26);
		panel_5.add(panel_7);
		panel_7.setLayout(new GridLayout(1, 0, 0, 12));

		txtObs8 = new JTextField();
		txtObs8.setColumns(10);
		panel_7.add(txtObs8);

		panel_90 = new JPanel();
		panel_90.setBounds(0, 0, 143, 45);
		panel_5.add(panel_90);
		panel_90.setLayout(new GridLayout(2, 0, 0, 0));

		txtObs6 = new JTextField();
		txtObs6.setColumns(10);
		panel_90.add(txtObs6);

		txtObs7 = new JTextField();
		txtObs7.setColumns(10);
		panel_90.add(txtObs7);

		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBounds(3, 17, 199, 172);
		panel_1.add(panel_8);

		JPanel panel_9 = new JPanel();
		panel_9.setBounds(0, 89, 199, 80);
		panel_8.add(panel_9);
		panel_9.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel label_3 = new JLabel("Tuber\u00EDa de PVC 75 mm L=3m");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_9.add(label_3);

		JLabel label_4 = new JLabel("Tuber\u00EDa de PVC 75 mm L=0.6m");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_9.add(label_4);

		JLabel label_5 = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 75 mm. (lija pliego, polipega 1/4gal,1codo 90\u00B0)</body></html>");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_9.add(label_5);

		JPanel panel_10 = new JPanel();
		panel_10.setBounds(0, 45, 199, 45);
		panel_8.add(panel_10);
		panel_10.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel label_7 = new JLabel(
				"<html><body>Kit de Accesorios de Conexi\u00F3n Agua de Lluvia (2 rejilla,2 codos 90\u00B0,1/4 gl polipega, tornillos, abrazaderas)</body></html>");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_10.add(label_7);

		JPanel panel_88 = new JPanel();
		panel_88.setBounds(0, 0, 199, 45);
		panel_8.add(panel_88);
		panel_88.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblCanalPlsticoPvc = new JLabel("Canal Pl\u00E1stico PVC de L=3m");
		lblCanalPlsticoPvc.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_88.add(lblCanalPlsticoPvc);

		JLabel lblCanalPlsticoPvc_1 = new JLabel("Canal Pl\u00E1stico PVC de L=2.4m");
		lblCanalPlsticoPvc_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_88.add(lblCanalPlsticoPvc_1);

		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_11.setBounds(10, 4, 414, 155);
		panel.add(panel_11);

		JPanel panel_12 = new JPanel();
		panel_12.setBounds(3, 17, 199, 134);
		panel_11.add(panel_12);
		panel_12.setLayout(new GridLayout(6, 0, 0, 0));

		JLabel label_8 = new JLabel("Luminarias LED 60 w - 5000 lum");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_12.add(label_8);

		JLabel label_9 = new JLabel("Tomacorrientes");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_12.add(label_9);

		JLabel label_10 = new JLabel("Interruptor");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_12.add(label_10);

		JLabel lblSensorDeMovimiento = new JLabel("Sensor de movimiento");
		lblSensorDeMovimiento.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_12.add(lblSensorDeMovimiento);

		JLabel lblKitCableElctrico = new JLabel("Kit cable el\u00E9ctrico MA");
		lblKitCableElctrico.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_12.add(lblKitCableElctrico);

		JLabel label_126 = new JLabel("Detector de humo");
		label_126.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_12.add(label_126);

		JLabel label_13 = new JLabel("KIT EL\u00C9CTRICO");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_13.setBounds(3, 1, 176, 14);
		panel_11.add(label_13);

		JPanel panel_13 = new JPanel();
		panel_13.setBounds(210, 17, 55, 134);
		panel_11.add(panel_13);
		panel_13.setLayout(new GridLayout(6, 2, 0, 0));

		txtCantidad00 = new JTextField();
		txtCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad00.setText("11");
		txtCantidad00.setEditable(false);
		txtCantidad00.setColumns(10);
		panel_13.add(txtCantidad00);

		txtCantidad01 = new JTextField();
		txtCantidad01.setColumns(10);
		panel_13.add(txtCantidad01);

		txtCantidad10 = new JTextField();
		txtCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad10.setText("6");
		txtCantidad10.setEditable(false);
		txtCantidad10.setColumns(10);
		panel_13.add(txtCantidad10);

		txtCantidad11 = new JTextField();
		txtCantidad11.setColumns(10);
		panel_13.add(txtCantidad11);

		txtCantidad20 = new JTextField();
		txtCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad20.setText("1");
		txtCantidad20.setEditable(false);
		txtCantidad20.setColumns(10);
		panel_13.add(txtCantidad20);

		txtCantidad21 = new JTextField();
		txtCantidad21.setColumns(10);
		panel_13.add(txtCantidad21);

		txtCantidad30 = new JTextField();
		txtCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad30.setText("2");
		txtCantidad30.setEditable(false);
		txtCantidad30.setColumns(10);
		panel_13.add(txtCantidad30);

		txtCantidad31 = new JTextField();
		txtCantidad31.setColumns(10);
		panel_13.add(txtCantidad31);

		txtCantidad40 = new JTextField();
		txtCantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad40.setText("1");
		txtCantidad40.setEditable(false);
		txtCantidad40.setColumns(10);
		panel_13.add(txtCantidad40);

		txtCantidad41 = new JTextField();
		txtCantidad41.setColumns(10);
		panel_13.add(txtCantidad41);

		txtCantidad50 = new JTextField();
		txtCantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad50.setText("3");
		txtCantidad50.setEditable(false);
		txtCantidad50.setColumns(10);
		panel_13.add(txtCantidad50);

		txtCantidad51 = new JTextField();
		txtCantidad51.setColumns(10);
		panel_13.add(txtCantidad51);

		JPanel panel_14 = new JPanel();
		panel_14.setBounds(267, 17, 143, 134);
		panel_11.add(panel_14);
		panel_14.setLayout(new GridLayout(6, 0, 0, 0));

		txtObs0 = new JTextField();
		txtObs0.setColumns(10);
		panel_14.add(txtObs0);

		txtObs1 = new JTextField();
		txtObs1.setColumns(10);
		panel_14.add(txtObs1);

		txtObs2 = new JTextField();
		txtObs2.setColumns(10);
		panel_14.add(txtObs2);

		txtObs3 = new JTextField();
		txtObs3.setColumns(10);
		panel_14.add(txtObs3);

		txtObs4 = new JTextField();
		txtObs4.setColumns(10);
		panel_14.add(txtObs4);

		txtObs5 = new JTextField();
		txtObs5.setColumns(10);
		panel_14.add(txtObs5);

		JLabel label_14 = new JLabel("Cantidad");
		label_14.setBounds(210, 1, 55, 14);
		panel_11.add(label_14);

		JLabel label_15 = new JLabel("Observaci\u00F3n/Referencia");
		label_15.setBounds(267, 1, 143, 14);
		panel_11.add(label_15);

		JPanel panel_24 = new JPanel();
		panel_24.setLayout(null);
		panel_24.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_24.setBounds(858, 429, 414, 85);
		panel.add(panel_24);

		JPanel panel_25 = new JPanel();
		panel_25.setBounds(3, 17, 199, 67);
		panel_24.add(panel_25);
		panel_25.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel lblPanelesEpsPared = new JLabel("Paneles EPS pared - (1xHvar. mt)");
		lblPanelesEpsPared.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_25.add(lblPanelesEpsPared);

		JLabel lblPanelesEpsPared_1 = new JLabel("Paneles EPS pared - (1x2.85 mt)");
		lblPanelesEpsPared_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_25.add(lblPanelesEpsPared_1);

		JLabel lblPanelesEpsPared_2 = new JLabel("Paneles EPS pared - (0,40x2.85 mt)");
		lblPanelesEpsPared_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_25.add(lblPanelesEpsPared_2);

		JLabel lblParedesInternas = new JLabel("PAREDES INTERNAS");
		lblParedesInternas.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblParedesInternas.setBounds(3, 1, 211, 14);
		panel_24.add(lblParedesInternas);

		JPanel panel_26 = new JPanel();
		panel_26.setBounds(210, 17, 55, 67);
		panel_24.add(panel_26);
		panel_26.setLayout(new GridLayout(3, 2, 0, 0));

		txtCantidad410 = new JTextField();
		txtCantidad410.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad410.setText("4");
		txtCantidad410.setEditable(false);
		txtCantidad410.setColumns(10);
		panel_26.add(txtCantidad410);

		txtCantidad411 = new JTextField();
		txtCantidad411.setColumns(10);
		panel_26.add(txtCantidad411);

		txtCantidad420 = new JTextField();
		txtCantidad420.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad420.setText("2");
		txtCantidad420.setEditable(false);
		txtCantidad420.setColumns(10);
		panel_26.add(txtCantidad420);

		txtCantidad421 = new JTextField();
		txtCantidad421.setColumns(10);
		panel_26.add(txtCantidad421);

		txtCantidad430 = new JTextField();
		txtCantidad430.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad430.setText("1");
		txtCantidad430.setEditable(false);
		txtCantidad430.setColumns(10);
		panel_26.add(txtCantidad430);

		txtCantidad431 = new JTextField();
		txtCantidad431.setColumns(10);
		panel_26.add(txtCantidad431);

		JPanel panel_27 = new JPanel();
		panel_27.setBounds(267, 17, 143, 67);
		panel_24.add(panel_27);
		panel_27.setLayout(new GridLayout(3, 0, 0, 0));

		txtObs41 = new JTextField();
		txtObs41.setColumns(10);
		panel_27.add(txtObs41);

		txtObs42 = new JTextField();
		txtObs42.setColumns(10);
		panel_27.add(txtObs42);

		txtObs43 = new JTextField();
		txtObs43.setColumns(10);
		panel_27.add(txtObs43);

		JLabel label_28 = new JLabel("Cantidad");
		label_28.setBounds(210, 1, 55, 14);
		panel_24.add(label_28);

		JLabel label_29 = new JLabel("Observaci\u00F3n/Referencia");
		label_29.setBounds(267, 1, 143, 14);
		panel_24.add(label_29);

		panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_15.setBounds(10, 355, 414, 85);
		panel.add(panel_15);

		panel_16 = new JPanel();
		panel_16.setBounds(3, 17, 199, 67);
		panel_15.add(panel_16);
		panel_16.setLayout(new GridLayout(3, 0, 0, 0));

		lblInodoros = new JLabel("Inodoros");
		lblInodoros.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_16.add(lblInodoros);

		lblUrinarios = new JLabel("Urinarios");
		lblUrinarios.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_16.add(lblUrinarios);

		lblLavabos = new JLabel("Lavabos");
		lblLavabos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_16.add(lblLavabos);

		lblKitHidrosanitario = new JLabel("KIT HIDROSANITARIO");
		lblKitHidrosanitario.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKitHidrosanitario.setBounds(3, 1, 211, 14);
		panel_15.add(lblKitHidrosanitario);

		panel_17 = new JPanel();
		panel_17.setBounds(210, 17, 55, 67);
		panel_15.add(panel_17);
		panel_17.setLayout(new GridLayout(3, 2, 0, 0));

		txtCantidad120 = new JTextField();
		txtCantidad120.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad120.setText("3");
		txtCantidad120.setEditable(false);
		txtCantidad120.setColumns(10);
		panel_17.add(txtCantidad120);

		txtCantidad121 = new JTextField();
		txtCantidad121.setColumns(10);
		panel_17.add(txtCantidad121);

		txtCantidad130 = new JTextField();
		txtCantidad130.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad130.setText("1");
		txtCantidad130.setEditable(false);
		txtCantidad130.setColumns(10);
		panel_17.add(txtCantidad130);

		txtCantidad131 = new JTextField();
		txtCantidad131.setColumns(10);
		panel_17.add(txtCantidad131);

		txtCantidad140 = new JTextField();
		txtCantidad140.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad140.setText("2");
		txtCantidad140.setEditable(false);
		txtCantidad140.setColumns(10);
		panel_17.add(txtCantidad140);

		txtCantidad141 = new JTextField();
		txtCantidad141.setColumns(10);
		panel_17.add(txtCantidad141);

		panel_18 = new JPanel();
		panel_18.setBounds(267, 17, 143, 67);
		panel_15.add(panel_18);
		panel_18.setLayout(new GridLayout(3, 0, 0, 0));

		txtObs12 = new JTextField();
		txtObs12.setColumns(10);
		panel_18.add(txtObs12);

		txtObs13 = new JTextField();
		txtObs13.setColumns(10);
		panel_18.add(txtObs13);

		txtObs14 = new JTextField();
		txtObs14.setColumns(10);
		panel_18.add(txtObs14);

		label_17 = new JLabel("Cantidad");
		label_17.setBounds(210, 1, 55, 14);
		panel_15.add(label_17);

		label_18 = new JLabel("Observaci\u00F3n/Referencia");
		label_18.setBounds(267, 1, 143, 14);
		panel_15.add(label_18);

		panel_19 = new JPanel();
		panel_19.setLayout(null);
		panel_19.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_19.setBounds(10, 444, 414, 104);
		panel.add(panel_19);

		panel_20 = new JPanel();
		panel_20.setBounds(3, 17, 199, 86);
		panel_19.add(panel_20);
		panel_20.setLayout(new GridLayout(1, 0, 0, 0));

		lblKitDeAccesorios = new JLabel(
				"<html><body>Kit de Accesorios de Conexi\u00F3n Agua Potable (Inodoros)(2 te reducciones 1-1/2  ,  2 neplos,4 uniones de 1/2,4 codos de 90\u00B0,2 mangueras de abasto,2 llave de paso , 1 rollo tefl\u00F3n, 2 tubos de pasta selladora)</body></html>");
		lblKitDeAccesorios.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_20.add(lblKitDeAccesorios);

		label_6 = new JLabel("KIT AGUA POTABLE");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_6.setBounds(3, 1, 176, 14);
		panel_19.add(label_6);

		panel_21 = new JPanel();
		panel_21.setBounds(210, 43, 55, 25);
		panel_19.add(panel_21);
		panel_21.setLayout(new GridLayout(1, 1, 0, 0));

		txtCantidad150 = new JTextField();
		txtCantidad150.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad150.setText("2");
		txtCantidad150.setEditable(false);
		txtCantidad150.setColumns(10);
		panel_21.add(txtCantidad150);

		txtCantidad151 = new JTextField();
		txtCantidad151.setColumns(10);
		panel_21.add(txtCantidad151);

		panel_22 = new JPanel();
		panel_22.setBounds(267, 43, 143, 25);
		panel_19.add(panel_22);
		panel_22.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs15 = new JTextField();
		txtObs15.setColumns(10);
		panel_22.add(txtObs15);

		label_11 = new JLabel("Cantidad");
		label_11.setBounds(210, 1, 55, 14);
		panel_19.add(label_11);

		label_12 = new JLabel("Observaci\u00F3n/Referencia");
		label_12.setBounds(267, 1, 143, 14);
		panel_19.add(label_12);

		panel_99 = new JPanel();
		panel_99.setLayout(null);
		panel_99.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_99.setBounds(434, 322, 414, 226);
		panel.add(panel_99);

		lblKitAguaResidual = new JLabel("KIT AGUA RESIDUAL");
		lblKitAguaResidual.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKitAguaResidual.setBounds(3, 1, 176, 14);
		panel_99.add(lblKitAguaResidual);

		label_20 = new JLabel("Cantidad");
		label_20.setBounds(210, 1, 55, 14);
		panel_99.add(label_20);

		label_21 = new JLabel("Observaci\u00F3n/Referencia");
		label_21.setBounds(267, 1, 143, 14);
		panel_99.add(label_21);

		panel_100 = new JPanel();
		panel_100.setLayout(null);
		panel_100.setBounds(210, 17, 55, 207);
		panel_99.add(panel_100);

		panel_101 = new JPanel();
		panel_101.setBounds(0, 11, 55, 26);
		panel_100.add(panel_101);
		panel_101.setLayout(new GridLayout(1, 2, 0, 1));

		txtCantidad240 = new JTextField();
		txtCantidad240.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad240.setText("2");
		txtCantidad240.setEditable(false);
		txtCantidad240.setColumns(10);
		panel_101.add(txtCantidad240);

		txtCantidad241 = new JTextField();
		txtCantidad241.setColumns(10);
		panel_101.add(txtCantidad241);

		panel_103 = new JPanel();
		panel_103.setBounds(0, 51, 55, 26);
		panel_100.add(panel_103);
		panel_103.setLayout(new GridLayout(1, 2, 0, 1));

		txtCantidad250 = new JTextField();
		txtCantidad250.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad250.setText("2");
		txtCantidad250.setEditable(false);
		txtCantidad250.setColumns(10);
		panel_103.add(txtCantidad250);

		txtCantidad251 = new JTextField();
		txtCantidad251.setColumns(10);
		panel_103.add(txtCantidad251);

		panel_104 = new JPanel();
		panel_104.setBounds(0, 84, 55, 46);
		panel_100.add(panel_104);
		panel_104.setLayout(new GridLayout(2, 2, 0, 0));

		txtCantidad260 = new JTextField();
		txtCantidad260.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad260.setText("1");
		txtCantidad260.setEditable(false);
		txtCantidad260.setColumns(10);
		panel_104.add(txtCantidad260);

		txtCantidad261 = new JTextField();
		txtCantidad261.setColumns(10);
		panel_104.add(txtCantidad261);

		txtCantidad270 = new JTextField();
		txtCantidad270.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad270.setText("1");
		txtCantidad270.setEditable(false);
		txtCantidad270.setColumns(10);
		panel_104.add(txtCantidad270);

		txtCantidad271 = new JTextField();
		txtCantidad271.setColumns(10);
		panel_104.add(txtCantidad271);

		panel_105 = new JPanel();
		panel_105.setBounds(0, 145, 55, 25);
		panel_100.add(panel_105);
		panel_105.setLayout(new GridLayout(1, 1, 0, 0));

		txtCantidad280 = new JTextField();
		txtCantidad280.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad280.setText("1");
		txtCantidad280.setEditable(false);
		txtCantidad280.setColumns(10);
		panel_105.add(txtCantidad280);

		txtCantidad281 = new JTextField();
		txtCantidad281.setColumns(10);
		panel_105.add(txtCantidad281);

		panel_108 = new JPanel();
		panel_108.setBounds(0, 178, 55, 25);
		panel_100.add(panel_108);
		panel_108.setLayout(new GridLayout(1, 1, 0, 0));

		txtCantidad290 = new JTextField();
		txtCantidad290.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad290.setText("1");
		txtCantidad290.setEditable(false);
		txtCantidad290.setColumns(10);
		panel_108.add(txtCantidad290);

		txtCantidad291 = new JTextField();
		txtCantidad291.setColumns(10);
		panel_108.add(txtCantidad291);

		panel_106 = new JPanel();
		panel_106.setLayout(null);
		panel_106.setBounds(267, 17, 143, 207);
		panel_99.add(panel_106);

		panel_107 = new JPanel();
		panel_107.setBounds(0, 11, 143, 26);
		panel_106.add(panel_107);
		panel_107.setLayout(new GridLayout(1, 0, 0, 1));

		txtObs24 = new JTextField();
		txtObs24.setColumns(10);
		panel_107.add(txtObs24);

		panel_109 = new JPanel();
		panel_109.setBounds(0, 51, 143, 26);
		panel_106.add(panel_109);
		panel_109.setLayout(new GridLayout(1, 0, 0, 1));

		txtObs25 = new JTextField();
		txtObs25.setColumns(10);
		panel_109.add(txtObs25);

		panel_110 = new JPanel();
		panel_110.setBounds(0, 84, 143, 45);
		panel_106.add(panel_110);
		panel_110.setLayout(new GridLayout(2, 0, 0, 0));

		txtObs26 = new JTextField();
		txtObs26.setColumns(10);
		panel_110.add(txtObs26);

		txtObs27 = new JTextField();
		txtObs27.setColumns(10);
		panel_110.add(txtObs27);

		panel_111 = new JPanel();
		panel_111.setBounds(0, 145, 143, 25);
		panel_106.add(panel_111);
		panel_111.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs28 = new JTextField();
		txtObs28.setColumns(10);
		panel_111.add(txtObs28);

		panel_113 = new JPanel();
		panel_113.setBounds(0, 178, 143, 25);
		panel_106.add(panel_113);
		panel_113.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs29 = new JTextField();
		txtObs29.setColumns(10);
		panel_113.add(txtObs29);

		panel_112 = new JPanel();
		panel_112.setLayout(null);
		panel_112.setBounds(3, 17, 205, 207);
		panel_99.add(panel_112);

		lblKitDeAccesorios_3 = new JLabel(
				"<html><body>Kit de Accesorios de Conexi\u00F3n Agua Residual (CP)(2 codo 90\u00B0,2 rejilla,2 ye 75-110,1/4gl polipega)</body></html>");
		lblKitDeAccesorios_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblKitDeAccesorios_3.setBounds(0, 0, 205, 42);
		panel_112.add(lblKitDeAccesorios_3);

		lblKitDeAccesorios_4 = new JLabel(
				"<html><body>Kit de Accesorios de Conexi\u00F3n Agua Residual (Lavabos)( 2codo 90\u00B0,1/4 gl polipega ,2 yee 50-110)</body></html>");
		lblKitDeAccesorios_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblKitDeAccesorios_4.setBounds(0, 42, 205, 42);
		panel_112.add(lblKitDeAccesorios_4);

		panel_114 = new JPanel();
		panel_114.setBounds(0, 84, 205, 47);
		panel_112.add(panel_114);
		panel_114.setLayout(new GridLayout(2, 0, 0, 0));

		lblTuberaDePvc_4 = new JLabel("Tuber\u00EDa de PVC  50mm PVC y L=3m");
		lblTuberaDePvc_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_114.add(lblTuberaDePvc_4);

		lblTuberaDePvc_5 = new JLabel("Tuber\u00EDa de PVC  50mm PVC y L=1.5m");
		lblTuberaDePvc_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_114.add(lblTuberaDePvc_5);

		panel_115 = new JPanel();
		panel_115.setBounds(0, 132, 205, 46);
		panel_112.add(panel_115);
		panel_115.setLayout(new GridLayout(1, 0, 0, 0));

		lblKitDeAccesorios_5 = new JLabel(
				"<html><body>Kit de Accesorios de Conexi\u00F3n Agua Residual (Urinarios)((1codo 90\u00B0, 1/4 gl polipega , 1 yee 50-110)</body></html>");
		lblKitDeAccesorios_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_115.add(lblKitDeAccesorios_5);

		panel_102 = new JPanel();
		panel_102.setBounds(0, 178, 205, 25);
		panel_112.add(panel_102);
		panel_102.setLayout(new GridLayout(1, 0, 0, 0));

		lblTuberaDePvc_6 = new JLabel("Tuber\u00EDa de PVC  75mm PVC y L=3m");
		lblTuberaDePvc_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_102.add(lblTuberaDePvc_6);

		panel_23 = new JPanel();
		panel_23.setBounds(434, 4, 414, 314);
		panel.add(panel_23);
		panel_23.setLayout(null);
		panel_23.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		lblKitAguaPotable = new JLabel("KIT AGUA POTABLE");
		lblKitAguaPotable.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKitAguaPotable.setBounds(3, 1, 176, 14);
		panel_23.add(lblKitAguaPotable);

		label_16 = new JLabel("Cantidad");
		label_16.setBounds(210, 1, 55, 14);
		panel_23.add(label_16);

		label_19 = new JLabel("Observaci\u00F3n/Referencia");
		label_19.setBounds(267, 1, 143, 14);
		panel_23.add(label_19);

		panel_28 = new JPanel();
		panel_28.setLayout(null);
		panel_28.setBounds(210, 17, 55, 296);
		panel_23.add(panel_28);

		panel_30 = new JPanel();
		panel_30.setBounds(0, 30, 55, 26);
		panel_28.add(panel_30);
		panel_30.setLayout(new GridLayout(1, 2, 0, 1));

		txtCantidad160 = new JTextField();
		txtCantidad160.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad160.setText("3");
		txtCantidad160.setEditable(false);
		txtCantidad160.setColumns(10);
		panel_30.add(txtCantidad160);

		txtCantidad161 = new JTextField();
		txtCantidad161.setColumns(10);
		panel_30.add(txtCantidad161);

		panel_29 = new JPanel();
		panel_29.setBounds(0, 70, 55, 45);
		panel_28.add(panel_29);
		panel_29.setLayout(new GridLayout(2, 2, 0, 0));

		txtCantidad170 = new JTextField();
		txtCantidad170.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad170.setText("1");
		txtCantidad170.setEditable(false);
		txtCantidad170.setColumns(10);
		panel_29.add(txtCantidad170);

		txtCantidad171 = new JTextField();
		txtCantidad171.setColumns(10);
		panel_29.add(txtCantidad171);

		txtCantidad180 = new JTextField();
		txtCantidad180.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad180.setText("1");
		txtCantidad180.setEditable(false);
		txtCantidad180.setColumns(10);
		panel_29.add(txtCantidad180);

		txtCantidad181 = new JTextField();
		txtCantidad181.setColumns(10);
		panel_29.add(txtCantidad181);

		panel_91 = new JPanel();
		panel_91.setBounds(0, 148, 55, 26);
		panel_28.add(panel_91);
		panel_91.setLayout(new GridLayout(1, 2, 0, 1));

		txtCantidad190 = new JTextField();
		txtCantidad190.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad190.setText("1");
		txtCantidad190.setEditable(false);
		txtCantidad190.setColumns(10);
		panel_91.add(txtCantidad190);

		txtCantidad191 = new JTextField();
		txtCantidad191.setColumns(10);
		panel_91.add(txtCantidad191);

		panel_94 = new JPanel();
		panel_94.setBounds(0, 180, 55, 77);
		panel_28.add(panel_94);
		panel_94.setLayout(new GridLayout(3, 2, 0, 0));

		txtCantidad200 = new JTextField();
		txtCantidad200.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad200.setText("3");
		txtCantidad200.setEditable(false);
		txtCantidad200.setColumns(10);
		panel_94.add(txtCantidad200);

		txtCantidad201 = new JTextField();
		txtCantidad201.setColumns(10);
		panel_94.add(txtCantidad201);

		txtCantidad210 = new JTextField();
		txtCantidad210.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad210.setText("1");
		txtCantidad210.setEditable(false);
		txtCantidad210.setColumns(10);
		panel_94.add(txtCantidad210);

		txtCantidad211 = new JTextField();
		txtCantidad211.setColumns(10);
		panel_94.add(txtCantidad211);

		txtCantidad220 = new JTextField();
		txtCantidad220.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad220.setText("1");
		txtCantidad220.setEditable(false);
		txtCantidad220.setColumns(10);
		panel_94.add(txtCantidad220);

		txtCantidad221 = new JTextField();
		txtCantidad221.setColumns(10);
		panel_94.add(txtCantidad221);

		panel_97 = new JPanel();
		panel_97.setBounds(0, 263, 55, 25);
		panel_28.add(panel_97);
		panel_97.setLayout(new GridLayout(1, 1, 0, 0));

		txtCantidad230 = new JTextField();
		txtCantidad230.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad230.setText("1");
		txtCantidad230.setEditable(false);
		txtCantidad230.setColumns(10);
		panel_97.add(txtCantidad230);

		txtCantidad231 = new JTextField();
		txtCantidad231.setColumns(10);
		panel_97.add(txtCantidad231);

		panel_32 = new JPanel();
		panel_32.setLayout(null);
		panel_32.setBounds(267, 17, 143, 296);
		panel_23.add(panel_32);

		panel_33 = new JPanel();
		panel_33.setBounds(0, 30, 143, 26);
		panel_32.add(panel_33);
		panel_33.setLayout(new GridLayout(1, 0, 0, 1));

		txtObs16 = new JTextField();
		txtObs16.setColumns(10);
		panel_33.add(txtObs16);

		panel_31 = new JPanel();
		panel_31.setBounds(0, 70, 143, 45);
		panel_32.add(panel_31);
		panel_31.setLayout(new GridLayout(2, 0, 0, 0));

		txtObs17 = new JTextField();
		txtObs17.setColumns(10);
		panel_31.add(txtObs17);

		txtObs18 = new JTextField();
		txtObs18.setColumns(10);
		panel_31.add(txtObs18);

		panel_92 = new JPanel();
		panel_92.setBounds(0, 148, 143, 26);
		panel_32.add(panel_92);
		panel_92.setLayout(new GridLayout(1, 0, 0, 1));

		txtObs19 = new JTextField();
		txtObs19.setColumns(10);
		panel_92.add(txtObs19);

		panel_95 = new JPanel();
		panel_95.setBounds(0, 180, 143, 77);
		panel_32.add(panel_95);
		panel_95.setLayout(new GridLayout(3, 0, 0, 0));

		txtObs20 = new JTextField();
		txtObs20.setColumns(10);
		panel_95.add(txtObs20);

		txtObs21 = new JTextField();
		txtObs21.setColumns(10);
		panel_95.add(txtObs21);

		txtObs22 = new JTextField();
		txtObs22.setColumns(10);
		panel_95.add(txtObs22);

		panel_98 = new JPanel();
		panel_98.setBounds(0, 263, 143, 25);
		panel_32.add(panel_98);
		panel_98.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs23 = new JTextField();
		txtObs23.setColumns(10);
		panel_98.add(txtObs23);

		panel_34 = new JPanel();
		panel_34.setLayout(null);
		panel_34.setBounds(3, 17, 205, 296);
		panel_23.add(panel_34);

		lblKitDeAccesorios_1 = new JLabel(
				"<html><body>Kit de Accesorios de Conexi\u00F3n Agua Potable (Lavabos)(3  te reducciones 1-1/2  ,  3 neplos,6 uniones de 1/2,6 codos de 90\u00B0,3 mangueras de abasto,3 llave de paso, tefl\u00F3n, pasta selladora)</body></html>");
		lblKitDeAccesorios_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblKitDeAccesorios_1.setBounds(0, 0, 205, 70);
		panel_34.add(lblKitDeAccesorios_1);

		panel_35 = new JPanel();
		panel_35.setBounds(0, 70, 205, 45);
		panel_34.add(panel_35);
		panel_35.setLayout(new GridLayout(0, 1, 0, 0));

		lblTuberaDePvc = new JLabel("Tuber\u00EDa de PVC  1/2\" y L=3m");
		lblTuberaDePvc.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_35.add(lblTuberaDePvc);

		lblTuberaDePvc_1 = new JLabel("Tuber\u00EDa de PVC  1/2\" y L=1.5");
		lblTuberaDePvc_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_35.add(lblTuberaDePvc_1);

		lblKitDeAccesorios_2 = new JLabel(
				"<html><body>Kit de Accesorios de Conexi\u00F3n Agua Potable (Urinarios)(1  te reducciones 1-1/2  ,  1 neplos,1 uniones de 1/2,   2codos de 90\u00B0,1 mangueras de abasto,1 llave de paso, tefl\u00F3n, pasta selladora)</body></html>");
		lblKitDeAccesorios_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblKitDeAccesorios_2.setBounds(0, 115, 205, 65);
		panel_34.add(lblKitDeAccesorios_2);

		panel_93 = new JPanel();
		panel_93.setBounds(0, 180, 205, 77);
		panel_34.add(panel_93);
		panel_93.setLayout(new GridLayout(3, 0, 0, 0));

		lblTuberaDePvc_2 = new JLabel("Tuber\u00EDa de PVC  1\" y L= 3m");
		lblTuberaDePvc_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_93.add(lblTuberaDePvc_2);

		lblTuberaDePvc_3 = new JLabel("Tuber\u00EDa de PVC  1\" y L= 2.20M");
		lblTuberaDePvc_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_93.add(lblTuberaDePvc_3);

		lblKitParaConexin = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 1/2\". (lija pliego, polipega 1/4gal,2 uniones)</body></html>");
		lblKitParaConexin.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_93.add(lblKitParaConexin);

		panel_96 = new JPanel();
		panel_96.setBounds(0, 257, 205, 36);
		panel_34.add(panel_96);
		panel_96.setLayout(new GridLayout(1, 0, 0, 0));

		lblKitParaConexin_1 = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 1\". (lija pliego,polipega 1/4gal,2 uniones)</body></html>");
		lblKitParaConexin_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_96.add(lblKitParaConexin_1);

		JPanel panel_36 = new JPanel();
		panel_36.setLayout(null);
		panel_36.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_36.setBounds(858, 4, 414, 257);
		panel.add(panel_36);

		JLabel label = new JLabel("KIT AGUA RESIDUAL");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(3, 1, 176, 14);
		panel_36.add(label);

		JLabel label_22 = new JLabel("Cantidad");
		label_22.setBounds(210, 1, 55, 14);
		panel_36.add(label_22);

		JLabel label_23 = new JLabel("Observaci\u00F3n/Referencia");
		label_23.setBounds(267, 1, 143, 14);
		panel_36.add(label_23);

		JPanel panel_37 = new JPanel();
		panel_37.setLayout(null);
		panel_37.setBounds(210, 17, 55, 237);
		panel_36.add(panel_37);

		JPanel panel_38 = new JPanel();
		panel_38.setBounds(0, 11, 55, 26);
		panel_37.add(panel_38);
		panel_38.setLayout(new GridLayout(1, 2, 0, 1));

		txtCantidad300 = new JTextField();
		txtCantidad300.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad300.setText("3");
		txtCantidad300.setEditable(false);
		txtCantidad300.setColumns(10);
		panel_38.add(txtCantidad300);

		txtCantidad301 = new JTextField();
		txtCantidad301.setColumns(10);
		panel_38.add(txtCantidad301);

		JPanel panel_39 = new JPanel();
		panel_39.setBounds(0, 107, 55, 26);
		panel_37.add(panel_39);
		panel_39.setLayout(new GridLayout(1, 2, 0, 1));

		txtCantidad330 = new JTextField();
		txtCantidad330.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad330.setText("1");
		txtCantidad330.setEditable(false);
		txtCantidad330.setColumns(10);
		panel_39.add(txtCantidad330);

		txtCantidad331 = new JTextField();
		txtCantidad331.setColumns(10);
		panel_39.add(txtCantidad331);

		JPanel panel_40 = new JPanel();
		panel_40.setBounds(0, 50, 55, 46);
		panel_37.add(panel_40);
		panel_40.setLayout(new GridLayout(2, 2, 0, 0));

		txtCantidad310 = new JTextField();
		txtCantidad310.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad310.setText("3");
		txtCantidad310.setEditable(false);
		txtCantidad310.setColumns(10);
		panel_40.add(txtCantidad310);

		txtCantidad311 = new JTextField();
		txtCantidad311.setColumns(10);
		panel_40.add(txtCantidad311);

		txtCantidad320 = new JTextField();
		txtCantidad320.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad320.setText("1");
		txtCantidad320.setEditable(false);
		txtCantidad320.setColumns(10);
		panel_40.add(txtCantidad320);

		txtCantidad321 = new JTextField();
		txtCantidad321.setColumns(10);
		panel_40.add(txtCantidad321);

		JPanel panel_41 = new JPanel();
		panel_41.setBounds(0, 150, 55, 25);
		panel_37.add(panel_41);
		panel_41.setLayout(new GridLayout(1, 1, 0, 0));

		txtCantidad340 = new JTextField();
		txtCantidad340.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad340.setText("1");
		txtCantidad340.setEditable(false);
		txtCantidad340.setColumns(10);
		panel_41.add(txtCantidad340);

		txtCantidad341 = new JTextField();
		txtCantidad341.setColumns(10);
		panel_41.add(txtCantidad341);

		JPanel panel_42 = new JPanel();
		panel_42.setBounds(0, 187, 55, 25);
		panel_37.add(panel_42);
		panel_42.setLayout(new GridLayout(1, 1, 0, 0));

		txtCantidad350 = new JTextField();
		txtCantidad350.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad350.setText("1");
		txtCantidad350.setEditable(false);
		txtCantidad350.setColumns(10);
		panel_42.add(txtCantidad350);

		txtCantidad351 = new JTextField();
		txtCantidad351.setColumns(10);
		panel_42.add(txtCantidad351);

		JPanel panel_43 = new JPanel();
		panel_43.setLayout(null);
		panel_43.setBounds(267, 17, 143, 237);
		panel_36.add(panel_43);

		JPanel panel_116 = new JPanel();
		panel_116.setBounds(0, 11, 143, 26);
		panel_43.add(panel_116);
		panel_116.setLayout(new GridLayout(1, 0, 0, 1));

		txtObs30 = new JTextField();
		txtObs30.setColumns(10);
		panel_116.add(txtObs30);

		JPanel panel_117 = new JPanel();
		panel_117.setBounds(0, 107, 143, 26);
		panel_43.add(panel_117);
		panel_117.setLayout(new GridLayout(1, 0, 0, 1));

		txtObs33 = new JTextField();
		txtObs33.setColumns(10);
		panel_117.add(txtObs33);

		JPanel panel_118 = new JPanel();
		panel_118.setBounds(0, 50, 143, 45);
		panel_43.add(panel_118);
		panel_118.setLayout(new GridLayout(2, 0, 0, 0));

		txtObs31 = new JTextField();
		txtObs31.setColumns(10);
		panel_118.add(txtObs31);

		txtObs32 = new JTextField();
		txtObs32.setColumns(10);
		panel_118.add(txtObs32);

		JPanel panel_119 = new JPanel();
		panel_119.setBounds(0, 150, 143, 25);
		panel_43.add(panel_119);
		panel_119.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs34 = new JTextField();
		txtObs34.setColumns(10);
		panel_119.add(txtObs34);

		JPanel panel_120 = new JPanel();
		panel_120.setBounds(0, 187, 143, 25);
		panel_43.add(panel_120);
		panel_120.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs35 = new JTextField();
		txtObs35.setColumns(10);
		panel_120.add(txtObs35);

		JPanel panel_121 = new JPanel();
		panel_121.setLayout(null);
		panel_121.setBounds(3, 17, 205, 237);
		panel_36.add(panel_121);

		JLabel lblKitDeAccesorios_6 = new JLabel(
				"<html><body>Kit de Accesorios de Conexi\u00F3n Agua Residual (Inodoros)(1/4 gl polipega ,3 yee 110)</body></html>");
		lblKitDeAccesorios_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblKitDeAccesorios_6.setBounds(0, 0, 205, 47);
		panel_121.add(lblKitDeAccesorios_6);

		JPanel panel_122 = new JPanel();
		panel_122.setBounds(0, 46, 205, 47);
		panel_121.add(panel_122);
		panel_122.setLayout(new GridLayout(2, 0, 0, 0));

		JLabel lblTuberaDePvc_7 = new JLabel("Tuber\u00EDa de PVC  110mm PVC y L=3m");
		lblTuberaDePvc_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_122.add(lblTuberaDePvc_7);

		JLabel lblTuberaDePvc_8 = new JLabel("Tuber\u00EDa de PVC  110mm PVC y L=1m");
		lblTuberaDePvc_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_122.add(lblTuberaDePvc_8);

		JPanel panel_123 = new JPanel();
		panel_123.setBounds(0, 140, 205, 46);
		panel_121.add(panel_123);
		panel_123.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblKitParaConexin_3 = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 75 mm. (lija pliego, polipega 1/2gal,1/4 gl suelda l\u00EDquida, 2 uniones,2codo 90\u00B0,2codo45\u00B0)</body></html>");
		lblKitParaConexin_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_123.add(lblKitParaConexin_3);

		JPanel panel_124 = new JPanel();
		panel_124.setBounds(0, 187, 205, 45);
		panel_121.add(panel_124);
		panel_124.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblKitParaConexin_4 = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 110 mm. (lija pliego, polipega 1/2gal, 1/4 gl suelda l\u00EDquida , 2 uniones,2codo 90\u00B0,2codo 45\u00B0)</body></html>");
		lblKitParaConexin_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_124.add(lblKitParaConexin_4);

		JLabel lblKitParaConexin_2 = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 50 mm. (lija  un pliego, polipega 1/4 gal, 1/4 gl suelda l\u00EDquida, 2 uniones,2codo 90\u00B0,2codo45\u00B0)</body></html>");
		lblKitParaConexin_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblKitParaConexin_2.setBounds(0, 93, 205, 47);
		panel_121.add(lblKitParaConexin_2);

		panel_125 = new JPanel();
		panel_125.setLayout(null);
		panel_125.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_125.setBounds(858, 259, 414, 167);
		panel.add(panel_125);

		lblComponente = new JLabel("COMPONENTE ARQUITECTÓNICO");
		lblComponente.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComponente.setBounds(3, 1, 176, 14);
		panel_125.add(lblComponente);

		label_25 = new JLabel("Cantidad");
		label_25.setBounds(210, 1, 55, 14);
		panel_125.add(label_25);

		label_26 = new JLabel("Observaci\u00F3n/Referencia");
		label_26.setBounds(267, 1, 143, 14);
		panel_125.add(label_26);

		panel_126 = new JPanel();
		panel_126.setLayout(null);
		panel_126.setBounds(210, 17, 56, 147);
		panel_125.add(panel_126);

		panel_127 = new JPanel();
		panel_127.setBounds(0, 72, 55, 74);
		panel_126.add(panel_127);
		panel_127.setLayout(new GridLayout(3, 2, 0, 0));

		txtCantidad380 = new JTextField();
		txtCantidad380.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad380.setText("3");
		txtCantidad380.setEditable(false);
		txtCantidad380.setColumns(10);
		panel_127.add(txtCantidad380);

		txtCantidad381 = new JTextField();
		txtCantidad381.setColumns(10);
		panel_127.add(txtCantidad381);

		txtCantidad390 = new JTextField();
		txtCantidad390.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad390.setText("1");
		txtCantidad390.setEditable(false);
		txtCantidad390.setColumns(10);
		panel_127.add(txtCantidad390);

		txtCantidad391 = new JTextField();
		txtCantidad391.setColumns(10);
		panel_127.add(txtCantidad391);

		txtCantidad400 = new JTextField();
		txtCantidad400.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad400.setText("3");
		txtCantidad400.setEditable(false);
		txtCantidad400.setColumns(10);
		panel_127.add(txtCantidad400);

		txtCantidad401 = new JTextField();
		txtCantidad401.setColumns(10);
		panel_127.add(txtCantidad401);

		panel_128 = new JPanel();
		panel_128.setBounds(0, 0, 55, 26);
		panel_126.add(panel_128);
		panel_128.setLayout(new GridLayout(1, 2, 0, 1));

		txtCantidad360 = new JTextField();
		txtCantidad360.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad360.setText("1");
		txtCantidad360.setEditable(false);
		txtCantidad360.setColumns(10);
		panel_128.add(txtCantidad360);

		txtCantidad361 = new JTextField();
		txtCantidad361.setColumns(10);
		panel_128.add(txtCantidad361);

		panel_129 = new JPanel();
		panel_129.setBounds(0, 34, 55, 26);
		panel_126.add(panel_129);
		panel_129.setLayout(new GridLayout(1, 2, 0, 1));

		txtCantidad370 = new JTextField();
		txtCantidad370.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad370.setText("3");
		txtCantidad370.setEditable(false);
		txtCantidad370.setColumns(10);
		panel_129.add(txtCantidad370);

		txtCantidad371 = new JTextField();
		txtCantidad371.setColumns(10);
		panel_129.add(txtCantidad371);

		panel_130 = new JPanel();
		panel_130.setLayout(null);
		panel_130.setBounds(267, 17, 143, 147);
		panel_125.add(panel_130);

		panel_131 = new JPanel();
		panel_131.setBounds(0, 72, 143, 74);
		panel_130.add(panel_131);
		panel_131.setLayout(new GridLayout(3, 0, 0, 0));

		txtObs38 = new JTextField();
		txtObs38.setColumns(10);
		panel_131.add(txtObs38);

		txtObs39 = new JTextField();
		txtObs39.setColumns(10);
		panel_131.add(txtObs39);

		txtObs40 = new JTextField();
		txtObs40.setColumns(10);
		panel_131.add(txtObs40);

		panel_132 = new JPanel();
		panel_132.setBounds(0, 0, 143, 26);
		panel_130.add(panel_132);
		panel_132.setLayout(new GridLayout(1, 0, 0, 1));

		txtObs36 = new JTextField();
		txtObs36.setColumns(10);
		panel_132.add(txtObs36);

		panel_133 = new JPanel();
		panel_133.setBounds(0, 34, 143, 26);
		panel_130.add(panel_133);
		panel_133.setLayout(new GridLayout(1, 0, 0, 1));

		txtObs37 = new JTextField();
		txtObs37.setColumns(10);
		panel_133.add(txtObs37);

		panel_134 = new JPanel();
		panel_134.setLayout(null);
		panel_134.setBounds(3, 17, 199, 147);
		panel_125.add(panel_134);

		panel_135 = new JPanel();
		panel_135.setBounds(0, 69, 199, 80);
		panel_134.add(panel_135);
		panel_135.setLayout(new GridLayout(0, 1, 0, 0));

		lblPerfilSfTipo_1 = new JLabel("Perfil SF Tipo 12 para ventana");
		lblPerfilSfTipo_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_135.add(lblPerfilSfTipo_1);

		lblPuerta = new JLabel("Puerta");
		lblPuerta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_135.add(lblPuerta);

		lblBisagras = new JLabel("Bisagras");
		lblBisagras.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_135.add(lblBisagras);

		lblPerfilSfTipo = new JLabel("Perfil SF Tipo 12 MA-SF-12, para puerta");
		lblPerfilSfTipo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPerfilSfTipo.setBounds(0, 0, 205, 23);
		panel_134.add(lblPerfilSfTipo);

		label_24 = new JLabel(
				"<html><body>Ventana corredera, compuesta por tres hojas y dos carriles. UPVC con vidrio flotado de 3 mm de  3x1,10 m</body></html>");
		label_24.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_24.setBounds(0, 23, 199, 45);
		panel_134.add(label_24);

		JPanel panel_44 = new JPanel();
		panel_44.setLayout(null);
		tabbedPane.addTab("2.-MD Administraci\u00F3n-1", null, panel_44, null);

		JPanel panel_55 = new JPanel();
		panel_55.setLayout(null);
		panel_55.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_55.setBounds(10, 170, 414, 127);
		panel_44.add(panel_55);

		JPanel panel_56 = new JPanel();
		panel_56.setBounds(3, 17, 205, 106);
		panel_55.add(panel_56);
		panel_56.setLayout(new GridLayout(5, 0, 0, 0));

		JLabel lblPanelesEpsPared_10 = new JLabel("Paneles EPS pared - (1x2,70 x0,90  m)");
		lblPanelesEpsPared_10.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_56.add(lblPanelesEpsPared_10);

		JLabel lblPanelesEpsPared_11 = new JLabel("Paneles EPS pared - (0,90x2,70 x0,90  m)");
		lblPanelesEpsPared_11.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_56.add(lblPanelesEpsPared_11);

		JLabel lblPanelesEpsPared_12 = new JLabel("Paneles EPS pared - (1,0x1,10 x0,90  m)");
		lblPanelesEpsPared_12.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_56.add(lblPanelesEpsPared_12);

		JLabel lblPanelesEpsPared_13 = new JLabel("Paneles EPS pared - (0,50 x0,90  m)");
		lblPanelesEpsPared_13.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_56.add(lblPanelesEpsPared_13);

		JLabel lblPanelesEpsPared_14 = new JLabel("Paneles EPS pared - (1x1,80 x0,90  m)");
		lblPanelesEpsPared_14.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_56.add(lblPanelesEpsPared_14);

		JLabel lblFachadaFrontal = new JLabel("FACHADA POSTERIOR");
		lblFachadaFrontal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFachadaFrontal.setBounds(3, 1, 176, 14);
		panel_55.add(lblFachadaFrontal);

		JPanel panel_57 = new JPanel();
		panel_57.setBounds(210, 17, 55, 106);
		panel_55.add(panel_57);
		panel_57.setLayout(new GridLayout(5, 2, 0, 0));

		txtCantidad510 = new JTextField();
		txtCantidad510.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad510.setText("3");
		txtCantidad510.setEditable(false);
		txtCantidad510.setColumns(10);
		panel_57.add(txtCantidad510);

		txtCantidad511 = new JTextField();
		txtCantidad511.setColumns(10);
		panel_57.add(txtCantidad511);

		txtCantidad520 = new JTextField();
		txtCantidad520.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad520.setText("1");
		txtCantidad520.setEditable(false);
		txtCantidad520.setColumns(10);
		panel_57.add(txtCantidad520);

		txtCantidad521 = new JTextField();
		txtCantidad521.setColumns(10);
		panel_57.add(txtCantidad521);

		txtCantidad530 = new JTextField();
		txtCantidad530.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad530.setText("6");
		txtCantidad530.setEditable(false);
		txtCantidad530.setColumns(10);
		panel_57.add(txtCantidad530);

		txtCantidad531 = new JTextField();
		txtCantidad531.setColumns(10);
		panel_57.add(txtCantidad531);

		txtCantidad540 = new JTextField();
		txtCantidad540.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad540.setText("6");
		txtCantidad540.setEditable(false);
		txtCantidad540.setColumns(10);
		panel_57.add(txtCantidad540);

		txtCantidad541 = new JTextField();
		txtCantidad541.setColumns(10);
		panel_57.add(txtCantidad541);

		txtCantidad550 = new JTextField();
		txtCantidad550.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad550.setText("1");
		txtCantidad550.setEditable(false);
		txtCantidad550.setColumns(10);
		panel_57.add(txtCantidad550);

		txtCantidad551 = new JTextField();
		txtCantidad551.setColumns(10);
		panel_57.add(txtCantidad551);

		JPanel panel_58 = new JPanel();
		panel_58.setBounds(267, 17, 143, 106);
		panel_55.add(panel_58);
		panel_58.setLayout(new GridLayout(5, 0, 0, 0));

		txtObs51 = new JTextField();
		txtObs51.setColumns(10);
		panel_58.add(txtObs51);

		txtObs52 = new JTextField();
		txtObs52.setColumns(10);
		panel_58.add(txtObs52);

		txtObs53 = new JTextField();
		txtObs53.setColumns(10);
		panel_58.add(txtObs53);

		txtObs54 = new JTextField();
		txtObs54.setColumns(10);
		panel_58.add(txtObs54);

		txtObs55 = new JTextField();
		txtObs55.setColumns(10);
		panel_58.add(txtObs55);

		JLabel label_77 = new JLabel("Cantidad");
		label_77.setBounds(210, 1, 55, 14);
		panel_55.add(label_77);

		JLabel label_78 = new JLabel("Observaci\u00F3n/Referencia");
		label_78.setBounds(267, 1, 143, 14);
		panel_55.add(label_78);

		JPanel panel_80 = new JPanel();
		panel_80.setLayout(null);
		panel_80.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_80.setBounds(858, 4, 414, 321);
		panel_44.add(panel_80);

		JPanel panel_81 = new JPanel();
		panel_81.setBounds(3, 17, 199, 300);
		panel_80.add(panel_81);
		panel_81.setLayout(new GridLayout(12, 0, 0, 0));

		JLabel label_107 = new JLabel("Dados cimentaci\u00F3n");
		label_107.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_81.add(label_107);

		JLabel label_108 = new JLabel("Perfil SF Tipo 1");
		label_108.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_81.add(label_108);

		JLabel label_109 = new JLabel("Perfil SF Tipo 2");
		label_109.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_81.add(label_109);

		JLabel label_110 = new JLabel("Perfil SF Tipo 3");
		label_110.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_81.add(label_110);

		JLabel label_111 = new JLabel("Perfil SF Tipo 4");
		label_111.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_81.add(label_111);

		JLabel label_112 = new JLabel("Perfil SF Tipo 5");
		label_112.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_81.add(label_112);

		JLabel label_113 = new JLabel("Perfil SF Tipo 6");
		label_113.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_81.add(label_113);

		JLabel lblPerfilSfTipo_3 = new JLabel("Perfil SF Tipo 7 - piso");
		lblPerfilSfTipo_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_81.add(lblPerfilSfTipo_3);

		JLabel label_115 = new JLabel("Perfil SF Tipo 8");
		label_115.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_81.add(label_115);

		JLabel label_116 = new JLabel("Perfil SF Tipo 9");
		label_116.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_81.add(label_116);

		JLabel label_117 = new JLabel("Perfil SF Tipo 10");
		label_117.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_81.add(label_117);

		JLabel label_118 = new JLabel("Perfil SF Tipo 11");
		label_118.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_81.add(label_118);

		JLabel label_119 = new JLabel("COMPONENTE ESTRUCTURAL");
		label_119.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_119.setBounds(3, 1, 176, 14);
		panel_80.add(label_119);

		JPanel panel_82 = new JPanel();
		panel_82.setBounds(210, 17, 55, 300);
		panel_80.add(panel_82);
		panel_82.setLayout(new GridLayout(12, 2, 0, 0));

		txtCantidad830 = new JTextField();
		txtCantidad830.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad830.setText("21");
		txtCantidad830.setEditable(false);
		txtCantidad830.setColumns(10);
		panel_82.add(txtCantidad830);

		txtCantidad831 = new JTextField();
		txtCantidad831.setColumns(10);
		panel_82.add(txtCantidad831);

		txtCantidad840 = new JTextField();
		txtCantidad840.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad840.setText("2");
		txtCantidad840.setEditable(false);
		txtCantidad840.setColumns(10);
		panel_82.add(txtCantidad840);

		txtCantidad841 = new JTextField();
		txtCantidad841.setColumns(10);
		panel_82.add(txtCantidad841);

		txtCantidad850 = new JTextField();
		txtCantidad850.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad850.setText("2");
		txtCantidad850.setEditable(false);
		txtCantidad850.setColumns(10);
		panel_82.add(txtCantidad850);

		txtCantidad851 = new JTextField();
		txtCantidad851.setColumns(10);
		panel_82.add(txtCantidad851);

		txtCantidad860 = new JTextField();
		txtCantidad860.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad860.setText("20");
		txtCantidad860.setEditable(false);
		txtCantidad860.setColumns(10);
		panel_82.add(txtCantidad860);

		txtCantidad861 = new JTextField();
		txtCantidad861.setColumns(10);
		panel_82.add(txtCantidad861);

		txtCantidad870 = new JTextField();
		txtCantidad870.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad870.setText("6");
		txtCantidad870.setEditable(false);
		txtCantidad870.setColumns(10);
		panel_82.add(txtCantidad870);

		txtCantidad871 = new JTextField();
		txtCantidad871.setColumns(10);
		panel_82.add(txtCantidad871);

		txtCantidad880 = new JTextField();
		txtCantidad880.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad880.setText("40");
		txtCantidad880.setEditable(false);
		txtCantidad880.setColumns(10);
		panel_82.add(txtCantidad880);

		txtCantidad881 = new JTextField();
		txtCantidad881.setColumns(10);
		panel_82.add(txtCantidad881);

		txtCantidad890 = new JTextField();
		txtCantidad890.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad890.setText("40");
		txtCantidad890.setEditable(false);
		txtCantidad890.setColumns(10);
		panel_82.add(txtCantidad890);

		txtCantidad891 = new JTextField();
		txtCantidad891.setColumns(10);
		panel_82.add(txtCantidad891);

		txtCantidad900 = new JTextField();
		txtCantidad900.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad900.setText("2");
		txtCantidad900.setEditable(false);
		txtCantidad900.setColumns(10);
		panel_82.add(txtCantidad900);

		txtCantidad901 = new JTextField();
		txtCantidad901.setColumns(10);
		panel_82.add(txtCantidad901);

		txtCantidad910 = new JTextField();
		txtCantidad910.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad910.setText("2");
		txtCantidad910.setEditable(false);
		txtCantidad910.setColumns(10);
		panel_82.add(txtCantidad910);

		txtCantidad911 = new JTextField();
		txtCantidad911.setColumns(10);
		panel_82.add(txtCantidad911);

		txtCantidad920 = new JTextField();
		txtCantidad920.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad920.setText("20");
		txtCantidad920.setEditable(false);
		txtCantidad920.setColumns(10);
		panel_82.add(txtCantidad920);

		txtCantidad921 = new JTextField();
		txtCantidad921.setColumns(10);
		panel_82.add(txtCantidad921);

		txtCantidad930 = new JTextField();
		txtCantidad930.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad930.setText("6");
		txtCantidad930.setEditable(false);
		txtCantidad930.setColumns(10);
		panel_82.add(txtCantidad930);

		txtCantidad931 = new JTextField();
		txtCantidad931.setColumns(10);
		panel_82.add(txtCantidad931);

		txtCantidad940 = new JTextField();
		txtCantidad940.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad940.setText("40");
		txtCantidad940.setEditable(false);
		txtCantidad940.setColumns(10);
		panel_82.add(txtCantidad940);

		txtCantidad941 = new JTextField();
		txtCantidad941.setColumns(10);
		panel_82.add(txtCantidad941);

		JPanel panel_83 = new JPanel();
		panel_83.setBounds(267, 17, 143, 300);
		panel_80.add(panel_83);
		panel_83.setLayout(new GridLayout(12, 0, 0, 0));

		txtObs83 = new JTextField();
		txtObs83.setColumns(10);
		panel_83.add(txtObs83);

		txtObs84 = new JTextField();
		txtObs84.setColumns(10);
		panel_83.add(txtObs84);

		txtObs85 = new JTextField();
		txtObs85.setColumns(10);
		panel_83.add(txtObs85);

		txtObs86 = new JTextField();
		txtObs86.setColumns(10);
		panel_83.add(txtObs86);

		txtObs87 = new JTextField();
		txtObs87.setColumns(10);
		panel_83.add(txtObs87);

		txtObs88 = new JTextField();
		txtObs88.setColumns(10);
		panel_83.add(txtObs88);

		txtObs89 = new JTextField();
		txtObs89.setColumns(10);
		panel_83.add(txtObs89);

		txtObs90 = new JTextField();
		txtObs90.setColumns(10);
		panel_83.add(txtObs90);

		txtObs91 = new JTextField();
		txtObs91.setColumns(10);
		panel_83.add(txtObs91);

		txtObs92 = new JTextField();
		txtObs92.setColumns(10);
		panel_83.add(txtObs92);

		txtObs93 = new JTextField();
		txtObs93.setColumns(10);
		panel_83.add(txtObs93);

		txtObs94 = new JTextField();
		txtObs94.setColumns(10);
		panel_83.add(txtObs94);

		JLabel label_120 = new JLabel("Cantidad");
		label_120.setBounds(210, 1, 55, 14);
		panel_80.add(label_120);

		JLabel label_121 = new JLabel("Observaci\u00F3n/Referencia");
		label_121.setBounds(267, 1, 143, 14);
		panel_80.add(label_121);

		panel_45 = new JPanel();
		panel_45.setLayout(null);
		panel_45.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_45.setBounds(10, 4, 414, 162);
		panel_44.add(panel_45);

		panel_46 = new JPanel();
		panel_46.setBounds(3, 17, 199, 144);
		panel_45.add(panel_46);
		panel_46.setLayout(new GridLayout(7, 0, 0, 0));

		lblPanelesEpsPared_3 = new JLabel("Paneles EPS pared -   ( 1x3x0,09 m)");
		lblPanelesEpsPared_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_46.add(lblPanelesEpsPared_3);

		lblPanelesEpsPared_4 = new JLabel("Paneles EPS pared -   ( 1x0,90x0,90 m)");
		lblPanelesEpsPared_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_46.add(lblPanelesEpsPared_4);

		lblPanelesEpsPared_5 = new JLabel("Paneles EPS pared -   ( 1x1,10x0,09 m)");
		lblPanelesEpsPared_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_46.add(lblPanelesEpsPared_5);

		lblPanelesEpsPared_6 = new JLabel("Paneles EPS pared -   ( 1x0,80x0,09 m)");
		lblPanelesEpsPared_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_46.add(lblPanelesEpsPared_6);

		lblPanelesEpsPared_7 = new JLabel("Paneles EPS pared -   ( 1x0,80 x0,90  m)");
		lblPanelesEpsPared_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_46.add(lblPanelesEpsPared_7);

		lblPanelesEpsPared_8 = new JLabel("Paneles EPS pared -   ( 1x0,75x0,09 m)");
		lblPanelesEpsPared_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_46.add(lblPanelesEpsPared_8);

		lblPanelesEpsPared_9 = new JLabel("Paneles EPS pared -   ( 1x0,40x0,09 m)");
		lblPanelesEpsPared_9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_46.add(lblPanelesEpsPared_9);

		lblFachadaFrontal_1 = new JLabel("FACHADA FRONTAL");
		lblFachadaFrontal_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFachadaFrontal_1.setBounds(3, 1, 176, 14);
		panel_45.add(lblFachadaFrontal_1);

		panel_47 = new JPanel();
		panel_47.setBounds(210, 17, 55, 144);
		panel_45.add(panel_47);
		panel_47.setLayout(new GridLayout(7, 2, 0, 0));

		txtCantidad440 = new JTextField();
		txtCantidad440.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad440.setText("6");
		txtCantidad440.setEditable(false);
		txtCantidad440.setColumns(10);
		panel_47.add(txtCantidad440);

		txtCantidad441 = new JTextField();
		txtCantidad441.setColumns(10);
		panel_47.add(txtCantidad441);

		txtCantidad450 = new JTextField();
		txtCantidad450.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad450.setText("1");
		txtCantidad450.setEditable(false);
		txtCantidad450.setColumns(10);
		panel_47.add(txtCantidad450);

		txtCantidad451 = new JTextField();
		txtCantidad451.setColumns(10);
		panel_47.add(txtCantidad451);

		txtCantidad460 = new JTextField();
		txtCantidad460.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad460.setText("3");
		txtCantidad460.setEditable(false);
		txtCantidad460.setColumns(10);
		panel_47.add(txtCantidad460);

		txtCantidad461 = new JTextField();
		txtCantidad461.setColumns(10);
		panel_47.add(txtCantidad461);

		txtCantidad470 = new JTextField();
		txtCantidad470.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad470.setText("3");
		txtCantidad470.setEditable(false);
		txtCantidad470.setColumns(10);
		panel_47.add(txtCantidad470);

		txtCantidad471 = new JTextField();
		txtCantidad471.setColumns(10);
		panel_47.add(txtCantidad471);

		txtCantidad480 = new JTextField();
		txtCantidad480.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad480.setText("1");
		txtCantidad480.setEditable(false);
		txtCantidad480.setColumns(10);
		panel_47.add(txtCantidad480);

		txtCantidad481 = new JTextField();
		txtCantidad481.setColumns(10);
		panel_47.add(txtCantidad481);

		txtCantidad490 = new JTextField();
		txtCantidad490.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad490.setText("1");
		txtCantidad490.setEditable(false);
		txtCantidad490.setColumns(10);
		panel_47.add(txtCantidad490);

		txtCantidad491 = new JTextField();
		txtCantidad491.setColumns(10);
		panel_47.add(txtCantidad491);

		txtCantidad500 = new JTextField();
		txtCantidad500.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad500.setText("1");
		txtCantidad500.setEditable(false);
		txtCantidad500.setColumns(10);
		panel_47.add(txtCantidad500);

		txtCantidad501 = new JTextField();
		txtCantidad501.setColumns(10);
		panel_47.add(txtCantidad501);

		panel_48 = new JPanel();
		panel_48.setBounds(267, 17, 143, 144);
		panel_45.add(panel_48);
		panel_48.setLayout(new GridLayout(7, 0, 0, 0));

		txtObs44 = new JTextField();
		txtObs44.setColumns(10);
		panel_48.add(txtObs44);

		txtObs45 = new JTextField();
		txtObs45.setColumns(10);
		panel_48.add(txtObs45);

		txtObs46 = new JTextField();
		txtObs46.setColumns(10);
		panel_48.add(txtObs46);

		txtObs47 = new JTextField();
		txtObs47.setColumns(10);
		panel_48.add(txtObs47);

		txtObs48 = new JTextField();
		txtObs48.setColumns(10);
		panel_48.add(txtObs48);

		txtObs49 = new JTextField();
		txtObs49.setColumns(10);
		panel_48.add(txtObs49);

		txtObs50 = new JTextField();
		txtObs50.setColumns(10);
		panel_48.add(txtObs50);

		label_37 = new JLabel("Cantidad");
		label_37.setBounds(210, 1, 55, 14);
		panel_45.add(label_37);

		label_38 = new JLabel("Observaci\u00F3n/Referencia");
		label_38.setBounds(267, 1, 143, 14);
		panel_45.add(label_38);

		panel_49 = new JPanel();
		panel_49.setLayout(null);
		panel_49.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_49.setBounds(10, 302, 414, 134);
		panel_44.add(panel_49);

		panel_50 = new JPanel();
		panel_50.setBounds(3, 17, 205, 113);
		panel_49.add(panel_50);
		panel_50.setLayout(new GridLayout(5, 0, 0, 0));

		lblPanelHvarPared = new JLabel("Panel Hvar- pared laterales izq");
		lblPanelHvarPared.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_50.add(lblPanelHvarPared);

		lblPanelHvarPared_1 = new JLabel("<html><body>Panel Hvar- pared laterales derecha adosada</body></html>");
		lblPanelHvarPared_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_50.add(lblPanelHvarPared_1);

		lblPanelesTcb = new JLabel("Paneles TCB");
		lblPanelesTcb.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_50.add(lblPanelesTcb);

		lblPanelesVinilPiso = new JLabel("Paneles vinil piso (0,15x1,93mts)");
		lblPanelesVinilPiso.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_50.add(lblPanelesVinilPiso);

		lblPanelesEpsPara = new JLabel("Paneles EPS para cubierta l=7, a= 1mt");
		lblPanelesEpsPara.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_50.add(lblPanelesEpsPara);

		lblFachadaLateral = new JLabel("FACHADA LATERAL");
		lblFachadaLateral.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFachadaLateral.setBounds(3, 1, 176, 14);
		panel_49.add(lblFachadaLateral);

		panel_51 = new JPanel();
		panel_51.setBounds(210, 17, 55, 113);
		panel_49.add(panel_51);
		panel_51.setLayout(new GridLayout(5, 2, 0, 0));

		txtCantidad560 = new JTextField();
		txtCantidad560.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad560.setText("6");
		txtCantidad560.setEditable(false);
		txtCantidad560.setColumns(10);
		panel_51.add(txtCantidad560);

		txtCantidad561 = new JTextField();
		txtCantidad561.setColumns(10);
		panel_51.add(txtCantidad561);

		txtCantidad570 = new JTextField();
		txtCantidad570.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad570.setText("6");
		txtCantidad570.setEditable(false);
		txtCantidad570.setColumns(10);
		panel_51.add(txtCantidad570);

		txtCantidad571 = new JTextField();
		txtCantidad571.setColumns(10);
		panel_51.add(txtCantidad571);

		txtCantidad580 = new JTextField();
		txtCantidad580.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad580.setText("1");
		txtCantidad580.setEditable(false);
		txtCantidad580.setColumns(10);
		panel_51.add(txtCantidad580);

		txtCantidad581 = new JTextField();
		txtCantidad581.setColumns(10);
		panel_51.add(txtCantidad581);

		txtCantidad590 = new JTextField();
		txtCantidad590.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad590.setText("224");
		txtCantidad590.setEditable(false);
		txtCantidad590.setColumns(10);
		panel_51.add(txtCantidad590);

		txtCantidad591 = new JTextField();
		txtCantidad591.setColumns(10);
		panel_51.add(txtCantidad591);

		txtCantidad600 = new JTextField();
		txtCantidad600.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad600.setText("9");
		txtCantidad600.setEditable(false);
		txtCantidad600.setColumns(10);
		panel_51.add(txtCantidad600);

		txtCantidad601 = new JTextField();
		txtCantidad601.setColumns(10);
		panel_51.add(txtCantidad601);

		panel_52 = new JPanel();
		panel_52.setBounds(267, 17, 143, 113);
		panel_49.add(panel_52);
		panel_52.setLayout(new GridLayout(5, 0, 0, 0));

		txtObs56 = new JTextField();
		txtObs56.setColumns(10);
		panel_52.add(txtObs56);

		txtObs57 = new JTextField();
		txtObs57.setColumns(10);
		panel_52.add(txtObs57);

		txtObs58 = new JTextField();
		txtObs58.setColumns(10);
		panel_52.add(txtObs58);

		txtObs59 = new JTextField();
		txtObs59.setColumns(10);
		panel_52.add(txtObs59);

		txtObs60 = new JTextField();
		txtObs60.setColumns(10);
		panel_52.add(txtObs60);

		label_35 = new JLabel("Cantidad");
		label_35.setBounds(210, 1, 55, 14);
		panel_49.add(label_35);

		label_36 = new JLabel("Observaci\u00F3n/Referencia");
		label_36.setBounds(267, 1, 143, 14);
		panel_49.add(label_36);

		panel_53 = new JPanel();
		panel_53.setLayout(null);
		panel_53.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_53.setBounds(10, 442, 414, 102);
		panel_44.add(panel_53);

		panel_54 = new JPanel();
		panel_54.setBounds(3, 17, 199, 83);
		panel_53.add(panel_54);
		panel_54.setLayout(new GridLayout(3, 0, 0, 0));

		lblVentanasUpvcCon = new JLabel(
				"<html><body>Ventanas UPVC con vidrio flotado de 3 mm de 0,45x1,0 mt ( frontal - posterior)</body></html>");
		lblVentanasUpvcCon.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_54.add(lblVentanasUpvcCon);

		lblVentanasUpvcCon_1 = new JLabel(
				"<html><body>Ventanas UPVC con vidrio flotado de 3 mm de  0,45x1,0 mt (lateral no adosada)</body></html>");
		lblVentanasUpvcCon_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_54.add(lblVentanasUpvcCon_1);

		lblPerfilSfTipo_2 = new JLabel("Perfil SF Tipo 12 MD-SF-12 para ventana");
		lblPerfilSfTipo_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_54.add(lblPerfilSfTipo_2);

		lblComponenteArquitectnico = new JLabel("COMPONENTE ARQUITECT\u00D3NICO");
		lblComponenteArquitectnico.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComponenteArquitectnico.setBounds(3, 1, 211, 14);
		panel_53.add(lblComponenteArquitectnico);

		panel_59 = new JPanel();
		panel_59.setBounds(210, 17, 55, 83);
		panel_53.add(panel_59);
		panel_59.setLayout(new GridLayout(3, 2, 0, 0));

		txtCantidad610 = new JTextField();
		txtCantidad610.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad610.setText("2");
		txtCantidad610.setEditable(false);
		txtCantidad610.setColumns(10);
		panel_59.add(txtCantidad610);

		txtCantidad611 = new JTextField();
		txtCantidad611.setColumns(10);
		panel_59.add(txtCantidad611);

		txtCantidad620 = new JTextField();
		txtCantidad620.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad620.setText("2");
		txtCantidad620.setEditable(false);
		txtCantidad620.setColumns(10);
		panel_59.add(txtCantidad620);

		txtCantidad621 = new JTextField();
		txtCantidad621.setColumns(10);
		panel_59.add(txtCantidad621);

		txtCantidad630 = new JTextField();
		txtCantidad630.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad630.setText("16");
		txtCantidad630.setEditable(false);
		txtCantidad630.setColumns(10);
		panel_59.add(txtCantidad630);

		txtCantidad631 = new JTextField();
		txtCantidad631.setColumns(10);
		panel_59.add(txtCantidad631);

		panel_60 = new JPanel();
		panel_60.setBounds(267, 17, 143, 83);
		panel_53.add(panel_60);
		panel_60.setLayout(new GridLayout(3, 0, 0, 0));

		txtObs61 = new JTextField();
		txtObs61.setColumns(10);
		panel_60.add(txtObs61);

		txtObs62 = new JTextField();
		txtObs62.setColumns(10);
		panel_60.add(txtObs62);

		txtObs63 = new JTextField();
		txtObs63.setColumns(10);
		panel_60.add(txtObs63);

		label_33 = new JLabel("Cantidad");
		label_33.setBounds(210, 1, 55, 14);
		panel_53.add(label_33);

		label_34 = new JLabel("Observaci\u00F3n/Referencia");
		label_34.setBounds(267, 1, 143, 14);
		panel_53.add(label_34);

		panel_61 = new JPanel();
		panel_61.setLayout(null);
		panel_61.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_61.setBounds(434, 4, 414, 540);
		panel_44.add(panel_61);

		panel_62 = new JPanel();
		panel_62.setBounds(3, 17, 199, 523);
		panel_61.add(panel_62);
		panel_62.setLayout(new GridLayout(19, 0, 0, 0));

		lblPerfilSfTipo_4 = new JLabel("Perfil SF Tipo 12 MD-SF-12 para paredes");
		lblPerfilSfTipo_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_62.add(lblPerfilSfTipo_4);

		lblPerfilSfTipo_5 = new JLabel("Perfil SF Tipo 12 MD-SF-12 para puertas");
		lblPerfilSfTipo_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_62.add(lblPerfilSfTipo_5);

		lblPanelesEpsPared_15 = new JLabel(
				"<html><body>Paneles EPS pared-  fachada posterior (1x2.70 mt)</body></html>");
		lblPanelesEpsPared_15.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_62.add(lblPanelesEpsPared_15);

		lblPanelesEpsPared_16 = new JLabel(
				"<html><body>Paneles EPS pared- ventana posterior ( 1x.1.80 mt)</body></html>");
		lblPanelesEpsPared_16.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_62.add(lblPanelesEpsPared_16);

		lblPanelesEpsPared_17 = new JLabel(
				"<html><body>Paneles EPS pared - ventana posterior ( 1x 0.45mt)</body></html>");
		lblPanelesEpsPared_17.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_62.add(lblPanelesEpsPared_17);

		lblPanelesEpsPared_18 = new JLabel(
				"<html><body>Paneles EPS pared- fachada posterior  ( 2.70x0.40 mt)</body></html>");
		lblPanelesEpsPared_18.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_62.add(lblPanelesEpsPared_18);

		lblPanelesEpsPared_19 = new JLabel("<html><body>Paneles EPS pared - fachada frontal  ( 1x3 mt)</body></html>");
		lblPanelesEpsPared_19.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_62.add(lblPanelesEpsPared_19);

		lblPanelesEpsPared_20 = new JLabel(
				"<html><body>Paneles EPS pared - ventana frontal  ( 1x0.75 mt)</body></html>");
		lblPanelesEpsPared_20.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_62.add(lblPanelesEpsPared_20);

		lblPanelesEpsPared_21 = new JLabel(
				"<html><body>Paneles EPS pared- ventana frontal  ( 1x1.80 mt)</body></html>");
		lblPanelesEpsPared_21.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_62.add(lblPanelesEpsPared_21);

		lblPanelesEpsPared_22 = new JLabel(
				"<html><body>Paneles EPS pared- fachada frontal  ( 3x0.40 mt)</body></html>");
		lblPanelesEpsPared_22.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_62.add(lblPanelesEpsPared_22);

		lblPanelesAlturaVariable = new JLabel("Paneles altura variable- pared laterales");
		lblPanelesAlturaVariable.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_62.add(lblPanelesAlturaVariable);

		lblPanelesTcbx = new JLabel("Paneles TCB (11,10x5,80)");
		lblPanelesTcbx.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_62.add(lblPanelesTcbx);

		lblPanelesVinilPiso_1 = new JLabel("Paneles vinil piso (0,15x1,93mts)");
		lblPanelesVinilPiso_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_62.add(lblPanelesVinilPiso_1);

		lblPanelesEpsPara_1 = new JLabel("Paneles EPS para cubierta L7");
		lblPanelesEpsPara_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_62.add(lblPanelesEpsPara_1);

		lblPanelDivisorioUrinario = new JLabel("Panel divisorio urinario");
		lblPanelDivisorioUrinario.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_62.add(lblPanelDivisorioUrinario);

		lblPanelesDivisoresBat = new JLabel("Paneles divisores bat. Sanitarias");
		lblPanelesDivisoresBat.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_62.add(lblPanelesDivisoresBat);

		lblSetPuertasInteriores = new JLabel("Set puertas interiores bater\u00EDas sanitarias");
		lblSetPuertasInteriores.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_62.add(lblSetPuertasInteriores);

		lblPuertasingresoBaos = new JLabel("Puertas (Ingreso ba\u00F1os)");
		lblPuertasingresoBaos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_62.add(lblPuertasingresoBaos);

		lblBisagras_1 = new JLabel("Bisagras");
		lblBisagras_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_62.add(lblBisagras_1);

		lblComponenteArquitectnico_1 = new JLabel("COMPONENTE ARQUITECT\u00D3NICO");
		lblComponenteArquitectnico_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComponenteArquitectnico_1.setBounds(3, 1, 199, 14);
		panel_61.add(lblComponenteArquitectnico_1);

		panel_63 = new JPanel();
		panel_63.setBounds(210, 17, 55, 523);
		panel_61.add(panel_63);
		panel_63.setLayout(new GridLayout(19, 2, 0, 0));

		txtCantidad640 = new JTextField();
		txtCantidad640.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad640.setText("8");
		txtCantidad640.setEditable(false);
		txtCantidad640.setColumns(10);
		panel_63.add(txtCantidad640);

		txtCantidad641 = new JTextField();
		txtCantidad641.setColumns(10);
		panel_63.add(txtCantidad641);

		txtCantidad650 = new JTextField();
		txtCantidad650.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad650.setText("15");
		txtCantidad650.setEditable(false);
		txtCantidad650.setColumns(10);
		panel_63.add(txtCantidad650);

		txtCantidad651 = new JTextField();
		txtCantidad651.setColumns(10);
		panel_63.add(txtCantidad651);

		txtCantidad660 = new JTextField();
		txtCantidad660.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad660.setText("1");
		txtCantidad660.setEditable(false);
		txtCantidad660.setColumns(10);
		panel_63.add(txtCantidad660);

		txtCantidad661 = new JTextField();
		txtCantidad661.setColumns(10);
		panel_63.add(txtCantidad661);

		txtCantidad670 = new JTextField();
		txtCantidad670.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad670.setText("1");
		txtCantidad670.setEditable(false);
		txtCantidad670.setColumns(10);
		panel_63.add(txtCantidad670);

		txtCantidad671 = new JTextField();
		txtCantidad671.setColumns(10);
		panel_63.add(txtCantidad671);

		txtCantidad680 = new JTextField();
		txtCantidad680.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad680.setText("1");
		txtCantidad680.setEditable(false);
		txtCantidad680.setColumns(10);
		panel_63.add(txtCantidad680);

		txtCantidad681 = new JTextField();
		txtCantidad681.setColumns(10);
		panel_63.add(txtCantidad681);

		txtCantidad690 = new JTextField();
		txtCantidad690.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad690.setText("1");
		txtCantidad690.setEditable(false);
		txtCantidad690.setColumns(10);
		panel_63.add(txtCantidad690);

		txtCantidad691 = new JTextField();
		txtCantidad691.setColumns(10);
		panel_63.add(txtCantidad691);

		txtCantidad700 = new JTextField();
		txtCantidad700.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad700.setText("1");
		txtCantidad700.setEditable(false);
		txtCantidad700.setColumns(10);
		panel_63.add(txtCantidad700);

		txtCantidad701 = new JTextField();
		txtCantidad701.setColumns(10);
		panel_63.add(txtCantidad701);

		txtCantidad710 = new JTextField();
		txtCantidad710.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad710.setText("1");
		txtCantidad710.setEditable(false);
		txtCantidad710.setColumns(10);
		panel_63.add(txtCantidad710);

		txtCantidad711 = new JTextField();
		txtCantidad711.setColumns(10);
		panel_63.add(txtCantidad711);

		txtCantidad720 = new JTextField();
		txtCantidad720.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad720.setText("1");
		txtCantidad720.setEditable(false);
		txtCantidad720.setColumns(10);
		panel_63.add(txtCantidad720);

		txtCantidad721 = new JTextField();
		txtCantidad721.setColumns(10);
		panel_63.add(txtCantidad721);

		txtCantidad730 = new JTextField();
		txtCantidad730.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad730.setText("1");
		txtCantidad730.setEditable(false);
		txtCantidad730.setColumns(10);
		panel_63.add(txtCantidad730);

		txtCantidad731 = new JTextField();
		txtCantidad731.setColumns(10);
		panel_63.add(txtCantidad731);

		txtCantidad740 = new JTextField();
		txtCantidad740.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad740.setText("2");
		txtCantidad740.setEditable(false);
		txtCantidad740.setColumns(10);
		panel_63.add(txtCantidad740);

		txtCantidad741 = new JTextField();
		txtCantidad741.setColumns(10);
		panel_63.add(txtCantidad741);

		txtCantidad750 = new JTextField();
		txtCantidad750.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad750.setText("1");
		txtCantidad750.setEditable(false);
		txtCantidad750.setColumns(10);
		panel_63.add(txtCantidad750);

		txtCantidad751 = new JTextField();
		txtCantidad751.setColumns(10);
		panel_63.add(txtCantidad751);

		txtCantidad760 = new JTextField();
		txtCantidad760.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad760.setText("223");
		txtCantidad760.setEditable(false);
		txtCantidad760.setColumns(10);
		panel_63.add(txtCantidad760);

		txtCantidad761 = new JTextField();
		txtCantidad761.setColumns(10);
		panel_63.add(txtCantidad761);

		txtCantidad770 = new JTextField();
		txtCantidad770.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad770.setText("1");
		txtCantidad770.setEditable(false);
		txtCantidad770.setColumns(10);
		panel_63.add(txtCantidad770);

		txtCantidad771 = new JTextField();
		txtCantidad771.setColumns(10);
		panel_63.add(txtCantidad771);

		txtCantidad780 = new JTextField();
		txtCantidad780.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad780.setText("1");
		txtCantidad780.setEditable(false);
		txtCantidad780.setColumns(10);
		panel_63.add(txtCantidad780);

		txtCantidad781 = new JTextField();
		txtCantidad781.setColumns(10);
		panel_63.add(txtCantidad781);

		txtCantidad790 = new JTextField();
		txtCantidad790.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad790.setText("3");
		txtCantidad790.setEditable(false);
		txtCantidad790.setColumns(10);
		panel_63.add(txtCantidad790);

		txtCantidad791 = new JTextField();
		txtCantidad791.setColumns(10);
		panel_63.add(txtCantidad791);

		txtCantidad800 = new JTextField();
		txtCantidad800.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad800.setText("3");
		txtCantidad800.setEditable(false);
		txtCantidad800.setColumns(10);
		panel_63.add(txtCantidad800);

		txtCantidad801 = new JTextField();
		txtCantidad801.setColumns(10);
		panel_63.add(txtCantidad801);

		txtCantidad810 = new JTextField();
		txtCantidad810.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad810.setText("2");
		txtCantidad810.setEditable(false);
		txtCantidad810.setColumns(10);
		panel_63.add(txtCantidad810);

		txtCantidad811 = new JTextField();
		txtCantidad811.setColumns(10);
		panel_63.add(txtCantidad811);

		txtCantidad820 = new JTextField();
		txtCantidad820.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad820.setText("15");
		txtCantidad820.setEditable(false);
		txtCantidad820.setColumns(10);
		panel_63.add(txtCantidad820);

		txtCantidad821 = new JTextField();
		txtCantidad821.setColumns(10);
		panel_63.add(txtCantidad821);

		panel_64 = new JPanel();
		panel_64.setBounds(267, 17, 143, 523);
		panel_61.add(panel_64);
		panel_64.setLayout(new GridLayout(19, 0, 0, 0));

		txtObs64 = new JTextField();
		txtObs64.setColumns(10);
		panel_64.add(txtObs64);

		txtObs65 = new JTextField();
		txtObs65.setColumns(10);
		panel_64.add(txtObs65);

		txtObs66 = new JTextField();
		txtObs66.setColumns(10);
		panel_64.add(txtObs66);

		txtObs67 = new JTextField();
		txtObs67.setColumns(10);
		panel_64.add(txtObs67);

		txtObs68 = new JTextField();
		txtObs68.setColumns(10);
		panel_64.add(txtObs68);

		txtObs69 = new JTextField();
		txtObs69.setColumns(10);
		panel_64.add(txtObs69);

		txtObs70 = new JTextField();
		txtObs70.setColumns(10);
		panel_64.add(txtObs70);

		txtObs71 = new JTextField();
		txtObs71.setColumns(10);
		panel_64.add(txtObs71);

		txtObs72 = new JTextField();
		txtObs72.setColumns(10);
		panel_64.add(txtObs72);

		txtObs73 = new JTextField();
		txtObs73.setColumns(10);
		panel_64.add(txtObs73);

		txtObs74 = new JTextField();
		txtObs74.setColumns(10);
		panel_64.add(txtObs74);

		txtObs75 = new JTextField();
		txtObs75.setColumns(10);
		panel_64.add(txtObs75);

		txtObs76 = new JTextField();
		txtObs76.setColumns(10);
		panel_64.add(txtObs76);

		txtObs77 = new JTextField();
		txtObs77.setColumns(10);
		panel_64.add(txtObs77);

		txtObs78 = new JTextField();
		txtObs78.setColumns(10);
		panel_64.add(txtObs78);

		txtObs79 = new JTextField();
		txtObs79.setColumns(10);
		panel_64.add(txtObs79);

		txtObs80 = new JTextField();
		txtObs80.setColumns(10);
		panel_64.add(txtObs80);

		txtObs81 = new JTextField();
		txtObs81.setColumns(10);
		panel_64.add(txtObs81);

		txtObs82 = new JTextField();
		txtObs82.setColumns(10);
		panel_64.add(txtObs82);

		label_48 = new JLabel("Cantidad");
		label_48.setBounds(210, 1, 55, 14);
		panel_61.add(label_48);

		label_49 = new JLabel("Observaci\u00F3n/Referencia");
		label_49.setBounds(267, 1, 143, 14);
		panel_61.add(label_49);

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
		validarDigitos(txtCantidad791);
		validarDigitos(txtCantidad801);
		validarDigitos(txtCantidad811);
		validarDigitos(txtCantidad821);
		validarDigitos(txtCantidad831);
		validarDigitos(txtCantidad841);
		validarDigitos(txtCantidad851);
		validarDigitos(txtCantidad861);
		validarDigitos(txtCantidad871);
		validarDigitos(txtCantidad881);
		validarDigitos(txtCantidad891);
		validarDigitos(txtCantidad901);
		validarDigitos(txtCantidad911);
		validarDigitos(txtCantidad921);
		validarDigitos(txtCantidad931);
		validarDigitos(txtCantidad941);

		JPinformacionObligatoria informacionObligatoriaV = new JPinformacionObligatoria(858, 335);
		informacionObligatoriaV.getBtnInsertarFoto().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				fotoInfoObl = getPathImagen();
			}
		});
		panel_44.add(informacionObligatoriaV.getPnlInformacionObl());

		llenarFicha();
		pnlCabecera.getBtnRegistrar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				ServicioInfoObligatoria srvInfoOblig = new ComponenteInfoObligatoria();
				infor = cargarInfoObligatoria(informacionObligatoriaV);
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
						Reporte reporte = new Reporte("Reporte MD", 280, 10, 850, 750);
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
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_0),
				Integer.parseInt(txtCantidad00.getText()), Integer.parseInt(txtCantidad01.getText()), txtObs0.getText(),
				updateFicha, porcentajeAvance, ITEM_MD_0, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad10.getText()),
				Integer.parseInt(txtCantidad11.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_1),
				Integer.parseInt(txtCantidad10.getText()), Integer.parseInt(txtCantidad11.getText()), txtObs1.getText(),
				updateFicha, porcentajeAvance, ITEM_MD_1, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad20.getText()),
				Integer.parseInt(txtCantidad21.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_2),
				Integer.parseInt(txtCantidad20.getText()), Integer.parseInt(txtCantidad21.getText()), txtObs2.getText(),
				updateFicha, porcentajeAvance, ITEM_MD_2, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad30.getText()),
				Integer.parseInt(txtCantidad31.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_3),
				Integer.parseInt(txtCantidad30.getText()), Integer.parseInt(txtCantidad31.getText()), txtObs3.getText(),
				updateFicha, porcentajeAvance, ITEM_MD_3, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad40.getText()),
				Integer.parseInt(txtCantidad41.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_4),
				Integer.parseInt(txtCantidad40.getText()), Integer.parseInt(txtCantidad41.getText()), txtObs4.getText(),
				updateFicha, porcentajeAvance, ITEM_MD_4, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad50.getText()),
				Integer.parseInt(txtCantidad51.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_5),
				Integer.parseInt(txtCantidad50.getText()), Integer.parseInt(txtCantidad51.getText()), txtObs5.getText(),
				updateFicha, porcentajeAvance, ITEM_MD_5, "UNIDAD"));

		grupoTmp = servFicha.buscarGrupo("Kit agua lluvia");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad60.getText()),
				Integer.parseInt(txtCantidad61.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_6),
				Integer.parseInt(txtCantidad60.getText()), Integer.parseInt(txtCantidad61.getText()), txtObs6.getText(),
				updateFicha, porcentajeAvance, ITEM_MD_6, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad70.getText()),
				Integer.parseInt(txtCantidad71.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_7),
				Integer.parseInt(txtCantidad70.getText()), Integer.parseInt(txtCantidad71.getText()), txtObs7.getText(),
				updateFicha, porcentajeAvance, ITEM_MD_7, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad80.getText()),
				Integer.parseInt(txtCantidad81.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_8),
				Integer.parseInt(txtCantidad80.getText()), Integer.parseInt(txtCantidad81.getText()), txtObs8.getText(),
				updateFicha, porcentajeAvance, ITEM_MD_8, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad90.getText()),
				Integer.parseInt(txtCantidad91.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_9),
				Integer.parseInt(txtCantidad90.getText()), Integer.parseInt(txtCantidad91.getText()), txtObs9.getText(),
				updateFicha, porcentajeAvance, ITEM_MD_9, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad100.getText()),
				Integer.parseInt(txtCantidad101.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_10),
				Integer.parseInt(txtCantidad100.getText()), Integer.parseInt(txtCantidad101.getText()),
				txtObs10.getText(), updateFicha, porcentajeAvance, ITEM_MD_10, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad110.getText()),
				Integer.parseInt(txtCantidad111.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_11),
				Integer.parseInt(txtCantidad110.getText()), Integer.parseInt(txtCantidad111.getText()),
				txtObs11.getText(), updateFicha, porcentajeAvance, ITEM_MD_11, "UNIDAD"));

		grupoTmp = servFicha.buscarGrupo("Kit hidrosanitario");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad120.getText()),
				Integer.parseInt(txtCantidad121.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_12),
				Integer.parseInt(txtCantidad120.getText()), Integer.parseInt(txtCantidad121.getText()),
				txtObs12.getText(), updateFicha, porcentajeAvance, ITEM_MD_12, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad130.getText()),
				Integer.parseInt(txtCantidad131.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_13),
				Integer.parseInt(txtCantidad130.getText()), Integer.parseInt(txtCantidad131.getText()),
				txtObs13.getText(), updateFicha, porcentajeAvance, ITEM_MD_13, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad140.getText()),
				Integer.parseInt(txtCantidad141.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_14),
				Integer.parseInt(txtCantidad140.getText()), Integer.parseInt(txtCantidad141.getText()),
				txtObs14.getText(), updateFicha, porcentajeAvance, ITEM_MD_14, "UNIDAD"));

		grupoTmp = servFicha.buscarGrupo("Kit agua potable");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad150.getText()),
				Integer.parseInt(txtCantidad151.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_15),
				Integer.parseInt(txtCantidad150.getText()), Integer.parseInt(txtCantidad151.getText()),
				txtObs15.getText(), updateFicha, porcentajeAvance, ITEM_MD_15, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad160.getText()),
				Integer.parseInt(txtCantidad161.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_16),
				Integer.parseInt(txtCantidad160.getText()), Integer.parseInt(txtCantidad161.getText()),
				txtObs16.getText(), updateFicha, porcentajeAvance, ITEM_MD_16, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad170.getText()),
				Integer.parseInt(txtCantidad171.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_17),
				Integer.parseInt(txtCantidad170.getText()), Integer.parseInt(txtCantidad171.getText()),
				txtObs17.getText(), updateFicha, porcentajeAvance, ITEM_MD_17, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad180.getText()),
				Integer.parseInt(txtCantidad181.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_18),
				Integer.parseInt(txtCantidad180.getText()), Integer.parseInt(txtCantidad181.getText()),
				txtObs18.getText(), updateFicha, porcentajeAvance, ITEM_MD_18, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad190.getText()),
				Integer.parseInt(txtCantidad191.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_19),
				Integer.parseInt(txtCantidad190.getText()), Integer.parseInt(txtCantidad191.getText()),
				txtObs19.getText(), updateFicha, porcentajeAvance, ITEM_MD_19, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad200.getText()),
				Integer.parseInt(txtCantidad201.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_20),
				Integer.parseInt(txtCantidad200.getText()), Integer.parseInt(txtCantidad201.getText()),
				txtObs20.getText(), updateFicha, porcentajeAvance, ITEM_MD_20, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad210.getText()),
				Integer.parseInt(txtCantidad211.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_21),
				Integer.parseInt(txtCantidad210.getText()), Integer.parseInt(txtCantidad211.getText()),
				txtObs21.getText(), updateFicha, porcentajeAvance, ITEM_MD_21, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad220.getText()),
				Integer.parseInt(txtCantidad221.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_22),
				Integer.parseInt(txtCantidad220.getText()), Integer.parseInt(txtCantidad221.getText()),
				txtObs22.getText(), updateFicha, porcentajeAvance, ITEM_MD_22, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad230.getText()),
				Integer.parseInt(txtCantidad231.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_23),
				Integer.parseInt(txtCantidad230.getText()), Integer.parseInt(txtCantidad231.getText()),
				txtObs23.getText(), updateFicha, porcentajeAvance, ITEM_MD_23, "UNIDAD"));

		grupoTmp = servFicha.buscarGrupo("Kit agua residual");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad240.getText()),
				Integer.parseInt(txtCantidad241.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_24),
				Integer.parseInt(txtCantidad240.getText()), Integer.parseInt(txtCantidad241.getText()),
				txtObs24.getText(), updateFicha, porcentajeAvance, ITEM_MD_24, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad250.getText()),
				Integer.parseInt(txtCantidad251.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_25),
				Integer.parseInt(txtCantidad250.getText()), Integer.parseInt(txtCantidad251.getText()),
				txtObs25.getText(), updateFicha, porcentajeAvance, ITEM_MD_25, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad260.getText()),
				Integer.parseInt(txtCantidad261.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_26),
				Integer.parseInt(txtCantidad260.getText()), Integer.parseInt(txtCantidad261.getText()),
				txtObs26.getText(), updateFicha, porcentajeAvance, ITEM_MD_26, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad270.getText()),
				Integer.parseInt(txtCantidad271.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_27),
				Integer.parseInt(txtCantidad270.getText()), Integer.parseInt(txtCantidad271.getText()),
				txtObs27.getText(), updateFicha, porcentajeAvance, ITEM_MD_27, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad280.getText()),
				Integer.parseInt(txtCantidad281.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_28),
				Integer.parseInt(txtCantidad280.getText()), Integer.parseInt(txtCantidad281.getText()),
				txtObs28.getText(), updateFicha, porcentajeAvance, ITEM_MD_28, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad290.getText()),
				Integer.parseInt(txtCantidad291.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_29),
				Integer.parseInt(txtCantidad290.getText()), Integer.parseInt(txtCantidad291.getText()),
				txtObs29.getText(), updateFicha, porcentajeAvance, ITEM_MD_29, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad300.getText()),
				Integer.parseInt(txtCantidad301.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_30),
				Integer.parseInt(txtCantidad300.getText()), Integer.parseInt(txtCantidad301.getText()),
				txtObs30.getText(), updateFicha, porcentajeAvance, ITEM_MD_30, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad310.getText()),
				Integer.parseInt(txtCantidad311.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_31),
				Integer.parseInt(txtCantidad310.getText()), Integer.parseInt(txtCantidad311.getText()),
				txtObs31.getText(), updateFicha, porcentajeAvance, ITEM_MD_31, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad320.getText()),
				Integer.parseInt(txtCantidad321.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_32),
				Integer.parseInt(txtCantidad320.getText()), Integer.parseInt(txtCantidad321.getText()),
				txtObs32.getText(), updateFicha, porcentajeAvance, ITEM_MD_32, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad330.getText()),
				Integer.parseInt(txtCantidad331.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_33),
				Integer.parseInt(txtCantidad330.getText()), Integer.parseInt(txtCantidad331.getText()),
				txtObs33.getText(), updateFicha, porcentajeAvance, ITEM_MD_33, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad340.getText()),
				Integer.parseInt(txtCantidad341.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_34),
				Integer.parseInt(txtCantidad340.getText()), Integer.parseInt(txtCantidad341.getText()),
				txtObs34.getText(), updateFicha, porcentajeAvance, ITEM_MD_34, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad350.getText()),
				Integer.parseInt(txtCantidad351.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_35),
				Integer.parseInt(txtCantidad350.getText()), Integer.parseInt(txtCantidad351.getText()),
				txtObs35.getText(), updateFicha, porcentajeAvance, ITEM_MD_35, "UNIDAD"));

		grupoTmp = servFicha.buscarGrupo("Componente arquitectónico");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad360.getText()),
				Integer.parseInt(txtCantidad361.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_36),
				Integer.parseInt(txtCantidad360.getText()), Integer.parseInt(txtCantidad361.getText()),
				txtObs36.getText(), updateFicha, porcentajeAvance, ITEM_MD_36, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad370.getText()),
				Integer.parseInt(txtCantidad371.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_37),
				Integer.parseInt(txtCantidad370.getText()), Integer.parseInt(txtCantidad371.getText()),
				txtObs37.getText(), updateFicha, porcentajeAvance, ITEM_MD_37, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad380.getText()),
				Integer.parseInt(txtCantidad381.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_38),
				Integer.parseInt(txtCantidad380.getText()), Integer.parseInt(txtCantidad381.getText()),
				txtObs38.getText(), updateFicha, porcentajeAvance, ITEM_MD_38, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad390.getText()),
				Integer.parseInt(txtCantidad391.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_39),
				Integer.parseInt(txtCantidad390.getText()), Integer.parseInt(txtCantidad391.getText()),
				txtObs39.getText(), updateFicha, porcentajeAvance, ITEM_MD_39, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad400.getText()),
				Integer.parseInt(txtCantidad401.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_40),
				Integer.parseInt(txtCantidad400.getText()), Integer.parseInt(txtCantidad401.getText()),
				txtObs40.getText(), updateFicha, porcentajeAvance, ITEM_MD_40, "UNIDAD"));

		grupoTmp = servFicha.buscarGrupo("Paredes internas");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad410.getText()),
				Integer.parseInt(txtCantidad411.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_41),
				Integer.parseInt(txtCantidad410.getText()), Integer.parseInt(txtCantidad411.getText()),
				txtObs41.getText(), updateFicha, porcentajeAvance, ITEM_MD_41, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad420.getText()),
				Integer.parseInt(txtCantidad421.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_42),
				Integer.parseInt(txtCantidad420.getText()), Integer.parseInt(txtCantidad421.getText()),
				txtObs42.getText(), updateFicha, porcentajeAvance, ITEM_MD_42, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad430.getText()),
				Integer.parseInt(txtCantidad431.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_43),
				Integer.parseInt(txtCantidad430.getText()), Integer.parseInt(txtCantidad431.getText()),
				txtObs43.getText(), updateFicha, porcentajeAvance, ITEM_MD_43, "UNIDAD"));

		grupoTmp = servFicha.buscarGrupo("Fachada frontal");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad440.getText()),
				Integer.parseInt(txtCantidad441.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_44),
				Integer.parseInt(txtCantidad440.getText()), Integer.parseInt(txtCantidad441.getText()),
				txtObs44.getText(), updateFicha, porcentajeAvance, ITEM_MD_44, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad450.getText()),
				Integer.parseInt(txtCantidad451.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_45),
				Integer.parseInt(txtCantidad450.getText()), Integer.parseInt(txtCantidad451.getText()),
				txtObs45.getText(), updateFicha, porcentajeAvance, ITEM_MD_45, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad460.getText()),
				Integer.parseInt(txtCantidad461.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_46),
				Integer.parseInt(txtCantidad460.getText()), Integer.parseInt(txtCantidad461.getText()),
				txtObs46.getText(), updateFicha, porcentajeAvance, ITEM_MD_46, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad470.getText()),
				Integer.parseInt(txtCantidad471.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_47),
				Integer.parseInt(txtCantidad470.getText()), Integer.parseInt(txtCantidad471.getText()),
				txtObs47.getText(), updateFicha, porcentajeAvance, ITEM_MD_47, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad480.getText()),
				Integer.parseInt(txtCantidad481.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_48),
				Integer.parseInt(txtCantidad480.getText()), Integer.parseInt(txtCantidad481.getText()),
				txtObs48.getText(), updateFicha, porcentajeAvance, ITEM_MD_48, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad490.getText()),
				Integer.parseInt(txtCantidad491.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_49),
				Integer.parseInt(txtCantidad490.getText()), Integer.parseInt(txtCantidad491.getText()),
				txtObs49.getText(), updateFicha, porcentajeAvance, ITEM_MD_49, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad500.getText()),
				Integer.parseInt(txtCantidad501.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_50),
				Integer.parseInt(txtCantidad500.getText()), Integer.parseInt(txtCantidad501.getText()),
				txtObs50.getText(), updateFicha, porcentajeAvance, ITEM_MD_50, "UNIDAD"));

		grupoTmp = servFicha.buscarGrupo("Fachada posterior");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad510.getText()),
				Integer.parseInt(txtCantidad511.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_51),
				Integer.parseInt(txtCantidad510.getText()), Integer.parseInt(txtCantidad511.getText()),
				txtObs51.getText(), updateFicha, porcentajeAvance, ITEM_MD_51, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad520.getText()),
				Integer.parseInt(txtCantidad521.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_52),
				Integer.parseInt(txtCantidad520.getText()), Integer.parseInt(txtCantidad521.getText()),
				txtObs52.getText(), updateFicha, porcentajeAvance, ITEM_MD_52, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad530.getText()),
				Integer.parseInt(txtCantidad531.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_53),
				Integer.parseInt(txtCantidad530.getText()), Integer.parseInt(txtCantidad531.getText()),
				txtObs53.getText(), updateFicha, porcentajeAvance, ITEM_MD_53, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad540.getText()),
				Integer.parseInt(txtCantidad541.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_54),
				Integer.parseInt(txtCantidad540.getText()), Integer.parseInt(txtCantidad541.getText()),
				txtObs54.getText(), updateFicha, porcentajeAvance, ITEM_MD_54, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad550.getText()),
				Integer.parseInt(txtCantidad551.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_55),
				Integer.parseInt(txtCantidad550.getText()), Integer.parseInt(txtCantidad551.getText()),
				txtObs55.getText(), updateFicha, porcentajeAvance, ITEM_MD_55, "UNIDAD"));

		grupoTmp = servFicha.buscarGrupo("Fachada lateral");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad560.getText()),
				Integer.parseInt(txtCantidad561.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_56),
				Integer.parseInt(txtCantidad560.getText()), Integer.parseInt(txtCantidad561.getText()),
				txtObs56.getText(), updateFicha, porcentajeAvance, ITEM_MD_56, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad570.getText()),
				Integer.parseInt(txtCantidad571.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_57),
				Integer.parseInt(txtCantidad570.getText()), Integer.parseInt(txtCantidad571.getText()),
				txtObs57.getText(), updateFicha, porcentajeAvance, ITEM_MD_57, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad580.getText()),
				Integer.parseInt(txtCantidad581.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_58),
				Integer.parseInt(txtCantidad580.getText()), Integer.parseInt(txtCantidad581.getText()),
				txtObs58.getText(), updateFicha, porcentajeAvance, ITEM_MD_58, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad590.getText()),
				Integer.parseInt(txtCantidad591.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_59),
				Integer.parseInt(txtCantidad590.getText()), Integer.parseInt(txtCantidad591.getText()),
				txtObs59.getText(), updateFicha, porcentajeAvance, ITEM_MD_59, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad600.getText()),
				Integer.parseInt(txtCantidad601.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_60),
				Integer.parseInt(txtCantidad600.getText()), Integer.parseInt(txtCantidad601.getText()),
				txtObs60.getText(), updateFicha, porcentajeAvance, ITEM_MD_60, "UNIDAD"));

		grupoTmp = servFicha.buscarGrupo("Componente arquitectónico");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad610.getText()),
				Integer.parseInt(txtCantidad611.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_61),
				Integer.parseInt(txtCantidad610.getText()), Integer.parseInt(txtCantidad611.getText()),
				txtObs61.getText(), updateFicha, porcentajeAvance, ITEM_MD_61, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad620.getText()),
				Integer.parseInt(txtCantidad621.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_62),
				Integer.parseInt(txtCantidad620.getText()), Integer.parseInt(txtCantidad621.getText()),
				txtObs62.getText(), updateFicha, porcentajeAvance, ITEM_MD_62, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad630.getText()),
				Integer.parseInt(txtCantidad631.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_63),
				Integer.parseInt(txtCantidad630.getText()), Integer.parseInt(txtCantidad631.getText()),
				txtObs63.getText(), updateFicha, porcentajeAvance, ITEM_MD_63, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad640.getText()),
				Integer.parseInt(txtCantidad641.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_64),
				Integer.parseInt(txtCantidad640.getText()), Integer.parseInt(txtCantidad641.getText()),
				txtObs64.getText(), updateFicha, porcentajeAvance, ITEM_MD_64, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad650.getText()),
				Integer.parseInt(txtCantidad651.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_65),
				Integer.parseInt(txtCantidad650.getText()), Integer.parseInt(txtCantidad651.getText()),
				txtObs65.getText(), updateFicha, porcentajeAvance, ITEM_MD_65, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad660.getText()),
				Integer.parseInt(txtCantidad661.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_66),
				Integer.parseInt(txtCantidad660.getText()), Integer.parseInt(txtCantidad661.getText()),
				txtObs66.getText(), updateFicha, porcentajeAvance, ITEM_MD_66, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad670.getText()),
				Integer.parseInt(txtCantidad671.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_67),
				Integer.parseInt(txtCantidad670.getText()), Integer.parseInt(txtCantidad671.getText()),
				txtObs67.getText(), updateFicha, porcentajeAvance, ITEM_MD_67, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad680.getText()),
				Integer.parseInt(txtCantidad681.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_68),
				Integer.parseInt(txtCantidad680.getText()), Integer.parseInt(txtCantidad681.getText()),
				txtObs68.getText(), updateFicha, porcentajeAvance, ITEM_MD_68, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad690.getText()),
				Integer.parseInt(txtCantidad691.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_69),
				Integer.parseInt(txtCantidad690.getText()), Integer.parseInt(txtCantidad691.getText()),
				txtObs69.getText(), updateFicha, porcentajeAvance, ITEM_MD_69, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad700.getText()),
				Integer.parseInt(txtCantidad701.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_70),
				Integer.parseInt(txtCantidad700.getText()), Integer.parseInt(txtCantidad701.getText()),
				txtObs70.getText(), updateFicha, porcentajeAvance, ITEM_MD_70, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad710.getText()),
				Integer.parseInt(txtCantidad711.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_71),
				Integer.parseInt(txtCantidad710.getText()), Integer.parseInt(txtCantidad711.getText()),
				txtObs71.getText(), updateFicha, porcentajeAvance, ITEM_MD_71, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad720.getText()),
				Integer.parseInt(txtCantidad721.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_72),
				Integer.parseInt(txtCantidad720.getText()), Integer.parseInt(txtCantidad721.getText()),
				txtObs72.getText(), updateFicha, porcentajeAvance, ITEM_MD_72, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad730.getText()),
				Integer.parseInt(txtCantidad731.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_73),
				Integer.parseInt(txtCantidad730.getText()), Integer.parseInt(txtCantidad731.getText()),
				txtObs73.getText(), updateFicha, porcentajeAvance, ITEM_MD_73, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad740.getText()),
				Integer.parseInt(txtCantidad741.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_74),
				Integer.parseInt(txtCantidad740.getText()), Integer.parseInt(txtCantidad741.getText()),
				txtObs74.getText(), updateFicha, porcentajeAvance, ITEM_MD_74, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad750.getText()),
				Integer.parseInt(txtCantidad751.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_75),
				Integer.parseInt(txtCantidad750.getText()), Integer.parseInt(txtCantidad751.getText()),
				txtObs75.getText(), updateFicha, porcentajeAvance, ITEM_MD_75, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad760.getText()),
				Integer.parseInt(txtCantidad761.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_76),
				Integer.parseInt(txtCantidad760.getText()), Integer.parseInt(txtCantidad761.getText()),
				txtObs76.getText(), updateFicha, porcentajeAvance, ITEM_MD_76, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad770.getText()),
				Integer.parseInt(txtCantidad771.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_77),
				Integer.parseInt(txtCantidad770.getText()), Integer.parseInt(txtCantidad771.getText()),
				txtObs77.getText(), updateFicha, porcentajeAvance, ITEM_MD_77, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad780.getText()),
				Integer.parseInt(txtCantidad781.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_78),
				Integer.parseInt(txtCantidad780.getText()), Integer.parseInt(txtCantidad781.getText()),
				txtObs78.getText(), updateFicha, porcentajeAvance, ITEM_MD_78, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad790.getText()),
				Integer.parseInt(txtCantidad791.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_79),
				Integer.parseInt(txtCantidad790.getText()), Integer.parseInt(txtCantidad791.getText()),
				txtObs79.getText(), updateFicha, porcentajeAvance, ITEM_MD_79, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad800.getText()),
				Integer.parseInt(txtCantidad801.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_80),
				Integer.parseInt(txtCantidad800.getText()), Integer.parseInt(txtCantidad801.getText()),
				txtObs80.getText(), updateFicha, porcentajeAvance, ITEM_MD_80, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad810.getText()),
				Integer.parseInt(txtCantidad811.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_81),
				Integer.parseInt(txtCantidad810.getText()), Integer.parseInt(txtCantidad811.getText()),
				txtObs81.getText(), updateFicha, porcentajeAvance, ITEM_MD_81, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad820.getText()),
				Integer.parseInt(txtCantidad821.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_82),
				Integer.parseInt(txtCantidad820.getText()), Integer.parseInt(txtCantidad821.getText()),
				txtObs82.getText(), updateFicha, porcentajeAvance, ITEM_MD_82, "UNIDAD"));

		grupoTmp = servFicha.buscarGrupo("Componente estructural");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad830.getText()),
				Integer.parseInt(txtCantidad831.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_83),
				Integer.parseInt(txtCantidad830.getText()), Integer.parseInt(txtCantidad831.getText()),
				txtObs83.getText(), updateFicha, porcentajeAvance, ITEM_MD_83, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad840.getText()),
				Integer.parseInt(txtCantidad841.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_84),
				Integer.parseInt(txtCantidad840.getText()), Integer.parseInt(txtCantidad841.getText()),
				txtObs84.getText(), updateFicha, porcentajeAvance, ITEM_MD_84, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad850.getText()),
				Integer.parseInt(txtCantidad851.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_85),
				Integer.parseInt(txtCantidad850.getText()), Integer.parseInt(txtCantidad851.getText()),
				txtObs85.getText(), updateFicha, porcentajeAvance, ITEM_MD_85, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad860.getText()),
				Integer.parseInt(txtCantidad861.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_86),
				Integer.parseInt(txtCantidad860.getText()), Integer.parseInt(txtCantidad861.getText()),
				txtObs86.getText(), updateFicha, porcentajeAvance, ITEM_MD_86, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad870.getText()),
				Integer.parseInt(txtCantidad871.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_87),
				Integer.parseInt(txtCantidad870.getText()), Integer.parseInt(txtCantidad871.getText()),
				txtObs87.getText(), updateFicha, porcentajeAvance, ITEM_MD_87, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad880.getText()),
				Integer.parseInt(txtCantidad881.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_88),
				Integer.parseInt(txtCantidad880.getText()), Integer.parseInt(txtCantidad881.getText()),
				txtObs88.getText(), updateFicha, porcentajeAvance, ITEM_MD_88, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad890.getText()),
				Integer.parseInt(txtCantidad891.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_89),
				Integer.parseInt(txtCantidad890.getText()), Integer.parseInt(txtCantidad891.getText()),
				txtObs89.getText(), updateFicha, porcentajeAvance, ITEM_MD_89, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad900.getText()),
				Integer.parseInt(txtCantidad901.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_90),
				Integer.parseInt(txtCantidad900.getText()), Integer.parseInt(txtCantidad901.getText()),
				txtObs90.getText(), updateFicha, porcentajeAvance, ITEM_MD_90, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad910.getText()),
				Integer.parseInt(txtCantidad911.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_91),
				Integer.parseInt(txtCantidad910.getText()), Integer.parseInt(txtCantidad911.getText()),
				txtObs91.getText(), updateFicha, porcentajeAvance, ITEM_MD_91, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad920.getText()),
				Integer.parseInt(txtCantidad921.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_92),
				Integer.parseInt(txtCantidad920.getText()), Integer.parseInt(txtCantidad921.getText()),
				txtObs92.getText(), updateFicha, porcentajeAvance, ITEM_MD_92, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad930.getText()),
				Integer.parseInt(txtCantidad931.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_93),
				Integer.parseInt(txtCantidad930.getText()), Integer.parseInt(txtCantidad931.getText()),
				txtObs93.getText(), updateFicha, porcentajeAvance, ITEM_MD_93, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad940.getText()),
				Integer.parseInt(txtCantidad941.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MD_94),
				Integer.parseInt(txtCantidad940.getText()), Integer.parseInt(txtCantidad941.getText()),
				txtObs94.getText(), updateFicha, porcentajeAvance, ITEM_MD_94, "UNIDAD"));

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
			txtCantidad791.setText(String.valueOf(listaDetalles.get(79).getDetCantidadEjecutada()));
			txtCantidad801.setText(String.valueOf(listaDetalles.get(80).getDetCantidadEjecutada()));
			txtCantidad811.setText(String.valueOf(listaDetalles.get(81).getDetCantidadEjecutada()));
			txtCantidad821.setText(String.valueOf(listaDetalles.get(82).getDetCantidadEjecutada()));
			txtCantidad831.setText(String.valueOf(listaDetalles.get(83).getDetCantidadEjecutada()));
			txtCantidad841.setText(String.valueOf(listaDetalles.get(84).getDetCantidadEjecutada()));
			txtCantidad851.setText(String.valueOf(listaDetalles.get(85).getDetCantidadEjecutada()));
			txtCantidad861.setText(String.valueOf(listaDetalles.get(86).getDetCantidadEjecutada()));
			txtCantidad871.setText(String.valueOf(listaDetalles.get(87).getDetCantidadEjecutada()));
			txtCantidad881.setText(String.valueOf(listaDetalles.get(88).getDetCantidadEjecutada()));
			txtCantidad891.setText(String.valueOf(listaDetalles.get(89).getDetCantidadEjecutada()));
			txtCantidad901.setText(String.valueOf(listaDetalles.get(90).getDetCantidadEjecutada()));
			txtCantidad911.setText(String.valueOf(listaDetalles.get(91).getDetCantidadEjecutada()));
			txtCantidad921.setText(String.valueOf(listaDetalles.get(92).getDetCantidadEjecutada()));
			txtCantidad931.setText(String.valueOf(listaDetalles.get(93).getDetCantidadEjecutada()));
			txtCantidad941.setText(String.valueOf(listaDetalles.get(94).getDetCantidadEjecutada()));

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
			txtObs79.setText(listaDetalles.get(79).getDetObsRef());
			txtObs80.setText(listaDetalles.get(80).getDetObsRef());
			txtObs81.setText(listaDetalles.get(81).getDetObsRef());
			txtObs82.setText(listaDetalles.get(82).getDetObsRef());
			txtObs83.setText(listaDetalles.get(83).getDetObsRef());
			txtObs84.setText(listaDetalles.get(84).getDetObsRef());
			txtObs85.setText(listaDetalles.get(85).getDetObsRef());
			txtObs86.setText(listaDetalles.get(86).getDetObsRef());
			txtObs87.setText(listaDetalles.get(87).getDetObsRef());
			txtObs88.setText(listaDetalles.get(88).getDetObsRef());
			txtObs89.setText(listaDetalles.get(89).getDetObsRef());
			txtObs90.setText(listaDetalles.get(90).getDetObsRef());
			txtObs91.setText(listaDetalles.get(91).getDetObsRef());
			txtObs92.setText(listaDetalles.get(92).getDetObsRef());
			txtObs93.setText(listaDetalles.get(93).getDetObsRef());
			txtObs94.setText(listaDetalles.get(94).getDetObsRef());
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
			txtCantidad791.setText(String.valueOf(0));
			txtCantidad801.setText(String.valueOf(0));
			txtCantidad811.setText(String.valueOf(0));
			txtCantidad821.setText(String.valueOf(0));
			txtCantidad831.setText(String.valueOf(0));
			txtCantidad841.setText(String.valueOf(0));
			txtCantidad851.setText(String.valueOf(0));
			txtCantidad861.setText(String.valueOf(0));
			txtCantidad871.setText(String.valueOf(0));
			txtCantidad881.setText(String.valueOf(0));
			txtCantidad891.setText(String.valueOf(0));
			txtCantidad901.setText(String.valueOf(0));
			txtCantidad911.setText(String.valueOf(0));
			txtCantidad921.setText(String.valueOf(0));
			txtCantidad931.setText(String.valueOf(0));
			txtCantidad941.setText(String.valueOf(0));

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
			txtObs79.setText("");
			txtObs80.setText("");
			txtObs81.setText("");
			txtObs82.setText("");
			txtObs83.setText("");
			txtObs84.setText("");
			txtObs85.setText("");
			txtObs86.setText("");
			txtObs87.setText("");
			txtObs88.setText("");
			txtObs89.setText("");
			txtObs90.setText("");
			txtObs91.setText("");
			txtObs92.setText("");
			txtObs93.setText("");
			txtObs94.setText("");
		}
	}
}
