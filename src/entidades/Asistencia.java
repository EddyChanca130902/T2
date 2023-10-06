/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Gamer
 */
public class Asistencia {

    private Alumno alumno;
    private Curso curso;
    private Turno turno;

    public Asistencia(Alumno alumno, Curso curso, Turno turno) {
        this.alumno = alumno;
        this.curso = curso;
        this.turno = turno;
    }

    /**
     * @return the alumno
     */
    public Alumno getAlumno() {
        return alumno;
    }

    /**
     * @param alumno the alumno to set
     */
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    /**
     * @return the curso
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    /**
     * @return the turno
     */
    public Turno getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public String mostrarDatos(){
        return this.getAlumno().getNombre() + " " 
                + this.getAlumno().getApellido() + "  "
                + this.getAlumno().getAsistenciaAlumno() + " | Curso: "
                + this.getCurso().getNombre();
    }
}
