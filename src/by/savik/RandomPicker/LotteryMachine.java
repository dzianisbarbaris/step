package by.savik.RandomPicker;

import java.util.*;

public class LotteryMachine<T> {
    private final List<T> allItems = new ArrayList<>();
    private final Queue<T> queue = new LinkedList<>();
    private static final int WINNERS_SIZE = 2;
    private final Set<T> winners = new HashSet<>();
    private boolean initialized;

    public void add(T item) {
        if (!initialized) {
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
        if (winners.size() < WINNERS_SIZE) {
            T winner = queue.poll();
            winners.add(winner);
            allItems.remove(winner);
            return winner;
        }
        return null;
    }

    public void printWinners() {
        System.out.println(winners);
    }

    public void reset() {
        queue.clear();
        Collections.shuffle(allItems);
        queue.addAll(allItems);
    }

    public int remaining() {
        return queue.size();
    }


}
