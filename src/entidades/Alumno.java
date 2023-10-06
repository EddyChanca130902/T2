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
public class Alumno {

    private String nombre;
    private String apellido;
    private String codigo;
    private String asistenciaAlumno;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the asistenciaAlumno
     */
    public String getAsistenciaAlumno() {
        return asistenciaAlumno;
    }

    /**
     * @param asistenciaAlumno the asistenciaAlumno to set
     */
    public void setAsistenciaAlumno(String asistenciaAlumno) {
        this.asistenciaAlumno = asistenciaAlumno;
    }

    public String getMostrarNombre() {
        return this.nombre;
    }

    public String getMostrarApellido() {
        return " " + this.apellido;
    }

    public String getMostrarCodigo() {
        return " " + this.codigo;
    }
    
    public String getMostrarAsistenciaAlumno() {
        return " " + this.asistenciaAlumno;
    }

}
