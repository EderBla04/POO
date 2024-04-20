package Uni1Tareas;

import java.util.Scanner;

public class Tarea1_2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Libros Ingresados y retirados de la biblioteca");
		
		Clibro libro1 = new Clibro();
		Clibro libro2 = new Clibro();
		
		System.out.println("Ingresa el nombre del libro");
		libro1.Nombre=sc.nextLine();
		System.out.println("Ingresa el ID del libro");
		libro1.ID=sc.nextLine();
		System.out.println("Ingresa la fecha de publicacion del libro");
		libro1.Año_Publi=sc.nextLine();
		System.out.println("Nombre de la editorial");
		libro1.Editorial=sc.nextLine();
				
		System.out.println("El siguiente libro: ");
		System.out.println(libro1.Nombre);
		System.out.println(libro1.ID);
		System.out.println(libro1.Año_Publi);
		System.out.println(libro1.Editorial);
		libro1.Ingreso();
		
		System.out.println("Ingresa el nombre del libro");
		libro2.Nombre=sc.nextLine();
		System.out.println("Ingresa el ID del libro");
		libro2.ID=sc.nextLine();
		System.out.println("Ingresa la fecha de publicacion del libro");
		libro2.Año_Publi=sc.nextLine();
		System.out.println("Nombre de la editorial");
		libro2.Editorial=sc.nextLine();
		
		System.out.println("El siguiente libro: ");
		System.out.println(libro1.Nombre);
		System.out.println(libro1.ID);
		System.out.println(libro1.Año_Publi);
		System.out.println(libro1.Editorial);
		libro2.Retiro();		
	}

}
