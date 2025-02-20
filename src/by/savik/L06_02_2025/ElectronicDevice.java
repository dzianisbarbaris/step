package by.savik.L06_02_2025;

public abstract class ElectronicDevice {
    protected String brand;
    protected String model;
    protected int power;
    protected boolean isOn;

    public ElectronicDevice(String brand, String model, int power) {
        this.brand = brand;
        this.model = model;
        this.power = power;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    @Override
    public String toString() {
        return "Устройство " + brand + " " + model + ", мощность: " + power + " Вт";
    }

    public abstract String getStatus();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public abstract boolean isOn();

    public void setOn(boolean on) {
        isOn = on;
    }
}
