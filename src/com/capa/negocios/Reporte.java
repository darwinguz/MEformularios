package com.capa.negocios;

import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

public class Reporte extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8831364027864616549L;
	private JasperPrint print;
	private JRViewer viewer;

	public Reporte(final String title, int x, int y, int width, int height) {
		setTitle(title);
		setBounds(x, y, width, height);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setModal(true);
	}

	public void cargarReporte(InputStream path, HashMap<String, Object> parametros, Connection conexion) {
		try {
			this.print = JasperFillManager.fillReport(path, parametros, conexion);
			this.viewer = new JRViewer(this.print);
			this.getContentPane().add(this.viewer);
		} catch (final JRException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void setVisible(final boolean ver) {
		if (this.viewer != null)
			super.setVisible(ver);
		else {
			JOptionPane.showMessageDialog(this, "ERROR: Se debe llenar el reporte antes de llamar al visor!",
					"Reporte Vacio", JOptionPane.ERROR_MESSAGE);
			this.dispose();
		}
	}

}
