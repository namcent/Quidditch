package main.java;

public class Cazador extends Jugador {
    private Integer punteriaJugador;
    private Integer fuerzaJugador;
    private Integer skillsJugador;
    private Integer pesoJugador;

    /** Constructor **/
    public Cazador(Integer punteriaJugador, Integer fuerzaJugador, Integer skillsJugador, Integer pesoJugador){
        this.punteriaJugador = punteriaJugador;
        this.fuerzaJugador = fuerzaJugador;
        this.skillsJugador = skillsJugador;
        this.pesoJugador = pesoJugador;
    }

    public Integer habilidadJugador(){
        return velocidadJugador()+ skillsJugador + punteriaJugador * fuerzaJugador;
    }
}
