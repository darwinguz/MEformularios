package com.capa.presentacion;

import static com.capa.util.Utilitarios.llenarCabecera;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class MbTemplate extends JFrame {

	private JPanel contentPane;
	private JTextField txtALCantidad20;
	private JTextField txtALCantidad21;
	private JTextField txtALCantidad30;
	private JTextField txtALCantidad31;
	private JTextField txtALCantidad40;
	private JTextField txtALCantidad41;
	private JTextField txtALCantidad00;
	private JTextField txtALCantidad01;
	private JTextField txtALCantidad10;
	private JTextField txtALCantidad11;
	private JTextField txtALObs2;
	private JTextField txtALObs3;
	private JTextField txtALObs4;
	private JTextField txtALObs0;
	private JTextField txtALObs1;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField txtKECantidad00;
	private JTextField txtKECantidad01;
	private JTextField txtKECantidad10;
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
	private JTextField txtCACantidad40;
	private JTextField txtCACantidad41;
	private JTextField txtCAObs0;
	private JTextField txtCAObs1;
	private JTextField txtCAObs2;
	private JTextField txtCAObs3;
	private JPanel panel_48;
	private JTextField txtCACantidad00;
	private JTextField txtCACantidad01;
	private JTextField txtCACantidad10;
	private JTextField txtCACantidad11;
	private JTextField txtCACantidad20;
	private JTextField txtCACantidad21;
	private JTextField txtCACantidad30;
	private JTextField txtCACantidad31;
	private JTextField txtCAObs4;
	private JPanel panel_15;
	private JPanel panel_16;
	private JLabel lblPanelesTcbxmts;
	private JLabel lblPanelesVinilPiso;
	private JLabel lblPanelesEpsPara;
	private JLabel lblComponenteArquitectnico_1;
	private JPanel panel_17;
	private JTextField txtCACantidad50;
	private JTextField txtCACantidad51;
	private JTextField txtCACantidad60;
	private JTextField txtCACantidad61;
	private JTextField txtCACantidad70;
	private JTextField txtCACantidad80;
	private JPanel panel_18;
	private JTextField txtCAObs5;
	private JTextField txtCAObs6;
	private JTextField txtCAObs8;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel lblPerfilSfTipo_2;
	private JTextField txtCACantidad71;
	private JTextField txtCACantidad81;
	private JTextField txtCAObs7;
	private JPanel panel_19;
	private JPanel panel_20;
	private JLabel lblPanelesEpsPared;
	private JLabel lblPanelesEpsPared_1;
	private JLabel lblPanelesEpsPared_2;
	private JLabel lblPanelesEpsPared_3;
	private JLabel lblComponenteArquitectnico_2;
	private JPanel panel_21;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JPanel panel_22;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
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
	private JPanel panel_30;
	private JTextField textField_81;
	private JTextField textField_82;
	private JTextField textField_83;
	private JTextField textField_99;
	private JTextField textField_100;
	private JTextField textField_101;
	private JTextField textField_102;
	private JTextField textField_103;
	private JTextField textField_104;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel lblPerfilSfTipo_11;
	private JLabel lblPerfilSfTipo_12;
	private JLabel lblPerfilSfTipo_13;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MbTemplate frame = new MbTemplate();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MbTemplate() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1320, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPcabecera pnlCabecera = new JPcabecera();
		contentPane.add(pnlCabecera.getCabecera());
		setContentPane(contentPane);
		contentPane.setLayout(null);

		llenarCabecera(pnlCabecera);

		this.setResizable(false);
		this.setLocationRelativeTo(null);

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

		txtALCantidad20 = new JTextField();
		txtALCantidad20.setEditable(false);
		txtALCantidad20.setColumns(10);
		panel_3.add(txtALCantidad20);

		txtALCantidad21 = new JTextField();
		txtALCantidad21.setColumns(10);
		panel_3.add(txtALCantidad21);

		txtALCantidad30 = new JTextField();
		txtALCantidad30.setEditable(false);
		txtALCantidad30.setColumns(10);
		panel_3.add(txtALCantidad30);

		txtALCantidad31 = new JTextField();
		txtALCantidad31.setColumns(10);
		panel_3.add(txtALCantidad31);

		txtALCantidad40 = new JTextField();
		txtALCantidad40.setEditable(false);
		txtALCantidad40.setColumns(10);
		panel_3.add(txtALCantidad40);

		txtALCantidad41 = new JTextField();
		txtALCantidad41.setColumns(10);
		panel_3.add(txtALCantidad41);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 11, 55, 62);
		panel_2.add(panel_4);
		panel_4.setLayout(new GridLayout(2, 2, 0, 12));

		txtALCantidad00 = new JTextField();
		txtALCantidad00.setEditable(false);
		txtALCantidad00.setColumns(10);
		panel_4.add(txtALCantidad00);

		txtALCantidad01 = new JTextField();
		txtALCantidad01.setColumns(10);
		panel_4.add(txtALCantidad01);

		txtALCantidad10 = new JTextField();
		txtALCantidad10.setEditable(false);
		txtALCantidad10.setColumns(10);
		panel_4.add(txtALCantidad10);

		txtALCantidad11 = new JTextField();
		txtALCantidad11.setColumns(10);
		panel_4.add(txtALCantidad11);

		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(267, 17, 143, 156);
		panel_1.add(panel_5);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 82, 143, 74);
		panel_5.add(panel_6);
		panel_6.setLayout(new GridLayout(3, 0, 0, 0));

		txtALObs2 = new JTextField();
		txtALObs2.setColumns(10);
		panel_6.add(txtALObs2);

		txtALObs3 = new JTextField();
		txtALObs3.setColumns(10);
		panel_6.add(txtALObs3);

		txtALObs4 = new JTextField();
		txtALObs4.setColumns(10);
		panel_6.add(txtALObs4);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(0, 11, 143, 62);
		panel_5.add(panel_7);
		panel_7.setLayout(new GridLayout(2, 0, 0, 12));

		txtALObs0 = new JTextField();
		txtALObs0.setColumns(10);
		panel_7.add(txtALObs0);

		txtALObs1 = new JTextField();
		txtALObs1.setColumns(10);
		panel_7.add(txtALObs1);

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

		txtKECantidad00 = new JTextField();
		txtKECantidad00.setEditable(false);
		txtKECantidad00.setColumns(10);
		panel_27.add(txtKECantidad00);

		txtKECantidad01 = new JTextField();
		txtKECantidad01.setColumns(10);
		panel_27.add(txtKECantidad01);

		txtKECantidad10 = new JTextField();
		txtKECantidad10.setEditable(false);
		txtKECantidad10.setColumns(10);
		panel_27.add(txtKECantidad10);

		txtKECantidad11 = new JTextField();
		txtKECantidad11.setColumns(10);
		panel_27.add(txtKECantidad11);

		txtKECantidad20 = new JTextField();
		txtKECantidad20.setEditable(false);
		txtKECantidad20.setColumns(10);
		panel_27.add(txtKECantidad20);

		txtKECantidad21 = new JTextField();
		txtKECantidad21.setColumns(10);
		panel_27.add(txtKECantidad21);

		txtKECantidad30 = new JTextField();
		txtKECantidad30.setEditable(false);
		txtKECantidad30.setColumns(10);
		panel_27.add(txtKECantidad30);

		txtKECantidad31 = new JTextField();
		txtKECantidad31.setColumns(10);
		panel_27.add(txtKECantidad31);

		txtKECantidad40 = new JTextField();
		txtKECantidad40.setEditable(false);
		txtKECantidad40.setColumns(10);
		panel_27.add(txtKECantidad40);

		txtKECantidad41 = new JTextField();
		txtKECantidad41.setColumns(10);
		panel_27.add(txtKECantidad41);

		JPanel panel_28 = new JPanel();
		panel_28.setBounds(267, 17, 143, 113);
		panel_25.add(panel_28);
		panel_28.setLayout(new GridLayout(5, 0, 0, 0));

		txtKEObs0 = new JTextField();
		txtKEObs0.setColumns(10);
		panel_28.add(txtKEObs0);

		txtKEObs1 = new JTextField();
		txtKEObs1.setColumns(10);
		panel_28.add(txtKEObs1);

		txtKEObs2 = new JTextField();
		txtKEObs2.setColumns(10);
		panel_28.add(txtKEObs2);

		txtKEObs3 = new JTextField();
		txtKEObs3.setColumns(10);
		panel_28.add(txtKEObs3);

		txtKEObs4 = new JTextField();
		txtKEObs4.setColumns(10);
		panel_28.add(txtKEObs4);

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

		txtCACantidad40 = new JTextField();
		txtCACantidad40.setEditable(false);
		txtCACantidad40.setColumns(10);
		panel_49.add(txtCACantidad40);

		txtCACantidad41 = new JTextField();
		txtCACantidad41.setColumns(10);
		panel_49.add(txtCACantidad41);

		panel_48 = new JPanel();
		panel_48.setBounds(0, 0, 55, 81);
		panel_47.add(panel_48);
		panel_48.setLayout(new GridLayout(3, 2, 0, 1));

		txtCACantidad00 = new JTextField();
		txtCACantidad00.setEditable(false);
		txtCACantidad00.setColumns(10);
		panel_48.add(txtCACantidad00);

		txtCACantidad01 = new JTextField();
		txtCACantidad01.setColumns(10);
		panel_48.add(txtCACantidad01);

		txtCACantidad10 = new JTextField();
		txtCACantidad10.setEditable(false);
		txtCACantidad10.setColumns(10);
		panel_48.add(txtCACantidad10);

		txtCACantidad11 = new JTextField();
		txtCACantidad11.setColumns(10);
		panel_48.add(txtCACantidad11);

		txtCACantidad20 = new JTextField();
		txtCACantidad20.setEditable(false);
		txtCACantidad20.setColumns(10);
		panel_48.add(txtCACantidad20);

		txtCACantidad21 = new JTextField();
		txtCACantidad21.setColumns(10);
		panel_48.add(txtCACantidad21);

		JPanel panel_54 = new JPanel();
		panel_54.setBounds(0, 92, 55, 27);
		panel_47.add(panel_54);
		panel_54.setLayout(new GridLayout(1, 2, 0, 0));

		txtCACantidad30 = new JTextField();
		txtCACantidad30.setEditable(false);
		txtCACantidad30.setColumns(10);
		panel_54.add(txtCACantidad30);

		txtCACantidad31 = new JTextField();
		txtCACantidad31.setColumns(10);
		panel_54.add(txtCACantidad31);

		JPanel panel_50 = new JPanel();
		panel_50.setLayout(null);
		panel_50.setBounds(267, 17, 143, 159);
		panel_46.add(panel_50);

		JPanel panel_51 = new JPanel();
		panel_51.setBounds(0, 0, 143, 79);
		panel_50.add(panel_51);
		panel_51.setLayout(new GridLayout(3, 0, 0, 1));

		txtCAObs0 = new JTextField();
		txtCAObs0.setColumns(10);
		panel_51.add(txtCAObs0);

		txtCAObs1 = new JTextField();
		txtCAObs1.setColumns(10);
		panel_51.add(txtCAObs1);

		txtCAObs2 = new JTextField();
		txtCAObs2.setColumns(10);
		panel_51.add(txtCAObs2);

		txtCAObs3 = new JTextField();
		txtCAObs3.setColumns(10);
		txtCAObs3.setBounds(0, 92, 143, 27);
		panel_50.add(txtCAObs3);

		txtCAObs4 = new JTextField();
		txtCAObs4.setColumns(10);
		txtCAObs4.setBounds(0, 132, 143, 27);
		panel_50.add(txtCAObs4);

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

		textField_42 = new JTextField();
		textField_42.setEditable(false);
		textField_42.setColumns(10);
		panel_13.add(textField_42);

		textField_43 = new JTextField();
		textField_43.setColumns(10);
		panel_13.add(textField_43);

		textField_44 = new JTextField();
		textField_44.setEditable(false);
		textField_44.setColumns(10);
		panel_13.add(textField_44);

		textField_45 = new JTextField();
		textField_45.setColumns(10);
		panel_13.add(textField_45);

		textField_46 = new JTextField();
		textField_46.setEditable(false);
		textField_46.setColumns(10);
		panel_13.add(textField_46);

		textField_47 = new JTextField();
		textField_47.setColumns(10);
		panel_13.add(textField_47);

		JPanel panel_14 = new JPanel();
		panel_14.setBounds(267, 17, 143, 67);
		panel_11.add(panel_14);
		panel_14.setLayout(new GridLayout(3, 0, 0, 0));

		textField_48 = new JTextField();
		textField_48.setColumns(10);
		panel_14.add(textField_48);

		textField_49 = new JTextField();
		textField_49.setColumns(10);
		panel_14.add(textField_49);

		textField_50 = new JTextField();
		textField_50.setColumns(10);
		panel_14.add(textField_50);

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

		txtCACantidad50 = new JTextField();
		txtCACantidad50.setEditable(false);
		txtCACantidad50.setColumns(10);
		panel_17.add(txtCACantidad50);

		txtCACantidad51 = new JTextField();
		txtCACantidad51.setColumns(10);
		panel_17.add(txtCACantidad51);

		txtCACantidad60 = new JTextField();
		txtCACantidad60.setEditable(false);
		txtCACantidad60.setColumns(10);
		panel_17.add(txtCACantidad60);

		txtCACantidad61 = new JTextField();
		txtCACantidad61.setColumns(10);
		panel_17.add(txtCACantidad61);

		txtCACantidad70 = new JTextField();
		txtCACantidad70.setEditable(false);
		txtCACantidad70.setColumns(10);
		panel_17.add(txtCACantidad70);

		txtCACantidad71 = new JTextField();
		txtCACantidad71.setColumns(10);
		panel_17.add(txtCACantidad71);

		txtCACantidad80 = new JTextField();
		txtCACantidad80.setEditable(false);
		txtCACantidad80.setColumns(10);
		panel_17.add(txtCACantidad80);

		txtCACantidad81 = new JTextField();
		txtCACantidad81.setColumns(10);
		panel_17.add(txtCACantidad81);

		panel_18 = new JPanel();
		panel_18.setBounds(267, 17, 143, 95);
		panel_15.add(panel_18);
		panel_18.setLayout(new GridLayout(4, 0, 0, 0));

		txtCAObs5 = new JTextField();
		txtCAObs5.setColumns(10);
		panel_18.add(txtCAObs5);

		txtCAObs6 = new JTextField();
		txtCAObs6.setColumns(10);
		panel_18.add(txtCAObs6);

		txtCAObs7 = new JTextField();
		txtCAObs7.setColumns(10);
		panel_18.add(txtCAObs7);

		txtCAObs8 = new JTextField();
		txtCAObs8.setColumns(10);
		panel_18.add(txtCAObs8);

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

		textField_51 = new JTextField();
		textField_51.setEditable(false);
		textField_51.setColumns(10);
		panel_21.add(textField_51);

		textField_52 = new JTextField();
		textField_52.setColumns(10);
		panel_21.add(textField_52);

		textField_53 = new JTextField();
		textField_53.setEditable(false);
		textField_53.setColumns(10);
		panel_21.add(textField_53);

		textField_54 = new JTextField();
		textField_54.setColumns(10);
		panel_21.add(textField_54);

		textField_55 = new JTextField();
		textField_55.setEditable(false);
		textField_55.setColumns(10);
		panel_21.add(textField_55);

		textField_56 = new JTextField();
		textField_56.setColumns(10);
		panel_21.add(textField_56);

		textField_57 = new JTextField();
		textField_57.setEditable(false);
		textField_57.setColumns(10);
		panel_21.add(textField_57);

		textField_58 = new JTextField();
		textField_58.setColumns(10);
		panel_21.add(textField_58);

		panel_22 = new JPanel();
		panel_22.setBounds(267, 17, 143, 95);
		panel_19.add(panel_22);
		panel_22.setLayout(new GridLayout(4, 0, 0, 0));

		textField_59 = new JTextField();
		textField_59.setColumns(10);
		panel_22.add(textField_59);

		textField_60 = new JTextField();
		textField_60.setColumns(10);
		panel_22.add(textField_60);

		textField_61 = new JTextField();
		textField_61.setColumns(10);
		panel_22.add(textField_61);

		textField_62 = new JTextField();
		textField_62.setColumns(10);
		panel_22.add(textField_62);

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

		textField_63 = new JTextField();
		textField_63.setEditable(false);
		textField_63.setColumns(10);
		panel_29.add(textField_63);

		textField_64 = new JTextField();
		textField_64.setColumns(10);
		panel_29.add(textField_64);

		textField_65 = new JTextField();
		textField_65.setEditable(false);
		textField_65.setColumns(10);
		panel_29.add(textField_65);

		textField_66 = new JTextField();
		textField_66.setColumns(10);
		panel_29.add(textField_66);

		textField_67 = new JTextField();
		textField_67.setEditable(false);
		textField_67.setColumns(10);
		panel_29.add(textField_67);

		textField_68 = new JTextField();
		textField_68.setColumns(10);
		panel_29.add(textField_68);

		textField_69 = new JTextField();
		textField_69.setEditable(false);
		textField_69.setColumns(10);
		panel_29.add(textField_69);

		textField_70 = new JTextField();
		textField_70.setColumns(10);
		panel_29.add(textField_70);

		textField_71 = new JTextField();
		textField_71.setEditable(false);
		textField_71.setColumns(10);
		panel_29.add(textField_71);

		textField_72 = new JTextField();
		textField_72.setColumns(10);
		panel_29.add(textField_72);

		textField_73 = new JTextField();
		textField_73.setEditable(false);
		textField_73.setColumns(10);
		panel_29.add(textField_73);

		textField_74 = new JTextField();
		textField_74.setColumns(10);
		panel_29.add(textField_74);

		textField_75 = new JTextField();
		textField_75.setEditable(false);
		textField_75.setColumns(10);
		panel_29.add(textField_75);

		textField_76 = new JTextField();
		textField_76.setColumns(10);
		panel_29.add(textField_76);

		textField_77 = new JTextField();
		textField_77.setEditable(false);
		textField_77.setColumns(10);
		panel_29.add(textField_77);

		textField_78 = new JTextField();
		textField_78.setColumns(10);
		panel_29.add(textField_78);

		textField_79 = new JTextField();
		textField_79.setEditable(false);
		textField_79.setColumns(10);
		panel_29.add(textField_79);

		textField_80 = new JTextField();
		textField_80.setColumns(10);
		panel_29.add(textField_80);

		textField_105 = new JTextField();
		textField_105.setEditable(false);
		textField_105.setColumns(10);
		panel_29.add(textField_105);

		textField_106 = new JTextField();
		textField_106.setColumns(10);
		panel_29.add(textField_106);

		textField_107 = new JTextField();
		textField_107.setEditable(false);
		textField_107.setColumns(10);
		panel_29.add(textField_107);

		textField_108 = new JTextField();
		textField_108.setColumns(10);
		panel_29.add(textField_108);

		textField_109 = new JTextField();
		textField_109.setEditable(false);
		textField_109.setColumns(10);
		panel_29.add(textField_109);

		textField_110 = new JTextField();
		textField_110.setColumns(10);
		panel_29.add(textField_110);

		panel_30 = new JPanel();
		panel_30.setBounds(267, 17, 143, 250);
		panel_23.add(panel_30);
		panel_30.setLayout(new GridLayout(12, 0, 0, 0));

		textField_81 = new JTextField();
		textField_81.setColumns(10);
		panel_30.add(textField_81);

		textField_82 = new JTextField();
		textField_82.setColumns(10);
		panel_30.add(textField_82);

		textField_83 = new JTextField();
		textField_83.setColumns(10);
		panel_30.add(textField_83);

		textField_99 = new JTextField();
		textField_99.setColumns(10);
		panel_30.add(textField_99);

		textField_100 = new JTextField();
		textField_100.setColumns(10);
		panel_30.add(textField_100);

		textField_101 = new JTextField();
		textField_101.setColumns(10);
		panel_30.add(textField_101);

		textField_102 = new JTextField();
		textField_102.setColumns(10);
		panel_30.add(textField_102);

		textField_103 = new JTextField();
		textField_103.setColumns(10);
		panel_30.add(textField_103);

		textField_104 = new JTextField();
		textField_104.setColumns(10);
		panel_30.add(textField_104);

		textField_112 = new JTextField();
		textField_112.setColumns(10);
		panel_30.add(textField_112);

		textField_111 = new JTextField();
		textField_111.setColumns(10);
		panel_30.add(textField_111);

		textField_113 = new JTextField();
		textField_113.setColumns(10);
		panel_30.add(textField_113);

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

		textField_114 = new JTextField();
		textField_114.setEditable(false);
		textField_114.setColumns(10);
		panel_33.add(textField_114);

		textField_115 = new JTextField();
		textField_115.setColumns(10);
		panel_33.add(textField_115);

		JPanel panel_34 = new JPanel();
		panel_34.setBounds(267, 17, 143, 25);
		panel_31.add(panel_34);
		panel_34.setLayout(new GridLayout(1, 0, 0, 0));

		textField_116 = new JTextField();
		textField_116.setColumns(10);
		panel_34.add(textField_116);

		JLabel label_8 = new JLabel("Cantidad");
		label_8.setBounds(210, 1, 55, 14);
		panel_31.add(label_8);

		JLabel label_9 = new JLabel("Observaci\u00F3n/Referencia");
		label_9.setBounds(267, 1, 143, 14);
		panel_31.add(label_9);

		InformacionObligatoriaV pnlInformacionOblig = new InformacionObligatoriaV(865, 325);

		panel.add(pnlInformacionOblig.getPnlInformacionObl());
	}
}
