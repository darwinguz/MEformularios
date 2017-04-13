package com.capa.datos;

public class TGrupo implements java.io.Serializable {

	private static final long serialVersionUID = -2717485481452606350L;
	private Integer GSerial;
	private String GNombre;

	public TGrupo() {
	}

	public TGrupo(Integer gSerial) {
		super();
		GSerial = gSerial;
	}

	public TGrupo(String GNombre) {
		this.GNombre = GNombre;

	}

	public Integer getGSerial() {
		return this.GSerial;
	}

	public void setGSerial(Integer GSerial) {
		this.GSerial = GSerial;
	}

	public String getGNombre() {
		return this.GNombre;
	}

	public void setGNombre(String GNombre) {
		this.GNombre = GNombre;
	}

	@Override
	public String toString() {
		return "TGrupo [GSerial=" + GSerial + ", GNombre=" + GNombre + "]";
	}

}
