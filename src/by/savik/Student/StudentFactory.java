package by.savik.Student;

import java.util.List;
import java.util.Random;

public class StudentFactory {
        private static Random random = new Random();
        private static List<String> studentNames = List.of("Денис", "Семён", "Олег", "Слава", "Виктор", "Оля", "Настя");


        public static Student next() {
            int r = random.nextInt(6);
            return new Student(studentNames.get(r), random.nextInt(20,30), random.nextDouble(4, 10));
        }
    }
