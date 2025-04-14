package exceptions;

import servicio.LugarServicio;

public class RequisitoNoCumplido extends Exception {
	public RequisitoNoCumplido(String nombre) {
		super("El lugar de servicio " + nombre + " No cumple con requisito de cocinero");
	}
}
