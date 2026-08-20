import java.util.*;

public class Main {

    public static void main(String[] args) {
        public static void main(String[] args) {

        ////////////////////////////////////////////////////////////
        // EFECTOS
        ////////////////////////////////////////////////////////////

        // Efecto temporal que no hace nada
        Efecto_RosaJaque_205345493 sinEfecto =
                new Efecto_RosaJaque_205345493() {
                    @Override
                    public void aplicar() {
                        // Sin efecto
                    }
                };

        // Por ahora los otros efectos solo muestran un mensaje.
        // Despues implementamos su comportamiento real.

        Efecto_RosaJaque_205345493 efectoParalizar =
                new Efecto_RosaJaque_205345493() {
                    @Override
                    public void aplicar() {
                        System.out.println("Efecto paralizar aplicado.");
                    }
                };

        Efecto_RosaJaque_205345493 efectoCynthia =
                new Efecto_RosaJaque_205345493() {
                    @Override
                    public void aplicar() {
                        System.out.println("Efecto Cynthia aplicado.");
                    }
                };

        Efecto_RosaJaque_205345493 efectoGreatBall =
                new Efecto_RosaJaque_205345493() {
                    @Override
                    public void aplicar() {
                        System.out.println("Efecto Gran Ball aplicado.");
                    }
                };

        Efecto_RosaJaque_205345493 efectoHau =
                new Efecto_RosaJaque_205345493() {
                    @Override
                    public void aplicar() {
                        System.out.println("Efecto Hau aplicado.");
                    }
                };

        Efecto_RosaJaque_205345493 efectoPokemonCatcher =
                new Efecto_RosaJaque_205345493() {
                    @Override
                    public void aplicar() {
                        System.out.println("Efecto Pokemon Catcher aplicado.");
                    }
                };

        Efecto_RosaJaque_205345493 efectoPokemonFanClub =
                new Efecto_RosaJaque_205345493() {
                    @Override
                    public void aplicar() {
                        System.out.println("Efecto Club de Fans aplicado.");
                    }
                };

        Efecto_RosaJaque_205345493 efectoPotion =
                new Efecto_RosaJaque_205345493() {
                    @Override
                    public void aplicar() {
                        System.out.println("Efecto Pocion aplicado.");
                    }
                };

        Efecto_RosaJaque_205345493 efectoProfessorKukui =
                new Efecto_RosaJaque_205345493() {
                    @Override
                    public void aplicar() {
                        System.out.println("Efecto Profesor Kukui aplicado.");
                    }
                };

        Efecto_RosaJaque_205345493 efectoSwitch =
                new Efecto_RosaJaque_205345493() {
                    @Override
                    public void aplicar() {
                        System.out.println("Efecto Cambio aplicado.");
                    }
                };


        ////////////////////////////////////////////////////////////
        // ATAQUES
        ////////////////////////////////////////////////////////////

        // Pikachu - Crimson Invasion
        Ataque_RosaJaque_205345493 A_Impactrueno =
                new Ataque_RosaJaque_205345493(
                        Arrays.asList("1 Rayo"),
                        "Impactrueno",
                        "",
                        20,
                        sinEfecto
                );

        Ataque_RosaJaque_205345493 A_BolaVoltio =
                new Ataque_RosaJaque_205345493(
                        Arrays.asList("2 Rayo", "1 Incolora"),
                        "Bola Voltio",
                        "",
                        50,
                        sinEfecto
                );


        // Pikachu - Shining Legends
        Ataque_RosaJaque_205345493 A_Placaje =
                new Ataque_RosaJaque_205345493(
                        Arrays.asList("1 Incolora"),
                        "Placaje",
                        "",
                        10,
                        sinEfecto
                );

        Ataque_RosaJaque_205345493 A_Impactrueno50 =
                new Ataque_RosaJaque_205345493(
                        Arrays.asList("2 Rayo", "1 Incolora"),
                        "Impactrueno",
                        "",
                        50,
                        sinEfecto
                );


        // Alolan Raichu
        Ataque_RosaJaque_205345493 A_Psiquico =
                new Ataque_RosaJaque_205345493(
                        Arrays.asList("1 Rayo"),
                        "Psiquico",
                        "",
                        20,
                        sinEfecto
                );

        Ataque_RosaJaque_205345493 A_Rayo80 =
                new Ataque_RosaJaque_205345493(
                        Arrays.asList("3 Rayo"),
                        "Rayo",
                        "",
                        80,
                        sinEfecto
                );


        // Voltorb
        Ataque_RosaJaque_205345493 A_BolaRelampago10 =
                new Ataque_RosaJaque_205345493(
                        Arrays.asList("1 Rayo"),
                        "Bola Relampago",
                        "",
                        10,
                        sinEfecto
                );


        // Electrode
        Ataque_RosaJaque_205345493 A_BolaRelampago60 =
                new Ataque_RosaJaque_205345493(
                        Arrays.asList("1 Rayo"),
                        "Bola Relampago",
                        "",
                        60,
                        sinEfecto
                );


        // Electabuzz
        Ataque_RosaJaque_205345493 A_PunoTrueno =
                new Ataque_RosaJaque_205345493(
                        Arrays.asList("1 Rayo"),
                        "Puno Trueno",
                        "",
                        30,
                        sinEfecto
                );


        // Electivire
        Ataque_RosaJaque_205345493 A_Electrocanon =
                new Ataque_RosaJaque_205345493(
                        Arrays.asList("2 Rayo"),
                        "Electrocanon",
                        "",
                        50,
                        sinEfecto
                );

        Ataque_RosaJaque_205345493 A_VoltioSalvaje =
                new Ataque_RosaJaque_205345493(
                        Arrays.asList("4 Rayo"),
                        "Voltio Salvaje",
                        "",
                        120,
                        sinEfecto
                );


        // Blitzle
        Ataque_RosaJaque_205345493 A_Cornada =
                new Ataque_RosaJaque_205345493(
                        Arrays.asList("1 Incolora"),
                        "Cornada",
                        "",
                        10,
                        sinEfecto
                );


        // Zebstrika
        Ataque_RosaJaque_205345493 A_PatadaSalvaje =
                new Ataque_RosaJaque_205345493(
                        Arrays.asList("2 Rayo"),
                        "Patada Salvaje",
                        "",
                        40,
                        sinEfecto
                );


        // Pidgey
        Ataque_RosaJaque_205345493 A_AtaqueAla20 =
                new Ataque_RosaJaque_205345493(
                        Arrays.asList("1 Incolora"),
                        "Ataque Ala",
                        "",
                        20,
                        sinEfecto
                );


        // Pidgeotto
        Ataque_RosaJaque_205345493 A_AtaqueAla40 =
                new Ataque_RosaJaque_205345493(
                        Arrays.asList("2 Incolora"),
                        "Ataque Ala",
                        "",
                        40,
                        sinEfecto
                );


        // Raikou
        Ataque_RosaJaque_205345493 A_ImpactoTrueno =
                new Ataque_RosaJaque_205345493(
                        Arrays.asList("2 Rayo"),
                        "Impacto Trueno",
                        "",
                        30,
                        sinEfecto
                );

        Ataque_RosaJaque_205345493 A_ColmilloTrueno =
                new Ataque_RosaJaque_205345493(
                        Arrays.asList("3 Rayo"),
                        "Colmillo Trueno",
                        "Lanza una moneda. Si sale cara, "
                                + "el Pokemon Activo rival queda Paralizado.",
                        60,
                        efectoParalizar
                );


        ////////////////////////////////////////////////////////////
        // MAZO
        ////////////////////////////////////////////////////////////

        List<Carta_RosaJaque_205345493> cartasDeck1 =
                new ArrayList<>();


        ////////////////////////////////////////////////////////////
        // POKEMON
        ////////////////////////////////////////////////////////////

        // 2 Pikachu Crimson Invasion
        for (int i = 0; i < 2; i++) {

            cartasDeck1.add(
                    new CartaPokemon_RosaJaque_205345493(
                            "Crimson Invasion",
                            30,
                            "Pikachu",
                            null,
                            70,
                            0,
                            "Rayo",
                            "Lucha",
                            "Metal",
                            1,
                            false,
                            null,
                            new ArrayList<>(),
                            Arrays.asList(
                                    A_Impactrueno,
                                    A_BolaVoltio
                            )
                    )
            );
        }


        // 2 Pikachu Shining Legends
        for (int i = 0; i < 2; i++) {

            cartasDeck1.add(
                    new CartaPokemon_RosaJaque_205345493(
                            "Shining Legends",
                            28,
                            "Pikachu",
                            null,
                            60,
                            0,
                            "Rayo",
                            "Lucha",
                            "Metal",
                            1,
                            false,
                            null,
                            new ArrayList<>(),
                            Arrays.asList(
                                    A_Placaje,
                                    A_Impactrueno50
                            )
                    )
            );
        }


        // 2 Alolan Raichu
        for (int i = 0; i < 2; i++) {

            cartasDeck1.add(
                    new CartaPokemon_RosaJaque_205345493(
                            "Crimson Invasion",
                            31,
                            "Alolan Raichu",
                            "Pikachu",
                            110,
                            0,
                            "Rayo",
                            "Lucha",
                            "Metal",
                            1,
                            false,
                            null,
                            new ArrayList<>(),
                            Arrays.asList(
                                    A_Psiquico,
                                    A_Rayo80
                            )
                    )
            );
        }


        // 2 Electrode
        for (int i = 0; i < 2; i++) {

            cartasDeck1.add(
                    new CartaPokemon_RosaJaque_205345493(
                            "Shining Legends",
                            31,
                            "Electrode",
                            "Voltorb",
                            90,
                            0,
                            "Rayo",
                            "Lucha",
                            null,
                            1,
                            false,
                            null,
                            new ArrayList<>(),
                            Arrays.asList(A_BolaRelampago60)
                    )
            );
        }


        // 3 Voltorb
        for (int i = 0; i < 3; i++) {

            cartasDeck1.add(
                    new CartaPokemon_RosaJaque_205345493(
                            "Shining Legends",
                            30,
                            "Voltorb",
                            null,
                            60,
                            0,
                            "Rayo",
                            "Lucha",
                            null,
                            1,
                            false,
                            null,
                            new ArrayList<>(),
                            Arrays.asList(A_BolaRelampago10)
                    )
            );
        }


        // 2 Electivire
        for (int i = 0; i < 2; i++) {

            cartasDeck1.add(
                    new CartaPokemon_RosaJaque_205345493(
                            "Burning Shadows",
                            43,
                            "Electivire",
                            "Electabuzz",
                            140,
                            0,
                            "Rayo",
                            "Lucha",
                            "Metal",
                            3,
                            false,
                            null,
                            new ArrayList<>(),
                            Arrays.asList(
                                    A_Electrocanon,
                                    A_VoltioSalvaje
                            )
                    )
            );
        }


        // 3 Electabuzz
        for (int i = 0; i < 3; i++) {

            cartasDeck1.add(
                    new CartaPokemon_RosaJaque_205345493(
                            "Ultra Prism",
                            43,
                            "Electabuzz",
                            null,
                            80,
                            0,
                            "Rayo",
                            "Lucha",
                            "Metal",
                            1,
                            false,
                            null,
                            new ArrayList<>(),
                            Arrays.asList(A_PunoTrueno)
                    )
            );
        }


        // 1 Zebstrika
        cartasDeck1.add(
                new CartaPokemon_RosaJaque_205345493(
                        "Lost Thunder",
                        82,
                        "Zebstrika",
                        "Blitzle",
                        110,
                        0,
                        "Rayo",
                        "Lucha",
                        "Metal",
                        1,
                        false,
                        null,
                        new ArrayList<>(),
                        Arrays.asList(A_PatadaSalvaje)
                )
        );


        // 2 Blitzle
        for (int i = 0; i < 2; i++) {

            cartasDeck1.add(
                    new CartaPokemon_RosaJaque_205345493(
                            "Lost Thunder",
                            81,
                            "Blitzle",
                            null,
                            60,
                            0,
                            "Rayo",
                            "Lucha",
                            "Metal",
                            1,
                            false,
                            null,
                            new ArrayList<>(),
                            Arrays.asList(A_Cornada)
                    )
            );
        }


        // 1 Pidgeotto
        cartasDeck1.add(
                new CartaPokemon_RosaJaque_205345493(
                        "Team Up",
                        123,
                        "Pidgeotto",
                        "Pidgey",
                        80,
                        0,
                        "Incolora",
                        "Rayo",
                        "Lucha",
                        1,
                        false,
                        null,
                        new ArrayList<>(),
                        Arrays.asList(A_AtaqueAla40)
                )
        );


        // 2 Pidgey
        for (int i = 0; i < 2; i++) {

            cartasDeck1.add(
                    new CartaPokemon_RosaJaque_205345493(
                            "Team Up",
                            121,
                            "Pidgey",
                            null,
                            60,
                            0,
                            "Incolora",
                            "Rayo",
                            "Lucha",
                            1,
                            false,
                            null,
                            new ArrayList<>(),
                            Arrays.asList(A_AtaqueAla20)
                    )
            );
        }


        // 2 Raikou
        for (int i = 0; i < 2; i++) {

            cartasDeck1.add(
                    new CartaPokemon_RosaJaque_205345493(
                            "Shining Legends",
                            32,
                            "Raikou",
                            null,
                            120,
                            0,
                            "Rayo",
                            "Lucha",
                            "Metal",
                            2,
                            false,
                            null,
                            new ArrayList<>(),
                            Arrays.asList(
                                    A_ImpactoTrueno,
                                    A_ColmilloTrueno
                            )
                    )
            );
        }


        ////////////////////////////////////////////////////////////
        // ENTRENADORES
        ////////////////////////////////////////////////////////////

        // Cynthia x1
        cartasDeck1.add(
                new CartaEntrenador_RosaJaque_205345493(
                        "Ultra Prism",
                        119,
                        "Cynthia",
                        "partidario",
                        "Baraja tu mano en tu mazo. Luego roba 6 cartas.",
                        efectoCynthia
                )
        );


        // Gran Ball x2
        for (int i = 0; i < 2; i++) {

            cartasDeck1.add(
                    new CartaEntrenador_RosaJaque_205345493(
                            "Sun & Moon",
                            119,
                            "Gran Ball",
                            "objeto",
                            "Mira las 7 primeras cartas de tu mazo...",
                            efectoGreatBall
                    )
            );
        }


        // Hau x4
        for (int i = 0; i < 4; i++) {

            cartasDeck1.add(
                    new CartaEntrenador_RosaJaque_205345493(
                            "Celestial Storm",
                            132,
                            "Hau",
                            "partidario",
                            "Roba 3 cartas.",
                            efectoHau
                    )
            );
        }


        // Pokemon Catcher x1
        cartasDeck1.add(
                new CartaEntrenador_RosaJaque_205345493(
                        "Sun & Moon",
                        126,
                        "Pokemon Catcher",
                        "objeto",
                        "Cambia el Pokemon Activo de tu rival.",
                        efectoPokemonCatcher
                )
        );


        // Club de Fans Pokemon x2
        for (int i = 0; i < 2; i++) {

            cartasDeck1.add(
                    new CartaEntrenador_RosaJaque_205345493(
                            "Ultra Prism",
                            133,
                            "Club de Fans Pokemon",
                            "partidario",
                            "Busca 2 Pokemon Basicos.",
                            efectoPokemonFanClub
                    )
            );
        }


        // Pocion x1
        cartasDeck1.add(
                new CartaEntrenador_RosaJaque_205345493(
                        "Sun & Moon",
                        127,
                        "Pocion",
                        "objeto",
                        "Cura 30 puntos de dano.",
                        efectoPotion
                )
        );


        // Profesor Kukui x1
        cartasDeck1.add(
                new CartaEntrenador_RosaJaque_205345493(
                        "Sun & Moon",
                        128,
                        "Profesor Kukui",
                        "partidario",
                        "Roba 2 cartas.",
                        efectoProfessorKukui
                )
        );


        // Cambio x2
        for (int i = 0; i < 2; i++) {

            cartasDeck1.add(
                    new CartaEntrenador_RosaJaque_205345493(
                            "Celestial Storm",
                            147,
                            "Cambio",
                            "objeto",
                            "Cambia tu Pokemon Activo.",
                            efectoSwitch
                    )
            );
        }


        ////////////////////////////////////////////////////////////
        // ENERGIAS
        ////////////////////////////////////////////////////////////

        // Energia Rayo x22
        for (int i = 0; i < 22; i++) {

            cartasDeck1.add(
                    new CartaEnergia_RosaJaque_205345493(
                            "Energia Basica",
                            4,
                            "Rayo",
                            "Rayo"
                    )
            );
        }


        ////////////////////////////////////////////////////////////
        // CREAR MAZO
        ////////////////////////////////////////////////////////////

        System.out.println(
                "Cantidad de cartas: " + cartasDeck1.size()
        );

        Mazo_RosaJaque_205345493 Deck1 =
                new Mazo_RosaJaque_205345493(cartasDeck1);

    }

        // Creamos los dos mazos de prueba (60 cartas cada uno, validos)
        List<Carta_RosaJaque_205345493> cartasMazo1 = crearMazoDePrueba("Base1");
        List<Carta_RosaJaque_205345493> cartasMazo2 = crearMazoDePrueba("Base2");

        Mazo_RosaJaque_205345493 mazo1 = new Mazo_RosaJaque_205345493(cartasMazo1);
        Mazo_RosaJaque_205345493 mazo2 = new Mazo_RosaJaque_205345493(cartasMazo2);

        // Creamos los jugadores
        Jugador_RosaJaque_205345493 jugador1 = new Jugador_RosaJaque_205345493("Ash", mazo1);
        Jugador_RosaJaque_205345493 jugador2 = new Jugador_RosaJaque_205345493("Misty", mazo2);

        // Creamos el juego y lo iniciamos (baraja, reparte mano y premios, sortea quien parte)
        Juego_RosaJaque_205345493 juego = new Juego_RosaJaque_205345493(jugador1, jugador2);
        juego.iniciarJuego();

        System.out.println();
        System.out.println("--- Mano inicial de " + jugador1.getNombre() + " ---");
        imprimirMano(jugador1);
        System.out.println("--- Mano inicial de " + jugador2.getNombre() + " ---");
        imprimirMano(jugador2);
        System.out.println();

        // Ambos jugadores ponen un pokemon basico como activo
        jugarPkmActivoSiHay(juego, jugador1);
        jugarPkmActivoSiHay(juego, jugador2);

        // Si algun jugador tiene otro basico en mano, lo manda a la banca
        jugarPkmBancaSiHay(juego, jugador1);
        jugarPkmBancaSiHay(juego, jugador2);

        // Determinamos quien parte segun el sorteo de iniciarJuego()
        Jugador_RosaJaque_205345493 jugadorEnTurno = (juego.getTurno() == 1) ? jugador1 : jugador2;
        Jugador_RosaJaque_205345493 jugadorRival = (jugadorEnTurno == jugador1) ? jugador2 : jugador1;

        System.out.println();
        System.out.println("--- Turno de " + jugadorEnTurno.getNombre() + " ---");

        // El jugador en turno roba una carta
        juego.robarCarta(jugadorEnTurno);

        // Si tiene una energia en la mano, se la pone a su pokemon activo
        usarPrimeraEnergiaSiHay(juego, jugadorEnTurno);

        // Ataca al pokemon activo del rival con el primer ataque disponible
        if (jugadorEnTurno.getPkmActivo() != null
                && !jugadorEnTurno.getPkmActivo().getAtaques().isEmpty()
                && jugadorRival.getPkmActivo() != null) {
            juego.usarAtaque(jugadorEnTurno, jugadorRival, 0);
        }

        juego.avanzarTurno();
    }

