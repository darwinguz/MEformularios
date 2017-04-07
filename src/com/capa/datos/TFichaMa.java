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
	private String fmaObsRef;
	private Integer fmaActualizacionN;

	public TFichaMa() {
	}

	public TFichaMa(TAula TAula, TCabecera TCabecera, TGrupo TGrupo) {
		this.TAula = TAula;
		this.TCabecera = TCabecera;
		this.TGrupo = TGrupo;
	}

	public TFichaMa(TAula TAula, TCabecera TCabecera, TGrupo TGrupo, String fmaEtiqueta, Integer fmaCantidadLimite,
			Integer fmaCantidadEjecutada, String FObservacionReferencia, Integer fmaActualizacionN) {
		this.TAula = TAula;
		this.TCabecera = TCabecera;
		this.TGrupo = TGrupo;
		this.fmaEtiqueta = fmaEtiqueta;
		this.fmaCantidadLimite = fmaCantidadLimite;
		this.fmaCantidadEjecutada = fmaCantidadEjecutada;
		this.fmaActualizacionN = fmaActualizacionN;
		this.fmaObsRef = FObservacionReferencia;
	}

	public Integer getFmaSerial() {
		return fmaSerial;
	}

	public void setFmaSerial(Integer fmaSerial) {
		this.fmaSerial = fmaSerial;
	}

	public TAula getTAula() {
		return TAula;
	}

	public void setTAula(TAula tAula) {
		TAula = tAula;
	}

	public TCabecera getTCabecera() {
		return TCabecera;
	}

	public void setTCabecera(TCabecera tCabecera) {
		TCabecera = tCabecera;
	}

	public TGrupo getTGrupo() {
		return TGrupo;
	}

	public void setTGrupo(TGrupo tGrupo) {
		TGrupo = tGrupo;
	}

	public String getFmaEtiqueta() {
		return fmaEtiqueta;
	}

	public void setFmaEtiqueta(String fmaEtiqueta) {
		this.fmaEtiqueta = fmaEtiqueta;
	}

	public Integer getFmaCantidadLimite() {
		return fmaCantidadLimite;
	}

	public void setFmaCantidadLimite(Integer fmaCantidadLimite) {
		this.fmaCantidadLimite = fmaCantidadLimite;
	}

	public Integer getFmaCantidadEjecutada() {
		return fmaCantidadEjecutada;
	}

	public void setFmaCantidadEjecutada(Integer fmaCantidadEjecutada) {
		this.fmaCantidadEjecutada = fmaCantidadEjecutada;
	}

	public String getFmaObsRef() {
		return fmaObsRef;
	}

	public void setFmaObsRef(String fmaObsRef) {
		this.fmaObsRef = fmaObsRef;
	}

	public Integer getFmaActualizacionN() {
		return fmaActualizacionN;
	}

	public void setFmaActualizacionN(Integer fmaActualizacionN) {
		this.fmaActualizacionN = fmaActualizacionN;
	}

	@Override
	public String toString() {
		return "TFichaMa [fmaSerial=" + fmaSerial + ", TAula=" + TAula + ", TCabecera=" + TCabecera + ", TGrupo="
				+ TGrupo + ", fmaEtiqueta=" + fmaEtiqueta + ", fmaCantidadLimite=" + fmaCantidadLimite
				+ ", fmaCantidadEjecutada=" + fmaCantidadEjecutada + ", fmaObsRef=" + fmaObsRef + ", fmaActualizacionN="
				+ fmaActualizacionN + "]";
	}

}
