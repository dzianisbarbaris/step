package by.savik.L09_01_2025;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число (0 для выхода)");
        int num;
        while (true) {
            num = sc.nextInt();
            System.out.println("Вы ввели число " + num);
            if (num == 0) {
                System.out.println("Завершение ввода");
                break;
            }
        }
    }
}
