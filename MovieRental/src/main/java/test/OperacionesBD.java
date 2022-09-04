/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Usuario
 */
//Importaciones para conexion base de datos
import beans.Pelicula;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {
    
    public static void main(String[] args){
    
    }
    
    //funciones 
    public static void actualizarPelicula(int id, String genero){
    
        DBConnection con = new DBConnection();
        String sql = "UPDATE pelicula SET genero = ' " +genero+"'WHEREid"+id;
        // control errores
        try {
            //validano la sentencia 
            Statement st = con.getConnection().createStatement();//Conexion
            st.executeUpdate(sql);
            
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        finally{
            con.desconectar();
        }//despues de conectarse poder desconectarse
    }
    
}
