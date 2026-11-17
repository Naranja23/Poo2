public class CuentaBncaria {
    private double saldo;

    public CuentaBncaria() {
        this.saldo = 0.0;
    }

    public CuentaBncaria(double saldoInicial) {
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
