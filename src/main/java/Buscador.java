package main.java;

public class Buscador extends Jugador {
    private Integer nivelReflejos;
    private Integer nivelVision;
    //private Integer skillsJugador;
    //private Integer pesoJugador;

    /**Constructor**/
    public Buscador(Integer nivelReflejos, Integer nivelVision, Double pesoJugador, Integer skillsJugador, Escoba escoba, Equipo equipo){
        super(pesoJugador, skillsJugador, escoba, equipo);
        this.nivelReflejos = nivelReflejos;
        this.nivelVision = nivelVision;
        //this.skillsJugador = skillsJugador;
        //this.pesoJugador = pesoJugador;
    }

    public Double habilidadJugador(){
        return super.habilidadJugador() + nivelReflejos * nivelVision;
    }

    /** Punto 3 **/
    public String tipoJugador(){
        return "Buscador";
    }

    /**Punto 4.a**/
    public Boolean puedeBloquear (Jugador jugador){
        return false;
    }
}
