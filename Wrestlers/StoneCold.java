package Wrestlers;

public class StoneCold implements Wrestler {

    @Override
    public void themeMusic() {
        System.out.println("Stone Cold`s Intro Music");
    }

    @Override
    public void finisher() {
        System.out.println("Stone Cold Stunner");
    }

    @Override
    public void paymentForWork(int hours) {
        System.out.println("The Wrestler will make $" + 650.00 * hours + " for tonight`s match.");
    }
}
