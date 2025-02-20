package by.savik.L19_12_2024;

public class hmwrk05 {
    public static void main(String[] args) {
        int number = 237;
        int first = number % 10;
        int second = number / 10 % 10;
        int third = number / 100 % 10;
        int summ = first + second + third;
        System.out.println("Сумма цифр числа " + number + " = " + summ);
    }
}
