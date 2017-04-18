package com.capa.presentacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.capa.datos.TFicha;
import com.capa.datos.TdetalleFicha;
import com.capa.negocios.ComponenteFicha;
import com.capa.negocios.ServicioFicha;
import com.capa.presentacion.FichaB;
import com.capa.presentacion.JPcabecera;
import com.capa.presentacion.JPinformacionObligatoria;
import com.capa.util.Utilitarios;

public class FichaBacometidas extends JFrame {

	private static final long serialVersionUID = -6514846288661849531L;
	private JPanel contentPane;
	private JTextField txtObs0;
	private JTextField txtObs1;
	private JTextField txtObs2;
	private JTextField txtObs3;
	private JTextField txtObs4;
	private JTextField txtObs5;
	private JTextField txtObs6;
	private JTextField txtObs7;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServicioFicha sf = new ComponenteFicha();
					TFicha fi = sf.buscarFormulario("FB-A");
					FichaBacometidas frame = new FichaBacometidas(fi);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FichaBacometidas(TFicha ficha) {
		setTitle(ficha.getFiDescripcion().toUpperCase());
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1306, 695);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblTituloPoste = new JLabel("");
		lblTituloPoste.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTituloPoste.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloPoste.setFont(new Font("Arial", Font.BOLD, 11));
		lblTituloPoste.setBounds(458, 442, 227, 14);
		contentPane.add(lblTituloPoste);

		JPinformacionObligatoria jPinfoOblig = new JPinformacionObligatoria(860, 430);
		contentPane.add(jPinfoOblig.getPnlInformacionObl());

		JPcabecera jPcabecera = new JPcabecera();
		Utilitarios.llenarCabecera(jPcabecera);

		contentPane.add(jPcabecera.getCabecera());

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tuber\u00EDa de PVC",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 125, 249, 61);
		contentPane.add(panel);

		JLabel lbllaTuberaDe = new JLabel(
				"<html><body><p align justify>\r\nLa tubería de PVC presión, unión roscable instalada cumple con las especificaciones:\r\n<br>ASTM D- 1785- 89, para tubería de agua fría.\r\n</body></html>");
		lbllaTuberaDe.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lbllaTuberaDe.setBounds(10, 13, 235, 45);
		panel.add(lbllaTuberaDe);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(269, 125, 139, 58);
		contentPane.add(panel_1);

		JLabel label_1 = new JLabel("Observación/Referencia");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_1.setBounds(10, 19, 123, 14);
		panel_1.add(label_1);

		JRadioButton radioButton = new JRadioButton("");
		radioButton.setBounds(31, 2, 21, 23);
		panel_1.add(radioButton);

		JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setBounds(81, 2, 21, 23);
		panel_1.add(radioButton_1);

		JLabel label_2 = new JLabel("SI");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_2.setBounds(10, 5, 21, 14);
		panel_1.add(label_2);

		JLabel label_9 = new JLabel("NO");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_9.setBounds(108, 5, 21, 14);
		panel_1.add(label_9);

		txtObs0 = new JTextField();
		txtObs0.setColumns(10);
		txtObs0.setBounds(10, 32, 123, 20);
		panel_1.add(txtObs0);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Agua potable",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(10, 196, 249, 61);
		contentPane.add(panel_2);

		JLabel lblLaTuberaInstalada = new JLabel(
				"<html><body><p align justify>\r\nLa tubería instalada soporta una prueba de presión no menor a 100 psi.\r\n</body></html>");
		lblLaTuberaInstalada.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblLaTuberaInstalada.setBounds(10, 13, 235, 45);
		panel_2.add(lblLaTuberaInstalada);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"Tuber\u00EDas PVC aguas servidas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(10, 268, 249, 61);
		contentPane.add(panel_3);

		JLabel lbllaTuberaInstalada = new JLabel(
				"<html><body><p align justify>La tubería instalada sirve para  alcantarillado, desalojo de aguas servidas y aguas lluvias.</body></html>");
		lbllaTuberaInstalada.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lbllaTuberaInstalada.setBounds(10, 13, 235, 45);
		panel_3.add(lbllaTuberaInstalada);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(269, 199, 139, 58);
		contentPane.add(panel_4);

