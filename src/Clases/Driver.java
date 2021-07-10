/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author mario
 */
public class Driver extends Person {
    
    private int edad;

    public Driver(int edad, String nombre, String apellidos, String identificacion) {
        super(nombre, apellidos, identificacion);
        this.edad = edad;
    }
    
    //Polimorfismo por sobrescritura
    @Override
    public void saludar(Person p){
        System.out.println("Hola, soy el conductor, mucho gusto, ¿eres "+ p.getNombre() + "?");
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
     
}
