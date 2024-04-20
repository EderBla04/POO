package Uni3Tareas;

import java.util.Scanner;

public class Tarea3_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Serie Fibonacci");
		
		do {
		System.out.println("\nIngrese el tamaño de la serie(1-20)");
		int n = sc.nextInt();
		Tamaño.evaluar(n);
		}while(Tamaño.positivo!=true);
		
		Tamaño.imprimirSerie();
	}

}
