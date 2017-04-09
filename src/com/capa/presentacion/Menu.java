package com.capa.presentacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.capa.negocios.ComponenteFichaMA;
import com.capa.negocios.ServicioFichaMA;

public class Menu extends JFrame {

	private static final long serialVersionUID = 6597717927813370338L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(10, 10, 1200, 699);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		ServicioFichaMA srvFichaMA = new ComponenteFichaMA();
		JButton btnAula1 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>1</body></html>");
		btnAula1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MaTemplate maTemplate = new MaTemplate("MA aulas-1");
				maTemplate.setVisible(true);

				if (srvFichaMA.existeFicha()) {
					llenarFicha(maTemplate);
				}
			}

			private void llenarFicha(MaTemplate maTemplate) {
				LinkedList<String[]> camposFormularios = srvFichaMA.extraerFormulario();
				if (camposFormularios.size() != maTemplate.getTextFields().size()) {
					System.err.println("ERROR: String=" + camposFormularios.size() + " JTextField="
							+ maTemplate.getTextFields().size());
					return;
				}

				Iterator<String[]> it = camposFormularios.iterator();
				maTemplate.getTextFields().forEach((item) -> {
					String[] temp = it.next();
					item[0].setText(temp[0]);
					item[1].setText(temp[1]);
				});

			}

		});
		btnAula1.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula1.setBounds(57, 64, 64, 72);
		btnAula1.setBackground(Color.cyan);
		contentPane.add(btnAula1);

		JButton btnAula2 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>2</body></html>");
		btnAula2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-2").setVisible(true);
			}
		});
		btnAula2.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula2.setBackground((Color) null);
		btnAula2.setBounds(57, 136, 64, 73);
		btnAula2.setBackground(Color.cyan);
		contentPane.add(btnAula2);

		JButton btnAula3 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>3</body></html>");
		btnAula3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-3").setVisible(true);
			}
		});
		btnAula3.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula3.setBackground(Color.CYAN);
		btnAula3.setBounds(57, 209, 64, 72);
		contentPane.add(btnAula3);

		JButton btnAula17 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>17</body></html>");
		btnAula17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-17").setVisible(true);
			}
		});
		btnAula17.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula17.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula17.setBackground(Color.CYAN);
		btnAula17.setBounds(57, 314, 64, 72);
		contentPane.add(btnAula17);

		JButton btnAula18 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>18</body></html>");
		btnAula18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-18").setVisible(true);
			}
		});
		btnAula18.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula18.setBackground(Color.CYAN);
		btnAula18.setBounds(57, 386, 64, 73);
		contentPane.add(btnAula18);

		JButton btnAula19 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>19</body></html>");
		btnAula19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-19").setVisible(true);
			}
		});
		btnAula19.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula19.setBackground(Color.CYAN);
		btnAula19.setBounds(57, 459, 64, 74);
		contentPane.add(btnAula19);

		JButton btnAula20 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>20</body></html>");
		btnAula20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-20").setVisible(true);
			}
		});
		btnAula20.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula20.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula20.setBackground(Color.CYAN);
		btnAula20.setBounds(57, 533, 64, 74);
		contentPane.add(btnAula20);

		JButton btnAula4 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>4</body></html>");
		btnAula4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-4").setVisible(true);
			}
		});
		btnAula4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula4.setBackground(Color.CYAN);
		btnAula4.setBounds(186, 64, 64, 72);
		contentPane.add(btnAula4);

		JButton btnAula5 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>5</body></html>");
		btnAula5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-5").setVisible(true);
			}
		});
		btnAula5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula5.setBackground(Color.CYAN);
		btnAula5.setBounds(186, 136, 64, 74);
		contentPane.add(btnAula5);

		JButton btnAula6 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>6</body></html>");
		btnAula6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-6").setVisible(true);
			}
		});
		btnAula6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula6.setBackground(Color.CYAN);
		btnAula6.setBounds(186, 210, 64, 72);
		contentPane.add(btnAula6);

		JButton btnAula21 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>21</body></html>");
		btnAula21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-21").setVisible(true);
			}
		});
		btnAula21.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula21.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula21.setBackground(Color.CYAN);
		btnAula21.setBounds(186, 391, 64, 72);
		contentPane.add(btnAula21);

		JButton btnAula22 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>22</body></html>");
		btnAula22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-22").setVisible(true);
			}
		});
		btnAula22.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula22.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula22.setBackground(Color.CYAN);
		btnAula22.setBounds(186, 463, 64, 72);
		contentPane.add(btnAula22);

		JButton btnAula23 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>23</body></html>");
		btnAula23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-23").setVisible(true);
			}
		});
		btnAula23.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula23.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula23.setBackground(Color.CYAN);
		btnAula23.setBounds(186, 535, 64, 72);
		contentPane.add(btnAula23);

		JButton btnAula7 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>7</body></html>");
		btnAula7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-7").setVisible(true);
			}
		});
		btnAula7.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula7.setBackground(Color.CYAN);
		btnAula7.setBounds(291, 64, 64, 72);
		contentPane.add(btnAula7);

		JButton btnAula9 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>9</body></html>");
		btnAula9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-9").setVisible(true);
			}
		});
		btnAula9.setFont(new Font("T" + "ahoma", Font.BOLD, 11));
		btnAula9.setBackground(Color.CYAN);
		btnAula9.setBounds(291, 176, 64, 72);
		contentPane.add(btnAula9);

		JButton btnAula8 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>8</body></html>");
		btnAula8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-8").setVisible(true);
			}
		});
		btnAula8.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula8.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula8.setBackground(Color.CYAN);
		btnAula8.setBounds(457, 64, 64, 72);
		contentPane.add(btnAula8);

		JButton btnAula10 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>10</body></html>");
		btnAula10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-10").setVisible(true);
			}
		});
		btnAula10.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula10.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula10.setBackground(Color.CYAN);
		btnAula10.setBounds(457, 176, 64, 72);
		contentPane.add(btnAula10);

		JButton btnAula11 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>11</body></html>");
		btnAula11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-11").setVisible(true);
			}
		});
		btnAula11.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula11.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula11.setBackground(Color.CYAN);
		btnAula11.setBounds(938, 64, 64, 72);
		contentPane.add(btnAula11);

		JButton btnAula12 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>12</body></html>");
		btnAula12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-12").setVisible(true);
			}
		});
		btnAula12.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula12.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula12.setBackground(Color.CYAN);
		btnAula12.setBounds(938, 136, 64, 73);
		contentPane.add(btnAula12);

		JButton btnAula13 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>13</body></html>");
		btnAula13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-13").setVisible(true);
			}
		});
		btnAula13.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula13.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula13.setBackground(Color.CYAN);
		btnAula13.setBounds(938, 209, 64, 72);
		contentPane.add(btnAula13);

		JButton btnAula24 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>24</body></html>");
		btnAula24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-24").setVisible(true);
			}
		});
		btnAula24.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula24.setBackground(Color.CYAN);
		btnAula24.setBounds(938, 391, 64, 72);
		contentPane.add(btnAula24);

		JButton btnAula25 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>25</body></html>");
		btnAula25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-25").setVisible(true);
			}
		});
		btnAula25.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula25.setBackground(Color.CYAN);
		btnAula25.setBounds(938, 463, 64, 72);
		contentPane.add(btnAula25);

		JButton btnAula26 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>26</body></html>");
		btnAula26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-26").setVisible(true);
			}
		});
		btnAula26.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula26.setBackground(Color.CYAN);
		btnAula26.setBounds(938, 535, 64, 72);
		contentPane.add(btnAula26);

		JButton btnAula14 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>14</body></html>");
		btnAula14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-14").setVisible(true);
			}
		});
		btnAula14.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula14.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula14.setBackground(Color.CYAN);
		btnAula14.setBounds(1068, 64, 67, 72);
		contentPane.add(btnAula14);

		JButton btnAula15 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>15</body></html>");
		btnAula15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-15").setVisible(true);
			}
		});
		btnAula15.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula15.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula15.setBackground(Color.CYAN);
		btnAula15.setBounds(1068, 136, 67, 73);
		contentPane.add(btnAula15);

		JButton btnAula16 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>16</body></html>");
		btnAula16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-16").setVisible(true);
			}
		});
		btnAula16.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula16.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula16.setBackground(Color.CYAN);
		btnAula16.setBounds(1068, 209, 67, 72);
		contentPane.add(btnAula16);

		JButton btnAula27 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>27</body></html>");
		btnAula27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-27").setVisible(true);
			}
		});
		btnAula27.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula27.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula27.setBackground(Color.CYAN);
		btnAula27.setBounds(1068, 312, 69, 79);
		contentPane.add(btnAula27);

		JButton btnAula28 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>28</body></html>");
		btnAula28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-28").setVisible(true);
			}
		});
		btnAula28.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula28.setBackground(Color.CYAN);
		btnAula28.setBounds(1068, 391, 69, 72);
		contentPane.add(btnAula28);

		JButton btnAula29 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>29</body></html>");
		btnAula29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-29").setVisible(true);
			}
		});
		btnAula29.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula29.setBackground(Color.CYAN);
		btnAula29.setBounds(1068, 463, 69, 72);
		contentPane.add(btnAula29);

		JButton btnAula30 = new JButton("<html><body><p align=\"center\">MA<br>aulas<br>30</body></html>");
		btnAula30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MaTemplate("MA aulas-30").setVisible(true);
			}
		});
		btnAula30.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula30.setBackground(Color.CYAN);
		btnAula30.setBounds(1068, 535, 69, 72);
		contentPane.add(btnAula30);

		JButton btnBañosAd1 = new JButton("<html><body><p align=\"center\">BS2<br>baños<br>adultos<br>1</body></html>");

		btnBañosAd1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBañosAd1.setBackground(new Color(240, 230, 140));
		btnBañosAd1.setBounds(186, 312, 64, 78);
		contentPane.add(btnBañosAd1);

		JButton btnBañosAd2 = new JButton("<html><body><p align=\"center\">BS2<br>baños<br>adultos<br>2</body></html>");
		btnBañosAd2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBañosAd2.setBackground(new Color(240, 230, 140));
		btnBañosAd2.setBounds(938, 314, 64, 76);
		contentPane.add(btnBañosAd2);

		JButton btnMSsalon1 = new JButton(
				"<html><body><p align=\"center\">MS<br>Salón<br>uso<br>público<br>1</body></html>");
		btnMSsalon1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MS("MS Salón de Uso Múltiple-1").setVisible(true);
			}
		});
		btnMSsalon1.setForeground(new Color(255, 255, 255));
		btnMSsalon1.setHorizontalAlignment(SwingConstants.LEFT);
		btnMSsalon1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMSsalon1.setBackground(new Color(0, 0, 0));
		btnMSsalon1.setBounds(819, 64, 64, 72);
		contentPane.add(btnMSsalon1);

		JButton btnMSsalon2 = new JButton(
				"<html><body><p align=\"center\">MS<br>Salón<br>uso<br>público<br>2</body></html>");
		btnMSsalon2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MS("MS Salón de Uso Múltiple-2").setVisible(true);
			}
		});
		btnMSsalon2.setForeground(new Color(255, 255, 255));
		btnMSsalon2.setHorizontalAlignment(SwingConstants.LEFT);
		btnMSsalon2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMSsalon2.setBackground(new Color(0, 0, 0));
		btnMSsalon2.setBounds(819, 136, 64, 73);
		contentPane.add(btnMSsalon2);

		JButton btnMBbiblio1 = new JButton("<html><body><p align=\"left\">MB<br>Biblioteca<br>1</body></html>");
		btnMBbiblio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MbTemplate().setVisible(true);
			}
		});
		btnMBbiblio1.setHorizontalAlignment(SwingConstants.LEFT);
		btnMBbiblio1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMBbiblio1.setBackground(new Color(238, 130, 238));
		btnMBbiblio1.setBounds(819, 209, 64, 72);
		contentPane.add(btnMBbiblio1);

		JButton btnBS1bañosNiñ1 = new JButton(
				"<html><body><p align=\"center\">BS1<br>baños<br>niños<br>1</body></html>");
		btnBS1bañosNiñ1.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnBS1bañosNiñ1.setBackground(new Color(199, 21, 133));
		btnBS1bañosNiñ1.setBounds(291, 136, 35, 40);
		contentPane.add(btnBS1bañosNiñ1);

		JButton btnBS1bañosNiñ2 = new JButton(
				"<html><body><p align=\"center\">BS1<br>baños<br>niños<br>2</body></html>");
		btnBS1bañosNiñ2.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnBS1bañosNiñ2.setBackground(new Color(199, 21, 133));
		btnBS1bañosNiñ2.setBounds(326, 136, 37, 40);
		contentPane.add(btnBS1bañosNiñ2);

		JButton btnBS1bañosNiñ3 = new JButton(
				"<html><body><p align=\"center\">BS1<br>baños<br>niños<br>3</body></html>");
		btnBS1bañosNiñ3.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnBS1bañosNiñ3.setBackground(new Color(199, 21, 133));
		btnBS1bañosNiñ3.setBounds(449, 136, 37, 40);
		contentPane.add(btnBS1bañosNiñ3);

		JButton btnBS1bañosNiñ4 = new JButton(
				"<html><body><p align=\"center\">BS1<br>baños<br>niños<br>4</body></html>");
		btnBS1bañosNiñ4.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnBS1bañosNiñ4.setBackground(new Color(199, 21, 133));
		btnBS1bañosNiñ4.setBounds(486, 136, 35, 40);
		contentPane.add(btnBS1bañosNiñ4);

		JButton btnMTtecnlogico1 = new JButton(
				"<html><body><p align=\"left\">MT Lab<br>Tecnólogico<br>1</body></html>");
		btnMTtecnlogico1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMTtecnlogico1.setBackground(new Color(238, 130, 238));
		btnMTtecnlogico1.setBounds(579, 457, 64, 73);
		contentPane.add(btnMTtecnlogico1);

		JButton btnMTtecnlogico2 = new JButton(
				"<html><body><p align=\"left\">MT Lab<br>Tecnólogico<br>1</body></html>");
		btnMTtecnlogico2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMTtecnlogico2.setBackground(new Color(238, 130, 238));
		btnMTtecnlogico2.setBounds(579, 531, 64, 74);
		contentPane.add(btnMTtecnlogico2);

		JButton btnMMlab1 = new JButton("<html><body><p align=\"center\">MM<br>Lab<br>1</body></html>");
		btnMMlab1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MmTemplate("laboratorio-1").setVisible(true);
			}
		});
		btnMMlab1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMMlab1.setBackground(new Color(238, 130, 238));
		btnMMlab1.setBounds(579, 314, 64, 72);
		contentPane.add(btnMMlab1);

		JButton btnMMlab2 = new JButton("<html><body><p align=\"center\">MM<br>Lab<br>2</body></html>");
		btnMMlab2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MmTemplate("laboratorio-2").setVisible(true);
			}
		});
		btnMMlab2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMMlab2.setBackground(new Color(238, 130, 238));
		btnMMlab2.setBounds(579, 386, 64, 72);
		contentPane.add(btnMMlab2);

		JButton btnBS3bañosAdo1 = new JButton(
				"<html><body><p align=\"center\">BS3 Baños<br>Adosados<br>1</body></html>");
		btnBS3bañosAdo1.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnBS3bañosAdo1.setBackground(new Color(250, 128, 114));
		btnBS3bañosAdo1.setBounds(579, 202, 62, 36);
		contentPane.add(btnBS3bañosAdo1);

		JButton btnBS3bañosAdo2 = new JButton(
				"<html><body><p align=\"center\">BS3 Baños<br>Adosados<br>2</body></html>");
		btnBS3bañosAdo2.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnBS3bañosAdo2.setBackground(new Color(250, 128, 114));
		btnBS3bañosAdo2.setBounds(579, 242, 62, 36);
		contentPane.add(btnBS3bañosAdo2);

		JButton btnMDadmin1 = new JButton("<html><body><p align=\"left\">MD<br>Administrativo</body></html>");
		btnMDadmin1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MdTemplate().setVisible(true);
			}
		});
		btnMDadmin1.setHorizontalAlignment(SwingConstants.LEFT);
		btnMDadmin1.setForeground(Color.WHITE);
		btnMDadmin1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMDadmin1.setBackground(Color.BLACK);
		btnMDadmin1.setBounds(579, 64, 64, 91);
		contentPane.add(btnMDadmin1);

		JButton btnPortonGarita = new JButton("<html><body><p align=\"center\">Portón y Garita</body></html>");
		btnPortonGarita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new PGTemplate().setVisible(true);
			}
		});
		btnPortonGarita.setForeground(new Color(255, 255, 255));
		btnPortonGarita.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPortonGarita.setBackground(new Color(0, 0, 255));
		btnPortonGarita.setBounds(641, 27, 180, 22);
		contentPane.add(btnPortonGarita);

		JButton btnEXkitElec = new JButton("<html><body><p align=\"center\">EX kit<br>Elec</body></html>");
		btnEXkitElec.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnEXkitElec.setBackground(new Color(144, 238, 144));
		btnEXkitElec.setBounds(668, 176, 62, 36);
		contentPane.add(btnEXkitElec);

		JButton btnhlKithidrosa = new JButton("<html><body><p align=\"center\">HL kit<br>Hidrosa</body></html>");
		btnhlKithidrosa.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnhlKithidrosa.setBackground(new Color(50, 205, 50));
		btnhlKithidrosa.setBounds(729, 176, 62, 36);
		contentPane.add(btnhlKithidrosa);

		JButton btnWFvozDatos = new JButton("<html><body><p align=\"center\">WF<br>Voz-Datos</body></html>");
		btnWFvozDatos.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnWFvozDatos.setBackground(new Color(238, 232, 170));
		btnWFvozDatos.setBounds(668, 211, 62, 36);
		contentPane.add(btnWFvozDatos);

		JButton btnMEXexterior = new JButton("<html><body><p align=\"center\">MEX<br>Exterior</body></html>");
		btnMEXexterior.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnMEXexterior.setBackground(new Color(144, 238, 144));
		btnMEXexterior.setBounds(729, 211, 62, 36);
		contentPane.add(btnMEXexterior);

		JButton btnCEcerramiento = new JButton("<html><body><p align=\"center\">CE1<br>Cerramiento</body></html>");
		btnCEcerramiento.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnCEcerramiento.setBackground(new Color(144, 238, 144));
		btnCEcerramiento.setBounds(668, 247, 62, 36);
		contentPane.add(btnCEcerramiento);

		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/com/capa/imagenes/General.png")));
		lblNewLabel.setBounds(20, 0, 1164, 679);
		contentPane.add(lblNewLabel);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}
}
