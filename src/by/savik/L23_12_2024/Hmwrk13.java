package by.savik.L23_12_2024;

import java.util.Scanner;

/*Задача 11: Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
для первой четверти a>0 и b>0;
для второй четверти a<0 и b>0;
для третьей четверти a<0 и b<0;
для четвертой четверти a>0 и b<0.
Пример для чисел 4 6:
        1
Пример для чисел -6 -6:
        3*/
public class Hmwrk13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        if (a > 0 && b > 0) {
            System.out.println("1");
            }
            else if (a < 0 && b < 0) {
                System.out.println("2");
            }
            else if (a < 0 && b > 0) {
                System.out.println("3");
            }
            else if (a > 0 && b < 0) {
                System.out.println("4");
            }
            else {
                System.out.println("центр координат");
            }
        }
    }
