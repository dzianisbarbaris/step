package by.savik.L23_01_2025;

import java.util.Random;

public class Building {
    int windows;
    int doors;
    String material;
    String street;
    int height;
    int yearBuilt;

    public Building(int windows, int doors, String material, String street) {
        this.windows = windows;
        this.doors = doors;
        this.material = material;
        this.street = street;
    }

    public String getDescription() {
        return "Здание на улице " + this.street + " " + this.windows + " окон " + this.doors + " дверей" + " из " + this.material + " высотой " + this.height + " метров " + this.yearBuilt + " года постройки ";
    }

    public Building(int windows, int doors, String material, String street, int height, int yearBuilt) {
        this.windows = windows;
        this.doors = doors;
        this.material = material;
        this.street = street;
        this.height = height;
        this.yearBuilt = yearBuilt;
    }
}
