public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria() {
        this.saldo = 0.0;
    }

    public CuentaBancaria(double saldoInicial) {
        setSaldo(saldoInicial);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new Error("El saldo no puede ser negativo.");
        }
        this.saldo = saldo;
    }
}
