/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import Clases.*;
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
        Car carro1 = new Car("Azul", "Ferrari", 2019, 16000, "PIP899");
        Driver conductor = new Driver(34, "Javier", "Lopez", "898945");
        Client cliente = new Client("brad@gmail.com", "898989", "Brad", "Pitt", "989454");
        Service servicio = new Service("2021/07/27", carro1, conductor, 63000, cliente);
        Client cliente2 = new Client("corre2", "7878", "Juan", "Perez", "454545");
      

    }

}
