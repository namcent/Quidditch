package main.java;

public abstract class Jugador {
    private Integer skillsJugador;
    private Integer pesoJugador;
    public Escoba escoba;
    public Integer velocidadEscoba; //???????????????????????????????????

    //public Integer habilidadJugador(){}

    public Integer nivelManejoDeEscoba(){
        return getSkillsJugador() / getPesoJugador();
    };

    public Integer velocidadJugador(){
        return velocidadEscoba * nivelManejoDeEscoba();
    }

    /** Getters y Setters **/

    public Integer getSkillsJugador() {
        return skillsJugador;
    }

    public void setSkillsJugador(int skillsJugador) {
        this.skillsJugador = skillsJugador;
    }

    public Integer getPesoJugador() {
        return pesoJugador;
    }

    public void setPesoJugador(int pesoJugador) {
        this.pesoJugador = pesoJugador;
    }



}
