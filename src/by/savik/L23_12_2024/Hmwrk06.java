package by.savik.L23_12_2024;

import java.util.Scanner;

/*Задача 4: Факториал
Напишите программу, которая вычисляет факториал числа, введенного пользователем, с помощью цикла for.
*/
public class Hmwrk06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int n = sc.nextInt();
        int f = 1;
        for (int i = 1; i <= n; ++i) {
            f = f * i;
        }
        System.out.println(f);
    }
}
