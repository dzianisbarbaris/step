package by.savik.Transport2;

import java.util.*;

public class TransportAnalytics {
    private static List<Transport> transportsAnalytics = new ArrayList<>();

    public void addTransport(Transport transport) {
        transportsAnalytics.add(transport);
    }

    public List<Transport> filterByYear(int year) {
        List<Transport> filteredByYear = new ArrayList<>();
        filteredByYear.addAll(transportsAnalytics);
        filteredByYear.removeIf(transport -> transport.getYear() > year);
        System.out.println("Автомобили старше " + year + " года выпуска:");
        System.out.println(filteredByYear);
        return filteredByYear;
    }

    public List<Transport> findTop3Fastest() {
        List<Transport> top3Fastest = new ArrayList<>();
        transportsAnalytics.sort(new TransportSpeedComparator());
        for (int i = transportsAnalytics.size() - 3; i < transportsAnalytics.size(); i++) {
            top3Fastest.add(transportsAnalytics.get(i));
        }
        System.out.println("Три самых быстрых транспорта:");
        System.out.println(top3Fastest);
        return top3Fastest;
    }

    public Set<String> getUniqueBrands() {
        Set<String> uniqueBrands = new HashSet<>();
        for (Transport transport : transportsAnalytics) {
            uniqueBrands.add(transport.getModel());
        }
        System.out.println("Список уникальных брендов транспорта:");
        System.out.println(uniqueBrands);
        return uniqueBrands;
    }

    public Map<String, List<Transport>> groupBySpeedRange() {
        Map<String, List<Transport>> rangeBySpeed = Map.of("Медленный", new ArrayList<>(), "Средний", new ArrayList<>(), "Быстрый", new ArrayList<>());
        for (int i = 0; i < transportsAnalytics.size(); i++) {
            if (transportsAnalytics.get(i).getSpeed() < 100) {
                rangeBySpeed.get(rangeBySpeed.get("Медленный").add(transportsAnalytics.get(i)));
            } else if (transportsAnalytics.get(i).getSpeed() >= 100 && transportsAnalytics.get(i).getSpeed() <= 200) {
                rangeBySpeed.get(rangeBySpeed.get("Средний").add(transportsAnalytics.get(i)));
            } else rangeBySpeed.get(rangeBySpeed.get("Быстрый").add(transportsAnalytics.get(i)));
        }
        System.out.println("Группировка транспорта по скорости:");
        System.out.println(rangeBySpeed);
        return rangeBySpeed;
    }


}
