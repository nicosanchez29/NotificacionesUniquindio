package co.edu.uniquindio.poo.model;

public class NotificacionEmail {

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
}
