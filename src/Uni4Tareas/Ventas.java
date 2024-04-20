package Uni4Tareas;

import java.util.ArrayList;

public class Ventas {
	
	private static ArrayList<Producto> menu = new ArrayList<Producto>();
	private static ArrayList<Double> total = new ArrayList<Double>();
	
	public static int op;


	public static void menu() {
		
		
		Hamburguesas hamburguesa = new Hamburguesas();
		Papas papas = new Papas();
		Refrescos refresco = new Refrescos();
		Malteadas malteada = new Malteadas();
		Nuggets nuggets = new Nuggets();
		
			
		menu.add(hamburguesa);
		menu.add(papas);
		menu.add(refresco);
		menu.add(malteada);
		menu.add(nuggets);
		
		
		
		int i=1;
		
		System.out.println("Por favor eliga una opcion");
		
		for(Producto m: menu) {
			
			System.out.println(i++ +".-"+m.toString());

		}
		
		System.out.println(6+".- Para Salir");
		
		menu.clear();
		
		
		
	}

	
	public static void venta (int cantidad) {
		
		
		
		Hamburguesas hamburguesa = new Hamburguesas();
		Papas papas = new Papas();
		Refrescos refresco = new Refrescos();
		Malteadas malteada = new Malteadas();
		Nuggets nuggets = new Nuggets();
		
		
		
		
		switch(op){
		
		case 1: 
			

			
			total.add(hamburguesa.total(cantidad));
			
			break;
			
			
		
			
		case 2: 
		
			
			total.add(papas.total(cantidad));
			
			break;
			
		case 3: 
	
			
			total.add(refresco.total(cantidad));
			
			
			
			break;
			
		case 4: 
			

			
			total.add(malteada.total(cantidad));
			
			break;
			
		case 5: 

			
			total.add(nuggets.total(cantidad));
			break;
			



		}
		

		

		
	}
	
	public static double imprimirTotal() {
		

		
		double costoTotal = 0;
		
		for(Double t: total) {
			
			costoTotal+= t;
			

		}
		
		return costoTotal;
	}


}
