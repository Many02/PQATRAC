package tiquetes;

import java.util.Date;

import atracciones.Atraccion.NivelExclusividad;

public class TiqueteTemporada extends Tiquete {
	private Date fechaInicio, fechaFin;
	public enum TipoTemporada {
		SEMANAL,MENSUAL,ANUAL,ESTACIONAL
	}
	private TipoTemporada tipoTemporada;
	private NivelExclusividad nivelExclusividad;
	public TiqueteTemporada(boolean fueUsado, boolean descuentoEmpleado, Date fechaCompra, String id, double precio,
			Date fechaInicio, Date fechaFin, TipoTemporada tipoTemporada, NivelExclusividad nivelExclusividad) {
		super(fueUsado, descuentoEmpleado, fechaCompra, id, precio);
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.tipoTemporada = tipoTemporada;
		this.nivelExclusividad = nivelExclusividad;
	}
	public boolean estaVigente() {
		Date hoy = new Date();
		if (fechaInicio.compareTo(hoy)<= 0 && fechaFin.compareTo(hoy)>=0) {
			return true;
			
		}
	return false;
	}
}
