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

import com.capa.datos.TCabecera;
import com.capa.datos.TFicha;
import com.capa.datos.TGrupo;
import com.capa.datos.TInformacionObligatoria;
import com.capa.datos.TdetalleFicha;
import com.capa.negocios.ComponenteCabecera;
import com.capa.negocios.ComponenteFichaMA;
import com.capa.negocios.ComponenteInfoObligatoria;
import com.capa.negocios.ServicioCabecera;
import com.capa.negocios.ServicioFichaMA;
import com.capa.negocios.ServicioInfoObligatoria;

public class MmTemplate extends JFrame {

	private static final long serialVersionUID = -3891089127852241756L;
	private JPanel contentPane;
	private JTextField txtKECantidad00;
	private JTextField txtKECantidad01;
	private JTextField txtKECantidad10;
	private JTextField txtKECantidad11;
	private JTextField txtKECantidad20;
	private JTextField txtKECantidad21;
	private JTextField txtKECantidad30;
	private JTextField txtKECantidad31;
	private JTextField txtKEObsRef0;
	private JTextField txtKEObsRef1;
	private JTextField txtKEObsRef2;
	private JTextField txtKEObsRef3;
	private JTextField txtKHObsRef0;
	private JTextField txtKHCantidad00;
	private JTextField txtKHCantidad01;
	private JTextField txtKALCantidad00;
	private JTextField txtKALCantidad01;
	private JTextField txtKALObsRef0;

	private JTextField txtKALCantidad10;
	private JTextField txtKALCantidad11;

	private JTextField txtKALObsRef1;

	private JTextField txtKALCantidad20;
	private JTextField txtKALCantidad21;
	private JTextField txtKALCantidad30;
	private JTextField txtKALCantidad31;

	private JTextField txtKALObsRef2;
	private JTextField txtKALObsRef3;

	private JLabel lblKitParaConexin;

	private JTextField txtKALCantidad40;
	private JTextField txtKALCantidad41;
	private JTextField txtKALObsRef4;
	private JTextField txtKAP1Cantidad00;
	private JTextField txtKAP1Cantidad01;
	private JTextField txtKAP1ObsRef0;
	private JTextField txtKAP1Cantidad10;
	private JTextField txtKAP1Cantidad11;
	private JTextField txtKAP1Cantidad20;
	private JTextField txtKAP1Cantidad21;
	private JTextField txtKAP1ObsRef1;
	private JTextField txtKAP1ObsRef2;
	private JTextField txtKARCantidad00;
	private JTextField txtKARCantidad01;
	private JTextField txtKARObsRef0;
	private JTextField txtKARCantidad10;
	private JTextField txtKARCantidad11;
	private JPanel panel_45;
	private JTextField txtKARObsRef1;
	private JTextField txtKARCantidad20;
	private JTextField txtKARCantidad21;
	private JTextField txtKARObsRef2;
	private JTextField txtKARCantidad30;
	private JTextField txtKARCantidad31;
	private JTextField txtKARCantidad40;
	private JTextField txtKARCantidad41;
	private JTextField txtKARObsRef3;
	private JTextField txtKARObsRef4;
	private JTextField txtKARCantidad50;
	private JTextField txtKARCantidad51;
	private JTextField txtKARObsRef5;
	private JTextField txtKARCantidad60;
	private JTextField txtKARCantidad61;
	private JTextField txtKARObsRef6;
	private JTextField txtCA2Cantidad00;
	private JTextField txtCA2Cantidad01;
	private JTextField txtCA2Cantidad10;
	private JTextField txtCA2Cantidad11;
	private JTextField txtCA2Cantidad20;
	private JTextField txtCA2Cantidad21;
	private JTextField txtCA2Cantidad30;
	private JTextField txtCA2Cantidad31;
	private JTextField txtCA2ObsRef0;
	private JTextField txtCA2ObsRef1;
	private JTextField txtCA2ObsRef2;
	private JTextField txtCA2ObsRef4;
	private JTextField txtCA2Cantidad40;
	private JTextField txtCA2Cantidad41;
	private JTextField txtCA2ObsRef3;
	private JTextField txtCECantidad00;
	private JTextField txtCECantidad01;
	private JTextField txtCECantidad10;
	private JTextField txtCECantidad11;
	private JTextField txtCECantidad20;
	private JTextField txtCECantidad21;
	private JTextField txtCECantidad30;
	private JTextField txtCECantidad31;
	private JTextField txtCEObsRef0;
	private JTextField txtCEObsRef1;
	private JTextField txtCEObsRef2;
	private JTextField txtCEObsRef11;
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
	private JTextField txtCECantidad111;
	private JTextField txtCECantidad110;
	private JTextField txtCEObsRef3;
	private JTextField txtCEObsRef4;
	private JTextField txtCEObsRef5;
	private JTextField txtCEObsRef6;
	private JTextField txtCEObsRef7;
	private JTextField txtCEObsRef8;
	private JTextField txtCEObsRef9;
	private JTextField txtCEObsRef10;
	private JTextField txtKAP2Cantidad00;
	private JTextField txtKAP2Cantidad01;
	private JTextField txtKAP2ObsRef0;
	private JTextField txtKAP2Cantidad10;
	private JTextField txtKAP2Cantidad11;
	private JTextField txtKAP2ObsRef1;
	private JTextField txtCA1Cantidad00;
	private JTextField txtCA1Cantidad01;
	private JTextField txtCA1Cantidad10;
	private JTextField txtCA1Cantidad11;
	private JTextField txtCA1Cantidad20;
	private JTextField txtCA1Cantidad21;
	private JTextField txtCA1ObsRef0;
	private JTextField txtCA1ObsRef1;
	private JTextField txtCA1ObsRef2;
	private JTextField txtCA1Cantidad30;
	private JTextField txtCA1Cantidad31;
	private JTextField txtCA1ObsRef3;
	private JTextField txtFFCantidad00;
	private JTextField txtFFCantidad01;
	private JTextField txtFFCantidad10;
	private JTextField txtFFCantidad11;
	private JTextField txtFFCantidad20;
	private JTextField txtFFCantidad21;
	private JTextField txtFFCantidad30;
	private JTextField txtFFCantidad31;
	private JTextField txtFFObsRef0;
	private JTextField txtFFObsRef1;
	private JTextField txtFFObsRef2;
	private JTextField txtFFObsRef3;
	private JTextField txtFPCantidad00;
	private JTextField txtFPCantidad01;
	private JTextField txtFPCantidad10;
	private JTextField txtFPCantidad11;
	private JTextField txtFPCantidad20;
	private JTextField txtFPCantidad21;
	private JTextField txtFPObsRef0;
	private JTextField txtFPObsRef1;
	private JTextField txtFPObsRef2;
	private JTextField txtFLCantidad00;
	private JTextField txtFLCantidad01;
	private JTextField txtFLObsRef0;
	private JTextField txtFF2Cantidad00;
	private JTextField txtFF2Cantidad01;
	private JTextField txtFF2Cantidad10;
	private JTextField txtFF2Cantidad11;
	private JTextField txtFF2Cantidad20;
	private JTextField txtFF2Cantidad21;
	private JTextField txtFF2Cantidad30;
	private JTextField txtFF2Cantidad31;
	private JTextField txtFF2ObsRef0;
	private JTextField txtFF2ObsRef1;
	private JTextField txtFF2ObsRef2;
	private JTextField txtFF2ObsRef3;
	private TFicha ficha;

