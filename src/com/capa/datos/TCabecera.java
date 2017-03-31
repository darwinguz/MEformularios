package com.capa.datos;

import java.util.Arrays;
import java.util.Date;

public class TCabecera implements java.io.Serializable {

	private static final long serialVersionUID = -303298668263638638L;
	private Integer CSerial;
	private TLugarGeografico TLugarGeografico;
	private String CNombreProyecto;
	private String CAmie;
	private String CZona;
	private Date CFechaEntrega;
	private Date CFechaInicio;
	private Date CFechaElaboracionInforme;
	private String sector;
	private String circuito;
	private String distrito;
	private byte[] CFotoGeneral;
	private byte[] CCroquis;

	public TCabecera() {
	}

	public TCabecera(TLugarGeografico TLugarGeografico) {
		this.TLugarGeografico = TLugarGeografico;
	}

	public TCabecera(String proyecto, String amie, String zona, TLugarGeografico parroquia, String distrito,
			String circuito, String sector, Date fechaEntrega, Date fechaInicio, Date fechaElabInforme,
			byte[] fotoGeneral, byte[] fotoCroquis) {

		this.CNombreProyecto = proyecto;
		this.CAmie = amie;
		this.CZona = zona;
		this.TLugarGeografico = parroquia;
		this.distrito = distrito;
		this.circuito = circuito;
		this.sector = sector;
		this.CFechaEntrega = fechaEntrega;
		this.CFechaInicio = fechaInicio;
		this.CFechaElaboracionInforme = fechaElabInforme;
		this.CFotoGeneral = fotoGeneral;
		this.CCroquis = fotoCroquis;

	}

	public Integer getCSerial() {
		return this.CSerial;
	}

	public void setCSerial(Integer CSerial) {
		this.CSerial = CSerial;
	}

	public TLugarGeografico getTLugarGeografico() {
		return this.TLugarGeografico;
	}

	public void setTLugarGeografico(TLugarGeografico TLugarGeografico) {
		this.TLugarGeografico = TLugarGeografico;
	}

	public String getCNombreProyecto() {
		return this.CNombreProyecto;
	}

	public void setCNombreProyecto(String CNombreProyecto) {
		this.CNombreProyecto = CNombreProyecto;
	}

	public String getCAmie() {
		return this.CAmie;
	}

	public void setCAmie(String CAmie) {
		this.CAmie = CAmie;
	}

	public String getCZona() {
		return this.CZona;
	}

	public void setCZona(String CZona) {
		this.CZona = CZona;
	}

	public Date getCFechaEntrega() {
		return this.CFechaEntrega;
	}

	public void setCFechaEntrega(Date CFechaEntrega) {
		this.CFechaEntrega = CFechaEntrega;
	}

	public Date getCFechaInicio() {
		return this.CFechaInicio;
	}

	public void setCFechaInicio(Date CFechaInicio) {
		this.CFechaInicio = CFechaInicio;
	}

	public Date getCFechaElaboracionInforme() {
		return this.CFechaElaboracionInforme;
	}

	public void setCFechaElaboracionInforme(Date CFechaElaboracionInforme) {
		this.CFechaElaboracionInforme = CFechaElaboracionInforme;
	}

	public byte[] getCFotoGeneral() {
		return this.CFotoGeneral;
	}

	public void setCFotoGeneral(byte[] CFotoGeneral) {
		this.CFotoGeneral = CFotoGeneral;
	}

	public byte[] getCCroquis() {
		return this.CCroquis;
	}

	public void setCCroquis(byte[] CCroquis) {
		this.CCroquis = CCroquis;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getCircuito() {
		return circuito;
	}

	public void setCircuito(String circuito) {
		this.circuito = circuito;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	@Override
	public String toString() {
		return "TCabecera [CSerial=" + CSerial + ", TLugarGeografico=" + TLugarGeografico + ", CNombreProyecto="
				+ CNombreProyecto + ", CAmie=" + CAmie + ", CZona=" + CZona + ", CFechaEntrega=" + CFechaEntrega
				+ ", CFechaInicio=" + CFechaInicio + ", CFechaElaboracionInforme=" + CFechaElaboracionInforme
				+ ", sector=" + sector + ", circuito=" + circuito + ", distrito=" + distrito + ", CFotoGeneral="
				+ Arrays.toString(CFotoGeneral) + ", CCroquis=" + Arrays.toString(CCroquis) + "]";
	}

}
