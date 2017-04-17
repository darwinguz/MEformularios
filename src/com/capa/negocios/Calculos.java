package com.capa.negocios;

import static com.capa.util.Utilitarios.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import com.capa.datos.TFicha;
import com.capa.datos.TdetalleFicha;
import com.capa.util.FichaA;

public class Calculos {

	public static BigDecimal calcularPorcentajeAvance(double cantidadLimite, double cantidadEjecutada) {
		BigDecimal bigDecimal = BigDecimal.valueOf((cantidadEjecutada / cantidadLimite) * 100);
		bigDecimal = bigDecimal.setScale(0, RoundingMode.HALF_UP);
		return bigDecimal;
	}

	public static double calcularEjecutado(FichaA ficha) {
		ServicioFicha servicioFicha = new ComponenteFicha();
		List<TdetalleFicha> listaDetalles;
		TFicha objetoFicha;
		String nombreModulo = ficha.name();
		double valorEjecutado = 0.0, relacion = 0.0;
		int sumaCantidadLimite = 0, sumaCantidadEjecutada = 0;
		for (int i = 1; i < ficha.getCantidadTotal(); i++) {
			try {
				objetoFicha = servicioFicha.buscarFormulario(nombreModulo + "-" + i);
				listaDetalles = servicioFicha.detallesFicha(gettCabecera(), objetoFicha);
				for (TdetalleFicha detalle : listaDetalles) {
					sumaCantidadLimite += detalle.getDetCantidadLimite();
					sumaCantidadEjecutada += detalle.getDetCantidadEjecutada();
				}
				if (nombreModulo.equals("EX")) {
					for (int k = 15; k <= 21; k++) {
						sumaCantidadLimite -= listaDetalles.get(k).getDetCantidadLimite();
						sumaCantidadEjecutada -= listaDetalles.get(k).getDetCantidadEjecutada();
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
				objetoFicha = servicioFicha.buscarFormulario("EX-1");
				listaDetalles = servicioFicha.detallesFicha(gettCabecera(), objetoFicha);
				for (int j = 15; j <= 21; j++) {
					sumaCantidadLimite = listaDetalles.get(j).getDetCantidadLimite();
					sumaCantidadEjecutada = listaDetalles.get(j).getDetCantidadEjecutada();
				}
			}

			relacion = sumaCantidadEjecutada / sumaCantidadLimite;
			valorEjecutado += relacion;
		}
		return valorEjecutado;
	}

	public static double calcularPonderado(FichaA ficha) {
		double calculoPonderado;
		double constCalculo = ficha.getConstanteCalculo();
		int cantidadTotal = ficha.getCantidadTotal();
		int sumaTotal = ficha.getSumaCantidadTotal();
		calculoPonderado = ((cantidadTotal * constCalculo) / sumaTotal) * 100;
		calculoPonderado = redondearDecimales(calculoPonderado, 2);
		return calculoPonderado;
	}

	// falta métodos para calcular avance total de ejecutadas a la fecha y % de
	// avance
}
