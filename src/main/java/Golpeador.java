package main.java;

public class Golpeador extends Jugador {
    private Integer punteriaJugador;
    private Integer fuerzaJugador;
    //private Integer skillsJugador;
    //private Integer pesoJugador;

    /**Constructor**/
    public Golpeador(Integer punteriaJugador, Integer fuerzaJugador, Double pesoJugador, Integer skillsJugador, Escoba escoba, Equipo equipo){
        super(pesoJugador, skillsJugador, escoba, equipo);
        this.punteriaJugador = punteriaJugador;
        this.fuerzaJugador = fuerzaJugador;
        //this.skillsJugador = skillsJugador;
        //this.pesoJugador = pesoJugador;
    }

    public Double habilidadJugador(){
        return super.habilidadJugador() + punteriaJugador + fuerzaJugador;
    }

    /** Punto 3 **/
    public String tipoJugador(){
        return "Golpeador";
    }

    public void jugar(Equipo otroEquipo){
        elegirBlancoUtil(otroEquipo);
    }

    public void elegirBlancoUtil(Equipo otroEquipo){
        if (otroEquipo.jugadorQueJuegaElTurno().esBlancoUtil(equipo)){ //abstract esBlancoUtil pide como parametro si o si miEquipo
            this.loPuedeGolpear();
        }
    }
    public void loPuedeGolpear(){
        this.punteriaJugador> ///nivel reflejos del jugador blanco util
    }

    public Boolean esBlancoUtil(Equipo miEquipo){
        return false;
    }

    /**Punto 4.a**/
    public Boolean puedeBloquear(Jugador jugador){
        return this.esGroso();
    } //en los del equipo contrario

}
