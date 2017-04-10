package com.capa.presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import com.capa.datos.TAula;
import com.capa.datos.TFicha;
import com.capa.datos.TGrupo;
import com.capa.datos.TInformacionObligatoria;
import com.capa.datos.TdetalleFicha;
import com.capa.negocios.ComponenteFichaMA;
import com.capa.negocios.ServicioFichaMA;

import static com.capa.util.Utilitarios.*;
import static com.capa.util.Validaciones.*;

public class WFTemplate extends JFrame {

	private JPanel contentPane;
	private JTextField txtVDCantidad20;
	private JTextField txtVDCantidad10;
	private JTextField txtVDCantidad00;
	private JTextField txtVDCantidad01;
	private JTextField txtVDCantidad11;
	private JTextField txtVDCantidad21;
	private JTextField txtVDObs2;
	private JTextField txtVDObs1;
	private JTextField txtVDObs0;
	private JTextField txtVDCantidad30;
	private JTextField txtVDCantidad31;
	private JTextField txtVDObs3;
	private JTextField txtIVCantidad30;
	private JTextField txtIVCantidad20;
	private JTextField txtIVCantidad10;
	private JTextField txtIVCantidad00;
	private JTextField txtIVCantidad01;
	private JTextField txtIVCantidad11;
	private JTextField txtIVCantidad21;
	private JTextField txtIVCantidad31;
	private JTextField txtIVObs3;
	private JTextField txtIVObs2;
	private JTextField txtIVObs1;
	private JTextField txtIVObs0;
	private JTextField txtIVCantidad40;
	private JTextField txtIVCantidad41;
	private JTextField txtIVObs4;
	private JTextField txtIVCantidad50;
	private JTextField txtIVCantidad51;
	private JTextField txtIVObs5;
	private JTextField txtIVCantidad60;
	private JTextField txtIVCantidad61;
	private JTextField txtIVObs6;
	private JTextField txtIVCantidad70;
	private JTextField txtIVCantidad71;
	private JTextField txtIVObs7;
	private JTextField txtIVCantidad80;
	private JTextField txtIVCantidad81;
	private JTextField txtIVObs8;
	private JTextField txtIVCantidad90;
	private JTextField txtIVCantidad91;
	private JTextField txtIVObs9;
	private JTextField txtIVCantidad100;
	private JTextField txtIVCantidad101;
	private JTextField txtIVObs10;
	private JTextField txtIVCantidad110;
	private JTextField txtIVCantidad111;
	private JTextField txtIVObs11;
	private JTextField txtIVCantidad120;
	private JTextField txtIVCantidad121;
	private JTextField txtIVObs12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WFTemplate frame = new WFTemplate();
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
	public WFTemplate() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1320, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		setTitle("WF-1");

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

		txtVDCantidad20 = new JTextField();
		txtVDCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtVDCantidad20.setText("1");
		txtVDCantidad20.setEditable(false);
		txtVDCantidad20.setColumns(10);
		txtVDCantidad20.setBounds(314, 94, 35, 20);
		panel_1.add(txtVDCantidad20);

		txtVDCantidad10 = new JTextField();
		txtVDCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtVDCantidad10.setText("1");
		txtVDCantidad10.setEditable(false);
		txtVDCantidad10.setColumns(10);
		txtVDCantidad10.setBounds(314, 72, 35, 20);
		panel_1.add(txtVDCantidad10);

		txtVDCantidad00 = new JTextField();
		txtVDCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtVDCantidad00.setText("3");
		txtVDCantidad00.setEditable(false);
		txtVDCantidad00.setColumns(10);
		txtVDCantidad00.setBounds(314, 50, 35, 20);
		panel_1.add(txtVDCantidad00);

		JLabel label_4 = new JLabel("Cantidad");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Arial", Font.BOLD, 11));
		label_4.setBounds(317, 28, 63, 14);
		panel_1.add(label_4);

		txtVDCantidad01 = new JTextField();
		txtVDCantidad01.setColumns(10);
		txtVDCantidad01.setBounds(351, 50, 35, 20);
		panel_1.add(txtVDCantidad01);

