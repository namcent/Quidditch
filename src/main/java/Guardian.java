
public class Guardian extends Jugador {
    private Integer fuerzaJugador;
    private Pelota pelota ;

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

    public Boolean puedeBloquear (Jugador unjugador) {
        Integer numero = (int) (Math.random() * 3) + 1;
        return numero.equals(3) ;
    }



}
