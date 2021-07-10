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
public class Car {
    
    private String color;
    private String marca;
    private int modelo;
    private int kilometraje;
    private String placa;
    private ArrayList<Car> carros = new ArrayList();

    //contructor -> inicializar los atributos de mi clase
    public Car(String color, String marca, int modelo, int kilometraje, String placa) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.placa = placa;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the kilometraje
     */
    public int getKilometraje() {
        return kilometraje;
    }

    /**
     * @param kilometraje the kilometraje to set
     */
    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    private void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the carros
     */
    public ArrayList<Car> getCarros() {
        return carros;
    }

    /**
     * @param carros the carros to set
     */
    public void setCarros(ArrayList<Car> carros) {
        this.carros = carros;
    }
    
    public void Create(Car c) {
        System.out.println("Crear carro");
    }
    
    public void Read() {
        
        System.out.println("Leer carros");
    }
    
    public void Update(String marca, int i) {
        System.out.println("Actualizar carros");
    }
    
    public void Delete(int i) {
        System.out.println("Eliminar Carros");
    }
    
}
