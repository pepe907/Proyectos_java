package Contacto;

import java.util.*;

public class Contactos {
    ArrayList<User> users = new ArrayList<>();

        public void agregar(String nombre, String telefono) {
           for (int i = 0; i < users.size(); i++){
               User u = users.get(i);
               if (u.getNombre().equals(nombre) && u.getTelefono().equals(telefono)){
                   System.out.println("Contacto Ya Registrado");
                   return;
               }
           }
            users.add(new User(nombre,telefono));
        }

    public void lista(){
        for (int i = 0; i < users.size(); i ++){
            User u = users.get(i);
            System.out.println("Nombre: " + u.getNombre());
            System.out.println("Telefono: " + u.getTelefono());
        }
    }

    public void buscar(String nombre) {
        for (int i = 0; i < users.size(); i++){
            User u = users.get(i);
            if (nombre.equals(u.getNombre())){
                System.out.println("Nombre: " + u.getNombre());
                System.out.println("Telefono: " + u.getTelefono());
            }
        }
    }

    public void eliminar(String nombre) {
        for (int i = 0; i < users.size(); i++){
            User u = users.get(i);
            if (nombre.equals(u.getNombre())){
                users.remove(u);
                System.out.println("Usuario eliminado :)");
                break;
            }
        }
    }

    public void editar (String nombre, String telefono) {
        for(int i = 0; i < users.size(); i++){
            User u = users.get(i);
            if (u.getNombre().equals(nombre)){
                u.setNombre(nombre);
                u.setTelefono(telefono);
                break;
            }
        }
    }
}
