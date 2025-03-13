package by.savik.Transport2;

import java.util.List;
import java.util.Random;

public class UserFactory {
        private static final Random random = new Random();
        private static final List<String> userNames = List.of("Денис", "Семён", "Олег", "Слава", "Виктор", "Оля", "Настя");


        public static User next() {
            int r = random.nextInt(7);
            return new User(userNames.get(r));
        }
    }
