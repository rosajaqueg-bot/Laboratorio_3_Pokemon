import java.util.*;

public class Juego_RosaJaque_205345493 {
    //Atributos
    private Jugador_RosaJaque_205345493 jugador1;
    private Jugador_RosaJaque_205345493 jugador2;
    
    private int turno;

    //Constructor
    public Juego_RosaJaque_205345493(Jugador_RosaJaque_205345493 jugador1,
        Jugador_RosaJaque_205345493 jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.turno = 0;

    }
    //Metodos

    //IniciarJuego: Inicia el juego, baraja los mazos y reparte las cartas correspondientes.
    public void iniciarJuego() {
        //barajamos los mazos
        jugador1.getMazo().barajar(jugador1.getMazo().getCartas());
        jugador2.getMazo().barajar(jugador2.getMazo().getCartas());

        //reparte mano
        reparteMano(jugador1);
        reparteMano(jugador2);

        //premios
        repartePremios(jugador1);
        repartePremios(jugador2);

        //quien parte
        Random rand = new Random();
        turno = rand.nextInt(2) + 1; //1 o 2
        System.out.println("Comienza jugador " + turno);
                
    }


    //reparteMano: Reparte la mano inicial de 7 cartas y un pkm inicial.
    public void reparteMano(Jugador_RosaJaque_205345493 jugador) {
        jugador.getMano().clear(); //mano limpia

        for (int i = 0; i < 7; i++) {//repartimos 7 cartas
            jugador.getMano().add(jugador.getMazo().getCartas().remove(0));
        }
        if (!(tieneBasico(jugador.getMano()))) {
            reparteMano(jugador);
        }

    }

    //repartePremios: Reparte las 6 cartas de premio.
    public void repartePremios(Jugador_RosaJaque_205345493 jugador) {
        jugador.getPremios().clear(); //premios limpios

        for (int i = 0; i < 6; i++) {//repartimos 6 cartas
            jugador.getPremios().add(jugador.getMazo().getCartas().remove(0));
        }
    }

    //tieneBasico: Revisa si la mano tiene almenos un pokemon basico.
    public boolean tieneBasico(List<Carta_RosaJaque_205345493> cartas) {
        for (Carta_RosaJaque_205345493 carta : cartas) {
            if (carta instanceof CartaPokemon_RosaJaque_205345493 && ((CartaPokemon_RosaJaque_205345493) carta).getEvolucionaDe() == null) {
                return true;
            }
        }
        return false;
    }

    //getTurno: Devuelve el turno actual.
    public int getTurno() {
        return turno;
    }

    //avanzarTurno: Avanza el turno al siguiente jugador.
    public void avanzarTurno() {
        turno = (turno == 1) ? 2 : 1;
        System.out.println("Turno del jugador " + turno);
    }

    //juegaBanca: Juega un pokemon en la banca.
    public void jugarBanca(Jugador_RosaJaque_205345493 jugador, CartaPokemon_RosaJaque_205345493 pkm) {
        //si hay espacio y el pokemon es basico se juega
        if (jugador.getBanca().size() < 5 && ((CartaPokemon_RosaJaque_205345493) pkm).getEvolucionaDe() == null) {
            jugador.getBanca().add(pkm);
            jugador.getMano().remove(pkm);
            System.out.println("Se ha jugado a la banca el pokemon: " + pkm.getNombre());
        } else {
            System.out.println("No se puede jugar a la banca, ya hay 5 pokemon.");
        }
    }
    
    //getPkmActivo: muestra el pokemon activo del jugador.
    public CartaPokemon_RosaJaque_205345493 getPkmActivo(Jugador_RosaJaque_205345493 jugador) {
        if (jugador.getPkmActivo() != null) {
            return jugador.getPkmActivo();
        } else {
            System.out.println("No hay pokemon activo.");
            return null;
        }
    }
    
    //setPkmActivo: Cambia el pokemon activo del jugador.
    public void setPkmActivo(Jugador_RosaJaque_205345493 jugador, CartaPokemon_RosaJaque_205345493 pkm) {
        jugador.setPkmActivo(pkm);
    }

    //jugarActivo: Juega un pokemon en el activo. (primera vez)
    public void jugarActivo(Jugador_RosaJaque_205345493 jugador, CartaPokemon_RosaJaque_205345493 pkm) {
        //si el pokemon es basico se juega
        if (((CartaPokemon_RosaJaque_205345493) pkm).getEvolucionaDe() == null) {
            jugador.setPkmActivo(pkm);
            jugador.getMano().remove(pkm);
            System.out.println("Se ha jugado a activo el pokemon: " + pkm.getNombre());
        } else {
            System.out.println("No se puede jugar a activo, el pokemon no es basico.");
        }
    }

    //cambiarpkmActivo: Cambia el pokemon activo por uno de la banca.
    public void cambiarpkmActivo(Jugador_RosaJaque_205345493 jugador, CartaPokemon_RosaJaque_205345493 pkm) {
        //si el pokemon esta en la banca se cambia
        if (jugador.getBanca().contains(pkm)) {
            CartaPokemon_RosaJaque_205345493 temp = jugador.getPkmActivo();
            jugador.setPkmActivo(pkm);
            jugador.getBanca().remove(pkm);
            jugador.getBanca().add(temp);
            System.out.println("Se ha cambiado el pokemon activo a: " + pkm.getNombre());
        } else {
            System.out.println("El pokemon no esta en la banca.");
        }
    }

