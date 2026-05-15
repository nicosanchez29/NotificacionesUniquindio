package co.edu.uniquindio.poo.model;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class OficinaPublicaciones {

    //ATRIBUTOS
    private String nombre;
    private String codigo;


    //RELACIONES
    private ArrayList<Noticia> listaNoticias;
    private ArrayList<Notificacion> listaNotificaciones;

    //CONSTRUCTOR

    public OficinaPublicaciones(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.listaNotificaciones = new ArrayList<>();
        this.listaNoticias = new ArrayList<>();
    }




    //SETTERS Y GETTERS


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Noticia> getListaNoticias() {
        return listaNoticias;
    }

    public void setListaNoticias(ArrayList<Noticia> listaNoticias) {
        this.listaNoticias = listaNoticias;
    }

    public ArrayList<Notificacion> getListaNotificaciones() {
        return listaNotificaciones;
    }

    public void setListaNotificaciones(ArrayList<Notificacion> listaNotificaciones) {
        this.listaNotificaciones = listaNotificaciones;
    }

    //METODO TOSTRING


    @Override
    public String toString() {
        return "OficinaPublicaciones{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", listaNoticias=" + listaNoticias +
                ", listaNotificaciones=" + listaNotificaciones +
                '}';
    }

    //CRUD DE NOTIFICACION

    public String agregarNotificacion( Notificacion notificacion) {

        String resultado = "";

        Notificacion notificacionEncontrada =
                buscarNotificacion(notificacion.getEstado());

        if (notificacionEncontrada != null) {

            resultado = "La notificacion ya existe";

        } else {

            listaNotificaciones.add(notificacion);

            resultado = "Notificacion registrada correctamente";
        }

        return resultado;
    }

    public Notificacion buscarNotificacion(String estado) {

        for (Notificacion notificacion : listaNotificaciones){

            if (notificacion.getEstado().equals(estado)){
                return notificacion;
            }
        }
        return null;
    }

    public String actualizarNotificacion (String estado, LocalDate fechaEnvio, Noticia noticia, iTipoNotificacion itipoNotificacion){

        String resultado= "";

        Notificacion notificacionEncontrada = buscarNotificacion(estado);

        if (notificacionEncontrada == null) {
            resultado = "No existe la notificacion al que quieres actualizar";
        } else {

            notificacionEncontrada.setEstado(estado);
            notificacionEncontrada.setFechaEnvio(fechaEnvio);


            resultado = "La notificacion fue actualizada exitosamente";
        }
        return resultado;
    }

    public String eliminarNotificacion(String estado) {

        String resultado = "";

        Notificacion notificacionEncontrada = buscarNotificacion(estado);

        if (notificacionEncontrada != null) {
            getListaNotificaciones().remove(notificacionEncontrada);
            resultado = "Notificacion eliminada";
        } else {

            resultado = "La notificacion que desea eliminar no existe";
        }

        return resultado;
    }

    public void crearNoticia(Noticia noticia) {

        listaNoticias.add(noticia);

        JOptionPane.showMessageDialog(
                null,
                "Noticia agregada correctamente"
        );
    }

    public void enviarNoticia(Noticia noticia) {

        noticia.actualizarEstado(
                EstadoNoticia.ENVIADA
        );

        JOptionPane.showMessageDialog(
                null,
                "Noticia enviada correctamente"
        );
    }

    public void editarNoticia(
            String tituloBuscar,
            String nuevoTitulo,
            String nuevaDescripcion
    ) {

        for (Noticia noticia : listaNoticias) {

            if (noticia.getTitulo()
                    .equalsIgnoreCase(tituloBuscar)) {

                noticia.setTitulo(nuevoTitulo);

                noticia.setDescripcion(
                        nuevaDescripcion
                );

                JOptionPane.showMessageDialog(
                        null,
                        "Noticia editada correctamente"
                );

                return;
            }
        }

        JOptionPane.showMessageDialog(
                null,
                "Noticia no encontrada"
        );
    }

    public String buscarEtiquetaMasUsada() {

        String etiquetaMasUsada = "";

        int mayor = 0;

        for (Noticia noticia1 : listaNoticias) {

            int contador = 0;

            for (Noticia noticia2 : listaNoticias) {

                if (noticia1.getEtiqueta()
                        .equalsIgnoreCase(
                                noticia2.getEtiqueta()
                        )) {

                    contador++;
                }
            }

            if (contador > mayor) {

                mayor = contador;

                etiquetaMasUsada =
                        noticia1.getEtiqueta();
            }
        }

        JOptionPane.showMessageDialog(
                null,
                "Etiqueta más usada: "
                        + etiquetaMasUsada
                        + "\nCantidad: "
                        + mayor
        );

        return etiquetaMasUsada;
    }

    public ArrayList<Noticia> consultarNoticiasPendientes(String palabraClave) {

        ArrayList<Noticia> noticiasPendientes =
                new ArrayList<>();

        for (Noticia noticia : listaNoticias) {

            if (noticia.getEstado() == EstadoNoticia.PENDIENTE && noticia.getTitulo().toLowerCase().contains(
                                    palabraClave.toLowerCase()
                            )) {

                noticiasPendientes.add(noticia);
            }
        }

        JOptionPane.showMessageDialog(
                null,
                "Cantidad de noticias encontradas: "
                        + noticiasPendientes.size()
        );

        return noticiasPendientes;
    }


}
