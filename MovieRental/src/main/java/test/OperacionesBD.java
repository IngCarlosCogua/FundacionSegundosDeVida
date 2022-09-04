package test;


import beans.Pelicula;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {
    //metodo principal de ejecucion 
    public static void main(String[] args){
        actualizarPelicula(1, "MAgico/Cambio");//testeo de actualizacion
        listarPelicula(); //testeo de listado
    
    }
    
    //========================UPDATE==============================================
    public static void actualizarPelicula(int id, String genero){
    
        DBConnection con = new DBConnection();
        String sql="UPDATE pelicula SET genero ='"+genero+"'WHERE id="+id;
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
    //======================VIEW===============================================
      public static void listarPelicula(){
    
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM pelicula"; //sentencia SQL
        // control errores
        try {
            //validano la sentencia 
            Statement st = con.getConnection().createStatement();//Conexion
            ResultSet rs = st.executeQuery(sql);
            //-----
           while (rs.next()) {
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String genero = rs.getString("genero");
                String autor = rs.getString("autor");
                int copias = rs.getInt("copias");
                boolean novedad = rs.getBoolean("novedad");
                
                Pelicula peliculas = new Pelicula(id, titulo, genero, autor, copias, novedad);
                System.out.println(peliculas.toString());
                    
            }
            
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        finally{
            con.desconectar();
        }//despues de conectarse poder desconectarse
    }
    
    
}
