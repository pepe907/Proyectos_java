package Veterinaria;

public class Citas {
    private String doctor;
    private int fecha;
    private double precio;

    public Citas(String doctor, int fecha, double precio){
        this.doctor = doctor;
        this.fecha = fecha;
        this.precio = precio;
    }

    public String getDoctor() { return doctor; }
    public void setDoctor(String doctor) { this.doctor = doctor; }

    public int getFecha() { return fecha; }
    public void setFecha(int fecha) { this.fecha = fecha; }

    public void setPrecio(double precio) { this.precio = precio; }
    public double getPrecio() { return precio; }
}
