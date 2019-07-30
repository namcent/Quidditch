package main.java;

public abstract class Jugador {
    private int skillsJugador;
    private int pesoJugador;
    public Escoba escoba;
    public int velocidadEscoba; //???????????????????????????????????

    public int habilidadJugador(){}

    public int nivelManejoDeEscoba(){
        return getSkillsJugador() / getPesoJugador();
    };

    public int velocidadJugador(){
        return velocidadEscoba * nivelManejoDeEscoba();
    }

    /** Getters y Setters **/

    public int getSkillsJugador() {
        return skillsJugador;
    }

    public void setSkillsJugador(int skillsJugador) {
        this.skillsJugador = skillsJugador;
    }

    public int getPesoJugador() {
        return pesoJugador;
    }

    public void setPesoJugador(int pesoJugador) {
        this.pesoJugador = pesoJugador;
    }



}
