package by.savik.L13_02_2025;

public class Bird extends Pet {

    public Bird(String name, int age) {
        super(name, "птица", age);
    }

    @Override
    public String makeSound() {
        return getName() + " чирикает: Чик-Чирик!";
    }

    @Override
    public String move() {
        return getName() + " летает в небе.";
    }

    @Override
    public String eat() {
        return getName() + " клюёт зёрна.";
    }
}
