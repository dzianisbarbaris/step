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

// Новые простые задачи для работы с коллекциями
class SimpleStoreTasks {
    /**
     * Задача 1: Найти все товары дороже заданной цены
     * @param store - магазин
     * @param minPrice - минимальная цена
     * @return List<Product> товары с ценой выше minPrice
     */
    public static List<Product> findExpensiveProducts(Store store, double minPrice) {
        // ВАШ КОД ЗДЕСЬ
        return new ArrayList<>();
    }

    /**
     * Задача 2: Подсчитать количество товаров в магазине
     * @param store - магазин
     * @return int количество товаров
     */
    public static int countProducts(Store store) {
        // ВАШ КОД ЗДЕСЬ
        return 0;
    }

    /**
     * Задача 3: Найти корзины, содержащие более одного экземпляра товара
     * @param store - магазин
     * @return List<Cart> корзины, где есть товар с количеством больше 1
     */
    public static List<Cart> findCartsWithMultipleQuantities(Store store) {
        // ВАШ КОД ЗДЕСЬ
        return new ArrayList<>();
    }

    /**
     * Задача 4: Найти все категории товаров в корзинах
     * @param store - магазин
     * @return Set<Category> уникальные категории товаров в корзинах
     */
    public static Set<Category> findCategoriesInCarts(Store store) {
        // ВАШ КОД ЗДЕСЬ
        return new HashSet<>();
    }

    /**
     * Задача 5: Подсчитать общее количество товаров в корзине по ID
     * @param store - магазин
     * @param cartId - идентификатор корзины
     * @return int общее количество товаров в указанной корзине
     */
    public static int countItemsInCart(Store store, String cartId) {
        // ВАШ КОД ЗДЕСЬ
        return 0;
    }

    /**
     * Задача 6: Найти товары с запасом больше заданного значения
     * @param store - магазин
     * @param minStock - минимальный запас
     * @return List<Product> товары с запасом больше minStock
     */
    public static List<Product> findHighStockProducts(Store store, int minStock) {
        // ВАШ КОД ЗДЕСЬ
        return new ArrayList<>();
    }

    /**
     * Задача 7: Проверить, есть ли товар в корзинах
     * @param store - магазин
     * @param productId - идентификатор товара
     * @return boolean true, если товар присутствует в корзинах
     */
    public static boolean isProductInCarts(Store store, String productId) {
        // ВАШ КОД ЗДЕСЬ
        return false;
    }

    /**
     * Задача 8: Найти корзины с товарами заданной категории
     * @param store - магазин
     * @param category - целевая категория
     * @return List<Cart> корзины, содержащие товары указанной категории
     */
    public static List<Cart> findCartsByCategory(Store store, Category category) {
        // ВАШ КОД ЗДЕСЬ
        return new ArrayList<>();
    }

    /**
     * Задача 9: Найти самый дешевый товар в магазине
     * @param store - магазин
     * @return Product самый дешевый товар или null, если товаров нет
     */
    public static Product findCheapestProduct(Store store) {
        // ВАШ КОД ЗДЕСЬ
        return null;
    }

    /**
     * Задача 10: Подсчитать общее количество уникальных товаров в корзинах
     * @param store - магазин
     * @return int количество уникальных товаров в корзинах
     */
    public static int countUniqueProductsInCarts(Store store) {
        // ВАШ КОД ЗДЕСЬ
        return 0;
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
    }
}
