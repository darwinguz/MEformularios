package com.capa.negocios;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculos {
	public static BigDecimal calcularPorcentajeAvance(double cantidadLimite, double cantidadEjecutada) {
		BigDecimal bigDecimal = BigDecimal.valueOf((cantidadEjecutada / cantidadLimite) * 100);
		bigDecimal = bigDecimal.setScale(0, RoundingMode.HALF_UP);
		return bigDecimal;
	}
}
