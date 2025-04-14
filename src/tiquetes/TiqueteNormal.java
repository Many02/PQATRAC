package tiquetes;
import java.util.Date;

import atracciones.Atraccion.NivelExclusividad ;
public class TiqueteNormal extends Tiquete {
	private NivelExclusividad tipoTiquete;

	public TiqueteNormal(boolean fueUsado, boolean descuentoEmpleado, Date fechaCompra, String id, double precio,
			NivelExclusividad tipoTiquete) {
		super(fueUsado, descuentoEmpleado, fechaCompra, id, precio);
		this.tipoTiquete = tipoTiquete;
	}
	
	




}
