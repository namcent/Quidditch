package main.java;

public class Guardian extends Jugador {
    private Integer nivelReflejos;
    private Integer fuerzaJugador;

    /**Constructor**/
    public Guardian(Integer nivelReflejos, Integer fuerzaJugador, Double pesoJugador, Integer skillsJugador, Escoba escoba, Equipo equipo){
        super(pesoJugador, skillsJugador, escoba, equipo);
        this.nivelReflejos = nivelReflejos;
        this.fuerzaJugador = fuerzaJugador;

    }

    public Double habilidadJugador(){
        return super.habilidadJugador()+ nivelReflejos + fuerzaJugador;
    }

    /**4a**/

    public Boolean puedeBloquear (Jugador unjugador) {
        Integer numero = (int) (Math.random() * 3) + 1;
        return numero == 3 ;
    }


}
