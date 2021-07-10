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
public abstract class Pay {
    
    public abstract void calcularPago();
    
    public void recibirEfectivo(int valor){
        System.out.println("Recibi " + valor);
    }
    
}
