package by.savik.L06_02_2025;

public class Laptop extends ElectronicDevice {

    private int batteryTime;

    public Laptop(String brand, String model, int power, int batteryTime) {
        super(brand, model, power);
        this.batteryTime = batteryTime;
    }

    @Override
    public String toString() {
        return super.toString() + " Время работы от батареи: " + batteryTime;
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public String getStatus() {
        return  isOn ? "Ноутбук включен" : "Ноутбук выключен";
    }

    @Override
    public boolean isOn() {
        return false;
    }
}
