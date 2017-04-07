package com.capa.datos;

public class TFichaD implements java.io.Serializable {

	private static final long serialVersionUID = -3765966936467972032L;
	private Integer fdSerial;
	private TCabecera tCabecera;
	private TInformacionObligatoria tInformacionObligatoria;
	private String fDescripcion;
	private String fFotoFichaD;

	public TFichaD() {
	}

	public TFichaD(TCabecera TCabecera, TInformacionObligatoria TInformacionObligatoria) {
		this.tCabecera = TCabecera;
		this.tInformacionObligatoria = TInformacionObligatoria;
	}

	public TFichaD(TCabecera TCabecera, String FDescripcion, String FFotoFichaD) {
		this.tCabecera = TCabecera;
		this.fDescripcion = FDescripcion;
		this.fFotoFichaD = FFotoFichaD;
	}

	public Integer getFdSerial() {
		return fdSerial;
	}

	public void setFdSerial(Integer fdSerial) {
		this.fdSerial = fdSerial;
	}

	public TCabecera gettCabecera() {
		return tCabecera;
	}

	public void settCabecera(TCabecera tCabecera) {
		this.tCabecera = tCabecera;
	}

	public TInformacionObligatoria gettInformacionObligatoria() {
		return tInformacionObligatoria;
	}

	public void settInformacionObligatoria(TInformacionObligatoria tInformacionObligatoria) {
		this.tInformacionObligatoria = tInformacionObligatoria;
	}

	public String getfDescripcion() {
		return fDescripcion;
	}

	public void setfDescripcion(String fDescripcion) {
		this.fDescripcion = fDescripcion;
	}

	public String getfFotoFichaD() {
		return fFotoFichaD;
	}

	public void setfFotoFichaD(String fFotoFichaD) {
		this.fFotoFichaD = fFotoFichaD;
	}

	@Override
	public String toString() {
		return "TFichaD [fdSerial=" + fdSerial + ", tCabecera=" + tCabecera + ", tInformacionObligatoria="
				+ tInformacionObligatoria + ", fDescripcion=" + fDescripcion + ", fFotoFichaD=" + fFotoFichaD + "]";
	}

}
