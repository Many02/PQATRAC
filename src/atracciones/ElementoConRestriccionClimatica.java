package atracciones;

import java.util.List;

public interface ElementoConRestriccionClimatica {
	public List<String>obtenerRestriccionesClimaticas();
	public boolean puedeOperarEnClima(String Clima);
}
