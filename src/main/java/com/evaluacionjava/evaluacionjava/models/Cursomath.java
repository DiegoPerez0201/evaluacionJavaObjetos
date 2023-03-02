package com.evaluacionjava.evaluacionjava.models;

import java.util.ArrayList;

public class Cursomath {

    public Integer cantidadAlumnos;
    public Double promedioCurso;
    public String nombreProfesor;
    public Integer materias;
    public Integer ayudantias;
    
    //---------------------------------------------------------------CONSTRUCTOR---------------------------------------------------------------------------------------------------

    public Cursomath() {

    }

    public Cursomath(Integer cantidadAlumnos, Double promedioCurso, String nombreProfesor, Integer materias,
            Integer ayudantias) {
        this.cantidadAlumnos = cantidadAlumnos;
        this.promedioCurso = promedioCurso;
        this.nombreProfesor = nombreProfesor;
        this.materias = materias;
        this.ayudantias = ayudantias;
    }
    
    //----------------------------------------------------------------GETTER/SETTER------------------------------------------------------------------------------------------------

    public Integer getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public void setCantidadAlumnos(Integer cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public Double getPromedioCurso() {
        return promedioCurso;
    }

    public void setPromedioCurso(Double promedioCurso) {
        this.promedioCurso = promedioCurso;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public Integer getMaterias() {
        return materias;
    }

    public void setMaterias(Integer materias) {
        this.materias = materias;
    }

    public Integer getAyudantias() {
        return ayudantias;
    }

    public void setAyudantias(Integer ayudantias) {
        this.ayudantias = ayudantias;
    }

    //-----------------------------------------------------------------TOSTRING----------------------------------------------------------------------------------------------------

    @Override
    public String toString() {
        return "Cursomath [cantidadAlumnos=" + cantidadAlumnos + ", promedioCurso=" + promedioCurso
                + ", nombreProfesor=" + nombreProfesor + ", materias=" + materias + ", ayudantias=" + ayudantias + "]";
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
