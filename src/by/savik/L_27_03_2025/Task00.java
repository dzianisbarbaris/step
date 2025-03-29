package by.savik.L_27_03_2025;

import by.savik.L13_02_2025.Cat;

import java.util.List;

public class Task00 {
    public static void main(String[] args) {
      Box<String> stringBox = new Box<>();
      stringBox.setItem("Привет");
        String item = stringBox.getItem();
        System.out.println(item);
      Box<Integer> integerBox = new Box<>();
      integerBox.setItem(12);
        Integer item1 = integerBox.getItem();
        System.out.println(item1);

        printTwice("Привет");
        printTwice(18);
        printTwice(integerBox);
        Pair<String, Integer> student = new Pair<>("Денис", 18);
        System.out.println(student.getKey());
        System.out.println(student.getValue());
        List<Integer> integers = List.of(1, 2, 3);
       /* printList(integers);
        List<String> strings = List.of("1", "2", "3");
        printList(strings);*/
    }

    public static <T> T printTwice(T value){
        System.out.println(value);
        System.out.println(value);
        return value;
    }

    /*public static void printList(Box<? extends  Number> box){
        for (Number number : box) {
            System.out.println(number);
        }
    }*/
    public static void printList(List<? super Cat> list){
        for (Object o : list) {
            System.out.println(o);
        }
        Object object = list.get(1);
    }
}
