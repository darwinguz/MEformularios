package com.capa.presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
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

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1320, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnAula1 = new JButton("<html><body>MA<br>aulas-1</body></html>");
		btnAula1.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula1.setBounds(79, 74, 67, 72);
		btnAula1.setBackground(Color.cyan);
		contentPane.add(btnAula1);

		JButton btnAula2 = new JButton("<html><body>MA<br>aulas-2</body></html>");
		btnAula2.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula2.setBackground((Color) null);
		btnAula2.setBounds(79, 145, 67, 72);
		btnAula2.setBackground(Color.cyan);
		contentPane.add(btnAula2);

		JButton btnAula3 = new JButton("<html><body>MA<br>aulas-3</body></html>");
		btnAula3.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula3.setBackground(Color.CYAN);
		btnAula3.setBounds(79, 217, 67, 72);
		contentPane.add(btnAula3);

		JButton btnAula4 = new JButton("<html><body>MA<br>aulas-4</body></html>");
		btnAula4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula4.setBackground(Color.CYAN);
		btnAula4.setBounds(207, 75, 67, 72);
		contentPane.add(btnAula4);

		JButton btnAula5 = new JButton("<html><body>MA<br>aulas-5</body></html>");
		btnAula5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula5.setBackground(Color.CYAN);
		btnAula5.setBounds(207, 146, 67, 72);
		contentPane.add(btnAula5);

		JButton btnAula6 = new JButton("<html><body>MA<br>aulas-6</body></html>");
		btnAula6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula6.setBackground(Color.CYAN);
		btnAula6.setBounds(207, 217, 67, 72);
		contentPane.add(btnAula6);

		JButton btnAula7 = new JButton("<html><body>MA<br>aulas-7</body></html>");
		btnAula7.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula7.setBackground(Color.CYAN);
		btnAula7.setBounds(315, 74, 62, 72);
		contentPane.add(btnAula7);

		JButton btnAula9 = new JButton("<html><body>MA<br>aulas-9</body></html>");
		btnAula9.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula9.setBackground(Color.CYAN);
		btnAula9.setBounds(315, 188, 62, 72);
		contentPane.add(btnAula9);

		JButton btnAula17 = new JButton("<html><body>MA<br>aulas-17</body></html>");
		btnAula17.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula17.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula17.setBackground(Color.CYAN);
		btnAula17.setBounds(79, 324, 67, 72);
		contentPane.add(btnAula17);

		JButton btnAula18 = new JButton("<html><body>MA<br>aulas-18</body></html>");
		btnAula18.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula18.setBackground(Color.CYAN);
		btnAula18.setBounds(79, 397, 67, 72);
		contentPane.add(btnAula18);

		JButton btnAula19 = new JButton("<html><body>MA<br>aulas-19</body></html>");
		btnAula19.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula19.setBackground(Color.CYAN);
		btnAula19.setBounds(79, 468, 67, 72);
		contentPane.add(btnAula19);

		JButton btnmaaulas = new JButton("<html><body>MA<br>aulas-20</body></html>");
		btnmaaulas.setHorizontalAlignment(SwingConstants.LEFT);
		btnmaaulas.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnmaaulas.setBackground(Color.CYAN);
		btnmaaulas.setBounds(79, 538, 67, 79);
		contentPane.add(btnmaaulas);

		JButton btnAula21 = new JButton("<html><body><p align =\"left\">MA<br>aulas-21</body></html>");
		btnAula21.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula21.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula21.setBackground(Color.CYAN);
		btnAula21.setBounds(207, 397, 67, 79);
		contentPane.add(btnAula21);

		JButton btnAula22 = new JButton("<html><body>MA<br>aulas-22</body></html>");
		btnAula22.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula22.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula22.setBackground(Color.CYAN);
		btnAula22.setBounds(207, 475, 67, 72);
		contentPane.add(btnAula22);

		JButton btnAula23 = new JButton("<html><body>MA<br>aulas-23</body></html>");
		btnAula23.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula23.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula23.setBackground(Color.CYAN);
		btnAula23.setBounds(207, 545, 67, 72);
		contentPane.add(btnAula23);

		JButton btnAula8 = new JButton("<html><body><p align =\"left\">MA<br>aulas-8</body></html>");
		btnAula8.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula8.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula8.setBackground(Color.CYAN);
		btnAula8.setBounds(479, 74, 67, 72);
		contentPane.add(btnAula8);

		JButton btnAula10 = new JButton("<html><body><p align =\"left\">MA<br>aulas-10</body></html>");
		btnAula10.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula10.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula10.setBackground(Color.CYAN);
		btnAula10.setBounds(479, 188, 67, 72);
		contentPane.add(btnAula10);

		JButton btnAula11 = new JButton("<html><body><p align =\"left\">MA<br>aulas-11</body></html>");
		btnAula11.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula11.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula11.setBackground(Color.CYAN);
		btnAula11.setBounds(958, 74, 67, 72);
		contentPane.add(btnAula11);

		JButton btnAula12 = new JButton("<html><body><p align =\"left\">MA<br>aulas-12</body></html>");
		btnAula12.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula12.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula12.setBackground(Color.CYAN);
		btnAula12.setBounds(958, 145, 67, 72);
		contentPane.add(btnAula12);

		JButton btnAula13 = new JButton("<html><body><p align =\"left\">MA<br>aulas-13</body></html>");
		btnAula13.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula13.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula13.setBackground(Color.CYAN);
		btnAula13.setBounds(958, 217, 67, 72);
		contentPane.add(btnAula13);

		JButton btnAula14 = new JButton("<html><body><p align =\"left\">MA<br>aulas-14</body></html>");
		btnAula14.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula14.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula14.setBackground(Color.CYAN);
		btnAula14.setBounds(1090, 74, 67, 72);
		contentPane.add(btnAula14);

		JButton btnAula15 = new JButton("<html><body><p align =\"left\">MA<br>aulas-15</body></html>");
		btnAula15.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula15.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula15.setBackground(Color.CYAN);
		btnAula15.setBounds(1090, 145, 67, 72);
		contentPane.add(btnAula15);

		JButton btnAula16 = new JButton("<html><body><p align =\"left\">MA<br>aulas-16</body></html>");
		btnAula16.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula16.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula16.setBackground(Color.CYAN);
		btnAula16.setBounds(1090, 217, 67, 72);
		contentPane.add(btnAula16);

		JButton btnAula27 = new JButton("<html><body>MA<br>aulas-27</body></html>");
		btnAula27.setHorizontalAlignment(SwingConstants.LEFT);
		btnAula27.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula27.setBackground(Color.CYAN);
		btnAula27.setBounds(1095, 324, 67, 79);
		contentPane.add(btnAula27);

		JButton btnAula28 = new JButton("<html><body>MA<br>aulas-28</body></html>");
		btnAula28.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula28.setBackground(Color.CYAN);
		btnAula28.setBounds(1095, 403, 67, 72);
		contentPane.add(btnAula28);

		JButton btnAula29 = new JButton("<html><body>MA<br>aulas-29</body></html>");
		btnAula29.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula29.setBackground(Color.CYAN);
		btnAula29.setBounds(1095, 475, 67, 72);
		contentPane.add(btnAula29);
		
		JButton btnAula30 = new JButton("<html><body>MA<br>aulas-30</body></html>");
		btnAula30.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula30.setBackground(Color.CYAN);
		btnAula30.setBounds(1095, 545, 67, 72);
		contentPane.add(btnAula30);
		
		JButton btnAula24 = new JButton("<html><body>MA<br>aulas-24</body></html>");
		btnAula24.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAula24.setBackground(Color.CYAN);
		btnAula24.setBounds(958, 402, 67, 74);
		contentPane.add(btnAula24);
				
				JButton btnAula25 = new JButton("<html><body>MA<br>aulas-25</body></html>");
				btnAula25.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnAula25.setBackground(Color.CYAN);
				btnAula25.setBounds(958, 476, 67, 71);
				contentPane.add(btnAula25);
				
				JButton btnAula26 = new JButton("<html><body>MA<br>aulas-26</body></html>");
				btnAula26.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnAula26.setBackground(Color.CYAN);
				btnAula26.setBounds(958, 546, 67, 71);
				contentPane.add(btnAula26);
				
						JLabel lblNewLabel = new JLabel("");
						lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
						lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/com/capa/imagenes/panel_menu.PNG")));
						lblNewLabel.setBounds(43, 11, 1164, 679);
						contentPane.add(lblNewLabel);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		// JLabel lblNewLabel = new JLabel("");
		// lblNewLabel.setIcon(new
		// ImageIcon(Menu.class.getResource("/com/capa/imagenes/ImgMenuC.jpg")));
		// lblNewLabel.setBounds(10, 11, 1294, 679);
		// contentPane.add(lblNewLabel);

	}
}
