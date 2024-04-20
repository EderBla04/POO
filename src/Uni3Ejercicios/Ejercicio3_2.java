package Uni3Ejercicios;

import java.util.Scanner;

public class Ejercicio3_2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Evaluacion numeros = new Evaluacion();
		
		
		while(true) {
		
		
		System.out.println("Ingrese el primer numero");
		int nu1 = 	sc.nextInt();
		System.out.println("Ingrese el segundo numero");
		int nu2 = sc.nextInt();
		
		numeros.Capturar(nu1, nu2);
		numeros.nMayor();
		
		System.out.println("\nLa sumatoria es: "+numeros.Sumatoria());
		int sumat = numeros.Sumatoria();
		
		System.out.println(numeros.evaluar(sumat));
		
		System.out.println("¿Quieres hacerlo otra vez?(1= si, 2=no)");
		int op = sc .nextInt();
		
		if(op==2) break;
		}
		
		System.out.println("Gracias :)");
	}

}
