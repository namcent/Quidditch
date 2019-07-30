package main.java;

public class Nimbus implements Escoba{
    public Integer anioDeFabricacion;
    public Integer porcentajeSaludEscoba;

    public Integer anioActual(){
        return new Date().getYear();
    }

    public Nimbus(Integer anioDeFabricacion, Integer porcentajeSaludEscoba){
        this.anioDeFabricacion=anioDeFabricacion;
        this.porcentajeSaludEscoba=porcentajeSaludEscoba;
    }

    public Integer cantDeAniosDesdeFabricacion(){
        return anioActual-anioDeFabricacion;
    }

    public Integer velocidadEscoba(){
        return (80 - cantDeAniosDesdeFabricacion()) * porcentajeSaludEscoba;
    }
}
