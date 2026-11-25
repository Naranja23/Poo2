public class Main {
    public static void main(String[] args) {
        Tarjeta tarjeta = new Tarjeta("Sofía Martínez", "4821");
        BilleteraVirtual billeteraVirtual = new BilleteraVirtual("Sofía Martínez", "Mercado Pago");

        tarjeta.procesarPago(12500.50);
        billeteraVirtual.procesarPago(4300.00);
    }
}

