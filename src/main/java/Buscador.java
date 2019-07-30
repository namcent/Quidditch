package main.java;

public class Buscador extends Jugador {
    private Integer nivelReflejos;
    private Integer nivelVision;
    //private Integer skillsJugador;
    //private Integer pesoJugador;

    /**Constructor**/
    public Buscador(Integer nivelReflejos, Integer nivelVision, Integer pesoJugador, Integer skillsJugador, Escoba escoba){
        super(pesoJugador, skillsJugador, escoba);
        this.nivelReflejos = nivelReflejos;
        this.nivelVision = nivelVision;
        //this.skillsJugador = skillsJugador;
        //this.pesoJugador = pesoJugador;
    }

    public Integer habilidadJugador(){
        return velocidadJugador()+ skillsJugador + nivelReflejos * nivelVision;
    }
}
