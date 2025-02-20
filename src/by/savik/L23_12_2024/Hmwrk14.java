package by.savik.L23_12_2024;
/*Задача 12: Максимум четырех чисел

Ввести с клавиатуры четыре числа, и вывести максимальное из них. Если числа равны между собой, необходимо вывести любое.*/

import java.util.Scanner;

public class Hmwrk14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        System.out.println("Введите третье число");
        int c = sc.nextInt();
        System.out.println("Введите четвертое число");
        int d = sc.nextInt();
        if (a > b && a > c && a > d) {
            System.out.println(a);
        } else if (b > a && b > c && b > d) {
            System.out.println(b);
        } else if (c > a && c > b && c > d) {
            System.out.println(c);
        } else if (d > a && d > b && d > c) {
            System.out.println(d);
        } else {
            System.out.println(a);
        }
    }
}
