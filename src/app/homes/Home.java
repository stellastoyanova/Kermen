package app.homes;


import app.items.Device;
import app.people.Child;
import app.people.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stella on 7/7/2016.
 */
public abstract class Home {

    protected int numberOfRooms;
    protected int electricityCost;
    protected double budget;
    protected double salaries;
    protected double bills;
    protected List<Person> people;
    protected List<Child> children;
    protected List<Device> devices;

    public Home(int numberOfRooms, int electricityCost) {
        this.numberOfRooms = numberOfRooms;
        this.electricityCost = electricityCost;
        this.budget = 0;
        this.salaries = 0;
        this.bills = 0;
        this.people = new ArrayList<>();
        this.children = new ArrayList<>();
        this.devices = new ArrayList<>();
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getElectricityCost() {
        return electricityCost;
    }

    public double getBudget() {
        return budget;
    }

    public int getPeople() {

        return this.people.size() + this.children.size();
    }

    public void receiveSalary() {

        this.budget += this.salaries;
    }

    public void calculateSalaries() {
        this.salaries = this.people.stream()
                .mapToDouble(Person::getSalary)
                .sum();
    }

    public boolean canPayBills() {

        if (this.getConsumption() <= this.getBudget()) {
            this.budget -= this.getConsumption();
            return true;
        }

        return false;

    }

    public double getConsumption() {

        return this.bills;
    }

    public void calculateBills() {

        double bills = 0;
        for (Device device : devices) {

            bills += device.getElectricityConsumption();
        }
        for (Child child : children) {

            bills += child.getFoodConsumption();
            bills += child.calculateToysCost();
        }

        bills += this.numberOfRooms * this.electricityCost;

        this.bills = bills;
    }
}
