public class BilleteraVirtual extends MedioPago {
    private String nombreAplicacion;

    public BilleteraVirtual(String titular, String nombreAplicacion) {
        super(titular);
        this.nombreAplicacion = nombreAplicacion;
    }

    public String getNombreAplicacion() {
        return this.nombreAplicacion;
    }

    @Override
    public void procesarPago(double monto) {
        if (monto <= 0) {
            System.out.println("Error: El monto debe ser mayor que cero.");
            return;
        }
        System.out.println("Pago con Billetera Virtual | Titular: " + getTitular() + " | Aplicación: " + this.nombreAplicacion + " | Monto: $" + monto);
    }
}

