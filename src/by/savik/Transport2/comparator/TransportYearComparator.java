package by.savik.Transport2.comparator;

import by.savik.Transport2.model.Transport;

import java.util.Comparator;

public class TransportYearComparator implements Comparator<Transport> {
    @Override
    public int compare(Transport o1, Transport o2) {
        return Integer.compare(o1.getYear(), o2.getYear());
    }
}
