package com.capa.negocios;

import java.util.List;

import com.capa.datos.TLugarGeografico;

public interface ServicioLGeografico {
	void crear(TLugarGeografico lugar);

	List<TLugarGeografico> lugares();

	List<TLugarGeografico> buscarPorId(String id);

	List<TLugarGeografico> buscarProvincia();

	TLugarGeografico buscarPadre(String hijo);

	TLugarGeografico buscarLGeo(String codigo);

}
