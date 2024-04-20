package Uni2Ejemplos;

import java.util.Scanner;

public class Ejemplo2_3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Alumno [] alumno = new Alumno[3];
		
		 for(int i=0; i<alumno.length; i++) {
			 
			 System.out.println("Alumno "+(i+1));
			 System.out.println("Ingrea el nombre del alumno: ");
			 String nom = sc.nextLine();
			 System.out.println("Ingrese la matricula: ");
			 String mat=sc.nextLine();
			 System.out.println("Ingrese calif parcial1: ");
			 String cal1 = sc.nextLine();
			 System.out.println("Ingrese calif parcial2: ");
			 String cal2 = sc.nextLine();
			 System.out.println("Ingrese calif parcial3: ");
			 String cal3 = sc.nextLine();
			 alumno[i] = new Alumno(nom,mat,cal1,cal2,cal3);
	
		 }	 
		 for(int i=0; i<alumno.length;i++) {
			 
			 System.out.println(alumno[i].getAlumno());

		 }
		 
		 Materia materia = new Materia(alumno);
		 System.out.println("Promedio grupal: "+materia.getPromediogral());

	}

}
