package main.java;

import java.util.ArrayList;
import java.util.List;

public abstract class Jugador {
    protected Double skillsJugador;
    protected Integer pesoJugador;
    protected Integer nivelReflejos;
    public Escoba escoba;
    public Equipo equipo;
    public Pelota pelota;


    /** Constructor **/
    public Jugador(Integer nivelReflejos, Double skillsJugador, Integer pesoJugador, Escoba escoba, Equipo equipo){
        this.skillsJugador=skillsJugador;
        this.pesoJugador=pesoJugador;
        this.nivelReflejos=nivelReflejos;
        this.escoba=escoba;
        this.equipo=equipo;
    }

    /** Punto 1.a **/
    public Double nivelManejoDeEscoba(){
        return skillsJugador/ pesoJugador;
    }

    /** Punto 1.b **/
    public Double velocidadJugador(){
        return escoba.velocidadEscoba() * nivelManejoDeEscoba();
    }

    /** Punto 1.c **/
    public Double habilidadJugador(){
        return velocidadJugador()+skillsJugador;
    }

    /** Punto 2.a **/
    public Boolean lePasaElTrapo(Jugador jugador){
        return this.habilidadJugador()>=jugador.habilidadJugador()*2;
    }

    /** Punto 2.b **/
    public Boolean esGroso(){
        return habilidadJugador()>equipo.promedioHabilidadEquipo() && velocidadJugador()>escoba.getValorArbitrario();
    }

    /** Punto 3 **/
    public abstract void jugar(Equipo otroEquipo);

    public abstract String tipoJugador();

    public abstract Boolean esBlancoUtil(Equipo miEquipo);


    /** Punto 4.a **/
    public abstract Boolean puedeBloquear(Jugador jugador);
    //private List <Jugador> jugadores = new ArrayList<>();

    //public void agregarJugador(Jugador jugador){
    //    jugadores.add(jugador);
    //}

//    public Double promedioHabilidadEquipo(List <Jugador> jugadores){
//        return (jugadores.stream().map(jugador -> jugador.habilidadJugador()).reduce(0.0, Double::sum))/jugadores.size();
//    }

    //public Integer valorArbitrario(){
    //    return (int)(Math.random()*10)+1;
    //}
    /** Punto 4.b **/
    public Boolean tenesLaQuaffle(){
         if (this.pelota.tipoPelota().equals("Quaffle")){
            tieneLaQuaffle=true;
        }
         return tieneLaQuaffle;
    }
    protected Boolean tieneLaQuaffle=false;

    /** Punto 4.c **/
    public void esGolpeadoPorUnaBludger(){
        this.skillsJugador=skillsJugador-2;
        this.escoba.recibeGolpe();
    }

    /** Getters **/

    public Double getSkillsJugador() {
        return skillsJugador;
    }

    public Integer getPesoJugador() {
        return pesoJugador;
    }




}
