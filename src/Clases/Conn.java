/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author mario
 */
public class Conn {

    String driver = "com.mysql.jdbc.Driver";
    String user = "root";
    String password = "";
    String url = "jdbc:mysql://localhost:3306/misiontic";
    Connection conexion;

    public Connection getConnection() {
        try {
            Class.forName(driver);
            conexion = (Connection) DriverManager.getConnection(url, user, password);
            if (conexion != null) {
                System.out.println("Conexion exitosa");
            }
        } catch (Exception e) {
            System.out.println("Error en al conexion: " + e.getMessage());

        }
        return conexion;
    }
}
