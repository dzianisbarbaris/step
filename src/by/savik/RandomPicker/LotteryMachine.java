package by.savik.RandomPicker;

import java.util.*;

public class LotteryMachine<T extends Participant> {
    private List<T> allItems = new ArrayList<>();
    private Queue<T> queue = new LinkedList<>();
    private static final int MAX_WINNERS = 2;
    private Set<T> winners = new HashSet<>();
    private Boolean initialized = false;
    private int countRoundWinners = 0;

    public void add(T item) {
        if (!initialized && item.getAge() >= 18) {
            allItems.add(item);
        }
    }

    public void init() {
        Collections.shuffle(allItems);
        queue.addAll(allItems);
        initialized = true;
    }

    public T pick() {
        if (!initialized) {
            init();
        }
        if (countRoundWinners == MAX_WINNERS) {
            return null;
        }
        T winner = queue.poll();
        if (winner != null) {
            countRoundWinners++;
            winners.add(winner);
            allItems.remove(winner);
        }
        return winner;
    }

    public void printWinners() {
        System.out.println(winners);
    }

    public void reset() {
        initialized = false;
        queue.clear();
        init();
        countRoundWinners = 0;
    }

    public int remaining() {
        return queue.size();
    }

    public Map<String, Integer> ageToWinners() {
        Map<String, Integer> winnersByAge = new HashMap<>(Map.of("18-30", 0, "30-50", 0, "50 и выше", 0));
        for (T winner : winners) {
            int age = winner.getAge();
            if (age >= 18 && age < 30) {
                Integer count = winnersByAge.get("18-30");
                winnersByAge.put("18-30", ++count);
            } else if (age >= 30 && age < 50) {
                Integer count = winnersByAge.get("30-50");
                winnersByAge.put("30-50", ++count);
            } else {
                Integer count = winnersByAge.get("50 и выше");
                winnersByAge.put("50 и выше", ++count);
            }
        }
        return winnersByAge;
    }


}
