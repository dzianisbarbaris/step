package by.savik.L23_12_2024;
/*Задача 19: Рисуем прямоугольник

Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
        8888
        8888*/

import java.util.Scanner;

public class Hmwrk21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int m = sc.nextInt();
        System.out.println("Введите второе число");
        int n = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
