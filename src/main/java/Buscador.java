package main.java;

public class Buscador extends Jugador {
    private Integer nivelReflejos;
    private Integer nivelVision;
    //private Integer skillsJugador;
    //private Integer pesoJugador;

    /**Constructor**/
    public Buscador(Integer nivelReflejos, Integer nivelVision, Double pesoJugador, Integer skillsJugador, Escoba escoba){
        super(pesoJugador, skillsJugador, escoba);
        this.nivelReflejos = nivelReflejos;
        this.nivelVision = nivelVision;
        //this.skillsJugador = skillsJugador;
        //this.pesoJugador = pesoJugador;
    }

    public Double habilidadJugador(){
        return super.habilidadJugador() + nivelReflejos * nivelVision;
    }
}
