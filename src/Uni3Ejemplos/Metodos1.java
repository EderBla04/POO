package Uni3Ejemplos;

import javax.swing.JOptionPane;

public class Metodos1 {
	
	private double area1, area2, base, altura, radio, pi=3.1416;
	
	
	public double traingulo() {
		
		return area1 = (base*altura)/2;
		
	}
	
	public double rectangulo () {
		
		return area2=base*altura;
	}
	
	public double circulo() { 
	
		return pi*Math.pow(radio, 2);
	
	}
	
	public double cilindro() {
		
		
		
		
	}
	
	public void leer() {
		
		base=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la base"));
		altura=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la altura"));
		radio= Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del radio"));
		
		
		
	}
	
	public void imprimir() {
		
		
		
		JOptionPane.showMessageDialog(null, "Area Triangulo= "+this.traingulo()+"\n Area rectangulo= "+this.rectangulo()+"\n Area circulo="+this.circulo()+"\n clindro="+this.cilindro());
		
	}
	

	


}
