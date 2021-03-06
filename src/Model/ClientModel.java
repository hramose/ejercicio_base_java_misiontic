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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mario
 */
public class ClientModel {

    Conn conexion = new Conn();

    public int create(Client c) {
        Connection conn = conexion.getConnection();
        String query = "Insert INTO person(nombre, apellidos, identificacion) VALUES (?, ?, ?)";
        try {
            PreparedStatement statmentPerson = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statmentPerson.setString(1, c.getNombre());
            statmentPerson.setString(2, c.getApellidos());
            statmentPerson.setString(3, c.getIdentificacion());
            int result = statmentPerson.executeUpdate();
            if (result > 0) {
                ResultSet generatedKey = statmentPerson.getGeneratedKeys();
                if (generatedKey.next()) {
                    String query2 = "Insert INTO client(celular, correo, id_persona) VALUES (?, ?, ?)";
                    try {
                        PreparedStatement statmentClient = conn.prepareStatement(query2);
                        statmentClient.setString(1, c.getTelefono());
                        statmentClient.setString(2, c.getCorreo());
                        statmentClient.setInt(3, generatedKey.getInt(1));
                        statmentClient.executeUpdate();
                        return 1;
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        return 0;
    }

    public ArrayList<Client> read() {
        Connection conn = conexion.getConnection();
        ArrayList<Client> lista_cientes = new ArrayList();
        String query = "Select * from client INNER JOIN person ON client.id_persona = person.id";
        try {
            PreparedStatement statmentQuery = conn.prepareStatement(query);
            ResultSet resultados = statmentQuery.executeQuery();
            while (resultados.next()) {
                String celular = resultados.getString(2);
                String correo = resultados.getString(3);
                String nombre = resultados.getString(6);
                String apellidos = resultados.getString(7);
                String identificacion = resultados.getString(8);
                Client cliente = new Client(correo, celular, nombre, apellidos, identificacion);
                lista_cientes.add(cliente);
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        return lista_cientes;
    }

    public int update(Client c, String identificacion) {
        Connection conn = conexion.getConnection();
        String query = "UPDATE client INNER JOIN person ON client.id_persona = person.id "
                + "SET client.celular = ?, "
                + "client.correo = ?, "
                + "person.nombre = ?, "
                + "person.apellidos = ? "
                + "WHERE person.identificacion = ?";
        try {
            PreparedStatement newStatement = conn.prepareStatement(query);
            newStatement.setString(1, c.getTelefono());
            newStatement.setString(2, c.getCorreo());
            newStatement.setString(3, c.getNombre());
            newStatement.setString(4, c.getApellidos());
            newStatement.setString(5, identificacion);
            newStatement.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return 0;
    }

    public int delete(String identificacion) {
        Connection conn = conexion.getConnection();
        String query = "DELETE client FROM client INNER JOIN person ON client.id_persona = person.id WHERE person.identificacion = ?";
        try {
            PreparedStatement newStatement = conn.prepareStatement(query);
            newStatement.setString(1, identificacion);
            newStatement.executeUpdate();
            return 1;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return 0;
    }
}
