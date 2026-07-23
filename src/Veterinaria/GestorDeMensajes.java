package Veterinaria;

import java.util.ArrayList;

public class GestorDeMensajes {
    ArrayList<Mensaje> mensajes ;

    public GestorDeMensajes(){
        this.mensajes = new ArrayList<>();
    }

    public void mensajesPredeterminado(){
        mensajes.add(new Mensaje("Éxito", "Acción Aceptada", 01/05/2025));
        mensajes.add(new Mensaje("Cancelado", "Acción Aceptada", 01/05/2025));
        mensajes.add(new Mensaje("Error Conexión", "Acción Aceptada", 01/05/2025));
    }

    public void mensaje1(){
        System.out.println("Animal Agregado con exito");
    }

    public void mensaje2(){
        System.out.println("Animal ya registrado ");
    }
    public void mensaje3(){
        System.out.println("Animal no encontrado ");
    }

    public void mensaje4(){
        System.out.println("No se puede borrar el animal ");
    }
    public void mensaje5(){
        System.out.println("Borrando animal");
    }

}
