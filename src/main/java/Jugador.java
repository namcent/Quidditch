package main.java;

import java.util.ArrayList;
import java.util.List;

public abstract class Jugador {
    protected Double skillsJugador;
    protected Double pesoJugador;
    public Escoba escoba;
    public Equipo equipo;



    /** Constructor **/
    public Jugador( Double pesoJugador,Double skillsJugador, Escoba escoba, Equipo equipo){
        this.pesoJugador=pesoJugador;
        this.skillsJugador=skillsJugador;
        this.escoba=escoba;
        this.equipo=equipo;
    }

    /** Punto 1.a **/
    public Double nivelManejoDeEscoba(){
        return (skillsJugador/pesoJugador);
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
        return this.habilidadJugador() >= (jugador.habilidadJugador()*2);
    }

    /** Punto 2.b **/
    public Boolean esGroso() {
        return habilidadJugador() > equipo.promedioHabilidadEquipo() && velocidadJugador() > escoba.getValorArbitrario();
    }
    //4a//

    public abstract Boolean puedeBloquear(Jugador unjugador) ;

    /** Getters **/

    public Double getSkillsJugador() {
        return skillsJugador;
    }

    public Double getPesoJugador() {
        return pesoJugador;
    }

    /** Punto 3 **/
    public abstract String tipoJugador();






}
