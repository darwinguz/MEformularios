package com.capa.presentacion;

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
import com.capa.negocios.ComponenteFichaMA;
import com.capa.negocios.ComponenteInfoObligatoria;
import com.capa.negocios.ServicioFichaMA;
import com.capa.negocios.ServicioInfoObligatoria;

import static com.capa.util.Utilitarios.*;
import static com.capa.util.Validaciones.*;

public class MtTemplate extends JFrame {

	private static final long serialVersionUID = 2991536081432510517L;
	private JPanel contentPane;
	private JTextField txtAmie;
	private JTextField txtCircuito;
	private JTextField txtFechaEntrega;
	private JTextField txtFechaInicioTrabajo;
	private JTextField txtSector;
	private JTextField txtProyecto;
	private JTextField txtParroquia;
	private JTextField txtTECantidad00;
	private JTextField txtTECantidad01;
	private JTextField txtTECantidad10;
	private JTextField txtTECantidad11;
	private JTextField txtTECantidad20;
	private JTextField txtTECantidad21;
	private JTextField txtTECantidad30;
	private JTextField txtTECantidad31;
	private JTextField txtTEObsRef1;
	private JTextField txtTEObsRef0;
	private JTextField txtTEObsRef2;
	private JTextField txtTEObsRef3;
	private JLabel lblTECantidad;
	private JLabel lblTEObsRef;
	private JPanel pnlKitAguaLluvia;
	private JPanel pnlEDEtiquetas;
	private JLabel lblDadosCimentacionBXB;
	private JLabel lblReflectoresLed;
	private JLabel lblPostes6mts;
	private JLabel lblEDCajasConexion;
	private JLabel lblEDKitCableadoElectrico;
	private JLabel lbl_agua_lluvia;
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
	private JPanel pnlEDObsRef;
	private JTextField txtEDObsRef0;
	private JTextField txtEDObsRef1;
	private JTextField txtEDObsRef2;
	private JTextField txtEDObsRef3;
	private JTextField txtEDObsRef4;
	private JLabel lblEDCantidad;
	private JLabel lblEDObsRef;
	private JPanel pnlFachadaFrontal;
	private JPanel pnlAEEtiquetas;
	private JLabel lblDadosCimentacionAXA;
	private JLabel lblLuminariasLed;
	private JLabel lblPostesSimples;
	private JLabel lblAEKitCableadoElectrico;
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
	private JPanel pnlAEObsRef;
	private JTextField txtAEObsRef0;
	private JTextField txtAEObsRef1;
	private JTextField txtAEObsRef2;
	private JTextField txtAEObsRef3;
	private JLabel lblAECantidad;
	private JLabel lblAEObsRef;
	private JPanel pnlComponenteEst;
	private JPanel pnlTEtiquetas;
	private JLabel lblTKitCableadoTR;
	private JLabel lbl_pst_datos_cim;
	private JLabel lbl_pst2;
	private JLabel lbl_pst3;
	private JLabel lbl_pst11;
	private JLabel lblTKitTransformador;
	private JPanel pnlTCantidad;
	private JTextField txtTCantidad01;
	private JTextField txtTCantidad10;
	private JTextField txtTCantidad11;
	private JTextField txtTCantidad20;
	private JTextField txtTCantidad21;
	private JTextField txtTCantidad30;
	private JTextField txtTCantidad31;
	private JTextField txtTCantidad40;
	private JTextField txtTCantidad41;
	private JTextField txtTCantidad50;
	private JPanel pnlTObsRef;
	private JTextField txtTObsRef0;
	private JTextField txtTObsRef1;
	private JTextField txtTObsRef2;
	private JTextField txtTObsRef3;
	private JTextField txtTObsRef8;
	private JLabel lblTCantidad;
	private JLabel lblTObsRef;
	private JPanel pnlCompArquitect1_2;
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
	private JPanel pnlInfObligatoria;
	private JPanel pnlIOTexts2;
	private JTextField txtObsGenDer;
	private JTextField txtResponsableContratista;
	private JTextField txtCargoDer;
	private JTextField txtFecha;
	private JPanel pnlIOTexts1;
	private JTextField txtObsGenIzq;
	private JTextField txtResponsableMineduc;
	private JTextField txtCargoIzq;
	private JPanel pnlIOEtiquetas1;
	private JLabel lblObsGenIzq;
	private JLabel lblResponsableMineduc;
	private JLabel lblCargoIzq;
	private JPanel pnlIOEtiquetas2;
	private JLabel lblObsGenDer;
	private JLabel lblResponsableContratista;
	private JLabel lblCargoDer;
	private JLabel lblFecha;
	private JTextField txtCACantidad00;
	private JTextField txtCACantidad01;
	private JTextField txtCACantidad10;
	private JTextField txtCACantidad11;
	private JTextField txtCACantidad20;
	private JTextField txtCACantidad21;
	private JTextField txtCACantidad30;
	private JTextField txtCACantidad31;
	private JTextField txtCACantidad40;
	private JTextField txtCACantidad51;
	private JTextField txtCAObs1;
	private JTextField txtCAObs2;
	private JTextField txtCAObs3;
	private JTextField txtCAObs4;
	private JTextField txtCAObs6;
	private JTextField txtCACantidad41;
	private JTextField txtCACantidad50;
	private JTextField txtCAObs5;
	private JTextField txtFPCantidad00;
	private JTextField txtFPCantidad01;
	private JTextField txtFPCantidad10;
	private JTextField txtFPCantidad11;
	private JTextField txtFPCantidad20;
	private JTextField txtFPCantidad21;
	private JTextField txtFPObsRef1;
	private JTextField txtFPObsRef2;
	private JTextField txtFPObsRef3;
	private JPanel pnlFachadaLateral;
	private JPanel panel_9;
	private JLabel label_9;
	private JLabel lblFachadaLateral;
	private JPanel panel_10;
	private JTextField txtFLCantidad01;
	private JPanel panel_11;
	private JTextField txtFLObsRef1;
	private JLabel label_13;
	private JLabel label_14;
	private JTextField txtCantidad61;
	private JTextField txtCantidad51;
	private JTextField txtTObsRef4;
	private JTextField txtTObsRef5;
	private JTextField txtTObsRef6;
	private JTextField txtTObsRef7;
	private JTextField txtTObsRef9;
	private JTextField txtTObsRef10;
	private JTextField txtTObsRef11;
	private JLabel lbl_pst4;
	private JLabel lbl_pst5;
	private JLabel lbl_pst6;
	private JLabel lbl_pst7;
	private JLabel lbl_pst8;
	private JLabel lbl_pst9;
	private JLabel lbl_pst10;
	private JTextField txtFLCantidad00;
	private JTextField txtCantidad00;
	private JTextField txtCantidad71;
	private JTextField txtCantidad60;
	private JTextField txtCantidad81;
	private JTextField txtCantidad70;
	private JTextField txtCantidad91;
	private JTextField txtCantidad80;
	private JTextField txtCantidad101;
	private JTextField txtCantidad90;
	private JTextField txtCantidad110;
	private JTextField txtCantidad100;
	private JTextField txtCantidad111;

