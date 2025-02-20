package by.savik.L09_01_2025;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вводите числа");
        int num = 0;
        while (true) {
            int a = sc.nextInt();
            if (a == 10)
                break;
            num++;
        }
        System.out.println(num);
    }
}
