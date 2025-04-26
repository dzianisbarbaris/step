package by.savik.Grocery;

import java.util.*;
import java.util.stream.Collectors;

public class GroceryMain {
    public static void main(String[] args) {
        List<GroceryItem> groceryItems = Arrays.asList(
                new GroceryItem("Банан", Category.FRUIT, 8, false),
                new GroceryItem("Курица", Category.MEAT, 12, true),
                new GroceryItem("Томат", Category.VEGETABLE, 20, false),
                new GroceryItem("Сметана", Category.DAIRY, 5, true),
                new GroceryItem("Торт", Category.BAKERY, 30, true),
                new GroceryItem("Пепси", Category.BEVERAGE, 3, false),
                new GroceryItem("Киви", Category.FRUIT, 11, false),
                new GroceryItem("Свинина", Category.MEAT, 15, true),
                new GroceryItem("Огурец", Category.VEGETABLE, 18, false),
                new GroceryItem("Кефир", Category.DAIRY, 6, true),
                new GroceryItem("Печенье", Category.BAKERY, 18, true),
                new GroceryItem("Кока-Кола", Category.BEVERAGE, 3, false)
        );

        List<Customer> customers = List.of(
                new Customer("Андрей", List.of(
                        new GroceryItem("Milk", Category.DAIRY, 1.2, true),
                        new GroceryItem("Bread", Category.BAKERY, 0.8, true)
                )),
                new Customer("Ирина", List.of(
                        new GroceryItem("Apple", Category.FRUIT, 0.5, true),
                        new GroceryItem("Wine", Category.BEVERAGE, 5.0, false),
                        new GroceryItem("Cheese", Category.DAIRY, 3.0, true)
                )),
                new Customer("Сергей", List.of(
                        new GroceryItem("Eggs", Category.DAIRY, 2.0, true),
                        new GroceryItem("Chocolate", Category.BAKERY, 1.5, false)
                )),
                new Customer("Валера", new ArrayList<>()),
                new Customer("Семён", new ArrayList<>())
        );

        DoubleSummaryStatistics doubleSummaryStatistics = customers.stream()
                .flatMap(customer -> customer.getShoppingList().stream())
                .collect(Collectors.summarizingDouble(GroceryItem::getPrice));
        System.out.println(doubleSummaryStatistics.getMax());
        System.out.println(doubleSummaryStatistics.getAverage());

        List<GroceryItem> allGroceryItems = customers.stream()
                .flatMap(c -> c.getShoppingList().stream())
                .toList();
        System.out.println(allGroceryItems);

        Long customersNum = customers.stream()
                .map(Customer::getName).collect(Collectors.counting());
        System.out.println(customersNum);

        customers.stream()
                .max(Comparator.comparingDouble(c -> c.getShoppingList().stream().
                        mapToDouble(GroceryItem::getPrice).sum()))
                .ifPresent(System.out::println);

        Set<String> uniqueItems = customers.stream()
                .flatMap(customer -> customer.getShoppingList()
                        .stream().map(GroceryItem::getName)).collect(Collectors.toSet());
        System.out.println(uniqueItems);

        Optional<Customer> customerOptional = customers.stream()
                .filter(customer -> customer.getShoppingList().isEmpty())
                .findFirst();
        customerOptional.ifPresent(customer -> System.out.println(customer.getName() + " Без покупок"));

        Map<String, DoubleSummaryStatistics> summaryStatistics = customers.stream()
                .collect(Collectors.toMap(Customer::getName, customer -> customer.getShoppingList()
                        .stream().collect(Collectors.summarizingDouble(GroceryItem::getPrice))));
        System.out.println(summaryStatistics);

        List<String> collectPeek = customers.stream()
                .peek(c -> System.out.println("Обрабатываем " + c.getName()))
                .map(customer -> customer.getName())
                .collect(Collectors.toList());

        List<String> collect = customers.stream()
                .map(customer -> customer.getName())
                .skip(1)
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(collect);






       /* //1
        List<GroceryItem> dairyItems = groceryItems.stream()
                .filter(d -> d.getCategory().equals(Category.DAIRY))
                .collect(Collectors.toList());
        System.out.println(dairyItems);

        //2
        List<String> perishable = groceryItems.stream()
                .filter(GroceryItem::isPerishable)
                .map(GroceryItem::getName)
                .collect(Collectors.toList());
        System.out.println(perishable);

        //3
        List<GroceryItem> sortedByPrice = groceryItems.stream()
                .sorted(Comparator.comparing(GroceryItem::getPrice))
                .collect(Collectors.toList());
        System.out.println(sortedByPrice);

        //4
        List<GroceryItem> top3ByPrise = groceryItems.stream()
                .sorted(Comparator.comparing(GroceryItem::getPrice).reversed())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(top3ByPrise);

        //5
        List<String> top3NamesByPrise = top3ByPrise.stream()
                .map(GroceryItem::getName)
                .collect(Collectors.toList());
        System.out.println(top3NamesByPrise);

        //6
        groceryItems.stream()
                .forEach(item -> System.out.println("<" + item.getName() + "> : <" + item.getPrice() * 0.9 + "> Br"));
        //7
        boolean anyMatch = groceryItems.stream()
                .anyMatch(item -> item.getPrice() < 1);
        System.out.println(anyMatch);

        //8
        boolean allMatch = groceryItems.stream()
                .allMatch(item -> item.getPrice() > 0);
        System.out.println(allMatch);

        //9
        Optional<GroceryItem> firstBeverage = groceryItems.stream()
                .filter(item -> item.getCategory().equals(Category.VEGETABLE))
                .findFirst();
        if (firstBeverage.isPresent()) {
            GroceryItem item = firstBeverage.get();
            System.out.println(item);
        }

        //10
        List<Category> uniqueCategories = groceryItems.stream()
                .map(GroceryItem::getCategory)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueCategories);
    }*/
    }
}
