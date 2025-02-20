package by.savik.L23_12_2024;

import java.util.Scanner;

// Изучаем Switch case
public class Task00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        int b = sc.nextInt();
        System.out.println("Выводим переменную " + a);
//        System.out.println("Выводим переменную " + b);
        switch (a) {
            case 1:
                System.out.println("переменная a = один");
                break;
            case 2:
                System.out.println("переменная a = два");
                break;
            case 3:
                System.out.println("переменная a = три");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("переменная или 4 или 5 или 6");
                break;
            default:
                System.out.println("ни одно из условий не сработало");
        }
    }

}
