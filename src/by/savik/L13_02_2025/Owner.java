package by.savik.L13_02_2025;

import java.util.Arrays;
import java.util.Random;

public class Owner {
    private int id;
    private String name;
    private String surName;
    private String sex;
    private static String[] names = new String[5];
    private static String[] surNames = new String[5];
    private int size;
    private Pet[] pets = new Pet[0];
    private static int totalOwners = 0;
    private int totalPets = 0;
    static {
        System.out.println("Класс Owner загружен в память!");
        System.out.println();

        names[0] = "Олег";
        names[1] = "Анна";
        names[2] = "Игорь";
        names[3] = "Оля";
        names[4] = "Женя";

        surNames[0] = "Моисенко";
        surNames[1] = "Коваленко";
        surNames[2] = "Савик";
        surNames[3] = "Розенблатт";
        surNames[4] = "Петренко";

    }

    private Random random = new Random();

    public Owner() {
        this.name = names[random.nextInt(names.length)];
        this.surName = surNames[random.nextInt(names.length)];
        this.sex = random.nextBoolean() ? "Мужской" : "Женский";
        this.id = ++totalOwners;
    }

    public int getTotalPets() {
        return totalPets;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurName() + " " + getTotalPets();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pet[] getPets() {
        return pets;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    public static int getTotalOwners() {
        return totalOwners;
    }


    public void addPet(Pet pet) {
        if (size < pets.length) {
            pets[size++] = pet;
        } else {
            Pet[] pets1 = new Pet[pets.length + 1];
            System.arraycopy(pets, 0, pets1, 0, pets.length);
            pets1[pets.length] = pet;
            pets = pets1;
        }
        pet.setOwner(this);
        ++totalPets;
    }
}
