package by.savik.L23_12_2024;
/*Задача 9: Конвертер температур
        Напишите программу, которая конвертирует температуру из Цельсия в Фаренгейт и наоборот. Пользователь выбирает направление конверсии с помощью switch.
        System.out.println("Выберите направление конверсии:");
        System.out.println("1 - Цельсий в Фаренгейт");
        System.out.println("2 - Фаренгейт в Цельсий");*/

import java.util.Scanner;

public class Hmwrk11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Выберите направление конверсии:");
        System.out.println("1 - Цельсий в Фаренгейт");
        System.out.println("2 - Фаренгейт в Цельсий");
        int a = sc.nextInt();
        System.out.println("Введите температуру");
        double t = sc.nextInt();
        switch (a) {
            case 1:
                double f = t * 1.8 + 32;
                System.out.println(f);
                break;
            case 2:
                double c = (t - 32) / 1.8;
                System.out.println(c);
                break;
            default:
                System.out.println("Направление конверсии неверное");
        }
    }
}
