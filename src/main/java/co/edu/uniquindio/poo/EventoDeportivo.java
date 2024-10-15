package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class EventoDeportivo {
    private String nombre;
    private String tipo;  // "competición", "exhibición", "torneo"
    private String disciplina;
    private String pais;
    private String ciudad;
    private String fechaInicio;
    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    private ArrayList<Participante> participantes;

    public EventoDeportivo(String nombre, String tipo, String disciplina, String pais, String ciudad, String fechaInicio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.disciplina = disciplina;
        this.pais = pais;
        this.ciudad = ciudad;
        this.fechaInicio = fechaInicio;
        this.participantes = new ArrayList<>();
    }

    public void agregarParticipante(Participante participante) {
        this.participantes.add(participante);
    }

    public String getTipo() {
        return tipo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }

    // Método del punto 3
    public List<Atleta> obtenerAtletasNatacionCompeticion() {
        return this.participantes.stream()
                .filter(p -> p instanceof Atleta && this.disciplina.equalsIgnoreCase("natación") && this.tipo.equalsIgnoreCase("competición"))
                .map(p -> (Atleta) p)
                .collect(Collectors.toList());
    }
}