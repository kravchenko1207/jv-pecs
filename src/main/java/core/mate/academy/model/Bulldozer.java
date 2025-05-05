package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String name;
    private double bladeWidth;
    private boolean hasRipper;

    public Bulldozer(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public double getBladeWidth() {
        return bladeWidth;
    }

    public boolean isHasRipper() {
        return hasRipper;
    }

    public void setHasRipper(boolean hasRipper) {
        this.hasRipper = hasRipper;
    }

    public void setBladeWidth(double bladeWidth) {
        this.bladeWidth = bladeWidth;
    }
}
