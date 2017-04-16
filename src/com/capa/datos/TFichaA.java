package com.capa.datos;

import java.io.Serializable;

public class TFichaA implements Serializable {

	private static final long serialVersionUID = -7525111643907190932L;
	private Integer fa_serial;
	private Integer c_serial;
	private String fa_codigo;
	private String fa_descripcion;
	private String fa_unidad;
	private Integer fa_cantidad_total;
	private Double fa_ponderado;
	private Double fa_ejecutadas;
	private Double fa_avance_porc;
	private String fa_observacion;

	public TFichaA() {
	}

	public TFichaA(Integer c_serial, String fa_codigo, String fa_descripcion, String fa_unidad,
			Integer fa_cantidad_total, Double fa_ponderado, Double fa_ejecutadas, Double fa_avance_porc,
			String fa_observacion) {
		super();
		this.c_serial = c_serial;
		this.fa_codigo = fa_codigo;
		this.fa_descripcion = fa_descripcion;
		this.fa_unidad = fa_unidad;
		this.fa_cantidad_total = fa_cantidad_total;
		this.fa_ponderado = fa_ponderado;
		this.fa_ejecutadas = fa_ejecutadas;
		this.fa_avance_porc = fa_avance_porc;
		this.fa_observacion = fa_observacion;
	}

	public Integer getFa_serial() {
		return fa_serial;
	}

	public void setFa_serial(Integer fa_serial) {
		this.fa_serial = fa_serial;
	}

	public Integer getC_serial() {
		return c_serial;
	}

	public void setC_serial(Integer c_serial) {
		this.c_serial = c_serial;
	}

	public String getFa_codigo() {
		return fa_codigo;
	}

	public void setFa_codigo(String fa_codigo) {
		this.fa_codigo = fa_codigo;
	}

	public String getFa_descripcion() {
		return fa_descripcion;
	}

	public void setFa_descripcion(String fa_descripcion) {
		this.fa_descripcion = fa_descripcion;
	}

	public String getFa_unidad() {
		return fa_unidad;
	}

	public void setFa_unidad(String fa_unidad) {
		this.fa_unidad = fa_unidad;
	}

	public Integer getFa_cantidad_total() {
		return fa_cantidad_total;
	}

	public void setFa_cantidad_total(Integer fa_cantidad_total) {
		this.fa_cantidad_total = fa_cantidad_total;
	}

	public Double getFa_ponderado() {
		return fa_ponderado;
	}

	public void setFa_ponderado(Double fa_ponderado) {
		this.fa_ponderado = fa_ponderado;
	}

	public Double getFa_ejecutadas() {
		return fa_ejecutadas;
	}

	public void setFa_ejecutadas(Double fa_ejecutadas) {
		this.fa_ejecutadas = fa_ejecutadas;
	}

	public Double getFa_avance_porc() {
		return fa_avance_porc;
	}

	public void setFa_avance_porc(Double fa_avance_porc) {
		this.fa_avance_porc = fa_avance_porc;
	}

	public String getFa_observacion() {
		return fa_observacion;
	}

	public void setFa_observacion(String fa_observacion) {
		this.fa_observacion = fa_observacion;
	}

	@Override
	public String toString() {
		return "TFichaA [fa_serial=" + fa_serial + ", c_serial=" + c_serial + ", fa_codigo=" + fa_codigo
				+ ", fa_descripcion=" + fa_descripcion + ", fa_unidad=" + fa_unidad + ", fa_cantidad_total="
				+ fa_cantidad_total + ", fa_ponderado=" + fa_ponderado + ", fa_ejecutadas=" + fa_ejecutadas
				+ ", fa_avance_porc=" + fa_avance_porc + ", fa_observacion=" + fa_observacion + "]";
	}

}
