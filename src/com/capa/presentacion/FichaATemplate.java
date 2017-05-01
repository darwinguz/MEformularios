package com.capa.presentacion;

import com.capa.datos.TFichaA;
import com.capa.negocios.ComponenteFichaA;
import com.capa.negocios.ServicioFichaA;
import com.capa.util.FichaA;

import static com.capa.negocios.Calculos.*;
import static com.capa.util.Utilitarios.*;

import java.util.LinkedList;
import java.util.List;

public class FichaATemplate {
	TFichaA tFichaA;

	public FichaATemplate() {
		// TODO Auto-generated constructor stub
		tFichaA = new TFichaA();
	}

	public TFichaA getFichaA() {
		return tFichaA;
	}

	public void setFichaA(TFichaA fichaA) {
		this.tFichaA = fichaA;
	}

	public void generarDatos() {
		List<TFichaA> listaA = new LinkedList<>();
		ServicioFichaA srvFichaA = new ComponenteFichaA();
		// try {
		double ejecutadoMA = calcularEjecutado(FichaA.MA);
		double ejecutadoMS = calcularEjecutado(FichaA.MS);
		double ejecutadoMT = calcularEjecutado(FichaA.MT);
		double ejecutadoMM = calcularEjecutado(FichaA.MM);
		double ejecutadoMB = calcularEjecutado(FichaA.MB);
		double ejecutadoMD = calcularEjecutado(FichaA.MD);
		double ejecutadoBS1 = calcularEjecutado(FichaA.BS1);
		double ejecutadoBS2 = calcularEjecutado(FichaA.BS2);
		double ejecutadoBS3 = calcularEjecutado(FichaA.BS3);
		double ejecutadoMEX = calcularEjecutado(FichaA.MEX);
		double ejecutadoPG = calcularEjecutado(FichaA.PG);
		double ejecutadoMC = calcularEjecutado(FichaA.MC);
		double ejecutadoEX = calcularEjecutado(FichaA.EX);
		double ejecutadoHS = calcularEjecutado(FichaA.HS);
		double ejecutadoAE = calcularEjecutado(FichaA.AE);
		double ejecutadoWF = calcularEjecutado(FichaA.WF);

		double ponderadoMA = calcularPonderado(FichaA.MA);
		double ponderadoMS = calcularPonderado(FichaA.MS);
		double ponderadoMT = calcularPonderado(FichaA.MT);
		double ponderadoMM = calcularPonderado(FichaA.MM);
		double ponderadoMB = calcularPonderado(FichaA.MB);
		double ponderadoMD = calcularPonderado(FichaA.MD);
		double ponderadoBS1 = calcularPonderado(FichaA.BS1);
		double ponderadoBS2 = calcularPonderado(FichaA.BS2);
		double ponderadoBS3 = calcularPonderado(FichaA.BS3);
		double ponderadoMEX = calcularPonderado(FichaA.MEX);
		double ponderadoPG = calcularPonderado(FichaA.PG);
		double ponderadoMC = calcularPonderado(FichaA.MC);
		double ponderadoEX = calcularPonderado(FichaA.EX);
		double ponderadoHS = calcularPonderado(FichaA.HS);
		double ponderadoAE = calcularPonderado(FichaA.AE);
		double ponderadoWF = calcularPonderado(FichaA.WF);

		double avanceMA = (ejecutadoMA * ponderadoMA) / FichaA.MA.getCantidadTotal();
		double avanceMS = (ejecutadoMS * ponderadoMS) / FichaA.MS.getCantidadTotal();
		double avanceMT = (ejecutadoMT * ponderadoMT) / FichaA.MT.getCantidadTotal();
		double avanceMM = (ejecutadoMM * ponderadoMM) / FichaA.MM.getCantidadTotal();
		double avanceMB = (ejecutadoMB * ponderadoMB) / FichaA.MB.getCantidadTotal();
		double avanceMD = (ejecutadoMD * ponderadoMD) / FichaA.MD.getCantidadTotal();
		double avanceBS1 = (ejecutadoBS1 * ponderadoBS1) / FichaA.BS1.getCantidadTotal();
		double avanceBS2 = (ejecutadoBS2 * ponderadoBS2) / FichaA.BS2.getCantidadTotal();
		double avanceBS3 = (ejecutadoBS3 * ponderadoBS3) / FichaA.BS3.getCantidadTotal();
		double avanceMEX = (ejecutadoMEX * ponderadoMEX) / FichaA.MEX.getCantidadTotal();
		double avancePG = (ejecutadoPG * ponderadoPG) / FichaA.PG.getCantidadTotal();
		double avanceMC = (ejecutadoMC * ponderadoMC) / FichaA.MC.getCantidadTotal();
		double avanceEX = (ejecutadoEX * ponderadoEX) / FichaA.EX.getCantidadTotal();
		double avanceHS = (ejecutadoHS * ponderadoHS) / FichaA.HS.getCantidadTotal();
		double avanceAE = (ejecutadoAE * ponderadoAE) / FichaA.AE.getCantidadTotal();
		double avanceWF = (ejecutadoWF * ponderadoWF) / FichaA.WF.getCantidadTotal();

		listaA.add(new TFichaA(gettCabecera().getCSerial(), FichaA.MA.name(), FichaA.MA.getDescripcion(), "UNIDAD",
				FichaA.MA.getCantidadTotal(), ponderadoMA, ejecutadoMA, avanceMA, ""));
		listaA.add(new TFichaA(gettCabecera().getCSerial(), FichaA.MS.name(), FichaA.MS.getDescripcion(), "UNIDAD",
				FichaA.MS.getCantidadTotal(), ponderadoMS, ejecutadoMS, avanceMS, ""));
		listaA.add(new TFichaA(gettCabecera().getCSerial(), FichaA.MT.name(), FichaA.MT.getDescripcion(), "UNIDAD",
				FichaA.MT.getCantidadTotal(), ponderadoMT, ejecutadoMT, avanceMT, ""));
		listaA.add(new TFichaA(gettCabecera().getCSerial(), FichaA.MM.name(), FichaA.MM.getDescripcion(), "UNIDAD",
				FichaA.MM.getCantidadTotal(), ponderadoMM, ejecutadoMM, avanceMM, ""));
		listaA.add(new TFichaA(gettCabecera().getCSerial(), FichaA.MB.name(), FichaA.MB.getDescripcion(), "UNIDAD",
				FichaA.MB.getCantidadTotal(), ponderadoMB, ejecutadoMB, avanceMB, ""));
		listaA.add(new TFichaA(gettCabecera().getCSerial(), FichaA.MD.name(), FichaA.MD.getDescripcion(), "UNIDAD",
				FichaA.MD.getCantidadTotal(), ponderadoMD, ejecutadoMD, avanceMD, ""));
		listaA.add(new TFichaA(gettCabecera().getCSerial(), FichaA.BS1.name(), FichaA.BS1.getDescripcion(), "UNIDAD",
				FichaA.BS1.getCantidadTotal(), ponderadoBS1, ejecutadoBS1, avanceBS1, ""));
		listaA.add(new TFichaA(gettCabecera().getCSerial(), FichaA.BS2.name(), FichaA.BS2.getDescripcion(), "UNIDAD",
				FichaA.BS2.getCantidadTotal(), ponderadoBS2, ejecutadoBS2, avanceBS2, ""));
		listaA.add(new TFichaA(gettCabecera().getCSerial(), FichaA.BS3.name(), FichaA.BS3.getDescripcion(), "UNIDAD",
				FichaA.BS3.getCantidadTotal(), ponderadoBS3, ejecutadoBS3, avanceBS3, ""));
		listaA.add(new TFichaA(gettCabecera().getCSerial(), FichaA.MEX.name(), FichaA.MEX.getDescripcion(), "UNIDAD",
				FichaA.MEX.getCantidadTotal(), ponderadoMEX, ejecutadoMEX, avanceMEX, ""));
		listaA.add(new TFichaA(gettCabecera().getCSerial(), FichaA.PG.name(), FichaA.PG.getDescripcion(), "UNIDAD",
				FichaA.PG.getCantidadTotal(), ponderadoPG, ejecutadoPG, avancePG, ""));
		listaA.add(new TFichaA(gettCabecera().getCSerial(), FichaA.MC.name(), FichaA.MC.getDescripcion(), "UNIDAD",
				FichaA.MC.getCantidadTotal(), ponderadoMC, ejecutadoMC, avanceMC, ""));
		listaA.add(new TFichaA(gettCabecera().getCSerial(), FichaA.EX.name(), FichaA.EX.getDescripcion(), "UNIDAD",
				FichaA.EX.getCantidadTotal(), ponderadoEX, ejecutadoEX, avanceEX, ""));
		listaA.add(new TFichaA(gettCabecera().getCSerial(), FichaA.HS.name(), FichaA.HS.getDescripcion(), "UNIDAD",
				FichaA.HS.getCantidadTotal(), ponderadoHS, ejecutadoHS, avanceHS, ""));
		listaA.add(new TFichaA(gettCabecera().getCSerial(), FichaA.AE.name(), FichaA.AE.getDescripcion(), "UNIDAD",
				FichaA.AE.getCantidadTotal(), ponderadoAE, ejecutadoAE, avanceAE, ""));
		listaA.add(new TFichaA(gettCabecera().getCSerial(), FichaA.WF.name(), FichaA.WF.getDescripcion(), "UNIDAD",
				FichaA.WF.getCantidadTotal(), ponderadoWF, ejecutadoWF, avanceWF, ""));
		srvFichaA.crear(listaA);
		// } catch (ArithmeticException e) {
		// // TODO: handle exception
		// JOptionPane.showMessageDialog(null, "No existen datos para generar
		// Ficha A", "ERROR",
		// JOptionPane.ERROR_MESSAGE);
		// }
	}
}
