package consolas;

import java.util.Date;
import java.util.Scanner;

import atracciones.Parque;
import usuarios.Empleado;

public class ConsolaPrincipal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        Date date1 = new Date();
        Date date2 = new Date();
        Parque parque = new Parque("mundo aventura","Carrera 24",date1,date2);
        Empleado empleado = new Empleado(null, "MANITO", "ViniJR", "202312722", null, null, false, false, false);
        parque.addEmpleado(empleado);
        while (opcion != 4) {
        	mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
           
            if (opcion == 1) {
            	programaEmpleado(opcion,scanner,parque);
            } else if (opcion == 2) {
                break;
            } else if (opcion == 3) {
                break;
            } else if (opcion == 4) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }
	public static void mostrarMenu() {
        System.out.println("\n=== MENÚ PROGRAMA PRUEBAS===");
        System.out.println("1. Empleado");
        System.out.println("2. Administrador");
        System.out.println("3. Cliente");
        System.out.println("4. Salir");
    }
	public static void programaEmpleado(int opcion, Scanner scanner, Parque parque) {
		Empleado empleado = (Empleado) parque.autenticarUsuario(opcion, scanner);
		System.out.println("Nombre empleado: " + empleado.getNombre());

	}
}
