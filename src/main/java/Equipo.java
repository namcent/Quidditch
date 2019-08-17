package main.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Equipo {
    private List<Jugador> jugadores = new ArrayList<>();
    public String nombre;
    protected Integer puntajeEquipo;
   // private List <Pelota> pelotas = new ArrayList <> ();//


    /** Punto 2.c **/
    //equipo1.tieneUnJugadorEstrella(equipoquenotiene)//
    public Boolean tieneJugadorEstrella(Equipo segundoEquipo){
       return jugadores.stream().anyMatch(jugador -> segundoEquipo.lePasaElTrapoATodos(jugador));
    }

    //equipoquenotiene.lePasaElTrapoATodos (jugadorquepasaatodos)//

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

    //Random//
    private List<Integer> rango = IntStream.range(1, jugadores.size()).boxed().collect(Collectors.toList());

    public int getRandomElement(List<Integer> list)
    {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }

    public Jugador jugadorQueJuegaElTurno(){
        return jugadores.get(getRandomElement(rango));
    }

    //porque el equipo conoce a sus jugadores//

    public Boolean puedenBloquear(Jugador unjugador){
        return this.jugadores.stream()
                .anyMatch(jugador -> jugador.puedeBloquear(unjugador));
    }

    /**cazador mas rapido**/


    public List<Jugador> listaDeCazadores(){
        return jugadores.stream()
                .filter(jugador->jugador.tipoJugador().equals("Cazador"))
                .collect(Collectors.toList());
    }
    //de la lista de cazadores saco el mas rapido//

    public Jugador cazadorMasRapido(){
        return this.listaDeCazadores().stream()
                .max(Comparator.comparing(jugador->jugador.velocidadJugador())).get();
    }

    public Boolean equipoTieneLaQuaffle(){
        return jugadores.stream().anyMatch(jugador -> jugador.tenesLaQuaffle());
    }

    public Integer getPuntajeEquipo() {
        return puntajeEquipo;
    }

    public void setPuntajeEquipo(Integer puntajeEquipo) {
        this.puntajeEquipo = puntajeEquipo;
    }


}
