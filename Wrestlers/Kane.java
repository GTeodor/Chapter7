package Wrestlers;

import java.util.Calendar;

public class Kane implements Wrestler {
    @Override
    public void themeMusic() {
        System.out.println("Kane`s Intro Music");

    }

    @Override
    public void finisher() {
        System.out.println("Tombstone");
    }

    @Override
    public void paymentForWork(int hours) {
        System.out.println("The Wrestler will make $" + 450.00 * hours + " tonight match");
    }
}
