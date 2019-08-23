import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Buscador extends Jugador {

    private Integer nivelVision;
    private Integer cantTurnosContinuos;
    private Double kmsRecorridos;
    private Boolean buscandoSnitch = false;
    private main.java.Utils.Functions functions = new main.java.Utils.Functions();


    /**
     * Constructor
     **/
    public Buscador(Integer nivelReflejos, Double pesoJugador, Double skillsJugador, Escoba escoba, Equipo equipo,Integer nivelVision) {
        super( nivelReflejos, pesoJugador, skillsJugador, escoba, equipo);
        this.nivelVision = nivelVision;


    }

    public String tipoJugador() {
        return "Buscador";
    }

    public Double habilidadJugador() {
        return super.habilidadJugador() + nivelReflejos * nivelVision;
    }




    public void jugar(){
        cantTurnosContinuos=cantTurnosContinuos+1;
        setKmsRecorridos(getKmsRecorridos() + (this.velocidadJugador()/1/6));
        buscarSnitch();
    }

    public void buscarSnitch(){
        buscandoSnitch=true;
        List<Integer> rango = IntStream.rangeClosed(1, 1000).boxed().collect(Collectors.toList());
        Integer numero = functions.getRandomElement(rango);
        if (numero<habilidadJugador()+cantTurnosContinuos){
            perseguirSnitch();
        }else{

            jugar();
        }
    }
    public void perseguirSnitch(){
        if (getKmsRecorridos() == 5000){
            this.skillsJugador=skillsJugador+10;
            this.equipo.setPuntajeEquipo(this.equipo.getPuntajeEquipo()+150);

        }
    }

     public Boolean esBlancoUtil(Equipo miEquipo){
     return buscandoSnitch=true || getKmsRecorridos() <4000;
     }

    //4a//

    public Boolean puedeBloquear(Jugador unjugador) {
        return false;
    }


    public Double getKmsRecorridos() {
        return kmsRecorridos;
    }

    public void setKmsRecorridos(Double kmsRecorridos) {
        this.kmsRecorridos = kmsRecorridos;
    }
}
