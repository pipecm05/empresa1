package co.edu.uniquindio.poo;

class Participante extends Persona {
    private String paisRepresentacion;
    private String tipoParticipacion;

    public Participante(String nombre, String apellidos, String fechaNacimiento, String nacionalidad, String paisRepresentacion, String tipoParticipacion) {
        super(nombre, apellidos, fechaNacimiento, nacionalidad);
        this.paisRepresentacion = paisRepresentacion;
        this.tipoParticipacion = tipoParticipacion;
    }

    public String getPaisRepresentacion() {
        return paisRepresentacion;
    }

    public void setPaisRepresentacion(String paisRepresentacion) {
        this.paisRepresentacion = paisRepresentacion;
    }

    public String getTipoParticipacion() {
        return tipoParticipacion;
    }

    public void setTipoParticipacion(String tipoParticipacion) {
        this.tipoParticipacion = tipoParticipacion;
    }
    
}