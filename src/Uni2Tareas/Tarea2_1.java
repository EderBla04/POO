package Uni2Tareas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea2_1 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		Electrodomesticos[] Elec = new Electrodomesticos[3];
		
		Elec[0] = new Electrodomesticos("Refrigerador",5390,15);
		Elec[1] = new Electrodomesticos("Microondas",2550,13);
		Elec[2] = new Electrodomesticos("Lavadora",11779,16);
		
		
		System.out.println("Eliga tres productos(1, 2 ,3");
				
		for(int i=0; i<Elec.length; i++) {
			
			Elec[i].Imprimir(i+1);	
			
		}
		
	
		for(int i=0; i<Elec.length;i++) {
			
			System.out.println("Ingrese el numero");
			int n = Integer.parseInt(bf.readLine());
			
			Elec[n-1].comprar();
			System.out.println("Usted compro un "+Elec[n-1].getNombre()+" Con un precio: $"+Elec[n-1].getPrecio()+" y quedan: "+Elec[n-1].getStock());
			
		}
		
		System.out.println("Productos restantes: ");
		for(int j=0; j<Elec.length;j++) {
			
			
			Elec[j].Imprimir(j+1);
		}		
		
	}

}
