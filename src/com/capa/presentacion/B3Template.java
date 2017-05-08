package com.capa.presentacion;

import static com.capa.util.Constantes.*;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.capa.datos.TFicha;
import com.capa.negocios.ComponenteCabecera;
import com.capa.negocios.ComponenteFicha;
import com.capa.negocios.ComponenteInfoObligatoria;
import com.capa.negocios.ServicioCabecera;
import com.capa.negocios.ServicioFicha;
import com.capa.negocios.ServicioInfoObligatoria;
import com.capa.util.Utilitarios;

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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_19;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_47;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextField textField_79;
	private JTextField textField_80;
	private JTextField textField_81;
	private JTextField textField_82;
	private JTextField textField_83;
	private JTextField textField_84;
	private JTextField textField_85;
	private JTextField textField_86;
	private JTextField textField_87;
	private JTextField textField_88;
	private JTextField textField_89;
	private JTextField textField_90;
	private JTextField textField_91;
	private JTextField textField_92;
	private JTextField textField_93;
	private JTextField textField_94;
	private JTextField textField_95;
	private JTextField textField_96;
	private JTextField textField_97;
	private JTextField textField_98;
	private JTextField textField_99;
	private JTextField textField_100;
	private JTextField textField_101;
	private JTextField textField_102;
	private JTextField textField_103;
	private JTextField textField_104;
	private JTextField textField_105;
	private JTextField textField_106;
	private JTextField textField_107;
	private JTextField textField_108;
	private JTextField textField_109;
	private JTextField textField_110;
	private JTextField textField_111;
	private JTextField textField_112;
	private JTextField textField_113;
	private JTextField textField_114;
	private JTextField textField_115;
	private JTextField textField_116;
	private JTextField textField_117;
	private JTextField textField_118;
	private JTextField textField_119;
	private JTextField textField_120;
	private JTextField textField_121;
	private JTextField textField_122;
	private JTextField textField_123;
	private JTextField textField_124;
	private JTextField textField_125;
	private JTextField textField_126;
	private JTextField textField_127;
	private JTextField textField_128;
	private JTextField textField_141;
	private JTextField textField_142;
	private JTextField textField_143;
	private JTextField textField_144;
	private JTextField textField_145;
	private JTextField textField_146;
	private JTextField textField_147;
	private JTextField textField_148;
	private JTextField textField_149;
	private JTextField textField_150;
	private JTextField textField_151;
	private JTextField textField_152;
	private JTextField textField_153;
	private JTextField textField_154;
	private JTextField textField_155;
	private JTextField textField_156;
	private JTextField textField_157;
	private JTextField textField_158;
	private JTextField textField_159;
	private JTextField textField_160;
	private JTextField textField_161;
	private JTextField textField_162;
	private JTextField textField_163;
	private JTextField textField_164;
	private JTextField textField_165;
	private JTextField textField_166;
	private JTextField textField_167;
	private JTextField textField_168;
	private JTextField textField_169;
	private JTextField textField_170;
	private JTextField textField_171;
	private JTextField textField_172;
	private JTextField textField_173;
	private JTextField textField_174;
	private JTextField textField_175;
	private JTextField textField_176;
	private JTextField textField_129;
	private JTextField textField_130;
	private JTextField textField_131;
	private JTextField textField_132;
	private JTextField textField_133;
	private JTextField textField_134;
	private JTextField textField_135;
	private JTextField textField_136;
	private JTextField textField_137;
	private JTextField textField_138;
	private JTextField textField_139;
	private JTextField textField_140;
	private JTextField textField_177;
	private JTextField textField_178;
	private JTextField textField_179;
	private JTextField textField_180;
	private JTextField textField_181;
	private JTextField textField_182;
	private JTextField textField_183;
	private JTextField textField_184;
	private JTextField textField_189;
	private JTextField textField_190;
	private JTextField textField_191;
	private JTextField textField_192;
	private JTextField textField_193;
	private JTextField textField_194;
	private JTextField textField_195;
	private JTextField textField_196;
	private JTextField textField_197;
	private JTextField textField_198;

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

	}

	private void cargarInformacionObligatoria(JPinformacionObligatoria jpIObligatoria) {

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
		tabbedPane.addTab("1.-  + ficha.getFiDescripcion()", null, pnlPestaña1, null);

		cargarPanelPestaña1(pnlPestaña1);

		JPanel pnlPestaña2 = new JPanel();
		pnlPestaña2.setLayout(null);
		pnlPestaña2.add(jpIObligatoria.getPnlInformacionObl());
		tabbedPane.addTab("2.-  + ficha.getFiDescripcion()", null, pnlPestaña2, null);

		cargarPanelPestaña2(pnlPestaña2);

	}

	public void cargarPanelPestaña2(JPanel pnlPestaña2) {
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(10, 11, 410, 210);
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

		textField_90 = new JTextField();
		textField_90.setHorizontalAlignment(SwingConstants.CENTER);
		textField_90.setColumns(10);
		panel.add(textField_90);

		textField_91 = new JTextField();
		textField_91.setHorizontalAlignment(SwingConstants.CENTER);
		textField_91.setColumns(10);
		panel.add(textField_91);

		textField_92 = new JTextField();
		textField_92.setHorizontalAlignment(SwingConstants.CENTER);
		textField_92.setColumns(10);
		panel.add(textField_92);

		textField_93 = new JTextField();
		textField_93.setHorizontalAlignment(SwingConstants.CENTER);
		textField_93.setColumns(10);
		panel.add(textField_93);

		textField_94 = new JTextField();
		textField_94.setHorizontalAlignment(SwingConstants.CENTER);
		textField_94.setColumns(10);
		panel.add(textField_94);

		textField_95 = new JTextField();
		textField_95.setHorizontalAlignment(SwingConstants.CENTER);
		textField_95.setColumns(10);
		panel.add(textField_95);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(248, 24, 152, 75);
		panel_5.add(panel_1);
		panel_1.setLayout(new GridLayout(3, 0, 0, 0));

		textField_96 = new JTextField();
		textField_96.setColumns(10);
		panel_1.add(textField_96);

		textField_97 = new JTextField();
		textField_97.setColumns(10);
		panel_1.add(textField_97);

		textField_98 = new JTextField();
		textField_98.setColumns(10);
		panel_1.add(textField_98);

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

		textField_99 = new JTextField();
		textField_99.setHorizontalAlignment(SwingConstants.CENTER);
		textField_99.setColumns(10);
		panel_3.add(textField_99);

		textField_100 = new JTextField();
		textField_100.setHorizontalAlignment(SwingConstants.CENTER);
		textField_100.setColumns(10);
		panel_3.add(textField_100);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(248, 112, 152, 25);
		panel_5.add(panel_4);
		panel_4.setLayout(new GridLayout(1, 0, 0, 0));

		textField_101 = new JTextField();
		textField_101.setColumns(10);
		panel_4.add(textField_101);

		JPanel panel_13 = new JPanel();
		panel_13.setBounds(10, 152, 167, 50);
		panel_5.add(panel_13);
		panel_13.setLayout(new GridLayout(2, 0, 0, 0));

		JLabel lblLblbs_37 = new JLabel(
				"<html><body><p align=right>Ventanas UPVC con vidrio flotado de 3 mm de 0.45x2 mt (  lateral)</p></body></html>");
		lblLblbs_37.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_37.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_13.add(lblLblbs_37);

		JLabel lblLblbs_38 = new JLabel(LBL_BST3_40);
		lblLblbs_38.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_38.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_13.add(lblLblbs_38);

		JPanel panel_10 = new JPanel();
		panel_10.setBounds(188, 152, 50, 50);
		panel_5.add(panel_10);
		panel_10.setLayout(new GridLayout(2, 2, 0, 0));

		textField_102 = new JTextField();
		textField_102.setHorizontalAlignment(SwingConstants.CENTER);
		textField_102.setColumns(10);
		panel_10.add(textField_102);

		textField_103 = new JTextField();
		textField_103.setHorizontalAlignment(SwingConstants.CENTER);
		textField_103.setColumns(10);
		panel_10.add(textField_103);

		textField_104 = new JTextField();
		textField_104.setHorizontalAlignment(SwingConstants.CENTER);
		textField_104.setColumns(10);
		panel_10.add(textField_104);

		textField_105 = new JTextField();
		textField_105.setHorizontalAlignment(SwingConstants.CENTER);
		textField_105.setColumns(10);
		panel_10.add(textField_105);

		JPanel panel_11 = new JPanel();
		panel_11.setBounds(248, 152, 152, 50);
		panel_5.add(panel_11);
		panel_11.setLayout(new GridLayout(2, 0, 0, 0));

		textField_106 = new JTextField();
		textField_106.setColumns(10);
		panel_11.add(textField_106);

		textField_107 = new JTextField();
		textField_107.setColumns(10);
		panel_11.add(textField_107);

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6.setBounds(10, 226, 410, 105);
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

		JLabel lblLblbs_39 = new JLabel(LBL_BST3_41);
		lblLblbs_39.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_39.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_14.add(lblLblbs_39);

		JLabel lblLblbs_40 = new JLabel(LBL_BST3_42);
		lblLblbs_40.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_40.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_14.add(lblLblbs_40);

		JLabel lblLblbs_41 = new JLabel(LBL_BST3_43);
		lblLblbs_41.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_41.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_14.add(lblLblbs_41);

		JPanel panel_15 = new JPanel();
		panel_15.setBounds(188, 25, 50, 75);
		panel_6.add(panel_15);
		panel_15.setLayout(new GridLayout(3, 2, 0, 0));

		textField_108 = new JTextField();
		textField_108.setHorizontalAlignment(SwingConstants.CENTER);
		textField_108.setColumns(10);
		panel_15.add(textField_108);

		textField_109 = new JTextField();
		textField_109.setHorizontalAlignment(SwingConstants.CENTER);
		textField_109.setColumns(10);
		panel_15.add(textField_109);

		textField_110 = new JTextField();
		textField_110.setHorizontalAlignment(SwingConstants.CENTER);
		textField_110.setColumns(10);
		panel_15.add(textField_110);

		textField_111 = new JTextField();
		textField_111.setHorizontalAlignment(SwingConstants.CENTER);
		textField_111.setColumns(10);
		panel_15.add(textField_111);

		textField_112 = new JTextField();
		textField_112.setHorizontalAlignment(SwingConstants.CENTER);
		textField_112.setColumns(10);
		panel_15.add(textField_112);

		textField_113 = new JTextField();
		textField_113.setHorizontalAlignment(SwingConstants.CENTER);
		textField_113.setColumns(10);
		panel_15.add(textField_113);

		JPanel panel_16 = new JPanel();
		panel_16.setBounds(248, 25, 152, 75);
		panel_6.add(panel_16);
		panel_16.setLayout(new GridLayout(3, 0, 0, 0));

		textField_114 = new JTextField();
		textField_114.setColumns(10);
		panel_16.add(textField_114);

		textField_115 = new JTextField();
		textField_115.setColumns(10);
		panel_16.add(textField_115);

		textField_116 = new JTextField();
		textField_116.setColumns(10);
		panel_16.add(textField_116);

		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_7.setBounds(10, 335, 410, 169);
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

		JLabel lblLblbs_42 = new JLabel(LBL_BST3_44);
		lblLblbs_42.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_42.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_17.add(lblLblbs_42);

		JLabel lblLblbs_43 = new JLabel(LBL_BST3_45);
		lblLblbs_43.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_43.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_17.add(lblLblbs_43);

		JLabel lblLblbs_44 = new JLabel(LBL_BST3_46);
		lblLblbs_44.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_44.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_17.add(lblLblbs_44);

		JLabel lblLblbs_45 = new JLabel(LBL_BST3_47);
		lblLblbs_45.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_45.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_17.add(lblLblbs_45);

		JPanel panel_18 = new JPanel();
		panel_18.setBounds(188, 46, 50, 100);
		panel_7.add(panel_18);
		panel_18.setLayout(new GridLayout(4, 2, 0, 0));

		textField_117 = new JTextField();
		textField_117.setHorizontalAlignment(SwingConstants.CENTER);
		textField_117.setColumns(10);
		panel_18.add(textField_117);

		textField_118 = new JTextField();
		textField_118.setHorizontalAlignment(SwingConstants.CENTER);
		textField_118.setColumns(10);
		panel_18.add(textField_118);

		textField_119 = new JTextField();
		textField_119.setHorizontalAlignment(SwingConstants.CENTER);
		textField_119.setColumns(10);
		panel_18.add(textField_119);

		textField_120 = new JTextField();
		textField_120.setHorizontalAlignment(SwingConstants.CENTER);
		textField_120.setColumns(10);
		panel_18.add(textField_120);

		textField_123 = new JTextField();
		panel_18.add(textField_123);
		textField_123.setHorizontalAlignment(SwingConstants.CENTER);
		textField_123.setColumns(10);

		textField_124 = new JTextField();
		panel_18.add(textField_124);
		textField_124.setHorizontalAlignment(SwingConstants.CENTER);
		textField_124.setColumns(10);

		textField_125 = new JTextField();
		panel_18.add(textField_125);
		textField_125.setHorizontalAlignment(SwingConstants.CENTER);
		textField_125.setColumns(10);

		textField_126 = new JTextField();
		panel_18.add(textField_126);
		textField_126.setHorizontalAlignment(SwingConstants.CENTER);
		textField_126.setColumns(10);

		JPanel panel_19 = new JPanel();
		panel_19.setBounds(248, 46, 152, 100);
		panel_7.add(panel_19);
		panel_19.setLayout(new GridLayout(4, 0, 0, 0));

		textField_127 = new JTextField();
		textField_127.setColumns(10);
		panel_19.add(textField_127);

		textField_128 = new JTextField();
		textField_128.setColumns(10);
		panel_19.add(textField_128);

		textField_121 = new JTextField();
		textField_121.setColumns(10);
		panel_19.add(textField_121);

		textField_122 = new JTextField();
		textField_122.setColumns(10);
		panel_19.add(textField_122);

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
		panel_20.setLayout(new GridLayout(12, 0, 0, 0));

		JLabel lblLblbs_46 = new JLabel(LBL_BST3_48);
		lblLblbs_46.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_46.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_20.add(lblLblbs_46);

		JLabel lblLblbs_47 = new JLabel(LBL_BST3_49);
		lblLblbs_47.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_47.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_20.add(lblLblbs_47);

		JLabel lblLblbs_48 = new JLabel(LBL_BST3_50);
		lblLblbs_48.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_48.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_20.add(lblLblbs_48);

		JLabel lblLblbs_49 = new JLabel(LBL_BST3_51);
		lblLblbs_49.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_49.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_20.add(lblLblbs_49);

		JLabel lblLblbs_50 = new JLabel(LBL_BST3_52);
		lblLblbs_50.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_50.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_20.add(lblLblbs_50);

		JLabel lblLblbs_51 = new JLabel(LBL_BST3_53);
		lblLblbs_51.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_51.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_20.add(lblLblbs_51);

		JLabel lblLblbs_52 = new JLabel(LBL_BST3_54);
		lblLblbs_52.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_52.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_20.add(lblLblbs_52);

		JLabel lblLblbs_53 = new JLabel(LBL_BST3_55);
		lblLblbs_53.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_53.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_20.add(lblLblbs_53);

		JLabel lblLblbs_54 = new JLabel(LBL_BST3_56);
		lblLblbs_54.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_54.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_20.add(lblLblbs_54);

		JLabel lblLblbs_55 = new JLabel(LBL_BST3_57);
		lblLblbs_55.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_55.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_20.add(lblLblbs_55);

		JPanel panel_21 = new JPanel();
		panel_21.setBounds(188, 25, 50, 300);
		panel_8.add(panel_21);
		panel_21.setLayout(new GridLayout(12, 2, 0, 0));

		textField_129 = new JTextField();
		textField_129.setHorizontalAlignment(SwingConstants.CENTER);
		textField_129.setColumns(10);
		panel_21.add(textField_129);

		textField_130 = new JTextField();
		textField_130.setHorizontalAlignment(SwingConstants.CENTER);
		textField_130.setColumns(10);
		panel_21.add(textField_130);

		textField_131 = new JTextField();
		textField_131.setHorizontalAlignment(SwingConstants.CENTER);
		textField_131.setColumns(10);
		panel_21.add(textField_131);

		textField_132 = new JTextField();
		textField_132.setHorizontalAlignment(SwingConstants.CENTER);
		textField_132.setColumns(10);
		panel_21.add(textField_132);

		textField_133 = new JTextField();
		textField_133.setHorizontalAlignment(SwingConstants.CENTER);
		textField_133.setColumns(10);
		panel_21.add(textField_133);

		textField_134 = new JTextField();
		textField_134.setHorizontalAlignment(SwingConstants.CENTER);
		textField_134.setColumns(10);
		panel_21.add(textField_134);

		textField_135 = new JTextField();
		textField_135.setHorizontalAlignment(SwingConstants.CENTER);
		textField_135.setColumns(10);
		panel_21.add(textField_135);

		textField_136 = new JTextField();
		textField_136.setHorizontalAlignment(SwingConstants.CENTER);
		textField_136.setColumns(10);
		panel_21.add(textField_136);

		textField_137 = new JTextField();
		textField_137.setHorizontalAlignment(SwingConstants.CENTER);
		textField_137.setColumns(10);
		panel_21.add(textField_137);

		textField_138 = new JTextField();
		textField_138.setHorizontalAlignment(SwingConstants.CENTER);
		textField_138.setColumns(10);
		panel_21.add(textField_138);

		textField_139 = new JTextField();
		textField_139.setHorizontalAlignment(SwingConstants.CENTER);
		textField_139.setColumns(10);
		panel_21.add(textField_139);

		textField_140 = new JTextField();
		textField_140.setHorizontalAlignment(SwingConstants.CENTER);
		textField_140.setColumns(10);
		panel_21.add(textField_140);

		textField_177 = new JTextField();
		textField_177.setHorizontalAlignment(SwingConstants.CENTER);
		textField_177.setColumns(10);
		panel_21.add(textField_177);

		textField_178 = new JTextField();
		textField_178.setHorizontalAlignment(SwingConstants.CENTER);
		textField_178.setColumns(10);
		panel_21.add(textField_178);

		textField_179 = new JTextField();
		textField_179.setHorizontalAlignment(SwingConstants.CENTER);
		textField_179.setColumns(10);
		panel_21.add(textField_179);

		textField_180 = new JTextField();
		textField_180.setHorizontalAlignment(SwingConstants.CENTER);
		textField_180.setColumns(10);
		panel_21.add(textField_180);

		textField_181 = new JTextField();
		textField_181.setHorizontalAlignment(SwingConstants.CENTER);
		textField_181.setColumns(10);
		panel_21.add(textField_181);

		textField_182 = new JTextField();
		textField_182.setHorizontalAlignment(SwingConstants.CENTER);
		textField_182.setColumns(10);
		panel_21.add(textField_182);

		textField_183 = new JTextField();
		textField_183.setHorizontalAlignment(SwingConstants.CENTER);
		textField_183.setColumns(10);
		panel_21.add(textField_183);

		textField_184 = new JTextField();
		textField_184.setHorizontalAlignment(SwingConstants.CENTER);
		textField_184.setColumns(10);
		panel_21.add(textField_184);

		JPanel panel_22 = new JPanel();
		panel_22.setBounds(248, 25, 152, 300);
		panel_8.add(panel_22);
		panel_22.setLayout(new GridLayout(12, 0, 0, 0));

		textField_189 = new JTextField();
		textField_189.setColumns(10);
		panel_22.add(textField_189);

		textField_190 = new JTextField();
		textField_190.setColumns(10);
		panel_22.add(textField_190);

		textField_191 = new JTextField();
		textField_191.setColumns(10);
		panel_22.add(textField_191);

		textField_192 = new JTextField();
		textField_192.setColumns(10);
		panel_22.add(textField_192);

		textField_193 = new JTextField();
		textField_193.setColumns(10);
		panel_22.add(textField_193);

		textField_194 = new JTextField();
		textField_194.setColumns(10);
		panel_22.add(textField_194);

		textField_195 = new JTextField();
		textField_195.setColumns(10);
		panel_22.add(textField_195);

		textField_196 = new JTextField();
		textField_196.setColumns(10);
		panel_22.add(textField_196);

		textField_197 = new JTextField();
		textField_197.setColumns(10);
		panel_22.add(textField_197);

		textField_198 = new JTextField();
		textField_198.setColumns(10);
		panel_22.add(textField_198);

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

		JLabel lblLblbs_65 = new JLabel(LBL_BST3_67);
		lblLblbs_65.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_65.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_23.add(lblLblbs_65);

		JLabel lblLblbs_62 = new JLabel(LBL_BST3_64);
		panel_23.add(lblLblbs_62);
		lblLblbs_62.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_62.setFont(new Font("Arial", Font.PLAIN, 10));

		JLabel lblLblbs_63 = new JLabel(LBL_BST3_65);
		panel_23.add(lblLblbs_63);
		lblLblbs_63.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_63.setFont(new Font("Arial", Font.PLAIN, 10));

		JLabel lblLblbs_64 = new JLabel(LBL_BST3_66);
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

		textField_141 = new JTextField();
		textField_141.setHorizontalAlignment(SwingConstants.CENTER);
		textField_141.setColumns(10);
		panel_24.add(textField_141);

		textField_142 = new JTextField();
		textField_142.setHorizontalAlignment(SwingConstants.CENTER);
		textField_142.setColumns(10);
		panel_24.add(textField_142);

		textField_143 = new JTextField();
		textField_143.setHorizontalAlignment(SwingConstants.CENTER);
		textField_143.setColumns(10);
		panel_24.add(textField_143);

		textField_144 = new JTextField();
		textField_144.setHorizontalAlignment(SwingConstants.CENTER);
		textField_144.setColumns(10);
		panel_24.add(textField_144);

		textField_145 = new JTextField();
		textField_145.setHorizontalAlignment(SwingConstants.CENTER);
		textField_145.setColumns(10);
		panel_24.add(textField_145);

		textField_146 = new JTextField();
		textField_146.setHorizontalAlignment(SwingConstants.CENTER);
		textField_146.setColumns(10);
		panel_24.add(textField_146);

		textField_147 = new JTextField();
		textField_147.setHorizontalAlignment(SwingConstants.CENTER);
		textField_147.setColumns(10);
		panel_24.add(textField_147);

		textField_148 = new JTextField();
		textField_148.setHorizontalAlignment(SwingConstants.CENTER);
		textField_148.setColumns(10);
		panel_24.add(textField_148);

		textField_153 = new JTextField();
		textField_153.setHorizontalAlignment(SwingConstants.CENTER);
		textField_153.setColumns(10);
		panel_24.add(textField_153);

		textField_154 = new JTextField();
		textField_154.setHorizontalAlignment(SwingConstants.CENTER);
		textField_154.setColumns(10);
		panel_24.add(textField_154);

		textField_155 = new JTextField();
		textField_155.setHorizontalAlignment(SwingConstants.CENTER);
		textField_155.setColumns(10);
		panel_24.add(textField_155);

		textField_156 = new JTextField();
		textField_156.setHorizontalAlignment(SwingConstants.CENTER);
		textField_156.setColumns(10);
		panel_24.add(textField_156);

		textField_157 = new JTextField();
		textField_157.setHorizontalAlignment(SwingConstants.CENTER);
		textField_157.setColumns(10);
		panel_24.add(textField_157);

		textField_158 = new JTextField();
		textField_158.setHorizontalAlignment(SwingConstants.CENTER);
		textField_158.setColumns(10);
		panel_24.add(textField_158);

		textField_159 = new JTextField();
		textField_159.setHorizontalAlignment(SwingConstants.CENTER);
		textField_159.setColumns(10);
		panel_24.add(textField_159);

		textField_160 = new JTextField();
		textField_160.setHorizontalAlignment(SwingConstants.CENTER);
		textField_160.setColumns(10);
		panel_24.add(textField_160);

		textField_161 = new JTextField();
		textField_161.setHorizontalAlignment(SwingConstants.CENTER);
		textField_161.setColumns(10);
		panel_24.add(textField_161);

		textField_162 = new JTextField();
		textField_162.setHorizontalAlignment(SwingConstants.CENTER);
		textField_162.setColumns(10);
		panel_24.add(textField_162);

		textField_163 = new JTextField();
		textField_163.setHorizontalAlignment(SwingConstants.CENTER);
		textField_163.setColumns(10);
		panel_24.add(textField_163);

		textField_164 = new JTextField();
		textField_164.setHorizontalAlignment(SwingConstants.CENTER);
		textField_164.setColumns(10);
		panel_24.add(textField_164);

		textField_165 = new JTextField();
		textField_165.setHorizontalAlignment(SwingConstants.CENTER);
		textField_165.setColumns(10);
		panel_24.add(textField_165);

		textField_166 = new JTextField();
		textField_166.setHorizontalAlignment(SwingConstants.CENTER);
		textField_166.setColumns(10);
		panel_24.add(textField_166);

		textField_167 = new JTextField();
		textField_167.setHorizontalAlignment(SwingConstants.CENTER);
		textField_167.setColumns(10);
		panel_24.add(textField_167);

		textField_168 = new JTextField();
		textField_168.setHorizontalAlignment(SwingConstants.CENTER);
		textField_168.setColumns(10);
		panel_24.add(textField_168);

		JPanel panel_25 = new JPanel();
		panel_25.setBounds(248, 25, 152, 300);
		panel_9.add(panel_25);
		panel_25.setLayout(new GridLayout(12, 0, 0, 0));

		textField_149 = new JTextField();
		textField_149.setColumns(10);
		panel_25.add(textField_149);

		textField_150 = new JTextField();
		textField_150.setColumns(10);
		panel_25.add(textField_150);

		textField_151 = new JTextField();
		textField_151.setColumns(10);
		panel_25.add(textField_151);

		textField_152 = new JTextField();
		textField_152.setColumns(10);
		panel_25.add(textField_152);

		textField_169 = new JTextField();
		textField_169.setColumns(10);
		panel_25.add(textField_169);

		textField_170 = new JTextField();
		textField_170.setColumns(10);
		panel_25.add(textField_170);

		textField_171 = new JTextField();
		textField_171.setColumns(10);
		panel_25.add(textField_171);

		textField_172 = new JTextField();
		textField_172.setColumns(10);
		panel_25.add(textField_172);

		textField_173 = new JTextField();
		textField_173.setColumns(10);
		panel_25.add(textField_173);

		textField_174 = new JTextField();
		textField_174.setColumns(10);
		panel_25.add(textField_174);

		textField_175 = new JTextField();
		textField_175.setColumns(10);
		panel_25.add(textField_175);

		textField_176 = new JTextField();
		textField_176.setColumns(10);
		panel_25.add(textField_176);

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
		txtCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		pnlCantidad0.add(txtCantidad00);
		txtCantidad00.setColumns(10);

		txtCantidad01 = new JTextField();
		txtCantidad01.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad01.setColumns(10);
		pnlCantidad0.add(txtCantidad01);

		txtCantidad10 = new JTextField();
		txtCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		pnlCantidad0.add(txtCantidad10);
		txtCantidad10.setColumns(10);

		txtCantidad11 = new JTextField();
		txtCantidad11.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad11.setColumns(10);
		pnlCantidad0.add(txtCantidad11);

		txtCantidad20 = new JTextField();
		txtCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad20.setColumns(10);
		pnlCantidad0.add(txtCantidad20);

		txtCantidad21 = new JTextField();
		txtCantidad21.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad21.setColumns(10);
		pnlCantidad0.add(txtCantidad21);

		txtCantidad30 = new JTextField();
		txtCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad30.setColumns(10);
		pnlCantidad0.add(txtCantidad30);

		txtCantidad31 = new JTextField();
		txtCantidad31.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad31.setColumns(10);
		pnlCantidad0.add(txtCantidad31);

		txtCantidad40 = new JTextField();
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

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		panel_5.add(textField);

		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		panel_5.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		panel_5.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		panel_5.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		panel_5.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(10);
		panel_5.add(textField_5);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(248, 27, 152, 75);
		panel_1.add(panel_6);
		panel_6.setLayout(new GridLayout(3, 0, 0, 0));

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		panel_6.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		panel_6.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		panel_6.add(textField_8);

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

		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setColumns(10);
		panel_7.add(textField_9);

		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setColumns(10);
		panel_7.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setColumns(10);
		panel_7.add(textField_11);

		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setColumns(10);
		panel_7.add(textField_12);

		JPanel panel_8 = new JPanel();
		panel_8.setBounds(248, 28, 152, 50);
		panel_2.add(panel_8);
		panel_8.setLayout(new GridLayout(2, 0, 0, 0));

		textField_15 = new JTextField();
		textField_15.setColumns(10);
		panel_8.add(textField_15);

		textField_16 = new JTextField();
		textField_16.setColumns(10);
		panel_8.add(textField_16);

		JPanel panel_9 = new JPanel();
		panel_9.setBounds(188, 95, 50, 25);
		panel_2.add(panel_9);
		panel_9.setLayout(new GridLayout(1, 2, 0, 0));

		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setColumns(10);
		panel_9.add(textField_13);

		textField_14 = new JTextField();
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setColumns(10);
		panel_9.add(textField_14);

		JPanel panel_10 = new JPanel();
		panel_10.setBounds(248, 95, 152, 25);
		panel_2.add(panel_10);
		panel_10.setLayout(new GridLayout(1, 0, 0, 0));

		textField_19 = new JTextField();
		textField_19.setColumns(10);
		panel_10.add(textField_19);

		JPanel panel_11 = new JPanel();
		panel_11.setBounds(188, 133, 50, 50);
		panel_2.add(panel_11);
		panel_11.setLayout(new GridLayout(2, 2, 0, 0));

		textField_17 = new JTextField();
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setColumns(10);
		panel_11.add(textField_17);

		textField_18 = new JTextField();
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setColumns(10);
		panel_11.add(textField_18);

		textField_20 = new JTextField();
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setColumns(10);
		panel_11.add(textField_20);

		textField_21 = new JTextField();
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setColumns(10);
		panel_11.add(textField_21);

		JPanel panel_12 = new JPanel();
		panel_12.setBounds(248, 133, 152, 50);
		panel_2.add(panel_12);
		panel_12.setLayout(new GridLayout(2, 0, 0, 0));

		textField_22 = new JTextField();
		textField_22.setColumns(10);
		panel_12.add(textField_22);

		textField_23 = new JTextField();
		textField_23.setColumns(10);
		panel_12.add(textField_23);

		JPanel panel_13 = new JPanel();
		panel_13.setBounds(188, 202, 50, 25);
		panel_2.add(panel_13);
		panel_13.setLayout(new GridLayout(1, 2, 0, 0));

		textField_24 = new JTextField();
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setColumns(10);
		panel_13.add(textField_24);

		textField_25 = new JTextField();
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setColumns(10);
		panel_13.add(textField_25);

		JPanel panel_14 = new JPanel();
		panel_14.setBounds(248, 202, 152, 25);
		panel_2.add(panel_14);
		panel_14.setLayout(new GridLayout(1, 0, 0, 0));

		textField_26 = new JTextField();
		textField_26.setColumns(10);
		panel_14.add(textField_26);

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

		textField_27 = new JTextField();
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27.setColumns(10);
		panel_20.add(textField_27);

		textField_28 = new JTextField();
		textField_28.setHorizontalAlignment(SwingConstants.CENTER);
		textField_28.setColumns(10);
		panel_20.add(textField_28);

		JPanel panel_21 = new JPanel();
		panel_21.setBounds(247, 73, 152, 25);
		panel_3.add(panel_21);
		panel_21.setLayout(new GridLayout(1, 0, 0, 0));

		textField_29 = new JTextField();
		textField_29.setColumns(10);
		panel_21.add(textField_29);

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

		textField_30 = new JTextField();
		textField_30.setHorizontalAlignment(SwingConstants.CENTER);
		textField_30.setColumns(10);
		panel_23.add(textField_30);

		textField_31 = new JTextField();
		textField_31.setHorizontalAlignment(SwingConstants.CENTER);
		textField_31.setColumns(10);
		panel_23.add(textField_31);

		JPanel panel_24 = new JPanel();
		panel_24.setBounds(248, 163, 152, 25);
		panel_3.add(panel_24);
		panel_24.setLayout(new GridLayout(1, 0, 0, 0));

		textField_32 = new JTextField();
		textField_32.setColumns(10);
		panel_24.add(textField_32);

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

		textField_33 = new JTextField();
		textField_33.setHorizontalAlignment(SwingConstants.CENTER);
		textField_33.setColumns(10);
		panel_26.add(textField_33);

		textField_34 = new JTextField();
		textField_34.setHorizontalAlignment(SwingConstants.CENTER);
		textField_34.setColumns(10);
		panel_26.add(textField_34);

		textField_35 = new JTextField();
		textField_35.setHorizontalAlignment(SwingConstants.CENTER);
		textField_35.setColumns(10);
		panel_26.add(textField_35);

		textField_36 = new JTextField();
		textField_36.setHorizontalAlignment(SwingConstants.CENTER);
		textField_36.setColumns(10);
		panel_26.add(textField_36);

		JPanel panel_27 = new JPanel();
		panel_27.setBounds(248, 230, 152, 50);
		panel_3.add(panel_27);
		panel_27.setLayout(new GridLayout(2, 0, 0, 0));

		textField_37 = new JTextField();
		textField_37.setColumns(10);
		panel_27.add(textField_37);

		textField_38 = new JTextField();
		textField_38.setColumns(10);
		panel_27.add(textField_38);

		JPanel panel_28 = new JPanel();
		panel_28.setBounds(10, 230, 167, 50);
		panel_3.add(panel_28);
		panel_28.setLayout(new GridLayout(2, 0, 0, 0));

		JLabel lblLblbs_15 = new JLabel(LBL_BST3_16);
		lblLblbs_15.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_15.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_28.add(lblLblbs_15);

		JLabel lblLblbs_16 = new JLabel(LBL_BST3_17);
		lblLblbs_16.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_16.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_28.add(lblLblbs_16);

		JPanel panel_29 = new JPanel();
		panel_29.setBounds(188, 308, 50, 25);
		panel_3.add(panel_29);
		panel_29.setLayout(new GridLayout(1, 2, 0, 0));

		textField_39 = new JTextField();
		textField_39.setHorizontalAlignment(SwingConstants.CENTER);
		textField_39.setColumns(10);
		panel_29.add(textField_39);

		textField_40 = new JTextField();
		textField_40.setHorizontalAlignment(SwingConstants.CENTER);
		textField_40.setColumns(10);
		panel_29.add(textField_40);

		JPanel panel_30 = new JPanel();
		panel_30.setBounds(248, 308, 152, 25);
		panel_3.add(panel_30);
		panel_30.setLayout(new GridLayout(1, 0, 0, 0));

		textField_41 = new JTextField();
		textField_41.setColumns(10);
		panel_30.add(textField_41);

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

		textField_42 = new JTextField();
		textField_42.setHorizontalAlignment(SwingConstants.CENTER);
		textField_42.setColumns(10);
		panel_32.add(textField_42);

		textField_43 = new JTextField();
		textField_43.setHorizontalAlignment(SwingConstants.CENTER);
		textField_43.setColumns(10);
		panel_32.add(textField_43);

		JPanel panel_33 = new JPanel();
		panel_33.setBounds(248, 375, 152, 25);
		panel_3.add(panel_33);
		panel_33.setLayout(new GridLayout(1, 0, 0, 0));

		textField_47 = new JTextField();
		textField_47.setColumns(10);
		panel_33.add(textField_47);

		JPanel panel_34 = new JPanel();
		panel_34.setBounds(10, 375, 167, 25);
		panel_3.add(panel_34);
		panel_34.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblLblbs_18 = new JLabel(LBL_BST3_19);
		lblLblbs_18.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_18.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_34.add(lblLblbs_18);

		JPanel panel_37 = new JPanel();
		panel_37.setBounds(10, 463, 167, 50);
		panel_3.add(panel_37);
		panel_37.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblLblbs_20 = new JLabel(LBL_BST3_21);
		lblLblbs_20.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbs_20.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_37.add(lblLblbs_20);

		JPanel panel_40 = new JPanel();
		panel_40.setBounds(10, 405, 167, 50);
		panel_3.add(panel_40);
		panel_40.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblLblbst = new JLabel(LBL_BST3_20);
		lblLblbst.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblbst.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_40.add(lblLblbst);

		JPanel panel_35 = new JPanel();
		panel_35.setBounds(187, 473, 50, 25);
		panel_3.add(panel_35);
		panel_35.setLayout(new GridLayout(1, 2, 0, 0));

		textField_44 = new JTextField();
		textField_44.setHorizontalAlignment(SwingConstants.CENTER);
		textField_44.setColumns(10);
		panel_35.add(textField_44);

		textField_45 = new JTextField();
		textField_45.setHorizontalAlignment(SwingConstants.CENTER);
		textField_45.setColumns(10);
		panel_35.add(textField_45);

		JPanel panel_36 = new JPanel();
		panel_36.setBounds(247, 473, 152, 25);
		panel_3.add(panel_36);
		panel_36.setLayout(new GridLayout(1, 0, 0, 0));

		textField_46 = new JTextField();
		textField_46.setColumns(10);
		panel_36.add(textField_46);

		JPanel panel_38 = new JPanel();
		panel_38.setBounds(187, 418, 50, 25);
		panel_3.add(panel_38);
		panel_38.setLayout(new GridLayout(1, 2, 0, 0));

		textField_48 = new JTextField();
		textField_48.setHorizontalAlignment(SwingConstants.CENTER);
		textField_48.setColumns(10);
		panel_38.add(textField_48);

		textField_49 = new JTextField();
		textField_49.setHorizontalAlignment(SwingConstants.CENTER);
		textField_49.setColumns(10);
		panel_38.add(textField_49);

		JPanel panel_39 = new JPanel();
		panel_39.setBounds(247, 418, 152, 25);
		panel_3.add(panel_39);
		panel_39.setLayout(new GridLayout(1, 0, 0, 0));

		textField_50 = new JTextField();
		textField_50.setColumns(10);
		panel_39.add(textField_50);

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

		textField_51 = new JTextField();
		textField_51.setHorizontalAlignment(SwingConstants.CENTER);
		textField_51.setColumns(10);
		panel_42.add(textField_51);

		textField_52 = new JTextField();
		textField_52.setHorizontalAlignment(SwingConstants.CENTER);
		textField_52.setColumns(10);
		panel_42.add(textField_52);

		JPanel panel_43 = new JPanel();
		panel_43.setBounds(247, 45, 152, 25);
		panel_4.add(panel_43);
		panel_43.setLayout(new GridLayout(1, 0, 0, 0));

		textField_53 = new JTextField();
		textField_53.setColumns(10);
		panel_43.add(textField_53);

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

		textField_54 = new JTextField();
		textField_54.setHorizontalAlignment(SwingConstants.CENTER);
		textField_54.setColumns(10);
		panel_45.add(textField_54);

		textField_55 = new JTextField();
		textField_55.setHorizontalAlignment(SwingConstants.CENTER);
		textField_55.setColumns(10);
		panel_45.add(textField_55);

		JPanel panel_46 = new JPanel();
		panel_46.setBounds(247, 95, 152, 25);
		panel_4.add(panel_46);
		panel_46.setLayout(new GridLayout(1, 0, 0, 0));

		textField_56 = new JTextField();
		textField_56.setColumns(10);
		panel_46.add(textField_56);

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

		textField_57 = new JTextField();
		textField_57.setHorizontalAlignment(SwingConstants.CENTER);
		textField_57.setColumns(10);
		panel_48.add(textField_57);

		textField_58 = new JTextField();
		textField_58.setHorizontalAlignment(SwingConstants.CENTER);
		textField_58.setColumns(10);
		panel_48.add(textField_58);

		JPanel panel_49 = new JPanel();
		panel_49.setBounds(247, 195, 152, 25);
		panel_4.add(panel_49);
		panel_49.setLayout(new GridLayout(1, 0, 0, 0));

		textField_59 = new JTextField();
		textField_59.setColumns(10);
		panel_49.add(textField_59);

		JPanel panel_50 = new JPanel();
		panel_50.setBounds(188, 132, 50, 50);
		panel_4.add(panel_50);
		panel_50.setLayout(new GridLayout(2, 2, 0, 0));

		textField_60 = new JTextField();
		textField_60.setHorizontalAlignment(SwingConstants.CENTER);
		textField_60.setColumns(10);
		panel_50.add(textField_60);

		textField_61 = new JTextField();
		textField_61.setHorizontalAlignment(SwingConstants.CENTER);
		textField_61.setColumns(10);
		panel_50.add(textField_61);

		textField_62 = new JTextField();
		textField_62.setHorizontalAlignment(SwingConstants.CENTER);
		textField_62.setColumns(10);
		panel_50.add(textField_62);

		textField_63 = new JTextField();
		textField_63.setHorizontalAlignment(SwingConstants.CENTER);
		textField_63.setColumns(10);
		panel_50.add(textField_63);

		JPanel panel_51 = new JPanel();
		panel_51.setBounds(248, 132, 152, 50);
		panel_4.add(panel_51);
		panel_51.setLayout(new GridLayout(2, 0, 0, 0));

		textField_64 = new JTextField();
		textField_64.setColumns(10);
		panel_51.add(textField_64);

		textField_65 = new JTextField();
		textField_65.setColumns(10);
		panel_51.add(textField_65);

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

		textField_66 = new JTextField();
		textField_66.setHorizontalAlignment(SwingConstants.CENTER);
		textField_66.setColumns(10);
		panel_54.add(textField_66);

		textField_67 = new JTextField();
		textField_67.setHorizontalAlignment(SwingConstants.CENTER);
		textField_67.setColumns(10);
		panel_54.add(textField_67);

		JPanel panel_55 = new JPanel();
		panel_55.setBounds(246, 295, 152, 25);
		panel_4.add(panel_55);
		panel_55.setLayout(new GridLayout(1, 0, 0, 0));

		textField_68 = new JTextField();
		textField_68.setColumns(10);
		panel_55.add(textField_68);

		JPanel panel_56 = new JPanel();
		panel_56.setBounds(187, 232, 50, 50);
		panel_4.add(panel_56);
		panel_56.setLayout(new GridLayout(2, 2, 0, 0));

		textField_69 = new JTextField();
		textField_69.setHorizontalAlignment(SwingConstants.CENTER);
		textField_69.setColumns(10);
		panel_56.add(textField_69);

		textField_70 = new JTextField();
		textField_70.setHorizontalAlignment(SwingConstants.CENTER);
		textField_70.setColumns(10);
		panel_56.add(textField_70);

		textField_71 = new JTextField();
		textField_71.setHorizontalAlignment(SwingConstants.CENTER);
		textField_71.setColumns(10);
		panel_56.add(textField_71);

		textField_72 = new JTextField();
		textField_72.setHorizontalAlignment(SwingConstants.CENTER);
		textField_72.setColumns(10);
		panel_56.add(textField_72);

		JPanel panel_57 = new JPanel();
		panel_57.setBounds(247, 232, 152, 50);
		panel_4.add(panel_57);
		panel_57.setLayout(new GridLayout(2, 0, 0, 0));

		textField_73 = new JTextField();
		textField_73.setColumns(10);
		panel_57.add(textField_73);

		textField_74 = new JTextField();
		textField_74.setColumns(10);
		panel_57.add(textField_74);

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

		textField_75 = new JTextField();
		textField_75.setHorizontalAlignment(SwingConstants.CENTER);
		textField_75.setColumns(10);
		panel_60.add(textField_75);

		textField_76 = new JTextField();
		textField_76.setHorizontalAlignment(SwingConstants.CENTER);
		textField_76.setColumns(10);
		panel_60.add(textField_76);

		JPanel panel_61 = new JPanel();
		panel_61.setBounds(247, 395, 152, 25);
		panel_4.add(panel_61);
		panel_61.setLayout(new GridLayout(1, 0, 0, 0));

		textField_77 = new JTextField();
		textField_77.setColumns(10);
		panel_61.add(textField_77);

		JPanel panel_62 = new JPanel();
		panel_62.setBounds(188, 332, 50, 50);
		panel_4.add(panel_62);
		panel_62.setLayout(new GridLayout(2, 2, 0, 0));

		textField_78 = new JTextField();
		textField_78.setHorizontalAlignment(SwingConstants.CENTER);
		textField_78.setColumns(10);
		panel_62.add(textField_78);

		textField_79 = new JTextField();
		textField_79.setHorizontalAlignment(SwingConstants.CENTER);
		textField_79.setColumns(10);
		panel_62.add(textField_79);

		textField_80 = new JTextField();
		textField_80.setHorizontalAlignment(SwingConstants.CENTER);
		textField_80.setColumns(10);
		panel_62.add(textField_80);

		textField_81 = new JTextField();
		textField_81.setHorizontalAlignment(SwingConstants.CENTER);
		textField_81.setColumns(10);
		panel_62.add(textField_81);

		JPanel panel_63 = new JPanel();
		panel_63.setBounds(248, 332, 152, 50);
		panel_4.add(panel_63);
		panel_63.setLayout(new GridLayout(2, 0, 0, 0));

		textField_82 = new JTextField();
		textField_82.setColumns(10);
		panel_63.add(textField_82);

		textField_83 = new JTextField();
		textField_83.setColumns(10);
		panel_63.add(textField_83);

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

		textField_84 = new JTextField();
		textField_84.setHorizontalAlignment(SwingConstants.CENTER);
		textField_84.setColumns(10);
		panel_66.add(textField_84);

		textField_85 = new JTextField();
		textField_85.setHorizontalAlignment(SwingConstants.CENTER);
		textField_85.setColumns(10);
		panel_66.add(textField_85);

		JPanel panel_67 = new JPanel();
		panel_67.setBounds(247, 445, 152, 25);
		panel_4.add(panel_67);
		panel_67.setLayout(new GridLayout(1, 0, 0, 0));

		textField_86 = new JTextField();
		textField_86.setColumns(10);
		panel_67.add(textField_86);

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

		textField_87 = new JTextField();
		textField_87.setHorizontalAlignment(SwingConstants.CENTER);
		textField_87.setColumns(10);
		panel_69.add(textField_87);

		textField_88 = new JTextField();
		textField_88.setHorizontalAlignment(SwingConstants.CENTER);
		textField_88.setColumns(10);
		panel_69.add(textField_88);

		JPanel panel_70 = new JPanel();
		panel_70.setBounds(247, 500, 152, 25);
		panel_4.add(panel_70);
		panel_70.setLayout(new GridLayout(1, 0, 0, 0));

		textField_89 = new JTextField();
		textField_89.setColumns(10);
		panel_70.add(textField_89);

	}

	public void cargarCabecera() {

		jpCabecera = new JPcabecera();
		pnlPrincipal.add(jpCabecera.getCabecera());

	}
}
