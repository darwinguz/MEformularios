package com.capa.negocios;

import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.capa.datos.TCabecera;

public class Query {
	private static MySql mysql = new MySql("localhost", "db_ministerio_ed", "root", "root");

	public static ResultSet seleccionar(String query) {
		Statement comando;
		ResultSet resultado = null;

		try {
			comando = mysql.getConexion().createStatement();
			resultado = comando.executeQuery(query);
		} catch (SQLException e) {
			String message = "<html><p><b>La consulta ejecutada fue: </b>" + query + " </p>"
					+ "<p><b>Error de Mysql-Select: </b> " + e.getMessage() + "</p> " + "<p><b>Código de Error: </b>"
					+ e.getErrorCode() + " </p></html>";
			JOptionPane.showMessageDialog(new JFrame(), message);
		}
		return resultado;
	}

	public static void insertar(String query) {
		Statement comando;
		try {
			comando = mysql.getConexion().createStatement();
			comando.executeUpdate(query);
		} catch (SQLException error) {
			String message = "<html><p><b>Error de Mysql-Insert: </b> " + error.getMessage() + "</p> "
					+ "<p><b>Código de Error: </b>" + error.getErrorCode() + " </p></html>";
			JOptionPane.showMessageDialog(new JFrame(), message);
		}
	}

	public static void actualizar(String query) {
		Statement comando;
		try {
			comando = mysql.getConexion().createStatement();
			comando.executeUpdate(query);
		} catch (SQLException e) {
			e.getSQLState();
			String message = "<html><p><b>La actualizacion fue ejecutada: </b>" + query + " </p>"
					+ "<p><b>Error de Mysql-Update: </b> " + e.getMessage() + "</p> " + "<p><b>Código de Error: </b>"
					+ e.getErrorCode() + " </p></html>";
			System.out.println(query);
			JOptionPane.showMessageDialog(new JFrame(), message);
		}
	}

	public static void eliminar(String query) {
		Statement comando;
		try {
			comando = mysql.getConexion().createStatement();
			comando.executeUpdate(query);
		} catch (SQLException error) {

			String message = null;

			message = "<html><p><b>Error de Mysql-Delete: </b> " + error.getMessage() + "</p> "
					+ "<p><b>Código de Error: </b>" + error.getErrorCode() + " </p></html>";
			JOptionPane.showMessageDialog(new JFrame(), message);

		}
	}

	public static void insertarImagen(String insert, TCabecera cabecera, String ruta) {
		FileInputStream fis = null;
		PreparedStatement ps = null;

		try {
			mysql.getConexion().setAutoCommit(false);
			File file = new File(ruta);
			fis = new FileInputStream(file);
			System.out.println(insert);

			ps = mysql.getConexion().prepareStatement(insert);
			ps.setString(1, "'EC01'");
			ps.setBinaryStream(2, fis, (long) file.length());

			System.out.println(insert);
			ps.executeUpdate();
			mysql.getConexion().commit();
			// return true;
		} catch (Exception ex) {
			Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			try {
				ps.close();
				fis.close();
			} catch (Exception ex) {
				Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		// return false;
	}

}