		txtVDCantidad11 = new JTextField();
		txtVDCantidad11.setColumns(10);
		txtVDCantidad11.setBounds(351, 72, 35, 20);
		panel_1.add(txtVDCantidad11);

		txtVDCantidad21 = new JTextField();
		txtVDCantidad21.setColumns(10);
		txtVDCantidad21.setBounds(351, 94, 35, 20);
		panel_1.add(txtVDCantidad21);

		txtVDObs2 = new JTextField();
		txtVDObs2.setColumns(10);
		txtVDObs2.setBounds(396, 94, 167, 20);
		panel_1.add(txtVDObs2);

		txtVDObs1 = new JTextField();
		txtVDObs1.setColumns(10);
		txtVDObs1.setBounds(396, 72, 167, 20);
		panel_1.add(txtVDObs1);

		txtVDObs0 = new JTextField();
		txtVDObs0.setColumns(10);
		txtVDObs0.setBounds(396, 50, 167, 20);
		panel_1.add(txtVDObs0);

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

		txtVDCantidad30 = new JTextField();
		txtVDCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtVDCantidad30.setText("2");
		txtVDCantidad30.setEditable(false);
		txtVDCantidad30.setColumns(10);
		txtVDCantidad30.setBounds(314, 116, 35, 20);
		panel_1.add(txtVDCantidad30);

		txtVDCantidad31 = new JTextField();
		txtVDCantidad31.setColumns(10);
		txtVDCantidad31.setBounds(351, 116, 35, 20);
		panel_1.add(txtVDCantidad31);

		txtVDObs3 = new JTextField();
		txtVDObs3.setColumns(10);
		txtVDObs3.setBounds(396, 116, 167, 20);
		panel_1.add(txtVDObs3);

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

		txtIVCantidad30 = new JTextField();
		txtIVCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtIVCantidad30.setText("2");
		txtIVCantidad30.setEditable(false);
		txtIVCantidad30.setColumns(10);
		txtIVCantidad30.setBounds(314, 243, 35, 20);
		panel_1.add(txtIVCantidad30);

		txtIVCantidad20 = new JTextField();
		txtIVCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtIVCantidad20.setText("2");
		txtIVCantidad20.setEditable(false);
		txtIVCantidad20.setColumns(10);
		txtIVCantidad20.setBounds(314, 221, 35, 20);
		panel_1.add(txtIVCantidad20);

		txtIVCantidad10 = new JTextField();
		txtIVCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtIVCantidad10.setText("20");
		txtIVCantidad10.setEditable(false);
		txtIVCantidad10.setColumns(10);
		txtIVCantidad10.setBounds(314, 199, 35, 20);
		panel_1.add(txtIVCantidad10);

		txtIVCantidad00 = new JTextField();
		txtIVCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtIVCantidad00.setText("3");
		txtIVCantidad00.setEditable(false);
		txtIVCantidad00.setColumns(10);
		txtIVCantidad00.setBounds(314, 177, 35, 20);
		panel_1.add(txtIVCantidad00);

		JLabel label_7 = new JLabel("Cantidad");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Arial", Font.BOLD, 11));
		label_7.setBounds(317, 155, 63, 14);
		panel_1.add(label_7);

		txtIVCantidad01 = new JTextField();
		txtIVCantidad01.setColumns(10);
		txtIVCantidad01.setBounds(351, 177, 35, 20);
		panel_1.add(txtIVCantidad01);

		txtIVCantidad11 = new JTextField();
		txtIVCantidad11.setColumns(10);
		txtIVCantidad11.setBounds(351, 199, 35, 20);
		panel_1.add(txtIVCantidad11);

		txtIVCantidad21 = new JTextField();
		txtIVCantidad21.setColumns(10);
		txtIVCantidad21.setBounds(351, 221, 35, 20);
		panel_1.add(txtIVCantidad21);

