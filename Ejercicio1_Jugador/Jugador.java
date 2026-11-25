public class Jugador {
    private String nombre;
    private int nivel;
    private int puntos;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.puntos = 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getNivel() {
        return this.nivel;
    }

    public int getPuntos() {
        return this.puntos;
    }

    public void ganarPuntos(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad de puntos debe ser positiva (" + cantidad + ").");
            return;
        }
        this.puntos += cantidad;
    }

    public void subirNivel() {
        this.nivel++;
    }
}

