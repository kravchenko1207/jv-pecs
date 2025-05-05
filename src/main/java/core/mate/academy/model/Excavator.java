package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public void digUpTheSoil() {
        System.out.println("Excavator started to dig up the soil");
    }

    public void moveLoad() {
        System.out.println("Excavator started to move the load");
    }
}
