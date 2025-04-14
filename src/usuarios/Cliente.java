package usuarios;

import java.util.LinkedList;
import java.util.List;

import tiquetes.Tiquete;

public class Cliente extends Usuario {
	private List<String> restriccionSalud;
	private int edad;
	private List<Tiquete>tiquetesSinUsar;
	private List<Tiquete>tiquetesUsados;
	public Cliente(int edad, String id, String nombre, String login, String password, List<String> restriccionSalud) {
		super(id, nombre, login, password);
		this.restriccionSalud = restriccionSalud;
		this.edad = edad;
		this.tiquetesSinUsar= new LinkedList<Tiquete>();
		this.tiquetesUsados= new LinkedList<Tiquete>();
		}
	public void addTiqueteSinUsar(Tiquete tiquete) {
	    this.tiquetesSinUsar.add(tiquete);
	}

	public void removeTiqueteSinUsar(Tiquete tiquete) {
	    this.tiquetesSinUsar.remove(tiquete);
	}
	public void addTiqueteUsado(Tiquete tiquete) {
	    this.tiquetesUsados.add(tiquete);
	}

	public void removeTiqueteUsado(Tiquete tiquete) {
	    this.tiquetesUsados.remove(tiquete);
	}

	public List<String> getRestriccionSalud() {
		return restriccionSalud;
	}

	public int getEdad() {
		return edad;
	}
	
	
}

