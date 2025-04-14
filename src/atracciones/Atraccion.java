package atracciones;

import java.util.Date;
import java.util.List;

public abstract class Atraccion implements ElementoConRestriccionClimatica {
	public enum NivelExclusividad {
		FAMMILIAR,ORO,DIAMANTE,BASICO
	}
	protected List<String>restriccionesClimaticas;
	protected String id,nombre,ubicacion;
	protected int cupoMaximos, empleadosMinimos;
	protected Date fechaInicioTemporada, fechaFinTemporada;
	private NivelExclusividad nivelExclusividad;
	
	
	public Atraccion(List<String> restriccionesClimaticas, String id, String nombre, String ubicacion, int cupoMaximos,
			int empleadosMinimos, Date fechaInicioTemporada, Date fechaFinTemporada,
			NivelExclusividad nivelExclusividad) {
		super();
		this.restriccionesClimaticas = restriccionesClimaticas;
		this.id = id;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.cupoMaximos = cupoMaximos;
		this.empleadosMinimos = empleadosMinimos;
		this.fechaInicioTemporada = fechaInicioTemporada;
		this.fechaFinTemporada = fechaFinTemporada;
		this.nivelExclusividad = nivelExclusividad;
	}
	public String getNombre() {
		return nombre;
	}
	@Override
	public List<String> obtenerRestriccionesClimaticas() {
		return this.restriccionesClimaticas;

	}
	@Override
	public boolean puedeOperarEnClima(String Clima) {
		for (String climaRestringido : obtenerRestriccionesClimaticas()) {
			if (climaRestringido == Clima) {
				return false;
			}
		}
		return true;
	}
	
}
