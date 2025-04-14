package servicio;

import java.util.List;

import usuarios.Empleado;

public abstract class LugarTrabajo {
	protected String nombre, ubicacion;
	protected List<Empleado>empleados;
	public LugarTrabajo(String nombre, String ubicacion, List<Empleado> empleados) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.empleados = empleados;
	}
	
}
