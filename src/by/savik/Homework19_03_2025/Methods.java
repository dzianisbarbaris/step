package by.savik.Homework19_03_2025;

import java.util.*;

public class Methods {


    public Set<String> removeDuplicates(List<String> list) {
        Set<String> uniqueNames = new LinkedHashSet<>();
        uniqueNames.addAll(list);
        return uniqueNames;
    }

    public Set<Integer> getUniqueNumbers(List<Integer> list) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.addAll(list);
        return uniqueNumbers;
    }

    public boolean hasDuplicates(List<String> list) {
        Set<String> noDuplicates = new HashSet<>();
        noDuplicates.addAll(list);
        if (noDuplicates.size() == list.size()) {
            return false;
        } else return true;
    }

    public Set<String> getMatch(Set<String> set1, Set<String> set2) {
        Set<String> duplicates = new HashSet<>();
        for (String s : set1) {
            if (set2.contains(s)) {
                duplicates.add(s);
            }
        }
        return duplicates;
    }

    public Set<String> getDifference(Set<String> set1, Set<String> set2) {
        Set<String> difference = new HashSet<>();
        for (String s : set1) {
            if (!set2.contains(s)) {
                difference.add(s);
            }
        }
        for (String s : set2) {
            if (!set1.contains(s)) {
                difference.add(s);
            }
        }
        return difference;
    }

    public Integer findUniqueWords(List<String> words) {
        Set<String> uniqueWords = new HashSet<>();
        uniqueWords.addAll(words);
        return uniqueWords.size();
    }

    public List<String> sortList(List<String> list) {
        list.sort(new ListByStringLenghtComparator());
        return list;
    }

    public String getFirstUniqueWord(List<String> words) {
        String uniqueWord = "no unique words";
        for (int i = 0; i < words.size() - 1; i++) {
            for (int j = i + 1; j < words.size(); j++) {
                if (!words.get(i).equals(words.get(j))) {
                    uniqueWord = words.get(i);
                    break;
                }
            }
        }
        return uniqueWord;
    }

    public Map<String, List<Integer>> splitList(List<Integer> list) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Map<String, List<Integer>> splited = Map.of("Чётные", new ArrayList<>(), "Нечётные", new ArrayList<>());
        for (Integer i : list) {
            if (i % 2 == 0) {
                splited.get("Чётные").add(i);
            } else {
                splited.get("Нечётные").add(i);
            }
        }
        return splited;

    }
}

