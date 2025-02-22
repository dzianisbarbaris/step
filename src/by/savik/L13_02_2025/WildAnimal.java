package by.savik.L13_02_2025;

public abstract class WildAnimal extends Animal {
    protected String habitat;

    public WildAnimal(String name, String species, int age, String habitat) {
        super(name, species, age);
        this.habitat = habitat;
    }
    public abstract String hunt();

    public String getHabitat() {
        return habitat;
    }
}
