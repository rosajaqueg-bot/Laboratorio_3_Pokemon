/**
 * Cartas
 * Pokemon, Energia y Entrenador.
 */
public abstract class Carta_RosaJaque_205345493 {

    private static int contadorId = 0;

    private int id;
    private String expansion;
    private int numero;
    private String nombre;


     // Constructor de una carta.

    public Carta_RosaJaque_205345493(
            String expansion,
            int numero,
            String nombre) {

        this.id = contadorId++;
        this.expansion = expansion;
        this.numero = numero;
        this.nombre = nombre;
    }

    // Métodos

    //getId: Devuelve el id (int) de la carta.
    public int getId() {
        return id;
    }

    //getExpansion: Devuelve la expansión (String) de la carta.
    public String getExpansion() {
        return expansion;
    }

    //getNumero: Devuelve el número de la carta (int).
    public int getNumero() {
        return numero;
    }

    //getNombre: Devuelve el nombre de la carta (String).
    public String getNombre() {
        return nombre;
    }
}
