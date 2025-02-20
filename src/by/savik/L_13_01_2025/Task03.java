package by.savik.L_13_01_2025;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int num = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                num++;
            }
        }
        System.out.println(num);
    }
}
