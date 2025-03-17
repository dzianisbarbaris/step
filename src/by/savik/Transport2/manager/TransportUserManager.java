package by.savik.Transport2.manager;

import by.savik.Transport2.model.Transport;
import by.savik.Transport2.model.User;
import by.savik.Transport2.comparator.TransportSpeedComparator;

import java.util.*;

public class TransportUserManager {
    private Map<User, List<Transport>> transportByOwner = new HashMap<>();

    public void addTransport(Transport transport) {
        transportByOwner.putIfAbsent(transport.getUser(), new ArrayList<>());
        transportByOwner.get(transport.getUser()).add(transport);
    }

    public void addTransportForUser(User owner, Transport transport) {
        if (transportByOwner.containsKey(owner)) {
            transportByOwner.get(owner).add(transport);
        } else transportByOwner.put(owner, new ArrayList<>());
    }

    public List<Transport> getTransportByOwner(User owner) {
        System.out.println("Транспорт владельца: " + owner + " \n " + transportByOwner.get(owner));
        return transportByOwner.get(owner);
    }

    public void removeTransport(User owner, String licensePlate) {
        List<Transport> transports = transportByOwner.get(owner);
        Iterator<Transport> iterator = transports.iterator();
        while (iterator.hasNext()) {
            Transport next = iterator.next();
            if (licensePlate.equals(next.getLicensePlate())) {
                iterator.remove();
                System.out.println("Удалён транспорт с номером: " + licensePlate);
                break;
            }
        }
    }

    public Transport getFastestTransport(User owner) {
        List<Transport> transportsBySpeed = transportByOwner.get(owner);
        transportsBySpeed.sort(new TransportSpeedComparator());
        System.out.println("Самый быстрый транспорт владельца: " + owner + "\n" + transportsBySpeed.getLast());
        return transportsBySpeed.getLast();
    }

    public User findOwnerWithMostCars() {
        TreeMap<Integer, User> ownersCarsNum = new TreeMap<>();
        for (Map.Entry<User, List<Transport>> entry : transportByOwner.entrySet()) {
            int size = entry.getValue().size();
            User value = entry.getKey();
            ownersCarsNum.put(size, value);
        }
        System.out.println("Владелец с самым большим числом транспорта: " + ownersCarsNum.lastEntry().getValue());
        System.out.println("Количество единиц транспорта: " + ownersCarsNum.lastEntry().getKey());
        return ownersCarsNum.lastEntry().getValue();
    }

    public void printAllOwnersAndTransport() {
        System.out.println("Список всех владельцев и их транспорта: ");
        for (Map.Entry<User, List<Transport>> owner : transportByOwner.entrySet()) {
            System.out.println(owner.getKey());
            System.out.println(owner.getValue());
            System.out.println(" ");
        }
    }
}
