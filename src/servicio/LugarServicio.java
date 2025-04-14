package servicio;

import java.util.List;

import usuarios.Empleado;

public class LugarServicio extends LugarTrabajo {
	public enum TipoServicio{
		CAFETERIA,TAQUILLA,TIENDA
	}
	private TipoServicio tipoServicio;
	public LugarServicio(String nombre, String ubicacion, List<Empleado> empleados, TipoServicio tipoServicio) {
		super(nombre, ubicacion, empleados);
		this.tipoServicio = tipoServicio;
		if (tipoServicio == TipoServicio.CAFETERIA) {
			boolean hay = false;
			for (Empleado empleado : empleados) {
				if (empleado.EsCocinero()) { 
					hay = true;
					break;
				}
			}
			if (!hay) {
				throw new IllegalArgumentException("");
			}
		}
		
		
	}
	
}
