package Uni3Ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3_1 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		Agenda agenda = new Agenda();
		
		System.out.println(agenda.Fyh());
		agenda.menu();
		
		
		System.out.println("Ingrese el nombrde su mascota");
		String n = bf.readLine();
		System.out.println("Ingrese el dia de la semana de la cita");
		String ds = bf.readLine();
		System.out.println("Ingrese la hora de la cita");
		String h= bf.readLine();
		agenda.Agenda(n, ds, h);
		
		System.out.println("Ingrese el servcio");
		int s = Integer.parseInt(bf.readLine());
		
		
		

		
		System.out.println(agenda.toString());
System.out.println(agenda.servicios(s));
		
		
		
		
		
		
	
	
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
