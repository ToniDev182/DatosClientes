/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datosclientes;

/**
 *
 * @author Antonio Atienza Cano
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Lista {

    // ArrayList para almacenar objetos de la clase Persona
    private ArrayList<Persona> lista = new ArrayList<>();

    // Métodos getter y setter para acceder y modificar la lista
    public ArrayList<Persona> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Persona> lista) {
        this.lista = lista;
    }

    // Método para cargar datos en nuestra lista
    public void cargar() {
        // Crear objetos de Direccion
        Direccion direccion1 = new Direccion("C/ Los Olivos", 38493, "Santa Cruz de Tenerife");
        Direccion direccion2 = new Direccion("C/ Los Pinos", 38403, "Santa Cruz de Tenerife");
        Direccion direccion3 = new Direccion("C/ Los Franceses", 38505, "Las Palmas");
        Direccion direccion4 = new Direccion("C/ Los Pinos", 38403, "Las Palmas");

        // Crear objetos de Persona y agregarlas a la lista
        lista.add(new Persona("Adrián", "García Santos", "11111111A", 23, direccion1));
        lista.add(new Persona("Ana", "Mendez Nuñez", "22222222B", 22, direccion2));
        lista.add(new Persona("Maria", "Sanchez Camacho", "33333333C", 45, direccion3));
        lista.add(new Persona("Julio", "Brito Gonzalez", "44444444D", 30, direccion4));

        System.out.println("Datos cargados en la lista.");
    }

    // Método para listar los datos de las personas en la lista
    public void listar() {
        for (Persona persona : lista) {
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Apellidos: " + persona.getApellidos());
            System.out.println("DNI: " + persona.getDni());
            System.out.println("Edad: " + persona.getEdad());
            Direccion direccion = persona.getDireccion();
            System.out.println("Dirección: " + direccion.getCalle() + ", " + direccion.getCp() + ", " + direccion.getProvincia());
            System.out.println("------------------------------");
        }
    }

    // Método para insertar una nueva persona en la lista
    public void insertar(Persona persona) {
        lista.add(persona);
    }

    // Método para eliminar una persona de la lista según su DNI
    public void eliminar(String dni) {
        for (Persona persona : lista) {
            if (persona.getDni().equals(dni)) {
                lista.remove(persona);
                System.out.println("Persona con DNI " + dni + " eliminada.");
                return;
            }
        }
        System.out.println("Persona con DNI " + dni + " no encontrada.");
    }

    // Método para contar el número de personas en la lista
    public void contar() {
        System.out.println("Número de personas en la lista: " + lista.size());
    }

    // Método para buscar una persona en la lista según su DNI
    public void buscar(String dni) {
        for (Persona persona : lista) {
            if (persona.getDni().equals(dni)) {
                System.out.println("Persona encontrada:");
                System.out.println("Nombre: " + persona.getNombre());
                System.out.println("Apellidos: " + persona.getApellidos());
                System.out.println("DNI: " + persona.getDni());
                System.out.println("Edad: " + persona.getEdad());
                Direccion direccion = persona.getDireccion();
                System.out.println("Dirección: " + direccion.getCalle() + ", " + direccion.getCp() + ", " + direccion.getProvincia());
                return;
            }
        }
        System.out.println("Persona con DNI " + dni + " no encontrada.");
    }

    // Método para ordenar la lista de personas por nombre
    public void ordenar() {
        Collections.sort(lista, new Comparator<Persona>() {
            @Override
            public int compare(Persona personaA, Persona personaB) {
                // Comparar por nombre de manera ascendente
                return personaA.getNombre().compareTo(personaB.getNombre());
            }
        });

        System.out.println("Lista ordenada por nombre.");
    }
}