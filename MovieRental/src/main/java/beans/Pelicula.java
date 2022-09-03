/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author Usuario
 */
public class Pelicula {
    //creando los atributos de la tabla alquiler en el modelo de la bd
    private int id;
    private String titulo;
    private String genero; //los nombres deben ser tal cual los atributos de la base de datos
    private String autor;
    private int copias;
    private boolean novedad;
    
    //generar contructor con todas la variables
    public Pelicula(int id, String titulo, String genero, String autor, int copias, boolean novedad) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.copias = copias;
        this.novedad = novedad;
    }
    //------------ crear get y set ------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public boolean isNovedad() {
        return novedad;
    }

    public void setNovedad(boolean novedad) {
        this.novedad = novedad;
    }
    
    //-----Crear con lcik derecho tostring----validador de campos string ------

    @Override
    public String toString() {
        return "Pelicula{" + "id=" + id + ", titulo=" + titulo + ", genero=" + genero + ", autor=" + autor + ", copias=" + copias + ", novedad=" + novedad + '}';
    }
    
    
    
}
