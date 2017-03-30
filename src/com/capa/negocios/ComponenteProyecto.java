package com.capa.negocios;

import javax.swing.JOptionPane;

import com.capa.datos.TCabecera;

public class ComponenteProyecto implements ServicioProyecto {

	@Override
	public void crear(TCabecera cabecera) {
		String sql = "INSERT INTO t_cabecera (lg_codigo, c_nombre_proyecto, c_amie,c_zona,c_fecha_entrega"
				+ "c_fecha_inicio, c_fecha_elaboracion_informe)  VALUES ('"
				+ cabecera.getTLugarGeografico().getLgCodigo() + "','" + cabecera.getCNombreProyecto() + "','"
				+ cabecera.getCAmie() + "','" + cabecera.getCZona() + "')";
		try {
			Query.insertar(sql);
		} catch (Exception e) {
			// System.out.println("Error al INSERTAR: " + e.getMessage());
			JOptionPane.showMessageDialog(null, "Error al insertar Datos " + e.getMessage(), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
	}

}