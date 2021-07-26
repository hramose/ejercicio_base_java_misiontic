/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import Clases.*;
import Model.CarModel;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car carro = new Car("Gris", "Mazda", 2010, 150000, "POP461");
       CarModel carmodel = new  CarModel();
       carmodel.Create(carro);

    }

}
