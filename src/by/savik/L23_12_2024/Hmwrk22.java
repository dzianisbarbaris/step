package by.savik.L23_12_2024;
/*Задача 20:
Как-то средненько

Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.*/

import java.util.Scanner;

public class Hmwrk22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        System.out.println("Введите третье число");
        int c = sc.nextInt();
        if (a > b && a < c) {
            System.out.println(a);
        } else if (a < b && b < c) {
            System.out.println(b);
        } else if (a < b && b > c) {
            System.out.println(c);
        } else {
            System.out.println(a);
        }
    }
}
