package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Noticia {

    //ATRIBUTOS

    private String titulo;
    private String descripcion;

    //RELACIONES
    private ArrayList<String> listaEtiquetas;
    private EstadoNoticia estado;

    //CONSTRUCTOR


    public Noticia(String titulo, String descripcion, EstadoNoticia estado) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.listaEtiquetas = new ArrayList<>();
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

    public ArrayList<String> getListaEtiquetas() {
        return listaEtiquetas;
    }

    public void setListaEtiquetas(ArrayList<String> listaEtiquetas) {
        this.listaEtiquetas = listaEtiquetas;
    }

    public EstadoNoticia getEstado() {
        return estado;
    }

    public void setEstado(EstadoNoticia estado) {
        this.estado = estado;
    }

    //METODO TOSTRING


    @Override
    public String toString() {
        return "Noticia{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", listaEtiquetas=" + listaEtiquetas +
                ", estado=" + estado +
                '}';
    }


}
