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
public class Ruta {
    private int id;
    private int origen;
    private int destino;

    public Ruta(int origen, int destino) {
        this.origen = origen;
        this.destino = destino;
    }

    public Ruta(int id, int origen, int destino) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
    }

    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the origen
     */
    public int getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(int origen) {
        this.origen = origen;
    }

    /**
     * @return the destino
     */
    public int getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(int destino) {
        this.destino = destino;
    }
}
