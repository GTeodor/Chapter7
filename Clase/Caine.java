package Clase;

import Interfete.Animal;

public class Caine  implements Animal {
   protected double greutate;
   protected String nume;

  public Caine(String n, double g) {
       greutate = g;
       nume = n;
   }

   @Override
    public void makeNoise() {
       System.out.println("Cainele " + nume + " face ham ham.");

   }
}
