package com.capa.negocios;

import com.capa.datos.TCabecera;

public class ClaseCabecera {
	private TCabecera cabecSingleton;
	private static ClaseCabecera claseCab;

	private ClaseCabecera(TCabecera cabecSingl) {
		this.cabecSingleton = cabecSingl;
	}

	public static ClaseCabecera getInstanciaCab(TCabecera tCab) {
		if (claseCab == null) {
			claseCab = new ClaseCabecera(tCab);
		}
		return claseCab;
	}

	public TCabecera getCabecSingleton() {
		return cabecSingleton;
	}

	public void setCabecSingleton(TCabecera cabecSingleton) {
		this.cabecSingleton = cabecSingleton;
	}
}
