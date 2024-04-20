package Uni1Ejercicios;

import java.util.Scanner;

public class prueba {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Cuadrilatero rectangulo = new Cuadrilatero();
		Cuadrilatero cuadrado = new Cuadrilatero();
		Cuadrilatero rombo = new Cuadrilatero();
		
		System.out.println("Ingrese el nombre de la figura");
		rectangulo.nombre=sc.nextLine();
		System.out.println("Ingrese la base de la figura");
		rectangulo.base=sc.nextInt();
		System.out.println("Ingrese la altura de la figura");
		rectangulo.altura=sc.nextInt();
		rectangulo.area=rectangulo.base*rectangulo.altura;
		rectangulo.area1();
		
		System.out.println("Ingrese el nombre de la figura");
		rectangulo.nombre=sc.nextLine();
		System.out.println("Ingrese la base de la figura");
		rectangulo.base=sc.nextInt();
		rectangulo.area=rectangulo.base*rectangulo.base;
		rectangulo.area2();
		
		System.out.println("Ingrese el nombre de la figura");
		rectangulo.nombre=sc.nextLine();
		System.out.println("Ingrese la base(d) de la figura");
		rectangulo.base=sc.nextInt();
		System.out.println("Ingrese la altura(D) de la figura");
		rectangulo.altura=sc.nextInt();
		rectangulo.area=rectangulo.base*rectangulo.altura/2;
		rectangulo.area3();