package com.capa.negocios;

import com.capa.datos.TInformacionObligatoria;

public interface ServicioInfoObligatoria {
	void crear(TInformacionObligatoria inforObl);

	Integer serialInfoOblMax();

}
