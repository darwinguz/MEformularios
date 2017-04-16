package com.capa.negocios;

import java.sql.ResultSet;

import com.capa.datos.TCabecera;
import com.capa.datos.TFichaD;

public class ComponenteFichaD implements ServicioFichaD {

	@Override
	public void crear(TFichaD fichaD) {
		String sql = "INSERT INTO t_ficha_d (c_serial, f_descripcion, f_foto_ficha_d, fd_actualizacion_n, io_serial) VALUES (?,?,?,?,?);";
		try {
			Query.insertar(sql, fichaD);
		} catch (Exception e) {
			System.out.println("Error al INSERTAR: " + e.getMessage());
		}
	}

	@Override
	public int actualizacionFichaN(TCabecera serialC) {
		String query = "SELECT MAX(fd_actualizacion_n) FROM t_ficha_d WHERE c_serial = "+ serialC.getCSerial() + ";";
		int maximo = -1;
		try {
			ResultSet rs = Query.seleccionar(query);

			while (rs.next()) {
				maximo = rs.getInt("MAX(fd_actualizacion_n)");
			}
		} catch (Exception e) {
			System.out.println("Error al BUSCAR: " + e.getMessage());
		}
		return maximo;
	}
}
