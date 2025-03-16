package by.savik.Transport2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TransportSpeedGrouper {
    private Map<Integer, Set<Transport>> transportBySpeed = new TreeMap<>();

    public void addTransport(Transport transport) {
        transportBySpeed.putIfAbsent(transport.getSpeed(), new TreeSet<>());
        transportBySpeed.get(transport.getSpeed()).add(transport);
    }

    public Set<Transport> getTransportBySpeed(int speed) {
        System.out.println(transportBySpeed.containsKey(speed) ? transportBySpeed.get(speed) : "Транспорта с такой скоростью нет.");
        return transportBySpeed.get(speed);
    }

}

