package Uni2Ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejemplo2_2 {
	
	public static void main(String[] args)throws IOException  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		Productos1 [] prod = new Productos1[4];
		
		prod[0]= new Productos1("Cafe del dia");
		prod[0].setCodigo(103);
		prod[0].setPrecio(40);
		
		prod[1] = new Productos1();
		
		prod[2] = new Productos1(104, "Cafe americano", 50);
		
		System.out.println("Ingresa el codigo del producto: ");
		int id=Integer.parseInt(bf.readLine());
		System.out.println("Ingresa el cafe que prefieras");
		String cadena= bf.readLine();
		System.out.println("Ingresa el valor");
		int costo=Integer.parseInt(bf.readLine());
		prod[3]=new Productos1(id, cadena, costo);
		
		for(int i=0; i<prod.length; i++) {
			
			
			
			
		}
		
		
	}

}
