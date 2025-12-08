package by.savik.L13_10_2025_Collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SimpleStoreTasks {

    //Задача 1: Найти все товары дороже заданной цены * @param store - магазин
    // * @param minPrice - минимальная цена
    // * @return List товары с ценой выше minPrice */
    public static List<Product> findExpensiveProducts(Store store, double minPrice) {
        List<Product> list = store.getProducts().stream().filter(product -> product.getPrice() > minPrice).toList();
        if (list.isEmpty()) {
            throw new IllegalStateException("list is empty");
        }
        return list;
    }

    /**
     * Задача 2: Подсчитать количество товаров в магазине
     *
     * @param store - магазин
     * @return int количество товаров
     */
    public static int countProducts(Store store) {
        return store.getProducts().stream().mapToInt(p -> p.getStock()).sum();
    }

    /**
     * Задача 3: Найти корзины, содержащие более одного экземпляра товара
     *
     * @param store - магазин
     * @return List<Cart> корзины, где есть товар с количеством больше 1
     */
    public static List<Cart> findCartsWithMultipleQuantities(Store store) {
        List<Cart> list = store.getCarts().stream().filter(cart -> cart.getItems().size() > 1).toList();
        if (list.isEmpty()) {
            throw new IllegalStateException("list is empty");
        }
        return list;
    }

    /**
     * Задача 4: Найти все категории товаров в корзинах
     *
     * @param store - магазин
     * @return Set<Category> уникальные категории товаров в корзинах
     */
    public static Set<Category> findCategoriesInCarts(Store store) {
        Set<Category> categories = store.getProducts().stream().map(Product::getCategory).collect(Collectors.toSet());
        if (categories.isEmpty()) {
            throw new IllegalStateException("list is empty");
        }
        return categories;
    }

    /**
     * Задача 5: Подсчитать общее количество товаров в корзине по ID
     *
     * @param store  - магазин
     * @param cartId - идентификатор корзины
     * @return int общее количество товаров в указанной корзине
     */
    public static int countItemsInCart(Store store, String cartId) {
        return store.getCarts().stream().filter(cart -> cartId.equals(cart.getCartId()))
                .flatMap(cart -> cart.getItems().stream())
                .flatMapToInt(cartItem -> IntStream.of(cartItem.getQuantity())).sum();

    }

    /**
     * Задача 6: Найти товары с запасом больше заданного значения
     *
     * @param store    - магазин
     * @param minStock - минимальный запас
     * @return List<Product> товары с запасом больше minStock
     */
    public static List<Product> findHighStockProducts(Store store, int minStock) {
        List<Product> list = store.getProducts().stream().filter(s -> s.getStock() > minStock).toList();
        if (list.isEmpty()) {
            throw new IllegalStateException("list is empty");
        }
        return list;
    }

    /**
     * Задача 7: Проверить, есть ли товар в корзинах
     *
     * @param store     - магазин
     * @param productId - идентификатор товара
     * @return boolean true, если товар присутствует в корзинах
     */
    public static boolean isProductInCarts(Store store, String productId) {
        return store.getCarts().stream().flatMap(s -> s.getItems().stream())
                .map(CartItem::getProduct).anyMatch(p -> productId.equals(p.getProductId()));
    }

    /**
     * Задача 8: Найти корзины с товарами заданной категории
     * @param store - магазин
     * @param category - целевая категория
     * @return List<Cart> корзины, содержащие товары указанной категории
     */
    public static List<Cart> findCartsByCategory(Store store, Category category) {
        List<Cart> list = store.getCarts().stream()
                .filter(cart -> cart.getItems().stream()
                        .map(cartItem -> cartItem.getProduct().getCategory())
                        .toList().contains(category)).toList();
        if (list.isEmpty()) {
            throw new IllegalStateException("list is empty");
        }
        return list;
    }

    /**
     * Задача 9: Найти самый дешевый товар в магазине
     * @param store - магазин
     * @return Product самый дешевый товар или null, если товаров нет
     */
    public static Product findCheapestProduct(Store store) {
        Optional<Product> product = store.getProducts().stream().min(Comparator.comparingDouble(Product::getPrice));
        return product.orElse(null);
    }

    /**
     * Задача 10: Подсчитать общее количество уникальных товаров в корзинах
     * @param store - магазин
     * @return int количество уникальных товаров в корзинах
     */
    public static long countUniqueProductsInCarts(Store store) {
        return store.getCarts().stream().flatMap(cart -> cart.getItems()
                .stream().map(cartItem -> cartItem.getProduct().getName())).distinct().count();
    }

    /** * Задача 1: Найти товары в корзинах по категории
     * @param store - магазин
     * @param category - целевая категория
     * @return List товары указанной категории в корзинах */
    public static List<Product> findProductsInCartsByCategory(Store store, Category category) {
        List<Product> list = store.getCarts().stream().flatMap(cart -> cart.getItems().stream()
                        .map(CartItem::getProduct))
                .filter(product -> category.equals(product.getCategory())).toList();
        if (list.isEmpty()) {
            throw new IllegalStateException("list is empty");
        }
        return list;
    }

    /**
     * Задача 2: Найти корзины с товарами выше заданной цены
     * @param store - магазин
     * @param minPrice - минимальная цена товара
     * @return List<Cart> корзины, содержащие товары дороже minPrice
     */
    public static List<Cart> findCartsWithExpensiveItems(Store store, double minPrice) {
        List<Cart> list = store.getCarts().stream().filter(cart -> cart.getItems().stream()
                .mapToDouble(cartItem -> cartItem.getProduct().getPrice()).max().getAsDouble() > minPrice).toList();
        if (list.isEmpty()) {
            throw new IllegalStateException("list is empty");
        }
        return list;
    }

    /**
     * Задача 3: Подсчитать общее количество товаров в корзинах
     * @param store - магазин
     * @return Map<Category, Integer> количество товаров по категориям /
    ***/
    public static Map<Category, Long> countItemsByCategory(Store store) {
        Map<Category, Long> collect = store.getCarts().stream().flatMap(cart -> cart.getItems().stream())
                .collect(Collectors.groupingBy(cartItem -> cartItem.getProduct().getCategory(), Collectors.counting()));
        return collect;
    }

    /**
     * Задача 4: Найти товары с низким запасом
     * @param store - магазин
     * @param threshold - порог количества в магазине
     * @return List<Product> товары с количеством в магазине ниже порога
     */
    public static List<Product> findLowStockProducts(Store store, int threshold) {
        List<Product> list = store.getProducts().stream().filter(product -> product.getStock() <= threshold).toList();
        if (list.isEmpty()) {
            throw new IllegalStateException("list is empty");
        }
        return list;
    }

    /**
     * Задача 5: Найти корзины с товарами только одной категории
     * @param store - магазин
     * @return Map<Cart, Category> корзины и их единственная категория
     */
    public static Map<Cart, Category> findSingleCategoryCarts(Store store) {
        return new HashMap<>();
    }

    /**
     * Задача 6: Вычислить среднюю стоимость корзины
     * @param store - магазин
     * @return Map<Category, Double> средняя стоимость корзины для товаров каждой категории
     */
    public static Map<Category, Double> calculateAverageCartPriceByCategory(Store store) {
        return new HashMap<>();
    }

    /**
     * Задача 7: Найти самые популярные товары
     * @param store - магазин
     * @param limit - количество товаров для возврата
     * @return List<Product> топ популярных товаров по количеству в корзинах
     */
   /* public static List<Product> findPopularProducts(Store store, int limit) {
        List<Product> list = store.getCarts().stream().map(cart -> cart.getItems().stream().map(cartItem -> cartItem.getProduct().getStock()).sorted().limit(limit));
        if (list.isEmpty()) {
            throw new IllegalStateException("list is empty");
        }
        return list;
    }*/

    /**
     * Задача 8: Найти корзины с большим количеством товаров
     * @param store - магазин
     * @param minItems - минимальное количество товаров
     * @return List<Cart> корзины с количеством товаров больше minItems
     */
    public static List<Cart> findLargeCarts(Store store, int minItems) {
        List<Cart> list = store.getCarts().stream().filter(cart -> cart.getItems().stream().mapToInt(CartItem::getQuantity).sum() > minItems).toList();
        if (list.isEmpty()) {
            throw new IllegalStateException("list is empty");
        }
        return list;
    }

    /**
     * Задача 9: Найти пары товаров, часто встречающихся вместе
     * @param store - магазин
     * @return Map<Set<Product>, Integer> пары товаров и их частота
     */
    public static Map<Set<Product>, Integer> findProductPairs(Store store) {
        // ВАШ КОД ЗДЕСЬ
        return new HashMap<>();
    }

    /**
     * Задача 10: Проверить наличие всех категорий в корзинах
     * @param store - магазин
     * @return List<Cart> корзины, содержащие товары всех категорий
     */
    public static List<Cart> findCartsWithAllCategories(Store store) {
        // ВАШ КОД ЗДЕСЬ
        return new ArrayList<>();
    }

    /**
     * Задача 11: Найти общую стоимость всех товаров на складе (price * stock для всех товаров)
     * @param store - магазин
     * @return double общая стоимость (сумма price * stock)
     */
    public static double calculateTotalInventoryValue(Store store) {
        return store.getProducts().stream().mapToDouble(product -> product.getPrice() * product.getStock()).sum();
    }

    /**
     * Задача 12: Найти корзины с общей стоимостью выше заданного порога
     * @param store - магазин
     * @param threshold - порог стоимости корзины
     * @return List<Cart> корзины с totalPrice > threshold
     */
    public static List<Cart> findExpensiveCarts(Store store, double threshold) {
        List<Cart> list = store.getCarts().stream().filter(cart -> cart.getTotalPrice() > threshold).toList();
        if (list.isEmpty()) {
            throw new IllegalStateException("list is empty");
        }
        return list;
    }

    /**
     * Задача 13: Подсчитать количество товаров каждой категории в магазине
     * @param store - магазин
     * @return Map<Category, Integer> количество товаров по категориям
     */
    public static Map<Category, Long> countProductsByCategory(Store store) {
        Map<Category, Long> collect = store.getProducts().stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.counting()));
        if (collect.isEmpty()){
            throw new IllegalStateException("Map is empty");
        }
        return collect;
    }

    /**
     * Задача 14: Найти самый дорогой товар в каждой категории
     *
     * @param store - магазин
     * @return Map<Category, Product> категория -> самый дорогой товар
     */
    public static Map<Category, Product> findMostExpensiveInCategory(Store store) {
        Map<Category, Product> collect = store.getProducts().stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Product::getPrice)),
                        Optional::get)));
        return collect;
    }

    /**
     * Задача 15: Проверить, все ли товары в корзинах имеют stock > 0
     * @param store - магазин
     * @return boolean true, если все товары в корзинах доступны (stock > 0)
     */
    /*public static boolean allProductsInCartsAvailable(Store store) {
        store.getCarts().stream().
        return false;
    }*/


}
