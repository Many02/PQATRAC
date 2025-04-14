package servicio;

import java.util.List;

import usuarios.Empleado;

public class ServicioGeneral extends LugarTrabajo {
	private List<String>areasAsignadas;

	public ServicioGeneral(String nombre, String ubicacion, List<Empleado> empleados, List<String> areasAsignadas) {
		super(nombre, ubicacion, empleados);
		this.areasAsignadas = areasAsignadas;
	}
	
	
}
