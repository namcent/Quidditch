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

    public void jugar(Equipo otroEquipo){
        if (pelota.tipoPelota().equals("Quaffle")){
            intentaMeterGol(otroEquipo);
        }else{
            finTurno(otroEquipo);
        }
    }

    public void intentaMeterGol(Equipo otroEquipo) {
        if (equipo.puedenBloquear(this)) {
            this.skillsJugador = skillsJugador - 2;
            skillsJugador=skillsJugador+10; //????
            //yaNoLoBloquean();
            finTurno(otroEquipo);
        } else {
            if (metioGol()) {
                this.equipo.puntajeEquipo = equipo.puntajeEquipo + 10;
                this.skillsJugador = skillsJugador + 5;
            }
        }
    }

    public Boolean metioGol(){
        Integer gol = (int) (Math.random() * 2) + 1;
        return gol.equals(2);
    }
    public String tipoJugador(){
        return "Cazador";
    }

    public void finTurno(Equipo otroEquipo){
        otroEquipo.cazadorMasRapido();
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

    //public Boolean pudoBloquear(Jugador jugador){return finTurno();}

}
