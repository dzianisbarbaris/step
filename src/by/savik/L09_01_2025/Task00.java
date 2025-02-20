package by.savik.L09_01_2025;

// зона видимости переменной
public class Task00 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i < 10; i++) {
            int b = 9;
            for (int j = 0; j < 20; j++) {
                a = 99;
            }
        }
        // b = 99; // не видна, т.к. она существует только в цикле
        a = 99; // видна, т.к. объявлена в начале до цикла
    }
}
