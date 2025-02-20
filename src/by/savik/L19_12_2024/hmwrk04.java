package by.savik.L19_12_2024;

public class hmwrk04 {
    public static void main(String[] args) {
        int n = 15;
        if (n % 3 == 0) {
            System.out.println("Число " + n + " делится на 3.");
        }
        else if (n % 5 == 0) {
            System.out.println("Число " + n + " делится на 5.");
        }
        else if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Число " + n + " делится на 3 и на 5.");
        }
    }
}
