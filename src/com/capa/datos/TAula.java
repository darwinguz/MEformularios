package com.capa.datos;

import java.awt.Image;
import java.util.Arrays;

public class TAula implements java.io.Serializable {

	private static final long serialVersionUID = 3086111630494756735L;
	private Integer auSerial;
	private String auNombre;
	private String auFoto;

	private byte[] auFotoRecuperaDB;
	private Image imagen;

	public TAula() {
	}

	public TAula(String auNombre, String auFoto) {
		this.auNombre = auNombre;
		this.auFoto = auFoto;
	}

	public Integer getAuSerial() {
		return this.auSerial;
	}

	public void setAuSerial(Integer auSerial) {
		this.auSerial = auSerial;
	}

	public String getAuNombre() {
		return this.auNombre;
	}

	public void setAuNombre(String auNombre) {
		this.auNombre = auNombre;
	}

	public String getAuFoto() {
		return auFoto;
	}

	public void setAuFoto(String auFoto) {
		this.auFoto = auFoto;
	}

	public byte[] getAuFotoRecuperaDB() {
		return auFotoRecuperaDB;
	}

	public void setAuFotoRecuperaDB(byte[] auFotoRecuperaDB) {
		this.auFotoRecuperaDB = auFotoRecuperaDB;
	}

	public Image getImagen() {
		return imagen;
	}

	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "TAula [auSerial=" + auSerial + ", auNombre=" + auNombre + ", auFoto=" + auFoto + ", auFotoRecuperaDB="
				+ Arrays.toString(auFotoRecuperaDB) + ", imagen=" + imagen + "]";
	}

}
