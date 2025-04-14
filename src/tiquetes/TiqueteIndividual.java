package tiquetes;

import java.util.Date;

import atracciones.Atraccion;

public class TiqueteIndividual extends Tiquete {
	private Atraccion atraccion;

	public TiqueteIndividual(boolean fueUsado, boolean descuentoEmpleado, Date fechaCompra, String id, double precio,
			Atraccion atraccion) {
		super(fueUsado, descuentoEmpleado, fechaCompra, id, precio);
		this.atraccion = atraccion;
	}

	public Atraccion getAtraccion() {
		return atraccion;
	}
	
}
