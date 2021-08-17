/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Clases.Aeropuerto;
import Clases.Car;
import Clases.Conn;
import Clases.Ruta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author mario
 */
public class RutaModel {
    
    Conn conexion = new Conn();

    public int Create(Ruta a) {
        Connection conn = conexion.getConnection();
        String query = "INSERT INTO ruta(origen, destino) VALUES (?, ?)";
        try {
            PreparedStatement newStatment = conn.prepareStatement(query);
            newStatment.setInt(1, a.getOrigen());
            newStatment.setInt(2, a.getDestino());
            newStatment.executeUpdate();
            return 1;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return 0;
    }
}
