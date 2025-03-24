package by.savik.L20_03_2025;

import java.util.*;

public class Task00 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        BusStop busStop = new BusStop();
        Elevator elevator = new Elevator(3);

        /*queue.offer("Дима");
        queue.offer("Саша");
        queue.offer("Петя");
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println("");
        Queue<Task> taskQueue = new PriorityQueue<>();
        taskQueue.offer(new Task(1, "Запустить сервер"));
        taskQueue.offer(new Task(3, "Проверить логи"));
        taskQueue.offer(new Task(2, "Обновить базу данных"));
        System.out.println(taskQueue.poll());
        System.out.println(taskQueue);
        Deque<String> deque = new ArrayDeque<>();*/

        busStop.addPassenger("Ivan");
        busStop.addPassenger("Fedor");
        busStop.addPassenger("Petya");
        busStop.addPassenger("Alex");
        busStop.boardBus();
        busStop.getQueueSize();
        busStop.peekNextPassenger();

        elevator.enter("Ivan");
        elevator.enter("Fedor");
        elevator.enter("Petya");
        elevator.enter("Alex");
        elevator.enter("Sonya");
        elevator.exit();
        elevator.getCurrentPassengers();
        elevator.peekNextToExit();
        elevator.isFull();

    }
}
