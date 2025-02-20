package by.savik.L10_02_2025;

public class Dog extends Pet{


    public Dog(String name, int age, String ownersName) {
        super(name, "собака", age, ownersName);
    }

    @Override
    public String makeSound() {
        return getName() + " говорит: Гав-гав!";
    }

    @Override
    public String move() {
        return getName() + " бегает на четырёх лапах.";
    }

    @Override
    public String eat() {
        return getName() + " ест собачий корм.";
    }

    public String play() {
        return getName() + " играет с хозяином " + super.getOwnersName();
    }
}
