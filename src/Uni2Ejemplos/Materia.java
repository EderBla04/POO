package Uni2Ejemplos;

public class Materia {
	
	private Alumno[] alumnos;
	
	public Materia(Alumno [] alumnos) {
		// TODO Auto-generated constructor stub
		this.alumnos=alumnos;
	}
	
	public String getPromediogral(){
		double prom=0;
		
		for(int i=0; i<alumnos.length;i++) {
			
			prom=prom+ Double.parseDouble(alumnos[i].getPromedio());
			
		}
		prom=prom/3;
		
		
		//calcular el promedio del grupo
		//invocar el metodo getpromedio de la clase Alumno
		//Alumno
		//devolver en String
		
		
	
		return String.valueOf(prom);
		
	}

}
