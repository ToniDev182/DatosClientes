/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datosclientes;

/**
 *
 * @author Antonio Atienza Cano
 */
// atributos
public class Direccion {

    private String calle;
    private int cp;
    private String provincia;

    // Constructor por defecto 
    public Direccion(String calle, int cp, String provincia) {
        this.calle = calle;
        this.cp = cp;
        this.provincia = provincia;
    }

    // Constructor de copia
    public Direccion(Direccion otraDireccion) {
        this.calle = otraDireccion.calle;
        this.cp = otraDireccion.cp;
        this.provincia = otraDireccion.provincia;
    }

    // Getters y setters
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        if (verificarCalle(calle)) {
            this.calle = calle;
        } else {
            System.out.println("Error: Calle no válida. Debe ser una cadena de caracteres no vacía.");
        }
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        if (verificarCP(cp)) {
            this.cp = cp;
        } else {
            System.out.println("Error: Código Postal no válido. Debe ser un número de 5 dígitos.");
        }
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        if (verificarProvincia(provincia)) {
            this.provincia = provincia;
        } else {
            System.out.println("Error: Provincia no válida. Debe ser una cadena de caracteres no vacía.");
        }
    }

    private boolean verificarCalle(String calle) {
        // Verifica que la calle sea una cadena de caracteres no vacía
        return calle != null && !calle.trim().isEmpty();
    }

    private boolean verificarCP(int cp) {
        // Verifica que el CP sea un número de 5 dígitos
        return String.valueOf(cp).matches("^\\d{5}$");
    }

    private boolean verificarProvincia(String provincia) {
        // Verifica que la provincia sea una cadena de caracteres no vacía
        return provincia != null && !provincia.trim().isEmpty();
    }
}
