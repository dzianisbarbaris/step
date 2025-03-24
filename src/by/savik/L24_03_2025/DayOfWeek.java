package by.savik.L24_03_2025;

public enum DayOfWeek {
    MONDAY("Понедельник", 1),
    TUESDAY("Вторник", 2),
    WEDNESDAY("Среда", 3),
    THURSDAY("Четверг",4 ),
    FRIDAY("Пятница", 5),
    SATURDAY("Суббота", 6),
    SUNDAY("Воскресенье", 7);
    private final String russianName;
    private final int dayOfWeek;

    DayOfWeek(String russianName, int dayOfweek) {
        this.russianName = russianName;
        this.dayOfWeek = dayOfweek;
    }

    public String getRussianName() {
        return russianName;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    @Override
    public String toString() {
        return "DayOfWeek{" +
                "russianName='" + russianName + '\'' +
                ", dayOfWeek=" + dayOfWeek +
                '}';
    }
}
