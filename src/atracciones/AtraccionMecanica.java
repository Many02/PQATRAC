package atracciones;

import java.util.Date;
import java.util.List;

import usuarios.Cliente;

public class AtraccionMecanica extends Atraccion {
	private double alturaMaxima,alturaMinima,pesoMaximo,pesoMinimo;
	private List<String> contraindicacionesSalud;
	private NivelRiesgo nivelRiesgo;	

	public AtraccionMecanica(List<String> restriccionesClimaticas, String id, String nombre, String ubicacion,
			int cupoMaximos, int empleadosMinimos, Date fechaInicioTemporada, Date fechaFinTemporada,
			NivelExclusividad nivelExclusividad, double alturaMaxima, double alturaMinima, double pesoMaximo,
			double pesoMinimo, List<String> contraindicacionesSalud, NivelRiesgo nivelRiesgo) {
		super(restriccionesClimaticas, id, nombre, ubicacion, cupoMaximos, empleadosMinimos, fechaInicioTemporada,
				fechaFinTemporada, nivelExclusividad);
		this.alturaMaxima = alturaMaxima;
		this.alturaMinima = alturaMinima;
		this.pesoMaximo = pesoMaximo;
		this.pesoMinimo = pesoMinimo;
		this.contraindicacionesSalud = contraindicacionesSalud;
		this.nivelRiesgo = nivelRiesgo;
	}



	public boolean verificarRestricciones(Cliente cliente) {
		for (String restriccion:this.contraindicacionesSalud) {
			for (String restriccionCliente : cliente.getRestriccionSalud()) {
				if (restriccion == restriccionCliente) {
					return true;
				} 
			}
		}
	return false;
	}
	
}
enum NivelRiesgo {
	MEDIO,ALTO
}
