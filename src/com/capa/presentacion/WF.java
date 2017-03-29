package com.capa.presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class WF extends JFrame {

	private JPanel contentPane;
	private JTextField txtCantidadRouter1;
	private JTextField txtCantidadVoz1;
	private JTextField txtCantidadRJ1;
	private JTextField txtCantidadRJ2;
	private JTextField txtCantidadVoz2;
	private JTextField txtCantidadRouter2;
	private JTextField txtRefRouter;
	private JTextField txtRefVoz;
	private JTextField txtRefRJ;
	private JTextField txtCantidadAcces1;
	private JTextField txtCantidadAcces2;
	private JTextField txtRefAcces;
	private JTextField txtCantidadBandeja1;
	private JTextField txtCantidadRed1;
	private JTextField txtCantidadTub1;
	private JTextField txtCantidadSockets1;
	private JTextField txtCantidadSockets2;
	private JTextField txtCantidadTub2;
	private JTextField txtCantidadRed2;
	private JTextField txtCantidadBandeja2;
	private JTextField txtRefBandeja;
	private JTextField txtRefRed;
	private JTextField txtRefTub;
	private JTextField txtRefSockets;
	private JTextField txtCantidadPatch1;
	private JTextField txtCantidadPatch2;
	private JTextField txtRefPatch;
	private JTextField txtCantPatch1;
	private JTextField txtCantPatch2;
	private JTextField txtReferPatch;
	private JTextField txtCantidadRack1;
	private JTextField txtCantidadRack2;
	private JTextField txtRefRack;
	private JTextField txtCantidadPanel1;
	private JTextField txtCantidadPanel2;
	private JTextField txtRefPanel;
	private JTextField txtCantidadFibra1;
	private JTextField txtCantidadFibra2;
	private JTextField txtRefFibra;
	private JTextField txtCantidadCaja1;
	private JTextField txtCantidadCaja2;
	private JTextField txtRefCaja;
	private JTextField txtCantidadPVC1;
	private JTextField txtCantidadPVC2;
	private JTextField txtRefPVC;
	private JTextField txtCantidadMang1;
	private JTextField txtCantidadMang2;
	private JTextField txtRefMang;
	private JTextField txtCantidadTablero1;
	private JTextField txtCantidadTablero2;
	private JTextField txtRefTablero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WF frame = new WF();
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
	public WF() {
		setTitle("WF-1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1332, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());
		contentPane.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(
				new TitledBorder(null, "1.- WF-voz y datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 131, 910, 531);
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

		txtCantidadRouter1 = new JTextField();
		txtCantidadRouter1.setColumns(10);
		txtCantidadRouter1.setBounds(314, 94, 35, 20);
		panel_1.add(txtCantidadRouter1);

		txtCantidadVoz1 = new JTextField();
		txtCantidadVoz1.setColumns(10);
		txtCantidadVoz1.setBounds(314, 72, 35, 20);
		panel_1.add(txtCantidadVoz1);

		txtCantidadRJ1 = new JTextField();
		txtCantidadRJ1.setColumns(10);
		txtCantidadRJ1.setBounds(314, 50, 35, 20);
		panel_1.add(txtCantidadRJ1);

		JLabel label_4 = new JLabel("Cantidad");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Arial", Font.BOLD, 11));
		label_4.setBounds(317, 28, 63, 14);
		panel_1.add(label_4);

		txtCantidadRJ2 = new JTextField();
		txtCantidadRJ2.setColumns(10);
		txtCantidadRJ2.setBounds(351, 50, 35, 20);
		panel_1.add(txtCantidadRJ2);

		txtCantidadVoz2 = new JTextField();
		txtCantidadVoz2.setColumns(10);
		txtCantidadVoz2.setBounds(351, 72, 35, 20);
		panel_1.add(txtCantidadVoz2);

		txtCantidadRouter2 = new JTextField();
		txtCantidadRouter2.setColumns(10);
		txtCantidadRouter2.setBounds(351, 94, 35, 20);
		panel_1.add(txtCantidadRouter2);

		txtRefRouter = new JTextField();
		txtRefRouter.setColumns(10);
		txtRefRouter.setBounds(396, 94, 167, 20);
		panel_1.add(txtRefRouter);

		txtRefVoz = new JTextField();
		txtRefVoz.setColumns(10);
		txtRefVoz.setBounds(396, 72, 167, 20);
		panel_1.add(txtRefVoz);

		txtRefRJ = new JTextField();
		txtRefRJ.setColumns(10);
		txtRefRJ.setBounds(396, 50, 167, 20);
		panel_1.add(txtRefRJ);

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

		txtCantidadAcces1 = new JTextField();
		txtCantidadAcces1.setColumns(10);
		txtCantidadAcces1.setBounds(314, 116, 35, 20);
		panel_1.add(txtCantidadAcces1);

		txtCantidadAcces2 = new JTextField();
		txtCantidadAcces2.setColumns(10);
		txtCantidadAcces2.setBounds(351, 116, 35, 20);
		panel_1.add(txtCantidadAcces2);

		txtRefAcces = new JTextField();
		txtRefAcces.setColumns(10);
		txtRefAcces.setBounds(396, 116, 167, 20);
		panel_1.add(txtRefAcces);

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

		txtCantidadBandeja1 = new JTextField();
		txtCantidadBandeja1.setColumns(10);
		txtCantidadBandeja1.setBounds(314, 243, 35, 20);
		panel_1.add(txtCantidadBandeja1);

		txtCantidadRed1 = new JTextField();
		txtCantidadRed1.setColumns(10);
		txtCantidadRed1.setBounds(314, 221, 35, 20);
		panel_1.add(txtCantidadRed1);

		txtCantidadTub1 = new JTextField();
		txtCantidadTub1.setColumns(10);
		txtCantidadTub1.setBounds(314, 199, 35, 20);
		panel_1.add(txtCantidadTub1);

		txtCantidadSockets1 = new JTextField();
		txtCantidadSockets1.setColumns(10);
		txtCantidadSockets1.setBounds(314, 177, 35, 20);
		panel_1.add(txtCantidadSockets1);

		JLabel label_7 = new JLabel("Cantidad");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Arial", Font.BOLD, 11));
		label_7.setBounds(317, 155, 63, 14);
		panel_1.add(label_7);

		txtCantidadSockets2 = new JTextField();
		txtCantidadSockets2.setColumns(10);
		txtCantidadSockets2.setBounds(351, 177, 35, 20);
		panel_1.add(txtCantidadSockets2);

		txtCantidadTub2 = new JTextField();
		txtCantidadTub2.setColumns(10);
		txtCantidadTub2.setBounds(351, 199, 35, 20);
		panel_1.add(txtCantidadTub2);

		txtCantidadRed2 = new JTextField();
		txtCantidadRed2.setColumns(10);
		txtCantidadRed2.setBounds(351, 221, 35, 20);
		panel_1.add(txtCantidadRed2);

		txtCantidadBandeja2 = new JTextField();
		txtCantidadBandeja2.setColumns(10);
		txtCantidadBandeja2.setBounds(351, 243, 35, 20);
		panel_1.add(txtCantidadBandeja2);

		txtRefBandeja = new JTextField();
		txtRefBandeja.setColumns(10);
		txtRefBandeja.setBounds(396, 243, 167, 20);
		panel_1.add(txtRefBandeja);

		txtRefRed = new JTextField();
		txtRefRed.setColumns(10);
		txtRefRed.setBounds(396, 221, 167, 20);
		panel_1.add(txtRefRed);

		txtRefTub = new JTextField();
		txtRefTub.setColumns(10);
		txtRefTub.setBounds(396, 199, 167, 20);
		panel_1.add(txtRefTub);

		txtRefSockets = new JTextField();
		txtRefSockets.setColumns(10);
		txtRefSockets.setBounds(396, 177, 167, 20);
		panel_1.add(txtRefSockets);

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

		txtCantidadPatch1 = new JTextField();
		txtCantidadPatch1.setColumns(10);
		txtCantidadPatch1.setBounds(314, 265, 35, 20);
		panel_1.add(txtCantidadPatch1);

		txtCantidadPatch2 = new JTextField();
		txtCantidadPatch2.setColumns(10);
		txtCantidadPatch2.setBounds(351, 265, 35, 20);
		panel_1.add(txtCantidadPatch2);

		txtRefPatch = new JTextField();
		txtRefPatch.setColumns(10);
		txtRefPatch.setBounds(396, 265, 167, 20);
		panel_1.add(txtRefPatch);

		JLabel lblPatchcordftCat_1 = new JLabel("Patchcord 3ft cat6");
		lblPatchcordftCat_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPatchcordftCat_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPatchcordftCat_1.setBounds(101, 290, 203, 14);
		panel_1.add(lblPatchcordftCat_1);

		txtCantPatch1 = new JTextField();
		txtCantPatch1.setColumns(10);
		txtCantPatch1.setBounds(314, 287, 35, 20);
		panel_1.add(txtCantPatch1);

		txtCantPatch2 = new JTextField();
		txtCantPatch2.setColumns(10);
		txtCantPatch2.setBounds(351, 287, 35, 20);
		panel_1.add(txtCantPatch2);

		txtReferPatch = new JTextField();
		txtReferPatch.setColumns(10);
		txtReferPatch.setBounds(396, 287, 167, 20);
		panel_1.add(txtReferPatch);

		JLabel lblRackCerradoTipo = new JLabel("Rack cerrado tipo gabinete de 12 UR");
		lblRackCerradoTipo.setHorizontalAlignment(SwingConstants.LEFT);
		lblRackCerradoTipo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblRackCerradoTipo.setBounds(101, 312, 203, 14);
		panel_1.add(lblRackCerradoTipo);

		txtCantidadRack1 = new JTextField();
		txtCantidadRack1.setColumns(10);
		txtCantidadRack1.setBounds(314, 309, 35, 20);
		panel_1.add(txtCantidadRack1);

		txtCantidadRack2 = new JTextField();
		txtCantidadRack2.setColumns(10);
		txtCantidadRack2.setBounds(351, 309, 35, 20);
		panel_1.add(txtCantidadRack2);

		txtRefRack = new JTextField();
		txtRefRack.setColumns(10);
		txtRefRack.setBounds(396, 309, 167, 20);
		panel_1.add(txtRefRack);

		txtCantidadPanel1 = new JTextField();
		txtCantidadPanel1.setColumns(10);
		txtCantidadPanel1.setBounds(314, 340, 35, 20);
		panel_1.add(txtCantidadPanel1);

		txtCantidadPanel2 = new JTextField();
		txtCantidadPanel2.setColumns(10);
		txtCantidadPanel2.setBounds(351, 340, 35, 20);
		panel_1.add(txtCantidadPanel2);

		txtRefPanel = new JTextField();
		txtRefPanel.setColumns(10);
		txtRefPanel.setBounds(396, 340, 167, 20);
		panel_1.add(txtRefPanel);

		JLabel lblConversorDeMedia = new JLabel("Conversor de media de fibra \u00F3ptica a UTP");
		lblConversorDeMedia.setHorizontalAlignment(SwingConstants.LEFT);
		lblConversorDeMedia.setFont(new Font("Arial", Font.PLAIN, 11));
		lblConversorDeMedia.setBounds(101, 380, 203, 14);
		panel_1.add(lblConversorDeMedia);

		txtCantidadFibra1 = new JTextField();
		txtCantidadFibra1.setColumns(10);
		txtCantidadFibra1.setBounds(314, 377, 35, 20);
		panel_1.add(txtCantidadFibra1);

		txtCantidadFibra2 = new JTextField();
		txtCantidadFibra2.setColumns(10);
		txtCantidadFibra2.setBounds(351, 377, 35, 20);
		panel_1.add(txtCantidadFibra2);

		txtRefFibra = new JTextField();
		txtRefFibra.setColumns(10);
		txtRefFibra.setBounds(396, 377, 167, 20);
		panel_1.add(txtRefFibra);

		JLabel lblCajaDeConexin = new JLabel("Caja de conexi\u00F3n 60x60x70 cm");
		lblCajaDeConexin.setHorizontalAlignment(SwingConstants.LEFT);
		lblCajaDeConexin.setFont(new Font("Arial", Font.PLAIN, 11));
		lblCajaDeConexin.setBounds(101, 402, 203, 14);
		panel_1.add(lblCajaDeConexin);

		txtCantidadCaja1 = new JTextField();
		txtCantidadCaja1.setColumns(10);
		txtCantidadCaja1.setBounds(314, 399, 35, 20);
		panel_1.add(txtCantidadCaja1);

		txtCantidadCaja2 = new JTextField();
		txtCantidadCaja2.setColumns(10);
		txtCantidadCaja2.setBounds(351, 399, 35, 20);
		panel_1.add(txtCantidadCaja2);

		txtRefCaja = new JTextField();
		txtRefCaja.setColumns(10);
		txtRefCaja.setBounds(396, 399, 167, 20);
		panel_1.add(txtRefCaja);

		JLabel lblTuberaPvc_1 = new JLabel("Tuber\u00EDa PVC 2\u201D l=6 mt");
		lblTuberaPvc_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuberaPvc_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTuberaPvc_1.setBounds(101, 424, 203, 14);
		panel_1.add(lblTuberaPvc_1);

		txtCantidadPVC1 = new JTextField();
		txtCantidadPVC1.setColumns(10);
		txtCantidadPVC1.setBounds(314, 421, 35, 20);
		panel_1.add(txtCantidadPVC1);

		txtCantidadPVC2 = new JTextField();
		txtCantidadPVC2.setColumns(10);
		txtCantidadPVC2.setBounds(351, 421, 35, 20);
		panel_1.add(txtCantidadPVC2);

		txtRefPVC = new JTextField();
		txtRefPVC.setColumns(10);
		txtRefPVC.setBounds(396, 421, 167, 20);
		panel_1.add(txtRefPVC);

		JLabel lblmangueraNegraTipo = new JLabel(
				"<html><body>Manguera negra tipo el\u00E9ctrica de 2\u201D l=6mt<br>y 2 cajas de paso</body></html>");
		lblmangueraNegraTipo.setHorizontalAlignment(SwingConstants.LEFT);
		lblmangueraNegraTipo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblmangueraNegraTipo.setBounds(101, 445, 203, 39);
		panel_1.add(lblmangueraNegraTipo);

		txtCantidadMang1 = new JTextField();
		txtCantidadMang1.setColumns(10);
		txtCantidadMang1.setBounds(314, 453, 35, 20);
		panel_1.add(txtCantidadMang1);

		txtCantidadMang2 = new JTextField();
		txtCantidadMang2.setColumns(10);
		txtCantidadMang2.setBounds(351, 453, 35, 20);
		panel_1.add(txtCantidadMang2);

		txtRefMang = new JTextField();
		txtRefMang.setColumns(10);
		txtRefMang.setBounds(396, 453, 167, 20);
		panel_1.add(txtRefMang);

		JLabel lblTableroxx = new JLabel("Tablero 20x20x10");
		lblTableroxx.setHorizontalAlignment(SwingConstants.LEFT);
		lblTableroxx.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTableroxx.setBounds(101, 487, 203, 14);
		panel_1.add(lblTableroxx);

		txtCantidadTablero1 = new JTextField();
		txtCantidadTablero1.setColumns(10);
		txtCantidadTablero1.setBounds(314, 484, 35, 20);
		panel_1.add(txtCantidadTablero1);

		txtCantidadTablero2 = new JTextField();
		txtCantidadTablero2.setColumns(10);
		txtCantidadTablero2.setBounds(351, 484, 35, 20);
		panel_1.add(txtCantidadTablero2);

		txtRefTablero = new JTextField();
		txtRefTablero.setColumns(10);
		txtRefTablero.setBounds(396, 484, 167, 20);
		panel_1.add(txtRefTablero);

		JLabel lblpatchPanel = new JLabel("<html><body>Patch panel 12 puertos CAT 6 (incluye<br>jacks)</body></html>");
		lblpatchPanel.setHorizontalAlignment(SwingConstants.LEFT);
		lblpatchPanel.setFont(new Font("Arial", Font.PLAIN, 11));
		lblpatchPanel.setBounds(101, 334, 203, 39);
		panel_1.add(lblpatchPanel);
	}

}
