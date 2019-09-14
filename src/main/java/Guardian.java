import main.java.Utils.Functions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Guardian extends Jugador {
    private Integer fuerzaJugador;
    private Pelota pelota ;
    private Functions functions = new Functions ();


    public String tipoJugador () {
        return "Guardian" ;
    }

    /**Constructor**/
    public Guardian(Integer nivelReflejos, Integer fuerzaJugador, Double pesoJugador, Double skillsJugador, Escoba escoba, Equipo equipo, Pelota pelota){
        super(nivelReflejos, pesoJugador, skillsJugador, escoba, equipo);
        this.fuerzaJugador = fuerzaJugador;

    }

    public Double habilidadJugador(){
        return super.habilidadJugador()+ nivelReflejos + fuerzaJugador;
    }

    public Boolean esBlancoUtil(Equipo miEquipo){
        return !miEquipo.equipoTieneLaQuaffle();
    }


    /**4a**/

    public void setFunctions(main.java.Utils.Functions functions) {
        this.functions = functions;
    }

    public Boolean puedeBloquear (Jugador unjugador) {
        List<Integer> rango = IntStream.rangeClosed(1, 3).boxed().collect(Collectors.toList());
        Integer numero = functions.getRandomElement(rango);
        return numero.equals(3) ;
    }



}
