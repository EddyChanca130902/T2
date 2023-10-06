/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrodeasistencia;

import entidades.Alumno;
import entidades.Asistencia;
import entidades.Curso;
import java.util.ArrayList;
import java.util.List;
import pantallas.JFrameListaAsistencia;

/**
 *
 * @author Gamer
 */
public class RegistroDeAsistencia {

    public static List<Asistencia> sistemaDeAsistencia;
    public static List<Alumno> listaDeAlumnos;
    public static List<Curso> listaDeCursos;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        sistemaDeAsistencia = new ArrayList<>();
        listaDeAlumnos = new ArrayList<>();
        listaDeCursos = new ArrayList<>();
        
        JFrameListaAsistencia frameInicial = new JFrameListaAsistencia();
        frameInicial.setLocationRelativeTo(null);
        frameInicial.setVisible(true);

    }
}
