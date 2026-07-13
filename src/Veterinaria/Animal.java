package Veterinaria;

public class Animal {
    private String rasa;
    private String fisico;
    private String temperamento;

    public Animal(String rasa, String fisico, String temperamento){
        this.rasa = rasa;
        this.fisico = fisico;
        this.temperamento = temperamento;
    }

    public String getRasa() { return rasa; }
    public void setRasa(String rasa) { this.rasa = rasa; }

    public String getFisico() { return fisico; }
    public void setFisico(String fisico) { this.fisico = fisico; }

    public String getTemperamento() { return temperamento; }
    public void setTemperamento(String temperamento) { this.temperamento = temperamento; }
}