package main.java;

public class Nimbus implements Escoba{
    public Integer cantDeAniosDesdeFabricacion;
    public Integer porcentajeSaludEscoba;

    Integer velocidadEscoba(){
        return (80 - cantDeAniosDesdeFabricacion) * porcentajeSaludEscoba;
    }
}
