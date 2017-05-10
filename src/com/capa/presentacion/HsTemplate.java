package com.capa.presentacion;

import static com.capa.util.Constantes.*;
import static com.capa.util.Utilitarios.*;
import static com.capa.util.Validaciones.*;
import static com.capa.negocios.Calculos.calcularPorcentajeAvance;

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
import com.capa.negocios.Query;
import com.capa.negocios.Reporte;
import com.capa.negocios.ServicioCabecera;
import com.capa.negocios.ServicioFicha;
import com.capa.negocios.ServicioInfoObligatoria;
import com.capa.util.Utilitarios;
import com.capa.util.Validaciones;

public class HsTemplate extends JFrame {

	private static final long serialVersionUID = 2991536081432510517L;
	private JPanel contentPane;

	private JTextField txtCantidad00;
	private JTextField txtCantidad01;
	private JTextField txtCantidad10;
	private JTextField txtCantidad11;
	private JTextField txtCantidad20;
	private JTextField txtCantidad21;
	private JTextField txtCantidad30;
	private JTextField txtCantidad31;
	private JTextField txtCantidad40;
	private JTextField txtCantidad41;
	private JTextField txtCantidad50;
	private JTextField txtCantidad51;
	private JTextField txtCantidad60;
	private JTextField txtCantidad61;
	private JTextField txtCantidad70;
	private JTextField txtCantidad71;
	private JTextField txtCantidad80;
	private JTextField txtCantidad81;
	private JTextField txtCantidad90;
	private JTextField txtCantidad91;
	private JTextField txtCantidad100;
	private JTextField txtCantidad101;
	private JTextField txtCantidad110;
	private JTextField txtCantidad111;
	private JTextField txtCantidad120;
	private JTextField txtCantidad121;
	private JTextField txtCantidad130;
	private JTextField txtCantidad131;
	private JTextField txtCantidad140;
	private JTextField txtCantidad141;
	private JTextField txtCantidad150;
	private JTextField txtCantidad151;
	private JTextField txtCantidad160;
	private JTextField txtCantidad161;
	private JTextField txtCantidad170;
	private JTextField txtCantidad171;
	private JTextField txtCantidad180;
	private JTextField txtCantidad181;
	private JTextField txtCantidad190;
	private JTextField txtCantidad191;
	private JTextField txtCantidad200;
	private JTextField txtCantidad201;
	private JTextField txtCantidad210;
	private JTextField txtCantidad211;
	private JTextField txtCantidad220;
	private JTextField txtCantidad221;
	private JTextField txtCantidad230;
	private JTextField txtCantidad231;
	private JTextField txtCantidad240;
	private JTextField txtCantidad241;
	private JTextField txtCantidad250;
	private JTextField txtCantidad251;
	private JTextField txtCantidad260;
	private JTextField txtCantidad261;
	private JTextField txtCantidad270;
	private JTextField txtCantidad271;
	private JTextField txtCantidad280;
	private JTextField txtCantidad281;
	private JTextField txtCantidad290;
	private JTextField txtCantidad291;
	private JTextField txtCantidad300;
	private JTextField txtCantidad301;
	private JTextField txtCantidad310;
	private JTextField txtCantidad311;
	private JTextField txtCantidad320;
	private JTextField txtCantidad321;
	private JTextField txtCantidad330;
	private JTextField txtCantidad331;
	private JTextField txtCantidad340;
	private JTextField txtCantidad341;
	private JTextField txtCantidad350;
	private JTextField txtCantidad351;
	private JTextField txtCantidad360;
	private JTextField txtCantidad361;
	private JTextField txtCantidad370;
	private JTextField txtCantidad371;
	private JTextField txtCantidad380;
	private JTextField txtCantidad381;
	private JTextField txtCantidad390;
	private JTextField txtCantidad391;
	private JTextField txtCantidad400;
	private JTextField txtCantidad401;
	private JTextField txtCantidad410;
	private JTextField txtCantidad411;

	private JTextField txtObs0;
	private JTextField txtObs1;
	private JTextField txtObs2;
	private JTextField txtObs3;
	private JTextField txtObs4;
	private JTextField txtObs5;
	private JTextField txtObs6;
	private JTextField txtObs7;
	private JTextField txtObs8;
	private JTextField txtObs9;
	private JTextField txtObs10;
	private JTextField txtObs11;
	private JTextField txtObs12;
	private JTextField txtObs13;
	private JTextField txtObs14;
	private JTextField txtObs15;
	private JTextField txtObs16;
	private JTextField txtObs17;
	private JTextField txtObs18;
	private JTextField txtObs19;
	private JTextField txtObs20;
	private JTextField txtObs21;
	private JTextField txtObs22;
	private JTextField txtObs23;
	private JTextField txtObs24;
	private JTextField txtObs25;
	private JTextField txtObs26;
	private JTextField txtObs27;

	private JTextField txtObs28;
	private JTextField txtObs29;
	private JTextField txtObs30;
	private JTextField txtObs31;
	private JTextField txtObs32;
	private JTextField txtObs33;
	private JTextField txtObs34;
	private JTextField txtObs35;
	private JTextField txtObs36;
	private JTextField txtObs37;
	private JTextField txtObs38;
	private JTextField txtObs39;
	private JTextField txtObs40;
	private JTextField txtObs41;

