package by.savik.L07_07_2025;

import java.util.List;
import java.util.Random;

public class StudentFactory {
    private static final Random random = new Random();
    private static final List<String> studentNames = List.of("Денис", "Семён", "Олег", "Слава", "Виктор", "Оля", "Настя");


    public static Student next() {
        int r = random.nextInt(7);
        return new Student(studentNames.get(r),random.nextInt(18, 25), random.nextDouble(0, 100));
    }
}
