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
    //private Boolean tieneQuaffle;

    public Boolean jugar(){ //void?
        if (pelota.tipoPelota().equals("Quaffle")){
            return intentaMeterGol();
        }else{
            finTurno();
        }
    }

    public Boolean intentaMeterGol() {
        if (equipo.puedenBloquear(this)) {
            this.skillsJugador = skillsJugador - 2;
            finTurno();
        } else {
            if (metioGol() = true) {
                this.equipo.puntajeEquipo = equipo.puntajeEquipo + 10;
                this.skillsJugador = skillsJugador + 5;
            }
        }
    }
    public String tipoJugador(){
        return "Cazador";
    }

//        public Cazador cazadorRivalMasRapido(){
//            return filter(jugador -> jugador.get())
//        }


//    public Boolean evitarBloqueos(Jugador jugador){
//        if (equipo.puedenBloquear(jugador)){
//            this.skillsJugador=skillsJugador-2;
//            finTurno();
//        }
//        //return !intentaBloquear(equipoContrario);
//        }

    /** Punto 4.a **/
    public Boolean puedeBloquear(Jugador jugador){
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
