package com.capa.negocios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import com.capa.datos.TAula;
import com.capa.datos.TFichaMa;
import com.capa.datos.TGrupo;
import com.capa.util.Utilitarios;

public class ComponenteFichaMA implements ServicioFichaMA {

	@Override
	public TAula buscarAula(String nombre) {
		TAula aula = new TAula();

		String sql = "SELECT * FROM t_aula WHERE au_nombre LIKE '" + nombre + "'";
		ResultSet rs = Query.seleccionar(sql);
		try {
			while (rs.next()) {
				aula.setAuSerial(rs.getInt("au_serial"));
				aula.setAuNombre(rs.getString("au_nombre"));
				aula.setImagen(Utilitarios.parseImagen(rs.getBlob("au_foto")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return aula;
	}

	@Override
	public TGrupo buscarGrupo(String grupo) {
		TGrupo oGrupo = new TGrupo();
		String sql = "SELECT * FROM t_grupo WHERE g_nombre LIKE '" + grupo + "'";
		ResultSet rs = Query.seleccionar(sql);
		try {
			while (rs.next()) {
				oGrupo.setGSerial(rs.getInt("g_serial"));
				oGrupo.setGNombre(rs.getString("g_nombre"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return oGrupo;
	}

	@Override
	public Integer buscarUpdateFicha() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public void insertarFormulario(LinkedList<LinkedList<TFichaMa>> cargarListas) {

		String query;

		for (LinkedList<TFichaMa> lista : cargarListas) {
			for (TFichaMa fichaMa : lista) {
				try {
					query = "INSERT INTO t_ficha_ma (au_serial, c_serial, g_serial, fma_etiqueta, fma_cantidad_limite, fma_cantidad_ejecutada, fma_actualizacion_n, f_observacion_referencia) VALUES ('"
							+ fichaMa.getTAula().getAuSerial() + "', '" + fichaMa.getTCabecera().getCSerial() + "', '"
							+ fichaMa.getTGrupo().getGSerial() + "', 'sin etiqueta', '" + fichaMa.getFmaCantidadLimite()
							+ "', '" + fichaMa.getFmaCantidadEjecutada() + "', '" + fichaMa.getFmaActualizacionN()
							+ "', '" + fichaMa.getFmaObsRef() + "');";
					Query.insertar(query);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error al insertar datos del formulario MA " + e.getMessage(),
							"ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}
		}

	}

}
