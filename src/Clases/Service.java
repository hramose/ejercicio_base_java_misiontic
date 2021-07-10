/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaces.validarServicio;
import java.util.Date;

/**
 *
 * @author mario
 */

public class Service implements validarServicio{
    
    private String fecha;
    private Car vehiculo;
    private Driver conductor;
    private int precio_hora;
    private Client usuario;

    public Service(String fecha, Car vehiculo, Driver conductor, int precio_hora, Client usuario) {
        this.fecha = fecha;
        this.vehiculo = vehiculo;
        this.conductor = conductor;
        this.precio_hora = precio_hora;
        this.usuario = usuario;
    }

    
    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the vehiculo
     */
    public Car getVehiculo() {
        return vehiculo;
    }

    /**
     * @param vehiculo the vehiculo to set
     */
    public void setVehiculo(Car vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * @return the conductor
     */
    public Driver getConductor() {
        return conductor;
    }

    /**
     * @param conductor the conductor to set
     */
    public void setConductor(Driver conductor) {
        this.conductor = conductor;
    }

    /**
     * @return the precio_hora
     */
    public int getPrecio_hora() {
        return precio_hora;
    }

    /**
     * @param precio_hora the precio_hora to set
     */
    public void setPrecio_hora(int precio_hora) {
        this.precio_hora = precio_hora;
    }

    /**
     * @return the usuario
     */
    public Client getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Client usuario) {
        this.usuario = usuario;
    }

    @Override
    public void procesarPago(int pago) {
        System.out.println("procesar pago " + pago);
    }

    @Override
    public void validarMedioPago(String medio_pago) {        
        if(medio_pago == "Tarjeta de credito"){
            System.out.println("aceptado");
        }else{
            System.out.println("ingrese otro medio");
        }
    }


   
}
