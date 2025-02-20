package by.savik.L23_12_2024;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число");
        int a = sc.nextInt();
        System.out.println("введите кол-во повторений");
        int b = sc.nextInt();
        for (int i = 0; i < b; i++ ) {
            System.out.println(a);
        }
    }
}