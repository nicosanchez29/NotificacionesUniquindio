package co.edu.uniquindio.poo.model;

import javax.swing.*;

public class NotificacionEmail implements iTipoNotificacion {

    //ATRIBUTOS

    private String email;

    //CONSTRUCTOR


    public NotificacionEmail(String email) {
        this.email = email;
    }

    //SETTERS Y GETTERS


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //METODO TOSTRING


    @Override
    public String toString() {
        return "NotificacionEmail{" +
                "email='" + email + '\'' +
                '}';
    }

    //METODOS

    @Override
    public void enviarNotificacion() {

        JOptionPane.showMessageDialog(
                null,
                "Correo enviado correctamente a:\n"
                        + email
        );
    }

    // METODO 2
    @Override
    public EstadoNoticia obtenerEstado() {

        JOptionPane.showMessageDialog(
                null,
                "Estado: ENVIADA"
        );

        return EstadoNoticia.ENVIADA;
    }

    // METODO 3
    @Override
    public String generarMensaje() {

        String mensaje =
                "Mensaje generado por EMAIL";

        JOptionPane.showMessageDialog(
                null,
                mensaje
        );

        return mensaje;
    }


}