	public MmTemplate(TFicha ficha) {

		this.ficha = ficha;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1311, 706);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		this.setResizable(false);
		this.setLocationRelativeTo(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 125, 1284, 540);
		contentPane.add(tabbedPane);

		// String texto = "<html><body>Kit de Accesorios de Conexi\u00F3n Agua
		// de<br>"
		// + "Lluvia (2 rejilla, 4 codos 90\u00B0,1/4 gl<br>polipega, tornillos,
		// abrazaderas</body></html>)";
		//
		// String textoConexion = "<html><body>Kit para conexi\u00F3n de
		// tuber\u00EDa 75 mm. (lija<br>"
		// + "pliego, polipega 1/4gal,1 codo 90\u00B0)</body></html>";
		//
		// String textoAccAP = "<html><body>Kit de Accesorios de Conexi\u00F3n
		// Agua<br>Potable (fregaderos)(2 te reducciones<br>3/4-1/2, "
		// + "2 neplos,4 uniones de 1/2,4<br>"
		// + "codos de 90\u00B0,2 mangueras de abasto,2<br>llave de paso,
		// tefl\u00F3n, pasta selladora)";
		//
		// String textoConTub = "<html><body>Kit para conexi\u00F3n de
		// tuber\u00EDa 1/2\". (lija<br>pliego, polipega 1/4gal,3
		// uniones)</body></html>";
		//
		// String textoConeTub = "<html><body>Kit para conexi\u00F3n de
		// tuber\u00EDa 3/4\". (lija<br>pliego, polipega 1/4gal,3
		// uniones)</body></html>";
		//
		// String textoConeAR = "<html><body>Kit de Accesorios de Conexi\u00F3n
		// Agua<br>Residual (CP)(2 codo 90\u00B0,2 rejilla,2 ye<br>"
		// + "75-110,1/4gl polipega)</body></html>";
		//
		// String textoFrega = "<html><body>Kit de Accesorios de Conexi\u00F3n
		// Agua<br>Residual (Fregaderos)( 4codo 90\u00B0,1/4 gl<br>"
		// + "polipega ,4 yee 50-110)</body></html>";
		//
		// String textoDescTub = "<html><body>Kit para conexi\u00F3n de
		// tuber\u00EDa 50 mm. (lija<br>un pliego, polipega 1/4 gal, 1/4 gl
		// suelda<br>"
		// + "l\u00EDquida, 2 uniones,2codo 90\u00B0, 2 codo45\u00B0)";
		//
		// String textoLabel = "<html><body>Kit para conexi\u00F3n de
		// tuber\u00EDa 75 mm. (lija<br>pliego, polipega 1/2gal,1/4 gl
		// suelda<br>"
		// + "l�quida, 2 uniones,2codo 90\u00B0,2codo45\u00B0)</body></html>";
		//
		// String textoVentana = "<html><body>Ventana corredera, compuesta por
		// tres<br>hojas y dos carriles. UPVC con vidrio<br>"
		// + "flotado de 3 mm de 3x1,10</body></html>";

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

		txtKECantidad00 = new JTextField();
		txtKECantidad00.setEditable(false);
		txtKECantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECantidad00.setColumns(10);
		pnlCantidadidad00.add(txtKECantidad00);

		txtKECantidad01 = new JTextField();
		txtKECantidad01.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECantidad01.setColumns(10);
		pnlCantidadidad00.add(txtKECantidad01);

		txtKECantidad10 = new JTextField();
		txtKECantidad10.setEditable(false);
		txtKECantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECantidad10.setColumns(10);
		pnlCantidadidad00.add(txtKECantidad10);

		txtKECantidad11 = new JTextField();
		txtKECantidad11.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECantidad11.setColumns(10);
		pnlCantidadidad00.add(txtKECantidad11);

		txtKECantidad20 = new JTextField();
		txtKECantidad20.setEditable(false);
		txtKECantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECantidad20.setColumns(10);
		pnlCantidadidad00.add(txtKECantidad20);

		txtKECantidad21 = new JTextField();
		txtKECantidad21.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECantidad21.setColumns(10);
		pnlCantidadidad00.add(txtKECantidad21);

		txtKECantidad30 = new JTextField();
		txtKECantidad30.setEditable(false);
		txtKECantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECantidad30.setColumns(10);
		pnlCantidadidad00.add(txtKECantidad30);

		txtKECantidad31 = new JTextField();
		txtKECantidad31.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECantidad31.setColumns(10);
		pnlCantidadidad00.add(txtKECantidad31);

		JPanel pnlObsRef00 = new JPanel();
		pnlObsRef00.setBounds(248, 14, 162, 80);
		pnlKitElectrico.add(pnlObsRef00);
		pnlObsRef00.setLayout(new GridLayout(4, 1, 0, 0));

		txtKEObsRef0 = new JTextField();
		txtKEObsRef0.setColumns(10);
		pnlObsRef00.add(txtKEObsRef0);

		txtKEObsRef1 = new JTextField();
		txtKEObsRef1.setColumns(10);
		pnlObsRef00.add(txtKEObsRef1);

		txtKEObsRef2 = new JTextField();
		txtKEObsRef2.setColumns(10);
		pnlObsRef00.add(txtKEObsRef2);

		txtKEObsRef3 = new JTextField();
		txtKEObsRef3.setColumns(10);
		pnlObsRef00.add(txtKEObsRef3);

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

		txtKHCantidad00 = new JTextField();
		txtKHCantidad00.setEditable(false);
		txtKHCantidad00.setColumns(10);
		panel_2.add(txtKHCantidad00);

