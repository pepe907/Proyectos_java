package Sistema_De_Inventario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventario inventario = new Inventario();

        String nombre,descripcion;
        int opcion, id;
        double precio;

        do {
            System.out.println("== Inventario");

            System.out.println("1 Agregar");
            System.out.println("2 Buscar");
            System.out.println("3 Eliminar");
            System.out.println("0 Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("== Agregar ==");

                    System.out.print("Agrega el ID: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nombre: ");
                    nombre = sc.nextLine();

                    System.out.print("Descripcion: ");
                    descripcion = sc.nextLine();

                    System.out.print("Precio: ");
                    precio = sc.nextDouble();

                    Producto Inventario = new Producto(id, nombre, descripcion, precio);
                    inventario.Agregar(Inventario);
                    System.out.println("Producto agregado");
                break;
                case 2:
                    System.out.println("== Buscar ==");

                    System.out.print("Agrega el ID: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    Producto buscado = inventario.buscar(id);
                    if (buscado != null){
                        System.out.println("Producto encontrado ");
                        System.out.print("ID: " + buscado.getId());
                        System.out.print("Nombre: " + buscado.getNombre());
                        System.out.print("Descripcion: " + buscado.getDecripcion());
                        System.out.print("Precio: " + buscado.getPrecio());
                    }else {
                        System.out.println("Producto no encontrado");
                    }
                break;

                case 3:
                    System.out.println("== Eliminar ==");

                    System.out.print("Ingresa el ID: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    boolean eliminado = inventario.eliminar(id);

                    if (eliminado){
                        System.out.println("Producto eliminado con exito");
                    }else {
                        System.out.println("NO SE PUDO BORRAR " + id + " NO EXISTE");
                    }
                break;

                default:
                    System.out.println("Opcion no valida X");
            }
        }while (opcion != 0);

        sc.close();
    }
}