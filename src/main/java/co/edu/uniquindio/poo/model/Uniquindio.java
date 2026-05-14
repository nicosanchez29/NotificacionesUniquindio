package co.edu.uniquindio.poo.model;

public class Uniquindio {

    //ATRIBUTOS

    private String nombre;

    //RELACIONES
    private OficinaPublicaciones oficinaPublicaciones;

    //CONSTRUCTOR


    public Uniquindio(String nombre, OficinaPublicaciones oficinaPublicaciones) {
        this.nombre = nombre;
        this.oficinaPublicaciones = oficinaPublicaciones;
    }

    //SETTERS Y GETTERS


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public OficinaPublicaciones getOficinaPublicaciones() {
        return oficinaPublicaciones;
    }

    public void setOficinaPublicaciones(OficinaPublicaciones oficinaPublicaciones) {
        this.oficinaPublicaciones = oficinaPublicaciones;
    }

    //METODO TOSTRING


    @Override
    public String toString() {
        return "Uniquindio{" +
                "nombre='" + nombre + '\'' +
                ", oficinaPublicaciones=" + oficinaPublicaciones +
                '}';
    }

    //CRUD DE OFICINA DE PUBLICACIONES
}
