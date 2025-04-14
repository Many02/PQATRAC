package tiquetes;

import java.util.Date;

public abstract class Tiquete {
	protected boolean fueUsado, descuentoEmpleado;
	protected Date fechaCompra;
	protected String id;
	protected double precio;
	
	public Tiquete(boolean fueUsado, boolean descuentoEmpleado, Date fechaCompra, String id, double precio) {
		super();
		this.fueUsado = fueUsado;
		this.descuentoEmpleado = descuentoEmpleado;
		this.fechaCompra = fechaCompra;
		this.id = id;
		this.precio = precio;
	}
	public void marcarComoUsado(){
		fueUsado = true;
	} 
	public void aplicarDescuento(double porcentaje) {
		precio = (1 - porcentaje) * precio;	
	}
	
}
