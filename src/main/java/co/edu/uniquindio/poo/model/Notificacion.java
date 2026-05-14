package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Notificacion {

//ATRIBUTOS

    private String estado;
    private LocalDate fechaEnvio;

    //REALCIONES
    private Noticia noticia;
    private iTipoNotificacion itipoNotificacion;

    //CONSTRUCTOR


    public Notificacion(String estado, LocalDate fechaEnvio, Noticia noticia, iTipoNotificacion itipoNotificacion) {
        this.estado = estado;
        this.fechaEnvio = fechaEnvio;
        this.noticia = noticia;
        this.itipoNotificacion = itipoNotificacion;
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
        return itipoNotificacion;
    }

    public void setItipoNotificacion(iTipoNotificacion itipoNotificacion) {
        this.itipoNotificacion = itipoNotificacion;
    }

    //METODO TOSTRING


    @Override
    public String toString() {
        return "Notificacion{" +
                "estado='" + estado + '\'' +
                ", fechaEnvio=" + fechaEnvio +
                ", noticia=" + noticia +
                ", itipoNotificacion=" + itipoNotificacion +
                '}';
    }
}
