package by.savik.L23_12_2024;
/*Задание 1
        Написать программу, которая вычисляет для заданного N следующее выражение
        (показан пример для N = 6):
        62 − 52 + 42 − 32 + 22 − 12 = 21*/

import java.util.Scanner;

public class Hmwrk24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число N");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = n; i >= 1; i = i - 2) {
            int raz = i * i - (i - 1) * (i - 1);
            sum += raz;
        }
        System.out.println(sum);
    }
}
