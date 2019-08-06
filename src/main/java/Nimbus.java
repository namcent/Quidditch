package main.java;

import java.util.Calendar;

public class Nimbus extends Escoba{
    public Integer anioDeFabricacion;
    public Double porcentajeSaludEscoba;
    //public Double valorArbitrario;


    public Nimbus(Integer anioDeFabricacion, Double porcentajeSaludEscoba){
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

//    public Double actualizacionValorArbitrario(){
//        return ;
//    }
}
