package Uni2Practicas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transporte {

	
	private String nombre;
	private String ruta;
	private int asiento;
	private String fyh;
	private double costo;
	
	public void rutas() {
		
		System.out.println("\nEliga una ruta: ");
		System.out.println("1. Cdmx");
		System.out.println("2. Monterrey");
		System.out.println("3. Guadalajara");	
		
	}
	

	
	public void tipo() {
		
		System.out.println("\nIngrese el tipo de boleto");
		System.out.println("1= Normal, \n2= Estudiante, \n3= Maestro, \n4= Inapam");
	}

	
	public Transporte(String nombre, String aiento, int tipo , int c, int edad ) {
		// TODO Auto-generated constructor stub
		Date ahora = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		this.fyh=formato.format(ahora);	
		
		this.nombre=nombre;
		this.asiento=Integer.parseInt(aiento);
		
		
		int cdmx = 1800;
		int monterrey = 1500;
		int guadalajara = 2000;
		
		if(c==1)this.ruta="CDMX";
		else if(c==2)this.ruta="Monterrey";
		else if(c==3)this.ruta="Guadalajara";
		
		
		if(c==1) {
			if(tipo==1) {this.costo=cdmx;}
			else if(tipo==2) {if(edad>=18) {this.costo= cdmx-cdmx*0.10;}}
			else if(tipo==3) {this.costo=cdmx-cdmx*0.15;}
			else if(tipo==4) {if(edad>=65) {this.costo= cdmx-cdmx*0.50;}}
		}
		
		if(c==2) {
			if(tipo==1) {this.costo=monterrey;}
			else if(tipo==2) {if(edad>=18) {this.costo= monterrey-monterrey*0.10;}}
			else if(tipo==3) {this.costo=monterrey-monterrey*0.15;}
			else if(tipo==4) {if(edad>=65) {this.costo= monterrey-monterrey*0.50;}}
	    }
		
		if(c==3) {
			if(tipo==1) {this.costo=guadalajara ;}
			else if(tipo==2) {if(edad>=18) {this.costo= guadalajara -guadalajara *0.10;}}
			else if(tipo==3) {this.costo=guadalajara -guadalajara *0.15;}
			else if(tipo==4) {if(edad>=65) {this.costo= guadalajara -guadalajara *0.50;}}
			

	}}

	public String Imprimir() {
		return "Boleto [Nombre=" + nombre + ", Destino=" + ruta + ", Asiento=" + asiento + ", Fecha y hora=" + fyh + ", costo=$"
				+ costo  + "]";
	}

	public Transporte() {
		// TODO Auto-generated constructor stub
	}
}
