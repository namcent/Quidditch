package main.java;

public class Cazador extends Jugador {
    private Integer punteriaJugador;
    private Integer fuerzaJugador;
    public Pelota pelota;

    /**
     * Constructor
     **/
    public Cazador(Integer punteriaJugador, Integer fuerzaJugador, Double pesoJugador, Double skillsJugador, Escoba escoba, Equipo equipo) {
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

    /**
     * 3a
     **/

    public String tipoJugador(){
        return "Cazador";
    }


    public void perdesLaPelota(Equipo otroEquipo) {
        otroEquipo.cazadorMasRapido();

    }

    public Boolean metioGol (){
        Integer gol = (int) (Math.random() * 2) + 1;
        return gol.equals(2) ;
    }


    public void Jugar(Equipo otroEquipo) {
        if (pelota.tipoPelota().equals("Quaffle")) {
            intentaMeterGol(otroEquipo);
        } else {
            perdesLaPelota(otroEquipo);
        }
    }


    public void intentaMeterGol(Equipo otroEquipo) {
        if (equipo.puedenBloquear(this)) {
            this.skillsJugador = skillsJugador - 2;
            perdesLaPelota(otroEquipo);
        } else {
            if (metioGol()) {
                this.equipo.setPuntajeEquipo(equipo.getPuntajeEquipo() + 10);
                this.skillsJugador = skillsJugador + 5;
            }

        }
    }


}