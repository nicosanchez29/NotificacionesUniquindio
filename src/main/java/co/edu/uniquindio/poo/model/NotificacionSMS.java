package co.edu.uniquindio.poo.model;

import javax.swing.*;

public class NotificacionSMS implements iTipoNotificacion{


    //ATRIBUTOS
    private String numeroTelefono;

    //CONSTRUCTOR
    public NotificacionSMS(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
        //SETTERS Y GETTERS

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    //METODO TOSTRING

    @Override
    public String toString() {
        return "NotificacionSMS{" +
                "numeroTelefono='" + numeroTelefono + '\'' +
                '}';
    }

    @Override
    public void enviarNotificacion() {

        JOptionPane.showMessageDialog(
                null,
                "SMS enviado al número:\n"
                        + numeroTelefono
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
                "Mensaje generado por SMS";

        JOptionPane.showMessageDialog(
                null,
                mensaje
        );

        return mensaje;
    }
}
