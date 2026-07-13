package Veterinaria;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GestorAnimales gestorAnimales = new GestorAnimales();

        String nombre, descripcion, rasa, fisico, temperamento;
        int edad, opcion;

        do {
            System.out.println(" ====== Bienvenido a Veterinaria ====== ");

            System.out.println(" Elige una Opcion");
            System.out.println(" 1 Seguir");
            System.out.println(" 0 Salir ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 0){
                System.out.println(" Saliendo...");
            }else {
                System.out.println(" == Menu ==");

                System.out.println(" \n2 Agregar \n3 Ver");
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion){
                    case 2:
                        System.out.println(" =============================");
                        System.out.println(" Agregar Animal ");
                        System.out.println(" =============================");
                        System.out.println(" Nombre: ");
                        nombre = sc.nextLine();
                        System.out.println(" Descripcion: ");
                        descripcion = sc.nextLine();
                        System.out.println(" Edad: ");
                        edad = sc.nextInt();
                        sc.nextLine();
                        System.out.println(" Rasa: ");
                        rasa = sc.nextLine();
                        System.out.println(" Fisico: ");
                        fisico = sc.nextLine();
                        System.out.println(" Temperamento: ");
                        temperamento = sc.nextLine();
                        System.out.println(" =============================");
                        gestorAnimales.agregarAnimal(nombre,descripcion,edad,rasa,fisico,temperamento);
                    break;

                    case 3:
                        System.out.println(" =============================");
                        System.out.println(" Ver Animales ");
                        System.out.println(" =============================");
                        gestorAnimales.verAnimales();
                    break;
                }
            }
        }while (opcion != 0);
    }
}
