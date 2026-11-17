public class Perro extends Animal {
    private String raza;

    public Perro() {
        super();
    }

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        setRaza(raza);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        if (raza == null || raza.trim().isEmpty()) {
            throw new Error("Error de validación: La raza no puede ser nula ni estar vacía.");
        }
        this.raza = raza.trim();
    }

    public void ladrar() {
        System.out.println("el perro está ladrando");
    }
}
