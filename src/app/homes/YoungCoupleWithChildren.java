package app.homes;

import app.items.Device;
import app.people.Child;
import app.people.Person;

import java.util.List;

/**
 * Created by Stella on 7/7/2016.
 */
public class YoungCoupleWithChildren extends Home {
    private static final int NUMBER_OF_ROOMS = 2;
    private static final int ELECTRICITY_COST = 30;

    public YoungCoupleWithChildren(double male, double female, double tv, double fridge, double laptop, List<Child> children) {
        super(NUMBER_OF_ROOMS, ELECTRICITY_COST);
        this.people.add(new Person(male));
        this.people.add(new Person(female));
        this.devices.add(new Device(tv));
        this.devices.add(new Device(fridge));
        this.devices.add(new Device(laptop));
        this.devices.add(new Device(laptop));
        this.children.addAll(children);
    }
}
