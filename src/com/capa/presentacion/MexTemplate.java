package com.capa.presentacion;

import static com.capa.negocios.Calculos.calcularPorcentajeAvance;
import static com.capa.util.Utilitarios.*;
import static com.capa.util.Validaciones.*;
import static com.capa.util.Constantes.*;

import java.awt.Font;
import java.awt.GridLayout;
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
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
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
import javax.swing.SwingConstants;

public class MexTemplate extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCantidad120;
	private JTextField txtCantidad121;
	private JTextField txtCantidad130;
	private JTextField txtCantidad131;
	private JTextField txtCantidad140;
	private JTextField txtCantidad141;
	private JTextField txtObs12;
	private JTextField txtObs14;
	private JPanel panel_15;
	private JPanel panel_16;
	private JLabel lblInodoros;
	private JLabel lblUrinarios;
	private JLabel lblLavabos;
	private JLabel lblKitHidrosanitario;
	private JPanel panel_17;
	private JTextField txtCantidad00;
	private JTextField txtCantidad01;
	private JTextField txtCantidad10;
	private JTextField txtCantidad11;
	private JTextField txtCantidad20;
	private JTextField txtCantidad21;
	private JPanel panel_18;
	private JTextField txtObs0;
	private JTextField txtObs1;
	private JTextField txtObs2;
	private JLabel label_17;
	private JLabel label_18;
	private JTextField txtCantidad30;
	private JTextField txtCantidad31;
	private JTextField txtCantidad40;
	private JTextField txtCantidad41;
	private JTextField txtCantidad50;
	private JTextField txtCantidad51;
	private JTextField txtObs3;
	private JTextField txtObs4;
	private JTextField txtObs5;
	private JTextField txtCantidad60;
	private JTextField txtCantidad61;
	private JTextField txtCantidad70;
	private JTextField txtCantidad71;
	private JTextField txtCantidad80;
	private JTextField txtCantidad81;
	private JTextField txtObs6;
	private JTextField txtObs7;
	private JTextField txtObs8;
	private JPanel panel_9;
	private JPanel panel_10;
	private JLabel lblSetDeckWpc_2;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel lblModuloWpcTipo_2;
	private JPanel panel_11;
	private JTextField txtCantidad90;
	private JTextField txtCantidad91;
	private JTextField txtCantidad100;
	private JTextField txtCantidad101;
	private JTextField txtCantidad110;
	private JTextField txtCantidad111;
	private JPanel panel_12;
	private JTextField txtObs9;
	private JTextField txtObs10;
	private JTextField txtObs11;
	private JLabel label_8;
	private JLabel label_9;
	private JPanel panel_13;
	private JPanel panel_14;
	private JLabel lblPlantasDecorativas;
	private JLabel lblGravillaSaquillosDe;
	private JLabel lblKitDereas;
	private JPanel panel_23;
	private JTextField txtCantidad160;
	private JTextField txtCantidad161;
	private JTextField txtCantidad170;
	private JTextField txtCantidad171;
	private JPanel panel_28;
	private JTextField txtObs16;
	private JTextField txtObs17;
	private JLabel label_20;
	private JLabel label_21;
	private JPanel panel_19;
	private JPanel panel_20;
	private JLabel lblCanchasDeportivasCompuesta;
	private JLabel label_4;
	private JPanel panel_21;
	private JTextField txtCantidad150;
	private JTextField txtCantidad151;
	private JPanel panel_22;
	private JTextField txtObs15;
	private JLabel label_6;
	private JLabel label_11;
	private JTextField txtObs13;

	TInformacionObligatoria infor;
	TFicha ficha;
	ServicioFicha servFicha;

	private String fotoInfoObl;

	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// MexTemplate frame = new MexTemplate();
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
	public MexTemplate(TFicha ficha) {
		this.ficha = ficha;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 1321, 742);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		this.setTitle(Utilitarios.getNombreFicha() + ficha.getFiNombre());
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		servFicha = new ComponenteFicha();

		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());
		contentPane.setLayout(null);
		llenarCabecera(cabecera);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 126, 1286, 575);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		tabbedPane.addTab("1.-MEX-exteriores", null, panel, null);

		JPanel panel_24 = new JPanel();
		panel_24.setLayout(null);
		panel_24.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_24.setBounds(434, 147, 414, 104);
		panel.add(panel_24);

		JPanel panel_25 = new JPanel();
		panel_25.setBounds(3, 17, 199, 80);
		panel_24.add(panel_25);
		panel_25.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel lblPanelesEpsPared = new JLabel("Set deck WPC TIPO C - a=15 x l=204 cm");
		lblPanelesEpsPared.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_25.add(lblPanelesEpsPared);

		JLabel lblPanelesEpsPared_1 = new JLabel(
				"<html><body>Vigueta pl\u00E1stica con mortero de cemento a=4 x l=1,05</body></html>");
		lblPanelesEpsPared_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_25.add(lblPanelesEpsPared_1);

		JLabel lblPanelesEpsPared_2 = new JLabel(
				"<html><body>Sub-base de piedra triturada tipo A saquillo 50lbs</body></html>");
		lblPanelesEpsPared_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_25.add(lblPanelesEpsPared_2);

		JLabel lblParedesInternas = new JLabel("MODULO WPC TIPO E 204X105 cm");
		lblParedesInternas.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblParedesInternas.setBounds(3, 1, 211, 14);
		panel_24.add(lblParedesInternas);

		JPanel panel_26 = new JPanel();
		panel_26.setBounds(210, 17, 55, 80);
		panel_24.add(panel_26);
		panel_26.setLayout(new GridLayout(3, 2, 0, 0));

		txtCantidad120 = new JTextField();
		txtCantidad120.setText("105");
		txtCantidad120.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad120.setEditable(false);
		txtCantidad120.setColumns(10);
		panel_26.add(txtCantidad120);

		txtCantidad121 = new JTextField();
		txtCantidad121.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad121.setColumns(10);
		panel_26.add(txtCantidad121);
		validarDigitos(txtCantidad121);

		txtCantidad130 = new JTextField();
		txtCantidad130.setText("6");
		txtCantidad130.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad130.setEditable(false);
		txtCantidad130.setColumns(10);
		panel_26.add(txtCantidad130);

		txtCantidad131 = new JTextField();
		txtCantidad131.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad131.setColumns(10);
		panel_26.add(txtCantidad131);
		validarDigitos(txtCantidad131);

		txtCantidad140 = new JTextField();
		txtCantidad140.setText("440");
		txtCantidad140.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad140.setEditable(false);
		txtCantidad140.setColumns(10);
		panel_26.add(txtCantidad140);

		txtCantidad141 = new JTextField();
		txtCantidad141.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad141.setColumns(10);
		panel_26.add(txtCantidad141);
		validarDigitos(txtCantidad141);

		JPanel panel_27 = new JPanel();
		panel_27.setBounds(267, 17, 143, 80);
		panel_24.add(panel_27);
		panel_27.setLayout(new GridLayout(3, 0, 0, 0));

		txtObs12 = new JTextField();
		txtObs12.setColumns(10);
		panel_27.add(txtObs12);

		txtObs13 = new JTextField();
		txtObs13.setColumns(10);
		panel_27.add(txtObs13);

		txtObs14 = new JTextField();
		txtObs14.setColumns(10);
		panel_27.add(txtObs14);

		JLabel label_28 = new JLabel("Cantidad");
		label_28.setBounds(210, 1, 55, 14);
		panel_24.add(label_28);

		JLabel label_29 = new JLabel("Observaci\u00F3n/Referencia");
		label_29.setBounds(267, 1, 143, 14);
		panel_24.add(label_29);

		panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_15.setBounds(10, 4, 414, 104);
		panel.add(panel_15);

		panel_16 = new JPanel();
		panel_16.setBounds(3, 17, 199, 80);
		panel_15.add(panel_16);
		panel_16.setLayout(new GridLayout(3, 0, 0, 0));

		lblInodoros = new JLabel("Set deck WPC TIPO A - a=15 x l=180 cm");
		lblInodoros.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_16.add(lblInodoros);

		lblUrinarios = new JLabel("<html><body>Vigueta pl\u00E1stica con mortero de cemento a=4 x l=1,05</html>");
		lblUrinarios.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_16.add(lblUrinarios);

		lblLavabos = new JLabel("<html><body>Sub-base de piedra triturada tipo A saquillo 50lbs</html>");
		lblLavabos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_16.add(lblLavabos);

		lblKitHidrosanitario = new JLabel("MODULO WPC TIPO A - 180x105 cm");
		lblKitHidrosanitario.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKitHidrosanitario.setBounds(3, 1, 211, 14);
		panel_15.add(lblKitHidrosanitario);

		panel_17 = new JPanel();
		panel_17.setBounds(210, 17, 55, 80);
		panel_15.add(panel_17);
		panel_17.setLayout(new GridLayout(3, 2, 0, 0));

		txtCantidad00 = new JTextField();
		txtCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad00.setText("292");
		txtCantidad00.setEditable(false);
		txtCantidad00.setColumns(10);
		panel_17.add(txtCantidad00);

		txtCantidad01 = new JTextField();
		txtCantidad01.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad01.setColumns(10);
		panel_17.add(txtCantidad01);
		validarDigitos(txtCantidad01);

		txtCantidad10 = new JTextField();
		txtCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad10.setText("5");
		txtCantidad10.setEditable(false);
		txtCantidad10.setColumns(10);
		panel_17.add(txtCantidad10);

		txtCantidad11 = new JTextField();
		txtCantidad11.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad11.setColumns(10);
		panel_17.add(txtCantidad11);
		validarDigitos(txtCantidad11);

		txtCantidad20 = new JTextField();
		txtCantidad20.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtCantidad20.setText("1000");
		txtCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad20.setEditable(false);
		txtCantidad20.setColumns(10);
		panel_17.add(txtCantidad20);

		txtCantidad21 = new JTextField();
		txtCantidad21.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtCantidad21.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad21.setColumns(10);
		panel_17.add(txtCantidad21);
		validarDigitos(txtCantidad21);

		panel_18 = new JPanel();
		panel_18.setBounds(267, 17, 143, 80);
		panel_15.add(panel_18);
		panel_18.setLayout(new GridLayout(3, 0, 0, 0));

		txtObs0 = new JTextField();
		txtObs0.setColumns(10);
		panel_18.add(txtObs0);

		txtObs1 = new JTextField();
		txtObs1.setColumns(10);
		panel_18.add(txtObs1);

		txtObs2 = new JTextField();
		txtObs2.setColumns(10);
		panel_18.add(txtObs2);

		label_17 = new JLabel("Cantidad");
		label_17.setBounds(210, 1, 55, 14);
		panel_15.add(label_17);

		label_18 = new JLabel("Observaci\u00F3n/Referencia");
		label_18.setBounds(267, 1, 143, 14);
		panel_15.add(label_18);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 147, 414, 104);
		panel.add(panel_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(3, 17, 199, 80);
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel lblSetDeckWpc = new JLabel("Set deck WPC TIPO B - a=15 x l=250 cm");
		lblSetDeckWpc.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_2.add(lblSetDeckWpc);

		JLabel lblViguetaPlsticaCon = new JLabel(
				"<html><body>Vigueta pl\u00E1stica con mortero de cemento a=4 x l=1,05</html>");
		lblViguetaPlsticaCon.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_2.add(lblViguetaPlsticaCon);

		JLabel lblSubbaseDePiedra = new JLabel("Sub-base de piedra triturada tipo A");
		lblSubbaseDePiedra.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_2.add(lblSubbaseDePiedra);

		JLabel lblModuloWpcTipo = new JLabel("MODULO WPC TIPO B 250X105 cm");
		lblModuloWpcTipo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblModuloWpcTipo.setBounds(3, 1, 211, 14);
		panel_1.add(lblModuloWpcTipo);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(210, 17, 55, 80);
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(3, 2, 0, 0));

		txtCantidad30 = new JTextField();
		txtCantidad30.setText("77");
		txtCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad30.setEditable(false);
		txtCantidad30.setColumns(10);
		panel_3.add(txtCantidad30);

		txtCantidad31 = new JTextField();
		txtCantidad31.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad31.setColumns(10);
		panel_3.add(txtCantidad31);
		validarDigitos(txtCantidad31);

		txtCantidad40 = new JTextField();
		txtCantidad40.setText("7");
		txtCantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad40.setEditable(false);
		txtCantidad40.setColumns(10);
		panel_3.add(txtCantidad40);

		txtCantidad41 = new JTextField();
		txtCantidad41.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad41.setColumns(10);
		panel_3.add(txtCantidad41);
		validarDigitos(txtCantidad41);

		txtCantidad50 = new JTextField();
		txtCantidad50.setText("400");
		txtCantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad50.setEditable(false);
		txtCantidad50.setColumns(10);
		panel_3.add(txtCantidad50);

		txtCantidad51 = new JTextField();
		txtCantidad51.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad51.setColumns(10);
		panel_3.add(txtCantidad51);
		validarDigitos(txtCantidad51);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(267, 17, 143, 80);
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(3, 0, 0, 0));

		txtObs3 = new JTextField();
		txtObs3.setColumns(10);
		panel_4.add(txtObs3);

		txtObs4 = new JTextField();
		txtObs4.setColumns(10);
		panel_4.add(txtObs4);

		txtObs5 = new JTextField();
		txtObs5.setColumns(10);
		panel_4.add(txtObs5);

		JLabel label_5 = new JLabel("Cantidad");
		label_5.setBounds(210, 1, 55, 14);
		panel_1.add(label_5);

		JLabel label_7 = new JLabel("Observaci\u00F3n/Referencia");
		label_7.setBounds(267, 1, 143, 14);
		panel_1.add(label_7);

		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(10, 292, 414, 104);
		panel.add(panel_5);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(3, 17, 199, 80);
		panel_5.add(panel_6);
		panel_6.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel lblSetDeckWpc_1 = new JLabel("Set deck WPC TIPO C - a=15 x l=240 cm");
		lblSetDeckWpc_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_6.add(lblSetDeckWpc_1);

		JLabel lblViguetaPlsticaCon_1 = new JLabel(
				"<html><body>Vigueta pl\u00E1stica con mortero de cemento a=4 x l=1,05</body></html>");
		lblViguetaPlsticaCon_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_6.add(lblViguetaPlsticaCon_1);

		JLabel lblSubbaseDePiedra_1 = new JLabel(
				"<html><body>Sub-base de piedra triturada tipo A saquillo 50lbs</body></html>");
		lblSubbaseDePiedra_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_6.add(lblSubbaseDePiedra_1);

		JLabel lblModuloWpcTipo_1 = new JLabel("MODULO WPC TIPO C 240X105 cm");
		lblModuloWpcTipo_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblModuloWpcTipo_1.setBounds(3, 1, 211, 14);
		panel_5.add(lblModuloWpcTipo_1);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(210, 17, 55, 80);
		panel_5.add(panel_7);
		panel_7.setLayout(new GridLayout(3, 2, 0, 0));

		txtCantidad60 = new JTextField();
		txtCantidad60.setText("180");
		txtCantidad60.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad60.setEditable(false);
		txtCantidad60.setColumns(10);
		panel_7.add(txtCantidad60);

		txtCantidad61 = new JTextField();
		txtCantidad61.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad61.setColumns(10);
		panel_7.add(txtCantidad61);
		validarDigitos(txtCantidad61);

		txtCantidad70 = new JTextField();
		txtCantidad70.setText("7");
		txtCantidad70.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad70.setEditable(false);
		txtCantidad70.setColumns(10);
		panel_7.add(txtCantidad70);

		txtCantidad71 = new JTextField();
		txtCantidad71.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad71.setColumns(10);
		panel_7.add(txtCantidad71);
		validarDigitos(txtCantidad71);

		txtCantidad80 = new JTextField();
		txtCantidad80.setText("900");
		txtCantidad80.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad80.setEditable(false);
		txtCantidad80.setColumns(10);
		panel_7.add(txtCantidad80);

		txtCantidad81 = new JTextField();
		txtCantidad81.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad81.setColumns(10);
		panel_7.add(txtCantidad81);
		validarDigitos(txtCantidad81);

		JPanel panel_8 = new JPanel();
		panel_8.setBounds(267, 17, 143, 80);
		panel_5.add(panel_8);
		panel_8.setLayout(new GridLayout(3, 0, 0, 0));

		txtObs6 = new JTextField();
		txtObs6.setColumns(10);
		panel_8.add(txtObs6);

		txtObs7 = new JTextField();
		txtObs7.setColumns(10);
		panel_8.add(txtObs7);

		txtObs8 = new JTextField();
		txtObs8.setColumns(10);
		panel_8.add(txtObs8);

		JLabel label_14 = new JLabel("Cantidad");
		label_14.setBounds(210, 1, 55, 14);
		panel_5.add(label_14);

		JLabel label_15 = new JLabel("Observaci\u00F3n/Referencia");
		label_15.setBounds(267, 1, 143, 14);
		panel_5.add(label_15);

		panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_9.setBounds(434, 4, 414, 104);
		panel.add(panel_9);

		panel_10 = new JPanel();
		panel_10.setBounds(3, 17, 199, 80);
		panel_9.add(panel_10);
		panel_10.setLayout(new GridLayout(3, 0, 0, 0));

		lblSetDeckWpc_2 = new JLabel("Set deck WPC TIPO C - a=15 x l=135 cm");
		lblSetDeckWpc_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_10.add(lblSetDeckWpc_2);

		label_2 = new JLabel("<html><body>Vigueta pl\u00E1stica con mortero de cemento a=4 x l=1,05</body></html>");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_10.add(label_2);

		label_3 = new JLabel("<html><body>Sub-base de piedra triturada tipo A saquillo 50lbs</body></html>");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_10.add(label_3);

		lblModuloWpcTipo_2 = new JLabel("MODULO WPC TIPO D 135X105 cm");
		lblModuloWpcTipo_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblModuloWpcTipo_2.setBounds(3, 1, 211, 14);
		panel_9.add(lblModuloWpcTipo_2);

		panel_11 = new JPanel();
		panel_11.setBounds(210, 17, 55, 80);
		panel_9.add(panel_11);
		panel_11.setLayout(new GridLayout(3, 2, 0, 0));

		txtCantidad90 = new JTextField();
		txtCantidad90.setText("104");
		txtCantidad90.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad90.setEditable(false);
		txtCantidad90.setColumns(10);
		panel_11.add(txtCantidad90);

		txtCantidad91 = new JTextField();
		txtCantidad91.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad91.setColumns(10);
		panel_11.add(txtCantidad91);
		validarDigitos(txtCantidad91);

		txtCantidad100 = new JTextField();
		txtCantidad100.setText("4");
		txtCantidad100.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad100.setEditable(false);
		txtCantidad100.setColumns(10);
		panel_11.add(txtCantidad100);

		txtCantidad101 = new JTextField();
		txtCantidad101.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad101.setColumns(10);
		panel_11.add(txtCantidad101);
		validarDigitos(txtCantidad101);

		txtCantidad110 = new JTextField();
		txtCantidad110.setText("300");
		txtCantidad110.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad110.setEditable(false);
		txtCantidad110.setColumns(10);
		panel_11.add(txtCantidad110);

		txtCantidad111 = new JTextField();
		txtCantidad111.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad111.setColumns(10);
		panel_11.add(txtCantidad111);
		validarDigitos(txtCantidad111);
		validarDigitos(txtCantidad111);

		panel_12 = new JPanel();
		panel_12.setBounds(267, 17, 143, 80);
		panel_9.add(panel_12);
		panel_12.setLayout(new GridLayout(3, 0, 0, 0));

		txtObs9 = new JTextField();
		txtObs9.setColumns(10);
		panel_12.add(txtObs9);

		txtObs10 = new JTextField();
		txtObs10.setColumns(10);
		panel_12.add(txtObs10);

		txtObs11 = new JTextField();
		txtObs11.setColumns(10);
		panel_12.add(txtObs11);

		label_8 = new JLabel("Cantidad");
		label_8.setBounds(210, 1, 55, 14);
		panel_9.add(label_8);

		label_9 = new JLabel("Observaci\u00F3n/Referencia");
		label_9.setBounds(267, 1, 143, 14);
		panel_9.add(label_9);

		panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_13.setBounds(434, 419, 414, 64);
		panel.add(panel_13);

		panel_14 = new JPanel();
		panel_14.setBounds(3, 17, 199, 46);
		panel_13.add(panel_14);
		panel_14.setLayout(new GridLayout(2, 0, 0, 0));

		lblPlantasDecorativas = new JLabel("Plantas decorativas");
		lblPlantasDecorativas.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_14.add(lblPlantasDecorativas);

		lblGravillaSaquillosDe = new JLabel("Gravilla saquillos de 50libras");
		lblGravillaSaquillosDe.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_14.add(lblGravillaSaquillosDe);

		lblKitDereas = new JLabel("KIT DE \u00C1REAS VERDES");
		lblKitDereas.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKitDereas.setBounds(3, 1, 211, 14);
		panel_13.add(lblKitDereas);

		panel_23 = new JPanel();
		panel_23.setBounds(210, 17, 55, 46);
		panel_13.add(panel_23);
		panel_23.setLayout(new GridLayout(2, 2, 0, 0));

		txtCantidad160 = new JTextField();
		txtCantidad160.setText("82");
		txtCantidad160.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad160.setEditable(false);
		txtCantidad160.setColumns(10);
		panel_23.add(txtCantidad160);

		txtCantidad161 = new JTextField();
		txtCantidad161.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad161.setColumns(10);
		panel_23.add(txtCantidad161);
		validarDigitos(txtCantidad161);

		txtCantidad170 = new JTextField();
		txtCantidad170.setText("200");
		txtCantidad170.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad170.setEditable(false);
		txtCantidad170.setColumns(10);
		panel_23.add(txtCantidad170);

		txtCantidad171 = new JTextField();
		txtCantidad171.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad171.setColumns(10);
		panel_23.add(txtCantidad171);
		validarDigitos(txtCantidad171);

		panel_28 = new JPanel();
		panel_28.setBounds(267, 17, 143, 46);
		panel_13.add(panel_28);
		panel_28.setLayout(new GridLayout(2, 0, 0, 0));

		txtObs16 = new JTextField();
		txtObs16.setColumns(10);
		panel_28.add(txtObs16);

		txtObs17 = new JTextField();
		txtObs17.setColumns(10);
		panel_28.add(txtObs17);

		label_20 = new JLabel("Cantidad");
		label_20.setBounds(210, 1, 55, 14);
		panel_13.add(label_20);

		label_21 = new JLabel("Observaci\u00F3n/Referencia");
		label_21.setBounds(267, 1, 143, 14);
		panel_13.add(label_21);

		panel_19 = new JPanel();
		panel_19.setLayout(null);
		panel_19.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_19.setBounds(434, 293, 414, 86);
		panel.add(panel_19);

		panel_20 = new JPanel();
		panel_20.setBounds(3, 30, 199, 51);
		panel_19.add(panel_20);
		panel_20.setLayout(new GridLayout(1, 0, 0, 0));

		lblCanchasDeportivasCompuesta = new JLabel(
				"<html><body>Canchas deportivas compuesta de: loseta de contrapiso 7 cm cubierta de granulado de caucho reciclable 13 mm</body></html>");
		lblCanchasDeportivasCompuesta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_20.add(lblCanchasDeportivasCompuesta);

		label_4 = new JLabel("<html><body>M\u00D3DULO DE ESPARCIMIENTO DEPORTIVO</body></html>");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_4.setBounds(3, 1, 176, 28);
		panel_19.add(label_4);

		panel_21 = new JPanel();
		panel_21.setBounds(210, 30, 55, 25);
		panel_19.add(panel_21);
		panel_21.setLayout(new GridLayout(1, 1, 0, 0));

		txtCantidad150 = new JTextField();
		txtCantidad150.setText("2");
		txtCantidad150.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad150.setEditable(false);
		txtCantidad150.setColumns(10);
		panel_21.add(txtCantidad150);

		txtCantidad151 = new JTextField();
		txtCantidad151.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad151.setColumns(10);
		panel_21.add(txtCantidad151);
		validarDigitos(txtCantidad151);

		panel_22 = new JPanel();
		panel_22.setBounds(267, 30, 143, 25);
		panel_19.add(panel_22);
		panel_22.setLayout(new GridLayout(1, 0, 0, 0));

		txtObs15 = new JTextField();
		txtObs15.setColumns(10);
		panel_22.add(txtObs15);

		label_6 = new JLabel("Cantidad");
		label_6.setBounds(210, 1, 55, 14);
		panel_19.add(label_6);

		label_11 = new JLabel("Observaci\u00F3n/Referencia");
		label_11.setBounds(267, 1, 143, 14);
		panel_19.add(label_11);

		JPinformacionObligatoria informacionObligatoriaV = new JPinformacionObligatoria(858, 295);
		informacionObligatoriaV.getBtnInsertarFoto().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				fotoInfoObl = getPathImagen();
			}
		});
		panel.add(informacionObligatoriaV.getPnlInformacionObl());

		llenarFicha();
		cabecera.getBtnRegistrar().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
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
						infor.setIoSerial(srvInfoOblig.serialInfoOblMax());
						servFicha.guardarFormulario(cargarListas());
						HashMap<String, Object> parametros = new HashMap<String, Object>();
						parametros.put("serial_cabecera", Utilitarios.gettCabecera().getCSerial());
						parametros.put("serial_ficha", ficha.getFiSerial());
						Reporte reporte = new Reporte("Reporte Mex", 280, 10, 850, 750);
						InputStream path;

						if (isFichaC1()) {
							path = AlInicio.class.getResourceAsStream("/com/capa/templates/MA.jasper");
						} else {
							path = AlInicio.class.getResourceAsStream("/com/capa/templates/MA-C.jasper");
						}
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
		List<TdetalleFicha> listaDetalles = new LinkedList<>();
		// ServicioInfoObligatoria srvInfoObl = new ComponenteInfoObligatoria();
		// infor.setIoSerial(srvInfoObl.serialInfoOblMax());

		BigDecimal porcentajeAvance;
		TGrupo grupoTmp = servFicha.buscarGrupo("Módulo WPC tipo A - 180x105");
		Integer updateFicha = servFicha.nActualizacionFicha(gettCabecera(), ficha);
		// if (updateFicha == -1) {
		// updateFicha = 0;
		// } else {
		// updateFicha++;
		// }

		if (isFichaC1()) {
			updateFicha++;
		} else {
			servFicha.eliminarDatos();
			updateFicha = -1;
		}

		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad00.getText()),
				Double.parseDouble(txtCantidad01.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MEX_0),
				Integer.parseInt(txtCantidad00.getText()), Integer.parseInt(txtCantidad01.getText()), txtObs0.getText(),
				updateFicha, porcentajeAvance, ITEM_MEX_0, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad10.getText()),
				Double.parseDouble(txtCantidad11.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MEX_1),
				Integer.parseInt(txtCantidad10.getText()), Integer.parseInt(txtCantidad11.getText()), txtObs1.getText(),
				updateFicha, porcentajeAvance, ITEM_MEX_1, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad20.getText()),
				Double.parseDouble(txtCantidad21.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MEX_2),
				Integer.parseInt(txtCantidad20.getText()), Integer.parseInt(txtCantidad21.getText()), txtObs2.getText(),
				updateFicha, porcentajeAvance, ITEM_MEX_2, "UNIDAD"));

		grupoTmp = servFicha.buscarGrupo("Módulo WPC tipo B - 250x105");
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad30.getText()),
				Double.parseDouble(txtCantidad31.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MEX_3),
				Integer.parseInt(txtCantidad30.getText()), Integer.parseInt(txtCantidad31.getText()), txtObs3.getText(),
				updateFicha, porcentajeAvance, ITEM_MEX_3, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad40.getText()),
				Double.parseDouble(txtCantidad41.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MEX_4),
				Integer.parseInt(txtCantidad40.getText()), Integer.parseInt(txtCantidad41.getText()), txtObs4.getText(),
				updateFicha, porcentajeAvance, ITEM_MEX_4, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad50.getText()),
				Double.parseDouble(txtCantidad51.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MEX_5),
				Integer.parseInt(txtCantidad50.getText()), Integer.parseInt(txtCantidad51.getText()), txtObs5.getText(),
				updateFicha, porcentajeAvance, ITEM_MEX_5, "UNIDAD"));

		grupoTmp = servFicha.buscarGrupo("Módulo WPC tipo C - 240x105");
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad60.getText()),
				Double.parseDouble(txtCantidad61.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MEX_6),
				Integer.parseInt(txtCantidad60.getText()), Integer.parseInt(txtCantidad61.getText()), txtObs6.getText(),
				updateFicha, porcentajeAvance, ITEM_MEX_6, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad70.getText()),
				Double.parseDouble(txtCantidad71.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MEX_7),
				Integer.parseInt(txtCantidad70.getText()), Integer.parseInt(txtCantidad71.getText()), txtObs7.getText(),
				updateFicha, porcentajeAvance, ITEM_MEX_7, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad80.getText()),
				Double.parseDouble(txtCantidad81.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MEX_8),
				Integer.parseInt(txtCantidad80.getText()), Integer.parseInt(txtCantidad81.getText()), txtObs8.getText(),
				updateFicha, porcentajeAvance, ITEM_MEX_8, "UNIDAD"));

		grupoTmp = servFicha.buscarGrupo("Módulo WPC tipo D - 135x105");
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad90.getText()),
				Double.parseDouble(txtCantidad91.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MEX_9),
				Integer.parseInt(txtCantidad90.getText()), Integer.parseInt(txtCantidad91.getText()), txtObs9.getText(),
				updateFicha, porcentajeAvance, ITEM_MEX_9, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad100.getText()),
				Double.parseDouble(txtCantidad101.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MEX_10),
				Integer.parseInt(txtCantidad100.getText()), Integer.parseInt(txtCantidad101.getText()),
				txtObs10.getText(), updateFicha, porcentajeAvance, ITEM_MEX_10, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad110.getText()),
				Double.parseDouble(txtCantidad111.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MEX_11),
				Integer.parseInt(txtCantidad110.getText()), Integer.parseInt(txtCantidad111.getText()),
				txtObs11.getText(), updateFicha, porcentajeAvance, ITEM_MEX_11, "UNIDAD"));

		grupoTmp = servFicha.buscarGrupo("Módulo WPC tipo E - 204x105");
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad120.getText()),
				Double.parseDouble(txtCantidad121.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MEX_12),
				Integer.parseInt(txtCantidad120.getText()), Integer.parseInt(txtCantidad121.getText()),
				txtObs12.getText(), updateFicha, porcentajeAvance, ITEM_MEX_12, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad130.getText()),
				Double.parseDouble(txtCantidad131.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MEX_13),
				Integer.parseInt(txtCantidad130.getText()), Integer.parseInt(txtCantidad131.getText()),
				txtObs13.getText(), updateFicha, porcentajeAvance, ITEM_MEX_13, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad140.getText()),
				Double.parseDouble(txtCantidad141.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MEX_14),
				Integer.parseInt(txtCantidad140.getText()), Integer.parseInt(txtCantidad141.getText()),
				txtObs14.getText(), updateFicha, porcentajeAvance, ITEM_MEX_14, "UNIDAD"));

		grupoTmp = servFicha.buscarGrupo("Módulo de esparcimiento deportivo");
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad150.getText()),
				Double.parseDouble(txtCantidad151.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MEX_15),
				Integer.parseInt(txtCantidad150.getText()), Integer.parseInt(txtCantidad151.getText()),
				txtObs15.getText(), updateFicha, porcentajeAvance, ITEM_MEX_15, "UNIDAD"));

		grupoTmp = servFicha.buscarGrupo("Kit de áreas verdes");
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad160.getText()),
				Double.parseDouble(txtCantidad161.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MEX_16),
				Integer.parseInt(txtCantidad160.getText()), Integer.parseInt(txtCantidad161.getText()),
				txtObs16.getText(), updateFicha, porcentajeAvance, ITEM_MEX_16, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Double.parseDouble(txtCantidad170.getText()),
				Double.parseDouble(txtCantidad171.getText()));
		listaDetalles.add(new TdetalleFicha(gettCabecera(), infor, grupoTmp, ficha, quitarEtiquetasHTML(LBL_MEX_17),
				Integer.parseInt(txtCantidad170.getText()), Integer.parseInt(txtCantidad171.getText()),
				txtObs17.getText(), updateFicha, porcentajeAvance, ITEM_MEX_17, "UNIDAD"));

		return listaDetalles;
	}

	public void llenarFicha() {
		List<TdetalleFicha> listaDetalles = servFicha.detallesFicha(gettCabecera(), ficha);
		if (isFichaC1()) {
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
			} catch (IndexOutOfBoundsException e) {
				// TODO: handle exception
				llenarVacios();
			}
		} else {
			llenarVacios();
		}
	}

	public void llenarVacios() {
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
		txtCantidad171.setText(String.valueOf(0));

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
	}
}
