package com.capa.negocios;

import java.util.List;

import com.capa.datos.TCabecera;
import com.capa.datos.TFichaD;

public interface ServicioFichaD {

	public void crear(TFichaD fichaD);
	
	public void crearFichaD(List<TFichaD> listaFichas);

	public int actualizacionFichaN(TCabecera serialC);
}
