public class Auto {
    private String marca;
    private String modelo;
    private String color;

    public Auto() {
    }

    public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mostrarDatos() {
        System.out.println("un " + this.marca + " modelo " + this.modelo + " de color " + this.color);
    }
}
