package by.savik.L09_01_2025;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вводите числа");
        while (true) {
            int a = sc.nextInt();
            if (a == 5) {
                continue;
            }
            if (a == 7) {
                System.out.println("Закончили ввод");
                break;
            }
            System.out.println("Продолжайте вводить числа");
        }
    }
}
