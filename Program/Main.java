package Program;

import Clase.Caine;
import Clase.Pisica;
import Interfete.Animal;

public class Main {
    public static void main(String[] args) {
        Animal c = new Caine("Grivei", 10.5);
        Animal p = new Pisica("Mita", 5);

        c.makeNoise();
        p.makeNoise();
    }
}
