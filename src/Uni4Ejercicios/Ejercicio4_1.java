package Uni4Ejercicios;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;




public class Ejercicio4_1 {
	
	public static void main(String[] args) throws Exception  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Cpersona> registros = new ArrayList<Cpersona>();
		
		int x=1;
		do {
			
			System.out.println("¿Que es lo que desas?");
			System.out.println("1=Registrar estudiantes");
			System.out.println("2=Registrar profesores");
			System.out.println("3=Mostrar informacion");
			System.out.println("4=Salir");
			int op = Integer.parseInt(bf.readLine());
			
			if(op==1) {
				
				registros.add(Cpersona.menuEstudiantes());

				
			}
			
			else if(op==2) {
				
				registros.add(Cpersona.menuProfesores());	

			}
			
			else if(op==3) {
				
				for(Cpersona obj: registros) {
					
					if (obj instanceof Estudiante){
						
						System.out.println(obj.toString());
						
					}
						
					else if(obj instanceof Profesor) {	
						
						System.out.println(obj.toString());		
					}			
				}

			}
			
			else if(op==4) {	
				
				System.out.println("Hasta luego:)");
				x=0;
			}
				
		}while(x==1);
				
	}

}
