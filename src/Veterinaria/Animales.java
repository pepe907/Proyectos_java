package Veterinaria;

public class Animales extends Animal{
    private String nombre;
    private String descripcion;
    private int edad;

    public Animales(String nombre, String descripcion, int edad, String rasa, String fisico, String temperamento){
        super(rasa, fisico, temperamento);
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
}