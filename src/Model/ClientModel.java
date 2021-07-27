/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Clases.Client;
import Clases.Conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mario
 */
public class ClientModel {

    Conn conexion = new Conn();

    public void create(Client c) {
        Connection conn = conexion.getConnection();
        String query = "Insert INTO person(nombre, apellidos, identificacion) VALUES (?, ?, ?)";
        try {
        PreparedStatement statmentPerson = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        statmentPerson.setString(1, c.getNombre());
        statmentPerson.setString(2, c.getApellidos());
        statmentPerson.setString(3, c.getIdentificacion());
        int result = statmentPerson.executeUpdate();
        System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public void read() {
        System.out.println("leer clientes");
    }

    public void update() {
        System.out.println("actualizar clientes");
    }

    public void delete() {
        System.out.println("eliminar cliente");
    }
}
