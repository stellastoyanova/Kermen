package app.items;

/**
 * Created by Stella on 7/7/2016.
 */
public class Device {

    private double electricityConsumption;

    public Device(double electricityConsumption) {
        this.setElectricityConsumption(electricityConsumption);
    }

    public double getElectricityConsumption() {
        return electricityConsumption;
    }

    private void setElectricityConsumption(double electricityConsumption) {
        this.electricityConsumption = electricityConsumption;
    }
}
