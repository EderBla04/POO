package Uni2Ejemplos;

import java.util.ArrayList;
import java.util.Collections;

public class Ejemplo2_7 {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer>valores = new ArrayList<>();
		
		valores.add(6);
		valores.add(2);
		valores.add(8);
		valores.add(0, 20);
		valores.add(3);
		
		System.out.println(valores);
		
		Collections.sort(valores);
		System.out.println(valores);
		
		Collections.reverse(valores);
		System.out.println(valores);
		
		
	}

}
