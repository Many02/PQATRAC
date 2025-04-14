package atracciones;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import servicio.LugarTrabajo;
import tiquetes.Tiquete;
import usuarios.Administrador;
import usuarios.Cliente;
import usuarios.Empleado;

public class Parque {
	private String nombre, ubicacion;
	private Date horaApertura,horaCierre;
	private List<Atraccion>atracciones;
	private List<Cliente>clientes;
	private List<Empleado>empleados;
	private List<Tiquete>tiquetes;
	private List<Espectaculo>espectaculos;
	private List<Administrador>administradores;
	private List<LugarTrabajo>lugarTrabajo;
	public Parque(String nombre, String ubicacion, Date horaApertura, Date horaCierre) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.horaApertura = horaApertura;
		this.horaCierre = horaCierre;
		this.atracciones = new LinkedList<Atraccion>() ;
		this.clientes = new LinkedList<Cliente>() ;
		this.empleados = new LinkedList<Empleado>() ;
		this.tiquetes = new LinkedList<Tiquete>() ;
		this.espectaculos = new LinkedList<Espectaculo>() ;
		this.administradores = new LinkedList<Administrador>();
		this.lugarTrabajo = new LinkedList<LugarTrabajo>();
		
	}
	public void addAtraccion(Atraccion atraccion) {
	    this.atracciones.add(atraccion);
	}

	public void addCliente(Cliente cliente) {
	    this.clientes.add(cliente);
	}

	public void addEmpleado(Empleado empleado) {
	    this.empleados.add(empleado);
	}

	public void addTiquete(Tiquete tiquete) {
	    this.tiquetes.add(tiquete);
	}

	public void addEspectaculo(Espectaculo espectaculo) {
	    this.espectaculos.add(espectaculo);
	}

	public void addAdministrador(Administrador administrador) {
	    this.administradores.add(administrador);
	}
}
