package com.capa.presentacion;

import static com.capa.util.Utilitarios.cargarInfoObligatoria;
import static com.capa.util.Utilitarios.gettCabecera;
import static com.capa.util.Utilitarios.llenarCabecera;
import static com.capa.util.Validaciones.validarInfo;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;

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
import com.capa.negocios.ServicioFicha;
import com.capa.negocios.ServicioInfoObligatoria;

public class MsTemplate extends JFrame {


	private static final long serialVersionUID = 596544013936639490L;
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
	private JTextField txtKEObs2;
	private JTextField txtKEObs3;
	private JTextField txtKEObs4;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_4;
	private JTextField txtALCantidad00;
	private JTextField txtALCantidad01;
	private JTextField txtALObs0;
	private JLabel label_5;
	private JLabel label_8;
	private JTextField txtALCantidad10;
	private JTextField txtALCantidad11;
	private JTextField txtALObs1;
	private JLabel label_9;
	private JTextField txtALCantidad20;
	private JTextField txtALCantidad21;
	private JTextField txtALObs2;
	private JLabel lblTuberaDePvc;
	private JTextField txtALCantidad30;
	private JTextField txtALCantidad31;
	private JTextField txtALObs3;
	private JLabel label_11;
	private JTextField txtALCantidad40;
	private JTextField txtALCantidad41;
	private JTextField txtALObs4;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_10;
	private JLabel label_12;
	private JLabel lblventanaCorrederaCompuesta;
	private JLabel lblPerfilSfTipo;
	private JTextField txtCACantidad40;
	private JTextField txtCACantidad30;
	private JTextField txtCACantidad20;
	private JTextField txtCACantidad10;
	private JTextField txtCACantidad00;
	private JLabel label_15;
	private JTextField txtCACantidad01;
	private JTextField txtCACantidad11;
	private JTextField txtCACantidad21;
	private JTextField txtCACantidad31;
	private JTextField txtCACantidad41;
	private JTextField txtCAObs4;
	private JTextField txtCAObs3;
	private JTextField txtCAObs2;
	private JTextField txtCAObs1;
	private JTextField txtCAObs0;
	private JLabel label_16;
	private JLabel label_13;
	private JLabel lblPerfilSfTipo_1;
	private JLabel lblPanelesTcbx;
	private JLabel lblPanelesVynilPiso;
	private JTextField txtCACantidad70;
	private JTextField txtCACantidad60;
	private JTextField txtCACantidad50;
	private JLabel label_19;
	private JTextField txtCACantidad51;
	private JTextField txtCACantidad61;
	private JTextField txtCACantidad71;
	private JTextField txtCAObs7;
	private JTextField txtCAObs6;
	private JTextField txtCAObs5;
	private JLabel label_20;
	private JLabel lblPanelesEpsPara;
	private JTextField txtCACantidad80;
	private JTextField txtCACantidad81;
	private JTextField txtCAObs8;
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
	private JTextField txtFLCantidad00;
	private JTextField txtFLCantidad01;
	private JTextField txtFLObs0;
	private JLabel label_29;
	private JLabel label_30;
	private JTextField txtFPCantidad20;
	private JTextField txtFPCantidad21;
	private JTextField txtFPCantidad11;
	private JTextField txtFPCantidad00;
	private JTextField txtFPCantidad01;
	private JLabel label_31;
	private JLabel label_32;
	private JTextField txtFPObs0;
	private JTextField txtFPObs1;
	private JTextField txtFPObs2;
	private JLabel label_33;
	private JTextField txtFFCantidad00;
	private JTextField txtFFCantidad01;
	private JTextField txtFFCantidad11;
	private JTextField txtFFCantidad10;
	private JTextField txtFFCantidad20;
	private JTextField txtFFCantidad21;
	private JTextField txtFFCantidad31;
	private JTextField txtFFCantidad30;
	private JTextField txtFFObs3;
	private JTextField txtFFObs2;
	private JTextField txtFFObs1;
	private JTextField txtFFObs0;
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
	private JTextField txtCECantidad00;
	private JTextField txtCECantidad01;
	private JTextField txtCEObs0;
	private JLabel label_49;
	private JTextField txtCEObs1;
	private JTextField txtCECantidad11;
	private JTextField txtCECantidad10;
	private JTextField txtCECantidad20;
	private JTextField txtCECantidad21;
	private JTextField txtCEObs2;
	private JTextField txtCEObs3;
	private JTextField txtCECantidad31;
	private JTextField txtCECantidad30;
	private JTextField txtCECantidad40;
	private JTextField txtCECantidad41;
	private JTextField txtCEObs4;
	private JTextField txtCEObs5;
	private JTextField txtCECantidad51;
	private JTextField txtCECantidad50;
	private JTextField txtCECantidad60;
	private JTextField txtCECantidad61;
	private JTextField txtCEObs6;
	private JTextField txtCEObs7;
	private JTextField txtCECantidad71;
	private JTextField txtCECantidad70;
	private JTextField txtCECantidad80;
	private JTextField txtCECantidad81;
	private JTextField txtCEObs8;
	private JTextField txtCEObs9;
	private JTextField txtCECantidad91;
	private JTextField txtCECantidad90;
	private JTextField txtCECantidad100;
	private JTextField txtCECantidad101;
	private JTextField txtCEObs10;
	private JTextField txtCEObs11;
	private JTextField txtCECantidad111;
	private JTextField txtCECantidad110;
	private JLabel lblCercha;
	private JTextField txtCECantidad120;
	private JTextField txtCECantidad121;
	private JTextField txtCEObs12;
	private JTextField txtFPCantidad10;

