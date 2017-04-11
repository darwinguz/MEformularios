package com.capa.negocios;

import java.util.LinkedList;

import com.capa.datos.TFicha;
import com.capa.datos.TGrupo;
import com.capa.datos.TdetalleFicha;

public interface ServicioFicha {

	public TFicha buscarFormulario(String titulo);

	public TGrupo buscarGrupo(String nombre);

	public boolean existeFicha();

	public LinkedList<String[]> extraerFormulario();

	public Integer buscarUpdateFicha();

	public void insertarFormulario(LinkedList<LinkedList<TdetalleFicha>> cargarListas);

}
