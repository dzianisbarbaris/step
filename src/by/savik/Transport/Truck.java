package by.savik.Transport;

public class Truck extends Transport{
    private int loadCapacity;
    public Truck(String model, int speed, int loadCapacity) {
        super(model, speed);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + " грузоподъёмностью " + loadCapacity + " тонн.";
    }
}
