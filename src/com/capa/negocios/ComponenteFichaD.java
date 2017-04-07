package com.capa.negocios;

import com.capa.datos.TFichaD;

public class ComponenteFichaD implements ServicioFichaD {

	@Override
	public void crear(TFichaD fichaD) {
		String sql = "INSERT INTO t_ficha_d (io_serial, f_descripcion)  VALUES ('"
				+ fichaD.gettInformacionObligatoria().getIoSerial() + "','" + fichaD.getfDescripcion() + "')";
		try {
			Query.insertar(sql);
		} catch (Exception e) {
			System.out.println("Error al INSERTAR: " + e.getMessage());
		}
	}
}
