public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }

    public double getBase() {
        return this.base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setBase(double base) {
        if (base <= 0) {
            throw new Error("La base debe ser mayor a 0.");
        }
        this.base = base;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new Error("La altura debe ser mayor a 0.");
        }
        this.altura = altura;
    }

    public double calcularArea() {
        return this.base * this.altura;
    }
}
