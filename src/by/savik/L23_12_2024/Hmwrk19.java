package by.savik.L23_12_2024;
/*Задача 17:
Положительное число

Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
        2
Пример для чисел -6 -6 -3:
        0*/

import java.util.Scanner;

public class Hmwrk19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        System.out.println("Введите третье число");
        int c = sc.nextInt();
        int pos = 0;
        if (a > 0) {
            pos++;
        }
        if (b>0) {
            pos++;
        }
        if (c>0) {
            pos++;
        }
        System.out.println(pos);
    }
}
