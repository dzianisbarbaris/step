package by.savik.Transport2;

import java.util.*;

public class TransportAnalytics {
    private final List<Transport> transportsAnalytics = new ArrayList<>();

    public void addTransport(Transport transport) {
        transportsAnalytics.add(transport);
    }

    public List<Transport> filterByYear(int year) {
        List<Transport> filteredByYear = new ArrayList<>();
        for(Transport tr: transportsAnalytics){
            if(tr.getYear() <= year){
                filteredByYear.add(tr);
            }
        }
        return filteredByYear;
    }

    public List<Transport> findTop3Fastest() {
        List<Transport> top3Fastest = new ArrayList<>();
        int size = transportsAnalytics.size();
        transportsAnalytics.sort(new TransportSpeedComparator());
        if (transportsAnalytics.size() >= 3){
            top3Fastest.add(transportsAnalytics.get(size-1));
            top3Fastest.add(transportsAnalytics.get(size-2));
            top3Fastest.add(transportsAnalytics.get(size-3));
        }
        return top3Fastest;
    }

    public Set<String> getUniqueBrands() {
        Set<String> uniqueBrands = new HashSet<>();
        for (Transport transport : transportsAnalytics) {
            uniqueBrands.add(transport.getModel());
        }
        return uniqueBrands;
    }

    public Map<String, List<Transport>> groupBySpeedRange() {
        Map<String, List<Transport>> rangeBySpeed = Map.of("Медленный", new ArrayList<>(), "Средний", new ArrayList<>(), "Быстрый", new ArrayList<>());
        for (Transport tr: transportsAnalytics) {
            if (tr.getSpeed() < 100) {
                rangeBySpeed.get("Медленный").add(tr);
            } else if (tr.getSpeed() >= 100 && tr.getSpeed() <= 200) {
                rangeBySpeed.get("Средний").add(tr);
            } else {
                rangeBySpeed.get("Быстрый").add(tr);
            }
        }
        return rangeBySpeed;
    }

}
