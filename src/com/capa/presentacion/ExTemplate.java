package com.capa.presentacion;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.capa.datos.TFicha;
import com.capa.datos.TInformacionObligatoria;
import com.capa.negocios.ComponenteFicha;
import com.capa.negocios.ServicioFicha;

import static com.capa.util.Utilitarios.*;
import javax.swing.SwingConstants;

public class ExTemplate extends JFrame {

	private static final long serialVersionUID = 2991536081432510517L;
	private JPanel contentPane;
	private JTextField txtTECantidad00;
	private JTextField txtTECantidad01;
	private JTextField txtTECantidad10;
	private JTextField txtTECantidad11;
	private JTextField txtTECantidad20;
	private JTextField txtTECantidad21;
	private JTextField txtTECantidad30;
	private JTextField txtTECantidad31;
	private JTextField txtTECantidad40;
	private JTextField txtTECantidad41;
	private JTextField txtTECantidad50;
	private JTextField txtTECantidad51;
	private JTextField txtTECantidad60;
	private JTextField txtTECantidad61;
	private JTextField txtTECantidad70;
	private JTextField txtTECantidad71;
	private JTextField txtTECantidad80;
	private JTextField txtTECantidad81;
	private JTextField txtTEObsRef1;
	private JTextField txtTEObsRef0;
	private JTextField txtTEObsRef2;
	private JTextField txtTEObsRef3;
	private JTextField txtTEObsRef4;
	private JTextField txtTEObsRef5;
	private JTextField txtTEObsRef6;
	private JTextField txtTEObsRef7;
	private JTextField txtTEObsRef8;
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
	private JTextField txtEDCantidad00;
	private JTextField txtEDCantidad01;
	private JTextField txtEDCantidad10;
	private JTextField txtEDCantidad11;
	private JTextField txtEDCantidad20;
	private JTextField txtEDCantidad21;
	private JTextField txtEDCantidad30;
	private JTextField txtEDCantidad31;
	private JTextField txtEDCantidad40;
	private JTextField txtEDCantidad41;
	private JTextField txtEDCantidad50;
	private JTextField txtEDCantidad51;
	private JPanel pnlEDObsRef;
	private JTextField txtEDObsRef0;
	private JTextField txtEDObsRef1;
	private JTextField txtEDObsRef2;
	private JTextField txtEDObsRef3;
	private JTextField txtEDObsRef4;
	private JTextField txtEDObsRef5;
	private JLabel lblEDCantidad;
	private JLabel lblEDObsRef;
	private JPanel pnlAE;
	private JPanel pnlAEEtiquetas;
	private JLabel lblDadosCimentacionAXA;
	private JLabel lblLuminariasLed;
	private JLabel lblPostesSimples;
	private JLabel lblPostesDobles;
	private JLabel lblAECajasConexion;
	private JLabel lblAEKitCableadoElectrico;
	private JLabel lblAETuberaPvc;
	private JLabel lblAEKitAlumbradoExterior;
	private JPanel pnlAECantidad;
	private JTextField txtAECantidad00;
	private JTextField txtAECantidad01;
	private JTextField txtAECantidad10;
	private JTextField txtAECantidad11;
	private JTextField txtAECantidad20;
	private JTextField txtAECantidad21;
	private JTextField txtAECantidad30;
	private JTextField txtAECantidad31;
	private JTextField txtAECantidad40;
	private JTextField txtAECantidad41;
	private JTextField txtAECantidad50;
	private JTextField txtAECantidad51;
	private JTextField txtAECantidad60;
	private JTextField txtAECantidad61;
	private JPanel pnlAEObsRef;
	private JTextField txtAEObsRef0;
	private JTextField txtAEObsRef1;
	private JTextField txtAEObsRef2;
	private JTextField txtAEObsRef3;
	private JTextField txtAEObsRef4;
	private JTextField txtAEObsRef5;
	private JTextField txtAEObsRef6;
	private JLabel lblAECantidad;
	private JLabel lblAEObsRef;
	private JPanel pnlT;
	private JPanel pnlTEtiquetas;
	private JLabel lblTKitCableadoTR;
	private JLabel lblTuberiaPvc;
	private JLabel lblTransformadorKva;
	private JLabel lblCimentacinTransf;
	private JLabel lblCajasDeConexion;
	private JLabel lblTKitTransformador;
	private JPanel pnlTCantidad;
	private JTextField txtTCantidad00;
	private JTextField txtTCantidad01;
	private JTextField txtTCantidad10;
	private JTextField txtTCantidad11;
	private JTextField txtTCantidad20;
	private JTextField txtTCantidad21;
	private JTextField txtTCantidad30;
	private JTextField txtTCantidad31;
	private JTextField txtTCantidad40;
	private JTextField txtTCantidad41;
	private JPanel pnlTObsRef;
	private JTextField txtTObsRef0;
	private JTextField txtTObsRef1;
	private JTextField txtTObsRef2;
	private JTextField txtTObsRef3;
	private JTextField txtTObsRef4;
	private JLabel lblTCantidad;
	private JLabel lblTObsRef;
	private JPanel pnlBA;
	private JPanel pnlBAEtiquetas;
	private JLabel lblKitCableadoBA;
	private JLabel lblBATuberaPvc;
	private JLabel lblBACajasConexion;
	private JLabel lblKitBombaA;
	private JPanel pnlBACantidad;
	private JTextField txtBACantidad00;
	private JTextField txtBACantidad01;
	private JTextField txtBACantidad10;
	private JTextField txtBACantidad11;
	private JTextField txtBACantidad20;
	private JTextField txtBACantidad21;
	private JPanel pnlBAObsRef;
	private JTextField txtBAObsRef0;
	private JTextField txtBAObsRef1;
	private JTextField txtBAObsRef2;
	private JLabel lblBACantidad;
	private JLabel lblBAObsRef;
	private JPanel pnlSMT;
	private JPanel pnlSMTEtiquetas;
	private JLabel lblKitCableadoMT;
	private JLabel lblSistemaMallaT;
	private JPanel pnlSMTCantidad;
	private JTextField txtSMTCantidad00;
	private JTextField txtSMTCantidad01;
	private JPanel pnlSMTObsRef;
	private JTextField txtSMTObsRef0;
	private JLabel lblSMTCantidad;
	private JLabel lblSMTObsRef;

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
	// ExTemplate frame = new ExTemplate();
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
	public ExTemplate(TFicha ficha) {
		this.ficha = ficha;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1318, 659);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		// setContentPane(contentPane);
		contentPane.setLayout(null);

