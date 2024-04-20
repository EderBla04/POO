package Uni1Practicas;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;


public class Practica1_1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		Transporte pasajero = new Transporte();
		
		System.out.println("Ingrese su nombre completo(MAYUSCULAS)");
		pasajero.setNombre(bf.readLine());
		System.out.println("Ingrese su edad");
		String e = 
		System.out.println("");
		System.out.println("Eliga su destino(1= CDMX, 2=Monterrey, 3=Guadalajara)");
		String r=bf.readLine();
		pasajero.setRuta(Integer.parseInt(r));
		System.out.println("Ingrese el tipo de boleto(1= Normal, 2= Estudiante, 3=Maestro"
				+ " 4=Inapam");
		String t = bf.readLine();
		pasajero.setCosto(Integer.parseInt(e), Integer.parseInt(t), Integer.parseInt(r) );
		System.out.println("");
		System.out.println("Ingrese su numero de asiento(1-40)");
		String n= bf.readLine();
		pasajero.setAsiento(Integer.parseInt(n));
		
		
		
		
		pasajero.setFyh();
		pasajero.setCosto(0, 0, 0);
		System.out.println(pasajero.Imprimir());

	}

}
