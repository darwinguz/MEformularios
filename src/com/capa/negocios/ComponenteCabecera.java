package com.capa.negocios;

import java.sql.ResultSet;

import javax.swing.JOptionPane;

import com.capa.datos.TCabecera;
import com.capa.datos.TLugarGeografico;

public class ComponenteCabecera implements ServicioCabecera {

	@Override
	public Integer ordenMax() {
		Integer maxima = null;
		String query = "SELECT MAX(c_serial) FROM t_cabecera;";

		try {
			ResultSet rs = Query.seleccionar(query);
			while (rs.next()) {
				maxima = new Integer(rs.getInt("MAX(c_serial)"));
			}
		} catch (Exception e) {
			System.out.println("Error al BUSCAR: " + e.getMessage());
		}
		return maxima;
	}

	@Override
	public void crear(TCabecera cabecera) {
		String sql = "INSERT INTO t_cabecera (lg_codigo, c_nombre_proyecto, c_amie, c_zona, c_fecha_entrega, "
				+ "c_fecha_inicio, c_fecha_elaboracion_informe, c_circuito, c_sector, c_distrito, c_foto_general, "
				+ "c_foto_croquis, c_tipo_ficha) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try {
			Query.insertar(sql, cabecera);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al insertar Datos " + e.getMessage(), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	@Override
	public TCabecera buscarProyecto(String nombre) {
		String sql = "SELECT * FROM t_cabecera WHERE c_nombre_proyecto='" + nombre + "'";
		TCabecera cabecera = new TCabecera();

		try {
			ResultSet rs = Query.seleccionar(sql);
			while (rs.next()) {
				cabecera.setCSerial(rs.getInt("c_serial"));
				cabecera.setTLugarGeografico(new TLugarGeografico(rs.getString("lg_codigo")));
				cabecera.setCNombreProyecto(rs.getString("c_nombre_proyecto"));
				cabecera.setCAmie(rs.getString("c_amie"));
				cabecera.setCZona(rs.getString("c_zona"));
				cabecera.setCircuito(rs.getString("c_circuito"));
				cabecera.setSector(rs.getString("c_sector"));
				cabecera.setDistrito(rs.getString("c_distrito"));
				cabecera.setCFechaEntrega(rs.getDate("c_fecha_entrega"));
				cabecera.setCFechaInicio(rs.getDate("c_fecha_inicio"));
				cabecera.setCFechaElaboracionInforme(rs.getDate("c_fecha_elaboracion_informe"));
				cabecera.setTipoFicha(rs.getString("c_tipo_ficha"));
//				System.out.println("CAB" + cabecera);
			}

		} catch (Exception e) {
			System.out.println("Error al BUSCAR: " + e.getMessage());
		}
		return cabecera;
	}

}
