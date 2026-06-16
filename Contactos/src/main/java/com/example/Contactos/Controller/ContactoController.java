package com.example.Contactos.Controller;

import com.example.Contactos.Model.Usuario;
import com.example.Contactos.Service.ContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/contactos")
public class ContactoController {

    @Autowired
    private ContactoService contactoService;

    @GetMapping
    public ArrayList<Usuario> listar(){
        return contactoService.listar();
    }

    @PostMapping
    public void agregar(@RequestBody Usuario usuario){
        contactoService.agregar(usuario.getNombre(), usuario.getTelefono());
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable("id") Integer id){
        boolean ok = contactoService.eliminar(id);

        if (ok){
            return "Contacto Eliminado";
        }else {
            return "Contacto no encontrado";
        }
    }
}
