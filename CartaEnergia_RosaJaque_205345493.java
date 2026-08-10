/**
 * Carta de Energia.
 */
public class CartaEnergia_RosaJaque_205345493 extends Carta_RosaJaque_205345493 {

    // Atributos
    private String tipoEnergia;

    // Constructor
    public CartaEnergia_RosaJaque_205345493(
            String expansion, 
            int numero,
            String nombre, //Energia/Energy
            String tipoEnergia) { //Fuego, Agua,...

        super(expansion, numero, nombre);
        this.tipoEnergia = tipoEnergia;
    }

    // Metodos

    //getTipoEnergia: Devuelve el tipo(String) de la carta.
    public String getTipoEnergia() {
        return tipoEnergia;
    }

}