	private TFicha ficha;
	private ServicioFicha srvFicha;
	private String fotoInfoObl;

	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// ServicioFicha servicioFicha = new ComponenteFicha();
	//
	// HsTemplate frame = new
	// HsTemplate(servicioFicha.buscarFormulario("HS-1"));
	// frame.setVisible(true);
	// frame.setLocationRelativeTo(null);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	// });
	// }

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
		this.setTitle(Utilitarios.getNombreFicha() + ficha.getFiNombre());
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.ficha = ficha;
		srvFicha = new ComponenteFicha();

		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());

		JPinformacionObligatoria infoObligatoria = new JPinformacionObligatoria(870, 482);
		infoObligatoria.getBtnInsertarFoto().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				fotoInfoObl = getPathImagen();
			}
		});
		contentPane.add(infoObligatoria.getPnlInformacionObl());

		llenarCabecera(cabecera);

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

		JLabel label_17 = new JLabel(LBL_HS_0);
		label_17.setHorizontalAlignment(SwingConstants.RIGHT);
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA10lbls.add(label_17);

		JLabel lblLblhs = new JLabel(LBL_HS_1);
		lblLblhs.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblhs.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA10lbls.add(lblLblhs);

		JLabel lblLblhs_1 = new JLabel(LBL_HS_2);
		lblLblhs_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblhs_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA10lbls.add(lblLblhs_1);

		JLabel lblLblhs_2 = new JLabel(LBL_HS_3);
		lblLblhs_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblhs_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA10lbls.add(lblLblhs_2);

		JLabel lblLblhs_3 = new JLabel(LBL_HS_4);
		lblLblhs_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblhs_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA10lbls.add(lblLblhs_3);

		JLabel lblLblhs_4 = new JLabel(LBL_HS_5);
		lblLblhs_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblhs_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA10lbls.add(lblLblhs_4);

		JLabel lblLblhs_5 = new JLabel(LBL_HS_6);
		lblLblhs_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblhs_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA10lbls.add(lblLblhs_5);

		JLabel lblLblhs_6 = new JLabel(LBL_HS_7);
		lblLblhs_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblhs_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA10lbls.add(lblLblhs_6);

		JLabel lblLblhs_7 = new JLabel(LBL_HS_8);
		lblLblhs_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblhs_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA10lbls.add(lblLblhs_7);

		JLabel lblLblhs_8 = new JLabel(LBL_HS_9);
		lblLblhs_8.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblhs_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA10lbls.add(lblLblhs_8);

		JPanel pnlCA11lbls = new JPanel();
		pnlCA11lbls.setBounds(5, 222, 199, 65);
		pnlCA.add(pnlCA11lbls);
		pnlCA11lbls.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblKitParaConexin = new JLabel(LBL_HS_10);
		lblKitParaConexin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKitParaConexin.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA11lbls.add(lblKitParaConexin);

		JPanel pnlCA12lbls = new JPanel();
		pnlCA12lbls.setBounds(6, 290, 199, 65);
		pnlCA.add(pnlCA12lbls);
		pnlCA12lbls.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblkitParaConexin = new JLabel(LBL_HS_11);
		lblkitParaConexin.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA12lbls.add(lblkitParaConexin);

		JPanel pnlCA13lbls = new JPanel();
		pnlCA13lbls.setBounds(5, 358, 199, 50);
		pnlCA.add(pnlCA13lbls);
		pnlCA13lbls.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblkitParaConexin_1 = new JLabel(LBL_HS_12);
		lblkitParaConexin_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA13lbls.add(lblkitParaConexin_1);

		JPanel pnlCA14lbls = new JPanel();
		pnlCA14lbls.setBounds(5, 410, 199, 50);
		pnlCA.add(pnlCA14lbls);
		pnlCA14lbls.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblkitParaConexin_2 = new JLabel(LBL_HS_13);
		lblkitParaConexin_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlCA14lbls.add(lblkitParaConexin_2);

		JPanel pnlCantidad10CA = new JPanel();
		pnlCantidad10CA.setBounds(210, 20, 55, 200);
		pnlCA.add(pnlCantidad10CA);
		pnlCantidad10CA.setLayout(new GridLayout(10, 2, 0, 0));

		txtCantidad00 = new JTextField();
		txtCantidad00.setText(TXT_HS_0);
		txtCantidad00.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad00.setEditable(false);
		txtCantidad00.setColumns(10);
		pnlCantidad10CA.add(txtCantidad00);

		txtCantidad01 = new JTextField();
		txtCantidad01.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad01.setColumns(10);
		pnlCantidad10CA.add(txtCantidad01);

		txtCantidad10 = new JTextField();
		txtCantidad10.setText(TXT_HS_1);
		txtCantidad10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad10.setEditable(false);
		txtCantidad10.setColumns(10);
		pnlCantidad10CA.add(txtCantidad10);

		txtCantidad11 = new JTextField();
		txtCantidad11.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad11.setColumns(10);
		pnlCantidad10CA.add(txtCantidad11);

		txtCantidad20 = new JTextField();
		txtCantidad20.setText(TXT_HS_2);
		txtCantidad20.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad20.setEditable(false);
		txtCantidad20.setColumns(10);
		pnlCantidad10CA.add(txtCantidad20);

		txtCantidad21 = new JTextField();
		txtCantidad21.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad21.setColumns(10);
		pnlCantidad10CA.add(txtCantidad21);

		txtCantidad30 = new JTextField();
		txtCantidad30.setText(TXT_HS_3);
		txtCantidad30.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad30.setEditable(false);
		txtCantidad30.setColumns(10);
		pnlCantidad10CA.add(txtCantidad30);

		txtCantidad31 = new JTextField();
		txtCantidad31.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad31.setColumns(10);
		pnlCantidad10CA.add(txtCantidad31);

		txtCantidad40 = new JTextField();
		txtCantidad40.setText(TXT_HS_4);
		txtCantidad40.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad40.setEditable(false);
		txtCantidad40.setColumns(10);
		pnlCantidad10CA.add(txtCantidad40);

		txtCantidad41 = new JTextField();
		txtCantidad41.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad41.setColumns(10);
		pnlCantidad10CA.add(txtCantidad41);

		txtCantidad50 = new JTextField();
		txtCantidad50.setText(TXT_HS_5);
		txtCantidad50.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad50.setEditable(false);
		txtCantidad50.setColumns(10);
		pnlCantidad10CA.add(txtCantidad50);

		txtCantidad51 = new JTextField();
		txtCantidad51.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad51.setColumns(10);
		pnlCantidad10CA.add(txtCantidad51);

		txtCantidad60 = new JTextField();
		txtCantidad60.setText(TXT_HS_6);
		txtCantidad60.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad60.setEditable(false);
		txtCantidad60.setColumns(10);
		pnlCantidad10CA.add(txtCantidad60);

		txtCantidad61 = new JTextField();
		txtCantidad61.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad61.setColumns(10);
		pnlCantidad10CA.add(txtCantidad61);

		txtCantidad70 = new JTextField();
		txtCantidad70.setText(TXT_HS_7);
		txtCantidad70.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad70.setEditable(false);
		txtCantidad70.setColumns(10);
		pnlCantidad10CA.add(txtCantidad70);

		txtCantidad71 = new JTextField();
		txtCantidad71.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad71.setColumns(10);
		pnlCantidad10CA.add(txtCantidad71);

		txtCantidad80 = new JTextField();
		txtCantidad80.setText(TXT_HS_8);
		txtCantidad80.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad80.setEditable(false);
		txtCantidad80.setColumns(10);
		pnlCantidad10CA.add(txtCantidad80);

		txtCantidad81 = new JTextField();
		txtCantidad81.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad81.setColumns(10);
		pnlCantidad10CA.add(txtCantidad81);

		txtCantidad90 = new JTextField();
		txtCantidad90.setText(TXT_HS_9);
		txtCantidad90.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad90.setEditable(false);
		txtCantidad90.setColumns(10);
		pnlCantidad10CA.add(txtCantidad90);

		txtCantidad91 = new JTextField();
		txtCantidad91.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad91.setColumns(10);
		pnlCantidad10CA.add(txtCantidad91);

		JPanel pnlCantidad11CA = new JPanel();
		pnlCantidad11CA.setBounds(210, 247, 55, 20);
		pnlCA.add(pnlCantidad11CA);
		pnlCantidad11CA.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad100 = new JTextField();
		txtCantidad100.setText(TXT_HS_10);
		txtCantidad100.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad100.setEditable(false);
		txtCantidad100.setColumns(10);
		pnlCantidad11CA.add(txtCantidad100);

		txtCantidad101 = new JTextField();
		txtCantidad101.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad101.setColumns(10);
		pnlCantidad11CA.add(txtCantidad101);

		JPanel pnlCantidad12CA = new JPanel();
		pnlCantidad12CA.setBounds(210, 308, 55, 20);
		pnlCA.add(pnlCantidad12CA);
		pnlCantidad12CA.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad110 = new JTextField();
		txtCantidad110.setText(TXT_HS_11);
		txtCantidad110.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad110.setEditable(false);
		txtCantidad110.setColumns(10);
		pnlCantidad12CA.add(txtCantidad110);

		txtCantidad111 = new JTextField();
		txtCantidad111.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad111.setColumns(10);
		pnlCantidad12CA.add(txtCantidad111);

		JPanel pnlCantidad13CA = new JPanel();
		pnlCantidad13CA.setBounds(210, 371, 55, 20);
		pnlCA.add(pnlCantidad13CA);
		pnlCantidad13CA.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad120 = new JTextField();
		txtCantidad120.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad120.setText(TXT_HS_12);
		txtCantidad120.setEditable(false);
		txtCantidad120.setColumns(10);
		pnlCantidad13CA.add(txtCantidad120);

		txtCantidad121 = new JTextField();
		txtCantidad121.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad121.setColumns(10);
		pnlCantidad13CA.add(txtCantidad121);

		JPanel pnlCantidad14CA = new JPanel();
		pnlCantidad14CA.setBounds(210, 419, 55, 20);
		pnlCA.add(pnlCantidad14CA);
		pnlCantidad14CA.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad130 = new JTextField();
		txtCantidad130.setText(TXT_HS_13);
		txtCantidad130.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad130.setEditable(false);
		txtCantidad130.setColumns(10);
		pnlCantidad14CA.add(txtCantidad130);

		txtCantidad131 = new JTextField();
		txtCantidad131.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad131.setColumns(10);
		pnlCantidad14CA.add(txtCantidad131);

		JPanel pnlOR10CA = new JPanel();
		pnlOR10CA.setBounds(267, 20, 143, 200);
		pnlCA.add(pnlOR10CA);
		pnlOR10CA.setLayout(new GridLayout(10, 0, 0, 0));

		txtObs0 = new JTextField();
		txtObs0.setColumns(10);
		pnlOR10CA.add(txtObs0);

		txtObs1 = new JTextField();
		txtObs1.setColumns(10);
		pnlOR10CA.add(txtObs1);

		txtObs2 = new JTextField();
		txtObs2.setColumns(10);
		pnlOR10CA.add(txtObs2);

		txtObs3 = new JTextField();
		txtObs3.setColumns(10);
		pnlOR10CA.add(txtObs3);

		txtObs4 = new JTextField();
		txtObs4.setColumns(10);
		pnlOR10CA.add(txtObs4);

		txtObs5 = new JTextField();
		txtObs5.setColumns(10);
		pnlOR10CA.add(txtObs5);

		txtObs6 = new JTextField();
		txtObs6.setColumns(10);
		pnlOR10CA.add(txtObs6);

		txtObs7 = new JTextField();
		txtObs7.setColumns(10);
		pnlOR10CA.add(txtObs7);

		txtObs8 = new JTextField();
		txtObs8.setColumns(10);
		pnlOR10CA.add(txtObs8);

		txtObs9 = new JTextField();
		txtObs9.setColumns(10);
		pnlOR10CA.add(txtObs9);

		JPanel pnlOR11CA = new JPanel();
		pnlOR11CA.setBounds(267, 247, 143, 20);
		pnlCA.add(pnlOR11CA);
		pnlOR11CA.setLayout(new GridLayout(0, 1, 0, 0));

		txtObs10 = new JTextField();
		txtObs10.setColumns(10);
		pnlOR11CA.add(txtObs10);

		JPanel pnlOR12CA = new JPanel();
		pnlOR12CA.setBounds(267, 308, 143, 20);
		pnlCA.add(pnlOR12CA);
		pnlOR12CA.setLayout(new GridLayout(0, 1, 0, 0));

		txtObs11 = new JTextField();
		txtObs11.setColumns(10);
		pnlOR12CA.add(txtObs11);

		JPanel pnlOR13CA = new JPanel();
		pnlOR13CA.setBounds(267, 371, 143, 20);
		pnlCA.add(pnlOR13CA);
		pnlOR13CA.setLayout(new GridLayout(0, 1, 0, 0));

		txtObs12 = new JTextField();
		txtObs12.setColumns(10);
		pnlOR13CA.add(txtObs12);

		JPanel pnlOR14CA = new JPanel();
		pnlOR14CA.setBounds(267, 419, 143, 20);
		pnlCA.add(pnlOR14CA);
		pnlOR14CA.setLayout(new GridLayout(0, 1, 0, 0));

		txtObs13 = new JTextField();
		txtObs13.setColumns(10);
		pnlOR14CA.add(txtObs13);

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

		JLabel lblKAR1TuberiaPVC75_3 = new JLabel(LBL_HS_14);
		lblKAR1TuberiaPVC75_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKAR1TuberiaPVC75_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlEDEtiquetas.add(lblKAR1TuberiaPVC75_3);

		JLabel lblKAR1TuberiaPVC75_2 = new JLabel(LBL_HS_15);
		lblKAR1TuberiaPVC75_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKAR1TuberiaPVC75_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlEDEtiquetas.add(lblKAR1TuberiaPVC75_2);

		JLabel lblKAR1TuberiaPVC110_3 = new JLabel(LBL_HS_16);
		lblKAR1TuberiaPVC110_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKAR1TuberiaPVC110_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlEDEtiquetas.add(lblKAR1TuberiaPVC110_3);

		JPanel pnlEDCantidad = new JPanel();
		pnlEDCantidad.setBounds(210, 17, 55, 60);
		pnlKAR1.add(pnlEDCantidad);
		pnlEDCantidad.setLayout(new GridLayout(3, 2, 0, 0));

		txtCantidad140 = new JTextField();
		txtCantidad140.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad140.setText("15");
		txtCantidad140.setEditable(false);
		txtCantidad140.setColumns(10);
		pnlEDCantidad.add(txtCantidad140);

		txtCantidad141 = new JTextField();
		txtCantidad141.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad141.setColumns(10);
		pnlEDCantidad.add(txtCantidad141);

		txtCantidad150 = new JTextField();
		txtCantidad150.setText(TXT_HS_15);
		txtCantidad150.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad150.setEditable(false);
		txtCantidad150.setColumns(10);
		pnlEDCantidad.add(txtCantidad150);

		txtCantidad151 = new JTextField();
		txtCantidad151.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad151.setColumns(10);
		pnlEDCantidad.add(txtCantidad151);

		txtCantidad160 = new JTextField();
		txtCantidad160.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad160.setText(TXT_HS_16);
		txtCantidad160.setEditable(false);
		txtCantidad160.setColumns(10);
		pnlEDCantidad.add(txtCantidad160);

		txtCantidad161 = new JTextField();
		txtCantidad161.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad161.setColumns(10);
		pnlEDCantidad.add(txtCantidad161);

		JPanel pnlEDObsRef = new JPanel();
		pnlEDObsRef.setBounds(267, 17, 143, 60);
		pnlKAR1.add(pnlEDObsRef);
		pnlEDObsRef.setLayout(new GridLayout(3, 0, 0, 0));

		txtObs14 = new JTextField();
		txtObs14.setColumns(10);
		pnlEDObsRef.add(txtObs14);

		txtObs15 = new JTextField();
		txtObs15.setColumns(10);
		pnlEDObsRef.add(txtObs15);

		txtObs16 = new JTextField();
		txtObs16.setColumns(10);
		pnlEDObsRef.add(txtObs16);

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

		txtCantidad170 = new JTextField();
		txtCantidad170.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad170.setText(TXT_HS_17);
		txtCantidad170.setEditable(false);
		txtCantidad170.setColumns(10);
		panel_12.add(txtCantidad170);

		txtCantidad171 = new JTextField();
		txtCantidad171.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad171.setColumns(10);
		panel_12.add(txtCantidad171);

		txtCantidad180 = new JTextField();
		txtCantidad180.setText(TXT_HS_18);
		txtCantidad180.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad180.setEditable(false);
		txtCantidad180.setColumns(10);
		panel_12.add(txtCantidad180);

		txtCantidad181 = new JTextField();
		txtCantidad181.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad181.setColumns(10);
		panel_12.add(txtCantidad181);

		txtCantidad190 = new JTextField();
		txtCantidad190.setText(TXT_HS_19);
		txtCantidad190.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad190.setEditable(false);
		txtCantidad190.setColumns(10);
		panel_12.add(txtCantidad190);

		txtCantidad191 = new JTextField();
		txtCantidad191.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad191.setColumns(10);
		panel_12.add(txtCantidad191);

		txtCantidad200 = new JTextField();
		txtCantidad200.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad200.setText(TXT_HS_20);
		txtCantidad200.setEditable(false);
		txtCantidad200.setColumns(10);
		panel_12.add(txtCantidad200);

		txtCantidad201 = new JTextField();
		txtCantidad201.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad201.setColumns(10);
		panel_12.add(txtCantidad201);

		txtCantidad210 = new JTextField();
		txtCantidad210.setText(TXT_HS_21);
		txtCantidad210.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad210.setEditable(false);
		txtCantidad210.setColumns(10);
		panel_12.add(txtCantidad210);

		txtCantidad211 = new JTextField();
		txtCantidad211.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad211.setColumns(10);
		panel_12.add(txtCantidad211);

		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBounds(267, 17, 143, 100);
		pnlKAR2.add(panel_14);

		JPanel panel_15 = new JPanel();
		panel_15.setBounds(0, 0, 143, 100);
		panel_14.add(panel_15);
		panel_15.setLayout(new GridLayout(5, 0, 0, 0));

		txtObs17 = new JTextField();
		txtObs17.setColumns(10);
		panel_15.add(txtObs17);

		txtObs18 = new JTextField();
		txtObs18.setColumns(10);
		panel_15.add(txtObs18);

		txtObs19 = new JTextField();
		txtObs19.setColumns(10);
		panel_15.add(txtObs19);

		txtObs20 = new JTextField();
		txtObs20.setColumns(10);
		panel_15.add(txtObs20);

		txtObs21 = new JTextField();
		txtObs21.setColumns(10);
		panel_15.add(txtObs21);

		JLabel lblKAR2KitConexion160 = new JLabel(LBL_HS_27);
		lblKAR2KitConexion160.setBounds(3, 355, 204, 50);
		pnlKAR2.add(lblKAR2KitConexion160);
		lblKAR2KitConexion160.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JLabel lblKAR2KitConexion110 = new JLabel(LBL_HS_26);
		lblKAR2KitConexion110.setBounds(3, 293, 204, 60);
		pnlKAR2.add(lblKAR2KitConexion110);
		lblKAR2KitConexion110.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JLabel lblKAR2KitConexion75 = new JLabel(LBL_HS_25);
		lblKAR2KitConexion75.setBounds(3, 235, 204, 60);
		pnlKAR2.add(lblKAR2KitConexion75);
		lblKAR2KitConexion75.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JLabel lblKAR2KitConexion200 = new JLabel(LBL_HS_24);
		lblKAR2KitConexion200.setBounds(3, 176, 204, 60);
		pnlKAR2.add(lblKAR2KitConexion200);
		lblKAR2KitConexion200.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JPanel panel_17 = new JPanel();
		panel_17.setBounds(3, 17, 204, 100);
		pnlKAR2.add(panel_17);
		panel_17.setLayout(new GridLayout(5, 0, 0, 0));

		JLabel lblLblhs_9 = new JLabel(LBL_HS_17);
		lblLblhs_9.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblhs_9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_17.add(lblLblhs_9);

		JLabel lblLblhs_10 = new JLabel(LBL_HS_18);
		lblLblhs_10.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblhs_10.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_17.add(lblLblhs_10);

		JLabel lblLblhs_11 = new JLabel(LBL_HS_19);
		lblLblhs_11.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblhs_11.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_17.add(lblLblhs_11);

		JLabel lblLblhs_12 = new JLabel(LBL_HS_20);
		lblLblhs_12.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblhs_12.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_17.add(lblLblhs_12);

		JLabel lblLblhs_13 = new JLabel(LBL_HS_21);
		lblLblhs_13.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLblhs_13.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_17.add(lblLblhs_13);

		JLabel lblcajaDeConexin = new JLabel(LBL_HS_22);
		lblcajaDeConexin.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblcajaDeConexin.setBounds(3, 118, 204, 30);
		pnlKAR2.add(lblcajaDeConexin);

		JLabel lblpozoDeInspeccin = new JLabel(LBL_HS_23);
		lblpozoDeInspeccin.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblpozoDeInspeccin.setBounds(3, 148, 204, 30);
		pnlKAR2.add(lblpozoDeInspeccin);

		JPanel panel_18 = new JPanel();
		panel_18.setBounds(210, 120, 55, 20);
		pnlKAR2.add(panel_18);
		panel_18.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad220 = new JTextField();
		txtCantidad220.setText(TXT_HS_22);
		txtCantidad220.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad220.setEditable(false);
		txtCantidad220.setColumns(10);
		panel_18.add(txtCantidad220);

		txtCantidad221 = new JTextField();
		txtCantidad221.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad221.setColumns(10);
		panel_18.add(txtCantidad221);

		JPanel panel_19 = new JPanel();
		panel_19.setBounds(267, 120, 143, 20);
		pnlKAR2.add(panel_19);
		panel_19.setLayout(new GridLayout(0, 1, 0, 0));

		txtObs22 = new JTextField();
		txtObs22.setColumns(10);
		panel_19.add(txtObs22);

		JPanel panel_37 = new JPanel();
		panel_37.setBounds(210, 145, 55, 20);
		pnlKAR2.add(panel_37);
		panel_37.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad230 = new JTextField();
		txtCantidad230.setText(TXT_HS_23);
		txtCantidad230.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad230.setEditable(false);
		txtCantidad230.setColumns(10);
		panel_37.add(txtCantidad230);

		txtCantidad231 = new JTextField();
		txtCantidad231.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad231.setColumns(10);
		panel_37.add(txtCantidad231);

		JPanel panel_38 = new JPanel();
		panel_38.setBounds(267, 145, 143, 20);
		pnlKAR2.add(panel_38);
		panel_38.setLayout(new GridLayout(0, 1, 0, 0));

		txtObs23 = new JTextField();
		txtObs23.setColumns(10);
		panel_38.add(txtObs23);

		JPanel panel_13 = new JPanel();
		panel_13.setBounds(210, 189, 55, 20);
		pnlKAR2.add(panel_13);
		panel_13.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad240 = new JTextField();
		txtCantidad240.setText(TXT_HS_24);
		txtCantidad240.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad240.setEditable(false);
		txtCantidad240.setColumns(10);
		panel_13.add(txtCantidad240);

		txtCantidad241 = new JTextField();
		txtCantidad241.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad241.setColumns(10);
		panel_13.add(txtCantidad241);

		JPanel panel_16 = new JPanel();
		panel_16.setBounds(267, 189, 143, 20);
		pnlKAR2.add(panel_16);
		panel_16.setLayout(new GridLayout(0, 1, 0, 0));

		txtObs24 = new JTextField();
		txtObs24.setColumns(10);
		panel_16.add(txtObs24);

		JPanel panel_31 = new JPanel();
		panel_31.setBounds(210, 247, 55, 20);
		pnlKAR2.add(panel_31);
		panel_31.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad250 = new JTextField();
		txtCantidad250.setText(TXT_HS_25);
		txtCantidad250.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad250.setEditable(false);
		txtCantidad250.setColumns(10);
		panel_31.add(txtCantidad250);

		txtCantidad251 = new JTextField();
		txtCantidad251.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad251.setColumns(10);
		panel_31.add(txtCantidad251);

		JPanel panel_32 = new JPanel();
		panel_32.setBounds(267, 247, 143, 20);
		pnlKAR2.add(panel_32);
		panel_32.setLayout(new GridLayout(0, 1, 0, 0));

		txtObs25 = new JTextField();
		txtObs25.setColumns(10);
		panel_32.add(txtObs25);

		JPanel panel_33 = new JPanel();
		panel_33.setBounds(210, 306, 55, 20);
		pnlKAR2.add(panel_33);
		panel_33.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad260 = new JTextField();
		txtCantidad260.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad260.setText(TXT_HS_26);
		txtCantidad260.setEditable(false);
		txtCantidad260.setColumns(10);
		panel_33.add(txtCantidad260);

		txtCantidad261 = new JTextField();
		txtCantidad261.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad261.setColumns(10);
		panel_33.add(txtCantidad261);

		JPanel panel_34 = new JPanel();
		panel_34.setBounds(267, 306, 143, 20);
		pnlKAR2.add(panel_34);
		panel_34.setLayout(new GridLayout(0, 1, 0, 0));

		txtObs26 = new JTextField();
		txtObs26.setColumns(10);
		panel_34.add(txtObs26);

		JPanel panel_35 = new JPanel();
		panel_35.setBounds(210, 364, 55, 20);
		pnlKAR2.add(panel_35);
		panel_35.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad270 = new JTextField();
		txtCantidad270.setText(TXT_HS_27);
		txtCantidad270.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad270.setEditable(false);
		txtCantidad270.setColumns(10);
		panel_35.add(txtCantidad270);

		txtCantidad271 = new JTextField();
		txtCantidad271.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad271.setColumns(10);
		panel_35.add(txtCantidad271);

		JPanel panel_36 = new JPanel();
		panel_36.setBounds(267, 364, 143, 20);
		pnlKAR2.add(panel_36);
		panel_36.setLayout(new GridLayout(0, 1, 0, 0));

		txtObs27 = new JTextField();
		txtObs27.setColumns(10);
		panel_36.add(txtObs27);

		JPanel pnlKAP1 = new JPanel();
		pnlKAP1.setLayout(null);
		pnlKAP1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlKAP1.setBounds(434, 420, 414, 134);
		pnlPestaña1.add(pnlKAP1);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(3, 17, 199, 80);
		pnlKAP1.add(panel_7);
		panel_7.setLayout(new GridLayout(4, 0, 0, 0));

		JLabel lblKAP1TuberiaPVC05_3 = new JLabel(LBL_HS_28);
		lblKAP1TuberiaPVC05_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKAP1TuberiaPVC05_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_7.add(lblKAP1TuberiaPVC05_3);

		JLabel lblKAP1TuberiaPVC34_3 = new JLabel(LBL_HS_29);
		lblKAP1TuberiaPVC34_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKAP1TuberiaPVC34_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_7.add(lblKAP1TuberiaPVC34_3);

		JLabel lblKAP1TuberiaPVC1_3 = new JLabel(LBL_HS_30);
		lblKAP1TuberiaPVC1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKAP1TuberiaPVC1_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_7.add(lblKAP1TuberiaPVC1_3);

		JLabel lblKAP1TuberiaPVC1_05_3 = new JLabel(LBL_HS_31);
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

		JLabel lblcajasDeConexin = new JLabel(LBL_HS_32);
		lblcajasDeConexin.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblcajasDeConexin.setBounds(3, 100, 199, 30);
		pnlKAP1.add(lblcajasDeConexin);

		JPanel panel_8 = new JPanel();
		panel_8.setBounds(208, 17, 55, 80);
		pnlKAP1.add(panel_8);
		panel_8.setLayout(new GridLayout(0, 2, 0, 0));

		txtCantidad280 = new JTextField();
		txtCantidad280.setText(TXT_HS_28);
		txtCantidad280.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad280.setEditable(false);
		txtCantidad280.setColumns(10);
		panel_8.add(txtCantidad280);

		txtCantidad281 = new JTextField();
		txtCantidad281.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad281.setColumns(10);
		panel_8.add(txtCantidad281);

		txtCantidad290 = new JTextField();
		txtCantidad290.setText(TXT_HS_29);
		txtCantidad290.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad290.setEditable(false);
		txtCantidad290.setColumns(10);
		panel_8.add(txtCantidad290);

		txtCantidad291 = new JTextField();
		txtCantidad291.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad291.setColumns(10);
		panel_8.add(txtCantidad291);

		txtCantidad300 = new JTextField();
		txtCantidad300.setText(TXT_HS_30);
		txtCantidad300.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad300.setEditable(false);
		txtCantidad300.setColumns(10);
		panel_8.add(txtCantidad300);

		txtCantidad301 = new JTextField();
		txtCantidad301.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad301.setColumns(10);
		panel_8.add(txtCantidad301);

		txtCantidad310 = new JTextField();
		txtCantidad310.setText(TXT_HS_31);
		txtCantidad310.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad310.setEditable(false);
		txtCantidad310.setColumns(10);
		panel_8.add(txtCantidad310);

		txtCantidad311 = new JTextField();
		txtCantidad311.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad311.setColumns(10);
		panel_8.add(txtCantidad311);

		JPanel panel_9 = new JPanel();
		panel_9.setBounds(266, 17, 143, 80);
		pnlKAP1.add(panel_9);
		panel_9.setLayout(new GridLayout(4, 0, 0, 0));

		txtObs28 = new JTextField();
		txtObs28.setColumns(10);
		panel_9.add(txtObs28);

		txtObs29 = new JTextField();
		txtObs29.setColumns(10);
		panel_9.add(txtObs29);

		txtObs30 = new JTextField();
		txtObs30.setColumns(10);
		panel_9.add(txtObs30);

		txtObs31 = new JTextField();
		txtObs31.setColumns(10);
		panel_9.add(txtObs31);

		JPanel panel_39 = new JPanel();
		panel_39.setBounds(208, 103, 55, 20);
		pnlKAP1.add(panel_39);
		panel_39.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad320 = new JTextField();
		txtCantidad320.setText(TXT_HS_32);
		txtCantidad320.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad320.setEditable(false);
		txtCantidad320.setColumns(10);
		panel_39.add(txtCantidad320);

		txtCantidad321 = new JTextField();
		txtCantidad321.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad321.setColumns(10);
		panel_39.add(txtCantidad321);

		JPanel panel_40 = new JPanel();
		panel_40.setBounds(265, 103, 143, 20);
		pnlKAP1.add(panel_40);
		panel_40.setLayout(new GridLayout(0, 1, 0, 0));

		txtObs32 = new JTextField();
		txtObs32.setColumns(10);
		panel_40.add(txtObs32);

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

		JLabel lblbebederosLlavesLlave = new JLabel(LBL_HS_33);
		lblbebederosLlavesLlave.setHorizontalAlignment(SwingConstants.RIGHT);
		lblbebederosLlavesLlave.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblbebederosLlavesLlave.setBounds(3, 20, 205, 44);
		pnlKAP2.add(lblbebederosLlavesLlave);

		JPanel panel_20 = new JPanel();
		panel_20.setBounds(3, 68, 205, 170);
		pnlKAP2.add(panel_20);
		panel_20.setLayout(new GridLayout(5, 0, 0, 0));

		JLabel lbltomaDeRiego = new JLabel(LBL_HS_34);
		lbltomaDeRiego.setHorizontalAlignment(SwingConstants.RIGHT);
		lbltomaDeRiego.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_20.add(lbltomaDeRiego);

		JLabel lblkitParaConexin_3 = new JLabel(LBL_HS_35);
		lblkitParaConexin_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_20.add(lblkitParaConexin_3);

		JLabel lblkitParaConexin_4 = new JLabel(LBL_HS_36);
		lblkitParaConexin_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_20.add(lblkitParaConexin_4);

		JLabel lblkitParaConexin_5 = new JLabel(LBL_HS_37);
		lblkitParaConexin_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_20.add(lblkitParaConexin_5);

		JLabel lblkitParaConexin_6 = new JLabel(LBL_HS_38);
		lblkitParaConexin_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_20.add(lblkitParaConexin_6);

		JPanel panel_21 = new JPanel();
		panel_21.setBounds(210, 68, 55, 170);
		pnlKAP2.add(panel_21);
		panel_21.setLayout(new GridLayout(0, 2, 0, 14));

		txtCantidad340 = new JTextField();
		txtCantidad340.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad340.setText(TXT_HS_34);
		txtCantidad340.setEditable(false);
		txtCantidad340.setColumns(10);
		panel_21.add(txtCantidad340);

		txtCantidad341 = new JTextField();
		txtCantidad341.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad341.setColumns(10);
		panel_21.add(txtCantidad341);

		txtCantidad350 = new JTextField();
		txtCantidad350.setText(TXT_HS_35);
		txtCantidad350.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad350.setEditable(false);
		txtCantidad350.setColumns(10);
		panel_21.add(txtCantidad350);

		txtCantidad351 = new JTextField();
		txtCantidad351.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad351.setColumns(10);
		panel_21.add(txtCantidad351);

		txtCantidad360 = new JTextField();
		txtCantidad360.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad360.setText(TXT_HS_36);
		txtCantidad360.setEditable(false);
		txtCantidad360.setColumns(10);
		panel_21.add(txtCantidad360);

		txtCantidad361 = new JTextField();
		txtCantidad361.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad361.setColumns(10);
		panel_21.add(txtCantidad361);

		txtCantidad370 = new JTextField();
		txtCantidad370.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad370.setText(TXT_HS_37);
		txtCantidad370.setEditable(false);
		txtCantidad370.setColumns(10);
		panel_21.add(txtCantidad370);

		txtCantidad371 = new JTextField();
		txtCantidad371.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad371.setColumns(10);
		panel_21.add(txtCantidad371);

		txtCantidad380 = new JTextField();
		txtCantidad380.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad380.setText(TXT_HS_38);
		txtCantidad380.setEditable(false);
		txtCantidad380.setColumns(10);
		panel_21.add(txtCantidad380);

		txtCantidad381 = new JTextField();
		txtCantidad381.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad381.setColumns(10);
		panel_21.add(txtCantidad381);

		JPanel panel_22 = new JPanel();
		panel_22.setBounds(267, 68, 143, 170);
		pnlKAP2.add(panel_22);
		panel_22.setLayout(new GridLayout(5, 0, 0, 14));

		txtObs34 = new JTextField();
		txtObs34.setColumns(10);
		panel_22.add(txtObs34);

		txtObs35 = new JTextField();
		txtObs35.setColumns(10);
		panel_22.add(txtObs35);

		txtObs36 = new JTextField();
		txtObs36.setColumns(10);
		panel_22.add(txtObs36);

		txtObs37 = new JTextField();
		txtObs37.setColumns(10);
		panel_22.add(txtObs37);

		txtObs38 = new JTextField();
		txtObs38.setColumns(10);
		panel_22.add(txtObs38);

		JPanel panel_23 = new JPanel();
		panel_23.setBounds(210, 26, 55, 20);
		pnlKAP2.add(panel_23);
		panel_23.setLayout(new GridLayout(1, 2, 0, 0));

		txtCantidad330 = new JTextField();
		txtCantidad330.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad330.setText(TXT_HS_33);
		txtCantidad330.setEditable(false);
		txtCantidad330.setColumns(10);
		panel_23.add(txtCantidad330);

		txtCantidad331 = new JTextField();
		txtCantidad331.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad331.setColumns(10);
		panel_23.add(txtCantidad331);

		JPanel panel_41 = new JPanel();
		panel_41.setBounds(267, 26, 143, 20);
		pnlKAP2.add(panel_41);
		panel_41.setLayout(new GridLayout(0, 1, 0, 0));

		txtObs33 = new JTextField();
		txtObs33.setColumns(10);
		panel_41.add(txtObs33);

		JPanel pnlKH = new JPanel();
		pnlKH.setLayout(null);
		pnlKH.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlKH.setBounds(858, 257, 414, 84);
		pnlPestaña1.add(pnlKH);

		JPanel pnlBAEtiquetas = new JPanel();
		pnlBAEtiquetas.setBounds(3, 17, 205, 60);
		pnlKH.add(pnlBAEtiquetas);
		pnlBAEtiquetas.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel lblKHBomba3hp = new JLabel(LBL_HS_39);
		lblKHBomba3hp.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKHBomba3hp.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlBAEtiquetas.add(lblKHBomba3hp);

		JLabel lblKHSetAccesorios = new JLabel(LBL_HS_40);
		lblKHSetAccesorios.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKHSetAccesorios.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlBAEtiquetas.add(lblKHSetAccesorios);

		JLabel lblKHTanque55gl = new JLabel(LBL_HS_41);
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

		txtCantidad390 = new JTextField();
		txtCantidad390.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad390.setText(TXT_HS_39);
		txtCantidad390.setEditable(false);
		txtCantidad390.setColumns(10);
		panel_42.add(txtCantidad390);

		txtCantidad391 = new JTextField();
		txtCantidad391.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad391.setColumns(10);
		panel_42.add(txtCantidad391);

		txtCantidad400 = new JTextField();
		txtCantidad400.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad400.setText(TXT_HS_40);
		txtCantidad400.setEditable(false);
		txtCantidad400.setColumns(10);
		panel_42.add(txtCantidad400);

		txtCantidad401 = new JTextField();
		txtCantidad401.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad401.setColumns(10);
		panel_42.add(txtCantidad401);

		txtCantidad410 = new JTextField();
		txtCantidad410.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad410.setText(TXT_HS_41);
		txtCantidad410.setEditable(false);
		txtCantidad410.setColumns(10);
		panel_42.add(txtCantidad410);

		txtCantidad411 = new JTextField();
		txtCantidad411.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad411.setColumns(10);
		panel_42.add(txtCantidad411);

		JPanel panel_43 = new JPanel();
		panel_43.setBounds(267, 17, 143, 60);
		pnlKH.add(panel_43);
		panel_43.setLayout(new GridLayout(0, 1, 0, 0));

		txtObs39 = new JTextField();
		txtObs39.setColumns(10);
		panel_43.add(txtObs39);

		txtObs40 = new JTextField();
		txtObs40.setColumns(10);
		panel_43.add(txtObs40);

		txtObs41 = new JTextField();
		txtObs41.setColumns(10);
		panel_43.add(txtObs41);

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
		validarDigitos(txtCantidad411);

		llenarFicha();

		cabecera.getBtnRegistrar().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				TInformacionObligatoria infoObl = cargarInfoObligatoria(infoObligatoria);
				infoObl.setIoFotoPath(fotoInfoObl);

				if (validarInfo(infoObl)) {
					ServicioInfoObligatoria srvInfoObl = new ComponenteInfoObligatoria();
					// infoObl.setIoSerial(srvInfoObl.serialInfoOblMax());
					List<TdetalleFicha> detallesFicha = getListaGrupos(infoObl);

					if (detallesFicha == null) {
						JOptionPane.showMessageDialog(null,
								"ERROR: Verificar que los registros no se encuentren VACÍOS", "Mensaje de Error",
								JOptionPane.ERROR_MESSAGE);
						return;
					}

					if (Validaciones.registrosValidados(detallesFicha)) {
						srvInfoObl.crear(infoObl);
						infoObl.setIoSerial(srvInfoObl.serialInfoOblMax());
						srvFicha.guardarFormulario(getListaGrupos(infoObl));
						HashMap<String, Object> parametros = new HashMap<String, Object>();
						parametros.put("serial_cabecera", Utilitarios.gettCabecera().getCSerial());
						parametros.put("serial_ficha", ficha.getFiSerial());
						Reporte reporte = new Reporte("Reporte HS", 280, 10, 850, 750);
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
					JOptionPane.showMessageDialog(null, "Ingresar datos en Información Obligatoria");
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

	private List<TdetalleFicha> getListaGrupos(TInformacionObligatoria infoObligatoria) {
		ServicioCabecera srvCabecera = new ComponenteCabecera();
		ServicioFicha servicioFicha = new ComponenteFicha();
		BigDecimal porcentajeAvance;

		TCabecera cabecera = srvCabecera.buscarProyecto(gettCabecera().getCNombreProyecto());
		Integer updateFicha = servicioFicha.nActualizacionFicha(gettCabecera(), ficha);
		// if (updateFicha == -1) {
		// updateFicha = 0;
		// } else {
		// updateFicha++;
		// }

		if (isFichaC1()) {
			updateFicha++;
		} else {
			updateFicha = -1;
		}

		List<TdetalleFicha> detallesFicha = new LinkedList<>();
		TGrupo grupo1 = servicioFicha.buscarGrupo("Componente arquitectónico");
		TGrupo grupo2 = servicioFicha.buscarGrupo("Kit agua residual");
		TGrupo grupo3 = servicioFicha.buscarGrupo("Kit agua potable");
		TGrupo grupo4 = servicioFicha.buscarGrupo("Kit hidroneumático");

		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad00.getText()),
				Integer.parseInt(txtCantidad01.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, quitarEtiquetasHTML(LBL_HS_0),
				Integer.parseInt(txtCantidad00.getText()), Integer.parseInt(txtCantidad01.getText()), txtObs0.getText(),
				updateFicha, porcentajeAvance, ITEM_HS_0, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad10.getText()),
				Integer.parseInt(txtCantidad11.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, quitarEtiquetasHTML(LBL_HS_1),
				Integer.parseInt(txtCantidad10.getText()), Integer.parseInt(txtCantidad11.getText()), txtObs1.getText(),
				updateFicha, porcentajeAvance, ITEM_HS_1, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad20.getText()),
				Integer.parseInt(txtCantidad21.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, quitarEtiquetasHTML(LBL_HS_2),
				Integer.parseInt(txtCantidad20.getText()), Integer.parseInt(txtCantidad21.getText()), txtObs2.getText(),
				updateFicha, porcentajeAvance, ITEM_HS_2, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad30.getText()),
				Integer.parseInt(txtCantidad31.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, quitarEtiquetasHTML(LBL_HS_3),
				Integer.parseInt(txtCantidad30.getText()), Integer.parseInt(txtCantidad31.getText()), txtObs3.getText(),
				updateFicha, porcentajeAvance, ITEM_HS_3, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad40.getText()),
				Integer.parseInt(txtCantidad41.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, quitarEtiquetasHTML(LBL_HS_4),
				Integer.parseInt(txtCantidad40.getText()), Integer.parseInt(txtCantidad41.getText()), txtObs4.getText(),
				updateFicha, porcentajeAvance, ITEM_HS_4, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad50.getText()),
				Integer.parseInt(txtCantidad51.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, quitarEtiquetasHTML(LBL_HS_5),
				Integer.parseInt(txtCantidad50.getText()), Integer.parseInt(txtCantidad51.getText()), txtObs5.getText(),
				updateFicha, porcentajeAvance, ITEM_HS_5, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad60.getText()),
				Integer.parseInt(txtCantidad61.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, quitarEtiquetasHTML(LBL_HS_6),
				Integer.parseInt(txtCantidad60.getText()), Integer.parseInt(txtCantidad61.getText()), txtObs6.getText(),
				updateFicha, porcentajeAvance, ITEM_HS_6, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad70.getText()),
				Integer.parseInt(txtCantidad71.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, quitarEtiquetasHTML(LBL_HS_7),
				Integer.parseInt(txtCantidad70.getText()), Integer.parseInt(txtCantidad71.getText()), txtObs7.getText(),
				updateFicha, porcentajeAvance, ITEM_HS_7, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad80.getText()),
				Integer.parseInt(txtCantidad81.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, quitarEtiquetasHTML(LBL_HS_8),
				Integer.parseInt(txtCantidad80.getText()), Integer.parseInt(txtCantidad81.getText()), txtObs8.getText(),
				updateFicha, porcentajeAvance, ITEM_HS_8, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad90.getText()),
				Integer.parseInt(txtCantidad91.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, quitarEtiquetasHTML(LBL_HS_9),
				Integer.parseInt(txtCantidad90.getText()), Integer.parseInt(txtCantidad91.getText()), txtObs9.getText(),
				updateFicha, porcentajeAvance, ITEM_HS_9, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad100.getText()),
				Integer.parseInt(txtCantidad101.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, quitarEtiquetasHTML(LBL_HS_10),
				Integer.parseInt(txtCantidad100.getText()), Integer.parseInt(txtCantidad101.getText()),
				txtObs10.getText(), updateFicha, porcentajeAvance, ITEM_HS_10, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad110.getText()),
				Integer.parseInt(txtCantidad111.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, quitarEtiquetasHTML(LBL_HS_11),
				Integer.parseInt(txtCantidad110.getText()), Integer.parseInt(txtCantidad111.getText()),
				txtObs11.getText(), updateFicha, porcentajeAvance, ITEM_HS_11, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad120.getText()),
				Integer.parseInt(txtCantidad121.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, quitarEtiquetasHTML(LBL_HS_12),
				Integer.parseInt(txtCantidad120.getText()), Integer.parseInt(txtCantidad121.getText()),
				txtObs12.getText(), updateFicha, porcentajeAvance, ITEM_HS_12, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad130.getText()),
				Integer.parseInt(txtCantidad131.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo1, ficha, quitarEtiquetasHTML(LBL_HS_13),
				Integer.parseInt(txtCantidad130.getText()), Integer.parseInt(txtCantidad131.getText()),
				txtObs13.getText(), updateFicha, porcentajeAvance, ITEM_HS_13, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad140.getText()),
				Integer.parseInt(txtCantidad141.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, quitarEtiquetasHTML(LBL_HS_14),
				Integer.parseInt(txtCantidad140.getText()), Integer.parseInt(txtCantidad141.getText()),
				txtObs14.getText(), updateFicha, porcentajeAvance, ITEM_HS_14, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad150.getText()),
				Integer.parseInt(txtCantidad151.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, quitarEtiquetasHTML(LBL_HS_15),
				Integer.parseInt(txtCantidad150.getText()), Integer.parseInt(txtCantidad151.getText()),
				txtObs15.getText(), updateFicha, porcentajeAvance, ITEM_HS_15, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad160.getText()),
				Integer.parseInt(txtCantidad161.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, quitarEtiquetasHTML(LBL_HS_16),
				Integer.parseInt(txtCantidad160.getText()), Integer.parseInt(txtCantidad161.getText()),
				txtObs16.getText(), updateFicha, porcentajeAvance, ITEM_HS_16, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad170.getText()),
				Integer.parseInt(txtCantidad171.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, quitarEtiquetasHTML(LBL_HS_17),
				Integer.parseInt(txtCantidad170.getText()), Integer.parseInt(txtCantidad171.getText()),
				txtObs17.getText(), updateFicha, porcentajeAvance, ITEM_HS_17, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad180.getText()),
				Integer.parseInt(txtCantidad181.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, quitarEtiquetasHTML(LBL_HS_18),
				Integer.parseInt(txtCantidad180.getText()), Integer.parseInt(txtCantidad181.getText()),
				txtObs18.getText(), updateFicha, porcentajeAvance, ITEM_HS_18, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad190.getText()),
				Integer.parseInt(txtCantidad191.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, quitarEtiquetasHTML(LBL_HS_19),
				Integer.parseInt(txtCantidad190.getText()), Integer.parseInt(txtCantidad191.getText()),
				txtObs19.getText(), updateFicha, porcentajeAvance, ITEM_HS_19, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad200.getText()),
				Integer.parseInt(txtCantidad201.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, quitarEtiquetasHTML(LBL_HS_20),
				Integer.parseInt(txtCantidad200.getText()), Integer.parseInt(txtCantidad201.getText()),
				txtObs20.getText(), updateFicha, porcentajeAvance, ITEM_HS_20, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad210.getText()),
				Integer.parseInt(txtCantidad211.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, quitarEtiquetasHTML(LBL_HS_21),
				Integer.parseInt(txtCantidad210.getText()), Integer.parseInt(txtCantidad211.getText()),
				txtObs21.getText(), updateFicha, porcentajeAvance, ITEM_HS_21, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad220.getText()),
				Integer.parseInt(txtCantidad221.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, quitarEtiquetasHTML(LBL_HS_22),
				Integer.parseInt(txtCantidad220.getText()), Integer.parseInt(txtCantidad221.getText()),
				txtObs22.getText(), updateFicha, porcentajeAvance, ITEM_HS_22, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad230.getText()),
				Integer.parseInt(txtCantidad231.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, quitarEtiquetasHTML(LBL_HS_23),
				Integer.parseInt(txtCantidad230.getText()), Integer.parseInt(txtCantidad231.getText()),
				txtObs23.getText(), updateFicha, porcentajeAvance, ITEM_HS_23, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad240.getText()),
				Integer.parseInt(txtCantidad241.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, quitarEtiquetasHTML(LBL_HS_24),
				Integer.parseInt(txtCantidad240.getText()), Integer.parseInt(txtCantidad241.getText()),
				txtObs24.getText(), updateFicha, porcentajeAvance, ITEM_HS_24, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad250.getText()),
				Integer.parseInt(txtCantidad251.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, quitarEtiquetasHTML(LBL_HS_25),
				Integer.parseInt(txtCantidad250.getText()), Integer.parseInt(txtCantidad251.getText()),
				txtObs25.getText(), updateFicha, porcentajeAvance, ITEM_HS_25, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad260.getText()),
				Integer.parseInt(txtCantidad261.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, quitarEtiquetasHTML(LBL_HS_26),
				Integer.parseInt(txtCantidad260.getText()), Integer.parseInt(txtCantidad261.getText()),
				txtObs26.getText(), updateFicha, porcentajeAvance, ITEM_HS_26, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad270.getText()),
				Integer.parseInt(txtCantidad271.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo2, ficha, quitarEtiquetasHTML(LBL_HS_27),
				Integer.parseInt(txtCantidad270.getText()), Integer.parseInt(txtCantidad271.getText()),
				txtObs27.getText(), updateFicha, porcentajeAvance, ITEM_HS_27, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad280.getText()),
				Integer.parseInt(txtCantidad281.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo3, ficha, quitarEtiquetasHTML(LBL_HS_28),
				Integer.parseInt(txtCantidad280.getText()), Integer.parseInt(txtCantidad281.getText()),
				txtObs28.getText(), updateFicha, porcentajeAvance, ITEM_HS_28, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad290.getText()),
				Integer.parseInt(txtCantidad291.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo3, ficha, quitarEtiquetasHTML(LBL_HS_29),
				Integer.parseInt(txtCantidad290.getText()), Integer.parseInt(txtCantidad291.getText()),
				txtObs29.getText(), updateFicha, porcentajeAvance, ITEM_HS_29, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad300.getText()),
				Integer.parseInt(txtCantidad301.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo3, ficha, quitarEtiquetasHTML(LBL_HS_30),
				Integer.parseInt(txtCantidad300.getText()), Integer.parseInt(txtCantidad301.getText()),
				txtObs30.getText(), updateFicha, porcentajeAvance, ITEM_HS_30, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad310.getText()),
				Integer.parseInt(txtCantidad311.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo3, ficha, quitarEtiquetasHTML(LBL_HS_31),
				Integer.parseInt(txtCantidad310.getText()), Integer.parseInt(txtCantidad311.getText()),
				txtObs31.getText(), updateFicha, porcentajeAvance, ITEM_HS_31, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad320.getText()),
				Integer.parseInt(txtCantidad321.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo3, ficha, quitarEtiquetasHTML(LBL_HS_32),
				Integer.parseInt(txtCantidad320.getText()), Integer.parseInt(txtCantidad321.getText()),
				txtObs32.getText(), updateFicha, porcentajeAvance, ITEM_HS_32, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad330.getText()),
				Integer.parseInt(txtCantidad331.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo3, ficha, quitarEtiquetasHTML(LBL_HS_33),
				Integer.parseInt(txtCantidad330.getText()), Integer.parseInt(txtCantidad331.getText()),
				txtObs33.getText(), updateFicha, porcentajeAvance, ITEM_HS_33, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad340.getText()),
				Integer.parseInt(txtCantidad341.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo3, ficha, quitarEtiquetasHTML(LBL_HS_34),
				Integer.parseInt(txtCantidad340.getText()), Integer.parseInt(txtCantidad341.getText()),
				txtObs34.getText(), updateFicha, porcentajeAvance, ITEM_HS_34, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad350.getText()),
				Integer.parseInt(txtCantidad351.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo3, ficha, quitarEtiquetasHTML(LBL_HS_35),
				Integer.parseInt(txtCantidad350.getText()), Integer.parseInt(txtCantidad351.getText()),
				txtObs35.getText(), updateFicha, porcentajeAvance, ITEM_HS_35, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad360.getText()),
				Integer.parseInt(txtCantidad361.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo3, ficha, quitarEtiquetasHTML(LBL_HS_36),
				Integer.parseInt(txtCantidad360.getText()), Integer.parseInt(txtCantidad361.getText()),
				txtObs36.getText(), updateFicha, porcentajeAvance, ITEM_HS_36, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad370.getText()),
				Integer.parseInt(txtCantidad371.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo3, ficha, quitarEtiquetasHTML(LBL_HS_37),
				Integer.parseInt(txtCantidad370.getText()), Integer.parseInt(txtCantidad371.getText()),
				txtObs37.getText(), updateFicha, porcentajeAvance, ITEM_HS_37, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad380.getText()),
				Integer.parseInt(txtCantidad381.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo3, ficha, quitarEtiquetasHTML(LBL_HS_38),
				Integer.parseInt(txtCantidad380.getText()), Integer.parseInt(txtCantidad381.getText()),
				txtObs38.getText(), updateFicha, porcentajeAvance, ITEM_HS_38, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad390.getText()),
				Integer.parseInt(txtCantidad391.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo4, ficha, quitarEtiquetasHTML(LBL_HS_39),
				Integer.parseInt(txtCantidad390.getText()), Integer.parseInt(txtCantidad391.getText()),
				txtObs39.getText(), updateFicha, porcentajeAvance, ITEM_HS_39, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad400.getText()),
				Integer.parseInt(txtCantidad401.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo4, ficha, quitarEtiquetasHTML(LBL_HS_40),
				Integer.parseInt(txtCantidad400.getText()), Integer.parseInt(txtCantidad401.getText()),
				txtObs40.getText(), updateFicha, porcentajeAvance, ITEM_HS_40, "UNIDAD"));
		porcentajeAvance = calcularPorcentajeAvance(Integer.parseInt(txtCantidad410.getText()),
				Integer.parseInt(txtCantidad411.getText()));
		detallesFicha.add(new TdetalleFicha(cabecera, infoObligatoria, grupo4, ficha, quitarEtiquetasHTML(LBL_HS_41),
				Integer.parseInt(txtCantidad410.getText()), Integer.parseInt(txtCantidad411.getText()),
				txtObs41.getText(), updateFicha, porcentajeAvance, ITEM_HS_41, "UNIDAD"));
		return detallesFicha;
	}

	public void llenarFicha() {
		List<TdetalleFicha> listaDetalles = srvFicha.detallesFicha(gettCabecera(), ficha);
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
				txtCantidad411.setText(String.valueOf(listaDetalles.get(41).getDetCantidadEjecutada()));

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
				txtObs41.setText(listaDetalles.get(41).getDetObsRef());
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
		txtCantidad411.setText(String.valueOf(0));

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
		txtObs41.setText("");
	}
}
