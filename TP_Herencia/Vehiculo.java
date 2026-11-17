public class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo) {
        setMarca(marca);
        setModelo(modelo);
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            throw new Error("Error de validación: La marca no puede ser nula ni estar vacía.");
        }
        this.marca = marca.trim();
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new Error("Error de validación: El modelo no puede ser nulo ni estar vacío.");
        }
        this.modelo = modelo.trim();
    }
}
