package main.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import main.java.Utils.Functions;
import main.java.exceptions.EquipoCompletoException;
import main.java.exceptions.EquipoVacioException;

public class Equipo {
    private List<Jugador> jugadores = new ArrayList<>();
    private Functions functions = new Functions ();
    public String nombre;
    public Integer puntajeEquipo;


    public void agregarJugador(Jugador jugador){
        if(this.cantDeJugadoresEnEquipo()==7){
            throw new EquipoCompletoException("El equipo esta completo");
        }
        jugadores.add(jugador);
    }

    public Integer cantDeJugadoresEnEquipo(){
//        if(jugadores.isEmpty()) {
//            throw new EquipoVacioException("El equipo esta vacio");
//        }
        return jugadores.size();
    }

    public Double promedioHabilidadEquipo(){
        return (jugadores.stream().map(jugador -> jugador.habilidadJugador()).reduce(0.0, Double::sum))/jugadores.size();
    }

//    public Boolean tieneJugadorEstrella(Equipo equipo){
//        return this.mejorJugador().lePasaElTrapo(equipo.mejorJugador());
//    }
//
//    public Jugador mejorJugador(){
//        return this.jugadores.stream()
//                .max(Comparator.comparing(jugador->jugador.habilidadJugador())).get();
//    }

    /** Punto 2.c **/
    public Boolean tieneJugadorEstrella(Equipo segundoEquipo){
       return jugadores.stream().anyMatch(jugador -> segundoEquipo.lePasaElTrapoATodos(jugador));
    }

    public Boolean lePasaElTrapoATodos(Jugador unJugador){
        return jugadores.stream().allMatch(jugador -> unJugador.lePasaElTrapo(jugador));
    }

    /** Punto 3 **/
    /** Inicio Random **/
    public Jugador jugadorQueJuegaElTurno(){
        List<Integer> rango = IntStream.range(1, jugadores.size()).boxed().collect(Collectors.toList());
        return jugadores.get(functions.getRandomElement(rango));
    }

    /** Fin Random **/

    public Boolean puedenBloquear(Jugador unJugador){
         Boolean var = this.jugadores.stream()
                .anyMatch(jugador -> jugador.puedeBloquear(unJugador));
                return var;
    }
    /** Le pasa la Quaffle al cazador rival mas rapido ... **/
    //hago lista de cazadores
    public List<Jugador> listaDeCazadores(){
        return jugadores.stream()
                .filter(j->j.tipoJugador().equals("Cazador")).collect(Collectors.toList());
    }
    //de la lista de cazadores saco el mas rapido
    public Jugador cazadorMasRapido(){
        return this.listaDeCazadores().stream()
                .max(Comparator.comparing(jugador->jugador.velocidadJugador())).get();
    }

    /** Punto 4.b **/
    public Boolean equipoTieneLaQuaffle(){
        return jugadores.stream().anyMatch(jugador -> jugador.tenesLaQuaffle());
    }

    }

