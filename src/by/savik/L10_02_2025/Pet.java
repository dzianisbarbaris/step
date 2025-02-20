package by.savik.L10_02_2025;

public abstract class Pet extends Animal {
    protected String ownersName;

    public Pet(String name, String species, int age, String ownersName) {
        super(name, species, age);
        this.ownersName = ownersName;
    }

    public abstract String play();

    public String getOwnersName() {
        return ownersName;
    }
}
