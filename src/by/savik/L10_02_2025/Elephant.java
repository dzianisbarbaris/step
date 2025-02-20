package by.savik.L10_02_2025;

public class Elephant extends WildAnimal {

    public Elephant(String name, int age, String habitat) {
        super(name, "слон", age, habitat);
    }

    @Override
    public String makeSound() {
        return getName() + " говорит по-слонячьи: Гу-Гу-Гуууу!";
    }

    @Override
    public String move() {
        return getName() + " быстро бежит по " + super.getHabitat() + ".";
    }

    @Override
    public String eat() {
        return getName() + " ест фрукты.";
    }

    public String hunt() {
        return getName() + " охотится на траву в Индийских " + super.getHabitat() + ".";
    }
}
