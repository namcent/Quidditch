package main.java;

public class Cazador extends Jugador {
    public int habilidadJugador(){
        return velocidadJugador()+ skillsJugador + punteriaJugador * fuerzaJugador;
    }
}
