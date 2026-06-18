package CuentaBancaria;

public class Cuenta {
    private String nombre;
    private double saldo;

    public Cuenta(String nombre, double saldo){
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void despositar(double monto){
        if (monto <= 0) {
            System.out.println("No se puede depositar saldo negativo");
        }else {
            double nuevoSaldo = monto + saldo;
            setSaldo(nuevoSaldo);
            System.out.println("Deposito Aprobado ");
        }
    }

    public void retirar(double monto){
        if (monto <= saldo) {
            double nuevoSaldo = saldo - monto;
            setSaldo(nuevoSaldo);

            System.out.println("Retiro aprobado ");
        }else{
            System.out.println("Fondos insuficientes :(");
        }
    }

    public void mostrarSaldo(){
        System.out.println("Saldo: " + saldo);
    }
}
