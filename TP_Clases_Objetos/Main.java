public class Main {
    public static void main(String[] args) {
        //1------------------
        Persona persona1 = new Persona();
        persona1.setNombre("Serpiente mira");
        persona1.setEdad(28);

        Persona persona2 = new Persona();
        persona2.setNombre("ana garcia solmano");
        persona2.setEdad(34);

        System.out.println("Persona 1" + persona1.getNombre() + ", Edad: " + persona1.getEdad());
        System.out.println("Persona 2" + persona2.getNombre() + ", Edad: " + persona2.getEdad());
        //2----------------------------------------------------------------------------------------------------------
        Libro libro1 = new Libro("hasta donde cuenta la cababra", "geronimo alvarencio", 1000);
        Libro libro2 = new Libro("Por que ser rico es un problema para mi y no para vos", "mustafa herrera", 1215);

        libro1.mostrarDatos();
        libro2.mostrarDatos();
        //3----------------------------------------------------------------------------------------------------------
        Auto auto1 = new Auto("Toyota", "Corolla", "Rojo");
        Auto auto2 = new Auto("ferrari", "tf23", "Negro");//diegp
        Auto auto3 = new Auto("Chevrolet", "rampiño", "Blanco");

        auto1.mostrarDatos();
        auto2.mostrarDatos();
        auto3.mostrarDatos();
        //4----------------------------------------------------------------------------------------------------------
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.setSaldo(1500.50);
        System.out.println("Saldo: " + cuenta1.getSaldo());

        cuenta1.setSaldo(2350.75);
        System.out.println("Saldo:" + cuenta1.getSaldo());
        //5----------------------------------------------------------------------------------------------------------
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setBase(10);
        rectangulo.setAltura(5);
        
        System.out.println("Rectangulo: Base: " + rectangulo.getBase() + "Altura: " + rectangulo.getAltura());

        System.out.println("Area del Rectangulo: " + rectangulo.calcularArea());

        //6----------------------------------------------------------------------------------------------------------
        Triangulo triangulo = new Triangulo();
        triangulo.setBase(12);
        triangulo.setAltura(8);
        
        System.out.println("Triangulo: Base: " + triangulo.getBase() + "Altura: " + triangulo.getAltura());
        
        System.out.println("Área del Triangulo (base * altura / 2): " + triangulo.calcularArea());
    }
}
