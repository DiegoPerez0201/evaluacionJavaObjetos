package com.evaluacionjava.evaluacionjava.models;

import java.util.ArrayList;

public class Curso {
    
    public Integer cantidadAlumnos;
    public Double promedioCurso;
    public String nombreProfesor;
    public Integer materias;
    
    //---------------------------------------------------------------CONSTRUCTOR---------------------------------------------------------------------------------------------------

    public Curso() {

    }

    public Curso(Integer cantidadAlumnos, Double promedioCurso, String nombreProfesor, Integer materias) {
        this.cantidadAlumnos = cantidadAlumnos;
        this.promedioCurso = promedioCurso;
        this.nombreProfesor = nombreProfesor;
        this.materias = materias;
    }
    
    //----------------------------------------------------------------GETTER/SETTER------------------------------------------------------------------------------------------------

    public Integer getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public void setCantidadAlumnos(Integer cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public Double getpromedioCurso() {
        return promedioCurso;
    }

    public void setpromedioCurso(Double promedioCurso) {
        this.promedioCurso = promedioCurso;
    }

    public String getnombreProfesor() {
        return nombreProfesor;
    }

    public void setnombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public Integer getmaterias() {
        return materias;
    }

    public void setmaterias(Integer materias) {
        this.materias = materias;
    }

    //-----------------------------------------------------------------TOSTRING----------------------------------------------------------------------------------------------------

    @Override
    public String toString() {
        return "Curso [cantidadAlumnos=" + cantidadAlumnos + ", promedioCurso=" + promedioCurso + ", nombreProfesor=" + nombreProfesor + ", materias=" + materias + "]";
    }

    //-----------------------------------------------------------------FUNCIONES---------------------------------------------------------------------------------------------------

    //Promedio por alumnos:
    public static Double promAlum(ArrayList<Double> notas){
		Double suma = 0.0;
		for (int i = 0; i < notas.size(); i++) {
			suma += notas.get(i);
		}
		return suma/notas.size();
	}
    
}
