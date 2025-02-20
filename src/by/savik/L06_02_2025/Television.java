package by.savik.L06_02_2025;

public class Television extends ElectronicDevice {

    private int screenResolution;

    public Television(String brand, String model, int power, int screenResolution) {
        super(brand, model, power);
        this.screenResolution = screenResolution;
    }

    @Override
    public String toString() {
        return super.toString() + " Размер экрана: " + screenResolution + " дюймов";
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
        return isOn ? "Телевизор включён" : "Телевизор выключен";
    }

    @Override
    public boolean isOn() {
        return false;
    }
}
