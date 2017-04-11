package com.capa.presentacion;

import static com.capa.util.Utilitarios.gettCabecera;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.capa.datos.TCabecera;
import com.capa.datos.TFicha;
import com.capa.datos.TGrupo;
import com.capa.datos.TInformacionObligatoria;
import com.capa.datos.TdetalleFicha;
import com.capa.negocios.ComponenteCabecera;
import com.capa.negocios.ComponenteFicha;
import com.capa.negocios.ComponenteInfoObligatoria;
import com.capa.negocios.ServicioCabecera;
import com.capa.negocios.ServicioFicha;
import com.capa.negocios.ServicioInfoObligatoria;
import com.capa.presentacion.InformacionObligatoriaV;
import com.capa.presentacion.JPcabecera;

public class HsTemplate extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2991536081432510517L;
	private JPanel contentPane;
	private JTextField txtKARCantLim00;
	private JTextField txtKARCantLim01;
	private JTextField txtKARCantLim10;
	private JTextField txtKARCantLim11;
	private JTextField txtKARCantLim20;
	private JTextField txtKARCantLim21;
	private JTextField txtKAR1ObsRef0;
	private JTextField txtKAR1ObsRef1;
	private JTextField txtKAR1ObsRef2;
	private JTextField txtKARCantLim30;
	private JTextField txtKARCantLim31;
	private JTextField txtKARCantLim40;
	private JTextField txtKARCantLim41;
	private JTextField txtKARCantLim50;
	private JTextField txtKARCantLim51;
	private JTextField txtKARCantLim60;
	private JTextField txtKARCantLim61;
	private JTextField txtKARCantLim70;
	private JTextField txtKARCantLim71;
	private JTextField txtKAR1ObsRef3;
	private JTextField txtKAR1ObsRef4;
	private JTextField txtKAR1ObsRef5;
	private JTextField txtKAR1ObsRef6;
	private JTextField txtKAR1ObsRef7;
	private JTextField txtCA00;
	private JTextField txtCA01;
	private JTextField txtCA10;
	private JTextField txtCA11;
	private JTextField txtCA20;
	private JTextField txtCA21;
	private JTextField txtCA30;
	private JTextField txtCA31;
	private JTextField txtCA40;
	private JTextField txtCA41;
	private JTextField txtCA50;
	private JTextField txtCA51;
	private JTextField txtCA60;
	private JTextField txtCA61;
	private JTextField txtCA70;
	private JTextField txtCA71;
	private JTextField txtCA80;
	private JTextField txtCA81;
	private JTextField txtCA90;
	private JTextField txtCA91;
	private JTextField txtOR0;
	private JTextField txtOR1;
	private JTextField txtOR2;
	private JTextField txtOR3;
	private JTextField txtOR4;
	private JTextField txtOR5;
	private JTextField txtOR6;
	private JTextField txtOR7;
	private JTextField txtOR8;
	private JTextField txtOR9;
	private JTextField txtCA100;
	private JTextField txtCA101;
	private JTextField txtOR10;
	private JTextField txtCA110;
	private JTextField txtCA111;
	private JTextField txtOR11;
	private JTextField txtCA120;
	private JTextField txtCA121;
	private JTextField txtOR12;
	private JTextField txtCA131;
	private JTextField txtOR13;
	private JTextField txtKARCantLim80;
	private JTextField txtKARCantLim81;
	private JTextField txtKAR1ObsRef8;
	private JTextField txtKARCantLim90;
	private JTextField txtKARCantLim91;
	private JTextField txtKAR1ObsRef9;
	private JTextField txtKARCantLim100;
	private JTextField txtKARCantLim101;
	private JTextField txtKAR1ObsRef10;
	private JTextField txtKARCantLim110;
	private JTextField txtKARCantLim111;
	private JTextField txtKAR1ObsRef11;
	private JTextField txtKARCantLim120;
	private JTextField txtKARCantLim121;
	private JTextField txtKAR1ObsRef12;
	private JTextField txtKARCantLim130;
	private JTextField txtKARCantLim131;
	private JTextField txtKAR1ObsRef13;
	private JTextField txtKAPCantidad00;
	private JTextField textField_31;
	private JTextField txtKAPCantidad10;
	private JTextField textField_33;
	private JTextField txtKAPCantidad20;
	private JTextField textField_35;
	private JTextField txtKAPCantidad30;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField txtKAPCantidad40;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField txtKAPCantidad60;
	private JTextField textField_76;
	private JTextField txtKAPCantidad70;
	private JTextField textField_78;
	private JTextField txtKAPCantidad80;
	private JTextField textField_80;
	private JTextField txtKAPCantidad90;
	private JTextField textField_82;
	private JTextField txtKAPCantidad100;
	private JTextField textField_84;
	private JTextField textField_85;
	private JTextField textField_86;
	private JTextField textField_87;
	private JTextField textField_88;
	private JTextField textField_89;
	private JTextField txtKAPCantidad50;
	private JTextField textField_91;
	private JTextField textField_92;
	private JTextField textField_93;
	private JTextField textField_94;
	private JTextField textField_99;
	private JTextField textField_100;
	private JTextField textField_95;
	private JTextField textField_96;
	private JTextField textField_97;
	private JTextField textField_98;
	private JTextField textField_101;

	private TFicha ficha;
	private JTextField txtCA130;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServicioFicha servicioFicha = new ComponenteFicha();

					HsTemplate frame = new HsTemplate(servicioFicha.buscarFormulario("HS-1"));
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HsTemplate(TFicha ficha) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 1318, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setTitle(ficha.getFiNombre());
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.ficha = ficha;

		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());

		InformacionObligatoriaV infoObligatoria = new InformacionObligatoriaV(870, 482);
		contentPane.add(infoObligatoria.getPnlInformacionObl());

		// llenarCabecera(cabecera);
		cabecera.getBtnRegistrar().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hola mundo");
				getListaGrupos();
			}

		});

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 110, 1286, 594);
		contentPane.add(tabbedPane);

		JPanel pnlPestaña1 = new JPanel();
		tabbedPane.addTab("1.- " + ficha.getFiDescripcion(), null, pnlPestaña1, null);
		pnlPestaña1.setLayout(null);

		JPanel pnlCA = new JPanel();
		pnlCA.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlCA.setBounds(10, 4, 414, 461);
		pnlPestaña1.add(pnlCA);
		pnlCA.setLayout(null);

		JLabel lblComponenteArq = new JLabel("COMPONENTE ARQUITECTÓNICO");
		lblComponenteArq.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComponenteArq.setBounds(5, 1, 176, 14);
		pnlCA.add(lblComponenteArq);

		JLabel lblCACantidad = new JLabel("Cantidad");
		lblCACantidad.setBounds(210, 1, 55, 14);
		pnlCA.add(lblCACantidad);

		JLabel lblCAObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblCAObsRef.setBounds(267, 1, 143, 14);
		pnlCA.add(lblCAObsRef);

		JPanel pnlCA10lbls = new JPanel();
		pnlCA10lbls.setBounds(5, 20, 200, 200);
		pnlCA.add(pnlCA10lbls);
		pnlCA10lbls.setLayout(new GridLayout(10, 1, 0, 0));

		JLabel label_17 = new JLabel("Canal de Aguas de Lluvia de Hormigón ");
		label_17.setHorizontalAlignment(SwingConstants.RIGHT);
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA10lbls.add(label_17);

		JLabel label_18 = new JLabel("Tubería de PVC  75mm y L=3m");
		label_18.setHorizontalAlignment(SwingConstants.RIGHT);
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA10lbls.add(label_18);

		JLabel label_19 = new JLabel("Tubería de PVC  110mm y L=3m");
		label_19.setHorizontalAlignment(SwingConstants.RIGHT);
		label_19.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA10lbls.add(label_19);

		JLabel label_20 = new JLabel("Tubería de PVC  110mm y L=2.1m");
		label_20.setHorizontalAlignment(SwingConstants.RIGHT);
		label_20.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA10lbls.add(label_20);

		JLabel label_21 = new JLabel("Tubería de PVC  200mm y L=3m");
		label_21.setHorizontalAlignment(SwingConstants.RIGHT);
		label_21.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA10lbls.add(label_21);

		JLabel label_22 = new JLabel("Tubería de PVC  400mm y L=3m");
		label_22.setHorizontalAlignment(SwingConstants.RIGHT);
		label_22.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA10lbls.add(label_22);

		JLabel label_23 = new JLabel("Tubería de PVC  400mm y L=1m");
		label_23.setHorizontalAlignment(SwingConstants.RIGHT);
		label_23.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA10lbls.add(label_23);

		JLabel label_24 = new JLabel("Trampas de Arenas");
		label_24.setHorizontalAlignment(SwingConstants.RIGHT);
		label_24.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA10lbls.add(label_24);

		JLabel label_25 = new JLabel("Elementos de revisión 60x60");
		label_25.setHorizontalAlignment(SwingConstants.RIGHT);
		label_25.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA10lbls.add(label_25);

		JLabel label_26 = new JLabel("Elementos de revisión 90x90");
		label_26.setHorizontalAlignment(SwingConstants.RIGHT);
		label_26.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA10lbls.add(label_26);

		JPanel pnlCA11lbls = new JPanel();
		pnlCA11lbls.setBounds(5, 222, 199, 65);
		pnlCA.add(pnlCA11lbls);
		pnlCA11lbls.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblKitParaConexin = new JLabel(
				"<html><body><p align=\"right\"> Kit para conexiñn de tuberña 200 mm. (lija  un pliego, polipega 1/4 gal, 1/4 gl suelda lñquida, 2 uniones, cama de arena, anclajes)</p></body></html>");
		lblKitParaConexin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKitParaConexin.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA11lbls.add(lblKitParaConexin);

		JPanel pnlCA12lbls = new JPanel();
		pnlCA12lbls.setBounds(6, 290, 199, 65);
		pnlCA.add(pnlCA12lbls);
		pnlCA12lbls.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblkitParaConexin = new JLabel(
				"<html><body><p align=\"right\">Kit para conexiñn de tuberña 75 mm. (lija pliego, polipega 1/2gal,1/2 gl suelda lñquida, 20 uniones,18codo 90ñ,8codo45ñ)</p></body></html>");
		lblkitParaConexin.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA12lbls.add(lblkitParaConexin);

		JPanel pnlCA13lbls = new JPanel();
		pnlCA13lbls.setBounds(5, 358, 199, 50);
		pnlCA.add(pnlCA13lbls);
		pnlCA13lbls.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblkitParaConexin_1 = new JLabel(
				"<html><body><p align=\"right\">Kit para conexión de tubería 110 mm. (lija pliego, polipega 1/2gal, 1/4 gl suelda líquida , 2 uniones,2codo 90°,2codo 45°)</p></body></html>");
		lblkitParaConexin_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA13lbls.add(lblkitParaConexin_1);

		JPanel pnlCA14lbls = new JPanel();
		pnlCA14lbls.setBounds(5, 410, 199, 50);
		pnlCA.add(pnlCA14lbls);
		pnlCA14lbls.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblkitParaConexin_2 = new JLabel(
				"<html><body><p align=\"right\">Kit para conexión de tubería 400 mm. (lija pliego, polipega 1/2gal, 1/4 gl suelda líquida, cama de arena, anclajes )</p></body></html>");
		lblkitParaConexin_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA14lbls.add(lblkitParaConexin_2);

		JPanel pnlCantidad10CA = new JPanel();
		pnlCantidad10CA.setBounds(210, 20, 55, 200);
		pnlCA.add(pnlCantidad10CA);
		pnlCantidad10CA.setLayout(new GridLayout(10, 2, 0, 0));

		txtCA00 = new JTextField();
		txtCA00.setEditable(false);
		txtCA00.setColumns(10);
		pnlCantidad10CA.add(txtCA00);

		txtCA01 = new JTextField();
		txtCA01.setColumns(10);
		pnlCantidad10CA.add(txtCA01);

		txtCA10 = new JTextField();
		txtCA10.setEditable(false);
		txtCA10.setColumns(10);
		pnlCantidad10CA.add(txtCA10);

		txtCA11 = new JTextField();
		txtCA11.setColumns(10);
		pnlCantidad10CA.add(txtCA11);

		txtCA20 = new JTextField();
		txtCA20.setEditable(false);
		txtCA20.setColumns(10);
		pnlCantidad10CA.add(txtCA20);

		txtCA21 = new JTextField();
		txtCA21.setColumns(10);
		pnlCantidad10CA.add(txtCA21);

		txtCA30 = new JTextField();
		txtCA30.setEditable(false);
		txtCA30.setColumns(10);
		pnlCantidad10CA.add(txtCA30);

		txtCA31 = new JTextField();
		txtCA31.setColumns(10);
		pnlCantidad10CA.add(txtCA31);

		txtCA40 = new JTextField();
		txtCA40.setEditable(false);
		txtCA40.setColumns(10);
		pnlCantidad10CA.add(txtCA40);

		txtCA41 = new JTextField();
		txtCA41.setColumns(10);
		pnlCantidad10CA.add(txtCA41);

		txtCA50 = new JTextField();
		txtCA50.setEditable(false);
		txtCA50.setColumns(10);
		pnlCantidad10CA.add(txtCA50);

		txtCA51 = new JTextField();
		txtCA51.setColumns(10);
		pnlCantidad10CA.add(txtCA51);

		txtCA60 = new JTextField();
		txtCA60.setEditable(false);
		txtCA60.setColumns(10);
		pnlCantidad10CA.add(txtCA60);

		txtCA61 = new JTextField();
		txtCA61.setColumns(10);
		pnlCantidad10CA.add(txtCA61);

		txtCA70 = new JTextField();
		txtCA70.setEditable(false);
		txtCA70.setColumns(10);
		pnlCantidad10CA.add(txtCA70);

		txtCA71 = new JTextField();
		txtCA71.setColumns(10);
		pnlCantidad10CA.add(txtCA71);

		txtCA80 = new JTextField();
		txtCA80.setEditable(false);
		txtCA80.setColumns(10);
		pnlCantidad10CA.add(txtCA80);

		txtCA81 = new JTextField();
		txtCA81.setColumns(10);
		pnlCantidad10CA.add(txtCA81);

		txtCA90 = new JTextField();
		txtCA90.setEditable(false);
		txtCA90.setColumns(10);
		pnlCantidad10CA.add(txtCA90);

		txtCA91 = new JTextField();
		txtCA91.setColumns(10);
		pnlCantidad10CA.add(txtCA91);

		JPanel pnlCantidad11CA = new JPanel();
		pnlCantidad11CA.setBounds(210, 247, 55, 20);
		pnlCA.add(pnlCantidad11CA);
		pnlCantidad11CA.setLayout(new GridLayout(1, 2, 0, 0));

		txtCA100 = new JTextField();
		txtCA100.setEditable(false);
		txtCA100.setColumns(10);
		pnlCantidad11CA.add(txtCA100);

		txtCA101 = new JTextField();
		txtCA101.setColumns(10);
		pnlCantidad11CA.add(txtCA101);

		JPanel pnlCantidad12CA = new JPanel();
		pnlCantidad12CA.setBounds(210, 308, 55, 20);
		pnlCA.add(pnlCantidad12CA);
		pnlCantidad12CA.setLayout(new GridLayout(1, 2, 0, 0));

		txtCA110 = new JTextField();
		txtCA110.setEditable(false);
		txtCA110.setColumns(10);
		pnlCantidad12CA.add(txtCA110);

		txtCA111 = new JTextField();
		txtCA111.setColumns(10);
		pnlCantidad12CA.add(txtCA111);

		JPanel pnlCantidad13CA = new JPanel();
		pnlCantidad13CA.setBounds(210, 371, 55, 20);
		pnlCA.add(pnlCantidad13CA);
		pnlCantidad13CA.setLayout(new GridLayout(1, 2, 0, 0));

		txtCA120 = new JTextField();
		txtCA120.setEditable(false);
		txtCA120.setColumns(10);
		pnlCantidad13CA.add(txtCA120);

		txtCA121 = new JTextField();
		txtCA121.setColumns(10);
		pnlCantidad13CA.add(txtCA121);

		JPanel pnlCantidad14CA = new JPanel();
		pnlCantidad14CA.setBounds(210, 419, 55, 20);
		pnlCA.add(pnlCantidad14CA);
		pnlCantidad14CA.setLayout(new GridLayout(1, 2, 0, 0));

		txtCA130 = new JTextField();
		txtCA130.setEditable(false);
		txtCA130.setColumns(10);
		pnlCantidad14CA.add(txtCA130);

		txtCA131 = new JTextField();
		txtCA131.setColumns(10);
		pnlCantidad14CA.add(txtCA131);

		JPanel pnlOR10CA = new JPanel();
		pnlOR10CA.setBounds(267, 20, 143, 200);
		pnlCA.add(pnlOR10CA);
		pnlOR10CA.setLayout(new GridLayout(10, 0, 0, 0));

		txtOR0 = new JTextField();
		txtOR0.setColumns(10);
		pnlOR10CA.add(txtOR0);

		txtOR1 = new JTextField();
		txtOR1.setColumns(10);
		pnlOR10CA.add(txtOR1);

		txtOR2 = new JTextField();
		txtOR2.setColumns(10);
		pnlOR10CA.add(txtOR2);

		txtOR3 = new JTextField();
		txtOR3.setColumns(10);
		pnlOR10CA.add(txtOR3);

		txtOR4 = new JTextField();
		txtOR4.setColumns(10);
		pnlOR10CA.add(txtOR4);

		txtOR5 = new JTextField();
		txtOR5.setColumns(10);
		pnlOR10CA.add(txtOR5);

		txtOR6 = new JTextField();
		txtOR6.setColumns(10);
		pnlOR10CA.add(txtOR6);

		txtOR7 = new JTextField();
		txtOR7.setColumns(10);
		pnlOR10CA.add(txtOR7);

		txtOR8 = new JTextField();
		txtOR8.setColumns(10);
		pnlOR10CA.add(txtOR8);

		txtOR9 = new JTextField();
		txtOR9.setColumns(10);
		pnlOR10CA.add(txtOR9);

		JPanel pnlOR11CA = new JPanel();
		pnlOR11CA.setBounds(267, 247, 143, 20);
		pnlCA.add(pnlOR11CA);
		pnlOR11CA.setLayout(new GridLayout(0, 1, 0, 0));

		txtOR10 = new JTextField();
		txtOR10.setColumns(10);
		pnlOR11CA.add(txtOR10);

		JPanel pnlOR12CA = new JPanel();
		pnlOR12CA.setBounds(267, 308, 143, 20);
		pnlCA.add(pnlOR12CA);
		pnlOR12CA.setLayout(new GridLayout(0, 1, 0, 0));

		txtOR11 = new JTextField();
		txtOR11.setColumns(10);
		pnlOR12CA.add(txtOR11);

		JPanel pnlOR13CA = new JPanel();
		pnlOR13CA.setBounds(267, 371, 143, 20);
		pnlCA.add(pnlOR13CA);
		pnlOR13CA.setLayout(new GridLayout(0, 1, 0, 0));

		txtOR12 = new JTextField();
		txtOR12.setColumns(10);
		pnlOR13CA.add(txtOR12);

		JPanel pnlOR14CA = new JPanel();
		pnlOR14CA.setBounds(267, 419, 143, 20);
		pnlCA.add(pnlOR14CA);
		pnlOR14CA.setLayout(new GridLayout(0, 1, 0, 0));

		txtOR13 = new JTextField();
		txtOR13.setColumns(10);
		pnlOR14CA.add(txtOR13);

		JPanel pnlKAR1 = new JPanel();
		pnlKAR1.setLayout(null);
		pnlKAR1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlKAR1.setBounds(10, 469, 414, 85);
		pnlPestaña1.add(pnlKAR1);

		JLabel lblKitAguaRes1 = new JLabel("KIT AGUA RESIDUAL");
		lblKitAguaRes1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKitAguaRes1.setBounds(3, 1, 211, 14);
		pnlKAR1.add(lblKitAguaRes1);

		JLabel lblKAR1Cantidad = new JLabel("Cantidad");
		lblKAR1Cantidad.setBounds(210, 1, 55, 14);
		pnlKAR1.add(lblKAR1Cantidad);

		JLabel lblKAR1ObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblKAR1ObsRef.setBounds(267, 1, 143, 14);
		pnlKAR1.add(lblKAR1ObsRef);

		JPanel pnlEDEtiquetas = new JPanel();
		pnlEDEtiquetas.setBounds(3, 17, 199, 60);
		pnlKAR1.add(pnlEDEtiquetas);
		pnlEDEtiquetas.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel lblKAR1TuberiaPVC75_3 = new JLabel("Tuber\u00EDa de PVC  75mm PVC y L=3m");
		lblKAR1TuberiaPVC75_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKAR1TuberiaPVC75_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlEDEtiquetas.add(lblKAR1TuberiaPVC75_3);

		JLabel lblKAR1TuberiaPVC75_2 = new JLabel("Tuber\u00EDa de PVC  75mm PVC y L=2m");
		lblKAR1TuberiaPVC75_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKAR1TuberiaPVC75_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlEDEtiquetas.add(lblKAR1TuberiaPVC75_2);

		JLabel lblKAR1TuberiaPVC110_3 = new JLabel("Tuber\u00EDa de PVC  110mm PVC y L=3m");
		lblKAR1TuberiaPVC110_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKAR1TuberiaPVC110_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlEDEtiquetas.add(lblKAR1TuberiaPVC110_3);

		JPanel pnlEDCantidad = new JPanel();
		pnlEDCantidad.setBounds(210, 17, 55, 60);
		pnlKAR1.add(pnlEDCantidad);
		pnlEDCantidad.setLayout(new GridLayout(3, 2, 0, 0));

		txtKARCantLim00 = new JTextField();
		txtKARCantLim00.setEditable(false);
		txtKARCantLim00.setColumns(10);
		pnlEDCantidad.add(txtKARCantLim00);

		txtKARCantLim01 = new JTextField();
		txtKARCantLim01.setColumns(10);
		pnlEDCantidad.add(txtKARCantLim01);

		txtKARCantLim10 = new JTextField();
		txtKARCantLim10.setEditable(false);
		txtKARCantLim10.setColumns(10);
		pnlEDCantidad.add(txtKARCantLim10);

		txtKARCantLim11 = new JTextField();
		txtKARCantLim11.setColumns(10);
		pnlEDCantidad.add(txtKARCantLim11);

		txtKARCantLim20 = new JTextField();
		txtKARCantLim20.setEditable(false);
		txtKARCantLim20.setColumns(10);
		pnlEDCantidad.add(txtKARCantLim20);

		txtKARCantLim21 = new JTextField();
		txtKARCantLim21.setColumns(10);
		pnlEDCantidad.add(txtKARCantLim21);

		JPanel pnlEDObsRef = new JPanel();
		pnlEDObsRef.setBounds(267, 17, 143, 60);
		pnlKAR1.add(pnlEDObsRef);
		pnlEDObsRef.setLayout(new GridLayout(3, 0, 0, 0));

		txtKAR1ObsRef0 = new JTextField();
		txtKAR1ObsRef0.setColumns(10);
		pnlEDObsRef.add(txtKAR1ObsRef0);

		txtKAR1ObsRef1 = new JTextField();
		txtKAR1ObsRef1.setColumns(10);
		pnlEDObsRef.add(txtKAR1ObsRef1);

		txtKAR1ObsRef2 = new JTextField();
		txtKAR1ObsRef2.setColumns(10);
		pnlEDObsRef.add(txtKAR1ObsRef2);

		JPanel pnlKAR2 = new JPanel();
		pnlKAR2.setLayout(null);
		pnlKAR2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlKAR2.setBounds(434, 4, 414, 412);
		pnlPestaña1.add(pnlKAR2);

		JLabel lblKitAguaRes2 = new JLabel("KIT AGUA RESIDUAL");
		lblKitAguaRes2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKitAguaRes2.setBounds(3, 1, 176, 14);
		pnlKAR2.add(lblKitAguaRes2);

		JLabel lblKAR2Cantidad = new JLabel("Cantidad");
		lblKAR2Cantidad.setBounds(210, 1, 55, 14);
		pnlKAR2.add(lblKAR2Cantidad);

		JLabel lblKAR2ObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblKAR2ObsRef.setBounds(267, 1, 143, 14);
		pnlKAR2.add(lblKAR2ObsRef);

		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBounds(210, 17, 56, 100);
		pnlKAR2.add(panel_11);

		JPanel panel_12 = new JPanel();
		panel_12.setBounds(0, 0, 55, 100);
		panel_11.add(panel_12);
		panel_12.setLayout(new GridLayout(0, 2, 0, 0));

		txtKARCantLim30 = new JTextField();
		txtKARCantLim30.setEditable(false);
		txtKARCantLim30.setColumns(10);
		panel_12.add(txtKARCantLim30);

		txtKARCantLim31 = new JTextField();
		txtKARCantLim31.setColumns(10);
		panel_12.add(txtKARCantLim31);

		txtKARCantLim40 = new JTextField();
		txtKARCantLim40.setEditable(false);
		txtKARCantLim40.setColumns(10);
		panel_12.add(txtKARCantLim40);

		txtKARCantLim41 = new JTextField();
		txtKARCantLim41.setColumns(10);
		panel_12.add(txtKARCantLim41);

		txtKARCantLim50 = new JTextField();
		txtKARCantLim50.setEditable(false);
		txtKARCantLim50.setColumns(10);
		panel_12.add(txtKARCantLim50);

		txtKARCantLim51 = new JTextField();
		txtKARCantLim51.setColumns(10);
		panel_12.add(txtKARCantLim51);

		txtKARCantLim60 = new JTextField();
		txtKARCantLim60.setEditable(false);
		txtKARCantLim60.setColumns(10);
		panel_12.add(txtKARCantLim60);

		txtKARCantLim61 = new JTextField();
		txtKARCantLim61.setColumns(10);
		panel_12.add(txtKARCantLim61);

		txtKARCantLim70 = new JTextField();
		txtKARCantLim70.setEditable(false);
		txtKARCantLim70.setColumns(10);
		panel_12.add(txtKARCantLim70);

		txtKARCantLim71 = new JTextField();
		txtKARCantLim71.setColumns(10);
		panel_12.add(txtKARCantLim71);

		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBounds(267, 17, 143, 100);
		pnlKAR2.add(panel_14);

		JPanel panel_15 = new JPanel();
		panel_15.setBounds(0, 0, 143, 100);
		panel_14.add(panel_15);
		panel_15.setLayout(new GridLayout(5, 0, 0, 0));

		txtKAR1ObsRef3 = new JTextField();
		txtKAR1ObsRef3.setColumns(10);
		panel_15.add(txtKAR1ObsRef3);

		txtKAR1ObsRef4 = new JTextField();
		txtKAR1ObsRef4.setColumns(10);
		panel_15.add(txtKAR1ObsRef4);

		txtKAR1ObsRef5 = new JTextField();
		txtKAR1ObsRef5.setColumns(10);
		panel_15.add(txtKAR1ObsRef5);

		txtKAR1ObsRef6 = new JTextField();
		txtKAR1ObsRef6.setColumns(10);
		panel_15.add(txtKAR1ObsRef6);

		txtKAR1ObsRef7 = new JTextField();
		txtKAR1ObsRef7.setColumns(10);
		panel_15.add(txtKAR1ObsRef7);

		JLabel lblKAR2KitConexion160 = new JLabel(
				"<html><body><p align=\"right\">Kit para conexión de tubería 160 mm. (lija pliego, polipega 1/2gal, 1/4 gl suelda líquida, cama de arena, anclajes )</p></body></html>");
		lblKAR2KitConexion160.setBounds(3, 355, 204, 50);
		pnlKAR2.add(lblKAR2KitConexion160);
		lblKAR2KitConexion160.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JLabel lblKAR2KitConexion110 = new JLabel(
				"<html><body><p align=\"right\">Kit para conexión de tubería 110 mm. (lija pliego, polipega 1gal, 1 gl suelda líquida , 18 uniones,6codo 90°,5codo 45°,cama de arena, anclajes)</p></body></html>");
		lblKAR2KitConexion110.setBounds(3, 293, 204, 60);
		pnlKAR2.add(lblKAR2KitConexion110);
		lblKAR2KitConexion110.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JLabel lblKAR2KitConexion75 = new JLabel(
				"<html><body><p align=\"right\">Kit para conexión de tubería 75 mm. (lija pliego, polipega 1gal,1gl suelda líquida, 6 uniones,4codo 90°,3codo45°,cama de arena, anclajes)</p></body></html>");
		lblKAR2KitConexion75.setBounds(3, 235, 204, 60);
		pnlKAR2.add(lblKAR2KitConexion75);
		lblKAR2KitConexion75.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JLabel lblKAR2KitConexion200 = new JLabel(
				"<html><body><p align=\"right\">Kit para conexión de tubería 200 mm. (lija  un pliego, polipega 2 gal, 2 gl suelda líquida, 15 uniones, cama de arena, anclajes)</p></body></html>");
		lblKAR2KitConexion200.setBounds(3, 176, 204, 60);
		pnlKAR2.add(lblKAR2KitConexion200);
		lblKAR2KitConexion200.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JPanel panel_17 = new JPanel();
		panel_17.setBounds(3, 17, 204, 100);
		pnlKAR2.add(panel_17);
		panel_17.setLayout(new GridLayout(5, 0, 0, 0));

		JLabel label_4 = new JLabel("Tubería de PVC  110mm PVC y L=2m");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_17.add(label_4);

		JLabel label_5 = new JLabel("Tubería de PVC  160mm PVC y L=3m");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_17.add(label_5);

		JLabel label_6 = new JLabel("Tubería de PVC  160mm PVC y L=2m");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_17.add(label_6);

		JLabel label_7 = new JLabel("Tubería de PVC  200mm PVC y L=3m");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_17.add(label_7);

		JLabel label_8 = new JLabel("Tubería de PVC  200mm PVC y L=2m");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_17.add(label_8);

		JLabel lblcajaDeConexin = new JLabel(
				"<html><body><p align=\"right\">Caja de Conexión 60x60( tapas con cerco metálico)</p></body></html>");
		lblcajaDeConexin.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblcajaDeConexin.setBounds(3, 118, 204, 30);
		pnlKAR2.add(lblcajaDeConexin);

		JLabel lblpozoDeInspeccin = new JLabel(
				"<html><body><p align=\"right\">Pozo de Inspección (tapas de hierro fundido)</p></body></html>");
		lblpozoDeInspeccin.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblpozoDeInspeccin.setBounds(3, 148, 204, 30);
		pnlKAR2.add(lblpozoDeInspeccin);

		JPanel panel_18 = new JPanel();
		panel_18.setBounds(210, 120, 55, 20);
		pnlKAR2.add(panel_18);
		panel_18.setLayout(new GridLayout(1, 2, 0, 0));

		txtKARCantLim80 = new JTextField();
		txtKARCantLim80.setEditable(false);
		txtKARCantLim80.setColumns(10);
		panel_18.add(txtKARCantLim80);

		txtKARCantLim81 = new JTextField();
		txtKARCantLim81.setColumns(10);
		panel_18.add(txtKARCantLim81);

		JPanel panel_19 = new JPanel();
		panel_19.setBounds(267, 120, 143, 20);
		pnlKAR2.add(panel_19);
		panel_19.setLayout(new GridLayout(0, 1, 0, 0));

		txtKAR1ObsRef8 = new JTextField();
		txtKAR1ObsRef8.setColumns(10);
		panel_19.add(txtKAR1ObsRef8);

		JPanel panel_37 = new JPanel();
		panel_37.setBounds(210, 145, 55, 20);
		pnlKAR2.add(panel_37);
		panel_37.setLayout(new GridLayout(1, 2, 0, 0));

		txtKARCantLim90 = new JTextField();
		txtKARCantLim90.setEditable(false);
		txtKARCantLim90.setColumns(10);
		panel_37.add(txtKARCantLim90);

		txtKARCantLim91 = new JTextField();
		txtKARCantLim91.setColumns(10);
		panel_37.add(txtKARCantLim91);

		JPanel panel_38 = new JPanel();
		panel_38.setBounds(267, 145, 143, 20);
		pnlKAR2.add(panel_38);
		panel_38.setLayout(new GridLayout(0, 1, 0, 0));

		txtKAR1ObsRef9 = new JTextField();
		txtKAR1ObsRef9.setColumns(10);
		panel_38.add(txtKAR1ObsRef9);

		JPanel panel_13 = new JPanel();
		panel_13.setBounds(210, 189, 55, 20);
		pnlKAR2.add(panel_13);
		panel_13.setLayout(new GridLayout(1, 2, 0, 0));

		txtKARCantLim100 = new JTextField();
		txtKARCantLim100.setEditable(false);
		txtKARCantLim100.setColumns(10);
		panel_13.add(txtKARCantLim100);

		txtKARCantLim101 = new JTextField();
		txtKARCantLim101.setColumns(10);
		panel_13.add(txtKARCantLim101);

		JPanel panel_16 = new JPanel();
		panel_16.setBounds(267, 189, 143, 20);
		pnlKAR2.add(panel_16);
		panel_16.setLayout(new GridLayout(0, 1, 0, 0));

		txtKAR1ObsRef10 = new JTextField();
		txtKAR1ObsRef10.setColumns(10);
		panel_16.add(txtKAR1ObsRef10);

		JPanel panel_31 = new JPanel();
		panel_31.setBounds(210, 247, 55, 20);
		pnlKAR2.add(panel_31);
		panel_31.setLayout(new GridLayout(1, 2, 0, 0));

		txtKARCantLim110 = new JTextField();
		txtKARCantLim110.setEditable(false);
		txtKARCantLim110.setColumns(10);
		panel_31.add(txtKARCantLim110);

		txtKARCantLim111 = new JTextField();
		txtKARCantLim111.setColumns(10);
		panel_31.add(txtKARCantLim111);

		JPanel panel_32 = new JPanel();
		panel_32.setBounds(267, 247, 143, 20);
		pnlKAR2.add(panel_32);
		panel_32.setLayout(new GridLayout(0, 1, 0, 0));

		txtKAR1ObsRef11 = new JTextField();
		txtKAR1ObsRef11.setColumns(10);
		panel_32.add(txtKAR1ObsRef11);

		JPanel panel_33 = new JPanel();
		panel_33.setBounds(210, 306, 55, 20);
		pnlKAR2.add(panel_33);
		panel_33.setLayout(new GridLayout(1, 2, 0, 0));

		txtKARCantLim120 = new JTextField();
		txtKARCantLim120.setEditable(false);
		txtKARCantLim120.setColumns(10);
		panel_33.add(txtKARCantLim120);

		txtKARCantLim121 = new JTextField();
		txtKARCantLim121.setColumns(10);
		panel_33.add(txtKARCantLim121);

		JPanel panel_34 = new JPanel();
		panel_34.setBounds(267, 306, 143, 20);
		pnlKAR2.add(panel_34);
		panel_34.setLayout(new GridLayout(0, 1, 0, 0));

		txtKAR1ObsRef12 = new JTextField();
		txtKAR1ObsRef12.setColumns(10);
		panel_34.add(txtKAR1ObsRef12);

		JPanel panel_35 = new JPanel();
		panel_35.setBounds(210, 364, 55, 20);
		pnlKAR2.add(panel_35);
		panel_35.setLayout(new GridLayout(1, 2, 0, 0));

		txtKARCantLim130 = new JTextField();
		txtKARCantLim130.setEditable(false);
		txtKARCantLim130.setColumns(10);
		panel_35.add(txtKARCantLim130);

		txtKARCantLim131 = new JTextField();
		txtKARCantLim131.setColumns(10);
		panel_35.add(txtKARCantLim131);

		JPanel panel_36 = new JPanel();
		panel_36.setBounds(267, 364, 143, 20);
		pnlKAR2.add(panel_36);
		panel_36.setLayout(new GridLayout(0, 1, 0, 0));

		txtKAR1ObsRef13 = new JTextField();
		txtKAR1ObsRef13.setColumns(10);
		panel_36.add(txtKAR1ObsRef13);

		JPanel pnlKAP1 = new JPanel();
		pnlKAP1.setLayout(null);
		pnlKAP1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlKAP1.setBounds(434, 420, 414, 134);
		pnlPestaña1.add(pnlKAP1);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(3, 17, 199, 80);
		pnlKAP1.add(panel_7);
		panel_7.setLayout(new GridLayout(4, 0, 0, 0));

		JLabel lblKAP1TuberiaPVC05_3 = new JLabel("Tuber\u00EDa de PVC  1/2\" y L=3m");
		lblKAP1TuberiaPVC05_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKAP1TuberiaPVC05_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_7.add(lblKAP1TuberiaPVC05_3);

		JLabel lblKAP1TuberiaPVC34_3 = new JLabel("Tuber\u00EDa de PVC  3/4\" y L=3m");
		lblKAP1TuberiaPVC34_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKAP1TuberiaPVC34_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_7.add(lblKAP1TuberiaPVC34_3);

		JLabel lblKAP1TuberiaPVC1_3 = new JLabel("Tuber\u00EDa de PVC  1\" y L=3m");
		lblKAP1TuberiaPVC1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKAP1TuberiaPVC1_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_7.add(lblKAP1TuberiaPVC1_3);

		JLabel lblKAP1TuberiaPVC1_05_3 = new JLabel("Tuber\u00EDa de PVC  1-1/2\" y L=3m");
		lblKAP1TuberiaPVC1_05_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKAP1TuberiaPVC1_05_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_7.add(lblKAP1TuberiaPVC1_05_3);

		JLabel lblKitAguaPot1 = new JLabel("KIT AGUA POTABLE");
		lblKitAguaPot1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKitAguaPot1.setBounds(3, 1, 176, 14);
		pnlKAP1.add(lblKitAguaPot1);

		JLabel lblKAP1Cantidad = new JLabel("Cantidad");
		lblKAP1Cantidad.setBounds(210, 1, 55, 14);
		pnlKAP1.add(lblKAP1Cantidad);

		JLabel lblKAP1ObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblKAP1ObsRef.setBounds(267, 1, 143, 14);
		pnlKAP1.add(lblKAP1ObsRef);

		JLabel lblcajasDeConexin = new JLabel(
				"<html><body><p align=\"right\">Cajas de conexión 60x60(tapas cerco metálico)</p></body></html>");
		lblcajasDeConexin.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblcajasDeConexin.setBounds(3, 100, 199, 30);
		pnlKAP1.add(lblcajasDeConexin);

		JPanel panel_8 = new JPanel();
		panel_8.setBounds(208, 17, 55, 80);
		pnlKAP1.add(panel_8);
		panel_8.setLayout(new GridLayout(0, 2, 0, 0));

		txtKAPCantidad00 = new JTextField();
		txtKAPCantidad00.setEditable(false);
		txtKAPCantidad00.setColumns(10);
		panel_8.add(txtKAPCantidad00);

		textField_31 = new JTextField();
		textField_31.setColumns(10);
		panel_8.add(textField_31);

		txtKAPCantidad10 = new JTextField();
		txtKAPCantidad10.setEditable(false);
		txtKAPCantidad10.setColumns(10);
		panel_8.add(txtKAPCantidad10);

		textField_33 = new JTextField();
		textField_33.setColumns(10);
		panel_8.add(textField_33);

		txtKAPCantidad20 = new JTextField();
		txtKAPCantidad20.setEditable(false);
		txtKAPCantidad20.setColumns(10);
		panel_8.add(txtKAPCantidad20);

		textField_35 = new JTextField();
		textField_35.setColumns(10);
		panel_8.add(textField_35);

		txtKAPCantidad30 = new JTextField();
		txtKAPCantidad30.setEditable(false);
		txtKAPCantidad30.setColumns(10);
		panel_8.add(txtKAPCantidad30);

		textField_37 = new JTextField();
		textField_37.setColumns(10);
		panel_8.add(textField_37);

		JPanel panel_9 = new JPanel();
		panel_9.setBounds(266, 17, 143, 80);
		pnlKAP1.add(panel_9);
		panel_9.setLayout(new GridLayout(4, 0, 0, 0));

		textField_38 = new JTextField();
		textField_38.setColumns(10);
		panel_9.add(textField_38);

		textField_39 = new JTextField();
		textField_39.setColumns(10);
		panel_9.add(textField_39);

		textField_40 = new JTextField();
		textField_40.setColumns(10);
		panel_9.add(textField_40);

		textField_41 = new JTextField();
		textField_41.setColumns(10);
		panel_9.add(textField_41);

		JPanel panel_39 = new JPanel();
		panel_39.setBounds(208, 103, 55, 20);
		pnlKAP1.add(panel_39);
		panel_39.setLayout(new GridLayout(1, 2, 0, 0));

		txtKAPCantidad40 = new JTextField();
		txtKAPCantidad40.setEditable(false);
		txtKAPCantidad40.setColumns(10);
		panel_39.add(txtKAPCantidad40);

		textField_73 = new JTextField();
		textField_73.setColumns(10);
		panel_39.add(textField_73);

		JPanel panel_40 = new JPanel();
		panel_40.setBounds(265, 103, 143, 20);
		pnlKAP1.add(panel_40);
		panel_40.setLayout(new GridLayout(0, 1, 0, 0));

		textField_74 = new JTextField();
		textField_74.setColumns(10);
		panel_40.add(textField_74);

		JPanel pnlKAP2 = new JPanel();
		pnlKAP2.setLayout(null);
		pnlKAP2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlKAP2.setBounds(858, 4, 414, 242);
		pnlPestaña1.add(pnlKAP2);

		JLabel lblKitAguaPot2 = new JLabel("KIT AGUA POTABLE");
		lblKitAguaPot2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKitAguaPot2.setBounds(3, 1, 176, 14);
		pnlKAP2.add(lblKitAguaPot2);

		JLabel lblKAP2Cantidad = new JLabel("Cantidad");
		lblKAP2Cantidad.setBounds(210, 1, 55, 14);
		pnlKAP2.add(lblKAP2Cantidad);

		JLabel lblKAP2ObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblKAP2ObsRef.setBounds(267, 1, 143, 14);
		pnlKAP2.add(lblKAP2ObsRef);

		JLabel lblbebederosLlavesLlave = new JLabel(
				"<html><body><p align=\"right\">Bebederos(8 llaves,1 llave de paso,8 te 1/2\",1 unión Universal, teflón 2 rollos, pasta sellante)</p></body></html>");
		lblbebederosLlavesLlave.setHorizontalAlignment(SwingConstants.RIGHT);
		lblbebederosLlavesLlave.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblbebederosLlavesLlave.setBounds(3, 20, 205, 44);
		pnlKAP2.add(lblbebederosLlavesLlave);

		JPanel panel_20 = new JPanel();
		panel_20.setBounds(3, 68, 205, 170);
		pnlKAP2.add(panel_20);
		panel_20.setLayout(new GridLayout(5, 0, 0, 0));

		JLabel lbltomaDeRiego = new JLabel(
				"<html><body><p align=\"right\">Toma de Riego (5llave de paso,5uniones, 1 rollo de teflón, pasta selladora)</p></body></html>");
		lbltomaDeRiego.setHorizontalAlignment(SwingConstants.RIGHT);
		lbltomaDeRiego.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_20.add(lbltomaDeRiego);

		JLabel lblkitParaConexin_3 = new JLabel(
				"<html><body><p align=\"right\">Kit para conexión de tubería 1/2\". (lija pliego, polipega 1/4gal,6 uniones)</p></body></html>");
		lblkitParaConexin_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_20.add(lblkitParaConexin_3);

		JLabel lblkitParaConexin_4 = new JLabel(
				"<html><body><p align=\"right\">Kit para conexión de tubería 1\". (lija pliego, polipega 1/4gal,14 uniones)</p></body></html>");
		lblkitParaConexin_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_20.add(lblkitParaConexin_4);

		JLabel lblkitParaConexin_5 = new JLabel(
				"<html><body><p align=\"right\">Kit para conexión de tubería 3/4\". (lija pliego, polipega 1/4gal,10 uniones)</p></body></html>");
		lblkitParaConexin_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_20.add(lblkitParaConexin_5);

		JLabel lblkitParaConexin_6 = new JLabel(
				"<html><body><p align=\"right\">Kit para conexión de tubería 1- 1/2\". (lija pliego, polipega 1/4gal,8 uniones)</p></body></html>");
		lblkitParaConexin_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_20.add(lblkitParaConexin_6);

		JPanel panel_21 = new JPanel();
		panel_21.setBounds(210, 68, 55, 170);
		pnlKAP2.add(panel_21);
		panel_21.setLayout(new GridLayout(0, 2, 0, 14));

		txtKAPCantidad60 = new JTextField();
		txtKAPCantidad60.setEditable(false);
		txtKAPCantidad60.setColumns(10);
		panel_21.add(txtKAPCantidad60);

		textField_76 = new JTextField();
		textField_76.setColumns(10);
		panel_21.add(textField_76);

		txtKAPCantidad70 = new JTextField();
		txtKAPCantidad70.setEditable(false);
		txtKAPCantidad70.setColumns(10);
		panel_21.add(txtKAPCantidad70);

		textField_78 = new JTextField();
		textField_78.setColumns(10);
		panel_21.add(textField_78);

		txtKAPCantidad80 = new JTextField();
		txtKAPCantidad80.setEditable(false);
		txtKAPCantidad80.setColumns(10);
		panel_21.add(txtKAPCantidad80);

		textField_80 = new JTextField();
		textField_80.setColumns(10);
		panel_21.add(textField_80);

		txtKAPCantidad90 = new JTextField();
		txtKAPCantidad90.setEditable(false);
		txtKAPCantidad90.setColumns(10);
		panel_21.add(txtKAPCantidad90);

		textField_82 = new JTextField();
		textField_82.setColumns(10);
		panel_21.add(textField_82);

		txtKAPCantidad100 = new JTextField();
		txtKAPCantidad100.setEditable(false);
		txtKAPCantidad100.setColumns(10);
		panel_21.add(txtKAPCantidad100);

		textField_84 = new JTextField();
		textField_84.setColumns(10);
		panel_21.add(textField_84);

		JPanel panel_22 = new JPanel();
		panel_22.setBounds(267, 68, 143, 170);
		pnlKAP2.add(panel_22);
		panel_22.setLayout(new GridLayout(5, 0, 0, 14));

		textField_85 = new JTextField();
		textField_85.setColumns(10);
		panel_22.add(textField_85);

		textField_86 = new JTextField();
		textField_86.setColumns(10);
		panel_22.add(textField_86);

		textField_87 = new JTextField();
		textField_87.setColumns(10);
		panel_22.add(textField_87);

		textField_88 = new JTextField();
		textField_88.setColumns(10);
		panel_22.add(textField_88);

		textField_89 = new JTextField();
		textField_89.setColumns(10);
		panel_22.add(textField_89);

		JPanel panel_23 = new JPanel();
		panel_23.setBounds(210, 26, 55, 20);
		pnlKAP2.add(panel_23);
		panel_23.setLayout(new GridLayout(1, 2, 0, 0));

		txtKAPCantidad50 = new JTextField();
		txtKAPCantidad50.setEditable(false);
		txtKAPCantidad50.setColumns(10);
		panel_23.add(txtKAPCantidad50);

		textField_91 = new JTextField();
		textField_91.setColumns(10);
		panel_23.add(textField_91);

		JPanel panel_41 = new JPanel();
		panel_41.setBounds(267, 26, 143, 20);
		pnlKAP2.add(panel_41);
		panel_41.setLayout(new GridLayout(0, 1, 0, 0));

		textField_92 = new JTextField();
		textField_92.setColumns(10);
		panel_41.add(textField_92);

		JPanel pnlKH = new JPanel();
		pnlKH.setLayout(null);
		pnlKH.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlKH.setBounds(858, 257, 414, 84);
		pnlPestaña1.add(pnlKH);

		JPanel pnlBAEtiquetas = new JPanel();
		pnlBAEtiquetas.setBounds(3, 17, 205, 60);
		pnlKH.add(pnlBAEtiquetas);
		pnlBAEtiquetas.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel lblKHBomba3hp = new JLabel("Bomba de 3 hp instalada");
		lblKHBomba3hp.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKHBomba3hp.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlBAEtiquetas.add(lblKHBomba3hp);

		JLabel lblKHSetAccesorios = new JLabel("1 set accesorios");
		lblKHSetAccesorios.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKHSetAccesorios.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlBAEtiquetas.add(lblKHSetAccesorios);

		JLabel lblKHTanque55gl = new JLabel("Tanque de 55 gl y Cisterna 30 m3");
		lblKHTanque55gl.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKHTanque55gl.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlBAEtiquetas.add(lblKHTanque55gl);

		JLabel lblKitHidroneumatico = new JLabel("KIT HIDRONEUM\u00C1TICO");
		lblKitHidroneumatico.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKitHidroneumatico.setBounds(3, 1, 176, 14);
		pnlKH.add(lblKitHidroneumatico);

		JLabel lblKHCantidad = new JLabel("Cantidad");
		lblKHCantidad.setBounds(210, 1, 55, 14);
		pnlKH.add(lblKHCantidad);

		JLabel lblKAHObsRef = new JLabel("Observaci\u00F3n/Referencia");
		lblKAHObsRef.setBounds(267, 1, 143, 14);
		pnlKH.add(lblKAHObsRef);

		JPanel panel_42 = new JPanel();
		panel_42.setBounds(212, 17, 55, 60);
		pnlKH.add(panel_42);
		panel_42.setLayout(new GridLayout(0, 2, 0, 0));

		textField_95 = new JTextField();
		textField_95.setEditable(false);
		textField_95.setColumns(10);
		panel_42.add(textField_95);

		textField_96 = new JTextField();
		textField_96.setColumns(10);
		panel_42.add(textField_96);

		textField_93 = new JTextField();
		textField_93.setEditable(false);
		textField_93.setColumns(10);
		panel_42.add(textField_93);

		textField_94 = new JTextField();
		textField_94.setColumns(10);
		panel_42.add(textField_94);

		textField_99 = new JTextField();
		textField_99.setEditable(false);
		textField_99.setColumns(10);
		panel_42.add(textField_99);

		textField_100 = new JTextField();
		textField_100.setColumns(10);
		panel_42.add(textField_100);

		JPanel panel_43 = new JPanel();
		panel_43.setBounds(267, 17, 143, 60);
		pnlKH.add(panel_43);
		panel_43.setLayout(new GridLayout(0, 1, 0, 0));

		textField_97 = new JTextField();
		textField_97.setColumns(10);
		panel_43.add(textField_97);

		textField_98 = new JTextField();
		textField_98.setColumns(10);
		panel_43.add(textField_98);

		textField_101 = new JTextField();
		textField_101.setColumns(10);
		panel_43.add(textField_101);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				new Menu().setVisible(true);
				dispose();
			}
		});
	}

	private void getListaGrupos() {
		ServicioCabecera srvCabecera = new ComponenteCabecera();
		ServicioInfoObligatoria srvInfoObl = new ComponenteInfoObligatoria();
		ServicioFicha servicioFicha = new ComponenteFicha();

		TCabecera cabecera = srvCabecera.buscarProyecto(gettCabecera().getCNombreProyecto());
		Integer updateFicha = servicioFicha.buscarUpdateFicha();
		TInformacionObligatoria infoObligatoria = srvInfoObl.getInfoObl();

		TGrupo grupo1 = servicioFicha.buscarGrupo("Componente arquitectónico");
		List<TdetalleFicha> compArq = new LinkedList<>();
		compArq.add(
				new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, null, Integer.parseInt(txtCA00.getText()),
						Integer.parseInt(txtCA01.getText()), txtOR0.getText(), updateFicha));
		compArq.add(
				new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, null, Integer.parseInt(txtCA10.getText()),
						Integer.parseInt(txtCA11.getText()), txtOR1.getText(), updateFicha));
		compArq.add(
				new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, null, Integer.parseInt(txtCA20.getText()),
						Integer.parseInt(txtCA21.getText()), txtOR2.getText(), updateFicha));
		compArq.add(
				new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, null, Integer.parseInt(txtCA30.getText()),
						Integer.parseInt(txtCA31.getText()), txtOR3.getText(), updateFicha));
		compArq.add(
				new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, null, Integer.parseInt(txtCA40.getText()),
						Integer.parseInt(txtCA41.getText()), txtOR4.getText(), updateFicha));
		compArq.add(
				new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, null, Integer.parseInt(txtCA50.getText()),
						Integer.parseInt(txtCA51.getText()), txtOR5.getText(), updateFicha));
		compArq.add(
				new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, null, Integer.parseInt(txtCA60.getText()),
						Integer.parseInt(txtCA61.getText()), txtOR6.getText(), updateFicha));
		compArq.add(
				new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, null, Integer.parseInt(txtCA70.getText()),
						Integer.parseInt(txtCA71.getText()), txtOR7.getText(), updateFicha));
		compArq.add(
				new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, null, Integer.parseInt(txtCA80.getText()),
						Integer.parseInt(txtCA81.getText()), txtOR8.getText(), updateFicha));
		compArq.add(
				new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, null, Integer.parseInt(txtCA90.getText()),
						Integer.parseInt(txtCA91.getText()), txtOR9.getText(), updateFicha));
		compArq.add(
				new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, null, Integer.parseInt(txtCA100.getText()),
						Integer.parseInt(txtCA101.getText()), txtOR10.getText(), updateFicha));
		compArq.add(
				new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, null, Integer.parseInt(txtCA110.getText()),
						Integer.parseInt(txtCA111.getText()), txtOR11.getText(), updateFicha));
		compArq.add(
				new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, null, Integer.parseInt(txtCA120.getText()),
						Integer.parseInt(txtCA121.getText()), txtOR12.getText(), updateFicha));
		compArq.add(
				new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, null, Integer.parseInt(txtCA130.getText()),
						Integer.parseInt(txtCA131.getText()), txtOR13.getText(), updateFicha));

		TGrupo grupo2 = servicioFicha.buscarGrupo("Componente arquitectónico");
		compArq.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, null,
				Integer.parseInt(txtKARCantLim00.getText()), Integer.parseInt(txtKARCantLim01.getText()),
				txtKAR1ObsRef0.getText(), updateFicha));
		compArq.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, null,
				Integer.parseInt(txtKARCantLim10.getText()), Integer.parseInt(txtKARCantLim11.getText()),
				txtKAR1ObsRef1.getText(), updateFicha));
		compArq.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, null,
				Integer.parseInt(txtKARCantLim20.getText()), Integer.parseInt(txtKARCantLim21.getText()),
				txtKAR1ObsRef2.getText(), updateFicha));
		compArq.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, null,
				Integer.parseInt(txtKARCantLim30.getText()), Integer.parseInt(txtKARCantLim31.getText()),
				txtKAR1ObsRef3.getText(), updateFicha));
		compArq.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, null,
				Integer.parseInt(txtKARCantLim40.getText()), Integer.parseInt(txtKARCantLim41.getText()),
				txtKAR1ObsRef4.getText(), updateFicha));
		compArq.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, null,
				Integer.parseInt(txtKARCantLim50.getText()), Integer.parseInt(txtKARCantLim51.getText()),
				txtKAR1ObsRef5.getText(), updateFicha));
		compArq.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, null,
				Integer.parseInt(txtKARCantLim60.getText()), Integer.parseInt(txtKARCantLim61.getText()),
				txtKAR1ObsRef6.getText(), updateFicha));
		compArq.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, null,
				Integer.parseInt(txtKARCantLim70.getText()), Integer.parseInt(txtKARCantLim71.getText()),
				txtKAR1ObsRef7.getText(), updateFicha));
		compArq.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, null,
				Integer.parseInt(txtKARCantLim80.getText()), Integer.parseInt(txtKARCantLim81.getText()),
				txtKAR1ObsRef8.getText(), updateFicha));
		compArq.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, null,
				Integer.parseInt(txtKARCantLim90.getText()), Integer.parseInt(txtKARCantLim91.getText()),
				txtKAR1ObsRef9.getText(), updateFicha));
		compArq.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, null,
				Integer.parseInt(txtKARCantLim100.getText()), Integer.parseInt(txtKARCantLim101.getText()),
				txtKAR1ObsRef10.getText(), updateFicha));
		compArq.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, null,
				Integer.parseInt(txtKARCantLim110.getText()), Integer.parseInt(txtKARCantLim111.getText()),
				txtKAR1ObsRef11.getText(), updateFicha));
		compArq.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, null,
				Integer.parseInt(txtKARCantLim120.getText()), Integer.parseInt(txtKARCantLim121.getText()),
				txtKAR1ObsRef12.getText(), updateFicha));
		compArq.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, null,
				Integer.parseInt(txtKARCantLim130.getText()), Integer.parseInt(txtKARCantLim131.getText()),
				txtKAR1ObsRef13.getText(), updateFicha));

		TGrupo grupo3 = servicioFicha.buscarGrupo("Kit agua residual");

	}
}
