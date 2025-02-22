package by.savik.L13_02_2025;

import java.util.Random;

public class PetFactory {
    private static Random random = new Random();
    private static String[] petNames = new String[5];
   
    static {
        petNames[0] = "Мурка";
        petNames[1] = "Барсик";
        petNames[2] = "Беляш";
        petNames[3] = "Черныш";
        petNames[4] = "Жужа";
    }

    public static Pet next() {
        int i = random.nextInt(3);
        if (i == 0) {
            return new Cat(petNames[random.nextInt(petNames.length)], random.nextInt(1,10));
        } else if (i == 1) {
            return new Dog(petNames[random.nextInt(petNames.length)], random.nextInt(1,10));
        }
        else return new Bird(petNames[random.nextInt(petNames.length)], random.nextInt(1,10));
    }
}
