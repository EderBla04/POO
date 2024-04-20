package Uni4Practicas;

import javax.swing.JOptionPane;

public class Figura1 {
	
	private double base;
	private double altura;
	private double lado;
	private double radio;
	
	static final double pi= 3.1416;
	
	static int op;

	public Figura1(double base, double altura, double lado, double radio) {
		super();
		this.base = base;
		this.altura = altura;
		this.lado = lado;
		this.radio = radio;
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	public double getLado() {
		return lado;
	}

	public double getRadio() {
		return radio;
	}


	
	public static void menu() {
		
		op = Integer.parseInt(JOptionPane.showInputDialog("AREA DE FIGURAS GEOMETRICAS"
				+ "\n 1.-Triangulo"
				+ "\n 2.-Cuadrado"
				+ "\n 3.-Rectangulo"
				+ "\n 4.-Circulo"
				+ "\n 5.-Fin"
				+ "\n Escoger opcion")) ;
		
	
	}
	
	public static void evaluar() {
		
		switch(op) {
		case 1 :
			
			double b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Base"));
			double a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura"));
			
			Triangulo1 t = new Triangulo1(b, a);
			
			JOptionPane.showMessageDialog(null, "El area del triangulo es: "+t.areaTriangulo());
			
			
			break;
			
		case 2: 
			
			double l = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la medida del lado"));
			
			Cuadrado1 c = new Cuadrado1(l);
			
			JOptionPane.showMessageDialog(null, "El area del cuadrado es: "+c.areaCuadrado());
			break;
			
		case 3: 
			
			double b2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Base"));
			double a2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura"));
			
			Rectangulo1 rec = new Rectangulo1(b2, a2); 
			
			JOptionPane.showMessageDialog(null, "El area del rectangulo es: "+rec.areaRectangulo());
			
			break;
			
		case 4: 
			
			double r = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Radio"));
			
			Circulo1 circ = new Circulo1(r);
			
			JOptionPane.showMessageDialog(null, "El area del Circulo es: "+circ.areaCirculo());
			
			break;
			
		case 5:
			
			JOptionPane.showMessageDialog(null, "Hasta Pronto:)");
			break;
			
		default: JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
		break;

		}
		

			
			
		
	
	}
	
	
	
	

}
