package main.java;

import main.java.Utils.Functions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Buscador extends Jugador {
    private Functions functions = new Functions ();
    private Integer nivelVision;
    private Integer cantTurnosContinuos;
    private Double kmsRecorridos;
    private Boolean buscandoSnitch = false;
    //private Integer skillsJugador;
    //private Integer pesoJugador;

    /**Constructor**/
    public Buscador(Integer nivelReflejos, Integer nivelVision, Double pesoJugador, Integer skillsJugador, Escoba escoba, Equipo equipo){
        super(nivelReflejos ,pesoJugador, skillsJugador, escoba, equipo);
        this.nivelVision = nivelVision;
        //this.skillsJugador = skillsJugador;
        //this.pesoJugador = pesoJugador;
    }

    public Double habilidadJugador(){
        return super.habilidadJugador() + nivelReflejos * nivelVision;
    }

    /** Punto 3 **/
    public String tipoJugador(){
        return "Buscador";
    }

    public void jugar(Equipo otroEquipo){
        cantTurnosContinuos=cantTurnosContinuos+1;
        kmsRecorridos=kmsRecorridos+(this.velocidadJugador()/1/6);
        buscarSnitch(otroEquipo);
    }

    public void buscarSnitch(Equipo otroEquipo){
        buscandoSnitch=true;
        List<Integer> rango = IntStream.rangeClosed(1, 1000).boxed().collect(Collectors.toList());
        Integer numero = functions.getRandomElement(rango);
        if (numero<habilidadJugador()+cantTurnosContinuos){
            perseguirSnitch();
        }else{
            jugar(otroEquipo);
        }
    }
    public void perseguirSnitch(){
        if (kmsRecorridos == 5000){
            this.skillsJugador=skillsJugador+10;
            this.equipo.puntajeEquipo=equipo.puntajeEquipo+150;
        }
    }

    public Boolean esBlancoUtil(Equipo miEquipo){
        return buscandoSnitch=true || kmsRecorridos>=4000;
    }

    /**Punto 4.a**/
    public Boolean puedeBloquear (Jugador jugador){
        return false;
    }

    /** Punto 4.c **/
    public void esGolpeadoPorUnaBludger(Equipo otroEquipo){
        super.esGolpeadoPorUnaBludger();
        buscarSnitch(otroEquipo);
    }
}
