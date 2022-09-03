/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

/**
 *
 * @author Usuario
 */
import java.sql.Connection; //importando la dependica para la coneccion
import java.sql.DriverManager; //controlador de bd
public class DBConnection {
    //proseso de conexion entre el bac y la BD
    Connection connection; //creando objeto conexion
    static String bd = "movies_rental"; //colocamos el nombre de la bd
    static String port = "3306"; //puerto de la bd, toca revisar en el gertor de bd
    static String login = "root";
    static String password = "admin"; //contraseña de la base de datos    
}
