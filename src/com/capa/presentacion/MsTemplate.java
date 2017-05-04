package com.capa.presentacion;

import static com.capa.negocios.Calculos.calcularPorcentajeAvance;
import static com.capa.util.Utilitarios.*;
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

public class MsTemplate extends JFrame {

	private static final long serialVersionUID = 596544013936639490L;
	private JPanel contentPane;
	private JTextField txtCantidad40;
	private JTextField txtCantidad41;
	private JTextField txtCantidad31;
	private JTextField txtCantidad30;
	private JTextField txtCantidad20;
	private JTextField txtCantidad21;
	private JTextField txtCantidad11;
	private JTextField txtCantidad10;
	private JTextField txtCantidad00;
	private JTextField txtCantidad01;
	private JTextField txtObs1;
	private JTextField txtObs2;
	private JTextField txtObs3;
	private JTextField txtObs4;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_4;
	private JTextField txtCantidad50;
	private JTextField txtCantidad51;
	private JTextField txtObs5;
	private JLabel label_5;
	private JLabel label_8;
	private JTextField txtCantidad60;
	private JTextField txtCantidad61;
	private JTextField txtObs6;
	private JLabel label_9;
	private JTextField txtCantidad70;
	private JTextField txtCantidad71;
	private JTextField txtObs7;
	private JLabel lblTuberaDePvc;
	private JTextField txtCantidad80;
	private JTextField txtCantidad81;
	private JTextField txtObs8;
	private JLabel label_11;
	private JTextField txtCantidad90;
	private JTextField txtCantidad91;
	private JTextField txtObs9;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_10;
	private JLabel label_12;
	private JLabel lblventanaCorrederaCompuesta;
	private JLabel lblPerfilSfTipo;
	private JTextField txtCantidad140;
	private JTextField txtCantidad130;
	private JTextField txtCantidad120;
	private JTextField txtCantidad110;
	private JTextField txtCantidad100;
	private JLabel label_15;
	private JTextField txtCantidad101;
	private JTextField txtCantidad111;
	private JTextField txtCantidad121;
	private JTextField txtCantidad131;
	private JTextField txtCantidad141;
	private JTextField txtObs14;
	private JTextField txtObs13;
	private JTextField txtObs12;
	private JTextField txtObs11;
	private JTextField txtObs0;
	private JTextField txtObs10;
	private JLabel label_16;
	private JLabel label_13;
	private JLabel lblPerfilSfTipo_1;
	private JLabel lblPanelesTcbx;
	private JLabel lblPanelesVynilPiso;
	private JTextField txtCantidad170;
	private JTextField txtCantidad160;
	private JTextField txtCantidad150;
	private JLabel label_19;
	private JTextField txtCantidad151;
	private JTextField txtCantidad161;
	private JTextField txtCantidad171;
	private JTextField txtObs17;
	private JTextField txtObs16;
	private JTextField txtObs15;
	private JLabel label_20;
	private JLabel lblPanelesEpsPara;
	private JTextField txtCantidad180;
	private JTextField txtCantidad181;
	private JTextField txtObs18;
	private JLabel label_14;
	private JLabel label_17;
	private JLabel label_18;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel label_23;
	private JLabel label_24;
	private JLabel label_25;
	private JLabel label_26;
	private JLabel label_27;
	private JLabel label_28;
	private JTextField txtCantidad260;
	private JTextField txtCantidad261;
	private JTextField txtObs26;
	private JLabel label_29;
	private JLabel label_30;
	private JTextField txtCantidad250;
	private JTextField txtCantidad251;
	private JTextField txtCantidad241;
	private JTextField txtCantidad230;
	private JTextField txtCantidad231;
	private JLabel label_31;
	private JLabel label_32;
	private JTextField txtObs23;
	private JTextField txtObs24;
	private JTextField txtObs25;
	private JLabel label_33;
	private JTextField txtCantidad190;
	private JTextField txtCantidad191;
	private JTextField txtCantidad201;
	private JTextField txtCantidad200;
	private JTextField txtCantidad210;
	private JTextField txtCantidad211;
	private JTextField txtCantidad221;
	private JTextField txtCantidad220;
	private JTextField txtObs22;
	private JTextField txtObs21;
	private JTextField txtObs20;
	private JTextField txtObs19;
	private JLabel label_34;
	private JLabel label_35;
	private JLabel label_36;
	private JLabel label_37;
	private JLabel label_38;
	private JLabel label_39;
	private JLabel label_40;
	private JLabel label_41;
	private JLabel label_42;
	private JLabel label_43;
	private JLabel label_44;
	private JLabel label_45;
	private JLabel label_46;
	private JLabel label_47;
	private JLabel label_48;
	private JTextField txtCantidad270;
	private JTextField txtCantidad271;
	private JTextField txtObs27;
	private JLabel label_49;
	private JTextField txtObs28;
	private JTextField txtCantidad281;
	private JTextField txtCantidad280;
	private JTextField txtCantidad290;
	private JTextField txtCantidad291;
	private JTextField txtObs29;
	private JTextField txtObs30;
	private JTextField txtCantidad301;
	private JTextField txtCantidad300;
	private JTextField txtCantidad310;
	private JTextField txtCantidad311;
	private JTextField txtObs31;
	private JTextField txtObs32;
	private JTextField txtCantidad321;
	private JTextField txtCantidad320;
	private JTextField txtCantidad330;
	private JTextField txtCantidad331;
	private JTextField txtObs33;
	private JTextField txtObs34;
	private JTextField txtCantidad341;
	private JTextField txtCantidad340;
	private JTextField txtCantidad350;
	private JTextField txtCantidad351;
	private JTextField txtObs35;
	private JTextField txtObs36;
	private JTextField txtCantidad361;
	private JTextField txtCantidad360;
	private JTextField txtCantidad370;
	private JTextField txtCantidad371;
	private JTextField txtObs37;
	private JTextField txtObs38;
	private JTextField txtCantidad381;
	private JTextField txtCantidad380;
	private JLabel lblCercha;
	private JTextField txtCantidad400;
	private JTextField txtCantidad401;
	private JTextField txtObs40;
	private JTextField txtCantidad240;
	private JTextField txtCantidad390;
	private JTextField txtCantidad391;
	private JTextField txtObs39;

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
	// MsTemplate frame = new MsTemplate("");
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
	public MsTemplate(TFicha ficha) {
		this.ficha = ficha;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1378, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.setTitle(Utilitarios.getNombreFicha() + ficha.getFiNombre());

		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());
		contentPane.setLayout(null);

		llenarCabecera(cabecera);

		this.setResizable(false);
		this.setLocationRelativeTo(null);
		servFicha = new ComponenteFicha();

