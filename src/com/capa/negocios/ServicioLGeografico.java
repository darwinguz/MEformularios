package com.capa.negocios;

import java.util.List;

import com.capa.datos.TLugarGeografico;

public interface ServicioLGeografico {
	void crear(TLugarGeografico lugar);

	List<TLugarGeografico> lugares();

	List<TLugarGeografico> buscarPorId(String id);

	List<TLugarGeografico> buscarProvincia();

	TLugarGeografico buscarCanton(String codigo);

	TLugarGeografico buscarProvincia(String codigo);

	TLugarGeografico buscarParroquia(String codigo);

	String[] loadNombreProvCantParr(String codParr);
}