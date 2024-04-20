package Uni1Ejercicios;

import java.util.Scanner;

public class Ejercicio1_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Cuadrilatero rectangulo = new Cuadrilatero();
		Cuadrilatero cuadrado = new Cuadrilatero();
		Cuadrilatero rombo = new Cuadrilatero();
		
		System.out.println("Ingrese el nombre de la figura");
		cuadrado.nombre=sc.nextLine();
		System.out.println("Ingrese la base de la figura");
		cuadrado.base=sc.nextInt();
		System.out.println("Ingrese la altura de la figura");
		cuadrado.altura=sc.nextInt();
		cuadrado.area1();
		
		
		
		
		System.out.println("Ingrese el nombre de la figura");
		rectangulo.nombre=sc.nextLine();
		System.out.println("Ingrese la base de la figura");
		rectangulo.base=sc.nextInt();
		System.out.println("Ingrese la altura de la figura");
		rectangulo.altura=sc.nextInt();
		rectangulo.area1();
		
		cuadrado.nombre="Cuadrado";
		cuadrado.base=4;
		cuadrado.area2();
		
		rombo.nombre="Rombo";
		rombo.altura=5;
		rombo.base=3;
		rombo.area3();
	}
}
