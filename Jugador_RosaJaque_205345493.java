import java.util.*;

//judador
//cada jugador tiene mazo, mano, banca, premios, pkm activo y descarte

public class Jugador_RosaJaque_205345493 {
    //Atributos
    private String nombre;
    private Mazo_RosaJaque_205345493 mazo;
    private List<Carta_RosaJaque_205345493> mano;
    private List<Carta_RosaJaque_205345493> banca;
    private List<Carta_RosaJaque_205345493> premios;
    private CartaPokemon_RosaJaque_205345493 pkmActivo;
    private List<Carta_RosaJaque_205345493> descarte;

    //Constructor
    public Jugador_RosaJaque_205345493(String nombre, Mazo_RosaJaque_205345493 mazo) {
        this.nombre = nombre;
        this.mazo = mazo;
        this.mano = new ArrayList<>();
        this.banca = new ArrayList<>();
        this.premios = new ArrayList<>();
        this.pkmActivo = null;
        this.descarte = new ArrayList<>();
    }

    //Metodos
    //getNombre: Devuelve el nombre del jugador.
    public String getNombre() {
        return nombre;
    }

    //getMazo: Devuelve el mazo del jugador.
    public Mazo_RosaJaque_205345493 getMazo() {
        return mazo;
    }

    //getMano: Devuelve la mano del jugador.
    public List<Carta_RosaJaque_205345493> getMano() {
        return mano;
    }

    //getBanca: Devuelve la banca del jugador.
    public List<Carta_RosaJaque_205345493> getBanca() {
        return banca;
    }

    //getPremios: Devuelve los premios del jugador.
    public List<Carta_RosaJaque_205345493> getPremios() {
        return premios;
    }

    //getPkmActivo: Devuelve el pokemon activo del jugador.
    public CartaPokemon_RosaJaque_205345493 getPkmActivo() {
        return pkmActivo;
    }

    //setPkmActivo: Cambia el pokemon activo del jugador.
    public void setPkmActivo(CartaPokemon_RosaJaque_205345493 pkmActivo) {
        this.pkmActivo = pkmActivo;
    }

    //getDescarte: Devuelve el descarte del jugador.
    public List<Carta_RosaJaque_205345493> getDescarte() {
        return descarte;
    }


}