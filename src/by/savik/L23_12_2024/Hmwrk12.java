package by.savik.L23_12_2024;

import java.util.Scanner;

/*Задача 10: Сумма чисел от 1 до N
        Напишите программу, которая запрашивает у пользователя число N и вычисляет сумму всех чисел от 1 до N, используя цикл for.*/
public class Hmwrk12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
