package by.savik.Transport2.manager;

import by.savik.Transport2.comparator.TransportModelComparator;
import by.savik.Transport2.comparator.TransportYearComparator;
import by.savik.Transport2.model.Transport;
import by.savik.Transport2.model.User;

import java.util.*;

public class TransportService {
    private final List<Transport> transports = new ArrayList<>();

    public void addTransport(Transport transport) {
        transports.add(transport);
    }

    public User findOwnerByLicensePlate(String licensePlate) {
        for (Transport transport : transports) {
            if (transport.getLicensePlate().equals(licensePlate)) {
                return transport.getUser();
            }
        }
        return null;
    }

    public Map<String, List<User>> groupOwnersByCarCount() {
        Map<String, List<User>> ownersByCarGroup = Map.of("1-2 машины", new ArrayList<>(), "3-5 машин", new ArrayList<>(), "6 и более машин", new ArrayList<>());
        Map<User, Integer> ownersCarsNum = new HashMap<>();
        for (Transport transport : transports) {
            User user = transport.getUser();
            if (ownersCarsNum.containsKey(user)) {
                Integer count = ownersCarsNum.get(user);
                ownersCarsNum.put(transport.getUser(), ++count);
            } else {
                ownersCarsNum.put(user, 1);
            }
        }
        for (Map.Entry<User, Integer> entry : ownersCarsNum.entrySet()) {
            Integer size = entry.getValue();
            if (size > 0 && size < 2) {
                ownersByCarGroup.get("1-2 машины").add(entry.getKey());
            } else if (size > 2 && size < 6) {
                ownersByCarGroup.get("3-5 машин").add(entry.getKey());
            } else {
                ownersByCarGroup.get("6 и более машин").add(entry.getKey());
            }
        }
        return ownersByCarGroup;
    }

    public List<String> findTop3MostPopularBrands() {
        TreeMap<String, Integer> top3Brands = new TreeMap<>();
        TreeMap<Integer, String> top3BrandsSorted = new TreeMap<>();
        List<String> allBrands = new ArrayList<>();
        List<String> top3MostPopularBrands = new ArrayList<>();
        for (Transport transport : transports) {
            String model = transport.getModel();
            if (top3Brands.containsKey(model)) {
                int count = top3Brands.get(model);
                top3Brands.put(model, ++count);
            } else {
                top3Brands.put(model, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : top3Brands.entrySet()) {
            top3BrandsSorted.put(entry.getValue(), entry.getKey());
        }
        for (Map.Entry<Integer, String> entry : top3BrandsSorted.entrySet()) {
            allBrands.add(entry.getValue());
        }
        if (allBrands.size() >= 3) {
            int size = allBrands.size();
            top3MostPopularBrands.add(allBrands.get(size - 1));
            top3MostPopularBrands.add(allBrands.get(size - 2));
            top3MostPopularBrands.add(allBrands.get(size - 3));
        }
        return top3MostPopularBrands;
    }

    public Map<String, List<Transport>> groupByAge() {
        Map<String, List<Transport>> transportByAge = Map.of("Новые", new ArrayList<>(), "Средние", new ArrayList<>(), "Старые", new ArrayList<>());
        int currentYear = 2025;
        for (Transport transport : transports) {
            int year = transport.getYear();
            if (year > currentYear - 4) {
                transportByAge.get("Новые").add(transport);
            } else if (year > currentYear - 11 && year < currentYear - 3) {
                transportByAge.get("Средние").add(transport);
            } else {
                transportByAge.get("Старые").add(transport);
            }
        }
        return transportByAge;
    }

    public Map<String, Integer> countTransportByType() {
        Map<String, Integer> transportCount = new HashMap<>(Map.of("Car", 0, "Bike", 0, "Truck", 0));
        for (Transport transport : transports) {
            String trType = transport.getClass().getSimpleName();
            for (Map.Entry<String, Integer> entry : transportCount.entrySet()) {
                if (entry.getKey().equals(trType)) {
                    Integer count = entry.getValue();
                    entry.setValue(++count);
                }
            }
        }
        return transportCount;
    }

    // изменил User на Set<User>. т.к. может быть несколько машин одинакового года у нескольких владельцев
    public Set<User> findOwnerWithOldestCar() {
        Map<User, List<Transport>> transportByUser = new HashMap<>();
        Set<User> ownersWithOldestCar = new HashSet<>();
        transports.sort(new TransportYearComparator());
        int oldestTransportYear = transports.getLast().getYear();
        for (Transport transport : transports) {
            User user = transport.getUser();
            if (transportByUser.containsKey(user)) {
                transportByUser.get(user).add(transport);
            } else {
                transportByUser.put(user, new ArrayList<>());
            }
        }
        for (Map.Entry<User, List<Transport>> entry : transportByUser.entrySet()) {
            for (Transport transport : entry.getValue()) {
                if (transport.getYear() == oldestTransportYear) {
                    ownersWithOldestCar.add(entry.getKey());
                }
            }
        }
        return ownersWithOldestCar;
    }

    public List<User> findOwnersWithSingleBrand() {
        Map<User, List<Transport>> transportByUser = new HashMap<>();
        List<User> ownersWithSingleBrand = new ArrayList<>();
        for (Transport transport : transports) {
            User user = transport.getUser();
            if (transportByUser.containsKey(user)) {
                transportByUser.get(user).add(transport);
            } else {
                transportByUser.put(user, new ArrayList<>());
            }
        }
        for (Map.Entry<User, List<Transport>> entry : transportByUser.entrySet()) {
            if (entry.getValue().size() > 1) {
                entry.getValue().sort(new TransportModelComparator());
                String firstModel = entry.getValue().getFirst().getModel();
                String lastModel = entry.getValue().getLast().getModel();
                if (firstModel.equals(lastModel)) {
                    ownersWithSingleBrand.add(entry.getKey());
                }
            }

        }
        return ownersWithSingleBrand;
    }

    public List<User> findOwnersWithCarAndBike() {
        Map<User, List<Transport>> transportByUser = new HashMap<>();
        List<User> ownersWithCarAndBike = new ArrayList<>();
        for (Transport transport : transports) {
            User user = transport.getUser();
            if (transportByUser.containsKey(user)) {
                transportByUser.get(user).add(transport);
            } else {
                transportByUser.put(user, new ArrayList<>());
            }
        }
        for (Map.Entry<User, List<Transport>> entry : transportByUser.entrySet()) {
            List<String> simpleNames = new ArrayList<>();
            if (entry.getValue().size() > 1) {
                for (Transport transport : entry.getValue()) {
                    simpleNames.add(transport.getClass().getSimpleName());
                }
                if (simpleNames.contains("Car") && simpleNames.contains("Bike")) {
                    ownersWithCarAndBike.add(entry.getKey());
                }
            }
        }
        return ownersWithCarAndBike;
    }

    public double getAverageCarAge() {
        double ageSum = 0;
        int currentYear = 2025;
        for (Transport transport : transports){
            int transportAge = currentYear - transport.getYear();
            ageSum += transportAge;
        }
        return ageSum/transports.size();
    }


}
