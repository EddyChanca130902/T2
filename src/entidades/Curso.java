/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.List;

/**
 *
 * @author Gamer
 */
public class Curso {

    private String nombre;
    private List<Turno> turnos;

    public Curso(String nombre, List<Turno> turnos)  {
        this.nombre = nombre;
        this.turnos = turnos;
    }

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
     * @return the turnos
     */
    public List<Turno> getTurnos() {
        return turnos;
    }

    /**
     * @param turnos the turnos to set
     */
    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    public String getMostrarCurso() {
        return this.nombre;
    }

    public void agregarTurno(Turno turno) {
        this.turnos.add(turno);
    }

}
