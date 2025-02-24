package by.savik.L13_02_2025;

public class Bird extends Pet implements Flyable, Swimable {

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

    @Override
    public void fly() {
        System.out.println(name + "летает");
    }

    @Override
    public void swim() {
        System.out.println(name + "плывёт");
    }
}
