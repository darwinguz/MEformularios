package com.capa.datos;

import java.io.Serializable;

public class TFicha implements Serializable {

	private static final long serialVersionUID = -1853985387239258718L;
	private Integer fiSerial;
	private String fiNombre;

	public TFicha() {
		super();
	}

	public TFicha(Integer fiSerial, String fiNombre) {
		super();
		this.fiSerial = fiSerial;
		this.fiNombre = fiNombre;
	}

	public Integer getFiSerial() {
		return fiSerial;
	}

	public void setFiSerial(Integer fiSerial) {
		this.fiSerial = fiSerial;
	}

	public String getFiNombre() {
		return fiNombre;
	}

	public void setFiNombre(String fiNombre) {
		this.fiNombre = fiNombre;
	}

	@Override
	public String toString() {
		return "TFicha [fiSerial=" + fiSerial + ", fiNombre=" + fiNombre + "]";
	}

}
