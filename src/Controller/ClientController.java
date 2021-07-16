/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ClientModel;

/**
 *
 * @author mario
 */
public class ClientController {
    ClientModel modelo = new ClientModel();

    public ClientController() {
        
        modelo.create();
        modelo.read();
    }
    
    
}
