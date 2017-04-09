package com.capa.negocios;

import java.util.LinkedList;

import com.capa.datos.TAula;
import com.capa.datos.TFichaMa;
import com.capa.datos.TGrupo;

public interface ServicioFichaMA {

	public TAula buscarAula(String nombre);

	public TGrupo buscarGrupo(String grupo);

	public Integer buscarUpdateFicha();

	public void insertarFormulario(LinkedList<LinkedList<TFichaMa>> cargarListas);

	public boolean existeFicha();

	public LinkedList<String[]> extraerFormulario();
}
