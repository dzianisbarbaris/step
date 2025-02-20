package by.savik.L23_12_2024;
/*Задание 2
        Написать программу, которая выводит таблицу умножение в виде таблицы Пифагора:
        1 2 3 ... 9 10
        1 1 2 3 ... 9 10
        2 2 4 6 ... 18 20
        3 3 6 9 ... 27 30
        ...........................
        9 9 18 27 ... 81 90
        10 10 20 30 ... 90 100*/

public class Hmwrk25 {
    public static void main(String[] args) {
        System.out.println("   1  2  3  4  5  6  7  8  9  10");
        for(int i = 1; i <= 10; i++){
            System.out.print(i + " ");
            for(int j = 1; j <= 10; j++) {
                System.out.print(" " + j * i + " ");
            }
            System.out.println("");
        }
    }
    }
