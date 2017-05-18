package com.capa.negocios;

import java.util.List;

import com.capa.datos.TCabecera;
import com.capa.datos.TFicha;
import com.capa.datos.TGrupo;
import com.capa.datos.TdetalleFicha;

public interface ServicioFicha {

	public TFicha buscarFormulario(String titulo);

	public TGrupo buscarGrupo(String nombre);

	public TGrupo buscarGrupo(int serial);

	public boolean existeFicha();

	/**
	 * 
	 * @param detallesFicha
	 */
	public void guardarFormulario(List<TdetalleFicha> detallesFicha);

	/**
	 * Busca la ultima actualizacion de la ficha x proyecto solicitada
	 * 
	 * @param serialC:Serial
	 *            del Proyecto - Cabecera
	 * @param serialF:Serial
	 *            de la Ficha
	 * @return entero correspondienteActualizacon de la Ficha
	 */
	public int nActualizacionFicha(TCabecera serialC, TFicha serialF);

	/**
	 * Método que retorna una lista de detalles en funcion al Proyecto y Ficha
	 * 
	 * @param serialC:Serial
	 *            del Proyecto - Cabecera
	 * @param serialF:Serial
	 *            de la Ficha
	 * @return Lista de detalles de una Ficha - Ultima actualización
	 */
	public List<TdetalleFicha> detallesFicha(TCabecera serialC, TFicha serialF);

	public void guardarFichaB(List<TdetalleFicha> detallesFicha);

	public void eliminarDatos(TFicha ficha);

}
