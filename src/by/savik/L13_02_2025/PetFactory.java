package by.savik.L13_02_2025;

import java.util.Random;

public class PetFactory {
    private static String[] petNames = new String[5];
    private static String[] petSpecies = new String[3];

    static {

        petNames[0] = "Мурка";
        petNames[1] = "Барсик";
        petNames[2] = "Беляш";
        petNames[3] = "Черныш";
        petNames[4] = "Жужа";

        petSpecies[0] = "Кот";
        petSpecies[1] = "Собака";
        petSpecies[2] = "Птица";

    }

    public static Pet next() {
        Random random = new Random();
        if (random.nextInt(3) == 0) {
            return new Cat(petNames[random.nextInt(petNames.length)], random.nextInt(1,10));
        } else if (random.nextInt(3) == 1) {
            return new Dog(petNames[random.nextInt(petNames.length)], random.nextInt(1,10));
        }
        else return new Bird(petNames[random.nextInt(petNames.length)], random.nextInt(1,10));
    }
}
