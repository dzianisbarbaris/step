package by.savik.Transport2;

import java.util.*;

public class TransportUserManager {
    private Map<User, List<Transport>> transportByOwner = new HashMap<>();

    public void addTransport(Transport transport) {
        transportByOwner.putIfAbsent(transport.getUser(), new ArrayList<>());
        transportByOwner.get(transport.getUser()).add(transport);
    }

    public List<Transport> getTransportByOwner(User owner) {
        return transportByOwner.get(owner);
    }

    public void removeTransport(User owner, String licensePlate) {
        List<Transport> transports = transportByOwner.get(owner);
        Iterator<Transport> iterator = transports.iterator();
        while (iterator.hasNext()) {
            Transport next = iterator.next();
            if (licensePlate.equals(next.getLicensePlate())) {
                iterator.remove();
            } else {
                System.out.println("Транспорта с таким номером у владельца нет");
            }
        }
    }

    public Transport getFastestTransport(User owner) {
        List<Transport> transportsBySpeed = transportByOwner.get(owner);
        transportsBySpeed.sort(new TransportSpeedComparator());
        return transportsBySpeed.getLast();
    }

    public User findOwnerWithMostCars() {
        TreeMap<Integer, User> ownersCarsNum = new TreeMap<>();
        for (Map.Entry<User, List<Transport>> entry : transportByOwner.entrySet()) {
            int size = entry.getValue().size();
            User value = entry.getKey();
            ownersCarsNum.put(size, value);
        }
        return ownersCarsNum.lastEntry().getValue();
    }

    public void printAllOwnersAndTransport() {
            for (Map.Entry<User, List<Transport>> owner : transportByOwner.entrySet()){
                System.out.println(owner.getKey());
                System.out.println(owner.getValue());
                System.out.println(" ");
            }
        }
    }
