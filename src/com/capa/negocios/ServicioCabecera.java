package com.capa.negocios;

import com.capa.datos.TCabecera;

public interface ServicioCabecera {
	
	public Integer ordenMax();

	void crear(TCabecera cabecera);

	public TCabecera buscarProyecto(String nombre);
}
