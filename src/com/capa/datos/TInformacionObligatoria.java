package com.capa.datos;
// Generated 28-mar-2017 16:36:10 by Hibernate Tools 4.3.1

import java.awt.Image;
import java.util.Date;

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
	private String ioFotoPath;
	private Image ioFotoImage;

	public TInformacionObligatoria() {
	}

	public TInformacionObligatoria(String ioOGMinisterio, String ioResMinisterio, String ioCargoMinisterio,
			String ioOGContratista, String ioResContratista, String ioCargoContratista, Date ioFechaIo,
			String ioFotoPath) {
		super();
		this.ioObsGeneral = ioOGMinisterio;
		this.ioResponsableMin = ioResMinisterio;
		this.ioCargoMin = ioCargoMinisterio;
		this.ioObsGenCont = ioOGContratista;
		this.ioResponsableCont = ioResContratista;
		this.ioCargoCont = ioCargoContratista;
		this.ioFechaIo = ioFechaIo;
		this.ioFotoPath = ioFotoPath;
	}

	public TInformacionObligatoria(Integer ioSerial) {
		super();
		this.ioSerial = ioSerial;
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

	public String getIoFotoPath() {
		return ioFotoPath;
	}

	public void setIoFotoPath(String ioFotoPath) {
		this.ioFotoPath = ioFotoPath;
	}

	public Image getIoFotoImage() {
		return ioFotoImage;
	}

	public void setIoFotoImage(Image ioFotoImage) {
		this.ioFotoImage = ioFotoImage;
	}

	@Override
	public String toString() {
		return "TInformacionObligatoria [ioSerial=" + ioSerial + ", ioObsGeneral=" + ioObsGeneral
				+ ", ioResponsableMin=" + ioResponsableMin + ", ioCargoMin=" + ioCargoMin + ", ioObsGenCont="
				+ ioObsGenCont + ", ioResponsableCont=" + ioResponsableCont + ", ioCargoCont=" + ioCargoCont
				+ ", ioFechaIo=" + ioFechaIo + ", ioFotoPath=" + ioFotoPath + "]";
	}

}
