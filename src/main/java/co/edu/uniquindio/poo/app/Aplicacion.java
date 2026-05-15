package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.*;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Aplicacion {
    static void main() {
        Uniquindio uniquindio =
                new Uniquindio(
                        "Universidad del Quindio", null
                );

        OficinaPublicaciones oficina =
                new OficinaPublicaciones(
                        "Oficina Central",
                        "OF-001"
                );

        uniquindio.agregarOficinaPublicaciones(
                oficina
        );

        int opcion;

        do {

            String menu =
                    """
                    ===== SISTEMA NOTICIAS UNIQUINDIO =====
                    
                    1. Crear noticia
                    2. Editar noticia
                    3. Enviar noticia
                    4. Consultar noticias pendientes
                    5. Buscar etiqueta más usada
                    6. Ver noticias
                    0. Salir
                    """;

            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog(menu)
            );

            switch (opcion) {

                case 1 -> crearNoticia(oficina);

                case 2 -> editarNoticia(oficina);

                case 3 -> enviarNoticia(oficina);

                case 4 -> consultarPendientes(oficina);

                case 5 -> buscarEtiqueta(oficina);

                case 6 -> verNoticias(oficina);

                case 0 -> JOptionPane.showMessageDialog(
                        null,
                        "Saliendo del sistema"
                );

                default -> JOptionPane.showMessageDialog(
                        null,
                        "Opción inválida"
                );
            }

        } while (opcion != 0);
    }



    public static void crearNoticia(
            OficinaPublicaciones oficina
    ) {

        String titulo =
                JOptionPane.showInputDialog(
                        "Ingrese el título"
                );

        String descripcion =
                JOptionPane.showInputDialog(
                        "Ingrese la descripción"
                );

        String etiqueta =
                JOptionPane.showInputDialog(
                        "Ingrese la etiqueta"
                );

        Noticia noticia =
                new Noticia(
                        titulo,
                        descripcion,
                        etiqueta, EstadoNoticia.ENVIADA
                );

        oficina.crearNoticia(noticia);

        JOptionPane.showMessageDialog(
                null,
                "Noticia creada correctamente"
        );
    }



    public static void editarNoticia(
            OficinaPublicaciones oficina
    ) {

        String tituloBuscar =
                JOptionPane.showInputDialog(
                        "Ingrese el título de la noticia"
                );

        String nuevoTitulo =
                JOptionPane.showInputDialog(
                        "Nuevo título"
                );

        String nuevaDescripcion =
                JOptionPane.showInputDialog(
                        "Nueva descripción"
                );

        oficina.editarNoticia(
                tituloBuscar,
                nuevoTitulo,
                nuevaDescripcion
        );
    }


    public static void enviarNoticia(
            OficinaPublicaciones oficina
    ) {

        String tituloBuscar =
                JOptionPane.showInputDialog(
                        "Ingrese el título de la noticia"
                );

        for (Noticia noticia :
                oficina.getListaNoticias()) {

            if (noticia.getTitulo()
                    .equalsIgnoreCase(tituloBuscar)) {

                String[] opciones = {
                        "EMAIL",
                        "SMS",
                        "PUSH"
                };

                String tipo =
                        (String) JOptionPane.showInputDialog(
                                null,
                                "Seleccione tipo",
                                "Notificación",
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                opciones,
                                opciones[0]
                        );

                iTipoNotificacion notificacionTipo = null;

                switch (tipo) {

                    case "EMAIL" -> {

                        String email =
                                JOptionPane.showInputDialog(
                                        "Ingrese email"
                                );

                        notificacionTipo =
                                new NotificacionEmail(email);
                    }

                    case "SMS" -> {

                        String numero =
                                JOptionPane.showInputDialog(
                                        "Ingrese número"
                                );

                        notificacionTipo =
                                new NotificacionSMS(numero);
                    }

                    case "PUSH" -> {

                        String id =
                                JOptionPane.showInputDialog(
                                        "Ingrese ID dispositivo"
                                );

                        notificacionTipo =
                                new NotificacionPush(id);
                    }
                }

                Notificacion notificacion =
                        new Notificacion(
                                "PENDIENTE",
                                LocalDate.now(),
                                noticia,
                                notificacionTipo
                        );

                notificacion.generarMensaje();

                notificacion.enviarNotificacion();

                return;
            }
        }

        JOptionPane.showMessageDialog(
                null,
                "Noticia no encontrada"
        );
    }


    public static void consultarPendientes(
            OficinaPublicaciones oficina
    ) {

        String palabra =
                JOptionPane.showInputDialog(
                        "Ingrese palabra clave"
                );

        ArrayList<Noticia> pendientes =
                oficina.consultarNoticiasPendientes(
                        palabra
                );

        String mensaje = "";

        for (Noticia noticia : pendientes) {

            mensaje +=
                    "Título: "
                            + noticia.getTitulo()
                            + "\nDescripción: "
                            + noticia.getDescripcion()
                            + "\n\n";
        }

        if (mensaje.isEmpty()) {

            mensaje = "No existen noticias";
        }

        JOptionPane.showMessageDialog(
                null,
                mensaje
        );
    }



    public static void buscarEtiqueta(
            OficinaPublicaciones oficina
    ) {

        String etiqueta =
                oficina.buscarEtiquetaMasUsada();

        JOptionPane.showMessageDialog(
                null,
                "Etiqueta más usada: "
                        + etiqueta
        );
    }

    public static void verNoticias(
            OficinaPublicaciones oficina
    ) {

        String mensaje = "";

        for (Noticia noticia :
                oficina.getListaNoticias()) {

            mensaje +=
                    "Título: "
                            + noticia.getTitulo()
                            + "\nDescripción: "
                            + noticia.getDescripcion()
                            + "\nEstado: "
                            + noticia.getEstado()
                            + "\nEtiqueta: "
                            + noticia.getEtiqueta()
                            + "\n\n";
        }

        if (mensaje.isEmpty()) {

            mensaje = "No hay noticias";
        }

        JOptionPane.showMessageDialog(
                null,
                mensaje
        );
    }
}


