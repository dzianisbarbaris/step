package by.savik.Transport2;

import java.util.Objects;

public abstract class Transport implements Comparable<Transport> {
    private String model;
    private int speed;
    private String licensePlate;
    private User user;
    private int year;


    public Transport(String model, int speed, String licensePlate, int year, User user) {
        this.model = model;
        this.speed = speed;
        this.licensePlate = licensePlate;
        this.year = year;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public String getLicensePlate() {
        return licensePlate;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(licensePlate, transport.licensePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(licensePlate);
    }

    @Override
    public int compareTo(Transport o) {
        int licenseCompare = this.model.compareTo(o.model);
        if(licenseCompare != 0) {
            return licenseCompare;
        }
        return Integer.compare(this.speed, o.speed);
    }

    @Override
    public String toString() {
        return "Транспорт " + model + " с максимальной скоростью: " + speed + " номерной знак " + licensePlate;
    }

}
