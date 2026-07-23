package Veterinaria;

import java.util.ArrayList;

public class GestorAnimales {
    private GestorDeMensajes gestor;
    ArrayList<Animales> animales = new ArrayList<>();

    public GestorAnimales(GestorDeMensajes gestor){
        this.gestor = gestor;
    }

    public void agregarAnimal(String nombre, String descripcion, int edad, String rasa, String fisico, String temperamento){
        for (Animales a : animales){
            if (a.getNombre().equals(nombre)){
                gestor.mensaje2();
                return;
            }
        }
        gestor.mensaje1();
        animales.add(new Animales(nombre,descripcion,edad,rasa, fisico,temperamento));
    }

    public void verAnimales(){
        for (Animales n : animales){
            System.out.println(" Nombre: " + n.getNombre());
            System.out.println(" Descripcion: " + n.getDescripcion());
            System.out.println(" Edad: " + n.getEdad());
            System.out.println(" Rasa: " + n.getRasa());
            System.out.println(" Fisico: " + n.getFisico());
            System.out.println(" Temperamento: " + n.getTemperamento());
            System.out.println(" =============================");
        }
    }

    public void buscarAnimales(String nombre, String rasa){
        for (Animales a : animales){
            if (a.getNombre().equals(nombre) && a.getRasa().equals(rasa)){
                System.out.println(" =============================");
                System.out.println(" Animal Encontrado ");
                System.out.println(" =============================");
                System.out.println(" Nombre: " + a.getNombre());
                System.out.println(" Descripción: " + a.getDescripcion());
                System.out.println(" Edad: " + a.getEdad());
                System.out.println(" Rasa: " + a.getRasa());
                System.out.println(" Físico: " + a.getFisico());
                System.out.println(" Temperamento: " + a.getTemperamento());
                System.out.println(" =============================");
                return;
            }
        }
        gestor.mensaje3();
    }

    public void editarAnimales(String nombre, String nuevoNombre){
        for (Animales a : animales){
            if (a.getNombre().equals(nombre)){
                a.setNombre(nuevoNombre);
                System.out.println(" =============================");
                System.out.println(" Nombre: " + a.getNombre());
                System.out.println(" Descripcion: " + a.getDescripcion());
                System.out.println(" Edad: " + a.getEdad());
                System.out.println(" Rasa: " + a.getRasa());
                System.out.println(" Fisico: " + a.getFisico());
                System.out.println(" Temperamento: " + a.getTemperamento());
                System.out.println(" =============================");
                System.out.println(" Nombre Actualizado");
                System.out.println(" =============================");
                return;
            }
        }
        gestor.mensaje3();
    }

    public void eliminarAnimal(String nombre){
        for (Animales a : animales){
            if (a.getNombre().equals(nombre)){
                gestor.mensaje5();
                animales.remove(a);
                return;
            }
        }
        gestor.mensaje4();
    }
}