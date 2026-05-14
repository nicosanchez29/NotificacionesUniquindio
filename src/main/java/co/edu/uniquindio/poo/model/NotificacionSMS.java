package co.edu.uniquindio.poo.model;

public class NotificacionSMS {


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
}
