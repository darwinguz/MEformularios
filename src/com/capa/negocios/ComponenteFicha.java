package com.capa.negocios;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.capa.datos.TFicha;

public class ComponenteFicha implements ServicioFicha {

	@Override
	public TFicha buscarFormulario(String titulo) {
		TFicha ficha = new TFicha();

		String sql = "SELECT * FROM t_ficha WHERE fi_nombre LIKE '" + titulo + "'";
		ResultSet rs = Query.seleccionar(sql);
		try {
			while (rs.next()) {
detalle.get
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return aula;
		return null;
	}

}
