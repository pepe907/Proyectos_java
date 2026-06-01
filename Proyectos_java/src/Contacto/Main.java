package Contacto;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Contactos ct = new Contactos();

        Scanner sc = new Scanner(System.in);

        int opcion;
        String nombre, telefono;
        do {
            System.out.println("== MENU ==");
            System.out.println("1 Agregar Contacto");
            System.out.println("2 Lista de Contacto.Contactos");
            System.out.println("3 Buscar Contacto");
            System.out.println("4 Eliminar Contacto");
            System.out.println("5 Editar Contacto");
            System.out.println("0 Salir");

            opcion = Integer.parseInt(sc.nextLine());

            if (opcion == 0){
                System.out.println("Saliendo....");
            }else {
                switch (opcion){

                    case 1:
                        System.out.println("== Agregar Contacto ==");

                        System.out.print("Nombre: ");
                        nombre = sc.nextLine();

                        System.out.print("Telefono: ");
                        telefono = sc.nextLine();

                        ct.agregar(nombre,telefono);
                    break;

                    case 2:
                        System.out.println("== Lista de Contacto");

                        ct.lista();
                    break;

                    case 3:
                        System.out.println("== Buscar Contacto ==");

                        System.out.print("Nombre: ");
                        nombre = sc.nextLine();

                        ct.buscar(nombre);
                    break;

                    case 4:
                        System.out.println("== Eliminar Contacto ==");

                        System.out.print("Nombre: ");
                        nombre = sc.nextLine();

                        ct.eliminar(nombre);
                    break;

                    case 5:
                        System.out.println("== Editar Contacto ==");

                        System.out.print("Nombre: ");
                        nombre = sc.nextLine();

                        System.out.print("Telefono: ");
                        telefono = sc.nextLine();

                        ct.editar(nombre,telefono);
                    break;
                    default:
                        System.out.println("Error opcion no valida ");
                    break;
                }
            }
        }while (opcion != 0);

        sc.close();
    }
}
