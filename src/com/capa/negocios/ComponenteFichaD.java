package com.capa.negocios;

import java.sql.ResultSet;
import java.util.List;

import javax.swing.JOptionPane;

import com.capa.datos.TCabecera;
import com.capa.datos.TFichaD;

public class ComponenteFichaD implements ServicioFichaD {

	String mensaje = null;
	String titulo = null;
	int tipoMensaje = 0;

	@Override
	public void crear(TFichaD fichaD) {
		String sql = "INSERT INTO t_ficha_d (c_serial, f_descripcion, f_foto_ficha_d, fd_actualizacion_n, io_serial) VALUES (?,?,?,?,?);";
		try {
			Query.insertar(sql, fichaD);
			JOptionPane.showMessageDialog(null, "Ingreso FICHA D exitoso!", "CONFIRMACIÓN",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			System.out.println("Error al INSERTAR: " + e.getMessage());
		}
	}

	@Override
	public int actualizacionFichaN(TCabecera serialC) {
		String query = "SELECT MAX(fd_actualizacion_n) FROM t_ficha_d WHERE c_serial = " + serialC.getCSerial() + ";";
		int maximo = -1;
		try {
			ResultSet rs = Query.seleccionar(query);

			while (rs.next()) {
				maximo = rs.getInt("MAX(fd_actualizacion_n)");
			}
		} catch (Exception e) {
			System.out.println("Error al BUSCAR: " + e.getMessage());
		}
		return maximo;
	}

	@Override
	public void crearFichaD(List<TFichaD> listaFichas) {
		// TODO Auto-generated method stub
		listaFichas.forEach(item -> {
			try {
				String query = "INSERT INTO t_ficha_d (c_serial, f_descripcion, f_foto_ficha_d, fd_actualizacion_n, io_serial) VALUES (?,?,?,?,?);";
				Query.insertarGenerico(query, new Object[] { item.gettCabecera().getCSerial(), item.getfDescripcion(),
						item.getfDfotoPath(), item.getfDactualizacionN(), item.gettInformacionObl().getIoSerial() });
				mensaje = "Ingreso exitoso";
				titulo = "INGRESO";
				tipoMensaje = 1;
				// System.out.println(query);
			} catch (Exception e) {
				mensaje = "Error al insertar datos del formulario MA " + e.getMessage();
			}
		});
		JOptionPane.showMessageDialog(null, mensaje, titulo, tipoMensaje);
	}
}
