package by.savik.L19_12_2024;

public class Task01 {
    public static void main(String[] args) {
        int sec = 186385;
        int day = sec / 86400;
        int hour = sec % 86400 / 3600;
        int min = sec % 86400 % 3600 / 60;
        int sec2 = sec % 86400 % 3600 % 60;
        System.out.println("До НГ осталось " + day + " дней, " + hour + " часов, " + min + " минут, " + sec2 + " секунд.");
    }
}
