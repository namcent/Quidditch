
import main.java.Utils.Functions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Cazador extends Jugador {
    private Functions functions = new Functions ();
    private Integer punteriaJugador;
    private Integer fuerzaJugador;
    public Pelota pelota;

    /**
     * Constructor
     **/
    public Cazador(Integer nivelReflejo, Integer punteriaJugador, Integer fuerzaJugador, Double pesoJugador, Double skillsJugador, Escoba escoba, Equipo equipo,Pelota pelota) {
        super(nivelReflejo, pesoJugador, skillsJugador, escoba, equipo);
        this.punteriaJugador = punteriaJugador;
        this.fuerzaJugador = fuerzaJugador;
        this.pelota= pelota;
    }

    public Double habilidadJugador() {
        return super.habilidadJugador() + punteriaJugador * fuerzaJugador;
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
        List<Integer> rango = IntStream.rangeClosed(1, 2).boxed().collect(Collectors.toList());
        Integer gol = functions.getRandomElement(rango);
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

    public Boolean esBlancoUtil(Equipo miEquipo){
        return pelota.tipoPelota().equals("Quaffle");
    }

    /**4a**/

    public Boolean puedeBloquear(Jugador unjugador) {
        return this.lePasaElTrapo(unjugador);
    }


    public void setFunctions(Functions functions) {
    this.functions = functions;
}
}