import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Equipo {
    private List<Jugador> jugadores = new ArrayList<>();
    public String nombre;
    protected Integer puntajeEquipo = 0;
    private main.java.Utils.Functions functions = new main.java.Utils.Functions();


    /** Punto 2.c **/
    //equipo1.tieneUnJugadorEstrella(equipoquenotiene)//

    public Boolean tieneJugadorEstrella(Equipo segundoEquipo){
       return getJugadores().stream().anyMatch(jugador -> segundoEquipo.lePasaElTrapoATodos(jugador));
    }

    //equipoquenotiene.lePasaElTrapoATodos (jugadorquepasaatodos)//

    public Boolean lePasaElTrapoATodos(Jugador unJugador){
        return getJugadores().stream().allMatch(jugador -> unJugador.lePasaElTrapo(jugador));
    }


    public void agregarJugador(Jugador jugador) {
        getJugadores().add(jugador);
    }

    public Double promedioHabilidadEquipo() {
        return (getJugadores().stream().map(jugador -> jugador.habilidadJugador()).reduce(0.0, Double::sum)) / getJugadores().size();
    }

    //* Punto 3 */
    /* Inicio Random */
    public Jugador jugadorQueJuegaElTurno(){
        List<Integer> rango = IntStream.range(1, jugadores.size()).boxed().collect(Collectors.toList());
        return jugadores.get(functions.getRandomElement(rango));
    }

    /* Fin Random */
    //porque el equipo conoce a sus jugadores//

    public Boolean puedenBloquear(Jugador unjugador){
        return this.getJugadores().stream()
                .anyMatch(jugador -> jugador.puedeBloquear(unjugador));
    }

    /**cazador mas rapido**/


    public List<Jugador> listaDeCazadores(){
        return getJugadores().stream()
                .filter(jugador->jugador.tipoJugador().equals("Cazador"))
                .collect(Collectors.toList());
    }
    //de la lista de cazadores saco el mas rapido//

    public Jugador cazadorMasRapido(){
        return this.listaDeCazadores().stream()
                .max(Comparator.comparing(jugador->jugador.velocidadJugador())).get();
    }

    public Boolean equipoTieneLaQuaffle(){
        return getJugadores().stream().anyMatch(jugador -> jugador.tenesLaQuaffle());
    }

    public Integer getPuntajeEquipo() {
        return puntajeEquipo;
    }

    public void setPuntajeEquipo(Integer puntajeEquipo) {
        this.puntajeEquipo = puntajeEquipo;
    }


    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
