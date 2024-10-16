/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.datosclientes;

/**
 *
 * @author miAsus
 */
import java.util.Scanner;

public class DatosClientes {

 public static void main(String[] args) {
        // Se crea un objeto Scanner para leer la entrada del usuario.
        Scanner scanner = new Scanner(System.in);
        
        // Se crea una instancia de la clase Lista para almacenar los datos de las personas.
        Lista listaPersonas = new Lista();
        
        // Se llama al método "menu" para gestionar las opciones del usuario.
        menu(scanner, listaPersonas);
    }

    public static void menu(Scanner scanner, Lista listaPersonas) {
        int opcion;
        do {
            //  menú principal
            System.out.println("Menú:");
            System.out.println("1. Cargar datos");
            System.out.println("2. Listar personas");
            System.out.println("3. Insertar persona");
            System.out.println("4. Eliminar persona");
            System.out.println("5. Contar personas");
            System.out.println("6. Buscar persona por DNI");
            System.out.println("7. Ordenar personas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            // Manejar las opciones seleccionadas por el usuario
            switch (opcion) {
                case 1:
                    listaPersonas.cargar();
                    break;
                case 2:
                    listaPersonas.listar();
                    break;
                case 3:
                    // Insertar una nueva persona en la lista
                    System.out.println("Insertar nueva persona:");

                    // Nuevos datos de Persona
                    System.out.print("Nombre: ");
                    String nombre = scanner.next();

                    System.out.print("Apellidos: ");
                    String apellidos = scanner.next();

                    System.out.print("DNI: ");
                    String dni = scanner.next();

                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();

                    // Nuevos datos de Direccion
                    System.out.print("Calle: ");
                    String calle = scanner.next();

                    System.out.print("Código Postal: ");
                    int cp = scanner.nextInt();

                    System.out.print("Provincia: ");
                    String provincia = scanner.next();

                    // Crear objetos de Direccion y Persona nuevos
                    Direccion direccionNueva = new Direccion(calle, cp, provincia);
                    Persona personaNueva = new Persona(nombre, apellidos, dni, edad, direccionNueva);

                    // Insertar la nueva persona en la lista
                    listaPersonas.insertar(personaNueva);

                    System.out.println("Persona insertada correctamente.");
                    break;

                case 4:
                    // Eliminar una persona de la lista
                    System.out.print("Ingrese el DNI de la persona a eliminar: ");
                    String dniEliminar = scanner.next();
                    listaPersonas.eliminar(dniEliminar);
                    break;
                case 5:
                    // Mostrar el número de personas en la lista
                    listaPersonas.contar();
                    break;
                case 6:
                    // Buscar una persona por DNI
                    System.out.print("Ingrese el DNI de la persona a buscar: ");
                    String dniBuscar = scanner.next();
                    listaPersonas.buscar(dniBuscar);
                    break;
                case 7:
                    // Ordenar la lista de personas
                    listaPersonas.ordenar();
                    break;
                case 0:
                    // Salir del programa
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    // Manejar opción no válida
                    System.out.println("Opción no válida. Por favor, ingrese una opción correcta.");
            }
        } while (opcion != 0);
    }
}


