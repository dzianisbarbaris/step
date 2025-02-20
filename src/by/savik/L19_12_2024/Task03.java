package by.savik.L19_12_2024;

public class Task03 {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int c = 2;
        if (a == b && a == c) {
            System.out.println("Все равны" + a + " "+ b + " " +c);
        }
        else if (b == c){
            System.out.println("Пара есть: " + a + " " + b);
        }
        else {
            System.out.println("Равных нет");
        }
    }
}
