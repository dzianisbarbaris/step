package by.savik.L10_02_2025;

public class Bird extends Pet {


    public Bird(String name, int age, String ownersName) {
        super(name, "птица", age, ownersName);
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

    public String play() {
        return getName() + " играет с хозяином " + super.getOwnersName();
    }
}
