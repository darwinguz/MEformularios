package com.capa.reportes;

import java.awt.Dimension;
import java.util.HashMap;

import javax.swing.JFrame;

import com.capa.negocios.ComponenteCabecera;
import com.capa.negocios.Query;
import com.capa.negocios.ServicioCabecera;

public class Main {
	public static void main(String[] args) {
		ServicioCabecera servicioCabecera = new ComponenteCabecera();
		int serialCabecera = servicioCabecera.ordenMax();
		HashMap<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("serial_cabecera", serialCabecera);
		LanzadorReportes lanzadorReportes = new LanzadorReportes(new JFrame(), "Reporte");
		lanzadorReportes.cargarReporte("src/com/capa/templates/FichaDeReporte.jasper", parametros,
				Query.getMysql().getConexion());
		lanzadorReportes.setSize(new Dimension(850, 750));
		lanzadorReportes.setBounds(280, 10, 850, 750);
		lanzadorReportes.setVisible(true);
	}

}
