package com.capa.datos;

import java.io.Serializable;
import java.math.BigDecimal;

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
	private BigDecimal porcentajeAvance;
	private String item;
	private String unidad;

	private String desicion;

	public TdetalleFicha() {
		super();
	}

	// constructor para ingresar Fichas B
	public TdetalleFicha(TCabecera cabecera, TInformacionObligatoria informacion, TGrupo grupo, TFicha ficha,
			Integer detActualizacion, String obs, String desicion, String etiqueta) {
		this.TCabecera = cabecera;
		this.InfoObligatoria = informacion;
		this.TGrupo = grupo;
		this.TFicha = ficha;
		this.detActualizacionN = detActualizacion;
		this.detObsRef = obs;
		this.desicion = desicion;
		this.detEtiqueta = etiqueta;
	}

	public TdetalleFicha(TCabecera tCabecera, TInformacionObligatoria infoObligatoria, TGrupo tGrupo, TFicha tFicha,
			String detEtiqueta, Integer detCantidadLimite, Integer detCantidadEjecutada, String detObsRef,
			Integer detActualizacionN, BigDecimal porcentaje, String item, String unidad) {
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
		this.porcentajeAvance = porcentaje;
		this.item = item;
		this.unidad = unidad;
	}

	public TdetalleFicha(Integer detFichaSerial, com.capa.datos.TCabecera tCabecera,
			TInformacionObligatoria infoObligatoria, com.capa.datos.TGrupo tGrupo, com.capa.datos.TFicha tFicha,
			String detEtiqueta, Integer detCantidadLimite, Integer detCantidadEjecutada, String detObsRef,
			Integer detActualizacionN) {
		super();
		this.detFichaSerial = detFichaSerial;
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

	public TdetalleFicha(TCabecera tCabecera, TInformacionObligatoria infoObligatoria, TGrupo tGrupo, TFicha tFicha,
			String detEtiqueta, Integer detCantidadLimite, Integer detCantidadEjecutada, String detObsRef,
			Integer detActualizacionN) {
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

	public BigDecimal getPorcentajeAvance() {
		return porcentajeAvance;
	}

	public void setPorcentajeAvance(BigDecimal porcentajeAvance) {
		this.porcentajeAvance = porcentajeAvance;
	}

	public String getDesicion() {
		return desicion;
	}

	public void setDesicion(String desicion) {
		this.desicion = desicion;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	@Override
	public String toString() {
		return "TdetalleFicha [detFichaSerial=" + detFichaSerial + ", TCabecera=" + TCabecera + ", InfoObligatoria="
				+ InfoObligatoria + ", TGrupo=" + TGrupo + ", TFicha=" + TFicha + ", detEtiqueta=" + detEtiqueta
				+ ", detCantidadLimite=" + detCantidadLimite + ", detCantidadEjecutada=" + detCantidadEjecutada
				+ ", detObsRef=" + detObsRef + ", detActualizacionN=" + detActualizacionN + "]";
	}

}
