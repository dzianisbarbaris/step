package by.savik.L23_12_2024;
/*Задача 7: Фибоначчи
Напишите программу, которая выводит первые 10 чисел Фибоначчи с помощью цикла for.
*/
public class Hmwrk09 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= 10; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
