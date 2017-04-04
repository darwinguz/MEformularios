package com.capa.negocios;

import java.sql.ResultSet;

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

}
