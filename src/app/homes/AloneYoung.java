package app.homes;

import app.items.Device;
import app.people.Person;

/**
 * Created by Stella on 7/7/2016.
 */
public class AloneYoung extends Home {
    private static final int NUMBER_OF_ROOMS = 1;
    private static final int ELECTRICITY_COST = 10;

    public AloneYoung(double alonePerson, double laptop) {
        super(NUMBER_OF_ROOMS, ELECTRICITY_COST);
        this.people.add(new Person(alonePerson));
        this.devices.add(new Device(laptop));
    }
}
