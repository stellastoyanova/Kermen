package app.people;

import app.items.Toy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stella on 7/7/2016.
 */
public class Child {

    private double foodConsumption;
    private List<Toy> toys;

    public Child(double foodConsumption) {
        this.setFoodConsumption(foodConsumption);
        this.toys = new ArrayList<>();
    }

    public double getFoodConsumption() {
        return foodConsumption;
    }

    private void setFoodConsumption(double foodConsumption) {
        this.foodConsumption = foodConsumption;
    }

    public void addToy(Toy toy){

        this.toys.add(toy);
    }

    public double calculateToysCost() {

        double toysCost = 0;
        for (Toy toy : toys) {

            toysCost += toy.getToyCost();

        }

        return toysCost;
    }
}
