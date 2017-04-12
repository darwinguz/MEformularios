package com.capa.presentacion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.capa.datos.TFicha;
import com.capa.datos.TGrupo;
import com.capa.datos.TInformacionObligatoria;
import com.capa.datos.TdetalleFicha;
import com.capa.negocios.ComponenteFicha;
import com.capa.negocios.ComponenteInfoObligatoria;
import com.capa.negocios.ServicioFicha;
import com.capa.negocios.ServicioInfoObligatoria;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import static com.capa.util.Utilitarios.*;
import static com.capa.util.Validaciones.*;

public class PGTemplate extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtKECantidad40;
	private JTextField txtKECantidad41;
	private JTextField txtKECantidad31;
	private JTextField txtKECantidad30;
	private JTextField txtKECantidad20;
	private JTextField txtKECantidad21;
	private JTextField txtKECantidad11;
	private JTextField txtKECantidad10;
	private JTextField txtKECantidad00;
	private JTextField txtKECantidad01;
	private JTextField txtKEObs0;
	private JTextField txtKEObs1;
	private JTextField txtKEObs3;
	private JTextField txtKEObs4;
	private JTextField txtALCantidad40;
	private JTextField txtALCantidad41;
	private JTextField txtALObs4;
	private JTextField txtALObs3;
	private JTextField txtALCantidad31;
	private JTextField txtALCantidad30;
	private JTextField txtALCantidad20;
	private JTextField txtALCantidad21;
	private JTextField txtALCantidad11;
	private JTextField txtALCantidad10;
	private JTextField txtALCantidad00;
	private JTextField txtALCantidad01;
	private JTextField txtALObs0;
	private JTextField txtALObs1;
	private JTextField txtALObs2;
	private JTextField txtFFCantidad10;
	private JTextField txtFFCantidad00;
	private JTextField txtFFCantidad01;
	private JTextField txtFFCantidad11;
	private JTextField txtFFObs1;
	private JTextField txtFFObs0;
	private JTextField txtFFCantidad20;
	private JTextField txtFFCantidad21;
	private JTextField txtFFObs2;
	private JTextField txtFPCantidad20;
	private JTextField txtFPCantidad10;
	private JTextField txtFPCantidad00;
	private JTextField txtFPCantidad01;
	private JTextField txtFPCantidad11;
	private JTextField txtFPCantidad21;
	private JTextField txtFPObs2;
	private JTextField txtFPObs1;
	private JTextField txtFPObs0;
	private JTextField txtFLDCantidad60;
	private JTextField txtFLDCantidad61;
	private JTextField txtFLDCantidad51;
	private JTextField txtFLDCantidad50;
	private JTextField txtFLDCantidad40;
	private JTextField txtFLDCantidad41;
	private JTextField txtFLDCantidad31;
	private JTextField txtFLDCantidad30;
	private JTextField txtFLDCantidad20;
	private JTextField txtFLDCantidad10;
	private JTextField txtFLDCantidad00;
	private JTextField txtFLDCantidad01;
	private JTextField txtFLDCantidad11;
	private JTextField txtFLDCantidad21;
	private JTextField txtFLDObs0;
	private JTextField txtFLDObs1;
	private JTextField txtFLDObs2;
	private JTextField txtFLDObs3;
	private JTextField txtFLDObs5;
	private JTextField txtFLDObs6;
	private JTextField txtFLDObs7;
	private JLabel lblFachadaLateralIzquierda_1;
	private JLabel lblPanelEpsPared;
	private JLabel lblPanelEpsPared_1;
	private JTextField txtFLCantidad10;
	private JTextField txtFLCantidad00;
	private JLabel label_33;
	private JTextField txtFLCantidad01;
	private JTextField txtFLCantidad11;
	private JTextField txtFLObs1;
	private JTextField txtFLObs0;
	private JLabel label_34;
	private JLabel label_17;
	private JLabel lblLuminariasLed;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel lblKitCableElctrico;
	private JLabel label_26;
	private JTextField txtKE2Cantidad40;
	private JTextField txtKE2Cantidad30;
	private JTextField txtKE2Cantidad20;
	private JTextField txtKE2Cantidad10;
	private JTextField txtKE2Cantidad00;
	private JLabel label_27;
	private JTextField txtKE2Cantidad01;
	private JTextField txtKE2Cantidad11;
	private JTextField txtKE2Cantidad21;
	private JTextField txtKE2Cantidad31;
	private JTextField txtKE2Cantidad41;
	private JTextField txtKE2Obs4;
	private JTextField txtKE2Obs3;
	private JTextField txtKE2Obs2;
	private JTextField txtKE2Obs1;
	private JTextField txtKE2Obs0;
	private JLabel label_28;
	private JLabel lblKitHidrosanitario;
	private JLabel lblInodoros;
	private JLabel lblLava;
	private JTextField txtKHCantidad10;
	private JTextField txtKHCantidad00;
	private JLabel label_32;
	private JTextField txtKHCantidad01;
	private JTextField txtKHCantidad11;
	private JTextField txtKHObs1;
	private JTextField txtKHObs0;
	private JLabel label_35;
	private JLabel lblKitAguaPotable;
	private JLabel label_25;
	private JLabel label_31;
	private JTextField txtAPCantidad00;
	private JTextField txtAPCantidad01;
	private JTextField txtAPObs0;
	private JLabel label_36;
	private JLabel label_18;
	private JTextField txtAPCantidad10;
	private JTextField txtAPCantidad11;
	private JTextField txtAPObs1;
	private JLabel lblTuberaDePvc;
	private JTextField txtAPCantidad20;
	private JTextField txtAPCantidad21;
	private JTextField txtAPObs2;
	private JLabel lblTuberaDePvc_1;
	private JTextField txtAPCantidad30;
	private JTextField txtAPCantidad31;
	private JTextField txtAPObs3;
	private JLabel lblkitParaConexin;
	private JTextField txtAPCantidad40;
	private JTextField txtAPCantidad41;
	private JTextField txtAPObs4;
	private JButton btnSiguiente;
	private JLabel label_37;
	private JLabel lblkitDeAccesorios;
	private JLabel lblTuberaDemm;
	private JLabel lblkitDeAccesorios_1;
	private JLabel label_41;
	private JLabel lblTuberaDePvc_2;
	private JLabel lblkitParaConexin_1;
	private JLabel lblkitParaConexin_2;
	private JTextField txtARCantidad60;
	private JTextField txtARCantidad61;
	private JTextField txtARCantidad50;
	private JTextField txtARCantidad51;
	private JTextField txtARCantidad41;
	private JTextField txtARCantidad40;
	private JTextField txtARCantidad30;
	private JTextField txtARCantidad31;
	private JTextField txtARCantidad21;
	private JTextField txtARCantidad20;
	private JTextField txtARCantidad10;
	private JTextField txtARCantidad00;
	private JTextField txtARCantidad01;
	private JTextField txtARCantidad11;
	private JLabel label_45;
	private JLabel label_46;
	private JTextField txtARObs0;
	private JTextField txtARObs1;
	private JTextField txtARObs2;
	private JTextField txtARObs3;
	private JTextField txtARObs4;
	private JTextField txtARObs5;
	private JTextField txtARObs6;
	private JLabel label_38;
	private JLabel label_39;
	private JLabel label_40;
	private JLabel lblDadosDeCimentacin;
	private JLabel label_43;
	private JLabel label_44;
	private JLabel label_47;
	private JLabel label_48;
	private JLabel lblPerfilSfTipo;
	private JLabel lblPerfilSfTipo_1;
	private JLabel lblPerfilSfTipo_2;
	private JLabel lblPerfilSfTipo_3;
	private JLabel lblPerfilSfTipo_4;
	private JTextField txtCECantidad90;
	private JTextField txtCECantidad80;
	private JTextField txtCECantidad70;
	private JTextField txtCECantidad60;
	private JTextField txtCECantidad50;
	private JTextField txtCECantidad40;
	private JTextField txtCECantidad30;
	private JTextField txtCECantidad20;
	private JTextField txtCECantidad10;
	private JTextField txtCECantidad00;
	private JTextField txtCECantidad01;
	private JTextField txtCECantidad11;
	private JTextField txtCECantidad21;
	private JTextField txtCECantidad31;
	private JTextField txtCECantidad41;
	private JTextField txtCECantidad51;
	private JTextField txtCECantidad61;
	private JTextField txtCECantidad71;
	private JTextField txtCECantidad81;
	private JTextField txtCECantidad91;
	private JTextField txtCEObs10;
	private JTextField txtCEObs9;
	private JTextField txtCEObs8;
	private JTextField txtCEObs7;
	private JTextField txtCEObs6;
	private JTextField txtCEObs5;
	private JTextField txtCEObs4;
	private JTextField txtCEObs3;
	private JTextField txtCEObs1;
	private JTextField txtCEObs0;
	private JLabel lblPortn;
	private JLabel lblLuminariasDePared;
	private JTextField txtPCantidad00;
	private JLabel label_50;
	private JTextField txtPCantidad01;
	private JTextField txtPObs0;
	private JLabel label_51;
	private JLabel lblElementoPortn;
	private JTextField txtPCantidad10;
	private JTextField txtPCantidad11;
	private JTextField txtPObs1;
	private JLabel lblComponenteArquitectnico;
	private JLabel lblPanelesEpsPared_5;
	private JLabel lblPanelesEpsPared_6;
	private JLabel lblPanelesEpsPared_7;
	private JLabel lblPanelesEpsPared_8;
	private JLabel lblPanelesEpsPared_9;
	private JLabel lblPanelesEpsPared_10;
	private JLabel lblPanelesEpsPared_11;
	private JLabel lblPanelesEpsPared_12;
	private JLabel lblPanelesEpsPared_13;
	private JLabel lblPanelesEpsPared_14;
	private JLabel lblPanelesEpsPared_15;
	private JLabel lblPanelesEpsPared_16;
	private JTextField txtCACantidad110;
	private JTextField txtCACantidad100;
	private JTextField txtCACantidad90;
	private JTextField txtCACantidad80;
	private JTextField txtCACantidad70;
	private JTextField txtCACantidad60;
	private JTextField txtCACantidad50;
	private JTextField txtCACantidad40;
	private JTextField txtCACantidad30;
	private JTextField txtCACantidad20;
	private JTextField txtCACantidad10;
	private JTextField txtCACantidad00;
	private JLabel label_63;
	private JTextField txtCACantidad01;
	private JTextField txtCACantidad11;
	private JTextField txtCACantidad21;
	private JTextField txtCACantidad31;
	private JTextField txtCACantidad41;
	private JTextField txtCACantidad51;
	private JTextField txtCACantidad61;
	private JTextField txtCACantidad71;
	private JTextField txtCACantidad81;
	private JTextField txtCACantidad91;
	private JTextField txtCACantidad101;
	private JTextField txtCACantidad111;
	private JTextField txtCAObs11;
	private JTextField txtCAObs10;
	private JTextField txtCAObs9;
	private JTextField txtCAObs8;
	private JTextField txtCAObs7;
	private JTextField txtCAObs6;
	private JTextField txtCAObs5;
	private JTextField txtCAObs4;
	private JTextField txtCAObs3;
	private JTextField txtCAObs2;
	private JTextField txtCAObs1;
	private JTextField txtCAObs0;
	private JLabel label_64;
	private JLabel lblPanelesEpsPared_17;
	private JTextField txtCACantidad120;
	private JTextField txtCACantidad121;
	private JTextField txtCAObs12;
	private JLabel lblPanelesEpsPared_18;
	private JTextField txtCACantidad130;
	private JTextField txtCACantidad131;
	private JTextField txtCAObs13;
	private JLabel lblComponenteEstructural;
	private JLabel lblDadoCimentacinPortn;
	private JLabel lblPerfilSfTipo_5;
	private JTextField txtCE2Cantidad00;
	private JLabel label_53;
	private JTextField txtCE2Cantidad01;
	private JTextField txtCE2Cantidad11;
	private JTextField txtCE2Cantidad10;
	private JTextField txtCE2Obs1;
	private JTextField txtCE2Obs0;
	private JLabel label_54;
	private JLabel lblPerfilSfTipo_6;
	private JTextField txtCE2Cantidad20;
	private JTextField txtCE2Cantidad21;
	private JTextField txtCE2Obs2;
	private JTextField txtKEObs2;

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
	// PGTemplate frame = new PGTemplate();
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
	public PGTemplate(TFicha ficha) {
		this.ficha = ficha;
		setTitle(ficha.getFiNombre());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1320, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		this.setTitle(ficha.getFiNombre());

		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());
		setContentPane(contentPane);
		contentPane.setLayout(null);

		llenarCabecera(cabecera);

		this.setResizable(false);
		this.setLocationRelativeTo(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 122, 1294, 569);
		contentPane.add(tabbedPane);

		String textoLabel31 = "<html><body>Kit de Accesorios de Conexi\u00F3n Agua<br>Potable (Inodoros)(1 te reducciones 1-1/2,<br>1 neplos,1 uniones de 1/2,1 codos de<br>"
				+ "90\u00B0,1 mangueras de abasto,1 llave de<br>paso , 1 rollo tefl\u00F3n, 1/2 tubos de pasta<br>selladora)</body></html>";

		String textoLabel18 = "<html><body>Potable (Lavabos)(1  te 1/2\"  ,  1 neplos,1<br>uni�n de 1/2,1 codo de 90\u00B0,1 manguera de<br>abasto,1 llave de paso, tefl�n, pasta<br>"
				+ "selladora)</body></html>";

		JPanel panel1 = new JPanel();
		tabbedPane.addTab("1.- PG porton y garita-1", null, panel1, null);
		panel1.setLayout(null);

		JLabel label = new JLabel("KIT EL\u00C9CTRICO");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 11));
		label.setBounds(10, 21, 203, 14);
		panel1.add(label);

		JLabel label_1 = new JLabel("Luminarias LED 60 w - 5000 lum");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("Arial", Font.PLAIN, 11));
		label_1.setBounds(10, 46, 203, 14);
		panel1.add(label_1);

		JLabel label_2 = new JLabel("Tomacorrientes");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setFont(new Font("Arial", Font.PLAIN, 11));
		label_2.setBounds(10, 68, 203, 14);
		panel1.add(label_2);

		JLabel label_3 = new JLabel("Interruptor");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("Arial", Font.PLAIN, 11));
		label_3.setBounds(10, 90, 203, 14);
		panel1.add(label_3);

		JLabel label_4 = new JLabel("Kit cable el\u00E9ctrico MA");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setFont(new Font("Arial", Font.PLAIN, 11));
		label_4.setBounds(10, 112, 203, 14);
		panel1.add(label_4);

		JLabel label_5 = new JLabel("Detector de humo");
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setFont(new Font("Arial", Font.PLAIN, 11));
		label_5.setBounds(10, 134, 203, 14);
		panel1.add(label_5);

		txtKECantidad40 = new JTextField();
		txtKECantidad40.setEditable(false);
		txtKECantidad40.setColumns(10);
		txtKECantidad40.setBounds(203, 131, 35, 20);
		panel1.add(txtKECantidad40);

		txtKECantidad41 = new JTextField();
		txtKECantidad41.setColumns(10);
		txtKECantidad41.setBounds(240, 131, 35, 20);
		panel1.add(txtKECantidad41);

		txtKECantidad31 = new JTextField();
		txtKECantidad31.setColumns(10);
		txtKECantidad31.setBounds(240, 109, 35, 20);
		panel1.add(txtKECantidad31);

		txtKECantidad30 = new JTextField();
		txtKECantidad30.setEditable(false);
		txtKECantidad30.setColumns(10);
		txtKECantidad30.setBounds(203, 109, 35, 20);
		panel1.add(txtKECantidad30);

		txtKECantidad20 = new JTextField();
		txtKECantidad20.setEditable(false);
		txtKECantidad20.setColumns(10);
		txtKECantidad20.setBounds(203, 87, 35, 20);
		panel1.add(txtKECantidad20);

		txtKECantidad21 = new JTextField();
		txtKECantidad21.setColumns(10);
		txtKECantidad21.setBounds(240, 87, 35, 20);
		panel1.add(txtKECantidad21);

		txtKECantidad11 = new JTextField();
		txtKECantidad11.setColumns(10);
		txtKECantidad11.setBounds(240, 65, 35, 20);
		panel1.add(txtKECantidad11);

		txtKECantidad10 = new JTextField();
		txtKECantidad10.setEditable(false);
		txtKECantidad10.setColumns(10);
		txtKECantidad10.setBounds(203, 65, 35, 20);
		panel1.add(txtKECantidad10);

		txtKECantidad00 = new JTextField();
		txtKECantidad00.setEditable(false);
		txtKECantidad00.setColumns(10);
		txtKECantidad00.setBounds(203, 43, 35, 20);
		panel1.add(txtKECantidad00);

		txtKECantidad01 = new JTextField();
		txtKECantidad01.setColumns(10);
		txtKECantidad01.setBounds(240, 43, 35, 20);
		panel1.add(txtKECantidad01);

		JLabel label_6 = new JLabel("Cantidad");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Arial", Font.BOLD, 11));
		label_6.setBounds(206, 21, 63, 14);
		panel1.add(label_6);

		JLabel label_7 = new JLabel("Observaci\u00F3n/Referencia");
		label_7.setHorizontalAlignment(SwingConstants.LEFT);
		label_7.setFont(new Font("Arial", Font.BOLD, 11));
		label_7.setBounds(700, 18, 139, 14);
		panel1.add(label_7);

		txtKEObs0 = new JTextField();
		txtKEObs0.setColumns(10);
		txtKEObs0.setBounds(278, 43, 133, 20);
		panel1.add(txtKEObs0);

		txtKEObs1 = new JTextField();
		txtKEObs1.setColumns(10);
		txtKEObs1.setBounds(278, 65, 133, 20);
		panel1.add(txtKEObs1);

		txtKEObs2 = new JTextField();
		txtKEObs2.setColumns(10);
		txtKEObs2.setBounds(278, 87, 133, 20);
		panel1.add(txtKEObs2);

		txtKEObs3 = new JTextField();
		txtKEObs3.setColumns(10);
		txtKEObs3.setBounds(278, 109, 133, 20);
		panel1.add(txtKEObs3);

		txtKEObs4 = new JTextField();
		txtKEObs4.setColumns(10);
		txtKEObs4.setBounds(278, 131, 133, 20);
		panel1.add(txtKEObs4);

		JLabel label_8 = new JLabel("KIT AGUA LLUVIA");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Arial", Font.BOLD, 11));
		label_8.setBounds(39, 168, 139, 14);
		panel1.add(label_8);

		JLabel label_9 = new JLabel("Canal pl\u00E1stico PVC de L=3m");
		label_9.setHorizontalAlignment(SwingConstants.LEFT);
		label_9.setFont(new Font("Arial", Font.PLAIN, 11));
		label_9.setBounds(10, 193, 183, 14);
		panel1.add(label_9);

		JLabel label_10 = new JLabel(
				"<html><body>Kit de Accesorios de Conexi\u00F3n Agua de<br>Lluvia (2 rejilla, 4 codos 90\u00B0,1/4 gl<br>polipega, tornillos, abrazaderas</body></html>)");
		label_10.setHorizontalAlignment(SwingConstants.LEFT);
		label_10.setFont(new Font("Arial", Font.PLAIN, 11));
		label_10.setBounds(10, 212, 203, 56);
		panel1.add(label_10);

		JLabel label_11 = new JLabel("Tuber\u00EDa de PVC 75 mm L=3m");
		label_11.setHorizontalAlignment(SwingConstants.LEFT);
		label_11.setFont(new Font("Arial", Font.PLAIN, 11));
		label_11.setBounds(10, 270, 183, 14);
		panel1.add(label_11);

		JLabel label_12 = new JLabel("Tuber\u00EDa de PVC 75 mm L=0.6m");
		label_12.setHorizontalAlignment(SwingConstants.LEFT);
		label_12.setFont(new Font("Arial", Font.PLAIN, 11));
		label_12.setBounds(10, 292, 183, 14);
		panel1.add(label_12);

		JLabel label_13 = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 75 mm. (lija<br>pliego, polipega 1/4gal,1 codo 90\u00B0)</body></html>");
		label_13.setHorizontalAlignment(SwingConstants.LEFT);
		label_13.setFont(new Font("Arial", Font.PLAIN, 11));
		label_13.setBounds(10, 314, 203, 39);
		panel1.add(label_13);

		txtALCantidad40 = new JTextField();
		txtALCantidad40.setEditable(false);
		txtALCantidad40.setColumns(10);
		txtALCantidad40.setBounds(203, 322, 35, 20);
		panel1.add(txtALCantidad40);

		txtALCantidad41 = new JTextField();
		txtALCantidad41.setColumns(10);
		txtALCantidad41.setBounds(240, 322, 35, 20);
		panel1.add(txtALCantidad41);

		txtALObs4 = new JTextField();
		txtALObs4.setColumns(10);
		txtALObs4.setBounds(278, 322, 133, 20);
		panel1.add(txtALObs4);

		txtALObs3 = new JTextField();
		txtALObs3.setColumns(10);
		txtALObs3.setBounds(278, 286, 133, 20);
		panel1.add(txtALObs3);

		txtALCantidad31 = new JTextField();
		txtALCantidad31.setColumns(10);
		txtALCantidad31.setBounds(240, 286, 35, 20);
		panel1.add(txtALCantidad31);

		txtALCantidad30 = new JTextField();
		txtALCantidad30.setEditable(false);
		txtALCantidad30.setColumns(10);
		txtALCantidad30.setBounds(203, 286, 35, 20);
		panel1.add(txtALCantidad30);

		txtALCantidad20 = new JTextField();
		txtALCantidad20.setEditable(false);
		txtALCantidad20.setColumns(10);
		txtALCantidad20.setBounds(203, 264, 35, 20);
		panel1.add(txtALCantidad20);

		txtALCantidad21 = new JTextField();
		txtALCantidad21.setColumns(10);
		txtALCantidad21.setBounds(240, 264, 35, 20);
		panel1.add(txtALCantidad21);

		txtALCantidad11 = new JTextField();
		txtALCantidad11.setColumns(10);
		txtALCantidad11.setBounds(240, 233, 35, 20);
		panel1.add(txtALCantidad11);

		txtALCantidad10 = new JTextField();
		txtALCantidad10.setEditable(false);
		txtALCantidad10.setColumns(10);
		txtALCantidad10.setBounds(203, 233, 35, 20);
		panel1.add(txtALCantidad10);

		txtALCantidad00 = new JTextField();
		txtALCantidad00.setEditable(false);
		txtALCantidad00.setColumns(10);
		txtALCantidad00.setBounds(203, 190, 35, 20);
		panel1.add(txtALCantidad00);

		txtALCantidad01 = new JTextField();
		txtALCantidad01.setColumns(10);
		txtALCantidad01.setBounds(240, 190, 35, 20);
		panel1.add(txtALCantidad01);

		JLabel label_14 = new JLabel("Cantidad");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Arial", Font.BOLD, 11));
		label_14.setBounds(206, 168, 63, 14);
		panel1.add(label_14);

		JLabel label_15 = new JLabel("Observaci\u00F3n/Referencia");
		label_15.setHorizontalAlignment(SwingConstants.LEFT);
		label_15.setFont(new Font("Arial", Font.BOLD, 11));
		label_15.setBounds(279, 168, 139, 14);
		panel1.add(label_15);

		txtALObs0 = new JTextField();
		txtALObs0.setColumns(10);
		txtALObs0.setBounds(278, 190, 133, 20);
		panel1.add(txtALObs0);

		txtALObs1 = new JTextField();
		txtALObs1.setColumns(10);
		txtALObs1.setBounds(278, 233, 133, 20);
		panel1.add(txtALObs1);

		txtALObs2 = new JTextField();
		txtALObs2.setColumns(10);
		txtALObs2.setBounds(278, 264, 133, 20);
		panel1.add(txtALObs2);

		JLabel label_16 = new JLabel("FACHADA FRONTAL");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("Arial", Font.BOLD, 11));
		label_16.setBounds(444, 21, 129, 14);
		panel1.add(label_16);

		JLabel lblPanelesEpsPared = new JLabel("Paneles EPS pared -   ( 1,50x1,10 mt)");
		lblPanelesEpsPared.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared.setBounds(421, 46, 203, 14);
		panel1.add(lblPanelesEpsPared);

		JLabel lblPanelesEpsPared_1 = new JLabel("Paneles EPS pared -   (0,80x1,50 mt)");
		lblPanelesEpsPared_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_1.setBounds(421, 68, 203, 14);
		panel1.add(lblPanelesEpsPared_1);

		txtFFCantidad10 = new JTextField();
		txtFFCantidad10.setEditable(false);
		txtFFCantidad10.setColumns(10);
		txtFFCantidad10.setBounds(624, 62, 35, 20);
		panel1.add(txtFFCantidad10);

		txtFFCantidad00 = new JTextField();
		txtFFCantidad00.setEditable(false);
		txtFFCantidad00.setColumns(10);
		txtFFCantidad00.setBounds(624, 40, 35, 20);
		panel1.add(txtFFCantidad00);

		JLabel label_19 = new JLabel("Cantidad");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("Arial", Font.BOLD, 11));
		label_19.setBounds(627, 18, 63, 14);
		panel1.add(label_19);

		txtFFCantidad01 = new JTextField();
		txtFFCantidad01.setColumns(10);
		txtFFCantidad01.setBounds(661, 40, 35, 20);
		panel1.add(txtFFCantidad01);

		txtFFCantidad11 = new JTextField();
		txtFFCantidad11.setColumns(10);
		txtFFCantidad11.setBounds(661, 62, 35, 20);
		panel1.add(txtFFCantidad11);

		txtFFObs1 = new JTextField();
		txtFFObs1.setColumns(10);
		txtFFObs1.setBounds(700, 62, 133, 20);
		panel1.add(txtFFObs1);

		txtFFObs0 = new JTextField();
		txtFFObs0.setColumns(10);
		txtFFObs0.setBounds(700, 40, 133, 20);
		panel1.add(txtFFObs0);

		JLabel label_20 = new JLabel("Observaci\u00F3n/Referencia");
		label_20.setHorizontalAlignment(SwingConstants.LEFT);
		label_20.setFont(new Font("Arial", Font.BOLD, 11));
		label_20.setBounds(279, 21, 139, 14);
		panel1.add(label_20);

		JLabel lblPanelesEpsPared_2 = new JLabel("Paneles EPS pared -   (1,50x2,40 mt)");
		lblPanelesEpsPared_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_2.setBounds(421, 90, 203, 14);
		panel1.add(lblPanelesEpsPared_2);

		txtFFCantidad20 = new JTextField();
		txtFFCantidad20.setEditable(false);
		txtFFCantidad20.setColumns(10);
		txtFFCantidad20.setBounds(624, 84, 35, 20);
		panel1.add(txtFFCantidad20);

		txtFFCantidad21 = new JTextField();
		txtFFCantidad21.setColumns(10);
		txtFFCantidad21.setBounds(661, 84, 35, 20);
		panel1.add(txtFFCantidad21);

		txtFFObs2 = new JTextField();
		txtFFObs2.setColumns(10);
		txtFFObs2.setBounds(700, 84, 133, 20);
		panel1.add(txtFFObs2);

		JLabel lblFachadaPosterior = new JLabel("FACHADA POSTERIOR");
		lblFachadaPosterior.setHorizontalAlignment(SwingConstants.CENTER);
		lblFachadaPosterior.setFont(new Font("Arial", Font.BOLD, 11));
		lblFachadaPosterior.setBounds(444, 131, 129, 14);
		panel1.add(lblFachadaPosterior);

		JLabel lblSetPanelesEps = new JLabel("Set Paneles EPS pared -   ( 1,30x1,80 mt)");
		lblSetPanelesEps.setHorizontalAlignment(SwingConstants.LEFT);
		lblSetPanelesEps.setFont(new Font("Arial", Font.PLAIN, 11));
		lblSetPanelesEps.setBounds(421, 156, 203, 14);
		panel1.add(lblSetPanelesEps);

		JLabel lblSetPanelesEps_1 = new JLabel("Set Paneles EPS pared -   ( 0,40x0,45 mt)");
		lblSetPanelesEps_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSetPanelesEps_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblSetPanelesEps_1.setBounds(421, 178, 203, 14);
		panel1.add(lblSetPanelesEps_1);

		JLabel lblPanelAlturaVariable = new JLabel("Panel altura variable \u2013 (ver detalle)");
		lblPanelAlturaVariable.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelAlturaVariable.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelAlturaVariable.setBounds(421, 200, 203, 14);
		panel1.add(lblPanelAlturaVariable);

		txtFPCantidad20 = new JTextField();
		txtFPCantidad20.setEditable(false);
		txtFPCantidad20.setColumns(10);
		txtFPCantidad20.setBounds(624, 194, 35, 20);
		panel1.add(txtFPCantidad20);

		txtFPCantidad10 = new JTextField();
		txtFPCantidad10.setEditable(false);
		txtFPCantidad10.setColumns(10);
		txtFPCantidad10.setBounds(624, 172, 35, 20);
		panel1.add(txtFPCantidad10);

		txtFPCantidad00 = new JTextField();
		txtFPCantidad00.setEditable(false);
		txtFPCantidad00.setColumns(10);
		txtFPCantidad00.setBounds(624, 150, 35, 20);
		panel1.add(txtFPCantidad00);

		JLabel label_23 = new JLabel("Cantidad");
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setFont(new Font("Arial", Font.BOLD, 11));
		label_23.setBounds(627, 128, 63, 14);
		panel1.add(label_23);

		txtFPCantidad01 = new JTextField();
		txtFPCantidad01.setColumns(10);
		txtFPCantidad01.setBounds(661, 150, 35, 20);
		panel1.add(txtFPCantidad01);

		txtFPCantidad11 = new JTextField();
		txtFPCantidad11.setColumns(10);
		txtFPCantidad11.setBounds(661, 172, 35, 20);
		panel1.add(txtFPCantidad11);

		txtFPCantidad21 = new JTextField();
		txtFPCantidad21.setColumns(10);
		txtFPCantidad21.setBounds(661, 194, 35, 20);
		panel1.add(txtFPCantidad21);

		txtFPObs2 = new JTextField();
		txtFPObs2.setColumns(10);
		txtFPObs2.setBounds(700, 194, 133, 20);
		panel1.add(txtFPObs2);

		txtFPObs1 = new JTextField();
		txtFPObs1.setColumns(10);
		txtFPObs1.setBounds(700, 172, 133, 20);
		panel1.add(txtFPObs1);

		txtFPObs0 = new JTextField();
		txtFPObs0.setColumns(10);
		txtFPObs0.setBounds(700, 150, 133, 20);
		panel1.add(txtFPObs0);

		JLabel label_24 = new JLabel("Observaci\u00F3n/Referencia");
		label_24.setHorizontalAlignment(SwingConstants.LEFT);
		label_24.setFont(new Font("Arial", Font.BOLD, 11));
		label_24.setBounds(700, 128, 139, 14);
		panel1.add(label_24);

		JLabel lblFachadaLateralIzquierda = new JLabel("FACHADA LATERAL DERECHA");
		lblFachadaLateralIzquierda.setHorizontalAlignment(SwingConstants.CENTER);
		lblFachadaLateralIzquierda.setFont(new Font("Arial", Font.BOLD, 11));
		lblFachadaLateralIzquierda.setBounds(421, 322, 203, 14);
		panel1.add(lblFachadaLateralIzquierda);

		JLabel lblPanelesEpsPared_3 = new JLabel("Paneles EPS pared -   ( 0,70x2,40 mt)");
		lblPanelesEpsPared_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_3.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_3.setBounds(421, 347, 203, 14);
		panel1.add(lblPanelesEpsPared_3);

		JLabel lblPanelEpsPared_2 = new JLabel("Panel EPS- pared ( 0,70x1,10 mt)");
		lblPanelEpsPared_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelEpsPared_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelEpsPared_2.setBounds(421, 369, 203, 14);
		panel1.add(lblPanelEpsPared_2);

		JLabel lblPanelEpsPared_3 = new JLabel("Panel EPS- pared ( 2,30x5 mt)");
		lblPanelEpsPared_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelEpsPared_3.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelEpsPared_3.setBounds(421, 391, 203, 14);
		panel1.add(lblPanelEpsPared_3);

		JLabel lblPanelesTcb = new JLabel("Paneles TCB   ( 2,70x1,30 mt)");
		lblPanelesTcb.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesTcb.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesTcb.setBounds(421, 413, 203, 14);
		panel1.add(lblPanelesTcb);

		JLabel lblPanelesVynilPiso = new JLabel("Paneles vynil piso (0,15x0.65mts)");
		lblPanelesVynilPiso.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesVynilPiso.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesVynilPiso.setBounds(421, 435, 203, 14);
		panel1.add(lblPanelesVynilPiso);

		JLabel lblPanelesEpsPara = new JLabel("Paneles EPS para cubierta L2.5");
		lblPanelesEpsPara.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPara.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPara.setBounds(421, 457, 203, 14);
		panel1.add(lblPanelesEpsPara);

		JLabel lblPanelesEpsPared_4 = new JLabel("Paneles EPS pared -   ( 0,70x2,40 mt)");
		lblPanelesEpsPared_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_4.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_4.setBounds(421, 479, 203, 14);
		panel1.add(lblPanelesEpsPared_4);

		txtFLDCantidad60 = new JTextField();
		txtFLDCantidad60.setEditable(false);
		txtFLDCantidad60.setColumns(10);
		txtFLDCantidad60.setBounds(624, 473, 35, 20);
		panel1.add(txtFLDCantidad60);

		txtFLDCantidad61 = new JTextField();
		txtFLDCantidad61.setColumns(10);
		txtFLDCantidad61.setBounds(661, 473, 35, 20);
		panel1.add(txtFLDCantidad61);

		txtFLDCantidad51 = new JTextField();
		txtFLDCantidad51.setColumns(10);
		txtFLDCantidad51.setBounds(661, 451, 35, 20);
		panel1.add(txtFLDCantidad51);

		txtFLDCantidad50 = new JTextField();
		txtFLDCantidad50.setEditable(false);
		txtFLDCantidad50.setColumns(10);
		txtFLDCantidad50.setBounds(624, 451, 35, 20);
		panel1.add(txtFLDCantidad50);

		txtFLDCantidad40 = new JTextField();
		txtFLDCantidad40.setEditable(false);
		txtFLDCantidad40.setColumns(10);
		txtFLDCantidad40.setBounds(624, 429, 35, 20);
		panel1.add(txtFLDCantidad40);

		txtFLDCantidad41 = new JTextField();
		txtFLDCantidad41.setColumns(10);
		txtFLDCantidad41.setBounds(661, 429, 35, 20);
		panel1.add(txtFLDCantidad41);

		txtFLDCantidad31 = new JTextField();
		txtFLDCantidad31.setColumns(10);
		txtFLDCantidad31.setBounds(661, 407, 35, 20);
		panel1.add(txtFLDCantidad31);

		txtFLDCantidad30 = new JTextField();
		txtFLDCantidad30.setEditable(false);
		txtFLDCantidad30.setColumns(10);
		txtFLDCantidad30.setBounds(624, 407, 35, 20);
		panel1.add(txtFLDCantidad30);

		txtFLDCantidad20 = new JTextField();
		txtFLDCantidad20.setEditable(false);
		txtFLDCantidad20.setColumns(10);
		txtFLDCantidad20.setBounds(624, 385, 35, 20);
		panel1.add(txtFLDCantidad20);

		txtFLDCantidad10 = new JTextField();
		txtFLDCantidad10.setEditable(false);
		txtFLDCantidad10.setColumns(10);
		txtFLDCantidad10.setBounds(624, 363, 35, 20);
		panel1.add(txtFLDCantidad10);

		txtFLDCantidad00 = new JTextField();
		txtFLDCantidad00.setEditable(false);
		txtFLDCantidad00.setColumns(10);
		txtFLDCantidad00.setBounds(624, 341, 35, 20);
		panel1.add(txtFLDCantidad00);

		JLabel label_29 = new JLabel("Cantidad");
		label_29.setHorizontalAlignment(SwingConstants.CENTER);
		label_29.setFont(new Font("Arial", Font.BOLD, 11));
		label_29.setBounds(634, 319, 63, 14);
		panel1.add(label_29);

		txtFLDCantidad01 = new JTextField();
		txtFLDCantidad01.setColumns(10);
		txtFLDCantidad01.setBounds(661, 341, 35, 20);
		panel1.add(txtFLDCantidad01);

		txtFLDCantidad11 = new JTextField();
		txtFLDCantidad11.setColumns(10);
		txtFLDCantidad11.setBounds(661, 363, 35, 20);
		panel1.add(txtFLDCantidad11);

		txtFLDCantidad21 = new JTextField();
		txtFLDCantidad21.setColumns(10);
		txtFLDCantidad21.setBounds(661, 385, 35, 20);
		panel1.add(txtFLDCantidad21);

		JLabel label_30 = new JLabel("Observaci\u00F3n/Referencia");
		label_30.setHorizontalAlignment(SwingConstants.LEFT);
		label_30.setFont(new Font("Arial", Font.BOLD, 11));
		label_30.setBounds(700, 319, 139, 14);
		panel1.add(label_30);

		txtFLDObs0 = new JTextField();
		txtFLDObs0.setColumns(10);
		txtFLDObs0.setBounds(700, 341, 133, 20);
		panel1.add(txtFLDObs0);

		txtFLDObs1 = new JTextField();
		txtFLDObs1.setColumns(10);
		txtFLDObs1.setBounds(700, 363, 133, 20);
		panel1.add(txtFLDObs1);

		txtFLDObs2 = new JTextField();
		txtFLDObs2.setColumns(10);
		txtFLDObs2.setBounds(700, 385, 133, 20);
		panel1.add(txtFLDObs2);

		txtFLDObs3 = new JTextField();
		txtFLDObs3.setColumns(10);
		txtFLDObs3.setBounds(700, 407, 133, 20);
		panel1.add(txtFLDObs3);

		txtFLDObs5 = new JTextField();
		txtFLDObs5.setColumns(10);
		txtFLDObs5.setBounds(700, 429, 133, 20);
		panel1.add(txtFLDObs5);

		txtFLDObs6 = new JTextField();
		txtFLDObs6.setColumns(10);
		txtFLDObs6.setBounds(700, 451, 133, 20);
		panel1.add(txtFLDObs6);

		txtFLDObs7 = new JTextField();
		txtFLDObs7.setColumns(10);
		txtFLDObs7.setBounds(700, 473, 133, 20);
		panel1.add(txtFLDObs7);

		lblFachadaLateralIzquierda_1 = new JLabel("FACHADA LATERAL IZQUIERDA");
		lblFachadaLateralIzquierda_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFachadaLateralIzquierda_1.setFont(new Font("Arial", Font.BOLD, 11));
		lblFachadaLateralIzquierda_1.setBounds(421, 242, 180, 14);
		panel1.add(lblFachadaLateralIzquierda_1);

		lblPanelEpsPared = new JLabel("Panel EPS- pared ( 0,70x0,60 mt)");
		lblPanelEpsPared.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelEpsPared.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelEpsPared.setBounds(421, 267, 203, 14);
		panel1.add(lblPanelEpsPared);

		lblPanelEpsPared_1 = new JLabel("Panel EPS- pared ( 2,20x2,70 mt)");
		lblPanelEpsPared_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelEpsPared_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelEpsPared_1.setBounds(421, 289, 203, 14);
		panel1.add(lblPanelEpsPared_1);

		txtFLCantidad10 = new JTextField();
		txtFLCantidad10.setEditable(false);
		txtFLCantidad10.setColumns(10);
		txtFLCantidad10.setBounds(624, 283, 35, 20);
		panel1.add(txtFLCantidad10);

		txtFLCantidad00 = new JTextField();
		txtFLCantidad00.setEditable(false);
		txtFLCantidad00.setColumns(10);
		txtFLCantidad00.setBounds(624, 261, 35, 20);
		panel1.add(txtFLCantidad00);

		label_33 = new JLabel("Cantidad");
		label_33.setHorizontalAlignment(SwingConstants.CENTER);
		label_33.setFont(new Font("Arial", Font.BOLD, 11));
		label_33.setBounds(627, 239, 63, 14);
		panel1.add(label_33);

		txtFLCantidad01 = new JTextField();
		txtFLCantidad01.setColumns(10);
		txtFLCantidad01.setBounds(661, 261, 35, 20);
		panel1.add(txtFLCantidad01);

		txtFLCantidad11 = new JTextField();
		txtFLCantidad11.setColumns(10);
		txtFLCantidad11.setBounds(661, 283, 35, 20);
		panel1.add(txtFLCantidad11);

		txtFLObs1 = new JTextField();
		txtFLObs1.setColumns(10);
		txtFLObs1.setBounds(700, 283, 133, 20);
		panel1.add(txtFLObs1);

		txtFLObs0 = new JTextField();
		txtFLObs0.setColumns(10);
		txtFLObs0.setBounds(700, 261, 133, 20);
		panel1.add(txtFLObs0);

		label_34 = new JLabel("Observaci\u00F3n/Referencia");
		label_34.setHorizontalAlignment(SwingConstants.LEFT);
		label_34.setFont(new Font("Arial", Font.BOLD, 11));
		label_34.setBounds(700, 239, 139, 14);
		panel1.add(label_34);

		label_17 = new JLabel("KIT EL\u00C9CTRICO");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("Arial", Font.BOLD, 11));
		label_17.setBounds(849, 21, 203, 14);
		panel1.add(label_17);

		lblLuminariasLed = new JLabel("Luminarias LED 40 w - 2250 lum");
		lblLuminariasLed.setHorizontalAlignment(SwingConstants.LEFT);
		lblLuminariasLed.setFont(new Font("Arial", Font.PLAIN, 11));
		lblLuminariasLed.setBounds(849, 46, 203, 14);
		panel1.add(lblLuminariasLed);

		label_21 = new JLabel("Tomacorrientes");
		label_21.setHorizontalAlignment(SwingConstants.LEFT);
		label_21.setFont(new Font("Arial", Font.PLAIN, 11));
		label_21.setBounds(849, 68, 203, 14);
		panel1.add(label_21);

		label_22 = new JLabel("Interruptor");
		label_22.setHorizontalAlignment(SwingConstants.LEFT);
		label_22.setFont(new Font("Arial", Font.PLAIN, 11));
		label_22.setBounds(849, 90, 203, 14);
		panel1.add(label_22);

		lblKitCableElctrico = new JLabel("Kit cable el\u00E9ctrico");
		lblKitCableElctrico.setHorizontalAlignment(SwingConstants.LEFT);
		lblKitCableElctrico.setFont(new Font("Arial", Font.PLAIN, 11));
		lblKitCableElctrico.setBounds(849, 112, 203, 14);
		panel1.add(lblKitCableElctrico);

		label_26 = new JLabel("Detector de humo");
		label_26.setHorizontalAlignment(SwingConstants.LEFT);
		label_26.setFont(new Font("Arial", Font.PLAIN, 11));
		label_26.setBounds(849, 134, 203, 14);
		panel1.add(label_26);

		txtKE2Cantidad40 = new JTextField();
		txtKE2Cantidad40.setEditable(false);
		txtKE2Cantidad40.setColumns(10);
		txtKE2Cantidad40.setBounds(1062, 131, 35, 20);
		panel1.add(txtKE2Cantidad40);

		txtKE2Cantidad30 = new JTextField();
		txtKE2Cantidad30.setEditable(false);
		txtKE2Cantidad30.setColumns(10);
		txtKE2Cantidad30.setBounds(1062, 109, 35, 20);
		panel1.add(txtKE2Cantidad30);

		txtKE2Cantidad20 = new JTextField();
		txtKE2Cantidad20.setEditable(false);
		txtKE2Cantidad20.setColumns(10);
		txtKE2Cantidad20.setBounds(1062, 87, 35, 20);
		panel1.add(txtKE2Cantidad20);

		txtKE2Cantidad10 = new JTextField();
		txtKE2Cantidad10.setEditable(false);
		txtKE2Cantidad10.setColumns(10);
		txtKE2Cantidad10.setBounds(1062, 65, 35, 20);
		panel1.add(txtKE2Cantidad10);

		txtKE2Cantidad00 = new JTextField();
		txtKE2Cantidad00.setEditable(false);
		txtKE2Cantidad00.setColumns(10);
		txtKE2Cantidad00.setBounds(1062, 43, 35, 20);
		panel1.add(txtKE2Cantidad00);

		label_27 = new JLabel("Cantidad");
		label_27.setHorizontalAlignment(SwingConstants.CENTER);
		label_27.setFont(new Font("Arial", Font.BOLD, 11));
		label_27.setBounds(1065, 21, 63, 14);
		panel1.add(label_27);

		txtKE2Cantidad01 = new JTextField();
		txtKE2Cantidad01.setColumns(10);
		txtKE2Cantidad01.setBounds(1099, 43, 35, 20);
		panel1.add(txtKE2Cantidad01);

		txtKE2Cantidad11 = new JTextField();
		txtKE2Cantidad11.setColumns(10);
		txtKE2Cantidad11.setBounds(1099, 65, 35, 20);
		panel1.add(txtKE2Cantidad11);

		txtKE2Cantidad21 = new JTextField();
		txtKE2Cantidad21.setColumns(10);
		txtKE2Cantidad21.setBounds(1099, 87, 35, 20);
		panel1.add(txtKE2Cantidad21);

		txtKE2Cantidad31 = new JTextField();
		txtKE2Cantidad31.setColumns(10);
		txtKE2Cantidad31.setBounds(1099, 109, 35, 20);
		panel1.add(txtKE2Cantidad31);

		txtKE2Cantidad41 = new JTextField();
		txtKE2Cantidad41.setColumns(10);
		txtKE2Cantidad41.setBounds(1099, 131, 35, 20);
		panel1.add(txtKE2Cantidad41);

		txtKE2Obs4 = new JTextField();
		txtKE2Obs4.setColumns(10);
		txtKE2Obs4.setBounds(1138, 131, 133, 20);
		panel1.add(txtKE2Obs4);

		txtKE2Obs3 = new JTextField();
		txtKE2Obs3.setColumns(10);
		txtKE2Obs3.setBounds(1138, 109, 133, 20);
		panel1.add(txtKE2Obs3);

		txtKE2Obs2 = new JTextField();
		txtKE2Obs2.setColumns(10);
		txtKE2Obs2.setBounds(1138, 87, 133, 20);
		panel1.add(txtKE2Obs2);

		txtKE2Obs1 = new JTextField();
		txtKE2Obs1.setColumns(10);
		txtKE2Obs1.setBounds(1138, 65, 133, 20);
		panel1.add(txtKE2Obs1);

		txtKE2Obs0 = new JTextField();
		txtKE2Obs0.setColumns(10);
		txtKE2Obs0.setBounds(1138, 43, 133, 20);
		panel1.add(txtKE2Obs0);

		label_28 = new JLabel("Observaci\u00F3n/Referencia");
		label_28.setHorizontalAlignment(SwingConstants.LEFT);
		label_28.setFont(new Font("Arial", Font.BOLD, 11));
		label_28.setBounds(1133, 21, 139, 14);
		panel1.add(label_28);

		lblKitHidrosanitario = new JLabel("KIT HIDROSANITARIO");
		lblKitHidrosanitario.setHorizontalAlignment(SwingConstants.CENTER);
		lblKitHidrosanitario.setFont(new Font("Arial", Font.BOLD, 11));
		lblKitHidrosanitario.setBounds(849, 156, 203, 14);
		panel1.add(lblKitHidrosanitario);

		lblInodoros = new JLabel("Inodoros");
		lblInodoros.setHorizontalAlignment(SwingConstants.LEFT);
		lblInodoros.setFont(new Font("Arial", Font.PLAIN, 11));
		lblInodoros.setBounds(849, 181, 203, 14);
		panel1.add(lblInodoros);

		lblLava = new JLabel("Lavabos");
		lblLava.setHorizontalAlignment(SwingConstants.LEFT);
		lblLava.setFont(new Font("Arial", Font.PLAIN, 11));
		lblLava.setBounds(849, 203, 203, 14);
		panel1.add(lblLava);

		txtKHCantidad10 = new JTextField();
		txtKHCantidad10.setEditable(false);
		txtKHCantidad10.setColumns(10);
		txtKHCantidad10.setBounds(1062, 200, 35, 20);
		panel1.add(txtKHCantidad10);

		txtKHCantidad00 = new JTextField();
		txtKHCantidad00.setEditable(false);
		txtKHCantidad00.setColumns(10);
		txtKHCantidad00.setBounds(1062, 178, 35, 20);
		panel1.add(txtKHCantidad00);

		label_32 = new JLabel("Cantidad");
		label_32.setHorizontalAlignment(SwingConstants.CENTER);
		label_32.setFont(new Font("Arial", Font.BOLD, 11));
		label_32.setBounds(1065, 156, 63, 14);
		panel1.add(label_32);

		txtKHCantidad01 = new JTextField();
		txtKHCantidad01.setColumns(10);
		txtKHCantidad01.setBounds(1099, 178, 35, 20);
		panel1.add(txtKHCantidad01);

		txtKHCantidad11 = new JTextField();
		txtKHCantidad11.setColumns(10);
		txtKHCantidad11.setBounds(1099, 200, 35, 20);
		panel1.add(txtKHCantidad11);

		txtKHObs1 = new JTextField();
		txtKHObs1.setColumns(10);
		txtKHObs1.setBounds(1138, 200, 133, 20);
		panel1.add(txtKHObs1);

		txtKHObs0 = new JTextField();
		txtKHObs0.setColumns(10);
		txtKHObs0.setBounds(1138, 178, 133, 20);
		panel1.add(txtKHObs0);

		label_35 = new JLabel("Observaci\u00F3n/Referencia");
		label_35.setHorizontalAlignment(SwingConstants.LEFT);
		label_35.setFont(new Font("Arial", Font.BOLD, 11));
		label_35.setBounds(1133, 156, 139, 14);
		panel1.add(label_35);

		lblKitAguaPotable = new JLabel("KIT AGUA POTABLE");
		lblKitAguaPotable.setHorizontalAlignment(SwingConstants.CENTER);
		lblKitAguaPotable.setFont(new Font("Arial", Font.BOLD, 11));
		lblKitAguaPotable.setBounds(848, 233, 203, 14);
		panel1.add(lblKitAguaPotable);

		label_25 = new JLabel("Cantidad");
		label_25.setHorizontalAlignment(SwingConstants.CENTER);
		label_25.setFont(new Font("Arial", Font.BOLD, 11));
		label_25.setBounds(1064, 233, 63, 14);
		panel1.add(label_25);
		label_31 = new JLabel(textoLabel31);
		label_31.setVerticalAlignment(SwingConstants.TOP);
		label_31.setHorizontalAlignment(SwingConstants.LEFT);
		label_31.setFont(new Font("Arial", Font.PLAIN, 11));
		label_31.setBounds(848, 258, 214, 94);
		panel1.add(label_31);

		txtAPCantidad00 = new JTextField();
		txtAPCantidad00.setEditable(false);
		txtAPCantidad00.setColumns(10);
		txtAPCantidad00.setBounds(1061, 291, 35, 20);
		panel1.add(txtAPCantidad00);

		txtAPCantidad01 = new JTextField();
		txtAPCantidad01.setColumns(10);
		txtAPCantidad01.setBounds(1098, 291, 35, 20);
		panel1.add(txtAPCantidad01);

		txtAPObs0 = new JTextField();
		txtAPObs0.setColumns(10);
		txtAPObs0.setBounds(1137, 291, 133, 20);
		panel1.add(txtAPObs0);

		label_36 = new JLabel("Observaci\u00F3n/Referencia");
		label_36.setHorizontalAlignment(SwingConstants.LEFT);
		label_36.setFont(new Font("Arial", Font.BOLD, 11));
		label_36.setBounds(1132, 233, 139, 14);
		panel1.add(label_36);
		label_18 = new JLabel(textoLabel18);
		label_18.setVerticalAlignment(SwingConstants.TOP);
		label_18.setHorizontalAlignment(SwingConstants.LEFT);
		label_18.setFont(new Font("Arial", Font.PLAIN, 11));
		label_18.setBounds(849, 347, 214, 70);
		panel1.add(label_18);

		txtAPCantidad10 = new JTextField();
		txtAPCantidad10.setEditable(false);
		txtAPCantidad10.setColumns(10);
		txtAPCantidad10.setBounds(1062, 363, 35, 20);
		panel1.add(txtAPCantidad10);

		txtAPCantidad11 = new JTextField();
		txtAPCantidad11.setColumns(10);
		txtAPCantidad11.setBounds(1099, 363, 35, 20);
		panel1.add(txtAPCantidad11);

		txtAPObs1 = new JTextField();
		txtAPObs1.setColumns(10);
		txtAPObs1.setBounds(1138, 363, 133, 20);
		panel1.add(txtAPObs1);

		lblTuberaDePvc = new JLabel("Tuber\u00EDa de PVC 1/2\" y L=3m");
		lblTuberaDePvc.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberaDePvc.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberaDePvc.setBounds(849, 416, 183, 14);
		panel1.add(lblTuberaDePvc);

		txtAPCantidad20 = new JTextField();
		txtAPCantidad20.setEditable(false);
		txtAPCantidad20.setColumns(10);
		txtAPCantidad20.setBounds(1062, 413, 35, 20);
		panel1.add(txtAPCantidad20);

		txtAPCantidad21 = new JTextField();
		txtAPCantidad21.setColumns(10);
		txtAPCantidad21.setBounds(1099, 413, 35, 20);
		panel1.add(txtAPCantidad21);

		txtAPObs2 = new JTextField();
		txtAPObs2.setColumns(10);
		txtAPObs2.setBounds(1138, 413, 133, 20);
		panel1.add(txtAPObs2);

		lblTuberaDePvc_1 = new JLabel("Tuber\u00EDa de PVC 3/4\" y L=3m");
		lblTuberaDePvc_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberaDePvc_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberaDePvc_1.setBounds(849, 438, 183, 14);
		panel1.add(lblTuberaDePvc_1);

		txtAPCantidad30 = new JTextField();
		txtAPCantidad30.setEditable(false);
		txtAPCantidad30.setColumns(10);
		txtAPCantidad30.setBounds(1062, 435, 35, 20);
		panel1.add(txtAPCantidad30);

		txtAPCantidad31 = new JTextField();
		txtAPCantidad31.setColumns(10);
		txtAPCantidad31.setBounds(1099, 435, 35, 20);
		panel1.add(txtAPCantidad31);

		txtAPObs3 = new JTextField();
		txtAPObs3.setColumns(10);
		txtAPObs3.setBounds(1138, 435, 133, 20);
		panel1.add(txtAPObs3);

		lblkitParaConexin = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 1/2\". (lija<br>pliego, polipega 1/4gal,1 uni\u00F3n)</body></html>");
		lblkitParaConexin.setHorizontalAlignment(SwingConstants.LEFT);
		lblkitParaConexin.setFont(new Font("Arial", Font.PLAIN, 11));
		lblkitParaConexin.setBounds(849, 463, 203, 39);
		panel1.add(lblkitParaConexin);

		txtAPCantidad40 = new JTextField();
		txtAPCantidad40.setEditable(false);
		txtAPCantidad40.setColumns(10);
		txtAPCantidad40.setBounds(1062, 471, 35, 20);
		panel1.add(txtAPCantidad40);

		txtAPCantidad41 = new JTextField();
		txtAPCantidad41.setColumns(10);
		txtAPCantidad41.setBounds(1099, 471, 35, 20);
		panel1.add(txtAPCantidad41);

		txtAPObs4 = new JTextField();
		txtAPObs4.setColumns(10);
		txtAPObs4.setBounds(1138, 471, 133, 20);
		panel1.add(txtAPObs4);

		btnSiguiente = new JButton("Siguiente p\u00E1gina");
		btnSiguiente.setBounds(1072, 502, 188, 23);
		panel1.add(btnSiguiente);

		JPanel panel2 = new JPanel();
		tabbedPane.addTab("2.-PG porton y garita-1", null, panel2, null);
		panel2.setLayout(null);

		label_37 = new JLabel("KIT AGUA RESIDUAL");
		label_37.setHorizontalAlignment(SwingConstants.CENTER);
		label_37.setFont(new Font("Arial", Font.BOLD, 11));
		label_37.setBounds(24, 11, 139, 14);
		panel2.add(label_37);

		lblkitDeAccesorios = new JLabel(
				"<html><body>Kit de Accesorios de Conexi\u00F3n Agua<br>Residual (Lavabos)(4 codo 90\u00B0,1/4 gl<br>polipega ,4 yee 50-110)</body></html>");
		lblkitDeAccesorios.setVerticalAlignment(SwingConstants.TOP);
		lblkitDeAccesorios.setHorizontalAlignment(SwingConstants.LEFT);
		lblkitDeAccesorios.setFont(new Font("Arial", Font.PLAIN, 11));
		lblkitDeAccesorios.setBounds(10, 33, 203, 50);
		panel2.add(lblkitDeAccesorios);

		lblTuberaDemm = new JLabel("Tuber\u00EDa de 50mm PVC y L=3m");
		lblTuberaDemm.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberaDemm.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberaDemm.setBounds(10, 78, 183, 14);
		panel2.add(lblTuberaDemm);

		lblkitDeAccesorios_1 = new JLabel(
				"<html><body>Kit de Accesorios de Conexi\u00F3n Agua<br>Residual (Inodoros)(1/4 gl polipega ,4 yee<br>110)</body></html>");
		lblkitDeAccesorios_1.setVerticalAlignment(SwingConstants.TOP);
		lblkitDeAccesorios_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblkitDeAccesorios_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblkitDeAccesorios_1.setBounds(10, 101, 203, 50);
		panel2.add(lblkitDeAccesorios_1);

		label_41 = new JLabel("Tuber\u00EDa de 75mm PVC y L=3m");
		label_41.setHorizontalAlignment(SwingConstants.LEFT);
		label_41.setFont(new Font("Arial", Font.PLAIN, 11));
		label_41.setBounds(10, 154, 183, 14);
		panel2.add(label_41);

		lblTuberaDePvc_2 = new JLabel("Tuber\u00EDa de PVC 110mm PVC y L=3m");
		lblTuberaDePvc_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberaDePvc_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberaDePvc_2.setBounds(10, 176, 183, 14);
		panel2.add(lblTuberaDePvc_2);

		lblkitParaConexin_1 = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 50 mm. (lija<br>un pliego, polipega 1/4 gal, 1/4 gl suelda<br>l\u00EDquida, 1 uni\u00F3n,1codo 90\u00B0,1codo 45\u00B0)");
		lblkitParaConexin_1.setVerticalAlignment(SwingConstants.TOP);
		lblkitParaConexin_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblkitParaConexin_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblkitParaConexin_1.setBounds(10, 201, 203, 42);
		panel2.add(lblkitParaConexin_1);

		lblkitParaConexin_2 = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 110 mm. (lija<br>pliego, polipega 1/2gal, 1/4 gl suelda<br>l\u00EDquida , 1 union,1codo 90\u00B0,1codo 45\u00B0)</body></html>");
		lblkitParaConexin_2.setVerticalAlignment(SwingConstants.TOP);
		lblkitParaConexin_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblkitParaConexin_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblkitParaConexin_2.setBounds(10, 250, 203, 42);
		panel2.add(lblkitParaConexin_2);

		txtARCantidad60 = new JTextField();
		txtARCantidad60.setColumns(10);
		txtARCantidad60.setBounds(223, 261, 35, 20);
		panel2.add(txtARCantidad60);

		txtARCantidad61 = new JTextField();
		txtARCantidad61.setColumns(10);
		txtARCantidad61.setBounds(260, 261, 35, 20);
		panel2.add(txtARCantidad61);

		txtARCantidad50 = new JTextField();
		txtARCantidad50.setColumns(10);
		txtARCantidad50.setBounds(223, 212, 35, 20);
		panel2.add(txtARCantidad50);

		txtARCantidad51 = new JTextField();
		txtARCantidad51.setColumns(10);
		txtARCantidad51.setBounds(260, 212, 35, 20);
		panel2.add(txtARCantidad51);

		txtARCantidad41 = new JTextField();
		txtARCantidad41.setColumns(10);
		txtARCantidad41.setBounds(260, 173, 35, 20);
		panel2.add(txtARCantidad41);

		txtARCantidad40 = new JTextField();
		txtARCantidad40.setColumns(10);
		txtARCantidad40.setBounds(223, 173, 35, 20);
		panel2.add(txtARCantidad40);

		txtARCantidad30 = new JTextField();
		txtARCantidad30.setColumns(10);
		txtARCantidad30.setBounds(223, 151, 35, 20);
		panel2.add(txtARCantidad30);

		txtARCantidad31 = new JTextField();
		txtARCantidad31.setColumns(10);
		txtARCantidad31.setBounds(260, 151, 35, 20);
		panel2.add(txtARCantidad31);

		txtARCantidad21 = new JTextField();
		txtARCantidad21.setColumns(10);
		txtARCantidad21.setBounds(260, 112, 35, 20);
		panel2.add(txtARCantidad21);

		txtARCantidad20 = new JTextField();
		txtARCantidad20.setColumns(10);
		txtARCantidad20.setBounds(223, 112, 35, 20);
		panel2.add(txtARCantidad20);

		txtARCantidad10 = new JTextField();
		txtARCantidad10.setColumns(10);
		txtARCantidad10.setBounds(223, 75, 35, 20);
		panel2.add(txtARCantidad10);

		txtARCantidad00 = new JTextField();
		txtARCantidad00.setColumns(10);
		txtARCantidad00.setBounds(223, 44, 35, 20);
		panel2.add(txtARCantidad00);

		txtARCantidad01 = new JTextField();
		txtARCantidad01.setColumns(10);
		txtARCantidad01.setBounds(260, 44, 35, 20);
		panel2.add(txtARCantidad01);

		txtARCantidad11 = new JTextField();
		txtARCantidad11.setColumns(10);
		txtARCantidad11.setBounds(260, 75, 35, 20);
		panel2.add(txtARCantidad11);

		label_45 = new JLabel("Cantidad");
		label_45.setHorizontalAlignment(SwingConstants.CENTER);
		label_45.setFont(new Font("Arial", Font.BOLD, 11));
		label_45.setBounds(227, 11, 63, 14);
		panel2.add(label_45);

		label_46 = new JLabel("Observaci\u00F3n/Referencia");
		label_46.setHorizontalAlignment(SwingConstants.LEFT);
		label_46.setFont(new Font("Arial", Font.BOLD, 11));
		label_46.setBounds(299, 11, 139, 14);
		panel2.add(label_46);

		txtARObs0 = new JTextField();
		txtARObs0.setColumns(10);
		txtARObs0.setBounds(299, 44, 133, 20);
		panel2.add(txtARObs0);

		txtARObs1 = new JTextField();
		txtARObs1.setColumns(10);
		txtARObs1.setBounds(299, 75, 133, 20);
		panel2.add(txtARObs1);

		txtARObs2 = new JTextField();
		txtARObs2.setColumns(10);
		txtARObs2.setBounds(299, 112, 133, 20);
		panel2.add(txtARObs2);

		txtARObs3 = new JTextField();
		txtARObs3.setColumns(10);
		txtARObs3.setBounds(299, 151, 133, 20);
		panel2.add(txtARObs3);

		txtARObs4 = new JTextField();
		txtARObs4.setColumns(10);
		txtARObs4.setBounds(299, 173, 133, 20);
		panel2.add(txtARObs4);

		txtARObs5 = new JTextField();
		txtARObs5.setColumns(10);
		txtARObs5.setBounds(299, 212, 133, 20);
		panel2.add(txtARObs5);

		txtARObs6 = new JTextField();
		txtARObs6.setColumns(10);
		txtARObs6.setBounds(299, 261, 133, 20);
		panel2.add(txtARObs6);

		label_38 = new JLabel("COMPONENTE ESTRUCTURAL");
		label_38.setHorizontalAlignment(SwingConstants.CENTER);
		label_38.setFont(new Font("Arial", Font.BOLD, 11));
		label_38.setBounds(10, 292, 203, 14);
		panel2.add(label_38);

		label_39 = new JLabel("Cantidad");
		label_39.setHorizontalAlignment(SwingConstants.CENTER);
		label_39.setFont(new Font("Arial", Font.BOLD, 11));
		label_39.setBounds(227, 292, 63, 14);
		panel2.add(label_39);

		label_40 = new JLabel("Observaci\u00F3n/Referencia");
		label_40.setHorizontalAlignment(SwingConstants.LEFT);
		label_40.setFont(new Font("Arial", Font.BOLD, 11));
		label_40.setBounds(299, 292, 139, 14);
		panel2.add(label_40);

		lblDadosDeCimentacin = new JLabel("Dados de cimentaci\u00F3n garita");
		lblDadosDeCimentacin.setHorizontalAlignment(SwingConstants.LEFT);
		lblDadosDeCimentacin.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDadosDeCimentacin.setBounds(10, 317, 203, 14);
		panel2.add(lblDadosDeCimentacin);

		label_43 = new JLabel("Perfil SF Tipo 1");
		label_43.setHorizontalAlignment(SwingConstants.LEFT);
		label_43.setFont(new Font("Arial", Font.PLAIN, 11));
		label_43.setBounds(10, 339, 203, 14);
		panel2.add(label_43);

		label_44 = new JLabel("Perfil SF Tipo 2");
		label_44.setHorizontalAlignment(SwingConstants.LEFT);
		label_44.setFont(new Font("Arial", Font.PLAIN, 11));
		label_44.setBounds(10, 361, 203, 14);
		panel2.add(label_44);

		label_47 = new JLabel("Perfil SF Tipo 3");
		label_47.setHorizontalAlignment(SwingConstants.LEFT);
		label_47.setFont(new Font("Arial", Font.PLAIN, 11));
		label_47.setBounds(10, 383, 203, 14);
		panel2.add(label_47);

		label_48 = new JLabel("Perfil SF Tipo 4");
		label_48.setHorizontalAlignment(SwingConstants.LEFT);
		label_48.setFont(new Font("Arial", Font.PLAIN, 11));
		label_48.setBounds(10, 405, 203, 14);
		panel2.add(label_48);

		lblPerfilSfTipo = new JLabel("Perfil SF Tipo 6");
		lblPerfilSfTipo.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo.setBounds(10, 427, 203, 14);
		panel2.add(lblPerfilSfTipo);

		lblPerfilSfTipo_1 = new JLabel("Perfil SF Tipo 7");
		lblPerfilSfTipo_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_1.setBounds(10, 449, 203, 14);
		panel2.add(lblPerfilSfTipo_1);

		lblPerfilSfTipo_2 = new JLabel("Perfil SF Tipo 8");
		lblPerfilSfTipo_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_2.setBounds(10, 471, 203, 14);
		panel2.add(lblPerfilSfTipo_2);

		lblPerfilSfTipo_3 = new JLabel("Perfil SF Tipo 9");
		lblPerfilSfTipo_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_3.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_3.setBounds(10, 493, 203, 14);
		panel2.add(lblPerfilSfTipo_3);

		lblPerfilSfTipo_4 = new JLabel("Perfil SF Tipo 11");
		lblPerfilSfTipo_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_4.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_4.setBounds(10, 515, 203, 14);
		panel2.add(lblPerfilSfTipo_4);

		txtCECantidad90 = new JTextField();
		txtCECantidad90.setColumns(10);
		txtCECantidad90.setBounds(223, 512, 35, 20);
		panel2.add(txtCECantidad90);

		txtCECantidad80 = new JTextField();
		txtCECantidad80.setColumns(10);
		txtCECantidad80.setBounds(223, 490, 35, 20);
		panel2.add(txtCECantidad80);

		txtCECantidad70 = new JTextField();
		txtCECantidad70.setColumns(10);
		txtCECantidad70.setBounds(223, 468, 35, 20);
		panel2.add(txtCECantidad70);

		txtCECantidad60 = new JTextField();
		txtCECantidad60.setColumns(10);
		txtCECantidad60.setBounds(223, 446, 35, 20);
		panel2.add(txtCECantidad60);

		txtCECantidad50 = new JTextField();
		txtCECantidad50.setColumns(10);
		txtCECantidad50.setBounds(223, 424, 35, 20);
		panel2.add(txtCECantidad50);

		txtCECantidad40 = new JTextField();
		txtCECantidad40.setColumns(10);
		txtCECantidad40.setBounds(223, 402, 35, 20);
		panel2.add(txtCECantidad40);

		txtCECantidad30 = new JTextField();
		txtCECantidad30.setColumns(10);
		txtCECantidad30.setBounds(223, 380, 35, 20);
		panel2.add(txtCECantidad30);

		txtCECantidad20 = new JTextField();
		txtCECantidad20.setColumns(10);
		txtCECantidad20.setBounds(223, 358, 35, 20);
		panel2.add(txtCECantidad20);

		txtCECantidad10 = new JTextField();
		txtCECantidad10.setColumns(10);
		txtCECantidad10.setBounds(223, 336, 35, 20);
		panel2.add(txtCECantidad10);

		txtCECantidad00 = new JTextField();
		txtCECantidad00.setColumns(10);
		txtCECantidad00.setBounds(223, 314, 35, 20);
		panel2.add(txtCECantidad00);

		txtCECantidad01 = new JTextField();
		txtCECantidad01.setColumns(10);
		txtCECantidad01.setBounds(260, 314, 35, 20);
		panel2.add(txtCECantidad01);

		txtCECantidad11 = new JTextField();
		txtCECantidad11.setColumns(10);
		txtCECantidad11.setBounds(260, 336, 35, 20);
		panel2.add(txtCECantidad11);

		txtCECantidad21 = new JTextField();
		txtCECantidad21.setColumns(10);
		txtCECantidad21.setBounds(260, 358, 35, 20);
		panel2.add(txtCECantidad21);

		txtCECantidad31 = new JTextField();
		txtCECantidad31.setColumns(10);
		txtCECantidad31.setBounds(260, 380, 35, 20);
		panel2.add(txtCECantidad31);

		txtCECantidad41 = new JTextField();
		txtCECantidad41.setColumns(10);
		txtCECantidad41.setBounds(260, 402, 35, 20);
		panel2.add(txtCECantidad41);

		txtCECantidad51 = new JTextField();
		txtCECantidad51.setColumns(10);
		txtCECantidad51.setBounds(260, 424, 35, 20);
		panel2.add(txtCECantidad51);

		txtCECantidad61 = new JTextField();
		txtCECantidad61.setColumns(10);
		txtCECantidad61.setBounds(260, 446, 35, 20);
		panel2.add(txtCECantidad61);

		txtCECantidad71 = new JTextField();
		txtCECantidad71.setColumns(10);
		txtCECantidad71.setBounds(260, 468, 35, 20);
		panel2.add(txtCECantidad71);

		txtCECantidad81 = new JTextField();
		txtCECantidad81.setColumns(10);
		txtCECantidad81.setBounds(260, 490, 35, 20);
		panel2.add(txtCECantidad81);

		txtCECantidad91 = new JTextField();
		txtCECantidad91.setColumns(10);
		txtCECantidad91.setBounds(260, 512, 35, 20);
		panel2.add(txtCECantidad91);

		txtCEObs10 = new JTextField();
		txtCEObs10.setColumns(10);
		txtCEObs10.setBounds(299, 512, 133, 20);
		panel2.add(txtCEObs10);

		txtCEObs9 = new JTextField();
		txtCEObs9.setColumns(10);
		txtCEObs9.setBounds(299, 490, 133, 20);
		panel2.add(txtCEObs9);

		txtCEObs8 = new JTextField();
		txtCEObs8.setColumns(10);
		txtCEObs8.setBounds(299, 468, 133, 20);
		panel2.add(txtCEObs8);

		txtCEObs7 = new JTextField();
		txtCEObs7.setColumns(10);
		txtCEObs7.setBounds(299, 446, 133, 20);
		panel2.add(txtCEObs7);

		txtCEObs6 = new JTextField();
		txtCEObs6.setColumns(10);
		txtCEObs6.setBounds(299, 424, 133, 20);
		panel2.add(txtCEObs6);

		txtCEObs5 = new JTextField();
		txtCEObs5.setColumns(10);
		txtCEObs5.setBounds(299, 402, 133, 20);
		panel2.add(txtCEObs5);

		txtCEObs4 = new JTextField();
		txtCEObs4.setColumns(10);
		txtCEObs4.setBounds(299, 380, 133, 20);
		panel2.add(txtCEObs4);

		txtCEObs3 = new JTextField();
		txtCEObs3.setColumns(10);
		txtCEObs3.setBounds(299, 358, 133, 20);
		panel2.add(txtCEObs3);

		txtCEObs1 = new JTextField();
		txtCEObs1.setColumns(10);
		txtCEObs1.setBounds(299, 336, 133, 20);
		panel2.add(txtCEObs1);

		txtCEObs0 = new JTextField();
		txtCEObs0.setColumns(10);
		txtCEObs0.setBounds(299, 314, 133, 20);
		panel2.add(txtCEObs0);

		lblPortn = new JLabel("PORT\u00D3N");
		lblPortn.setHorizontalAlignment(SwingConstants.CENTER);
		lblPortn.setFont(new Font("Arial", Font.BOLD, 11));
		lblPortn.setBounds(442, 11, 203, 14);
		panel2.add(lblPortn);

		lblLuminariasDePared = new JLabel("Luminarias de pared LED 40 w - 2250 lum");
		lblLuminariasDePared.setHorizontalAlignment(SwingConstants.LEFT);
		lblLuminariasDePared.setFont(new Font("Arial", Font.PLAIN, 11));
		lblLuminariasDePared.setBounds(442, 36, 203, 14);
		panel2.add(lblLuminariasDePared);

		txtPCantidad00 = new JTextField();
		txtPCantidad00.setColumns(10);
		txtPCantidad00.setBounds(649, 33, 35, 20);
		panel2.add(txtPCantidad00);

		label_50 = new JLabel("Cantidad");
		label_50.setHorizontalAlignment(SwingConstants.CENTER);
		label_50.setFont(new Font("Arial", Font.BOLD, 11));
		label_50.setBounds(652, 11, 63, 14);
		panel2.add(label_50);

		txtPCantidad01 = new JTextField();
		txtPCantidad01.setColumns(10);
		txtPCantidad01.setBounds(686, 33, 35, 20);
		panel2.add(txtPCantidad01);

		txtPObs0 = new JTextField();
		txtPObs0.setColumns(10);
		txtPObs0.setBounds(725, 33, 133, 20);
		panel2.add(txtPObs0);

		label_51 = new JLabel("Observaci\u00F3n/Referencia");
		label_51.setHorizontalAlignment(SwingConstants.LEFT);
		label_51.setFont(new Font("Arial", Font.BOLD, 11));
		label_51.setBounds(725, 11, 139, 14);
		panel2.add(label_51);

		lblElementoPortn = new JLabel("Elemento Port\u00F3n - (2,55x2,15 mts)");
		lblElementoPortn.setHorizontalAlignment(SwingConstants.LEFT);
		lblElementoPortn.setFont(new Font("Arial", Font.PLAIN, 11));
		lblElementoPortn.setBounds(442, 58, 203, 14);
		panel2.add(lblElementoPortn);

		txtPCantidad10 = new JTextField();
		txtPCantidad10.setColumns(10);
		txtPCantidad10.setBounds(649, 55, 35, 20);
		panel2.add(txtPCantidad10);

		txtPCantidad11 = new JTextField();
		txtPCantidad11.setColumns(10);
		txtPCantidad11.setBounds(686, 55, 35, 20);
		panel2.add(txtPCantidad11);

		txtPObs1 = new JTextField();
		txtPObs1.setColumns(10);
		txtPObs1.setBounds(725, 55, 133, 20);
		panel2.add(txtPObs1);

		lblComponenteArquitectnico = new JLabel("COMPONENTE ARQUITECT\u00D3NICO");
		lblComponenteArquitectnico.setHorizontalAlignment(SwingConstants.CENTER);
		lblComponenteArquitectnico.setFont(new Font("Arial", Font.BOLD, 11));
		lblComponenteArquitectnico.setBounds(442, 94, 203, 14);
		panel2.add(lblComponenteArquitectnico);

		lblPanelesEpsPared_5 = new JLabel("Paneles EPS pared port\u00F3n- (2,50x1,52 mt)");
		lblPanelesEpsPared_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_5.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_5.setBounds(442, 119, 203, 14);
		panel2.add(lblPanelesEpsPared_5);

		lblPanelesEpsPared_6 = new JLabel("Paneles EPS pared port\u00F3n- (2,50x0,.65)");
		lblPanelesEpsPared_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_6.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_6.setBounds(442, 141, 203, 14);
		panel2.add(lblPanelesEpsPared_6);

		lblPanelesEpsPared_7 = new JLabel("Paneles EPS pared port\u00F3n- (1,0x0,35 mt)");
		lblPanelesEpsPared_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_7.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_7.setBounds(442, 163, 203, 14);
		panel2.add(lblPanelesEpsPared_7);

		lblPanelesEpsPared_8 = new JLabel("Paneles EPS pared port\u00F3n- (1,20x4,0 mt)");
		lblPanelesEpsPared_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_8.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_8.setBounds(442, 185, 203, 14);
		panel2.add(lblPanelesEpsPared_8);

		lblPanelesEpsPared_9 = new JLabel("Paneles EPS pared port\u00F3n- (1,0x1,0 mt)");
		lblPanelesEpsPared_9.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_9.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_9.setBounds(442, 207, 203, 14);
		panel2.add(lblPanelesEpsPared_9);

		lblPanelesEpsPared_10 = new JLabel("Paneles EPS pared port\u00F3n- (1,0x0,85 mt)");
		lblPanelesEpsPared_10.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_10.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_10.setBounds(442, 229, 203, 14);
		panel2.add(lblPanelesEpsPared_10);

		lblPanelesEpsPared_11 = new JLabel("Paneles EPS pared port\u00F3n- (0,42x3,0 mt)");
		lblPanelesEpsPared_11.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_11.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_11.setBounds(442, 251, 203, 14);
		panel2.add(lblPanelesEpsPared_11);

		lblPanelesEpsPared_12 = new JLabel("Paneles EPS pared port\u00F3n- (0,55x0,85 mt)");
		lblPanelesEpsPared_12.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_12.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_12.setBounds(442, 273, 203, 14);
		panel2.add(lblPanelesEpsPared_12);

		lblPanelesEpsPared_13 = new JLabel("Paneles EPS pared port\u00F3n- (0,30x3,0 mt)");
		lblPanelesEpsPared_13.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_13.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_13.setBounds(442, 295, 203, 14);
		panel2.add(lblPanelesEpsPared_13);

		lblPanelesEpsPared_14 = new JLabel("Paneles EPS pared port\u00F3n- (0,6x2,5 mt)");
		lblPanelesEpsPared_14.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_14.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_14.setBounds(442, 317, 203, 14);
		panel2.add(lblPanelesEpsPared_14);

		lblPanelesEpsPared_15 = new JLabel("Paneles EPS pared port\u00F3n- (1,50x2,50 mt)");
		lblPanelesEpsPared_15.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_15.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_15.setBounds(442, 339, 203, 14);
		panel2.add(lblPanelesEpsPared_15);

		lblPanelesEpsPared_16 = new JLabel("Paneles EPS pared port\u00F3n- (2,50x1,52 mt)");
		lblPanelesEpsPared_16.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_16.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_16.setBounds(442, 361, 203, 14);
		panel2.add(lblPanelesEpsPared_16);

		txtCACantidad110 = new JTextField();
		txtCACantidad110.setColumns(10);
		txtCACantidad110.setBounds(649, 355, 35, 20);
		panel2.add(txtCACantidad110);

		txtCACantidad100 = new JTextField();
		txtCACantidad100.setColumns(10);
		txtCACantidad100.setBounds(649, 333, 35, 20);
		panel2.add(txtCACantidad100);

		txtCACantidad90 = new JTextField();
		txtCACantidad90.setColumns(10);
		txtCACantidad90.setBounds(649, 311, 35, 20);
		panel2.add(txtCACantidad90);

		txtCACantidad80 = new JTextField();
		txtCACantidad80.setColumns(10);
		txtCACantidad80.setBounds(649, 289, 35, 20);
		panel2.add(txtCACantidad80);

		txtCACantidad70 = new JTextField();
		txtCACantidad70.setColumns(10);
		txtCACantidad70.setBounds(649, 267, 35, 20);
		panel2.add(txtCACantidad70);

		txtCACantidad60 = new JTextField();
		txtCACantidad60.setColumns(10);
		txtCACantidad60.setBounds(649, 245, 35, 20);
		panel2.add(txtCACantidad60);

		txtCACantidad50 = new JTextField();
		txtCACantidad50.setColumns(10);
		txtCACantidad50.setBounds(649, 223, 35, 20);
		panel2.add(txtCACantidad50);

		txtCACantidad40 = new JTextField();
		txtCACantidad40.setColumns(10);
		txtCACantidad40.setBounds(649, 201, 35, 20);
		panel2.add(txtCACantidad40);

		txtCACantidad30 = new JTextField();
		txtCACantidad30.setColumns(10);
		txtCACantidad30.setBounds(649, 179, 35, 20);
		panel2.add(txtCACantidad30);

		txtCACantidad20 = new JTextField();
		txtCACantidad20.setColumns(10);
		txtCACantidad20.setBounds(649, 157, 35, 20);
		panel2.add(txtCACantidad20);

		txtCACantidad10 = new JTextField();
		txtCACantidad10.setColumns(10);
		txtCACantidad10.setBounds(649, 135, 35, 20);
		panel2.add(txtCACantidad10);

		txtCACantidad00 = new JTextField();
		txtCACantidad00.setColumns(10);
		txtCACantidad00.setBounds(649, 113, 35, 20);
		panel2.add(txtCACantidad00);

		label_63 = new JLabel("Cantidad");
		label_63.setHorizontalAlignment(SwingConstants.CENTER);
		label_63.setFont(new Font("Arial", Font.BOLD, 11));
		label_63.setBounds(652, 91, 63, 14);
		panel2.add(label_63);

		txtCACantidad01 = new JTextField();
		txtCACantidad01.setColumns(10);
		txtCACantidad01.setBounds(686, 113, 35, 20);
		panel2.add(txtCACantidad01);

		txtCACantidad11 = new JTextField();
		txtCACantidad11.setColumns(10);
		txtCACantidad11.setBounds(686, 135, 35, 20);
		panel2.add(txtCACantidad11);

		txtCACantidad21 = new JTextField();
		txtCACantidad21.setColumns(10);
		txtCACantidad21.setBounds(686, 157, 35, 20);
		panel2.add(txtCACantidad21);

		txtCACantidad31 = new JTextField();
		txtCACantidad31.setColumns(10);
		txtCACantidad31.setBounds(686, 179, 35, 20);
		panel2.add(txtCACantidad31);

		txtCACantidad41 = new JTextField();
		txtCACantidad41.setColumns(10);
		txtCACantidad41.setBounds(686, 201, 35, 20);
		panel2.add(txtCACantidad41);

		txtCACantidad51 = new JTextField();
		txtCACantidad51.setColumns(10);
		txtCACantidad51.setBounds(686, 223, 35, 20);
		panel2.add(txtCACantidad51);

		txtCACantidad61 = new JTextField();
		txtCACantidad61.setColumns(10);
		txtCACantidad61.setBounds(686, 245, 35, 20);
		panel2.add(txtCACantidad61);

		txtCACantidad71 = new JTextField();
		txtCACantidad71.setColumns(10);
		txtCACantidad71.setBounds(686, 267, 35, 20);
		panel2.add(txtCACantidad71);

		txtCACantidad81 = new JTextField();
		txtCACantidad81.setColumns(10);
		txtCACantidad81.setBounds(686, 289, 35, 20);
		panel2.add(txtCACantidad81);

		txtCACantidad91 = new JTextField();
		txtCACantidad91.setColumns(10);
		txtCACantidad91.setBounds(686, 311, 35, 20);
		panel2.add(txtCACantidad91);

		txtCACantidad101 = new JTextField();
		txtCACantidad101.setColumns(10);
		txtCACantidad101.setBounds(686, 333, 35, 20);
		panel2.add(txtCACantidad101);

		txtCACantidad111 = new JTextField();
		txtCACantidad111.setColumns(10);
		txtCACantidad111.setBounds(686, 355, 35, 20);
		panel2.add(txtCACantidad111);

		txtCAObs11 = new JTextField();
		txtCAObs11.setColumns(10);
		txtCAObs11.setBounds(725, 355, 133, 20);
		panel2.add(txtCAObs11);

		txtCAObs10 = new JTextField();
		txtCAObs10.setColumns(10);
		txtCAObs10.setBounds(725, 333, 133, 20);
		panel2.add(txtCAObs10);

		txtCAObs9 = new JTextField();
		txtCAObs9.setColumns(10);
		txtCAObs9.setBounds(725, 311, 133, 20);
		panel2.add(txtCAObs9);

		txtCAObs8 = new JTextField();
		txtCAObs8.setColumns(10);
		txtCAObs8.setBounds(725, 289, 133, 20);
		panel2.add(txtCAObs8);

		txtCAObs7 = new JTextField();
		txtCAObs7.setColumns(10);
		txtCAObs7.setBounds(725, 267, 133, 20);
		panel2.add(txtCAObs7);

		txtCAObs6 = new JTextField();
		txtCAObs6.setColumns(10);
		txtCAObs6.setBounds(725, 245, 133, 20);
		panel2.add(txtCAObs6);

		txtCAObs5 = new JTextField();
		txtCAObs5.setColumns(10);
		txtCAObs5.setBounds(725, 223, 133, 20);
		panel2.add(txtCAObs5);

		txtCAObs4 = new JTextField();
		txtCAObs4.setColumns(10);
		txtCAObs4.setBounds(725, 201, 133, 20);
		panel2.add(txtCAObs4);

		txtCAObs3 = new JTextField();
		txtCAObs3.setColumns(10);
		txtCAObs3.setBounds(725, 179, 133, 20);
		panel2.add(txtCAObs3);

		txtCAObs2 = new JTextField();
		txtCAObs2.setColumns(10);
		txtCAObs2.setBounds(725, 157, 133, 20);
		panel2.add(txtCAObs2);

		txtCAObs1 = new JTextField();
		txtCAObs1.setColumns(10);
		txtCAObs1.setBounds(725, 135, 133, 20);
		panel2.add(txtCAObs1);

		txtCAObs0 = new JTextField();
		txtCAObs0.setColumns(10);
		txtCAObs0.setBounds(725, 113, 133, 20);
		panel2.add(txtCAObs0);

		label_64 = new JLabel("Observaci\u00F3n/Referencia");
		label_64.setHorizontalAlignment(SwingConstants.LEFT);
		label_64.setFont(new Font("Arial", Font.BOLD, 11));
		label_64.setBounds(725, 91, 139, 14);
		panel2.add(label_64);

		lblPanelesEpsPared_17 = new JLabel("Paneles EPS pared port\u00F3n- (2,50x0,65 mt)");
		lblPanelesEpsPared_17.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_17.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_17.setBounds(442, 383, 203, 14);
		panel2.add(lblPanelesEpsPared_17);

		txtCACantidad120 = new JTextField();
		txtCACantidad120.setColumns(10);
		txtCACantidad120.setBounds(649, 377, 35, 20);
		panel2.add(txtCACantidad120);

		txtCACantidad121 = new JTextField();
		txtCACantidad121.setColumns(10);
		txtCACantidad121.setBounds(686, 377, 35, 20);
		panel2.add(txtCACantidad121);

		txtCAObs12 = new JTextField();
		txtCAObs12.setColumns(10);
		txtCAObs12.setBounds(725, 377, 133, 20);
		panel2.add(txtCAObs12);

		lblPanelesEpsPared_18 = new JLabel("Paneles EPS pared port\u00F3n- (1,0x0,35 mt)");
		lblPanelesEpsPared_18.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPared_18.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPared_18.setBounds(442, 405, 203, 14);
		panel2.add(lblPanelesEpsPared_18);

		txtCACantidad130 = new JTextField();
		txtCACantidad130.setColumns(10);
		txtCACantidad130.setBounds(649, 399, 35, 20);
		panel2.add(txtCACantidad130);

		txtCACantidad131 = new JTextField();
		txtCACantidad131.setColumns(10);
		txtCACantidad131.setBounds(686, 399, 35, 20);
		panel2.add(txtCACantidad131);

		txtCAObs13 = new JTextField();
		txtCAObs13.setColumns(10);
		txtCAObs13.setBounds(725, 399, 133, 20);
		panel2.add(txtCAObs13);

		lblComponenteEstructural = new JLabel("COMPONENTE ESTRUCTURAL");
		lblComponenteEstructural.setHorizontalAlignment(SwingConstants.CENTER);
		lblComponenteEstructural.setFont(new Font("Arial", Font.BOLD, 11));
		lblComponenteEstructural.setBounds(868, 11, 203, 14);
		panel2.add(lblComponenteEstructural);

		lblDadoCimentacinPortn = new JLabel("Dado cimentaci\u00F3n port\u00F3n");
		lblDadoCimentacinPortn.setHorizontalAlignment(SwingConstants.LEFT);
		lblDadoCimentacinPortn.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDadoCimentacinPortn.setBounds(868, 36, 203, 14);
		panel2.add(lblDadoCimentacinPortn);

		lblPerfilSfTipo_5 = new JLabel("Perfil SF Tipo 12 MA-SF-12 para paredes");
		lblPerfilSfTipo_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_5.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_5.setBounds(868, 58, 203, 14);
		panel2.add(lblPerfilSfTipo_5);

		txtCE2Cantidad00 = new JTextField();
		txtCE2Cantidad00.setColumns(10);
		txtCE2Cantidad00.setBounds(1070, 33, 35, 20);
		panel2.add(txtCE2Cantidad00);

		label_53 = new JLabel("Cantidad");
		label_53.setHorizontalAlignment(SwingConstants.CENTER);
		label_53.setFont(new Font("Arial", Font.BOLD, 11));
		label_53.setBounds(1073, 11, 63, 14);
		panel2.add(label_53);

		txtCE2Cantidad01 = new JTextField();
		txtCE2Cantidad01.setColumns(10);
		txtCE2Cantidad01.setBounds(1107, 33, 35, 20);
		panel2.add(txtCE2Cantidad01);

		txtCE2Cantidad11 = new JTextField();
		txtCE2Cantidad11.setColumns(10);
		txtCE2Cantidad11.setBounds(1107, 55, 35, 20);
		panel2.add(txtCE2Cantidad11);

		txtCE2Cantidad10 = new JTextField();
		txtCE2Cantidad10.setColumns(10);
		txtCE2Cantidad10.setBounds(1070, 55, 35, 20);
		panel2.add(txtCE2Cantidad10);

		txtCE2Obs1 = new JTextField();
		txtCE2Obs1.setColumns(10);
		txtCE2Obs1.setBounds(1146, 55, 133, 20);
		panel2.add(txtCE2Obs1);

		txtCE2Obs0 = new JTextField();
		txtCE2Obs0.setColumns(10);
		txtCE2Obs0.setBounds(1146, 33, 133, 20);
		panel2.add(txtCE2Obs0);

		label_54 = new JLabel("Observaci\u00F3n/Referencia");
		label_54.setHorizontalAlignment(SwingConstants.LEFT);
		label_54.setFont(new Font("Arial", Font.BOLD, 11));
		label_54.setBounds(1140, 11, 139, 14);
		panel2.add(label_54);

		lblPerfilSfTipo_6 = new JLabel("Perfil SF Tipo 12 MA-SF-12 para puerta");
		lblPerfilSfTipo_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_6.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_6.setBounds(868, 80, 203, 14);
		panel2.add(lblPerfilSfTipo_6);

		txtCE2Cantidad20 = new JTextField();
		txtCE2Cantidad20.setColumns(10);
		txtCE2Cantidad20.setBounds(1070, 77, 35, 20);
		panel2.add(txtCE2Cantidad20);

		txtCE2Cantidad21 = new JTextField();
		txtCE2Cantidad21.setColumns(10);
		txtCE2Cantidad21.setBounds(1107, 77, 35, 20);
		panel2.add(txtCE2Cantidad21);

		txtCE2Obs2 = new JTextField();
		txtCE2Obs2.setColumns(10);
		txtCE2Obs2.setBounds(1146, 77, 133, 20);
		panel2.add(txtCE2Obs2);

		InformacionObligatoriaV informacionObligatoriaV = new InformacionObligatoriaV(865, 325);
		panel2.add(informacionObligatoriaV.getPnlInformacionObl());

		cabecera.getBtnRegistrar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				ServicioInfoObligatoria srvInfoOblig = new ComponenteInfoObligatoria();
				servFicha = new ComponenteFicha();
				infor = cargarInfoObligatoria(informacionObligatoriaV);
				// System.out.println(infor.gettCabe().getCNombreProyecto());

				if (validarInfo(infor)) {
					srvInfoOblig.crear(infor);
					servFicha.insertarFormulario(cargarListas());
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

	public LinkedList<LinkedList<TdetalleFicha>> cargarListas() {
		LinkedList<TdetalleFicha> listaElectrico = new LinkedList<>();
		LinkedList<TdetalleFicha> listaAL = new LinkedList<>();
		LinkedList<TdetalleFicha> listaFrontal = new LinkedList<>();
		LinkedList<TdetalleFicha> listaPosterior = new LinkedList<>();
		LinkedList<TdetalleFicha> listaLateralIzquierdo = new LinkedList<>();
		LinkedList<TdetalleFicha> listaLateralDerecha = new LinkedList<>();
		LinkedList<TdetalleFicha> listaElectrico2 = new LinkedList<>();
		LinkedList<TdetalleFicha> listaHidro = new LinkedList<>();
		LinkedList<TdetalleFicha> listaAP = new LinkedList<>();
		LinkedList<TdetalleFicha> listaAR = new LinkedList<>();
		LinkedList<TdetalleFicha> listaEstructural = new LinkedList<>();
		LinkedList<TdetalleFicha> listaPorton = new LinkedList<>();
		LinkedList<TdetalleFicha> listaArquitectonico = new LinkedList<>();
		LinkedList<TdetalleFicha> listaEstructural2 = new LinkedList<>();

		ServicioInfoObligatoria srvInfoObl = new ComponenteInfoObligatoria();
		infor.setIoSerial(srvInfoObl.serialInfoOblMax());

		TGrupo grupoTmp = servFicha.buscarGrupo("Kit eléctrico");
		Integer updateFicha = servFicha.buscarUpdateFicha();
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

		grupoTmp = servFicha.buscarGrupo("Kit agua lluvia");
		listaAL.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtALCantidad01.getText()), txtALObs0.getText(), updateFicha));
		listaAL.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtALCantidad11.getText()), txtALObs1.getText(), updateFicha));
		listaAL.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtALCantidad21.getText()), txtALObs2.getText(), updateFicha));
		listaAL.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtALCantidad31.getText()), txtALObs3.getText(), updateFicha));
		listaAL.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtALCantidad41.getText()), txtALObs4.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Fachada frontal");
		listaFrontal.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFFCantidad01.getText()), txtFFObs0.getText(), updateFicha));
		listaFrontal.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFFCantidad11.getText()), txtFFObs1.getText(), updateFicha));
		listaFrontal.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFFCantidad21.getText()), txtFFObs2.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Fachada posterior");
		listaPosterior.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFPCantidad01.getText()), txtFPObs0.getText(), updateFicha));
		listaPosterior.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFPCantidad11.getText()), txtFPObs1.getText(), updateFicha));
		listaPosterior.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFPCantidad21.getText()), txtFPObs2.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Fachada lateral izquierda");
		listaLateralIzquierdo.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFLCantidad01.getText()), txtFLObs0.getText(), updateFicha));
		listaLateralIzquierdo.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFLCantidad11.getText()), txtFLObs1.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Fachada Lateral derecha");
		listaLateralDerecha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFLDCantidad01.getText()), txtFLDObs0.getText(), updateFicha));
		listaLateralDerecha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFLDCantidad11.getText()), txtFLDObs1.getText(), updateFicha));
		listaLateralDerecha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFLDCantidad21.getText()), txtFLDObs2.getText(), updateFicha));
		listaLateralDerecha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFLDCantidad31.getText()), txtFLDObs3.getText(), updateFicha));
		listaLateralDerecha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFLDCantidad41.getText()), txtFLDObs5.getText(), updateFicha));
		listaLateralDerecha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFLDCantidad51.getText()), txtFLDObs6.getText(), updateFicha));
		listaLateralDerecha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFLDCantidad61.getText()), txtFLDObs7.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Kit eléctrico");
		listaElectrico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtKE2Cantidad01.getText()), txtKE2Obs0.getText(), updateFicha));
		listaElectrico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtKE2Cantidad11.getText()), txtKE2Obs1.getText(), updateFicha));
		listaElectrico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtKE2Cantidad21.getText()), txtKE2Obs2.getText(), updateFicha));
		listaElectrico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtKE2Cantidad31.getText()), txtKE2Obs3.getText(), updateFicha));
		listaElectrico2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtKE2Cantidad41.getText()), txtKE2Obs4.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Kit hidrosanitario");
		listaHidro.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtKHCantidad01.getText()), txtKHObs0.getText(), updateFicha));
		listaHidro.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtKHCantidad11.getText()), txtKHObs1.getText(), updateFicha));

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

		grupoTmp = servFicha.buscarGrupo("Kit agua residual");
		listaAR.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtARCantidad01.getText()), txtARObs0.getText(), updateFicha));
		listaAR.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtARCantidad11.getText()), txtARObs1.getText(), updateFicha));
		listaAR.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtARCantidad21.getText()), txtARObs2.getText(), updateFicha));
		listaAR.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtARCantidad31.getText()), txtARObs3.getText(), updateFicha));
		listaAR.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtARCantidad41.getText()), txtARObs4.getText(), updateFicha));
		listaAR.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtARCantidad51.getText()), txtARObs5.getText(), updateFicha));
		listaAR.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtARCantidad61.getText()), txtARObs6.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Componente estructural");
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad01.getText()), txtCEObs0.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad11.getText()), txtCEObs1.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad21.getText()), txtCEObs3.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad31.getText()), txtCEObs4.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad41.getText()), txtCEObs5.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad51.getText()), txtCEObs6.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad61.getText()), txtCEObs7.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad71.getText()), txtCEObs8.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad81.getText()), txtCEObs9.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad91.getText()), txtCEObs10.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Portón");
		listaPorton.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtPCantidad01.getText()), txtPObs0.getText(), updateFicha));
		listaPorton.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtPCantidad11.getText()), txtPObs1.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Componente arquitectónico");
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad01.getText()), txtCAObs0.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad11.getText()), txtCAObs1.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad21.getText()), txtCAObs2.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad31.getText()), txtCAObs3.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad41.getText()), txtCAObs4.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad51.getText()), txtCAObs5.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad61.getText()), txtCAObs6.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad71.getText()), txtCAObs7.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad81.getText()), txtCAObs8.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad91.getText()), txtCAObs9.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad101.getText()), txtCAObs10.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad111.getText()), txtCAObs11.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad121.getText()), txtCAObs12.getText(), updateFicha));
		listaArquitectonico.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCACantidad131.getText()), txtCAObs13.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Componente estructural");
		listaEstructural2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCE2Cantidad01.getText()), txtCE2Obs0.getText(), updateFicha));
		listaEstructural2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCE2Cantidad11.getText()), txtCE2Obs1.getText(), updateFicha));
		listaEstructural2.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCE2Cantidad21.getText()), txtCE2Obs2.getText(), updateFicha));

		LinkedList<LinkedList<TdetalleFicha>> listaFormulario = new LinkedList<LinkedList<TdetalleFicha>>();
		listaFormulario.add(listaElectrico);
		listaFormulario.add(listaAL);
		listaFormulario.add(listaFrontal);
		listaFormulario.add(listaPosterior);
		listaFormulario.add(listaLateralIzquierdo);
		listaFormulario.add(listaLateralDerecha);
		listaFormulario.add(listaElectrico2);
		listaFormulario.add(listaHidro);
		listaFormulario.add(listaAP);
		listaFormulario.add(listaAR);
		listaFormulario.add(listaEstructural);
		listaFormulario.add(listaPorton);
		listaFormulario.add(listaArquitectonico);
		listaFormulario.add(listaEstructural2);

		return listaFormulario;
	}
}
