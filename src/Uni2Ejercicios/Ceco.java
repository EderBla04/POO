package Uni2Ejercicios;

import java.util.ArrayList;

import java.util.Iterator;

public class Ceco {
	
	private String nombre;
	private ArrayList<Area> area = new ArrayList<Area>();
	
	public Ceco(String nombre) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Area> getArea() {
		return area;
	}
	
	public void agregarceco(Area a) {
		
		this.area.add(a);
		
		
	}
	
	public void mostrar() {
		
		System.out.println(getNombre());
		
		Iterator<Area> it1 = area.iterator();
		
		while(it1.hasNext()) {
			
			Area var = it1.next();
			System.out.println(var.getNombre()+ var.getSeries());
		}
		
	}

}
