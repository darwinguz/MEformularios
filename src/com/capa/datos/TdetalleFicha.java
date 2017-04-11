package com.capa.datos;

import java.io.Serializable;

public class TdetalleFicha implements Serializable {

	private static final long serialVersionUID = 5987316213398186719L;
	private Integer detFichaSerial;
	private TCabecera TCabecera;
	private TInformacionObligatoria InfoObligatoria;
	private TGrupo TGrupo;
	private TFicha TFicha;

	private String detEtiqueta;
	private Integer detCantidadLimite;
	private Integer detCantidadEjecutada;
	private String detObsRef;
	private Integer detActualizacionN;

	public TdetalleFicha() {
		super();
	}

	public TdetalleFicha(TCabecera tCabecera, TInformacionObligatoria infoObligatoria, com.capa.datos.TGrupo tGrupo,
			com.capa.datos.TFicha tFicha, String detEtiqueta, Integer detCantidadLimite, Integer detCantidadEjecutada,
			String detObsRef, Integer detActualizacionN) {
		super();
		TCabecera = tCabecera;
		InfoObligatoria = infoObligatoria;
		TGrupo = tGrupo;
		TFicha = tFicha;
		this.detEtiqueta = detEtiqueta;
		this.detCantidadLimite = detCantidadLimite;
		this.detCantidadEjecutada = detCantidadEjecutada;
		this.detObsRef = detObsRef;
		this.detActualizacionN = detActualizacionN;
	}

	public Integer getDetFichaSerial() {
		return detFichaSerial;
	}

	public void setDetFichaSerial(Integer detFichaSerial) {
		this.detFichaSerial = detFichaSerial;
	}

	public TCabecera getTCabecera() {
		return TCabecera;
	}

	public void setTCabecera(TCabecera tCabecera) {
		TCabecera = tCabecera;
	}

	public TInformacionObligatoria getInfoObligatoria() {
		return InfoObligatoria;
	}

	public void setInfoObligatoria(TInformacionObligatoria infoObligatoria) {
		InfoObligatoria = infoObligatoria;
	}

	public TGrupo getTGrupo() {
		return TGrupo;
	}

	public void setTGrupo(TGrupo tGrupo) {
		TGrupo = tGrupo;
	}

	public TFicha getTFicha() {
		return TFicha;
	}

	public void setTFicha(TFicha tFicha) {
		TFicha = tFicha;
	}

	public String getDetEtiqueta() {
		return detEtiqueta;
	}

	public void setDetEtiqueta(String detEtiqueta) {
		this.detEtiqueta = detEtiqueta;
	}

	public Integer getDetCantidadLimite() {
		return detCantidadLimite;
	}

	public void setDetCantidadLimite(Integer detCantidadLimite) {
		this.detCantidadLimite = detCantidadLimite;
	}

	public Integer getDetCantidadEjecutada() {
		return detCantidadEjecutada;
	}

	public void setDetCantidadEjecutada(Integer detCantidadEjecutada) {
		this.detCantidadEjecutada = detCantidadEjecutada;
	}

	public String getDetObsRef() {
		return detObsRef;
	}

	public void setDetObsRef(String detObsRef) {
		this.detObsRef = detObsRef;
	}

	public Integer getDetActualizacionN() {
		return detActualizacionN;
	}

	public void setDetActualizacionN(Integer detActualizacionN) {
		this.detActualizacionN = detActualizacionN;
	}

	@Override
	public String toString() {
		return "TdetalleFicha [detFichaSerial=" + detFichaSerial + ", TCabecera=" + TCabecera + ", InfoObligatoria="
				+ InfoObligatoria + ", TGrupo=" + TGrupo + ", TFicha=" + TFicha + ", detEtiqueta=" + detEtiqueta
				+ ", detCantidadLimite=" + detCantidadLimite + ", detCantidadEjecutada=" + detCantidadEjecutada
				+ ", detObsRef=" + detObsRef + ", detActualizacionN=" + detActualizacionN + "]";
	}

}
