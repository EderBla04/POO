package Uni3Ejemplos;

import java.util.Scanner;

public class Ejemplo3_3 {
	
	public static void main(String[] args) {
		


		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese los datos");
		System.out.print("Base: ");
		int base = sc.nextInt();
		System.out.print("Altura: ");
		int altura = sc.nextInt();
		System.out.print("Radio: ");
		double radio = sc.nextInt();
		
		System.out.println("El area del triangulo es: "+Metdos2.triangulo(base, altura));
		System.out.println("El area del rectangulo es: "+Metdos2.rectangulo(base, altura));	
		Metdos2 cir = new Metdos2(radio);
		System.out.println("El area del circulo es: "+cir.circulo());
		System.out.println("El area del clindro es: "+cilindro(radio, altura));	
		System.out.println("Son: "+Metdos2.figura);
	}
	
	public static double cilindro(double radio, double altura) {
		
		 return (2*Metdos2.valorPI*radio*altura)+(2*Metdos2.valorPI*Math.pow(radio, 2));
	}

}
