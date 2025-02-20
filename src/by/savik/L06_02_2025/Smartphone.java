package by.savik.L06_02_2025;

public class Smartphone extends ElectronicDevice {
    private int cameraResolution;

    public Smartphone(String brand, String model, int power, int cameraResolution) {
        super(brand, model, power);
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return super.toString() + " Разрешение камеры: " + cameraResolution;
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
        return  isOn ? "Смартфон включен" : "Смартфон выключен";
    }

    @Override
    public boolean isOn() {
        return false;
    }
}
