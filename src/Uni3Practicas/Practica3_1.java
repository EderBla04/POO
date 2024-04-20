package Uni3Practicas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Uni3Ejemplos.Productos;

public class Practica3_1 {
	

	
	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int op = 0;
		
		System.out.println("Liga Kanto");
		do {
			
			System.out.println("Ingrese el nombre del primer pokemon");
			String n= bf.readLine();
			System.out.println("Ingrese el id");
			String id = bf.readLine();
			System.out.println("Ingrese el  color");
			String c = bf.readLine();
			
			System.out.println("\nIngrese el nombre del segundo pokemon");
			String n2= bf.readLine();
			System.out.println("Ingrese el id");
			String id2 = bf.readLine();
			System.out.println("Ingrese el  color");
			String c2 = bf.readLine();
			
			Cpokemon pok1 = new Cpokemon(id, n, c);
			Cpokemon pok2 = new Cpokemon(id2, n2, c2);
			
			
			System.out.println("\nEliga el movimiento de "+pok1.getNombre()+" (1= Ataque rapido, 2=Placaje, 3=Derribo, 4=Hiperrayo)");
			int op1 = Integer.parseInt(bf.readLine());
			pok1.movimientos(op1);
			System.out.println("\nEliga el movimiento de "+pok2.getNombre()+" (1= Ataque rapido, 2=Placaje, , 3=Derribo, 4=Hiperrayo)");
			int op2 = Integer.parseInt(bf.readLine());
			pok2.movimientos(op2);
			
				
			int daño1= pok2.getEstado_de_salud() - pok1.getMov();
			int daño2= pok1.getEstado_de_salud() - pok2.getMov();
				
			pok2.setEstado_de_salud(daño1);
			pok1.setEstado_de_salud(daño2);
				

		if(pok1.getEstado_de_salud()>pok2.getEstado_de_salud()) {
				
				Cpokemon.campeones.add(pok1);
				System.out.println("El pokemeno ganador es: "+pok1.toString());
				System.out.println("El pokemeno perdedor es: "+pok2.toString());
			}
		
		else if(pok2.getEstado_de_salud()>pok1.getEstado_de_salud()) {
			
			Cpokemon.campeones.add(pok2);
			System.out.println("El pokemeno ganador es: "+pok2.toString());
			System.out.println("El pokemeno perdedor es: "+pok1.toString());
		}		
			System.out.println("¿Quieres continuar?(1=si, 2=no)");
			op = Integer.parseInt(bf.readLine());
				

		}while(op==1);
		
		Cpokemon.mostrar();
		
		
		
	}

}
