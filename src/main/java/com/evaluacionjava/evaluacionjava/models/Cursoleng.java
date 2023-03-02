package com.evaluacionjava.evaluacionjava.models;

import java.util.ArrayList;

public class Cursoleng {

    public Integer cantidadAlumnos;
    public Double promedioCurso;
    public String nombreProfesor;
    public Integer materias;
    public Integer clubLectura;
    
    //---------------------------------------------------------------CONSTRUCTOR---------------------------------------------------------------------------------------------------

    public Cursoleng() {

    }

    public Cursoleng(Integer cantidadAlumnos, Double promedioCurso, String nombreProfesor, Integer materias,
            Integer clubLectura) {
        this.cantidadAlumnos = cantidadAlumnos;
        this.promedioCurso = promedioCurso;
        this.nombreProfesor = nombreProfesor;
        this.materias = materias;
        this.clubLectura = clubLectura;
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

    public Integer getClubLectura() {
        return clubLectura;
    }

    public void setClubLectura(Integer clubLectura) {
        this.clubLectura = clubLectura;
    }

    //-----------------------------------------------------------------TOSTRING----------------------------------------------------------------------------------------------------

    @Override
    public String toString() {
        return "Cursoleng [cantidadAlumnos=" + cantidadAlumnos + ", promedioCurso=" + promedioCurso
                + ", nombreProfesor=" + nombreProfesor + ", materias=" + materias + ", clubLectura=" + clubLectura
                + "]";
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
