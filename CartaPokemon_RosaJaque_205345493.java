import java.util.*;

//carta pokemon
//puntos de vida, tipo, evolucion
public class CartaPokemon_RosaJaque_205345493 extends Carta_RosaJaque_205345493 {

    private String tipo;
    private int ps;
    private int psDanno;
    private String debilidad;
    private String resistencia;
    private int costoRetirada;
    private Boolean esEx;
    private Ataque_RosaJaque_205345493 habilidad;
    private List<Ataque_RosaJaque_205345493> ataques;
    private List<String> energias;
    private Boolean debilitado = false;
    
    //nombre de evolucion
    // null si es basico
    private String evolucionDe; 

    public CartaPokemon_RosaJaque_205345493(
            String expansion,
            int numero,
            String nombre,
            String evolucionDe,
            int ps,
            int psDanno,
            String tipo,
            String debilidad,
            String resistencia,
            int costoRetirada,
            Boolean esEx,
            Boolean debilitado,
            Ataque_RosaJaque_205345493 habilidad,
            List<String> energias,
            List<Ataque_RosaJaque_205345493> ataques) {
        super(expansion, numero, nombre);
        this.ps = ps;
        this.psDanno = psDanno;
        this.debilidad = debilidad;
        this.resistencia = resistencia;
        this.costoRetirada = costoRetirada;
        this.esEx = esEx;
        this.habilidad = habilidad;
        this.ataques = ataques;
        this.tipo = tipo;
        this.evolucionDe = evolucionDe;
        this.energias = energias;
    }

    //getPuntosVida: Devuelve los puntos de vida (int) del pokemon.
    public int getPs() {
        return ps;
    }

    //getTipo: Devuelve el tipo (String) del pokemon.
    public String getTipo() {
        return tipo;
    }

    //getEvolucionaDe: Devuelve el nombre de la carta de la que evoluciona (String), null si es basico.
    public String getEvolucionaDe() {
        return evolucionDe;
    }

    //getDebilidad: Devuelve la debilidad del pkm.
    public String getDebilidad() {
        return debilidad;
    }
    //getResistencia: Devuelve la resistencia (String) del pokemon.
    public String getResistencia() {
        return resistencia;
    }
    //getCostoRetirada: Devuelve el costo de retirada.
    public int getCostoRetirada() {
        return costoRetirada;
    }
    //getEsEx: Devuelve si el pokemon es EX (boolean).
    public Boolean getEsEx() {
        return esEx;
    }   
    //getHabilidad: Devuelve la habilidad 
    public Ataque_RosaJaque_205345493 getHabilidad() {
        return habilidad;
    }
    //getAtaques: Devuelve la lista de ataques.
    public List<Ataque_RosaJaque_205345493> getAtaques() {
        return ataques;
    }

    //getPsDanno: danno recibido.
    public int getPsDanno() {
        return psDanno;
    }

    //getEnergias: Devuelve la lista de energias.
    public List<String> getEnergias() {
        return energias;
    }

    //setPsDanno: cambia el danno recibido.
    public void setPsDanno(int psDanno) {
        this.psDanno = psDanno;
    }

    //setDebilitado: cambia el estado de debilitado.
    public void setDebilitado(Boolean debilitado) {
        this.debilitado = debilitado;
    }

}
