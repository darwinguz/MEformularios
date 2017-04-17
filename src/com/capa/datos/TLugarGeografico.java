package com.capa.datos;

public class TLugarGeografico implements java.io.Serializable {

	private static final long serialVersionUID = -2204081382540142509L;
	private String lgCodigo;
	private String TLugarGeografico;
	private String lgNombre;

	public TLugarGeografico() {
	}

	public TLugarGeografico(String lgCodigo) {
		this.lgCodigo = lgCodigo;
	}

	public TLugarGeografico(String lgCodigo, String TLugarGeografico, String lgNombre) {
		this.lgCodigo = lgCodigo;
		this.TLugarGeografico = TLugarGeografico;
		this.lgNombre = lgNombre;
	}

	public String getLgCodigo() {
		return this.lgCodigo;
	}

	public void setLgCodigo(String lgCodigo) {
		this.lgCodigo = lgCodigo;
	}

	public String getTLugarGeografico() {
		return this.TLugarGeografico;
	}

	public void setTLugarGeografico(String TLugarGeografico) {
		this.TLugarGeografico = TLugarGeografico;
	}

	public String getLgNombre() {
		return this.lgNombre;
	}

	public void setLgNombre(String lgNombre) {
		this.lgNombre = lgNombre;
	}

	@Override
	public String toString() {
		return "TLugarGeografico [lgCodigo=" + lgCodigo + ", TLugarGeografico=" + TLugarGeografico + ", lgNombre="
				+ lgNombre + "]";
	}

}
