package usuarios;

import java.util.LinkedList;
import java.util.List;

import atracciones.AtraccionMecanica;

public class Empleado extends Usuario {
	private LinkedList<String>capacitaciones;
	private List<AtraccionMecanica>atracciones = new LinkedList<AtraccionMecanica>();
	private LinkedList<Turno>horarios;
	private boolean esCocinero,esOperadorgeneral, esEspecializado;
	public Empleado(String id, String nombre, String login, String password, LinkedList<String> capacitaciones,
			LinkedList<Turno> horarios, boolean esCocinero, boolean esOperadorgeneral, boolean esEspecializado) {
		super(id, nombre, login, password);
		this.capacitaciones = capacitaciones;
		this.horarios = horarios;
		this.esCocinero = esCocinero;
		this.esOperadorgeneral = esOperadorgeneral;
		this.esEspecializado = esEspecializado;
	}
	public void addAtraccion(AtraccionMecanica atraccion) {
		atracciones.add(atraccion);
	}
	public void removeAtraccion(AtraccionMecanica atraccion) {
		atracciones.remove(atraccion);
	}
	public boolean puedeOperarAtraccion(AtraccionMecanica atraccion) {
		for (String especialidad : capacitaciones) {
			if (especialidad == atraccion.getNombre()) {
				return true;
			}
		}
	return false;	
	}
	public boolean EsCocinero() {
		return esCocinero;
	}
	public boolean EsOperadorgeneral() {
		return esOperadorgeneral;
	}
	public boolean EsEspecializado() {
		return esEspecializado;
	}
	
}
	