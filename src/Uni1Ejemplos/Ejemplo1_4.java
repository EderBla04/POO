package Uni1Ejemplos;

import java.util.Scanner;

public class Ejemplo1_4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Materia mat1 = new Materia();
		
		System.out.println("Ingresa el nombre de la materia");
		mat1.setNombre(sc.nextLine().trim());
		System.out.println("Ingresa el numero de estudiantes");
		mat1.setNestudiantes(sc.nextInt());
		System.out.println("Ingresa el grupo");
		mat1.setGrupo(sc.next().charAt(0));
		sc.nextLine();
		System.out.println("Ingresa el periodo (primavera, verano, otoño)");
		mat1.setPeriodo(sc.nextLine().trim());
		
		System.out.println(mat1.toString());
		
	}
	

	
}
