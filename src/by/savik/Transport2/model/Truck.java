package by.savik.Transport2.model;

public class Truck extends Transport {
    private int loadCapacity;

    public Truck(String model, int speed, String licensePlate, int year, int loadCapacity, User user) {
        super(model, speed, licensePlate, year, user);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + " грузоподъёмностью " + loadCapacity + " тонн." + "\n";
    }
}
