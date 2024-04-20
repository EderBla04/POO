package Uni2Ejemplos;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejemplo2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList elementos = new ArrayList();
		
		elementos.add("Cadena");
		elementos.add(38);
		elementos.add(3.6);
		elementos.add('x');
		
		Iterator<Object>it=elementos.iterator();
		
		while(it.hasNext()) {
			
			Object var=it.next();
			System.out.println("El valor de tipo--> "+var.getClass());
			
		}
		

	}

}
