/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Clases.Car;
import Clases.Conn;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mario
 */
public class CarModel {

    Conn conexion = new Conn();

    public int Create(Car c) {
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
            return 1;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return 0;
    }

    public ArrayList<Car> Read() {
        Connection conn = conexion.getConnection();
        ArrayList<Car> lista_carros = new ArrayList();
        String query = "SELECT * FROM car;";
        try {
            PreparedStatement newStatement = conn.prepareStatement(query);
            ResultSet resultados = newStatement.executeQuery();
            while (resultados.next()) {
                String color = resultados.getString(2);
                String marca = resultados.getString(3);
                int modelo = resultados.getInt(4);
                int kilometraje = resultados.getInt(5);
                String placa = resultados.getString(6);
                Car carro = new Car(color, marca, modelo, kilometraje, placa);
                lista_carros.add(carro);
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        return lista_carros;
    }

    public int Update(Car c, String placa) {
        Connection conn = conexion.getConnection();
        String query = "UPDATE car "
                + "SET color = ?, "
                + "marca = ?, "
                + "modelo = ?, "
                + "kilometraje = ? "
                + "WHERE placa = ?";
        try {
            PreparedStatement newStatement = conn.prepareStatement(query);
            newStatement.setString(1, c.getColor());
            newStatement.setString(2, c.getMarca());
            newStatement.setInt(3, c.getModelo());
            newStatement.setInt(4, c.getKilometraje());
            newStatement.setString(5, placa);
            newStatement.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return 0;
    }

    public int Delete(String placa) {
        Connection conn = conexion.getConnection();
        String query = "DELETE FROM car WHERE placa = ?;";
        try {
            PreparedStatement newStatement = conn.prepareStatement(query);
            newStatement.setString(1, placa);
            int result = newStatement.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return 0;
    }

    public void GetWithColor(String color) {
        System.out.println("carros de un color especifico");
    }
}
