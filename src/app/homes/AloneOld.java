package app.homes;

import app.people.Person;

/**
 * Created by Stella on 7/7/2016.
 */
public class AloneOld extends Home {
    private static final int NUMBER_OF_ROOMS = 1;
    private static final int ELECTRICITY_COST = 15;

    public AloneOld(double alonePerson) {
        super(NUMBER_OF_ROOMS, ELECTRICITY_COST);
        this.people.add(new Person(alonePerson));
    }
}
