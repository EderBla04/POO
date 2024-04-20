package Uni2Ejemplos;

import java.util.ArrayList;

import java.util.Collections;

import javax.swing.JOptionPane;

public class Ejemplo2_8 {
	
	public static void main(String[] args) {
		
		
		ArrayList<Libro> libros = new ArrayList<Libro>();
		String nombre="";
		int num=0;
		Libro lib;
		
		Biblioteca valores = new Biblioteca();
		
		do{
		
		nombre=JOptionPane.showInputDialog("Ingrese el nombre del libro").trim();
		if(! nombre.isEmpty()) {
			
			num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el no. de titulo"));
			
			//libros.add(new Libro(nombre, num));
			lib=new Libro ( nombre,num);
			valores.insertar(lib);
			//System.out.println("Se ingreso al array: "+lib.getNombre());
			
			
		}
		}while(! nombre.isEmpty());
		
		//tarea ordenar de forma ascedente por numero de titulos
		
		//expresion lambda
		
		//Collections.sort(libros, (libro1, libro2) -> Integer.compare(libro1.getNlibro(), libro2.getNlibro()));
		
		
		    valores.ordenar();
	
		    System.out.println("Libros ordenados");
			valores.imprimir();
			System.out.println();
			System.out.println("Listado");
			valores.listado();
			
		
		//Realizar una investigacion de las formas para comparar el contenido de un arraylist
		//Utilizar un comprador que no implemente interfaces para ordenar valores tipos objetos que contiene un atributos
		
		
	

			
			
			
		
		
		
	}

}
