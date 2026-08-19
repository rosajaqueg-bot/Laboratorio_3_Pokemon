import java.util.*;
/*
Mazo de cartas TDG
Debe tener 60 cartas
max 4 copias con el mismo nombre (excepto energias)
al menos un pkm basico
*/

public class Mazo_RosaJaque_205345493 {

    //Atributos
    private int id ; //n del mazo
    private List<Carta_RosaJaque_205345493> cartas;
    //constructor
    
    public Mazo_RosaJaque_205345493(List<Carta_RosaJaque_205345493> cartas){
        
        this.id;

        if (mazoValido(cartas)){//si el mazo es valido se crea
            this.cartas = cartas;
            System.out.println("Mazon't");
        }
        else {//si el mazo no es valido no se crea
            this.cartas = null;
            System.out.println("Mazon't");
        }

        
    }
    
}
