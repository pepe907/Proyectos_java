package Biblioteca;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        String titulo, autor;
        boolean disponible;
        int opcion;

        do {
            System.out.println("Biblio teca ");

            System.out.println("\n 1 seguir \n 0 salir ");
            opcion = sc.nextInt();

            if (opcion == 0){
                System.out.println("Saliendo ...");
            }else {
                System.out.println("== Menu ==");
                System.out.println("Biblio teca ");
                System.out.println("\n 2 Agregar libro \n 3 Ver libros \n 4 Prestar Libros " +
                                    "\n 5 Libro devuelto \n 6 Libros devueltos ");

                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion){
                    case 2:
                        System.out.println("Agregar Libro");

                        System.out.print("Titulo: ");
                        titulo = sc.nextLine();

                        System.out.print("Autor: ");
                        autor = sc.nextLine();

                        System.out.print("Disponible: ");
                        disponible = true;

                        biblioteca.agregar(titulo,autor,true);
                    break;

                    case 3:
                        System.out.print("== Ver Libros ==");
                        biblioteca.verLibros();
                    break;

                    case 4:
                        System.out.print("== Prestar Libros ==");

                        System.out.print("Titulo: ");
                        titulo = sc.nextLine();

                        System.out.print("Autor: ");
                        autor = sc.nextLine();

                        biblioteca.prestarLibros(titulo, autor);
                    break;

                    case 5:
                        System.out.print("Titulo: ");
                        titulo = sc.nextLine();

                        System.out.print("Autor: ");
                        autor = sc.nextLine();

                        biblioteca.libroDevuelto(titulo,autor);
                    break;
                }
            }
        }while (opcion != 0);
    }

}
