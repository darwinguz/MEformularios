package com.capa.negocios;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculos {
	public BigDecimal calcularPorcentajeAvance(int cantidadLimite, int cantidadEjecutada) {
		double porcentaje = (cantidadEjecutada / cantidadLimite) * 100;
		BigDecimal bigDecimal = BigDecimal.valueOf(porcentaje);
		bigDecimal = bigDecimal.setScale(0, RoundingMode.HALF_UP);
		return bigDecimal;
	}
}
