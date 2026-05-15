package co.edu.uniquindio.poo.model;

import javax.swing.*;
import java.util.ArrayList;

public class Noticia {

    //ATRIBUTOS

    private String titulo;
    private String descripcion;
    private String etiqueta;

    //RELACIONES
    private EstadoNoticia estado;

    //CONSTRUCTOR

    public Noticia(String titulo, String descripcion, String etiqueta, EstadoNoticia estado) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.etiqueta = etiqueta;
        this.estado = estado;
    }


    //SETTERS Y GETTERS


    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

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
                ", etiqueta='" + etiqueta + '\'' +
                ", estado=" + estado +
                '}';
    }

    public void actualizarEstado(
            EstadoNoticia estado
    ) {

        this.estado = estado;

        JOptionPane.showMessageDialog(
                null,
                "Estado actualizado a: "
                        + estado
        );
    }
}
