package Sistema_De_Inventario;

import java.util.HashMap;

public class Inventario {
    HashMap<Integer, Producto> inventario;

    public Inventario(){
        this.inventario = new HashMap<>();
    }

    public void Agregar(Producto producto){
        inventario.put(producto.getId(), producto);
    }

    public Producto buscar(int id){
        return inventario.get(id);
    }

    public boolean eliminar(int id){
        if (inventario.containsKey(id)){
            inventario.remove(id);
            return true;
        }
        return false;
    }
}