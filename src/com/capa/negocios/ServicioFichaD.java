package com.capa.negocios;

import com.capa.datos.TCabecera;
import com.capa.datos.TFichaD;

public interface ServicioFichaD {

	public void crear(TFichaD fichaD);

	public int actualizacionFichaN(TCabecera serialC);
}
