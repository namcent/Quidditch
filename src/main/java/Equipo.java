package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Equipo {
    private List<Jugador> jugadores = new ArrayList<>();
    public String nombre;
    public Integer puntajeEquipo;


    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
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
    private List<Integer> rango = IntStream.range(1, jugadores.size()).boxed().collect(Collectors.toList());

    public int getRandomElement(List<Integer> list)
    {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }

    public Jugador jugadorQueJuegaElTurno(){
        return jugadores.get(getRandomElement(rango));
    }
    /** Fin **/
    }