		this.setResizable(false);
		this.setLocationRelativeTo(null);
		setTitle(ficha.getFiNombre());
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
		tabbedPane.addTab("1.-EX-KIT EL�CTRICA EXTERNA", null, pnlPestaña1, null);
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

		JLabel lblTableroElectricoA = new JLabel("Tablero El\u00E9ctrico Tipo A");
		pnlTEEtiquetas.add(lblTableroElectricoA);

		JLabel lblTableroElectricoB = new JLabel("Tablero El\u00E9ctrico Tipo B");
		pnlTEEtiquetas.add(lblTableroElectricoB);

		JLabel lblTableroElectricoC = new JLabel("Tablero El\u00E9ctrico Tipo C");
		pnlTEEtiquetas.add(lblTableroElectricoC);

		JLabel lblTableroElectricoD = new JLabel("Tablero El\u00E9ctrico Tipo D");
		pnlTEEtiquetas.add(lblTableroElectricoD);

		JLabel lblTableroElectricoE = new JLabel("Tablero El\u00E9ctrico Tipo E");
		pnlTEEtiquetas.add(lblTableroElectricoE);

		JLabel lblTableroElectricoF = new JLabel("Tablero El\u00E9ctrico Tipo F");
		pnlTEEtiquetas.add(lblTableroElectricoF);

		JLabel lblTEKitCableadoElectrico = new JLabel("Kit Cableado El\u00E9ctrico TE");
		pnlTEEtiquetas.add(lblTEKitCableadoElectrico);

		JLabel lblTuberia = new JLabel("Tuber\u00EDa PVC 2\u00B4para cableado l=6m");
		pnlTEEtiquetas.add(lblTuberia);

		JLabel lblCajas = new JLabel("Cajas de Conexi\u00F3n  .60x.60 mt");
		pnlTEEtiquetas.add(lblCajas);

		JLabel lblTEKitTablerosE = new JLabel("KIT DE TABLEROS EL\u00C9CTRICOS");
		lblTEKitTablerosE.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTEKitTablerosE.setBounds(3, 1, 176, 14);
		pnlTE.add(lblTEKitTablerosE);

		JPanel pnlTECantidad = new JPanel();
		pnlTECantidad.setBounds(210, 17, 55, 217);
		pnlTE.add(pnlTECantidad);
		pnlTECantidad.setLayout(new GridLayout(9, 2, 0, 0));

		txtTECantidad00 = new JTextField();
		txtTECantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtTECantidad00.setEditable(false);
		pnlTECantidad.add(txtTECantidad00);
		txtTECantidad00.setColumns(10);

		txtTECantidad01 = new JTextField();
		txtTECantidad01.setHorizontalAlignment(SwingConstants.CENTER);
		txtTECantidad01.setColumns(10);
		pnlTECantidad.add(txtTECantidad01);

		txtTECantidad10 = new JTextField();
		txtTECantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtTECantidad10.setEditable(false);
		txtTECantidad10.setColumns(10);
		pnlTECantidad.add(txtTECantidad10);

