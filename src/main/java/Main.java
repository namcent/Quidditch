package main.java;

public class Main {
     public static void main(String[] args) {


          Equipo Grynffindor = new Equipo();
          Nimbus nimbus1 = new Nimbus(2012, 60.00);
          Cazador cazador1 = new Cazador(70, 80, 50.00, 80.0, nimbus1, Grynffindor);
          Equipo Slytherin =new Equipo ();


          cazador1.metioGol ();
          System.out.println(cazador1.metioGol());

          cazador1.tipoJugador();
          System.out.println(cazador1.tipoJugador());


     }

}
