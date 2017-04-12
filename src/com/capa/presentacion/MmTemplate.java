package com.capa.presentacion;

import static com.capa.util.Utilitarios.gettCabecera;
import static com.capa.util.Utilitarios.llenarCabecera;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.capa.datos.TCabecera;
import com.capa.datos.TdetalleFicha;
import com.capa.negocios.ComponenteCabecera;
import com.capa.negocios.ComponenteFichaMA;
import com.capa.negocios.ServicioCabecera;
import com.capa.negocios.ServicioFichaMA;

public class MmTemplate extends JFrame {

	private static final long serialVersionUID = -3891089127852241756L;
	private JPanel contentPane;
	private JTextField txtKECant00;
	private JTextField txtKECant01;
	private JTextField txtKECant10;
	private JTextField txtKECant11;
	private JTextField txtKECant20;
	private JTextField txtKECant21;
	private JTextField txtKECant30;
	private JTextField txtKECant31;
	private JTextField txtKEObsRef0;
	private JTextField txtKEObsRef1;
	private JTextField txtKEObsRef2;
	private JTextField txtKEObsRef3;
	private JTextField txtKHObsRef0;
	private JTextField txtKHCant00;
	private JTextField txtKHCant01;
	private JTextField txtKALCant00;
	private JTextField txtKALCant01;
	private JTextField txtKALObsRef0;

	private JTextField txtKALCant10;
	private JTextField txtKALCant11;

	private JTextField txtKALObsRef1;

	private JTextField txtKALCant20;
	private JTextField txtKALCant21;
	private JTextField txtKALCant30;
	private JTextField txtKALCant31;

	private JTextField txtKALObsRef2;
	private JTextField txtKALObsRef3;

	private JLabel lblKitParaConexin;

