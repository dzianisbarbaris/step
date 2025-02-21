package by.savik.L13_02_2025;

import java.util.Random;

public class PetFactory {
    private static String[] petNames = new String[5];

    static {

        petNames[0] = "Мурка";
        petNames[1] = "Барсик";
        petNames[2] = "Беляш";
        petNames[3] = "Черныш";
        petNames[4] = "Жужа";
    }

    public static Pet next() {
        Random random = new Random();
        if (random.nextInt(3) == 0) {
            return new Cat(getPetNames()[random.nextInt(petNames.length)], random.nextInt(1,10));
        } else if (random.nextInt(3) == 1) {
            return new Dog(getPetNames()[random.nextInt(petNames.length)], random.nextInt(1,10));
        }
        else return new Bird(getPetNames()[random.nextInt(petNames.length)], random.nextInt(1,10));
    }

    public static String[] getPetNames() {
        return petNames;
    }
}
