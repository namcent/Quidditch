package main.java;

import java.util.ArrayList;
import java.util.List;

import java.util.Random;

public class Equipo {
    private List<Jugador> jugadores = new ArrayList<>();
    public String nombre;
   // private List <Pelota> pelotas = new ArrayList <> ();//


    /** Punto 2.c **/
    public Boolean tieneJugadorEstrella(Equipo segundoEquipo){
       return jugadores.stream().anyMatch(jugador -> segundoEquipo.lePasaElTrapoATodos(jugador));
    }

    public Boolean lePasaElTrapoATodos(Jugador unJugador){
        return jugadores.stream().allMatch(jugador -> unJugador.lePasaElTrapo(jugador));
    }


    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public Double promedioHabilidadEquipo() {
        return (jugadores.stream().map(jugador -> jugador.habilidadJugador()).reduce(0.0, Double::sum)) / jugadores.size();
    }

    /**Punto3**/

    //porque el equipo conoce a sus jugadores//

    public Boolean puedenBloquear(Jugador unjugador){
        return this.jugadores.stream()
                .anyMatch(jugador -> jugador.puedeBloquear(unjugador));
    }








}
