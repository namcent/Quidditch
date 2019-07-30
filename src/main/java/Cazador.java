package main.java;

public class Cazador extends Jugador {
    public Integer habilidadJugador(){
        return velocidadJugador()+ skillsJugador + punteriaJugador * fuerzaJugador;
    }
}
