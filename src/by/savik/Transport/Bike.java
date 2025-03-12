package by.savik.Transport;

public class Bike extends Transport{
    private boolean hasSidecar;

    public Bike(String model, int speed, String licensePlate, boolean hasSidecar) {
        super(model, speed, licensePlate);
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
