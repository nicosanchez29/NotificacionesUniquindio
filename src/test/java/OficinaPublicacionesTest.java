import co.edu.uniquindio.poo.model.EstadoNoticia;
import co.edu.uniquindio.poo.model.Noticia;
import co.edu.uniquindio.poo.model.OficinaPublicaciones;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OficinaPublicacionesTest {

    @Test
    public void consultarNoticiasPendientesTest() {

        // ARRANGE

        OficinaPublicaciones oficina =
                new OficinaPublicaciones(
                        "Oficina Central",
                        "OF-001"
                );

        Noticia noticia1 =
                new Noticia(
                        "Evento de tecnologia",
                        "Charla IA",
                        "Tecnologia", EstadoNoticia.PENDIENTE
                );

        Noticia noticia2 =
                new Noticia(
                        "Evento cultural",
                        "Festival universidad",
                        "Cultura", EstadoNoticia.ENVIADA
                );

        Noticia noticia3 =
                new Noticia(
                        "Conferencia robotica",
                        "Robotica avanzada",
                        "Tecnologia", EstadoNoticia.NO_ENVIADA
                );


        noticia2.actualizarEstado(
                EstadoNoticia.ENVIADA
        );

        oficina.crearNoticia(noticia1);
        oficina.crearNoticia(noticia2);
        oficina.crearNoticia(noticia3);

        // ACT

        ArrayList<Noticia> resultado =
                oficina.consultarNoticiasPendientes(
                        "Evento"
                );

        // ASSERT

        assertEquals(1, resultado.size());

        assertEquals(
                "Evento de tecnologia",
                resultado.get(0).getTitulo()
        );
    }
}

