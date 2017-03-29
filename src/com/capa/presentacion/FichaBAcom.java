package com.capa.presentacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class FichaBAcom extends JFrame {

	private JPanel contentPane;
	private JTextField txtObsPVC;
	private JTextField txtObsAP;
	private JTextField txtObsAS;
	private JTextField txtObsVoz;
	private JTextField textField;
	private JTextField txtObsPoste;
	private JTextField txtObsTrans;
	private JTextField txtObsIlum;
	private JTextField txtObsGen;
	private JTextField txtResponsable;
	private JTextField txtCargo;
	private JTextField txtObsGen2;
	private JTextField txtResponsableContra;
	private JTextField txtCargo2;
	private JTextField txtFecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FichaBAcom frame = new FichaBAcom();
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
	public FichaBAcom() {
		setTitle("FICHA ACOMETIDA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1571, 804);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		JPcabecera cabecera = new JPcabecera();
		contentPane.add(cabecera.getCabecera());
		contentPane.setLayout(null);

		JLabel lblTituloPVC = new JLabel("Tuber\u00EDa de PVC");
		lblTituloPVC.setFont(new Font("Arial", Font.BOLD, 11));
		lblTituloPVC.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloPVC.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTituloPVC.setBounds(61, 160, 93, 14);
		contentPane.add(lblTituloPVC);

		String texto = "<html><body>La tuber\u00EDa de PVC presi\u00F3n, uni\u00F3n roscable<br>instalada cumple con las especificaciones:<br>"
				+ "ASTM D- 1785- 89, " + "para tuber\u00EDa de agua<br>fr\u00EDa.</body></html>";
		JLabel lblDescPvc = new JLabel(texto);
		lblDescPvc.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescPvc.setVerticalAlignment(SwingConstants.TOP);
		lblDescPvc.setBounds(10, 185, 214, 68);
		contentPane.add(lblDescPvc);

		JPanel panelPVC = new JPanel();
		panelPVC.setBounds(261, 160, 252, 57);
		contentPane.add(panelPVC);
		panelPVC.setLayout(null);

		JRadioButton rdbtnSiPVC = new JRadioButton("SI");
		rdbtnSiPVC.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnSiPVC.setBounds(6, 24, 42, 23);
		panelPVC.add(rdbtnSiPVC);

		JRadioButton rdbtnNoPVC = new JRadioButton("NO");
		rdbtnNoPVC.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnNoPVC.setBounds(50, 24, 42, 23);
		panelPVC.add(rdbtnNoPVC);

		JLabel lblObs = new JLabel("Observaciones/Referencia");
		lblObs.setFont(new Font("Arial", Font.PLAIN, 11));
		lblObs.setHorizontalAlignment(SwingConstants.CENTER);
		lblObs.setBounds(78, 11, 174, 14);
		panelPVC.add(lblObs);

		txtObsPVC = new JTextField();
		txtObsPVC.setBounds(98, 25, 136, 20);
		panelPVC.add(txtObsPVC);
		txtObsPVC.setColumns(10);

		JLabel lblTituloAP = new JLabel("Agua potable");
		lblTituloAP.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTituloAP.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloAP.setFont(new Font("Arial", Font.BOLD, 11));
		lblTituloAP.setBounds(61, 264, 93, 14);
		contentPane.add(lblTituloAP);

		String textoAP = "<html><body>La tuber\u00EDa instalada soporta una prueba de<br>presi\u00F3n no menor a 100 psi.</body></html>";
		JLabel lblDescAP = new JLabel(textoAP);
		lblDescAP.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescAP.setVerticalAlignment(SwingConstants.TOP);
		lblDescAP.setBounds(10, 288, 214, 36);
		contentPane.add(lblDescAP);

		JPanel panelAP = new JPanel();
		panelAP.setLayout(null);
		panelAP.setBounds(261, 264, 252, 57);
		contentPane.add(panelAP);

		JRadioButton rdbtnSiAP = new JRadioButton("SI");
		rdbtnSiAP.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnSiAP.setBounds(6, 24, 42, 23);
		panelAP.add(rdbtnSiAP);

		JRadioButton rdbtnNoAP = new JRadioButton("NO");
		rdbtnNoAP.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnNoAP.setBounds(50, 24, 42, 23);
		panelAP.add(rdbtnNoAP);

		JLabel label = new JLabel("Observaciones/Referencia");
		label.setFont(new Font("Arial", Font.PLAIN, 11));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(78, 11, 174, 14);
		panelAP.add(label);

		txtObsAP = new JTextField();
		txtObsAP.setColumns(10);
		txtObsAP.setBounds(98, 25, 136, 20);
		panelAP.add(txtObsAP);

		JLabel lblTituloAS = new JLabel("Tuber\u00EDas PVC aguas servidas");
		lblTituloAS.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTituloAS.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloAS.setFont(new Font("Arial", Font.BOLD, 11));
		lblTituloAS.setBounds(20, 356, 181, 14);
		contentPane.add(lblTituloAS);

		String textoAS = "<html><body>La tuber\u00EDa instalada sirve para <br>alcantarillado, desalojo de aguas servidas<br>y aguas lluvias.</body></html>";
		JLabel lblDescAS = new JLabel(textoAS);
		lblDescAS.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescAS.setVerticalAlignment(SwingConstants.TOP);
		lblDescAS.setBounds(10, 378, 214, 50);
		contentPane.add(lblDescAS);

		JPanel panelAS = new JPanel();
		panelAS.setLayout(null);
		panelAS.setBounds(261, 356, 252, 57);
		contentPane.add(panelAS);

		JRadioButton rdbtnSiAS = new JRadioButton("SI");
		rdbtnSiAS.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnSiAS.setBounds(6, 24, 42, 23);
		panelAS.add(rdbtnSiAS);

		JRadioButton rdbtnNoAS = new JRadioButton("NO");
		rdbtnNoAS.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnNoAS.setBounds(50, 24, 42, 23);
		panelAS.add(rdbtnNoAS);

		JLabel label_3 = new JLabel("Observaciones/Referencia");
		label_3.setFont(new Font("Arial", Font.PLAIN, 11));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(78, 11, 174, 14);
		panelAS.add(label_3);

		txtObsAS = new JTextField();
		txtObsAS.setColumns(10);
		txtObsAS.setBounds(98, 25, 136, 20);
		panelAS.add(txtObsAS);

		JLabel lblTituloVoz = new JLabel("Voz y datos");
		lblTituloVoz.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTituloVoz.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloVoz.setFont(new Font("Arial", Font.BOLD, 11));
		lblTituloVoz.setBounds(20, 442, 181, 14);
		contentPane.add(lblTituloVoz);
		String textoVoz = "<html><body>Se provee un sistema categor\u00EDa 6 tipo <br>inal\u00E1mbrico para el servicio de al menos<br>110 usuarios, 50 por cada laboratorio y 10"
				+ "<br>para m\u00F3dulo de administraci\u00F3n.<br>La interconexi\u00F3n entre equipos se realiza<br>mediante cable estructurado siempre y<br>"
				+ "cuando la distancia sea menor a 100 m,<br>cumpliendo la Norma y ser\u00E1 Categor\u00EDa 6 o<br>superior, en caso de ser soterrado y en<br>"
				+ "caso de estar cercano a cables de energ\u00EDa<br>el\u00E9ctrica se utiliza conductor tipo SHIELDED<br>para evitar interferencia electromagn\u00E9tica.<br>"
				+ "Se coloca al menos 1 router wireless Tipo N<br>de 10/100/100 MB, y un Access point por<br>laboratorio y m\u00F3dulo de administraci\u00F3n.<br>"
				+ "El rack es ubicado en uno<br>de los laboratorios de tecnolog\u00EDa, y se provee<br>de un conversor de media.<br>"
				+ "Se consideran cajas de conexi\u00F3n de<br>60X60X70 y tuber\u00EDa PVC y patch cord de FO.</body></html>";

		JLabel lblDescVoz = new JLabel();
		lblDescVoz.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescVoz.setText(textoVoz);
		lblDescVoz.setVerticalAlignment(SwingConstants.TOP);
		lblDescVoz.setBounds(10, 467, 241, 294);
		contentPane.add(lblDescVoz);

		JPanel panelVoz = new JPanel();
		panelVoz.setLayout(null);
		panelVoz.setBounds(261, 442, 252, 57);
		contentPane.add(panelVoz);

		JRadioButton rdbtnSiVoz = new JRadioButton("SI");
		rdbtnSiVoz.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnSiVoz.setBounds(6, 24, 42, 23);
		panelVoz.add(rdbtnSiVoz);

		JRadioButton rdbtnNoVoz = new JRadioButton("NO");
		rdbtnNoVoz.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnNoVoz.setBounds(50, 24, 42, 23);
		panelVoz.add(rdbtnNoVoz);

		JLabel label_4 = new JLabel("Observaciones/Referencia");
		label_4.setFont(new Font("Arial", Font.PLAIN, 11));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(78, 11, 174, 14);
		panelVoz.add(label_4);

		txtObsVoz = new JTextField();
		txtObsVoz.setColumns(10);
		txtObsVoz.setBounds(98, 25, 136, 20);
		panelVoz.add(txtObsVoz);

		JLabel lbTituloCableado = new JLabel("Cableado el\u00E9ctrico");
		lbTituloCableado.setVerticalAlignment(SwingConstants.BOTTOM);
		lbTituloCableado.setHorizontalAlignment(SwingConstants.CENTER);
		lbTituloCableado.setFont(new Font("Arial", Font.BOLD, 11));
		lbTituloCableado.setBounds(557, 160, 135, 14);
		contentPane.add(lbTituloCableado);

		String textoCableado = "<html><body>En el cableado el\u00E9ctrico se utilizan calibres:<br>- THHN #8, #10, #12, #14<br>- Cable AWG #14desnudo"
				+ "<br>Los conductores cumplen con las normas<br>de fabricaci\u00F3n NEMA ASTM-B3, ASTM-B8,<br>UL62, UL83 y la UL-1581 y aprobados<br>"
				+ "seg\u00FAn el sistema de calidad del cable.<br>Aislamiento: Cloruro de polietileno (PVC) de<br>90\u00B0C (194\u00B0F) resistente a la humedad, no<br>"
				+ "propaga llama, voltaje de servicio 600V, el<br>color de cada cable es de acuerdo a las <br>especificaciones aprobadas en nuestro medio.<br>"
				+ "El tendido exterior se considera con<br>tuber\u00EDa soterrada de PVC de 3\" (75 mm) y<br>cajas de conexi\u00F3n de dimensiones de 60X60X70 cm.</body></html>";
		JLabel lblDescCableado = new JLabel();
		lblDescCableado.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescCableado.setText(textoCableado);
		lblDescCableado.setVerticalAlignment(SwingConstants.TOP);
		lblDescCableado.setBounds(533, 185, 241, 235);
		contentPane.add(lblDescCableado);

		JPanel panelCableado = new JPanel();
		panelCableado.setLayout(null);
		panelCableado.setBounds(784, 160, 252, 57);
		contentPane.add(panelCableado);

		JRadioButton rdbtnSiCableado = new JRadioButton("SI");
		rdbtnSiCableado.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnSiCableado.setBounds(6, 24, 42, 23);
		panelCableado.add(rdbtnSiCableado);

		JRadioButton rdbtnNoCableado = new JRadioButton("NO");
		rdbtnNoCableado.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnNoCableado.setBounds(50, 24, 42, 23);
		panelCableado.add(rdbtnNoCableado);

		JLabel label_5 = new JLabel("Observaciones/Referencia");
		label_5.setFont(new Font("Arial", Font.PLAIN, 11));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(78, 11, 174, 14);
		panelCableado.add(label_5);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(98, 25, 136, 20);
		panelCableado.add(textField);

		JLabel lblTituloPoste = new JLabel("Poste el\u00E9ctrico met\u00E1lico de 6 m");
		lblTituloPoste.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTituloPoste.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloPoste.setFont(new Font("Arial", Font.BOLD, 11));
		lblTituloPoste.setBounds(533, 442, 227, 14);
		contentPane.add(lblTituloPoste);

		String textoPoste = "<html><body>Los postes son met\u00E1licos galvanizados de 6 m<br>de altura, con un espesor de l\u00E1mina<br>"
				+ "m\u00EDnimo de 3 mm, con placa base de m\u00EDnimo<br>12 mm de espesor.</body></html>";
		JLabel lblLosPostesSon = new JLabel(textoPoste);
		lblLosPostesSon.setFont(new Font("Arial", Font.PLAIN, 11));
		lblLosPostesSon.setVerticalAlignment(SwingConstants.TOP);
		lblLosPostesSon.setBounds(533, 467, 241, 68);
		contentPane.add(lblLosPostesSon);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(784, 442, 252, 57);
		contentPane.add(panel_3);

		JRadioButton rdbtnSiPoste = new JRadioButton("SI");
		rdbtnSiPoste.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnSiPoste.setBounds(6, 24, 42, 23);
		panel_3.add(rdbtnSiPoste);

		JRadioButton rdbtnNoPoste = new JRadioButton("NO");
		rdbtnNoPoste.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnNoPoste.setBounds(50, 24, 42, 23);
		panel_3.add(rdbtnNoPoste);

		JLabel label_6 = new JLabel("Observaciones/Referencia");
		label_6.setFont(new Font("Arial", Font.PLAIN, 11));
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(78, 11, 174, 14);
		panel_3.add(label_6);

		txtObsPoste = new JTextField();
		txtObsPoste.setColumns(10);
		txtObsPoste.setBounds(98, 25, 136, 20);
		panel_3.add(txtObsPoste);

		JLabel lblTituloTrans = new JLabel("Transformador");
		lblTituloTrans.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTituloTrans.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloTrans.setFont(new Font("Arial", Font.BOLD, 11));
		lblTituloTrans.setBounds(1086, 160, 135, 14);
		contentPane.add(lblTituloTrans);

		String textoTrans = "<html><body>Se incluye un transformador tipo pad<br>mount de 100 KVA para cada UEPTM, que<br>incluye la base, cable de conexi\u00F3n con un<br>"
				+ "tablero de distribuci\u00F3n principal, malla a<br>tierra y pruebas de funcionamiento.</body></html>";
		JLabel lblDescTrans = new JLabel();
		lblDescTrans.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescTrans.setVerticalAlignment(SwingConstants.TOP);
		lblDescTrans.setText(textoTrans);
		lblDescTrans.setBounds(1062, 185, 214, 84);
		contentPane.add(lblDescTrans);

		JPanel panelTrans = new JPanel();
		panelTrans.setLayout(null);
		panelTrans.setBounds(1286, 160, 252, 57);
		contentPane.add(panelTrans);

		JRadioButton rdbtnSiTrans = new JRadioButton("SI");
		rdbtnSiTrans.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnSiTrans.setBounds(6, 24, 42, 23);
		panelTrans.add(rdbtnSiTrans);

		JRadioButton rdbtnNoTrans = new JRadioButton("NO");
		rdbtnNoTrans.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnNoTrans.setBounds(50, 24, 42, 23);
		panelTrans.add(rdbtnNoTrans);

		JLabel label_7 = new JLabel("Observaciones/Referencia");
		label_7.setFont(new Font("Arial", Font.PLAIN, 11));
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(78, 11, 174, 14);
		panelTrans.add(label_7);

		txtObsTrans = new JTextField();
		txtObsTrans.setColumns(10);
		txtObsTrans.setBounds(98, 25, 136, 20);
		panelTrans.add(txtObsTrans);

		JLabel lblTituloIlum = new JLabel("Iluminaci\u00F3n exterior");
		lblTituloIlum.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTituloIlum.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloIlum.setFont(new Font("Arial", Font.BOLD, 11));
		lblTituloIlum.setBounds(1086, 288, 135, 14);
		contentPane.add(lblTituloIlum);

		String textoIlum = "<html><body>Todo el cableado es soterrado, colocado<br>en tuber\u00EDa de PVC.<br>Se utilizan LED  con temperatura de color<br>"
				+ "de 2700K a 6500K, con voltaje de 110V a<br>220V, como m\u00EDnimo.<br>Eficiencia de luminosidad de 100 Lm/W con<br>"
				+ "un IP65 y de 120W.<br>La vida útil de la luminaria LED, es de al<br>menos 50000 horas en \u00F3ptimas condiciones</body></html>";
		JLabel lblDescIlum = new JLabel();
		lblDescIlum.setVerticalAlignment(SwingConstants.TOP);
		lblDescIlum.setText(textoIlum);
		lblDescIlum.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescIlum.setBounds(1062, 313, 214, 138);
		contentPane.add(lblDescIlum);

		JPanel panelIlum = new JPanel();
		panelIlum.setLayout(null);
		panelIlum.setBounds(1286, 288, 252, 57);
		contentPane.add(panelIlum);

		JRadioButton rdbtnSiIlum = new JRadioButton("SI");
		rdbtnSiIlum.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnSiIlum.setBounds(6, 24, 42, 23);
		panelIlum.add(rdbtnSiIlum);

		JRadioButton rdbtnNoIlum = new JRadioButton("NO");
		rdbtnNoIlum.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnNoIlum.setBounds(50, 24, 42, 23);
		panelIlum.add(rdbtnNoIlum);

		JLabel label_8 = new JLabel("Observaciones/Referencia");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Arial", Font.PLAIN, 11));
		label_8.setBounds(78, 11, 174, 14);
		panelIlum.add(label_8);

		txtObsIlum = new JTextField();
		txtObsIlum.setColumns(10);
		txtObsIlum.setBounds(98, 25, 136, 20);
		panelIlum.add(txtObsIlum);

		JPanel panelInfoObli = new JPanel();
		panelInfoObli.setBorder(new TitledBorder(null, "Informaci\u00F3n Obligatoria", TitledBorder.LEADING,
				TitledBorder.TOP, null, Color.RED));
		panelInfoObli.setBounds(1108, 467, 406, 269);
		contentPane.add(panelInfoObli);
		panelInfoObli.setLayout(null);

		JLabel lblObsGenerales = new JLabel("Observaciones Generales:");
		lblObsGenerales.setHorizontalAlignment(SwingConstants.RIGHT);
		lblObsGenerales.setFont(new Font("Arial", Font.PLAIN, 11));
		lblObsGenerales.setBounds(10, 26, 139, 14);
		panelInfoObli.add(lblObsGenerales);

		txtObsGen = new JTextField();
		txtObsGen.setBounds(159, 23, 228, 20);
		panelInfoObli.add(txtObsGen);
		txtObsGen.setColumns(10);

		JLabel lblResponsable = new JLabel("Responsable MinEduc:");
		lblResponsable.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResponsable.setFont(new Font("Arial", Font.PLAIN, 11));
		lblResponsable.setBounds(10, 52, 139, 14);
		panelInfoObli.add(lblResponsable);

		txtResponsable = new JTextField();
		txtResponsable.setColumns(10);
		txtResponsable.setBounds(159, 49, 228, 20);
		panelInfoObli.add(txtResponsable);

		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCargo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblCargo.setBounds(10, 78, 139, 14);
		panelInfoObli.add(lblCargo);

		txtCargo = new JTextField();
		txtCargo.setColumns(10);
		txtCargo.setBounds(159, 75, 228, 20);
		panelInfoObli.add(txtCargo);

		JLabel lblObsGen2 = new JLabel("Observaciones Generales:");
		lblObsGen2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblObsGen2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblObsGen2.setBounds(10, 120, 139, 14);
		panelInfoObli.add(lblObsGen2);

		txtObsGen2 = new JTextField();
		txtObsGen2.setColumns(10);
		txtObsGen2.setBounds(159, 117, 228, 20);
		panelInfoObli.add(txtObsGen2);

		JLabel lblRespContratista = new JLabel("Responsable Contratista");
		lblRespContratista.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRespContratista.setFont(new Font("Arial", Font.PLAIN, 11));
		lblRespContratista.setBounds(10, 146, 139, 14);
		panelInfoObli.add(lblRespContratista);

		txtResponsableContra = new JTextField();
		txtResponsableContra.setColumns(10);
		txtResponsableContra.setBounds(159, 143, 228, 20);
		panelInfoObli.add(txtResponsableContra);

		JLabel lblCargo2 = new JLabel("Cargo:");
		lblCargo2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCargo2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblCargo2.setBounds(10, 172, 139, 14);
		panelInfoObli.add(lblCargo2);

		txtCargo2 = new JTextField();
		txtCargo2.setColumns(10);
		txtCargo2.setBounds(159, 169, 228, 20);
		panelInfoObli.add(txtCargo2);

		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFecha.setFont(new Font("Arial", Font.PLAIN, 11));
		lblFecha.setBounds(10, 198, 139, 14);
		panelInfoObli.add(lblFecha);

		txtFecha = new JTextField();
		txtFecha.setColumns(10);
		txtFecha.setBounds(159, 195, 228, 20);
		panelInfoObli.add(txtFecha);

		JButton btnInsertarFoto = new JButton("Insertar Foto");
		btnInsertarFoto.setFont(new Font("Arial", Font.BOLD, 14));
		btnInsertarFoto.setBounds(222, 226, 149, 23);
		panelInfoObli.add(btnInsertarFoto);
	}
}
