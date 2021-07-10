/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class Client extends Person {

    private String correo;
    private String telefono;

    public Client(String correo, String telefono, String nombre, String apellidos, String identificacion) {
        super(nombre, apellidos, identificacion);
        this.correo = correo;
        this.telefono = telefono;
    }

    //Polimorfismo por sobrescritura
    @Override
    public void saludar(Person per) {
        System.out.println("Hola, soy el cliente, ¿eres " + per.getNombre() + "?");
    }

    //Polimorfismo por sobrecargar
    public void pagar(int valor) {
        System.out.println("Voy a pagar " + valor + " en efectivo");
    }

    public void pagar(int valor, String medio_pago) {
        System.out.println("Voy a pagar " + valor + " en " + medio_pago);
    }

    public void pagar(int valor, String medio_pago, int bono) {
        System.out.println("Voy a pagar " + valor + " en " + medio_pago + " con un bono de " + bono);
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