		txtIVCantidad31 = new JTextField();
		txtIVCantidad31.setColumns(10);
		txtIVCantidad31.setBounds(351, 243, 35, 20);
		panel_1.add(txtIVCantidad31);

		txtIVObs3 = new JTextField();
		txtIVObs3.setColumns(10);
		txtIVObs3.setBounds(396, 243, 167, 20);
		panel_1.add(txtIVObs3);

		txtIVObs2 = new JTextField();
		txtIVObs2.setColumns(10);
		txtIVObs2.setBounds(396, 221, 167, 20);
		panel_1.add(txtIVObs2);

		txtIVObs1 = new JTextField();
		txtIVObs1.setColumns(10);
		txtIVObs1.setBounds(396, 199, 167, 20);
		panel_1.add(txtIVObs1);

		txtIVObs0 = new JTextField();
		txtIVObs0.setColumns(10);
		txtIVObs0.setBounds(396, 177, 167, 20);
		panel_1.add(txtIVObs0);

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

		txtIVCantidad40 = new JTextField();
		txtIVCantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtIVCantidad40.setText("6");
		txtIVCantidad40.setEditable(false);
		txtIVCantidad40.setColumns(10);
		txtIVCantidad40.setBounds(314, 265, 35, 20);
		panel_1.add(txtIVCantidad40);

		txtIVCantidad41 = new JTextField();
		txtIVCantidad41.setColumns(10);
		txtIVCantidad41.setBounds(351, 265, 35, 20);
		panel_1.add(txtIVCantidad41);

		txtIVObs4 = new JTextField();
		txtIVObs4.setColumns(10);
		txtIVObs4.setBounds(396, 265, 167, 20);
		panel_1.add(txtIVObs4);

		JLabel lblPatchcordftCat_1 = new JLabel("Patchcord 3ft cat6");
		lblPatchcordftCat_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPatchcordftCat_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPatchcordftCat_1.setBounds(101, 290, 203, 14);
		panel_1.add(lblPatchcordftCat_1);

		txtIVCantidad50 = new JTextField();
		txtIVCantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtIVCantidad50.setText("4");
		txtIVCantidad50.setEditable(false);
		txtIVCantidad50.setColumns(10);
		txtIVCantidad50.setBounds(314, 287, 35, 20);
		panel_1.add(txtIVCantidad50);

		txtIVCantidad51 = new JTextField();
		txtIVCantidad51.setColumns(10);
		txtIVCantidad51.setBounds(351, 287, 35, 20);
		panel_1.add(txtIVCantidad51);

		txtIVObs5 = new JTextField();
		txtIVObs5.setColumns(10);
		txtIVObs5.setBounds(396, 287, 167, 20);
		panel_1.add(txtIVObs5);

		JLabel lblRackCerradoTipo = new JLabel("Rack cerrado tipo gabinete de 12 UR");
		lblRackCerradoTipo.setHorizontalAlignment(SwingConstants.LEFT);
		lblRackCerradoTipo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblRackCerradoTipo.setBounds(101, 312, 203, 14);
		panel_1.add(lblRackCerradoTipo);

		txtIVCantidad60 = new JTextField();
		txtIVCantidad60.setHorizontalAlignment(SwingConstants.CENTER);
		txtIVCantidad60.setText("1");
		txtIVCantidad60.setEditable(false);
		txtIVCantidad60.setColumns(10);
		txtIVCantidad60.setBounds(314, 309, 35, 20);
		panel_1.add(txtIVCantidad60);

		txtIVCantidad61 = new JTextField();
		txtIVCantidad61.setColumns(10);
		txtIVCantidad61.setBounds(351, 309, 35, 20);
		panel_1.add(txtIVCantidad61);

		txtIVObs6 = new JTextField();
		txtIVObs6.setColumns(10);
		txtIVObs6.setBounds(396, 309, 167, 20);
		panel_1.add(txtIVObs6);

