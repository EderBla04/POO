package Uni2Ejemplos;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ejemplo2_1 {
	
	public static void main(String[] args)throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		Productos cliente = new Productos();
		int acum=0;
		
		cliente.menu();
		System.out.println("Ingrese 3 productos\n");
		
		for(int i=0; i<3; i++) {
			System.out.println("Ingrese el producto");
			cliente.setCodigo(Integer.parseInt(bf.readLine()));
			
			if(cliente.getCodigo()<101&&cliente.getCodigo()>107) i--;
		
		System.out.println();
		System.out.println(cliente.buscar(cliente.getCodigo()));
		
		acum=acum+cliente.getPrecio();
		}

		System.out.println("\nEl precio total es: $"+acum);
	}

}
