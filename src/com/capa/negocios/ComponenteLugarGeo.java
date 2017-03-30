package com.capa.negocios;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.capa.datos.TLugarGeografico;

public class ComponenteLugarGeo implements ServicioLugarGeo {

	@Override
	public void crear(TLugarGeografico lugar) {
		String sql = "INSERT INTO t_lugar_geografico (t_l_lg_codigo, lg_nombre) VALUES ('" + lugar.getLgCodigo() + "','"
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
				lugarG.setTLugarGeografico(rs.getString("t_l_lg_codigo"));
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

}
