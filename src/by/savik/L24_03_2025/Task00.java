package by.savik.L24_03_2025;

import java.util.EnumMap;
import java.util.EnumSet;

public class Task00 {
    public static void main(String[] args) {
    DayOfWeek friday = DayOfWeek.FRIDAY;
    test(friday);
        String russianName = friday.getRussianName();
        int dayOfWeek = friday.getDayOfWeek();
        System.out.println(russianName);
        for (DayOfWeek value : DayOfWeek.values()) {
            System.out.println(value.getRussianName());
        }

        DayOfWeek tuesday = DayOfWeek.valueOf("MONDAY");
        System.out.println(tuesday);

        EnumSet<DayOfWeek> dayOfWeeks = EnumSet.of(DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY);
        EnumMap<DayOfWeek, Integer> dayOfWeekIntegerEnumMap = new EnumMap<>(DayOfWeek.class);




    }

    private static void test(DayOfWeek dayOfWeek){
        if (DayOfWeek.FRIDAY == dayOfWeek) {
            System.out.println("Ура! Пятница");
        }
    }
}
