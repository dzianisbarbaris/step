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
        return speed == transport.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(speed);
    }

    @Override
    public String toString() {
        return "Транспорт " + model + " с максимальной скоростью: " + speed;
    }

    @Override
    public int compareTo(Transport o) {
        return 0;
    }
}
