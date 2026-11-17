public class Empleado extends Persona {
    private double salario;

    public Empleado() {
        super();
    }

    public Empleado(String nombre, int edad, double salario) {
        super(nombre, edad);
        setSalario(salario);
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new Error("El salario no puede ser negativo.");
        }
        this.salario = salario;
    }

    public void mostrarDatos() {
        System.out.println("Empleado:");
        System.out.println(" Nombre; " + getNombre());
        System.out.println(" Edad: " + getEdad() );
        System.out.println(" Salario:" + getSalario());
    }
}