		txtTECantidad11 = new JTextField();
		txtTECantidad11.setHorizontalAlignment(SwingConstants.CENTER);
		txtTECantidad11.setColumns(10);
		pnlTECantidad.add(txtTECantidad11);

		txtTECantidad20 = new JTextField();
		txtTECantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtTECantidad20.setEditable(false);
		txtTECantidad20.setColumns(10);
		pnlTECantidad.add(txtTECantidad20);

		txtTECantidad21 = new JTextField();
		txtTECantidad21.setHorizontalAlignment(SwingConstants.CENTER);
		txtTECantidad21.setColumns(10);
		pnlTECantidad.add(txtTECantidad21);

		txtTECantidad30 = new JTextField();
		txtTECantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtTECantidad30.setEditable(false);
		txtTECantidad30.setColumns(10);
		pnlTECantidad.add(txtTECantidad30);

		txtTECantidad31 = new JTextField();
		txtTECantidad31.setHorizontalAlignment(SwingConstants.CENTER);
		txtTECantidad31.setColumns(10);
		pnlTECantidad.add(txtTECantidad31);

		txtTECantidad40 = new JTextField();
		txtTECantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtTECantidad40.setEditable(false);
		txtTECantidad40.setColumns(10);
		pnlTECantidad.add(txtTECantidad40);

		txtTECantidad41 = new JTextField();
		txtTECantidad41.setHorizontalAlignment(SwingConstants.CENTER);
		txtTECantidad41.setColumns(10);
		pnlTECantidad.add(txtTECantidad41);

		txtTECantidad50 = new JTextField();
		txtTECantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtTECantidad50.setEditable(false);
		txtTECantidad50.setColumns(10);
		pnlTECantidad.add(txtTECantidad50);

		txtTECantidad51 = new JTextField();
		txtTECantidad51.setHorizontalAlignment(SwingConstants.CENTER);
		txtTECantidad51.setColumns(10);
		pnlTECantidad.add(txtTECantidad51);

		txtTECantidad60 = new JTextField();
		txtTECantidad60.setHorizontalAlignment(SwingConstants.CENTER);
		txtTECantidad60.setEditable(false);
		txtTECantidad60.setColumns(10);
		pnlTECantidad.add(txtTECantidad60);

		txtTECantidad61 = new JTextField();
		txtTECantidad61.setHorizontalAlignment(SwingConstants.CENTER);
		txtTECantidad61.setColumns(10);
		pnlTECantidad.add(txtTECantidad61);

		txtTECantidad70 = new JTextField();
		txtTECantidad70.setHorizontalAlignment(SwingConstants.CENTER);
		txtTECantidad70.setEditable(false);
		txtTECantidad70.setColumns(10);
		pnlTECantidad.add(txtTECantidad70);

		txtTECantidad71 = new JTextField();
		txtTECantidad71.setHorizontalAlignment(SwingConstants.CENTER);
		txtTECantidad71.setColumns(10);
		pnlTECantidad.add(txtTECantidad71);

		txtTECantidad80 = new JTextField();
		txtTECantidad80.setHorizontalAlignment(SwingConstants.CENTER);
		txtTECantidad80.setEditable(false);
		txtTECantidad80.setColumns(10);
		pnlTECantidad.add(txtTECantidad80);

		txtTECantidad81 = new JTextField();
		txtTECantidad81.setHorizontalAlignment(SwingConstants.CENTER);
		txtTECantidad81.setColumns(10);
		pnlTECantidad.add(txtTECantidad81);

		JPanel pnlTEObsRef = new JPanel();
		pnlTEObsRef.setBounds(267, 17, 143, 217);
		pnlTE.add(pnlTEObsRef);
		pnlTEObsRef.setLayout(new GridLayout(9, 0, 0, 0));

		txtTEObsRef0 = new JTextField();
		pnlTEObsRef.add(txtTEObsRef0);
		txtTEObsRef0.setColumns(10);

		txtTEObsRef1 = new JTextField();
		pnlTEObsRef.add(txtTEObsRef1);
		txtTEObsRef1.setColumns(10);

		txtTEObsRef2 = new JTextField();
		txtTEObsRef2.setColumns(10);
		pnlTEObsRef.add(txtTEObsRef2);

		txtTEObsRef3 = new JTextField();
		txtTEObsRef3.setColumns(10);
		pnlTEObsRef.add(txtTEObsRef3);

		txtTEObsRef4 = new JTextField();
		txtTEObsRef4.setColumns(10);
		pnlTEObsRef.add(txtTEObsRef4);

		txtTEObsRef5 = new JTextField();
		txtTEObsRef5.setColumns(10);
		pnlTEObsRef.add(txtTEObsRef5);

