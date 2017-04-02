package com.capa.negocios;

import com.capa.datos.TCabecera;

public interface ServicioProyecto {
	void crear(TCabecera cabecera, String path);

	TCabecera buscarPorNombre(String nombre);
}
