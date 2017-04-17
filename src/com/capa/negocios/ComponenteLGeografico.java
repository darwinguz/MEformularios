package com.capa.negocios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.capa.datos.TLugarGeografico;

public class ComponenteLGeografico implements ServicioLGeografico {

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
	public TLugarGeografico buscarPadre(String hijo) {
		TLugarGeografico lugarGeo = new TLugarGeografico();

		String sql = "SELECT * FROM t_lugar_geografico WHERE lg_codigo LIKE (SELECT lg_fk_codigo FROM t_lugar_geografico WHERE lg_codigo LIKE '"
				+ hijo + "');";
		ResultSet rs = Query.seleccionar(sql);
		try {
			while (rs.next()) {
				lugarGeo.setLgCodigo(rs.getString(1));
				lugarGeo.setTLugarGeografico(rs.getString(2));
				lugarGeo.setLgNombre(rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lugarGeo;
	}

	@Override
	public TLugarGeografico buscarLGeo(String codigo) {
		TLugarGeografico lugarGeo = new TLugarGeografico();

		String sql = "SELECT * FROM t_lugar_geografico WHERE lg_codigo LIKE '" + codigo + "';";
		ResultSet rs = Query.seleccionar(sql);
		try {
			while (rs.next()) {
				lugarGeo.setLgCodigo(rs.getString(1));
				lugarGeo.setTLugarGeografico(rs.getString(2));
				lugarGeo.setLgNombre(rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lugarGeo;
	}

}
