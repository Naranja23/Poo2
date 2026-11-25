public class Main {
    public static void main(String[] args) {
        Docente docente = new Docente("Laura Gómez", 40, "Programación");
        Preceptor preceptor = new Preceptor("Marcos Díaz", 32, "5to Año B");

        docente.mostrarInformacion();
        preceptor.mostrarInformacion();

        docente.setEdad(41);
        docente.mostrarInformacion();
    }
}

