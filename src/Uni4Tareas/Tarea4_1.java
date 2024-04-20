package Uni4Tareas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Tarea4_1 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Hamburguesas Blanco");
		do {
			
		Ventas.menu();
		
			
		
		Ventas.op = Integer.parseInt(bf.readLine());
		
		
        if (Ventas.op < 6) {
            System.out.println("Ingrese la cantidad");
            int c = Integer.parseInt(bf.readLine());
            Ventas.venta(c);
          
            
        }
        
        else if(Ventas.op>7) System.out.println("Opcion invalida");
		
		
		}while(Ventas.op != 6);
		
		
		
		System.out.println("El total fue de: $"+Ventas.imprimirTotal()+" pesos");
		System.out.println("Hasta luego");
		
  }
	
}
