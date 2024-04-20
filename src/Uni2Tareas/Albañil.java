package Uni2Tareas;

import java.util.ArrayList;

public class Albañil {
	
    private ArrayList<Trabajo> trabajosRealizados;

    public Albañil() {
        this.trabajosRealizados = new ArrayList<>();
    }

    public void agregarTrabajo(double metrosAzulejo, double metrosPiso) {
        Trabajo trabajo = new Trabajo(metrosAzulejo, metrosPiso);
        trabajosRealizados.add(trabajo);
    }

    public double calcularMontoTotal() {
        double montototal = 0;
        for (Trabajo o : trabajosRealizados) {
            montototal += o.getCosto();
        }
        return montototal;
    }

    public void limpiarTrabajos() {
        trabajosRealizados.clear();
    }

}
