package Uni3Ejemplos;

import java.util.ArrayList;
import java.util.Collections;


public class Ejemplo3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(1);
		num.add(0, 2);
		num.add(5);
		num.add(0 , 3);
		num.add(4);
		num.add(0 , 6);
		
		System.out.println(num.toString());
		System.out.println("ordenamo de manera ascendente...");
		ordenar(num);

	}
	
	public static void ordenar(ArrayList<Integer> valores) {
		int i;
		
		for(i=0; i<valores.size(); i++) {
			
			Collections.sort(valores);
			
			System.out.println(valores.get(i).getClass()+" "+ valores.get(i).toString());
			
		
		
		}
		
	}
		
		
}
