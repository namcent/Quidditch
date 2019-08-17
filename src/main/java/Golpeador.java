package main.java;

public class Golpeador extends Jugador {
    private Integer punteriaJugador;
    private Integer fuerzaJugador;

    public String tipoJugador() {
        return "Golpeador";
    }

    /**
     * Constructor
     **/
    public Golpeador( Integer nivelReflejos, Integer punteriaJugador, Integer fuerzaJugador, Double pesoJugador, Double skillsJugador, Escoba escoba, Equipo equipo) {
        super(pesoJugador, skillsJugador, escoba, equipo);
        this.punteriaJugador = punteriaJugador;
        this.fuerzaJugador = fuerzaJugador;
    }

    public Double habilidadJugador() {
        return super.habilidadJugador() + punteriaJugador + fuerzaJugador;
    }



    public void jugar(Equipo otroEquipo){
        this.elegirBlancoUtil(otroEquipo);
    }

    public Boolean esBlancoUtil(Equipo miEquipo){

        return false;
    }

    public void elegirBlancoUtil(Equipo otroEquipo){
        otroEquipo.jugadorQueJuegaElTurno().esBlancoUtil(otroEquipo);

    }



    //4a//

    public Boolean puedeBloquear(Jugador unjugador) {
        return this.esGroso();
    }









}
