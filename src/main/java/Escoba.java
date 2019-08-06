package main.java;

public abstract class Escoba {

    /** Punto 2.b **/

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
}
