package main.java;

public class Guardian extends Jugador {
    private Integer nivelReflejos;
    private Integer fuerzaJugador;
    private Integer skillsJugador;
    private Integer pesoJugador;

    /**Constructor**/
    public Guardian(Integer nivelReflejos, Integer fuerzaJugador, Integer skillsJugador, Integer pesoJugador){
        this.nivelReflejos = nivelReflejos;
        this.fuerzaJugador = fuerzaJugador;
        this.skillsJugador = skillsJugador;
        this.pesoJugador = pesoJugador;
    }

    public Integer habilidadJugador(){
        return velocidadJugador()+ skillsJugador + nivelReflejos + fuerzaJugador;
    }
}
