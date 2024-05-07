package ar.edu.unju.fi.ejercicio01.main;
import ar.edu.unju.fi.ejercicio01.model.*;
import ar.edu.unju.fi.ejercicio01.model.producto.Categoria;
import ar.edu.unju.fi.ejercicio01.model.producto.OrigenFabricacion;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		 ArrayList<producto> listaProductos = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);

	        int opcion;
	        do {
	        	
	            System.out.println("Menú");
	            System.out.println("Elija una opción:");
	            System.out.println("1 –> Crear Producto");
	            System.out.println("2 –> Mostrar productos");
	            System.out.println("3 –> Modificar producto");
	            System.out.println("4 –> Salir");
	            System.out.println("Elija una opción:");

	            opcion = scanner.nextInt();

	            switch (opcion) {
	            case 1:
                    System.out.println("Ingrese el código del producto:");
                    int codigo = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea

                    System.out.println("Ingrese la descripción del producto:");
                    String descripcion = scanner.nextLine();

                    System.out.println("Ingrese el precio unitario del producto:");
                    double precioUnitario = scanner.nextDouble();

                    System.out.println("Elija el origen de fabricación:");
                    System.out.println("1 - Argentina");
                    System.out.println("2 - China");
                    System.out.println("3 - Brasil");
                    System.out.println("4 - Uruguay");
                    int opcionOrigen = scanner.nextInt();
                    OrigenFabricacion origenFabricacion = OrigenFabricacion.values()[opcionOrigen - 1];

                    System.out.println("Elija la categoría del producto:");
                    System.out.println("1 - Telefonía");
                    System.out.println("2 - Informática");
                    System.out.println("3 - Electrohogar");
                    System.out.println("4 - Herramientas");
                    int opcionCategoria = scanner.nextInt();
                    Categoria categoria = Categoria.values()[opcionCategoria - 1];

                    producto producto = new producto(codigo, descripcion, precioUnitario, origenFabricacion, categoria);
                    listaProductos.add(producto);
                    break;
                case 2:
                    // Mostrar productos
                    for (producto p : listaProductos) {
                        System.out.println(p);
                    }
                    break;
                case 3:
                    // Lógica para modificar un producto
                    if (listaProductos.isEmpty()) {
                        System.out.println("No hay productos para modificar.");
                        break;
                    }
                    System.out.println("Ingrese el código del producto a modificar:");
                    int codigoModificar = scanner.nextInt();
                    boolean encontrado = false;
                    for (producto p : listaProductos) {
                        if (p.getCodigo() == codigoModificar) {
                            encontrado = true;
                            System.out.println("Seleccione el atributo a modificar:");
                            System.out.println("1 - Descripción");
                            System.out.println("2 - Precio unitario");
                            System.out.println("3 - Origen de fabricación");
                            System.out.println("4 - Categoría");
                            int opcionModificar = scanner.nextInt();
                            scanner.nextLine(); // Consumir el salto de línea
                            switch (opcionModificar) {
                                case 1:
                                    System.out.println("Ingrese la nueva descripción:");
                                    String nuevaDescripcion = scanner.nextLine();
                                    p.setDescripcion(nuevaDescripcion);
                                    break;
                                case 2:
                                    System.out.println("Ingrese el nuevo precio unitario:");
                                    double nuevoPrecio = scanner.nextDouble();
                                    p.setPrecioUnitario(nuevoPrecio);
                                    break;
                                case 3:
                                    System.out.println("Elija el nuevo origen de fabricación:");
                                    System.out.println("1 - Argentina");
                                    System.out.println("2 - China");
                                    System.out.println("3 - Brasil");
                                    System.out.println("4 - Uruguay");
                                    int opcionNuevoOrigen = scanner.nextInt();
                                    OrigenFabricacion nuevoOrigen = OrigenFabricacion.values()[opcionNuevoOrigen - 1];
                                    p.setOrigenFabricacion(nuevoOrigen);
                                    break;
                                case 4:
                                    System.out.println("Elija la nueva categoría:");
                                    System.out.println("1 - Telefonía");
                                    System.out.println("2 - Informática");
                                    System.out.println("3 - Electrohogar");
                                    System.out.println("4 - Herramientas");
                                    int opcionNuevaCategoria = scanner.nextInt();
                                    Categoria nuevaCategoria = Categoria.values()[opcionNuevaCategoria - 1];
                                    p.setCategoria(nuevaCategoria);
                                    break;
                                default:
                                    System.out.println("Opción inválida.");
                            }
                            System.out.println("Producto modificado correctamente.");
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontró ningún producto con el código ingresado.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
	            }
	        } while (opcion != 4);
	    }
	

}