		JLabel label = new JLabel("Observación/Referencia");
		label.setFont(new Font("Tahoma", Font.BOLD, 10));
		label.setBounds(10, 19, 123, 14);
		panel_4.add(label);

		JRadioButton radioButton_2 = new JRadioButton("");
		radioButton_2.setBounds(31, 2, 21, 23);
		panel_4.add(radioButton_2);

		JRadioButton radioButton_3 = new JRadioButton("");
		radioButton_3.setBounds(81, 2, 21, 23);
		panel_4.add(radioButton_3);

		JLabel label_3 = new JLabel("SI");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_3.setBounds(10, 5, 21, 14);
		panel_4.add(label_3);

		JLabel label_4 = new JLabel("NO");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_4.setBounds(108, 5, 21, 14);
		panel_4.add(label_4);

		txtObs1 = new JTextField();
		txtObs1.setColumns(10);
		txtObs1.setBounds(10, 32, 123, 20);
		panel_4.add(txtObs1);

		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(269, 271, 139, 58);
		contentPane.add(panel_5);

		JLabel label_5 = new JLabel("Observación/Referencia");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_5.setBounds(10, 19, 123, 14);
		panel_5.add(label_5);

		JRadioButton radioButton_4 = new JRadioButton("");
		radioButton_4.setBounds(31, 2, 21, 23);
		panel_5.add(radioButton_4);

		JRadioButton radioButton_5 = new JRadioButton("");
		radioButton_5.setBounds(81, 2, 21, 23);
		panel_5.add(radioButton_5);

		JLabel label_6 = new JLabel("SI");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_6.setBounds(10, 5, 21, 14);
		panel_5.add(label_6);

		JLabel label_10 = new JLabel("NO");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_10.setBounds(108, 5, 21, 14);
		panel_5.add(label_10);

		txtObs2 = new JTextField();
		txtObs2.setColumns(10);
		txtObs2.setBounds(10, 32, 123, 20);
		panel_5.add(txtObs2);

		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Voz y Datos",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_6.setBounds(10, 340, 249, 214);
		contentPane.add(panel_6);

		JLabel lblDescVoz = new JLabel();
		lblDescVoz.setBounds(4, 11, 241, 203);
		panel_6.add(lblDescVoz);
		lblDescVoz.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescVoz.setVerticalAlignment(SwingConstants.TOP);

		JLabel lblseProveeUn = new JLabel(
				"<html><body><p align justify>Se provee un sistema categoría 6 tipo inalámbrico para el servicio de al menos 110 usuarios, 50 por cada laboratorio y 10 para módulo de administración. La interconexión entre equipos se realiza mediante cable estructurado siempre y cuando la distancia sea menor a 100 m, cumpliendo la Norma y será Categoría 6 o superior, en caso de ser soterrado y en caso de estar cercano a cables de energía eléctrica se utiliza conductor tipo SHIELDED para evitar interferencia electromagnética. Se coloca al menos 1 router wireless Tipo N de 10/100/100 MB, y un Access point por laboratorio y módulo de administración. El rack es ubicado en uno<br>de los laboratorios de tecnología, y se provee de un conversor de media. Se consideran cajas de conexión de 60X60X70 y tubería PVC y patch cord de FO.</body></html>");
		lblseProveeUn.setBounds(10, 22, 235, 176);
		panel_6.add(lblseProveeUn);
		lblseProveeUn.setFont(new Font("Tahoma", Font.PLAIN, 9));

		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_7.setBounds(269, 340, 139, 58);
		contentPane.add(panel_7);

		JLabel label_11 = new JLabel("Observación/Referencia");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_11.setBounds(10, 19, 123, 14);
		panel_7.add(label_11);

		JRadioButton radioButton_6 = new JRadioButton("");
		radioButton_6.setBounds(31, 2, 21, 23);
		panel_7.add(radioButton_6);

