package by.savik.L23_12_2024;

import java.util.Scanner;

public class Hmwrk27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        for (int i = 0; i < a ; i++) {
            for (int j = i+1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
