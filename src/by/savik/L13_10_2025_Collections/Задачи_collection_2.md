import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Перечисление для категорий товаров
enum Category {
    ELECTRONICS("Электроника"),
    CLOTHING("Одежда"),
    FOOD("Продукты питания"),
    BOOKS("Книги");

    private final String displayName;

    Category(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

// Товар
class Product {
    private String productId;
    private String name;
    private Category category;
    private double price;
    private int stock;

    public Product(String productId, String name, Category category, double price, int stock) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    @Override
    public String toString() {
        return "Product{id='" + productId + "', name='" + name + "', category=" + 
               category.getDisplayName() + ", price=" + price + ", stock=" + stock + "}";
    }
}

// Элемент корзины
class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = Math.max(0, quantity);
    }

    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = Math.max(0, quantity); }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return "CartItem{product=" + product.getName() + ", quantity=" + quantity + 
               ", total=" + String.format("%.2f", getTotalPrice()) + "}";
    }
}

// Корзина
class Cart {
    private String cartId;
    private List<CartItem> items;

    public Cart(String cartId) {
        this.cartId = cartId;
        this.items = new ArrayList<>();
    }

    public String getCartId() { return cartId; }
    public void setCartId(String cartId) { this.cartId = cartId; }
    public List<CartItem> getItems() { return items; }
    public void setItems(List<CartItem> items) { this.items = items; }

    public double getTotalPrice() {
        return items.stream()
                .mapToDouble(CartItem::getTotalPrice)
                .sum();
    }

    @Override
    public String toString() {
        return "Cart{cartId='" + cartId + "', items=" + items.size() + 
               ", total=" + String.format("%.2f", getTotalPrice()) + "}";
    }
}

// Магазин
class Store {
    private String storeId;
    private String name;
    private List<Product> products;
    private List<Cart> carts;

    public Store(String storeId, String name) {
        this.storeId = storeId;
        this.name = name;
        this.products = new ArrayList<>();
        this.carts = new ArrayList<>();
    }

    public String getStoreId() { return storeId; }
    public void setStoreId(String storeId) { this.storeId = storeId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<Product> getProducts() { return products; }
    public void setProducts(List<Product> products) { this.products = products; }
    public List<Cart> getCarts() { return carts; }
    public void setCarts(List<Cart> carts) { this.carts = carts; }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addCart(Cart cart) {
        carts.add(cart);
    }

    @Override
    public String toString() {
        return "Store{storeId='" + storeId + "', name='" + name + 
               "', products=" + products.size() + ", carts=" + carts.size() + "}";
    }
}

// Фабрика для создания тестовых данных
class StoreFactory {
    public static Store createSampleStore() {
        Store store = new Store("S001", "Simple Shop");

        // Создаем продукты
        List<Product> products = createProducts();
        store.setProducts(products);

        // Создаем корзины
        List<Cart> carts = createCarts(products);
        store.setCarts(carts);

        return store;
    }

    private static List<Product> createProducts() {
        return Arrays.asList(
            new Product("P001", "Smartphone", Category.ELECTRONICS, 299.99, 50),
            new Product("P002", "T-Shirt", Category.CLOTHING, 19.99, 100),
            new Product("P003", "Coffee", Category.FOOD, 9.99, 200),
            new Product("P004", "Novel", Category.BOOKS, 14.99, 80),
            new Product("P005", "Headphones", Category.ELECTRONICS, 49.99, 60),
            new Product("P006", "Jeans", Category.CLOTHING, 39.99, 70),
            new Product("P007", "Cookies", Category.FOOD, 4.99, 150),
            new Product("P008", "Textbook", Category.BOOKS, 29.99, 40)
        );
    }

