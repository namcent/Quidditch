package main.java;

public abstract class Escoba {

    /** Punto 2.b **/
    //valor que hace referencia a la velocidad de las escobas y su actualizacion
    private static Double valorArbitrario;

    public Double getValorArbitrario() {
        return valorArbitrario;
    }

    public void setValorArbitrario(Double valorArbitrario) {
        this.valorArbitrario = valorArbitrario;
    }

    public abstract Double velocidadEscoba();

    //package main.java;
    //
    //public interface Escoba {
    //    Double velocidadEscoba();
    //}

    /**Punto 4.c **/
    public abstract void recibeGolpe();
}
