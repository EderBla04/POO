package Uni2Ejemplos;

import java.util.ArrayList;

import java.util.Collections;

import javax.swing.JOptionPane;

public class Biblioteca {
	
	//declarar un arraylist tipo libros
	
	private ArrayList<Libro> registro;
	int pos;
	
	//crear metodo constructor donde construyan el Arraylist
	
	public Biblioteca() {
		// TODO Auto-generated constructor stub
		
		this.registro= new ArrayList();
		pos=-1;
	}
	
	public void insertar(Libro datos) {
		pos++;
		registro.add(datos);
		
		
	}
	
	
	//crear una funcion que calcule el total de libros
	public int nLibros() {
		
		int total = 0;
		
		for(int i=0; i<registro.size(); i++) {
			
			total += registro.get(i).getNlibro()	;		
			
		}
		
		return total;
	}
	
	//metodo imprimir
	
	
	//metodo ordenar por numero de tituo
	public void ordenar() {
		
		Collections.sort(registro, (registro1, registro2) -> Integer.compare(registro1.getNlibro(), registro2.getNlibro()));
					
	}
	
	public void imprimir() {
		
		for(Libro o: registro) {
			
			
			System.out.println("NOMBRE DEL LIBRO: "+o.getNombre()+"  Numero :"+o.getNlibro());
			
		}
	}
	
	//metodo listado de titulo de libros
	public void listado() {
		Collections.reverse(registro);
		
		for(Libro o: registro) {
				
			System.out.println(o.getNombre());
			
			
		}
		
	}

}
