package main.java;

public class Cazador extends Jugador {
    private Integer punteriaJugador;
    private Integer fuerzaJugador;
    //private Integer skillsJugador;
    //private Integer pesoJugador;

    /** Constructor **/
    public Cazador(Integer punteriaJugador, Integer fuerzaJugador, Double pesoJugador, Integer skillsJugador, Integer nivelReflejos, Escoba escoba, Equipo equipo){
        super(pesoJugador, skillsJugador, nivelReflejos, escoba, equipo);
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
        if (this.tenesLaQuaffle()){
            intentaMeterGol(otroEquipo);
        }else{
            finTurno(otroEquipo);
        }
    }

// LO PASE A JUGADOR PARA QUE PUEDA PREGUNTAR SI DETODO EL EQUIPO ALGUNO TIENE LA QUAFFLE
//    public void tenesLaQuaffle(){
//        if (this.pelota.tipoPelota().equals("Quaffle")){
//            tieneLaQuaffle=true;
//        }
//    }
//
//    private Boolean tieneLaQuaffle=false;


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
    public Boolean esBlancoUtil(Equipo miEquipo){
        return tenesLaQuaffle();
    }

    /** Punto 4.a **/
    public Boolean puedeBloquear(Jugador jugador){
        return this.lePasaElTrapo(jugador);
    } //en los del equipo contrario

    /** Punto 4.c **/
    public void esGolpeadoPorUnaBludger(Equipo otroEquipo){
        super.esGolpeadoPorUnaBludger();
        if (tenesLaQuaffle()){
            tieneLaQuaffle=false;
        }
    }

    //public Boolean pudoBloquear(Jugador jugador){return finTurno();}

}
