/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datosclientes;

/**
 *
 * @author Antonio Atienza Cano
 */
public class Persona {

    // Atributos
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
    private Direccion direccion;

    // Constructor principal
    public Persona(String nombre, String apellidos, String dni, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.direccion = direccion;
    }

    // Constructor de copia
    public Persona(Persona otraPersona) {
        // Copia de los atributos de otraPersona a la nueva instancia
        this.nombre = otraPersona.nombre;
        this.apellidos = otraPersona.apellidos;
        this.dni = otraPersona.dni;
        this.edad = otraPersona.edad;

        // Se crea una nueva instancia de Direccion basada en la copia de la dirección de otraPersona
        this.direccion = new Direccion(otraPersona.direccion);
    }

    // Getters y setters con validadores
    // Getter para el nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para el nombre con validación
    public void setNombre(String nombre) {
        if (verificarCadenaNoVacia(nombre)) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: Nombre no válido. Debe ser una cadena de caracteres no vacía.");
        }
    }

    // Getter para los apellidos
    public String getApellidos() {
        return apellidos;
    }

    // Setter para los apellidos con validación
    public void setApellidos(String apellidos) {
        if (verificarCadenaNoVacia(apellidos)) {
            this.apellidos = apellidos;
        } else {
            System.out.println("Error: Apellidos no válidos. Deben ser una cadena de caracteres no vacía.");
        }
    }

    // Getter para el DNI
    public String getDni() {
        return dni;
    }

    // Setter para el DNI con validación
    public void setDni(String dni) {
        if (verificarDni(dni)) {
            this.dni = dni;
        } else {
            System.out.println("Error: DNI no válido. Debe tener 8 números seguidos de una letra.");
        }
    }

    // Getter para la edad
    public int getEdad() {
        return edad;
    }

    // Setter para la edad con validación
    public void setEdad(int edad) {
        if (verificarEdad(edad)) {
            this.edad = edad;
        } else {
            System.out.println("Error: Edad no válida. Debe estar entre 18 y 67 años.");
        }
    }

    // Getter para la dirección
    public Direccion getDireccion() {
        return direccion;
    }

    // Setter para la dirección
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    // Métodos privados de validación
    // Verifica que una cadena no sea nula o vacía
    private boolean verificarCadenaNoVacia(String cadena) {
        return cadena != null && !cadena.trim().isEmpty();
    }

    // Verifica que el DNI cumpla con el formato de 8 números seguidos de una letra
    private boolean verificarDni(String dni) {
        return dni != null && dni.matches("^\\d{8}[a-zA-Z]$");
    }

    // Verifica que la edad esté en el rango de 18 a 67 años
    private boolean verificarEdad(int edad) {
        return edad >= 18 && edad <= 67;
    }
}
