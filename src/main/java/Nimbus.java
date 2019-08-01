package main.java;

import java.util.Calendar;

public class Nimbus implements Escoba{
    public Integer anioDeFabricacion;
    public Integer porcentajeSaludEscoba;


    public Nimbus(Integer anioDeFabricacion, Integer porcentajeSaludEscoba){
        this.anioDeFabricacion=anioDeFabricacion;
        this.porcentajeSaludEscoba=porcentajeSaludEscoba;
    }

    public Integer anioActual(){
        return Calendar.getInstance().get(Calendar.YEAR);
    }

    public Integer cantDeAniosDesdeFabricacion(){
        return anioActual()-anioDeFabricacion;
    }

    public Double getPorcentajeSaludEscoba(){
        return porcentajeSaludEscoba/100;
    }
    public Double velocidadEscoba(){
        return (80 - cantDeAniosDesdeFabricacion()) * getPorcentajeSaludEscoba();
    }
}
