package co.edu.uniquindio.poo.model;

public class NotificacionPush {

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
}
