package com.capa.datos;

import java.awt.Image;

public class TFichaD implements java.io.Serializable {

	private static final long serialVersionUID = -3765966936467972032L;
	private Integer fDserial;
	private TCabecera tCabecera;
	private String fDescripcion;
	private int fDactualizacionN;
	private String fDfotoPath;
	private Image fDfotoImage;

	public TFichaD() {
	}

	public TFichaD(TCabecera TCabecera, String path) {
		this.tCabecera = TCabecera;
		this.fDfotoPath = path;
	}

	public TFichaD(TCabecera tCabecera, String fDescripcion, int fDactualizacionN, String fDfotoPath) {
		super();
		this.tCabecera = tCabecera;
		this.fDescripcion = fDescripcion;
		this.fDactualizacionN = fDactualizacionN;
		this.fDfotoPath = fDfotoPath;
	}

	public Integer getfDserial() {
		return fDserial;
	}

	public void setfDserial(Integer fDserial) {
		this.fDserial = fDserial;
	}

	public TCabecera gettCabecera() {
		return tCabecera;
	}

	public void settCabecera(TCabecera tCabecera) {
		this.tCabecera = tCabecera;
	}

	public String getfDescripcion() {
		return fDescripcion;
	}

	public void setfDescripcion(String fDescripcion) {
		this.fDescripcion = fDescripcion;
	}

	public int getfDactualizacionN() {
		return fDactualizacionN;
	}

	public void setfDactualizacionN(int fDactualizacionN) {
		this.fDactualizacionN = fDactualizacionN;
	}

	public String getfDfotoPath() {
		return fDfotoPath;
	}

	public void setfDfotoPath(String fDfotoPath) {
		this.fDfotoPath = fDfotoPath;
	}

	public Image getfDfotoImage() {
		return fDfotoImage;
	}

	public void setfDfotoImage(Image fDfotoImage) {
		this.fDfotoImage = fDfotoImage;
	}

	@Override
	public String toString() {
		return "TFichaD [fDserial=" + fDserial + ", tCabecera=" + tCabecera + ", fDescripcion=" + fDescripcion
				+ ", fDactualizacionN=" + fDactualizacionN + ", fDfotoPath=" + fDfotoPath + ", fDfotoImage="
				+ fDfotoImage + "]";
	}

}
