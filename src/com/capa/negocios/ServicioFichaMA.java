package com.capa.negocios;

import com.capa.datos.TAula;
import com.capa.datos.TGrupo;

public interface ServicioFichaMA {

	public TAula buscarAula(String nombre);

	public TGrupo buscarGrupo(String grupo);
}
