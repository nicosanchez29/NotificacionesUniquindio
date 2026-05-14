package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class OficinaPublicaciones {

    //ATRIBUTOS
    private String titulo;
    private String descripcion;


    //RELACIONES
    private ArrayList<Noticia> listaNoticias;
    private ArrayList<Notificacion> listaNotificaciones;

    //CONSTRUCTOR


    public OficinaPublicaciones(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.listaNoticias = new ArrayList<>();
        this.listaNotificaciones = new ArrayList<>();
    }

    //SETTERS Y GETTERS


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Noticia> getListaNoticias() {
        return listaNoticias;
    }

    public void setListaNoticias(ArrayList<Noticia> listaNoticias) {
        this.listaNoticias = listaNoticias;
    }

    public ArrayList<Notificacion> getListaNotificaciones() {
        return listaNotificaciones;
    }

    public void setListaNotificaciones(ArrayList<Notificacion> listaNotificaciones) {
        this.listaNotificaciones = listaNotificaciones;
    }

    //METODO TOSTRING


    @Override
    public String toString() {
        return "OficinaPublicaciones{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", listaNoticias=" + listaNoticias +
                ", listaNotificaciones=" + listaNotificaciones +
                '}';
    }


}
