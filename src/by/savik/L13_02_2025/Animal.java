package by.savik.L13_02_2025;

public abstract class Animal {

    protected int id; // Уникальный идентификатор
    protected String name;
    protected String species;
    protected int age;
    private static int totalAnimals = 0;

    public Animal(String name, String species, int age) {
        this.id = ++totalAnimals;
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public abstract String makeSound();

    public abstract String move();

    public abstract String eat();

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public static int getTotalAnimals() {
        return totalAnimals;
    }

    @Override
    public String toString() {
        return species + " по имени " + name + " , возраст: " + age
                + " (ID: " + id + ")";
    }
}
