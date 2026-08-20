import java.util.*;
/*
Mazo de cartas TDG
Debe tener 60 cartas
max 4 copias con el mismo nombre (excepto energias)
al menos un pkm basico
*/

public class Mazo_RosaJaque_205345493 {

    //Atributos
    private static int contadorId = 0; //contador de id
    private int id ; //n del mazo
    private List<Carta_RosaJaque_205345493> cartas;
    //constructor
    
    public Mazo_RosaJaque_205345493(List<Carta_RosaJaque_205345493> cartas){
        
        this.id = ++contadorId;

        if (mazoValido(cartas)){//si el mazo es valido se crea
            this.cartas = cartas;
            System.out.println("Mazon't");
        }
        else {//si el mazo no es valido no se crea
            this.cartas = null;
            System.out.println("Mazon't");
        }

        
    }

    //Metodos
    //revisa que el mazo sea valido
    public boolean mazoValido(List<Carta_RosaJaque_205345493> cartas){
        //si no tiene 60 catrtas = false
        if (cartas.size() != 60 || cartas == null){
            return false;
        }
        //si no tiene almenos un basico = false
        //tambien podremos usar la funcionpara revisar la mano
        if (!tieneBasico(cartas)){
            return false;
        }

        //Maximo de cartas 4 
        for (Carta_RosaJaque_205345493 carta : cartas){
            int contador = 0;
            for (Carta_RosaJaque_205345493 carta2 : cartas){
                if (carta.getNombre().equals(carta2.getNombre())){
                    contador++;
                }
            }
            //si la carta no es energia y hay mas de 4  = false
            if (contador > 4 && !(carta instanceof CartaEnergia_RosaJaque_205345493)){
                return false;
            }
        }

        return true;
    }

    //Revisa si hay almenos un basico en una lista de cartas
    public boolean tieneBasico(List<Carta_RosaJaque_205345493> cartas){
        for (Carta_RosaJaque_205345493 carta : cartas){
            //la carta es basica
            if (carta instanceof CartaPokemon_RosaJaque_205345493 && ((CartaPokemon_RosaJaque_205345493) carta).getEvolucionaDe() == null){
                return true;
            }
        }
        return false;
    }
    //id del mazo
    public int getId() {
        return id;
    }

    //retorna la lista de cartas del mazo
    public List<Carta_RosaJaque_205345493> getCartas() {
        return cartas;
    }

    // revuelve el mazo
    public void barajar(List<Carta_RosaJaque_205345493> cartas) {
        Collections.shuffle(cartas); //modifica la lista, por eso no retornamos
    }
    

}