	TInformacionObligatoria infor;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MsTemplate frame = new MsTemplate("");
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
	public MsTemplate(String nombre) {
		setTitle(nombre);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1378, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());
		contentPane.setLayout(null);

		llenarCabecera(cabecera);

		this.setResizable(false);
		this.setLocationRelativeTo(null);

		JPanel panel1 = new JPanel();
		panel1.setBorder(new TitledBorder(null, nombre, TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel1.setBounds(10, 127, 1344, 650);
		contentPane.add(panel1);
		panel1.setLayout(null);

		InformacionObligatoriaV informacionObligatoriaV = new InformacionObligatoriaV(858, 380);
		panel1.add(informacionObligatoriaV.getPnlInformacionObl());

		cabecera.getBtnRegistrar().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ServicioInfoObligatoria srvInfoOblig = new ComponenteInfoObligatoria();
				infor = cargarInfoObligatoria(informacionObligatoriaV);

				if (validarInfo(infor)) {
					srvInfoOblig.crear(infor);
				} else {
					JOptionPane.showMessageDialog(null, "Ingresar datos en Información Obligatoria ");
				}
			}
		});

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

		txtKECantidad40 = new JTextField();
		txtKECantidad40.setText("2");
		txtKECantidad40.setEditable(false);
		txtKECantidad40.setColumns(10);
		txtKECantidad40.setBounds(223, 141, 35, 20);
		panel1.add(txtKECantidad40);

		txtKECantidad41 = new JTextField();
		txtKECantidad41.setColumns(10);
		txtKECantidad41.setBounds(260, 141, 35, 20);
		panel1.add(txtKECantidad41);

		txtKECantidad31 = new JTextField();
		txtKECantidad31.setColumns(10);
		txtKECantidad31.setBounds(260, 119, 35, 20);
		panel1.add(txtKECantidad31);

		txtKECantidad30 = new JTextField();
		txtKECantidad30.setText("2");
		txtKECantidad30.setEditable(false);
		txtKECantidad30.setColumns(10);
		txtKECantidad30.setBounds(223, 119, 35, 20);
		panel1.add(txtKECantidad30);

		txtKECantidad20 = new JTextField();
		txtKECantidad20.setText("2");
		txtKECantidad20.setEditable(false);
		txtKECantidad20.setColumns(10);
		txtKECantidad20.setBounds(223, 97, 35, 20);
		panel1.add(txtKECantidad20);

		txtKECantidad21 = new JTextField();
		txtKECantidad21.setColumns(10);
		txtKECantidad21.setBounds(260, 97, 35, 20);
		panel1.add(txtKECantidad21);

		txtKECantidad11 = new JTextField();
		txtKECantidad11.setColumns(10);
		txtKECantidad11.setBounds(260, 75, 35, 20);
		panel1.add(txtKECantidad11);

		txtKECantidad10 = new JTextField();
		txtKECantidad10.setText("16");
		txtKECantidad10.setEditable(false);
		txtKECantidad10.setColumns(10);
		txtKECantidad10.setBounds(223, 75, 35, 20);
		panel1.add(txtKECantidad10);

		txtKECantidad00 = new JTextField();
		txtKECantidad00.setText("18");
		txtKECantidad00.setEditable(false);
		txtKECantidad00.setColumns(10);
		txtKECantidad00.setBounds(223, 53, 35, 20);
		panel1.add(txtKECantidad00);

		txtKECantidad01 = new JTextField();
		txtKECantidad01.setColumns(10);
		txtKECantidad01.setBounds(260, 53, 35, 20);
		panel1.add(txtKECantidad01);

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

		txtKEObs0 = new JTextField();
		txtKEObs0.setColumns(10);
		txtKEObs0.setBounds(305, 53, 129, 20);
		panel1.add(txtKEObs0);

		txtKEObs1 = new JTextField();
		txtKEObs1.setColumns(10);
		txtKEObs1.setBounds(305, 75, 129, 20);
		panel1.add(txtKEObs1);

		txtKEObs2 = new JTextField();
		txtKEObs2.setColumns(10);
		txtKEObs2.setBounds(305, 97, 129, 20);
		panel1.add(txtKEObs2);

		txtKEObs3 = new JTextField();
		txtKEObs3.setColumns(10);
		txtKEObs3.setBounds(305, 119, 129, 20);
		panel1.add(txtKEObs3);

		txtKEObs4 = new JTextField();
		txtKEObs4.setColumns(10);
		txtKEObs4.setBounds(305, 141, 129, 20);
		panel1.add(txtKEObs4);

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

		txtALCantidad00 = new JTextField();
		txtALCantidad00.setText("6");
		txtALCantidad00.setEditable(false);
		txtALCantidad00.setColumns(10);
		txtALCantidad00.setBounds(223, 204, 35, 20);
		panel1.add(txtALCantidad00);

		txtALCantidad01 = new JTextField();
		txtALCantidad01.setColumns(10);
		txtALCantidad01.setBounds(260, 204, 35, 20);
		panel1.add(txtALCantidad01);

		txtALObs0 = new JTextField();
		txtALObs0.setColumns(10);
		txtALObs0.setBounds(305, 204, 129, 20);
		panel1.add(txtALObs0);

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

		txtALCantidad10 = new JTextField();
		txtALCantidad10.setText("4");
		txtALCantidad10.setEditable(false);
		txtALCantidad10.setColumns(10);
		txtALCantidad10.setBounds(223, 247, 35, 20);
		panel1.add(txtALCantidad10);

		txtALCantidad11 = new JTextField();
		txtALCantidad11.setColumns(10);
		txtALCantidad11.setBounds(260, 247, 35, 20);
		panel1.add(txtALCantidad11);

		txtALObs1 = new JTextField();
		txtALObs1.setColumns(10);
		txtALObs1.setBounds(305, 247, 129, 20);
		panel1.add(txtALObs1);

		label_9 = new JLabel("Tuber\u00EDa de PVC 75 mm L=3m");
		label_9.setHorizontalAlignment(SwingConstants.LEFT);
		label_9.setFont(new Font("Arial", Font.PLAIN, 11));
		label_9.setBounds(10, 284, 183, 14);
		panel1.add(label_9);

		txtALCantidad20 = new JTextField();
		txtALCantidad20.setText("3");
		txtALCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtALCantidad20.setEditable(false);
		txtALCantidad20.setColumns(10);
		txtALCantidad20.setBounds(223, 278, 35, 20);
		panel1.add(txtALCantidad20);

		txtALCantidad21 = new JTextField();
		txtALCantidad21.setColumns(10);
		txtALCantidad21.setBounds(260, 278, 35, 20);
		panel1.add(txtALCantidad21);

		txtALObs2 = new JTextField();
		txtALObs2.setColumns(10);
		txtALObs2.setBounds(305, 278, 129, 20);
		panel1.add(txtALObs2);

		lblTuberaDePvc = new JLabel("Tuber\u00EDa de PVC 75 mm L=0.6m");
		lblTuberaDePvc.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberaDePvc.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberaDePvc.setBounds(10, 306, 183, 14);
		panel1.add(lblTuberaDePvc);

		txtALCantidad30 = new JTextField();
		txtALCantidad30.setText("3");
		txtALCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtALCantidad30.setEditable(false);
		txtALCantidad30.setColumns(10);
		txtALCantidad30.setBounds(223, 300, 35, 20);
		panel1.add(txtALCantidad30);

		txtALCantidad31 = new JTextField();
		txtALCantidad31.setColumns(10);
		txtALCantidad31.setBounds(260, 300, 35, 20);
		panel1.add(txtALCantidad31);

		txtALObs3 = new JTextField();
		txtALObs3.setColumns(10);
		txtALObs3.setBounds(305, 300, 129, 20);
		panel1.add(txtALObs3);

		label_11 = new JLabel(
				"<html><body>Kit para conexi\u00F3n de tuber\u00EDa 75 mm. (lija<br>pliego, polipega 1/4gal,1 codo 90\u00B0)</body></html>");
		label_11.setHorizontalAlignment(SwingConstants.LEFT);
		label_11.setFont(new Font("Arial", Font.PLAIN, 11));
		label_11.setBounds(10, 328, 203, 39);
		panel1.add(label_11);

		txtALCantidad40 = new JTextField();
		txtALCantidad40.setText("1");
		txtALCantidad40.setEditable(false);
		txtALCantidad40.setColumns(10);
		txtALCantidad40.setBounds(223, 336, 35, 20);
		panel1.add(txtALCantidad40);

		txtALCantidad41 = new JTextField();
		txtALCantidad41.setColumns(10);
		txtALCantidad41.setBounds(260, 336, 35, 20);
		panel1.add(txtALCantidad41);

		txtALObs4 = new JTextField();
		txtALObs4.setColumns(10);
		txtALObs4.setBounds(305, 336, 129, 20);
		panel1.add(txtALObs4);

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

		txtCACantidad40 = new JTextField();
		txtCACantidad40.setText("24");
		txtCACantidad40.setEditable(false);
		txtCACantidad40.setColumns(10);
		txtCACantidad40.setBounds(223, 519, 35, 20);
		panel1.add(txtCACantidad40);

		txtCACantidad30 = new JTextField();
		txtCACantidad30.setText("6");
		txtCACantidad30.setEditable(false);
		txtCACantidad30.setColumns(10);
		txtCACantidad30.setBounds(223, 480, 35, 20);
		panel1.add(txtCACantidad30);

		txtCACantidad20 = new JTextField();
		txtCACantidad20.setText("6");
		txtCACantidad20.setEditable(false);
		txtCACantidad20.setColumns(10);
		txtCACantidad20.setBounds(223, 444, 35, 20);
		panel1.add(txtCACantidad20);

		txtCACantidad10 = new JTextField();
		txtCACantidad10.setText("6");
		txtCACantidad10.setEditable(false);
		txtCACantidad10.setColumns(10);
		txtCACantidad10.setBounds(223, 422, 35, 20);
		panel1.add(txtCACantidad10);

		txtCACantidad00 = new JTextField();
		txtCACantidad00.setText("2");
		txtCACantidad00.setEditable(false);
		txtCACantidad00.setColumns(10);
		txtCACantidad00.setBounds(223, 400, 35, 20);
		panel1.add(txtCACantidad00);

		label_15 = new JLabel("Cantidad");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("Arial", Font.BOLD, 11));
		label_15.setBounds(226, 378, 63, 14);
		panel1.add(label_15);

		txtCACantidad01 = new JTextField();
		txtCACantidad01.setColumns(10);
		txtCACantidad01.setBounds(260, 400, 35, 20);
		panel1.add(txtCACantidad01);

		txtCACantidad11 = new JTextField();
		txtCACantidad11.setColumns(10);
		txtCACantidad11.setBounds(260, 422, 35, 20);
		panel1.add(txtCACantidad11);

		txtCACantidad21 = new JTextField();
		txtCACantidad21.setColumns(10);
		txtCACantidad21.setBounds(260, 444, 35, 20);
		panel1.add(txtCACantidad21);

		txtCACantidad31 = new JTextField();
		txtCACantidad31.setColumns(10);
		txtCACantidad31.setBounds(260, 480, 35, 20);
		panel1.add(txtCACantidad31);

		txtCACantidad41 = new JTextField();
		txtCACantidad41.setColumns(10);
		txtCACantidad41.setBounds(260, 519, 35, 20);
		panel1.add(txtCACantidad41);

		txtCAObs4 = new JTextField();
		txtCAObs4.setColumns(10);
		txtCAObs4.setBounds(305, 519, 129, 20);
		panel1.add(txtCAObs4);

		txtCAObs3 = new JTextField();
		txtCAObs3.setColumns(10);
		txtCAObs3.setBounds(305, 480, 129, 20);
		panel1.add(txtCAObs3);

		txtCAObs2 = new JTextField();
		txtCAObs2.setColumns(10);
		txtCAObs2.setBounds(305, 444, 129, 20);
		panel1.add(txtCAObs2);

		txtCAObs1 = new JTextField();
		txtCAObs1.setColumns(10);
		txtCAObs1.setBounds(305, 422, 129, 20);
		panel1.add(txtCAObs1);

		txtCAObs0 = new JTextField();
		txtCAObs0.setColumns(10);
		txtCAObs0.setBounds(305, 400, 129, 20);
		panel1.add(txtCAObs0);

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

		txtCACantidad70 = new JTextField();
		txtCACantidad70.setText("354");
		txtCACantidad70.setEditable(false);
		txtCACantidad70.setColumns(10);
		txtCACantidad70.setBounds(661, 97, 35, 20);
		panel1.add(txtCACantidad70);

		txtCACantidad60 = new JTextField();
		txtCACantidad60.setText("2");
		txtCACantidad60.setEditable(false);
		txtCACantidad60.setColumns(10);
		txtCACantidad60.setBounds(661, 75, 35, 20);
		panel1.add(txtCACantidad60);

		txtCACantidad50 = new JTextField();
		txtCACantidad50.setText("8");
		txtCACantidad50.setEditable(false);
		txtCACantidad50.setColumns(10);
		txtCACantidad50.setBounds(661, 53, 35, 20);
		panel1.add(txtCACantidad50);

		label_19 = new JLabel("Cantidad");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("Arial", Font.BOLD, 11));
		label_19.setBounds(664, 31, 63, 14);
		panel1.add(label_19);

		txtCACantidad51 = new JTextField();
		txtCACantidad51.setColumns(10);
		txtCACantidad51.setBounds(698, 53, 35, 20);
		panel1.add(txtCACantidad51);

		txtCACantidad61 = new JTextField();
		txtCACantidad61.setColumns(10);
		txtCACantidad61.setBounds(698, 75, 35, 20);
		panel1.add(txtCACantidad61);

		txtCACantidad71 = new JTextField();
		txtCACantidad71.setColumns(10);
		txtCACantidad71.setBounds(698, 97, 35, 20);
		panel1.add(txtCACantidad71);

		txtCAObs7 = new JTextField();
		txtCAObs7.setColumns(10);
		txtCAObs7.setBounds(743, 97, 129, 20);
		panel1.add(txtCAObs7);

		txtCAObs6 = new JTextField();
		txtCAObs6.setColumns(10);
		txtCAObs6.setBounds(743, 75, 129, 20);
		panel1.add(txtCAObs6);

		txtCAObs5 = new JTextField();
		txtCAObs5.setColumns(10);
		txtCAObs5.setBounds(743, 53, 129, 20);
		panel1.add(txtCAObs5);

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

		txtCACantidad80 = new JTextField();
		txtCACantidad80.setText("18");
		txtCACantidad80.setEditable(false);
		txtCACantidad80.setColumns(10);
		txtCACantidad80.setBounds(661, 119, 35, 20);
		panel1.add(txtCACantidad80);

		txtCACantidad81 = new JTextField();
		txtCACantidad81.setColumns(10);
		txtCACantidad81.setBounds(698, 119, 35, 20);
		panel1.add(txtCACantidad81);

		txtCAObs8 = new JTextField();
		txtCAObs8.setColumns(10);
		txtCAObs8.setBounds(743, 119, 129, 20);
		panel1.add(txtCAObs8);

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

		txtFLCantidad00 = new JTextField();
		txtFLCantidad00.setText("12");
		txtFLCantidad00.setEditable(false);
		txtFLCantidad00.setColumns(10);
		txtFLCantidad00.setBounds(661, 419, 35, 20);
		panel1.add(txtFLCantidad00);

		txtFLCantidad01 = new JTextField();
		txtFLCantidad01.setColumns(10);
		txtFLCantidad01.setBounds(698, 419, 35, 20);
		panel1.add(txtFLCantidad01);

		txtFLObs0 = new JTextField();
		txtFLObs0.setColumns(10);
		txtFLObs0.setBounds(743, 419, 129, 20);
		panel1.add(txtFLObs0);

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

		txtFPCantidad20 = new JTextField();
		txtFPCantidad20.setText("12");
		txtFPCantidad20.setEditable(false);
		txtFPCantidad20.setColumns(10);
		txtFPCantidad20.setBounds(661, 359, 35, 20);
		panel1.add(txtFPCantidad20);

		txtFPCantidad21 = new JTextField();
		txtFPCantidad21.setColumns(10);
		txtFPCantidad21.setBounds(698, 359, 35, 20);
		panel1.add(txtFPCantidad21);

		txtFPCantidad11 = new JTextField();
		txtFPCantidad11.setColumns(10);
		txtFPCantidad11.setBounds(698, 337, 35, 20);
		panel1.add(txtFPCantidad11);

		txtFPCantidad10 = new JTextField();
		txtFPCantidad10.setText("12");
		txtFPCantidad10.setEditable(false);
		txtFPCantidad10.setColumns(10);
		txtFPCantidad10.setBounds(661, 337, 35, 20);
		panel1.add(txtFPCantidad10);

		txtFPCantidad00 = new JTextField();
		txtFPCantidad00.setText("6");
		txtFPCantidad00.setEditable(false);
		txtFPCantidad00.setColumns(10);
		txtFPCantidad00.setBounds(661, 315, 35, 20);
		panel1.add(txtFPCantidad00);

		txtFPCantidad01 = new JTextField();
		txtFPCantidad01.setColumns(10);
		txtFPCantidad01.setBounds(698, 315, 35, 20);
		panel1.add(txtFPCantidad01);

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

		txtFPObs0 = new JTextField();
		txtFPObs0.setColumns(10);
		txtFPObs0.setBounds(743, 315, 129, 20);
		panel1.add(txtFPObs0);

		txtFPObs1 = new JTextField();
		txtFPObs1.setColumns(10);
		txtFPObs1.setBounds(743, 337, 129, 20);
		panel1.add(txtFPObs1);

		txtFPObs2 = new JTextField();
		txtFPObs2.setColumns(10);
		txtFPObs2.setBounds(743, 359, 129, 20);
		panel1.add(txtFPObs2);

		label_33 = new JLabel("Cantidad");
		label_33.setHorizontalAlignment(SwingConstants.CENTER);
		label_33.setFont(new Font("Arial", Font.BOLD, 11));
		label_33.setBounds(664, 164, 63, 14);
		panel1.add(label_33);

		txtFFCantidad00 = new JTextField();
		txtFFCantidad00.setText("10");
		txtFFCantidad00.setEditable(false);
		txtFFCantidad00.setColumns(10);
		txtFFCantidad00.setBounds(661, 186, 35, 20);
		panel1.add(txtFFCantidad00);

		txtFFCantidad01 = new JTextField();
		txtFFCantidad01.setColumns(10);
		txtFFCantidad01.setBounds(698, 186, 35, 20);
		panel1.add(txtFFCantidad01);

		txtFFCantidad11 = new JTextField();
		txtFFCantidad11.setColumns(10);
		txtFFCantidad11.setBounds(698, 208, 35, 20);
		panel1.add(txtFFCantidad11);

		txtFFCantidad10 = new JTextField();
		txtFFCantidad10.setText("2");
		txtFFCantidad10.setEditable(false);
		txtFFCantidad10.setColumns(10);
		txtFFCantidad10.setBounds(661, 208, 35, 20);
		panel1.add(txtFFCantidad10);

		txtFFCantidad20 = new JTextField();
		txtFFCantidad20.setText("2");
		txtFFCantidad20.setEditable(false);
		txtFFCantidad20.setColumns(10);
		txtFFCantidad20.setBounds(661, 230, 35, 20);
		panel1.add(txtFFCantidad20);

		txtFFCantidad21 = new JTextField();
		txtFFCantidad21.setColumns(10);
		txtFFCantidad21.setBounds(698, 230, 35, 20);
		panel1.add(txtFFCantidad21);

		txtFFCantidad31 = new JTextField();
		txtFFCantidad31.setColumns(10);
		txtFFCantidad31.setBounds(698, 252, 35, 20);
		panel1.add(txtFFCantidad31);

		txtFFCantidad30 = new JTextField();
		txtFFCantidad30.setText("6");
		txtFFCantidad30.setEditable(false);
		txtFFCantidad30.setColumns(10);
		txtFFCantidad30.setBounds(661, 252, 35, 20);
		panel1.add(txtFFCantidad30);

		txtFFObs3 = new JTextField();
		txtFFObs3.setColumns(10);
		txtFFObs3.setBounds(743, 252, 129, 20);
		panel1.add(txtFFObs3);

		txtFFObs2 = new JTextField();
		txtFFObs2.setColumns(10);
		txtFFObs2.setBounds(743, 230, 129, 20);
		panel1.add(txtFFObs2);

		txtFFObs1 = new JTextField();
		txtFFObs1.setColumns(10);
		txtFFObs1.setBounds(743, 208, 129, 20);
		panel1.add(txtFFObs1);

		txtFFObs0 = new JTextField();
		txtFFObs0.setColumns(10);
		txtFFObs0.setBounds(743, 186, 129, 20);
		panel1.add(txtFFObs0);

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

		txtCECantidad00 = new JTextField();
		txtCECantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad00.setText("30");
		txtCECantidad00.setEditable(false);
		txtCECantidad00.setColumns(10);
		txtCECantidad00.setBounds(1109, 53, 35, 20);
		panel1.add(txtCECantidad00);

		txtCECantidad01 = new JTextField();
		txtCECantidad01.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad01.setColumns(10);
		txtCECantidad01.setBounds(1146, 53, 35, 20);
		panel1.add(txtCECantidad01);

		txtCEObs0 = new JTextField();
		txtCEObs0.setColumns(10);
		txtCEObs0.setBounds(1191, 53, 129, 20);
		panel1.add(txtCEObs0);

		label_49 = new JLabel("Observaci\u00F3n/Referencia");
		label_49.setHorizontalAlignment(SwingConstants.LEFT);
		label_49.setFont(new Font("Arial", Font.BOLD, 11));
		label_49.setBounds(1185, 31, 139, 14);
		panel1.add(label_49);

		txtCEObs1 = new JTextField();
		txtCEObs1.setColumns(10);
		txtCEObs1.setBounds(1191, 75, 129, 20);
		panel1.add(txtCEObs1);

		txtCECantidad11 = new JTextField();
		txtCECantidad11.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad11.setColumns(10);
		txtCECantidad11.setBounds(1146, 75, 35, 20);
		panel1.add(txtCECantidad11);

		txtCECantidad10 = new JTextField();
		txtCECantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad10.setText("6");
		txtCECantidad10.setEditable(false);
		txtCECantidad10.setColumns(10);
		txtCECantidad10.setBounds(1109, 75, 35, 20);
		panel1.add(txtCECantidad10);

		txtCECantidad20 = new JTextField();
		txtCECantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad20.setText("12");
		txtCECantidad20.setEditable(false);
		txtCECantidad20.setColumns(10);
		txtCECantidad20.setBounds(1109, 97, 35, 20);
		panel1.add(txtCECantidad20);

		txtCECantidad21 = new JTextField();
		txtCECantidad21.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad21.setColumns(10);
		txtCECantidad21.setBounds(1146, 97, 35, 20);
		panel1.add(txtCECantidad21);

		txtCEObs2 = new JTextField();
		txtCEObs2.setColumns(10);
		txtCEObs2.setBounds(1191, 97, 129, 20);
		panel1.add(txtCEObs2);

		txtCEObs3 = new JTextField();
		txtCEObs3.setColumns(10);
		txtCEObs3.setBounds(1191, 119, 129, 20);
		panel1.add(txtCEObs3);

		txtCECantidad31 = new JTextField();
		txtCECantidad31.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad31.setColumns(10);
		txtCECantidad31.setBounds(1146, 119, 35, 20);
		panel1.add(txtCECantidad31);

		txtCECantidad30 = new JTextField();
		txtCECantidad30.setText("54");
		txtCECantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad30.setEditable(false);
		txtCECantidad30.setColumns(10);
		txtCECantidad30.setBounds(1109, 119, 35, 20);
		panel1.add(txtCECantidad30);

		txtCECantidad40 = new JTextField();
		txtCECantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad40.setText("8");
		txtCECantidad40.setEditable(false);
		txtCECantidad40.setColumns(10);
		txtCECantidad40.setBounds(1109, 141, 35, 20);
		panel1.add(txtCECantidad40);

		txtCECantidad41 = new JTextField();
		txtCECantidad41.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad41.setColumns(10);
		txtCECantidad41.setBounds(1146, 141, 35, 20);
		panel1.add(txtCECantidad41);

		txtCEObs4 = new JTextField();
		txtCEObs4.setColumns(10);
		txtCEObs4.setBounds(1191, 141, 129, 20);
		panel1.add(txtCEObs4);

		txtCEObs5 = new JTextField();
		txtCEObs5.setColumns(10);
		txtCEObs5.setBounds(1191, 163, 129, 20);
		panel1.add(txtCEObs5);

		txtCECantidad51 = new JTextField();
		txtCECantidad51.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad51.setColumns(10);
		txtCECantidad51.setBounds(1146, 163, 35, 20);
		panel1.add(txtCECantidad51);

		txtCECantidad50 = new JTextField();
		txtCECantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad50.setText("16");
		txtCECantidad50.setEditable(false);
		txtCECantidad50.setColumns(10);
		txtCECantidad50.setBounds(1109, 163, 35, 20);
		panel1.add(txtCECantidad50);

		txtCECantidad60 = new JTextField();
		txtCECantidad60.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad60.setText("16");
		txtCECantidad60.setEditable(false);
		txtCECantidad60.setColumns(10);
		txtCECantidad60.setBounds(1109, 185, 35, 20);
		panel1.add(txtCECantidad60);

		txtCECantidad61 = new JTextField();
		txtCECantidad61.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad61.setColumns(10);
		txtCECantidad61.setBounds(1146, 185, 35, 20);
		panel1.add(txtCECantidad61);

		txtCEObs6 = new JTextField();
		txtCEObs6.setColumns(10);
		txtCEObs6.setBounds(1191, 185, 129, 20);
		panel1.add(txtCEObs6);

		txtCEObs7 = new JTextField();
		txtCEObs7.setColumns(10);
		txtCEObs7.setBounds(1191, 207, 129, 20);
		panel1.add(txtCEObs7);

		txtCECantidad71 = new JTextField();
		txtCECantidad71.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad71.setColumns(10);
		txtCECantidad71.setBounds(1146, 207, 35, 20);
		panel1.add(txtCECantidad71);

		txtCECantidad70 = new JTextField();
		txtCECantidad70.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad70.setText("4");
		txtCECantidad70.setEditable(false);
		txtCECantidad70.setColumns(10);
		txtCECantidad70.setBounds(1109, 207, 35, 20);
		panel1.add(txtCECantidad70);

		txtCECantidad80 = new JTextField();
		txtCECantidad80.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad80.setText("8");
		txtCECantidad80.setEditable(false);
		txtCECantidad80.setColumns(10);
		txtCECantidad80.setBounds(1109, 229, 35, 20);
		panel1.add(txtCECantidad80);

		txtCECantidad81 = new JTextField();
		txtCECantidad81.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad81.setColumns(10);
		txtCECantidad81.setBounds(1146, 229, 35, 20);
		panel1.add(txtCECantidad81);

		txtCEObs8 = new JTextField();
		txtCEObs8.setColumns(10);
		txtCEObs8.setBounds(1191, 229, 129, 20);
		panel1.add(txtCEObs8);

		txtCEObs9 = new JTextField();
		txtCEObs9.setColumns(10);
		txtCEObs9.setBounds(1191, 251, 129, 20);
		panel1.add(txtCEObs9);

		txtCECantidad91 = new JTextField();
		txtCECantidad91.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad91.setColumns(10);
		txtCECantidad91.setBounds(1146, 251, 35, 20);
		panel1.add(txtCECantidad91);

		txtCECantidad90 = new JTextField();
		txtCECantidad90.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad90.setText("8");
		txtCECantidad90.setEditable(false);
		txtCECantidad90.setColumns(10);
		txtCECantidad90.setBounds(1109, 251, 35, 20);
		panel1.add(txtCECantidad90);

		txtCECantidad100 = new JTextField();
		txtCECantidad100.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad100.setText("12");
		txtCECantidad100.setEditable(false);
		txtCECantidad100.setColumns(10);
		txtCECantidad100.setBounds(1109, 273, 35, 20);
		panel1.add(txtCECantidad100);

		txtCECantidad101 = new JTextField();
		txtCECantidad101.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad101.setColumns(10);
		txtCECantidad101.setBounds(1146, 273, 35, 20);
		panel1.add(txtCECantidad101);

		txtCEObs10 = new JTextField();
		txtCEObs10.setColumns(10);
		txtCEObs10.setBounds(1191, 273, 129, 20);
		panel1.add(txtCEObs10);

		txtCEObs11 = new JTextField();
		txtCEObs11.setColumns(10);
		txtCEObs11.setBounds(1191, 295, 129, 20);
		panel1.add(txtCEObs11);

		txtCECantidad111 = new JTextField();
		txtCECantidad111.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad111.setColumns(10);
		txtCECantidad111.setBounds(1146, 295, 35, 20);
		panel1.add(txtCECantidad111);

		txtCECantidad110 = new JTextField();
		txtCECantidad110.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad110.setText("12");
		txtCECantidad110.setEditable(false);
		txtCECantidad110.setColumns(10);
		txtCECantidad110.setBounds(1109, 295, 35, 20);
		panel1.add(txtCECantidad110);

		lblCercha = new JLabel("Cercha");
		lblCercha.setHorizontalAlignment(SwingConstants.LEFT);
		lblCercha.setFont(new Font("Arial", Font.PLAIN, 11));
		lblCercha.setBounds(896, 350, 203, 14);
		panel1.add(lblCercha);

		txtCECantidad120 = new JTextField();
		txtCECantidad120.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad120.setText("2");
		txtCECantidad120.setEditable(false);
		txtCECantidad120.setColumns(10);
		txtCECantidad120.setBounds(1109, 347, 35, 20);
		panel1.add(txtCECantidad120);

		txtCECantidad121 = new JTextField();
		txtCECantidad121.setHorizontalAlignment(SwingConstants.CENTER);
		txtCECantidad121.setColumns(10);
		txtCECantidad121.setBounds(1146, 347, 35, 20);
		panel1.add(txtCECantidad121);

		txtCEObs12 = new JTextField();
		txtCEObs12.setColumns(10);
		txtCEObs12.setBounds(1191, 347, 129, 20);
		panel1.add(txtCEObs12);

		JLabel label_50 = new JLabel("Perfil SF Tipo 11");
		label_50.setHorizontalAlignment(SwingConstants.LEFT);
		label_50.setFont(new Font("Arial", Font.PLAIN, 11));
		label_50.setBounds(896, 321, 203, 14);
		panel1.add(label_50);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("64");
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(1109, 318, 35, 20);
		panel1.add(textField);

		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(1146, 318, 35, 20);
		panel1.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(1191, 318, 129, 20);
		panel1.add(textField_2);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				new Menu().setVisible(true);
				dispose();
			}
		});
	}

	public LinkedList<LinkedList<TdetalleFicha>> cargarListas() {
		LinkedList<TdetalleFicha> listaElectrico = new LinkedList<>();
		LinkedList<TdetalleFicha> listaLluvia = new LinkedList<>();
		LinkedList<TdetalleFicha> listaArquitectonico = new LinkedList<>();
		LinkedList<TdetalleFicha> listaFrontal = new LinkedList<>();
		LinkedList<TdetalleFicha> listaPosterior = new LinkedList<>();
		LinkedList<TdetalleFicha> listaLateral = new LinkedList<>();
		LinkedList<TdetalleFicha> listaEstructural = new LinkedList<>();
		ServicioFicha servFicha = new ComponenteFicha();
		// infor = cargarInfoObligatoria(inforV);

		TGrupo grupoTmp = servFicha.buscarGrupo("KIT ELÉCTRICO");
		Integer updateFicha = servFicha.buscarUpdateFicha();
		TFicha ficha = null;
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

		grupoTmp = servFicha.buscarGrupo("KIT AGUA LLUVIA");
		listaLluvia.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtALCantidad01.getText()), txtALObs0.getText(), updateFicha));
		listaLluvia.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtALCantidad11.getText()), txtALObs1.getText(), updateFicha));
		listaLluvia.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtALCantidad21.getText()), txtALObs2.getText(), updateFicha));
		listaLluvia.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtALCantidad31.getText()), txtALObs3.getText(), updateFicha));
		listaLluvia.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtALCantidad41.getText()), txtALObs4.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("COMPONENTE ARQUITECTÓNICO");
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

		grupoTmp = servFicha.buscarGrupo("FACHADA FRONTAL");
		listaFrontal.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFFCantidad01.getText()), txtFFObs0.getText(), updateFicha));
		listaFrontal.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFFCantidad11.getText()), txtFFObs1.getText(), updateFicha));
		listaFrontal.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFFCantidad21.getText()), txtFFObs2.getText(), updateFicha));
		listaFrontal.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFFCantidad31.getText()), txtFFObs3.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("FACHADA POSTERIOR");
		listaPosterior.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFPCantidad01.getText()), txtFPObs0.getText(), updateFicha));
		listaPosterior.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFPCantidad11.getText()), txtFPObs1.getText(), updateFicha));
		listaPosterior.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFPCantidad21.getText()), txtFPObs2.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("FACHADA LATERAL");
		listaLateral.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtFLCantidad01.getText()), txtFLObs0.getText(), updateFicha));

		grupoTmp = servFicha.buscarGrupo("COMPONENTE ESTRUCTURAL");
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad01.getText()), txtCEObs0.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad11.getText()), txtCEObs1.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad21.getText()), txtCEObs2.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad31.getText()), txtCEObs3.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad41.getText()), txtCEObs4.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad51.getText()), txtCEObs5.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad61.getText()), txtCEObs6.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad71.getText()), txtCEObs7.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad81.getText()), txtCEObs8.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad91.getText()), txtCEObs9.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad101.getText()), txtCEObs10.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad111.getText()), txtCEObs11.getText(), updateFicha));
		listaEstructural.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, null, 0,
				Integer.parseInt(txtCECantidad121.getText()), txtCEObs12.getText(), updateFicha));

		LinkedList<LinkedList<TdetalleFicha>> listaFormulario = new LinkedList<LinkedList<TdetalleFicha>>();
		listaFormulario.add(listaElectrico);
		listaFormulario.add(listaLluvia);
		listaFormulario.add(listaArquitectonico);
		listaFormulario.add(listaFrontal);
		listaFormulario.add(listaPosterior);
		listaFormulario.add(listaLateral);
		listaFormulario.add(listaEstructural);
		return listaFormulario;
	}
}
