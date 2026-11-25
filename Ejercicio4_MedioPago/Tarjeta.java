public class Tarjeta extends MedioPago {
    private String ultimosCuatroDigitos;

    public Tarjeta(String titular, String ultimosCuatroDigitos) {
        super(titular);
        this.ultimosCuatroDigitos = ultimosCuatroDigitos;
    }

    public String getUltimosCuatroDigitos() {
        return this.ultimosCuatroDigitos;
    }

    @Override
    public void procesarPago(double monto) {
        if (monto <= 0) {
            System.out.println("Error: El monto debe ser mayor que cero.");
            return;
        }
        System.out.println("Pago con Tarjeta | Titular: " + getTitular() + " | Terminada en: " + this.ultimosCuatroDigitos + " | Monto: $" + monto);
    }
}

