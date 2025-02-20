package by.savik.L19_12_2024;

public class hmwrk06 {
    public static void main(String[] args) {
        int a = 12;
        int b = 25;
        int c = 7;
        if (a > b && a > c) {
            System.out.println("Наибольшее число: " + a);
        }
        else if (b > a && b > c) {
            System.out.println("Наибольшее число: " + b);
        }
        else {
            System.out.println("Наибольшее число: " + c);
        }
    }
}