    private static List<Cart> createCarts(List<Product> products) {
        Random random = new Random();
        return IntStream.range(1, 11)
                .mapToObj(i -> {
                    String cartId = String.format("CART%03d", i);
                    Cart cart = new Cart(cartId);

                    // Добавляем 1-3 случайных товара в корзину
                    int numItems = random.nextInt(3) + 1;
                    Set<Product> selectedProducts = new HashSet<>();
                    while (selectedProducts.size() < numItems) {
                        selectedProducts.add(products.get(random.nextInt(products.size())));
                    }

                    List<CartItem> items = selectedProducts.stream()
                            .map(product -> new CartItem(product, random.nextInt(5) + 1))
                            .collect(Collectors.toList());

                    cart.setItems(items);
                    return cart;
                })
                .collect(Collectors.toList());
    }
}

// Задачи для работы с коллекциями
class StoreTasks {
    /**
     * Задача 1: Найти товары в корзинах по категории
     * @param store - магазин
     * @param category - целевая категория
     * @return List<Product> товары указанной категории в корзинах
     */
    public static List<Product> findProductsInCartsByCategory(Store store, Category category) {
        // ВАШ КОД ЗДЕСЬ
        return new ArrayList<>();
    }

    /**
     * Задача 2: Найти корзины с товарами выше заданной цены
     * @param store - магазин
     * @param minPrice - минимальная цена товара
     * @return List<Cart> корзины, содержащие товары дороже minPrice
     */
    public static List<Cart> findCartsWithExpensiveItems(Store store, double minPrice) {
        // ВАШ КОД ЗДЕСЬ
        return new ArrayList<>();
    }

    /**
     * Задача 3: Подсчитать общее количество товаров в корзинах
     * @param store - магазин
     * @return Map<Category, Integer> количество товаров по категориям
     */
    public static Map<Category, Integer> countItemsByCategory(Store store) {
        // ВАШ КОД ЗДЕСЬ
        return new HashMap<>();
    }

    /**
     * Задача 4: Найти товары с низким запасом
     * @param store - магазин
     * @param threshold - порог количества в магазине
     * @return List<Product> товары с количеством в магазине ниже порога
     */
    public static List<Product> findLowStockProducts(Store store, int threshold) {
        // ВАШ КОД ЗДЕСЬ
        return new ArrayList<>();
    }

    /**
     * Задача 5: Найти корзины с товарами только одной категории
     * @param store - магазин
     * @return Map<Cart, Category> корзины и их единственная категория
     */
    public static Map<Cart, Category> findSingleCategoryCarts(Store store) {
        // ВАШ КОД ЗДЕСЬ
        return new HashMap<>();
    }

    /**
     * Задача 6: Вычислить среднюю стоимость корзины
     * @param store - магазин
     * @return Map<Category, Double> средняя стоимость корзины для товаров каждой категории
     */
    public static Map<Category, Double> calculateAverageCartPriceByCategory(Store store) {
        // ВАШ КОД ЗДЕСЬ
        return new HashMap<>();
    }

    /**
     * Задача 7: Найти самые популярные товары
     * @param store - магазин
     * @param limit - количество товаров для возврата
     * @return List<Product> топ популярных товаров по количеству в корзинах
     */
    public static List<Product> findPopularProducts(Store store, int limit) {
        // ВАШ КОД ЗДЕСЬ
        return new ArrayList<>();
    }

    /**
     * Задача 8: Найти корзины с большим количеством товаров
     * @param store - магазин
     * @param minItems - минимальное количество товаров
     * @return List<Cart> корзины с количеством товаров больше minItems
     */
    public static List<Cart> findLargeCarts(Store store, int minItems) {
        // ВАШ КОД ЗДЕСЬ
        return new ArrayList<>();
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
}

// Демонстрация использования
class StoreDemo {
    public static void main(String[] args) {
        Store store = StoreFactory.createSampleStore();

        System.out.println("=== Магазин ===");
        System.out.println(store);

        System.out.println("\n=== Продукты ===");
        store.getProducts().forEach(System.out::println);

        System.out.println("\n=== Корзины ===");
        store.getCarts().forEach(System.out::println);

        // Пример выполнения задачи 1
        System.out.println("\n=== Товары категории Электроника в корзинах ===");
        List<Product> electronics = StoreTasks.findProductsInCartsByCategory(store, Category.ELECTRONICS);
        electronics.forEach(System.out::println);

        // Пример выполнения задачи 7
        System.out.println("\n=== Топ-3 популярных товара ===");
        List<Product> popularProducts = StoreTasks.findPopularProducts(store, 3);
        popularProducts.forEach(System.out::println);
    }
}
