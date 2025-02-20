package by.savik.L23_12_2024;

import java.util.Scanner;

//Задача 2: Оценка
//Напишите программу, которая запрашивает у пользователя оценку (от 0 до 100) и выводит соответствующий текст в зависимости от оценки. Используйте оператор if-else. (болльше 90 Отлично, 75-90 Хорошо, 50-75 Удовлетворительно, меньше 50 неудовлетворительно)
public class Hmwrk04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите оценку");
        int a = sc.nextInt();
        if (a > 90) {
            System.out.println("Отлично");
        } else if (a > 75) {
            System.out.println("Хорошо");
        } else if (a > 50) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }
    }
}