    public void robarCarta(Jugador_RosaJaque_205345493 jugador) {
        //si el mazo no esta vacio se roba una carta
        if (jugador.getMazo().getCartas().size() > 0) {
            Carta_RosaJaque_205345493 carta = jugador.getMazo().getCartas().remove(0);
            jugador.getMano().add(carta);
            System.out.println("Se ha robado la carta: " + carta.getNombre());
        } else {
            System.out.println("No hay cartas en el mazo.");
        }
    }

    //usarCartaEnergia: Usa una carta de energia en un pokemon.
    public void usarCartaEnergia(Jugador_RosaJaque_205345493 jugador, CartaEnergia_RosaJaque_205345493 energia, CartaPokemon_RosaJaque_205345493 pkm) {
        //pokemon en banca o activo
        if (jugador.getBanca().contains(pkm) || jugador.getPkmActivo() == pkm) {
            //si la carta de energia esta en la mano
            if (jugador.getMano().contains(energia)) {
                pkm.getEnergias().add(energia.getTipoEnergia());//se agrega la energia al pokemon
                jugador.getMano().remove(energia); //se quita la carta de energia de la mano
                System.out.println("Se ha usado la carta de energia: " + energia.getTipoEnergia() + " en el pokemon: " + pkm.getNombre());
            } else {
                System.out.println("La carta de energia no esta en la mano.");
            }
        } else {
            System.out.println("No se puede usar energia en ese pokemon");
        }
    }

    //EvolucionarPokemon: evoluciona pokemon en banca o activo.
    public void evolucionarPokemon(Jugador_RosaJaque_205345493 jugador, CartaPokemon_RosaJaque_205345493 evolucion, CartaPokemon_RosaJaque_205345493 pkm) {
        //si el pokemon esta en la banca o activo
        if (jugador.getBanca().contains(pkm) || jugador.getPkmActivo() == pkm) {
            //si la carta de evolucion esta en la mano
            if (jugador.getMano().contains(evolucion)) {
                //si la carta de evolucion es del pokemon
                if (evolucion.getEvolucionaDe() != null && evolucion.getEvolucionaDe().equals(pkm.getNombre())) {
                    //se reemplaza el pokemon por su evolucion
                    if (jugador.getPkmActivo() == pkm) {
                        jugador.setPkmActivo(evolucion);
                    } else {
                        jugador.getBanca().remove(pkm);
                        jugador.getBanca().add(evolucion);
                    }
                    jugador.getMano().remove(evolucion);
                    System.out.println("Se ha evolucionado el pokemon: " + pkm.getNombre() + " a: " + evolucion.getNombre());
                } 
            }
        } 
        else {
            System.out.println("No se puede evolucionar ese pokemon");
        }
    }

    //usarCartaEntrenador: Usa una carta de entrenador.
    public void usarCartaEntrenador(Jugador_RosaJaque_205345493 jugador, CartaEntrenador_RosaJaque_205345493 entrenador) {
        //si la carta de entrenador esta en la mano
        if (jugador.getMano().contains(entrenador)) {
            //se ejecuta el efecto de la carta
            entrenador.getEfecto().aplicar();
            jugador.getMano().remove(entrenador);
            System.out.println("Se ha usado la carta de entrenador: " + entrenador.getNombre());
        } else {
            System.out.println("La carta de entrenador no esta en la mano.");
        }
    }

    //usarHabilidad: Usa la habilidad del pokemon activo.
    public void usarHabilidad(Jugador_RosaJaque_205345493 jugador) {
        CartaPokemon_RosaJaque_205345493 pkm = jugador.getPkmActivo();
        if (pkm != null) {
            System.out.println("Se ha usado la habilidad del pokemon activo: " + pkm.getNombre());
        } else {
            System.out.println("El pokemon activo no tiene habilidad o no hay pokemon activo.");
        }
    }

    //usarAtaque: Usa el ataque solo de un pkm activo.
    public void usarAtaque(Jugador_RosaJaque_205345493 jugador1, Jugador_RosaJaque_205345493 jugador2, int ataqueIndex) {
        CartaPokemon_RosaJaque_205345493 pkm = jugador1.getPkmActivo(); //pkm activo
        CartaPokemon_RosaJaque_205345493 pkm2 = jugador2.getPkmActivo(); //pkm activo del oponente

        if (pkm != null) { //si hay pkm activo
            //indice ataque valido
            if (ataqueIndex >= 0 && ataqueIndex < pkm.getAtaques().size()) {
                Ataque_RosaJaque_205345493 ataque = pkm.getAtaques().get(ataqueIndex);
                //aplicamos el danno al pkm2
                pkm2.setPsDanno(pkm2.getPsDanno() + ataque.getDanno());
                if (pkm2.getPsDanno() >= pkm2.getPs()) {
                    pkm2.setDebilitado(true);
                    System.out.println("El pokemon " + pkm2.getNombre() + " ha sido debilitado.");
                }
                System.out.println("Se ha usado el ataque: " + ataque.getNombre() );
            } else {
                System.out.println("Indice de ataque invalido.");
            }
        } 
    }

}