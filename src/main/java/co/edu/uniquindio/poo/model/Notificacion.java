package co.edu.uniquindio.poo.model;

import javax.swing.*;
import java.time.LocalDate;

public class Notificacion {

//ATRIBUTOS

    private String estado;
    private LocalDate fechaEnvio;

    //REALCIONES
    private Noticia noticia;
    private iTipoNotificacion tipoNotificacion;

    //CONSTRUCTOR


    public Notificacion(String estado, LocalDate fechaEnvio, Noticia noticia, iTipoNotificacion itipoNotificacion) {
        this.estado = estado;
        this.fechaEnvio = fechaEnvio;
        this.noticia = noticia;
        this.tipoNotificacion = tipoNotificacion;
    }

    //SETTERS Y GETTERS


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public Noticia getNoticia() {
        return noticia;
    }

    public void setNoticia(Noticia noticia) {
        this.noticia = noticia;
    }

    public iTipoNotificacion getItipoNotificacion() {
        return tipoNotificacion;
    }

    public void setItipoNotificacion(iTipoNotificacion itipoNotificacion) {
        this.tipoNotificacion = itipoNotificacion;
    }

    //METODO TOSTRING


    @Override
    public String toString() {
        return "Notificacion{" +
                "estado='" + estado + '\'' +
                ", fechaEnvio=" + fechaEnvio +
                ", noticia=" + noticia +
                ", itipoNotificacion=" + tipoNotificacion +
                '}';
    }


    public void enviarNotificacion() {

        tipoNotificacion.enviarNotificacion();

        EstadoNoticia estadoActual =
                tipoNotificacion.obtenerEstado();

        noticia.actualizarEstado(estadoActual);

        this.estado = estadoActual.name();

        JOptionPane.showMessageDialog(
                null,
                "Notificación enviada correctamente\n"
                        + "Estado: " + estado
        );
    }


    public EstadoNoticia obtenerEstado() {

        EstadoNoticia estadoActual =
                tipoNotificacion.obtenerEstado();

        JOptionPane.showMessageDialog(
                null,
                "Estado actual de la noticia: "
                        + estadoActual
        );

        return estadoActual;
    }


    public String generarMensaje() {

        String mensaje =
                tipoNotificacion.generarMensaje()
                        + "\n\nTitulo: "
                        + noticia.getTitulo()
                        + "\nDescripcion: "
                        + noticia.getDescripcion();

        JOptionPane.showMessageDialog(
                null,
                mensaje
        );

        return mensaje;
    }




}
