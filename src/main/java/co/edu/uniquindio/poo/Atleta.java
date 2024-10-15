package co.edu.uniquindio.poo;

class Atleta extends Participante {
    private int experiencia;

    public Atleta(String nombre, String apellidos, String fechaNacimiento, String nacionalidad, String paisRepresentacion, String tipoParticipacion, int experiencia) {
        super(nombre, apellidos, fechaNacimiento, nacionalidad, paisRepresentacion, tipoParticipacion);
        this.experiencia = experiencia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
}
