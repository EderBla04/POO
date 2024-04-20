package Uni4Ejercicios;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cpersona {
	
	private String id;
	private String nombre;
	
	public Cpersona(String id, String nombre) {
	
		this.id = id;
		this.nombre = nombre;
	}



	@Override
	public String toString() {
		return " Nombre=" + nombre+", Id=" + id ;
	}
	
	public static Estudiante menuEstudiantes() throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingrese el nombre del estudiante");
		String n = bf.readLine();
		System.out.println("Ingrese su id");
		String id = bf.readLine();
		System.out.println("Ingrese su primer calificacion");
		String c1 = bf.readLine();
		System.out.println("Ingrese su segunda calificacion");
		String c2 = bf.readLine();
		System.out.println("Ingrese su tercera calificacion");
		String c3 = bf.readLine();
		
		Estudiante Alum = new Estudiante(id, n, c1,c2,c3);	
		
		return Alum;
	}
	
	public static Profesor menuProfesores() throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingrese el nombre del profesor");
		String n = bf.readLine();
		System.out.println("Ingrese su id");
		String id = bf.readLine();
		System.out.println("Ingres el salario");
		String s = bf.readLine();
		
		Profesor prof = new Profesor(id, n, s);
		
		return prof;
		
	}
	
	
	
	
	
}