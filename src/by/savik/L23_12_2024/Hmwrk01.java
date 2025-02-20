package by.savik.L23_12_2024;

import java.util.Scanner;

public class Hmwrk01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер социальной стипендии:");
        double social = sc.nextDouble();
        System.out.println("Введите размер обычной стипендии:");
        double usual = sc.nextDouble();
        double special = usual * 2.5;
        double increased = usual * 3.2;
        System.out.println("Введите оценку за первый экзамен:");
        double a = sc.nextDouble();
        System.out.println("Введите оценку за второй экзамен:");
        double b = sc.nextDouble();
        System.out.println("Введите оценку за третий экзамен:");
        double c = sc.nextDouble();
        System.out.println("Введите оценку за четвёртый экзамен:");
        double d = sc.nextDouble();
        System.out.println("Введите номер зачётной книжки:");
        int gradeBook = sc.nextInt();

        if (a < 4 && b < 4 && c < 4 && d < 4) {
            System.out.println("Студент отчислен за успеваемость");
        } else if (a < 4 && b < 4 && c < 4) {
            System.out.println("Студент отчислен за успеваемость");
        } else if (a < 4 && b < 4 && d < 4) {
            System.out.println("Студент отчислен за успеваемость");
        } else if (a < 4 && c < 4 && d < 4) {
            System.out.println("Студент отчислен за успеваемость");
        } else if (b < 4 && c < 4 && d < 4) {
            System.out.println("Студент отчислен за успеваемость");
        } else if (a < 4) {
            System.out.println("Студент имеет академическую задолженность");
            System.out.println("Стипендия не начислена");
        } else if (b < 4) {
            System.out.println("Студент имеет академическую задолженность");
            System.out.println("Стипендия не начислена");
        } else if (c < 4) {
            System.out.println("Студент имеет академическую задолженность");
            System.out.println("Стипендия не начислена");
        } else if (d < 4) {
            System.out.println("Студент имеет академическую задолженность");
            System.out.println("Стипендия не начислена");
        } else {
            if (gradeBook % 2 != 0) {
                System.out.println("Стипендия не начислена (студент - платник)");
            } else {
                double average = (a + b + c + d) / 4;
                System.out.println("Средний балл в сессию " + average);
                if (average <= 5) {
                    System.out.println("Ежемесячная стипендия " + social + " рублей");
                } else if (average < 5 && average >= 7) {
                    System.out.println("Обычная стипендия" + usual + " рублей");
                } else if (average > 9 && a > 8 && b > 8 && c > 8 && d > 8) {
                    System.out.println("Специальная стипендия" + special + " рублей");
                } else {
                    System.out.println("Повышенная стипендия " + increased + " рублей");
                }
            }
        }
    }
}