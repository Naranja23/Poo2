public class MedioPago {
    private String titular;

    public MedioPago(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return this.titular;
    }

    public void procesarPago(double monto) {
        System.out.println("Procesando pago por $" + monto);
    }
}

