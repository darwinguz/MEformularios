package com.capa.negocios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MySql {
	private Connection conexion;

	public MySql(String server, String base, String usuario, String pass) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://" + server + "/" + base;
			this.conexion = DriverManager.getConnection(url, usuario, pass);

		} catch (Exception e) {
			String message = "<html><p><b>ERROR: No se ha podido conectar con la base de datos </b></p>"
					+ "<p>Verifique los parametros de conexion o el estado de su conexion</p> MENSAJES: "
					+ e.getMessage();
			JOptionPane.showMessageDialog(new JFrame(), message);
		}
	}

	public void close() {
		try {
			this.conexion.close();
		} catch (SQLException error) {
			String message = null;
			message = "<html><p><b>Error de Mysql: </b> " + error.getMessage() + "</p> " + "<p><b>Codigo de : </b>"
					+ error.getErrorCode() + " </p></html>";
			JOptionPane.showMessageDialog(new JFrame(), message);
		}
	}

	public Connection getConexion() {
		return conexion;
	}
}
