package main.java;

public class Buscador extends Jugador {
    private Integer nivelReflejos;
    private Integer nivelVision;
    private Integer cantTurnosContinuos;
    private Double kmsRecorridos;
    //private Integer skillsJugador;
    //private Integer pesoJugador;

    /**Constructor**/
    public Buscador(Integer nivelReflejos, Integer nivelVision, Double pesoJugador, Integer skillsJugador, Escoba escoba, Equipo equipo){
        super(pesoJugador, skillsJugador, escoba, equipo);
        this.nivelReflejos = nivelReflejos;
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

    public void jugar(){
        cantTurnosContinuos=cantTurnosContinuos+1;
        kmsRecorridos=kmsRecorridos+(this.velocidadJugador()/1/6);
        buscarSnitch();
    }

    public void buscarSnitch(){
        Integer numero = (int) (Math.random() * 1000) + 1;
        if (numero<habilidadJugador()+cantTurnosContinuos){
            perseguirSnitch();
        }else{
            jugar();
        }
    }
    public void perseguirSnitch(){
        if (kmsRecorridos == 5000){
            this.skillsJugador=skillsJugador+10;
            this.equipo.puntajeEquipo=equipo.puntajeEquipo+150;
        }
    }

    /**Punto 4.a**/
    public Boolean puedeBloquear (Jugador jugador){
        return false;
    }
}
