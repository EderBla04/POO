package Uni2Practicas;

public class Empleado {
	
	private String nombre;
	
	private String numeroempleado;
	
	private String hora1, hora2, hora3, hora4;
	
	private String horas;
	
	public Empleado(String nombre, String numeroempleado, String hora1, String hora2, String hora3, String hora4) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		this.numeroempleado=numeroempleado;
		this.hora1=hora1;
		this.hora2=hora2;
		this.hora3=hora3;
		this.hora4=hora4;
		
		int horastotales=Integer.parseInt(hora1)+Integer.parseInt(hora2)+Integer.parseInt(hora3)+Integer.parseInt(hora4);
		this.horas=String.valueOf(horastotales);

	}
	
	public Empleado() {
		// TODO Auto-generated constructor stub
		this.nombre="";
		this.numeroempleado="";
		this.horas="";
		this.hora1="";
		this.hora2="";
		this.hora3="";
		this.hora4="";
	}
	
	public String getPagomensual () {
		
		int pago = (Integer.parseInt(hora1)*80)+(Integer.parseInt(hora2)*80)+(Integer.parseInt(hora3)*80)+(Integer.parseInt(hora4)*80);
		
		return String.valueOf(pago);
	}
	

			
		
	
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", Numero de empleado=" + numeroempleado + ", Horas laboradas= " + horas + ", Pago mensual= $"+this.getPagomensual()+"]" ;
	}
	
    public static Empleado empleadoChambeador(Empleado[] empleados) {
        Empleado empleadoConMasHoras = null;
        int horasMaximas = -1;

        for (Empleado empleado : empleados) {
            int horas = Integer.parseInt(empleado.horas);
            if (horas > horasMaximas) {
                horasMaximas = horas;
                empleadoConMasHoras = empleado;
            }
        }

        return empleadoConMasHoras;
    }

    public static int pagoTotal(Empleado[] empleados) {
        int totalPagos = 0;

        for (Empleado empleado : empleados) {
            totalPagos += Integer.parseInt(empleado.getPagomensual());
        }

        return totalPagos;
    }

}
