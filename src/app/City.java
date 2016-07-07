package app;

import app.homes.Home;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Created by Stella on 7/7/2016.
 */
public class City {

    private List<Home> homes;

    public City() {
        this.homes = new ArrayList<>();
    }

    public void addHome(Home home) {
        this.homes.add(home);
    }

    public int getPopulation() {
        return this.homes.stream()
                .mapToInt(Home::getPeople)
                .sum();
    }

    public double getConsumption() {
        return this.homes.stream()
                .mapToDouble(Home::getConsumption)
                .sum();
    }

    public void payBills() {
        Iterator<Home> iterator = this.homes.iterator();

        while (iterator.hasNext()) {
            Home home = iterator.next();
            if (!home.canPayBills()) {
                iterator.remove();
            }
        }
    }

    public void receiveSalaries() {
        this.homes.forEach(Home::receiveSalary);
    }
}
