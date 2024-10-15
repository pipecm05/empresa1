package co.edu.uniquindio.poo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    private Empresa empresa;
    private EventoDeportivo eventoNatacionCompeticion;
    private Atleta atleta1, atleta2;

    @BeforeEach
    public void setUp() {
        // Crear empresa
        empresa = new Empresa("Empresa de Deportes");

        // Crear evento de natación y tipo competición
        eventoNatacionCompeticion = new EventoDeportivo("Campeonato Nacional", "competición", "natación", "España", "Madrid", "2024-10-01");

        // Crear atletas
        atleta1 = new Atleta("Ana", "García", "1993-05-15", "España", "España", "competición", 8);
        atleta2 = new Atleta("Pedro", "Fernández", "1995-09-22", "España", "España", "competición", 6);

        // Agregar atletas al evento
        eventoNatacionCompeticion.agregarParticipante(atleta1);
        eventoNatacionCompeticion.agregarParticipante(atleta2);

        // Agregar evento a la empresa
        empresa.agregarEvento(eventoNatacionCompeticion);
    }

    @Test
    public void testAgregarEvento() {
        // Verificar que el evento se ha agregado correctamente a la empresa
        assertEquals(1, empresa.getEventos().size());
        assertEquals("Campeonato Nacional", empresa.getEventos().get(0).getNombre());
    }

    @Test
    public void testObtenerAtletasNatacionCompeticion() {
        // Obtener los atletas que participan en la competición de natación
        List<Atleta> atletasNatacion = empresa.obtenerAtletasNatacionCompeticion();
        
        // Verificar que la lista contiene los atletas correctos
        assertEquals(2, atletasNatacion.size());
        assertTrue(atletasNatacion.contains(atleta1));
        assertTrue(atletasNatacion.contains(atleta2));
    }
}