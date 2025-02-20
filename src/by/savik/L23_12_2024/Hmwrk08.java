package by.savik.L23_12_2024;

import java.util.Scanner;

/*
Задача 6: Перевод числа в римские цифры
        Напишите программу, которая запрашивает у пользователя число от 1 до 10 и выводит его в римских цифрах, используя оператор switch.
*/
public class Hmwrk08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                System.out.println("Число вне диапазона 1-10");
        }
    }
}
