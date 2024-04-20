package Uni3Practicas;

import java.util.ArrayList;
import java.util.Collections;

public class Cpokemon {
	
	public static ArrayList<Cpokemon> campeones = new ArrayList<Cpokemon>();
	

	
	private String id;
	private String nombre;
	private int estado_de_salud=100;
	private String color;
	private int mov;

	
	public Cpokemon(String id, String nombre, String color) {

		this.id = id;
		this.nombre = nombre;
		this.color = color;
	}
	
	

	public String getNombre() {
		return nombre;
	}



	public int getEstado_de_salud() {
		return estado_de_salud;
	}
	
	public void movimientos (int op1) {
		
		int mov1 = 40;
		int mov2= 50;
		int mov3 = 80;
		int mov4=100;
		
		if(op1==1) {
			
			mov = mov1;
			
		}
		
		else if(op1==2) {
			
			mov = mov2;
			
		}
		
		if(op1==3) {
			
			mov = mov3;
			
		}
		
		else if(op1==4) {
			
			mov = mov4;
			
		}
		
		
	}


	public void setEstado_de_salud(int estado_de_salud) {
		this.estado_de_salud = estado_de_salud;
	}

	public int getMov() {
		return mov;
	}
	
	

	
	@Override
	public String toString() {
		return  nombre + ", Id=" + id   + ", Salud=" + estado_de_salud + ", Color=" + color;
	}



	public  static void mostrar() {
		
		int i;
		
		Collections.sort(campeones, (s1, s2) ->  - s2.estado_de_salud-s1.estado_de_salud);
		
		System.out.println("Pokemon ganadores: ");
		for(i=0; i<campeones.size(); i++) {
			
			System.out.println((i+1)+"º Pokemon: "+campeones.get(i).toString());	
		}
	}
	
	
	
	
	
	
	
	


	
	



	
	
	

	

	
	
	
	
	

}
