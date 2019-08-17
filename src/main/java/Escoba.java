package main.java;

public abstract class Escoba {

    //valor que hace refenrecia a la velocidad de las escobas y su actualizacion//

    private static Double valorArbitrario;

    public Double getValorArbitrario() {
        return valorArbitrario;
    }

    public void setValorArbitrario(Double valorArbitrario) {
        this.valorArbitrario = valorArbitrario;
    }

    public abstract Double velocidadEscoba();

    /**Punto 4.c **/
    public abstract void recibeGolpe();
}


