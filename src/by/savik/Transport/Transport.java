package by.savik.Transport;

import java.util.Objects;

public abstract class Transport implements Comparable<Transport>{
    private String model;
    private int speed;

    public Transport(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(model);
    }

    @Override
    public int compareTo(Transport o) {
        int modelCompare = this.model.compareTo(o.model);
        if(modelCompare != 0) {
            return modelCompare;
        }
        return Integer.compare(this.speed, o.speed);
    }

    @Override
    public String toString() {
        return "Транспорт " + model + " с максимальной скоростью: " + speed;
    }


}
