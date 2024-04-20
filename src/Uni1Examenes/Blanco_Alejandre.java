package Uni1Examenes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Blanco_Alejandre {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		Datos alumno = new Datos();
		
		System.out.println("Ingrese su nombre completo");
		alumno.setNombre(bf.readLine());
		System.out.println("¿Usted vive en el estado de Tamaulipas?(1= Si, 2=No");
		alumno.setLugar(Integer.parseInt(bf.readLine()));
		System.out.println("¿Estudias una Lincenciatura, Maestria o Doctorado?(1= Si, 2=No)");
		alumno.setCarrera(Integer.parseInt(bf.readLine()));
		System.out.println("¿Eres un estudiante regular?(1= Si, 2=No");
		alumno.setSituacion(Integer.parseInt(bf.readLine()));
		System.out.println("Ingrese el promedio del periodo 1");
		String p1 = bf.readLine();
		System.out.println("Ingrese el promedio del periodo 2");
		String p2 = bf.readLine();
		alumno.setPromedio(Integer.parseInt( p1), Integer.parseInt( p2));
		System.out.println("Ingrese su edad");
		alumno.setEdad(Integer.parseInt(bf.readLine()));
		
		alumno.imprimir();		
		
		
		
		
		
	}

}
