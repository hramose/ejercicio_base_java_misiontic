/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Clases.Car;
import Clases.Conn;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mario
 */
public class CarModel {

    Conn conexion = new Conn();

    public void Create(Car c) {
        
        Connection conn = conexion.getConnection();
        String query = "INSERT INTO car(color, marca, modelo, kilometraje, placa) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement newStatment = conn.prepareStatement(query);
            newStatment.setString(1, c.getColor());
            newStatment.setString(2, c.getMarca());
            newStatment.setInt(3, c.getModelo());
            newStatment.setInt(4, c.getKilometraje());
            newStatment.setString(5, c.getPlaca());
            newStatment.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error");
        }
    }

    public void Read() {
        System.out.println("Leer carros");
    }

    public void Update(Car c, String placa) {
        System.out.println("Actualizar carro");
    }

    public void Delete(String placa) {
        System.out.println("Eliminar carro");
    }

    public void GetWithColor(String color) {
        System.out.println("carros de un color especifico");
    }
}
