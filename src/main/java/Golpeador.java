package main.java;

public class Golpeador extends Jugador {
    private Integer punteriaJugador;
    private Integer fuerzaJugador;

    /**Constructor**/
    public Golpeador(Integer punteriaJugador, Integer fuerzaJugador, Double pesoJugador, Integer skillsJugador, Escoba escoba, Equipo equipo){
        super(pesoJugador, skillsJugador, escoba, equipo);
        this.punteriaJugador = punteriaJugador;
        this.fuerzaJugador = fuerzaJugador;
    }

    public Double habilidadJugador(){
        return super.habilidadJugador() + punteriaJugador + fuerzaJugador;
    }

    //4a//

    public Boolean puedeBloquear(Jugador unjugador) {
        return this.esGroso () ;
    }



}
