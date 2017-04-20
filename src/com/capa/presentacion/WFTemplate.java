package com.capa.presentacion;

import static com.capa.negocios.Calculos.calcularPorcentajeAvance;
import static com.capa.util.Utilitarios.cargarInfoObligatoria;
import static com.capa.util.Utilitarios.getPathImagen;
import static com.capa.util.Utilitarios.gettCabecera;
import static com.capa.util.Utilitarios.llenarCabecera;
import static com.capa.util.Validaciones.*;
import static com.capa.util.Constantes.*;

import java.awt.Font;
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

public class WFTemplate extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4051441821505906861L;
	private JPanel contentPane;
	private JTextField txtCantidad20;
	private JTextField txtCantidad10;
	private JTextField txtCantidad00;
	private JTextField txtCantidad01;
	private JTextField txtCantidad11;
	private JTextField txtCantidad21;
	private JTextField txtObs2;
	private JTextField txtObs1;
	private JTextField txtObs0;
	private JTextField txtCantidad30;
	private JTextField txtCantidad31;
	private JTextField txtObs3;
	private JTextField txtCantidad70;
	private JTextField txtCantidad60;
	private JTextField txtCantidad50;
	private JTextField txtCantidad40;
	private JTextField txtCantidad41;
	private JTextField txtCantidad51;
	private JTextField txtCantidad61;
	private JTextField txtCantidad71;
	private JTextField txtObs7;
	private JTextField txtObs6;
	private JTextField txtObs5;
	private JTextField txtObs4;
	private JTextField txtCantidad80;
	private JTextField txtCantidad81;
	private JTextField txtObs8;
	private JTextField txtCantidad90;
	private JTextField txtCantidad91;
	private JTextField txtObs9;
	private JTextField txtCantidad100;
	private JTextField txtCantidad101;
	private JTextField txtObs10;
	private JTextField txtCantidad110;
	private JTextField txtCantidad111;
	private JTextField txtObs11;
	private JTextField txtCantidad120;
	private JTextField txtCantidad121;
	private JTextField txtObs12;
	private JTextField txtCantidad130;
	private JTextField txtCantidad131;
	private JTextField txtObs13;
	private JTextField txtCantidad140;
	private JTextField txtCantidad141;
	private JTextField txtObs14;
	private JTextField txtCantidad150;
	private JTextField txtCantidad151;
	private JTextField txtObs15;
	private JTextField txtCantidad160;
	private JTextField txtCantidad161;
	private JTextField txtObs16;

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
	// WFTemplate frame = new WFTemplate();
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
	public WFTemplate(TFicha ficha) {
		this.ficha = ficha;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1320, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setTitle(Utilitarios.getNombreFicha() + ficha.getFiNombre());
		servFicha = new ComponenteFicha();

		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());
		contentPane.setLayout(null);

		llenarCabecera(cabecera);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(
				new TitledBorder(null, "1.- WF-voz y datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 131, 1294, 559);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblKitVozY = new JLabel("KIT VOZ Y DATOS WF");
		lblKitVozY.setHorizontalAlignment(SwingConstants.CENTER);
		lblKitVozY.setFont(new Font("Arial", Font.BOLD, 11));
		lblKitVozY.setBounds(101, 28, 203, 14);
		panel_1.add(lblKitVozY);

		JLabel lblTomaRjDatos = new JLabel("Toma RJ45 datos");
		lblTomaRjDatos.setHorizontalAlignment(SwingConstants.LEFT);
		lblTomaRjDatos.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTomaRjDatos.setBounds(101, 53, 203, 14);
		panel_1.add(lblTomaRjDatos);

		JLabel lblTomaRjVoz = new JLabel("Toma RJ45 voz");
		lblTomaRjVoz.setHorizontalAlignment(SwingConstants.LEFT);
		lblTomaRjVoz.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTomaRjVoz.setBounds(101, 75, 203, 14);
		panel_1.add(lblTomaRjVoz);

		JLabel lblRouterWirelessTipo = new JLabel("Router wireless Tipo N");
		lblRouterWirelessTipo.setHorizontalAlignment(SwingConstants.LEFT);
		lblRouterWirelessTipo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblRouterWirelessTipo.setBounds(101, 97, 203, 14);
		panel_1.add(lblRouterWirelessTipo);

		txtCantidad20 = new JTextField();
		txtCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad20.setText("1");
		txtCantidad20.setEditable(false);
		txtCantidad20.setColumns(10);
		txtCantidad20.setBounds(314, 94, 35, 20);
		panel_1.add(txtCantidad20);

		txtCantidad10 = new JTextField();
		txtCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad10.setText("1");
		txtCantidad10.setEditable(false);
		txtCantidad10.setColumns(10);
		txtCantidad10.setBounds(314, 72, 35, 20);
		panel_1.add(txtCantidad10);

		txtCantidad00 = new JTextField();
		txtCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad00.setText("3");
		txtCantidad00.setEditable(false);
		txtCantidad00.setColumns(10);
		txtCantidad00.setBounds(314, 50, 35, 20);
		panel_1.add(txtCantidad00);

		JLabel label_4 = new JLabel("Cantidad");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Arial", Font.BOLD, 11));
		label_4.setBounds(317, 28, 63, 14);
		panel_1.add(label_4);

		txtCantidad01 = new JTextField();
		txtCantidad01.setColumns(10);
		txtCantidad01.setBounds(351, 50, 35, 20);
		panel_1.add(txtCantidad01);
		validarDigitos(txtCantidad01);

		txtCantidad11 = new JTextField();
		txtCantidad11.setColumns(10);
		txtCantidad11.setBounds(351, 72, 35, 20);
		panel_1.add(txtCantidad11);
		validarDigitos(txtCantidad11);

		txtCantidad21 = new JTextField();
		txtCantidad21.setColumns(10);
		txtCantidad21.setBounds(351, 94, 35, 20);
		panel_1.add(txtCantidad21);

		txtObs2 = new JTextField();
		txtObs2.setColumns(10);
		txtObs2.setBounds(396, 94, 167, 20);
		panel_1.add(txtObs2);

		txtObs1 = new JTextField();
		txtObs1.setColumns(10);
		txtObs1.setBounds(396, 72, 167, 20);
		panel_1.add(txtObs1);

		txtObs0 = new JTextField();
		txtObs0.setColumns(10);
		txtObs0.setBounds(396, 50, 167, 20);
		panel_1.add(txtObs0);

		JLabel label_5 = new JLabel("Observaci\u00F3n/Referencia");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Arial", Font.BOLD, 11));
		label_5.setBounds(403, 28, 153, 14);
		panel_1.add(label_5);

		JLabel lblAccessPointTipo = new JLabel("Access point tipo N");
		lblAccessPointTipo.setHorizontalAlignment(SwingConstants.LEFT);
		lblAccessPointTipo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblAccessPointTipo.setBounds(101, 119, 203, 14);
		panel_1.add(lblAccessPointTipo);

		txtCantidad30 = new JTextField();
		txtCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad30.setText("2");
		txtCantidad30.setEditable(false);
		txtCantidad30.setColumns(10);
		txtCantidad30.setBounds(314, 116, 35, 20);
		panel_1.add(txtCantidad30);

		txtCantidad31 = new JTextField();
		txtCantidad31.setColumns(10);
		txtCantidad31.setBounds(351, 116, 35, 20);
		panel_1.add(txtCantidad31);
		validarDigitos(txtCantidad31);

		txtObs3 = new JTextField();
		txtObs3.setColumns(10);
		txtObs3.setBounds(396, 116, 167, 20);
		panel_1.add(txtObs3);

		JLabel lblKitDeInterconexin = new JLabel("KIT DE INTERCONEXI\u00D3N VOZ Y DATOS");
		lblKitDeInterconexin.setHorizontalAlignment(SwingConstants.CENTER);
		lblKitDeInterconexin.setFont(new Font("Arial", Font.BOLD, 11));
		lblKitDeInterconexin.setBounds(101, 155, 203, 14);
		panel_1.add(lblKitDeInterconexin);

		JLabel lblSocketsDePared = new JLabel("Sockets de pared cat 6 RJ45");
		lblSocketsDePared.setHorizontalAlignment(SwingConstants.LEFT);
		lblSocketsDePared.setFont(new Font("Arial", Font.PLAIN, 11));
		lblSocketsDePared.setBounds(101, 180, 203, 14);
		panel_1.add(lblSocketsDePared);

		JLabel lblTuberaPvc = new JLabel("Tuber\u00EDa PVC 1/2' l=6 mt");
		lblTuberaPvc.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberaPvc.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberaPvc.setBounds(101, 202, 203, 14);
		panel_1.add(lblTuberaPvc);

		JLabel lblCableDeRed = new JLabel("Cable de red CAT6 l=150m");
		lblCableDeRed.setHorizontalAlignment(SwingConstants.LEFT);
		lblCableDeRed.setFont(new Font("Arial", Font.PLAIN, 11));
		lblCableDeRed.setBounds(101, 224, 203, 14);
		panel_1.add(lblCableDeRed);

		JLabel lblBandejaParaMontaje = new JLabel("Bandeja para montaje access point");
		lblBandejaParaMontaje.setHorizontalAlignment(SwingConstants.LEFT);
		lblBandejaParaMontaje.setFont(new Font("Arial", Font.PLAIN, 11));
		lblBandejaParaMontaje.setBounds(101, 246, 203, 14);
		panel_1.add(lblBandejaParaMontaje);

		txtCantidad70 = new JTextField();
		txtCantidad70.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad70.setText("2");
		txtCantidad70.setEditable(false);
		txtCantidad70.setColumns(10);
		txtCantidad70.setBounds(314, 243, 35, 20);
		panel_1.add(txtCantidad70);

		txtCantidad60 = new JTextField();
		txtCantidad60.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad60.setText("2");
		txtCantidad60.setEditable(false);
		txtCantidad60.setColumns(10);
		txtCantidad60.setBounds(314, 221, 35, 20);
		panel_1.add(txtCantidad60);

		txtCantidad50 = new JTextField();
		txtCantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad50.setText("20");
		txtCantidad50.setEditable(false);
		txtCantidad50.setColumns(10);
		txtCantidad50.setBounds(314, 199, 35, 20);
		panel_1.add(txtCantidad50);

		txtCantidad40 = new JTextField();
		txtCantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad40.setText("3");
		txtCantidad40.setEditable(false);
		txtCantidad40.setColumns(10);
		txtCantidad40.setBounds(314, 177, 35, 20);
		panel_1.add(txtCantidad40);

		JLabel label_7 = new JLabel("Cantidad");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Arial", Font.BOLD, 11));
		label_7.setBounds(317, 155, 63, 14);
		panel_1.add(label_7);

		txtCantidad41 = new JTextField();
		txtCantidad41.setColumns(10);
		txtCantidad41.setBounds(351, 177, 35, 20);
		panel_1.add(txtCantidad41);
		validarDigitos(txtCantidad41);

		txtCantidad51 = new JTextField();
		txtCantidad51.setColumns(10);
		txtCantidad51.setBounds(351, 199, 35, 20);
		panel_1.add(txtCantidad51);
		validarDigitos(txtCantidad51);

		txtCantidad61 = new JTextField();
		txtCantidad61.setColumns(10);
		txtCantidad61.setBounds(351, 221, 35, 20);
		panel_1.add(txtCantidad61);
		validarDigitos(txtCantidad61);

		txtCantidad71 = new JTextField();
		txtCantidad71.setColumns(10);
		txtCantidad71.setBounds(351, 243, 35, 20);
		panel_1.add(txtCantidad71);
		validarDigitos(txtCantidad71);

		txtObs7 = new JTextField();
		txtObs7.setColumns(10);
		txtObs7.setBounds(396, 243, 167, 20);
		panel_1.add(txtObs7);

		txtObs6 = new JTextField();
		txtObs6.setColumns(10);
		txtObs6.setBounds(396, 221, 167, 20);
		panel_1.add(txtObs6);

		txtObs5 = new JTextField();
		txtObs5.setColumns(10);
		txtObs5.setBounds(396, 199, 167, 20);
		panel_1.add(txtObs5);

		txtObs4 = new JTextField();
		txtObs4.setColumns(10);
		txtObs4.setBounds(396, 177, 167, 20);
		panel_1.add(txtObs4);

		JLabel label_8 = new JLabel("Observaci\u00F3n/Referencia");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Arial", Font.BOLD, 11));
		label_8.setBounds(403, 155, 153, 14);
		panel_1.add(label_8);

		JLabel lblPatchcordftCat = new JLabel("Patchcord 6ft cat6");
		lblPatchcordftCat.setHorizontalAlignment(SwingConstants.LEFT);
		lblPatchcordftCat.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPatchcordftCat.setBounds(101, 268, 203, 14);
		panel_1.add(lblPatchcordftCat);

		txtCantidad80 = new JTextField();
		txtCantidad80.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad80.setText("6");
		txtCantidad80.setEditable(false);
		txtCantidad80.setColumns(10);
		txtCantidad80.setBounds(314, 265, 35, 20);
		panel_1.add(txtCantidad80);

		txtCantidad81 = new JTextField();
		txtCantidad81.setColumns(10);
		txtCantidad81.setBounds(351, 265, 35, 20);
		panel_1.add(txtCantidad81);
		validarDigitos(txtCantidad81);

		txtObs8 = new JTextField();
		txtObs8.setColumns(10);
		txtObs8.setBounds(396, 265, 167, 20);
		panel_1.add(txtObs8);

		JLabel lblPatchcordftCat_1 = new JLabel("Patchcord 3ft cat6");
		lblPatchcordftCat_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPatchcordftCat_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPatchcordftCat_1.setBounds(101, 290, 203, 14);
		panel_1.add(lblPatchcordftCat_1);

		txtCantidad90 = new JTextField();
		txtCantidad90.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad90.setText("4");
		txtCantidad90.setEditable(false);
		txtCantidad90.setColumns(10);
		txtCantidad90.setBounds(314, 287, 35, 20);
		panel_1.add(txtCantidad90);

		txtCantidad91 = new JTextField();
		txtCantidad91.setColumns(10);
		txtCantidad91.setBounds(351, 287, 35, 20);
		panel_1.add(txtCantidad91);
		validarDigitos(txtCantidad91);

		txtObs9 = new JTextField();
		txtObs9.setColumns(10);
		txtObs9.setBounds(396, 287, 167, 20);
		panel_1.add(txtObs9);

		JLabel lblRackCerradoTipo = new JLabel("Rack cerrado tipo gabinete de 12 UR");
		lblRackCerradoTipo.setHorizontalAlignment(SwingConstants.LEFT);
		lblRackCerradoTipo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblRackCerradoTipo.setBounds(101, 312, 203, 14);
		panel_1.add(lblRackCerradoTipo);

		txtCantidad100 = new JTextField();
		txtCantidad100.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad100.setText("1");
		txtCantidad100.setEditable(false);
		txtCantidad100.setColumns(10);
		txtCantidad100.setBounds(314, 309, 35, 20);
		panel_1.add(txtCantidad100);

		txtCantidad101 = new JTextField();
		txtCantidad101.setColumns(10);
		txtCantidad101.setBounds(351, 309, 35, 20);
		panel_1.add(txtCantidad101);
		validarDigitos(txtCantidad101);

		txtObs10 = new JTextField();
		txtObs10.setColumns(10);
		txtObs10.setBounds(396, 309, 167, 20);
		panel_1.add(txtObs10);

		txtCantidad110 = new JTextField();
		txtCantidad110.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad110.setText("1");
		txtCantidad110.setEditable(false);
		txtCantidad110.setColumns(10);
		txtCantidad110.setBounds(314, 340, 35, 20);
		panel_1.add(txtCantidad110);

		txtCantidad111 = new JTextField();
		txtCantidad111.setColumns(10);
		txtCantidad111.setBounds(351, 340, 35, 20);
		panel_1.add(txtCantidad111);
		validarDigitos(txtCantidad111);

		txtObs11 = new JTextField();
		txtObs11.setColumns(10);
		txtObs11.setBounds(396, 340, 167, 20);
		panel_1.add(txtObs11);

		JLabel lblConversorDeMedia = new JLabel("Conversor de media de fibra \u00F3ptica a UTP");
		lblConversorDeMedia.setHorizontalAlignment(SwingConstants.LEFT);
		lblConversorDeMedia.setFont(new Font("Arial", Font.PLAIN, 11));
		lblConversorDeMedia.setBounds(101, 380, 203, 14);
		panel_1.add(lblConversorDeMedia);

		txtCantidad120 = new JTextField();
		txtCantidad120.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad120.setText("2");
		txtCantidad120.setEditable(false);
		txtCantidad120.setColumns(10);
		txtCantidad120.setBounds(314, 377, 35, 20);
		panel_1.add(txtCantidad120);

		txtCantidad121 = new JTextField();
		txtCantidad121.setColumns(10);
		txtCantidad121.setBounds(351, 377, 35, 20);
		panel_1.add(txtCantidad121);
		validarDigitos(txtCantidad121);

		txtObs12 = new JTextField();
		txtObs12.setColumns(10);
		txtObs12.setBounds(396, 377, 167, 20);
		panel_1.add(txtObs12);

		JLabel lblCajaDeConexin = new JLabel("Caja de conexi\u00F3n 60x60x70 cm");
		lblCajaDeConexin.setHorizontalAlignment(SwingConstants.LEFT);
		lblCajaDeConexin.setFont(new Font("Arial", Font.PLAIN, 11));
		lblCajaDeConexin.setBounds(101, 402, 203, 14);
		panel_1.add(lblCajaDeConexin);

		txtCantidad130 = new JTextField();
		txtCantidad130.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad130.setText("3");
		txtCantidad130.setEditable(false);
		txtCantidad130.setColumns(10);
		txtCantidad130.setBounds(314, 399, 35, 20);
		panel_1.add(txtCantidad130);

		txtCantidad131 = new JTextField();
		txtCantidad131.setColumns(10);
		txtCantidad131.setBounds(351, 399, 35, 20);
		panel_1.add(txtCantidad131);
		validarDigitos(txtCantidad131);

		txtObs13 = new JTextField();
		txtObs13.setColumns(10);
		txtObs13.setBounds(396, 399, 167, 20);
		panel_1.add(txtObs13);

		JLabel lblTuberaPvc_1 = new JLabel("Tuber\u00EDa PVC 2\u201D l=6 mt");
		lblTuberaPvc_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberaPvc_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberaPvc_1.setBounds(101, 424, 203, 14);
		panel_1.add(lblTuberaPvc_1);

		txtCantidad140 = new JTextField();
		txtCantidad140.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad140.setText("10");
		txtCantidad140.setEditable(false);
		txtCantidad140.setColumns(10);
		txtCantidad140.setBounds(314, 421, 35, 20);
		panel_1.add(txtCantidad140);

		txtCantidad141 = new JTextField();
		txtCantidad141.setColumns(10);
		txtCantidad141.setBounds(351, 421, 35, 20);
		panel_1.add(txtCantidad141);
		validarDigitos(txtCantidad141);

		txtObs14 = new JTextField();
		txtObs14.setColumns(10);
		txtObs14.setBounds(396, 421, 167, 20);
		panel_1.add(txtObs14);

		JLabel lblmangueraNegraTipo = new JLabel(
				"<html><body>Manguera negra tipo el\u00E9ctrica de 2\u201D l=6mt<br>y 2 cajas de paso</body></html>");
		lblmangueraNegraTipo.setHorizontalAlignment(SwingConstants.LEFT);
		lblmangueraNegraTipo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblmangueraNegraTipo.setBounds(101, 445, 203, 39);
		panel_1.add(lblmangueraNegraTipo);

		txtCantidad150 = new JTextField();
		txtCantidad150.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad150.setText("1");
		txtCantidad150.setEditable(false);
		txtCantidad150.setColumns(10);
		txtCantidad150.setBounds(314, 453, 35, 20);
		panel_1.add(txtCantidad150);

		txtCantidad151 = new JTextField();
		txtCantidad151.setColumns(10);
		txtCantidad151.setBounds(351, 453, 35, 20);
		panel_1.add(txtCantidad151);
		validarDigitos(txtCantidad151);

		txtObs15 = new JTextField();
		txtObs15.setColumns(10);
		txtObs15.setBounds(396, 453, 167, 20);
		panel_1.add(txtObs15);

		JLabel lblTableroxx = new JLabel("Tablero 20x20x10");
		lblTableroxx.setHorizontalAlignment(SwingConstants.LEFT);
		lblTableroxx.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTableroxx.setBounds(101, 487, 203, 14);
		panel_1.add(lblTableroxx);

		txtCantidad160 = new JTextField();
		txtCantidad160.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad160.setText("1");
		txtCantidad160.setEditable(false);
		txtCantidad160.setColumns(10);
		txtCantidad160.setBounds(314, 484, 35, 20);
		panel_1.add(txtCantidad160);

		txtCantidad161 = new JTextField();
		txtCantidad161.setColumns(10);
		txtCantidad161.setBounds(351, 484, 35, 20);
		panel_1.add(txtCantidad161);
		validarDigitos(txtCantidad161);

		txtObs16 = new JTextField();
		txtObs16.setColumns(10);
		txtObs16.setBounds(396, 484, 167, 20);
		panel_1.add(txtObs16);

		JLabel lblpatchPanel = new JLabel("<html><body>Patch panel 12 puertos CAT 6 (incluye<br>jacks)</body></html>");
		lblpatchPanel.setHorizontalAlignment(SwingConstants.LEFT);
		lblpatchPanel.setFont(new Font("Arial", Font.PLAIN, 11));
		lblpatchPanel.setBounds(101, 334, 203, 39);
		panel_1.add(lblpatchPanel);

		JPinformacionObligatoria informacionObligatoriaV = new JPinformacionObligatoria(865, 325);
		informacionObligatoriaV.getBtnInsertarFoto().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				fotoInfoObl = getPathImagen();
			}
		});
		panel_1.add(informacionObligatoriaV.getPnlInformacionObl());

		llenarFicha();
		cabecera.getBtnRegistrar().addActionListener(new ActionListener() {
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

						Reporte reporte = new Reporte("Reporte MB", 280, 10, 850, 750);
						InputStream path = AlInicio.class.getResourceAsStream("/com/capa/templates/MA.jasper");
						reporte.cargarReporte(path, parametros, Query.getMysql().getConexion());
						reporte.setVisible(true);
						new Menu().setVisible(true);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "ERROR: Verificar valores ejecutados!", "Mensaje de Error",
								JOptionPane.ERROR_MESSAGE);
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

		ServicioInfoObligatoria srvInfoObl = new ComponenteInfoObligatoria();
		infor.setIoSerial(srvInfoObl.serialInfoOblMax());

		BigDecimal porcentajeAvance;

		Integer updateFicha = servFicha.nActualizacionFicha(gettCabecera(), ficha);

		if (updateFicha == -1) {
			updateFicha = 0;
		} else {
			updateFicha++;
		}

		TGrupo grupoTmp = servFicha.buscarGrupo("Kit voz y datos WF");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad00.getText()),
				Integer.parseInt(txtCantidad01.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_WF_0,
				Integer.parseInt(txtCantidad00.getText()), Integer.parseInt(txtCantidad01.getText()), txtObs0.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad10.getText()),
				Integer.parseInt(txtCantidad11.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_WF_1,
				Integer.parseInt(txtCantidad10.getText()), Integer.parseInt(txtCantidad11.getText()), txtObs1.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad20.getText()),
				Integer.parseInt(txtCantidad21.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_WF_2,
				Integer.parseInt(txtCantidad20.getText()), Integer.parseInt(txtCantidad21.getText()), txtObs2.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad30.getText()),
				Integer.parseInt(txtCantidad31.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_WF_3,
				Integer.parseInt(txtCantidad30.getText()), Integer.parseInt(txtCantidad31.getText()), txtObs3.getText(),
				updateFicha, porcentajeAvance));

		grupoTmp = servFicha.buscarGrupo("Kit de interconexion voz y datos");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad40.getText()),
				Integer.parseInt(txtCantidad41.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_WF_4,
				Integer.parseInt(txtCantidad40.getText()), Integer.parseInt(txtCantidad41.getText()), txtObs4.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad50.getText()),
				Integer.parseInt(txtCantidad51.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_WF_5,
				Integer.parseInt(txtCantidad50.getText()), Integer.parseInt(txtCantidad51.getText()), txtObs5.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad60.getText()),
				Integer.parseInt(txtCantidad61.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_WF_6,
				Integer.parseInt(txtCantidad60.getText()), Integer.parseInt(txtCantidad61.getText()), txtObs6.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad70.getText()),
				Integer.parseInt(txtCantidad71.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_WF_7,
				Integer.parseInt(txtCantidad70.getText()), Integer.parseInt(txtCantidad71.getText()), txtObs7.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad80.getText()),
				Integer.parseInt(txtCantidad81.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_WF_8,
				Integer.parseInt(txtCantidad80.getText()), Integer.parseInt(txtCantidad81.getText()), txtObs8.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad90.getText()),
				Integer.parseInt(txtCantidad91.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_WF_9,
				Integer.parseInt(txtCantidad90.getText()), Integer.parseInt(txtCantidad91.getText()), txtObs9.getText(),
				updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad100.getText()),
				Integer.parseInt(txtCantidad101.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_WF_10,
				Integer.parseInt(txtCantidad100.getText()), Integer.parseInt(txtCantidad101.getText()),
				txtObs10.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad110.getText()),
				Integer.parseInt(txtCantidad111.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_WF_11,
				Integer.parseInt(txtCantidad110.getText()), Integer.parseInt(txtCantidad111.getText()),
				txtObs11.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad120.getText()),
				Integer.parseInt(txtCantidad121.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_WF_12,
				Integer.parseInt(txtCantidad120.getText()), Integer.parseInt(txtCantidad121.getText()),
				txtObs12.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad130.getText()),
				Integer.parseInt(txtCantidad131.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_WF_13,
				Integer.parseInt(txtCantidad130.getText()), Integer.parseInt(txtCantidad131.getText()),
				txtObs13.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad140.getText()),
				Integer.parseInt(txtCantidad141.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_WF_14,
				Integer.parseInt(txtCantidad140.getText()), Integer.parseInt(txtCantidad141.getText()),
				txtObs14.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad150.getText()),
				Integer.parseInt(txtCantidad151.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_WF_15,
				Integer.parseInt(txtCantidad150.getText()), Integer.parseInt(txtCantidad151.getText()),
				txtObs15.getText(), updateFicha, porcentajeAvance));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad160.getText()),
				Integer.parseInt(txtCantidad161.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, LBL_WF_16,
				Integer.parseInt(txtCantidad160.getText()), Integer.parseInt(txtCantidad161.getText()),
				txtObs16.getText(), updateFicha, porcentajeAvance));

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
		}
	}
}