		txtIVCantidad70 = new JTextField();
		txtIVCantidad70.setHorizontalAlignment(SwingConstants.CENTER);
		txtIVCantidad70.setText("1");
		txtIVCantidad70.setEditable(false);
		txtIVCantidad70.setColumns(10);
		txtIVCantidad70.setBounds(314, 340, 35, 20);
		panel_1.add(txtIVCantidad70);

		txtIVCantidad71 = new JTextField();
		txtIVCantidad71.setColumns(10);
		txtIVCantidad71.setBounds(351, 340, 35, 20);
		panel_1.add(txtIVCantidad71);

		txtIVObs7 = new JTextField();
		txtIVObs7.setColumns(10);
		txtIVObs7.setBounds(396, 340, 167, 20);
		panel_1.add(txtIVObs7);

		JLabel lblConversorDeMedia = new JLabel("Conversor de media de fibra \u00F3ptica a UTP");
		lblConversorDeMedia.setHorizontalAlignment(SwingConstants.LEFT);
		lblConversorDeMedia.setFont(new Font("Arial", Font.PLAIN, 11));
		lblConversorDeMedia.setBounds(101, 380, 203, 14);
		panel_1.add(lblConversorDeMedia);

		txtIVCantidad80 = new JTextField();
		txtIVCantidad80.setHorizontalAlignment(SwingConstants.CENTER);
		txtIVCantidad80.setText("2");
		txtIVCantidad80.setEditable(false);
		txtIVCantidad80.setColumns(10);
		txtIVCantidad80.setBounds(314, 377, 35, 20);
		panel_1.add(txtIVCantidad80);

		txtIVCantidad81 = new JTextField();
		txtIVCantidad81.setColumns(10);
		txtIVCantidad81.setBounds(351, 377, 35, 20);
		panel_1.add(txtIVCantidad81);

		txtIVObs8 = new JTextField();
		txtIVObs8.setColumns(10);
		txtIVObs8.setBounds(396, 377, 167, 20);
		panel_1.add(txtIVObs8);

		JLabel lblCajaDeConexin = new JLabel("Caja de conexi\u00F3n 60x60x70 cm");
		lblCajaDeConexin.setHorizontalAlignment(SwingConstants.LEFT);
		lblCajaDeConexin.setFont(new Font("Arial", Font.PLAIN, 11));
		lblCajaDeConexin.setBounds(101, 402, 203, 14);
		panel_1.add(lblCajaDeConexin);

		txtIVCantidad90 = new JTextField();
		txtIVCantidad90.setHorizontalAlignment(SwingConstants.CENTER);
		txtIVCantidad90.setText("3");
		txtIVCantidad90.setEditable(false);
		txtIVCantidad90.setColumns(10);
		txtIVCantidad90.setBounds(314, 399, 35, 20);
		panel_1.add(txtIVCantidad90);

		txtIVCantidad91 = new JTextField();
		txtIVCantidad91.setColumns(10);
		txtIVCantidad91.setBounds(351, 399, 35, 20);
		panel_1.add(txtIVCantidad91);

		txtIVObs9 = new JTextField();
		txtIVObs9.setColumns(10);
		txtIVObs9.setBounds(396, 399, 167, 20);
		panel_1.add(txtIVObs9);

		JLabel lblTuberaPvc_1 = new JLabel("Tuber\u00EDa PVC 2\u201D l=6 mt");
		lblTuberaPvc_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberaPvc_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberaPvc_1.setBounds(101, 424, 203, 14);
		panel_1.add(lblTuberaPvc_1);

		txtIVCantidad100 = new JTextField();
		txtIVCantidad100.setHorizontalAlignment(SwingConstants.CENTER);
		txtIVCantidad100.setText("10");
		txtIVCantidad100.setEditable(false);
		txtIVCantidad100.setColumns(10);
		txtIVCantidad100.setBounds(314, 421, 35, 20);
		panel_1.add(txtIVCantidad100);

		txtIVCantidad101 = new JTextField();
		txtIVCantidad101.setColumns(10);
		txtIVCantidad101.setBounds(351, 421, 35, 20);
		panel_1.add(txtIVCantidad101);

