package main.java;

import main.java.Utils.Functions;

import java.util.List;
//import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Guardian extends Jugador {
    private Functions functions = new Functions ();
    private Integer fuerzaJugador;
    private Pelota pelota;
    //private Integer skillsJugador;
    //private Integer pesoJugador;

    /**Constructor**/
    public Guardian(Integer nivelReflejos, Integer fuerzaJugador, Double pesoJugador, Integer skillsJugador, Escoba escoba, Equipo equipo, Pelota pelota){
        super(nivelReflejos, pesoJugador, skillsJugador, escoba, equipo);
        this.fuerzaJugador = fuerzaJugador;
        this.pelota = pelota;
        //this.skillsJugador = skillsJugador;
        //this.pesoJugador = pesoJugador;
    }

    public Double habilidadJugador(){
        return super.habilidadJugador()+ nivelReflejos + fuerzaJugador;
    }

    /** Punto 3 **/
    public String tipoJugador(){
        return "Guardian";
    }

    public Boolean esBlancoUtil(Equipo miEquipo){
        return !miEquipo.equipoTieneLaQuaffle();
    }

    public void jugar(Equipo otroEquipo){} //Tiene que ir si o si, y puede ir vacio

    /**Punto 4.a**/
    public Boolean puedeBloquear (Jugador jugador){
        List<Integer> rango = IntStream.rangeClosed(1, 3).boxed().collect(Collectors.toList());
        Integer numero = functions.getRandomElement(rango);
        return numero.equals(3);
    } //en los del equipo contrario

}
