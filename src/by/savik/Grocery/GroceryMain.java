package by.savik.Grocery;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
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
        //1
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

        groceryItems.stream()
                .forEach(item -> System.out.println("<" + item.getName() + "> : <" + item.getPrice() * 0.9 + "> Br"));

        boolean b = groceryItems.stream()
                .anyMatch(item -> item.getPrice() < 1);


    }
}
