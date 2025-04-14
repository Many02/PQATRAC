package atracciones;

import java.util.Date;
import java.util.List;

public class AtraccionCultural extends Atraccion {
	private int edadMinima;

	public AtraccionCultural(List<String> restriccionesClimaticas, String id, String nombre, String ubicacion,
			int cupoMaximos, int empleadosMinimos, Date fechaInicioTemporada, Date fechaFinTemporada,
			NivelExclusividad nivelExclusividad, int edadMinima) {
		super(restriccionesClimaticas, id, nombre, ubicacion, cupoMaximos, empleadosMinimos, fechaInicioTemporada,
				fechaFinTemporada, nivelExclusividad);
		this.edadMinima = edadMinima;
	}
	public boolean verificarEdad(int edad){
		if (edad >= edadMinima ) {
			return true;
		}
	return false;	
	}
	
	
}
	