    // Busca el primer pokemon basico en la mano y lo juega como activo (si el jugador no tiene uno ya)
    private static void jugarPkmActivoSiHay(Juego_RosaJaque_205345493 juego, Jugador_RosaJaque_205345493 jugador) {
        if (jugador.getPkmActivo() != null) {
            return;
        }
        CartaPokemon_RosaJaque_205345493 basico = obtenerPrimerPkmBasico(jugador.getMano());
        if (basico != null) {
            juego.jugarActivo(jugador, basico);
        }
    }

    // Busca otro pokemon basico en la mano y lo manda a la banca
    private static void jugarPkmBancaSiHay(Juego_RosaJaque_205345493 juego, Jugador_RosaJaque_205345493 jugador) {
        CartaPokemon_RosaJaque_205345493 basico = obtenerPrimerPkmBasico(jugador.getMano());
        if (basico != null) {
            juego.jugarBanca(jugador, basico);
        }
    }

    // Busca la primera carta de energia en la mano y la usa sobre el pokemon activo
    private static void usarPrimeraEnergiaSiHay(Juego_RosaJaque_205345493 juego, Jugador_RosaJaque_205345493 jugador) {
        if (jugador.getPkmActivo() == null) {
            return;
        }
        for (Carta_RosaJaque_205345493 carta : jugador.getMano()) {
            if (carta instanceof CartaEnergia_RosaJaque_205345493) {
                juego.usarCartaEnergia(jugador, (CartaEnergia_RosaJaque_205345493) carta, jugador.getPkmActivo());
                return;
            }
        }
        System.out.println("No hay carta de energia en la mano de " + jugador.getNombre());
    }

