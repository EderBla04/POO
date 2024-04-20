package Uni2Practicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Practica2_1 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		Empleado [] empleado = new Empleado[5];
		
		for(int i=0; i<empleado.length;i++) {
			
			System.out.println("Informacion de empleado "+(i+1));
			System.out.println("Ingrese el nombre del empleado: ");
			String nom = bf.readLine();

			
			int hora1, hora2, hora3, hora4;
			do {			
				System.out.println("Ingrese las hora de la semana 1: ");
			 hora1 = Integer.parseInt(bf.readLine());
			}while(hora1<0||hora1>40);
			
			
			do {			
				System.out.println("Ingrese las hora de la semana 2: ");
			 hora2 = Integer.parseInt(bf.readLine());
			 
			}while(hora2<0||hora2>40);
	
			do {			
				System.out.println("Ingrese las hora de la semana 3: ");
			 hora3 = Integer.parseInt(bf.readLine());
			}while(hora3<0||hora3>40);
		
			do {			
				System.out.println("Ingrese las hora de la semana 4: ");
			 hora4 = Integer.parseInt(bf.readLine());
			}while(hora4<0||hora4>40);


			
			
			empleado[i] = new Empleado(nom,String.valueOf(i+1), String.valueOf(hora1),String.valueOf(hora2),String.valueOf(hora3),String.valueOf(hora4)) ;
					
			 
		}
		
		for(int i=0; i<empleado.length; i++) {
			
			System.out.println(empleado[i].toString());
		}
		
        int totalPagos = Empleado.pagoTotal(empleado);
        Empleado empleadoConMasHoras = Empleado.empleadoChambeador(empleado);

        System.out.println("\nResumen:");
        System.out.println("Total de pagos para todos los empleados: $" + totalPagos);
        System.out.println("Empleado que trabajó más horas:\n" + empleadoConMasHoras.toString());

		
		
	}

}
