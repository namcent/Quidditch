package main.java;

public class Golpeador extends Jugador {
    private Integer punteriaJugador;
    private Integer fuerzaJugador;
    //private Integer skillsJugador;
    //private Integer pesoJugador;

    /**Constructor**/
    public Golpeador(Integer punteriaJugador, Integer fuerzaJugador, Double pesoJugador, Integer skillsJugador, Integer nivelReflejos, Escoba escoba, Equipo equipo){
        super(pesoJugador, skillsJugador, nivelReflejos, escoba, equipo);
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

    //public Boolean puedeGolpearBlanco(){
    //        return this.punteria>this.blancoUtilElegido.getNivelDeReflejos() || 8>=this.randomNumber();
    //    }

    public void loPuedeGolpear(){
        Integer numero = (int) (Math.random() * 10) + 1;
        if (this.punteriaJugador>nivelReflejos || numero>=8){///nivel reflejos del jugador blanco util
            this.skillsJugador++;
            esGolpeadoPorUnaBludger();
        }
    }

    public Boolean esBlancoUtil(Equipo miEquipo){
        return false;
    }

    /**Punto 4.a**/
    public Boolean puedeBloquear(Jugador jugador){
        return this.esGroso();
    } //en los del equipo contrario

}