		txtIVObs10 = new JTextField();
		txtIVObs10.setColumns(10);
		txtIVObs10.setBounds(396, 421, 167, 20);
		panel_1.add(txtIVObs10);

		JLabel lblmangueraNegraTipo = new JLabel(
				"<html><body>Manguera negra tipo el\u00E9ctrica de 2\u201D l=6mt<br>y 2 cajas de paso</body></html>");
		lblmangueraNegraTipo.setHorizontalAlignment(SwingConstants.LEFT);
		lblmangueraNegraTipo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblmangueraNegraTipo.setBounds(101, 445, 203, 39);
		panel_1.add(lblmangueraNegraTipo);

		txtIVCantidad110 = new JTextField();
		txtIVCantidad110.setHorizontalAlignment(SwingConstants.CENTER);
		txtIVCantidad110.setText("1");
		txtIVCantidad110.setEditable(false);
		txtIVCantidad110.setColumns(10);
		txtIVCantidad110.setBounds(314, 453, 35, 20);
		panel_1.add(txtIVCantidad110);

		txtIVCantidad111 = new JTextField();
		txtIVCantidad111.setColumns(10);
		txtIVCantidad111.setBounds(351, 453, 35, 20);
		panel_1.add(txtIVCantidad111);

		txtIVObs11 = new JTextField();
		txtIVObs11.setColumns(10);
		txtIVObs11.setBounds(396, 453, 167, 20);
		panel_1.add(txtIVObs11);

		JLabel lblTableroxx = new JLabel("Tablero 20x20x10");
		lblTableroxx.setHorizontalAlignment(SwingConstants.LEFT);
		lblTableroxx.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTableroxx.setBounds(101, 487, 203, 14);
		panel_1.add(lblTableroxx);

		txtIVCantidad120 = new JTextField();
		txtIVCantidad120.setHorizontalAlignment(SwingConstants.CENTER);
		txtIVCantidad120.setText("1");
		txtIVCantidad120.setEditable(false);
		txtIVCantidad120.setColumns(10);
		txtIVCantidad120.setBounds(314, 484, 35, 20);
		panel_1.add(txtIVCantidad120);

		txtIVCantidad121 = new JTextField();
		txtIVCantidad121.setColumns(10);
		txtIVCantidad121.setBounds(351, 484, 35, 20);
		panel_1.add(txtIVCantidad121);

		txtIVObs12 = new JTextField();
		txtIVObs12.setColumns(10);
		txtIVObs12.setBounds(396, 484, 167, 20);
		panel_1.add(txtIVObs12);

		JLabel lblpatchPanel = new JLabel("<html><body>Patch panel 12 puertos CAT 6 (incluye<br>jacks)</body></html>");
		lblpatchPanel.setHorizontalAlignment(SwingConstants.LEFT);
		lblpatchPanel.setFont(new Font("Arial", Font.PLAIN, 11));
		lblpatchPanel.setBounds(101, 334, 203, 39);
		panel_1.add(lblpatchPanel);

