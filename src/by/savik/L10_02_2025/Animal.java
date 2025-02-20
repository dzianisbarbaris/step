package by.savik.L10_02_2025;

    public abstract class Animal {
    protected String name;
    protected String species;
    protected int age;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public abstract String makeSound();

    public abstract String move();

    public abstract String eat();

    @Override
    public String toString() {
        return species + " по имени " + name + " , возраст: " + age;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }
}
