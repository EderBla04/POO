package Uni2Ejemplos;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejemplo2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> elementos = new ArrayList<String>();
		
		elementos.add("Uno");
		elementos.add("Dos");
		elementos.add("Tres");
		elementos.add("Cuatro");
		elementos.add("Cinco");
		
		Iterator<String>it=elementos.iterator();
		
		while(it.hasNext()) {
			
			String var=it.next();
			
			if(var.equals("Tres"))
				System.out.println("Se encontro el elemento.."+var);
		}
		

	}

}
