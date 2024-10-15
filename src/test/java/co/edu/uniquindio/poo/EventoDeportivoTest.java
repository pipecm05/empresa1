package co.edu.uniquindio.poo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EventoDeportivoTest {
    
    private EventoDeportivo eventoNatacionCompeticion;
    private Atleta atleta1, atleta2, atleta3;

    @BeforeEach
    public void setUp() {
        // Crear evento de natación y tipo competición
        eventoNatacionCompeticion = new EventoDeportivo("Campeonato Nacional", "competición", "natación", "España", "Madrid", "2024-10-01");

        // Crear atletas
        atleta1 = new Atleta("Juan", "Pérez", "1990-05-20", "España", "España", "competición", 5);
        atleta2 = new Atleta("María", "López", "1992-07-12", "España", "España", "competición", 7);
        atleta3 = new Atleta("Carlos", "Martínez", "1988-03-14", "España", "España", "competición", 10);

        // Agregar atletas al evento de natación
        eventoNatacionCompeticion.agregarParticipante(atleta1);
        eventoNatacionCompeticion.agregarParticipante(atleta2);
        eventoNatacionCompeticion.agregarParticipante(atleta3);
    }

    @Test
    public void testAgregarParticipante() {
        // Verificar que los participantes se agregaron correctamente
        assertEquals(3, eventoNatacionCompeticion.getParticipantes().size());
    }

    @Test
    public void testObtenerAtletasNatacionCompeticion() {
        // Obtener los atletas de la competición de natación
        List<Atleta> atletas = eventoNatacionCompeticion.obtenerAtletasNatacionCompeticion();
        
        // Verificar el número de atletas en el evento de natación
        assertEquals(3, atletas.size());
        
        // Verificar que los atletas correctos están en la lista
        assertTrue(atletas.contains(atleta1));
        assertTrue(atletas.contains(atleta2));
        assertTrue(atletas.contains(atleta3));
    }
}