		txtTEObsRef6 = new JTextField();
		txtTEObsRef6.setColumns(10);
		pnlTEObsRef.add(txtTEObsRef6);

		txtTEObsRef7 = new JTextField();
		txtTEObsRef7.setColumns(10);
		pnlTEObsRef.add(txtTEObsRef7);

		txtTEObsRef8 = new JTextField();
		txtTEObsRef8.setColumns(10);
		pnlTEObsRef.add(txtTEObsRef8);

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

		lblDadosCimentacionBXB = new JLabel("Dados de cimentaci\u00F3n de postes BXBcm");
		pnlEDEtiquetas.add(lblDadosCimentacionBXB);

		lblReflectoresLed = new JLabel("Reflectores LED 400 w - 30000 lum");
		pnlEDEtiquetas.add(lblReflectoresLed);

		lblPostes6mts = new JLabel("Postes de 6 mts simples");
		pnlEDEtiquetas.add(lblPostes6mts);

		lblEDCajasConexion = new JLabel("Cajas de Conexi\u00F3n  .60x.60 mt");
		pnlEDEtiquetas.add(lblEDCajasConexion);

		lblEDKitCableadoElectrico = new JLabel("Kit Cableado El\u00E9ctrico ED");
		pnlEDEtiquetas.add(lblEDKitCableadoElectrico);

		lblEDTuberaPvc = new JLabel("Tuber\u00EDa PVC 1\u00B4para cableado l=6m");
		pnlEDEtiquetas.add(lblEDTuberaPvc);

		lblEDKitEsparcimD = new JLabel("KIT DE ESPARCIMIENTO DEPORTIVO");
		lblEDKitEsparcimD.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEDKitEsparcimD.setBounds(3, 1, 211, 14);
		pnlED.add(lblEDKitEsparcimD);

		pnlEDCantidad = new JPanel();
		pnlEDCantidad.setBounds(210, 17, 55, 144);
		pnlED.add(pnlEDCantidad);
		pnlEDCantidad.setLayout(new GridLayout(6, 2, 0, 0));

