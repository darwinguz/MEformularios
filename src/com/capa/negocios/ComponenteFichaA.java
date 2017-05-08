package com.capa.negocios;

import java.sql.ResultSet;
import java.util.List;

import javax.swing.JOptionPane;

import com.capa.datos.TFichaA;

public class ComponenteFichaA implements ServicioFichaA {
	String mensaje = null;
	String titulo = null;
	int tipoMensaje = 0;

	public void crear(List<TFichaA> atributos) {
		atributos.forEach(item -> {
			try {
				String query = "INSERT INTO t_ficha_a (c_serial, fa_codigo, fa_descripcion, "
						+ "fa_unidad, fa_cantidad_total, fa_ponderado, fa_ejecutadas, "
						+ "fa_avance_porc, fa_observacion) VALUES (" + item.getC_serial() + ", '" + item.getFa_codigo()
						+ "', '" + item.getFa_descripcion() + "', '" + item.getFa_unidad() + "', "
						+ item.getFa_cantidad_total() + ", " + item.getFa_ponderado() + ", " + item.getFa_ejecutadas()
						+ ", " + item.getFa_avance_porc() + ", '" + item.getFa_observacion() + "');";
				Query.insertar(query);
				mensaje = "Ingreso exitoso";
				titulo = "INGRESO";
				tipoMensaje = 1;
			} catch (Exception e) {
				mensaje = "Error al insertar datos del formulario MA " + e.getMessage();
			}
		});
		JOptionPane.showMessageDialog(null, mensaje, titulo, tipoMensaje);

	}

	@Override
	public Integer maxFichaA() {
		String query = "SELECT MAX(fa_serial) FROM t_ficha_a;";
		Integer maximo = new Integer(-1);
		try {
			ResultSet rs = Query.seleccionar(query);
			while (rs.next()) {
				maximo = rs.getInt("max(df_actualizacion_n)");
			}
		} catch (Exception e) {
			System.out.println("Error al BUSCAR Maximo Ficha A: " + e.getMessage());
		}
		return maximo;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		String query = "DELETE FROM t_ficha_a";
		Query.eliminar(query);
	}

}
