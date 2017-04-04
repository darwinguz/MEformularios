package com.capa.reportes;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.sql.Connection;
import java.util.HashMap;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JRViewer;

public class LanzadorReportes extends JDialog {

	private static final long serialVersionUID = 308251665095677784L;

	JasperPrint archivoImprimir;
	JRViewer panelVisor;
	protected HashMap<String, Object> parametros;
	protected String sql;
	protected String nombreArchivo;

	public LanzadorReportes(final Frame padre, final String titulo) {
		super(padre, titulo, true);
		this.setResizable(true);
	}

	public void cargarReporte(final String nombreArchivo, final HashMap<String, Object> parametros,
			final Connection datos) {
		try {
			this.parametros = parametros;
			this.archivoImprimir = JasperFillManager.fillReport(nombreArchivo, this.parametros, datos);
			this.panelVisor = new JRViewer(this.archivoImprimir);
			this.getContentPane().add(this.panelVisor, BorderLayout.CENTER);
		} catch (final JRException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void setVisible(final boolean ver) {

		if (this.panelVisor != null)
			super.setVisible(ver);
		else {

			JOptionPane.showMessageDialog(this, "Se debe llenar el reporte antes de llamar al visor", "Reporte Vacio",
					JOptionPane.ERROR_MESSAGE);

			this.dispose();
		}
	}

}
