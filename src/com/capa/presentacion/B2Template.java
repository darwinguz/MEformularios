package com.capa.presentacion;
import static com.capa.util.Constantes.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import com.capa.datos.TFicha;
import com.capa.negocios.ComponenteCabecera;
import com.capa.negocios.ComponenteFicha;
import com.capa.negocios.ComponenteInfoObligatoria;
import com.capa.negocios.ServicioCabecera;
import com.capa.negocios.ServicioFicha;
import com.capa.negocios.ServicioInfoObligatoria;
import com.capa.util.Utilitarios;
import com.toedter.calendar.JCalendarBeanInfo;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JTextField;

public class B2Template extends JFrame {

	private JPanel pnlPrincipal;
	private JPcabecera jpCabecera;

	public ServicioFicha srvFicha = new ComponenteFicha();
	public ServicioInfoObligatoria srvInfoObl = new ComponenteInfoObligatoria();
	public ServicioCabecera srvTempCabecera = new ComponenteCabecera();
	public ServicioCabecera srvCabecera = new ComponenteCabecera();

	private TFicha ficha;
	private JTextField txtCantidad00;
	private JTextField txtCantidad01;
	private JTextField txtCantidad10;
	private JTextField txtCantidad11;
	private JTextField txtCantidad20;
	private JTextField txtCantidad41;
	private JTextField txtCantidad21;
	private JTextField txtCantidad30;
	private JTextField txtCantidad31;
	private JTextField txtCantidad40;
	private JTextField txtObs0;
	private JTextField txtObs1;
	private JTextField txtObs2;
	private JTextField txtObs3;
	private JTextField txtObs4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					B2Template frame = new B2Template();
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
	public B2Template() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 1318, 740);
		pnlPrincipal = new JPanel();
		pnlPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pnlPrincipal);
		pnlPrincipal.setLayout(null);
		// this.setTitle(Utilitarios.getNombreFicha() + ficha.getFiNombre());
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		// this.ficha = ficha;

		cargarCabecera();
		cargarInformacionObligatoria(new JPinformacionObligatoria(859, 348));

	}

	private void cargarInformacionObligatoria(JPinformacionObligatoria jpIObligatoria) {

		jpIObligatoria.getBtnInsertarFoto().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jpIObligatoria.setPathFotoIO(Utilitarios.getPathImagen());
			}
		});

		cargarTabbedPanel(jpIObligatoria);
	}

	public void cargarTabbedPanel(JPinformacionObligatoria jpIObligatoria) {

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 115, 1286, 594);
		pnlPrincipal.add(tabbedPane);

		JPanel pnlPestaña1 = new JPanel();
		pnlPestaña1.setLayout(null);
		tabbedPane.addTab("1.-  + ficha.getFiDescripcion()", null, pnlPestaña1, null);

		cargarPanelPestaña1(pnlPestaña1);

		JPanel pnlPestaña2 = new JPanel();
		pnlPestaña2.setLayout(null);
		pnlPestaña2.add(jpIObligatoria.getPnlInformacionObl());
		tabbedPane.addTab("2.-  + ficha.getFiDescripcion()", null, pnlPestaña2, null);

		cargarPanelPestaña2(pnlPestaña2);

	}

	public void cargarPanelPestaña2(JPanel pnlPestaña2) {
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 11, 410, 200);
		pnlPestaña2.add(panel_5);
		panel_5.setLayout(null);

		JLabel lblComponenteArquitectnico = new JLabel("COMPONENTE ARQUITECTÓNICO");
		lblComponenteArquitectnico.setHorizontalAlignment(SwingConstants.CENTER);
		lblComponenteArquitectnico.setFont(new Font("Arial", Font.BOLD, 10));
		lblComponenteArquitectnico.setBounds(10, 11, 167, 14);
		panel_5.add(lblComponenteArquitectnico);

		JLabel label_13 = new JLabel("Cantidad");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Arial", Font.BOLD, 10));
		label_13.setBounds(183, 11, 58, 14);
		panel_5.add(label_13);

		JLabel label_14 = new JLabel("Observación/Referencia");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Arial", Font.BOLD, 10));
		label_14.setBounds(238, 11, 167, 14);
		panel_5.add(label_14);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(10, 261, 410, 100);
		pnlPestaña2.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblFachadaFrontal = new JLabel("FACHADA FRONTAL");
		lblFachadaFrontal.setHorizontalAlignment(SwingConstants.CENTER);
		lblFachadaFrontal.setFont(new Font("Arial", Font.BOLD, 10));
		lblFachadaFrontal.setBounds(10, 11, 167, 14);
		panel_6.add(lblFachadaFrontal);

		JLabel label_1 = new JLabel("Cantidad");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Arial", Font.BOLD, 10));
		label_1.setBounds(183, 11, 58, 14);
		panel_6.add(label_1);

		JLabel label_2 = new JLabel("Observación/Referencia");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Arial", Font.BOLD, 10));
		label_2.setBounds(238, 11, 167, 14);
		panel_6.add(label_2);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(10, 425, 410, 130);
		pnlPestaña2.add(panel_7);
		panel_7.setLayout(null);

		JLabel lblFachadaPosterior = new JLabel("FACHADA POSTERIOR");
		lblFachadaPosterior.setHorizontalAlignment(SwingConstants.CENTER);
		lblFachadaPosterior.setFont(new Font("Arial", Font.BOLD, 10));
		lblFachadaPosterior.setBounds(10, 11, 167, 14);
		panel_7.add(lblFachadaPosterior);

		JLabel label_4 = new JLabel("Cantidad");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Arial", Font.BOLD, 10));
		label_4.setBounds(183, 11, 58, 14);
		panel_7.add(label_4);

		JLabel label_5 = new JLabel("Observación/Referencia");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Arial", Font.BOLD, 10));
		label_5.setBounds(238, 11, 167, 14);
		panel_7.add(label_5);

		JPanel panel_8 = new JPanel();
		panel_8.setBounds(430, 11, 410, 275);
		pnlPestaña2.add(panel_8);
		panel_8.setLayout(null);

		JLabel lblFachadaLateral = new JLabel("FACHADA LATERAL");
		lblFachadaLateral.setHorizontalAlignment(SwingConstants.CENTER);
		lblFachadaLateral.setFont(new Font("Arial", Font.BOLD, 10));
		lblFachadaLateral.setBounds(10, 11, 167, 14);
		panel_8.add(lblFachadaLateral);

		JLabel label_7 = new JLabel("Cantidad");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Arial", Font.BOLD, 10));
		label_7.setBounds(183, 11, 58, 14);
		panel_8.add(label_7);

		JLabel label_8 = new JLabel("Observación/Referencia");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Arial", Font.BOLD, 10));
		label_8.setBounds(238, 11, 167, 14);
		panel_8.add(label_8);

		JPanel panel_9 = new JPanel();
		panel_9.setBounds(856, 11, 410, 320);
		pnlPestaña2.add(panel_9);
		panel_9.setLayout(null);

		JLabel lblComponenteEstructural = new JLabel("COMPONENTE ESTRUCTURAL");
		lblComponenteEstructural.setHorizontalAlignment(SwingConstants.CENTER);
		lblComponenteEstructural.setFont(new Font("Arial", Font.BOLD, 10));
		lblComponenteEstructural.setBounds(10, 11, 167, 14);
		panel_9.add(lblComponenteEstructural);

		JLabel label_10 = new JLabel("Cantidad");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Arial", Font.BOLD, 10));
		label_10.setBounds(183, 11, 58, 14);
		panel_9.add(label_10);

		JLabel label_11 = new JLabel("Observación/Referencia");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Arial", Font.BOLD, 10));
		label_11.setBounds(238, 11, 167, 14);
		panel_9.add(label_11);

	}

	public void cargarPanelPestaña1(JPanel pnlPestaña1) {
		JPanel panel_0 = new JPanel();
		panel_0.setBounds(10, 11, 410, 165);
		pnlPestaña1.add(panel_0);
		panel_0.setLayout(null);

		JLabel label = new JLabel("KIT ELÉCTRICO");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 10));
		label.setBounds(10, 11, 167, 14);
		panel_0.add(label);

		JLabel label_1 = new JLabel("Cantidad");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Arial", Font.BOLD, 10));
		label_1.setBounds(183, 11, 58, 14);
		panel_0.add(label_1);

		JLabel label_2 = new JLabel("Observación/Referencia");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Arial", Font.BOLD, 10));
		label_2.setBounds(238, 11, 167, 14);
		panel_0.add(label_2);

		JPanel pnlCantidad0 = new JPanel();
		pnlCantidad0.setBounds(188, 30, 50, 125);
		panel_0.add(pnlCantidad0);
		pnlCantidad0.setLayout(new GridLayout(5, 2, 0, 0));

		txtCantidad00 = new JTextField();
		pnlCantidad0.add(txtCantidad00);
		txtCantidad00.setColumns(10);

		txtCantidad01 = new JTextField();
		txtCantidad01.setColumns(10);
		pnlCantidad0.add(txtCantidad01);

		txtCantidad10 = new JTextField();
		pnlCantidad0.add(txtCantidad10);
		txtCantidad10.setColumns(10);

		txtCantidad11 = new JTextField();
		txtCantidad11.setColumns(10);
		pnlCantidad0.add(txtCantidad11);

		txtCantidad20 = new JTextField();
		txtCantidad20.setColumns(10);
		pnlCantidad0.add(txtCantidad20);

		txtCantidad21 = new JTextField();
		txtCantidad21.setColumns(10);
		pnlCantidad0.add(txtCantidad21);

		txtCantidad30 = new JTextField();
		txtCantidad30.setColumns(10);
		pnlCantidad0.add(txtCantidad30);

		txtCantidad31 = new JTextField();
		txtCantidad31.setColumns(10);
		pnlCantidad0.add(txtCantidad31);

		txtCantidad40 = new JTextField();
		txtCantidad40.setColumns(10);
		pnlCantidad0.add(txtCantidad40);

		txtCantidad41 = new JTextField();
		txtCantidad41.setColumns(10);
		pnlCantidad0.add(txtCantidad41);

		JPanel pnlObservacion0 = new JPanel();
		pnlObservacion0.setBounds(248, 30, 152, 125);
		panel_0.add(pnlObservacion0);
		pnlObservacion0.setLayout(new GridLayout(5, 0, 0, 0));

		txtObs0 = new JTextField();
		pnlObservacion0.add(txtObs0);
		txtObs0.setColumns(10);

		txtObs1 = new JTextField();
		txtObs1.setColumns(10);
		pnlObservacion0.add(txtObs1);

		txtObs2 = new JTextField();
		txtObs2.setColumns(10);
		pnlObservacion0.add(txtObs2);

		txtObs3 = new JTextField();
		txtObs3.setColumns(10);
		pnlObservacion0.add(txtObs3);

		txtObs4 = new JTextField();
		txtObs4.setColumns(10);
		pnlObservacion0.add(txtObs4);

		JPanel panel = new JPanel();
		panel.setBounds(10, 30, 167, 125);
		panel_0.add(panel);
		panel.setLayout(new GridLayout(5, 0, 0, 0));

		JLabel lblNewLabel = new JLabel(LBL_BS_0);
		panel.add(lblNewLabel);

		JLabel lblLblbs = new JLabel(LBL_BS_1);
		panel.add(lblLblbs);

		JLabel lblLblbs_1 = new JLabel(LBL_BS_2);
		panel.add(lblLblbs_1);

		JLabel lblLblbs_2 = new JLabel(LBL_BS_3);
		panel.add(lblLblbs_2);

		JLabel lblLblbs_3 = new JLabel(LBL_BS_4);
		panel.add(lblLblbs_3);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 212, 410, 100);
		pnlPestaña1.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblKithidrosanitario = new JLabel("KITHIDROSANITARIO");
		lblKithidrosanitario.setHorizontalAlignment(SwingConstants.CENTER);
		lblKithidrosanitario.setFont(new Font("Arial", Font.BOLD, 10));
		lblKithidrosanitario.setBounds(10, 11, 167, 14);
		panel_1.add(lblKithidrosanitario);

		JLabel label_4 = new JLabel("Cantidad");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Arial", Font.BOLD, 10));
		label_4.setBounds(183, 11, 58, 14);
		panel_1.add(label_4);

		JLabel label_5 = new JLabel("Observación/Referencia");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Arial", Font.BOLD, 10));
		label_5.setBounds(238, 11, 167, 14);
		panel_1.add(label_5);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 352, 410, 200);
		pnlPestaña1.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblKitAgua = new JLabel("KIT AGUA");
		lblKitAgua.setHorizontalAlignment(SwingConstants.CENTER);
		lblKitAgua.setFont(new Font("Arial", Font.BOLD, 10));
		lblKitAgua.setBounds(10, 11, 167, 14);
		panel_2.add(lblKitAgua);

		JLabel label_7 = new JLabel("Cantidad");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Arial", Font.BOLD, 10));
		label_7.setBounds(183, 11, 58, 14);
		panel_2.add(label_7);

		JLabel label_8 = new JLabel("Observación/Referencia");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Arial", Font.BOLD, 10));
		label_8.setBounds(238, 11, 167, 14);
		panel_2.add(label_8);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(435, 11, 410, 350);
		pnlPestaña1.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblKitAguaPotable = new JLabel("KIT AGUA POTABLE");
		lblKitAguaPotable.setHorizontalAlignment(SwingConstants.CENTER);
		lblKitAguaPotable.setFont(new Font("Arial", Font.BOLD, 10));
		lblKitAguaPotable.setBounds(10, 11, 167, 14);
		panel_3.add(lblKitAguaPotable);

		JLabel label_10 = new JLabel("Cantidad");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Arial", Font.BOLD, 10));
		label_10.setBounds(183, 11, 58, 14);
		panel_3.add(label_10);

		JLabel label_11 = new JLabel("Observación/Referencia");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Arial", Font.BOLD, 10));
		label_11.setBounds(238, 11, 167, 14);
		panel_3.add(label_11);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(861, 11, 410, 541);
		pnlPestaña1.add(panel_4);
		panel_4.setLayout(null);

		JLabel lblKitAguaResidual = new JLabel("KIT AGUA RESIDUAL");
		lblKitAguaResidual.setHorizontalAlignment(SwingConstants.CENTER);
		lblKitAguaResidual.setFont(new Font("Arial", Font.BOLD, 10));
		lblKitAguaResidual.setBounds(10, 11, 167, 14);
		panel_4.add(lblKitAguaResidual);

		JLabel label_13 = new JLabel("Cantidad");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Arial", Font.BOLD, 10));
		label_13.setBounds(183, 11, 58, 14);
		panel_4.add(label_13);

		JLabel label_14 = new JLabel("Observación/Referencia");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Arial", Font.BOLD, 10));
		label_14.setBounds(238, 11, 167, 14);
		panel_4.add(label_14);

	}

	public void cargarCabecera() {

		jpCabecera = new JPcabecera();
		pnlPrincipal.add(jpCabecera.getCabecera());

	}
}
