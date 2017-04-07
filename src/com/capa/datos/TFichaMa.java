package com.capa.datos;

public class TFichaMa implements java.io.Serializable {

	private static final long serialVersionUID = -1692315847960728196L;
	private Integer fmaSerial;
	private TAula TAula;
	private TCabecera TCabecera;
	private TGrupo TGrupo;

	private String fmaEtiqueta;
	private Integer fmaCantidadLimite;
	private Integer fmaCantidadEjecutada;
	private Integer fmaActualizacionN;
	private String FDetalleMa;
	private Integer FCantidadLimite;
	private Integer FCantidadIngresada;
	private String FObservacionReferencia;

	public TFichaMa() {
	}

	public TFichaMa(TAula TAula, TCabecera TCabecera, TGrupo TGrupo) {
		this.TAula = TAula;
		this.TCabecera = TCabecera;
		this.TGrupo = TGrupo;
	}

	public TFichaMa(TAula TAula, TCabecera TCabecera, TGrupo TGrupo, String fmaEtiqueta, Integer fmaCantidadLimite,
			Integer fmaCantidadEjecutada, Integer fmaActualizacionN, String FDetalleMa, Integer FCantidadLimite,
			Integer FCantidadIngresada, String FObservacionReferencia) {
		this.TAula = TAula;
		this.TCabecera = TCabecera;
		this.TGrupo = TGrupo;
		this.fmaEtiqueta = fmaEtiqueta;
		this.fmaCantidadLimite = fmaCantidadLimite;
		this.fmaCantidadEjecutada = fmaCantidadEjecutada;
		this.fmaActualizacionN = fmaActualizacionN;
		this.FDetalleMa = FDetalleMa;
		this.FCantidadLimite = FCantidadLimite;
		this.FCantidadIngresada = FCantidadIngresada;
		this.FObservacionReferencia = FObservacionReferencia;
	}

	public Integer getFmaSerial() {
		return this.fmaSerial;
	}

	public void setFmaSerial(Integer fmaSerial) {
		this.fmaSerial = fmaSerial;
	}

	public TAula getTAula() {
		return this.TAula;
	}

	public void setTAula(TAula TAula) {
		this.TAula = TAula;
	}

	public TCabecera getTCabecera() {
		return this.TCabecera;
	}

	public void setTCabecera(TCabecera TCabecera) {
		this.TCabecera = TCabecera;
	}

	public TGrupo getTGrupo() {
		return this.TGrupo;
	}

	public void setTGrupo(TGrupo TGrupo) {
		this.TGrupo = TGrupo;
	}

	public String getFmaEtiqueta() {
		return this.fmaEtiqueta;
	}

	public void setFmaEtiqueta(String fmaEtiqueta) {
		this.fmaEtiqueta = fmaEtiqueta;
	}

	public Integer getFmaCantidadLimite() {
		return this.fmaCantidadLimite;
	}

	public void setFmaCantidadLimite(Integer fmaCantidadLimite) {
		this.fmaCantidadLimite = fmaCantidadLimite;
	}

	public Integer getFmaCantidadEjecutada() {
		return this.fmaCantidadEjecutada;
	}

	public void setFmaCantidadEjecutada(Integer fmaCantidadEjecutada) {
		this.fmaCantidadEjecutada = fmaCantidadEjecutada;
	}

	public Integer getFmaActualizacionN() {
		return this.fmaActualizacionN;
	}

	public void setFmaActualizacionN(Integer fmaActualizacionN) {
		this.fmaActualizacionN = fmaActualizacionN;
	}

	public String getFDetalleMa() {
		return this.FDetalleMa;
	}

	public void setFDetalleMa(String FDetalleMa) {
		this.FDetalleMa = FDetalleMa;
	}

	public Integer getFCantidadLimite() {
		return this.FCantidadLimite;
	}

	public void setFCantidadLimite(Integer FCantidadLimite) {
		this.FCantidadLimite = FCantidadLimite;
	}

	public Integer getFCantidadIngresada() {
		return this.FCantidadIngresada;
	}

	public void setFCantidadIngresada(Integer FCantidadIngresada) {
		this.FCantidadIngresada = FCantidadIngresada;
	}

	public String getFObservacionReferencia() {
		return this.FObservacionReferencia;
	}

	public void setFObservacionReferencia(String FObservacionReferencia) {
		this.FObservacionReferencia = FObservacionReferencia;
	}

}
