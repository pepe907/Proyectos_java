package com.example.Contactos.Service;

import com.example.Contactos.Model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ContactoService {
    private ArrayList<Usuario> users = new ArrayList<>();

    public void agregar(String nombre, String telefono){
        users.add(new Usuario(nombre,telefono));
    }

    public boolean eliminar(int indice){
        if (indice >= 0 && indice < users.size()){
            users.remove(indice);
            return true;
        }
        return false;
    }

    public ArrayList<Usuario> listar(){
        return users;
    }

}
