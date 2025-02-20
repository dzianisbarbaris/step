package by.savik.L09_01_2025;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Введите число");
            int a = sc.nextInt();
            if (a < 0)
                break;
            sum = sum + a;
        }
        System.out.println(sum);
    }
}
