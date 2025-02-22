package by.savik.L13_02_2025;

public abstract class Pet extends Animal {
    private Owner owner;

    public Pet(String name, String species, int age) {
        super(name, species, age);
    }

    public String play() {
        return getOwner() != null ? getName() + " играет с хозяином " + getOwnersName() : getName() + " грустит без хозяина ";
    }

    public String getOwnersName() {
        return owner.getName();
    }

    @Override
    public String toString() {
        return getOwner() != null ? super.toString() + " (Домашнее животное, хозяин " + getOwnersName() + ")" : super.toString() + " (Домашнее животное, без хозяина) ";
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
