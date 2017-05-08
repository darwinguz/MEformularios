package com.capa.negocios;

import java.util.List;

import com.capa.datos.TFichaA;

public interface ServicioFichaA {

	void crear(List<TFichaA> atributos);

	Integer maxFichaA();

	void eliminar();
}
