package co.edu.uniquindio.poo.model;

import javax.swing.*;

public class NotificacionPush implements iTipoNotificacion{

    //ATRIBUTOS
    private String idDispositivo;


    //CONSTRUCTOR
    public NotificacionPush(String idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    //SETTERS Y GETTERS


    public String getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(String idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    //METODO TOSTRING


    @Override
    public String toString() {
        return "NotificacionPush{" +
                "idDispositivo='" + idDispositivo + '\'' +
                '}';
    }

    @Override
    public void enviarNotificacion() {

        JOptionPane.showMessageDialog(
                null,
                "Notificación PUSH enviada al dispositivo:\n"
                        + idDispositivo
        );
    }


    @Override
    public EstadoNoticia obtenerEstado() {

        JOptionPane.showMessageDialog(
                null,
                "Estado: ENVIADA"
        );

        return EstadoNoticia.ENVIADA;
    }


    @Override
    public String generarMensaje() {

        String mensaje =
                "Mensaje generado por PUSH";

        JOptionPane.showMessageDialog(
                null,
                mensaje
        );

        return mensaje;
    }

}
