package ar.edu.unju.fi.ejercicio01.main;
import ar.edu.unju.fi.ejercicio01.model.*;

import java.util.ArrayList;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		 ArrayList<producto> lista = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);

	        int opcion;
	        do {
	        	
	            System.out.println("Menú");
	            System.out.println("Elija una opción:");
	            System.out.println("1 –> Crear Producto");
	            System.out.println("2 –> Mostrar productos");
	            System.out.println("3 –> Modificar producto");
	            System.out.println("4 –> Salir");

	            opcion = scanner.nextInt();

	            switch (opcion) {
	                case 1:
	                    crearProducto(lista, scanner);
	                    break;
	                case 2:
	                    mostrarProductos(lista);
	                    break;
	                case 3:
	                    modificarProducto(lista, scanner);
	                    break;
	                case 4:
	                    System.out.println("Saliendo");
	                    break;
	                default:
	                    System.out.println("Opción inválida. Intentelo de nuevo.");
	            }
	        } while (opcion != 4);
	    }
	
    private static void crearProducto(ArrayList<producto> lista, Scanner scanner) {
        System.out.println("Creando el producto");

        System.out.println("código de su producto:");
        String codigo = scanner.nextLine();

        System.out.println("descripción de su producto:");
        String descripcion = scanner.nextLine();

        System.out.println("su precio unitario:");
        double precioUnitario = scanner.nextDouble();

      

	}
}


