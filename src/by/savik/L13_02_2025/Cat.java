package by.savik.L13_02_2025;

public class Cat extends Pet {


    public Cat(String name, int age) {
        super(name, "кот", age);
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
