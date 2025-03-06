package by.savik.Transport;

public class Car extends Transport{
    private String fuelType;

    public Car(String model, int speed, String fuelType) {
        super(model, speed);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public String toString() {
        return super.toString() + " тип топлива " + fuelType + ".";
    }
}
