package Biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Libros> libro = new ArrayList<>();


    public void agregar(String titulo, String autor, boolean disponible){
        libro.add(new Libros(titulo, autor, disponible));
        System.out.println(" Libro '" + titulo + "' agregado");
    }

    public void verLibros(){

        if (libro.isEmpty()) {
            System.out.println("No hay libros en el sistema.");
            return;
        }
        for (int l = 0; l < libro.size(); l ++){
            Libros li = libro.get(l);
            System.out.println("Título: " + li.getTitulo() + " | Autor: " + li.getAutor() + " | Disponible: " + li.getDisponible());
        }
    }

    public void prestarLibros(String titulo, String autor){
        for (int l = 0; l < libro.size(); l++){
            Libros li = libro.get(l);
            if (li.getTitulo().equals(titulo) && li.getAutor().equals(autor)){
                System.out.println(" Préstamo aceptado para: " + titulo);
                return;
            }
        }
        System.out.println(" No se pudo prestar. El libro no existe o ya está prestado.");
    }

    public void libroDevuelto(String autor, String titulo){
        for (int l = 0; l < libro.size(); l ++){
            Libros li = libro.get(l);
            if (li.getTitulo().equals(titulo) && li.getAutor().equals(autor)){
                System.out.println("Libro devuelto: " + titulo);
                return;
            }
        }
        System.out.println("No se pudo procesar la devolución. Los datos no coinciden.");
    }
}
