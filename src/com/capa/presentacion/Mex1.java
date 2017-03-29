package com.capa.presentacion;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Mex1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JPanel panel_15;
	private JPanel panel_16;
	private JLabel lblInodoros;
	private JLabel lblUrinarios;
	private JLabel lblLavabos;
	private JLabel lblKitHidrosanitario;
	private JPanel panel_17;
	private JTextField textField_8;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JPanel panel_18;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JLabel label_17;
	private JLabel label_18;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JPanel panel_9;
	private JPanel panel_10;
	private JLabel lblSetDeckWpc_2;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel lblModuloWpcTipo_2;
	private JPanel panel_11;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JPanel panel_12;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JLabel label_8;
	private JLabel label_9;
	private JPanel panel_13;
	private JPanel panel_14;
	private JLabel lblPlantasDecorativas;
	private JLabel lblGravillaSaquillosDe;
	private JLabel lblKitDereas;
	private JPanel panel_23;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_41;
	private JTextField textField_42;
	private JPanel panel_28;
	private JTextField textField_54;
	private JTextField textField_55;
	private JLabel label_20;
	private JLabel label_21;
	private JPanel panel_19;
	private JPanel panel_20;
	private JLabel lblCanchasDeportivasCompuesta;
	private JLabel label_4;
	private JPanel panel_21;
	private JTextField textField_38;
	private JTextField textField_39;
	private JPanel panel_22;
	private JTextField textField_40;
	private JLabel label_6;
	private JLabel label_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mex1 frame = new Mex1();
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
	public Mex1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1321, 742);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());
		contentPane.setLayout(null);
		cabecera.getBtnRegistrar().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("EVENTO BOTON REGISTRAR");
			}
		});

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

		textField_45 = new JTextField();
		textField_45.setColumns(10);
		panel_26.add(textField_45);

		textField_46 = new JTextField();
		textField_46.setColumns(10);
		panel_26.add(textField_46);

		textField_47 = new JTextField();
		textField_47.setColumns(10);
		panel_26.add(textField_47);

		textField_48 = new JTextField();
		textField_48.setColumns(10);
		panel_26.add(textField_48);

		textField_49 = new JTextField();
		textField_49.setColumns(10);
		panel_26.add(textField_49);

		textField_50 = new JTextField();
		textField_50.setColumns(10);
		panel_26.add(textField_50);

		JPanel panel_27 = new JPanel();
		panel_27.setBounds(267, 17, 143, 80);
		panel_24.add(panel_27);
		panel_27.setLayout(new GridLayout(3, 0, 0, 0));

		textField_51 = new JTextField();
		textField_51.setColumns(10);
		panel_27.add(textField_51);

		textField_52 = new JTextField();
		textField_52.setColumns(10);
		panel_27.add(textField_52);

		textField_53 = new JTextField();
		textField_53.setColumns(10);
		panel_27.add(textField_53);

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

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		panel_17.add(textField_8);

		textField_30 = new JTextField();
		textField_30.setColumns(10);
		panel_17.add(textField_30);

		textField_31 = new JTextField();
		textField_31.setColumns(10);
		panel_17.add(textField_31);

		textField_32 = new JTextField();
		textField_32.setColumns(10);
		panel_17.add(textField_32);

		textField_33 = new JTextField();
		textField_33.setColumns(10);
		panel_17.add(textField_33);

		textField_34 = new JTextField();
		textField_34.setColumns(10);
		panel_17.add(textField_34);

		panel_18 = new JPanel();
		panel_18.setBounds(267, 17, 143, 80);
		panel_15.add(panel_18);
		panel_18.setLayout(new GridLayout(3, 0, 0, 0));

		textField_35 = new JTextField();
		textField_35.setColumns(10);
		panel_18.add(textField_35);

		textField_36 = new JTextField();
		textField_36.setColumns(10);
		panel_18.add(textField_36);

		textField_37 = new JTextField();
		textField_37.setColumns(10);
		panel_18.add(textField_37);

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

		textField = new JTextField();
		textField.setColumns(10);
		panel_3.add(textField);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel_3.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_3.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_3.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		panel_3.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		panel_3.add(textField_5);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(267, 17, 143, 80);
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(3, 0, 0, 0));

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		panel_4.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		panel_4.add(textField_7);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		panel_4.add(textField_9);

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

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		panel_7.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		panel_7.add(textField_11);

		textField_12 = new JTextField();
		textField_12.setColumns(10);
		panel_7.add(textField_12);

		textField_13 = new JTextField();
		textField_13.setColumns(10);
		panel_7.add(textField_13);

		textField_14 = new JTextField();
		textField_14.setColumns(10);
		panel_7.add(textField_14);

		textField_15 = new JTextField();
		textField_15.setColumns(10);
		panel_7.add(textField_15);

		JPanel panel_8 = new JPanel();
		panel_8.setBounds(267, 17, 143, 80);
		panel_5.add(panel_8);
		panel_8.setLayout(new GridLayout(3, 0, 0, 0));

		textField_16 = new JTextField();
		textField_16.setColumns(10);
		panel_8.add(textField_16);

		textField_17 = new JTextField();
		textField_17.setColumns(10);
		panel_8.add(textField_17);

		textField_18 = new JTextField();
		textField_18.setColumns(10);
		panel_8.add(textField_18);

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

		textField_19 = new JTextField();
		textField_19.setColumns(10);
		panel_11.add(textField_19);

		textField_20 = new JTextField();
		textField_20.setColumns(10);
		panel_11.add(textField_20);

		textField_21 = new JTextField();
		textField_21.setColumns(10);
		panel_11.add(textField_21);

		textField_22 = new JTextField();
		textField_22.setColumns(10);
		panel_11.add(textField_22);

		textField_23 = new JTextField();
		textField_23.setColumns(10);
		panel_11.add(textField_23);

		textField_24 = new JTextField();
		textField_24.setColumns(10);
		panel_11.add(textField_24);

		panel_12 = new JPanel();
		panel_12.setBounds(267, 17, 143, 80);
		panel_9.add(panel_12);
		panel_12.setLayout(new GridLayout(3, 0, 0, 0));

		textField_25 = new JTextField();
		textField_25.setColumns(10);
		panel_12.add(textField_25);

		textField_26 = new JTextField();
		textField_26.setColumns(10);
		panel_12.add(textField_26);

		textField_27 = new JTextField();
		textField_27.setColumns(10);
		panel_12.add(textField_27);

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

		lblKitDereas = new JLabel("KIT  DE \u00C1REAS VERDES");
		lblKitDereas.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKitDereas.setBounds(3, 1, 211, 14);
		panel_13.add(lblKitDereas);

		panel_23 = new JPanel();
		panel_23.setBounds(210, 17, 55, 46);
		panel_13.add(panel_23);
		panel_23.setLayout(new GridLayout(2, 2, 0, 0));

		textField_28 = new JTextField();
		textField_28.setColumns(10);
		panel_23.add(textField_28);

		textField_29 = new JTextField();
		textField_29.setColumns(10);
		panel_23.add(textField_29);

		textField_41 = new JTextField();
		textField_41.setColumns(10);
		panel_23.add(textField_41);

		textField_42 = new JTextField();
		textField_42.setColumns(10);
		panel_23.add(textField_42);

		panel_28 = new JPanel();
		panel_28.setBounds(267, 17, 143, 46);
		panel_13.add(panel_28);
		panel_28.setLayout(new GridLayout(2, 0, 0, 0));

		textField_54 = new JTextField();
		textField_54.setColumns(10);
		panel_28.add(textField_54);

		textField_55 = new JTextField();
		textField_55.setColumns(10);
		panel_28.add(textField_55);

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

		textField_38 = new JTextField();
		textField_38.setColumns(10);
		panel_21.add(textField_38);

		textField_39 = new JTextField();
		textField_39.setColumns(10);
		panel_21.add(textField_39);

		panel_22 = new JPanel();
		panel_22.setBounds(267, 30, 143, 25);
		panel_19.add(panel_22);
		panel_22.setLayout(new GridLayout(1, 0, 0, 0));

		textField_40 = new JTextField();
		textField_40.setColumns(10);
		panel_22.add(textField_40);

		label_6 = new JLabel("Cantidad");
		label_6.setBounds(210, 1, 55, 14);
		panel_19.add(label_6);

		label_11 = new JLabel("Observaci\u00F3n/Referencia");
		label_11.setBounds(267, 1, 143, 14);
		panel_19.add(label_11);

		InformacionObligatoriaV informacionObligatoriaV = new InformacionObligatoriaV(858, 295);
		panel.add(informacionObligatoriaV.getPnlInformacionObl());

	}
}
