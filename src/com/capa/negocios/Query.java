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
import com.capa.datos.TFichaD;
import com.capa.util.Utilitarios;

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
			mysql.getConexion().setAutoCommit(false);
			comando = mysql.getConexion().createStatement();
			comando.executeUpdate(query);
			mysql.getConexion().commit();
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

	public static void insertar(String insert, TCabecera cabecera) {
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

	public static void insertarGenerico(String query, Object[] objects) {
		PreparedStatement preparedStmt = null;

		try {
			mysql.getConexion().setAutoCommit(false);
			preparedStmt = mysql.getConexion().prepareStatement(query);

			for (int i = 0; i < objects.length; i++) {
				if (objects[i] instanceof java.lang.String) {
					String string = (String) objects[i];
					if (string.length() < 3) {
						// System.out.println("string<3");
						preparedStmt.setString(i + 1, string);
					} else {
						String sub = string.substring(0, 3);
						if (sub.equals("C:\\") || sub.equals("D:\\") || sub.equals("E:\\") || sub.equals("F:\\")
								|| sub.equals("G:\\") || sub.equals("H:\\")) {
							// System.out.println("foto");
							File file = new File(string);
							FileInputStream fileIS = new FileInputStream(file);
							preparedStmt.setBinaryStream(i + 1, fileIS, (long) file.length());
						} else {
							// System.out.println("string");
							preparedStmt.setString(i + 1, string);
						}
					}
				} else if (objects[i] instanceof java.lang.Integer) {
					Integer integer = (Integer) objects[i];
					// System.out.println("integer");
					preparedStmt.setInt(i + 1, integer);
				} else {
					System.err.println("ERROR: Tipo de dato desconocido!");
				}
			}

			preparedStmt.executeUpdate();
			mysql.getConexion().commit();
		} catch (

		Exception ex) {
			Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			try {
				preparedStmt.close();
			} catch (Exception ex) {
				Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}

	public static void insertar(String insert, TFichaD fichaD) {

		System.out.println("FichaD>>>>" + fichaD + "\n");
		FileInputStream fis1 = null;
		PreparedStatement ps = null;

		try {
			mysql.getConexion().setAutoCommit(false);

			File file1 = new File(fichaD.getfDfotoPath());
			fis1 = new FileInputStream(file1);

			ps = mysql.getConexion().prepareStatement(insert);
			ps.setInt(1, fichaD.gettCabecera().getCSerial());
			ps.setString(2, fichaD.getfDescripcion());
			ps.setBinaryStream(3, fis1, (long) file1.length());
			ps.setInt(4, fichaD.getfDactualizacionN());
			ps.setInt(5, fichaD.gettInformacionObl().getIoSerial());

			ps.executeUpdate();
			mysql.getConexion().commit();
		} catch (Exception ex) {
			Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			try {
				ps.close();
				fis1.close();
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