    private static CartaPokemon_RosaJaque_205345493 obtenerPrimerPkmBasico(List<Carta_RosaJaque_205345493> mano) {
        for (Carta_RosaJaque_205345493 carta : mano) {
            if (carta instanceof CartaPokemon_RosaJaque_205345493) {
                CartaPokemon_RosaJaque_205345493 pkm = (CartaPokemon_RosaJaque_205345493) carta;
                if (pkm.getEvolucionaDe() == null) {
                    return pkm;
                }
            }
        }
        return null;
    }

    private static void imprimirMano(Jugador_RosaJaque_205345493 jugador) {
        for (Carta_RosaJaque_205345493 carta : jugador.getMano()) {
            System.out.println(" - " + carta.getNombre());
        }
    }

    // Arma un mazo de 60 cartas valido: linea de evolucion x2, cartas de entrenador y energias.
    private static List<Carta_RosaJaque_205345493> crearMazoDePrueba(String expansion) {
        List<Carta_RosaJaque_205345493> cartas = new ArrayList<>();
        int numero = 1;

        Ataque_RosaJaque_205345493 placaje =
                new Ataque_RosaJaque_205345493("Placaje", List.of("Incoloro"), 10, "Ataque basico", new Efecto_RosaJaque_205345493());
        Ataque_RosaJaque_205345493 lanzallamas =
                new Ataque_RosaJaque_205345493("Lanzallamas", List.of("Fuego", "Fuego"), 30, "Ataque de fuego", new Efecto_RosaJaque_205345493());
        Ataque_RosaJaque_205345493 pistoletazo =
                new Ataque_RosaJaque_205345493("Pistola Agua", List.of("Agua"), 20, "Ataque de agua", new Efecto_RosaJaque_205345493());

        // Linea Charmander -> Charmeleon -> Charizard
        for (int i = 0; i < 4; i++) {
            cartas.add(new CartaPokemon_RosaJaque_205345493(expansion, numero++, "Charmander", null,
                    60, 0, "Fuego", "Agua", null, 1, false, false, null, new ArrayList<>(), List.of(placaje)));
        }
        for (int i = 0; i < 2; i++) {
            cartas.add(new CartaPokemon_RosaJaque_205345493(expansion, numero++, "Charmeleon", "Charmander",
                    90, 0, "Fuego", "Agua", null, 2, false, false, null, new ArrayList<>(), List.of(lanzallamas)));
        }
        cartas.add(new CartaPokemon_RosaJaque_205345493(expansion, numero++, "Charizard", "Charmeleon",
                150, 0, "Fuego", "Agua", null, 2, true, false, null, new ArrayList<>(), List.of(lanzallamas)));

        // Linea Squirtle -> Wartortle -> Blastoise
        for (int i = 0; i < 4; i++) {
            cartas.add(new CartaPokemon_RosaJaque_205345493(expansion, numero++, "Squirtle", null,
                    70, 0, "Agua", "Planta", null, 1, false, false, null, new ArrayList<>(), List.of(pistoletazo)));
        }
        for (int i = 0; i < 2; i++) {
            cartas.add(new CartaPokemon_RosaJaque_205345493(expansion, numero++, "Wartortle", "Squirtle",
                    100, 0, "Agua", "Planta", null, 2, false, false, null, new ArrayList<>(), List.of(pistoletazo)));
        }
        cartas.add(new CartaPokemon_RosaJaque_205345493(expansion, numero++, "Blastoise", "Wartortle",
                160, 0, "Agua", "Planta", null, 3, true, false, null, new ArrayList<>(), List.of(pistoletazo)));

        // Cartas de entrenador (max 4 copias cada una, igual que los pokemon)
        for (int i = 0; i < 4; i++) {
            cartas.add(new CartaEntrenador_RosaJaque_205345493(expansion, numero++, "Poke Ball", "objeto",
                    "Busca una carta Pokemon del mazo.", new Efecto_RosaJaque_205345493()));
        }
        for (int i = 0; i < 4; i++) {
            cartas.add(new CartaEntrenador_RosaJaque_205345493(expansion, numero++, "Profesor Encina", "partidario",
                    "Descarta tu mano y roba 2 cartas.", new Efecto_RosaJaque_205345493()));
        }

        // Rellenamos con energias hasta llegar a 60 (las energias no tienen limite de copias)
        int faltan = 60 - cartas.size();
        for (int i = 0; i < faltan; i++) {
            String tipo = (i % 2 == 0) ? "Fuego" : "Agua";
            cartas.add(new CartaEnergia_RosaJaque_205345493(expansion, numero++, "Energia " + tipo, tipo));
        }

        return cartas;
    }
}
