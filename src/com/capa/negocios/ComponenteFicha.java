package com.capa.negocios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.capa.datos.TCabecera;
import com.capa.datos.TFicha;
import com.capa.datos.TGrupo;
import com.capa.datos.TInformacionObligatoria;
import com.capa.datos.TdetalleFicha;
import com.capa.util.Utilitarios;

public class ComponenteFicha implements ServicioFicha {

	String mensaje = null;
	String titulo = null;
	int tipoMensaje = 0;

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
	public List<TdetalleFicha> detallesFicha(TCabecera serialC, TFicha serialF) {
		List<TdetalleFicha> detallesFicha = new ArrayList<>();

		StringBuilder query = new StringBuilder();

		query.append(" SELECT * FROM t_detalle_ficha ");
		query.append(" WHERE fi_serial = " + serialF.getFiSerial());
		query.append(" AND c_serial = " + serialC.getCSerial());
		query.append(" AND df_actualizacion_n = ");
		

		if (Utilitarios.isFichaC1()) {
			query.append(" (SELECT MAX(df_actualizacion_n)");
			query.append(" FROM t_detalle_ficha WHERE fi_serial = " + serialF.getFiSerial());
			query.append(" AND c_serial = " + serialC.getCSerial() + ");");
		} else {
			query.append(" -1");
		}

		try {
			ResultSet rs = Query.seleccionar(query.toString());
			while (rs.next()) {

				detallesFicha.add(new TdetalleFicha(new Integer(rs.getInt(1)), new TCabecera(rs.getInt(2)),
						new TInformacionObligatoria(rs.getInt(3)), new TGrupo(rs.getInt(4)), new TFicha(rs.getInt(5)),
						new String(), new Integer(rs.getInt(7)), new Integer(rs.getInt(8)), new String(rs.getString(9)),
						new Integer(rs.getInt(10))));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return detallesFicha;
	}

	@Override
	public TGrupo buscarGrupo(int serial) {
		TGrupo grupo = new TGrupo();

		String sql = "SELECT * FROM t_grupo WHERE g_serial = '" + serial + "'";
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
	public void guardarFormulario(List<TdetalleFicha> detallesFicha) {
		detallesFicha.forEach(item -> {
			try {
				// String aux = item.getDetEtiqueta().replaceAll("<html><body><p
				// align='right'>", "");
				// aux = aux.replaceAll("</p></body></html>", "");
				// aux = aux.replaceAll("<html><body><p align=right>", "");
				// item.setDetEtiqueta(aux);
				String query = "INSERT INTO t_detalle_ficha (io_serial, fi_serial, c_serial, "
						+ "g_serial, df_etiqueta, df_cantidad_limite, df_cantidad_ejecutada, "
						+ "df_obs_ref, df_actualizacion_n, df_porcentaje_avance, df_item, df_unidad) VALUES ("
						+ item.getInfoObligatoria().getIoSerial() + ", " + item.getTFicha().getFiSerial() + ", "
						+ item.getTCabecera().getCSerial() + ", " + item.getTGrupo().getGSerial() + ", '"
						+ item.getDetEtiqueta() + "', " + item.getDetCantidadLimite() + ", "
						+ item.getDetCantidadEjecutada() + ", '" + item.getDetObsRef() + "', "
						+ item.getDetActualizacionN() + ", " + item.getPorcentajeAvance() + ", '" + item.getItem()
						+ "', '" + item.getUnidad() + "');";
				Query.insertar(query);
				mensaje = "Ingreso exitoso";
				titulo = "INGRESO";
				tipoMensaje = 1;
				// System.out.println(query);
			} catch (Exception e) {
				mensaje = "Error al insertar datos del formulario " + e.getMessage();
			}
		});
		JOptionPane.showMessageDialog(null, mensaje, titulo, tipoMensaje);

	}

	@Override
	public void guardarFichaB(List<TdetalleFicha> detallesFicha) {
		// TODO Auto-generated method stub
		detallesFicha.forEach(item -> {
			try {
				// String aux = item.getDetEtiqueta().replaceAll("<html><body><p
				// align='right'>", "");
				// aux = aux.replaceAll("</p></body></html>", "");
				// aux = aux.replaceAll("<html><body><p align=right>", "");
				// item.setDetEtiqueta(aux);
				String query = "INSERT INTO t_detalle_ficha (io_serial, fi_serial, c_serial, "
						+ "g_serial, df_etiqueta, df_obs_ref, df_actualizacion_n, df_desicion) VALUES ("
						+ item.getInfoObligatoria().getIoSerial() + ", " + item.getTFicha().getFiSerial() + ", "
						+ item.getTCabecera().getCSerial() + ", " + item.getTGrupo().getGSerial() + ", '"
						+ item.getDetEtiqueta() + "', '" + item.getDetObsRef() + "', " + item.getDetActualizacionN()
						+ ", '" + item.getDesicion() + "');";
				Query.insertar(query);
				mensaje = "Ingreso exitoso";
				titulo = "INGRESO";
				tipoMensaje = 1;
				// System.out.println(query);
			} catch (Exception e) {
				mensaje = "Error al insertar datos del formulario B " + e.getMessage();
			}
		});
		JOptionPane.showMessageDialog(null, mensaje, titulo, tipoMensaje);
	}

	@Override
	public void eliminarDatos() {
		// TODO Auto-generated method stub
		String query = "delete from t_detalle_ficha where df_actualizacion_n = -1;";
		Query.eliminar(query);
	}
}
