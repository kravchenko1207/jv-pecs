package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public void landCleanup() {
        System.out.println("Bulldozer started to clean the land");
    }

    public void scraperPush() {
        System.out.println("Bulldozer started to push the scrap");
    }
}
