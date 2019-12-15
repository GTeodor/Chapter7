package Clase;

import Interfete.Animal;

public class Pisica implements Animal {
    protected String nume;
    protected int varsta;

   public Pisica(String n, int v) {
        nume = n;
        varsta = v;
    }

    @Override
    public void makeNoise(){
        System.out.println("Pisica " + nume + " face miau miau.");

    }

}
