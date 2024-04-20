package Uni1Practicas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transporte {
	
	private String nombre;
	private String ruta;
	private int asiento;
	private String fyh;
	private double costo;
	
	
	public String getNombre() {
		return nombre;
		
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRuta() {
		return ruta;
	}
	public void setRuta(int ruta) {
		if(ruta==1)this.ruta="CDMX";
		else if(ruta==2)this.ruta="Monterrey";
		else if(ruta==3)this.ruta="Guadalajara";
		
	}
	public int getAsiento() {
		return asiento;
	}
	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}
	public String getFyh() {
		return fyh;
	}
	public void setFyh() {
	
		Date ahora = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
		
		this.fyh=formato.format(ahora);	
	}
	
	public double getCosto() {
		return costo;
	}
	public void setCosto( int edad, int tipo, int c) {
		
		int cdmx = 1800;
		int monterrey = 1500;
		int guadalajara = 2000;
		
		
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
	
	

}