	TInformacionObligatoria infor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MtTemplate frame = new MtTemplate("");
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
	public MtTemplate(String nombre) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1320, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		this.setResizable(false);
		this.setLocationRelativeTo(null);
		setTitle(nombre);

		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());
		llenarCabecera(cabecera);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 125, 1286, 560);
		contentPane.add(tabbedPane);

		JPanel pnlPestaña1 = new JPanel();
		tabbedPane.addTab("1-" + nombre, null, pnlPestaña1, null);
		pnlPestaña1.setLayout(null);

		JPanel pnlKitElectrico = new JPanel();
		pnlKitElectrico.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlKitElectrico.setBounds(10, 10, 414, 118);
		pnlPestaña1.add(pnlKitElectrico);
		pnlKitElectrico.setLayout(null);

		JPanel pnlTEEtiquetas = new JPanel();
		pnlTEEtiquetas.setBounds(3, 17, 199, 97);
		pnlKitElectrico.add(pnlTEEtiquetas);
		pnlTEEtiquetas.setLayout(new GridLayout(4, 0, 0, 0));

		JLabel lblTableroElectricoA = new JLabel("Luminarias LED  60w-5000 lum  ");
		lblTableroElectricoA.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEEtiquetas.add(lblTableroElectricoA);

		JLabel lblTableroElectricoB = new JLabel("Tomacorrientes  ");
		lblTableroElectricoB.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEEtiquetas.add(lblTableroElectricoB);

		JLabel lblTableroElectricoC = new JLabel("Interruptor  ");
		lblTableroElectricoC.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEEtiquetas.add(lblTableroElectricoC);

		JLabel lblTableroElectricoD = new JLabel("Kit cable el\u00E9ctrico  ");
		lblTableroElectricoD.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEEtiquetas.add(lblTableroElectricoD);

		JLabel lbl_kit_electrico = new JLabel("KIT ELECTRICO");
		lbl_kit_electrico.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_kit_electrico.setBounds(3, 1, 176, 14);
		pnlKitElectrico.add(lbl_kit_electrico);

		JPanel pnlTECantidad = new JPanel();
		pnlTECantidad.setBounds(210, 17, 55, 97);
		pnlKitElectrico.add(pnlTECantidad);
		pnlTECantidad.setLayout(new GridLayout(4, 2, 0, 0));

		txtTECantidad00 = new JTextField();
		txtTECantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtTECantidad00.setText("9");
		txtTECantidad00.setEditable(false);
		pnlTECantidad.add(txtTECantidad00);
		txtTECantidad00.setColumns(10);

		txtTECantidad01 = new JTextField();
		txtTECantidad01.setColumns(10);
		pnlTECantidad.add(txtTECantidad01);

		txtTECantidad10 = new JTextField();
		txtTECantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtTECantidad10.setText("40");
		txtTECantidad10.setEditable(false);
		txtTECantidad10.setColumns(10);
		pnlTECantidad.add(txtTECantidad10);

		txtTECantidad11 = new JTextField();
		txtTECantidad11.setColumns(10);
		pnlTECantidad.add(txtTECantidad11);

		txtTECantidad20 = new JTextField();
		txtTECantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtTECantidad20.setText("1");
		txtTECantidad20.setEditable(false);
		txtTECantidad20.setColumns(10);
		pnlTECantidad.add(txtTECantidad20);

		txtTECantidad21 = new JTextField();
		txtTECantidad21.setColumns(10);
		pnlTECantidad.add(txtTECantidad21);

		txtTECantidad30 = new JTextField();
		txtTECantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtTECantidad30.setText("1");
		txtTECantidad30.setEditable(false);
		txtTECantidad30.setColumns(10);
		pnlTECantidad.add(txtTECantidad30);

		txtTECantidad31 = new JTextField();
		txtTECantidad31.setColumns(10);
		pnlTECantidad.add(txtTECantidad31);

		JPanel pnlTEObsRef = new JPanel();
		pnlTEObsRef.setBounds(267, 17, 143, 97);
		pnlKitElectrico.add(pnlTEObsRef);
		pnlTEObsRef.setLayout(new GridLayout(4, 0, 0, 0));

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

		lblTECantidad = new JLabel("Cantidad");
		lblTECantidad.setBounds(210, 1, 55, 14);
		pnlKitElectrico.add(lblTECantidad);

		lblTEObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblTEObsRef.setBounds(267, 1, 143, 14);
		pnlKitElectrico.add(lblTEObsRef);

		pnlKitAguaLluvia = new JPanel();
		pnlKitAguaLluvia.setLayout(null);
		pnlKitAguaLluvia.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlKitAguaLluvia.setBounds(10, 150, 414, 163);
		pnlPestaña1.add(pnlKitAguaLluvia);

		pnlEDEtiquetas = new JPanel();
		pnlEDEtiquetas.setBounds(3, 17, 199, 144);
		pnlKitAguaLluvia.add(pnlEDEtiquetas);
		pnlEDEtiquetas.setLayout(new GridLayout(5, 0, 0, 0));

		lblDadosCimentacionBXB = new JLabel("Canal pl\u00E1stico PVC de L=3m  ");
		lblDadosCimentacionBXB.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlEDEtiquetas.add(lblDadosCimentacionBXB);

		lblReflectoresLed = new JLabel(
				"Kit de accesorios de conexi\u00F3n Agua de Lluvia (2 rejila, 4 codos 90\u00B0, 1/4 gl polipega, tornillos, abrazaderas))  ");
		lblReflectoresLed.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlEDEtiquetas.add(lblReflectoresLed);

		lblPostes6mts = new JLabel("Tuber\u00EDa de PVC 75mm L=3m  ");
		lblPostes6mts.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlEDEtiquetas.add(lblPostes6mts);

		lblEDCajasConexion = new JLabel("Tuber\u00EDa de PVC 75mm L=0.6m  ");
		lblEDCajasConexion.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlEDEtiquetas.add(lblEDCajasConexion);

		lblEDKitCableadoElectrico = new JLabel(
				"Kit para conexi\u00F3n de tuber\u00EDa 75 mm. (lija pliego, polipega 1/4 gal, 1 codo 90\u00B0)  ");
		lblEDKitCableadoElectrico.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlEDEtiquetas.add(lblEDKitCableadoElectrico);

		lbl_agua_lluvia = new JLabel("KIT AGUA LLUVIA");
		lbl_agua_lluvia.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_agua_lluvia.setBounds(3, 1, 211, 14);
		pnlKitAguaLluvia.add(lbl_agua_lluvia);

		pnlEDCantidad = new JPanel();
		pnlEDCantidad.setBounds(210, 17, 55, 144);
		pnlKitAguaLluvia.add(pnlEDCantidad);
		pnlEDCantidad.setLayout(new GridLayout(5, 2, 0, 0));

		txtEDCantidad00 = new JTextField();
		txtEDCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtEDCantidad00.setText("3");
		txtEDCantidad00.setEditable(false);
		txtEDCantidad00.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad00);

		txtEDCantidad01 = new JTextField();
		txtEDCantidad01.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad01);

		txtEDCantidad10 = new JTextField();
		txtEDCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtEDCantidad10.setText("2");
		txtEDCantidad10.setEditable(false);
		txtEDCantidad10.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad10);

		txtEDCantidad11 = new JTextField();
		txtEDCantidad11.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad11);

		txtEDCantidad20 = new JTextField();
		txtEDCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtEDCantidad20.setText("2");
		txtEDCantidad20.setEditable(false);
		txtEDCantidad20.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad20);

		txtEDCantidad21 = new JTextField();
		txtEDCantidad21.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad21);

		txtEDCantidad30 = new JTextField();
		txtEDCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtEDCantidad30.setText("1");
		txtEDCantidad30.setEditable(false);
		txtEDCantidad30.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad30);

		txtEDCantidad31 = new JTextField();
		txtEDCantidad31.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad31);

		txtEDCantidad40 = new JTextField();
		txtEDCantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtEDCantidad40.setText("1");
		txtEDCantidad40.setEditable(false);
		txtEDCantidad40.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad40);

		txtEDCantidad41 = new JTextField();
		txtEDCantidad41.setColumns(10);
		pnlEDCantidad.add(txtEDCantidad41);

		pnlEDObsRef = new JPanel();
		pnlEDObsRef.setBounds(267, 17, 143, 144);
		pnlKitAguaLluvia.add(pnlEDObsRef);
		pnlEDObsRef.setLayout(new GridLayout(5, 0, 0, 0));

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

		lblEDCantidad = new JLabel("Cantidad");
		lblEDCantidad.setBounds(210, 1, 55, 14);
		pnlKitAguaLluvia.add(lblEDCantidad);

		lblEDObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblEDObsRef.setBounds(267, 1, 143, 14);
		pnlKitAguaLluvia.add(lblEDObsRef);

		JPanel pnlCompArquitect1_1 = new JPanel();
		pnlCompArquitect1_1.setLayout(null);
		pnlCompArquitect1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlCompArquitect1_1.setBounds(10, 353, 414, 163);
		pnlPestaña1.add(pnlCompArquitect1_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(3, 17, 199, 144);
		pnlCompArquitect1_1.add(panel_1);
		panel_1.setLayout(new GridLayout(6, 0, 0, 0));

		JLabel lblPuertas = new JLabel("Puertas  ");
		lblPuertas.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblPuertas);

		JLabel lblBisagras = new JLabel("Bisagras  ");
		lblBisagras.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblBisagras);

		JLabel lblPerfilSfTipo = new JLabel("Perfil SF Tipo 12 MA-SF-12 para puerta  ");
		lblPerfilSfTipo.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblPerfilSfTipo);

		JLabel lblVentanaCorrederaCompuesta = new JLabel(
				"Ventana corredera, compuesta por tres hojas y dos carriles. UPVC con vidrio flotado de 3 mm de 3x1,10  ");
		lblVentanaCorrederaCompuesta.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblVentanaCorrederaCompuesta);

		JLabel lblPerfilSfTipo_2 = new JLabel("Perfil SF Tipo 12 MA-SF-12 para ventana  ");
		lblPerfilSfTipo_2.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblPerfilSfTipo_2);

		JLabel lblPerfilSfTipo_1 = new JLabel("Paneles TCB (8.8x5.8 m)  ");
		lblPerfilSfTipo_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblPerfilSfTipo_1);

		JLabel lblComponenteArquitectnico = new JLabel("COMPONENTE ARQUITECT\u00D3NICO");
		lblComponenteArquitectnico.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComponenteArquitectnico.setBounds(3, 1, 211, 14);
		pnlCompArquitect1_1.add(lblComponenteArquitectnico);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(210, 17, 55, 144);
		pnlCompArquitect1_1.add(panel_2);
		panel_2.setLayout(new GridLayout(6, 2, 0, 0));

		txtCACantidad00 = new JTextField();
		txtCACantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad00.setText("1");
		txtCACantidad00.setEditable(false);
		txtCACantidad00.setColumns(10);
		panel_2.add(txtCACantidad00);

		txtCACantidad01 = new JTextField();
		txtCACantidad01.setColumns(10);
		panel_2.add(txtCACantidad01);

		txtCACantidad10 = new JTextField();
		txtCACantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad10.setText("3");
		txtCACantidad10.setEditable(false);
		txtCACantidad10.setColumns(10);
		panel_2.add(txtCACantidad10);

		txtCACantidad11 = new JTextField();
		txtCACantidad11.setColumns(10);
		panel_2.add(txtCACantidad11);

		txtCACantidad20 = new JTextField();
		txtCACantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad20.setText("3");
		txtCACantidad20.setEditable(false);
		txtCACantidad20.setColumns(10);
		panel_2.add(txtCACantidad20);

		txtCACantidad21 = new JTextField();
		txtCACantidad21.setColumns(10);
		panel_2.add(txtCACantidad21);

		txtCACantidad30 = new JTextField();
		txtCACantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad30.setText("6");
		txtCACantidad30.setEditable(false);
		txtCACantidad30.setColumns(10);
		panel_2.add(txtCACantidad30);

		txtCACantidad31 = new JTextField();
		txtCACantidad31.setColumns(10);
		panel_2.add(txtCACantidad31);

		txtCACantidad40 = new JTextField();
		txtCACantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad40.setText("12");
		txtCACantidad40.setEditable(false);
		txtCACantidad40.setColumns(10);
		panel_2.add(txtCACantidad40);

		txtCACantidad41 = new JTextField();
		txtCACantidad41.setColumns(10);
		panel_2.add(txtCACantidad41);

		txtCACantidad50 = new JTextField();
		txtCACantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtCACantidad50.setText("1");
		txtCACantidad50.setEditable(false);
		txtCACantidad50.setColumns(10);
		panel_2.add(txtCACantidad50);

		txtCACantidad51 = new JTextField();
		txtCACantidad51.setColumns(10);
		panel_2.add(txtCACantidad51);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(267, 17, 143, 144);
		pnlCompArquitect1_1.add(panel_3);
		panel_3.setLayout(new GridLayout(6, 0, 0, 0));

		txtCAObs1 = new JTextField();
		txtCAObs1.setColumns(10);
		panel_3.add(txtCAObs1);

		txtCAObs2 = new JTextField();
		txtCAObs2.setColumns(10);
		panel_3.add(txtCAObs2);

		txtCAObs3 = new JTextField();
		txtCAObs3.setColumns(10);
		panel_3.add(txtCAObs3);

		txtCAObs4 = new JTextField();
		txtCAObs4.setColumns(10);
		panel_3.add(txtCAObs4);

		txtCAObs5 = new JTextField();
		txtCAObs5.setColumns(10);
		panel_3.add(txtCAObs5);

		txtCAObs6 = new JTextField();
		txtCAObs6.setColumns(10);
		panel_3.add(txtCAObs6);

		JLabel label_6 = new JLabel("Cantidad");
		label_6.setBounds(210, 1, 55, 14);
		pnlCompArquitect1_1.add(label_6);

		JLabel label_7 = new JLabel("Observaci\u00F3n/Referencia");
		label_7.setBounds(267, 1, 143, 14);
		pnlCompArquitect1_1.add(label_7);

		pnlCompArquitect1_2 = new JPanel();
		pnlCompArquitect1_2.setLayout(null);
		pnlCompArquitect1_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlCompArquitect1_2.setBounds(434, 10, 414, 86);
		pnlPestaña1.add(pnlCompArquitect1_2);

		pnlBAEtiquetas = new JPanel();
		pnlBAEtiquetas.setBounds(3, 17, 199, 65);
		pnlCompArquitect1_2.add(pnlBAEtiquetas);
		pnlBAEtiquetas.setLayout(new GridLayout(3, 0, 0, 0));

		lblKitCableadoBA = new JLabel("Paneles vynil piso (0,15x1,93 m)  ");
		lblKitCableadoBA.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlBAEtiquetas.add(lblKitCableadoBA);

		lblBATuberaPvc = new JLabel("Paneles EPS para cubierta I=7, a= 1 m  ");
		lblBATuberaPvc.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlBAEtiquetas.add(lblBATuberaPvc);

		lblBACajasConexion = new JLabel("Perfil SF Tipo 12 m-SF-12 para paredes  ");
		lblBACajasConexion.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlBAEtiquetas.add(lblBACajasConexion);

		lblKitBombaA = new JLabel("COMPONENTE ARQUITECT\u00D3NICO");
		lblKitBombaA.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKitBombaA.setBounds(3, 1, 176, 14);
		pnlCompArquitect1_2.add(lblKitBombaA);

		lblBACantidad = new JLabel("Cantidad");
		lblBACantidad.setBounds(210, 1, 55, 14);
		pnlCompArquitect1_2.add(lblBACantidad);

		lblBAObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblBAObsRef.setBounds(267, 1, 143, 14);
		pnlCompArquitect1_2.add(lblBAObsRef);

		pnlBACantidad = new JPanel();
		pnlBACantidad.setBounds(210, 17, 55, 65);
		pnlCompArquitect1_2.add(pnlBACantidad);
		pnlBACantidad.setLayout(new GridLayout(3, 2, 0, 0));

		txtBACantidad00 = new JTextField();
		txtBACantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtBACantidad00.setText("177");
		txtBACantidad00.setEditable(false);
		txtBACantidad00.setColumns(10);
		pnlBACantidad.add(txtBACantidad00);

		txtBACantidad01 = new JTextField();
		txtBACantidad01.setColumns(10);
		pnlBACantidad.add(txtBACantidad01);

		txtBACantidad10 = new JTextField();
		txtBACantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtBACantidad10.setText("9");
		txtBACantidad10.setEditable(false);
		txtBACantidad10.setColumns(10);
		pnlBACantidad.add(txtBACantidad10);

		txtBACantidad11 = new JTextField();
		txtBACantidad11.setColumns(10);
		pnlBACantidad.add(txtBACantidad11);

		txtBACantidad20 = new JTextField();
		txtBACantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtBACantidad20.setText("8");
		txtBACantidad20.setEditable(false);
		txtBACantidad20.setColumns(10);
		pnlBACantidad.add(txtBACantidad20);

		txtBACantidad21 = new JTextField();
		txtBACantidad21.setColumns(10);
		pnlBACantidad.add(txtBACantidad21);

		pnlBAObsRef = new JPanel();
		pnlBAObsRef.setBounds(267, 17, 143, 65);
		pnlCompArquitect1_2.add(pnlBAObsRef);
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

		pnlFachadaFrontal = new JPanel();
		pnlFachadaFrontal.setLayout(null);
		pnlFachadaFrontal.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlFachadaFrontal.setBounds(434, 99, 414, 118);
		pnlPestaña1.add(pnlFachadaFrontal);

		pnlAEEtiquetas = new JPanel();
		pnlAEEtiquetas.setBounds(3, 17, 199, 98);
		pnlFachadaFrontal.add(pnlAEEtiquetas);
		pnlAEEtiquetas.setLayout(new GridLayout(4, 0, 0, 0));

		lblDadosCimentacionAXA = new JLabel("Dados de cimentaci\u00F3n de postes AXAcm");
		pnlAEEtiquetas.add(lblDadosCimentacionAXA);

		lblLuminariasLed = new JLabel("Luminarias LED 120 W - 12000 lum");
		pnlAEEtiquetas.add(lblLuminariasLed);

		lblPostesSimples = new JLabel("Postes de 6 mts simples");
		pnlAEEtiquetas.add(lblPostesSimples);

		lblAEKitCableadoElectrico = new JLabel("Kit cableado el\u00E9ctrico AE");
		pnlAEEtiquetas.add(lblAEKitCableadoElectrico);

		lblAEKitAlumbradoExterior = new JLabel("FACHADA FRONTAL");
		lblAEKitAlumbradoExterior.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAEKitAlumbradoExterior.setBounds(3, 1, 176, 14);
		pnlFachadaFrontal.add(lblAEKitAlumbradoExterior);

		pnlAECantidad = new JPanel();
		pnlAECantidad.setBounds(210, 17, 55, 98);
		pnlFachadaFrontal.add(pnlAECantidad);
		pnlAECantidad.setLayout(new GridLayout(4, 2, 0, 0));

		txtAECantidad00 = new JTextField();
		txtAECantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtAECantidad00.setText("5");
		txtAECantidad00.setEditable(false);
		txtAECantidad00.setColumns(10);
		pnlAECantidad.add(txtAECantidad00);

		txtAECantidad01 = new JTextField();
		txtAECantidad01.setColumns(10);
		pnlAECantidad.add(txtAECantidad01);

		txtAECantidad10 = new JTextField();
		txtAECantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtAECantidad10.setText("1");
		txtAECantidad10.setEditable(false);
		txtAECantidad10.setColumns(10);
		pnlAECantidad.add(txtAECantidad10);

		txtAECantidad11 = new JTextField();
		txtAECantidad11.setColumns(10);
		pnlAECantidad.add(txtAECantidad11);

		txtAECantidad20 = new JTextField();
		txtAECantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtAECantidad20.setText("1");
		txtAECantidad20.setEditable(false);
		txtAECantidad20.setColumns(10);
		pnlAECantidad.add(txtAECantidad20);

		txtAECantidad21 = new JTextField();
		txtAECantidad21.setColumns(10);
		pnlAECantidad.add(txtAECantidad21);

		txtAECantidad30 = new JTextField();
		txtAECantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtAECantidad30.setText("3");
		txtAECantidad30.setEditable(false);
		txtAECantidad30.setColumns(10);
		pnlAECantidad.add(txtAECantidad30);

		txtAECantidad31 = new JTextField();
		txtAECantidad31.setColumns(10);
		pnlAECantidad.add(txtAECantidad31);

		pnlAEObsRef = new JPanel();
		pnlAEObsRef.setBounds(267, 17, 143, 98);
		pnlFachadaFrontal.add(pnlAEObsRef);
		pnlAEObsRef.setLayout(new GridLayout(4, 0, 0, 0));

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

		lblAECantidad = new JLabel("Cantidad");
		lblAECantidad.setBounds(210, 1, 55, 14);
		pnlFachadaFrontal.add(lblAECantidad);

		lblAEObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblAEObsRef.setBounds(267, 1, 143, 14);
		pnlFachadaFrontal.add(lblAEObsRef);

		JPanel pnlFachadaPosterior = new JPanel();
		pnlFachadaPosterior.setLayout(null);
		pnlFachadaPosterior.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlFachadaPosterior.setBounds(434, 220, 414, 95);
		pnlPestaña1.add(pnlFachadaPosterior);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(3, 17, 199, 73);
		pnlFachadaPosterior.add(panel_5);
		panel_5.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_1 = new JLabel("Kit de cableado el\u00E9ctrico BA");
		panel_5.add(label_1);

		JLabel label_2 = new JLabel("Tuber\u00EDa PVC 2\u00B4para cableado l=6m");
		panel_5.add(label_2);

		JLabel label_3 = new JLabel("Cajas de Conexi\u00F3n  0,60x0,60 mt");
		panel_5.add(label_3);

		JLabel lblFachadaPosterior = new JLabel("FACHADA POSTERIOR");
		lblFachadaPosterior.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFachadaPosterior.setBounds(3, 1, 176, 14);
		pnlFachadaPosterior.add(lblFachadaPosterior);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(210, 17, 55, 73);
		pnlFachadaPosterior.add(panel_6);
		panel_6.setLayout(new GridLayout(3, 2, 0, 0));

		txtFPCantidad00 = new JTextField();
		txtFPCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtFPCantidad00.setText("3");
		txtFPCantidad00.setEditable(false);
		txtFPCantidad00.setColumns(10);
		panel_6.add(txtFPCantidad00);

		txtFPCantidad01 = new JTextField();
		txtFPCantidad01.setColumns(10);
		panel_6.add(txtFPCantidad01);

		txtFPCantidad10 = new JTextField();
		txtFPCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtFPCantidad10.setText("6");
		txtFPCantidad10.setEditable(false);
		txtFPCantidad10.setColumns(10);
		panel_6.add(txtFPCantidad10);

		txtFPCantidad11 = new JTextField();
		txtFPCantidad11.setColumns(10);
		panel_6.add(txtFPCantidad11);

		txtFPCantidad20 = new JTextField();
		txtFPCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtFPCantidad20.setText("6");
		txtFPCantidad20.setEditable(false);
		txtFPCantidad20.setColumns(10);
		panel_6.add(txtFPCantidad20);

		txtFPCantidad21 = new JTextField();
		txtFPCantidad21.setColumns(10);
		panel_6.add(txtFPCantidad21);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(267, 17, 143, 73);
		pnlFachadaPosterior.add(panel_7);
		panel_7.setLayout(new GridLayout(3, 0, 0, 0));

		txtFPObsRef1 = new JTextField();
		txtFPObsRef1.setColumns(10);
		panel_7.add(txtFPObsRef1);

		txtFPObsRef2 = new JTextField();
		txtFPObsRef2.setColumns(10);
		panel_7.add(txtFPObsRef2);

		txtFPObsRef3 = new JTextField();
		txtFPObsRef3.setColumns(10);
		panel_7.add(txtFPObsRef3);

		JLabel label_5 = new JLabel("Cantidad");
		label_5.setBounds(210, 1, 55, 14);
		pnlFachadaPosterior.add(label_5);

		JLabel label_8 = new JLabel("Observaci\u00F3n/Referencia");
		label_8.setBounds(267, 1, 143, 14);
		pnlFachadaPosterior.add(label_8);

		pnlFachadaLateral = new JPanel();
		pnlFachadaLateral.setLayout(null);
		pnlFachadaLateral.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlFachadaLateral.setBounds(434, 317, 414, 49);
		pnlPestaña1.add(pnlFachadaLateral);

		panel_9 = new JPanel();
		panel_9.setBounds(3, 17, 199, 29);
		pnlFachadaLateral.add(panel_9);
		panel_9.setLayout(new GridLayout(1, 0, 0, 0));

		label_9 = new JLabel("Kit de cableado el\u00E9ctrico BA");
		panel_9.add(label_9);

		lblFachadaLateral = new JLabel("FACHADA LATERAL");
		lblFachadaLateral.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFachadaLateral.setBounds(3, 1, 176, 14);
		pnlFachadaLateral.add(lblFachadaLateral);

		panel_10 = new JPanel();
		panel_10.setBounds(210, 17, 55, 29);
		pnlFachadaLateral.add(panel_10);
		panel_10.setLayout(new GridLayout(1, 2, 0, 0));

		txtFLCantidad00 = new JTextField();
		txtFLCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtFLCantidad00.setText("6");
		txtFLCantidad00.setEditable(false);
		txtFLCantidad00.setColumns(10);
		panel_10.add(txtFLCantidad00);

		txtFLCantidad01 = new JTextField();
		txtFLCantidad01.setColumns(10);
		panel_10.add(txtFLCantidad01);

		panel_11 = new JPanel();
		panel_11.setBounds(267, 17, 143, 29);
		pnlFachadaLateral.add(panel_11);
		panel_11.setLayout(new GridLayout(1, 0, 0, 0));

		txtFLObsRef1 = new JTextField();
		txtFLObsRef1.setColumns(10);
		panel_11.add(txtFLObsRef1);

		label_13 = new JLabel("Cantidad");
		label_13.setBounds(210, 1, 55, 14);
		pnlFachadaLateral.add(label_13);

		label_14 = new JLabel("Observaci\u00F3n/Referencia");
		label_14.setBounds(267, 1, 143, 14);
		pnlFachadaLateral.add(label_14);

		pnlComponenteEst = new JPanel();
		pnlComponenteEst.setLayout(null);
		pnlComponenteEst.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlComponenteEst.setBounds(858, 11, 414, 280);
		pnlPestaña1.add(pnlComponenteEst);

		pnlTEtiquetas = new JPanel();
		pnlTEtiquetas.setBounds(3, 17, 199, 260);
		pnlComponenteEst.add(pnlTEtiquetas);
		pnlTEtiquetas.setLayout(new GridLayout(12, 0, 0, 0));

		lblTKitCableadoTR = new JLabel("Dados cimentaci\u00F3n  ");
		lblTKitCableadoTR.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEtiquetas.add(lblTKitCableadoTR);

		lbl_pst_datos_cim = new JLabel("Perfil SF Tipo 1  ");
		lbl_pst_datos_cim.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEtiquetas.add(lbl_pst_datos_cim);

		lbl_pst2 = new JLabel("Perfil SF Tipo 2  ");
		lbl_pst2.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEtiquetas.add(lbl_pst2);

		lbl_pst3 = new JLabel("Perfil SF Tipo 3  ");
		lbl_pst3.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEtiquetas.add(lbl_pst3);

		lbl_pst4 = new JLabel("Perfil SF Tipo 4  ");
		lbl_pst4.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEtiquetas.add(lbl_pst4);

		lbl_pst5 = new JLabel("Perfil SF Tipo 5  ");
		lbl_pst5.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEtiquetas.add(lbl_pst5);

		lbl_pst6 = new JLabel("Perfil SF Tipo 6  ");
		lbl_pst6.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEtiquetas.add(lbl_pst6);

		lbl_pst7 = new JLabel("Perfil SF Tipo 7  ");
		lbl_pst7.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEtiquetas.add(lbl_pst7);

		lbl_pst8 = new JLabel("Perfil SF Tipo 8  ");
		lbl_pst8.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEtiquetas.add(lbl_pst8);

		lbl_pst9 = new JLabel("Perfil SF Tipo 9  ");
		lbl_pst9.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEtiquetas.add(lbl_pst9);

		lbl_pst10 = new JLabel("Perfil SF Tipo 10  ");
		lbl_pst10.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEtiquetas.add(lbl_pst10);

		lbl_pst11 = new JLabel("Perfil SF Tipo 11  ");
		lbl_pst11.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlTEtiquetas.add(lbl_pst11);

		lblTKitTransformador = new JLabel("COMPONENTE ESTRUCTURAL");
		lblTKitTransformador.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTKitTransformador.setBounds(3, 1, 176, 14);
		pnlComponenteEst.add(lblTKitTransformador);

		pnlTCantidad = new JPanel();
		pnlTCantidad.setBounds(210, 17, 55, 260);
		pnlComponenteEst.add(pnlTCantidad);
		pnlTCantidad.setLayout(new GridLayout(12, 2, 0, 0));

		txtCantidad00 = new JTextField();
		txtCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad00.setText("15");
		txtCantidad00.setEditable(false);
		txtCantidad00.setColumns(10);
		pnlTCantidad.add(txtCantidad00);

		txtTCantidad01 = new JTextField();
		txtTCantidad01.setColumns(10);
		pnlTCantidad.add(txtTCantidad01);

		txtTCantidad10 = new JTextField();
		txtTCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtTCantidad10.setText("2");
		txtTCantidad10.setEditable(false);
		txtTCantidad10.setColumns(10);
		pnlTCantidad.add(txtTCantidad10);

		txtTCantidad11 = new JTextField();
		txtTCantidad11.setColumns(10);
		pnlTCantidad.add(txtTCantidad11);

		txtTCantidad20 = new JTextField();
		txtTCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtTCantidad20.setText("2");
		txtTCantidad20.setEditable(false);
		txtTCantidad20.setColumns(10);
		pnlTCantidad.add(txtTCantidad20);

		txtTCantidad21 = new JTextField();
		txtTCantidad21.setColumns(10);
		pnlTCantidad.add(txtTCantidad21);

		txtTCantidad30 = new JTextField();
		txtTCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtTCantidad30.setText("20");
		txtTCantidad30.setEditable(false);
		txtTCantidad30.setColumns(10);
		pnlTCantidad.add(txtTCantidad30);

		txtTCantidad31 = new JTextField();
		txtTCantidad31.setColumns(10);
		pnlTCantidad.add(txtTCantidad31);

		txtTCantidad40 = new JTextField();
		txtTCantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtTCantidad40.setText("6");
		txtTCantidad40.setEditable(false);
		txtTCantidad40.setColumns(10);
		pnlTCantidad.add(txtTCantidad40);

		txtTCantidad41 = new JTextField();
		txtTCantidad41.setColumns(10);
		pnlTCantidad.add(txtTCantidad41);

		txtTCantidad50 = new JTextField();
		txtTCantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtTCantidad50.setText("40");
		txtTCantidad50.setEditable(false);
		txtTCantidad50.setColumns(10);
		pnlTCantidad.add(txtTCantidad50);

		txtCantidad51 = new JTextField();
		txtCantidad51.setColumns(10);
		pnlTCantidad.add(txtCantidad51);

		txtCantidad60 = new JTextField();
		txtCantidad60.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad60.setText("40");
		txtCantidad60.setEditable(false);
		txtCantidad60.setColumns(10);
		pnlTCantidad.add(txtCantidad60);

		txtCantidad61 = new JTextField();
		txtCantidad61.setColumns(10);
		pnlTCantidad.add(txtCantidad61);

		txtCantidad70 = new JTextField();
		txtCantidad70.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad70.setText("2");
		txtCantidad70.setEditable(false);
		txtCantidad70.setColumns(10);
		pnlTCantidad.add(txtCantidad70);

		txtCantidad71 = new JTextField();
		txtCantidad71.setColumns(10);
		pnlTCantidad.add(txtCantidad71);

		txtCantidad80 = new JTextField();
		txtCantidad80.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad80.setText("2");
		txtCantidad80.setEditable(false);
		txtCantidad80.setColumns(10);
		pnlTCantidad.add(txtCantidad80);

		txtCantidad81 = new JTextField();
		txtCantidad81.setColumns(10);
		pnlTCantidad.add(txtCantidad81);

		txtCantidad90 = new JTextField();
		txtCantidad90.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad90.setText("20");
		txtCantidad90.setEditable(false);
		txtCantidad90.setColumns(10);
		pnlTCantidad.add(txtCantidad90);

		txtCantidad91 = new JTextField();
		txtCantidad91.setColumns(10);
		pnlTCantidad.add(txtCantidad91);

		txtCantidad100 = new JTextField();
		txtCantidad100.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad100.setText("6");
		txtCantidad100.setEditable(false);
		txtCantidad100.setColumns(10);
		pnlTCantidad.add(txtCantidad100);

		txtCantidad101 = new JTextField();
		txtCantidad101.setColumns(10);
		pnlTCantidad.add(txtCantidad101);

		txtCantidad110 = new JTextField();
		txtCantidad110.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad110.setText("40");
		txtCantidad110.setEditable(false);
		txtCantidad110.setColumns(10);
		pnlTCantidad.add(txtCantidad110);

		txtCantidad111 = new JTextField();
		txtCantidad111.setColumns(10);
		pnlTCantidad.add(txtCantidad111);

		pnlTObsRef = new JPanel();
		pnlTObsRef.setBounds(267, 17, 143, 260);
		pnlComponenteEst.add(pnlTObsRef);
		pnlTObsRef.setLayout(new GridLayout(12, 0, 0, 0));

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

		txtTObsRef5 = new JTextField();
		txtTObsRef5.setColumns(10);
		pnlTObsRef.add(txtTObsRef5);

		txtTObsRef6 = new JTextField();
		txtTObsRef6.setColumns(10);
		pnlTObsRef.add(txtTObsRef6);

		txtTObsRef7 = new JTextField();
		txtTObsRef7.setColumns(10);
		pnlTObsRef.add(txtTObsRef7);

		txtTObsRef8 = new JTextField();
		txtTObsRef8.setColumns(10);
		pnlTObsRef.add(txtTObsRef8);

		txtTObsRef9 = new JTextField();
		txtTObsRef9.setColumns(10);
		pnlTObsRef.add(txtTObsRef9);

		txtTObsRef10 = new JTextField();
		txtTObsRef10.setColumns(10);
		pnlTObsRef.add(txtTObsRef10);

		txtTObsRef11 = new JTextField();
		txtTObsRef11.setColumns(10);
		pnlTObsRef.add(txtTObsRef11);

		lblTCantidad = new JLabel("Cantidad");
		lblTCantidad.setBounds(210, 1, 55, 14);
		pnlComponenteEst.add(lblTCantidad);

		lblTObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblTObsRef.setBounds(267, 1, 143, 14);
		pnlComponenteEst.add(lblTObsRef);

		InformacionObligatoriaV infoObligatoria = new InformacionObligatoriaV(860, 312);
		pnlPestaña1.add(infoObligatoria.getPnlInformacionObl());

		cabecera.getBtnRegistrar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ServicioInfoObligatoria srvInfoOblig = new ComponenteInfoObligatoria();
				infor = cargarInfoObligatoria(infoObligatoria);

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
		LinkedList<TdetalleFicha> listaArquitectonico = new LinkedList<>();
		LinkedList<TdetalleFicha> listaFrontal = new LinkedList<>();
		LinkedList<TdetalleFicha> listaPosterior = new LinkedList<>();
		LinkedList<TdetalleFicha> listaLateral = new LinkedList<>();
		LinkedList<TdetalleFicha> listaEstructural = new LinkedList<>();
		ServicioFichaMA servFicha = new ComponenteFichaMA();
		// infor = cargarInfoObligatoria(inforV);

		TGrupo grupoTmp = servFicha.buscarGrupo("Kit eléctrico");
		Integer updateFicha = servFicha.buscarUpdateFicha();
		TFicha ficha = null;
		listaElectrico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtTECantidad01.getText()), txtTEObsRef0.getText(), updateFicha));
		listaElectrico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtTECantidad11.getText()), txtTEObsRef1.getText(), updateFicha));
		listaElectrico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtTECantidad21.getText()), txtTEObsRef2.getText(), updateFicha));
		listaElectrico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtTECantidad31.getText()), txtTEObsRef3.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Kit agua lluvia");
		listaAL.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtEDCantidad01.getText()), txtEDObsRef0.getText(), updateFicha));
		listaAL.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtEDCantidad11.getText()), txtEDObsRef1.getText(), updateFicha));
		listaAL.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtEDCantidad21.getText()), txtEDObsRef2.getText(), updateFicha));
		listaAL.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtEDCantidad31.getText()), txtEDObsRef3.getText(), updateFicha));
		listaAL.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtEDCantidad41.getText()), txtEDObsRef4.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Componente arquitectònico");
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad01.getText()), txtCAObs1.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad11.getText()), txtCAObs2.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad21.getText()), txtCAObs3.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad31.getText()), txtCAObs4.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad41.getText()), txtCAObs5.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad51.getText()), txtCAObs6.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtBACantidad01.getText()), txtBAObsRef0.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtBACantidad11.getText()), txtBAObsRef1.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtBACantidad21.getText()), txtBAObsRef2.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Fachada frontal");
		listaFrontal.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtAECantidad01.getText()), txtAEObsRef0.getText(), updateFicha));
		listaFrontal.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtAECantidad11.getText()), txtAEObsRef1.getText(), updateFicha));
		listaFrontal.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtAECantidad21.getText()), txtAEObsRef2.getText(), updateFicha));
		listaFrontal.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtAECantidad31.getText()), txtAEObsRef3.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Fachada posterior");
		listaPosterior.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFPCantidad01.getText()), txtFPObsRef1.getText(), updateFicha));
		listaPosterior.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFPCantidad11.getText()), txtFPObsRef2.getText(), updateFicha));
		listaPosterior.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFPCantidad21.getText()), txtFPObsRef3.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Fachada Lateral");
		listaLateral.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFLCantidad01.getText()), txtFLObsRef1.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Componente estructural");
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtTCantidad01.getText()), txtTObsRef0.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtTCantidad11.getText()), txtTObsRef1.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtTCantidad21.getText()), txtTObsRef2.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtTCantidad31.getText()), txtTObsRef3.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtTCantidad41.getText()), txtTObsRef4.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad51.getText()), txtTObsRef5.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad61.getText()), txtTObsRef6.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad71.getText()), txtTObsRef7.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad81.getText()), txtTObsRef8.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad91.getText()), txtTObsRef9.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad101.getText()), txtTObsRef10.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCantidad111.getText()), txtTObsRef11.getText(), updateFicha));

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

	public JTextField getTxtTECantidad01() {
		return txtTECantidad01;
	}

	public void setTxtTECantidad01(JTextField txtTECantidad01) {
		this.txtTECantidad01 = txtTECantidad01;
	}

	public JTextField getTxtTECantidad11() {
		return txtTECantidad11;
	}

	public void setTxtTECantidad11(JTextField txtTECantidad11) {
		this.txtTECantidad11 = txtTECantidad11;
	}

	public JTextField getTxtTECantidad21() {
		return txtTECantidad21;
	}

	public void setTxtTECantidad21(JTextField txtTECantidad21) {
		this.txtTECantidad21 = txtTECantidad21;
	}

	public JTextField getTxtTECantidad31() {
		return txtTECantidad31;
	}

	public void setTxtTECantidad31(JTextField txtTECantidad31) {
		this.txtTECantidad31 = txtTECantidad31;
	}

	public JTextField getTxtTEObsRef1() {
		return txtTEObsRef1;
	}

	public void setTxtTEObsRef1(JTextField txtTEObsRef1) {
		this.txtTEObsRef1 = txtTEObsRef1;
	}

	public JTextField getTxtTEObsRef0() {
		return txtTEObsRef0;
	}

	public void setTxtTEObsRef0(JTextField txtTEObsRef0) {
		this.txtTEObsRef0 = txtTEObsRef0;
	}

	public JTextField getTxtTEObsRef2() {
		return txtTEObsRef2;
	}

	public void setTxtTEObsRef2(JTextField txtTEObsRef2) {
		this.txtTEObsRef2 = txtTEObsRef2;
	}

	public JTextField getTxtTEObsRef3() {
		return txtTEObsRef3;
	}

	public void setTxtTEObsRef3(JTextField txtTEObsRef3) {
		this.txtTEObsRef3 = txtTEObsRef3;
	}

	public JTextField getTxtEDCantidad01() {
		return txtEDCantidad01;
	}

	public void setTxtEDCantidad01(JTextField txtEDCantidad01) {
		this.txtEDCantidad01 = txtEDCantidad01;
	}

	public JTextField getTxtEDCantidad11() {
		return txtEDCantidad11;
	}

	public void setTxtEDCantidad11(JTextField txtEDCantidad11) {
		this.txtEDCantidad11 = txtEDCantidad11;
	}

	public JTextField getTxtEDCantidad21() {
		return txtEDCantidad21;
	}

	public void setTxtEDCantidad21(JTextField txtEDCantidad21) {
		this.txtEDCantidad21 = txtEDCantidad21;
	}

	public JTextField getTxtEDCantidad31() {
		return txtEDCantidad31;
	}

	public void setTxtEDCantidad31(JTextField txtEDCantidad31) {
		this.txtEDCantidad31 = txtEDCantidad31;
	}

	public JTextField getTxtEDCantidad41() {
		return txtEDCantidad41;
	}

	public void setTxtEDCantidad41(JTextField txtEDCantidad41) {
		this.txtEDCantidad41 = txtEDCantidad41;
	}

	public JTextField getTxtEDObsRef0() {
		return txtEDObsRef0;
	}

	public void setTxtEDObsRef0(JTextField txtEDObsRef0) {
		this.txtEDObsRef0 = txtEDObsRef0;
	}

	public JTextField getTxtEDObsRef1() {
		return txtEDObsRef1;
	}

	public void setTxtEDObsRef1(JTextField txtEDObsRef1) {
		this.txtEDObsRef1 = txtEDObsRef1;
	}

	public JTextField getTxtEDObsRef2() {
		return txtEDObsRef2;
	}

	public void setTxtEDObsRef2(JTextField txtEDObsRef2) {
		this.txtEDObsRef2 = txtEDObsRef2;
	}

	public JTextField getTxtEDObsRef3() {
		return txtEDObsRef3;
	}

	public void setTxtEDObsRef3(JTextField txtEDObsRef3) {
		this.txtEDObsRef3 = txtEDObsRef3;
	}

	public JTextField getTxtEDObsRef4() {
		return txtEDObsRef4;
	}

	public void setTxtEDObsRef4(JTextField txtEDObsRef4) {
		this.txtEDObsRef4 = txtEDObsRef4;
	}

	public JTextField getTxtAECantidad01() {
		return txtAECantidad01;
	}

	public void setTxtAECantidad01(JTextField txtAECantidad01) {
		this.txtAECantidad01 = txtAECantidad01;
	}

	public JTextField getTxtAECantidad11() {
		return txtAECantidad11;
	}

	public void setTxtAECantidad11(JTextField txtAECantidad11) {
		this.txtAECantidad11 = txtAECantidad11;
	}

	public JTextField getTxtAECantidad21() {
		return txtAECantidad21;
	}

	public void setTxtAECantidad21(JTextField txtAECantidad21) {
		this.txtAECantidad21 = txtAECantidad21;
	}

	public JTextField getTxtAECantidad31() {
		return txtAECantidad31;
	}

	public void setTxtAECantidad31(JTextField txtAECantidad31) {
		this.txtAECantidad31 = txtAECantidad31;
	}

	public JTextField getTxtAEObsRef0() {
		return txtAEObsRef0;
	}

	public void setTxtAEObsRef0(JTextField txtAEObsRef0) {
		this.txtAEObsRef0 = txtAEObsRef0;
	}

	public JTextField getTxtAEObsRef1() {
		return txtAEObsRef1;
	}

	public void setTxtAEObsRef1(JTextField txtAEObsRef1) {
		this.txtAEObsRef1 = txtAEObsRef1;
	}

	public JTextField getTxtAEObsRef2() {
		return txtAEObsRef2;
	}

	public void setTxtAEObsRef2(JTextField txtAEObsRef2) {
		this.txtAEObsRef2 = txtAEObsRef2;
	}

	public JTextField getTxtAEObsRef3() {
		return txtAEObsRef3;
	}

	public void setTxtAEObsRef3(JTextField txtAEObsRef3) {
		this.txtAEObsRef3 = txtAEObsRef3;
	}

	public JTextField getTxtTCantidad01() {
		return txtTCantidad01;
	}

	public void setTxtTCantidad01(JTextField txtTCantidad01) {
		this.txtTCantidad01 = txtTCantidad01;
	}

	public JTextField getTxtTCantidad11() {
		return txtTCantidad11;
	}

	public void setTxtTCantidad11(JTextField txtTCantidad11) {
		this.txtTCantidad11 = txtTCantidad11;
	}

	public JTextField getTxtTCantidad21() {
		return txtTCantidad21;
	}

	public void setTxtTCantidad21(JTextField txtTCantidad21) {
		this.txtTCantidad21 = txtTCantidad21;
	}

	public JTextField getTxtTCantidad31() {
		return txtTCantidad31;
	}

	public void setTxtTCantidad31(JTextField txtTCantidad31) {
		this.txtTCantidad31 = txtTCantidad31;
	}

	public JTextField getTxtTCantidad41() {
		return txtTCantidad41;
	}

	public void setTxtTCantidad41(JTextField txtTCantidad41) {
		this.txtTCantidad41 = txtTCantidad41;
	}

	public JTextField getTxtTObsRef0() {
		return txtTObsRef0;
	}

	public void setTxtTObsRef0(JTextField txtTObsRef0) {
		this.txtTObsRef0 = txtTObsRef0;
	}

	public JTextField getTxtTObsRef1() {
		return txtTObsRef1;
	}

	public void setTxtTObsRef1(JTextField txtTObsRef1) {
		this.txtTObsRef1 = txtTObsRef1;
	}

	public JTextField getTxtTObsRef2() {
		return txtTObsRef2;
	}

	public void setTxtTObsRef2(JTextField txtTObsRef2) {
		this.txtTObsRef2 = txtTObsRef2;
	}

	public JTextField getTxtTObsRef3() {
		return txtTObsRef3;
	}

	public void setTxtTObsRef3(JTextField txtTObsRef3) {
		this.txtTObsRef3 = txtTObsRef3;
	}

	public JTextField getTxtTObsRef8() {
		return txtTObsRef8;
	}

	public void setTxtTObsRef8(JTextField txtTObsRef8) {
		this.txtTObsRef8 = txtTObsRef8;
	}

	public JTextField getTxtBACantidad01() {
		return txtBACantidad01;
	}

	public void setTxtBACantidad01(JTextField txtBACantidad01) {
		this.txtBACantidad01 = txtBACantidad01;
	}

	public JTextField getTxtBACantidad11() {
		return txtBACantidad11;
	}

	public void setTxtBACantidad11(JTextField txtBACantidad11) {
		this.txtBACantidad11 = txtBACantidad11;
	}

	public JTextField getTxtBACantidad21() {
		return txtBACantidad21;
	}

	public void setTxtBACantidad21(JTextField txtBACantidad21) {
		this.txtBACantidad21 = txtBACantidad21;
	}

	public JTextField getTxtBAObsRef0() {
		return txtBAObsRef0;
	}

	public void setTxtBAObsRef0(JTextField txtBAObsRef0) {
		this.txtBAObsRef0 = txtBAObsRef0;
	}

	public JTextField getTxtBAObsRef1() {
		return txtBAObsRef1;
	}

	public void setTxtBAObsRef1(JTextField txtBAObsRef1) {
		this.txtBAObsRef1 = txtBAObsRef1;
	}

	public JTextField getTxtBAObsRef2() {
		return txtBAObsRef2;
	}

	public void setTxtBAObsRef2(JTextField txtBAObsRef2) {
		this.txtBAObsRef2 = txtBAObsRef2;
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

	public JTextField getTxtCACantidad51() {
		return txtCACantidad51;
	}

	public void setTxtCACantidad51(JTextField txtCACantidad51) {
		this.txtCACantidad51 = txtCACantidad51;
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

	public JTextField getTxtCAObs6() {
		return txtCAObs6;
	}

	public void setTxtCAObs6(JTextField txtCAObs6) {
		this.txtCAObs6 = txtCAObs6;
	}

	public JTextField getTxtCACantidad41() {
		return txtCACantidad41;
	}

	public void setTxtCACantidad41(JTextField txtCACantidad41) {
		this.txtCACantidad41 = txtCACantidad41;
	}

	public JTextField getTxtCAObs5() {
		return txtCAObs5;
	}

	public void setTxtCAObs5(JTextField txtCAObs5) {
		this.txtCAObs5 = txtCAObs5;
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

	public JTextField getTxtFPObsRef1() {
		return txtFPObsRef1;
	}

	public void setTxtFPObsRef1(JTextField txtFPObsRef1) {
		this.txtFPObsRef1 = txtFPObsRef1;
	}

	public JTextField getTxtFPObsRef2() {
		return txtFPObsRef2;
	}

	public void setTxtFPObsRef2(JTextField txtFPObsRef2) {
		this.txtFPObsRef2 = txtFPObsRef2;
	}

	public JTextField getTxtFPObsRef3() {
		return txtFPObsRef3;
	}

	public void setTxtFPObsRef3(JTextField txtFPObsRef3) {
		this.txtFPObsRef3 = txtFPObsRef3;
	}

	public JTextField getTxtFLCantidad01() {
		return txtFLCantidad01;
	}

	public void setTxtFLCantidad01(JTextField txtFLCantidad01) {
		this.txtFLCantidad01 = txtFLCantidad01;
	}

	public JTextField getTxtFLObsRef1() {
		return txtFLObsRef1;
	}

	public void setTxtFLObsRef1(JTextField txtFLObsRef1) {
		this.txtFLObsRef1 = txtFLObsRef1;
	}

	public JTextField getTxtCantidad61() {
		return txtCantidad61;
	}

	public void setTxtCantidad61(JTextField txtCantidad61) {
		this.txtCantidad61 = txtCantidad61;
	}

	public JTextField getTxtCantidad51() {
		return txtCantidad51;
	}

	public void setTxtCantidad51(JTextField txtCantidad51) {
		this.txtCantidad51 = txtCantidad51;
	}

	public JTextField getTxtTObsRef4() {
		return txtTObsRef4;
	}

	public void setTxtTObsRef4(JTextField txtTObsRef4) {
		this.txtTObsRef4 = txtTObsRef4;
	}

	public JTextField getTxtTObsRef5() {
		return txtTObsRef5;
	}

	public void setTxtTObsRef5(JTextField txtTObsRef5) {
		this.txtTObsRef5 = txtTObsRef5;
	}

	public JTextField getTxtTObsRef6() {
		return txtTObsRef6;
	}

	public void setTxtTObsRef6(JTextField txtTObsRef6) {
		this.txtTObsRef6 = txtTObsRef6;
	}

	public JTextField getTxtTObsRef7() {
		return txtTObsRef7;
	}

	public void setTxtTObsRef7(JTextField txtTObsRef7) {
		this.txtTObsRef7 = txtTObsRef7;
	}

	public JTextField getTxtTObsRef9() {
		return txtTObsRef9;
	}

	public void setTxtTObsRef9(JTextField txtTObsRef9) {
		this.txtTObsRef9 = txtTObsRef9;
	}

	public JTextField getTxtTObsRef10() {
		return txtTObsRef10;
	}

	public void setTxtTObsRef10(JTextField txtTObsRef10) {
		this.txtTObsRef10 = txtTObsRef10;
	}

	public JTextField getTxtTObsRef11() {
		return txtTObsRef11;
	}

	public void setTxtTObsRef11(JTextField txtTObsRef11) {
		this.txtTObsRef11 = txtTObsRef11;
	}

	public JTextField getTxtCantidad71() {
		return txtCantidad71;
	}

	public void setTxtCantidad71(JTextField txtCantidad71) {
		this.txtCantidad71 = txtCantidad71;
	}

	public JTextField getTxtCantidad81() {
		return txtCantidad81;
	}

	public void setTxtCantidad81(JTextField txtCantidad81) {
		this.txtCantidad81 = txtCantidad81;
	}

	public JTextField getTxtCantidad91() {
		return txtCantidad91;
	}

	public void setTxtCantidad91(JTextField txtCantidad91) {
		this.txtCantidad91 = txtCantidad91;
	}

	public JTextField getTxtCantidad101() {
		return txtCantidad101;
	}

	public void setTxtCantidad101(JTextField txtCantidad101) {
		this.txtCantidad101 = txtCantidad101;
	}

	public JTextField getTxtCantidad111() {
		return txtCantidad111;
	}

	public void setTxtCantidad111(JTextField txtCantidad111) {
		this.txtCantidad111 = txtCantidad111;
	}

}
