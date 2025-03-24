package by.savik.L20_03_2025;

import java.util.LinkedList;
import java.util.Queue;

public class Elevator {
    private final int maxCapacity;
    private final Queue<String> elevator = new LinkedList<>();

    public Elevator(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void enter(String person) {
        if (elevator.size() < maxCapacity) {
            System.out.println(person + " Заходит в лифт");
            elevator.add(person);
        } else {
            System.out.println("Лифт загружен полностью");
        }
    }

    public String exit() {
        if (elevator.isEmpty()) {
            return "В лифте никого нет";
        } else {
            System.out.println(elevator.peek() + " Выходит из лифта");
            return elevator.poll();
        }
    }

    public int getCurrentPassengers() {
        System.out.println("Количество людей в лифте равно " + elevator.size());
        return elevator.size();
    }

    public String peekNextToExit() {
        if (elevator.isEmpty()) {
            return "В лифте никого нет";
        } else {
            System.out.println(elevator.peek() + " Выходит из лифта");
            return elevator.peek();
        }
    }

    public boolean isFull() {
        if (elevator.size() < maxCapacity) {
            System.out.println("В лифте ещё есть место");
            return false;
        } else {
            System.out.println("Лифт загружен полностью");
            return true;
        }
    }
}
