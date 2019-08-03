package main.java;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private List<Jugador> jugadores = new ArrayList<>();

    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }

    public Double promedioHabilidadEquipo(){
        return (jugadores.stream().map(jugador -> jugador.habilidadJugador()).reduce(0.0, Double::sum))/jugadores.size();
    }
}
