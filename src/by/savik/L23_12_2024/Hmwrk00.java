package by.savik.L23_12_2024;

import java.util.Scanner;

public class Hmwrk00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Программа расчёта квартплаты и коммунальных платежей");
        System.out.println("-------------------------------------------------------");
        System.out.println("Введите объём потреблённого газа (м. куб.)............:");
        int gas = sc.nextInt();
        System.out.println("Введите объём потреблённой горячей воды (м. куб.).....:");
        int hotWater = sc.nextInt();
        System.out.println("Введите объём потреблённой холодной воды (м. куб.)....:");
        int coldWater = sc.nextInt();
        System.out.println("Введите объём потреблённой электроэнергии (кВт * ч)...:");
        int electricity = sc.nextInt();
        System.out.println("Введите площадь квартиры (м. кв.).....................:");
        int apartment = sc.nextInt();

        int gasPrice = gas * 42;
        int gasRub = gasPrice / 100;
        int gasKop = gasPrice % 100;
        System.out.println("За газ..............: " + gasRub + " руб. " + gasKop + " коп.");

        int waterPrice = (hotWater + coldWater) * 84;
        int waterRub = waterPrice / 100;
        int waterKop = waterPrice % 100;
        System.out.println("За воду.............: " + waterRub + " руб. " + waterKop + " коп.");

        int electroPrice = electricity * 18;
        int electroRub = electroPrice / 100;
        int electroKop = electroPrice % 100;
        System.out.println("За электроэнергию...: " + electroRub + " руб. " + electroKop + " коп.");

        int hotWaterPrice = hotWater * 32;
        int hotWaterRub = hotWaterPrice / 100;
        int hotWaterKop = hotWaterPrice % 100;
        System.out.println("За подогрев воды....: " + hotWaterRub + " руб. " + hotWaterKop + " коп.");

        int apartmentPrice = apartment * 22;
        int apartmentRub = hotWaterPrice / 100;
        int apartmentKop = hotWaterPrice % 100;
        System.out.println("За квартиру ........: " + apartmentRub + " руб. " + apartmentKop + " коп.");
        System.out.println("-------------------------------------------------------------------------");

        int summRub = (gasPrice + waterPrice + electroPrice + hotWaterPrice + apartmentPrice) / 100;
        int summKop = (gasPrice + waterPrice + electroPrice + hotWaterPrice + apartmentPrice) % 100;
        System.out.println("Итого ..............: " + summRub + " руб. " + summKop + " коп.");
    }
}
