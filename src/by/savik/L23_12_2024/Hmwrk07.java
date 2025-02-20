package by.savik.L23_12_2024;

import java.util.Scanner;

/*
Задача 5: Положительные и отрицательные числа
Напишите программу, которая запрашивает у пользователя 10 целых чисел и подсчитывает, сколько из них положительных, отрицательных и нулей. Используйте оператор if-else и цикл for. (Вводить числа в цикле for)
*/
public class Hmwrk07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите число");
            int a = sc.nextInt();
            if (a < 0) {
                pos++;
            }
            else if (a > 0) {
                neg++;
            }
            else {
                zero++;
            }
        }
        System.out.println("Количество положительных чисел = " + pos);
        System.out.println("Количество отрицательных чисел = " + neg);
        System.out.println("Количество нулей = " + zero);
    }
}
