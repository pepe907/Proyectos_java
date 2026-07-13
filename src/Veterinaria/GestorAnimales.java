package Veterinaria;

import java.util.ArrayList;

public class GestorAnimales {
    ArrayList<Animales> animales = new ArrayList<>();

    public void agregarAnimal(String nombre, String descripcion, int edad, String rasa, String fisico, String temperamento){
        for (Animales a : animales){
            if (a.getNombre().equals(nombre)){
                System.out.println("Animal ya Registrado");
                return;
            }
        }
        System.out.println("Animal Agregado");
        animales.add(new Animales(nombre,descripcion,edad,rasa,fisico,temperamento));
    }

    public void verAnimales(){
        for (int a = 0; a < animales.size(); a ++){
            Animales n = animales.get(a);
            System.out.println(" Nombre: " + n.getNombre());
            System.out.println(" Descripcion: " + n.getDescripcion());
            System.out.println(" Edad: " + n.getEdad());
            System.out.println(" Rasa: " + n.getRasa());
            System.out.println(" Fisico: " + n.getFisico());
            System.out.println(" Temperamento: " + n.getTemperamento());
            System.out.println(" =============================");
        }
    }
}
