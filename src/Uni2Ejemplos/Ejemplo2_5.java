package Uni2Ejemplos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Double> dias = new ArrayList<>();
		double dia,suma=0, prom=0;
		for(int i=1;i<=7;i++) {
			System.out.println("Ingresa el consumo del dia ;"+i);
			dia=sc.nextDouble();
			dias.add(dia);
			
			
		}
		
		System.out.println(dias);
		
		for(Double o:dias) {
			
			suma+=o;
			
		}
		
		prom=suma/7;
		
		for(int i=0; i<dias.size(); i++){
			
			
			
		}
		
		
		

		
		
	}

}
