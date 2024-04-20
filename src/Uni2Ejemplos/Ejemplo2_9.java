package Uni2Ejemplos;

import java.util.ArrayList;

import java.util.Iterator;


public class Ejemplo2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> datos = new ArrayList<Integer>();
		int suma=0;
		
		datos.add(7);
		datos.add(-3);
		datos.add(19);
		datos.add(27);
		datos.add(-8);
		
		Iterator <Integer>it=datos.iterator();
		while(it.hasNext()) {
			
			int var=it.next();
			  if(var<0)
				  it.remove();
			  else 
				  suma=suma+var;
		}
		
		System.out.println(datos);
		System.out.println("Suma= "+suma);
		
		

	}

}
