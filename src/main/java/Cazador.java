package main.java;

public class Cazador extends Jugador {
    private Integer punteriaJugador;
    private Integer fuerzaJugador;
    //private Integer skillsJugador;
    //private Integer pesoJugador;

    /** Constructor **/
    public Cazador(Integer punteriaJugador, Integer fuerzaJugador, Double pesoJugador, Integer skillsJugador, Escoba escoba, Equipo equipo){
        super(pesoJugador, skillsJugador, escoba, equipo);
        this.punteriaJugador = punteriaJugador;
        this.fuerzaJugador = fuerzaJugador;
        //this.skillsJugador = skillsJugador;
        //this.pesoJugador = pesoJugador;
    }

    public Double habilidadJugador(){
        return super.habilidadJugador()+ punteriaJugador * fuerzaJugador;
    }

    /** Punto 3 **/
    public Boolean jugar(){ //void?
        if (tieneQuaffle=true){
            return intentaMeterGol();
        }else{
            finTurno();
        }
    }
    private Boolean tieneQuaffle;
    public Boolean intentaMeterGol(){
        this.evitarBloqueos();
        if (metioGol()=true){
            this.equipo.puntajeEquipo = equipo.puntajeEquipo +10;
            this.skillsJugador=skillsJugador+5;
        }
    }
    public Boolean evitarBloqueos(Jugador jugador){
        if (this.puedeBloquear(Jugador jugador)){

        }
        //return !intentaBloquear(equipoContrario);
        }

    /** Punto 4.a **/
    public Boolean puedeBloquear (Jugador jugador){
        return this.lePasaElTrapo(jugador);
    } //en los del equipo contrario
    /** Fin **/

    public Boolean pudoBloquear(Jugador jugador){return finTurno();}

    public Boolean getTieneQuaffle() {
        return tieneQuaffle;
    }

    public void setTieneQuaffle(Boolean tieneQuaffle) {
        this.tieneQuaffle = tieneQuaffle;
    }
}
