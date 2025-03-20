package by.savik.Homework19_03_2025;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();
        List<String> names = new ArrayList<>(List.of("Алексей", "Мария", "Алексей", "Дмитрий", "Мария"));
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5);
        Set<String> set1 = Set.of("Алексей", "Мария", "Дмитрий");
        Set<String> set2 = Set.of("Мария", "Сергей", "Алексей");
        List<String> words = List.of("кот", "собака", "кот", "птица", "рыба", "рыба");
        List<String> words2 = new ArrayList<>(List.of("яблоко", "ананас", "киви", "банан"));


        methods.removeDuplicates(names);
        methods.getUniqueNumbers(numbers);
        methods.hasDuplicates(names);
        methods.getMatch(set1, set2);
        methods.getDifference(set1, set2);
        methods.findUniqueWords(words);
        methods.sortList(words2);
        methods.getFirstUniqueWord(words);
        methods.splitList(numbers);
    }
}
