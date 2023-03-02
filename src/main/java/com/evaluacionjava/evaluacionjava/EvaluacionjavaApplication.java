package com.evaluacionjava.evaluacionjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.xml.SourceHttpMessageConverter;

import com.evaluacionjava.evaluacionjava.models.Curso;
import com.evaluacionjava.evaluacionjava.models.Cursoleng;
import com.evaluacionjava.evaluacionjava.models.Cursomath;

/*
DESCRIPCIÓN DE PASOS A SEGUIR
1. Crear objetos con atributos y herencias.
		- Clase padre: definición de atributos de lo que sería un curso por defecto del colegio.
		- Clase hijos: curso con el que se trabajará.
2. Crear funciones de los objetos.
		- Promedio por alumnos.
		- Guardar arreglo de alumnos.
		- Mejor nota y peor nota y promedio.
3. Datos al ususario (profesor).
		- Solicitar ingreso de notas.
		- Crear menú para que el profesor acceda a las funciones.
 */

 //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
@SpringBootApplication
public class EvaluacionjavaApplication {

	//Promedio por alumnos:
    public static Double promAlum(ArrayList<Double> notas){
		Double suma = 0.0;
		for (int i = 0; i < notas.size(); i++) {
			suma += notas.get(i);
		}
		return suma/notas.size();
	}
	
	/*Función para obtener la mejor y peor nota: hice todo lo que pude, lo siento :(
	public static Double mejorPeor(ArrayList<Double> array){
        		
        ArrayList <Double> arrayNotas = new ArrayList<Double>();
        Double mejor = 0.0;
        
        for (int i = 0; i < arrayNotas.size(); i++){
            
            if(arrayNotas.get(i) > mejor){
                return arrayNotas.get(i);
            }
            if(arrayNotas.get(i) < mejor){
                return mejor;
            }
        }
                       
    }
	*/

public static void main(String[] args) {

System.out.println("------------------------------------------------------------------DATOS AL USUARIO-----------------------------------------------------------------------------");

		Scanner usuario = new Scanner(System.in);

		System.out.print("Ingrese nombre del profesor: ");
		String nomProfe = usuario.next();

		System.out.print("Ingrese cantidad de materias: ");
		Integer cantMaterias = usuario.nextInt();

		System.out.print("Ingrese cantidad de estudiantes: ");
		int cantAlum = usuario.nextInt();

		System.out.print("Ingrese cantidad de notas por alumno: ");
		int cantNotas = usuario.nextInt();

		HashMap <String, ArrayList<Double>> cursoHashMap = new HashMap <String, ArrayList<Double>>();

		for (int i = 1; i <= cantAlum; i++){
			System.out.print("Ingrese nombre de alumno " + i + ": ");
			String nomAlum = usuario.next();

			ArrayList <Double> notasEstudiantes = new ArrayList<Double>();

			for (int x = 1; x <= cantNotas; x++){
				System.out.print("Ingrese nota " + x + " del alumno " + nomAlum + ": ");
				Double notasAlum = usuario.nextDouble();

				notasEstudiantes.add(notasAlum);				
			}

			System.out.println(notasEstudiantes);

			cursoHashMap.put(nomAlum, notasEstudiantes);
			System.out.println(cursoHashMap);
			
		//Promedio por alumno
		Double promedioAlumno = 0.0;
		promedioAlumno = promAlum(notasEstudiantes);
												
		}
		
		//Promedio general
		Double sumaPromedios = 0.0;
			for (String i : cursoHashMap.keySet()){
				sumaPromedios = sumaPromedios + promAlum(cursoHashMap.get(i));
			}
			Double promediogeneral = sumaPromedios / cantAlum;

//--------------------------------------------------------------------------------------HERENCIAS----------------------------------------------------------------------------------
			
			Curso cursoDefecto = new Curso();
			Curso cursoAtributos = new Curso(30, 7.0, "Nombre", 0);
			
System.out.println("------------------------------------------------------------------MENÚ-----------------------------------------------------------------------------------------");
		
		int opcion = 1; 

		while(opcion != 0){

			do{				
				System.out.println("Bienvenid@");
				System.out.println("Escriba 1 si desea obtener el promedio de las notas de cada alumno.");
				System.out.println("Escriba 2 si desea obtener el promedio general del curso.");
				System.out.println("Escriba 3 si desea igresar los datos al curso de matemáticas");
				System.out.println("Escriba 4 si desea igresar los datos al curso de lenguaje");
				System.out.println("Escriba 0 para salir del menú");

				System.out.print("Escriba su opción: ");
				opcion = usuario.nextInt();
				
			}while(opcion < 0 || opcion > 4);

			//Condiciones del menú

			if(opcion == 1){
				for(String i : cursoHashMap.keySet()){
					Double promAlum = promAlum(cursoHashMap.get(i));

					System.out.println("El promedio del estudiante " + i + " es de: " + promAlum);
				}
			}else if(opcion == 2){
				System.out.println("El promedio general del curso fue de: " + promediogeneral);
			}else if(opcion == 3){
				System.out.println("Imgrese cuantas ayudantías se realizan semanalmente: ");
				int ayudantias = usuario.nextInt();
				Cursomath cursomathDefault = new Cursomath();
				Cursomath cursomath = new Cursomath(cantAlum, promediogeneral, nomProfe, cantMaterias, ayudantias);
				System.out.println("Curso de matemáticas: " + cursomath);
			}else if(opcion == 4){
				System.out.println("Imgrese cuantos club de lectura se realizan semanalmente: ");
				int clubLectura = usuario.nextInt();
				Cursoleng cursolengDefault = new Cursoleng();
				Cursoleng cursoleng = new Cursoleng(cantAlum, promediogeneral, nomProfe, cantMaterias, clubLectura);
				System.out.println("Curso de lenguajes: " + cursoleng);
			}else{
				System.out.println("Gracias por su tiempo, hasta luego.");
			}

	}



}

}
