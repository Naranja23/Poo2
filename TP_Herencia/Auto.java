public class Auto extends Vehiculo {
    private int cantidadpuertas;

    public Auto() {
        super();
    }

    public Auto(String marca, String modelo, int cantidadpuertas) {
        super(marca, modelo);
        setCantidadpuertas(cantidadpuertas);
    }

    public int getCantidadpuertas() {
        return this.cantidadpuertas;
    }

    public void setCantidadpuertas(int cantidadpuertas) {
        if (cantidadpuertas <= 0) {
            throw new Error("La cantidad de puertas no puede ser menor a 0.");
        }
        this.cantidadpuertas = cantidadpuertas;
    }

    public int getCantidadPuertas() {
        return this.cantidadpuertas;
    }

    public void setCantidadPuertas(int cantidadpuertas) {
        setCantidadpuertas(cantidadpuertas);
    }

    public void mostrarInformacion() {
        System.out.println("Información del Auto:");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cantidad de Puertas: " + getCantidadpuertas());
    }

    public void mostrarDatos() {
        mostrarInformacion();
    }
}
