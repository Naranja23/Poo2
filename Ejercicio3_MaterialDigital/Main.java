public class Main {
    public static void main(String[] args) {
        LibroDigital libroDigital = new LibroDigital("Clean Code");
        Audiolibro audiolibro = new Audiolibro("El Principito");

        libroDigital.mostrarDescripcion();
        audiolibro.mostrarDescripcion();
    }
}

