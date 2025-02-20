package by.savik.L16_12_2024;

public class Task05 {
    public static void main(String[] args) {
        int a = 12345;
        int b = a % 10;
        int c = a / 10 % 10;
        int d = a / 100 % 10;
        int e = a / 1000 % 10;
        int f = a / 10000 % 10;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
