
public class Buscador extends Jugador {

    private Integer nivelVision;
    private Integer cantTurnosContinuos;
    private Double kmsRecorridos;
    private Boolean buscandoSnitch = false;

    //private Integer skillsJugador;
    //private Integer pesoJugador;

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
        setKmsRecorridos(getKmsRecorridos() +(this.velocidadJugador()/1/6));
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
        if (getKmsRecorridos() == 5000){
            this.skillsJugador=skillsJugador+10;
            this.equipo.setPuntajeEquipo(this.equipo.getPuntajeEquipo()+150);

        }
    }

     public Boolean esBlancoUtil(Equipo miEquipo){
     return buscandoSnitch=true || getKmsRecorridos() <1000;
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
