package com.capa.negocios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.capa.datos.TLugarGeografico;

public class ComponenteLugarGeo implements ServicioLugarGeo {

	@Override
	public void crear(TLugarGeografico lugar) {
		String sql = "INSERT INTO t_lugar_geografico (lg_fk_codigo, lg_nombre) VALUES ('" + lugar.getLgCodigo() + "','"
				+ lugar.getLgNombre() + "')";
		try {
			Query.insertar(sql);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al insertar Datos " + e.getMessage(), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	@Override
	public List<TLugarGeografico> lugares() {
		String sql = "SELECT * FROM t_lugar_geografico";
		List<TLugarGeografico> listaLugares = new ArrayList<>();
		try {
			ResultSet rs = Query.seleccionar(sql);
			while (rs.next()) {
				TLugarGeografico lugarG = new TLugarGeografico();
				lugarG.setLgCodigo(rs.getString("lg_codigo"));
				lugarG.setTLugarGeografico(rs.getString("lg_fk_codigo"));
				lugarG.setLgNombre(rs.getString("lg_nombre"));
				listaLugares.add(lugarG);
			}
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Error al BUSCAR: " + e.getMessage(), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		return listaLugares;
	}

	@Override
	public List<TLugarGeografico> buscarPorId(String id) {
		// TODO Auto-generated method stub
		List<TLugarGeografico> listaLugares = new ArrayList<>();
		String sql = "SELECT * FROM t_lugar_geografico WHERE lg_fk_codigo LIKE '" + id + "'";

		try {
			ResultSet rs = Query.seleccionar(sql);
			while (rs.next()) {
				TLugarGeografico lugar = new TLugarGeografico();
				lugar.setLgCodigo(rs.getString("lg_codigo"));
				lugar.setLgNombre(rs.getString("lg_fk_codigo"));
				lugar.setLgNombre(rs.getString("lg_nombre"));
				listaLugares.add(lugar);
			}
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Error al BUSCAR: " + e.getMessage(), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		return listaLugares;
	}

	@Override
	public List<TLugarGeografico> buscarProvincia() {
		// TODO Auto-generated method stub
		List<TLugarGeografico> listaLugares = new ArrayList<>();
		String sql = "SELECT * FROM t_lugar_geografico WHERE isnull(lg_fk_codigo)";

		try {
			ResultSet rs = Query.seleccionar(sql);
			while (rs.next()) {
				TLugarGeografico lugar = new TLugarGeografico();
				lugar.setLgCodigo(rs.getString("lg_codigo"));
				lugar.setLgNombre(rs.getString("lg_fk_codigo"));
				lugar.setLgNombre(rs.getString("lg_nombre"));
				listaLugares.add(lugar);
			}
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Error al BUSCAR: " + e.getMessage(), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		return listaLugares;
	}

	@Override
	public String buscarCanton(String codigo) {
		// TODO Auto-generated method stub
		String nombreCanton = null;
		String sql = "SELECT lg_fk_codigo, lg_nombre FROM t_lugar_geografico WHERE lg_codigo "
				+ "LIKE (SELECT lg_fk_codigo FROM t_lugar_geografico WHERE lg_codigo LIKE '" + codigo + "')";
		ResultSet rs = Query.seleccionar(sql);
		try {
			while (rs.next()) {
				nombreCanton = rs.getString("lg_nombre");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nombreCanton;
	}

	@Override
	public String buscarProvincia(String codigo) {
		// TODO Auto-generated method stub
		String nombreProvincia = null;
		String sql = "SELECT lg_nombre FROM t_lugar_geografico WHERE lg_codigo "
				+ "LIKE (SELECT lg_fk_codigo FROM t_lugar_geografico WHERE lg_codigo "
				+ "LIKE (SELECT lg_fk_codigo FROM t_lugar_geografico WHERE lg_codigo LIKE '" + codigo + "'))";
		ResultSet rs = Query.seleccionar(sql);
		try {
			while (rs.next()) {
				nombreProvincia = rs.getString("lg_nombre");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nombreProvincia;
	}

	@Override
	public String buscarParroquia(String codigo) {
		// TODO Auto-generated method stub
		String nombreParroquia = null;
		String sql = "SELECT lg_nombre FROM t_lugar_geografico where lg_codigo =  '" + codigo + "'";
		ResultSet rs = Query.seleccionar(sql);
		try {
			while (rs.next()) {
				nombreParroquia = rs.getString("lg_nombre");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nombreParroquia;
	}

}
