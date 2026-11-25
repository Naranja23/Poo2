public class Main {


    public static void main(String[] args) {
        //---1---------------------------------------------------------------------
        
        Empleado empleado = new Empleado("Carlos López", 35, 85000.50);
        empleado.mostrarDatos();

        empleado.setNombre("Carloz. López");
        empleado.setEdad(36);
        empleado.setSalario(92000.00);
        empleado.mostrarDatos();

        //2---------------------------------------------------------------------
        
        Auto miAuto = new Auto("Toyota", "Corolla", 4);
        miAuto.mostrarInformacion();

        miAuto.setMarca("Ford");
        miAuto.setModelo("Focus");
        miAuto.setCantidadpuertas(5);
        miAuto.mostrarInformacion();

        //3---------------------------------------------------------------------
        
        Perro miPerro = new Perro("Ramona", 1, "mesarra");
        System.out.println("Nombre: " + miPerro.getNombre());
        System.out.println("Edad: " + miPerro.getEdad());
        System.out.println("Raza: " + miPerro.getRaza());

        //3.1---------------------------------------------------------------------
        
        miPerro.ladrar();
        
        //4---------------------------------------------------------------------

        empleado.setSalario(-500);
        miAuto.setCantidadpuertas(0);
        miPerro.setEdad(-3);
    }
}
