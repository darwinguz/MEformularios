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
				ficha.setFiSerial(rs.getInt("fi_serial"));
				ficha.setFiNombre(rs.getString("fi_nombre"));
				ficha.setFiDescripcion(rs.getString("fi_descripcion"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ficha;
	}

}
