package by.savik.L13_02_2025;

public class Lion extends WildAnimal {

    public Lion(String name, int age, String habitat) {
        super(name, "лев", age, habitat);
    }

    @Override
    public String makeSound() {
        return getName() + " рычит: РРРРьььь!";
    }

    @Override
    public String move() {
        return getName() + " быстро бежит по " + super.getHabitat() + ".";
    }

    @Override
    public String eat() {
        return getName() + " ест мясо.";
    }

    @Override
    public String hunt() {
        return getName() + " охотится в Африканской " + super.getHabitat() + ".";
    }
}

