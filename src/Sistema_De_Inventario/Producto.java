package Sistema_De_Inventario;

public class Producto {
    private int id;
    private String nombre;
    private String decripcion;
    private double precio;

    public Producto(int id, String nombre, String descripcion, double precio){
        this.id = id;
        this.nombre = nombre;
        this.decripcion = descripcion;
        this.precio = precio;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDecripcion() { return decripcion; }
    public void setDecripcion(String decripcion) { this.decripcion = decripcion; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

}
