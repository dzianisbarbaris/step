package by.savik.L09_01_2025;

public class Task04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0)
                continue;
            System.out.println(i);
        }
    }
}
