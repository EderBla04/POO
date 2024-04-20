package Uni3Ejemplos;

import java.util.Scanner;

public class Ejemplo3_1 {
	
	public static int num;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int resultado = menu();
		Suma obj = new Suma();
		
		
		if(resultado==1) {
			
			System.out.println("Ingresa el dividiendo");
			int n1 = sc.nextInt();
			System.out.println("Ingresa el divisor");
			int n2= sc.nextInt();
			division(n1, n2);
			
			
		}
		
		else if(resultado==2) {
			
			System.out.println("Dame el numero de la tabla");
			int valor=sc.nextInt();
			String cadena = tabla(valor);
			
			System.out.println(cadena);
						
		}
		
		else if(resultado==3) {
			
			System.out.println("Ingresa el numero");
			num= sc.nextInt();
			System.out.println("La potencia es: "+potencia());
			
		}
		
		else if(resultado==4) {
			
			System.out.println("Ingresa el numero 1");
			obj.setN1(num= sc.nextInt());
			System.out.println("Ingresa el numero 2 ");
			obj.setN2(num= sc.nextInt());
			
			System.out.print("La suma tipo objeto es: ");
			obj.mostrar();
			
			Suma.v1=20;
			Suma.v2=30;
			System.out.println("Suma metodo clase: "+Suma.suma());
			
			
			
		}
	
	
	
	}
	
	public static int potencia() {
		
		
		return (int) Math.pow(num, 2);
		
	}
	
	
	public static String tabla(int valor) {
		String var = "";
		int num;
		
		System.out.println("Tabla:");
		for(int i=1; i<=10; i++ ) {
			
			num=i*valor;
			
			var= var+num+"\n";
					
			
		}
		
		return var;
		
	}
	
	
	
	
	public static int menu() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Division");
		System.out.println("2. Tabla");
		System.out.println("3. potencia");
		System.out.println("4. Datos de tipo objeto");
		System.out.println("Selcciona la opcion;");
		int opcion = sc.nextInt();
		
		return opcion;
		
		
	}
	
	public static void division(int d1, int d2) {
		
		int i=1,resto=0, j=1;
		
		while(i!=0) {
			
			resto=d1-d2;
			
			if(resto>=d2) {
				
				d1=resto;
				j++;
				
			}
			
			else 
				i=0;
			
		}
		
		System.out.println("El cociente es: "+ j);
		
		
		
	}

}
