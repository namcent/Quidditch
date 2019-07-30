package main.java;

public abstract class Jugador {
    private Integer skillsJugador;
    private Integer pesoJugador;
    public Escoba escoba;


    /** Constructor **/
    public Jugador(Integer skillsJugador, Integer pesoJugador){
        this.skillsJugador=skillsJugador;
        this.pesoJugador=pesoJugador;
    }

    /** Punto 1.a **/
    public Integer nivelManejoDeEscoba(){
        return skillsJugador/ pesoJugador;
    }

    /** Punto 1.b **/
    public Integer velocidadJugador(){
        return velocidadEscoba * nivelManejoDeEscoba();
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
