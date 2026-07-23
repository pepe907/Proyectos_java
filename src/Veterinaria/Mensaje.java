package Veterinaria;

public class Mensaje {
    private String nombre;
    private String cuerpo;
    private int fecha;

    public Mensaje(String nombre, String cuerpo, int fecha){
        this.nombre = nombre;
        this.cuerpo = cuerpo;
        this.fecha = fecha;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCuerpo() { return cuerpo; }
    public void setCuerpo(String cuerpo) { this.cuerpo = cuerpo; }

    public int getFecha() { return fecha; }
    public void setFecha(int fecha) { this.fecha = fecha; }
}