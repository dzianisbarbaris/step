package by.savik.L20_03_2025;

import java.util.LinkedList;
import java.util.Queue;

public class BusStop {
    private final Queue<String> busStop = new LinkedList<>();

    public void addPassenger(String name) {
        busStop.add(name);
        System.out.println(name + " встал в очередь на автобус.");
    }

    public String boardBus() {
        if (busStop.isEmpty()) {
            return "Автобус уехал пустой.";
        } else {
            System.out.println("Следующий пассажир: " + busStop.peek());
            System.out.println(busStop.peek() + " сел в автобус.");
            return busStop.poll();
        }
    }

    public int getQueueSize() {
        System.out.println("Количество ожидающих пассажиров равно " + busStop.size());
        return busStop.size();
    }

    public String peekNextPassenger() {
        if (busStop.isEmpty()) {
            return "На остановке никого не осталось.";
        }
        return busStop.peek();
    }
}
