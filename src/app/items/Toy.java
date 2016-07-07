package app.items;

/**
 * Created by Stella on 7/7/2016.
 */
public class Toy {

    private double toyCost;

    public Toy(double toyCost) {
        this.setToyCoast(toyCost);
    }

    public double getToyCost() {
        return toyCost;
    }

    private void setToyCoast(double toyCost) {
        this.toyCost = toyCost;
    }
}
