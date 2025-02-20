package by.savik.L10_02_2025;

public class Cat extends Pet {


    public Cat(String name, int age, String ownersName) {
        super(name, "кот", age, ownersName);
    }

    @Override
    public String play() {
        return getName() + " играет с хозяином " + super.getOwnersName();
    }

    @Override
    public String makeSound() {
        return getName() + " говорит: Мяу!";
    }

    @Override
    public String move() {
        return getName() + " грациозно крадётся.";
    }

    @Override
    public String eat() {
        return getName() + " ест рыбу.";
    }
}
