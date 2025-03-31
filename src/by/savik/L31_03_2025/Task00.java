package by.savik.L31_03_2025;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task00 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader("src/by/savik/L31_03_2025/one.txt");
            int i = Integer.parseInt("7");
            System.out.println("Файл найден");
        } catch (FileNotFoundException | NumberFormatException e) {
            System.out.println("Файл не найден по такому то пути или не число" + e);
        } catch (Exception e) {
            System.out.println("Общая ошибка");
        } finally {
            System.out.println("Выполняем в любом случае");
        }
        System.out.println("После try/catch");
        /*System.out.println("После необработанного исключения");*/
        test2(38);
        try {
            test3(8);
        } catch (AgeChechkedException e) {
            System.out.println("Возраст меньше 18");
        }
    }

    private static void test() throws FileNotFoundException {
        FileReader fileReader = new FileReader("one.txt");
    }

    private static void test2(int age) {
        if (age < 18) {
            throw new AgeException("Возраст меньше 18");
        }
    }

    private static void test3(int age) throws AgeChechkedException {
        if (age < 18) {
            throw new AgeChechkedException("Возраст меньше 18");
        }
    }

    private static void test4() throws NumberException {
        try {
            Integer.parseInt("Куку");
        } catch (NumberFormatException e) {
            throw new NumberException("У нас не цифра");
        }
    }
}
