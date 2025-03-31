package by.savik.RandomPicker;

import java.util.List;
import java.util.Random;

public class ParticipantFactory {
    private static final Random random = new Random();
    private static final List<String> maleNames = List.of("Денис", "Семён", "Олег", "Слава", "Виктор");
    private static final List<String> femaleNames = List.of("Оля", "Настя", "Наташа", "Татьяна", "Юля");

    private ParticipantFactory() {
    }

    public static Participant next(){
        int age = random.nextInt(14, 70);
        int randomId = random.nextInt(100000, 999999);
        boolean s = random.nextBoolean();
        if (s){
            String maleName = maleNames.get(random.nextInt(maleNames.size()));
            return new Participant(maleName, age, "мужской", randomId);
        } else {
            String femaleName = femaleNames.get(random.nextInt(femaleNames.size()));
            return new Participant(femaleName, age, "женский", randomId);
        }

    }

}
