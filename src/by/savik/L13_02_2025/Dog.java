package by.savik.L13_02_2025;

public class Dog extends Pet {


    public Dog(String name, int age) {
        super(name, "собака", age);
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

}
