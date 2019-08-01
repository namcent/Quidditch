package main.java;

//import java.util.Random;

import java.util.List;

public abstract class Jugador {
    protected Integer skillsJugador;
    protected Integer pesoJugador;
    public Escoba escoba;


    /** Constructor **/
    public Jugador(Integer skillsJugador, Integer pesoJugador, Escoba escoba){
        this.skillsJugador=skillsJugador;
        this.pesoJugador=pesoJugador;
        this.escoba=escoba;
    }

    /** Punto 1.a **/
    public Integer nivelManejoDeEscoba(){
        return skillsJugador/ pesoJugador;
    }

    /** Punto 1.b **/
    public Integer velocidadJugador(){
        return escoba.velocidadEscoba() * nivelManejoDeEscoba();
    }

    /** Punto 1.c **/
    public Integer habilidadJugador(){
        return velocidadJugador()+skillsJugador;
    }

    /** Punto 2.a **/
    public Boolean lePasaElTrapo(Jugador jugador){
        return this.habilidadJugador()>=jugador.habilidadJugador()*2;
    }

    /** Punto 2.b **/
    public Boolean esGroso(){
        return habilidadJugador()>promedioHabilidadEquipo() && velocidadJugador()>valorArbitrario();
    }

    public Integer promedioHabilidadEquipo(List<Integer> list){
        return ;
    }

    public Integer valorArbitrario(){
        return (int)(Math.random()*10)+1;
    }

    /** Getters **/

    public Integer getSkillsJugador() {
        return skillsJugador;
    }

    public Integer getPesoJugador() {
        return pesoJugador;
    }




}
