public class Main {
    public static void main(String[] args) {
        Jugador jugadorUno = new Jugador("Lucas");
        Jugador jugadorDos = new Jugador("Martina");

        System.out.println("Datos iniciales:");
        System.out.println("Jugador: " + jugadorUno.getNombre() + " Nivel: " + jugadorUno.getNivel() + " Puntos: " + jugadorUno.getPuntos());
        System.out.println("Jugador: " + jugadorDos.getNombre() + " Nivel: " + jugadorDos.getNivel() + " Puntos: " + jugadorDos.getPuntos());

        jugadorUno.ganarPuntos(150);
        jugadorDos.ganarPuntos(200);

        jugadorUno.ganarPuntos(-50);

        jugadorDos.subirNivel();

        System.out.println("Datos finales:");
        System.out.println("Jugador: " + jugadorUno.getNombre() + " Nivel: " + jugadorUno.getNivel() + " Puntos: " + jugadorUno.getPuntos());
        System.out.println("Jugador: " + jugadorDos.getNombre() + " Nivel: " + jugadorDos.getNivel() + " Puntos: " + jugadorDos.getPuntos());
    }
}

