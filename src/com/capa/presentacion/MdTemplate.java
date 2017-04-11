package com.capa.presentacion;

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
import java.util.LinkedList;

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
import com.capa.negocios.ServicioFicha;
import com.capa.negocios.ServicioInfoObligatoria;

public class MdTemplate extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7293344096499392660L;
	private JPanel contentPane;
	private JTextField txtKACantidad30;
	private JTextField txtKACantidad31;
	private JTextField txtKACantidad40;
	private JTextField txtKACantidad41;
	private JTextField txtKACantidad50;
	private JTextField txtKACantidad51;
	private JTextField txtKACantidad20;
	private JTextField txtKACantidad21;
	private JTextField txtKAObs3;
	private JTextField txtKAObs4;
	private JTextField txtKAObs5;
	private JTextField txtKAObs2;
	private JTextField txtKECantidad00;
	private JTextField txtKECantidad01;
	private JTextField txtCantidad10;
	private JTextField txtKECantidad11;
	private JTextField txtKECantidad20;
	private JTextField txtKECantidad21;
	private JTextField txtKECantidad30;
	private JTextField txtKECantidad31;
	private JTextField txtKECantidad40;
	private JTextField txtKECantidad41;
	private JTextField txtKEObs0;
	private JTextField txtKEObs1;
	private JTextField txtKEObs2;
	private JTextField txtKEObs3;
	private JTextField txtKEObs4;
	private JTextField txtPICantidad00;
	private JTextField txtPICantidad01;
	private JTextField txtPICantidad10;
	private JTextField txtPICantidad11;
	private JTextField txtPICantidad20;
	private JTextField txtPICantidad21;
	private JTextField txtPIObs0;
	private JTextField txtPIObs1;
	private JTextField txtPIObs2;
	private JTextField txtFPCantidad00;
	private JTextField txtFPCantidad01;
	private JTextField txtFPCantidad10;
	private JTextField txtFPCantidad11;
	private JTextField txtFPCantidad20;
	private JTextField txtFPCantidad21;
	private JTextField txtFPCantidad30;
	private JTextField txtFPCantidad31;
	private JTextField txtFPCantidad40;
	private JTextField txtFPCantidad41;
	private JTextField txtFPObs0;
	private JTextField txtFPObs1;
	private JTextField txtFPObs2;
	private JTextField txtFPObs3;
	private JTextField txtFPObs4;
	private JTextField txtCECantidad00;
	private JTextField txtCECantidad01;
	private JTextField txtCECantidad10;
	private JTextField txtCECantidad11;
	private JTextField txtCECantidad20;
	private JTextField txtCECantidad21;
	private JTextField txtCECantidad30;
	private JTextField txtCECantidad31;
	private JTextField txtCECantidad40;
	private JTextField txtCECantidad41;
	private JTextField txtCECantidad50;
	private JTextField txtCECantidad51;
	private JTextField txtCECantidad60;
	private JTextField txtCECantidad61;
	private JTextField txtCECantidad70;
	private JTextField txtCECantidad71;
	private JTextField txtCECantidad80;
	private JTextField txtCECantidad81;
	private JTextField txtCECantidad90;
	private JTextField txtCECantidad91;
	private JTextField txtCECantidad100;
	private JTextField txtCECantidad101;
	private JTextField txtCECantidad110;
	private JTextField txtCECantidad111;
	private JTextField txtCEObs0;
	private JTextField txtCEObs1;
	private JTextField txtCEObs2;
	private JTextField txtCEObs3;
	private JTextField txtCEObs4;
	private JTextField txtCEObs5;
	private JTextField txtCEObs6;
	private JTextField txtCEObs7;
	private JTextField txtCEObs8;
	private JTextField txtCEObs9;
	private JTextField txtCEObs10;
	private JTextField txtCEObs11;
	private JTextField txtKECantidad50;
	private JTextField txtKECantidad51;
	private JTextField txtKEObs5;
	private JPanel panel_89;
	private JTextField txtKACantidad00;
	private JTextField txtKACantidad01;
	private JTextField txtKACantidad10;
	private JTextField txtKACantidad11;
	private JPanel panel_90;
	private JTextField txtKAObs0;
	private JTextField txtKAObs1;
	private JPanel panel_15;
	private JPanel panel_16;
	private JLabel lblInodoros;
	private JLabel lblUrinarios;
	private JLabel lblLavabos;
	private JLabel lblKitHidrosanitario;
	private JPanel panel_17;
	private JTextField txtKHCantidad00;
	private JTextField txtKHCantidad01;
	private JTextField txtKHCantidad10;
	private JTextField txtKHCantidad11;
	private JTextField txtKHCantidad20;
	private JTextField txtKHCantidad21;
	private JPanel panel_18;
	private JTextField txtKHObs0;
	private JTextField txtKHObs1;
	private JTextField txtKHObs2;
	private JLabel label_17;
	private JLabel label_18;
	private JPanel panel_19;
	private JPanel panel_20;
	private JLabel lblKitDeAccesorios;
	private JLabel label_6;
	private JPanel panel_21;
	private JTextField txtAPCantidad80;
	private JTextField txtAPCantidad81;
	private JPanel panel_22;
	private JTextField txAPLObs8;
	private JLabel label_11;
	private JLabel label_12;
	private JPanel panel_23;
	private JLabel lblKitAguaPotable;
	private JLabel label_16;
	private JLabel label_19;
	private JPanel panel_28;
	private JPanel panel_30;
	private JTextField txtAPCantidad00;
	private JTextField txtAPCantidad01;
	private JPanel panel_32;
	private JPanel panel_33;
	private JTextField txtAPObs0;
	private JPanel panel_34;
	private JLabel lblKitDeAccesorios_1;
	private JPanel panel_35;
	private JLabel lblTuberaDePvc;
	private JLabel lblTuberaDePvc_1;
	private JPanel panel_29;
	private JTextField txtAPCantidad10;
	private JTextField txtAPCantidad11;
	private JTextField txtAPCantidad20;
	private JTextField txtAPCantidad21;
	private JPanel panel_31;
	private JTextField txtAPObs1;
	private JTextField txtAPObs2;
	private JLabel lblKitDeAccesorios_2;
	private JPanel panel_91;
	private JTextField txtAPCantidad30;
	private JPanel panel_92;
	private JTextField txtAPObs3;
	private JPanel panel_93;
	private JLabel lblTuberaDePvc_2;
	private JLabel lblTuberaDePvc_3;
	private JLabel lblKitParaConexin;
	private JPanel panel_94;
	private JTextField txtAPCantidad40;
	private JTextField txtAPCantidad41;
	private JTextField txtAPCantidad50;
	private JTextField txtAPCantidad51;
	private JTextField txtAPCantidad60;
	private JTextField txtAPCantidad61;
	private JPanel panel_95;
	private JTextField txtAPObs4;
	private JTextField txtAPObs5;
	private JTextField txtAPObs6;
	private JPanel panel_96;
	private JLabel lblKitParaConexin_1;
	private JPanel panel_97;
	private JTextField txtAPCantidad70;
	private JTextField txtAPCantidad71;
	private JPanel panel_98;
	private JTextField txtAPObs7;
	private JPanel panel_99;
	private JLabel lblKitAguaResidual;
	private JLabel label_20;
	private JLabel label_21;
	private JPanel panel_100;
	private JPanel panel_101;
	private JTextField txtASCantidad00;
	private JTextField txtASCantidad01;
	private JPanel panel_103;
	private JTextField txtASCantidad10;
	private JTextField txtASCantidad11;
	private JPanel panel_104;
	private JTextField txtASCantidad20;
	private JTextField txtASCantidad21;
	private JTextField txtASCantidad30;
	private JTextField txtASCantidad31;
	private JPanel panel_105;
	private JTextField txtASCantidad40;
	private JTextField txtASCantidad41;
	private JPanel panel_106;
	private JPanel panel_107;
	private JTextField txtASObs0;
	private JPanel panel_109;
	private JTextField txtASObs1;
	private JPanel panel_110;
	private JTextField txtASObs2;
	private JTextField txtASObs3;
	private JPanel panel_111;
	private JTextField txtASObs4;
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
	private JTextField txtASCantidad50;
	private JTextField txtASCantidad51;
	private JPanel panel_113;
	private JTextField txtASObs5;
	private JTextField txtASCantidad60;
	private JTextField txtASCantidad61;
	private JTextField txtASCantidad90;
	private JTextField txtASCantidad91;
	private JTextField txtASCantidad70;
	private JTextField txtASCantidad71;
	private JTextField txtASCantidad80;
	private JTextField txtASCantidad81;
	private JTextField txtASCantidad100;
	private JTextField txtASCantidad101;
	private JTextField txtASCantidad110;
	private JTextField txtASCantidad111;
	private JTextField txtASObs6;
	private JTextField txtASObs9;
	private JTextField txtASObs7;
	private JTextField txtASObs8;
	private JTextField txtASObs10;
	private JTextField txtASObs11;
	private JPanel panel_125;
	private JLabel lblComponente;
	private JLabel label_25;
	private JLabel label_26;
	private JPanel panel_126;
	private JPanel panel_127;
	private JTextField txtComCantidad20;
	private JTextField txtComCantidad21;
	private JTextField txtComCantidad30;
	private JTextField txtComCantidad31;
	private JTextField txtComCantidad40;
	private JTextField txtComCantidad41;
	private JPanel panel_130;
	private JPanel panel_131;
	private JTextField txtComObs2;
	private JTextField txtComObs3;
	private JTextField txtComObs4;
	private JPanel panel_134;
	private JPanel panel_135;
	private JLabel lblPerfilSfTipo_1;
	private JLabel lblPuerta;
	private JLabel lblBisagras;
	private JLabel lblPerfilSfTipo;
	private JLabel label_24;
	private JPanel panel_128;
	private JTextField txtComCantidad00;
	private JTextField txtComCantidad01;
	private JPanel panel_129;
	private JTextField txtComCantidad10;
	private JTextField txtComCantidad11;
	private JPanel panel_132;
	private JTextField txtComObs0;
	private JPanel panel_133;
	private JTextField txtComObs1;
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
	private JTextField txtFFCantidad00;
	private JTextField txtFFCantidad01;
	private JTextField txtFFCantidad10;
	private JTextField txtFFCantidad11;
	private JTextField txtFFCantidad20;
	private JTextField txtFFCantidad21;
	private JTextField txtFFCantidad30;
	private JTextField txtFFCantidad31;
	private JTextField txtFFCantidad40;
	private JTextField txtFFCantidad41;
	private JTextField txtFFCantidad50;
	private JTextField txtFFCantidad51;
	private JTextField txtFFCantidad60;
	private JTextField txtFFCantidad61;
	private JPanel panel_48;
	private JTextField txtFFObs0;
	private JTextField txtFFObs1;
	private JTextField txtFFObs2;
	private JTextField txtFFObs3;
	private JTextField txtFFObs4;
	private JTextField txtFFObs5;
	private JTextField txtFFObs6;
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
	private JTextField txtFL2Cantidad00;
	private JTextField txtFL2Cantidad01;
	private JTextField txtFL2Cantidad10;
	private JTextField txtFL2Cantidad11;
	private JTextField txtFL2Cantidad20;
	private JTextField txtFL2Cantidad21;
	private JTextField txtFL2Cantidad30;
	private JTextField txtFL2Cantidad31;
	private JTextField txtFL2Cantidad40;
	private JTextField txtFL2Cantidad41;
	private JPanel panel_52;
	private JTextField txtFL2Obs0;
	private JTextField txtFL2Obs1;
	private JTextField txtFL2Obs2;
	private JTextField txtFL2Obs3;
	private JTextField txtFL2Obs4;
	private JLabel label_35;
	private JLabel label_36;
	private JPanel panel_53;
	private JPanel panel_54;
	private JLabel lblVentanasUpvcCon;
	private JLabel lblVentanasUpvcCon_1;
	private JLabel lblPerfilSfTipo_2;
	private JLabel lblComponenteArquitectnico;
	private JPanel panel_59;
	private JTextField txtCACantidad00;
	private JTextField txtCACantidad01;
	private JTextField txtCACantidad10;
	private JTextField txtCACantidad11;
	private JTextField txtCACantidad20;
	private JTextField txtCACantidad21;
	private JPanel panel_60;
	private JTextField txtCAObs0;
	private JTextField txtCAObs1;
	private JTextField txtCAObs2;
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
	private JTextField txtCACantidad90;
	private JTextField txtCACantidad91;
	private JTextField txtCACantidad100;
	private JTextField txtCACantidad101;
	private JTextField txtCACantidad110;
	private JTextField txtCACantidad111;
	private JTextField txtCACantidad120;
	private JTextField txtCACantidad121;
	private JTextField txtCACantidad130;
	private JTextField txtCACantidad131;
	private JTextField txtCACantidad140;
	private JTextField txtCACantidad141;
	private JPanel panel_64;
	private JTextField txtCAObs3;
	private JTextField txtCAObs4;
	private JTextField txtCAObs5;
	private JTextField txtCAObs6;
	private JTextField txtCAObs7;
	private JTextField txtCAObs8;
	private JTextField txtCAObs9;
	private JTextField txtCAObs10;
	private JTextField txtCAObs11;
	private JTextField txtCAObs12;
	private JTextField txtCAObs13;
	private JTextField txtCAObs14;
	private JLabel label_48;
	private JLabel label_49;
	private JTextField txtCAObs15;
	private JTextField txtCAObs16;
	private JTextField txtCAObs17;
	private JTextField txtCAObs18;
	private JTextField txtCAObs19;
	private JTextField txtCAObs20;
	private JTextField txtCAObs21;
	private JTextField txtCACantidad150;
	private JTextField txtCACantidad151;
	private JTextField txtCACantidad160;
	private JTextField txtCACantidad161;
	private JTextField txtCACantidad170;
	private JTextField txtCACantidad171;
	private JTextField txtCACantidad180;
	private JTextField txtCACantidad181;
	private JTextField txtCACantidad190;
	private JTextField txtCACantidad191;
	private JTextField txtCACantidad200;
	private JTextField txtCACantidad201;
	private JTextField txtCACantidad210;
	private JTextField txtCACantidad211;
	private JLabel lblPanelesVinilPiso_1;
	private JLabel lblPanelesEpsPara_1;
	private JLabel lblPanelDivisorioUrinario;
	private JLabel lblPanelesDivisoresBat;
	private JLabel lblSetPuertasInteriores;
	private JLabel lblPuertasingresoBaos;
	private JLabel lblBisagras_1;
	private JTextField txtAPCantidad31;

	TInformacionObligatoria infor;

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
	public MdTemplate() {
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
		setTitle("MD");

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

		txtKACantidad30 = new JTextField();
		txtKACantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtKACantidad30.setText("2");
		txtKACantidad30.setEditable(false);
		txtKACantidad30.setColumns(10);
		panel_3.add(txtKACantidad30);

		txtKACantidad31 = new JTextField();
		txtKACantidad31.setColumns(10);
		panel_3.add(txtKACantidad31);

		txtKACantidad40 = new JTextField();
		txtKACantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtKACantidad40.setText("1");
		txtKACantidad40.setEditable(false);
		txtKACantidad40.setColumns(10);
		panel_3.add(txtKACantidad40);

		txtKACantidad41 = new JTextField();
		txtKACantidad41.setColumns(10);
		panel_3.add(txtKACantidad41);

		txtKACantidad50 = new JTextField();
		txtKACantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtKACantidad50.setText("1");
		txtKACantidad50.setEditable(false);
		txtKACantidad50.setColumns(10);
		panel_3.add(txtKACantidad50);

		txtKACantidad51 = new JTextField();
		txtKACantidad51.setColumns(10);
		panel_3.add(txtKACantidad51);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 47, 55, 26);
		panel_2.add(panel_4);
		panel_4.setLayout(new GridLayout(1, 2, 0, 12));

		txtKACantidad20 = new JTextField();
		txtKACantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtKACantidad20.setText("2");
		txtKACantidad20.setEditable(false);
		txtKACantidad20.setColumns(10);
		panel_4.add(txtKACantidad20);

		txtKACantidad21 = new JTextField();
		txtKACantidad21.setColumns(10);
		panel_4.add(txtKACantidad21);

		panel_89 = new JPanel();
		panel_89.setBounds(0, 0, 55, 45);
		panel_2.add(panel_89);
		panel_89.setLayout(new GridLayout(2, 2, 0, 0));

		txtKACantidad00 = new JTextField();
		txtKACantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtKACantidad00.setText("3");
		txtKACantidad00.setEditable(false);
		txtKACantidad00.setColumns(10);
		panel_89.add(txtKACantidad00);

		txtKACantidad01 = new JTextField();
		txtKACantidad01.setColumns(10);
		panel_89.add(txtKACantidad01);

		txtKACantidad10 = new JTextField();
		txtKACantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtKACantidad10.setText("1");
		txtKACantidad10.setEditable(false);
		txtKACantidad10.setColumns(10);
		panel_89.add(txtKACantidad10);

		txtKACantidad11 = new JTextField();
		txtKACantidad11.setColumns(10);
		panel_89.add(txtKACantidad11);

		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(267, 17, 143, 172);
		panel_1.add(panel_5);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 90, 143, 74);
		panel_5.add(panel_6);
		panel_6.setLayout(new GridLayout(3, 0, 0, 0));

		txtKAObs3 = new JTextField();
		txtKAObs3.setColumns(10);
		panel_6.add(txtKAObs3);

		txtKAObs4 = new JTextField();
		txtKAObs4.setColumns(10);
		panel_6.add(txtKAObs4);

		txtKAObs5 = new JTextField();
		txtKAObs5.setColumns(10);
		panel_6.add(txtKAObs5);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(0, 47, 143, 26);
		panel_5.add(panel_7);
		panel_7.setLayout(new GridLayout(1, 0, 0, 12));

		txtKAObs2 = new JTextField();
		txtKAObs2.setColumns(10);
		panel_7.add(txtKAObs2);

		panel_90 = new JPanel();
		panel_90.setBounds(0, 0, 143, 45);
		panel_5.add(panel_90);
		panel_90.setLayout(new GridLayout(2, 0, 0, 0));

		txtKAObs0 = new JTextField();
		txtKAObs0.setColumns(10);
		panel_90.add(txtKAObs0);

		txtKAObs1 = new JTextField();
		txtKAObs1.setColumns(10);
		panel_90.add(txtKAObs1);

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

		txtKECantidad00 = new JTextField();
		txtKECantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECantidad00.setText("11");
		txtKECantidad00.setEditable(false);
		txtKECantidad00.setColumns(10);
		panel_13.add(txtKECantidad00);

		txtKECantidad01 = new JTextField();
		txtKECantidad01.setColumns(10);
		panel_13.add(txtKECantidad01);

		txtCantidad10 = new JTextField();
		txtCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad10.setText("6");
		txtCantidad10.setEditable(false);
		txtCantidad10.setColumns(10);
		panel_13.add(txtCantidad10);

		txtKECantidad11 = new JTextField();
		txtKECantidad11.setColumns(10);
		panel_13.add(txtKECantidad11);

		txtKECantidad20 = new JTextField();
		txtKECantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECantidad20.setText("1");
		txtKECantidad20.setEditable(false);
		txtKECantidad20.setColumns(10);
		panel_13.add(txtKECantidad20);

		txtKECantidad21 = new JTextField();
		txtKECantidad21.setColumns(10);
		panel_13.add(txtKECantidad21);

		txtKECantidad30 = new JTextField();
		txtKECantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECantidad30.setText("2");
		txtKECantidad30.setEditable(false);
		txtKECantidad30.setColumns(10);
		panel_13.add(txtKECantidad30);

		txtKECantidad31 = new JTextField();
		txtKECantidad31.setColumns(10);
		panel_13.add(txtKECantidad31);

		txtKECantidad40 = new JTextField();
		txtKECantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECantidad40.setText("1");
		txtKECantidad40.setEditable(false);
		txtKECantidad40.setColumns(10);
		panel_13.add(txtKECantidad40);

		txtKECantidad41 = new JTextField();
		txtKECantidad41.setColumns(10);
		panel_13.add(txtKECantidad41);

		txtKECantidad50 = new JTextField();
		txtKECantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECantidad50.setText("3");
		txtKECantidad50.setEditable(false);
		txtKECantidad50.setColumns(10);
		panel_13.add(txtKECantidad50);

		txtKECantidad51 = new JTextField();
		txtKECantidad51.setColumns(10);
		panel_13.add(txtKECantidad51);

		JPanel panel_14 = new JPanel();
		panel_14.setBounds(267, 17, 143, 134);
		panel_11.add(panel_14);
		panel_14.setLayout(new GridLayout(6, 0, 0, 0));

		txtKEObs0 = new JTextField();
		txtKEObs0.setColumns(10);
		panel_14.add(txtKEObs0);

		txtKEObs1 = new JTextField();
		txtKEObs1.setColumns(10);
		panel_14.add(txtKEObs1);

		txtKEObs2 = new JTextField();
		txtKEObs2.setColumns(10);
		panel_14.add(txtKEObs2);

		txtKEObs3 = new JTextField();
		txtKEObs3.setColumns(10);
		panel_14.add(txtKEObs3);

		txtKEObs4 = new JTextField();
		txtKEObs4.setColumns(10);
		panel_14.add(txtKEObs4);

		txtKEObs5 = new JTextField();
		txtKEObs5.setColumns(10);
		panel_14.add(txtKEObs5);

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

		txtPICantidad00 = new JTextField();
		txtPICantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtPICantidad00.setText("4");
		txtPICantidad00.setEditable(false);
		txtPICantidad00.setColumns(10);
		panel_26.add(txtPICantidad00);

		txtPICantidad01 = new JTextField();
		txtPICantidad01.setColumns(10);
		panel_26.add(txtPICantidad01);

		txtPICantidad10 = new JTextField();
		txtPICantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtPICantidad10.setText("2");
		txtPICantidad10.setEditable(false);
		txtPICantidad10.setColumns(10);
		panel_26.add(txtPICantidad10);

		txtPICantidad11 = new JTextField();
		txtPICantidad11.setColumns(10);
		panel_26.add(txtPICantidad11);

		txtPICantidad20 = new JTextField();
		txtPICantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtPICantidad20.setText("1");
		txtPICantidad20.setEditable(false);
		txtPICantidad20.setColumns(10);
		panel_26.add(txtPICantidad20);

		txtPICantidad21 = new JTextField();
		txtPICantidad21.setColumns(10);
		panel_26.add(txtPICantidad21);

		JPanel panel_27 = new JPanel();
		panel_27.setBounds(267, 17, 143, 67);
		panel_24.add(panel_27);
		panel_27.setLayout(new GridLayout(3, 0, 0, 0));

		txtPIObs0 = new JTextField();
		txtPIObs0.setColumns(10);
		panel_27.add(txtPIObs0);

		txtPIObs1 = new JTextField();
		txtPIObs1.setColumns(10);
		panel_27.add(txtPIObs1);

		txtPIObs2 = new JTextField();
		txtPIObs2.setColumns(10);
		panel_27.add(txtPIObs2);

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

		txtKHCantidad00 = new JTextField();
		txtKHCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtKHCantidad00.setText("3");
		txtKHCantidad00.setEditable(false);
		txtKHCantidad00.setColumns(10);
		panel_17.add(txtKHCantidad00);

		txtKHCantidad01 = new JTextField();
		txtKHCantidad01.setColumns(10);
		panel_17.add(txtKHCantidad01);

		txtKHCantidad10 = new JTextField();
		txtKHCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtKHCantidad10.setText("1");
		txtKHCantidad10.setEditable(false);
		txtKHCantidad10.setColumns(10);
		panel_17.add(txtKHCantidad10);

		txtKHCantidad11 = new JTextField();
		txtKHCantidad11.setColumns(10);
		panel_17.add(txtKHCantidad11);

		txtKHCantidad20 = new JTextField();
		txtKHCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtKHCantidad20.setText("2");
		txtKHCantidad20.setEditable(false);
		txtKHCantidad20.setColumns(10);
		panel_17.add(txtKHCantidad20);

		txtKHCantidad21 = new JTextField();
		txtKHCantidad21.setColumns(10);
		panel_17.add(txtKHCantidad21);

		panel_18 = new JPanel();
		panel_18.setBounds(267, 17, 143, 67);
		panel_15.add(panel_18);
		panel_18.setLayout(new GridLayout(3, 0, 0, 0));

		txtKHObs0 = new JTextField();
		txtKHObs0.setColumns(10);
		panel_18.add(txtKHObs0);

		txtKHObs1 = new JTextField();
		txtKHObs1.setColumns(10);
		panel_18.add(txtKHObs1);

		txtKHObs2 = new JTextField();
		txtKHObs2.setColumns(10);
		panel_18.add(txtKHObs2);

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

		txtAPCantidad80 = new JTextField();
		txtAPCantidad80.setHorizontalAlignment(SwingConstants.CENTER);
		txtAPCantidad80.setText("2");
		txtAPCantidad80.setEditable(false);
		txtAPCantidad80.setColumns(10);
		panel_21.add(txtAPCantidad80);

		txtAPCantidad81 = new JTextField();
		txtAPCantidad81.setColumns(10);
		panel_21.add(txtAPCantidad81);

		panel_22 = new JPanel();
		panel_22.setBounds(267, 43, 143, 25);
		panel_19.add(panel_22);
		panel_22.setLayout(new GridLayout(1, 0, 0, 0));

		txAPLObs8 = new JTextField();
		txAPLObs8.setColumns(10);
		panel_22.add(txAPLObs8);

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

		txtASCantidad00 = new JTextField();
		txtASCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtASCantidad00.setText("2");
		txtASCantidad00.setEditable(false);
		txtASCantidad00.setColumns(10);
		panel_101.add(txtASCantidad00);

		txtASCantidad01 = new JTextField();
		txtASCantidad01.setColumns(10);
		panel_101.add(txtASCantidad01);

		panel_103 = new JPanel();
		panel_103.setBounds(0, 51, 55, 26);
		panel_100.add(panel_103);
		panel_103.setLayout(new GridLayout(1, 2, 0, 1));

		txtASCantidad10 = new JTextField();
		txtASCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtASCantidad10.setText("2");
		txtASCantidad10.setEditable(false);
		txtASCantidad10.setColumns(10);
		panel_103.add(txtASCantidad10);

		txtASCantidad11 = new JTextField();
		txtASCantidad11.setColumns(10);
		panel_103.add(txtASCantidad11);

		panel_104 = new JPanel();
		panel_104.setBounds(0, 84, 55, 46);
		panel_100.add(panel_104);
		panel_104.setLayout(new GridLayout(2, 2, 0, 0));

		txtASCantidad20 = new JTextField();
		txtASCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtASCantidad20.setText("1");
		txtASCantidad20.setEditable(false);
		txtASCantidad20.setColumns(10);
		panel_104.add(txtASCantidad20);

		txtASCantidad21 = new JTextField();
		txtASCantidad21.setColumns(10);
		panel_104.add(txtASCantidad21);

		txtASCantidad30 = new JTextField();
		txtASCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtASCantidad30.setText("1");
		txtASCantidad30.setEditable(false);
		txtASCantidad30.setColumns(10);
		panel_104.add(txtASCantidad30);

		txtASCantidad31 = new JTextField();
		txtASCantidad31.setColumns(10);
		panel_104.add(txtASCantidad31);

		panel_105 = new JPanel();
		panel_105.setBounds(0, 145, 55, 25);
		panel_100.add(panel_105);
		panel_105.setLayout(new GridLayout(1, 1, 0, 0));

		txtASCantidad40 = new JTextField();
		txtASCantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtASCantidad40.setText("1");
		txtASCantidad40.setEditable(false);
		txtASCantidad40.setColumns(10);
		panel_105.add(txtASCantidad40);

		txtASCantidad41 = new JTextField();
		txtASCantidad41.setColumns(10);
		panel_105.add(txtASCantidad41);

		panel_108 = new JPanel();
		panel_108.setBounds(0, 178, 55, 25);
		panel_100.add(panel_108);
		panel_108.setLayout(new GridLayout(1, 1, 0, 0));

		txtASCantidad50 = new JTextField();
		txtASCantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtASCantidad50.setText("1");
		txtASCantidad50.setEditable(false);
		txtASCantidad50.setColumns(10);
		panel_108.add(txtASCantidad50);

		txtASCantidad51 = new JTextField();
		txtASCantidad51.setColumns(10);
		panel_108.add(txtASCantidad51);

		panel_106 = new JPanel();
		panel_106.setLayout(null);
		panel_106.setBounds(267, 17, 143, 207);
		panel_99.add(panel_106);

		panel_107 = new JPanel();
		panel_107.setBounds(0, 11, 143, 26);
		panel_106.add(panel_107);
		panel_107.setLayout(new GridLayout(1, 0, 0, 1));

		txtASObs0 = new JTextField();
		txtASObs0.setColumns(10);
		panel_107.add(txtASObs0);

		panel_109 = new JPanel();
		panel_109.setBounds(0, 51, 143, 26);
		panel_106.add(panel_109);
		panel_109.setLayout(new GridLayout(1, 0, 0, 1));

		txtASObs1 = new JTextField();
		txtASObs1.setColumns(10);
		panel_109.add(txtASObs1);

		panel_110 = new JPanel();
		panel_110.setBounds(0, 84, 143, 45);
		panel_106.add(panel_110);
		panel_110.setLayout(new GridLayout(2, 0, 0, 0));

		txtASObs2 = new JTextField();
		txtASObs2.setColumns(10);
		panel_110.add(txtASObs2);

		txtASObs3 = new JTextField();
		txtASObs3.setColumns(10);
		panel_110.add(txtASObs3);

		panel_111 = new JPanel();
		panel_111.setBounds(0, 145, 143, 25);
		panel_106.add(panel_111);
		panel_111.setLayout(new GridLayout(1, 0, 0, 0));

		txtASObs4 = new JTextField();
		txtASObs4.setColumns(10);
		panel_111.add(txtASObs4);

		panel_113 = new JPanel();
		panel_113.setBounds(0, 178, 143, 25);
		panel_106.add(panel_113);
		panel_113.setLayout(new GridLayout(1, 0, 0, 0));

		txtASObs5 = new JTextField();
		txtASObs5.setColumns(10);
		panel_113.add(txtASObs5);

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

		txtAPCantidad00 = new JTextField();
		txtAPCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtAPCantidad00.setText("3");
		txtAPCantidad00.setEditable(false);
		txtAPCantidad00.setColumns(10);
		panel_30.add(txtAPCantidad00);

		txtAPCantidad01 = new JTextField();
		txtAPCantidad01.setColumns(10);
		panel_30.add(txtAPCantidad01);

		panel_29 = new JPanel();
		panel_29.setBounds(0, 70, 55, 45);
		panel_28.add(panel_29);
		panel_29.setLayout(new GridLayout(2, 2, 0, 0));

		txtAPCantidad10 = new JTextField();
		txtAPCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtAPCantidad10.setText("1");
		txtAPCantidad10.setEditable(false);
		txtAPCantidad10.setColumns(10);
		panel_29.add(txtAPCantidad10);

		txtAPCantidad11 = new JTextField();
		txtAPCantidad11.setColumns(10);
		panel_29.add(txtAPCantidad11);

		txtAPCantidad20 = new JTextField();
		txtAPCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtAPCantidad20.setText("1");
		txtAPCantidad20.setEditable(false);
		txtAPCantidad20.setColumns(10);
		panel_29.add(txtAPCantidad20);

		txtAPCantidad21 = new JTextField();
		txtAPCantidad21.setColumns(10);
		panel_29.add(txtAPCantidad21);

		panel_91 = new JPanel();
		panel_91.setBounds(0, 148, 55, 26);
		panel_28.add(panel_91);
		panel_91.setLayout(new GridLayout(1, 2, 0, 1));

		txtAPCantidad30 = new JTextField();
		txtAPCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtAPCantidad30.setText("1");
		txtAPCantidad30.setEditable(false);
		txtAPCantidad30.setColumns(10);
		panel_91.add(txtAPCantidad30);

		txtAPCantidad31 = new JTextField();
		txtAPCantidad31.setColumns(10);
		panel_91.add(txtAPCantidad31);

		panel_94 = new JPanel();
		panel_94.setBounds(0, 180, 55, 77);
		panel_28.add(panel_94);
		panel_94.setLayout(new GridLayout(3, 2, 0, 0));

		txtAPCantidad40 = new JTextField();
		txtAPCantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtAPCantidad40.setText("3");
		txtAPCantidad40.setEditable(false);
		txtAPCantidad40.setColumns(10);
		panel_94.add(txtAPCantidad40);

		txtAPCantidad41 = new JTextField();
		txtAPCantidad41.setColumns(10);
		panel_94.add(txtAPCantidad41);

		txtAPCantidad50 = new JTextField();
		txtAPCantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtAPCantidad50.setText("1");
		txtAPCantidad50.setEditable(false);
		txtAPCantidad50.setColumns(10);
		panel_94.add(txtAPCantidad50);

		txtAPCantidad51 = new JTextField();
		txtAPCantidad51.setColumns(10);
		panel_94.add(txtAPCantidad51);

		txtAPCantidad60 = new JTextField();
		txtAPCantidad60.setHorizontalAlignment(SwingConstants.CENTER);
		txtAPCantidad60.setText("1");
		txtAPCantidad60.setEditable(false);
		txtAPCantidad60.setColumns(10);
		panel_94.add(txtAPCantidad60);

		txtAPCantidad61 = new JTextField();
		txtAPCantidad61.setColumns(10);
		panel_94.add(txtAPCantidad61);

		panel_97 = new JPanel();
		panel_97.setBounds(0, 263, 55, 25);
		panel_28.add(panel_97);
		panel_97.setLayout(new GridLayout(1, 1, 0, 0));

		txtAPCantidad70 = new JTextField();
		txtAPCantidad70.setHorizontalAlignment(SwingConstants.CENTER);
		txtAPCantidad70.setText("1");
		txtAPCantidad70.setEditable(false);
		txtAPCantidad70.setColumns(10);
		panel_97.add(txtAPCantidad70);

		txtAPCantidad71 = new JTextField();
		txtAPCantidad71.setColumns(10);
		panel_97.add(txtAPCantidad71);

		panel_32 = new JPanel();
		panel_32.setLayout(null);
		panel_32.setBounds(267, 17, 143, 296);
		panel_23.add(panel_32);

		panel_33 = new JPanel();
		panel_33.setBounds(0, 30, 143, 26);
		panel_32.add(panel_33);
		panel_33.setLayout(new GridLayout(1, 0, 0, 1));

		txtAPObs0 = new JTextField();
		txtAPObs0.setColumns(10);
		panel_33.add(txtAPObs0);

		panel_31 = new JPanel();
		panel_31.setBounds(0, 70, 143, 45);
		panel_32.add(panel_31);
		panel_31.setLayout(new GridLayout(2, 0, 0, 0));

		txtAPObs1 = new JTextField();
		txtAPObs1.setColumns(10);
		panel_31.add(txtAPObs1);

		txtAPObs2 = new JTextField();
		txtAPObs2.setColumns(10);
		panel_31.add(txtAPObs2);

		panel_92 = new JPanel();
		panel_92.setBounds(0, 148, 143, 26);
		panel_32.add(panel_92);
		panel_92.setLayout(new GridLayout(1, 0, 0, 1));

		txtAPObs3 = new JTextField();
		txtAPObs3.setColumns(10);
		panel_92.add(txtAPObs3);

		panel_95 = new JPanel();
		panel_95.setBounds(0, 180, 143, 77);
		panel_32.add(panel_95);
		panel_95.setLayout(new GridLayout(3, 0, 0, 0));

		txtAPObs4 = new JTextField();
		txtAPObs4.setColumns(10);
		panel_95.add(txtAPObs4);

		txtAPObs5 = new JTextField();
		txtAPObs5.setColumns(10);
		panel_95.add(txtAPObs5);

		txtAPObs6 = new JTextField();
		txtAPObs6.setColumns(10);
		panel_95.add(txtAPObs6);

		panel_98 = new JPanel();
		panel_98.setBounds(0, 263, 143, 25);
		panel_32.add(panel_98);
		panel_98.setLayout(new GridLayout(1, 0, 0, 0));

		txtAPObs7 = new JTextField();
		txtAPObs7.setColumns(10);
		panel_98.add(txtAPObs7);

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

		txtASCantidad60 = new JTextField();
		txtASCantidad60.setHorizontalAlignment(SwingConstants.CENTER);
		txtASCantidad60.setText("3");
		txtASCantidad60.setEditable(false);
		txtASCantidad60.setColumns(10);
		panel_38.add(txtASCantidad60);

		txtASCantidad61 = new JTextField();
		txtASCantidad61.setColumns(10);
		panel_38.add(txtASCantidad61);

		JPanel panel_39 = new JPanel();
		panel_39.setBounds(0, 107, 55, 26);
		panel_37.add(panel_39);
		panel_39.setLayout(new GridLayout(1, 2, 0, 1));

		txtASCantidad90 = new JTextField();
		txtASCantidad90.setHorizontalAlignment(SwingConstants.CENTER);
		txtASCantidad90.setText("1");
		txtASCantidad90.setEditable(false);
		txtASCantidad90.setColumns(10);
		panel_39.add(txtASCantidad90);

		txtASCantidad91 = new JTextField();
		txtASCantidad91.setColumns(10);
		panel_39.add(txtASCantidad91);

		JPanel panel_40 = new JPanel();
		panel_40.setBounds(0, 50, 55, 46);
		panel_37.add(panel_40);
		panel_40.setLayout(new GridLayout(2, 2, 0, 0));

		txtASCantidad70 = new JTextField();
		txtASCantidad70.setHorizontalAlignment(SwingConstants.CENTER);
		txtASCantidad70.setText("3");
		txtASCantidad70.setEditable(false);
		txtASCantidad70.setColumns(10);
		panel_40.add(txtASCantidad70);

		txtASCantidad71 = new JTextField();
		txtASCantidad71.setColumns(10);
		panel_40.add(txtASCantidad71);

		txtASCantidad80 = new JTextField();
		txtASCantidad80.setHorizontalAlignment(SwingConstants.CENTER);
		txtASCantidad80.setText("1");
		txtASCantidad80.setEditable(false);
		txtASCantidad80.setColumns(10);
		panel_40.add(txtASCantidad80);

		txtASCantidad81 = new JTextField();
		txtASCantidad81.setColumns(10);
		panel_40.add(txtASCantidad81);

		JPanel panel_41 = new JPanel();
		panel_41.setBounds(0, 150, 55, 25);
		panel_37.add(panel_41);
		panel_41.setLayout(new GridLayout(1, 1, 0, 0));

		txtASCantidad100 = new JTextField();
		txtASCantidad100.setHorizontalAlignment(SwingConstants.CENTER);
		txtASCantidad100.setText("1");
		txtASCantidad100.setEditable(false);
		txtASCantidad100.setColumns(10);
		panel_41.add(txtASCantidad100);

		txtASCantidad101 = new JTextField();
		txtASCantidad101.setColumns(10);
		panel_41.add(txtASCantidad101);

		JPanel panel_42 = new JPanel();
		panel_42.setBounds(0, 187, 55, 25);
		panel_37.add(panel_42);
		panel_42.setLayout(new GridLayout(1, 1, 0, 0));

		txtASCantidad110 = new JTextField();
		txtASCantidad110.setHorizontalAlignment(SwingConstants.CENTER);
		txtASCantidad110.setText("1");
		txtASCantidad110.setEditable(false);
		txtASCantidad110.setColumns(10);
		panel_42.add(txtASCantidad110);

		txtASCantidad111 = new JTextField();
		txtASCantidad111.setColumns(10);
		panel_42.add(txtASCantidad111);

		JPanel panel_43 = new JPanel();
		panel_43.setLayout(null);
		panel_43.setBounds(267, 17, 143, 237);
		panel_36.add(panel_43);

		JPanel panel_116 = new JPanel();
		panel_116.setBounds(0, 11, 143, 26);
		panel_43.add(panel_116);
		panel_116.setLayout(new GridLayout(1, 0, 0, 1));

		txtASObs6 = new JTextField();
		txtASObs6.setColumns(10);
		panel_116.add(txtASObs6);

		JPanel panel_117 = new JPanel();
		panel_117.setBounds(0, 107, 143, 26);
		panel_43.add(panel_117);
		panel_117.setLayout(new GridLayout(1, 0, 0, 1));

		txtASObs9 = new JTextField();
		txtASObs9.setColumns(10);
		panel_117.add(txtASObs9);

		JPanel panel_118 = new JPanel();
		panel_118.setBounds(0, 50, 143, 45);
		panel_43.add(panel_118);
		panel_118.setLayout(new GridLayout(2, 0, 0, 0));

		txtASObs7 = new JTextField();
		txtASObs7.setColumns(10);
		panel_118.add(txtASObs7);

		txtASObs8 = new JTextField();
		txtASObs8.setColumns(10);
		panel_118.add(txtASObs8);

		JPanel panel_119 = new JPanel();
		panel_119.setBounds(0, 150, 143, 25);
		panel_43.add(panel_119);
		panel_119.setLayout(new GridLayout(1, 0, 0, 0));

		txtASObs10 = new JTextField();
		txtASObs10.setColumns(10);
		panel_119.add(txtASObs10);

		JPanel panel_120 = new JPanel();
		panel_120.setBounds(0, 187, 143, 25);
		panel_43.add(panel_120);
		panel_120.setLayout(new GridLayout(1, 0, 0, 0));

		txtASObs11 = new JTextField();
		txtASObs11.setColumns(10);
		panel_120.add(txtASObs11);

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

		txtComCantidad20 = new JTextField();
		txtComCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtComCantidad20.setText("3");
		txtComCantidad20.setEditable(false);
		txtComCantidad20.setColumns(10);
		panel_127.add(txtComCantidad20);

		txtComCantidad21 = new JTextField();
		txtComCantidad21.setColumns(10);
		panel_127.add(txtComCantidad21);

		txtComCantidad30 = new JTextField();
		txtComCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtComCantidad30.setText("1");
		txtComCantidad30.setEditable(false);
		txtComCantidad30.setColumns(10);
		panel_127.add(txtComCantidad30);

		txtComCantidad31 = new JTextField();
		txtComCantidad31.setColumns(10);
		panel_127.add(txtComCantidad31);

		txtComCantidad40 = new JTextField();
		txtComCantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtComCantidad40.setText("3");
		txtComCantidad40.setEditable(false);
		txtComCantidad40.setColumns(10);
		panel_127.add(txtComCantidad40);

		txtComCantidad41 = new JTextField();
		txtComCantidad41.setColumns(10);
		panel_127.add(txtComCantidad41);

		panel_128 = new JPanel();
		panel_128.setBounds(0, 0, 55, 26);
		panel_126.add(panel_128);
		panel_128.setLayout(new GridLayout(1, 2, 0, 1));

		txtComCantidad00 = new JTextField();
		txtComCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtComCantidad00.setText("1");
		txtComCantidad00.setEditable(false);
		txtComCantidad00.setColumns(10);
		panel_128.add(txtComCantidad00);

		txtComCantidad01 = new JTextField();
		txtComCantidad01.setColumns(10);
		panel_128.add(txtComCantidad01);

		panel_129 = new JPanel();
		panel_129.setBounds(0, 34, 55, 26);
		panel_126.add(panel_129);
		panel_129.setLayout(new GridLayout(1, 2, 0, 1));

		txtComCantidad10 = new JTextField();
		txtComCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtComCantidad10.setText("3");
		txtComCantidad10.setEditable(false);
		txtComCantidad10.setColumns(10);
		panel_129.add(txtComCantidad10);

		txtComCantidad11 = new JTextField();
		txtComCantidad11.setColumns(10);
		panel_129.add(txtComCantidad11);

		panel_130 = new JPanel();
		panel_130.setLayout(null);
		panel_130.setBounds(267, 17, 143, 147);
		panel_125.add(panel_130);

		panel_131 = new JPanel();
		panel_131.setBounds(0, 72, 143, 74);
		panel_130.add(panel_131);
		panel_131.setLayout(new GridLayout(3, 0, 0, 0));

		txtComObs2 = new JTextField();
		txtComObs2.setColumns(10);
		panel_131.add(txtComObs2);

		txtComObs3 = new JTextField();
		txtComObs3.setColumns(10);
		panel_131.add(txtComObs3);

		txtComObs4 = new JTextField();
		txtComObs4.setColumns(10);
		panel_131.add(txtComObs4);

		panel_132 = new JPanel();
		panel_132.setBounds(0, 0, 143, 26);
		panel_130.add(panel_132);
		panel_132.setLayout(new GridLayout(1, 0, 0, 1));

		txtComObs0 = new JTextField();
		txtComObs0.setColumns(10);
		panel_132.add(txtComObs0);

		panel_133 = new JPanel();
		panel_133.setBounds(0, 34, 143, 26);
		panel_130.add(panel_133);
		panel_133.setLayout(new GridLayout(1, 0, 0, 1));

		txtComObs1 = new JTextField();
		txtComObs1.setColumns(10);
		panel_133.add(txtComObs1);

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

		txtFPCantidad00 = new JTextField();
		txtFPCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtFPCantidad00.setText("3");
		txtFPCantidad00.setEditable(false);
		txtFPCantidad00.setColumns(10);
		panel_57.add(txtFPCantidad00);

		txtFPCantidad01 = new JTextField();
		txtFPCantidad01.setColumns(10);
		panel_57.add(txtFPCantidad01);

		txtFPCantidad10 = new JTextField();
		txtFPCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtFPCantidad10.setText("1");
		txtFPCantidad10.setEditable(false);
		txtFPCantidad10.setColumns(10);
		panel_57.add(txtFPCantidad10);

		txtFPCantidad11 = new JTextField();
		txtFPCantidad11.setColumns(10);
		panel_57.add(txtFPCantidad11);

		txtFPCantidad20 = new JTextField();
		txtFPCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtFPCantidad20.setText("6");
		txtFPCantidad20.setEditable(false);
		txtFPCantidad20.setColumns(10);
		panel_57.add(txtFPCantidad20);

		txtFPCantidad21 = new JTextField();
		txtFPCantidad21.setColumns(10);
		panel_57.add(txtFPCantidad21);

		txtFPCantidad30 = new JTextField();
		txtFPCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtFPCantidad30.setText("6");
		txtFPCantidad30.setEditable(false);
		txtFPCantidad30.setColumns(10);
		panel_57.add(txtFPCantidad30);

		txtFPCantidad31 = new JTextField();
		txtFPCantidad31.setColumns(10);
		panel_57.add(txtFPCantidad31);

		txtFPCantidad40 = new JTextField();
		txtFPCantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtFPCantidad40.setText("1");
		txtFPCantidad40.setEditable(false);
		txtFPCantidad40.setColumns(10);
		panel_57.add(txtFPCantidad40);

		txtFPCantidad41 = new JTextField();
		txtFPCantidad41.setColumns(10);
		panel_57.add(txtFPCantidad41);

		JPanel panel_58 = new JPanel();
		panel_58.setBounds(267, 17, 143, 106);
		panel_55.add(panel_58);
		panel_58.setLayout(new GridLayout(5, 0, 0, 0));

		txtFPObs0 = new JTextField();
		txtFPObs0.setColumns(10);
		panel_58.add(txtFPObs0);

		txtFPObs1 = new JTextField();
		txtFPObs1.setColumns(10);
		panel_58.add(txtFPObs1);

		txtFPObs2 = new JTextField();
		txtFPObs2.setColumns(10);
		panel_58.add(txtFPObs2);

		txtFPObs3 = new JTextField();
		txtFPObs3.setColumns(10);
		panel_58.add(txtFPObs3);

		txtFPObs4 = new JTextField();
		txtFPObs4.setColumns(10);
		panel_58.add(txtFPObs4);

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

		txtCECantidad00 = new JTextField();
		txtCECantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad00.setText("21");
		txtCECantidad00.setEditable(false);
		txtCECantidad00.setColumns(10);
		panel_82.add(txtCECantidad00);

		txtCECantidad01 = new JTextField();
		txtCECantidad01.setColumns(10);
		panel_82.add(txtCECantidad01);

		txtCECantidad10 = new JTextField();
		txtCECantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad10.setText("2");
		txtCECantidad10.setEditable(false);
		txtCECantidad10.setColumns(10);
		panel_82.add(txtCECantidad10);

		txtCECantidad11 = new JTextField();
		txtCECantidad11.setColumns(10);
		panel_82.add(txtCECantidad11);

		txtCECantidad20 = new JTextField();
		txtCECantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad20.setText("2");
		txtCECantidad20.setEditable(false);
		txtCECantidad20.setColumns(10);
		panel_82.add(txtCECantidad20);

		txtCECantidad21 = new JTextField();
		txtCECantidad21.setColumns(10);
		panel_82.add(txtCECantidad21);

		txtCECantidad30 = new JTextField();
		txtCECantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad30.setText("20");
		txtCECantidad30.setEditable(false);
		txtCECantidad30.setColumns(10);
		panel_82.add(txtCECantidad30);

		txtCECantidad31 = new JTextField();
		txtCECantidad31.setColumns(10);
		panel_82.add(txtCECantidad31);

		txtCECantidad40 = new JTextField();
		txtCECantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad40.setText("6");
		txtCECantidad40.setEditable(false);
		txtCECantidad40.setColumns(10);
		panel_82.add(txtCECantidad40);

		txtCECantidad41 = new JTextField();
		txtCECantidad41.setColumns(10);
		panel_82.add(txtCECantidad41);

		txtCECantidad50 = new JTextField();
		txtCECantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad50.setText("40");
		txtCECantidad50.setEditable(false);
		txtCECantidad50.setColumns(10);
		panel_82.add(txtCECantidad50);

		txtCECantidad51 = new JTextField();
		txtCECantidad51.setColumns(10);
		panel_82.add(txtCECantidad51);

		txtCECantidad60 = new JTextField();
		txtCECantidad60.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad60.setText("40");
		txtCECantidad60.setEditable(false);
		txtCECantidad60.setColumns(10);
		panel_82.add(txtCECantidad60);

		txtCECantidad61 = new JTextField();
		txtCECantidad61.setColumns(10);
		panel_82.add(txtCECantidad61);

		txtCECantidad70 = new JTextField();
		txtCECantidad70.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad70.setText("2");
		txtCECantidad70.setEditable(false);
		txtCECantidad70.setColumns(10);
		panel_82.add(txtCECantidad70);

		txtCECantidad71 = new JTextField();
		txtCECantidad71.setColumns(10);
		panel_82.add(txtCECantidad71);

		txtCECantidad80 = new JTextField();
		txtCECantidad80.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad80.setText("2");
		txtCECantidad80.setEditable(false);
		txtCECantidad80.setColumns(10);
		panel_82.add(txtCECantidad80);

		txtCECantidad81 = new JTextField();
		txtCECantidad81.setColumns(10);
		panel_82.add(txtCECantidad81);

		txtCECantidad90 = new JTextField();
		txtCECantidad90.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad90.setText("20");
		txtCECantidad90.setEditable(false);
		txtCECantidad90.setColumns(10);
		panel_82.add(txtCECantidad90);

		txtCECantidad91 = new JTextField();
		txtCECantidad91.setColumns(10);
		panel_82.add(txtCECantidad91);

		txtCECantidad100 = new JTextField();
		txtCECantidad100.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad100.setText("6");
		txtCECantidad100.setEditable(false);
		txtCECantidad100.setColumns(10);
		panel_82.add(txtCECantidad100);

		txtCECantidad101 = new JTextField();
		txtCECantidad101.setColumns(10);
		panel_82.add(txtCECantidad101);

		txtCECantidad110 = new JTextField();
		txtCECantidad110.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad110.setText("40");
		txtCECantidad110.setEditable(false);
		txtCECantidad110.setColumns(10);
		panel_82.add(txtCECantidad110);

		txtCECantidad111 = new JTextField();
		txtCECantidad111.setColumns(10);
		panel_82.add(txtCECantidad111);

		JPanel panel_83 = new JPanel();
		panel_83.setBounds(267, 17, 143, 300);
		panel_80.add(panel_83);
		panel_83.setLayout(new GridLayout(12, 0, 0, 0));

		txtCEObs0 = new JTextField();
		txtCEObs0.setColumns(10);
		panel_83.add(txtCEObs0);

		txtCEObs1 = new JTextField();
		txtCEObs1.setColumns(10);
		panel_83.add(txtCEObs1);

		txtCEObs2 = new JTextField();
		txtCEObs2.setColumns(10);
		panel_83.add(txtCEObs2);

		txtCEObs3 = new JTextField();
		txtCEObs3.setColumns(10);
		panel_83.add(txtCEObs3);

		txtCEObs4 = new JTextField();
		txtCEObs4.setColumns(10);
		panel_83.add(txtCEObs4);

		txtCEObs5 = new JTextField();
		txtCEObs5.setColumns(10);
		panel_83.add(txtCEObs5);

		txtCEObs6 = new JTextField();
		txtCEObs6.setColumns(10);
		panel_83.add(txtCEObs6);

		txtCEObs7 = new JTextField();
		txtCEObs7.setColumns(10);
		panel_83.add(txtCEObs7);

		txtCEObs8 = new JTextField();
		txtCEObs8.setColumns(10);
		panel_83.add(txtCEObs8);

		txtCEObs9 = new JTextField();
		txtCEObs9.setColumns(10);
		panel_83.add(txtCEObs9);

		txtCEObs10 = new JTextField();
		txtCEObs10.setColumns(10);
		panel_83.add(txtCEObs10);

		txtCEObs11 = new JTextField();
		txtCEObs11.setColumns(10);
		panel_83.add(txtCEObs11);

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

		txtFFCantidad00 = new JTextField();
		txtFFCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtFFCantidad00.setText("6");
		txtFFCantidad00.setEditable(false);
		txtFFCantidad00.setColumns(10);
		panel_47.add(txtFFCantidad00);

		txtFFCantidad01 = new JTextField();
		txtFFCantidad01.setColumns(10);
		panel_47.add(txtFFCantidad01);

		txtFFCantidad10 = new JTextField();
		txtFFCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtFFCantidad10.setText("1");
		txtFFCantidad10.setEditable(false);
		txtFFCantidad10.setColumns(10);
		panel_47.add(txtFFCantidad10);

		txtFFCantidad11 = new JTextField();
		txtFFCantidad11.setColumns(10);
		panel_47.add(txtFFCantidad11);

		txtFFCantidad20 = new JTextField();
		txtFFCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtFFCantidad20.setText("3");
		txtFFCantidad20.setEditable(false);
		txtFFCantidad20.setColumns(10);
		panel_47.add(txtFFCantidad20);

		txtFFCantidad21 = new JTextField();
		txtFFCantidad21.setColumns(10);
		panel_47.add(txtFFCantidad21);

		txtFFCantidad30 = new JTextField();
		txtFFCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtFFCantidad30.setText("3");
		txtFFCantidad30.setEditable(false);
		txtFFCantidad30.setColumns(10);
		panel_47.add(txtFFCantidad30);

		txtFFCantidad31 = new JTextField();
		txtFFCantidad31.setColumns(10);
		panel_47.add(txtFFCantidad31);

		txtFFCantidad40 = new JTextField();
		txtFFCantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtFFCantidad40.setText("1");
		txtFFCantidad40.setEditable(false);
		txtFFCantidad40.setColumns(10);
		panel_47.add(txtFFCantidad40);

		txtFFCantidad41 = new JTextField();
		txtFFCantidad41.setColumns(10);
		panel_47.add(txtFFCantidad41);

		txtFFCantidad50 = new JTextField();
		txtFFCantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtFFCantidad50.setText("1");
		txtFFCantidad50.setEditable(false);
		txtFFCantidad50.setColumns(10);
		panel_47.add(txtFFCantidad50);

		txtFFCantidad51 = new JTextField();
		txtFFCantidad51.setColumns(10);
		panel_47.add(txtFFCantidad51);

		txtFFCantidad60 = new JTextField();
		txtFFCantidad60.setHorizontalAlignment(SwingConstants.CENTER);
		txtFFCantidad60.setText("1");
		txtFFCantidad60.setEditable(false);
		txtFFCantidad60.setColumns(10);
		panel_47.add(txtFFCantidad60);

		txtFFCantidad61 = new JTextField();
		txtFFCantidad61.setColumns(10);
		panel_47.add(txtFFCantidad61);

		panel_48 = new JPanel();
		panel_48.setBounds(267, 17, 143, 144);
		panel_45.add(panel_48);
		panel_48.setLayout(new GridLayout(7, 0, 0, 0));

		txtFFObs0 = new JTextField();
		txtFFObs0.setColumns(10);
		panel_48.add(txtFFObs0);

		txtFFObs1 = new JTextField();
		txtFFObs1.setColumns(10);
		panel_48.add(txtFFObs1);

		txtFFObs2 = new JTextField();
		txtFFObs2.setColumns(10);
		panel_48.add(txtFFObs2);

		txtFFObs3 = new JTextField();
		txtFFObs3.setColumns(10);
		panel_48.add(txtFFObs3);

		txtFFObs4 = new JTextField();
		txtFFObs4.setColumns(10);
		panel_48.add(txtFFObs4);

		txtFFObs5 = new JTextField();
		txtFFObs5.setColumns(10);
		panel_48.add(txtFFObs5);

		txtFFObs6 = new JTextField();
		txtFFObs6.setColumns(10);
		panel_48.add(txtFFObs6);

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

		txtFL2Cantidad00 = new JTextField();
		txtFL2Cantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtFL2Cantidad00.setText("6");
		txtFL2Cantidad00.setEditable(false);
		txtFL2Cantidad00.setColumns(10);
		panel_51.add(txtFL2Cantidad00);

		txtFL2Cantidad01 = new JTextField();
		txtFL2Cantidad01.setColumns(10);
		panel_51.add(txtFL2Cantidad01);

		txtFL2Cantidad10 = new JTextField();
		txtFL2Cantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtFL2Cantidad10.setText("6");
		txtFL2Cantidad10.setEditable(false);
		txtFL2Cantidad10.setColumns(10);
		panel_51.add(txtFL2Cantidad10);

		txtFL2Cantidad11 = new JTextField();
		txtFL2Cantidad11.setColumns(10);
		panel_51.add(txtFL2Cantidad11);

		txtFL2Cantidad20 = new JTextField();
		txtFL2Cantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtFL2Cantidad20.setText("1");
		txtFL2Cantidad20.setEditable(false);
		txtFL2Cantidad20.setColumns(10);
		panel_51.add(txtFL2Cantidad20);

		txtFL2Cantidad21 = new JTextField();
		txtFL2Cantidad21.setColumns(10);
		panel_51.add(txtFL2Cantidad21);

		txtFL2Cantidad30 = new JTextField();
		txtFL2Cantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtFL2Cantidad30.setText("224");
		txtFL2Cantidad30.setEditable(false);
		txtFL2Cantidad30.setColumns(10);
		panel_51.add(txtFL2Cantidad30);

		txtFL2Cantidad31 = new JTextField();
		txtFL2Cantidad31.setColumns(10);
		panel_51.add(txtFL2Cantidad31);

		txtFL2Cantidad40 = new JTextField();
		txtFL2Cantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtFL2Cantidad40.setText("9");
		txtFL2Cantidad40.setEditable(false);
		txtFL2Cantidad40.setColumns(10);
		panel_51.add(txtFL2Cantidad40);

		txtFL2Cantidad41 = new JTextField();
		txtFL2Cantidad41.setColumns(10);
		panel_51.add(txtFL2Cantidad41);

		panel_52 = new JPanel();
		panel_52.setBounds(267, 17, 143, 113);
		panel_49.add(panel_52);
		panel_52.setLayout(new GridLayout(5, 0, 0, 0));

		txtFL2Obs0 = new JTextField();
		txtFL2Obs0.setColumns(10);
		panel_52.add(txtFL2Obs0);

		txtFL2Obs1 = new JTextField();
		txtFL2Obs1.setColumns(10);
		panel_52.add(txtFL2Obs1);

		txtFL2Obs2 = new JTextField();
		txtFL2Obs2.setColumns(10);
		panel_52.add(txtFL2Obs2);

		txtFL2Obs3 = new JTextField();
		txtFL2Obs3.setColumns(10);
		panel_52.add(txtFL2Obs3);

		txtFL2Obs4 = new JTextField();
		txtFL2Obs4.setColumns(10);
		panel_52.add(txtFL2Obs4);

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

		txtCACantidad00 = new JTextField();
		txtCACantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad00.setText("2");
		txtCACantidad00.setEditable(false);
		txtCACantidad00.setColumns(10);
		panel_59.add(txtCACantidad00);

		txtCACantidad01 = new JTextField();
		txtCACantidad01.setColumns(10);
		panel_59.add(txtCACantidad01);

		txtCACantidad10 = new JTextField();
		txtCACantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad10.setText("2");
		txtCACantidad10.setEditable(false);
		txtCACantidad10.setColumns(10);
		panel_59.add(txtCACantidad10);

		txtCACantidad11 = new JTextField();
		txtCACantidad11.setColumns(10);
		panel_59.add(txtCACantidad11);

		txtCACantidad20 = new JTextField();
		txtCACantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad20.setText("16");
		txtCACantidad20.setEditable(false);
		txtCACantidad20.setColumns(10);
		panel_59.add(txtCACantidad20);

		txtCACantidad21 = new JTextField();
		txtCACantidad21.setColumns(10);
		panel_59.add(txtCACantidad21);

		panel_60 = new JPanel();
		panel_60.setBounds(267, 17, 143, 83);
		panel_53.add(panel_60);
		panel_60.setLayout(new GridLayout(3, 0, 0, 0));

		txtCAObs0 = new JTextField();
		txtCAObs0.setColumns(10);
		panel_60.add(txtCAObs0);

		txtCAObs1 = new JTextField();
		txtCAObs1.setColumns(10);
		panel_60.add(txtCAObs1);

		txtCAObs2 = new JTextField();
		txtCAObs2.setColumns(10);
		panel_60.add(txtCAObs2);

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

		txtCACantidad30 = new JTextField();
		txtCACantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad30.setText("8");
		txtCACantidad30.setEditable(false);
		txtCACantidad30.setColumns(10);
		panel_63.add(txtCACantidad30);

		txtCACantidad31 = new JTextField();
		txtCACantidad31.setColumns(10);
		panel_63.add(txtCACantidad31);

		txtCACantidad40 = new JTextField();
		txtCACantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad40.setText("15");
		txtCACantidad40.setEditable(false);
		txtCACantidad40.setColumns(10);
		panel_63.add(txtCACantidad40);

		txtCACantidad41 = new JTextField();
		txtCACantidad41.setColumns(10);
		panel_63.add(txtCACantidad41);

		txtCACantidad50 = new JTextField();
		txtCACantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad50.setText("1");
		txtCACantidad50.setEditable(false);
		txtCACantidad50.setColumns(10);
		panel_63.add(txtCACantidad50);

		txtCACantidad51 = new JTextField();
		txtCACantidad51.setColumns(10);
		panel_63.add(txtCACantidad51);

		txtCACantidad60 = new JTextField();
		txtCACantidad60.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad60.setText("1");
		txtCACantidad60.setEditable(false);
		txtCACantidad60.setColumns(10);
		panel_63.add(txtCACantidad60);

		txtCACantidad61 = new JTextField();
		txtCACantidad61.setColumns(10);
		panel_63.add(txtCACantidad61);

		txtCACantidad70 = new JTextField();
		txtCACantidad70.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad70.setText("1");
		txtCACantidad70.setEditable(false);
		txtCACantidad70.setColumns(10);
		panel_63.add(txtCACantidad70);

		txtCACantidad71 = new JTextField();
		txtCACantidad71.setColumns(10);
		panel_63.add(txtCACantidad71);

		txtCACantidad80 = new JTextField();
		txtCACantidad80.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad80.setText("1");
		txtCACantidad80.setEditable(false);
		txtCACantidad80.setColumns(10);
		panel_63.add(txtCACantidad80);

		txtCACantidad81 = new JTextField();
		txtCACantidad81.setColumns(10);
		panel_63.add(txtCACantidad81);

		txtCACantidad90 = new JTextField();
		txtCACantidad90.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad90.setText("1");
		txtCACantidad90.setEditable(false);
		txtCACantidad90.setColumns(10);
		panel_63.add(txtCACantidad90);

		txtCACantidad91 = new JTextField();
		txtCACantidad91.setColumns(10);
		panel_63.add(txtCACantidad91);

		txtCACantidad100 = new JTextField();
		txtCACantidad100.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad100.setText("1");
		txtCACantidad100.setEditable(false);
		txtCACantidad100.setColumns(10);
		panel_63.add(txtCACantidad100);

		txtCACantidad101 = new JTextField();
		txtCACantidad101.setColumns(10);
		panel_63.add(txtCACantidad101);

		txtCACantidad110 = new JTextField();
		txtCACantidad110.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad110.setText("1");
		txtCACantidad110.setEditable(false);
		txtCACantidad110.setColumns(10);
		panel_63.add(txtCACantidad110);

		txtCACantidad111 = new JTextField();
		txtCACantidad111.setColumns(10);
		panel_63.add(txtCACantidad111);

		txtCACantidad120 = new JTextField();
		txtCACantidad120.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad120.setText("1");
		txtCACantidad120.setEditable(false);
		txtCACantidad120.setColumns(10);
		panel_63.add(txtCACantidad120);

		txtCACantidad121 = new JTextField();
		txtCACantidad121.setColumns(10);
		panel_63.add(txtCACantidad121);

		txtCACantidad130 = new JTextField();
		txtCACantidad130.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad130.setText("2");
		txtCACantidad130.setEditable(false);
		txtCACantidad130.setColumns(10);
		panel_63.add(txtCACantidad130);

		txtCACantidad131 = new JTextField();
		txtCACantidad131.setColumns(10);
		panel_63.add(txtCACantidad131);

		txtCACantidad140 = new JTextField();
		txtCACantidad140.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad140.setText("1");
		txtCACantidad140.setEditable(false);
		txtCACantidad140.setColumns(10);
		panel_63.add(txtCACantidad140);

		txtCACantidad141 = new JTextField();
		txtCACantidad141.setColumns(10);
		panel_63.add(txtCACantidad141);

		txtCACantidad150 = new JTextField();
		txtCACantidad150.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad150.setText("223");
		txtCACantidad150.setEditable(false);
		txtCACantidad150.setColumns(10);
		panel_63.add(txtCACantidad150);

		txtCACantidad151 = new JTextField();
		txtCACantidad151.setColumns(10);
		panel_63.add(txtCACantidad151);

		txtCACantidad160 = new JTextField();
		txtCACantidad160.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad160.setText("1");
		txtCACantidad160.setEditable(false);
		txtCACantidad160.setColumns(10);
		panel_63.add(txtCACantidad160);

		txtCACantidad161 = new JTextField();
		txtCACantidad161.setColumns(10);
		panel_63.add(txtCACantidad161);

		txtCACantidad170 = new JTextField();
		txtCACantidad170.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad170.setText("1");
		txtCACantidad170.setEditable(false);
		txtCACantidad170.setColumns(10);
		panel_63.add(txtCACantidad170);

		txtCACantidad171 = new JTextField();
		txtCACantidad171.setColumns(10);
		panel_63.add(txtCACantidad171);

		txtCACantidad180 = new JTextField();
		txtCACantidad180.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad180.setText("3");
		txtCACantidad180.setEditable(false);
		txtCACantidad180.setColumns(10);
		panel_63.add(txtCACantidad180);

		txtCACantidad181 = new JTextField();
		txtCACantidad181.setColumns(10);
		panel_63.add(txtCACantidad181);

		txtCACantidad190 = new JTextField();
		txtCACantidad190.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad190.setText("3");
		txtCACantidad190.setEditable(false);
		txtCACantidad190.setColumns(10);
		panel_63.add(txtCACantidad190);

		txtCACantidad191 = new JTextField();
		txtCACantidad191.setColumns(10);
		panel_63.add(txtCACantidad191);

		txtCACantidad200 = new JTextField();
		txtCACantidad200.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad200.setText("2");
		txtCACantidad200.setEditable(false);
		txtCACantidad200.setColumns(10);
		panel_63.add(txtCACantidad200);

		txtCACantidad201 = new JTextField();
		txtCACantidad201.setColumns(10);
		panel_63.add(txtCACantidad201);

		txtCACantidad210 = new JTextField();
		txtCACantidad210.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad210.setText("15");
		txtCACantidad210.setEditable(false);
		txtCACantidad210.setColumns(10);
		panel_63.add(txtCACantidad210);

		txtCACantidad211 = new JTextField();
		txtCACantidad211.setColumns(10);
		panel_63.add(txtCACantidad211);

		panel_64 = new JPanel();
		panel_64.setBounds(267, 17, 143, 523);
		panel_61.add(panel_64);
		panel_64.setLayout(new GridLayout(19, 0, 0, 0));

		txtCAObs3 = new JTextField();
		txtCAObs3.setColumns(10);
		panel_64.add(txtCAObs3);

		txtCAObs4 = new JTextField();
		txtCAObs4.setColumns(10);
		panel_64.add(txtCAObs4);

		txtCAObs5 = new JTextField();
		txtCAObs5.setColumns(10);
		panel_64.add(txtCAObs5);

		txtCAObs6 = new JTextField();
		txtCAObs6.setColumns(10);
		panel_64.add(txtCAObs6);

		txtCAObs7 = new JTextField();
		txtCAObs7.setColumns(10);
		panel_64.add(txtCAObs7);

		txtCAObs8 = new JTextField();
		txtCAObs8.setColumns(10);
		panel_64.add(txtCAObs8);

		txtCAObs9 = new JTextField();
		txtCAObs9.setColumns(10);
		panel_64.add(txtCAObs9);

		txtCAObs10 = new JTextField();
		txtCAObs10.setColumns(10);
		panel_64.add(txtCAObs10);

		txtCAObs11 = new JTextField();
		txtCAObs11.setColumns(10);
		panel_64.add(txtCAObs11);

		txtCAObs12 = new JTextField();
		txtCAObs12.setColumns(10);
		panel_64.add(txtCAObs12);

		txtCAObs13 = new JTextField();
		txtCAObs13.setColumns(10);
		panel_64.add(txtCAObs13);

		txtCAObs14 = new JTextField();
		txtCAObs14.setColumns(10);
		panel_64.add(txtCAObs14);

		txtCAObs15 = new JTextField();
		txtCAObs15.setColumns(10);
		panel_64.add(txtCAObs15);

		txtCAObs16 = new JTextField();
		txtCAObs16.setColumns(10);
		panel_64.add(txtCAObs16);

		txtCAObs17 = new JTextField();
		txtCAObs17.setColumns(10);
		panel_64.add(txtCAObs17);

		txtCAObs18 = new JTextField();
		txtCAObs18.setColumns(10);
		panel_64.add(txtCAObs18);

		txtCAObs19 = new JTextField();
		txtCAObs19.setColumns(10);
		panel_64.add(txtCAObs19);

		txtCAObs20 = new JTextField();
		txtCAObs20.setColumns(10);
		panel_64.add(txtCAObs20);

		txtCAObs21 = new JTextField();
		txtCAObs21.setColumns(10);
		panel_64.add(txtCAObs21);

		label_48 = new JLabel("Cantidad");
		label_48.setBounds(210, 1, 55, 14);
		panel_61.add(label_48);

		label_49 = new JLabel("Observaci\u00F3n/Referencia");
		label_49.setBounds(267, 1, 143, 14);
		panel_61.add(label_49);

		InformacionObligatoriaV informacionObligatoriaV = new InformacionObligatoriaV(858, 335);
		panel_44.add(informacionObligatoriaV.getPnlInformacionObl());

		pnlCabecera.getBtnRegistrar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				ServicioInfoObligatoria srvInfoOblig = new ComponenteInfoObligatoria();
				infor = cargarInfoObligatoria(informacionObligatoriaV);

				if (validarInfo(infor)) {
					srvInfoOblig.crear(infor);
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

	public LinkedList<LinkedList<TdetalleFicha>> cargarListas(InformacionObligatoriaV inforV) {
		LinkedList<TdetalleFicha> listaElectrico = new LinkedList<>();
		LinkedList<TdetalleFicha> listaAL = new LinkedList<>();
		LinkedList<TdetalleFicha> listaSanitario = new LinkedList<>();
		LinkedList<TdetalleFicha> listaAP = new LinkedList<>();
		LinkedList<TdetalleFicha> listaAR = new LinkedList<>();
		LinkedList<TdetalleFicha> listaArquitectonico = new LinkedList<>();
		LinkedList<TdetalleFicha> listaParedes = new LinkedList<>();
		LinkedList<TdetalleFicha> listaFrontal = new LinkedList<>();
		LinkedList<TdetalleFicha> listaPosterior = new LinkedList<>();
		LinkedList<TdetalleFicha> listaLateral = new LinkedList<>();
		LinkedList<TdetalleFicha> listaArquitectonico2 = new LinkedList<>();
		LinkedList<TdetalleFicha> listaEstructural = new LinkedList<>();
		ServicioFicha servFicha = new ComponenteFicha();
		// infor = cargarInfoObligatoria(inforV);

		TGrupo grupoTmp = servFicha.buscarGrupo("Kit eléctrico");
		Integer updateFicha = servFicha.buscarUpdateFicha();
		TFicha ficha = null;
		listaElectrico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtKECantidad01.getText()), txtKEObs0.getText(), updateFicha));
		listaElectrico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtKECantidad11.getText()), txtKEObs1.getText(), updateFicha));
		listaElectrico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtKECantidad21.getText()), txtKEObs2.getText(), updateFicha));
		listaElectrico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtKECantidad31.getText()), txtKEObs3.getText(), updateFicha));
		listaElectrico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtKECantidad41.getText()), txtKEObs4.getText(), updateFicha));
		listaElectrico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtKECantidad51.getText()), txtKEObs5.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Kit agua lluvia");
		listaAL.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtKACantidad01.getText()), txtKAObs0.getText(), updateFicha));
		listaAL.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtKACantidad11.getText()), txtKAObs1.getText(), updateFicha));
		listaAL.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtKACantidad21.getText()), txtKAObs2.getText(), updateFicha));
		listaAL.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtKACantidad31.getText()), txtKAObs3.getText(), updateFicha));
		listaAL.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtKACantidad41.getText()), txtKAObs4.getText(), updateFicha));
		listaAL.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtKACantidad51.getText()), txtKAObs5.getText(), updateFicha));
		listaAL.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtKACantidad51.getText()), txtKAObs5.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Kit hidrosanitario");
		listaSanitario.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtKHCantidad01.getText()), txtKHObs0.getText(), updateFicha));
		listaSanitario.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtKHCantidad11.getText()), txtKHObs1.getText(), updateFicha));
		listaSanitario.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtKHCantidad21.getText()), txtKHObs2.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Kit agua potable");
		listaAP.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtAPCantidad01.getText()), txtAPObs0.getText(), updateFicha));
		listaAP.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtAPCantidad11.getText()), txtAPObs1.getText(), updateFicha));
		listaAP.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtAPCantidad21.getText()), txtAPObs2.getText(), updateFicha));
		listaAP.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtAPCantidad31.getText()), txtAPObs3.getText(), updateFicha));
		listaAP.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtAPCantidad41.getText()), txtAPObs4.getText(), updateFicha));
		listaAP.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtAPCantidad51.getText()), txtAPObs5.getText(), updateFicha));
		listaAP.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtAPCantidad61.getText()), txtAPObs6.getText(), updateFicha));
		listaAP.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtAPCantidad71.getText()), txtAPObs7.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Kit agua residual");
		listaAR.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtASCantidad01.getText()), txtASObs0.getText(), updateFicha));
		listaAR.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtASCantidad11.getText()), txtASObs1.getText(), updateFicha));
		listaAR.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtASCantidad21.getText()), txtASObs2.getText(), updateFicha));
		listaAR.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtASCantidad31.getText()), txtASObs3.getText(), updateFicha));
		listaAR.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtASCantidad41.getText()), txtASObs4.getText(), updateFicha));
		listaAR.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtASCantidad51.getText()), txtASObs5.getText(), updateFicha));
		listaAR.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtASCantidad61.getText()), txtASObs6.getText(), updateFicha));
		listaAR.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtASCantidad71.getText()), txtASObs7.getText(), updateFicha));
		listaAR.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtASCantidad81.getText()), txtASObs8.getText(), updateFicha));
		listaAR.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtASCantidad91.getText()), txtASObs9.getText(), updateFicha));
		listaAR.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtASCantidad101.getText()), txtASObs10.getText(), updateFicha));
		listaAR.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtASCantidad111.getText()), txtASObs11.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Componente arquitectònico");
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtComCantidad01.getText()), txtComObs0.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtComCantidad11.getText()), txtComObs1.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtComCantidad21.getText()), txtComObs2.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtComCantidad31.getText()), txtComObs3.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtComCantidad41.getText()), txtComObs4.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Paredes internas");
		listaParedes.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtPICantidad01.getText()), txtPIObs0.getText(), updateFicha));
		listaParedes.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtPICantidad11.getText()), txtPIObs1.getText(), updateFicha));
		listaParedes.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtPICantidad21.getText()), txtPIObs2.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Fachada frontal");
		listaFrontal.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFFCantidad01.getText()), txtFFObs0.getText(), updateFicha));
		listaFrontal.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFFCantidad11.getText()), txtFFObs1.getText(), updateFicha));
		listaFrontal.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFFCantidad21.getText()), txtFFObs2.getText(), updateFicha));
		listaFrontal.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFFCantidad31.getText()), txtFFObs3.getText(), updateFicha));
		listaFrontal.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFFCantidad41.getText()), txtFFObs4.getText(), updateFicha));
		listaFrontal.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFFCantidad51.getText()), txtFFObs5.getText(), updateFicha));
		listaFrontal.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFFCantidad61.getText()), txtFFObs6.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Fachada posterior");
		listaPosterior.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFPCantidad01.getText()), txtFPObs0.getText(), updateFicha));
		listaPosterior.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFPCantidad11.getText()), txtFPObs1.getText(), updateFicha));
		listaPosterior.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFPCantidad21.getText()), txtFPObs2.getText(), updateFicha));
		listaPosterior.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFPCantidad31.getText()), txtFPObs3.getText(), updateFicha));
		listaPosterior.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFPCantidad41.getText()), txtFPObs4.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Componente arquitect�nico");
		listaArquitectonico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad01.getText()), txtCAObs0.getText(), updateFicha));
		listaArquitectonico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad11.getText()), txtCAObs1.getText(), updateFicha));
		listaArquitectonico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad21.getText()), txtCAObs2.getText(), updateFicha));
		listaArquitectonico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad31.getText()), txtCAObs3.getText(), updateFicha));
		listaArquitectonico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad41.getText()), txtCAObs4.getText(), updateFicha));
		listaArquitectonico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad51.getText()), txtCAObs5.getText(), updateFicha));
		listaArquitectonico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad61.getText()), txtCAObs6.getText(), updateFicha));
		listaArquitectonico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad71.getText()), txtCAObs7.getText(), updateFicha));
		listaArquitectonico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad81.getText()), txtCAObs8.getText(), updateFicha));
		listaArquitectonico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad91.getText()), txtCAObs9.getText(), updateFicha));
		listaArquitectonico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad101.getText()), txtCAObs10.getText(), updateFicha));
		listaArquitectonico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad111.getText()), txtCAObs11.getText(), updateFicha));
		listaArquitectonico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad121.getText()), txtCAObs12.getText(), updateFicha));
		listaArquitectonico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad131.getText()), txtCAObs13.getText(), updateFicha));
		listaArquitectonico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad141.getText()), txtCAObs14.getText(), updateFicha));
		listaArquitectonico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad151.getText()), txtCAObs15.getText(), updateFicha));
		listaArquitectonico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad161.getText()), txtCAObs16.getText(), updateFicha));
		listaArquitectonico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad171.getText()), txtCAObs17.getText(), updateFicha));
		listaArquitectonico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad181.getText()), txtCAObs18.getText(), updateFicha));
		listaArquitectonico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad191.getText()), txtCAObs19.getText(), updateFicha));
		listaArquitectonico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad201.getText()), txtCAObs20.getText(), updateFicha));
		listaArquitectonico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad211.getText()), txtCAObs21.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Componente estructural");
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad01.getText()), txtCEObs0.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad11.getText()), txtCEObs1.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad21.getText()), txtCEObs2.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad31.getText()), txtCEObs3.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad41.getText()), txtCEObs4.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad51.getText()), txtCEObs5.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad61.getText()), txtCEObs6.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad71.getText()), txtCEObs7.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad81.getText()), txtCEObs8.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad91.getText()), txtCEObs9.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad101.getText()), txtCEObs10.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad111.getText()), txtCEObs11.getText(), updateFicha));

		LinkedList<LinkedList<TdetalleFicha>> listaFormulario = new LinkedList<LinkedList<TdetalleFicha>>();
		listaFormulario.add(listaElectrico);
		listaFormulario.add(listaAL);
		listaFormulario.add(listaSanitario);
		listaFormulario.add(listaAP);
		listaFormulario.add(listaAR);
		listaFormulario.add(listaArquitectonico);
		listaFormulario.add(listaParedes);
		listaFormulario.add(listaFrontal);
		listaFormulario.add(listaPosterior);
		listaFormulario.add(listaLateral);
		listaFormulario.add(listaArquitectonico2);
		listaFormulario.add(listaEstructural);
		return listaFormulario;
	}

	public JTextField getTxtKACantidad31() {
		return txtKACantidad31;
	}

	public void setTxtKACantidad31(JTextField txtKACantidad31) {
		this.txtKACantidad31 = txtKACantidad31;
	}

	public JTextField getTxtKACantidad41() {
		return txtKACantidad41;
	}

	public void setTxtKACantidad41(JTextField txtKACantidad41) {
		this.txtKACantidad41 = txtKACantidad41;
	}

	public JTextField getTxtKACantidad51() {
		return txtKACantidad51;
	}

	public void setTxtKACantidad51(JTextField txtKACantidad51) {
		this.txtKACantidad51 = txtKACantidad51;
	}

	public JTextField getTxtKACantidad21() {
		return txtKACantidad21;
	}

	public void setTxtKACantidad21(JTextField txtKACantidad21) {
		this.txtKACantidad21 = txtKACantidad21;
	}

	public JTextField getTxtKECantidad01() {
		return txtKECantidad01;
	}

	public void setTxtKECantidad01(JTextField txtKECantidad01) {
		this.txtKECantidad01 = txtKECantidad01;
	}

	public JTextField getTxtKECantidad11() {
		return txtKECantidad11;
	}

	public void setTxtKECantidad11(JTextField txtKECantidad11) {
		this.txtKECantidad11 = txtKECantidad11;
	}

	public JTextField getTxtKECantidad21() {
		return txtKECantidad21;
	}

	public void setTxtKECantidad21(JTextField txtKECantidad21) {
		this.txtKECantidad21 = txtKECantidad21;
	}

	public JTextField getTxtKECantidad31() {
		return txtKECantidad31;
	}

	public void setTxtKECantidad31(JTextField txtKECantidad31) {
		this.txtKECantidad31 = txtKECantidad31;
	}

	public JTextField getTxtKECantidad41() {
		return txtKECantidad41;
	}

	public void setTxtKECantidad41(JTextField txtKECantidad41) {
		this.txtKECantidad41 = txtKECantidad41;
	}

	public JTextField getTxtKECantidad1() {
		return txtKEObs1;
	}

	public void setTxtKECantidad1(JTextField txtKECantidad1) {
		this.txtKEObs1 = txtKECantidad1;
	}

	public JTextField getTxtPICantidad01() {
		return txtPICantidad01;
	}

	public void setTxtPICantidad01(JTextField txtPICantidad01) {
		this.txtPICantidad01 = txtPICantidad01;
	}

	public JTextField getTxtPICantidad11() {
		return txtPICantidad11;
	}

	public void setTxtPICantidad11(JTextField txtPICantidad11) {
		this.txtPICantidad11 = txtPICantidad11;
	}

	public JTextField getTxtPICantidad21() {
		return txtPICantidad21;
	}

	public void setTxtPICantidad21(JTextField txtPICantidad21) {
		this.txtPICantidad21 = txtPICantidad21;
	}

	public JTextField getTxtFPCantidad01() {
		return txtFPCantidad01;
	}

	public void setTxtFPCantidad01(JTextField txtFPCantidad01) {
		this.txtFPCantidad01 = txtFPCantidad01;
	}

	public JTextField getTxtFPCantidad11() {
		return txtFPCantidad11;
	}

	public void setTxtFPCantidad11(JTextField txtFPCantidad11) {
		this.txtFPCantidad11 = txtFPCantidad11;
	}

	public JTextField getTxtFPCantidad21() {
		return txtFPCantidad21;
	}

	public void setTxtFPCantidad21(JTextField txtFPCantidad21) {
		this.txtFPCantidad21 = txtFPCantidad21;
	}

	public JTextField getTxtFPCantidad31() {
		return txtFPCantidad31;
	}

	public void setTxtFPCantidad31(JTextField txtFPCantidad31) {
		this.txtFPCantidad31 = txtFPCantidad31;
	}

	public JTextField getTxtFPCantidad41() {
		return txtFPCantidad41;
	}

	public void setTxtFPCantidad41(JTextField txtFPCantidad41) {
		this.txtFPCantidad41 = txtFPCantidad41;
	}

	public JTextField getTxtCECantidad01() {
		return txtCECantidad01;
	}

	public void setTxtCECantidad01(JTextField txtCECantidad01) {
		this.txtCECantidad01 = txtCECantidad01;
	}

	public JTextField getTxtCECantidad11() {
		return txtCECantidad11;
	}

	public void setTxtCECantidad11(JTextField txtCECantidad11) {
		this.txtCECantidad11 = txtCECantidad11;
	}

	public JTextField getTxtCECantidad21() {
		return txtCECantidad21;
	}

	public void setTxtCECantidad21(JTextField txtCECantidad21) {
		this.txtCECantidad21 = txtCECantidad21;
	}

	public JTextField getTxtCECantidad31() {
		return txtCECantidad31;
	}

	public void setTxtCECantidad31(JTextField txtCECantidad31) {
		this.txtCECantidad31 = txtCECantidad31;
	}

	public JTextField getTxtCECantidad41() {
		return txtCECantidad41;
	}

	public void setTxtCECantidad41(JTextField txtCECantidad41) {
		this.txtCECantidad41 = txtCECantidad41;
	}

	public JTextField getTxtCECantidad51() {
		return txtCECantidad51;
	}

	public void setTxtCECantidad51(JTextField txtCECantidad51) {
		this.txtCECantidad51 = txtCECantidad51;
	}

	public JTextField getTxtCECantidad61() {
		return txtCECantidad61;
	}

	public void setTxtCECantidad61(JTextField txtCECantidad61) {
		this.txtCECantidad61 = txtCECantidad61;
	}

	public JTextField getTxtCECantidad71() {
		return txtCECantidad71;
	}

	public void setTxtCECantidad71(JTextField txtCECantidad71) {
		this.txtCECantidad71 = txtCECantidad71;
	}

	public JTextField getTxtCECantidad81() {
		return txtCECantidad81;
	}

	public void setTxtCECantidad81(JTextField txtCECantidad81) {
		this.txtCECantidad81 = txtCECantidad81;
	}

	public JTextField getTxtCECantidad91() {
		return txtCECantidad91;
	}

	public void setTxtCECantidad91(JTextField txtCECantidad91) {
		this.txtCECantidad91 = txtCECantidad91;
	}

	public JTextField getTxtCECantidad101() {
		return txtCECantidad101;
	}

	public void setTxtCECantidad101(JTextField txtCECantidad101) {
		this.txtCECantidad101 = txtCECantidad101;
	}

	public JTextField getTxtCECantidad111() {
		return txtCECantidad111;
	}

	public void setTxtCECantidad111(JTextField txtCECantidad111) {
		this.txtCECantidad111 = txtCECantidad111;
	}

	public JTextField getTxtKECantidad51() {
		return txtKECantidad51;
	}

	public void setTxtKECantidad51(JTextField txtKECantidad51) {
		this.txtKECantidad51 = txtKECantidad51;
	}

	public JTextField getTxtKACantidad01() {
		return txtKACantidad01;
	}

	public void setTxtKACantidad01(JTextField txtKACantidad01) {
		this.txtKACantidad01 = txtKACantidad01;
	}

	public JTextField getTxtKACantidad11() {
		return txtKACantidad11;
	}

	public void setTxtKACantidad11(JTextField txtKACantidad11) {
		this.txtKACantidad11 = txtKACantidad11;
	}

	public JTextField getTxtKHCantidad01() {
		return txtKHCantidad01;
	}

	public void setTxtKHCantidad01(JTextField txtKHCantidad01) {
		this.txtKHCantidad01 = txtKHCantidad01;
	}

	public JTextField getTxtKHCantidad11() {
		return txtKHCantidad11;
	}

	public void setTxtKHCantidad11(JTextField txtKHCantidad11) {
		this.txtKHCantidad11 = txtKHCantidad11;
	}

	public JTextField getTxtKHCantidad21() {
		return txtKHCantidad21;
	}

	public void setTxtKHCantidad21(JTextField txtKHCantidad21) {
		this.txtKHCantidad21 = txtKHCantidad21;
	}

	public JTextField getTxtFLCantidad01() {
		return txtAPCantidad81;
	}

	public void setTxtFLCantidad01(JTextField txtFLCantidad01) {
		this.txtAPCantidad81 = txtFLCantidad01;
	}

	public JTextField getTxtAPCantidad01() {
		return txtAPCantidad01;
	}

	public void setTxtAPCantidad01(JTextField txtAPCantidad01) {
		this.txtAPCantidad01 = txtAPCantidad01;
	}

	public JTextField getTxtAPCantidad11() {
		return txtAPCantidad11;
	}

	public void setTxtAPCantidad11(JTextField txtAPCantidad11) {
		this.txtAPCantidad11 = txtAPCantidad11;
	}

	public JTextField getTxtAPCantidad21() {
		return txtAPCantidad21;
	}

	public void setTxtAPCantidad21(JTextField txtAPCantidad21) {
		this.txtAPCantidad21 = txtAPCantidad21;
	}

	public JTextField getTxtAPCantidad41() {
		return txtAPCantidad41;
	}

	public void setTxtAPCantidad41(JTextField txtAPCantidad41) {
		this.txtAPCantidad41 = txtAPCantidad41;
	}

	public JTextField getTxtAPCantidad51() {
		return txtAPCantidad51;
	}

	public void setTxtAPCantidad51(JTextField txtAPCantidad51) {
		this.txtAPCantidad51 = txtAPCantidad51;
	}

	public JTextField getTxtAPCantidad61() {
		return txtAPCantidad61;
	}

	public void setTxtAPCantidad61(JTextField txtAPCantidad61) {
		this.txtAPCantidad61 = txtAPCantidad61;
	}

	public JTextField getTxtAPCantidad71() {
		return txtAPCantidad71;
	}

	public void setTxtAPCantidad71(JTextField txtAPCantidad71) {
		this.txtAPCantidad71 = txtAPCantidad71;
	}

	public JTextField getTxtASCantidad01() {
		return txtASCantidad01;
	}

	public void setTxtASCantidad01(JTextField txtASCantidad01) {
		this.txtASCantidad01 = txtASCantidad01;
	}

	public JTextField getTxtASCantidad11() {
		return txtASCantidad11;
	}

	public void setTxtASCantidad11(JTextField txtASCantidad11) {
		this.txtASCantidad11 = txtASCantidad11;
	}

	public JTextField getTxtASCantidad21() {
		return txtASCantidad21;
	}

	public void setTxtASCantidad21(JTextField txtASCantidad21) {
		this.txtASCantidad21 = txtASCantidad21;
	}

	public JTextField getTxtASCantidad31() {
		return txtASCantidad31;
	}

	public void setTxtASCantidad31(JTextField txtASCantidad31) {
		this.txtASCantidad31 = txtASCantidad31;
	}

	public JTextField getTxtASCantidad41() {
		return txtASCantidad41;
	}

	public void setTxtASCantidad41(JTextField txtASCantidad41) {
		this.txtASCantidad41 = txtASCantidad41;
	}

	public JTextField getTxtASCantidad51() {
		return txtASCantidad51;
	}

	public void setTxtASCantidad51(JTextField txtASCantidad51) {
		this.txtASCantidad51 = txtASCantidad51;
	}

	public JTextField getTxtASCantidad61() {
		return txtASCantidad61;
	}

	public void setTxtASCantidad61(JTextField txtASCantidad61) {
		this.txtASCantidad61 = txtASCantidad61;
	}

	public JTextField getTxtASCantidad91() {
		return txtASCantidad91;
	}

	public void setTxtASCantidad91(JTextField txtASCantidad91) {
		this.txtASCantidad91 = txtASCantidad91;
	}

	public JTextField getTxtASCantidad71() {
		return txtASCantidad71;
	}

	public void setTxtASCantidad71(JTextField txtASCantidad71) {
		this.txtASCantidad71 = txtASCantidad71;
	}

	public JTextField getTxtASCantidad81() {
		return txtASCantidad81;
	}

	public void setTxtASCantidad81(JTextField txtASCantidad81) {
		this.txtASCantidad81 = txtASCantidad81;
	}

	public JTextField getTxtASCantidad101() {
		return txtASCantidad101;
	}

	public void setTxtASCantidad101(JTextField txtASCantidad101) {
		this.txtASCantidad101 = txtASCantidad101;
	}

	public JTextField getTxtASCantidad111() {
		return txtASCantidad111;
	}

	public void setTxtASCantidad111(JTextField txtASCantidad111) {
		this.txtASCantidad111 = txtASCantidad111;
	}

	public JTextField getTxtComCantidad21() {
		return txtComCantidad21;
	}

	public void setTxtComCantidad21(JTextField txtComCantidad21) {
		this.txtComCantidad21 = txtComCantidad21;
	}

	public JTextField getTxtComCantidad31() {
		return txtComCantidad31;
	}

	public void setTxtComCantidad31(JTextField txtComCantidad31) {
		this.txtComCantidad31 = txtComCantidad31;
	}

	public JTextField getTxtComCantidad41() {
		return txtComCantidad41;
	}

	public void setTxtComCantidad41(JTextField txtComCantidad41) {
		this.txtComCantidad41 = txtComCantidad41;
	}

	public JTextField getTxtComCantidad01() {
		return txtComCantidad01;
	}

	public void setTxtComCantidad01(JTextField txtComCantidad01) {
		this.txtComCantidad01 = txtComCantidad01;
	}

	public JTextField getTxtComCantidad11() {
		return txtComCantidad11;
	}

	public void setTxtComCantidad11(JTextField txtComCantidad11) {
		this.txtComCantidad11 = txtComCantidad11;
	}

	public JTextField getTxtFFCantidad01() {
		return txtFFCantidad01;
	}

	public void setTxtFFCantidad01(JTextField txtFFCantidad01) {
		this.txtFFCantidad01 = txtFFCantidad01;
	}

	public JTextField getTxtFFCantidad11() {
		return txtFFCantidad11;
	}

	public void setTxtFFCantidad11(JTextField txtFFCantidad11) {
		this.txtFFCantidad11 = txtFFCantidad11;
	}

	public JTextField getTxtFFCantidad21() {
		return txtFFCantidad21;
	}

	public void setTxtFFCantidad21(JTextField txtFFCantidad21) {
		this.txtFFCantidad21 = txtFFCantidad21;
	}

	public JTextField getTxtFFCantidad31() {
		return txtFFCantidad31;
	}

	public void setTxtFFCantidad31(JTextField txtFFCantidad31) {
		this.txtFFCantidad31 = txtFFCantidad31;
	}

	public JTextField getTxtFFCantidad41() {
		return txtFFCantidad41;
	}

	public void setTxtFFCantidad41(JTextField txtFFCantidad41) {
		this.txtFFCantidad41 = txtFFCantidad41;
	}

	public JTextField getTxtFFCantidad51() {
		return txtFFCantidad51;
	}

	public void setTxtFFCantidad51(JTextField txtFFCantidad51) {
		this.txtFFCantidad51 = txtFFCantidad51;
	}

	public JTextField getTxtFFCantidad61() {
		return txtFFCantidad61;
	}

	public void setTxtFFCantidad61(JTextField txtFFCantidad61) {
		this.txtFFCantidad61 = txtFFCantidad61;
	}

	public JTextField getTxtFL2Cantidad01() {
		return txtFL2Cantidad01;
	}

	public void setTxtFL2Cantidad01(JTextField txtFL2Cantidad01) {
		this.txtFL2Cantidad01 = txtFL2Cantidad01;
	}

	public JTextField getTxtFL2Cantidad11() {
		return txtFL2Cantidad11;
	}

	public void setTxtFL2Cantidad11(JTextField txtFL2Cantidad11) {
		this.txtFL2Cantidad11 = txtFL2Cantidad11;
	}

	public JTextField getTxtFL2Cantidad21() {
		return txtFL2Cantidad21;
	}

	public void setTxtFL2Cantidad21(JTextField txtFL2Cantidad21) {
		this.txtFL2Cantidad21 = txtFL2Cantidad21;
	}

	public JTextField getTxtFL2Cantidad31() {
		return txtFL2Cantidad31;
	}

	public void setTxtFL2Cantidad31(JTextField txtFL2Cantidad31) {
		this.txtFL2Cantidad31 = txtFL2Cantidad31;
	}

	public JTextField getTxtFL2Cantidad41() {
		return txtFL2Cantidad41;
	}

	public void setTxtFL2Cantidad41(JTextField txtFL2Cantidad41) {
		this.txtFL2Cantidad41 = txtFL2Cantidad41;
	}

	public JTextField getTxtCACantidad01() {
		return txtCACantidad01;
	}

	public void setTxtCACantidad01(JTextField txtCACantidad01) {
		this.txtCACantidad01 = txtCACantidad01;
	}

	public JTextField getTxtCACantidad11() {
		return txtCACantidad11;
	}

	public void setTxtCACantidad11(JTextField txtCACantidad11) {
		this.txtCACantidad11 = txtCACantidad11;
	}

	public JTextField getTxtCACantidad21() {
		return txtCACantidad21;
	}

	public void setTxtCACantidad21(JTextField txtCACantidad21) {
		this.txtCACantidad21 = txtCACantidad21;
	}

	public JTextField getTxtCACantidad31() {
		return txtCACantidad31;
	}

	public void setTxtCACantidad31(JTextField txtCACantidad31) {
		this.txtCACantidad31 = txtCACantidad31;
	}

	public JTextField getTxtCACantidad41() {
		return txtCACantidad41;
	}

	public void setTxtCACantidad41(JTextField txtCACantidad41) {
		this.txtCACantidad41 = txtCACantidad41;
	}

	public JTextField getTxtCACantidad51() {
		return txtCACantidad51;
	}

	public void setTxtCACantidad51(JTextField txtCACantidad51) {
		this.txtCACantidad51 = txtCACantidad51;
	}

	public JTextField getTxtCACantidad61() {
		return txtCACantidad61;
	}

	public void setTxtCACantidad61(JTextField txtCACantidad61) {
		this.txtCACantidad61 = txtCACantidad61;
	}

	public JTextField getTxtCACantidad71() {
		return txtCACantidad71;
	}

	public void setTxtCACantidad71(JTextField txtCACantidad71) {
		this.txtCACantidad71 = txtCACantidad71;
	}

	public JTextField getTxtCACantidad81() {
		return txtCACantidad81;
	}

	public void setTxtCACantidad81(JTextField txtCACantidad81) {
		this.txtCACantidad81 = txtCACantidad81;
	}

	public JTextField getTxtCACantidad91() {
		return txtCACantidad91;
	}

	public void setTxtCACantidad91(JTextField txtCACantidad91) {
		this.txtCACantidad91 = txtCACantidad91;
	}

	public JTextField getTxtCACantidad101() {
		return txtCACantidad101;
	}

	public void setTxtCACantidad101(JTextField txtCACantidad101) {
		this.txtCACantidad101 = txtCACantidad101;
	}

	public JTextField getTxtCACantidad111() {
		return txtCACantidad111;
	}

	public void setTxtCACantidad111(JTextField txtCACantidad111) {
		this.txtCACantidad111 = txtCACantidad111;
	}

	public JTextField getTxtCACantidad121() {
		return txtCACantidad121;
	}

	public void setTxtCACantidad121(JTextField txtCACantidad121) {
		this.txtCACantidad121 = txtCACantidad121;
	}

	public JTextField getTxtCACantidad131() {
		return txtCACantidad131;
	}

	public void setTxtCACantidad131(JTextField txtCACantidad131) {
		this.txtCACantidad131 = txtCACantidad131;
	}

	public JTextField getTxtCACantidad141() {
		return txtCACantidad141;
	}

	public void setTxtCACantidad141(JTextField txtCACantidad141) {
		this.txtCACantidad141 = txtCACantidad141;
	}

	public JTextField getTxtCACantidad151() {
		return txtCACantidad151;
	}

	public void setTxtCACantidad151(JTextField txtCACantidad151) {
		this.txtCACantidad151 = txtCACantidad151;
	}

	public JTextField getTxtCACantidad161() {
		return txtCACantidad161;
	}

	public void setTxtCACantidad161(JTextField txtCACantidad161) {
		this.txtCACantidad161 = txtCACantidad161;
	}

	public JTextField getTxtCACantidad171() {
		return txtCACantidad171;
	}

	public void setTxtCACantidad171(JTextField txtCACantidad171) {
		this.txtCACantidad171 = txtCACantidad171;
	}

	public JTextField getTxtCACantidad181() {
		return txtCACantidad181;
	}

	public void setTxtCACantidad181(JTextField txtCACantidad181) {
		this.txtCACantidad181 = txtCACantidad181;
	}

	public JTextField getTxtCACantidad191() {
		return txtCACantidad191;
	}

	public void setTxtCACantidad191(JTextField txtCACantidad191) {
		this.txtCACantidad191 = txtCACantidad191;
	}

	public JTextField getTxtCACantidad201() {
		return txtCACantidad201;
	}

	public void setTxtCACantidad201(JTextField txtCACantidad201) {
		this.txtCACantidad201 = txtCACantidad201;
	}

	public JTextField getTxtCACantidad211() {
		return txtCACantidad211;
	}

	public void setTxtCACantidad211(JTextField txtCACantidad211) {
		this.txtCACantidad211 = txtCACantidad211;
	}

	public JTextField getTxtAPCantidad31() {
		return txtAPCantidad31;
	}

	public void setTxtAPCantidad31(JTextField txtAPCantidad31) {
		this.txtAPCantidad31 = txtAPCantidad31;
	}

	public JTextField getTxtKAObs3() {
		return txtKAObs3;
	}

	public void setTxtKAObs3(JTextField txtKAObs3) {
		this.txtKAObs3 = txtKAObs3;
	}

	public JTextField getTxtKAObs4() {
		return txtKAObs4;
	}

	public void setTxtKAObs4(JTextField txtKAObs4) {
		this.txtKAObs4 = txtKAObs4;
	}

	public JTextField getTxtKAObs5() {
		return txtKAObs5;
	}

	public void setTxtKAObs5(JTextField txtKAObs5) {
		this.txtKAObs5 = txtKAObs5;
	}

	public JTextField getTxtKAObs2() {
		return txtKAObs2;
	}

	public void setTxtKAObs2(JTextField txtKAObs2) {
		this.txtKAObs2 = txtKAObs2;
	}

	public JTextField getTxtKEObs0() {
		return txtKEObs0;
	}

	public void setTxtKEObs0(JTextField txtKEObs0) {
		this.txtKEObs0 = txtKEObs0;
	}

	public JTextField getTxtKEObs1() {
		return txtKEObs1;
	}

	public void setTxtKEObs1(JTextField txtKEObs1) {
		this.txtKEObs1 = txtKEObs1;
	}

	public JTextField getTxtKEObs2() {
		return txtKEObs2;
	}

	public void setTxtKEObs2(JTextField txtKEObs2) {
		this.txtKEObs2 = txtKEObs2;
	}

	public JTextField getTxtKEObs3() {
		return txtKEObs3;
	}

	public void setTxtKEObs3(JTextField txtKEObs3) {
		this.txtKEObs3 = txtKEObs3;
	}

	public JTextField getTxtKEObs4() {
		return txtKEObs4;
	}

	public void setTxtKEObs4(JTextField txtKEObs4) {
		this.txtKEObs4 = txtKEObs4;
	}

	public JTextField getTxtPIObs0() {
		return txtPIObs0;
	}

	public void setTxtPIObs0(JTextField txtPIObs0) {
		this.txtPIObs0 = txtPIObs0;
	}

	public JTextField getTxtPIObs1() {
		return txtPIObs1;
	}

	public void setTxtPIObs1(JTextField txtPIObs1) {
		this.txtPIObs1 = txtPIObs1;
	}

	public JTextField getTxtPIObs2() {
		return txtPIObs2;
	}

	public void setTxtPIObs2(JTextField txtPIObs2) {
		this.txtPIObs2 = txtPIObs2;
	}

	public JTextField getTxtFPObs0() {
		return txtFPObs0;
	}

	public void setTxtFPObs0(JTextField txtFPObs0) {
		this.txtFPObs0 = txtFPObs0;
	}

	public JTextField getTxtFPObs1() {
		return txtFPObs1;
	}

	public void setTxtFPObs1(JTextField txtFPObs1) {
		this.txtFPObs1 = txtFPObs1;
	}

	public JTextField getTxtFPObs2() {
		return txtFPObs2;
	}

	public void setTxtFPObs2(JTextField txtFPObs2) {
		this.txtFPObs2 = txtFPObs2;
	}

	public JTextField getTxtFPObs3() {
		return txtFPObs3;
	}

	public void setTxtFPObs3(JTextField txtFPObs3) {
		this.txtFPObs3 = txtFPObs3;
	}

	public JTextField getTxtFPObs4() {
		return txtFPObs4;
	}

	public void setTxtFPObs4(JTextField txtFPObs4) {
		this.txtFPObs4 = txtFPObs4;
	}

	public JTextField getTxtCEObs0() {
		return txtCEObs0;
	}

	public void setTxtCEObs0(JTextField txtCEObs0) {
		this.txtCEObs0 = txtCEObs0;
	}

	public JTextField getTxtCEObs1() {
		return txtCEObs1;
	}

	public void setTxtCEObs1(JTextField txtCEObs1) {
		this.txtCEObs1 = txtCEObs1;
	}

	public JTextField getTxtCEObs2() {
		return txtCEObs2;
	}

	public void setTxtCEObs2(JTextField txtCEObs2) {
		this.txtCEObs2 = txtCEObs2;
	}

	public JTextField getTxtCEObs3() {
		return txtCEObs3;
	}

	public void setTxtCEObs3(JTextField txtCEObs3) {
		this.txtCEObs3 = txtCEObs3;
	}

	public JTextField getTxtCEObs4() {
		return txtCEObs4;
	}

	public void setTxtCEObs4(JTextField txtCEObs4) {
		this.txtCEObs4 = txtCEObs4;
	}

	public JTextField getTxtCEObs5() {
		return txtCEObs5;
	}

	public void setTxtCEObs5(JTextField txtCEObs5) {
		this.txtCEObs5 = txtCEObs5;
	}

	public JTextField getTxtCEObs6() {
		return txtCEObs6;
	}

	public void setTxtCEObs6(JTextField txtCEObs6) {
		this.txtCEObs6 = txtCEObs6;
	}

	public JTextField getTxtCEObs7() {
		return txtCEObs7;
	}

	public void setTxtCEObs7(JTextField txtCEObs7) {
		this.txtCEObs7 = txtCEObs7;
	}

	public JTextField getTxtCEObs8() {
		return txtCEObs8;
	}

	public void setTxtCEObs8(JTextField txtCEObs8) {
		this.txtCEObs8 = txtCEObs8;
	}

	public JTextField getTxtCEObs9() {
		return txtCEObs9;
	}

	public void setTxtCEObs9(JTextField txtCEObs9) {
		this.txtCEObs9 = txtCEObs9;
	}

	public JTextField getTxtCEObs10() {
		return txtCEObs10;
	}

	public void setTxtCEObs10(JTextField txtCEObs10) {
		this.txtCEObs10 = txtCEObs10;
	}

	public JTextField getTxtCEObs11() {
		return txtCEObs11;
	}

	public void setTxtCEObs11(JTextField txtCEObs11) {
		this.txtCEObs11 = txtCEObs11;
	}

	public JTextField getTxtKEObs5() {
		return txtKEObs5;
	}

	public void setTxtKEObs5(JTextField txtKEObs5) {
		this.txtKEObs5 = txtKEObs5;
	}

	public JTextField getTxtKAObs0() {
		return txtKAObs0;
	}

	public void setTxtKAObs0(JTextField txtKAObs0) {
		this.txtKAObs0 = txtKAObs0;
	}

	public JTextField getTxtKAObs1() {
		return txtKAObs1;
	}

	public void setTxtKAObs1(JTextField txtKAObs1) {
		this.txtKAObs1 = txtKAObs1;
	}

	public JTextField getTxtKHObs0() {
		return txtKHObs0;
	}

	public void setTxtKHObs0(JTextField txtKHObs0) {
		this.txtKHObs0 = txtKHObs0;
	}

	public JTextField getTxtKHObs1() {
		return txtKHObs1;
	}

	public void setTxtKHObs1(JTextField txtKHObs1) {
		this.txtKHObs1 = txtKHObs1;
	}

	public JTextField getTxtKHObs2() {
		return txtKHObs2;
	}

	public void setTxtKHObs2(JTextField txtKHObs2) {
		this.txtKHObs2 = txtKHObs2;
	}

	public JTextField getTxtFLObs0() {
		return txAPLObs8;
	}

	public void setTxtFLObs0(JTextField txtFLObs0) {
		this.txAPLObs8 = txtFLObs0;
	}

	public JTextField getTxtAPObs0() {
		return txtAPObs0;
	}

	public void setTxtAPObs0(JTextField txtAPObs0) {
		this.txtAPObs0 = txtAPObs0;
	}

	public JTextField getTxtAPObs1() {
		return txtAPObs1;
	}

	public void setTxtAPObs1(JTextField txtAPObs1) {
		this.txtAPObs1 = txtAPObs1;
	}

	public JTextField getTxtAPObs2() {
		return txtAPObs2;
	}

	public void setTxtAPObs2(JTextField txtAPObs2) {
		this.txtAPObs2 = txtAPObs2;
	}

	public JTextField getTxtAPObs3() {
		return txtAPObs3;
	}

	public void setTxtAPObs3(JTextField txtAPObs3) {
		this.txtAPObs3 = txtAPObs3;
	}

	public JTextField getTxtAPObs4() {
		return txtAPObs4;
	}

	public void setTxtAPObs4(JTextField txtAPObs4) {
		this.txtAPObs4 = txtAPObs4;
	}

	public JTextField getTxtAPObs5() {
		return txtAPObs5;
	}

	public void setTxtAPObs5(JTextField txtAPObs5) {
		this.txtAPObs5 = txtAPObs5;
	}

	public JTextField getTxtAPObs6() {
		return txtAPObs6;
	}

	public void setTxtAPObs6(JTextField txtAPObs6) {
		this.txtAPObs6 = txtAPObs6;
	}

	public JTextField getTxtAPObs7() {
		return txtAPObs7;
	}

	public void setTxtAPObs7(JTextField txtAPObs7) {
		this.txtAPObs7 = txtAPObs7;
	}

	public JTextField getTxtASObs0() {
		return txtASObs0;
	}

	public void setTxtASObs0(JTextField txtASObs0) {
		this.txtASObs0 = txtASObs0;
	}

	public JTextField getTxtASObs1() {
		return txtASObs1;
	}

	public void setTxtASObs1(JTextField txtASObs1) {
		this.txtASObs1 = txtASObs1;
	}

	public JTextField getTxtASObs2() {
		return txtASObs2;
	}

	public void setTxtASObs2(JTextField txtASObs2) {
		this.txtASObs2 = txtASObs2;
	}

	public JTextField getTxtASObs3() {
		return txtASObs3;
	}

	public void setTxtASObs3(JTextField txtASObs3) {
		this.txtASObs3 = txtASObs3;
	}

	public JTextField getTxtASObs4() {
		return txtASObs4;
	}

	public void setTxtASObs4(JTextField txtASObs4) {
		this.txtASObs4 = txtASObs4;
	}

	public JTextField getTxtASObs5() {
		return txtASObs5;
	}

	public void setTxtASObs5(JTextField txtASObs5) {
		this.txtASObs5 = txtASObs5;
	}

	public JTextField getTxtASObs6() {
		return txtASObs6;
	}

	public void setTxtASObs6(JTextField txtASObs6) {
		this.txtASObs6 = txtASObs6;
	}

	public JTextField getTxtASObs9() {
		return txtASObs9;
	}

	public void setTxtASObs9(JTextField txtASObs9) {
		this.txtASObs9 = txtASObs9;
	}

	public JTextField getTxtASObs7() {
		return txtASObs7;
	}

	public void setTxtASObs7(JTextField txtASObs7) {
		this.txtASObs7 = txtASObs7;
	}

	public JTextField getTxtASObs8() {
		return txtASObs8;
	}

	public void setTxtASObs8(JTextField txtASObs8) {
		this.txtASObs8 = txtASObs8;
	}

	public JTextField getTxtASObs10() {
		return txtASObs10;
	}

	public void setTxtASObs10(JTextField txtASObs10) {
		this.txtASObs10 = txtASObs10;
	}

	public JTextField getTxtASObs11() {
		return txtASObs11;
	}

	public void setTxtASObs11(JTextField txtASObs11) {
		this.txtASObs11 = txtASObs11;
	}

	public JTextField getTxtComObs2() {
		return txtComObs2;
	}

	public void setTxtComObs2(JTextField txtComObs2) {
		this.txtComObs2 = txtComObs2;
	}

	public JTextField getTxtComObs3() {
		return txtComObs3;
	}

	public void setTxtComObs3(JTextField txtComObs3) {
		this.txtComObs3 = txtComObs3;
	}

	public JTextField getTxtComObs4() {
		return txtComObs4;
	}

	public void setTxtComObs4(JTextField txtComObs4) {
		this.txtComObs4 = txtComObs4;
	}

	public JTextField getTxtComObs0() {
		return txtComObs0;
	}

	public void setTxtComObs0(JTextField txtComObs0) {
		this.txtComObs0 = txtComObs0;
	}

	public JTextField getTxtComObs1() {
		return txtComObs1;
	}

	public void setTxtComObs1(JTextField txtComObs1) {
		this.txtComObs1 = txtComObs1;
	}

	public JTextField getTxtFFObs0() {
		return txtFFObs0;
	}

	public void setTxtFFObs0(JTextField txtFFObs0) {
		this.txtFFObs0 = txtFFObs0;
	}

	public JTextField getTxtFFObs1() {
		return txtFFObs1;
	}

	public void setTxtFFObs1(JTextField txtFFObs1) {
		this.txtFFObs1 = txtFFObs1;
	}

	public JTextField getTxtFFObs2() {
		return txtFFObs2;
	}

	public void setTxtFFObs2(JTextField txtFFObs2) {
		this.txtFFObs2 = txtFFObs2;
	}

	public JTextField getTxtFFObs3() {
		return txtFFObs3;
	}

	public void setTxtFFObs3(JTextField txtFFObs3) {
		this.txtFFObs3 = txtFFObs3;
	}

	public JTextField getTxtFFObs4() {
		return txtFFObs4;
	}

	public void setTxtFFObs4(JTextField txtFFObs4) {
		this.txtFFObs4 = txtFFObs4;
	}

	public JTextField getTxtFFObs5() {
		return txtFFObs5;
	}

	public void setTxtFFObs5(JTextField txtFFObs5) {
		this.txtFFObs5 = txtFFObs5;
	}

	public JTextField getTxtFFObs6() {
		return txtFFObs6;
	}

	public void setTxtFFObs6(JTextField txtFFObs6) {
		this.txtFFObs6 = txtFFObs6;
	}

	public JTextField getTxtFL2Obs0() {
		return txtFL2Obs0;
	}

	public void setTxtFL2Obs0(JTextField txtFL2Obs0) {
		this.txtFL2Obs0 = txtFL2Obs0;
	}

	public JTextField getTxtFL2Obs1() {
		return txtFL2Obs1;
	}

	public void setTxtFL2Obs1(JTextField txtFL2Obs1) {
		this.txtFL2Obs1 = txtFL2Obs1;
	}

	public JTextField getTxtFL2Obs3() {
		return txtFL2Obs2;
	}

	public void setTxtFL2Obs3(JTextField txtFL2Obs3) {
		this.txtFL2Obs2 = txtFL2Obs3;
	}

	public JTextField getTxtFL2Obs4() {
		return txtFL2Obs3;
	}

	public void setTxtFL2Obs4(JTextField txtFL2Obs4) {
		this.txtFL2Obs3 = txtFL2Obs4;
	}

	public JTextField getTxtFL2Obs5() {
		return txtFL2Obs4;
	}

	public void setTxtFL2Obs5(JTextField txtFL2Obs5) {
		this.txtFL2Obs4 = txtFL2Obs5;
	}

	public JTextField getTxtCAObs0() {
		return txtCAObs0;
	}

	public void setTxtCAObs0(JTextField txtCAObs0) {
		this.txtCAObs0 = txtCAObs0;
	}

	public JTextField getTxtCAObs1() {
		return txtCAObs1;
	}

	public void setTxtCAObs1(JTextField txtCAObs1) {
		this.txtCAObs1 = txtCAObs1;
	}

	public JTextField getTxtCAObs2() {
		return txtCAObs2;
	}

	public void setTxtCAObs2(JTextField txtCAObs2) {
		this.txtCAObs2 = txtCAObs2;
	}

	public JTextField getTxtCAObs3() {
		return txtCAObs3;
	}

	public void setTxtCAObs3(JTextField txtCAObs3) {
		this.txtCAObs3 = txtCAObs3;
	}

	public JTextField getTxtCAObs4() {
		return txtCAObs4;
	}

	public void setTxtCAObs4(JTextField txtCAObs4) {
		this.txtCAObs4 = txtCAObs4;
	}

	public JTextField getTxtCAObs5() {
		return txtCAObs5;
	}

	public void setTxtCAObs5(JTextField txtCAObs5) {
		this.txtCAObs5 = txtCAObs5;
	}

	public JTextField getTxtCAObs6() {
		return txtCAObs6;
	}

	public void setTxtCAObs6(JTextField txtCAObs6) {
		this.txtCAObs6 = txtCAObs6;
	}

	public JTextField getTxtCAObs7() {
		return txtCAObs7;
	}

	public void setTxtCAObs7(JTextField txtCAObs7) {
		this.txtCAObs7 = txtCAObs7;
	}

	public JTextField getTxtCAObs8() {
		return txtCAObs8;
	}

	public void setTxtCAObs8(JTextField txtCAObs8) {
		this.txtCAObs8 = txtCAObs8;
	}

	public JTextField getTxtCAObs9() {
		return txtCAObs9;
	}

	public void setTxtCAObs9(JTextField txtCAObs9) {
		this.txtCAObs9 = txtCAObs9;
	}

	public JTextField getTxtCAObs10() {
		return txtCAObs10;
	}

	public void setTxtCAObs10(JTextField txtCAObs10) {
		this.txtCAObs10 = txtCAObs10;
	}

	public JTextField getTxtCAObs11() {
		return txtCAObs11;
	}

	public void setTxtCAObs11(JTextField txtCAObs11) {
		this.txtCAObs11 = txtCAObs11;
	}

	public JTextField getTxtCAObs12() {
		return txtCAObs12;
	}

	public void setTxtCAObs12(JTextField txtCAObs12) {
		this.txtCAObs12 = txtCAObs12;
	}

	public JTextField getTxtCAObs13() {
		return txtCAObs13;
	}

	public void setTxtCAObs13(JTextField txtCAObs13) {
		this.txtCAObs13 = txtCAObs13;
	}

	public JTextField getTxtCAObs14() {
		return txtCAObs14;
	}

	public void setTxtCAObs14(JTextField txtCAObs14) {
		this.txtCAObs14 = txtCAObs14;
	}

	public JTextField getTxtCAObs15() {
		return txtCAObs15;
	}

	public void setTxtCAObs15(JTextField txtCAObs15) {
		this.txtCAObs15 = txtCAObs15;
	}

	public JTextField getTxtCAObs16() {
		return txtCAObs16;
	}

	public void setTxtCAObs16(JTextField txtCAObs16) {
		this.txtCAObs16 = txtCAObs16;
	}

	public JTextField getTxtCAObs17() {
		return txtCAObs17;
	}

	public void setTxtCAObs17(JTextField txtCAObs17) {
		this.txtCAObs17 = txtCAObs17;
	}

	public JTextField getTxtCAObs18() {
		return txtCAObs18;
	}

	public void setTxtCAObs18(JTextField txtCAObs18) {
		this.txtCAObs18 = txtCAObs18;
	}

	public JTextField getTxtCAObs19() {
		return txtCAObs19;
	}

	public void setTxtCAObs19(JTextField txtCAObs19) {
		this.txtCAObs19 = txtCAObs19;
	}

	public JTextField getTxtCAObs20() {
		return txtCAObs20;
	}

	public void setTxtCAObs20(JTextField txtCAObs20) {
		this.txtCAObs20 = txtCAObs20;
	}

	public JTextField getTxtCAObs21() {
		return txtCAObs21;
	}

	public void setTxtCAObs21(JTextField txtCAObs21) {
		this.txtCAObs21 = txtCAObs21;
	}
}
