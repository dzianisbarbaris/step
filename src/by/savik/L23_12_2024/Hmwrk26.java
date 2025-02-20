package by.savik.L23_12_2024;

import java.util.Scanner;

public class Hmwrk26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 1; j <= a-i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
