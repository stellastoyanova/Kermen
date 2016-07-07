package app.people;

/**
 * Created by Stella on 7/7/2016.
 */
public class Person {

    private double salary;

    public Person(double salary) {
        this.setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    private void setSalary(double salary) {
        this.salary = salary;
    }
}
