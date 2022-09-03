/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.sql.Date;//importar fehca y hora como sql

/**
 *
 * @author Usuario
 */
public class Alquiler {
    //atributos de la tabla alquiler en la BD 
    private int id;
    private String username;
    private Date fecha;
    //datos dicionales no estan en la tabla pero la necesitamos para mostrar esos datos
    private boolean novedad;
    private String genero;
    
// contructor 
    public Alquiler(int id, String username, Date fecha, boolean novedad, String genero) {
        this.id = id;
        this.username = username;
        this.fecha = fecha;
        this.novedad = novedad;
        this.genero = genero;
    }
    //getters y setter 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isNovedad() {
        return novedad;
    }

    public void setNovedad(boolean novedad) {
        this.novedad = novedad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    // tostring()

    @Override
    public String toString() {
        return "Alquiler{" + "id=" + id + ", username=" + username + ", fecha=" + fecha + ", novedad=" + novedad + ", genero=" + genero + '}';
    }
    
    
    
    
}
