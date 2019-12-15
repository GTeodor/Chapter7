package client;

import Wrestlers.Kane;
import Wrestlers.StoneCold;
import Wrestlers.Wrestler;

public class Main {
    public static void main(String[] args) {
        Wrestler wrestler1 = new Kane();
        Wrestler wrestler2 = new StoneCold();

        wrestler1.themeMusic();
        wrestler1.finisher();
        wrestler1.paymentForWork(5);
        System.out.println();

        wrestler2.themeMusic();
        wrestler2.finisher();
        wrestler2.paymentForWork(3);


    }
}
