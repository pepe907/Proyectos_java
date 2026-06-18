package CuentaBancaria;

public class Main {
    public static void main(String[] args) {
        Cuenta p1 = new Cuenta("Agus", 1000);
        p1.mostrarSaldo();
        p1.despositar(500);
        p1.mostrarSaldo();
        p1.retirar(500);
        p1.mostrarSaldo();
    }
}
