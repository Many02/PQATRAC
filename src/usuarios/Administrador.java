package usuarios;

import java.util.LinkedList;
import java.util.List;

import atracciones.Atraccion;
import atracciones.Espectaculo;

public class Administrador extends Usuario {
	private List<Empleado>empleados = new LinkedList<Empleado>();
	private List<Atraccion>atracciones= new LinkedList<Atraccion>();
	private List<Espectaculo>espectaculos=new LinkedList<Espectaculo>();
	public Administrador(String id, String nombre, String login, String password) {
		super(id, nombre, login, password);
	}
	public void addEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}
	public void removeEmpleado(Empleado empleado) {
		empleados.remove(empleado);
	}
	public void addAtraccion(Atraccion atraccion) {
		this.atracciones.add(atraccion);
	}
	public void removeAtraccion(Atraccion atraccion) {
		this.atracciones.remove(atraccion);
	}
	public void addEspectaculo(Espectaculo espectaculo) {
		espectaculos.add(espectaculo);
	}
	public void removeEspectaculo(Espectaculo espectaculo) {
		espectaculos.remove(espectaculo);
	}
}
