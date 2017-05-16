package com.capa.negocios;

import static com.capa.util.Utilitarios.*;

import java.math.BigDecimal;
import java.util.List;

import com.capa.datos.TFicha;
import com.capa.datos.TdetalleFicha;
import com.capa.util.FichaA;
import com.capa.util.Utilitarios;

public class Calculos {

	public static BigDecimal calcularPorcentajeAvance(double cantidadLimite, double cantidadEjecutada) {
		BigDecimal bigDecimal = BigDecimal.valueOf((cantidadEjecutada / cantidadLimite) * 100);
		// bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_UP);
		bigDecimal = BigDecimal.valueOf(Utilitarios.redondearDecimales(bigDecimal.doubleValue(), 2));
		return bigDecimal;
	}

	public static double calcularEjecutado(FichaA ficha) {
		ServicioFicha servicioFicha = new ComponenteFicha();
		List<TdetalleFicha> listaDetalles;
		TFicha objetoFicha;
		String nombreModulo = ficha.name();
		double valorEjecutado = 0.0, relacion = 0.0;
		double sumaCantidadLimite = 0.0, sumaCantidadEjecutada = 0.0;
		for (int i = 1; i <= ficha.getCantidadTotal(); i++) {
			// try {
			sumaCantidadLimite = 0.0;
			sumaCantidadEjecutada = 0.0;
			objetoFicha = servicioFicha.buscarFormulario(nombreModulo + "-" + i);
			listaDetalles = servicioFicha.detallesFicha(gettCabecera(), objetoFicha);
			for (TdetalleFicha detalle : listaDetalles) {
				sumaCantidadLimite += detalle.getDetCantidadLimite();
				sumaCantidadEjecutada += detalle.getDetCantidadEjecutada();
			}
			// if (nombreModulo.equals("EX")) {
			// for (int k = 15; k <= 21; k++) {
			// sumaCantidadLimite -=
			// listaDetalles.get(k).getDetCantidadLimite();
			// sumaCantidadEjecutada -=
			// listaDetalles.get(k).getDetCantidadEjecutada();
			// }
			// }
			// } catch (Exception e) {
			// // TODO: handle exception
			// objetoFicha = servicioFicha.buscarFormulario("EX-1");
			// listaDetalles = servicioFicha.detallesFicha(gettCabecera(),
			// objetoFicha);
			// for (int j = 15; j <= 21; j++) {
			// sumaCantidadLimite = listaDetalles.get(j).getDetCantidadLimite();
			// sumaCantidadEjecutada =
			// listaDetalles.get(j).getDetCantidadEjecutada();
			// }
			// }

			if (sumaCantidadLimite == 0) {
				sumaCantidadLimite = 1;
			}

			relacion = sumaCantidadEjecutada / sumaCantidadLimite;
			valorEjecutado += relacion;
			// System.out.println("Ficha " + objetoFicha.getFiNombre());
			// System.out.println("Relacion " + relacion);
			// System.out.println("Cantidad ejecutada " +
			// sumaCantidadEjecutada);
			// System.out.println("Cantidad limite " + sumaCantidadLimite);
			// System.out.println("Valor ejecutado " + valorEjecutado);
		}
		return valorEjecutado;
	}

	public static double calcularPonderado(FichaA ficha) {
		double calculoPonderado;
		double constCalculo = ficha.getConstanteCalculo();
		int cantidadTotal = ficha.getCantidadTotal();
		int sumaTotal = ficha.getSumaCantidadTotal();
		calculoPonderado = ((cantidadTotal * constCalculo) / sumaTotal);
		calculoPonderado = redondearDecimales(calculoPonderado, 2);
		if (ficha.name().equals("MD")) {
			calculoPonderado = 2 * calculoPonderado;
		}
		return calculoPonderado;
	}
}
