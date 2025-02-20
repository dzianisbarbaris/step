package by.savik.L23_12_2024;

import java.util.Scanner;

/*
Задача 3: Калькулятор
        Напишите программу, которая реализует простой калькулятор. Пользователь вводит два числа и оператор (+, -, *, /), программа выводит результат. Используйте оператор switch. (char operator = scanner.next().charAt(0);)
*/
public class Hmwrk05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = sc.nextInt();
        System.out.println("Введите оператор");
        char operator = sc.next().charAt(0);
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        switch (operator) {
            case '+':
                System.out.println("Результат");
                System.out.println(a - b);
                break;
            case '-':
                System.out.println("Результат");
                System.out.println(a - b);
                break;
            case '*':
                System.out.println("Результат");
                System.out.println(a * b);
                break;
            default:
                System.out.println("Результат");
                System.out.println(a / b);
        }
    }
}