		JPanel panel1 = new JPanel();
		panel1.setBorder(
				new TitledBorder(null, ficha.getFiDescripcion(), TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel1.setBounds(10, 127, 1344, 650);
		contentPane.add(panel1);
		panel1.setLayout(null);

		JPinformacionObligatoria informacionObligatoriaV = new JPinformacionObligatoria(885, 370);
		informacionObligatoriaV.getBtnInsertarFoto().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				fotoInfoObl = getPathImagen();
			}
		});
		panel1.add(informacionObligatoriaV.getPnlInformacionObl());

		JLabel lblKitElctrico = new JLabel("KIT EL\u00C9CTRICO");
		lblKitElctrico.setHorizontalAlignment(SwingConstants.CENTER);
		lblKitElctrico.setFont(new Font("Arial", Font.BOLD, 11));
		lblKitElctrico.setBounds(10, 31, 203, 14);
		panel1.add(lblKitElctrico);

		JLabel lblLuminariasLed = new JLabel("Luminarias LED 60 w - 5000 lum");
		lblLuminariasLed.setHorizontalAlignment(SwingConstants.LEFT);
		lblLuminariasLed.setFont(new Font("Arial", Font.PLAIN, 11));
		lblLuminariasLed.setBounds(10, 56, 203, 14);
		panel1.add(lblLuminariasLed);

		JLabel lblTomacorrientes = new JLabel("Tomacorrientes");
		lblTomacorrientes.setHorizontalAlignment(SwingConstants.LEFT);
		lblTomacorrientes.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTomacorrientes.setBounds(10, 78, 203, 14);
		panel1.add(lblTomacorrientes);

		JLabel lblInterruptor = new JLabel("Interruptor");
		lblInterruptor.setHorizontalAlignment(SwingConstants.LEFT);
		lblInterruptor.setFont(new Font("Arial", Font.PLAIN, 11));
		lblInterruptor.setBounds(10, 100, 203, 14);
		panel1.add(lblInterruptor);

		JLabel lblKitCableElctrico = new JLabel("Kit cable el\u00E9ctrico MA");
		lblKitCableElctrico.setHorizontalAlignment(SwingConstants.LEFT);
		lblKitCableElctrico.setFont(new Font("Arial", Font.PLAIN, 11));
		lblKitCableElctrico.setBounds(10, 122, 203, 14);
		panel1.add(lblKitCableElctrico);

		JLabel lblDetectorDeHumo = new JLabel("Detector de humo");
		lblDetectorDeHumo.setHorizontalAlignment(SwingConstants.LEFT);
		lblDetectorDeHumo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDetectorDeHumo.setBounds(10, 144, 203, 14);
		panel1.add(lblDetectorDeHumo);

		txtCantidad40 = new JTextField();
		txtCantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad40.setText("2");
		txtCantidad40.setEditable(false);
		txtCantidad40.setColumns(10);
		txtCantidad40.setBounds(223, 141, 35, 20);
		panel1.add(txtCantidad40);

		txtCantidad41 = new JTextField();
		txtCantidad41.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad41.setColumns(10);
		txtCantidad41.setBounds(260, 141, 35, 20);
		panel1.add(txtCantidad41);

		txtCantidad31 = new JTextField();
		txtCantidad31.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad31.setColumns(10);
		txtCantidad31.setBounds(260, 119, 35, 20);
		panel1.add(txtCantidad31);

		txtCantidad30 = new JTextField();
		txtCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad30.setText("2");
		txtCantidad30.setEditable(false);
		txtCantidad30.setColumns(10);
		txtCantidad30.setBounds(223, 119, 35, 20);
		panel1.add(txtCantidad30);

		txtCantidad20 = new JTextField();
		txtCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad20.setText("2");
		txtCantidad20.setEditable(false);
		txtCantidad20.setColumns(10);
		txtCantidad20.setBounds(223, 97, 35, 20);
		panel1.add(txtCantidad20);

		txtCantidad21 = new JTextField();
		txtCantidad21.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad21.setColumns(10);
		txtCantidad21.setBounds(260, 97, 35, 20);
		panel1.add(txtCantidad21);

		txtCantidad11 = new JTextField();
		txtCantidad11.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad11.setColumns(10);
		txtCantidad11.setBounds(260, 75, 35, 20);
		panel1.add(txtCantidad11);

		txtCantidad10 = new JTextField();
		txtCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad10.setText("16");
		txtCantidad10.setEditable(false);
		txtCantidad10.setColumns(10);
		txtCantidad10.setBounds(223, 75, 35, 20);
		panel1.add(txtCantidad10);

		txtCantidad00 = new JTextField();
		txtCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad00.setText("18");
		txtCantidad00.setEditable(false);
		txtCantidad00.setColumns(10);
		txtCantidad00.setBounds(223, 53, 35, 20);
		panel1.add(txtCantidad00);

		txtCantidad01 = new JTextField();
		txtCantidad01.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad01.setColumns(10);
		txtCantidad01.setBounds(260, 53, 35, 20);
		panel1.add(txtCantidad01);

		JLabel label_6 = new JLabel("Cantidad");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Arial", Font.BOLD, 11));
		label_6.setBounds(226, 31, 63, 14);
		panel1.add(label_6);

		JLabel label_7 = new JLabel("Observaci\u00F3n/Referencia");
		label_7.setHorizontalAlignment(SwingConstants.LEFT);
		label_7.setFont(new Font("Arial", Font.BOLD, 11));
		label_7.setBounds(299, 31, 139, 14);
		panel1.add(label_7);

		txtObs0 = new JTextField();
		txtObs0.setColumns(10);
		txtObs0.setBounds(305, 53, 129, 20);
		panel1.add(txtObs0);

		txtObs1 = new JTextField();
		txtObs1.setColumns(10);
		txtObs1.setBounds(305, 75, 129, 20);
		panel1.add(txtObs1);

		txtObs2 = new JTextField();
		txtObs2.setColumns(10);
		txtObs2.setBounds(305, 97, 129, 20);
		panel1.add(txtObs2);

		txtObs3 = new JTextField();
		txtObs3.setColumns(10);
		txtObs3.setBounds(305, 119, 129, 20);
		panel1.add(txtObs3);

		txtObs4 = new JTextField();
		txtObs4.setColumns(10);
		txtObs4.setBounds(305, 141, 129, 20);
		panel1.add(txtObs4);

		label = new JLabel("KIT AGUA LLUVIA");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 11));
		label.setBounds(39, 182, 139, 14);
		panel1.add(label);

		label_1 = new JLabel("Canal pl\u00E1stico PVC de L=3m");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("Arial", Font.PLAIN, 11));
		label_1.setBounds(10, 207, 183, 14);
		panel1.add(label_1);

		label_4 = new JLabel("Cantidad");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Arial", Font.BOLD, 11));
		label_4.setBounds(226, 182, 63, 14);
		panel1.add(label_4);

		txtCantidad50 = new JTextField();
		txtCantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad50.setText("6");
		txtCantidad50.setEditable(false);
		txtCantidad50.setColumns(10);
		txtCantidad50.setBounds(223, 204, 35, 20);
		panel1.add(txtCantidad50);

		txtCantidad51 = new JTextField();
		txtCantidad51.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad51.setColumns(10);
		txtCantidad51.setBounds(260, 204, 35, 20);
		panel1.add(txtCantidad51);

		txtObs5 = new JTextField();
		txtObs5.setColumns(10);
		txtObs5.setBounds(305, 204, 129, 20);
		panel1.add(txtObs5);

		label_5 = new JLabel("Observaci\u00F3n/Referencia");
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setFont(new Font("Arial", Font.BOLD, 11));
		label_5.setBounds(299, 182, 139, 14);
		panel1.add(label_5);

		label_8 = new JLabel(
				"<html><body>Kit de Accesorios de Conexi\u00F3n Agua de<br>Lluvia (2 rejilla, 4 codos 90\u00B0,1/4 gl<br>polipega, tornillos, abrazaderas</body></html>)");
		label_8.setHorizontalAlignment(SwingConstants.LEFT);
		label_8.setFont(new Font("Arial", Font.PLAIN, 11));
		label_8.setBounds(10, 226, 203, 56);
		panel1.add(label_8);

		txtCantidad60 = new JTextField();
		txtCantidad60.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad60.setText("4");
		txtCantidad60.setEditable(false);
		txtCantidad60.setColumns(10);
		txtCantidad60.setBounds(223, 247, 35, 20);
		panel1.add(txtCantidad60);

		txtCantidad61 = new JTextField();
		txtCantidad61.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad61.setColumns(10);
		txtCantidad61.setBounds(260, 247, 35, 20);
		panel1.add(txtCantidad61);

		txtObs6 = new JTextField();
		txtObs6.setColumns(10);
		txtObs6.setBounds(305, 247, 129, 20);
		panel1.add(txtObs6);

		label_9 = new JLabel("Tuber\u00EDa de PVC 75 mm L=3m");
		label_9.setHorizontalAlignment(SwingConstants.LEFT);
		label_9.setFont(new Font("Arial", Font.PLAIN, 11));
		label_9.setBounds(10, 284, 183, 14);
		panel1.add(label_9);

		txtCantidad70 = new JTextField();
		txtCantidad70.setText("3");
		txtCantidad70.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad70.setEditable(false);
		txtCantidad70.setColumns(10);
		txtCantidad70.setBounds(223, 278, 35, 20);
		panel1.add(txtCantidad70);

		txtCantidad71 = new JTextField();
		txtCantidad71.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad71.setColumns(10);
		txtCantidad71.setBounds(260, 278, 35, 20);
		panel1.add(txtCantidad71);

		txtObs7 = new JTextField();
		txtObs7.setColumns(10);
		txtObs7.setBounds(305, 278, 129, 20);
		panel1.add(txtObs7);

		lblTuberaDePvc = new JLabel("Tuber\u00EDa de PVC 75 mm L=0.6m");
		lblTuberaDePvc.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberaDePvc.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberaDePvc.setBounds(10, 306, 183, 14);
		panel1.add(lblTuberaDePvc);

		txtCantidad80 = new JTextField();
		txtCantidad80.setText("3");
		txtCantidad80.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad80.setEditable(false);
		txtCantidad80.setColumns(10);
		txtCantidad80.setBounds(223, 300, 35, 20);
		panel1.add(txtCantidad80);

		txtCantidad81 = new JTextField();
		txtCantidad81.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad81.setColumns(10);
		txtCantidad81.setBounds(260, 300, 35, 20);
		panel1.add(txtCantidad81);

		txtObs8 = new JTextField();
		txtObs8.setColumns(10);
		txtObs8.setBounds(305, 300, 129, 20);
		panel1.add(txtObs8);

		label_11 = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 75 mm. (lija<br>pliego, polipega 1/4gal,1 codo 90\u00B0)</body></html>");
		label_11.setHorizontalAlignment(SwingConstants.LEFT);
		label_11.setFont(new Font("Arial", Font.PLAIN, 11));
		label_11.setBounds(10, 328, 203, 39);
		panel1.add(label_11);

		txtCantidad90 = new JTextField();
		txtCantidad90.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad90.setText("1");
		txtCantidad90.setEditable(false);
		txtCantidad90.setColumns(10);
		txtCantidad90.setBounds(223, 336, 35, 20);
		panel1.add(txtCantidad90);

		txtCantidad91 = new JTextField();
		txtCantidad91.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad91.setColumns(10);
		txtCantidad91.setBounds(260, 336, 35, 20);
		panel1.add(txtCantidad91);

		txtObs9 = new JTextField();
		txtObs9.setColumns(10);
		txtObs9.setBounds(305, 336, 129, 20);
		panel1.add(txtObs9);

		label_2 = new JLabel("COMPONENTE ARQUITECT\u00D3NICO");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Arial", Font.BOLD, 11));
		label_2.setBounds(10, 378, 193, 14);
		panel1.add(label_2);

		label_3 = new JLabel("Puerta");
		label_3.setVerticalAlignment(SwingConstants.TOP);
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("Arial", Font.PLAIN, 11));
		label_3.setBounds(10, 403, 183, 14);
		panel1.add(label_3);

		label_10 = new JLabel("Bisagras");
		label_10.setVerticalAlignment(SwingConstants.TOP);
		label_10.setHorizontalAlignment(SwingConstants.LEFT);
		label_10.setFont(new Font("Arial", Font.PLAIN, 11));
		label_10.setBounds(10, 425, 183, 14);
		panel1.add(label_10);

		label_12 = new JLabel("Perfil SF Tipo 12 MA-SF-12 para puerta");
		label_12.setVerticalAlignment(SwingConstants.TOP);
		label_12.setHorizontalAlignment(SwingConstants.LEFT);
		label_12.setFont(new Font("Arial", Font.PLAIN, 11));
		label_12.setBounds(10, 447, 203, 14);
		panel1.add(label_12);

		lblventanaCorrederaCompuesta = new JLabel(
				"<html><body>Ventana corredera, compuesta por tres<br>hojas y dos carriles. UPVC con vidrio<br>flotado de 3 mm de 3x1,10</body></html>");
		lblventanaCorrederaCompuesta.setVerticalAlignment(SwingConstants.TOP);
		lblventanaCorrederaCompuesta.setHorizontalAlignment(SwingConstants.LEFT);
		lblventanaCorrederaCompuesta.setFont(new Font("Arial", Font.PLAIN, 11));
		lblventanaCorrederaCompuesta.setBounds(10, 469, 203, 50);
		panel1.add(lblventanaCorrederaCompuesta);

		lblPerfilSfTipo = new JLabel("Perfil SF Tipo 12 MA-SF-12 para ventana");
		lblPerfilSfTipo.setVerticalAlignment(SwingConstants.TOP);
		lblPerfilSfTipo.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo.setBounds(10, 522, 203, 14);
		panel1.add(lblPerfilSfTipo);

		txtCantidad140 = new JTextField();
		txtCantidad140.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad140.setText("24");
		txtCantidad140.setEditable(false);
		txtCantidad140.setColumns(10);
		txtCantidad140.setBounds(223, 519, 35, 20);
		panel1.add(txtCantidad140);

		txtCantidad130 = new JTextField();
		txtCantidad130.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad130.setText("6");
		txtCantidad130.setEditable(false);
		txtCantidad130.setColumns(10);
		txtCantidad130.setBounds(223, 480, 35, 20);
		panel1.add(txtCantidad130);

		txtCantidad120 = new JTextField();
		txtCantidad120.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad120.setText("6");
		txtCantidad120.setEditable(false);
		txtCantidad120.setColumns(10);
		txtCantidad120.setBounds(223, 444, 35, 20);
		panel1.add(txtCantidad120);

		txtCantidad110 = new JTextField();
		txtCantidad110.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad110.setText("6");
		txtCantidad110.setEditable(false);
		txtCantidad110.setColumns(10);
		txtCantidad110.setBounds(223, 422, 35, 20);
		panel1.add(txtCantidad110);

		txtCantidad100 = new JTextField();
		txtCantidad100.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad100.setText("2");
		txtCantidad100.setEditable(false);
		txtCantidad100.setColumns(10);
		txtCantidad100.setBounds(223, 400, 35, 20);
		panel1.add(txtCantidad100);

		label_15 = new JLabel("Cantidad");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("Arial", Font.BOLD, 11));
		label_15.setBounds(226, 378, 63, 14);
		panel1.add(label_15);

		txtCantidad101 = new JTextField();
		txtCantidad101.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad101.setColumns(10);
		txtCantidad101.setBounds(260, 400, 35, 20);
		panel1.add(txtCantidad101);

		txtCantidad111 = new JTextField();
		txtCantidad111.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad111.setColumns(10);
		txtCantidad111.setBounds(260, 422, 35, 20);
		panel1.add(txtCantidad111);

		txtCantidad121 = new JTextField();
		txtCantidad121.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad121.setColumns(10);
		txtCantidad121.setBounds(260, 444, 35, 20);
		panel1.add(txtCantidad121);

		txtCantidad131 = new JTextField();
		txtCantidad131.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad131.setColumns(10);
		txtCantidad131.setBounds(260, 480, 35, 20);
		panel1.add(txtCantidad131);

		txtCantidad141 = new JTextField();
		txtCantidad141.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad141.setColumns(10);
		txtCantidad141.setBounds(260, 519, 35, 20);
		panel1.add(txtCantidad141);

		txtObs14 = new JTextField();
		txtObs14.setColumns(10);
		txtObs14.setBounds(305, 519, 129, 20);
		panel1.add(txtObs14);

		txtObs13 = new JTextField();
		txtObs13.setColumns(10);
		txtObs13.setBounds(305, 480, 129, 20);
		panel1.add(txtObs13);

		txtObs12 = new JTextField();
		txtObs12.setColumns(10);
		txtObs12.setBounds(305, 444, 129, 20);
		panel1.add(txtObs12);

		txtObs11 = new JTextField();
		txtObs11.setColumns(10);
		txtObs11.setBounds(305, 422, 129, 20);
		panel1.add(txtObs11);

		txtObs10 = new JTextField();
		txtObs10.setColumns(10);
		txtObs10.setBounds(305, 400, 129, 20);
		panel1.add(txtObs10);

		label_16 = new JLabel("Observaci\u00F3n/Referencia");
		label_16.setHorizontalAlignment(SwingConstants.LEFT);
		label_16.setFont(new Font("Arial", Font.BOLD, 11));
		label_16.setBounds(299, 378, 139, 14);
		panel1.add(label_16);

		label_13 = new JLabel("COMPONENTE ARQUITECT\u00D3NICO");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Arial", Font.BOLD, 11));
		label_13.setBounds(448, 31, 193, 14);
		panel1.add(label_13);

		lblPerfilSfTipo_1 = new JLabel("Perfil SF Tipo 12 MS-SF-12  para paneles");
		lblPerfilSfTipo_1.setVerticalAlignment(SwingConstants.TOP);
		lblPerfilSfTipo_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerfilSfTipo_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPerfilSfTipo_1.setBounds(448, 56, 203, 14);
		panel1.add(lblPerfilSfTipo_1);

		lblPanelesTcbx = new JLabel("Paneles TCB (8.8x5.8 m)");
		lblPanelesTcbx.setVerticalAlignment(SwingConstants.TOP);
		lblPanelesTcbx.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesTcbx.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesTcbx.setBounds(448, 78, 183, 14);
		panel1.add(lblPanelesTcbx);

		lblPanelesVynilPiso = new JLabel("Paneles vynil piso (0,15x1,93 m)");
		lblPanelesVynilPiso.setVerticalAlignment(SwingConstants.TOP);
		lblPanelesVynilPiso.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesVynilPiso.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesVynilPiso.setBounds(448, 100, 203, 14);
		panel1.add(lblPanelesVynilPiso);

		txtCantidad170 = new JTextField();
		txtCantidad170.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad170.setText("354");
		txtCantidad170.setEditable(false);
		txtCantidad170.setColumns(10);
		txtCantidad170.setBounds(661, 97, 35, 20);
		panel1.add(txtCantidad170);

		txtCantidad160 = new JTextField();
		txtCantidad160.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad160.setText("2");
		txtCantidad160.setEditable(false);
		txtCantidad160.setColumns(10);
		txtCantidad160.setBounds(661, 75, 35, 20);
		panel1.add(txtCantidad160);

		txtCantidad150 = new JTextField();
		txtCantidad150.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad150.setText("8");
		txtCantidad150.setEditable(false);
		txtCantidad150.setColumns(10);
		txtCantidad150.setBounds(661, 53, 35, 20);
		panel1.add(txtCantidad150);

		label_19 = new JLabel("Cantidad");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("Arial", Font.BOLD, 11));
		label_19.setBounds(664, 31, 63, 14);
		panel1.add(label_19);

		txtCantidad151 = new JTextField();
		txtCantidad151.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad151.setColumns(10);
		txtCantidad151.setBounds(698, 53, 35, 20);
		panel1.add(txtCantidad151);

		txtCantidad161 = new JTextField();
		txtCantidad161.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad161.setColumns(10);
		txtCantidad161.setBounds(698, 75, 35, 20);
		panel1.add(txtCantidad161);

		txtCantidad171 = new JTextField();
		txtCantidad171.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad171.setColumns(10);
		txtCantidad171.setBounds(698, 97, 35, 20);
		panel1.add(txtCantidad171);

		txtObs17 = new JTextField();
		txtObs17.setColumns(10);
		txtObs17.setBounds(743, 97, 129, 20);
		panel1.add(txtObs17);

		txtObs16 = new JTextField();
		txtObs16.setColumns(10);
		txtObs16.setBounds(743, 75, 129, 20);
		panel1.add(txtObs16);

		txtObs15 = new JTextField();
		txtObs15.setColumns(10);
		txtObs15.setBounds(743, 53, 129, 20);
		panel1.add(txtObs15);

		label_20 = new JLabel("Observaci\u00F3n/Referencia");
		label_20.setHorizontalAlignment(SwingConstants.LEFT);
		label_20.setFont(new Font("Arial", Font.BOLD, 11));
		label_20.setBounds(737, 31, 139, 14);
		panel1.add(label_20);

		lblPanelesEpsPara = new JLabel("Paneles EPS para cubierta I=7, a= 1 m");
		lblPanelesEpsPara.setVerticalAlignment(SwingConstants.TOP);
		lblPanelesEpsPara.setHorizontalAlignment(SwingConstants.LEFT);
		lblPanelesEpsPara.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPanelesEpsPara.setBounds(448, 122, 203, 14);
		panel1.add(lblPanelesEpsPara);

		txtCantidad180 = new JTextField();
		txtCantidad180.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad180.setText("18");
		txtCantidad180.setEditable(false);
		txtCantidad180.setColumns(10);
		txtCantidad180.setBounds(661, 119, 35, 20);
		panel1.add(txtCantidad180);

		txtCantidad181 = new JTextField();
		txtCantidad181.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad181.setColumns(10);
		txtCantidad181.setBounds(698, 119, 35, 20);
		panel1.add(txtCantidad181);

		txtObs18 = new JTextField();
		txtObs18.setColumns(10);
		txtObs18.setBounds(743, 119, 129, 20);
		panel1.add(txtObs18);

		label_14 = new JLabel("FACHADA FRONTAL");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Arial", Font.BOLD, 11));
		label_14.setBounds(471, 164, 129, 14);
		panel1.add(label_14);

		label_17 = new JLabel("Paneles EPS pared -   ( 1x3x0,09x0,09 m)");
		label_17.setHorizontalAlignment(SwingConstants.LEFT);
		label_17.setFont(new Font("Arial", Font.PLAIN, 11));
		label_17.setBounds(448, 189, 203, 14);
		panel1.add(label_17);

		label_18 = new JLabel("Paneles EPS pared -   ( 1x0,90x0,90 m)");
		label_18.setHorizontalAlignment(SwingConstants.LEFT);
		label_18.setFont(new Font("Arial", Font.PLAIN, 11));
		label_18.setBounds(448, 211, 203, 14);
		panel1.add(label_18);

		label_21 = new JLabel("Paneles EPS pared -   ( 1x1,10x0,09 m)");
		label_21.setHorizontalAlignment(SwingConstants.LEFT);
		label_21.setFont(new Font("Arial", Font.PLAIN, 11));
		label_21.setBounds(448, 233, 203, 14);
		panel1.add(label_21);

		label_22 = new JLabel("Paneles EPS pared -   ( 1x0,80x0,09 m)");
		label_22.setHorizontalAlignment(SwingConstants.LEFT);
		label_22.setFont(new Font("Arial", Font.PLAIN, 11));
		label_22.setBounds(448, 255, 203, 14);
		panel1.add(label_22);

		label_23 = new JLabel("FACHADA POSTERIOR");
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setFont(new Font("Arial", Font.BOLD, 11));
		label_23.setBounds(471, 293, 129, 14);
		panel1.add(label_23);

		label_24 = new JLabel("Paneles EPS pared -   ( 1x2,70 x0,90  m)");
		label_24.setHorizontalAlignment(SwingConstants.LEFT);
		label_24.setFont(new Font("Arial", Font.PLAIN, 11));
		label_24.setBounds(448, 318, 203, 14);
		panel1.add(label_24);

		label_25 = new JLabel("Paneles EPS pared -   ( 1x1,10 x0,90  m)");
		label_25.setHorizontalAlignment(SwingConstants.LEFT);
		label_25.setFont(new Font("Arial", Font.PLAIN, 11));
		label_25.setBounds(448, 340, 203, 14);
		panel1.add(label_25);

		label_26 = new JLabel("Paneles EPS pared -   ( 1x0,50 x0,90  m)");
		label_26.setHorizontalAlignment(SwingConstants.LEFT);
		label_26.setFont(new Font("Arial", Font.PLAIN, 11));
		label_26.setBounds(448, 362, 203, 14);
		panel1.add(label_26);

		label_27 = new JLabel("FACHADA LATERAL");
		label_27.setHorizontalAlignment(SwingConstants.CENTER);
		label_27.setFont(new Font("Arial", Font.BOLD, 11));
		label_27.setBounds(471, 397, 129, 14);
		panel1.add(label_27);

		label_28 = new JLabel("Panel Hvar- pared laterales izq (libre)");
		label_28.setHorizontalAlignment(SwingConstants.LEFT);
		label_28.setFont(new Font("Arial", Font.PLAIN, 11));
		label_28.setBounds(448, 422, 203, 14);
		panel1.add(label_28);

		txtCantidad260 = new JTextField();
		txtCantidad260.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad260.setText("12");
		txtCantidad260.setEditable(false);
		txtCantidad260.setColumns(10);
		txtCantidad260.setBounds(661, 419, 35, 20);
		panel1.add(txtCantidad260);

		txtCantidad261 = new JTextField();
		txtCantidad261.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad261.setColumns(10);
		txtCantidad261.setBounds(698, 419, 35, 20);
		panel1.add(txtCantidad261);

		txtObs26 = new JTextField();
		txtObs26.setColumns(10);
		txtObs26.setBounds(743, 419, 129, 20);
		panel1.add(txtObs26);

		label_29 = new JLabel("Observaci\u00F3n/Referencia");
		label_29.setHorizontalAlignment(SwingConstants.LEFT);
		label_29.setFont(new Font("Arial", Font.BOLD, 11));
		label_29.setBounds(737, 397, 139, 14);
		panel1.add(label_29);

		label_30 = new JLabel("Cantidad");
		label_30.setHorizontalAlignment(SwingConstants.CENTER);
		label_30.setFont(new Font("Arial", Font.BOLD, 11));
		label_30.setBounds(664, 397, 63, 14);
		panel1.add(label_30);

		txtCantidad250 = new JTextField();
		txtCantidad250.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad250.setText("12");
		txtCantidad250.setEditable(false);
		txtCantidad250.setColumns(10);
		txtCantidad250.setBounds(661, 359, 35, 20);
		panel1.add(txtCantidad250);

		txtCantidad251 = new JTextField();
		txtCantidad251.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad251.setColumns(10);
		txtCantidad251.setBounds(698, 359, 35, 20);
		panel1.add(txtCantidad251);

		txtCantidad241 = new JTextField();
		txtCantidad241.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad241.setColumns(10);
		txtCantidad241.setBounds(698, 337, 35, 20);
		panel1.add(txtCantidad241);

		txtCantidad240 = new JTextField();
		txtCantidad240.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad240.setText("12");
		txtCantidad240.setEditable(false);
		txtCantidad240.setColumns(10);
		txtCantidad240.setBounds(661, 337, 35, 20);
		panel1.add(txtCantidad240);

		txtCantidad230 = new JTextField();
		txtCantidad230.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad230.setText("6");
		txtCantidad230.setEditable(false);
		txtCantidad230.setColumns(10);
		txtCantidad230.setBounds(661, 315, 35, 20);
		panel1.add(txtCantidad230);

		txtCantidad231 = new JTextField();
		txtCantidad231.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad231.setColumns(10);
		txtCantidad231.setBounds(698, 315, 35, 20);
		panel1.add(txtCantidad231);

		label_31 = new JLabel("Cantidad");
		label_31.setHorizontalAlignment(SwingConstants.CENTER);
		label_31.setFont(new Font("Arial", Font.BOLD, 11));
		label_31.setBounds(664, 293, 63, 14);
		panel1.add(label_31);

		label_32 = new JLabel("Observaci\u00F3n/Referencia");
		label_32.setHorizontalAlignment(SwingConstants.LEFT);
		label_32.setFont(new Font("Arial", Font.BOLD, 11));
		label_32.setBounds(737, 293, 139, 14);
		panel1.add(label_32);

		txtObs23 = new JTextField();
		txtObs23.setColumns(10);
		txtObs23.setBounds(743, 315, 129, 20);
		panel1.add(txtObs23);

		txtObs24 = new JTextField();
		txtObs24.setColumns(10);
		txtObs24.setBounds(743, 337, 129, 20);
		panel1.add(txtObs24);

		txtObs25 = new JTextField();
		txtObs25.setColumns(10);
		txtObs25.setBounds(743, 359, 129, 20);
		panel1.add(txtObs25);

		label_33 = new JLabel("Cantidad");
		label_33.setHorizontalAlignment(SwingConstants.CENTER);
		label_33.setFont(new Font("Arial", Font.BOLD, 11));
		label_33.setBounds(664, 164, 63, 14);
		panel1.add(label_33);

		txtCantidad190 = new JTextField();
		txtCantidad190.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad190.setText("10");
		txtCantidad190.setEditable(false);
		txtCantidad190.setColumns(10);
		txtCantidad190.setBounds(661, 186, 35, 20);
		panel1.add(txtCantidad190);

		txtCantidad191 = new JTextField();
		txtCantidad191.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad191.setColumns(10);
		txtCantidad191.setBounds(698, 186, 35, 20);
		panel1.add(txtCantidad191);

		txtCantidad201 = new JTextField();
		txtCantidad201.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad201.setColumns(10);
		txtCantidad201.setBounds(698, 208, 35, 20);
		panel1.add(txtCantidad201);

		txtCantidad200 = new JTextField();
		txtCantidad200.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad200.setText("2");
		txtCantidad200.setEditable(false);
		txtCantidad200.setColumns(10);
		txtCantidad200.setBounds(661, 208, 35, 20);
		panel1.add(txtCantidad200);

		txtCantidad210 = new JTextField();
		txtCantidad210.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad210.setText("2");
		txtCantidad210.setEditable(false);
		txtCantidad210.setColumns(10);
		txtCantidad210.setBounds(661, 230, 35, 20);
		panel1.add(txtCantidad210);

		txtCantidad211 = new JTextField();
		txtCantidad211.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad211.setColumns(10);
		txtCantidad211.setBounds(698, 230, 35, 20);
		panel1.add(txtCantidad211);

		txtCantidad221 = new JTextField();
		txtCantidad221.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad221.setColumns(10);
		txtCantidad221.setBounds(698, 252, 35, 20);
		panel1.add(txtCantidad221);

		txtCantidad220 = new JTextField();
		txtCantidad220.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad220.setText("6");
		txtCantidad220.setEditable(false);
		txtCantidad220.setColumns(10);
		txtCantidad220.setBounds(661, 252, 35, 20);
		panel1.add(txtCantidad220);

		txtObs22 = new JTextField();
		txtObs22.setColumns(10);
		txtObs22.setBounds(743, 252, 129, 20);
		panel1.add(txtObs22);

		txtObs21 = new JTextField();
		txtObs21.setColumns(10);
		txtObs21.setBounds(743, 230, 129, 20);
		panel1.add(txtObs21);

		txtObs20 = new JTextField();
		txtObs20.setColumns(10);
		txtObs20.setBounds(743, 208, 129, 20);
		panel1.add(txtObs20);

		txtObs19 = new JTextField();
		txtObs19.setColumns(10);
		txtObs19.setBounds(743, 186, 129, 20);
		panel1.add(txtObs19);

		label_34 = new JLabel("Observaci\u00F3n/Referencia");
		label_34.setHorizontalAlignment(SwingConstants.LEFT);
		label_34.setFont(new Font("Arial", Font.BOLD, 11));
		label_34.setBounds(737, 164, 139, 14);
		panel1.add(label_34);

		label_35 = new JLabel("COMPONENTE ESTRUCTURAL");
		label_35.setHorizontalAlignment(SwingConstants.CENTER);
		label_35.setFont(new Font("Arial", Font.BOLD, 11));
		label_35.setBounds(896, 31, 203, 14);
		panel1.add(label_35);

		label_36 = new JLabel("Dados cimentaci\u00F3n");
		label_36.setHorizontalAlignment(SwingConstants.LEFT);
		label_36.setFont(new Font("Arial", Font.PLAIN, 11));
		label_36.setBounds(896, 56, 203, 14);
		panel1.add(label_36);

		label_37 = new JLabel("Perfil SF Tipo 1");
		label_37.setHorizontalAlignment(SwingConstants.LEFT);
		label_37.setFont(new Font("Arial", Font.PLAIN, 11));
		label_37.setBounds(896, 78, 203, 14);
		panel1.add(label_37);

		label_38 = new JLabel("Perfil SF Tipo 2");
		label_38.setHorizontalAlignment(SwingConstants.LEFT);
		label_38.setFont(new Font("Arial", Font.PLAIN, 11));
		label_38.setBounds(896, 100, 203, 14);
		panel1.add(label_38);

		label_39 = new JLabel("Perfil SF Tipo 3");
		label_39.setHorizontalAlignment(SwingConstants.LEFT);
		label_39.setFont(new Font("Arial", Font.PLAIN, 11));
		label_39.setBounds(896, 122, 203, 14);
		panel1.add(label_39);

		label_40 = new JLabel("Perfil SF Tipo 4");
		label_40.setHorizontalAlignment(SwingConstants.LEFT);
		label_40.setFont(new Font("Arial", Font.PLAIN, 11));
		label_40.setBounds(896, 144, 203, 14);
		panel1.add(label_40);

		label_41 = new JLabel("Perfil SF Tipo 5");
		label_41.setHorizontalAlignment(SwingConstants.LEFT);
		label_41.setFont(new Font("Arial", Font.PLAIN, 11));
		label_41.setBounds(896, 166, 203, 14);
		panel1.add(label_41);

		label_42 = new JLabel("Perfil SF Tipo 6");
		label_42.setHorizontalAlignment(SwingConstants.LEFT);
		label_42.setFont(new Font("Arial", Font.PLAIN, 11));
		label_42.setBounds(896, 188, 203, 14);
		panel1.add(label_42);

		label_43 = new JLabel("Perfil SF Tipo 7");
		label_43.setHorizontalAlignment(SwingConstants.LEFT);
		label_43.setFont(new Font("Arial", Font.PLAIN, 11));
		label_43.setBounds(896, 210, 203, 14);
		panel1.add(label_43);

		label_44 = new JLabel("Perfil SF Tipo 8");
		label_44.setHorizontalAlignment(SwingConstants.LEFT);
		label_44.setFont(new Font("Arial", Font.PLAIN, 11));
		label_44.setBounds(896, 232, 203, 14);
		panel1.add(label_44);

		label_45 = new JLabel("Perfil SF Tipo 9");
		label_45.setHorizontalAlignment(SwingConstants.LEFT);
		label_45.setFont(new Font("Arial", Font.PLAIN, 11));
		label_45.setBounds(896, 254, 203, 14);
		panel1.add(label_45);

		label_46 = new JLabel("Perfil SF Tipo 10");
		label_46.setHorizontalAlignment(SwingConstants.LEFT);
		label_46.setFont(new Font("Arial", Font.PLAIN, 11));
		label_46.setBounds(896, 276, 203, 14);
		panel1.add(label_46);

		label_47 = new JLabel("Perfil SF Tipo 11");
		label_47.setHorizontalAlignment(SwingConstants.LEFT);
		label_47.setFont(new Font("Arial", Font.PLAIN, 11));
		label_47.setBounds(896, 298, 203, 14);
		panel1.add(label_47);

		label_48 = new JLabel("Cantidad");
		label_48.setHorizontalAlignment(SwingConstants.CENTER);
		label_48.setFont(new Font("Arial", Font.BOLD, 11));
		label_48.setBounds(1112, 31, 63, 14);
		panel1.add(label_48);

		txtCantidad270 = new JTextField();
		txtCantidad270.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad270.setText("30");
		txtCantidad270.setEditable(false);
		txtCantidad270.setColumns(10);
		txtCantidad270.setBounds(1109, 53, 35, 20);
		panel1.add(txtCantidad270);

		txtCantidad271 = new JTextField();
		txtCantidad271.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad271.setColumns(10);
		txtCantidad271.setBounds(1146, 53, 35, 20);
		panel1.add(txtCantidad271);

		txtObs27 = new JTextField();
		txtObs27.setColumns(10);
		txtObs27.setBounds(1191, 53, 129, 20);
		panel1.add(txtObs27);

		label_49 = new JLabel("Observaci\u00F3n/Referencia");
		label_49.setHorizontalAlignment(SwingConstants.LEFT);
		label_49.setFont(new Font("Arial", Font.BOLD, 11));
		label_49.setBounds(1185, 31, 139, 14);
		panel1.add(label_49);

		txtObs28 = new JTextField();
		txtObs28.setColumns(10);
		txtObs28.setBounds(1191, 75, 129, 20);
		panel1.add(txtObs28);

		txtCantidad281 = new JTextField();
		txtCantidad281.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad281.setColumns(10);
		txtCantidad281.setBounds(1146, 75, 35, 20);
		panel1.add(txtCantidad281);

		txtCantidad280 = new JTextField();
		txtCantidad280.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad280.setText("6");
		txtCantidad280.setEditable(false);
		txtCantidad280.setColumns(10);
		txtCantidad280.setBounds(1109, 75, 35, 20);
		panel1.add(txtCantidad280);

		txtCantidad290 = new JTextField();
		txtCantidad290.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad290.setText("12");
		txtCantidad290.setEditable(false);
		txtCantidad290.setColumns(10);
		txtCantidad290.setBounds(1109, 97, 35, 20);
		panel1.add(txtCantidad290);

		txtCantidad291 = new JTextField();
		txtCantidad291.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad291.setColumns(10);
		txtCantidad291.setBounds(1146, 97, 35, 20);
		panel1.add(txtCantidad291);

		txtObs29 = new JTextField();
		txtObs29.setColumns(10);
		txtObs29.setBounds(1191, 97, 129, 20);
		panel1.add(txtObs29);

		txtObs30 = new JTextField();
		txtObs30.setColumns(10);
		txtObs30.setBounds(1191, 119, 129, 20);
		panel1.add(txtObs30);

		txtCantidad301 = new JTextField();
		txtCantidad301.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad301.setColumns(10);
		txtCantidad301.setBounds(1146, 119, 35, 20);
		panel1.add(txtCantidad301);

		txtCantidad300 = new JTextField();
		txtCantidad300.setText("54");
		txtCantidad300.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad300.setEditable(false);
		txtCantidad300.setColumns(10);
		txtCantidad300.setBounds(1109, 119, 35, 20);
		panel1.add(txtCantidad300);

		txtCantidad310 = new JTextField();
		txtCantidad310.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad310.setText("8");
		txtCantidad310.setEditable(false);
		txtCantidad310.setColumns(10);
		txtCantidad310.setBounds(1109, 141, 35, 20);
		panel1.add(txtCantidad310);

		txtCantidad311 = new JTextField();
		txtCantidad311.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad311.setColumns(10);
		txtCantidad311.setBounds(1146, 141, 35, 20);
		panel1.add(txtCantidad311);

		txtObs31 = new JTextField();
		txtObs31.setColumns(10);
		txtObs31.setBounds(1191, 141, 129, 20);
		panel1.add(txtObs31);

		txtObs32 = new JTextField();
		txtObs32.setColumns(10);
		txtObs32.setBounds(1191, 163, 129, 20);
		panel1.add(txtObs32);

		txtCantidad321 = new JTextField();
		txtCantidad321.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad321.setColumns(10);
		txtCantidad321.setBounds(1146, 163, 35, 20);
		panel1.add(txtCantidad321);

		txtCantidad320 = new JTextField();
		txtCantidad320.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad320.setText("16");
		txtCantidad320.setEditable(false);
		txtCantidad320.setColumns(10);
		txtCantidad320.setBounds(1109, 163, 35, 20);
		panel1.add(txtCantidad320);

		txtCantidad330 = new JTextField();
		txtCantidad330.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad330.setText("16");
		txtCantidad330.setEditable(false);
		txtCantidad330.setColumns(10);
		txtCantidad330.setBounds(1109, 185, 35, 20);
		panel1.add(txtCantidad330);

		txtCantidad331 = new JTextField();
		txtCantidad331.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad331.setColumns(10);
		txtCantidad331.setBounds(1146, 185, 35, 20);
		panel1.add(txtCantidad331);

		txtObs33 = new JTextField();
		txtObs33.setColumns(10);
		txtObs33.setBounds(1191, 185, 129, 20);
		panel1.add(txtObs33);

		txtObs34 = new JTextField();
		txtObs34.setColumns(10);
		txtObs34.setBounds(1191, 207, 129, 20);
		panel1.add(txtObs34);

		txtCantidad341 = new JTextField();
		txtCantidad341.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad341.setColumns(10);
		txtCantidad341.setBounds(1146, 207, 35, 20);
		panel1.add(txtCantidad341);

		txtCantidad340 = new JTextField();
		txtCantidad340.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad340.setText("4");
		txtCantidad340.setEditable(false);
		txtCantidad340.setColumns(10);
		txtCantidad340.setBounds(1109, 207, 35, 20);
		panel1.add(txtCantidad340);

		txtCantidad350 = new JTextField();
		txtCantidad350.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad350.setText("8");
		txtCantidad350.setEditable(false);
		txtCantidad350.setColumns(10);
		txtCantidad350.setBounds(1109, 229, 35, 20);
		panel1.add(txtCantidad350);

		txtCantidad351 = new JTextField();
		txtCantidad351.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad351.setColumns(10);
		txtCantidad351.setBounds(1146, 229, 35, 20);
		panel1.add(txtCantidad351);

		txtObs35 = new JTextField();
		txtObs35.setColumns(10);
		txtObs35.setBounds(1191, 229, 129, 20);
		panel1.add(txtObs35);

		txtObs36 = new JTextField();
		txtObs36.setColumns(10);
		txtObs36.setBounds(1191, 251, 129, 20);
		panel1.add(txtObs36);

		txtCantidad361 = new JTextField();
		txtCantidad361.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad361.setColumns(10);
		txtCantidad361.setBounds(1146, 251, 35, 20);
		panel1.add(txtCantidad361);

		txtCantidad360 = new JTextField();
		txtCantidad360.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad360.setText("8");
		txtCantidad360.setEditable(false);
		txtCantidad360.setColumns(10);
		txtCantidad360.setBounds(1109, 251, 35, 20);
		panel1.add(txtCantidad360);

		txtCantidad370 = new JTextField();
		txtCantidad370.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad370.setText("12");
		txtCantidad370.setEditable(false);
		txtCantidad370.setColumns(10);
		txtCantidad370.setBounds(1109, 273, 35, 20);
		panel1.add(txtCantidad370);

		txtCantidad371 = new JTextField();
		txtCantidad371.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad371.setColumns(10);
		txtCantidad371.setBounds(1146, 273, 35, 20);
		panel1.add(txtCantidad371);

		txtObs37 = new JTextField();
		txtObs37.setColumns(10);
		txtObs37.setBounds(1191, 273, 129, 20);
		panel1.add(txtObs37);

		txtObs38 = new JTextField();
		txtObs38.setColumns(10);
		txtObs38.setBounds(1191, 295, 129, 20);
		panel1.add(txtObs38);

		txtCantidad381 = new JTextField();
		txtCantidad381.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad381.setColumns(10);
		txtCantidad381.setBounds(1146, 295, 35, 20);
		panel1.add(txtCantidad381);

		txtCantidad380 = new JTextField();
		txtCantidad380.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad380.setText("12");
		txtCantidad380.setEditable(false);
		txtCantidad380.setColumns(10);
		txtCantidad380.setBounds(1109, 295, 35, 20);
		panel1.add(txtCantidad380);

		lblCercha = new JLabel("Cercha");
		lblCercha.setHorizontalAlignment(SwingConstants.LEFT);
		lblCercha.setFont(new Font("Arial", Font.PLAIN, 11));
		lblCercha.setBounds(896, 350, 203, 14);
		panel1.add(lblCercha);

		txtCantidad400 = new JTextField();
		txtCantidad400.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad400.setText("2");
		txtCantidad400.setEditable(false);
		txtCantidad400.setColumns(10);
		txtCantidad400.setBounds(1109, 347, 35, 20);
		panel1.add(txtCantidad400);

		txtCantidad401 = new JTextField();
		txtCantidad401.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad401.setColumns(10);
		txtCantidad401.setBounds(1146, 347, 35, 20);
		panel1.add(txtCantidad401);

		txtObs40 = new JTextField();
		txtObs40.setColumns(10);
		txtObs40.setBounds(1191, 347, 129, 20);
		panel1.add(txtObs40);

		JLabel label_50 = new JLabel("Perfil SF Tipo 11");
		label_50.setHorizontalAlignment(SwingConstants.LEFT);
		label_50.setFont(new Font("Arial", Font.PLAIN, 11));
		label_50.setBounds(896, 321, 203, 14);
		panel1.add(label_50);

		txtCantidad390 = new JTextField();
		txtCantidad390.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad390.setText("64");
		txtCantidad390.setEditable(false);
		txtCantidad390.setColumns(10);
		txtCantidad390.setBounds(1109, 318, 35, 20);
		panel1.add(txtCantidad390);

		txtCantidad391 = new JTextField();
		txtCantidad391.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad391.setColumns(10);
		txtCantidad391.setBounds(1146, 318, 35, 20);
		panel1.add(txtCantidad391);

		txtObs39 = new JTextField();
		txtObs39.setColumns(10);
		txtObs39.setBounds(1191, 318, 129, 20);
		panel1.add(txtObs39);

		validarDigitos(txtCantidad01);
		validarDigitos(txtCantidad11);
		validarDigitos(txtCantidad21);
		validarDigitos(txtCantidad31);
		validarDigitos(txtCantidad41);
		validarDigitos(txtCantidad51);
		validarDigitos(txtCantidad61);
		validarDigitos(txtCantidad71);
		validarDigitos(txtCantidad81);
		validarDigitos(txtCantidad91);
		validarDigitos(txtCantidad101);
		validarDigitos(txtCantidad111);
		validarDigitos(txtCantidad121);
		validarDigitos(txtCantidad131);
		validarDigitos(txtCantidad141);
		validarDigitos(txtCantidad151);
		validarDigitos(txtCantidad161);
		validarDigitos(txtCantidad171);
		validarDigitos(txtCantidad181);
		validarDigitos(txtCantidad191);
		validarDigitos(txtCantidad201);
		validarDigitos(txtCantidad211);
		validarDigitos(txtCantidad221);
		validarDigitos(txtCantidad231);
		validarDigitos(txtCantidad241);
		validarDigitos(txtCantidad251);
		validarDigitos(txtCantidad261);
		validarDigitos(txtCantidad271);
		validarDigitos(txtCantidad281);
		validarDigitos(txtCantidad291);
		validarDigitos(txtCantidad301);
		validarDigitos(txtCantidad311);
		validarDigitos(txtCantidad321);
		validarDigitos(txtCantidad331);
		validarDigitos(txtCantidad341);
		validarDigitos(txtCantidad351);
		validarDigitos(txtCantidad361);
		validarDigitos(txtCantidad371);
		validarDigitos(txtCantidad381);
		validarDigitos(txtCantidad391);
		validarDigitos(txtCantidad401);

		llenarFicha();
		cabecera.getBtnRegistrar().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ServicioInfoObligatoria srvInfoOblig = new ComponenteInfoObligatoria();
				infor = cargarInfoObligatoria(informacionObligatoriaV);
				infor.setIoFotoPath(fotoInfoObl);
				infor.setIoSerial(srvInfoOblig.serialInfoOblMax());

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
						Reporte reporte = new Reporte("Reporte MS", 280, 10, 850, 750);
						InputStream path = AlInicio.class.getResourceAsStream("/com/capa/templates/MA.jasper");
						reporte.cargarReporte(path, parametros, Query.getMysql().getConexion());
						reporte.setVisible(true);
						new Menu().setVisible(true);
						dispose();
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
		List<TdetalleFicha> detallesFicha = new LinkedList<>();

		// ServicioInfoObligatoria srvInfoObl = new ComponenteInfoObligatoria();
		// infor.setIoSerial(srvInfoObl.serialInfoOblMax());

		BigDecimal porcentajeAvance;
		TGrupo grupoTmp = servFicha.buscarGrupo("Kit eléctrico");
		Integer updateFicha = servFicha.nActualizacionFicha(gettCabecera(), ficha);
		if (updateFicha == -1) {
			updateFicha = 0;
		} else {
			updateFicha++;
		}

		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad00.getText()),
				Integer.parseInt(txtCantidad01.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_0),
				Integer.parseInt(txtCantidad00.getText()), Integer.parseInt(txtCantidad01.getText()), txtObs0.getText(),
				updateFicha, porcentajeAvance, ITEM_MS_0, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad10.getText()),
				Integer.parseInt(txtCantidad11.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_1),
				Integer.parseInt(txtCantidad10.getText()), Integer.parseInt(txtCantidad11.getText()), txtObs1.getText(),
				updateFicha, porcentajeAvance, ITEM_MS_1, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad20.getText()),
				Integer.parseInt(txtCantidad21.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_2),
				Integer.parseInt(txtCantidad20.getText()), Integer.parseInt(txtCantidad21.getText()), txtObs2.getText(),
				updateFicha, porcentajeAvance, ITEM_MS_2, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad30.getText()),
				Integer.parseInt(txtCantidad31.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_3),
				Integer.parseInt(txtCantidad30.getText()), Integer.parseInt(txtCantidad31.getText()), txtObs3.getText(),
				updateFicha, porcentajeAvance, ITEM_MS_3, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad40.getText()),
				Integer.parseInt(txtCantidad41.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_4),
				Integer.parseInt(txtCantidad40.getText()), Integer.parseInt(txtCantidad41.getText()), txtObs4.getText(),
				updateFicha, porcentajeAvance, ITEM_MS_4, "UNIDAD"));

		grupoTmp = servFicha.buscarGrupo("Kit agua lluvia");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad50.getText()),
				Integer.parseInt(txtCantidad51.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_5),
				Integer.parseInt(txtCantidad50.getText()), Integer.parseInt(txtCantidad51.getText()), txtObs5.getText(),
				updateFicha, porcentajeAvance, ITEM_MS_5, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad60.getText()),
				Integer.parseInt(txtCantidad61.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_6),
				Integer.parseInt(txtCantidad60.getText()), Integer.parseInt(txtCantidad61.getText()), txtObs6.getText(),
				updateFicha, porcentajeAvance, ITEM_MS_6, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad70.getText()),
				Integer.parseInt(txtCantidad71.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_7),
				Integer.parseInt(txtCantidad70.getText()), Integer.parseInt(txtCantidad71.getText()), txtObs7.getText(),
				updateFicha, porcentajeAvance, ITEM_MS_7, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad80.getText()),
				Integer.parseInt(txtCantidad81.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_8),
				Integer.parseInt(txtCantidad80.getText()), Integer.parseInt(txtCantidad81.getText()), txtObs8.getText(),
				updateFicha, porcentajeAvance, ITEM_MS_8, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad90.getText()),
				Integer.parseInt(txtCantidad91.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_9),
				Integer.parseInt(txtCantidad90.getText()), Integer.parseInt(txtCantidad91.getText()), txtObs9.getText(),
				updateFicha, porcentajeAvance, ITEM_MS_9, "UNIDAD"));

		grupoTmp = servFicha.buscarGrupo("Componente arquitectónico");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad100.getText()),
				Integer.parseInt(txtCantidad101.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_10),
				Integer.parseInt(txtCantidad100.getText()), Integer.parseInt(txtCantidad101.getText()),
				txtObs10.getText(), updateFicha, porcentajeAvance, ITEM_MS_10, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad110.getText()),
				Integer.parseInt(txtCantidad111.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_11),
				Integer.parseInt(txtCantidad110.getText()), Integer.parseInt(txtCantidad111.getText()),
				txtObs11.getText(), updateFicha, porcentajeAvance, ITEM_MS_11, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad120.getText()),
				Integer.parseInt(txtCantidad121.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_12),
				Integer.parseInt(txtCantidad120.getText()), Integer.parseInt(txtCantidad121.getText()),
				txtObs12.getText(), updateFicha, porcentajeAvance, ITEM_MS_12, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad130.getText()),
				Integer.parseInt(txtCantidad131.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_13),
				Integer.parseInt(txtCantidad130.getText()), Integer.parseInt(txtCantidad131.getText()),
				txtObs13.getText(), updateFicha, porcentajeAvance, ITEM_MS_13, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad140.getText()),
				Integer.parseInt(txtCantidad141.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_14),
				Integer.parseInt(txtCantidad140.getText()), Integer.parseInt(txtCantidad141.getText()),
				txtObs14.getText(), updateFicha, porcentajeAvance, ITEM_MS_14, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad150.getText()),
				Integer.parseInt(txtCantidad151.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_15),
				Integer.parseInt(txtCantidad150.getText()), Integer.parseInt(txtCantidad151.getText()),
				txtObs15.getText(), updateFicha, porcentajeAvance, ITEM_MS_15, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad160.getText()),
				Integer.parseInt(txtCantidad161.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_16),
				Integer.parseInt(txtCantidad160.getText()), Integer.parseInt(txtCantidad161.getText()),
				txtObs16.getText(), updateFicha, porcentajeAvance, ITEM_MS_16, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad170.getText()),
				Integer.parseInt(txtCantidad171.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_17),
				Integer.parseInt(txtCantidad170.getText()), Integer.parseInt(txtCantidad171.getText()),
				txtObs17.getText(), updateFicha, porcentajeAvance, ITEM_MS_17, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad180.getText()),
				Integer.parseInt(txtCantidad181.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_18),
				Integer.parseInt(txtCantidad180.getText()), Integer.parseInt(txtCantidad181.getText()),
				txtObs18.getText(), updateFicha, porcentajeAvance, ITEM_MS_18, "UNIDAD"));

		grupoTmp = servFicha.buscarGrupo("Fachada frontal");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad190.getText()),
				Integer.parseInt(txtCantidad191.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_19),
				Integer.parseInt(txtCantidad190.getText()), Integer.parseInt(txtCantidad191.getText()),
				txtObs19.getText(), updateFicha, porcentajeAvance, ITEM_MS_19, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad200.getText()),
				Integer.parseInt(txtCantidad201.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_20),
				Integer.parseInt(txtCantidad200.getText()), Integer.parseInt(txtCantidad201.getText()),
				txtObs20.getText(), updateFicha, porcentajeAvance, ITEM_MS_20, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad210.getText()),
				Integer.parseInt(txtCantidad211.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_21),
				Integer.parseInt(txtCantidad210.getText()), Integer.parseInt(txtCantidad211.getText()),
				txtObs21.getText(), updateFicha, porcentajeAvance, ITEM_MS_21, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad220.getText()),
				Integer.parseInt(txtCantidad221.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_22),
				Integer.parseInt(txtCantidad220.getText()), Integer.parseInt(txtCantidad221.getText()),
				txtObs22.getText(), updateFicha, porcentajeAvance, ITEM_MS_22, "UNIDAD"));

		grupoTmp = servFicha.buscarGrupo("Fachada posterior");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad230.getText()),
				Integer.parseInt(txtCantidad231.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_23),
				Integer.parseInt(txtCantidad230.getText()), Integer.parseInt(txtCantidad231.getText()),
				txtObs23.getText(), updateFicha, porcentajeAvance, ITEM_MS_23, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad240.getText()),
				Integer.parseInt(txtCantidad241.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_24),
				Integer.parseInt(txtCantidad240.getText()), Integer.parseInt(txtCantidad241.getText()),
				txtObs24.getText(), updateFicha, porcentajeAvance, ITEM_MS_24, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad250.getText()),
				Integer.parseInt(txtCantidad251.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_25),
				Integer.parseInt(txtCantidad250.getText()), Integer.parseInt(txtCantidad251.getText()),
				txtObs25.getText(), updateFicha, porcentajeAvance, ITEM_MS_25, "UNIDAD"));

		grupoTmp = servFicha.buscarGrupo("Fachada lateral");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad260.getText()),
				Integer.parseInt(txtCantidad261.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_26),
				Integer.parseInt(txtCantidad260.getText()), Integer.parseInt(txtCantidad261.getText()),
				txtObs26.getText(), updateFicha, porcentajeAvance, ITEM_MS_26, "UNIDAD"));

		grupoTmp = servFicha.buscarGrupo("Componente estructural");
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad270.getText()),
				Integer.parseInt(txtCantidad271.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_27),
				Integer.parseInt(txtCantidad270.getText()), Integer.parseInt(txtCantidad271.getText()),
				txtObs27.getText(), updateFicha, porcentajeAvance, ITEM_MS_27, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad280.getText()),
				Integer.parseInt(txtCantidad281.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_28),
				Integer.parseInt(txtCantidad280.getText()), Integer.parseInt(txtCantidad281.getText()),
				txtObs28.getText(), updateFicha, porcentajeAvance, ITEM_MS_28, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad290.getText()),
				Integer.parseInt(txtCantidad291.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_29),
				Integer.parseInt(txtCantidad290.getText()), Integer.parseInt(txtCantidad291.getText()),
				txtObs29.getText(), updateFicha, porcentajeAvance, ITEM_MS_29, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad300.getText()),
				Integer.parseInt(txtCantidad301.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_30),
				Integer.parseInt(txtCantidad300.getText()), Integer.parseInt(txtCantidad301.getText()),
				txtObs30.getText(), updateFicha, porcentajeAvance, ITEM_MS_30, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad310.getText()),
				Integer.parseInt(txtCantidad311.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_31),
				Integer.parseInt(txtCantidad310.getText()), Integer.parseInt(txtCantidad311.getText()),
				txtObs31.getText(), updateFicha, porcentajeAvance, ITEM_MS_31, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad320.getText()),
				Integer.parseInt(txtCantidad321.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_32),
				Integer.parseInt(txtCantidad320.getText()), Integer.parseInt(txtCantidad321.getText()),
				txtObs32.getText(), updateFicha, porcentajeAvance, ITEM_MS_32, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad330.getText()),
				Integer.parseInt(txtCantidad331.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_33),
				Integer.parseInt(txtCantidad330.getText()), Integer.parseInt(txtCantidad331.getText()),
				txtObs33.getText(), updateFicha, porcentajeAvance, ITEM_MS_33, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad340.getText()),
				Integer.parseInt(txtCantidad341.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_34),
				Integer.parseInt(txtCantidad340.getText()), Integer.parseInt(txtCantidad341.getText()),
				txtObs34.getText(), updateFicha, porcentajeAvance, ITEM_MS_34, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad350.getText()),
				Integer.parseInt(txtCantidad351.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_35),
				Integer.parseInt(txtCantidad350.getText()), Integer.parseInt(txtCantidad351.getText()),
				txtObs35.getText(), updateFicha, porcentajeAvance, ITEM_MS_35, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad360.getText()),
				Integer.parseInt(txtCantidad361.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_36),
				Integer.parseInt(txtCantidad360.getText()), Integer.parseInt(txtCantidad361.getText()),
				txtObs36.getText(), updateFicha, porcentajeAvance, ITEM_MS_36, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad370.getText()),
				Integer.parseInt(txtCantidad371.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_37),
				Integer.parseInt(txtCantidad370.getText()), Integer.parseInt(txtCantidad371.getText()),
				txtObs37.getText(), updateFicha, porcentajeAvance, ITEM_MS_37, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad380.getText()),
				Integer.parseInt(txtCantidad381.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_38),
				Integer.parseInt(txtCantidad380.getText()), Integer.parseInt(txtCantidad381.getText()),
				txtObs38.getText(), updateFicha, porcentajeAvance, ITEM_MS_38, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad390.getText()),
				Integer.parseInt(txtCantidad391.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_39),
				Integer.parseInt(txtCantidad390.getText()), Integer.parseInt(txtCantidad391.getText()),
				txtObs39.getText(), updateFicha, porcentajeAvance, ITEM_MS_39, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad400.getText()),
				Integer.parseInt(txtCantidad401.getText()));
		detallesFicha.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MS_40),
				Integer.parseInt(txtCantidad400.getText()), Integer.parseInt(txtCantidad401.getText()),
				txtObs40.getText(), updateFicha, porcentajeAvance, ITEM_MS_40, "UNIDAD"));

		return detallesFicha;
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
			txtCantidad171.setText(String.valueOf(listaDetalles.get(17).getDetCantidadEjecutada()));
			txtCantidad181.setText(String.valueOf(listaDetalles.get(18).getDetCantidadEjecutada()));
			txtCantidad191.setText(String.valueOf(listaDetalles.get(19).getDetCantidadEjecutada()));
			txtCantidad201.setText(String.valueOf(listaDetalles.get(20).getDetCantidadEjecutada()));
			txtCantidad211.setText(String.valueOf(listaDetalles.get(21).getDetCantidadEjecutada()));
			txtCantidad221.setText(String.valueOf(listaDetalles.get(22).getDetCantidadEjecutada()));
			txtCantidad231.setText(String.valueOf(listaDetalles.get(23).getDetCantidadEjecutada()));
			txtCantidad241.setText(String.valueOf(listaDetalles.get(24).getDetCantidadEjecutada()));
			txtCantidad251.setText(String.valueOf(listaDetalles.get(25).getDetCantidadEjecutada()));
			txtCantidad261.setText(String.valueOf(listaDetalles.get(26).getDetCantidadEjecutada()));
			txtCantidad271.setText(String.valueOf(listaDetalles.get(27).getDetCantidadEjecutada()));
			txtCantidad281.setText(String.valueOf(listaDetalles.get(28).getDetCantidadEjecutada()));
			txtCantidad291.setText(String.valueOf(listaDetalles.get(29).getDetCantidadEjecutada()));
			txtCantidad301.setText(String.valueOf(listaDetalles.get(30).getDetCantidadEjecutada()));
			txtCantidad311.setText(String.valueOf(listaDetalles.get(31).getDetCantidadEjecutada()));
			txtCantidad321.setText(String.valueOf(listaDetalles.get(32).getDetCantidadEjecutada()));
			txtCantidad331.setText(String.valueOf(listaDetalles.get(33).getDetCantidadEjecutada()));
			txtCantidad341.setText(String.valueOf(listaDetalles.get(34).getDetCantidadEjecutada()));
			txtCantidad351.setText(String.valueOf(listaDetalles.get(35).getDetCantidadEjecutada()));
			txtCantidad361.setText(String.valueOf(listaDetalles.get(36).getDetCantidadEjecutada()));
			txtCantidad371.setText(String.valueOf(listaDetalles.get(37).getDetCantidadEjecutada()));
			txtCantidad381.setText(String.valueOf(listaDetalles.get(38).getDetCantidadEjecutada()));
			txtCantidad391.setText(String.valueOf(listaDetalles.get(39).getDetCantidadEjecutada()));
			txtCantidad401.setText(String.valueOf(listaDetalles.get(40).getDetCantidadEjecutada()));

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
			txtObs17.setText(listaDetalles.get(17).getDetObsRef());
			txtObs18.setText(listaDetalles.get(18).getDetObsRef());
			txtObs19.setText(listaDetalles.get(19).getDetObsRef());
			txtObs20.setText(listaDetalles.get(20).getDetObsRef());
			txtObs21.setText(listaDetalles.get(21).getDetObsRef());
			txtObs22.setText(listaDetalles.get(22).getDetObsRef());
			txtObs23.setText(listaDetalles.get(23).getDetObsRef());
			txtObs24.setText(listaDetalles.get(24).getDetObsRef());
			txtObs25.setText(listaDetalles.get(25).getDetObsRef());
			txtObs26.setText(listaDetalles.get(26).getDetObsRef());
			txtObs27.setText(listaDetalles.get(27).getDetObsRef());
			txtObs28.setText(listaDetalles.get(28).getDetObsRef());
			txtObs29.setText(listaDetalles.get(29).getDetObsRef());
			txtObs30.setText(listaDetalles.get(30).getDetObsRef());
			txtObs31.setText(listaDetalles.get(31).getDetObsRef());
			txtObs32.setText(listaDetalles.get(32).getDetObsRef());
			txtObs33.setText(listaDetalles.get(33).getDetObsRef());
			txtObs34.setText(listaDetalles.get(34).getDetObsRef());
			txtObs35.setText(listaDetalles.get(35).getDetObsRef());
			txtObs36.setText(listaDetalles.get(36).getDetObsRef());
			txtObs37.setText(listaDetalles.get(37).getDetObsRef());
			txtObs38.setText(listaDetalles.get(38).getDetObsRef());
			txtObs39.setText(listaDetalles.get(39).getDetObsRef());
			txtObs40.setText(listaDetalles.get(40).getDetObsRef());
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
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
			txtCantidad171.setText(String.valueOf(0));
			txtCantidad181.setText(String.valueOf(0));
			txtCantidad191.setText(String.valueOf(0));
			txtCantidad201.setText(String.valueOf(0));
			txtCantidad211.setText(String.valueOf(0));
			txtCantidad221.setText(String.valueOf(0));
			txtCantidad231.setText(String.valueOf(0));
			txtCantidad241.setText(String.valueOf(0));
			txtCantidad251.setText(String.valueOf(0));
			txtCantidad261.setText(String.valueOf(0));
			txtCantidad271.setText(String.valueOf(0));
			txtCantidad281.setText(String.valueOf(0));
			txtCantidad291.setText(String.valueOf(0));
			txtCantidad301.setText(String.valueOf(0));
			txtCantidad311.setText(String.valueOf(0));
			txtCantidad321.setText(String.valueOf(0));
			txtCantidad331.setText(String.valueOf(0));
			txtCantidad341.setText(String.valueOf(0));
			txtCantidad351.setText(String.valueOf(0));
			txtCantidad361.setText(String.valueOf(0));
			txtCantidad371.setText(String.valueOf(0));
			txtCantidad381.setText(String.valueOf(0));
			txtCantidad391.setText(String.valueOf(0));
			txtCantidad401.setText(String.valueOf(0));

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
			txtObs17.setText("");
			txtObs18.setText("");
			txtObs19.setText("");
			txtObs20.setText("");
			txtObs21.setText("");
			txtObs22.setText("");
			txtObs23.setText("");
			txtObs24.setText("");
			txtObs25.setText("");
			txtObs26.setText("");
			txtObs27.setText("");
			txtObs28.setText("");
			txtObs29.setText("");
			txtObs30.setText("");
			txtObs31.setText("");
			txtObs32.setText("");
			txtObs33.setText("");
			txtObs34.setText("");
			txtObs35.setText("");
			txtObs36.setText("");
			txtObs37.setText("");
			txtObs38.setText("");
			txtObs39.setText("");
			txtObs40.setText("");
		}
	}
}
