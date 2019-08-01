package main.java;

public class Guardian extends Jugador {
    private Integer nivelReflejos;
    private Integer fuerzaJugador;
    //private Integer skillsJugador;
    //private Integer pesoJugador;

    /**Constructor**/
    public Guardian(Integer nivelReflejos, Integer fuerzaJugador, Double pesoJugador, Integer skillsJugador, Escoba escoba){
        super(pesoJugador, skillsJugador, escoba);
        this.nivelReflejos = nivelReflejos;
        this.fuerzaJugador = fuerzaJugador;
        //this.skillsJugador = skillsJugador;
        //this.pesoJugador = pesoJugador;
    }

    public Double habilidadJugador(){
        return super.habilidadJugador()+ nivelReflejos + fuerzaJugador;
    }
}
