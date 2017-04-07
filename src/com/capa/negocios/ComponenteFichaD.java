package com.capa.negocios;

import com.capa.datos.TFichaD;

public class ComponenteFichaD implements ServicioFichaD {

	@Override
	public void crear(TFichaD fichaD) {
		String sql = "INSERT INTO t_ficha_d (c_serial, f_descripcion, f_foto_ficha_d, fd_actualizacion_n) VALUES (?,?,?,?);";
		try {
			Query.insertar(sql, fichaD);
		} catch (Exception e) {
			System.out.println("Error al INSERTAR: " + e.getMessage());
		}
	}
}
