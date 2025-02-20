package by.savik.L30_01_2025;

import java.util.Arrays;

public class Car {
    String make;
    String model;
    int year;
    Wheel[] wheel;

    // конструктор Alt+Insert

    public Car(String make, String model, int year, Wheel[] wheel) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", wheel=" + Arrays.toString(wheel) +
                '}';
    }
}
