package by.savik.L14_04_2025;

public class Apple {
    private int weight;
    private Color color;

    public Apple() {
    }

    public Apple(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColour() {
        return color;
    }

    public void setColour(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", colour=" + color +
                '}';
    }
}
