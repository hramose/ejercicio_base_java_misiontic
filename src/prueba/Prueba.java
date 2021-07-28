/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import Clases.*;
import Model.CarModel;
import Model.ClientModel;
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
        
        Client cliente = new Client("javier@mail.com", "314785698", "Javier", "Rodriguez", "90785412");
        ClientModel modelo = new ClientModel();
        modelo.create(cliente);
    }

}
