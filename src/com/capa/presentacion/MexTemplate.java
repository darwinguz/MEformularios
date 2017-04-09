package com.capa.presentacion;

import java.awt.EventQueue;
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

import static com.capa.util.Utilitarios.*;
import static com.capa.util.Validaciones.*;

public class MexTemplate extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtWPECantidad00;
	private JTextField txtWPECantidad01;
	private JTextField txtWPECantidad10;
	private JTextField txtWPECantidad11;
	private JTextField txtWPECantidad20;
	private JTextField txtWPECantidad21;
	private JTextField txtWPEObs0;
	private JTextField txtWPEObs2;
	private JPanel panel_15;
	private JPanel panel_16;
	private JLabel lblInodoros;
	private JLabel lblUrinarios;
	private JLabel lblLavabos;
	private JLabel lblKitHidrosanitario;
	private JPanel panel_17;
	private JTextField txtWPACantidad00;
	private JTextField txtWPACantidad01;
	private JTextField txtWPACantidad10;
	private JTextField txtWPCAantidad11;
	private JTextField txtWPACantidad20;
	private JTextField txtWPACantidad21;
	private JPanel panel_18;
	private JTextField txtWPAObs0;
	private JTextField txtWPAObs2;
	private JTextField txtWPAObs3;
	private JLabel label_17;
	private JLabel label_18;
	private JTextField txtWPBCantidad00;
	private JTextField txtWPBCantidad01;
	private JTextField txtWPBCantidad10;
	private JTextField txtWPBCantidad11;
	private JTextField txtWPBCantidad20;
	private JTextField txtWPBCantidad21;
	private JTextField txtWPBObs0;
	private JTextField txtWPBObs1;
	private JTextField txtWPBObs2;
	private JTextField txtWPCCantidad00;
	private JTextField txtWPCCantidad01;
	private JTextField txtWPCCantidad10;
	private JTextField txtWPCCantidad11;
	private JTextField txtWPCCantidad20;
	private JTextField txtWPCCantidad21;
	private JTextField txtWPCObs0;
	private JTextField txtWPCObs1;
	private JTextField txtWPCObs2;
	private JPanel panel_9;
	private JPanel panel_10;
	private JLabel lblSetDeckWpc_2;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel lblModuloWpcTipo_2;
	private JPanel panel_11;
	private JTextField txtWPDCantidad00;
	private JTextField txtWPDCantidad01;
	private JTextField txtWPDCantidad10;
	private JTextField txtWPDCantidad11;
	private JTextField txtWPDCantidad20;
	private JTextField txtWPDCantidad21;
	private JPanel panel_12;
	private JTextField txtWPDObs0;
	private JTextField txtWPDObs1;
	private JTextField txtWPDObs2;
	private JLabel label_8;
	private JLabel label_9;
	private JPanel panel_13;
	private JPanel panel_14;
	private JLabel lblPlantasDecorativas;
	private JLabel lblGravillaSaquillosDe;
	private JLabel lblKitDereas;
	private JPanel panel_23;
	private JTextField txtAVCantidad00;
	private JTextField txtAVCantidad01;
	private JTextField txtAVCantidad10;
	private JTextField txtAVCantidad11;
	private JPanel panel_28;
	private JTextField txtAVObs0;
	private JTextField txtAVObs1;
	private JLabel label_20;
	private JLabel label_21;
	private JPanel panel_19;
	private JPanel panel_20;
	private JLabel lblCanchasDeportivasCompuesta;
	private JLabel label_4;
	private JPanel panel_21;
	private JTextField txtEDCantidad00;
	private JTextField txtEDCantidad01;
	private JPanel panel_22;
	private JTextField txtEDObs0;
	private JLabel label_6;
	private JLabel label_11;
	private JTextField txtWPEObs1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MexTemplate frame = new MexTemplate();
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
	public MexTemplate() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 1321, 742);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		this.setTitle("MEX");
		this.setLocationRelativeTo(null);
		this.setResizable(false);

		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());
		contentPane.setLayout(null);
		llenarCabecera(cabecera);
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

		txtWPECantidad00 = new JTextField();
		txtWPECantidad00.setEditable(false);
		txtWPECantidad00.setColumns(10);
		panel_26.add(txtWPECantidad00);

		txtWPECantidad01 = new JTextField();
		txtWPECantidad01.setColumns(10);
		panel_26.add(txtWPECantidad01);

		txtWPECantidad10 = new JTextField();
		txtWPECantidad10.setEditable(false);
		txtWPECantidad10.setColumns(10);
		panel_26.add(txtWPECantidad10);

		txtWPECantidad11 = new JTextField();
		txtWPECantidad11.setColumns(10);
		panel_26.add(txtWPECantidad11);

		txtWPECantidad20 = new JTextField();
		txtWPECantidad20.setEditable(false);
		txtWPECantidad20.setColumns(10);
		panel_26.add(txtWPECantidad20);

		txtWPECantidad21 = new JTextField();
		txtWPECantidad21.setColumns(10);
		panel_26.add(txtWPECantidad21);

		JPanel panel_27 = new JPanel();
		panel_27.setBounds(267, 17, 143, 80);
		panel_24.add(panel_27);
		panel_27.setLayout(new GridLayout(3, 0, 0, 0));

		txtWPEObs0 = new JTextField();
		txtWPEObs0.setColumns(10);
		panel_27.add(txtWPEObs0);

		txtWPEObs1 = new JTextField();
		txtWPEObs1.setColumns(10);
		panel_27.add(txtWPEObs1);

		txtWPEObs2 = new JTextField();
		txtWPEObs2.setColumns(10);
		panel_27.add(txtWPEObs2);

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

		txtWPACantidad00 = new JTextField();
		txtWPACantidad00.setEditable(false);
		txtWPACantidad00.setColumns(10);
		panel_17.add(txtWPACantidad00);

		txtWPACantidad01 = new JTextField();
		txtWPACantidad01.setColumns(10);
		panel_17.add(txtWPACantidad01);

		txtWPACantidad10 = new JTextField();
		txtWPACantidad10.setEditable(false);
		txtWPACantidad10.setColumns(10);
		panel_17.add(txtWPACantidad10);

		txtWPCAantidad11 = new JTextField();
		txtWPCAantidad11.setColumns(10);
		panel_17.add(txtWPCAantidad11);

		txtWPACantidad20 = new JTextField();
		txtWPACantidad20.setEditable(false);
		txtWPACantidad20.setColumns(10);
		panel_17.add(txtWPACantidad20);

		txtWPACantidad21 = new JTextField();
		txtWPACantidad21.setColumns(10);
		panel_17.add(txtWPACantidad21);

		panel_18 = new JPanel();
		panel_18.setBounds(267, 17, 143, 80);
		panel_15.add(panel_18);
		panel_18.setLayout(new GridLayout(3, 0, 0, 0));

		txtWPAObs0 = new JTextField();
		txtWPAObs0.setColumns(10);
		panel_18.add(txtWPAObs0);

		txtWPAObs2 = new JTextField();
		txtWPAObs2.setColumns(10);
		panel_18.add(txtWPAObs2);

		txtWPAObs3 = new JTextField();
		txtWPAObs3.setColumns(10);
		panel_18.add(txtWPAObs3);

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

		txtWPBCantidad00 = new JTextField();
		txtWPBCantidad00.setEditable(false);
		txtWPBCantidad00.setColumns(10);
		panel_3.add(txtWPBCantidad00);

		txtWPBCantidad01 = new JTextField();
		txtWPBCantidad01.setColumns(10);
		panel_3.add(txtWPBCantidad01);

		txtWPBCantidad10 = new JTextField();
		txtWPBCantidad10.setEditable(false);
		txtWPBCantidad10.setColumns(10);
		panel_3.add(txtWPBCantidad10);

		txtWPBCantidad11 = new JTextField();
		txtWPBCantidad11.setColumns(10);
		panel_3.add(txtWPBCantidad11);

		txtWPBCantidad20 = new JTextField();
		txtWPBCantidad20.setEditable(false);
		txtWPBCantidad20.setColumns(10);
		panel_3.add(txtWPBCantidad20);

		txtWPBCantidad21 = new JTextField();
		txtWPBCantidad21.setColumns(10);
		panel_3.add(txtWPBCantidad21);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(267, 17, 143, 80);
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(3, 0, 0, 0));

		txtWPBObs0 = new JTextField();
		txtWPBObs0.setColumns(10);
		panel_4.add(txtWPBObs0);

		txtWPBObs1 = new JTextField();
		txtWPBObs1.setColumns(10);
		panel_4.add(txtWPBObs1);

		txtWPBObs2 = new JTextField();
		txtWPBObs2.setColumns(10);
		panel_4.add(txtWPBObs2);

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

		txtWPCCantidad00 = new JTextField();
		txtWPCCantidad00.setEditable(false);
		txtWPCCantidad00.setColumns(10);
		panel_7.add(txtWPCCantidad00);

		txtWPCCantidad01 = new JTextField();
		txtWPCCantidad01.setColumns(10);
		panel_7.add(txtWPCCantidad01);

		txtWPCCantidad10 = new JTextField();
		txtWPCCantidad10.setEditable(false);
		txtWPCCantidad10.setColumns(10);
		panel_7.add(txtWPCCantidad10);

		txtWPCCantidad11 = new JTextField();
		txtWPCCantidad11.setColumns(10);
		panel_7.add(txtWPCCantidad11);

		txtWPCCantidad20 = new JTextField();
		txtWPCCantidad20.setEditable(false);
		txtWPCCantidad20.setColumns(10);
		panel_7.add(txtWPCCantidad20);

		txtWPCCantidad21 = new JTextField();
		txtWPCCantidad21.setColumns(10);
		panel_7.add(txtWPCCantidad21);

		JPanel panel_8 = new JPanel();
		panel_8.setBounds(267, 17, 143, 80);
		panel_5.add(panel_8);
		panel_8.setLayout(new GridLayout(3, 0, 0, 0));

		txtWPCObs0 = new JTextField();
		txtWPCObs0.setColumns(10);
		panel_8.add(txtWPCObs0);

		txtWPCObs1 = new JTextField();
		txtWPCObs1.setColumns(10);
		panel_8.add(txtWPCObs1);

		txtWPCObs2 = new JTextField();
		txtWPCObs2.setColumns(10);
		panel_8.add(txtWPCObs2);

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

		txtWPDCantidad00 = new JTextField();
		txtWPDCantidad00.setEditable(false);
		txtWPDCantidad00.setColumns(10);
		panel_11.add(txtWPDCantidad00);

		txtWPDCantidad01 = new JTextField();
		txtWPDCantidad01.setColumns(10);
		panel_11.add(txtWPDCantidad01);

		txtWPDCantidad10 = new JTextField();
		txtWPDCantidad10.setEditable(false);
		txtWPDCantidad10.setColumns(10);
		panel_11.add(txtWPDCantidad10);

		txtWPDCantidad11 = new JTextField();
		txtWPDCantidad11.setColumns(10);
		panel_11.add(txtWPDCantidad11);

		txtWPDCantidad20 = new JTextField();
		txtWPDCantidad20.setEditable(false);
		txtWPDCantidad20.setColumns(10);
		panel_11.add(txtWPDCantidad20);

		txtWPDCantidad21 = new JTextField();
		txtWPDCantidad21.setColumns(10);
		panel_11.add(txtWPDCantidad21);

		panel_12 = new JPanel();
		panel_12.setBounds(267, 17, 143, 80);
		panel_9.add(panel_12);
		panel_12.setLayout(new GridLayout(3, 0, 0, 0));

		txtWPDObs0 = new JTextField();
		txtWPDObs0.setColumns(10);
		panel_12.add(txtWPDObs0);

		txtWPDObs1 = new JTextField();
		txtWPDObs1.setColumns(10);
		panel_12.add(txtWPDObs1);

		txtWPDObs2 = new JTextField();
		txtWPDObs2.setColumns(10);
		panel_12.add(txtWPDObs2);

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

		txtAVCantidad00 = new JTextField();
		txtAVCantidad00.setEditable(false);
		txtAVCantidad00.setColumns(10);
		panel_23.add(txtAVCantidad00);

		txtAVCantidad01 = new JTextField();
		txtAVCantidad01.setColumns(10);
		panel_23.add(txtAVCantidad01);

		txtAVCantidad10 = new JTextField();
		txtAVCantidad10.setEditable(false);
		txtAVCantidad10.setColumns(10);
		panel_23.add(txtAVCantidad10);

		txtAVCantidad11 = new JTextField();
		txtAVCantidad11.setColumns(10);
		panel_23.add(txtAVCantidad11);

		panel_28 = new JPanel();
		panel_28.setBounds(267, 17, 143, 46);
		panel_13.add(panel_28);
		panel_28.setLayout(new GridLayout(2, 0, 0, 0));

		txtAVObs0 = new JTextField();
		txtAVObs0.setColumns(10);
		panel_28.add(txtAVObs0);

		txtAVObs1 = new JTextField();
		txtAVObs1.setColumns(10);
		panel_28.add(txtAVObs1);

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

		txtEDCantidad00 = new JTextField();
		txtEDCantidad00.setEditable(false);
		txtEDCantidad00.setColumns(10);
		panel_21.add(txtEDCantidad00);

		txtEDCantidad01 = new JTextField();
		txtEDCantidad01.setColumns(10);
		panel_21.add(txtEDCantidad01);

		panel_22 = new JPanel();
		panel_22.setBounds(267, 30, 143, 25);
		panel_19.add(panel_22);
		panel_22.setLayout(new GridLayout(1, 0, 0, 0));

		txtEDObs0 = new JTextField();
		txtEDObs0.setColumns(10);
		panel_22.add(txtEDObs0);

		label_6 = new JLabel("Cantidad");
		label_6.setBounds(210, 1, 55, 14);
		panel_19.add(label_6);

		label_11 = new JLabel("Observaci\u00F3n/Referencia");
		label_11.setBounds(267, 1, 143, 14);
		panel_19.add(label_11);

		InformacionObligatoriaV informacionObligatoriaV = new InformacionObligatoriaV(858, 295);
		panel.add(informacionObligatoriaV.getPnlInformacionObl());

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				new Menu().setVisible(true);
				dispose();
			}
		});
	}

	public JTextField getTxtWPECantidad01() {
		return txtWPECantidad01;
	}

	public void setTxtWPECantidad01(JTextField txtWPECantidad01) {
		this.txtWPECantidad01 = txtWPECantidad01;
	}

	public JTextField getTxtWPECantidad11() {
		return txtWPECantidad11;
	}

	public void setTxtWPECantidad11(JTextField txtWPECantidad11) {
		this.txtWPECantidad11 = txtWPECantidad11;
	}

	public JTextField getTxtWPECantidad21() {
		return txtWPECantidad21;
	}

	public void setTxtWPECantidad21(JTextField txtWPECantidad21) {
		this.txtWPECantidad21 = txtWPECantidad21;
	}

	public JTextField getTxtWPEObs0() {
		return txtWPEObs0;
	}

	public void setTxtWPEObs0(JTextField txtWPEObs0) {
		this.txtWPEObs0 = txtWPEObs0;
	}

	public JTextField getTxtWPEObs2() {
		return txtWPEObs2;
	}

	public void setTxtWPEObs2(JTextField txtWPEObs2) {
		this.txtWPEObs2 = txtWPEObs2;
	}

	public JTextField getTxtWPACantidad01() {
		return txtWPACantidad01;
	}

	public void setTxtWPACantidad01(JTextField txtWPACantidad01) {
		this.txtWPACantidad01 = txtWPACantidad01;
	}

	public JTextField getTxtWPCAantidad11() {
		return txtWPCAantidad11;
	}

	public void setTxtWPCAantidad11(JTextField txtWPCAantidad11) {
		this.txtWPCAantidad11 = txtWPCAantidad11;
	}

	public JTextField getTxtWPACantidad21() {
		return txtWPACantidad21;
	}

	public void setTxtWPACantidad21(JTextField txtWPACantidad21) {
		this.txtWPACantidad21 = txtWPACantidad21;
	}

	public JTextField getTxtWPAObs0() {
		return txtWPAObs0;
	}

	public void setTxtWPAObs0(JTextField txtWPAObs0) {
		this.txtWPAObs0 = txtWPAObs0;
	}

	public JTextField getTxtWPAObs2() {
		return txtWPAObs2;
	}

	public void setTxtWPAObs2(JTextField txtWPAObs2) {
		this.txtWPAObs2 = txtWPAObs2;
	}

	public JTextField getTxtWPAObs3() {
		return txtWPAObs3;
	}

	public void setTxtWPAObs3(JTextField txtWPAObs3) {
		this.txtWPAObs3 = txtWPAObs3;
	}

	public JTextField getTxtWPBCantidad01() {
		return txtWPBCantidad01;
	}

	public void setTxtWPBCantidad01(JTextField txtWPBCantidad01) {
		this.txtWPBCantidad01 = txtWPBCantidad01;
	}

	public JTextField getTxtWPBCantidad11() {
		return txtWPBCantidad11;
	}

	public void setTxtWPBCantidad11(JTextField txtWPBCantidad11) {
		this.txtWPBCantidad11 = txtWPBCantidad11;
	}

	public JTextField getTxtWPBCantidad21() {
		return txtWPBCantidad21;
	}

	public void setTxtWPBCantidad21(JTextField txtWPBCantidad21) {
		this.txtWPBCantidad21 = txtWPBCantidad21;
	}

	public JTextField getTxtWPBObs0() {
		return txtWPBObs0;
	}

	public void setTxtWPBObs0(JTextField txtWPBObs0) {
		this.txtWPBObs0 = txtWPBObs0;
	}

	public JTextField getTxtWPBObs1() {
		return txtWPBObs1;
	}

	public void setTxtWPBObs1(JTextField txtWPBObs1) {
		this.txtWPBObs1 = txtWPBObs1;
	}

	public JTextField getTxtWPBObs2() {
		return txtWPBObs2;
	}

	public void setTxtWPBObs2(JTextField txtWPBObs2) {
		this.txtWPBObs2 = txtWPBObs2;
	}

	public JTextField getTxtWPCCantidad01() {
		return txtWPCCantidad01;
	}

	public void setTxtWPCCantidad01(JTextField txtWPCCantidad01) {
		this.txtWPCCantidad01 = txtWPCCantidad01;
	}

	public JTextField getTxtWPCCantidad11() {
		return txtWPCCantidad11;
	}

	public void setTxtWPCCantidad11(JTextField txtWPCCantidad11) {
		this.txtWPCCantidad11 = txtWPCCantidad11;
	}

	public JTextField getTxtWPCCantidad21() {
		return txtWPCCantidad21;
	}

	public void setTxtWPCCantidad21(JTextField txtWPCCantidad21) {
		this.txtWPCCantidad21 = txtWPCCantidad21;
	}

	public JTextField getTxtWPCObs0() {
		return txtWPCObs0;
	}

	public void setTxtWPCObs0(JTextField txtWPCObs0) {
		this.txtWPCObs0 = txtWPCObs0;
	}

	public JTextField getTxtWPCObs1() {
		return txtWPCObs1;
	}

	public void setTxtWPCObs1(JTextField txtWPCObs1) {
		this.txtWPCObs1 = txtWPCObs1;
	}

	public JTextField getTxtWPCObs2() {
		return txtWPCObs2;
	}

	public void setTxtWPCObs2(JTextField txtWPCObs2) {
		this.txtWPCObs2 = txtWPCObs2;
	}

	public JTextField getTxtWPDCantidad01() {
		return txtWPDCantidad01;
	}

	public void setTxtWPDCantidad01(JTextField txtWPDCantidad01) {
		this.txtWPDCantidad01 = txtWPDCantidad01;
	}

	public JTextField getTxtWPDCantidad11() {
		return txtWPDCantidad11;
	}

	public void setTxtWPDCantidad11(JTextField txtWPDCantidad11) {
		this.txtWPDCantidad11 = txtWPDCantidad11;
	}

	public JTextField getTxtWPDCantidad21() {
		return txtWPDCantidad21;
	}

	public void setTxtWPDCantidad21(JTextField txtWPDCantidad21) {
		this.txtWPDCantidad21 = txtWPDCantidad21;
	}

	public JTextField getTxtWPDObs0() {
		return txtWPDObs0;
	}

	public void setTxtWPDObs0(JTextField txtWPDObs0) {
		this.txtWPDObs0 = txtWPDObs0;
	}

	public JTextField getTxtWPDObs1() {
		return txtWPDObs1;
	}

	public void setTxtWPDObs1(JTextField txtWPDObs1) {
		this.txtWPDObs1 = txtWPDObs1;
	}

	public JTextField getTxtWPDObs2() {
		return txtWPDObs2;
	}

	public void setTxtWPDObs2(JTextField txtWPDObs2) {
		this.txtWPDObs2 = txtWPDObs2;
	}

	public JTextField getTxtAVCantidad01() {
		return txtAVCantidad01;
	}

	public void setTxtAVCantidad01(JTextField txtAVCantidad01) {
		this.txtAVCantidad01 = txtAVCantidad01;
	}

	public JTextField getTxtAVCantidad11() {
		return txtAVCantidad11;
	}

	public void setTxtAVCantidad11(JTextField txtAVCantidad11) {
		this.txtAVCantidad11 = txtAVCantidad11;
	}

	public JTextField getTxtAVObs0() {
		return txtAVObs0;
	}

	public void setTxtAVObs0(JTextField txtAVObs0) {
		this.txtAVObs0 = txtAVObs0;
	}

	public JTextField getTxtAVObs1() {
		return txtAVObs1;
	}

	public void setTxtAVObs1(JTextField txtAVObs1) {
		this.txtAVObs1 = txtAVObs1;
	}

	public JTextField getTxtEDCantidad01() {
		return txtEDCantidad01;
	}

	public void setTxtEDCantidad01(JTextField txtEDCantidad01) {
		this.txtEDCantidad01 = txtEDCantidad01;
	}

	public JTextField getTxtEDObs0() {
		return txtEDObs0;
	}

	public void setTxtEDObs0(JTextField txtEDObs0) {
		this.txtEDObs0 = txtEDObs0;
	}

	public JTextField getTxtWPEObs1() {
		return txtWPEObs1;
	}

	public void setTxtWPEObs1(JTextField txtWPEObs1) {
		this.txtWPEObs1 = txtWPEObs1;
	}

}