	private JTextField txtKALCant40;
	private JTextField txtKALCant41;
	private JTextField txtKALObsRef4;
	private JTextField txtKAP1Cant00;
	private JTextField txtKAP1Cant01;
	private JTextField txtKAP1ObsRef0;
	private JTextField txtKAP1Cant10;
	private JTextField txtKAP1Cant11;
	private JTextField txtKAP1Cant20;
	private JTextField txtKAP1Cant21;
	private JTextField txtKAP1ObsRef1;
	private JTextField txtKAP1ObsRef2;
	private JTextField txtKARCant00;
	private JTextField txtKARCant01;
	private JTextField txtKARObsRef0;
	private JTextField txtKARCant10;
	private JTextField txtKARCant11;
	private JPanel panel_45;
	private JTextField txtKARObsRef1;
	private JTextField txtKARCant20;
	private JTextField txtKARCant21;
	private JTextField txtKARObsRef2;
	private JTextField txtKARCant30;
	private JTextField txtKARCant31;
	private JTextField txtKARCant40;
	private JTextField txtKARCant41;
	private JTextField txtKARObsRef3;
	private JTextField txtKARObsRef4;
	private JTextField txtKARCant50;
	private JTextField txtKARCant51;
	private JTextField txtKARObsRef5;
	private JTextField txtKARCant60;
	private JTextField txtKARCant61;
	private JTextField txtKARObsRef6;
	private JTextField txtCA2Cant00;
	private JTextField txtCA2Cant01;
	private JTextField txtCA2Cant10;
	private JTextField txtCA2Cant11;
	private JTextField txtCA2Cant20;
	private JTextField txtCA2Cant21;
	private JTextField txtCA2Cant30;
	private JTextField txtCA2Cant31;
	private JTextField txtCA2ObsRef0;
	private JTextField txtCA2ObsRef1;
	private JTextField txtCA2ObsRef2;
	private JTextField txtCA2ObsRef4;
	private JTextField txtCA2Cant40;
	private JTextField txtCA2Cant41;
	private JTextField txtCA2ObsRef3;
	private JTextField txtCECant00;
	private JTextField txtCECant01;
	private JTextField txtCECant10;
	private JTextField txtCECant11;
	private JTextField txtCECant20;
	private JTextField txtCECant21;
	private JTextField txtCECant30;
	private JTextField txtCECant31;
	private JTextField txtCEObsRef0;
	private JTextField txtCEObsRef1;
	private JTextField txtCEObsRef2;
	private JTextField txtCEObsRef11;
	private JTextField txtCECant40;
	private JTextField txtCECant41;
	private JTextField txtCECant50;
	private JTextField txtCECant51;
	private JTextField txtCECant60;
	private JTextField txtCECant61;
	private JTextField txtCECant70;
	private JTextField txtCECant71;
	private JTextField txtCECant80;
	private JTextField txtCECant81;
	private JTextField txtCECant90;
	private JTextField txtCECant91;
	private JTextField txtCECant100;
	private JTextField txtCECant101;
	private JTextField txtCECant111;
	private JTextField txtCECant110;
	private JTextField txtCEObsRef3;
	private JTextField txtCEObsRef4;
	private JTextField txtCEObsRef5;
	private JTextField txtCEObsRef6;
	private JTextField txtCEObsRef7;
	private JTextField txtCEObsRef8;
	private JTextField txtCEObsRef9;
	private JTextField txtCEObsRef10;
	private JTextField txtKAP2Cant00;
	private JTextField txtKAP2Cant01;
	private JTextField txtKAP2ObsRef0;
	private JTextField txtKAP2Cant10;
	private JTextField txtKAP2Cant11;
	private JTextField txtKAP2ObsRef1;
	private JTextField txtCA1Cant00;
	private JTextField txtCA1Cant01;
	private JTextField txtCA1Cant10;
	private JTextField txtCA1Cant11;
	private JTextField txtCA1Cant20;
	private JTextField txtCA1Cant21;
	private JTextField txtCA1ObsRef0;
	private JTextField txtCA1ObsRef1;
	private JTextField txtCA1ObsRef2;
	private JTextField txtCA1Cant30;
	private JTextField txtCA1Cant31;
	private JTextField txtCA1ObsRef3;
	private JTextField txtFFCant00;
	private JTextField txtFFCant01;
	private JTextField txtFFCant10;
	private JTextField txtFFCant11;
	private JTextField txtFFCant20;
	private JTextField txtFFCant21;
	private JTextField txtFFCant30;
	private JTextField txtFFCant31;
	private JTextField txtFFObsRef0;
	private JTextField txtFFObsRef1;
	private JTextField txtFFObsRef2;
	private JTextField txtFFObsRef3;
	private JTextField txtFPCant00;
	private JTextField txtFPCant01;
	private JTextField txtFPCant10;
	private JTextField txtFPCant11;
	private JTextField txtFPCant20;
	private JTextField txtFPCant21;
	private JTextField txtFPObsRef0;
	private JTextField txtFPObsRef1;
	private JTextField txtFPObsRef2;
	private JTextField txtFLCant00;
	private JTextField txtFLCant01;
	private JTextField txtFLObsRef0;
	private JTextField txtFF2Cant00;
	private JTextField txtFF2Cant01;
	private JTextField txtFF2Cant10;
	private JTextField txtFF2Cant11;
	private JTextField txtFF2Cant20;
	private JTextField txtFF2Cant21;
	private JTextField txtFF2Cant30;
	private JTextField txtFF2Cant31;
	private JTextField txtFF2ObsRef0;
	private JTextField txtFF2ObsRef1;
	private JTextField txtFF2ObsRef2;
	private JTextField txtFF2ObsRef3;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MmTemplate frame = new MmTemplate("Template");
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MmTemplate(String laboratorio) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1311, 706);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());
		contentPane.setLayout(null);
		setTitle("MM-" + laboratorio);

		llenarCabecera(cabecera);
		cabecera.getBtnRegistrar().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cargarListas();
			}

		});

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

		JPanel pnlCantidad00 = new JPanel();
		pnlCantidad00.setBounds(195, 14, 50, 80);
		pnlKitElectrico.add(pnlCantidad00);
		pnlCantidad00.setLayout(new GridLayout(4, 2, 0, 0));

		txtKECant00 = new JTextField();
		txtKECant00.setEditable(false);
		txtKECant00.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECant00.setColumns(10);
		pnlCantidad00.add(txtKECant00);

		txtKECant01 = new JTextField();
		txtKECant01.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECant01.setColumns(10);
		pnlCantidad00.add(txtKECant01);

		txtKECant10 = new JTextField();
		txtKECant10.setEditable(false);
		txtKECant10.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECant10.setColumns(10);
		pnlCantidad00.add(txtKECant10);

		txtKECant11 = new JTextField();
		txtKECant11.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECant11.setColumns(10);
		pnlCantidad00.add(txtKECant11);

		txtKECant20 = new JTextField();
		txtKECant20.setEditable(false);
		txtKECant20.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECant20.setColumns(10);
		pnlCantidad00.add(txtKECant20);

		txtKECant21 = new JTextField();
		txtKECant21.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECant21.setColumns(10);
		pnlCantidad00.add(txtKECant21);

		txtKECant30 = new JTextField();
		txtKECant30.setEditable(false);
		txtKECant30.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECant30.setColumns(10);
		pnlCantidad00.add(txtKECant30);

		txtKECant31 = new JTextField();
		txtKECant31.setHorizontalAlignment(SwingConstants.CENTER);
		txtKECant31.setColumns(10);
		pnlCantidad00.add(txtKECant31);

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

		JLabel label_24 = new JLabel("Cantidad");
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

		txtKHCant00 = new JTextField();
		txtKHCant00.setEditable(false);
		txtKHCant00.setColumns(10);
		panel_2.add(txtKHCant00);

		txtKHCant01 = new JTextField();
		txtKHCant01.setColumns(10);
		panel_2.add(txtKHCant01);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(248, 14, 162, 20);
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 1, 0, 0));

		txtKHObsRef0 = new JTextField();
		txtKHObsRef0.setColumns(10);
		panel_3.add(txtKHObsRef0);

		JLabel label_8 = new JLabel("Cantidad");
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

		txtKALCant00 = new JTextField();
		txtKALCant00.setEditable(false);
		txtKALCant00.setColumns(10);
		panel_6.add(txtKALCant00);

		txtKALCant01 = new JTextField();
		txtKALCant01.setColumns(10);
		panel_6.add(txtKALCant01);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(248, 14, 162, 20);
		panel_4.add(panel_7);
		panel_7.setLayout(new GridLayout(1, 1, 0, 0));

		txtKALObsRef0 = new JTextField();
		txtKALObsRef0.setColumns(10);
		panel_7.add(txtKALObsRef0);

		JLabel label_1 = new JLabel("Cantidad");
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

		txtKALCant10 = new JTextField();
		txtKALCant10.setEditable(false);
		txtKALCant10.setColumns(10);
		panel_10.add(txtKALCant10);

		txtKALCant11 = new JTextField();
		txtKALCant11.setColumns(10);
		panel_10.add(txtKALCant11);

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

		txtKALCant20 = new JTextField();
		txtKALCant20.setEditable(false);
		txtKALCant20.setColumns(10);
		panel_12.add(txtKALCant20);

		txtKALCant21 = new JTextField();
		txtKALCant21.setColumns(10);
		panel_12.add(txtKALCant21);

		txtKALCant30 = new JTextField();
		txtKALCant30.setEditable(false);
		txtKALCant30.setColumns(10);
		panel_12.add(txtKALCant30);

		txtKALCant31 = new JTextField();
		txtKALCant31.setColumns(10);
		panel_12.add(txtKALCant31);

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

		txtKALCant40 = new JTextField();
		txtKALCant40.setEditable(false);
		txtKALCant40.setColumns(10);
		panel_15.add(txtKALCant40);

		txtKALCant41 = new JTextField();
		txtKALCant41.setColumns(10);
		panel_15.add(txtKALCant41);

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

		txtKAP1Cant00 = new JTextField();
		txtKAP1Cant00.setEditable(false);
		txtKAP1Cant00.setColumns(10);
		panel_19.add(txtKAP1Cant00);

		txtKAP1Cant01 = new JTextField();
		txtKAP1Cant01.setColumns(10);
		panel_19.add(txtKAP1Cant01);

		JPanel panel_20 = new JPanel();
		panel_20.setBounds(248, 47, 162, 20);
		panel_17.add(panel_20);
		panel_20.setLayout(new GridLayout(1, 1, 0, 0));

		txtKAP1ObsRef0 = new JTextField();
		txtKAP1ObsRef0.setColumns(10);
		panel_20.add(txtKAP1ObsRef0);

		JLabel label_26 = new JLabel("Cantidad");
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

		txtKAP1Cant10 = new JTextField();
		txtKAP1Cant10.setEditable(false);
		txtKAP1Cant10.setColumns(10);
		panel_22.add(txtKAP1Cant10);

		txtKAP1Cant11 = new JTextField();
		txtKAP1Cant11.setColumns(10);
		panel_22.add(txtKAP1Cant11);

		txtKAP1Cant20 = new JTextField();
		txtKAP1Cant20.setEditable(false);
		txtKAP1Cant20.setColumns(10);
		panel_22.add(txtKAP1Cant20);

		txtKAP1Cant21 = new JTextField();
		txtKAP1Cant21.setColumns(10);
		panel_22.add(txtKAP1Cant21);

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

		JLabel label_21 = new JLabel("Cantidad");
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

		txtKAP2Cant00 = new JTextField();
		txtKAP2Cant00.setEditable(false);
		txtKAP2Cant00.setColumns(10);
		panel_87.add(txtKAP2Cant00);

		txtKAP2Cant01 = new JTextField();
		txtKAP2Cant01.setColumns(10);
		panel_87.add(txtKAP2Cant01);

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

		txtKAP2Cant10 = new JTextField();
		txtKAP2Cant10.setEditable(false);
		txtKAP2Cant10.setColumns(10);
		panel_90.add(txtKAP2Cant10);

		txtKAP2Cant11 = new JTextField();
		txtKAP2Cant11.setColumns(10);
		panel_90.add(txtKAP2Cant11);

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

		txtKARCant00 = new JTextField();
		txtKARCant00.setEditable(false);
		txtKARCant00.setColumns(10);
		panel_32.add(txtKARCant00);

		txtKARCant01 = new JTextField();
		txtKARCant01.setColumns(10);
		panel_32.add(txtKARCant01);

		JPanel panel_33 = new JPanel();
		panel_33.setBounds(248, 25, 162, 20);
		panel_30.add(panel_33);
		panel_33.setLayout(new GridLayout(1, 1, 0, 0));

		txtKARObsRef0 = new JTextField();
		txtKARObsRef0.setColumns(10);
		panel_33.add(txtKARObsRef0);

		JLabel label_7 = new JLabel("Cantidad");
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

		txtKARCant10 = new JTextField();
		txtKARCant10.setEditable(false);
		txtKARCant10.setColumns(10);
		panel_44.add(txtKARCant10);

		txtKARCant11 = new JTextField();
		txtKARCant11.setColumns(10);
		panel_44.add(txtKARCant11);

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

		txtKARCant20 = new JTextField();
		txtKARCant20.setEditable(false);
		txtKARCant20.setColumns(10);
		panel_35.add(txtKARCant20);

		txtKARCant21 = new JTextField();
		txtKARCant21.setColumns(10);
		panel_35.add(txtKARCant21);

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

		txtKARCant30 = new JTextField();
		txtKARCant30.setEditable(false);
		txtKARCant30.setColumns(10);
		panel_38.add(txtKARCant30);

		txtKARCant31 = new JTextField();
		txtKARCant31.setColumns(10);
		panel_38.add(txtKARCant31);

		txtKARCant40 = new JTextField();
		txtKARCant40.setEditable(false);
		txtKARCant40.setColumns(10);
		panel_38.add(txtKARCant40);

		txtKARCant41 = new JTextField();
		txtKARCant41.setColumns(10);
		panel_38.add(txtKARCant41);

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

		txtKARCant50 = new JTextField();
		txtKARCant50.setEditable(false);
		txtKARCant50.setColumns(10);
		panel_41.add(txtKARCant50);

		txtKARCant51 = new JTextField();
		txtKARCant51.setColumns(10);
		panel_41.add(txtKARCant51);

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

		txtKARCant60 = new JTextField();
		txtKARCant60.setEditable(false);
		txtKARCant60.setColumns(10);
		panel_47.add(txtKARCant60);

		txtKARCant61 = new JTextField();
		txtKARCant61.setColumns(10);
		panel_47.add(txtKARCant61);

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

		txtCA1Cant00 = new JTextField();
		txtCA1Cant00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA1Cant00.setEditable(false);
		txtCA1Cant00.setColumns(10);
		panel_26.add(txtCA1Cant00);

		txtCA1Cant01 = new JTextField();
		txtCA1Cant01.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA1Cant01.setColumns(10);
		panel_26.add(txtCA1Cant01);

		txtCA1Cant10 = new JTextField();
		txtCA1Cant10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA1Cant10.setEditable(false);
		txtCA1Cant10.setColumns(10);
		panel_26.add(txtCA1Cant10);

		txtCA1Cant11 = new JTextField();
		txtCA1Cant11.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA1Cant11.setColumns(10);
		panel_26.add(txtCA1Cant11);

		txtCA1Cant20 = new JTextField();
		txtCA1Cant20.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA1Cant20.setEditable(false);
		txtCA1Cant20.setColumns(10);
		panel_26.add(txtCA1Cant20);

		txtCA1Cant21 = new JTextField();
		txtCA1Cant21.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA1Cant21.setColumns(10);
		panel_26.add(txtCA1Cant21);

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

		JLabel label_73 = new JLabel("Cantidad");
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

		txtCA1Cant30 = new JTextField();
		txtCA1Cant30.setEditable(false);
		txtCA1Cant30.setColumns(10);
		panel_29.add(txtCA1Cant30);

		txtCA1Cant31 = new JTextField();
		txtCA1Cant31.setColumns(10);
		panel_29.add(txtCA1Cant31);

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

		JLabel label_35 = new JLabel("Cantidad");
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

		txtCA2Cant00 = new JTextField();
		txtCA2Cant00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA2Cant00.setEditable(false);
		txtCA2Cant00.setColumns(10);
		panel_57.add(txtCA2Cant00);

		txtCA2Cant01 = new JTextField();
		txtCA2Cant01.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA2Cant01.setColumns(10);
		panel_57.add(txtCA2Cant01);

		txtCA2Cant10 = new JTextField();
		txtCA2Cant10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA2Cant10.setEditable(false);
		txtCA2Cant10.setColumns(10);
		panel_57.add(txtCA2Cant10);

		txtCA2Cant11 = new JTextField();
		txtCA2Cant11.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA2Cant11.setColumns(10);
		panel_57.add(txtCA2Cant11);

		txtCA2Cant20 = new JTextField();
		txtCA2Cant20.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA2Cant20.setEditable(false);
		txtCA2Cant20.setColumns(10);
		panel_57.add(txtCA2Cant20);

		txtCA2Cant21 = new JTextField();
		txtCA2Cant21.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA2Cant21.setColumns(10);
		panel_57.add(txtCA2Cant21);

		txtCA2Cant30 = new JTextField();
		txtCA2Cant30.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA2Cant30.setEditable(false);
		txtCA2Cant30.setColumns(10);
		panel_57.add(txtCA2Cant30);

		txtCA2Cant31 = new JTextField();
		txtCA2Cant31.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA2Cant31.setColumns(10);
		panel_57.add(txtCA2Cant31);

		txtCA2Cant40 = new JTextField();
		txtCA2Cant40.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA2Cant40.setEditable(false);
		txtCA2Cant40.setColumns(10);
		panel_57.add(txtCA2Cant40);

		txtCA2Cant41 = new JTextField();
		txtCA2Cant41.setHorizontalAlignment(SwingConstants.CENTER);
		txtCA2Cant41.setColumns(10);
		panel_57.add(txtCA2Cant41);

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

		txtFFCant00 = new JTextField();
		txtFFCant00.setHorizontalAlignment(SwingConstants.CENTER);
		txtFFCant00.setEditable(false);
		txtFFCant00.setColumns(10);
		panel_52.add(txtFFCant00);

		txtFFCant01 = new JTextField();
		txtFFCant01.setHorizontalAlignment(SwingConstants.CENTER);
		txtFFCant01.setColumns(10);
		panel_52.add(txtFFCant01);

		txtFFCant10 = new JTextField();
		txtFFCant10.setHorizontalAlignment(SwingConstants.CENTER);
		txtFFCant10.setEditable(false);
		txtFFCant10.setColumns(10);
		panel_52.add(txtFFCant10);

		txtFFCant11 = new JTextField();
		txtFFCant11.setHorizontalAlignment(SwingConstants.CENTER);
		txtFFCant11.setColumns(10);
		panel_52.add(txtFFCant11);

		txtFFCant20 = new JTextField();
		txtFFCant20.setHorizontalAlignment(SwingConstants.CENTER);
		txtFFCant20.setEditable(false);
		txtFFCant20.setColumns(10);
		panel_52.add(txtFFCant20);

		txtFFCant21 = new JTextField();
		txtFFCant21.setHorizontalAlignment(SwingConstants.CENTER);
		txtFFCant21.setColumns(10);
		panel_52.add(txtFFCant21);

		txtFFCant30 = new JTextField();
		txtFFCant30.setHorizontalAlignment(SwingConstants.CENTER);
		txtFFCant30.setEditable(false);
		txtFFCant30.setColumns(10);
		panel_52.add(txtFFCant30);

		txtFFCant31 = new JTextField();
		txtFFCant31.setHorizontalAlignment(SwingConstants.CENTER);
		txtFFCant31.setColumns(10);
		panel_52.add(txtFFCant31);

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

		JLabel label_15 = new JLabel("Cantidad");
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

		txtFPCant00 = new JTextField();
		txtFPCant00.setHorizontalAlignment(SwingConstants.CENTER);
		txtFPCant00.setEditable(false);
		txtFPCant00.setColumns(10);
		panel_59.add(txtFPCant00);

		txtFPCant01 = new JTextField();
		txtFPCant01.setHorizontalAlignment(SwingConstants.CENTER);
		txtFPCant01.setColumns(10);
		panel_59.add(txtFPCant01);

		txtFPCant10 = new JTextField();
		txtFPCant10.setHorizontalAlignment(SwingConstants.CENTER);
		txtFPCant10.setEditable(false);
		txtFPCant10.setColumns(10);
		panel_59.add(txtFPCant10);

		txtFPCant11 = new JTextField();
		txtFPCant11.setHorizontalAlignment(SwingConstants.CENTER);
		txtFPCant11.setColumns(10);
		panel_59.add(txtFPCant11);

		txtFPCant20 = new JTextField();
		txtFPCant20.setHorizontalAlignment(SwingConstants.CENTER);
		txtFPCant20.setEditable(false);
		txtFPCant20.setColumns(10);
		panel_59.add(txtFPCant20);

		txtFPCant21 = new JTextField();
		txtFPCant21.setHorizontalAlignment(SwingConstants.CENTER);
		txtFPCant21.setColumns(10);
		panel_59.add(txtFPCant21);

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

		JLabel label_43 = new JLabel("Cantidad");
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

		txtFLCant00 = new JTextField();
		txtFLCant00.setHorizontalAlignment(SwingConstants.CENTER);
		txtFLCant00.setEditable(false);
		txtFLCant00.setColumns(10);
		panel_63.add(txtFLCant00);

		txtFLCant01 = new JTextField();
		txtFLCant01.setHorizontalAlignment(SwingConstants.CENTER);
		txtFLCant01.setColumns(10);
		panel_63.add(txtFLCant01);

		JPanel panel_64 = new JPanel();
		panel_64.setBounds(248, 14, 162, 20);
		panel_61.add(panel_64);
		panel_64.setLayout(new GridLayout(1, 1, 0, 0));

		txtFLObsRef0 = new JTextField();
		txtFLObsRef0.setColumns(10);
		panel_64.add(txtFLObsRef0);

		JLabel label_47 = new JLabel("Cantidad");
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

		txtFF2Cant00 = new JTextField();
		txtFF2Cant00.setHorizontalAlignment(SwingConstants.CENTER);
		txtFF2Cant00.setEditable(false);
		txtFF2Cant00.setColumns(10);
		panel_67.add(txtFF2Cant00);

		txtFF2Cant01 = new JTextField();
		txtFF2Cant01.setHorizontalAlignment(SwingConstants.CENTER);
		txtFF2Cant01.setColumns(10);
		panel_67.add(txtFF2Cant01);

		txtFF2Cant10 = new JTextField();
		txtFF2Cant10.setHorizontalAlignment(SwingConstants.CENTER);
		txtFF2Cant10.setEditable(false);
		txtFF2Cant10.setColumns(10);
		panel_67.add(txtFF2Cant10);

		txtFF2Cant11 = new JTextField();
		txtFF2Cant11.setHorizontalAlignment(SwingConstants.CENTER);
		txtFF2Cant11.setColumns(10);
		panel_67.add(txtFF2Cant11);

		txtFF2Cant20 = new JTextField();
		txtFF2Cant20.setHorizontalAlignment(SwingConstants.CENTER);
		txtFF2Cant20.setEditable(false);
		txtFF2Cant20.setColumns(10);
		panel_67.add(txtFF2Cant20);

		txtFF2Cant21 = new JTextField();
		txtFF2Cant21.setHorizontalAlignment(SwingConstants.CENTER);
		txtFF2Cant21.setColumns(10);
		panel_67.add(txtFF2Cant21);

		txtFF2Cant30 = new JTextField();
		txtFF2Cant30.setHorizontalAlignment(SwingConstants.CENTER);
		txtFF2Cant30.setEditable(false);
		txtFF2Cant30.setColumns(10);
		panel_67.add(txtFF2Cant30);

		txtFF2Cant31 = new JTextField();
		txtFF2Cant31.setHorizontalAlignment(SwingConstants.CENTER);
		txtFF2Cant31.setColumns(10);
		panel_67.add(txtFF2Cant31);

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

		JLabel label_52 = new JLabel("Cantidad");
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

		txtCECant00 = new JTextField();
		txtCECant00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECant00.setEditable(false);
		txtCECant00.setColumns(10);
		panel_77.add(txtCECant00);

		txtCECant01 = new JTextField();
		txtCECant01.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECant01.setColumns(10);
		panel_77.add(txtCECant01);

		txtCECant10 = new JTextField();
		txtCECant10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECant10.setEditable(false);
		txtCECant10.setColumns(10);
		panel_77.add(txtCECant10);

		txtCECant11 = new JTextField();
		txtCECant11.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECant11.setColumns(10);
		panel_77.add(txtCECant11);

		txtCECant20 = new JTextField();
		txtCECant20.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECant20.setEditable(false);
		txtCECant20.setColumns(10);
		panel_77.add(txtCECant20);

		txtCECant21 = new JTextField();
		txtCECant21.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECant21.setColumns(10);
		panel_77.add(txtCECant21);

		txtCECant30 = new JTextField();
		txtCECant30.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECant30.setEditable(false);
		txtCECant30.setColumns(10);
		panel_77.add(txtCECant30);

		txtCECant31 = new JTextField();
		txtCECant31.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECant31.setColumns(10);
		panel_77.add(txtCECant31);

		txtCECant40 = new JTextField();
		txtCECant40.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECant40.setEditable(false);
		txtCECant40.setColumns(10);
		panel_77.add(txtCECant40);

		txtCECant41 = new JTextField();
		txtCECant41.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECant41.setColumns(10);
		panel_77.add(txtCECant41);

		txtCECant50 = new JTextField();
		txtCECant50.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECant50.setEditable(false);
		txtCECant50.setColumns(10);
		panel_77.add(txtCECant50);

		txtCECant51 = new JTextField();
		txtCECant51.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECant51.setColumns(10);
		panel_77.add(txtCECant51);

		txtCECant60 = new JTextField();
		txtCECant60.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECant60.setEditable(false);
		txtCECant60.setColumns(10);
		panel_77.add(txtCECant60);

		txtCECant61 = new JTextField();
		txtCECant61.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECant61.setColumns(10);
		panel_77.add(txtCECant61);

		txtCECant70 = new JTextField();
		txtCECant70.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECant70.setEditable(false);
		txtCECant70.setColumns(10);
		panel_77.add(txtCECant70);

		txtCECant71 = new JTextField();
		txtCECant71.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECant71.setColumns(10);
		panel_77.add(txtCECant71);

		txtCECant80 = new JTextField();
		txtCECant80.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECant80.setEditable(false);
		txtCECant80.setColumns(10);
		panel_77.add(txtCECant80);

		txtCECant81 = new JTextField();
		txtCECant81.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECant81.setColumns(10);
		panel_77.add(txtCECant81);

		txtCECant90 = new JTextField();
		txtCECant90.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECant90.setEditable(false);
		txtCECant90.setColumns(10);
		panel_77.add(txtCECant90);

		txtCECant91 = new JTextField();
		txtCECant91.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECant91.setColumns(10);
		panel_77.add(txtCECant91);

		txtCECant100 = new JTextField();
		txtCECant100.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECant100.setEditable(false);
		txtCECant100.setColumns(10);
		panel_77.add(txtCECant100);

		txtCECant101 = new JTextField();
		txtCECant101.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECant101.setColumns(10);
		panel_77.add(txtCECant101);

		txtCECant110 = new JTextField();
		txtCECant110.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECant110.setEditable(false);
		txtCECant110.setColumns(10);
		panel_77.add(txtCECant110);

		txtCECant111 = new JTextField();
		txtCECant111.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECant111.setColumns(10);
		panel_77.add(txtCECant111);

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
	}

	private void cargarListas() {
		ServicioFichaMA srvFichaMA = new ComponenteFichaMA();
		ServicioCabecera srvCabecera = new ComponenteCabecera();

		LinkedList<TdetalleFicha> listaKE = new LinkedList<>();
		// settCabecera(new TCabecera(5, "proyecto test"));
		TCabecera cabecera = srvCabecera.buscarProyecto(gettCabecera().getCNombreProyecto());

//		TAula aula = srvFichaMA.buscarAula(nombreAula);
//		TGrupo grupoTmp = srvFichaMA.buscarGrupo("Kit eléctrico");
//		Integer updateFicha = srvFichaMA.buscarUpdateFicha();
//
//		listaKE.add(new TdetalleFicha(cabecera, infoObligatoria, tAula, tGrupo, tFicha, detEtiqueta, detCantidadLimite, detCantidadEjecutada, detObsRef, detActualizacionN))
	}
}