		InformacionObligatoriaV informacionObligatoriaV = new InformacionObligatoriaV(865, 325);
		panel_1.add(informacionObligatoriaV.getPnlInformacionObl());

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				new Menu().setVisible(true);
				dispose();
			}
		});
	}

	public LinkedList<LinkedList<TdetalleFicha>> cargarListas(InformacionObligatoriaV inforV) {
		LinkedList<TdetalleFicha> listaDatos = new LinkedList<>();
		LinkedList<TdetalleFicha> listaInterconexion = new LinkedList<>();
		ServicioFichaMA servFicha = new ComponenteFichaMA();
		TInformacionObligatoria infor = cargarInfoObligatoria(inforV);

		TAula aula = servFicha.buscarAula("WF");
		TGrupo grupoTmp = servFicha.buscarGrupo("Kit voz y datos WF");
		Integer updateFicha = servFicha.buscarUpdateFicha();
		TFicha ficha = null;
		listaDatos.add(new TdetalleFicha(gettCabecera(), infor, aula, grupoTmp, ficha,
				Integer.parseInt(txtVDCantidad01.getText()), txtVDObs0.getText(), updateFicha));
		listaDatos.add(new TdetalleFicha(gettCabecera(), infor, aula, grupoTmp, ficha,
				Integer.parseInt(txtVDCantidad11.getText()), txtVDObs1.getText(), updateFicha));
		listaDatos.add(new TdetalleFicha(gettCabecera(), infor, aula, grupoTmp, ficha,
				Integer.parseInt(txtVDCantidad21.getText()), txtVDObs2.getText(), updateFicha));
		listaDatos.add(new TdetalleFicha(gettCabecera(), infor, aula, grupoTmp, ficha,
				Integer.parseInt(txtVDCantidad31.getText()), txtVDObs3.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("Kit de interconexion voz y datos");
		listaInterconexion.add(new TdetalleFicha(gettCabecera(), infor, aula, grupoTmp, ficha,
				Integer.parseInt(txtIVCantidad01.getText()), txtIVObs0.getText(), updateFicha));
		listaInterconexion.add(new TdetalleFicha(gettCabecera(), infor, aula, grupoTmp, ficha,
				Integer.parseInt(txtIVCantidad11.getText()), txtIVObs1.getText(), updateFicha));
		listaInterconexion.add(new TdetalleFicha(gettCabecera(), infor, aula, grupoTmp, ficha,
				Integer.parseInt(txtIVCantidad21.getText()), txtIVObs2.getText(), updateFicha));
		listaInterconexion.add(new TdetalleFicha(gettCabecera(), infor, aula, grupoTmp, ficha,
				Integer.parseInt(txtIVCantidad31.getText()), txtIVObs3.getText(), updateFicha));
		listaInterconexion.add(new TdetalleFicha(gettCabecera(), infor, aula, grupoTmp, ficha,
				Integer.parseInt(txtIVCantidad41.getText()), txtIVObs4.getText(), updateFicha));
		listaInterconexion.add(new TdetalleFicha(gettCabecera(), infor, aula, grupoTmp, ficha,
				Integer.parseInt(txtIVCantidad51.getText()), txtIVObs5.getText(), updateFicha));
		listaInterconexion.add(new TdetalleFicha(gettCabecera(), infor, aula, grupoTmp, ficha,
				Integer.parseInt(txtIVCantidad61.getText()), txtIVObs6.getText(), updateFicha));
		listaInterconexion.add(new TdetalleFicha(gettCabecera(), infor, aula, grupoTmp, ficha,
				Integer.parseInt(txtIVCantidad71.getText()), txtIVObs7.getText(), updateFicha));
		listaInterconexion.add(new TdetalleFicha(gettCabecera(), infor, aula, grupoTmp, ficha,
				Integer.parseInt(txtIVCantidad81.getText()), txtIVObs8.getText(), updateFicha));
		listaInterconexion.add(new TdetalleFicha(gettCabecera(), infor, aula, grupoTmp, ficha,
				Integer.parseInt(txtIVCantidad91.getText()), txtIVObs9.getText(), updateFicha));
		listaInterconexion.add(new TdetalleFicha(gettCabecera(), infor, aula, grupoTmp, ficha,
				Integer.parseInt(txtIVCantidad101.getText()), txtIVObs10.getText(), updateFicha));
		listaInterconexion.add(new TdetalleFicha(gettCabecera(), infor, aula, grupoTmp, ficha,
				Integer.parseInt(txtIVCantidad111.getText()), txtIVObs11.getText(), updateFicha));
		listaInterconexion.add(new TdetalleFicha(gettCabecera(), infor, aula, grupoTmp, ficha,
				Integer.parseInt(txtIVCantidad121.getText()), txtIVObs12.getText(), updateFicha));

		LinkedList<LinkedList<TdetalleFicha>> listaFormulario = new LinkedList<LinkedList<TdetalleFicha>>();
		listaFormulario.add(listaDatos);
		listaFormulario.add(listaInterconexion);
		return listaFormulario;
	}
}
