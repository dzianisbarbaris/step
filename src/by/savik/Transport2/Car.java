package by.savik.Transport2;

public class Car extends Transport {
    private String fuelType;

    public Car(String model, int speed, String licensePlate, int year, String fuelType, User user) {
        super(model, speed, licensePlate, year, user);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public String toString() {
        return super.toString() + " тип топлива " + fuelType + "\n";
    }
}
