package usuarios;

import java.util.Date;

import atracciones.Atraccion;
import servicio.LugarTrabajo;

public class Turno {
	private Date fecha;
	private LugarTrabajo lugarTrabajo;
	private Atraccion atraccion;
	private boolean esApertura,esCierre;
	public Turno(Date fecha, LugarTrabajo lugarTrabajo, Atraccion atraccion, boolean esApertura, boolean esCierre) {
		super();
		this.fecha = fecha;
		this.lugarTrabajo = lugarTrabajo;
		this.atraccion = atraccion;
		this.esApertura = esApertura;
		this.esCierre = esCierre;
	}
	
	
}
