package com.capa.negocios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

import com.capa.datos.TCabecera;
import com.capa.datos.TFicha;
import com.capa.datos.TGrupo;
import com.capa.datos.TdetalleFicha;
import com.capa.util.Utilitarios;

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

	// metodo revisado!
	@Override
	public boolean existeFicha() {
		String query = "SELECT * FROM t_detalle_ficha WHERE c_serial=" + Utilitarios.gettCabecera().getCSerial() + ";";
		ResultSet rs = Query.seleccionar(query);
		int temp = -1;
		try {
			while (rs.next()) {
				temp = rs.getInt("df_serial");
				if (temp != -1)
					return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public TGrupo buscarGrupo(String nombre) {
		TGrupo grupo = new TGrupo();

		String sql = "SELECT * FROM t_grupo WHERE g_nombre LIKE '" + nombre + "'";
		ResultSet rs = Query.seleccionar(sql);
		try {
			while (rs.next()) {
				grupo.setGSerial(rs.getInt("g_serial"));
				grupo.setGNombre(rs.getString("g_nombre"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return grupo;
	}

	@Override
	public void insertarFormulario(LinkedList<LinkedList<TdetalleFicha>> datosFicha) {

		datosFicha.forEach(lista -> {
			lista.forEach(item -> {
				try {
					String query = "INSERT INTO t_detalle_ficha (io_serial, fi_serial, c_serial, g_serial, df_etiqueta, df_cantidad_limite, df_cantidad_ejecutada, df_obs_ref, df_actualizacion_n) VALUES ('"
							+ item.getInfoObligatoria().getIoSerial() + "', '" + item.getTFicha().getFiSerial() + "', '"
							+ item.getTCabecera().getCSerial() + "', '" + item.getTGrupo().getGSerial() + "', '"
							+ item.getDetEtiqueta() + "', '" + item.getDetCantidadLimite() + "', '"
							+ item.getDetCantidadEjecutada() + "', '" + item.getDetObsRef() + "', '"
							+ item.getDetActualizacionN() + "');";
					Query.insertar(query);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error al insertar datos del formulario MA " + e.getMessage(),
							"ERROR", JOptionPane.ERROR_MESSAGE);
				}
			});
		});

	}

	@Override
	public int nActualizacionFicha(TCabecera serialC, TFicha serialF) {
		String query = "select max(df_actualizacion_n) from t_detalle_ficha where fi_serial = " + serialF.getFiSerial()
				+ " and c_serial = " + serialC.getCSerial() + ";";
		int maximo = -1;
		try {
			ResultSet rs = Query.seleccionar(query);

			while (rs.next()) {
				maximo = rs.getInt("max(df_actualizacion_n)");
			}
		} catch (Exception e) {
			System.out.println("Error al BUSCAR: " + e.getMessage());
		}
		return maximo;
	}

	@Override
	public LinkedList<TdetalleFicha> detallesFicha(TCabecera serialC, TFicha serialF) {
		LinkedList<TdetalleFicha> camposFormularios = new LinkedList<>();
		String query = "SELECT * FROM t_detalle_ficha WHERE fi_serial = " + serialF.getFiSerial() + " and c_serial = "
				+ serialC.getCSerial()
				+ " and df_actualizacion_n = (select max(df_actualizacion_n) from t_detalle_ficha where fi_serial = "
				+ serialF.getFiSerial() + " and c_serial = " + serialC.getCSerial() + ");";

		try {
			ResultSet rs = Query.seleccionar(query);
			while (rs.next()) {

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return camposFormularios;
	}

}
