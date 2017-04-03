package com.capa.negocios;

import java.sql.ResultSet;

import javax.print.CancelablePrintJob;
import javax.swing.JOptionPane;

import com.capa.datos.TCabecera;
import com.capa.datos.TLugarGeografico;

public class ComponenteProyecto implements ServicioProyecto {

	@Override
	public void crear(TCabecera cabecera) {
		// String sql = "INSERT INTO t_cabecera (lg_codigo, c_nombre_proyecto,
		// c_amie, c_zona, c_fecha_entrega,"
		// + "c_fecha_inicio, c_fecha_elaboracion_informe) VALUES ('"
		// + cabecera.getTLugarGeografico().getLgCodigo() + "','" +
		// cabecera.getCNombreProyecto() + "','"
		// + cabecera.getCAmie() + "','" + cabecera.getCZona() + "')";

		String sql = "INSERT INTO t_cabecera (lg_codigo, c_nombre_proyecto, c_amie, c_zona, c_foto_general,"
				+ "c_croquis)  VALUES ('" + cabecera.getTLugarGeografico().getLgCodigo() + "','"
				+ cabecera.getCNombreProyecto() + "','" + cabecera.getCAmie() + "','" + cabecera.getCZona() + "',"
				+ cabecera.getCFotoGeneral() + cabecera.getCCroquis() + ")";
		try {
			Query.insertar(sql);
			JOptionPane.showMessageDialog(null, "Datos insertados", "DATOS", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			// System.out.println("Error al INSERTAR: " + e.getMessage());
			JOptionPane.showMessageDialog(null, "Error al insertar Datos " + e.getMessage(), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	@Override
	public TCabecera buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM t_cabecera WHERE c_nombre_proyecto='" + nombre + "'";
		TCabecera cabecera = new TCabecera();
		TLugarGeografico lugar = new TLugarGeografico();
		try {
			ResultSet rs = Query.seleccionar(sql);
			while (rs.next()) {
				cabecera.setCSerial(rs.getInt("c_serial"));
				lugar.setLgCodigo(rs.getString("lg_codigo"));
				cabecera.setTLugarGeografico(lugar);
				cabecera.setCNombreProyecto(rs.getString("c_nombre_proyecto"));
				cabecera.setCAmie(rs.getString("c_amie"));
				cabecera.setCZona(rs.getString("c_zona"));
				cabecera.setCircuito(rs.getString("c_circuito"));
				cabecera.setSector(rs.getString("c_sector"));
				cabecera.setCFechaEntrega(rs.getDate("c_fecha_entrega"));
				cabecera.setCFechaInicio(rs.getDate("c_fecha_inicio"));
				cabecera.setCFechaElaboracionInforme(rs.getDate("c_fecha_elaboracion_informe"));
				// lugar.setLgCodigo(rs.getString("lg_codigo"));
				// lugar.setLgNombre(rs.getString("t_l_lg_codigo"));
			}

		} catch (Exception e) {
			System.out.println("Error al BUSCAR: " + e.getMessage());
		}
		return cabecera;
	}

}
