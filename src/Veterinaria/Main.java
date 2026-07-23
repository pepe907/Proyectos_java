package Veterinaria;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GestorDeMensajes gestorDeMensajes = new GestorDeMensajes();
        GestorAnimales gestorAnimales = new GestorAnimales(gestorDeMensajes);
        GestorCitas gestorCitas = new GestorCitas();

        String nombre, descripcion, rasa, fisico, temperamento;
        int edad, opcionMenu, opcionInicio, fecha;

        do {
            System.out.println(" ====== Bienvenido a Veterinaria ====== ");

            System.out.println(" Elige una Opcion");
            System.out.println(" 1 Seguir");
            System.out.println(" 0 Salir ");
            opcionInicio = sc.nextInt();
            sc.nextLine();

            if (opcionInicio == 0){
                System.out.println(" Saliendo...");
                break;
            }else if (opcionInicio == 1){
                System.out.println(" == Menu ==");

                System.out.println(" \n2 Agregar \n3 Ver \n4 Buscar \n5 Editar \n6 Eliminar \n7 Citas");
                opcionMenu = sc.nextInt();
                sc.nextLine();

                switch (opcionMenu){
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

                    case 4:
                        System.out.println(" =============================");
                        System.out.println(" Buscar Animal ");
                        System.out.println(" =============================");
                        System.out.println(" Nombre: ");
                        nombre = sc.nextLine();
                        System.out.println(" Rasa: ");
                        rasa = sc.nextLine();
                        gestorAnimales.buscarAnimales(nombre,rasa);
                        break;

                    case 5:
                        System.out.println(" =============================");
                        System.out.println(" Buscar Animal");
                        System.out.println(" Nombre: ");
                        nombre = sc.nextLine();
                        System.out.println(" =============================");
                        System.out.println(" Editar Animal");
                        System.out.println(" Nuevo Nombre: ");
                        String nuevoNombre = sc.nextLine();
                        System.out.println(" =============================");

                        gestorAnimales.editarAnimales(nombre,nuevoNombre);
                        break;

                    case 6:
                        System.out.println(" =============================");
                        System.out.println(" Eliminar Animal");
                        System.out.println(" Nombre: ");
                        nombre = sc.nextLine();
                        System.out.println(" =============================");
                        gestorAnimales.eliminarAnimal(nombre);
                    break;

                    case 7:
                        System.out.println("  =============================");
                        System.out.println("  Pide tu Cita");
                        System.out.println("  =============================");
                        System.out.println("  Nombre: ");
                        nombre = sc.nextLine();
                        System.out.println("  Fecha: ");
                        fecha = sc.nextInt();
                        System.out.println("  Precio: ");
                        double precio = sc.nextDouble();
                        gestorCitas.apartarCita(nombre,fecha,precio);
                        System.out.println("  =============================");
                    break;

                    case 8:
                        System.out.println("  =============================");
                        System.out.println("  Cancela tu cita ");
                        System.out.println("  =============================");
                        System.out.println("  Fecha: ");
                        fecha = sc.nextInt();
                        System.out.println("  Fecha: ");
                        int fechaCita = sc.nextInt();
                        System.out.println("  =============================");
                        gestorCitas.cancelarCita(fechaCita, fecha);
                    break;

                    default:
                        System.out.println(" opcion no valida ");
                    break;
                }
            }else {
                System.out.println("Opcion no valida ");
            }

        }while (opcionInicio != 0);
    }
}