		txtKHCantidad01 = new JTextField();
		txtKHCantidad01.setColumns(10);
		panel_2.add(txtKHCantidad01);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(248, 14, 162, 20);
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 1, 0, 0));

		txtKHObsRef0 = new JTextField();
		txtKHObsRef0.setColumns(10);
		panel_3.add(txtKHObsRef0);

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

		txtKALCantidad00 = new JTextField();
		txtKALCantidad00.setEditable(false);
		txtKALCantidad00.setColumns(10);
		panel_6.add(txtKALCantidad00);

		txtKALCantidad01 = new JTextField();
		txtKALCantidad01.setColumns(10);
		panel_6.add(txtKALCantidad01);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(248, 14, 162, 20);
		panel_4.add(panel_7);
		panel_7.setLayout(new GridLayout(1, 1, 0, 0));

		txtKALObsRef0 = new JTextField();
		txtKALObsRef0.setColumns(10);
		panel_7.add(txtKALObsRef0);

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

		txtKALCantidad10 = new JTextField();
		txtKALCantidad10.setEditable(false);
		txtKALCantidad10.setColumns(10);
		panel_10.add(txtKALCantidad10);

		txtKALCantidad11 = new JTextField();
		txtKALCantidad11.setColumns(10);
		panel_10.add(txtKALCantidad11);

		JPanel panel_11 = new JPanel();
		panel_11.setBounds(248, 50, 162, 20);
		panel_4.add(panel_11);
		panel_11.setLayout(new GridLayout(1, 1, 0, 0));

		txtKALObsRef1 = new JTextField();
		txtKALObsRef1.setColumns(10);
		panel_11.add(txtKALObsRef1);

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

		txtKALCantidad20 = new JTextField();
		txtKALCantidad20.setEditable(false);
		txtKALCantidad20.setColumns(10);
		panel_12.add(txtKALCantidad20);

		txtKALCantidad21 = new JTextField();
		txtKALCantidad21.setColumns(10);
		panel_12.add(txtKALCantidad21);

		txtKALCantidad30 = new JTextField();
		txtKALCantidad30.setEditable(false);
		txtKALCantidad30.setColumns(10);
		panel_12.add(txtKALCantidad30);

		txtKALCantidad31 = new JTextField();
		txtKALCantidad31.setColumns(10);
		panel_12.add(txtKALCantidad31);

		JPanel panel_13 = new JPanel();
		panel_13.setBounds(248, 94, 162, 40);
		panel_4.add(panel_13);
		panel_13.setLayout(new GridLayout(2, 1, 0, 0));

		txtKALObsRef2 = new JTextField();
		txtKALObsRef2.setColumns(10);
		panel_13.add(txtKALObsRef2);

		txtKALObsRef3 = new JTextField();
		txtKALObsRef3.setColumns(10);
		panel_13.add(txtKALObsRef3);

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

		txtKALCantidad40 = new JTextField();
		txtKALCantidad40.setEditable(false);
		txtKALCantidad40.setColumns(10);
		panel_15.add(txtKALCantidad40);

		txtKALCantidad41 = new JTextField();
		txtKALCantidad41.setColumns(10);
		panel_15.add(txtKALCantidad41);

		JPanel panel_16 = new JPanel();
		panel_16.setBounds(248, 144, 162, 20);
		panel_4.add(panel_16);
		panel_16.setLayout(new GridLayout(1, 1, 0, 0));

		txtKALObsRef4 = new JTextField();
		txtKALObsRef4.setColumns(10);
		panel_16.add(txtKALObsRef4);

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

		txtKAP1Cantidad00 = new JTextField();
		txtKAP1Cantidad00.setEditable(false);
		txtKAP1Cantidad00.setColumns(10);
		panel_19.add(txtKAP1Cantidad00);

		txtKAP1Cantidad01 = new JTextField();
		txtKAP1Cantidad01.setColumns(10);
		panel_19.add(txtKAP1Cantidad01);

		JPanel panel_20 = new JPanel();
		panel_20.setBounds(248, 47, 162, 20);
		panel_17.add(panel_20);
		panel_20.setLayout(new GridLayout(1, 1, 0, 0));

		txtKAP1ObsRef0 = new JTextField();
		txtKAP1ObsRef0.setColumns(10);
		panel_20.add(txtKAP1ObsRef0);

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

		txtKAP1Cantidad10 = new JTextField();
		txtKAP1Cantidad10.setEditable(false);
		txtKAP1Cantidad10.setColumns(10);
		panel_22.add(txtKAP1Cantidad10);

		txtKAP1Cantidad11 = new JTextField();
		txtKAP1Cantidad11.setColumns(10);
		panel_22.add(txtKAP1Cantidad11);

		txtKAP1Cantidad20 = new JTextField();
		txtKAP1Cantidad20.setEditable(false);
		txtKAP1Cantidad20.setColumns(10);
		panel_22.add(txtKAP1Cantidad20);

		txtKAP1Cantidad21 = new JTextField();
		txtKAP1Cantidad21.setColumns(10);
		panel_22.add(txtKAP1Cantidad21);

		JPanel panel_23 = new JPanel();
		panel_23.setBounds(248, 98, 162, 40);
		panel_17.add(panel_23);
		panel_23.setLayout(new GridLayout(2, 1, 0, 0));

		txtKAP1ObsRef1 = new JTextField();
		txtKAP1ObsRef1.setColumns(10);
		panel_23.add(txtKAP1ObsRef1);

		txtKAP1ObsRef2 = new JTextField();
		txtKAP1ObsRef2.setColumns(10);
		panel_23.add(txtKAP1ObsRef2);

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

		txtKAP2Cantidad00 = new JTextField();
		txtKAP2Cantidad00.setEditable(false);
		txtKAP2Cantidad00.setColumns(10);
		panel_87.add(txtKAP2Cantidad00);

		txtKAP2Cantidad01 = new JTextField();
		txtKAP2Cantidad01.setColumns(10);
		panel_87.add(txtKAP2Cantidad01);

		JPanel panel_88 = new JPanel();
		panel_88.setBounds(248, 18, 162, 20);
		panel_79.add(panel_88);
		panel_88.setLayout(new GridLayout(1, 1, 0, 0));

		txtKAP2ObsRef0 = new JTextField();
		txtKAP2ObsRef0.setColumns(10);
		panel_88.add(txtKAP2ObsRef0);

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

		txtKAP2Cantidad10 = new JTextField();
		txtKAP2Cantidad10.setEditable(false);
		txtKAP2Cantidad10.setColumns(10);
		panel_90.add(txtKAP2Cantidad10);

		txtKAP2Cantidad11 = new JTextField();
		txtKAP2Cantidad11.setColumns(10);
		panel_90.add(txtKAP2Cantidad11);

		JPanel panel_91 = new JPanel();
		panel_91.setBounds(248, 59, 162, 20);
		panel_79.add(panel_91);
		panel_91.setLayout(new GridLayout(1, 1, 0, 0));

		txtKAP2ObsRef1 = new JTextField();
		txtKAP2ObsRef1.setColumns(10);
		panel_91.add(txtKAP2ObsRef1);

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

		txtKARCantidad00 = new JTextField();
		txtKARCantidad00.setEditable(false);
		txtKARCantidad00.setColumns(10);
		panel_32.add(txtKARCantidad00);

		txtKARCantidad01 = new JTextField();
		txtKARCantidad01.setColumns(10);
		panel_32.add(txtKARCantidad01);

		JPanel panel_33 = new JPanel();
		panel_33.setBounds(248, 25, 162, 20);
		panel_30.add(panel_33);
		panel_33.setLayout(new GridLayout(1, 1, 0, 0));

		txtKARObsRef0 = new JTextField();
		txtKARObsRef0.setColumns(10);
		panel_33.add(txtKARObsRef0);

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

		txtKARCantidad10 = new JTextField();
		txtKARCantidad10.setEditable(false);
		txtKARCantidad10.setColumns(10);
		panel_44.add(txtKARCantidad10);

		txtKARCantidad11 = new JTextField();
		txtKARCantidad11.setColumns(10);
		panel_44.add(txtKARCantidad11);

		panel_45 = new JPanel();
		panel_45.setBounds(248, 67, 162, 20);
		panel_30.add(panel_45);
		panel_45.setLayout(new GridLayout(1, 1, 0, 0));

		txtKARObsRef1 = new JTextField();
		txtKARObsRef1.setColumns(10);
		panel_45.add(txtKARObsRef1);

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

		txtKARCantidad20 = new JTextField();
		txtKARCantidad20.setEditable(false);
		txtKARCantidad20.setColumns(10);
		panel_35.add(txtKARCantidad20);

		txtKARCantidad21 = new JTextField();
		txtKARCantidad21.setColumns(10);
		panel_35.add(txtKARCantidad21);

		JPanel panel_36 = new JPanel();
		panel_36.setBounds(248, 96, 162, 20);
		panel_30.add(panel_36);
		panel_36.setLayout(new GridLayout(1, 1, 0, 0));

		txtKARObsRef2 = new JTextField();
		txtKARObsRef2.setColumns(10);
		panel_36.add(txtKARObsRef2);

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

		txtKARCantidad30 = new JTextField();
		txtKARCantidad30.setEditable(false);
		txtKARCantidad30.setColumns(10);
		panel_38.add(txtKARCantidad30);

		txtKARCantidad31 = new JTextField();
		txtKARCantidad31.setColumns(10);
		panel_38.add(txtKARCantidad31);

		txtKARCantidad40 = new JTextField();
		txtKARCantidad40.setEditable(false);
		txtKARCantidad40.setColumns(10);
		panel_38.add(txtKARCantidad40);

		txtKARCantidad41 = new JTextField();
		txtKARCantidad41.setColumns(10);
		panel_38.add(txtKARCantidad41);

		JPanel panel_39 = new JPanel();
		panel_39.setBounds(248, 127, 162, 40);
		panel_30.add(panel_39);
		panel_39.setLayout(new GridLayout(2, 1, 0, 0));

		txtKARObsRef3 = new JTextField();
		txtKARObsRef3.setColumns(10);
		panel_39.add(txtKARObsRef3);

		txtKARObsRef4 = new JTextField();
		txtKARObsRef4.setColumns(10);
		panel_39.add(txtKARObsRef4);

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

		txtKARCantidad50 = new JTextField();
		txtKARCantidad50.setEditable(false);
		txtKARCantidad50.setColumns(10);
		panel_41.add(txtKARCantidad50);

		txtKARCantidad51 = new JTextField();
		txtKARCantidad51.setColumns(10);
		panel_41.add(txtKARCantidad51);

		JPanel panel_42 = new JPanel();
		panel_42.setBounds(248, 176, 162, 20);
		panel_30.add(panel_42);
		panel_42.setLayout(new GridLayout(1, 1, 0, 0));

		txtKARObsRef5 = new JTextField();
		txtKARObsRef5.setColumns(10);
		panel_42.add(txtKARObsRef5);

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

		txtKARCantidad60 = new JTextField();
		txtKARCantidad60.setEditable(false);
		txtKARCantidad60.setColumns(10);
		panel_47.add(txtKARCantidad60);

		txtKARCantidad61 = new JTextField();
		txtKARCantidad61.setColumns(10);
		panel_47.add(txtKARCantidad61);

		JPanel panel_48 = new JPanel();
		panel_48.setBounds(248, 220, 162, 20);
		panel_30.add(panel_48);
		panel_48.setLayout(new GridLayout(1, 1, 0, 0));

		txtKARObsRef6 = new JTextField();
		txtKARObsRef6.setColumns(10);
		panel_48.add(txtKARObsRef6);

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

		txtCA1Cantidad00 = new JTextField();
		txtCA1Cantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA1Cantidad00.setEditable(false);
		txtCA1Cantidad00.setColumns(10);
		panel_26.add(txtCA1Cantidad00);

		txtCA1Cantidad01 = new JTextField();
		txtCA1Cantidad01.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA1Cantidad01.setColumns(10);
		panel_26.add(txtCA1Cantidad01);

		txtCA1Cantidad10 = new JTextField();
		txtCA1Cantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA1Cantidad10.setEditable(false);
		txtCA1Cantidad10.setColumns(10);
		panel_26.add(txtCA1Cantidad10);

		txtCA1Cantidad11 = new JTextField();
		txtCA1Cantidad11.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA1Cantidad11.setColumns(10);
		panel_26.add(txtCA1Cantidad11);

		txtCA1Cantidad20 = new JTextField();
		txtCA1Cantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA1Cantidad20.setEditable(false);
		txtCA1Cantidad20.setColumns(10);
		panel_26.add(txtCA1Cantidad20);

		txtCA1Cantidad21 = new JTextField();
		txtCA1Cantidad21.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA1Cantidad21.setColumns(10);
		panel_26.add(txtCA1Cantidad21);

		JPanel panel_27 = new JPanel();
		panel_27.setBounds(248, 14, 162, 60);
		panel_24.add(panel_27);
		panel_27.setLayout(new GridLayout(3, 1, 0, 0));

		txtCA1ObsRef0 = new JTextField();
		txtCA1ObsRef0.setColumns(10);
		panel_27.add(txtCA1ObsRef0);

		txtCA1ObsRef1 = new JTextField();
		txtCA1ObsRef1.setColumns(10);
		panel_27.add(txtCA1ObsRef1);

		txtCA1ObsRef2 = new JTextField();
		txtCA1ObsRef2.setColumns(10);
		panel_27.add(txtCA1ObsRef2);

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

		txtCA1Cantidad30 = new JTextField();
		txtCA1Cantidad30.setEditable(false);
		txtCA1Cantidad30.setColumns(10);
		panel_29.add(txtCA1Cantidad30);

		txtCA1Cantidad31 = new JTextField();
		txtCA1Cantidad31.setColumns(10);
		panel_29.add(txtCA1Cantidad31);

		JPanel panel_80 = new JPanel();
		panel_80.setBounds(248, 86, 162, 20);
		panel_24.add(panel_80);
		panel_80.setLayout(new GridLayout(1, 1, 0, 0));

		txtCA1ObsRef3 = new JTextField();
		txtCA1ObsRef3.setColumns(10);
		panel_80.add(txtCA1ObsRef3);

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

		txtCA2Cantidad00 = new JTextField();
		txtCA2Cantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA2Cantidad00.setEditable(false);
		txtCA2Cantidad00.setColumns(10);
		panel_57.add(txtCA2Cantidad00);

		txtCA2Cantidad01 = new JTextField();
		txtCA2Cantidad01.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA2Cantidad01.setColumns(10);
		panel_57.add(txtCA2Cantidad01);

		txtCA2Cantidad10 = new JTextField();
		txtCA2Cantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA2Cantidad10.setEditable(false);
		txtCA2Cantidad10.setColumns(10);
		panel_57.add(txtCA2Cantidad10);

		txtCA2Cantidad11 = new JTextField();
		txtCA2Cantidad11.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA2Cantidad11.setColumns(10);
		panel_57.add(txtCA2Cantidad11);

		txtCA2Cantidad20 = new JTextField();
		txtCA2Cantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA2Cantidad20.setEditable(false);
		txtCA2Cantidad20.setColumns(10);
		panel_57.add(txtCA2Cantidad20);

		txtCA2Cantidad21 = new JTextField();
		txtCA2Cantidad21.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA2Cantidad21.setColumns(10);
		panel_57.add(txtCA2Cantidad21);

		txtCA2Cantidad30 = new JTextField();
		txtCA2Cantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA2Cantidad30.setEditable(false);
		txtCA2Cantidad30.setColumns(10);
		panel_57.add(txtCA2Cantidad30);

		txtCA2Cantidad31 = new JTextField();
		txtCA2Cantidad31.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA2Cantidad31.setColumns(10);
		panel_57.add(txtCA2Cantidad31);

		txtCA2Cantidad40 = new JTextField();
		txtCA2Cantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA2Cantidad40.setEditable(false);
		txtCA2Cantidad40.setColumns(10);
		panel_57.add(txtCA2Cantidad40);

		txtCA2Cantidad41 = new JTextField();
		txtCA2Cantidad41.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA2Cantidad41.setColumns(10);
		panel_57.add(txtCA2Cantidad41);

		JPanel panel_58 = new JPanel();
		panel_58.setBounds(248, 25, 162, 100);
		panel_49.add(panel_58);
		panel_58.setLayout(new GridLayout(5, 1, 0, 0));

		txtCA2ObsRef0 = new JTextField();
		txtCA2ObsRef0.setColumns(10);
		panel_58.add(txtCA2ObsRef0);

		txtCA2ObsRef1 = new JTextField();
		txtCA2ObsRef1.setColumns(10);
		panel_58.add(txtCA2ObsRef1);

		txtCA2ObsRef2 = new JTextField();
		txtCA2ObsRef2.setColumns(10);
		panel_58.add(txtCA2ObsRef2);

		txtCA2ObsRef3 = new JTextField();
		txtCA2ObsRef3.setColumns(10);
		panel_58.add(txtCA2ObsRef3);

		txtCA2ObsRef4 = new JTextField();
		txtCA2ObsRef4.setColumns(10);
		panel_58.add(txtCA2ObsRef4);

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

		txtFFCantidad00 = new JTextField();
		txtFFCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtFFCantidad00.setEditable(false);
		txtFFCantidad00.setColumns(10);
		panel_52.add(txtFFCantidad00);

		txtFFCantidad01 = new JTextField();
		txtFFCantidad01.setHorizontalAlignment(SwingConstants.CENTER);
		txtFFCantidad01.setColumns(10);
		panel_52.add(txtFFCantidad01);

		txtFFCantidad10 = new JTextField();
		txtFFCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtFFCantidad10.setEditable(false);
		txtFFCantidad10.setColumns(10);
		panel_52.add(txtFFCantidad10);

		txtFFCantidad11 = new JTextField();
		txtFFCantidad11.setHorizontalAlignment(SwingConstants.CENTER);
		txtFFCantidad11.setColumns(10);
		panel_52.add(txtFFCantidad11);

		txtFFCantidad20 = new JTextField();
		txtFFCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtFFCantidad20.setEditable(false);
		txtFFCantidad20.setColumns(10);
		panel_52.add(txtFFCantidad20);

		txtFFCantidad21 = new JTextField();
		txtFFCantidad21.setHorizontalAlignment(SwingConstants.CENTER);
		txtFFCantidad21.setColumns(10);
		panel_52.add(txtFFCantidad21);

		txtFFCantidad30 = new JTextField();
		txtFFCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtFFCantidad30.setEditable(false);
		txtFFCantidad30.setColumns(10);
		panel_52.add(txtFFCantidad30);

		txtFFCantidad31 = new JTextField();
		txtFFCantidad31.setHorizontalAlignment(SwingConstants.CENTER);
		txtFFCantidad31.setColumns(10);
		panel_52.add(txtFFCantidad31);

		JPanel panel_53 = new JPanel();
		panel_53.setBounds(248, 14, 162, 80);
		panel_50.add(panel_53);
		panel_53.setLayout(new GridLayout(4, 1, 0, 0));

		txtFFObsRef0 = new JTextField();
		txtFFObsRef0.setColumns(10);
		panel_53.add(txtFFObsRef0);

		txtFFObsRef1 = new JTextField();
		txtFFObsRef1.setColumns(10);
		panel_53.add(txtFFObsRef1);

		txtFFObsRef2 = new JTextField();
		txtFFObsRef2.setColumns(10);
		panel_53.add(txtFFObsRef2);

		txtFFObsRef3 = new JTextField();
		txtFFObsRef3.setColumns(10);
		panel_53.add(txtFFObsRef3);

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

		txtFPCantidad00 = new JTextField();
		txtFPCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtFPCantidad00.setEditable(false);
		txtFPCantidad00.setColumns(10);
		panel_59.add(txtFPCantidad00);

		txtFPCantidad01 = new JTextField();
		txtFPCantidad01.setHorizontalAlignment(SwingConstants.CENTER);
		txtFPCantidad01.setColumns(10);
		panel_59.add(txtFPCantidad01);

		txtFPCantidad10 = new JTextField();
		txtFPCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtFPCantidad10.setEditable(false);
		txtFPCantidad10.setColumns(10);
		panel_59.add(txtFPCantidad10);

		txtFPCantidad11 = new JTextField();
		txtFPCantidad11.setHorizontalAlignment(SwingConstants.CENTER);
		txtFPCantidad11.setColumns(10);
		panel_59.add(txtFPCantidad11);

		txtFPCantidad20 = new JTextField();
		txtFPCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtFPCantidad20.setEditable(false);
		txtFPCantidad20.setColumns(10);
		panel_59.add(txtFPCantidad20);

		txtFPCantidad21 = new JTextField();
		txtFPCantidad21.setHorizontalAlignment(SwingConstants.CENTER);
		txtFPCantidad21.setColumns(10);
		panel_59.add(txtFPCantidad21);

		JPanel panel_60 = new JPanel();
		panel_60.setBounds(248, 14, 162, 60);
		panel_54.add(panel_60);
		panel_60.setLayout(new GridLayout(3, 1, 0, 0));

		txtFPObsRef0 = new JTextField();
		txtFPObsRef0.setColumns(10);
		panel_60.add(txtFPObsRef0);

		txtFPObsRef1 = new JTextField();
		txtFPObsRef1.setColumns(10);
		panel_60.add(txtFPObsRef1);

		txtFPObsRef2 = new JTextField();
		txtFPObsRef2.setColumns(10);
		panel_60.add(txtFPObsRef2);

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

		txtFLCantidad00 = new JTextField();
		txtFLCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtFLCantidad00.setEditable(false);
		txtFLCantidad00.setColumns(10);
		panel_63.add(txtFLCantidad00);

		txtFLCantidad01 = new JTextField();
		txtFLCantidad01.setHorizontalAlignment(SwingConstants.CENTER);
		txtFLCantidad01.setColumns(10);
		panel_63.add(txtFLCantidad01);

		JPanel panel_64 = new JPanel();
		panel_64.setBounds(248, 14, 162, 20);
		panel_61.add(panel_64);
		panel_64.setLayout(new GridLayout(1, 1, 0, 0));

		txtFLObsRef0 = new JTextField();
		txtFLObsRef0.setColumns(10);
		panel_64.add(txtFLObsRef0);

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

		JPanel panel_65 = new JPanel();
		panel_65.setLayout(null);
		panel_65.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_65.setBounds(854, 409, 414, 96);
		panelLab1.add(panel_65);

		JPanel panel_66 = new JPanel();
		panel_66.setBounds(2, 14, 191, 80);
		panel_65.add(panel_66);
		panel_66.setLayout(new GridLayout(4, 1, 0, 0));

		JLabel lblPanelesEpsParedxxx = new JLabel("Paneles EPS pared(1x3x0,09x0,09 m)");
		lblPanelesEpsParedxxx.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPanelesEpsParedxxx.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_66.add(lblPanelesEpsParedxxx);

		JLabel lblPanelesEpsParedxx_1 = new JLabel("Paneles EPS pared(1x0,90x0,90 m)");
		lblPanelesEpsParedxx_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPanelesEpsParedxx_1.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_66.add(lblPanelesEpsParedxx_1);

		JLabel lblPanelesEpsParedxx_2 = new JLabel("Paneles EPS pared(1x1,10x0,09 m)");
		lblPanelesEpsParedxx_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPanelesEpsParedxx_2.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_66.add(lblPanelesEpsParedxx_2);

		JLabel lblPanelesEpsParedxx_3 = new JLabel("Paneles EPS pared(1x0,80x0,09 m)");
		lblPanelesEpsParedxx_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPanelesEpsParedxx_3.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_66.add(lblPanelesEpsParedxx_3);

		JPanel panel_67 = new JPanel();
		panel_67.setBounds(195, 14, 50, 80);
		panel_65.add(panel_67);
		panel_67.setLayout(new GridLayout(4, 2, 0, 0));

		txtFF2Cantidad00 = new JTextField();
		txtFF2Cantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtFF2Cantidad00.setEditable(false);
		txtFF2Cantidad00.setColumns(10);
		panel_67.add(txtFF2Cantidad00);

		txtFF2Cantidad01 = new JTextField();
		txtFF2Cantidad01.setHorizontalAlignment(SwingConstants.CENTER);
		txtFF2Cantidad01.setColumns(10);
		panel_67.add(txtFF2Cantidad01);

		txtFF2Cantidad10 = new JTextField();
		txtFF2Cantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtFF2Cantidad10.setEditable(false);
		txtFF2Cantidad10.setColumns(10);
		panel_67.add(txtFF2Cantidad10);

		txtFF2Cantidad11 = new JTextField();
		txtFF2Cantidad11.setHorizontalAlignment(SwingConstants.CENTER);
		txtFF2Cantidad11.setColumns(10);
		panel_67.add(txtFF2Cantidad11);

		txtFF2Cantidad20 = new JTextField();
		txtFF2Cantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtFF2Cantidad20.setEditable(false);
		txtFF2Cantidad20.setColumns(10);
		panel_67.add(txtFF2Cantidad20);

		txtFF2Cantidad21 = new JTextField();
		txtFF2Cantidad21.setHorizontalAlignment(SwingConstants.CENTER);
		txtFF2Cantidad21.setColumns(10);
		panel_67.add(txtFF2Cantidad21);

		txtFF2Cantidad30 = new JTextField();
		txtFF2Cantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtFF2Cantidad30.setEditable(false);
		txtFF2Cantidad30.setColumns(10);
		panel_67.add(txtFF2Cantidad30);

		txtFF2Cantidad31 = new JTextField();
		txtFF2Cantidad31.setHorizontalAlignment(SwingConstants.CENTER);
		txtFF2Cantidad31.setColumns(10);
		panel_67.add(txtFF2Cantidad31);

		JPanel panel_68 = new JPanel();
		panel_68.setBounds(248, 14, 162, 80);
		panel_65.add(panel_68);
		panel_68.setLayout(new GridLayout(4, 1, 0, 0));

		txtFF2ObsRef0 = new JTextField();
		txtFF2ObsRef0.setColumns(10);
		panel_68.add(txtFF2ObsRef0);

		txtFF2ObsRef1 = new JTextField();
		txtFF2ObsRef1.setColumns(10);
		panel_68.add(txtFF2ObsRef1);

		txtFF2ObsRef2 = new JTextField();
		txtFF2ObsRef2.setColumns(10);
		panel_68.add(txtFF2ObsRef2);

		txtFF2ObsRef3 = new JTextField();
		txtFF2ObsRef3.setColumns(10);
		panel_68.add(txtFF2ObsRef3);

		JLabel label_52 = new JLabel("Cantidadidad");
		label_52.setHorizontalAlignment(SwingConstants.LEFT);
		label_52.setFont(new Font("Arial", Font.BOLD, 11));
		label_52.setBounds(195, 0, 60, 14);
		panel_65.add(label_52);

		JLabel label_53 = new JLabel("Observación/Referencia");
		label_53.setHorizontalAlignment(SwingConstants.LEFT);
		label_53.setFont(new Font("Arial", Font.BOLD, 11));
		label_53.setBounds(250, 0, 190, 14);
		panel_65.add(label_53);

		JLabel label_54 = new JLabel("FACHADA FRONTAL");
		label_54.setHorizontalAlignment(SwingConstants.CENTER);
		label_54.setFont(new Font("Arial", Font.BOLD, 11));
		label_54.setBounds(2, 0, 129, 14);
		panel_65.add(label_54);

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

		txtCECantidad00 = new JTextField();
		txtCECantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad00.setEditable(false);
		txtCECantidad00.setColumns(10);
		panel_77.add(txtCECantidad00);

		txtCECantidad01 = new JTextField();
		txtCECantidad01.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad01.setColumns(10);
		panel_77.add(txtCECantidad01);

		txtCECantidad10 = new JTextField();
		txtCECantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad10.setEditable(false);
		txtCECantidad10.setColumns(10);
		panel_77.add(txtCECantidad10);

		txtCECantidad11 = new JTextField();
		txtCECantidad11.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad11.setColumns(10);
		panel_77.add(txtCECantidad11);

		txtCECantidad20 = new JTextField();
		txtCECantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad20.setEditable(false);
		txtCECantidad20.setColumns(10);
		panel_77.add(txtCECantidad20);

		txtCECantidad21 = new JTextField();
		txtCECantidad21.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad21.setColumns(10);
		panel_77.add(txtCECantidad21);

		txtCECantidad30 = new JTextField();
		txtCECantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad30.setEditable(false);
		txtCECantidad30.setColumns(10);
		panel_77.add(txtCECantidad30);

		txtCECantidad31 = new JTextField();
		txtCECantidad31.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad31.setColumns(10);
		panel_77.add(txtCECantidad31);

		txtCECantidad40 = new JTextField();
		txtCECantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad40.setEditable(false);
		txtCECantidad40.setColumns(10);
		panel_77.add(txtCECantidad40);

		txtCECantidad41 = new JTextField();
		txtCECantidad41.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad41.setColumns(10);
		panel_77.add(txtCECantidad41);

		txtCECantidad50 = new JTextField();
		txtCECantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad50.setEditable(false);
		txtCECantidad50.setColumns(10);
		panel_77.add(txtCECantidad50);

		txtCECantidad51 = new JTextField();
		txtCECantidad51.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad51.setColumns(10);
		panel_77.add(txtCECantidad51);

		txtCECantidad60 = new JTextField();
		txtCECantidad60.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad60.setEditable(false);
		txtCECantidad60.setColumns(10);
		panel_77.add(txtCECantidad60);

		txtCECantidad61 = new JTextField();
		txtCECantidad61.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad61.setColumns(10);
		panel_77.add(txtCECantidad61);

		txtCECantidad70 = new JTextField();
		txtCECantidad70.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad70.setEditable(false);
		txtCECantidad70.setColumns(10);
		panel_77.add(txtCECantidad70);

		txtCECantidad71 = new JTextField();
		txtCECantidad71.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad71.setColumns(10);
		panel_77.add(txtCECantidad71);

		txtCECantidad80 = new JTextField();
		txtCECantidad80.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad80.setEditable(false);
		txtCECantidad80.setColumns(10);
		panel_77.add(txtCECantidad80);

		txtCECantidad81 = new JTextField();
		txtCECantidad81.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad81.setColumns(10);
		panel_77.add(txtCECantidad81);

		txtCECantidad90 = new JTextField();
		txtCECantidad90.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad90.setEditable(false);
		txtCECantidad90.setColumns(10);
		panel_77.add(txtCECantidad90);

		txtCECantidad91 = new JTextField();
		txtCECantidad91.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad91.setColumns(10);
		panel_77.add(txtCECantidad91);

		txtCECantidad100 = new JTextField();
		txtCECantidad100.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad100.setEditable(false);
		txtCECantidad100.setColumns(10);
		panel_77.add(txtCECantidad100);

		txtCECantidad101 = new JTextField();
		txtCECantidad101.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad101.setColumns(10);
		panel_77.add(txtCECantidad101);

		txtCECantidad110 = new JTextField();
		txtCECantidad110.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad110.setEditable(false);
		txtCECantidad110.setColumns(10);
		panel_77.add(txtCECantidad110);

		txtCECantidad111 = new JTextField();
		txtCECantidad111.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad111.setColumns(10);
		panel_77.add(txtCECantidad111);

		JPanel panel_78 = new JPanel();
		panel_78.setBounds(439, 14, 300, 240);
		panel_75.add(panel_78);
		panel_78.setLayout(new GridLayout(12, 1, 0, 0));

		txtCEObsRef0 = new JTextField();
		txtCEObsRef0.setColumns(10);
		panel_78.add(txtCEObsRef0);

		txtCEObsRef1 = new JTextField();
		txtCEObsRef1.setColumns(10);
		panel_78.add(txtCEObsRef1);

		txtCEObsRef2 = new JTextField();
		txtCEObsRef2.setColumns(10);
		panel_78.add(txtCEObsRef2);

		txtCEObsRef3 = new JTextField();
		txtCEObsRef3.setColumns(10);
		panel_78.add(txtCEObsRef3);

		txtCEObsRef4 = new JTextField();
		txtCEObsRef4.setColumns(10);
		panel_78.add(txtCEObsRef4);

		txtCEObsRef5 = new JTextField();
		txtCEObsRef5.setColumns(10);
		panel_78.add(txtCEObsRef5);

		txtCEObsRef6 = new JTextField();
		txtCEObsRef6.setColumns(10);
		panel_78.add(txtCEObsRef6);

		txtCEObsRef7 = new JTextField();
		txtCEObsRef7.setColumns(10);
		panel_78.add(txtCEObsRef7);

		txtCEObsRef8 = new JTextField();
		txtCEObsRef8.setColumns(10);
		panel_78.add(txtCEObsRef8);

		txtCEObsRef9 = new JTextField();
		txtCEObsRef9.setColumns(10);
		panel_78.add(txtCEObsRef9);

		txtCEObsRef10 = new JTextField();
		txtCEObsRef10.setColumns(10);
		panel_78.add(txtCEObsRef10);

		txtCEObsRef11 = new JTextField();
		txtCEObsRef11.setColumns(10);
		panel_78.add(txtCEObsRef11);

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
		cabecera.getBtnRegistrar().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				TInformacionObligatoria infoObl = cargarInfoObligatoria(infoObligatoria);
				if (validarInfo(infoObl)) {
					ServicioFichaMA srvFichaMA = new ComponenteFichaMA();
					ServicioInfoObligatoria srvInfoObl = new ComponenteInfoObligatoria();
					ServicioCabecera srvTempCabecera = new ComponenteCabecera();

					infoObl.settCabe(srvTempCabecera.buscarProyecto(gettCabecera().getCNombreProyecto()));
					srvInfoObl.crear(infoObl);
					infoObl.setIoSerial(srvInfoObl.serialInfoOblMax());

					srvFichaMA.insertarFormulario(cargarFicha(infoObl));
				} else {
					JOptionPane.showMessageDialog(null, "Datos obligatorios");
				}
			}

		});

	}

	private LinkedList<LinkedList<TdetalleFicha>> cargarFicha(TInformacionObligatoria infoObligatoria) {
		ServicioFichaMA srvFichaMA = new ComponenteFichaMA();

		TCabecera cabecera = gettCabecera();
		Integer updateFicha = srvFichaMA.buscarUpdateFicha();

		LinkedList<TdetalleFicha> listaKE = new LinkedList<>();
		TGrupo grupoTmp = srvFichaMA.buscarGrupo("Kit eléctrico");
		listaKE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtKECantidad00.getText()), Integer.parseInt(txtKECantidad01.getText()),
				txtKEObsRef0.getText(), updateFicha));
		listaKE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtKECantidad10.getText()), Integer.parseInt(txtKECantidad11.getText()),
				txtKEObsRef1.getText(), updateFicha));
		listaKE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtKECantidad20.getText()), Integer.parseInt(txtKECantidad21.getText()),
				txtKEObsRef2.getText(), updateFicha));
		listaKE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtKECantidad30.getText()), Integer.parseInt(txtKECantidad31.getText()),
				txtKEObsRef3.getText(), updateFicha));

		LinkedList<TdetalleFicha> listaKH = new LinkedList<>();
		grupoTmp = srvFichaMA.buscarGrupo("Kit hidrosanitario");
		listaKH.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtKHCantidad00.getText()), Integer.parseInt(txtKHCantidad01.getText()),
				txtKHObsRef0.getText(), updateFicha));

		LinkedList<TdetalleFicha> listaKAL = new LinkedList<>();
		grupoTmp = srvFichaMA.buscarGrupo("Kit agua lluvia");
		listaKAL.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtKALCantidad00.getText()), Integer.parseInt(txtKALCantidad01.getText()),
				txtKALObsRef0.getText(), updateFicha));
		listaKAL.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtKALCantidad10.getText()), Integer.parseInt(txtKALCantidad11.getText()),
				txtKALObsRef1.getText(), updateFicha));
		listaKAL.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtKALCantidad20.getText()), Integer.parseInt(txtKALCantidad21.getText()),
				txtKALObsRef2.getText(), updateFicha));
		listaKAL.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtKALCantidad30.getText()), Integer.parseInt(txtKALCantidad31.getText()),
				txtKALObsRef3.getText(), updateFicha));
		listaKAL.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtKALCantidad40.getText()), Integer.parseInt(txtKALCantidad41.getText()),
				txtKALObsRef4.getText(), updateFicha));

		LinkedList<TdetalleFicha> listaKAP1 = new LinkedList<TdetalleFicha>();
		grupoTmp = srvFichaMA.buscarGrupo("Kit agua potable");
		listaKAP1.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtKAP1Cantidad00.getText()), Integer.parseInt(txtKAP1Cantidad01.getText()),
				txtKAP1ObsRef0.getText(), updateFicha));
		listaKAP1.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtKAP1Cantidad10.getText()), Integer.parseInt(txtKAP1Cantidad11.getText()),
				txtKAP1ObsRef1.getText(), updateFicha));
		listaKAP1.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtKAP1Cantidad20.getText()), Integer.parseInt(txtKAP1Cantidad21.getText()),
				txtKAP1ObsRef2.getText(), updateFicha));

		LinkedList<TdetalleFicha> listaKAP2 = new LinkedList<TdetalleFicha>();
		grupoTmp = srvFichaMA.buscarGrupo("Kit agua potable");
		listaKAP2.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtKAP2Cantidad00.getText()), Integer.parseInt(txtKAP2Cantidad01.getText()),
				txtKAP2ObsRef0.getText(), updateFicha));
		listaKAP2.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtKAP2Cantidad10.getText()), Integer.parseInt(txtKAP2Cantidad11.getText()),
				txtKAP2ObsRef1.getText(), updateFicha));

		LinkedList<TdetalleFicha> listaKAR = new LinkedList<TdetalleFicha>();
		grupoTmp = srvFichaMA.buscarGrupo("Kit agua residual");
		listaKAR.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtKARCantidad00.getText()), Integer.parseInt(txtKARCantidad01.getText()),
				txtKARObsRef0.getText(), updateFicha));
		listaKAR.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtKARCantidad10.getText()), Integer.parseInt(txtKARCantidad11.getText()),
				txtKARObsRef1.getText(), updateFicha));
		listaKAR.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtKARCantidad20.getText()), Integer.parseInt(txtKARCantidad21.getText()),
				txtKARObsRef2.getText(), updateFicha));
		listaKAR.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtKARCantidad30.getText()), Integer.parseInt(txtKARCantidad31.getText()),
				txtKARObsRef3.getText(), updateFicha));
		listaKAR.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtKARCantidad40.getText()), Integer.parseInt(txtKARCantidad41.getText()),
				txtKARObsRef4.getText(), updateFicha));
		listaKAR.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtKARCantidad50.getText()), Integer.parseInt(txtKARCantidad51.getText()),
				txtKARObsRef5.getText(), updateFicha));
		listaKAR.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtKARCantidad60.getText()), Integer.parseInt(txtKARCantidad61.getText()),
				txtKARObsRef6.getText(), updateFicha));

		LinkedList<TdetalleFicha> listaCA1 = new LinkedList<TdetalleFicha>();
		grupoTmp = srvFichaMA.buscarGrupo("Componente arquitectónico");
		listaCA1.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCA1Cantidad00.getText()), Integer.parseInt(txtCA1Cantidad01.getText()),
				txtCA1ObsRef0.getText(), updateFicha));
		listaCA1.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCA1Cantidad10.getText()), Integer.parseInt(txtCA1Cantidad11.getText()),
				txtCA1ObsRef1.getText(), updateFicha));
		listaCA1.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCA1Cantidad20.getText()), Integer.parseInt(txtCA1Cantidad21.getText()),
				txtCA1ObsRef2.getText(), updateFicha));
		listaCA1.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCA1Cantidad30.getText()), Integer.parseInt(txtCA1Cantidad31.getText()),
				txtCA1ObsRef3.getText(), updateFicha));

		LinkedList<TdetalleFicha> listaCA2 = new LinkedList<TdetalleFicha>();
		grupoTmp = srvFichaMA.buscarGrupo("Componente arquitectónico");
		listaCA2.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCA2Cantidad00.getText()), Integer.parseInt(txtCA2Cantidad01.getText()),
				txtCA2ObsRef0.getText(), updateFicha));
		listaCA2.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCA2Cantidad10.getText()), Integer.parseInt(txtCA2Cantidad11.getText()),
				txtCA2ObsRef1.getText(), updateFicha));
		listaCA2.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCA2Cantidad20.getText()), Integer.parseInt(txtCA2Cantidad21.getText()),
				txtCA2ObsRef2.getText(), updateFicha));
		listaCA2.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCA2Cantidad30.getText()), Integer.parseInt(txtCA2Cantidad31.getText()),
				txtCA2ObsRef3.getText(), updateFicha));
		listaCA2.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCA2Cantidad40.getText()), Integer.parseInt(txtCA2Cantidad41.getText()),
				txtCA2ObsRef4.getText(), updateFicha));

		LinkedList<TdetalleFicha> listaFF = new LinkedList<TdetalleFicha>();
		grupoTmp = srvFichaMA.buscarGrupo("Fachada frontal");
		listaFF.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtFFCantidad00.getText()), Integer.parseInt(txtFFCantidad01.getText()),
				txtFFObsRef0.getText(), updateFicha));
		listaFF.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtFFCantidad10.getText()), Integer.parseInt(txtFFCantidad11.getText()),
				txtFFObsRef1.getText(), updateFicha));
		listaFF.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtFFCantidad20.getText()), Integer.parseInt(txtFFCantidad21.getText()),
				txtFFObsRef2.getText(), updateFicha));
		listaFF.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtFFCantidad30.getText()), Integer.parseInt(txtFFCantidad31.getText()),
				txtFFObsRef3.getText(), updateFicha));

		LinkedList<TdetalleFicha> listaFP = new LinkedList<TdetalleFicha>();
		grupoTmp = srvFichaMA.buscarGrupo("Fachada posterior");
		listaFP.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtFPCantidad00.getText()), Integer.parseInt(txtFPCantidad01.getText()),
				txtFPObsRef0.getText(), updateFicha));
		listaFP.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtFPCantidad10.getText()), Integer.parseInt(txtFPCantidad11.getText()),
				txtFPObsRef1.getText(), updateFicha));
		listaFP.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtFPCantidad20.getText()), Integer.parseInt(txtFPCantidad21.getText()),
				txtFPObsRef2.getText(), updateFicha));

		LinkedList<TdetalleFicha> listaFL = new LinkedList<TdetalleFicha>();
		grupoTmp = srvFichaMA.buscarGrupo("Fachada lateral");
		listaFL.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtFLCantidad00.getText()), Integer.parseInt(txtFLCantidad01.getText()),
				txtFLObsRef0.getText(), updateFicha));

		LinkedList<TdetalleFicha> listaFF2 = new LinkedList<TdetalleFicha>();
		grupoTmp = srvFichaMA.buscarGrupo("Fachada frontal");
		listaFF2.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtFF2Cantidad00.getText()), Integer.parseInt(txtFF2Cantidad01.getText()),
				txtFF2ObsRef0.getText(), updateFicha));
		listaFF2.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtFF2Cantidad10.getText()), Integer.parseInt(txtFF2Cantidad11.getText()),
				txtFF2ObsRef1.getText(), updateFicha));
		listaFF2.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtFF2Cantidad20.getText()), Integer.parseInt(txtFF2Cantidad21.getText()),
				txtFF2ObsRef2.getText(), updateFicha));
		listaFF2.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtFF2Cantidad30.getText()), Integer.parseInt(txtFF2Cantidad31.getText()),
				txtFF2ObsRef3.getText(), updateFicha));

		LinkedList<TdetalleFicha> listaCE = new LinkedList<TdetalleFicha>();
		grupoTmp = srvFichaMA.buscarGrupo("Componente estructural");
		listaCE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad00.getText()), Integer.parseInt(txtCECantidad01.getText()),
				txtCEObsRef0.getText(), updateFicha));
		listaCE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad10.getText()), Integer.parseInt(txtCECantidad11.getText()),
				txtCEObsRef1.getText(), updateFicha));
		listaCE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad20.getText()), Integer.parseInt(txtCECantidad21.getText()),
				txtCEObsRef2.getText(), updateFicha));
		listaCE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad30.getText()), Integer.parseInt(txtCECantidad31.getText()),
				txtCEObsRef3.getText(), updateFicha));
		listaCE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad40.getText()), Integer.parseInt(txtCECantidad41.getText()),
				txtCEObsRef4.getText(), updateFicha));
		listaCE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad50.getText()), Integer.parseInt(txtCECantidad51.getText()),
				txtCEObsRef5.getText(), updateFicha));
		listaCE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad60.getText()), Integer.parseInt(txtCECantidad61.getText()),
				txtCEObsRef6.getText(), updateFicha));
		listaCE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad70.getText()), Integer.parseInt(txtCECantidad71.getText()),
				txtCEObsRef7.getText(), updateFicha));
		listaCE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad80.getText()), Integer.parseInt(txtCECantidad81.getText()),
				txtCEObsRef8.getText(), updateFicha));
		listaCE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad90.getText()), Integer.parseInt(txtCECantidad91.getText()),
				txtCEObsRef9.getText(), updateFicha));
		listaCE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad100.getText()), Integer.parseInt(txtCECantidad101.getText()),
				txtCEObsRef10.getText(), updateFicha));
		listaCE.add(new TdetalleFicha(cabecera, infoObligatoria, grupoTmp, ficha, null,
				Integer.parseInt(txtCECantidad110.getText()), Integer.parseInt(txtCECantidad111.getText()),
				txtCEObsRef11.getText(), updateFicha));

		LinkedList<LinkedList<TdetalleFicha>> listaFormulario = new LinkedList<LinkedList<TdetalleFicha>>();
		listaFormulario.add(listaKE);
		listaFormulario.add(listaKH);
		listaFormulario.add(listaKAL);
		listaFormulario.add(listaKAP1);
		listaFormulario.add(listaKAP2);
		listaFormulario.add(listaKAR);
		listaFormulario.add(listaCA1);
		listaFormulario.add(listaCA2);
		listaFormulario.add(listaFF);
		listaFormulario.add(listaFP);
		listaFormulario.add(listaFL);
		listaFormulario.add(listaFF2);
		listaFormulario.add(listaCE);

		return listaFormulario;
	}
}
