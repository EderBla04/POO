package Uni3Ejemplos;

import java.util.ArrayList;
import java.util.Date;
import java.io.*;
import java.text.SimpleDateFormat;

public class Ejemplo3_6 {
	
	public static ArrayList<Productos> list;
	
	public static int monto, np=0;
	
	public static String fyh;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Date ahora = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		fyh = formato.format(ahora);	
		
		ArrayList<String> comprados = new ArrayList<String>();
		
		//ticket de compra
		//la fecha de compra el total de productos
		//el monto total de productos
		int r=-1, i;
		String op="-1";
		
		agregar();
		
		menu();
		
		
		while(op.compareTo("0")!=0) {
		
		System.out.println("Que producto deseas= ");
		int codigo = Integer.parseInt(br.readLine());
		
		for( i=0; i<list.size();i++) {
			
			if(codigo==list.get(i).getId()) {
				
				comprados.add(list.get(i).getNombre()+": $"+list.get(i).getPrecio());
			
				r=0;
				monto+= list.get(i).getPrecio();
				np++;
			}
			
			
		}	
		
	 if(r!=0) {
			
			System.out.println("No esta en el menu...");
			r=-1;
			
		}
		
		System.out.println("¿Deseas continuar comprando?(1=si, 0=no)");
		op=br.readLine();
	 }
		
		System.out.println("Ticket de compra: ");
	   System.out.println(comprados.toString());
		
		System.out.println("El monta total fue de:" + monto+ "\nla cantidad de productos: "+np+ " \nFecha y hora de compra: "+fyh);
	}
	
	public static ArrayList<Productos> agregar(){
		
		list = new ArrayList();
		
		list.add(new Productos(1, 30, "Refresco"));
		list.add(new Productos(2, 40, "papas"));
		list.add(new Productos(3, 60, "hambueguesas"));
		list.add(new Productos(4, 30, "Hot dogs"));
		list.add(new Productos(5, 20, "Agua natural"));
		list.add(new Productos(6, 30, "Nuggets"));
		
		return list;
	}
	
	
	
	public static void menu() {
		
		int i;
		System.out.println("Lista de productos:");
		for(i=0; i<list.size(); i++) {
			
			System.out.println(list.get(i).);
			
		}
	
	}
	

	

}
