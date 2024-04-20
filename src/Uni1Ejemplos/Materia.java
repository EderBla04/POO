package Uni1Ejemplos;

public class Materia {
	
	private char grupo;
	private int nestudiantes;
	private String nombre;
	private String periodo;
	
	public char getGrupo() {
		return grupo;
	}
	public void setGrupo(char grupo) {
		this.grupo = grupo;
		
		
	}
	
	//toString
	//nombre de la materia
	//carrera
	//periodo pero numerico
	//numero de grupos
	public int ngrupos() {
		int grupos;
		grupo=this.nestudiantes/15;
		return grupos;
		
	}
	
	public String getCarrera() {
		String carrera= "";
		
		if(getGrupo()=='a'|| getGrupo()=='A')
			carrera="Ingenieria en Sistemas Computacionales";
			else if(this.grupo=='c'|| this.grupo=='C')
				carrera="Ingenieria Civil";
			else if(this.grupo=='w'|| this.grupo=='W')
				carrera="Ingenieria Geomatica";
			else if(this.grupo=='d'|| this.grupo=='D')
				carrera="Ingenieria Industrial y de Sistemas";
			else if(this.grupo=='k'|| this.grupo=='K')
				carrera="Ingenieria en negocios";
			else System.out.println("incorrecto");
		        
		
			
		
	}
	
	
	
	public int getNestudiantes() {
		return nestudiantes;
	}
	public void setNestudiantes(int nestudiantes) {
		this.nestudiantes = nestudiantes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		if(periodo.equalsIgnoreCase("primavera"))
			this.periodo="2024-1";
		
		else if(periodo.equalsIgnoreCase("verano"))
		    this.periodo="2024-2";
		
		else if(periodo.equalsIgnoreCase("verano"))
			this.periodo="2024-3";
		
		else
			System.out.println("periodo incorrecto");
		
		
	}
	
	@Override
	public String toString() {
		return "Materia [grupo=" + grupo + ", nestudiantes=" + nestudiantes + ", nombre=" + nombre + ", periodo="
				+ periodo + "]";
	}
	
	

}
