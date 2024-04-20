package Uni1Ejemplos;

import java.util.Scanner;

public class Ejemplo1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Galleta galleta1 = new Galleta();
		Galleta galleta2 = new Galleta();
		
		System.out.println("Ingresa el tipo de galleta:");
		galleta1.tipo=sc.nextLine();
		
		System.out.println("Ingresa la forma de la galleta:");
		galleta1.forma=sc.nextLine();
		
		System.out.println("Ingresa el color de la galleta:");
		galleta1.color=sc.nextLine();
		
		galleta2.color="azul";
		galleta2.forma="redonda";
		galleta2.tipo="integral";
		
		galleta1.forma=galleta2.forma;
		
		System.out.println("La galleta tiene forma de="+galleta1.forma);
		galleta1.preparacion1(null);
		
		if(galleta1.forma==galleta2.forma)System.out.println("Son Iguales");
		else System.out.println("No son iguales");		
	}
}
