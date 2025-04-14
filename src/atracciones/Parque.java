package atracciones;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import servicio.LugarTrabajo;
import tiquetes.Tiquete;
import usuarios.Administrador;
import usuarios.Cliente;
import usuarios.Empleado;
import usuarios.Usuario;

public class Parque {
	private String nombre, ubicacion;
	private Date horaApertura,horaCierre;
	private List<Atraccion>atracciones;
	private Map<String,Cliente>clientes;
	private Map<String,Empleado>empleados;
	private List<Espectaculo>espectaculos;
	private Map<String,Administrador>administradores;
	private List<LugarTrabajo>lugarTrabajo;
	public Parque(String nombre, String ubicacion, Date horaApertura, Date horaCierre) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.horaApertura = horaApertura;
		this.horaCierre = horaCierre;
		this.atracciones = new LinkedList<Atraccion>() ;
		this.clientes = new HashMap<String,Cliente>() ;
		this.empleados = new HashMap<String,Empleado>() ;
		this.espectaculos = new LinkedList<Espectaculo>() ;
		this.administradores = new HashMap<String,Administrador>();
		this.lugarTrabajo = new LinkedList<LugarTrabajo>();
		
	}
	public void addAtraccion(Atraccion atraccion) {
	    this.atracciones.add(atraccion);
	}

	public void addCliente(Cliente cliente) {
	    this.clientes.put(cliente.getLogin(), cliente);
	}
	public void removeCliente(Cliente cliente) {
		this.clientes.remove(cliente.getLogin());
	}

	public void addEmpleado(Empleado empleado) {
	    this.empleados.put(empleado.getLogin(), empleado);
	}
	public void removeEmpleado(Empleado empleado) {
		this.empleados.remove(empleado.getLogin());
	}

	public void addEspectaculo(Espectaculo espectaculo) {
	    this.espectaculos.add(espectaculo);
	}

	public void addAdministrador(Administrador administrador) {
	    this.administradores.put(administrador.getLogin(), administrador);
	}
	public void removeAdministrador(Administrador administrador) {
		this.administradores.remove(administrador.getLogin());
	}
	
	public Usuario autenticarUsuario(int opcion, Scanner scanner) {
        System.out.println("Digita tu Login: ");
        String login = scanner.nextLine();
        System.out.println("Digita tu contraseña: ");
        String password = scanner.nextLine();
        if (opcion == 1 && this.empleados.containsKey(login)== true) {
        	Empleado empleado = this.empleados.get(login);
        	System.out.println(empleado.getPassword());
        	System.out.println(password);
        	if (empleado.getPassword()==password.strip()) {
        		return empleado;
        	}
        	else {
        		System.out.println("CONTRASEÑA INCORRECTA");
        	}
        	
        }
        else if (opcion == 2 && this.administradores.containsKey(login)==true) {
        	Administrador administrador = this.administradores.get(login);
        	if (administrador.getPassword()==password) {
        		return administrador;
        	}
        	else {
        		System.out.println("CONTRASEÑA INCORRECTA");
        	}
        }
        else if (opcion == 3 && this.clientes.containsKey(login)==true) {
        	Cliente cliente = this.clientes.get(login);
        	if (cliente.getPassword()==password) {
        		return cliente;
        	}
        	else {
        		System.out.println("CONTRASEÑA INCORRECTA");
        	}
        }
        return null;
    }
	
}
