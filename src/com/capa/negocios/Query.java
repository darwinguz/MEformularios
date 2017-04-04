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
import com.capa.datos.TInformacionObligatoria;
import com.capa.util.Utilitarios;

public class Query {
	private static MySql mysql = new MySql("localhost", "db_ministerio_ed", "root", "admin");

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

	public static void insertarImagen(String insert, TCabecera cabecera) {
		FileInputStream fis1 = null;
		FileInputStream fis2 = null;
		PreparedStatement ps = null;

		try {
			mysql.getConexion().setAutoCommit(false);

			File file1 = new File(cabecera.getCFotoGeneral());
			File file2 = new File(cabecera.getCCroquis());
			fis1 = new FileInputStream(file1);
			fis2 = new FileInputStream(file2);

			ps = mysql.getConexion().prepareStatement(insert);
			ps.setString(1, cabecera.getTLugarGeografico().getLgCodigo());
			ps.setString(2, cabecera.getCNombreProyecto());
			ps.setString(3, cabecera.getCAmie());
			ps.setString(4, cabecera.getCZona());
			ps.setString(5, Utilitarios.getFechaString(cabecera.getCFechaEntrega()));
			ps.setString(6, Utilitarios.getFechaString(cabecera.getCFechaInicio()));
			ps.setString(7, Utilitarios.getFechaString(cabecera.getCFechaElaboracionInforme()));
			ps.setString(8, cabecera.getCircuito());
			ps.setString(9, cabecera.getSector());
			ps.setString(10, cabecera.getDistrito());
			ps.setBinaryStream(11, fis1, (long) file1.length());
			ps.setBinaryStream(12, fis2, (long) file2.length());
			ps.setString(13, cabecera.getTipoFicha());

			ps.executeUpdate();
			mysql.getConexion().commit();
		} catch (Exception ex) {
			Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			try {
				ps.close();
				fis1.close();
				fis2.close();
			} catch (Exception ex) {
				Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}

	public static void insertarImagen(String insert, TInformacionObligatoria infor) {
		FileInputStream fis1 = null;
		FileInputStream fis2 = null;
		PreparedStatement ps = null;

		try {
			mysql.getConexion().setAutoCommit(false);

			// File file1 = new File(infor.get());
			// File file2 = new File(infor.getCCroquis());
			// fis1 = new FileInputStream(file1);
			// fis2 = new FileInputStream(file2);
			//
			// ps = mysql.getConexion().prepareStatement(insert);
			// ps.setString(1, infor.getTLugarGeografico().getLgCodigo());
			// ps.setString(2, infor.getCNombreProyecto());
			// ps.setString(3, infor.getCAmie());
			// ps.setString(4, infor.getCZona());
			// ps.setString(5,
			// Utilitarios.getFechaString(infor.getCFechaEntrega()));
			// ps.setString(6,
			// Utilitarios.getFechaString(infor.getCFechaInicio()));
			// ps.setString(7,
			// Utilitarios.getFechaString(infor.getCFechaElaboracionInforme()));
			// ps.setString(8, infor.getCircuito());
			// ps.setString(9, infor.getSector());
			// ps.setString(10, infor.getDistrito());
			// ps.setBinaryStream(11, fis1, (long) file1.length());
			// ps.setBinaryStream(12, fis2, (long) file2.length());
			// ps.setString(13, infor.getTipoFicha());

			ps.executeUpdate();
			mysql.getConexion().commit();
		} catch (Exception ex) {
			Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			try {
				ps.close();
				fis1.close();
				fis2.close();
			} catch (Exception ex) {
				Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}

	public static MySql getMysql() {
		return mysql;
	}

	public static void setMysql(MySql mysql) {
		Query.mysql = mysql;
	}

}
