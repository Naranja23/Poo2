public class Animal {
    private String nombre;
    private int edad;

    public Animal() {
    }

    public Animal(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new Error("El nombre no puede estar vacío");
        }
        this.nombre = nombre.trim();
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new Error("La edad no puede ser negativa");
        }
        this.edad = edad;
    }
}
