package Uni2Practicas;

import java.util.ArrayList;
import java.util.Iterator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practica2_2 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		Transporte informacion = new Transporte();
		ArrayList<Transporte> boletos = new ArrayList<Transporte>();
		
		
		while(true) {
		System.out.println("Ingrese su nombre");
		String n = bf.readLine();
		System.out.println("\nIngrese su edad");
		int e= Integer.parseInt(bf.readLine());
		informacion.rutas();
		int c = Integer.parseInt(bf.readLine());
		informacion.tipo();
		int t= Integer.parseInt(bf.readLine());

		String num;	
		do {
			System.out.println("\nIngrese su numero de asiento(1- 44)");
			num=bf.readLine();			
		}while(Integer.parseInt(num)<1||Integer.parseInt(num)>44);
		
		boletos.add(new Transporte(n, num, t, c, e));
		
		System.out.println("\n¿Ingresar otro boleto?(1= Si, 2= No)");
		int op= Integer.parseInt(bf.readLine());
		
		if(op==2) break;
		}
		Iterator<Transporte>it=boletos.iterator();
		
		while(it.hasNext()) {	
			Transporte var=it.next();
			System.out.println(var.Imprimir());
		}	
	}
}