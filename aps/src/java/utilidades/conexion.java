/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sena
 */
public class conexion {
    
private static conexion instance;
private Connection cnn;

    private conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aps?zeroDateTimeBehavior=convertToNull", "root", "");
        } catch (SQLException e) {
            System.out.println("Error de MySQL: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }

   
    public static conexion saberEstado () {
        if (instance == null) {
            instance = new conexion();
        }
        return instance;
    }
    
     public Connection getCnn() {
        return cnn;
    }
     public void cerrarConexion (){
         instance = null;
     }
}
