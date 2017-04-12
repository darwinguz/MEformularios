package com.capa.negocios;

import java.util.LinkedList;

import com.capa.datos.TAula;
import com.capa.datos.TFichaMa;
import com.capa.datos.TGrupo;
import com.capa.datos.TdetalleFicha;

public interface ServicioFichaMA {

	public TGrupo buscarGrupo(String grupo);

	public Integer buscarUpdateFicha();

	public void insertarFormulario(LinkedList<LinkedList<TdetalleFicha>> cargarListas);

	public boolean existeFicha();

	public LinkedList<String[]> extraerFormulario();
}
