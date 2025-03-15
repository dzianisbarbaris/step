package by.savik.Transport2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TransportAnalytics {
    List<Transport> transportsAnalytics = new ArrayList<>();

    public void addTransport(Transport transport) {
        transportsAnalytics.add(transport);
    }

    public List<Transport> filterByYear(int year) {
        List<Transport> filteredByYear = new ArrayList<>();
        filteredByYear.addAll(transportsAnalytics);
        filteredByYear.removeIf(transport -> transport.getYear() > year);
        System.out.println(filteredByYear);
        return filteredByYear;
    }

    public List<Transport> findTop3Fastest() {
        List<Transport> top3Fastest = new ArrayList<>();
        transportsAnalytics.sort(new TransportSpeedComparator());
        for (int i = transportsAnalytics.size()-3; i < transportsAnalytics.size(); i++) {
            top3Fastest.add(transportsAnalytics.get(i));
        }
        System.out.println(top3Fastest);
        return top3Fastest;
    }

    public Set<String> getUniqueBrands() {
        Set<String> uniqueBrands = new HashSet<>();

        System.out.println(uniqueBrands);
        return uniqueBrands;
    }


}
