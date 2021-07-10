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
public class Clientes {
    
    private ArrayList<Client> clientes = new ArrayList<>();
    
    public void Create(Client cliente) {
        getClientes().add(cliente);
    }

    public void Read() {
        for (int i = 0; i < getClientes().size(); i++) {
            System.out.println("nombre: " + getClientes().get(i).getNombre()
                    + "apellidos: " + getClientes().get(i).getApellidos());
        }
    }

    public void Update(int i, Client cliente) {
        getClientes().get(i).setNombre(cliente.getNombre());
        getClientes().get(i).setApellidos(cliente.getApellidos());
        getClientes().get(i).setCorreo(cliente.getCorreo());
    }

    public void Delete(int i) {
        getClientes().remove(i);
    }

    /**
     * @return the clientes
     */
    public ArrayList<Client> getClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(ArrayList<Client> clientes) {
        this.clientes = clientes;
    }
}
