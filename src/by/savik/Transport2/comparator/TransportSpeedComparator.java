package by.savik.Transport2.comparator;

import by.savik.Transport2.model.Transport;

import java.util.Comparator;

public class TransportSpeedComparator implements Comparator<Transport> {
    @Override
    public int compare(Transport o1, Transport o2) {
        return Integer.compare(o1.getSpeed(), o2.getSpeed());
    }
}