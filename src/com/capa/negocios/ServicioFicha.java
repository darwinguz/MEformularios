package com.capa.negocios;

import java.util.LinkedList;
import java.util.List;

import com.capa.datos.TCabecera;
import com.capa.datos.TFicha;
import com.capa.datos.TGrupo;
import com.capa.datos.TdetalleFicha;

public interface ServicioFicha {

	public TFicha buscarFormulario(String titulo);

	public TGrupo buscarGrupo(String nombre);

	public boolean existeFicha();

	public void insertarFormulario(LinkedList<LinkedList<TdetalleFicha>> cargarListas);

	public int nActualizacionFicha(TCabecera serialC, TFicha serialF);

	/**
	 * Método que retorna una lista de detalles en funcion al Proyecto y Ficha
	 * @param serialC -> Serial del Proyecto - Cabecera
	 * @param serialF -> Serial de la Ficha 
	 * @return Lista de detalles de una Ficha -  Ultima actualización
	 */
	public LinkedList<TdetalleFicha> detallesFicha(TCabecera serialC, TFicha serialF);

}
