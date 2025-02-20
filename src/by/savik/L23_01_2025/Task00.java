package by.savik.L23_01_2025;

import java.io.PrintStream;

public class Task00 {
    public static void main(String[] args) {
     /*
    public Task00() { // конструктор (пишется с большой). Alt+ins
*/
        Product product1 = new Product();
        product1.name = "Молоко";
        product1.price = 10;
        product1.quantity = 800;
        System.out.println("Общая стоимость молока на складе = " + product1.getTotalValue());

        Product product2 = new Product();
        product2.name = "Хлеб";
        product2.price = 15;
        product2.quantity = 1000;
        System.out.println("Общая стоимость хлеба на складе = " + product2.getTotalValue());
        product1 = product2;
        product1.quantity = 500;
        System.out.println(product1);

        Product product3 = new Product("Яблоко", 40, 900);
        System.out.println("Общая стоимость " + product3.name + " = " + product3.getTotalValue());
    }

}
