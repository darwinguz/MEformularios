package com.capa.presentacion;

import static com.capa.negocios.Calculos.calcularPorcentajeAvance;
import static com.capa.util.Utilitarios.cargarInfoObligatoria;
import static com.capa.util.Utilitarios.gettCabecera;
import static com.capa.util.Utilitarios.llenarCabecera;
import static com.capa.util.Validaciones.validarInfo;

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
import com.capa.negocios.ServicioFicha;
import com.capa.negocios.ServicioInfoObligatoria;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.math.BigDecimal;
import java.util.LinkedList;

import javax.swing.JTextField;

public class MbTemplate extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4766220032119752524L;
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
	private JTextField txtFPCantidad00;
	private JTextField txtFPCantidad01;
	private JTextField txtFPCantida10;
	private JTextField txtFPCantidad11;
	private JTextField txtFPCantidad20;
	private JTextField txtFPCantidad21;
	private JTextField txtFPObs0;
	private JTextField txtFPObs1;
	private JTextField txtFPObs2;
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
	private JTextField txtFFCantidad00;
	private JTextField txtFFCantidad01;
	private JTextField txtFFCantidad10;
	private JTextField txtFFCantidad11;
	private JTextField txtFFCantidad20;
	private JTextField txtFFCantidad21;
	private JTextField txtFFCantidad30;
	private JTextField txtFFCantidad31;
	private JPanel panel_22;
	private JTextField txtFFObs0;
	private JTextField txtFFObs1;
	private JTextField txtFFObs2;
	private JTextField txtFFObs3;
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
	private JPanel panel_30;
	private JTextField txtCEObs0;
	private JTextField txtCEObs1;
	private JTextField txtCEObs2;
	private JTextField txtCEObs3;
	private JTextField txtCEObs4;
	private JTextField txtCEObs5;
	private JTextField txtCEObs6;
	private JTextField txtCEObs7;
	private JTextField txtCEObs8;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel lblPerfilSfTipo_11;
	private JLabel lblPerfilSfTipo_12;
	private JLabel lblPerfilSfTipo_13;
	private JTextField txtCECantidad90;
	private JTextField txtCECantidad91;
	private JTextField txtCECantidad100;
	private JTextField txtCECantidad101;
	private JTextField txtCECantidad110;
	private JTextField txtCECantidad111;
	private JTextField txtCEObs10;
	private JTextField txtCEObs9;
	private JTextField txtCEObs11;
	private JTextField txtFLCantidad00;
	private JTextField txtFLCantidad01;
	private JTextField txtFLObs0;

	TInformacionObligatoria infor;
	TFicha ficha;
	ServicioFicha servFicha;

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

		JPcabecera pnlCabecera = new JPcabecera();
		contentPane.add(pnlCabecera.getCabecera());
		setContentPane(contentPane);
		contentPane.setLayout(null);

		llenarCabecera(pnlCabecera);

		this.setResizable(false);
		this.setLocationRelativeTo(null);
		setTitle(ficha.getFiNombre());

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

		txtFPCantidad00 = new JTextField();
		txtFPCantidad00.setEditable(false);
		txtFPCantidad00.setColumns(10);
		panel_13.add(txtFPCantidad00);

		txtFPCantidad01 = new JTextField();
		txtFPCantidad01.setColumns(10);
		panel_13.add(txtFPCantidad01);

		txtFPCantida10 = new JTextField();
		txtFPCantida10.setEditable(false);
		txtFPCantida10.setColumns(10);
		panel_13.add(txtFPCantida10);

		txtFPCantidad11 = new JTextField();
		txtFPCantidad11.setColumns(10);
		panel_13.add(txtFPCantidad11);

		txtFPCantidad20 = new JTextField();
		txtFPCantidad20.setEditable(false);
		txtFPCantidad20.setColumns(10);
		panel_13.add(txtFPCantidad20);

		txtFPCantidad21 = new JTextField();
		txtFPCantidad21.setColumns(10);
		panel_13.add(txtFPCantidad21);

		JPanel panel_14 = new JPanel();
		panel_14.setBounds(267, 17, 143, 67);
		panel_11.add(panel_14);
		panel_14.setLayout(new GridLayout(3, 0, 0, 0));

		txtFPObs0 = new JTextField();
		txtFPObs0.setColumns(10);
		panel_14.add(txtFPObs0);

		txtFPObs1 = new JTextField();
		txtFPObs1.setColumns(10);
		panel_14.add(txtFPObs1);

		txtFPObs2 = new JTextField();
		txtFPObs2.setColumns(10);
		panel_14.add(txtFPObs2);

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

		txtFFCantidad00 = new JTextField();
		txtFFCantidad00.setEditable(false);
		txtFFCantidad00.setColumns(10);
		panel_21.add(txtFFCantidad00);

		txtFFCantidad01 = new JTextField();
		txtFFCantidad01.setColumns(10);
		panel_21.add(txtFFCantidad01);

		txtFFCantidad10 = new JTextField();
		txtFFCantidad10.setEditable(false);
		txtFFCantidad10.setColumns(10);
		panel_21.add(txtFFCantidad10);

		txtFFCantidad11 = new JTextField();
		txtFFCantidad11.setColumns(10);
		panel_21.add(txtFFCantidad11);

		txtFFCantidad20 = new JTextField();
		txtFFCantidad20.setEditable(false);
		txtFFCantidad20.setColumns(10);
		panel_21.add(txtFFCantidad20);

		txtFFCantidad21 = new JTextField();
		txtFFCantidad21.setColumns(10);
		panel_21.add(txtFFCantidad21);

		txtFFCantidad30 = new JTextField();
		txtFFCantidad30.setEditable(false);
		txtFFCantidad30.setColumns(10);
		panel_21.add(txtFFCantidad30);

		txtFFCantidad31 = new JTextField();
		txtFFCantidad31.setColumns(10);
		panel_21.add(txtFFCantidad31);

		panel_22 = new JPanel();
		panel_22.setBounds(267, 17, 143, 95);
		panel_19.add(panel_22);
		panel_22.setLayout(new GridLayout(4, 0, 0, 0));

		txtFFObs0 = new JTextField();
		txtFFObs0.setColumns(10);
		panel_22.add(txtFFObs0);

		txtFFObs1 = new JTextField();
		txtFFObs1.setColumns(10);
		panel_22.add(txtFFObs1);

		txtFFObs2 = new JTextField();
		txtFFObs2.setColumns(10);
		panel_22.add(txtFFObs2);

		txtFFObs3 = new JTextField();
		txtFFObs3.setColumns(10);
		panel_22.add(txtFFObs3);

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

		txtCECantidad00 = new JTextField();
		txtCECantidad00.setEditable(false);
		txtCECantidad00.setColumns(10);
		panel_29.add(txtCECantidad00);

		txtCECantidad01 = new JTextField();
		txtCECantidad01.setColumns(10);
		panel_29.add(txtCECantidad01);

		txtCECantidad10 = new JTextField();
		txtCECantidad10.setEditable(false);
		txtCECantidad10.setColumns(10);
		panel_29.add(txtCECantidad10);

		txtCECantidad11 = new JTextField();
		txtCECantidad11.setColumns(10);
		panel_29.add(txtCECantidad11);

		txtCECantidad20 = new JTextField();
		txtCECantidad20.setEditable(false);
		txtCECantidad20.setColumns(10);
		panel_29.add(txtCECantidad20);

		txtCECantidad21 = new JTextField();
		txtCECantidad21.setColumns(10);
		panel_29.add(txtCECantidad21);

		txtCECantidad30 = new JTextField();
		txtCECantidad30.setEditable(false);
		txtCECantidad30.setColumns(10);
		panel_29.add(txtCECantidad30);

		txtCECantidad31 = new JTextField();
		txtCECantidad31.setColumns(10);
		panel_29.add(txtCECantidad31);

		txtCECantidad40 = new JTextField();
		txtCECantidad40.setEditable(false);
		txtCECantidad40.setColumns(10);
		panel_29.add(txtCECantidad40);

		txtCECantidad41 = new JTextField();
		txtCECantidad41.setColumns(10);
		panel_29.add(txtCECantidad41);

		txtCECantidad50 = new JTextField();
		txtCECantidad50.setEditable(false);
		txtCECantidad50.setColumns(10);
		panel_29.add(txtCECantidad50);

		txtCECantidad51 = new JTextField();
		txtCECantidad51.setColumns(10);
		panel_29.add(txtCECantidad51);

		txtCECantidad60 = new JTextField();
		txtCECantidad60.setEditable(false);
		txtCECantidad60.setColumns(10);
		panel_29.add(txtCECantidad60);

		txtCECantidad61 = new JTextField();
		txtCECantidad61.setColumns(10);
		panel_29.add(txtCECantidad61);

		txtCECantidad70 = new JTextField();
		txtCECantidad70.setEditable(false);
		txtCECantidad70.setColumns(10);
		panel_29.add(txtCECantidad70);

		txtCECantidad71 = new JTextField();
		txtCECantidad71.setColumns(10);
		panel_29.add(txtCECantidad71);

		txtCECantidad80 = new JTextField();
		txtCECantidad80.setEditable(false);
		txtCECantidad80.setColumns(10);
		panel_29.add(txtCECantidad80);

		txtCECantidad81 = new JTextField();
		txtCECantidad81.setColumns(10);
		panel_29.add(txtCECantidad81);

		txtCECantidad90 = new JTextField();
		txtCECantidad90.setEditable(false);
		txtCECantidad90.setColumns(10);
		panel_29.add(txtCECantidad90);

		txtCECantidad91 = new JTextField();
		txtCECantidad91.setColumns(10);
		panel_29.add(txtCECantidad91);

		txtCECantidad100 = new JTextField();
		txtCECantidad100.setEditable(false);
		txtCECantidad100.setColumns(10);
		panel_29.add(txtCECantidad100);

		txtCECantidad101 = new JTextField();
		txtCECantidad101.setColumns(10);
		panel_29.add(txtCECantidad101);

		txtCECantidad110 = new JTextField();
		txtCECantidad110.setEditable(false);
		txtCECantidad110.setColumns(10);
		panel_29.add(txtCECantidad110);

		txtCECantidad111 = new JTextField();
		txtCECantidad111.setColumns(10);
		panel_29.add(txtCECantidad111);

		panel_30 = new JPanel();
		panel_30.setBounds(267, 17, 143, 250);
		panel_23.add(panel_30);
		panel_30.setLayout(new GridLayout(12, 0, 0, 0));

		txtCEObs0 = new JTextField();
		txtCEObs0.setColumns(10);
		panel_30.add(txtCEObs0);

		txtCEObs1 = new JTextField();
		txtCEObs1.setColumns(10);
		panel_30.add(txtCEObs1);

		txtCEObs2 = new JTextField();
		txtCEObs2.setColumns(10);
		panel_30.add(txtCEObs2);

		txtCEObs3 = new JTextField();
		txtCEObs3.setColumns(10);
		panel_30.add(txtCEObs3);

		txtCEObs4 = new JTextField();
		txtCEObs4.setColumns(10);
		panel_30.add(txtCEObs4);

		txtCEObs5 = new JTextField();
		txtCEObs5.setColumns(10);
		panel_30.add(txtCEObs5);

		txtCEObs6 = new JTextField();
		txtCEObs6.setColumns(10);
		panel_30.add(txtCEObs6);

		txtCEObs7 = new JTextField();
		txtCEObs7.setColumns(10);
		panel_30.add(txtCEObs7);

		txtCEObs8 = new JTextField();
		txtCEObs8.setColumns(10);
		panel_30.add(txtCEObs8);

		txtCEObs9 = new JTextField();
		txtCEObs9.setColumns(10);
		panel_30.add(txtCEObs9);

		txtCEObs10 = new JTextField();
		txtCEObs10.setColumns(10);
		panel_30.add(txtCEObs10);

		txtCEObs11 = new JTextField();
		txtCEObs11.setColumns(10);
		panel_30.add(txtCEObs11);

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

		txtFLCantidad00 = new JTextField();
		txtFLCantidad00.setEditable(false);
		txtFLCantidad00.setColumns(10);
		panel_33.add(txtFLCantidad00);

		txtFLCantidad01 = new JTextField();
		txtFLCantidad01.setColumns(10);
		panel_33.add(txtFLCantidad01);

		JPanel panel_34 = new JPanel();
		panel_34.setBounds(267, 17, 143, 25);
		panel_31.add(panel_34);
		panel_34.setLayout(new GridLayout(1, 0, 0, 0));

		txtFLObs0 = new JTextField();
		txtFLObs0.setColumns(10);
		panel_34.add(txtFLObs0);

		JLabel label_8 = new JLabel("Cantidad");
		label_8.setBounds(210, 1, 55, 14);
		panel_31.add(label_8);

		JLabel label_9 = new JLabel("Observaci\u00F3n/Referencia");
		label_9.setBounds(267, 1, 143, 14);
		panel_31.add(label_9);

		InformacionObligatoriaV pnlInformacionOblig = new InformacionObligatoriaV(865, 325);

		pnlCabecera.getBtnRegistrar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				ServicioInfoObligatoria srvInfoOblig = new ComponenteInfoObligatoria();
				servFicha = new ComponenteFicha();
				infor = cargarInfoObligatoria(pnlInformacionOblig);
				// System.out.println(infor.gettCabe().getCNombreProyecto());

				if (validarInfo(infor)) {
					srvInfoOblig.crear(infor);
					servFicha.insertarFormulario(cargarListas());
				} else {
					JOptionPane.showMessageDialog(null, "Ingresar datos en Información Obligatoria ");
				}
			}
		});

		panel.add(pnlInformacionOblig.getPnlInformacionObl());
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				new Menu().setVisible(true);
				dispose();
			}
		});
	}

	public LinkedList<LinkedList<TdetalleFicha>> cargarListas() {
		LinkedList<TdetalleFicha> listaElectrico = new LinkedList<>();
		LinkedList<TdetalleFicha> listaAL = new LinkedList<>();
		LinkedList<TdetalleFicha> listaArquitectonico = new LinkedList<>();
		LinkedList<TdetalleFicha> listaFrontal = new LinkedList<>();
		LinkedList<TdetalleFicha> listaPosterior = new LinkedList<>();
		LinkedList<TdetalleFicha> listaLateral = new LinkedList<>();
		LinkedList<TdetalleFicha> listaEstructural = new LinkedList<>();

		ServicioInfoObligatoria srvInfoObl = new ComponenteInfoObligatoria();
		infor.setIoSerial(srvInfoObl.serialInfoOblMax());

		BigDecimal porcentajeAvance;
		TGrupo grupoTmp = servFicha.buscarGrupo("Kit eléctrico");
		Integer updateFicha = servFicha.nActualizacionFicha(gettCabecera(), ficha);
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtKECantidad00.getText()),
				Integer.parseInt(txtKECantidad01.getText()));
		listaElectrico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtKECantidad00.getText()), Integer.parseInt(txtKECantidad01.getText()),
				txtKEObs0.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtKECantidad10.getText()),
				Integer.parseInt(txtKECantidad11.getText()));
		listaElectrico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtKECantidad10.getText()), Integer.parseInt(txtKECantidad11.getText()),
				txtKEObs1.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtKECantidad20.getText()),
				Integer.parseInt(txtKECantidad21.getText()));
		listaElectrico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtKECantidad20.getText()), Integer.parseInt(txtKECantidad21.getText()),
				txtKEObs2.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtKECantidad30.getText()),
				Integer.parseInt(txtKECantidad31.getText()));
		listaElectrico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtKECantidad30.getText()), Integer.parseInt(txtKECantidad31.getText()),
				txtKEObs3.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtKECantidad40.getText()),
				Integer.parseInt(txtKECantidad41.getText()));
		listaElectrico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtKECantidad40.getText()), Integer.parseInt(txtKECantidad41.getText()),
				txtKEObs4.getText(), updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Kit agua lluvia");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtALCantidad00.getText()),
				Integer.parseInt(txtALCantidad01.getText()));
		listaAL.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtALCantidad00.getText()), Integer.parseInt(txtALCantidad01.getText()),
				txtALObs0.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtALCantidad10.getText()),
				Integer.parseInt(txtALCantidad11.getText()));
		listaAL.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtALCantidad10.getText()), Integer.parseInt(txtALCantidad11.getText()),
				txtALObs1.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtALCantidad20.getText()),
				Integer.parseInt(txtALCantidad21.getText()));
		listaAL.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtALCantidad20.getText()), Integer.parseInt(txtALCantidad21.getText()),
				txtALObs2.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtALCantidad30.getText()),
				Integer.parseInt(txtALCantidad31.getText()));
		listaAL.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtALCantidad30.getText()), Integer.parseInt(txtALCantidad31.getText()),
				txtALObs3.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtALCantidad40.getText()),
				Integer.parseInt(txtALCantidad41.getText()));
		listaAL.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtALCantidad40.getText()), Integer.parseInt(txtALCantidad41.getText()),
				txtALObs4.getText(), updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Componente arquitectónico");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCACantidad00.getText()),
				Integer.parseInt(txtCACantidad01.getText()));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtCACantidad00.getText()), Integer.parseInt(txtCACantidad01.getText()),
				txtCAObs0.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCACantidad10.getText()),
				Integer.parseInt(txtCACantidad11.getText()));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtCACantidad10.getText()), Integer.parseInt(txtCACantidad11.getText()),
				txtCAObs1.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCACantidad20.getText()),
				Integer.parseInt(txtCACantidad21.getText()));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtCACantidad20.getText()), Integer.parseInt(txtCACantidad21.getText()),
				txtCAObs2.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCACantidad30.getText()),
				Integer.parseInt(txtCACantidad31.getText()));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtCACantidad30.getText()), Integer.parseInt(txtCACantidad31.getText()),
				txtCAObs3.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCACantidad40.getText()),
				Integer.parseInt(txtCACantidad41.getText()));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtCACantidad40.getText()), Integer.parseInt(txtCACantidad41.getText()),
				txtCAObs4.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCACantidad50.getText()),
				Integer.parseInt(txtCACantidad51.getText()));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtCACantidad50.getText()), Integer.parseInt(txtCACantidad51.getText()),
				txtCAObs5.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCACantidad60.getText()),
				Integer.parseInt(txtCACantidad61.getText()));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtCACantidad60.getText()), Integer.parseInt(txtCACantidad61.getText()),
				txtCAObs6.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCACantidad70.getText()),
				Integer.parseInt(txtCACantidad71.getText()));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtCACantidad70.getText()), Integer.parseInt(txtCACantidad71.getText()),
				txtCAObs7.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCACantidad80.getText()),
				Integer.parseInt(txtCACantidad81.getText()));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtCACantidad80.getText()), Integer.parseInt(txtCACantidad81.getText()),
				txtCAObs8.getText(), updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Fachada frontal");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtFFCantidad00.getText()),
				Integer.parseInt(txtFFCantidad01.getText()));
		listaFrontal.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtFFCantidad00.getText()), Integer.parseInt(txtFFCantidad01.getText()),
				txtFFObs0.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtFFCantidad10.getText()),
				Integer.parseInt(txtFFCantidad11.getText()));
		listaFrontal.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtFFCantidad10.getText()), Integer.parseInt(txtFFCantidad11.getText()),
				txtFFObs1.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtFFCantidad20.getText()),
				Integer.parseInt(txtFFCantidad21.getText()));
		listaFrontal.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtFFCantidad20.getText()), Integer.parseInt(txtFFCantidad21.getText()),
				txtFFObs2.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtFFCantidad30.getText()),
				Integer.parseInt(txtFFCantidad31.getText()));
		listaFrontal.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtFFCantidad30.getText()), Integer.parseInt(txtFFCantidad31.getText()),
				txtFFObs3.getText(), updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Fachada posterior");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtFPCantidad00.getText()),
				Integer.parseInt(txtFPCantidad01.getText()));
		listaPosterior.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtFPCantidad00.getText()), Integer.parseInt(txtFPCantidad01.getText()),
				txtFPObs0.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtFPCantida10.getText()),
				Integer.parseInt(txtFPCantidad11.getText()));
		listaPosterior.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtFPCantida10.getText()), Integer.parseInt(txtFPCantidad11.getText()),
				txtFPObs1.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtFPCantidad20.getText()),
				Integer.parseInt(txtFPCantidad21.getText()));
		listaPosterior.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtFPCantidad20.getText()), Integer.parseInt(txtFPCantidad21.getText()),
				txtFPObs2.getText(), updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Fachada lateral");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtFLCantidad00.getText()),
				Integer.parseInt(txtFLCantidad01.getText()));
		listaLateral.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtFLCantidad00.getText()), Integer.parseInt(txtFLCantidad01.getText()),
				txtFLObs0.getText(), updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Componente estructural");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCECantidad00.getText()),
				Integer.parseInt(txtCECantidad01.getText()));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad00.getText()), Integer.parseInt(txtCECantidad01.getText()),
				txtCEObs0.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCECantidad10.getText()),
				Integer.parseInt(txtCECantidad11.getText()));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad10.getText()), Integer.parseInt(txtCECantidad11.getText()),
				txtCEObs1.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCECantidad20.getText()),
				Integer.parseInt(txtCECantidad21.getText()));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad20.getText()), Integer.parseInt(txtCECantidad21.getText()),
				txtCEObs2.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCECantidad30.getText()),
				Integer.parseInt(txtCECantidad31.getText()));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad30.getText()), Integer.parseInt(txtCECantidad31.getText()),
				txtCEObs3.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCECantidad40.getText()),
				Integer.parseInt(txtCECantidad41.getText()));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad40.getText()), Integer.parseInt(txtCECantidad41.getText()),
				txtCEObs4.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCECantidad50.getText()),
				Integer.parseInt(txtCECantidad51.getText()));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad50.getText()), Integer.parseInt(txtCECantidad51.getText()),
				txtCEObs5.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCECantidad60.getText()),
				Integer.parseInt(txtCECantidad61.getText()));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad60.getText()), Integer.parseInt(txtCECantidad61.getText()),
				txtCEObs6.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCECantidad70.getText()),
				Integer.parseInt(txtCECantidad71.getText()));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad70.getText()), Integer.parseInt(txtCECantidad71.getText()),
				txtCEObs7.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCECantidad80.getText()),
				Integer.parseInt(txtCECantidad81.getText()));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad80.getText()), Integer.parseInt(txtCECantidad81.getText()),
				txtCEObs8.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCECantidad90.getText()),
				Integer.parseInt(txtCECantidad91.getText()));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad90.getText()), Integer.parseInt(txtCECantidad91.getText()),
				txtCEObs9.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCECantidad100.getText()),
				Integer.parseInt(txtCECantidad101.getText()));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad100.getText()), Integer.parseInt(txtCECantidad101.getText()),
				txtCEObs10.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCECantidad110.getText()),
				Integer.parseInt(txtCECantidad111.getText()));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad110.getText()), Integer.parseInt(txtCECantidad111.getText()),
				txtCEObs11.getText(), updateFicha, porcentajeAvance));

		LinkedList<LinkedList<TdetalleFicha>> listaFormulario = new LinkedList<LinkedList<TdetalleFicha>>();
		listaFormulario.add(listaElectrico);
		listaFormulario.add(listaAL);
		listaFormulario.add(listaArquitectonico);
		listaFormulario.add(listaFrontal);
		listaFormulario.add(listaPosterior);
		listaFormulario.add(listaLateral);
		listaFormulario.add(listaEstructural);

		return listaFormulario;
	}
}
