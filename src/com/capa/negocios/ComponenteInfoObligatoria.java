package com.capa.negocios;

import javax.swing.JOptionPane;

import com.capa.datos.TInformacionObligatoria;
import com.capa.util.Utilitarios;

public class ComponenteInfoObligatoria implements ServicioInfoObligatoria {

	@Override
	public void crear(TInformacionObligatoria inforObl) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO t_informacion_obligatoria ("
				+ "io_obs_general, io_responsable_min, io_cargo_min, io_obs_gen_cont, io_responsable_cont, io_cargo_cont, "
				+ "io_fecha_io) VALUES " + "('" + inforObl.getIoObsGeneral() + "','" + inforObl.getIoResponsableMin()
				+ "','" + inforObl.getIoCargoMin() + "','" + inforObl.getIoObsGenCont() + "','"
				+ inforObl.getIoResponsableCont() + "','" + inforObl.getIoCargoCont() + "','" + "');";
		try {
			Query.insertar(sql);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al insertar Datos " + e.getMessage(), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
	}

}
