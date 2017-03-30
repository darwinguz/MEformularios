package com.capa.negocios;

import java.util.List;

import com.capa.datos.TLugarGeografico;

public interface ServicioLugarGeo {
	void crear(TLugarGeografico lugar);

	List<TLugarGeografico> lugares();

	List<TLugarGeografico> buscarPorId(String id);
}