		txtEDCantidad00 = new JTextField();
		txtEDCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtEDCantidad00.setEditable(false);
		txtEDCantidad00.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad00);

		txtEDCantidad01 = new JTextField();
		txtEDCantidad01.setHorizontalAlignment(SwingConstants.CENTER);
		txtEDCantidad01.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad01);

		txtEDCantidad10 = new JTextField();
		txtEDCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtEDCantidad10.setEditable(false);
		txtEDCantidad10.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad10);

		txtEDCantidad11 = new JTextField();
		txtEDCantidad11.setHorizontalAlignment(SwingConstants.CENTER);
		txtEDCantidad11.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad11);

		txtEDCantidad20 = new JTextField();
		txtEDCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtEDCantidad20.setEditable(false);
		txtEDCantidad20.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad20);

		txtEDCantidad21 = new JTextField();
		txtEDCantidad21.setHorizontalAlignment(SwingConstants.CENTER);
		txtEDCantidad21.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad21);

		txtEDCantidad30 = new JTextField();
		txtEDCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtEDCantidad30.setEditable(false);
		txtEDCantidad30.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad30);

		txtEDCantidad31 = new JTextField();
		txtEDCantidad31.setHorizontalAlignment(SwingConstants.CENTER);
		txtEDCantidad31.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad31);

		txtEDCantidad40 = new JTextField();
		txtEDCantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtEDCantidad40.setEditable(false);
		txtEDCantidad40.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad40);

		txtEDCantidad41 = new JTextField();
		txtEDCantidad41.setHorizontalAlignment(SwingConstants.CENTER);
		txtEDCantidad41.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad41);

		txtEDCantidad50 = new JTextField();
		txtEDCantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtEDCantidad50.setEditable(false);
		txtEDCantidad50.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad50);

		txtEDCantidad51 = new JTextField();
		txtEDCantidad51.setHorizontalAlignment(SwingConstants.CENTER);
		txtEDCantidad51.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad51);

		pnlEDObsRef = new JPanel();
		pnlEDObsRef.setBounds(267, 17, 143, 144);
		pnlED.add(pnlEDObsRef);
		pnlEDObsRef.setLayout(new GridLayout(6, 0, 0, 0));

		txtEDObsRef0 = new JTextField();
		txtEDObsRef0.setColumns(10);
		pnlEDObsRef.add(txtEDObsRef0);

		txtEDObsRef1 = new JTextField();
		txtEDObsRef1.setColumns(10);
		pnlEDObsRef.add(txtEDObsRef1);

		txtEDObsRef2 = new JTextField();
		txtEDObsRef2.setColumns(10);
		pnlEDObsRef.add(txtEDObsRef2);

		txtEDObsRef3 = new JTextField();
		txtEDObsRef3.setColumns(10);
		pnlEDObsRef.add(txtEDObsRef3);

		txtEDObsRef4 = new JTextField();
		txtEDObsRef4.setColumns(10);
		pnlEDObsRef.add(txtEDObsRef4);

		txtEDObsRef5 = new JTextField();
		txtEDObsRef5.setColumns(10);
		pnlEDObsRef.add(txtEDObsRef5);

		lblEDCantidad = new JLabel("Cantidad");
		lblEDCantidad.setBounds(210, 1, 55, 14);
		pnlED.add(lblEDCantidad);

		lblEDObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblEDObsRef.setBounds(267, 1, 143, 14);
		pnlED.add(lblEDObsRef);

		pnlAE = new JPanel();
		pnlAE.setLayout(null);
		pnlAE.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlAE.setBounds(434, 11, 414, 190);
		pnlPestaña1.add(pnlAE);

		pnlAEEtiquetas = new JPanel();
		pnlAEEtiquetas.setBounds(3, 17, 199, 169);
		pnlAE.add(pnlAEEtiquetas);
		pnlAEEtiquetas.setLayout(new GridLayout(7, 0, 0, 0));

		lblDadosCimentacionAXA = new JLabel("Dados de cimentaci\u00F3n de postes AXAcm");
		pnlAEEtiquetas.add(lblDadosCimentacionAXA);

		lblLuminariasLed = new JLabel("Luminarias LED 120 W - 12000 lum");
		pnlAEEtiquetas.add(lblLuminariasLed);

		lblPostesSimples = new JLabel("Postes de 6 mts simples");
		pnlAEEtiquetas.add(lblPostesSimples);

		lblPostesDobles = new JLabel("Postes de 6 mts dobles");
		pnlAEEtiquetas.add(lblPostesDobles);

		lblAECajasConexion = new JLabel("Cajas de Conexi\u00F3n  0,60x0,60 mt");
		pnlAEEtiquetas.add(lblAECajasConexion);

		lblAEKitCableadoElectrico = new JLabel("Kit cableado el\u00E9ctrico AE");
		pnlAEEtiquetas.add(lblAEKitCableadoElectrico);

		lblAETuberaPvc = new JLabel("Tuber\u00EDa PVC 1\u00B4para cableado l=6m");
		pnlAEEtiquetas.add(lblAETuberaPvc);

		lblAEKitAlumbradoExterior = new JLabel("KIT ALUMBRADO EXTERIOR");
		lblAEKitAlumbradoExterior.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAEKitAlumbradoExterior.setBounds(3, 1, 176, 14);
		pnlAE.add(lblAEKitAlumbradoExterior);

		pnlAECantidad = new JPanel();
		pnlAECantidad.setBounds(210, 17, 55, 169);
		pnlAE.add(pnlAECantidad);
		pnlAECantidad.setLayout(new GridLayout(7, 2, 0, 0));

		txtAECantidad00 = new JTextField();
		txtAECantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtAECantidad00.setEditable(false);
		txtAECantidad00.setColumns(10);
		pnlAECantidad.add(txtAECantidad00);

		txtAECantidad01 = new JTextField();
		txtAECantidad01.setHorizontalAlignment(SwingConstants.CENTER);
		txtAECantidad01.setColumns(10);
		pnlAECantidad.add(txtAECantidad01);

		txtAECantidad10 = new JTextField();
		txtAECantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtAECantidad10.setEditable(false);
		txtAECantidad10.setColumns(10);
		pnlAECantidad.add(txtAECantidad10);

		txtAECantidad11 = new JTextField();
		txtAECantidad11.setHorizontalAlignment(SwingConstants.CENTER);
		txtAECantidad11.setColumns(10);
		pnlAECantidad.add(txtAECantidad11);

		txtAECantidad20 = new JTextField();
		txtAECantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtAECantidad20.setEditable(false);
		txtAECantidad20.setColumns(10);
		pnlAECantidad.add(txtAECantidad20);

		txtAECantidad21 = new JTextField();
		txtAECantidad21.setHorizontalAlignment(SwingConstants.CENTER);
		txtAECantidad21.setColumns(10);
		pnlAECantidad.add(txtAECantidad21);

		txtAECantidad30 = new JTextField();
		txtAECantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtAECantidad30.setEditable(false);
		txtAECantidad30.setColumns(10);
		pnlAECantidad.add(txtAECantidad30);

		txtAECantidad31 = new JTextField();
		txtAECantidad31.setHorizontalAlignment(SwingConstants.CENTER);
		txtAECantidad31.setColumns(10);
		pnlAECantidad.add(txtAECantidad31);

		txtAECantidad40 = new JTextField();
		txtAECantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtAECantidad40.setEditable(false);
		txtAECantidad40.setColumns(10);
		pnlAECantidad.add(txtAECantidad40);

		txtAECantidad41 = new JTextField();
		txtAECantidad41.setHorizontalAlignment(SwingConstants.CENTER);
		txtAECantidad41.setColumns(10);
		pnlAECantidad.add(txtAECantidad41);

		txtAECantidad50 = new JTextField();
		txtAECantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtAECantidad50.setEditable(false);
		txtAECantidad50.setColumns(10);
		pnlAECantidad.add(txtAECantidad50);

		txtAECantidad51 = new JTextField();
		txtAECantidad51.setHorizontalAlignment(SwingConstants.CENTER);
		txtAECantidad51.setColumns(10);
		pnlAECantidad.add(txtAECantidad51);

		txtAECantidad60 = new JTextField();
		txtAECantidad60.setHorizontalAlignment(SwingConstants.CENTER);
		txtAECantidad60.setEditable(false);
		txtAECantidad60.setColumns(10);
		pnlAECantidad.add(txtAECantidad60);

		txtAECantidad61 = new JTextField();
		txtAECantidad61.setHorizontalAlignment(SwingConstants.CENTER);
		txtAECantidad61.setColumns(10);
		pnlAECantidad.add(txtAECantidad61);

		pnlAEObsRef = new JPanel();
		pnlAEObsRef.setBounds(267, 17, 143, 169);
		pnlAE.add(pnlAEObsRef);
		pnlAEObsRef.setLayout(new GridLayout(7, 0, 0, 0));

		txtAEObsRef0 = new JTextField();
		txtAEObsRef0.setColumns(10);
		pnlAEObsRef.add(txtAEObsRef0);

		txtAEObsRef1 = new JTextField();
		txtAEObsRef1.setColumns(10);
		pnlAEObsRef.add(txtAEObsRef1);

		txtAEObsRef2 = new JTextField();
		txtAEObsRef2.setColumns(10);
		pnlAEObsRef.add(txtAEObsRef2);

		txtAEObsRef3 = new JTextField();
		txtAEObsRef3.setColumns(10);
		pnlAEObsRef.add(txtAEObsRef3);

		txtAEObsRef4 = new JTextField();
		txtAEObsRef4.setColumns(10);
		pnlAEObsRef.add(txtAEObsRef4);

		txtAEObsRef5 = new JTextField();
		txtAEObsRef5.setColumns(10);
		pnlAEObsRef.add(txtAEObsRef5);

		txtAEObsRef6 = new JTextField();
		txtAEObsRef6.setColumns(10);
		pnlAEObsRef.add(txtAEObsRef6);

		lblAECantidad = new JLabel("Cantidad");
		lblAECantidad.setBounds(210, 1, 55, 14);
		pnlAE.add(lblAECantidad);

		lblAEObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblAEObsRef.setBounds(267, 1, 143, 14);
		pnlAE.add(lblAEObsRef);

		pnlBA = new JPanel();
		pnlBA.setLayout(null);
		pnlBA.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlBA.setBounds(434, 212, 414, 95);
		pnlPestaña1.add(pnlBA);

		pnlBAEtiquetas = new JPanel();
		pnlBAEtiquetas.setBounds(3, 17, 199, 73);
		pnlBA.add(pnlBAEtiquetas);
		pnlBAEtiquetas.setLayout(new GridLayout(3, 0, 0, 0));

		lblKitCableadoBA = new JLabel("Kit de cableado el\u00E9ctrico BA");
		pnlBAEtiquetas.add(lblKitCableadoBA);

		lblBATuberaPvc = new JLabel("Tuber\u00EDa PVC 2\u00B4para cableado l=6m");
		pnlBAEtiquetas.add(lblBATuberaPvc);

		lblBACajasConexion = new JLabel("Cajas de Conexi\u00F3n  0,60x0,60 mt");
		pnlBAEtiquetas.add(lblBACajasConexion);

		lblKitBombaA = new JLabel("KIT BOMBA DE AGUA");
		lblKitBombaA.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKitBombaA.setBounds(3, 1, 176, 14);
		pnlBA.add(lblKitBombaA);

		pnlBACantidad = new JPanel();
		pnlBACantidad.setBounds(210, 17, 55, 73);
		pnlBA.add(pnlBACantidad);
		pnlBACantidad.setLayout(new GridLayout(3, 2, 0, 0));

		txtBACantidad00 = new JTextField();
		txtBACantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtBACantidad00.setEditable(false);
		txtBACantidad00.setColumns(10);
		pnlBACantidad.add(txtBACantidad00);

		txtBACantidad01 = new JTextField();
		txtBACantidad01.setHorizontalAlignment(SwingConstants.CENTER);
		txtBACantidad01.setColumns(10);
		pnlBACantidad.add(txtBACantidad01);

		txtBACantidad10 = new JTextField();
		txtBACantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtBACantidad10.setEditable(false);
		txtBACantidad10.setColumns(10);
		pnlBACantidad.add(txtBACantidad10);

		txtBACantidad11 = new JTextField();
		txtBACantidad11.setHorizontalAlignment(SwingConstants.CENTER);
		txtBACantidad11.setColumns(10);
		pnlBACantidad.add(txtBACantidad11);

		txtBACantidad20 = new JTextField();
		txtBACantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtBACantidad20.setEditable(false);
		txtBACantidad20.setColumns(10);
		pnlBACantidad.add(txtBACantidad20);

		txtBACantidad21 = new JTextField();
		txtBACantidad21.setHorizontalAlignment(SwingConstants.CENTER);
		txtBACantidad21.setColumns(10);
		pnlBACantidad.add(txtBACantidad21);

		pnlBAObsRef = new JPanel();
		pnlBAObsRef.setBounds(267, 17, 143, 73);
		pnlBA.add(pnlBAObsRef);
		pnlBAObsRef.setLayout(new GridLayout(3, 0, 0, 0));

		txtBAObsRef0 = new JTextField();
		txtBAObsRef0.setColumns(10);
		pnlBAObsRef.add(txtBAObsRef0);

		txtBAObsRef1 = new JTextField();
		txtBAObsRef1.setColumns(10);
		pnlBAObsRef.add(txtBAObsRef1);

		txtBAObsRef2 = new JTextField();
		txtBAObsRef2.setColumns(10);
		pnlBAObsRef.add(txtBAObsRef2);

		lblBACantidad = new JLabel("Cantidad");
		lblBACantidad.setBounds(210, 1, 55, 14);
		pnlBA.add(lblBACantidad);

		lblBAObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblBAObsRef.setBounds(267, 1, 143, 14);
		pnlBA.add(lblBAObsRef);

		pnlT = new JPanel();
		pnlT.setLayout(null);
		pnlT.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlT.setBounds(858, 11, 414, 141);
		pnlPestaña1.add(pnlT);

		pnlTEtiquetas = new JPanel();
		pnlTEtiquetas.setBounds(3, 17, 199, 120);
		pnlT.add(pnlTEtiquetas);
		pnlTEtiquetas.setLayout(new GridLayout(5, 0, 0, 0));

		lblTKitCableadoTR = new JLabel("Kit de cableado el\u00E9ctrico TR");
		pnlTEtiquetas.add(lblTKitCableadoTR);

		lblTuberiaPvc = new JLabel("Tuber\u00EDa PVC 3\u00B4para cableado l=6m");
		pnlTEtiquetas.add(lblTuberiaPvc);

		lblTransformadorKva = new JLabel("Transformador 100 Kva");
		pnlTEtiquetas.add(lblTransformadorKva);

		lblCimentacinTransf = new JLabel("Cimentaci\u00F3n Transformador");
		pnlTEtiquetas.add(lblCimentacinTransf);

		lblCajasDeConexion = new JLabel("Cajas de Conexi\u00F3n  0,60x0,60 mt");
		pnlTEtiquetas.add(lblCajasDeConexion);

		lblTKitTransformador = new JLabel("KIT TRANSFORMADOR");
		lblTKitTransformador.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTKitTransformador.setBounds(3, 1, 176, 14);
		pnlT.add(lblTKitTransformador);

		pnlTCantidad = new JPanel();
		pnlTCantidad.setBounds(210, 17, 55, 120);
		pnlT.add(pnlTCantidad);
		pnlTCantidad.setLayout(new GridLayout(5, 2, 0, 0));

		txtTCantidad00 = new JTextField();
		txtTCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtTCantidad00.setEditable(false);
		txtTCantidad00.setColumns(10);
		pnlTCantidad.add(txtTCantidad00);

		txtTCantidad01 = new JTextField();
		txtTCantidad01.setHorizontalAlignment(SwingConstants.CENTER);
		txtTCantidad01.setColumns(10);
		pnlTCantidad.add(txtTCantidad01);

		txtTCantidad10 = new JTextField();
		txtTCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtTCantidad10.setEditable(false);
		txtTCantidad10.setColumns(10);
		pnlTCantidad.add(txtTCantidad10);

		txtTCantidad11 = new JTextField();
		txtTCantidad11.setHorizontalAlignment(SwingConstants.CENTER);
		txtTCantidad11.setColumns(10);
		pnlTCantidad.add(txtTCantidad11);

		txtTCantidad20 = new JTextField();
		txtTCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtTCantidad20.setEditable(false);
		txtTCantidad20.setColumns(10);
		pnlTCantidad.add(txtTCantidad20);

		txtTCantidad21 = new JTextField();
		txtTCantidad21.setHorizontalAlignment(SwingConstants.CENTER);
		txtTCantidad21.setColumns(10);
		pnlTCantidad.add(txtTCantidad21);

		txtTCantidad30 = new JTextField();
		txtTCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtTCantidad30.setEditable(false);
		txtTCantidad30.setColumns(10);
		pnlTCantidad.add(txtTCantidad30);

		txtTCantidad31 = new JTextField();
		txtTCantidad31.setHorizontalAlignment(SwingConstants.CENTER);
		txtTCantidad31.setColumns(10);
		pnlTCantidad.add(txtTCantidad31);

		txtTCantidad40 = new JTextField();
		txtTCantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtTCantidad40.setEditable(false);
		txtTCantidad40.setColumns(10);
		pnlTCantidad.add(txtTCantidad40);

		txtTCantidad41 = new JTextField();
		txtTCantidad41.setHorizontalAlignment(SwingConstants.CENTER);
		txtTCantidad41.setColumns(10);
		pnlTCantidad.add(txtTCantidad41);

		pnlTObsRef = new JPanel();
		pnlTObsRef.setBounds(267, 17, 143, 120);
		pnlT.add(pnlTObsRef);
		pnlTObsRef.setLayout(new GridLayout(5, 0, 0, 0));

		txtTObsRef0 = new JTextField();
		txtTObsRef0.setColumns(10);
		pnlTObsRef.add(txtTObsRef0);

		txtTObsRef1 = new JTextField();
		txtTObsRef1.setColumns(10);
		pnlTObsRef.add(txtTObsRef1);

		txtTObsRef2 = new JTextField();
		txtTObsRef2.setColumns(10);
		pnlTObsRef.add(txtTObsRef2);

		txtTObsRef3 = new JTextField();
		txtTObsRef3.setColumns(10);
		pnlTObsRef.add(txtTObsRef3);

		txtTObsRef4 = new JTextField();
		txtTObsRef4.setColumns(10);
		pnlTObsRef.add(txtTObsRef4);

		lblTCantidad = new JLabel("Cantidad");
		lblTCantidad.setBounds(210, 1, 55, 14);
		pnlT.add(lblTCantidad);

		lblTObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblTObsRef.setBounds(267, 1, 143, 14);
		pnlT.add(lblTObsRef);

		pnlSMT = new JPanel();
		pnlSMT.setLayout(null);
		pnlSMT.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlSMT.setBounds(858, 154, 414, 47);
		pnlPestaña1.add(pnlSMT);

		pnlSMTEtiquetas = new JPanel();
		pnlSMTEtiquetas.setBounds(3, 17, 199, 25);
		pnlSMT.add(pnlSMTEtiquetas);
		pnlSMTEtiquetas.setLayout(new GridLayout(1, 0, 0, 0));

		lblKitCableadoMT = new JLabel("Kit de cableado el\u00E9ctrico MT");
		pnlSMTEtiquetas.add(lblKitCableadoMT);

		lblSistemaMallaT = new JLabel("SISTEMA MALLA A TIERRA");
		lblSistemaMallaT.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSistemaMallaT.setBounds(3, 1, 176, 14);
		pnlSMT.add(lblSistemaMallaT);

		pnlSMTCantidad = new JPanel();
		pnlSMTCantidad.setBounds(210, 17, 55, 25);
		pnlSMT.add(pnlSMTCantidad);
		pnlSMTCantidad.setLayout(new GridLayout(1, 1, 0, 0));

		txtSMTCantidad00 = new JTextField();
		txtSMTCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtSMTCantidad00.setEditable(false);
		txtSMTCantidad00.setColumns(10);
		pnlSMTCantidad.add(txtSMTCantidad00);

		txtSMTCantidad01 = new JTextField();
		txtSMTCantidad01.setHorizontalAlignment(SwingConstants.CENTER);
		txtSMTCantidad01.setColumns(10);
		pnlSMTCantidad.add(txtSMTCantidad01);

		pnlSMTObsRef = new JPanel();
		pnlSMTObsRef.setBounds(267, 17, 143, 25);
		pnlSMT.add(pnlSMTObsRef);
		pnlSMTObsRef.setLayout(new GridLayout(1, 0, 0, 0));

		txtSMTObsRef0 = new JTextField();
		txtSMTObsRef0.setColumns(10);
		pnlSMTObsRef.add(txtSMTObsRef0);

		lblSMTCantidad = new JLabel("Cantidad");
		lblSMTCantidad.setBounds(210, 1, 55, 14);
		pnlSMT.add(lblSMTCantidad);

		lblSMTObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblSMTObsRef.setBounds(267, 1, 143, 14);
		pnlSMT.add(lblSMTObsRef);

		cabecera.getBtnRegistrar().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("holis");
			}
		});

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				new Menu().setVisible(true);
				dispose();
			}
		});
	}
}
