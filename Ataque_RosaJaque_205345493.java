import java.util.*;

//Ataque pokemon
//tiene nombre, costo, danno, descripcion y efecto
public class Ataque_RosaJaque_205345493 {
    //Atributos
    private String nombre;
    private List<String> costo; 
    private int danno;
    private String descripcion;
    private Efecto_RosaJaque_205345493 efecto;

    //Constructor
    public Ataque_RosaJaque_205345493(
            String nombre,
            List<String> costo,
            int danno,
            String descripcion,
            Efecto_RosaJaque_205345493 efecto) {
        this.nombre = nombre;
        this.costo = costo;
        this.danno = danno;
        this.descripcion = descripcion;
        this.efecto = efecto;
    }

    //Metodos
    //getNombre: Devuelve el nombre    
    public String getNombre() {
        return nombre;
    }

    //getCosto: Devuelve el costo
    public List<String> getCosto() {
        return costo;
    }

    //getDanno: Devuelve el danno
    public int getDanno() {
        return danno;
    }

    //getDescripcion: Devuelve la descripcion
    public String getDescripcion() {
        return descripcion;
    }

    //getEfecto: Devuelve el efecto
    public Efecto_RosaJaque_205345493 getEfecto() {
        return efecto;
    }
    

}