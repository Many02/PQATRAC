package atracciones;

import java.util.Date;
import java.util.List;

public class Espectaculo implements ElementoConRestriccionClimatica {
	private String nombre;
	private boolean esDeTemporada;
	private Date fechaInicioTemporada;
	private Date fechaFinTemporada;
	private List<String>restriccionesClimaticas;
	//MODELAR HORARIOS 0 es domingo en adelante y se añade en ese dia el respectivo evento
	private String[]horarios = new String[7];
	public Espectaculo(String nombre, boolean esDeTemporada, Date fechaInicioTemporada, Date fechaFinTemporada,
			List<String> restriccionesClimaticas, String[] horarios) {
		super();
		this.nombre = nombre;
		this.esDeTemporada = esDeTemporada;
		this.fechaInicioTemporada = fechaInicioTemporada;
		this.fechaFinTemporada = fechaFinTemporada;
		this.restriccionesClimaticas = restriccionesClimaticas;
		this.horarios = horarios;
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
