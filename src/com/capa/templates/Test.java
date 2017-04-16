package com.capa.templates;

import com.capa.datos.TCabecera;
import com.capa.datos.TFicha;
import com.capa.negocios.ComponenteFicha;
import com.capa.negocios.ServicioFicha;
import com.capa.util.Constantes;

public class Test {

	public static void main(String[] args) {

		ServicioFicha srvficha = new ComponenteFicha();

		TCabecera cab = new TCabecera(1);
		TFicha ficha = new TFicha(12, "string");

//		System.out.println(srvficha.detallesFicha(cab, ficha));

		System.out.println(Constantes.LBL_HS_0);
	}

}
