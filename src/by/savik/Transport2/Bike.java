package by.savik.Transport2;

public class Bike extends Transport {
    private boolean hasSidecar;

    public Bike(String model, int speed, String licensePlate, int year, boolean hasSidecar, User user) {
        super(model, speed, licensePlate, year, user);
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    @Override
    public String toString() {
        return super.toString() + (hasSidecar? " с коляской." : " без коляски.");
    }
}