		JRadioButton radioButton_7 = new JRadioButton("");
		radioButton_7.setBounds(81, 2, 21, 23);
		panel_7.add(radioButton_7);

		JLabel label_12 = new JLabel("SI");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_12.setBounds(10, 5, 21, 14);
		panel_7.add(label_12);

		JLabel label_13 = new JLabel("NO");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_13.setBounds(108, 5, 21, 14);
		panel_7.add(label_13);

		txtObs3 = new JTextField();
		txtObs3.setColumns(10);
		txtObs3.setBounds(10, 32, 123, 20);
		panel_7.add(txtObs3);

		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cableado el\u00E9ctrico",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_8.setBounds(418, 125, 249, 234);
		contentPane.add(panel_8);

		JLabel lblenElCableado = new JLabel(
				"<html><body><p align justify>En el cableado eléctrico se utilizan calibres:<br>- THHN #8, #10, #12, #14<br>- Cable AWG #14desnudo<br>Los conductores cumplen con las normas<br>de fabricación NEMA ASTM-B3, ASTM-B8,<br>UL62, UL83 y la UL-1581 y aprobados<br>según el sistema de calidad del cable.<br>Aislamiento: Cloruro de polietileno (PVC) de<br>90°C (194°F) resistente a la humedad, no<br>propaga llama, voltaje de servicio 600V, el<br>color de cada cable es de acuerdo a las <br>especificaciones aprobadas en nuestro medio.<br>El tendido exterior se considera con<br>tubería soterrada de PVC de 3\" (75 mm) y<br>cajas de conexión de dimensiones de 60X60X70 cm.</body></html>");
		lblenElCableado.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblenElCableado.setBounds(10, 22, 235, 201);
		panel_8.add(lblenElCableado);

		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"Poste el\u00E9ctrico met\u00E1lico de 6 m", TitledBorder.LEADING, TitledBorder.TOP, null,
				new Color(0, 0, 0)));
		panel_9.setBounds(418, 370, 249, 61);
		contentPane.add(panel_9);

		JLabel lbllosPostesSon = new JLabel(
				"<html><body><p align justify>Los postes son metálicos galvanizados de 6 m de altura, con un espesor de lámina mínimo de 3 mm, con placa base de mínimo 12 mm de espesor.</body></html>");
		lbllosPostesSon.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lbllosPostesSon.setBounds(10, 13, 235, 45);
		panel_9.add(lbllosPostesSon);

		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_10.setBounds(677, 128, 139, 58);
		contentPane.add(panel_10);

		JLabel label_14 = new JLabel("Observación/Referencia");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_14.setBounds(10, 19, 123, 14);
		panel_10.add(label_14);

		JRadioButton radioButton_8 = new JRadioButton("");
		radioButton_8.setBounds(31, 2, 21, 23);
		panel_10.add(radioButton_8);

		JRadioButton radioButton_9 = new JRadioButton("");
		radioButton_9.setBounds(81, 2, 21, 23);
		panel_10.add(radioButton_9);

		JLabel label_15 = new JLabel("SI");
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_15.setBounds(10, 5, 21, 14);
		panel_10.add(label_15);

		JLabel label_16 = new JLabel("NO");
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_16.setBounds(108, 5, 21, 14);
		panel_10.add(label_16);

		txtObs4 = new JTextField();
		txtObs4.setColumns(10);
		txtObs4.setBounds(10, 32, 123, 20);
		panel_10.add(txtObs4);

		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_11.setBounds(677, 373, 139, 58);
		contentPane.add(panel_11);

		JLabel label_17 = new JLabel("Observación/Referencia");
		label_17.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_17.setBounds(10, 19, 123, 14);
		panel_11.add(label_17);

		JRadioButton radioButton_10 = new JRadioButton("");
		radioButton_10.setBounds(31, 2, 21, 23);
		panel_11.add(radioButton_10);

		JRadioButton radioButton_11 = new JRadioButton("");
		radioButton_11.setBounds(81, 2, 21, 23);
		panel_11.add(radioButton_11);

		JLabel label_18 = new JLabel("SI");
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_18.setBounds(10, 5, 21, 14);
		panel_11.add(label_18);

		JLabel label_19 = new JLabel("NO");
		label_19.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_19.setBounds(108, 5, 21, 14);
		panel_11.add(label_19);

		txtObs5 = new JTextField();
		txtObs5.setColumns(10);
		txtObs5.setBounds(10, 32, 123, 20);
		panel_11.add(txtObs5);

		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Transformador",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_12.setBounds(866, 125, 249, 103);
		contentPane.add(panel_12);

		JLabel lblSeIncluyeUn = new JLabel(
				"<html><body><p align justify>\r\nSe incluye un transformador tipo pad<br>mount de 100 KVA para cada UEPTM, que<br>incluye la base, cable de conexión con un<br>tablero de distribución principal, malla a<br>tierra y pruebas de funcionamiento.</body></html>");
		lblSeIncluyeUn.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblSeIncluyeUn.setBounds(10, 13, 235, 77);
		panel_12.add(lblSeIncluyeUn);

		JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_13.setBounds(1141, 128, 139, 58);
		contentPane.add(panel_13);

		JLabel label_7 = new JLabel("Observación/Referencia");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_7.setBounds(10, 19, 123, 14);
		panel_13.add(label_7);

		JRadioButton radioButton_12 = new JRadioButton("");
		radioButton_12.setBounds(31, 2, 21, 23);
		panel_13.add(radioButton_12);

		JRadioButton radioButton_13 = new JRadioButton("");
		radioButton_13.setBounds(81, 2, 21, 23);
		panel_13.add(radioButton_13);

		JLabel label_8 = new JLabel("SI");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_8.setBounds(10, 5, 21, 14);
		panel_13.add(label_8);

		JLabel label_20 = new JLabel("NO");
		label_20.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_20.setBounds(108, 5, 21, 14);
		panel_13.add(label_20);

		txtObs6 = new JTextField();
		txtObs6.setColumns(10);
		txtObs6.setBounds(10, 32, 123, 20);
		panel_13.add(txtObs6);

		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Iluminaci\u00F3n exterior",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_14.setBounds(866, 244, 249, 160);
		contentPane.add(panel_14);

		JLabel lblTodoElCableado = new JLabel(
				"<html><body><p align justify>\r\nTodo el cableado es soterrado, colocado<br>en tubería de PVC.<br>Se utilizan LED  con temperatura de color<br>de 2700K a 6500K, con voltaje de 110V a<br>220V, como mínimo.<br>Eficiencia de luminosidad de 100 Lm/W con<br>un IP65 y de 120W.<br>La vida útil de la luminaria LED, es de al<br>menos 50000 horas en óptimas condiciones</body></html>");
		lblTodoElCableado.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblTodoElCableado.setBounds(10, 22, 235, 127);
		panel_14.add(lblTodoElCableado);

		JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_15.setBounds(1141, 244, 139, 58);
		contentPane.add(panel_15);

		JLabel label_21 = new JLabel("Observación/Referencia");
		label_21.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_21.setBounds(10, 19, 123, 14);
		panel_15.add(label_21);

		JRadioButton radioButton_14 = new JRadioButton("");
		radioButton_14.setBounds(31, 2, 21, 23);
		panel_15.add(radioButton_14);

		JRadioButton radioButton_15 = new JRadioButton("");
		radioButton_15.setBounds(81, 2, 21, 23);
		panel_15.add(radioButton_15);

		JLabel label_22 = new JLabel("SI");
		label_22.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_22.setBounds(10, 5, 21, 14);
		panel_15.add(label_22);

		JLabel label_23 = new JLabel("NO");
		label_23.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_23.setBounds(108, 5, 21, 14);
		panel_15.add(label_23);

		txtObs7 = new JTextField();
		txtObs7.setColumns(10);
		txtObs7.setBounds(10, 32, 123, 20);
		panel_15.add(txtObs7);

		jPcabecera.getBtnRegistrar().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				new FichaB().setVisible(true);
				dispose();
			}
		});
	}

	public List<TdetalleFicha> detallesFicha() {
		return null;
	}
}
