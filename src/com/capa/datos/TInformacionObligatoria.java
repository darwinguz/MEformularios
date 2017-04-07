package com.capa.datos;
// Generated 28-mar-2017 16:36:10 by Hibernate Tools 4.3.1

import java.util.Date;

import com.capa.negocios.ClaseCabecera;

public class TInformacionObligatoria implements java.io.Serializable {

	private static final long serialVersionUID = 3163892045407791730L;
	private Integer ioSerial;
	private String ioObsGeneral;
	private String ioResponsableMin;
	private String ioCargoMin;
	private String ioObsGenCont;
	private String ioResponsableCont;
	private String ioCargoCont;
	private Date ioFechaIo;
	private TCabecera tCabe;

	public TInformacionObligatoria() {
	}

	public TInformacionObligatoria(String ioObsGeneral, String ioResponsableMin, String ioCargoMin, String ioObsGenCont,
			String ioResponsableCont, String ioCargoCont, Date ioFechaIo, TCabecera tC) {
		this.ioObsGeneral = ioObsGeneral;
		this.ioResponsableMin = ioResponsableMin;
		this.ioCargoMin = ioCargoMin;
		this.ioObsGenCont = ioObsGenCont;
		this.ioResponsableCont = ioResponsableCont;
		this.ioCargoCont = ioCargoCont;
		this.ioFechaIo = ioFechaIo;
		this.tCabe = tC;
	}

	public Integer getIoSerial() {
		return this.ioSerial;
	}

	public void setIoSerial(Integer ioSerial) {
		this.ioSerial = ioSerial;
	}

	public String getIoObsGeneral() {
		return this.ioObsGeneral;
	}

	public void setIoObsGeneral(String ioObsGeneral) {
		this.ioObsGeneral = ioObsGeneral;
	}

	public String getIoResponsableMin() {
		return this.ioResponsableMin;
	}

	public void setIoResponsableMin(String ioResponsableMin) {
		this.ioResponsableMin = ioResponsableMin;
	}

	public String getIoCargoMin() {
		return this.ioCargoMin;
	}

	public void setIoCargoMin(String ioCargoMin) {
		this.ioCargoMin = ioCargoMin;
	}

	public String getIoObsGenCont() {
		return this.ioObsGenCont;
	}

	public void setIoObsGenCont(String ioObsGenCont) {
		this.ioObsGenCont = ioObsGenCont;
	}

	public String getIoResponsableCont() {
		return this.ioResponsableCont;
	}

	public void setIoResponsableCont(String ioResponsableCont) {
		this.ioResponsableCont = ioResponsableCont;
	}

	public String getIoCargoCont() {
		return this.ioCargoCont;
	}

	public void setIoCargoCont(String ioCargoCont) {
		this.ioCargoCont = ioCargoCont;
	}

	public Date getIoFechaIo() {
		return this.ioFechaIo;
	}

	public void setIoFechaIo(Date ioFechaIo) {
		this.ioFechaIo = ioFechaIo;
	}

	public TCabecera gettCabe() {
		return tCabe;
	}

	public void settCabe(TCabecera tCabe) {
		this.tCabe = tCabe;
	}

}
