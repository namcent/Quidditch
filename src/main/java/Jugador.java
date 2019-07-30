package main.java;

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
        return velocidadEscoba() * nivelManejoDeEscoba();
    }

    //public Integer velocidadEscoba; //???????????????????????????????????

    //public Integer habilidadJugador(){}


    /** Getters **/

    public Integer getSkillsJugador() {
        return skillsJugador;
    }

    public Integer getPesoJugador() {
        return pesoJugador;
    }




}
