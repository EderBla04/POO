package Uni2Ejercicios;

import java.util.ArrayList;

public class Area {
	
	private String nombre;
	private ArrayList<Series> series = new ArrayList<Series>();
	
	public Area(String nombre) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Series> getSeries() {
		return series;
	}
	
	public void agregar(Series s) {
		
		this.series.add(s);
		
		
	}
	

}
