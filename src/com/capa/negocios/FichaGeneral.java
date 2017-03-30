package com.capa.negocios;

import com.capa.datos.TCabecera;
import com.capa.datos.TInformacionObligatoria;

public abstract class FichaGeneral {
	private TCabecera cabecera;
	private TInformacionObligatoria inforObligatoria;

	public abstract String guardarDatos();

	public TCabecera getCabecera() {
		return cabecera;
	}

	public void setCabecera(TCabecera cabecera) {
		this.cabecera = cabecera;
	}

	public TInformacionObligatoria getInforObligatoria() {
		return inforObligatoria;
	}

	public void setInforObligatoria(TInformacionObligatoria inforObligatoria) {
		this.inforObligatoria = inforObligatoria;
	}
	
}
