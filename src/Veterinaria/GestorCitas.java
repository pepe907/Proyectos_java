package Veterinaria;

import java.util.ArrayList;

public class GestorCitas {
    ArrayList<Citas> citas = new ArrayList<>();

    public void apartarCita(String nombre, int fecha, double precio){
        citas.add(new Citas(nombre, fecha, precio));
    }

    public void cancelarCita(int fecha, int fechaCita){
        for (Citas c : citas){
            if (c.getFecha() == fechaCita){
                citas.remove(c);
                System.out.println("Cita Cancelada");
                return;
            }
        }
        System.out.println("Error no se puede cancelar la Cita");
    }
}
