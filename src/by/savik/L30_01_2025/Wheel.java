package by.savik.L30_01_2025;

public class Wheel {
    String type;
    int diameter;
    String material;

    // Shift+F6 - переименовать везде
    public Wheel(String type, int diameter, String material) {
        this.type = type;
        this.diameter = diameter;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "type='" + type + '\'' +
                ", diameter=" + diameter +
                ", material='" + material + '\'' +
                '}';
    }
}
