package Uni2Ejercicios;

public class Series {
	
	private String cpu;
	private String monitor;
	private String teclado;
	private String mouse;
	
	public Series(String cpu, String monitor, String teclado, String mouse ) {
		// TODO Auto-generated constructor stub
		this.cpu=cpu;
		this.monitor=monitor;
		this.teclado=teclado;
		this.mouse=mouse;
		
	}

	public String getCpu() {
		return cpu;
	}

	public String getMonitor() {
		return monitor;
	}

	public String getTeclado() {
		return teclado;
	}

	public String getMouse() {
		return mouse;
	}

	@Override
	public String toString() {
		return "Series [cpu=" + cpu + ", monitor=" + monitor + ", teclado=" + teclado + ", mouse=" + mouse + "]";
	}
	
	

}
