package Uni2Ejemplos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejemplo2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Libro> libros = new ArrayList<Libro>();
		libros.add(new Libro("Caperusa", 3));
		libros.add(new Libro("Cujo", 1));
		libros.add(new Libro("It", 6));
		
		Iterator<Libro> it = libros.iterator();
		
		//while(it.hasNext()) {
			
			//Libro var = it.next();
			
			
			//System.out.println("Nombre= "+var.getNombre()+" Numero= "+var.getNlibro());	
		//}
		
		System.out.println("Ingresa el nombre del libro");
		String nombre = sc.nextLine();
		
		while(it.hasNext()) {
			
			Libro vari = it.next();
			
			if(vari.getNombre().equals(nombre)){
				
				System.out.println(vari.getNombre()+" "+vari.getNlibro());
			}
			

			
		}
		

	}

}
