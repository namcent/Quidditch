package main.java;

public class Cazador extends Jugador {
    private Integer punteriaJugador;
    private Integer fuerzaJugador;
    //private Integer skillsJugador;
    //private Integer pesoJugador;

    /** Constructor **/
    public Cazador(Integer punteriaJugador, Integer fuerzaJugador, Integer pesoJugador, Integer skillsJugador, Escoba escoba){
        super(pesoJugador, skillsJugador, escoba);
        this.punteriaJugador = punteriaJugador;
        this.fuerzaJugador = fuerzaJugador;
        //this.skillsJugador = skillsJugador;
        //this.pesoJugador = pesoJugador;
    }

    public Integer habilidadJugador(){
        return super.habilidadJugador()+ punteriaJugador * fuerzaJugador;
    }
}
