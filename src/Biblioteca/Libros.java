package Biblioteca;

public class Libros {
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libros(String titulo, String autor, boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public boolean getDisponible() { return disponible; }
    public void getDisponible(boolean disponible) { this.disponible = disponible; }
}