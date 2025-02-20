package by.savik.L23_12_2024;
//Задача 1: Сумма чисел
//Напишите программу, которая вычисляет и выводит сумму всех четных чисел от 1 до 100 с помощью цикла for.
public class Hmwrk03 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
