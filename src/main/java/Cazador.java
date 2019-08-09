package main.java;

public class Cazador extends Jugador {
    private Integer punteriaJugador;
    private Integer fuerzaJugador;
    public Pelota pelota;

    /**
     * Constructor
     **/
    public Cazador(Integer punteriaJugador, Integer fuerzaJugador, Double pesoJugador, Integer skillsJugador, Escoba escoba, Equipo equipo) {
        super(pesoJugador, skillsJugador, escoba, equipo);
        this.punteriaJugador = punteriaJugador;
        this.fuerzaJugador = fuerzaJugador;
    }

    public Double habilidadJugador() {
        return super.habilidadJugador() + punteriaJugador * fuerzaJugador;
    }

    /**
     * 4a
     **/

    public Boolean puedeBloquear(Jugador unjugador) {
        return this.lePasaElTrapo(unjugador);
    }

    //3a//

    public void perdesLaPelota(Equipo otroEquipo) {
         return
    }

    }

    public Boolean Jugar() {
        if (pelota.tipoPelota().equals("Quaffle")) {
            return intentaMeterGol();
        } else {
             return perdesLaPelota ();
        }
    }


//return equipo.puedenBloquear(this) ;//

    public Boolean intentaMeterGol() {
        if (equipo.puedenBloquear(this)) {
            this.skillsJugador = skillsJugador - 2;
            perdesLaPelota(); //pierde la quaffle, la agarra el cazador mas rapido//
        } else {
            if (metioGol()) {
                this.equipo.setPuntajeEquipo(equipo.getPuntajeEquipo() + 10);
                this.skillsJugador = skillsJugador + 5;
            }


        }
    }




