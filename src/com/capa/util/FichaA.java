package com.capa.util;

public enum FichaA {
	MA("MÓDULO 9X6 AULAS", 30, 39, 61.58),
	MS("MÓDULO 9X6 (1 SALÓN DE USO MÚLTIPLE)", 2, 39, 61.58),
	MT("MÓDULO 9X6 (LABORATORIOS TECNOLÓGICOS)", 2, 39, 61.58), 
	MM("MÓDULO 9X6 (LABORATORIOS MÚLTIPLES)", 2, 39, 61.58), 
	MB("MÓDULO 9X6 (BIBLIOTECA)", 1, 39, 61.58), 
	MD("MÓDULO 11,4X6 (ADMINISTRACIÓN)", 1, 39, 61.58),
	BS1("MÓDULO DE BATERÍAS SANITARIAS EGB-BACH DE 4,60X6 (1 FDA. LATERAL LIBRE)", 4, 8, 18.19), 
	BS2("MÓDULO DE BATERÍAS SANITARIAS EGB-BACH DE 4,60X6 MT(ADOSADO A DOBLE LADO)", 2,	8, 18.19),
	BS3("MÓDULO DE BATERÍAS SANITARIAS EI DE 4,60X6 MT(ADOSADO A DOBLE LADO)", 2, 8, 18.19), 
	MEX("MÓDULO EXTERIORES", 1, 1, 7.88), 
	PG("MÓDULO PORTÓN GARITA", 1,	1, 1.21),
	CE("MÓDULO CERRAMIENTO", 1, 1, 1.32), 
	EX("KIT ELÉCTRICO EXTERNO", 1, 1, 0.78), 
	SHS("KIT HIDROSANITARIO", 1, 1, 8.33), 
	AE("KIT ALUMBRADO EXTERIOR", 1, 1, 0.42), 
	WF("KIT RED VOZ Y DATOS", 1, 1, 0.3);

	private String descripcion;
	private int cantidadTotal;
	private int sumaCantidadTotal;
	private double constanteCalculo;

	private FichaA(String descr, int total, int sumaTotal, double constante) {
		this.descripcion = descr;
		this.cantidadTotal = total;
		this.sumaCantidadTotal = sumaTotal;
		this.constanteCalculo = constante;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getCantidadTotal() {
		return cantidadTotal;
	}

	public int getSumaCantidadTotal() {
		return sumaCantidadTotal;
	}

	public double getConstanteCalculo() {
		return constanteCalculo;
	}

}
