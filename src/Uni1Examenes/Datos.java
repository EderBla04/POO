package Uni1Examenes;

public class Datos {
	
	private String Nombre;
	private char Lugar;
	private char Carrera;
	private char Situacion;
	private int Promedio;
	private int edad;
	int pun, pun1, pun2, pun3, pun4, pun5;
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public char getLugar() {
		return Lugar;
	}
	public void setLugar(int op) {
		
		
		switch(op) {
		
		case 1: Lugar='S';
		break;
		case 2: Lugar='N';
		break;
			
		}
		
		if(Lugar=='S') pun1 =1;
		else pun1 = 0;
		
	}
	public char getCarrera() {
		
		
		return Carrera;
	}
	public void setCarrera(int op) {
		
		
		
		if(op==1) pun2 =1;
		else pun2 = 0;
		
	}
	public char getSituacion() {
		return Situacion;
	}
	public void setSituacion(int op) {
		

		
		if(op==1) pun3 =1;
		else pun3 = 0;
		
	}
	public int getPromedio() {
		return Promedio;
	}
	public void setPromedio(int p1, int p2) {
		
		Promedio =(p1+p2)/2;
		
		if(Promedio>=8) pun4=1;
		else pun4=0;
		

		
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		
		if(edad>=18) pun5=1;
		else pun5=0;
		
	}
	
	public void imprimir() {
		
		pun = pun1+pun2+pun3+pun4+pun5;
		

		
		if(pun>=5) System.out.println("Felicidades "+ Nombre + "usted puede tener la beca");
		else System.out.println(Nombre+" no puedes tener la beca");
		
		
		
		
	}
	
	
	
	
	
	
	
	
}


