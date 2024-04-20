package Uni2Tareas;

import java.util.Scanner;

public class Tarea2_2 {
	
	public static void main(String[] args) {
		
	    Albañil albañil = new Albañil();
	    Scanner sc = new Scanner(System.in);


	    System.out.println("Ingrese los trabajos (metros cuadrados de azulejo y piso)");
	    while (true) {
	        System.out.print("Azulejo: ");
	        double mAzulejo = sc.nextDouble();


	        System.out.print("Piso: ");
	        double mPiso = sc.nextDouble();
	        
	        System.out.println("Agregar otro trabajo(1=Si, 2=No)");
	        int n = sc.nextInt();
	        
	        if (n == 2 )  break;
	        

	        albañil.agregarTrabajo(mAzulejo, mPiso);
	    }


	    double montoTotal = albañil.calcularMontoTotal();
	    System.out.println("Monto total ganado: $" + montoTotal);


	    albañil.limpiarTrabajos();
	    
	    //El arraylist esta en la clase Albañil

		
	}
	

}
