package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<EventoDeportivo> eventos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.eventos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarEvento(EventoDeportivo evento) {
        this.eventos.add(evento);
    }

    public List<EventoDeportivo> getEventos() {
        return eventos;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEventos(List<EventoDeportivo> eventos) {
        this.eventos = eventos;
    }

    public List<Atleta> obtenerAtletasNatacionCompeticion() {
        List<Atleta> atletasNatacionCompeticion = new ArrayList<>();
        for (EventoDeportivo evento : eventos) {
            atletasNatacionCompeticion.addAll(evento.obtenerAtletasNatacionCompeticion());
        }
        return atletasNatacionCompeticion;
    }
}