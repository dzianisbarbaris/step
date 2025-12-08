package by.savik.L13_10_2025_Collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class StoreDemo {
    public static void main(String[] args) {
        Store store = StoreFactory.createSampleStore();

        System.out.println("=== Магазин ===");
        System.out.println(store);

        System.out.println("\n=== Продукты ===");
        store.getProducts().forEach(System.out::println);

        System.out.println("\n=== Корзины ===");
        store.getCarts().forEach(System.out::println);

        // Задача 1
        System.out.println("\n=== Товары дороже 50 ===");
        List<Product> expensiveProducts = SimpleStoreTasks.findExpensiveProducts(store, 50.0);
        expensiveProducts.forEach(System.out::println);

        // Задача 2
        System.out.println("\n=== Количество товаров в магазине ===");
        System.out.println(SimpleStoreTasks.countProducts(store));

        // Задача 3
        System.out.println("\n=== Корзины с товарами количеством больше 1 ===");
        List<Cart> multiQuantityCarts = SimpleStoreTasks.findCartsWithMultipleQuantities(store);
        multiQuantityCarts.forEach(System.out::println);

        // Задача 4
        System.out.println("\n=== Категории товаров в корзинах ===");
        Set<Category> categoriesInCarts = SimpleStoreTasks.findCategoriesInCarts(store);
        categoriesInCarts.forEach(category -> System.out.println(category.getDisplayName()));

        // Задача 5
        System.out.println("\n=== Количество товаров в корзине CART001 ===");
        System.out.println(SimpleStoreTasks.countItemsInCart(store, "CART001"));

        // Задача 6
        System.out.println("\n=== Товары с запасом больше 100 ===");
        List<Product> highStockProducts = SimpleStoreTasks.findHighStockProducts(store, 100);
        highStockProducts.forEach(System.out::println);

        // Задача 7
        System.out.println("\n=== Наличие товара P001 в корзинах ===");
        System.out.println(SimpleStoreTasks.isProductInCarts(store, "P001"));

        // Задача 8
        System.out.println("\n=== Корзины с товарами категории Книги ===");
        List<Cart> bookCarts = SimpleStoreTasks.findCartsByCategory(store, Category.BOOKS);
        bookCarts.forEach(System.out::println);

        // Задача 9
        System.out.println("\n=== Самый дешевый товар ===");
        Product cheapestProduct = SimpleStoreTasks.findCheapestProduct(store);
        System.out.println(cheapestProduct != null ? cheapestProduct : "Нет товаров");

        // Задача 10
        System.out.println("\n=== Количество уникальных товаров в корзинах ===");
        System.out.println(SimpleStoreTasks.countUniqueProductsInCarts(store));

        System.out.println("=== Магазин ===");
        System.out.println(store);

        System.out.println("\n=== Продукты ===");
        store.getProducts().forEach(System.out::println);

        System.out.println("\n=== Корзины ===");
        store.getCarts().forEach(System.out::println);

        // Пример выполнения задачи 1
        System.out.println("\n=== Товары категории Электроника в корзинах ===");
        List<Product> electronics = SimpleStoreTasks.findProductsInCartsByCategory(store, Category.ELECTRONICS);
        electronics.forEach(System.out::println);

        System.out.println(("\n=== Корзины с товарами высокой стоимости ==="));
        List<Cart> cartsWithExpensiveItems = SimpleStoreTasks.findCartsWithExpensiveItems(store, 100);
        cartsWithExpensiveItems.forEach(System.out::println);

        System.out.println(("\n=== Количество товаров каждой категории ==="));
        Map<Category, Long> categoryLongMap1 = SimpleStoreTasks.countItemsByCategory(store);
        System.out.println(categoryLongMap1);
        System.out.println("\n=== Список товаров с низким запасом ===");
        List<Product> lowStockProducts = SimpleStoreTasks.findLowStockProducts(store, 200);
        lowStockProducts.forEach(System.out::println);


        System.out.println("\n=== Список самых популярных товаров в корзинах ===");
        /*List<Product> popularProducts = SimpleStoreTasks.findPopularProducts(store, 5);
        popularProducts.forEach(System.out::println);*/

        System.out.println("\n=== Список корзин с большим количеством товаров ===");
        List<Cart> largeCarts = SimpleStoreTasks.findLargeCarts(store, 3);
        largeCarts.forEach(System.out::println);





        System.out.println("\n=== Общая стоимость всех товаров на складе ===");
        System.out.println(SimpleStoreTasks.calculateTotalInventoryValue(store));

        System.out.println("\n=== Корзины с общей стоимостью выше заданного порога ===");
        List<Cart> expensiveCarts = SimpleStoreTasks.findExpensiveCarts(store, 200);
        expensiveCarts.forEach(System.out::println);

        System.out.println("\n=== Количество товаров каждой категории в магазине ===");
        Map<Category, Long> categoryLongMap = SimpleStoreTasks.countProductsByCategory(store);
        System.out.println(categoryLongMap);

        System.out.println("\n=== Самый дорогой товар в каждой категории ===");
        Map<Category, Product> mostExpensiveInCategory = SimpleStoreTasks.findMostExpensiveInCategory(store);
        System.out.println(mostExpensiveInCategory);
        /*// Пример выполнения задачи 7
        System.out.println("\n=== Топ-3 популярных товара ===");
        List<Product> popularProducts = SimpleStoreTasks.findPopularProducts(store, 3);
        popularProducts.forEach(System.out::println);*/
    }

    }
