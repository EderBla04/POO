package Uni1Tareas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea1_3 {
	
	public static void main(String[] args) throws IOException {
		
		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		Empleo empleado = new Empleo();
		
		System.out.println("Ingrese su nombre");
		empleado.setNombre(bf.readLine());
		System.out.println("Ingrese su actividad");
		empleado.setActividad(bf.readLine());
		System.out.println("1=Profesion");
		System.out.println("2= Oficio");
		System.out.println("Ingrese el tipo de empleo(1 o 2) ");
		empleado.setTipo(bf.readLine());
		System.out.println("Ingrese su año de nacimiento");
		String a=bf.readLine();
		empleado.setEdad(Integer.parseInt(a));
		System.out.println("Ingrese su sexo(m=masculino, f=femenino)");
		empleado.setSexo(bf.readLine().charAt(0));
		
		
		System.out.println(empleado.toString());
		
		
		
	}

}
